
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
    "egolDesc",
    "degrDesc",
    "degcDate",
    "degcCode",
    "attendTo",
    "attendFrom",
    "degcYear",
    "honrCode",
    "honrDesc",
    "collDesc",
    "egolCode",
    "collCode",
    "primaryInd"
})
@Generated("jsonschema2pojo")
public class Sordegr {

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
    @JsonProperty("egolDesc")
    private String egolDesc;
    /**
     * Degree Description
     * <p>
     * 
     * 
     */
    @JsonProperty("degrDesc")
    private String degrDesc;
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
    @JsonProperty("honrDesc")
    private String honrDesc;
    /**
     * College Description
     * <p>
     * 
     * 
     */
    @JsonProperty("collDesc")
    private String collDesc;
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

    @JsonProperty("egolDesc")
    public String getEgolDesc() {
        return egolDesc;
    }

    @JsonProperty("egolDesc")
    public void setEgolDesc(String egolDesc) {
        this.egolDesc = egolDesc;
    }

    public Sordegr withEgolDesc(String egolDesc) {
        this.egolDesc = egolDesc;
        return this;
    }

    /**
     * Degree Description
     * <p>
     * 
     * 
     */
    @JsonProperty("degrDesc")
    public String getDegrDesc() {
        return degrDesc;
    }

    /**
     * Degree Description
     * <p>
     * 
     * 
     */
    @JsonProperty("degrDesc")
    public void setDegrDesc(String degrDesc) {
        this.degrDesc = degrDesc;
    }

    public Sordegr withDegrDesc(String degrDesc) {
        this.degrDesc = degrDesc;
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

    @JsonProperty("honrDesc")
    public String getHonrDesc() {
        return honrDesc;
    }

    @JsonProperty("honrDesc")
    public void setHonrDesc(String honrDesc) {
        this.honrDesc = honrDesc;
    }

    public Sordegr withHonrDesc(String honrDesc) {
        this.honrDesc = honrDesc;
        return this;
    }

    /**
     * College Description
     * <p>
     * 
     * 
     */
    @JsonProperty("collDesc")
    public String getCollDesc() {
        return collDesc;
    }

    /**
     * College Description
     * <p>
     * 
     * 
     */
    @JsonProperty("collDesc")
    public void setCollDesc(String collDesc) {
        this.collDesc = collDesc;
    }

    public Sordegr withCollDesc(String collDesc) {
        this.collDesc = collDesc;
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

    public Sordegr withEgolCode(String egolCode) {
        this.egolCode = egolCode;
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

    public Sordegr withPrimaryInd(String primaryInd) {
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
        sb.append("egolDesc");
        sb.append('=');
        sb.append(((this.egolDesc == null)?"<null>":this.egolDesc));
        sb.append(',');
        sb.append("degrDesc");
        sb.append('=');
        sb.append(((this.degrDesc == null)?"<null>":this.degrDesc));
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
        sb.append("honrDesc");
        sb.append('=');
        sb.append(((this.honrDesc == null)?"<null>":this.honrDesc));
        sb.append(',');
        sb.append("collDesc");
        sb.append('=');
        sb.append(((this.collDesc == null)?"<null>":this.collDesc));
        sb.append(',');
        sb.append("egolCode");
        sb.append('=');
        sb.append(((this.egolCode == null)?"<null>":this.egolCode));
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
        result = ((result* 31)+((this.egolDesc == null)? 0 :this.egolDesc.hashCode()));
        result = ((result* 31)+((this.degrDesc == null)? 0 :this.degrDesc.hashCode()));
        result = ((result* 31)+((this.degcDate == null)? 0 :this.degcDate.hashCode()));
        result = ((result* 31)+((this.degcCode == null)? 0 :this.degcCode.hashCode()));
        result = ((result* 31)+((this.attendTo == null)? 0 :this.attendTo.hashCode()));
        result = ((result* 31)+((this.attendFrom == null)? 0 :this.attendFrom.hashCode()));
        result = ((result* 31)+((this.degcYear == null)? 0 :this.degcYear.hashCode()));
        result = ((result* 31)+((this.honrCode == null)? 0 :this.honrCode.hashCode()));
        result = ((result* 31)+((this.honrDesc == null)? 0 :this.honrDesc.hashCode()));
        result = ((result* 31)+((this.collDesc == null)? 0 :this.collDesc.hashCode()));
        result = ((result* 31)+((this.egolCode == null)? 0 :this.egolCode.hashCode()));
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
        if ((other instanceof Sordegr) == false) {
            return false;
        }
        Sordegr rhs = ((Sordegr) other);
        return (((((((((((((((((this.hoursTransferred == rhs.hoursTransferred)||((this.hoursTransferred!= null)&&this.hoursTransferred.equals(rhs.hoursTransferred)))&&((this.gpaTransferred == rhs.gpaTransferred)||((this.gpaTransferred!= null)&&this.gpaTransferred.equals(rhs.gpaTransferred))))&&((this.egolDesc == rhs.egolDesc)||((this.egolDesc!= null)&&this.egolDesc.equals(rhs.egolDesc))))&&((this.degrDesc == rhs.degrDesc)||((this.degrDesc!= null)&&this.degrDesc.equals(rhs.degrDesc))))&&((this.degcDate == rhs.degcDate)||((this.degcDate!= null)&&this.degcDate.equals(rhs.degcDate))))&&((this.degcCode == rhs.degcCode)||((this.degcCode!= null)&&this.degcCode.equals(rhs.degcCode))))&&((this.attendTo == rhs.attendTo)||((this.attendTo!= null)&&this.attendTo.equals(rhs.attendTo))))&&((this.attendFrom == rhs.attendFrom)||((this.attendFrom!= null)&&this.attendFrom.equals(rhs.attendFrom))))&&((this.degcYear == rhs.degcYear)||((this.degcYear!= null)&&this.degcYear.equals(rhs.degcYear))))&&((this.honrCode == rhs.honrCode)||((this.honrCode!= null)&&this.honrCode.equals(rhs.honrCode))))&&((this.honrDesc == rhs.honrDesc)||((this.honrDesc!= null)&&this.honrDesc.equals(rhs.honrDesc))))&&((this.collDesc == rhs.collDesc)||((this.collDesc!= null)&&this.collDesc.equals(rhs.collDesc))))&&((this.egolCode == rhs.egolCode)||((this.egolCode!= null)&&this.egolCode.equals(rhs.egolCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.primaryInd == rhs.primaryInd)||((this.primaryInd!= null)&&this.primaryInd.equals(rhs.primaryInd))));
    }

}
