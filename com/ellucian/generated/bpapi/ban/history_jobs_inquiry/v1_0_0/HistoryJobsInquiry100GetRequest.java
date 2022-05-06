
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
    "year",
    "disp",
    "lastNameSeq",
    "posn",
    "firstNameSeq",
    "coas",
    "payno",
    "idSeq",
    "pictCode",
    "trCode",
    "suff",
    "orgn",
    "effectiveDate"
})
@Generated("jsonschema2pojo")
public class HistoryJobsInquiry100GetRequest {

    /**
     * Year
     * <p>
     * Lineage reference object : year
     * (Required)
     * 
     */
    @JsonProperty("year")
    @JsonPropertyDescription("Lineage reference object : year")
    private Object year;
    /**
     * Lineage reference object : PHVJOBS_DISP
     * 
     */
    @JsonProperty("disp")
    @JsonPropertyDescription("Lineage reference object : PHVJOBS_DISP")
    private String disp;
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
    /**
     * COA
     * <p>
     * Lineage reference object : coas
     * 
     */
    @JsonProperty("coas")
    @JsonPropertyDescription("Lineage reference object : coas")
    private Object coas;
    /**
     * Payroll Number
     * <p>
     * Lineage reference object : payno
     * (Required)
     * 
     */
    @JsonProperty("payno")
    @JsonPropertyDescription("Lineage reference object : payno")
    private Object payno;
    /**
     * Lineage reference object : PHVJOBS_ID_SEQ
     * 
     */
    @JsonProperty("idSeq")
    @JsonPropertyDescription("Lineage reference object : PHVJOBS_ID_SEQ")
    private String idSeq;
    /**
     * Payroll ID
     * <p>
     * Lineage reference object : pictCode
     * (Required)
     * 
     */
    @JsonProperty("pictCode")
    @JsonPropertyDescription("Lineage reference object : pictCode")
    private Object pictCode;
    /**
     * Time Sheet Method
     * <p>
     * Lineage reference object : trCode
     * 
     */
    @JsonProperty("trCode")
    @JsonPropertyDescription("Lineage reference object : trCode")
    private Object trCode;
    /**
     * Lineage reference object : PHVJOBS_SUFF
     * 
     */
    @JsonProperty("suff")
    @JsonPropertyDescription("Lineage reference object : PHVJOBS_SUFF")
    private String suff;
    /**
     * Organization
     * <p>
     * Lineage reference object : orgn
     * 
     */
    @JsonProperty("orgn")
    @JsonPropertyDescription("Lineage reference object : orgn")
    private Object orgn;
    /**
     * Lineage reference object : PHVJOBS_EFFECTIVE_DATE
     * 
     */
    @JsonProperty("effectiveDate")
    @JsonPropertyDescription("Lineage reference object : PHVJOBS_EFFECTIVE_DATE")
    private Date effectiveDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Year
     * <p>
     * Lineage reference object : year
     * (Required)
     * 
     */
    @JsonProperty("year")
    public Object getYear() {
        return year;
    }

    /**
     * Year
     * <p>
     * Lineage reference object : year
     * (Required)
     * 
     */
    @JsonProperty("year")
    public void setYear(Object year) {
        this.year = year;
    }

    public HistoryJobsInquiry100GetRequest withYear(Object year) {
        this.year = year;
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

    public HistoryJobsInquiry100GetRequest withDisp(String disp) {
        this.disp = disp;
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

    public HistoryJobsInquiry100GetRequest withLastNameSeq(String lastNameSeq) {
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

    public HistoryJobsInquiry100GetRequest withPosn(String posn) {
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

    public HistoryJobsInquiry100GetRequest withFirstNameSeq(String firstNameSeq) {
        this.firstNameSeq = firstNameSeq;
        return this;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : coas
     * 
     */
    @JsonProperty("coas")
    public Object getCoas() {
        return coas;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : coas
     * 
     */
    @JsonProperty("coas")
    public void setCoas(Object coas) {
        this.coas = coas;
    }

    public HistoryJobsInquiry100GetRequest withCoas(Object coas) {
        this.coas = coas;
        return this;
    }

    /**
     * Payroll Number
     * <p>
     * Lineage reference object : payno
     * (Required)
     * 
     */
    @JsonProperty("payno")
    public Object getPayno() {
        return payno;
    }

    /**
     * Payroll Number
     * <p>
     * Lineage reference object : payno
     * (Required)
     * 
     */
    @JsonProperty("payno")
    public void setPayno(Object payno) {
        this.payno = payno;
    }

    public HistoryJobsInquiry100GetRequest withPayno(Object payno) {
        this.payno = payno;
        return this;
    }

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

    public HistoryJobsInquiry100GetRequest withIdSeq(String idSeq) {
        this.idSeq = idSeq;
        return this;
    }

    /**
     * Payroll ID
     * <p>
     * Lineage reference object : pictCode
     * (Required)
     * 
     */
    @JsonProperty("pictCode")
    public Object getPictCode() {
        return pictCode;
    }

    /**
     * Payroll ID
     * <p>
     * Lineage reference object : pictCode
     * (Required)
     * 
     */
    @JsonProperty("pictCode")
    public void setPictCode(Object pictCode) {
        this.pictCode = pictCode;
    }

    public HistoryJobsInquiry100GetRequest withPictCode(Object pictCode) {
        this.pictCode = pictCode;
        return this;
    }

    /**
     * Time Sheet Method
     * <p>
     * Lineage reference object : trCode
     * 
     */
    @JsonProperty("trCode")
    public Object getTrCode() {
        return trCode;
    }

    /**
     * Time Sheet Method
     * <p>
     * Lineage reference object : trCode
     * 
     */
    @JsonProperty("trCode")
    public void setTrCode(Object trCode) {
        this.trCode = trCode;
    }

    public HistoryJobsInquiry100GetRequest withTrCode(Object trCode) {
        this.trCode = trCode;
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

    public HistoryJobsInquiry100GetRequest withSuff(String suff) {
        this.suff = suff;
        return this;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : orgn
     * 
     */
    @JsonProperty("orgn")
    public Object getOrgn() {
        return orgn;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : orgn
     * 
     */
    @JsonProperty("orgn")
    public void setOrgn(Object orgn) {
        this.orgn = orgn;
    }

    public HistoryJobsInquiry100GetRequest withOrgn(Object orgn) {
        this.orgn = orgn;
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

    public HistoryJobsInquiry100GetRequest withEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
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

    public HistoryJobsInquiry100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HistoryJobsInquiry100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("year");
        sb.append('=');
        sb.append(((this.year == null)?"<null>":this.year));
        sb.append(',');
        sb.append("disp");
        sb.append('=');
        sb.append(((this.disp == null)?"<null>":this.disp));
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
        sb.append("coas");
        sb.append('=');
        sb.append(((this.coas == null)?"<null>":this.coas));
        sb.append(',');
        sb.append("payno");
        sb.append('=');
        sb.append(((this.payno == null)?"<null>":this.payno));
        sb.append(',');
        sb.append("idSeq");
        sb.append('=');
        sb.append(((this.idSeq == null)?"<null>":this.idSeq));
        sb.append(',');
        sb.append("pictCode");
        sb.append('=');
        sb.append(((this.pictCode == null)?"<null>":this.pictCode));
        sb.append(',');
        sb.append("trCode");
        sb.append('=');
        sb.append(((this.trCode == null)?"<null>":this.trCode));
        sb.append(',');
        sb.append("suff");
        sb.append('=');
        sb.append(((this.suff == null)?"<null>":this.suff));
        sb.append(',');
        sb.append("orgn");
        sb.append('=');
        sb.append(((this.orgn == null)?"<null>":this.orgn));
        sb.append(',');
        sb.append("effectiveDate");
        sb.append('=');
        sb.append(((this.effectiveDate == null)?"<null>":this.effectiveDate));
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
        result = ((result* 31)+((this.year == null)? 0 :this.year.hashCode()));
        result = ((result* 31)+((this.disp == null)? 0 :this.disp.hashCode()));
        result = ((result* 31)+((this.lastNameSeq == null)? 0 :this.lastNameSeq.hashCode()));
        result = ((result* 31)+((this.posn == null)? 0 :this.posn.hashCode()));
        result = ((result* 31)+((this.firstNameSeq == null)? 0 :this.firstNameSeq.hashCode()));
        result = ((result* 31)+((this.coas == null)? 0 :this.coas.hashCode()));
        result = ((result* 31)+((this.payno == null)? 0 :this.payno.hashCode()));
        result = ((result* 31)+((this.idSeq == null)? 0 :this.idSeq.hashCode()));
        result = ((result* 31)+((this.pictCode == null)? 0 :this.pictCode.hashCode()));
        result = ((result* 31)+((this.trCode == null)? 0 :this.trCode.hashCode()));
        result = ((result* 31)+((this.suff == null)? 0 :this.suff.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.orgn == null)? 0 :this.orgn.hashCode()));
        result = ((result* 31)+((this.effectiveDate == null)? 0 :this.effectiveDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HistoryJobsInquiry100GetRequest) == false) {
            return false;
        }
        HistoryJobsInquiry100GetRequest rhs = ((HistoryJobsInquiry100GetRequest) other);
        return (((((((((((((((this.year == rhs.year)||((this.year!= null)&&this.year.equals(rhs.year)))&&((this.disp == rhs.disp)||((this.disp!= null)&&this.disp.equals(rhs.disp))))&&((this.lastNameSeq == rhs.lastNameSeq)||((this.lastNameSeq!= null)&&this.lastNameSeq.equals(rhs.lastNameSeq))))&&((this.posn == rhs.posn)||((this.posn!= null)&&this.posn.equals(rhs.posn))))&&((this.firstNameSeq == rhs.firstNameSeq)||((this.firstNameSeq!= null)&&this.firstNameSeq.equals(rhs.firstNameSeq))))&&((this.coas == rhs.coas)||((this.coas!= null)&&this.coas.equals(rhs.coas))))&&((this.payno == rhs.payno)||((this.payno!= null)&&this.payno.equals(rhs.payno))))&&((this.idSeq == rhs.idSeq)||((this.idSeq!= null)&&this.idSeq.equals(rhs.idSeq))))&&((this.pictCode == rhs.pictCode)||((this.pictCode!= null)&&this.pictCode.equals(rhs.pictCode))))&&((this.trCode == rhs.trCode)||((this.trCode!= null)&&this.trCode.equals(rhs.trCode))))&&((this.suff == rhs.suff)||((this.suff!= null)&&this.suff.equals(rhs.suff))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.orgn == rhs.orgn)||((this.orgn!= null)&&this.orgn.equals(rhs.orgn))))&&((this.effectiveDate == rhs.effectiveDate)||((this.effectiveDate!= null)&&this.effectiveDate.equals(rhs.effectiveDate))));
    }

}
