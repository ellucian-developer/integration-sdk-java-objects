
package com.ellucian.generated.bpapi.ban.academic_non_course.v1_0_0;

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
    "satInd",
    "advrId",
    "qpnmSeqNo",
    "ncstCode",
    "evenCode",
    "ncrqCode",
    "comtCode",
    "levlCode",
    "ncstDate",
    "completeDate"
})
@Generated("jsonschema2pojo")
public class Shrncr__2 {

    /**
     * Satisfied
     * <p>
     * 
     * 
     */
    @JsonProperty("satInd")
    private String satInd;
    /**
     * Advisor
     * <p>
     * 
     * 
     */
    @JsonProperty("advrId")
    private String advrId;
    /**
     * Paper
     * <p>
     * Lineage reference object : SHRNCRS_QPNM_SEQ_NO
     * 
     */
    @JsonProperty("qpnmSeqNo")
    @JsonPropertyDescription("Lineage reference object : SHRNCRS_QPNM_SEQ_NO")
    private String qpnmSeqNo;
    /**
     * Status
     * <p>
     * Lineage reference object : SHRNCRS_NCST_CODE, Lookup lineage reference object : stvncst
     * 
     */
    @JsonProperty("ncstCode")
    @JsonPropertyDescription("Lineage reference object : SHRNCRS_NCST_CODE, Lookup lineage reference object : stvncst")
    private String ncstCode;
    /**
     * Event
     * <p>
     * Lineage reference object : SHRNCRS_EVEN_CODE
     * 
     */
    @JsonProperty("evenCode")
    @JsonPropertyDescription("Lineage reference object : SHRNCRS_EVEN_CODE")
    private String evenCode;
    /**
     * CAPP Non-Course Requirement
     * <p>
     * Lineage reference object : SHRNCRS_NCRQ_CODE, Lookup lineage reference object : stvncrq
     * 
     */
    @JsonProperty("ncrqCode")
    @JsonPropertyDescription("Lineage reference object : SHRNCRS_NCRQ_CODE, Lookup lineage reference object : stvncrq")
    private String ncrqCode;
    /**
     * Committee
     * <p>
     * Lineage reference object : SHRNCRS_COMT_CODE
     * 
     */
    @JsonProperty("comtCode")
    @JsonPropertyDescription("Lineage reference object : SHRNCRS_COMT_CODE")
    private String comtCode;
    /**
     * Level
     * <p>
     * Lineage reference object : SHRNCRS_LEVL_CODE
     * 
     */
    @JsonProperty("levlCode")
    @JsonPropertyDescription("Lineage reference object : SHRNCRS_LEVL_CODE")
    private String levlCode;
    /**
     * Status Date
     * <p>
     * Lineage reference object : SHRNCRS_NCST_DATE
     * 
     */
    @JsonProperty("ncstDate")
    @JsonPropertyDescription("Lineage reference object : SHRNCRS_NCST_DATE")
    private Date ncstDate;
    /**
     * Complete By
     * <p>
     * Lineage reference object : SHRNCRS_COMPLETE_DATE
     * 
     */
    @JsonProperty("completeDate")
    @JsonPropertyDescription("Lineage reference object : SHRNCRS_COMPLETE_DATE")
    private Date completeDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Satisfied
     * <p>
     * 
     * 
     */
    @JsonProperty("satInd")
    public String getSatInd() {
        return satInd;
    }

    /**
     * Satisfied
     * <p>
     * 
     * 
     */
    @JsonProperty("satInd")
    public void setSatInd(String satInd) {
        this.satInd = satInd;
    }

    public Shrncr__2 withSatInd(String satInd) {
        this.satInd = satInd;
        return this;
    }

    /**
     * Advisor
     * <p>
     * 
     * 
     */
    @JsonProperty("advrId")
    public String getAdvrId() {
        return advrId;
    }

    /**
     * Advisor
     * <p>
     * 
     * 
     */
    @JsonProperty("advrId")
    public void setAdvrId(String advrId) {
        this.advrId = advrId;
    }

    public Shrncr__2 withAdvrId(String advrId) {
        this.advrId = advrId;
        return this;
    }

    /**
     * Paper
     * <p>
     * Lineage reference object : SHRNCRS_QPNM_SEQ_NO
     * 
     */
    @JsonProperty("qpnmSeqNo")
    public String getQpnmSeqNo() {
        return qpnmSeqNo;
    }

    /**
     * Paper
     * <p>
     * Lineage reference object : SHRNCRS_QPNM_SEQ_NO
     * 
     */
    @JsonProperty("qpnmSeqNo")
    public void setQpnmSeqNo(String qpnmSeqNo) {
        this.qpnmSeqNo = qpnmSeqNo;
    }

    public Shrncr__2 withQpnmSeqNo(String qpnmSeqNo) {
        this.qpnmSeqNo = qpnmSeqNo;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SHRNCRS_NCST_CODE, Lookup lineage reference object : stvncst
     * 
     */
    @JsonProperty("ncstCode")
    public String getNcstCode() {
        return ncstCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SHRNCRS_NCST_CODE, Lookup lineage reference object : stvncst
     * 
     */
    @JsonProperty("ncstCode")
    public void setNcstCode(String ncstCode) {
        this.ncstCode = ncstCode;
    }

    public Shrncr__2 withNcstCode(String ncstCode) {
        this.ncstCode = ncstCode;
        return this;
    }

    /**
     * Event
     * <p>
     * Lineage reference object : SHRNCRS_EVEN_CODE
     * 
     */
    @JsonProperty("evenCode")
    public String getEvenCode() {
        return evenCode;
    }

    /**
     * Event
     * <p>
     * Lineage reference object : SHRNCRS_EVEN_CODE
     * 
     */
    @JsonProperty("evenCode")
    public void setEvenCode(String evenCode) {
        this.evenCode = evenCode;
    }

    public Shrncr__2 withEvenCode(String evenCode) {
        this.evenCode = evenCode;
        return this;
    }

    /**
     * CAPP Non-Course Requirement
     * <p>
     * Lineage reference object : SHRNCRS_NCRQ_CODE, Lookup lineage reference object : stvncrq
     * 
     */
    @JsonProperty("ncrqCode")
    public String getNcrqCode() {
        return ncrqCode;
    }

    /**
     * CAPP Non-Course Requirement
     * <p>
     * Lineage reference object : SHRNCRS_NCRQ_CODE, Lookup lineage reference object : stvncrq
     * 
     */
    @JsonProperty("ncrqCode")
    public void setNcrqCode(String ncrqCode) {
        this.ncrqCode = ncrqCode;
    }

    public Shrncr__2 withNcrqCode(String ncrqCode) {
        this.ncrqCode = ncrqCode;
        return this;
    }

    /**
     * Committee
     * <p>
     * Lineage reference object : SHRNCRS_COMT_CODE
     * 
     */
    @JsonProperty("comtCode")
    public String getComtCode() {
        return comtCode;
    }

    /**
     * Committee
     * <p>
     * Lineage reference object : SHRNCRS_COMT_CODE
     * 
     */
    @JsonProperty("comtCode")
    public void setComtCode(String comtCode) {
        this.comtCode = comtCode;
    }

    public Shrncr__2 withComtCode(String comtCode) {
        this.comtCode = comtCode;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SHRNCRS_LEVL_CODE
     * 
     */
    @JsonProperty("levlCode")
    public String getLevlCode() {
        return levlCode;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SHRNCRS_LEVL_CODE
     * 
     */
    @JsonProperty("levlCode")
    public void setLevlCode(String levlCode) {
        this.levlCode = levlCode;
    }

    public Shrncr__2 withLevlCode(String levlCode) {
        this.levlCode = levlCode;
        return this;
    }

    /**
     * Status Date
     * <p>
     * Lineage reference object : SHRNCRS_NCST_DATE
     * 
     */
    @JsonProperty("ncstDate")
    public Date getNcstDate() {
        return ncstDate;
    }

    /**
     * Status Date
     * <p>
     * Lineage reference object : SHRNCRS_NCST_DATE
     * 
     */
    @JsonProperty("ncstDate")
    public void setNcstDate(Date ncstDate) {
        this.ncstDate = ncstDate;
    }

    public Shrncr__2 withNcstDate(Date ncstDate) {
        this.ncstDate = ncstDate;
        return this;
    }

    /**
     * Complete By
     * <p>
     * Lineage reference object : SHRNCRS_COMPLETE_DATE
     * 
     */
    @JsonProperty("completeDate")
    public Date getCompleteDate() {
        return completeDate;
    }

    /**
     * Complete By
     * <p>
     * Lineage reference object : SHRNCRS_COMPLETE_DATE
     * 
     */
    @JsonProperty("completeDate")
    public void setCompleteDate(Date completeDate) {
        this.completeDate = completeDate;
    }

    public Shrncr__2 withCompleteDate(Date completeDate) {
        this.completeDate = completeDate;
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

    public Shrncr__2 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Shrncr__2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("satInd");
        sb.append('=');
        sb.append(((this.satInd == null)?"<null>":this.satInd));
        sb.append(',');
        sb.append("advrId");
        sb.append('=');
        sb.append(((this.advrId == null)?"<null>":this.advrId));
        sb.append(',');
        sb.append("qpnmSeqNo");
        sb.append('=');
        sb.append(((this.qpnmSeqNo == null)?"<null>":this.qpnmSeqNo));
        sb.append(',');
        sb.append("ncstCode");
        sb.append('=');
        sb.append(((this.ncstCode == null)?"<null>":this.ncstCode));
        sb.append(',');
        sb.append("evenCode");
        sb.append('=');
        sb.append(((this.evenCode == null)?"<null>":this.evenCode));
        sb.append(',');
        sb.append("ncrqCode");
        sb.append('=');
        sb.append(((this.ncrqCode == null)?"<null>":this.ncrqCode));
        sb.append(',');
        sb.append("comtCode");
        sb.append('=');
        sb.append(((this.comtCode == null)?"<null>":this.comtCode));
        sb.append(',');
        sb.append("levlCode");
        sb.append('=');
        sb.append(((this.levlCode == null)?"<null>":this.levlCode));
        sb.append(',');
        sb.append("ncstDate");
        sb.append('=');
        sb.append(((this.ncstDate == null)?"<null>":this.ncstDate));
        sb.append(',');
        sb.append("completeDate");
        sb.append('=');
        sb.append(((this.completeDate == null)?"<null>":this.completeDate));
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
        result = ((result* 31)+((this.satInd == null)? 0 :this.satInd.hashCode()));
        result = ((result* 31)+((this.advrId == null)? 0 :this.advrId.hashCode()));
        result = ((result* 31)+((this.qpnmSeqNo == null)? 0 :this.qpnmSeqNo.hashCode()));
        result = ((result* 31)+((this.ncstCode == null)? 0 :this.ncstCode.hashCode()));
        result = ((result* 31)+((this.evenCode == null)? 0 :this.evenCode.hashCode()));
        result = ((result* 31)+((this.ncrqCode == null)? 0 :this.ncrqCode.hashCode()));
        result = ((result* 31)+((this.comtCode == null)? 0 :this.comtCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.levlCode == null)? 0 :this.levlCode.hashCode()));
        result = ((result* 31)+((this.ncstDate == null)? 0 :this.ncstDate.hashCode()));
        result = ((result* 31)+((this.completeDate == null)? 0 :this.completeDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Shrncr__2) == false) {
            return false;
        }
        Shrncr__2 rhs = ((Shrncr__2) other);
        return ((((((((((((this.satInd == rhs.satInd)||((this.satInd!= null)&&this.satInd.equals(rhs.satInd)))&&((this.advrId == rhs.advrId)||((this.advrId!= null)&&this.advrId.equals(rhs.advrId))))&&((this.qpnmSeqNo == rhs.qpnmSeqNo)||((this.qpnmSeqNo!= null)&&this.qpnmSeqNo.equals(rhs.qpnmSeqNo))))&&((this.ncstCode == rhs.ncstCode)||((this.ncstCode!= null)&&this.ncstCode.equals(rhs.ncstCode))))&&((this.evenCode == rhs.evenCode)||((this.evenCode!= null)&&this.evenCode.equals(rhs.evenCode))))&&((this.ncrqCode == rhs.ncrqCode)||((this.ncrqCode!= null)&&this.ncrqCode.equals(rhs.ncrqCode))))&&((this.comtCode == rhs.comtCode)||((this.comtCode!= null)&&this.comtCode.equals(rhs.comtCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))))&&((this.ncstDate == rhs.ncstDate)||((this.ncstDate!= null)&&this.ncstDate.equals(rhs.ncstDate))))&&((this.completeDate == rhs.completeDate)||((this.completeDate!= null)&&this.completeDate.equals(rhs.completeDate))));
    }

}
