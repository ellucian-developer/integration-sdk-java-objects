
package com.ellucian.generated.bpapi.ban.student_adjustment_targets_waivers_substituitions_substitutions.v1_0_0;

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
    "keyblckTermCode",
    "program",
    "subjCodeReq",
    "attrCodeSub",
    "actnCode",
    "attrCodeReq",
    "crseNumbReq",
    "credits",
    "crseNumbSub",
    "id",
    "subjCodeSub",
    "group"
})
@Generated("jsonschema2pojo")
public class StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100GetRequest {

    /**
     * Smrssub Area
     * <p>
     * Lineage reference object : SMRSSUB_AREA
     * 
     */
    @JsonProperty("area")
    @JsonPropertyDescription("Lineage reference object : SMRSSUB_AREA")
    private String area;
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
     * Program
     * <p>
     * Lineage reference object : SMRSSPV_PROGRAM
     * 
     */
    @JsonProperty("program")
    @JsonPropertyDescription("Lineage reference object : SMRSSPV_PROGRAM")
    private String program;
    /**
     * Smrssub Subj Code Req
     * <p>
     * Lineage reference object : SMRSSUB_SUBJ_CODE_REQ, Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("subjCodeReq")
    @JsonPropertyDescription("Lineage reference object : SMRSSUB_SUBJ_CODE_REQ, Lookup lineage reference object : stvsubj")
    private String subjCodeReq;
    /**
     * Smrssub Attr Code Sub
     * <p>
     * Lineage reference object : SMRSSUB_ATTR_CODE_SUB, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("attrCodeSub")
    @JsonPropertyDescription("Lineage reference object : SMRSSUB_ATTR_CODE_SUB, Lookup lineage reference object : stvattr")
    private String attrCodeSub;
    /**
     * Smrssub Actn Code
     * <p>
     * Lineage reference object : SMRSSUB_ACTN_CODE, Lookup lineage reference object : stvactn
     * 
     */
    @JsonProperty("actnCode")
    @JsonPropertyDescription("Lineage reference object : SMRSSUB_ACTN_CODE, Lookup lineage reference object : stvactn")
    private String actnCode;
    /**
     * Smrssub Attr Code Req
     * <p>
     * Lineage reference object : SMRSSUB_ATTR_CODE_REQ, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("attrCodeReq")
    @JsonPropertyDescription("Lineage reference object : SMRSSUB_ATTR_CODE_REQ, Lookup lineage reference object : stvattr")
    private String attrCodeReq;
    /**
     * Smrssub Crse Numb Req
     * <p>
     * Lineage reference object : SMRSSUB_CRSE_NUMB_REQ
     * (Required)
     * 
     */
    @JsonProperty("crseNumbReq")
    @JsonPropertyDescription("Lineage reference object : SMRSSUB_CRSE_NUMB_REQ")
    private String crseNumbReq;
    /**
     * Smrssub Credits
     * <p>
     * Lineage reference object : SMRSSUB_CREDITS
     * 
     */
    @JsonProperty("credits")
    @JsonPropertyDescription("Lineage reference object : SMRSSUB_CREDITS")
    private Double credits;
    /**
     * Smrssub Crse Numb Sub
     * <p>
     * Lineage reference object : SMRSSUB_CRSE_NUMB_SUB
     * (Required)
     * 
     */
    @JsonProperty("crseNumbSub")
    @JsonPropertyDescription("Lineage reference object : SMRSSUB_CRSE_NUMB_SUB")
    private String crseNumbSub;
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
     * Smrssub Subj Code Sub
     * <p>
     * Lineage reference object : SMRSSUB_SUBJ_CODE_SUB, Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("subjCodeSub")
    @JsonPropertyDescription("Lineage reference object : SMRSSUB_SUBJ_CODE_SUB, Lookup lineage reference object : stvsubj")
    private String subjCodeSub;
    /**
     * Smrssub Group
     * <p>
     * Lineage reference object : SMRSSUB_GROUP
     * 
     */
    @JsonProperty("group")
    @JsonPropertyDescription("Lineage reference object : SMRSSUB_GROUP")
    private String group;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Smrssub Area
     * <p>
     * Lineage reference object : SMRSSUB_AREA
     * 
     */
    @JsonProperty("area")
    public String getArea() {
        return area;
    }

    /**
     * Smrssub Area
     * <p>
     * Lineage reference object : SMRSSUB_AREA
     * 
     */
    @JsonProperty("area")
    public void setArea(String area) {
        this.area = area;
    }

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100GetRequest withArea(String area) {
        this.area = area;
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

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100GetRequest withKeyblckTermCode(Object keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SMRSSPV_PROGRAM
     * 
     */
    @JsonProperty("program")
    public String getProgram() {
        return program;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SMRSSPV_PROGRAM
     * 
     */
    @JsonProperty("program")
    public void setProgram(String program) {
        this.program = program;
    }

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100GetRequest withProgram(String program) {
        this.program = program;
        return this;
    }

    /**
     * Smrssub Subj Code Req
     * <p>
     * Lineage reference object : SMRSSUB_SUBJ_CODE_REQ, Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("subjCodeReq")
    public String getSubjCodeReq() {
        return subjCodeReq;
    }

    /**
     * Smrssub Subj Code Req
     * <p>
     * Lineage reference object : SMRSSUB_SUBJ_CODE_REQ, Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("subjCodeReq")
    public void setSubjCodeReq(String subjCodeReq) {
        this.subjCodeReq = subjCodeReq;
    }

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100GetRequest withSubjCodeReq(String subjCodeReq) {
        this.subjCodeReq = subjCodeReq;
        return this;
    }

    /**
     * Smrssub Attr Code Sub
     * <p>
     * Lineage reference object : SMRSSUB_ATTR_CODE_SUB, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("attrCodeSub")
    public String getAttrCodeSub() {
        return attrCodeSub;
    }

    /**
     * Smrssub Attr Code Sub
     * <p>
     * Lineage reference object : SMRSSUB_ATTR_CODE_SUB, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("attrCodeSub")
    public void setAttrCodeSub(String attrCodeSub) {
        this.attrCodeSub = attrCodeSub;
    }

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100GetRequest withAttrCodeSub(String attrCodeSub) {
        this.attrCodeSub = attrCodeSub;
        return this;
    }

    /**
     * Smrssub Actn Code
     * <p>
     * Lineage reference object : SMRSSUB_ACTN_CODE, Lookup lineage reference object : stvactn
     * 
     */
    @JsonProperty("actnCode")
    public String getActnCode() {
        return actnCode;
    }

    /**
     * Smrssub Actn Code
     * <p>
     * Lineage reference object : SMRSSUB_ACTN_CODE, Lookup lineage reference object : stvactn
     * 
     */
    @JsonProperty("actnCode")
    public void setActnCode(String actnCode) {
        this.actnCode = actnCode;
    }

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100GetRequest withActnCode(String actnCode) {
        this.actnCode = actnCode;
        return this;
    }

    /**
     * Smrssub Attr Code Req
     * <p>
     * Lineage reference object : SMRSSUB_ATTR_CODE_REQ, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("attrCodeReq")
    public String getAttrCodeReq() {
        return attrCodeReq;
    }

    /**
     * Smrssub Attr Code Req
     * <p>
     * Lineage reference object : SMRSSUB_ATTR_CODE_REQ, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("attrCodeReq")
    public void setAttrCodeReq(String attrCodeReq) {
        this.attrCodeReq = attrCodeReq;
    }

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100GetRequest withAttrCodeReq(String attrCodeReq) {
        this.attrCodeReq = attrCodeReq;
        return this;
    }

    /**
     * Smrssub Crse Numb Req
     * <p>
     * Lineage reference object : SMRSSUB_CRSE_NUMB_REQ
     * (Required)
     * 
     */
    @JsonProperty("crseNumbReq")
    public String getCrseNumbReq() {
        return crseNumbReq;
    }

    /**
     * Smrssub Crse Numb Req
     * <p>
     * Lineage reference object : SMRSSUB_CRSE_NUMB_REQ
     * (Required)
     * 
     */
    @JsonProperty("crseNumbReq")
    public void setCrseNumbReq(String crseNumbReq) {
        this.crseNumbReq = crseNumbReq;
    }

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100GetRequest withCrseNumbReq(String crseNumbReq) {
        this.crseNumbReq = crseNumbReq;
        return this;
    }

    /**
     * Smrssub Credits
     * <p>
     * Lineage reference object : SMRSSUB_CREDITS
     * 
     */
    @JsonProperty("credits")
    public Double getCredits() {
        return credits;
    }

    /**
     * Smrssub Credits
     * <p>
     * Lineage reference object : SMRSSUB_CREDITS
     * 
     */
    @JsonProperty("credits")
    public void setCredits(Double credits) {
        this.credits = credits;
    }

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100GetRequest withCredits(Double credits) {
        this.credits = credits;
        return this;
    }

    /**
     * Smrssub Crse Numb Sub
     * <p>
     * Lineage reference object : SMRSSUB_CRSE_NUMB_SUB
     * (Required)
     * 
     */
    @JsonProperty("crseNumbSub")
    public String getCrseNumbSub() {
        return crseNumbSub;
    }

    /**
     * Smrssub Crse Numb Sub
     * <p>
     * Lineage reference object : SMRSSUB_CRSE_NUMB_SUB
     * (Required)
     * 
     */
    @JsonProperty("crseNumbSub")
    public void setCrseNumbSub(String crseNumbSub) {
        this.crseNumbSub = crseNumbSub;
    }

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100GetRequest withCrseNumbSub(String crseNumbSub) {
        this.crseNumbSub = crseNumbSub;
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

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100GetRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Smrssub Subj Code Sub
     * <p>
     * Lineage reference object : SMRSSUB_SUBJ_CODE_SUB, Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("subjCodeSub")
    public String getSubjCodeSub() {
        return subjCodeSub;
    }

    /**
     * Smrssub Subj Code Sub
     * <p>
     * Lineage reference object : SMRSSUB_SUBJ_CODE_SUB, Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("subjCodeSub")
    public void setSubjCodeSub(String subjCodeSub) {
        this.subjCodeSub = subjCodeSub;
    }

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100GetRequest withSubjCodeSub(String subjCodeSub) {
        this.subjCodeSub = subjCodeSub;
        return this;
    }

    /**
     * Smrssub Group
     * <p>
     * Lineage reference object : SMRSSUB_GROUP
     * 
     */
    @JsonProperty("group")
    public String getGroup() {
        return group;
    }

    /**
     * Smrssub Group
     * <p>
     * Lineage reference object : SMRSSUB_GROUP
     * 
     */
    @JsonProperty("group")
    public void setGroup(String group) {
        this.group = group;
    }

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100GetRequest withGroup(String group) {
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

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("area");
        sb.append('=');
        sb.append(((this.area == null)?"<null>":this.area));
        sb.append(',');
        sb.append("keyblckTermCode");
        sb.append('=');
        sb.append(((this.keyblckTermCode == null)?"<null>":this.keyblckTermCode));
        sb.append(',');
        sb.append("program");
        sb.append('=');
        sb.append(((this.program == null)?"<null>":this.program));
        sb.append(',');
        sb.append("subjCodeReq");
        sb.append('=');
        sb.append(((this.subjCodeReq == null)?"<null>":this.subjCodeReq));
        sb.append(',');
        sb.append("attrCodeSub");
        sb.append('=');
        sb.append(((this.attrCodeSub == null)?"<null>":this.attrCodeSub));
        sb.append(',');
        sb.append("actnCode");
        sb.append('=');
        sb.append(((this.actnCode == null)?"<null>":this.actnCode));
        sb.append(',');
        sb.append("attrCodeReq");
        sb.append('=');
        sb.append(((this.attrCodeReq == null)?"<null>":this.attrCodeReq));
        sb.append(',');
        sb.append("crseNumbReq");
        sb.append('=');
        sb.append(((this.crseNumbReq == null)?"<null>":this.crseNumbReq));
        sb.append(',');
        sb.append("credits");
        sb.append('=');
        sb.append(((this.credits == null)?"<null>":this.credits));
        sb.append(',');
        sb.append("crseNumbSub");
        sb.append('=');
        sb.append(((this.crseNumbSub == null)?"<null>":this.crseNumbSub));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("subjCodeSub");
        sb.append('=');
        sb.append(((this.subjCodeSub == null)?"<null>":this.subjCodeSub));
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
        result = ((result* 31)+((this.keyblckTermCode == null)? 0 :this.keyblckTermCode.hashCode()));
        result = ((result* 31)+((this.program == null)? 0 :this.program.hashCode()));
        result = ((result* 31)+((this.subjCodeReq == null)? 0 :this.subjCodeReq.hashCode()));
        result = ((result* 31)+((this.attrCodeSub == null)? 0 :this.attrCodeSub.hashCode()));
        result = ((result* 31)+((this.actnCode == null)? 0 :this.actnCode.hashCode()));
        result = ((result* 31)+((this.attrCodeReq == null)? 0 :this.attrCodeReq.hashCode()));
        result = ((result* 31)+((this.crseNumbReq == null)? 0 :this.crseNumbReq.hashCode()));
        result = ((result* 31)+((this.credits == null)? 0 :this.credits.hashCode()));
        result = ((result* 31)+((this.crseNumbSub == null)? 0 :this.crseNumbSub.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.subjCodeSub == null)? 0 :this.subjCodeSub.hashCode()));
        result = ((result* 31)+((this.group == null)? 0 :this.group.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100GetRequest) == false) {
            return false;
        }
        StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100GetRequest rhs = ((StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100GetRequest) other);
        return (((((((((((((((this.area == rhs.area)||((this.area!= null)&&this.area.equals(rhs.area)))&&((this.keyblckTermCode == rhs.keyblckTermCode)||((this.keyblckTermCode!= null)&&this.keyblckTermCode.equals(rhs.keyblckTermCode))))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.subjCodeReq == rhs.subjCodeReq)||((this.subjCodeReq!= null)&&this.subjCodeReq.equals(rhs.subjCodeReq))))&&((this.attrCodeSub == rhs.attrCodeSub)||((this.attrCodeSub!= null)&&this.attrCodeSub.equals(rhs.attrCodeSub))))&&((this.actnCode == rhs.actnCode)||((this.actnCode!= null)&&this.actnCode.equals(rhs.actnCode))))&&((this.attrCodeReq == rhs.attrCodeReq)||((this.attrCodeReq!= null)&&this.attrCodeReq.equals(rhs.attrCodeReq))))&&((this.crseNumbReq == rhs.crseNumbReq)||((this.crseNumbReq!= null)&&this.crseNumbReq.equals(rhs.crseNumbReq))))&&((this.credits == rhs.credits)||((this.credits!= null)&&this.credits.equals(rhs.credits))))&&((this.crseNumbSub == rhs.crseNumbSub)||((this.crseNumbSub!= null)&&this.crseNumbSub.equals(rhs.crseNumbSub))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.subjCodeSub == rhs.subjCodeSub)||((this.subjCodeSub!= null)&&this.subjCodeSub.equals(rhs.subjCodeSub))))&&((this.group == rhs.group)||((this.group!= null)&&this.group.equals(rhs.group))));
    }

}
