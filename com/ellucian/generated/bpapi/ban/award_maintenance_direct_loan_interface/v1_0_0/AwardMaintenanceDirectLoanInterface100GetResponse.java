
package com.ellucian.generated.bpapi.ban.award_maintenance_direct_loan_interface.v1_0_0;

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
    "rpratrm2",
    "rlrdlps"
})
@Generated("jsonschema2pojo")
public class AwardMaintenanceDirectLoanInterface100GetResponse {

    @JsonProperty("rpratrm2")
    private List<Rpratrm2> rpratrm2 = new ArrayList<Rpratrm2>();
    @JsonProperty("rlrdlps")
    private List<Rlrdlp> rlrdlps = new ArrayList<Rlrdlp>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("rpratrm2")
    public List<Rpratrm2> getRpratrm2() {
        return rpratrm2;
    }

    @JsonProperty("rpratrm2")
    public void setRpratrm2(List<Rpratrm2> rpratrm2) {
        this.rpratrm2 = rpratrm2;
    }

    public AwardMaintenanceDirectLoanInterface100GetResponse withRpratrm2(List<Rpratrm2> rpratrm2) {
        this.rpratrm2 = rpratrm2;
        return this;
    }

    @JsonProperty("rlrdlps")
    public List<Rlrdlp> getRlrdlps() {
        return rlrdlps;
    }

    @JsonProperty("rlrdlps")
    public void setRlrdlps(List<Rlrdlp> rlrdlps) {
        this.rlrdlps = rlrdlps;
    }

    public AwardMaintenanceDirectLoanInterface100GetResponse withRlrdlps(List<Rlrdlp> rlrdlps) {
        this.rlrdlps = rlrdlps;
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

    public AwardMaintenanceDirectLoanInterface100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AwardMaintenanceDirectLoanInterface100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rpratrm2");
        sb.append('=');
        sb.append(((this.rpratrm2 == null)?"<null>":this.rpratrm2));
        sb.append(',');
        sb.append("rlrdlps");
        sb.append('=');
        sb.append(((this.rlrdlps == null)?"<null>":this.rlrdlps));
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
        result = ((result* 31)+((this.rlrdlps == null)? 0 :this.rlrdlps.hashCode()));
        result = ((result* 31)+((this.rpratrm2 == null)? 0 :this.rpratrm2 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AwardMaintenanceDirectLoanInterface100GetResponse) == false) {
            return false;
        }
        AwardMaintenanceDirectLoanInterface100GetResponse rhs = ((AwardMaintenanceDirectLoanInterface100GetResponse) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.rlrdlps == rhs.rlrdlps)||((this.rlrdlps!= null)&&this.rlrdlps.equals(rhs.rlrdlps))))&&((this.rpratrm2 == rhs.rpratrm2)||((this.rpratrm2 != null)&&this.rpratrm2 .equals(rhs.rpratrm2))));
    }

}
