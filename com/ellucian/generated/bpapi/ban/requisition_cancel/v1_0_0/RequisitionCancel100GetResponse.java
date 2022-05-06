
package com.ellucian.generated.bpapi.ban.requisition_cancel.v1_0_0;

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
    "fpbreqhReqdDate",
    "displayNetAmt",
    "displayAddlChrgAmt",
    "fpbreqhTransDate",
    "displayVendName",
    "displayDocAmt",
    "displayTaxAmt",
    "displayVendCode",
    "fpbreqhRqstTypeInd",
    "fpbreqhOriginCode",
    "fpbreqhReqhDate",
    "displayDiscAmt",
    "displayNsfOnOffInd"
})
@Generated("jsonschema2pojo")
public class RequisitionCancel100GetResponse {

    /**
     * Delivery Date
     * <p>
     * Lineage reference object : FPBREQH_REQD_DATE
     * 
     */
    @JsonProperty("fpbreqhReqdDate")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_REQD_DATE")
    private Date fpbreqhReqdDate;
    /**
     * Net Amount
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNetAmt")
    private Double displayNetAmt;
    /**
     * Additional Charges
     * <p>
     * 
     * 
     */
    @JsonProperty("displayAddlChrgAmt")
    private Double displayAddlChrgAmt;
    /**
     * Transaction Date
     * <p>
     * Lineage reference object : FPBREQH_TRANS_DATE
     * 
     */
    @JsonProperty("fpbreqhTransDate")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_TRANS_DATE")
    private Date fpbreqhTransDate;
    @JsonProperty("displayVendName")
    private String displayVendName;
    /**
     * Extended Amount
     * <p>
     * 
     * 
     */
    @JsonProperty("displayDocAmt")
    private Double displayDocAmt;
    /**
     * Tax Amount
     * <p>
     * 
     * 
     */
    @JsonProperty("displayTaxAmt")
    private Double displayTaxAmt;
    /**
     * Vendor
     * <p>
     * Lookup lineage reference object : ftvvend
     * 
     */
    @JsonProperty("displayVendCode")
    @JsonPropertyDescription("Lookup lineage reference object : ftvvend")
    private String displayVendCode;
    /**
     * Request Type
     * <p>
     * Lineage reference object : FPBREQH_RQST_TYPE_IND
     * 
     */
    @JsonProperty("fpbreqhRqstTypeInd")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_RQST_TYPE_IND")
    private String fpbreqhRqstTypeInd;
    /**
     * Origin
     * <p>
     * Lineage reference object : FPBREQH_ORIGIN_CODE
     * 
     */
    @JsonProperty("fpbreqhOriginCode")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_ORIGIN_CODE")
    private String fpbreqhOriginCode;
    /**
     * Request Date
     * <p>
     * Lineage reference object : FPBREQH_REQH_DATE
     * 
     */
    @JsonProperty("fpbreqhReqhDate")
    @JsonPropertyDescription("Lineage reference object : FPBREQH_REQH_DATE")
    private Date fpbreqhReqhDate;
    /**
     * Discount Amount
     * <p>
     * 
     * 
     */
    @JsonProperty("displayDiscAmt")
    private Double displayDiscAmt;
    /**
     * NSF Checking
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNsfOnOffInd")
    private String displayNsfOnOffInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Delivery Date
     * <p>
     * Lineage reference object : FPBREQH_REQD_DATE
     * 
     */
    @JsonProperty("fpbreqhReqdDate")
    public Date getFpbreqhReqdDate() {
        return fpbreqhReqdDate;
    }

    /**
     * Delivery Date
     * <p>
     * Lineage reference object : FPBREQH_REQD_DATE
     * 
     */
    @JsonProperty("fpbreqhReqdDate")
    public void setFpbreqhReqdDate(Date fpbreqhReqdDate) {
        this.fpbreqhReqdDate = fpbreqhReqdDate;
    }

    public RequisitionCancel100GetResponse withFpbreqhReqdDate(Date fpbreqhReqdDate) {
        this.fpbreqhReqdDate = fpbreqhReqdDate;
        return this;
    }

    /**
     * Net Amount
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNetAmt")
    public Double getDisplayNetAmt() {
        return displayNetAmt;
    }

    /**
     * Net Amount
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNetAmt")
    public void setDisplayNetAmt(Double displayNetAmt) {
        this.displayNetAmt = displayNetAmt;
    }

    public RequisitionCancel100GetResponse withDisplayNetAmt(Double displayNetAmt) {
        this.displayNetAmt = displayNetAmt;
        return this;
    }

    /**
     * Additional Charges
     * <p>
     * 
     * 
     */
    @JsonProperty("displayAddlChrgAmt")
    public Double getDisplayAddlChrgAmt() {
        return displayAddlChrgAmt;
    }

    /**
     * Additional Charges
     * <p>
     * 
     * 
     */
    @JsonProperty("displayAddlChrgAmt")
    public void setDisplayAddlChrgAmt(Double displayAddlChrgAmt) {
        this.displayAddlChrgAmt = displayAddlChrgAmt;
    }

    public RequisitionCancel100GetResponse withDisplayAddlChrgAmt(Double displayAddlChrgAmt) {
        this.displayAddlChrgAmt = displayAddlChrgAmt;
        return this;
    }

    /**
     * Transaction Date
     * <p>
     * Lineage reference object : FPBREQH_TRANS_DATE
     * 
     */
    @JsonProperty("fpbreqhTransDate")
    public Date getFpbreqhTransDate() {
        return fpbreqhTransDate;
    }

    /**
     * Transaction Date
     * <p>
     * Lineage reference object : FPBREQH_TRANS_DATE
     * 
     */
    @JsonProperty("fpbreqhTransDate")
    public void setFpbreqhTransDate(Date fpbreqhTransDate) {
        this.fpbreqhTransDate = fpbreqhTransDate;
    }

    public RequisitionCancel100GetResponse withFpbreqhTransDate(Date fpbreqhTransDate) {
        this.fpbreqhTransDate = fpbreqhTransDate;
        return this;
    }

    @JsonProperty("displayVendName")
    public String getDisplayVendName() {
        return displayVendName;
    }

    @JsonProperty("displayVendName")
    public void setDisplayVendName(String displayVendName) {
        this.displayVendName = displayVendName;
    }

    public RequisitionCancel100GetResponse withDisplayVendName(String displayVendName) {
        this.displayVendName = displayVendName;
        return this;
    }

    /**
     * Extended Amount
     * <p>
     * 
     * 
     */
    @JsonProperty("displayDocAmt")
    public Double getDisplayDocAmt() {
        return displayDocAmt;
    }

    /**
     * Extended Amount
     * <p>
     * 
     * 
     */
    @JsonProperty("displayDocAmt")
    public void setDisplayDocAmt(Double displayDocAmt) {
        this.displayDocAmt = displayDocAmt;
    }

    public RequisitionCancel100GetResponse withDisplayDocAmt(Double displayDocAmt) {
        this.displayDocAmt = displayDocAmt;
        return this;
    }

    /**
     * Tax Amount
     * <p>
     * 
     * 
     */
    @JsonProperty("displayTaxAmt")
    public Double getDisplayTaxAmt() {
        return displayTaxAmt;
    }

    /**
     * Tax Amount
     * <p>
     * 
     * 
     */
    @JsonProperty("displayTaxAmt")
    public void setDisplayTaxAmt(Double displayTaxAmt) {
        this.displayTaxAmt = displayTaxAmt;
    }

    public RequisitionCancel100GetResponse withDisplayTaxAmt(Double displayTaxAmt) {
        this.displayTaxAmt = displayTaxAmt;
        return this;
    }

    /**
     * Vendor
     * <p>
     * Lookup lineage reference object : ftvvend
     * 
     */
    @JsonProperty("displayVendCode")
    public String getDisplayVendCode() {
        return displayVendCode;
    }

    /**
     * Vendor
     * <p>
     * Lookup lineage reference object : ftvvend
     * 
     */
    @JsonProperty("displayVendCode")
    public void setDisplayVendCode(String displayVendCode) {
        this.displayVendCode = displayVendCode;
    }

    public RequisitionCancel100GetResponse withDisplayVendCode(String displayVendCode) {
        this.displayVendCode = displayVendCode;
        return this;
    }

    /**
     * Request Type
     * <p>
     * Lineage reference object : FPBREQH_RQST_TYPE_IND
     * 
     */
    @JsonProperty("fpbreqhRqstTypeInd")
    public String getFpbreqhRqstTypeInd() {
        return fpbreqhRqstTypeInd;
    }

    /**
     * Request Type
     * <p>
     * Lineage reference object : FPBREQH_RQST_TYPE_IND
     * 
     */
    @JsonProperty("fpbreqhRqstTypeInd")
    public void setFpbreqhRqstTypeInd(String fpbreqhRqstTypeInd) {
        this.fpbreqhRqstTypeInd = fpbreqhRqstTypeInd;
    }

    public RequisitionCancel100GetResponse withFpbreqhRqstTypeInd(String fpbreqhRqstTypeInd) {
        this.fpbreqhRqstTypeInd = fpbreqhRqstTypeInd;
        return this;
    }

    /**
     * Origin
     * <p>
     * Lineage reference object : FPBREQH_ORIGIN_CODE
     * 
     */
    @JsonProperty("fpbreqhOriginCode")
    public String getFpbreqhOriginCode() {
        return fpbreqhOriginCode;
    }

    /**
     * Origin
     * <p>
     * Lineage reference object : FPBREQH_ORIGIN_CODE
     * 
     */
    @JsonProperty("fpbreqhOriginCode")
    public void setFpbreqhOriginCode(String fpbreqhOriginCode) {
        this.fpbreqhOriginCode = fpbreqhOriginCode;
    }

    public RequisitionCancel100GetResponse withFpbreqhOriginCode(String fpbreqhOriginCode) {
        this.fpbreqhOriginCode = fpbreqhOriginCode;
        return this;
    }

    /**
     * Request Date
     * <p>
     * Lineage reference object : FPBREQH_REQH_DATE
     * 
     */
    @JsonProperty("fpbreqhReqhDate")
    public Date getFpbreqhReqhDate() {
        return fpbreqhReqhDate;
    }

    /**
     * Request Date
     * <p>
     * Lineage reference object : FPBREQH_REQH_DATE
     * 
     */
    @JsonProperty("fpbreqhReqhDate")
    public void setFpbreqhReqhDate(Date fpbreqhReqhDate) {
        this.fpbreqhReqhDate = fpbreqhReqhDate;
    }

    public RequisitionCancel100GetResponse withFpbreqhReqhDate(Date fpbreqhReqhDate) {
        this.fpbreqhReqhDate = fpbreqhReqhDate;
        return this;
    }

    /**
     * Discount Amount
     * <p>
     * 
     * 
     */
    @JsonProperty("displayDiscAmt")
    public Double getDisplayDiscAmt() {
        return displayDiscAmt;
    }

    /**
     * Discount Amount
     * <p>
     * 
     * 
     */
    @JsonProperty("displayDiscAmt")
    public void setDisplayDiscAmt(Double displayDiscAmt) {
        this.displayDiscAmt = displayDiscAmt;
    }

    public RequisitionCancel100GetResponse withDisplayDiscAmt(Double displayDiscAmt) {
        this.displayDiscAmt = displayDiscAmt;
        return this;
    }

    /**
     * NSF Checking
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNsfOnOffInd")
    public String getDisplayNsfOnOffInd() {
        return displayNsfOnOffInd;
    }

    /**
     * NSF Checking
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNsfOnOffInd")
    public void setDisplayNsfOnOffInd(String displayNsfOnOffInd) {
        this.displayNsfOnOffInd = displayNsfOnOffInd;
    }

    public RequisitionCancel100GetResponse withDisplayNsfOnOffInd(String displayNsfOnOffInd) {
        this.displayNsfOnOffInd = displayNsfOnOffInd;
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

    public RequisitionCancel100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RequisitionCancel100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fpbreqhReqdDate");
        sb.append('=');
        sb.append(((this.fpbreqhReqdDate == null)?"<null>":this.fpbreqhReqdDate));
        sb.append(',');
        sb.append("displayNetAmt");
        sb.append('=');
        sb.append(((this.displayNetAmt == null)?"<null>":this.displayNetAmt));
        sb.append(',');
        sb.append("displayAddlChrgAmt");
        sb.append('=');
        sb.append(((this.displayAddlChrgAmt == null)?"<null>":this.displayAddlChrgAmt));
        sb.append(',');
        sb.append("fpbreqhTransDate");
        sb.append('=');
        sb.append(((this.fpbreqhTransDate == null)?"<null>":this.fpbreqhTransDate));
        sb.append(',');
        sb.append("displayVendName");
        sb.append('=');
        sb.append(((this.displayVendName == null)?"<null>":this.displayVendName));
        sb.append(',');
        sb.append("displayDocAmt");
        sb.append('=');
        sb.append(((this.displayDocAmt == null)?"<null>":this.displayDocAmt));
        sb.append(',');
        sb.append("displayTaxAmt");
        sb.append('=');
        sb.append(((this.displayTaxAmt == null)?"<null>":this.displayTaxAmt));
        sb.append(',');
        sb.append("displayVendCode");
        sb.append('=');
        sb.append(((this.displayVendCode == null)?"<null>":this.displayVendCode));
        sb.append(',');
        sb.append("fpbreqhRqstTypeInd");
        sb.append('=');
        sb.append(((this.fpbreqhRqstTypeInd == null)?"<null>":this.fpbreqhRqstTypeInd));
        sb.append(',');
        sb.append("fpbreqhOriginCode");
        sb.append('=');
        sb.append(((this.fpbreqhOriginCode == null)?"<null>":this.fpbreqhOriginCode));
        sb.append(',');
        sb.append("fpbreqhReqhDate");
        sb.append('=');
        sb.append(((this.fpbreqhReqhDate == null)?"<null>":this.fpbreqhReqhDate));
        sb.append(',');
        sb.append("displayDiscAmt");
        sb.append('=');
        sb.append(((this.displayDiscAmt == null)?"<null>":this.displayDiscAmt));
        sb.append(',');
        sb.append("displayNsfOnOffInd");
        sb.append('=');
        sb.append(((this.displayNsfOnOffInd == null)?"<null>":this.displayNsfOnOffInd));
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
        result = ((result* 31)+((this.fpbreqhReqdDate == null)? 0 :this.fpbreqhReqdDate.hashCode()));
        result = ((result* 31)+((this.displayNetAmt == null)? 0 :this.displayNetAmt.hashCode()));
        result = ((result* 31)+((this.displayAddlChrgAmt == null)? 0 :this.displayAddlChrgAmt.hashCode()));
        result = ((result* 31)+((this.fpbreqhTransDate == null)? 0 :this.fpbreqhTransDate.hashCode()));
        result = ((result* 31)+((this.displayVendName == null)? 0 :this.displayVendName.hashCode()));
        result = ((result* 31)+((this.displayDocAmt == null)? 0 :this.displayDocAmt.hashCode()));
        result = ((result* 31)+((this.displayTaxAmt == null)? 0 :this.displayTaxAmt.hashCode()));
        result = ((result* 31)+((this.displayVendCode == null)? 0 :this.displayVendCode.hashCode()));
        result = ((result* 31)+((this.fpbreqhRqstTypeInd == null)? 0 :this.fpbreqhRqstTypeInd.hashCode()));
        result = ((result* 31)+((this.fpbreqhOriginCode == null)? 0 :this.fpbreqhOriginCode.hashCode()));
        result = ((result* 31)+((this.fpbreqhReqhDate == null)? 0 :this.fpbreqhReqhDate.hashCode()));
        result = ((result* 31)+((this.displayDiscAmt == null)? 0 :this.displayDiscAmt.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.displayNsfOnOffInd == null)? 0 :this.displayNsfOnOffInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RequisitionCancel100GetResponse) == false) {
            return false;
        }
        RequisitionCancel100GetResponse rhs = ((RequisitionCancel100GetResponse) other);
        return (((((((((((((((this.fpbreqhReqdDate == rhs.fpbreqhReqdDate)||((this.fpbreqhReqdDate!= null)&&this.fpbreqhReqdDate.equals(rhs.fpbreqhReqdDate)))&&((this.displayNetAmt == rhs.displayNetAmt)||((this.displayNetAmt!= null)&&this.displayNetAmt.equals(rhs.displayNetAmt))))&&((this.displayAddlChrgAmt == rhs.displayAddlChrgAmt)||((this.displayAddlChrgAmt!= null)&&this.displayAddlChrgAmt.equals(rhs.displayAddlChrgAmt))))&&((this.fpbreqhTransDate == rhs.fpbreqhTransDate)||((this.fpbreqhTransDate!= null)&&this.fpbreqhTransDate.equals(rhs.fpbreqhTransDate))))&&((this.displayVendName == rhs.displayVendName)||((this.displayVendName!= null)&&this.displayVendName.equals(rhs.displayVendName))))&&((this.displayDocAmt == rhs.displayDocAmt)||((this.displayDocAmt!= null)&&this.displayDocAmt.equals(rhs.displayDocAmt))))&&((this.displayTaxAmt == rhs.displayTaxAmt)||((this.displayTaxAmt!= null)&&this.displayTaxAmt.equals(rhs.displayTaxAmt))))&&((this.displayVendCode == rhs.displayVendCode)||((this.displayVendCode!= null)&&this.displayVendCode.equals(rhs.displayVendCode))))&&((this.fpbreqhRqstTypeInd == rhs.fpbreqhRqstTypeInd)||((this.fpbreqhRqstTypeInd!= null)&&this.fpbreqhRqstTypeInd.equals(rhs.fpbreqhRqstTypeInd))))&&((this.fpbreqhOriginCode == rhs.fpbreqhOriginCode)||((this.fpbreqhOriginCode!= null)&&this.fpbreqhOriginCode.equals(rhs.fpbreqhOriginCode))))&&((this.fpbreqhReqhDate == rhs.fpbreqhReqhDate)||((this.fpbreqhReqhDate!= null)&&this.fpbreqhReqhDate.equals(rhs.fpbreqhReqhDate))))&&((this.displayDiscAmt == rhs.displayDiscAmt)||((this.displayDiscAmt!= null)&&this.displayDiscAmt.equals(rhs.displayDiscAmt))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.displayNsfOnOffInd == rhs.displayNsfOnOffInd)||((this.displayNsfOnOffInd!= null)&&this.displayNsfOnOffInd.equals(rhs.displayNsfOnOffInd))));
    }

}
