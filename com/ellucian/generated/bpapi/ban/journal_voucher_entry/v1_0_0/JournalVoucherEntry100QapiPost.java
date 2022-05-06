
package com.ellucian.generated.bpapi.ban.journal_voucher_entry.v1_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "docNum",
    "subNum"
})
@Generated("jsonschema2pojo")
public class JournalVoucherEntry100QapiPost {

    @JsonProperty("docNum")
    private String docNum;
    @JsonProperty("subNum")
    private String subNum;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("docNum")
    public String getDocNum() {
        return docNum;
    }

    @JsonProperty("docNum")
    public void setDocNum(String docNum) {
        this.docNum = docNum;
    }

    public JournalVoucherEntry100QapiPost withDocNum(String docNum) {
        this.docNum = docNum;
        return this;
    }

    @JsonProperty("subNum")
    public String getSubNum() {
        return subNum;
    }

    @JsonProperty("subNum")
    public void setSubNum(String subNum) {
        this.subNum = subNum;
    }

    public JournalVoucherEntry100QapiPost withSubNum(String subNum) {
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

    public JournalVoucherEntry100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(JournalVoucherEntry100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof JournalVoucherEntry100QapiPost) == false) {
            return false;
        }
        JournalVoucherEntry100QapiPost rhs = ((JournalVoucherEntry100QapiPost) other);
        return ((((this.docNum == rhs.docNum)||((this.docNum!= null)&&this.docNum.equals(rhs.docNum)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.subNum == rhs.subNum)||((this.subNum!= null)&&this.subNum.equals(rhs.subNum))));
    }

}
