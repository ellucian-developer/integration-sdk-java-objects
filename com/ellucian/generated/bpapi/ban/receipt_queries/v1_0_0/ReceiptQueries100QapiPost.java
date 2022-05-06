
package com.ellucian.generated.bpapi.ban.receipt_queries.v1_0_0;

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
    "executeBtn"
})
@Generated("jsonschema2pojo")
public class ReceiptQueries100QapiPost {

    @JsonProperty("executeBtn")
    private String executeBtn;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("executeBtn")
    public String getExecuteBtn() {
        return executeBtn;
    }

    @JsonProperty("executeBtn")
    public void setExecuteBtn(String executeBtn) {
        this.executeBtn = executeBtn;
    }

    public ReceiptQueries100QapiPost withExecuteBtn(String executeBtn) {
        this.executeBtn = executeBtn;
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

    public ReceiptQueries100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ReceiptQueries100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("executeBtn");
        sb.append('=');
        sb.append(((this.executeBtn == null)?"<null>":this.executeBtn));
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
        result = ((result* 31)+((this.executeBtn == null)? 0 :this.executeBtn.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReceiptQueries100QapiPost) == false) {
            return false;
        }
        ReceiptQueries100QapiPost rhs = ((ReceiptQueries100QapiPost) other);
        return (((this.executeBtn == rhs.executeBtn)||((this.executeBtn!= null)&&this.executeBtn.equals(rhs.executeBtn)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
