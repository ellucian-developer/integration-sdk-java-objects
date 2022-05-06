
package com.ellucian.generated.bpapi.ban.additional_student_information_cohort_copy.v1_0_0;

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
    "sgastdnId",
    "sgastdnTermCodeEff"
})
@Generated("jsonschema2pojo")
public class AdditionalStudentInformationCohortCopy100PostRequest {

    /**
     * ID
     * <p>
     * Lineage reference object : sgastdnId
     * 
     */
    @JsonProperty("sgastdnId")
    @JsonPropertyDescription("Lineage reference object : sgastdnId")
    private Object sgastdnId;
    /**
     * Term
     * <p>
     * Lineage reference object : sgastdnTermCodeEff, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sgastdnTermCodeEff")
    @JsonPropertyDescription("Lineage reference object : sgastdnTermCodeEff, Lookup lineage reference object : stvterm")
    private Object sgastdnTermCodeEff;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * ID
     * <p>
     * Lineage reference object : sgastdnId
     * 
     */
    @JsonProperty("sgastdnId")
    public Object getSgastdnId() {
        return sgastdnId;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : sgastdnId
     * 
     */
    @JsonProperty("sgastdnId")
    public void setSgastdnId(Object sgastdnId) {
        this.sgastdnId = sgastdnId;
    }

    public AdditionalStudentInformationCohortCopy100PostRequest withSgastdnId(Object sgastdnId) {
        this.sgastdnId = sgastdnId;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : sgastdnTermCodeEff, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sgastdnTermCodeEff")
    public Object getSgastdnTermCodeEff() {
        return sgastdnTermCodeEff;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : sgastdnTermCodeEff, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sgastdnTermCodeEff")
    public void setSgastdnTermCodeEff(Object sgastdnTermCodeEff) {
        this.sgastdnTermCodeEff = sgastdnTermCodeEff;
    }

    public AdditionalStudentInformationCohortCopy100PostRequest withSgastdnTermCodeEff(Object sgastdnTermCodeEff) {
        this.sgastdnTermCodeEff = sgastdnTermCodeEff;
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

    public AdditionalStudentInformationCohortCopy100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdditionalStudentInformationCohortCopy100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sgastdnId");
        sb.append('=');
        sb.append(((this.sgastdnId == null)?"<null>":this.sgastdnId));
        sb.append(',');
        sb.append("sgastdnTermCodeEff");
        sb.append('=');
        sb.append(((this.sgastdnTermCodeEff == null)?"<null>":this.sgastdnTermCodeEff));
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
        result = ((result* 31)+((this.sgastdnId == null)? 0 :this.sgastdnId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sgastdnTermCodeEff == null)? 0 :this.sgastdnTermCodeEff.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdditionalStudentInformationCohortCopy100PostRequest) == false) {
            return false;
        }
        AdditionalStudentInformationCohortCopy100PostRequest rhs = ((AdditionalStudentInformationCohortCopy100PostRequest) other);
        return ((((this.sgastdnId == rhs.sgastdnId)||((this.sgastdnId!= null)&&this.sgastdnId.equals(rhs.sgastdnId)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sgastdnTermCodeEff == rhs.sgastdnTermCodeEff)||((this.sgastdnTermCodeEff!= null)&&this.sgastdnTermCodeEff.equals(rhs.sgastdnTermCodeEff))));
    }

}
