
package com.ellucian.generated.bpapi.ban.grant_events_assignment.v1_0_0;

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
    "displayGrntCode",
    "keyblckAgencyCode",
    "code",
    "title",
    "evntCode",
    "freqInd",
    "alternateEvntDesc",
    "pmtMethodTypeInd",
    "numOfDaysReminder",
    "periodTo",
    "numOfDays",
    "bfrmCode",
    "dateFrom",
    "dateTo",
    "respUserIdDef",
    "begDateInd",
    "seqNum",
    "responsibleUserId",
    "respUserIdDesc",
    "dueDate",
    "statusInd",
    "statusDate"
})
@Generated("jsonschema2pojo")
public class GrantEventsAssignment100QapiPost {

    @JsonProperty("displayGrntCode")
    private String displayGrntCode;
    @JsonProperty("keyblckAgencyCode")
    private String keyblckAgencyCode;
    /**
     * Frbgrnt Code
     * <p>
     * Lineage reference object : FRBGRNT_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_CODE")
    private String code;
    /**
     * Frbgrnt Title
     * <p>
     * Lineage reference object : FRBGRNT_TITLE
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_TITLE")
    private String title;
    @JsonProperty("evntCode")
    private String evntCode;
    @JsonProperty("freqInd")
    private String freqInd;
    @JsonProperty("alternateEvntDesc")
    private String alternateEvntDesc;
    @JsonProperty("pmtMethodTypeInd")
    private String pmtMethodTypeInd;
    @JsonProperty("numOfDaysReminder")
    private String numOfDaysReminder;
    @JsonProperty("periodTo")
    private String periodTo;
    @JsonProperty("numOfDays")
    private String numOfDays;
    @JsonProperty("bfrmCode")
    private String bfrmCode;
    @JsonProperty("dateFrom")
    private String dateFrom;
    @JsonProperty("dateTo")
    private String dateTo;
    @JsonProperty("respUserIdDef")
    private String respUserIdDef;
    @JsonProperty("begDateInd")
    private String begDateInd;
    @JsonProperty("seqNum")
    private String seqNum;
    @JsonProperty("responsibleUserId")
    private String responsibleUserId;
    @JsonProperty("respUserIdDesc")
    private String respUserIdDesc;
    @JsonProperty("dueDate")
    private String dueDate;
    @JsonProperty("statusInd")
    private String statusInd;
    @JsonProperty("statusDate")
    private String statusDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("displayGrntCode")
    public String getDisplayGrntCode() {
        return displayGrntCode;
    }

    @JsonProperty("displayGrntCode")
    public void setDisplayGrntCode(String displayGrntCode) {
        this.displayGrntCode = displayGrntCode;
    }

    public GrantEventsAssignment100QapiPost withDisplayGrntCode(String displayGrntCode) {
        this.displayGrntCode = displayGrntCode;
        return this;
    }

    @JsonProperty("keyblckAgencyCode")
    public String getKeyblckAgencyCode() {
        return keyblckAgencyCode;
    }

    @JsonProperty("keyblckAgencyCode")
    public void setKeyblckAgencyCode(String keyblckAgencyCode) {
        this.keyblckAgencyCode = keyblckAgencyCode;
    }

    public GrantEventsAssignment100QapiPost withKeyblckAgencyCode(String keyblckAgencyCode) {
        this.keyblckAgencyCode = keyblckAgencyCode;
        return this;
    }

    /**
     * Frbgrnt Code
     * <p>
     * Lineage reference object : FRBGRNT_CODE
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
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public GrantEventsAssignment100QapiPost withCode(String code) {
        this.code = code;
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

    public GrantEventsAssignment100QapiPost withTitle(String title) {
        this.title = title;
        return this;
    }

    @JsonProperty("evntCode")
    public String getEvntCode() {
        return evntCode;
    }

    @JsonProperty("evntCode")
    public void setEvntCode(String evntCode) {
        this.evntCode = evntCode;
    }

    public GrantEventsAssignment100QapiPost withEvntCode(String evntCode) {
        this.evntCode = evntCode;
        return this;
    }

    @JsonProperty("freqInd")
    public String getFreqInd() {
        return freqInd;
    }

    @JsonProperty("freqInd")
    public void setFreqInd(String freqInd) {
        this.freqInd = freqInd;
    }

    public GrantEventsAssignment100QapiPost withFreqInd(String freqInd) {
        this.freqInd = freqInd;
        return this;
    }

    @JsonProperty("alternateEvntDesc")
    public String getAlternateEvntDesc() {
        return alternateEvntDesc;
    }

    @JsonProperty("alternateEvntDesc")
    public void setAlternateEvntDesc(String alternateEvntDesc) {
        this.alternateEvntDesc = alternateEvntDesc;
    }

    public GrantEventsAssignment100QapiPost withAlternateEvntDesc(String alternateEvntDesc) {
        this.alternateEvntDesc = alternateEvntDesc;
        return this;
    }

    @JsonProperty("pmtMethodTypeInd")
    public String getPmtMethodTypeInd() {
        return pmtMethodTypeInd;
    }

    @JsonProperty("pmtMethodTypeInd")
    public void setPmtMethodTypeInd(String pmtMethodTypeInd) {
        this.pmtMethodTypeInd = pmtMethodTypeInd;
    }

    public GrantEventsAssignment100QapiPost withPmtMethodTypeInd(String pmtMethodTypeInd) {
        this.pmtMethodTypeInd = pmtMethodTypeInd;
        return this;
    }

    @JsonProperty("numOfDaysReminder")
    public String getNumOfDaysReminder() {
        return numOfDaysReminder;
    }

    @JsonProperty("numOfDaysReminder")
    public void setNumOfDaysReminder(String numOfDaysReminder) {
        this.numOfDaysReminder = numOfDaysReminder;
    }

    public GrantEventsAssignment100QapiPost withNumOfDaysReminder(String numOfDaysReminder) {
        this.numOfDaysReminder = numOfDaysReminder;
        return this;
    }

    @JsonProperty("periodTo")
    public String getPeriodTo() {
        return periodTo;
    }

    @JsonProperty("periodTo")
    public void setPeriodTo(String periodTo) {
        this.periodTo = periodTo;
    }

    public GrantEventsAssignment100QapiPost withPeriodTo(String periodTo) {
        this.periodTo = periodTo;
        return this;
    }

    @JsonProperty("numOfDays")
    public String getNumOfDays() {
        return numOfDays;
    }

    @JsonProperty("numOfDays")
    public void setNumOfDays(String numOfDays) {
        this.numOfDays = numOfDays;
    }

    public GrantEventsAssignment100QapiPost withNumOfDays(String numOfDays) {
        this.numOfDays = numOfDays;
        return this;
    }

    @JsonProperty("bfrmCode")
    public String getBfrmCode() {
        return bfrmCode;
    }

    @JsonProperty("bfrmCode")
    public void setBfrmCode(String bfrmCode) {
        this.bfrmCode = bfrmCode;
    }

    public GrantEventsAssignment100QapiPost withBfrmCode(String bfrmCode) {
        this.bfrmCode = bfrmCode;
        return this;
    }

    @JsonProperty("dateFrom")
    public String getDateFrom() {
        return dateFrom;
    }

    @JsonProperty("dateFrom")
    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }

    public GrantEventsAssignment100QapiPost withDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
        return this;
    }

    @JsonProperty("dateTo")
    public String getDateTo() {
        return dateTo;
    }

    @JsonProperty("dateTo")
    public void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }

    public GrantEventsAssignment100QapiPost withDateTo(String dateTo) {
        this.dateTo = dateTo;
        return this;
    }

    @JsonProperty("respUserIdDef")
    public String getRespUserIdDef() {
        return respUserIdDef;
    }

    @JsonProperty("respUserIdDef")
    public void setRespUserIdDef(String respUserIdDef) {
        this.respUserIdDef = respUserIdDef;
    }

    public GrantEventsAssignment100QapiPost withRespUserIdDef(String respUserIdDef) {
        this.respUserIdDef = respUserIdDef;
        return this;
    }

    @JsonProperty("begDateInd")
    public String getBegDateInd() {
        return begDateInd;
    }

    @JsonProperty("begDateInd")
    public void setBegDateInd(String begDateInd) {
        this.begDateInd = begDateInd;
    }

    public GrantEventsAssignment100QapiPost withBegDateInd(String begDateInd) {
        this.begDateInd = begDateInd;
        return this;
    }

    @JsonProperty("seqNum")
    public String getSeqNum() {
        return seqNum;
    }

    @JsonProperty("seqNum")
    public void setSeqNum(String seqNum) {
        this.seqNum = seqNum;
    }

    public GrantEventsAssignment100QapiPost withSeqNum(String seqNum) {
        this.seqNum = seqNum;
        return this;
    }

    @JsonProperty("responsibleUserId")
    public String getResponsibleUserId() {
        return responsibleUserId;
    }

    @JsonProperty("responsibleUserId")
    public void setResponsibleUserId(String responsibleUserId) {
        this.responsibleUserId = responsibleUserId;
    }

    public GrantEventsAssignment100QapiPost withResponsibleUserId(String responsibleUserId) {
        this.responsibleUserId = responsibleUserId;
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

    public GrantEventsAssignment100QapiPost withRespUserIdDesc(String respUserIdDesc) {
        this.respUserIdDesc = respUserIdDesc;
        return this;
    }

    @JsonProperty("dueDate")
    public String getDueDate() {
        return dueDate;
    }

    @JsonProperty("dueDate")
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public GrantEventsAssignment100QapiPost withDueDate(String dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    @JsonProperty("statusInd")
    public String getStatusInd() {
        return statusInd;
    }

    @JsonProperty("statusInd")
    public void setStatusInd(String statusInd) {
        this.statusInd = statusInd;
    }

    public GrantEventsAssignment100QapiPost withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    @JsonProperty("statusDate")
    public String getStatusDate() {
        return statusDate;
    }

    @JsonProperty("statusDate")
    public void setStatusDate(String statusDate) {
        this.statusDate = statusDate;
    }

    public GrantEventsAssignment100QapiPost withStatusDate(String statusDate) {
        this.statusDate = statusDate;
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

    public GrantEventsAssignment100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GrantEventsAssignment100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("displayGrntCode");
        sb.append('=');
        sb.append(((this.displayGrntCode == null)?"<null>":this.displayGrntCode));
        sb.append(',');
        sb.append("keyblckAgencyCode");
        sb.append('=');
        sb.append(((this.keyblckAgencyCode == null)?"<null>":this.keyblckAgencyCode));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("evntCode");
        sb.append('=');
        sb.append(((this.evntCode == null)?"<null>":this.evntCode));
        sb.append(',');
        sb.append("freqInd");
        sb.append('=');
        sb.append(((this.freqInd == null)?"<null>":this.freqInd));
        sb.append(',');
        sb.append("alternateEvntDesc");
        sb.append('=');
        sb.append(((this.alternateEvntDesc == null)?"<null>":this.alternateEvntDesc));
        sb.append(',');
        sb.append("pmtMethodTypeInd");
        sb.append('=');
        sb.append(((this.pmtMethodTypeInd == null)?"<null>":this.pmtMethodTypeInd));
        sb.append(',');
        sb.append("numOfDaysReminder");
        sb.append('=');
        sb.append(((this.numOfDaysReminder == null)?"<null>":this.numOfDaysReminder));
        sb.append(',');
        sb.append("periodTo");
        sb.append('=');
        sb.append(((this.periodTo == null)?"<null>":this.periodTo));
        sb.append(',');
        sb.append("numOfDays");
        sb.append('=');
        sb.append(((this.numOfDays == null)?"<null>":this.numOfDays));
        sb.append(',');
        sb.append("bfrmCode");
        sb.append('=');
        sb.append(((this.bfrmCode == null)?"<null>":this.bfrmCode));
        sb.append(',');
        sb.append("dateFrom");
        sb.append('=');
        sb.append(((this.dateFrom == null)?"<null>":this.dateFrom));
        sb.append(',');
        sb.append("dateTo");
        sb.append('=');
        sb.append(((this.dateTo == null)?"<null>":this.dateTo));
        sb.append(',');
        sb.append("respUserIdDef");
        sb.append('=');
        sb.append(((this.respUserIdDef == null)?"<null>":this.respUserIdDef));
        sb.append(',');
        sb.append("begDateInd");
        sb.append('=');
        sb.append(((this.begDateInd == null)?"<null>":this.begDateInd));
        sb.append(',');
        sb.append("seqNum");
        sb.append('=');
        sb.append(((this.seqNum == null)?"<null>":this.seqNum));
        sb.append(',');
        sb.append("responsibleUserId");
        sb.append('=');
        sb.append(((this.responsibleUserId == null)?"<null>":this.responsibleUserId));
        sb.append(',');
        sb.append("respUserIdDesc");
        sb.append('=');
        sb.append(((this.respUserIdDesc == null)?"<null>":this.respUserIdDesc));
        sb.append(',');
        sb.append("dueDate");
        sb.append('=');
        sb.append(((this.dueDate == null)?"<null>":this.dueDate));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("statusDate");
        sb.append('=');
        sb.append(((this.statusDate == null)?"<null>":this.statusDate));
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
        if ((other instanceof GrantEventsAssignment100QapiPost) == false) {
            return false;
        }
        GrantEventsAssignment100QapiPost rhs = ((GrantEventsAssignment100QapiPost) other);
        return ((((((((((((((((((((((((this.freqInd == rhs.freqInd)||((this.freqInd!= null)&&this.freqInd.equals(rhs.freqInd)))&&((this.statusDate == rhs.statusDate)||((this.statusDate!= null)&&this.statusDate.equals(rhs.statusDate))))&&((this.periodTo == rhs.periodTo)||((this.periodTo!= null)&&this.periodTo.equals(rhs.periodTo))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.seqNum == rhs.seqNum)||((this.seqNum!= null)&&this.seqNum.equals(rhs.seqNum))))&&((this.respUserIdDesc == rhs.respUserIdDesc)||((this.respUserIdDesc!= null)&&this.respUserIdDesc.equals(rhs.respUserIdDesc))))&&((this.keyblckAgencyCode == rhs.keyblckAgencyCode)||((this.keyblckAgencyCode!= null)&&this.keyblckAgencyCode.equals(rhs.keyblckAgencyCode))))&&((this.dueDate == rhs.dueDate)||((this.dueDate!= null)&&this.dueDate.equals(rhs.dueDate))))&&((this.evntCode == rhs.evntCode)||((this.evntCode!= null)&&this.evntCode.equals(rhs.evntCode))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.dateFrom == rhs.dateFrom)||((this.dateFrom!= null)&&this.dateFrom.equals(rhs.dateFrom))))&&((this.numOfDaysReminder == rhs.numOfDaysReminder)||((this.numOfDaysReminder!= null)&&this.numOfDaysReminder.equals(rhs.numOfDaysReminder))))&&((this.numOfDays == rhs.numOfDays)||((this.numOfDays!= null)&&this.numOfDays.equals(rhs.numOfDays))))&&((this.respUserIdDef == rhs.respUserIdDef)||((this.respUserIdDef!= null)&&this.respUserIdDef.equals(rhs.respUserIdDef))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.dateTo == rhs.dateTo)||((this.dateTo!= null)&&this.dateTo.equals(rhs.dateTo))))&&((this.begDateInd == rhs.begDateInd)||((this.begDateInd!= null)&&this.begDateInd.equals(rhs.begDateInd))))&&((this.displayGrntCode == rhs.displayGrntCode)||((this.displayGrntCode!= null)&&this.displayGrntCode.equals(rhs.displayGrntCode))))&&((this.alternateEvntDesc == rhs.alternateEvntDesc)||((this.alternateEvntDesc!= null)&&this.alternateEvntDesc.equals(rhs.alternateEvntDesc))))&&((this.bfrmCode == rhs.bfrmCode)||((this.bfrmCode!= null)&&this.bfrmCode.equals(rhs.bfrmCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.responsibleUserId == rhs.responsibleUserId)||((this.responsibleUserId!= null)&&this.responsibleUserId.equals(rhs.responsibleUserId))))&&((this.pmtMethodTypeInd == rhs.pmtMethodTypeInd)||((this.pmtMethodTypeInd!= null)&&this.pmtMethodTypeInd.equals(rhs.pmtMethodTypeInd))));
    }

}
