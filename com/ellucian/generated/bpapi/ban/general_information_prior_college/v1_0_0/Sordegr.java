
package com.ellucian.generated.bpapi.ban.general_information_prior_college.v1_0_0;

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
    "dlevDesc",
    "termDegree",
    "dlev",
    "degcDate",
    "degcCode",
    "attendTo",
    "degcDesc",
    "attendFrom"
})
@Generated("jsonschema2pojo")
public class Sordegr {

    /**
     * Hours
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
    @JsonProperty("dlevDesc")
    private String dlevDesc;
    /**
     * Terminal Degree
     * <p>
     * Lineage reference object : SORDEGR_TERM_DEGREE
     * 
     */
    @JsonProperty("termDegree")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_TERM_DEGREE")
    private String termDegree;
    /**
     * Level
     * <p>
     * 
     * 
     */
    @JsonProperty("dlev")
    private String dlev;
    /**
     * Graduation Date
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
     * (Required)
     * 
     */
    @JsonProperty("degcCode")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_DEGC_CODE, Lookup lineage reference object : stvdegc")
    private String degcCode;
    /**
     * Last Attended Date
     * <p>
     * Lineage reference object : SORDEGR_ATTEND_TO
     * 
     */
    @JsonProperty("attendTo")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_ATTEND_TO")
    private Date attendTo;
    @JsonProperty("degcDesc")
    private String degcDesc;
    /**
     * First Attended Date
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

    public Sordegr withGpaTransferred(Double gpaTransferred) {
        this.gpaTransferred = gpaTransferred;
        return this;
    }

    @JsonProperty("dlevDesc")
    public String getDlevDesc() {
        return dlevDesc;
    }

    @JsonProperty("dlevDesc")
    public void setDlevDesc(String dlevDesc) {
        this.dlevDesc = dlevDesc;
    }

    public Sordegr withDlevDesc(String dlevDesc) {
        this.dlevDesc = dlevDesc;
        return this;
    }

    /**
     * Terminal Degree
     * <p>
     * Lineage reference object : SORDEGR_TERM_DEGREE
     * 
     */
    @JsonProperty("termDegree")
    public String getTermDegree() {
        return termDegree;
    }

    /**
     * Terminal Degree
     * <p>
     * Lineage reference object : SORDEGR_TERM_DEGREE
     * 
     */
    @JsonProperty("termDegree")
    public void setTermDegree(String termDegree) {
        this.termDegree = termDegree;
    }

    public Sordegr withTermDegree(String termDegree) {
        this.termDegree = termDegree;
        return this;
    }

    /**
     * Level
     * <p>
     * 
     * 
     */
    @JsonProperty("dlev")
    public String getDlev() {
        return dlev;
    }

    /**
     * Level
     * <p>
     * 
     * 
     */
    @JsonProperty("dlev")
    public void setDlev(String dlev) {
        this.dlev = dlev;
    }

    public Sordegr withDlev(String dlev) {
        this.dlev = dlev;
        return this;
    }

    /**
     * Graduation Date
     * <p>
     * Lineage reference object : SORDEGR_DEGC_DATE
     * 
     */
    @JsonProperty("degcDate")
    public Date getDegcDate() {
        return degcDate;
    }

    /**
     * Graduation Date
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
     * (Required)
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
     * (Required)
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
     * Last Attended Date
     * <p>
     * Lineage reference object : SORDEGR_ATTEND_TO
     * 
     */
    @JsonProperty("attendTo")
    public Date getAttendTo() {
        return attendTo;
    }

    /**
     * Last Attended Date
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

    @JsonProperty("degcDesc")
    public String getDegcDesc() {
        return degcDesc;
    }

    @JsonProperty("degcDesc")
    public void setDegcDesc(String degcDesc) {
        this.degcDesc = degcDesc;
    }

    public Sordegr withDegcDesc(String degcDesc) {
        this.degcDesc = degcDesc;
        return this;
    }

    /**
     * First Attended Date
     * <p>
     * Lineage reference object : SORDEGR_ATTEND_FROM
     * 
     */
    @JsonProperty("attendFrom")
    public Date getAttendFrom() {
        return attendFrom;
    }

    /**
     * First Attended Date
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
        sb.append("hoursTransferred");
        sb.append('=');
        sb.append(((this.hoursTransferred == null)?"<null>":this.hoursTransferred));
        sb.append(',');
        sb.append("gpaTransferred");
        sb.append('=');
        sb.append(((this.gpaTransferred == null)?"<null>":this.gpaTransferred));
        sb.append(',');
        sb.append("dlevDesc");
        sb.append('=');
        sb.append(((this.dlevDesc == null)?"<null>":this.dlevDesc));
        sb.append(',');
        sb.append("termDegree");
        sb.append('=');
        sb.append(((this.termDegree == null)?"<null>":this.termDegree));
        sb.append(',');
        sb.append("dlev");
        sb.append('=');
        sb.append(((this.dlev == null)?"<null>":this.dlev));
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
        sb.append("degcDesc");
        sb.append('=');
        sb.append(((this.degcDesc == null)?"<null>":this.degcDesc));
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
        result = ((result* 31)+((this.hoursTransferred == null)? 0 :this.hoursTransferred.hashCode()));
        result = ((result* 31)+((this.gpaTransferred == null)? 0 :this.gpaTransferred.hashCode()));
        result = ((result* 31)+((this.dlevDesc == null)? 0 :this.dlevDesc.hashCode()));
        result = ((result* 31)+((this.termDegree == null)? 0 :this.termDegree.hashCode()));
        result = ((result* 31)+((this.dlev == null)? 0 :this.dlev.hashCode()));
        result = ((result* 31)+((this.degcDate == null)? 0 :this.degcDate.hashCode()));
        result = ((result* 31)+((this.degcCode == null)? 0 :this.degcCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.attendTo == null)? 0 :this.attendTo.hashCode()));
        result = ((result* 31)+((this.degcDesc == null)? 0 :this.degcDesc.hashCode()));
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
        return ((((((((((((this.hoursTransferred == rhs.hoursTransferred)||((this.hoursTransferred!= null)&&this.hoursTransferred.equals(rhs.hoursTransferred)))&&((this.gpaTransferred == rhs.gpaTransferred)||((this.gpaTransferred!= null)&&this.gpaTransferred.equals(rhs.gpaTransferred))))&&((this.dlevDesc == rhs.dlevDesc)||((this.dlevDesc!= null)&&this.dlevDesc.equals(rhs.dlevDesc))))&&((this.termDegree == rhs.termDegree)||((this.termDegree!= null)&&this.termDegree.equals(rhs.termDegree))))&&((this.dlev == rhs.dlev)||((this.dlev!= null)&&this.dlev.equals(rhs.dlev))))&&((this.degcDate == rhs.degcDate)||((this.degcDate!= null)&&this.degcDate.equals(rhs.degcDate))))&&((this.degcCode == rhs.degcCode)||((this.degcCode!= null)&&this.degcCode.equals(rhs.degcCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.attendTo == rhs.attendTo)||((this.attendTo!= null)&&this.attendTo.equals(rhs.attendTo))))&&((this.degcDesc == rhs.degcDesc)||((this.degcDesc!= null)&&this.degcDesc.equals(rhs.degcDesc))))&&((this.attendFrom == rhs.attendFrom)||((this.attendFrom!= null)&&this.attendFrom.equals(rhs.attendFrom))));
    }

}
