
package com.ellucian.generated.bpapi.ban.high_school_information_high_school_details.v1_0_0;

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
    "id",
    "sbgiCode",
    "percentile",
    "gpa",
    "graduationDate",
    "dplmCode",
    "transRecvDate",
    "collPrepInd",
    "classRank",
    "classSize",
    "admrCode"
})
@Generated("jsonschema2pojo")
public class HighSchoolInformationHighSchoolDetails100QapiPost {

    @JsonProperty("id")
    private String id;
    /**
     * High School
     * <p>
     * Lineage reference object : SORHSCH_SBGI_CODE
     * 
     */
    @JsonProperty("sbgiCode")
    @JsonPropertyDescription("Lineage reference object : SORHSCH_SBGI_CODE")
    private String sbgiCode;
    /**
     * Percentile
     * <p>
     * Lineage reference object : SORHSCH_PERCENTILE
     * 
     */
    @JsonProperty("percentile")
    @JsonPropertyDescription("Lineage reference object : SORHSCH_PERCENTILE")
    private Double percentile;
    /**
     * GPA
     * <p>
     * Lineage reference object : SORHSCH_GPA
     * 
     */
    @JsonProperty("gpa")
    @JsonPropertyDescription("Lineage reference object : SORHSCH_GPA")
    private String gpa;
    /**
     * Graduation Date
     * <p>
     * Lineage reference object : SORHSCH_GRADUATION_DATE
     * 
     */
    @JsonProperty("graduationDate")
    @JsonPropertyDescription("Lineage reference object : SORHSCH_GRADUATION_DATE")
    private Date graduationDate;
    /**
     * Diploma
     * <p>
     * Lineage reference object : SORHSCH_DPLM_CODE, Lookup lineage reference object : stvdplm
     * 
     */
    @JsonProperty("dplmCode")
    @JsonPropertyDescription("Lineage reference object : SORHSCH_DPLM_CODE, Lookup lineage reference object : stvdplm")
    private String dplmCode;
    /**
     * Transcript Received Date
     * <p>
     * Lineage reference object : SORHSCH_TRANS_RECV_DATE
     * 
     */
    @JsonProperty("transRecvDate")
    @JsonPropertyDescription("Lineage reference object : SORHSCH_TRANS_RECV_DATE")
    private Date transRecvDate;
    /**
     * College Preparation
     * <p>
     * Lineage reference object : SORHSCH_COLL_PREP_IND
     * 
     */
    @JsonProperty("collPrepInd")
    @JsonPropertyDescription("Lineage reference object : SORHSCH_COLL_PREP_IND")
    private String collPrepInd;
    /**
     * Class Rank and Size
     * <p>
     * Lineage reference object : SORHSCH_CLASS_RANK
     * 
     */
    @JsonProperty("classRank")
    @JsonPropertyDescription("Lineage reference object : SORHSCH_CLASS_RANK")
    private Double classRank;
    /**
     * Class Size
     * <p>
     * Lineage reference object : SORHSCH_CLASS_SIZE
     * 
     */
    @JsonProperty("classSize")
    @JsonPropertyDescription("Lineage reference object : SORHSCH_CLASS_SIZE")
    private Double classSize;
    /**
     * Admissions Request
     * <p>
     * Lineage reference object : SORHSCH_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("admrCode")
    @JsonPropertyDescription("Lineage reference object : SORHSCH_ADMR_CODE, Lookup lineage reference object : stvadmr")
    private String admrCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public HighSchoolInformationHighSchoolDetails100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * High School
     * <p>
     * Lineage reference object : SORHSCH_SBGI_CODE
     * 
     */
    @JsonProperty("sbgiCode")
    public String getSbgiCode() {
        return sbgiCode;
    }

    /**
     * High School
     * <p>
     * Lineage reference object : SORHSCH_SBGI_CODE
     * 
     */
    @JsonProperty("sbgiCode")
    public void setSbgiCode(String sbgiCode) {
        this.sbgiCode = sbgiCode;
    }

    public HighSchoolInformationHighSchoolDetails100QapiPost withSbgiCode(String sbgiCode) {
        this.sbgiCode = sbgiCode;
        return this;
    }

    /**
     * Percentile
     * <p>
     * Lineage reference object : SORHSCH_PERCENTILE
     * 
     */
    @JsonProperty("percentile")
    public Double getPercentile() {
        return percentile;
    }

    /**
     * Percentile
     * <p>
     * Lineage reference object : SORHSCH_PERCENTILE
     * 
     */
    @JsonProperty("percentile")
    public void setPercentile(Double percentile) {
        this.percentile = percentile;
    }

    public HighSchoolInformationHighSchoolDetails100QapiPost withPercentile(Double percentile) {
        this.percentile = percentile;
        return this;
    }

    /**
     * GPA
     * <p>
     * Lineage reference object : SORHSCH_GPA
     * 
     */
    @JsonProperty("gpa")
    public String getGpa() {
        return gpa;
    }

    /**
     * GPA
     * <p>
     * Lineage reference object : SORHSCH_GPA
     * 
     */
    @JsonProperty("gpa")
    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    public HighSchoolInformationHighSchoolDetails100QapiPost withGpa(String gpa) {
        this.gpa = gpa;
        return this;
    }

    /**
     * Graduation Date
     * <p>
     * Lineage reference object : SORHSCH_GRADUATION_DATE
     * 
     */
    @JsonProperty("graduationDate")
    public Date getGraduationDate() {
        return graduationDate;
    }

    /**
     * Graduation Date
     * <p>
     * Lineage reference object : SORHSCH_GRADUATION_DATE
     * 
     */
    @JsonProperty("graduationDate")
    public void setGraduationDate(Date graduationDate) {
        this.graduationDate = graduationDate;
    }

    public HighSchoolInformationHighSchoolDetails100QapiPost withGraduationDate(Date graduationDate) {
        this.graduationDate = graduationDate;
        return this;
    }

    /**
     * Diploma
     * <p>
     * Lineage reference object : SORHSCH_DPLM_CODE, Lookup lineage reference object : stvdplm
     * 
     */
    @JsonProperty("dplmCode")
    public String getDplmCode() {
        return dplmCode;
    }

    /**
     * Diploma
     * <p>
     * Lineage reference object : SORHSCH_DPLM_CODE, Lookup lineage reference object : stvdplm
     * 
     */
    @JsonProperty("dplmCode")
    public void setDplmCode(String dplmCode) {
        this.dplmCode = dplmCode;
    }

    public HighSchoolInformationHighSchoolDetails100QapiPost withDplmCode(String dplmCode) {
        this.dplmCode = dplmCode;
        return this;
    }

    /**
     * Transcript Received Date
     * <p>
     * Lineage reference object : SORHSCH_TRANS_RECV_DATE
     * 
     */
    @JsonProperty("transRecvDate")
    public Date getTransRecvDate() {
        return transRecvDate;
    }

    /**
     * Transcript Received Date
     * <p>
     * Lineage reference object : SORHSCH_TRANS_RECV_DATE
     * 
     */
    @JsonProperty("transRecvDate")
    public void setTransRecvDate(Date transRecvDate) {
        this.transRecvDate = transRecvDate;
    }

    public HighSchoolInformationHighSchoolDetails100QapiPost withTransRecvDate(Date transRecvDate) {
        this.transRecvDate = transRecvDate;
        return this;
    }

    /**
     * College Preparation
     * <p>
     * Lineage reference object : SORHSCH_COLL_PREP_IND
     * 
     */
    @JsonProperty("collPrepInd")
    public String getCollPrepInd() {
        return collPrepInd;
    }

    /**
     * College Preparation
     * <p>
     * Lineage reference object : SORHSCH_COLL_PREP_IND
     * 
     */
    @JsonProperty("collPrepInd")
    public void setCollPrepInd(String collPrepInd) {
        this.collPrepInd = collPrepInd;
    }

    public HighSchoolInformationHighSchoolDetails100QapiPost withCollPrepInd(String collPrepInd) {
        this.collPrepInd = collPrepInd;
        return this;
    }

    /**
     * Class Rank and Size
     * <p>
     * Lineage reference object : SORHSCH_CLASS_RANK
     * 
     */
    @JsonProperty("classRank")
    public Double getClassRank() {
        return classRank;
    }

    /**
     * Class Rank and Size
     * <p>
     * Lineage reference object : SORHSCH_CLASS_RANK
     * 
     */
    @JsonProperty("classRank")
    public void setClassRank(Double classRank) {
        this.classRank = classRank;
    }

    public HighSchoolInformationHighSchoolDetails100QapiPost withClassRank(Double classRank) {
        this.classRank = classRank;
        return this;
    }

    /**
     * Class Size
     * <p>
     * Lineage reference object : SORHSCH_CLASS_SIZE
     * 
     */
    @JsonProperty("classSize")
    public Double getClassSize() {
        return classSize;
    }

    /**
     * Class Size
     * <p>
     * Lineage reference object : SORHSCH_CLASS_SIZE
     * 
     */
    @JsonProperty("classSize")
    public void setClassSize(Double classSize) {
        this.classSize = classSize;
    }

    public HighSchoolInformationHighSchoolDetails100QapiPost withClassSize(Double classSize) {
        this.classSize = classSize;
        return this;
    }

    /**
     * Admissions Request
     * <p>
     * Lineage reference object : SORHSCH_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("admrCode")
    public String getAdmrCode() {
        return admrCode;
    }

    /**
     * Admissions Request
     * <p>
     * Lineage reference object : SORHSCH_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("admrCode")
    public void setAdmrCode(String admrCode) {
        this.admrCode = admrCode;
    }

    public HighSchoolInformationHighSchoolDetails100QapiPost withAdmrCode(String admrCode) {
        this.admrCode = admrCode;
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

    public HighSchoolInformationHighSchoolDetails100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HighSchoolInformationHighSchoolDetails100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("sbgiCode");
        sb.append('=');
        sb.append(((this.sbgiCode == null)?"<null>":this.sbgiCode));
        sb.append(',');
        sb.append("percentile");
        sb.append('=');
        sb.append(((this.percentile == null)?"<null>":this.percentile));
        sb.append(',');
        sb.append("gpa");
        sb.append('=');
        sb.append(((this.gpa == null)?"<null>":this.gpa));
        sb.append(',');
        sb.append("graduationDate");
        sb.append('=');
        sb.append(((this.graduationDate == null)?"<null>":this.graduationDate));
        sb.append(',');
        sb.append("dplmCode");
        sb.append('=');
        sb.append(((this.dplmCode == null)?"<null>":this.dplmCode));
        sb.append(',');
        sb.append("transRecvDate");
        sb.append('=');
        sb.append(((this.transRecvDate == null)?"<null>":this.transRecvDate));
        sb.append(',');
        sb.append("collPrepInd");
        sb.append('=');
        sb.append(((this.collPrepInd == null)?"<null>":this.collPrepInd));
        sb.append(',');
        sb.append("classRank");
        sb.append('=');
        sb.append(((this.classRank == null)?"<null>":this.classRank));
        sb.append(',');
        sb.append("classSize");
        sb.append('=');
        sb.append(((this.classSize == null)?"<null>":this.classSize));
        sb.append(',');
        sb.append("admrCode");
        sb.append('=');
        sb.append(((this.admrCode == null)?"<null>":this.admrCode));
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
        result = ((result* 31)+((this.dplmCode == null)? 0 :this.dplmCode.hashCode()));
        result = ((result* 31)+((this.collPrepInd == null)? 0 :this.collPrepInd.hashCode()));
        result = ((result* 31)+((this.sbgiCode == null)? 0 :this.sbgiCode.hashCode()));
        result = ((result* 31)+((this.classRank == null)? 0 :this.classRank.hashCode()));
        result = ((result* 31)+((this.transRecvDate == null)? 0 :this.transRecvDate.hashCode()));
        result = ((result* 31)+((this.classSize == null)? 0 :this.classSize.hashCode()));
        result = ((result* 31)+((this.admrCode == null)? 0 :this.admrCode.hashCode()));
        result = ((result* 31)+((this.percentile == null)? 0 :this.percentile.hashCode()));
        result = ((result* 31)+((this.graduationDate == null)? 0 :this.graduationDate.hashCode()));
        result = ((result* 31)+((this.gpa == null)? 0 :this.gpa.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HighSchoolInformationHighSchoolDetails100QapiPost) == false) {
            return false;
        }
        HighSchoolInformationHighSchoolDetails100QapiPost rhs = ((HighSchoolInformationHighSchoolDetails100QapiPost) other);
        return (((((((((((((this.dplmCode == rhs.dplmCode)||((this.dplmCode!= null)&&this.dplmCode.equals(rhs.dplmCode)))&&((this.collPrepInd == rhs.collPrepInd)||((this.collPrepInd!= null)&&this.collPrepInd.equals(rhs.collPrepInd))))&&((this.sbgiCode == rhs.sbgiCode)||((this.sbgiCode!= null)&&this.sbgiCode.equals(rhs.sbgiCode))))&&((this.classRank == rhs.classRank)||((this.classRank!= null)&&this.classRank.equals(rhs.classRank))))&&((this.transRecvDate == rhs.transRecvDate)||((this.transRecvDate!= null)&&this.transRecvDate.equals(rhs.transRecvDate))))&&((this.classSize == rhs.classSize)||((this.classSize!= null)&&this.classSize.equals(rhs.classSize))))&&((this.admrCode == rhs.admrCode)||((this.admrCode!= null)&&this.admrCode.equals(rhs.admrCode))))&&((this.percentile == rhs.percentile)||((this.percentile!= null)&&this.percentile.equals(rhs.percentile))))&&((this.graduationDate == rhs.graduationDate)||((this.graduationDate!= null)&&this.graduationDate.equals(rhs.graduationDate))))&&((this.gpa == rhs.gpa)||((this.gpa!= null)&&this.gpa.equals(rhs.gpa))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
