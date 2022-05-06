
package com.ellucian.generated.bpapi.ban.employee_benefit_or_deduction.v1_0_0;

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
    "pdrdedn",
    "pdrbded",
    "pdrxpid"
})
@Generated("jsonschema2pojo")
public class EmployeeBenefitOrDeduction100GetResponse {

    @JsonProperty("pdrdedn")
    private List<Pdrdedn> pdrdedn = new ArrayList<Pdrdedn>();
    @JsonProperty("pdrbded")
    private List<Pdrbded> pdrbded = new ArrayList<Pdrbded>();
    @JsonProperty("pdrxpid")
    private List<Pdrxpid> pdrxpid = new ArrayList<Pdrxpid>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("pdrdedn")
    public List<Pdrdedn> getPdrdedn() {
        return pdrdedn;
    }

    @JsonProperty("pdrdedn")
    public void setPdrdedn(List<Pdrdedn> pdrdedn) {
        this.pdrdedn = pdrdedn;
    }

    public EmployeeBenefitOrDeduction100GetResponse withPdrdedn(List<Pdrdedn> pdrdedn) {
        this.pdrdedn = pdrdedn;
        return this;
    }

    @JsonProperty("pdrbded")
    public List<Pdrbded> getPdrbded() {
        return pdrbded;
    }

    @JsonProperty("pdrbded")
    public void setPdrbded(List<Pdrbded> pdrbded) {
        this.pdrbded = pdrbded;
    }

    public EmployeeBenefitOrDeduction100GetResponse withPdrbded(List<Pdrbded> pdrbded) {
        this.pdrbded = pdrbded;
        return this;
    }

    @JsonProperty("pdrxpid")
    public List<Pdrxpid> getPdrxpid() {
        return pdrxpid;
    }

    @JsonProperty("pdrxpid")
    public void setPdrxpid(List<Pdrxpid> pdrxpid) {
        this.pdrxpid = pdrxpid;
    }

    public EmployeeBenefitOrDeduction100GetResponse withPdrxpid(List<Pdrxpid> pdrxpid) {
        this.pdrxpid = pdrxpid;
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

    public EmployeeBenefitOrDeduction100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmployeeBenefitOrDeduction100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("pdrdedn");
        sb.append('=');
        sb.append(((this.pdrdedn == null)?"<null>":this.pdrdedn));
        sb.append(',');
        sb.append("pdrbded");
        sb.append('=');
        sb.append(((this.pdrbded == null)?"<null>":this.pdrbded));
        sb.append(',');
        sb.append("pdrxpid");
        sb.append('=');
        sb.append(((this.pdrxpid == null)?"<null>":this.pdrxpid));
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
        result = ((result* 31)+((this.pdrdedn == null)? 0 :this.pdrdedn.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.pdrbded == null)? 0 :this.pdrbded.hashCode()));
        result = ((result* 31)+((this.pdrxpid == null)? 0 :this.pdrxpid.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmployeeBenefitOrDeduction100GetResponse) == false) {
            return false;
        }
        EmployeeBenefitOrDeduction100GetResponse rhs = ((EmployeeBenefitOrDeduction100GetResponse) other);
        return (((((this.pdrdedn == rhs.pdrdedn)||((this.pdrdedn!= null)&&this.pdrdedn.equals(rhs.pdrdedn)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.pdrbded == rhs.pdrbded)||((this.pdrbded!= null)&&this.pdrbded.equals(rhs.pdrbded))))&&((this.pdrxpid == rhs.pdrxpid)||((this.pdrxpid!= null)&&this.pdrxpid.equals(rhs.pdrxpid))));
    }

}
