
package com.ellucian.generated.bpapi.ban.student_adjustment_targets_waivers_substitutions_target_courses.v1_0_0;

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
    "attrCode",
    "criteria.crseNumb",
    "subjCode",
    "keyblckTermCode",
    "criteria.subjCode",
    "program",
    "crseNumb",
    "criteria.attrCode",
    "criteria.group",
    "criteria.area",
    "id",
    "group"
})
@Generated("jsonschema2pojo")
public class StudentAdjustmentTargetsWaiversSubstitutionsTargetCourses100PutRequest {

    /**
     * Smrstrg Area
     * <p>
     * Lineage reference object : SMRSTRG_AREA
     * (Required)
     * 
     */
    @JsonProperty("area")
    @JsonPropertyDescription("Lineage reference object : SMRSTRG_AREA")
    private String area;
    /**
     * Program
     * <p>
     * Lineage reference object : SMRSTPV_PROGRAM
     * 
     */
    @JsonProperty("criteria.program")
    @JsonPropertyDescription("Lineage reference object : SMRSTPV_PROGRAM")
    private String criteriaProgram;
    /**
     * Smrstrg Attr Code
     * <p>
     * Lineage reference object : SMRSTRG_ATTR_CODE, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("attrCode")
    @JsonPropertyDescription("Lineage reference object : SMRSTRG_ATTR_CODE, Lookup lineage reference object : stvattr")
    private String attrCode;
    /**
     * Smrstrg Crse Numb
     * <p>
     * Lineage reference object : SMRSTRG_CRSE_NUMB
     * (Required)
     * 
     */
    @JsonProperty("criteria.crseNumb")
    @JsonPropertyDescription("Lineage reference object : SMRSTRG_CRSE_NUMB")
    private String criteriaCrseNumb;
    /**
     * Smrstrg Subj Code
     * <p>
     * Lineage reference object : SMRSTRG_SUBJ_CODE, Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("subjCode")
    @JsonPropertyDescription("Lineage reference object : SMRSTRG_SUBJ_CODE, Lookup lineage reference object : stvsubj")
    private String subjCode;
    /**
     * Term
     * <p>
     * Lineage reference object : keyblckTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblckTermCode")
    @JsonPropertyDescription("Lineage reference object : keyblckTermCode, Lookup lineage reference object : stvterm")
    private String keyblckTermCode;
    /**
     * Smrstrg Subj Code
     * <p>
     * Lineage reference object : SMRSTRG_SUBJ_CODE, Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("criteria.subjCode")
    @JsonPropertyDescription("Lineage reference object : SMRSTRG_SUBJ_CODE, Lookup lineage reference object : stvsubj")
    private String criteriaSubjCode;
    /**
     * Program
     * <p>
     * Lineage reference object : SMRSTPV_PROGRAM
     * 
     */
    @JsonProperty("program")
    @JsonPropertyDescription("Lineage reference object : SMRSTPV_PROGRAM")
    private String program;
    /**
     * Smrstrg Crse Numb
     * <p>
     * Lineage reference object : SMRSTRG_CRSE_NUMB
     * (Required)
     * 
     */
    @JsonProperty("crseNumb")
    @JsonPropertyDescription("Lineage reference object : SMRSTRG_CRSE_NUMB")
    private String crseNumb;
    /**
     * Smrstrg Attr Code
     * <p>
     * Lineage reference object : SMRSTRG_ATTR_CODE, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("criteria.attrCode")
    @JsonPropertyDescription("Lineage reference object : SMRSTRG_ATTR_CODE, Lookup lineage reference object : stvattr")
    private String criteriaAttrCode;
    /**
     * Smrstrg Group
     * <p>
     * Lineage reference object : SMRSTRG_GROUP
     * 
     */
    @JsonProperty("criteria.group")
    @JsonPropertyDescription("Lineage reference object : SMRSTRG_GROUP")
    private String criteriaGroup;
    /**
     * Smrstrg Area
     * <p>
     * Lineage reference object : SMRSTRG_AREA
     * (Required)
     * 
     */
    @JsonProperty("criteria.area")
    @JsonPropertyDescription("Lineage reference object : SMRSTRG_AREA")
    private String criteriaArea;
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
     * Smrstrg Group
     * <p>
     * Lineage reference object : SMRSTRG_GROUP
     * 
     */
    @JsonProperty("group")
    @JsonPropertyDescription("Lineage reference object : SMRSTRG_GROUP")
    private String group;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Smrstrg Area
     * <p>
     * Lineage reference object : SMRSTRG_AREA
     * (Required)
     * 
     */
    @JsonProperty("area")
    public String getArea() {
        return area;
    }

    /**
     * Smrstrg Area
     * <p>
     * Lineage reference object : SMRSTRG_AREA
     * (Required)
     * 
     */
    @JsonProperty("area")
    public void setArea(String area) {
        this.area = area;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsTargetCourses100PutRequest withArea(String area) {
        this.area = area;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SMRSTPV_PROGRAM
     * 
     */
    @JsonProperty("criteria.program")
    public String getCriteriaProgram() {
        return criteriaProgram;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SMRSTPV_PROGRAM
     * 
     */
    @JsonProperty("criteria.program")
    public void setCriteriaProgram(String criteriaProgram) {
        this.criteriaProgram = criteriaProgram;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsTargetCourses100PutRequest withCriteriaProgram(String criteriaProgram) {
        this.criteriaProgram = criteriaProgram;
        return this;
    }

    /**
     * Smrstrg Attr Code
     * <p>
     * Lineage reference object : SMRSTRG_ATTR_CODE, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("attrCode")
    public String getAttrCode() {
        return attrCode;
    }

    /**
     * Smrstrg Attr Code
     * <p>
     * Lineage reference object : SMRSTRG_ATTR_CODE, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("attrCode")
    public void setAttrCode(String attrCode) {
        this.attrCode = attrCode;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsTargetCourses100PutRequest withAttrCode(String attrCode) {
        this.attrCode = attrCode;
        return this;
    }

    /**
     * Smrstrg Crse Numb
     * <p>
     * Lineage reference object : SMRSTRG_CRSE_NUMB
     * (Required)
     * 
     */
    @JsonProperty("criteria.crseNumb")
    public String getCriteriaCrseNumb() {
        return criteriaCrseNumb;
    }

    /**
     * Smrstrg Crse Numb
     * <p>
     * Lineage reference object : SMRSTRG_CRSE_NUMB
     * (Required)
     * 
     */
    @JsonProperty("criteria.crseNumb")
    public void setCriteriaCrseNumb(String criteriaCrseNumb) {
        this.criteriaCrseNumb = criteriaCrseNumb;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsTargetCourses100PutRequest withCriteriaCrseNumb(String criteriaCrseNumb) {
        this.criteriaCrseNumb = criteriaCrseNumb;
        return this;
    }

    /**
     * Smrstrg Subj Code
     * <p>
     * Lineage reference object : SMRSTRG_SUBJ_CODE, Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("subjCode")
    public String getSubjCode() {
        return subjCode;
    }

    /**
     * Smrstrg Subj Code
     * <p>
     * Lineage reference object : SMRSTRG_SUBJ_CODE, Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("subjCode")
    public void setSubjCode(String subjCode) {
        this.subjCode = subjCode;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsTargetCourses100PutRequest withSubjCode(String subjCode) {
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
    public String getKeyblckTermCode() {
        return keyblckTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblckTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblckTermCode")
    public void setKeyblckTermCode(String keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsTargetCourses100PutRequest withKeyblckTermCode(String keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
        return this;
    }

    /**
     * Smrstrg Subj Code
     * <p>
     * Lineage reference object : SMRSTRG_SUBJ_CODE, Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("criteria.subjCode")
    public String getCriteriaSubjCode() {
        return criteriaSubjCode;
    }

    /**
     * Smrstrg Subj Code
     * <p>
     * Lineage reference object : SMRSTRG_SUBJ_CODE, Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("criteria.subjCode")
    public void setCriteriaSubjCode(String criteriaSubjCode) {
        this.criteriaSubjCode = criteriaSubjCode;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsTargetCourses100PutRequest withCriteriaSubjCode(String criteriaSubjCode) {
        this.criteriaSubjCode = criteriaSubjCode;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SMRSTPV_PROGRAM
     * 
     */
    @JsonProperty("program")
    public String getProgram() {
        return program;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SMRSTPV_PROGRAM
     * 
     */
    @JsonProperty("program")
    public void setProgram(String program) {
        this.program = program;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsTargetCourses100PutRequest withProgram(String program) {
        this.program = program;
        return this;
    }

    /**
     * Smrstrg Crse Numb
     * <p>
     * Lineage reference object : SMRSTRG_CRSE_NUMB
     * (Required)
     * 
     */
    @JsonProperty("crseNumb")
    public String getCrseNumb() {
        return crseNumb;
    }

    /**
     * Smrstrg Crse Numb
     * <p>
     * Lineage reference object : SMRSTRG_CRSE_NUMB
     * (Required)
     * 
     */
    @JsonProperty("crseNumb")
    public void setCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsTargetCourses100PutRequest withCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
        return this;
    }

    /**
     * Smrstrg Attr Code
     * <p>
     * Lineage reference object : SMRSTRG_ATTR_CODE, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("criteria.attrCode")
    public String getCriteriaAttrCode() {
        return criteriaAttrCode;
    }

    /**
     * Smrstrg Attr Code
     * <p>
     * Lineage reference object : SMRSTRG_ATTR_CODE, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("criteria.attrCode")
    public void setCriteriaAttrCode(String criteriaAttrCode) {
        this.criteriaAttrCode = criteriaAttrCode;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsTargetCourses100PutRequest withCriteriaAttrCode(String criteriaAttrCode) {
        this.criteriaAttrCode = criteriaAttrCode;
        return this;
    }

    /**
     * Smrstrg Group
     * <p>
     * Lineage reference object : SMRSTRG_GROUP
     * 
     */
    @JsonProperty("criteria.group")
    public String getCriteriaGroup() {
        return criteriaGroup;
    }

    /**
     * Smrstrg Group
     * <p>
     * Lineage reference object : SMRSTRG_GROUP
     * 
     */
    @JsonProperty("criteria.group")
    public void setCriteriaGroup(String criteriaGroup) {
        this.criteriaGroup = criteriaGroup;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsTargetCourses100PutRequest withCriteriaGroup(String criteriaGroup) {
        this.criteriaGroup = criteriaGroup;
        return this;
    }

    /**
     * Smrstrg Area
     * <p>
     * Lineage reference object : SMRSTRG_AREA
     * (Required)
     * 
     */
    @JsonProperty("criteria.area")
    public String getCriteriaArea() {
        return criteriaArea;
    }

    /**
     * Smrstrg Area
     * <p>
     * Lineage reference object : SMRSTRG_AREA
     * (Required)
     * 
     */
    @JsonProperty("criteria.area")
    public void setCriteriaArea(String criteriaArea) {
        this.criteriaArea = criteriaArea;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsTargetCourses100PutRequest withCriteriaArea(String criteriaArea) {
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

    public StudentAdjustmentTargetsWaiversSubstitutionsTargetCourses100PutRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Smrstrg Group
     * <p>
     * Lineage reference object : SMRSTRG_GROUP
     * 
     */
    @JsonProperty("group")
    public String getGroup() {
        return group;
    }

    /**
     * Smrstrg Group
     * <p>
     * Lineage reference object : SMRSTRG_GROUP
     * 
     */
    @JsonProperty("group")
    public void setGroup(String group) {
        this.group = group;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsTargetCourses100PutRequest withGroup(String group) {
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

    public StudentAdjustmentTargetsWaiversSubstitutionsTargetCourses100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentAdjustmentTargetsWaiversSubstitutionsTargetCourses100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("area");
        sb.append('=');
        sb.append(((this.area == null)?"<null>":this.area));
        sb.append(',');
        sb.append("criteriaProgram");
        sb.append('=');
        sb.append(((this.criteriaProgram == null)?"<null>":this.criteriaProgram));
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
        result = ((result* 31)+((this.criteriaSubjCode == null)? 0 :this.criteriaSubjCode.hashCode()));
        result = ((result* 31)+((this.criteriaProgram == null)? 0 :this.criteriaProgram.hashCode()));
        result = ((result* 31)+((this.crseNumb == null)? 0 :this.crseNumb.hashCode()));
        result = ((result* 31)+((this.criteriaGroup == null)? 0 :this.criteriaGroup.hashCode()));
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
        if ((other instanceof StudentAdjustmentTargetsWaiversSubstitutionsTargetCourses100PutRequest) == false) {
            return false;
        }
        StudentAdjustmentTargetsWaiversSubstitutionsTargetCourses100PutRequest rhs = ((StudentAdjustmentTargetsWaiversSubstitutionsTargetCourses100PutRequest) other);
        return ((((((((((((((((this.area == rhs.area)||((this.area!= null)&&this.area.equals(rhs.area)))&&((this.criteriaArea == rhs.criteriaArea)||((this.criteriaArea!= null)&&this.criteriaArea.equals(rhs.criteriaArea))))&&((this.attrCode == rhs.attrCode)||((this.attrCode!= null)&&this.attrCode.equals(rhs.attrCode))))&&((this.subjCode == rhs.subjCode)||((this.subjCode!= null)&&this.subjCode.equals(rhs.subjCode))))&&((this.keyblckTermCode == rhs.keyblckTermCode)||((this.keyblckTermCode!= null)&&this.keyblckTermCode.equals(rhs.keyblckTermCode))))&&((this.criteriaCrseNumb == rhs.criteriaCrseNumb)||((this.criteriaCrseNumb!= null)&&this.criteriaCrseNumb.equals(rhs.criteriaCrseNumb))))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.criteriaSubjCode == rhs.criteriaSubjCode)||((this.criteriaSubjCode!= null)&&this.criteriaSubjCode.equals(rhs.criteriaSubjCode))))&&((this.criteriaProgram == rhs.criteriaProgram)||((this.criteriaProgram!= null)&&this.criteriaProgram.equals(rhs.criteriaProgram))))&&((this.crseNumb == rhs.crseNumb)||((this.crseNumb!= null)&&this.crseNumb.equals(rhs.crseNumb))))&&((this.criteriaGroup == rhs.criteriaGroup)||((this.criteriaGroup!= null)&&this.criteriaGroup.equals(rhs.criteriaGroup))))&&((this.criteriaAttrCode == rhs.criteriaAttrCode)||((this.criteriaAttrCode!= null)&&this.criteriaAttrCode.equals(rhs.criteriaAttrCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.group == rhs.group)||((this.group!= null)&&this.group.equals(rhs.group))));
    }

}
