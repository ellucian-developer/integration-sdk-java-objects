
package com.ellucian.generated.bpapi.ban.flexible_spending_accounts_rule.v1_0_0;

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
    "ptrflex",
    "ptrfben"
})
@Generated("jsonschema2pojo")
public class FlexibleSpendingAccountsRule100GetResponse {

    @JsonProperty("ptrflex")
    private List<Ptrflex> ptrflex = new ArrayList<Ptrflex>();
    @JsonProperty("ptrfben")
    private List<Ptrfben> ptrfben = new ArrayList<Ptrfben>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ptrflex")
    public List<Ptrflex> getPtrflex() {
        return ptrflex;
    }

    @JsonProperty("ptrflex")
    public void setPtrflex(List<Ptrflex> ptrflex) {
        this.ptrflex = ptrflex;
    }

    public FlexibleSpendingAccountsRule100GetResponse withPtrflex(List<Ptrflex> ptrflex) {
        this.ptrflex = ptrflex;
        return this;
    }

    @JsonProperty("ptrfben")
    public List<Ptrfben> getPtrfben() {
        return ptrfben;
    }

    @JsonProperty("ptrfben")
    public void setPtrfben(List<Ptrfben> ptrfben) {
        this.ptrfben = ptrfben;
    }

    public FlexibleSpendingAccountsRule100GetResponse withPtrfben(List<Ptrfben> ptrfben) {
        this.ptrfben = ptrfben;
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

    public FlexibleSpendingAccountsRule100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FlexibleSpendingAccountsRule100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ptrflex");
        sb.append('=');
        sb.append(((this.ptrflex == null)?"<null>":this.ptrflex));
        sb.append(',');
        sb.append("ptrfben");
        sb.append('=');
        sb.append(((this.ptrfben == null)?"<null>":this.ptrfben));
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
        result = ((result* 31)+((this.ptrfben == null)? 0 :this.ptrfben.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ptrflex == null)? 0 :this.ptrflex.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FlexibleSpendingAccountsRule100GetResponse) == false) {
            return false;
        }
        FlexibleSpendingAccountsRule100GetResponse rhs = ((FlexibleSpendingAccountsRule100GetResponse) other);
        return ((((this.ptrfben == rhs.ptrfben)||((this.ptrfben!= null)&&this.ptrfben.equals(rhs.ptrfben)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ptrflex == rhs.ptrflex)||((this.ptrflex!= null)&&this.ptrflex.equals(rhs.ptrflex))));
    }

}
