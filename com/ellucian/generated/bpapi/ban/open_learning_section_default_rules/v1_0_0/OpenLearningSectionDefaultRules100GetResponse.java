
package com.ellucian.generated.bpapi.ban.open_learning_section_default_rules.v1_0_0;

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
    "sobodte",
    "sorextn",
    "sorrfnd",
    "sorrsts"
})
@Generated("jsonschema2pojo")
public class OpenLearningSectionDefaultRules100GetResponse {

    @JsonProperty("sobodte")
    private List<Sobodte> sobodte = new ArrayList<Sobodte>();
    @JsonProperty("sorextn")
    private List<Sorextn> sorextn = new ArrayList<Sorextn>();
    @JsonProperty("sorrfnd")
    private List<Sorrfnd> sorrfnd = new ArrayList<Sorrfnd>();
    @JsonProperty("sorrsts")
    private List<Sorrst> sorrsts = new ArrayList<Sorrst>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sobodte")
    public List<Sobodte> getSobodte() {
        return sobodte;
    }

    @JsonProperty("sobodte")
    public void setSobodte(List<Sobodte> sobodte) {
        this.sobodte = sobodte;
    }

    public OpenLearningSectionDefaultRules100GetResponse withSobodte(List<Sobodte> sobodte) {
        this.sobodte = sobodte;
        return this;
    }

    @JsonProperty("sorextn")
    public List<Sorextn> getSorextn() {
        return sorextn;
    }

    @JsonProperty("sorextn")
    public void setSorextn(List<Sorextn> sorextn) {
        this.sorextn = sorextn;
    }

    public OpenLearningSectionDefaultRules100GetResponse withSorextn(List<Sorextn> sorextn) {
        this.sorextn = sorextn;
        return this;
    }

    @JsonProperty("sorrfnd")
    public List<Sorrfnd> getSorrfnd() {
        return sorrfnd;
    }

    @JsonProperty("sorrfnd")
    public void setSorrfnd(List<Sorrfnd> sorrfnd) {
        this.sorrfnd = sorrfnd;
    }

    public OpenLearningSectionDefaultRules100GetResponse withSorrfnd(List<Sorrfnd> sorrfnd) {
        this.sorrfnd = sorrfnd;
        return this;
    }

    @JsonProperty("sorrsts")
    public List<Sorrst> getSorrsts() {
        return sorrsts;
    }

    @JsonProperty("sorrsts")
    public void setSorrsts(List<Sorrst> sorrsts) {
        this.sorrsts = sorrsts;
    }

    public OpenLearningSectionDefaultRules100GetResponse withSorrsts(List<Sorrst> sorrsts) {
        this.sorrsts = sorrsts;
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

    public OpenLearningSectionDefaultRules100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OpenLearningSectionDefaultRules100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sobodte");
        sb.append('=');
        sb.append(((this.sobodte == null)?"<null>":this.sobodte));
        sb.append(',');
        sb.append("sorextn");
        sb.append('=');
        sb.append(((this.sorextn == null)?"<null>":this.sorextn));
        sb.append(',');
        sb.append("sorrfnd");
        sb.append('=');
        sb.append(((this.sorrfnd == null)?"<null>":this.sorrfnd));
        sb.append(',');
        sb.append("sorrsts");
        sb.append('=');
        sb.append(((this.sorrsts == null)?"<null>":this.sorrsts));
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
        result = ((result* 31)+((this.sorrfnd == null)? 0 :this.sorrfnd.hashCode()));
        result = ((result* 31)+((this.sobodte == null)? 0 :this.sobodte.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sorrsts == null)? 0 :this.sorrsts.hashCode()));
        result = ((result* 31)+((this.sorextn == null)? 0 :this.sorextn.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OpenLearningSectionDefaultRules100GetResponse) == false) {
            return false;
        }
        OpenLearningSectionDefaultRules100GetResponse rhs = ((OpenLearningSectionDefaultRules100GetResponse) other);
        return ((((((this.sorrfnd == rhs.sorrfnd)||((this.sorrfnd!= null)&&this.sorrfnd.equals(rhs.sorrfnd)))&&((this.sobodte == rhs.sobodte)||((this.sobodte!= null)&&this.sobodte.equals(rhs.sobodte))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sorrsts == rhs.sorrsts)||((this.sorrsts!= null)&&this.sorrsts.equals(rhs.sorrsts))))&&((this.sorextn == rhs.sorextn)||((this.sorextn!= null)&&this.sorextn.equals(rhs.sorextn))));
    }

}
