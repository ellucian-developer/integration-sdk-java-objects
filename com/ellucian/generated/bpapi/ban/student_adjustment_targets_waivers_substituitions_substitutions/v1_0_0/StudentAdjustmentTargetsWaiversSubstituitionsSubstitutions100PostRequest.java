
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
    "smrssubSubjCodeReq",
    "keyblckTermCode",
    "program",
    "smrssubSubjCodeSub",
    "attrCodeSub",
    "smrssubActnCode",
    "credits",
    "smrssubAttrCodeReq",
    "smrssubCrseNumbReq",
    "id",
    "smrssubCrseNumbSub",
    "group"
})
@Generated("jsonschema2pojo")
public class StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PostRequest {

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
     * Smrssub Subj Code Req
     * <p>
     * Lineage reference object : SMRSSUB_SUBJ_CODE_REQ, Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("smrssubSubjCodeReq")
    @JsonPropertyDescription("Lineage reference object : SMRSSUB_SUBJ_CODE_REQ, Lookup lineage reference object : stvsubj")
    private String smrssubSubjCodeReq;
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
     * Program
     * <p>
     * Lineage reference object : SMRSSPV_PROGRAM
     * 
     */
    @JsonProperty("program")
    @JsonPropertyDescription("Lineage reference object : SMRSSPV_PROGRAM")
    private String program;
    /**
     * Smrssub Subj Code Sub
     * <p>
     * Lineage reference object : SMRSSUB_SUBJ_CODE_SUB, Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("smrssubSubjCodeSub")
    @JsonPropertyDescription("Lineage reference object : SMRSSUB_SUBJ_CODE_SUB, Lookup lineage reference object : stvsubj")
    private String smrssubSubjCodeSub;
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
    @JsonProperty("smrssubActnCode")
    @JsonPropertyDescription("Lineage reference object : SMRSSUB_ACTN_CODE, Lookup lineage reference object : stvactn")
    private String smrssubActnCode;
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
     * Smrssub Attr Code Req
     * <p>
     * Lineage reference object : SMRSSUB_ATTR_CODE_REQ, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("smrssubAttrCodeReq")
    @JsonPropertyDescription("Lineage reference object : SMRSSUB_ATTR_CODE_REQ, Lookup lineage reference object : stvattr")
    private String smrssubAttrCodeReq;
    /**
     * Smrssub Crse Numb Req
     * <p>
     * Lineage reference object : SMRSSUB_CRSE_NUMB_REQ
     * (Required)
     * 
     */
    @JsonProperty("smrssubCrseNumbReq")
    @JsonPropertyDescription("Lineage reference object : SMRSSUB_CRSE_NUMB_REQ")
    private String smrssubCrseNumbReq;
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
     * Smrssub Crse Numb Sub
     * <p>
     * Lineage reference object : SMRSSUB_CRSE_NUMB_SUB
     * (Required)
     * 
     */
    @JsonProperty("smrssubCrseNumbSub")
    @JsonPropertyDescription("Lineage reference object : SMRSSUB_CRSE_NUMB_SUB")
    private String smrssubCrseNumbSub;
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

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PostRequest withArea(String area) {
        this.area = area;
        return this;
    }

    /**
     * Smrssub Subj Code Req
     * <p>
     * Lineage reference object : SMRSSUB_SUBJ_CODE_REQ, Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("smrssubSubjCodeReq")
    public String getSmrssubSubjCodeReq() {
        return smrssubSubjCodeReq;
    }

    /**
     * Smrssub Subj Code Req
     * <p>
     * Lineage reference object : SMRSSUB_SUBJ_CODE_REQ, Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("smrssubSubjCodeReq")
    public void setSmrssubSubjCodeReq(String smrssubSubjCodeReq) {
        this.smrssubSubjCodeReq = smrssubSubjCodeReq;
    }

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PostRequest withSmrssubSubjCodeReq(String smrssubSubjCodeReq) {
        this.smrssubSubjCodeReq = smrssubSubjCodeReq;
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

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PostRequest withKeyblckTermCode(String keyblckTermCode) {
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

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PostRequest withProgram(String program) {
        this.program = program;
        return this;
    }

    /**
     * Smrssub Subj Code Sub
     * <p>
     * Lineage reference object : SMRSSUB_SUBJ_CODE_SUB, Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("smrssubSubjCodeSub")
    public String getSmrssubSubjCodeSub() {
        return smrssubSubjCodeSub;
    }

    /**
     * Smrssub Subj Code Sub
     * <p>
     * Lineage reference object : SMRSSUB_SUBJ_CODE_SUB, Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("smrssubSubjCodeSub")
    public void setSmrssubSubjCodeSub(String smrssubSubjCodeSub) {
        this.smrssubSubjCodeSub = smrssubSubjCodeSub;
    }

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PostRequest withSmrssubSubjCodeSub(String smrssubSubjCodeSub) {
        this.smrssubSubjCodeSub = smrssubSubjCodeSub;
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

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PostRequest withAttrCodeSub(String attrCodeSub) {
        this.attrCodeSub = attrCodeSub;
        return this;
    }

    /**
     * Smrssub Actn Code
     * <p>
     * Lineage reference object : SMRSSUB_ACTN_CODE, Lookup lineage reference object : stvactn
     * 
     */
    @JsonProperty("smrssubActnCode")
    public String getSmrssubActnCode() {
        return smrssubActnCode;
    }

    /**
     * Smrssub Actn Code
     * <p>
     * Lineage reference object : SMRSSUB_ACTN_CODE, Lookup lineage reference object : stvactn
     * 
     */
    @JsonProperty("smrssubActnCode")
    public void setSmrssubActnCode(String smrssubActnCode) {
        this.smrssubActnCode = smrssubActnCode;
    }

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PostRequest withSmrssubActnCode(String smrssubActnCode) {
        this.smrssubActnCode = smrssubActnCode;
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

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PostRequest withCredits(Double credits) {
        this.credits = credits;
        return this;
    }

    /**
     * Smrssub Attr Code Req
     * <p>
     * Lineage reference object : SMRSSUB_ATTR_CODE_REQ, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("smrssubAttrCodeReq")
    public String getSmrssubAttrCodeReq() {
        return smrssubAttrCodeReq;
    }

    /**
     * Smrssub Attr Code Req
     * <p>
     * Lineage reference object : SMRSSUB_ATTR_CODE_REQ, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("smrssubAttrCodeReq")
    public void setSmrssubAttrCodeReq(String smrssubAttrCodeReq) {
        this.smrssubAttrCodeReq = smrssubAttrCodeReq;
    }

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PostRequest withSmrssubAttrCodeReq(String smrssubAttrCodeReq) {
        this.smrssubAttrCodeReq = smrssubAttrCodeReq;
        return this;
    }

    /**
     * Smrssub Crse Numb Req
     * <p>
     * Lineage reference object : SMRSSUB_CRSE_NUMB_REQ
     * (Required)
     * 
     */
    @JsonProperty("smrssubCrseNumbReq")
    public String getSmrssubCrseNumbReq() {
        return smrssubCrseNumbReq;
    }

    /**
     * Smrssub Crse Numb Req
     * <p>
     * Lineage reference object : SMRSSUB_CRSE_NUMB_REQ
     * (Required)
     * 
     */
    @JsonProperty("smrssubCrseNumbReq")
    public void setSmrssubCrseNumbReq(String smrssubCrseNumbReq) {
        this.smrssubCrseNumbReq = smrssubCrseNumbReq;
    }

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PostRequest withSmrssubCrseNumbReq(String smrssubCrseNumbReq) {
        this.smrssubCrseNumbReq = smrssubCrseNumbReq;
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

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PostRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Smrssub Crse Numb Sub
     * <p>
     * Lineage reference object : SMRSSUB_CRSE_NUMB_SUB
     * (Required)
     * 
     */
    @JsonProperty("smrssubCrseNumbSub")
    public String getSmrssubCrseNumbSub() {
        return smrssubCrseNumbSub;
    }

    /**
     * Smrssub Crse Numb Sub
     * <p>
     * Lineage reference object : SMRSSUB_CRSE_NUMB_SUB
     * (Required)
     * 
     */
    @JsonProperty("smrssubCrseNumbSub")
    public void setSmrssubCrseNumbSub(String smrssubCrseNumbSub) {
        this.smrssubCrseNumbSub = smrssubCrseNumbSub;
    }

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PostRequest withSmrssubCrseNumbSub(String smrssubCrseNumbSub) {
        this.smrssubCrseNumbSub = smrssubCrseNumbSub;
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

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PostRequest withGroup(String group) {
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

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("area");
        sb.append('=');
        sb.append(((this.area == null)?"<null>":this.area));
        sb.append(',');
        sb.append("smrssubSubjCodeReq");
        sb.append('=');
        sb.append(((this.smrssubSubjCodeReq == null)?"<null>":this.smrssubSubjCodeReq));
        sb.append(',');
        sb.append("keyblckTermCode");
        sb.append('=');
        sb.append(((this.keyblckTermCode == null)?"<null>":this.keyblckTermCode));
        sb.append(',');
        sb.append("program");
        sb.append('=');
        sb.append(((this.program == null)?"<null>":this.program));
        sb.append(',');
        sb.append("smrssubSubjCodeSub");
        sb.append('=');
        sb.append(((this.smrssubSubjCodeSub == null)?"<null>":this.smrssubSubjCodeSub));
        sb.append(',');
        sb.append("attrCodeSub");
        sb.append('=');
        sb.append(((this.attrCodeSub == null)?"<null>":this.attrCodeSub));
        sb.append(',');
        sb.append("smrssubActnCode");
        sb.append('=');
        sb.append(((this.smrssubActnCode == null)?"<null>":this.smrssubActnCode));
        sb.append(',');
        sb.append("credits");
        sb.append('=');
        sb.append(((this.credits == null)?"<null>":this.credits));
        sb.append(',');
        sb.append("smrssubAttrCodeReq");
        sb.append('=');
        sb.append(((this.smrssubAttrCodeReq == null)?"<null>":this.smrssubAttrCodeReq));
        sb.append(',');
        sb.append("smrssubCrseNumbReq");
        sb.append('=');
        sb.append(((this.smrssubCrseNumbReq == null)?"<null>":this.smrssubCrseNumbReq));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("smrssubCrseNumbSub");
        sb.append('=');
        sb.append(((this.smrssubCrseNumbSub == null)?"<null>":this.smrssubCrseNumbSub));
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
        result = ((result* 31)+((this.smrssubSubjCodeReq == null)? 0 :this.smrssubSubjCodeReq.hashCode()));
        result = ((result* 31)+((this.keyblckTermCode == null)? 0 :this.keyblckTermCode.hashCode()));
        result = ((result* 31)+((this.program == null)? 0 :this.program.hashCode()));
        result = ((result* 31)+((this.smrssubSubjCodeSub == null)? 0 :this.smrssubSubjCodeSub.hashCode()));
        result = ((result* 31)+((this.attrCodeSub == null)? 0 :this.attrCodeSub.hashCode()));
        result = ((result* 31)+((this.smrssubActnCode == null)? 0 :this.smrssubActnCode.hashCode()));
        result = ((result* 31)+((this.credits == null)? 0 :this.credits.hashCode()));
        result = ((result* 31)+((this.smrssubAttrCodeReq == null)? 0 :this.smrssubAttrCodeReq.hashCode()));
        result = ((result* 31)+((this.smrssubCrseNumbReq == null)? 0 :this.smrssubCrseNumbReq.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.smrssubCrseNumbSub == null)? 0 :this.smrssubCrseNumbSub.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.group == null)? 0 :this.group.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PostRequest) == false) {
            return false;
        }
        StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PostRequest rhs = ((StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PostRequest) other);
        return (((((((((((((((this.area == rhs.area)||((this.area!= null)&&this.area.equals(rhs.area)))&&((this.smrssubSubjCodeReq == rhs.smrssubSubjCodeReq)||((this.smrssubSubjCodeReq!= null)&&this.smrssubSubjCodeReq.equals(rhs.smrssubSubjCodeReq))))&&((this.keyblckTermCode == rhs.keyblckTermCode)||((this.keyblckTermCode!= null)&&this.keyblckTermCode.equals(rhs.keyblckTermCode))))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.smrssubSubjCodeSub == rhs.smrssubSubjCodeSub)||((this.smrssubSubjCodeSub!= null)&&this.smrssubSubjCodeSub.equals(rhs.smrssubSubjCodeSub))))&&((this.attrCodeSub == rhs.attrCodeSub)||((this.attrCodeSub!= null)&&this.attrCodeSub.equals(rhs.attrCodeSub))))&&((this.smrssubActnCode == rhs.smrssubActnCode)||((this.smrssubActnCode!= null)&&this.smrssubActnCode.equals(rhs.smrssubActnCode))))&&((this.credits == rhs.credits)||((this.credits!= null)&&this.credits.equals(rhs.credits))))&&((this.smrssubAttrCodeReq == rhs.smrssubAttrCodeReq)||((this.smrssubAttrCodeReq!= null)&&this.smrssubAttrCodeReq.equals(rhs.smrssubAttrCodeReq))))&&((this.smrssubCrseNumbReq == rhs.smrssubCrseNumbReq)||((this.smrssubCrseNumbReq!= null)&&this.smrssubCrseNumbReq.equals(rhs.smrssubCrseNumbReq))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.smrssubCrseNumbSub == rhs.smrssubCrseNumbSub)||((this.smrssubCrseNumbSub!= null)&&this.smrssubCrseNumbSub.equals(rhs.smrssubCrseNumbSub))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.group == rhs.group)||((this.group!= null)&&this.group.equals(rhs.group))));
    }

}
