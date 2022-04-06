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
import io.k8s.sparkoperator.v1beta2.models.V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinity;
import io.k8s.sparkoperator.v1beta2.models.V1beta2ScheduledSparkApplicationSpecTemplateDriverConfigMaps;
import io.k8s.sparkoperator.v1beta2.models.V1beta2ScheduledSparkApplicationSpecTemplateDriverDnsConfig;
import io.k8s.sparkoperator.v1beta2.models.V1beta2ScheduledSparkApplicationSpecTemplateDriverEnv;
import io.k8s.sparkoperator.v1beta2.models.V1beta2ScheduledSparkApplicationSpecTemplateDriverEnvFrom;
import io.k8s.sparkoperator.v1beta2.models.V1beta2ScheduledSparkApplicationSpecTemplateDriverEnvSecretKeyRefs;
import io.k8s.sparkoperator.v1beta2.models.V1beta2ScheduledSparkApplicationSpecTemplateDriverGpu;
import io.k8s.sparkoperator.v1beta2.models.V1beta2ScheduledSparkApplicationSpecTemplateDriverHostAliases;
import io.k8s.sparkoperator.v1beta2.models.V1beta2ScheduledSparkApplicationSpecTemplateDriverInitContainers;
import io.k8s.sparkoperator.v1beta2.models.V1beta2ScheduledSparkApplicationSpecTemplateDriverPodSecurityContext;
import io.k8s.sparkoperator.v1beta2.models.V1beta2ScheduledSparkApplicationSpecTemplateDriverSecrets;
import io.k8s.sparkoperator.v1beta2.models.V1beta2ScheduledSparkApplicationSpecTemplateDriverSecurityContext;
import io.k8s.sparkoperator.v1beta2.models.V1beta2ScheduledSparkApplicationSpecTemplateDriverTolerations;
import io.k8s.sparkoperator.v1beta2.models.V1beta2ScheduledSparkApplicationSpecTemplateDriverVolumeMounts;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * V1beta2ScheduledSparkApplicationSpecTemplateExecutor
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-05T08:55:35.785Z[Etc/UTC]")
public class V1beta2ScheduledSparkApplicationSpecTemplateExecutor {
  public static final String SERIALIZED_NAME_AFFINITY = "affinity";
  @SerializedName(SERIALIZED_NAME_AFFINITY)
  private V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinity affinity;

  public static final String SERIALIZED_NAME_ANNOTATIONS = "annotations";
  @SerializedName(SERIALIZED_NAME_ANNOTATIONS)
  private Map<String, String> annotations = null;

  public static final String SERIALIZED_NAME_CONFIG_MAPS = "configMaps";
  @SerializedName(SERIALIZED_NAME_CONFIG_MAPS)
  private List<V1beta2ScheduledSparkApplicationSpecTemplateDriverConfigMaps> configMaps = null;

  public static final String SERIALIZED_NAME_CORE_LIMIT = "coreLimit";
  @SerializedName(SERIALIZED_NAME_CORE_LIMIT)
  private String coreLimit;

  public static final String SERIALIZED_NAME_CORE_REQUEST = "coreRequest";
  @SerializedName(SERIALIZED_NAME_CORE_REQUEST)
  private String coreRequest;

  public static final String SERIALIZED_NAME_CORES = "cores";
  @SerializedName(SERIALIZED_NAME_CORES)
  private Integer cores;

  public static final String SERIALIZED_NAME_DELETE_ON_TERMINATION = "deleteOnTermination";
  @SerializedName(SERIALIZED_NAME_DELETE_ON_TERMINATION)
  private Boolean deleteOnTermination;

  public static final String SERIALIZED_NAME_DNS_CONFIG = "dnsConfig";
  @SerializedName(SERIALIZED_NAME_DNS_CONFIG)
  private V1beta2ScheduledSparkApplicationSpecTemplateDriverDnsConfig dnsConfig;

  public static final String SERIALIZED_NAME_ENV = "env";
  @SerializedName(SERIALIZED_NAME_ENV)
  private List<V1beta2ScheduledSparkApplicationSpecTemplateDriverEnv> env = null;

  public static final String SERIALIZED_NAME_ENV_FROM = "envFrom";
  @SerializedName(SERIALIZED_NAME_ENV_FROM)
  private List<V1beta2ScheduledSparkApplicationSpecTemplateDriverEnvFrom> envFrom = null;

  public static final String SERIALIZED_NAME_ENV_SECRET_KEY_REFS = "envSecretKeyRefs";
  @SerializedName(SERIALIZED_NAME_ENV_SECRET_KEY_REFS)
  private Map<String, V1beta2ScheduledSparkApplicationSpecTemplateDriverEnvSecretKeyRefs> envSecretKeyRefs = null;

  public static final String SERIALIZED_NAME_ENV_VARS = "envVars";
  @SerializedName(SERIALIZED_NAME_ENV_VARS)
  private Map<String, String> envVars = null;

  public static final String SERIALIZED_NAME_GPU = "gpu";
  @SerializedName(SERIALIZED_NAME_GPU)
  private V1beta2ScheduledSparkApplicationSpecTemplateDriverGpu gpu;

  public static final String SERIALIZED_NAME_HOST_ALIASES = "hostAliases";
  @SerializedName(SERIALIZED_NAME_HOST_ALIASES)
  private List<V1beta2ScheduledSparkApplicationSpecTemplateDriverHostAliases> hostAliases = null;

  public static final String SERIALIZED_NAME_HOST_NETWORK = "hostNetwork";
  @SerializedName(SERIALIZED_NAME_HOST_NETWORK)
  private Boolean hostNetwork;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_INIT_CONTAINERS = "initContainers";
  @SerializedName(SERIALIZED_NAME_INIT_CONTAINERS)
  private List<V1beta2ScheduledSparkApplicationSpecTemplateDriverInitContainers> initContainers = null;

  public static final String SERIALIZED_NAME_INSTANCES = "instances";
  @SerializedName(SERIALIZED_NAME_INSTANCES)
  private Integer instances;

  public static final String SERIALIZED_NAME_JAVA_OPTIONS = "javaOptions";
  @SerializedName(SERIALIZED_NAME_JAVA_OPTIONS)
  private String javaOptions;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = null;

  public static final String SERIALIZED_NAME_MEMORY = "memory";
  @SerializedName(SERIALIZED_NAME_MEMORY)
  private String memory;

  public static final String SERIALIZED_NAME_MEMORY_OVERHEAD = "memoryOverhead";
  @SerializedName(SERIALIZED_NAME_MEMORY_OVERHEAD)
  private String memoryOverhead;

  public static final String SERIALIZED_NAME_NODE_SELECTOR = "nodeSelector";
  @SerializedName(SERIALIZED_NAME_NODE_SELECTOR)
  private Map<String, String> nodeSelector = null;

  public static final String SERIALIZED_NAME_POD_SECURITY_CONTEXT = "podSecurityContext";
  @SerializedName(SERIALIZED_NAME_POD_SECURITY_CONTEXT)
  private V1beta2ScheduledSparkApplicationSpecTemplateDriverPodSecurityContext podSecurityContext;

  public static final String SERIALIZED_NAME_SCHEDULER_NAME = "schedulerName";
  @SerializedName(SERIALIZED_NAME_SCHEDULER_NAME)
  private String schedulerName;

  public static final String SERIALIZED_NAME_SECRETS = "secrets";
  @SerializedName(SERIALIZED_NAME_SECRETS)
  private List<V1beta2ScheduledSparkApplicationSpecTemplateDriverSecrets> secrets = null;

  public static final String SERIALIZED_NAME_SECURITY_CONTEXT = "securityContext";
  @SerializedName(SERIALIZED_NAME_SECURITY_CONTEXT)
  private V1beta2ScheduledSparkApplicationSpecTemplateDriverSecurityContext securityContext;

  public static final String SERIALIZED_NAME_SERVICE_ACCOUNT = "serviceAccount";
  @SerializedName(SERIALIZED_NAME_SERVICE_ACCOUNT)
  private String serviceAccount;

  public static final String SERIALIZED_NAME_SHARE_PROCESS_NAMESPACE = "shareProcessNamespace";
  @SerializedName(SERIALIZED_NAME_SHARE_PROCESS_NAMESPACE)
  private Boolean shareProcessNamespace;

  public static final String SERIALIZED_NAME_SIDECARS = "sidecars";
  @SerializedName(SERIALIZED_NAME_SIDECARS)
  private List<V1beta2ScheduledSparkApplicationSpecTemplateDriverInitContainers> sidecars = null;

  public static final String SERIALIZED_NAME_TERMINATION_GRACE_PERIOD_SECONDS = "terminationGracePeriodSeconds";
  @SerializedName(SERIALIZED_NAME_TERMINATION_GRACE_PERIOD_SECONDS)
  private Long terminationGracePeriodSeconds;

  public static final String SERIALIZED_NAME_TOLERATIONS = "tolerations";
  @SerializedName(SERIALIZED_NAME_TOLERATIONS)
  private List<V1beta2ScheduledSparkApplicationSpecTemplateDriverTolerations> tolerations = null;

  public static final String SERIALIZED_NAME_VOLUME_MOUNTS = "volumeMounts";
  @SerializedName(SERIALIZED_NAME_VOLUME_MOUNTS)
  private List<V1beta2ScheduledSparkApplicationSpecTemplateDriverVolumeMounts> volumeMounts = null;


  public V1beta2ScheduledSparkApplicationSpecTemplateExecutor affinity(V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinity affinity) {
    
    this.affinity = affinity;
    return this;
  }

   /**
   * Get affinity
   * @return affinity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinity getAffinity() {
    return affinity;
  }


  public void setAffinity(V1beta2ScheduledSparkApplicationSpecTemplateDriverAffinity affinity) {
    this.affinity = affinity;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateExecutor annotations(Map<String, String> annotations) {
    
    this.annotations = annotations;
    return this;
  }

  public V1beta2ScheduledSparkApplicationSpecTemplateExecutor putAnnotationsItem(String key, String annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new HashMap<>();
    }
    this.annotations.put(key, annotationsItem);
    return this;
  }

   /**
   * Get annotations
   * @return annotations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getAnnotations() {
    return annotations;
  }


  public void setAnnotations(Map<String, String> annotations) {
    this.annotations = annotations;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateExecutor configMaps(List<V1beta2ScheduledSparkApplicationSpecTemplateDriverConfigMaps> configMaps) {
    
    this.configMaps = configMaps;
    return this;
  }

  public V1beta2ScheduledSparkApplicationSpecTemplateExecutor addConfigMapsItem(V1beta2ScheduledSparkApplicationSpecTemplateDriverConfigMaps configMapsItem) {
    if (this.configMaps == null) {
      this.configMaps = new ArrayList<>();
    }
    this.configMaps.add(configMapsItem);
    return this;
  }

   /**
   * Get configMaps
   * @return configMaps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1beta2ScheduledSparkApplicationSpecTemplateDriverConfigMaps> getConfigMaps() {
    return configMaps;
  }


  public void setConfigMaps(List<V1beta2ScheduledSparkApplicationSpecTemplateDriverConfigMaps> configMaps) {
    this.configMaps = configMaps;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateExecutor coreLimit(String coreLimit) {
    
    this.coreLimit = coreLimit;
    return this;
  }

   /**
   * Get coreLimit
   * @return coreLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCoreLimit() {
    return coreLimit;
  }


  public void setCoreLimit(String coreLimit) {
    this.coreLimit = coreLimit;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateExecutor coreRequest(String coreRequest) {
    
    this.coreRequest = coreRequest;
    return this;
  }

   /**
   * Get coreRequest
   * @return coreRequest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCoreRequest() {
    return coreRequest;
  }


  public void setCoreRequest(String coreRequest) {
    this.coreRequest = coreRequest;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateExecutor cores(Integer cores) {
    
    this.cores = cores;
    return this;
  }

   /**
   * Get cores
   * minimum: 1
   * @return cores
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCores() {
    return cores;
  }


  public void setCores(Integer cores) {
    this.cores = cores;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateExecutor deleteOnTermination(Boolean deleteOnTermination) {
    
    this.deleteOnTermination = deleteOnTermination;
    return this;
  }

   /**
   * Get deleteOnTermination
   * @return deleteOnTermination
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDeleteOnTermination() {
    return deleteOnTermination;
  }


  public void setDeleteOnTermination(Boolean deleteOnTermination) {
    this.deleteOnTermination = deleteOnTermination;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateExecutor dnsConfig(V1beta2ScheduledSparkApplicationSpecTemplateDriverDnsConfig dnsConfig) {
    
    this.dnsConfig = dnsConfig;
    return this;
  }

   /**
   * Get dnsConfig
   * @return dnsConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta2ScheduledSparkApplicationSpecTemplateDriverDnsConfig getDnsConfig() {
    return dnsConfig;
  }


  public void setDnsConfig(V1beta2ScheduledSparkApplicationSpecTemplateDriverDnsConfig dnsConfig) {
    this.dnsConfig = dnsConfig;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateExecutor env(List<V1beta2ScheduledSparkApplicationSpecTemplateDriverEnv> env) {
    
    this.env = env;
    return this;
  }

  public V1beta2ScheduledSparkApplicationSpecTemplateExecutor addEnvItem(V1beta2ScheduledSparkApplicationSpecTemplateDriverEnv envItem) {
    if (this.env == null) {
      this.env = new ArrayList<>();
    }
    this.env.add(envItem);
    return this;
  }

   /**
   * Get env
   * @return env
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1beta2ScheduledSparkApplicationSpecTemplateDriverEnv> getEnv() {
    return env;
  }


  public void setEnv(List<V1beta2ScheduledSparkApplicationSpecTemplateDriverEnv> env) {
    this.env = env;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateExecutor envFrom(List<V1beta2ScheduledSparkApplicationSpecTemplateDriverEnvFrom> envFrom) {
    
    this.envFrom = envFrom;
    return this;
  }

  public V1beta2ScheduledSparkApplicationSpecTemplateExecutor addEnvFromItem(V1beta2ScheduledSparkApplicationSpecTemplateDriverEnvFrom envFromItem) {
    if (this.envFrom == null) {
      this.envFrom = new ArrayList<>();
    }
    this.envFrom.add(envFromItem);
    return this;
  }

   /**
   * Get envFrom
   * @return envFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1beta2ScheduledSparkApplicationSpecTemplateDriverEnvFrom> getEnvFrom() {
    return envFrom;
  }


  public void setEnvFrom(List<V1beta2ScheduledSparkApplicationSpecTemplateDriverEnvFrom> envFrom) {
    this.envFrom = envFrom;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateExecutor envSecretKeyRefs(Map<String, V1beta2ScheduledSparkApplicationSpecTemplateDriverEnvSecretKeyRefs> envSecretKeyRefs) {
    
    this.envSecretKeyRefs = envSecretKeyRefs;
    return this;
  }

  public V1beta2ScheduledSparkApplicationSpecTemplateExecutor putEnvSecretKeyRefsItem(String key, V1beta2ScheduledSparkApplicationSpecTemplateDriverEnvSecretKeyRefs envSecretKeyRefsItem) {
    if (this.envSecretKeyRefs == null) {
      this.envSecretKeyRefs = new HashMap<>();
    }
    this.envSecretKeyRefs.put(key, envSecretKeyRefsItem);
    return this;
  }

   /**
   * Get envSecretKeyRefs
   * @return envSecretKeyRefs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, V1beta2ScheduledSparkApplicationSpecTemplateDriverEnvSecretKeyRefs> getEnvSecretKeyRefs() {
    return envSecretKeyRefs;
  }


  public void setEnvSecretKeyRefs(Map<String, V1beta2ScheduledSparkApplicationSpecTemplateDriverEnvSecretKeyRefs> envSecretKeyRefs) {
    this.envSecretKeyRefs = envSecretKeyRefs;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateExecutor envVars(Map<String, String> envVars) {
    
    this.envVars = envVars;
    return this;
  }

  public V1beta2ScheduledSparkApplicationSpecTemplateExecutor putEnvVarsItem(String key, String envVarsItem) {
    if (this.envVars == null) {
      this.envVars = new HashMap<>();
    }
    this.envVars.put(key, envVarsItem);
    return this;
  }

   /**
   * Get envVars
   * @return envVars
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getEnvVars() {
    return envVars;
  }


  public void setEnvVars(Map<String, String> envVars) {
    this.envVars = envVars;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateExecutor gpu(V1beta2ScheduledSparkApplicationSpecTemplateDriverGpu gpu) {
    
    this.gpu = gpu;
    return this;
  }

   /**
   * Get gpu
   * @return gpu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta2ScheduledSparkApplicationSpecTemplateDriverGpu getGpu() {
    return gpu;
  }


  public void setGpu(V1beta2ScheduledSparkApplicationSpecTemplateDriverGpu gpu) {
    this.gpu = gpu;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateExecutor hostAliases(List<V1beta2ScheduledSparkApplicationSpecTemplateDriverHostAliases> hostAliases) {
    
    this.hostAliases = hostAliases;
    return this;
  }

  public V1beta2ScheduledSparkApplicationSpecTemplateExecutor addHostAliasesItem(V1beta2ScheduledSparkApplicationSpecTemplateDriverHostAliases hostAliasesItem) {
    if (this.hostAliases == null) {
      this.hostAliases = new ArrayList<>();
    }
    this.hostAliases.add(hostAliasesItem);
    return this;
  }

   /**
   * Get hostAliases
   * @return hostAliases
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1beta2ScheduledSparkApplicationSpecTemplateDriverHostAliases> getHostAliases() {
    return hostAliases;
  }


  public void setHostAliases(List<V1beta2ScheduledSparkApplicationSpecTemplateDriverHostAliases> hostAliases) {
    this.hostAliases = hostAliases;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateExecutor hostNetwork(Boolean hostNetwork) {
    
    this.hostNetwork = hostNetwork;
    return this;
  }

   /**
   * Get hostNetwork
   * @return hostNetwork
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHostNetwork() {
    return hostNetwork;
  }


  public void setHostNetwork(Boolean hostNetwork) {
    this.hostNetwork = hostNetwork;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateExecutor image(String image) {
    
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getImage() {
    return image;
  }


  public void setImage(String image) {
    this.image = image;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateExecutor initContainers(List<V1beta2ScheduledSparkApplicationSpecTemplateDriverInitContainers> initContainers) {
    
    this.initContainers = initContainers;
    return this;
  }

  public V1beta2ScheduledSparkApplicationSpecTemplateExecutor addInitContainersItem(V1beta2ScheduledSparkApplicationSpecTemplateDriverInitContainers initContainersItem) {
    if (this.initContainers == null) {
      this.initContainers = new ArrayList<>();
    }
    this.initContainers.add(initContainersItem);
    return this;
  }

   /**
   * Get initContainers
   * @return initContainers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1beta2ScheduledSparkApplicationSpecTemplateDriverInitContainers> getInitContainers() {
    return initContainers;
  }


  public void setInitContainers(List<V1beta2ScheduledSparkApplicationSpecTemplateDriverInitContainers> initContainers) {
    this.initContainers = initContainers;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateExecutor instances(Integer instances) {
    
    this.instances = instances;
    return this;
  }

   /**
   * Get instances
   * minimum: 1
   * @return instances
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getInstances() {
    return instances;
  }


  public void setInstances(Integer instances) {
    this.instances = instances;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateExecutor javaOptions(String javaOptions) {
    
    this.javaOptions = javaOptions;
    return this;
  }

   /**
   * Get javaOptions
   * @return javaOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getJavaOptions() {
    return javaOptions;
  }


  public void setJavaOptions(String javaOptions) {
    this.javaOptions = javaOptions;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateExecutor labels(Map<String, String> labels) {
    
    this.labels = labels;
    return this;
  }

  public V1beta2ScheduledSparkApplicationSpecTemplateExecutor putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getLabels() {
    return labels;
  }


  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateExecutor memory(String memory) {
    
    this.memory = memory;
    return this;
  }

   /**
   * Get memory
   * @return memory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMemory() {
    return memory;
  }


  public void setMemory(String memory) {
    this.memory = memory;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateExecutor memoryOverhead(String memoryOverhead) {
    
    this.memoryOverhead = memoryOverhead;
    return this;
  }

   /**
   * Get memoryOverhead
   * @return memoryOverhead
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMemoryOverhead() {
    return memoryOverhead;
  }


  public void setMemoryOverhead(String memoryOverhead) {
    this.memoryOverhead = memoryOverhead;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateExecutor nodeSelector(Map<String, String> nodeSelector) {
    
    this.nodeSelector = nodeSelector;
    return this;
  }

  public V1beta2ScheduledSparkApplicationSpecTemplateExecutor putNodeSelectorItem(String key, String nodeSelectorItem) {
    if (this.nodeSelector == null) {
      this.nodeSelector = new HashMap<>();
    }
    this.nodeSelector.put(key, nodeSelectorItem);
    return this;
  }

   /**
   * Get nodeSelector
   * @return nodeSelector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getNodeSelector() {
    return nodeSelector;
  }


  public void setNodeSelector(Map<String, String> nodeSelector) {
    this.nodeSelector = nodeSelector;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateExecutor podSecurityContext(V1beta2ScheduledSparkApplicationSpecTemplateDriverPodSecurityContext podSecurityContext) {
    
    this.podSecurityContext = podSecurityContext;
    return this;
  }

   /**
   * Get podSecurityContext
   * @return podSecurityContext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta2ScheduledSparkApplicationSpecTemplateDriverPodSecurityContext getPodSecurityContext() {
    return podSecurityContext;
  }


  public void setPodSecurityContext(V1beta2ScheduledSparkApplicationSpecTemplateDriverPodSecurityContext podSecurityContext) {
    this.podSecurityContext = podSecurityContext;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateExecutor schedulerName(String schedulerName) {
    
    this.schedulerName = schedulerName;
    return this;
  }

   /**
   * Get schedulerName
   * @return schedulerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSchedulerName() {
    return schedulerName;
  }


  public void setSchedulerName(String schedulerName) {
    this.schedulerName = schedulerName;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateExecutor secrets(List<V1beta2ScheduledSparkApplicationSpecTemplateDriverSecrets> secrets) {
    
    this.secrets = secrets;
    return this;
  }

  public V1beta2ScheduledSparkApplicationSpecTemplateExecutor addSecretsItem(V1beta2ScheduledSparkApplicationSpecTemplateDriverSecrets secretsItem) {
    if (this.secrets == null) {
      this.secrets = new ArrayList<>();
    }
    this.secrets.add(secretsItem);
    return this;
  }

   /**
   * Get secrets
   * @return secrets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1beta2ScheduledSparkApplicationSpecTemplateDriverSecrets> getSecrets() {
    return secrets;
  }


  public void setSecrets(List<V1beta2ScheduledSparkApplicationSpecTemplateDriverSecrets> secrets) {
    this.secrets = secrets;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateExecutor securityContext(V1beta2ScheduledSparkApplicationSpecTemplateDriverSecurityContext securityContext) {
    
    this.securityContext = securityContext;
    return this;
  }

   /**
   * Get securityContext
   * @return securityContext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta2ScheduledSparkApplicationSpecTemplateDriverSecurityContext getSecurityContext() {
    return securityContext;
  }


  public void setSecurityContext(V1beta2ScheduledSparkApplicationSpecTemplateDriverSecurityContext securityContext) {
    this.securityContext = securityContext;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateExecutor serviceAccount(String serviceAccount) {
    
    this.serviceAccount = serviceAccount;
    return this;
  }

   /**
   * Get serviceAccount
   * @return serviceAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getServiceAccount() {
    return serviceAccount;
  }


  public void setServiceAccount(String serviceAccount) {
    this.serviceAccount = serviceAccount;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateExecutor shareProcessNamespace(Boolean shareProcessNamespace) {
    
    this.shareProcessNamespace = shareProcessNamespace;
    return this;
  }

   /**
   * Get shareProcessNamespace
   * @return shareProcessNamespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getShareProcessNamespace() {
    return shareProcessNamespace;
  }


  public void setShareProcessNamespace(Boolean shareProcessNamespace) {
    this.shareProcessNamespace = shareProcessNamespace;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateExecutor sidecars(List<V1beta2ScheduledSparkApplicationSpecTemplateDriverInitContainers> sidecars) {
    
    this.sidecars = sidecars;
    return this;
  }

  public V1beta2ScheduledSparkApplicationSpecTemplateExecutor addSidecarsItem(V1beta2ScheduledSparkApplicationSpecTemplateDriverInitContainers sidecarsItem) {
    if (this.sidecars == null) {
      this.sidecars = new ArrayList<>();
    }
    this.sidecars.add(sidecarsItem);
    return this;
  }

   /**
   * Get sidecars
   * @return sidecars
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1beta2ScheduledSparkApplicationSpecTemplateDriverInitContainers> getSidecars() {
    return sidecars;
  }


  public void setSidecars(List<V1beta2ScheduledSparkApplicationSpecTemplateDriverInitContainers> sidecars) {
    this.sidecars = sidecars;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateExecutor terminationGracePeriodSeconds(Long terminationGracePeriodSeconds) {
    
    this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
    return this;
  }

   /**
   * Get terminationGracePeriodSeconds
   * @return terminationGracePeriodSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTerminationGracePeriodSeconds() {
    return terminationGracePeriodSeconds;
  }


  public void setTerminationGracePeriodSeconds(Long terminationGracePeriodSeconds) {
    this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateExecutor tolerations(List<V1beta2ScheduledSparkApplicationSpecTemplateDriverTolerations> tolerations) {
    
    this.tolerations = tolerations;
    return this;
  }

  public V1beta2ScheduledSparkApplicationSpecTemplateExecutor addTolerationsItem(V1beta2ScheduledSparkApplicationSpecTemplateDriverTolerations tolerationsItem) {
    if (this.tolerations == null) {
      this.tolerations = new ArrayList<>();
    }
    this.tolerations.add(tolerationsItem);
    return this;
  }

   /**
   * Get tolerations
   * @return tolerations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1beta2ScheduledSparkApplicationSpecTemplateDriverTolerations> getTolerations() {
    return tolerations;
  }


  public void setTolerations(List<V1beta2ScheduledSparkApplicationSpecTemplateDriverTolerations> tolerations) {
    this.tolerations = tolerations;
  }


  public V1beta2ScheduledSparkApplicationSpecTemplateExecutor volumeMounts(List<V1beta2ScheduledSparkApplicationSpecTemplateDriverVolumeMounts> volumeMounts) {
    
    this.volumeMounts = volumeMounts;
    return this;
  }

  public V1beta2ScheduledSparkApplicationSpecTemplateExecutor addVolumeMountsItem(V1beta2ScheduledSparkApplicationSpecTemplateDriverVolumeMounts volumeMountsItem) {
    if (this.volumeMounts == null) {
      this.volumeMounts = new ArrayList<>();
    }
    this.volumeMounts.add(volumeMountsItem);
    return this;
  }

   /**
   * Get volumeMounts
   * @return volumeMounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1beta2ScheduledSparkApplicationSpecTemplateDriverVolumeMounts> getVolumeMounts() {
    return volumeMounts;
  }


  public void setVolumeMounts(List<V1beta2ScheduledSparkApplicationSpecTemplateDriverVolumeMounts> volumeMounts) {
    this.volumeMounts = volumeMounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta2ScheduledSparkApplicationSpecTemplateExecutor v1beta2ScheduledSparkApplicationSpecTemplateExecutor = (V1beta2ScheduledSparkApplicationSpecTemplateExecutor) o;
    return Objects.equals(this.affinity, v1beta2ScheduledSparkApplicationSpecTemplateExecutor.affinity) &&
        Objects.equals(this.annotations, v1beta2ScheduledSparkApplicationSpecTemplateExecutor.annotations) &&
        Objects.equals(this.configMaps, v1beta2ScheduledSparkApplicationSpecTemplateExecutor.configMaps) &&
        Objects.equals(this.coreLimit, v1beta2ScheduledSparkApplicationSpecTemplateExecutor.coreLimit) &&
        Objects.equals(this.coreRequest, v1beta2ScheduledSparkApplicationSpecTemplateExecutor.coreRequest) &&
        Objects.equals(this.cores, v1beta2ScheduledSparkApplicationSpecTemplateExecutor.cores) &&
        Objects.equals(this.deleteOnTermination, v1beta2ScheduledSparkApplicationSpecTemplateExecutor.deleteOnTermination) &&
        Objects.equals(this.dnsConfig, v1beta2ScheduledSparkApplicationSpecTemplateExecutor.dnsConfig) &&
        Objects.equals(this.env, v1beta2ScheduledSparkApplicationSpecTemplateExecutor.env) &&
        Objects.equals(this.envFrom, v1beta2ScheduledSparkApplicationSpecTemplateExecutor.envFrom) &&
        Objects.equals(this.envSecretKeyRefs, v1beta2ScheduledSparkApplicationSpecTemplateExecutor.envSecretKeyRefs) &&
        Objects.equals(this.envVars, v1beta2ScheduledSparkApplicationSpecTemplateExecutor.envVars) &&
        Objects.equals(this.gpu, v1beta2ScheduledSparkApplicationSpecTemplateExecutor.gpu) &&
        Objects.equals(this.hostAliases, v1beta2ScheduledSparkApplicationSpecTemplateExecutor.hostAliases) &&
        Objects.equals(this.hostNetwork, v1beta2ScheduledSparkApplicationSpecTemplateExecutor.hostNetwork) &&
        Objects.equals(this.image, v1beta2ScheduledSparkApplicationSpecTemplateExecutor.image) &&
        Objects.equals(this.initContainers, v1beta2ScheduledSparkApplicationSpecTemplateExecutor.initContainers) &&
        Objects.equals(this.instances, v1beta2ScheduledSparkApplicationSpecTemplateExecutor.instances) &&
        Objects.equals(this.javaOptions, v1beta2ScheduledSparkApplicationSpecTemplateExecutor.javaOptions) &&
        Objects.equals(this.labels, v1beta2ScheduledSparkApplicationSpecTemplateExecutor.labels) &&
        Objects.equals(this.memory, v1beta2ScheduledSparkApplicationSpecTemplateExecutor.memory) &&
        Objects.equals(this.memoryOverhead, v1beta2ScheduledSparkApplicationSpecTemplateExecutor.memoryOverhead) &&
        Objects.equals(this.nodeSelector, v1beta2ScheduledSparkApplicationSpecTemplateExecutor.nodeSelector) &&
        Objects.equals(this.podSecurityContext, v1beta2ScheduledSparkApplicationSpecTemplateExecutor.podSecurityContext) &&
        Objects.equals(this.schedulerName, v1beta2ScheduledSparkApplicationSpecTemplateExecutor.schedulerName) &&
        Objects.equals(this.secrets, v1beta2ScheduledSparkApplicationSpecTemplateExecutor.secrets) &&
        Objects.equals(this.securityContext, v1beta2ScheduledSparkApplicationSpecTemplateExecutor.securityContext) &&
        Objects.equals(this.serviceAccount, v1beta2ScheduledSparkApplicationSpecTemplateExecutor.serviceAccount) &&
        Objects.equals(this.shareProcessNamespace, v1beta2ScheduledSparkApplicationSpecTemplateExecutor.shareProcessNamespace) &&
        Objects.equals(this.sidecars, v1beta2ScheduledSparkApplicationSpecTemplateExecutor.sidecars) &&
        Objects.equals(this.terminationGracePeriodSeconds, v1beta2ScheduledSparkApplicationSpecTemplateExecutor.terminationGracePeriodSeconds) &&
        Objects.equals(this.tolerations, v1beta2ScheduledSparkApplicationSpecTemplateExecutor.tolerations) &&
        Objects.equals(this.volumeMounts, v1beta2ScheduledSparkApplicationSpecTemplateExecutor.volumeMounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affinity, annotations, configMaps, coreLimit, coreRequest, cores, deleteOnTermination, dnsConfig, env, envFrom, envSecretKeyRefs, envVars, gpu, hostAliases, hostNetwork, image, initContainers, instances, javaOptions, labels, memory, memoryOverhead, nodeSelector, podSecurityContext, schedulerName, secrets, securityContext, serviceAccount, shareProcessNamespace, sidecars, terminationGracePeriodSeconds, tolerations, volumeMounts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta2ScheduledSparkApplicationSpecTemplateExecutor {\n");
    sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    configMaps: ").append(toIndentedString(configMaps)).append("\n");
    sb.append("    coreLimit: ").append(toIndentedString(coreLimit)).append("\n");
    sb.append("    coreRequest: ").append(toIndentedString(coreRequest)).append("\n");
    sb.append("    cores: ").append(toIndentedString(cores)).append("\n");
    sb.append("    deleteOnTermination: ").append(toIndentedString(deleteOnTermination)).append("\n");
    sb.append("    dnsConfig: ").append(toIndentedString(dnsConfig)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    envFrom: ").append(toIndentedString(envFrom)).append("\n");
    sb.append("    envSecretKeyRefs: ").append(toIndentedString(envSecretKeyRefs)).append("\n");
    sb.append("    envVars: ").append(toIndentedString(envVars)).append("\n");
    sb.append("    gpu: ").append(toIndentedString(gpu)).append("\n");
    sb.append("    hostAliases: ").append(toIndentedString(hostAliases)).append("\n");
    sb.append("    hostNetwork: ").append(toIndentedString(hostNetwork)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    initContainers: ").append(toIndentedString(initContainers)).append("\n");
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
    sb.append("    javaOptions: ").append(toIndentedString(javaOptions)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    memoryOverhead: ").append(toIndentedString(memoryOverhead)).append("\n");
    sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
    sb.append("    podSecurityContext: ").append(toIndentedString(podSecurityContext)).append("\n");
    sb.append("    schedulerName: ").append(toIndentedString(schedulerName)).append("\n");
    sb.append("    secrets: ").append(toIndentedString(secrets)).append("\n");
    sb.append("    securityContext: ").append(toIndentedString(securityContext)).append("\n");
    sb.append("    serviceAccount: ").append(toIndentedString(serviceAccount)).append("\n");
    sb.append("    shareProcessNamespace: ").append(toIndentedString(shareProcessNamespace)).append("\n");
    sb.append("    sidecars: ").append(toIndentedString(sidecars)).append("\n");
    sb.append("    terminationGracePeriodSeconds: ").append(toIndentedString(terminationGracePeriodSeconds)).append("\n");
    sb.append("    tolerations: ").append(toIndentedString(tolerations)).append("\n");
    sb.append("    volumeMounts: ").append(toIndentedString(volumeMounts)).append("\n");
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

