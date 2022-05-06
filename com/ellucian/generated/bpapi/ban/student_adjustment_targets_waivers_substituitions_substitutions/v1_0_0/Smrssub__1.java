
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
    "subjCodeReq",
    "attrCodeSub",
    "actnCode",
    "attrCodeReq",
    "credits",
    "crseNumbReq",
    "maint",
    "crseNumbSub",
    "subjCodeSub",
    "group"
})
@Generated("jsonschema2pojo")
public class Smrssub__1 {

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
     * Smrssub Credits
     * <p>
     * Lineage reference object : SMRSSUB_CREDITS
     * 
     */
    @JsonProperty("credits")
    @JsonPropertyDescription("Lineage reference object : SMRSSUB_CREDITS")
    private Double credits;
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
    @JsonProperty("maint")
    private String maint;
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

    public Smrssub__1 withArea(String area) {
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

    public Smrssub__1 withSubjCodeReq(String subjCodeReq) {
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

    public Smrssub__1 withAttrCodeSub(String attrCodeSub) {
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

    public Smrssub__1 withActnCode(String actnCode) {
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

    public Smrssub__1 withAttrCodeReq(String attrCodeReq) {
        this.attrCodeReq = attrCodeReq;
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

    public Smrssub__1 withCredits(Double credits) {
        this.credits = credits;
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

    public Smrssub__1 withCrseNumbReq(String crseNumbReq) {
        this.crseNumbReq = crseNumbReq;
        return this;
    }

    @JsonProperty("maint")
    public String getMaint() {
        return maint;
    }

    @JsonProperty("maint")
    public void setMaint(String maint) {
        this.maint = maint;
    }

    public Smrssub__1 withMaint(String maint) {
        this.maint = maint;
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

    public Smrssub__1 withCrseNumbSub(String crseNumbSub) {
        this.crseNumbSub = crseNumbSub;
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

    public Smrssub__1 withSubjCodeSub(String subjCodeSub) {
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

    public Smrssub__1 withGroup(String group) {
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

    public Smrssub__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Smrssub__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("area");
        sb.append('=');
        sb.append(((this.area == null)?"<null>":this.area));
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
        sb.append("credits");
        sb.append('=');
        sb.append(((this.credits == null)?"<null>":this.credits));
        sb.append(',');
        sb.append("crseNumbReq");
        sb.append('=');
        sb.append(((this.crseNumbReq == null)?"<null>":this.crseNumbReq));
        sb.append(',');
        sb.append("maint");
        sb.append('=');
        sb.append(((this.maint == null)?"<null>":this.maint));
        sb.append(',');
        sb.append("crseNumbSub");
        sb.append('=');
        sb.append(((this.crseNumbSub == null)?"<null>":this.crseNumbSub));
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
        result = ((result* 31)+((this.subjCodeReq == null)? 0 :this.subjCodeReq.hashCode()));
        result = ((result* 31)+((this.attrCodeSub == null)? 0 :this.attrCodeSub.hashCode()));
        result = ((result* 31)+((this.actnCode == null)? 0 :this.actnCode.hashCode()));
        result = ((result* 31)+((this.attrCodeReq == null)? 0 :this.attrCodeReq.hashCode()));
        result = ((result* 31)+((this.credits == null)? 0 :this.credits.hashCode()));
        result = ((result* 31)+((this.crseNumbReq == null)? 0 :this.crseNumbReq.hashCode()));
        result = ((result* 31)+((this.maint == null)? 0 :this.maint.hashCode()));
        result = ((result* 31)+((this.crseNumbSub == null)? 0 :this.crseNumbSub.hashCode()));
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
        if ((other instanceof Smrssub__1) == false) {
            return false;
        }
        Smrssub__1 rhs = ((Smrssub__1) other);
        return (((((((((((((this.area == rhs.area)||((this.area!= null)&&this.area.equals(rhs.area)))&&((this.subjCodeReq == rhs.subjCodeReq)||((this.subjCodeReq!= null)&&this.subjCodeReq.equals(rhs.subjCodeReq))))&&((this.attrCodeSub == rhs.attrCodeSub)||((this.attrCodeSub!= null)&&this.attrCodeSub.equals(rhs.attrCodeSub))))&&((this.actnCode == rhs.actnCode)||((this.actnCode!= null)&&this.actnCode.equals(rhs.actnCode))))&&((this.attrCodeReq == rhs.attrCodeReq)||((this.attrCodeReq!= null)&&this.attrCodeReq.equals(rhs.attrCodeReq))))&&((this.credits == rhs.credits)||((this.credits!= null)&&this.credits.equals(rhs.credits))))&&((this.crseNumbReq == rhs.crseNumbReq)||((this.crseNumbReq!= null)&&this.crseNumbReq.equals(rhs.crseNumbReq))))&&((this.maint == rhs.maint)||((this.maint!= null)&&this.maint.equals(rhs.maint))))&&((this.crseNumbSub == rhs.crseNumbSub)||((this.crseNumbSub!= null)&&this.crseNumbSub.equals(rhs.crseNumbSub))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.subjCodeSub == rhs.subjCodeSub)||((this.subjCodeSub!= null)&&this.subjCodeSub.equals(rhs.subjCodeSub))))&&((this.group == rhs.group)||((this.group!= null)&&this.group.equals(rhs.group))));
    }

}
