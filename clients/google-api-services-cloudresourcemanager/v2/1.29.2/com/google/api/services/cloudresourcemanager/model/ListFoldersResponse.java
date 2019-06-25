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
 * The ListFolders response message.
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
public final class ListFoldersResponse extends com.google.api.client.json.GenericJson {

  /**
   * A possibly paginated list of Folders that are direct descendants of the specified parent
   * resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Folder> folders;

  static {
    // hack to force ProGuard to consider Folder used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Folder.class);
  }

  /**
   * A pagination token returned from a previous call to `ListFolders` that indicates from where
   * listing should continue. This field is optional.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * A possibly paginated list of Folders that are direct descendants of the specified parent
   * resource.
   * @return value or {@code null} for none
   */
  public java.util.List<Folder> getFolders() {
    return folders;
  }

  /**
   * A possibly paginated list of Folders that are direct descendants of the specified parent
   * resource.
   * @param folders folders or {@code null} for none
   */
  public ListFoldersResponse setFolders(java.util.List<Folder> folders) {
    this.folders = folders;
    return this;
  }

  /**
   * A pagination token returned from a previous call to `ListFolders` that indicates from where
   * listing should continue. This field is optional.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A pagination token returned from a previous call to `ListFolders` that indicates from where
   * listing should continue. This field is optional.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListFoldersResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public ListFoldersResponse set(String fieldName, Object value) {
    return (ListFoldersResponse) super.set(fieldName, value);
  }

  @Override
  public ListFoldersResponse clone() {
    return (ListFoldersResponse) super.clone();
  }

}
