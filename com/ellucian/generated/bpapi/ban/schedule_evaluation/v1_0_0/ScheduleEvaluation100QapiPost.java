
package com.ellucian.generated.bpapi.ban.schedule_evaluation.v1_0_0;

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
    "ssaevalTermCode",
    "ssaevalCrn"
})
@Generated("jsonschema2pojo")
public class ScheduleEvaluation100QapiPost {

    @JsonProperty("ssaevalTermCode")
    private String ssaevalTermCode;
    @JsonProperty("ssaevalCrn")
    private String ssaevalCrn;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ssaevalTermCode")
    public String getSsaevalTermCode() {
        return ssaevalTermCode;
    }

    @JsonProperty("ssaevalTermCode")
    public void setSsaevalTermCode(String ssaevalTermCode) {
        this.ssaevalTermCode = ssaevalTermCode;
    }

    public ScheduleEvaluation100QapiPost withSsaevalTermCode(String ssaevalTermCode) {
        this.ssaevalTermCode = ssaevalTermCode;
        return this;
    }

    @JsonProperty("ssaevalCrn")
    public String getSsaevalCrn() {
        return ssaevalCrn;
    }

    @JsonProperty("ssaevalCrn")
    public void setSsaevalCrn(String ssaevalCrn) {
        this.ssaevalCrn = ssaevalCrn;
    }

    public ScheduleEvaluation100QapiPost withSsaevalCrn(String ssaevalCrn) {
        this.ssaevalCrn = ssaevalCrn;
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

    public ScheduleEvaluation100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ScheduleEvaluation100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssaevalTermCode");
        sb.append('=');
        sb.append(((this.ssaevalTermCode == null)?"<null>":this.ssaevalTermCode));
        sb.append(',');
        sb.append("ssaevalCrn");
        sb.append('=');
        sb.append(((this.ssaevalCrn == null)?"<null>":this.ssaevalCrn));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ssaevalTermCode == null)? 0 :this.ssaevalTermCode.hashCode()));
        result = ((result* 31)+((this.ssaevalCrn == null)? 0 :this.ssaevalCrn.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ScheduleEvaluation100QapiPost) == false) {
            return false;
        }
        ScheduleEvaluation100QapiPost rhs = ((ScheduleEvaluation100QapiPost) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.ssaevalTermCode == rhs.ssaevalTermCode)||((this.ssaevalTermCode!= null)&&this.ssaevalTermCode.equals(rhs.ssaevalTermCode))))&&((this.ssaevalCrn == rhs.ssaevalCrn)||((this.ssaevalCrn!= null)&&this.ssaevalCrn.equals(rhs.ssaevalCrn))));
    }

}
