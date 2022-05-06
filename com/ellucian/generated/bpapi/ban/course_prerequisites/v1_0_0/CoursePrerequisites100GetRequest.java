
package com.ellucian.generated.bpapi.ban.course_prerequisites.v1_0_0;

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
    "tescCode",
    "crseNumb",
    "termCodeEff",
    "subjCode"
})
@Generated("jsonschema2pojo")
public class CoursePrerequisites100GetRequest {

    /**
     * Test Code
     * <p>
     * Lineage reference object : SCRRTST_TESC_CODE, Lookup lineage reference object : stvtesc
     * 
     */
    @JsonProperty("tescCode")
    @JsonPropertyDescription("Lineage reference object : SCRRTST_TESC_CODE, Lookup lineage reference object : stvtesc")
    private String tescCode;
    /**
     * Course
     * <p>
     * Lineage reference object : scapreqCrseNumb, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("crseNumb")
    @JsonPropertyDescription("Lineage reference object : scapreqCrseNumb, Lookup lineage reference object : scbcrse,scbcrky")
    private Object crseNumb;
    /**
     * Term
     * <p>
     * Lineage reference object : scapreqTermCodeEff, Lookup lineage reference object : stvterm,scbcrky,scbcrky
     * 
     */
    @JsonProperty("termCodeEff")
    @JsonPropertyDescription("Lineage reference object : scapreqTermCodeEff, Lookup lineage reference object : stvterm,scbcrky,scbcrky")
    private Object termCodeEff;
    /**
     * Subject
     * <p>
     * Lineage reference object : scapreqSubjCode, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCode")
    @JsonPropertyDescription("Lineage reference object : scapreqSubjCode, Lookup lineage reference object : stvsubj")
    private Object subjCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Test Code
     * <p>
     * Lineage reference object : SCRRTST_TESC_CODE, Lookup lineage reference object : stvtesc
     * 
     */
    @JsonProperty("tescCode")
    public String getTescCode() {
        return tescCode;
    }

    /**
     * Test Code
     * <p>
     * Lineage reference object : SCRRTST_TESC_CODE, Lookup lineage reference object : stvtesc
     * 
     */
    @JsonProperty("tescCode")
    public void setTescCode(String tescCode) {
        this.tescCode = tescCode;
    }

    public CoursePrerequisites100GetRequest withTescCode(String tescCode) {
        this.tescCode = tescCode;
        return this;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : scapreqCrseNumb, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("crseNumb")
    public Object getCrseNumb() {
        return crseNumb;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : scapreqCrseNumb, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("crseNumb")
    public void setCrseNumb(Object crseNumb) {
        this.crseNumb = crseNumb;
    }

    public CoursePrerequisites100GetRequest withCrseNumb(Object crseNumb) {
        this.crseNumb = crseNumb;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : scapreqTermCodeEff, Lookup lineage reference object : stvterm,scbcrky,scbcrky
     * 
     */
    @JsonProperty("termCodeEff")
    public Object getTermCodeEff() {
        return termCodeEff;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : scapreqTermCodeEff, Lookup lineage reference object : stvterm,scbcrky,scbcrky
     * 
     */
    @JsonProperty("termCodeEff")
    public void setTermCodeEff(Object termCodeEff) {
        this.termCodeEff = termCodeEff;
    }

    public CoursePrerequisites100GetRequest withTermCodeEff(Object termCodeEff) {
        this.termCodeEff = termCodeEff;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : scapreqSubjCode, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCode")
    public Object getSubjCode() {
        return subjCode;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : scapreqSubjCode, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCode")
    public void setSubjCode(Object subjCode) {
        this.subjCode = subjCode;
    }

    public CoursePrerequisites100GetRequest withSubjCode(Object subjCode) {
        this.subjCode = subjCode;
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

    public CoursePrerequisites100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CoursePrerequisites100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tescCode");
        sb.append('=');
        sb.append(((this.tescCode == null)?"<null>":this.tescCode));
        sb.append(',');
        sb.append("crseNumb");
        sb.append('=');
        sb.append(((this.crseNumb == null)?"<null>":this.crseNumb));
        sb.append(',');
        sb.append("termCodeEff");
        sb.append('=');
        sb.append(((this.termCodeEff == null)?"<null>":this.termCodeEff));
        sb.append(',');
        sb.append("subjCode");
        sb.append('=');
        sb.append(((this.subjCode == null)?"<null>":this.subjCode));
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
        result = ((result* 31)+((this.tescCode == null)? 0 :this.tescCode.hashCode()));
        result = ((result* 31)+((this.crseNumb == null)? 0 :this.crseNumb.hashCode()));
        result = ((result* 31)+((this.termCodeEff == null)? 0 :this.termCodeEff.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.subjCode == null)? 0 :this.subjCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CoursePrerequisites100GetRequest) == false) {
            return false;
        }
        CoursePrerequisites100GetRequest rhs = ((CoursePrerequisites100GetRequest) other);
        return ((((((this.tescCode == rhs.tescCode)||((this.tescCode!= null)&&this.tescCode.equals(rhs.tescCode)))&&((this.crseNumb == rhs.crseNumb)||((this.crseNumb!= null)&&this.crseNumb.equals(rhs.crseNumb))))&&((this.termCodeEff == rhs.termCodeEff)||((this.termCodeEff!= null)&&this.termCodeEff.equals(rhs.termCodeEff))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.subjCode == rhs.subjCode)||((this.subjCode!= null)&&this.subjCode.equals(rhs.subjCode))));
    }

}
