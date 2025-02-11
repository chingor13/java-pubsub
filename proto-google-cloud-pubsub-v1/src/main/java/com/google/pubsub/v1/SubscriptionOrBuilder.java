// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

public interface SubscriptionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.Subscription)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the subscription. It must have the format
   * `"projects/{project}/subscriptions/{subscription}"`. `{subscription}` must
   * start with a letter, and contain only letters (`[A-Za-z]`), numbers
   * (`[0-9]`), dashes (`-`), underscores (`_`), periods (`.`), tildes (`~`),
   * plus (`+`) or percent signs (`%`). It must be between 3 and 255 characters
   * in length, and it must not start with `"goog"`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The name of the subscription. It must have the format
   * `"projects/{project}/subscriptions/{subscription}"`. `{subscription}` must
   * start with a letter, and contain only letters (`[A-Za-z]`), numbers
   * (`[0-9]`), dashes (`-`), underscores (`_`), periods (`.`), tildes (`~`),
   * plus (`+`) or percent signs (`%`). It must be between 3 and 255 characters
   * in length, and it must not start with `"goog"`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The name of the topic from which this subscription is receiving messages.
   * Format is `projects/{project}/topics/{topic}`.
   * The value of this field will be `_deleted-topic_` if the topic has been
   * deleted.
   * </pre>
   *
   * <code>string topic = 2;</code>
   */
  java.lang.String getTopic();
  /**
   *
   *
   * <pre>
   * The name of the topic from which this subscription is receiving messages.
   * Format is `projects/{project}/topics/{topic}`.
   * The value of this field will be `_deleted-topic_` if the topic has been
   * deleted.
   * </pre>
   *
   * <code>string topic = 2;</code>
   */
  com.google.protobuf.ByteString getTopicBytes();

  /**
   *
   *
   * <pre>
   * If push delivery is used with this subscription, this field is
   * used to configure it. An empty `pushConfig` signifies that the subscriber
   * will pull and ack messages using API methods.
   * </pre>
   *
   * <code>.google.pubsub.v1.PushConfig push_config = 4;</code>
   */
  boolean hasPushConfig();
  /**
   *
   *
   * <pre>
   * If push delivery is used with this subscription, this field is
   * used to configure it. An empty `pushConfig` signifies that the subscriber
   * will pull and ack messages using API methods.
   * </pre>
   *
   * <code>.google.pubsub.v1.PushConfig push_config = 4;</code>
   */
  com.google.pubsub.v1.PushConfig getPushConfig();
  /**
   *
   *
   * <pre>
   * If push delivery is used with this subscription, this field is
   * used to configure it. An empty `pushConfig` signifies that the subscriber
   * will pull and ack messages using API methods.
   * </pre>
   *
   * <code>.google.pubsub.v1.PushConfig push_config = 4;</code>
   */
  com.google.pubsub.v1.PushConfigOrBuilder getPushConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * The approximate amount of time (on a best-effort basis) Pub/Sub waits for
   * the subscriber to acknowledge receipt before resending the message. In the
   * interval after the message is delivered and before it is acknowledged, it
   * is considered to be &lt;i&gt;outstanding&lt;/i&gt;. During that time period, the
   * message will not be redelivered (on a best-effort basis).
   * For pull subscriptions, this value is used as the initial value for the ack
   * deadline. To override this value for a given message, call
   * `ModifyAckDeadline` with the corresponding `ack_id` if using
   * non-streaming pull or send the `ack_id` in a
   * `StreamingModifyAckDeadlineRequest` if using streaming pull.
   * The minimum custom deadline you can specify is 10 seconds.
   * The maximum custom deadline you can specify is 600 seconds (10 minutes).
   * If this parameter is 0, a default value of 10 seconds is used.
   * For push delivery, this value is also used to set the request timeout for
   * the call to the push endpoint.
   * If the subscriber never acknowledges the message, the Pub/Sub
   * system will eventually redeliver the message.
   * </pre>
   *
   * <code>int32 ack_deadline_seconds = 5;</code>
   */
  int getAckDeadlineSeconds();

  /**
   *
   *
   * <pre>
   * Indicates whether to retain acknowledged messages. If true, then
   * messages are not expunged from the subscription's backlog, even if they are
   * acknowledged, until they fall out of the `message_retention_duration`
   * window. This must be true if you would like to
   * &lt;a
   * href="https://cloud.google.com/pubsub/docs/replay-overview#seek_to_a_time"&gt;
   * Seek to a timestamp&lt;/a&gt;.
   * </pre>
   *
   * <code>bool retain_acked_messages = 7;</code>
   */
  boolean getRetainAckedMessages();

  /**
   *
   *
   * <pre>
   * How long to retain unacknowledged messages in the subscription's backlog,
   * from the moment a message is published.
   * If `retain_acked_messages` is true, then this also configures the retention
   * of acknowledged messages, and thus configures how far back in time a `Seek`
   * can be done. Defaults to 7 days. Cannot be more than 7 days or less than 10
   * minutes.
   * </pre>
   *
   * <code>.google.protobuf.Duration message_retention_duration = 8;</code>
   */
  boolean hasMessageRetentionDuration();
  /**
   *
   *
   * <pre>
   * How long to retain unacknowledged messages in the subscription's backlog,
   * from the moment a message is published.
   * If `retain_acked_messages` is true, then this also configures the retention
   * of acknowledged messages, and thus configures how far back in time a `Seek`
   * can be done. Defaults to 7 days. Cannot be more than 7 days or less than 10
   * minutes.
   * </pre>
   *
   * <code>.google.protobuf.Duration message_retention_duration = 8;</code>
   */
  com.google.protobuf.Duration getMessageRetentionDuration();
  /**
   *
   *
   * <pre>
   * How long to retain unacknowledged messages in the subscription's backlog,
   * from the moment a message is published.
   * If `retain_acked_messages` is true, then this also configures the retention
   * of acknowledged messages, and thus configures how far back in time a `Seek`
   * can be done. Defaults to 7 days. Cannot be more than 7 days or less than 10
   * minutes.
   * </pre>
   *
   * <code>.google.protobuf.Duration message_retention_duration = 8;</code>
   */
  com.google.protobuf.DurationOrBuilder getMessageRetentionDurationOrBuilder();

  /**
   *
   *
   * <pre>
   * See &lt;a href="https://cloud.google.com/pubsub/docs/labels"&gt; Creating and
   * managing labels&lt;/a&gt;.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * See &lt;a href="https://cloud.google.com/pubsub/docs/labels"&gt; Creating and
   * managing labels&lt;/a&gt;.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * See &lt;a href="https://cloud.google.com/pubsub/docs/labels"&gt; Creating and
   * managing labels&lt;/a&gt;.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * See &lt;a href="https://cloud.google.com/pubsub/docs/labels"&gt; Creating and
   * managing labels&lt;/a&gt;.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9;</code>
   */
  java.lang.String getLabelsOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * See &lt;a href="https://cloud.google.com/pubsub/docs/labels"&gt; Creating and
   * managing labels&lt;/a&gt;.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * If true, messages published with the same `ordering_key` in `PubsubMessage`
   * will be delivered to the subscribers in the order in which they
   * are received by the Pub/Sub system. Otherwise, they may be delivered in
   * any order.
   * &lt;b&gt;EXPERIMENTAL:&lt;/b&gt; This feature is part of a closed alpha release. This
   * API might be changed in backward-incompatible ways and is not recommended
   * for production use. It is not subject to any SLA or deprecation policy.
   * </pre>
   *
   * <code>bool enable_message_ordering = 10;</code>
   */
  boolean getEnableMessageOrdering();

  /**
   *
   *
   * <pre>
   * A policy that specifies the conditions for this subscription's expiration.
   * A subscription is considered active as long as any connected subscriber is
   * successfully consuming messages from the subscription or is issuing
   * operations on the subscription. If `expiration_policy` is not set, a
   * *default policy* with `ttl` of 31 days will be used. The minimum allowed
   * value for `expiration_policy.ttl` is 1 day.
   * </pre>
   *
   * <code>.google.pubsub.v1.ExpirationPolicy expiration_policy = 11;</code>
   */
  boolean hasExpirationPolicy();
  /**
   *
   *
   * <pre>
   * A policy that specifies the conditions for this subscription's expiration.
   * A subscription is considered active as long as any connected subscriber is
   * successfully consuming messages from the subscription or is issuing
   * operations on the subscription. If `expiration_policy` is not set, a
   * *default policy* with `ttl` of 31 days will be used. The minimum allowed
   * value for `expiration_policy.ttl` is 1 day.
   * </pre>
   *
   * <code>.google.pubsub.v1.ExpirationPolicy expiration_policy = 11;</code>
   */
  com.google.pubsub.v1.ExpirationPolicy getExpirationPolicy();
  /**
   *
   *
   * <pre>
   * A policy that specifies the conditions for this subscription's expiration.
   * A subscription is considered active as long as any connected subscriber is
   * successfully consuming messages from the subscription or is issuing
   * operations on the subscription. If `expiration_policy` is not set, a
   * *default policy* with `ttl` of 31 days will be used. The minimum allowed
   * value for `expiration_policy.ttl` is 1 day.
   * </pre>
   *
   * <code>.google.pubsub.v1.ExpirationPolicy expiration_policy = 11;</code>
   */
  com.google.pubsub.v1.ExpirationPolicyOrBuilder getExpirationPolicyOrBuilder();

  /**
   *
   *
   * <pre>
   * A policy that specifies the conditions for dead lettering messages in
   * this subscription. If dead_letter_policy is not set, dead lettering
   * is disabled.
   * The Cloud Pub/Sub service account associated with this subscriptions's
   * parent project (i.e.,
   * service-{project_number}&#64;gcp-sa-pubsub.iam.gserviceaccount.com) must have
   * permission to Acknowledge() messages on this subscription.
   * &lt;b&gt;EXPERIMENTAL:&lt;/b&gt; This feature is part of a closed alpha release. This
   * API might be changed in backward-incompatible ways and is not recommended
   * for production use. It is not subject to any SLA or deprecation policy.
   * </pre>
   *
   * <code>.google.pubsub.v1.DeadLetterPolicy dead_letter_policy = 13;</code>
   */
  boolean hasDeadLetterPolicy();
  /**
   *
   *
   * <pre>
   * A policy that specifies the conditions for dead lettering messages in
   * this subscription. If dead_letter_policy is not set, dead lettering
   * is disabled.
   * The Cloud Pub/Sub service account associated with this subscriptions's
   * parent project (i.e.,
   * service-{project_number}&#64;gcp-sa-pubsub.iam.gserviceaccount.com) must have
   * permission to Acknowledge() messages on this subscription.
   * &lt;b&gt;EXPERIMENTAL:&lt;/b&gt; This feature is part of a closed alpha release. This
   * API might be changed in backward-incompatible ways and is not recommended
   * for production use. It is not subject to any SLA or deprecation policy.
   * </pre>
   *
   * <code>.google.pubsub.v1.DeadLetterPolicy dead_letter_policy = 13;</code>
   */
  com.google.pubsub.v1.DeadLetterPolicy getDeadLetterPolicy();
  /**
   *
   *
   * <pre>
   * A policy that specifies the conditions for dead lettering messages in
   * this subscription. If dead_letter_policy is not set, dead lettering
   * is disabled.
   * The Cloud Pub/Sub service account associated with this subscriptions's
   * parent project (i.e.,
   * service-{project_number}&#64;gcp-sa-pubsub.iam.gserviceaccount.com) must have
   * permission to Acknowledge() messages on this subscription.
   * &lt;b&gt;EXPERIMENTAL:&lt;/b&gt; This feature is part of a closed alpha release. This
   * API might be changed in backward-incompatible ways and is not recommended
   * for production use. It is not subject to any SLA or deprecation policy.
   * </pre>
   *
   * <code>.google.pubsub.v1.DeadLetterPolicy dead_letter_policy = 13;</code>
   */
  com.google.pubsub.v1.DeadLetterPolicyOrBuilder getDeadLetterPolicyOrBuilder();
}
