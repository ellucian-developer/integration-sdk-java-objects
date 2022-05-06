
package com.ellucian.generated.bpapi.ban.curricula_summary_non_course_work.v1_0_0;

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
    "ncrsApplInd",
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
public class CurriculaSummaryNonCourseWork100GetResponse {

    @JsonProperty("ncrsApplInd")
    private String ncrsApplInd;
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
     * Status Code
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
     * Lineage reference object : SHRNCRS_EVEN_CODE, Lookup lineage reference object : stveven
     * 
     */
    @JsonProperty("evenCode")
    @JsonPropertyDescription("Lineage reference object : SHRNCRS_EVEN_CODE, Lookup lineage reference object : stveven")
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
     * Lineage reference object : SHRNCRS_COMT_CODE, Lookup lineage reference object : stvcomt
     * 
     */
    @JsonProperty("comtCode")
    @JsonPropertyDescription("Lineage reference object : SHRNCRS_COMT_CODE, Lookup lineage reference object : stvcomt")
    private String comtCode;
    /**
     * Level
     * <p>
     * Lineage reference object : SHRNCRS_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCode")
    @JsonPropertyDescription("Lineage reference object : SHRNCRS_LEVL_CODE, Lookup lineage reference object : stvlevl")
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
     * Completed By
     * <p>
     * Lineage reference object : SHRNCRS_COMPLETE_DATE
     * 
     */
    @JsonProperty("completeDate")
    @JsonPropertyDescription("Lineage reference object : SHRNCRS_COMPLETE_DATE")
    private Date completeDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ncrsApplInd")
    public String getNcrsApplInd() {
        return ncrsApplInd;
    }

    @JsonProperty("ncrsApplInd")
    public void setNcrsApplInd(String ncrsApplInd) {
        this.ncrsApplInd = ncrsApplInd;
    }

    public CurriculaSummaryNonCourseWork100GetResponse withNcrsApplInd(String ncrsApplInd) {
        this.ncrsApplInd = ncrsApplInd;
        return this;
    }

    @JsonProperty("satInd")
    public String getSatInd() {
        return satInd;
    }

    @JsonProperty("satInd")
    public void setSatInd(String satInd) {
        this.satInd = satInd;
    }

    public CurriculaSummaryNonCourseWork100GetResponse withSatInd(String satInd) {
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

    public CurriculaSummaryNonCourseWork100GetResponse withAdvrId(String advrId) {
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

    public CurriculaSummaryNonCourseWork100GetResponse withQpnmSeqNo(String qpnmSeqNo) {
        this.qpnmSeqNo = qpnmSeqNo;
        return this;
    }

    /**
     * Status Code
     * <p>
     * Lineage reference object : SHRNCRS_NCST_CODE, Lookup lineage reference object : stvncst
     * 
     */
    @JsonProperty("ncstCode")
    public String getNcstCode() {
        return ncstCode;
    }

    /**
     * Status Code
     * <p>
     * Lineage reference object : SHRNCRS_NCST_CODE, Lookup lineage reference object : stvncst
     * 
     */
    @JsonProperty("ncstCode")
    public void setNcstCode(String ncstCode) {
        this.ncstCode = ncstCode;
    }

    public CurriculaSummaryNonCourseWork100GetResponse withNcstCode(String ncstCode) {
        this.ncstCode = ncstCode;
        return this;
    }

    /**
     * Event
     * <p>
     * Lineage reference object : SHRNCRS_EVEN_CODE, Lookup lineage reference object : stveven
     * 
     */
    @JsonProperty("evenCode")
    public String getEvenCode() {
        return evenCode;
    }

    /**
     * Event
     * <p>
     * Lineage reference object : SHRNCRS_EVEN_CODE, Lookup lineage reference object : stveven
     * 
     */
    @JsonProperty("evenCode")
    public void setEvenCode(String evenCode) {
        this.evenCode = evenCode;
    }

    public CurriculaSummaryNonCourseWork100GetResponse withEvenCode(String evenCode) {
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

    public CurriculaSummaryNonCourseWork100GetResponse withNcrqCode(String ncrqCode) {
        this.ncrqCode = ncrqCode;
        return this;
    }

    /**
     * Committee
     * <p>
     * Lineage reference object : SHRNCRS_COMT_CODE, Lookup lineage reference object : stvcomt
     * 
     */
    @JsonProperty("comtCode")
    public String getComtCode() {
        return comtCode;
    }

    /**
     * Committee
     * <p>
     * Lineage reference object : SHRNCRS_COMT_CODE, Lookup lineage reference object : stvcomt
     * 
     */
    @JsonProperty("comtCode")
    public void setComtCode(String comtCode) {
        this.comtCode = comtCode;
    }

    public CurriculaSummaryNonCourseWork100GetResponse withComtCode(String comtCode) {
        this.comtCode = comtCode;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SHRNCRS_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCode")
    public String getLevlCode() {
        return levlCode;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SHRNCRS_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCode")
    public void setLevlCode(String levlCode) {
        this.levlCode = levlCode;
    }

    public CurriculaSummaryNonCourseWork100GetResponse withLevlCode(String levlCode) {
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

    public CurriculaSummaryNonCourseWork100GetResponse withNcstDate(Date ncstDate) {
        this.ncstDate = ncstDate;
        return this;
    }

    /**
     * Completed By
     * <p>
     * Lineage reference object : SHRNCRS_COMPLETE_DATE
     * 
     */
    @JsonProperty("completeDate")
    public Date getCompleteDate() {
        return completeDate;
    }

    /**
     * Completed By
     * <p>
     * Lineage reference object : SHRNCRS_COMPLETE_DATE
     * 
     */
    @JsonProperty("completeDate")
    public void setCompleteDate(Date completeDate) {
        this.completeDate = completeDate;
    }

    public CurriculaSummaryNonCourseWork100GetResponse withCompleteDate(Date completeDate) {
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

    public CurriculaSummaryNonCourseWork100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CurriculaSummaryNonCourseWork100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ncrsApplInd");
        sb.append('=');
        sb.append(((this.ncrsApplInd == null)?"<null>":this.ncrsApplInd));
        sb.append(',');
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
        result = ((result* 31)+((this.ncrsApplInd == null)? 0 :this.ncrsApplInd.hashCode()));
        result = ((result* 31)+((this.advrId == null)? 0 :this.advrId.hashCode()));
        result = ((result* 31)+((this.qpnmSeqNo == null)? 0 :this.qpnmSeqNo.hashCode()));
        result = ((result* 31)+((this.ncstCode == null)? 0 :this.ncstCode.hashCode()));
        result = ((result* 31)+((this.ncrqCode == null)? 0 :this.ncrqCode.hashCode()));
        result = ((result* 31)+((this.comtCode == null)? 0 :this.comtCode.hashCode()));
        result = ((result* 31)+((this.ncstDate == null)? 0 :this.ncstDate.hashCode()));
        result = ((result* 31)+((this.completeDate == null)? 0 :this.completeDate.hashCode()));
        result = ((result* 31)+((this.satInd == null)? 0 :this.satInd.hashCode()));
        result = ((result* 31)+((this.evenCode == null)? 0 :this.evenCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.levlCode == null)? 0 :this.levlCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CurriculaSummaryNonCourseWork100GetResponse) == false) {
            return false;
        }
        CurriculaSummaryNonCourseWork100GetResponse rhs = ((CurriculaSummaryNonCourseWork100GetResponse) other);
        return (((((((((((((this.ncrsApplInd == rhs.ncrsApplInd)||((this.ncrsApplInd!= null)&&this.ncrsApplInd.equals(rhs.ncrsApplInd)))&&((this.advrId == rhs.advrId)||((this.advrId!= null)&&this.advrId.equals(rhs.advrId))))&&((this.qpnmSeqNo == rhs.qpnmSeqNo)||((this.qpnmSeqNo!= null)&&this.qpnmSeqNo.equals(rhs.qpnmSeqNo))))&&((this.ncstCode == rhs.ncstCode)||((this.ncstCode!= null)&&this.ncstCode.equals(rhs.ncstCode))))&&((this.ncrqCode == rhs.ncrqCode)||((this.ncrqCode!= null)&&this.ncrqCode.equals(rhs.ncrqCode))))&&((this.comtCode == rhs.comtCode)||((this.comtCode!= null)&&this.comtCode.equals(rhs.comtCode))))&&((this.ncstDate == rhs.ncstDate)||((this.ncstDate!= null)&&this.ncstDate.equals(rhs.ncstDate))))&&((this.completeDate == rhs.completeDate)||((this.completeDate!= null)&&this.completeDate.equals(rhs.completeDate))))&&((this.satInd == rhs.satInd)||((this.satInd!= null)&&this.satInd.equals(rhs.satInd))))&&((this.evenCode == rhs.evenCode)||((this.evenCode!= null)&&this.evenCode.equals(rhs.evenCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))));
    }

}
