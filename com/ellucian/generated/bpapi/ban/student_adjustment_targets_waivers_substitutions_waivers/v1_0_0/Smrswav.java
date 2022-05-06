
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
    "crseNumb",
    "actnCode",
    "attrCode",
    "credits",
    "maint",
    "subjCode",
    "group"
})
@Generated("jsonschema2pojo")
public class Smrswav {

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
     * Smrswav Attr Code
     * <p>
     * Lineage reference object : SMRSWAV_ATTR_CODE, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("attrCode")
    @JsonPropertyDescription("Lineage reference object : SMRSWAV_ATTR_CODE, Lookup lineage reference object : stvattr")
    private String attrCode;
    /**
     * Smrswav Credits
     * <p>
     * Lineage reference object : SMRSWAV_CREDITS
     * 
     */
    @JsonProperty("credits")
    @JsonPropertyDescription("Lineage reference object : SMRSWAV_CREDITS")
    private Double credits;
    @JsonProperty("maint")
    private String maint;
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

    public Smrswav withArea(String area) {
        this.area = area;
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

    public Smrswav withCrseNumb(String crseNumb) {
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

    public Smrswav withActnCode(String actnCode) {
        this.actnCode = actnCode;
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

    public Smrswav withAttrCode(String attrCode) {
        this.attrCode = attrCode;
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

    public Smrswav withCredits(Double credits) {
        this.credits = credits;
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

    public Smrswav withMaint(String maint) {
        this.maint = maint;
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

    public Smrswav withSubjCode(String subjCode) {
        this.subjCode = subjCode;
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

    public Smrswav withGroup(String group) {
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

    public Smrswav withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Smrswav.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("area");
        sb.append('=');
        sb.append(((this.area == null)?"<null>":this.area));
        sb.append(',');
        sb.append("crseNumb");
        sb.append('=');
        sb.append(((this.crseNumb == null)?"<null>":this.crseNumb));
        sb.append(',');
        sb.append("actnCode");
        sb.append('=');
        sb.append(((this.actnCode == null)?"<null>":this.actnCode));
        sb.append(',');
        sb.append("attrCode");
        sb.append('=');
        sb.append(((this.attrCode == null)?"<null>":this.attrCode));
        sb.append(',');
        sb.append("credits");
        sb.append('=');
        sb.append(((this.credits == null)?"<null>":this.credits));
        sb.append(',');
        sb.append("maint");
        sb.append('=');
        sb.append(((this.maint == null)?"<null>":this.maint));
        sb.append(',');
        sb.append("subjCode");
        sb.append('=');
        sb.append(((this.subjCode == null)?"<null>":this.subjCode));
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
        result = ((result* 31)+((this.actnCode == null)? 0 :this.actnCode.hashCode()));
        result = ((result* 31)+((this.attrCode == null)? 0 :this.attrCode.hashCode()));
        result = ((result* 31)+((this.credits == null)? 0 :this.credits.hashCode()));
        result = ((result* 31)+((this.maint == null)? 0 :this.maint.hashCode()));
        result = ((result* 31)+((this.subjCode == null)? 0 :this.subjCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.group == null)? 0 :this.group.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Smrswav) == false) {
            return false;
        }
        Smrswav rhs = ((Smrswav) other);
        return ((((((((((this.area == rhs.area)||((this.area!= null)&&this.area.equals(rhs.area)))&&((this.crseNumb == rhs.crseNumb)||((this.crseNumb!= null)&&this.crseNumb.equals(rhs.crseNumb))))&&((this.actnCode == rhs.actnCode)||((this.actnCode!= null)&&this.actnCode.equals(rhs.actnCode))))&&((this.attrCode == rhs.attrCode)||((this.attrCode!= null)&&this.attrCode.equals(rhs.attrCode))))&&((this.credits == rhs.credits)||((this.credits!= null)&&this.credits.equals(rhs.credits))))&&((this.maint == rhs.maint)||((this.maint!= null)&&this.maint.equals(rhs.maint))))&&((this.subjCode == rhs.subjCode)||((this.subjCode!= null)&&this.subjCode.equals(rhs.subjCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.group == rhs.group)||((this.group!= null)&&this.group.equals(rhs.group))));
    }

}
