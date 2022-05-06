
package com.ellucian.generated.bpapi.ban.cross_list_meeting_time_instructor_query.v1_0_0;

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
    "ssvxmti",
    "sirasgn"
})
@Generated("jsonschema2pojo")
public class CrossListMeetingTimeInstructorQuery100GetResponse {

    @JsonProperty("ssvxmti")
    private List<Ssvxmtus> ssvxmti = new ArrayList<Ssvxmtus>();
    @JsonProperty("sirasgn")
    private List<Sirasgn> sirasgn = new ArrayList<Sirasgn>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ssvxmti")
    public List<Ssvxmtus> getSsvxmti() {
        return ssvxmti;
    }

    @JsonProperty("ssvxmti")
    public void setSsvxmti(List<Ssvxmtus> ssvxmti) {
        this.ssvxmti = ssvxmti;
    }

    public CrossListMeetingTimeInstructorQuery100GetResponse withSsvxmti(List<Ssvxmtus> ssvxmti) {
        this.ssvxmti = ssvxmti;
        return this;
    }

    @JsonProperty("sirasgn")
    public List<Sirasgn> getSirasgn() {
        return sirasgn;
    }

    @JsonProperty("sirasgn")
    public void setSirasgn(List<Sirasgn> sirasgn) {
        this.sirasgn = sirasgn;
    }

    public CrossListMeetingTimeInstructorQuery100GetResponse withSirasgn(List<Sirasgn> sirasgn) {
        this.sirasgn = sirasgn;
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

    public CrossListMeetingTimeInstructorQuery100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CrossListMeetingTimeInstructorQuery100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssvxmti");
        sb.append('=');
        sb.append(((this.ssvxmti == null)?"<null>":this.ssvxmti));
        sb.append(',');
        sb.append("sirasgn");
        sb.append('=');
        sb.append(((this.sirasgn == null)?"<null>":this.sirasgn));
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
        result = ((result* 31)+((this.ssvxmti == null)? 0 :this.ssvxmti.hashCode()));
        result = ((result* 31)+((this.sirasgn == null)? 0 :this.sirasgn.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CrossListMeetingTimeInstructorQuery100GetResponse) == false) {
            return false;
        }
        CrossListMeetingTimeInstructorQuery100GetResponse rhs = ((CrossListMeetingTimeInstructorQuery100GetResponse) other);
        return ((((this.ssvxmti == rhs.ssvxmti)||((this.ssvxmti!= null)&&this.ssvxmti.equals(rhs.ssvxmti)))&&((this.sirasgn == rhs.sirasgn)||((this.sirasgn!= null)&&this.sirasgn.equals(rhs.sirasgn))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
