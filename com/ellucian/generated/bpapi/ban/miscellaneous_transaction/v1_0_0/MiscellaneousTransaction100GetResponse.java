
package com.ellucian.generated.bpapi.ban.miscellaneous_transaction.v1_0_0;

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
    "tbrmisd",
    "tbrcmis",
    "receipt_print_ctl",
    "tbbmisc"
})
@Generated("jsonschema2pojo")
public class MiscellaneousTransaction100GetResponse {

    @JsonProperty("tbrmisd")
    private List<Tbrmisd> tbrmisd = new ArrayList<Tbrmisd>();
    @JsonProperty("tbrcmis")
    private List<Tbrcmi> tbrcmis = new ArrayList<Tbrcmi>();
    @JsonProperty("receipt_print_ctl")
    private List<ReceiptPrintCtl> receiptPrintCtl = new ArrayList<ReceiptPrintCtl>();
    @JsonProperty("tbbmisc")
    private List<Tbbmisc> tbbmisc = new ArrayList<Tbbmisc>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("tbrmisd")
    public List<Tbrmisd> getTbrmisd() {
        return tbrmisd;
    }

    @JsonProperty("tbrmisd")
    public void setTbrmisd(List<Tbrmisd> tbrmisd) {
        this.tbrmisd = tbrmisd;
    }

    public MiscellaneousTransaction100GetResponse withTbrmisd(List<Tbrmisd> tbrmisd) {
        this.tbrmisd = tbrmisd;
        return this;
    }

    @JsonProperty("tbrcmis")
    public List<Tbrcmi> getTbrcmis() {
        return tbrcmis;
    }

    @JsonProperty("tbrcmis")
    public void setTbrcmis(List<Tbrcmi> tbrcmis) {
        this.tbrcmis = tbrcmis;
    }

    public MiscellaneousTransaction100GetResponse withTbrcmis(List<Tbrcmi> tbrcmis) {
        this.tbrcmis = tbrcmis;
        return this;
    }

    @JsonProperty("receipt_print_ctl")
    public List<ReceiptPrintCtl> getReceiptPrintCtl() {
        return receiptPrintCtl;
    }

    @JsonProperty("receipt_print_ctl")
    public void setReceiptPrintCtl(List<ReceiptPrintCtl> receiptPrintCtl) {
        this.receiptPrintCtl = receiptPrintCtl;
    }

    public MiscellaneousTransaction100GetResponse withReceiptPrintCtl(List<ReceiptPrintCtl> receiptPrintCtl) {
        this.receiptPrintCtl = receiptPrintCtl;
        return this;
    }

    @JsonProperty("tbbmisc")
    public List<Tbbmisc> getTbbmisc() {
        return tbbmisc;
    }

    @JsonProperty("tbbmisc")
    public void setTbbmisc(List<Tbbmisc> tbbmisc) {
        this.tbbmisc = tbbmisc;
    }

    public MiscellaneousTransaction100GetResponse withTbbmisc(List<Tbbmisc> tbbmisc) {
        this.tbbmisc = tbbmisc;
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

    public MiscellaneousTransaction100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MiscellaneousTransaction100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tbrmisd");
        sb.append('=');
        sb.append(((this.tbrmisd == null)?"<null>":this.tbrmisd));
        sb.append(',');
        sb.append("tbrcmis");
        sb.append('=');
        sb.append(((this.tbrcmis == null)?"<null>":this.tbrcmis));
        sb.append(',');
        sb.append("receiptPrintCtl");
        sb.append('=');
        sb.append(((this.receiptPrintCtl == null)?"<null>":this.receiptPrintCtl));
        sb.append(',');
        sb.append("tbbmisc");
        sb.append('=');
        sb.append(((this.tbbmisc == null)?"<null>":this.tbbmisc));
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
        result = ((result* 31)+((this.tbrcmis == null)? 0 :this.tbrcmis.hashCode()));
        result = ((result* 31)+((this.receiptPrintCtl == null)? 0 :this.receiptPrintCtl.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.tbbmisc == null)? 0 :this.tbbmisc.hashCode()));
        result = ((result* 31)+((this.tbrmisd == null)? 0 :this.tbrmisd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MiscellaneousTransaction100GetResponse) == false) {
            return false;
        }
        MiscellaneousTransaction100GetResponse rhs = ((MiscellaneousTransaction100GetResponse) other);
        return ((((((this.tbrcmis == rhs.tbrcmis)||((this.tbrcmis!= null)&&this.tbrcmis.equals(rhs.tbrcmis)))&&((this.receiptPrintCtl == rhs.receiptPrintCtl)||((this.receiptPrintCtl!= null)&&this.receiptPrintCtl.equals(rhs.receiptPrintCtl))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.tbbmisc == rhs.tbbmisc)||((this.tbbmisc!= null)&&this.tbbmisc.equals(rhs.tbbmisc))))&&((this.tbrmisd == rhs.tbrmisd)||((this.tbrmisd!= null)&&this.tbrmisd.equals(rhs.tbrmisd))));
    }

}
