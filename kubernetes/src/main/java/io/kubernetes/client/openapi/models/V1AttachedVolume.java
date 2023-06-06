/*
Copyright 2023 The Kubernetes Authors.
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
 * AttachedVolume describes a volume attached to a node
 */
@ApiModel(description = "AttachedVolume describes a volume attached to a node")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-06T21:27:39.914087Z[Etc/UTC]")
public class V1AttachedVolume {
  public static final String SERIALIZED_NAME_DEVICE_PATH = "devicePath";
  @SerializedName(SERIALIZED_NAME_DEVICE_PATH)
  private String devicePath;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public V1AttachedVolume devicePath(String devicePath) {

    this.devicePath = devicePath;
    return this;
  }

   /**
   * DevicePath represents the device path where the volume should be available
   * @return devicePath
  **/
  @ApiModelProperty(required = true, value = "DevicePath represents the device path where the volume should be available")

  public String getDevicePath() {
    return devicePath;
  }


  public void setDevicePath(String devicePath) {
    this.devicePath = devicePath;
  }


  public V1AttachedVolume name(String name) {

    this.name = name;
    return this;
  }

   /**
   * Name of the attached volume
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the attached volume")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AttachedVolume v1AttachedVolume = (V1AttachedVolume) o;
    return Objects.equals(this.devicePath, v1AttachedVolume.devicePath) &&
        Objects.equals(this.name, v1AttachedVolume.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(devicePath, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AttachedVolume {\n");
    sb.append("    devicePath: ").append(toIndentedString(devicePath)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
