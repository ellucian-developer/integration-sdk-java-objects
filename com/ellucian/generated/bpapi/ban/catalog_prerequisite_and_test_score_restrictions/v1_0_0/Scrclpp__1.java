
package com.ellucian.generated.bpapi.ban.catalog_prerequisite_and_test_score_restrictions.v1_0_0;

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
    "inProgram",
    "subjCode",
    "subjDescription",
    "title"
})
@Generated("jsonschema2pojo")
public class Scrclpp__1 {

    /**
     * Course
     * <p>
     * Lineage reference object : SCRCLPP_CRSE_NUMB, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("crseNumb")
    @JsonPropertyDescription("Lineage reference object : SCRCLPP_CRSE_NUMB, Lookup lineage reference object : scbcrse,scbcrky")
    private String crseNumb;
    /**
     * Prerequisite Check Method
     * <p>
     * Lineage reference object : SCRCLPP_PREREQ_CHK_METHOD_CDE
     * 
     */
    @JsonProperty("prereqChkMethodCde")
    @JsonPropertyDescription("Lineage reference object : SCRCLPP_PREREQ_CHK_METHOD_CDE")
    private String prereqChkMethodCde;
    @JsonProperty("inProgram")
    private String inProgram;
    /**
     * Subject
     * <p>
     * Lineage reference object : SCRCLPP_SUBJ_CODE, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("subjCode")
    @JsonPropertyDescription("Lineage reference object : SCRCLPP_SUBJ_CODE, Lookup lineage reference object : scbcrse,scbcrky")
    private String subjCode;
    /**
     * Subject Description
     * <p>
     * 
     * 
     */
    @JsonProperty("subjDescription")
    private String subjDescription;
    /**
     * Course Title
     * <p>
     * 
     * 
     */
    @JsonProperty("title")
    private String title;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Course
     * <p>
     * Lineage reference object : SCRCLPP_CRSE_NUMB, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("crseNumb")
    public String getCrseNumb() {
        return crseNumb;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : SCRCLPP_CRSE_NUMB, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("crseNumb")
    public void setCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
    }

    public Scrclpp__1 withCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
        return this;
    }

    /**
     * Prerequisite Check Method
     * <p>
     * Lineage reference object : SCRCLPP_PREREQ_CHK_METHOD_CDE
     * 
     */
    @JsonProperty("prereqChkMethodCde")
    public String getPrereqChkMethodCde() {
        return prereqChkMethodCde;
    }

    /**
     * Prerequisite Check Method
     * <p>
     * Lineage reference object : SCRCLPP_PREREQ_CHK_METHOD_CDE
     * 
     */
    @JsonProperty("prereqChkMethodCde")
    public void setPrereqChkMethodCde(String prereqChkMethodCde) {
        this.prereqChkMethodCde = prereqChkMethodCde;
    }

    public Scrclpp__1 withPrereqChkMethodCde(String prereqChkMethodCde) {
        this.prereqChkMethodCde = prereqChkMethodCde;
        return this;
    }

    @JsonProperty("inProgram")
    public String getInProgram() {
        return inProgram;
    }

    @JsonProperty("inProgram")
    public void setInProgram(String inProgram) {
        this.inProgram = inProgram;
    }

    public Scrclpp__1 withInProgram(String inProgram) {
        this.inProgram = inProgram;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SCRCLPP_SUBJ_CODE, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("subjCode")
    public String getSubjCode() {
        return subjCode;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SCRCLPP_SUBJ_CODE, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("subjCode")
    public void setSubjCode(String subjCode) {
        this.subjCode = subjCode;
    }

    public Scrclpp__1 withSubjCode(String subjCode) {
        this.subjCode = subjCode;
        return this;
    }

    /**
     * Subject Description
     * <p>
     * 
     * 
     */
    @JsonProperty("subjDescription")
    public String getSubjDescription() {
        return subjDescription;
    }

    /**
     * Subject Description
     * <p>
     * 
     * 
     */
    @JsonProperty("subjDescription")
    public void setSubjDescription(String subjDescription) {
        this.subjDescription = subjDescription;
    }

    public Scrclpp__1 withSubjDescription(String subjDescription) {
        this.subjDescription = subjDescription;
        return this;
    }

    /**
     * Course Title
     * <p>
     * 
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Course Title
     * <p>
     * 
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Scrclpp__1 withTitle(String title) {
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

    public Scrclpp__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Scrclpp__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("crseNumb");
        sb.append('=');
        sb.append(((this.crseNumb == null)?"<null>":this.crseNumb));
        sb.append(',');
        sb.append("prereqChkMethodCde");
        sb.append('=');
        sb.append(((this.prereqChkMethodCde == null)?"<null>":this.prereqChkMethodCde));
        sb.append(',');
        sb.append("inProgram");
        sb.append('=');
        sb.append(((this.inProgram == null)?"<null>":this.inProgram));
        sb.append(',');
        sb.append("subjCode");
        sb.append('=');
        sb.append(((this.subjCode == null)?"<null>":this.subjCode));
        sb.append(',');
        sb.append("subjDescription");
        sb.append('=');
        sb.append(((this.subjDescription == null)?"<null>":this.subjDescription));
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
        result = ((result* 31)+((this.inProgram == null)? 0 :this.inProgram.hashCode()));
        result = ((result* 31)+((this.subjCode == null)? 0 :this.subjCode.hashCode()));
        result = ((result* 31)+((this.subjDescription == null)? 0 :this.subjDescription.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Scrclpp__1) == false) {
            return false;
        }
        Scrclpp__1 rhs = ((Scrclpp__1) other);
        return ((((((((this.crseNumb == rhs.crseNumb)||((this.crseNumb!= null)&&this.crseNumb.equals(rhs.crseNumb)))&&((this.prereqChkMethodCde == rhs.prereqChkMethodCde)||((this.prereqChkMethodCde!= null)&&this.prereqChkMethodCde.equals(rhs.prereqChkMethodCde))))&&((this.inProgram == rhs.inProgram)||((this.inProgram!= null)&&this.inProgram.equals(rhs.inProgram))))&&((this.subjCode == rhs.subjCode)||((this.subjCode!= null)&&this.subjCode.equals(rhs.subjCode))))&&((this.subjDescription == rhs.subjDescription)||((this.subjDescription!= null)&&this.subjDescription.equals(rhs.subjDescription))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))));
    }

}
