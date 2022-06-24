
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
    "criteria.activityDate",
    "systemReqInd",
    "criteria.systemReqInd",
    "criteria.function",
    "criteria.desc",
    "criteria.value",
    "criteria.ediInd",
    "criteria.egrpCode",
    "function",
    "keyblckEgrpCode",
    "value",
    "ediInd",
    "desc"
})
@Generated("jsonschema2pojo")
public class ElectronicAdmissionsApplicantRules100PutRequest {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SARERUL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : SARERUL_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * Lineage reference object : SARERUL_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("systemReqInd")
    @JsonPropertyDescription("Lineage reference object : SARERUL_SYSTEM_REQ_IND")
    private String systemReqInd;
    /**
     * Lineage reference object : SARERUL_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("criteria.systemReqInd")
    @JsonPropertyDescription("Lineage reference object : SARERUL_SYSTEM_REQ_IND")
    private String criteriaSystemReqInd;
    /**
     * Rule Label
     * <p>
     * Lineage reference object : SARERUL_FUNCTION
     * 
     */
    @JsonProperty("criteria.function")
    @JsonPropertyDescription("Lineage reference object : SARERUL_FUNCTION")
    private String criteriaFunction;
    /**
     * Rule Description
     * <p>
     * Lineage reference object : SARERUL_DESC
     * 
     */
    @JsonProperty("criteria.desc")
    @JsonPropertyDescription("Lineage reference object : SARERUL_DESC")
    private String criteriaDesc;
    /**
     * Value
     * <p>
     * Lineage reference object : SARERUL_VALUE
     * 
     */
    @JsonProperty("criteria.value")
    @JsonPropertyDescription("Lineage reference object : SARERUL_VALUE")
    private String criteriaValue;
    /**
     * Lineage reference object : SARERUL_EDI_IND
     * 
     */
    @JsonProperty("criteria.ediInd")
    @JsonPropertyDescription("Lineage reference object : SARERUL_EDI_IND")
    private String criteriaEdiInd;
    /**
     * Group
     * <p>
     * Lineage reference object : SARERUL_EGRP_CODE
     * 
     */
    @JsonProperty("criteria.egrpCode")
    @JsonPropertyDescription("Lineage reference object : SARERUL_EGRP_CODE")
    private String criteriaEgrpCode;
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
     * Group
     * <p>
     * Lineage reference object : keyblckEgrpCode, Lookup lineage reference object : stvegrp
     * 
     */
    @JsonProperty("keyblckEgrpCode")
    @JsonPropertyDescription("Lineage reference object : keyblckEgrpCode, Lookup lineage reference object : stvegrp")
    private String keyblckEgrpCode;
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
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SARERUL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public ElectronicAdmissionsApplicantRules100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
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

    public ElectronicAdmissionsApplicantRules100PutRequest withSystemReqInd(String systemReqInd) {
        this.systemReqInd = systemReqInd;
        return this;
    }

    /**
     * Lineage reference object : SARERUL_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("criteria.systemReqInd")
    public String getCriteriaSystemReqInd() {
        return criteriaSystemReqInd;
    }

    /**
     * Lineage reference object : SARERUL_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("criteria.systemReqInd")
    public void setCriteriaSystemReqInd(String criteriaSystemReqInd) {
        this.criteriaSystemReqInd = criteriaSystemReqInd;
    }

    public ElectronicAdmissionsApplicantRules100PutRequest withCriteriaSystemReqInd(String criteriaSystemReqInd) {
        this.criteriaSystemReqInd = criteriaSystemReqInd;
        return this;
    }

    /**
     * Rule Label
     * <p>
     * Lineage reference object : SARERUL_FUNCTION
     * 
     */
    @JsonProperty("criteria.function")
    public String getCriteriaFunction() {
        return criteriaFunction;
    }

    /**
     * Rule Label
     * <p>
     * Lineage reference object : SARERUL_FUNCTION
     * 
     */
    @JsonProperty("criteria.function")
    public void setCriteriaFunction(String criteriaFunction) {
        this.criteriaFunction = criteriaFunction;
    }

    public ElectronicAdmissionsApplicantRules100PutRequest withCriteriaFunction(String criteriaFunction) {
        this.criteriaFunction = criteriaFunction;
        return this;
    }

    /**
     * Rule Description
     * <p>
     * Lineage reference object : SARERUL_DESC
     * 
     */
    @JsonProperty("criteria.desc")
    public String getCriteriaDesc() {
        return criteriaDesc;
    }

    /**
     * Rule Description
     * <p>
     * Lineage reference object : SARERUL_DESC
     * 
     */
    @JsonProperty("criteria.desc")
    public void setCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
    }

    public ElectronicAdmissionsApplicantRules100PutRequest withCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
        return this;
    }

    /**
     * Value
     * <p>
     * Lineage reference object : SARERUL_VALUE
     * 
     */
    @JsonProperty("criteria.value")
    public String getCriteriaValue() {
        return criteriaValue;
    }

    /**
     * Value
     * <p>
     * Lineage reference object : SARERUL_VALUE
     * 
     */
    @JsonProperty("criteria.value")
    public void setCriteriaValue(String criteriaValue) {
        this.criteriaValue = criteriaValue;
    }

    public ElectronicAdmissionsApplicantRules100PutRequest withCriteriaValue(String criteriaValue) {
        this.criteriaValue = criteriaValue;
        return this;
    }

    /**
     * Lineage reference object : SARERUL_EDI_IND
     * 
     */
    @JsonProperty("criteria.ediInd")
    public String getCriteriaEdiInd() {
        return criteriaEdiInd;
    }

    /**
     * Lineage reference object : SARERUL_EDI_IND
     * 
     */
    @JsonProperty("criteria.ediInd")
    public void setCriteriaEdiInd(String criteriaEdiInd) {
        this.criteriaEdiInd = criteriaEdiInd;
    }

    public ElectronicAdmissionsApplicantRules100PutRequest withCriteriaEdiInd(String criteriaEdiInd) {
        this.criteriaEdiInd = criteriaEdiInd;
        return this;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : SARERUL_EGRP_CODE
     * 
     */
    @JsonProperty("criteria.egrpCode")
    public String getCriteriaEgrpCode() {
        return criteriaEgrpCode;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : SARERUL_EGRP_CODE
     * 
     */
    @JsonProperty("criteria.egrpCode")
    public void setCriteriaEgrpCode(String criteriaEgrpCode) {
        this.criteriaEgrpCode = criteriaEgrpCode;
    }

    public ElectronicAdmissionsApplicantRules100PutRequest withCriteriaEgrpCode(String criteriaEgrpCode) {
        this.criteriaEgrpCode = criteriaEgrpCode;
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

    public ElectronicAdmissionsApplicantRules100PutRequest withFunction(String function) {
        this.function = function;
        return this;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : keyblckEgrpCode, Lookup lineage reference object : stvegrp
     * 
     */
    @JsonProperty("keyblckEgrpCode")
    public String getKeyblckEgrpCode() {
        return keyblckEgrpCode;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : keyblckEgrpCode, Lookup lineage reference object : stvegrp
     * 
     */
    @JsonProperty("keyblckEgrpCode")
    public void setKeyblckEgrpCode(String keyblckEgrpCode) {
        this.keyblckEgrpCode = keyblckEgrpCode;
    }

    public ElectronicAdmissionsApplicantRules100PutRequest withKeyblckEgrpCode(String keyblckEgrpCode) {
        this.keyblckEgrpCode = keyblckEgrpCode;
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

    public ElectronicAdmissionsApplicantRules100PutRequest withValue(String value) {
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

    public ElectronicAdmissionsApplicantRules100PutRequest withEdiInd(String ediInd) {
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

    public ElectronicAdmissionsApplicantRules100PutRequest withDesc(String desc) {
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

    public ElectronicAdmissionsApplicantRules100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ElectronicAdmissionsApplicantRules100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("systemReqInd");
        sb.append('=');
        sb.append(((this.systemReqInd == null)?"<null>":this.systemReqInd));
        sb.append(',');
        sb.append("criteriaSystemReqInd");
        sb.append('=');
        sb.append(((this.criteriaSystemReqInd == null)?"<null>":this.criteriaSystemReqInd));
        sb.append(',');
        sb.append("criteriaFunction");
        sb.append('=');
        sb.append(((this.criteriaFunction == null)?"<null>":this.criteriaFunction));
        sb.append(',');
        sb.append("criteriaDesc");
        sb.append('=');
        sb.append(((this.criteriaDesc == null)?"<null>":this.criteriaDesc));
        sb.append(',');
        sb.append("criteriaValue");
        sb.append('=');
        sb.append(((this.criteriaValue == null)?"<null>":this.criteriaValue));
        sb.append(',');
        sb.append("criteriaEdiInd");
        sb.append('=');
        sb.append(((this.criteriaEdiInd == null)?"<null>":this.criteriaEdiInd));
        sb.append(',');
        sb.append("criteriaEgrpCode");
        sb.append('=');
        sb.append(((this.criteriaEgrpCode == null)?"<null>":this.criteriaEgrpCode));
        sb.append(',');
        sb.append("function");
        sb.append('=');
        sb.append(((this.function == null)?"<null>":this.function));
        sb.append(',');
        sb.append("keyblckEgrpCode");
        sb.append('=');
        sb.append(((this.keyblckEgrpCode == null)?"<null>":this.keyblckEgrpCode));
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
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.criteriaEdiInd == null)? 0 :this.criteriaEdiInd.hashCode()));
        result = ((result* 31)+((this.systemReqInd == null)? 0 :this.systemReqInd.hashCode()));
        result = ((result* 31)+((this.criteriaSystemReqInd == null)? 0 :this.criteriaSystemReqInd.hashCode()));
        result = ((result* 31)+((this.criteriaValue == null)? 0 :this.criteriaValue.hashCode()));
        result = ((result* 31)+((this.criteriaFunction == null)? 0 :this.criteriaFunction.hashCode()));
        result = ((result* 31)+((this.function == null)? 0 :this.function.hashCode()));
        result = ((result* 31)+((this.criteriaEgrpCode == null)? 0 :this.criteriaEgrpCode.hashCode()));
        result = ((result* 31)+((this.keyblckEgrpCode == null)? 0 :this.keyblckEgrpCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaDesc == null)? 0 :this.criteriaDesc.hashCode()));
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
        if ((other instanceof ElectronicAdmissionsApplicantRules100PutRequest) == false) {
            return false;
        }
        ElectronicAdmissionsApplicantRules100PutRequest rhs = ((ElectronicAdmissionsApplicantRules100PutRequest) other);
        return (((((((((((((((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate)))&&((this.criteriaEdiInd == rhs.criteriaEdiInd)||((this.criteriaEdiInd!= null)&&this.criteriaEdiInd.equals(rhs.criteriaEdiInd))))&&((this.systemReqInd == rhs.systemReqInd)||((this.systemReqInd!= null)&&this.systemReqInd.equals(rhs.systemReqInd))))&&((this.criteriaSystemReqInd == rhs.criteriaSystemReqInd)||((this.criteriaSystemReqInd!= null)&&this.criteriaSystemReqInd.equals(rhs.criteriaSystemReqInd))))&&((this.criteriaValue == rhs.criteriaValue)||((this.criteriaValue!= null)&&this.criteriaValue.equals(rhs.criteriaValue))))&&((this.criteriaFunction == rhs.criteriaFunction)||((this.criteriaFunction!= null)&&this.criteriaFunction.equals(rhs.criteriaFunction))))&&((this.function == rhs.function)||((this.function!= null)&&this.function.equals(rhs.function))))&&((this.criteriaEgrpCode == rhs.criteriaEgrpCode)||((this.criteriaEgrpCode!= null)&&this.criteriaEgrpCode.equals(rhs.criteriaEgrpCode))))&&((this.keyblckEgrpCode == rhs.keyblckEgrpCode)||((this.keyblckEgrpCode!= null)&&this.keyblckEgrpCode.equals(rhs.keyblckEgrpCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaDesc == rhs.criteriaDesc)||((this.criteriaDesc!= null)&&this.criteriaDesc.equals(rhs.criteriaDesc))))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))))&&((this.ediInd == rhs.ediInd)||((this.ediInd!= null)&&this.ediInd.equals(rhs.ediInd))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
