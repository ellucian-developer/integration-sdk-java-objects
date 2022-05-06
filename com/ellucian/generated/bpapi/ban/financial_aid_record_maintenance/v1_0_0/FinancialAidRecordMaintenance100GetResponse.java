
package com.ellucian.generated.bpapi.ban.financial_aid_record_maintenance.v1_0_0;

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
    "summary",
    "rorstat",
    "rprawrd"
})
@Generated("jsonschema2pojo")
public class FinancialAidRecordMaintenance100GetResponse {

    @JsonProperty("summary")
    private List<Summary> summary = new ArrayList<Summary>();
    @JsonProperty("rorstat")
    private List<Rorstat> rorstat = new ArrayList<Rorstat>();
    @JsonProperty("rprawrd")
    private List<Rprawrd> rprawrd = new ArrayList<Rprawrd>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("summary")
    public List<Summary> getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public void setSummary(List<Summary> summary) {
        this.summary = summary;
    }

    public FinancialAidRecordMaintenance100GetResponse withSummary(List<Summary> summary) {
        this.summary = summary;
        return this;
    }

    @JsonProperty("rorstat")
    public List<Rorstat> getRorstat() {
        return rorstat;
    }

    @JsonProperty("rorstat")
    public void setRorstat(List<Rorstat> rorstat) {
        this.rorstat = rorstat;
    }

    public FinancialAidRecordMaintenance100GetResponse withRorstat(List<Rorstat> rorstat) {
        this.rorstat = rorstat;
        return this;
    }

    @JsonProperty("rprawrd")
    public List<Rprawrd> getRprawrd() {
        return rprawrd;
    }

    @JsonProperty("rprawrd")
    public void setRprawrd(List<Rprawrd> rprawrd) {
        this.rprawrd = rprawrd;
    }

    public FinancialAidRecordMaintenance100GetResponse withRprawrd(List<Rprawrd> rprawrd) {
        this.rprawrd = rprawrd;
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

    public FinancialAidRecordMaintenance100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FinancialAidRecordMaintenance100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("summary");
        sb.append('=');
        sb.append(((this.summary == null)?"<null>":this.summary));
        sb.append(',');
        sb.append("rorstat");
        sb.append('=');
        sb.append(((this.rorstat == null)?"<null>":this.rorstat));
        sb.append(',');
        sb.append("rprawrd");
        sb.append('=');
        sb.append(((this.rprawrd == null)?"<null>":this.rprawrd));
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
        result = ((result* 31)+((this.summary == null)? 0 :this.summary.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.rorstat == null)? 0 :this.rorstat.hashCode()));
        result = ((result* 31)+((this.rprawrd == null)? 0 :this.rprawrd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FinancialAidRecordMaintenance100GetResponse) == false) {
            return false;
        }
        FinancialAidRecordMaintenance100GetResponse rhs = ((FinancialAidRecordMaintenance100GetResponse) other);
        return (((((this.summary == rhs.summary)||((this.summary!= null)&&this.summary.equals(rhs.summary)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.rorstat == rhs.rorstat)||((this.rorstat!= null)&&this.rorstat.equals(rhs.rorstat))))&&((this.rprawrd == rhs.rprawrd)||((this.rprawrd!= null)&&this.rprawrd.equals(rhs.rprawrd))));
    }

}
