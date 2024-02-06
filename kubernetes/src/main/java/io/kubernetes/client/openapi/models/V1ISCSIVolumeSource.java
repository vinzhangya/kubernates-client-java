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
import io.kubernetes.client.openapi.models.V1LocalObjectReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents an ISCSI disk. ISCSI volumes can only be mounted as read/write once. ISCSI volumes support ownership management and SELinux relabeling.
 */
@ApiModel(description = "Represents an ISCSI disk. ISCSI volumes can only be mounted as read/write once. ISCSI volumes support ownership management and SELinux relabeling.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-02T21:37:40.170033Z[Etc/UTC]")
public class V1ISCSIVolumeSource {
  public static final String SERIALIZED_NAME_CHAP_AUTH_DISCOVERY = "chapAuthDiscovery";
  @SerializedName(SERIALIZED_NAME_CHAP_AUTH_DISCOVERY)
  private Boolean chapAuthDiscovery;

  public static final String SERIALIZED_NAME_CHAP_AUTH_SESSION = "chapAuthSession";
  @SerializedName(SERIALIZED_NAME_CHAP_AUTH_SESSION)
  private Boolean chapAuthSession;

  public static final String SERIALIZED_NAME_FS_TYPE = "fsType";
  @SerializedName(SERIALIZED_NAME_FS_TYPE)
  private String fsType;

  public static final String SERIALIZED_NAME_INITIATOR_NAME = "initiatorName";
  @SerializedName(SERIALIZED_NAME_INITIATOR_NAME)
  private String initiatorName;

  public static final String SERIALIZED_NAME_IQN = "iqn";
  @SerializedName(SERIALIZED_NAME_IQN)
  private String iqn;

  public static final String SERIALIZED_NAME_ISCSI_INTERFACE = "iscsiInterface";
  @SerializedName(SERIALIZED_NAME_ISCSI_INTERFACE)
  private String iscsiInterface;

  public static final String SERIALIZED_NAME_LUN = "lun";
  @SerializedName(SERIALIZED_NAME_LUN)
  private Integer lun;

  public static final String SERIALIZED_NAME_PORTALS = "portals";
  @SerializedName(SERIALIZED_NAME_PORTALS)
  private List<String> portals = null;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_SECRET_REF = "secretRef";
  @SerializedName(SERIALIZED_NAME_SECRET_REF)
  private V1LocalObjectReference secretRef;

  public static final String SERIALIZED_NAME_TARGET_PORTAL = "targetPortal";
  @SerializedName(SERIALIZED_NAME_TARGET_PORTAL)
  private String targetPortal;


  public V1ISCSIVolumeSource chapAuthDiscovery(Boolean chapAuthDiscovery) {

    this.chapAuthDiscovery = chapAuthDiscovery;
    return this;
  }

   /**
   * chapAuthDiscovery defines whether support iSCSI Discovery CHAP authentication
   * @return chapAuthDiscovery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "chapAuthDiscovery defines whether support iSCSI Discovery CHAP authentication")

  public Boolean getChapAuthDiscovery() {
    return chapAuthDiscovery;
  }


  public void setChapAuthDiscovery(Boolean chapAuthDiscovery) {
    this.chapAuthDiscovery = chapAuthDiscovery;
  }


  public V1ISCSIVolumeSource chapAuthSession(Boolean chapAuthSession) {

    this.chapAuthSession = chapAuthSession;
    return this;
  }

   /**
   * chapAuthSession defines whether support iSCSI Session CHAP authentication
   * @return chapAuthSession
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "chapAuthSession defines whether support iSCSI Session CHAP authentication")

  public Boolean getChapAuthSession() {
    return chapAuthSession;
  }


  public void setChapAuthSession(Boolean chapAuthSession) {
    this.chapAuthSession = chapAuthSession;
  }


  public V1ISCSIVolumeSource fsType(String fsType) {

    this.fsType = fsType;
    return this;
  }

   /**
   * fsType is the filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. Implicitly inferred to be \&quot;ext4\&quot; if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#iscsi
   * @return fsType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "fsType is the filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#iscsi")

  public String getFsType() {
    return fsType;
  }


  public void setFsType(String fsType) {
    this.fsType = fsType;
  }


  public V1ISCSIVolumeSource initiatorName(String initiatorName) {

    this.initiatorName = initiatorName;
    return this;
  }

   /**
   * initiatorName is the custom iSCSI Initiator Name. If initiatorName is specified with iscsiInterface simultaneously, new iSCSI interface &lt;target portal&gt;:&lt;volume name&gt; will be created for the connection.
   * @return initiatorName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "initiatorName is the custom iSCSI Initiator Name. If initiatorName is specified with iscsiInterface simultaneously, new iSCSI interface <target portal>:<volume name> will be created for the connection.")

  public String getInitiatorName() {
    return initiatorName;
  }


  public void setInitiatorName(String initiatorName) {
    this.initiatorName = initiatorName;
  }


  public V1ISCSIVolumeSource iqn(String iqn) {

    this.iqn = iqn;
    return this;
  }

   /**
   * iqn is the target iSCSI Qualified Name.
   * @return iqn
  **/
  @ApiModelProperty(required = true, value = "iqn is the target iSCSI Qualified Name.")

  public String getIqn() {
    return iqn;
  }


  public void setIqn(String iqn) {
    this.iqn = iqn;
  }


  public V1ISCSIVolumeSource iscsiInterface(String iscsiInterface) {

    this.iscsiInterface = iscsiInterface;
    return this;
  }

   /**
   * iscsiInterface is the interface Name that uses an iSCSI transport. Defaults to &#39;default&#39; (tcp).
   * @return iscsiInterface
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "iscsiInterface is the interface Name that uses an iSCSI transport. Defaults to 'default' (tcp).")

  public String getIscsiInterface() {
    return iscsiInterface;
  }


  public void setIscsiInterface(String iscsiInterface) {
    this.iscsiInterface = iscsiInterface;
  }


  public V1ISCSIVolumeSource lun(Integer lun) {

    this.lun = lun;
    return this;
  }

   /**
   * lun represents iSCSI Target Lun number.
   * @return lun
  **/
  @ApiModelProperty(required = true, value = "lun represents iSCSI Target Lun number.")

  public Integer getLun() {
    return lun;
  }


  public void setLun(Integer lun) {
    this.lun = lun;
  }


  public V1ISCSIVolumeSource portals(List<String> portals) {

    this.portals = portals;
    return this;
  }

  public V1ISCSIVolumeSource addPortalsItem(String portalsItem) {
    if (this.portals == null) {
      this.portals = new ArrayList<>();
    }
    this.portals.add(portalsItem);
    return this;
  }

   /**
   * portals is the iSCSI Target Portal List. The portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
   * @return portals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "portals is the iSCSI Target Portal List. The portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).")

  public List<String> getPortals() {
    return portals;
  }


  public void setPortals(List<String> portals) {
    this.portals = portals;
  }


  public V1ISCSIVolumeSource readOnly(Boolean readOnly) {

    this.readOnly = readOnly;
    return this;
  }

   /**
   * readOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false.
   * @return readOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "readOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false.")

  public Boolean getReadOnly() {
    return readOnly;
  }


  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }


  public V1ISCSIVolumeSource secretRef(V1LocalObjectReference secretRef) {

    this.secretRef = secretRef;
    return this;
  }

   /**
   * Get secretRef
   * @return secretRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1LocalObjectReference getSecretRef() {
    return secretRef;
  }


  public void setSecretRef(V1LocalObjectReference secretRef) {
    this.secretRef = secretRef;
  }


  public V1ISCSIVolumeSource targetPortal(String targetPortal) {

    this.targetPortal = targetPortal;
    return this;
  }

   /**
   * targetPortal is iSCSI Target Portal. The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
   * @return targetPortal
  **/
  @ApiModelProperty(required = true, value = "targetPortal is iSCSI Target Portal. The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).")

  public String getTargetPortal() {
    return targetPortal;
  }


  public void setTargetPortal(String targetPortal) {
    this.targetPortal = targetPortal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ISCSIVolumeSource v1ISCSIVolumeSource = (V1ISCSIVolumeSource) o;
    return Objects.equals(this.chapAuthDiscovery, v1ISCSIVolumeSource.chapAuthDiscovery) &&
        Objects.equals(this.chapAuthSession, v1ISCSIVolumeSource.chapAuthSession) &&
        Objects.equals(this.fsType, v1ISCSIVolumeSource.fsType) &&
        Objects.equals(this.initiatorName, v1ISCSIVolumeSource.initiatorName) &&
        Objects.equals(this.iqn, v1ISCSIVolumeSource.iqn) &&
        Objects.equals(this.iscsiInterface, v1ISCSIVolumeSource.iscsiInterface) &&
        Objects.equals(this.lun, v1ISCSIVolumeSource.lun) &&
        Objects.equals(this.portals, v1ISCSIVolumeSource.portals) &&
        Objects.equals(this.readOnly, v1ISCSIVolumeSource.readOnly) &&
        Objects.equals(this.secretRef, v1ISCSIVolumeSource.secretRef) &&
        Objects.equals(this.targetPortal, v1ISCSIVolumeSource.targetPortal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chapAuthDiscovery, chapAuthSession, fsType, initiatorName, iqn, iscsiInterface, lun, portals, readOnly, secretRef, targetPortal);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ISCSIVolumeSource {\n");
    sb.append("    chapAuthDiscovery: ").append(toIndentedString(chapAuthDiscovery)).append("\n");
    sb.append("    chapAuthSession: ").append(toIndentedString(chapAuthSession)).append("\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    initiatorName: ").append(toIndentedString(initiatorName)).append("\n");
    sb.append("    iqn: ").append(toIndentedString(iqn)).append("\n");
    sb.append("    iscsiInterface: ").append(toIndentedString(iscsiInterface)).append("\n");
    sb.append("    lun: ").append(toIndentedString(lun)).append("\n");
    sb.append("    portals: ").append(toIndentedString(portals)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
    sb.append("    targetPortal: ").append(toIndentedString(targetPortal)).append("\n");
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
