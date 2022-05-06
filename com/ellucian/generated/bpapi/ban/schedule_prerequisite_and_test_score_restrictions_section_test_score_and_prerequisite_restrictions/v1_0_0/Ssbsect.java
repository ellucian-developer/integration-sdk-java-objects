
package com.ellucian.generated.bpapi.ban.schedule_prerequisite_and_test_score_restrictions_section_test_score_and_prerequisite_restrictions.v1_0_0;

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
    "prereqChkMethodCde",
    "subjCode",
    "title"
})
@Generated("jsonschema2pojo")
public class Ssbsect {

    /**
     * Course Number
     * <p>
     * Lineage reference object : SSBSECT_CRSE_NUMB
     * 
     */
    @JsonProperty("crseNumb")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_CRSE_NUMB")
    private String crseNumb;
    /**
     * Lineage reference object : SSBSECT_PREREQ_CHK_METHOD_CDE
     * 
     */
    @JsonProperty("prereqChkMethodCde")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_PREREQ_CHK_METHOD_CDE")
    private String prereqChkMethodCde;
    /**
     * Subject
     * <p>
     * Lineage reference object : SSBSECT_SUBJ_CODE
     * 
     */
    @JsonProperty("subjCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_SUBJ_CODE")
    private String subjCode;
    /**
     * Section Title
     * <p>
     * 
     * 
     */
    @JsonProperty("title")
    private String title;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Course Number
     * <p>
     * Lineage reference object : SSBSECT_CRSE_NUMB
     * 
     */
    @JsonProperty("crseNumb")
    public String getCrseNumb() {
        return crseNumb;
    }

    /**
     * Course Number
     * <p>
     * Lineage reference object : SSBSECT_CRSE_NUMB
     * 
     */
    @JsonProperty("crseNumb")
    public void setCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
    }

    public Ssbsect withCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
        return this;
    }

    /**
     * Lineage reference object : SSBSECT_PREREQ_CHK_METHOD_CDE
     * 
     */
    @JsonProperty("prereqChkMethodCde")
    public String getPrereqChkMethodCde() {
        return prereqChkMethodCde;
    }

    /**
     * Lineage reference object : SSBSECT_PREREQ_CHK_METHOD_CDE
     * 
     */
    @JsonProperty("prereqChkMethodCde")
    public void setPrereqChkMethodCde(String prereqChkMethodCde) {
        this.prereqChkMethodCde = prereqChkMethodCde;
    }

    public Ssbsect withPrereqChkMethodCde(String prereqChkMethodCde) {
        this.prereqChkMethodCde = prereqChkMethodCde;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SSBSECT_SUBJ_CODE
     * 
     */
    @JsonProperty("subjCode")
    public String getSubjCode() {
        return subjCode;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SSBSECT_SUBJ_CODE
     * 
     */
    @JsonProperty("subjCode")
    public void setSubjCode(String subjCode) {
        this.subjCode = subjCode;
    }

    public Ssbsect withSubjCode(String subjCode) {
        this.subjCode = subjCode;
        return this;
    }

    /**
     * Section Title
     * <p>
     * 
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Section Title
     * <p>
     * 
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Ssbsect withTitle(String title) {
        this.title = title;
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

    public Ssbsect withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ssbsect.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("crseNumb");
        sb.append('=');
        sb.append(((this.crseNumb == null)?"<null>":this.crseNumb));
        sb.append(',');
        sb.append("prereqChkMethodCde");
        sb.append('=');
        sb.append(((this.prereqChkMethodCde == null)?"<null>":this.prereqChkMethodCde));
        sb.append(',');
        sb.append("subjCode");
        sb.append('=');
        sb.append(((this.subjCode == null)?"<null>":this.subjCode));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
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
        result = ((result* 31)+((this.prereqChkMethodCde == null)? 0 :this.prereqChkMethodCde.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.subjCode == null)? 0 :this.subjCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ssbsect) == false) {
            return false;
        }
        Ssbsect rhs = ((Ssbsect) other);
        return ((((((this.crseNumb == rhs.crseNumb)||((this.crseNumb!= null)&&this.crseNumb.equals(rhs.crseNumb)))&&((this.prereqChkMethodCde == rhs.prereqChkMethodCde)||((this.prereqChkMethodCde!= null)&&this.prereqChkMethodCde.equals(rhs.prereqChkMethodCde))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.subjCode == rhs.subjCode)||((this.subjCode!= null)&&this.subjCode.equals(rhs.subjCode))));
    }

}
