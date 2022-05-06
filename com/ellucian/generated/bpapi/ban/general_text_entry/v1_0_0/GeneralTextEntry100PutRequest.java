
package com.ellucian.generated.bpapi.ban.general_text_entry.v1_0_0;

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
    "keyblokDocCode",
    "keyblokDtypCode",
    "prtInd",
    "seqNum",
    "criteria.text",
    "criteria.prtInd",
    "criteria.seqNum",
    "text"
})
@Generated("jsonschema2pojo")
public class GeneralTextEntry100PutRequest {

    /**
     * Code
     * <p>
     * Lineage reference object : keyblokDocCode
     * 
     */
    @JsonProperty("keyblokDocCode")
    @JsonPropertyDescription("Lineage reference object : keyblokDocCode")
    private Object keyblokDocCode;
    /**
     * Type
     * <p>
     * Lineage reference object : keyblokDtypCode, Lookup lineage reference object : ftvdtyp
     * (Required)
     * 
     */
    @JsonProperty("keyblokDtypCode")
    @JsonPropertyDescription("Lineage reference object : keyblokDtypCode, Lookup lineage reference object : ftvdtyp")
    private Object keyblokDtypCode;
    /**
     * Lineage reference object : FOBTEXT_PRT_IND
     * 
     */
    @JsonProperty("prtInd")
    @JsonPropertyDescription("Lineage reference object : FOBTEXT_PRT_IND")
    private String prtInd;
    /**
     * Line
     * <p>
     * Lineage reference object : FOBTEXT_SEQ_NUM
     * 
     */
    @JsonProperty("seqNum")
    @JsonPropertyDescription("Lineage reference object : FOBTEXT_SEQ_NUM")
    private Double seqNum;
    /**
     * Text
     * <p>
     * Lineage reference object : FOBTEXT_TEXT
     * 
     */
    @JsonProperty("criteria.text")
    @JsonPropertyDescription("Lineage reference object : FOBTEXT_TEXT")
    private String criteriaText;
    /**
     * Lineage reference object : FOBTEXT_PRT_IND
     * 
     */
    @JsonProperty("criteria.prtInd")
    @JsonPropertyDescription("Lineage reference object : FOBTEXT_PRT_IND")
    private String criteriaPrtInd;
    /**
     * Line
     * <p>
     * Lineage reference object : FOBTEXT_SEQ_NUM
     * 
     */
    @JsonProperty("criteria.seqNum")
    @JsonPropertyDescription("Lineage reference object : FOBTEXT_SEQ_NUM")
    private Double criteriaSeqNum;
    /**
     * Text
     * <p>
     * Lineage reference object : FOBTEXT_TEXT
     * 
     */
    @JsonProperty("text")
    @JsonPropertyDescription("Lineage reference object : FOBTEXT_TEXT")
    private String text;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Code
     * <p>
     * Lineage reference object : keyblokDocCode
     * 
     */
    @JsonProperty("keyblokDocCode")
    public Object getKeyblokDocCode() {
        return keyblokDocCode;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : keyblokDocCode
     * 
     */
    @JsonProperty("keyblokDocCode")
    public void setKeyblokDocCode(Object keyblokDocCode) {
        this.keyblokDocCode = keyblokDocCode;
    }

    public GeneralTextEntry100PutRequest withKeyblokDocCode(Object keyblokDocCode) {
        this.keyblokDocCode = keyblokDocCode;
        return this;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : keyblokDtypCode, Lookup lineage reference object : ftvdtyp
     * (Required)
     * 
     */
    @JsonProperty("keyblokDtypCode")
    public Object getKeyblokDtypCode() {
        return keyblokDtypCode;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : keyblokDtypCode, Lookup lineage reference object : ftvdtyp
     * (Required)
     * 
     */
    @JsonProperty("keyblokDtypCode")
    public void setKeyblokDtypCode(Object keyblokDtypCode) {
        this.keyblokDtypCode = keyblokDtypCode;
    }

    public GeneralTextEntry100PutRequest withKeyblokDtypCode(Object keyblokDtypCode) {
        this.keyblokDtypCode = keyblokDtypCode;
        return this;
    }

    /**
     * Lineage reference object : FOBTEXT_PRT_IND
     * 
     */
    @JsonProperty("prtInd")
    public String getPrtInd() {
        return prtInd;
    }

    /**
     * Lineage reference object : FOBTEXT_PRT_IND
     * 
     */
    @JsonProperty("prtInd")
    public void setPrtInd(String prtInd) {
        this.prtInd = prtInd;
    }

    public GeneralTextEntry100PutRequest withPrtInd(String prtInd) {
        this.prtInd = prtInd;
        return this;
    }

    /**
     * Line
     * <p>
     * Lineage reference object : FOBTEXT_SEQ_NUM
     * 
     */
    @JsonProperty("seqNum")
    public Double getSeqNum() {
        return seqNum;
    }

    /**
     * Line
     * <p>
     * Lineage reference object : FOBTEXT_SEQ_NUM
     * 
     */
    @JsonProperty("seqNum")
    public void setSeqNum(Double seqNum) {
        this.seqNum = seqNum;
    }

    public GeneralTextEntry100PutRequest withSeqNum(Double seqNum) {
        this.seqNum = seqNum;
        return this;
    }

    /**
     * Text
     * <p>
     * Lineage reference object : FOBTEXT_TEXT
     * 
     */
    @JsonProperty("criteria.text")
    public String getCriteriaText() {
        return criteriaText;
    }

    /**
     * Text
     * <p>
     * Lineage reference object : FOBTEXT_TEXT
     * 
     */
    @JsonProperty("criteria.text")
    public void setCriteriaText(String criteriaText) {
        this.criteriaText = criteriaText;
    }

    public GeneralTextEntry100PutRequest withCriteriaText(String criteriaText) {
        this.criteriaText = criteriaText;
        return this;
    }

    /**
     * Lineage reference object : FOBTEXT_PRT_IND
     * 
     */
    @JsonProperty("criteria.prtInd")
    public String getCriteriaPrtInd() {
        return criteriaPrtInd;
    }

    /**
     * Lineage reference object : FOBTEXT_PRT_IND
     * 
     */
    @JsonProperty("criteria.prtInd")
    public void setCriteriaPrtInd(String criteriaPrtInd) {
        this.criteriaPrtInd = criteriaPrtInd;
    }

    public GeneralTextEntry100PutRequest withCriteriaPrtInd(String criteriaPrtInd) {
        this.criteriaPrtInd = criteriaPrtInd;
        return this;
    }

    /**
     * Line
     * <p>
     * Lineage reference object : FOBTEXT_SEQ_NUM
     * 
     */
    @JsonProperty("criteria.seqNum")
    public Double getCriteriaSeqNum() {
        return criteriaSeqNum;
    }

    /**
     * Line
     * <p>
     * Lineage reference object : FOBTEXT_SEQ_NUM
     * 
     */
    @JsonProperty("criteria.seqNum")
    public void setCriteriaSeqNum(Double criteriaSeqNum) {
        this.criteriaSeqNum = criteriaSeqNum;
    }

    public GeneralTextEntry100PutRequest withCriteriaSeqNum(Double criteriaSeqNum) {
        this.criteriaSeqNum = criteriaSeqNum;
        return this;
    }

    /**
     * Text
     * <p>
     * Lineage reference object : FOBTEXT_TEXT
     * 
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * Text
     * <p>
     * Lineage reference object : FOBTEXT_TEXT
     * 
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    public GeneralTextEntry100PutRequest withText(String text) {
        this.text = text;
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

    public GeneralTextEntry100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GeneralTextEntry100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblokDocCode");
        sb.append('=');
        sb.append(((this.keyblokDocCode == null)?"<null>":this.keyblokDocCode));
        sb.append(',');
        sb.append("keyblokDtypCode");
        sb.append('=');
        sb.append(((this.keyblokDtypCode == null)?"<null>":this.keyblokDtypCode));
        sb.append(',');
        sb.append("prtInd");
        sb.append('=');
        sb.append(((this.prtInd == null)?"<null>":this.prtInd));
        sb.append(',');
        sb.append("seqNum");
        sb.append('=');
        sb.append(((this.seqNum == null)?"<null>":this.seqNum));
        sb.append(',');
        sb.append("criteriaText");
        sb.append('=');
        sb.append(((this.criteriaText == null)?"<null>":this.criteriaText));
        sb.append(',');
        sb.append("criteriaPrtInd");
        sb.append('=');
        sb.append(((this.criteriaPrtInd == null)?"<null>":this.criteriaPrtInd));
        sb.append(',');
        sb.append("criteriaSeqNum");
        sb.append('=');
        sb.append(((this.criteriaSeqNum == null)?"<null>":this.criteriaSeqNum));
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
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
        result = ((result* 31)+((this.keyblokDocCode == null)? 0 :this.keyblokDocCode.hashCode()));
        result = ((result* 31)+((this.keyblokDtypCode == null)? 0 :this.keyblokDtypCode.hashCode()));
        result = ((result* 31)+((this.prtInd == null)? 0 :this.prtInd.hashCode()));
        result = ((result* 31)+((this.seqNum == null)? 0 :this.seqNum.hashCode()));
        result = ((result* 31)+((this.criteriaText == null)? 0 :this.criteriaText.hashCode()));
        result = ((result* 31)+((this.criteriaPrtInd == null)? 0 :this.criteriaPrtInd.hashCode()));
        result = ((result* 31)+((this.criteriaSeqNum == null)? 0 :this.criteriaSeqNum.hashCode()));
        result = ((result* 31)+((this.text == null)? 0 :this.text.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeneralTextEntry100PutRequest) == false) {
            return false;
        }
        GeneralTextEntry100PutRequest rhs = ((GeneralTextEntry100PutRequest) other);
        return ((((((((((this.keyblokDocCode == rhs.keyblokDocCode)||((this.keyblokDocCode!= null)&&this.keyblokDocCode.equals(rhs.keyblokDocCode)))&&((this.keyblokDtypCode == rhs.keyblokDtypCode)||((this.keyblokDtypCode!= null)&&this.keyblokDtypCode.equals(rhs.keyblokDtypCode))))&&((this.prtInd == rhs.prtInd)||((this.prtInd!= null)&&this.prtInd.equals(rhs.prtInd))))&&((this.seqNum == rhs.seqNum)||((this.seqNum!= null)&&this.seqNum.equals(rhs.seqNum))))&&((this.criteriaText == rhs.criteriaText)||((this.criteriaText!= null)&&this.criteriaText.equals(rhs.criteriaText))))&&((this.criteriaPrtInd == rhs.criteriaPrtInd)||((this.criteriaPrtInd!= null)&&this.criteriaPrtInd.equals(rhs.criteriaPrtInd))))&&((this.criteriaSeqNum == rhs.criteriaSeqNum)||((this.criteriaSeqNum!= null)&&this.criteriaSeqNum.equals(rhs.criteriaSeqNum))))&&((this.text == rhs.text)||((this.text!= null)&&this.text.equals(rhs.text))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
