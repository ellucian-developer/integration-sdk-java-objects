
package com.ellucian.generated.bpapi.ban.receiving_goods_query.v1_0_0;

import java.util.Date;
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
    "textDescHdr",
    "fpbrchdRcvdDate",
    "carrierName",
    "fpbrchdCarrCode",
    "fpbrchdUserId",
    "receivingMethodDesc",
    "fpbrchdRcmtCode"
})
@Generated("jsonschema2pojo")
public class FpbrchdBlock {

    /**
     * Text Exists
     * <p>
     * 
     * 
     */
    @JsonProperty("textDescHdr")
    private String textDescHdr;
    /**
     * Date Received
     * <p>
     * Lineage reference object : FPBRCHD_RCVD_DATE
     * 
     */
    @JsonProperty("fpbrchdRcvdDate")
    @JsonPropertyDescription("Lineage reference object : FPBRCHD_RCVD_DATE")
    private Date fpbrchdRcvdDate;
    @JsonProperty("carrierName")
    private String carrierName;
    /**
     * Carrier
     * <p>
     * 
     * 
     */
    @JsonProperty("fpbrchdCarrCode")
    private String fpbrchdCarrCode;
    /**
     * Received By
     * <p>
     * Lineage reference object : FPBRCHD_USER_ID
     * 
     */
    @JsonProperty("fpbrchdUserId")
    @JsonPropertyDescription("Lineage reference object : FPBRCHD_USER_ID")
    private String fpbrchdUserId;
    @JsonProperty("receivingMethodDesc")
    private String receivingMethodDesc;
    /**
     * Receiving Method
     * <p>
     * Lineage reference object : FPBRCHD_RCMT_CODE, Lookup lineage reference object : ftvrcmt
     * 
     */
    @JsonProperty("fpbrchdRcmtCode")
    @JsonPropertyDescription("Lineage reference object : FPBRCHD_RCMT_CODE, Lookup lineage reference object : ftvrcmt")
    private String fpbrchdRcmtCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Text Exists
     * <p>
     * 
     * 
     */
    @JsonProperty("textDescHdr")
    public String getTextDescHdr() {
        return textDescHdr;
    }

    /**
     * Text Exists
     * <p>
     * 
     * 
     */
    @JsonProperty("textDescHdr")
    public void setTextDescHdr(String textDescHdr) {
        this.textDescHdr = textDescHdr;
    }

    public FpbrchdBlock withTextDescHdr(String textDescHdr) {
        this.textDescHdr = textDescHdr;
        return this;
    }

    /**
     * Date Received
     * <p>
     * Lineage reference object : FPBRCHD_RCVD_DATE
     * 
     */
    @JsonProperty("fpbrchdRcvdDate")
    public Date getFpbrchdRcvdDate() {
        return fpbrchdRcvdDate;
    }

    /**
     * Date Received
     * <p>
     * Lineage reference object : FPBRCHD_RCVD_DATE
     * 
     */
    @JsonProperty("fpbrchdRcvdDate")
    public void setFpbrchdRcvdDate(Date fpbrchdRcvdDate) {
        this.fpbrchdRcvdDate = fpbrchdRcvdDate;
    }

    public FpbrchdBlock withFpbrchdRcvdDate(Date fpbrchdRcvdDate) {
        this.fpbrchdRcvdDate = fpbrchdRcvdDate;
        return this;
    }

    @JsonProperty("carrierName")
    public String getCarrierName() {
        return carrierName;
    }

    @JsonProperty("carrierName")
    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    public FpbrchdBlock withCarrierName(String carrierName) {
        this.carrierName = carrierName;
        return this;
    }

    /**
     * Carrier
     * <p>
     * 
     * 
     */
    @JsonProperty("fpbrchdCarrCode")
    public String getFpbrchdCarrCode() {
        return fpbrchdCarrCode;
    }

    /**
     * Carrier
     * <p>
     * 
     * 
     */
    @JsonProperty("fpbrchdCarrCode")
    public void setFpbrchdCarrCode(String fpbrchdCarrCode) {
        this.fpbrchdCarrCode = fpbrchdCarrCode;
    }

    public FpbrchdBlock withFpbrchdCarrCode(String fpbrchdCarrCode) {
        this.fpbrchdCarrCode = fpbrchdCarrCode;
        return this;
    }

    /**
     * Received By
     * <p>
     * Lineage reference object : FPBRCHD_USER_ID
     * 
     */
    @JsonProperty("fpbrchdUserId")
    public String getFpbrchdUserId() {
        return fpbrchdUserId;
    }

    /**
     * Received By
     * <p>
     * Lineage reference object : FPBRCHD_USER_ID
     * 
     */
    @JsonProperty("fpbrchdUserId")
    public void setFpbrchdUserId(String fpbrchdUserId) {
        this.fpbrchdUserId = fpbrchdUserId;
    }

    public FpbrchdBlock withFpbrchdUserId(String fpbrchdUserId) {
        this.fpbrchdUserId = fpbrchdUserId;
        return this;
    }

    @JsonProperty("receivingMethodDesc")
    public String getReceivingMethodDesc() {
        return receivingMethodDesc;
    }

    @JsonProperty("receivingMethodDesc")
    public void setReceivingMethodDesc(String receivingMethodDesc) {
        this.receivingMethodDesc = receivingMethodDesc;
    }

    public FpbrchdBlock withReceivingMethodDesc(String receivingMethodDesc) {
        this.receivingMethodDesc = receivingMethodDesc;
        return this;
    }

    /**
     * Receiving Method
     * <p>
     * Lineage reference object : FPBRCHD_RCMT_CODE, Lookup lineage reference object : ftvrcmt
     * 
     */
    @JsonProperty("fpbrchdRcmtCode")
    public String getFpbrchdRcmtCode() {
        return fpbrchdRcmtCode;
    }

    /**
     * Receiving Method
     * <p>
     * Lineage reference object : FPBRCHD_RCMT_CODE, Lookup lineage reference object : ftvrcmt
     * 
     */
    @JsonProperty("fpbrchdRcmtCode")
    public void setFpbrchdRcmtCode(String fpbrchdRcmtCode) {
        this.fpbrchdRcmtCode = fpbrchdRcmtCode;
    }

    public FpbrchdBlock withFpbrchdRcmtCode(String fpbrchdRcmtCode) {
        this.fpbrchdRcmtCode = fpbrchdRcmtCode;
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

    public FpbrchdBlock withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FpbrchdBlock.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("textDescHdr");
        sb.append('=');
        sb.append(((this.textDescHdr == null)?"<null>":this.textDescHdr));
        sb.append(',');
        sb.append("fpbrchdRcvdDate");
        sb.append('=');
        sb.append(((this.fpbrchdRcvdDate == null)?"<null>":this.fpbrchdRcvdDate));
        sb.append(',');
        sb.append("carrierName");
        sb.append('=');
        sb.append(((this.carrierName == null)?"<null>":this.carrierName));
        sb.append(',');
        sb.append("fpbrchdCarrCode");
        sb.append('=');
        sb.append(((this.fpbrchdCarrCode == null)?"<null>":this.fpbrchdCarrCode));
        sb.append(',');
        sb.append("fpbrchdUserId");
        sb.append('=');
        sb.append(((this.fpbrchdUserId == null)?"<null>":this.fpbrchdUserId));
        sb.append(',');
        sb.append("receivingMethodDesc");
        sb.append('=');
        sb.append(((this.receivingMethodDesc == null)?"<null>":this.receivingMethodDesc));
        sb.append(',');
        sb.append("fpbrchdRcmtCode");
        sb.append('=');
        sb.append(((this.fpbrchdRcmtCode == null)?"<null>":this.fpbrchdRcmtCode));
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
        result = ((result* 31)+((this.textDescHdr == null)? 0 :this.textDescHdr.hashCode()));
        result = ((result* 31)+((this.fpbrchdRcvdDate == null)? 0 :this.fpbrchdRcvdDate.hashCode()));
        result = ((result* 31)+((this.carrierName == null)? 0 :this.carrierName.hashCode()));
        result = ((result* 31)+((this.fpbrchdCarrCode == null)? 0 :this.fpbrchdCarrCode.hashCode()));
        result = ((result* 31)+((this.fpbrchdUserId == null)? 0 :this.fpbrchdUserId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.receivingMethodDesc == null)? 0 :this.receivingMethodDesc.hashCode()));
        result = ((result* 31)+((this.fpbrchdRcmtCode == null)? 0 :this.fpbrchdRcmtCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FpbrchdBlock) == false) {
            return false;
        }
        FpbrchdBlock rhs = ((FpbrchdBlock) other);
        return (((((((((this.textDescHdr == rhs.textDescHdr)||((this.textDescHdr!= null)&&this.textDescHdr.equals(rhs.textDescHdr)))&&((this.fpbrchdRcvdDate == rhs.fpbrchdRcvdDate)||((this.fpbrchdRcvdDate!= null)&&this.fpbrchdRcvdDate.equals(rhs.fpbrchdRcvdDate))))&&((this.carrierName == rhs.carrierName)||((this.carrierName!= null)&&this.carrierName.equals(rhs.carrierName))))&&((this.fpbrchdCarrCode == rhs.fpbrchdCarrCode)||((this.fpbrchdCarrCode!= null)&&this.fpbrchdCarrCode.equals(rhs.fpbrchdCarrCode))))&&((this.fpbrchdUserId == rhs.fpbrchdUserId)||((this.fpbrchdUserId!= null)&&this.fpbrchdUserId.equals(rhs.fpbrchdUserId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.receivingMethodDesc == rhs.receivingMethodDesc)||((this.receivingMethodDesc!= null)&&this.receivingMethodDesc.equals(rhs.receivingMethodDesc))))&&((this.fpbrchdRcmtCode == rhs.fpbrchdRcmtCode)||((this.fpbrchdRcmtCode!= null)&&this.fpbrchdRcmtCode.equals(rhs.fpbrchdRcmtCode))));
    }

}
