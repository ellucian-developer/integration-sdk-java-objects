
package com.ellucian.generated.bpapi.ban.schedule_evaluation.v1_0_0;

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
    "ssaevalCrn",
    "ssaevalTermCode"
})
@Generated("jsonschema2pojo")
public class ScheduleEvaluation100GetRequest {

    /**
     * CRN
     * <p>
     * Lineage reference object : ssaevalCrn
     * 
     */
    @JsonProperty("ssaevalCrn")
    @JsonPropertyDescription("Lineage reference object : ssaevalCrn")
    private String ssaevalCrn;
    /**
     * Term
     * <p>
     * Lineage reference object : ssaevalTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("ssaevalTermCode")
    @JsonPropertyDescription("Lineage reference object : ssaevalTermCode, Lookup lineage reference object : stvterm")
    private String ssaevalTermCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * CRN
     * <p>
     * Lineage reference object : ssaevalCrn
     * 
     */
    @JsonProperty("ssaevalCrn")
    public String getSsaevalCrn() {
        return ssaevalCrn;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : ssaevalCrn
     * 
     */
    @JsonProperty("ssaevalCrn")
    public void setSsaevalCrn(String ssaevalCrn) {
        this.ssaevalCrn = ssaevalCrn;
    }

    public ScheduleEvaluation100GetRequest withSsaevalCrn(String ssaevalCrn) {
        this.ssaevalCrn = ssaevalCrn;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : ssaevalTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("ssaevalTermCode")
    public String getSsaevalTermCode() {
        return ssaevalTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : ssaevalTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("ssaevalTermCode")
    public void setSsaevalTermCode(String ssaevalTermCode) {
        this.ssaevalTermCode = ssaevalTermCode;
    }

    public ScheduleEvaluation100GetRequest withSsaevalTermCode(String ssaevalTermCode) {
        this.ssaevalTermCode = ssaevalTermCode;
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

    public ScheduleEvaluation100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ScheduleEvaluation100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssaevalCrn");
        sb.append('=');
        sb.append(((this.ssaevalCrn == null)?"<null>":this.ssaevalCrn));
        sb.append(',');
        sb.append("ssaevalTermCode");
        sb.append('=');
        sb.append(((this.ssaevalTermCode == null)?"<null>":this.ssaevalTermCode));
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
        result = ((result* 31)+((this.ssaevalCrn == null)? 0 :this.ssaevalCrn.hashCode()));
        result = ((result* 31)+((this.ssaevalTermCode == null)? 0 :this.ssaevalTermCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ScheduleEvaluation100GetRequest) == false) {
            return false;
        }
        ScheduleEvaluation100GetRequest rhs = ((ScheduleEvaluation100GetRequest) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.ssaevalCrn == rhs.ssaevalCrn)||((this.ssaevalCrn!= null)&&this.ssaevalCrn.equals(rhs.ssaevalCrn))))&&((this.ssaevalTermCode == rhs.ssaevalTermCode)||((this.ssaevalTermCode!= null)&&this.ssaevalTermCode.equals(rhs.ssaevalTermCode))));
    }

}
