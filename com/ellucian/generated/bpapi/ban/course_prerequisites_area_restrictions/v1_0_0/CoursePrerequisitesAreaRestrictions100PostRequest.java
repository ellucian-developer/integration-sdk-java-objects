
package com.ellucian.generated.bpapi.ban.course_prerequisites_area_restrictions.v1_0_0;

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
    "crseNumb",
    "termCodeEff",
    "scrrareArea",
    "subjCode"
})
@Generated("jsonschema2pojo")
public class CoursePrerequisitesAreaRestrictions100PostRequest {

    /**
     * Course
     * <p>
     * Lineage reference object : scapreqCrseNumb, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("crseNumb")
    @JsonPropertyDescription("Lineage reference object : scapreqCrseNumb, Lookup lineage reference object : scbcrse,scbcrky")
    private String crseNumb;
    /**
     * Term
     * <p>
     * Lineage reference object : scapreqTermCodeEff, Lookup lineage reference object : stvterm,scbcrky,scbcrky
     * 
     */
    @JsonProperty("termCodeEff")
    @JsonPropertyDescription("Lineage reference object : scapreqTermCodeEff, Lookup lineage reference object : stvterm,scbcrky,scbcrky")
    private String termCodeEff;
    /**
     * Area
     * <p>
     * Lineage reference object : SCRRARE_AREA
     * 
     */
    @JsonProperty("scrrareArea")
    @JsonPropertyDescription("Lineage reference object : SCRRARE_AREA")
    private String scrrareArea;
    /**
     * Subject
     * <p>
     * Lineage reference object : scapreqSubjCode, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCode")
    @JsonPropertyDescription("Lineage reference object : scapreqSubjCode, Lookup lineage reference object : stvsubj")
    private String subjCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Course
     * <p>
     * Lineage reference object : scapreqCrseNumb, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("crseNumb")
    public String getCrseNumb() {
        return crseNumb;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : scapreqCrseNumb, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("crseNumb")
    public void setCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
    }

    public CoursePrerequisitesAreaRestrictions100PostRequest withCrseNumb(String crseNumb) {
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
    public String getTermCodeEff() {
        return termCodeEff;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : scapreqTermCodeEff, Lookup lineage reference object : stvterm,scbcrky,scbcrky
     * 
     */
    @JsonProperty("termCodeEff")
    public void setTermCodeEff(String termCodeEff) {
        this.termCodeEff = termCodeEff;
    }

    public CoursePrerequisitesAreaRestrictions100PostRequest withTermCodeEff(String termCodeEff) {
        this.termCodeEff = termCodeEff;
        return this;
    }

    /**
     * Area
     * <p>
     * Lineage reference object : SCRRARE_AREA
     * 
     */
    @JsonProperty("scrrareArea")
    public String getScrrareArea() {
        return scrrareArea;
    }

    /**
     * Area
     * <p>
     * Lineage reference object : SCRRARE_AREA
     * 
     */
    @JsonProperty("scrrareArea")
    public void setScrrareArea(String scrrareArea) {
        this.scrrareArea = scrrareArea;
    }

    public CoursePrerequisitesAreaRestrictions100PostRequest withScrrareArea(String scrrareArea) {
        this.scrrareArea = scrrareArea;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : scapreqSubjCode, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCode")
    public String getSubjCode() {
        return subjCode;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : scapreqSubjCode, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCode")
    public void setSubjCode(String subjCode) {
        this.subjCode = subjCode;
    }

    public CoursePrerequisitesAreaRestrictions100PostRequest withSubjCode(String subjCode) {
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

    public CoursePrerequisitesAreaRestrictions100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CoursePrerequisitesAreaRestrictions100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("crseNumb");
        sb.append('=');
        sb.append(((this.crseNumb == null)?"<null>":this.crseNumb));
        sb.append(',');
        sb.append("termCodeEff");
        sb.append('=');
        sb.append(((this.termCodeEff == null)?"<null>":this.termCodeEff));
        sb.append(',');
        sb.append("scrrareArea");
        sb.append('=');
        sb.append(((this.scrrareArea == null)?"<null>":this.scrrareArea));
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
        result = ((result* 31)+((this.crseNumb == null)? 0 :this.crseNumb.hashCode()));
        result = ((result* 31)+((this.termCodeEff == null)? 0 :this.termCodeEff.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.scrrareArea == null)? 0 :this.scrrareArea.hashCode()));
        result = ((result* 31)+((this.subjCode == null)? 0 :this.subjCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CoursePrerequisitesAreaRestrictions100PostRequest) == false) {
            return false;
        }
        CoursePrerequisitesAreaRestrictions100PostRequest rhs = ((CoursePrerequisitesAreaRestrictions100PostRequest) other);
        return ((((((this.crseNumb == rhs.crseNumb)||((this.crseNumb!= null)&&this.crseNumb.equals(rhs.crseNumb)))&&((this.termCodeEff == rhs.termCodeEff)||((this.termCodeEff!= null)&&this.termCodeEff.equals(rhs.termCodeEff))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.scrrareArea == rhs.scrrareArea)||((this.scrrareArea!= null)&&this.scrrareArea.equals(rhs.scrrareArea))))&&((this.subjCode == rhs.subjCode)||((this.subjCode!= null)&&this.subjCode.equals(rhs.subjCode))));
    }

}
