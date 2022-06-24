
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
    "id",
    "qpnmSeqNo",
    "comtCode",
    "evenCode",
    "levlCode",
    "completeDate",
    "ncrqCode",
    "ncstCode",
    "ncstDate",
    "dgmrSeqNo"
})
@Generated("jsonschema2pojo")
public class AcademicNonCourse100QapiPost {

    @JsonProperty("id")
    private String id;
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
    @JsonProperty("comtCode")
    @JsonPropertyDescription("Lineage reference object : SHRNCRS_COMT_CODE")
    private String comtCode;
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
    @JsonProperty("completeDate")
    @JsonPropertyDescription("Lineage reference object : SHRNCRS_COMPLETE_DATE")
    private Date completeDate;
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
     * Status
     * <p>
     * Lineage reference object : SHRNCRS_NCST_CODE, Lookup lineage reference object : stvncst
     * 
     */
    @JsonProperty("ncstCode")
    @JsonPropertyDescription("Lineage reference object : SHRNCRS_NCST_CODE, Lookup lineage reference object : stvncst")
    private String ncstCode;
    /**
     * Status Date
     * <p>
     * Lineage reference object : SHRNCRS_NCST_DATE
     * 
     */
    @JsonProperty("ncstDate")
    @JsonPropertyDescription("Lineage reference object : SHRNCRS_NCST_DATE")
    private Date ncstDate;
    @JsonProperty("dgmrSeqNo")
    private String dgmrSeqNo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public AcademicNonCourse100QapiPost withId(String id) {
        this.id = id;
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

    public AcademicNonCourse100QapiPost withQpnmSeqNo(String qpnmSeqNo) {
        this.qpnmSeqNo = qpnmSeqNo;
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

    public AcademicNonCourse100QapiPost withComtCode(String comtCode) {
        this.comtCode = comtCode;
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

    public AcademicNonCourse100QapiPost withEvenCode(String evenCode) {
        this.evenCode = evenCode;
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

    public AcademicNonCourse100QapiPost withLevlCode(String levlCode) {
        this.levlCode = levlCode;
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

    public AcademicNonCourse100QapiPost withCompleteDate(Date completeDate) {
        this.completeDate = completeDate;
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

    public AcademicNonCourse100QapiPost withNcrqCode(String ncrqCode) {
        this.ncrqCode = ncrqCode;
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

    public AcademicNonCourse100QapiPost withNcstCode(String ncstCode) {
        this.ncstCode = ncstCode;
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

    public AcademicNonCourse100QapiPost withNcstDate(Date ncstDate) {
        this.ncstDate = ncstDate;
        return this;
    }

    @JsonProperty("dgmrSeqNo")
    public String getDgmrSeqNo() {
        return dgmrSeqNo;
    }

    @JsonProperty("dgmrSeqNo")
    public void setDgmrSeqNo(String dgmrSeqNo) {
        this.dgmrSeqNo = dgmrSeqNo;
    }

    public AcademicNonCourse100QapiPost withDgmrSeqNo(String dgmrSeqNo) {
        this.dgmrSeqNo = dgmrSeqNo;
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

    public AcademicNonCourse100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AcademicNonCourse100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("qpnmSeqNo");
        sb.append('=');
        sb.append(((this.qpnmSeqNo == null)?"<null>":this.qpnmSeqNo));
        sb.append(',');
        sb.append("comtCode");
        sb.append('=');
        sb.append(((this.comtCode == null)?"<null>":this.comtCode));
        sb.append(',');
        sb.append("evenCode");
        sb.append('=');
        sb.append(((this.evenCode == null)?"<null>":this.evenCode));
        sb.append(',');
        sb.append("levlCode");
        sb.append('=');
        sb.append(((this.levlCode == null)?"<null>":this.levlCode));
        sb.append(',');
        sb.append("completeDate");
        sb.append('=');
        sb.append(((this.completeDate == null)?"<null>":this.completeDate));
        sb.append(',');
        sb.append("ncrqCode");
        sb.append('=');
        sb.append(((this.ncrqCode == null)?"<null>":this.ncrqCode));
        sb.append(',');
        sb.append("ncstCode");
        sb.append('=');
        sb.append(((this.ncstCode == null)?"<null>":this.ncstCode));
        sb.append(',');
        sb.append("ncstDate");
        sb.append('=');
        sb.append(((this.ncstDate == null)?"<null>":this.ncstDate));
        sb.append(',');
        sb.append("dgmrSeqNo");
        sb.append('=');
        sb.append(((this.dgmrSeqNo == null)?"<null>":this.dgmrSeqNo));
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
        result = ((result* 31)+((this.qpnmSeqNo == null)? 0 :this.qpnmSeqNo.hashCode()));
        result = ((result* 31)+((this.ncstCode == null)? 0 :this.ncstCode.hashCode()));
        result = ((result* 31)+((this.evenCode == null)? 0 :this.evenCode.hashCode()));
        result = ((result* 31)+((this.ncrqCode == null)? 0 :this.ncrqCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.comtCode == null)? 0 :this.comtCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.dgmrSeqNo == null)? 0 :this.dgmrSeqNo.hashCode()));
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
        if ((other instanceof AcademicNonCourse100QapiPost) == false) {
            return false;
        }
        AcademicNonCourse100QapiPost rhs = ((AcademicNonCourse100QapiPost) other);
        return ((((((((((((this.qpnmSeqNo == rhs.qpnmSeqNo)||((this.qpnmSeqNo!= null)&&this.qpnmSeqNo.equals(rhs.qpnmSeqNo)))&&((this.ncstCode == rhs.ncstCode)||((this.ncstCode!= null)&&this.ncstCode.equals(rhs.ncstCode))))&&((this.evenCode == rhs.evenCode)||((this.evenCode!= null)&&this.evenCode.equals(rhs.evenCode))))&&((this.ncrqCode == rhs.ncrqCode)||((this.ncrqCode!= null)&&this.ncrqCode.equals(rhs.ncrqCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.comtCode == rhs.comtCode)||((this.comtCode!= null)&&this.comtCode.equals(rhs.comtCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.dgmrSeqNo == rhs.dgmrSeqNo)||((this.dgmrSeqNo!= null)&&this.dgmrSeqNo.equals(rhs.dgmrSeqNo))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))))&&((this.ncstDate == rhs.ncstDate)||((this.ncstDate!= null)&&this.ncstDate.equals(rhs.ncstDate))))&&((this.completeDate == rhs.completeDate)||((this.completeDate!= null)&&this.completeDate.equals(rhs.completeDate))));
    }

}
