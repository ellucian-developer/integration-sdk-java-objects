
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
public class MiscellaneousTransaction100PostResponse {

    @JsonProperty("tbrmisd")
    private List<Tbrmisd__1> tbrmisd = new ArrayList<Tbrmisd__1>();
    @JsonProperty("tbrcmis")
    private List<Tbrcmi__1> tbrcmis = new ArrayList<Tbrcmi__1>();
    @JsonProperty("receipt_print_ctl")
    private List<ReceiptPrintCtl__1> receiptPrintCtl = new ArrayList<ReceiptPrintCtl__1>();
    @JsonProperty("tbbmisc")
    private List<Tbbmisc__1> tbbmisc = new ArrayList<Tbbmisc__1>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("tbrmisd")
    public List<Tbrmisd__1> getTbrmisd() {
        return tbrmisd;
    }

    @JsonProperty("tbrmisd")
    public void setTbrmisd(List<Tbrmisd__1> tbrmisd) {
        this.tbrmisd = tbrmisd;
    }

    public MiscellaneousTransaction100PostResponse withTbrmisd(List<Tbrmisd__1> tbrmisd) {
        this.tbrmisd = tbrmisd;
        return this;
    }

    @JsonProperty("tbrcmis")
    public List<Tbrcmi__1> getTbrcmis() {
        return tbrcmis;
    }

    @JsonProperty("tbrcmis")
    public void setTbrcmis(List<Tbrcmi__1> tbrcmis) {
        this.tbrcmis = tbrcmis;
    }

    public MiscellaneousTransaction100PostResponse withTbrcmis(List<Tbrcmi__1> tbrcmis) {
        this.tbrcmis = tbrcmis;
        return this;
    }

    @JsonProperty("receipt_print_ctl")
    public List<ReceiptPrintCtl__1> getReceiptPrintCtl() {
        return receiptPrintCtl;
    }

    @JsonProperty("receipt_print_ctl")
    public void setReceiptPrintCtl(List<ReceiptPrintCtl__1> receiptPrintCtl) {
        this.receiptPrintCtl = receiptPrintCtl;
    }

    public MiscellaneousTransaction100PostResponse withReceiptPrintCtl(List<ReceiptPrintCtl__1> receiptPrintCtl) {
        this.receiptPrintCtl = receiptPrintCtl;
        return this;
    }

    @JsonProperty("tbbmisc")
    public List<Tbbmisc__1> getTbbmisc() {
        return tbbmisc;
    }

    @JsonProperty("tbbmisc")
    public void setTbbmisc(List<Tbbmisc__1> tbbmisc) {
        this.tbbmisc = tbbmisc;
    }

    public MiscellaneousTransaction100PostResponse withTbbmisc(List<Tbbmisc__1> tbbmisc) {
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

    public MiscellaneousTransaction100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MiscellaneousTransaction100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof MiscellaneousTransaction100PostResponse) == false) {
            return false;
        }
        MiscellaneousTransaction100PostResponse rhs = ((MiscellaneousTransaction100PostResponse) other);
        return ((((((this.tbrcmis == rhs.tbrcmis)||((this.tbrcmis!= null)&&this.tbrcmis.equals(rhs.tbrcmis)))&&((this.receiptPrintCtl == rhs.receiptPrintCtl)||((this.receiptPrintCtl!= null)&&this.receiptPrintCtl.equals(rhs.receiptPrintCtl))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.tbbmisc == rhs.tbbmisc)||((this.tbbmisc!= null)&&this.tbbmisc.equals(rhs.tbbmisc))))&&((this.tbrmisd == rhs.tbrmisd)||((this.tbrmisd!= null)&&this.tbrmisd.equals(rhs.tbrmisd))));
    }

}
