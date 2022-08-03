package br.com.vertigo.employee.api;

import br.com.vertigo.employee.exceptionhandler.serviceExceptions.exceptions.NotFoundException;
import br.com.vertigo.employee.model.Employees;
import br.com.vertigo.employee.repository.EmployeesRepository;
import io.quarkus.test.junit.QuarkusTest;
import java.time.LocalDate;
import java.util.Optional;
import javax.inject.Inject;
import javax.transaction.Transactional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class EmployeeApiTest {

  @Inject EmployeesRepository repository;

  private int existingId;
  private int nonExistingId;

  @BeforeEach
  void setUp() throws Exception {
    existingId = 200;
    nonExistingId = 1;
  }

  @Test
  public void findByIdShouldReturnNonEmptyOptionalEmployeeWhenIdExists() {
    Optional<Employees> result = repository.findByIdOptional(existingId);
    Assertions.assertTrue(result.isPresent());
  }

  @Test
  public void findByIdShouldReturnEmptyOptionalEmployeeWhenIdDoesNotExists() {
    Optional<Employees> result = repository.findByIdOptional(nonExistingId);
    Assertions.assertTrue(result.isEmpty());
  }

  @Test
  @Transactional
  public void saveShouldPersistWithAutoIncrementWhenIdIsNull() {
    Employees employees = new Employees();
    employees.setEmployee_id(null);
    employees.setFirstName("Teste");
    employees.setLastName("Teste");
    employees.setDepartment("Delivery");
    employees.setJobTitle("Estagio");
    employees.setEmployeeType("Backend");
    employees.setStartDate(LocalDate.now());
    employees.setStatus("Active");
    employees.setEmail("email@email.com.br");
    repository.persist(employees);

    Assertions.assertNotNull(employees.getEmployee_id());
  }

  @Test
  public void deleteShouldThrowExcpetionWhenIdDoNotExists() {
    Assertions.assertThrows(
        NotFoundException.class,
        () -> {
          Optional<Employees> optional = repository.findByIdOptional(nonExistingId);
          Employees model =
              optional.orElseThrow(
                  () -> new NotFoundException("Entity not found " + nonExistingId));
          repository.deleteById(model.getEmployee_id());
        });
  }
}
