
package com.ellucian.generated.bpapi.ban.curriculum_rules_major_and_departments.v1_0_0;

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
    "sorcmjr_ctrl",
    "sorcmjr"
})
@Generated("jsonschema2pojo")
public class CurriculumRulesMajorAndDepartments100GetResponse {

    @JsonProperty("sorcmjr_ctrl")
    private List<SorcmjrCtrl> sorcmjrCtrl = new ArrayList<SorcmjrCtrl>();
    @JsonProperty("sorcmjr")
    private List<Sorcmjr> sorcmjr = new ArrayList<Sorcmjr>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sorcmjr_ctrl")
    public List<SorcmjrCtrl> getSorcmjrCtrl() {
        return sorcmjrCtrl;
    }

    @JsonProperty("sorcmjr_ctrl")
    public void setSorcmjrCtrl(List<SorcmjrCtrl> sorcmjrCtrl) {
        this.sorcmjrCtrl = sorcmjrCtrl;
    }

    public CurriculumRulesMajorAndDepartments100GetResponse withSorcmjrCtrl(List<SorcmjrCtrl> sorcmjrCtrl) {
        this.sorcmjrCtrl = sorcmjrCtrl;
        return this;
    }

    @JsonProperty("sorcmjr")
    public List<Sorcmjr> getSorcmjr() {
        return sorcmjr;
    }

    @JsonProperty("sorcmjr")
    public void setSorcmjr(List<Sorcmjr> sorcmjr) {
        this.sorcmjr = sorcmjr;
    }

    public CurriculumRulesMajorAndDepartments100GetResponse withSorcmjr(List<Sorcmjr> sorcmjr) {
        this.sorcmjr = sorcmjr;
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

    public CurriculumRulesMajorAndDepartments100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CurriculumRulesMajorAndDepartments100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sorcmjrCtrl");
        sb.append('=');
        sb.append(((this.sorcmjrCtrl == null)?"<null>":this.sorcmjrCtrl));
        sb.append(',');
        sb.append("sorcmjr");
        sb.append('=');
        sb.append(((this.sorcmjr == null)?"<null>":this.sorcmjr));
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
        result = ((result* 31)+((this.sorcmjrCtrl == null)? 0 :this.sorcmjrCtrl.hashCode()));
        result = ((result* 31)+((this.sorcmjr == null)? 0 :this.sorcmjr.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CurriculumRulesMajorAndDepartments100GetResponse) == false) {
            return false;
        }
        CurriculumRulesMajorAndDepartments100GetResponse rhs = ((CurriculumRulesMajorAndDepartments100GetResponse) other);
        return ((((this.sorcmjrCtrl == rhs.sorcmjrCtrl)||((this.sorcmjrCtrl!= null)&&this.sorcmjrCtrl.equals(rhs.sorcmjrCtrl)))&&((this.sorcmjr == rhs.sorcmjr)||((this.sorcmjr!= null)&&this.sorcmjr.equals(rhs.sorcmjr))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
