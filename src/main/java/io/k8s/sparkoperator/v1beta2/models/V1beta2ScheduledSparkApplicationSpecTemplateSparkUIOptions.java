/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.22.7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.k8s.sparkoperator.v1beta2.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.k8s.sparkoperator.v1beta2.models.V1beta2ScheduledSparkApplicationSpecTemplateSparkUIOptionsIngressTLS;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * V1beta2ScheduledSparkApplicationSpecTemplateSparkUIOptions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-05T08:55:35.785Z[Etc/UTC]")
public class V1beta2ScheduledSparkApplicationSpecTemplateSparkUIOptions {
  public static final String SERIALIZED_NAME_INGRESS_ANNOTATIONS = "ingressAnnotations";
  @SerializedName(SERIALIZED_NAME_INGRESS_ANNOTATIONS)
  private Map<String, String> ingressAnnotations = null;

  public static final String SERIALIZED_NAME_INGRESS_T_L_S = "ingressTLS";
  @SerializedName(SERIALIZED_NAME_INGRESS_T_L_S)
  private List<V1beta2ScheduledSparkApplicationSpecTemplateSparkUIOptionsIngressTLS> ingressTLS = null;

  public static final String SERIALIZED_NAME_SERVICE_ANNOTATIONS = "serviceAnnotations";
  @SerializedName(SERIALIZED_NAME_SERVICE_ANNOTATIONS)
  private Map<String, String> serviceAnnotations = null;

  public static final String SERIALIZED_NAME_SERVICE_PORT = "servicePort";
  @SerializedName(SERIALIZED_NAME_SERVICE_PORT)
  private Integer servicePort;

  public static final String SERIALIZED_NAME_SERVICE_TYPE = "serviceType";
  @SerializedName(SERIALIZED_NAME_SERVICE_TYPE)
  private String serviceType;


  public V1beta2ScheduledSparkApplicationSpecTemplateSparkUIOptions ingressAnnotations(Map<String, String> ingressAnnotations) {
    
    this.ingressAnnotations = ingressAnnotations;
    return this;
  }

  public V1beta2ScheduledSparkApplicationSpecTemplateSparkUIOptions putIngressAnnotationsItem(String key, String ingressAnnotationsItem) {
    if (this.ingressAnnotations == null) {
      this.ingressAnnotations = new HashMap<>();
    }
    this.ingressAnnotations.put(key, ingressAnnotationsItem);
    return this;
  }

   /**
   * Get ingressAnnotations
   * @return ingressAnnotations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getIngressAnnotations() {
    return ingressAnnotations;
  }


  public void setIngressAnnotations(Map<String, String> ingressAnnotations) {
    this.ingressAnnotations = ingressAnnotations;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateSparkUIOptions ingressTLS(List<V1beta2ScheduledSparkApplicationSpecTemplateSparkUIOptionsIngressTLS> ingressTLS) {
    
    this.ingressTLS = ingressTLS;
    return this;
  }

  public V1beta2ScheduledSparkApplicationSpecTemplateSparkUIOptions addIngressTLSItem(V1beta2ScheduledSparkApplicationSpecTemplateSparkUIOptionsIngressTLS ingressTLSItem) {
    if (this.ingressTLS == null) {
      this.ingressTLS = new ArrayList<>();
    }
    this.ingressTLS.add(ingressTLSItem);
    return this;
  }

   /**
   * Get ingressTLS
   * @return ingressTLS
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1beta2ScheduledSparkApplicationSpecTemplateSparkUIOptionsIngressTLS> getIngressTLS() {
    return ingressTLS;
  }


  public void setIngressTLS(List<V1beta2ScheduledSparkApplicationSpecTemplateSparkUIOptionsIngressTLS> ingressTLS) {
    this.ingressTLS = ingressTLS;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateSparkUIOptions serviceAnnotations(Map<String, String> serviceAnnotations) {
    
    this.serviceAnnotations = serviceAnnotations;
    return this;
  }

  public V1beta2ScheduledSparkApplicationSpecTemplateSparkUIOptions putServiceAnnotationsItem(String key, String serviceAnnotationsItem) {
    if (this.serviceAnnotations == null) {
      this.serviceAnnotations = new HashMap<>();
    }
    this.serviceAnnotations.put(key, serviceAnnotationsItem);
    return this;
  }

   /**
   * Get serviceAnnotations
   * @return serviceAnnotations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getServiceAnnotations() {
    return serviceAnnotations;
  }


  public void setServiceAnnotations(Map<String, String> serviceAnnotations) {
    this.serviceAnnotations = serviceAnnotations;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateSparkUIOptions servicePort(Integer servicePort) {
    
    this.servicePort = servicePort;
    return this;
  }

   /**
   * Get servicePort
   * @return servicePort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getServicePort() {
    return servicePort;
  }


  public void setServicePort(Integer servicePort) {
    this.servicePort = servicePort;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateSparkUIOptions serviceType(String serviceType) {
    
    this.serviceType = serviceType;
    return this;
  }

   /**
   * Get serviceType
   * @return serviceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getServiceType() {
    return serviceType;
  }


  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta2ScheduledSparkApplicationSpecTemplateSparkUIOptions v1beta2ScheduledSparkApplicationSpecTemplateSparkUIOptions = (V1beta2ScheduledSparkApplicationSpecTemplateSparkUIOptions) o;
    return Objects.equals(this.ingressAnnotations, v1beta2ScheduledSparkApplicationSpecTemplateSparkUIOptions.ingressAnnotations) &&
        Objects.equals(this.ingressTLS, v1beta2ScheduledSparkApplicationSpecTemplateSparkUIOptions.ingressTLS) &&
        Objects.equals(this.serviceAnnotations, v1beta2ScheduledSparkApplicationSpecTemplateSparkUIOptions.serviceAnnotations) &&
        Objects.equals(this.servicePort, v1beta2ScheduledSparkApplicationSpecTemplateSparkUIOptions.servicePort) &&
        Objects.equals(this.serviceType, v1beta2ScheduledSparkApplicationSpecTemplateSparkUIOptions.serviceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ingressAnnotations, ingressTLS, serviceAnnotations, servicePort, serviceType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta2ScheduledSparkApplicationSpecTemplateSparkUIOptions {\n");
    sb.append("    ingressAnnotations: ").append(toIndentedString(ingressAnnotations)).append("\n");
    sb.append("    ingressTLS: ").append(toIndentedString(ingressTLS)).append("\n");
    sb.append("    serviceAnnotations: ").append(toIndentedString(serviceAnnotations)).append("\n");
    sb.append("    servicePort: ").append(toIndentedString(servicePort)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
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
