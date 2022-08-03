package br.com.vertigo.employee.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import br.com.vertigo.employee.dto.EmployeeCadastravel;
import br.com.vertigo.employee.dto.EmployeeSummary;
import br.com.vertigo.employee.dto.ObjectEmployee;
import br.com.vertigo.employee.model.Employees;

@Mapper(componentModel = "cdi", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface EmployeMapper {

  Employees employeeCadastravelToEntity(EmployeeCadastravel employeeCadastravel);

  @Mapping(source = "employee_id", target = "employeeId")
  EmployeeCadastravel entityToEmployeeCadastravel(Employees entity);

  @Mapping(source = "employee_id", target = "employeeId")
  ObjectEmployee entityToObjectEmployee(Employees entity);

  @Mapping(source = "employee_id", target = "employeeId")
  EmployeeSummary entityToEmployeeSummary(Employees entity);

  Employees patch(@MappingTarget Employees entity, ObjectEmployee dto);

  List<ObjectEmployee> entityListToDtoList(List<Employees> listAll);

}
