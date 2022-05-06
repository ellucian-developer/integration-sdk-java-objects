
package com.ellucian.generated.bpapi.ban.term_control_part_of_term_and_web_registration_controls.v1_0_0;

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
    "acadCutoffDate",
    "fgrdWebUpdInd",
    "censusDate",
    "weeks",
    "endDate",
    "sectOverInd",
    "census2Date",
    "refundCutoffDate",
    "waitlstWebDispInd",
    "activityDate",
    "ptrmCode",
    "mgrdWebUpdInd",
    "enrlCutoffDate",
    "dropCutoffDate",
    "incompleteExtDat",
    "startDate",
    "desc"
})
@Generated("jsonschema2pojo")
public class TermControlPartOfTermAndWebRegistrationControls100GetResponse {

    /**
     * Last Date to Record Academic History
     * <p>
     * Lineage reference object : SOBPTRM_ACAD_CUTOFF_DATE
     * 
     */
    @JsonProperty("acadCutoffDate")
    @JsonPropertyDescription("Lineage reference object : SOBPTRM_ACAD_CUTOFF_DATE")
    private Date acadCutoffDate;
    /**
     * Lineage reference object : SOBPTRM_FGRD_WEB_UPD_IND
     * 
     */
    @JsonProperty("fgrdWebUpdInd")
    @JsonPropertyDescription("Lineage reference object : SOBPTRM_FGRD_WEB_UPD_IND")
    private String fgrdWebUpdInd;
    /**
     * Census One Date
     * <p>
     * Lineage reference object : SOBPTRM_CENSUS_DATE
     * (Required)
     * 
     */
    @JsonProperty("censusDate")
    @JsonPropertyDescription("Lineage reference object : SOBPTRM_CENSUS_DATE")
    private Date censusDate;
    /**
     * Number of Weeks
     * <p>
     * Lineage reference object : SOBPTRM_WEEKS
     * (Required)
     * 
     */
    @JsonProperty("weeks")
    @JsonPropertyDescription("Lineage reference object : SOBPTRM_WEEKS")
    private Double weeks;
    /**
     * End Date
     * <p>
     * Lineage reference object : SOBPTRM_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("endDate")
    @JsonPropertyDescription("Lineage reference object : SOBPTRM_END_DATE")
    private Date endDate;
    /**
     * Lineage reference object : SOBPTRM_SECT_OVER_IND
     * 
     */
    @JsonProperty("sectOverInd")
    @JsonPropertyDescription("Lineage reference object : SOBPTRM_SECT_OVER_IND")
    private String sectOverInd;
    /**
     * Census Two Date
     * <p>
     * Lineage reference object : SOBPTRM_CENSUS_2_DATE
     * 
     */
    @JsonProperty("census2Date")
    @JsonPropertyDescription("Lineage reference object : SOBPTRM_CENSUS_2_DATE")
    private Date census2Date;
    /**
     * Last Date for Refund
     * <p>
     * Lineage reference object : SOBPTRM_REFUND_CUTOFF_DATE
     * 
     */
    @JsonProperty("refundCutoffDate")
    @JsonPropertyDescription("Lineage reference object : SOBPTRM_REFUND_CUTOFF_DATE")
    private Date refundCutoffDate;
    /**
     * Lineage reference object : SOBPTRM_WAITLST_WEB_DISP_IND
     * 
     */
    @JsonProperty("waitlstWebDispInd")
    @JsonPropertyDescription("Lineage reference object : SOBPTRM_WAITLST_WEB_DISP_IND")
    private String waitlstWebDispInd;
    /**
     * Lineage reference object : SOBPTRM_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SOBPTRM_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Part of Term
     * <p>
     * Lineage reference object : SOBPTRM_PTRM_CODE, Lookup lineage reference object : stvptrm
     * (Required)
     * 
     */
    @JsonProperty("ptrmCode")
    @JsonPropertyDescription("Lineage reference object : SOBPTRM_PTRM_CODE, Lookup lineage reference object : stvptrm")
    private String ptrmCode;
    /**
     * Lineage reference object : SOBPTRM_MGRD_WEB_UPD_IND
     * 
     */
    @JsonProperty("mgrdWebUpdInd")
    @JsonPropertyDescription("Lineage reference object : SOBPTRM_MGRD_WEB_UPD_IND")
    private String mgrdWebUpdInd;
    /**
     * Last Date to Enroll
     * <p>
     * Lineage reference object : SOBPTRM_ENRL_CUTOFF_DATE
     * 
     */
    @JsonProperty("enrlCutoffDate")
    @JsonPropertyDescription("Lineage reference object : SOBPTRM_ENRL_CUTOFF_DATE")
    private Date enrlCutoffDate;
    /**
     * Last Date to Drop without Penalty
     * <p>
     * Lineage reference object : SOBPTRM_DROP_CUTOFF_DATE
     * 
     */
    @JsonProperty("dropCutoffDate")
    @JsonPropertyDescription("Lineage reference object : SOBPTRM_DROP_CUTOFF_DATE")
    private Date dropCutoffDate;
    /**
     * Incomplete Extension Date
     * <p>
     * Lineage reference object : SOBPTRM_INCOMPLETE_EXT_DATE
     * 
     */
    @JsonProperty("incompleteExtDat")
    @JsonPropertyDescription("Lineage reference object : SOBPTRM_INCOMPLETE_EXT_DATE")
    private Date incompleteExtDat;
    /**
     * Start Date
     * <p>
     * Lineage reference object : SOBPTRM_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("startDate")
    @JsonPropertyDescription("Lineage reference object : SOBPTRM_START_DATE")
    private Date startDate;
    /**
     * Description
     * <p>
     * Lineage reference object : SOBPTRM_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : SOBPTRM_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Last Date to Record Academic History
     * <p>
     * Lineage reference object : SOBPTRM_ACAD_CUTOFF_DATE
     * 
     */
    @JsonProperty("acadCutoffDate")
    public Date getAcadCutoffDate() {
        return acadCutoffDate;
    }

    /**
     * Last Date to Record Academic History
     * <p>
     * Lineage reference object : SOBPTRM_ACAD_CUTOFF_DATE
     * 
     */
    @JsonProperty("acadCutoffDate")
    public void setAcadCutoffDate(Date acadCutoffDate) {
        this.acadCutoffDate = acadCutoffDate;
    }

    public TermControlPartOfTermAndWebRegistrationControls100GetResponse withAcadCutoffDate(Date acadCutoffDate) {
        this.acadCutoffDate = acadCutoffDate;
        return this;
    }

    /**
     * Lineage reference object : SOBPTRM_FGRD_WEB_UPD_IND
     * 
     */
    @JsonProperty("fgrdWebUpdInd")
    public String getFgrdWebUpdInd() {
        return fgrdWebUpdInd;
    }

    /**
     * Lineage reference object : SOBPTRM_FGRD_WEB_UPD_IND
     * 
     */
    @JsonProperty("fgrdWebUpdInd")
    public void setFgrdWebUpdInd(String fgrdWebUpdInd) {
        this.fgrdWebUpdInd = fgrdWebUpdInd;
    }

    public TermControlPartOfTermAndWebRegistrationControls100GetResponse withFgrdWebUpdInd(String fgrdWebUpdInd) {
        this.fgrdWebUpdInd = fgrdWebUpdInd;
        return this;
    }

    /**
     * Census One Date
     * <p>
     * Lineage reference object : SOBPTRM_CENSUS_DATE
     * (Required)
     * 
     */
    @JsonProperty("censusDate")
    public Date getCensusDate() {
        return censusDate;
    }

    /**
     * Census One Date
     * <p>
     * Lineage reference object : SOBPTRM_CENSUS_DATE
     * (Required)
     * 
     */
    @JsonProperty("censusDate")
    public void setCensusDate(Date censusDate) {
        this.censusDate = censusDate;
    }

    public TermControlPartOfTermAndWebRegistrationControls100GetResponse withCensusDate(Date censusDate) {
        this.censusDate = censusDate;
        return this;
    }

    /**
     * Number of Weeks
     * <p>
     * Lineage reference object : SOBPTRM_WEEKS
     * (Required)
     * 
     */
    @JsonProperty("weeks")
    public Double getWeeks() {
        return weeks;
    }

    /**
     * Number of Weeks
     * <p>
     * Lineage reference object : SOBPTRM_WEEKS
     * (Required)
     * 
     */
    @JsonProperty("weeks")
    public void setWeeks(Double weeks) {
        this.weeks = weeks;
    }

    public TermControlPartOfTermAndWebRegistrationControls100GetResponse withWeeks(Double weeks) {
        this.weeks = weeks;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SOBPTRM_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("endDate")
    public Date getEndDate() {
        return endDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SOBPTRM_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("endDate")
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public TermControlPartOfTermAndWebRegistrationControls100GetResponse withEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Lineage reference object : SOBPTRM_SECT_OVER_IND
     * 
     */
    @JsonProperty("sectOverInd")
    public String getSectOverInd() {
        return sectOverInd;
    }

    /**
     * Lineage reference object : SOBPTRM_SECT_OVER_IND
     * 
     */
    @JsonProperty("sectOverInd")
    public void setSectOverInd(String sectOverInd) {
        this.sectOverInd = sectOverInd;
    }

    public TermControlPartOfTermAndWebRegistrationControls100GetResponse withSectOverInd(String sectOverInd) {
        this.sectOverInd = sectOverInd;
        return this;
    }

    /**
     * Census Two Date
     * <p>
     * Lineage reference object : SOBPTRM_CENSUS_2_DATE
     * 
     */
    @JsonProperty("census2Date")
    public Date getCensus2Date() {
        return census2Date;
    }

    /**
     * Census Two Date
     * <p>
     * Lineage reference object : SOBPTRM_CENSUS_2_DATE
     * 
     */
    @JsonProperty("census2Date")
    public void setCensus2Date(Date census2Date) {
        this.census2Date = census2Date;
    }

    public TermControlPartOfTermAndWebRegistrationControls100GetResponse withCensus2Date(Date census2Date) {
        this.census2Date = census2Date;
        return this;
    }

    /**
     * Last Date for Refund
     * <p>
     * Lineage reference object : SOBPTRM_REFUND_CUTOFF_DATE
     * 
     */
    @JsonProperty("refundCutoffDate")
    public Date getRefundCutoffDate() {
        return refundCutoffDate;
    }

    /**
     * Last Date for Refund
     * <p>
     * Lineage reference object : SOBPTRM_REFUND_CUTOFF_DATE
     * 
     */
    @JsonProperty("refundCutoffDate")
    public void setRefundCutoffDate(Date refundCutoffDate) {
        this.refundCutoffDate = refundCutoffDate;
    }

    public TermControlPartOfTermAndWebRegistrationControls100GetResponse withRefundCutoffDate(Date refundCutoffDate) {
        this.refundCutoffDate = refundCutoffDate;
        return this;
    }

    /**
     * Lineage reference object : SOBPTRM_WAITLST_WEB_DISP_IND
     * 
     */
    @JsonProperty("waitlstWebDispInd")
    public String getWaitlstWebDispInd() {
        return waitlstWebDispInd;
    }

    /**
     * Lineage reference object : SOBPTRM_WAITLST_WEB_DISP_IND
     * 
     */
    @JsonProperty("waitlstWebDispInd")
    public void setWaitlstWebDispInd(String waitlstWebDispInd) {
        this.waitlstWebDispInd = waitlstWebDispInd;
    }

    public TermControlPartOfTermAndWebRegistrationControls100GetResponse withWaitlstWebDispInd(String waitlstWebDispInd) {
        this.waitlstWebDispInd = waitlstWebDispInd;
        return this;
    }

    /**
     * Lineage reference object : SOBPTRM_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SOBPTRM_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public TermControlPartOfTermAndWebRegistrationControls100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Part of Term
     * <p>
     * Lineage reference object : SOBPTRM_PTRM_CODE, Lookup lineage reference object : stvptrm
     * (Required)
     * 
     */
    @JsonProperty("ptrmCode")
    public String getPtrmCode() {
        return ptrmCode;
    }

    /**
     * Part of Term
     * <p>
     * Lineage reference object : SOBPTRM_PTRM_CODE, Lookup lineage reference object : stvptrm
     * (Required)
     * 
     */
    @JsonProperty("ptrmCode")
    public void setPtrmCode(String ptrmCode) {
        this.ptrmCode = ptrmCode;
    }

    public TermControlPartOfTermAndWebRegistrationControls100GetResponse withPtrmCode(String ptrmCode) {
        this.ptrmCode = ptrmCode;
        return this;
    }

    /**
     * Lineage reference object : SOBPTRM_MGRD_WEB_UPD_IND
     * 
     */
    @JsonProperty("mgrdWebUpdInd")
    public String getMgrdWebUpdInd() {
        return mgrdWebUpdInd;
    }

    /**
     * Lineage reference object : SOBPTRM_MGRD_WEB_UPD_IND
     * 
     */
    @JsonProperty("mgrdWebUpdInd")
    public void setMgrdWebUpdInd(String mgrdWebUpdInd) {
        this.mgrdWebUpdInd = mgrdWebUpdInd;
    }

    public TermControlPartOfTermAndWebRegistrationControls100GetResponse withMgrdWebUpdInd(String mgrdWebUpdInd) {
        this.mgrdWebUpdInd = mgrdWebUpdInd;
        return this;
    }

    /**
     * Last Date to Enroll
     * <p>
     * Lineage reference object : SOBPTRM_ENRL_CUTOFF_DATE
     * 
     */
    @JsonProperty("enrlCutoffDate")
    public Date getEnrlCutoffDate() {
        return enrlCutoffDate;
    }

    /**
     * Last Date to Enroll
     * <p>
     * Lineage reference object : SOBPTRM_ENRL_CUTOFF_DATE
     * 
     */
    @JsonProperty("enrlCutoffDate")
    public void setEnrlCutoffDate(Date enrlCutoffDate) {
        this.enrlCutoffDate = enrlCutoffDate;
    }

    public TermControlPartOfTermAndWebRegistrationControls100GetResponse withEnrlCutoffDate(Date enrlCutoffDate) {
        this.enrlCutoffDate = enrlCutoffDate;
        return this;
    }

    /**
     * Last Date to Drop without Penalty
     * <p>
     * Lineage reference object : SOBPTRM_DROP_CUTOFF_DATE
     * 
     */
    @JsonProperty("dropCutoffDate")
    public Date getDropCutoffDate() {
        return dropCutoffDate;
    }

    /**
     * Last Date to Drop without Penalty
     * <p>
     * Lineage reference object : SOBPTRM_DROP_CUTOFF_DATE
     * 
     */
    @JsonProperty("dropCutoffDate")
    public void setDropCutoffDate(Date dropCutoffDate) {
        this.dropCutoffDate = dropCutoffDate;
    }

    public TermControlPartOfTermAndWebRegistrationControls100GetResponse withDropCutoffDate(Date dropCutoffDate) {
        this.dropCutoffDate = dropCutoffDate;
        return this;
    }

    /**
     * Incomplete Extension Date
     * <p>
     * Lineage reference object : SOBPTRM_INCOMPLETE_EXT_DATE
     * 
     */
    @JsonProperty("incompleteExtDat")
    public Date getIncompleteExtDat() {
        return incompleteExtDat;
    }

    /**
     * Incomplete Extension Date
     * <p>
     * Lineage reference object : SOBPTRM_INCOMPLETE_EXT_DATE
     * 
     */
    @JsonProperty("incompleteExtDat")
    public void setIncompleteExtDat(Date incompleteExtDat) {
        this.incompleteExtDat = incompleteExtDat;
    }

    public TermControlPartOfTermAndWebRegistrationControls100GetResponse withIncompleteExtDat(Date incompleteExtDat) {
        this.incompleteExtDat = incompleteExtDat;
        return this;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : SOBPTRM_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("startDate")
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : SOBPTRM_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("startDate")
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public TermControlPartOfTermAndWebRegistrationControls100GetResponse withStartDate(Date startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : SOBPTRM_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : SOBPTRM_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public TermControlPartOfTermAndWebRegistrationControls100GetResponse withDesc(String desc) {
        this.desc = desc;
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

    public TermControlPartOfTermAndWebRegistrationControls100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TermControlPartOfTermAndWebRegistrationControls100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("acadCutoffDate");
        sb.append('=');
        sb.append(((this.acadCutoffDate == null)?"<null>":this.acadCutoffDate));
        sb.append(',');
        sb.append("fgrdWebUpdInd");
        sb.append('=');
        sb.append(((this.fgrdWebUpdInd == null)?"<null>":this.fgrdWebUpdInd));
        sb.append(',');
        sb.append("censusDate");
        sb.append('=');
        sb.append(((this.censusDate == null)?"<null>":this.censusDate));
        sb.append(',');
        sb.append("weeks");
        sb.append('=');
        sb.append(((this.weeks == null)?"<null>":this.weeks));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("sectOverInd");
        sb.append('=');
        sb.append(((this.sectOverInd == null)?"<null>":this.sectOverInd));
        sb.append(',');
        sb.append("census2Date");
        sb.append('=');
        sb.append(((this.census2Date == null)?"<null>":this.census2Date));
        sb.append(',');
        sb.append("refundCutoffDate");
        sb.append('=');
        sb.append(((this.refundCutoffDate == null)?"<null>":this.refundCutoffDate));
        sb.append(',');
        sb.append("waitlstWebDispInd");
        sb.append('=');
        sb.append(((this.waitlstWebDispInd == null)?"<null>":this.waitlstWebDispInd));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("ptrmCode");
        sb.append('=');
        sb.append(((this.ptrmCode == null)?"<null>":this.ptrmCode));
        sb.append(',');
        sb.append("mgrdWebUpdInd");
        sb.append('=');
        sb.append(((this.mgrdWebUpdInd == null)?"<null>":this.mgrdWebUpdInd));
        sb.append(',');
        sb.append("enrlCutoffDate");
        sb.append('=');
        sb.append(((this.enrlCutoffDate == null)?"<null>":this.enrlCutoffDate));
        sb.append(',');
        sb.append("dropCutoffDate");
        sb.append('=');
        sb.append(((this.dropCutoffDate == null)?"<null>":this.dropCutoffDate));
        sb.append(',');
        sb.append("incompleteExtDat");
        sb.append('=');
        sb.append(((this.incompleteExtDat == null)?"<null>":this.incompleteExtDat));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
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
        result = ((result* 31)+((this.acadCutoffDate == null)? 0 :this.acadCutoffDate.hashCode()));
        result = ((result* 31)+((this.fgrdWebUpdInd == null)? 0 :this.fgrdWebUpdInd.hashCode()));
        result = ((result* 31)+((this.censusDate == null)? 0 :this.censusDate.hashCode()));
        result = ((result* 31)+((this.weeks == null)? 0 :this.weeks.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.sectOverInd == null)? 0 :this.sectOverInd.hashCode()));
        result = ((result* 31)+((this.census2Date == null)? 0 :this.census2Date.hashCode()));
        result = ((result* 31)+((this.refundCutoffDate == null)? 0 :this.refundCutoffDate.hashCode()));
        result = ((result* 31)+((this.waitlstWebDispInd == null)? 0 :this.waitlstWebDispInd.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.ptrmCode == null)? 0 :this.ptrmCode.hashCode()));
        result = ((result* 31)+((this.mgrdWebUpdInd == null)? 0 :this.mgrdWebUpdInd.hashCode()));
        result = ((result* 31)+((this.enrlCutoffDate == null)? 0 :this.enrlCutoffDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.dropCutoffDate == null)? 0 :this.dropCutoffDate.hashCode()));
        result = ((result* 31)+((this.incompleteExtDat == null)? 0 :this.incompleteExtDat.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TermControlPartOfTermAndWebRegistrationControls100GetResponse) == false) {
            return false;
        }
        TermControlPartOfTermAndWebRegistrationControls100GetResponse rhs = ((TermControlPartOfTermAndWebRegistrationControls100GetResponse) other);
        return (((((((((((((((((((this.acadCutoffDate == rhs.acadCutoffDate)||((this.acadCutoffDate!= null)&&this.acadCutoffDate.equals(rhs.acadCutoffDate)))&&((this.fgrdWebUpdInd == rhs.fgrdWebUpdInd)||((this.fgrdWebUpdInd!= null)&&this.fgrdWebUpdInd.equals(rhs.fgrdWebUpdInd))))&&((this.censusDate == rhs.censusDate)||((this.censusDate!= null)&&this.censusDate.equals(rhs.censusDate))))&&((this.weeks == rhs.weeks)||((this.weeks!= null)&&this.weeks.equals(rhs.weeks))))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.sectOverInd == rhs.sectOverInd)||((this.sectOverInd!= null)&&this.sectOverInd.equals(rhs.sectOverInd))))&&((this.census2Date == rhs.census2Date)||((this.census2Date!= null)&&this.census2Date.equals(rhs.census2Date))))&&((this.refundCutoffDate == rhs.refundCutoffDate)||((this.refundCutoffDate!= null)&&this.refundCutoffDate.equals(rhs.refundCutoffDate))))&&((this.waitlstWebDispInd == rhs.waitlstWebDispInd)||((this.waitlstWebDispInd!= null)&&this.waitlstWebDispInd.equals(rhs.waitlstWebDispInd))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.ptrmCode == rhs.ptrmCode)||((this.ptrmCode!= null)&&this.ptrmCode.equals(rhs.ptrmCode))))&&((this.mgrdWebUpdInd == rhs.mgrdWebUpdInd)||((this.mgrdWebUpdInd!= null)&&this.mgrdWebUpdInd.equals(rhs.mgrdWebUpdInd))))&&((this.enrlCutoffDate == rhs.enrlCutoffDate)||((this.enrlCutoffDate!= null)&&this.enrlCutoffDate.equals(rhs.enrlCutoffDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.dropCutoffDate == rhs.dropCutoffDate)||((this.dropCutoffDate!= null)&&this.dropCutoffDate.equals(rhs.dropCutoffDate))))&&((this.incompleteExtDat == rhs.incompleteExtDat)||((this.incompleteExtDat!= null)&&this.incompleteExtDat.equals(rhs.incompleteExtDat))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
