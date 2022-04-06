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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1beta2ScheduledSparkApplicationSpecTemplateFlocker
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-05T08:55:35.785Z[Etc/UTC]")
public class V1beta2ScheduledSparkApplicationSpecTemplateFlocker {
  public static final String SERIALIZED_NAME_DATASET_NAME = "datasetName";
  @SerializedName(SERIALIZED_NAME_DATASET_NAME)
  private String datasetName;

  public static final String SERIALIZED_NAME_DATASET_U_U_I_D = "datasetUUID";
  @SerializedName(SERIALIZED_NAME_DATASET_U_U_I_D)
  private String datasetUUID;


  public V1beta2ScheduledSparkApplicationSpecTemplateFlocker datasetName(String datasetName) {
    
    this.datasetName = datasetName;
    return this;
  }

   /**
   * Get datasetName
   * @return datasetName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDatasetName() {
    return datasetName;
  }


  public void setDatasetName(String datasetName) {
    this.datasetName = datasetName;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateFlocker datasetUUID(String datasetUUID) {
    
    this.datasetUUID = datasetUUID;
    return this;
  }

   /**
   * Get datasetUUID
   * @return datasetUUID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDatasetUUID() {
    return datasetUUID;
  }


  public void setDatasetUUID(String datasetUUID) {
    this.datasetUUID = datasetUUID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta2ScheduledSparkApplicationSpecTemplateFlocker v1beta2ScheduledSparkApplicationSpecTemplateFlocker = (V1beta2ScheduledSparkApplicationSpecTemplateFlocker) o;
    return Objects.equals(this.datasetName, v1beta2ScheduledSparkApplicationSpecTemplateFlocker.datasetName) &&
        Objects.equals(this.datasetUUID, v1beta2ScheduledSparkApplicationSpecTemplateFlocker.datasetUUID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasetName, datasetUUID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta2ScheduledSparkApplicationSpecTemplateFlocker {\n");
    sb.append("    datasetName: ").append(toIndentedString(datasetName)).append("\n");
    sb.append("    datasetUUID: ").append(toIndentedString(datasetUUID)).append("\n");
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

