package br.com.vertigo.employee.model;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

@Entity
@Table(name = "employees")
public class Employees {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
  @Column(name = "employee_id")
  private Integer employee_id;

  @Column(name = "first_name")
  private String firstName;

  @Column(name = "last_name")
  private String lastName;

  @Column(name = "department")
  private String department;

  @Column(name = "job_title")
  private String jobTitle;

  @Column(name = "employee_type")
  private String employeeType;

  @Column(name = "start_date")
  private LocalDate startDate;

  @Column(name = "status")
  private String status;

  @Column(name = "email")
  @Email
  private String email;

  public Employees() {}

  public Employees(
      Integer employee_id,
      String firstName,
      String lastName,
      String department,
      String jobTitle,
      String employeeType,
      LocalDate startDate,
      String status,
      String email) {
    this.employee_id = employee_id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.department = department;
    this.jobTitle = jobTitle;
    this.employeeType = employeeType;
    this.startDate = startDate;
    this.status = status;
    this.email = email;
  }

  public Integer getEmployee_id() {
    return employee_id;
  }

  public void setEmployee_id(Integer employee_id) {
    this.employee_id = employee_id;
  }

  public String getfirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  public String getEmployeeType() {
    return employeeType;
  }

  public void setEmployeeType(String employeeType) {
    this.employeeType = employeeType;
  }

  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
