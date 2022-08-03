package br.com.vertigo.employee.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.*;

@JsonTypeName("ObjectEmployee")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public class ObjectEmployee implements Serializable {

  private @Valid String firstName;
  private @Valid String lastName;
  private @Valid String department;
  private @Valid String jobTitle;
  private @Valid String employeeType;
  private @Valid LocalDate startDate;
  private @Valid String status;
  private @Valid String email;

  /** */
  public ObjectEmployee firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  @JsonProperty("firstName")
  @Size(min = 1, max = 45)
  public String getFirstName() {
    return firstName;
  }

  @JsonProperty("firstName")
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /** */
  public ObjectEmployee lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  @JsonProperty("lastName")
  @Size(min = 1, max = 45)
  public String getLastName() {
    return lastName;
  }

  @JsonProperty("lastName")
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /** */
  public ObjectEmployee department(String department) {
    this.department = department;
    return this;
  }

  @JsonProperty("department")
  @Size(min = 1, max = 45)
  public String getDepartment() {
    return department;
  }

  @JsonProperty("department")
  public void setDepartment(String department) {
    this.department = department;
  }

  /** */
  public ObjectEmployee jobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

  @JsonProperty("jobTitle")
  @Size(min = 1, max = 45)
  public String getJobTitle() {
    return jobTitle;
  }

  @JsonProperty("jobTitle")
  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  /** */
  public ObjectEmployee employeeType(String employeeType) {
    this.employeeType = employeeType;
    return this;
  }

  @JsonProperty("employeeType")
  @Size(min = 1, max = 45)
  public String getEmployeeType() {
    return employeeType;
  }

  @JsonProperty("employeeType")
  public void setEmployeeType(String employeeType) {
    this.employeeType = employeeType;
  }

  /** */
  public ObjectEmployee startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  @JsonProperty("startDate")
  public LocalDate getStartDate() {
    return startDate;
  }

  @JsonProperty("startDate")
  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  /** */
  public ObjectEmployee status(String status) {
    this.status = status;
    return this;
  }

  @JsonProperty("status")
  @Size(min = 1, max = 45)
  public String getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(String status) {
    this.status = status;
  }

  /** */
  public ObjectEmployee email(String email) {
    this.email = email;
    return this;
  }

  @JsonProperty("email")
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
    ObjectEmployee objectEmployee = (ObjectEmployee) o;
    return Objects.equals(this.firstName, objectEmployee.firstName)
        && Objects.equals(this.lastName, objectEmployee.lastName)
        && Objects.equals(this.department, objectEmployee.department)
        && Objects.equals(this.jobTitle, objectEmployee.jobTitle)
        && Objects.equals(this.employeeType, objectEmployee.employeeType)
        && Objects.equals(this.startDate, objectEmployee.startDate)
        && Objects.equals(this.status, objectEmployee.status)
        && Objects.equals(this.email, objectEmployee.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        firstName, lastName, department, jobTitle, employeeType, startDate, status, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectEmployee {\n");

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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
