/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.10.4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.models.V1beta1CertificateSigningRequestCondition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * V1beta1CertificateSigningRequestStatus
 */

public class V1beta1CertificateSigningRequestStatus {
  @SerializedName("certificate")
  private byte[] certificate = null;

  @SerializedName("conditions")
  private List<V1beta1CertificateSigningRequestCondition> conditions = null;

  public V1beta1CertificateSigningRequestStatus certificate(byte[] certificate) {
    this.certificate = certificate;
    return this;
  }

   /**
   * If request was approved, the controller will place the issued certificate here.
   * @return certificate
  **/
  @ApiModelProperty(value = "If request was approved, the controller will place the issued certificate here.")
  public byte[] getCertificate() {
    return certificate;
  }

  public void setCertificate(byte[] certificate) {
    this.certificate = certificate;
  }

  public V1beta1CertificateSigningRequestStatus conditions(List<V1beta1CertificateSigningRequestCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public V1beta1CertificateSigningRequestStatus addConditionsItem(V1beta1CertificateSigningRequestCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<V1beta1CertificateSigningRequestCondition>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Conditions applied to the request, such as approval or denial.
   * @return conditions
  **/
  @ApiModelProperty(value = "Conditions applied to the request, such as approval or denial.")
  public List<V1beta1CertificateSigningRequestCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<V1beta1CertificateSigningRequestCondition> conditions) {
    this.conditions = conditions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1CertificateSigningRequestStatus v1beta1CertificateSigningRequestStatus = (V1beta1CertificateSigningRequestStatus) o;
    return Objects.equals(this.certificate, v1beta1CertificateSigningRequestStatus.certificate) &&
        Objects.equals(this.conditions, v1beta1CertificateSigningRequestStatus.conditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificate, conditions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1CertificateSigningRequestStatus {\n");
    
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

