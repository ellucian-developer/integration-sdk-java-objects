
package com.ellucian.generated.bpapi.ban.course_section_information.v1_0_0;

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
    "gmodCode",
    "contHr",
    "gradableInd",
    "creditHrs",
    "xlstGroup",
    "linkIdent",
    "labHr",
    "tuiwInd",
    "title",
    "acctCode",
    "sessCode",
    "billHrs",
    "prntInd",
    "voiceAvail",
    "campCode",
    "saprCode",
    "lecHr",
    "sstsCode",
    "overrideDurInd",
    "seqNumb",
    "intgCde",
    "crn",
    "termCode",
    "othHr"
})
@Generated("jsonschema2pojo")
public class CourseSectionInformation100PutRequest {

    /**
     * Grade Mode
     * <p>
     * Lineage reference object : SSBSECT_GMOD_CODE, Lookup lineage reference object : stvgmod,scrgmod,scrgmod
     * 
     */
    @JsonProperty("gmodCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_GMOD_CODE, Lookup lineage reference object : stvgmod,scrgmod,scrgmod")
    private String gmodCode;
    /**
     * Lineage reference object : SSBSECT_CONT_HR
     * 
     */
    @JsonProperty("contHr")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_CONT_HR")
    private Double contHr;
    /**
     * Gradable
     * <p>
     * Lineage reference object : SSBSECT_GRADABLE_IND
     * 
     */
    @JsonProperty("gradableInd")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_GRADABLE_IND")
    private String gradableInd;
    /**
     * Lineage reference object : SSBSECT_CREDIT_HRS
     * 
     */
    @JsonProperty("creditHrs")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_CREDIT_HRS")
    private Double creditHrs;
    /**
     * Cross List
     * <p>
     * 
     * 
     */
    @JsonProperty("xlstGroup")
    private String xlstGroup;
    /**
     * Link Identifier
     * <p>
     * Lineage reference object : SSBSECT_LINK_IDENT
     * 
     */
    @JsonProperty("linkIdent")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_LINK_IDENT")
    private String linkIdent;
    /**
     * Lineage reference object : SSBSECT_LAB_HR
     * 
     */
    @JsonProperty("labHr")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_LAB_HR")
    private Double labHr;
    /**
     * Tuition and  Fee Waiver
     * <p>
     * Lineage reference object : SSBSECT_TUIW_IND
     * 
     */
    @JsonProperty("tuiwInd")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_TUIW_IND")
    private String tuiwInd;
    /**
     * Title
     * <p>
     * 
     * 
     */
    @JsonProperty("title")
    private String title;
    /**
     * Attendance Method
     * <p>
     * Lineage reference object : SSBSECT_ACCT_CODE, Lookup lineage reference object : stvacct
     * 
     */
    @JsonProperty("acctCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_ACCT_CODE, Lookup lineage reference object : stvacct")
    private String acctCode;
    /**
     * Session
     * <p>
     * Lineage reference object : SSBSECT_SESS_CODE, Lookup lineage reference object : stvsess
     * 
     */
    @JsonProperty("sessCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_SESS_CODE, Lookup lineage reference object : stvsess")
    private String sessCode;
    /**
     * Lineage reference object : SSBSECT_BILL_HRS
     * 
     */
    @JsonProperty("billHrs")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_BILL_HRS")
    private Double billHrs;
    /**
     * Print
     * <p>
     * Lineage reference object : SSBSECT_PRNT_IND
     * 
     */
    @JsonProperty("prntInd")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_PRNT_IND")
    private String prntInd;
    /**
     * Voice Response and Self-Service Available
     * <p>
     * Lineage reference object : SSBSECT_VOICE_AVAIL
     * 
     */
    @JsonProperty("voiceAvail")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_VOICE_AVAIL")
    private String voiceAvail;
    /**
     * Campus
     * <p>
     * Lineage reference object : SSBSECT_CAMP_CODE, Lookup lineage reference object : stvcamp
     * (Required)
     * 
     */
    @JsonProperty("campCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_CAMP_CODE, Lookup lineage reference object : stvcamp")
    private String campCode;
    /**
     * Special Approval
     * <p>
     * Lineage reference object : SSBSECT_SAPR_CODE, Lookup lineage reference object : stvsapr
     * 
     */
    @JsonProperty("saprCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_SAPR_CODE, Lookup lineage reference object : stvsapr")
    private String saprCode;
    /**
     * Lineage reference object : SSBSECT_LEC_HR
     * 
     */
    @JsonProperty("lecHr")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_LEC_HR")
    private Double lecHr;
    /**
     * Status
     * <p>
     * Lineage reference object : SSBSECT_SSTS_CODE, Lookup lineage reference object : stvssts
     * (Required)
     * 
     */
    @JsonProperty("sstsCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_SSTS_CODE, Lookup lineage reference object : stvssts")
    private String sstsCode;
    /**
     * Lineage reference object : SSBSECT_OVERRIDE_DUR_IND
     * 
     */
    @JsonProperty("overrideDurInd")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_OVERRIDE_DUR_IND")
    private String overrideDurInd;
    /**
     * Section
     * <p>
     * Lineage reference object : SSBSECT_SEQ_NUMB
     * (Required)
     * 
     */
    @JsonProperty("seqNumb")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_SEQ_NUMB")
    private String seqNumb;
    /**
     * Integration Partner
     * <p>
     * Lineage reference object : SSBSECT_INTG_CDE
     * 
     */
    @JsonProperty("intgCde")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_INTG_CDE")
    private String intgCde;
    /**
     * CRN
     * <p>
     * Lineage reference object : ssasectCrn
     * 
     */
    @JsonProperty("crn")
    @JsonPropertyDescription("Lineage reference object : ssasectCrn")
    private Object crn;
    /**
     * Term
     * <p>
     * Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm")
    private Object termCode;
    /**
     * Lineage reference object : SSBSECT_OTH_HR
     * 
     */
    @JsonProperty("othHr")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_OTH_HR")
    private Double othHr;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Grade Mode
     * <p>
     * Lineage reference object : SSBSECT_GMOD_CODE, Lookup lineage reference object : stvgmod,scrgmod,scrgmod
     * 
     */
    @JsonProperty("gmodCode")
    public String getGmodCode() {
        return gmodCode;
    }

    /**
     * Grade Mode
     * <p>
     * Lineage reference object : SSBSECT_GMOD_CODE, Lookup lineage reference object : stvgmod,scrgmod,scrgmod
     * 
     */
    @JsonProperty("gmodCode")
    public void setGmodCode(String gmodCode) {
        this.gmodCode = gmodCode;
    }

    public CourseSectionInformation100PutRequest withGmodCode(String gmodCode) {
        this.gmodCode = gmodCode;
        return this;
    }

    /**
     * Lineage reference object : SSBSECT_CONT_HR
     * 
     */
    @JsonProperty("contHr")
    public Double getContHr() {
        return contHr;
    }

    /**
     * Lineage reference object : SSBSECT_CONT_HR
     * 
     */
    @JsonProperty("contHr")
    public void setContHr(Double contHr) {
        this.contHr = contHr;
    }

    public CourseSectionInformation100PutRequest withContHr(Double contHr) {
        this.contHr = contHr;
        return this;
    }

    /**
     * Gradable
     * <p>
     * Lineage reference object : SSBSECT_GRADABLE_IND
     * 
     */
    @JsonProperty("gradableInd")
    public String getGradableInd() {
        return gradableInd;
    }

    /**
     * Gradable
     * <p>
     * Lineage reference object : SSBSECT_GRADABLE_IND
     * 
     */
    @JsonProperty("gradableInd")
    public void setGradableInd(String gradableInd) {
        this.gradableInd = gradableInd;
    }

    public CourseSectionInformation100PutRequest withGradableInd(String gradableInd) {
        this.gradableInd = gradableInd;
        return this;
    }

    /**
     * Lineage reference object : SSBSECT_CREDIT_HRS
     * 
     */
    @JsonProperty("creditHrs")
    public Double getCreditHrs() {
        return creditHrs;
    }

    /**
     * Lineage reference object : SSBSECT_CREDIT_HRS
     * 
     */
    @JsonProperty("creditHrs")
    public void setCreditHrs(Double creditHrs) {
        this.creditHrs = creditHrs;
    }

    public CourseSectionInformation100PutRequest withCreditHrs(Double creditHrs) {
        this.creditHrs = creditHrs;
        return this;
    }

    /**
     * Cross List
     * <p>
     * 
     * 
     */
    @JsonProperty("xlstGroup")
    public String getXlstGroup() {
        return xlstGroup;
    }

    /**
     * Cross List
     * <p>
     * 
     * 
     */
    @JsonProperty("xlstGroup")
    public void setXlstGroup(String xlstGroup) {
        this.xlstGroup = xlstGroup;
    }

    public CourseSectionInformation100PutRequest withXlstGroup(String xlstGroup) {
        this.xlstGroup = xlstGroup;
        return this;
    }

    /**
     * Link Identifier
     * <p>
     * Lineage reference object : SSBSECT_LINK_IDENT
     * 
     */
    @JsonProperty("linkIdent")
    public String getLinkIdent() {
        return linkIdent;
    }

    /**
     * Link Identifier
     * <p>
     * Lineage reference object : SSBSECT_LINK_IDENT
     * 
     */
    @JsonProperty("linkIdent")
    public void setLinkIdent(String linkIdent) {
        this.linkIdent = linkIdent;
    }

    public CourseSectionInformation100PutRequest withLinkIdent(String linkIdent) {
        this.linkIdent = linkIdent;
        return this;
    }

    /**
     * Lineage reference object : SSBSECT_LAB_HR
     * 
     */
    @JsonProperty("labHr")
    public Double getLabHr() {
        return labHr;
    }

    /**
     * Lineage reference object : SSBSECT_LAB_HR
     * 
     */
    @JsonProperty("labHr")
    public void setLabHr(Double labHr) {
        this.labHr = labHr;
    }

    public CourseSectionInformation100PutRequest withLabHr(Double labHr) {
        this.labHr = labHr;
        return this;
    }

    /**
     * Tuition and  Fee Waiver
     * <p>
     * Lineage reference object : SSBSECT_TUIW_IND
     * 
     */
    @JsonProperty("tuiwInd")
    public String getTuiwInd() {
        return tuiwInd;
    }

    /**
     * Tuition and  Fee Waiver
     * <p>
     * Lineage reference object : SSBSECT_TUIW_IND
     * 
     */
    @JsonProperty("tuiwInd")
    public void setTuiwInd(String tuiwInd) {
        this.tuiwInd = tuiwInd;
    }

    public CourseSectionInformation100PutRequest withTuiwInd(String tuiwInd) {
        this.tuiwInd = tuiwInd;
        return this;
    }

    /**
     * Title
     * <p>
     * 
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * 
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public CourseSectionInformation100PutRequest withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Attendance Method
     * <p>
     * Lineage reference object : SSBSECT_ACCT_CODE, Lookup lineage reference object : stvacct
     * 
     */
    @JsonProperty("acctCode")
    public String getAcctCode() {
        return acctCode;
    }

    /**
     * Attendance Method
     * <p>
     * Lineage reference object : SSBSECT_ACCT_CODE, Lookup lineage reference object : stvacct
     * 
     */
    @JsonProperty("acctCode")
    public void setAcctCode(String acctCode) {
        this.acctCode = acctCode;
    }

    public CourseSectionInformation100PutRequest withAcctCode(String acctCode) {
        this.acctCode = acctCode;
        return this;
    }

    /**
     * Session
     * <p>
     * Lineage reference object : SSBSECT_SESS_CODE, Lookup lineage reference object : stvsess
     * 
     */
    @JsonProperty("sessCode")
    public String getSessCode() {
        return sessCode;
    }

    /**
     * Session
     * <p>
     * Lineage reference object : SSBSECT_SESS_CODE, Lookup lineage reference object : stvsess
     * 
     */
    @JsonProperty("sessCode")
    public void setSessCode(String sessCode) {
        this.sessCode = sessCode;
    }

    public CourseSectionInformation100PutRequest withSessCode(String sessCode) {
        this.sessCode = sessCode;
        return this;
    }

    /**
     * Lineage reference object : SSBSECT_BILL_HRS
     * 
     */
    @JsonProperty("billHrs")
    public Double getBillHrs() {
        return billHrs;
    }

    /**
     * Lineage reference object : SSBSECT_BILL_HRS
     * 
     */
    @JsonProperty("billHrs")
    public void setBillHrs(Double billHrs) {
        this.billHrs = billHrs;
    }

    public CourseSectionInformation100PutRequest withBillHrs(Double billHrs) {
        this.billHrs = billHrs;
        return this;
    }

    /**
     * Print
     * <p>
     * Lineage reference object : SSBSECT_PRNT_IND
     * 
     */
    @JsonProperty("prntInd")
    public String getPrntInd() {
        return prntInd;
    }

    /**
     * Print
     * <p>
     * Lineage reference object : SSBSECT_PRNT_IND
     * 
     */
    @JsonProperty("prntInd")
    public void setPrntInd(String prntInd) {
        this.prntInd = prntInd;
    }

    public CourseSectionInformation100PutRequest withPrntInd(String prntInd) {
        this.prntInd = prntInd;
        return this;
    }

    /**
     * Voice Response and Self-Service Available
     * <p>
     * Lineage reference object : SSBSECT_VOICE_AVAIL
     * 
     */
    @JsonProperty("voiceAvail")
    public String getVoiceAvail() {
        return voiceAvail;
    }

    /**
     * Voice Response and Self-Service Available
     * <p>
     * Lineage reference object : SSBSECT_VOICE_AVAIL
     * 
     */
    @JsonProperty("voiceAvail")
    public void setVoiceAvail(String voiceAvail) {
        this.voiceAvail = voiceAvail;
    }

    public CourseSectionInformation100PutRequest withVoiceAvail(String voiceAvail) {
        this.voiceAvail = voiceAvail;
        return this;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SSBSECT_CAMP_CODE, Lookup lineage reference object : stvcamp
     * (Required)
     * 
     */
    @JsonProperty("campCode")
    public String getCampCode() {
        return campCode;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SSBSECT_CAMP_CODE, Lookup lineage reference object : stvcamp
     * (Required)
     * 
     */
    @JsonProperty("campCode")
    public void setCampCode(String campCode) {
        this.campCode = campCode;
    }

    public CourseSectionInformation100PutRequest withCampCode(String campCode) {
        this.campCode = campCode;
        return this;
    }

    /**
     * Special Approval
     * <p>
     * Lineage reference object : SSBSECT_SAPR_CODE, Lookup lineage reference object : stvsapr
     * 
     */
    @JsonProperty("saprCode")
    public String getSaprCode() {
        return saprCode;
    }

    /**
     * Special Approval
     * <p>
     * Lineage reference object : SSBSECT_SAPR_CODE, Lookup lineage reference object : stvsapr
     * 
     */
    @JsonProperty("saprCode")
    public void setSaprCode(String saprCode) {
        this.saprCode = saprCode;
    }

    public CourseSectionInformation100PutRequest withSaprCode(String saprCode) {
        this.saprCode = saprCode;
        return this;
    }

    /**
     * Lineage reference object : SSBSECT_LEC_HR
     * 
     */
    @JsonProperty("lecHr")
    public Double getLecHr() {
        return lecHr;
    }

    /**
     * Lineage reference object : SSBSECT_LEC_HR
     * 
     */
    @JsonProperty("lecHr")
    public void setLecHr(Double lecHr) {
        this.lecHr = lecHr;
    }

    public CourseSectionInformation100PutRequest withLecHr(Double lecHr) {
        this.lecHr = lecHr;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SSBSECT_SSTS_CODE, Lookup lineage reference object : stvssts
     * (Required)
     * 
     */
    @JsonProperty("sstsCode")
    public String getSstsCode() {
        return sstsCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SSBSECT_SSTS_CODE, Lookup lineage reference object : stvssts
     * (Required)
     * 
     */
    @JsonProperty("sstsCode")
    public void setSstsCode(String sstsCode) {
        this.sstsCode = sstsCode;
    }

    public CourseSectionInformation100PutRequest withSstsCode(String sstsCode) {
        this.sstsCode = sstsCode;
        return this;
    }

    /**
     * Lineage reference object : SSBSECT_OVERRIDE_DUR_IND
     * 
     */
    @JsonProperty("overrideDurInd")
    public String getOverrideDurInd() {
        return overrideDurInd;
    }

    /**
     * Lineage reference object : SSBSECT_OVERRIDE_DUR_IND
     * 
     */
    @JsonProperty("overrideDurInd")
    public void setOverrideDurInd(String overrideDurInd) {
        this.overrideDurInd = overrideDurInd;
    }

    public CourseSectionInformation100PutRequest withOverrideDurInd(String overrideDurInd) {
        this.overrideDurInd = overrideDurInd;
        return this;
    }

    /**
     * Section
     * <p>
     * Lineage reference object : SSBSECT_SEQ_NUMB
     * (Required)
     * 
     */
    @JsonProperty("seqNumb")
    public String getSeqNumb() {
        return seqNumb;
    }

    /**
     * Section
     * <p>
     * Lineage reference object : SSBSECT_SEQ_NUMB
     * (Required)
     * 
     */
    @JsonProperty("seqNumb")
    public void setSeqNumb(String seqNumb) {
        this.seqNumb = seqNumb;
    }

    public CourseSectionInformation100PutRequest withSeqNumb(String seqNumb) {
        this.seqNumb = seqNumb;
        return this;
    }

    /**
     * Integration Partner
     * <p>
     * Lineage reference object : SSBSECT_INTG_CDE
     * 
     */
    @JsonProperty("intgCde")
    public String getIntgCde() {
        return intgCde;
    }

    /**
     * Integration Partner
     * <p>
     * Lineage reference object : SSBSECT_INTG_CDE
     * 
     */
    @JsonProperty("intgCde")
    public void setIntgCde(String intgCde) {
        this.intgCde = intgCde;
    }

    public CourseSectionInformation100PutRequest withIntgCde(String intgCde) {
        this.intgCde = intgCde;
        return this;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : ssasectCrn
     * 
     */
    @JsonProperty("crn")
    public Object getCrn() {
        return crn;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : ssasectCrn
     * 
     */
    @JsonProperty("crn")
    public void setCrn(Object crn) {
        this.crn = crn;
    }

    public CourseSectionInformation100PutRequest withCrn(Object crn) {
        this.crn = crn;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public Object getTermCode() {
        return termCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(Object termCode) {
        this.termCode = termCode;
    }

    public CourseSectionInformation100PutRequest withTermCode(Object termCode) {
        this.termCode = termCode;
        return this;
    }

    /**
     * Lineage reference object : SSBSECT_OTH_HR
     * 
     */
    @JsonProperty("othHr")
    public Double getOthHr() {
        return othHr;
    }

    /**
     * Lineage reference object : SSBSECT_OTH_HR
     * 
     */
    @JsonProperty("othHr")
    public void setOthHr(Double othHr) {
        this.othHr = othHr;
    }

    public CourseSectionInformation100PutRequest withOthHr(Double othHr) {
        this.othHr = othHr;
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

    public CourseSectionInformation100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CourseSectionInformation100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("gmodCode");
        sb.append('=');
        sb.append(((this.gmodCode == null)?"<null>":this.gmodCode));
        sb.append(',');
        sb.append("contHr");
        sb.append('=');
        sb.append(((this.contHr == null)?"<null>":this.contHr));
        sb.append(',');
        sb.append("gradableInd");
        sb.append('=');
        sb.append(((this.gradableInd == null)?"<null>":this.gradableInd));
        sb.append(',');
        sb.append("creditHrs");
        sb.append('=');
        sb.append(((this.creditHrs == null)?"<null>":this.creditHrs));
        sb.append(',');
        sb.append("xlstGroup");
        sb.append('=');
        sb.append(((this.xlstGroup == null)?"<null>":this.xlstGroup));
        sb.append(',');
        sb.append("linkIdent");
        sb.append('=');
        sb.append(((this.linkIdent == null)?"<null>":this.linkIdent));
        sb.append(',');
        sb.append("labHr");
        sb.append('=');
        sb.append(((this.labHr == null)?"<null>":this.labHr));
        sb.append(',');
        sb.append("tuiwInd");
        sb.append('=');
        sb.append(((this.tuiwInd == null)?"<null>":this.tuiwInd));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("acctCode");
        sb.append('=');
        sb.append(((this.acctCode == null)?"<null>":this.acctCode));
        sb.append(',');
        sb.append("sessCode");
        sb.append('=');
        sb.append(((this.sessCode == null)?"<null>":this.sessCode));
        sb.append(',');
        sb.append("billHrs");
        sb.append('=');
        sb.append(((this.billHrs == null)?"<null>":this.billHrs));
        sb.append(',');
        sb.append("prntInd");
        sb.append('=');
        sb.append(((this.prntInd == null)?"<null>":this.prntInd));
        sb.append(',');
        sb.append("voiceAvail");
        sb.append('=');
        sb.append(((this.voiceAvail == null)?"<null>":this.voiceAvail));
        sb.append(',');
        sb.append("campCode");
        sb.append('=');
        sb.append(((this.campCode == null)?"<null>":this.campCode));
        sb.append(',');
        sb.append("saprCode");
        sb.append('=');
        sb.append(((this.saprCode == null)?"<null>":this.saprCode));
        sb.append(',');
        sb.append("lecHr");
        sb.append('=');
        sb.append(((this.lecHr == null)?"<null>":this.lecHr));
        sb.append(',');
        sb.append("sstsCode");
        sb.append('=');
        sb.append(((this.sstsCode == null)?"<null>":this.sstsCode));
        sb.append(',');
        sb.append("overrideDurInd");
        sb.append('=');
        sb.append(((this.overrideDurInd == null)?"<null>":this.overrideDurInd));
        sb.append(',');
        sb.append("seqNumb");
        sb.append('=');
        sb.append(((this.seqNumb == null)?"<null>":this.seqNumb));
        sb.append(',');
        sb.append("intgCde");
        sb.append('=');
        sb.append(((this.intgCde == null)?"<null>":this.intgCde));
        sb.append(',');
        sb.append("crn");
        sb.append('=');
        sb.append(((this.crn == null)?"<null>":this.crn));
        sb.append(',');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
        sb.append(',');
        sb.append("othHr");
        sb.append('=');
        sb.append(((this.othHr == null)?"<null>":this.othHr));
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
        result = ((result* 31)+((this.creditHrs == null)? 0 :this.creditHrs.hashCode()));
        result = ((result* 31)+((this.tuiwInd == null)? 0 :this.tuiwInd.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.sessCode == null)? 0 :this.sessCode.hashCode()));
        result = ((result* 31)+((this.billHrs == null)? 0 :this.billHrs.hashCode()));
        result = ((result* 31)+((this.voiceAvail == null)? 0 :this.voiceAvail.hashCode()));
        result = ((result* 31)+((this.campCode == null)? 0 :this.campCode.hashCode()));
        result = ((result* 31)+((this.lecHr == null)? 0 :this.lecHr.hashCode()));
        result = ((result* 31)+((this.sstsCode == null)? 0 :this.sstsCode.hashCode()));
        result = ((result* 31)+((this.intgCde == null)? 0 :this.intgCde.hashCode()));
        result = ((result* 31)+((this.crn == null)? 0 :this.crn.hashCode()));
        result = ((result* 31)+((this.othHr == null)? 0 :this.othHr.hashCode()));
        result = ((result* 31)+((this.gmodCode == null)? 0 :this.gmodCode.hashCode()));
        result = ((result* 31)+((this.contHr == null)? 0 :this.contHr.hashCode()));
        result = ((result* 31)+((this.gradableInd == null)? 0 :this.gradableInd.hashCode()));
        result = ((result* 31)+((this.xlstGroup == null)? 0 :this.xlstGroup.hashCode()));
        result = ((result* 31)+((this.linkIdent == null)? 0 :this.linkIdent.hashCode()));
        result = ((result* 31)+((this.labHr == null)? 0 :this.labHr.hashCode()));
        result = ((result* 31)+((this.acctCode == null)? 0 :this.acctCode.hashCode()));
        result = ((result* 31)+((this.prntInd == null)? 0 :this.prntInd.hashCode()));
        result = ((result* 31)+((this.saprCode == null)? 0 :this.saprCode.hashCode()));
        result = ((result* 31)+((this.overrideDurInd == null)? 0 :this.overrideDurInd.hashCode()));
        result = ((result* 31)+((this.seqNumb == null)? 0 :this.seqNumb.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CourseSectionInformation100PutRequest) == false) {
            return false;
        }
        CourseSectionInformation100PutRequest rhs = ((CourseSectionInformation100PutRequest) other);
        return ((((((((((((((((((((((((((this.creditHrs == rhs.creditHrs)||((this.creditHrs!= null)&&this.creditHrs.equals(rhs.creditHrs)))&&((this.tuiwInd == rhs.tuiwInd)||((this.tuiwInd!= null)&&this.tuiwInd.equals(rhs.tuiwInd))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.sessCode == rhs.sessCode)||((this.sessCode!= null)&&this.sessCode.equals(rhs.sessCode))))&&((this.billHrs == rhs.billHrs)||((this.billHrs!= null)&&this.billHrs.equals(rhs.billHrs))))&&((this.voiceAvail == rhs.voiceAvail)||((this.voiceAvail!= null)&&this.voiceAvail.equals(rhs.voiceAvail))))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.lecHr == rhs.lecHr)||((this.lecHr!= null)&&this.lecHr.equals(rhs.lecHr))))&&((this.sstsCode == rhs.sstsCode)||((this.sstsCode!= null)&&this.sstsCode.equals(rhs.sstsCode))))&&((this.intgCde == rhs.intgCde)||((this.intgCde!= null)&&this.intgCde.equals(rhs.intgCde))))&&((this.crn == rhs.crn)||((this.crn!= null)&&this.crn.equals(rhs.crn))))&&((this.othHr == rhs.othHr)||((this.othHr!= null)&&this.othHr.equals(rhs.othHr))))&&((this.gmodCode == rhs.gmodCode)||((this.gmodCode!= null)&&this.gmodCode.equals(rhs.gmodCode))))&&((this.contHr == rhs.contHr)||((this.contHr!= null)&&this.contHr.equals(rhs.contHr))))&&((this.gradableInd == rhs.gradableInd)||((this.gradableInd!= null)&&this.gradableInd.equals(rhs.gradableInd))))&&((this.xlstGroup == rhs.xlstGroup)||((this.xlstGroup!= null)&&this.xlstGroup.equals(rhs.xlstGroup))))&&((this.linkIdent == rhs.linkIdent)||((this.linkIdent!= null)&&this.linkIdent.equals(rhs.linkIdent))))&&((this.labHr == rhs.labHr)||((this.labHr!= null)&&this.labHr.equals(rhs.labHr))))&&((this.acctCode == rhs.acctCode)||((this.acctCode!= null)&&this.acctCode.equals(rhs.acctCode))))&&((this.prntInd == rhs.prntInd)||((this.prntInd!= null)&&this.prntInd.equals(rhs.prntInd))))&&((this.saprCode == rhs.saprCode)||((this.saprCode!= null)&&this.saprCode.equals(rhs.saprCode))))&&((this.overrideDurInd == rhs.overrideDurInd)||((this.overrideDurInd!= null)&&this.overrideDurInd.equals(rhs.overrideDurInd))))&&((this.seqNumb == rhs.seqNumb)||((this.seqNumb!= null)&&this.seqNumb.equals(rhs.seqNumb))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
