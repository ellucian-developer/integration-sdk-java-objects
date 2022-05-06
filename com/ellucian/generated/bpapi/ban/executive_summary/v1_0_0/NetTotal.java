
package com.ellucian.generated.bpapi.ban.executive_summary.v1_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "netSumYtdActv",
    "netSumAdjt",
    "netSumRsrv",
    "netSumAbal"
})
@Generated("jsonschema2pojo")
public class NetTotal {

    /**
     * Lineage reference object : netSumYtdActv
     * 
     */
    @JsonProperty("netSumYtdActv")
    @JsonPropertyDescription("Lineage reference object : netSumYtdActv")
    private Object netSumYtdActv;
    /**
     * Net Total
     * <p>
     * Lineage reference object : netSumAdjt
     * 
     */
    @JsonProperty("netSumAdjt")
    @JsonPropertyDescription("Lineage reference object : netSumAdjt")
    private Object netSumAdjt;
    /**
     * Lineage reference object : netSumRsrv
     * 
     */
    @JsonProperty("netSumRsrv")
    @JsonPropertyDescription("Lineage reference object : netSumRsrv")
    private Object netSumRsrv;
    /**
     * Lineage reference object : netSumAbal
     * 
     */
    @JsonProperty("netSumAbal")
    @JsonPropertyDescription("Lineage reference object : netSumAbal")
    private Object netSumAbal;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : netSumYtdActv
     * 
     */
    @JsonProperty("netSumYtdActv")
    public Object getNetSumYtdActv() {
        return netSumYtdActv;
    }

    /**
     * Lineage reference object : netSumYtdActv
     * 
     */
    @JsonProperty("netSumYtdActv")
    public void setNetSumYtdActv(Object netSumYtdActv) {
        this.netSumYtdActv = netSumYtdActv;
    }

    public NetTotal withNetSumYtdActv(Object netSumYtdActv) {
        this.netSumYtdActv = netSumYtdActv;
        return this;
    }

    /**
     * Net Total
     * <p>
     * Lineage reference object : netSumAdjt
     * 
     */
    @JsonProperty("netSumAdjt")
    public Object getNetSumAdjt() {
        return netSumAdjt;
    }

    /**
     * Net Total
     * <p>
     * Lineage reference object : netSumAdjt
     * 
     */
    @JsonProperty("netSumAdjt")
    public void setNetSumAdjt(Object netSumAdjt) {
        this.netSumAdjt = netSumAdjt;
    }

    public NetTotal withNetSumAdjt(Object netSumAdjt) {
        this.netSumAdjt = netSumAdjt;
        return this;
    }

    /**
     * Lineage reference object : netSumRsrv
     * 
     */
    @JsonProperty("netSumRsrv")
    public Object getNetSumRsrv() {
        return netSumRsrv;
    }

    /**
     * Lineage reference object : netSumRsrv
     * 
     */
    @JsonProperty("netSumRsrv")
    public void setNetSumRsrv(Object netSumRsrv) {
        this.netSumRsrv = netSumRsrv;
    }

    public NetTotal withNetSumRsrv(Object netSumRsrv) {
        this.netSumRsrv = netSumRsrv;
        return this;
    }

    /**
     * Lineage reference object : netSumAbal
     * 
     */
    @JsonProperty("netSumAbal")
    public Object getNetSumAbal() {
        return netSumAbal;
    }

    /**
     * Lineage reference object : netSumAbal
     * 
     */
    @JsonProperty("netSumAbal")
    public void setNetSumAbal(Object netSumAbal) {
        this.netSumAbal = netSumAbal;
    }

    public NetTotal withNetSumAbal(Object netSumAbal) {
        this.netSumAbal = netSumAbal;
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

    public NetTotal withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NetTotal.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("netSumYtdActv");
        sb.append('=');
        sb.append(((this.netSumYtdActv == null)?"<null>":this.netSumYtdActv));
        sb.append(',');
        sb.append("netSumAdjt");
        sb.append('=');
        sb.append(((this.netSumAdjt == null)?"<null>":this.netSumAdjt));
        sb.append(',');
        sb.append("netSumRsrv");
        sb.append('=');
        sb.append(((this.netSumRsrv == null)?"<null>":this.netSumRsrv));
        sb.append(',');
        sb.append("netSumAbal");
        sb.append('=');
        sb.append(((this.netSumAbal == null)?"<null>":this.netSumAbal));
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
        result = ((result* 31)+((this.netSumYtdActv == null)? 0 :this.netSumYtdActv.hashCode()));
        result = ((result* 31)+((this.netSumAdjt == null)? 0 :this.netSumAdjt.hashCode()));
        result = ((result* 31)+((this.netSumRsrv == null)? 0 :this.netSumRsrv.hashCode()));
        result = ((result* 31)+((this.netSumAbal == null)? 0 :this.netSumAbal.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NetTotal) == false) {
            return false;
        }
        NetTotal rhs = ((NetTotal) other);
        return ((((((this.netSumYtdActv == rhs.netSumYtdActv)||((this.netSumYtdActv!= null)&&this.netSumYtdActv.equals(rhs.netSumYtdActv)))&&((this.netSumAdjt == rhs.netSumAdjt)||((this.netSumAdjt!= null)&&this.netSumAdjt.equals(rhs.netSumAdjt))))&&((this.netSumRsrv == rhs.netSumRsrv)||((this.netSumRsrv!= null)&&this.netSumRsrv.equals(rhs.netSumRsrv))))&&((this.netSumAbal == rhs.netSumAbal)||((this.netSumAbal!= null)&&this.netSumAbal.equals(rhs.netSumAbal))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
