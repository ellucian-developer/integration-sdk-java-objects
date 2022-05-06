
package com.ellucian.generated.bpapi.ban.student_course_fee_assessment_query.v1_0_0;

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
    "stspKeySequence",
    "billHr",
    "creditHr",
    "sfrrfcrTuitRefund",
    "ssbsectSeqNumb",
    "ssbsectSubjCode",
    "message",
    "sfrrfcrFeesRefund",
    "ssbsectCrseNumb",
    "totalCeuHrs",
    "totalCredHrs",
    "rstsCode",
    "campCode",
    "totalBillHrs",
    "rstsDate",
    "crn",
    "levlCode"
})
@Generated("jsonschema2pojo")
public class Sfrstcr {

    /**
     * Study Path
     * <p>
     * Lineage reference object : SFRSTCR_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("stspKeySequence")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_STSP_KEY_SEQUENCE")
    private Double stspKeySequence;
    /**
     * Bill Hours
     * <p>
     * Lineage reference object : SFRSTCR_BILL_HR
     * 
     */
    @JsonProperty("billHr")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_BILL_HR")
    private Double billHr;
    /**
     * Credit Hours
     * <p>
     * Lineage reference object : SFRSTCR_CREDIT_HR
     * 
     */
    @JsonProperty("creditHr")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_CREDIT_HR")
    private Double creditHr;
    /**
     * Percent Tuition Refund
     * <p>
     * 
     * 
     */
    @JsonProperty("sfrrfcrTuitRefund")
    private Double sfrrfcrTuitRefund;
    /**
     * Section
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectSeqNumb")
    private String ssbsectSeqNumb;
    /**
     * Subject
     * <p>
     * Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("ssbsectSubjCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvsubj")
    private String ssbsectSubjCode;
    /**
     * Message
     * <p>
     * 
     * 
     */
    @JsonProperty("message")
    private String message;
    /**
     * Percent Fee Refund
     * <p>
     * 
     * 
     */
    @JsonProperty("sfrrfcrFeesRefund")
    private Double sfrrfcrFeesRefund;
    /**
     * Course
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectCrseNumb")
    private String ssbsectCrseNumb;
    /**
     * CEU Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("totalCeuHrs")
    private Double totalCeuHrs;
    /**
     * Total Credit Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("totalCredHrs")
    private Double totalCredHrs;
    /**
     * Status
     * <p>
     * Lineage reference object : SFRSTCR_RSTS_CODE, Lookup lineage reference object : stvrsts
     * 
     */
    @JsonProperty("rstsCode")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_RSTS_CODE, Lookup lineage reference object : stvrsts")
    private String rstsCode;
    /**
     * Campus
     * <p>
     * Lineage reference object : SFRSTCR_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_CAMP_CODE, Lookup lineage reference object : stvcamp")
    private String campCode;
    /**
     * Total Bill Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("totalBillHrs")
    private Double totalBillHrs;
    /**
     * Status Date
     * <p>
     * Lineage reference object : SFRSTCR_RSTS_DATE
     * 
     */
    @JsonProperty("rstsDate")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_RSTS_DATE")
    private Date rstsDate;
    /**
     * CRN
     * <p>
     * Lineage reference object : SFRSTCR_CRN
     * 
     */
    @JsonProperty("crn")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_CRN")
    private String crn;
    /**
     * Level
     * <p>
     * Lineage reference object : SFRSTCR_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCode")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_LEVL_CODE, Lookup lineage reference object : stvlevl")
    private String levlCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Study Path
     * <p>
     * Lineage reference object : SFRSTCR_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("stspKeySequence")
    public Double getStspKeySequence() {
        return stspKeySequence;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : SFRSTCR_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("stspKeySequence")
    public void setStspKeySequence(Double stspKeySequence) {
        this.stspKeySequence = stspKeySequence;
    }

    public Sfrstcr withStspKeySequence(Double stspKeySequence) {
        this.stspKeySequence = stspKeySequence;
        return this;
    }

    /**
     * Bill Hours
     * <p>
     * Lineage reference object : SFRSTCR_BILL_HR
     * 
     */
    @JsonProperty("billHr")
    public Double getBillHr() {
        return billHr;
    }

    /**
     * Bill Hours
     * <p>
     * Lineage reference object : SFRSTCR_BILL_HR
     * 
     */
    @JsonProperty("billHr")
    public void setBillHr(Double billHr) {
        this.billHr = billHr;
    }

    public Sfrstcr withBillHr(Double billHr) {
        this.billHr = billHr;
        return this;
    }

    /**
     * Credit Hours
     * <p>
     * Lineage reference object : SFRSTCR_CREDIT_HR
     * 
     */
    @JsonProperty("creditHr")
    public Double getCreditHr() {
        return creditHr;
    }

    /**
     * Credit Hours
     * <p>
     * Lineage reference object : SFRSTCR_CREDIT_HR
     * 
     */
    @JsonProperty("creditHr")
    public void setCreditHr(Double creditHr) {
        this.creditHr = creditHr;
    }

    public Sfrstcr withCreditHr(Double creditHr) {
        this.creditHr = creditHr;
        return this;
    }

    /**
     * Percent Tuition Refund
     * <p>
     * 
     * 
     */
    @JsonProperty("sfrrfcrTuitRefund")
    public Double getSfrrfcrTuitRefund() {
        return sfrrfcrTuitRefund;
    }

    /**
     * Percent Tuition Refund
     * <p>
     * 
     * 
     */
    @JsonProperty("sfrrfcrTuitRefund")
    public void setSfrrfcrTuitRefund(Double sfrrfcrTuitRefund) {
        this.sfrrfcrTuitRefund = sfrrfcrTuitRefund;
    }

    public Sfrstcr withSfrrfcrTuitRefund(Double sfrrfcrTuitRefund) {
        this.sfrrfcrTuitRefund = sfrrfcrTuitRefund;
        return this;
    }

    /**
     * Section
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectSeqNumb")
    public String getSsbsectSeqNumb() {
        return ssbsectSeqNumb;
    }

    /**
     * Section
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectSeqNumb")
    public void setSsbsectSeqNumb(String ssbsectSeqNumb) {
        this.ssbsectSeqNumb = ssbsectSeqNumb;
    }

    public Sfrstcr withSsbsectSeqNumb(String ssbsectSeqNumb) {
        this.ssbsectSeqNumb = ssbsectSeqNumb;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("ssbsectSubjCode")
    public String getSsbsectSubjCode() {
        return ssbsectSubjCode;
    }

    /**
     * Subject
     * <p>
     * Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("ssbsectSubjCode")
    public void setSsbsectSubjCode(String ssbsectSubjCode) {
        this.ssbsectSubjCode = ssbsectSubjCode;
    }

    public Sfrstcr withSsbsectSubjCode(String ssbsectSubjCode) {
        this.ssbsectSubjCode = ssbsectSubjCode;
        return this;
    }

    /**
     * Message
     * <p>
     * 
     * 
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * Message
     * <p>
     * 
     * 
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    public Sfrstcr withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Percent Fee Refund
     * <p>
     * 
     * 
     */
    @JsonProperty("sfrrfcrFeesRefund")
    public Double getSfrrfcrFeesRefund() {
        return sfrrfcrFeesRefund;
    }

    /**
     * Percent Fee Refund
     * <p>
     * 
     * 
     */
    @JsonProperty("sfrrfcrFeesRefund")
    public void setSfrrfcrFeesRefund(Double sfrrfcrFeesRefund) {
        this.sfrrfcrFeesRefund = sfrrfcrFeesRefund;
    }

    public Sfrstcr withSfrrfcrFeesRefund(Double sfrrfcrFeesRefund) {
        this.sfrrfcrFeesRefund = sfrrfcrFeesRefund;
        return this;
    }

    /**
     * Course
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectCrseNumb")
    public String getSsbsectCrseNumb() {
        return ssbsectCrseNumb;
    }

    /**
     * Course
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectCrseNumb")
    public void setSsbsectCrseNumb(String ssbsectCrseNumb) {
        this.ssbsectCrseNumb = ssbsectCrseNumb;
    }

    public Sfrstcr withSsbsectCrseNumb(String ssbsectCrseNumb) {
        this.ssbsectCrseNumb = ssbsectCrseNumb;
        return this;
    }

    /**
     * CEU Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("totalCeuHrs")
    public Double getTotalCeuHrs() {
        return totalCeuHrs;
    }

    /**
     * CEU Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("totalCeuHrs")
    public void setTotalCeuHrs(Double totalCeuHrs) {
        this.totalCeuHrs = totalCeuHrs;
    }

    public Sfrstcr withTotalCeuHrs(Double totalCeuHrs) {
        this.totalCeuHrs = totalCeuHrs;
        return this;
    }

    /**
     * Total Credit Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("totalCredHrs")
    public Double getTotalCredHrs() {
        return totalCredHrs;
    }

    /**
     * Total Credit Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("totalCredHrs")
    public void setTotalCredHrs(Double totalCredHrs) {
        this.totalCredHrs = totalCredHrs;
    }

    public Sfrstcr withTotalCredHrs(Double totalCredHrs) {
        this.totalCredHrs = totalCredHrs;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SFRSTCR_RSTS_CODE, Lookup lineage reference object : stvrsts
     * 
     */
    @JsonProperty("rstsCode")
    public String getRstsCode() {
        return rstsCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SFRSTCR_RSTS_CODE, Lookup lineage reference object : stvrsts
     * 
     */
    @JsonProperty("rstsCode")
    public void setRstsCode(String rstsCode) {
        this.rstsCode = rstsCode;
    }

    public Sfrstcr withRstsCode(String rstsCode) {
        this.rstsCode = rstsCode;
        return this;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SFRSTCR_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    public String getCampCode() {
        return campCode;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SFRSTCR_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    public void setCampCode(String campCode) {
        this.campCode = campCode;
    }

    public Sfrstcr withCampCode(String campCode) {
        this.campCode = campCode;
        return this;
    }

    /**
     * Total Bill Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("totalBillHrs")
    public Double getTotalBillHrs() {
        return totalBillHrs;
    }

    /**
     * Total Bill Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("totalBillHrs")
    public void setTotalBillHrs(Double totalBillHrs) {
        this.totalBillHrs = totalBillHrs;
    }

    public Sfrstcr withTotalBillHrs(Double totalBillHrs) {
        this.totalBillHrs = totalBillHrs;
        return this;
    }

    /**
     * Status Date
     * <p>
     * Lineage reference object : SFRSTCR_RSTS_DATE
     * 
     */
    @JsonProperty("rstsDate")
    public Date getRstsDate() {
        return rstsDate;
    }

    /**
     * Status Date
     * <p>
     * Lineage reference object : SFRSTCR_RSTS_DATE
     * 
     */
    @JsonProperty("rstsDate")
    public void setRstsDate(Date rstsDate) {
        this.rstsDate = rstsDate;
    }

    public Sfrstcr withRstsDate(Date rstsDate) {
        this.rstsDate = rstsDate;
        return this;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : SFRSTCR_CRN
     * 
     */
    @JsonProperty("crn")
    public String getCrn() {
        return crn;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : SFRSTCR_CRN
     * 
     */
    @JsonProperty("crn")
    public void setCrn(String crn) {
        this.crn = crn;
    }

    public Sfrstcr withCrn(String crn) {
        this.crn = crn;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SFRSTCR_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCode")
    public String getLevlCode() {
        return levlCode;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SFRSTCR_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCode")
    public void setLevlCode(String levlCode) {
        this.levlCode = levlCode;
    }

    public Sfrstcr withLevlCode(String levlCode) {
        this.levlCode = levlCode;
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

    public Sfrstcr withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sfrstcr.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("stspKeySequence");
        sb.append('=');
        sb.append(((this.stspKeySequence == null)?"<null>":this.stspKeySequence));
        sb.append(',');
        sb.append("billHr");
        sb.append('=');
        sb.append(((this.billHr == null)?"<null>":this.billHr));
        sb.append(',');
        sb.append("creditHr");
        sb.append('=');
        sb.append(((this.creditHr == null)?"<null>":this.creditHr));
        sb.append(',');
        sb.append("sfrrfcrTuitRefund");
        sb.append('=');
        sb.append(((this.sfrrfcrTuitRefund == null)?"<null>":this.sfrrfcrTuitRefund));
        sb.append(',');
        sb.append("ssbsectSeqNumb");
        sb.append('=');
        sb.append(((this.ssbsectSeqNumb == null)?"<null>":this.ssbsectSeqNumb));
        sb.append(',');
        sb.append("ssbsectSubjCode");
        sb.append('=');
        sb.append(((this.ssbsectSubjCode == null)?"<null>":this.ssbsectSubjCode));
        sb.append(',');
        sb.append("message");
        sb.append('=');
        sb.append(((this.message == null)?"<null>":this.message));
        sb.append(',');
        sb.append("sfrrfcrFeesRefund");
        sb.append('=');
        sb.append(((this.sfrrfcrFeesRefund == null)?"<null>":this.sfrrfcrFeesRefund));
        sb.append(',');
        sb.append("ssbsectCrseNumb");
        sb.append('=');
        sb.append(((this.ssbsectCrseNumb == null)?"<null>":this.ssbsectCrseNumb));
        sb.append(',');
        sb.append("totalCeuHrs");
        sb.append('=');
        sb.append(((this.totalCeuHrs == null)?"<null>":this.totalCeuHrs));
        sb.append(',');
        sb.append("totalCredHrs");
        sb.append('=');
        sb.append(((this.totalCredHrs == null)?"<null>":this.totalCredHrs));
        sb.append(',');
        sb.append("rstsCode");
        sb.append('=');
        sb.append(((this.rstsCode == null)?"<null>":this.rstsCode));
        sb.append(',');
        sb.append("campCode");
        sb.append('=');
        sb.append(((this.campCode == null)?"<null>":this.campCode));
        sb.append(',');
        sb.append("totalBillHrs");
        sb.append('=');
        sb.append(((this.totalBillHrs == null)?"<null>":this.totalBillHrs));
        sb.append(',');
        sb.append("rstsDate");
        sb.append('=');
        sb.append(((this.rstsDate == null)?"<null>":this.rstsDate));
        sb.append(',');
        sb.append("crn");
        sb.append('=');
        sb.append(((this.crn == null)?"<null>":this.crn));
        sb.append(',');
        sb.append("levlCode");
        sb.append('=');
        sb.append(((this.levlCode == null)?"<null>":this.levlCode));
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
        result = ((result* 31)+((this.stspKeySequence == null)? 0 :this.stspKeySequence.hashCode()));
        result = ((result* 31)+((this.billHr == null)? 0 :this.billHr.hashCode()));
        result = ((result* 31)+((this.creditHr == null)? 0 :this.creditHr.hashCode()));
        result = ((result* 31)+((this.sfrrfcrTuitRefund == null)? 0 :this.sfrrfcrTuitRefund.hashCode()));
        result = ((result* 31)+((this.ssbsectSeqNumb == null)? 0 :this.ssbsectSeqNumb.hashCode()));
        result = ((result* 31)+((this.ssbsectSubjCode == null)? 0 :this.ssbsectSubjCode.hashCode()));
        result = ((result* 31)+((this.message == null)? 0 :this.message.hashCode()));
        result = ((result* 31)+((this.sfrrfcrFeesRefund == null)? 0 :this.sfrrfcrFeesRefund.hashCode()));
        result = ((result* 31)+((this.ssbsectCrseNumb == null)? 0 :this.ssbsectCrseNumb.hashCode()));
        result = ((result* 31)+((this.totalCeuHrs == null)? 0 :this.totalCeuHrs.hashCode()));
        result = ((result* 31)+((this.totalCredHrs == null)? 0 :this.totalCredHrs.hashCode()));
        result = ((result* 31)+((this.rstsCode == null)? 0 :this.rstsCode.hashCode()));
        result = ((result* 31)+((this.campCode == null)? 0 :this.campCode.hashCode()));
        result = ((result* 31)+((this.totalBillHrs == null)? 0 :this.totalBillHrs.hashCode()));
        result = ((result* 31)+((this.rstsDate == null)? 0 :this.rstsDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.crn == null)? 0 :this.crn.hashCode()));
        result = ((result* 31)+((this.levlCode == null)? 0 :this.levlCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sfrstcr) == false) {
            return false;
        }
        Sfrstcr rhs = ((Sfrstcr) other);
        return (((((((((((((((((((this.stspKeySequence == rhs.stspKeySequence)||((this.stspKeySequence!= null)&&this.stspKeySequence.equals(rhs.stspKeySequence)))&&((this.billHr == rhs.billHr)||((this.billHr!= null)&&this.billHr.equals(rhs.billHr))))&&((this.creditHr == rhs.creditHr)||((this.creditHr!= null)&&this.creditHr.equals(rhs.creditHr))))&&((this.sfrrfcrTuitRefund == rhs.sfrrfcrTuitRefund)||((this.sfrrfcrTuitRefund!= null)&&this.sfrrfcrTuitRefund.equals(rhs.sfrrfcrTuitRefund))))&&((this.ssbsectSeqNumb == rhs.ssbsectSeqNumb)||((this.ssbsectSeqNumb!= null)&&this.ssbsectSeqNumb.equals(rhs.ssbsectSeqNumb))))&&((this.ssbsectSubjCode == rhs.ssbsectSubjCode)||((this.ssbsectSubjCode!= null)&&this.ssbsectSubjCode.equals(rhs.ssbsectSubjCode))))&&((this.message == rhs.message)||((this.message!= null)&&this.message.equals(rhs.message))))&&((this.sfrrfcrFeesRefund == rhs.sfrrfcrFeesRefund)||((this.sfrrfcrFeesRefund!= null)&&this.sfrrfcrFeesRefund.equals(rhs.sfrrfcrFeesRefund))))&&((this.ssbsectCrseNumb == rhs.ssbsectCrseNumb)||((this.ssbsectCrseNumb!= null)&&this.ssbsectCrseNumb.equals(rhs.ssbsectCrseNumb))))&&((this.totalCeuHrs == rhs.totalCeuHrs)||((this.totalCeuHrs!= null)&&this.totalCeuHrs.equals(rhs.totalCeuHrs))))&&((this.totalCredHrs == rhs.totalCredHrs)||((this.totalCredHrs!= null)&&this.totalCredHrs.equals(rhs.totalCredHrs))))&&((this.rstsCode == rhs.rstsCode)||((this.rstsCode!= null)&&this.rstsCode.equals(rhs.rstsCode))))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.totalBillHrs == rhs.totalBillHrs)||((this.totalBillHrs!= null)&&this.totalBillHrs.equals(rhs.totalBillHrs))))&&((this.rstsDate == rhs.rstsDate)||((this.rstsDate!= null)&&this.rstsDate.equals(rhs.rstsDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.crn == rhs.crn)||((this.crn!= null)&&this.crn.equals(rhs.crn))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))));
    }

}
