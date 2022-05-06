
package com.ellucian.generated.bpapi.ban.student_account_summaries.v1_0_0;

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
    "acct_bal",
    "tbbacct",
    "tbbcstu",
    "tbbestu",
    "tbrcolc",
    "tbristl"
})
@Generated("jsonschema2pojo")
public class StudentAccountSummaries100GetResponse {

    @JsonProperty("acct_bal")
    private List<AcctBal> acctBal = new ArrayList<AcctBal>();
    @JsonProperty("tbbacct")
    private List<Tbbacct> tbbacct = new ArrayList<Tbbacct>();
    @JsonProperty("tbbcstu")
    private List<Tbbcstu> tbbcstu = new ArrayList<Tbbcstu>();
    @JsonProperty("tbbestu")
    private List<Tbbestu> tbbestu = new ArrayList<Tbbestu>();
    @JsonProperty("tbrcolc")
    private List<Tbrcolc> tbrcolc = new ArrayList<Tbrcolc>();
    @JsonProperty("tbristl")
    private List<Tbristl> tbristl = new ArrayList<Tbristl>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("acct_bal")
    public List<AcctBal> getAcctBal() {
        return acctBal;
    }

    @JsonProperty("acct_bal")
    public void setAcctBal(List<AcctBal> acctBal) {
        this.acctBal = acctBal;
    }

    public StudentAccountSummaries100GetResponse withAcctBal(List<AcctBal> acctBal) {
        this.acctBal = acctBal;
        return this;
    }

    @JsonProperty("tbbacct")
    public List<Tbbacct> getTbbacct() {
        return tbbacct;
    }

    @JsonProperty("tbbacct")
    public void setTbbacct(List<Tbbacct> tbbacct) {
        this.tbbacct = tbbacct;
    }

    public StudentAccountSummaries100GetResponse withTbbacct(List<Tbbacct> tbbacct) {
        this.tbbacct = tbbacct;
        return this;
    }

    @JsonProperty("tbbcstu")
    public List<Tbbcstu> getTbbcstu() {
        return tbbcstu;
    }

    @JsonProperty("tbbcstu")
    public void setTbbcstu(List<Tbbcstu> tbbcstu) {
        this.tbbcstu = tbbcstu;
    }

    public StudentAccountSummaries100GetResponse withTbbcstu(List<Tbbcstu> tbbcstu) {
        this.tbbcstu = tbbcstu;
        return this;
    }

    @JsonProperty("tbbestu")
    public List<Tbbestu> getTbbestu() {
        return tbbestu;
    }

    @JsonProperty("tbbestu")
    public void setTbbestu(List<Tbbestu> tbbestu) {
        this.tbbestu = tbbestu;
    }

    public StudentAccountSummaries100GetResponse withTbbestu(List<Tbbestu> tbbestu) {
        this.tbbestu = tbbestu;
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

    public StudentAccountSummaries100GetResponse withTbrcolc(List<Tbrcolc> tbrcolc) {
        this.tbrcolc = tbrcolc;
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

    public StudentAccountSummaries100GetResponse withTbristl(List<Tbristl> tbristl) {
        this.tbristl = tbristl;
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

    public StudentAccountSummaries100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentAccountSummaries100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("acctBal");
        sb.append('=');
        sb.append(((this.acctBal == null)?"<null>":this.acctBal));
        sb.append(',');
        sb.append("tbbacct");
        sb.append('=');
        sb.append(((this.tbbacct == null)?"<null>":this.tbbacct));
        sb.append(',');
        sb.append("tbbcstu");
        sb.append('=');
        sb.append(((this.tbbcstu == null)?"<null>":this.tbbcstu));
        sb.append(',');
        sb.append("tbbestu");
        sb.append('=');
        sb.append(((this.tbbestu == null)?"<null>":this.tbbestu));
        sb.append(',');
        sb.append("tbrcolc");
        sb.append('=');
        sb.append(((this.tbrcolc == null)?"<null>":this.tbrcolc));
        sb.append(',');
        sb.append("tbristl");
        sb.append('=');
        sb.append(((this.tbristl == null)?"<null>":this.tbristl));
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
        result = ((result* 31)+((this.tbbestu == null)? 0 :this.tbbestu.hashCode()));
        result = ((result* 31)+((this.tbristl == null)? 0 :this.tbristl.hashCode()));
        result = ((result* 31)+((this.tbbcstu == null)? 0 :this.tbbcstu.hashCode()));
        result = ((result* 31)+((this.tbrcolc == null)? 0 :this.tbrcolc.hashCode()));
        result = ((result* 31)+((this.tbbacct == null)? 0 :this.tbbacct.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.acctBal == null)? 0 :this.acctBal.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentAccountSummaries100GetResponse) == false) {
            return false;
        }
        StudentAccountSummaries100GetResponse rhs = ((StudentAccountSummaries100GetResponse) other);
        return ((((((((this.tbbestu == rhs.tbbestu)||((this.tbbestu!= null)&&this.tbbestu.equals(rhs.tbbestu)))&&((this.tbristl == rhs.tbristl)||((this.tbristl!= null)&&this.tbristl.equals(rhs.tbristl))))&&((this.tbbcstu == rhs.tbbcstu)||((this.tbbcstu!= null)&&this.tbbcstu.equals(rhs.tbbcstu))))&&((this.tbrcolc == rhs.tbrcolc)||((this.tbrcolc!= null)&&this.tbrcolc.equals(rhs.tbrcolc))))&&((this.tbbacct == rhs.tbbacct)||((this.tbbacct!= null)&&this.tbbacct.equals(rhs.tbbacct))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.acctBal == rhs.acctBal)||((this.acctBal!= null)&&this.acctBal.equals(rhs.acctBal))));
    }

}
