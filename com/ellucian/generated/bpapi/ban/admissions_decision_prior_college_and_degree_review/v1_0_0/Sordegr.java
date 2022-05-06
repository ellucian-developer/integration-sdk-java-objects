
package com.ellucian.generated.bpapi.ban.admissions_decision_prior_college_and_degree_review.v1_0_0;

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
    "degcYear",
    "honrCode",
    "hoursTransferred",
    "stvdegcDesc",
    "gpaTransDisplay",
    "degcDate",
    "degcCode",
    "attendTo",
    "collCode",
    "attendFrom"
})
@Generated("jsonschema2pojo")
public class Sordegr {

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
     * Hours
     * <p>
     * Lineage reference object : SORDEGR_HOURS_TRANSFERRED
     * 
     */
    @JsonProperty("hoursTransferred")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_HOURS_TRANSFERRED")
    private Double hoursTransferred;
    @JsonProperty("stvdegcDesc")
    private String stvdegcDesc;
    /**
     * GPA
     * <p>
     * 
     * 
     */
    @JsonProperty("gpaTransDisplay")
    private Double gpaTransDisplay;
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
     * College
     * <p>
     * Lineage reference object : SORDEGR_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_COLL_CODE, Lookup lineage reference object : stvcoll")
    private String collCode;
    /**
     * Attended From
     * <p>
     * Lineage reference object : SORDEGR_ATTEND_FROM
     * 
     */
    @JsonProperty("attendFrom")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_ATTEND_FROM")
    private Date attendFrom;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public Sordegr withDegcYear(String degcYear) {
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

    public Sordegr withHonrCode(String honrCode) {
        this.honrCode = honrCode;
        return this;
    }

    /**
     * Hours
     * <p>
     * Lineage reference object : SORDEGR_HOURS_TRANSFERRED
     * 
     */
    @JsonProperty("hoursTransferred")
    public Double getHoursTransferred() {
        return hoursTransferred;
    }

    /**
     * Hours
     * <p>
     * Lineage reference object : SORDEGR_HOURS_TRANSFERRED
     * 
     */
    @JsonProperty("hoursTransferred")
    public void setHoursTransferred(Double hoursTransferred) {
        this.hoursTransferred = hoursTransferred;
    }

    public Sordegr withHoursTransferred(Double hoursTransferred) {
        this.hoursTransferred = hoursTransferred;
        return this;
    }

    @JsonProperty("stvdegcDesc")
    public String getStvdegcDesc() {
        return stvdegcDesc;
    }

    @JsonProperty("stvdegcDesc")
    public void setStvdegcDesc(String stvdegcDesc) {
        this.stvdegcDesc = stvdegcDesc;
    }

    public Sordegr withStvdegcDesc(String stvdegcDesc) {
        this.stvdegcDesc = stvdegcDesc;
        return this;
    }

    /**
     * GPA
     * <p>
     * 
     * 
     */
    @JsonProperty("gpaTransDisplay")
    public Double getGpaTransDisplay() {
        return gpaTransDisplay;
    }

    /**
     * GPA
     * <p>
     * 
     * 
     */
    @JsonProperty("gpaTransDisplay")
    public void setGpaTransDisplay(Double gpaTransDisplay) {
        this.gpaTransDisplay = gpaTransDisplay;
    }

    public Sordegr withGpaTransDisplay(Double gpaTransDisplay) {
        this.gpaTransDisplay = gpaTransDisplay;
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

    public Sordegr withDegcDate(Date degcDate) {
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

    public Sordegr withDegcCode(String degcCode) {
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

    public Sordegr withAttendTo(Date attendTo) {
        this.attendTo = attendTo;
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

    public Sordegr withCollCode(String collCode) {
        this.collCode = collCode;
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

    public Sordegr withAttendFrom(Date attendFrom) {
        this.attendFrom = attendFrom;
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

    public Sordegr withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sordegr.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("degcYear");
        sb.append('=');
        sb.append(((this.degcYear == null)?"<null>":this.degcYear));
        sb.append(',');
        sb.append("honrCode");
        sb.append('=');
        sb.append(((this.honrCode == null)?"<null>":this.honrCode));
        sb.append(',');
        sb.append("hoursTransferred");
        sb.append('=');
        sb.append(((this.hoursTransferred == null)?"<null>":this.hoursTransferred));
        sb.append(',');
        sb.append("stvdegcDesc");
        sb.append('=');
        sb.append(((this.stvdegcDesc == null)?"<null>":this.stvdegcDesc));
        sb.append(',');
        sb.append("gpaTransDisplay");
        sb.append('=');
        sb.append(((this.gpaTransDisplay == null)?"<null>":this.gpaTransDisplay));
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
        sb.append("collCode");
        sb.append('=');
        sb.append(((this.collCode == null)?"<null>":this.collCode));
        sb.append(',');
        sb.append("attendFrom");
        sb.append('=');
        sb.append(((this.attendFrom == null)?"<null>":this.attendFrom));
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
        result = ((result* 31)+((this.degcYear == null)? 0 :this.degcYear.hashCode()));
        result = ((result* 31)+((this.honrCode == null)? 0 :this.honrCode.hashCode()));
        result = ((result* 31)+((this.hoursTransferred == null)? 0 :this.hoursTransferred.hashCode()));
        result = ((result* 31)+((this.stvdegcDesc == null)? 0 :this.stvdegcDesc.hashCode()));
        result = ((result* 31)+((this.gpaTransDisplay == null)? 0 :this.gpaTransDisplay.hashCode()));
        result = ((result* 31)+((this.degcDate == null)? 0 :this.degcDate.hashCode()));
        result = ((result* 31)+((this.degcCode == null)? 0 :this.degcCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.attendTo == null)? 0 :this.attendTo.hashCode()));
        result = ((result* 31)+((this.collCode == null)? 0 :this.collCode.hashCode()));
        result = ((result* 31)+((this.attendFrom == null)? 0 :this.attendFrom.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sordegr) == false) {
            return false;
        }
        Sordegr rhs = ((Sordegr) other);
        return ((((((((((((this.degcYear == rhs.degcYear)||((this.degcYear!= null)&&this.degcYear.equals(rhs.degcYear)))&&((this.honrCode == rhs.honrCode)||((this.honrCode!= null)&&this.honrCode.equals(rhs.honrCode))))&&((this.hoursTransferred == rhs.hoursTransferred)||((this.hoursTransferred!= null)&&this.hoursTransferred.equals(rhs.hoursTransferred))))&&((this.stvdegcDesc == rhs.stvdegcDesc)||((this.stvdegcDesc!= null)&&this.stvdegcDesc.equals(rhs.stvdegcDesc))))&&((this.gpaTransDisplay == rhs.gpaTransDisplay)||((this.gpaTransDisplay!= null)&&this.gpaTransDisplay.equals(rhs.gpaTransDisplay))))&&((this.degcDate == rhs.degcDate)||((this.degcDate!= null)&&this.degcDate.equals(rhs.degcDate))))&&((this.degcCode == rhs.degcCode)||((this.degcCode!= null)&&this.degcCode.equals(rhs.degcCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.attendTo == rhs.attendTo)||((this.attendTo!= null)&&this.attendTo.equals(rhs.attendTo))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.attendFrom == rhs.attendFrom)||((this.attendFrom!= null)&&this.attendFrom.equals(rhs.attendFrom))));
    }

}
