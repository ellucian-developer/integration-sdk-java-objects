
package com.ellucian.generated.bpapi.ban.applicant_information.v1_0_0;

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
    "date",
    "criteria.esklCode",
    "criteria.currAppsDesc",
    "reqNo",
    "criteria.dispDesc",
    "criteria.desiredSalary",
    "desiredSalary",
    "criteria.date",
    "criteria.currComment",
    "id",
    "criteria.posn",
    "criteria.pclsCode",
    "criteria.fullPartInd",
    "fullPartInd",
    "criteria.currAppsDate",
    "criteria.currAppsCode",
    "criteria.desiredHourly",
    "desiredHourly",
    "criteria.esklDesc",
    "criteria.asrcCode",
    "criteria.posnTitle",
    "asrcCode",
    "criteria.reqNo",
    "posn",
    "criteria.pclsDesc",
    "criteria.asrcDesc"
})
@Generated("jsonschema2pojo")
public class ApplicantInformation100PutRequest {

    /**
     * Application Date
     * <p>
     * Lineage reference object : PABAPPL_DATE
     * (Required)
     * 
     */
    @JsonProperty("date")
    @JsonPropertyDescription("Lineage reference object : PABAPPL_DATE")
    private Date date;
    /**
     * EEO Skill
     * <p>
     * Lineage reference object : PABAPPL_ESKL_CODE
     * 
     */
    @JsonProperty("criteria.esklCode")
    @JsonPropertyDescription("Lineage reference object : PABAPPL_ESKL_CODE")
    private String criteriaEsklCode;
    @JsonProperty("criteria.currAppsDesc")
    private String criteriaCurrAppsDesc;
    /**
     * Requisition Number
     * <p>
     * Lineage reference object : PABAPPL_REQ_NO
     * 
     */
    @JsonProperty("reqNo")
    @JsonPropertyDescription("Lineage reference object : PABAPPL_REQ_NO")
    private String reqNo;
    /**
     * Disposition
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.dispDesc")
    private String criteriaDispDesc;
    /**
     * Desired Salary
     * <p>
     * Lineage reference object : PABAPPL_DESIRED_SALARY
     * 
     */
    @JsonProperty("criteria.desiredSalary")
    @JsonPropertyDescription("Lineage reference object : PABAPPL_DESIRED_SALARY")
    private Double criteriaDesiredSalary;
    /**
     * Desired Salary
     * <p>
     * Lineage reference object : PABAPPL_DESIRED_SALARY
     * 
     */
    @JsonProperty("desiredSalary")
    @JsonPropertyDescription("Lineage reference object : PABAPPL_DESIRED_SALARY")
    private Double desiredSalary;
    /**
     * Application Date
     * <p>
     * Lineage reference object : PABAPPL_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.date")
    @JsonPropertyDescription("Lineage reference object : PABAPPL_DATE")
    private Date criteriaDate;
    /**
     * Comment
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.currComment")
    private String criteriaCurrComment;
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
     * Position Number
     * <p>
     * Lineage reference object : PABAPPL_POSN
     * 
     */
    @JsonProperty("criteria.posn")
    @JsonPropertyDescription("Lineage reference object : PABAPPL_POSN")
    private String criteriaPosn;
    /**
     * Position Class
     * <p>
     * Lineage reference object : PABAPPL_PCLS_CODE
     * 
     */
    @JsonProperty("criteria.pclsCode")
    @JsonPropertyDescription("Lineage reference object : PABAPPL_PCLS_CODE")
    private String criteriaPclsCode;
    /**
     * Full or Part Preference
     * <p>
     * Lineage reference object : PABAPPL_FULL_PART_IND
     * 
     */
    @JsonProperty("criteria.fullPartInd")
    @JsonPropertyDescription("Lineage reference object : PABAPPL_FULL_PART_IND")
    private String criteriaFullPartInd;
    /**
     * Full or Part Preference
     * <p>
     * Lineage reference object : PABAPPL_FULL_PART_IND
     * 
     */
    @JsonProperty("fullPartInd")
    @JsonPropertyDescription("Lineage reference object : PABAPPL_FULL_PART_IND")
    private String fullPartInd;
    /**
     * Status Date
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("criteria.currAppsDate")
    private Date criteriaCurrAppsDate;
    /**
     * Status
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.currAppsCode")
    private String criteriaCurrAppsCode;
    /**
     * Desired Hourly Rate
     * <p>
     * Lineage reference object : PABAPPL_DESIRED_HOURLY
     * 
     */
    @JsonProperty("criteria.desiredHourly")
    @JsonPropertyDescription("Lineage reference object : PABAPPL_DESIRED_HOURLY")
    private Double criteriaDesiredHourly;
    /**
     * Desired Hourly Rate
     * <p>
     * Lineage reference object : PABAPPL_DESIRED_HOURLY
     * 
     */
    @JsonProperty("desiredHourly")
    @JsonPropertyDescription("Lineage reference object : PABAPPL_DESIRED_HOURLY")
    private Double desiredHourly;
    @JsonProperty("criteria.esklDesc")
    private String criteriaEsklDesc;
    /**
     * Source
     * <p>
     * Lineage reference object : PABAPPL_ASRC_CODE, Lookup lineage reference object : ptvasrc
     * (Required)
     * 
     */
    @JsonProperty("criteria.asrcCode")
    @JsonPropertyDescription("Lineage reference object : PABAPPL_ASRC_CODE, Lookup lineage reference object : ptvasrc")
    private String criteriaAsrcCode;
    @JsonProperty("criteria.posnTitle")
    private String criteriaPosnTitle;
    /**
     * Source
     * <p>
     * Lineage reference object : PABAPPL_ASRC_CODE, Lookup lineage reference object : ptvasrc
     * (Required)
     * 
     */
    @JsonProperty("asrcCode")
    @JsonPropertyDescription("Lineage reference object : PABAPPL_ASRC_CODE, Lookup lineage reference object : ptvasrc")
    private String asrcCode;
    /**
     * Requisition Number
     * <p>
     * Lineage reference object : PABAPPL_REQ_NO
     * 
     */
    @JsonProperty("criteria.reqNo")
    @JsonPropertyDescription("Lineage reference object : PABAPPL_REQ_NO")
    private String criteriaReqNo;
    /**
     * Position Number
     * <p>
     * Lineage reference object : PABAPPL_POSN
     * 
     */
    @JsonProperty("posn")
    @JsonPropertyDescription("Lineage reference object : PABAPPL_POSN")
    private String posn;
    @JsonProperty("criteria.pclsDesc")
    private String criteriaPclsDesc;
    @JsonProperty("criteria.asrcDesc")
    private String criteriaAsrcDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Application Date
     * <p>
     * Lineage reference object : PABAPPL_DATE
     * (Required)
     * 
     */
    @JsonProperty("date")
    public Date getDate() {
        return date;
    }

    /**
     * Application Date
     * <p>
     * Lineage reference object : PABAPPL_DATE
     * (Required)
     * 
     */
    @JsonProperty("date")
    public void setDate(Date date) {
        this.date = date;
    }

    public ApplicantInformation100PutRequest withDate(Date date) {
        this.date = date;
        return this;
    }

    /**
     * EEO Skill
     * <p>
     * Lineage reference object : PABAPPL_ESKL_CODE
     * 
     */
    @JsonProperty("criteria.esklCode")
    public String getCriteriaEsklCode() {
        return criteriaEsklCode;
    }

    /**
     * EEO Skill
     * <p>
     * Lineage reference object : PABAPPL_ESKL_CODE
     * 
     */
    @JsonProperty("criteria.esklCode")
    public void setCriteriaEsklCode(String criteriaEsklCode) {
        this.criteriaEsklCode = criteriaEsklCode;
    }

    public ApplicantInformation100PutRequest withCriteriaEsklCode(String criteriaEsklCode) {
        this.criteriaEsklCode = criteriaEsklCode;
        return this;
    }

    @JsonProperty("criteria.currAppsDesc")
    public String getCriteriaCurrAppsDesc() {
        return criteriaCurrAppsDesc;
    }

    @JsonProperty("criteria.currAppsDesc")
    public void setCriteriaCurrAppsDesc(String criteriaCurrAppsDesc) {
        this.criteriaCurrAppsDesc = criteriaCurrAppsDesc;
    }

    public ApplicantInformation100PutRequest withCriteriaCurrAppsDesc(String criteriaCurrAppsDesc) {
        this.criteriaCurrAppsDesc = criteriaCurrAppsDesc;
        return this;
    }

    /**
     * Requisition Number
     * <p>
     * Lineage reference object : PABAPPL_REQ_NO
     * 
     */
    @JsonProperty("reqNo")
    public String getReqNo() {
        return reqNo;
    }

    /**
     * Requisition Number
     * <p>
     * Lineage reference object : PABAPPL_REQ_NO
     * 
     */
    @JsonProperty("reqNo")
    public void setReqNo(String reqNo) {
        this.reqNo = reqNo;
    }

    public ApplicantInformation100PutRequest withReqNo(String reqNo) {
        this.reqNo = reqNo;
        return this;
    }

    /**
     * Disposition
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.dispDesc")
    public String getCriteriaDispDesc() {
        return criteriaDispDesc;
    }

    /**
     * Disposition
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.dispDesc")
    public void setCriteriaDispDesc(String criteriaDispDesc) {
        this.criteriaDispDesc = criteriaDispDesc;
    }

    public ApplicantInformation100PutRequest withCriteriaDispDesc(String criteriaDispDesc) {
        this.criteriaDispDesc = criteriaDispDesc;
        return this;
    }

    /**
     * Desired Salary
     * <p>
     * Lineage reference object : PABAPPL_DESIRED_SALARY
     * 
     */
    @JsonProperty("criteria.desiredSalary")
    public Double getCriteriaDesiredSalary() {
        return criteriaDesiredSalary;
    }

    /**
     * Desired Salary
     * <p>
     * Lineage reference object : PABAPPL_DESIRED_SALARY
     * 
     */
    @JsonProperty("criteria.desiredSalary")
    public void setCriteriaDesiredSalary(Double criteriaDesiredSalary) {
        this.criteriaDesiredSalary = criteriaDesiredSalary;
    }

    public ApplicantInformation100PutRequest withCriteriaDesiredSalary(Double criteriaDesiredSalary) {
        this.criteriaDesiredSalary = criteriaDesiredSalary;
        return this;
    }

    /**
     * Desired Salary
     * <p>
     * Lineage reference object : PABAPPL_DESIRED_SALARY
     * 
     */
    @JsonProperty("desiredSalary")
    public Double getDesiredSalary() {
        return desiredSalary;
    }

    /**
     * Desired Salary
     * <p>
     * Lineage reference object : PABAPPL_DESIRED_SALARY
     * 
     */
    @JsonProperty("desiredSalary")
    public void setDesiredSalary(Double desiredSalary) {
        this.desiredSalary = desiredSalary;
    }

    public ApplicantInformation100PutRequest withDesiredSalary(Double desiredSalary) {
        this.desiredSalary = desiredSalary;
        return this;
    }

    /**
     * Application Date
     * <p>
     * Lineage reference object : PABAPPL_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.date")
    public Date getCriteriaDate() {
        return criteriaDate;
    }

    /**
     * Application Date
     * <p>
     * Lineage reference object : PABAPPL_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.date")
    public void setCriteriaDate(Date criteriaDate) {
        this.criteriaDate = criteriaDate;
    }

    public ApplicantInformation100PutRequest withCriteriaDate(Date criteriaDate) {
        this.criteriaDate = criteriaDate;
        return this;
    }

    /**
     * Comment
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.currComment")
    public String getCriteriaCurrComment() {
        return criteriaCurrComment;
    }

    /**
     * Comment
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.currComment")
    public void setCriteriaCurrComment(String criteriaCurrComment) {
        this.criteriaCurrComment = criteriaCurrComment;
    }

    public ApplicantInformation100PutRequest withCriteriaCurrComment(String criteriaCurrComment) {
        this.criteriaCurrComment = criteriaCurrComment;
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

    public ApplicantInformation100PutRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Position Number
     * <p>
     * Lineage reference object : PABAPPL_POSN
     * 
     */
    @JsonProperty("criteria.posn")
    public String getCriteriaPosn() {
        return criteriaPosn;
    }

    /**
     * Position Number
     * <p>
     * Lineage reference object : PABAPPL_POSN
     * 
     */
    @JsonProperty("criteria.posn")
    public void setCriteriaPosn(String criteriaPosn) {
        this.criteriaPosn = criteriaPosn;
    }

    public ApplicantInformation100PutRequest withCriteriaPosn(String criteriaPosn) {
        this.criteriaPosn = criteriaPosn;
        return this;
    }

    /**
     * Position Class
     * <p>
     * Lineage reference object : PABAPPL_PCLS_CODE
     * 
     */
    @JsonProperty("criteria.pclsCode")
    public String getCriteriaPclsCode() {
        return criteriaPclsCode;
    }

    /**
     * Position Class
     * <p>
     * Lineage reference object : PABAPPL_PCLS_CODE
     * 
     */
    @JsonProperty("criteria.pclsCode")
    public void setCriteriaPclsCode(String criteriaPclsCode) {
        this.criteriaPclsCode = criteriaPclsCode;
    }

    public ApplicantInformation100PutRequest withCriteriaPclsCode(String criteriaPclsCode) {
        this.criteriaPclsCode = criteriaPclsCode;
        return this;
    }

    /**
     * Full or Part Preference
     * <p>
     * Lineage reference object : PABAPPL_FULL_PART_IND
     * 
     */
    @JsonProperty("criteria.fullPartInd")
    public String getCriteriaFullPartInd() {
        return criteriaFullPartInd;
    }

    /**
     * Full or Part Preference
     * <p>
     * Lineage reference object : PABAPPL_FULL_PART_IND
     * 
     */
    @JsonProperty("criteria.fullPartInd")
    public void setCriteriaFullPartInd(String criteriaFullPartInd) {
        this.criteriaFullPartInd = criteriaFullPartInd;
    }

    public ApplicantInformation100PutRequest withCriteriaFullPartInd(String criteriaFullPartInd) {
        this.criteriaFullPartInd = criteriaFullPartInd;
        return this;
    }

    /**
     * Full or Part Preference
     * <p>
     * Lineage reference object : PABAPPL_FULL_PART_IND
     * 
     */
    @JsonProperty("fullPartInd")
    public String getFullPartInd() {
        return fullPartInd;
    }

    /**
     * Full or Part Preference
     * <p>
     * Lineage reference object : PABAPPL_FULL_PART_IND
     * 
     */
    @JsonProperty("fullPartInd")
    public void setFullPartInd(String fullPartInd) {
        this.fullPartInd = fullPartInd;
    }

    public ApplicantInformation100PutRequest withFullPartInd(String fullPartInd) {
        this.fullPartInd = fullPartInd;
        return this;
    }

    /**
     * Status Date
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("criteria.currAppsDate")
    public Date getCriteriaCurrAppsDate() {
        return criteriaCurrAppsDate;
    }

    /**
     * Status Date
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("criteria.currAppsDate")
    public void setCriteriaCurrAppsDate(Date criteriaCurrAppsDate) {
        this.criteriaCurrAppsDate = criteriaCurrAppsDate;
    }

    public ApplicantInformation100PutRequest withCriteriaCurrAppsDate(Date criteriaCurrAppsDate) {
        this.criteriaCurrAppsDate = criteriaCurrAppsDate;
        return this;
    }

    /**
     * Status
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.currAppsCode")
    public String getCriteriaCurrAppsCode() {
        return criteriaCurrAppsCode;
    }

    /**
     * Status
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.currAppsCode")
    public void setCriteriaCurrAppsCode(String criteriaCurrAppsCode) {
        this.criteriaCurrAppsCode = criteriaCurrAppsCode;
    }

    public ApplicantInformation100PutRequest withCriteriaCurrAppsCode(String criteriaCurrAppsCode) {
        this.criteriaCurrAppsCode = criteriaCurrAppsCode;
        return this;
    }

    /**
     * Desired Hourly Rate
     * <p>
     * Lineage reference object : PABAPPL_DESIRED_HOURLY
     * 
     */
    @JsonProperty("criteria.desiredHourly")
    public Double getCriteriaDesiredHourly() {
        return criteriaDesiredHourly;
    }

    /**
     * Desired Hourly Rate
     * <p>
     * Lineage reference object : PABAPPL_DESIRED_HOURLY
     * 
     */
    @JsonProperty("criteria.desiredHourly")
    public void setCriteriaDesiredHourly(Double criteriaDesiredHourly) {
        this.criteriaDesiredHourly = criteriaDesiredHourly;
    }

    public ApplicantInformation100PutRequest withCriteriaDesiredHourly(Double criteriaDesiredHourly) {
        this.criteriaDesiredHourly = criteriaDesiredHourly;
        return this;
    }

    /**
     * Desired Hourly Rate
     * <p>
     * Lineage reference object : PABAPPL_DESIRED_HOURLY
     * 
     */
    @JsonProperty("desiredHourly")
    public Double getDesiredHourly() {
        return desiredHourly;
    }

    /**
     * Desired Hourly Rate
     * <p>
     * Lineage reference object : PABAPPL_DESIRED_HOURLY
     * 
     */
    @JsonProperty("desiredHourly")
    public void setDesiredHourly(Double desiredHourly) {
        this.desiredHourly = desiredHourly;
    }

    public ApplicantInformation100PutRequest withDesiredHourly(Double desiredHourly) {
        this.desiredHourly = desiredHourly;
        return this;
    }

    @JsonProperty("criteria.esklDesc")
    public String getCriteriaEsklDesc() {
        return criteriaEsklDesc;
    }

    @JsonProperty("criteria.esklDesc")
    public void setCriteriaEsklDesc(String criteriaEsklDesc) {
        this.criteriaEsklDesc = criteriaEsklDesc;
    }

    public ApplicantInformation100PutRequest withCriteriaEsklDesc(String criteriaEsklDesc) {
        this.criteriaEsklDesc = criteriaEsklDesc;
        return this;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : PABAPPL_ASRC_CODE, Lookup lineage reference object : ptvasrc
     * (Required)
     * 
     */
    @JsonProperty("criteria.asrcCode")
    public String getCriteriaAsrcCode() {
        return criteriaAsrcCode;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : PABAPPL_ASRC_CODE, Lookup lineage reference object : ptvasrc
     * (Required)
     * 
     */
    @JsonProperty("criteria.asrcCode")
    public void setCriteriaAsrcCode(String criteriaAsrcCode) {
        this.criteriaAsrcCode = criteriaAsrcCode;
    }

    public ApplicantInformation100PutRequest withCriteriaAsrcCode(String criteriaAsrcCode) {
        this.criteriaAsrcCode = criteriaAsrcCode;
        return this;
    }

    @JsonProperty("criteria.posnTitle")
    public String getCriteriaPosnTitle() {
        return criteriaPosnTitle;
    }

    @JsonProperty("criteria.posnTitle")
    public void setCriteriaPosnTitle(String criteriaPosnTitle) {
        this.criteriaPosnTitle = criteriaPosnTitle;
    }

    public ApplicantInformation100PutRequest withCriteriaPosnTitle(String criteriaPosnTitle) {
        this.criteriaPosnTitle = criteriaPosnTitle;
        return this;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : PABAPPL_ASRC_CODE, Lookup lineage reference object : ptvasrc
     * (Required)
     * 
     */
    @JsonProperty("asrcCode")
    public String getAsrcCode() {
        return asrcCode;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : PABAPPL_ASRC_CODE, Lookup lineage reference object : ptvasrc
     * (Required)
     * 
     */
    @JsonProperty("asrcCode")
    public void setAsrcCode(String asrcCode) {
        this.asrcCode = asrcCode;
    }

    public ApplicantInformation100PutRequest withAsrcCode(String asrcCode) {
        this.asrcCode = asrcCode;
        return this;
    }

    /**
     * Requisition Number
     * <p>
     * Lineage reference object : PABAPPL_REQ_NO
     * 
     */
    @JsonProperty("criteria.reqNo")
    public String getCriteriaReqNo() {
        return criteriaReqNo;
    }

    /**
     * Requisition Number
     * <p>
     * Lineage reference object : PABAPPL_REQ_NO
     * 
     */
    @JsonProperty("criteria.reqNo")
    public void setCriteriaReqNo(String criteriaReqNo) {
        this.criteriaReqNo = criteriaReqNo;
    }

    public ApplicantInformation100PutRequest withCriteriaReqNo(String criteriaReqNo) {
        this.criteriaReqNo = criteriaReqNo;
        return this;
    }

    /**
     * Position Number
     * <p>
     * Lineage reference object : PABAPPL_POSN
     * 
     */
    @JsonProperty("posn")
    public String getPosn() {
        return posn;
    }

    /**
     * Position Number
     * <p>
     * Lineage reference object : PABAPPL_POSN
     * 
     */
    @JsonProperty("posn")
    public void setPosn(String posn) {
        this.posn = posn;
    }

    public ApplicantInformation100PutRequest withPosn(String posn) {
        this.posn = posn;
        return this;
    }

    @JsonProperty("criteria.pclsDesc")
    public String getCriteriaPclsDesc() {
        return criteriaPclsDesc;
    }

    @JsonProperty("criteria.pclsDesc")
    public void setCriteriaPclsDesc(String criteriaPclsDesc) {
        this.criteriaPclsDesc = criteriaPclsDesc;
    }

    public ApplicantInformation100PutRequest withCriteriaPclsDesc(String criteriaPclsDesc) {
        this.criteriaPclsDesc = criteriaPclsDesc;
        return this;
    }

    @JsonProperty("criteria.asrcDesc")
    public String getCriteriaAsrcDesc() {
        return criteriaAsrcDesc;
    }

    @JsonProperty("criteria.asrcDesc")
    public void setCriteriaAsrcDesc(String criteriaAsrcDesc) {
        this.criteriaAsrcDesc = criteriaAsrcDesc;
    }

    public ApplicantInformation100PutRequest withCriteriaAsrcDesc(String criteriaAsrcDesc) {
        this.criteriaAsrcDesc = criteriaAsrcDesc;
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

    public ApplicantInformation100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApplicantInformation100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
        sb.append(',');
        sb.append("criteriaEsklCode");
        sb.append('=');
        sb.append(((this.criteriaEsklCode == null)?"<null>":this.criteriaEsklCode));
        sb.append(',');
        sb.append("criteriaCurrAppsDesc");
        sb.append('=');
        sb.append(((this.criteriaCurrAppsDesc == null)?"<null>":this.criteriaCurrAppsDesc));
        sb.append(',');
        sb.append("reqNo");
        sb.append('=');
        sb.append(((this.reqNo == null)?"<null>":this.reqNo));
        sb.append(',');
        sb.append("criteriaDispDesc");
        sb.append('=');
        sb.append(((this.criteriaDispDesc == null)?"<null>":this.criteriaDispDesc));
        sb.append(',');
        sb.append("criteriaDesiredSalary");
        sb.append('=');
        sb.append(((this.criteriaDesiredSalary == null)?"<null>":this.criteriaDesiredSalary));
        sb.append(',');
        sb.append("desiredSalary");
        sb.append('=');
        sb.append(((this.desiredSalary == null)?"<null>":this.desiredSalary));
        sb.append(',');
        sb.append("criteriaDate");
        sb.append('=');
        sb.append(((this.criteriaDate == null)?"<null>":this.criteriaDate));
        sb.append(',');
        sb.append("criteriaCurrComment");
        sb.append('=');
        sb.append(((this.criteriaCurrComment == null)?"<null>":this.criteriaCurrComment));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("criteriaPosn");
        sb.append('=');
        sb.append(((this.criteriaPosn == null)?"<null>":this.criteriaPosn));
        sb.append(',');
        sb.append("criteriaPclsCode");
        sb.append('=');
        sb.append(((this.criteriaPclsCode == null)?"<null>":this.criteriaPclsCode));
        sb.append(',');
        sb.append("criteriaFullPartInd");
        sb.append('=');
        sb.append(((this.criteriaFullPartInd == null)?"<null>":this.criteriaFullPartInd));
        sb.append(',');
        sb.append("fullPartInd");
        sb.append('=');
        sb.append(((this.fullPartInd == null)?"<null>":this.fullPartInd));
        sb.append(',');
        sb.append("criteriaCurrAppsDate");
        sb.append('=');
        sb.append(((this.criteriaCurrAppsDate == null)?"<null>":this.criteriaCurrAppsDate));
        sb.append(',');
        sb.append("criteriaCurrAppsCode");
        sb.append('=');
        sb.append(((this.criteriaCurrAppsCode == null)?"<null>":this.criteriaCurrAppsCode));
        sb.append(',');
        sb.append("criteriaDesiredHourly");
        sb.append('=');
        sb.append(((this.criteriaDesiredHourly == null)?"<null>":this.criteriaDesiredHourly));
        sb.append(',');
        sb.append("desiredHourly");
        sb.append('=');
        sb.append(((this.desiredHourly == null)?"<null>":this.desiredHourly));
        sb.append(',');
        sb.append("criteriaEsklDesc");
        sb.append('=');
        sb.append(((this.criteriaEsklDesc == null)?"<null>":this.criteriaEsklDesc));
        sb.append(',');
        sb.append("criteriaAsrcCode");
        sb.append('=');
        sb.append(((this.criteriaAsrcCode == null)?"<null>":this.criteriaAsrcCode));
        sb.append(',');
        sb.append("criteriaPosnTitle");
        sb.append('=');
        sb.append(((this.criteriaPosnTitle == null)?"<null>":this.criteriaPosnTitle));
        sb.append(',');
        sb.append("asrcCode");
        sb.append('=');
        sb.append(((this.asrcCode == null)?"<null>":this.asrcCode));
        sb.append(',');
        sb.append("criteriaReqNo");
        sb.append('=');
        sb.append(((this.criteriaReqNo == null)?"<null>":this.criteriaReqNo));
        sb.append(',');
        sb.append("posn");
        sb.append('=');
        sb.append(((this.posn == null)?"<null>":this.posn));
        sb.append(',');
        sb.append("criteriaPclsDesc");
        sb.append('=');
        sb.append(((this.criteriaPclsDesc == null)?"<null>":this.criteriaPclsDesc));
        sb.append(',');
        sb.append("criteriaAsrcDesc");
        sb.append('=');
        sb.append(((this.criteriaAsrcDesc == null)?"<null>":this.criteriaAsrcDesc));
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
        result = ((result* 31)+((this.date == null)? 0 :this.date.hashCode()));
        result = ((result* 31)+((this.criteriaDate == null)? 0 :this.criteriaDate.hashCode()));
        result = ((result* 31)+((this.criteriaDesiredSalary == null)? 0 :this.criteriaDesiredSalary.hashCode()));
        result = ((result* 31)+((this.reqNo == null)? 0 :this.reqNo.hashCode()));
        result = ((result* 31)+((this.criteriaEsklDesc == null)? 0 :this.criteriaEsklDesc.hashCode()));
        result = ((result* 31)+((this.criteriaAsrcCode == null)? 0 :this.criteriaAsrcCode.hashCode()));
        result = ((result* 31)+((this.desiredSalary == null)? 0 :this.desiredSalary.hashCode()));
        result = ((result* 31)+((this.criteriaPclsCode == null)? 0 :this.criteriaPclsCode.hashCode()));
        result = ((result* 31)+((this.criteriaFullPartInd == null)? 0 :this.criteriaFullPartInd.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.criteriaCurrAppsCode == null)? 0 :this.criteriaCurrAppsCode.hashCode()));
        result = ((result* 31)+((this.fullPartInd == null)? 0 :this.fullPartInd.hashCode()));
        result = ((result* 31)+((this.criteriaCurrAppsDate == null)? 0 :this.criteriaCurrAppsDate.hashCode()));
        result = ((result* 31)+((this.criteriaDispDesc == null)? 0 :this.criteriaDispDesc.hashCode()));
        result = ((result* 31)+((this.criteriaCurrComment == null)? 0 :this.criteriaCurrComment.hashCode()));
        result = ((result* 31)+((this.desiredHourly == null)? 0 :this.desiredHourly.hashCode()));
        result = ((result* 31)+((this.criteriaDesiredHourly == null)? 0 :this.criteriaDesiredHourly.hashCode()));
        result = ((result* 31)+((this.criteriaReqNo == null)? 0 :this.criteriaReqNo.hashCode()));
        result = ((result* 31)+((this.criteriaPosn == null)? 0 :this.criteriaPosn.hashCode()));
        result = ((result* 31)+((this.asrcCode == null)? 0 :this.asrcCode.hashCode()));
        result = ((result* 31)+((this.criteriaEsklCode == null)? 0 :this.criteriaEsklCode.hashCode()));
        result = ((result* 31)+((this.posn == null)? 0 :this.posn.hashCode()));
        result = ((result* 31)+((this.criteriaPosnTitle == null)? 0 :this.criteriaPosnTitle.hashCode()));
        result = ((result* 31)+((this.criteriaAsrcDesc == null)? 0 :this.criteriaAsrcDesc.hashCode()));
        result = ((result* 31)+((this.criteriaCurrAppsDesc == null)? 0 :this.criteriaCurrAppsDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaPclsDesc == null)? 0 :this.criteriaPclsDesc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicantInformation100PutRequest) == false) {
            return false;
        }
        ApplicantInformation100PutRequest rhs = ((ApplicantInformation100PutRequest) other);
        return ((((((((((((((((((((((((((((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date)))&&((this.criteriaDate == rhs.criteriaDate)||((this.criteriaDate!= null)&&this.criteriaDate.equals(rhs.criteriaDate))))&&((this.criteriaDesiredSalary == rhs.criteriaDesiredSalary)||((this.criteriaDesiredSalary!= null)&&this.criteriaDesiredSalary.equals(rhs.criteriaDesiredSalary))))&&((this.reqNo == rhs.reqNo)||((this.reqNo!= null)&&this.reqNo.equals(rhs.reqNo))))&&((this.criteriaEsklDesc == rhs.criteriaEsklDesc)||((this.criteriaEsklDesc!= null)&&this.criteriaEsklDesc.equals(rhs.criteriaEsklDesc))))&&((this.criteriaAsrcCode == rhs.criteriaAsrcCode)||((this.criteriaAsrcCode!= null)&&this.criteriaAsrcCode.equals(rhs.criteriaAsrcCode))))&&((this.desiredSalary == rhs.desiredSalary)||((this.desiredSalary!= null)&&this.desiredSalary.equals(rhs.desiredSalary))))&&((this.criteriaPclsCode == rhs.criteriaPclsCode)||((this.criteriaPclsCode!= null)&&this.criteriaPclsCode.equals(rhs.criteriaPclsCode))))&&((this.criteriaFullPartInd == rhs.criteriaFullPartInd)||((this.criteriaFullPartInd!= null)&&this.criteriaFullPartInd.equals(rhs.criteriaFullPartInd))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.criteriaCurrAppsCode == rhs.criteriaCurrAppsCode)||((this.criteriaCurrAppsCode!= null)&&this.criteriaCurrAppsCode.equals(rhs.criteriaCurrAppsCode))))&&((this.fullPartInd == rhs.fullPartInd)||((this.fullPartInd!= null)&&this.fullPartInd.equals(rhs.fullPartInd))))&&((this.criteriaCurrAppsDate == rhs.criteriaCurrAppsDate)||((this.criteriaCurrAppsDate!= null)&&this.criteriaCurrAppsDate.equals(rhs.criteriaCurrAppsDate))))&&((this.criteriaDispDesc == rhs.criteriaDispDesc)||((this.criteriaDispDesc!= null)&&this.criteriaDispDesc.equals(rhs.criteriaDispDesc))))&&((this.criteriaCurrComment == rhs.criteriaCurrComment)||((this.criteriaCurrComment!= null)&&this.criteriaCurrComment.equals(rhs.criteriaCurrComment))))&&((this.desiredHourly == rhs.desiredHourly)||((this.desiredHourly!= null)&&this.desiredHourly.equals(rhs.desiredHourly))))&&((this.criteriaDesiredHourly == rhs.criteriaDesiredHourly)||((this.criteriaDesiredHourly!= null)&&this.criteriaDesiredHourly.equals(rhs.criteriaDesiredHourly))))&&((this.criteriaReqNo == rhs.criteriaReqNo)||((this.criteriaReqNo!= null)&&this.criteriaReqNo.equals(rhs.criteriaReqNo))))&&((this.criteriaPosn == rhs.criteriaPosn)||((this.criteriaPosn!= null)&&this.criteriaPosn.equals(rhs.criteriaPosn))))&&((this.asrcCode == rhs.asrcCode)||((this.asrcCode!= null)&&this.asrcCode.equals(rhs.asrcCode))))&&((this.criteriaEsklCode == rhs.criteriaEsklCode)||((this.criteriaEsklCode!= null)&&this.criteriaEsklCode.equals(rhs.criteriaEsklCode))))&&((this.posn == rhs.posn)||((this.posn!= null)&&this.posn.equals(rhs.posn))))&&((this.criteriaPosnTitle == rhs.criteriaPosnTitle)||((this.criteriaPosnTitle!= null)&&this.criteriaPosnTitle.equals(rhs.criteriaPosnTitle))))&&((this.criteriaAsrcDesc == rhs.criteriaAsrcDesc)||((this.criteriaAsrcDesc!= null)&&this.criteriaAsrcDesc.equals(rhs.criteriaAsrcDesc))))&&((this.criteriaCurrAppsDesc == rhs.criteriaCurrAppsDesc)||((this.criteriaCurrAppsDesc!= null)&&this.criteriaCurrAppsDesc.equals(rhs.criteriaCurrAppsDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaPclsDesc == rhs.criteriaPclsDesc)||((this.criteriaPclsDesc!= null)&&this.criteriaPclsDesc.equals(rhs.criteriaPclsDesc))));
    }

}
