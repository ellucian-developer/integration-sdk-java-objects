
package com.ellucian.generated.bpapi.ban.registration_minimum_maximum_hours.v1_0_0;

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
    "vtypCode",
    "primSecCde",
    "resdCode",
    "degcCode",
    "maxHrs",
    "program",
    "majrCode",
    "minHrs",
    "userId",
    "lfstCode",
    "activityDate",
    "admtCode",
    "chrtCode",
    "attsCode",
    "campCode",
    "clasCode",
    "stypCode",
    "collCode",
    "actcCode",
    "deptCode",
    "levlCode"
})
@Generated("jsonschema2pojo")
public class RegistrationMinimumMaximumHours100GetResponse {

    /**
     * Visa
     * <p>
     * Lineage reference object : SFRMHRS_VTYP_CODE, Lookup lineage reference object : stvvtyp
     * 
     */
    @JsonProperty("vtypCode")
    @JsonPropertyDescription("Lineage reference object : SFRMHRS_VTYP_CODE, Lookup lineage reference object : stvvtyp")
    private String vtypCode;
    /**
     * Curricula
     * <p>
     * Lineage reference object : SFRMHRS_PRIM_SEC_CDE
     * 
     */
    @JsonProperty("primSecCde")
    @JsonPropertyDescription("Lineage reference object : SFRMHRS_PRIM_SEC_CDE")
    private String primSecCde;
    /**
     * Residence
     * <p>
     * Lineage reference object : SFRMHRS_RESD_CODE, Lookup lineage reference object : stvresd
     * 
     */
    @JsonProperty("resdCode")
    @JsonPropertyDescription("Lineage reference object : SFRMHRS_RESD_CODE, Lookup lineage reference object : stvresd")
    private String resdCode;
    /**
     * Degree
     * <p>
     * Lineage reference object : SFRMHRS_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degcCode")
    @JsonPropertyDescription("Lineage reference object : SFRMHRS_DEGC_CODE, Lookup lineage reference object : stvdegc")
    private String degcCode;
    /**
     * Maximum Hours
     * <p>
     * Lineage reference object : SFRMHRS_MAX_HRS
     * (Required)
     * 
     */
    @JsonProperty("maxHrs")
    @JsonPropertyDescription("Lineage reference object : SFRMHRS_MAX_HRS")
    private Double maxHrs;
    /**
     * Program
     * <p>
     * Lineage reference object : SFRMHRS_PROGRAM, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("program")
    @JsonPropertyDescription("Lineage reference object : SFRMHRS_PROGRAM, Lookup lineage reference object : smrprle")
    private String program;
    /**
     * Field of Study Code
     * <p>
     * Lineage reference object : SFRMHRS_MAJR_CODE, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCode")
    @JsonPropertyDescription("Lineage reference object : SFRMHRS_MAJR_CODE, Lookup lineage reference object : stvmajr")
    private String majrCode;
    /**
     * Minimum Hours
     * <p>
     * Lineage reference object : SFRMHRS_MIN_HRS
     * (Required)
     * 
     */
    @JsonProperty("minHrs")
    @JsonPropertyDescription("Lineage reference object : SFRMHRS_MIN_HRS")
    private Double minHrs;
    /**
     * User ID
     * <p>
     * Lineage reference object : SFRMHRS_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SFRMHRS_USER_ID")
    private String userId;
    /**
     * Field of Study Type
     * <p>
     * Lineage reference object : SFRMHRS_LFST_CODE, Lookup lineage reference object : gtvlfst
     * 
     */
    @JsonProperty("lfstCode")
    @JsonPropertyDescription("Lineage reference object : SFRMHRS_LFST_CODE, Lookup lineage reference object : gtvlfst")
    private String lfstCode;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SFRMHRS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SFRMHRS_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Admission Type
     * <p>
     * Lineage reference object : SFRMHRS_ADMT_CODE, Lookup lineage reference object : stvadmt
     * 
     */
    @JsonProperty("admtCode")
    @JsonPropertyDescription("Lineage reference object : SFRMHRS_ADMT_CODE, Lookup lineage reference object : stvadmt")
    private String admtCode;
    /**
     * Cohort
     * <p>
     * Lineage reference object : SFRMHRS_CHRT_CODE, Lookup lineage reference object : stvchrt
     * 
     */
    @JsonProperty("chrtCode")
    @JsonPropertyDescription("Lineage reference object : SFRMHRS_CHRT_CODE, Lookup lineage reference object : stvchrt")
    private String chrtCode;
    /**
     * Student Attribute
     * <p>
     * Lineage reference object : SFRMHRS_ATTS_CODE, Lookup lineage reference object : stvatts
     * 
     */
    @JsonProperty("attsCode")
    @JsonPropertyDescription("Lineage reference object : SFRMHRS_ATTS_CODE, Lookup lineage reference object : stvatts")
    private String attsCode;
    /**
     * Campus
     * <p>
     * Lineage reference object : SFRMHRS_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    @JsonPropertyDescription("Lineage reference object : SFRMHRS_CAMP_CODE, Lookup lineage reference object : stvcamp")
    private String campCode;
    /**
     * Class
     * <p>
     * Lineage reference object : SFRMHRS_CLAS_CODE, Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("clasCode")
    @JsonPropertyDescription("Lineage reference object : SFRMHRS_CLAS_CODE, Lookup lineage reference object : stvclas")
    private String clasCode;
    /**
     * Student Type
     * <p>
     * Lineage reference object : SFRMHRS_STYP_CODE, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("stypCode")
    @JsonPropertyDescription("Lineage reference object : SFRMHRS_STYP_CODE, Lookup lineage reference object : stvstyp")
    private String stypCode;
    /**
     * College
     * <p>
     * Lineage reference object : SFRMHRS_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    @JsonPropertyDescription("Lineage reference object : SFRMHRS_COLL_CODE, Lookup lineage reference object : stvcoll")
    private String collCode;
    /**
     * Sport
     * <p>
     * Lineage reference object : SFRMHRS_ACTC_CODE, Lookup lineage reference object : stvactc
     * 
     */
    @JsonProperty("actcCode")
    @JsonPropertyDescription("Lineage reference object : SFRMHRS_ACTC_CODE, Lookup lineage reference object : stvactc")
    private String actcCode;
    /**
     * Department
     * <p>
     * Lineage reference object : SFRMHRS_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    @JsonPropertyDescription("Lineage reference object : SFRMHRS_DEPT_CODE, Lookup lineage reference object : stvdept")
    private String deptCode;
    /**
     * Level
     * <p>
     * Lineage reference object : SFRMHRS_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCode")
    @JsonPropertyDescription("Lineage reference object : SFRMHRS_LEVL_CODE, Lookup lineage reference object : stvlevl")
    private String levlCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Visa
     * <p>
     * Lineage reference object : SFRMHRS_VTYP_CODE, Lookup lineage reference object : stvvtyp
     * 
     */
    @JsonProperty("vtypCode")
    public String getVtypCode() {
        return vtypCode;
    }

    /**
     * Visa
     * <p>
     * Lineage reference object : SFRMHRS_VTYP_CODE, Lookup lineage reference object : stvvtyp
     * 
     */
    @JsonProperty("vtypCode")
    public void setVtypCode(String vtypCode) {
        this.vtypCode = vtypCode;
    }

    public RegistrationMinimumMaximumHours100GetResponse withVtypCode(String vtypCode) {
        this.vtypCode = vtypCode;
        return this;
    }

    /**
     * Curricula
     * <p>
     * Lineage reference object : SFRMHRS_PRIM_SEC_CDE
     * 
     */
    @JsonProperty("primSecCde")
    public String getPrimSecCde() {
        return primSecCde;
    }

    /**
     * Curricula
     * <p>
     * Lineage reference object : SFRMHRS_PRIM_SEC_CDE
     * 
     */
    @JsonProperty("primSecCde")
    public void setPrimSecCde(String primSecCde) {
        this.primSecCde = primSecCde;
    }

    public RegistrationMinimumMaximumHours100GetResponse withPrimSecCde(String primSecCde) {
        this.primSecCde = primSecCde;
        return this;
    }

    /**
     * Residence
     * <p>
     * Lineage reference object : SFRMHRS_RESD_CODE, Lookup lineage reference object : stvresd
     * 
     */
    @JsonProperty("resdCode")
    public String getResdCode() {
        return resdCode;
    }

    /**
     * Residence
     * <p>
     * Lineage reference object : SFRMHRS_RESD_CODE, Lookup lineage reference object : stvresd
     * 
     */
    @JsonProperty("resdCode")
    public void setResdCode(String resdCode) {
        this.resdCode = resdCode;
    }

    public RegistrationMinimumMaximumHours100GetResponse withResdCode(String resdCode) {
        this.resdCode = resdCode;
        return this;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SFRMHRS_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degcCode")
    public String getDegcCode() {
        return degcCode;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SFRMHRS_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degcCode")
    public void setDegcCode(String degcCode) {
        this.degcCode = degcCode;
    }

    public RegistrationMinimumMaximumHours100GetResponse withDegcCode(String degcCode) {
        this.degcCode = degcCode;
        return this;
    }

    /**
     * Maximum Hours
     * <p>
     * Lineage reference object : SFRMHRS_MAX_HRS
     * (Required)
     * 
     */
    @JsonProperty("maxHrs")
    public Double getMaxHrs() {
        return maxHrs;
    }

    /**
     * Maximum Hours
     * <p>
     * Lineage reference object : SFRMHRS_MAX_HRS
     * (Required)
     * 
     */
    @JsonProperty("maxHrs")
    public void setMaxHrs(Double maxHrs) {
        this.maxHrs = maxHrs;
    }

    public RegistrationMinimumMaximumHours100GetResponse withMaxHrs(Double maxHrs) {
        this.maxHrs = maxHrs;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SFRMHRS_PROGRAM, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("program")
    public String getProgram() {
        return program;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SFRMHRS_PROGRAM, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("program")
    public void setProgram(String program) {
        this.program = program;
    }

    public RegistrationMinimumMaximumHours100GetResponse withProgram(String program) {
        this.program = program;
        return this;
    }

    /**
     * Field of Study Code
     * <p>
     * Lineage reference object : SFRMHRS_MAJR_CODE, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCode")
    public String getMajrCode() {
        return majrCode;
    }

    /**
     * Field of Study Code
     * <p>
     * Lineage reference object : SFRMHRS_MAJR_CODE, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCode")
    public void setMajrCode(String majrCode) {
        this.majrCode = majrCode;
    }

    public RegistrationMinimumMaximumHours100GetResponse withMajrCode(String majrCode) {
        this.majrCode = majrCode;
        return this;
    }

    /**
     * Minimum Hours
     * <p>
     * Lineage reference object : SFRMHRS_MIN_HRS
     * (Required)
     * 
     */
    @JsonProperty("minHrs")
    public Double getMinHrs() {
        return minHrs;
    }

    /**
     * Minimum Hours
     * <p>
     * Lineage reference object : SFRMHRS_MIN_HRS
     * (Required)
     * 
     */
    @JsonProperty("minHrs")
    public void setMinHrs(Double minHrs) {
        this.minHrs = minHrs;
    }

    public RegistrationMinimumMaximumHours100GetResponse withMinHrs(Double minHrs) {
        this.minHrs = minHrs;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SFRMHRS_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SFRMHRS_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public RegistrationMinimumMaximumHours100GetResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Field of Study Type
     * <p>
     * Lineage reference object : SFRMHRS_LFST_CODE, Lookup lineage reference object : gtvlfst
     * 
     */
    @JsonProperty("lfstCode")
    public String getLfstCode() {
        return lfstCode;
    }

    /**
     * Field of Study Type
     * <p>
     * Lineage reference object : SFRMHRS_LFST_CODE, Lookup lineage reference object : gtvlfst
     * 
     */
    @JsonProperty("lfstCode")
    public void setLfstCode(String lfstCode) {
        this.lfstCode = lfstCode;
    }

    public RegistrationMinimumMaximumHours100GetResponse withLfstCode(String lfstCode) {
        this.lfstCode = lfstCode;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SFRMHRS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SFRMHRS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public RegistrationMinimumMaximumHours100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Admission Type
     * <p>
     * Lineage reference object : SFRMHRS_ADMT_CODE, Lookup lineage reference object : stvadmt
     * 
     */
    @JsonProperty("admtCode")
    public String getAdmtCode() {
        return admtCode;
    }

    /**
     * Admission Type
     * <p>
     * Lineage reference object : SFRMHRS_ADMT_CODE, Lookup lineage reference object : stvadmt
     * 
     */
    @JsonProperty("admtCode")
    public void setAdmtCode(String admtCode) {
        this.admtCode = admtCode;
    }

    public RegistrationMinimumMaximumHours100GetResponse withAdmtCode(String admtCode) {
        this.admtCode = admtCode;
        return this;
    }

    /**
     * Cohort
     * <p>
     * Lineage reference object : SFRMHRS_CHRT_CODE, Lookup lineage reference object : stvchrt
     * 
     */
    @JsonProperty("chrtCode")
    public String getChrtCode() {
        return chrtCode;
    }

    /**
     * Cohort
     * <p>
     * Lineage reference object : SFRMHRS_CHRT_CODE, Lookup lineage reference object : stvchrt
     * 
     */
    @JsonProperty("chrtCode")
    public void setChrtCode(String chrtCode) {
        this.chrtCode = chrtCode;
    }

    public RegistrationMinimumMaximumHours100GetResponse withChrtCode(String chrtCode) {
        this.chrtCode = chrtCode;
        return this;
    }

    /**
     * Student Attribute
     * <p>
     * Lineage reference object : SFRMHRS_ATTS_CODE, Lookup lineage reference object : stvatts
     * 
     */
    @JsonProperty("attsCode")
    public String getAttsCode() {
        return attsCode;
    }

    /**
     * Student Attribute
     * <p>
     * Lineage reference object : SFRMHRS_ATTS_CODE, Lookup lineage reference object : stvatts
     * 
     */
    @JsonProperty("attsCode")
    public void setAttsCode(String attsCode) {
        this.attsCode = attsCode;
    }

    public RegistrationMinimumMaximumHours100GetResponse withAttsCode(String attsCode) {
        this.attsCode = attsCode;
        return this;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SFRMHRS_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    public String getCampCode() {
        return campCode;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SFRMHRS_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    public void setCampCode(String campCode) {
        this.campCode = campCode;
    }

    public RegistrationMinimumMaximumHours100GetResponse withCampCode(String campCode) {
        this.campCode = campCode;
        return this;
    }

    /**
     * Class
     * <p>
     * Lineage reference object : SFRMHRS_CLAS_CODE, Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("clasCode")
    public String getClasCode() {
        return clasCode;
    }

    /**
     * Class
     * <p>
     * Lineage reference object : SFRMHRS_CLAS_CODE, Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("clasCode")
    public void setClasCode(String clasCode) {
        this.clasCode = clasCode;
    }

    public RegistrationMinimumMaximumHours100GetResponse withClasCode(String clasCode) {
        this.clasCode = clasCode;
        return this;
    }

    /**
     * Student Type
     * <p>
     * Lineage reference object : SFRMHRS_STYP_CODE, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("stypCode")
    public String getStypCode() {
        return stypCode;
    }

    /**
     * Student Type
     * <p>
     * Lineage reference object : SFRMHRS_STYP_CODE, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("stypCode")
    public void setStypCode(String stypCode) {
        this.stypCode = stypCode;
    }

    public RegistrationMinimumMaximumHours100GetResponse withStypCode(String stypCode) {
        this.stypCode = stypCode;
        return this;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SFRMHRS_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    public String getCollCode() {
        return collCode;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SFRMHRS_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    public void setCollCode(String collCode) {
        this.collCode = collCode;
    }

    public RegistrationMinimumMaximumHours100GetResponse withCollCode(String collCode) {
        this.collCode = collCode;
        return this;
    }

    /**
     * Sport
     * <p>
     * Lineage reference object : SFRMHRS_ACTC_CODE, Lookup lineage reference object : stvactc
     * 
     */
    @JsonProperty("actcCode")
    public String getActcCode() {
        return actcCode;
    }

    /**
     * Sport
     * <p>
     * Lineage reference object : SFRMHRS_ACTC_CODE, Lookup lineage reference object : stvactc
     * 
     */
    @JsonProperty("actcCode")
    public void setActcCode(String actcCode) {
        this.actcCode = actcCode;
    }

    public RegistrationMinimumMaximumHours100GetResponse withActcCode(String actcCode) {
        this.actcCode = actcCode;
        return this;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SFRMHRS_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SFRMHRS_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public RegistrationMinimumMaximumHours100GetResponse withDeptCode(String deptCode) {
        this.deptCode = deptCode;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SFRMHRS_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCode")
    public String getLevlCode() {
        return levlCode;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SFRMHRS_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCode")
    public void setLevlCode(String levlCode) {
        this.levlCode = levlCode;
    }

    public RegistrationMinimumMaximumHours100GetResponse withLevlCode(String levlCode) {
        this.levlCode = levlCode;
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

    public RegistrationMinimumMaximumHours100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RegistrationMinimumMaximumHours100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("vtypCode");
        sb.append('=');
        sb.append(((this.vtypCode == null)?"<null>":this.vtypCode));
        sb.append(',');
        sb.append("primSecCde");
        sb.append('=');
        sb.append(((this.primSecCde == null)?"<null>":this.primSecCde));
        sb.append(',');
        sb.append("resdCode");
        sb.append('=');
        sb.append(((this.resdCode == null)?"<null>":this.resdCode));
        sb.append(',');
        sb.append("degcCode");
        sb.append('=');
        sb.append(((this.degcCode == null)?"<null>":this.degcCode));
        sb.append(',');
        sb.append("maxHrs");
        sb.append('=');
        sb.append(((this.maxHrs == null)?"<null>":this.maxHrs));
        sb.append(',');
        sb.append("program");
        sb.append('=');
        sb.append(((this.program == null)?"<null>":this.program));
        sb.append(',');
        sb.append("majrCode");
        sb.append('=');
        sb.append(((this.majrCode == null)?"<null>":this.majrCode));
        sb.append(',');
        sb.append("minHrs");
        sb.append('=');
        sb.append(((this.minHrs == null)?"<null>":this.minHrs));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("lfstCode");
        sb.append('=');
        sb.append(((this.lfstCode == null)?"<null>":this.lfstCode));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("admtCode");
        sb.append('=');
        sb.append(((this.admtCode == null)?"<null>":this.admtCode));
        sb.append(',');
        sb.append("chrtCode");
        sb.append('=');
        sb.append(((this.chrtCode == null)?"<null>":this.chrtCode));
        sb.append(',');
        sb.append("attsCode");
        sb.append('=');
        sb.append(((this.attsCode == null)?"<null>":this.attsCode));
        sb.append(',');
        sb.append("campCode");
        sb.append('=');
        sb.append(((this.campCode == null)?"<null>":this.campCode));
        sb.append(',');
        sb.append("clasCode");
        sb.append('=');
        sb.append(((this.clasCode == null)?"<null>":this.clasCode));
        sb.append(',');
        sb.append("stypCode");
        sb.append('=');
        sb.append(((this.stypCode == null)?"<null>":this.stypCode));
        sb.append(',');
        sb.append("collCode");
        sb.append('=');
        sb.append(((this.collCode == null)?"<null>":this.collCode));
        sb.append(',');
        sb.append("actcCode");
        sb.append('=');
        sb.append(((this.actcCode == null)?"<null>":this.actcCode));
        sb.append(',');
        sb.append("deptCode");
        sb.append('=');
        sb.append(((this.deptCode == null)?"<null>":this.deptCode));
        sb.append(',');
        sb.append("levlCode");
        sb.append('=');
        sb.append(((this.levlCode == null)?"<null>":this.levlCode));
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
        result = ((result* 31)+((this.vtypCode == null)? 0 :this.vtypCode.hashCode()));
        result = ((result* 31)+((this.primSecCde == null)? 0 :this.primSecCde.hashCode()));
        result = ((result* 31)+((this.resdCode == null)? 0 :this.resdCode.hashCode()));
        result = ((result* 31)+((this.degcCode == null)? 0 :this.degcCode.hashCode()));
        result = ((result* 31)+((this.maxHrs == null)? 0 :this.maxHrs.hashCode()));
        result = ((result* 31)+((this.program == null)? 0 :this.program.hashCode()));
        result = ((result* 31)+((this.majrCode == null)? 0 :this.majrCode.hashCode()));
        result = ((result* 31)+((this.minHrs == null)? 0 :this.minHrs.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.lfstCode == null)? 0 :this.lfstCode.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.admtCode == null)? 0 :this.admtCode.hashCode()));
        result = ((result* 31)+((this.chrtCode == null)? 0 :this.chrtCode.hashCode()));
        result = ((result* 31)+((this.attsCode == null)? 0 :this.attsCode.hashCode()));
        result = ((result* 31)+((this.campCode == null)? 0 :this.campCode.hashCode()));
        result = ((result* 31)+((this.clasCode == null)? 0 :this.clasCode.hashCode()));
        result = ((result* 31)+((this.stypCode == null)? 0 :this.stypCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.collCode == null)? 0 :this.collCode.hashCode()));
        result = ((result* 31)+((this.actcCode == null)? 0 :this.actcCode.hashCode()));
        result = ((result* 31)+((this.deptCode == null)? 0 :this.deptCode.hashCode()));
        result = ((result* 31)+((this.levlCode == null)? 0 :this.levlCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RegistrationMinimumMaximumHours100GetResponse) == false) {
            return false;
        }
        RegistrationMinimumMaximumHours100GetResponse rhs = ((RegistrationMinimumMaximumHours100GetResponse) other);
        return (((((((((((((((((((((((this.vtypCode == rhs.vtypCode)||((this.vtypCode!= null)&&this.vtypCode.equals(rhs.vtypCode)))&&((this.primSecCde == rhs.primSecCde)||((this.primSecCde!= null)&&this.primSecCde.equals(rhs.primSecCde))))&&((this.resdCode == rhs.resdCode)||((this.resdCode!= null)&&this.resdCode.equals(rhs.resdCode))))&&((this.degcCode == rhs.degcCode)||((this.degcCode!= null)&&this.degcCode.equals(rhs.degcCode))))&&((this.maxHrs == rhs.maxHrs)||((this.maxHrs!= null)&&this.maxHrs.equals(rhs.maxHrs))))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.majrCode == rhs.majrCode)||((this.majrCode!= null)&&this.majrCode.equals(rhs.majrCode))))&&((this.minHrs == rhs.minHrs)||((this.minHrs!= null)&&this.minHrs.equals(rhs.minHrs))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.lfstCode == rhs.lfstCode)||((this.lfstCode!= null)&&this.lfstCode.equals(rhs.lfstCode))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.admtCode == rhs.admtCode)||((this.admtCode!= null)&&this.admtCode.equals(rhs.admtCode))))&&((this.chrtCode == rhs.chrtCode)||((this.chrtCode!= null)&&this.chrtCode.equals(rhs.chrtCode))))&&((this.attsCode == rhs.attsCode)||((this.attsCode!= null)&&this.attsCode.equals(rhs.attsCode))))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.clasCode == rhs.clasCode)||((this.clasCode!= null)&&this.clasCode.equals(rhs.clasCode))))&&((this.stypCode == rhs.stypCode)||((this.stypCode!= null)&&this.stypCode.equals(rhs.stypCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.actcCode == rhs.actcCode)||((this.actcCode!= null)&&this.actcCode.equals(rhs.actcCode))))&&((this.deptCode == rhs.deptCode)||((this.deptCode!= null)&&this.deptCode.equals(rhs.deptCode))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))));
    }

}
