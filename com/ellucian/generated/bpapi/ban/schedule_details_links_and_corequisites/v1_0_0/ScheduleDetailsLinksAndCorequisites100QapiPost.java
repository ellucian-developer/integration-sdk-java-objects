
package com.ellucian.generated.bpapi.ban.schedule_details_links_and_corequisites.v1_0_0;

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
    "ssasectTermCode",
    "ssasectCrn"
})
@Generated("jsonschema2pojo")
public class ScheduleDetailsLinksAndCorequisites100QapiPost {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ssasectTermCode")
    private String ssasectTermCode;
    @JsonProperty("ssasectCrn")
    private String ssasectCrn;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ssasectTermCode")
    public String getSsasectTermCode() {
        return ssasectTermCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ssasectTermCode")
    public void setSsasectTermCode(String ssasectTermCode) {
        this.ssasectTermCode = ssasectTermCode;
    }

    public ScheduleDetailsLinksAndCorequisites100QapiPost withSsasectTermCode(String ssasectTermCode) {
        this.ssasectTermCode = ssasectTermCode;
        return this;
    }

    @JsonProperty("ssasectCrn")
    public String getSsasectCrn() {
        return ssasectCrn;
    }

    @JsonProperty("ssasectCrn")
    public void setSsasectCrn(String ssasectCrn) {
        this.ssasectCrn = ssasectCrn;
    }

    public ScheduleDetailsLinksAndCorequisites100QapiPost withSsasectCrn(String ssasectCrn) {
        this.ssasectCrn = ssasectCrn;
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

    public ScheduleDetailsLinksAndCorequisites100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ScheduleDetailsLinksAndCorequisites100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssasectTermCode");
        sb.append('=');
        sb.append(((this.ssasectTermCode == null)?"<null>":this.ssasectTermCode));
        sb.append(',');
        sb.append("ssasectCrn");
        sb.append('=');
        sb.append(((this.ssasectCrn == null)?"<null>":this.ssasectCrn));
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
        result = ((result* 31)+((this.ssasectTermCode == null)? 0 :this.ssasectTermCode.hashCode()));
        result = ((result* 31)+((this.ssasectCrn == null)? 0 :this.ssasectCrn.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ScheduleDetailsLinksAndCorequisites100QapiPost) == false) {
            return false;
        }
        ScheduleDetailsLinksAndCorequisites100QapiPost rhs = ((ScheduleDetailsLinksAndCorequisites100QapiPost) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.ssasectTermCode == rhs.ssasectTermCode)||((this.ssasectTermCode!= null)&&this.ssasectTermCode.equals(rhs.ssasectTermCode))))&&((this.ssasectCrn == rhs.ssasectCrn)||((this.ssasectCrn!= null)&&this.ssasectCrn.equals(rhs.ssasectCrn))));
    }

}
