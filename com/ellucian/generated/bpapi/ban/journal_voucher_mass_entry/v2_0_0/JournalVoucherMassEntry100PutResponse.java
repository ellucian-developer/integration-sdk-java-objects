
package com.ellucian.generated.bpapi.ban.journal_voucher_mass_entry.v2_0_0;

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
    "fgbjvch",
    "fgbjvcd"
})
@Generated("jsonschema2pojo")
public class JournalVoucherMassEntry100PutResponse {

    @JsonProperty("fgbjvch")
    private List<Fgbjvch__2> fgbjvch = new ArrayList<Fgbjvch__2>();
    @JsonProperty("fgbjvcd")
    private List<Fgbjvcd__2> fgbjvcd = new ArrayList<Fgbjvcd__2>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("fgbjvch")
    public List<Fgbjvch__2> getFgbjvch() {
        return fgbjvch;
    }

    @JsonProperty("fgbjvch")
    public void setFgbjvch(List<Fgbjvch__2> fgbjvch) {
        this.fgbjvch = fgbjvch;
    }

    public JournalVoucherMassEntry100PutResponse withFgbjvch(List<Fgbjvch__2> fgbjvch) {
        this.fgbjvch = fgbjvch;
        return this;
    }

    @JsonProperty("fgbjvcd")
    public List<Fgbjvcd__2> getFgbjvcd() {
        return fgbjvcd;
    }

    @JsonProperty("fgbjvcd")
    public void setFgbjvcd(List<Fgbjvcd__2> fgbjvcd) {
        this.fgbjvcd = fgbjvcd;
    }

    public JournalVoucherMassEntry100PutResponse withFgbjvcd(List<Fgbjvcd__2> fgbjvcd) {
        this.fgbjvcd = fgbjvcd;
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

    public JournalVoucherMassEntry100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(JournalVoucherMassEntry100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fgbjvch");
        sb.append('=');
        sb.append(((this.fgbjvch == null)?"<null>":this.fgbjvch));
        sb.append(',');
        sb.append("fgbjvcd");
        sb.append('=');
        sb.append(((this.fgbjvcd == null)?"<null>":this.fgbjvcd));
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
        result = ((result* 31)+((this.fgbjvcd == null)? 0 :this.fgbjvcd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.fgbjvch == null)? 0 :this.fgbjvch.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JournalVoucherMassEntry100PutResponse) == false) {
            return false;
        }
        JournalVoucherMassEntry100PutResponse rhs = ((JournalVoucherMassEntry100PutResponse) other);
        return ((((this.fgbjvcd == rhs.fgbjvcd)||((this.fgbjvcd!= null)&&this.fgbjvcd.equals(rhs.fgbjvcd)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.fgbjvch == rhs.fgbjvch)||((this.fgbjvch!= null)&&this.fgbjvch.equals(rhs.fgbjvch))));
    }

}
