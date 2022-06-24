
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
    "reqCreditsITrad",
    "reqCreditsOverall",
    "maxCreditsINontrad",
    "lastEarnedCourses",
    "maxCreditsTransfer",
    "minProgramGpa",
    "connectorInst",
    "lastInstCourses",
    "captiveInd",
    "prereq",
    "registrationModelCde",
    "connectorOverall",
    "prereqProgResCde",
    "activeInd",
    "connectorTransfer",
    "connectorINontrad",
    "connectorLastInst",
    "minGpa",
    "singleInd",
    "maxCoursesTransfer",
    "connectorITrad",
    "lastEarnedCredits",
    "yearRule",
    "reqCoursesOverall",
    "maxCoursesINontrad",
    "reqCoursesITrad",
    "lastInstCredits",
    "connectorLastEarned",
    "reqCreditsInst",
    "reqCoursesInst",
    "grdeCodeMin"
})
@Generated("jsonschema2pojo")
public class ProgramRequirements100GetResponse {

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
     * Total Required
     * <p>
     * Lineage reference object : SMBPGEN_REQ_CREDITS_OVERALL
     * 
     */
    @JsonProperty("reqCreditsOverall")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_REQ_CREDITS_OVERALL")
    private Double reqCreditsOverall;
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
     * Lineage reference object : SMBPGEN_LAST_EARNED_COURSES
     * 
     */
    @JsonProperty("lastEarnedCourses")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_LAST_EARNED_COURSES")
    private Double lastEarnedCourses;
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
    @JsonProperty("connectorInst")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_CONNECTOR_INST")
    private String connectorInst;
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
     * Prerequisite by Program Exists
     * <p>
     * 
     * 
     */
    @JsonProperty("prereq")
    private String prereq;
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
    @JsonProperty("connectorOverall")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_CONNECTOR_OVERALL")
    private String connectorOverall;
    /**
     * Lineage reference object : SMBPGEN_PREREQ_PROG_RES_CDE
     * 
     */
    @JsonProperty("prereqProgResCde")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_PREREQ_PROG_RES_CDE")
    private String prereqProgResCde;
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
     * Minimum GPA
     * <p>
     * Lineage reference object : SMBPGEN_MIN_GPA
     * 
     */
    @JsonProperty("minGpa")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_MIN_GPA")
    private Double minGpa;
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
     * Lineage reference object : SMBPGEN_MAX_COURSES_TRANSFER
     * 
     */
    @JsonProperty("maxCoursesTransfer")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_MAX_COURSES_TRANSFER")
    private Double maxCoursesTransfer;
    /**
     * Lineage reference object : SMBPGEN_CONNECTOR_I_TRAD
     * 
     */
    @JsonProperty("connectorITrad")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_CONNECTOR_I_TRAD")
    private String connectorITrad;
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
     * Lineage reference object : SMBPGEN_REQ_COURSES_I_TRAD
     * 
     */
    @JsonProperty("reqCoursesITrad")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_REQ_COURSES_I_TRAD")
    private Double reqCoursesITrad;
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
     * Lineage reference object : SMBPGEN_CONNECTOR_LAST_EARNED
     * 
     */
    @JsonProperty("connectorLastEarned")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_CONNECTOR_LAST_EARNED")
    private String connectorLastEarned;
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
     * Credits
     * <p>
     * Lineage reference object : SMBPGEN_REQ_COURSES_INST
     * 
     */
    @JsonProperty("reqCoursesInst")
    @JsonPropertyDescription("Lineage reference object : SMBPGEN_REQ_COURSES_INST")
    private Double reqCoursesInst;
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

    public ProgramRequirements100GetResponse withReqCreditsITrad(Double reqCreditsITrad) {
        this.reqCreditsITrad = reqCreditsITrad;
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

    public ProgramRequirements100GetResponse withReqCreditsOverall(Double reqCreditsOverall) {
        this.reqCreditsOverall = reqCreditsOverall;
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

    public ProgramRequirements100GetResponse withMaxCreditsINontrad(Double maxCreditsINontrad) {
        this.maxCreditsINontrad = maxCreditsINontrad;
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

    public ProgramRequirements100GetResponse withLastEarnedCourses(Double lastEarnedCourses) {
        this.lastEarnedCourses = lastEarnedCourses;
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

    public ProgramRequirements100GetResponse withMaxCreditsTransfer(Double maxCreditsTransfer) {
        this.maxCreditsTransfer = maxCreditsTransfer;
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

    public ProgramRequirements100GetResponse withMinProgramGpa(Double minProgramGpa) {
        this.minProgramGpa = minProgramGpa;
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

    public ProgramRequirements100GetResponse withConnectorInst(String connectorInst) {
        this.connectorInst = connectorInst;
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

    public ProgramRequirements100GetResponse withLastInstCourses(Double lastInstCourses) {
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

    public ProgramRequirements100GetResponse withCaptiveInd(String captiveInd) {
        this.captiveInd = captiveInd;
        return this;
    }

    /**
     * Prerequisite by Program Exists
     * <p>
     * 
     * 
     */
    @JsonProperty("prereq")
    public String getPrereq() {
        return prereq;
    }

    /**
     * Prerequisite by Program Exists
     * <p>
     * 
     * 
     */
    @JsonProperty("prereq")
    public void setPrereq(String prereq) {
        this.prereq = prereq;
    }

    public ProgramRequirements100GetResponse withPrereq(String prereq) {
        this.prereq = prereq;
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

    public ProgramRequirements100GetResponse withRegistrationModelCde(String registrationModelCde) {
        this.registrationModelCde = registrationModelCde;
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

    public ProgramRequirements100GetResponse withConnectorOverall(String connectorOverall) {
        this.connectorOverall = connectorOverall;
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

    public ProgramRequirements100GetResponse withPrereqProgResCde(String prereqProgResCde) {
        this.prereqProgResCde = prereqProgResCde;
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

    public ProgramRequirements100GetResponse withActiveInd(String activeInd) {
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

    public ProgramRequirements100GetResponse withConnectorTransfer(String connectorTransfer) {
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

    public ProgramRequirements100GetResponse withConnectorINontrad(String connectorINontrad) {
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

    public ProgramRequirements100GetResponse withConnectorLastInst(String connectorLastInst) {
        this.connectorLastInst = connectorLastInst;
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

    public ProgramRequirements100GetResponse withMinGpa(Double minGpa) {
        this.minGpa = minGpa;
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

    public ProgramRequirements100GetResponse withSingleInd(String singleInd) {
        this.singleInd = singleInd;
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

    public ProgramRequirements100GetResponse withMaxCoursesTransfer(Double maxCoursesTransfer) {
        this.maxCoursesTransfer = maxCoursesTransfer;
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

    public ProgramRequirements100GetResponse withConnectorITrad(String connectorITrad) {
        this.connectorITrad = connectorITrad;
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

    public ProgramRequirements100GetResponse withLastEarnedCredits(Double lastEarnedCredits) {
        this.lastEarnedCredits = lastEarnedCredits;
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

    public ProgramRequirements100GetResponse withYearRule(Double yearRule) {
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

    public ProgramRequirements100GetResponse withReqCoursesOverall(Double reqCoursesOverall) {
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

    public ProgramRequirements100GetResponse withMaxCoursesINontrad(Double maxCoursesINontrad) {
        this.maxCoursesINontrad = maxCoursesINontrad;
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

    public ProgramRequirements100GetResponse withReqCoursesITrad(Double reqCoursesITrad) {
        this.reqCoursesITrad = reqCoursesITrad;
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

    public ProgramRequirements100GetResponse withLastInstCredits(Double lastInstCredits) {
        this.lastInstCredits = lastInstCredits;
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

    public ProgramRequirements100GetResponse withConnectorLastEarned(String connectorLastEarned) {
        this.connectorLastEarned = connectorLastEarned;
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

    public ProgramRequirements100GetResponse withReqCreditsInst(Double reqCreditsInst) {
        this.reqCreditsInst = reqCreditsInst;
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

    public ProgramRequirements100GetResponse withReqCoursesInst(Double reqCoursesInst) {
        this.reqCoursesInst = reqCoursesInst;
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

    public ProgramRequirements100GetResponse withGrdeCodeMin(String grdeCodeMin) {
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

    public ProgramRequirements100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ProgramRequirements100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("reqCreditsITrad");
        sb.append('=');
        sb.append(((this.reqCreditsITrad == null)?"<null>":this.reqCreditsITrad));
        sb.append(',');
        sb.append("reqCreditsOverall");
        sb.append('=');
        sb.append(((this.reqCreditsOverall == null)?"<null>":this.reqCreditsOverall));
        sb.append(',');
        sb.append("maxCreditsINontrad");
        sb.append('=');
        sb.append(((this.maxCreditsINontrad == null)?"<null>":this.maxCreditsINontrad));
        sb.append(',');
        sb.append("lastEarnedCourses");
        sb.append('=');
        sb.append(((this.lastEarnedCourses == null)?"<null>":this.lastEarnedCourses));
        sb.append(',');
        sb.append("maxCreditsTransfer");
        sb.append('=');
        sb.append(((this.maxCreditsTransfer == null)?"<null>":this.maxCreditsTransfer));
        sb.append(',');
        sb.append("minProgramGpa");
        sb.append('=');
        sb.append(((this.minProgramGpa == null)?"<null>":this.minProgramGpa));
        sb.append(',');
        sb.append("connectorInst");
        sb.append('=');
        sb.append(((this.connectorInst == null)?"<null>":this.connectorInst));
        sb.append(',');
        sb.append("lastInstCourses");
        sb.append('=');
        sb.append(((this.lastInstCourses == null)?"<null>":this.lastInstCourses));
        sb.append(',');
        sb.append("captiveInd");
        sb.append('=');
        sb.append(((this.captiveInd == null)?"<null>":this.captiveInd));
        sb.append(',');
        sb.append("prereq");
        sb.append('=');
        sb.append(((this.prereq == null)?"<null>":this.prereq));
        sb.append(',');
        sb.append("registrationModelCde");
        sb.append('=');
        sb.append(((this.registrationModelCde == null)?"<null>":this.registrationModelCde));
        sb.append(',');
        sb.append("connectorOverall");
        sb.append('=');
        sb.append(((this.connectorOverall == null)?"<null>":this.connectorOverall));
        sb.append(',');
        sb.append("prereqProgResCde");
        sb.append('=');
        sb.append(((this.prereqProgResCde == null)?"<null>":this.prereqProgResCde));
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
        sb.append("minGpa");
        sb.append('=');
        sb.append(((this.minGpa == null)?"<null>":this.minGpa));
        sb.append(',');
        sb.append("singleInd");
        sb.append('=');
        sb.append(((this.singleInd == null)?"<null>":this.singleInd));
        sb.append(',');
        sb.append("maxCoursesTransfer");
        sb.append('=');
        sb.append(((this.maxCoursesTransfer == null)?"<null>":this.maxCoursesTransfer));
        sb.append(',');
        sb.append("connectorITrad");
        sb.append('=');
        sb.append(((this.connectorITrad == null)?"<null>":this.connectorITrad));
        sb.append(',');
        sb.append("lastEarnedCredits");
        sb.append('=');
        sb.append(((this.lastEarnedCredits == null)?"<null>":this.lastEarnedCredits));
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
        sb.append("reqCoursesITrad");
        sb.append('=');
        sb.append(((this.reqCoursesITrad == null)?"<null>":this.reqCoursesITrad));
        sb.append(',');
        sb.append("lastInstCredits");
        sb.append('=');
        sb.append(((this.lastInstCredits == null)?"<null>":this.lastInstCredits));
        sb.append(',');
        sb.append("connectorLastEarned");
        sb.append('=');
        sb.append(((this.connectorLastEarned == null)?"<null>":this.connectorLastEarned));
        sb.append(',');
        sb.append("reqCreditsInst");
        sb.append('=');
        sb.append(((this.reqCreditsInst == null)?"<null>":this.reqCreditsInst));
        sb.append(',');
        sb.append("reqCoursesInst");
        sb.append('=');
        sb.append(((this.reqCoursesInst == null)?"<null>":this.reqCoursesInst));
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
        result = ((result* 31)+((this.reqCreditsITrad == null)? 0 :this.reqCreditsITrad.hashCode()));
        result = ((result* 31)+((this.reqCreditsOverall == null)? 0 :this.reqCreditsOverall.hashCode()));
        result = ((result* 31)+((this.maxCreditsINontrad == null)? 0 :this.maxCreditsINontrad.hashCode()));
        result = ((result* 31)+((this.lastEarnedCourses == null)? 0 :this.lastEarnedCourses.hashCode()));
        result = ((result* 31)+((this.maxCreditsTransfer == null)? 0 :this.maxCreditsTransfer.hashCode()));
        result = ((result* 31)+((this.minProgramGpa == null)? 0 :this.minProgramGpa.hashCode()));
        result = ((result* 31)+((this.connectorInst == null)? 0 :this.connectorInst.hashCode()));
        result = ((result* 31)+((this.lastInstCourses == null)? 0 :this.lastInstCourses.hashCode()));
        result = ((result* 31)+((this.captiveInd == null)? 0 :this.captiveInd.hashCode()));
        result = ((result* 31)+((this.prereq == null)? 0 :this.prereq.hashCode()));
        result = ((result* 31)+((this.registrationModelCde == null)? 0 :this.registrationModelCde.hashCode()));
        result = ((result* 31)+((this.connectorOverall == null)? 0 :this.connectorOverall.hashCode()));
        result = ((result* 31)+((this.prereqProgResCde == null)? 0 :this.prereqProgResCde.hashCode()));
        result = ((result* 31)+((this.activeInd == null)? 0 :this.activeInd.hashCode()));
        result = ((result* 31)+((this.connectorTransfer == null)? 0 :this.connectorTransfer.hashCode()));
        result = ((result* 31)+((this.connectorINontrad == null)? 0 :this.connectorINontrad.hashCode()));
        result = ((result* 31)+((this.connectorLastInst == null)? 0 :this.connectorLastInst.hashCode()));
        result = ((result* 31)+((this.minGpa == null)? 0 :this.minGpa.hashCode()));
        result = ((result* 31)+((this.singleInd == null)? 0 :this.singleInd.hashCode()));
        result = ((result* 31)+((this.maxCoursesTransfer == null)? 0 :this.maxCoursesTransfer.hashCode()));
        result = ((result* 31)+((this.connectorITrad == null)? 0 :this.connectorITrad.hashCode()));
        result = ((result* 31)+((this.lastEarnedCredits == null)? 0 :this.lastEarnedCredits.hashCode()));
        result = ((result* 31)+((this.yearRule == null)? 0 :this.yearRule.hashCode()));
        result = ((result* 31)+((this.reqCoursesOverall == null)? 0 :this.reqCoursesOverall.hashCode()));
        result = ((result* 31)+((this.maxCoursesINontrad == null)? 0 :this.maxCoursesINontrad.hashCode()));
        result = ((result* 31)+((this.reqCoursesITrad == null)? 0 :this.reqCoursesITrad.hashCode()));
        result = ((result* 31)+((this.lastInstCredits == null)? 0 :this.lastInstCredits.hashCode()));
        result = ((result* 31)+((this.connectorLastEarned == null)? 0 :this.connectorLastEarned.hashCode()));
        result = ((result* 31)+((this.reqCreditsInst == null)? 0 :this.reqCreditsInst.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.reqCoursesInst == null)? 0 :this.reqCoursesInst.hashCode()));
        result = ((result* 31)+((this.grdeCodeMin == null)? 0 :this.grdeCodeMin.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProgramRequirements100GetResponse) == false) {
            return false;
        }
        ProgramRequirements100GetResponse rhs = ((ProgramRequirements100GetResponse) other);
        return (((((((((((((((((((((((((((((((((this.reqCreditsITrad == rhs.reqCreditsITrad)||((this.reqCreditsITrad!= null)&&this.reqCreditsITrad.equals(rhs.reqCreditsITrad)))&&((this.reqCreditsOverall == rhs.reqCreditsOverall)||((this.reqCreditsOverall!= null)&&this.reqCreditsOverall.equals(rhs.reqCreditsOverall))))&&((this.maxCreditsINontrad == rhs.maxCreditsINontrad)||((this.maxCreditsINontrad!= null)&&this.maxCreditsINontrad.equals(rhs.maxCreditsINontrad))))&&((this.lastEarnedCourses == rhs.lastEarnedCourses)||((this.lastEarnedCourses!= null)&&this.lastEarnedCourses.equals(rhs.lastEarnedCourses))))&&((this.maxCreditsTransfer == rhs.maxCreditsTransfer)||((this.maxCreditsTransfer!= null)&&this.maxCreditsTransfer.equals(rhs.maxCreditsTransfer))))&&((this.minProgramGpa == rhs.minProgramGpa)||((this.minProgramGpa!= null)&&this.minProgramGpa.equals(rhs.minProgramGpa))))&&((this.connectorInst == rhs.connectorInst)||((this.connectorInst!= null)&&this.connectorInst.equals(rhs.connectorInst))))&&((this.lastInstCourses == rhs.lastInstCourses)||((this.lastInstCourses!= null)&&this.lastInstCourses.equals(rhs.lastInstCourses))))&&((this.captiveInd == rhs.captiveInd)||((this.captiveInd!= null)&&this.captiveInd.equals(rhs.captiveInd))))&&((this.prereq == rhs.prereq)||((this.prereq!= null)&&this.prereq.equals(rhs.prereq))))&&((this.registrationModelCde == rhs.registrationModelCde)||((this.registrationModelCde!= null)&&this.registrationModelCde.equals(rhs.registrationModelCde))))&&((this.connectorOverall == rhs.connectorOverall)||((this.connectorOverall!= null)&&this.connectorOverall.equals(rhs.connectorOverall))))&&((this.prereqProgResCde == rhs.prereqProgResCde)||((this.prereqProgResCde!= null)&&this.prereqProgResCde.equals(rhs.prereqProgResCde))))&&((this.activeInd == rhs.activeInd)||((this.activeInd!= null)&&this.activeInd.equals(rhs.activeInd))))&&((this.connectorTransfer == rhs.connectorTransfer)||((this.connectorTransfer!= null)&&this.connectorTransfer.equals(rhs.connectorTransfer))))&&((this.connectorINontrad == rhs.connectorINontrad)||((this.connectorINontrad!= null)&&this.connectorINontrad.equals(rhs.connectorINontrad))))&&((this.connectorLastInst == rhs.connectorLastInst)||((this.connectorLastInst!= null)&&this.connectorLastInst.equals(rhs.connectorLastInst))))&&((this.minGpa == rhs.minGpa)||((this.minGpa!= null)&&this.minGpa.equals(rhs.minGpa))))&&((this.singleInd == rhs.singleInd)||((this.singleInd!= null)&&this.singleInd.equals(rhs.singleInd))))&&((this.maxCoursesTransfer == rhs.maxCoursesTransfer)||((this.maxCoursesTransfer!= null)&&this.maxCoursesTransfer.equals(rhs.maxCoursesTransfer))))&&((this.connectorITrad == rhs.connectorITrad)||((this.connectorITrad!= null)&&this.connectorITrad.equals(rhs.connectorITrad))))&&((this.lastEarnedCredits == rhs.lastEarnedCredits)||((this.lastEarnedCredits!= null)&&this.lastEarnedCredits.equals(rhs.lastEarnedCredits))))&&((this.yearRule == rhs.yearRule)||((this.yearRule!= null)&&this.yearRule.equals(rhs.yearRule))))&&((this.reqCoursesOverall == rhs.reqCoursesOverall)||((this.reqCoursesOverall!= null)&&this.reqCoursesOverall.equals(rhs.reqCoursesOverall))))&&((this.maxCoursesINontrad == rhs.maxCoursesINontrad)||((this.maxCoursesINontrad!= null)&&this.maxCoursesINontrad.equals(rhs.maxCoursesINontrad))))&&((this.reqCoursesITrad == rhs.reqCoursesITrad)||((this.reqCoursesITrad!= null)&&this.reqCoursesITrad.equals(rhs.reqCoursesITrad))))&&((this.lastInstCredits == rhs.lastInstCredits)||((this.lastInstCredits!= null)&&this.lastInstCredits.equals(rhs.lastInstCredits))))&&((this.connectorLastEarned == rhs.connectorLastEarned)||((this.connectorLastEarned!= null)&&this.connectorLastEarned.equals(rhs.connectorLastEarned))))&&((this.reqCreditsInst == rhs.reqCreditsInst)||((this.reqCreditsInst!= null)&&this.reqCreditsInst.equals(rhs.reqCreditsInst))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.reqCoursesInst == rhs.reqCoursesInst)||((this.reqCoursesInst!= null)&&this.reqCoursesInst.equals(rhs.reqCoursesInst))))&&((this.grdeCodeMin == rhs.grdeCodeMin)||((this.grdeCodeMin!= null)&&this.grdeCodeMin.equals(rhs.grdeCodeMin))));
    }

}
