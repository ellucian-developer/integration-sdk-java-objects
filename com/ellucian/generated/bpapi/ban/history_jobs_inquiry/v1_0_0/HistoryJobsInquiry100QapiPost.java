
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
    "pictCode",
    "payno",
    "coas",
    "orgn",
    "trCode",
    "idSeq",
    "lastNameSeq",
    "firstNameSeq",
    "posn",
    "suff",
    "effectiveDate",
    "disp"
})
@Generated("jsonschema2pojo")
public class HistoryJobsInquiry100QapiPost {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("year")
    private String year;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pictCode")
    private String pictCode;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("payno")
    private String payno;
    @JsonProperty("coas")
    private String coas;
    @JsonProperty("orgn")
    private String orgn;
    @JsonProperty("trCode")
    private String trCode;
    /**
     * Lineage reference object : PHVJOBS_ID_SEQ
     * 
     */
    @JsonProperty("idSeq")
    @JsonPropertyDescription("Lineage reference object : PHVJOBS_ID_SEQ")
    private String idSeq;
    /**
     * Lineage reference object : PHVJOBS_LAST_NAME_SEQ
     * 
     */
    @JsonProperty("lastNameSeq")
    @JsonPropertyDescription("Lineage reference object : PHVJOBS_LAST_NAME_SEQ")
    private String lastNameSeq;
    /**
     * Lineage reference object : PHVJOBS_FIRST_NAME_SEQ
     * 
     */
    @JsonProperty("firstNameSeq")
    @JsonPropertyDescription("Lineage reference object : PHVJOBS_FIRST_NAME_SEQ")
    private String firstNameSeq;
    /**
     * Lineage reference object : PHVJOBS_POSN
     * 
     */
    @JsonProperty("posn")
    @JsonPropertyDescription("Lineage reference object : PHVJOBS_POSN")
    private String posn;
    /**
     * Lineage reference object : PHVJOBS_SUFF
     * 
     */
    @JsonProperty("suff")
    @JsonPropertyDescription("Lineage reference object : PHVJOBS_SUFF")
    private String suff;
    /**
     * Lineage reference object : PHVJOBS_EFFECTIVE_DATE
     * 
     */
    @JsonProperty("effectiveDate")
    @JsonPropertyDescription("Lineage reference object : PHVJOBS_EFFECTIVE_DATE")
    private Date effectiveDate;
    /**
     * Lineage reference object : PHVJOBS_DISP
     * 
     */
    @JsonProperty("disp")
    @JsonPropertyDescription("Lineage reference object : PHVJOBS_DISP")
    private String disp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("year")
    public String getYear() {
        return year;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("year")
    public void setYear(String year) {
        this.year = year;
    }

    public HistoryJobsInquiry100QapiPost withYear(String year) {
        this.year = year;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pictCode")
    public String getPictCode() {
        return pictCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pictCode")
    public void setPictCode(String pictCode) {
        this.pictCode = pictCode;
    }

    public HistoryJobsInquiry100QapiPost withPictCode(String pictCode) {
        this.pictCode = pictCode;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("payno")
    public String getPayno() {
        return payno;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("payno")
    public void setPayno(String payno) {
        this.payno = payno;
    }

    public HistoryJobsInquiry100QapiPost withPayno(String payno) {
        this.payno = payno;
        return this;
    }

    @JsonProperty("coas")
    public String getCoas() {
        return coas;
    }

    @JsonProperty("coas")
    public void setCoas(String coas) {
        this.coas = coas;
    }

    public HistoryJobsInquiry100QapiPost withCoas(String coas) {
        this.coas = coas;
        return this;
    }

    @JsonProperty("orgn")
    public String getOrgn() {
        return orgn;
    }

    @JsonProperty("orgn")
    public void setOrgn(String orgn) {
        this.orgn = orgn;
    }

    public HistoryJobsInquiry100QapiPost withOrgn(String orgn) {
        this.orgn = orgn;
        return this;
    }

    @JsonProperty("trCode")
    public String getTrCode() {
        return trCode;
    }

    @JsonProperty("trCode")
    public void setTrCode(String trCode) {
        this.trCode = trCode;
    }

    public HistoryJobsInquiry100QapiPost withTrCode(String trCode) {
        this.trCode = trCode;
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

    public HistoryJobsInquiry100QapiPost withIdSeq(String idSeq) {
        this.idSeq = idSeq;
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

    public HistoryJobsInquiry100QapiPost withLastNameSeq(String lastNameSeq) {
        this.lastNameSeq = lastNameSeq;
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

    public HistoryJobsInquiry100QapiPost withFirstNameSeq(String firstNameSeq) {
        this.firstNameSeq = firstNameSeq;
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

    public HistoryJobsInquiry100QapiPost withPosn(String posn) {
        this.posn = posn;
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

    public HistoryJobsInquiry100QapiPost withSuff(String suff) {
        this.suff = suff;
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

    public HistoryJobsInquiry100QapiPost withEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
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

    public HistoryJobsInquiry100QapiPost withDisp(String disp) {
        this.disp = disp;
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

    public HistoryJobsInquiry100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HistoryJobsInquiry100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("year");
        sb.append('=');
        sb.append(((this.year == null)?"<null>":this.year));
        sb.append(',');
        sb.append("pictCode");
        sb.append('=');
        sb.append(((this.pictCode == null)?"<null>":this.pictCode));
        sb.append(',');
        sb.append("payno");
        sb.append('=');
        sb.append(((this.payno == null)?"<null>":this.payno));
        sb.append(',');
        sb.append("coas");
        sb.append('=');
        sb.append(((this.coas == null)?"<null>":this.coas));
        sb.append(',');
        sb.append("orgn");
        sb.append('=');
        sb.append(((this.orgn == null)?"<null>":this.orgn));
        sb.append(',');
        sb.append("trCode");
        sb.append('=');
        sb.append(((this.trCode == null)?"<null>":this.trCode));
        sb.append(',');
        sb.append("idSeq");
        sb.append('=');
        sb.append(((this.idSeq == null)?"<null>":this.idSeq));
        sb.append(',');
        sb.append("lastNameSeq");
        sb.append('=');
        sb.append(((this.lastNameSeq == null)?"<null>":this.lastNameSeq));
        sb.append(',');
        sb.append("firstNameSeq");
        sb.append('=');
        sb.append(((this.firstNameSeq == null)?"<null>":this.firstNameSeq));
        sb.append(',');
        sb.append("posn");
        sb.append('=');
        sb.append(((this.posn == null)?"<null>":this.posn));
        sb.append(',');
        sb.append("suff");
        sb.append('=');
        sb.append(((this.suff == null)?"<null>":this.suff));
        sb.append(',');
        sb.append("effectiveDate");
        sb.append('=');
        sb.append(((this.effectiveDate == null)?"<null>":this.effectiveDate));
        sb.append(',');
        sb.append("disp");
        sb.append('=');
        sb.append(((this.disp == null)?"<null>":this.disp));
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
        if ((other instanceof HistoryJobsInquiry100QapiPost) == false) {
            return false;
        }
        HistoryJobsInquiry100QapiPost rhs = ((HistoryJobsInquiry100QapiPost) other);
        return (((((((((((((((this.year == rhs.year)||((this.year!= null)&&this.year.equals(rhs.year)))&&((this.disp == rhs.disp)||((this.disp!= null)&&this.disp.equals(rhs.disp))))&&((this.lastNameSeq == rhs.lastNameSeq)||((this.lastNameSeq!= null)&&this.lastNameSeq.equals(rhs.lastNameSeq))))&&((this.posn == rhs.posn)||((this.posn!= null)&&this.posn.equals(rhs.posn))))&&((this.firstNameSeq == rhs.firstNameSeq)||((this.firstNameSeq!= null)&&this.firstNameSeq.equals(rhs.firstNameSeq))))&&((this.coas == rhs.coas)||((this.coas!= null)&&this.coas.equals(rhs.coas))))&&((this.payno == rhs.payno)||((this.payno!= null)&&this.payno.equals(rhs.payno))))&&((this.idSeq == rhs.idSeq)||((this.idSeq!= null)&&this.idSeq.equals(rhs.idSeq))))&&((this.pictCode == rhs.pictCode)||((this.pictCode!= null)&&this.pictCode.equals(rhs.pictCode))))&&((this.trCode == rhs.trCode)||((this.trCode!= null)&&this.trCode.equals(rhs.trCode))))&&((this.suff == rhs.suff)||((this.suff!= null)&&this.suff.equals(rhs.suff))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.orgn == rhs.orgn)||((this.orgn!= null)&&this.orgn.equals(rhs.orgn))))&&((this.effectiveDate == rhs.effectiveDate)||((this.effectiveDate!= null)&&this.effectiveDate.equals(rhs.effectiveDate))));
    }

}
