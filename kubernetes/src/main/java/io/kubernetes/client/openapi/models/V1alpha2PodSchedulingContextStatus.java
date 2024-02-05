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
import io.kubernetes.client.openapi.models.V1alpha2ResourceClaimSchedulingStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PodSchedulingContextStatus describes where resources for the Pod can be allocated.
 */
@ApiModel(description = "PodSchedulingContextStatus describes where resources for the Pod can be allocated.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-02T21:37:40.170033Z[Etc/UTC]")
public class V1alpha2PodSchedulingContextStatus {
  public static final String SERIALIZED_NAME_RESOURCE_CLAIMS = "resourceClaims";
  @SerializedName(SERIALIZED_NAME_RESOURCE_CLAIMS)
  private List<V1alpha2ResourceClaimSchedulingStatus> resourceClaims = null;


  public V1alpha2PodSchedulingContextStatus resourceClaims(List<V1alpha2ResourceClaimSchedulingStatus> resourceClaims) {

    this.resourceClaims = resourceClaims;
    return this;
  }

  public V1alpha2PodSchedulingContextStatus addResourceClaimsItem(V1alpha2ResourceClaimSchedulingStatus resourceClaimsItem) {
    if (this.resourceClaims == null) {
      this.resourceClaims = new ArrayList<>();
    }
    this.resourceClaims.add(resourceClaimsItem);
    return this;
  }

   /**
   * ResourceClaims describes resource availability for each pod.spec.resourceClaim entry where the corresponding ResourceClaim uses \&quot;WaitForFirstConsumer\&quot; allocation mode.
   * @return resourceClaims
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ResourceClaims describes resource availability for each pod.spec.resourceClaim entry where the corresponding ResourceClaim uses \"WaitForFirstConsumer\" allocation mode.")

  public List<V1alpha2ResourceClaimSchedulingStatus> getResourceClaims() {
    return resourceClaims;
  }


  public void setResourceClaims(List<V1alpha2ResourceClaimSchedulingStatus> resourceClaims) {
    this.resourceClaims = resourceClaims;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2PodSchedulingContextStatus v1alpha2PodSchedulingContextStatus = (V1alpha2PodSchedulingContextStatus) o;
    return Objects.equals(this.resourceClaims, v1alpha2PodSchedulingContextStatus.resourceClaims);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceClaims);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2PodSchedulingContextStatus {\n");
    sb.append("    resourceClaims: ").append(toIndentedString(resourceClaims)).append("\n");
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
