
package com.ellucian.generated.bpapi.ban.attendance_tracking_rule.v1_0_0;

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
    "crseNumb",
    "attendEnterInd",
    "ptrmCode",
    "seqNo",
    "entryStartDate",
    "subjCode",
    "trackAttendInd",
    "keyblckTermCode",
    "entryEndDate",
    "trackingUnitCde",
    "crn"
})
@Generated("jsonschema2pojo")
public class AttendanceTrackingRule100PostRequest {

    /**
     * Course Number
     * <p>
     * Lineage reference object : SORATRK_CRSE_NUMB
     * 
     */
    @JsonProperty("crseNumb")
    @JsonPropertyDescription("Lineage reference object : SORATRK_CRSE_NUMB")
    private String crseNumb;
    /**
     * Lineage reference object : SORATRK_ATTEND_ENTER_IND
     * 
     */
    @JsonProperty("attendEnterInd")
    @JsonPropertyDescription("Lineage reference object : SORATRK_ATTEND_ENTER_IND")
    private String attendEnterInd;
    /**
     * Part Of Term
     * <p>
     * Lineage reference object : SORATRK_PTRM_CODE, Lookup lineage reference object : stvptrm
     * 
     */
    @JsonProperty("ptrmCode")
    @JsonPropertyDescription("Lineage reference object : SORATRK_PTRM_CODE, Lookup lineage reference object : stvptrm")
    private String ptrmCode;
    /**
     * Rule Code Number
     * <p>
     * Lineage reference object : SORATRK_SEQ_NO
     * 
     */
    @JsonProperty("seqNo")
    @JsonPropertyDescription("Lineage reference object : SORATRK_SEQ_NO")
    private Double seqNo;
    /**
     * Tracking Start Date
     * <p>
     * Lineage reference object : SORATRK_ENTRY_START_DATE
     * 
     */
    @JsonProperty("entryStartDate")
    @JsonPropertyDescription("Lineage reference object : SORATRK_ENTRY_START_DATE")
    private Date entryStartDate;
    /**
     * Subject
     * <p>
     * Lineage reference object : SORATRK_SUBJ_CODE
     * 
     */
    @JsonProperty("subjCode")
    @JsonPropertyDescription("Lineage reference object : SORATRK_SUBJ_CODE")
    private String subjCode;
    /**
     * Lineage reference object : SORATRK_TRACK_ATTEND_IND
     * 
     */
    @JsonProperty("trackAttendInd")
    @JsonPropertyDescription("Lineage reference object : SORATRK_TRACK_ATTEND_IND")
    private String trackAttendInd;
    /**
     * Term
     * <p>
     * Lineage reference object : keyblckTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblckTermCode")
    @JsonPropertyDescription("Lineage reference object : keyblckTermCode, Lookup lineage reference object : stvterm")
    private Object keyblckTermCode;
    /**
     * Tracking End Date
     * <p>
     * Lineage reference object : SORATRK_ENTRY_END_DATE
     * 
     */
    @JsonProperty("entryEndDate")
    @JsonPropertyDescription("Lineage reference object : SORATRK_ENTRY_END_DATE")
    private Date entryEndDate;
    /**
     * Tracking Unit
     * <p>
     * Lineage reference object : SORATRK_TRACKING_UNIT_CDE
     * 
     */
    @JsonProperty("trackingUnitCde")
    @JsonPropertyDescription("Lineage reference object : SORATRK_TRACKING_UNIT_CDE")
    private String trackingUnitCde;
    /**
     * CRN
     * <p>
     * Lineage reference object : SORATRK_CRN, Lookup lineage reference object : SVQ_SSASECQ
     * 
     */
    @JsonProperty("crn")
    @JsonPropertyDescription("Lineage reference object : SORATRK_CRN, Lookup lineage reference object : SVQ_SSASECQ")
    private String crn;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Course Number
     * <p>
     * Lineage reference object : SORATRK_CRSE_NUMB
     * 
     */
    @JsonProperty("crseNumb")
    public String getCrseNumb() {
        return crseNumb;
    }

    /**
     * Course Number
     * <p>
     * Lineage reference object : SORATRK_CRSE_NUMB
     * 
     */
    @JsonProperty("crseNumb")
    public void setCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
    }

    public AttendanceTrackingRule100PostRequest withCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
        return this;
    }

    /**
     * Lineage reference object : SORATRK_ATTEND_ENTER_IND
     * 
     */
    @JsonProperty("attendEnterInd")
    public String getAttendEnterInd() {
        return attendEnterInd;
    }

    /**
     * Lineage reference object : SORATRK_ATTEND_ENTER_IND
     * 
     */
    @JsonProperty("attendEnterInd")
    public void setAttendEnterInd(String attendEnterInd) {
        this.attendEnterInd = attendEnterInd;
    }

    public AttendanceTrackingRule100PostRequest withAttendEnterInd(String attendEnterInd) {
        this.attendEnterInd = attendEnterInd;
        return this;
    }

    /**
     * Part Of Term
     * <p>
     * Lineage reference object : SORATRK_PTRM_CODE, Lookup lineage reference object : stvptrm
     * 
     */
    @JsonProperty("ptrmCode")
    public String getPtrmCode() {
        return ptrmCode;
    }

    /**
     * Part Of Term
     * <p>
     * Lineage reference object : SORATRK_PTRM_CODE, Lookup lineage reference object : stvptrm
     * 
     */
    @JsonProperty("ptrmCode")
    public void setPtrmCode(String ptrmCode) {
        this.ptrmCode = ptrmCode;
    }

    public AttendanceTrackingRule100PostRequest withPtrmCode(String ptrmCode) {
        this.ptrmCode = ptrmCode;
        return this;
    }

    /**
     * Rule Code Number
     * <p>
     * Lineage reference object : SORATRK_SEQ_NO
     * 
     */
    @JsonProperty("seqNo")
    public Double getSeqNo() {
        return seqNo;
    }

    /**
     * Rule Code Number
     * <p>
     * Lineage reference object : SORATRK_SEQ_NO
     * 
     */
    @JsonProperty("seqNo")
    public void setSeqNo(Double seqNo) {
        this.seqNo = seqNo;
    }

    public AttendanceTrackingRule100PostRequest withSeqNo(Double seqNo) {
        this.seqNo = seqNo;
        return this;
    }

    /**
     * Tracking Start Date
     * <p>
     * Lineage reference object : SORATRK_ENTRY_START_DATE
     * 
     */
    @JsonProperty("entryStartDate")
    public Date getEntryStartDate() {
        return entryStartDate;
    }

    /**
     * Tracking Start Date
     * <p>
     * Lineage reference object : SORATRK_ENTRY_START_DATE
     * 
     */
    @JsonProperty("entryStartDate")
    public void setEntryStartDate(Date entryStartDate) {
        this.entryStartDate = entryStartDate;
    }

    public AttendanceTrackingRule100PostRequest withEntryStartDate(Date entryStartDate) {
        this.entryStartDate = entryStartDate;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SORATRK_SUBJ_CODE
     * 
     */
    @JsonProperty("subjCode")
    public String getSubjCode() {
        return subjCode;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SORATRK_SUBJ_CODE
     * 
     */
    @JsonProperty("subjCode")
    public void setSubjCode(String subjCode) {
        this.subjCode = subjCode;
    }

    public AttendanceTrackingRule100PostRequest withSubjCode(String subjCode) {
        this.subjCode = subjCode;
        return this;
    }

    /**
     * Lineage reference object : SORATRK_TRACK_ATTEND_IND
     * 
     */
    @JsonProperty("trackAttendInd")
    public String getTrackAttendInd() {
        return trackAttendInd;
    }

    /**
     * Lineage reference object : SORATRK_TRACK_ATTEND_IND
     * 
     */
    @JsonProperty("trackAttendInd")
    public void setTrackAttendInd(String trackAttendInd) {
        this.trackAttendInd = trackAttendInd;
    }

    public AttendanceTrackingRule100PostRequest withTrackAttendInd(String trackAttendInd) {
        this.trackAttendInd = trackAttendInd;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblckTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblckTermCode")
    public Object getKeyblckTermCode() {
        return keyblckTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblckTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblckTermCode")
    public void setKeyblckTermCode(Object keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
    }

    public AttendanceTrackingRule100PostRequest withKeyblckTermCode(Object keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
        return this;
    }

    /**
     * Tracking End Date
     * <p>
     * Lineage reference object : SORATRK_ENTRY_END_DATE
     * 
     */
    @JsonProperty("entryEndDate")
    public Date getEntryEndDate() {
        return entryEndDate;
    }

    /**
     * Tracking End Date
     * <p>
     * Lineage reference object : SORATRK_ENTRY_END_DATE
     * 
     */
    @JsonProperty("entryEndDate")
    public void setEntryEndDate(Date entryEndDate) {
        this.entryEndDate = entryEndDate;
    }

    public AttendanceTrackingRule100PostRequest withEntryEndDate(Date entryEndDate) {
        this.entryEndDate = entryEndDate;
        return this;
    }

    /**
     * Tracking Unit
     * <p>
     * Lineage reference object : SORATRK_TRACKING_UNIT_CDE
     * 
     */
    @JsonProperty("trackingUnitCde")
    public String getTrackingUnitCde() {
        return trackingUnitCde;
    }

    /**
     * Tracking Unit
     * <p>
     * Lineage reference object : SORATRK_TRACKING_UNIT_CDE
     * 
     */
    @JsonProperty("trackingUnitCde")
    public void setTrackingUnitCde(String trackingUnitCde) {
        this.trackingUnitCde = trackingUnitCde;
    }

    public AttendanceTrackingRule100PostRequest withTrackingUnitCde(String trackingUnitCde) {
        this.trackingUnitCde = trackingUnitCde;
        return this;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : SORATRK_CRN, Lookup lineage reference object : SVQ_SSASECQ
     * 
     */
    @JsonProperty("crn")
    public String getCrn() {
        return crn;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : SORATRK_CRN, Lookup lineage reference object : SVQ_SSASECQ
     * 
     */
    @JsonProperty("crn")
    public void setCrn(String crn) {
        this.crn = crn;
    }

    public AttendanceTrackingRule100PostRequest withCrn(String crn) {
        this.crn = crn;
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

    public AttendanceTrackingRule100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AttendanceTrackingRule100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("crseNumb");
        sb.append('=');
        sb.append(((this.crseNumb == null)?"<null>":this.crseNumb));
        sb.append(',');
        sb.append("attendEnterInd");
        sb.append('=');
        sb.append(((this.attendEnterInd == null)?"<null>":this.attendEnterInd));
        sb.append(',');
        sb.append("ptrmCode");
        sb.append('=');
        sb.append(((this.ptrmCode == null)?"<null>":this.ptrmCode));
        sb.append(',');
        sb.append("seqNo");
        sb.append('=');
        sb.append(((this.seqNo == null)?"<null>":this.seqNo));
        sb.append(',');
        sb.append("entryStartDate");
        sb.append('=');
        sb.append(((this.entryStartDate == null)?"<null>":this.entryStartDate));
        sb.append(',');
        sb.append("subjCode");
        sb.append('=');
        sb.append(((this.subjCode == null)?"<null>":this.subjCode));
        sb.append(',');
        sb.append("trackAttendInd");
        sb.append('=');
        sb.append(((this.trackAttendInd == null)?"<null>":this.trackAttendInd));
        sb.append(',');
        sb.append("keyblckTermCode");
        sb.append('=');
        sb.append(((this.keyblckTermCode == null)?"<null>":this.keyblckTermCode));
        sb.append(',');
        sb.append("entryEndDate");
        sb.append('=');
        sb.append(((this.entryEndDate == null)?"<null>":this.entryEndDate));
        sb.append(',');
        sb.append("trackingUnitCde");
        sb.append('=');
        sb.append(((this.trackingUnitCde == null)?"<null>":this.trackingUnitCde));
        sb.append(',');
        sb.append("crn");
        sb.append('=');
        sb.append(((this.crn == null)?"<null>":this.crn));
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
        result = ((result* 31)+((this.attendEnterInd == null)? 0 :this.attendEnterInd.hashCode()));
        result = ((result* 31)+((this.seqNo == null)? 0 :this.seqNo.hashCode()));
        result = ((result* 31)+((this.entryStartDate == null)? 0 :this.entryStartDate.hashCode()));
        result = ((result* 31)+((this.subjCode == null)? 0 :this.subjCode.hashCode()));
        result = ((result* 31)+((this.trackAttendInd == null)? 0 :this.trackAttendInd.hashCode()));
        result = ((result* 31)+((this.keyblckTermCode == null)? 0 :this.keyblckTermCode.hashCode()));
        result = ((result* 31)+((this.trackingUnitCde == null)? 0 :this.trackingUnitCde.hashCode()));
        result = ((result* 31)+((this.crseNumb == null)? 0 :this.crseNumb.hashCode()));
        result = ((result* 31)+((this.ptrmCode == null)? 0 :this.ptrmCode.hashCode()));
        result = ((result* 31)+((this.entryEndDate == null)? 0 :this.entryEndDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.crn == null)? 0 :this.crn.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AttendanceTrackingRule100PostRequest) == false) {
            return false;
        }
        AttendanceTrackingRule100PostRequest rhs = ((AttendanceTrackingRule100PostRequest) other);
        return (((((((((((((this.attendEnterInd == rhs.attendEnterInd)||((this.attendEnterInd!= null)&&this.attendEnterInd.equals(rhs.attendEnterInd)))&&((this.seqNo == rhs.seqNo)||((this.seqNo!= null)&&this.seqNo.equals(rhs.seqNo))))&&((this.entryStartDate == rhs.entryStartDate)||((this.entryStartDate!= null)&&this.entryStartDate.equals(rhs.entryStartDate))))&&((this.subjCode == rhs.subjCode)||((this.subjCode!= null)&&this.subjCode.equals(rhs.subjCode))))&&((this.trackAttendInd == rhs.trackAttendInd)||((this.trackAttendInd!= null)&&this.trackAttendInd.equals(rhs.trackAttendInd))))&&((this.keyblckTermCode == rhs.keyblckTermCode)||((this.keyblckTermCode!= null)&&this.keyblckTermCode.equals(rhs.keyblckTermCode))))&&((this.trackingUnitCde == rhs.trackingUnitCde)||((this.trackingUnitCde!= null)&&this.trackingUnitCde.equals(rhs.trackingUnitCde))))&&((this.crseNumb == rhs.crseNumb)||((this.crseNumb!= null)&&this.crseNumb.equals(rhs.crseNumb))))&&((this.ptrmCode == rhs.ptrmCode)||((this.ptrmCode!= null)&&this.ptrmCode.equals(rhs.ptrmCode))))&&((this.entryEndDate == rhs.entryEndDate)||((this.entryEndDate!= null)&&this.entryEndDate.equals(rhs.entryEndDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.crn == rhs.crn)||((this.crn!= null)&&this.crn.equals(rhs.crn))));
    }

}
