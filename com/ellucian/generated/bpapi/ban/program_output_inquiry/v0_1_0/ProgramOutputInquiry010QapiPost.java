
package com.ellucian.generated.bpapi.ban.program_output_inquiry.v0_1_0;

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
    "requestNo",
    "termCodeEff",
    "captiveInd",
    "singleInd"
})
@Generated("jsonschema2pojo")
public class ProgramOutputInquiry010QapiPost {

    @JsonProperty("id")
    private String id;
    @JsonProperty("requestNo")
    private String requestNo;
    /**
     * Term Effective
     * <p>
     * Lineage reference object : SMBPOGN_TERM_CODE_EFF
     * 
     */
    @JsonProperty("termCodeEff")
    @JsonPropertyDescription("Lineage reference object : SMBPOGN_TERM_CODE_EFF")
    private String termCodeEff;
    /**
     * Captive Program
     * <p>
     * Lineage reference object : SMBPOGN_CAPTIVE_IND
     * 
     */
    @JsonProperty("captiveInd")
    @JsonPropertyDescription("Lineage reference object : SMBPOGN_CAPTIVE_IND")
    private String captiveInd;
    /**
     * Single Entity
     * <p>
     * Lineage reference object : SMBPOGN_SINGLE_IND
     * 
     */
    @JsonProperty("singleInd")
    @JsonPropertyDescription("Lineage reference object : SMBPOGN_SINGLE_IND")
    private String singleInd;
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

    public ProgramOutputInquiry010QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("requestNo")
    public String getRequestNo() {
        return requestNo;
    }

    @JsonProperty("requestNo")
    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }

    public ProgramOutputInquiry010QapiPost withRequestNo(String requestNo) {
        this.requestNo = requestNo;
        return this;
    }

    /**
     * Term Effective
     * <p>
     * Lineage reference object : SMBPOGN_TERM_CODE_EFF
     * 
     */
    @JsonProperty("termCodeEff")
    public String getTermCodeEff() {
        return termCodeEff;
    }

    /**
     * Term Effective
     * <p>
     * Lineage reference object : SMBPOGN_TERM_CODE_EFF
     * 
     */
    @JsonProperty("termCodeEff")
    public void setTermCodeEff(String termCodeEff) {
        this.termCodeEff = termCodeEff;
    }

    public ProgramOutputInquiry010QapiPost withTermCodeEff(String termCodeEff) {
        this.termCodeEff = termCodeEff;
        return this;
    }

    /**
     * Captive Program
     * <p>
     * Lineage reference object : SMBPOGN_CAPTIVE_IND
     * 
     */
    @JsonProperty("captiveInd")
    public String getCaptiveInd() {
        return captiveInd;
    }

    /**
     * Captive Program
     * <p>
     * Lineage reference object : SMBPOGN_CAPTIVE_IND
     * 
     */
    @JsonProperty("captiveInd")
    public void setCaptiveInd(String captiveInd) {
        this.captiveInd = captiveInd;
    }

    public ProgramOutputInquiry010QapiPost withCaptiveInd(String captiveInd) {
        this.captiveInd = captiveInd;
        return this;
    }

    /**
     * Single Entity
     * <p>
     * Lineage reference object : SMBPOGN_SINGLE_IND
     * 
     */
    @JsonProperty("singleInd")
    public String getSingleInd() {
        return singleInd;
    }

    /**
     * Single Entity
     * <p>
     * Lineage reference object : SMBPOGN_SINGLE_IND
     * 
     */
    @JsonProperty("singleInd")
    public void setSingleInd(String singleInd) {
        this.singleInd = singleInd;
    }

    public ProgramOutputInquiry010QapiPost withSingleInd(String singleInd) {
        this.singleInd = singleInd;
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

    public ProgramOutputInquiry010QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ProgramOutputInquiry010QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("requestNo");
        sb.append('=');
        sb.append(((this.requestNo == null)?"<null>":this.requestNo));
        sb.append(',');
        sb.append("termCodeEff");
        sb.append('=');
        sb.append(((this.termCodeEff == null)?"<null>":this.termCodeEff));
        sb.append(',');
        sb.append("captiveInd");
        sb.append('=');
        sb.append(((this.captiveInd == null)?"<null>":this.captiveInd));
        sb.append(',');
        sb.append("singleInd");
        sb.append('=');
        sb.append(((this.singleInd == null)?"<null>":this.singleInd));
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
        result = ((result* 31)+((this.termCodeEff == null)? 0 :this.termCodeEff.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.requestNo == null)? 0 :this.requestNo.hashCode()));
        result = ((result* 31)+((this.singleInd == null)? 0 :this.singleInd.hashCode()));
        result = ((result* 31)+((this.captiveInd == null)? 0 :this.captiveInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProgramOutputInquiry010QapiPost) == false) {
            return false;
        }
        ProgramOutputInquiry010QapiPost rhs = ((ProgramOutputInquiry010QapiPost) other);
        return (((((((this.termCodeEff == rhs.termCodeEff)||((this.termCodeEff!= null)&&this.termCodeEff.equals(rhs.termCodeEff)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.requestNo == rhs.requestNo)||((this.requestNo!= null)&&this.requestNo.equals(rhs.requestNo))))&&((this.singleInd == rhs.singleInd)||((this.singleInd!= null)&&this.singleInd.equals(rhs.singleInd))))&&((this.captiveInd == rhs.captiveInd)||((this.captiveInd!= null)&&this.captiveInd.equals(rhs.captiveInd))));
    }

}
