
package com.ellucian.generated.bpapi.ban.electronic_personnel_action_routing.v1_0_0;

import java.util.Date;
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
    "recipientUserId",
    "queueStatusInd",
    "actionInd",
    "routStatusDateTime",
    "levelNo",
    "alvlCode",
    "recipientUserIdName"
})
@Generated("jsonschema2pojo")
public class Norrout__1 {

    /**
     * User ID
     * <p>
     * Lineage reference object : NORROUT_RECIPIENT_USER_ID
     * 
     */
    @JsonProperty("recipientUserId")
    @JsonPropertyDescription("Lineage reference object : NORROUT_RECIPIENT_USER_ID")
    private String recipientUserId;
    /**
     * Queue Status
     * <p>
     * 
     * 
     */
    @JsonProperty("queueStatusInd")
    private String queueStatusInd;
    /**
     * Required Action
     * <p>
     * Lineage reference object : NORROUT_ACTION_IND
     * (Required)
     * 
     */
    @JsonProperty("actionInd")
    @JsonPropertyDescription("Lineage reference object : NORROUT_ACTION_IND")
    private String actionInd;
    /**
     * Action Date
     * <p>
     * 
     * 
     */
    @JsonProperty("routStatusDateTime")
    private Date routStatusDateTime;
    /**
     * Level
     * <p>
     * Lineage reference object : NORROUT_LEVEL_NO
     * 
     */
    @JsonProperty("levelNo")
    @JsonPropertyDescription("Lineage reference object : NORROUT_LEVEL_NO")
    private Double levelNo;
    /**
     * Level Code
     * <p>
     * Lineage reference object : NORROUT_ALVL_CODE, Lookup lineage reference object : ntralvl
     * (Required)
     * 
     */
    @JsonProperty("alvlCode")
    @JsonPropertyDescription("Lineage reference object : NORROUT_ALVL_CODE, Lookup lineage reference object : ntralvl")
    private String alvlCode;
    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("recipientUserIdName")
    private String recipientUserIdName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * User ID
     * <p>
     * Lineage reference object : NORROUT_RECIPIENT_USER_ID
     * 
     */
    @JsonProperty("recipientUserId")
    public String getRecipientUserId() {
        return recipientUserId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : NORROUT_RECIPIENT_USER_ID
     * 
     */
    @JsonProperty("recipientUserId")
    public void setRecipientUserId(String recipientUserId) {
        this.recipientUserId = recipientUserId;
    }

    public Norrout__1 withRecipientUserId(String recipientUserId) {
        this.recipientUserId = recipientUserId;
        return this;
    }

    /**
     * Queue Status
     * <p>
     * 
     * 
     */
    @JsonProperty("queueStatusInd")
    public String getQueueStatusInd() {
        return queueStatusInd;
    }

    /**
     * Queue Status
     * <p>
     * 
     * 
     */
    @JsonProperty("queueStatusInd")
    public void setQueueStatusInd(String queueStatusInd) {
        this.queueStatusInd = queueStatusInd;
    }

    public Norrout__1 withQueueStatusInd(String queueStatusInd) {
        this.queueStatusInd = queueStatusInd;
        return this;
    }

    /**
     * Required Action
     * <p>
     * Lineage reference object : NORROUT_ACTION_IND
     * (Required)
     * 
     */
    @JsonProperty("actionInd")
    public String getActionInd() {
        return actionInd;
    }

    /**
     * Required Action
     * <p>
     * Lineage reference object : NORROUT_ACTION_IND
     * (Required)
     * 
     */
    @JsonProperty("actionInd")
    public void setActionInd(String actionInd) {
        this.actionInd = actionInd;
    }

    public Norrout__1 withActionInd(String actionInd) {
        this.actionInd = actionInd;
        return this;
    }

    /**
     * Action Date
     * <p>
     * 
     * 
     */
    @JsonProperty("routStatusDateTime")
    public Date getRoutStatusDateTime() {
        return routStatusDateTime;
    }

    /**
     * Action Date
     * <p>
     * 
     * 
     */
    @JsonProperty("routStatusDateTime")
    public void setRoutStatusDateTime(Date routStatusDateTime) {
        this.routStatusDateTime = routStatusDateTime;
    }

    public Norrout__1 withRoutStatusDateTime(Date routStatusDateTime) {
        this.routStatusDateTime = routStatusDateTime;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : NORROUT_LEVEL_NO
     * 
     */
    @JsonProperty("levelNo")
    public Double getLevelNo() {
        return levelNo;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : NORROUT_LEVEL_NO
     * 
     */
    @JsonProperty("levelNo")
    public void setLevelNo(Double levelNo) {
        this.levelNo = levelNo;
    }

    public Norrout__1 withLevelNo(Double levelNo) {
        this.levelNo = levelNo;
        return this;
    }

    /**
     * Level Code
     * <p>
     * Lineage reference object : NORROUT_ALVL_CODE, Lookup lineage reference object : ntralvl
     * (Required)
     * 
     */
    @JsonProperty("alvlCode")
    public String getAlvlCode() {
        return alvlCode;
    }

    /**
     * Level Code
     * <p>
     * Lineage reference object : NORROUT_ALVL_CODE, Lookup lineage reference object : ntralvl
     * (Required)
     * 
     */
    @JsonProperty("alvlCode")
    public void setAlvlCode(String alvlCode) {
        this.alvlCode = alvlCode;
    }

    public Norrout__1 withAlvlCode(String alvlCode) {
        this.alvlCode = alvlCode;
        return this;
    }

    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("recipientUserIdName")
    public String getRecipientUserIdName() {
        return recipientUserIdName;
    }

    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("recipientUserIdName")
    public void setRecipientUserIdName(String recipientUserIdName) {
        this.recipientUserIdName = recipientUserIdName;
    }

    public Norrout__1 withRecipientUserIdName(String recipientUserIdName) {
        this.recipientUserIdName = recipientUserIdName;
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

    public Norrout__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Norrout__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("recipientUserId");
        sb.append('=');
        sb.append(((this.recipientUserId == null)?"<null>":this.recipientUserId));
        sb.append(',');
        sb.append("queueStatusInd");
        sb.append('=');
        sb.append(((this.queueStatusInd == null)?"<null>":this.queueStatusInd));
        sb.append(',');
        sb.append("actionInd");
        sb.append('=');
        sb.append(((this.actionInd == null)?"<null>":this.actionInd));
        sb.append(',');
        sb.append("routStatusDateTime");
        sb.append('=');
        sb.append(((this.routStatusDateTime == null)?"<null>":this.routStatusDateTime));
        sb.append(',');
        sb.append("levelNo");
        sb.append('=');
        sb.append(((this.levelNo == null)?"<null>":this.levelNo));
        sb.append(',');
        sb.append("alvlCode");
        sb.append('=');
        sb.append(((this.alvlCode == null)?"<null>":this.alvlCode));
        sb.append(',');
        sb.append("recipientUserIdName");
        sb.append('=');
        sb.append(((this.recipientUserIdName == null)?"<null>":this.recipientUserIdName));
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
        result = ((result* 31)+((this.recipientUserId == null)? 0 :this.recipientUserId.hashCode()));
        result = ((result* 31)+((this.queueStatusInd == null)? 0 :this.queueStatusInd.hashCode()));
        result = ((result* 31)+((this.actionInd == null)? 0 :this.actionInd.hashCode()));
        result = ((result* 31)+((this.routStatusDateTime == null)? 0 :this.routStatusDateTime.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.levelNo == null)? 0 :this.levelNo.hashCode()));
        result = ((result* 31)+((this.alvlCode == null)? 0 :this.alvlCode.hashCode()));
        result = ((result* 31)+((this.recipientUserIdName == null)? 0 :this.recipientUserIdName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Norrout__1) == false) {
            return false;
        }
        Norrout__1 rhs = ((Norrout__1) other);
        return (((((((((this.recipientUserId == rhs.recipientUserId)||((this.recipientUserId!= null)&&this.recipientUserId.equals(rhs.recipientUserId)))&&((this.queueStatusInd == rhs.queueStatusInd)||((this.queueStatusInd!= null)&&this.queueStatusInd.equals(rhs.queueStatusInd))))&&((this.actionInd == rhs.actionInd)||((this.actionInd!= null)&&this.actionInd.equals(rhs.actionInd))))&&((this.routStatusDateTime == rhs.routStatusDateTime)||((this.routStatusDateTime!= null)&&this.routStatusDateTime.equals(rhs.routStatusDateTime))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.levelNo == rhs.levelNo)||((this.levelNo!= null)&&this.levelNo.equals(rhs.levelNo))))&&((this.alvlCode == rhs.alvlCode)||((this.alvlCode!= null)&&this.alvlCode.equals(rhs.alvlCode))))&&((this.recipientUserIdName == rhs.recipientUserIdName)||((this.recipientUserIdName!= null)&&this.recipientUserIdName.equals(rhs.recipientUserIdName))));
    }

}
