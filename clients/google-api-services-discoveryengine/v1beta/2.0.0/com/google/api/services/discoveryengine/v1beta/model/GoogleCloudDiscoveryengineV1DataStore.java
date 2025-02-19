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

package com.google.api.services.discoveryengine.v1beta.model;

/**
 * DataStore captures global settings and configs at the DataStore level.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Discovery Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDiscoveryengineV1DataStore extends com.google.api.client.json.GenericJson {

  /**
   * Immutable. The content config of the data store. If this field is unset, the server behavior
   * defaults to ContentConfig.NO_CONTENT.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contentConfig;

  /**
   * Output only. Timestamp the DataStore was created at.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. The id of the default Schema asscociated to this data store.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String defaultSchemaId;

  /**
   * Required. The data store display name. This field must be a UTF-8 encoded string with a length
   * limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Configuration for Document understanding and enrichment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1DocumentProcessingConfig documentProcessingConfig;

  /**
   * Immutable. The industry vertical that the data store registers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String industryVertical;

  /**
   * Immutable. The full resource name of the data store. Format: `projects/{project}/locations/{loc
   * ation}/collections/{collection_id}/dataStores/{data_store_id}`. This field must be a UTF-8
   * encoded string with a length limit of 1024 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optional. Stores serving config at DataStore level.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1ServingConfigDataStore servingConfigDataStore;

  /**
   * The solutions that the data store enrolls. Available solutions for each industry_vertical: *
   * `MEDIA`: `SOLUTION_TYPE_RECOMMENDATION` and `SOLUTION_TYPE_SEARCH`. * `SITE_SEARCH`:
   * `SOLUTION_TYPE_SEARCH` is automatically enrolled. Other solutions cannot be enrolled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> solutionTypes;

  /**
   * The start schema to use for this DataStore when provisioning it. If unset, a default vertical
   * specialized schema will be used. This field is only used by CreateDataStore API, and will be
   * ignored if used in other APIs. This field will be omitted from all API responses including
   * CreateDataStore API. To retrieve a schema of a DataStore, use SchemaService.GetSchema API
   * instead. The provided schema will be validated against certain rules on schema. Learn more from
   * [this doc](https://cloud.google.com/generative-ai-app-builder/docs/provide-schema).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1Schema startingSchema;

  /**
   * Config to store data store type configuration for workspace data. This must be set when
   * DataStore.content_config is set as DataStore.ContentConfig.GOOGLE_WORKSPACE.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1WorkspaceConfig workspaceConfig;

  /**
   * Immutable. The content config of the data store. If this field is unset, the server behavior
   * defaults to ContentConfig.NO_CONTENT.
   * @return value or {@code null} for none
   */
  public java.lang.String getContentConfig() {
    return contentConfig;
  }

  /**
   * Immutable. The content config of the data store. If this field is unset, the server behavior
   * defaults to ContentConfig.NO_CONTENT.
   * @param contentConfig contentConfig or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1DataStore setContentConfig(java.lang.String contentConfig) {
    this.contentConfig = contentConfig;
    return this;
  }

  /**
   * Output only. Timestamp the DataStore was created at.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Timestamp the DataStore was created at.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1DataStore setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. The id of the default Schema asscociated to this data store.
   * @return value or {@code null} for none
   */
  public java.lang.String getDefaultSchemaId() {
    return defaultSchemaId;
  }

  /**
   * Output only. The id of the default Schema asscociated to this data store.
   * @param defaultSchemaId defaultSchemaId or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1DataStore setDefaultSchemaId(java.lang.String defaultSchemaId) {
    this.defaultSchemaId = defaultSchemaId;
    return this;
  }

  /**
   * Required. The data store display name. This field must be a UTF-8 encoded string with a length
   * limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Required. The data store display name. This field must be a UTF-8 encoded string with a length
   * limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1DataStore setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Configuration for Document understanding and enrichment.
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1DocumentProcessingConfig getDocumentProcessingConfig() {
    return documentProcessingConfig;
  }

  /**
   * Configuration for Document understanding and enrichment.
   * @param documentProcessingConfig documentProcessingConfig or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1DataStore setDocumentProcessingConfig(GoogleCloudDiscoveryengineV1DocumentProcessingConfig documentProcessingConfig) {
    this.documentProcessingConfig = documentProcessingConfig;
    return this;
  }

  /**
   * Immutable. The industry vertical that the data store registers.
   * @return value or {@code null} for none
   */
  public java.lang.String getIndustryVertical() {
    return industryVertical;
  }

  /**
   * Immutable. The industry vertical that the data store registers.
   * @param industryVertical industryVertical or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1DataStore setIndustryVertical(java.lang.String industryVertical) {
    this.industryVertical = industryVertical;
    return this;
  }

  /**
   * Immutable. The full resource name of the data store. Format: `projects/{project}/locations/{loc
   * ation}/collections/{collection_id}/dataStores/{data_store_id}`. This field must be a UTF-8
   * encoded string with a length limit of 1024 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Immutable. The full resource name of the data store. Format: `projects/{project}/locations/{loc
   * ation}/collections/{collection_id}/dataStores/{data_store_id}`. This field must be a UTF-8
   * encoded string with a length limit of 1024 characters.
   * @param name name or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1DataStore setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Optional. Stores serving config at DataStore level.
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1ServingConfigDataStore getServingConfigDataStore() {
    return servingConfigDataStore;
  }

  /**
   * Optional. Stores serving config at DataStore level.
   * @param servingConfigDataStore servingConfigDataStore or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1DataStore setServingConfigDataStore(GoogleCloudDiscoveryengineV1ServingConfigDataStore servingConfigDataStore) {
    this.servingConfigDataStore = servingConfigDataStore;
    return this;
  }

  /**
   * The solutions that the data store enrolls. Available solutions for each industry_vertical: *
   * `MEDIA`: `SOLUTION_TYPE_RECOMMENDATION` and `SOLUTION_TYPE_SEARCH`. * `SITE_SEARCH`:
   * `SOLUTION_TYPE_SEARCH` is automatically enrolled. Other solutions cannot be enrolled.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSolutionTypes() {
    return solutionTypes;
  }

  /**
   * The solutions that the data store enrolls. Available solutions for each industry_vertical: *
   * `MEDIA`: `SOLUTION_TYPE_RECOMMENDATION` and `SOLUTION_TYPE_SEARCH`. * `SITE_SEARCH`:
   * `SOLUTION_TYPE_SEARCH` is automatically enrolled. Other solutions cannot be enrolled.
   * @param solutionTypes solutionTypes or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1DataStore setSolutionTypes(java.util.List<java.lang.String> solutionTypes) {
    this.solutionTypes = solutionTypes;
    return this;
  }

  /**
   * The start schema to use for this DataStore when provisioning it. If unset, a default vertical
   * specialized schema will be used. This field is only used by CreateDataStore API, and will be
   * ignored if used in other APIs. This field will be omitted from all API responses including
   * CreateDataStore API. To retrieve a schema of a DataStore, use SchemaService.GetSchema API
   * instead. The provided schema will be validated against certain rules on schema. Learn more from
   * [this doc](https://cloud.google.com/generative-ai-app-builder/docs/provide-schema).
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1Schema getStartingSchema() {
    return startingSchema;
  }

  /**
   * The start schema to use for this DataStore when provisioning it. If unset, a default vertical
   * specialized schema will be used. This field is only used by CreateDataStore API, and will be
   * ignored if used in other APIs. This field will be omitted from all API responses including
   * CreateDataStore API. To retrieve a schema of a DataStore, use SchemaService.GetSchema API
   * instead. The provided schema will be validated against certain rules on schema. Learn more from
   * [this doc](https://cloud.google.com/generative-ai-app-builder/docs/provide-schema).
   * @param startingSchema startingSchema or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1DataStore setStartingSchema(GoogleCloudDiscoveryengineV1Schema startingSchema) {
    this.startingSchema = startingSchema;
    return this;
  }

  /**
   * Config to store data store type configuration for workspace data. This must be set when
   * DataStore.content_config is set as DataStore.ContentConfig.GOOGLE_WORKSPACE.
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1WorkspaceConfig getWorkspaceConfig() {
    return workspaceConfig;
  }

  /**
   * Config to store data store type configuration for workspace data. This must be set when
   * DataStore.content_config is set as DataStore.ContentConfig.GOOGLE_WORKSPACE.
   * @param workspaceConfig workspaceConfig or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1DataStore setWorkspaceConfig(GoogleCloudDiscoveryengineV1WorkspaceConfig workspaceConfig) {
    this.workspaceConfig = workspaceConfig;
    return this;
  }

  @Override
  public GoogleCloudDiscoveryengineV1DataStore set(String fieldName, Object value) {
    return (GoogleCloudDiscoveryengineV1DataStore) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDiscoveryengineV1DataStore clone() {
    return (GoogleCloudDiscoveryengineV1DataStore) super.clone();
  }

}
