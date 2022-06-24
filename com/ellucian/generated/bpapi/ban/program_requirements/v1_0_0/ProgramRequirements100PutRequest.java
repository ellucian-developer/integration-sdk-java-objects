
package com.ellucian.generated.bpapi.ban.program_requirements.v1_0_0;

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
    "criteria.lastEarnedCourses",
    "criteria.maxCreditsTransfer",
    "maxCreditsINontrad",
    "criteria.maxCreditsINontrad",
    "maxCreditsTransfer",
    "lastEarnedCourses",
    "program",
    "criteria.minProgramGpa",
    "connectorInst",
    "registrationModelCde",
    "criteria.connectorOverall",
    "criteria.reqCoursesOverall",
    "prereqProgResCde",
    "minGpa",
    "criteria.yearRule",
    "singleInd",
    "criteria.reqCoursesITrad",
    "criteria.connectorLastEarned",
    "criteria.activeInd",
    "criteria.captiveInd",
    "keyblckTermCode",
    "criteria.maxCoursesTransfer",
    "maxCoursesTransfer",
    "lastEarnedCredits",
    "reqCoursesITrad",
    "criteria.connectorTransfer",
    "criteria.reqCoursesInst",
    "reqCreditsInst",
    "connectorLastEarned",
    "criteria.registrationModelCde",
    "criteria.prereqProgResCde",
    "criteria.reqCreditsOverall",
    "criteria.lastInstCourses",
    "reqCreditsOverall",
    "reqCreditsITrad",
    "criteria.connectorITrad",
    "minProgramGpa",
    "criteria.connectorInst",
    "lastInstCourses",
    "captiveInd",
    "connectorOverall",
    "criteria.minGpa",
    "criteria.maxCoursesINontrad",
    "activeInd",
    "connectorTransfer",
    "connectorINontrad",
    "connectorLastInst",
    "criteria.reqCreditsInst",
    "criteria.lastEarnedCredits",
    "criteria.lastInstCredits",
    "connectorITrad",
    "yearRule",
    "reqCoursesOverall",
    "maxCoursesINontrad",
    "criteria.connectorINontrad",
    "criteria.reqCreditsITrad",
    "lastInstCredits",
    "reqCoursesInst",
    "criteria.connectorLastInst",
    "criteria.grdeCodeMin",
    "grdeCodeMin"
})
@Generated("jsonschema2pojo")
public class ProgramRequirements100PutRequest {

    /**
     * Lineage reference object : SMBPGEN_LAST_EARNED_COURSES
     * 
     */
    @JsonProperty("criteria.lastEarnedCourses")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_LAST_EARNED_COURSES")
    private Double criteriaLastEarnedCourses;
    /**
     * Maximum Transfer
     * <p>
     * Lineage reference object : SMBPGEN_MAX_CREDITS_TRANSFER
     * 
     */
    @JsonProperty("criteria.maxCreditsTransfer")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_MAX_CREDITS_TRANSFER")
    private Double criteriaMaxCreditsTransfer;
    /**
     * Maximum Institutional Non-Traditional
     * <p>
     * Lineage reference object : SMBPGEN_MAX_CREDITS_I_NONTRAD
     * 
     */
    @JsonProperty("maxCreditsINontrad")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_MAX_CREDITS_I_NONTRAD")
    private Double maxCreditsINontrad;
    /**
     * Maximum Institutional Non-Traditional
     * <p>
     * Lineage reference object : SMBPGEN_MAX_CREDITS_I_NONTRAD
     * 
     */
    @JsonProperty("criteria.maxCreditsINontrad")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_MAX_CREDITS_I_NONTRAD")
    private Double criteriaMaxCreditsINontrad;
    /**
     * Maximum Transfer
     * <p>
     * Lineage reference object : SMBPGEN_MAX_CREDITS_TRANSFER
     * 
     */
    @JsonProperty("maxCreditsTransfer")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_MAX_CREDITS_TRANSFER")
    private Double maxCreditsTransfer;
    /**
     * Lineage reference object : SMBPGEN_LAST_EARNED_COURSES
     * 
     */
    @JsonProperty("lastEarnedCourses")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_LAST_EARNED_COURSES")
    private Double lastEarnedCourses;
    /**
     * Program
     * <p>
     * Lineage reference object : program
     * 
     */
    @JsonProperty("program")
    @JsonPropertyDescription("Lineage reference object : program")
    private String program;
    /**
     * Minimum Program GPA
     * <p>
     * Lineage reference object : SMBPGEN_MIN_PROGRAM_GPA
     * 
     */
    @JsonProperty("criteria.minProgramGpa")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_MIN_PROGRAM_GPA")
    private Double criteriaMinProgramGpa;
    /**
     * Lineage reference object : SMBPGEN_CONNECTOR_INST
     * 
     */
    @JsonProperty("connectorInst")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_CONNECTOR_INST")
    private String connectorInst;
    /**
     * Lineage reference object : SMBPGEN_REGISTRATION_MODEL_CDE
     * 
     */
    @JsonProperty("registrationModelCde")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_REGISTRATION_MODEL_CDE")
    private String registrationModelCde;
    /**
     * Lineage reference object : SMBPGEN_CONNECTOR_OVERALL
     * 
     */
    @JsonProperty("criteria.connectorOverall")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_CONNECTOR_OVERALL")
    private String criteriaConnectorOverall;
    /**
     * Courses
     * <p>
     * Lineage reference object : SMBPGEN_REQ_COURSES_OVERALL
     * 
     */
    @JsonProperty("criteria.reqCoursesOverall")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_REQ_COURSES_OVERALL")
    private Double criteriaReqCoursesOverall;
    /**
     * Lineage reference object : SMBPGEN_PREREQ_PROG_RES_CDE
     * 
     */
    @JsonProperty("prereqProgResCde")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_PREREQ_PROG_RES_CDE")
    private String prereqProgResCde;
    /**
     * Minimum GPA
     * <p>
     * Lineage reference object : SMBPGEN_MIN_GPA
     * 
     */
    @JsonProperty("minGpa")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_MIN_GPA")
    private Double minGpa;
    /**
     * Course Year Limit
     * <p>
     * Lineage reference object : SMBPGEN_YEAR_RULE
     * 
     */
    @JsonProperty("criteria.yearRule")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_YEAR_RULE")
    private Double criteriaYearRule;
    /**
     * Single Entity
     * <p>
     * Lineage reference object : SMBPGEN_SINGLE_IND
     * 
     */
    @JsonProperty("singleInd")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_SINGLE_IND")
    private String singleInd;
    /**
     * Lineage reference object : SMBPGEN_REQ_COURSES_I_TRAD
     * 
     */
    @JsonProperty("criteria.reqCoursesITrad")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_REQ_COURSES_I_TRAD")
    private Double criteriaReqCoursesITrad;
    /**
     * Lineage reference object : SMBPGEN_CONNECTOR_LAST_EARNED
     * 
     */
    @JsonProperty("criteria.connectorLastEarned")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_CONNECTOR_LAST_EARNED")
    private String criteriaConnectorLastEarned;
    /**
     * Lineage reference object : SMBPGEN_ACTIVE_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.activeInd")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_ACTIVE_IND")
    private String criteriaActiveInd;
    /**
     * Captive
     * <p>
     * Lineage reference object : SMBPGEN_CAPTIVE_IND
     * 
     */
    @JsonProperty("criteria.captiveInd")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_CAPTIVE_IND")
    private String criteriaCaptiveInd;
    /**
     * Term
     * <p>
     * Lineage reference object : keyblckTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblckTermCode")
    @JsonPropertyDescription("Lineage reference object : keyblckTermCode, Lookup lineage reference object : stvterm")
    private String keyblckTermCode;
    /**
     * Lineage reference object : SMBPGEN_MAX_COURSES_TRANSFER
     * 
     */
    @JsonProperty("criteria.maxCoursesTransfer")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_MAX_COURSES_TRANSFER")
    private Double criteriaMaxCoursesTransfer;
    /**
     * Lineage reference object : SMBPGEN_MAX_COURSES_TRANSFER
     * 
     */
    @JsonProperty("maxCoursesTransfer")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_MAX_COURSES_TRANSFER")
    private Double maxCoursesTransfer;
    /**
     * ...out of Last Number Earned
     * <p>
     * Lineage reference object : SMBPGEN_LAST_EARNED_CREDITS
     * 
     */
    @JsonProperty("lastEarnedCredits")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_LAST_EARNED_CREDITS")
    private Double lastEarnedCredits;
    /**
     * Lineage reference object : SMBPGEN_REQ_COURSES_I_TRAD
     * 
     */
    @JsonProperty("reqCoursesITrad")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_REQ_COURSES_I_TRAD")
    private Double reqCoursesITrad;
    /**
     * Lineage reference object : SMBPGEN_CONNECTOR_TRANSFER
     * 
     */
    @JsonProperty("criteria.connectorTransfer")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_CONNECTOR_TRANSFER")
    private String criteriaConnectorTransfer;
    /**
     * Credits
     * <p>
     * Lineage reference object : SMBPGEN_REQ_COURSES_INST
     * 
     */
    @JsonProperty("criteria.reqCoursesInst")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_REQ_COURSES_INST")
    private Double criteriaReqCoursesInst;
    /**
     * Required Institutional
     * <p>
     * Lineage reference object : SMBPGEN_REQ_CREDITS_INST
     * 
     */
    @JsonProperty("reqCreditsInst")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_REQ_CREDITS_INST")
    private Double reqCreditsInst;
    /**
     * Lineage reference object : SMBPGEN_CONNECTOR_LAST_EARNED
     * 
     */
    @JsonProperty("connectorLastEarned")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_CONNECTOR_LAST_EARNED")
    private String connectorLastEarned;
    /**
     * Lineage reference object : SMBPGEN_REGISTRATION_MODEL_CDE
     * 
     */
    @JsonProperty("criteria.registrationModelCde")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_REGISTRATION_MODEL_CDE")
    private String criteriaRegistrationModelCde;
    /**
     * Lineage reference object : SMBPGEN_PREREQ_PROG_RES_CDE
     * 
     */
    @JsonProperty("criteria.prereqProgResCde")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_PREREQ_PROG_RES_CDE")
    private String criteriaPrereqProgResCde;
    /**
     * Total Required
     * <p>
     * Lineage reference object : SMBPGEN_REQ_CREDITS_OVERALL
     * 
     */
    @JsonProperty("criteria.reqCreditsOverall")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_REQ_CREDITS_OVERALL")
    private Double criteriaReqCreditsOverall;
    /**
     * Lineage reference object : SMBPGEN_LAST_INST_COURSES
     * 
     */
    @JsonProperty("criteria.lastInstCourses")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_LAST_INST_COURSES")
    private Double criteriaLastInstCourses;
    /**
     * Total Required
     * <p>
     * Lineage reference object : SMBPGEN_REQ_CREDITS_OVERALL
     * 
     */
    @JsonProperty("reqCreditsOverall")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_REQ_CREDITS_OVERALL")
    private Double reqCreditsOverall;
    /**
     * Required Institutional Traditional
     * <p>
     * Lineage reference object : SMBPGEN_REQ_CREDITS_I_TRAD
     * 
     */
    @JsonProperty("reqCreditsITrad")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_REQ_CREDITS_I_TRAD")
    private Double reqCreditsITrad;
    /**
     * Lineage reference object : SMBPGEN_CONNECTOR_I_TRAD
     * 
     */
    @JsonProperty("criteria.connectorITrad")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_CONNECTOR_I_TRAD")
    private String criteriaConnectorITrad;
    /**
     * Minimum Program GPA
     * <p>
     * Lineage reference object : SMBPGEN_MIN_PROGRAM_GPA
     * 
     */
    @JsonProperty("minProgramGpa")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_MIN_PROGRAM_GPA")
    private Double minProgramGpa;
    /**
     * Lineage reference object : SMBPGEN_CONNECTOR_INST
     * 
     */
    @JsonProperty("criteria.connectorInst")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_CONNECTOR_INST")
    private String criteriaConnectorInst;
    /**
     * Lineage reference object : SMBPGEN_LAST_INST_COURSES
     * 
     */
    @JsonProperty("lastInstCourses")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_LAST_INST_COURSES")
    private Double lastInstCourses;
    /**
     * Captive
     * <p>
     * Lineage reference object : SMBPGEN_CAPTIVE_IND
     * 
     */
    @JsonProperty("captiveInd")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_CAPTIVE_IND")
    private String captiveInd;
    /**
     * Lineage reference object : SMBPGEN_CONNECTOR_OVERALL
     * 
     */
    @JsonProperty("connectorOverall")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_CONNECTOR_OVERALL")
    private String connectorOverall;
    /**
     * Minimum GPA
     * <p>
     * Lineage reference object : SMBPGEN_MIN_GPA
     * 
     */
    @JsonProperty("criteria.minGpa")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_MIN_GPA")
    private Double criteriaMinGpa;
    /**
     * Lineage reference object : SMBPGEN_MAX_COURSES_I_NONTRAD
     * 
     */
    @JsonProperty("criteria.maxCoursesINontrad")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_MAX_COURSES_I_NONTRAD")
    private Double criteriaMaxCoursesINontrad;
    /**
     * Lineage reference object : SMBPGEN_ACTIVE_IND
     * (Required)
     * 
     */
    @JsonProperty("activeInd")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_ACTIVE_IND")
    private String activeInd;
    /**
     * Lineage reference object : SMBPGEN_CONNECTOR_TRANSFER
     * 
     */
    @JsonProperty("connectorTransfer")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_CONNECTOR_TRANSFER")
    private String connectorTransfer;
    /**
     * Lineage reference object : SMBPGEN_CONNECTOR_I_NONTRAD
     * 
     */
    @JsonProperty("connectorINontrad")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_CONNECTOR_I_NONTRAD")
    private String connectorINontrad;
    /**
     * Lineage reference object : SMBPGEN_CONNECTOR_LAST_INST
     * 
     */
    @JsonProperty("connectorLastInst")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_CONNECTOR_LAST_INST")
    private String connectorLastInst;
    /**
     * Required Institutional
     * <p>
     * Lineage reference object : SMBPGEN_REQ_CREDITS_INST
     * 
     */
    @JsonProperty("criteria.reqCreditsInst")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_REQ_CREDITS_INST")
    private Double criteriaReqCreditsInst;
    /**
     * ...out of Last Number Earned
     * <p>
     * Lineage reference object : SMBPGEN_LAST_EARNED_CREDITS
     * 
     */
    @JsonProperty("criteria.lastEarnedCredits")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_LAST_EARNED_CREDITS")
    private Double criteriaLastEarnedCredits;
    /**
     * Number of Institutional Requirements
     * <p>
     * Lineage reference object : SMBPGEN_LAST_INST_CREDITS
     * 
     */
    @JsonProperty("criteria.lastInstCredits")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_LAST_INST_CREDITS")
    private Double criteriaLastInstCredits;
    /**
     * Lineage reference object : SMBPGEN_CONNECTOR_I_TRAD
     * 
     */
    @JsonProperty("connectorITrad")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_CONNECTOR_I_TRAD")
    private String connectorITrad;
    /**
     * Course Year Limit
     * <p>
     * Lineage reference object : SMBPGEN_YEAR_RULE
     * 
     */
    @JsonProperty("yearRule")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_YEAR_RULE")
    private Double yearRule;
    /**
     * Courses
     * <p>
     * Lineage reference object : SMBPGEN_REQ_COURSES_OVERALL
     * 
     */
    @JsonProperty("reqCoursesOverall")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_REQ_COURSES_OVERALL")
    private Double reqCoursesOverall;
    /**
     * Lineage reference object : SMBPGEN_MAX_COURSES_I_NONTRAD
     * 
     */
    @JsonProperty("maxCoursesINontrad")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_MAX_COURSES_I_NONTRAD")
    private Double maxCoursesINontrad;
    /**
     * Lineage reference object : SMBPGEN_CONNECTOR_I_NONTRAD
     * 
     */
    @JsonProperty("criteria.connectorINontrad")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_CONNECTOR_I_NONTRAD")
    private String criteriaConnectorINontrad;
    /**
     * Required Institutional Traditional
     * <p>
     * Lineage reference object : SMBPGEN_REQ_CREDITS_I_TRAD
     * 
     */
    @JsonProperty("criteria.reqCreditsITrad")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_REQ_CREDITS_I_TRAD")
    private Double criteriaReqCreditsITrad;
    /**
     * Number of Institutional Requirements
     * <p>
     * Lineage reference object : SMBPGEN_LAST_INST_CREDITS
     * 
     */
    @JsonProperty("lastInstCredits")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_LAST_INST_CREDITS")
    private Double lastInstCredits;
    /**
     * Credits
     * <p>
     * Lineage reference object : SMBPGEN_REQ_COURSES_INST
     * 
     */
    @JsonProperty("reqCoursesInst")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_REQ_COURSES_INST")
    private Double reqCoursesInst;
    /**
     * Lineage reference object : SMBPGEN_CONNECTOR_LAST_INST
     * 
     */
    @JsonProperty("criteria.connectorLastInst")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_CONNECTOR_LAST_INST")
    private String criteriaConnectorLastInst;
    /**
     * Minimum Course Grade
     * <p>
     * Lineage reference object : SMBPGEN_GRDE_CODE_MIN
     * 
     */
    @JsonProperty("criteria.grdeCodeMin")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_GRDE_CODE_MIN")
    private String criteriaGrdeCodeMin;
    /**
     * Minimum Course Grade
     * <p>
     * Lineage reference object : SMBPGEN_GRDE_CODE_MIN
     * 
     */
    @JsonProperty("grdeCodeMin")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_GRDE_CODE_MIN")
    private String grdeCodeMin;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : SMBPGEN_LAST_EARNED_COURSES
     * 
     */
    @JsonProperty("criteria.lastEarnedCourses")
    public Double getCriteriaLastEarnedCourses() {
        return criteriaLastEarnedCourses;
    }

    /**
     * Lineage reference object : SMBPGEN_LAST_EARNED_COURSES
     * 
     */
    @JsonProperty("criteria.lastEarnedCourses")
    public void setCriteriaLastEarnedCourses(Double criteriaLastEarnedCourses) {
        this.criteriaLastEarnedCourses = criteriaLastEarnedCourses;
    }

    public ProgramRequirements100PutRequest withCriteriaLastEarnedCourses(Double criteriaLastEarnedCourses) {
        this.criteriaLastEarnedCourses = criteriaLastEarnedCourses;
        return this;
    }

    /**
     * Maximum Transfer
     * <p>
     * Lineage reference object : SMBPGEN_MAX_CREDITS_TRANSFER
     * 
     */
    @JsonProperty("criteria.maxCreditsTransfer")
    public Double getCriteriaMaxCreditsTransfer() {
        return criteriaMaxCreditsTransfer;
    }

    /**
     * Maximum Transfer
     * <p>
     * Lineage reference object : SMBPGEN_MAX_CREDITS_TRANSFER
     * 
     */
    @JsonProperty("criteria.maxCreditsTransfer")
    public void setCriteriaMaxCreditsTransfer(Double criteriaMaxCreditsTransfer) {
        this.criteriaMaxCreditsTransfer = criteriaMaxCreditsTransfer;
    }

    public ProgramRequirements100PutRequest withCriteriaMaxCreditsTransfer(Double criteriaMaxCreditsTransfer) {
        this.criteriaMaxCreditsTransfer = criteriaMaxCreditsTransfer;
        return this;
    }

    /**
     * Maximum Institutional Non-Traditional
     * <p>
     * Lineage reference object : SMBPGEN_MAX_CREDITS_I_NONTRAD
     * 
     */
    @JsonProperty("maxCreditsINontrad")
    public Double getMaxCreditsINontrad() {
        return maxCreditsINontrad;
    }

    /**
     * Maximum Institutional Non-Traditional
     * <p>
     * Lineage reference object : SMBPGEN_MAX_CREDITS_I_NONTRAD
     * 
     */
    @JsonProperty("maxCreditsINontrad")
    public void setMaxCreditsINontrad(Double maxCreditsINontrad) {
        this.maxCreditsINontrad = maxCreditsINontrad;
    }

    public ProgramRequirements100PutRequest withMaxCreditsINontrad(Double maxCreditsINontrad) {
        this.maxCreditsINontrad = maxCreditsINontrad;
        return this;
    }

    /**
     * Maximum Institutional Non-Traditional
     * <p>
     * Lineage reference object : SMBPGEN_MAX_CREDITS_I_NONTRAD
     * 
     */
    @JsonProperty("criteria.maxCreditsINontrad")
    public Double getCriteriaMaxCreditsINontrad() {
        return criteriaMaxCreditsINontrad;
    }

    /**
     * Maximum Institutional Non-Traditional
     * <p>
     * Lineage reference object : SMBPGEN_MAX_CREDITS_I_NONTRAD
     * 
     */
    @JsonProperty("criteria.maxCreditsINontrad")
    public void setCriteriaMaxCreditsINontrad(Double criteriaMaxCreditsINontrad) {
        this.criteriaMaxCreditsINontrad = criteriaMaxCreditsINontrad;
    }

    public ProgramRequirements100PutRequest withCriteriaMaxCreditsINontrad(Double criteriaMaxCreditsINontrad) {
        this.criteriaMaxCreditsINontrad = criteriaMaxCreditsINontrad;
        return this;
    }

    /**
     * Maximum Transfer
     * <p>
     * Lineage reference object : SMBPGEN_MAX_CREDITS_TRANSFER
     * 
     */
    @JsonProperty("maxCreditsTransfer")
    public Double getMaxCreditsTransfer() {
        return maxCreditsTransfer;
    }

    /**
     * Maximum Transfer
     * <p>
     * Lineage reference object : SMBPGEN_MAX_CREDITS_TRANSFER
     * 
     */
    @JsonProperty("maxCreditsTransfer")
    public void setMaxCreditsTransfer(Double maxCreditsTransfer) {
        this.maxCreditsTransfer = maxCreditsTransfer;
    }

    public ProgramRequirements100PutRequest withMaxCreditsTransfer(Double maxCreditsTransfer) {
        this.maxCreditsTransfer = maxCreditsTransfer;
        return this;
    }

    /**
     * Lineage reference object : SMBPGEN_LAST_EARNED_COURSES
     * 
     */
    @JsonProperty("lastEarnedCourses")
    public Double getLastEarnedCourses() {
        return lastEarnedCourses;
    }

    /**
     * Lineage reference object : SMBPGEN_LAST_EARNED_COURSES
     * 
     */
    @JsonProperty("lastEarnedCourses")
    public void setLastEarnedCourses(Double lastEarnedCourses) {
        this.lastEarnedCourses = lastEarnedCourses;
    }

    public ProgramRequirements100PutRequest withLastEarnedCourses(Double lastEarnedCourses) {
        this.lastEarnedCourses = lastEarnedCourses;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : program
     * 
     */
    @JsonProperty("program")
    public String getProgram() {
        return program;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : program
     * 
     */
    @JsonProperty("program")
    public void setProgram(String program) {
        this.program = program;
    }

    public ProgramRequirements100PutRequest withProgram(String program) {
        this.program = program;
        return this;
    }

    /**
     * Minimum Program GPA
     * <p>
     * Lineage reference object : SMBPGEN_MIN_PROGRAM_GPA
     * 
     */
    @JsonProperty("criteria.minProgramGpa")
    public Double getCriteriaMinProgramGpa() {
        return criteriaMinProgramGpa;
    }

    /**
     * Minimum Program GPA
     * <p>
     * Lineage reference object : SMBPGEN_MIN_PROGRAM_GPA
     * 
     */
    @JsonProperty("criteria.minProgramGpa")
    public void setCriteriaMinProgramGpa(Double criteriaMinProgramGpa) {
        this.criteriaMinProgramGpa = criteriaMinProgramGpa;
    }

    public ProgramRequirements100PutRequest withCriteriaMinProgramGpa(Double criteriaMinProgramGpa) {
        this.criteriaMinProgramGpa = criteriaMinProgramGpa;
        return this;
    }

    /**
     * Lineage reference object : SMBPGEN_CONNECTOR_INST
     * 
     */
    @JsonProperty("connectorInst")
    public String getConnectorInst() {
        return connectorInst;
    }

    /**
     * Lineage reference object : SMBPGEN_CONNECTOR_INST
     * 
     */
    @JsonProperty("connectorInst")
    public void setConnectorInst(String connectorInst) {
        this.connectorInst = connectorInst;
    }

    public ProgramRequirements100PutRequest withConnectorInst(String connectorInst) {
        this.connectorInst = connectorInst;
        return this;
    }

    /**
     * Lineage reference object : SMBPGEN_REGISTRATION_MODEL_CDE
     * 
     */
    @JsonProperty("registrationModelCde")
    public String getRegistrationModelCde() {
        return registrationModelCde;
    }

    /**
     * Lineage reference object : SMBPGEN_REGISTRATION_MODEL_CDE
     * 
     */
    @JsonProperty("registrationModelCde")
    public void setRegistrationModelCde(String registrationModelCde) {
        this.registrationModelCde = registrationModelCde;
    }

    public ProgramRequirements100PutRequest withRegistrationModelCde(String registrationModelCde) {
        this.registrationModelCde = registrationModelCde;
        return this;
    }

    /**
     * Lineage reference object : SMBPGEN_CONNECTOR_OVERALL
     * 
     */
    @JsonProperty("criteria.connectorOverall")
    public String getCriteriaConnectorOverall() {
        return criteriaConnectorOverall;
    }

    /**
     * Lineage reference object : SMBPGEN_CONNECTOR_OVERALL
     * 
     */
    @JsonProperty("criteria.connectorOverall")
    public void setCriteriaConnectorOverall(String criteriaConnectorOverall) {
        this.criteriaConnectorOverall = criteriaConnectorOverall;
    }

    public ProgramRequirements100PutRequest withCriteriaConnectorOverall(String criteriaConnectorOverall) {
        this.criteriaConnectorOverall = criteriaConnectorOverall;
        return this;
    }

    /**
     * Courses
     * <p>
     * Lineage reference object : SMBPGEN_REQ_COURSES_OVERALL
     * 
     */
    @JsonProperty("criteria.reqCoursesOverall")
    public Double getCriteriaReqCoursesOverall() {
        return criteriaReqCoursesOverall;
    }

    /**
     * Courses
     * <p>
     * Lineage reference object : SMBPGEN_REQ_COURSES_OVERALL
     * 
     */
    @JsonProperty("criteria.reqCoursesOverall")
    public void setCriteriaReqCoursesOverall(Double criteriaReqCoursesOverall) {
        this.criteriaReqCoursesOverall = criteriaReqCoursesOverall;
    }

    public ProgramRequirements100PutRequest withCriteriaReqCoursesOverall(Double criteriaReqCoursesOverall) {
        this.criteriaReqCoursesOverall = criteriaReqCoursesOverall;
        return this;
    }

    /**
     * Lineage reference object : SMBPGEN_PREREQ_PROG_RES_CDE
     * 
     */
    @JsonProperty("prereqProgResCde")
    public String getPrereqProgResCde() {
        return prereqProgResCde;
    }

    /**
     * Lineage reference object : SMBPGEN_PREREQ_PROG_RES_CDE
     * 
     */
    @JsonProperty("prereqProgResCde")
    public void setPrereqProgResCde(String prereqProgResCde) {
        this.prereqProgResCde = prereqProgResCde;
    }

    public ProgramRequirements100PutRequest withPrereqProgResCde(String prereqProgResCde) {
        this.prereqProgResCde = prereqProgResCde;
        return this;
    }

    /**
     * Minimum GPA
     * <p>
     * Lineage reference object : SMBPGEN_MIN_GPA
     * 
     */
    @JsonProperty("minGpa")
    public Double getMinGpa() {
        return minGpa;
    }

    /**
     * Minimum GPA
     * <p>
     * Lineage reference object : SMBPGEN_MIN_GPA
     * 
     */
    @JsonProperty("minGpa")
    public void setMinGpa(Double minGpa) {
        this.minGpa = minGpa;
    }

    public ProgramRequirements100PutRequest withMinGpa(Double minGpa) {
        this.minGpa = minGpa;
        return this;
    }

    /**
     * Course Year Limit
     * <p>
     * Lineage reference object : SMBPGEN_YEAR_RULE
     * 
     */
    @JsonProperty("criteria.yearRule")
    public Double getCriteriaYearRule() {
        return criteriaYearRule;
    }

    /**
     * Course Year Limit
     * <p>
     * Lineage reference object : SMBPGEN_YEAR_RULE
     * 
     */
    @JsonProperty("criteria.yearRule")
    public void setCriteriaYearRule(Double criteriaYearRule) {
        this.criteriaYearRule = criteriaYearRule;
    }

    public ProgramRequirements100PutRequest withCriteriaYearRule(Double criteriaYearRule) {
        this.criteriaYearRule = criteriaYearRule;
        return this;
    }

    /**
     * Single Entity
     * <p>
     * Lineage reference object : SMBPGEN_SINGLE_IND
     * 
     */
    @JsonProperty("singleInd")
    public String getSingleInd() {
        return singleInd;
    }

    /**
     * Single Entity
     * <p>
     * Lineage reference object : SMBPGEN_SINGLE_IND
     * 
     */
    @JsonProperty("singleInd")
    public void setSingleInd(String singleInd) {
        this.singleInd = singleInd;
    }

    public ProgramRequirements100PutRequest withSingleInd(String singleInd) {
        this.singleInd = singleInd;
        return this;
    }

    /**
     * Lineage reference object : SMBPGEN_REQ_COURSES_I_TRAD
     * 
     */
    @JsonProperty("criteria.reqCoursesITrad")
    public Double getCriteriaReqCoursesITrad() {
        return criteriaReqCoursesITrad;
    }

    /**
     * Lineage reference object : SMBPGEN_REQ_COURSES_I_TRAD
     * 
     */
    @JsonProperty("criteria.reqCoursesITrad")
    public void setCriteriaReqCoursesITrad(Double criteriaReqCoursesITrad) {
        this.criteriaReqCoursesITrad = criteriaReqCoursesITrad;
    }

    public ProgramRequirements100PutRequest withCriteriaReqCoursesITrad(Double criteriaReqCoursesITrad) {
        this.criteriaReqCoursesITrad = criteriaReqCoursesITrad;
        return this;
    }

    /**
     * Lineage reference object : SMBPGEN_CONNECTOR_LAST_EARNED
     * 
     */
    @JsonProperty("criteria.connectorLastEarned")
    public String getCriteriaConnectorLastEarned() {
        return criteriaConnectorLastEarned;
    }

    /**
     * Lineage reference object : SMBPGEN_CONNECTOR_LAST_EARNED
     * 
     */
    @JsonProperty("criteria.connectorLastEarned")
    public void setCriteriaConnectorLastEarned(String criteriaConnectorLastEarned) {
        this.criteriaConnectorLastEarned = criteriaConnectorLastEarned;
    }

    public ProgramRequirements100PutRequest withCriteriaConnectorLastEarned(String criteriaConnectorLastEarned) {
        this.criteriaConnectorLastEarned = criteriaConnectorLastEarned;
        return this;
    }

    /**
     * Lineage reference object : SMBPGEN_ACTIVE_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.activeInd")
    public String getCriteriaActiveInd() {
        return criteriaActiveInd;
    }

    /**
     * Lineage reference object : SMBPGEN_ACTIVE_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.activeInd")
    public void setCriteriaActiveInd(String criteriaActiveInd) {
        this.criteriaActiveInd = criteriaActiveInd;
    }

    public ProgramRequirements100PutRequest withCriteriaActiveInd(String criteriaActiveInd) {
        this.criteriaActiveInd = criteriaActiveInd;
        return this;
    }

    /**
     * Captive
     * <p>
     * Lineage reference object : SMBPGEN_CAPTIVE_IND
     * 
     */
    @JsonProperty("criteria.captiveInd")
    public String getCriteriaCaptiveInd() {
        return criteriaCaptiveInd;
    }

    /**
     * Captive
     * <p>
     * Lineage reference object : SMBPGEN_CAPTIVE_IND
     * 
     */
    @JsonProperty("criteria.captiveInd")
    public void setCriteriaCaptiveInd(String criteriaCaptiveInd) {
        this.criteriaCaptiveInd = criteriaCaptiveInd;
    }

    public ProgramRequirements100PutRequest withCriteriaCaptiveInd(String criteriaCaptiveInd) {
        this.criteriaCaptiveInd = criteriaCaptiveInd;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblckTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblckTermCode")
    public String getKeyblckTermCode() {
        return keyblckTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblckTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblckTermCode")
    public void setKeyblckTermCode(String keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
    }

    public ProgramRequirements100PutRequest withKeyblckTermCode(String keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
        return this;
    }

    /**
     * Lineage reference object : SMBPGEN_MAX_COURSES_TRANSFER
     * 
     */
    @JsonProperty("criteria.maxCoursesTransfer")
    public Double getCriteriaMaxCoursesTransfer() {
        return criteriaMaxCoursesTransfer;
    }

    /**
     * Lineage reference object : SMBPGEN_MAX_COURSES_TRANSFER
     * 
     */
    @JsonProperty("criteria.maxCoursesTransfer")
    public void setCriteriaMaxCoursesTransfer(Double criteriaMaxCoursesTransfer) {
        this.criteriaMaxCoursesTransfer = criteriaMaxCoursesTransfer;
    }

    public ProgramRequirements100PutRequest withCriteriaMaxCoursesTransfer(Double criteriaMaxCoursesTransfer) {
        this.criteriaMaxCoursesTransfer = criteriaMaxCoursesTransfer;
        return this;
    }

    /**
     * Lineage reference object : SMBPGEN_MAX_COURSES_TRANSFER
     * 
     */
    @JsonProperty("maxCoursesTransfer")
    public Double getMaxCoursesTransfer() {
        return maxCoursesTransfer;
    }

    /**
     * Lineage reference object : SMBPGEN_MAX_COURSES_TRANSFER
     * 
     */
    @JsonProperty("maxCoursesTransfer")
    public void setMaxCoursesTransfer(Double maxCoursesTransfer) {
        this.maxCoursesTransfer = maxCoursesTransfer;
    }

    public ProgramRequirements100PutRequest withMaxCoursesTransfer(Double maxCoursesTransfer) {
        this.maxCoursesTransfer = maxCoursesTransfer;
        return this;
    }

    /**
     * ...out of Last Number Earned
     * <p>
     * Lineage reference object : SMBPGEN_LAST_EARNED_CREDITS
     * 
     */
    @JsonProperty("lastEarnedCredits")
    public Double getLastEarnedCredits() {
        return lastEarnedCredits;
    }

    /**
     * ...out of Last Number Earned
     * <p>
     * Lineage reference object : SMBPGEN_LAST_EARNED_CREDITS
     * 
     */
    @JsonProperty("lastEarnedCredits")
    public void setLastEarnedCredits(Double lastEarnedCredits) {
        this.lastEarnedCredits = lastEarnedCredits;
    }

    public ProgramRequirements100PutRequest withLastEarnedCredits(Double lastEarnedCredits) {
        this.lastEarnedCredits = lastEarnedCredits;
        return this;
    }

    /**
     * Lineage reference object : SMBPGEN_REQ_COURSES_I_TRAD
     * 
     */
    @JsonProperty("reqCoursesITrad")
    public Double getReqCoursesITrad() {
        return reqCoursesITrad;
    }

    /**
     * Lineage reference object : SMBPGEN_REQ_COURSES_I_TRAD
     * 
     */
    @JsonProperty("reqCoursesITrad")
    public void setReqCoursesITrad(Double reqCoursesITrad) {
        this.reqCoursesITrad = reqCoursesITrad;
    }

    public ProgramRequirements100PutRequest withReqCoursesITrad(Double reqCoursesITrad) {
        this.reqCoursesITrad = reqCoursesITrad;
        return this;
    }

    /**
     * Lineage reference object : SMBPGEN_CONNECTOR_TRANSFER
     * 
     */
    @JsonProperty("criteria.connectorTransfer")
    public String getCriteriaConnectorTransfer() {
        return criteriaConnectorTransfer;
    }

    /**
     * Lineage reference object : SMBPGEN_CONNECTOR_TRANSFER
     * 
     */
    @JsonProperty("criteria.connectorTransfer")
    public void setCriteriaConnectorTransfer(String criteriaConnectorTransfer) {
        this.criteriaConnectorTransfer = criteriaConnectorTransfer;
    }

    public ProgramRequirements100PutRequest withCriteriaConnectorTransfer(String criteriaConnectorTransfer) {
        this.criteriaConnectorTransfer = criteriaConnectorTransfer;
        return this;
    }

    /**
     * Credits
     * <p>
     * Lineage reference object : SMBPGEN_REQ_COURSES_INST
     * 
     */
    @JsonProperty("criteria.reqCoursesInst")
    public Double getCriteriaReqCoursesInst() {
        return criteriaReqCoursesInst;
    }

    /**
     * Credits
     * <p>
     * Lineage reference object : SMBPGEN_REQ_COURSES_INST
     * 
     */
    @JsonProperty("criteria.reqCoursesInst")
    public void setCriteriaReqCoursesInst(Double criteriaReqCoursesInst) {
        this.criteriaReqCoursesInst = criteriaReqCoursesInst;
    }

    public ProgramRequirements100PutRequest withCriteriaReqCoursesInst(Double criteriaReqCoursesInst) {
        this.criteriaReqCoursesInst = criteriaReqCoursesInst;
        return this;
    }

    /**
     * Required Institutional
     * <p>
     * Lineage reference object : SMBPGEN_REQ_CREDITS_INST
     * 
     */
    @JsonProperty("reqCreditsInst")
    public Double getReqCreditsInst() {
        return reqCreditsInst;
    }

    /**
     * Required Institutional
     * <p>
     * Lineage reference object : SMBPGEN_REQ_CREDITS_INST
     * 
     */
    @JsonProperty("reqCreditsInst")
    public void setReqCreditsInst(Double reqCreditsInst) {
        this.reqCreditsInst = reqCreditsInst;
    }

    public ProgramRequirements100PutRequest withReqCreditsInst(Double reqCreditsInst) {
        this.reqCreditsInst = reqCreditsInst;
        return this;
    }

    /**
     * Lineage reference object : SMBPGEN_CONNECTOR_LAST_EARNED
     * 
     */
    @JsonProperty("connectorLastEarned")
    public String getConnectorLastEarned() {
        return connectorLastEarned;
    }

    /**
     * Lineage reference object : SMBPGEN_CONNECTOR_LAST_EARNED
     * 
     */
    @JsonProperty("connectorLastEarned")
    public void setConnectorLastEarned(String connectorLastEarned) {
        this.connectorLastEarned = connectorLastEarned;
    }

    public ProgramRequirements100PutRequest withConnectorLastEarned(String connectorLastEarned) {
        this.connectorLastEarned = connectorLastEarned;
        return this;
    }

    /**
     * Lineage reference object : SMBPGEN_REGISTRATION_MODEL_CDE
     * 
     */
    @JsonProperty("criteria.registrationModelCde")
    public String getCriteriaRegistrationModelCde() {
        return criteriaRegistrationModelCde;
    }

    /**
     * Lineage reference object : SMBPGEN_REGISTRATION_MODEL_CDE
     * 
     */
    @JsonProperty("criteria.registrationModelCde")
    public void setCriteriaRegistrationModelCde(String criteriaRegistrationModelCde) {
        this.criteriaRegistrationModelCde = criteriaRegistrationModelCde;
    }

    public ProgramRequirements100PutRequest withCriteriaRegistrationModelCde(String criteriaRegistrationModelCde) {
        this.criteriaRegistrationModelCde = criteriaRegistrationModelCde;
        return this;
    }

    /**
     * Lineage reference object : SMBPGEN_PREREQ_PROG_RES_CDE
     * 
     */
    @JsonProperty("criteria.prereqProgResCde")
    public String getCriteriaPrereqProgResCde() {
        return criteriaPrereqProgResCde;
    }

    /**
     * Lineage reference object : SMBPGEN_PREREQ_PROG_RES_CDE
     * 
     */
    @JsonProperty("criteria.prereqProgResCde")
    public void setCriteriaPrereqProgResCde(String criteriaPrereqProgResCde) {
        this.criteriaPrereqProgResCde = criteriaPrereqProgResCde;
    }

    public ProgramRequirements100PutRequest withCriteriaPrereqProgResCde(String criteriaPrereqProgResCde) {
        this.criteriaPrereqProgResCde = criteriaPrereqProgResCde;
        return this;
    }

    /**
     * Total Required
     * <p>
     * Lineage reference object : SMBPGEN_REQ_CREDITS_OVERALL
     * 
     */
    @JsonProperty("criteria.reqCreditsOverall")
    public Double getCriteriaReqCreditsOverall() {
        return criteriaReqCreditsOverall;
    }

    /**
     * Total Required
     * <p>
     * Lineage reference object : SMBPGEN_REQ_CREDITS_OVERALL
     * 
     */
    @JsonProperty("criteria.reqCreditsOverall")
    public void setCriteriaReqCreditsOverall(Double criteriaReqCreditsOverall) {
        this.criteriaReqCreditsOverall = criteriaReqCreditsOverall;
    }

    public ProgramRequirements100PutRequest withCriteriaReqCreditsOverall(Double criteriaReqCreditsOverall) {
        this.criteriaReqCreditsOverall = criteriaReqCreditsOverall;
        return this;
    }

    /**
     * Lineage reference object : SMBPGEN_LAST_INST_COURSES
     * 
     */
    @JsonProperty("criteria.lastInstCourses")
    public Double getCriteriaLastInstCourses() {
        return criteriaLastInstCourses;
    }

    /**
     * Lineage reference object : SMBPGEN_LAST_INST_COURSES
     * 
     */
    @JsonProperty("criteria.lastInstCourses")
    public void setCriteriaLastInstCourses(Double criteriaLastInstCourses) {
        this.criteriaLastInstCourses = criteriaLastInstCourses;
    }

    public ProgramRequirements100PutRequest withCriteriaLastInstCourses(Double criteriaLastInstCourses) {
        this.criteriaLastInstCourses = criteriaLastInstCourses;
        return this;
    }

    /**
     * Total Required
     * <p>
     * Lineage reference object : SMBPGEN_REQ_CREDITS_OVERALL
     * 
     */
    @JsonProperty("reqCreditsOverall")
    public Double getReqCreditsOverall() {
        return reqCreditsOverall;
    }

    /**
     * Total Required
     * <p>
     * Lineage reference object : SMBPGEN_REQ_CREDITS_OVERALL
     * 
     */
    @JsonProperty("reqCreditsOverall")
    public void setReqCreditsOverall(Double reqCreditsOverall) {
        this.reqCreditsOverall = reqCreditsOverall;
    }

    public ProgramRequirements100PutRequest withReqCreditsOverall(Double reqCreditsOverall) {
        this.reqCreditsOverall = reqCreditsOverall;
        return this;
    }

    /**
     * Required Institutional Traditional
     * <p>
     * Lineage reference object : SMBPGEN_REQ_CREDITS_I_TRAD
     * 
     */
    @JsonProperty("reqCreditsITrad")
    public Double getReqCreditsITrad() {
        return reqCreditsITrad;
    }

    /**
     * Required Institutional Traditional
     * <p>
     * Lineage reference object : SMBPGEN_REQ_CREDITS_I_TRAD
     * 
     */
    @JsonProperty("reqCreditsITrad")
    public void setReqCreditsITrad(Double reqCreditsITrad) {
        this.reqCreditsITrad = reqCreditsITrad;
    }

    public ProgramRequirements100PutRequest withReqCreditsITrad(Double reqCreditsITrad) {
        this.reqCreditsITrad = reqCreditsITrad;
        return this;
    }

    /**
     * Lineage reference object : SMBPGEN_CONNECTOR_I_TRAD
     * 
     */
    @JsonProperty("criteria.connectorITrad")
    public String getCriteriaConnectorITrad() {
        return criteriaConnectorITrad;
    }

    /**
     * Lineage reference object : SMBPGEN_CONNECTOR_I_TRAD
     * 
     */
    @JsonProperty("criteria.connectorITrad")
    public void setCriteriaConnectorITrad(String criteriaConnectorITrad) {
        this.criteriaConnectorITrad = criteriaConnectorITrad;
    }

    public ProgramRequirements100PutRequest withCriteriaConnectorITrad(String criteriaConnectorITrad) {
        this.criteriaConnectorITrad = criteriaConnectorITrad;
        return this;
    }

    /**
     * Minimum Program GPA
     * <p>
     * Lineage reference object : SMBPGEN_MIN_PROGRAM_GPA
     * 
     */
    @JsonProperty("minProgramGpa")
    public Double getMinProgramGpa() {
        return minProgramGpa;
    }

    /**
     * Minimum Program GPA
     * <p>
     * Lineage reference object : SMBPGEN_MIN_PROGRAM_GPA
     * 
     */
    @JsonProperty("minProgramGpa")
    public void setMinProgramGpa(Double minProgramGpa) {
        this.minProgramGpa = minProgramGpa;
    }

    public ProgramRequirements100PutRequest withMinProgramGpa(Double minProgramGpa) {
        this.minProgramGpa = minProgramGpa;
        return this;
    }

    /**
     * Lineage reference object : SMBPGEN_CONNECTOR_INST
     * 
     */
    @JsonProperty("criteria.connectorInst")
    public String getCriteriaConnectorInst() {
        return criteriaConnectorInst;
    }

    /**
     * Lineage reference object : SMBPGEN_CONNECTOR_INST
     * 
     */
    @JsonProperty("criteria.connectorInst")
    public void setCriteriaConnectorInst(String criteriaConnectorInst) {
        this.criteriaConnectorInst = criteriaConnectorInst;
    }

    public ProgramRequirements100PutRequest withCriteriaConnectorInst(String criteriaConnectorInst) {
        this.criteriaConnectorInst = criteriaConnectorInst;
        return this;
    }

    /**
     * Lineage reference object : SMBPGEN_LAST_INST_COURSES
     * 
     */
    @JsonProperty("lastInstCourses")
    public Double getLastInstCourses() {
        return lastInstCourses;
    }

    /**
     * Lineage reference object : SMBPGEN_LAST_INST_COURSES
     * 
     */
    @JsonProperty("lastInstCourses")
    public void setLastInstCourses(Double lastInstCourses) {
        this.lastInstCourses = lastInstCourses;
    }

    public ProgramRequirements100PutRequest withLastInstCourses(Double lastInstCourses) {
        this.lastInstCourses = lastInstCourses;
        return this;
    }

    /**
     * Captive
     * <p>
     * Lineage reference object : SMBPGEN_CAPTIVE_IND
     * 
     */
    @JsonProperty("captiveInd")
    public String getCaptiveInd() {
        return captiveInd;
    }

    /**
     * Captive
     * <p>
     * Lineage reference object : SMBPGEN_CAPTIVE_IND
     * 
     */
    @JsonProperty("captiveInd")
    public void setCaptiveInd(String captiveInd) {
        this.captiveInd = captiveInd;
    }

    public ProgramRequirements100PutRequest withCaptiveInd(String captiveInd) {
        this.captiveInd = captiveInd;
        return this;
    }

    /**
     * Lineage reference object : SMBPGEN_CONNECTOR_OVERALL
     * 
     */
    @JsonProperty("connectorOverall")
    public String getConnectorOverall() {
        return connectorOverall;
    }

    /**
     * Lineage reference object : SMBPGEN_CONNECTOR_OVERALL
     * 
     */
    @JsonProperty("connectorOverall")
    public void setConnectorOverall(String connectorOverall) {
        this.connectorOverall = connectorOverall;
    }

    public ProgramRequirements100PutRequest withConnectorOverall(String connectorOverall) {
        this.connectorOverall = connectorOverall;
        return this;
    }

    /**
     * Minimum GPA
     * <p>
     * Lineage reference object : SMBPGEN_MIN_GPA
     * 
     */
    @JsonProperty("criteria.minGpa")
    public Double getCriteriaMinGpa() {
        return criteriaMinGpa;
    }

    /**
     * Minimum GPA
     * <p>
     * Lineage reference object : SMBPGEN_MIN_GPA
     * 
     */
    @JsonProperty("criteria.minGpa")
    public void setCriteriaMinGpa(Double criteriaMinGpa) {
        this.criteriaMinGpa = criteriaMinGpa;
    }

    public ProgramRequirements100PutRequest withCriteriaMinGpa(Double criteriaMinGpa) {
        this.criteriaMinGpa = criteriaMinGpa;
        return this;
    }

    /**
     * Lineage reference object : SMBPGEN_MAX_COURSES_I_NONTRAD
     * 
     */
    @JsonProperty("criteria.maxCoursesINontrad")
    public Double getCriteriaMaxCoursesINontrad() {
        return criteriaMaxCoursesINontrad;
    }

    /**
     * Lineage reference object : SMBPGEN_MAX_COURSES_I_NONTRAD
     * 
     */
    @JsonProperty("criteria.maxCoursesINontrad")
    public void setCriteriaMaxCoursesINontrad(Double criteriaMaxCoursesINontrad) {
        this.criteriaMaxCoursesINontrad = criteriaMaxCoursesINontrad;
    }

    public ProgramRequirements100PutRequest withCriteriaMaxCoursesINontrad(Double criteriaMaxCoursesINontrad) {
        this.criteriaMaxCoursesINontrad = criteriaMaxCoursesINontrad;
        return this;
    }

    /**
     * Lineage reference object : SMBPGEN_ACTIVE_IND
     * (Required)
     * 
     */
    @JsonProperty("activeInd")
    public String getActiveInd() {
        return activeInd;
    }

    /**
     * Lineage reference object : SMBPGEN_ACTIVE_IND
     * (Required)
     * 
     */
    @JsonProperty("activeInd")
    public void setActiveInd(String activeInd) {
        this.activeInd = activeInd;
    }

    public ProgramRequirements100PutRequest withActiveInd(String activeInd) {
        this.activeInd = activeInd;
        return this;
    }

    /**
     * Lineage reference object : SMBPGEN_CONNECTOR_TRANSFER
     * 
     */
    @JsonProperty("connectorTransfer")
    public String getConnectorTransfer() {
        return connectorTransfer;
    }

    /**
     * Lineage reference object : SMBPGEN_CONNECTOR_TRANSFER
     * 
     */
    @JsonProperty("connectorTransfer")
    public void setConnectorTransfer(String connectorTransfer) {
        this.connectorTransfer = connectorTransfer;
    }

    public ProgramRequirements100PutRequest withConnectorTransfer(String connectorTransfer) {
        this.connectorTransfer = connectorTransfer;
        return this;
    }

    /**
     * Lineage reference object : SMBPGEN_CONNECTOR_I_NONTRAD
     * 
     */
    @JsonProperty("connectorINontrad")
    public String getConnectorINontrad() {
        return connectorINontrad;
    }

    /**
     * Lineage reference object : SMBPGEN_CONNECTOR_I_NONTRAD
     * 
     */
    @JsonProperty("connectorINontrad")
    public void setConnectorINontrad(String connectorINontrad) {
        this.connectorINontrad = connectorINontrad;
    }

    public ProgramRequirements100PutRequest withConnectorINontrad(String connectorINontrad) {
        this.connectorINontrad = connectorINontrad;
        return this;
    }

    /**
     * Lineage reference object : SMBPGEN_CONNECTOR_LAST_INST
     * 
     */
    @JsonProperty("connectorLastInst")
    public String getConnectorLastInst() {
        return connectorLastInst;
    }

    /**
     * Lineage reference object : SMBPGEN_CONNECTOR_LAST_INST
     * 
     */
    @JsonProperty("connectorLastInst")
    public void setConnectorLastInst(String connectorLastInst) {
        this.connectorLastInst = connectorLastInst;
    }

    public ProgramRequirements100PutRequest withConnectorLastInst(String connectorLastInst) {
        this.connectorLastInst = connectorLastInst;
        return this;
    }

    /**
     * Required Institutional
     * <p>
     * Lineage reference object : SMBPGEN_REQ_CREDITS_INST
     * 
     */
    @JsonProperty("criteria.reqCreditsInst")
    public Double getCriteriaReqCreditsInst() {
        return criteriaReqCreditsInst;
    }

    /**
     * Required Institutional
     * <p>
     * Lineage reference object : SMBPGEN_REQ_CREDITS_INST
     * 
     */
    @JsonProperty("criteria.reqCreditsInst")
    public void setCriteriaReqCreditsInst(Double criteriaReqCreditsInst) {
        this.criteriaReqCreditsInst = criteriaReqCreditsInst;
    }

    public ProgramRequirements100PutRequest withCriteriaReqCreditsInst(Double criteriaReqCreditsInst) {
        this.criteriaReqCreditsInst = criteriaReqCreditsInst;
        return this;
    }

    /**
     * ...out of Last Number Earned
     * <p>
     * Lineage reference object : SMBPGEN_LAST_EARNED_CREDITS
     * 
     */
    @JsonProperty("criteria.lastEarnedCredits")
    public Double getCriteriaLastEarnedCredits() {
        return criteriaLastEarnedCredits;
    }

    /**
     * ...out of Last Number Earned
     * <p>
     * Lineage reference object : SMBPGEN_LAST_EARNED_CREDITS
     * 
     */
    @JsonProperty("criteria.lastEarnedCredits")
    public void setCriteriaLastEarnedCredits(Double criteriaLastEarnedCredits) {
        this.criteriaLastEarnedCredits = criteriaLastEarnedCredits;
    }

    public ProgramRequirements100PutRequest withCriteriaLastEarnedCredits(Double criteriaLastEarnedCredits) {
        this.criteriaLastEarnedCredits = criteriaLastEarnedCredits;
        return this;
    }

    /**
     * Number of Institutional Requirements
     * <p>
     * Lineage reference object : SMBPGEN_LAST_INST_CREDITS
     * 
     */
    @JsonProperty("criteria.lastInstCredits")
    public Double getCriteriaLastInstCredits() {
        return criteriaLastInstCredits;
    }

    /**
     * Number of Institutional Requirements
     * <p>
     * Lineage reference object : SMBPGEN_LAST_INST_CREDITS
     * 
     */
    @JsonProperty("criteria.lastInstCredits")
    public void setCriteriaLastInstCredits(Double criteriaLastInstCredits) {
        this.criteriaLastInstCredits = criteriaLastInstCredits;
    }

    public ProgramRequirements100PutRequest withCriteriaLastInstCredits(Double criteriaLastInstCredits) {
        this.criteriaLastInstCredits = criteriaLastInstCredits;
        return this;
    }

    /**
     * Lineage reference object : SMBPGEN_CONNECTOR_I_TRAD
     * 
     */
    @JsonProperty("connectorITrad")
    public String getConnectorITrad() {
        return connectorITrad;
    }

    /**
     * Lineage reference object : SMBPGEN_CONNECTOR_I_TRAD
     * 
     */
    @JsonProperty("connectorITrad")
    public void setConnectorITrad(String connectorITrad) {
        this.connectorITrad = connectorITrad;
    }

    public ProgramRequirements100PutRequest withConnectorITrad(String connectorITrad) {
        this.connectorITrad = connectorITrad;
        return this;
    }

    /**
     * Course Year Limit
     * <p>
     * Lineage reference object : SMBPGEN_YEAR_RULE
     * 
     */
    @JsonProperty("yearRule")
    public Double getYearRule() {
        return yearRule;
    }

    /**
     * Course Year Limit
     * <p>
     * Lineage reference object : SMBPGEN_YEAR_RULE
     * 
     */
    @JsonProperty("yearRule")
    public void setYearRule(Double yearRule) {
        this.yearRule = yearRule;
    }

    public ProgramRequirements100PutRequest withYearRule(Double yearRule) {
        this.yearRule = yearRule;
        return this;
    }

    /**
     * Courses
     * <p>
     * Lineage reference object : SMBPGEN_REQ_COURSES_OVERALL
     * 
     */
    @JsonProperty("reqCoursesOverall")
    public Double getReqCoursesOverall() {
        return reqCoursesOverall;
    }

    /**
     * Courses
     * <p>
     * Lineage reference object : SMBPGEN_REQ_COURSES_OVERALL
     * 
     */
    @JsonProperty("reqCoursesOverall")
    public void setReqCoursesOverall(Double reqCoursesOverall) {
        this.reqCoursesOverall = reqCoursesOverall;
    }

    public ProgramRequirements100PutRequest withReqCoursesOverall(Double reqCoursesOverall) {
        this.reqCoursesOverall = reqCoursesOverall;
        return this;
    }

    /**
     * Lineage reference object : SMBPGEN_MAX_COURSES_I_NONTRAD
     * 
     */
    @JsonProperty("maxCoursesINontrad")
    public Double getMaxCoursesINontrad() {
        return maxCoursesINontrad;
    }

    /**
     * Lineage reference object : SMBPGEN_MAX_COURSES_I_NONTRAD
     * 
     */
    @JsonProperty("maxCoursesINontrad")
    public void setMaxCoursesINontrad(Double maxCoursesINontrad) {
        this.maxCoursesINontrad = maxCoursesINontrad;
    }

    public ProgramRequirements100PutRequest withMaxCoursesINontrad(Double maxCoursesINontrad) {
        this.maxCoursesINontrad = maxCoursesINontrad;
        return this;
    }

    /**
     * Lineage reference object : SMBPGEN_CONNECTOR_I_NONTRAD
     * 
     */
    @JsonProperty("criteria.connectorINontrad")
    public String getCriteriaConnectorINontrad() {
        return criteriaConnectorINontrad;
    }

    /**
     * Lineage reference object : SMBPGEN_CONNECTOR_I_NONTRAD
     * 
     */
    @JsonProperty("criteria.connectorINontrad")
    public void setCriteriaConnectorINontrad(String criteriaConnectorINontrad) {
        this.criteriaConnectorINontrad = criteriaConnectorINontrad;
    }

    public ProgramRequirements100PutRequest withCriteriaConnectorINontrad(String criteriaConnectorINontrad) {
        this.criteriaConnectorINontrad = criteriaConnectorINontrad;
        return this;
    }

    /**
     * Required Institutional Traditional
     * <p>
     * Lineage reference object : SMBPGEN_REQ_CREDITS_I_TRAD
     * 
     */
    @JsonProperty("criteria.reqCreditsITrad")
    public Double getCriteriaReqCreditsITrad() {
        return criteriaReqCreditsITrad;
    }

    /**
     * Required Institutional Traditional
     * <p>
     * Lineage reference object : SMBPGEN_REQ_CREDITS_I_TRAD
     * 
     */
    @JsonProperty("criteria.reqCreditsITrad")
    public void setCriteriaReqCreditsITrad(Double criteriaReqCreditsITrad) {
        this.criteriaReqCreditsITrad = criteriaReqCreditsITrad;
    }

    public ProgramRequirements100PutRequest withCriteriaReqCreditsITrad(Double criteriaReqCreditsITrad) {
        this.criteriaReqCreditsITrad = criteriaReqCreditsITrad;
        return this;
    }

    /**
     * Number of Institutional Requirements
     * <p>
     * Lineage reference object : SMBPGEN_LAST_INST_CREDITS
     * 
     */
    @JsonProperty("lastInstCredits")
    public Double getLastInstCredits() {
        return lastInstCredits;
    }

    /**
     * Number of Institutional Requirements
     * <p>
     * Lineage reference object : SMBPGEN_LAST_INST_CREDITS
     * 
     */
    @JsonProperty("lastInstCredits")
    public void setLastInstCredits(Double lastInstCredits) {
        this.lastInstCredits = lastInstCredits;
    }

    public ProgramRequirements100PutRequest withLastInstCredits(Double lastInstCredits) {
        this.lastInstCredits = lastInstCredits;
        return this;
    }

    /**
     * Credits
     * <p>
     * Lineage reference object : SMBPGEN_REQ_COURSES_INST
     * 
     */
    @JsonProperty("reqCoursesInst")
    public Double getReqCoursesInst() {
        return reqCoursesInst;
    }

    /**
     * Credits
     * <p>
     * Lineage reference object : SMBPGEN_REQ_COURSES_INST
     * 
     */
    @JsonProperty("reqCoursesInst")
    public void setReqCoursesInst(Double reqCoursesInst) {
        this.reqCoursesInst = reqCoursesInst;
    }

    public ProgramRequirements100PutRequest withReqCoursesInst(Double reqCoursesInst) {
        this.reqCoursesInst = reqCoursesInst;
        return this;
    }

    /**
     * Lineage reference object : SMBPGEN_CONNECTOR_LAST_INST
     * 
     */
    @JsonProperty("criteria.connectorLastInst")
    public String getCriteriaConnectorLastInst() {
        return criteriaConnectorLastInst;
    }

    /**
     * Lineage reference object : SMBPGEN_CONNECTOR_LAST_INST
     * 
     */
    @JsonProperty("criteria.connectorLastInst")
    public void setCriteriaConnectorLastInst(String criteriaConnectorLastInst) {
        this.criteriaConnectorLastInst = criteriaConnectorLastInst;
    }

    public ProgramRequirements100PutRequest withCriteriaConnectorLastInst(String criteriaConnectorLastInst) {
        this.criteriaConnectorLastInst = criteriaConnectorLastInst;
        return this;
    }

    /**
     * Minimum Course Grade
     * <p>
     * Lineage reference object : SMBPGEN_GRDE_CODE_MIN
     * 
     */
    @JsonProperty("criteria.grdeCodeMin")
    public String getCriteriaGrdeCodeMin() {
        return criteriaGrdeCodeMin;
    }

    /**
     * Minimum Course Grade
     * <p>
     * Lineage reference object : SMBPGEN_GRDE_CODE_MIN
     * 
     */
    @JsonProperty("criteria.grdeCodeMin")
    public void setCriteriaGrdeCodeMin(String criteriaGrdeCodeMin) {
        this.criteriaGrdeCodeMin = criteriaGrdeCodeMin;
    }

    public ProgramRequirements100PutRequest withCriteriaGrdeCodeMin(String criteriaGrdeCodeMin) {
        this.criteriaGrdeCodeMin = criteriaGrdeCodeMin;
        return this;
    }

    /**
     * Minimum Course Grade
     * <p>
     * Lineage reference object : SMBPGEN_GRDE_CODE_MIN
     * 
     */
    @JsonProperty("grdeCodeMin")
    public String getGrdeCodeMin() {
        return grdeCodeMin;
    }

    /**
     * Minimum Course Grade
     * <p>
     * Lineage reference object : SMBPGEN_GRDE_CODE_MIN
     * 
     */
    @JsonProperty("grdeCodeMin")
    public void setGrdeCodeMin(String grdeCodeMin) {
        this.grdeCodeMin = grdeCodeMin;
    }

    public ProgramRequirements100PutRequest withGrdeCodeMin(String grdeCodeMin) {
        this.grdeCodeMin = grdeCodeMin;
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

    public ProgramRequirements100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ProgramRequirements100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaLastEarnedCourses");
        sb.append('=');
        sb.append(((this.criteriaLastEarnedCourses == null)?"<null>":this.criteriaLastEarnedCourses));
        sb.append(',');
        sb.append("criteriaMaxCreditsTransfer");
        sb.append('=');
        sb.append(((this.criteriaMaxCreditsTransfer == null)?"<null>":this.criteriaMaxCreditsTransfer));
        sb.append(',');
        sb.append("maxCreditsINontrad");
        sb.append('=');
        sb.append(((this.maxCreditsINontrad == null)?"<null>":this.maxCreditsINontrad));
        sb.append(',');
        sb.append("criteriaMaxCreditsINontrad");
        sb.append('=');
        sb.append(((this.criteriaMaxCreditsINontrad == null)?"<null>":this.criteriaMaxCreditsINontrad));
        sb.append(',');
        sb.append("maxCreditsTransfer");
        sb.append('=');
        sb.append(((this.maxCreditsTransfer == null)?"<null>":this.maxCreditsTransfer));
        sb.append(',');
        sb.append("lastEarnedCourses");
        sb.append('=');
        sb.append(((this.lastEarnedCourses == null)?"<null>":this.lastEarnedCourses));
        sb.append(',');
        sb.append("program");
        sb.append('=');
        sb.append(((this.program == null)?"<null>":this.program));
        sb.append(',');
        sb.append("criteriaMinProgramGpa");
        sb.append('=');
        sb.append(((this.criteriaMinProgramGpa == null)?"<null>":this.criteriaMinProgramGpa));
        sb.append(',');
        sb.append("connectorInst");
        sb.append('=');
        sb.append(((this.connectorInst == null)?"<null>":this.connectorInst));
        sb.append(',');
        sb.append("registrationModelCde");
        sb.append('=');
        sb.append(((this.registrationModelCde == null)?"<null>":this.registrationModelCde));
        sb.append(',');
        sb.append("criteriaConnectorOverall");
        sb.append('=');
        sb.append(((this.criteriaConnectorOverall == null)?"<null>":this.criteriaConnectorOverall));
        sb.append(',');
        sb.append("criteriaReqCoursesOverall");
        sb.append('=');
        sb.append(((this.criteriaReqCoursesOverall == null)?"<null>":this.criteriaReqCoursesOverall));
        sb.append(',');
        sb.append("prereqProgResCde");
        sb.append('=');
        sb.append(((this.prereqProgResCde == null)?"<null>":this.prereqProgResCde));
        sb.append(',');
        sb.append("minGpa");
        sb.append('=');
        sb.append(((this.minGpa == null)?"<null>":this.minGpa));
        sb.append(',');
        sb.append("criteriaYearRule");
        sb.append('=');
        sb.append(((this.criteriaYearRule == null)?"<null>":this.criteriaYearRule));
        sb.append(',');
        sb.append("singleInd");
        sb.append('=');
        sb.append(((this.singleInd == null)?"<null>":this.singleInd));
        sb.append(',');
        sb.append("criteriaReqCoursesITrad");
        sb.append('=');
        sb.append(((this.criteriaReqCoursesITrad == null)?"<null>":this.criteriaReqCoursesITrad));
        sb.append(',');
        sb.append("criteriaConnectorLastEarned");
        sb.append('=');
        sb.append(((this.criteriaConnectorLastEarned == null)?"<null>":this.criteriaConnectorLastEarned));
        sb.append(',');
        sb.append("criteriaActiveInd");
        sb.append('=');
        sb.append(((this.criteriaActiveInd == null)?"<null>":this.criteriaActiveInd));
        sb.append(',');
        sb.append("criteriaCaptiveInd");
        sb.append('=');
        sb.append(((this.criteriaCaptiveInd == null)?"<null>":this.criteriaCaptiveInd));
        sb.append(',');
        sb.append("keyblckTermCode");
        sb.append('=');
        sb.append(((this.keyblckTermCode == null)?"<null>":this.keyblckTermCode));
        sb.append(',');
        sb.append("criteriaMaxCoursesTransfer");
        sb.append('=');
        sb.append(((this.criteriaMaxCoursesTransfer == null)?"<null>":this.criteriaMaxCoursesTransfer));
        sb.append(',');
        sb.append("maxCoursesTransfer");
        sb.append('=');
        sb.append(((this.maxCoursesTransfer == null)?"<null>":this.maxCoursesTransfer));
        sb.append(',');
        sb.append("lastEarnedCredits");
        sb.append('=');
        sb.append(((this.lastEarnedCredits == null)?"<null>":this.lastEarnedCredits));
        sb.append(',');
        sb.append("reqCoursesITrad");
        sb.append('=');
        sb.append(((this.reqCoursesITrad == null)?"<null>":this.reqCoursesITrad));
        sb.append(',');
        sb.append("criteriaConnectorTransfer");
        sb.append('=');
        sb.append(((this.criteriaConnectorTransfer == null)?"<null>":this.criteriaConnectorTransfer));
        sb.append(',');
        sb.append("criteriaReqCoursesInst");
        sb.append('=');
        sb.append(((this.criteriaReqCoursesInst == null)?"<null>":this.criteriaReqCoursesInst));
        sb.append(',');
        sb.append("reqCreditsInst");
        sb.append('=');
        sb.append(((this.reqCreditsInst == null)?"<null>":this.reqCreditsInst));
        sb.append(',');
        sb.append("connectorLastEarned");
        sb.append('=');
        sb.append(((this.connectorLastEarned == null)?"<null>":this.connectorLastEarned));
        sb.append(',');
        sb.append("criteriaRegistrationModelCde");
        sb.append('=');
        sb.append(((this.criteriaRegistrationModelCde == null)?"<null>":this.criteriaRegistrationModelCde));
        sb.append(',');
        sb.append("criteriaPrereqProgResCde");
        sb.append('=');
        sb.append(((this.criteriaPrereqProgResCde == null)?"<null>":this.criteriaPrereqProgResCde));
        sb.append(',');
        sb.append("criteriaReqCreditsOverall");
        sb.append('=');
        sb.append(((this.criteriaReqCreditsOverall == null)?"<null>":this.criteriaReqCreditsOverall));
        sb.append(',');
        sb.append("criteriaLastInstCourses");
        sb.append('=');
        sb.append(((this.criteriaLastInstCourses == null)?"<null>":this.criteriaLastInstCourses));
        sb.append(',');
        sb.append("reqCreditsOverall");
        sb.append('=');
        sb.append(((this.reqCreditsOverall == null)?"<null>":this.reqCreditsOverall));
        sb.append(',');
        sb.append("reqCreditsITrad");
        sb.append('=');
        sb.append(((this.reqCreditsITrad == null)?"<null>":this.reqCreditsITrad));
        sb.append(',');
        sb.append("criteriaConnectorITrad");
        sb.append('=');
        sb.append(((this.criteriaConnectorITrad == null)?"<null>":this.criteriaConnectorITrad));
        sb.append(',');
        sb.append("minProgramGpa");
        sb.append('=');
        sb.append(((this.minProgramGpa == null)?"<null>":this.minProgramGpa));
        sb.append(',');
        sb.append("criteriaConnectorInst");
        sb.append('=');
        sb.append(((this.criteriaConnectorInst == null)?"<null>":this.criteriaConnectorInst));
        sb.append(',');
        sb.append("lastInstCourses");
        sb.append('=');
        sb.append(((this.lastInstCourses == null)?"<null>":this.lastInstCourses));
        sb.append(',');
        sb.append("captiveInd");
        sb.append('=');
        sb.append(((this.captiveInd == null)?"<null>":this.captiveInd));
        sb.append(',');
        sb.append("connectorOverall");
        sb.append('=');
        sb.append(((this.connectorOverall == null)?"<null>":this.connectorOverall));
        sb.append(',');
        sb.append("criteriaMinGpa");
        sb.append('=');
        sb.append(((this.criteriaMinGpa == null)?"<null>":this.criteriaMinGpa));
        sb.append(',');
        sb.append("criteriaMaxCoursesINontrad");
        sb.append('=');
        sb.append(((this.criteriaMaxCoursesINontrad == null)?"<null>":this.criteriaMaxCoursesINontrad));
        sb.append(',');
        sb.append("activeInd");
        sb.append('=');
        sb.append(((this.activeInd == null)?"<null>":this.activeInd));
        sb.append(',');
        sb.append("connectorTransfer");
        sb.append('=');
        sb.append(((this.connectorTransfer == null)?"<null>":this.connectorTransfer));
        sb.append(',');
        sb.append("connectorINontrad");
        sb.append('=');
        sb.append(((this.connectorINontrad == null)?"<null>":this.connectorINontrad));
        sb.append(',');
        sb.append("connectorLastInst");
        sb.append('=');
        sb.append(((this.connectorLastInst == null)?"<null>":this.connectorLastInst));
        sb.append(',');
        sb.append("criteriaReqCreditsInst");
        sb.append('=');
        sb.append(((this.criteriaReqCreditsInst == null)?"<null>":this.criteriaReqCreditsInst));
        sb.append(',');
        sb.append("criteriaLastEarnedCredits");
        sb.append('=');
        sb.append(((this.criteriaLastEarnedCredits == null)?"<null>":this.criteriaLastEarnedCredits));
        sb.append(',');
        sb.append("criteriaLastInstCredits");
        sb.append('=');
        sb.append(((this.criteriaLastInstCredits == null)?"<null>":this.criteriaLastInstCredits));
        sb.append(',');
        sb.append("connectorITrad");
        sb.append('=');
        sb.append(((this.connectorITrad == null)?"<null>":this.connectorITrad));
        sb.append(',');
        sb.append("yearRule");
        sb.append('=');
        sb.append(((this.yearRule == null)?"<null>":this.yearRule));
        sb.append(',');
        sb.append("reqCoursesOverall");
        sb.append('=');
        sb.append(((this.reqCoursesOverall == null)?"<null>":this.reqCoursesOverall));
        sb.append(',');
        sb.append("maxCoursesINontrad");
        sb.append('=');
        sb.append(((this.maxCoursesINontrad == null)?"<null>":this.maxCoursesINontrad));
        sb.append(',');
        sb.append("criteriaConnectorINontrad");
        sb.append('=');
        sb.append(((this.criteriaConnectorINontrad == null)?"<null>":this.criteriaConnectorINontrad));
        sb.append(',');
        sb.append("criteriaReqCreditsITrad");
        sb.append('=');
        sb.append(((this.criteriaReqCreditsITrad == null)?"<null>":this.criteriaReqCreditsITrad));
        sb.append(',');
        sb.append("lastInstCredits");
        sb.append('=');
        sb.append(((this.lastInstCredits == null)?"<null>":this.lastInstCredits));
        sb.append(',');
        sb.append("reqCoursesInst");
        sb.append('=');
        sb.append(((this.reqCoursesInst == null)?"<null>":this.reqCoursesInst));
        sb.append(',');
        sb.append("criteriaConnectorLastInst");
        sb.append('=');
        sb.append(((this.criteriaConnectorLastInst == null)?"<null>":this.criteriaConnectorLastInst));
        sb.append(',');
        sb.append("criteriaGrdeCodeMin");
        sb.append('=');
        sb.append(((this.criteriaGrdeCodeMin == null)?"<null>":this.criteriaGrdeCodeMin));
        sb.append(',');
        sb.append("grdeCodeMin");
        sb.append('=');
        sb.append(((this.grdeCodeMin == null)?"<null>":this.grdeCodeMin));
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
        result = ((result* 31)+((this.criteriaConnectorInst == null)? 0 :this.criteriaConnectorInst.hashCode()));
        result = ((result* 31)+((this.criteriaMaxCreditsTransfer == null)? 0 :this.criteriaMaxCreditsTransfer.hashCode()));
        result = ((result* 31)+((this.maxCreditsINontrad == null)? 0 :this.maxCreditsINontrad.hashCode()));
        result = ((result* 31)+((this.criteriaMaxCreditsINontrad == null)? 0 :this.criteriaMaxCreditsINontrad.hashCode()));
        result = ((result* 31)+((this.maxCreditsTransfer == null)? 0 :this.maxCreditsTransfer.hashCode()));
        result = ((result* 31)+((this.lastEarnedCourses == null)? 0 :this.lastEarnedCourses.hashCode()));
        result = ((result* 31)+((this.criteriaReqCreditsOverall == null)? 0 :this.criteriaReqCreditsOverall.hashCode()));
        result = ((result* 31)+((this.program == null)? 0 :this.program.hashCode()));
        result = ((result* 31)+((this.connectorInst == null)? 0 :this.connectorInst.hashCode()));
        result = ((result* 31)+((this.criteriaConnectorTransfer == null)? 0 :this.criteriaConnectorTransfer.hashCode()));
        result = ((result* 31)+((this.criteriaCaptiveInd == null)? 0 :this.criteriaCaptiveInd.hashCode()));
        result = ((result* 31)+((this.criteriaPrereqProgResCde == null)? 0 :this.criteriaPrereqProgResCde.hashCode()));
        result = ((result* 31)+((this.registrationModelCde == null)? 0 :this.registrationModelCde.hashCode()));
        result = ((result* 31)+((this.criteriaConnectorLastInst == null)? 0 :this.criteriaConnectorLastInst.hashCode()));
        result = ((result* 31)+((this.criteriaConnectorLastEarned == null)? 0 :this.criteriaConnectorLastEarned.hashCode()));
        result = ((result* 31)+((this.prereqProgResCde == null)? 0 :this.prereqProgResCde.hashCode()));
        result = ((result* 31)+((this.criteriaReqCoursesITrad == null)? 0 :this.criteriaReqCoursesITrad.hashCode()));
        result = ((result* 31)+((this.criteriaLastInstCredits == null)? 0 :this.criteriaLastInstCredits.hashCode()));
        result = ((result* 31)+((this.criteriaConnectorITrad == null)? 0 :this.criteriaConnectorITrad.hashCode()));
        result = ((result* 31)+((this.minGpa == null)? 0 :this.minGpa.hashCode()));
        result = ((result* 31)+((this.singleInd == null)? 0 :this.singleInd.hashCode()));
        result = ((result* 31)+((this.criteriaConnectorINontrad == null)? 0 :this.criteriaConnectorINontrad.hashCode()));
        result = ((result* 31)+((this.criteriaReqCreditsITrad == null)? 0 :this.criteriaReqCreditsITrad.hashCode()));
        result = ((result* 31)+((this.criteriaConnectorOverall == null)? 0 :this.criteriaConnectorOverall.hashCode()));
        result = ((result* 31)+((this.criteriaMinGpa == null)? 0 :this.criteriaMinGpa.hashCode()));
        result = ((result* 31)+((this.criteriaLastEarnedCredits == null)? 0 :this.criteriaLastEarnedCredits.hashCode()));
        result = ((result* 31)+((this.keyblckTermCode == null)? 0 :this.keyblckTermCode.hashCode()));
        result = ((result* 31)+((this.maxCoursesTransfer == null)? 0 :this.maxCoursesTransfer.hashCode()));
        result = ((result* 31)+((this.criteriaMaxCoursesTransfer == null)? 0 :this.criteriaMaxCoursesTransfer.hashCode()));
        result = ((result* 31)+((this.lastEarnedCredits == null)? 0 :this.lastEarnedCredits.hashCode()));
        result = ((result* 31)+((this.reqCoursesITrad == null)? 0 :this.reqCoursesITrad.hashCode()));
        result = ((result* 31)+((this.reqCreditsInst == null)? 0 :this.reqCreditsInst.hashCode()));
        result = ((result* 31)+((this.connectorLastEarned == null)? 0 :this.connectorLastEarned.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.reqCreditsOverall == null)? 0 :this.reqCreditsOverall.hashCode()));
        result = ((result* 31)+((this.reqCreditsITrad == null)? 0 :this.reqCreditsITrad.hashCode()));
        result = ((result* 31)+((this.criteriaMinProgramGpa == null)? 0 :this.criteriaMinProgramGpa.hashCode()));
        result = ((result* 31)+((this.minProgramGpa == null)? 0 :this.minProgramGpa.hashCode()));
        result = ((result* 31)+((this.lastInstCourses == null)? 0 :this.lastInstCourses.hashCode()));
        result = ((result* 31)+((this.captiveInd == null)? 0 :this.captiveInd.hashCode()));
        result = ((result* 31)+((this.criteriaRegistrationModelCde == null)? 0 :this.criteriaRegistrationModelCde.hashCode()));
        result = ((result* 31)+((this.connectorOverall == null)? 0 :this.connectorOverall.hashCode()));
        result = ((result* 31)+((this.activeInd == null)? 0 :this.activeInd.hashCode()));
        result = ((result* 31)+((this.connectorTransfer == null)? 0 :this.connectorTransfer.hashCode()));
        result = ((result* 31)+((this.connectorINontrad == null)? 0 :this.connectorINontrad.hashCode()));
        result = ((result* 31)+((this.criteriaReqCreditsInst == null)? 0 :this.criteriaReqCreditsInst.hashCode()));
        result = ((result* 31)+((this.criteriaYearRule == null)? 0 :this.criteriaYearRule.hashCode()));
        result = ((result* 31)+((this.connectorLastInst == null)? 0 :this.connectorLastInst.hashCode()));
        result = ((result* 31)+((this.criteriaLastEarnedCourses == null)? 0 :this.criteriaLastEarnedCourses.hashCode()));
        result = ((result* 31)+((this.criteriaReqCoursesInst == null)? 0 :this.criteriaReqCoursesInst.hashCode()));
        result = ((result* 31)+((this.criteriaGrdeCodeMin == null)? 0 :this.criteriaGrdeCodeMin.hashCode()));
        result = ((result* 31)+((this.connectorITrad == null)? 0 :this.connectorITrad.hashCode()));
        result = ((result* 31)+((this.criteriaActiveInd == null)? 0 :this.criteriaActiveInd.hashCode()));
        result = ((result* 31)+((this.yearRule == null)? 0 :this.yearRule.hashCode()));
        result = ((result* 31)+((this.criteriaLastInstCourses == null)? 0 :this.criteriaLastInstCourses.hashCode()));
        result = ((result* 31)+((this.criteriaReqCoursesOverall == null)? 0 :this.criteriaReqCoursesOverall.hashCode()));
        result = ((result* 31)+((this.criteriaMaxCoursesINontrad == null)? 0 :this.criteriaMaxCoursesINontrad.hashCode()));
        result = ((result* 31)+((this.reqCoursesOverall == null)? 0 :this.reqCoursesOverall.hashCode()));
        result = ((result* 31)+((this.maxCoursesINontrad == null)? 0 :this.maxCoursesINontrad.hashCode()));
        result = ((result* 31)+((this.lastInstCredits == null)? 0 :this.lastInstCredits.hashCode()));
        result = ((result* 31)+((this.reqCoursesInst == null)? 0 :this.reqCoursesInst.hashCode()));
        result = ((result* 31)+((this.grdeCodeMin == null)? 0 :this.grdeCodeMin.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProgramRequirements100PutRequest) == false) {
            return false;
        }
        ProgramRequirements100PutRequest rhs = ((ProgramRequirements100PutRequest) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.criteriaConnectorInst == rhs.criteriaConnectorInst)||((this.criteriaConnectorInst!= null)&&this.criteriaConnectorInst.equals(rhs.criteriaConnectorInst)))&&((this.criteriaMaxCreditsTransfer == rhs.criteriaMaxCreditsTransfer)||((this.criteriaMaxCreditsTransfer!= null)&&this.criteriaMaxCreditsTransfer.equals(rhs.criteriaMaxCreditsTransfer))))&&((this.maxCreditsINontrad == rhs.maxCreditsINontrad)||((this.maxCreditsINontrad!= null)&&this.maxCreditsINontrad.equals(rhs.maxCreditsINontrad))))&&((this.criteriaMaxCreditsINontrad == rhs.criteriaMaxCreditsINontrad)||((this.criteriaMaxCreditsINontrad!= null)&&this.criteriaMaxCreditsINontrad.equals(rhs.criteriaMaxCreditsINontrad))))&&((this.maxCreditsTransfer == rhs.maxCreditsTransfer)||((this.maxCreditsTransfer!= null)&&this.maxCreditsTransfer.equals(rhs.maxCreditsTransfer))))&&((this.lastEarnedCourses == rhs.lastEarnedCourses)||((this.lastEarnedCourses!= null)&&this.lastEarnedCourses.equals(rhs.lastEarnedCourses))))&&((this.criteriaReqCreditsOverall == rhs.criteriaReqCreditsOverall)||((this.criteriaReqCreditsOverall!= null)&&this.criteriaReqCreditsOverall.equals(rhs.criteriaReqCreditsOverall))))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.connectorInst == rhs.connectorInst)||((this.connectorInst!= null)&&this.connectorInst.equals(rhs.connectorInst))))&&((this.criteriaConnectorTransfer == rhs.criteriaConnectorTransfer)||((this.criteriaConnectorTransfer!= null)&&this.criteriaConnectorTransfer.equals(rhs.criteriaConnectorTransfer))))&&((this.criteriaCaptiveInd == rhs.criteriaCaptiveInd)||((this.criteriaCaptiveInd!= null)&&this.criteriaCaptiveInd.equals(rhs.criteriaCaptiveInd))))&&((this.criteriaPrereqProgResCde == rhs.criteriaPrereqProgResCde)||((this.criteriaPrereqProgResCde!= null)&&this.criteriaPrereqProgResCde.equals(rhs.criteriaPrereqProgResCde))))&&((this.registrationModelCde == rhs.registrationModelCde)||((this.registrationModelCde!= null)&&this.registrationModelCde.equals(rhs.registrationModelCde))))&&((this.criteriaConnectorLastInst == rhs.criteriaConnectorLastInst)||((this.criteriaConnectorLastInst!= null)&&this.criteriaConnectorLastInst.equals(rhs.criteriaConnectorLastInst))))&&((this.criteriaConnectorLastEarned == rhs.criteriaConnectorLastEarned)||((this.criteriaConnectorLastEarned!= null)&&this.criteriaConnectorLastEarned.equals(rhs.criteriaConnectorLastEarned))))&&((this.prereqProgResCde == rhs.prereqProgResCde)||((this.prereqProgResCde!= null)&&this.prereqProgResCde.equals(rhs.prereqProgResCde))))&&((this.criteriaReqCoursesITrad == rhs.criteriaReqCoursesITrad)||((this.criteriaReqCoursesITrad!= null)&&this.criteriaReqCoursesITrad.equals(rhs.criteriaReqCoursesITrad))))&&((this.criteriaLastInstCredits == rhs.criteriaLastInstCredits)||((this.criteriaLastInstCredits!= null)&&this.criteriaLastInstCredits.equals(rhs.criteriaLastInstCredits))))&&((this.criteriaConnectorITrad == rhs.criteriaConnectorITrad)||((this.criteriaConnectorITrad!= null)&&this.criteriaConnectorITrad.equals(rhs.criteriaConnectorITrad))))&&((this.minGpa == rhs.minGpa)||((this.minGpa!= null)&&this.minGpa.equals(rhs.minGpa))))&&((this.singleInd == rhs.singleInd)||((this.singleInd!= null)&&this.singleInd.equals(rhs.singleInd))))&&((this.criteriaConnectorINontrad == rhs.criteriaConnectorINontrad)||((this.criteriaConnectorINontrad!= null)&&this.criteriaConnectorINontrad.equals(rhs.criteriaConnectorINontrad))))&&((this.criteriaReqCreditsITrad == rhs.criteriaReqCreditsITrad)||((this.criteriaReqCreditsITrad!= null)&&this.criteriaReqCreditsITrad.equals(rhs.criteriaReqCreditsITrad))))&&((this.criteriaConnectorOverall == rhs.criteriaConnectorOverall)||((this.criteriaConnectorOverall!= null)&&this.criteriaConnectorOverall.equals(rhs.criteriaConnectorOverall))))&&((this.criteriaMinGpa == rhs.criteriaMinGpa)||((this.criteriaMinGpa!= null)&&this.criteriaMinGpa.equals(rhs.criteriaMinGpa))))&&((this.criteriaLastEarnedCredits == rhs.criteriaLastEarnedCredits)||((this.criteriaLastEarnedCredits!= null)&&this.criteriaLastEarnedCredits.equals(rhs.criteriaLastEarnedCredits))))&&((this.keyblckTermCode == rhs.keyblckTermCode)||((this.keyblckTermCode!= null)&&this.keyblckTermCode.equals(rhs.keyblckTermCode))))&&((this.maxCoursesTransfer == rhs.maxCoursesTransfer)||((this.maxCoursesTransfer!= null)&&this.maxCoursesTransfer.equals(rhs.maxCoursesTransfer))))&&((this.criteriaMaxCoursesTransfer == rhs.criteriaMaxCoursesTransfer)||((this.criteriaMaxCoursesTransfer!= null)&&this.criteriaMaxCoursesTransfer.equals(rhs.criteriaMaxCoursesTransfer))))&&((this.lastEarnedCredits == rhs.lastEarnedCredits)||((this.lastEarnedCredits!= null)&&this.lastEarnedCredits.equals(rhs.lastEarnedCredits))))&&((this.reqCoursesITrad == rhs.reqCoursesITrad)||((this.reqCoursesITrad!= null)&&this.reqCoursesITrad.equals(rhs.reqCoursesITrad))))&&((this.reqCreditsInst == rhs.reqCreditsInst)||((this.reqCreditsInst!= null)&&this.reqCreditsInst.equals(rhs.reqCreditsInst))))&&((this.connectorLastEarned == rhs.connectorLastEarned)||((this.connectorLastEarned!= null)&&this.connectorLastEarned.equals(rhs.connectorLastEarned))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.reqCreditsOverall == rhs.reqCreditsOverall)||((this.reqCreditsOverall!= null)&&this.reqCreditsOverall.equals(rhs.reqCreditsOverall))))&&((this.reqCreditsITrad == rhs.reqCreditsITrad)||((this.reqCreditsITrad!= null)&&this.reqCreditsITrad.equals(rhs.reqCreditsITrad))))&&((this.criteriaMinProgramGpa == rhs.criteriaMinProgramGpa)||((this.criteriaMinProgramGpa!= null)&&this.criteriaMinProgramGpa.equals(rhs.criteriaMinProgramGpa))))&&((this.minProgramGpa == rhs.minProgramGpa)||((this.minProgramGpa!= null)&&this.minProgramGpa.equals(rhs.minProgramGpa))))&&((this.lastInstCourses == rhs.lastInstCourses)||((this.lastInstCourses!= null)&&this.lastInstCourses.equals(rhs.lastInstCourses))))&&((this.captiveInd == rhs.captiveInd)||((this.captiveInd!= null)&&this.captiveInd.equals(rhs.captiveInd))))&&((this.criteriaRegistrationModelCde == rhs.criteriaRegistrationModelCde)||((this.criteriaRegistrationModelCde!= null)&&this.criteriaRegistrationModelCde.equals(rhs.criteriaRegistrationModelCde))))&&((this.connectorOverall == rhs.connectorOverall)||((this.connectorOverall!= null)&&this.connectorOverall.equals(rhs.connectorOverall))))&&((this.activeInd == rhs.activeInd)||((this.activeInd!= null)&&this.activeInd.equals(rhs.activeInd))))&&((this.connectorTransfer == rhs.connectorTransfer)||((this.connectorTransfer!= null)&&this.connectorTransfer.equals(rhs.connectorTransfer))))&&((this.connectorINontrad == rhs.connectorINontrad)||((this.connectorINontrad!= null)&&this.connectorINontrad.equals(rhs.connectorINontrad))))&&((this.criteriaReqCreditsInst == rhs.criteriaReqCreditsInst)||((this.criteriaReqCreditsInst!= null)&&this.criteriaReqCreditsInst.equals(rhs.criteriaReqCreditsInst))))&&((this.criteriaYearRule == rhs.criteriaYearRule)||((this.criteriaYearRule!= null)&&this.criteriaYearRule.equals(rhs.criteriaYearRule))))&&((this.connectorLastInst == rhs.connectorLastInst)||((this.connectorLastInst!= null)&&this.connectorLastInst.equals(rhs.connectorLastInst))))&&((this.criteriaLastEarnedCourses == rhs.criteriaLastEarnedCourses)||((this.criteriaLastEarnedCourses!= null)&&this.criteriaLastEarnedCourses.equals(rhs.criteriaLastEarnedCourses))))&&((this.criteriaReqCoursesInst == rhs.criteriaReqCoursesInst)||((this.criteriaReqCoursesInst!= null)&&this.criteriaReqCoursesInst.equals(rhs.criteriaReqCoursesInst))))&&((this.criteriaGrdeCodeMin == rhs.criteriaGrdeCodeMin)||((this.criteriaGrdeCodeMin!= null)&&this.criteriaGrdeCodeMin.equals(rhs.criteriaGrdeCodeMin))))&&((this.connectorITrad == rhs.connectorITrad)||((this.connectorITrad!= null)&&this.connectorITrad.equals(rhs.connectorITrad))))&&((this.criteriaActiveInd == rhs.criteriaActiveInd)||((this.criteriaActiveInd!= null)&&this.criteriaActiveInd.equals(rhs.criteriaActiveInd))))&&((this.yearRule == rhs.yearRule)||((this.yearRule!= null)&&this.yearRule.equals(rhs.yearRule))))&&((this.criteriaLastInstCourses == rhs.criteriaLastInstCourses)||((this.criteriaLastInstCourses!= null)&&this.criteriaLastInstCourses.equals(rhs.criteriaLastInstCourses))))&&((this.criteriaReqCoursesOverall == rhs.criteriaReqCoursesOverall)||((this.criteriaReqCoursesOverall!= null)&&this.criteriaReqCoursesOverall.equals(rhs.criteriaReqCoursesOverall))))&&((this.criteriaMaxCoursesINontrad == rhs.criteriaMaxCoursesINontrad)||((this.criteriaMaxCoursesINontrad!= null)&&this.criteriaMaxCoursesINontrad.equals(rhs.criteriaMaxCoursesINontrad))))&&((this.reqCoursesOverall == rhs.reqCoursesOverall)||((this.reqCoursesOverall!= null)&&this.reqCoursesOverall.equals(rhs.reqCoursesOverall))))&&((this.maxCoursesINontrad == rhs.maxCoursesINontrad)||((this.maxCoursesINontrad!= null)&&this.maxCoursesINontrad.equals(rhs.maxCoursesINontrad))))&&((this.lastInstCredits == rhs.lastInstCredits)||((this.lastInstCredits!= null)&&this.lastInstCredits.equals(rhs.lastInstCredits))))&&((this.reqCoursesInst == rhs.reqCoursesInst)||((this.reqCoursesInst!= null)&&this.reqCoursesInst.equals(rhs.reqCoursesInst))))&&((this.grdeCodeMin == rhs.grdeCodeMin)||((this.grdeCodeMin!= null)&&this.grdeCodeMin.equals(rhs.grdeCodeMin))));
    }

}
