
package com.ellucian.generated.bpapi.ban.curriculum_rules_module_control.v1_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "termCode",
    "currRule",
    "program",
    "levlCode",
    "campCode",
    "termCodeInit",
    "collCode",
    "degcCode",
    "primRollInd",
    "secdRollInd",
    "lockInd",
    "studyPathInd"
})
@Generated("jsonschema2pojo")
public class CurriculumRulesModuleControl100QapiPost {

    @JsonProperty("termCode")
    private String termCode;
    @JsonProperty("currRule")
    private String currRule;
    @JsonProperty("program")
    private String program;
    @JsonProperty("levlCode")
    private String levlCode;
    @JsonProperty("campCode")
    private String campCode;
    @JsonProperty("termCodeInit")
    private String termCodeInit;
    @JsonProperty("collCode")
    private String collCode;
    @JsonProperty("degcCode")
    private String degcCode;
    @JsonProperty("primRollInd")
    private String primRollInd;
    @JsonProperty("secdRollInd")
    private String secdRollInd;
    @JsonProperty("lockInd")
    private String lockInd;
    @JsonProperty("studyPathInd")
    private String studyPathInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public CurriculumRulesModuleControl100QapiPost withTermCode(String termCode) {
        this.termCode = termCode;
        return this;
    }

    @JsonProperty("currRule")
    public String getCurrRule() {
        return currRule;
    }

    @JsonProperty("currRule")
    public void setCurrRule(String currRule) {
        this.currRule = currRule;
    }

    public CurriculumRulesModuleControl100QapiPost withCurrRule(String currRule) {
        this.currRule = currRule;
        return this;
    }

    @JsonProperty("program")
    public String getProgram() {
        return program;
    }

    @JsonProperty("program")
    public void setProgram(String program) {
        this.program = program;
    }

    public CurriculumRulesModuleControl100QapiPost withProgram(String program) {
        this.program = program;
        return this;
    }

    @JsonProperty("levlCode")
    public String getLevlCode() {
        return levlCode;
    }

    @JsonProperty("levlCode")
    public void setLevlCode(String levlCode) {
        this.levlCode = levlCode;
    }

    public CurriculumRulesModuleControl100QapiPost withLevlCode(String levlCode) {
        this.levlCode = levlCode;
        return this;
    }

    @JsonProperty("campCode")
    public String getCampCode() {
        return campCode;
    }

    @JsonProperty("campCode")
    public void setCampCode(String campCode) {
        this.campCode = campCode;
    }

    public CurriculumRulesModuleControl100QapiPost withCampCode(String campCode) {
        this.campCode = campCode;
        return this;
    }

    @JsonProperty("termCodeInit")
    public String getTermCodeInit() {
        return termCodeInit;
    }

    @JsonProperty("termCodeInit")
    public void setTermCodeInit(String termCodeInit) {
        this.termCodeInit = termCodeInit;
    }

    public CurriculumRulesModuleControl100QapiPost withTermCodeInit(String termCodeInit) {
        this.termCodeInit = termCodeInit;
        return this;
    }

    @JsonProperty("collCode")
    public String getCollCode() {
        return collCode;
    }

    @JsonProperty("collCode")
    public void setCollCode(String collCode) {
        this.collCode = collCode;
    }

    public CurriculumRulesModuleControl100QapiPost withCollCode(String collCode) {
        this.collCode = collCode;
        return this;
    }

    @JsonProperty("degcCode")
    public String getDegcCode() {
        return degcCode;
    }

    @JsonProperty("degcCode")
    public void setDegcCode(String degcCode) {
        this.degcCode = degcCode;
    }

    public CurriculumRulesModuleControl100QapiPost withDegcCode(String degcCode) {
        this.degcCode = degcCode;
        return this;
    }

    @JsonProperty("primRollInd")
    public String getPrimRollInd() {
        return primRollInd;
    }

    @JsonProperty("primRollInd")
    public void setPrimRollInd(String primRollInd) {
        this.primRollInd = primRollInd;
    }

    public CurriculumRulesModuleControl100QapiPost withPrimRollInd(String primRollInd) {
        this.primRollInd = primRollInd;
        return this;
    }

    @JsonProperty("secdRollInd")
    public String getSecdRollInd() {
        return secdRollInd;
    }

    @JsonProperty("secdRollInd")
    public void setSecdRollInd(String secdRollInd) {
        this.secdRollInd = secdRollInd;
    }

    public CurriculumRulesModuleControl100QapiPost withSecdRollInd(String secdRollInd) {
        this.secdRollInd = secdRollInd;
        return this;
    }

    @JsonProperty("lockInd")
    public String getLockInd() {
        return lockInd;
    }

    @JsonProperty("lockInd")
    public void setLockInd(String lockInd) {
        this.lockInd = lockInd;
    }

    public CurriculumRulesModuleControl100QapiPost withLockInd(String lockInd) {
        this.lockInd = lockInd;
        return this;
    }

    @JsonProperty("studyPathInd")
    public String getStudyPathInd() {
        return studyPathInd;
    }

    @JsonProperty("studyPathInd")
    public void setStudyPathInd(String studyPathInd) {
        this.studyPathInd = studyPathInd;
    }

    public CurriculumRulesModuleControl100QapiPost withStudyPathInd(String studyPathInd) {
        this.studyPathInd = studyPathInd;
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

    public CurriculumRulesModuleControl100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CurriculumRulesModuleControl100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
        sb.append(',');
        sb.append("currRule");
        sb.append('=');
        sb.append(((this.currRule == null)?"<null>":this.currRule));
        sb.append(',');
        sb.append("program");
        sb.append('=');
        sb.append(((this.program == null)?"<null>":this.program));
        sb.append(',');
        sb.append("levlCode");
        sb.append('=');
        sb.append(((this.levlCode == null)?"<null>":this.levlCode));
        sb.append(',');
        sb.append("campCode");
        sb.append('=');
        sb.append(((this.campCode == null)?"<null>":this.campCode));
        sb.append(',');
        sb.append("termCodeInit");
        sb.append('=');
        sb.append(((this.termCodeInit == null)?"<null>":this.termCodeInit));
        sb.append(',');
        sb.append("collCode");
        sb.append('=');
        sb.append(((this.collCode == null)?"<null>":this.collCode));
        sb.append(',');
        sb.append("degcCode");
        sb.append('=');
        sb.append(((this.degcCode == null)?"<null>":this.degcCode));
        sb.append(',');
        sb.append("primRollInd");
        sb.append('=');
        sb.append(((this.primRollInd == null)?"<null>":this.primRollInd));
        sb.append(',');
        sb.append("secdRollInd");
        sb.append('=');
        sb.append(((this.secdRollInd == null)?"<null>":this.secdRollInd));
        sb.append(',');
        sb.append("lockInd");
        sb.append('=');
        sb.append(((this.lockInd == null)?"<null>":this.lockInd));
        sb.append(',');
        sb.append("studyPathInd");
        sb.append('=');
        sb.append(((this.studyPathInd == null)?"<null>":this.studyPathInd));
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
        result = ((result* 31)+((this.secdRollInd == null)? 0 :this.secdRollInd.hashCode()));
        result = ((result* 31)+((this.termCodeInit == null)? 0 :this.termCodeInit.hashCode()));
        result = ((result* 31)+((this.studyPathInd == null)? 0 :this.studyPathInd.hashCode()));
        result = ((result* 31)+((this.program == null)? 0 :this.program.hashCode()));
        result = ((result* 31)+((this.degcCode == null)? 0 :this.degcCode.hashCode()));
        result = ((result* 31)+((this.currRule == null)? 0 :this.currRule.hashCode()));
        result = ((result* 31)+((this.campCode == null)? 0 :this.campCode.hashCode()));
        result = ((result* 31)+((this.lockInd == null)? 0 :this.lockInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.collCode == null)? 0 :this.collCode.hashCode()));
        result = ((result* 31)+((this.primRollInd == null)? 0 :this.primRollInd.hashCode()));
        result = ((result* 31)+((this.levlCode == null)? 0 :this.levlCode.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CurriculumRulesModuleControl100QapiPost) == false) {
            return false;
        }
        CurriculumRulesModuleControl100QapiPost rhs = ((CurriculumRulesModuleControl100QapiPost) other);
        return ((((((((((((((this.secdRollInd == rhs.secdRollInd)||((this.secdRollInd!= null)&&this.secdRollInd.equals(rhs.secdRollInd)))&&((this.termCodeInit == rhs.termCodeInit)||((this.termCodeInit!= null)&&this.termCodeInit.equals(rhs.termCodeInit))))&&((this.studyPathInd == rhs.studyPathInd)||((this.studyPathInd!= null)&&this.studyPathInd.equals(rhs.studyPathInd))))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.degcCode == rhs.degcCode)||((this.degcCode!= null)&&this.degcCode.equals(rhs.degcCode))))&&((this.currRule == rhs.currRule)||((this.currRule!= null)&&this.currRule.equals(rhs.currRule))))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.lockInd == rhs.lockInd)||((this.lockInd!= null)&&this.lockInd.equals(rhs.lockInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.primRollInd == rhs.primRollInd)||((this.primRollInd!= null)&&this.primRollInd.equals(rhs.primRollInd))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
