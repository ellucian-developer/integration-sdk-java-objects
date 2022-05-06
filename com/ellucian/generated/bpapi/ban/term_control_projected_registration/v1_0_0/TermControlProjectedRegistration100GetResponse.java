
package com.ellucian.generated.bpapi.ban.term_control_projected_registration.v1_0_0;

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
    "projElecRegCde",
    "attrCode",
    "failedMostprobInd",
    "projPassedCde",
    "inclFailedInd",
    "projMandRegCde",
    "projWebInd",
    "userId",
    "stvrestDesc",
    "projTransferredCde",
    "activityDate",
    "projInprogressCde",
    "electiveRuleKey",
    "dataOrigin",
    "nullProjRestrictInd",
    "projRollToAhCde",
    "restCode",
    "mandatoryRuleKey",
    "projRestrictInd",
    "stvattrDesc",
    "termCode"
})
@Generated("jsonschema2pojo")
public class TermControlProjectedRegistration100GetResponse {

    /**
     * Lineage reference object : SOBPROJ_PROJ_ELEC_REG_CDE
     * 
     */
    @JsonProperty("projElecRegCde")
    @JsonPropertyDescription("Lineage reference object : SOBPROJ_PROJ_ELEC_REG_CDE")
    private String projElecRegCde;
    /**
     * Section Attribute for Elective Pool
     * <p>
     * Lineage reference object : SOBPROJ_ATTR_CODE, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("attrCode")
    @JsonPropertyDescription("Lineage reference object : SOBPROJ_ATTR_CODE, Lookup lineage reference object : stvattr")
    private String attrCode;
    /**
     * Lineage reference object : SOBPROJ_FAILED_MOSTPROB_IND
     * 
     */
    @JsonProperty("failedMostprobInd")
    @JsonPropertyDescription("Lineage reference object : SOBPROJ_FAILED_MOSTPROB_IND")
    private String failedMostprobInd;
    /**
     * Lineage reference object : SOBPROJ_PROJ_PASSED_CDE
     * 
     */
    @JsonProperty("projPassedCde")
    @JsonPropertyDescription("Lineage reference object : SOBPROJ_PROJ_PASSED_CDE")
    private String projPassedCde;
    /**
     * Lineage reference object : SOBPROJ_INCL_FAILED_IND
     * 
     */
    @JsonProperty("inclFailedInd")
    @JsonPropertyDescription("Lineage reference object : SOBPROJ_INCL_FAILED_IND")
    private String inclFailedInd;
    /**
     * Lineage reference object : SOBPROJ_PROJ_MAND_REG_CDE
     * 
     */
    @JsonProperty("projMandRegCde")
    @JsonPropertyDescription("Lineage reference object : SOBPROJ_PROJ_MAND_REG_CDE")
    private String projMandRegCde;
    /**
     * Lineage reference object : SOBPROJ_PROJ_WEB_IND
     * 
     */
    @JsonProperty("projWebInd")
    @JsonPropertyDescription("Lineage reference object : SOBPROJ_PROJ_WEB_IND")
    private String projWebInd;
    /**
     * Lineage reference object : SOBPROJ_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SOBPROJ_USER_ID")
    private String userId;
    @JsonProperty("stvrestDesc")
    private String stvrestDesc;
    /**
     * Lineage reference object : SOBPROJ_PROJ_TRANSFERRED_CDE
     * 
     */
    @JsonProperty("projTransferredCde")
    @JsonPropertyDescription("Lineage reference object : SOBPROJ_PROJ_TRANSFERRED_CDE")
    private String projTransferredCde;
    /**
     * Lineage reference object : SOBPROJ_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SOBPROJ_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Lineage reference object : SOBPROJ_PROJ_INPROGRESS_CDE
     * 
     */
    @JsonProperty("projInprogressCde")
    @JsonPropertyDescription("Lineage reference object : SOBPROJ_PROJ_INPROGRESS_CDE")
    private String projInprogressCde;
    /**
     * Lineage reference object : SOBPROJ_ELECTIVE_RULE_KEY
     * 
     */
    @JsonProperty("electiveRuleKey")
    @JsonPropertyDescription("Lineage reference object : SOBPROJ_ELECTIVE_RULE_KEY")
    private String electiveRuleKey;
    /**
     * Lineage reference object : SOBPROJ_DATA_ORIGIN
     * 
     */
    @JsonProperty("dataOrigin")
    @JsonPropertyDescription("Lineage reference object : SOBPROJ_DATA_ORIGIN")
    private String dataOrigin;
    /**
     * Lineage reference object : SOBPROJ_NULL_PROJ_RESTRICT_IND
     * 
     */
    @JsonProperty("nullProjRestrictInd")
    @JsonPropertyDescription("Lineage reference object : SOBPROJ_NULL_PROJ_RESTRICT_IND")
    private String nullProjRestrictInd;
    /**
     * Lineage reference object : SOBPROJ_PROJ_ROLL_TO_AH_CDE
     * 
     */
    @JsonProperty("projRollToAhCde")
    @JsonPropertyDescription("Lineage reference object : SOBPROJ_PROJ_ROLL_TO_AH_CDE")
    private String projRollToAhCde;
    /**
     * External API
     * <p>
     * Lineage reference object : SOBPROJ_REST_CODE, Lookup lineage reference object : stvrest
     * 
     */
    @JsonProperty("restCode")
    @JsonPropertyDescription("Lineage reference object : SOBPROJ_REST_CODE, Lookup lineage reference object : stvrest")
    private String restCode;
    /**
     * Lineage reference object : SOBPROJ_MANDATORY_RULE_KEY
     * 
     */
    @JsonProperty("mandatoryRuleKey")
    @JsonPropertyDescription("Lineage reference object : SOBPROJ_MANDATORY_RULE_KEY")
    private String mandatoryRuleKey;
    /**
     * Lineage reference object : SOBPROJ_PROJ_RESTRICT_IND
     * 
     */
    @JsonProperty("projRestrictInd")
    @JsonPropertyDescription("Lineage reference object : SOBPROJ_PROJ_RESTRICT_IND")
    private String projRestrictInd;
    @JsonProperty("stvattrDesc")
    private String stvattrDesc;
    /**
     * Lineage reference object : SOBPROJ_TERM_CODE
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : SOBPROJ_TERM_CODE")
    private String termCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : SOBPROJ_PROJ_ELEC_REG_CDE
     * 
     */
    @JsonProperty("projElecRegCde")
    public String getProjElecRegCde() {
        return projElecRegCde;
    }

    /**
     * Lineage reference object : SOBPROJ_PROJ_ELEC_REG_CDE
     * 
     */
    @JsonProperty("projElecRegCde")
    public void setProjElecRegCde(String projElecRegCde) {
        this.projElecRegCde = projElecRegCde;
    }

    public TermControlProjectedRegistration100GetResponse withProjElecRegCde(String projElecRegCde) {
        this.projElecRegCde = projElecRegCde;
        return this;
    }

    /**
     * Section Attribute for Elective Pool
     * <p>
     * Lineage reference object : SOBPROJ_ATTR_CODE, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("attrCode")
    public String getAttrCode() {
        return attrCode;
    }

    /**
     * Section Attribute for Elective Pool
     * <p>
     * Lineage reference object : SOBPROJ_ATTR_CODE, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("attrCode")
    public void setAttrCode(String attrCode) {
        this.attrCode = attrCode;
    }

    public TermControlProjectedRegistration100GetResponse withAttrCode(String attrCode) {
        this.attrCode = attrCode;
        return this;
    }

    /**
     * Lineage reference object : SOBPROJ_FAILED_MOSTPROB_IND
     * 
     */
    @JsonProperty("failedMostprobInd")
    public String getFailedMostprobInd() {
        return failedMostprobInd;
    }

    /**
     * Lineage reference object : SOBPROJ_FAILED_MOSTPROB_IND
     * 
     */
    @JsonProperty("failedMostprobInd")
    public void setFailedMostprobInd(String failedMostprobInd) {
        this.failedMostprobInd = failedMostprobInd;
    }

    public TermControlProjectedRegistration100GetResponse withFailedMostprobInd(String failedMostprobInd) {
        this.failedMostprobInd = failedMostprobInd;
        return this;
    }

    /**
     * Lineage reference object : SOBPROJ_PROJ_PASSED_CDE
     * 
     */
    @JsonProperty("projPassedCde")
    public String getProjPassedCde() {
        return projPassedCde;
    }

    /**
     * Lineage reference object : SOBPROJ_PROJ_PASSED_CDE
     * 
     */
    @JsonProperty("projPassedCde")
    public void setProjPassedCde(String projPassedCde) {
        this.projPassedCde = projPassedCde;
    }

    public TermControlProjectedRegistration100GetResponse withProjPassedCde(String projPassedCde) {
        this.projPassedCde = projPassedCde;
        return this;
    }

    /**
     * Lineage reference object : SOBPROJ_INCL_FAILED_IND
     * 
     */
    @JsonProperty("inclFailedInd")
    public String getInclFailedInd() {
        return inclFailedInd;
    }

    /**
     * Lineage reference object : SOBPROJ_INCL_FAILED_IND
     * 
     */
    @JsonProperty("inclFailedInd")
    public void setInclFailedInd(String inclFailedInd) {
        this.inclFailedInd = inclFailedInd;
    }

    public TermControlProjectedRegistration100GetResponse withInclFailedInd(String inclFailedInd) {
        this.inclFailedInd = inclFailedInd;
        return this;
    }

    /**
     * Lineage reference object : SOBPROJ_PROJ_MAND_REG_CDE
     * 
     */
    @JsonProperty("projMandRegCde")
    public String getProjMandRegCde() {
        return projMandRegCde;
    }

    /**
     * Lineage reference object : SOBPROJ_PROJ_MAND_REG_CDE
     * 
     */
    @JsonProperty("projMandRegCde")
    public void setProjMandRegCde(String projMandRegCde) {
        this.projMandRegCde = projMandRegCde;
    }

    public TermControlProjectedRegistration100GetResponse withProjMandRegCde(String projMandRegCde) {
        this.projMandRegCde = projMandRegCde;
        return this;
    }

    /**
     * Lineage reference object : SOBPROJ_PROJ_WEB_IND
     * 
     */
    @JsonProperty("projWebInd")
    public String getProjWebInd() {
        return projWebInd;
    }

    /**
     * Lineage reference object : SOBPROJ_PROJ_WEB_IND
     * 
     */
    @JsonProperty("projWebInd")
    public void setProjWebInd(String projWebInd) {
        this.projWebInd = projWebInd;
    }

    public TermControlProjectedRegistration100GetResponse withProjWebInd(String projWebInd) {
        this.projWebInd = projWebInd;
        return this;
    }

    /**
     * Lineage reference object : SOBPROJ_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SOBPROJ_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public TermControlProjectedRegistration100GetResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    @JsonProperty("stvrestDesc")
    public String getStvrestDesc() {
        return stvrestDesc;
    }

    @JsonProperty("stvrestDesc")
    public void setStvrestDesc(String stvrestDesc) {
        this.stvrestDesc = stvrestDesc;
    }

    public TermControlProjectedRegistration100GetResponse withStvrestDesc(String stvrestDesc) {
        this.stvrestDesc = stvrestDesc;
        return this;
    }

    /**
     * Lineage reference object : SOBPROJ_PROJ_TRANSFERRED_CDE
     * 
     */
    @JsonProperty("projTransferredCde")
    public String getProjTransferredCde() {
        return projTransferredCde;
    }

    /**
     * Lineage reference object : SOBPROJ_PROJ_TRANSFERRED_CDE
     * 
     */
    @JsonProperty("projTransferredCde")
    public void setProjTransferredCde(String projTransferredCde) {
        this.projTransferredCde = projTransferredCde;
    }

    public TermControlProjectedRegistration100GetResponse withProjTransferredCde(String projTransferredCde) {
        this.projTransferredCde = projTransferredCde;
        return this;
    }

    /**
     * Lineage reference object : SOBPROJ_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SOBPROJ_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public TermControlProjectedRegistration100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Lineage reference object : SOBPROJ_PROJ_INPROGRESS_CDE
     * 
     */
    @JsonProperty("projInprogressCde")
    public String getProjInprogressCde() {
        return projInprogressCde;
    }

    /**
     * Lineage reference object : SOBPROJ_PROJ_INPROGRESS_CDE
     * 
     */
    @JsonProperty("projInprogressCde")
    public void setProjInprogressCde(String projInprogressCde) {
        this.projInprogressCde = projInprogressCde;
    }

    public TermControlProjectedRegistration100GetResponse withProjInprogressCde(String projInprogressCde) {
        this.projInprogressCde = projInprogressCde;
        return this;
    }

    /**
     * Lineage reference object : SOBPROJ_ELECTIVE_RULE_KEY
     * 
     */
    @JsonProperty("electiveRuleKey")
    public String getElectiveRuleKey() {
        return electiveRuleKey;
    }

    /**
     * Lineage reference object : SOBPROJ_ELECTIVE_RULE_KEY
     * 
     */
    @JsonProperty("electiveRuleKey")
    public void setElectiveRuleKey(String electiveRuleKey) {
        this.electiveRuleKey = electiveRuleKey;
    }

    public TermControlProjectedRegistration100GetResponse withElectiveRuleKey(String electiveRuleKey) {
        this.electiveRuleKey = electiveRuleKey;
        return this;
    }

    /**
     * Lineage reference object : SOBPROJ_DATA_ORIGIN
     * 
     */
    @JsonProperty("dataOrigin")
    public String getDataOrigin() {
        return dataOrigin;
    }

    /**
     * Lineage reference object : SOBPROJ_DATA_ORIGIN
     * 
     */
    @JsonProperty("dataOrigin")
    public void setDataOrigin(String dataOrigin) {
        this.dataOrigin = dataOrigin;
    }

    public TermControlProjectedRegistration100GetResponse withDataOrigin(String dataOrigin) {
        this.dataOrigin = dataOrigin;
        return this;
    }

    /**
     * Lineage reference object : SOBPROJ_NULL_PROJ_RESTRICT_IND
     * 
     */
    @JsonProperty("nullProjRestrictInd")
    public String getNullProjRestrictInd() {
        return nullProjRestrictInd;
    }

    /**
     * Lineage reference object : SOBPROJ_NULL_PROJ_RESTRICT_IND
     * 
     */
    @JsonProperty("nullProjRestrictInd")
    public void setNullProjRestrictInd(String nullProjRestrictInd) {
        this.nullProjRestrictInd = nullProjRestrictInd;
    }

    public TermControlProjectedRegistration100GetResponse withNullProjRestrictInd(String nullProjRestrictInd) {
        this.nullProjRestrictInd = nullProjRestrictInd;
        return this;
    }

    /**
     * Lineage reference object : SOBPROJ_PROJ_ROLL_TO_AH_CDE
     * 
     */
    @JsonProperty("projRollToAhCde")
    public String getProjRollToAhCde() {
        return projRollToAhCde;
    }

    /**
     * Lineage reference object : SOBPROJ_PROJ_ROLL_TO_AH_CDE
     * 
     */
    @JsonProperty("projRollToAhCde")
    public void setProjRollToAhCde(String projRollToAhCde) {
        this.projRollToAhCde = projRollToAhCde;
    }

    public TermControlProjectedRegistration100GetResponse withProjRollToAhCde(String projRollToAhCde) {
        this.projRollToAhCde = projRollToAhCde;
        return this;
    }

    /**
     * External API
     * <p>
     * Lineage reference object : SOBPROJ_REST_CODE, Lookup lineage reference object : stvrest
     * 
     */
    @JsonProperty("restCode")
    public String getRestCode() {
        return restCode;
    }

    /**
     * External API
     * <p>
     * Lineage reference object : SOBPROJ_REST_CODE, Lookup lineage reference object : stvrest
     * 
     */
    @JsonProperty("restCode")
    public void setRestCode(String restCode) {
        this.restCode = restCode;
    }

    public TermControlProjectedRegistration100GetResponse withRestCode(String restCode) {
        this.restCode = restCode;
        return this;
    }

    /**
     * Lineage reference object : SOBPROJ_MANDATORY_RULE_KEY
     * 
     */
    @JsonProperty("mandatoryRuleKey")
    public String getMandatoryRuleKey() {
        return mandatoryRuleKey;
    }

    /**
     * Lineage reference object : SOBPROJ_MANDATORY_RULE_KEY
     * 
     */
    @JsonProperty("mandatoryRuleKey")
    public void setMandatoryRuleKey(String mandatoryRuleKey) {
        this.mandatoryRuleKey = mandatoryRuleKey;
    }

    public TermControlProjectedRegistration100GetResponse withMandatoryRuleKey(String mandatoryRuleKey) {
        this.mandatoryRuleKey = mandatoryRuleKey;
        return this;
    }

    /**
     * Lineage reference object : SOBPROJ_PROJ_RESTRICT_IND
     * 
     */
    @JsonProperty("projRestrictInd")
    public String getProjRestrictInd() {
        return projRestrictInd;
    }

    /**
     * Lineage reference object : SOBPROJ_PROJ_RESTRICT_IND
     * 
     */
    @JsonProperty("projRestrictInd")
    public void setProjRestrictInd(String projRestrictInd) {
        this.projRestrictInd = projRestrictInd;
    }

    public TermControlProjectedRegistration100GetResponse withProjRestrictInd(String projRestrictInd) {
        this.projRestrictInd = projRestrictInd;
        return this;
    }

    @JsonProperty("stvattrDesc")
    public String getStvattrDesc() {
        return stvattrDesc;
    }

    @JsonProperty("stvattrDesc")
    public void setStvattrDesc(String stvattrDesc) {
        this.stvattrDesc = stvattrDesc;
    }

    public TermControlProjectedRegistration100GetResponse withStvattrDesc(String stvattrDesc) {
        this.stvattrDesc = stvattrDesc;
        return this;
    }

    /**
     * Lineage reference object : SOBPROJ_TERM_CODE
     * 
     */
    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    /**
     * Lineage reference object : SOBPROJ_TERM_CODE
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public TermControlProjectedRegistration100GetResponse withTermCode(String termCode) {
        this.termCode = termCode;
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

    public TermControlProjectedRegistration100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TermControlProjectedRegistration100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("projElecRegCde");
        sb.append('=');
        sb.append(((this.projElecRegCde == null)?"<null>":this.projElecRegCde));
        sb.append(',');
        sb.append("attrCode");
        sb.append('=');
        sb.append(((this.attrCode == null)?"<null>":this.attrCode));
        sb.append(',');
        sb.append("failedMostprobInd");
        sb.append('=');
        sb.append(((this.failedMostprobInd == null)?"<null>":this.failedMostprobInd));
        sb.append(',');
        sb.append("projPassedCde");
        sb.append('=');
        sb.append(((this.projPassedCde == null)?"<null>":this.projPassedCde));
        sb.append(',');
        sb.append("inclFailedInd");
        sb.append('=');
        sb.append(((this.inclFailedInd == null)?"<null>":this.inclFailedInd));
        sb.append(',');
        sb.append("projMandRegCde");
        sb.append('=');
        sb.append(((this.projMandRegCde == null)?"<null>":this.projMandRegCde));
        sb.append(',');
        sb.append("projWebInd");
        sb.append('=');
        sb.append(((this.projWebInd == null)?"<null>":this.projWebInd));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("stvrestDesc");
        sb.append('=');
        sb.append(((this.stvrestDesc == null)?"<null>":this.stvrestDesc));
        sb.append(',');
        sb.append("projTransferredCde");
        sb.append('=');
        sb.append(((this.projTransferredCde == null)?"<null>":this.projTransferredCde));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("projInprogressCde");
        sb.append('=');
        sb.append(((this.projInprogressCde == null)?"<null>":this.projInprogressCde));
        sb.append(',');
        sb.append("electiveRuleKey");
        sb.append('=');
        sb.append(((this.electiveRuleKey == null)?"<null>":this.electiveRuleKey));
        sb.append(',');
        sb.append("dataOrigin");
        sb.append('=');
        sb.append(((this.dataOrigin == null)?"<null>":this.dataOrigin));
        sb.append(',');
        sb.append("nullProjRestrictInd");
        sb.append('=');
        sb.append(((this.nullProjRestrictInd == null)?"<null>":this.nullProjRestrictInd));
        sb.append(',');
        sb.append("projRollToAhCde");
        sb.append('=');
        sb.append(((this.projRollToAhCde == null)?"<null>":this.projRollToAhCde));
        sb.append(',');
        sb.append("restCode");
        sb.append('=');
        sb.append(((this.restCode == null)?"<null>":this.restCode));
        sb.append(',');
        sb.append("mandatoryRuleKey");
        sb.append('=');
        sb.append(((this.mandatoryRuleKey == null)?"<null>":this.mandatoryRuleKey));
        sb.append(',');
        sb.append("projRestrictInd");
        sb.append('=');
        sb.append(((this.projRestrictInd == null)?"<null>":this.projRestrictInd));
        sb.append(',');
        sb.append("stvattrDesc");
        sb.append('=');
        sb.append(((this.stvattrDesc == null)?"<null>":this.stvattrDesc));
        sb.append(',');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
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
        result = ((result* 31)+((this.projElecRegCde == null)? 0 :this.projElecRegCde.hashCode()));
        result = ((result* 31)+((this.attrCode == null)? 0 :this.attrCode.hashCode()));
        result = ((result* 31)+((this.failedMostprobInd == null)? 0 :this.failedMostprobInd.hashCode()));
        result = ((result* 31)+((this.projPassedCde == null)? 0 :this.projPassedCde.hashCode()));
        result = ((result* 31)+((this.inclFailedInd == null)? 0 :this.inclFailedInd.hashCode()));
        result = ((result* 31)+((this.projMandRegCde == null)? 0 :this.projMandRegCde.hashCode()));
        result = ((result* 31)+((this.projWebInd == null)? 0 :this.projWebInd.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.stvrestDesc == null)? 0 :this.stvrestDesc.hashCode()));
        result = ((result* 31)+((this.projTransferredCde == null)? 0 :this.projTransferredCde.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.projInprogressCde == null)? 0 :this.projInprogressCde.hashCode()));
        result = ((result* 31)+((this.electiveRuleKey == null)? 0 :this.electiveRuleKey.hashCode()));
        result = ((result* 31)+((this.dataOrigin == null)? 0 :this.dataOrigin.hashCode()));
        result = ((result* 31)+((this.nullProjRestrictInd == null)? 0 :this.nullProjRestrictInd.hashCode()));
        result = ((result* 31)+((this.projRollToAhCde == null)? 0 :this.projRollToAhCde.hashCode()));
        result = ((result* 31)+((this.restCode == null)? 0 :this.restCode.hashCode()));
        result = ((result* 31)+((this.mandatoryRuleKey == null)? 0 :this.mandatoryRuleKey.hashCode()));
        result = ((result* 31)+((this.projRestrictInd == null)? 0 :this.projRestrictInd.hashCode()));
        result = ((result* 31)+((this.stvattrDesc == null)? 0 :this.stvattrDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TermControlProjectedRegistration100GetResponse) == false) {
            return false;
        }
        TermControlProjectedRegistration100GetResponse rhs = ((TermControlProjectedRegistration100GetResponse) other);
        return (((((((((((((((((((((((this.projElecRegCde == rhs.projElecRegCde)||((this.projElecRegCde!= null)&&this.projElecRegCde.equals(rhs.projElecRegCde)))&&((this.attrCode == rhs.attrCode)||((this.attrCode!= null)&&this.attrCode.equals(rhs.attrCode))))&&((this.failedMostprobInd == rhs.failedMostprobInd)||((this.failedMostprobInd!= null)&&this.failedMostprobInd.equals(rhs.failedMostprobInd))))&&((this.projPassedCde == rhs.projPassedCde)||((this.projPassedCde!= null)&&this.projPassedCde.equals(rhs.projPassedCde))))&&((this.inclFailedInd == rhs.inclFailedInd)||((this.inclFailedInd!= null)&&this.inclFailedInd.equals(rhs.inclFailedInd))))&&((this.projMandRegCde == rhs.projMandRegCde)||((this.projMandRegCde!= null)&&this.projMandRegCde.equals(rhs.projMandRegCde))))&&((this.projWebInd == rhs.projWebInd)||((this.projWebInd!= null)&&this.projWebInd.equals(rhs.projWebInd))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.stvrestDesc == rhs.stvrestDesc)||((this.stvrestDesc!= null)&&this.stvrestDesc.equals(rhs.stvrestDesc))))&&((this.projTransferredCde == rhs.projTransferredCde)||((this.projTransferredCde!= null)&&this.projTransferredCde.equals(rhs.projTransferredCde))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.projInprogressCde == rhs.projInprogressCde)||((this.projInprogressCde!= null)&&this.projInprogressCde.equals(rhs.projInprogressCde))))&&((this.electiveRuleKey == rhs.electiveRuleKey)||((this.electiveRuleKey!= null)&&this.electiveRuleKey.equals(rhs.electiveRuleKey))))&&((this.dataOrigin == rhs.dataOrigin)||((this.dataOrigin!= null)&&this.dataOrigin.equals(rhs.dataOrigin))))&&((this.nullProjRestrictInd == rhs.nullProjRestrictInd)||((this.nullProjRestrictInd!= null)&&this.nullProjRestrictInd.equals(rhs.nullProjRestrictInd))))&&((this.projRollToAhCde == rhs.projRollToAhCde)||((this.projRollToAhCde!= null)&&this.projRollToAhCde.equals(rhs.projRollToAhCde))))&&((this.restCode == rhs.restCode)||((this.restCode!= null)&&this.restCode.equals(rhs.restCode))))&&((this.mandatoryRuleKey == rhs.mandatoryRuleKey)||((this.mandatoryRuleKey!= null)&&this.mandatoryRuleKey.equals(rhs.mandatoryRuleKey))))&&((this.projRestrictInd == rhs.projRestrictInd)||((this.projRestrictInd!= null)&&this.projRestrictInd.equals(rhs.projRestrictInd))))&&((this.stvattrDesc == rhs.stvattrDesc)||((this.stvattrDesc!= null)&&this.stvattrDesc.equals(rhs.stvattrDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
