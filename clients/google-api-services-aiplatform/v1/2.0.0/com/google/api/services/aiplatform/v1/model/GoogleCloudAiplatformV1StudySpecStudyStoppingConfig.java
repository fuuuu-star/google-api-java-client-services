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

package com.google.api.services.aiplatform.v1.model;

/**
 * The configuration (stopping conditions) for automated stopping of a Study. Conditions include
 * trial budgets, time budgets, and convergence detection.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1StudySpecStudyStoppingConfig extends com.google.api.client.json.GenericJson {

  /**
   * If the objective value has not improved for this much time, stop the study. WARNING: Effective
   * only for single-objective studies.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String maxDurationNoProgress;

  /**
   * If there are more than this many trials, stop the study.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxNumTrials;

  /**
   * If the objective value has not improved for this many consecutive trials, stop the study.
   * WARNING: Effective only for single-objective studies.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxNumTrialsNoProgress;

  /**
   * If the specified time or duration has passed, stop the study.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1StudyTimeConstraint maximumRuntimeConstraint;

  /**
   * If there are fewer than this many COMPLETED trials, do not stop the study.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer minNumTrials;

  /**
   * Each "stopping rule" in this proto specifies an "if" condition. Before Vizier would generate a
   * new suggestion, it first checks each specified stopping rule, from top to bottom in this list.
   * Note that the first few rules (e.g. minimum_runtime_constraint, min_num_trials) will prevent
   * other stopping rules from being evaluated until they are met. For example, setting
   * `min_num_trials=5` and `always_stop_after= 1 hour` means that the Study will ONLY stop after it
   * has 5 COMPLETED trials, even if more than an hour has passed since its creation. It follows the
   * first applicable rule (whose "if" condition is satisfied) to make a stopping decision. If none
   * of the specified rules are applicable, then Vizier decides that the study should not stop. If
   * Vizier decides that the study should stop, the study enters STOPPING state (or STOPPING_ASAP if
   * should_stop_asap = true). IMPORTANT: The automatic study state transition happens precisely as
   * described above; that is, deleting trials or updating StudyConfig NEVER automatically moves the
   * study state back to ACTIVE. If you want to _resume_ a Study that was stopped, 1) change the
   * stopping conditions if necessary, 2) activate the study, and then 3) ask for suggestions. If
   * the specified time or duration has not passed, do not stop the study.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1StudyTimeConstraint minimumRuntimeConstraint;

  /**
   * If true, a Study enters STOPPING_ASAP whenever it would normally enters STOPPING state. The
   * bottom line is: set to true if you want to interrupt on-going evaluations of Trials as soon as
   * the study stopping condition is met. (Please see Study.State documentation for the source of
   * truth).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean shouldStopAsap;

  /**
   * If the objective value has not improved for this much time, stop the study. WARNING: Effective
   * only for single-objective studies.
   * @return value or {@code null} for none
   */
  public String getMaxDurationNoProgress() {
    return maxDurationNoProgress;
  }

  /**
   * If the objective value has not improved for this much time, stop the study. WARNING: Effective
   * only for single-objective studies.
   * @param maxDurationNoProgress maxDurationNoProgress or {@code null} for none
   */
  public GoogleCloudAiplatformV1StudySpecStudyStoppingConfig setMaxDurationNoProgress(String maxDurationNoProgress) {
    this.maxDurationNoProgress = maxDurationNoProgress;
    return this;
  }

  /**
   * If there are more than this many trials, stop the study.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxNumTrials() {
    return maxNumTrials;
  }

  /**
   * If there are more than this many trials, stop the study.
   * @param maxNumTrials maxNumTrials or {@code null} for none
   */
  public GoogleCloudAiplatformV1StudySpecStudyStoppingConfig setMaxNumTrials(java.lang.Integer maxNumTrials) {
    this.maxNumTrials = maxNumTrials;
    return this;
  }

  /**
   * If the objective value has not improved for this many consecutive trials, stop the study.
   * WARNING: Effective only for single-objective studies.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxNumTrialsNoProgress() {
    return maxNumTrialsNoProgress;
  }

  /**
   * If the objective value has not improved for this many consecutive trials, stop the study.
   * WARNING: Effective only for single-objective studies.
   * @param maxNumTrialsNoProgress maxNumTrialsNoProgress or {@code null} for none
   */
  public GoogleCloudAiplatformV1StudySpecStudyStoppingConfig setMaxNumTrialsNoProgress(java.lang.Integer maxNumTrialsNoProgress) {
    this.maxNumTrialsNoProgress = maxNumTrialsNoProgress;
    return this;
  }

  /**
   * If the specified time or duration has passed, stop the study.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1StudyTimeConstraint getMaximumRuntimeConstraint() {
    return maximumRuntimeConstraint;
  }

  /**
   * If the specified time or duration has passed, stop the study.
   * @param maximumRuntimeConstraint maximumRuntimeConstraint or {@code null} for none
   */
  public GoogleCloudAiplatformV1StudySpecStudyStoppingConfig setMaximumRuntimeConstraint(GoogleCloudAiplatformV1StudyTimeConstraint maximumRuntimeConstraint) {
    this.maximumRuntimeConstraint = maximumRuntimeConstraint;
    return this;
  }

  /**
   * If there are fewer than this many COMPLETED trials, do not stop the study.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMinNumTrials() {
    return minNumTrials;
  }

  /**
   * If there are fewer than this many COMPLETED trials, do not stop the study.
   * @param minNumTrials minNumTrials or {@code null} for none
   */
  public GoogleCloudAiplatformV1StudySpecStudyStoppingConfig setMinNumTrials(java.lang.Integer minNumTrials) {
    this.minNumTrials = minNumTrials;
    return this;
  }

  /**
   * Each "stopping rule" in this proto specifies an "if" condition. Before Vizier would generate a
   * new suggestion, it first checks each specified stopping rule, from top to bottom in this list.
   * Note that the first few rules (e.g. minimum_runtime_constraint, min_num_trials) will prevent
   * other stopping rules from being evaluated until they are met. For example, setting
   * `min_num_trials=5` and `always_stop_after= 1 hour` means that the Study will ONLY stop after it
   * has 5 COMPLETED trials, even if more than an hour has passed since its creation. It follows the
   * first applicable rule (whose "if" condition is satisfied) to make a stopping decision. If none
   * of the specified rules are applicable, then Vizier decides that the study should not stop. If
   * Vizier decides that the study should stop, the study enters STOPPING state (or STOPPING_ASAP if
   * should_stop_asap = true). IMPORTANT: The automatic study state transition happens precisely as
   * described above; that is, deleting trials or updating StudyConfig NEVER automatically moves the
   * study state back to ACTIVE. If you want to _resume_ a Study that was stopped, 1) change the
   * stopping conditions if necessary, 2) activate the study, and then 3) ask for suggestions. If
   * the specified time or duration has not passed, do not stop the study.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1StudyTimeConstraint getMinimumRuntimeConstraint() {
    return minimumRuntimeConstraint;
  }

  /**
   * Each "stopping rule" in this proto specifies an "if" condition. Before Vizier would generate a
   * new suggestion, it first checks each specified stopping rule, from top to bottom in this list.
   * Note that the first few rules (e.g. minimum_runtime_constraint, min_num_trials) will prevent
   * other stopping rules from being evaluated until they are met. For example, setting
   * `min_num_trials=5` and `always_stop_after= 1 hour` means that the Study will ONLY stop after it
   * has 5 COMPLETED trials, even if more than an hour has passed since its creation. It follows the
   * first applicable rule (whose "if" condition is satisfied) to make a stopping decision. If none
   * of the specified rules are applicable, then Vizier decides that the study should not stop. If
   * Vizier decides that the study should stop, the study enters STOPPING state (or STOPPING_ASAP if
   * should_stop_asap = true). IMPORTANT: The automatic study state transition happens precisely as
   * described above; that is, deleting trials or updating StudyConfig NEVER automatically moves the
   * study state back to ACTIVE. If you want to _resume_ a Study that was stopped, 1) change the
   * stopping conditions if necessary, 2) activate the study, and then 3) ask for suggestions. If
   * the specified time or duration has not passed, do not stop the study.
   * @param minimumRuntimeConstraint minimumRuntimeConstraint or {@code null} for none
   */
  public GoogleCloudAiplatformV1StudySpecStudyStoppingConfig setMinimumRuntimeConstraint(GoogleCloudAiplatformV1StudyTimeConstraint minimumRuntimeConstraint) {
    this.minimumRuntimeConstraint = minimumRuntimeConstraint;
    return this;
  }

  /**
   * If true, a Study enters STOPPING_ASAP whenever it would normally enters STOPPING state. The
   * bottom line is: set to true if you want to interrupt on-going evaluations of Trials as soon as
   * the study stopping condition is met. (Please see Study.State documentation for the source of
   * truth).
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getShouldStopAsap() {
    return shouldStopAsap;
  }

  /**
   * If true, a Study enters STOPPING_ASAP whenever it would normally enters STOPPING state. The
   * bottom line is: set to true if you want to interrupt on-going evaluations of Trials as soon as
   * the study stopping condition is met. (Please see Study.State documentation for the source of
   * truth).
   * @param shouldStopAsap shouldStopAsap or {@code null} for none
   */
  public GoogleCloudAiplatformV1StudySpecStudyStoppingConfig setShouldStopAsap(java.lang.Boolean shouldStopAsap) {
    this.shouldStopAsap = shouldStopAsap;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1StudySpecStudyStoppingConfig set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1StudySpecStudyStoppingConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1StudySpecStudyStoppingConfig clone() {
    return (GoogleCloudAiplatformV1StudySpecStudyStoppingConfig) super.clone();
  }

}
