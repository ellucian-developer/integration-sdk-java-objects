
package com.ellucian.generated.bpapi.ban.financial_aid_record_maintenance.v1_0_0;

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
    "awstCode",
    "acceptAmt",
    "fundCode",
    "displayMemautAmt",
    "infoAccessInd",
    "sysInd",
    "paidAmt",
    "lockInd",
    "displayDeccanAmt",
    "offerAmt",
    "fundDescription"
})
@Generated("jsonschema2pojo")
public class Rprawrd {

    /**
     * Status
     * <p>
     * Lineage reference object : RPRAWRD_AWST_CODE
     * 
     */
    @JsonProperty("awstCode")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_AWST_CODE")
    private String awstCode;
    /**
     * Accepted
     * <p>
     * Lineage reference object : RPRAWRD_ACCEPT_AMT
     * 
     */
    @JsonProperty("acceptAmt")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_ACCEPT_AMT")
    private Double acceptAmt;
    /**
     * Fund
     * <p>
     * Lineage reference object : RPRAWRD_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_FUND_CODE")
    private String fundCode;
    /**
     * Memoed or Authorized
     * <p>
     * 
     * 
     */
    @JsonProperty("displayMemautAmt")
    private Double displayMemautAmt;
    /**
     * Lineage reference object : RPRAWRD_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_INFO_ACCESS_IND")
    private String infoAccessInd;
    /**
     * System
     * <p>
     * Lineage reference object : RPRAWRD_SYS_IND
     * 
     */
    @JsonProperty("sysInd")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_SYS_IND")
    private String sysInd;
    /**
     * Paid
     * <p>
     * Lineage reference object : RPRAWRD_PAID_AMT
     * 
     */
    @JsonProperty("paidAmt")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_PAID_AMT")
    private Double paidAmt;
    /**
     * Lock
     * <p>
     * Lineage reference object : RPRAWRD_LOCK_IND
     * 
     */
    @JsonProperty("lockInd")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_LOCK_IND")
    private String lockInd;
    /**
     * Declined or Cancelled
     * <p>
     * 
     * 
     */
    @JsonProperty("displayDeccanAmt")
    private Double displayDeccanAmt;
    /**
     * Offered
     * <p>
     * Lineage reference object : RPRAWRD_OFFER_AMT
     * 
     */
    @JsonProperty("offerAmt")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_OFFER_AMT")
    private Double offerAmt;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("fundDescription")
    private String fundDescription;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Status
     * <p>
     * Lineage reference object : RPRAWRD_AWST_CODE
     * 
     */
    @JsonProperty("awstCode")
    public String getAwstCode() {
        return awstCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : RPRAWRD_AWST_CODE
     * 
     */
    @JsonProperty("awstCode")
    public void setAwstCode(String awstCode) {
        this.awstCode = awstCode;
    }

    public Rprawrd withAwstCode(String awstCode) {
        this.awstCode = awstCode;
        return this;
    }

    /**
     * Accepted
     * <p>
     * Lineage reference object : RPRAWRD_ACCEPT_AMT
     * 
     */
    @JsonProperty("acceptAmt")
    public Double getAcceptAmt() {
        return acceptAmt;
    }

    /**
     * Accepted
     * <p>
     * Lineage reference object : RPRAWRD_ACCEPT_AMT
     * 
     */
    @JsonProperty("acceptAmt")
    public void setAcceptAmt(Double acceptAmt) {
        this.acceptAmt = acceptAmt;
    }

    public Rprawrd withAcceptAmt(Double acceptAmt) {
        this.acceptAmt = acceptAmt;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : RPRAWRD_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    public String getFundCode() {
        return fundCode;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : RPRAWRD_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public Rprawrd withFundCode(String fundCode) {
        this.fundCode = fundCode;
        return this;
    }

    /**
     * Memoed or Authorized
     * <p>
     * 
     * 
     */
    @JsonProperty("displayMemautAmt")
    public Double getDisplayMemautAmt() {
        return displayMemautAmt;
    }

    /**
     * Memoed or Authorized
     * <p>
     * 
     * 
     */
    @JsonProperty("displayMemautAmt")
    public void setDisplayMemautAmt(Double displayMemautAmt) {
        this.displayMemautAmt = displayMemautAmt;
    }

    public Rprawrd withDisplayMemautAmt(Double displayMemautAmt) {
        this.displayMemautAmt = displayMemautAmt;
        return this;
    }

    /**
     * Lineage reference object : RPRAWRD_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    public String getInfoAccessInd() {
        return infoAccessInd;
    }

    /**
     * Lineage reference object : RPRAWRD_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    public void setInfoAccessInd(String infoAccessInd) {
        this.infoAccessInd = infoAccessInd;
    }

    public Rprawrd withInfoAccessInd(String infoAccessInd) {
        this.infoAccessInd = infoAccessInd;
        return this;
    }

    /**
     * System
     * <p>
     * Lineage reference object : RPRAWRD_SYS_IND
     * 
     */
    @JsonProperty("sysInd")
    public String getSysInd() {
        return sysInd;
    }

    /**
     * System
     * <p>
     * Lineage reference object : RPRAWRD_SYS_IND
     * 
     */
    @JsonProperty("sysInd")
    public void setSysInd(String sysInd) {
        this.sysInd = sysInd;
    }

    public Rprawrd withSysInd(String sysInd) {
        this.sysInd = sysInd;
        return this;
    }

    /**
     * Paid
     * <p>
     * Lineage reference object : RPRAWRD_PAID_AMT
     * 
     */
    @JsonProperty("paidAmt")
    public Double getPaidAmt() {
        return paidAmt;
    }

    /**
     * Paid
     * <p>
     * Lineage reference object : RPRAWRD_PAID_AMT
     * 
     */
    @JsonProperty("paidAmt")
    public void setPaidAmt(Double paidAmt) {
        this.paidAmt = paidAmt;
    }

    public Rprawrd withPaidAmt(Double paidAmt) {
        this.paidAmt = paidAmt;
        return this;
    }

    /**
     * Lock
     * <p>
     * Lineage reference object : RPRAWRD_LOCK_IND
     * 
     */
    @JsonProperty("lockInd")
    public String getLockInd() {
        return lockInd;
    }

    /**
     * Lock
     * <p>
     * Lineage reference object : RPRAWRD_LOCK_IND
     * 
     */
    @JsonProperty("lockInd")
    public void setLockInd(String lockInd) {
        this.lockInd = lockInd;
    }

    public Rprawrd withLockInd(String lockInd) {
        this.lockInd = lockInd;
        return this;
    }

    /**
     * Declined or Cancelled
     * <p>
     * 
     * 
     */
    @JsonProperty("displayDeccanAmt")
    public Double getDisplayDeccanAmt() {
        return displayDeccanAmt;
    }

    /**
     * Declined or Cancelled
     * <p>
     * 
     * 
     */
    @JsonProperty("displayDeccanAmt")
    public void setDisplayDeccanAmt(Double displayDeccanAmt) {
        this.displayDeccanAmt = displayDeccanAmt;
    }

    public Rprawrd withDisplayDeccanAmt(Double displayDeccanAmt) {
        this.displayDeccanAmt = displayDeccanAmt;
        return this;
    }

    /**
     * Offered
     * <p>
     * Lineage reference object : RPRAWRD_OFFER_AMT
     * 
     */
    @JsonProperty("offerAmt")
    public Double getOfferAmt() {
        return offerAmt;
    }

    /**
     * Offered
     * <p>
     * Lineage reference object : RPRAWRD_OFFER_AMT
     * 
     */
    @JsonProperty("offerAmt")
    public void setOfferAmt(Double offerAmt) {
        this.offerAmt = offerAmt;
    }

    public Rprawrd withOfferAmt(Double offerAmt) {
        this.offerAmt = offerAmt;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("fundDescription")
    public String getFundDescription() {
        return fundDescription;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("fundDescription")
    public void setFundDescription(String fundDescription) {
        this.fundDescription = fundDescription;
    }

    public Rprawrd withFundDescription(String fundDescription) {
        this.fundDescription = fundDescription;
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

    public Rprawrd withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Rprawrd.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("awstCode");
        sb.append('=');
        sb.append(((this.awstCode == null)?"<null>":this.awstCode));
        sb.append(',');
        sb.append("acceptAmt");
        sb.append('=');
        sb.append(((this.acceptAmt == null)?"<null>":this.acceptAmt));
        sb.append(',');
        sb.append("fundCode");
        sb.append('=');
        sb.append(((this.fundCode == null)?"<null>":this.fundCode));
        sb.append(',');
        sb.append("displayMemautAmt");
        sb.append('=');
        sb.append(((this.displayMemautAmt == null)?"<null>":this.displayMemautAmt));
        sb.append(',');
        sb.append("infoAccessInd");
        sb.append('=');
        sb.append(((this.infoAccessInd == null)?"<null>":this.infoAccessInd));
        sb.append(',');
        sb.append("sysInd");
        sb.append('=');
        sb.append(((this.sysInd == null)?"<null>":this.sysInd));
        sb.append(',');
        sb.append("paidAmt");
        sb.append('=');
        sb.append(((this.paidAmt == null)?"<null>":this.paidAmt));
        sb.append(',');
        sb.append("lockInd");
        sb.append('=');
        sb.append(((this.lockInd == null)?"<null>":this.lockInd));
        sb.append(',');
        sb.append("displayDeccanAmt");
        sb.append('=');
        sb.append(((this.displayDeccanAmt == null)?"<null>":this.displayDeccanAmt));
        sb.append(',');
        sb.append("offerAmt");
        sb.append('=');
        sb.append(((this.offerAmt == null)?"<null>":this.offerAmt));
        sb.append(',');
        sb.append("fundDescription");
        sb.append('=');
        sb.append(((this.fundDescription == null)?"<null>":this.fundDescription));
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
        result = ((result* 31)+((this.acceptAmt == null)? 0 :this.acceptAmt.hashCode()));
        result = ((result* 31)+((this.displayMemautAmt == null)? 0 :this.displayMemautAmt.hashCode()));
        result = ((result* 31)+((this.infoAccessInd == null)? 0 :this.infoAccessInd.hashCode()));
        result = ((result* 31)+((this.sysInd == null)? 0 :this.sysInd.hashCode()));
        result = ((result* 31)+((this.paidAmt == null)? 0 :this.paidAmt.hashCode()));
        result = ((result* 31)+((this.fundDescription == null)? 0 :this.fundDescription.hashCode()));
        result = ((result* 31)+((this.awstCode == null)? 0 :this.awstCode.hashCode()));
        result = ((result* 31)+((this.fundCode == null)? 0 :this.fundCode.hashCode()));
        result = ((result* 31)+((this.lockInd == null)? 0 :this.lockInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.displayDeccanAmt == null)? 0 :this.displayDeccanAmt.hashCode()));
        result = ((result* 31)+((this.offerAmt == null)? 0 :this.offerAmt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Rprawrd) == false) {
            return false;
        }
        Rprawrd rhs = ((Rprawrd) other);
        return (((((((((((((this.acceptAmt == rhs.acceptAmt)||((this.acceptAmt!= null)&&this.acceptAmt.equals(rhs.acceptAmt)))&&((this.displayMemautAmt == rhs.displayMemautAmt)||((this.displayMemautAmt!= null)&&this.displayMemautAmt.equals(rhs.displayMemautAmt))))&&((this.infoAccessInd == rhs.infoAccessInd)||((this.infoAccessInd!= null)&&this.infoAccessInd.equals(rhs.infoAccessInd))))&&((this.sysInd == rhs.sysInd)||((this.sysInd!= null)&&this.sysInd.equals(rhs.sysInd))))&&((this.paidAmt == rhs.paidAmt)||((this.paidAmt!= null)&&this.paidAmt.equals(rhs.paidAmt))))&&((this.fundDescription == rhs.fundDescription)||((this.fundDescription!= null)&&this.fundDescription.equals(rhs.fundDescription))))&&((this.awstCode == rhs.awstCode)||((this.awstCode!= null)&&this.awstCode.equals(rhs.awstCode))))&&((this.fundCode == rhs.fundCode)||((this.fundCode!= null)&&this.fundCode.equals(rhs.fundCode))))&&((this.lockInd == rhs.lockInd)||((this.lockInd!= null)&&this.lockInd.equals(rhs.lockInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.displayDeccanAmt == rhs.displayDeccanAmt)||((this.displayDeccanAmt!= null)&&this.displayDeccanAmt.equals(rhs.displayDeccanAmt))))&&((this.offerAmt == rhs.offerAmt)||((this.offerAmt!= null)&&this.offerAmt.equals(rhs.offerAmt))));
    }

}
