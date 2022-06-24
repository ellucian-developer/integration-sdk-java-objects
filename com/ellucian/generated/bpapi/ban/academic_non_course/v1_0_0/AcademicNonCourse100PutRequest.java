
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
    "advrId",
    "qpnmSeqNo",
    "criteria.comtCode",
    "ncstCode",
    "ncrqCode",
    "criteria.levlCode",
    "comtCode",
    "criteria.evenCode",
    "ncstDate",
    "completeDate",
    "criteria.qpnmSeqNo",
    "criteria.ncrqCode",
    "criteria.ncstCode",
    "evenCode",
    "id",
    "criteria.ncstDate",
    "levlCode",
    "criteria.completeDate"
})
@Generated("jsonschema2pojo")
public class AcademicNonCourse100PutRequest {

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
     * Committee
     * <p>
     * Lineage reference object : SHRNCRS_COMT_CODE
     * 
     */
    @JsonProperty("criteria.comtCode")
    @JsonPropertyDescription("Lineage reference object : SHRNCRS_COMT_CODE")
    private String criteriaComtCode;
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
     * CAPP Non-Course Requirement
     * <p>
     * Lineage reference object : SHRNCRS_NCRQ_CODE, Lookup lineage reference object : stvncrq
     * 
     */
    @JsonProperty("ncrqCode")
    @JsonPropertyDescription("Lineage reference object : SHRNCRS_NCRQ_CODE, Lookup lineage reference object : stvncrq")
    private String ncrqCode;
    /**
     * Level
     * <p>
     * Lineage reference object : SHRNCRS_LEVL_CODE
     * 
     */
    @JsonProperty("criteria.levlCode")
    @JsonPropertyDescription("Lineage reference object : SHRNCRS_LEVL_CODE")
    private String criteriaLevlCode;
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
     * Event
     * <p>
     * Lineage reference object : SHRNCRS_EVEN_CODE
     * 
     */
    @JsonProperty("criteria.evenCode")
    @JsonPropertyDescription("Lineage reference object : SHRNCRS_EVEN_CODE")
    private String criteriaEvenCode;
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
    /**
     * Paper
     * <p>
     * Lineage reference object : SHRNCRS_QPNM_SEQ_NO
     * 
     */
    @JsonProperty("criteria.qpnmSeqNo")
    @JsonPropertyDescription("Lineage reference object : SHRNCRS_QPNM_SEQ_NO")
    private String criteriaQpnmSeqNo;
    /**
     * CAPP Non-Course Requirement
     * <p>
     * Lineage reference object : SHRNCRS_NCRQ_CODE, Lookup lineage reference object : stvncrq
     * 
     */
    @JsonProperty("criteria.ncrqCode")
    @JsonPropertyDescription("Lineage reference object : SHRNCRS_NCRQ_CODE, Lookup lineage reference object : stvncrq")
    private String criteriaNcrqCode;
    /**
     * Status
     * <p>
     * Lineage reference object : SHRNCRS_NCST_CODE, Lookup lineage reference object : stvncst
     * 
     */
    @JsonProperty("criteria.ncstCode")
    @JsonPropertyDescription("Lineage reference object : SHRNCRS_NCST_CODE, Lookup lineage reference object : stvncst")
    private String criteriaNcstCode;
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
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private String id;
    /**
     * Status Date
     * <p>
     * Lineage reference object : SHRNCRS_NCST_DATE
     * 
     */
    @JsonProperty("criteria.ncstDate")
    @JsonPropertyDescription("Lineage reference object : SHRNCRS_NCST_DATE")
    private Date criteriaNcstDate;
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
     * Complete By
     * <p>
     * Lineage reference object : SHRNCRS_COMPLETE_DATE
     * 
     */
    @JsonProperty("criteria.completeDate")
    @JsonPropertyDescription("Lineage reference object : SHRNCRS_COMPLETE_DATE")
    private Date criteriaCompleteDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public AcademicNonCourse100PutRequest withAdvrId(String advrId) {
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

    public AcademicNonCourse100PutRequest withQpnmSeqNo(String qpnmSeqNo) {
        this.qpnmSeqNo = qpnmSeqNo;
        return this;
    }

    /**
     * Committee
     * <p>
     * Lineage reference object : SHRNCRS_COMT_CODE
     * 
     */
    @JsonProperty("criteria.comtCode")
    public String getCriteriaComtCode() {
        return criteriaComtCode;
    }

    /**
     * Committee
     * <p>
     * Lineage reference object : SHRNCRS_COMT_CODE
     * 
     */
    @JsonProperty("criteria.comtCode")
    public void setCriteriaComtCode(String criteriaComtCode) {
        this.criteriaComtCode = criteriaComtCode;
    }

    public AcademicNonCourse100PutRequest withCriteriaComtCode(String criteriaComtCode) {
        this.criteriaComtCode = criteriaComtCode;
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

    public AcademicNonCourse100PutRequest withNcstCode(String ncstCode) {
        this.ncstCode = ncstCode;
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

    public AcademicNonCourse100PutRequest withNcrqCode(String ncrqCode) {
        this.ncrqCode = ncrqCode;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SHRNCRS_LEVL_CODE
     * 
     */
    @JsonProperty("criteria.levlCode")
    public String getCriteriaLevlCode() {
        return criteriaLevlCode;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SHRNCRS_LEVL_CODE
     * 
     */
    @JsonProperty("criteria.levlCode")
    public void setCriteriaLevlCode(String criteriaLevlCode) {
        this.criteriaLevlCode = criteriaLevlCode;
    }

    public AcademicNonCourse100PutRequest withCriteriaLevlCode(String criteriaLevlCode) {
        this.criteriaLevlCode = criteriaLevlCode;
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

    public AcademicNonCourse100PutRequest withComtCode(String comtCode) {
        this.comtCode = comtCode;
        return this;
    }

    /**
     * Event
     * <p>
     * Lineage reference object : SHRNCRS_EVEN_CODE
     * 
     */
    @JsonProperty("criteria.evenCode")
    public String getCriteriaEvenCode() {
        return criteriaEvenCode;
    }

    /**
     * Event
     * <p>
     * Lineage reference object : SHRNCRS_EVEN_CODE
     * 
     */
    @JsonProperty("criteria.evenCode")
    public void setCriteriaEvenCode(String criteriaEvenCode) {
        this.criteriaEvenCode = criteriaEvenCode;
    }

    public AcademicNonCourse100PutRequest withCriteriaEvenCode(String criteriaEvenCode) {
        this.criteriaEvenCode = criteriaEvenCode;
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

    public AcademicNonCourse100PutRequest withNcstDate(Date ncstDate) {
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

    public AcademicNonCourse100PutRequest withCompleteDate(Date completeDate) {
        this.completeDate = completeDate;
        return this;
    }

    /**
     * Paper
     * <p>
     * Lineage reference object : SHRNCRS_QPNM_SEQ_NO
     * 
     */
    @JsonProperty("criteria.qpnmSeqNo")
    public String getCriteriaQpnmSeqNo() {
        return criteriaQpnmSeqNo;
    }

    /**
     * Paper
     * <p>
     * Lineage reference object : SHRNCRS_QPNM_SEQ_NO
     * 
     */
    @JsonProperty("criteria.qpnmSeqNo")
    public void setCriteriaQpnmSeqNo(String criteriaQpnmSeqNo) {
        this.criteriaQpnmSeqNo = criteriaQpnmSeqNo;
    }

    public AcademicNonCourse100PutRequest withCriteriaQpnmSeqNo(String criteriaQpnmSeqNo) {
        this.criteriaQpnmSeqNo = criteriaQpnmSeqNo;
        return this;
    }

    /**
     * CAPP Non-Course Requirement
     * <p>
     * Lineage reference object : SHRNCRS_NCRQ_CODE, Lookup lineage reference object : stvncrq
     * 
     */
    @JsonProperty("criteria.ncrqCode")
    public String getCriteriaNcrqCode() {
        return criteriaNcrqCode;
    }

    /**
     * CAPP Non-Course Requirement
     * <p>
     * Lineage reference object : SHRNCRS_NCRQ_CODE, Lookup lineage reference object : stvncrq
     * 
     */
    @JsonProperty("criteria.ncrqCode")
    public void setCriteriaNcrqCode(String criteriaNcrqCode) {
        this.criteriaNcrqCode = criteriaNcrqCode;
    }

    public AcademicNonCourse100PutRequest withCriteriaNcrqCode(String criteriaNcrqCode) {
        this.criteriaNcrqCode = criteriaNcrqCode;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SHRNCRS_NCST_CODE, Lookup lineage reference object : stvncst
     * 
     */
    @JsonProperty("criteria.ncstCode")
    public String getCriteriaNcstCode() {
        return criteriaNcstCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SHRNCRS_NCST_CODE, Lookup lineage reference object : stvncst
     * 
     */
    @JsonProperty("criteria.ncstCode")
    public void setCriteriaNcstCode(String criteriaNcstCode) {
        this.criteriaNcstCode = criteriaNcstCode;
    }

    public AcademicNonCourse100PutRequest withCriteriaNcstCode(String criteriaNcstCode) {
        this.criteriaNcstCode = criteriaNcstCode;
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

    public AcademicNonCourse100PutRequest withEvenCode(String evenCode) {
        this.evenCode = evenCode;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public AcademicNonCourse100PutRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Status Date
     * <p>
     * Lineage reference object : SHRNCRS_NCST_DATE
     * 
     */
    @JsonProperty("criteria.ncstDate")
    public Date getCriteriaNcstDate() {
        return criteriaNcstDate;
    }

    /**
     * Status Date
     * <p>
     * Lineage reference object : SHRNCRS_NCST_DATE
     * 
     */
    @JsonProperty("criteria.ncstDate")
    public void setCriteriaNcstDate(Date criteriaNcstDate) {
        this.criteriaNcstDate = criteriaNcstDate;
    }

    public AcademicNonCourse100PutRequest withCriteriaNcstDate(Date criteriaNcstDate) {
        this.criteriaNcstDate = criteriaNcstDate;
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

    public AcademicNonCourse100PutRequest withLevlCode(String levlCode) {
        this.levlCode = levlCode;
        return this;
    }

    /**
     * Complete By
     * <p>
     * Lineage reference object : SHRNCRS_COMPLETE_DATE
     * 
     */
    @JsonProperty("criteria.completeDate")
    public Date getCriteriaCompleteDate() {
        return criteriaCompleteDate;
    }

    /**
     * Complete By
     * <p>
     * Lineage reference object : SHRNCRS_COMPLETE_DATE
     * 
     */
    @JsonProperty("criteria.completeDate")
    public void setCriteriaCompleteDate(Date criteriaCompleteDate) {
        this.criteriaCompleteDate = criteriaCompleteDate;
    }

    public AcademicNonCourse100PutRequest withCriteriaCompleteDate(Date criteriaCompleteDate) {
        this.criteriaCompleteDate = criteriaCompleteDate;
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

    public AcademicNonCourse100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AcademicNonCourse100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("advrId");
        sb.append('=');
        sb.append(((this.advrId == null)?"<null>":this.advrId));
        sb.append(',');
        sb.append("qpnmSeqNo");
        sb.append('=');
        sb.append(((this.qpnmSeqNo == null)?"<null>":this.qpnmSeqNo));
        sb.append(',');
        sb.append("criteriaComtCode");
        sb.append('=');
        sb.append(((this.criteriaComtCode == null)?"<null>":this.criteriaComtCode));
        sb.append(',');
        sb.append("ncstCode");
        sb.append('=');
        sb.append(((this.ncstCode == null)?"<null>":this.ncstCode));
        sb.append(',');
        sb.append("ncrqCode");
        sb.append('=');
        sb.append(((this.ncrqCode == null)?"<null>":this.ncrqCode));
        sb.append(',');
        sb.append("criteriaLevlCode");
        sb.append('=');
        sb.append(((this.criteriaLevlCode == null)?"<null>":this.criteriaLevlCode));
        sb.append(',');
        sb.append("comtCode");
        sb.append('=');
        sb.append(((this.comtCode == null)?"<null>":this.comtCode));
        sb.append(',');
        sb.append("criteriaEvenCode");
        sb.append('=');
        sb.append(((this.criteriaEvenCode == null)?"<null>":this.criteriaEvenCode));
        sb.append(',');
        sb.append("ncstDate");
        sb.append('=');
        sb.append(((this.ncstDate == null)?"<null>":this.ncstDate));
        sb.append(',');
        sb.append("completeDate");
        sb.append('=');
        sb.append(((this.completeDate == null)?"<null>":this.completeDate));
        sb.append(',');
        sb.append("criteriaQpnmSeqNo");
        sb.append('=');
        sb.append(((this.criteriaQpnmSeqNo == null)?"<null>":this.criteriaQpnmSeqNo));
        sb.append(',');
        sb.append("criteriaNcrqCode");
        sb.append('=');
        sb.append(((this.criteriaNcrqCode == null)?"<null>":this.criteriaNcrqCode));
        sb.append(',');
        sb.append("criteriaNcstCode");
        sb.append('=');
        sb.append(((this.criteriaNcstCode == null)?"<null>":this.criteriaNcstCode));
        sb.append(',');
        sb.append("evenCode");
        sb.append('=');
        sb.append(((this.evenCode == null)?"<null>":this.evenCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("criteriaNcstDate");
        sb.append('=');
        sb.append(((this.criteriaNcstDate == null)?"<null>":this.criteriaNcstDate));
        sb.append(',');
        sb.append("levlCode");
        sb.append('=');
        sb.append(((this.levlCode == null)?"<null>":this.levlCode));
        sb.append(',');
        sb.append("criteriaCompleteDate");
        sb.append('=');
        sb.append(((this.criteriaCompleteDate == null)?"<null>":this.criteriaCompleteDate));
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
        result = ((result* 31)+((this.advrId == null)? 0 :this.advrId.hashCode()));
        result = ((result* 31)+((this.qpnmSeqNo == null)? 0 :this.qpnmSeqNo.hashCode()));
        result = ((result* 31)+((this.criteriaQpnmSeqNo == null)? 0 :this.criteriaQpnmSeqNo.hashCode()));
        result = ((result* 31)+((this.ncstCode == null)? 0 :this.ncstCode.hashCode()));
        result = ((result* 31)+((this.criteriaComtCode == null)? 0 :this.criteriaComtCode.hashCode()));
        result = ((result* 31)+((this.ncrqCode == null)? 0 :this.ncrqCode.hashCode()));
        result = ((result* 31)+((this.comtCode == null)? 0 :this.comtCode.hashCode()));
        result = ((result* 31)+((this.criteriaEvenCode == null)? 0 :this.criteriaEvenCode.hashCode()));
        result = ((result* 31)+((this.ncstDate == null)? 0 :this.ncstDate.hashCode()));
        result = ((result* 31)+((this.completeDate == null)? 0 :this.completeDate.hashCode()));
        result = ((result* 31)+((this.criteriaCompleteDate == null)? 0 :this.criteriaCompleteDate.hashCode()));
        result = ((result* 31)+((this.criteriaNcrqCode == null)? 0 :this.criteriaNcrqCode.hashCode()));
        result = ((result* 31)+((this.criteriaNcstCode == null)? 0 :this.criteriaNcstCode.hashCode()));
        result = ((result* 31)+((this.criteriaNcstDate == null)? 0 :this.criteriaNcstDate.hashCode()));
        result = ((result* 31)+((this.criteriaLevlCode == null)? 0 :this.criteriaLevlCode.hashCode()));
        result = ((result* 31)+((this.evenCode == null)? 0 :this.evenCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.levlCode == null)? 0 :this.levlCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AcademicNonCourse100PutRequest) == false) {
            return false;
        }
        AcademicNonCourse100PutRequest rhs = ((AcademicNonCourse100PutRequest) other);
        return ((((((((((((((((((((this.advrId == rhs.advrId)||((this.advrId!= null)&&this.advrId.equals(rhs.advrId)))&&((this.qpnmSeqNo == rhs.qpnmSeqNo)||((this.qpnmSeqNo!= null)&&this.qpnmSeqNo.equals(rhs.qpnmSeqNo))))&&((this.criteriaQpnmSeqNo == rhs.criteriaQpnmSeqNo)||((this.criteriaQpnmSeqNo!= null)&&this.criteriaQpnmSeqNo.equals(rhs.criteriaQpnmSeqNo))))&&((this.ncstCode == rhs.ncstCode)||((this.ncstCode!= null)&&this.ncstCode.equals(rhs.ncstCode))))&&((this.criteriaComtCode == rhs.criteriaComtCode)||((this.criteriaComtCode!= null)&&this.criteriaComtCode.equals(rhs.criteriaComtCode))))&&((this.ncrqCode == rhs.ncrqCode)||((this.ncrqCode!= null)&&this.ncrqCode.equals(rhs.ncrqCode))))&&((this.comtCode == rhs.comtCode)||((this.comtCode!= null)&&this.comtCode.equals(rhs.comtCode))))&&((this.criteriaEvenCode == rhs.criteriaEvenCode)||((this.criteriaEvenCode!= null)&&this.criteriaEvenCode.equals(rhs.criteriaEvenCode))))&&((this.ncstDate == rhs.ncstDate)||((this.ncstDate!= null)&&this.ncstDate.equals(rhs.ncstDate))))&&((this.completeDate == rhs.completeDate)||((this.completeDate!= null)&&this.completeDate.equals(rhs.completeDate))))&&((this.criteriaCompleteDate == rhs.criteriaCompleteDate)||((this.criteriaCompleteDate!= null)&&this.criteriaCompleteDate.equals(rhs.criteriaCompleteDate))))&&((this.criteriaNcrqCode == rhs.criteriaNcrqCode)||((this.criteriaNcrqCode!= null)&&this.criteriaNcrqCode.equals(rhs.criteriaNcrqCode))))&&((this.criteriaNcstCode == rhs.criteriaNcstCode)||((this.criteriaNcstCode!= null)&&this.criteriaNcstCode.equals(rhs.criteriaNcstCode))))&&((this.criteriaNcstDate == rhs.criteriaNcstDate)||((this.criteriaNcstDate!= null)&&this.criteriaNcstDate.equals(rhs.criteriaNcstDate))))&&((this.criteriaLevlCode == rhs.criteriaLevlCode)||((this.criteriaLevlCode!= null)&&this.criteriaLevlCode.equals(rhs.criteriaLevlCode))))&&((this.evenCode == rhs.evenCode)||((this.evenCode!= null)&&this.evenCode.equals(rhs.evenCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))));
    }

}
