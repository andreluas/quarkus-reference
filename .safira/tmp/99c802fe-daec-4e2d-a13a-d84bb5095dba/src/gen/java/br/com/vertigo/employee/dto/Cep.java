package br.com.vertigo.employee.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.Serializable;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.*;

@JsonTypeName("Cep")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public class Cep implements Serializable {

  private @Valid String bairro;
  private @Valid String cep;
  private @Valid String cidade;
  private @Valid String complemento;
  private @Valid String endereco;

  /** */
  public Cep bairro(String bairro) {
    this.bairro = bairro;
    return this;
  }

  @JsonProperty("bairro")
  public String getBairro() {
    return bairro;
  }

  @JsonProperty("bairro")
  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  /** */
  public Cep cep(String cep) {
    this.cep = cep;
    return this;
  }

  @JsonProperty("cep")
  public String getCep() {
    return cep;
  }

  @JsonProperty("cep")
  public void setCep(String cep) {
    this.cep = cep;
  }

  /** */
  public Cep cidade(String cidade) {
    this.cidade = cidade;
    return this;
  }

  @JsonProperty("cidade")
  public String getCidade() {
    return cidade;
  }

  @JsonProperty("cidade")
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  /** */
  public Cep complemento(String complemento) {
    this.complemento = complemento;
    return this;
  }

  @JsonProperty("complemento")
  public String getComplemento() {
    return complemento;
  }

  @JsonProperty("complemento")
  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  /** */
  public Cep endereco(String endereco) {
    this.endereco = endereco;
    return this;
  }

  @JsonProperty("endereco")
  public String getEndereco() {
    return endereco;
  }

  @JsonProperty("endereco")
  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cep cep = (Cep) o;
    return Objects.equals(this.bairro, cep.bairro)
        && Objects.equals(this.cep, cep.cep)
        && Objects.equals(this.cidade, cep.cidade)
        && Objects.equals(this.complemento, cep.complemento)
        && Objects.equals(this.endereco, cep.endereco);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bairro, cep, cidade, complemento, endereco);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cep {\n");

    sb.append("    bairro: ").append(toIndentedString(bairro)).append("\n");
    sb.append("    cep: ").append(toIndentedString(cep)).append("\n");
    sb.append("    cidade: ").append(toIndentedString(cidade)).append("\n");
    sb.append("    complemento: ").append(toIndentedString(complemento)).append("\n");
    sb.append("    endereco: ").append(toIndentedString(endereco)).append("\n");
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
