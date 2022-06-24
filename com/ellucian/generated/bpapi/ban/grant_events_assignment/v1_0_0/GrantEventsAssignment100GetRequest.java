
package com.ellucian.generated.bpapi.ban.grant_events_assignment.v1_0_0;

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
    "freqInd",
    "statusDate",
    "periodTo",
    "code",
    "seqNum",
    "respUserIdDesc",
    "keyblckAgencyCode",
    "dueDate",
    "evntCode",
    "title",
    "dateFrom",
    "numOfDaysReminder",
    "numOfDays",
    "respUserIdDef",
    "statusInd",
    "dateTo",
    "begDateInd",
    "displayGrntCode",
    "alternateEvntDesc",
    "bfrmCode",
    "responsibleUserId",
    "pmtMethodTypeInd"
})
@Generated("jsonschema2pojo")
public class GrantEventsAssignment100GetRequest {

    /**
     * Frbevnp Freq Ind
     * <p>
     * Lineage reference object : FRBEVNG_FREQ_IND
     * 
     */
    @JsonProperty("freqInd")
    @JsonPropertyDescription("Lineage reference object : FRBEVNG_FREQ_IND")
    private String freqInd;
    /**
     * Frrevnp Status Date
     * <p>
     * Lineage reference object : FRREVNG_STATUS_DATE
     * 
     */
    @JsonProperty("statusDate")
    @JsonPropertyDescription("Lineage reference object : FRREVNG_STATUS_DATE")
    private Date statusDate;
    /**
     * Frbevnp Date From
     * <p>
     * 
     * 
     */
    @JsonProperty("periodTo")
    private Date periodTo;
    /**
     * Frbgrnt Code
     * <p>
     * Lineage reference object : FRBGRNT_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_CODE")
    private String code;
    /**
     * Frrevnp Seq Num
     * <p>
     * Lineage reference object : FRREVNG_SEQ_NUM
     * 
     */
    @JsonProperty("seqNum")
    @JsonPropertyDescription("Lineage reference object : FRREVNG_SEQ_NUM")
    private Double seqNum;
    @JsonProperty("respUserIdDesc")
    private String respUserIdDesc;
    /**
     * Agency
     * <p>
     * Lineage reference object : keyblckAgencyCode
     * 
     */
    @JsonProperty("keyblckAgencyCode")
    @JsonPropertyDescription("Lineage reference object : keyblckAgencyCode")
    private String keyblckAgencyCode;
    /**
     * Frrevnp Due Date
     * <p>
     * Lineage reference object : FRREVNG_DUE_DATE
     * 
     */
    @JsonProperty("dueDate")
    @JsonPropertyDescription("Lineage reference object : FRREVNG_DUE_DATE")
    private Date dueDate;
    /**
     * Frbevnp Evnt Code
     * <p>
     * Lineage reference object : FRBEVNG_EVNT_CODE
     * (Required)
     * 
     */
    @JsonProperty("evntCode")
    @JsonPropertyDescription("Lineage reference object : FRBEVNG_EVNT_CODE")
    private String evntCode;
    /**
     * Frbgrnt Title
     * <p>
     * Lineage reference object : FRBGRNT_TITLE
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_TITLE")
    private String title;
    /**
     * Frbevnp Date From
     * <p>
     * Lineage reference object : FRBEVNG_DATE_FROM
     * 
     */
    @JsonProperty("dateFrom")
    @JsonPropertyDescription("Lineage reference object : FRBEVNG_DATE_FROM")
    private Date dateFrom;
    /**
     * Frbevnp Num Of Days Reminder
     * <p>
     * Lineage reference object : FRBEVNG_NUM_OF_DAYS_REMINDER
     * 
     */
    @JsonProperty("numOfDaysReminder")
    @JsonPropertyDescription("Lineage reference object : FRBEVNG_NUM_OF_DAYS_REMINDER")
    private Double numOfDaysReminder;
    /**
     * Frbevnp Num Of Days
     * <p>
     * Lineage reference object : FRBEVNG_NUM_OF_DAYS
     * 
     */
    @JsonProperty("numOfDays")
    @JsonPropertyDescription("Lineage reference object : FRBEVNG_NUM_OF_DAYS")
    private Double numOfDays;
    /**
     * Default Responsible User ID
     * <p>
     * 
     * 
     */
    @JsonProperty("respUserIdDef")
    private String respUserIdDef;
    /**
     * Frrevnp Status Ind
     * <p>
     * Lineage reference object : FRREVNG_STATUS_IND
     * (Required)
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : FRREVNG_STATUS_IND")
    private String statusInd;
    /**
     * Frbevnp Date To
     * <p>
     * Lineage reference object : FRBEVNG_DATE_TO
     * 
     */
    @JsonProperty("dateTo")
    @JsonPropertyDescription("Lineage reference object : FRBEVNG_DATE_TO")
    private Date dateTo;
    /**
     * Frbevnp Beg Date Ind
     * <p>
     * Lineage reference object : FRBEVNG_BEG_DATE_IND
     * 
     */
    @JsonProperty("begDateInd")
    @JsonPropertyDescription("Lineage reference object : FRBEVNG_BEG_DATE_IND")
    private String begDateInd;
    /**
     * Grant Code
     * <p>
     * Lineage reference object : displayGrntCode
     * 
     */
    @JsonProperty("displayGrntCode")
    @JsonPropertyDescription("Lineage reference object : displayGrntCode")
    private String displayGrntCode;
    /**
     * Alternate Description
     * <p>
     * Lineage reference object : FRBEVNG_ALTERNATE_EVNT_DESC
     * 
     */
    @JsonProperty("alternateEvntDesc")
    @JsonPropertyDescription("Lineage reference object : FRBEVNG_ALTERNATE_EVNT_DESC")
    private String alternateEvntDesc;
    /**
     * Bill Format
     * <p>
     * Lineage reference object : FRBEVNG_BFRM_CODE
     * 
     */
    @JsonProperty("bfrmCode")
    @JsonPropertyDescription("Lineage reference object : FRBEVNG_BFRM_CODE")
    private String bfrmCode;
    /**
     * Frrevnp Responsible User Id
     * <p>
     * Lineage reference object : FRREVNG_RESPONSIBLE_USER_ID
     * 
     */
    @JsonProperty("responsibleUserId")
    @JsonPropertyDescription("Lineage reference object : FRREVNG_RESPONSIBLE_USER_ID")
    private String responsibleUserId;
    /**
     * Payment Method Type Ind
     * <p>
     * Lineage reference object : FRBEVNG_PMT_METHOD_TYPE_IND
     * 
     */
    @JsonProperty("pmtMethodTypeInd")
    @JsonPropertyDescription("Lineage reference object : FRBEVNG_PMT_METHOD_TYPE_IND")
    private String pmtMethodTypeInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Frbevnp Freq Ind
     * <p>
     * Lineage reference object : FRBEVNG_FREQ_IND
     * 
     */
    @JsonProperty("freqInd")
    public String getFreqInd() {
        return freqInd;
    }

    /**
     * Frbevnp Freq Ind
     * <p>
     * Lineage reference object : FRBEVNG_FREQ_IND
     * 
     */
    @JsonProperty("freqInd")
    public void setFreqInd(String freqInd) {
        this.freqInd = freqInd;
    }

    public GrantEventsAssignment100GetRequest withFreqInd(String freqInd) {
        this.freqInd = freqInd;
        return this;
    }

    /**
     * Frrevnp Status Date
     * <p>
     * Lineage reference object : FRREVNG_STATUS_DATE
     * 
     */
    @JsonProperty("statusDate")
    public Date getStatusDate() {
        return statusDate;
    }

    /**
     * Frrevnp Status Date
     * <p>
     * Lineage reference object : FRREVNG_STATUS_DATE
     * 
     */
    @JsonProperty("statusDate")
    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
    }

    public GrantEventsAssignment100GetRequest withStatusDate(Date statusDate) {
        this.statusDate = statusDate;
        return this;
    }

    /**
     * Frbevnp Date From
     * <p>
     * 
     * 
     */
    @JsonProperty("periodTo")
    public Date getPeriodTo() {
        return periodTo;
    }

    /**
     * Frbevnp Date From
     * <p>
     * 
     * 
     */
    @JsonProperty("periodTo")
    public void setPeriodTo(Date periodTo) {
        this.periodTo = periodTo;
    }

    public GrantEventsAssignment100GetRequest withPeriodTo(Date periodTo) {
        this.periodTo = periodTo;
        return this;
    }

    /**
     * Frbgrnt Code
     * <p>
     * Lineage reference object : FRBGRNT_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Frbgrnt Code
     * <p>
     * Lineage reference object : FRBGRNT_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public GrantEventsAssignment100GetRequest withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Frrevnp Seq Num
     * <p>
     * Lineage reference object : FRREVNG_SEQ_NUM
     * 
     */
    @JsonProperty("seqNum")
    public Double getSeqNum() {
        return seqNum;
    }

    /**
     * Frrevnp Seq Num
     * <p>
     * Lineage reference object : FRREVNG_SEQ_NUM
     * 
     */
    @JsonProperty("seqNum")
    public void setSeqNum(Double seqNum) {
        this.seqNum = seqNum;
    }

    public GrantEventsAssignment100GetRequest withSeqNum(Double seqNum) {
        this.seqNum = seqNum;
        return this;
    }

    @JsonProperty("respUserIdDesc")
    public String getRespUserIdDesc() {
        return respUserIdDesc;
    }

    @JsonProperty("respUserIdDesc")
    public void setRespUserIdDesc(String respUserIdDesc) {
        this.respUserIdDesc = respUserIdDesc;
    }

    public GrantEventsAssignment100GetRequest withRespUserIdDesc(String respUserIdDesc) {
        this.respUserIdDesc = respUserIdDesc;
        return this;
    }

    /**
     * Agency
     * <p>
     * Lineage reference object : keyblckAgencyCode
     * 
     */
    @JsonProperty("keyblckAgencyCode")
    public String getKeyblckAgencyCode() {
        return keyblckAgencyCode;
    }

    /**
     * Agency
     * <p>
     * Lineage reference object : keyblckAgencyCode
     * 
     */
    @JsonProperty("keyblckAgencyCode")
    public void setKeyblckAgencyCode(String keyblckAgencyCode) {
        this.keyblckAgencyCode = keyblckAgencyCode;
    }

    public GrantEventsAssignment100GetRequest withKeyblckAgencyCode(String keyblckAgencyCode) {
        this.keyblckAgencyCode = keyblckAgencyCode;
        return this;
    }

    /**
     * Frrevnp Due Date
     * <p>
     * Lineage reference object : FRREVNG_DUE_DATE
     * 
     */
    @JsonProperty("dueDate")
    public Date getDueDate() {
        return dueDate;
    }

    /**
     * Frrevnp Due Date
     * <p>
     * Lineage reference object : FRREVNG_DUE_DATE
     * 
     */
    @JsonProperty("dueDate")
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public GrantEventsAssignment100GetRequest withDueDate(Date dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    /**
     * Frbevnp Evnt Code
     * <p>
     * Lineage reference object : FRBEVNG_EVNT_CODE
     * (Required)
     * 
     */
    @JsonProperty("evntCode")
    public String getEvntCode() {
        return evntCode;
    }

    /**
     * Frbevnp Evnt Code
     * <p>
     * Lineage reference object : FRBEVNG_EVNT_CODE
     * (Required)
     * 
     */
    @JsonProperty("evntCode")
    public void setEvntCode(String evntCode) {
        this.evntCode = evntCode;
    }

    public GrantEventsAssignment100GetRequest withEvntCode(String evntCode) {
        this.evntCode = evntCode;
        return this;
    }

    /**
     * Frbgrnt Title
     * <p>
     * Lineage reference object : FRBGRNT_TITLE
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Frbgrnt Title
     * <p>
     * Lineage reference object : FRBGRNT_TITLE
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public GrantEventsAssignment100GetRequest withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Frbevnp Date From
     * <p>
     * Lineage reference object : FRBEVNG_DATE_FROM
     * 
     */
    @JsonProperty("dateFrom")
    public Date getDateFrom() {
        return dateFrom;
    }

    /**
     * Frbevnp Date From
     * <p>
     * Lineage reference object : FRBEVNG_DATE_FROM
     * 
     */
    @JsonProperty("dateFrom")
    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public GrantEventsAssignment100GetRequest withDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
        return this;
    }

    /**
     * Frbevnp Num Of Days Reminder
     * <p>
     * Lineage reference object : FRBEVNG_NUM_OF_DAYS_REMINDER
     * 
     */
    @JsonProperty("numOfDaysReminder")
    public Double getNumOfDaysReminder() {
        return numOfDaysReminder;
    }

    /**
     * Frbevnp Num Of Days Reminder
     * <p>
     * Lineage reference object : FRBEVNG_NUM_OF_DAYS_REMINDER
     * 
     */
    @JsonProperty("numOfDaysReminder")
    public void setNumOfDaysReminder(Double numOfDaysReminder) {
        this.numOfDaysReminder = numOfDaysReminder;
    }

    public GrantEventsAssignment100GetRequest withNumOfDaysReminder(Double numOfDaysReminder) {
        this.numOfDaysReminder = numOfDaysReminder;
        return this;
    }

    /**
     * Frbevnp Num Of Days
     * <p>
     * Lineage reference object : FRBEVNG_NUM_OF_DAYS
     * 
     */
    @JsonProperty("numOfDays")
    public Double getNumOfDays() {
        return numOfDays;
    }

    /**
     * Frbevnp Num Of Days
     * <p>
     * Lineage reference object : FRBEVNG_NUM_OF_DAYS
     * 
     */
    @JsonProperty("numOfDays")
    public void setNumOfDays(Double numOfDays) {
        this.numOfDays = numOfDays;
    }

    public GrantEventsAssignment100GetRequest withNumOfDays(Double numOfDays) {
        this.numOfDays = numOfDays;
        return this;
    }

    /**
     * Default Responsible User ID
     * <p>
     * 
     * 
     */
    @JsonProperty("respUserIdDef")
    public String getRespUserIdDef() {
        return respUserIdDef;
    }

    /**
     * Default Responsible User ID
     * <p>
     * 
     * 
     */
    @JsonProperty("respUserIdDef")
    public void setRespUserIdDef(String respUserIdDef) {
        this.respUserIdDef = respUserIdDef;
    }

    public GrantEventsAssignment100GetRequest withRespUserIdDef(String respUserIdDef) {
        this.respUserIdDef = respUserIdDef;
        return this;
    }

    /**
     * Frrevnp Status Ind
     * <p>
     * Lineage reference object : FRREVNG_STATUS_IND
     * (Required)
     * 
     */
    @JsonProperty("statusInd")
    public String getStatusInd() {
        return statusInd;
    }

    /**
     * Frrevnp Status Ind
     * <p>
     * Lineage reference object : FRREVNG_STATUS_IND
     * (Required)
     * 
     */
    @JsonProperty("statusInd")
    public void setStatusInd(String statusInd) {
        this.statusInd = statusInd;
    }

    public GrantEventsAssignment100GetRequest withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * Frbevnp Date To
     * <p>
     * Lineage reference object : FRBEVNG_DATE_TO
     * 
     */
    @JsonProperty("dateTo")
    public Date getDateTo() {
        return dateTo;
    }

    /**
     * Frbevnp Date To
     * <p>
     * Lineage reference object : FRBEVNG_DATE_TO
     * 
     */
    @JsonProperty("dateTo")
    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public GrantEventsAssignment100GetRequest withDateTo(Date dateTo) {
        this.dateTo = dateTo;
        return this;
    }

    /**
     * Frbevnp Beg Date Ind
     * <p>
     * Lineage reference object : FRBEVNG_BEG_DATE_IND
     * 
     */
    @JsonProperty("begDateInd")
    public String getBegDateInd() {
        return begDateInd;
    }

    /**
     * Frbevnp Beg Date Ind
     * <p>
     * Lineage reference object : FRBEVNG_BEG_DATE_IND
     * 
     */
    @JsonProperty("begDateInd")
    public void setBegDateInd(String begDateInd) {
        this.begDateInd = begDateInd;
    }

    public GrantEventsAssignment100GetRequest withBegDateInd(String begDateInd) {
        this.begDateInd = begDateInd;
        return this;
    }

    /**
     * Grant Code
     * <p>
     * Lineage reference object : displayGrntCode
     * 
     */
    @JsonProperty("displayGrntCode")
    public String getDisplayGrntCode() {
        return displayGrntCode;
    }

    /**
     * Grant Code
     * <p>
     * Lineage reference object : displayGrntCode
     * 
     */
    @JsonProperty("displayGrntCode")
    public void setDisplayGrntCode(String displayGrntCode) {
        this.displayGrntCode = displayGrntCode;
    }

    public GrantEventsAssignment100GetRequest withDisplayGrntCode(String displayGrntCode) {
        this.displayGrntCode = displayGrntCode;
        return this;
    }

    /**
     * Alternate Description
     * <p>
     * Lineage reference object : FRBEVNG_ALTERNATE_EVNT_DESC
     * 
     */
    @JsonProperty("alternateEvntDesc")
    public String getAlternateEvntDesc() {
        return alternateEvntDesc;
    }

    /**
     * Alternate Description
     * <p>
     * Lineage reference object : FRBEVNG_ALTERNATE_EVNT_DESC
     * 
     */
    @JsonProperty("alternateEvntDesc")
    public void setAlternateEvntDesc(String alternateEvntDesc) {
        this.alternateEvntDesc = alternateEvntDesc;
    }

    public GrantEventsAssignment100GetRequest withAlternateEvntDesc(String alternateEvntDesc) {
        this.alternateEvntDesc = alternateEvntDesc;
        return this;
    }

    /**
     * Bill Format
     * <p>
     * Lineage reference object : FRBEVNG_BFRM_CODE
     * 
     */
    @JsonProperty("bfrmCode")
    public String getBfrmCode() {
        return bfrmCode;
    }

    /**
     * Bill Format
     * <p>
     * Lineage reference object : FRBEVNG_BFRM_CODE
     * 
     */
    @JsonProperty("bfrmCode")
    public void setBfrmCode(String bfrmCode) {
        this.bfrmCode = bfrmCode;
    }

    public GrantEventsAssignment100GetRequest withBfrmCode(String bfrmCode) {
        this.bfrmCode = bfrmCode;
        return this;
    }

    /**
     * Frrevnp Responsible User Id
     * <p>
     * Lineage reference object : FRREVNG_RESPONSIBLE_USER_ID
     * 
     */
    @JsonProperty("responsibleUserId")
    public String getResponsibleUserId() {
        return responsibleUserId;
    }

    /**
     * Frrevnp Responsible User Id
     * <p>
     * Lineage reference object : FRREVNG_RESPONSIBLE_USER_ID
     * 
     */
    @JsonProperty("responsibleUserId")
    public void setResponsibleUserId(String responsibleUserId) {
        this.responsibleUserId = responsibleUserId;
    }

    public GrantEventsAssignment100GetRequest withResponsibleUserId(String responsibleUserId) {
        this.responsibleUserId = responsibleUserId;
        return this;
    }

    /**
     * Payment Method Type Ind
     * <p>
     * Lineage reference object : FRBEVNG_PMT_METHOD_TYPE_IND
     * 
     */
    @JsonProperty("pmtMethodTypeInd")
    public String getPmtMethodTypeInd() {
        return pmtMethodTypeInd;
    }

    /**
     * Payment Method Type Ind
     * <p>
     * Lineage reference object : FRBEVNG_PMT_METHOD_TYPE_IND
     * 
     */
    @JsonProperty("pmtMethodTypeInd")
    public void setPmtMethodTypeInd(String pmtMethodTypeInd) {
        this.pmtMethodTypeInd = pmtMethodTypeInd;
    }

    public GrantEventsAssignment100GetRequest withPmtMethodTypeInd(String pmtMethodTypeInd) {
        this.pmtMethodTypeInd = pmtMethodTypeInd;
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

    public GrantEventsAssignment100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GrantEventsAssignment100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("freqInd");
        sb.append('=');
        sb.append(((this.freqInd == null)?"<null>":this.freqInd));
        sb.append(',');
        sb.append("statusDate");
        sb.append('=');
        sb.append(((this.statusDate == null)?"<null>":this.statusDate));
        sb.append(',');
        sb.append("periodTo");
        sb.append('=');
        sb.append(((this.periodTo == null)?"<null>":this.periodTo));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("seqNum");
        sb.append('=');
        sb.append(((this.seqNum == null)?"<null>":this.seqNum));
        sb.append(',');
        sb.append("respUserIdDesc");
        sb.append('=');
        sb.append(((this.respUserIdDesc == null)?"<null>":this.respUserIdDesc));
        sb.append(',');
        sb.append("keyblckAgencyCode");
        sb.append('=');
        sb.append(((this.keyblckAgencyCode == null)?"<null>":this.keyblckAgencyCode));
        sb.append(',');
        sb.append("dueDate");
        sb.append('=');
        sb.append(((this.dueDate == null)?"<null>":this.dueDate));
        sb.append(',');
        sb.append("evntCode");
        sb.append('=');
        sb.append(((this.evntCode == null)?"<null>":this.evntCode));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("dateFrom");
        sb.append('=');
        sb.append(((this.dateFrom == null)?"<null>":this.dateFrom));
        sb.append(',');
        sb.append("numOfDaysReminder");
        sb.append('=');
        sb.append(((this.numOfDaysReminder == null)?"<null>":this.numOfDaysReminder));
        sb.append(',');
        sb.append("numOfDays");
        sb.append('=');
        sb.append(((this.numOfDays == null)?"<null>":this.numOfDays));
        sb.append(',');
        sb.append("respUserIdDef");
        sb.append('=');
        sb.append(((this.respUserIdDef == null)?"<null>":this.respUserIdDef));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("dateTo");
        sb.append('=');
        sb.append(((this.dateTo == null)?"<null>":this.dateTo));
        sb.append(',');
        sb.append("begDateInd");
        sb.append('=');
        sb.append(((this.begDateInd == null)?"<null>":this.begDateInd));
        sb.append(',');
        sb.append("displayGrntCode");
        sb.append('=');
        sb.append(((this.displayGrntCode == null)?"<null>":this.displayGrntCode));
        sb.append(',');
        sb.append("alternateEvntDesc");
        sb.append('=');
        sb.append(((this.alternateEvntDesc == null)?"<null>":this.alternateEvntDesc));
        sb.append(',');
        sb.append("bfrmCode");
        sb.append('=');
        sb.append(((this.bfrmCode == null)?"<null>":this.bfrmCode));
        sb.append(',');
        sb.append("responsibleUserId");
        sb.append('=');
        sb.append(((this.responsibleUserId == null)?"<null>":this.responsibleUserId));
        sb.append(',');
        sb.append("pmtMethodTypeInd");
        sb.append('=');
        sb.append(((this.pmtMethodTypeInd == null)?"<null>":this.pmtMethodTypeInd));
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
        result = ((result* 31)+((this.freqInd == null)? 0 :this.freqInd.hashCode()));
        result = ((result* 31)+((this.statusDate == null)? 0 :this.statusDate.hashCode()));
        result = ((result* 31)+((this.periodTo == null)? 0 :this.periodTo.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.seqNum == null)? 0 :this.seqNum.hashCode()));
        result = ((result* 31)+((this.respUserIdDesc == null)? 0 :this.respUserIdDesc.hashCode()));
        result = ((result* 31)+((this.keyblckAgencyCode == null)? 0 :this.keyblckAgencyCode.hashCode()));
        result = ((result* 31)+((this.dueDate == null)? 0 :this.dueDate.hashCode()));
        result = ((result* 31)+((this.evntCode == null)? 0 :this.evntCode.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.dateFrom == null)? 0 :this.dateFrom.hashCode()));
        result = ((result* 31)+((this.numOfDaysReminder == null)? 0 :this.numOfDaysReminder.hashCode()));
        result = ((result* 31)+((this.numOfDays == null)? 0 :this.numOfDays.hashCode()));
        result = ((result* 31)+((this.respUserIdDef == null)? 0 :this.respUserIdDef.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.dateTo == null)? 0 :this.dateTo.hashCode()));
        result = ((result* 31)+((this.begDateInd == null)? 0 :this.begDateInd.hashCode()));
        result = ((result* 31)+((this.displayGrntCode == null)? 0 :this.displayGrntCode.hashCode()));
        result = ((result* 31)+((this.alternateEvntDesc == null)? 0 :this.alternateEvntDesc.hashCode()));
        result = ((result* 31)+((this.bfrmCode == null)? 0 :this.bfrmCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.responsibleUserId == null)? 0 :this.responsibleUserId.hashCode()));
        result = ((result* 31)+((this.pmtMethodTypeInd == null)? 0 :this.pmtMethodTypeInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GrantEventsAssignment100GetRequest) == false) {
            return false;
        }
        GrantEventsAssignment100GetRequest rhs = ((GrantEventsAssignment100GetRequest) other);
        return ((((((((((((((((((((((((this.freqInd == rhs.freqInd)||((this.freqInd!= null)&&this.freqInd.equals(rhs.freqInd)))&&((this.statusDate == rhs.statusDate)||((this.statusDate!= null)&&this.statusDate.equals(rhs.statusDate))))&&((this.periodTo == rhs.periodTo)||((this.periodTo!= null)&&this.periodTo.equals(rhs.periodTo))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.seqNum == rhs.seqNum)||((this.seqNum!= null)&&this.seqNum.equals(rhs.seqNum))))&&((this.respUserIdDesc == rhs.respUserIdDesc)||((this.respUserIdDesc!= null)&&this.respUserIdDesc.equals(rhs.respUserIdDesc))))&&((this.keyblckAgencyCode == rhs.keyblckAgencyCode)||((this.keyblckAgencyCode!= null)&&this.keyblckAgencyCode.equals(rhs.keyblckAgencyCode))))&&((this.dueDate == rhs.dueDate)||((this.dueDate!= null)&&this.dueDate.equals(rhs.dueDate))))&&((this.evntCode == rhs.evntCode)||((this.evntCode!= null)&&this.evntCode.equals(rhs.evntCode))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.dateFrom == rhs.dateFrom)||((this.dateFrom!= null)&&this.dateFrom.equals(rhs.dateFrom))))&&((this.numOfDaysReminder == rhs.numOfDaysReminder)||((this.numOfDaysReminder!= null)&&this.numOfDaysReminder.equals(rhs.numOfDaysReminder))))&&((this.numOfDays == rhs.numOfDays)||((this.numOfDays!= null)&&this.numOfDays.equals(rhs.numOfDays))))&&((this.respUserIdDef == rhs.respUserIdDef)||((this.respUserIdDef!= null)&&this.respUserIdDef.equals(rhs.respUserIdDef))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.dateTo == rhs.dateTo)||((this.dateTo!= null)&&this.dateTo.equals(rhs.dateTo))))&&((this.begDateInd == rhs.begDateInd)||((this.begDateInd!= null)&&this.begDateInd.equals(rhs.begDateInd))))&&((this.displayGrntCode == rhs.displayGrntCode)||((this.displayGrntCode!= null)&&this.displayGrntCode.equals(rhs.displayGrntCode))))&&((this.alternateEvntDesc == rhs.alternateEvntDesc)||((this.alternateEvntDesc!= null)&&this.alternateEvntDesc.equals(rhs.alternateEvntDesc))))&&((this.bfrmCode == rhs.bfrmCode)||((this.bfrmCode!= null)&&this.bfrmCode.equals(rhs.bfrmCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.responsibleUserId == rhs.responsibleUserId)||((this.responsibleUserId!= null)&&this.responsibleUserId.equals(rhs.responsibleUserId))))&&((this.pmtMethodTypeInd == rhs.pmtMethodTypeInd)||((this.pmtMethodTypeInd!= null)&&this.pmtMethodTypeInd.equals(rhs.pmtMethodTypeInd))));
    }

}
