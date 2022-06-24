
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
    "numOfDaysReminder",
    "freqInd",
    "numOfDays",
    "respUserIdDef",
    "keyblckAgencyCode",
    "dateTo",
    "begDateInd",
    "displayGrntCode",
    "alternateEvntDesc",
    "frbevngEvntCode",
    "dateFrom",
    "pmtMethodTypeInd"
})
@Generated("jsonschema2pojo")
public class GrantEventsAssignment100PostRequest {

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
     * Frbevnp Freq Ind
     * <p>
     * Lineage reference object : FRBEVNG_FREQ_IND
     * 
     */
    @JsonProperty("freqInd")
    @JsonPropertyDescription("Lineage reference object : FRBEVNG_FREQ_IND")
    private String freqInd;
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
     * Agency
     * <p>
     * Lineage reference object : keyblckAgencyCode
     * 
     */
    @JsonProperty("keyblckAgencyCode")
    @JsonPropertyDescription("Lineage reference object : keyblckAgencyCode")
    private String keyblckAgencyCode;
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
     * Frbevnp Evnt Code
     * <p>
     * Lineage reference object : FRBEVNG_EVNT_CODE
     * (Required)
     * 
     */
    @JsonProperty("frbevngEvntCode")
    @JsonPropertyDescription("Lineage reference object : FRBEVNG_EVNT_CODE")
    private String frbevngEvntCode;
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

    public GrantEventsAssignment100PostRequest withNumOfDaysReminder(Double numOfDaysReminder) {
        this.numOfDaysReminder = numOfDaysReminder;
        return this;
    }

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

    public GrantEventsAssignment100PostRequest withFreqInd(String freqInd) {
        this.freqInd = freqInd;
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

    public GrantEventsAssignment100PostRequest withNumOfDays(Double numOfDays) {
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

    public GrantEventsAssignment100PostRequest withRespUserIdDef(String respUserIdDef) {
        this.respUserIdDef = respUserIdDef;
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

    public GrantEventsAssignment100PostRequest withKeyblckAgencyCode(String keyblckAgencyCode) {
        this.keyblckAgencyCode = keyblckAgencyCode;
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

    public GrantEventsAssignment100PostRequest withDateTo(Date dateTo) {
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

    public GrantEventsAssignment100PostRequest withBegDateInd(String begDateInd) {
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

    public GrantEventsAssignment100PostRequest withDisplayGrntCode(String displayGrntCode) {
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

    public GrantEventsAssignment100PostRequest withAlternateEvntDesc(String alternateEvntDesc) {
        this.alternateEvntDesc = alternateEvntDesc;
        return this;
    }

    /**
     * Frbevnp Evnt Code
     * <p>
     * Lineage reference object : FRBEVNG_EVNT_CODE
     * (Required)
     * 
     */
    @JsonProperty("frbevngEvntCode")
    public String getFrbevngEvntCode() {
        return frbevngEvntCode;
    }

    /**
     * Frbevnp Evnt Code
     * <p>
     * Lineage reference object : FRBEVNG_EVNT_CODE
     * (Required)
     * 
     */
    @JsonProperty("frbevngEvntCode")
    public void setFrbevngEvntCode(String frbevngEvntCode) {
        this.frbevngEvntCode = frbevngEvntCode;
    }

    public GrantEventsAssignment100PostRequest withFrbevngEvntCode(String frbevngEvntCode) {
        this.frbevngEvntCode = frbevngEvntCode;
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

    public GrantEventsAssignment100PostRequest withDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
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

    public GrantEventsAssignment100PostRequest withPmtMethodTypeInd(String pmtMethodTypeInd) {
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

    public GrantEventsAssignment100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GrantEventsAssignment100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("numOfDaysReminder");
        sb.append('=');
        sb.append(((this.numOfDaysReminder == null)?"<null>":this.numOfDaysReminder));
        sb.append(',');
        sb.append("freqInd");
        sb.append('=');
        sb.append(((this.freqInd == null)?"<null>":this.freqInd));
        sb.append(',');
        sb.append("numOfDays");
        sb.append('=');
        sb.append(((this.numOfDays == null)?"<null>":this.numOfDays));
        sb.append(',');
        sb.append("respUserIdDef");
        sb.append('=');
        sb.append(((this.respUserIdDef == null)?"<null>":this.respUserIdDef));
        sb.append(',');
        sb.append("keyblckAgencyCode");
        sb.append('=');
        sb.append(((this.keyblckAgencyCode == null)?"<null>":this.keyblckAgencyCode));
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
        sb.append("frbevngEvntCode");
        sb.append('=');
        sb.append(((this.frbevngEvntCode == null)?"<null>":this.frbevngEvntCode));
        sb.append(',');
        sb.append("dateFrom");
        sb.append('=');
        sb.append(((this.dateFrom == null)?"<null>":this.dateFrom));
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
        result = ((result* 31)+((this.keyblckAgencyCode == null)? 0 :this.keyblckAgencyCode.hashCode()));
        result = ((result* 31)+((this.dateFrom == null)? 0 :this.dateFrom.hashCode()));
        result = ((result* 31)+((this.numOfDaysReminder == null)? 0 :this.numOfDaysReminder.hashCode()));
        result = ((result* 31)+((this.numOfDays == null)? 0 :this.numOfDays.hashCode()));
        result = ((result* 31)+((this.respUserIdDef == null)? 0 :this.respUserIdDef.hashCode()));
        result = ((result* 31)+((this.dateTo == null)? 0 :this.dateTo.hashCode()));
        result = ((result* 31)+((this.begDateInd == null)? 0 :this.begDateInd.hashCode()));
        result = ((result* 31)+((this.displayGrntCode == null)? 0 :this.displayGrntCode.hashCode()));
        result = ((result* 31)+((this.alternateEvntDesc == null)? 0 :this.alternateEvntDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.frbevngEvntCode == null)? 0 :this.frbevngEvntCode.hashCode()));
        result = ((result* 31)+((this.pmtMethodTypeInd == null)? 0 :this.pmtMethodTypeInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GrantEventsAssignment100PostRequest) == false) {
            return false;
        }
        GrantEventsAssignment100PostRequest rhs = ((GrantEventsAssignment100PostRequest) other);
        return ((((((((((((((this.freqInd == rhs.freqInd)||((this.freqInd!= null)&&this.freqInd.equals(rhs.freqInd)))&&((this.keyblckAgencyCode == rhs.keyblckAgencyCode)||((this.keyblckAgencyCode!= null)&&this.keyblckAgencyCode.equals(rhs.keyblckAgencyCode))))&&((this.dateFrom == rhs.dateFrom)||((this.dateFrom!= null)&&this.dateFrom.equals(rhs.dateFrom))))&&((this.numOfDaysReminder == rhs.numOfDaysReminder)||((this.numOfDaysReminder!= null)&&this.numOfDaysReminder.equals(rhs.numOfDaysReminder))))&&((this.numOfDays == rhs.numOfDays)||((this.numOfDays!= null)&&this.numOfDays.equals(rhs.numOfDays))))&&((this.respUserIdDef == rhs.respUserIdDef)||((this.respUserIdDef!= null)&&this.respUserIdDef.equals(rhs.respUserIdDef))))&&((this.dateTo == rhs.dateTo)||((this.dateTo!= null)&&this.dateTo.equals(rhs.dateTo))))&&((this.begDateInd == rhs.begDateInd)||((this.begDateInd!= null)&&this.begDateInd.equals(rhs.begDateInd))))&&((this.displayGrntCode == rhs.displayGrntCode)||((this.displayGrntCode!= null)&&this.displayGrntCode.equals(rhs.displayGrntCode))))&&((this.alternateEvntDesc == rhs.alternateEvntDesc)||((this.alternateEvntDesc!= null)&&this.alternateEvntDesc.equals(rhs.alternateEvntDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.frbevngEvntCode == rhs.frbevngEvntCode)||((this.frbevngEvntCode!= null)&&this.frbevngEvntCode.equals(rhs.frbevngEvntCode))))&&((this.pmtMethodTypeInd == rhs.pmtMethodTypeInd)||((this.pmtMethodTypeInd!= null)&&this.pmtMethodTypeInd.equals(rhs.pmtMethodTypeInd))));
    }

}
