
package com.ellucian.generated.bpapi.ban.electronic_admissions_applicant_rules.v1_0_0;

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
    "systemReqInd",
    "egrpCode",
    "function",
    "value",
    "ediInd",
    "desc"
})
@Generated("jsonschema2pojo")
public class ElectronicAdmissionsApplicantRules100PutResponse {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SARERUL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SARERUL_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Lineage reference object : SARERUL_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("systemReqInd")
    @JsonPropertyDescription("Lineage reference object : SARERUL_SYSTEM_REQ_IND")
    private String systemReqInd;
    /**
     * Group
     * <p>
     * Lineage reference object : SARERUL_EGRP_CODE
     * 
     */
    @JsonProperty("egrpCode")
    @JsonPropertyDescription("Lineage reference object : SARERUL_EGRP_CODE")
    private String egrpCode;
    /**
     * Rule Label
     * <p>
     * Lineage reference object : SARERUL_FUNCTION
     * 
     */
    @JsonProperty("function")
    @JsonPropertyDescription("Lineage reference object : SARERUL_FUNCTION")
    private String function;
    /**
     * Value
     * <p>
     * Lineage reference object : SARERUL_VALUE
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("Lineage reference object : SARERUL_VALUE")
    private String value;
    /**
     * Lineage reference object : SARERUL_EDI_IND
     * 
     */
    @JsonProperty("ediInd")
    @JsonPropertyDescription("Lineage reference object : SARERUL_EDI_IND")
    private String ediInd;
    /**
     * Rule Description
     * <p>
     * Lineage reference object : SARERUL_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : SARERUL_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SARERUL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SARERUL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public ElectronicAdmissionsApplicantRules100PutResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Lineage reference object : SARERUL_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("systemReqInd")
    public String getSystemReqInd() {
        return systemReqInd;
    }

    /**
     * Lineage reference object : SARERUL_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("systemReqInd")
    public void setSystemReqInd(String systemReqInd) {
        this.systemReqInd = systemReqInd;
    }

    public ElectronicAdmissionsApplicantRules100PutResponse withSystemReqInd(String systemReqInd) {
        this.systemReqInd = systemReqInd;
        return this;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : SARERUL_EGRP_CODE
     * 
     */
    @JsonProperty("egrpCode")
    public String getEgrpCode() {
        return egrpCode;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : SARERUL_EGRP_CODE
     * 
     */
    @JsonProperty("egrpCode")
    public void setEgrpCode(String egrpCode) {
        this.egrpCode = egrpCode;
    }

    public ElectronicAdmissionsApplicantRules100PutResponse withEgrpCode(String egrpCode) {
        this.egrpCode = egrpCode;
        return this;
    }

    /**
     * Rule Label
     * <p>
     * Lineage reference object : SARERUL_FUNCTION
     * 
     */
    @JsonProperty("function")
    public String getFunction() {
        return function;
    }

    /**
     * Rule Label
     * <p>
     * Lineage reference object : SARERUL_FUNCTION
     * 
     */
    @JsonProperty("function")
    public void setFunction(String function) {
        this.function = function;
    }

    public ElectronicAdmissionsApplicantRules100PutResponse withFunction(String function) {
        this.function = function;
        return this;
    }

    /**
     * Value
     * <p>
     * Lineage reference object : SARERUL_VALUE
     * 
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * Value
     * <p>
     * Lineage reference object : SARERUL_VALUE
     * 
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    public ElectronicAdmissionsApplicantRules100PutResponse withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Lineage reference object : SARERUL_EDI_IND
     * 
     */
    @JsonProperty("ediInd")
    public String getEdiInd() {
        return ediInd;
    }

    /**
     * Lineage reference object : SARERUL_EDI_IND
     * 
     */
    @JsonProperty("ediInd")
    public void setEdiInd(String ediInd) {
        this.ediInd = ediInd;
    }

    public ElectronicAdmissionsApplicantRules100PutResponse withEdiInd(String ediInd) {
        this.ediInd = ediInd;
        return this;
    }

    /**
     * Rule Description
     * <p>
     * Lineage reference object : SARERUL_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Rule Description
     * <p>
     * Lineage reference object : SARERUL_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ElectronicAdmissionsApplicantRules100PutResponse withDesc(String desc) {
        this.desc = desc;
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

    public ElectronicAdmissionsApplicantRules100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ElectronicAdmissionsApplicantRules100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("systemReqInd");
        sb.append('=');
        sb.append(((this.systemReqInd == null)?"<null>":this.systemReqInd));
        sb.append(',');
        sb.append("egrpCode");
        sb.append('=');
        sb.append(((this.egrpCode == null)?"<null>":this.egrpCode));
        sb.append(',');
        sb.append("function");
        sb.append('=');
        sb.append(((this.function == null)?"<null>":this.function));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
        sb.append(',');
        sb.append("ediInd");
        sb.append('=');
        sb.append(((this.ediInd == null)?"<null>":this.ediInd));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
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
        result = ((result* 31)+((this.systemReqInd == null)? 0 :this.systemReqInd.hashCode()));
        result = ((result* 31)+((this.egrpCode == null)? 0 :this.egrpCode.hashCode()));
        result = ((result* 31)+((this.function == null)? 0 :this.function.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        result = ((result* 31)+((this.ediInd == null)? 0 :this.ediInd.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ElectronicAdmissionsApplicantRules100PutResponse) == false) {
            return false;
        }
        ElectronicAdmissionsApplicantRules100PutResponse rhs = ((ElectronicAdmissionsApplicantRules100PutResponse) other);
        return (((((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.systemReqInd == rhs.systemReqInd)||((this.systemReqInd!= null)&&this.systemReqInd.equals(rhs.systemReqInd))))&&((this.egrpCode == rhs.egrpCode)||((this.egrpCode!= null)&&this.egrpCode.equals(rhs.egrpCode))))&&((this.function == rhs.function)||((this.function!= null)&&this.function.equals(rhs.function))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))))&&((this.ediInd == rhs.ediInd)||((this.ediInd!= null)&&this.ediInd.equals(rhs.ediInd))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
