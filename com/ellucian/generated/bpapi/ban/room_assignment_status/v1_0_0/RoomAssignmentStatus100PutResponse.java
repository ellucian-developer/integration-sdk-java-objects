
package com.ellucian.generated.bpapi.ban.room_assignment_status.v1_0_0;

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
    "slrascd",
    "slrrfcr"
})
@Generated("jsonschema2pojo")
public class RoomAssignmentStatus100PutResponse {

    @JsonProperty("slrascd")
    private List<Slrascd__2> slrascd = new ArrayList<Slrascd__2>();
    @JsonProperty("slrrfcr")
    private List<Slrrfcr__2> slrrfcr = new ArrayList<Slrrfcr__2>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("slrascd")
    public List<Slrascd__2> getSlrascd() {
        return slrascd;
    }

    @JsonProperty("slrascd")
    public void setSlrascd(List<Slrascd__2> slrascd) {
        this.slrascd = slrascd;
    }

    public RoomAssignmentStatus100PutResponse withSlrascd(List<Slrascd__2> slrascd) {
        this.slrascd = slrascd;
        return this;
    }

    @JsonProperty("slrrfcr")
    public List<Slrrfcr__2> getSlrrfcr() {
        return slrrfcr;
    }

    @JsonProperty("slrrfcr")
    public void setSlrrfcr(List<Slrrfcr__2> slrrfcr) {
        this.slrrfcr = slrrfcr;
    }

    public RoomAssignmentStatus100PutResponse withSlrrfcr(List<Slrrfcr__2> slrrfcr) {
        this.slrrfcr = slrrfcr;
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

    public RoomAssignmentStatus100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RoomAssignmentStatus100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("slrascd");
        sb.append('=');
        sb.append(((this.slrascd == null)?"<null>":this.slrascd));
        sb.append(',');
        sb.append("slrrfcr");
        sb.append('=');
        sb.append(((this.slrrfcr == null)?"<null>":this.slrrfcr));
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
        result = ((result* 31)+((this.slrascd == null)? 0 :this.slrascd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.slrrfcr == null)? 0 :this.slrrfcr.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RoomAssignmentStatus100PutResponse) == false) {
            return false;
        }
        RoomAssignmentStatus100PutResponse rhs = ((RoomAssignmentStatus100PutResponse) other);
        return ((((this.slrascd == rhs.slrascd)||((this.slrascd!= null)&&this.slrascd.equals(rhs.slrascd)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.slrrfcr == rhs.slrrfcr)||((this.slrrfcr!= null)&&this.slrrfcr.equals(rhs.slrrfcr))));
    }

}
