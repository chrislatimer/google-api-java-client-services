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

package com.google.api.services.dialogflow.v2.model;

/**
 * Browse Carousel Card for Actions on Google.
 * https://developers.google.com/actions/assistant/responses#browsing_carousel
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCard extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Settings for displaying the image. Applies to every image in items.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String imageDisplayOptions;

  /**
   * Required. List of items in the Browse Carousel Card. Minimum of two items, maximum of ten.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItem> items;

  /**
   * Optional. Settings for displaying the image. Applies to every image in items.
   * @return value or {@code null} for none
   */
  public java.lang.String getImageDisplayOptions() {
    return imageDisplayOptions;
  }

  /**
   * Optional. Settings for displaying the image. Applies to every image in items.
   * @param imageDisplayOptions imageDisplayOptions or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCard setImageDisplayOptions(java.lang.String imageDisplayOptions) {
    this.imageDisplayOptions = imageDisplayOptions;
    return this;
  }

  /**
   * Required. List of items in the Browse Carousel Card. Minimum of two items, maximum of ten.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItem> getItems() {
    return items;
  }

  /**
   * Required. List of items in the Browse Carousel Card. Minimum of two items, maximum of ten.
   * @param items items or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCard setItems(java.util.List<GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItem> items) {
    this.items = items;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCard set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCard) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCard clone() {
    return (GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCard) super.clone();
  }

}
