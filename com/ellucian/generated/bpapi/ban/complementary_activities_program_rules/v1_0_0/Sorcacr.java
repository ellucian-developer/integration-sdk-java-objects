
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
    "accgCode",
    "reqHrsCategory",
    "stvaccgDesc",
    "userId",
    "reqCreditsCategory"
})
@Generated("jsonschema2pojo")
public class Sorcacr {

    /**
     * Lineage reference object : SORCACR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SORCACR_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Lineage reference object : SORCACR_ACCG_CODE
     * (Required)
     * 
     */
    @JsonProperty("accgCode")
    @JsonPropertyDescription("Lineage reference object : SORCACR_ACCG_CODE")
    private String accgCode;
    /**
     * Lineage reference object : SORCACR_REQ_HOURS_CATEGORY
     * 
     */
    @JsonProperty("reqHrsCategory")
    @JsonPropertyDescription("Lineage reference object : SORCACR_REQ_HOURS_CATEGORY")
    private Double reqHrsCategory;
    @JsonProperty("stvaccgDesc")
    private String stvaccgDesc;
    /**
     * Lineage reference object : SORCACR_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SORCACR_USER_ID")
    private String userId;
    /**
     * Lineage reference object : SORCACR_REQ_CREDITS_CATEGORY
     * 
     */
    @JsonProperty("reqCreditsCategory")
    @JsonPropertyDescription("Lineage reference object : SORCACR_REQ_CREDITS_CATEGORY")
    private Double reqCreditsCategory;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : SORCACR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SORCACR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sorcacr withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Lineage reference object : SORCACR_ACCG_CODE
     * (Required)
     * 
     */
    @JsonProperty("accgCode")
    public String getAccgCode() {
        return accgCode;
    }

    /**
     * Lineage reference object : SORCACR_ACCG_CODE
     * (Required)
     * 
     */
    @JsonProperty("accgCode")
    public void setAccgCode(String accgCode) {
        this.accgCode = accgCode;
    }

    public Sorcacr withAccgCode(String accgCode) {
        this.accgCode = accgCode;
        return this;
    }

    /**
     * Lineage reference object : SORCACR_REQ_HOURS_CATEGORY
     * 
     */
    @JsonProperty("reqHrsCategory")
    public Double getReqHrsCategory() {
        return reqHrsCategory;
    }

    /**
     * Lineage reference object : SORCACR_REQ_HOURS_CATEGORY
     * 
     */
    @JsonProperty("reqHrsCategory")
    public void setReqHrsCategory(Double reqHrsCategory) {
        this.reqHrsCategory = reqHrsCategory;
    }

    public Sorcacr withReqHrsCategory(Double reqHrsCategory) {
        this.reqHrsCategory = reqHrsCategory;
        return this;
    }

    @JsonProperty("stvaccgDesc")
    public String getStvaccgDesc() {
        return stvaccgDesc;
    }

    @JsonProperty("stvaccgDesc")
    public void setStvaccgDesc(String stvaccgDesc) {
        this.stvaccgDesc = stvaccgDesc;
    }

    public Sorcacr withStvaccgDesc(String stvaccgDesc) {
        this.stvaccgDesc = stvaccgDesc;
        return this;
    }

    /**
     * Lineage reference object : SORCACR_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SORCACR_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Sorcacr withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Lineage reference object : SORCACR_REQ_CREDITS_CATEGORY
     * 
     */
    @JsonProperty("reqCreditsCategory")
    public Double getReqCreditsCategory() {
        return reqCreditsCategory;
    }

    /**
     * Lineage reference object : SORCACR_REQ_CREDITS_CATEGORY
     * 
     */
    @JsonProperty("reqCreditsCategory")
    public void setReqCreditsCategory(Double reqCreditsCategory) {
        this.reqCreditsCategory = reqCreditsCategory;
    }

    public Sorcacr withReqCreditsCategory(Double reqCreditsCategory) {
        this.reqCreditsCategory = reqCreditsCategory;
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

    public Sorcacr withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sorcacr.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("accgCode");
        sb.append('=');
        sb.append(((this.accgCode == null)?"<null>":this.accgCode));
        sb.append(',');
        sb.append("reqHrsCategory");
        sb.append('=');
        sb.append(((this.reqHrsCategory == null)?"<null>":this.reqHrsCategory));
        sb.append(',');
        sb.append("stvaccgDesc");
        sb.append('=');
        sb.append(((this.stvaccgDesc == null)?"<null>":this.stvaccgDesc));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("reqCreditsCategory");
        sb.append('=');
        sb.append(((this.reqCreditsCategory == null)?"<null>":this.reqCreditsCategory));
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
        result = ((result* 31)+((this.accgCode == null)? 0 :this.accgCode.hashCode()));
        result = ((result* 31)+((this.reqHrsCategory == null)? 0 :this.reqHrsCategory.hashCode()));
        result = ((result* 31)+((this.stvaccgDesc == null)? 0 :this.stvaccgDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.reqCreditsCategory == null)? 0 :this.reqCreditsCategory.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sorcacr) == false) {
            return false;
        }
        Sorcacr rhs = ((Sorcacr) other);
        return ((((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.accgCode == rhs.accgCode)||((this.accgCode!= null)&&this.accgCode.equals(rhs.accgCode))))&&((this.reqHrsCategory == rhs.reqHrsCategory)||((this.reqHrsCategory!= null)&&this.reqHrsCategory.equals(rhs.reqHrsCategory))))&&((this.stvaccgDesc == rhs.stvaccgDesc)||((this.stvaccgDesc!= null)&&this.stvaccgDesc.equals(rhs.stvaccgDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.reqCreditsCategory == rhs.reqCreditsCategory)||((this.reqCreditsCategory!= null)&&this.reqCreditsCategory.equals(rhs.reqCreditsCategory))));
    }

}
