
package com.ellucian.generated.bpapi.ban.history_jobs_inquiry.v1_0_0;

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
    "idSeq",
    "suff",
    "hrs",
    "units",
    "disp",
    "effectiveDate",
    "lastNameSeq",
    "posn",
    "firstNameSeq"
})
@Generated("jsonschema2pojo")
public class HistoryJobsInquiry100GetResponse {

    /**
     * Lineage reference object : PHVJOBS_ID_SEQ
     * 
     */
    @JsonProperty("idSeq")
    @JsonPropertyDescription("Lineage reference object : PHVJOBS_ID_SEQ")
    private String idSeq;
    /**
     * Lineage reference object : PHVJOBS_SUFF
     * 
     */
    @JsonProperty("suff")
    @JsonPropertyDescription("Lineage reference object : PHVJOBS_SUFF")
    private String suff;
    /**
     * Lineage reference object : HRS
     * 
     */
    @JsonProperty("hrs")
    @JsonPropertyDescription("Lineage reference object : HRS")
    private Double hrs;
    /**
     * Lineage reference object : UNITS
     * 
     */
    @JsonProperty("units")
    @JsonPropertyDescription("Lineage reference object : UNITS")
    private Double units;
    /**
     * Lineage reference object : PHVJOBS_DISP
     * 
     */
    @JsonProperty("disp")
    @JsonPropertyDescription("Lineage reference object : PHVJOBS_DISP")
    private String disp;
    /**
     * Lineage reference object : PHVJOBS_EFFECTIVE_DATE
     * 
     */
    @JsonProperty("effectiveDate")
    @JsonPropertyDescription("Lineage reference object : PHVJOBS_EFFECTIVE_DATE")
    private Date effectiveDate;
    /**
     * Lineage reference object : PHVJOBS_LAST_NAME_SEQ
     * 
     */
    @JsonProperty("lastNameSeq")
    @JsonPropertyDescription("Lineage reference object : PHVJOBS_LAST_NAME_SEQ")
    private String lastNameSeq;
    /**
     * Lineage reference object : PHVJOBS_POSN
     * 
     */
    @JsonProperty("posn")
    @JsonPropertyDescription("Lineage reference object : PHVJOBS_POSN")
    private String posn;
    /**
     * Lineage reference object : PHVJOBS_FIRST_NAME_SEQ
     * 
     */
    @JsonProperty("firstNameSeq")
    @JsonPropertyDescription("Lineage reference object : PHVJOBS_FIRST_NAME_SEQ")
    private String firstNameSeq;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : PHVJOBS_ID_SEQ
     * 
     */
    @JsonProperty("idSeq")
    public String getIdSeq() {
        return idSeq;
    }

    /**
     * Lineage reference object : PHVJOBS_ID_SEQ
     * 
     */
    @JsonProperty("idSeq")
    public void setIdSeq(String idSeq) {
        this.idSeq = idSeq;
    }

    public HistoryJobsInquiry100GetResponse withIdSeq(String idSeq) {
        this.idSeq = idSeq;
        return this;
    }

    /**
     * Lineage reference object : PHVJOBS_SUFF
     * 
     */
    @JsonProperty("suff")
    public String getSuff() {
        return suff;
    }

    /**
     * Lineage reference object : PHVJOBS_SUFF
     * 
     */
    @JsonProperty("suff")
    public void setSuff(String suff) {
        this.suff = suff;
    }

    public HistoryJobsInquiry100GetResponse withSuff(String suff) {
        this.suff = suff;
        return this;
    }

    /**
     * Lineage reference object : HRS
     * 
     */
    @JsonProperty("hrs")
    public Double getHrs() {
        return hrs;
    }

    /**
     * Lineage reference object : HRS
     * 
     */
    @JsonProperty("hrs")
    public void setHrs(Double hrs) {
        this.hrs = hrs;
    }

    public HistoryJobsInquiry100GetResponse withHrs(Double hrs) {
        this.hrs = hrs;
        return this;
    }

    /**
     * Lineage reference object : UNITS
     * 
     */
    @JsonProperty("units")
    public Double getUnits() {
        return units;
    }

    /**
     * Lineage reference object : UNITS
     * 
     */
    @JsonProperty("units")
    public void setUnits(Double units) {
        this.units = units;
    }

    public HistoryJobsInquiry100GetResponse withUnits(Double units) {
        this.units = units;
        return this;
    }

    /**
     * Lineage reference object : PHVJOBS_DISP
     * 
     */
    @JsonProperty("disp")
    public String getDisp() {
        return disp;
    }

    /**
     * Lineage reference object : PHVJOBS_DISP
     * 
     */
    @JsonProperty("disp")
    public void setDisp(String disp) {
        this.disp = disp;
    }

    public HistoryJobsInquiry100GetResponse withDisp(String disp) {
        this.disp = disp;
        return this;
    }

    /**
     * Lineage reference object : PHVJOBS_EFFECTIVE_DATE
     * 
     */
    @JsonProperty("effectiveDate")
    public Date getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Lineage reference object : PHVJOBS_EFFECTIVE_DATE
     * 
     */
    @JsonProperty("effectiveDate")
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public HistoryJobsInquiry100GetResponse withEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * Lineage reference object : PHVJOBS_LAST_NAME_SEQ
     * 
     */
    @JsonProperty("lastNameSeq")
    public String getLastNameSeq() {
        return lastNameSeq;
    }

    /**
     * Lineage reference object : PHVJOBS_LAST_NAME_SEQ
     * 
     */
    @JsonProperty("lastNameSeq")
    public void setLastNameSeq(String lastNameSeq) {
        this.lastNameSeq = lastNameSeq;
    }

    public HistoryJobsInquiry100GetResponse withLastNameSeq(String lastNameSeq) {
        this.lastNameSeq = lastNameSeq;
        return this;
    }

    /**
     * Lineage reference object : PHVJOBS_POSN
     * 
     */
    @JsonProperty("posn")
    public String getPosn() {
        return posn;
    }

    /**
     * Lineage reference object : PHVJOBS_POSN
     * 
     */
    @JsonProperty("posn")
    public void setPosn(String posn) {
        this.posn = posn;
    }

    public HistoryJobsInquiry100GetResponse withPosn(String posn) {
        this.posn = posn;
        return this;
    }

    /**
     * Lineage reference object : PHVJOBS_FIRST_NAME_SEQ
     * 
     */
    @JsonProperty("firstNameSeq")
    public String getFirstNameSeq() {
        return firstNameSeq;
    }

    /**
     * Lineage reference object : PHVJOBS_FIRST_NAME_SEQ
     * 
     */
    @JsonProperty("firstNameSeq")
    public void setFirstNameSeq(String firstNameSeq) {
        this.firstNameSeq = firstNameSeq;
    }

    public HistoryJobsInquiry100GetResponse withFirstNameSeq(String firstNameSeq) {
        this.firstNameSeq = firstNameSeq;
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

    public HistoryJobsInquiry100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HistoryJobsInquiry100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("idSeq");
        sb.append('=');
        sb.append(((this.idSeq == null)?"<null>":this.idSeq));
        sb.append(',');
        sb.append("suff");
        sb.append('=');
        sb.append(((this.suff == null)?"<null>":this.suff));
        sb.append(',');
        sb.append("hrs");
        sb.append('=');
        sb.append(((this.hrs == null)?"<null>":this.hrs));
        sb.append(',');
        sb.append("units");
        sb.append('=');
        sb.append(((this.units == null)?"<null>":this.units));
        sb.append(',');
        sb.append("disp");
        sb.append('=');
        sb.append(((this.disp == null)?"<null>":this.disp));
        sb.append(',');
        sb.append("effectiveDate");
        sb.append('=');
        sb.append(((this.effectiveDate == null)?"<null>":this.effectiveDate));
        sb.append(',');
        sb.append("lastNameSeq");
        sb.append('=');
        sb.append(((this.lastNameSeq == null)?"<null>":this.lastNameSeq));
        sb.append(',');
        sb.append("posn");
        sb.append('=');
        sb.append(((this.posn == null)?"<null>":this.posn));
        sb.append(',');
        sb.append("firstNameSeq");
        sb.append('=');
        sb.append(((this.firstNameSeq == null)?"<null>":this.firstNameSeq));
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
        result = ((result* 31)+((this.idSeq == null)? 0 :this.idSeq.hashCode()));
        result = ((result* 31)+((this.suff == null)? 0 :this.suff.hashCode()));
        result = ((result* 31)+((this.hrs == null)? 0 :this.hrs.hashCode()));
        result = ((result* 31)+((this.units == null)? 0 :this.units.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.disp == null)? 0 :this.disp.hashCode()));
        result = ((result* 31)+((this.effectiveDate == null)? 0 :this.effectiveDate.hashCode()));
        result = ((result* 31)+((this.lastNameSeq == null)? 0 :this.lastNameSeq.hashCode()));
        result = ((result* 31)+((this.posn == null)? 0 :this.posn.hashCode()));
        result = ((result* 31)+((this.firstNameSeq == null)? 0 :this.firstNameSeq.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HistoryJobsInquiry100GetResponse) == false) {
            return false;
        }
        HistoryJobsInquiry100GetResponse rhs = ((HistoryJobsInquiry100GetResponse) other);
        return (((((((((((this.idSeq == rhs.idSeq)||((this.idSeq!= null)&&this.idSeq.equals(rhs.idSeq)))&&((this.suff == rhs.suff)||((this.suff!= null)&&this.suff.equals(rhs.suff))))&&((this.hrs == rhs.hrs)||((this.hrs!= null)&&this.hrs.equals(rhs.hrs))))&&((this.units == rhs.units)||((this.units!= null)&&this.units.equals(rhs.units))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.disp == rhs.disp)||((this.disp!= null)&&this.disp.equals(rhs.disp))))&&((this.effectiveDate == rhs.effectiveDate)||((this.effectiveDate!= null)&&this.effectiveDate.equals(rhs.effectiveDate))))&&((this.lastNameSeq == rhs.lastNameSeq)||((this.lastNameSeq!= null)&&this.lastNameSeq.equals(rhs.lastNameSeq))))&&((this.posn == rhs.posn)||((this.posn!= null)&&this.posn.equals(rhs.posn))))&&((this.firstNameSeq == rhs.firstNameSeq)||((this.firstNameSeq!= null)&&this.firstNameSeq.equals(rhs.firstNameSeq))));
    }

}
