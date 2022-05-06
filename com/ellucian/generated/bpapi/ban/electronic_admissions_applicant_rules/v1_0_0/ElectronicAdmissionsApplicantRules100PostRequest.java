
package com.ellucian.generated.bpapi.ban.electronic_admissions_applicant_rules.v1_0_0;

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
    "systemReqInd",
    "function",
    "keyblckEgrpCode",
    "value",
    "desc"
})
@Generated("jsonschema2pojo")
public class ElectronicAdmissionsApplicantRules100PostRequest {

    /**
     * Lineage reference object : SARERUL_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("systemReqInd")
    @JsonPropertyDescription("Lineage reference object : SARERUL_SYSTEM_REQ_IND")
    private String systemReqInd;
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
    private Object keyblckEgrpCode;
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

    public ElectronicAdmissionsApplicantRules100PostRequest withSystemReqInd(String systemReqInd) {
        this.systemReqInd = systemReqInd;
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

    public ElectronicAdmissionsApplicantRules100PostRequest withFunction(String function) {
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
    public Object getKeyblckEgrpCode() {
        return keyblckEgrpCode;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : keyblckEgrpCode, Lookup lineage reference object : stvegrp
     * 
     */
    @JsonProperty("keyblckEgrpCode")
    public void setKeyblckEgrpCode(Object keyblckEgrpCode) {
        this.keyblckEgrpCode = keyblckEgrpCode;
    }

    public ElectronicAdmissionsApplicantRules100PostRequest withKeyblckEgrpCode(Object keyblckEgrpCode) {
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

    public ElectronicAdmissionsApplicantRules100PostRequest withValue(String value) {
        this.value = value;
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

    public ElectronicAdmissionsApplicantRules100PostRequest withDesc(String desc) {
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

    public ElectronicAdmissionsApplicantRules100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ElectronicAdmissionsApplicantRules100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("systemReqInd");
        sb.append('=');
        sb.append(((this.systemReqInd == null)?"<null>":this.systemReqInd));
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
        result = ((result* 31)+((this.systemReqInd == null)? 0 :this.systemReqInd.hashCode()));
        result = ((result* 31)+((this.function == null)? 0 :this.function.hashCode()));
        result = ((result* 31)+((this.keyblckEgrpCode == null)? 0 :this.keyblckEgrpCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ElectronicAdmissionsApplicantRules100PostRequest) == false) {
            return false;
        }
        ElectronicAdmissionsApplicantRules100PostRequest rhs = ((ElectronicAdmissionsApplicantRules100PostRequest) other);
        return (((((((this.systemReqInd == rhs.systemReqInd)||((this.systemReqInd!= null)&&this.systemReqInd.equals(rhs.systemReqInd)))&&((this.function == rhs.function)||((this.function!= null)&&this.function.equals(rhs.function))))&&((this.keyblckEgrpCode == rhs.keyblckEgrpCode)||((this.keyblckEgrpCode!= null)&&this.keyblckEgrpCode.equals(rhs.keyblckEgrpCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
