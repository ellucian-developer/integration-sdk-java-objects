
package com.ellucian.generated.bpapi.ban.award_maintenance_disbursement_schedule.v1_0_0;

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
    "rpradsb",
    "rpradsb_act",
    "rpradsb_calc"
})
@Generated("jsonschema2pojo")
public class AwardMaintenanceDisbursementSchedule100GetResponse {

    @JsonProperty("rpradsb")
    private List<Rpradsb> rpradsb = new ArrayList<Rpradsb>();
    @JsonProperty("rpradsb_act")
    private List<RpradsbAct> rpradsbAct = new ArrayList<RpradsbAct>();
    @JsonProperty("rpradsb_calc")
    private List<RpradsbCalc> rpradsbCalc = new ArrayList<RpradsbCalc>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("rpradsb")
    public List<Rpradsb> getRpradsb() {
        return rpradsb;
    }

    @JsonProperty("rpradsb")
    public void setRpradsb(List<Rpradsb> rpradsb) {
        this.rpradsb = rpradsb;
    }

    public AwardMaintenanceDisbursementSchedule100GetResponse withRpradsb(List<Rpradsb> rpradsb) {
        this.rpradsb = rpradsb;
        return this;
    }

    @JsonProperty("rpradsb_act")
    public List<RpradsbAct> getRpradsbAct() {
        return rpradsbAct;
    }

    @JsonProperty("rpradsb_act")
    public void setRpradsbAct(List<RpradsbAct> rpradsbAct) {
        this.rpradsbAct = rpradsbAct;
    }

    public AwardMaintenanceDisbursementSchedule100GetResponse withRpradsbAct(List<RpradsbAct> rpradsbAct) {
        this.rpradsbAct = rpradsbAct;
        return this;
    }

    @JsonProperty("rpradsb_calc")
    public List<RpradsbCalc> getRpradsbCalc() {
        return rpradsbCalc;
    }

    @JsonProperty("rpradsb_calc")
    public void setRpradsbCalc(List<RpradsbCalc> rpradsbCalc) {
        this.rpradsbCalc = rpradsbCalc;
    }

    public AwardMaintenanceDisbursementSchedule100GetResponse withRpradsbCalc(List<RpradsbCalc> rpradsbCalc) {
        this.rpradsbCalc = rpradsbCalc;
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

    public AwardMaintenanceDisbursementSchedule100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AwardMaintenanceDisbursementSchedule100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rpradsb");
        sb.append('=');
        sb.append(((this.rpradsb == null)?"<null>":this.rpradsb));
        sb.append(',');
        sb.append("rpradsbAct");
        sb.append('=');
        sb.append(((this.rpradsbAct == null)?"<null>":this.rpradsbAct));
        sb.append(',');
        sb.append("rpradsbCalc");
        sb.append('=');
        sb.append(((this.rpradsbCalc == null)?"<null>":this.rpradsbCalc));
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
        result = ((result* 31)+((this.rpradsbAct == null)? 0 :this.rpradsbAct.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.rpradsbCalc == null)? 0 :this.rpradsbCalc.hashCode()));
        result = ((result* 31)+((this.rpradsb == null)? 0 :this.rpradsb.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AwardMaintenanceDisbursementSchedule100GetResponse) == false) {
            return false;
        }
        AwardMaintenanceDisbursementSchedule100GetResponse rhs = ((AwardMaintenanceDisbursementSchedule100GetResponse) other);
        return (((((this.rpradsbAct == rhs.rpradsbAct)||((this.rpradsbAct!= null)&&this.rpradsbAct.equals(rhs.rpradsbAct)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.rpradsbCalc == rhs.rpradsbCalc)||((this.rpradsbCalc!= null)&&this.rpradsbCalc.equals(rhs.rpradsbCalc))))&&((this.rpradsb == rhs.rpradsb)||((this.rpradsb!= null)&&this.rpradsb.equals(rhs.rpradsb))));
    }

}
