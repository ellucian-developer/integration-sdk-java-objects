
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
    "id",
    "keyblckTermCode",
    "subjCode",
    "crseNumb",
    "attrCode",
    "area",
    "group",
    "actnCode",
    "credits",
    "program"
})
@Generated("jsonschema2pojo")
public class StudentAdjustmentTargetsWaiversSubstitutionsWaivers100QapiPost {

    @JsonProperty("id")
    private String id;
    @JsonProperty("keyblckTermCode")
    private String keyblckTermCode;
    /**
     * Smrswav Subj Code
     * <p>
     * Lineage reference object : SMRSWAV_SUBJ_CODE, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCode")
    @JsonPropertyDescription("Lineage reference object : SMRSWAV_SUBJ_CODE, Lookup lineage reference object : stvsubj")
    private String subjCode;
    /**
     * Smrswav Crse Numb
     * <p>
     * Lineage reference object : SMRSWAV_CRSE_NUMB
     * 
     */
    @JsonProperty("crseNumb")
    @JsonPropertyDescription("Lineage reference object : SMRSWAV_CRSE_NUMB")
    private String crseNumb;
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
     * Smrswav Area
     * <p>
     * Lineage reference object : SMRSWAV_AREA
     * 
     */
    @JsonProperty("area")
    @JsonPropertyDescription("Lineage reference object : SMRSWAV_AREA")
    private String area;
    /**
     * Smrswav Group
     * <p>
     * Lineage reference object : SMRSWAV_GROUP
     * 
     */
    @JsonProperty("group")
    @JsonPropertyDescription("Lineage reference object : SMRSWAV_GROUP")
    private String group;
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
    @JsonProperty("program")
    private String program;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsWaivers100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("keyblckTermCode")
    public String getKeyblckTermCode() {
        return keyblckTermCode;
    }

    @JsonProperty("keyblckTermCode")
    public void setKeyblckTermCode(String keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsWaivers100QapiPost withKeyblckTermCode(String keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
        return this;
    }

    /**
     * Smrswav Subj Code
     * <p>
     * Lineage reference object : SMRSWAV_SUBJ_CODE, Lookup lineage reference object : stvsubj
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
     * 
     */
    @JsonProperty("subjCode")
    public void setSubjCode(String subjCode) {
        this.subjCode = subjCode;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsWaivers100QapiPost withSubjCode(String subjCode) {
        this.subjCode = subjCode;
        return this;
    }

    /**
     * Smrswav Crse Numb
     * <p>
     * Lineage reference object : SMRSWAV_CRSE_NUMB
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
     * 
     */
    @JsonProperty("crseNumb")
    public void setCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsWaivers100QapiPost withCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
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

    public StudentAdjustmentTargetsWaiversSubstitutionsWaivers100QapiPost withAttrCode(String attrCode) {
        this.attrCode = attrCode;
        return this;
    }

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

    public StudentAdjustmentTargetsWaiversSubstitutionsWaivers100QapiPost withArea(String area) {
        this.area = area;
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

    public StudentAdjustmentTargetsWaiversSubstitutionsWaivers100QapiPost withGroup(String group) {
        this.group = group;
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

    public StudentAdjustmentTargetsWaiversSubstitutionsWaivers100QapiPost withActnCode(String actnCode) {
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

    public StudentAdjustmentTargetsWaiversSubstitutionsWaivers100QapiPost withCredits(Double credits) {
        this.credits = credits;
        return this;
    }

    @JsonProperty("program")
    public String getProgram() {
        return program;
    }

    @JsonProperty("program")
    public void setProgram(String program) {
        this.program = program;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsWaivers100QapiPost withProgram(String program) {
        this.program = program;
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

    public StudentAdjustmentTargetsWaiversSubstitutionsWaivers100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentAdjustmentTargetsWaiversSubstitutionsWaivers100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("keyblckTermCode");
        sb.append('=');
        sb.append(((this.keyblckTermCode == null)?"<null>":this.keyblckTermCode));
        sb.append(',');
        sb.append("subjCode");
        sb.append('=');
        sb.append(((this.subjCode == null)?"<null>":this.subjCode));
        sb.append(',');
        sb.append("crseNumb");
        sb.append('=');
        sb.append(((this.crseNumb == null)?"<null>":this.crseNumb));
        sb.append(',');
        sb.append("attrCode");
        sb.append('=');
        sb.append(((this.attrCode == null)?"<null>":this.attrCode));
        sb.append(',');
        sb.append("area");
        sb.append('=');
        sb.append(((this.area == null)?"<null>":this.area));
        sb.append(',');
        sb.append("group");
        sb.append('=');
        sb.append(((this.group == null)?"<null>":this.group));
        sb.append(',');
        sb.append("actnCode");
        sb.append('=');
        sb.append(((this.actnCode == null)?"<null>":this.actnCode));
        sb.append(',');
        sb.append("credits");
        sb.append('=');
        sb.append(((this.credits == null)?"<null>":this.credits));
        sb.append(',');
        sb.append("program");
        sb.append('=');
        sb.append(((this.program == null)?"<null>":this.program));
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
        result = ((result* 31)+((this.actnCode == null)? 0 :this.actnCode.hashCode()));
        result = ((result* 31)+((this.attrCode == null)? 0 :this.attrCode.hashCode()));
        result = ((result* 31)+((this.credits == null)? 0 :this.credits.hashCode()));
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
        if ((other instanceof StudentAdjustmentTargetsWaiversSubstitutionsWaivers100QapiPost) == false) {
            return false;
        }
        StudentAdjustmentTargetsWaiversSubstitutionsWaivers100QapiPost rhs = ((StudentAdjustmentTargetsWaiversSubstitutionsWaivers100QapiPost) other);
        return ((((((((((((this.area == rhs.area)||((this.area!= null)&&this.area.equals(rhs.area)))&&((this.crseNumb == rhs.crseNumb)||((this.crseNumb!= null)&&this.crseNumb.equals(rhs.crseNumb))))&&((this.actnCode == rhs.actnCode)||((this.actnCode!= null)&&this.actnCode.equals(rhs.actnCode))))&&((this.attrCode == rhs.attrCode)||((this.attrCode!= null)&&this.attrCode.equals(rhs.attrCode))))&&((this.credits == rhs.credits)||((this.credits!= null)&&this.credits.equals(rhs.credits))))&&((this.subjCode == rhs.subjCode)||((this.subjCode!= null)&&this.subjCode.equals(rhs.subjCode))))&&((this.keyblckTermCode == rhs.keyblckTermCode)||((this.keyblckTermCode!= null)&&this.keyblckTermCode.equals(rhs.keyblckTermCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.group == rhs.group)||((this.group!= null)&&this.group.equals(rhs.group))));
    }

}
