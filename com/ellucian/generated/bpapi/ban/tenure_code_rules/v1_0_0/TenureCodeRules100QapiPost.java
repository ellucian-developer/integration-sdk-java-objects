
package com.ellucian.generated.bpapi.ban.tenure_code_rules.v1_0_0;

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
    "dateInd",
    "desc",
    "eeoTenureInd",
    "reviewDateInd"
})
@Generated("jsonschema2pojo")
public class TenureCodeRules100QapiPost {

    /**
     * Activity  Date
     * <p>
     * Lineage reference object : PTRTENR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : PTRTENR_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Code
     * <p>
     * Lineage reference object : PTRTENR_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : PTRTENR_CODE")
    private String code;
    /**
     * Lineage reference object : PTRTENR_DATE_IND
     * 
     */
    @JsonProperty("dateInd")
    @JsonPropertyDescription("Lineage reference object : PTRTENR_DATE_IND")
    private String dateInd;
    /**
     * Description
     * <p>
     * Lineage reference object : PTRTENR_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : PTRTENR_DESC")
    private String desc;
    /**
     * Tenure Status
     * <p>
     * Lineage reference object : PTRTENR_EEO_TENURE_IND
     * 
     */
    @JsonProperty("eeoTenureInd")
    @JsonPropertyDescription("Lineage reference object : PTRTENR_EEO_TENURE_IND")
    private String eeoTenureInd;
    /**
     * Lineage reference object : PTRTENR_REVIEW_DATE_IND
     * 
     */
    @JsonProperty("reviewDateInd")
    @JsonPropertyDescription("Lineage reference object : PTRTENR_REVIEW_DATE_IND")
    private String reviewDateInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity  Date
     * <p>
     * Lineage reference object : PTRTENR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity  Date
     * <p>
     * Lineage reference object : PTRTENR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public TenureCodeRules100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : PTRTENR_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : PTRTENR_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public TenureCodeRules100QapiPost withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Lineage reference object : PTRTENR_DATE_IND
     * 
     */
    @JsonProperty("dateInd")
    public String getDateInd() {
        return dateInd;
    }

    /**
     * Lineage reference object : PTRTENR_DATE_IND
     * 
     */
    @JsonProperty("dateInd")
    public void setDateInd(String dateInd) {
        this.dateInd = dateInd;
    }

    public TenureCodeRules100QapiPost withDateInd(String dateInd) {
        this.dateInd = dateInd;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : PTRTENR_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : PTRTENR_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public TenureCodeRules100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Tenure Status
     * <p>
     * Lineage reference object : PTRTENR_EEO_TENURE_IND
     * 
     */
    @JsonProperty("eeoTenureInd")
    public String getEeoTenureInd() {
        return eeoTenureInd;
    }

    /**
     * Tenure Status
     * <p>
     * Lineage reference object : PTRTENR_EEO_TENURE_IND
     * 
     */
    @JsonProperty("eeoTenureInd")
    public void setEeoTenureInd(String eeoTenureInd) {
        this.eeoTenureInd = eeoTenureInd;
    }

    public TenureCodeRules100QapiPost withEeoTenureInd(String eeoTenureInd) {
        this.eeoTenureInd = eeoTenureInd;
        return this;
    }

    /**
     * Lineage reference object : PTRTENR_REVIEW_DATE_IND
     * 
     */
    @JsonProperty("reviewDateInd")
    public String getReviewDateInd() {
        return reviewDateInd;
    }

    /**
     * Lineage reference object : PTRTENR_REVIEW_DATE_IND
     * 
     */
    @JsonProperty("reviewDateInd")
    public void setReviewDateInd(String reviewDateInd) {
        this.reviewDateInd = reviewDateInd;
    }

    public TenureCodeRules100QapiPost withReviewDateInd(String reviewDateInd) {
        this.reviewDateInd = reviewDateInd;
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

    public TenureCodeRules100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TenureCodeRules100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("dateInd");
        sb.append('=');
        sb.append(((this.dateInd == null)?"<null>":this.dateInd));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("eeoTenureInd");
        sb.append('=');
        sb.append(((this.eeoTenureInd == null)?"<null>":this.eeoTenureInd));
        sb.append(',');
        sb.append("reviewDateInd");
        sb.append('=');
        sb.append(((this.reviewDateInd == null)?"<null>":this.reviewDateInd));
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
        result = ((result* 31)+((this.dateInd == null)? 0 :this.dateInd.hashCode()));
        result = ((result* 31)+((this.eeoTenureInd == null)? 0 :this.eeoTenureInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.reviewDateInd == null)? 0 :this.reviewDateInd.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TenureCodeRules100QapiPost) == false) {
            return false;
        }
        TenureCodeRules100QapiPost rhs = ((TenureCodeRules100QapiPost) other);
        return ((((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.dateInd == rhs.dateInd)||((this.dateInd!= null)&&this.dateInd.equals(rhs.dateInd))))&&((this.eeoTenureInd == rhs.eeoTenureInd)||((this.eeoTenureInd!= null)&&this.eeoTenureInd.equals(rhs.eeoTenureInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.reviewDateInd == rhs.reviewDateInd)||((this.reviewDateInd!= null)&&this.reviewDateInd.equals(rhs.reviewDateInd))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
