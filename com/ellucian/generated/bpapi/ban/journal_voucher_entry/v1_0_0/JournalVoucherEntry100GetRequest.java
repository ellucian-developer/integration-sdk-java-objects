
package com.ellucian.generated.bpapi.ban.journal_voucher_entry.v1_0_0;

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
    "docNum",
    "subNum"
})
@Generated("jsonschema2pojo")
public class JournalVoucherEntry100GetRequest {

    /**
     * Document Number
     * <p>
     * Lineage reference object : documentNumber
     * 
     */
    @JsonProperty("docNum")
    @JsonPropertyDescription("Lineage reference object : documentNumber")
    private Object docNum;
    /**
     * Submission Number
     * <p>
     * Lineage reference object : submissionNumber
     * 
     */
    @JsonProperty("subNum")
    @JsonPropertyDescription("Lineage reference object : submissionNumber")
    private Object subNum;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Document Number
     * <p>
     * Lineage reference object : documentNumber
     * 
     */
    @JsonProperty("docNum")
    public Object getDocNum() {
        return docNum;
    }

    /**
     * Document Number
     * <p>
     * Lineage reference object : documentNumber
     * 
     */
    @JsonProperty("docNum")
    public void setDocNum(Object docNum) {
        this.docNum = docNum;
    }

    public JournalVoucherEntry100GetRequest withDocNum(Object docNum) {
        this.docNum = docNum;
        return this;
    }

    /**
     * Submission Number
     * <p>
     * Lineage reference object : submissionNumber
     * 
     */
    @JsonProperty("subNum")
    public Object getSubNum() {
        return subNum;
    }

    /**
     * Submission Number
     * <p>
     * Lineage reference object : submissionNumber
     * 
     */
    @JsonProperty("subNum")
    public void setSubNum(Object subNum) {
        this.subNum = subNum;
    }

    public JournalVoucherEntry100GetRequest withSubNum(Object subNum) {
        this.subNum = subNum;
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

    public JournalVoucherEntry100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(JournalVoucherEntry100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("docNum");
        sb.append('=');
        sb.append(((this.docNum == null)?"<null>":this.docNum));
        sb.append(',');
        sb.append("subNum");
        sb.append('=');
        sb.append(((this.subNum == null)?"<null>":this.subNum));
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
        result = ((result* 31)+((this.docNum == null)? 0 :this.docNum.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.subNum == null)? 0 :this.subNum.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JournalVoucherEntry100GetRequest) == false) {
            return false;
        }
        JournalVoucherEntry100GetRequest rhs = ((JournalVoucherEntry100GetRequest) other);
        return ((((this.docNum == rhs.docNum)||((this.docNum!= null)&&this.docNum.equals(rhs.docNum)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.subNum == rhs.subNum)||((this.subNum!= null)&&this.subNum.equals(rhs.subNum))));
    }

}
