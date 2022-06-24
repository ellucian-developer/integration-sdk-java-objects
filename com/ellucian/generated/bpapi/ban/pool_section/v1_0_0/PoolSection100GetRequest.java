
package com.ellucian.generated.bpapi.ban.pool_section.v1_0_0;

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
    "ssbsectDuntCode",
    "ssbsectSeqNumb",
    "ssbsectCrn",
    "ssbsectReservedInd",
    "SSBSECT.ssbsectSubjCode",
    "ssbsectCrseNumb",
    "poolInd",
    "ssbsectSchdCode",
    "ssbsectSeatsAvail",
    "keyblocTermCodeEff",
    "ssbsectPtrmCode",
    "ssbsectEnrl",
    "ssbsectMaxEnrl",
    "ssbsectLinkIdent",
    "ssbsectCreditHrs",
    "keyBlckSessCode",
    "ssbsectSubjCode",
    "ssbsectNumberOfUnits",
    "ssbsectSessCode",
    "ssbsectSstsCode",
    "ssbsectCampCode",
    "scbcrkyCrseNumb",
    "blckCode",
    "keyBlckCampCode",
    "ssbsectInsmCode"
})
@Generated("jsonschema2pojo")
public class PoolSection100GetRequest {

    /**
     * Unit
     * <p>
     * Lineage reference object : SSBSECT_DUNT_CODE
     * 
     */
    @JsonProperty("ssbsectDuntCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_DUNT_CODE")
    private String ssbsectDuntCode;
    /**
     * Section
     * <p>
     * Lineage reference object : SSBSECT_SEQ_NUMB
     * 
     */
    @JsonProperty("ssbsectSeqNumb")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_SEQ_NUMB")
    private String ssbsectSeqNumb;
    /**
     * CRN
     * <p>
     * Lineage reference object : SSBSECT_CRN
     * 
     */
    @JsonProperty("ssbsectCrn")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_CRN")
    private String ssbsectCrn;
    /**
     * Reserved Seats
     * <p>
     * Lineage reference object : SSBSECT_RESERVED_IND
     * 
     */
    @JsonProperty("ssbsectReservedInd")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_RESERVED_IND")
    private String ssbsectReservedInd;
    /**
     * Subject
     * <p>
     * Lineage reference object : SSBSECT_SUBJ_CODE
     * 
     */
    @JsonProperty("SSBSECT.ssbsectSubjCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_SUBJ_CODE")
    private String sSBSECTSsbsectSubjCode;
    /**
     * Course
     * <p>
     * Lineage reference object : SSBSECT_CRSE_NUMB
     * 
     */
    @JsonProperty("ssbsectCrseNumb")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_CRSE_NUMB")
    private String ssbsectCrseNumb;
    /**
     * Lineage reference object : poolInd
     * 
     */
    @JsonProperty("poolInd")
    @JsonPropertyDescription("Lineage reference object : poolInd")
    private String poolInd;
    /**
     * Schedule Type
     * <p>
     * Lineage reference object : SSBSECT_SCHD_CODE
     * 
     */
    @JsonProperty("ssbsectSchdCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_SCHD_CODE")
    private String ssbsectSchdCode;
    /**
     * Enrollment Seats Available
     * <p>
     * Lineage reference object : SSBSECT_SEATS_AVAIL
     * 
     */
    @JsonProperty("ssbsectSeatsAvail")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_SEATS_AVAIL")
    private Double ssbsectSeatsAvail;
    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCodeEff, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCodeEff")
    @JsonPropertyDescription("Lineage reference object : keyblocTermCodeEff, Lookup lineage reference object : stvterm")
    private String keyblocTermCodeEff;
    /**
     * Part of Term
     * <p>
     * Lineage reference object : SSBSECT_PTRM_CODE
     * 
     */
    @JsonProperty("ssbsectPtrmCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_PTRM_CODE")
    private String ssbsectPtrmCode;
    /**
     * Actual
     * <p>
     * Lineage reference object : SSBSECT_ENRL
     * 
     */
    @JsonProperty("ssbsectEnrl")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_ENRL")
    private Double ssbsectEnrl;
    /**
     * Enrollment
     * <p>
     * Lineage reference object : SSBSECT_MAX_ENRL
     * 
     */
    @JsonProperty("ssbsectMaxEnrl")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_MAX_ENRL")
    private Double ssbsectMaxEnrl;
    /**
     * Link
     * <p>
     * Lineage reference object : SSBSECT_LINK_IDENT
     * 
     */
    @JsonProperty("ssbsectLinkIdent")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_LINK_IDENT")
    private String ssbsectLinkIdent;
    /**
     * Credit Hours
     * <p>
     * Lineage reference object : SSBSECT_CREDIT_HRS
     * 
     */
    @JsonProperty("ssbsectCreditHrs")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_CREDIT_HRS")
    private Double ssbsectCreditHrs;
    /**
     * Session
     * <p>
     * Lineage reference object : keyBlckSessCode, Lookup lineage reference object : stvsess
     * 
     */
    @JsonProperty("keyBlckSessCode")
    @JsonPropertyDescription("Lineage reference object : keyBlckSessCode, Lookup lineage reference object : stvsess")
    private String keyBlckSessCode;
    /**
     * Subject
     * <p>
     * Lineage reference object : ssbsectSubjCode, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("ssbsectSubjCode")
    @JsonPropertyDescription("Lineage reference object : ssbsectSubjCode, Lookup lineage reference object : stvsubj")
    private String ssbsectSubjCode;
    /**
     * Duration
     * <p>
     * Lineage reference object : SSBSECT_NUMBER_OF_UNITS
     * 
     */
    @JsonProperty("ssbsectNumberOfUnits")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_NUMBER_OF_UNITS")
    private Double ssbsectNumberOfUnits;
    /**
     * Session
     * <p>
     * Lineage reference object : SSBSECT_SESS_CODE
     * 
     */
    @JsonProperty("ssbsectSessCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_SESS_CODE")
    private String ssbsectSessCode;
    /**
     * Section Status
     * <p>
     * Lineage reference object : SSBSECT_SSTS_CODE
     * 
     */
    @JsonProperty("ssbsectSstsCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_SSTS_CODE")
    private String ssbsectSstsCode;
    /**
     * Campus
     * <p>
     * Lineage reference object : SSBSECT_CAMP_CODE
     * 
     */
    @JsonProperty("ssbsectCampCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_CAMP_CODE")
    private String ssbsectCampCode;
    /**
     * Course
     * <p>
     * Lineage reference object : scbcrkyCrseNumb, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("scbcrkyCrseNumb")
    @JsonPropertyDescription("Lineage reference object : scbcrkyCrseNumb, Lookup lineage reference object : scbcrse,scbcrky")
    private String scbcrkyCrseNumb;
    /**
     * Block
     * <p>
     * Lineage reference object : blckCode, Lookup lineage reference object : stvblck
     * 
     */
    @JsonProperty("blckCode")
    @JsonPropertyDescription("Lineage reference object : blckCode, Lookup lineage reference object : stvblck")
    private String blckCode;
    /**
     * Campus
     * <p>
     * Lineage reference object : keyBlckCampCode, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("keyBlckCampCode")
    @JsonPropertyDescription("Lineage reference object : keyBlckCampCode, Lookup lineage reference object : stvcamp")
    private String keyBlckCampCode;
    /**
     * Instructional Method
     * <p>
     * Lineage reference object : SSBSECT_INSM_CODE
     * 
     */
    @JsonProperty("ssbsectInsmCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_INSM_CODE")
    private String ssbsectInsmCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Unit
     * <p>
     * Lineage reference object : SSBSECT_DUNT_CODE
     * 
     */
    @JsonProperty("ssbsectDuntCode")
    public String getSsbsectDuntCode() {
        return ssbsectDuntCode;
    }

    /**
     * Unit
     * <p>
     * Lineage reference object : SSBSECT_DUNT_CODE
     * 
     */
    @JsonProperty("ssbsectDuntCode")
    public void setSsbsectDuntCode(String ssbsectDuntCode) {
        this.ssbsectDuntCode = ssbsectDuntCode;
    }

    public PoolSection100GetRequest withSsbsectDuntCode(String ssbsectDuntCode) {
        this.ssbsectDuntCode = ssbsectDuntCode;
        return this;
    }

    /**
     * Section
     * <p>
     * Lineage reference object : SSBSECT_SEQ_NUMB
     * 
     */
    @JsonProperty("ssbsectSeqNumb")
    public String getSsbsectSeqNumb() {
        return ssbsectSeqNumb;
    }

    /**
     * Section
     * <p>
     * Lineage reference object : SSBSECT_SEQ_NUMB
     * 
     */
    @JsonProperty("ssbsectSeqNumb")
    public void setSsbsectSeqNumb(String ssbsectSeqNumb) {
        this.ssbsectSeqNumb = ssbsectSeqNumb;
    }

    public PoolSection100GetRequest withSsbsectSeqNumb(String ssbsectSeqNumb) {
        this.ssbsectSeqNumb = ssbsectSeqNumb;
        return this;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : SSBSECT_CRN
     * 
     */
    @JsonProperty("ssbsectCrn")
    public String getSsbsectCrn() {
        return ssbsectCrn;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : SSBSECT_CRN
     * 
     */
    @JsonProperty("ssbsectCrn")
    public void setSsbsectCrn(String ssbsectCrn) {
        this.ssbsectCrn = ssbsectCrn;
    }

    public PoolSection100GetRequest withSsbsectCrn(String ssbsectCrn) {
        this.ssbsectCrn = ssbsectCrn;
        return this;
    }

    /**
     * Reserved Seats
     * <p>
     * Lineage reference object : SSBSECT_RESERVED_IND
     * 
     */
    @JsonProperty("ssbsectReservedInd")
    public String getSsbsectReservedInd() {
        return ssbsectReservedInd;
    }

    /**
     * Reserved Seats
     * <p>
     * Lineage reference object : SSBSECT_RESERVED_IND
     * 
     */
    @JsonProperty("ssbsectReservedInd")
    public void setSsbsectReservedInd(String ssbsectReservedInd) {
        this.ssbsectReservedInd = ssbsectReservedInd;
    }

    public PoolSection100GetRequest withSsbsectReservedInd(String ssbsectReservedInd) {
        this.ssbsectReservedInd = ssbsectReservedInd;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SSBSECT_SUBJ_CODE
     * 
     */
    @JsonProperty("SSBSECT.ssbsectSubjCode")
    public String getSSBSECTSsbsectSubjCode() {
        return sSBSECTSsbsectSubjCode;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SSBSECT_SUBJ_CODE
     * 
     */
    @JsonProperty("SSBSECT.ssbsectSubjCode")
    public void setSSBSECTSsbsectSubjCode(String sSBSECTSsbsectSubjCode) {
        this.sSBSECTSsbsectSubjCode = sSBSECTSsbsectSubjCode;
    }

    public PoolSection100GetRequest withSSBSECTSsbsectSubjCode(String sSBSECTSsbsectSubjCode) {
        this.sSBSECTSsbsectSubjCode = sSBSECTSsbsectSubjCode;
        return this;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : SSBSECT_CRSE_NUMB
     * 
     */
    @JsonProperty("ssbsectCrseNumb")
    public String getSsbsectCrseNumb() {
        return ssbsectCrseNumb;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : SSBSECT_CRSE_NUMB
     * 
     */
    @JsonProperty("ssbsectCrseNumb")
    public void setSsbsectCrseNumb(String ssbsectCrseNumb) {
        this.ssbsectCrseNumb = ssbsectCrseNumb;
    }

    public PoolSection100GetRequest withSsbsectCrseNumb(String ssbsectCrseNumb) {
        this.ssbsectCrseNumb = ssbsectCrseNumb;
        return this;
    }

    /**
     * Lineage reference object : poolInd
     * 
     */
    @JsonProperty("poolInd")
    public String getPoolInd() {
        return poolInd;
    }

    /**
     * Lineage reference object : poolInd
     * 
     */
    @JsonProperty("poolInd")
    public void setPoolInd(String poolInd) {
        this.poolInd = poolInd;
    }

    public PoolSection100GetRequest withPoolInd(String poolInd) {
        this.poolInd = poolInd;
        return this;
    }

    /**
     * Schedule Type
     * <p>
     * Lineage reference object : SSBSECT_SCHD_CODE
     * 
     */
    @JsonProperty("ssbsectSchdCode")
    public String getSsbsectSchdCode() {
        return ssbsectSchdCode;
    }

    /**
     * Schedule Type
     * <p>
     * Lineage reference object : SSBSECT_SCHD_CODE
     * 
     */
    @JsonProperty("ssbsectSchdCode")
    public void setSsbsectSchdCode(String ssbsectSchdCode) {
        this.ssbsectSchdCode = ssbsectSchdCode;
    }

    public PoolSection100GetRequest withSsbsectSchdCode(String ssbsectSchdCode) {
        this.ssbsectSchdCode = ssbsectSchdCode;
        return this;
    }

    /**
     * Enrollment Seats Available
     * <p>
     * Lineage reference object : SSBSECT_SEATS_AVAIL
     * 
     */
    @JsonProperty("ssbsectSeatsAvail")
    public Double getSsbsectSeatsAvail() {
        return ssbsectSeatsAvail;
    }

    /**
     * Enrollment Seats Available
     * <p>
     * Lineage reference object : SSBSECT_SEATS_AVAIL
     * 
     */
    @JsonProperty("ssbsectSeatsAvail")
    public void setSsbsectSeatsAvail(Double ssbsectSeatsAvail) {
        this.ssbsectSeatsAvail = ssbsectSeatsAvail;
    }

    public PoolSection100GetRequest withSsbsectSeatsAvail(Double ssbsectSeatsAvail) {
        this.ssbsectSeatsAvail = ssbsectSeatsAvail;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCodeEff, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCodeEff")
    public String getKeyblocTermCodeEff() {
        return keyblocTermCodeEff;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCodeEff, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCodeEff")
    public void setKeyblocTermCodeEff(String keyblocTermCodeEff) {
        this.keyblocTermCodeEff = keyblocTermCodeEff;
    }

    public PoolSection100GetRequest withKeyblocTermCodeEff(String keyblocTermCodeEff) {
        this.keyblocTermCodeEff = keyblocTermCodeEff;
        return this;
    }

    /**
     * Part of Term
     * <p>
     * Lineage reference object : SSBSECT_PTRM_CODE
     * 
     */
    @JsonProperty("ssbsectPtrmCode")
    public String getSsbsectPtrmCode() {
        return ssbsectPtrmCode;
    }

    /**
     * Part of Term
     * <p>
     * Lineage reference object : SSBSECT_PTRM_CODE
     * 
     */
    @JsonProperty("ssbsectPtrmCode")
    public void setSsbsectPtrmCode(String ssbsectPtrmCode) {
        this.ssbsectPtrmCode = ssbsectPtrmCode;
    }

    public PoolSection100GetRequest withSsbsectPtrmCode(String ssbsectPtrmCode) {
        this.ssbsectPtrmCode = ssbsectPtrmCode;
        return this;
    }

    /**
     * Actual
     * <p>
     * Lineage reference object : SSBSECT_ENRL
     * 
     */
    @JsonProperty("ssbsectEnrl")
    public Double getSsbsectEnrl() {
        return ssbsectEnrl;
    }

    /**
     * Actual
     * <p>
     * Lineage reference object : SSBSECT_ENRL
     * 
     */
    @JsonProperty("ssbsectEnrl")
    public void setSsbsectEnrl(Double ssbsectEnrl) {
        this.ssbsectEnrl = ssbsectEnrl;
    }

    public PoolSection100GetRequest withSsbsectEnrl(Double ssbsectEnrl) {
        this.ssbsectEnrl = ssbsectEnrl;
        return this;
    }

    /**
     * Enrollment
     * <p>
     * Lineage reference object : SSBSECT_MAX_ENRL
     * 
     */
    @JsonProperty("ssbsectMaxEnrl")
    public Double getSsbsectMaxEnrl() {
        return ssbsectMaxEnrl;
    }

    /**
     * Enrollment
     * <p>
     * Lineage reference object : SSBSECT_MAX_ENRL
     * 
     */
    @JsonProperty("ssbsectMaxEnrl")
    public void setSsbsectMaxEnrl(Double ssbsectMaxEnrl) {
        this.ssbsectMaxEnrl = ssbsectMaxEnrl;
    }

    public PoolSection100GetRequest withSsbsectMaxEnrl(Double ssbsectMaxEnrl) {
        this.ssbsectMaxEnrl = ssbsectMaxEnrl;
        return this;
    }

    /**
     * Link
     * <p>
     * Lineage reference object : SSBSECT_LINK_IDENT
     * 
     */
    @JsonProperty("ssbsectLinkIdent")
    public String getSsbsectLinkIdent() {
        return ssbsectLinkIdent;
    }

    /**
     * Link
     * <p>
     * Lineage reference object : SSBSECT_LINK_IDENT
     * 
     */
    @JsonProperty("ssbsectLinkIdent")
    public void setSsbsectLinkIdent(String ssbsectLinkIdent) {
        this.ssbsectLinkIdent = ssbsectLinkIdent;
    }

    public PoolSection100GetRequest withSsbsectLinkIdent(String ssbsectLinkIdent) {
        this.ssbsectLinkIdent = ssbsectLinkIdent;
        return this;
    }

    /**
     * Credit Hours
     * <p>
     * Lineage reference object : SSBSECT_CREDIT_HRS
     * 
     */
    @JsonProperty("ssbsectCreditHrs")
    public Double getSsbsectCreditHrs() {
        return ssbsectCreditHrs;
    }

    /**
     * Credit Hours
     * <p>
     * Lineage reference object : SSBSECT_CREDIT_HRS
     * 
     */
    @JsonProperty("ssbsectCreditHrs")
    public void setSsbsectCreditHrs(Double ssbsectCreditHrs) {
        this.ssbsectCreditHrs = ssbsectCreditHrs;
    }

    public PoolSection100GetRequest withSsbsectCreditHrs(Double ssbsectCreditHrs) {
        this.ssbsectCreditHrs = ssbsectCreditHrs;
        return this;
    }

    /**
     * Session
     * <p>
     * Lineage reference object : keyBlckSessCode, Lookup lineage reference object : stvsess
     * 
     */
    @JsonProperty("keyBlckSessCode")
    public String getKeyBlckSessCode() {
        return keyBlckSessCode;
    }

    /**
     * Session
     * <p>
     * Lineage reference object : keyBlckSessCode, Lookup lineage reference object : stvsess
     * 
     */
    @JsonProperty("keyBlckSessCode")
    public void setKeyBlckSessCode(String keyBlckSessCode) {
        this.keyBlckSessCode = keyBlckSessCode;
    }

    public PoolSection100GetRequest withKeyBlckSessCode(String keyBlckSessCode) {
        this.keyBlckSessCode = keyBlckSessCode;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : ssbsectSubjCode, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("ssbsectSubjCode")
    public String getSsbsectSubjCode() {
        return ssbsectSubjCode;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : ssbsectSubjCode, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("ssbsectSubjCode")
    public void setSsbsectSubjCode(String ssbsectSubjCode) {
        this.ssbsectSubjCode = ssbsectSubjCode;
    }

    public PoolSection100GetRequest withSsbsectSubjCode(String ssbsectSubjCode) {
        this.ssbsectSubjCode = ssbsectSubjCode;
        return this;
    }

    /**
     * Duration
     * <p>
     * Lineage reference object : SSBSECT_NUMBER_OF_UNITS
     * 
     */
    @JsonProperty("ssbsectNumberOfUnits")
    public Double getSsbsectNumberOfUnits() {
        return ssbsectNumberOfUnits;
    }

    /**
     * Duration
     * <p>
     * Lineage reference object : SSBSECT_NUMBER_OF_UNITS
     * 
     */
    @JsonProperty("ssbsectNumberOfUnits")
    public void setSsbsectNumberOfUnits(Double ssbsectNumberOfUnits) {
        this.ssbsectNumberOfUnits = ssbsectNumberOfUnits;
    }

    public PoolSection100GetRequest withSsbsectNumberOfUnits(Double ssbsectNumberOfUnits) {
        this.ssbsectNumberOfUnits = ssbsectNumberOfUnits;
        return this;
    }

    /**
     * Session
     * <p>
     * Lineage reference object : SSBSECT_SESS_CODE
     * 
     */
    @JsonProperty("ssbsectSessCode")
    public String getSsbsectSessCode() {
        return ssbsectSessCode;
    }

    /**
     * Session
     * <p>
     * Lineage reference object : SSBSECT_SESS_CODE
     * 
     */
    @JsonProperty("ssbsectSessCode")
    public void setSsbsectSessCode(String ssbsectSessCode) {
        this.ssbsectSessCode = ssbsectSessCode;
    }

    public PoolSection100GetRequest withSsbsectSessCode(String ssbsectSessCode) {
        this.ssbsectSessCode = ssbsectSessCode;
        return this;
    }

    /**
     * Section Status
     * <p>
     * Lineage reference object : SSBSECT_SSTS_CODE
     * 
     */
    @JsonProperty("ssbsectSstsCode")
    public String getSsbsectSstsCode() {
        return ssbsectSstsCode;
    }

    /**
     * Section Status
     * <p>
     * Lineage reference object : SSBSECT_SSTS_CODE
     * 
     */
    @JsonProperty("ssbsectSstsCode")
    public void setSsbsectSstsCode(String ssbsectSstsCode) {
        this.ssbsectSstsCode = ssbsectSstsCode;
    }

    public PoolSection100GetRequest withSsbsectSstsCode(String ssbsectSstsCode) {
        this.ssbsectSstsCode = ssbsectSstsCode;
        return this;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SSBSECT_CAMP_CODE
     * 
     */
    @JsonProperty("ssbsectCampCode")
    public String getSsbsectCampCode() {
        return ssbsectCampCode;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SSBSECT_CAMP_CODE
     * 
     */
    @JsonProperty("ssbsectCampCode")
    public void setSsbsectCampCode(String ssbsectCampCode) {
        this.ssbsectCampCode = ssbsectCampCode;
    }

    public PoolSection100GetRequest withSsbsectCampCode(String ssbsectCampCode) {
        this.ssbsectCampCode = ssbsectCampCode;
        return this;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : scbcrkyCrseNumb, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("scbcrkyCrseNumb")
    public String getScbcrkyCrseNumb() {
        return scbcrkyCrseNumb;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : scbcrkyCrseNumb, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("scbcrkyCrseNumb")
    public void setScbcrkyCrseNumb(String scbcrkyCrseNumb) {
        this.scbcrkyCrseNumb = scbcrkyCrseNumb;
    }

    public PoolSection100GetRequest withScbcrkyCrseNumb(String scbcrkyCrseNumb) {
        this.scbcrkyCrseNumb = scbcrkyCrseNumb;
        return this;
    }

    /**
     * Block
     * <p>
     * Lineage reference object : blckCode, Lookup lineage reference object : stvblck
     * 
     */
    @JsonProperty("blckCode")
    public String getBlckCode() {
        return blckCode;
    }

    /**
     * Block
     * <p>
     * Lineage reference object : blckCode, Lookup lineage reference object : stvblck
     * 
     */
    @JsonProperty("blckCode")
    public void setBlckCode(String blckCode) {
        this.blckCode = blckCode;
    }

    public PoolSection100GetRequest withBlckCode(String blckCode) {
        this.blckCode = blckCode;
        return this;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : keyBlckCampCode, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("keyBlckCampCode")
    public String getKeyBlckCampCode() {
        return keyBlckCampCode;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : keyBlckCampCode, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("keyBlckCampCode")
    public void setKeyBlckCampCode(String keyBlckCampCode) {
        this.keyBlckCampCode = keyBlckCampCode;
    }

    public PoolSection100GetRequest withKeyBlckCampCode(String keyBlckCampCode) {
        this.keyBlckCampCode = keyBlckCampCode;
        return this;
    }

    /**
     * Instructional Method
     * <p>
     * Lineage reference object : SSBSECT_INSM_CODE
     * 
     */
    @JsonProperty("ssbsectInsmCode")
    public String getSsbsectInsmCode() {
        return ssbsectInsmCode;
    }

    /**
     * Instructional Method
     * <p>
     * Lineage reference object : SSBSECT_INSM_CODE
     * 
     */
    @JsonProperty("ssbsectInsmCode")
    public void setSsbsectInsmCode(String ssbsectInsmCode) {
        this.ssbsectInsmCode = ssbsectInsmCode;
    }

    public PoolSection100GetRequest withSsbsectInsmCode(String ssbsectInsmCode) {
        this.ssbsectInsmCode = ssbsectInsmCode;
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

    public PoolSection100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PoolSection100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssbsectDuntCode");
        sb.append('=');
        sb.append(((this.ssbsectDuntCode == null)?"<null>":this.ssbsectDuntCode));
        sb.append(',');
        sb.append("ssbsectSeqNumb");
        sb.append('=');
        sb.append(((this.ssbsectSeqNumb == null)?"<null>":this.ssbsectSeqNumb));
        sb.append(',');
        sb.append("ssbsectCrn");
        sb.append('=');
        sb.append(((this.ssbsectCrn == null)?"<null>":this.ssbsectCrn));
        sb.append(',');
        sb.append("ssbsectReservedInd");
        sb.append('=');
        sb.append(((this.ssbsectReservedInd == null)?"<null>":this.ssbsectReservedInd));
        sb.append(',');
        sb.append("sSBSECTSsbsectSubjCode");
        sb.append('=');
        sb.append(((this.sSBSECTSsbsectSubjCode == null)?"<null>":this.sSBSECTSsbsectSubjCode));
        sb.append(',');
        sb.append("ssbsectCrseNumb");
        sb.append('=');
        sb.append(((this.ssbsectCrseNumb == null)?"<null>":this.ssbsectCrseNumb));
        sb.append(',');
        sb.append("poolInd");
        sb.append('=');
        sb.append(((this.poolInd == null)?"<null>":this.poolInd));
        sb.append(',');
        sb.append("ssbsectSchdCode");
        sb.append('=');
        sb.append(((this.ssbsectSchdCode == null)?"<null>":this.ssbsectSchdCode));
        sb.append(',');
        sb.append("ssbsectSeatsAvail");
        sb.append('=');
        sb.append(((this.ssbsectSeatsAvail == null)?"<null>":this.ssbsectSeatsAvail));
        sb.append(',');
        sb.append("keyblocTermCodeEff");
        sb.append('=');
        sb.append(((this.keyblocTermCodeEff == null)?"<null>":this.keyblocTermCodeEff));
        sb.append(',');
        sb.append("ssbsectPtrmCode");
        sb.append('=');
        sb.append(((this.ssbsectPtrmCode == null)?"<null>":this.ssbsectPtrmCode));
        sb.append(',');
        sb.append("ssbsectEnrl");
        sb.append('=');
        sb.append(((this.ssbsectEnrl == null)?"<null>":this.ssbsectEnrl));
        sb.append(',');
        sb.append("ssbsectMaxEnrl");
        sb.append('=');
        sb.append(((this.ssbsectMaxEnrl == null)?"<null>":this.ssbsectMaxEnrl));
        sb.append(',');
        sb.append("ssbsectLinkIdent");
        sb.append('=');
        sb.append(((this.ssbsectLinkIdent == null)?"<null>":this.ssbsectLinkIdent));
        sb.append(',');
        sb.append("ssbsectCreditHrs");
        sb.append('=');
        sb.append(((this.ssbsectCreditHrs == null)?"<null>":this.ssbsectCreditHrs));
        sb.append(',');
        sb.append("keyBlckSessCode");
        sb.append('=');
        sb.append(((this.keyBlckSessCode == null)?"<null>":this.keyBlckSessCode));
        sb.append(',');
        sb.append("ssbsectSubjCode");
        sb.append('=');
        sb.append(((this.ssbsectSubjCode == null)?"<null>":this.ssbsectSubjCode));
        sb.append(',');
        sb.append("ssbsectNumberOfUnits");
        sb.append('=');
        sb.append(((this.ssbsectNumberOfUnits == null)?"<null>":this.ssbsectNumberOfUnits));
        sb.append(',');
        sb.append("ssbsectSessCode");
        sb.append('=');
        sb.append(((this.ssbsectSessCode == null)?"<null>":this.ssbsectSessCode));
        sb.append(',');
        sb.append("ssbsectSstsCode");
        sb.append('=');
        sb.append(((this.ssbsectSstsCode == null)?"<null>":this.ssbsectSstsCode));
        sb.append(',');
        sb.append("ssbsectCampCode");
        sb.append('=');
        sb.append(((this.ssbsectCampCode == null)?"<null>":this.ssbsectCampCode));
        sb.append(',');
        sb.append("scbcrkyCrseNumb");
        sb.append('=');
        sb.append(((this.scbcrkyCrseNumb == null)?"<null>":this.scbcrkyCrseNumb));
        sb.append(',');
        sb.append("blckCode");
        sb.append('=');
        sb.append(((this.blckCode == null)?"<null>":this.blckCode));
        sb.append(',');
        sb.append("keyBlckCampCode");
        sb.append('=');
        sb.append(((this.keyBlckCampCode == null)?"<null>":this.keyBlckCampCode));
        sb.append(',');
        sb.append("ssbsectInsmCode");
        sb.append('=');
        sb.append(((this.ssbsectInsmCode == null)?"<null>":this.ssbsectInsmCode));
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
        result = ((result* 31)+((this.ssbsectDuntCode == null)? 0 :this.ssbsectDuntCode.hashCode()));
        result = ((result* 31)+((this.ssbsectSeqNumb == null)? 0 :this.ssbsectSeqNumb.hashCode()));
        result = ((result* 31)+((this.ssbsectCrn == null)? 0 :this.ssbsectCrn.hashCode()));
        result = ((result* 31)+((this.ssbsectReservedInd == null)? 0 :this.ssbsectReservedInd.hashCode()));
        result = ((result* 31)+((this.ssbsectCrseNumb == null)? 0 :this.ssbsectCrseNumb.hashCode()));
        result = ((result* 31)+((this.poolInd == null)? 0 :this.poolInd.hashCode()));
        result = ((result* 31)+((this.ssbsectSchdCode == null)? 0 :this.ssbsectSchdCode.hashCode()));
        result = ((result* 31)+((this.ssbsectSeatsAvail == null)? 0 :this.ssbsectSeatsAvail.hashCode()));
        result = ((result* 31)+((this.keyblocTermCodeEff == null)? 0 :this.keyblocTermCodeEff.hashCode()));
        result = ((result* 31)+((this.ssbsectPtrmCode == null)? 0 :this.ssbsectPtrmCode.hashCode()));
        result = ((result* 31)+((this.ssbsectEnrl == null)? 0 :this.ssbsectEnrl.hashCode()));
        result = ((result* 31)+((this.ssbsectMaxEnrl == null)? 0 :this.ssbsectMaxEnrl.hashCode()));
        result = ((result* 31)+((this.sSBSECTSsbsectSubjCode == null)? 0 :this.sSBSECTSsbsectSubjCode.hashCode()));
        result = ((result* 31)+((this.ssbsectLinkIdent == null)? 0 :this.ssbsectLinkIdent.hashCode()));
        result = ((result* 31)+((this.ssbsectCreditHrs == null)? 0 :this.ssbsectCreditHrs.hashCode()));
        result = ((result* 31)+((this.keyBlckSessCode == null)? 0 :this.keyBlckSessCode.hashCode()));
        result = ((result* 31)+((this.ssbsectSubjCode == null)? 0 :this.ssbsectSubjCode.hashCode()));
        result = ((result* 31)+((this.ssbsectNumberOfUnits == null)? 0 :this.ssbsectNumberOfUnits.hashCode()));
        result = ((result* 31)+((this.ssbsectSessCode == null)? 0 :this.ssbsectSessCode.hashCode()));
        result = ((result* 31)+((this.ssbsectSstsCode == null)? 0 :this.ssbsectSstsCode.hashCode()));
        result = ((result* 31)+((this.ssbsectCampCode == null)? 0 :this.ssbsectCampCode.hashCode()));
        result = ((result* 31)+((this.scbcrkyCrseNumb == null)? 0 :this.scbcrkyCrseNumb.hashCode()));
        result = ((result* 31)+((this.blckCode == null)? 0 :this.blckCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.keyBlckCampCode == null)? 0 :this.keyBlckCampCode.hashCode()));
        result = ((result* 31)+((this.ssbsectInsmCode == null)? 0 :this.ssbsectInsmCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PoolSection100GetRequest) == false) {
            return false;
        }
        PoolSection100GetRequest rhs = ((PoolSection100GetRequest) other);
        return (((((((((((((((((((((((((((this.ssbsectDuntCode == rhs.ssbsectDuntCode)||((this.ssbsectDuntCode!= null)&&this.ssbsectDuntCode.equals(rhs.ssbsectDuntCode)))&&((this.ssbsectSeqNumb == rhs.ssbsectSeqNumb)||((this.ssbsectSeqNumb!= null)&&this.ssbsectSeqNumb.equals(rhs.ssbsectSeqNumb))))&&((this.ssbsectCrn == rhs.ssbsectCrn)||((this.ssbsectCrn!= null)&&this.ssbsectCrn.equals(rhs.ssbsectCrn))))&&((this.ssbsectReservedInd == rhs.ssbsectReservedInd)||((this.ssbsectReservedInd!= null)&&this.ssbsectReservedInd.equals(rhs.ssbsectReservedInd))))&&((this.ssbsectCrseNumb == rhs.ssbsectCrseNumb)||((this.ssbsectCrseNumb!= null)&&this.ssbsectCrseNumb.equals(rhs.ssbsectCrseNumb))))&&((this.poolInd == rhs.poolInd)||((this.poolInd!= null)&&this.poolInd.equals(rhs.poolInd))))&&((this.ssbsectSchdCode == rhs.ssbsectSchdCode)||((this.ssbsectSchdCode!= null)&&this.ssbsectSchdCode.equals(rhs.ssbsectSchdCode))))&&((this.ssbsectSeatsAvail == rhs.ssbsectSeatsAvail)||((this.ssbsectSeatsAvail!= null)&&this.ssbsectSeatsAvail.equals(rhs.ssbsectSeatsAvail))))&&((this.keyblocTermCodeEff == rhs.keyblocTermCodeEff)||((this.keyblocTermCodeEff!= null)&&this.keyblocTermCodeEff.equals(rhs.keyblocTermCodeEff))))&&((this.ssbsectPtrmCode == rhs.ssbsectPtrmCode)||((this.ssbsectPtrmCode!= null)&&this.ssbsectPtrmCode.equals(rhs.ssbsectPtrmCode))))&&((this.ssbsectEnrl == rhs.ssbsectEnrl)||((this.ssbsectEnrl!= null)&&this.ssbsectEnrl.equals(rhs.ssbsectEnrl))))&&((this.ssbsectMaxEnrl == rhs.ssbsectMaxEnrl)||((this.ssbsectMaxEnrl!= null)&&this.ssbsectMaxEnrl.equals(rhs.ssbsectMaxEnrl))))&&((this.sSBSECTSsbsectSubjCode == rhs.sSBSECTSsbsectSubjCode)||((this.sSBSECTSsbsectSubjCode!= null)&&this.sSBSECTSsbsectSubjCode.equals(rhs.sSBSECTSsbsectSubjCode))))&&((this.ssbsectLinkIdent == rhs.ssbsectLinkIdent)||((this.ssbsectLinkIdent!= null)&&this.ssbsectLinkIdent.equals(rhs.ssbsectLinkIdent))))&&((this.ssbsectCreditHrs == rhs.ssbsectCreditHrs)||((this.ssbsectCreditHrs!= null)&&this.ssbsectCreditHrs.equals(rhs.ssbsectCreditHrs))))&&((this.keyBlckSessCode == rhs.keyBlckSessCode)||((this.keyBlckSessCode!= null)&&this.keyBlckSessCode.equals(rhs.keyBlckSessCode))))&&((this.ssbsectSubjCode == rhs.ssbsectSubjCode)||((this.ssbsectSubjCode!= null)&&this.ssbsectSubjCode.equals(rhs.ssbsectSubjCode))))&&((this.ssbsectNumberOfUnits == rhs.ssbsectNumberOfUnits)||((this.ssbsectNumberOfUnits!= null)&&this.ssbsectNumberOfUnits.equals(rhs.ssbsectNumberOfUnits))))&&((this.ssbsectSessCode == rhs.ssbsectSessCode)||((this.ssbsectSessCode!= null)&&this.ssbsectSessCode.equals(rhs.ssbsectSessCode))))&&((this.ssbsectSstsCode == rhs.ssbsectSstsCode)||((this.ssbsectSstsCode!= null)&&this.ssbsectSstsCode.equals(rhs.ssbsectSstsCode))))&&((this.ssbsectCampCode == rhs.ssbsectCampCode)||((this.ssbsectCampCode!= null)&&this.ssbsectCampCode.equals(rhs.ssbsectCampCode))))&&((this.scbcrkyCrseNumb == rhs.scbcrkyCrseNumb)||((this.scbcrkyCrseNumb!= null)&&this.scbcrkyCrseNumb.equals(rhs.scbcrkyCrseNumb))))&&((this.blckCode == rhs.blckCode)||((this.blckCode!= null)&&this.blckCode.equals(rhs.blckCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.keyBlckCampCode == rhs.keyBlckCampCode)||((this.keyBlckCampCode!= null)&&this.keyBlckCampCode.equals(rhs.keyBlckCampCode))))&&((this.ssbsectInsmCode == rhs.ssbsectInsmCode)||((this.ssbsectInsmCode!= null)&&this.ssbsectInsmCode.equals(rhs.ssbsectInsmCode))));
    }

}
