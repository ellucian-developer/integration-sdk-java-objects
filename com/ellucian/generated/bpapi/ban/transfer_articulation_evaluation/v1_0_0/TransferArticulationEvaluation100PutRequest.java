
package com.ellucian.generated.bpapi.ban.transfer_articulation_evaluation.v1_0_0;

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
    "credHours",
    "criteria.instCreditsUsed",
    "criteria.jgroup",
    "criteria.levlCode",
    "criteria.termCode",
    "criteria.tcrseNumb",
    "criteria.tramSeq",
    "criteria.tgrdCode",
    "criteria.credHours",
    "criteria.grdeCodeInst",
    "jgroup",
    "criteria.gmodCodeInst",
    "id",
    "tgrdCode",
    "keyblocSbgiCode",
    "criteria.tcrseTitle",
    "keyblocProgram",
    "criteria.subjCodeInst",
    "criteria.tsubjCode",
    "criteria.crseNumbInst",
    "criteria.countGpaInd",
    "tsubjCode",
    "tcrseTitle",
    "criteria.duplicate",
    "levlCode",
    "tcrseNumb"
})
@Generated("jsonschema2pojo")
public class TransferArticulationEvaluation100PutRequest {

    /**
     * Transfer Credit Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("credHours")
    private Double credHours;
    /**
     * Equivalent Credit Hours
     * <p>
     * Lineage reference object : SHRTRTK_INST_CREDITS_USED
     * 
     */
    @JsonProperty("criteria.instCreditsUsed")
    @JsonPropertyDescription("Lineage reference object : SHRTRTK_INST_CREDITS_USED")
    private Double criteriaInstCreditsUsed;
    /**
     * Transfer Group
     * <p>
     * Lookup lineage reference object : shbtatc
     * 
     */
    @JsonProperty("criteria.jgroup")
    @JsonPropertyDescription("Lookup lineage reference object : shbtatc")
    private String criteriaJgroup;
    /**
     * Level
     * <p>
     * Lookup lineage reference object : sorbtal,stvtlvl,sorbtal
     * 
     */
    @JsonProperty("criteria.levlCode")
    @JsonPropertyDescription("Lookup lineage reference object : sorbtal,stvtlvl,sorbtal")
    private String criteriaLevlCode;
    /**
     * Term
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.termCode")
    private String criteriaTermCode;
    /**
     * Transfer Course
     * <p>
     * Lookup lineage reference object : shbtatc
     * 
     */
    @JsonProperty("criteria.tcrseNumb")
    @JsonPropertyDescription("Lookup lineage reference object : shbtatc")
    private String criteriaTcrseNumb;
    /**
     * Attendance Period
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.tramSeq")
    private String criteriaTramSeq;
    /**
     * Transfer Grade
     * <p>
     * Lookup lineage reference object : shrtgrd
     * 
     */
    @JsonProperty("criteria.tgrdCode")
    @JsonPropertyDescription("Lookup lineage reference object : shrtgrd")
    private String criteriaTgrdCode;
    /**
     * Transfer Credit Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.credHours")
    private Double criteriaCredHours;
    /**
     * Equivalent Grade
     * <p>
     * Lineage reference object : SHRTRTK_GRDE_CODE_INST
     * 
     */
    @JsonProperty("criteria.grdeCodeInst")
    @JsonPropertyDescription("Lineage reference object : SHRTRTK_GRDE_CODE_INST")
    private String criteriaGrdeCodeInst;
    /**
     * Transfer Group
     * <p>
     * Lookup lineage reference object : shbtatc
     * 
     */
    @JsonProperty("jgroup")
    @JsonPropertyDescription("Lookup lineage reference object : shbtatc")
    private String jgroup;
    /**
     * Equivalent Mode
     * <p>
     * Lineage reference object : SHRTRTK_GMOD_CODE_INST
     * 
     */
    @JsonProperty("criteria.gmodCodeInst")
    @JsonPropertyDescription("Lineage reference object : SHRTRTK_GMOD_CODE_INST")
    private String criteriaGmodCodeInst;
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
     * Transfer Grade
     * <p>
     * Lookup lineage reference object : shrtgrd
     * 
     */
    @JsonProperty("tgrdCode")
    @JsonPropertyDescription("Lookup lineage reference object : shrtgrd")
    private String tgrdCode;
    /**
     * Institution
     * <p>
     * Lineage reference object : keyblocSbgiCode
     * 
     */
    @JsonProperty("keyblocSbgiCode")
    @JsonPropertyDescription("Lineage reference object : keyblocSbgiCode")
    private Object keyblocSbgiCode;
    /**
     * Transfer Title
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.tcrseTitle")
    private String criteriaTcrseTitle;
    /**
     * Program
     * <p>
     * Lineage reference object : keyblocProgram
     * 
     */
    @JsonProperty("keyblocProgram")
    @JsonPropertyDescription("Lineage reference object : keyblocProgram")
    private Object keyblocProgram;
    /**
     * Equivalent Subject
     * <p>
     * Lineage reference object : SHRTRTK_SUBJ_CODE_INST, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("criteria.subjCodeInst")
    @JsonPropertyDescription("Lineage reference object : SHRTRTK_SUBJ_CODE_INST, Lookup lineage reference object : stvsubj")
    private String criteriaSubjCodeInst;
    /**
     * Transfer Subject
     * <p>
     * Lookup lineage reference object : shbtatc
     * 
     */
    @JsonProperty("criteria.tsubjCode")
    @JsonPropertyDescription("Lookup lineage reference object : shbtatc")
    private String criteriaTsubjCode;
    /**
     * Equivalent Course
     * <p>
     * Lineage reference object : SHRTRTK_CRSE_NUMB_INST
     * 
     */
    @JsonProperty("criteria.crseNumbInst")
    @JsonPropertyDescription("Lineage reference object : SHRTRTK_CRSE_NUMB_INST")
    private String criteriaCrseNumbInst;
    /**
     * Equivalent Count in GPA
     * <p>
     * Lineage reference object : SHRTRTK_COUNT_GPA_IND
     * 
     */
    @JsonProperty("criteria.countGpaInd")
    @JsonPropertyDescription("Lineage reference object : SHRTRTK_COUNT_GPA_IND")
    private String criteriaCountGpaInd;
    /**
     * Transfer Subject
     * <p>
     * Lookup lineage reference object : shbtatc
     * 
     */
    @JsonProperty("tsubjCode")
    @JsonPropertyDescription("Lookup lineage reference object : shbtatc")
    private String tsubjCode;
    /**
     * Transfer Title
     * <p>
     * 
     * 
     */
    @JsonProperty("tcrseTitle")
    private String tcrseTitle;
    /**
     * Transfer Duplicate
     * <p>
     * Lineage reference object : SHRTRTK_DUPLICATE
     * 
     */
    @JsonProperty("criteria.duplicate")
    @JsonPropertyDescription("Lineage reference object : SHRTRTK_DUPLICATE")
    private String criteriaDuplicate;
    /**
     * Level
     * <p>
     * Lookup lineage reference object : sorbtal,stvtlvl,sorbtal
     * 
     */
    @JsonProperty("levlCode")
    @JsonPropertyDescription("Lookup lineage reference object : sorbtal,stvtlvl,sorbtal")
    private String levlCode;
    /**
     * Transfer Course
     * <p>
     * Lookup lineage reference object : shbtatc
     * 
     */
    @JsonProperty("tcrseNumb")
    @JsonPropertyDescription("Lookup lineage reference object : shbtatc")
    private String tcrseNumb;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Transfer Credit Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("credHours")
    public Double getCredHours() {
        return credHours;
    }

    /**
     * Transfer Credit Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("credHours")
    public void setCredHours(Double credHours) {
        this.credHours = credHours;
    }

    public TransferArticulationEvaluation100PutRequest withCredHours(Double credHours) {
        this.credHours = credHours;
        return this;
    }

    /**
     * Equivalent Credit Hours
     * <p>
     * Lineage reference object : SHRTRTK_INST_CREDITS_USED
     * 
     */
    @JsonProperty("criteria.instCreditsUsed")
    public Double getCriteriaInstCreditsUsed() {
        return criteriaInstCreditsUsed;
    }

    /**
     * Equivalent Credit Hours
     * <p>
     * Lineage reference object : SHRTRTK_INST_CREDITS_USED
     * 
     */
    @JsonProperty("criteria.instCreditsUsed")
    public void setCriteriaInstCreditsUsed(Double criteriaInstCreditsUsed) {
        this.criteriaInstCreditsUsed = criteriaInstCreditsUsed;
    }

    public TransferArticulationEvaluation100PutRequest withCriteriaInstCreditsUsed(Double criteriaInstCreditsUsed) {
        this.criteriaInstCreditsUsed = criteriaInstCreditsUsed;
        return this;
    }

    /**
     * Transfer Group
     * <p>
     * Lookup lineage reference object : shbtatc
     * 
     */
    @JsonProperty("criteria.jgroup")
    public String getCriteriaJgroup() {
        return criteriaJgroup;
    }

    /**
     * Transfer Group
     * <p>
     * Lookup lineage reference object : shbtatc
     * 
     */
    @JsonProperty("criteria.jgroup")
    public void setCriteriaJgroup(String criteriaJgroup) {
        this.criteriaJgroup = criteriaJgroup;
    }

    public TransferArticulationEvaluation100PutRequest withCriteriaJgroup(String criteriaJgroup) {
        this.criteriaJgroup = criteriaJgroup;
        return this;
    }

    /**
     * Level
     * <p>
     * Lookup lineage reference object : sorbtal,stvtlvl,sorbtal
     * 
     */
    @JsonProperty("criteria.levlCode")
    public String getCriteriaLevlCode() {
        return criteriaLevlCode;
    }

    /**
     * Level
     * <p>
     * Lookup lineage reference object : sorbtal,stvtlvl,sorbtal
     * 
     */
    @JsonProperty("criteria.levlCode")
    public void setCriteriaLevlCode(String criteriaLevlCode) {
        this.criteriaLevlCode = criteriaLevlCode;
    }

    public TransferArticulationEvaluation100PutRequest withCriteriaLevlCode(String criteriaLevlCode) {
        this.criteriaLevlCode = criteriaLevlCode;
        return this;
    }

    /**
     * Term
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.termCode")
    public String getCriteriaTermCode() {
        return criteriaTermCode;
    }

    /**
     * Term
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.termCode")
    public void setCriteriaTermCode(String criteriaTermCode) {
        this.criteriaTermCode = criteriaTermCode;
    }

    public TransferArticulationEvaluation100PutRequest withCriteriaTermCode(String criteriaTermCode) {
        this.criteriaTermCode = criteriaTermCode;
        return this;
    }

    /**
     * Transfer Course
     * <p>
     * Lookup lineage reference object : shbtatc
     * 
     */
    @JsonProperty("criteria.tcrseNumb")
    public String getCriteriaTcrseNumb() {
        return criteriaTcrseNumb;
    }

    /**
     * Transfer Course
     * <p>
     * Lookup lineage reference object : shbtatc
     * 
     */
    @JsonProperty("criteria.tcrseNumb")
    public void setCriteriaTcrseNumb(String criteriaTcrseNumb) {
        this.criteriaTcrseNumb = criteriaTcrseNumb;
    }

    public TransferArticulationEvaluation100PutRequest withCriteriaTcrseNumb(String criteriaTcrseNumb) {
        this.criteriaTcrseNumb = criteriaTcrseNumb;
        return this;
    }

    /**
     * Attendance Period
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.tramSeq")
    public String getCriteriaTramSeq() {
        return criteriaTramSeq;
    }

    /**
     * Attendance Period
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.tramSeq")
    public void setCriteriaTramSeq(String criteriaTramSeq) {
        this.criteriaTramSeq = criteriaTramSeq;
    }

    public TransferArticulationEvaluation100PutRequest withCriteriaTramSeq(String criteriaTramSeq) {
        this.criteriaTramSeq = criteriaTramSeq;
        return this;
    }

    /**
     * Transfer Grade
     * <p>
     * Lookup lineage reference object : shrtgrd
     * 
     */
    @JsonProperty("criteria.tgrdCode")
    public String getCriteriaTgrdCode() {
        return criteriaTgrdCode;
    }

    /**
     * Transfer Grade
     * <p>
     * Lookup lineage reference object : shrtgrd
     * 
     */
    @JsonProperty("criteria.tgrdCode")
    public void setCriteriaTgrdCode(String criteriaTgrdCode) {
        this.criteriaTgrdCode = criteriaTgrdCode;
    }

    public TransferArticulationEvaluation100PutRequest withCriteriaTgrdCode(String criteriaTgrdCode) {
        this.criteriaTgrdCode = criteriaTgrdCode;
        return this;
    }

    /**
     * Transfer Credit Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.credHours")
    public Double getCriteriaCredHours() {
        return criteriaCredHours;
    }

    /**
     * Transfer Credit Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.credHours")
    public void setCriteriaCredHours(Double criteriaCredHours) {
        this.criteriaCredHours = criteriaCredHours;
    }

    public TransferArticulationEvaluation100PutRequest withCriteriaCredHours(Double criteriaCredHours) {
        this.criteriaCredHours = criteriaCredHours;
        return this;
    }

    /**
     * Equivalent Grade
     * <p>
     * Lineage reference object : SHRTRTK_GRDE_CODE_INST
     * 
     */
    @JsonProperty("criteria.grdeCodeInst")
    public String getCriteriaGrdeCodeInst() {
        return criteriaGrdeCodeInst;
    }

    /**
     * Equivalent Grade
     * <p>
     * Lineage reference object : SHRTRTK_GRDE_CODE_INST
     * 
     */
    @JsonProperty("criteria.grdeCodeInst")
    public void setCriteriaGrdeCodeInst(String criteriaGrdeCodeInst) {
        this.criteriaGrdeCodeInst = criteriaGrdeCodeInst;
    }

    public TransferArticulationEvaluation100PutRequest withCriteriaGrdeCodeInst(String criteriaGrdeCodeInst) {
        this.criteriaGrdeCodeInst = criteriaGrdeCodeInst;
        return this;
    }

    /**
     * Transfer Group
     * <p>
     * Lookup lineage reference object : shbtatc
     * 
     */
    @JsonProperty("jgroup")
    public String getJgroup() {
        return jgroup;
    }

    /**
     * Transfer Group
     * <p>
     * Lookup lineage reference object : shbtatc
     * 
     */
    @JsonProperty("jgroup")
    public void setJgroup(String jgroup) {
        this.jgroup = jgroup;
    }

    public TransferArticulationEvaluation100PutRequest withJgroup(String jgroup) {
        this.jgroup = jgroup;
        return this;
    }

    /**
     * Equivalent Mode
     * <p>
     * Lineage reference object : SHRTRTK_GMOD_CODE_INST
     * 
     */
    @JsonProperty("criteria.gmodCodeInst")
    public String getCriteriaGmodCodeInst() {
        return criteriaGmodCodeInst;
    }

    /**
     * Equivalent Mode
     * <p>
     * Lineage reference object : SHRTRTK_GMOD_CODE_INST
     * 
     */
    @JsonProperty("criteria.gmodCodeInst")
    public void setCriteriaGmodCodeInst(String criteriaGmodCodeInst) {
        this.criteriaGmodCodeInst = criteriaGmodCodeInst;
    }

    public TransferArticulationEvaluation100PutRequest withCriteriaGmodCodeInst(String criteriaGmodCodeInst) {
        this.criteriaGmodCodeInst = criteriaGmodCodeInst;
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

    public TransferArticulationEvaluation100PutRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Transfer Grade
     * <p>
     * Lookup lineage reference object : shrtgrd
     * 
     */
    @JsonProperty("tgrdCode")
    public String getTgrdCode() {
        return tgrdCode;
    }

    /**
     * Transfer Grade
     * <p>
     * Lookup lineage reference object : shrtgrd
     * 
     */
    @JsonProperty("tgrdCode")
    public void setTgrdCode(String tgrdCode) {
        this.tgrdCode = tgrdCode;
    }

    public TransferArticulationEvaluation100PutRequest withTgrdCode(String tgrdCode) {
        this.tgrdCode = tgrdCode;
        return this;
    }

    /**
     * Institution
     * <p>
     * Lineage reference object : keyblocSbgiCode
     * 
     */
    @JsonProperty("keyblocSbgiCode")
    public Object getKeyblocSbgiCode() {
        return keyblocSbgiCode;
    }

    /**
     * Institution
     * <p>
     * Lineage reference object : keyblocSbgiCode
     * 
     */
    @JsonProperty("keyblocSbgiCode")
    public void setKeyblocSbgiCode(Object keyblocSbgiCode) {
        this.keyblocSbgiCode = keyblocSbgiCode;
    }

    public TransferArticulationEvaluation100PutRequest withKeyblocSbgiCode(Object keyblocSbgiCode) {
        this.keyblocSbgiCode = keyblocSbgiCode;
        return this;
    }

    /**
     * Transfer Title
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.tcrseTitle")
    public String getCriteriaTcrseTitle() {
        return criteriaTcrseTitle;
    }

    /**
     * Transfer Title
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.tcrseTitle")
    public void setCriteriaTcrseTitle(String criteriaTcrseTitle) {
        this.criteriaTcrseTitle = criteriaTcrseTitle;
    }

    public TransferArticulationEvaluation100PutRequest withCriteriaTcrseTitle(String criteriaTcrseTitle) {
        this.criteriaTcrseTitle = criteriaTcrseTitle;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : keyblocProgram
     * 
     */
    @JsonProperty("keyblocProgram")
    public Object getKeyblocProgram() {
        return keyblocProgram;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : keyblocProgram
     * 
     */
    @JsonProperty("keyblocProgram")
    public void setKeyblocProgram(Object keyblocProgram) {
        this.keyblocProgram = keyblocProgram;
    }

    public TransferArticulationEvaluation100PutRequest withKeyblocProgram(Object keyblocProgram) {
        this.keyblocProgram = keyblocProgram;
        return this;
    }

    /**
     * Equivalent Subject
     * <p>
     * Lineage reference object : SHRTRTK_SUBJ_CODE_INST, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("criteria.subjCodeInst")
    public String getCriteriaSubjCodeInst() {
        return criteriaSubjCodeInst;
    }

    /**
     * Equivalent Subject
     * <p>
     * Lineage reference object : SHRTRTK_SUBJ_CODE_INST, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("criteria.subjCodeInst")
    public void setCriteriaSubjCodeInst(String criteriaSubjCodeInst) {
        this.criteriaSubjCodeInst = criteriaSubjCodeInst;
    }

    public TransferArticulationEvaluation100PutRequest withCriteriaSubjCodeInst(String criteriaSubjCodeInst) {
        this.criteriaSubjCodeInst = criteriaSubjCodeInst;
        return this;
    }

    /**
     * Transfer Subject
     * <p>
     * Lookup lineage reference object : shbtatc
     * 
     */
    @JsonProperty("criteria.tsubjCode")
    public String getCriteriaTsubjCode() {
        return criteriaTsubjCode;
    }

    /**
     * Transfer Subject
     * <p>
     * Lookup lineage reference object : shbtatc
     * 
     */
    @JsonProperty("criteria.tsubjCode")
    public void setCriteriaTsubjCode(String criteriaTsubjCode) {
        this.criteriaTsubjCode = criteriaTsubjCode;
    }

    public TransferArticulationEvaluation100PutRequest withCriteriaTsubjCode(String criteriaTsubjCode) {
        this.criteriaTsubjCode = criteriaTsubjCode;
        return this;
    }

    /**
     * Equivalent Course
     * <p>
     * Lineage reference object : SHRTRTK_CRSE_NUMB_INST
     * 
     */
    @JsonProperty("criteria.crseNumbInst")
    public String getCriteriaCrseNumbInst() {
        return criteriaCrseNumbInst;
    }

    /**
     * Equivalent Course
     * <p>
     * Lineage reference object : SHRTRTK_CRSE_NUMB_INST
     * 
     */
    @JsonProperty("criteria.crseNumbInst")
    public void setCriteriaCrseNumbInst(String criteriaCrseNumbInst) {
        this.criteriaCrseNumbInst = criteriaCrseNumbInst;
    }

    public TransferArticulationEvaluation100PutRequest withCriteriaCrseNumbInst(String criteriaCrseNumbInst) {
        this.criteriaCrseNumbInst = criteriaCrseNumbInst;
        return this;
    }

    /**
     * Equivalent Count in GPA
     * <p>
     * Lineage reference object : SHRTRTK_COUNT_GPA_IND
     * 
     */
    @JsonProperty("criteria.countGpaInd")
    public String getCriteriaCountGpaInd() {
        return criteriaCountGpaInd;
    }

    /**
     * Equivalent Count in GPA
     * <p>
     * Lineage reference object : SHRTRTK_COUNT_GPA_IND
     * 
     */
    @JsonProperty("criteria.countGpaInd")
    public void setCriteriaCountGpaInd(String criteriaCountGpaInd) {
        this.criteriaCountGpaInd = criteriaCountGpaInd;
    }

    public TransferArticulationEvaluation100PutRequest withCriteriaCountGpaInd(String criteriaCountGpaInd) {
        this.criteriaCountGpaInd = criteriaCountGpaInd;
        return this;
    }

    /**
     * Transfer Subject
     * <p>
     * Lookup lineage reference object : shbtatc
     * 
     */
    @JsonProperty("tsubjCode")
    public String getTsubjCode() {
        return tsubjCode;
    }

    /**
     * Transfer Subject
     * <p>
     * Lookup lineage reference object : shbtatc
     * 
     */
    @JsonProperty("tsubjCode")
    public void setTsubjCode(String tsubjCode) {
        this.tsubjCode = tsubjCode;
    }

    public TransferArticulationEvaluation100PutRequest withTsubjCode(String tsubjCode) {
        this.tsubjCode = tsubjCode;
        return this;
    }

    /**
     * Transfer Title
     * <p>
     * 
     * 
     */
    @JsonProperty("tcrseTitle")
    public String getTcrseTitle() {
        return tcrseTitle;
    }

    /**
     * Transfer Title
     * <p>
     * 
     * 
     */
    @JsonProperty("tcrseTitle")
    public void setTcrseTitle(String tcrseTitle) {
        this.tcrseTitle = tcrseTitle;
    }

    public TransferArticulationEvaluation100PutRequest withTcrseTitle(String tcrseTitle) {
        this.tcrseTitle = tcrseTitle;
        return this;
    }

    /**
     * Transfer Duplicate
     * <p>
     * Lineage reference object : SHRTRTK_DUPLICATE
     * 
     */
    @JsonProperty("criteria.duplicate")
    public String getCriteriaDuplicate() {
        return criteriaDuplicate;
    }

    /**
     * Transfer Duplicate
     * <p>
     * Lineage reference object : SHRTRTK_DUPLICATE
     * 
     */
    @JsonProperty("criteria.duplicate")
    public void setCriteriaDuplicate(String criteriaDuplicate) {
        this.criteriaDuplicate = criteriaDuplicate;
    }

    public TransferArticulationEvaluation100PutRequest withCriteriaDuplicate(String criteriaDuplicate) {
        this.criteriaDuplicate = criteriaDuplicate;
        return this;
    }

    /**
     * Level
     * <p>
     * Lookup lineage reference object : sorbtal,stvtlvl,sorbtal
     * 
     */
    @JsonProperty("levlCode")
    public String getLevlCode() {
        return levlCode;
    }

    /**
     * Level
     * <p>
     * Lookup lineage reference object : sorbtal,stvtlvl,sorbtal
     * 
     */
    @JsonProperty("levlCode")
    public void setLevlCode(String levlCode) {
        this.levlCode = levlCode;
    }

    public TransferArticulationEvaluation100PutRequest withLevlCode(String levlCode) {
        this.levlCode = levlCode;
        return this;
    }

    /**
     * Transfer Course
     * <p>
     * Lookup lineage reference object : shbtatc
     * 
     */
    @JsonProperty("tcrseNumb")
    public String getTcrseNumb() {
        return tcrseNumb;
    }

    /**
     * Transfer Course
     * <p>
     * Lookup lineage reference object : shbtatc
     * 
     */
    @JsonProperty("tcrseNumb")
    public void setTcrseNumb(String tcrseNumb) {
        this.tcrseNumb = tcrseNumb;
    }

    public TransferArticulationEvaluation100PutRequest withTcrseNumb(String tcrseNumb) {
        this.tcrseNumb = tcrseNumb;
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

    public TransferArticulationEvaluation100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TransferArticulationEvaluation100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("credHours");
        sb.append('=');
        sb.append(((this.credHours == null)?"<null>":this.credHours));
        sb.append(',');
        sb.append("criteriaInstCreditsUsed");
        sb.append('=');
        sb.append(((this.criteriaInstCreditsUsed == null)?"<null>":this.criteriaInstCreditsUsed));
        sb.append(',');
        sb.append("criteriaJgroup");
        sb.append('=');
        sb.append(((this.criteriaJgroup == null)?"<null>":this.criteriaJgroup));
        sb.append(',');
        sb.append("criteriaLevlCode");
        sb.append('=');
        sb.append(((this.criteriaLevlCode == null)?"<null>":this.criteriaLevlCode));
        sb.append(',');
        sb.append("criteriaTermCode");
        sb.append('=');
        sb.append(((this.criteriaTermCode == null)?"<null>":this.criteriaTermCode));
        sb.append(',');
        sb.append("criteriaTcrseNumb");
        sb.append('=');
        sb.append(((this.criteriaTcrseNumb == null)?"<null>":this.criteriaTcrseNumb));
        sb.append(',');
        sb.append("criteriaTramSeq");
        sb.append('=');
        sb.append(((this.criteriaTramSeq == null)?"<null>":this.criteriaTramSeq));
        sb.append(',');
        sb.append("criteriaTgrdCode");
        sb.append('=');
        sb.append(((this.criteriaTgrdCode == null)?"<null>":this.criteriaTgrdCode));
        sb.append(',');
        sb.append("criteriaCredHours");
        sb.append('=');
        sb.append(((this.criteriaCredHours == null)?"<null>":this.criteriaCredHours));
        sb.append(',');
        sb.append("criteriaGrdeCodeInst");
        sb.append('=');
        sb.append(((this.criteriaGrdeCodeInst == null)?"<null>":this.criteriaGrdeCodeInst));
        sb.append(',');
        sb.append("jgroup");
        sb.append('=');
        sb.append(((this.jgroup == null)?"<null>":this.jgroup));
        sb.append(',');
        sb.append("criteriaGmodCodeInst");
        sb.append('=');
        sb.append(((this.criteriaGmodCodeInst == null)?"<null>":this.criteriaGmodCodeInst));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("tgrdCode");
        sb.append('=');
        sb.append(((this.tgrdCode == null)?"<null>":this.tgrdCode));
        sb.append(',');
        sb.append("keyblocSbgiCode");
        sb.append('=');
        sb.append(((this.keyblocSbgiCode == null)?"<null>":this.keyblocSbgiCode));
        sb.append(',');
        sb.append("criteriaTcrseTitle");
        sb.append('=');
        sb.append(((this.criteriaTcrseTitle == null)?"<null>":this.criteriaTcrseTitle));
        sb.append(',');
        sb.append("keyblocProgram");
        sb.append('=');
        sb.append(((this.keyblocProgram == null)?"<null>":this.keyblocProgram));
        sb.append(',');
        sb.append("criteriaSubjCodeInst");
        sb.append('=');
        sb.append(((this.criteriaSubjCodeInst == null)?"<null>":this.criteriaSubjCodeInst));
        sb.append(',');
        sb.append("criteriaTsubjCode");
        sb.append('=');
        sb.append(((this.criteriaTsubjCode == null)?"<null>":this.criteriaTsubjCode));
        sb.append(',');
        sb.append("criteriaCrseNumbInst");
        sb.append('=');
        sb.append(((this.criteriaCrseNumbInst == null)?"<null>":this.criteriaCrseNumbInst));
        sb.append(',');
        sb.append("criteriaCountGpaInd");
        sb.append('=');
        sb.append(((this.criteriaCountGpaInd == null)?"<null>":this.criteriaCountGpaInd));
        sb.append(',');
        sb.append("tsubjCode");
        sb.append('=');
        sb.append(((this.tsubjCode == null)?"<null>":this.tsubjCode));
        sb.append(',');
        sb.append("tcrseTitle");
        sb.append('=');
        sb.append(((this.tcrseTitle == null)?"<null>":this.tcrseTitle));
        sb.append(',');
        sb.append("criteriaDuplicate");
        sb.append('=');
        sb.append(((this.criteriaDuplicate == null)?"<null>":this.criteriaDuplicate));
        sb.append(',');
        sb.append("levlCode");
        sb.append('=');
        sb.append(((this.levlCode == null)?"<null>":this.levlCode));
        sb.append(',');
        sb.append("tcrseNumb");
        sb.append('=');
        sb.append(((this.tcrseNumb == null)?"<null>":this.tcrseNumb));
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
        result = ((result* 31)+((this.credHours == null)? 0 :this.credHours.hashCode()));
        result = ((result* 31)+((this.criteriaTcrseNumb == null)? 0 :this.criteriaTcrseNumb.hashCode()));
        result = ((result* 31)+((this.criteriaDuplicate == null)? 0 :this.criteriaDuplicate.hashCode()));
        result = ((result* 31)+((this.criteriaSubjCodeInst == null)? 0 :this.criteriaSubjCodeInst.hashCode()));
        result = ((result* 31)+((this.criteriaGrdeCodeInst == null)? 0 :this.criteriaGrdeCodeInst.hashCode()));
        result = ((result* 31)+((this.jgroup == null)? 0 :this.jgroup.hashCode()));
        result = ((result* 31)+((this.criteriaGmodCodeInst == null)? 0 :this.criteriaGmodCodeInst.hashCode()));
        result = ((result* 31)+((this.criteriaJgroup == null)? 0 :this.criteriaJgroup.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.criteriaTsubjCode == null)? 0 :this.criteriaTsubjCode.hashCode()));
        result = ((result* 31)+((this.tgrdCode == null)? 0 :this.tgrdCode.hashCode()));
        result = ((result* 31)+((this.keyblocSbgiCode == null)? 0 :this.keyblocSbgiCode.hashCode()));
        result = ((result* 31)+((this.criteriaCredHours == null)? 0 :this.criteriaCredHours.hashCode()));
        result = ((result* 31)+((this.criteriaTermCode == null)? 0 :this.criteriaTermCode.hashCode()));
        result = ((result* 31)+((this.keyblocProgram == null)? 0 :this.keyblocProgram.hashCode()));
        result = ((result* 31)+((this.criteriaTgrdCode == null)? 0 :this.criteriaTgrdCode.hashCode()));
        result = ((result* 31)+((this.criteriaCrseNumbInst == null)? 0 :this.criteriaCrseNumbInst.hashCode()));
        result = ((result* 31)+((this.criteriaLevlCode == null)? 0 :this.criteriaLevlCode.hashCode()));
        result = ((result* 31)+((this.criteriaTcrseTitle == null)? 0 :this.criteriaTcrseTitle.hashCode()));
        result = ((result* 31)+((this.tsubjCode == null)? 0 :this.tsubjCode.hashCode()));
        result = ((result* 31)+((this.tcrseTitle == null)? 0 :this.tcrseTitle.hashCode()));
        result = ((result* 31)+((this.criteriaCountGpaInd == null)? 0 :this.criteriaCountGpaInd.hashCode()));
        result = ((result* 31)+((this.criteriaInstCreditsUsed == null)? 0 :this.criteriaInstCreditsUsed.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaTramSeq == null)? 0 :this.criteriaTramSeq.hashCode()));
        result = ((result* 31)+((this.levlCode == null)? 0 :this.levlCode.hashCode()));
        result = ((result* 31)+((this.tcrseNumb == null)? 0 :this.tcrseNumb.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TransferArticulationEvaluation100PutRequest) == false) {
            return false;
        }
        TransferArticulationEvaluation100PutRequest rhs = ((TransferArticulationEvaluation100PutRequest) other);
        return ((((((((((((((((((((((((((((this.credHours == rhs.credHours)||((this.credHours!= null)&&this.credHours.equals(rhs.credHours)))&&((this.criteriaTcrseNumb == rhs.criteriaTcrseNumb)||((this.criteriaTcrseNumb!= null)&&this.criteriaTcrseNumb.equals(rhs.criteriaTcrseNumb))))&&((this.criteriaDuplicate == rhs.criteriaDuplicate)||((this.criteriaDuplicate!= null)&&this.criteriaDuplicate.equals(rhs.criteriaDuplicate))))&&((this.criteriaSubjCodeInst == rhs.criteriaSubjCodeInst)||((this.criteriaSubjCodeInst!= null)&&this.criteriaSubjCodeInst.equals(rhs.criteriaSubjCodeInst))))&&((this.criteriaGrdeCodeInst == rhs.criteriaGrdeCodeInst)||((this.criteriaGrdeCodeInst!= null)&&this.criteriaGrdeCodeInst.equals(rhs.criteriaGrdeCodeInst))))&&((this.jgroup == rhs.jgroup)||((this.jgroup!= null)&&this.jgroup.equals(rhs.jgroup))))&&((this.criteriaGmodCodeInst == rhs.criteriaGmodCodeInst)||((this.criteriaGmodCodeInst!= null)&&this.criteriaGmodCodeInst.equals(rhs.criteriaGmodCodeInst))))&&((this.criteriaJgroup == rhs.criteriaJgroup)||((this.criteriaJgroup!= null)&&this.criteriaJgroup.equals(rhs.criteriaJgroup))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.criteriaTsubjCode == rhs.criteriaTsubjCode)||((this.criteriaTsubjCode!= null)&&this.criteriaTsubjCode.equals(rhs.criteriaTsubjCode))))&&((this.tgrdCode == rhs.tgrdCode)||((this.tgrdCode!= null)&&this.tgrdCode.equals(rhs.tgrdCode))))&&((this.keyblocSbgiCode == rhs.keyblocSbgiCode)||((this.keyblocSbgiCode!= null)&&this.keyblocSbgiCode.equals(rhs.keyblocSbgiCode))))&&((this.criteriaCredHours == rhs.criteriaCredHours)||((this.criteriaCredHours!= null)&&this.criteriaCredHours.equals(rhs.criteriaCredHours))))&&((this.criteriaTermCode == rhs.criteriaTermCode)||((this.criteriaTermCode!= null)&&this.criteriaTermCode.equals(rhs.criteriaTermCode))))&&((this.keyblocProgram == rhs.keyblocProgram)||((this.keyblocProgram!= null)&&this.keyblocProgram.equals(rhs.keyblocProgram))))&&((this.criteriaTgrdCode == rhs.criteriaTgrdCode)||((this.criteriaTgrdCode!= null)&&this.criteriaTgrdCode.equals(rhs.criteriaTgrdCode))))&&((this.criteriaCrseNumbInst == rhs.criteriaCrseNumbInst)||((this.criteriaCrseNumbInst!= null)&&this.criteriaCrseNumbInst.equals(rhs.criteriaCrseNumbInst))))&&((this.criteriaLevlCode == rhs.criteriaLevlCode)||((this.criteriaLevlCode!= null)&&this.criteriaLevlCode.equals(rhs.criteriaLevlCode))))&&((this.criteriaTcrseTitle == rhs.criteriaTcrseTitle)||((this.criteriaTcrseTitle!= null)&&this.criteriaTcrseTitle.equals(rhs.criteriaTcrseTitle))))&&((this.tsubjCode == rhs.tsubjCode)||((this.tsubjCode!= null)&&this.tsubjCode.equals(rhs.tsubjCode))))&&((this.tcrseTitle == rhs.tcrseTitle)||((this.tcrseTitle!= null)&&this.tcrseTitle.equals(rhs.tcrseTitle))))&&((this.criteriaCountGpaInd == rhs.criteriaCountGpaInd)||((this.criteriaCountGpaInd!= null)&&this.criteriaCountGpaInd.equals(rhs.criteriaCountGpaInd))))&&((this.criteriaInstCreditsUsed == rhs.criteriaInstCreditsUsed)||((this.criteriaInstCreditsUsed!= null)&&this.criteriaInstCreditsUsed.equals(rhs.criteriaInstCreditsUsed))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaTramSeq == rhs.criteriaTramSeq)||((this.criteriaTramSeq!= null)&&this.criteriaTramSeq.equals(rhs.criteriaTramSeq))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))))&&((this.tcrseNumb == rhs.tcrseNumb)||((this.tcrseNumb!= null)&&this.tcrseNumb.equals(rhs.tcrseNumb))));
    }

}
