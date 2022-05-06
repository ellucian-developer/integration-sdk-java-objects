
package com.ellucian.generated.bpapi.ban.finance_account_reviews.v1_0_0;

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
    "tbbacct",
    "tbristl",
    "tbrcolc"
})
@Generated("jsonschema2pojo")
public class FinanceAccountReviews100GetResponse {

    @JsonProperty("tbbacct")
    private List<Tbbacct> tbbacct = new ArrayList<Tbbacct>();
    @JsonProperty("tbristl")
    private List<Tbristl> tbristl = new ArrayList<Tbristl>();
    @JsonProperty("tbrcolc")
    private List<Tbrcolc> tbrcolc = new ArrayList<Tbrcolc>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("tbbacct")
    public List<Tbbacct> getTbbacct() {
        return tbbacct;
    }

    @JsonProperty("tbbacct")
    public void setTbbacct(List<Tbbacct> tbbacct) {
        this.tbbacct = tbbacct;
    }

    public FinanceAccountReviews100GetResponse withTbbacct(List<Tbbacct> tbbacct) {
        this.tbbacct = tbbacct;
        return this;
    }

    @JsonProperty("tbristl")
    public List<Tbristl> getTbristl() {
        return tbristl;
    }

    @JsonProperty("tbristl")
    public void setTbristl(List<Tbristl> tbristl) {
        this.tbristl = tbristl;
    }

    public FinanceAccountReviews100GetResponse withTbristl(List<Tbristl> tbristl) {
        this.tbristl = tbristl;
        return this;
    }

    @JsonProperty("tbrcolc")
    public List<Tbrcolc> getTbrcolc() {
        return tbrcolc;
    }

    @JsonProperty("tbrcolc")
    public void setTbrcolc(List<Tbrcolc> tbrcolc) {
        this.tbrcolc = tbrcolc;
    }

    public FinanceAccountReviews100GetResponse withTbrcolc(List<Tbrcolc> tbrcolc) {
        this.tbrcolc = tbrcolc;
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

    public FinanceAccountReviews100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FinanceAccountReviews100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tbbacct");
        sb.append('=');
        sb.append(((this.tbbacct == null)?"<null>":this.tbbacct));
        sb.append(',');
        sb.append("tbristl");
        sb.append('=');
        sb.append(((this.tbristl == null)?"<null>":this.tbristl));
        sb.append(',');
        sb.append("tbrcolc");
        sb.append('=');
        sb.append(((this.tbrcolc == null)?"<null>":this.tbrcolc));
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
        result = ((result* 31)+((this.tbristl == null)? 0 :this.tbristl.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.tbrcolc == null)? 0 :this.tbrcolc.hashCode()));
        result = ((result* 31)+((this.tbbacct == null)? 0 :this.tbbacct.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FinanceAccountReviews100GetResponse) == false) {
            return false;
        }
        FinanceAccountReviews100GetResponse rhs = ((FinanceAccountReviews100GetResponse) other);
        return (((((this.tbristl == rhs.tbristl)||((this.tbristl!= null)&&this.tbristl.equals(rhs.tbristl)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.tbrcolc == rhs.tbrcolc)||((this.tbrcolc!= null)&&this.tbrcolc.equals(rhs.tbrcolc))))&&((this.tbbacct == rhs.tbbacct)||((this.tbbacct!= null)&&this.tbbacct.equals(rhs.tbbacct))));
    }

}
