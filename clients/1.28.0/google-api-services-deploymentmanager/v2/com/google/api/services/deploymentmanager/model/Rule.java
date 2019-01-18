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

package com.google.api.services.deploymentmanager.model;

/**
 * A rule to be applied in a Policy.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud Deployment Manager API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Rule extends com.google.api.client.json.GenericJson {

  /**
   * Required
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String action;

  /**
   * Additional restrictions that must be met. All conditions must pass for the rule to match.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Condition> conditions;

  static {
    // hack to force ProGuard to consider Condition used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Condition.class);
  }

  /**
   * Human-readable description of the rule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * If one or more 'in' clauses are specified, the rule matches if the PRINCIPAL/AUTHORITY_SELECTOR
   * is in at least one of these entries.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> ins;

  /**
   * The config returned to callers of tech.iam.IAM.CheckPolicy for any entries that match the LOG
   * action.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<LogConfig> logConfigs;

  static {
    // hack to force ProGuard to consider LogConfig used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(LogConfig.class);
  }

  /**
   * If one or more 'not_in' clauses are specified, the rule matches if the
   * PRINCIPAL/AUTHORITY_SELECTOR is in none of the entries.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> notIns;

  /**
   * A permission is a string of form '..' (e.g., 'storage.buckets.list'). A value of '*' matches
   * all permissions, and a verb part of '*' (e.g., 'storage.buckets.*') matches all verbs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> permissions;

  /**
   * Required
   * @return value or {@code null} for none
   */
  public java.lang.String getAction() {
    return action;
  }

  /**
   * Required
   * @param action action or {@code null} for none
   */
  public Rule setAction(java.lang.String action) {
    this.action = action;
    return this;
  }

  /**
   * Additional restrictions that must be met. All conditions must pass for the rule to match.
   * @return value or {@code null} for none
   */
  public java.util.List<Condition> getConditions() {
    return conditions;
  }

  /**
   * Additional restrictions that must be met. All conditions must pass for the rule to match.
   * @param conditions conditions or {@code null} for none
   */
  public Rule setConditions(java.util.List<Condition> conditions) {
    this.conditions = conditions;
    return this;
  }

  /**
   * Human-readable description of the rule.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Human-readable description of the rule.
   * @param description description or {@code null} for none
   */
  public Rule setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * If one or more 'in' clauses are specified, the rule matches if the PRINCIPAL/AUTHORITY_SELECTOR
   * is in at least one of these entries.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getIns() {
    return ins;
  }

  /**
   * If one or more 'in' clauses are specified, the rule matches if the PRINCIPAL/AUTHORITY_SELECTOR
   * is in at least one of these entries.
   * @param ins ins or {@code null} for none
   */
  public Rule setIns(java.util.List<java.lang.String> ins) {
    this.ins = ins;
    return this;
  }

  /**
   * The config returned to callers of tech.iam.IAM.CheckPolicy for any entries that match the LOG
   * action.
   * @return value or {@code null} for none
   */
  public java.util.List<LogConfig> getLogConfigs() {
    return logConfigs;
  }

  /**
   * The config returned to callers of tech.iam.IAM.CheckPolicy for any entries that match the LOG
   * action.
   * @param logConfigs logConfigs or {@code null} for none
   */
  public Rule setLogConfigs(java.util.List<LogConfig> logConfigs) {
    this.logConfigs = logConfigs;
    return this;
  }

  /**
   * If one or more 'not_in' clauses are specified, the rule matches if the
   * PRINCIPAL/AUTHORITY_SELECTOR is in none of the entries.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getNotIns() {
    return notIns;
  }

  /**
   * If one or more 'not_in' clauses are specified, the rule matches if the
   * PRINCIPAL/AUTHORITY_SELECTOR is in none of the entries.
   * @param notIns notIns or {@code null} for none
   */
  public Rule setNotIns(java.util.List<java.lang.String> notIns) {
    this.notIns = notIns;
    return this;
  }

  /**
   * A permission is a string of form '..' (e.g., 'storage.buckets.list'). A value of '*' matches
   * all permissions, and a verb part of '*' (e.g., 'storage.buckets.*') matches all verbs.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPermissions() {
    return permissions;
  }

  /**
   * A permission is a string of form '..' (e.g., 'storage.buckets.list'). A value of '*' matches
   * all permissions, and a verb part of '*' (e.g., 'storage.buckets.*') matches all verbs.
   * @param permissions permissions or {@code null} for none
   */
  public Rule setPermissions(java.util.List<java.lang.String> permissions) {
    this.permissions = permissions;
    return this;
  }

  @Override
  public Rule set(String fieldName, Object value) {
    return (Rule) super.set(fieldName, value);
  }

  @Override
  public Rule clone() {
    return (Rule) super.clone();
  }

}