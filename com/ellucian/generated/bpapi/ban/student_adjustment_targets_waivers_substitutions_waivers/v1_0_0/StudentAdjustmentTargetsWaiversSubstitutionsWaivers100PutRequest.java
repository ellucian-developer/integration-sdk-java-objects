
package com.ellucian.generated.bpapi.ban.student_adjustment_targets_waivers_substitutions_waivers.v1_0_0;

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
    "area",
    "criteria.program",
    "criteria.actnCode",
    "attrCode",
    "criteria.crseNumb",
    "subjCode",
    "keyblckTermCode",
    "criteria.subjCode",
    "program",
    "crseNumb",
    "actnCode",
    "credits",
    "criteria.attrCode",
    "criteria.group",
    "criteria.area",
    "id",
    "criteria.credits",
    "group"
})
@Generated("jsonschema2pojo")
public class StudentAdjustmentTargetsWaiversSubstitutionsWaivers100PutRequest {

    /**
     * Smrswav Area
     * <p>
     * Lineage reference object : SMRSWAV_AREA
     * 
     */
    @JsonProperty("area")
    @JsonPropertyDescription("Lineage reference object : SMRSWAV_AREA")
    private String area;
    /**
     * Program
     * <p>
     * Lineage reference object : SMRSWPV_PROGRAM
     * 
     */
    @JsonProperty("criteria.program")
    @JsonPropertyDescription("Lineage reference object : SMRSWPV_PROGRAM")
    private String criteriaProgram;
    /**
     * Smrswav Actn Code
     * <p>
     * Lineage reference object : SMRSWAV_ACTN_CODE, Lookup lineage reference object : stvactn
     * 
     */
    @JsonProperty("criteria.actnCode")
    @JsonPropertyDescription("Lineage reference object : SMRSWAV_ACTN_CODE, Lookup lineage reference object : stvactn")
    private String criteriaActnCode;
    /**
     * Smrswav Attr Code
     * <p>
     * Lineage reference object : SMRSWAV_ATTR_CODE, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("attrCode")
    @JsonPropertyDescription("Lineage reference object : SMRSWAV_ATTR_CODE, Lookup lineage reference object : stvattr")
    private String attrCode;
    /**
     * Smrswav Crse Numb
     * <p>
     * Lineage reference object : SMRSWAV_CRSE_NUMB
     * (Required)
     * 
     */
    @JsonProperty("criteria.crseNumb")
    @JsonPropertyDescription("Lineage reference object : SMRSWAV_CRSE_NUMB")
    private String criteriaCrseNumb;
    /**
     * Smrswav Subj Code
     * <p>
     * Lineage reference object : SMRSWAV_SUBJ_CODE, Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("subjCode")
    @JsonPropertyDescription("Lineage reference object : SMRSWAV_SUBJ_CODE, Lookup lineage reference object : stvsubj")
    private String subjCode;
    /**
     * Term
     * <p>
     * Lineage reference object : keyblckTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblckTermCode")
    @JsonPropertyDescription("Lineage reference object : keyblckTermCode, Lookup lineage reference object : stvterm")
    private Object keyblckTermCode;
    /**
     * Smrswav Subj Code
     * <p>
     * Lineage reference object : SMRSWAV_SUBJ_CODE, Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("criteria.subjCode")
    @JsonPropertyDescription("Lineage reference object : SMRSWAV_SUBJ_CODE, Lookup lineage reference object : stvsubj")
    private String criteriaSubjCode;
    /**
     * Program
     * <p>
     * Lineage reference object : SMRSWPV_PROGRAM
     * 
     */
    @JsonProperty("program")
    @JsonPropertyDescription("Lineage reference object : SMRSWPV_PROGRAM")
    private String program;
    /**
     * Smrswav Crse Numb
     * <p>
     * Lineage reference object : SMRSWAV_CRSE_NUMB
     * (Required)
     * 
     */
    @JsonProperty("crseNumb")
    @JsonPropertyDescription("Lineage reference object : SMRSWAV_CRSE_NUMB")
    private String crseNumb;
    /**
     * Smrswav Actn Code
     * <p>
     * Lineage reference object : SMRSWAV_ACTN_CODE, Lookup lineage reference object : stvactn
     * 
     */
    @JsonProperty("actnCode")
    @JsonPropertyDescription("Lineage reference object : SMRSWAV_ACTN_CODE, Lookup lineage reference object : stvactn")
    private String actnCode;
    /**
     * Smrswav Credits
     * <p>
     * Lineage reference object : SMRSWAV_CREDITS
     * 
     */
    @JsonProperty("credits")
    @JsonPropertyDescription("Lineage reference object : SMRSWAV_CREDITS")
    private Double credits;
    /**
     * Smrswav Attr Code
     * <p>
     * Lineage reference object : SMRSWAV_ATTR_CODE, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("criteria.attrCode")
    @JsonPropertyDescription("Lineage reference object : SMRSWAV_ATTR_CODE, Lookup lineage reference object : stvattr")
    private String criteriaAttrCode;
    /**
     * Smrswav Group
     * <p>
     * Lineage reference object : SMRSWAV_GROUP
     * 
     */
    @JsonProperty("criteria.group")
    @JsonPropertyDescription("Lineage reference object : SMRSWAV_GROUP")
    private String criteriaGroup;
    /**
     * Smrswav Area
     * <p>
     * Lineage reference object : SMRSWAV_AREA
     * 
     */
    @JsonProperty("criteria.area")
    @JsonPropertyDescription("Lineage reference object : SMRSWAV_AREA")
    private String criteriaArea;
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
     * Smrswav Credits
     * <p>
     * Lineage reference object : SMRSWAV_CREDITS
     * 
     */
    @JsonProperty("criteria.credits")
    @JsonPropertyDescription("Lineage reference object : SMRSWAV_CREDITS")
    private Double criteriaCredits;
    /**
     * Smrswav Group
     * <p>
     * Lineage reference object : SMRSWAV_GROUP
     * 
     */
    @JsonProperty("group")
    @JsonPropertyDescription("Lineage reference object : SMRSWAV_GROUP")
    private String group;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Smrswav Area
     * <p>
     * Lineage reference object : SMRSWAV_AREA
     * 
     */
    @JsonProperty("area")
    public String getArea() {
        return area;
    }

    /**
     * Smrswav Area
     * <p>
     * Lineage reference object : SMRSWAV_AREA
     * 
     */
    @JsonProperty("area")
    public void setArea(String area) {
        this.area = area;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsWaivers100PutRequest withArea(String area) {
        this.area = area;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SMRSWPV_PROGRAM
     * 
     */
    @JsonProperty("criteria.program")
    public String getCriteriaProgram() {
        return criteriaProgram;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SMRSWPV_PROGRAM
     * 
     */
    @JsonProperty("criteria.program")
    public void setCriteriaProgram(String criteriaProgram) {
        this.criteriaProgram = criteriaProgram;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsWaivers100PutRequest withCriteriaProgram(String criteriaProgram) {
        this.criteriaProgram = criteriaProgram;
        return this;
    }

    /**
     * Smrswav Actn Code
     * <p>
     * Lineage reference object : SMRSWAV_ACTN_CODE, Lookup lineage reference object : stvactn
     * 
     */
    @JsonProperty("criteria.actnCode")
    public String getCriteriaActnCode() {
        return criteriaActnCode;
    }

    /**
     * Smrswav Actn Code
     * <p>
     * Lineage reference object : SMRSWAV_ACTN_CODE, Lookup lineage reference object : stvactn
     * 
     */
    @JsonProperty("criteria.actnCode")
    public void setCriteriaActnCode(String criteriaActnCode) {
        this.criteriaActnCode = criteriaActnCode;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsWaivers100PutRequest withCriteriaActnCode(String criteriaActnCode) {
        this.criteriaActnCode = criteriaActnCode;
        return this;
    }

    /**
     * Smrswav Attr Code
     * <p>
     * Lineage reference object : SMRSWAV_ATTR_CODE, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("attrCode")
    public String getAttrCode() {
        return attrCode;
    }

    /**
     * Smrswav Attr Code
     * <p>
     * Lineage reference object : SMRSWAV_ATTR_CODE, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("attrCode")
    public void setAttrCode(String attrCode) {
        this.attrCode = attrCode;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsWaivers100PutRequest withAttrCode(String attrCode) {
        this.attrCode = attrCode;
        return this;
    }

    /**
     * Smrswav Crse Numb
     * <p>
     * Lineage reference object : SMRSWAV_CRSE_NUMB
     * (Required)
     * 
     */
    @JsonProperty("criteria.crseNumb")
    public String getCriteriaCrseNumb() {
        return criteriaCrseNumb;
    }

    /**
     * Smrswav Crse Numb
     * <p>
     * Lineage reference object : SMRSWAV_CRSE_NUMB
     * (Required)
     * 
     */
    @JsonProperty("criteria.crseNumb")
    public void setCriteriaCrseNumb(String criteriaCrseNumb) {
        this.criteriaCrseNumb = criteriaCrseNumb;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsWaivers100PutRequest withCriteriaCrseNumb(String criteriaCrseNumb) {
        this.criteriaCrseNumb = criteriaCrseNumb;
        return this;
    }

    /**
     * Smrswav Subj Code
     * <p>
     * Lineage reference object : SMRSWAV_SUBJ_CODE, Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("subjCode")
    public String getSubjCode() {
        return subjCode;
    }

    /**
     * Smrswav Subj Code
     * <p>
     * Lineage reference object : SMRSWAV_SUBJ_CODE, Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("subjCode")
    public void setSubjCode(String subjCode) {
        this.subjCode = subjCode;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsWaivers100PutRequest withSubjCode(String subjCode) {
        this.subjCode = subjCode;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblckTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblckTermCode")
    public Object getKeyblckTermCode() {
        return keyblckTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblckTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblckTermCode")
    public void setKeyblckTermCode(Object keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsWaivers100PutRequest withKeyblckTermCode(Object keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
        return this;
    }

    /**
     * Smrswav Subj Code
     * <p>
     * Lineage reference object : SMRSWAV_SUBJ_CODE, Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("criteria.subjCode")
    public String getCriteriaSubjCode() {
        return criteriaSubjCode;
    }

    /**
     * Smrswav Subj Code
     * <p>
     * Lineage reference object : SMRSWAV_SUBJ_CODE, Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("criteria.subjCode")
    public void setCriteriaSubjCode(String criteriaSubjCode) {
        this.criteriaSubjCode = criteriaSubjCode;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsWaivers100PutRequest withCriteriaSubjCode(String criteriaSubjCode) {
        this.criteriaSubjCode = criteriaSubjCode;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SMRSWPV_PROGRAM
     * 
     */
    @JsonProperty("program")
    public String getProgram() {
        return program;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SMRSWPV_PROGRAM
     * 
     */
    @JsonProperty("program")
    public void setProgram(String program) {
        this.program = program;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsWaivers100PutRequest withProgram(String program) {
        this.program = program;
        return this;
    }

    /**
     * Smrswav Crse Numb
     * <p>
     * Lineage reference object : SMRSWAV_CRSE_NUMB
     * (Required)
     * 
     */
    @JsonProperty("crseNumb")
    public String getCrseNumb() {
        return crseNumb;
    }

    /**
     * Smrswav Crse Numb
     * <p>
     * Lineage reference object : SMRSWAV_CRSE_NUMB
     * (Required)
     * 
     */
    @JsonProperty("crseNumb")
    public void setCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsWaivers100PutRequest withCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
        return this;
    }

    /**
     * Smrswav Actn Code
     * <p>
     * Lineage reference object : SMRSWAV_ACTN_CODE, Lookup lineage reference object : stvactn
     * 
     */
    @JsonProperty("actnCode")
    public String getActnCode() {
        return actnCode;
    }

    /**
     * Smrswav Actn Code
     * <p>
     * Lineage reference object : SMRSWAV_ACTN_CODE, Lookup lineage reference object : stvactn
     * 
     */
    @JsonProperty("actnCode")
    public void setActnCode(String actnCode) {
        this.actnCode = actnCode;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsWaivers100PutRequest withActnCode(String actnCode) {
        this.actnCode = actnCode;
        return this;
    }

    /**
     * Smrswav Credits
     * <p>
     * Lineage reference object : SMRSWAV_CREDITS
     * 
     */
    @JsonProperty("credits")
    public Double getCredits() {
        return credits;
    }

    /**
     * Smrswav Credits
     * <p>
     * Lineage reference object : SMRSWAV_CREDITS
     * 
     */
    @JsonProperty("credits")
    public void setCredits(Double credits) {
        this.credits = credits;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsWaivers100PutRequest withCredits(Double credits) {
        this.credits = credits;
        return this;
    }

    /**
     * Smrswav Attr Code
     * <p>
     * Lineage reference object : SMRSWAV_ATTR_CODE, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("criteria.attrCode")
    public String getCriteriaAttrCode() {
        return criteriaAttrCode;
    }

    /**
     * Smrswav Attr Code
     * <p>
     * Lineage reference object : SMRSWAV_ATTR_CODE, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("criteria.attrCode")
    public void setCriteriaAttrCode(String criteriaAttrCode) {
        this.criteriaAttrCode = criteriaAttrCode;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsWaivers100PutRequest withCriteriaAttrCode(String criteriaAttrCode) {
        this.criteriaAttrCode = criteriaAttrCode;
        return this;
    }

    /**
     * Smrswav Group
     * <p>
     * Lineage reference object : SMRSWAV_GROUP
     * 
     */
    @JsonProperty("criteria.group")
    public String getCriteriaGroup() {
        return criteriaGroup;
    }

    /**
     * Smrswav Group
     * <p>
     * Lineage reference object : SMRSWAV_GROUP
     * 
     */
    @JsonProperty("criteria.group")
    public void setCriteriaGroup(String criteriaGroup) {
        this.criteriaGroup = criteriaGroup;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsWaivers100PutRequest withCriteriaGroup(String criteriaGroup) {
        this.criteriaGroup = criteriaGroup;
        return this;
    }

    /**
     * Smrswav Area
     * <p>
     * Lineage reference object : SMRSWAV_AREA
     * 
     */
    @JsonProperty("criteria.area")
    public String getCriteriaArea() {
        return criteriaArea;
    }

    /**
     * Smrswav Area
     * <p>
     * Lineage reference object : SMRSWAV_AREA
     * 
     */
    @JsonProperty("criteria.area")
    public void setCriteriaArea(String criteriaArea) {
        this.criteriaArea = criteriaArea;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsWaivers100PutRequest withCriteriaArea(String criteriaArea) {
        this.criteriaArea = criteriaArea;
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

    public StudentAdjustmentTargetsWaiversSubstitutionsWaivers100PutRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Smrswav Credits
     * <p>
     * Lineage reference object : SMRSWAV_CREDITS
     * 
     */
    @JsonProperty("criteria.credits")
    public Double getCriteriaCredits() {
        return criteriaCredits;
    }

    /**
     * Smrswav Credits
     * <p>
     * Lineage reference object : SMRSWAV_CREDITS
     * 
     */
    @JsonProperty("criteria.credits")
    public void setCriteriaCredits(Double criteriaCredits) {
        this.criteriaCredits = criteriaCredits;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsWaivers100PutRequest withCriteriaCredits(Double criteriaCredits) {
        this.criteriaCredits = criteriaCredits;
        return this;
    }

    /**
     * Smrswav Group
     * <p>
     * Lineage reference object : SMRSWAV_GROUP
     * 
     */
    @JsonProperty("group")
    public String getGroup() {
        return group;
    }

    /**
     * Smrswav Group
     * <p>
     * Lineage reference object : SMRSWAV_GROUP
     * 
     */
    @JsonProperty("group")
    public void setGroup(String group) {
        this.group = group;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsWaivers100PutRequest withGroup(String group) {
        this.group = group;
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

    public StudentAdjustmentTargetsWaiversSubstitutionsWaivers100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentAdjustmentTargetsWaiversSubstitutionsWaivers100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("area");
        sb.append('=');
        sb.append(((this.area == null)?"<null>":this.area));
        sb.append(',');
        sb.append("criteriaProgram");
        sb.append('=');
        sb.append(((this.criteriaProgram == null)?"<null>":this.criteriaProgram));
        sb.append(',');
        sb.append("criteriaActnCode");
        sb.append('=');
        sb.append(((this.criteriaActnCode == null)?"<null>":this.criteriaActnCode));
        sb.append(',');
        sb.append("attrCode");
        sb.append('=');
        sb.append(((this.attrCode == null)?"<null>":this.attrCode));
        sb.append(',');
        sb.append("criteriaCrseNumb");
        sb.append('=');
        sb.append(((this.criteriaCrseNumb == null)?"<null>":this.criteriaCrseNumb));
        sb.append(',');
        sb.append("subjCode");
        sb.append('=');
        sb.append(((this.subjCode == null)?"<null>":this.subjCode));
        sb.append(',');
        sb.append("keyblckTermCode");
        sb.append('=');
        sb.append(((this.keyblckTermCode == null)?"<null>":this.keyblckTermCode));
        sb.append(',');
        sb.append("criteriaSubjCode");
        sb.append('=');
        sb.append(((this.criteriaSubjCode == null)?"<null>":this.criteriaSubjCode));
        sb.append(',');
        sb.append("program");
        sb.append('=');
        sb.append(((this.program == null)?"<null>":this.program));
        sb.append(',');
        sb.append("crseNumb");
        sb.append('=');
        sb.append(((this.crseNumb == null)?"<null>":this.crseNumb));
        sb.append(',');
        sb.append("actnCode");
        sb.append('=');
        sb.append(((this.actnCode == null)?"<null>":this.actnCode));
        sb.append(',');
        sb.append("credits");
        sb.append('=');
        sb.append(((this.credits == null)?"<null>":this.credits));
        sb.append(',');
        sb.append("criteriaAttrCode");
        sb.append('=');
        sb.append(((this.criteriaAttrCode == null)?"<null>":this.criteriaAttrCode));
        sb.append(',');
        sb.append("criteriaGroup");
        sb.append('=');
        sb.append(((this.criteriaGroup == null)?"<null>":this.criteriaGroup));
        sb.append(',');
        sb.append("criteriaArea");
        sb.append('=');
        sb.append(((this.criteriaArea == null)?"<null>":this.criteriaArea));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("criteriaCredits");
        sb.append('=');
        sb.append(((this.criteriaCredits == null)?"<null>":this.criteriaCredits));
        sb.append(',');
        sb.append("group");
        sb.append('=');
        sb.append(((this.group == null)?"<null>":this.group));
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
        result = ((result* 31)+((this.area == null)? 0 :this.area.hashCode()));
        result = ((result* 31)+((this.criteriaArea == null)? 0 :this.criteriaArea.hashCode()));
        result = ((result* 31)+((this.attrCode == null)? 0 :this.attrCode.hashCode()));
        result = ((result* 31)+((this.subjCode == null)? 0 :this.subjCode.hashCode()));
        result = ((result* 31)+((this.keyblckTermCode == null)? 0 :this.keyblckTermCode.hashCode()));
        result = ((result* 31)+((this.criteriaCrseNumb == null)? 0 :this.criteriaCrseNumb.hashCode()));
        result = ((result* 31)+((this.program == null)? 0 :this.program.hashCode()));
        result = ((result* 31)+((this.criteriaActnCode == null)? 0 :this.criteriaActnCode.hashCode()));
        result = ((result* 31)+((this.criteriaSubjCode == null)? 0 :this.criteriaSubjCode.hashCode()));
        result = ((result* 31)+((this.criteriaCredits == null)? 0 :this.criteriaCredits.hashCode()));
        result = ((result* 31)+((this.criteriaProgram == null)? 0 :this.criteriaProgram.hashCode()));
        result = ((result* 31)+((this.crseNumb == null)? 0 :this.crseNumb.hashCode()));
        result = ((result* 31)+((this.actnCode == null)? 0 :this.actnCode.hashCode()));
        result = ((result* 31)+((this.criteriaGroup == null)? 0 :this.criteriaGroup.hashCode()));
        result = ((result* 31)+((this.credits == null)? 0 :this.credits.hashCode()));
        result = ((result* 31)+((this.criteriaAttrCode == null)? 0 :this.criteriaAttrCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.group == null)? 0 :this.group.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentAdjustmentTargetsWaiversSubstitutionsWaivers100PutRequest) == false) {
            return false;
        }
        StudentAdjustmentTargetsWaiversSubstitutionsWaivers100PutRequest rhs = ((StudentAdjustmentTargetsWaiversSubstitutionsWaivers100PutRequest) other);
        return ((((((((((((((((((((this.area == rhs.area)||((this.area!= null)&&this.area.equals(rhs.area)))&&((this.criteriaArea == rhs.criteriaArea)||((this.criteriaArea!= null)&&this.criteriaArea.equals(rhs.criteriaArea))))&&((this.attrCode == rhs.attrCode)||((this.attrCode!= null)&&this.attrCode.equals(rhs.attrCode))))&&((this.subjCode == rhs.subjCode)||((this.subjCode!= null)&&this.subjCode.equals(rhs.subjCode))))&&((this.keyblckTermCode == rhs.keyblckTermCode)||((this.keyblckTermCode!= null)&&this.keyblckTermCode.equals(rhs.keyblckTermCode))))&&((this.criteriaCrseNumb == rhs.criteriaCrseNumb)||((this.criteriaCrseNumb!= null)&&this.criteriaCrseNumb.equals(rhs.criteriaCrseNumb))))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.criteriaActnCode == rhs.criteriaActnCode)||((this.criteriaActnCode!= null)&&this.criteriaActnCode.equals(rhs.criteriaActnCode))))&&((this.criteriaSubjCode == rhs.criteriaSubjCode)||((this.criteriaSubjCode!= null)&&this.criteriaSubjCode.equals(rhs.criteriaSubjCode))))&&((this.criteriaCredits == rhs.criteriaCredits)||((this.criteriaCredits!= null)&&this.criteriaCredits.equals(rhs.criteriaCredits))))&&((this.criteriaProgram == rhs.criteriaProgram)||((this.criteriaProgram!= null)&&this.criteriaProgram.equals(rhs.criteriaProgram))))&&((this.crseNumb == rhs.crseNumb)||((this.crseNumb!= null)&&this.crseNumb.equals(rhs.crseNumb))))&&((this.actnCode == rhs.actnCode)||((this.actnCode!= null)&&this.actnCode.equals(rhs.actnCode))))&&((this.criteriaGroup == rhs.criteriaGroup)||((this.criteriaGroup!= null)&&this.criteriaGroup.equals(rhs.criteriaGroup))))&&((this.credits == rhs.credits)||((this.credits!= null)&&this.credits.equals(rhs.credits))))&&((this.criteriaAttrCode == rhs.criteriaAttrCode)||((this.criteriaAttrCode!= null)&&this.criteriaAttrCode.equals(rhs.criteriaAttrCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.group == rhs.group)||((this.group!= null)&&this.group.equals(rhs.group))));
    }

}
