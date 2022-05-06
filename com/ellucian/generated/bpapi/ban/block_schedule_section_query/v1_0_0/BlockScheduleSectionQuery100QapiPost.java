
package com.ellucian.generated.bpapi.ban.block_schedule_section_query.v1_0_0;

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
    "keyblocTermCode",
    "keyblocBlckCode",
    "queryCrn",
    "multiBlock",
    "ssbsectSubjCode",
    "ssbsectCrseNumb",
    "ssbsectSeqNumb",
    "ssbsectSstsCode",
    "ssbsectPtrmCode",
    "ssbsectCreditHrs",
    "ssbsectBillHrs",
    "ssbsectGmodCode",
    "apprInd",
    "ssbsectCampCode",
    "ssbsectLinkIdent",
    "xlstGroup",
    "ssbsectSchdCode",
    "ssbsectInsmCode",
    "ssbsectRegFromDate",
    "ssbsectRegToDate",
    "ssbsectMaxEnrl",
    "ssbsectEnrl",
    "ssbsectSeatsAvail"
})
@Generated("jsonschema2pojo")
public class BlockScheduleSectionQuery100QapiPost {

    @JsonProperty("keyblocTermCode")
    private String keyblocTermCode;
    @JsonProperty("keyblocBlckCode")
    private String keyblocBlckCode;
    /**
     * CRN
     * <p>
     * 
     * 
     */
    @JsonProperty("queryCrn")
    private String queryCrn;
    /**
     * Multiple Blocks
     * <p>
     * 
     * 
     */
    @JsonProperty("multiBlock")
    private String multiBlock;
    /**
     * Subject
     * <p>
     * Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("ssbsectSubjCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvsubj")
    private String ssbsectSubjCode;
    /**
     * Course
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectCrseNumb")
    private String ssbsectCrseNumb;
    /**
     * Section
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectSeqNumb")
    private String ssbsectSeqNumb;
    /**
     * Status
     * <p>
     * Lookup lineage reference object : stvssts
     * 
     */
    @JsonProperty("ssbsectSstsCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvssts")
    private String ssbsectSstsCode;
    /**
     * Part of Term
     * <p>
     * Lookup lineage reference object : stvptrm
     * 
     */
    @JsonProperty("ssbsectPtrmCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvptrm")
    private String ssbsectPtrmCode;
    /**
     * Credit Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectCreditHrs")
    private Double ssbsectCreditHrs;
    /**
     * Billing Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectBillHrs")
    private Double ssbsectBillHrs;
    /**
     * Grade Mode
     * <p>
     * Lookup lineage reference object : stvgmod
     * 
     */
    @JsonProperty("ssbsectGmodCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvgmod")
    private String ssbsectGmodCode;
    /**
     * Special Approval
     * <p>
     * Lineage reference object : SSRBLCK_APPR_IND
     * 
     */
    @JsonProperty("apprInd")
    @JsonPropertyDescription("Lineage reference object : SSRBLCK_APPR_IND")
    private String apprInd;
    /**
     * Campus
     * <p>
     * Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("ssbsectCampCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvcamp")
    private String ssbsectCampCode;
    /**
     * Link Identifier
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectLinkIdent")
    private String ssbsectLinkIdent;
    /**
     * Cross List
     * <p>
     * 
     * 
     */
    @JsonProperty("xlstGroup")
    private String xlstGroup;
    /**
     * Schedule Type
     * <p>
     * Lookup lineage reference object : stvschd
     * 
     */
    @JsonProperty("ssbsectSchdCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvschd")
    private String ssbsectSchdCode;
    /**
     * Instructional Method
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectInsmCode")
    private String ssbsectInsmCode;
    /**
     * Registration From Date
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectRegFromDate")
    private Date ssbsectRegFromDate;
    /**
     * Registration To Date
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectRegToDate")
    private Date ssbsectRegToDate;
    /**
     * Maximum Enrollment
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectMaxEnrl")
    private Object ssbsectMaxEnrl;
    /**
     * Actual Enrollment
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectEnrl")
    private Object ssbsectEnrl;
    /**
     * Remaining Enrollment
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectSeatsAvail")
    private Object ssbsectSeatsAvail;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("keyblocTermCode")
    public String getKeyblocTermCode() {
        return keyblocTermCode;
    }

    @JsonProperty("keyblocTermCode")
    public void setKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
    }

    public BlockScheduleSectionQuery100QapiPost withKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
        return this;
    }

    @JsonProperty("keyblocBlckCode")
    public String getKeyblocBlckCode() {
        return keyblocBlckCode;
    }

    @JsonProperty("keyblocBlckCode")
    public void setKeyblocBlckCode(String keyblocBlckCode) {
        this.keyblocBlckCode = keyblocBlckCode;
    }

    public BlockScheduleSectionQuery100QapiPost withKeyblocBlckCode(String keyblocBlckCode) {
        this.keyblocBlckCode = keyblocBlckCode;
        return this;
    }

    /**
     * CRN
     * <p>
     * 
     * 
     */
    @JsonProperty("queryCrn")
    public String getQueryCrn() {
        return queryCrn;
    }

    /**
     * CRN
     * <p>
     * 
     * 
     */
    @JsonProperty("queryCrn")
    public void setQueryCrn(String queryCrn) {
        this.queryCrn = queryCrn;
    }

    public BlockScheduleSectionQuery100QapiPost withQueryCrn(String queryCrn) {
        this.queryCrn = queryCrn;
        return this;
    }

    /**
     * Multiple Blocks
     * <p>
     * 
     * 
     */
    @JsonProperty("multiBlock")
    public String getMultiBlock() {
        return multiBlock;
    }

    /**
     * Multiple Blocks
     * <p>
     * 
     * 
     */
    @JsonProperty("multiBlock")
    public void setMultiBlock(String multiBlock) {
        this.multiBlock = multiBlock;
    }

    public BlockScheduleSectionQuery100QapiPost withMultiBlock(String multiBlock) {
        this.multiBlock = multiBlock;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("ssbsectSubjCode")
    public String getSsbsectSubjCode() {
        return ssbsectSubjCode;
    }

    /**
     * Subject
     * <p>
     * Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("ssbsectSubjCode")
    public void setSsbsectSubjCode(String ssbsectSubjCode) {
        this.ssbsectSubjCode = ssbsectSubjCode;
    }

    public BlockScheduleSectionQuery100QapiPost withSsbsectSubjCode(String ssbsectSubjCode) {
        this.ssbsectSubjCode = ssbsectSubjCode;
        return this;
    }

    /**
     * Course
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectCrseNumb")
    public String getSsbsectCrseNumb() {
        return ssbsectCrseNumb;
    }

    /**
     * Course
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectCrseNumb")
    public void setSsbsectCrseNumb(String ssbsectCrseNumb) {
        this.ssbsectCrseNumb = ssbsectCrseNumb;
    }

    public BlockScheduleSectionQuery100QapiPost withSsbsectCrseNumb(String ssbsectCrseNumb) {
        this.ssbsectCrseNumb = ssbsectCrseNumb;
        return this;
    }

    /**
     * Section
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectSeqNumb")
    public String getSsbsectSeqNumb() {
        return ssbsectSeqNumb;
    }

    /**
     * Section
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectSeqNumb")
    public void setSsbsectSeqNumb(String ssbsectSeqNumb) {
        this.ssbsectSeqNumb = ssbsectSeqNumb;
    }

    public BlockScheduleSectionQuery100QapiPost withSsbsectSeqNumb(String ssbsectSeqNumb) {
        this.ssbsectSeqNumb = ssbsectSeqNumb;
        return this;
    }

    /**
     * Status
     * <p>
     * Lookup lineage reference object : stvssts
     * 
     */
    @JsonProperty("ssbsectSstsCode")
    public String getSsbsectSstsCode() {
        return ssbsectSstsCode;
    }

    /**
     * Status
     * <p>
     * Lookup lineage reference object : stvssts
     * 
     */
    @JsonProperty("ssbsectSstsCode")
    public void setSsbsectSstsCode(String ssbsectSstsCode) {
        this.ssbsectSstsCode = ssbsectSstsCode;
    }

    public BlockScheduleSectionQuery100QapiPost withSsbsectSstsCode(String ssbsectSstsCode) {
        this.ssbsectSstsCode = ssbsectSstsCode;
        return this;
    }

    /**
     * Part of Term
     * <p>
     * Lookup lineage reference object : stvptrm
     * 
     */
    @JsonProperty("ssbsectPtrmCode")
    public String getSsbsectPtrmCode() {
        return ssbsectPtrmCode;
    }

    /**
     * Part of Term
     * <p>
     * Lookup lineage reference object : stvptrm
     * 
     */
    @JsonProperty("ssbsectPtrmCode")
    public void setSsbsectPtrmCode(String ssbsectPtrmCode) {
        this.ssbsectPtrmCode = ssbsectPtrmCode;
    }

    public BlockScheduleSectionQuery100QapiPost withSsbsectPtrmCode(String ssbsectPtrmCode) {
        this.ssbsectPtrmCode = ssbsectPtrmCode;
        return this;
    }

    /**
     * Credit Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectCreditHrs")
    public Double getSsbsectCreditHrs() {
        return ssbsectCreditHrs;
    }

    /**
     * Credit Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectCreditHrs")
    public void setSsbsectCreditHrs(Double ssbsectCreditHrs) {
        this.ssbsectCreditHrs = ssbsectCreditHrs;
    }

    public BlockScheduleSectionQuery100QapiPost withSsbsectCreditHrs(Double ssbsectCreditHrs) {
        this.ssbsectCreditHrs = ssbsectCreditHrs;
        return this;
    }

    /**
     * Billing Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectBillHrs")
    public Double getSsbsectBillHrs() {
        return ssbsectBillHrs;
    }

    /**
     * Billing Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectBillHrs")
    public void setSsbsectBillHrs(Double ssbsectBillHrs) {
        this.ssbsectBillHrs = ssbsectBillHrs;
    }

    public BlockScheduleSectionQuery100QapiPost withSsbsectBillHrs(Double ssbsectBillHrs) {
        this.ssbsectBillHrs = ssbsectBillHrs;
        return this;
    }

    /**
     * Grade Mode
     * <p>
     * Lookup lineage reference object : stvgmod
     * 
     */
    @JsonProperty("ssbsectGmodCode")
    public String getSsbsectGmodCode() {
        return ssbsectGmodCode;
    }

    /**
     * Grade Mode
     * <p>
     * Lookup lineage reference object : stvgmod
     * 
     */
    @JsonProperty("ssbsectGmodCode")
    public void setSsbsectGmodCode(String ssbsectGmodCode) {
        this.ssbsectGmodCode = ssbsectGmodCode;
    }

    public BlockScheduleSectionQuery100QapiPost withSsbsectGmodCode(String ssbsectGmodCode) {
        this.ssbsectGmodCode = ssbsectGmodCode;
        return this;
    }

    /**
     * Special Approval
     * <p>
     * Lineage reference object : SSRBLCK_APPR_IND
     * 
     */
    @JsonProperty("apprInd")
    public String getApprInd() {
        return apprInd;
    }

    /**
     * Special Approval
     * <p>
     * Lineage reference object : SSRBLCK_APPR_IND
     * 
     */
    @JsonProperty("apprInd")
    public void setApprInd(String apprInd) {
        this.apprInd = apprInd;
    }

    public BlockScheduleSectionQuery100QapiPost withApprInd(String apprInd) {
        this.apprInd = apprInd;
        return this;
    }

    /**
     * Campus
     * <p>
     * Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("ssbsectCampCode")
    public String getSsbsectCampCode() {
        return ssbsectCampCode;
    }

    /**
     * Campus
     * <p>
     * Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("ssbsectCampCode")
    public void setSsbsectCampCode(String ssbsectCampCode) {
        this.ssbsectCampCode = ssbsectCampCode;
    }

    public BlockScheduleSectionQuery100QapiPost withSsbsectCampCode(String ssbsectCampCode) {
        this.ssbsectCampCode = ssbsectCampCode;
        return this;
    }

    /**
     * Link Identifier
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectLinkIdent")
    public String getSsbsectLinkIdent() {
        return ssbsectLinkIdent;
    }

    /**
     * Link Identifier
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectLinkIdent")
    public void setSsbsectLinkIdent(String ssbsectLinkIdent) {
        this.ssbsectLinkIdent = ssbsectLinkIdent;
    }

    public BlockScheduleSectionQuery100QapiPost withSsbsectLinkIdent(String ssbsectLinkIdent) {
        this.ssbsectLinkIdent = ssbsectLinkIdent;
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

    public BlockScheduleSectionQuery100QapiPost withXlstGroup(String xlstGroup) {
        this.xlstGroup = xlstGroup;
        return this;
    }

    /**
     * Schedule Type
     * <p>
     * Lookup lineage reference object : stvschd
     * 
     */
    @JsonProperty("ssbsectSchdCode")
    public String getSsbsectSchdCode() {
        return ssbsectSchdCode;
    }

    /**
     * Schedule Type
     * <p>
     * Lookup lineage reference object : stvschd
     * 
     */
    @JsonProperty("ssbsectSchdCode")
    public void setSsbsectSchdCode(String ssbsectSchdCode) {
        this.ssbsectSchdCode = ssbsectSchdCode;
    }

    public BlockScheduleSectionQuery100QapiPost withSsbsectSchdCode(String ssbsectSchdCode) {
        this.ssbsectSchdCode = ssbsectSchdCode;
        return this;
    }

    /**
     * Instructional Method
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectInsmCode")
    public String getSsbsectInsmCode() {
        return ssbsectInsmCode;
    }

    /**
     * Instructional Method
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectInsmCode")
    public void setSsbsectInsmCode(String ssbsectInsmCode) {
        this.ssbsectInsmCode = ssbsectInsmCode;
    }

    public BlockScheduleSectionQuery100QapiPost withSsbsectInsmCode(String ssbsectInsmCode) {
        this.ssbsectInsmCode = ssbsectInsmCode;
        return this;
    }

    /**
     * Registration From Date
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectRegFromDate")
    public Date getSsbsectRegFromDate() {
        return ssbsectRegFromDate;
    }

    /**
     * Registration From Date
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectRegFromDate")
    public void setSsbsectRegFromDate(Date ssbsectRegFromDate) {
        this.ssbsectRegFromDate = ssbsectRegFromDate;
    }

    public BlockScheduleSectionQuery100QapiPost withSsbsectRegFromDate(Date ssbsectRegFromDate) {
        this.ssbsectRegFromDate = ssbsectRegFromDate;
        return this;
    }

    /**
     * Registration To Date
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectRegToDate")
    public Date getSsbsectRegToDate() {
        return ssbsectRegToDate;
    }

    /**
     * Registration To Date
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectRegToDate")
    public void setSsbsectRegToDate(Date ssbsectRegToDate) {
        this.ssbsectRegToDate = ssbsectRegToDate;
    }

    public BlockScheduleSectionQuery100QapiPost withSsbsectRegToDate(Date ssbsectRegToDate) {
        this.ssbsectRegToDate = ssbsectRegToDate;
        return this;
    }

    /**
     * Maximum Enrollment
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectMaxEnrl")
    public Object getSsbsectMaxEnrl() {
        return ssbsectMaxEnrl;
    }

    /**
     * Maximum Enrollment
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectMaxEnrl")
    public void setSsbsectMaxEnrl(Object ssbsectMaxEnrl) {
        this.ssbsectMaxEnrl = ssbsectMaxEnrl;
    }

    public BlockScheduleSectionQuery100QapiPost withSsbsectMaxEnrl(Object ssbsectMaxEnrl) {
        this.ssbsectMaxEnrl = ssbsectMaxEnrl;
        return this;
    }

    /**
     * Actual Enrollment
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectEnrl")
    public Object getSsbsectEnrl() {
        return ssbsectEnrl;
    }

    /**
     * Actual Enrollment
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectEnrl")
    public void setSsbsectEnrl(Object ssbsectEnrl) {
        this.ssbsectEnrl = ssbsectEnrl;
    }

    public BlockScheduleSectionQuery100QapiPost withSsbsectEnrl(Object ssbsectEnrl) {
        this.ssbsectEnrl = ssbsectEnrl;
        return this;
    }

    /**
     * Remaining Enrollment
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectSeatsAvail")
    public Object getSsbsectSeatsAvail() {
        return ssbsectSeatsAvail;
    }

    /**
     * Remaining Enrollment
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectSeatsAvail")
    public void setSsbsectSeatsAvail(Object ssbsectSeatsAvail) {
        this.ssbsectSeatsAvail = ssbsectSeatsAvail;
    }

    public BlockScheduleSectionQuery100QapiPost withSsbsectSeatsAvail(Object ssbsectSeatsAvail) {
        this.ssbsectSeatsAvail = ssbsectSeatsAvail;
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

    public BlockScheduleSectionQuery100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BlockScheduleSectionQuery100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblocTermCode");
        sb.append('=');
        sb.append(((this.keyblocTermCode == null)?"<null>":this.keyblocTermCode));
        sb.append(',');
        sb.append("keyblocBlckCode");
        sb.append('=');
        sb.append(((this.keyblocBlckCode == null)?"<null>":this.keyblocBlckCode));
        sb.append(',');
        sb.append("queryCrn");
        sb.append('=');
        sb.append(((this.queryCrn == null)?"<null>":this.queryCrn));
        sb.append(',');
        sb.append("multiBlock");
        sb.append('=');
        sb.append(((this.multiBlock == null)?"<null>":this.multiBlock));
        sb.append(',');
        sb.append("ssbsectSubjCode");
        sb.append('=');
        sb.append(((this.ssbsectSubjCode == null)?"<null>":this.ssbsectSubjCode));
        sb.append(',');
        sb.append("ssbsectCrseNumb");
        sb.append('=');
        sb.append(((this.ssbsectCrseNumb == null)?"<null>":this.ssbsectCrseNumb));
        sb.append(',');
        sb.append("ssbsectSeqNumb");
        sb.append('=');
        sb.append(((this.ssbsectSeqNumb == null)?"<null>":this.ssbsectSeqNumb));
        sb.append(',');
        sb.append("ssbsectSstsCode");
        sb.append('=');
        sb.append(((this.ssbsectSstsCode == null)?"<null>":this.ssbsectSstsCode));
        sb.append(',');
        sb.append("ssbsectPtrmCode");
        sb.append('=');
        sb.append(((this.ssbsectPtrmCode == null)?"<null>":this.ssbsectPtrmCode));
        sb.append(',');
        sb.append("ssbsectCreditHrs");
        sb.append('=');
        sb.append(((this.ssbsectCreditHrs == null)?"<null>":this.ssbsectCreditHrs));
        sb.append(',');
        sb.append("ssbsectBillHrs");
        sb.append('=');
        sb.append(((this.ssbsectBillHrs == null)?"<null>":this.ssbsectBillHrs));
        sb.append(',');
        sb.append("ssbsectGmodCode");
        sb.append('=');
        sb.append(((this.ssbsectGmodCode == null)?"<null>":this.ssbsectGmodCode));
        sb.append(',');
        sb.append("apprInd");
        sb.append('=');
        sb.append(((this.apprInd == null)?"<null>":this.apprInd));
        sb.append(',');
        sb.append("ssbsectCampCode");
        sb.append('=');
        sb.append(((this.ssbsectCampCode == null)?"<null>":this.ssbsectCampCode));
        sb.append(',');
        sb.append("ssbsectLinkIdent");
        sb.append('=');
        sb.append(((this.ssbsectLinkIdent == null)?"<null>":this.ssbsectLinkIdent));
        sb.append(',');
        sb.append("xlstGroup");
        sb.append('=');
        sb.append(((this.xlstGroup == null)?"<null>":this.xlstGroup));
        sb.append(',');
        sb.append("ssbsectSchdCode");
        sb.append('=');
        sb.append(((this.ssbsectSchdCode == null)?"<null>":this.ssbsectSchdCode));
        sb.append(',');
        sb.append("ssbsectInsmCode");
        sb.append('=');
        sb.append(((this.ssbsectInsmCode == null)?"<null>":this.ssbsectInsmCode));
        sb.append(',');
        sb.append("ssbsectRegFromDate");
        sb.append('=');
        sb.append(((this.ssbsectRegFromDate == null)?"<null>":this.ssbsectRegFromDate));
        sb.append(',');
        sb.append("ssbsectRegToDate");
        sb.append('=');
        sb.append(((this.ssbsectRegToDate == null)?"<null>":this.ssbsectRegToDate));
        sb.append(',');
        sb.append("ssbsectMaxEnrl");
        sb.append('=');
        sb.append(((this.ssbsectMaxEnrl == null)?"<null>":this.ssbsectMaxEnrl));
        sb.append(',');
        sb.append("ssbsectEnrl");
        sb.append('=');
        sb.append(((this.ssbsectEnrl == null)?"<null>":this.ssbsectEnrl));
        sb.append(',');
        sb.append("ssbsectSeatsAvail");
        sb.append('=');
        sb.append(((this.ssbsectSeatsAvail == null)?"<null>":this.ssbsectSeatsAvail));
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
        result = ((result* 31)+((this.queryCrn == null)? 0 :this.queryCrn.hashCode()));
        result = ((result* 31)+((this.keyblocTermCode == null)? 0 :this.keyblocTermCode.hashCode()));
        result = ((result* 31)+((this.ssbsectSeqNumb == null)? 0 :this.ssbsectSeqNumb.hashCode()));
        result = ((result* 31)+((this.multiBlock == null)? 0 :this.multiBlock.hashCode()));
        result = ((result* 31)+((this.keyblocBlckCode == null)? 0 :this.keyblocBlckCode.hashCode()));
        result = ((result* 31)+((this.ssbsectCrseNumb == null)? 0 :this.ssbsectCrseNumb.hashCode()));
        result = ((result* 31)+((this.ssbsectSchdCode == null)? 0 :this.ssbsectSchdCode.hashCode()));
        result = ((result* 31)+((this.ssbsectSeatsAvail == null)? 0 :this.ssbsectSeatsAvail.hashCode()));
        result = ((result* 31)+((this.ssbsectPtrmCode == null)? 0 :this.ssbsectPtrmCode.hashCode()));
        result = ((result* 31)+((this.apprInd == null)? 0 :this.apprInd.hashCode()));
        result = ((result* 31)+((this.ssbsectEnrl == null)? 0 :this.ssbsectEnrl.hashCode()));
        result = ((result* 31)+((this.ssbsectMaxEnrl == null)? 0 :this.ssbsectMaxEnrl.hashCode()));
        result = ((result* 31)+((this.ssbsectRegToDate == null)? 0 :this.ssbsectRegToDate.hashCode()));
        result = ((result* 31)+((this.ssbsectLinkIdent == null)? 0 :this.ssbsectLinkIdent.hashCode()));
        result = ((result* 31)+((this.ssbsectCreditHrs == null)? 0 :this.ssbsectCreditHrs.hashCode()));
        result = ((result* 31)+((this.xlstGroup == null)? 0 :this.xlstGroup.hashCode()));
        result = ((result* 31)+((this.ssbsectSubjCode == null)? 0 :this.ssbsectSubjCode.hashCode()));
        result = ((result* 31)+((this.ssbsectSstsCode == null)? 0 :this.ssbsectSstsCode.hashCode()));
        result = ((result* 31)+((this.ssbsectCampCode == null)? 0 :this.ssbsectCampCode.hashCode()));
        result = ((result* 31)+((this.ssbsectRegFromDate == null)? 0 :this.ssbsectRegFromDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ssbsectGmodCode == null)? 0 :this.ssbsectGmodCode.hashCode()));
        result = ((result* 31)+((this.ssbsectBillHrs == null)? 0 :this.ssbsectBillHrs.hashCode()));
        result = ((result* 31)+((this.ssbsectInsmCode == null)? 0 :this.ssbsectInsmCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BlockScheduleSectionQuery100QapiPost) == false) {
            return false;
        }
        BlockScheduleSectionQuery100QapiPost rhs = ((BlockScheduleSectionQuery100QapiPost) other);
        return (((((((((((((((((((((((((this.queryCrn == rhs.queryCrn)||((this.queryCrn!= null)&&this.queryCrn.equals(rhs.queryCrn)))&&((this.keyblocTermCode == rhs.keyblocTermCode)||((this.keyblocTermCode!= null)&&this.keyblocTermCode.equals(rhs.keyblocTermCode))))&&((this.ssbsectSeqNumb == rhs.ssbsectSeqNumb)||((this.ssbsectSeqNumb!= null)&&this.ssbsectSeqNumb.equals(rhs.ssbsectSeqNumb))))&&((this.multiBlock == rhs.multiBlock)||((this.multiBlock!= null)&&this.multiBlock.equals(rhs.multiBlock))))&&((this.keyblocBlckCode == rhs.keyblocBlckCode)||((this.keyblocBlckCode!= null)&&this.keyblocBlckCode.equals(rhs.keyblocBlckCode))))&&((this.ssbsectCrseNumb == rhs.ssbsectCrseNumb)||((this.ssbsectCrseNumb!= null)&&this.ssbsectCrseNumb.equals(rhs.ssbsectCrseNumb))))&&((this.ssbsectSchdCode == rhs.ssbsectSchdCode)||((this.ssbsectSchdCode!= null)&&this.ssbsectSchdCode.equals(rhs.ssbsectSchdCode))))&&((this.ssbsectSeatsAvail == rhs.ssbsectSeatsAvail)||((this.ssbsectSeatsAvail!= null)&&this.ssbsectSeatsAvail.equals(rhs.ssbsectSeatsAvail))))&&((this.ssbsectPtrmCode == rhs.ssbsectPtrmCode)||((this.ssbsectPtrmCode!= null)&&this.ssbsectPtrmCode.equals(rhs.ssbsectPtrmCode))))&&((this.apprInd == rhs.apprInd)||((this.apprInd!= null)&&this.apprInd.equals(rhs.apprInd))))&&((this.ssbsectEnrl == rhs.ssbsectEnrl)||((this.ssbsectEnrl!= null)&&this.ssbsectEnrl.equals(rhs.ssbsectEnrl))))&&((this.ssbsectMaxEnrl == rhs.ssbsectMaxEnrl)||((this.ssbsectMaxEnrl!= null)&&this.ssbsectMaxEnrl.equals(rhs.ssbsectMaxEnrl))))&&((this.ssbsectRegToDate == rhs.ssbsectRegToDate)||((this.ssbsectRegToDate!= null)&&this.ssbsectRegToDate.equals(rhs.ssbsectRegToDate))))&&((this.ssbsectLinkIdent == rhs.ssbsectLinkIdent)||((this.ssbsectLinkIdent!= null)&&this.ssbsectLinkIdent.equals(rhs.ssbsectLinkIdent))))&&((this.ssbsectCreditHrs == rhs.ssbsectCreditHrs)||((this.ssbsectCreditHrs!= null)&&this.ssbsectCreditHrs.equals(rhs.ssbsectCreditHrs))))&&((this.xlstGroup == rhs.xlstGroup)||((this.xlstGroup!= null)&&this.xlstGroup.equals(rhs.xlstGroup))))&&((this.ssbsectSubjCode == rhs.ssbsectSubjCode)||((this.ssbsectSubjCode!= null)&&this.ssbsectSubjCode.equals(rhs.ssbsectSubjCode))))&&((this.ssbsectSstsCode == rhs.ssbsectSstsCode)||((this.ssbsectSstsCode!= null)&&this.ssbsectSstsCode.equals(rhs.ssbsectSstsCode))))&&((this.ssbsectCampCode == rhs.ssbsectCampCode)||((this.ssbsectCampCode!= null)&&this.ssbsectCampCode.equals(rhs.ssbsectCampCode))))&&((this.ssbsectRegFromDate == rhs.ssbsectRegFromDate)||((this.ssbsectRegFromDate!= null)&&this.ssbsectRegFromDate.equals(rhs.ssbsectRegFromDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ssbsectGmodCode == rhs.ssbsectGmodCode)||((this.ssbsectGmodCode!= null)&&this.ssbsectGmodCode.equals(rhs.ssbsectGmodCode))))&&((this.ssbsectBillHrs == rhs.ssbsectBillHrs)||((this.ssbsectBillHrs!= null)&&this.ssbsectBillHrs.equals(rhs.ssbsectBillHrs))))&&((this.ssbsectInsmCode == rhs.ssbsectInsmCode)||((this.ssbsectInsmCode!= null)&&this.ssbsectInsmCode.equals(rhs.ssbsectInsmCode))));
    }

}
