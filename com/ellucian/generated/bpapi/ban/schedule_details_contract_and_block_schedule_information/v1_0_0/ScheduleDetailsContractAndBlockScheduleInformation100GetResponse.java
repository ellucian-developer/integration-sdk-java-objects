
package com.ellucian.generated.bpapi.ban.schedule_details_contract_and_block_schedule_information.v1_0_0;

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
    "ssrsccd",
    "ssrblck"
})
@Generated("jsonschema2pojo")
public class ScheduleDetailsContractAndBlockScheduleInformation100GetResponse {

    @JsonProperty("ssrsccd")
    private List<Ssrsccd> ssrsccd = new ArrayList<Ssrsccd>();
    @JsonProperty("ssrblck")
    private List<Ssrblck> ssrblck = new ArrayList<Ssrblck>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ssrsccd")
    public List<Ssrsccd> getSsrsccd() {
        return ssrsccd;
    }

    @JsonProperty("ssrsccd")
    public void setSsrsccd(List<Ssrsccd> ssrsccd) {
        this.ssrsccd = ssrsccd;
    }

    public ScheduleDetailsContractAndBlockScheduleInformation100GetResponse withSsrsccd(List<Ssrsccd> ssrsccd) {
        this.ssrsccd = ssrsccd;
        return this;
    }

    @JsonProperty("ssrblck")
    public List<Ssrblck> getSsrblck() {
        return ssrblck;
    }

    @JsonProperty("ssrblck")
    public void setSsrblck(List<Ssrblck> ssrblck) {
        this.ssrblck = ssrblck;
    }

    public ScheduleDetailsContractAndBlockScheduleInformation100GetResponse withSsrblck(List<Ssrblck> ssrblck) {
        this.ssrblck = ssrblck;
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

    public ScheduleDetailsContractAndBlockScheduleInformation100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ScheduleDetailsContractAndBlockScheduleInformation100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssrsccd");
        sb.append('=');
        sb.append(((this.ssrsccd == null)?"<null>":this.ssrsccd));
        sb.append(',');
        sb.append("ssrblck");
        sb.append('=');
        sb.append(((this.ssrblck == null)?"<null>":this.ssrblck));
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
        result = ((result* 31)+((this.ssrblck == null)? 0 :this.ssrblck.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ssrsccd == null)? 0 :this.ssrsccd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ScheduleDetailsContractAndBlockScheduleInformation100GetResponse) == false) {
            return false;
        }
        ScheduleDetailsContractAndBlockScheduleInformation100GetResponse rhs = ((ScheduleDetailsContractAndBlockScheduleInformation100GetResponse) other);
        return ((((this.ssrblck == rhs.ssrblck)||((this.ssrblck!= null)&&this.ssrblck.equals(rhs.ssrblck)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ssrsccd == rhs.ssrsccd)||((this.ssrsccd!= null)&&this.ssrsccd.equals(rhs.ssrsccd))));
    }

}
