
package com.ellucian.generated.bpapi.ban.approval_queue_maintenance.v1_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "queueId",
    "queueLimit",
    "nextQueueTitle",
    "description",
    "nextQueueId"
})
@Generated("jsonschema2pojo")
public class Ftvappq {

    /**
     * Queue ID
     * <p>
     * Lineage reference object : FTVAPPQ_QUEUE_ID, Lookup lineage reference object : ftvappq
     * (Required)
     * 
     */
    @JsonProperty("queueId")
    @JsonPropertyDescription("Lineage reference object : FTVAPPQ_QUEUE_ID, Lookup lineage reference object : ftvappq")
    private String queueId;
    /**
     * Queue Limit
     * <p>
     * Lineage reference object : FTVAPPQ_QUEUE_LIMIT
     * 
     */
    @JsonProperty("queueLimit")
    @JsonPropertyDescription("Lineage reference object : FTVAPPQ_QUEUE_LIMIT")
    private Double queueLimit;
    @JsonProperty("nextQueueTitle")
    private String nextQueueTitle;
    /**
     * Queue Description
     * <p>
     * Lineage reference object : FTVAPPQ_DESCRIPTION
     * (Required)
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Lineage reference object : FTVAPPQ_DESCRIPTION")
    private String description;
    /**
     * Next Queue
     * <p>
     * Lineage reference object : FTVAPPQ_NEXT_QUEUE_ID, Lookup lineage reference object : ftvappq
     * 
     */
    @JsonProperty("nextQueueId")
    @JsonPropertyDescription("Lineage reference object : FTVAPPQ_NEXT_QUEUE_ID, Lookup lineage reference object : ftvappq")
    private String nextQueueId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Queue ID
     * <p>
     * Lineage reference object : FTVAPPQ_QUEUE_ID, Lookup lineage reference object : ftvappq
     * (Required)
     * 
     */
    @JsonProperty("queueId")
    public String getQueueId() {
        return queueId;
    }

    /**
     * Queue ID
     * <p>
     * Lineage reference object : FTVAPPQ_QUEUE_ID, Lookup lineage reference object : ftvappq
     * (Required)
     * 
     */
    @JsonProperty("queueId")
    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    public Ftvappq withQueueId(String queueId) {
        this.queueId = queueId;
        return this;
    }

    /**
     * Queue Limit
     * <p>
     * Lineage reference object : FTVAPPQ_QUEUE_LIMIT
     * 
     */
    @JsonProperty("queueLimit")
    public Double getQueueLimit() {
        return queueLimit;
    }

    /**
     * Queue Limit
     * <p>
     * Lineage reference object : FTVAPPQ_QUEUE_LIMIT
     * 
     */
    @JsonProperty("queueLimit")
    public void setQueueLimit(Double queueLimit) {
        this.queueLimit = queueLimit;
    }

    public Ftvappq withQueueLimit(Double queueLimit) {
        this.queueLimit = queueLimit;
        return this;
    }

    @JsonProperty("nextQueueTitle")
    public String getNextQueueTitle() {
        return nextQueueTitle;
    }

    @JsonProperty("nextQueueTitle")
    public void setNextQueueTitle(String nextQueueTitle) {
        this.nextQueueTitle = nextQueueTitle;
    }

    public Ftvappq withNextQueueTitle(String nextQueueTitle) {
        this.nextQueueTitle = nextQueueTitle;
        return this;
    }

    /**
     * Queue Description
     * <p>
     * Lineage reference object : FTVAPPQ_DESCRIPTION
     * (Required)
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Queue Description
     * <p>
     * Lineage reference object : FTVAPPQ_DESCRIPTION
     * (Required)
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Ftvappq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Next Queue
     * <p>
     * Lineage reference object : FTVAPPQ_NEXT_QUEUE_ID, Lookup lineage reference object : ftvappq
     * 
     */
    @JsonProperty("nextQueueId")
    public String getNextQueueId() {
        return nextQueueId;
    }

    /**
     * Next Queue
     * <p>
     * Lineage reference object : FTVAPPQ_NEXT_QUEUE_ID, Lookup lineage reference object : ftvappq
     * 
     */
    @JsonProperty("nextQueueId")
    public void setNextQueueId(String nextQueueId) {
        this.nextQueueId = nextQueueId;
    }

    public Ftvappq withNextQueueId(String nextQueueId) {
        this.nextQueueId = nextQueueId;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Ftvappq withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ftvappq.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("queueId");
        sb.append('=');
        sb.append(((this.queueId == null)?"<null>":this.queueId));
        sb.append(',');
        sb.append("queueLimit");
        sb.append('=');
        sb.append(((this.queueLimit == null)?"<null>":this.queueLimit));
        sb.append(',');
        sb.append("nextQueueTitle");
        sb.append('=');
        sb.append(((this.nextQueueTitle == null)?"<null>":this.nextQueueTitle));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("nextQueueId");
        sb.append('=');
        sb.append(((this.nextQueueId == null)?"<null>":this.nextQueueId));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.queueId == null)? 0 :this.queueId.hashCode()));
        result = ((result* 31)+((this.queueLimit == null)? 0 :this.queueLimit.hashCode()));
        result = ((result* 31)+((this.nextQueueTitle == null)? 0 :this.nextQueueTitle.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.nextQueueId == null)? 0 :this.nextQueueId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ftvappq) == false) {
            return false;
        }
        Ftvappq rhs = ((Ftvappq) other);
        return (((((((this.queueId == rhs.queueId)||((this.queueId!= null)&&this.queueId.equals(rhs.queueId)))&&((this.queueLimit == rhs.queueLimit)||((this.queueLimit!= null)&&this.queueLimit.equals(rhs.queueLimit))))&&((this.nextQueueTitle == rhs.nextQueueTitle)||((this.nextQueueTitle!= null)&&this.nextQueueTitle.equals(rhs.nextQueueTitle))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.nextQueueId == rhs.nextQueueId)||((this.nextQueueId!= null)&&this.nextQueueId.equals(rhs.nextQueueId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
