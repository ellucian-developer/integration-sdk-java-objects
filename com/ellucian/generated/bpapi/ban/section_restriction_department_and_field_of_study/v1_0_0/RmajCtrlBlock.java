
package com.ellucian.generated.bpapi.ban.section_restriction_department_and_field_of_study.v1_0_0;

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
    "lfstDesc",
    "fosAll",
    "ssrrmajMajorIndVit",
    "ssrrmajLfstCode"
})
@Generated("jsonschema2pojo")
public class RmajCtrlBlock {

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("lfstDesc")
    private String lfstDesc;
    @JsonProperty("fosAll")
    private String fosAll;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ssrrmajMajorIndVit")
    private String ssrrmajMajorIndVit;
    /**
     * Type
     * <p>
     * Lineage reference object : SSRRMAJ_LFST_CODE, Lookup lineage reference object : gtvlfst
     * 
     */
    @JsonProperty("ssrrmajLfstCode")
    @JsonPropertyDescription("Lineage reference object : SSRRMAJ_LFST_CODE, Lookup lineage reference object : gtvlfst")
    private String ssrrmajLfstCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("lfstDesc")
    public String getLfstDesc() {
        return lfstDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("lfstDesc")
    public void setLfstDesc(String lfstDesc) {
        this.lfstDesc = lfstDesc;
    }

    public RmajCtrlBlock withLfstDesc(String lfstDesc) {
        this.lfstDesc = lfstDesc;
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
     * 
     * (Required)
     * 
     */
    @JsonProperty("ssrrmajMajorIndVit")
    public String getSsrrmajMajorIndVit() {
        return ssrrmajMajorIndVit;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ssrrmajMajorIndVit")
    public void setSsrrmajMajorIndVit(String ssrrmajMajorIndVit) {
        this.ssrrmajMajorIndVit = ssrrmajMajorIndVit;
    }

    public RmajCtrlBlock withSsrrmajMajorIndVit(String ssrrmajMajorIndVit) {
        this.ssrrmajMajorIndVit = ssrrmajMajorIndVit;
        return this;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : SSRRMAJ_LFST_CODE, Lookup lineage reference object : gtvlfst
     * 
     */
    @JsonProperty("ssrrmajLfstCode")
    public String getSsrrmajLfstCode() {
        return ssrrmajLfstCode;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : SSRRMAJ_LFST_CODE, Lookup lineage reference object : gtvlfst
     * 
     */
    @JsonProperty("ssrrmajLfstCode")
    public void setSsrrmajLfstCode(String ssrrmajLfstCode) {
        this.ssrrmajLfstCode = ssrrmajLfstCode;
    }

    public RmajCtrlBlock withSsrrmajLfstCode(String ssrrmajLfstCode) {
        this.ssrrmajLfstCode = ssrrmajLfstCode;
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
        sb.append("lfstDesc");
        sb.append('=');
        sb.append(((this.lfstDesc == null)?"<null>":this.lfstDesc));
        sb.append(',');
        sb.append("fosAll");
        sb.append('=');
        sb.append(((this.fosAll == null)?"<null>":this.fosAll));
        sb.append(',');
        sb.append("ssrrmajMajorIndVit");
        sb.append('=');
        sb.append(((this.ssrrmajMajorIndVit == null)?"<null>":this.ssrrmajMajorIndVit));
        sb.append(',');
        sb.append("ssrrmajLfstCode");
        sb.append('=');
        sb.append(((this.ssrrmajLfstCode == null)?"<null>":this.ssrrmajLfstCode));
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
        result = ((result* 31)+((this.fosAll == null)? 0 :this.fosAll.hashCode()));
        result = ((result* 31)+((this.ssrrmajMajorIndVit == null)? 0 :this.ssrrmajMajorIndVit.hashCode()));
        result = ((result* 31)+((this.ssrrmajLfstCode == null)? 0 :this.ssrrmajLfstCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.lfstDesc == null)? 0 :this.lfstDesc.hashCode()));
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
        return ((((((this.fosAll == rhs.fosAll)||((this.fosAll!= null)&&this.fosAll.equals(rhs.fosAll)))&&((this.ssrrmajMajorIndVit == rhs.ssrrmajMajorIndVit)||((this.ssrrmajMajorIndVit!= null)&&this.ssrrmajMajorIndVit.equals(rhs.ssrrmajMajorIndVit))))&&((this.ssrrmajLfstCode == rhs.ssrrmajLfstCode)||((this.ssrrmajLfstCode!= null)&&this.ssrrmajLfstCode.equals(rhs.ssrrmajLfstCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.lfstDesc == rhs.lfstDesc)||((this.lfstDesc!= null)&&this.lfstDesc.equals(rhs.lfstDesc))));
    }

}
