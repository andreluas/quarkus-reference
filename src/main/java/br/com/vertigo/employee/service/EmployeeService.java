package br.com.vertigo.employee.service;

import java.util.List;
import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import br.com.vertigo.employee.dto.EmployeeCadastravel;
import br.com.vertigo.employee.dto.EmployeeSummary;
import br.com.vertigo.employee.dto.ObjectEmployee;
import br.com.vertigo.employee.exceptionhandler.serviceExceptions.exceptions.NotFoundException;
import br.com.vertigo.employee.mapper.EmployeMapperImpl;
import br.com.vertigo.employee.model.Employees;
import br.com.vertigo.employee.repository.EmployeesRepository;

@ApplicationScoped
public class EmployeeService {
  private static final String ENTITY_NOT_FOUND = "Entity not found ";

  @Inject
  EmployeesRepository repository;

  @Inject
  EmployeMapperImpl mapper;

  public List<ObjectEmployee> findAll() {
    List<Employees> list = repository.listAll();
    return mapper.entityListToDtoList(list);
  }

  public ObjectEmployee findById(Integer id) {
    Optional<Employees> optional = repository.findByIdOptional(id);
    Employees model = optional.orElseThrow(() -> new NotFoundException(ENTITY_NOT_FOUND, id));
    return mapper.entityToObjectEmployee(model);
  }

  public EmployeeSummary findBySummary(Integer id) {
    Optional<Employees> optional = repository.findByIdOptional(id);
    Employees model = optional.orElseThrow(() -> new NotFoundException(ENTITY_NOT_FOUND, id));
    return mapper.entityToEmployeeSummary(model);
  }

  @Transactional
  public void deleteById(Integer id) {
    Optional<Employees> optional = repository.findByIdOptional(id);
    Employees model = optional.orElseThrow(() -> new NotFoundException(ENTITY_NOT_FOUND, id));
    repository.deleteById(model.getEmployee_id());
  }

  @Transactional
  public EmployeeCadastravel insert(EmployeeCadastravel dto) {
    Employees entity = new Employees();
    entity = mapper.employeeCadastravelToEntity(dto);
    repository.persist(entity);
    return mapper.entityToEmployeeCadastravel(entity);
  }

  @Transactional
  public ObjectEmployee update(Integer id, ObjectEmployee dto) {
    Optional<Employees> optional = repository.findByIdOptional(id);
    Employees entity = optional.orElseThrow(() -> new NotFoundException(ENTITY_NOT_FOUND, id));
    entity = mapper.patch(entity, dto);
    repository.persist(entity);
    return mapper.entityToObjectEmployee(entity);
  }
}
