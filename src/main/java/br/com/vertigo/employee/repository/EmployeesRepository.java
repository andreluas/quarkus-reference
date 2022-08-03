package br.com.vertigo.employee.repository;

import br.com.vertigo.employee.model.Employees;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EmployeesRepository implements PanacheRepositoryBase<Employees, Integer> {}
