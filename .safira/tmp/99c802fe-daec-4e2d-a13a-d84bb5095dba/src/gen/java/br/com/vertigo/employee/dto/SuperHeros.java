package br.com.vertigo.employee.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.Serializable;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.*;

@JsonTypeName("SuperHeros")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public class SuperHeros implements Serializable {

  private @Valid String nomeVerdadeiro;
  private @Valid String caracteristica;

  /** */
  public SuperHeros nomeVerdadeiro(String nomeVerdadeiro) {
    this.nomeVerdadeiro = nomeVerdadeiro;
    return this;
  }

  @JsonProperty("nomeVerdadeiro")
  @Size(min = 1, max = 45)
  public String getNomeVerdadeiro() {
    return nomeVerdadeiro;
  }

  @JsonProperty("nomeVerdadeiro")
  public void setNomeVerdadeiro(String nomeVerdadeiro) {
    this.nomeVerdadeiro = nomeVerdadeiro;
  }

  /** */
  public SuperHeros caracteristica(String caracteristica) {
    this.caracteristica = caracteristica;
    return this;
  }

  @JsonProperty("caracteristica")
  @Size(min = 1, max = 255)
  public String getCaracteristica() {
    return caracteristica;
  }

  @JsonProperty("caracteristica")
  public void setCaracteristica(String caracteristica) {
    this.caracteristica = caracteristica;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuperHeros superHeros = (SuperHeros) o;
    return Objects.equals(this.nomeVerdadeiro, superHeros.nomeVerdadeiro)
        && Objects.equals(this.caracteristica, superHeros.caracteristica);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nomeVerdadeiro, caracteristica);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuperHeros {\n");

    sb.append("    nomeVerdadeiro: ").append(toIndentedString(nomeVerdadeiro)).append("\n");
    sb.append("    caracteristica: ").append(toIndentedString(caracteristica)).append("\n");
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
