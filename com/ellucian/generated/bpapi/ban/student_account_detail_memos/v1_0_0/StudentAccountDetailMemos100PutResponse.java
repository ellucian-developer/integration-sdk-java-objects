
package com.ellucian.generated.bpapi.ban.student_account_detail_memos.v1_0_0;

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
    "tbraccd_ctrl"
})
@Generated("jsonschema2pojo")
public class StudentAccountDetailMemos100PutResponse {

    @JsonProperty("tbrmemo")
    private List<Tbrmemo> tbrmemo = new ArrayList<Tbrmemo>();
    @JsonProperty("tbraccd_ctrl")
    private List<TbraccdCtrl> tbraccdCtrl = new ArrayList<TbraccdCtrl>();
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

    public StudentAccountDetailMemos100PutResponse withTbrmemo(List<Tbrmemo> tbrmemo) {
        this.tbrmemo = tbrmemo;
        return this;
    }

    @JsonProperty("tbraccd_ctrl")
    public List<TbraccdCtrl> getTbraccdCtrl() {
        return tbraccdCtrl;
    }

    @JsonProperty("tbraccd_ctrl")
    public void setTbraccdCtrl(List<TbraccdCtrl> tbraccdCtrl) {
        this.tbraccdCtrl = tbraccdCtrl;
    }

    public StudentAccountDetailMemos100PutResponse withTbraccdCtrl(List<TbraccdCtrl> tbraccdCtrl) {
        this.tbraccdCtrl = tbraccdCtrl;
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

    public StudentAccountDetailMemos100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentAccountDetailMemos100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tbrmemo");
        sb.append('=');
        sb.append(((this.tbrmemo == null)?"<null>":this.tbrmemo));
        sb.append(',');
        sb.append("tbraccdCtrl");
        sb.append('=');
        sb.append(((this.tbraccdCtrl == null)?"<null>":this.tbraccdCtrl));
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
        result = ((result* 31)+((this.tbraccdCtrl == null)? 0 :this.tbraccdCtrl.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentAccountDetailMemos100PutResponse) == false) {
            return false;
        }
        StudentAccountDetailMemos100PutResponse rhs = ((StudentAccountDetailMemos100PutResponse) other);
        return ((((this.tbrmemo == rhs.tbrmemo)||((this.tbrmemo!= null)&&this.tbrmemo.equals(rhs.tbrmemo)))&&((this.tbraccdCtrl == rhs.tbraccdCtrl)||((this.tbraccdCtrl!= null)&&this.tbraccdCtrl.equals(rhs.tbraccdCtrl))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
