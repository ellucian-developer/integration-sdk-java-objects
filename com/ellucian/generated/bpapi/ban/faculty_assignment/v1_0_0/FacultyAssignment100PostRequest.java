
package com.ellucian.generated.bpapi.ban.faculty_assignment.v1_0_0;

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
    "percentResponse",
    "overRide",
    "topsCode",
    "nistCode",
    "nistWorkload",
    "fcntCode",
    "sibinstWkldCode",
    "posn",
    "keyblocTermCodeEff",
    "weeklyHrs",
    "suff",
    "sirnistPosn",
    "id",
    "category",
    "collCode",
    "crn",
    "percentSess",
    "deptCode",
    "astyCode",
    "primaryInd"
})
@Generated("jsonschema2pojo")
public class FacultyAssignment100PostRequest {

    /**
     * Percent Responsibility
     * <p>
     * Lineage reference object : SIRASGN_PERCENT_RESPONSE
     * (Required)
     * 
     */
    @JsonProperty("percentResponse")
    @JsonPropertyDescription("Lineage reference object : SIRASGN_PERCENT_RESPONSE")
    private Double percentResponse;
    /**
     * Lineage reference object : SIRASGN_OVER_RIDE
     * 
     */
    @JsonProperty("overRide")
    @JsonPropertyDescription("Lineage reference object : SIRASGN_OVER_RIDE")
    private String overRide;
    /**
     * TOPS
     * <p>
     * Lineage reference object : SIRNIST_TOPS_CODE, Lookup lineage reference object : stvtops
     * 
     */
    @JsonProperty("topsCode")
    @JsonPropertyDescription("Lineage reference object : SIRNIST_TOPS_CODE, Lookup lineage reference object : stvtops")
    private String topsCode;
    /**
     * Type
     * <p>
     * Lineage reference object : SIRNIST_NIST_CODE, Lookup lineage reference object : stvnist
     * 
     */
    @JsonProperty("nistCode")
    @JsonPropertyDescription("Lineage reference object : SIRNIST_NIST_CODE, Lookup lineage reference object : stvnist")
    private String nistCode;
    /**
     * Workload
     * <p>
     * Lineage reference object : SIRNIST_NIST_WORKLOAD
     * 
     */
    @JsonProperty("nistWorkload")
    @JsonPropertyDescription("Lineage reference object : SIRNIST_NIST_WORKLOAD")
    private Double nistWorkload;
    /**
     * Contract
     * <p>
     * Lineage reference object : SIRNIST_FCNT_CODE, Lookup lineage reference object : stvfcnt,siricnt,siricnt
     * 
     */
    @JsonProperty("fcntCode")
    @JsonPropertyDescription("Lineage reference object : SIRNIST_FCNT_CODE, Lookup lineage reference object : stvfcnt,siricnt,siricnt")
    private String fcntCode;
    /**
     * Workload Rule
     * <p>
     * Lineage reference object : SIBINST_WKLD_CODE
     * 
     */
    @JsonProperty("sibinstWkldCode")
    @JsonPropertyDescription("Lineage reference object : SIBINST_WKLD_CODE")
    private String sibinstWkldCode;
    /**
     * Position Number
     * <p>
     * Lineage reference object : SIRASGN_POSN
     * 
     */
    @JsonProperty("posn")
    @JsonPropertyDescription("Lineage reference object : SIRASGN_POSN")
    private String posn;
    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCodeEff, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCodeEff")
    @JsonPropertyDescription("Lineage reference object : keyblocTermCodeEff, Lookup lineage reference object : stvterm")
    private Object keyblocTermCodeEff;
    /**
     * Weekly Contact
     * <p>
     * Lineage reference object : SIRNIST_WEEKLY_HRS
     * 
     */
    @JsonProperty("weeklyHrs")
    @JsonPropertyDescription("Lineage reference object : SIRNIST_WEEKLY_HRS")
    private Double weeklyHrs;
    /**
     * Position Suffix
     * <p>
     * Lineage reference object : SIRNIST_SUFF
     * 
     */
    @JsonProperty("suff")
    @JsonPropertyDescription("Lineage reference object : SIRNIST_SUFF")
    private String suff;
    /**
     * Position Number
     * <p>
     * Lineage reference object : SIRNIST_POSN
     * 
     */
    @JsonProperty("sirnistPosn")
    @JsonPropertyDescription("Lineage reference object : SIRNIST_POSN")
    private String sirnistPosn;
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
     * Session
     * <p>
     * Lineage reference object : SIRASGN_CATEGORY
     * (Required)
     * 
     */
    @JsonProperty("category")
    @JsonPropertyDescription("Lineage reference object : SIRASGN_CATEGORY")
    private String category;
    /**
     * College
     * <p>
     * Lineage reference object : SIRNIST_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    @JsonPropertyDescription("Lineage reference object : SIRNIST_COLL_CODE, Lookup lineage reference object : stvcoll")
    private String collCode;
    /**
     * CRN
     * <p>
     * Lineage reference object : SIRASGN_CRN
     * (Required)
     * 
     */
    @JsonProperty("crn")
    @JsonPropertyDescription("Lineage reference object : SIRASGN_CRN")
    private String crn;
    /**
     * Percentage of Session
     * <p>
     * Lineage reference object : SIRASGN_PERCENT_SESS
     * (Required)
     * 
     */
    @JsonProperty("percentSess")
    @JsonPropertyDescription("Lineage reference object : SIRASGN_PERCENT_SESS")
    private Double percentSess;
    /**
     * Department
     * <p>
     * Lineage reference object : SIRNIST_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    @JsonPropertyDescription("Lineage reference object : SIRNIST_DEPT_CODE, Lookup lineage reference object : stvdept")
    private String deptCode;
    /**
     * Assignment Type
     * <p>
     * Lineage reference object : SIRNIST_ASTY_CODE, Lookup lineage reference object : stvasty
     * 
     */
    @JsonProperty("astyCode")
    @JsonPropertyDescription("Lineage reference object : SIRNIST_ASTY_CODE, Lookup lineage reference object : stvasty")
    private String astyCode;
    /**
     * Lineage reference object : SIRASGN_PRIMARY_IND
     * 
     */
    @JsonProperty("primaryInd")
    @JsonPropertyDescription("Lineage reference object : SIRASGN_PRIMARY_IND")
    private String primaryInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Percent Responsibility
     * <p>
     * Lineage reference object : SIRASGN_PERCENT_RESPONSE
     * (Required)
     * 
     */
    @JsonProperty("percentResponse")
    public Double getPercentResponse() {
        return percentResponse;
    }

    /**
     * Percent Responsibility
     * <p>
     * Lineage reference object : SIRASGN_PERCENT_RESPONSE
     * (Required)
     * 
     */
    @JsonProperty("percentResponse")
    public void setPercentResponse(Double percentResponse) {
        this.percentResponse = percentResponse;
    }

    public FacultyAssignment100PostRequest withPercentResponse(Double percentResponse) {
        this.percentResponse = percentResponse;
        return this;
    }

    /**
     * Lineage reference object : SIRASGN_OVER_RIDE
     * 
     */
    @JsonProperty("overRide")
    public String getOverRide() {
        return overRide;
    }

    /**
     * Lineage reference object : SIRASGN_OVER_RIDE
     * 
     */
    @JsonProperty("overRide")
    public void setOverRide(String overRide) {
        this.overRide = overRide;
    }

    public FacultyAssignment100PostRequest withOverRide(String overRide) {
        this.overRide = overRide;
        return this;
    }

    /**
     * TOPS
     * <p>
     * Lineage reference object : SIRNIST_TOPS_CODE, Lookup lineage reference object : stvtops
     * 
     */
    @JsonProperty("topsCode")
    public String getTopsCode() {
        return topsCode;
    }

    /**
     * TOPS
     * <p>
     * Lineage reference object : SIRNIST_TOPS_CODE, Lookup lineage reference object : stvtops
     * 
     */
    @JsonProperty("topsCode")
    public void setTopsCode(String topsCode) {
        this.topsCode = topsCode;
    }

    public FacultyAssignment100PostRequest withTopsCode(String topsCode) {
        this.topsCode = topsCode;
        return this;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : SIRNIST_NIST_CODE, Lookup lineage reference object : stvnist
     * 
     */
    @JsonProperty("nistCode")
    public String getNistCode() {
        return nistCode;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : SIRNIST_NIST_CODE, Lookup lineage reference object : stvnist
     * 
     */
    @JsonProperty("nistCode")
    public void setNistCode(String nistCode) {
        this.nistCode = nistCode;
    }

    public FacultyAssignment100PostRequest withNistCode(String nistCode) {
        this.nistCode = nistCode;
        return this;
    }

    /**
     * Workload
     * <p>
     * Lineage reference object : SIRNIST_NIST_WORKLOAD
     * 
     */
    @JsonProperty("nistWorkload")
    public Double getNistWorkload() {
        return nistWorkload;
    }

    /**
     * Workload
     * <p>
     * Lineage reference object : SIRNIST_NIST_WORKLOAD
     * 
     */
    @JsonProperty("nistWorkload")
    public void setNistWorkload(Double nistWorkload) {
        this.nistWorkload = nistWorkload;
    }

    public FacultyAssignment100PostRequest withNistWorkload(Double nistWorkload) {
        this.nistWorkload = nistWorkload;
        return this;
    }

    /**
     * Contract
     * <p>
     * Lineage reference object : SIRNIST_FCNT_CODE, Lookup lineage reference object : stvfcnt,siricnt,siricnt
     * 
     */
    @JsonProperty("fcntCode")
    public String getFcntCode() {
        return fcntCode;
    }

    /**
     * Contract
     * <p>
     * Lineage reference object : SIRNIST_FCNT_CODE, Lookup lineage reference object : stvfcnt,siricnt,siricnt
     * 
     */
    @JsonProperty("fcntCode")
    public void setFcntCode(String fcntCode) {
        this.fcntCode = fcntCode;
    }

    public FacultyAssignment100PostRequest withFcntCode(String fcntCode) {
        this.fcntCode = fcntCode;
        return this;
    }

    /**
     * Workload Rule
     * <p>
     * Lineage reference object : SIBINST_WKLD_CODE
     * 
     */
    @JsonProperty("sibinstWkldCode")
    public String getSibinstWkldCode() {
        return sibinstWkldCode;
    }

    /**
     * Workload Rule
     * <p>
     * Lineage reference object : SIBINST_WKLD_CODE
     * 
     */
    @JsonProperty("sibinstWkldCode")
    public void setSibinstWkldCode(String sibinstWkldCode) {
        this.sibinstWkldCode = sibinstWkldCode;
    }

    public FacultyAssignment100PostRequest withSibinstWkldCode(String sibinstWkldCode) {
        this.sibinstWkldCode = sibinstWkldCode;
        return this;
    }

    /**
     * Position Number
     * <p>
     * Lineage reference object : SIRASGN_POSN
     * 
     */
    @JsonProperty("posn")
    public String getPosn() {
        return posn;
    }

    /**
     * Position Number
     * <p>
     * Lineage reference object : SIRASGN_POSN
     * 
     */
    @JsonProperty("posn")
    public void setPosn(String posn) {
        this.posn = posn;
    }

    public FacultyAssignment100PostRequest withPosn(String posn) {
        this.posn = posn;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCodeEff, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCodeEff")
    public Object getKeyblocTermCodeEff() {
        return keyblocTermCodeEff;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCodeEff, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCodeEff")
    public void setKeyblocTermCodeEff(Object keyblocTermCodeEff) {
        this.keyblocTermCodeEff = keyblocTermCodeEff;
    }

    public FacultyAssignment100PostRequest withKeyblocTermCodeEff(Object keyblocTermCodeEff) {
        this.keyblocTermCodeEff = keyblocTermCodeEff;
        return this;
    }

    /**
     * Weekly Contact
     * <p>
     * Lineage reference object : SIRNIST_WEEKLY_HRS
     * 
     */
    @JsonProperty("weeklyHrs")
    public Double getWeeklyHrs() {
        return weeklyHrs;
    }

    /**
     * Weekly Contact
     * <p>
     * Lineage reference object : SIRNIST_WEEKLY_HRS
     * 
     */
    @JsonProperty("weeklyHrs")
    public void setWeeklyHrs(Double weeklyHrs) {
        this.weeklyHrs = weeklyHrs;
    }

    public FacultyAssignment100PostRequest withWeeklyHrs(Double weeklyHrs) {
        this.weeklyHrs = weeklyHrs;
        return this;
    }

    /**
     * Position Suffix
     * <p>
     * Lineage reference object : SIRNIST_SUFF
     * 
     */
    @JsonProperty("suff")
    public String getSuff() {
        return suff;
    }

    /**
     * Position Suffix
     * <p>
     * Lineage reference object : SIRNIST_SUFF
     * 
     */
    @JsonProperty("suff")
    public void setSuff(String suff) {
        this.suff = suff;
    }

    public FacultyAssignment100PostRequest withSuff(String suff) {
        this.suff = suff;
        return this;
    }

    /**
     * Position Number
     * <p>
     * Lineage reference object : SIRNIST_POSN
     * 
     */
    @JsonProperty("sirnistPosn")
    public String getSirnistPosn() {
        return sirnistPosn;
    }

    /**
     * Position Number
     * <p>
     * Lineage reference object : SIRNIST_POSN
     * 
     */
    @JsonProperty("sirnistPosn")
    public void setSirnistPosn(String sirnistPosn) {
        this.sirnistPosn = sirnistPosn;
    }

    public FacultyAssignment100PostRequest withSirnistPosn(String sirnistPosn) {
        this.sirnistPosn = sirnistPosn;
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

    public FacultyAssignment100PostRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Session
     * <p>
     * Lineage reference object : SIRASGN_CATEGORY
     * (Required)
     * 
     */
    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    /**
     * Session
     * <p>
     * Lineage reference object : SIRASGN_CATEGORY
     * (Required)
     * 
     */
    @JsonProperty("category")
    public void setCategory(String category) {
        this.category = category;
    }

    public FacultyAssignment100PostRequest withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SIRNIST_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    public String getCollCode() {
        return collCode;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SIRNIST_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    public void setCollCode(String collCode) {
        this.collCode = collCode;
    }

    public FacultyAssignment100PostRequest withCollCode(String collCode) {
        this.collCode = collCode;
        return this;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : SIRASGN_CRN
     * (Required)
     * 
     */
    @JsonProperty("crn")
    public String getCrn() {
        return crn;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : SIRASGN_CRN
     * (Required)
     * 
     */
    @JsonProperty("crn")
    public void setCrn(String crn) {
        this.crn = crn;
    }

    public FacultyAssignment100PostRequest withCrn(String crn) {
        this.crn = crn;
        return this;
    }

    /**
     * Percentage of Session
     * <p>
     * Lineage reference object : SIRASGN_PERCENT_SESS
     * (Required)
     * 
     */
    @JsonProperty("percentSess")
    public Double getPercentSess() {
        return percentSess;
    }

    /**
     * Percentage of Session
     * <p>
     * Lineage reference object : SIRASGN_PERCENT_SESS
     * (Required)
     * 
     */
    @JsonProperty("percentSess")
    public void setPercentSess(Double percentSess) {
        this.percentSess = percentSess;
    }

    public FacultyAssignment100PostRequest withPercentSess(Double percentSess) {
        this.percentSess = percentSess;
        return this;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SIRNIST_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SIRNIST_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public FacultyAssignment100PostRequest withDeptCode(String deptCode) {
        this.deptCode = deptCode;
        return this;
    }

    /**
     * Assignment Type
     * <p>
     * Lineage reference object : SIRNIST_ASTY_CODE, Lookup lineage reference object : stvasty
     * 
     */
    @JsonProperty("astyCode")
    public String getAstyCode() {
        return astyCode;
    }

    /**
     * Assignment Type
     * <p>
     * Lineage reference object : SIRNIST_ASTY_CODE, Lookup lineage reference object : stvasty
     * 
     */
    @JsonProperty("astyCode")
    public void setAstyCode(String astyCode) {
        this.astyCode = astyCode;
    }

    public FacultyAssignment100PostRequest withAstyCode(String astyCode) {
        this.astyCode = astyCode;
        return this;
    }

    /**
     * Lineage reference object : SIRASGN_PRIMARY_IND
     * 
     */
    @JsonProperty("primaryInd")
    public String getPrimaryInd() {
        return primaryInd;
    }

    /**
     * Lineage reference object : SIRASGN_PRIMARY_IND
     * 
     */
    @JsonProperty("primaryInd")
    public void setPrimaryInd(String primaryInd) {
        this.primaryInd = primaryInd;
    }

    public FacultyAssignment100PostRequest withPrimaryInd(String primaryInd) {
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

    public FacultyAssignment100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FacultyAssignment100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("percentResponse");
        sb.append('=');
        sb.append(((this.percentResponse == null)?"<null>":this.percentResponse));
        sb.append(',');
        sb.append("overRide");
        sb.append('=');
        sb.append(((this.overRide == null)?"<null>":this.overRide));
        sb.append(',');
        sb.append("topsCode");
        sb.append('=');
        sb.append(((this.topsCode == null)?"<null>":this.topsCode));
        sb.append(',');
        sb.append("nistCode");
        sb.append('=');
        sb.append(((this.nistCode == null)?"<null>":this.nistCode));
        sb.append(',');
        sb.append("nistWorkload");
        sb.append('=');
        sb.append(((this.nistWorkload == null)?"<null>":this.nistWorkload));
        sb.append(',');
        sb.append("fcntCode");
        sb.append('=');
        sb.append(((this.fcntCode == null)?"<null>":this.fcntCode));
        sb.append(',');
        sb.append("sibinstWkldCode");
        sb.append('=');
        sb.append(((this.sibinstWkldCode == null)?"<null>":this.sibinstWkldCode));
        sb.append(',');
        sb.append("posn");
        sb.append('=');
        sb.append(((this.posn == null)?"<null>":this.posn));
        sb.append(',');
        sb.append("keyblocTermCodeEff");
        sb.append('=');
        sb.append(((this.keyblocTermCodeEff == null)?"<null>":this.keyblocTermCodeEff));
        sb.append(',');
        sb.append("weeklyHrs");
        sb.append('=');
        sb.append(((this.weeklyHrs == null)?"<null>":this.weeklyHrs));
        sb.append(',');
        sb.append("suff");
        sb.append('=');
        sb.append(((this.suff == null)?"<null>":this.suff));
        sb.append(',');
        sb.append("sirnistPosn");
        sb.append('=');
        sb.append(((this.sirnistPosn == null)?"<null>":this.sirnistPosn));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("collCode");
        sb.append('=');
        sb.append(((this.collCode == null)?"<null>":this.collCode));
        sb.append(',');
        sb.append("crn");
        sb.append('=');
        sb.append(((this.crn == null)?"<null>":this.crn));
        sb.append(',');
        sb.append("percentSess");
        sb.append('=');
        sb.append(((this.percentSess == null)?"<null>":this.percentSess));
        sb.append(',');
        sb.append("deptCode");
        sb.append('=');
        sb.append(((this.deptCode == null)?"<null>":this.deptCode));
        sb.append(',');
        sb.append("astyCode");
        sb.append('=');
        sb.append(((this.astyCode == null)?"<null>":this.astyCode));
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
        result = ((result* 31)+((this.percentResponse == null)? 0 :this.percentResponse.hashCode()));
        result = ((result* 31)+((this.overRide == null)? 0 :this.overRide.hashCode()));
        result = ((result* 31)+((this.topsCode == null)? 0 :this.topsCode.hashCode()));
        result = ((result* 31)+((this.nistCode == null)? 0 :this.nistCode.hashCode()));
        result = ((result* 31)+((this.nistWorkload == null)? 0 :this.nistWorkload.hashCode()));
        result = ((result* 31)+((this.fcntCode == null)? 0 :this.fcntCode.hashCode()));
        result = ((result* 31)+((this.sibinstWkldCode == null)? 0 :this.sibinstWkldCode.hashCode()));
        result = ((result* 31)+((this.posn == null)? 0 :this.posn.hashCode()));
        result = ((result* 31)+((this.keyblocTermCodeEff == null)? 0 :this.keyblocTermCodeEff.hashCode()));
        result = ((result* 31)+((this.weeklyHrs == null)? 0 :this.weeklyHrs.hashCode()));
        result = ((result* 31)+((this.suff == null)? 0 :this.suff.hashCode()));
        result = ((result* 31)+((this.sirnistPosn == null)? 0 :this.sirnistPosn.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        result = ((result* 31)+((this.collCode == null)? 0 :this.collCode.hashCode()));
        result = ((result* 31)+((this.crn == null)? 0 :this.crn.hashCode()));
        result = ((result* 31)+((this.percentSess == null)? 0 :this.percentSess.hashCode()));
        result = ((result* 31)+((this.deptCode == null)? 0 :this.deptCode.hashCode()));
        result = ((result* 31)+((this.astyCode == null)? 0 :this.astyCode.hashCode()));
        result = ((result* 31)+((this.primaryInd == null)? 0 :this.primaryInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FacultyAssignment100PostRequest) == false) {
            return false;
        }
        FacultyAssignment100PostRequest rhs = ((FacultyAssignment100PostRequest) other);
        return ((((((((((((((((((((((this.percentResponse == rhs.percentResponse)||((this.percentResponse!= null)&&this.percentResponse.equals(rhs.percentResponse)))&&((this.overRide == rhs.overRide)||((this.overRide!= null)&&this.overRide.equals(rhs.overRide))))&&((this.topsCode == rhs.topsCode)||((this.topsCode!= null)&&this.topsCode.equals(rhs.topsCode))))&&((this.nistCode == rhs.nistCode)||((this.nistCode!= null)&&this.nistCode.equals(rhs.nistCode))))&&((this.nistWorkload == rhs.nistWorkload)||((this.nistWorkload!= null)&&this.nistWorkload.equals(rhs.nistWorkload))))&&((this.fcntCode == rhs.fcntCode)||((this.fcntCode!= null)&&this.fcntCode.equals(rhs.fcntCode))))&&((this.sibinstWkldCode == rhs.sibinstWkldCode)||((this.sibinstWkldCode!= null)&&this.sibinstWkldCode.equals(rhs.sibinstWkldCode))))&&((this.posn == rhs.posn)||((this.posn!= null)&&this.posn.equals(rhs.posn))))&&((this.keyblocTermCodeEff == rhs.keyblocTermCodeEff)||((this.keyblocTermCodeEff!= null)&&this.keyblocTermCodeEff.equals(rhs.keyblocTermCodeEff))))&&((this.weeklyHrs == rhs.weeklyHrs)||((this.weeklyHrs!= null)&&this.weeklyHrs.equals(rhs.weeklyHrs))))&&((this.suff == rhs.suff)||((this.suff!= null)&&this.suff.equals(rhs.suff))))&&((this.sirnistPosn == rhs.sirnistPosn)||((this.sirnistPosn!= null)&&this.sirnistPosn.equals(rhs.sirnistPosn))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.crn == rhs.crn)||((this.crn!= null)&&this.crn.equals(rhs.crn))))&&((this.percentSess == rhs.percentSess)||((this.percentSess!= null)&&this.percentSess.equals(rhs.percentSess))))&&((this.deptCode == rhs.deptCode)||((this.deptCode!= null)&&this.deptCode.equals(rhs.deptCode))))&&((this.astyCode == rhs.astyCode)||((this.astyCode!= null)&&this.astyCode.equals(rhs.astyCode))))&&((this.primaryInd == rhs.primaryInd)||((this.primaryInd!= null)&&this.primaryInd.equals(rhs.primaryInd))));
    }

}
