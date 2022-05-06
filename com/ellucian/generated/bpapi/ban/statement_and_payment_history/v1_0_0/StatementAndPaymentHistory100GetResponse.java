
package com.ellucian.generated.bpapi.ban.statement_and_payment_history.v1_0_0;

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
    "tbbstmt",
    "tbvphst",
    "tbraccd"
})
@Generated("jsonschema2pojo")
public class StatementAndPaymentHistory100GetResponse {

    @JsonProperty("tbbstmt")
    private List<Tbbstmt> tbbstmt = new ArrayList<Tbbstmt>();
    @JsonProperty("tbvphst")
    private List<Tbvphst> tbvphst = new ArrayList<Tbvphst>();
    @JsonProperty("tbraccd")
    private List<Tbraccd> tbraccd = new ArrayList<Tbraccd>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("tbbstmt")
    public List<Tbbstmt> getTbbstmt() {
        return tbbstmt;
    }

    @JsonProperty("tbbstmt")
    public void setTbbstmt(List<Tbbstmt> tbbstmt) {
        this.tbbstmt = tbbstmt;
    }

    public StatementAndPaymentHistory100GetResponse withTbbstmt(List<Tbbstmt> tbbstmt) {
        this.tbbstmt = tbbstmt;
        return this;
    }

    @JsonProperty("tbvphst")
    public List<Tbvphst> getTbvphst() {
        return tbvphst;
    }

    @JsonProperty("tbvphst")
    public void setTbvphst(List<Tbvphst> tbvphst) {
        this.tbvphst = tbvphst;
    }

    public StatementAndPaymentHistory100GetResponse withTbvphst(List<Tbvphst> tbvphst) {
        this.tbvphst = tbvphst;
        return this;
    }

    @JsonProperty("tbraccd")
    public List<Tbraccd> getTbraccd() {
        return tbraccd;
    }

    @JsonProperty("tbraccd")
    public void setTbraccd(List<Tbraccd> tbraccd) {
        this.tbraccd = tbraccd;
    }

    public StatementAndPaymentHistory100GetResponse withTbraccd(List<Tbraccd> tbraccd) {
        this.tbraccd = tbraccd;
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

    public StatementAndPaymentHistory100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StatementAndPaymentHistory100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tbbstmt");
        sb.append('=');
        sb.append(((this.tbbstmt == null)?"<null>":this.tbbstmt));
        sb.append(',');
        sb.append("tbvphst");
        sb.append('=');
        sb.append(((this.tbvphst == null)?"<null>":this.tbvphst));
        sb.append(',');
        sb.append("tbraccd");
        sb.append('=');
        sb.append(((this.tbraccd == null)?"<null>":this.tbraccd));
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
        result = ((result* 31)+((this.tbvphst == null)? 0 :this.tbvphst.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.tbbstmt == null)? 0 :this.tbbstmt.hashCode()));
        result = ((result* 31)+((this.tbraccd == null)? 0 :this.tbraccd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StatementAndPaymentHistory100GetResponse) == false) {
            return false;
        }
        StatementAndPaymentHistory100GetResponse rhs = ((StatementAndPaymentHistory100GetResponse) other);
        return (((((this.tbvphst == rhs.tbvphst)||((this.tbvphst!= null)&&this.tbvphst.equals(rhs.tbvphst)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.tbbstmt == rhs.tbbstmt)||((this.tbbstmt!= null)&&this.tbbstmt.equals(rhs.tbbstmt))))&&((this.tbraccd == rhs.tbraccd)||((this.tbraccd!= null)&&this.tbraccd.equals(rhs.tbraccd))));
    }

}
