
package com.ellucian.generated.bpapi.ban.electronic_personnel_action_routing.v1_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "originatorName",
    "queueStatus",
    "approverAction",
    "queueOriginatorUserId"
})
@Generated("jsonschema2pojo")
public class Nobtran__1 {

    @JsonProperty("originatorName")
    private String originatorName;
    /**
     * Queue Status
     * <p>
     * 
     * 
     */
    @JsonProperty("queueStatus")
    private String queueStatus;
    /**
     * Approver Action
     * <p>
     * 
     * 
     */
    @JsonProperty("approverAction")
    private String approverAction;
    /**
     * Originator ID
     * <p>
     * 
     * 
     */
    @JsonProperty("queueOriginatorUserId")
    private String queueOriginatorUserId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("originatorName")
    public String getOriginatorName() {
        return originatorName;
    }

    @JsonProperty("originatorName")
    public void setOriginatorName(String originatorName) {
        this.originatorName = originatorName;
    }

    public Nobtran__1 withOriginatorName(String originatorName) {
        this.originatorName = originatorName;
        return this;
    }

    /**
     * Queue Status
     * <p>
     * 
     * 
     */
    @JsonProperty("queueStatus")
    public String getQueueStatus() {
        return queueStatus;
    }

    /**
     * Queue Status
     * <p>
     * 
     * 
     */
    @JsonProperty("queueStatus")
    public void setQueueStatus(String queueStatus) {
        this.queueStatus = queueStatus;
    }

    public Nobtran__1 withQueueStatus(String queueStatus) {
        this.queueStatus = queueStatus;
        return this;
    }

    /**
     * Approver Action
     * <p>
     * 
     * 
     */
    @JsonProperty("approverAction")
    public String getApproverAction() {
        return approverAction;
    }

    /**
     * Approver Action
     * <p>
     * 
     * 
     */
    @JsonProperty("approverAction")
    public void setApproverAction(String approverAction) {
        this.approverAction = approverAction;
    }

    public Nobtran__1 withApproverAction(String approverAction) {
        this.approverAction = approverAction;
        return this;
    }

    /**
     * Originator ID
     * <p>
     * 
     * 
     */
    @JsonProperty("queueOriginatorUserId")
    public String getQueueOriginatorUserId() {
        return queueOriginatorUserId;
    }

    /**
     * Originator ID
     * <p>
     * 
     * 
     */
    @JsonProperty("queueOriginatorUserId")
    public void setQueueOriginatorUserId(String queueOriginatorUserId) {
        this.queueOriginatorUserId = queueOriginatorUserId;
    }

    public Nobtran__1 withQueueOriginatorUserId(String queueOriginatorUserId) {
        this.queueOriginatorUserId = queueOriginatorUserId;
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

    public Nobtran__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Nobtran__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("originatorName");
        sb.append('=');
        sb.append(((this.originatorName == null)?"<null>":this.originatorName));
        sb.append(',');
        sb.append("queueStatus");
        sb.append('=');
        sb.append(((this.queueStatus == null)?"<null>":this.queueStatus));
        sb.append(',');
        sb.append("approverAction");
        sb.append('=');
        sb.append(((this.approverAction == null)?"<null>":this.approverAction));
        sb.append(',');
        sb.append("queueOriginatorUserId");
        sb.append('=');
        sb.append(((this.queueOriginatorUserId == null)?"<null>":this.queueOriginatorUserId));
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
        result = ((result* 31)+((this.originatorName == null)? 0 :this.originatorName.hashCode()));
        result = ((result* 31)+((this.approverAction == null)? 0 :this.approverAction.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.queueStatus == null)? 0 :this.queueStatus.hashCode()));
        result = ((result* 31)+((this.queueOriginatorUserId == null)? 0 :this.queueOriginatorUserId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Nobtran__1) == false) {
            return false;
        }
        Nobtran__1 rhs = ((Nobtran__1) other);
        return ((((((this.originatorName == rhs.originatorName)||((this.originatorName!= null)&&this.originatorName.equals(rhs.originatorName)))&&((this.approverAction == rhs.approverAction)||((this.approverAction!= null)&&this.approverAction.equals(rhs.approverAction))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.queueStatus == rhs.queueStatus)||((this.queueStatus!= null)&&this.queueStatus.equals(rhs.queueStatus))))&&((this.queueOriginatorUserId == rhs.queueOriginatorUserId)||((this.queueOriginatorUserId!= null)&&this.queueOriginatorUserId.equals(rhs.queueOriginatorUserId))));
    }

}
