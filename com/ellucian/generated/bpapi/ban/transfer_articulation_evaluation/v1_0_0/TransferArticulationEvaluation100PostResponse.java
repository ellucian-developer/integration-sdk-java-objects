
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
    "tgrdCode",
    "repeatSys",
    "subjCodeInst",
    "crseTitle",
    "grdeCodeInst",
    "crseNumbInst",
    "gmodCodeInst",
    "duplicate",
    "tramSeq",
    "repeatCourse",
    "countGpaInd",
    "instCreditsUsed",
    "jgroup",
    "tcrseTitle",
    "tsubjCode",
    "primGroup",
    "levlCodeInst",
    "levlCode",
    "artInd",
    "tcrseNumb",
    "termCode"
})
@Generated("jsonschema2pojo")
public class TransferArticulationEvaluation100PostResponse {

    /**
     * Transfer Credit Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("credHours")
    private Double credHours;
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
     * Equivalent Repeat System
     * <p>
     * Lineage reference object : SHRTRTK_REPEAT_SYS
     * 
     */
    @JsonProperty("repeatSys")
    @JsonPropertyDescription("Lineage reference object : SHRTRTK_REPEAT_SYS")
    private String repeatSys;
    /**
     * Equivalent Subject
     * <p>
     * Lineage reference object : SHRTRTK_SUBJ_CODE_INST, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCodeInst")
    @JsonPropertyDescription("Lineage reference object : SHRTRTK_SUBJ_CODE_INST, Lookup lineage reference object : stvsubj")
    private String subjCodeInst;
    /**
     * Equivalent Title
     * <p>
     * Lineage reference object : SHRTRTK_CRSE_TITLE, Lookup lineage reference object : shrtatc,SHRTATC
     * 
     */
    @JsonProperty("crseTitle")
    @JsonPropertyDescription("Lineage reference object : SHRTRTK_CRSE_TITLE, Lookup lineage reference object : shrtatc,SHRTATC")
    private String crseTitle;
    /**
     * Equivalent Grade
     * <p>
     * Lineage reference object : SHRTRTK_GRDE_CODE_INST
     * 
     */
    @JsonProperty("grdeCodeInst")
    @JsonPropertyDescription("Lineage reference object : SHRTRTK_GRDE_CODE_INST")
    private String grdeCodeInst;
    /**
     * Equivalent Course
     * <p>
     * Lineage reference object : SHRTRTK_CRSE_NUMB_INST
     * 
     */
    @JsonProperty("crseNumbInst")
    @JsonPropertyDescription("Lineage reference object : SHRTRTK_CRSE_NUMB_INST")
    private String crseNumbInst;
    /**
     * Equivalent Mode
     * <p>
     * Lineage reference object : SHRTRTK_GMOD_CODE_INST
     * 
     */
    @JsonProperty("gmodCodeInst")
    @JsonPropertyDescription("Lineage reference object : SHRTRTK_GMOD_CODE_INST")
    private String gmodCodeInst;
    /**
     * Transfer Duplicate
     * <p>
     * Lineage reference object : SHRTRTK_DUPLICATE
     * 
     */
    @JsonProperty("duplicate")
    @JsonPropertyDescription("Lineage reference object : SHRTRTK_DUPLICATE")
    private String duplicate;
    /**
     * Attendance Period
     * <p>
     * 
     * 
     */
    @JsonProperty("tramSeq")
    private String tramSeq;
    /**
     * Equivalent Repeat
     * <p>
     * Lineage reference object : SHRTRTK_REPEAT_COURSE
     * 
     */
    @JsonProperty("repeatCourse")
    @JsonPropertyDescription("Lineage reference object : SHRTRTK_REPEAT_COURSE")
    private String repeatCourse;
    /**
     * Equivalent Count in GPA
     * <p>
     * Lineage reference object : SHRTRTK_COUNT_GPA_IND
     * 
     */
    @JsonProperty("countGpaInd")
    @JsonPropertyDescription("Lineage reference object : SHRTRTK_COUNT_GPA_IND")
    private String countGpaInd;
    /**
     * Equivalent Credit Hours
     * <p>
     * Lineage reference object : SHRTRTK_INST_CREDITS_USED
     * 
     */
    @JsonProperty("instCreditsUsed")
    @JsonPropertyDescription("Lineage reference object : SHRTRTK_INST_CREDITS_USED")
    private Double instCreditsUsed;
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
     * Transfer Title
     * <p>
     * 
     * 
     */
    @JsonProperty("tcrseTitle")
    private String tcrseTitle;
    /**
     * Transfer Subject
     * <p>
     * Lookup lineage reference object : shbtatc
     * 
     */
    @JsonProperty("tsubjCode")
    @JsonPropertyDescription("Lookup lineage reference object : shbtatc")
    private String tsubjCode;
    @JsonProperty("primGroup")
    private String primGroup;
    /**
     * Equivalent Level
     * <p>
     * Lineage reference object : SHRTRTK_LEVL_CODE_INST
     * 
     */
    @JsonProperty("levlCodeInst")
    @JsonPropertyDescription("Lineage reference object : SHRTRTK_LEVL_CODE_INST")
    private String levlCodeInst;
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
     * Articulate Ind
     * <p>
     * Lineage reference object : SHRTRTK_ART_IND
     * 
     */
    @JsonProperty("artInd")
    @JsonPropertyDescription("Lineage reference object : SHRTRTK_ART_IND")
    private String artInd;
    /**
     * Transfer Course
     * <p>
     * Lookup lineage reference object : shbtatc
     * 
     */
    @JsonProperty("tcrseNumb")
    @JsonPropertyDescription("Lookup lineage reference object : shbtatc")
    private String tcrseNumb;
    /**
     * Term
     * <p>
     * 
     * 
     */
    @JsonProperty("termCode")
    private String termCode;
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

    public TransferArticulationEvaluation100PostResponse withCredHours(Double credHours) {
        this.credHours = credHours;
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

    public TransferArticulationEvaluation100PostResponse withTgrdCode(String tgrdCode) {
        this.tgrdCode = tgrdCode;
        return this;
    }

    /**
     * Equivalent Repeat System
     * <p>
     * Lineage reference object : SHRTRTK_REPEAT_SYS
     * 
     */
    @JsonProperty("repeatSys")
    public String getRepeatSys() {
        return repeatSys;
    }

    /**
     * Equivalent Repeat System
     * <p>
     * Lineage reference object : SHRTRTK_REPEAT_SYS
     * 
     */
    @JsonProperty("repeatSys")
    public void setRepeatSys(String repeatSys) {
        this.repeatSys = repeatSys;
    }

    public TransferArticulationEvaluation100PostResponse withRepeatSys(String repeatSys) {
        this.repeatSys = repeatSys;
        return this;
    }

    /**
     * Equivalent Subject
     * <p>
     * Lineage reference object : SHRTRTK_SUBJ_CODE_INST, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCodeInst")
    public String getSubjCodeInst() {
        return subjCodeInst;
    }

    /**
     * Equivalent Subject
     * <p>
     * Lineage reference object : SHRTRTK_SUBJ_CODE_INST, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCodeInst")
    public void setSubjCodeInst(String subjCodeInst) {
        this.subjCodeInst = subjCodeInst;
    }

    public TransferArticulationEvaluation100PostResponse withSubjCodeInst(String subjCodeInst) {
        this.subjCodeInst = subjCodeInst;
        return this;
    }

    /**
     * Equivalent Title
     * <p>
     * Lineage reference object : SHRTRTK_CRSE_TITLE, Lookup lineage reference object : shrtatc,SHRTATC
     * 
     */
    @JsonProperty("crseTitle")
    public String getCrseTitle() {
        return crseTitle;
    }

    /**
     * Equivalent Title
     * <p>
     * Lineage reference object : SHRTRTK_CRSE_TITLE, Lookup lineage reference object : shrtatc,SHRTATC
     * 
     */
    @JsonProperty("crseTitle")
    public void setCrseTitle(String crseTitle) {
        this.crseTitle = crseTitle;
    }

    public TransferArticulationEvaluation100PostResponse withCrseTitle(String crseTitle) {
        this.crseTitle = crseTitle;
        return this;
    }

    /**
     * Equivalent Grade
     * <p>
     * Lineage reference object : SHRTRTK_GRDE_CODE_INST
     * 
     */
    @JsonProperty("grdeCodeInst")
    public String getGrdeCodeInst() {
        return grdeCodeInst;
    }

    /**
     * Equivalent Grade
     * <p>
     * Lineage reference object : SHRTRTK_GRDE_CODE_INST
     * 
     */
    @JsonProperty("grdeCodeInst")
    public void setGrdeCodeInst(String grdeCodeInst) {
        this.grdeCodeInst = grdeCodeInst;
    }

    public TransferArticulationEvaluation100PostResponse withGrdeCodeInst(String grdeCodeInst) {
        this.grdeCodeInst = grdeCodeInst;
        return this;
    }

    /**
     * Equivalent Course
     * <p>
     * Lineage reference object : SHRTRTK_CRSE_NUMB_INST
     * 
     */
    @JsonProperty("crseNumbInst")
    public String getCrseNumbInst() {
        return crseNumbInst;
    }

    /**
     * Equivalent Course
     * <p>
     * Lineage reference object : SHRTRTK_CRSE_NUMB_INST
     * 
     */
    @JsonProperty("crseNumbInst")
    public void setCrseNumbInst(String crseNumbInst) {
        this.crseNumbInst = crseNumbInst;
    }

    public TransferArticulationEvaluation100PostResponse withCrseNumbInst(String crseNumbInst) {
        this.crseNumbInst = crseNumbInst;
        return this;
    }

    /**
     * Equivalent Mode
     * <p>
     * Lineage reference object : SHRTRTK_GMOD_CODE_INST
     * 
     */
    @JsonProperty("gmodCodeInst")
    public String getGmodCodeInst() {
        return gmodCodeInst;
    }

    /**
     * Equivalent Mode
     * <p>
     * Lineage reference object : SHRTRTK_GMOD_CODE_INST
     * 
     */
    @JsonProperty("gmodCodeInst")
    public void setGmodCodeInst(String gmodCodeInst) {
        this.gmodCodeInst = gmodCodeInst;
    }

    public TransferArticulationEvaluation100PostResponse withGmodCodeInst(String gmodCodeInst) {
        this.gmodCodeInst = gmodCodeInst;
        return this;
    }

    /**
     * Transfer Duplicate
     * <p>
     * Lineage reference object : SHRTRTK_DUPLICATE
     * 
     */
    @JsonProperty("duplicate")
    public String getDuplicate() {
        return duplicate;
    }

    /**
     * Transfer Duplicate
     * <p>
     * Lineage reference object : SHRTRTK_DUPLICATE
     * 
     */
    @JsonProperty("duplicate")
    public void setDuplicate(String duplicate) {
        this.duplicate = duplicate;
    }

    public TransferArticulationEvaluation100PostResponse withDuplicate(String duplicate) {
        this.duplicate = duplicate;
        return this;
    }

    /**
     * Attendance Period
     * <p>
     * 
     * 
     */
    @JsonProperty("tramSeq")
    public String getTramSeq() {
        return tramSeq;
    }

    /**
     * Attendance Period
     * <p>
     * 
     * 
     */
    @JsonProperty("tramSeq")
    public void setTramSeq(String tramSeq) {
        this.tramSeq = tramSeq;
    }

    public TransferArticulationEvaluation100PostResponse withTramSeq(String tramSeq) {
        this.tramSeq = tramSeq;
        return this;
    }

    /**
     * Equivalent Repeat
     * <p>
     * Lineage reference object : SHRTRTK_REPEAT_COURSE
     * 
     */
    @JsonProperty("repeatCourse")
    public String getRepeatCourse() {
        return repeatCourse;
    }

    /**
     * Equivalent Repeat
     * <p>
     * Lineage reference object : SHRTRTK_REPEAT_COURSE
     * 
     */
    @JsonProperty("repeatCourse")
    public void setRepeatCourse(String repeatCourse) {
        this.repeatCourse = repeatCourse;
    }

    public TransferArticulationEvaluation100PostResponse withRepeatCourse(String repeatCourse) {
        this.repeatCourse = repeatCourse;
        return this;
    }

    /**
     * Equivalent Count in GPA
     * <p>
     * Lineage reference object : SHRTRTK_COUNT_GPA_IND
     * 
     */
    @JsonProperty("countGpaInd")
    public String getCountGpaInd() {
        return countGpaInd;
    }

    /**
     * Equivalent Count in GPA
     * <p>
     * Lineage reference object : SHRTRTK_COUNT_GPA_IND
     * 
     */
    @JsonProperty("countGpaInd")
    public void setCountGpaInd(String countGpaInd) {
        this.countGpaInd = countGpaInd;
    }

    public TransferArticulationEvaluation100PostResponse withCountGpaInd(String countGpaInd) {
        this.countGpaInd = countGpaInd;
        return this;
    }

    /**
     * Equivalent Credit Hours
     * <p>
     * Lineage reference object : SHRTRTK_INST_CREDITS_USED
     * 
     */
    @JsonProperty("instCreditsUsed")
    public Double getInstCreditsUsed() {
        return instCreditsUsed;
    }

    /**
     * Equivalent Credit Hours
     * <p>
     * Lineage reference object : SHRTRTK_INST_CREDITS_USED
     * 
     */
    @JsonProperty("instCreditsUsed")
    public void setInstCreditsUsed(Double instCreditsUsed) {
        this.instCreditsUsed = instCreditsUsed;
    }

    public TransferArticulationEvaluation100PostResponse withInstCreditsUsed(Double instCreditsUsed) {
        this.instCreditsUsed = instCreditsUsed;
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

    public TransferArticulationEvaluation100PostResponse withJgroup(String jgroup) {
        this.jgroup = jgroup;
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

    public TransferArticulationEvaluation100PostResponse withTcrseTitle(String tcrseTitle) {
        this.tcrseTitle = tcrseTitle;
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

    public TransferArticulationEvaluation100PostResponse withTsubjCode(String tsubjCode) {
        this.tsubjCode = tsubjCode;
        return this;
    }

    @JsonProperty("primGroup")
    public String getPrimGroup() {
        return primGroup;
    }

    @JsonProperty("primGroup")
    public void setPrimGroup(String primGroup) {
        this.primGroup = primGroup;
    }

    public TransferArticulationEvaluation100PostResponse withPrimGroup(String primGroup) {
        this.primGroup = primGroup;
        return this;
    }

    /**
     * Equivalent Level
     * <p>
     * Lineage reference object : SHRTRTK_LEVL_CODE_INST
     * 
     */
    @JsonProperty("levlCodeInst")
    public String getLevlCodeInst() {
        return levlCodeInst;
    }

    /**
     * Equivalent Level
     * <p>
     * Lineage reference object : SHRTRTK_LEVL_CODE_INST
     * 
     */
    @JsonProperty("levlCodeInst")
    public void setLevlCodeInst(String levlCodeInst) {
        this.levlCodeInst = levlCodeInst;
    }

    public TransferArticulationEvaluation100PostResponse withLevlCodeInst(String levlCodeInst) {
        this.levlCodeInst = levlCodeInst;
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

    public TransferArticulationEvaluation100PostResponse withLevlCode(String levlCode) {
        this.levlCode = levlCode;
        return this;
    }

    /**
     * Articulate Ind
     * <p>
     * Lineage reference object : SHRTRTK_ART_IND
     * 
     */
    @JsonProperty("artInd")
    public String getArtInd() {
        return artInd;
    }

    /**
     * Articulate Ind
     * <p>
     * Lineage reference object : SHRTRTK_ART_IND
     * 
     */
    @JsonProperty("artInd")
    public void setArtInd(String artInd) {
        this.artInd = artInd;
    }

    public TransferArticulationEvaluation100PostResponse withArtInd(String artInd) {
        this.artInd = artInd;
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

    public TransferArticulationEvaluation100PostResponse withTcrseNumb(String tcrseNumb) {
        this.tcrseNumb = tcrseNumb;
        return this;
    }

    /**
     * Term
     * <p>
     * 
     * 
     */
    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    /**
     * Term
     * <p>
     * 
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public TransferArticulationEvaluation100PostResponse withTermCode(String termCode) {
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

    public TransferArticulationEvaluation100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TransferArticulationEvaluation100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("credHours");
        sb.append('=');
        sb.append(((this.credHours == null)?"<null>":this.credHours));
        sb.append(',');
        sb.append("tgrdCode");
        sb.append('=');
        sb.append(((this.tgrdCode == null)?"<null>":this.tgrdCode));
        sb.append(',');
        sb.append("repeatSys");
        sb.append('=');
        sb.append(((this.repeatSys == null)?"<null>":this.repeatSys));
        sb.append(',');
        sb.append("subjCodeInst");
        sb.append('=');
        sb.append(((this.subjCodeInst == null)?"<null>":this.subjCodeInst));
        sb.append(',');
        sb.append("crseTitle");
        sb.append('=');
        sb.append(((this.crseTitle == null)?"<null>":this.crseTitle));
        sb.append(',');
        sb.append("grdeCodeInst");
        sb.append('=');
        sb.append(((this.grdeCodeInst == null)?"<null>":this.grdeCodeInst));
        sb.append(',');
        sb.append("crseNumbInst");
        sb.append('=');
        sb.append(((this.crseNumbInst == null)?"<null>":this.crseNumbInst));
        sb.append(',');
        sb.append("gmodCodeInst");
        sb.append('=');
        sb.append(((this.gmodCodeInst == null)?"<null>":this.gmodCodeInst));
        sb.append(',');
        sb.append("duplicate");
        sb.append('=');
        sb.append(((this.duplicate == null)?"<null>":this.duplicate));
        sb.append(',');
        sb.append("tramSeq");
        sb.append('=');
        sb.append(((this.tramSeq == null)?"<null>":this.tramSeq));
        sb.append(',');
        sb.append("repeatCourse");
        sb.append('=');
        sb.append(((this.repeatCourse == null)?"<null>":this.repeatCourse));
        sb.append(',');
        sb.append("countGpaInd");
        sb.append('=');
        sb.append(((this.countGpaInd == null)?"<null>":this.countGpaInd));
        sb.append(',');
        sb.append("instCreditsUsed");
        sb.append('=');
        sb.append(((this.instCreditsUsed == null)?"<null>":this.instCreditsUsed));
        sb.append(',');
        sb.append("jgroup");
        sb.append('=');
        sb.append(((this.jgroup == null)?"<null>":this.jgroup));
        sb.append(',');
        sb.append("tcrseTitle");
        sb.append('=');
        sb.append(((this.tcrseTitle == null)?"<null>":this.tcrseTitle));
        sb.append(',');
        sb.append("tsubjCode");
        sb.append('=');
        sb.append(((this.tsubjCode == null)?"<null>":this.tsubjCode));
        sb.append(',');
        sb.append("primGroup");
        sb.append('=');
        sb.append(((this.primGroup == null)?"<null>":this.primGroup));
        sb.append(',');
        sb.append("levlCodeInst");
        sb.append('=');
        sb.append(((this.levlCodeInst == null)?"<null>":this.levlCodeInst));
        sb.append(',');
        sb.append("levlCode");
        sb.append('=');
        sb.append(((this.levlCode == null)?"<null>":this.levlCode));
        sb.append(',');
        sb.append("artInd");
        sb.append('=');
        sb.append(((this.artInd == null)?"<null>":this.artInd));
        sb.append(',');
        sb.append("tcrseNumb");
        sb.append('=');
        sb.append(((this.tcrseNumb == null)?"<null>":this.tcrseNumb));
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
        result = ((result* 31)+((this.credHours == null)? 0 :this.credHours.hashCode()));
        result = ((result* 31)+((this.tgrdCode == null)? 0 :this.tgrdCode.hashCode()));
        result = ((result* 31)+((this.repeatSys == null)? 0 :this.repeatSys.hashCode()));
        result = ((result* 31)+((this.subjCodeInst == null)? 0 :this.subjCodeInst.hashCode()));
        result = ((result* 31)+((this.crseTitle == null)? 0 :this.crseTitle.hashCode()));
        result = ((result* 31)+((this.grdeCodeInst == null)? 0 :this.grdeCodeInst.hashCode()));
        result = ((result* 31)+((this.crseNumbInst == null)? 0 :this.crseNumbInst.hashCode()));
        result = ((result* 31)+((this.gmodCodeInst == null)? 0 :this.gmodCodeInst.hashCode()));
        result = ((result* 31)+((this.duplicate == null)? 0 :this.duplicate.hashCode()));
        result = ((result* 31)+((this.tramSeq == null)? 0 :this.tramSeq.hashCode()));
        result = ((result* 31)+((this.repeatCourse == null)? 0 :this.repeatCourse.hashCode()));
        result = ((result* 31)+((this.countGpaInd == null)? 0 :this.countGpaInd.hashCode()));
        result = ((result* 31)+((this.instCreditsUsed == null)? 0 :this.instCreditsUsed.hashCode()));
        result = ((result* 31)+((this.jgroup == null)? 0 :this.jgroup.hashCode()));
        result = ((result* 31)+((this.tcrseTitle == null)? 0 :this.tcrseTitle.hashCode()));
        result = ((result* 31)+((this.tsubjCode == null)? 0 :this.tsubjCode.hashCode()));
        result = ((result* 31)+((this.primGroup == null)? 0 :this.primGroup.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.levlCodeInst == null)? 0 :this.levlCodeInst.hashCode()));
        result = ((result* 31)+((this.levlCode == null)? 0 :this.levlCode.hashCode()));
        result = ((result* 31)+((this.artInd == null)? 0 :this.artInd.hashCode()));
        result = ((result* 31)+((this.tcrseNumb == null)? 0 :this.tcrseNumb.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TransferArticulationEvaluation100PostResponse) == false) {
            return false;
        }
        TransferArticulationEvaluation100PostResponse rhs = ((TransferArticulationEvaluation100PostResponse) other);
        return ((((((((((((((((((((((((this.credHours == rhs.credHours)||((this.credHours!= null)&&this.credHours.equals(rhs.credHours)))&&((this.tgrdCode == rhs.tgrdCode)||((this.tgrdCode!= null)&&this.tgrdCode.equals(rhs.tgrdCode))))&&((this.repeatSys == rhs.repeatSys)||((this.repeatSys!= null)&&this.repeatSys.equals(rhs.repeatSys))))&&((this.subjCodeInst == rhs.subjCodeInst)||((this.subjCodeInst!= null)&&this.subjCodeInst.equals(rhs.subjCodeInst))))&&((this.crseTitle == rhs.crseTitle)||((this.crseTitle!= null)&&this.crseTitle.equals(rhs.crseTitle))))&&((this.grdeCodeInst == rhs.grdeCodeInst)||((this.grdeCodeInst!= null)&&this.grdeCodeInst.equals(rhs.grdeCodeInst))))&&((this.crseNumbInst == rhs.crseNumbInst)||((this.crseNumbInst!= null)&&this.crseNumbInst.equals(rhs.crseNumbInst))))&&((this.gmodCodeInst == rhs.gmodCodeInst)||((this.gmodCodeInst!= null)&&this.gmodCodeInst.equals(rhs.gmodCodeInst))))&&((this.duplicate == rhs.duplicate)||((this.duplicate!= null)&&this.duplicate.equals(rhs.duplicate))))&&((this.tramSeq == rhs.tramSeq)||((this.tramSeq!= null)&&this.tramSeq.equals(rhs.tramSeq))))&&((this.repeatCourse == rhs.repeatCourse)||((this.repeatCourse!= null)&&this.repeatCourse.equals(rhs.repeatCourse))))&&((this.countGpaInd == rhs.countGpaInd)||((this.countGpaInd!= null)&&this.countGpaInd.equals(rhs.countGpaInd))))&&((this.instCreditsUsed == rhs.instCreditsUsed)||((this.instCreditsUsed!= null)&&this.instCreditsUsed.equals(rhs.instCreditsUsed))))&&((this.jgroup == rhs.jgroup)||((this.jgroup!= null)&&this.jgroup.equals(rhs.jgroup))))&&((this.tcrseTitle == rhs.tcrseTitle)||((this.tcrseTitle!= null)&&this.tcrseTitle.equals(rhs.tcrseTitle))))&&((this.tsubjCode == rhs.tsubjCode)||((this.tsubjCode!= null)&&this.tsubjCode.equals(rhs.tsubjCode))))&&((this.primGroup == rhs.primGroup)||((this.primGroup!= null)&&this.primGroup.equals(rhs.primGroup))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.levlCodeInst == rhs.levlCodeInst)||((this.levlCodeInst!= null)&&this.levlCodeInst.equals(rhs.levlCodeInst))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))))&&((this.artInd == rhs.artInd)||((this.artInd!= null)&&this.artInd.equals(rhs.artInd))))&&((this.tcrseNumb == rhs.tcrseNumb)||((this.tcrseNumb!= null)&&this.tcrseNumb.equals(rhs.tcrseNumb))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
