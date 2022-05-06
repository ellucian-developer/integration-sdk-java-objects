
package com.ellucian.generated.bpapi.ban.prior_college_majors_minors_concentrations.v1_0_0;

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
    "majrCodeConc",
    "id",
    "userId",
    "majrCodeMajor",
    "majrCodeMinor"
})
@Generated("jsonschema2pojo")
public class PriorCollegeMajorsMinorsConcentrations100GetRequest {

    /**
     * Concentrations
     * <p>
     * Lineage reference object : SORCONC_MAJR_CODE_CONC, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCodeConc")
    @JsonPropertyDescription("Lineage reference object : SORCONC_MAJR_CODE_CONC, Lookup lineage reference object : stvmajr")
    private String majrCodeConc;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
    /**
     * User ID
     * <p>
     * Lineage reference object : SORMAJR_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SORMAJR_USER_ID")
    private String userId;
    /**
     * Majors
     * <p>
     * Lineage reference object : SORMAJR_MAJR_CODE_MAJOR, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCodeMajor")
    @JsonPropertyDescription("Lineage reference object : SORMAJR_MAJR_CODE_MAJOR, Lookup lineage reference object : stvmajr")
    private String majrCodeMajor;
    /**
     * Minors
     * <p>
     * Lineage reference object : SORMINR_MAJR_CODE_MINOR, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCodeMinor")
    @JsonPropertyDescription("Lineage reference object : SORMINR_MAJR_CODE_MINOR, Lookup lineage reference object : stvmajr")
    private String majrCodeMinor;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Concentrations
     * <p>
     * Lineage reference object : SORCONC_MAJR_CODE_CONC, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCodeConc")
    public String getMajrCodeConc() {
        return majrCodeConc;
    }

    /**
     * Concentrations
     * <p>
     * Lineage reference object : SORCONC_MAJR_CODE_CONC, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCodeConc")
    public void setMajrCodeConc(String majrCodeConc) {
        this.majrCodeConc = majrCodeConc;
    }

    public PriorCollegeMajorsMinorsConcentrations100GetRequest withMajrCodeConc(String majrCodeConc) {
        this.majrCodeConc = majrCodeConc;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public PriorCollegeMajorsMinorsConcentrations100GetRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SORMAJR_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SORMAJR_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public PriorCollegeMajorsMinorsConcentrations100GetRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Majors
     * <p>
     * Lineage reference object : SORMAJR_MAJR_CODE_MAJOR, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCodeMajor")
    public String getMajrCodeMajor() {
        return majrCodeMajor;
    }

    /**
     * Majors
     * <p>
     * Lineage reference object : SORMAJR_MAJR_CODE_MAJOR, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCodeMajor")
    public void setMajrCodeMajor(String majrCodeMajor) {
        this.majrCodeMajor = majrCodeMajor;
    }

    public PriorCollegeMajorsMinorsConcentrations100GetRequest withMajrCodeMajor(String majrCodeMajor) {
        this.majrCodeMajor = majrCodeMajor;
        return this;
    }

    /**
     * Minors
     * <p>
     * Lineage reference object : SORMINR_MAJR_CODE_MINOR, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCodeMinor")
    public String getMajrCodeMinor() {
        return majrCodeMinor;
    }

    /**
     * Minors
     * <p>
     * Lineage reference object : SORMINR_MAJR_CODE_MINOR, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCodeMinor")
    public void setMajrCodeMinor(String majrCodeMinor) {
        this.majrCodeMinor = majrCodeMinor;
    }

    public PriorCollegeMajorsMinorsConcentrations100GetRequest withMajrCodeMinor(String majrCodeMinor) {
        this.majrCodeMinor = majrCodeMinor;
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

    public PriorCollegeMajorsMinorsConcentrations100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PriorCollegeMajorsMinorsConcentrations100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("majrCodeConc");
        sb.append('=');
        sb.append(((this.majrCodeConc == null)?"<null>":this.majrCodeConc));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("majrCodeMajor");
        sb.append('=');
        sb.append(((this.majrCodeMajor == null)?"<null>":this.majrCodeMajor));
        sb.append(',');
        sb.append("majrCodeMinor");
        sb.append('=');
        sb.append(((this.majrCodeMinor == null)?"<null>":this.majrCodeMinor));
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
        result = ((result* 31)+((this.majrCodeConc == null)? 0 :this.majrCodeConc.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.majrCodeMajor == null)? 0 :this.majrCodeMajor.hashCode()));
        result = ((result* 31)+((this.majrCodeMinor == null)? 0 :this.majrCodeMinor.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PriorCollegeMajorsMinorsConcentrations100GetRequest) == false) {
            return false;
        }
        PriorCollegeMajorsMinorsConcentrations100GetRequest rhs = ((PriorCollegeMajorsMinorsConcentrations100GetRequest) other);
        return (((((((this.majrCodeConc == rhs.majrCodeConc)||((this.majrCodeConc!= null)&&this.majrCodeConc.equals(rhs.majrCodeConc)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.majrCodeMajor == rhs.majrCodeMajor)||((this.majrCodeMajor!= null)&&this.majrCodeMajor.equals(rhs.majrCodeMajor))))&&((this.majrCodeMinor == rhs.majrCodeMinor)||((this.majrCodeMinor!= null)&&this.majrCodeMinor.equals(rhs.majrCodeMinor))));
    }

}
