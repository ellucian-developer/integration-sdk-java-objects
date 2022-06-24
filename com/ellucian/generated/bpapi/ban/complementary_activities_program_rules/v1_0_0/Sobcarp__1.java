
package com.ellucian.generated.bpapi.ban.complementary_activities_program_rules.v1_0_0;

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
    "activityDate",
    "reqCreditsProgram",
    "creditEquivalent",
    "reqHrsProgram",
    "userId"
})
@Generated("jsonschema2pojo")
public class Sobcarp__1 {

    /**
     * Lineage reference object : SOBCARP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SOBCARP_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Required Credits
     * <p>
     * Lineage reference object : SOBCARP_REQ_CREDITS_PROGRAM
     * 
     */
    @JsonProperty("reqCreditsProgram")
    @JsonPropertyDescription("Lineage reference object : SOBCARP_REQ_CREDITS_PROGRAM")
    private Double reqCreditsProgram;
    /**
     * Equivalent Credits
     * <p>
     * Lineage reference object : SOBCARP_CREDIT_EQUIVALENT
     * 
     */
    @JsonProperty("creditEquivalent")
    @JsonPropertyDescription("Lineage reference object : SOBCARP_CREDIT_EQUIVALENT")
    private Double creditEquivalent;
    /**
     * Lineage reference object : SOBCARP_REQ_HOURS_PROGRAM
     * 
     */
    @JsonProperty("reqHrsProgram")
    @JsonPropertyDescription("Lineage reference object : SOBCARP_REQ_HOURS_PROGRAM")
    private Double reqHrsProgram;
    /**
     * Lineage reference object : SOBCARP_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SOBCARP_USER_ID")
    private String userId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : SOBCARP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SOBCARP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sobcarp__1 withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Required Credits
     * <p>
     * Lineage reference object : SOBCARP_REQ_CREDITS_PROGRAM
     * 
     */
    @JsonProperty("reqCreditsProgram")
    public Double getReqCreditsProgram() {
        return reqCreditsProgram;
    }

    /**
     * Required Credits
     * <p>
     * Lineage reference object : SOBCARP_REQ_CREDITS_PROGRAM
     * 
     */
    @JsonProperty("reqCreditsProgram")
    public void setReqCreditsProgram(Double reqCreditsProgram) {
        this.reqCreditsProgram = reqCreditsProgram;
    }

    public Sobcarp__1 withReqCreditsProgram(Double reqCreditsProgram) {
        this.reqCreditsProgram = reqCreditsProgram;
        return this;
    }

    /**
     * Equivalent Credits
     * <p>
     * Lineage reference object : SOBCARP_CREDIT_EQUIVALENT
     * 
     */
    @JsonProperty("creditEquivalent")
    public Double getCreditEquivalent() {
        return creditEquivalent;
    }

    /**
     * Equivalent Credits
     * <p>
     * Lineage reference object : SOBCARP_CREDIT_EQUIVALENT
     * 
     */
    @JsonProperty("creditEquivalent")
    public void setCreditEquivalent(Double creditEquivalent) {
        this.creditEquivalent = creditEquivalent;
    }

    public Sobcarp__1 withCreditEquivalent(Double creditEquivalent) {
        this.creditEquivalent = creditEquivalent;
        return this;
    }

    /**
     * Lineage reference object : SOBCARP_REQ_HOURS_PROGRAM
     * 
     */
    @JsonProperty("reqHrsProgram")
    public Double getReqHrsProgram() {
        return reqHrsProgram;
    }

    /**
     * Lineage reference object : SOBCARP_REQ_HOURS_PROGRAM
     * 
     */
    @JsonProperty("reqHrsProgram")
    public void setReqHrsProgram(Double reqHrsProgram) {
        this.reqHrsProgram = reqHrsProgram;
    }

    public Sobcarp__1 withReqHrsProgram(Double reqHrsProgram) {
        this.reqHrsProgram = reqHrsProgram;
        return this;
    }

    /**
     * Lineage reference object : SOBCARP_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SOBCARP_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Sobcarp__1 withUserId(String userId) {
        this.userId = userId;
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

    public Sobcarp__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sobcarp__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("reqCreditsProgram");
        sb.append('=');
        sb.append(((this.reqCreditsProgram == null)?"<null>":this.reqCreditsProgram));
        sb.append(',');
        sb.append("creditEquivalent");
        sb.append('=');
        sb.append(((this.creditEquivalent == null)?"<null>":this.creditEquivalent));
        sb.append(',');
        sb.append("reqHrsProgram");
        sb.append('=');
        sb.append(((this.reqHrsProgram == null)?"<null>":this.reqHrsProgram));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
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
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.reqCreditsProgram == null)? 0 :this.reqCreditsProgram.hashCode()));
        result = ((result* 31)+((this.creditEquivalent == null)? 0 :this.creditEquivalent.hashCode()));
        result = ((result* 31)+((this.reqHrsProgram == null)? 0 :this.reqHrsProgram.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sobcarp__1) == false) {
            return false;
        }
        Sobcarp__1 rhs = ((Sobcarp__1) other);
        return (((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.reqCreditsProgram == rhs.reqCreditsProgram)||((this.reqCreditsProgram!= null)&&this.reqCreditsProgram.equals(rhs.reqCreditsProgram))))&&((this.creditEquivalent == rhs.creditEquivalent)||((this.creditEquivalent!= null)&&this.creditEquivalent.equals(rhs.creditEquivalent))))&&((this.reqHrsProgram == rhs.reqHrsProgram)||((this.reqHrsProgram!= null)&&this.reqHrsProgram.equals(rhs.reqHrsProgram))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))));
    }

}
