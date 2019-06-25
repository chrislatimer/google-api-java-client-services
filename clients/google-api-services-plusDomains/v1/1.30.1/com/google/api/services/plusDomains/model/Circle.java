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

package com.google.api.services.plusDomains.model;

/**
 * Model definition for Circle.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google+ Domains API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Circle extends com.google.api.client.json.GenericJson {

  /**
   * The description of this circle.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The circle name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * ETag of this response for caching purposes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The ID of the circle.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Identifies this resource as a circle. Value: "plus#circle".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The people in this circle.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private People people;

  /**
   * Link to this circle resource
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * The description of this circle.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * The description of this circle.
   * @param description description or {@code null} for none
   */
  public Circle setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The circle name.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The circle name.
   * @param displayName displayName or {@code null} for none
   */
  public Circle setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * ETag of this response for caching purposes.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * ETag of this response for caching purposes.
   * @param etag etag or {@code null} for none
   */
  public Circle setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * The ID of the circle.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The ID of the circle.
   * @param id id or {@code null} for none
   */
  public Circle setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifies this resource as a circle. Value: "plus#circle".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies this resource as a circle. Value: "plus#circle".
   * @param kind kind or {@code null} for none
   */
  public Circle setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The people in this circle.
   * @return value or {@code null} for none
   */
  public People getPeople() {
    return people;
  }

  /**
   * The people in this circle.
   * @param people people or {@code null} for none
   */
  public Circle setPeople(People people) {
    this.people = people;
    return this;
  }

  /**
   * Link to this circle resource
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * Link to this circle resource
   * @param selfLink selfLink or {@code null} for none
   */
  public Circle setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  @Override
  public Circle set(String fieldName, Object value) {
    return (Circle) super.set(fieldName, value);
  }

  @Override
  public Circle clone() {
    return (Circle) super.clone();
  }

  /**
   * The people in this circle.
   */
  public static final class People extends com.google.api.client.json.GenericJson {

    /**
     * The total number of people in this circle.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Long totalItems;

    /**
     * The total number of people in this circle.
     * @return value or {@code null} for none
     */
    public java.lang.Long getTotalItems() {
      return totalItems;
    }

    /**
     * The total number of people in this circle.
     * @param totalItems totalItems or {@code null} for none
     */
    public People setTotalItems(java.lang.Long totalItems) {
      this.totalItems = totalItems;
      return this;
    }

    @Override
    public People set(String fieldName, Object value) {
      return (People) super.set(fieldName, value);
    }

    @Override
    public People clone() {
      return (People) super.clone();
    }

  }

}
