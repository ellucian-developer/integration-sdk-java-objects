
package com.ellucian.generated.bpapi.ban.curriculum_rules_rule_based_concentrations.v1_0_0;

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
    "sorccon_ctrl",
    "sorccon"
})
@Generated("jsonschema2pojo")
public class CurriculumRulesRuleBasedConcentrations100GetResponse {

    @JsonProperty("sorccon_ctrl")
    private List<SorcconCtrl> sorcconCtrl = new ArrayList<SorcconCtrl>();
    @JsonProperty("sorccon")
    private List<Sorccon> sorccon = new ArrayList<Sorccon>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sorccon_ctrl")
    public List<SorcconCtrl> getSorcconCtrl() {
        return sorcconCtrl;
    }

    @JsonProperty("sorccon_ctrl")
    public void setSorcconCtrl(List<SorcconCtrl> sorcconCtrl) {
        this.sorcconCtrl = sorcconCtrl;
    }

    public CurriculumRulesRuleBasedConcentrations100GetResponse withSorcconCtrl(List<SorcconCtrl> sorcconCtrl) {
        this.sorcconCtrl = sorcconCtrl;
        return this;
    }

    @JsonProperty("sorccon")
    public List<Sorccon> getSorccon() {
        return sorccon;
    }

    @JsonProperty("sorccon")
    public void setSorccon(List<Sorccon> sorccon) {
        this.sorccon = sorccon;
    }

    public CurriculumRulesRuleBasedConcentrations100GetResponse withSorccon(List<Sorccon> sorccon) {
        this.sorccon = sorccon;
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

    public CurriculumRulesRuleBasedConcentrations100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CurriculumRulesRuleBasedConcentrations100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sorcconCtrl");
        sb.append('=');
        sb.append(((this.sorcconCtrl == null)?"<null>":this.sorcconCtrl));
        sb.append(',');
        sb.append("sorccon");
        sb.append('=');
        sb.append(((this.sorccon == null)?"<null>":this.sorccon));
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
        result = ((result* 31)+((this.sorcconCtrl == null)? 0 :this.sorcconCtrl.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sorccon == null)? 0 :this.sorccon.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CurriculumRulesRuleBasedConcentrations100GetResponse) == false) {
            return false;
        }
        CurriculumRulesRuleBasedConcentrations100GetResponse rhs = ((CurriculumRulesRuleBasedConcentrations100GetResponse) other);
        return ((((this.sorcconCtrl == rhs.sorcconCtrl)||((this.sorcconCtrl!= null)&&this.sorcconCtrl.equals(rhs.sorcconCtrl)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sorccon == rhs.sorccon)||((this.sorccon!= null)&&this.sorccon.equals(rhs.sorccon))));
    }

}
