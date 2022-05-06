
package com.ellucian.generated.bpapi.ban.applicant_requirements_additional_requirements.v1_0_0;

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
    "dlNoteStatus",
    "satDate",
    "effDate",
    "period",
    "dlSeqNo",
    "satInd",
    "fundCode",
    "infoAccessInd",
    "rfvbaseFundTitle"
})
@Generated("jsonschema2pojo")
public class Rfrprom {

    /**
     * Direct Loan Status
     * <p>
     * Lineage reference object : RFRPROM_DL_NOTE_STATUS
     * 
     */
    @JsonProperty("dlNoteStatus")
    @JsonPropertyDescription("Lineage reference object : RFRPROM_DL_NOTE_STATUS")
    private String dlNoteStatus;
    /**
     * Satisfied Date
     * <p>
     * Lineage reference object : RFRPROM_SAT_DATE
     * 
     */
    @JsonProperty("satDate")
    @JsonPropertyDescription("Lineage reference object : RFRPROM_SAT_DATE")
    private Date satDate;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : RFRPROM_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    @JsonPropertyDescription("Lineage reference object : RFRPROM_EFF_DATE")
    private Date effDate;
    /**
     * Period
     * <p>
     * Lineage reference object : RFRPROM_PERIOD
     * 
     */
    @JsonProperty("period")
    @JsonPropertyDescription("Lineage reference object : RFRPROM_PERIOD")
    private String period;
    /**
     * Direct Loan Sequence
     * <p>
     * Lineage reference object : RFRPROM_DL_SEQ_NO
     * 
     */
    @JsonProperty("dlSeqNo")
    @JsonPropertyDescription("Lineage reference object : RFRPROM_DL_SEQ_NO")
    private Double dlSeqNo;
    /**
     * Satisfied Indicator
     * <p>
     * Lineage reference object : RFRPROM_SAT_IND
     * 
     */
    @JsonProperty("satInd")
    @JsonPropertyDescription("Lineage reference object : RFRPROM_SAT_IND")
    private String satInd;
    /**
     * Fund
     * <p>
     * Lineage reference object : RFRPROM_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    @JsonPropertyDescription("Lineage reference object : RFRPROM_FUND_CODE")
    private String fundCode;
    /**
     * Lineage reference object : RFRPROM_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    @JsonPropertyDescription("Lineage reference object : RFRPROM_INFO_ACCESS_IND")
    private String infoAccessInd;
    @JsonProperty("rfvbaseFundTitle")
    private String rfvbaseFundTitle;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Direct Loan Status
     * <p>
     * Lineage reference object : RFRPROM_DL_NOTE_STATUS
     * 
     */
    @JsonProperty("dlNoteStatus")
    public String getDlNoteStatus() {
        return dlNoteStatus;
    }

    /**
     * Direct Loan Status
     * <p>
     * Lineage reference object : RFRPROM_DL_NOTE_STATUS
     * 
     */
    @JsonProperty("dlNoteStatus")
    public void setDlNoteStatus(String dlNoteStatus) {
        this.dlNoteStatus = dlNoteStatus;
    }

    public Rfrprom withDlNoteStatus(String dlNoteStatus) {
        this.dlNoteStatus = dlNoteStatus;
        return this;
    }

    /**
     * Satisfied Date
     * <p>
     * Lineage reference object : RFRPROM_SAT_DATE
     * 
     */
    @JsonProperty("satDate")
    public Date getSatDate() {
        return satDate;
    }

    /**
     * Satisfied Date
     * <p>
     * Lineage reference object : RFRPROM_SAT_DATE
     * 
     */
    @JsonProperty("satDate")
    public void setSatDate(Date satDate) {
        this.satDate = satDate;
    }

    public Rfrprom withSatDate(Date satDate) {
        this.satDate = satDate;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : RFRPROM_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    public Date getEffDate() {
        return effDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : RFRPROM_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public Rfrprom withEffDate(Date effDate) {
        this.effDate = effDate;
        return this;
    }

    /**
     * Period
     * <p>
     * Lineage reference object : RFRPROM_PERIOD
     * 
     */
    @JsonProperty("period")
    public String getPeriod() {
        return period;
    }

    /**
     * Period
     * <p>
     * Lineage reference object : RFRPROM_PERIOD
     * 
     */
    @JsonProperty("period")
    public void setPeriod(String period) {
        this.period = period;
    }

    public Rfrprom withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * Direct Loan Sequence
     * <p>
     * Lineage reference object : RFRPROM_DL_SEQ_NO
     * 
     */
    @JsonProperty("dlSeqNo")
    public Double getDlSeqNo() {
        return dlSeqNo;
    }

    /**
     * Direct Loan Sequence
     * <p>
     * Lineage reference object : RFRPROM_DL_SEQ_NO
     * 
     */
    @JsonProperty("dlSeqNo")
    public void setDlSeqNo(Double dlSeqNo) {
        this.dlSeqNo = dlSeqNo;
    }

    public Rfrprom withDlSeqNo(Double dlSeqNo) {
        this.dlSeqNo = dlSeqNo;
        return this;
    }

    /**
     * Satisfied Indicator
     * <p>
     * Lineage reference object : RFRPROM_SAT_IND
     * 
     */
    @JsonProperty("satInd")
    public String getSatInd() {
        return satInd;
    }

    /**
     * Satisfied Indicator
     * <p>
     * Lineage reference object : RFRPROM_SAT_IND
     * 
     */
    @JsonProperty("satInd")
    public void setSatInd(String satInd) {
        this.satInd = satInd;
    }

    public Rfrprom withSatInd(String satInd) {
        this.satInd = satInd;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : RFRPROM_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    public String getFundCode() {
        return fundCode;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : RFRPROM_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public Rfrprom withFundCode(String fundCode) {
        this.fundCode = fundCode;
        return this;
    }

    /**
     * Lineage reference object : RFRPROM_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    public String getInfoAccessInd() {
        return infoAccessInd;
    }

    /**
     * Lineage reference object : RFRPROM_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    public void setInfoAccessInd(String infoAccessInd) {
        this.infoAccessInd = infoAccessInd;
    }

    public Rfrprom withInfoAccessInd(String infoAccessInd) {
        this.infoAccessInd = infoAccessInd;
        return this;
    }

    @JsonProperty("rfvbaseFundTitle")
    public String getRfvbaseFundTitle() {
        return rfvbaseFundTitle;
    }

    @JsonProperty("rfvbaseFundTitle")
    public void setRfvbaseFundTitle(String rfvbaseFundTitle) {
        this.rfvbaseFundTitle = rfvbaseFundTitle;
    }

    public Rfrprom withRfvbaseFundTitle(String rfvbaseFundTitle) {
        this.rfvbaseFundTitle = rfvbaseFundTitle;
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

    public Rfrprom withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Rfrprom.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dlNoteStatus");
        sb.append('=');
        sb.append(((this.dlNoteStatus == null)?"<null>":this.dlNoteStatus));
        sb.append(',');
        sb.append("satDate");
        sb.append('=');
        sb.append(((this.satDate == null)?"<null>":this.satDate));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("period");
        sb.append('=');
        sb.append(((this.period == null)?"<null>":this.period));
        sb.append(',');
        sb.append("dlSeqNo");
        sb.append('=');
        sb.append(((this.dlSeqNo == null)?"<null>":this.dlSeqNo));
        sb.append(',');
        sb.append("satInd");
        sb.append('=');
        sb.append(((this.satInd == null)?"<null>":this.satInd));
        sb.append(',');
        sb.append("fundCode");
        sb.append('=');
        sb.append(((this.fundCode == null)?"<null>":this.fundCode));
        sb.append(',');
        sb.append("infoAccessInd");
        sb.append('=');
        sb.append(((this.infoAccessInd == null)?"<null>":this.infoAccessInd));
        sb.append(',');
        sb.append("rfvbaseFundTitle");
        sb.append('=');
        sb.append(((this.rfvbaseFundTitle == null)?"<null>":this.rfvbaseFundTitle));
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
        result = ((result* 31)+((this.dlNoteStatus == null)? 0 :this.dlNoteStatus.hashCode()));
        result = ((result* 31)+((this.satDate == null)? 0 :this.satDate.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.period == null)? 0 :this.period.hashCode()));
        result = ((result* 31)+((this.dlSeqNo == null)? 0 :this.dlSeqNo.hashCode()));
        result = ((result* 31)+((this.satInd == null)? 0 :this.satInd.hashCode()));
        result = ((result* 31)+((this.fundCode == null)? 0 :this.fundCode.hashCode()));
        result = ((result* 31)+((this.infoAccessInd == null)? 0 :this.infoAccessInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.rfvbaseFundTitle == null)? 0 :this.rfvbaseFundTitle.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Rfrprom) == false) {
            return false;
        }
        Rfrprom rhs = ((Rfrprom) other);
        return (((((((((((this.dlNoteStatus == rhs.dlNoteStatus)||((this.dlNoteStatus!= null)&&this.dlNoteStatus.equals(rhs.dlNoteStatus)))&&((this.satDate == rhs.satDate)||((this.satDate!= null)&&this.satDate.equals(rhs.satDate))))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period))))&&((this.dlSeqNo == rhs.dlSeqNo)||((this.dlSeqNo!= null)&&this.dlSeqNo.equals(rhs.dlSeqNo))))&&((this.satInd == rhs.satInd)||((this.satInd!= null)&&this.satInd.equals(rhs.satInd))))&&((this.fundCode == rhs.fundCode)||((this.fundCode!= null)&&this.fundCode.equals(rhs.fundCode))))&&((this.infoAccessInd == rhs.infoAccessInd)||((this.infoAccessInd!= null)&&this.infoAccessInd.equals(rhs.infoAccessInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.rfvbaseFundTitle == rhs.rfvbaseFundTitle)||((this.rfvbaseFundTitle!= null)&&this.rfvbaseFundTitle.equals(rhs.rfvbaseFundTitle))));
    }

}
