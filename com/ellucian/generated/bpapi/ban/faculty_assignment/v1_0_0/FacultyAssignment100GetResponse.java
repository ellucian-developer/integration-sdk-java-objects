
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
    "addInst",
    "compensationAppliedCbox",
    "workloadAdjust",
    "sessHrs",
    "generatedCredits",
    "suff",
    "crn",
    "overRide",
    "assignFte",
    "subjCode",
    "fcntCode",
    "workload",
    "calcWorkload",
    "compensationExtractedCbox",
    "posn",
    "totalContact",
    "crseNumb",
    "seqNumb",
    "weeklyContact",
    "category",
    "instCred",
    "astyCode",
    "percentSess",
    "primaryInd"
})
@Generated("jsonschema2pojo")
public class FacultyAssignment100GetResponse {

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
     * Additional Instructors
     * <p>
     * 
     * 
     */
    @JsonProperty("addInst")
    private String addInst;
    @JsonProperty("compensationAppliedCbox")
    private String compensationAppliedCbox;
    /**
     * Override Workload
     * <p>
     * Lineage reference object : SIRASGN_WORKLOAD_ADJUST
     * 
     */
    @JsonProperty("workloadAdjust")
    @JsonPropertyDescription("Lineage reference object : SIRASGN_WORKLOAD_ADJUST")
    private Double workloadAdjust;
    /**
     * Session Credit
     * <p>
     * 
     * 
     */
    @JsonProperty("sessHrs")
    private Double sessHrs;
    /**
     * Generated Credits
     * <p>
     * 
     * 
     */
    @JsonProperty("generatedCredits")
    private Double generatedCredits;
    /**
     * Position Number Suffix
     * <p>
     * Lineage reference object : SIRASGN_SUFF
     * 
     */
    @JsonProperty("suff")
    @JsonPropertyDescription("Lineage reference object : SIRASGN_SUFF")
    private String suff;
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
     * Lineage reference object : SIRASGN_OVER_RIDE
     * 
     */
    @JsonProperty("overRide")
    @JsonPropertyDescription("Lineage reference object : SIRASGN_OVER_RIDE")
    private String overRide;
    /**
     * FTE
     * <p>
     * 
     * 
     */
    @JsonProperty("assignFte")
    private Double assignFte;
    /**
     * Subject
     * <p>
     * 
     * 
     */
    @JsonProperty("subjCode")
    private String subjCode;
    /**
     * Contract Type
     * <p>
     * Lineage reference object : SIRASGN_FCNT_CODE, Lookup lineage reference object : stvfcnt,siricnt,siricnt
     * 
     */
    @JsonProperty("fcntCode")
    @JsonPropertyDescription("Lineage reference object : SIRASGN_FCNT_CODE, Lookup lineage reference object : stvfcnt,siricnt,siricnt")
    private String fcntCode;
    /**
     * Workload
     * <p>
     * 
     * 
     */
    @JsonProperty("workload")
    private Double workload;
    /**
     * Calculated Workload
     * <p>
     * 
     * 
     */
    @JsonProperty("calcWorkload")
    private Double calcWorkload;
    @JsonProperty("compensationExtractedCbox")
    private String compensationExtractedCbox;
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
     * Total Contact
     * <p>
     * 
     * 
     */
    @JsonProperty("totalContact")
    private Double totalContact;
    /**
     * Course
     * <p>
     * 
     * 
     */
    @JsonProperty("crseNumb")
    private String crseNumb;
    /**
     * Section
     * <p>
     * 
     * 
     */
    @JsonProperty("seqNumb")
    private String seqNumb;
    /**
     * Weekly Contact
     * <p>
     * 
     * 
     */
    @JsonProperty("weeklyContact")
    private Double weeklyContact;
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
     * Institutional Credit
     * <p>
     * 
     * 
     */
    @JsonProperty("instCred")
    private Double instCred;
    /**
     * Assignment Type
     * <p>
     * Lineage reference object : SIRASGN_ASTY_CODE, Lookup lineage reference object : stvasty
     * 
     */
    @JsonProperty("astyCode")
    @JsonPropertyDescription("Lineage reference object : SIRASGN_ASTY_CODE, Lookup lineage reference object : stvasty")
    private String astyCode;
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

    public FacultyAssignment100GetResponse withPercentResponse(Double percentResponse) {
        this.percentResponse = percentResponse;
        return this;
    }

    /**
     * Additional Instructors
     * <p>
     * 
     * 
     */
    @JsonProperty("addInst")
    public String getAddInst() {
        return addInst;
    }

    /**
     * Additional Instructors
     * <p>
     * 
     * 
     */
    @JsonProperty("addInst")
    public void setAddInst(String addInst) {
        this.addInst = addInst;
    }

    public FacultyAssignment100GetResponse withAddInst(String addInst) {
        this.addInst = addInst;
        return this;
    }

    @JsonProperty("compensationAppliedCbox")
    public String getCompensationAppliedCbox() {
        return compensationAppliedCbox;
    }

    @JsonProperty("compensationAppliedCbox")
    public void setCompensationAppliedCbox(String compensationAppliedCbox) {
        this.compensationAppliedCbox = compensationAppliedCbox;
    }

    public FacultyAssignment100GetResponse withCompensationAppliedCbox(String compensationAppliedCbox) {
        this.compensationAppliedCbox = compensationAppliedCbox;
        return this;
    }

    /**
     * Override Workload
     * <p>
     * Lineage reference object : SIRASGN_WORKLOAD_ADJUST
     * 
     */
    @JsonProperty("workloadAdjust")
    public Double getWorkloadAdjust() {
        return workloadAdjust;
    }

    /**
     * Override Workload
     * <p>
     * Lineage reference object : SIRASGN_WORKLOAD_ADJUST
     * 
     */
    @JsonProperty("workloadAdjust")
    public void setWorkloadAdjust(Double workloadAdjust) {
        this.workloadAdjust = workloadAdjust;
    }

    public FacultyAssignment100GetResponse withWorkloadAdjust(Double workloadAdjust) {
        this.workloadAdjust = workloadAdjust;
        return this;
    }

    /**
     * Session Credit
     * <p>
     * 
     * 
     */
    @JsonProperty("sessHrs")
    public Double getSessHrs() {
        return sessHrs;
    }

    /**
     * Session Credit
     * <p>
     * 
     * 
     */
    @JsonProperty("sessHrs")
    public void setSessHrs(Double sessHrs) {
        this.sessHrs = sessHrs;
    }

    public FacultyAssignment100GetResponse withSessHrs(Double sessHrs) {
        this.sessHrs = sessHrs;
        return this;
    }

    /**
     * Generated Credits
     * <p>
     * 
     * 
     */
    @JsonProperty("generatedCredits")
    public Double getGeneratedCredits() {
        return generatedCredits;
    }

    /**
     * Generated Credits
     * <p>
     * 
     * 
     */
    @JsonProperty("generatedCredits")
    public void setGeneratedCredits(Double generatedCredits) {
        this.generatedCredits = generatedCredits;
    }

    public FacultyAssignment100GetResponse withGeneratedCredits(Double generatedCredits) {
        this.generatedCredits = generatedCredits;
        return this;
    }

    /**
     * Position Number Suffix
     * <p>
     * Lineage reference object : SIRASGN_SUFF
     * 
     */
    @JsonProperty("suff")
    public String getSuff() {
        return suff;
    }

    /**
     * Position Number Suffix
     * <p>
     * Lineage reference object : SIRASGN_SUFF
     * 
     */
    @JsonProperty("suff")
    public void setSuff(String suff) {
        this.suff = suff;
    }

    public FacultyAssignment100GetResponse withSuff(String suff) {
        this.suff = suff;
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

    public FacultyAssignment100GetResponse withCrn(String crn) {
        this.crn = crn;
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

    public FacultyAssignment100GetResponse withOverRide(String overRide) {
        this.overRide = overRide;
        return this;
    }

    /**
     * FTE
     * <p>
     * 
     * 
     */
    @JsonProperty("assignFte")
    public Double getAssignFte() {
        return assignFte;
    }

    /**
     * FTE
     * <p>
     * 
     * 
     */
    @JsonProperty("assignFte")
    public void setAssignFte(Double assignFte) {
        this.assignFte = assignFte;
    }

    public FacultyAssignment100GetResponse withAssignFte(Double assignFte) {
        this.assignFte = assignFte;
        return this;
    }

    /**
     * Subject
     * <p>
     * 
     * 
     */
    @JsonProperty("subjCode")
    public String getSubjCode() {
        return subjCode;
    }

    /**
     * Subject
     * <p>
     * 
     * 
     */
    @JsonProperty("subjCode")
    public void setSubjCode(String subjCode) {
        this.subjCode = subjCode;
    }

    public FacultyAssignment100GetResponse withSubjCode(String subjCode) {
        this.subjCode = subjCode;
        return this;
    }

    /**
     * Contract Type
     * <p>
     * Lineage reference object : SIRASGN_FCNT_CODE, Lookup lineage reference object : stvfcnt,siricnt,siricnt
     * 
     */
    @JsonProperty("fcntCode")
    public String getFcntCode() {
        return fcntCode;
    }

    /**
     * Contract Type
     * <p>
     * Lineage reference object : SIRASGN_FCNT_CODE, Lookup lineage reference object : stvfcnt,siricnt,siricnt
     * 
     */
    @JsonProperty("fcntCode")
    public void setFcntCode(String fcntCode) {
        this.fcntCode = fcntCode;
    }

    public FacultyAssignment100GetResponse withFcntCode(String fcntCode) {
        this.fcntCode = fcntCode;
        return this;
    }

    /**
     * Workload
     * <p>
     * 
     * 
     */
    @JsonProperty("workload")
    public Double getWorkload() {
        return workload;
    }

    /**
     * Workload
     * <p>
     * 
     * 
     */
    @JsonProperty("workload")
    public void setWorkload(Double workload) {
        this.workload = workload;
    }

    public FacultyAssignment100GetResponse withWorkload(Double workload) {
        this.workload = workload;
        return this;
    }

    /**
     * Calculated Workload
     * <p>
     * 
     * 
     */
    @JsonProperty("calcWorkload")
    public Double getCalcWorkload() {
        return calcWorkload;
    }

    /**
     * Calculated Workload
     * <p>
     * 
     * 
     */
    @JsonProperty("calcWorkload")
    public void setCalcWorkload(Double calcWorkload) {
        this.calcWorkload = calcWorkload;
    }

    public FacultyAssignment100GetResponse withCalcWorkload(Double calcWorkload) {
        this.calcWorkload = calcWorkload;
        return this;
    }

    @JsonProperty("compensationExtractedCbox")
    public String getCompensationExtractedCbox() {
        return compensationExtractedCbox;
    }

    @JsonProperty("compensationExtractedCbox")
    public void setCompensationExtractedCbox(String compensationExtractedCbox) {
        this.compensationExtractedCbox = compensationExtractedCbox;
    }

    public FacultyAssignment100GetResponse withCompensationExtractedCbox(String compensationExtractedCbox) {
        this.compensationExtractedCbox = compensationExtractedCbox;
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

    public FacultyAssignment100GetResponse withPosn(String posn) {
        this.posn = posn;
        return this;
    }

    /**
     * Total Contact
     * <p>
     * 
     * 
     */
    @JsonProperty("totalContact")
    public Double getTotalContact() {
        return totalContact;
    }

    /**
     * Total Contact
     * <p>
     * 
     * 
     */
    @JsonProperty("totalContact")
    public void setTotalContact(Double totalContact) {
        this.totalContact = totalContact;
    }

    public FacultyAssignment100GetResponse withTotalContact(Double totalContact) {
        this.totalContact = totalContact;
        return this;
    }

    /**
     * Course
     * <p>
     * 
     * 
     */
    @JsonProperty("crseNumb")
    public String getCrseNumb() {
        return crseNumb;
    }

    /**
     * Course
     * <p>
     * 
     * 
     */
    @JsonProperty("crseNumb")
    public void setCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
    }

    public FacultyAssignment100GetResponse withCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
        return this;
    }

    /**
     * Section
     * <p>
     * 
     * 
     */
    @JsonProperty("seqNumb")
    public String getSeqNumb() {
        return seqNumb;
    }

    /**
     * Section
     * <p>
     * 
     * 
     */
    @JsonProperty("seqNumb")
    public void setSeqNumb(String seqNumb) {
        this.seqNumb = seqNumb;
    }

    public FacultyAssignment100GetResponse withSeqNumb(String seqNumb) {
        this.seqNumb = seqNumb;
        return this;
    }

    /**
     * Weekly Contact
     * <p>
     * 
     * 
     */
    @JsonProperty("weeklyContact")
    public Double getWeeklyContact() {
        return weeklyContact;
    }

    /**
     * Weekly Contact
     * <p>
     * 
     * 
     */
    @JsonProperty("weeklyContact")
    public void setWeeklyContact(Double weeklyContact) {
        this.weeklyContact = weeklyContact;
    }

    public FacultyAssignment100GetResponse withWeeklyContact(Double weeklyContact) {
        this.weeklyContact = weeklyContact;
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

    public FacultyAssignment100GetResponse withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Institutional Credit
     * <p>
     * 
     * 
     */
    @JsonProperty("instCred")
    public Double getInstCred() {
        return instCred;
    }

    /**
     * Institutional Credit
     * <p>
     * 
     * 
     */
    @JsonProperty("instCred")
    public void setInstCred(Double instCred) {
        this.instCred = instCred;
    }

    public FacultyAssignment100GetResponse withInstCred(Double instCred) {
        this.instCred = instCred;
        return this;
    }

    /**
     * Assignment Type
     * <p>
     * Lineage reference object : SIRASGN_ASTY_CODE, Lookup lineage reference object : stvasty
     * 
     */
    @JsonProperty("astyCode")
    public String getAstyCode() {
        return astyCode;
    }

    /**
     * Assignment Type
     * <p>
     * Lineage reference object : SIRASGN_ASTY_CODE, Lookup lineage reference object : stvasty
     * 
     */
    @JsonProperty("astyCode")
    public void setAstyCode(String astyCode) {
        this.astyCode = astyCode;
    }

    public FacultyAssignment100GetResponse withAstyCode(String astyCode) {
        this.astyCode = astyCode;
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

    public FacultyAssignment100GetResponse withPercentSess(Double percentSess) {
        this.percentSess = percentSess;
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

    public FacultyAssignment100GetResponse withPrimaryInd(String primaryInd) {
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

    public FacultyAssignment100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FacultyAssignment100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("percentResponse");
        sb.append('=');
        sb.append(((this.percentResponse == null)?"<null>":this.percentResponse));
        sb.append(',');
        sb.append("addInst");
        sb.append('=');
        sb.append(((this.addInst == null)?"<null>":this.addInst));
        sb.append(',');
        sb.append("compensationAppliedCbox");
        sb.append('=');
        sb.append(((this.compensationAppliedCbox == null)?"<null>":this.compensationAppliedCbox));
        sb.append(',');
        sb.append("workloadAdjust");
        sb.append('=');
        sb.append(((this.workloadAdjust == null)?"<null>":this.workloadAdjust));
        sb.append(',');
        sb.append("sessHrs");
        sb.append('=');
        sb.append(((this.sessHrs == null)?"<null>":this.sessHrs));
        sb.append(',');
        sb.append("generatedCredits");
        sb.append('=');
        sb.append(((this.generatedCredits == null)?"<null>":this.generatedCredits));
        sb.append(',');
        sb.append("suff");
        sb.append('=');
        sb.append(((this.suff == null)?"<null>":this.suff));
        sb.append(',');
        sb.append("crn");
        sb.append('=');
        sb.append(((this.crn == null)?"<null>":this.crn));
        sb.append(',');
        sb.append("overRide");
        sb.append('=');
        sb.append(((this.overRide == null)?"<null>":this.overRide));
        sb.append(',');
        sb.append("assignFte");
        sb.append('=');
        sb.append(((this.assignFte == null)?"<null>":this.assignFte));
        sb.append(',');
        sb.append("subjCode");
        sb.append('=');
        sb.append(((this.subjCode == null)?"<null>":this.subjCode));
        sb.append(',');
        sb.append("fcntCode");
        sb.append('=');
        sb.append(((this.fcntCode == null)?"<null>":this.fcntCode));
        sb.append(',');
        sb.append("workload");
        sb.append('=');
        sb.append(((this.workload == null)?"<null>":this.workload));
        sb.append(',');
        sb.append("calcWorkload");
        sb.append('=');
        sb.append(((this.calcWorkload == null)?"<null>":this.calcWorkload));
        sb.append(',');
        sb.append("compensationExtractedCbox");
        sb.append('=');
        sb.append(((this.compensationExtractedCbox == null)?"<null>":this.compensationExtractedCbox));
        sb.append(',');
        sb.append("posn");
        sb.append('=');
        sb.append(((this.posn == null)?"<null>":this.posn));
        sb.append(',');
        sb.append("totalContact");
        sb.append('=');
        sb.append(((this.totalContact == null)?"<null>":this.totalContact));
        sb.append(',');
        sb.append("crseNumb");
        sb.append('=');
        sb.append(((this.crseNumb == null)?"<null>":this.crseNumb));
        sb.append(',');
        sb.append("seqNumb");
        sb.append('=');
        sb.append(((this.seqNumb == null)?"<null>":this.seqNumb));
        sb.append(',');
        sb.append("weeklyContact");
        sb.append('=');
        sb.append(((this.weeklyContact == null)?"<null>":this.weeklyContact));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("instCred");
        sb.append('=');
        sb.append(((this.instCred == null)?"<null>":this.instCred));
        sb.append(',');
        sb.append("astyCode");
        sb.append('=');
        sb.append(((this.astyCode == null)?"<null>":this.astyCode));
        sb.append(',');
        sb.append("percentSess");
        sb.append('=');
        sb.append(((this.percentSess == null)?"<null>":this.percentSess));
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
        result = ((result* 31)+((this.addInst == null)? 0 :this.addInst.hashCode()));
        result = ((result* 31)+((this.compensationAppliedCbox == null)? 0 :this.compensationAppliedCbox.hashCode()));
        result = ((result* 31)+((this.workloadAdjust == null)? 0 :this.workloadAdjust.hashCode()));
        result = ((result* 31)+((this.sessHrs == null)? 0 :this.sessHrs.hashCode()));
        result = ((result* 31)+((this.generatedCredits == null)? 0 :this.generatedCredits.hashCode()));
        result = ((result* 31)+((this.suff == null)? 0 :this.suff.hashCode()));
        result = ((result* 31)+((this.crn == null)? 0 :this.crn.hashCode()));
        result = ((result* 31)+((this.overRide == null)? 0 :this.overRide.hashCode()));
        result = ((result* 31)+((this.assignFte == null)? 0 :this.assignFte.hashCode()));
        result = ((result* 31)+((this.subjCode == null)? 0 :this.subjCode.hashCode()));
        result = ((result* 31)+((this.fcntCode == null)? 0 :this.fcntCode.hashCode()));
        result = ((result* 31)+((this.workload == null)? 0 :this.workload.hashCode()));
        result = ((result* 31)+((this.calcWorkload == null)? 0 :this.calcWorkload.hashCode()));
        result = ((result* 31)+((this.compensationExtractedCbox == null)? 0 :this.compensationExtractedCbox.hashCode()));
        result = ((result* 31)+((this.posn == null)? 0 :this.posn.hashCode()));
        result = ((result* 31)+((this.totalContact == null)? 0 :this.totalContact.hashCode()));
        result = ((result* 31)+((this.crseNumb == null)? 0 :this.crseNumb.hashCode()));
        result = ((result* 31)+((this.seqNumb == null)? 0 :this.seqNumb.hashCode()));
        result = ((result* 31)+((this.weeklyContact == null)? 0 :this.weeklyContact.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        result = ((result* 31)+((this.instCred == null)? 0 :this.instCred.hashCode()));
        result = ((result* 31)+((this.astyCode == null)? 0 :this.astyCode.hashCode()));
        result = ((result* 31)+((this.percentSess == null)? 0 :this.percentSess.hashCode()));
        result = ((result* 31)+((this.primaryInd == null)? 0 :this.primaryInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FacultyAssignment100GetResponse) == false) {
            return false;
        }
        FacultyAssignment100GetResponse rhs = ((FacultyAssignment100GetResponse) other);
        return (((((((((((((((((((((((((((this.percentResponse == rhs.percentResponse)||((this.percentResponse!= null)&&this.percentResponse.equals(rhs.percentResponse)))&&((this.addInst == rhs.addInst)||((this.addInst!= null)&&this.addInst.equals(rhs.addInst))))&&((this.compensationAppliedCbox == rhs.compensationAppliedCbox)||((this.compensationAppliedCbox!= null)&&this.compensationAppliedCbox.equals(rhs.compensationAppliedCbox))))&&((this.workloadAdjust == rhs.workloadAdjust)||((this.workloadAdjust!= null)&&this.workloadAdjust.equals(rhs.workloadAdjust))))&&((this.sessHrs == rhs.sessHrs)||((this.sessHrs!= null)&&this.sessHrs.equals(rhs.sessHrs))))&&((this.generatedCredits == rhs.generatedCredits)||((this.generatedCredits!= null)&&this.generatedCredits.equals(rhs.generatedCredits))))&&((this.suff == rhs.suff)||((this.suff!= null)&&this.suff.equals(rhs.suff))))&&((this.crn == rhs.crn)||((this.crn!= null)&&this.crn.equals(rhs.crn))))&&((this.overRide == rhs.overRide)||((this.overRide!= null)&&this.overRide.equals(rhs.overRide))))&&((this.assignFte == rhs.assignFte)||((this.assignFte!= null)&&this.assignFte.equals(rhs.assignFte))))&&((this.subjCode == rhs.subjCode)||((this.subjCode!= null)&&this.subjCode.equals(rhs.subjCode))))&&((this.fcntCode == rhs.fcntCode)||((this.fcntCode!= null)&&this.fcntCode.equals(rhs.fcntCode))))&&((this.workload == rhs.workload)||((this.workload!= null)&&this.workload.equals(rhs.workload))))&&((this.calcWorkload == rhs.calcWorkload)||((this.calcWorkload!= null)&&this.calcWorkload.equals(rhs.calcWorkload))))&&((this.compensationExtractedCbox == rhs.compensationExtractedCbox)||((this.compensationExtractedCbox!= null)&&this.compensationExtractedCbox.equals(rhs.compensationExtractedCbox))))&&((this.posn == rhs.posn)||((this.posn!= null)&&this.posn.equals(rhs.posn))))&&((this.totalContact == rhs.totalContact)||((this.totalContact!= null)&&this.totalContact.equals(rhs.totalContact))))&&((this.crseNumb == rhs.crseNumb)||((this.crseNumb!= null)&&this.crseNumb.equals(rhs.crseNumb))))&&((this.seqNumb == rhs.seqNumb)||((this.seqNumb!= null)&&this.seqNumb.equals(rhs.seqNumb))))&&((this.weeklyContact == rhs.weeklyContact)||((this.weeklyContact!= null)&&this.weeklyContact.equals(rhs.weeklyContact))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.instCred == rhs.instCred)||((this.instCred!= null)&&this.instCred.equals(rhs.instCred))))&&((this.astyCode == rhs.astyCode)||((this.astyCode!= null)&&this.astyCode.equals(rhs.astyCode))))&&((this.percentSess == rhs.percentSess)||((this.percentSess!= null)&&this.percentSess.equals(rhs.percentSess))))&&((this.primaryInd == rhs.primaryInd)||((this.primaryInd!= null)&&this.primaryInd.equals(rhs.primaryInd))));
    }

}
