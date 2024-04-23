/*
Copyright 2024 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

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
 * VolumeMount describes a mounting of a Volume within a container.
 */
@ApiModel(description = "VolumeMount describes a mounting of a Volume within a container.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:08.546919Z[Etc/UTC]")
public class V1VolumeMount {
  public static final String SERIALIZED_NAME_MOUNT_PATH = "mountPath";
  @SerializedName(SERIALIZED_NAME_MOUNT_PATH)
  private String mountPath;

  public static final String SERIALIZED_NAME_MOUNT_PROPAGATION = "mountPropagation";
  @SerializedName(SERIALIZED_NAME_MOUNT_PROPAGATION)
  private String mountPropagation;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_RECURSIVE_READ_ONLY = "recursiveReadOnly";
  @SerializedName(SERIALIZED_NAME_RECURSIVE_READ_ONLY)
  private String recursiveReadOnly;

  public static final String SERIALIZED_NAME_SUB_PATH = "subPath";
  @SerializedName(SERIALIZED_NAME_SUB_PATH)
  private String subPath;

  public static final String SERIALIZED_NAME_SUB_PATH_EXPR = "subPathExpr";
  @SerializedName(SERIALIZED_NAME_SUB_PATH_EXPR)
  private String subPathExpr;


  public V1VolumeMount mountPath(String mountPath) {

    this.mountPath = mountPath;
    return this;
  }

   /**
   * Path within the container at which the volume should be mounted.  Must not contain &#39;:&#39;.
   * @return mountPath
  **/
  @ApiModelProperty(required = true, value = "Path within the container at which the volume should be mounted.  Must not contain ':'.")

  public String getMountPath() {
    return mountPath;
  }


  public void setMountPath(String mountPath) {
    this.mountPath = mountPath;
  }


  public V1VolumeMount mountPropagation(String mountPropagation) {

    this.mountPropagation = mountPropagation;
    return this;
  }

   /**
   * mountPropagation determines how mounts are propagated from the host to container and the other way around. When not set, MountPropagationNone is used. This field is beta in 1.10. When RecursiveReadOnly is set to IfPossible or to Enabled, MountPropagation must be None or unspecified (which defaults to None).
   * @return mountPropagation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "mountPropagation determines how mounts are propagated from the host to container and the other way around. When not set, MountPropagationNone is used. This field is beta in 1.10. When RecursiveReadOnly is set to IfPossible or to Enabled, MountPropagation must be None or unspecified (which defaults to None).")

  public String getMountPropagation() {
    return mountPropagation;
  }


  public void setMountPropagation(String mountPropagation) {
    this.mountPropagation = mountPropagation;
  }


  public V1VolumeMount name(String name) {

    this.name = name;
    return this;
  }

   /**
   * This must match the Name of a Volume.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "This must match the Name of a Volume.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1VolumeMount readOnly(Boolean readOnly) {

    this.readOnly = readOnly;
    return this;
  }

   /**
   * Mounted read-only if true, read-write otherwise (false or unspecified). Defaults to false.
   * @return readOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Mounted read-only if true, read-write otherwise (false or unspecified). Defaults to false.")

  public Boolean getReadOnly() {
    return readOnly;
  }


  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }


  public V1VolumeMount recursiveReadOnly(String recursiveReadOnly) {

    this.recursiveReadOnly = recursiveReadOnly;
    return this;
  }

   /**
   * RecursiveReadOnly specifies whether read-only mounts should be handled recursively.  If ReadOnly is false, this field has no meaning and must be unspecified.  If ReadOnly is true, and this field is set to Disabled, the mount is not made recursively read-only.  If this field is set to IfPossible, the mount is made recursively read-only, if it is supported by the container runtime.  If this field is set to Enabled, the mount is made recursively read-only if it is supported by the container runtime, otherwise the pod will not be started and an error will be generated to indicate the reason.  If this field is set to IfPossible or Enabled, MountPropagation must be set to None (or be unspecified, which defaults to None).  If this field is not specified, it is treated as an equivalent of Disabled.
   * @return recursiveReadOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RecursiveReadOnly specifies whether read-only mounts should be handled recursively.  If ReadOnly is false, this field has no meaning and must be unspecified.  If ReadOnly is true, and this field is set to Disabled, the mount is not made recursively read-only.  If this field is set to IfPossible, the mount is made recursively read-only, if it is supported by the container runtime.  If this field is set to Enabled, the mount is made recursively read-only if it is supported by the container runtime, otherwise the pod will not be started and an error will be generated to indicate the reason.  If this field is set to IfPossible or Enabled, MountPropagation must be set to None (or be unspecified, which defaults to None).  If this field is not specified, it is treated as an equivalent of Disabled.")

  public String getRecursiveReadOnly() {
    return recursiveReadOnly;
  }


  public void setRecursiveReadOnly(String recursiveReadOnly) {
    this.recursiveReadOnly = recursiveReadOnly;
  }


  public V1VolumeMount subPath(String subPath) {

    this.subPath = subPath;
    return this;
  }

   /**
   * Path within the volume from which the container&#39;s volume should be mounted. Defaults to \&quot;\&quot; (volume&#39;s root).
   * @return subPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Path within the volume from which the container's volume should be mounted. Defaults to \"\" (volume's root).")

  public String getSubPath() {
    return subPath;
  }


  public void setSubPath(String subPath) {
    this.subPath = subPath;
  }


  public V1VolumeMount subPathExpr(String subPathExpr) {

    this.subPathExpr = subPathExpr;
    return this;
  }

   /**
   * Expanded path within the volume from which the container&#39;s volume should be mounted. Behaves similarly to SubPath but environment variable references $(VAR_NAME) are expanded using the container&#39;s environment. Defaults to \&quot;\&quot; (volume&#39;s root). SubPathExpr and SubPath are mutually exclusive.
   * @return subPathExpr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Expanded path within the volume from which the container's volume should be mounted. Behaves similarly to SubPath but environment variable references $(VAR_NAME) are expanded using the container's environment. Defaults to \"\" (volume's root). SubPathExpr and SubPath are mutually exclusive.")

  public String getSubPathExpr() {
    return subPathExpr;
  }


  public void setSubPathExpr(String subPathExpr) {
    this.subPathExpr = subPathExpr;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VolumeMount v1VolumeMount = (V1VolumeMount) o;
    return Objects.equals(this.mountPath, v1VolumeMount.mountPath) &&
        Objects.equals(this.mountPropagation, v1VolumeMount.mountPropagation) &&
        Objects.equals(this.name, v1VolumeMount.name) &&
        Objects.equals(this.readOnly, v1VolumeMount.readOnly) &&
        Objects.equals(this.recursiveReadOnly, v1VolumeMount.recursiveReadOnly) &&
        Objects.equals(this.subPath, v1VolumeMount.subPath) &&
        Objects.equals(this.subPathExpr, v1VolumeMount.subPathExpr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mountPath, mountPropagation, name, readOnly, recursiveReadOnly, subPath, subPathExpr);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VolumeMount {\n");
    sb.append("    mountPath: ").append(toIndentedString(mountPath)).append("\n");
    sb.append("    mountPropagation: ").append(toIndentedString(mountPropagation)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    recursiveReadOnly: ").append(toIndentedString(recursiveReadOnly)).append("\n");
    sb.append("    subPath: ").append(toIndentedString(subPath)).append("\n");
    sb.append("    subPathExpr: ").append(toIndentedString(subPathExpr)).append("\n");
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
