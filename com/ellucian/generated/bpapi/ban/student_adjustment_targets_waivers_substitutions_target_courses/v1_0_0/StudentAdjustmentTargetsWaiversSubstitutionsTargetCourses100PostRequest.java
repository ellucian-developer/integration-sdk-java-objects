
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
    "crseNumb",
    "attrCode",
    "subjCode",
    "keyblckTermCode",
    "id",
    "program",
    "group"
})
@Generated("jsonschema2pojo")
public class StudentAdjustmentTargetsWaiversSubstitutionsTargetCourses100PostRequest {

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
    @JsonProperty("attrCode")
    @JsonPropertyDescription("Lineage reference object : SMRSTRG_ATTR_CODE, Lookup lineage reference object : stvattr")
    private String attrCode;
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
    private Object keyblckTermCode;
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
     * Program
     * <p>
     * Lineage reference object : SMRSTPV_PROGRAM
     * 
     */
    @JsonProperty("program")
    @JsonPropertyDescription("Lineage reference object : SMRSTPV_PROGRAM")
    private String program;
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

    public StudentAdjustmentTargetsWaiversSubstitutionsTargetCourses100PostRequest withArea(String area) {
        this.area = area;
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

    public StudentAdjustmentTargetsWaiversSubstitutionsTargetCourses100PostRequest withCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
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

    public StudentAdjustmentTargetsWaiversSubstitutionsTargetCourses100PostRequest withAttrCode(String attrCode) {
        this.attrCode = attrCode;
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

    public StudentAdjustmentTargetsWaiversSubstitutionsTargetCourses100PostRequest withSubjCode(String subjCode) {
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

    public StudentAdjustmentTargetsWaiversSubstitutionsTargetCourses100PostRequest withKeyblckTermCode(Object keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
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

    public StudentAdjustmentTargetsWaiversSubstitutionsTargetCourses100PostRequest withId(Object id) {
        this.id = id;
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

    public StudentAdjustmentTargetsWaiversSubstitutionsTargetCourses100PostRequest withProgram(String program) {
        this.program = program;
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

    public StudentAdjustmentTargetsWaiversSubstitutionsTargetCourses100PostRequest withGroup(String group) {
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

    public StudentAdjustmentTargetsWaiversSubstitutionsTargetCourses100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentAdjustmentTargetsWaiversSubstitutionsTargetCourses100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("area");
        sb.append('=');
        sb.append(((this.area == null)?"<null>":this.area));
        sb.append(',');
        sb.append("crseNumb");
        sb.append('=');
        sb.append(((this.crseNumb == null)?"<null>":this.crseNumb));
        sb.append(',');
        sb.append("attrCode");
        sb.append('=');
        sb.append(((this.attrCode == null)?"<null>":this.attrCode));
        sb.append(',');
        sb.append("subjCode");
        sb.append('=');
        sb.append(((this.subjCode == null)?"<null>":this.subjCode));
        sb.append(',');
        sb.append("keyblckTermCode");
        sb.append('=');
        sb.append(((this.keyblckTermCode == null)?"<null>":this.keyblckTermCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("program");
        sb.append('=');
        sb.append(((this.program == null)?"<null>":this.program));
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
        result = ((result* 31)+((this.crseNumb == null)? 0 :this.crseNumb.hashCode()));
        result = ((result* 31)+((this.attrCode == null)? 0 :this.attrCode.hashCode()));
        result = ((result* 31)+((this.subjCode == null)? 0 :this.subjCode.hashCode()));
        result = ((result* 31)+((this.keyblckTermCode == null)? 0 :this.keyblckTermCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.program == null)? 0 :this.program.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.group == null)? 0 :this.group.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentAdjustmentTargetsWaiversSubstitutionsTargetCourses100PostRequest) == false) {
            return false;
        }
        StudentAdjustmentTargetsWaiversSubstitutionsTargetCourses100PostRequest rhs = ((StudentAdjustmentTargetsWaiversSubstitutionsTargetCourses100PostRequest) other);
        return ((((((((((this.area == rhs.area)||((this.area!= null)&&this.area.equals(rhs.area)))&&((this.crseNumb == rhs.crseNumb)||((this.crseNumb!= null)&&this.crseNumb.equals(rhs.crseNumb))))&&((this.attrCode == rhs.attrCode)||((this.attrCode!= null)&&this.attrCode.equals(rhs.attrCode))))&&((this.subjCode == rhs.subjCode)||((this.subjCode!= null)&&this.subjCode.equals(rhs.subjCode))))&&((this.keyblckTermCode == rhs.keyblckTermCode)||((this.keyblckTermCode!= null)&&this.keyblckTermCode.equals(rhs.keyblckTermCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.group == rhs.group)||((this.group!= null)&&this.group.equals(rhs.group))));
    }

}
