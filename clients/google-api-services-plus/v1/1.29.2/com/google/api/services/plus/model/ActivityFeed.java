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

package com.google.api.services.plus.model;

/**
 * Model definition for ActivityFeed.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google+ API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ActivityFeed extends com.google.api.client.json.GenericJson {

  /**
   * ETag of this response for caching purposes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The ID of this collection of activities. Deprecated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The activities in this page of results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Activity> items;

  static {
    // hack to force ProGuard to consider Activity used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Activity.class);
  }

  /**
   * Identifies this resource as a collection of activities. Value: "plus#activityFeed".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Link to the next page of activities.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextLink;

  /**
   * The continuation token, which is used to page through large result sets. Provide this value in
   * a subsequent request to return the next page of results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Link to this activity resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * The title of this collection of activities, which is a truncated portion of the content.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * The time at which this collection of activities was last updated. Formatted as an RFC 3339
   * timestamp.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime updated;

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
  public ActivityFeed setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * The ID of this collection of activities. Deprecated.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The ID of this collection of activities. Deprecated.
   * @param id id or {@code null} for none
   */
  public ActivityFeed setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * The activities in this page of results.
   * @return value or {@code null} for none
   */
  public java.util.List<Activity> getItems() {
    return items;
  }

  /**
   * The activities in this page of results.
   * @param items items or {@code null} for none
   */
  public ActivityFeed setItems(java.util.List<Activity> items) {
    this.items = items;
    return this;
  }

  /**
   * Identifies this resource as a collection of activities. Value: "plus#activityFeed".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies this resource as a collection of activities. Value: "plus#activityFeed".
   * @param kind kind or {@code null} for none
   */
  public ActivityFeed setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Link to the next page of activities.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextLink() {
    return nextLink;
  }

  /**
   * Link to the next page of activities.
   * @param nextLink nextLink or {@code null} for none
   */
  public ActivityFeed setNextLink(java.lang.String nextLink) {
    this.nextLink = nextLink;
    return this;
  }

  /**
   * The continuation token, which is used to page through large result sets. Provide this value in
   * a subsequent request to return the next page of results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * The continuation token, which is used to page through large result sets. Provide this value in
   * a subsequent request to return the next page of results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ActivityFeed setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Link to this activity resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * Link to this activity resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public ActivityFeed setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * The title of this collection of activities, which is a truncated portion of the content.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The title of this collection of activities, which is a truncated portion of the content.
   * @param title title or {@code null} for none
   */
  public ActivityFeed setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * The time at which this collection of activities was last updated. Formatted as an RFC 3339
   * timestamp.
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getUpdated() {
    return updated;
  }

  /**
   * The time at which this collection of activities was last updated. Formatted as an RFC 3339
   * timestamp.
   * @param updated updated or {@code null} for none
   */
  public ActivityFeed setUpdated(com.google.api.client.util.DateTime updated) {
    this.updated = updated;
    return this;
  }

  @Override
  public ActivityFeed set(String fieldName, Object value) {
    return (ActivityFeed) super.set(fieldName, value);
  }

  @Override
  public ActivityFeed clone() {
    return (ActivityFeed) super.clone();
  }

}
