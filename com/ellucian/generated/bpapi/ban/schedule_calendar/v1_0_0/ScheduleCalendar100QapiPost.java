
package com.ellucian.generated.bpapi.ban.schedule_calendar.v1_0_0;

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
    "keyblckTermCode",
    "keyblckCrn"
})
@Generated("jsonschema2pojo")
public class ScheduleCalendar100QapiPost {

    @JsonProperty("keyblckTermCode")
    private String keyblckTermCode;
    @JsonProperty("keyblckCrn")
    private String keyblckCrn;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("keyblckTermCode")
    public String getKeyblckTermCode() {
        return keyblckTermCode;
    }

    @JsonProperty("keyblckTermCode")
    public void setKeyblckTermCode(String keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
    }

    public ScheduleCalendar100QapiPost withKeyblckTermCode(String keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
        return this;
    }

    @JsonProperty("keyblckCrn")
    public String getKeyblckCrn() {
        return keyblckCrn;
    }

    @JsonProperty("keyblckCrn")
    public void setKeyblckCrn(String keyblckCrn) {
        this.keyblckCrn = keyblckCrn;
    }

    public ScheduleCalendar100QapiPost withKeyblckCrn(String keyblckCrn) {
        this.keyblckCrn = keyblckCrn;
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

    public ScheduleCalendar100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ScheduleCalendar100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblckTermCode");
        sb.append('=');
        sb.append(((this.keyblckTermCode == null)?"<null>":this.keyblckTermCode));
        sb.append(',');
        sb.append("keyblckCrn");
        sb.append('=');
        sb.append(((this.keyblckCrn == null)?"<null>":this.keyblckCrn));
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
        result = ((result* 31)+((this.keyblckTermCode == null)? 0 :this.keyblckTermCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.keyblckCrn == null)? 0 :this.keyblckCrn.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ScheduleCalendar100QapiPost) == false) {
            return false;
        }
        ScheduleCalendar100QapiPost rhs = ((ScheduleCalendar100QapiPost) other);
        return ((((this.keyblckTermCode == rhs.keyblckTermCode)||((this.keyblckTermCode!= null)&&this.keyblckTermCode.equals(rhs.keyblckTermCode)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.keyblckCrn == rhs.keyblckCrn)||((this.keyblckCrn!= null)&&this.keyblckCrn.equals(rhs.keyblckCrn))));
    }

}
