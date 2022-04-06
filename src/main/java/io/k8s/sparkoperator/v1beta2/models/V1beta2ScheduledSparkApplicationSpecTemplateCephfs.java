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
import io.k8s.sparkoperator.v1beta2.models.V1beta2ScheduledSparkApplicationSpecTemplateCephfsSecretRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * V1beta2ScheduledSparkApplicationSpecTemplateCephfs
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-05T08:55:35.785Z[Etc/UTC]")
public class V1beta2ScheduledSparkApplicationSpecTemplateCephfs {
  public static final String SERIALIZED_NAME_MONITORS = "monitors";
  @SerializedName(SERIALIZED_NAME_MONITORS)
  private List<String> monitors = new ArrayList<>();

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_SECRET_FILE = "secretFile";
  @SerializedName(SERIALIZED_NAME_SECRET_FILE)
  private String secretFile;

  public static final String SERIALIZED_NAME_SECRET_REF = "secretRef";
  @SerializedName(SERIALIZED_NAME_SECRET_REF)
  private V1beta2ScheduledSparkApplicationSpecTemplateCephfsSecretRef secretRef;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private String user;


  public V1beta2ScheduledSparkApplicationSpecTemplateCephfs monitors(List<String> monitors) {
    
    this.monitors = monitors;
    return this;
  }

  public V1beta2ScheduledSparkApplicationSpecTemplateCephfs addMonitorsItem(String monitorsItem) {
    this.monitors.add(monitorsItem);
    return this;
  }

   /**
   * Get monitors
   * @return monitors
  **/
  @ApiModelProperty(required = true, value = "")

  public List<String> getMonitors() {
    return monitors;
  }


  public void setMonitors(List<String> monitors) {
    this.monitors = monitors;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateCephfs path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateCephfs readOnly(Boolean readOnly) {
    
    this.readOnly = readOnly;
    return this;
  }

   /**
   * Get readOnly
   * @return readOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getReadOnly() {
    return readOnly;
  }


  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateCephfs secretFile(String secretFile) {
    
    this.secretFile = secretFile;
    return this;
  }

   /**
   * Get secretFile
   * @return secretFile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSecretFile() {
    return secretFile;
  }


  public void setSecretFile(String secretFile) {
    this.secretFile = secretFile;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateCephfs secretRef(V1beta2ScheduledSparkApplicationSpecTemplateCephfsSecretRef secretRef) {
    
    this.secretRef = secretRef;
    return this;
  }

   /**
   * Get secretRef
   * @return secretRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta2ScheduledSparkApplicationSpecTemplateCephfsSecretRef getSecretRef() {
    return secretRef;
  }


  public void setSecretRef(V1beta2ScheduledSparkApplicationSpecTemplateCephfsSecretRef secretRef) {
    this.secretRef = secretRef;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateCephfs user(String user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUser() {
    return user;
  }


  public void setUser(String user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta2ScheduledSparkApplicationSpecTemplateCephfs v1beta2ScheduledSparkApplicationSpecTemplateCephfs = (V1beta2ScheduledSparkApplicationSpecTemplateCephfs) o;
    return Objects.equals(this.monitors, v1beta2ScheduledSparkApplicationSpecTemplateCephfs.monitors) &&
        Objects.equals(this.path, v1beta2ScheduledSparkApplicationSpecTemplateCephfs.path) &&
        Objects.equals(this.readOnly, v1beta2ScheduledSparkApplicationSpecTemplateCephfs.readOnly) &&
        Objects.equals(this.secretFile, v1beta2ScheduledSparkApplicationSpecTemplateCephfs.secretFile) &&
        Objects.equals(this.secretRef, v1beta2ScheduledSparkApplicationSpecTemplateCephfs.secretRef) &&
        Objects.equals(this.user, v1beta2ScheduledSparkApplicationSpecTemplateCephfs.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monitors, path, readOnly, secretFile, secretRef, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta2ScheduledSparkApplicationSpecTemplateCephfs {\n");
    sb.append("    monitors: ").append(toIndentedString(monitors)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    secretFile: ").append(toIndentedString(secretFile)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

