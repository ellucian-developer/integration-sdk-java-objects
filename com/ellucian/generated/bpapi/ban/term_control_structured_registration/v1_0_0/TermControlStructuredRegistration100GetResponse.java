
package com.ellucian.generated.bpapi.ban.term_control_structured_registration.v1_0_0;

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
    "stvprntLinksDesc",
    "inProgGrdeInd",
    "prntCodeTtext",
    "errorCde",
    "prntCodeLinks",
    "userId",
    "optionalRuleKey",
    "stvrestDesc",
    "activityDate",
    "acadHistCde",
    "electiveActiveInd",
    "electiveRuleKey",
    "stvprntTtextDesc",
    "dataOrigin",
    "inProgInd",
    "restCode",
    "mandatoryRuleKey",
    "mandatoryActiveInd",
    "optionalActiveInd",
    "termCode"
})
@Generated("jsonschema2pojo")
public class TermControlStructuredRegistration100GetResponse {

    @JsonProperty("stvprntLinksDesc")
    private String stvprntLinksDesc;
    /**
     * Lineage reference object : SOBSTRG_IN_PROG_GRDE_IND
     * 
     */
    @JsonProperty("inProgGrdeInd")
    @JsonPropertyDescription("Lineage reference object : SOBSTRG_IN_PROG_GRDE_IND")
    private String inProgGrdeInd;
    /**
     * Lineage reference object : SOBSTRG_PRNT_CODE_TTEXT, Lookup lineage reference object : stvprnt
     * 
     */
    @JsonProperty("prntCodeTtext")
    @JsonPropertyDescription("Lineage reference object : SOBSTRG_PRNT_CODE_TTEXT, Lookup lineage reference object : stvprnt")
    private String prntCodeTtext;
    /**
     * Lineage reference object : SOBSTRG_ERROR_CDE
     * 
     */
    @JsonProperty("errorCde")
    @JsonPropertyDescription("Lineage reference object : SOBSTRG_ERROR_CDE")
    private String errorCde;
    /**
     * Lineage reference object : SOBSTRG_PRNT_CODE_LINKS, Lookup lineage reference object : stvprnt
     * 
     */
    @JsonProperty("prntCodeLinks")
    @JsonPropertyDescription("Lineage reference object : SOBSTRG_PRNT_CODE_LINKS, Lookup lineage reference object : stvprnt")
    private String prntCodeLinks;
    /**
     * Lineage reference object : SOBSTRG_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SOBSTRG_USER_ID")
    private String userId;
    /**
     * Lineage reference object : SOBSTRG_OPTIONAL_RULE_KEY
     * 
     */
    @JsonProperty("optionalRuleKey")
    @JsonPropertyDescription("Lineage reference object : SOBSTRG_OPTIONAL_RULE_KEY")
    private String optionalRuleKey;
    @JsonProperty("stvrestDesc")
    private String stvrestDesc;
    /**
     * Lineage reference object : SOBSTRG_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SOBSTRG_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Lineage reference object : SOBSTRG_ACAD_HIST_CDE
     * 
     */
    @JsonProperty("acadHistCde")
    @JsonPropertyDescription("Lineage reference object : SOBSTRG_ACAD_HIST_CDE")
    private String acadHistCde;
    /**
     * Lineage reference object : SOBSTRG_ELECTIVE_ACTIVE_IND
     * 
     */
    @JsonProperty("electiveActiveInd")
    @JsonPropertyDescription("Lineage reference object : SOBSTRG_ELECTIVE_ACTIVE_IND")
    private String electiveActiveInd;
    /**
     * Lineage reference object : SOBSTRG_ELECTIVE_RULE_KEY
     * 
     */
    @JsonProperty("electiveRuleKey")
    @JsonPropertyDescription("Lineage reference object : SOBSTRG_ELECTIVE_RULE_KEY")
    private String electiveRuleKey;
    @JsonProperty("stvprntTtextDesc")
    private String stvprntTtextDesc;
    /**
     * Lineage reference object : SOBSTRG_DATA_ORIGIN
     * 
     */
    @JsonProperty("dataOrigin")
    @JsonPropertyDescription("Lineage reference object : SOBSTRG_DATA_ORIGIN")
    private String dataOrigin;
    /**
     * Lineage reference object : SOBSTRG_IN_PROG_IND
     * 
     */
    @JsonProperty("inProgInd")
    @JsonPropertyDescription("Lineage reference object : SOBSTRG_IN_PROG_IND")
    private String inProgInd;
    /**
     * Lineage reference object : SOBSTRG_REST_CODE, Lookup lineage reference object : stvrest
     * 
     */
    @JsonProperty("restCode")
    @JsonPropertyDescription("Lineage reference object : SOBSTRG_REST_CODE, Lookup lineage reference object : stvrest")
    private String restCode;
    /**
     * Lineage reference object : SOBSTRG_MANDATORY_RULE_KEY
     * 
     */
    @JsonProperty("mandatoryRuleKey")
    @JsonPropertyDescription("Lineage reference object : SOBSTRG_MANDATORY_RULE_KEY")
    private String mandatoryRuleKey;
    /**
     * Lineage reference object : SOBSTRG_MANDATORY_ACTIVE_IND
     * 
     */
    @JsonProperty("mandatoryActiveInd")
    @JsonPropertyDescription("Lineage reference object : SOBSTRG_MANDATORY_ACTIVE_IND")
    private String mandatoryActiveInd;
    /**
     * Lineage reference object : SOBSTRG_OPTIONAL_ACTIVE_IND
     * 
     */
    @JsonProperty("optionalActiveInd")
    @JsonPropertyDescription("Lineage reference object : SOBSTRG_OPTIONAL_ACTIVE_IND")
    private String optionalActiveInd;
    /**
     * Lineage reference object : SOBSTRG_TERM_CODE
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : SOBSTRG_TERM_CODE")
    private String termCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("stvprntLinksDesc")
    public String getStvprntLinksDesc() {
        return stvprntLinksDesc;
    }

    @JsonProperty("stvprntLinksDesc")
    public void setStvprntLinksDesc(String stvprntLinksDesc) {
        this.stvprntLinksDesc = stvprntLinksDesc;
    }

    public TermControlStructuredRegistration100GetResponse withStvprntLinksDesc(String stvprntLinksDesc) {
        this.stvprntLinksDesc = stvprntLinksDesc;
        return this;
    }

    /**
     * Lineage reference object : SOBSTRG_IN_PROG_GRDE_IND
     * 
     */
    @JsonProperty("inProgGrdeInd")
    public String getInProgGrdeInd() {
        return inProgGrdeInd;
    }

    /**
     * Lineage reference object : SOBSTRG_IN_PROG_GRDE_IND
     * 
     */
    @JsonProperty("inProgGrdeInd")
    public void setInProgGrdeInd(String inProgGrdeInd) {
        this.inProgGrdeInd = inProgGrdeInd;
    }

    public TermControlStructuredRegistration100GetResponse withInProgGrdeInd(String inProgGrdeInd) {
        this.inProgGrdeInd = inProgGrdeInd;
        return this;
    }

    /**
     * Lineage reference object : SOBSTRG_PRNT_CODE_TTEXT, Lookup lineage reference object : stvprnt
     * 
     */
    @JsonProperty("prntCodeTtext")
    public String getPrntCodeTtext() {
        return prntCodeTtext;
    }

    /**
     * Lineage reference object : SOBSTRG_PRNT_CODE_TTEXT, Lookup lineage reference object : stvprnt
     * 
     */
    @JsonProperty("prntCodeTtext")
    public void setPrntCodeTtext(String prntCodeTtext) {
        this.prntCodeTtext = prntCodeTtext;
    }

    public TermControlStructuredRegistration100GetResponse withPrntCodeTtext(String prntCodeTtext) {
        this.prntCodeTtext = prntCodeTtext;
        return this;
    }

    /**
     * Lineage reference object : SOBSTRG_ERROR_CDE
     * 
     */
    @JsonProperty("errorCde")
    public String getErrorCde() {
        return errorCde;
    }

    /**
     * Lineage reference object : SOBSTRG_ERROR_CDE
     * 
     */
    @JsonProperty("errorCde")
    public void setErrorCde(String errorCde) {
        this.errorCde = errorCde;
    }

    public TermControlStructuredRegistration100GetResponse withErrorCde(String errorCde) {
        this.errorCde = errorCde;
        return this;
    }

    /**
     * Lineage reference object : SOBSTRG_PRNT_CODE_LINKS, Lookup lineage reference object : stvprnt
     * 
     */
    @JsonProperty("prntCodeLinks")
    public String getPrntCodeLinks() {
        return prntCodeLinks;
    }

    /**
     * Lineage reference object : SOBSTRG_PRNT_CODE_LINKS, Lookup lineage reference object : stvprnt
     * 
     */
    @JsonProperty("prntCodeLinks")
    public void setPrntCodeLinks(String prntCodeLinks) {
        this.prntCodeLinks = prntCodeLinks;
    }

    public TermControlStructuredRegistration100GetResponse withPrntCodeLinks(String prntCodeLinks) {
        this.prntCodeLinks = prntCodeLinks;
        return this;
    }

    /**
     * Lineage reference object : SOBSTRG_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SOBSTRG_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public TermControlStructuredRegistration100GetResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Lineage reference object : SOBSTRG_OPTIONAL_RULE_KEY
     * 
     */
    @JsonProperty("optionalRuleKey")
    public String getOptionalRuleKey() {
        return optionalRuleKey;
    }

    /**
     * Lineage reference object : SOBSTRG_OPTIONAL_RULE_KEY
     * 
     */
    @JsonProperty("optionalRuleKey")
    public void setOptionalRuleKey(String optionalRuleKey) {
        this.optionalRuleKey = optionalRuleKey;
    }

    public TermControlStructuredRegistration100GetResponse withOptionalRuleKey(String optionalRuleKey) {
        this.optionalRuleKey = optionalRuleKey;
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

    public TermControlStructuredRegistration100GetResponse withStvrestDesc(String stvrestDesc) {
        this.stvrestDesc = stvrestDesc;
        return this;
    }

    /**
     * Lineage reference object : SOBSTRG_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SOBSTRG_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public TermControlStructuredRegistration100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Lineage reference object : SOBSTRG_ACAD_HIST_CDE
     * 
     */
    @JsonProperty("acadHistCde")
    public String getAcadHistCde() {
        return acadHistCde;
    }

    /**
     * Lineage reference object : SOBSTRG_ACAD_HIST_CDE
     * 
     */
    @JsonProperty("acadHistCde")
    public void setAcadHistCde(String acadHistCde) {
        this.acadHistCde = acadHistCde;
    }

    public TermControlStructuredRegistration100GetResponse withAcadHistCde(String acadHistCde) {
        this.acadHistCde = acadHistCde;
        return this;
    }

    /**
     * Lineage reference object : SOBSTRG_ELECTIVE_ACTIVE_IND
     * 
     */
    @JsonProperty("electiveActiveInd")
    public String getElectiveActiveInd() {
        return electiveActiveInd;
    }

    /**
     * Lineage reference object : SOBSTRG_ELECTIVE_ACTIVE_IND
     * 
     */
    @JsonProperty("electiveActiveInd")
    public void setElectiveActiveInd(String electiveActiveInd) {
        this.electiveActiveInd = electiveActiveInd;
    }

    public TermControlStructuredRegistration100GetResponse withElectiveActiveInd(String electiveActiveInd) {
        this.electiveActiveInd = electiveActiveInd;
        return this;
    }

    /**
     * Lineage reference object : SOBSTRG_ELECTIVE_RULE_KEY
     * 
     */
    @JsonProperty("electiveRuleKey")
    public String getElectiveRuleKey() {
        return electiveRuleKey;
    }

    /**
     * Lineage reference object : SOBSTRG_ELECTIVE_RULE_KEY
     * 
     */
    @JsonProperty("electiveRuleKey")
    public void setElectiveRuleKey(String electiveRuleKey) {
        this.electiveRuleKey = electiveRuleKey;
    }

    public TermControlStructuredRegistration100GetResponse withElectiveRuleKey(String electiveRuleKey) {
        this.electiveRuleKey = electiveRuleKey;
        return this;
    }

    @JsonProperty("stvprntTtextDesc")
    public String getStvprntTtextDesc() {
        return stvprntTtextDesc;
    }

    @JsonProperty("stvprntTtextDesc")
    public void setStvprntTtextDesc(String stvprntTtextDesc) {
        this.stvprntTtextDesc = stvprntTtextDesc;
    }

    public TermControlStructuredRegistration100GetResponse withStvprntTtextDesc(String stvprntTtextDesc) {
        this.stvprntTtextDesc = stvprntTtextDesc;
        return this;
    }

    /**
     * Lineage reference object : SOBSTRG_DATA_ORIGIN
     * 
     */
    @JsonProperty("dataOrigin")
    public String getDataOrigin() {
        return dataOrigin;
    }

    /**
     * Lineage reference object : SOBSTRG_DATA_ORIGIN
     * 
     */
    @JsonProperty("dataOrigin")
    public void setDataOrigin(String dataOrigin) {
        this.dataOrigin = dataOrigin;
    }

    public TermControlStructuredRegistration100GetResponse withDataOrigin(String dataOrigin) {
        this.dataOrigin = dataOrigin;
        return this;
    }

    /**
     * Lineage reference object : SOBSTRG_IN_PROG_IND
     * 
     */
    @JsonProperty("inProgInd")
    public String getInProgInd() {
        return inProgInd;
    }

    /**
     * Lineage reference object : SOBSTRG_IN_PROG_IND
     * 
     */
    @JsonProperty("inProgInd")
    public void setInProgInd(String inProgInd) {
        this.inProgInd = inProgInd;
    }

    public TermControlStructuredRegistration100GetResponse withInProgInd(String inProgInd) {
        this.inProgInd = inProgInd;
        return this;
    }

    /**
     * Lineage reference object : SOBSTRG_REST_CODE, Lookup lineage reference object : stvrest
     * 
     */
    @JsonProperty("restCode")
    public String getRestCode() {
        return restCode;
    }

    /**
     * Lineage reference object : SOBSTRG_REST_CODE, Lookup lineage reference object : stvrest
     * 
     */
    @JsonProperty("restCode")
    public void setRestCode(String restCode) {
        this.restCode = restCode;
    }

    public TermControlStructuredRegistration100GetResponse withRestCode(String restCode) {
        this.restCode = restCode;
        return this;
    }

    /**
     * Lineage reference object : SOBSTRG_MANDATORY_RULE_KEY
     * 
     */
    @JsonProperty("mandatoryRuleKey")
    public String getMandatoryRuleKey() {
        return mandatoryRuleKey;
    }

    /**
     * Lineage reference object : SOBSTRG_MANDATORY_RULE_KEY
     * 
     */
    @JsonProperty("mandatoryRuleKey")
    public void setMandatoryRuleKey(String mandatoryRuleKey) {
        this.mandatoryRuleKey = mandatoryRuleKey;
    }

    public TermControlStructuredRegistration100GetResponse withMandatoryRuleKey(String mandatoryRuleKey) {
        this.mandatoryRuleKey = mandatoryRuleKey;
        return this;
    }

    /**
     * Lineage reference object : SOBSTRG_MANDATORY_ACTIVE_IND
     * 
     */
    @JsonProperty("mandatoryActiveInd")
    public String getMandatoryActiveInd() {
        return mandatoryActiveInd;
    }

    /**
     * Lineage reference object : SOBSTRG_MANDATORY_ACTIVE_IND
     * 
     */
    @JsonProperty("mandatoryActiveInd")
    public void setMandatoryActiveInd(String mandatoryActiveInd) {
        this.mandatoryActiveInd = mandatoryActiveInd;
    }

    public TermControlStructuredRegistration100GetResponse withMandatoryActiveInd(String mandatoryActiveInd) {
        this.mandatoryActiveInd = mandatoryActiveInd;
        return this;
    }

    /**
     * Lineage reference object : SOBSTRG_OPTIONAL_ACTIVE_IND
     * 
     */
    @JsonProperty("optionalActiveInd")
    public String getOptionalActiveInd() {
        return optionalActiveInd;
    }

    /**
     * Lineage reference object : SOBSTRG_OPTIONAL_ACTIVE_IND
     * 
     */
    @JsonProperty("optionalActiveInd")
    public void setOptionalActiveInd(String optionalActiveInd) {
        this.optionalActiveInd = optionalActiveInd;
    }

    public TermControlStructuredRegistration100GetResponse withOptionalActiveInd(String optionalActiveInd) {
        this.optionalActiveInd = optionalActiveInd;
        return this;
    }

    /**
     * Lineage reference object : SOBSTRG_TERM_CODE
     * 
     */
    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    /**
     * Lineage reference object : SOBSTRG_TERM_CODE
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public TermControlStructuredRegistration100GetResponse withTermCode(String termCode) {
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

    public TermControlStructuredRegistration100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TermControlStructuredRegistration100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("stvprntLinksDesc");
        sb.append('=');
        sb.append(((this.stvprntLinksDesc == null)?"<null>":this.stvprntLinksDesc));
        sb.append(',');
        sb.append("inProgGrdeInd");
        sb.append('=');
        sb.append(((this.inProgGrdeInd == null)?"<null>":this.inProgGrdeInd));
        sb.append(',');
        sb.append("prntCodeTtext");
        sb.append('=');
        sb.append(((this.prntCodeTtext == null)?"<null>":this.prntCodeTtext));
        sb.append(',');
        sb.append("errorCde");
        sb.append('=');
        sb.append(((this.errorCde == null)?"<null>":this.errorCde));
        sb.append(',');
        sb.append("prntCodeLinks");
        sb.append('=');
        sb.append(((this.prntCodeLinks == null)?"<null>":this.prntCodeLinks));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("optionalRuleKey");
        sb.append('=');
        sb.append(((this.optionalRuleKey == null)?"<null>":this.optionalRuleKey));
        sb.append(',');
        sb.append("stvrestDesc");
        sb.append('=');
        sb.append(((this.stvrestDesc == null)?"<null>":this.stvrestDesc));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("acadHistCde");
        sb.append('=');
        sb.append(((this.acadHistCde == null)?"<null>":this.acadHistCde));
        sb.append(',');
        sb.append("electiveActiveInd");
        sb.append('=');
        sb.append(((this.electiveActiveInd == null)?"<null>":this.electiveActiveInd));
        sb.append(',');
        sb.append("electiveRuleKey");
        sb.append('=');
        sb.append(((this.electiveRuleKey == null)?"<null>":this.electiveRuleKey));
        sb.append(',');
        sb.append("stvprntTtextDesc");
        sb.append('=');
        sb.append(((this.stvprntTtextDesc == null)?"<null>":this.stvprntTtextDesc));
        sb.append(',');
        sb.append("dataOrigin");
        sb.append('=');
        sb.append(((this.dataOrigin == null)?"<null>":this.dataOrigin));
        sb.append(',');
        sb.append("inProgInd");
        sb.append('=');
        sb.append(((this.inProgInd == null)?"<null>":this.inProgInd));
        sb.append(',');
        sb.append("restCode");
        sb.append('=');
        sb.append(((this.restCode == null)?"<null>":this.restCode));
        sb.append(',');
        sb.append("mandatoryRuleKey");
        sb.append('=');
        sb.append(((this.mandatoryRuleKey == null)?"<null>":this.mandatoryRuleKey));
        sb.append(',');
        sb.append("mandatoryActiveInd");
        sb.append('=');
        sb.append(((this.mandatoryActiveInd == null)?"<null>":this.mandatoryActiveInd));
        sb.append(',');
        sb.append("optionalActiveInd");
        sb.append('=');
        sb.append(((this.optionalActiveInd == null)?"<null>":this.optionalActiveInd));
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
        result = ((result* 31)+((this.stvprntLinksDesc == null)? 0 :this.stvprntLinksDesc.hashCode()));
        result = ((result* 31)+((this.inProgGrdeInd == null)? 0 :this.inProgGrdeInd.hashCode()));
        result = ((result* 31)+((this.prntCodeTtext == null)? 0 :this.prntCodeTtext.hashCode()));
        result = ((result* 31)+((this.errorCde == null)? 0 :this.errorCde.hashCode()));
        result = ((result* 31)+((this.prntCodeLinks == null)? 0 :this.prntCodeLinks.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.optionalRuleKey == null)? 0 :this.optionalRuleKey.hashCode()));
        result = ((result* 31)+((this.stvrestDesc == null)? 0 :this.stvrestDesc.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.acadHistCde == null)? 0 :this.acadHistCde.hashCode()));
        result = ((result* 31)+((this.electiveActiveInd == null)? 0 :this.electiveActiveInd.hashCode()));
        result = ((result* 31)+((this.electiveRuleKey == null)? 0 :this.electiveRuleKey.hashCode()));
        result = ((result* 31)+((this.stvprntTtextDesc == null)? 0 :this.stvprntTtextDesc.hashCode()));
        result = ((result* 31)+((this.dataOrigin == null)? 0 :this.dataOrigin.hashCode()));
        result = ((result* 31)+((this.inProgInd == null)? 0 :this.inProgInd.hashCode()));
        result = ((result* 31)+((this.restCode == null)? 0 :this.restCode.hashCode()));
        result = ((result* 31)+((this.mandatoryRuleKey == null)? 0 :this.mandatoryRuleKey.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.mandatoryActiveInd == null)? 0 :this.mandatoryActiveInd.hashCode()));
        result = ((result* 31)+((this.optionalActiveInd == null)? 0 :this.optionalActiveInd.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TermControlStructuredRegistration100GetResponse) == false) {
            return false;
        }
        TermControlStructuredRegistration100GetResponse rhs = ((TermControlStructuredRegistration100GetResponse) other);
        return ((((((((((((((((((((((this.stvprntLinksDesc == rhs.stvprntLinksDesc)||((this.stvprntLinksDesc!= null)&&this.stvprntLinksDesc.equals(rhs.stvprntLinksDesc)))&&((this.inProgGrdeInd == rhs.inProgGrdeInd)||((this.inProgGrdeInd!= null)&&this.inProgGrdeInd.equals(rhs.inProgGrdeInd))))&&((this.prntCodeTtext == rhs.prntCodeTtext)||((this.prntCodeTtext!= null)&&this.prntCodeTtext.equals(rhs.prntCodeTtext))))&&((this.errorCde == rhs.errorCde)||((this.errorCde!= null)&&this.errorCde.equals(rhs.errorCde))))&&((this.prntCodeLinks == rhs.prntCodeLinks)||((this.prntCodeLinks!= null)&&this.prntCodeLinks.equals(rhs.prntCodeLinks))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.optionalRuleKey == rhs.optionalRuleKey)||((this.optionalRuleKey!= null)&&this.optionalRuleKey.equals(rhs.optionalRuleKey))))&&((this.stvrestDesc == rhs.stvrestDesc)||((this.stvrestDesc!= null)&&this.stvrestDesc.equals(rhs.stvrestDesc))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.acadHistCde == rhs.acadHistCde)||((this.acadHistCde!= null)&&this.acadHistCde.equals(rhs.acadHistCde))))&&((this.electiveActiveInd == rhs.electiveActiveInd)||((this.electiveActiveInd!= null)&&this.electiveActiveInd.equals(rhs.electiveActiveInd))))&&((this.electiveRuleKey == rhs.electiveRuleKey)||((this.electiveRuleKey!= null)&&this.electiveRuleKey.equals(rhs.electiveRuleKey))))&&((this.stvprntTtextDesc == rhs.stvprntTtextDesc)||((this.stvprntTtextDesc!= null)&&this.stvprntTtextDesc.equals(rhs.stvprntTtextDesc))))&&((this.dataOrigin == rhs.dataOrigin)||((this.dataOrigin!= null)&&this.dataOrigin.equals(rhs.dataOrigin))))&&((this.inProgInd == rhs.inProgInd)||((this.inProgInd!= null)&&this.inProgInd.equals(rhs.inProgInd))))&&((this.restCode == rhs.restCode)||((this.restCode!= null)&&this.restCode.equals(rhs.restCode))))&&((this.mandatoryRuleKey == rhs.mandatoryRuleKey)||((this.mandatoryRuleKey!= null)&&this.mandatoryRuleKey.equals(rhs.mandatoryRuleKey))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.mandatoryActiveInd == rhs.mandatoryActiveInd)||((this.mandatoryActiveInd!= null)&&this.mandatoryActiveInd.equals(rhs.mandatoryActiveInd))))&&((this.optionalActiveInd == rhs.optionalActiveInd)||((this.optionalActiveInd!= null)&&this.optionalActiveInd.equals(rhs.optionalActiveInd))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
