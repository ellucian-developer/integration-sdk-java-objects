
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
public class OpenLearningSectionDefaultRules100PutResponse {

    @JsonProperty("sobodte")
    private List<Sobodte__2> sobodte = new ArrayList<Sobodte__2>();
    @JsonProperty("sorextn")
    private List<Sorextn__2> sorextn = new ArrayList<Sorextn__2>();
    @JsonProperty("sorrfnd")
    private List<Sorrfnd__2> sorrfnd = new ArrayList<Sorrfnd__2>();
    @JsonProperty("sorrsts")
    private List<Sorrst__2> sorrsts = new ArrayList<Sorrst__2>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sobodte")
    public List<Sobodte__2> getSobodte() {
        return sobodte;
    }

    @JsonProperty("sobodte")
    public void setSobodte(List<Sobodte__2> sobodte) {
        this.sobodte = sobodte;
    }

    public OpenLearningSectionDefaultRules100PutResponse withSobodte(List<Sobodte__2> sobodte) {
        this.sobodte = sobodte;
        return this;
    }

    @JsonProperty("sorextn")
    public List<Sorextn__2> getSorextn() {
        return sorextn;
    }

    @JsonProperty("sorextn")
    public void setSorextn(List<Sorextn__2> sorextn) {
        this.sorextn = sorextn;
    }

    public OpenLearningSectionDefaultRules100PutResponse withSorextn(List<Sorextn__2> sorextn) {
        this.sorextn = sorextn;
        return this;
    }

    @JsonProperty("sorrfnd")
    public List<Sorrfnd__2> getSorrfnd() {
        return sorrfnd;
    }

    @JsonProperty("sorrfnd")
    public void setSorrfnd(List<Sorrfnd__2> sorrfnd) {
        this.sorrfnd = sorrfnd;
    }

    public OpenLearningSectionDefaultRules100PutResponse withSorrfnd(List<Sorrfnd__2> sorrfnd) {
        this.sorrfnd = sorrfnd;
        return this;
    }

    @JsonProperty("sorrsts")
    public List<Sorrst__2> getSorrsts() {
        return sorrsts;
    }

    @JsonProperty("sorrsts")
    public void setSorrsts(List<Sorrst__2> sorrsts) {
        this.sorrsts = sorrsts;
    }

    public OpenLearningSectionDefaultRules100PutResponse withSorrsts(List<Sorrst__2> sorrsts) {
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

    public OpenLearningSectionDefaultRules100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OpenLearningSectionDefaultRules100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof OpenLearningSectionDefaultRules100PutResponse) == false) {
            return false;
        }
        OpenLearningSectionDefaultRules100PutResponse rhs = ((OpenLearningSectionDefaultRules100PutResponse) other);
        return ((((((this.sorrfnd == rhs.sorrfnd)||((this.sorrfnd!= null)&&this.sorrfnd.equals(rhs.sorrfnd)))&&((this.sobodte == rhs.sobodte)||((this.sobodte!= null)&&this.sobodte.equals(rhs.sobodte))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sorrsts == rhs.sorrsts)||((this.sorrsts!= null)&&this.sorrsts.equals(rhs.sorrsts))))&&((this.sorextn == rhs.sorextn)||((this.sorextn!= null)&&this.sorextn.equals(rhs.sorextn))));
    }

}
