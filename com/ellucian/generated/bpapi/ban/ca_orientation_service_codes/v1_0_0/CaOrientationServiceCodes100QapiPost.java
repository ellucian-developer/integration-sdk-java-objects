
package com.ellucian.generated.bpapi.ban.ca_orientation_service_codes.v1_0_0;

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
    "code",
    "desc",
    "initOrientInd",
    "noncreditServiceInd",
    "userId"
})
@Generated("jsonschema2pojo")
public class CaOrientationServiceCodes100QapiPost {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SVVOSST_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SVVOSST_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Code
     * <p>
     * Lineage reference object : SVVOSST_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : SVVOSST_CODE")
    private String code;
    /**
     * Description
     * <p>
     * Lineage reference object : SVVOSST_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : SVVOSST_DESC")
    private String desc;
    /**
     * Lineage reference object : SVVOSST_INIT_ORIENT_IND
     * 
     */
    @JsonProperty("initOrientInd")
    @JsonPropertyDescription("Lineage reference object : SVVOSST_INIT_ORIENT_IND")
    private String initOrientInd;
    /**
     * Lineage reference object : SVVOSST_NONCREDIT_SERVICE_IND
     * 
     */
    @JsonProperty("noncreditServiceInd")
    @JsonPropertyDescription("Lineage reference object : SVVOSST_NONCREDIT_SERVICE_IND")
    private String noncreditServiceInd;
    /**
     * User ID
     * <p>
     * Lineage reference object : SVVOSST_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SVVOSST_USER_ID")
    private String userId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SVVOSST_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SVVOSST_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public CaOrientationServiceCodes100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : SVVOSST_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : SVVOSST_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public CaOrientationServiceCodes100QapiPost withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : SVVOSST_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : SVVOSST_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public CaOrientationServiceCodes100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Lineage reference object : SVVOSST_INIT_ORIENT_IND
     * 
     */
    @JsonProperty("initOrientInd")
    public String getInitOrientInd() {
        return initOrientInd;
    }

    /**
     * Lineage reference object : SVVOSST_INIT_ORIENT_IND
     * 
     */
    @JsonProperty("initOrientInd")
    public void setInitOrientInd(String initOrientInd) {
        this.initOrientInd = initOrientInd;
    }

    public CaOrientationServiceCodes100QapiPost withInitOrientInd(String initOrientInd) {
        this.initOrientInd = initOrientInd;
        return this;
    }

    /**
     * Lineage reference object : SVVOSST_NONCREDIT_SERVICE_IND
     * 
     */
    @JsonProperty("noncreditServiceInd")
    public String getNoncreditServiceInd() {
        return noncreditServiceInd;
    }

    /**
     * Lineage reference object : SVVOSST_NONCREDIT_SERVICE_IND
     * 
     */
    @JsonProperty("noncreditServiceInd")
    public void setNoncreditServiceInd(String noncreditServiceInd) {
        this.noncreditServiceInd = noncreditServiceInd;
    }

    public CaOrientationServiceCodes100QapiPost withNoncreditServiceInd(String noncreditServiceInd) {
        this.noncreditServiceInd = noncreditServiceInd;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SVVOSST_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SVVOSST_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public CaOrientationServiceCodes100QapiPost withUserId(String userId) {
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

    public CaOrientationServiceCodes100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CaOrientationServiceCodes100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("initOrientInd");
        sb.append('=');
        sb.append(((this.initOrientInd == null)?"<null>":this.initOrientInd));
        sb.append(',');
        sb.append("noncreditServiceInd");
        sb.append('=');
        sb.append(((this.noncreditServiceInd == null)?"<null>":this.noncreditServiceInd));
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
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.noncreditServiceInd == null)? 0 :this.noncreditServiceInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.initOrientInd == null)? 0 :this.initOrientInd.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CaOrientationServiceCodes100QapiPost) == false) {
            return false;
        }
        CaOrientationServiceCodes100QapiPost rhs = ((CaOrientationServiceCodes100QapiPost) other);
        return ((((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.noncreditServiceInd == rhs.noncreditServiceInd)||((this.noncreditServiceInd!= null)&&this.noncreditServiceInd.equals(rhs.noncreditServiceInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.initOrientInd == rhs.initOrientInd)||((this.initOrientInd!= null)&&this.initOrientInd.equals(rhs.initOrientInd))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}