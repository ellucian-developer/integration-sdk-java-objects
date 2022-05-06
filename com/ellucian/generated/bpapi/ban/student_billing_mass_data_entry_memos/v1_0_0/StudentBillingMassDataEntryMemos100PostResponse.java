
package com.ellucian.generated.bpapi.ban.student_billing_mass_data_entry_memos.v1_0_0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "tbrmemo",
    "key_block3"
})
@Generated("jsonschema2pojo")
public class StudentBillingMassDataEntryMemos100PostResponse {

    @JsonProperty("tbrmemo")
    private List<Tbrmemo> tbrmemo = new ArrayList<Tbrmemo>();
    @JsonProperty("key_block3")
    private List<KeyBlock3> keyBlock3 = new ArrayList<KeyBlock3>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("tbrmemo")
    public List<Tbrmemo> getTbrmemo() {
        return tbrmemo;
    }

    @JsonProperty("tbrmemo")
    public void setTbrmemo(List<Tbrmemo> tbrmemo) {
        this.tbrmemo = tbrmemo;
    }

    public StudentBillingMassDataEntryMemos100PostResponse withTbrmemo(List<Tbrmemo> tbrmemo) {
        this.tbrmemo = tbrmemo;
        return this;
    }

    @JsonProperty("key_block3")
    public List<KeyBlock3> getKeyBlock3() {
        return keyBlock3;
    }

    @JsonProperty("key_block3")
    public void setKeyBlock3(List<KeyBlock3> keyBlock3) {
        this.keyBlock3 = keyBlock3;
    }

    public StudentBillingMassDataEntryMemos100PostResponse withKeyBlock3(List<KeyBlock3> keyBlock3) {
        this.keyBlock3 = keyBlock3;
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

    public StudentBillingMassDataEntryMemos100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentBillingMassDataEntryMemos100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tbrmemo");
        sb.append('=');
        sb.append(((this.tbrmemo == null)?"<null>":this.tbrmemo));
        sb.append(',');
        sb.append("keyBlock3");
        sb.append('=');
        sb.append(((this.keyBlock3 == null)?"<null>":this.keyBlock3));
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
        result = ((result* 31)+((this.tbrmemo == null)? 0 :this.tbrmemo.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.keyBlock3 == null)? 0 :this.keyBlock3 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentBillingMassDataEntryMemos100PostResponse) == false) {
            return false;
        }
        StudentBillingMassDataEntryMemos100PostResponse rhs = ((StudentBillingMassDataEntryMemos100PostResponse) other);
        return ((((this.tbrmemo == rhs.tbrmemo)||((this.tbrmemo!= null)&&this.tbrmemo.equals(rhs.tbrmemo)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.keyBlock3 == rhs.keyBlock3)||((this.keyBlock3 != null)&&this.keyBlock3 .equals(rhs.keyBlock3))));
    }

}
