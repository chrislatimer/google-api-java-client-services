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

package com.google.api.services.container.model;

/**
 * GetOpenIDConfigResponse is an OIDC discovery document for the cluster. See the OpenID Connect
 * Discovery 1.0 specification for details.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Kubernetes Engine API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GetOpenIDConfigResponse extends com.google.api.client.json.GenericJson {

  /**
   * NOLINT
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("claims_supported")
  private java.util.List<java.lang.String> claimsSupported;

  /**
   * NOLINT
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("grant_types")
  private java.util.List<java.lang.String> grantTypes;

  /**
   * NOLINT
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("id_token_signing_alg_values_supported")
  private java.util.List<java.lang.String> idTokenSigningAlgValuesSupported;

  /**
   * NOLINT
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String issuer;

  /**
   * NOLINT
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("jwks_uri")
  private java.lang.String jwksUri;

  /**
   * NOLINT
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("response_types_supported")
  private java.util.List<java.lang.String> responseTypesSupported;

  /**
   * NOLINT
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("subject_types_supported")
  private java.util.List<java.lang.String> subjectTypesSupported;

  /**
   * NOLINT
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getClaimsSupported() {
    return claimsSupported;
  }

  /**
   * NOLINT
   * @param claimsSupported claimsSupported or {@code null} for none
   */
  public GetOpenIDConfigResponse setClaimsSupported(java.util.List<java.lang.String> claimsSupported) {
    this.claimsSupported = claimsSupported;
    return this;
  }

  /**
   * NOLINT
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getGrantTypes() {
    return grantTypes;
  }

  /**
   * NOLINT
   * @param grantTypes grantTypes or {@code null} for none
   */
  public GetOpenIDConfigResponse setGrantTypes(java.util.List<java.lang.String> grantTypes) {
    this.grantTypes = grantTypes;
    return this;
  }

  /**
   * NOLINT
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getIdTokenSigningAlgValuesSupported() {
    return idTokenSigningAlgValuesSupported;
  }

  /**
   * NOLINT
   * @param idTokenSigningAlgValuesSupported idTokenSigningAlgValuesSupported or {@code null} for none
   */
  public GetOpenIDConfigResponse setIdTokenSigningAlgValuesSupported(java.util.List<java.lang.String> idTokenSigningAlgValuesSupported) {
    this.idTokenSigningAlgValuesSupported = idTokenSigningAlgValuesSupported;
    return this;
  }

  /**
   * NOLINT
   * @return value or {@code null} for none
   */
  public java.lang.String getIssuer() {
    return issuer;
  }

  /**
   * NOLINT
   * @param issuer issuer or {@code null} for none
   */
  public GetOpenIDConfigResponse setIssuer(java.lang.String issuer) {
    this.issuer = issuer;
    return this;
  }

  /**
   * NOLINT
   * @return value or {@code null} for none
   */
  public java.lang.String getJwksUri() {
    return jwksUri;
  }

  /**
   * NOLINT
   * @param jwksUri jwksUri or {@code null} for none
   */
  public GetOpenIDConfigResponse setJwksUri(java.lang.String jwksUri) {
    this.jwksUri = jwksUri;
    return this;
  }

  /**
   * NOLINT
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getResponseTypesSupported() {
    return responseTypesSupported;
  }

  /**
   * NOLINT
   * @param responseTypesSupported responseTypesSupported or {@code null} for none
   */
  public GetOpenIDConfigResponse setResponseTypesSupported(java.util.List<java.lang.String> responseTypesSupported) {
    this.responseTypesSupported = responseTypesSupported;
    return this;
  }

  /**
   * NOLINT
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSubjectTypesSupported() {
    return subjectTypesSupported;
  }

  /**
   * NOLINT
   * @param subjectTypesSupported subjectTypesSupported or {@code null} for none
   */
  public GetOpenIDConfigResponse setSubjectTypesSupported(java.util.List<java.lang.String> subjectTypesSupported) {
    this.subjectTypesSupported = subjectTypesSupported;
    return this;
  }

  @Override
  public GetOpenIDConfigResponse set(String fieldName, Object value) {
    return (GetOpenIDConfigResponse) super.set(fieldName, value);
  }

  @Override
  public GetOpenIDConfigResponse clone() {
    return (GetOpenIDConfigResponse) super.clone();
  }

}