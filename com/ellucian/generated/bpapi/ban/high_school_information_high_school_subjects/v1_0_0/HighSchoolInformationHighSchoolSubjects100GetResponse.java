
package com.ellucian.generated.bpapi.ban.high_school_information_high_school_subjects.v1_0_0;

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
    "sorhsch",
    "sorhsbj"
})
@Generated("jsonschema2pojo")
public class HighSchoolInformationHighSchoolSubjects100GetResponse {

    @JsonProperty("sorhsch")
    private List<Sorhsch> sorhsch = new ArrayList<Sorhsch>();
    @JsonProperty("sorhsbj")
    private List<Sorhsbj> sorhsbj = new ArrayList<Sorhsbj>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sorhsch")
    public List<Sorhsch> getSorhsch() {
        return sorhsch;
    }

    @JsonProperty("sorhsch")
    public void setSorhsch(List<Sorhsch> sorhsch) {
        this.sorhsch = sorhsch;
    }

    public HighSchoolInformationHighSchoolSubjects100GetResponse withSorhsch(List<Sorhsch> sorhsch) {
        this.sorhsch = sorhsch;
        return this;
    }

    @JsonProperty("sorhsbj")
    public List<Sorhsbj> getSorhsbj() {
        return sorhsbj;
    }

    @JsonProperty("sorhsbj")
    public void setSorhsbj(List<Sorhsbj> sorhsbj) {
        this.sorhsbj = sorhsbj;
    }

    public HighSchoolInformationHighSchoolSubjects100GetResponse withSorhsbj(List<Sorhsbj> sorhsbj) {
        this.sorhsbj = sorhsbj;
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

    public HighSchoolInformationHighSchoolSubjects100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HighSchoolInformationHighSchoolSubjects100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sorhsch");
        sb.append('=');
        sb.append(((this.sorhsch == null)?"<null>":this.sorhsch));
        sb.append(',');
        sb.append("sorhsbj");
        sb.append('=');
        sb.append(((this.sorhsbj == null)?"<null>":this.sorhsbj));
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
        result = ((result* 31)+((this.sorhsch == null)? 0 :this.sorhsch.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sorhsbj == null)? 0 :this.sorhsbj.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HighSchoolInformationHighSchoolSubjects100GetResponse) == false) {
            return false;
        }
        HighSchoolInformationHighSchoolSubjects100GetResponse rhs = ((HighSchoolInformationHighSchoolSubjects100GetResponse) other);
        return ((((this.sorhsch == rhs.sorhsch)||((this.sorhsch!= null)&&this.sorhsch.equals(rhs.sorhsch)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sorhsbj == rhs.sorhsbj)||((this.sorhsbj!= null)&&this.sorhsbj.equals(rhs.sorhsbj))));
    }

}
