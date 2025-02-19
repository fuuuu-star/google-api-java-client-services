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

package com.google.api.services.marketingplatformadmin.v1alpha.model;

/**
 * Request message for SetPropertyServiceLevel RPC.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Marketing Platform Admin API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SetPropertyServiceLevelRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The Analytics property to change the ServiceLevel setting. This field is the name of
   * the Google Analytics Admin API property resource. Format:
   * analyticsadmin.googleapis.com/properties/{property_id}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String analyticsProperty;

  /**
   * Required. The service level to set for this property.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceLevel;

  /**
   * Required. The Analytics property to change the ServiceLevel setting. This field is the name of
   * the Google Analytics Admin API property resource. Format:
   * analyticsadmin.googleapis.com/properties/{property_id}
   * @return value or {@code null} for none
   */
  public java.lang.String getAnalyticsProperty() {
    return analyticsProperty;
  }

  /**
   * Required. The Analytics property to change the ServiceLevel setting. This field is the name of
   * the Google Analytics Admin API property resource. Format:
   * analyticsadmin.googleapis.com/properties/{property_id}
   * @param analyticsProperty analyticsProperty or {@code null} for none
   */
  public SetPropertyServiceLevelRequest setAnalyticsProperty(java.lang.String analyticsProperty) {
    this.analyticsProperty = analyticsProperty;
    return this;
  }

  /**
   * Required. The service level to set for this property.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceLevel() {
    return serviceLevel;
  }

  /**
   * Required. The service level to set for this property.
   * @param serviceLevel serviceLevel or {@code null} for none
   */
  public SetPropertyServiceLevelRequest setServiceLevel(java.lang.String serviceLevel) {
    this.serviceLevel = serviceLevel;
    return this;
  }

  @Override
  public SetPropertyServiceLevelRequest set(String fieldName, Object value) {
    return (SetPropertyServiceLevelRequest) super.set(fieldName, value);
  }

  @Override
  public SetPropertyServiceLevelRequest clone() {
    return (SetPropertyServiceLevelRequest) super.clone();
  }

}
