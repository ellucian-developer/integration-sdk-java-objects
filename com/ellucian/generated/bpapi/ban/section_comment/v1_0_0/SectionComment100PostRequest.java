
package com.ellucian.generated.bpapi.ban.section_comment.v1_0_0;

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
    "ssasectTermCode",
    "ssasectCrn",
    "text",
    "textNarrative"
})
@Generated("jsonschema2pojo")
public class SectionComment100PostRequest {

    /**
     * Term
     * <p>
     * Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("ssasectTermCode")
    @JsonPropertyDescription("Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm")
    private String ssasectTermCode;
    /**
     * CRN
     * <p>
     * Lineage reference object : ssasectCrn
     * 
     */
    @JsonProperty("ssasectCrn")
    @JsonPropertyDescription("Lineage reference object : ssasectCrn")
    private String ssasectCrn;
    /**
     * Section Text
     * <p>
     * Lineage reference object : SSRTEXT_TEXT
     * (Required)
     * 
     */
    @JsonProperty("text")
    @JsonPropertyDescription("Lineage reference object : SSRTEXT_TEXT")
    private String text;
    /**
     * Section Long Text
     * <p>
     * Lineage reference object : SSBDESC_TEXT_NARRATIVE
     * 
     */
    @JsonProperty("textNarrative")
    @JsonPropertyDescription("Lineage reference object : SSBDESC_TEXT_NARRATIVE")
    private Object textNarrative;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Term
     * <p>
     * Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("ssasectTermCode")
    public String getSsasectTermCode() {
        return ssasectTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("ssasectTermCode")
    public void setSsasectTermCode(String ssasectTermCode) {
        this.ssasectTermCode = ssasectTermCode;
    }

    public SectionComment100PostRequest withSsasectTermCode(String ssasectTermCode) {
        this.ssasectTermCode = ssasectTermCode;
        return this;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : ssasectCrn
     * 
     */
    @JsonProperty("ssasectCrn")
    public String getSsasectCrn() {
        return ssasectCrn;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : ssasectCrn
     * 
     */
    @JsonProperty("ssasectCrn")
    public void setSsasectCrn(String ssasectCrn) {
        this.ssasectCrn = ssasectCrn;
    }

    public SectionComment100PostRequest withSsasectCrn(String ssasectCrn) {
        this.ssasectCrn = ssasectCrn;
        return this;
    }

    /**
     * Section Text
     * <p>
     * Lineage reference object : SSRTEXT_TEXT
     * (Required)
     * 
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * Section Text
     * <p>
     * Lineage reference object : SSRTEXT_TEXT
     * (Required)
     * 
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    public SectionComment100PostRequest withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Section Long Text
     * <p>
     * Lineage reference object : SSBDESC_TEXT_NARRATIVE
     * 
     */
    @JsonProperty("textNarrative")
    public Object getTextNarrative() {
        return textNarrative;
    }

    /**
     * Section Long Text
     * <p>
     * Lineage reference object : SSBDESC_TEXT_NARRATIVE
     * 
     */
    @JsonProperty("textNarrative")
    public void setTextNarrative(Object textNarrative) {
        this.textNarrative = textNarrative;
    }

    public SectionComment100PostRequest withTextNarrative(Object textNarrative) {
        this.textNarrative = textNarrative;
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

    public SectionComment100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SectionComment100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssasectTermCode");
        sb.append('=');
        sb.append(((this.ssasectTermCode == null)?"<null>":this.ssasectTermCode));
        sb.append(',');
        sb.append("ssasectCrn");
        sb.append('=');
        sb.append(((this.ssasectCrn == null)?"<null>":this.ssasectCrn));
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
        sb.append(',');
        sb.append("textNarrative");
        sb.append('=');
        sb.append(((this.textNarrative == null)?"<null>":this.textNarrative));
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
        result = ((result* 31)+((this.text == null)? 0 :this.text.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ssasectTermCode == null)? 0 :this.ssasectTermCode.hashCode()));
        result = ((result* 31)+((this.textNarrative == null)? 0 :this.textNarrative.hashCode()));
        result = ((result* 31)+((this.ssasectCrn == null)? 0 :this.ssasectCrn.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SectionComment100PostRequest) == false) {
            return false;
        }
        SectionComment100PostRequest rhs = ((SectionComment100PostRequest) other);
        return ((((((this.text == rhs.text)||((this.text!= null)&&this.text.equals(rhs.text)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ssasectTermCode == rhs.ssasectTermCode)||((this.ssasectTermCode!= null)&&this.ssasectTermCode.equals(rhs.ssasectTermCode))))&&((this.textNarrative == rhs.textNarrative)||((this.textNarrative!= null)&&this.textNarrative.equals(rhs.textNarrative))))&&((this.ssasectCrn == rhs.ssasectCrn)||((this.ssasectCrn!= null)&&this.ssasectCrn.equals(rhs.ssasectCrn))));
    }

}
