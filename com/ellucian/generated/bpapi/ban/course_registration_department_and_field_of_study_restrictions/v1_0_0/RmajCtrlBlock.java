
package com.ellucian.generated.bpapi.ban.course_registration_department_and_field_of_study_restrictions.v1_0_0;

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
    "scrrmajMajorInd",
    "rmajCtrlEndcopy",
    "lfstDesc",
    "scrrmajLfstCode",
    "fosAll",
    "scrrmajTermCodeTo",
    "scrrmajEffTerm"
})
@Generated("jsonschema2pojo")
public class RmajCtrlBlock {

    /**
     * Include/Exclude (I/E)
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("scrrmajMajorInd")
    private String scrrmajMajorInd;
    @JsonProperty("rmajCtrlEndcopy")
    private String rmajCtrlEndcopy;
    @JsonProperty("lfstDesc")
    private String lfstDesc;
    /**
     * Type
     * <p>
     * Lineage reference object : SCRRMAJ_LFST_CODE, Lookup lineage reference object : gtvlfst
     * 
     */
    @JsonProperty("scrrmajLfstCode")
    @JsonPropertyDescription("Lineage reference object : SCRRMAJ_LFST_CODE, Lookup lineage reference object : gtvlfst")
    private String scrrmajLfstCode;
    @JsonProperty("fosAll")
    private String fosAll;
    /**
     * To Term
     * <p>
     * Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrmajTermCodeTo")
    @JsonPropertyDescription("Lookup lineage reference object : stvterm")
    private String scrrmajTermCodeTo;
    /**
     * From Term
     * <p>
     * Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrmajEffTerm")
    @JsonPropertyDescription("Lookup lineage reference object : stvterm")
    private String scrrmajEffTerm;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Include/Exclude (I/E)
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("scrrmajMajorInd")
    public String getScrrmajMajorInd() {
        return scrrmajMajorInd;
    }

    /**
     * Include/Exclude (I/E)
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("scrrmajMajorInd")
    public void setScrrmajMajorInd(String scrrmajMajorInd) {
        this.scrrmajMajorInd = scrrmajMajorInd;
    }

    public RmajCtrlBlock withScrrmajMajorInd(String scrrmajMajorInd) {
        this.scrrmajMajorInd = scrrmajMajorInd;
        return this;
    }

    @JsonProperty("rmajCtrlEndcopy")
    public String getRmajCtrlEndcopy() {
        return rmajCtrlEndcopy;
    }

    @JsonProperty("rmajCtrlEndcopy")
    public void setRmajCtrlEndcopy(String rmajCtrlEndcopy) {
        this.rmajCtrlEndcopy = rmajCtrlEndcopy;
    }

    public RmajCtrlBlock withRmajCtrlEndcopy(String rmajCtrlEndcopy) {
        this.rmajCtrlEndcopy = rmajCtrlEndcopy;
        return this;
    }

    @JsonProperty("lfstDesc")
    public String getLfstDesc() {
        return lfstDesc;
    }

    @JsonProperty("lfstDesc")
    public void setLfstDesc(String lfstDesc) {
        this.lfstDesc = lfstDesc;
    }

    public RmajCtrlBlock withLfstDesc(String lfstDesc) {
        this.lfstDesc = lfstDesc;
        return this;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : SCRRMAJ_LFST_CODE, Lookup lineage reference object : gtvlfst
     * 
     */
    @JsonProperty("scrrmajLfstCode")
    public String getScrrmajLfstCode() {
        return scrrmajLfstCode;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : SCRRMAJ_LFST_CODE, Lookup lineage reference object : gtvlfst
     * 
     */
    @JsonProperty("scrrmajLfstCode")
    public void setScrrmajLfstCode(String scrrmajLfstCode) {
        this.scrrmajLfstCode = scrrmajLfstCode;
    }

    public RmajCtrlBlock withScrrmajLfstCode(String scrrmajLfstCode) {
        this.scrrmajLfstCode = scrrmajLfstCode;
        return this;
    }

    @JsonProperty("fosAll")
    public String getFosAll() {
        return fosAll;
    }

    @JsonProperty("fosAll")
    public void setFosAll(String fosAll) {
        this.fosAll = fosAll;
    }

    public RmajCtrlBlock withFosAll(String fosAll) {
        this.fosAll = fosAll;
        return this;
    }

    /**
     * To Term
     * <p>
     * Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrmajTermCodeTo")
    public String getScrrmajTermCodeTo() {
        return scrrmajTermCodeTo;
    }

    /**
     * To Term
     * <p>
     * Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrmajTermCodeTo")
    public void setScrrmajTermCodeTo(String scrrmajTermCodeTo) {
        this.scrrmajTermCodeTo = scrrmajTermCodeTo;
    }

    public RmajCtrlBlock withScrrmajTermCodeTo(String scrrmajTermCodeTo) {
        this.scrrmajTermCodeTo = scrrmajTermCodeTo;
        return this;
    }

    /**
     * From Term
     * <p>
     * Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrmajEffTerm")
    public String getScrrmajEffTerm() {
        return scrrmajEffTerm;
    }

    /**
     * From Term
     * <p>
     * Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrmajEffTerm")
    public void setScrrmajEffTerm(String scrrmajEffTerm) {
        this.scrrmajEffTerm = scrrmajEffTerm;
    }

    public RmajCtrlBlock withScrrmajEffTerm(String scrrmajEffTerm) {
        this.scrrmajEffTerm = scrrmajEffTerm;
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

    public RmajCtrlBlock withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RmajCtrlBlock.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scrrmajMajorInd");
        sb.append('=');
        sb.append(((this.scrrmajMajorInd == null)?"<null>":this.scrrmajMajorInd));
        sb.append(',');
        sb.append("rmajCtrlEndcopy");
        sb.append('=');
        sb.append(((this.rmajCtrlEndcopy == null)?"<null>":this.rmajCtrlEndcopy));
        sb.append(',');
        sb.append("lfstDesc");
        sb.append('=');
        sb.append(((this.lfstDesc == null)?"<null>":this.lfstDesc));
        sb.append(',');
        sb.append("scrrmajLfstCode");
        sb.append('=');
        sb.append(((this.scrrmajLfstCode == null)?"<null>":this.scrrmajLfstCode));
        sb.append(',');
        sb.append("fosAll");
        sb.append('=');
        sb.append(((this.fosAll == null)?"<null>":this.fosAll));
        sb.append(',');
        sb.append("scrrmajTermCodeTo");
        sb.append('=');
        sb.append(((this.scrrmajTermCodeTo == null)?"<null>":this.scrrmajTermCodeTo));
        sb.append(',');
        sb.append("scrrmajEffTerm");
        sb.append('=');
        sb.append(((this.scrrmajEffTerm == null)?"<null>":this.scrrmajEffTerm));
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
        result = ((result* 31)+((this.scrrmajMajorInd == null)? 0 :this.scrrmajMajorInd.hashCode()));
        result = ((result* 31)+((this.rmajCtrlEndcopy == null)? 0 :this.rmajCtrlEndcopy.hashCode()));
        result = ((result* 31)+((this.lfstDesc == null)? 0 :this.lfstDesc.hashCode()));
        result = ((result* 31)+((this.scrrmajLfstCode == null)? 0 :this.scrrmajLfstCode.hashCode()));
        result = ((result* 31)+((this.fosAll == null)? 0 :this.fosAll.hashCode()));
        result = ((result* 31)+((this.scrrmajTermCodeTo == null)? 0 :this.scrrmajTermCodeTo.hashCode()));
        result = ((result* 31)+((this.scrrmajEffTerm == null)? 0 :this.scrrmajEffTerm.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RmajCtrlBlock) == false) {
            return false;
        }
        RmajCtrlBlock rhs = ((RmajCtrlBlock) other);
        return (((((((((this.scrrmajMajorInd == rhs.scrrmajMajorInd)||((this.scrrmajMajorInd!= null)&&this.scrrmajMajorInd.equals(rhs.scrrmajMajorInd)))&&((this.rmajCtrlEndcopy == rhs.rmajCtrlEndcopy)||((this.rmajCtrlEndcopy!= null)&&this.rmajCtrlEndcopy.equals(rhs.rmajCtrlEndcopy))))&&((this.lfstDesc == rhs.lfstDesc)||((this.lfstDesc!= null)&&this.lfstDesc.equals(rhs.lfstDesc))))&&((this.scrrmajLfstCode == rhs.scrrmajLfstCode)||((this.scrrmajLfstCode!= null)&&this.scrrmajLfstCode.equals(rhs.scrrmajLfstCode))))&&((this.fosAll == rhs.fosAll)||((this.fosAll!= null)&&this.fosAll.equals(rhs.fosAll))))&&((this.scrrmajTermCodeTo == rhs.scrrmajTermCodeTo)||((this.scrrmajTermCodeTo!= null)&&this.scrrmajTermCodeTo.equals(rhs.scrrmajTermCodeTo))))&&((this.scrrmajEffTerm == rhs.scrrmajEffTerm)||((this.scrrmajEffTerm!= null)&&this.scrrmajEffTerm.equals(rhs.scrrmajEffTerm))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
