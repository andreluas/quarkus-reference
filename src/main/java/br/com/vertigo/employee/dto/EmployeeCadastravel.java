package br.com.vertigo.employee.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("EmployeeCadastravel")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public class EmployeeCadastravel implements Serializable {

  private @Valid Integer employeeId;
  private @Valid String firstName;
  private @Valid String lastName;
  private @Valid String department;
  private @Valid String jobTitle;
  private @Valid String employeeType;
  private @Valid LocalDate startDate;
  private @Valid String status;
  private @Valid String email;

  /** */
  @JsonProperty("employee_id")
  public Integer getEmployeeId() {
    return employeeId;
  }

  @JsonProperty("employee_id")
  public void setEmployeeId(Integer employeeId) {
    this.employeeId = employeeId;
  }

  /** */
  public EmployeeCadastravel firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  @JsonProperty("firstName")
  @NotNull
  @Size(min = 1, max = 45)
  public String getFirstName() {
    return firstName;
  }

  @JsonProperty("firstName")
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /** */
  public EmployeeCadastravel lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  @JsonProperty("lastName")
  @NotNull
  @Size(min = 1, max = 45)
  public String getLastName() {
    return lastName;
  }

  @JsonProperty("lastName")
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /** */
  public EmployeeCadastravel department(String department) {
    this.department = department;
    return this;
  }

  @JsonProperty("department")
  @NotNull
  @Size(min = 1, max = 45)
  public String getDepartment() {
    return department;
  }

  @JsonProperty("department")
  public void setDepartment(String department) {
    this.department = department;
  }

  /** */
  public EmployeeCadastravel jobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

  @JsonProperty("jobTitle")
  @NotNull
  @Size(min = 1, max = 45)
  public String getJobTitle() {
    return jobTitle;
  }

  @JsonProperty("jobTitle")
  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  /** */
  public EmployeeCadastravel employeeType(String employeeType) {
    this.employeeType = employeeType;
    return this;
  }

  @JsonProperty("employeeType")
  @NotNull
  @Size(min = 1, max = 45)
  public String getEmployeeType() {
    return employeeType;
  }

  @JsonProperty("employeeType")
  public void setEmployeeType(String employeeType) {
    this.employeeType = employeeType;
  }

  /** */
  public EmployeeCadastravel startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  @JsonProperty("startDate")
  @NotNull
  @JsonFormat(pattern = "dd/MM/yyyy")
  public LocalDate getStartDate() {
    return startDate;
  }

  @JsonProperty("startDate")
  @JsonFormat(pattern = "dd/MM/yyyy")
  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  /** */
  public EmployeeCadastravel status(String status) {
    this.status = status;
    return this;
  }

  @JsonProperty("status")
  @NotNull
  @Size(min = 1, max = 45)
  public String getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(String status) {
    this.status = status;
  }

  /** */
  public EmployeeCadastravel email(String email) {
    this.email = email;
    return this;
  }

  @JsonProperty("email")
  @NotNull
  @Size(min = 1, max = 45)
  public String getEmail() {
    return email;
  }

  @JsonProperty("email")
  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeCadastravel employeeCadastravel = (EmployeeCadastravel) o;
    return Objects.equals(this.firstName, employeeCadastravel.firstName)
        && Objects.equals(this.lastName, employeeCadastravel.lastName)
        && Objects.equals(this.department, employeeCadastravel.department)
        && Objects.equals(this.jobTitle, employeeCadastravel.jobTitle)
        && Objects.equals(this.employeeType, employeeCadastravel.employeeType)
        && Objects.equals(this.startDate, employeeCadastravel.startDate)
        && Objects.equals(this.status, employeeCadastravel.status)
        && Objects.equals(this.email, employeeCadastravel.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        firstName, lastName, department, jobTitle, employeeType, startDate, status, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeCadastravel {\n");

    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    employeeType: ").append(toIndentedString(employeeType)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
