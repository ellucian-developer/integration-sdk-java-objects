
package com.ellucian.generated.bpapi.ban.area_output_inquiry.v0_1_0;

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
    "actCoursesOverall",
    "reqCreditsITrad",
    "reqCreditsOverall",
    "complCredits",
    "crseReuseInd",
    "maxCreditsINontrad",
    "maxCreditsTransfer",
    "actCoursesINontrad",
    "actCreditsITrad",
    "connectorInst",
    "attrReuseInd",
    "connectorOverall",
    "connectorTransfer",
    "connectorINontrad",
    "complCourses",
    "actCoursesTransfer",
    "actCoursesITrad",
    "actCoursesInst",
    "actCreditsInst",
    "areaPriority",
    "termCodeEff",
    "sourceText",
    "maxCoursesTransfer",
    "connectorITrad",
    "yearRule",
    "actCreditsTransfer",
    "reqCoursesOverall",
    "maxCoursesINontrad",
    "reqCoursesITrad",
    "reqCreditsInst",
    "reqCoursesInst",
    "actCreditsOverall",
    "minAreaGpaDisplay",
    "actAreaGpaDisplay",
    "actCreditsINontrad",
    "grdeCodeMin"
})
@Generated("jsonschema2pojo")
public class AreaOutputInquiry010GetResponse {

    /**
     * Courses Used
     * <p>
     * Lineage reference object : SMBAOGN_ACT_COURSES_OVERALL
     * 
     */
    @JsonProperty("actCoursesOverall")
    @JsonPropertyDescription("Lineage reference object : SMBAOGN_ACT_COURSES_OVERALL")
    private Double actCoursesOverall;
    /**
     * Required Institutional Traditional
     * <p>
     * Lineage reference object : SMBAOGN_REQ_CREDITS_I_TRAD
     * 
     */
    @JsonProperty("reqCreditsITrad")
    @JsonPropertyDescription("Lineage reference object : SMBAOGN_REQ_CREDITS_I_TRAD")
    private Double reqCreditsITrad;
    /**
     * Total Required
     * <p>
     * Lineage reference object : SMBAOGN_REQ_CREDITS_OVERALL
     * 
     */
    @JsonProperty("reqCreditsOverall")
    @JsonPropertyDescription("Lineage reference object : SMBAOGN_REQ_CREDITS_OVERALL")
    private Double reqCreditsOverall;
    /**
     * Compliance
     * <p>
     * Lineage reference object : SMBAOGN_COMPL_CREDITS
     * 
     */
    @JsonProperty("complCredits")
    @JsonPropertyDescription("Lineage reference object : SMBAOGN_COMPL_CREDITS")
    private Double complCredits;
    /**
     * Course Reuse
     * <p>
     * Lineage reference object : SMBAOGN_CRSE_REUSE_IND
     * 
     */
    @JsonProperty("crseReuseInd")
    @JsonPropertyDescription("Lineage reference object : SMBAOGN_CRSE_REUSE_IND")
    private String crseReuseInd;
    /**
     * Maximum Institutional Non-Traditional
     * <p>
     * Lineage reference object : SMBAOGN_MAX_CREDITS_I_NONTRAD
     * 
     */
    @JsonProperty("maxCreditsINontrad")
    @JsonPropertyDescription("Lineage reference object : SMBAOGN_MAX_CREDITS_I_NONTRAD")
    private Double maxCreditsINontrad;
    /**
     * Maximum Transfer
     * <p>
     * Lineage reference object : SMBAOGN_MAX_CREDITS_TRANSFER
     * 
     */
    @JsonProperty("maxCreditsTransfer")
    @JsonPropertyDescription("Lineage reference object : SMBAOGN_MAX_CREDITS_TRANSFER")
    private Double maxCreditsTransfer;
    /**
     * Lineage reference object : SMBAOGN_ACT_COURSES_I_NONTRAD
     * 
     */
    @JsonProperty("actCoursesINontrad")
    @JsonPropertyDescription("Lineage reference object : SMBAOGN_ACT_COURSES_I_NONTRAD")
    private Double actCoursesINontrad;
    /**
     * Lineage reference object : SMBAOGN_ACT_CREDITS_I_TRAD
     * 
     */
    @JsonProperty("actCreditsITrad")
    @JsonPropertyDescription("Lineage reference object : SMBAOGN_ACT_CREDITS_I_TRAD")
    private Double actCreditsITrad;
    /**
     * Lineage reference object : SMBAOGN_CONNECTOR_INST
     * (Required)
     * 
     */
    @JsonProperty("connectorInst")
    @JsonPropertyDescription("Lineage reference object : SMBAOGN_CONNECTOR_INST")
    private String connectorInst;
    /**
     * Attribute Reuse
     * <p>
     * Lineage reference object : SMBAOGN_ATTR_REUSE_IND
     * 
     */
    @JsonProperty("attrReuseInd")
    @JsonPropertyDescription("Lineage reference object : SMBAOGN_ATTR_REUSE_IND")
    private String attrReuseInd;
    /**
     * Lineage reference object : SMBAOGN_CONNECTOR_OVERALL
     * (Required)
     * 
     */
    @JsonProperty("connectorOverall")
    @JsonPropertyDescription("Lineage reference object : SMBAOGN_CONNECTOR_OVERALL")
    private String connectorOverall;
    /**
     * Lineage reference object : SMBAOGN_CONNECTOR_TRANSFER
     * (Required)
     * 
     */
    @JsonProperty("connectorTransfer")
    @JsonPropertyDescription("Lineage reference object : SMBAOGN_CONNECTOR_TRANSFER")
    private String connectorTransfer;
    /**
     * Lineage reference object : SMBAOGN_CONNECTOR_I_NONTRAD
     * (Required)
     * 
     */
    @JsonProperty("connectorINontrad")
    @JsonPropertyDescription("Lineage reference object : SMBAOGN_CONNECTOR_I_NONTRAD")
    private String connectorINontrad;
    /**
     * Lineage reference object : SMBAOGN_COMPL_COURSES
     * 
     */
    @JsonProperty("complCourses")
    @JsonPropertyDescription("Lineage reference object : SMBAOGN_COMPL_COURSES")
    private Double complCourses;
    /**
     * Lineage reference object : SMBAOGN_ACT_COURSES_TRANSFER
     * 
     */
    @JsonProperty("actCoursesTransfer")
    @JsonPropertyDescription("Lineage reference object : SMBAOGN_ACT_COURSES_TRANSFER")
    private Double actCoursesTransfer;
    /**
     * Lineage reference object : SMBAOGN_ACT_COURSES_I_TRAD
     * 
     */
    @JsonProperty("actCoursesITrad")
    @JsonPropertyDescription("Lineage reference object : SMBAOGN_ACT_COURSES_I_TRAD")
    private Double actCoursesITrad;
    /**
     * Lineage reference object : SMBAOGN_ACT_COURSES_INST
     * 
     */
    @JsonProperty("actCoursesInst")
    @JsonPropertyDescription("Lineage reference object : SMBAOGN_ACT_COURSES_INST")
    private Double actCoursesInst;
    /**
     * Credits Required
     * <p>
     * Lineage reference object : SMBAOGN_ACT_CREDITS_INST
     * 
     */
    @JsonProperty("actCreditsInst")
    @JsonPropertyDescription("Lineage reference object : SMBAOGN_ACT_CREDITS_INST")
    private Double actCreditsInst;
    /**
     * Priority
     * <p>
     * Lineage reference object : SMBAOGN_AREA_PRIORITY
     * 
     */
    @JsonProperty("areaPriority")
    @JsonPropertyDescription("Lineage reference object : SMBAOGN_AREA_PRIORITY")
    private Double areaPriority;
    /**
     * Term Effective
     * <p>
     * Lineage reference object : SMBAOGN_TERM_CODE_EFF
     * 
     */
    @JsonProperty("termCodeEff")
    @JsonPropertyDescription("Lineage reference object : SMBAOGN_TERM_CODE_EFF")
    private String termCodeEff;
    /**
     * Source
     * <p>
     * 
     * 
     */
    @JsonProperty("sourceText")
    private String sourceText;
    /**
     * Lineage reference object : SMBAOGN_MAX_COURSES_TRANSFER
     * 
     */
    @JsonProperty("maxCoursesTransfer")
    @JsonPropertyDescription("Lineage reference object : SMBAOGN_MAX_COURSES_TRANSFER")
    private Double maxCoursesTransfer;
    /**
     * Lineage reference object : SMBAOGN_CONNECTOR_I_TRAD
     * (Required)
     * 
     */
    @JsonProperty("connectorITrad")
    @JsonPropertyDescription("Lineage reference object : SMBAOGN_CONNECTOR_I_TRAD")
    private String connectorITrad;
    /**
     * Year Limit
     * <p>
     * Lineage reference object : SMBAOGN_YEAR_RULE
     * 
     */
    @JsonProperty("yearRule")
    @JsonPropertyDescription("Lineage reference object : SMBAOGN_YEAR_RULE")
    private Double yearRule;
    /**
     * Lineage reference object : SMBAOGN_ACT_CREDITS_TRANSFER
     * 
     */
    @JsonProperty("actCreditsTransfer")
    @JsonPropertyDescription("Lineage reference object : SMBAOGN_ACT_CREDITS_TRANSFER")
    private Double actCreditsTransfer;
    /**
     * Courses Required
     * <p>
     * Lineage reference object : SMBAOGN_REQ_COURSES_OVERALL
     * 
     */
    @JsonProperty("reqCoursesOverall")
    @JsonPropertyDescription("Lineage reference object : SMBAOGN_REQ_COURSES_OVERALL")
    private Double reqCoursesOverall;
    /**
     * Lineage reference object : SMBAOGN_MAX_COURSES_I_NONTRAD
     * 
     */
    @JsonProperty("maxCoursesINontrad")
    @JsonPropertyDescription("Lineage reference object : SMBAOGN_MAX_COURSES_I_NONTRAD")
    private Double maxCoursesINontrad;
    /**
     * Lineage reference object : SMBAOGN_REQ_COURSES_I_TRAD
     * 
     */
    @JsonProperty("reqCoursesITrad")
    @JsonPropertyDescription("Lineage reference object : SMBAOGN_REQ_COURSES_I_TRAD")
    private Double reqCoursesITrad;
    /**
     * Required Institutional
     * <p>
     * Lineage reference object : SMBAOGN_REQ_CREDITS_INST
     * 
     */
    @JsonProperty("reqCreditsInst")
    @JsonPropertyDescription("Lineage reference object : SMBAOGN_REQ_CREDITS_INST")
    private Double reqCreditsInst;
    /**
     * Lineage reference object : SMBAOGN_REQ_COURSES_INST
     * 
     */
    @JsonProperty("reqCoursesInst")
    @JsonPropertyDescription("Lineage reference object : SMBAOGN_REQ_COURSES_INST")
    private Double reqCoursesInst;
    /**
     * Credits Used
     * <p>
     * Lineage reference object : SMBAOGN_ACT_CREDITS_OVERALL
     * 
     */
    @JsonProperty("actCreditsOverall")
    @JsonPropertyDescription("Lineage reference object : SMBAOGN_ACT_CREDITS_OVERALL")
    private Double actCreditsOverall;
    /**
     * Minimum Area GPA
     * <p>
     * 
     * 
     */
    @JsonProperty("minAreaGpaDisplay")
    private Double minAreaGpaDisplay;
    /**
     * Actual
     * <p>
     * 
     * 
     */
    @JsonProperty("actAreaGpaDisplay")
    private Double actAreaGpaDisplay;
    /**
     * Lineage reference object : SMBAOGN_ACT_CREDITS_I_NONTRAD
     * 
     */
    @JsonProperty("actCreditsINontrad")
    @JsonPropertyDescription("Lineage reference object : SMBAOGN_ACT_CREDITS_I_NONTRAD")
    private Double actCreditsINontrad;
    /**
     * Minimum Course Grade
     * <p>
     * Lineage reference object : SMBAOGN_GRDE_CODE_MIN
     * 
     */
    @JsonProperty("grdeCodeMin")
    @JsonPropertyDescription("Lineage reference object : SMBAOGN_GRDE_CODE_MIN")
    private String grdeCodeMin;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Courses Used
     * <p>
     * Lineage reference object : SMBAOGN_ACT_COURSES_OVERALL
     * 
     */
    @JsonProperty("actCoursesOverall")
    public Double getActCoursesOverall() {
        return actCoursesOverall;
    }

    /**
     * Courses Used
     * <p>
     * Lineage reference object : SMBAOGN_ACT_COURSES_OVERALL
     * 
     */
    @JsonProperty("actCoursesOverall")
    public void setActCoursesOverall(Double actCoursesOverall) {
        this.actCoursesOverall = actCoursesOverall;
    }

    public AreaOutputInquiry010GetResponse withActCoursesOverall(Double actCoursesOverall) {
        this.actCoursesOverall = actCoursesOverall;
        return this;
    }

    /**
     * Required Institutional Traditional
     * <p>
     * Lineage reference object : SMBAOGN_REQ_CREDITS_I_TRAD
     * 
     */
    @JsonProperty("reqCreditsITrad")
    public Double getReqCreditsITrad() {
        return reqCreditsITrad;
    }

    /**
     * Required Institutional Traditional
     * <p>
     * Lineage reference object : SMBAOGN_REQ_CREDITS_I_TRAD
     * 
     */
    @JsonProperty("reqCreditsITrad")
    public void setReqCreditsITrad(Double reqCreditsITrad) {
        this.reqCreditsITrad = reqCreditsITrad;
    }

    public AreaOutputInquiry010GetResponse withReqCreditsITrad(Double reqCreditsITrad) {
        this.reqCreditsITrad = reqCreditsITrad;
        return this;
    }

    /**
     * Total Required
     * <p>
     * Lineage reference object : SMBAOGN_REQ_CREDITS_OVERALL
     * 
     */
    @JsonProperty("reqCreditsOverall")
    public Double getReqCreditsOverall() {
        return reqCreditsOverall;
    }

    /**
     * Total Required
     * <p>
     * Lineage reference object : SMBAOGN_REQ_CREDITS_OVERALL
     * 
     */
    @JsonProperty("reqCreditsOverall")
    public void setReqCreditsOverall(Double reqCreditsOverall) {
        this.reqCreditsOverall = reqCreditsOverall;
    }

    public AreaOutputInquiry010GetResponse withReqCreditsOverall(Double reqCreditsOverall) {
        this.reqCreditsOverall = reqCreditsOverall;
        return this;
    }

    /**
     * Compliance
     * <p>
     * Lineage reference object : SMBAOGN_COMPL_CREDITS
     * 
     */
    @JsonProperty("complCredits")
    public Double getComplCredits() {
        return complCredits;
    }

    /**
     * Compliance
     * <p>
     * Lineage reference object : SMBAOGN_COMPL_CREDITS
     * 
     */
    @JsonProperty("complCredits")
    public void setComplCredits(Double complCredits) {
        this.complCredits = complCredits;
    }

    public AreaOutputInquiry010GetResponse withComplCredits(Double complCredits) {
        this.complCredits = complCredits;
        return this;
    }

    /**
     * Course Reuse
     * <p>
     * Lineage reference object : SMBAOGN_CRSE_REUSE_IND
     * 
     */
    @JsonProperty("crseReuseInd")
    public String getCrseReuseInd() {
        return crseReuseInd;
    }

    /**
     * Course Reuse
     * <p>
     * Lineage reference object : SMBAOGN_CRSE_REUSE_IND
     * 
     */
    @JsonProperty("crseReuseInd")
    public void setCrseReuseInd(String crseReuseInd) {
        this.crseReuseInd = crseReuseInd;
    }

    public AreaOutputInquiry010GetResponse withCrseReuseInd(String crseReuseInd) {
        this.crseReuseInd = crseReuseInd;
        return this;
    }

    /**
     * Maximum Institutional Non-Traditional
     * <p>
     * Lineage reference object : SMBAOGN_MAX_CREDITS_I_NONTRAD
     * 
     */
    @JsonProperty("maxCreditsINontrad")
    public Double getMaxCreditsINontrad() {
        return maxCreditsINontrad;
    }

    /**
     * Maximum Institutional Non-Traditional
     * <p>
     * Lineage reference object : SMBAOGN_MAX_CREDITS_I_NONTRAD
     * 
     */
    @JsonProperty("maxCreditsINontrad")
    public void setMaxCreditsINontrad(Double maxCreditsINontrad) {
        this.maxCreditsINontrad = maxCreditsINontrad;
    }

    public AreaOutputInquiry010GetResponse withMaxCreditsINontrad(Double maxCreditsINontrad) {
        this.maxCreditsINontrad = maxCreditsINontrad;
        return this;
    }

    /**
     * Maximum Transfer
     * <p>
     * Lineage reference object : SMBAOGN_MAX_CREDITS_TRANSFER
     * 
     */
    @JsonProperty("maxCreditsTransfer")
    public Double getMaxCreditsTransfer() {
        return maxCreditsTransfer;
    }

    /**
     * Maximum Transfer
     * <p>
     * Lineage reference object : SMBAOGN_MAX_CREDITS_TRANSFER
     * 
     */
    @JsonProperty("maxCreditsTransfer")
    public void setMaxCreditsTransfer(Double maxCreditsTransfer) {
        this.maxCreditsTransfer = maxCreditsTransfer;
    }

    public AreaOutputInquiry010GetResponse withMaxCreditsTransfer(Double maxCreditsTransfer) {
        this.maxCreditsTransfer = maxCreditsTransfer;
        return this;
    }

    /**
     * Lineage reference object : SMBAOGN_ACT_COURSES_I_NONTRAD
     * 
     */
    @JsonProperty("actCoursesINontrad")
    public Double getActCoursesINontrad() {
        return actCoursesINontrad;
    }

    /**
     * Lineage reference object : SMBAOGN_ACT_COURSES_I_NONTRAD
     * 
     */
    @JsonProperty("actCoursesINontrad")
    public void setActCoursesINontrad(Double actCoursesINontrad) {
        this.actCoursesINontrad = actCoursesINontrad;
    }

    public AreaOutputInquiry010GetResponse withActCoursesINontrad(Double actCoursesINontrad) {
        this.actCoursesINontrad = actCoursesINontrad;
        return this;
    }

    /**
     * Lineage reference object : SMBAOGN_ACT_CREDITS_I_TRAD
     * 
     */
    @JsonProperty("actCreditsITrad")
    public Double getActCreditsITrad() {
        return actCreditsITrad;
    }

    /**
     * Lineage reference object : SMBAOGN_ACT_CREDITS_I_TRAD
     * 
     */
    @JsonProperty("actCreditsITrad")
    public void setActCreditsITrad(Double actCreditsITrad) {
        this.actCreditsITrad = actCreditsITrad;
    }

    public AreaOutputInquiry010GetResponse withActCreditsITrad(Double actCreditsITrad) {
        this.actCreditsITrad = actCreditsITrad;
        return this;
    }

    /**
     * Lineage reference object : SMBAOGN_CONNECTOR_INST
     * (Required)
     * 
     */
    @JsonProperty("connectorInst")
    public String getConnectorInst() {
        return connectorInst;
    }

    /**
     * Lineage reference object : SMBAOGN_CONNECTOR_INST
     * (Required)
     * 
     */
    @JsonProperty("connectorInst")
    public void setConnectorInst(String connectorInst) {
        this.connectorInst = connectorInst;
    }

    public AreaOutputInquiry010GetResponse withConnectorInst(String connectorInst) {
        this.connectorInst = connectorInst;
        return this;
    }

    /**
     * Attribute Reuse
     * <p>
     * Lineage reference object : SMBAOGN_ATTR_REUSE_IND
     * 
     */
    @JsonProperty("attrReuseInd")
    public String getAttrReuseInd() {
        return attrReuseInd;
    }

    /**
     * Attribute Reuse
     * <p>
     * Lineage reference object : SMBAOGN_ATTR_REUSE_IND
     * 
     */
    @JsonProperty("attrReuseInd")
    public void setAttrReuseInd(String attrReuseInd) {
        this.attrReuseInd = attrReuseInd;
    }

    public AreaOutputInquiry010GetResponse withAttrReuseInd(String attrReuseInd) {
        this.attrReuseInd = attrReuseInd;
        return this;
    }

    /**
     * Lineage reference object : SMBAOGN_CONNECTOR_OVERALL
     * (Required)
     * 
     */
    @JsonProperty("connectorOverall")
    public String getConnectorOverall() {
        return connectorOverall;
    }

    /**
     * Lineage reference object : SMBAOGN_CONNECTOR_OVERALL
     * (Required)
     * 
     */
    @JsonProperty("connectorOverall")
    public void setConnectorOverall(String connectorOverall) {
        this.connectorOverall = connectorOverall;
    }

    public AreaOutputInquiry010GetResponse withConnectorOverall(String connectorOverall) {
        this.connectorOverall = connectorOverall;
        return this;
    }

    /**
     * Lineage reference object : SMBAOGN_CONNECTOR_TRANSFER
     * (Required)
     * 
     */
    @JsonProperty("connectorTransfer")
    public String getConnectorTransfer() {
        return connectorTransfer;
    }

    /**
     * Lineage reference object : SMBAOGN_CONNECTOR_TRANSFER
     * (Required)
     * 
     */
    @JsonProperty("connectorTransfer")
    public void setConnectorTransfer(String connectorTransfer) {
        this.connectorTransfer = connectorTransfer;
    }

    public AreaOutputInquiry010GetResponse withConnectorTransfer(String connectorTransfer) {
        this.connectorTransfer = connectorTransfer;
        return this;
    }

    /**
     * Lineage reference object : SMBAOGN_CONNECTOR_I_NONTRAD
     * (Required)
     * 
     */
    @JsonProperty("connectorINontrad")
    public String getConnectorINontrad() {
        return connectorINontrad;
    }

    /**
     * Lineage reference object : SMBAOGN_CONNECTOR_I_NONTRAD
     * (Required)
     * 
     */
    @JsonProperty("connectorINontrad")
    public void setConnectorINontrad(String connectorINontrad) {
        this.connectorINontrad = connectorINontrad;
    }

    public AreaOutputInquiry010GetResponse withConnectorINontrad(String connectorINontrad) {
        this.connectorINontrad = connectorINontrad;
        return this;
    }

    /**
     * Lineage reference object : SMBAOGN_COMPL_COURSES
     * 
     */
    @JsonProperty("complCourses")
    public Double getComplCourses() {
        return complCourses;
    }

    /**
     * Lineage reference object : SMBAOGN_COMPL_COURSES
     * 
     */
    @JsonProperty("complCourses")
    public void setComplCourses(Double complCourses) {
        this.complCourses = complCourses;
    }

    public AreaOutputInquiry010GetResponse withComplCourses(Double complCourses) {
        this.complCourses = complCourses;
        return this;
    }

    /**
     * Lineage reference object : SMBAOGN_ACT_COURSES_TRANSFER
     * 
     */
    @JsonProperty("actCoursesTransfer")
    public Double getActCoursesTransfer() {
        return actCoursesTransfer;
    }

    /**
     * Lineage reference object : SMBAOGN_ACT_COURSES_TRANSFER
     * 
     */
    @JsonProperty("actCoursesTransfer")
    public void setActCoursesTransfer(Double actCoursesTransfer) {
        this.actCoursesTransfer = actCoursesTransfer;
    }

    public AreaOutputInquiry010GetResponse withActCoursesTransfer(Double actCoursesTransfer) {
        this.actCoursesTransfer = actCoursesTransfer;
        return this;
    }

    /**
     * Lineage reference object : SMBAOGN_ACT_COURSES_I_TRAD
     * 
     */
    @JsonProperty("actCoursesITrad")
    public Double getActCoursesITrad() {
        return actCoursesITrad;
    }

    /**
     * Lineage reference object : SMBAOGN_ACT_COURSES_I_TRAD
     * 
     */
    @JsonProperty("actCoursesITrad")
    public void setActCoursesITrad(Double actCoursesITrad) {
        this.actCoursesITrad = actCoursesITrad;
    }

    public AreaOutputInquiry010GetResponse withActCoursesITrad(Double actCoursesITrad) {
        this.actCoursesITrad = actCoursesITrad;
        return this;
    }

    /**
     * Lineage reference object : SMBAOGN_ACT_COURSES_INST
     * 
     */
    @JsonProperty("actCoursesInst")
    public Double getActCoursesInst() {
        return actCoursesInst;
    }

    /**
     * Lineage reference object : SMBAOGN_ACT_COURSES_INST
     * 
     */
    @JsonProperty("actCoursesInst")
    public void setActCoursesInst(Double actCoursesInst) {
        this.actCoursesInst = actCoursesInst;
    }

    public AreaOutputInquiry010GetResponse withActCoursesInst(Double actCoursesInst) {
        this.actCoursesInst = actCoursesInst;
        return this;
    }

    /**
     * Credits Required
     * <p>
     * Lineage reference object : SMBAOGN_ACT_CREDITS_INST
     * 
     */
    @JsonProperty("actCreditsInst")
    public Double getActCreditsInst() {
        return actCreditsInst;
    }

    /**
     * Credits Required
     * <p>
     * Lineage reference object : SMBAOGN_ACT_CREDITS_INST
     * 
     */
    @JsonProperty("actCreditsInst")
    public void setActCreditsInst(Double actCreditsInst) {
        this.actCreditsInst = actCreditsInst;
    }

    public AreaOutputInquiry010GetResponse withActCreditsInst(Double actCreditsInst) {
        this.actCreditsInst = actCreditsInst;
        return this;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : SMBAOGN_AREA_PRIORITY
     * 
     */
    @JsonProperty("areaPriority")
    public Double getAreaPriority() {
        return areaPriority;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : SMBAOGN_AREA_PRIORITY
     * 
     */
    @JsonProperty("areaPriority")
    public void setAreaPriority(Double areaPriority) {
        this.areaPriority = areaPriority;
    }

    public AreaOutputInquiry010GetResponse withAreaPriority(Double areaPriority) {
        this.areaPriority = areaPriority;
        return this;
    }

    /**
     * Term Effective
     * <p>
     * Lineage reference object : SMBAOGN_TERM_CODE_EFF
     * 
     */
    @JsonProperty("termCodeEff")
    public String getTermCodeEff() {
        return termCodeEff;
    }

    /**
     * Term Effective
     * <p>
     * Lineage reference object : SMBAOGN_TERM_CODE_EFF
     * 
     */
    @JsonProperty("termCodeEff")
    public void setTermCodeEff(String termCodeEff) {
        this.termCodeEff = termCodeEff;
    }

    public AreaOutputInquiry010GetResponse withTermCodeEff(String termCodeEff) {
        this.termCodeEff = termCodeEff;
        return this;
    }

    /**
     * Source
     * <p>
     * 
     * 
     */
    @JsonProperty("sourceText")
    public String getSourceText() {
        return sourceText;
    }

    /**
     * Source
     * <p>
     * 
     * 
     */
    @JsonProperty("sourceText")
    public void setSourceText(String sourceText) {
        this.sourceText = sourceText;
    }

    public AreaOutputInquiry010GetResponse withSourceText(String sourceText) {
        this.sourceText = sourceText;
        return this;
    }

    /**
     * Lineage reference object : SMBAOGN_MAX_COURSES_TRANSFER
     * 
     */
    @JsonProperty("maxCoursesTransfer")
    public Double getMaxCoursesTransfer() {
        return maxCoursesTransfer;
    }

    /**
     * Lineage reference object : SMBAOGN_MAX_COURSES_TRANSFER
     * 
     */
    @JsonProperty("maxCoursesTransfer")
    public void setMaxCoursesTransfer(Double maxCoursesTransfer) {
        this.maxCoursesTransfer = maxCoursesTransfer;
    }

    public AreaOutputInquiry010GetResponse withMaxCoursesTransfer(Double maxCoursesTransfer) {
        this.maxCoursesTransfer = maxCoursesTransfer;
        return this;
    }

    /**
     * Lineage reference object : SMBAOGN_CONNECTOR_I_TRAD
     * (Required)
     * 
     */
    @JsonProperty("connectorITrad")
    public String getConnectorITrad() {
        return connectorITrad;
    }

    /**
     * Lineage reference object : SMBAOGN_CONNECTOR_I_TRAD
     * (Required)
     * 
     */
    @JsonProperty("connectorITrad")
    public void setConnectorITrad(String connectorITrad) {
        this.connectorITrad = connectorITrad;
    }

    public AreaOutputInquiry010GetResponse withConnectorITrad(String connectorITrad) {
        this.connectorITrad = connectorITrad;
        return this;
    }

    /**
     * Year Limit
     * <p>
     * Lineage reference object : SMBAOGN_YEAR_RULE
     * 
     */
    @JsonProperty("yearRule")
    public Double getYearRule() {
        return yearRule;
    }

    /**
     * Year Limit
     * <p>
     * Lineage reference object : SMBAOGN_YEAR_RULE
     * 
     */
    @JsonProperty("yearRule")
    public void setYearRule(Double yearRule) {
        this.yearRule = yearRule;
    }

    public AreaOutputInquiry010GetResponse withYearRule(Double yearRule) {
        this.yearRule = yearRule;
        return this;
    }

    /**
     * Lineage reference object : SMBAOGN_ACT_CREDITS_TRANSFER
     * 
     */
    @JsonProperty("actCreditsTransfer")
    public Double getActCreditsTransfer() {
        return actCreditsTransfer;
    }

    /**
     * Lineage reference object : SMBAOGN_ACT_CREDITS_TRANSFER
     * 
     */
    @JsonProperty("actCreditsTransfer")
    public void setActCreditsTransfer(Double actCreditsTransfer) {
        this.actCreditsTransfer = actCreditsTransfer;
    }

    public AreaOutputInquiry010GetResponse withActCreditsTransfer(Double actCreditsTransfer) {
        this.actCreditsTransfer = actCreditsTransfer;
        return this;
    }

    /**
     * Courses Required
     * <p>
     * Lineage reference object : SMBAOGN_REQ_COURSES_OVERALL
     * 
     */
    @JsonProperty("reqCoursesOverall")
    public Double getReqCoursesOverall() {
        return reqCoursesOverall;
    }

    /**
     * Courses Required
     * <p>
     * Lineage reference object : SMBAOGN_REQ_COURSES_OVERALL
     * 
     */
    @JsonProperty("reqCoursesOverall")
    public void setReqCoursesOverall(Double reqCoursesOverall) {
        this.reqCoursesOverall = reqCoursesOverall;
    }

    public AreaOutputInquiry010GetResponse withReqCoursesOverall(Double reqCoursesOverall) {
        this.reqCoursesOverall = reqCoursesOverall;
        return this;
    }

    /**
     * Lineage reference object : SMBAOGN_MAX_COURSES_I_NONTRAD
     * 
     */
    @JsonProperty("maxCoursesINontrad")
    public Double getMaxCoursesINontrad() {
        return maxCoursesINontrad;
    }

    /**
     * Lineage reference object : SMBAOGN_MAX_COURSES_I_NONTRAD
     * 
     */
    @JsonProperty("maxCoursesINontrad")
    public void setMaxCoursesINontrad(Double maxCoursesINontrad) {
        this.maxCoursesINontrad = maxCoursesINontrad;
    }

    public AreaOutputInquiry010GetResponse withMaxCoursesINontrad(Double maxCoursesINontrad) {
        this.maxCoursesINontrad = maxCoursesINontrad;
        return this;
    }

    /**
     * Lineage reference object : SMBAOGN_REQ_COURSES_I_TRAD
     * 
     */
    @JsonProperty("reqCoursesITrad")
    public Double getReqCoursesITrad() {
        return reqCoursesITrad;
    }

    /**
     * Lineage reference object : SMBAOGN_REQ_COURSES_I_TRAD
     * 
     */
    @JsonProperty("reqCoursesITrad")
    public void setReqCoursesITrad(Double reqCoursesITrad) {
        this.reqCoursesITrad = reqCoursesITrad;
    }

    public AreaOutputInquiry010GetResponse withReqCoursesITrad(Double reqCoursesITrad) {
        this.reqCoursesITrad = reqCoursesITrad;
        return this;
    }

    /**
     * Required Institutional
     * <p>
     * Lineage reference object : SMBAOGN_REQ_CREDITS_INST
     * 
     */
    @JsonProperty("reqCreditsInst")
    public Double getReqCreditsInst() {
        return reqCreditsInst;
    }

    /**
     * Required Institutional
     * <p>
     * Lineage reference object : SMBAOGN_REQ_CREDITS_INST
     * 
     */
    @JsonProperty("reqCreditsInst")
    public void setReqCreditsInst(Double reqCreditsInst) {
        this.reqCreditsInst = reqCreditsInst;
    }

    public AreaOutputInquiry010GetResponse withReqCreditsInst(Double reqCreditsInst) {
        this.reqCreditsInst = reqCreditsInst;
        return this;
    }

    /**
     * Lineage reference object : SMBAOGN_REQ_COURSES_INST
     * 
     */
    @JsonProperty("reqCoursesInst")
    public Double getReqCoursesInst() {
        return reqCoursesInst;
    }

    /**
     * Lineage reference object : SMBAOGN_REQ_COURSES_INST
     * 
     */
    @JsonProperty("reqCoursesInst")
    public void setReqCoursesInst(Double reqCoursesInst) {
        this.reqCoursesInst = reqCoursesInst;
    }

    public AreaOutputInquiry010GetResponse withReqCoursesInst(Double reqCoursesInst) {
        this.reqCoursesInst = reqCoursesInst;
        return this;
    }

    /**
     * Credits Used
     * <p>
     * Lineage reference object : SMBAOGN_ACT_CREDITS_OVERALL
     * 
     */
    @JsonProperty("actCreditsOverall")
    public Double getActCreditsOverall() {
        return actCreditsOverall;
    }

    /**
     * Credits Used
     * <p>
     * Lineage reference object : SMBAOGN_ACT_CREDITS_OVERALL
     * 
     */
    @JsonProperty("actCreditsOverall")
    public void setActCreditsOverall(Double actCreditsOverall) {
        this.actCreditsOverall = actCreditsOverall;
    }

    public AreaOutputInquiry010GetResponse withActCreditsOverall(Double actCreditsOverall) {
        this.actCreditsOverall = actCreditsOverall;
        return this;
    }

    /**
     * Minimum Area GPA
     * <p>
     * 
     * 
     */
    @JsonProperty("minAreaGpaDisplay")
    public Double getMinAreaGpaDisplay() {
        return minAreaGpaDisplay;
    }

    /**
     * Minimum Area GPA
     * <p>
     * 
     * 
     */
    @JsonProperty("minAreaGpaDisplay")
    public void setMinAreaGpaDisplay(Double minAreaGpaDisplay) {
        this.minAreaGpaDisplay = minAreaGpaDisplay;
    }

    public AreaOutputInquiry010GetResponse withMinAreaGpaDisplay(Double minAreaGpaDisplay) {
        this.minAreaGpaDisplay = minAreaGpaDisplay;
        return this;
    }

    /**
     * Actual
     * <p>
     * 
     * 
     */
    @JsonProperty("actAreaGpaDisplay")
    public Double getActAreaGpaDisplay() {
        return actAreaGpaDisplay;
    }

    /**
     * Actual
     * <p>
     * 
     * 
     */
    @JsonProperty("actAreaGpaDisplay")
    public void setActAreaGpaDisplay(Double actAreaGpaDisplay) {
        this.actAreaGpaDisplay = actAreaGpaDisplay;
    }

    public AreaOutputInquiry010GetResponse withActAreaGpaDisplay(Double actAreaGpaDisplay) {
        this.actAreaGpaDisplay = actAreaGpaDisplay;
        return this;
    }

    /**
     * Lineage reference object : SMBAOGN_ACT_CREDITS_I_NONTRAD
     * 
     */
    @JsonProperty("actCreditsINontrad")
    public Double getActCreditsINontrad() {
        return actCreditsINontrad;
    }

    /**
     * Lineage reference object : SMBAOGN_ACT_CREDITS_I_NONTRAD
     * 
     */
    @JsonProperty("actCreditsINontrad")
    public void setActCreditsINontrad(Double actCreditsINontrad) {
        this.actCreditsINontrad = actCreditsINontrad;
    }

    public AreaOutputInquiry010GetResponse withActCreditsINontrad(Double actCreditsINontrad) {
        this.actCreditsINontrad = actCreditsINontrad;
        return this;
    }

    /**
     * Minimum Course Grade
     * <p>
     * Lineage reference object : SMBAOGN_GRDE_CODE_MIN
     * 
     */
    @JsonProperty("grdeCodeMin")
    public String getGrdeCodeMin() {
        return grdeCodeMin;
    }

    /**
     * Minimum Course Grade
     * <p>
     * Lineage reference object : SMBAOGN_GRDE_CODE_MIN
     * 
     */
    @JsonProperty("grdeCodeMin")
    public void setGrdeCodeMin(String grdeCodeMin) {
        this.grdeCodeMin = grdeCodeMin;
    }

    public AreaOutputInquiry010GetResponse withGrdeCodeMin(String grdeCodeMin) {
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

    public AreaOutputInquiry010GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AreaOutputInquiry010GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("actCoursesOverall");
        sb.append('=');
        sb.append(((this.actCoursesOverall == null)?"<null>":this.actCoursesOverall));
        sb.append(',');
        sb.append("reqCreditsITrad");
        sb.append('=');
        sb.append(((this.reqCreditsITrad == null)?"<null>":this.reqCreditsITrad));
        sb.append(',');
        sb.append("reqCreditsOverall");
        sb.append('=');
        sb.append(((this.reqCreditsOverall == null)?"<null>":this.reqCreditsOverall));
        sb.append(',');
        sb.append("complCredits");
        sb.append('=');
        sb.append(((this.complCredits == null)?"<null>":this.complCredits));
        sb.append(',');
        sb.append("crseReuseInd");
        sb.append('=');
        sb.append(((this.crseReuseInd == null)?"<null>":this.crseReuseInd));
        sb.append(',');
        sb.append("maxCreditsINontrad");
        sb.append('=');
        sb.append(((this.maxCreditsINontrad == null)?"<null>":this.maxCreditsINontrad));
        sb.append(',');
        sb.append("maxCreditsTransfer");
        sb.append('=');
        sb.append(((this.maxCreditsTransfer == null)?"<null>":this.maxCreditsTransfer));
        sb.append(',');
        sb.append("actCoursesINontrad");
        sb.append('=');
        sb.append(((this.actCoursesINontrad == null)?"<null>":this.actCoursesINontrad));
        sb.append(',');
        sb.append("actCreditsITrad");
        sb.append('=');
        sb.append(((this.actCreditsITrad == null)?"<null>":this.actCreditsITrad));
        sb.append(',');
        sb.append("connectorInst");
        sb.append('=');
        sb.append(((this.connectorInst == null)?"<null>":this.connectorInst));
        sb.append(',');
        sb.append("attrReuseInd");
        sb.append('=');
        sb.append(((this.attrReuseInd == null)?"<null>":this.attrReuseInd));
        sb.append(',');
        sb.append("connectorOverall");
        sb.append('=');
        sb.append(((this.connectorOverall == null)?"<null>":this.connectorOverall));
        sb.append(',');
        sb.append("connectorTransfer");
        sb.append('=');
        sb.append(((this.connectorTransfer == null)?"<null>":this.connectorTransfer));
        sb.append(',');
        sb.append("connectorINontrad");
        sb.append('=');
        sb.append(((this.connectorINontrad == null)?"<null>":this.connectorINontrad));
        sb.append(',');
        sb.append("complCourses");
        sb.append('=');
        sb.append(((this.complCourses == null)?"<null>":this.complCourses));
        sb.append(',');
        sb.append("actCoursesTransfer");
        sb.append('=');
        sb.append(((this.actCoursesTransfer == null)?"<null>":this.actCoursesTransfer));
        sb.append(',');
        sb.append("actCoursesITrad");
        sb.append('=');
        sb.append(((this.actCoursesITrad == null)?"<null>":this.actCoursesITrad));
        sb.append(',');
        sb.append("actCoursesInst");
        sb.append('=');
        sb.append(((this.actCoursesInst == null)?"<null>":this.actCoursesInst));
        sb.append(',');
        sb.append("actCreditsInst");
        sb.append('=');
        sb.append(((this.actCreditsInst == null)?"<null>":this.actCreditsInst));
        sb.append(',');
        sb.append("areaPriority");
        sb.append('=');
        sb.append(((this.areaPriority == null)?"<null>":this.areaPriority));
        sb.append(',');
        sb.append("termCodeEff");
        sb.append('=');
        sb.append(((this.termCodeEff == null)?"<null>":this.termCodeEff));
        sb.append(',');
        sb.append("sourceText");
        sb.append('=');
        sb.append(((this.sourceText == null)?"<null>":this.sourceText));
        sb.append(',');
        sb.append("maxCoursesTransfer");
        sb.append('=');
        sb.append(((this.maxCoursesTransfer == null)?"<null>":this.maxCoursesTransfer));
        sb.append(',');
        sb.append("connectorITrad");
        sb.append('=');
        sb.append(((this.connectorITrad == null)?"<null>":this.connectorITrad));
        sb.append(',');
        sb.append("yearRule");
        sb.append('=');
        sb.append(((this.yearRule == null)?"<null>":this.yearRule));
        sb.append(',');
        sb.append("actCreditsTransfer");
        sb.append('=');
        sb.append(((this.actCreditsTransfer == null)?"<null>":this.actCreditsTransfer));
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
        sb.append("reqCreditsInst");
        sb.append('=');
        sb.append(((this.reqCreditsInst == null)?"<null>":this.reqCreditsInst));
        sb.append(',');
        sb.append("reqCoursesInst");
        sb.append('=');
        sb.append(((this.reqCoursesInst == null)?"<null>":this.reqCoursesInst));
        sb.append(',');
        sb.append("actCreditsOverall");
        sb.append('=');
        sb.append(((this.actCreditsOverall == null)?"<null>":this.actCreditsOverall));
        sb.append(',');
        sb.append("minAreaGpaDisplay");
        sb.append('=');
        sb.append(((this.minAreaGpaDisplay == null)?"<null>":this.minAreaGpaDisplay));
        sb.append(',');
        sb.append("actAreaGpaDisplay");
        sb.append('=');
        sb.append(((this.actAreaGpaDisplay == null)?"<null>":this.actAreaGpaDisplay));
        sb.append(',');
        sb.append("actCreditsINontrad");
        sb.append('=');
        sb.append(((this.actCreditsINontrad == null)?"<null>":this.actCreditsINontrad));
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
        result = ((result* 31)+((this.actCoursesOverall == null)? 0 :this.actCoursesOverall.hashCode()));
        result = ((result* 31)+((this.reqCreditsITrad == null)? 0 :this.reqCreditsITrad.hashCode()));
        result = ((result* 31)+((this.reqCreditsOverall == null)? 0 :this.reqCreditsOverall.hashCode()));
        result = ((result* 31)+((this.complCredits == null)? 0 :this.complCredits.hashCode()));
        result = ((result* 31)+((this.crseReuseInd == null)? 0 :this.crseReuseInd.hashCode()));
        result = ((result* 31)+((this.maxCreditsINontrad == null)? 0 :this.maxCreditsINontrad.hashCode()));
        result = ((result* 31)+((this.maxCreditsTransfer == null)? 0 :this.maxCreditsTransfer.hashCode()));
        result = ((result* 31)+((this.actCoursesINontrad == null)? 0 :this.actCoursesINontrad.hashCode()));
        result = ((result* 31)+((this.actCreditsITrad == null)? 0 :this.actCreditsITrad.hashCode()));
        result = ((result* 31)+((this.connectorInst == null)? 0 :this.connectorInst.hashCode()));
        result = ((result* 31)+((this.attrReuseInd == null)? 0 :this.attrReuseInd.hashCode()));
        result = ((result* 31)+((this.connectorOverall == null)? 0 :this.connectorOverall.hashCode()));
        result = ((result* 31)+((this.connectorTransfer == null)? 0 :this.connectorTransfer.hashCode()));
        result = ((result* 31)+((this.connectorINontrad == null)? 0 :this.connectorINontrad.hashCode()));
        result = ((result* 31)+((this.complCourses == null)? 0 :this.complCourses.hashCode()));
        result = ((result* 31)+((this.actCoursesTransfer == null)? 0 :this.actCoursesTransfer.hashCode()));
        result = ((result* 31)+((this.actCoursesITrad == null)? 0 :this.actCoursesITrad.hashCode()));
        result = ((result* 31)+((this.actCoursesInst == null)? 0 :this.actCoursesInst.hashCode()));
        result = ((result* 31)+((this.actCreditsInst == null)? 0 :this.actCreditsInst.hashCode()));
        result = ((result* 31)+((this.areaPriority == null)? 0 :this.areaPriority.hashCode()));
        result = ((result* 31)+((this.termCodeEff == null)? 0 :this.termCodeEff.hashCode()));
        result = ((result* 31)+((this.sourceText == null)? 0 :this.sourceText.hashCode()));
        result = ((result* 31)+((this.maxCoursesTransfer == null)? 0 :this.maxCoursesTransfer.hashCode()));
        result = ((result* 31)+((this.connectorITrad == null)? 0 :this.connectorITrad.hashCode()));
        result = ((result* 31)+((this.yearRule == null)? 0 :this.yearRule.hashCode()));
        result = ((result* 31)+((this.actCreditsTransfer == null)? 0 :this.actCreditsTransfer.hashCode()));
        result = ((result* 31)+((this.reqCoursesOverall == null)? 0 :this.reqCoursesOverall.hashCode()));
        result = ((result* 31)+((this.maxCoursesINontrad == null)? 0 :this.maxCoursesINontrad.hashCode()));
        result = ((result* 31)+((this.reqCoursesITrad == null)? 0 :this.reqCoursesITrad.hashCode()));
        result = ((result* 31)+((this.reqCreditsInst == null)? 0 :this.reqCreditsInst.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.reqCoursesInst == null)? 0 :this.reqCoursesInst.hashCode()));
        result = ((result* 31)+((this.actCreditsOverall == null)? 0 :this.actCreditsOverall.hashCode()));
        result = ((result* 31)+((this.minAreaGpaDisplay == null)? 0 :this.minAreaGpaDisplay.hashCode()));
        result = ((result* 31)+((this.actAreaGpaDisplay == null)? 0 :this.actAreaGpaDisplay.hashCode()));
        result = ((result* 31)+((this.actCreditsINontrad == null)? 0 :this.actCreditsINontrad.hashCode()));
        result = ((result* 31)+((this.grdeCodeMin == null)? 0 :this.grdeCodeMin.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AreaOutputInquiry010GetResponse) == false) {
            return false;
        }
        AreaOutputInquiry010GetResponse rhs = ((AreaOutputInquiry010GetResponse) other);
        return ((((((((((((((((((((((((((((((((((((((this.actCoursesOverall == rhs.actCoursesOverall)||((this.actCoursesOverall!= null)&&this.actCoursesOverall.equals(rhs.actCoursesOverall)))&&((this.reqCreditsITrad == rhs.reqCreditsITrad)||((this.reqCreditsITrad!= null)&&this.reqCreditsITrad.equals(rhs.reqCreditsITrad))))&&((this.reqCreditsOverall == rhs.reqCreditsOverall)||((this.reqCreditsOverall!= null)&&this.reqCreditsOverall.equals(rhs.reqCreditsOverall))))&&((this.complCredits == rhs.complCredits)||((this.complCredits!= null)&&this.complCredits.equals(rhs.complCredits))))&&((this.crseReuseInd == rhs.crseReuseInd)||((this.crseReuseInd!= null)&&this.crseReuseInd.equals(rhs.crseReuseInd))))&&((this.maxCreditsINontrad == rhs.maxCreditsINontrad)||((this.maxCreditsINontrad!= null)&&this.maxCreditsINontrad.equals(rhs.maxCreditsINontrad))))&&((this.maxCreditsTransfer == rhs.maxCreditsTransfer)||((this.maxCreditsTransfer!= null)&&this.maxCreditsTransfer.equals(rhs.maxCreditsTransfer))))&&((this.actCoursesINontrad == rhs.actCoursesINontrad)||((this.actCoursesINontrad!= null)&&this.actCoursesINontrad.equals(rhs.actCoursesINontrad))))&&((this.actCreditsITrad == rhs.actCreditsITrad)||((this.actCreditsITrad!= null)&&this.actCreditsITrad.equals(rhs.actCreditsITrad))))&&((this.connectorInst == rhs.connectorInst)||((this.connectorInst!= null)&&this.connectorInst.equals(rhs.connectorInst))))&&((this.attrReuseInd == rhs.attrReuseInd)||((this.attrReuseInd!= null)&&this.attrReuseInd.equals(rhs.attrReuseInd))))&&((this.connectorOverall == rhs.connectorOverall)||((this.connectorOverall!= null)&&this.connectorOverall.equals(rhs.connectorOverall))))&&((this.connectorTransfer == rhs.connectorTransfer)||((this.connectorTransfer!= null)&&this.connectorTransfer.equals(rhs.connectorTransfer))))&&((this.connectorINontrad == rhs.connectorINontrad)||((this.connectorINontrad!= null)&&this.connectorINontrad.equals(rhs.connectorINontrad))))&&((this.complCourses == rhs.complCourses)||((this.complCourses!= null)&&this.complCourses.equals(rhs.complCourses))))&&((this.actCoursesTransfer == rhs.actCoursesTransfer)||((this.actCoursesTransfer!= null)&&this.actCoursesTransfer.equals(rhs.actCoursesTransfer))))&&((this.actCoursesITrad == rhs.actCoursesITrad)||((this.actCoursesITrad!= null)&&this.actCoursesITrad.equals(rhs.actCoursesITrad))))&&((this.actCoursesInst == rhs.actCoursesInst)||((this.actCoursesInst!= null)&&this.actCoursesInst.equals(rhs.actCoursesInst))))&&((this.actCreditsInst == rhs.actCreditsInst)||((this.actCreditsInst!= null)&&this.actCreditsInst.equals(rhs.actCreditsInst))))&&((this.areaPriority == rhs.areaPriority)||((this.areaPriority!= null)&&this.areaPriority.equals(rhs.areaPriority))))&&((this.termCodeEff == rhs.termCodeEff)||((this.termCodeEff!= null)&&this.termCodeEff.equals(rhs.termCodeEff))))&&((this.sourceText == rhs.sourceText)||((this.sourceText!= null)&&this.sourceText.equals(rhs.sourceText))))&&((this.maxCoursesTransfer == rhs.maxCoursesTransfer)||((this.maxCoursesTransfer!= null)&&this.maxCoursesTransfer.equals(rhs.maxCoursesTransfer))))&&((this.connectorITrad == rhs.connectorITrad)||((this.connectorITrad!= null)&&this.connectorITrad.equals(rhs.connectorITrad))))&&((this.yearRule == rhs.yearRule)||((this.yearRule!= null)&&this.yearRule.equals(rhs.yearRule))))&&((this.actCreditsTransfer == rhs.actCreditsTransfer)||((this.actCreditsTransfer!= null)&&this.actCreditsTransfer.equals(rhs.actCreditsTransfer))))&&((this.reqCoursesOverall == rhs.reqCoursesOverall)||((this.reqCoursesOverall!= null)&&this.reqCoursesOverall.equals(rhs.reqCoursesOverall))))&&((this.maxCoursesINontrad == rhs.maxCoursesINontrad)||((this.maxCoursesINontrad!= null)&&this.maxCoursesINontrad.equals(rhs.maxCoursesINontrad))))&&((this.reqCoursesITrad == rhs.reqCoursesITrad)||((this.reqCoursesITrad!= null)&&this.reqCoursesITrad.equals(rhs.reqCoursesITrad))))&&((this.reqCreditsInst == rhs.reqCreditsInst)||((this.reqCreditsInst!= null)&&this.reqCreditsInst.equals(rhs.reqCreditsInst))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.reqCoursesInst == rhs.reqCoursesInst)||((this.reqCoursesInst!= null)&&this.reqCoursesInst.equals(rhs.reqCoursesInst))))&&((this.actCreditsOverall == rhs.actCreditsOverall)||((this.actCreditsOverall!= null)&&this.actCreditsOverall.equals(rhs.actCreditsOverall))))&&((this.minAreaGpaDisplay == rhs.minAreaGpaDisplay)||((this.minAreaGpaDisplay!= null)&&this.minAreaGpaDisplay.equals(rhs.minAreaGpaDisplay))))&&((this.actAreaGpaDisplay == rhs.actAreaGpaDisplay)||((this.actAreaGpaDisplay!= null)&&this.actAreaGpaDisplay.equals(rhs.actAreaGpaDisplay))))&&((this.actCreditsINontrad == rhs.actCreditsINontrad)||((this.actCreditsINontrad!= null)&&this.actCreditsINontrad.equals(rhs.actCreditsINontrad))))&&((this.grdeCodeMin == rhs.grdeCodeMin)||((this.grdeCodeMin!= null)&&this.grdeCodeMin.equals(rhs.grdeCodeMin))));
    }

}
