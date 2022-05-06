
package com.ellucian.generated.bpapi.ban.student_tax_notifications.v1_0_0;

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
    "detailAccessInd",
    "reptDesc",
    "totalAccessInd",
    "reptCode",
    "reptTotalAmount",
    "reptDescDisp2"
})
@Generated("jsonschema2pojo")
public class Ttrtaxr {

    /**
     * Lineage reference object : TTRTAXR_DETAIL_ACCESS_IND
     * 
     */
    @JsonProperty("detailAccessInd")
    @JsonPropertyDescription("Lineage reference object : TTRTAXR_DETAIL_ACCESS_IND")
    private String detailAccessInd;
    /**
     * Description
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("reptDesc")
    private String reptDesc;
    /**
     * Lineage reference object : TTRTAXR_TOTAL_ACCESS_IND
     * 
     */
    @JsonProperty("totalAccessInd")
    @JsonPropertyDescription("Lineage reference object : TTRTAXR_TOTAL_ACCESS_IND")
    private String totalAccessInd;
    /**
     * Report Code
     * <p>
     * Lineage reference object : TTRTAXR_REPT_CODE
     * (Required)
     * 
     */
    @JsonProperty("reptCode")
    @JsonPropertyDescription("Lineage reference object : TTRTAXR_REPT_CODE")
    private String reptCode;
    /**
     * Total
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("reptTotalAmount")
    private Double reptTotalAmount;
    /**
     * 
     * (Required)
     * (Required)
     * 
     */
    @JsonProperty("reptDescDisp2")
    private String reptDescDisp2;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : TTRTAXR_DETAIL_ACCESS_IND
     * 
     */
    @JsonProperty("detailAccessInd")
    public String getDetailAccessInd() {
        return detailAccessInd;
    }

    /**
     * Lineage reference object : TTRTAXR_DETAIL_ACCESS_IND
     * 
     */
    @JsonProperty("detailAccessInd")
    public void setDetailAccessInd(String detailAccessInd) {
        this.detailAccessInd = detailAccessInd;
    }

    public Ttrtaxr withDetailAccessInd(String detailAccessInd) {
        this.detailAccessInd = detailAccessInd;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("reptDesc")
    public String getReptDesc() {
        return reptDesc;
    }

    /**
     * Description
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("reptDesc")
    public void setReptDesc(String reptDesc) {
        this.reptDesc = reptDesc;
    }

    public Ttrtaxr withReptDesc(String reptDesc) {
        this.reptDesc = reptDesc;
        return this;
    }

    /**
     * Lineage reference object : TTRTAXR_TOTAL_ACCESS_IND
     * 
     */
    @JsonProperty("totalAccessInd")
    public String getTotalAccessInd() {
        return totalAccessInd;
    }

    /**
     * Lineage reference object : TTRTAXR_TOTAL_ACCESS_IND
     * 
     */
    @JsonProperty("totalAccessInd")
    public void setTotalAccessInd(String totalAccessInd) {
        this.totalAccessInd = totalAccessInd;
    }

    public Ttrtaxr withTotalAccessInd(String totalAccessInd) {
        this.totalAccessInd = totalAccessInd;
        return this;
    }

    /**
     * Report Code
     * <p>
     * Lineage reference object : TTRTAXR_REPT_CODE
     * (Required)
     * 
     */
    @JsonProperty("reptCode")
    public String getReptCode() {
        return reptCode;
    }

    /**
     * Report Code
     * <p>
     * Lineage reference object : TTRTAXR_REPT_CODE
     * (Required)
     * 
     */
    @JsonProperty("reptCode")
    public void setReptCode(String reptCode) {
        this.reptCode = reptCode;
    }

    public Ttrtaxr withReptCode(String reptCode) {
        this.reptCode = reptCode;
        return this;
    }

    /**
     * Total
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("reptTotalAmount")
    public Double getReptTotalAmount() {
        return reptTotalAmount;
    }

    /**
     * Total
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("reptTotalAmount")
    public void setReptTotalAmount(Double reptTotalAmount) {
        this.reptTotalAmount = reptTotalAmount;
    }

    public Ttrtaxr withReptTotalAmount(Double reptTotalAmount) {
        this.reptTotalAmount = reptTotalAmount;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("reptDescDisp2")
    public String getReptDescDisp2() {
        return reptDescDisp2;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("reptDescDisp2")
    public void setReptDescDisp2(String reptDescDisp2) {
        this.reptDescDisp2 = reptDescDisp2;
    }

    public Ttrtaxr withReptDescDisp2(String reptDescDisp2) {
        this.reptDescDisp2 = reptDescDisp2;
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

    public Ttrtaxr withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ttrtaxr.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("detailAccessInd");
        sb.append('=');
        sb.append(((this.detailAccessInd == null)?"<null>":this.detailAccessInd));
        sb.append(',');
        sb.append("reptDesc");
        sb.append('=');
        sb.append(((this.reptDesc == null)?"<null>":this.reptDesc));
        sb.append(',');
        sb.append("totalAccessInd");
        sb.append('=');
        sb.append(((this.totalAccessInd == null)?"<null>":this.totalAccessInd));
        sb.append(',');
        sb.append("reptCode");
        sb.append('=');
        sb.append(((this.reptCode == null)?"<null>":this.reptCode));
        sb.append(',');
        sb.append("reptTotalAmount");
        sb.append('=');
        sb.append(((this.reptTotalAmount == null)?"<null>":this.reptTotalAmount));
        sb.append(',');
        sb.append("reptDescDisp2");
        sb.append('=');
        sb.append(((this.reptDescDisp2 == null)?"<null>":this.reptDescDisp2));
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
        result = ((result* 31)+((this.detailAccessInd == null)? 0 :this.detailAccessInd.hashCode()));
        result = ((result* 31)+((this.reptDesc == null)? 0 :this.reptDesc.hashCode()));
        result = ((result* 31)+((this.totalAccessInd == null)? 0 :this.totalAccessInd.hashCode()));
        result = ((result* 31)+((this.reptCode == null)? 0 :this.reptCode.hashCode()));
        result = ((result* 31)+((this.reptTotalAmount == null)? 0 :this.reptTotalAmount.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.reptDescDisp2 == null)? 0 :this.reptDescDisp2 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ttrtaxr) == false) {
            return false;
        }
        Ttrtaxr rhs = ((Ttrtaxr) other);
        return ((((((((this.detailAccessInd == rhs.detailAccessInd)||((this.detailAccessInd!= null)&&this.detailAccessInd.equals(rhs.detailAccessInd)))&&((this.reptDesc == rhs.reptDesc)||((this.reptDesc!= null)&&this.reptDesc.equals(rhs.reptDesc))))&&((this.totalAccessInd == rhs.totalAccessInd)||((this.totalAccessInd!= null)&&this.totalAccessInd.equals(rhs.totalAccessInd))))&&((this.reptCode == rhs.reptCode)||((this.reptCode!= null)&&this.reptCode.equals(rhs.reptCode))))&&((this.reptTotalAmount == rhs.reptTotalAmount)||((this.reptTotalAmount!= null)&&this.reptTotalAmount.equals(rhs.reptTotalAmount))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.reptDescDisp2 == rhs.reptDescDisp2)||((this.reptDescDisp2 != null)&&this.reptDescDisp2 .equals(rhs.reptDescDisp2))));
    }

}
