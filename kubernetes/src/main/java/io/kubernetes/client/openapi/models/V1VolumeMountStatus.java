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
 * VolumeMountStatus shows status of volume mounts.
 */
@ApiModel(description = "VolumeMountStatus shows status of volume mounts.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:08.546919Z[Etc/UTC]")
public class V1VolumeMountStatus {
  public static final String SERIALIZED_NAME_MOUNT_PATH = "mountPath";
  @SerializedName(SERIALIZED_NAME_MOUNT_PATH)
  private String mountPath;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_RECURSIVE_READ_ONLY = "recursiveReadOnly";
  @SerializedName(SERIALIZED_NAME_RECURSIVE_READ_ONLY)
  private String recursiveReadOnly;


  public V1VolumeMountStatus mountPath(String mountPath) {

    this.mountPath = mountPath;
    return this;
  }

   /**
   * MountPath corresponds to the original VolumeMount.
   * @return mountPath
  **/
  @ApiModelProperty(required = true, value = "MountPath corresponds to the original VolumeMount.")

  public String getMountPath() {
    return mountPath;
  }


  public void setMountPath(String mountPath) {
    this.mountPath = mountPath;
  }


  public V1VolumeMountStatus name(String name) {

    this.name = name;
    return this;
  }

   /**
   * Name corresponds to the name of the original VolumeMount.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name corresponds to the name of the original VolumeMount.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1VolumeMountStatus readOnly(Boolean readOnly) {

    this.readOnly = readOnly;
    return this;
  }

   /**
   * ReadOnly corresponds to the original VolumeMount.
   * @return readOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ReadOnly corresponds to the original VolumeMount.")

  public Boolean getReadOnly() {
    return readOnly;
  }


  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }


  public V1VolumeMountStatus recursiveReadOnly(String recursiveReadOnly) {

    this.recursiveReadOnly = recursiveReadOnly;
    return this;
  }

   /**
   * RecursiveReadOnly must be set to Disabled, Enabled, or unspecified (for non-readonly mounts). An IfPossible value in the original VolumeMount must be translated to Disabled or Enabled, depending on the mount result.
   * @return recursiveReadOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RecursiveReadOnly must be set to Disabled, Enabled, or unspecified (for non-readonly mounts). An IfPossible value in the original VolumeMount must be translated to Disabled or Enabled, depending on the mount result.")

  public String getRecursiveReadOnly() {
    return recursiveReadOnly;
  }


  public void setRecursiveReadOnly(String recursiveReadOnly) {
    this.recursiveReadOnly = recursiveReadOnly;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VolumeMountStatus v1VolumeMountStatus = (V1VolumeMountStatus) o;
    return Objects.equals(this.mountPath, v1VolumeMountStatus.mountPath) &&
        Objects.equals(this.name, v1VolumeMountStatus.name) &&
        Objects.equals(this.readOnly, v1VolumeMountStatus.readOnly) &&
        Objects.equals(this.recursiveReadOnly, v1VolumeMountStatus.recursiveReadOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mountPath, name, readOnly, recursiveReadOnly);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VolumeMountStatus {\n");
    sb.append("    mountPath: ").append(toIndentedString(mountPath)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    recursiveReadOnly: ").append(toIndentedString(recursiveReadOnly)).append("\n");
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
