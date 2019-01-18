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

package com.google.api.services.dfareporting.model;

/**
 * Creative Settings
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the DCM/DFA Reporting And Trafficking API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CreativeSettings extends com.google.api.client.json.GenericJson {

  /**
   * Header text for iFrames for this site. Must be less than or equal to 2000 characters long.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String iFrameFooter;

  /**
   * Header text for iFrames for this site. Must be less than or equal to 2000 characters long.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String iFrameHeader;

  /**
   * Header text for iFrames for this site. Must be less than or equal to 2000 characters long.
   * @return value or {@code null} for none
   */
  public java.lang.String getIFrameFooter() {
    return iFrameFooter;
  }

  /**
   * Header text for iFrames for this site. Must be less than or equal to 2000 characters long.
   * @param iFrameFooter iFrameFooter or {@code null} for none
   */
  public CreativeSettings setIFrameFooter(java.lang.String iFrameFooter) {
    this.iFrameFooter = iFrameFooter;
    return this;
  }

  /**
   * Header text for iFrames for this site. Must be less than or equal to 2000 characters long.
   * @return value or {@code null} for none
   */
  public java.lang.String getIFrameHeader() {
    return iFrameHeader;
  }

  /**
   * Header text for iFrames for this site. Must be less than or equal to 2000 characters long.
   * @param iFrameHeader iFrameHeader or {@code null} for none
   */
  public CreativeSettings setIFrameHeader(java.lang.String iFrameHeader) {
    this.iFrameHeader = iFrameHeader;
    return this;
  }

  @Override
  public CreativeSettings set(String fieldName, Object value) {
    return (CreativeSettings) super.set(fieldName, value);
  }

  @Override
  public CreativeSettings clone() {
    return (CreativeSettings) super.clone();
  }

}