
package com.ellucian.generated.bpapi.ban.term_course_maintenance_term_header_information.v0_1_0;

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
    "gradeMailerDupDate",
    "recordStatusInd",
    "sobscpsDesc",
    "prevCode",
    "prevDate",
    "examCode",
    "astdDateDl",
    "stvprevDesc",
    "gradeMailerChgDate",
    "gradeMailingDate",
    "stvastdDescDeansl",
    "stvsbgiDesc",
    "stvastdDescStudent",
    "castCode",
    "castDate",
    "wrsnCode",
    "preCatalogInd",
    "sbgiCodeTrans",
    "scpsCode",
    "updateSourceInd",
    "astdCodeEndOfTerm",
    "astdDateEndOfTerm",
    "recordStatusDate",
    "stvwrsnDesc",
    "stvexamDesc",
    "stvcastDesc",
    "gradeMailerDup",
    "astdCodeDl"
})
@Generated("jsonschema2pojo")
public class TermCourseMaintenanceTermHeaderInformation010GetResponse {

    /**
     * Date
     * <p>
     * Lineage reference object : SHRTTRM_GRADE_MAILER_DUP_DATE
     * 
     */
    @JsonProperty("gradeMailerDupDate")
    @JsonPropertyDescription("Lineage reference object : SHRTTRM_GRADE_MAILER_DUP_DATE")
    private Date gradeMailerDupDate;
    /**
     * Record Status
     * <p>
     * Lineage reference object : SHRTTRM_RECORD_STATUS_IND
     * 
     */
    @JsonProperty("recordStatusInd")
    @JsonPropertyDescription("Lineage reference object : SHRTTRM_RECORD_STATUS_IND")
    private String recordStatusInd;
    /**
     * Student Centric Period Description
     * <p>
     * 
     * 
     */
    @JsonProperty("sobscpsDesc")
    private String sobscpsDesc;
    /**
     * Progress Evaluation
     * <p>
     * Lineage reference object : SHRTTRM_PREV_CODE, Lookup lineage reference object : stvprev
     * 
     */
    @JsonProperty("prevCode")
    @JsonPropertyDescription("Lineage reference object : SHRTTRM_PREV_CODE, Lookup lineage reference object : stvprev")
    private String prevCode;
    /**
     * Progress Evaluation Date
     * <p>
     * Lineage reference object : SHRTTRM_PREV_DATE
     * 
     */
    @JsonProperty("prevDate")
    @JsonPropertyDescription("Lineage reference object : SHRTTRM_PREV_DATE")
    private Date prevDate;
    /**
     * Special Exam Credit
     * <p>
     * Lineage reference object : SHRTTRM_EXAM_CODE, Lookup lineage reference object : stvexam
     * 
     */
    @JsonProperty("examCode")
    @JsonPropertyDescription("Lineage reference object : SHRTTRM_EXAM_CODE, Lookup lineage reference object : stvexam")
    private String examCode;
    /**
     * Dean's List Status Date
     * <p>
     * Lineage reference object : SHRTTRM_ASTD_DATE_DL
     * 
     */
    @JsonProperty("astdDateDl")
    @JsonPropertyDescription("Lineage reference object : SHRTTRM_ASTD_DATE_DL")
    private Date astdDateDl;
    /**
     * Progress Evaluation Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvprevDesc")
    private String stvprevDesc;
    /**
     * Revised/Duplicate Grade Mailer Sent Date
     * <p>
     * Lineage reference object : SHRTTRM_GRADE_MAILER_CHG_DATE
     * 
     */
    @JsonProperty("gradeMailerChgDate")
    @JsonPropertyDescription("Lineage reference object : SHRTTRM_GRADE_MAILER_CHG_DATE")
    private Date gradeMailerChgDate;
    /**
     * Original Grade Mailer Sent Date
     * <p>
     * Lineage reference object : SHRTTRM_GRADE_MAILING_DATE
     * 
     */
    @JsonProperty("gradeMailingDate")
    @JsonPropertyDescription("Lineage reference object : SHRTTRM_GRADE_MAILING_DATE")
    private Date gradeMailingDate;
    /**
     * Dean's List Status Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvastdDescDeansl")
    private String stvastdDescDeansl;
    /**
     * Transfer Institution Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvsbgiDesc")
    private String stvsbgiDesc;
    /**
     * End of Term Academic Standing Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvastdDescStudent")
    private String stvastdDescStudent;
    /**
     * Combined Academic Standing
     * <p>
     * Lineage reference object : SHRTTRM_CAST_CODE, Lookup lineage reference object : stvcast
     * 
     */
    @JsonProperty("castCode")
    @JsonPropertyDescription("Lineage reference object : SHRTTRM_CAST_CODE, Lookup lineage reference object : stvcast")
    private String castCode;
    /**
     * Combined Academic Standing Date
     * <p>
     * Lineage reference object : SHRTTRM_CAST_DATE
     * 
     */
    @JsonProperty("castDate")
    @JsonPropertyDescription("Lineage reference object : SHRTTRM_CAST_DATE")
    private Date castDate;
    /**
     * Withdrawal Reason
     * <p>
     * Lineage reference object : SHRTTRM_WRSN_CODE, Lookup lineage reference object : stvwrsn
     * 
     */
    @JsonProperty("wrsnCode")
    @JsonPropertyDescription("Lineage reference object : SHRTTRM_WRSN_CODE, Lookup lineage reference object : stvwrsn")
    private String wrsnCode;
    /**
     * Pre-Catalog Entry
     * <p>
     * Lineage reference object : SHRTTRM_PRE_CATALOG_IND
     * 
     */
    @JsonProperty("preCatalogInd")
    @JsonPropertyDescription("Lineage reference object : SHRTTRM_PRE_CATALOG_IND")
    private String preCatalogInd;
    /**
     * Transfer Institution
     * <p>
     * Lineage reference object : SHRTTRM_SBGI_CODE_TRANS
     * 
     */
    @JsonProperty("sbgiCodeTrans")
    @JsonPropertyDescription("Lineage reference object : SHRTTRM_SBGI_CODE_TRANS")
    private String sbgiCodeTrans;
    /**
     * Student Centric Period
     * <p>
     * Lineage reference object : SHRTTRM_SCPS_CODE, Lookup lineage reference object : SORSCPT,SOBSCPS
     * 
     */
    @JsonProperty("scpsCode")
    @JsonPropertyDescription("Lineage reference object : SHRTTRM_SCPS_CODE, Lookup lineage reference object : SORSCPT,SOBSCPS")
    private String scpsCode;
    /**
     * Data Added by
     * <p>
     * Lineage reference object : SHRTTRM_UPDATE_SOURCE_IND
     * 
     */
    @JsonProperty("updateSourceInd")
    @JsonPropertyDescription("Lineage reference object : SHRTTRM_UPDATE_SOURCE_IND")
    private String updateSourceInd;
    /**
     * End of Term Academic Standing
     * <p>
     * Lineage reference object : SHRTTRM_ASTD_CODE_END_OF_TERM, Lookup lineage reference object : stvastd
     * 
     */
    @JsonProperty("astdCodeEndOfTerm")
    @JsonPropertyDescription("Lineage reference object : SHRTTRM_ASTD_CODE_END_OF_TERM, Lookup lineage reference object : stvastd")
    private String astdCodeEndOfTerm;
    /**
     * End Of Term Academic Standing Date
     * <p>
     * Lineage reference object : SHRTTRM_ASTD_DATE_END_OF_TERM
     * 
     */
    @JsonProperty("astdDateEndOfTerm")
    @JsonPropertyDescription("Lineage reference object : SHRTTRM_ASTD_DATE_END_OF_TERM")
    private Date astdDateEndOfTerm;
    /**
     * Record Status Date
     * <p>
     * Lineage reference object : SHRTTRM_RECORD_STATUS_DATE
     * 
     */
    @JsonProperty("recordStatusDate")
    @JsonPropertyDescription("Lineage reference object : SHRTTRM_RECORD_STATUS_DATE")
    private Date recordStatusDate;
    /**
     * Withdrawal Reason Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvwrsnDesc")
    private String stvwrsnDesc;
    /**
     * Special Exam Credit Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvexamDesc")
    private String stvexamDesc;
    /**
     * Combined Academic Standing Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvcastDesc")
    private String stvcastDesc;
    /**
     * Duplicate Mailer Request
     * <p>
     * Lineage reference object : SHRTTRM_GRADE_MAILER_DUP
     * 
     */
    @JsonProperty("gradeMailerDup")
    @JsonPropertyDescription("Lineage reference object : SHRTTRM_GRADE_MAILER_DUP")
    private String gradeMailerDup;
    /**
     * Dean's List Status
     * <p>
     * Lineage reference object : SHRTTRM_ASTD_CODE_DL, Lookup lineage reference object : stvastd
     * 
     */
    @JsonProperty("astdCodeDl")
    @JsonPropertyDescription("Lineage reference object : SHRTTRM_ASTD_CODE_DL, Lookup lineage reference object : stvastd")
    private String astdCodeDl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Date
     * <p>
     * Lineage reference object : SHRTTRM_GRADE_MAILER_DUP_DATE
     * 
     */
    @JsonProperty("gradeMailerDupDate")
    public Date getGradeMailerDupDate() {
        return gradeMailerDupDate;
    }

    /**
     * Date
     * <p>
     * Lineage reference object : SHRTTRM_GRADE_MAILER_DUP_DATE
     * 
     */
    @JsonProperty("gradeMailerDupDate")
    public void setGradeMailerDupDate(Date gradeMailerDupDate) {
        this.gradeMailerDupDate = gradeMailerDupDate;
    }

    public TermCourseMaintenanceTermHeaderInformation010GetResponse withGradeMailerDupDate(Date gradeMailerDupDate) {
        this.gradeMailerDupDate = gradeMailerDupDate;
        return this;
    }

    /**
     * Record Status
     * <p>
     * Lineage reference object : SHRTTRM_RECORD_STATUS_IND
     * 
     */
    @JsonProperty("recordStatusInd")
    public String getRecordStatusInd() {
        return recordStatusInd;
    }

    /**
     * Record Status
     * <p>
     * Lineage reference object : SHRTTRM_RECORD_STATUS_IND
     * 
     */
    @JsonProperty("recordStatusInd")
    public void setRecordStatusInd(String recordStatusInd) {
        this.recordStatusInd = recordStatusInd;
    }

    public TermCourseMaintenanceTermHeaderInformation010GetResponse withRecordStatusInd(String recordStatusInd) {
        this.recordStatusInd = recordStatusInd;
        return this;
    }

    /**
     * Student Centric Period Description
     * <p>
     * 
     * 
     */
    @JsonProperty("sobscpsDesc")
    public String getSobscpsDesc() {
        return sobscpsDesc;
    }

    /**
     * Student Centric Period Description
     * <p>
     * 
     * 
     */
    @JsonProperty("sobscpsDesc")
    public void setSobscpsDesc(String sobscpsDesc) {
        this.sobscpsDesc = sobscpsDesc;
    }

    public TermCourseMaintenanceTermHeaderInformation010GetResponse withSobscpsDesc(String sobscpsDesc) {
        this.sobscpsDesc = sobscpsDesc;
        return this;
    }

    /**
     * Progress Evaluation
     * <p>
     * Lineage reference object : SHRTTRM_PREV_CODE, Lookup lineage reference object : stvprev
     * 
     */
    @JsonProperty("prevCode")
    public String getPrevCode() {
        return prevCode;
    }

    /**
     * Progress Evaluation
     * <p>
     * Lineage reference object : SHRTTRM_PREV_CODE, Lookup lineage reference object : stvprev
     * 
     */
    @JsonProperty("prevCode")
    public void setPrevCode(String prevCode) {
        this.prevCode = prevCode;
    }

    public TermCourseMaintenanceTermHeaderInformation010GetResponse withPrevCode(String prevCode) {
        this.prevCode = prevCode;
        return this;
    }

    /**
     * Progress Evaluation Date
     * <p>
     * Lineage reference object : SHRTTRM_PREV_DATE
     * 
     */
    @JsonProperty("prevDate")
    public Date getPrevDate() {
        return prevDate;
    }

    /**
     * Progress Evaluation Date
     * <p>
     * Lineage reference object : SHRTTRM_PREV_DATE
     * 
     */
    @JsonProperty("prevDate")
    public void setPrevDate(Date prevDate) {
        this.prevDate = prevDate;
    }

    public TermCourseMaintenanceTermHeaderInformation010GetResponse withPrevDate(Date prevDate) {
        this.prevDate = prevDate;
        return this;
    }

    /**
     * Special Exam Credit
     * <p>
     * Lineage reference object : SHRTTRM_EXAM_CODE, Lookup lineage reference object : stvexam
     * 
     */
    @JsonProperty("examCode")
    public String getExamCode() {
        return examCode;
    }

    /**
     * Special Exam Credit
     * <p>
     * Lineage reference object : SHRTTRM_EXAM_CODE, Lookup lineage reference object : stvexam
     * 
     */
    @JsonProperty("examCode")
    public void setExamCode(String examCode) {
        this.examCode = examCode;
    }

    public TermCourseMaintenanceTermHeaderInformation010GetResponse withExamCode(String examCode) {
        this.examCode = examCode;
        return this;
    }

    /**
     * Dean's List Status Date
     * <p>
     * Lineage reference object : SHRTTRM_ASTD_DATE_DL
     * 
     */
    @JsonProperty("astdDateDl")
    public Date getAstdDateDl() {
        return astdDateDl;
    }

    /**
     * Dean's List Status Date
     * <p>
     * Lineage reference object : SHRTTRM_ASTD_DATE_DL
     * 
     */
    @JsonProperty("astdDateDl")
    public void setAstdDateDl(Date astdDateDl) {
        this.astdDateDl = astdDateDl;
    }

    public TermCourseMaintenanceTermHeaderInformation010GetResponse withAstdDateDl(Date astdDateDl) {
        this.astdDateDl = astdDateDl;
        return this;
    }

    /**
     * Progress Evaluation Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvprevDesc")
    public String getStvprevDesc() {
        return stvprevDesc;
    }

    /**
     * Progress Evaluation Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvprevDesc")
    public void setStvprevDesc(String stvprevDesc) {
        this.stvprevDesc = stvprevDesc;
    }

    public TermCourseMaintenanceTermHeaderInformation010GetResponse withStvprevDesc(String stvprevDesc) {
        this.stvprevDesc = stvprevDesc;
        return this;
    }

    /**
     * Revised/Duplicate Grade Mailer Sent Date
     * <p>
     * Lineage reference object : SHRTTRM_GRADE_MAILER_CHG_DATE
     * 
     */
    @JsonProperty("gradeMailerChgDate")
    public Date getGradeMailerChgDate() {
        return gradeMailerChgDate;
    }

    /**
     * Revised/Duplicate Grade Mailer Sent Date
     * <p>
     * Lineage reference object : SHRTTRM_GRADE_MAILER_CHG_DATE
     * 
     */
    @JsonProperty("gradeMailerChgDate")
    public void setGradeMailerChgDate(Date gradeMailerChgDate) {
        this.gradeMailerChgDate = gradeMailerChgDate;
    }

    public TermCourseMaintenanceTermHeaderInformation010GetResponse withGradeMailerChgDate(Date gradeMailerChgDate) {
        this.gradeMailerChgDate = gradeMailerChgDate;
        return this;
    }

    /**
     * Original Grade Mailer Sent Date
     * <p>
     * Lineage reference object : SHRTTRM_GRADE_MAILING_DATE
     * 
     */
    @JsonProperty("gradeMailingDate")
    public Date getGradeMailingDate() {
        return gradeMailingDate;
    }

    /**
     * Original Grade Mailer Sent Date
     * <p>
     * Lineage reference object : SHRTTRM_GRADE_MAILING_DATE
     * 
     */
    @JsonProperty("gradeMailingDate")
    public void setGradeMailingDate(Date gradeMailingDate) {
        this.gradeMailingDate = gradeMailingDate;
    }

    public TermCourseMaintenanceTermHeaderInformation010GetResponse withGradeMailingDate(Date gradeMailingDate) {
        this.gradeMailingDate = gradeMailingDate;
        return this;
    }

    /**
     * Dean's List Status Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvastdDescDeansl")
    public String getStvastdDescDeansl() {
        return stvastdDescDeansl;
    }

    /**
     * Dean's List Status Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvastdDescDeansl")
    public void setStvastdDescDeansl(String stvastdDescDeansl) {
        this.stvastdDescDeansl = stvastdDescDeansl;
    }

    public TermCourseMaintenanceTermHeaderInformation010GetResponse withStvastdDescDeansl(String stvastdDescDeansl) {
        this.stvastdDescDeansl = stvastdDescDeansl;
        return this;
    }

    /**
     * Transfer Institution Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvsbgiDesc")
    public String getStvsbgiDesc() {
        return stvsbgiDesc;
    }

    /**
     * Transfer Institution Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvsbgiDesc")
    public void setStvsbgiDesc(String stvsbgiDesc) {
        this.stvsbgiDesc = stvsbgiDesc;
    }

    public TermCourseMaintenanceTermHeaderInformation010GetResponse withStvsbgiDesc(String stvsbgiDesc) {
        this.stvsbgiDesc = stvsbgiDesc;
        return this;
    }

    /**
     * End of Term Academic Standing Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvastdDescStudent")
    public String getStvastdDescStudent() {
        return stvastdDescStudent;
    }

    /**
     * End of Term Academic Standing Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvastdDescStudent")
    public void setStvastdDescStudent(String stvastdDescStudent) {
        this.stvastdDescStudent = stvastdDescStudent;
    }

    public TermCourseMaintenanceTermHeaderInformation010GetResponse withStvastdDescStudent(String stvastdDescStudent) {
        this.stvastdDescStudent = stvastdDescStudent;
        return this;
    }

    /**
     * Combined Academic Standing
     * <p>
     * Lineage reference object : SHRTTRM_CAST_CODE, Lookup lineage reference object : stvcast
     * 
     */
    @JsonProperty("castCode")
    public String getCastCode() {
        return castCode;
    }

    /**
     * Combined Academic Standing
     * <p>
     * Lineage reference object : SHRTTRM_CAST_CODE, Lookup lineage reference object : stvcast
     * 
     */
    @JsonProperty("castCode")
    public void setCastCode(String castCode) {
        this.castCode = castCode;
    }

    public TermCourseMaintenanceTermHeaderInformation010GetResponse withCastCode(String castCode) {
        this.castCode = castCode;
        return this;
    }

    /**
     * Combined Academic Standing Date
     * <p>
     * Lineage reference object : SHRTTRM_CAST_DATE
     * 
     */
    @JsonProperty("castDate")
    public Date getCastDate() {
        return castDate;
    }

    /**
     * Combined Academic Standing Date
     * <p>
     * Lineage reference object : SHRTTRM_CAST_DATE
     * 
     */
    @JsonProperty("castDate")
    public void setCastDate(Date castDate) {
        this.castDate = castDate;
    }

    public TermCourseMaintenanceTermHeaderInformation010GetResponse withCastDate(Date castDate) {
        this.castDate = castDate;
        return this;
    }

    /**
     * Withdrawal Reason
     * <p>
     * Lineage reference object : SHRTTRM_WRSN_CODE, Lookup lineage reference object : stvwrsn
     * 
     */
    @JsonProperty("wrsnCode")
    public String getWrsnCode() {
        return wrsnCode;
    }

    /**
     * Withdrawal Reason
     * <p>
     * Lineage reference object : SHRTTRM_WRSN_CODE, Lookup lineage reference object : stvwrsn
     * 
     */
    @JsonProperty("wrsnCode")
    public void setWrsnCode(String wrsnCode) {
        this.wrsnCode = wrsnCode;
    }

    public TermCourseMaintenanceTermHeaderInformation010GetResponse withWrsnCode(String wrsnCode) {
        this.wrsnCode = wrsnCode;
        return this;
    }

    /**
     * Pre-Catalog Entry
     * <p>
     * Lineage reference object : SHRTTRM_PRE_CATALOG_IND
     * 
     */
    @JsonProperty("preCatalogInd")
    public String getPreCatalogInd() {
        return preCatalogInd;
    }

    /**
     * Pre-Catalog Entry
     * <p>
     * Lineage reference object : SHRTTRM_PRE_CATALOG_IND
     * 
     */
    @JsonProperty("preCatalogInd")
    public void setPreCatalogInd(String preCatalogInd) {
        this.preCatalogInd = preCatalogInd;
    }

    public TermCourseMaintenanceTermHeaderInformation010GetResponse withPreCatalogInd(String preCatalogInd) {
        this.preCatalogInd = preCatalogInd;
        return this;
    }

    /**
     * Transfer Institution
     * <p>
     * Lineage reference object : SHRTTRM_SBGI_CODE_TRANS
     * 
     */
    @JsonProperty("sbgiCodeTrans")
    public String getSbgiCodeTrans() {
        return sbgiCodeTrans;
    }

    /**
     * Transfer Institution
     * <p>
     * Lineage reference object : SHRTTRM_SBGI_CODE_TRANS
     * 
     */
    @JsonProperty("sbgiCodeTrans")
    public void setSbgiCodeTrans(String sbgiCodeTrans) {
        this.sbgiCodeTrans = sbgiCodeTrans;
    }

    public TermCourseMaintenanceTermHeaderInformation010GetResponse withSbgiCodeTrans(String sbgiCodeTrans) {
        this.sbgiCodeTrans = sbgiCodeTrans;
        return this;
    }

    /**
     * Student Centric Period
     * <p>
     * Lineage reference object : SHRTTRM_SCPS_CODE, Lookup lineage reference object : SORSCPT,SOBSCPS
     * 
     */
    @JsonProperty("scpsCode")
    public String getScpsCode() {
        return scpsCode;
    }

    /**
     * Student Centric Period
     * <p>
     * Lineage reference object : SHRTTRM_SCPS_CODE, Lookup lineage reference object : SORSCPT,SOBSCPS
     * 
     */
    @JsonProperty("scpsCode")
    public void setScpsCode(String scpsCode) {
        this.scpsCode = scpsCode;
    }

    public TermCourseMaintenanceTermHeaderInformation010GetResponse withScpsCode(String scpsCode) {
        this.scpsCode = scpsCode;
        return this;
    }

    /**
     * Data Added by
     * <p>
     * Lineage reference object : SHRTTRM_UPDATE_SOURCE_IND
     * 
     */
    @JsonProperty("updateSourceInd")
    public String getUpdateSourceInd() {
        return updateSourceInd;
    }

    /**
     * Data Added by
     * <p>
     * Lineage reference object : SHRTTRM_UPDATE_SOURCE_IND
     * 
     */
    @JsonProperty("updateSourceInd")
    public void setUpdateSourceInd(String updateSourceInd) {
        this.updateSourceInd = updateSourceInd;
    }

    public TermCourseMaintenanceTermHeaderInformation010GetResponse withUpdateSourceInd(String updateSourceInd) {
        this.updateSourceInd = updateSourceInd;
        return this;
    }

    /**
     * End of Term Academic Standing
     * <p>
     * Lineage reference object : SHRTTRM_ASTD_CODE_END_OF_TERM, Lookup lineage reference object : stvastd
     * 
     */
    @JsonProperty("astdCodeEndOfTerm")
    public String getAstdCodeEndOfTerm() {
        return astdCodeEndOfTerm;
    }

    /**
     * End of Term Academic Standing
     * <p>
     * Lineage reference object : SHRTTRM_ASTD_CODE_END_OF_TERM, Lookup lineage reference object : stvastd
     * 
     */
    @JsonProperty("astdCodeEndOfTerm")
    public void setAstdCodeEndOfTerm(String astdCodeEndOfTerm) {
        this.astdCodeEndOfTerm = astdCodeEndOfTerm;
    }

    public TermCourseMaintenanceTermHeaderInformation010GetResponse withAstdCodeEndOfTerm(String astdCodeEndOfTerm) {
        this.astdCodeEndOfTerm = astdCodeEndOfTerm;
        return this;
    }

    /**
     * End Of Term Academic Standing Date
     * <p>
     * Lineage reference object : SHRTTRM_ASTD_DATE_END_OF_TERM
     * 
     */
    @JsonProperty("astdDateEndOfTerm")
    public Date getAstdDateEndOfTerm() {
        return astdDateEndOfTerm;
    }

    /**
     * End Of Term Academic Standing Date
     * <p>
     * Lineage reference object : SHRTTRM_ASTD_DATE_END_OF_TERM
     * 
     */
    @JsonProperty("astdDateEndOfTerm")
    public void setAstdDateEndOfTerm(Date astdDateEndOfTerm) {
        this.astdDateEndOfTerm = astdDateEndOfTerm;
    }

    public TermCourseMaintenanceTermHeaderInformation010GetResponse withAstdDateEndOfTerm(Date astdDateEndOfTerm) {
        this.astdDateEndOfTerm = astdDateEndOfTerm;
        return this;
    }

    /**
     * Record Status Date
     * <p>
     * Lineage reference object : SHRTTRM_RECORD_STATUS_DATE
     * 
     */
    @JsonProperty("recordStatusDate")
    public Date getRecordStatusDate() {
        return recordStatusDate;
    }

    /**
     * Record Status Date
     * <p>
     * Lineage reference object : SHRTTRM_RECORD_STATUS_DATE
     * 
     */
    @JsonProperty("recordStatusDate")
    public void setRecordStatusDate(Date recordStatusDate) {
        this.recordStatusDate = recordStatusDate;
    }

    public TermCourseMaintenanceTermHeaderInformation010GetResponse withRecordStatusDate(Date recordStatusDate) {
        this.recordStatusDate = recordStatusDate;
        return this;
    }

    /**
     * Withdrawal Reason Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvwrsnDesc")
    public String getStvwrsnDesc() {
        return stvwrsnDesc;
    }

    /**
     * Withdrawal Reason Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvwrsnDesc")
    public void setStvwrsnDesc(String stvwrsnDesc) {
        this.stvwrsnDesc = stvwrsnDesc;
    }

    public TermCourseMaintenanceTermHeaderInformation010GetResponse withStvwrsnDesc(String stvwrsnDesc) {
        this.stvwrsnDesc = stvwrsnDesc;
        return this;
    }

    /**
     * Special Exam Credit Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvexamDesc")
    public String getStvexamDesc() {
        return stvexamDesc;
    }

    /**
     * Special Exam Credit Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvexamDesc")
    public void setStvexamDesc(String stvexamDesc) {
        this.stvexamDesc = stvexamDesc;
    }

    public TermCourseMaintenanceTermHeaderInformation010GetResponse withStvexamDesc(String stvexamDesc) {
        this.stvexamDesc = stvexamDesc;
        return this;
    }

    /**
     * Combined Academic Standing Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvcastDesc")
    public String getStvcastDesc() {
        return stvcastDesc;
    }

    /**
     * Combined Academic Standing Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvcastDesc")
    public void setStvcastDesc(String stvcastDesc) {
        this.stvcastDesc = stvcastDesc;
    }

    public TermCourseMaintenanceTermHeaderInformation010GetResponse withStvcastDesc(String stvcastDesc) {
        this.stvcastDesc = stvcastDesc;
        return this;
    }

    /**
     * Duplicate Mailer Request
     * <p>
     * Lineage reference object : SHRTTRM_GRADE_MAILER_DUP
     * 
     */
    @JsonProperty("gradeMailerDup")
    public String getGradeMailerDup() {
        return gradeMailerDup;
    }

    /**
     * Duplicate Mailer Request
     * <p>
     * Lineage reference object : SHRTTRM_GRADE_MAILER_DUP
     * 
     */
    @JsonProperty("gradeMailerDup")
    public void setGradeMailerDup(String gradeMailerDup) {
        this.gradeMailerDup = gradeMailerDup;
    }

    public TermCourseMaintenanceTermHeaderInformation010GetResponse withGradeMailerDup(String gradeMailerDup) {
        this.gradeMailerDup = gradeMailerDup;
        return this;
    }

    /**
     * Dean's List Status
     * <p>
     * Lineage reference object : SHRTTRM_ASTD_CODE_DL, Lookup lineage reference object : stvastd
     * 
     */
    @JsonProperty("astdCodeDl")
    public String getAstdCodeDl() {
        return astdCodeDl;
    }

    /**
     * Dean's List Status
     * <p>
     * Lineage reference object : SHRTTRM_ASTD_CODE_DL, Lookup lineage reference object : stvastd
     * 
     */
    @JsonProperty("astdCodeDl")
    public void setAstdCodeDl(String astdCodeDl) {
        this.astdCodeDl = astdCodeDl;
    }

    public TermCourseMaintenanceTermHeaderInformation010GetResponse withAstdCodeDl(String astdCodeDl) {
        this.astdCodeDl = astdCodeDl;
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

    public TermCourseMaintenanceTermHeaderInformation010GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TermCourseMaintenanceTermHeaderInformation010GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("gradeMailerDupDate");
        sb.append('=');
        sb.append(((this.gradeMailerDupDate == null)?"<null>":this.gradeMailerDupDate));
        sb.append(',');
        sb.append("recordStatusInd");
        sb.append('=');
        sb.append(((this.recordStatusInd == null)?"<null>":this.recordStatusInd));
        sb.append(',');
        sb.append("sobscpsDesc");
        sb.append('=');
        sb.append(((this.sobscpsDesc == null)?"<null>":this.sobscpsDesc));
        sb.append(',');
        sb.append("prevCode");
        sb.append('=');
        sb.append(((this.prevCode == null)?"<null>":this.prevCode));
        sb.append(',');
        sb.append("prevDate");
        sb.append('=');
        sb.append(((this.prevDate == null)?"<null>":this.prevDate));
        sb.append(',');
        sb.append("examCode");
        sb.append('=');
        sb.append(((this.examCode == null)?"<null>":this.examCode));
        sb.append(',');
        sb.append("astdDateDl");
        sb.append('=');
        sb.append(((this.astdDateDl == null)?"<null>":this.astdDateDl));
        sb.append(',');
        sb.append("stvprevDesc");
        sb.append('=');
        sb.append(((this.stvprevDesc == null)?"<null>":this.stvprevDesc));
        sb.append(',');
        sb.append("gradeMailerChgDate");
        sb.append('=');
        sb.append(((this.gradeMailerChgDate == null)?"<null>":this.gradeMailerChgDate));
        sb.append(',');
        sb.append("gradeMailingDate");
        sb.append('=');
        sb.append(((this.gradeMailingDate == null)?"<null>":this.gradeMailingDate));
        sb.append(',');
        sb.append("stvastdDescDeansl");
        sb.append('=');
        sb.append(((this.stvastdDescDeansl == null)?"<null>":this.stvastdDescDeansl));
        sb.append(',');
        sb.append("stvsbgiDesc");
        sb.append('=');
        sb.append(((this.stvsbgiDesc == null)?"<null>":this.stvsbgiDesc));
        sb.append(',');
        sb.append("stvastdDescStudent");
        sb.append('=');
        sb.append(((this.stvastdDescStudent == null)?"<null>":this.stvastdDescStudent));
        sb.append(',');
        sb.append("castCode");
        sb.append('=');
        sb.append(((this.castCode == null)?"<null>":this.castCode));
        sb.append(',');
        sb.append("castDate");
        sb.append('=');
        sb.append(((this.castDate == null)?"<null>":this.castDate));
        sb.append(',');
        sb.append("wrsnCode");
        sb.append('=');
        sb.append(((this.wrsnCode == null)?"<null>":this.wrsnCode));
        sb.append(',');
        sb.append("preCatalogInd");
        sb.append('=');
        sb.append(((this.preCatalogInd == null)?"<null>":this.preCatalogInd));
        sb.append(',');
        sb.append("sbgiCodeTrans");
        sb.append('=');
        sb.append(((this.sbgiCodeTrans == null)?"<null>":this.sbgiCodeTrans));
        sb.append(',');
        sb.append("scpsCode");
        sb.append('=');
        sb.append(((this.scpsCode == null)?"<null>":this.scpsCode));
        sb.append(',');
        sb.append("updateSourceInd");
        sb.append('=');
        sb.append(((this.updateSourceInd == null)?"<null>":this.updateSourceInd));
        sb.append(',');
        sb.append("astdCodeEndOfTerm");
        sb.append('=');
        sb.append(((this.astdCodeEndOfTerm == null)?"<null>":this.astdCodeEndOfTerm));
        sb.append(',');
        sb.append("astdDateEndOfTerm");
        sb.append('=');
        sb.append(((this.astdDateEndOfTerm == null)?"<null>":this.astdDateEndOfTerm));
        sb.append(',');
        sb.append("recordStatusDate");
        sb.append('=');
        sb.append(((this.recordStatusDate == null)?"<null>":this.recordStatusDate));
        sb.append(',');
        sb.append("stvwrsnDesc");
        sb.append('=');
        sb.append(((this.stvwrsnDesc == null)?"<null>":this.stvwrsnDesc));
        sb.append(',');
        sb.append("stvexamDesc");
        sb.append('=');
        sb.append(((this.stvexamDesc == null)?"<null>":this.stvexamDesc));
        sb.append(',');
        sb.append("stvcastDesc");
        sb.append('=');
        sb.append(((this.stvcastDesc == null)?"<null>":this.stvcastDesc));
        sb.append(',');
        sb.append("gradeMailerDup");
        sb.append('=');
        sb.append(((this.gradeMailerDup == null)?"<null>":this.gradeMailerDup));
        sb.append(',');
        sb.append("astdCodeDl");
        sb.append('=');
        sb.append(((this.astdCodeDl == null)?"<null>":this.astdCodeDl));
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
        result = ((result* 31)+((this.gradeMailerDupDate == null)? 0 :this.gradeMailerDupDate.hashCode()));
        result = ((result* 31)+((this.recordStatusInd == null)? 0 :this.recordStatusInd.hashCode()));
        result = ((result* 31)+((this.sobscpsDesc == null)? 0 :this.sobscpsDesc.hashCode()));
        result = ((result* 31)+((this.prevCode == null)? 0 :this.prevCode.hashCode()));
        result = ((result* 31)+((this.prevDate == null)? 0 :this.prevDate.hashCode()));
        result = ((result* 31)+((this.examCode == null)? 0 :this.examCode.hashCode()));
        result = ((result* 31)+((this.astdDateDl == null)? 0 :this.astdDateDl.hashCode()));
        result = ((result* 31)+((this.stvprevDesc == null)? 0 :this.stvprevDesc.hashCode()));
        result = ((result* 31)+((this.gradeMailerChgDate == null)? 0 :this.gradeMailerChgDate.hashCode()));
        result = ((result* 31)+((this.gradeMailingDate == null)? 0 :this.gradeMailingDate.hashCode()));
        result = ((result* 31)+((this.stvastdDescDeansl == null)? 0 :this.stvastdDescDeansl.hashCode()));
        result = ((result* 31)+((this.stvsbgiDesc == null)? 0 :this.stvsbgiDesc.hashCode()));
        result = ((result* 31)+((this.stvastdDescStudent == null)? 0 :this.stvastdDescStudent.hashCode()));
        result = ((result* 31)+((this.castCode == null)? 0 :this.castCode.hashCode()));
        result = ((result* 31)+((this.castDate == null)? 0 :this.castDate.hashCode()));
        result = ((result* 31)+((this.wrsnCode == null)? 0 :this.wrsnCode.hashCode()));
        result = ((result* 31)+((this.preCatalogInd == null)? 0 :this.preCatalogInd.hashCode()));
        result = ((result* 31)+((this.sbgiCodeTrans == null)? 0 :this.sbgiCodeTrans.hashCode()));
        result = ((result* 31)+((this.scpsCode == null)? 0 :this.scpsCode.hashCode()));
        result = ((result* 31)+((this.updateSourceInd == null)? 0 :this.updateSourceInd.hashCode()));
        result = ((result* 31)+((this.astdCodeEndOfTerm == null)? 0 :this.astdCodeEndOfTerm.hashCode()));
        result = ((result* 31)+((this.astdDateEndOfTerm == null)? 0 :this.astdDateEndOfTerm.hashCode()));
        result = ((result* 31)+((this.recordStatusDate == null)? 0 :this.recordStatusDate.hashCode()));
        result = ((result* 31)+((this.stvwrsnDesc == null)? 0 :this.stvwrsnDesc.hashCode()));
        result = ((result* 31)+((this.stvexamDesc == null)? 0 :this.stvexamDesc.hashCode()));
        result = ((result* 31)+((this.stvcastDesc == null)? 0 :this.stvcastDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.gradeMailerDup == null)? 0 :this.gradeMailerDup.hashCode()));
        result = ((result* 31)+((this.astdCodeDl == null)? 0 :this.astdCodeDl.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TermCourseMaintenanceTermHeaderInformation010GetResponse) == false) {
            return false;
        }
        TermCourseMaintenanceTermHeaderInformation010GetResponse rhs = ((TermCourseMaintenanceTermHeaderInformation010GetResponse) other);
        return ((((((((((((((((((((((((((((((this.gradeMailerDupDate == rhs.gradeMailerDupDate)||((this.gradeMailerDupDate!= null)&&this.gradeMailerDupDate.equals(rhs.gradeMailerDupDate)))&&((this.recordStatusInd == rhs.recordStatusInd)||((this.recordStatusInd!= null)&&this.recordStatusInd.equals(rhs.recordStatusInd))))&&((this.sobscpsDesc == rhs.sobscpsDesc)||((this.sobscpsDesc!= null)&&this.sobscpsDesc.equals(rhs.sobscpsDesc))))&&((this.prevCode == rhs.prevCode)||((this.prevCode!= null)&&this.prevCode.equals(rhs.prevCode))))&&((this.prevDate == rhs.prevDate)||((this.prevDate!= null)&&this.prevDate.equals(rhs.prevDate))))&&((this.examCode == rhs.examCode)||((this.examCode!= null)&&this.examCode.equals(rhs.examCode))))&&((this.astdDateDl == rhs.astdDateDl)||((this.astdDateDl!= null)&&this.astdDateDl.equals(rhs.astdDateDl))))&&((this.stvprevDesc == rhs.stvprevDesc)||((this.stvprevDesc!= null)&&this.stvprevDesc.equals(rhs.stvprevDesc))))&&((this.gradeMailerChgDate == rhs.gradeMailerChgDate)||((this.gradeMailerChgDate!= null)&&this.gradeMailerChgDate.equals(rhs.gradeMailerChgDate))))&&((this.gradeMailingDate == rhs.gradeMailingDate)||((this.gradeMailingDate!= null)&&this.gradeMailingDate.equals(rhs.gradeMailingDate))))&&((this.stvastdDescDeansl == rhs.stvastdDescDeansl)||((this.stvastdDescDeansl!= null)&&this.stvastdDescDeansl.equals(rhs.stvastdDescDeansl))))&&((this.stvsbgiDesc == rhs.stvsbgiDesc)||((this.stvsbgiDesc!= null)&&this.stvsbgiDesc.equals(rhs.stvsbgiDesc))))&&((this.stvastdDescStudent == rhs.stvastdDescStudent)||((this.stvastdDescStudent!= null)&&this.stvastdDescStudent.equals(rhs.stvastdDescStudent))))&&((this.castCode == rhs.castCode)||((this.castCode!= null)&&this.castCode.equals(rhs.castCode))))&&((this.castDate == rhs.castDate)||((this.castDate!= null)&&this.castDate.equals(rhs.castDate))))&&((this.wrsnCode == rhs.wrsnCode)||((this.wrsnCode!= null)&&this.wrsnCode.equals(rhs.wrsnCode))))&&((this.preCatalogInd == rhs.preCatalogInd)||((this.preCatalogInd!= null)&&this.preCatalogInd.equals(rhs.preCatalogInd))))&&((this.sbgiCodeTrans == rhs.sbgiCodeTrans)||((this.sbgiCodeTrans!= null)&&this.sbgiCodeTrans.equals(rhs.sbgiCodeTrans))))&&((this.scpsCode == rhs.scpsCode)||((this.scpsCode!= null)&&this.scpsCode.equals(rhs.scpsCode))))&&((this.updateSourceInd == rhs.updateSourceInd)||((this.updateSourceInd!= null)&&this.updateSourceInd.equals(rhs.updateSourceInd))))&&((this.astdCodeEndOfTerm == rhs.astdCodeEndOfTerm)||((this.astdCodeEndOfTerm!= null)&&this.astdCodeEndOfTerm.equals(rhs.astdCodeEndOfTerm))))&&((this.astdDateEndOfTerm == rhs.astdDateEndOfTerm)||((this.astdDateEndOfTerm!= null)&&this.astdDateEndOfTerm.equals(rhs.astdDateEndOfTerm))))&&((this.recordStatusDate == rhs.recordStatusDate)||((this.recordStatusDate!= null)&&this.recordStatusDate.equals(rhs.recordStatusDate))))&&((this.stvwrsnDesc == rhs.stvwrsnDesc)||((this.stvwrsnDesc!= null)&&this.stvwrsnDesc.equals(rhs.stvwrsnDesc))))&&((this.stvexamDesc == rhs.stvexamDesc)||((this.stvexamDesc!= null)&&this.stvexamDesc.equals(rhs.stvexamDesc))))&&((this.stvcastDesc == rhs.stvcastDesc)||((this.stvcastDesc!= null)&&this.stvcastDesc.equals(rhs.stvcastDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.gradeMailerDup == rhs.gradeMailerDup)||((this.gradeMailerDup!= null)&&this.gradeMailerDup.equals(rhs.gradeMailerDup))))&&((this.astdCodeDl == rhs.astdCodeDl)||((this.astdCodeDl!= null)&&this.astdCodeDl.equals(rhs.astdCodeDl))));
    }

}
