/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.cloudresourcemanager.model;

/**
 * Defines a Cloud Organization `Policy` which is used to specify `Constraints` for configurations
 * of Cloud Platform resources.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Resource Manager API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OrgPolicy extends com.google.api.client.json.GenericJson {

  /**
   * For boolean `Constraints`, whether to enforce the `Constraint` or not.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BooleanPolicy booleanPolicy;

  /**
   * The name of the `Constraint` the `Policy` is configuring, for example,
   * `constraints/serviceuser.services`.
   *
   * Immutable after creation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String constraint;

  /**
   * An opaque tag indicating the current version of the `Policy`, used for concurrency control.
   *
   * When the `Policy` is returned from either a `GetPolicy` or a `ListOrgPolicy` request, this
   * `etag` indicates the version of the current `Policy` to use when executing a read-modify-write
   * loop.
   *
   * When the `Policy` is returned from a `GetEffectivePolicy` request, the `etag` will be unset.
   *
   * When the `Policy` is used in a `SetOrgPolicy` method, use the `etag` value that was returned
   * from a `GetOrgPolicy` request as part of a read-modify-write loop for concurrency control. Not
   * setting the `etag`in a `SetOrgPolicy` request will result in an unconditional write of the
   * `Policy`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * List of values either allowed or disallowed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ListPolicy listPolicy;

  /**
   * Restores the default behavior of the constraint; independent of `Constraint` type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RestoreDefault restoreDefault;

  /**
   * The time stamp the `Policy` was previously updated. This is set by the server, not specified by
   * the caller, and represents the last time a call to `SetOrgPolicy` was made for that `Policy`.
   * Any value set by the client will be ignored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Version of the `Policy`. Default version is 0;
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer version;

  /**
   * For boolean `Constraints`, whether to enforce the `Constraint` or not.
   * @return value or {@code null} for none
   */
  public BooleanPolicy getBooleanPolicy() {
    return booleanPolicy;
  }

  /**
   * For boolean `Constraints`, whether to enforce the `Constraint` or not.
   * @param booleanPolicy booleanPolicy or {@code null} for none
   */
  public OrgPolicy setBooleanPolicy(BooleanPolicy booleanPolicy) {
    this.booleanPolicy = booleanPolicy;
    return this;
  }

  /**
   * The name of the `Constraint` the `Policy` is configuring, for example,
   * `constraints/serviceuser.services`.
   *
   * Immutable after creation.
   * @return value or {@code null} for none
   */
  public java.lang.String getConstraint() {
    return constraint;
  }

  /**
   * The name of the `Constraint` the `Policy` is configuring, for example,
   * `constraints/serviceuser.services`.
   *
   * Immutable after creation.
   * @param constraint constraint or {@code null} for none
   */
  public OrgPolicy setConstraint(java.lang.String constraint) {
    this.constraint = constraint;
    return this;
  }

  /**
   * An opaque tag indicating the current version of the `Policy`, used for concurrency control.
   *
   * When the `Policy` is returned from either a `GetPolicy` or a `ListOrgPolicy` request, this
   * `etag` indicates the version of the current `Policy` to use when executing a read-modify-write
   * loop.
   *
   * When the `Policy` is returned from a `GetEffectivePolicy` request, the `etag` will be unset.
   *
   * When the `Policy` is used in a `SetOrgPolicy` method, use the `etag` value that was returned
   * from a `GetOrgPolicy` request as part of a read-modify-write loop for concurrency control. Not
   * setting the `etag`in a `SetOrgPolicy` request will result in an unconditional write of the
   * `Policy`.
   * @see #decodeEtag()
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * An opaque tag indicating the current version of the `Policy`, used for concurrency control.
   *
   * When the `Policy` is returned from either a `GetPolicy` or a `ListOrgPolicy` request, this
   * `etag` indicates the version of the current `Policy` to use when executing a read-modify-write
   * loop.
   *
   * When the `Policy` is returned from a `GetEffectivePolicy` request, the `etag` will be unset.
   *
   * When the `Policy` is used in a `SetOrgPolicy` method, use the `etag` value that was returned
   * from a `GetOrgPolicy` request as part of a read-modify-write loop for concurrency control. Not
   * setting the `etag`in a `SetOrgPolicy` request will result in an unconditional write of the
   * `Policy`.
   * @see #getEtag()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeEtag() {
    return com.google.api.client.util.Base64.decodeBase64(etag);
  }

  /**
   * An opaque tag indicating the current version of the `Policy`, used for concurrency control.
   *
   * When the `Policy` is returned from either a `GetPolicy` or a `ListOrgPolicy` request, this
   * `etag` indicates the version of the current `Policy` to use when executing a read-modify-write
   * loop.
   *
   * When the `Policy` is returned from a `GetEffectivePolicy` request, the `etag` will be unset.
   *
   * When the `Policy` is used in a `SetOrgPolicy` method, use the `etag` value that was returned
   * from a `GetOrgPolicy` request as part of a read-modify-write loop for concurrency control. Not
   * setting the `etag`in a `SetOrgPolicy` request will result in an unconditional write of the
   * `Policy`.
   * @see #encodeEtag()
   * @param etag etag or {@code null} for none
   */
  public OrgPolicy setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * An opaque tag indicating the current version of the `Policy`, used for concurrency control.
   *
   * When the `Policy` is returned from either a `GetPolicy` or a `ListOrgPolicy` request, this
   * `etag` indicates the version of the current `Policy` to use when executing a read-modify-write
   * loop.
   *
   * When the `Policy` is returned from a `GetEffectivePolicy` request, the `etag` will be unset.
   *
   * When the `Policy` is used in a `SetOrgPolicy` method, use the `etag` value that was returned
   * from a `GetOrgPolicy` request as part of a read-modify-write loop for concurrency control. Not
   * setting the `etag`in a `SetOrgPolicy` request will result in an unconditional write of the
   * `Policy`.
   * @see #setEtag()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public OrgPolicy encodeEtag(byte[] etag) {
    this.etag = com.google.api.client.util.Base64.encodeBase64URLSafeString(etag);
    return this;
  }

  /**
   * List of values either allowed or disallowed.
   * @return value or {@code null} for none
   */
  public ListPolicy getListPolicy() {
    return listPolicy;
  }

  /**
   * List of values either allowed or disallowed.
   * @param listPolicy listPolicy or {@code null} for none
   */
  public OrgPolicy setListPolicy(ListPolicy listPolicy) {
    this.listPolicy = listPolicy;
    return this;
  }

  /**
   * Restores the default behavior of the constraint; independent of `Constraint` type.
   * @return value or {@code null} for none
   */
  public RestoreDefault getRestoreDefault() {
    return restoreDefault;
  }

  /**
   * Restores the default behavior of the constraint; independent of `Constraint` type.
   * @param restoreDefault restoreDefault or {@code null} for none
   */
  public OrgPolicy setRestoreDefault(RestoreDefault restoreDefault) {
    this.restoreDefault = restoreDefault;
    return this;
  }

  /**
   * The time stamp the `Policy` was previously updated. This is set by the server, not specified by
   * the caller, and represents the last time a call to `SetOrgPolicy` was made for that `Policy`.
   * Any value set by the client will be ignored.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * The time stamp the `Policy` was previously updated. This is set by the server, not specified by
   * the caller, and represents the last time a call to `SetOrgPolicy` was made for that `Policy`.
   * Any value set by the client will be ignored.
   * @param updateTime updateTime or {@code null} for none
   */
  public OrgPolicy setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * Version of the `Policy`. Default version is 0;
   * @return value or {@code null} for none
   */
  public java.lang.Integer getVersion() {
    return version;
  }

  /**
   * Version of the `Policy`. Default version is 0;
   * @param version version or {@code null} for none
   */
  public OrgPolicy setVersion(java.lang.Integer version) {
    this.version = version;
    return this;
  }

  @Override
  public OrgPolicy set(String fieldName, Object value) {
    return (OrgPolicy) super.set(fieldName, value);
  }

  @Override
  public OrgPolicy clone() {
    return (OrgPolicy) super.clone();
  }

}
