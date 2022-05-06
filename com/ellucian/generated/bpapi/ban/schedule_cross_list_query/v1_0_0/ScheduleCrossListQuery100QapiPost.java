
package com.ellucian.generated.bpapi.ban.schedule_cross_list_query.v1_0_0;

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
    "termCode",
    "xlstGroup",
    "maxEnrl",
    "enrl",
    "seatsAvail"
})
@Generated("jsonschema2pojo")
public class ScheduleCrossListQuery100QapiPost {

    @JsonProperty("termCode")
    private String termCode;
    @JsonProperty("xlstGroup")
    private String xlstGroup;
    @JsonProperty("maxEnrl")
    private String maxEnrl;
    @JsonProperty("enrl")
    private String enrl;
    @JsonProperty("seatsAvail")
    private String seatsAvail;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public ScheduleCrossListQuery100QapiPost withTermCode(String termCode) {
        this.termCode = termCode;
        return this;
    }

    @JsonProperty("xlstGroup")
    public String getXlstGroup() {
        return xlstGroup;
    }

    @JsonProperty("xlstGroup")
    public void setXlstGroup(String xlstGroup) {
        this.xlstGroup = xlstGroup;
    }

    public ScheduleCrossListQuery100QapiPost withXlstGroup(String xlstGroup) {
        this.xlstGroup = xlstGroup;
        return this;
    }

    @JsonProperty("maxEnrl")
    public String getMaxEnrl() {
        return maxEnrl;
    }

    @JsonProperty("maxEnrl")
    public void setMaxEnrl(String maxEnrl) {
        this.maxEnrl = maxEnrl;
    }

    public ScheduleCrossListQuery100QapiPost withMaxEnrl(String maxEnrl) {
        this.maxEnrl = maxEnrl;
        return this;
    }

    @JsonProperty("enrl")
    public String getEnrl() {
        return enrl;
    }

    @JsonProperty("enrl")
    public void setEnrl(String enrl) {
        this.enrl = enrl;
    }

    public ScheduleCrossListQuery100QapiPost withEnrl(String enrl) {
        this.enrl = enrl;
        return this;
    }

    @JsonProperty("seatsAvail")
    public String getSeatsAvail() {
        return seatsAvail;
    }

    @JsonProperty("seatsAvail")
    public void setSeatsAvail(String seatsAvail) {
        this.seatsAvail = seatsAvail;
    }

    public ScheduleCrossListQuery100QapiPost withSeatsAvail(String seatsAvail) {
        this.seatsAvail = seatsAvail;
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

    public ScheduleCrossListQuery100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ScheduleCrossListQuery100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
        sb.append(',');
        sb.append("xlstGroup");
        sb.append('=');
        sb.append(((this.xlstGroup == null)?"<null>":this.xlstGroup));
        sb.append(',');
        sb.append("maxEnrl");
        sb.append('=');
        sb.append(((this.maxEnrl == null)?"<null>":this.maxEnrl));
        sb.append(',');
        sb.append("enrl");
        sb.append('=');
        sb.append(((this.enrl == null)?"<null>":this.enrl));
        sb.append(',');
        sb.append("seatsAvail");
        sb.append('=');
        sb.append(((this.seatsAvail == null)?"<null>":this.seatsAvail));
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
        result = ((result* 31)+((this.xlstGroup == null)? 0 :this.xlstGroup.hashCode()));
        result = ((result* 31)+((this.seatsAvail == null)? 0 :this.seatsAvail.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.enrl == null)? 0 :this.enrl.hashCode()));
        result = ((result* 31)+((this.maxEnrl == null)? 0 :this.maxEnrl.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ScheduleCrossListQuery100QapiPost) == false) {
            return false;
        }
        ScheduleCrossListQuery100QapiPost rhs = ((ScheduleCrossListQuery100QapiPost) other);
        return (((((((this.xlstGroup == rhs.xlstGroup)||((this.xlstGroup!= null)&&this.xlstGroup.equals(rhs.xlstGroup)))&&((this.seatsAvail == rhs.seatsAvail)||((this.seatsAvail!= null)&&this.seatsAvail.equals(rhs.seatsAvail))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.enrl == rhs.enrl)||((this.enrl!= null)&&this.enrl.equals(rhs.enrl))))&&((this.maxEnrl == rhs.maxEnrl)||((this.maxEnrl!= null)&&this.maxEnrl.equals(rhs.maxEnrl))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
