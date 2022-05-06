
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
    "periodTo",
    "evntCode",
    "dateFrom",
    "numOfDaysReminder",
    "numOfDays",
    "respUserIdDef",
    "bfrmCodeDesc",
    "begDateInd",
    "dateTo",
    "alternateEvntDesc",
    "bfrmCode",
    "evntCodeDesc",
    "pmtMethodTypeInd"
})
@Generated("jsonschema2pojo")
public class Frbevng__1 {

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
     * Frbevnp Date From
     * <p>
     * 
     * 
     */
    @JsonProperty("periodTo")
    private Date periodTo;
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
    @JsonProperty("bfrmCodeDesc")
    private String bfrmCodeDesc;
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
     * Frbevnp Date To
     * <p>
     * Lineage reference object : FRBEVNG_DATE_TO
     * 
     */
    @JsonProperty("dateTo")
    @JsonPropertyDescription("Lineage reference object : FRBEVNG_DATE_TO")
    private Date dateTo;
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
    @JsonProperty("evntCodeDesc")
    private String evntCodeDesc;
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

    public Frbevng__1 withFreqInd(String freqInd) {
        this.freqInd = freqInd;
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

    public Frbevng__1 withPeriodTo(Date periodTo) {
        this.periodTo = periodTo;
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

    public Frbevng__1 withEvntCode(String evntCode) {
        this.evntCode = evntCode;
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

    public Frbevng__1 withDateFrom(Date dateFrom) {
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

    public Frbevng__1 withNumOfDaysReminder(Double numOfDaysReminder) {
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

    public Frbevng__1 withNumOfDays(Double numOfDays) {
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

    public Frbevng__1 withRespUserIdDef(String respUserIdDef) {
        this.respUserIdDef = respUserIdDef;
        return this;
    }

    @JsonProperty("bfrmCodeDesc")
    public String getBfrmCodeDesc() {
        return bfrmCodeDesc;
    }

    @JsonProperty("bfrmCodeDesc")
    public void setBfrmCodeDesc(String bfrmCodeDesc) {
        this.bfrmCodeDesc = bfrmCodeDesc;
    }

    public Frbevng__1 withBfrmCodeDesc(String bfrmCodeDesc) {
        this.bfrmCodeDesc = bfrmCodeDesc;
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

    public Frbevng__1 withBegDateInd(String begDateInd) {
        this.begDateInd = begDateInd;
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

    public Frbevng__1 withDateTo(Date dateTo) {
        this.dateTo = dateTo;
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

    public Frbevng__1 withAlternateEvntDesc(String alternateEvntDesc) {
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

    public Frbevng__1 withBfrmCode(String bfrmCode) {
        this.bfrmCode = bfrmCode;
        return this;
    }

    @JsonProperty("evntCodeDesc")
    public String getEvntCodeDesc() {
        return evntCodeDesc;
    }

    @JsonProperty("evntCodeDesc")
    public void setEvntCodeDesc(String evntCodeDesc) {
        this.evntCodeDesc = evntCodeDesc;
    }

    public Frbevng__1 withEvntCodeDesc(String evntCodeDesc) {
        this.evntCodeDesc = evntCodeDesc;
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

    public Frbevng__1 withPmtMethodTypeInd(String pmtMethodTypeInd) {
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

    public Frbevng__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Frbevng__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("freqInd");
        sb.append('=');
        sb.append(((this.freqInd == null)?"<null>":this.freqInd));
        sb.append(',');
        sb.append("periodTo");
        sb.append('=');
        sb.append(((this.periodTo == null)?"<null>":this.periodTo));
        sb.append(',');
        sb.append("evntCode");
        sb.append('=');
        sb.append(((this.evntCode == null)?"<null>":this.evntCode));
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
        sb.append("bfrmCodeDesc");
        sb.append('=');
        sb.append(((this.bfrmCodeDesc == null)?"<null>":this.bfrmCodeDesc));
        sb.append(',');
        sb.append("begDateInd");
        sb.append('=');
        sb.append(((this.begDateInd == null)?"<null>":this.begDateInd));
        sb.append(',');
        sb.append("dateTo");
        sb.append('=');
        sb.append(((this.dateTo == null)?"<null>":this.dateTo));
        sb.append(',');
        sb.append("alternateEvntDesc");
        sb.append('=');
        sb.append(((this.alternateEvntDesc == null)?"<null>":this.alternateEvntDesc));
        sb.append(',');
        sb.append("bfrmCode");
        sb.append('=');
        sb.append(((this.bfrmCode == null)?"<null>":this.bfrmCode));
        sb.append(',');
        sb.append("evntCodeDesc");
        sb.append('=');
        sb.append(((this.evntCodeDesc == null)?"<null>":this.evntCodeDesc));
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
        result = ((result* 31)+((this.periodTo == null)? 0 :this.periodTo.hashCode()));
        result = ((result* 31)+((this.evntCode == null)? 0 :this.evntCode.hashCode()));
        result = ((result* 31)+((this.dateFrom == null)? 0 :this.dateFrom.hashCode()));
        result = ((result* 31)+((this.numOfDaysReminder == null)? 0 :this.numOfDaysReminder.hashCode()));
        result = ((result* 31)+((this.numOfDays == null)? 0 :this.numOfDays.hashCode()));
        result = ((result* 31)+((this.respUserIdDef == null)? 0 :this.respUserIdDef.hashCode()));
        result = ((result* 31)+((this.bfrmCodeDesc == null)? 0 :this.bfrmCodeDesc.hashCode()));
        result = ((result* 31)+((this.begDateInd == null)? 0 :this.begDateInd.hashCode()));
        result = ((result* 31)+((this.dateTo == null)? 0 :this.dateTo.hashCode()));
        result = ((result* 31)+((this.alternateEvntDesc == null)? 0 :this.alternateEvntDesc.hashCode()));
        result = ((result* 31)+((this.bfrmCode == null)? 0 :this.bfrmCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.evntCodeDesc == null)? 0 :this.evntCodeDesc.hashCode()));
        result = ((result* 31)+((this.pmtMethodTypeInd == null)? 0 :this.pmtMethodTypeInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Frbevng__1) == false) {
            return false;
        }
        Frbevng__1 rhs = ((Frbevng__1) other);
        return ((((((((((((((((this.freqInd == rhs.freqInd)||((this.freqInd!= null)&&this.freqInd.equals(rhs.freqInd)))&&((this.periodTo == rhs.periodTo)||((this.periodTo!= null)&&this.periodTo.equals(rhs.periodTo))))&&((this.evntCode == rhs.evntCode)||((this.evntCode!= null)&&this.evntCode.equals(rhs.evntCode))))&&((this.dateFrom == rhs.dateFrom)||((this.dateFrom!= null)&&this.dateFrom.equals(rhs.dateFrom))))&&((this.numOfDaysReminder == rhs.numOfDaysReminder)||((this.numOfDaysReminder!= null)&&this.numOfDaysReminder.equals(rhs.numOfDaysReminder))))&&((this.numOfDays == rhs.numOfDays)||((this.numOfDays!= null)&&this.numOfDays.equals(rhs.numOfDays))))&&((this.respUserIdDef == rhs.respUserIdDef)||((this.respUserIdDef!= null)&&this.respUserIdDef.equals(rhs.respUserIdDef))))&&((this.bfrmCodeDesc == rhs.bfrmCodeDesc)||((this.bfrmCodeDesc!= null)&&this.bfrmCodeDesc.equals(rhs.bfrmCodeDesc))))&&((this.begDateInd == rhs.begDateInd)||((this.begDateInd!= null)&&this.begDateInd.equals(rhs.begDateInd))))&&((this.dateTo == rhs.dateTo)||((this.dateTo!= null)&&this.dateTo.equals(rhs.dateTo))))&&((this.alternateEvntDesc == rhs.alternateEvntDesc)||((this.alternateEvntDesc!= null)&&this.alternateEvntDesc.equals(rhs.alternateEvntDesc))))&&((this.bfrmCode == rhs.bfrmCode)||((this.bfrmCode!= null)&&this.bfrmCode.equals(rhs.bfrmCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.evntCodeDesc == rhs.evntCodeDesc)||((this.evntCodeDesc!= null)&&this.evntCodeDesc.equals(rhs.evntCodeDesc))))&&((this.pmtMethodTypeInd == rhs.pmtMethodTypeInd)||((this.pmtMethodTypeInd!= null)&&this.pmtMethodTypeInd.equals(rhs.pmtMethodTypeInd))));
    }

}
