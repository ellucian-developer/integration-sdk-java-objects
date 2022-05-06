
package com.ellucian.generated.bpapi.ban.research_accounting_billing_detail_inquiry.v1_0_0;

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
    "keyblckFundCode",
    "keyblckCoasCode",
    "code",
    "keyblckGrntCode",
    "title"
})
@Generated("jsonschema2pojo")
public class ResearchAccountingBillingDetailInquiry100GetRequest {

    /**
     * Fund
     * <p>
     * Lineage reference object : keyblckFundCode
     * 
     */
    @JsonProperty("keyblckFundCode")
    @JsonPropertyDescription("Lineage reference object : keyblckFundCode")
    private Object keyblckFundCode;
    /**
     * COA
     * <p>
     * Lineage reference object : keyblckCoasCode
     * (Required)
     * 
     */
    @JsonProperty("keyblckCoasCode")
    @JsonPropertyDescription("Lineage reference object : keyblckCoasCode")
    private Object keyblckCoasCode;
    /**
     * Frbgrnt Code
     * <p>
     * Lineage reference object : FRBGRNT_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_CODE")
    private String code;
    /**
     * Grant
     * <p>
     * Lineage reference object : keyblckGrntCode
     * 
     */
    @JsonProperty("keyblckGrntCode")
    @JsonPropertyDescription("Lineage reference object : keyblckGrntCode")
    private Object keyblckGrntCode;
    /**
     * Frbgrnt Title
     * <p>
     * Lineage reference object : FRBGRNT_TITLE
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_TITLE")
    private String title;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Fund
     * <p>
     * Lineage reference object : keyblckFundCode
     * 
     */
    @JsonProperty("keyblckFundCode")
    public Object getKeyblckFundCode() {
        return keyblckFundCode;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : keyblckFundCode
     * 
     */
    @JsonProperty("keyblckFundCode")
    public void setKeyblckFundCode(Object keyblckFundCode) {
        this.keyblckFundCode = keyblckFundCode;
    }

    public ResearchAccountingBillingDetailInquiry100GetRequest withKeyblckFundCode(Object keyblckFundCode) {
        this.keyblckFundCode = keyblckFundCode;
        return this;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : keyblckCoasCode
     * (Required)
     * 
     */
    @JsonProperty("keyblckCoasCode")
    public Object getKeyblckCoasCode() {
        return keyblckCoasCode;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : keyblckCoasCode
     * (Required)
     * 
     */
    @JsonProperty("keyblckCoasCode")
    public void setKeyblckCoasCode(Object keyblckCoasCode) {
        this.keyblckCoasCode = keyblckCoasCode;
    }

    public ResearchAccountingBillingDetailInquiry100GetRequest withKeyblckCoasCode(Object keyblckCoasCode) {
        this.keyblckCoasCode = keyblckCoasCode;
        return this;
    }

    /**
     * Frbgrnt Code
     * <p>
     * Lineage reference object : FRBGRNT_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Frbgrnt Code
     * <p>
     * Lineage reference object : FRBGRNT_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public ResearchAccountingBillingDetailInquiry100GetRequest withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Grant
     * <p>
     * Lineage reference object : keyblckGrntCode
     * 
     */
    @JsonProperty("keyblckGrntCode")
    public Object getKeyblckGrntCode() {
        return keyblckGrntCode;
    }

    /**
     * Grant
     * <p>
     * Lineage reference object : keyblckGrntCode
     * 
     */
    @JsonProperty("keyblckGrntCode")
    public void setKeyblckGrntCode(Object keyblckGrntCode) {
        this.keyblckGrntCode = keyblckGrntCode;
    }

    public ResearchAccountingBillingDetailInquiry100GetRequest withKeyblckGrntCode(Object keyblckGrntCode) {
        this.keyblckGrntCode = keyblckGrntCode;
        return this;
    }

    /**
     * Frbgrnt Title
     * <p>
     * Lineage reference object : FRBGRNT_TITLE
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Frbgrnt Title
     * <p>
     * Lineage reference object : FRBGRNT_TITLE
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public ResearchAccountingBillingDetailInquiry100GetRequest withTitle(String title) {
        this.title = title;
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

    public ResearchAccountingBillingDetailInquiry100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ResearchAccountingBillingDetailInquiry100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblckFundCode");
        sb.append('=');
        sb.append(((this.keyblckFundCode == null)?"<null>":this.keyblckFundCode));
        sb.append(',');
        sb.append("keyblckCoasCode");
        sb.append('=');
        sb.append(((this.keyblckCoasCode == null)?"<null>":this.keyblckCoasCode));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("keyblckGrntCode");
        sb.append('=');
        sb.append(((this.keyblckGrntCode == null)?"<null>":this.keyblckGrntCode));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
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
        result = ((result* 31)+((this.keyblckFundCode == null)? 0 :this.keyblckFundCode.hashCode()));
        result = ((result* 31)+((this.keyblckCoasCode == null)? 0 :this.keyblckCoasCode.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.keyblckGrntCode == null)? 0 :this.keyblckGrntCode.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResearchAccountingBillingDetailInquiry100GetRequest) == false) {
            return false;
        }
        ResearchAccountingBillingDetailInquiry100GetRequest rhs = ((ResearchAccountingBillingDetailInquiry100GetRequest) other);
        return (((((((this.keyblckFundCode == rhs.keyblckFundCode)||((this.keyblckFundCode!= null)&&this.keyblckFundCode.equals(rhs.keyblckFundCode)))&&((this.keyblckCoasCode == rhs.keyblckCoasCode)||((this.keyblckCoasCode!= null)&&this.keyblckCoasCode.equals(rhs.keyblckCoasCode))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.keyblckGrntCode == rhs.keyblckGrntCode)||((this.keyblckGrntCode!= null)&&this.keyblckGrntCode.equals(rhs.keyblckGrntCode))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))));
    }

}
