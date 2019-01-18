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

package com.google.api.services.spanner.v1.model;

/**
 * The request for CreateDatabase.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Spanner API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CreateDatabaseRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. A `CREATE DATABASE` statement, which specifies the ID of the new database.  The
   * database ID must conform to the regular expression `a-z*[a-z0-9]` and be between 2 and 30
   * characters in length. If the database ID is a reserved word or if it contains a hyphen, the
   * database ID must be enclosed in backticks (`` ` ``).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String createStatement;

  /**
   * An optional list of DDL statements to run inside the newly created database. Statements can
   * create tables, indexes, etc. These statements execute atomically with the creation of the
   * database: if there is an error in any statement, the database is not created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> extraStatements;

  /**
   * Required. A `CREATE DATABASE` statement, which specifies the ID of the new database.  The
   * database ID must conform to the regular expression `a-z*[a-z0-9]` and be between 2 and 30
   * characters in length. If the database ID is a reserved word or if it contains a hyphen, the
   * database ID must be enclosed in backticks (`` ` ``).
   * @return value or {@code null} for none
   */
  public java.lang.String getCreateStatement() {
    return createStatement;
  }

  /**
   * Required. A `CREATE DATABASE` statement, which specifies the ID of the new database.  The
   * database ID must conform to the regular expression `a-z*[a-z0-9]` and be between 2 and 30
   * characters in length. If the database ID is a reserved word or if it contains a hyphen, the
   * database ID must be enclosed in backticks (`` ` ``).
   * @param createStatement createStatement or {@code null} for none
   */
  public CreateDatabaseRequest setCreateStatement(java.lang.String createStatement) {
    this.createStatement = createStatement;
    return this;
  }

  /**
   * An optional list of DDL statements to run inside the newly created database. Statements can
   * create tables, indexes, etc. These statements execute atomically with the creation of the
   * database: if there is an error in any statement, the database is not created.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getExtraStatements() {
    return extraStatements;
  }

  /**
   * An optional list of DDL statements to run inside the newly created database. Statements can
   * create tables, indexes, etc. These statements execute atomically with the creation of the
   * database: if there is an error in any statement, the database is not created.
   * @param extraStatements extraStatements or {@code null} for none
   */
  public CreateDatabaseRequest setExtraStatements(java.util.List<java.lang.String> extraStatements) {
    this.extraStatements = extraStatements;
    return this;
  }

  @Override
  public CreateDatabaseRequest set(String fieldName, Object value) {
    return (CreateDatabaseRequest) super.set(fieldName, value);
  }

  @Override
  public CreateDatabaseRequest clone() {
    return (CreateDatabaseRequest) super.clone();
  }

}