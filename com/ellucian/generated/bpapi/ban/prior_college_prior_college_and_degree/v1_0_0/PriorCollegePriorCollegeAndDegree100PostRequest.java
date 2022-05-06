
package com.ellucian.generated.bpapi.ban.prior_college_prior_college_and_degree.v1_0_0;

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
    "hoursTransferred",
    "gpaTransferred",
    "sbgiCode",
    "degcDate",
    "degcCode",
    "attendTo",
    "transRecvDate",
    "attendFrom",
    "degcYear",
    "honrCode",
    "admrCode",
    "officialTrans",
    "egolCode",
    "transRevDate",
    "id",
    "collCode",
    "primaryInd"
})
@Generated("jsonschema2pojo")
public class PriorCollegePriorCollegeAndDegree100PostRequest {

    /**
     * Transfer Hours
     * <p>
     * Lineage reference object : SORDEGR_HOURS_TRANSFERRED
     * 
     */
    @JsonProperty("hoursTransferred")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_HOURS_TRANSFERRED")
    private Double hoursTransferred;
    /**
     * GPA
     * <p>
     * Lineage reference object : SORDEGR_GPA_TRANSFERRED
     * 
     */
    @JsonProperty("gpaTransferred")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_GPA_TRANSFERRED")
    private Double gpaTransferred;
    /**
     * Prior College
     * <p>
     * Lineage reference object : SORPCOL_SBGI_CODE
     * 
     */
    @JsonProperty("sbgiCode")
    @JsonPropertyDescription("Lineage reference object : SORPCOL_SBGI_CODE")
    private String sbgiCode;
    /**
     * Degree Date
     * <p>
     * Lineage reference object : SORDEGR_DEGC_DATE
     * 
     */
    @JsonProperty("degcDate")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_DEGC_DATE")
    private Date degcDate;
    /**
     * Degree
     * <p>
     * Lineage reference object : SORDEGR_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degcCode")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_DEGC_CODE, Lookup lineage reference object : stvdegc")
    private String degcCode;
    /**
     * Attended To
     * <p>
     * Lineage reference object : SORDEGR_ATTEND_TO
     * 
     */
    @JsonProperty("attendTo")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_ATTEND_TO")
    private Date attendTo;
    /**
     * Transcript Received Date
     * <p>
     * Lineage reference object : SORPCOL_TRANS_RECV_DATE
     * 
     */
    @JsonProperty("transRecvDate")
    @JsonPropertyDescription("Lineage reference object : SORPCOL_TRANS_RECV_DATE")
    private Date transRecvDate;
    /**
     * Attended From
     * <p>
     * Lineage reference object : SORDEGR_ATTEND_FROM
     * 
     */
    @JsonProperty("attendFrom")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_ATTEND_FROM")
    private Date attendFrom;
    /**
     * Year
     * <p>
     * Lineage reference object : SORDEGR_DEGC_YEAR
     * 
     */
    @JsonProperty("degcYear")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_DEGC_YEAR")
    private String degcYear;
    /**
     * Honors
     * <p>
     * Lineage reference object : SORDEGR_HONR_CODE, Lookup lineage reference object : stvhonr
     * 
     */
    @JsonProperty("honrCode")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_HONR_CODE, Lookup lineage reference object : stvhonr")
    private String honrCode;
    /**
     * Admissions Request
     * <p>
     * Lineage reference object : SORPCOL_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("admrCode")
    @JsonPropertyDescription("Lineage reference object : SORPCOL_ADMR_CODE, Lookup lineage reference object : stvadmr")
    private String admrCode;
    /**
     * Official Transcript
     * <p>
     * Lineage reference object : SORPCOL_OFFICIAL_TRANS
     * 
     */
    @JsonProperty("officialTrans")
    @JsonPropertyDescription("Lineage reference object : SORPCOL_OFFICIAL_TRANS")
    private String officialTrans;
    /**
     * Goal
     * <p>
     * Lineage reference object : SORDEGR_EGOL_CODE, Lookup lineage reference object : stvegol
     * 
     */
    @JsonProperty("egolCode")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_EGOL_CODE, Lookup lineage reference object : stvegol")
    private String egolCode;
    /**
     * Transcript Reviewed Date
     * <p>
     * Lineage reference object : SORPCOL_TRANS_REV_DATE
     * 
     */
    @JsonProperty("transRevDate")
    @JsonPropertyDescription("Lineage reference object : SORPCOL_TRANS_REV_DATE")
    private Date transRevDate;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
    /**
     * College
     * <p>
     * Lineage reference object : SORDEGR_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_COLL_CODE, Lookup lineage reference object : stvcoll")
    private String collCode;
    /**
     * Primary Degree Indicator
     * <p>
     * Lineage reference object : SORDEGR_PRIMARY_IND
     * 
     */
    @JsonProperty("primaryInd")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_PRIMARY_IND")
    private String primaryInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Transfer Hours
     * <p>
     * Lineage reference object : SORDEGR_HOURS_TRANSFERRED
     * 
     */
    @JsonProperty("hoursTransferred")
    public Double getHoursTransferred() {
        return hoursTransferred;
    }

    /**
     * Transfer Hours
     * <p>
     * Lineage reference object : SORDEGR_HOURS_TRANSFERRED
     * 
     */
    @JsonProperty("hoursTransferred")
    public void setHoursTransferred(Double hoursTransferred) {
        this.hoursTransferred = hoursTransferred;
    }

    public PriorCollegePriorCollegeAndDegree100PostRequest withHoursTransferred(Double hoursTransferred) {
        this.hoursTransferred = hoursTransferred;
        return this;
    }

    /**
     * GPA
     * <p>
     * Lineage reference object : SORDEGR_GPA_TRANSFERRED
     * 
     */
    @JsonProperty("gpaTransferred")
    public Double getGpaTransferred() {
        return gpaTransferred;
    }

    /**
     * GPA
     * <p>
     * Lineage reference object : SORDEGR_GPA_TRANSFERRED
     * 
     */
    @JsonProperty("gpaTransferred")
    public void setGpaTransferred(Double gpaTransferred) {
        this.gpaTransferred = gpaTransferred;
    }

    public PriorCollegePriorCollegeAndDegree100PostRequest withGpaTransferred(Double gpaTransferred) {
        this.gpaTransferred = gpaTransferred;
        return this;
    }

    /**
     * Prior College
     * <p>
     * Lineage reference object : SORPCOL_SBGI_CODE
     * 
     */
    @JsonProperty("sbgiCode")
    public String getSbgiCode() {
        return sbgiCode;
    }

    /**
     * Prior College
     * <p>
     * Lineage reference object : SORPCOL_SBGI_CODE
     * 
     */
    @JsonProperty("sbgiCode")
    public void setSbgiCode(String sbgiCode) {
        this.sbgiCode = sbgiCode;
    }

    public PriorCollegePriorCollegeAndDegree100PostRequest withSbgiCode(String sbgiCode) {
        this.sbgiCode = sbgiCode;
        return this;
    }

    /**
     * Degree Date
     * <p>
     * Lineage reference object : SORDEGR_DEGC_DATE
     * 
     */
    @JsonProperty("degcDate")
    public Date getDegcDate() {
        return degcDate;
    }

    /**
     * Degree Date
     * <p>
     * Lineage reference object : SORDEGR_DEGC_DATE
     * 
     */
    @JsonProperty("degcDate")
    public void setDegcDate(Date degcDate) {
        this.degcDate = degcDate;
    }

    public PriorCollegePriorCollegeAndDegree100PostRequest withDegcDate(Date degcDate) {
        this.degcDate = degcDate;
        return this;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SORDEGR_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degcCode")
    public String getDegcCode() {
        return degcCode;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SORDEGR_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degcCode")
    public void setDegcCode(String degcCode) {
        this.degcCode = degcCode;
    }

    public PriorCollegePriorCollegeAndDegree100PostRequest withDegcCode(String degcCode) {
        this.degcCode = degcCode;
        return this;
    }

    /**
     * Attended To
     * <p>
     * Lineage reference object : SORDEGR_ATTEND_TO
     * 
     */
    @JsonProperty("attendTo")
    public Date getAttendTo() {
        return attendTo;
    }

    /**
     * Attended To
     * <p>
     * Lineage reference object : SORDEGR_ATTEND_TO
     * 
     */
    @JsonProperty("attendTo")
    public void setAttendTo(Date attendTo) {
        this.attendTo = attendTo;
    }

    public PriorCollegePriorCollegeAndDegree100PostRequest withAttendTo(Date attendTo) {
        this.attendTo = attendTo;
        return this;
    }

    /**
     * Transcript Received Date
     * <p>
     * Lineage reference object : SORPCOL_TRANS_RECV_DATE
     * 
     */
    @JsonProperty("transRecvDate")
    public Date getTransRecvDate() {
        return transRecvDate;
    }

    /**
     * Transcript Received Date
     * <p>
     * Lineage reference object : SORPCOL_TRANS_RECV_DATE
     * 
     */
    @JsonProperty("transRecvDate")
    public void setTransRecvDate(Date transRecvDate) {
        this.transRecvDate = transRecvDate;
    }

    public PriorCollegePriorCollegeAndDegree100PostRequest withTransRecvDate(Date transRecvDate) {
        this.transRecvDate = transRecvDate;
        return this;
    }

    /**
     * Attended From
     * <p>
     * Lineage reference object : SORDEGR_ATTEND_FROM
     * 
     */
    @JsonProperty("attendFrom")
    public Date getAttendFrom() {
        return attendFrom;
    }

    /**
     * Attended From
     * <p>
     * Lineage reference object : SORDEGR_ATTEND_FROM
     * 
     */
    @JsonProperty("attendFrom")
    public void setAttendFrom(Date attendFrom) {
        this.attendFrom = attendFrom;
    }

    public PriorCollegePriorCollegeAndDegree100PostRequest withAttendFrom(Date attendFrom) {
        this.attendFrom = attendFrom;
        return this;
    }

    /**
     * Year
     * <p>
     * Lineage reference object : SORDEGR_DEGC_YEAR
     * 
     */
    @JsonProperty("degcYear")
    public String getDegcYear() {
        return degcYear;
    }

    /**
     * Year
     * <p>
     * Lineage reference object : SORDEGR_DEGC_YEAR
     * 
     */
    @JsonProperty("degcYear")
    public void setDegcYear(String degcYear) {
        this.degcYear = degcYear;
    }

    public PriorCollegePriorCollegeAndDegree100PostRequest withDegcYear(String degcYear) {
        this.degcYear = degcYear;
        return this;
    }

    /**
     * Honors
     * <p>
     * Lineage reference object : SORDEGR_HONR_CODE, Lookup lineage reference object : stvhonr
     * 
     */
    @JsonProperty("honrCode")
    public String getHonrCode() {
        return honrCode;
    }

    /**
     * Honors
     * <p>
     * Lineage reference object : SORDEGR_HONR_CODE, Lookup lineage reference object : stvhonr
     * 
     */
    @JsonProperty("honrCode")
    public void setHonrCode(String honrCode) {
        this.honrCode = honrCode;
    }

    public PriorCollegePriorCollegeAndDegree100PostRequest withHonrCode(String honrCode) {
        this.honrCode = honrCode;
        return this;
    }

    /**
     * Admissions Request
     * <p>
     * Lineage reference object : SORPCOL_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("admrCode")
    public String getAdmrCode() {
        return admrCode;
    }

    /**
     * Admissions Request
     * <p>
     * Lineage reference object : SORPCOL_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("admrCode")
    public void setAdmrCode(String admrCode) {
        this.admrCode = admrCode;
    }

    public PriorCollegePriorCollegeAndDegree100PostRequest withAdmrCode(String admrCode) {
        this.admrCode = admrCode;
        return this;
    }

    /**
     * Official Transcript
     * <p>
     * Lineage reference object : SORPCOL_OFFICIAL_TRANS
     * 
     */
    @JsonProperty("officialTrans")
    public String getOfficialTrans() {
        return officialTrans;
    }

    /**
     * Official Transcript
     * <p>
     * Lineage reference object : SORPCOL_OFFICIAL_TRANS
     * 
     */
    @JsonProperty("officialTrans")
    public void setOfficialTrans(String officialTrans) {
        this.officialTrans = officialTrans;
    }

    public PriorCollegePriorCollegeAndDegree100PostRequest withOfficialTrans(String officialTrans) {
        this.officialTrans = officialTrans;
        return this;
    }

    /**
     * Goal
     * <p>
     * Lineage reference object : SORDEGR_EGOL_CODE, Lookup lineage reference object : stvegol
     * 
     */
    @JsonProperty("egolCode")
    public String getEgolCode() {
        return egolCode;
    }

    /**
     * Goal
     * <p>
     * Lineage reference object : SORDEGR_EGOL_CODE, Lookup lineage reference object : stvegol
     * 
     */
    @JsonProperty("egolCode")
    public void setEgolCode(String egolCode) {
        this.egolCode = egolCode;
    }

    public PriorCollegePriorCollegeAndDegree100PostRequest withEgolCode(String egolCode) {
        this.egolCode = egolCode;
        return this;
    }

    /**
     * Transcript Reviewed Date
     * <p>
     * Lineage reference object : SORPCOL_TRANS_REV_DATE
     * 
     */
    @JsonProperty("transRevDate")
    public Date getTransRevDate() {
        return transRevDate;
    }

    /**
     * Transcript Reviewed Date
     * <p>
     * Lineage reference object : SORPCOL_TRANS_REV_DATE
     * 
     */
    @JsonProperty("transRevDate")
    public void setTransRevDate(Date transRevDate) {
        this.transRevDate = transRevDate;
    }

    public PriorCollegePriorCollegeAndDegree100PostRequest withTransRevDate(Date transRevDate) {
        this.transRevDate = transRevDate;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public PriorCollegePriorCollegeAndDegree100PostRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SORDEGR_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    public String getCollCode() {
        return collCode;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SORDEGR_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    public void setCollCode(String collCode) {
        this.collCode = collCode;
    }

    public PriorCollegePriorCollegeAndDegree100PostRequest withCollCode(String collCode) {
        this.collCode = collCode;
        return this;
    }

    /**
     * Primary Degree Indicator
     * <p>
     * Lineage reference object : SORDEGR_PRIMARY_IND
     * 
     */
    @JsonProperty("primaryInd")
    public String getPrimaryInd() {
        return primaryInd;
    }

    /**
     * Primary Degree Indicator
     * <p>
     * Lineage reference object : SORDEGR_PRIMARY_IND
     * 
     */
    @JsonProperty("primaryInd")
    public void setPrimaryInd(String primaryInd) {
        this.primaryInd = primaryInd;
    }

    public PriorCollegePriorCollegeAndDegree100PostRequest withPrimaryInd(String primaryInd) {
        this.primaryInd = primaryInd;
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

    public PriorCollegePriorCollegeAndDegree100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PriorCollegePriorCollegeAndDegree100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("hoursTransferred");
        sb.append('=');
        sb.append(((this.hoursTransferred == null)?"<null>":this.hoursTransferred));
        sb.append(',');
        sb.append("gpaTransferred");
        sb.append('=');
        sb.append(((this.gpaTransferred == null)?"<null>":this.gpaTransferred));
        sb.append(',');
        sb.append("sbgiCode");
        sb.append('=');
        sb.append(((this.sbgiCode == null)?"<null>":this.sbgiCode));
        sb.append(',');
        sb.append("degcDate");
        sb.append('=');
        sb.append(((this.degcDate == null)?"<null>":this.degcDate));
        sb.append(',');
        sb.append("degcCode");
        sb.append('=');
        sb.append(((this.degcCode == null)?"<null>":this.degcCode));
        sb.append(',');
        sb.append("attendTo");
        sb.append('=');
        sb.append(((this.attendTo == null)?"<null>":this.attendTo));
        sb.append(',');
        sb.append("transRecvDate");
        sb.append('=');
        sb.append(((this.transRecvDate == null)?"<null>":this.transRecvDate));
        sb.append(',');
        sb.append("attendFrom");
        sb.append('=');
        sb.append(((this.attendFrom == null)?"<null>":this.attendFrom));
        sb.append(',');
        sb.append("degcYear");
        sb.append('=');
        sb.append(((this.degcYear == null)?"<null>":this.degcYear));
        sb.append(',');
        sb.append("honrCode");
        sb.append('=');
        sb.append(((this.honrCode == null)?"<null>":this.honrCode));
        sb.append(',');
        sb.append("admrCode");
        sb.append('=');
        sb.append(((this.admrCode == null)?"<null>":this.admrCode));
        sb.append(',');
        sb.append("officialTrans");
        sb.append('=');
        sb.append(((this.officialTrans == null)?"<null>":this.officialTrans));
        sb.append(',');
        sb.append("egolCode");
        sb.append('=');
        sb.append(((this.egolCode == null)?"<null>":this.egolCode));
        sb.append(',');
        sb.append("transRevDate");
        sb.append('=');
        sb.append(((this.transRevDate == null)?"<null>":this.transRevDate));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("collCode");
        sb.append('=');
        sb.append(((this.collCode == null)?"<null>":this.collCode));
        sb.append(',');
        sb.append("primaryInd");
        sb.append('=');
        sb.append(((this.primaryInd == null)?"<null>":this.primaryInd));
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
        result = ((result* 31)+((this.hoursTransferred == null)? 0 :this.hoursTransferred.hashCode()));
        result = ((result* 31)+((this.gpaTransferred == null)? 0 :this.gpaTransferred.hashCode()));
        result = ((result* 31)+((this.sbgiCode == null)? 0 :this.sbgiCode.hashCode()));
        result = ((result* 31)+((this.degcDate == null)? 0 :this.degcDate.hashCode()));
        result = ((result* 31)+((this.degcCode == null)? 0 :this.degcCode.hashCode()));
        result = ((result* 31)+((this.attendTo == null)? 0 :this.attendTo.hashCode()));
        result = ((result* 31)+((this.transRecvDate == null)? 0 :this.transRecvDate.hashCode()));
        result = ((result* 31)+((this.attendFrom == null)? 0 :this.attendFrom.hashCode()));
        result = ((result* 31)+((this.degcYear == null)? 0 :this.degcYear.hashCode()));
        result = ((result* 31)+((this.honrCode == null)? 0 :this.honrCode.hashCode()));
        result = ((result* 31)+((this.admrCode == null)? 0 :this.admrCode.hashCode()));
        result = ((result* 31)+((this.officialTrans == null)? 0 :this.officialTrans.hashCode()));
        result = ((result* 31)+((this.egolCode == null)? 0 :this.egolCode.hashCode()));
        result = ((result* 31)+((this.transRevDate == null)? 0 :this.transRevDate.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.collCode == null)? 0 :this.collCode.hashCode()));
        result = ((result* 31)+((this.primaryInd == null)? 0 :this.primaryInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PriorCollegePriorCollegeAndDegree100PostRequest) == false) {
            return false;
        }
        PriorCollegePriorCollegeAndDegree100PostRequest rhs = ((PriorCollegePriorCollegeAndDegree100PostRequest) other);
        return (((((((((((((((((((this.hoursTransferred == rhs.hoursTransferred)||((this.hoursTransferred!= null)&&this.hoursTransferred.equals(rhs.hoursTransferred)))&&((this.gpaTransferred == rhs.gpaTransferred)||((this.gpaTransferred!= null)&&this.gpaTransferred.equals(rhs.gpaTransferred))))&&((this.sbgiCode == rhs.sbgiCode)||((this.sbgiCode!= null)&&this.sbgiCode.equals(rhs.sbgiCode))))&&((this.degcDate == rhs.degcDate)||((this.degcDate!= null)&&this.degcDate.equals(rhs.degcDate))))&&((this.degcCode == rhs.degcCode)||((this.degcCode!= null)&&this.degcCode.equals(rhs.degcCode))))&&((this.attendTo == rhs.attendTo)||((this.attendTo!= null)&&this.attendTo.equals(rhs.attendTo))))&&((this.transRecvDate == rhs.transRecvDate)||((this.transRecvDate!= null)&&this.transRecvDate.equals(rhs.transRecvDate))))&&((this.attendFrom == rhs.attendFrom)||((this.attendFrom!= null)&&this.attendFrom.equals(rhs.attendFrom))))&&((this.degcYear == rhs.degcYear)||((this.degcYear!= null)&&this.degcYear.equals(rhs.degcYear))))&&((this.honrCode == rhs.honrCode)||((this.honrCode!= null)&&this.honrCode.equals(rhs.honrCode))))&&((this.admrCode == rhs.admrCode)||((this.admrCode!= null)&&this.admrCode.equals(rhs.admrCode))))&&((this.officialTrans == rhs.officialTrans)||((this.officialTrans!= null)&&this.officialTrans.equals(rhs.officialTrans))))&&((this.egolCode == rhs.egolCode)||((this.egolCode!= null)&&this.egolCode.equals(rhs.egolCode))))&&((this.transRevDate == rhs.transRevDate)||((this.transRevDate!= null)&&this.transRevDate.equals(rhs.transRevDate))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.primaryInd == rhs.primaryInd)||((this.primaryInd!= null)&&this.primaryInd.equals(rhs.primaryInd))));
    }

}
