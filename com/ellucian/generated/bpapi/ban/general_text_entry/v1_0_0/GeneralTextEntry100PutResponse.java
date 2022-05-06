
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
    "prtInd",
    "seqNum",
    "text"
})
@Generated("jsonschema2pojo")
public class GeneralTextEntry100PutResponse {

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
    @JsonProperty("text")
    @JsonPropertyDescription("Lineage reference object : FOBTEXT_TEXT")
    private String text;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public GeneralTextEntry100PutResponse withPrtInd(String prtInd) {
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

    public GeneralTextEntry100PutResponse withSeqNum(Double seqNum) {
        this.seqNum = seqNum;
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

    public GeneralTextEntry100PutResponse withText(String text) {
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

    public GeneralTextEntry100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GeneralTextEntry100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("prtInd");
        sb.append('=');
        sb.append(((this.prtInd == null)?"<null>":this.prtInd));
        sb.append(',');
        sb.append("seqNum");
        sb.append('=');
        sb.append(((this.seqNum == null)?"<null>":this.seqNum));
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
        result = ((result* 31)+((this.text == null)? 0 :this.text.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.prtInd == null)? 0 :this.prtInd.hashCode()));
        result = ((result* 31)+((this.seqNum == null)? 0 :this.seqNum.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeneralTextEntry100PutResponse) == false) {
            return false;
        }
        GeneralTextEntry100PutResponse rhs = ((GeneralTextEntry100PutResponse) other);
        return (((((this.text == rhs.text)||((this.text!= null)&&this.text.equals(rhs.text)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.prtInd == rhs.prtInd)||((this.prtInd!= null)&&this.prtInd.equals(rhs.prtInd))))&&((this.seqNum == rhs.seqNum)||((this.seqNum!= null)&&this.seqNum.equals(rhs.seqNum))));
    }

}
