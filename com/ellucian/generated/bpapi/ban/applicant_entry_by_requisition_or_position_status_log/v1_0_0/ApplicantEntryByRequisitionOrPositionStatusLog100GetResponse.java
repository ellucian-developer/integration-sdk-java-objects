
package com.ellucian.generated.bpapi.ban.applicant_entry_by_requisition_or_position_status_log.v1_0_0;

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
    "pabappl",
    "parapst"
})
@Generated("jsonschema2pojo")
public class ApplicantEntryByRequisitionOrPositionStatusLog100GetResponse {

    @JsonProperty("pabappl")
    private List<Pabappl> pabappl = new ArrayList<Pabappl>();
    @JsonProperty("parapst")
    private List<Parapst> parapst = new ArrayList<Parapst>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("pabappl")
    public List<Pabappl> getPabappl() {
        return pabappl;
    }

    @JsonProperty("pabappl")
    public void setPabappl(List<Pabappl> pabappl) {
        this.pabappl = pabappl;
    }

    public ApplicantEntryByRequisitionOrPositionStatusLog100GetResponse withPabappl(List<Pabappl> pabappl) {
        this.pabappl = pabappl;
        return this;
    }

    @JsonProperty("parapst")
    public List<Parapst> getParapst() {
        return parapst;
    }

    @JsonProperty("parapst")
    public void setParapst(List<Parapst> parapst) {
        this.parapst = parapst;
    }

    public ApplicantEntryByRequisitionOrPositionStatusLog100GetResponse withParapst(List<Parapst> parapst) {
        this.parapst = parapst;
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

    public ApplicantEntryByRequisitionOrPositionStatusLog100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApplicantEntryByRequisitionOrPositionStatusLog100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("pabappl");
        sb.append('=');
        sb.append(((this.pabappl == null)?"<null>":this.pabappl));
        sb.append(',');
        sb.append("parapst");
        sb.append('=');
        sb.append(((this.parapst == null)?"<null>":this.parapst));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.parapst == null)? 0 :this.parapst.hashCode()));
        result = ((result* 31)+((this.pabappl == null)? 0 :this.pabappl.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicantEntryByRequisitionOrPositionStatusLog100GetResponse) == false) {
            return false;
        }
        ApplicantEntryByRequisitionOrPositionStatusLog100GetResponse rhs = ((ApplicantEntryByRequisitionOrPositionStatusLog100GetResponse) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.parapst == rhs.parapst)||((this.parapst!= null)&&this.parapst.equals(rhs.parapst))))&&((this.pabappl == rhs.pabappl)||((this.pabappl!= null)&&this.pabappl.equals(rhs.pabappl))));
    }

}
