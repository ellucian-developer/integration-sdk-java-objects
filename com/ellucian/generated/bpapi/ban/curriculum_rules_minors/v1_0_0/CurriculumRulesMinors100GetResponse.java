
package com.ellucian.generated.bpapi.ban.curriculum_rules_minors.v1_0_0;

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
    "sorcmnr_ctrl",
    "sorcmnr"
})
@Generated("jsonschema2pojo")
public class CurriculumRulesMinors100GetResponse {

    @JsonProperty("sorcmnr_ctrl")
    private List<SorcmnrCtrl> sorcmnrCtrl = new ArrayList<SorcmnrCtrl>();
    @JsonProperty("sorcmnr")
    private List<Sorcmnr> sorcmnr = new ArrayList<Sorcmnr>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sorcmnr_ctrl")
    public List<SorcmnrCtrl> getSorcmnrCtrl() {
        return sorcmnrCtrl;
    }

    @JsonProperty("sorcmnr_ctrl")
    public void setSorcmnrCtrl(List<SorcmnrCtrl> sorcmnrCtrl) {
        this.sorcmnrCtrl = sorcmnrCtrl;
    }

    public CurriculumRulesMinors100GetResponse withSorcmnrCtrl(List<SorcmnrCtrl> sorcmnrCtrl) {
        this.sorcmnrCtrl = sorcmnrCtrl;
        return this;
    }

    @JsonProperty("sorcmnr")
    public List<Sorcmnr> getSorcmnr() {
        return sorcmnr;
    }

    @JsonProperty("sorcmnr")
    public void setSorcmnr(List<Sorcmnr> sorcmnr) {
        this.sorcmnr = sorcmnr;
    }

    public CurriculumRulesMinors100GetResponse withSorcmnr(List<Sorcmnr> sorcmnr) {
        this.sorcmnr = sorcmnr;
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

    public CurriculumRulesMinors100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CurriculumRulesMinors100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sorcmnrCtrl");
        sb.append('=');
        sb.append(((this.sorcmnrCtrl == null)?"<null>":this.sorcmnrCtrl));
        sb.append(',');
        sb.append("sorcmnr");
        sb.append('=');
        sb.append(((this.sorcmnr == null)?"<null>":this.sorcmnr));
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
        result = ((result* 31)+((this.sorcmnrCtrl == null)? 0 :this.sorcmnrCtrl.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sorcmnr == null)? 0 :this.sorcmnr.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CurriculumRulesMinors100GetResponse) == false) {
            return false;
        }
        CurriculumRulesMinors100GetResponse rhs = ((CurriculumRulesMinors100GetResponse) other);
        return ((((this.sorcmnrCtrl == rhs.sorcmnrCtrl)||((this.sorcmnrCtrl!= null)&&this.sorcmnrCtrl.equals(rhs.sorcmnrCtrl)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sorcmnr == rhs.sorcmnr)||((this.sorcmnr!= null)&&this.sorcmnr.equals(rhs.sorcmnr))));
    }

}
