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

package com.google.api.services.sheets.v4.model;

/**
 * Formatting options for baseline value.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BaselineValueFormat extends com.google.api.client.json.GenericJson {

  /**
   * The comparison type of key value with baseline value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String comparisonType;

  /**
   * Description which is appended after the baseline value. This field is optional.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Color to be used, in case baseline value represents a negative change for key value. This field
   * is optional.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Color negativeColor;

  /**
   * Specifies the horizontal text positioning of baseline value. This field is optional. If not
   * specified, default positioning is used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TextPosition position;

  /**
   * Color to be used, in case baseline value represents a positive change for key value. This field
   * is optional.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Color positiveColor;

  /**
   * Text formatting options for baseline value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TextFormat textFormat;

  /**
   * The comparison type of key value with baseline value.
   * @return value or {@code null} for none
   */
  public java.lang.String getComparisonType() {
    return comparisonType;
  }

  /**
   * The comparison type of key value with baseline value.
   * @param comparisonType comparisonType or {@code null} for none
   */
  public BaselineValueFormat setComparisonType(java.lang.String comparisonType) {
    this.comparisonType = comparisonType;
    return this;
  }

  /**
   * Description which is appended after the baseline value. This field is optional.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Description which is appended after the baseline value. This field is optional.
   * @param description description or {@code null} for none
   */
  public BaselineValueFormat setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Color to be used, in case baseline value represents a negative change for key value. This field
   * is optional.
   * @return value or {@code null} for none
   */
  public Color getNegativeColor() {
    return negativeColor;
  }

  /**
   * Color to be used, in case baseline value represents a negative change for key value. This field
   * is optional.
   * @param negativeColor negativeColor or {@code null} for none
   */
  public BaselineValueFormat setNegativeColor(Color negativeColor) {
    this.negativeColor = negativeColor;
    return this;
  }

  /**
   * Specifies the horizontal text positioning of baseline value. This field is optional. If not
   * specified, default positioning is used.
   * @return value or {@code null} for none
   */
  public TextPosition getPosition() {
    return position;
  }

  /**
   * Specifies the horizontal text positioning of baseline value. This field is optional. If not
   * specified, default positioning is used.
   * @param position position or {@code null} for none
   */
  public BaselineValueFormat setPosition(TextPosition position) {
    this.position = position;
    return this;
  }

  /**
   * Color to be used, in case baseline value represents a positive change for key value. This field
   * is optional.
   * @return value or {@code null} for none
   */
  public Color getPositiveColor() {
    return positiveColor;
  }

  /**
   * Color to be used, in case baseline value represents a positive change for key value. This field
   * is optional.
   * @param positiveColor positiveColor or {@code null} for none
   */
  public BaselineValueFormat setPositiveColor(Color positiveColor) {
    this.positiveColor = positiveColor;
    return this;
  }

  /**
   * Text formatting options for baseline value.
   * @return value or {@code null} for none
   */
  public TextFormat getTextFormat() {
    return textFormat;
  }

  /**
   * Text formatting options for baseline value.
   * @param textFormat textFormat or {@code null} for none
   */
  public BaselineValueFormat setTextFormat(TextFormat textFormat) {
    this.textFormat = textFormat;
    return this;
  }

  @Override
  public BaselineValueFormat set(String fieldName, Object value) {
    return (BaselineValueFormat) super.set(fieldName, value);
  }

  @Override
  public BaselineValueFormat clone() {
    return (BaselineValueFormat) super.clone();
  }

}
