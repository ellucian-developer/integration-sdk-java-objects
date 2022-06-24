
package com.ellucian.generated.bpapi.ban.admissions_decision_processing.v1_0_0;

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
    "keyblocTermCode",
    "apdcDate",
    "id",
    "criteria.apdcCode"
})
@Generated("jsonschema2pojo")
public class AdmissionsDecisionProcessing100PutRequest {

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    @JsonPropertyDescription("Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm")
    private String keyblocTermCode;
    /**
     * Decision Date
     * <p>
     * Lineage reference object : SARAPPD_APDC_DATE
     * (Required)
     * 
     */
    @JsonProperty("apdcDate")
    @JsonPropertyDescription("Lineage reference object : SARAPPD_APDC_DATE")
    private Date apdcDate;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private String id;
    /**
     * Decision Code
     * <p>
     * Lineage reference object : SARAPPD_APDC_CODE, Lookup lineage reference object : stvapdc
     * (Required)
     * 
     */
    @JsonProperty("criteria.apdcCode")
    @JsonPropertyDescription("Lineage reference object : SARAPPD_APDC_CODE, Lookup lineage reference object : stvapdc")
    private String criteriaApdcCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    public String getKeyblocTermCode() {
        return keyblocTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    public void setKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
    }

    public AdmissionsDecisionProcessing100PutRequest withKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
        return this;
    }

    /**
     * Decision Date
     * <p>
     * Lineage reference object : SARAPPD_APDC_DATE
     * (Required)
     * 
     */
    @JsonProperty("apdcDate")
    public Date getApdcDate() {
        return apdcDate;
    }

    /**
     * Decision Date
     * <p>
     * Lineage reference object : SARAPPD_APDC_DATE
     * (Required)
     * 
     */
    @JsonProperty("apdcDate")
    public void setApdcDate(Date apdcDate) {
        this.apdcDate = apdcDate;
    }

    public AdmissionsDecisionProcessing100PutRequest withApdcDate(Date apdcDate) {
        this.apdcDate = apdcDate;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public AdmissionsDecisionProcessing100PutRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Decision Code
     * <p>
     * Lineage reference object : SARAPPD_APDC_CODE, Lookup lineage reference object : stvapdc
     * (Required)
     * 
     */
    @JsonProperty("criteria.apdcCode")
    public String getCriteriaApdcCode() {
        return criteriaApdcCode;
    }

    /**
     * Decision Code
     * <p>
     * Lineage reference object : SARAPPD_APDC_CODE, Lookup lineage reference object : stvapdc
     * (Required)
     * 
     */
    @JsonProperty("criteria.apdcCode")
    public void setCriteriaApdcCode(String criteriaApdcCode) {
        this.criteriaApdcCode = criteriaApdcCode;
    }

    public AdmissionsDecisionProcessing100PutRequest withCriteriaApdcCode(String criteriaApdcCode) {
        this.criteriaApdcCode = criteriaApdcCode;
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

    public AdmissionsDecisionProcessing100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdmissionsDecisionProcessing100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblocTermCode");
        sb.append('=');
        sb.append(((this.keyblocTermCode == null)?"<null>":this.keyblocTermCode));
        sb.append(',');
        sb.append("apdcDate");
        sb.append('=');
        sb.append(((this.apdcDate == null)?"<null>":this.apdcDate));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("criteriaApdcCode");
        sb.append('=');
        sb.append(((this.criteriaApdcCode == null)?"<null>":this.criteriaApdcCode));
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
        result = ((result* 31)+((this.apdcDate == null)? 0 :this.apdcDate.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaApdcCode == null)? 0 :this.criteriaApdcCode.hashCode()));
        result = ((result* 31)+((this.keyblocTermCode == null)? 0 :this.keyblocTermCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdmissionsDecisionProcessing100PutRequest) == false) {
            return false;
        }
        AdmissionsDecisionProcessing100PutRequest rhs = ((AdmissionsDecisionProcessing100PutRequest) other);
        return ((((((this.apdcDate == rhs.apdcDate)||((this.apdcDate!= null)&&this.apdcDate.equals(rhs.apdcDate)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaApdcCode == rhs.criteriaApdcCode)||((this.criteriaApdcCode!= null)&&this.criteriaApdcCode.equals(rhs.criteriaApdcCode))))&&((this.keyblocTermCode == rhs.keyblocTermCode)||((this.keyblocTermCode!= null)&&this.keyblocTermCode.equals(rhs.keyblocTermCode))));
    }

}
