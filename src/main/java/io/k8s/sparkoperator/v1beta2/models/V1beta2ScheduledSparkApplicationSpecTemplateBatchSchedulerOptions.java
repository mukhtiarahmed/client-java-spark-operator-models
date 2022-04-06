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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * V1beta2ScheduledSparkApplicationSpecTemplateBatchSchedulerOptions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-05T08:55:35.785Z[Etc/UTC]")
public class V1beta2ScheduledSparkApplicationSpecTemplateBatchSchedulerOptions {
  public static final String SERIALIZED_NAME_PRIORITY_CLASS_NAME = "priorityClassName";
  @SerializedName(SERIALIZED_NAME_PRIORITY_CLASS_NAME)
  private String priorityClassName;

  public static final String SERIALIZED_NAME_QUEUE = "queue";
  @SerializedName(SERIALIZED_NAME_QUEUE)
  private String queue;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private Map<String, Object> resources = null;


  public V1beta2ScheduledSparkApplicationSpecTemplateBatchSchedulerOptions priorityClassName(String priorityClassName) {
    
    this.priorityClassName = priorityClassName;
    return this;
  }

   /**
   * Get priorityClassName
   * @return priorityClassName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPriorityClassName() {
    return priorityClassName;
  }


  public void setPriorityClassName(String priorityClassName) {
    this.priorityClassName = priorityClassName;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateBatchSchedulerOptions queue(String queue) {
    
    this.queue = queue;
    return this;
  }

   /**
   * Get queue
   * @return queue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getQueue() {
    return queue;
  }


  public void setQueue(String queue) {
    this.queue = queue;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateBatchSchedulerOptions resources(Map<String, Object> resources) {
    
    this.resources = resources;
    return this;
  }

  public V1beta2ScheduledSparkApplicationSpecTemplateBatchSchedulerOptions putResourcesItem(String key, Object resourcesItem) {
    if (this.resources == null) {
      this.resources = new HashMap<>();
    }
    this.resources.put(key, resourcesItem);
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getResources() {
    return resources;
  }


  public void setResources(Map<String, Object> resources) {
    this.resources = resources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta2ScheduledSparkApplicationSpecTemplateBatchSchedulerOptions v1beta2ScheduledSparkApplicationSpecTemplateBatchSchedulerOptions = (V1beta2ScheduledSparkApplicationSpecTemplateBatchSchedulerOptions) o;
    return Objects.equals(this.priorityClassName, v1beta2ScheduledSparkApplicationSpecTemplateBatchSchedulerOptions.priorityClassName) &&
        Objects.equals(this.queue, v1beta2ScheduledSparkApplicationSpecTemplateBatchSchedulerOptions.queue) &&
        Objects.equals(this.resources, v1beta2ScheduledSparkApplicationSpecTemplateBatchSchedulerOptions.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priorityClassName, queue, resources);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta2ScheduledSparkApplicationSpecTemplateBatchSchedulerOptions {\n");
    sb.append("    priorityClassName: ").append(toIndentedString(priorityClassName)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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

