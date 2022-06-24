
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
    "dplmCode",
    "criteria.classSize",
    "criteria.admrCode",
    "collPrepInd",
    "criteria.collPrepInd",
    "sorhschDplmCode",
    "criteria.graduationDate",
    "criteria.gpa",
    "criteria.percentile",
    "criteria.transRecvDate",
    "classRank",
    "transRecvDate",
    "criteria.dplmCode",
    "classSize",
    "admrCode",
    "percentile",
    "graduationDate",
    "gpa",
    "id",
    "criteria.sbgiCode",
    "criteria.classRank"
})
@Generated("jsonschema2pojo")
public class HighSchoolInformationHighSchoolDetails100PutRequest {

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
     * Class Size
     * <p>
     * Lineage reference object : SORHSCH_CLASS_SIZE
     * 
     */
    @JsonProperty("criteria.classSize")
    @JsonPropertyDescription("Lineage reference object : SORHSCH_CLASS_SIZE")
    private Double criteriaClassSize;
    /**
     * Admissions Request
     * <p>
     * Lineage reference object : SORHSCH_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("criteria.admrCode")
    @JsonPropertyDescription("Lineage reference object : SORHSCH_ADMR_CODE, Lookup lineage reference object : stvadmr")
    private String criteriaAdmrCode;
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
     * College Preparation
     * <p>
     * Lineage reference object : SORHSCH_COLL_PREP_IND
     * 
     */
    @JsonProperty("criteria.collPrepInd")
    @JsonPropertyDescription("Lineage reference object : SORHSCH_COLL_PREP_IND")
    private String criteriaCollPrepInd;
    /**
     * Diploma
     * <p>
     * Lineage reference object : SORHSCH_DPLM_CODE, Lookup lineage reference object : stvdplm
     * 
     */
    @JsonProperty("sorhschDplmCode")
    @JsonPropertyDescription("Lineage reference object : SORHSCH_DPLM_CODE, Lookup lineage reference object : stvdplm")
    private String sorhschDplmCode;
    /**
     * Graduation Date
     * <p>
     * Lineage reference object : SORHSCH_GRADUATION_DATE
     * 
     */
    @JsonProperty("criteria.graduationDate")
    @JsonPropertyDescription("Lineage reference object : SORHSCH_GRADUATION_DATE")
    private Date criteriaGraduationDate;
    /**
     * GPA
     * <p>
     * Lineage reference object : SORHSCH_GPA
     * 
     */
    @JsonProperty("criteria.gpa")
    @JsonPropertyDescription("Lineage reference object : SORHSCH_GPA")
    private String criteriaGpa;
    /**
     * Percentile
     * <p>
     * Lineage reference object : SORHSCH_PERCENTILE
     * 
     */
    @JsonProperty("criteria.percentile")
    @JsonPropertyDescription("Lineage reference object : SORHSCH_PERCENTILE")
    private Double criteriaPercentile;
    /**
     * Transcript Received Date
     * <p>
     * Lineage reference object : SORHSCH_TRANS_RECV_DATE
     * 
     */
    @JsonProperty("criteria.transRecvDate")
    @JsonPropertyDescription("Lineage reference object : SORHSCH_TRANS_RECV_DATE")
    private Date criteriaTransRecvDate;
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
     * Transcript Received Date
     * <p>
     * Lineage reference object : SORHSCH_TRANS_RECV_DATE
     * 
     */
    @JsonProperty("transRecvDate")
    @JsonPropertyDescription("Lineage reference object : SORHSCH_TRANS_RECV_DATE")
    private Date transRecvDate;
    /**
     * Diploma
     * <p>
     * Lineage reference object : SORHSCH_DPLM_CODE, Lookup lineage reference object : stvdplm
     * 
     */
    @JsonProperty("criteria.dplmCode")
    @JsonPropertyDescription("Lineage reference object : SORHSCH_DPLM_CODE, Lookup lineage reference object : stvdplm")
    private String criteriaDplmCode;
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
     * Graduation Date
     * <p>
     * Lineage reference object : SORHSCH_GRADUATION_DATE
     * 
     */
    @JsonProperty("graduationDate")
    @JsonPropertyDescription("Lineage reference object : SORHSCH_GRADUATION_DATE")
    private Date graduationDate;
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
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private String id;
    /**
     * High School
     * <p>
     * Lineage reference object : SORHSCH_SBGI_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.sbgiCode")
    @JsonPropertyDescription("Lineage reference object : SORHSCH_SBGI_CODE")
    private String criteriaSbgiCode;
    /**
     * Class Rank and Size
     * <p>
     * Lineage reference object : SORHSCH_CLASS_RANK
     * 
     */
    @JsonProperty("criteria.classRank")
    @JsonPropertyDescription("Lineage reference object : SORHSCH_CLASS_RANK")
    private Double criteriaClassRank;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public HighSchoolInformationHighSchoolDetails100PutRequest withDplmCode(String dplmCode) {
        this.dplmCode = dplmCode;
        return this;
    }

    /**
     * Class Size
     * <p>
     * Lineage reference object : SORHSCH_CLASS_SIZE
     * 
     */
    @JsonProperty("criteria.classSize")
    public Double getCriteriaClassSize() {
        return criteriaClassSize;
    }

    /**
     * Class Size
     * <p>
     * Lineage reference object : SORHSCH_CLASS_SIZE
     * 
     */
    @JsonProperty("criteria.classSize")
    public void setCriteriaClassSize(Double criteriaClassSize) {
        this.criteriaClassSize = criteriaClassSize;
    }

    public HighSchoolInformationHighSchoolDetails100PutRequest withCriteriaClassSize(Double criteriaClassSize) {
        this.criteriaClassSize = criteriaClassSize;
        return this;
    }

    /**
     * Admissions Request
     * <p>
     * Lineage reference object : SORHSCH_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("criteria.admrCode")
    public String getCriteriaAdmrCode() {
        return criteriaAdmrCode;
    }

    /**
     * Admissions Request
     * <p>
     * Lineage reference object : SORHSCH_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("criteria.admrCode")
    public void setCriteriaAdmrCode(String criteriaAdmrCode) {
        this.criteriaAdmrCode = criteriaAdmrCode;
    }

    public HighSchoolInformationHighSchoolDetails100PutRequest withCriteriaAdmrCode(String criteriaAdmrCode) {
        this.criteriaAdmrCode = criteriaAdmrCode;
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

    public HighSchoolInformationHighSchoolDetails100PutRequest withCollPrepInd(String collPrepInd) {
        this.collPrepInd = collPrepInd;
        return this;
    }

    /**
     * College Preparation
     * <p>
     * Lineage reference object : SORHSCH_COLL_PREP_IND
     * 
     */
    @JsonProperty("criteria.collPrepInd")
    public String getCriteriaCollPrepInd() {
        return criteriaCollPrepInd;
    }

    /**
     * College Preparation
     * <p>
     * Lineage reference object : SORHSCH_COLL_PREP_IND
     * 
     */
    @JsonProperty("criteria.collPrepInd")
    public void setCriteriaCollPrepInd(String criteriaCollPrepInd) {
        this.criteriaCollPrepInd = criteriaCollPrepInd;
    }

    public HighSchoolInformationHighSchoolDetails100PutRequest withCriteriaCollPrepInd(String criteriaCollPrepInd) {
        this.criteriaCollPrepInd = criteriaCollPrepInd;
        return this;
    }

    /**
     * Diploma
     * <p>
     * Lineage reference object : SORHSCH_DPLM_CODE, Lookup lineage reference object : stvdplm
     * 
     */
    @JsonProperty("sorhschDplmCode")
    public String getSorhschDplmCode() {
        return sorhschDplmCode;
    }

    /**
     * Diploma
     * <p>
     * Lineage reference object : SORHSCH_DPLM_CODE, Lookup lineage reference object : stvdplm
     * 
     */
    @JsonProperty("sorhschDplmCode")
    public void setSorhschDplmCode(String sorhschDplmCode) {
        this.sorhschDplmCode = sorhschDplmCode;
    }

    public HighSchoolInformationHighSchoolDetails100PutRequest withSorhschDplmCode(String sorhschDplmCode) {
        this.sorhschDplmCode = sorhschDplmCode;
        return this;
    }

    /**
     * Graduation Date
     * <p>
     * Lineage reference object : SORHSCH_GRADUATION_DATE
     * 
     */
    @JsonProperty("criteria.graduationDate")
    public Date getCriteriaGraduationDate() {
        return criteriaGraduationDate;
    }

    /**
     * Graduation Date
     * <p>
     * Lineage reference object : SORHSCH_GRADUATION_DATE
     * 
     */
    @JsonProperty("criteria.graduationDate")
    public void setCriteriaGraduationDate(Date criteriaGraduationDate) {
        this.criteriaGraduationDate = criteriaGraduationDate;
    }

    public HighSchoolInformationHighSchoolDetails100PutRequest withCriteriaGraduationDate(Date criteriaGraduationDate) {
        this.criteriaGraduationDate = criteriaGraduationDate;
        return this;
    }

    /**
     * GPA
     * <p>
     * Lineage reference object : SORHSCH_GPA
     * 
     */
    @JsonProperty("criteria.gpa")
    public String getCriteriaGpa() {
        return criteriaGpa;
    }

    /**
     * GPA
     * <p>
     * Lineage reference object : SORHSCH_GPA
     * 
     */
    @JsonProperty("criteria.gpa")
    public void setCriteriaGpa(String criteriaGpa) {
        this.criteriaGpa = criteriaGpa;
    }

    public HighSchoolInformationHighSchoolDetails100PutRequest withCriteriaGpa(String criteriaGpa) {
        this.criteriaGpa = criteriaGpa;
        return this;
    }

    /**
     * Percentile
     * <p>
     * Lineage reference object : SORHSCH_PERCENTILE
     * 
     */
    @JsonProperty("criteria.percentile")
    public Double getCriteriaPercentile() {
        return criteriaPercentile;
    }

    /**
     * Percentile
     * <p>
     * Lineage reference object : SORHSCH_PERCENTILE
     * 
     */
    @JsonProperty("criteria.percentile")
    public void setCriteriaPercentile(Double criteriaPercentile) {
        this.criteriaPercentile = criteriaPercentile;
    }

    public HighSchoolInformationHighSchoolDetails100PutRequest withCriteriaPercentile(Double criteriaPercentile) {
        this.criteriaPercentile = criteriaPercentile;
        return this;
    }

    /**
     * Transcript Received Date
     * <p>
     * Lineage reference object : SORHSCH_TRANS_RECV_DATE
     * 
     */
    @JsonProperty("criteria.transRecvDate")
    public Date getCriteriaTransRecvDate() {
        return criteriaTransRecvDate;
    }

    /**
     * Transcript Received Date
     * <p>
     * Lineage reference object : SORHSCH_TRANS_RECV_DATE
     * 
     */
    @JsonProperty("criteria.transRecvDate")
    public void setCriteriaTransRecvDate(Date criteriaTransRecvDate) {
        this.criteriaTransRecvDate = criteriaTransRecvDate;
    }

    public HighSchoolInformationHighSchoolDetails100PutRequest withCriteriaTransRecvDate(Date criteriaTransRecvDate) {
        this.criteriaTransRecvDate = criteriaTransRecvDate;
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

    public HighSchoolInformationHighSchoolDetails100PutRequest withClassRank(Double classRank) {
        this.classRank = classRank;
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

    public HighSchoolInformationHighSchoolDetails100PutRequest withTransRecvDate(Date transRecvDate) {
        this.transRecvDate = transRecvDate;
        return this;
    }

    /**
     * Diploma
     * <p>
     * Lineage reference object : SORHSCH_DPLM_CODE, Lookup lineage reference object : stvdplm
     * 
     */
    @JsonProperty("criteria.dplmCode")
    public String getCriteriaDplmCode() {
        return criteriaDplmCode;
    }

    /**
     * Diploma
     * <p>
     * Lineage reference object : SORHSCH_DPLM_CODE, Lookup lineage reference object : stvdplm
     * 
     */
    @JsonProperty("criteria.dplmCode")
    public void setCriteriaDplmCode(String criteriaDplmCode) {
        this.criteriaDplmCode = criteriaDplmCode;
    }

    public HighSchoolInformationHighSchoolDetails100PutRequest withCriteriaDplmCode(String criteriaDplmCode) {
        this.criteriaDplmCode = criteriaDplmCode;
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

    public HighSchoolInformationHighSchoolDetails100PutRequest withClassSize(Double classSize) {
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

    public HighSchoolInformationHighSchoolDetails100PutRequest withAdmrCode(String admrCode) {
        this.admrCode = admrCode;
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

    public HighSchoolInformationHighSchoolDetails100PutRequest withPercentile(Double percentile) {
        this.percentile = percentile;
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

    public HighSchoolInformationHighSchoolDetails100PutRequest withGraduationDate(Date graduationDate) {
        this.graduationDate = graduationDate;
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

    public HighSchoolInformationHighSchoolDetails100PutRequest withGpa(String gpa) {
        this.gpa = gpa;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public HighSchoolInformationHighSchoolDetails100PutRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * High School
     * <p>
     * Lineage reference object : SORHSCH_SBGI_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.sbgiCode")
    public String getCriteriaSbgiCode() {
        return criteriaSbgiCode;
    }

    /**
     * High School
     * <p>
     * Lineage reference object : SORHSCH_SBGI_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.sbgiCode")
    public void setCriteriaSbgiCode(String criteriaSbgiCode) {
        this.criteriaSbgiCode = criteriaSbgiCode;
    }

    public HighSchoolInformationHighSchoolDetails100PutRequest withCriteriaSbgiCode(String criteriaSbgiCode) {
        this.criteriaSbgiCode = criteriaSbgiCode;
        return this;
    }

    /**
     * Class Rank and Size
     * <p>
     * Lineage reference object : SORHSCH_CLASS_RANK
     * 
     */
    @JsonProperty("criteria.classRank")
    public Double getCriteriaClassRank() {
        return criteriaClassRank;
    }

    /**
     * Class Rank and Size
     * <p>
     * Lineage reference object : SORHSCH_CLASS_RANK
     * 
     */
    @JsonProperty("criteria.classRank")
    public void setCriteriaClassRank(Double criteriaClassRank) {
        this.criteriaClassRank = criteriaClassRank;
    }

    public HighSchoolInformationHighSchoolDetails100PutRequest withCriteriaClassRank(Double criteriaClassRank) {
        this.criteriaClassRank = criteriaClassRank;
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

    public HighSchoolInformationHighSchoolDetails100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HighSchoolInformationHighSchoolDetails100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dplmCode");
        sb.append('=');
        sb.append(((this.dplmCode == null)?"<null>":this.dplmCode));
        sb.append(',');
        sb.append("criteriaClassSize");
        sb.append('=');
        sb.append(((this.criteriaClassSize == null)?"<null>":this.criteriaClassSize));
        sb.append(',');
        sb.append("criteriaAdmrCode");
        sb.append('=');
        sb.append(((this.criteriaAdmrCode == null)?"<null>":this.criteriaAdmrCode));
        sb.append(',');
        sb.append("collPrepInd");
        sb.append('=');
        sb.append(((this.collPrepInd == null)?"<null>":this.collPrepInd));
        sb.append(',');
        sb.append("criteriaCollPrepInd");
        sb.append('=');
        sb.append(((this.criteriaCollPrepInd == null)?"<null>":this.criteriaCollPrepInd));
        sb.append(',');
        sb.append("sorhschDplmCode");
        sb.append('=');
        sb.append(((this.sorhschDplmCode == null)?"<null>":this.sorhschDplmCode));
        sb.append(',');
        sb.append("criteriaGraduationDate");
        sb.append('=');
        sb.append(((this.criteriaGraduationDate == null)?"<null>":this.criteriaGraduationDate));
        sb.append(',');
        sb.append("criteriaGpa");
        sb.append('=');
        sb.append(((this.criteriaGpa == null)?"<null>":this.criteriaGpa));
        sb.append(',');
        sb.append("criteriaPercentile");
        sb.append('=');
        sb.append(((this.criteriaPercentile == null)?"<null>":this.criteriaPercentile));
        sb.append(',');
        sb.append("criteriaTransRecvDate");
        sb.append('=');
        sb.append(((this.criteriaTransRecvDate == null)?"<null>":this.criteriaTransRecvDate));
        sb.append(',');
        sb.append("classRank");
        sb.append('=');
        sb.append(((this.classRank == null)?"<null>":this.classRank));
        sb.append(',');
        sb.append("transRecvDate");
        sb.append('=');
        sb.append(((this.transRecvDate == null)?"<null>":this.transRecvDate));
        sb.append(',');
        sb.append("criteriaDplmCode");
        sb.append('=');
        sb.append(((this.criteriaDplmCode == null)?"<null>":this.criteriaDplmCode));
        sb.append(',');
        sb.append("classSize");
        sb.append('=');
        sb.append(((this.classSize == null)?"<null>":this.classSize));
        sb.append(',');
        sb.append("admrCode");
        sb.append('=');
        sb.append(((this.admrCode == null)?"<null>":this.admrCode));
        sb.append(',');
        sb.append("percentile");
        sb.append('=');
        sb.append(((this.percentile == null)?"<null>":this.percentile));
        sb.append(',');
        sb.append("graduationDate");
        sb.append('=');
        sb.append(((this.graduationDate == null)?"<null>":this.graduationDate));
        sb.append(',');
        sb.append("gpa");
        sb.append('=');
        sb.append(((this.gpa == null)?"<null>":this.gpa));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("criteriaSbgiCode");
        sb.append('=');
        sb.append(((this.criteriaSbgiCode == null)?"<null>":this.criteriaSbgiCode));
        sb.append(',');
        sb.append("criteriaClassRank");
        sb.append('=');
        sb.append(((this.criteriaClassRank == null)?"<null>":this.criteriaClassRank));
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
        result = ((result* 31)+((this.criteriaSbgiCode == null)? 0 :this.criteriaSbgiCode.hashCode()));
        result = ((result* 31)+((this.collPrepInd == null)? 0 :this.collPrepInd.hashCode()));
        result = ((result* 31)+((this.sorhschDplmCode == null)? 0 :this.sorhschDplmCode.hashCode()));
        result = ((result* 31)+((this.criteriaAdmrCode == null)? 0 :this.criteriaAdmrCode.hashCode()));
        result = ((result* 31)+((this.criteriaClassRank == null)? 0 :this.criteriaClassRank.hashCode()));
        result = ((result* 31)+((this.criteriaGpa == null)? 0 :this.criteriaGpa.hashCode()));
        result = ((result* 31)+((this.classRank == null)? 0 :this.classRank.hashCode()));
        result = ((result* 31)+((this.transRecvDate == null)? 0 :this.transRecvDate.hashCode()));
        result = ((result* 31)+((this.criteriaPercentile == null)? 0 :this.criteriaPercentile.hashCode()));
        result = ((result* 31)+((this.classSize == null)? 0 :this.classSize.hashCode()));
        result = ((result* 31)+((this.admrCode == null)? 0 :this.admrCode.hashCode()));
        result = ((result* 31)+((this.percentile == null)? 0 :this.percentile.hashCode()));
        result = ((result* 31)+((this.criteriaTransRecvDate == null)? 0 :this.criteriaTransRecvDate.hashCode()));
        result = ((result* 31)+((this.graduationDate == null)? 0 :this.graduationDate.hashCode()));
        result = ((result* 31)+((this.criteriaClassSize == null)? 0 :this.criteriaClassSize.hashCode()));
        result = ((result* 31)+((this.criteriaCollPrepInd == null)? 0 :this.criteriaCollPrepInd.hashCode()));
        result = ((result* 31)+((this.criteriaGraduationDate == null)? 0 :this.criteriaGraduationDate.hashCode()));
        result = ((result* 31)+((this.gpa == null)? 0 :this.gpa.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaDplmCode == null)? 0 :this.criteriaDplmCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HighSchoolInformationHighSchoolDetails100PutRequest) == false) {
            return false;
        }
        HighSchoolInformationHighSchoolDetails100PutRequest rhs = ((HighSchoolInformationHighSchoolDetails100PutRequest) other);
        return (((((((((((((((((((((((this.dplmCode == rhs.dplmCode)||((this.dplmCode!= null)&&this.dplmCode.equals(rhs.dplmCode)))&&((this.criteriaSbgiCode == rhs.criteriaSbgiCode)||((this.criteriaSbgiCode!= null)&&this.criteriaSbgiCode.equals(rhs.criteriaSbgiCode))))&&((this.collPrepInd == rhs.collPrepInd)||((this.collPrepInd!= null)&&this.collPrepInd.equals(rhs.collPrepInd))))&&((this.sorhschDplmCode == rhs.sorhschDplmCode)||((this.sorhschDplmCode!= null)&&this.sorhschDplmCode.equals(rhs.sorhschDplmCode))))&&((this.criteriaAdmrCode == rhs.criteriaAdmrCode)||((this.criteriaAdmrCode!= null)&&this.criteriaAdmrCode.equals(rhs.criteriaAdmrCode))))&&((this.criteriaClassRank == rhs.criteriaClassRank)||((this.criteriaClassRank!= null)&&this.criteriaClassRank.equals(rhs.criteriaClassRank))))&&((this.criteriaGpa == rhs.criteriaGpa)||((this.criteriaGpa!= null)&&this.criteriaGpa.equals(rhs.criteriaGpa))))&&((this.classRank == rhs.classRank)||((this.classRank!= null)&&this.classRank.equals(rhs.classRank))))&&((this.transRecvDate == rhs.transRecvDate)||((this.transRecvDate!= null)&&this.transRecvDate.equals(rhs.transRecvDate))))&&((this.criteriaPercentile == rhs.criteriaPercentile)||((this.criteriaPercentile!= null)&&this.criteriaPercentile.equals(rhs.criteriaPercentile))))&&((this.classSize == rhs.classSize)||((this.classSize!= null)&&this.classSize.equals(rhs.classSize))))&&((this.admrCode == rhs.admrCode)||((this.admrCode!= null)&&this.admrCode.equals(rhs.admrCode))))&&((this.percentile == rhs.percentile)||((this.percentile!= null)&&this.percentile.equals(rhs.percentile))))&&((this.criteriaTransRecvDate == rhs.criteriaTransRecvDate)||((this.criteriaTransRecvDate!= null)&&this.criteriaTransRecvDate.equals(rhs.criteriaTransRecvDate))))&&((this.graduationDate == rhs.graduationDate)||((this.graduationDate!= null)&&this.graduationDate.equals(rhs.graduationDate))))&&((this.criteriaClassSize == rhs.criteriaClassSize)||((this.criteriaClassSize!= null)&&this.criteriaClassSize.equals(rhs.criteriaClassSize))))&&((this.criteriaCollPrepInd == rhs.criteriaCollPrepInd)||((this.criteriaCollPrepInd!= null)&&this.criteriaCollPrepInd.equals(rhs.criteriaCollPrepInd))))&&((this.criteriaGraduationDate == rhs.criteriaGraduationDate)||((this.criteriaGraduationDate!= null)&&this.criteriaGraduationDate.equals(rhs.criteriaGraduationDate))))&&((this.gpa == rhs.gpa)||((this.gpa!= null)&&this.gpa.equals(rhs.gpa))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaDplmCode == rhs.criteriaDplmCode)||((this.criteriaDplmCode!= null)&&this.criteriaDplmCode.equals(rhs.criteriaDplmCode))));
    }

}
