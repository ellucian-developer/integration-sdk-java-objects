
package com.ellucian.generated.bpapi.ban.international_information.v1_0_0;

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
    "vtypCode",
    "certDateIssue",
    "childNumber",
    "srceCode",
    "emptCode",
    "langCode",
    "vissCode",
    "foreignSsn",
    "gobintlNatnCodeIssue",
    "passportExpDate",
    "duration",
    "natnCodeBirth",
    "signatureInd",
    "pentCode",
    "id",
    "docmCode",
    "passportId",
    "visaReqDate",
    "natnCodeLegal",
    "natnCodeIssue",
    "visaIssueDate",
    "visaNumber",
    "noEntries",
    "celgCode",
    "certNumber",
    "sponCode",
    "admrCode",
    "entryInd",
    "visaExpireDate",
    "visaStartDate",
    "i94Status",
    "i94Date",
    "certDateReceipt"
})
@Generated("jsonschema2pojo")
public class InternationalInformation100PostRequest {

    /**
     * Visa Type
     * <p>
     * Lineage reference object : GORVISA_VTYP_CODE, Lookup lineage reference object : stvvtyp
     * 
     */
    @JsonProperty("vtypCode")
    @JsonPropertyDescription("Lineage reference object : GORVISA_VTYP_CODE, Lookup lineage reference object : stvvtyp")
    private String vtypCode;
    /**
     * Issue Date
     * <p>
     * Lineage reference object : GOBINTL_CERT_DATE_ISSUE
     * 
     */
    @JsonProperty("certDateIssue")
    @JsonPropertyDescription("Lineage reference object : GOBINTL_CERT_DATE_ISSUE")
    private Date certDateIssue;
    /**
     * Number of Children Accompanying Person
     * <p>
     * Lineage reference object : GOBINTL_CHILD_NUMBER
     * 
     */
    @JsonProperty("childNumber")
    @JsonPropertyDescription("Lineage reference object : GOBINTL_CHILD_NUMBER")
    private Double childNumber;
    /**
     * Source
     * <p>
     * Lineage reference object : GORDOCM_SRCE_CODE, Lookup lineage reference object : gtvsrce
     * 
     */
    @JsonProperty("srceCode")
    @JsonPropertyDescription("Lineage reference object : GORDOCM_SRCE_CODE, Lookup lineage reference object : gtvsrce")
    private String srceCode;
    /**
     * Employment Type
     * <p>
     * Lineage reference object : GOBINTL_EMPT_CODE, Lookup lineage reference object : stvempt
     * 
     */
    @JsonProperty("emptCode")
    @JsonPropertyDescription("Lineage reference object : GOBINTL_EMPT_CODE, Lookup lineage reference object : stvempt")
    private String emptCode;
    /**
     * Native Language
     * <p>
     * Lineage reference object : GOBINTL_LANG_CODE, Lookup lineage reference object : stvlang
     * 
     */
    @JsonProperty("langCode")
    @JsonPropertyDescription("Lineage reference object : GOBINTL_LANG_CODE, Lookup lineage reference object : stvlang")
    private String langCode;
    /**
     * Issuing Authority
     * <p>
     * Lineage reference object : GORVISA_VISS_CODE, Lookup lineage reference object : gtvviss
     * 
     */
    @JsonProperty("vissCode")
    @JsonPropertyDescription("Lineage reference object : GORVISA_VISS_CODE, Lookup lineage reference object : gtvviss")
    private String vissCode;
    /**
     * Foreign Tax ID
     * <p>
     * Lineage reference object : GOBINTL_FOREIGN_SSN
     * 
     */
    @JsonProperty("foreignSsn")
    @JsonPropertyDescription("Lineage reference object : GOBINTL_FOREIGN_SSN")
    private String foreignSsn;
    /**
     * Nation of Issue
     * <p>
     * Lineage reference object : GOBINTL_NATN_CODE_ISSUE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("gobintlNatnCodeIssue")
    @JsonPropertyDescription("Lineage reference object : GOBINTL_NATN_CODE_ISSUE, Lookup lineage reference object : stvnatn")
    private String gobintlNatnCodeIssue;
    /**
     * Expiration Date
     * <p>
     * Lineage reference object : GOBINTL_PASSPORT_EXP_DATE
     * 
     */
    @JsonProperty("passportExpDate")
    @JsonPropertyDescription("Lineage reference object : GOBINTL_PASSPORT_EXP_DATE")
    private Date passportExpDate;
    /**
     * Duration of Stay
     * <p>
     * Lineage reference object : GOBINTL_DURATION
     * 
     */
    @JsonProperty("duration")
    @JsonPropertyDescription("Lineage reference object : GOBINTL_DURATION")
    private String duration;
    /**
     * Nation of Birth
     * <p>
     * Lineage reference object : GOBINTL_NATN_CODE_BIRTH, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCodeBirth")
    @JsonPropertyDescription("Lineage reference object : GOBINTL_NATN_CODE_BIRTH, Lookup lineage reference object : stvnatn")
    private String natnCodeBirth;
    /**
     * Signature for Availability of Funds
     * <p>
     * Lineage reference object : GOBINTL_SIGNATURE_IND
     * (Required)
     * 
     */
    @JsonProperty("signatureInd")
    @JsonPropertyDescription("Lineage reference object : GOBINTL_SIGNATURE_IND")
    private String signatureInd;
    /**
     * Port of Entry
     * <p>
     * Lineage reference object : GORVISA_PENT_CODE, Lookup lineage reference object : stvpent
     * 
     */
    @JsonProperty("pentCode")
    @JsonPropertyDescription("Lineage reference object : GORVISA_PENT_CODE, Lookup lineage reference object : stvpent")
    private String pentCode;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private String id;
    /**
     * Document
     * <p>
     * Lineage reference object : GORDOCM_DOCM_CODE, Lookup lineage reference object : gtvdocm
     * 
     */
    @JsonProperty("docmCode")
    @JsonPropertyDescription("Lineage reference object : GORDOCM_DOCM_CODE, Lookup lineage reference object : gtvdocm")
    private String docmCode;
    /**
     * Number
     * <p>
     * Lineage reference object : GOBINTL_PASSPORT_ID
     * 
     */
    @JsonProperty("passportId")
    @JsonPropertyDescription("Lineage reference object : GOBINTL_PASSPORT_ID")
    private String passportId;
    /**
     * Date Requested
     * <p>
     * Lineage reference object : GORVISA_VISA_REQ_DATE
     * 
     */
    @JsonProperty("visaReqDate")
    @JsonPropertyDescription("Lineage reference object : GORVISA_VISA_REQ_DATE")
    private Date visaReqDate;
    /**
     * Nation of Citizen
     * <p>
     * Lineage reference object : GOBINTL_NATN_CODE_LEGAL, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCodeLegal")
    @JsonPropertyDescription("Lineage reference object : GOBINTL_NATN_CODE_LEGAL, Lookup lineage reference object : stvnatn")
    private String natnCodeLegal;
    /**
     * Nation of Issue
     * <p>
     * Lineage reference object : GORVISA_NATN_CODE_ISSUE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCodeIssue")
    @JsonPropertyDescription("Lineage reference object : GORVISA_NATN_CODE_ISSUE, Lookup lineage reference object : stvnatn")
    private String natnCodeIssue;
    /**
     * Date Issued
     * <p>
     * Lineage reference object : GORVISA_VISA_ISSUE_DATE
     * 
     */
    @JsonProperty("visaIssueDate")
    @JsonPropertyDescription("Lineage reference object : GORVISA_VISA_ISSUE_DATE")
    private Date visaIssueDate;
    /**
     * Visa Number
     * <p>
     * Lineage reference object : GORVISA_VISA_NUMBER
     * 
     */
    @JsonProperty("visaNumber")
    @JsonPropertyDescription("Lineage reference object : GORVISA_VISA_NUMBER")
    private String visaNumber;
    /**
     * Number of Entries
     * <p>
     * Lineage reference object : GORVISA_NO_ENTRIES
     * 
     */
    @JsonProperty("noEntries")
    @JsonPropertyDescription("Lineage reference object : GORVISA_NO_ENTRIES")
    private String noEntries;
    /**
     * Certification
     * <p>
     * Lineage reference object : GOBINTL_CELG_CODE, Lookup lineage reference object : gtvcelg
     * 
     */
    @JsonProperty("celgCode")
    @JsonPropertyDescription("Lineage reference object : GOBINTL_CELG_CODE, Lookup lineage reference object : gtvcelg")
    private String celgCode;
    /**
     * Number
     * <p>
     * Lineage reference object : GOBINTL_CERT_NUMBER
     * 
     */
    @JsonProperty("certNumber")
    @JsonPropertyDescription("Lineage reference object : GOBINTL_CERT_NUMBER")
    private String certNumber;
    /**
     * Sponsor
     * <p>
     * Lineage reference object : GOBINTL_SPON_CODE, Lookup lineage reference object : stvspon
     * 
     */
    @JsonProperty("sponCode")
    @JsonPropertyDescription("Lineage reference object : GOBINTL_SPON_CODE, Lookup lineage reference object : stvspon")
    private String sponCode;
    /**
     * Admission Request
     * <p>
     * Lineage reference object : GOBINTL_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("admrCode")
    @JsonPropertyDescription("Lineage reference object : GOBINTL_ADMR_CODE, Lookup lineage reference object : stvadmr")
    private String admrCode;
    /**
     * Entry
     * <p>
     * Lineage reference object : GORVISA_ENTRY_IND
     * 
     */
    @JsonProperty("entryInd")
    @JsonPropertyDescription("Lineage reference object : GORVISA_ENTRY_IND")
    private String entryInd;
    /**
     * End Date
     * <p>
     * Lineage reference object : GORVISA_VISA_EXPIRE_DATE
     * 
     */
    @JsonProperty("visaExpireDate")
    @JsonPropertyDescription("Lineage reference object : GORVISA_VISA_EXPIRE_DATE")
    private Date visaExpireDate;
    /**
     * Start Date
     * <p>
     * Lineage reference object : GORVISA_VISA_START_DATE
     * 
     */
    @JsonProperty("visaStartDate")
    @JsonPropertyDescription("Lineage reference object : GORVISA_VISA_START_DATE")
    private Date visaStartDate;
    /**
     * Status
     * <p>
     * Lineage reference object : GOBINTL_I94_STATUS
     * 
     */
    @JsonProperty("i94Status")
    @JsonPropertyDescription("Lineage reference object : GOBINTL_I94_STATUS")
    private String i94Status;
    /**
     * Expiration Date
     * <p>
     * Lineage reference object : GOBINTL_I94_DATE
     * 
     */
    @JsonProperty("i94Date")
    @JsonPropertyDescription("Lineage reference object : GOBINTL_I94_DATE")
    private Date i94Date;
    /**
     * Receipt Date
     * <p>
     * Lineage reference object : GOBINTL_CERT_DATE_RECEIPT
     * 
     */
    @JsonProperty("certDateReceipt")
    @JsonPropertyDescription("Lineage reference object : GOBINTL_CERT_DATE_RECEIPT")
    private Date certDateReceipt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Visa Type
     * <p>
     * Lineage reference object : GORVISA_VTYP_CODE, Lookup lineage reference object : stvvtyp
     * 
     */
    @JsonProperty("vtypCode")
    public String getVtypCode() {
        return vtypCode;
    }

    /**
     * Visa Type
     * <p>
     * Lineage reference object : GORVISA_VTYP_CODE, Lookup lineage reference object : stvvtyp
     * 
     */
    @JsonProperty("vtypCode")
    public void setVtypCode(String vtypCode) {
        this.vtypCode = vtypCode;
    }

    public InternationalInformation100PostRequest withVtypCode(String vtypCode) {
        this.vtypCode = vtypCode;
        return this;
    }

    /**
     * Issue Date
     * <p>
     * Lineage reference object : GOBINTL_CERT_DATE_ISSUE
     * 
     */
    @JsonProperty("certDateIssue")
    public Date getCertDateIssue() {
        return certDateIssue;
    }

    /**
     * Issue Date
     * <p>
     * Lineage reference object : GOBINTL_CERT_DATE_ISSUE
     * 
     */
    @JsonProperty("certDateIssue")
    public void setCertDateIssue(Date certDateIssue) {
        this.certDateIssue = certDateIssue;
    }

    public InternationalInformation100PostRequest withCertDateIssue(Date certDateIssue) {
        this.certDateIssue = certDateIssue;
        return this;
    }

    /**
     * Number of Children Accompanying Person
     * <p>
     * Lineage reference object : GOBINTL_CHILD_NUMBER
     * 
     */
    @JsonProperty("childNumber")
    public Double getChildNumber() {
        return childNumber;
    }

    /**
     * Number of Children Accompanying Person
     * <p>
     * Lineage reference object : GOBINTL_CHILD_NUMBER
     * 
     */
    @JsonProperty("childNumber")
    public void setChildNumber(Double childNumber) {
        this.childNumber = childNumber;
    }

    public InternationalInformation100PostRequest withChildNumber(Double childNumber) {
        this.childNumber = childNumber;
        return this;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : GORDOCM_SRCE_CODE, Lookup lineage reference object : gtvsrce
     * 
     */
    @JsonProperty("srceCode")
    public String getSrceCode() {
        return srceCode;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : GORDOCM_SRCE_CODE, Lookup lineage reference object : gtvsrce
     * 
     */
    @JsonProperty("srceCode")
    public void setSrceCode(String srceCode) {
        this.srceCode = srceCode;
    }

    public InternationalInformation100PostRequest withSrceCode(String srceCode) {
        this.srceCode = srceCode;
        return this;
    }

    /**
     * Employment Type
     * <p>
     * Lineage reference object : GOBINTL_EMPT_CODE, Lookup lineage reference object : stvempt
     * 
     */
    @JsonProperty("emptCode")
    public String getEmptCode() {
        return emptCode;
    }

    /**
     * Employment Type
     * <p>
     * Lineage reference object : GOBINTL_EMPT_CODE, Lookup lineage reference object : stvempt
     * 
     */
    @JsonProperty("emptCode")
    public void setEmptCode(String emptCode) {
        this.emptCode = emptCode;
    }

    public InternationalInformation100PostRequest withEmptCode(String emptCode) {
        this.emptCode = emptCode;
        return this;
    }

    /**
     * Native Language
     * <p>
     * Lineage reference object : GOBINTL_LANG_CODE, Lookup lineage reference object : stvlang
     * 
     */
    @JsonProperty("langCode")
    public String getLangCode() {
        return langCode;
    }

    /**
     * Native Language
     * <p>
     * Lineage reference object : GOBINTL_LANG_CODE, Lookup lineage reference object : stvlang
     * 
     */
    @JsonProperty("langCode")
    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    public InternationalInformation100PostRequest withLangCode(String langCode) {
        this.langCode = langCode;
        return this;
    }

    /**
     * Issuing Authority
     * <p>
     * Lineage reference object : GORVISA_VISS_CODE, Lookup lineage reference object : gtvviss
     * 
     */
    @JsonProperty("vissCode")
    public String getVissCode() {
        return vissCode;
    }

    /**
     * Issuing Authority
     * <p>
     * Lineage reference object : GORVISA_VISS_CODE, Lookup lineage reference object : gtvviss
     * 
     */
    @JsonProperty("vissCode")
    public void setVissCode(String vissCode) {
        this.vissCode = vissCode;
    }

    public InternationalInformation100PostRequest withVissCode(String vissCode) {
        this.vissCode = vissCode;
        return this;
    }

    /**
     * Foreign Tax ID
     * <p>
     * Lineage reference object : GOBINTL_FOREIGN_SSN
     * 
     */
    @JsonProperty("foreignSsn")
    public String getForeignSsn() {
        return foreignSsn;
    }

    /**
     * Foreign Tax ID
     * <p>
     * Lineage reference object : GOBINTL_FOREIGN_SSN
     * 
     */
    @JsonProperty("foreignSsn")
    public void setForeignSsn(String foreignSsn) {
        this.foreignSsn = foreignSsn;
    }

    public InternationalInformation100PostRequest withForeignSsn(String foreignSsn) {
        this.foreignSsn = foreignSsn;
        return this;
    }

    /**
     * Nation of Issue
     * <p>
     * Lineage reference object : GOBINTL_NATN_CODE_ISSUE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("gobintlNatnCodeIssue")
    public String getGobintlNatnCodeIssue() {
        return gobintlNatnCodeIssue;
    }

    /**
     * Nation of Issue
     * <p>
     * Lineage reference object : GOBINTL_NATN_CODE_ISSUE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("gobintlNatnCodeIssue")
    public void setGobintlNatnCodeIssue(String gobintlNatnCodeIssue) {
        this.gobintlNatnCodeIssue = gobintlNatnCodeIssue;
    }

    public InternationalInformation100PostRequest withGobintlNatnCodeIssue(String gobintlNatnCodeIssue) {
        this.gobintlNatnCodeIssue = gobintlNatnCodeIssue;
        return this;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : GOBINTL_PASSPORT_EXP_DATE
     * 
     */
    @JsonProperty("passportExpDate")
    public Date getPassportExpDate() {
        return passportExpDate;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : GOBINTL_PASSPORT_EXP_DATE
     * 
     */
    @JsonProperty("passportExpDate")
    public void setPassportExpDate(Date passportExpDate) {
        this.passportExpDate = passportExpDate;
    }

    public InternationalInformation100PostRequest withPassportExpDate(Date passportExpDate) {
        this.passportExpDate = passportExpDate;
        return this;
    }

    /**
     * Duration of Stay
     * <p>
     * Lineage reference object : GOBINTL_DURATION
     * 
     */
    @JsonProperty("duration")
    public String getDuration() {
        return duration;
    }

    /**
     * Duration of Stay
     * <p>
     * Lineage reference object : GOBINTL_DURATION
     * 
     */
    @JsonProperty("duration")
    public void setDuration(String duration) {
        this.duration = duration;
    }

    public InternationalInformation100PostRequest withDuration(String duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Nation of Birth
     * <p>
     * Lineage reference object : GOBINTL_NATN_CODE_BIRTH, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCodeBirth")
    public String getNatnCodeBirth() {
        return natnCodeBirth;
    }

    /**
     * Nation of Birth
     * <p>
     * Lineage reference object : GOBINTL_NATN_CODE_BIRTH, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCodeBirth")
    public void setNatnCodeBirth(String natnCodeBirth) {
        this.natnCodeBirth = natnCodeBirth;
    }

    public InternationalInformation100PostRequest withNatnCodeBirth(String natnCodeBirth) {
        this.natnCodeBirth = natnCodeBirth;
        return this;
    }

    /**
     * Signature for Availability of Funds
     * <p>
     * Lineage reference object : GOBINTL_SIGNATURE_IND
     * (Required)
     * 
     */
    @JsonProperty("signatureInd")
    public String getSignatureInd() {
        return signatureInd;
    }

    /**
     * Signature for Availability of Funds
     * <p>
     * Lineage reference object : GOBINTL_SIGNATURE_IND
     * (Required)
     * 
     */
    @JsonProperty("signatureInd")
    public void setSignatureInd(String signatureInd) {
        this.signatureInd = signatureInd;
    }

    public InternationalInformation100PostRequest withSignatureInd(String signatureInd) {
        this.signatureInd = signatureInd;
        return this;
    }

    /**
     * Port of Entry
     * <p>
     * Lineage reference object : GORVISA_PENT_CODE, Lookup lineage reference object : stvpent
     * 
     */
    @JsonProperty("pentCode")
    public String getPentCode() {
        return pentCode;
    }

    /**
     * Port of Entry
     * <p>
     * Lineage reference object : GORVISA_PENT_CODE, Lookup lineage reference object : stvpent
     * 
     */
    @JsonProperty("pentCode")
    public void setPentCode(String pentCode) {
        this.pentCode = pentCode;
    }

    public InternationalInformation100PostRequest withPentCode(String pentCode) {
        this.pentCode = pentCode;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public InternationalInformation100PostRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : GORDOCM_DOCM_CODE, Lookup lineage reference object : gtvdocm
     * 
     */
    @JsonProperty("docmCode")
    public String getDocmCode() {
        return docmCode;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : GORDOCM_DOCM_CODE, Lookup lineage reference object : gtvdocm
     * 
     */
    @JsonProperty("docmCode")
    public void setDocmCode(String docmCode) {
        this.docmCode = docmCode;
    }

    public InternationalInformation100PostRequest withDocmCode(String docmCode) {
        this.docmCode = docmCode;
        return this;
    }

    /**
     * Number
     * <p>
     * Lineage reference object : GOBINTL_PASSPORT_ID
     * 
     */
    @JsonProperty("passportId")
    public String getPassportId() {
        return passportId;
    }

    /**
     * Number
     * <p>
     * Lineage reference object : GOBINTL_PASSPORT_ID
     * 
     */
    @JsonProperty("passportId")
    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }

    public InternationalInformation100PostRequest withPassportId(String passportId) {
        this.passportId = passportId;
        return this;
    }

    /**
     * Date Requested
     * <p>
     * Lineage reference object : GORVISA_VISA_REQ_DATE
     * 
     */
    @JsonProperty("visaReqDate")
    public Date getVisaReqDate() {
        return visaReqDate;
    }

    /**
     * Date Requested
     * <p>
     * Lineage reference object : GORVISA_VISA_REQ_DATE
     * 
     */
    @JsonProperty("visaReqDate")
    public void setVisaReqDate(Date visaReqDate) {
        this.visaReqDate = visaReqDate;
    }

    public InternationalInformation100PostRequest withVisaReqDate(Date visaReqDate) {
        this.visaReqDate = visaReqDate;
        return this;
    }

    /**
     * Nation of Citizen
     * <p>
     * Lineage reference object : GOBINTL_NATN_CODE_LEGAL, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCodeLegal")
    public String getNatnCodeLegal() {
        return natnCodeLegal;
    }

    /**
     * Nation of Citizen
     * <p>
     * Lineage reference object : GOBINTL_NATN_CODE_LEGAL, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCodeLegal")
    public void setNatnCodeLegal(String natnCodeLegal) {
        this.natnCodeLegal = natnCodeLegal;
    }

    public InternationalInformation100PostRequest withNatnCodeLegal(String natnCodeLegal) {
        this.natnCodeLegal = natnCodeLegal;
        return this;
    }

    /**
     * Nation of Issue
     * <p>
     * Lineage reference object : GORVISA_NATN_CODE_ISSUE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCodeIssue")
    public String getNatnCodeIssue() {
        return natnCodeIssue;
    }

    /**
     * Nation of Issue
     * <p>
     * Lineage reference object : GORVISA_NATN_CODE_ISSUE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCodeIssue")
    public void setNatnCodeIssue(String natnCodeIssue) {
        this.natnCodeIssue = natnCodeIssue;
    }

    public InternationalInformation100PostRequest withNatnCodeIssue(String natnCodeIssue) {
        this.natnCodeIssue = natnCodeIssue;
        return this;
    }

    /**
     * Date Issued
     * <p>
     * Lineage reference object : GORVISA_VISA_ISSUE_DATE
     * 
     */
    @JsonProperty("visaIssueDate")
    public Date getVisaIssueDate() {
        return visaIssueDate;
    }

    /**
     * Date Issued
     * <p>
     * Lineage reference object : GORVISA_VISA_ISSUE_DATE
     * 
     */
    @JsonProperty("visaIssueDate")
    public void setVisaIssueDate(Date visaIssueDate) {
        this.visaIssueDate = visaIssueDate;
    }

    public InternationalInformation100PostRequest withVisaIssueDate(Date visaIssueDate) {
        this.visaIssueDate = visaIssueDate;
        return this;
    }

    /**
     * Visa Number
     * <p>
     * Lineage reference object : GORVISA_VISA_NUMBER
     * 
     */
    @JsonProperty("visaNumber")
    public String getVisaNumber() {
        return visaNumber;
    }

    /**
     * Visa Number
     * <p>
     * Lineage reference object : GORVISA_VISA_NUMBER
     * 
     */
    @JsonProperty("visaNumber")
    public void setVisaNumber(String visaNumber) {
        this.visaNumber = visaNumber;
    }

    public InternationalInformation100PostRequest withVisaNumber(String visaNumber) {
        this.visaNumber = visaNumber;
        return this;
    }

    /**
     * Number of Entries
     * <p>
     * Lineage reference object : GORVISA_NO_ENTRIES
     * 
     */
    @JsonProperty("noEntries")
    public String getNoEntries() {
        return noEntries;
    }

    /**
     * Number of Entries
     * <p>
     * Lineage reference object : GORVISA_NO_ENTRIES
     * 
     */
    @JsonProperty("noEntries")
    public void setNoEntries(String noEntries) {
        this.noEntries = noEntries;
    }

    public InternationalInformation100PostRequest withNoEntries(String noEntries) {
        this.noEntries = noEntries;
        return this;
    }

    /**
     * Certification
     * <p>
     * Lineage reference object : GOBINTL_CELG_CODE, Lookup lineage reference object : gtvcelg
     * 
     */
    @JsonProperty("celgCode")
    public String getCelgCode() {
        return celgCode;
    }

    /**
     * Certification
     * <p>
     * Lineage reference object : GOBINTL_CELG_CODE, Lookup lineage reference object : gtvcelg
     * 
     */
    @JsonProperty("celgCode")
    public void setCelgCode(String celgCode) {
        this.celgCode = celgCode;
    }

    public InternationalInformation100PostRequest withCelgCode(String celgCode) {
        this.celgCode = celgCode;
        return this;
    }

    /**
     * Number
     * <p>
     * Lineage reference object : GOBINTL_CERT_NUMBER
     * 
     */
    @JsonProperty("certNumber")
    public String getCertNumber() {
        return certNumber;
    }

    /**
     * Number
     * <p>
     * Lineage reference object : GOBINTL_CERT_NUMBER
     * 
     */
    @JsonProperty("certNumber")
    public void setCertNumber(String certNumber) {
        this.certNumber = certNumber;
    }

    public InternationalInformation100PostRequest withCertNumber(String certNumber) {
        this.certNumber = certNumber;
        return this;
    }

    /**
     * Sponsor
     * <p>
     * Lineage reference object : GOBINTL_SPON_CODE, Lookup lineage reference object : stvspon
     * 
     */
    @JsonProperty("sponCode")
    public String getSponCode() {
        return sponCode;
    }

    /**
     * Sponsor
     * <p>
     * Lineage reference object : GOBINTL_SPON_CODE, Lookup lineage reference object : stvspon
     * 
     */
    @JsonProperty("sponCode")
    public void setSponCode(String sponCode) {
        this.sponCode = sponCode;
    }

    public InternationalInformation100PostRequest withSponCode(String sponCode) {
        this.sponCode = sponCode;
        return this;
    }

    /**
     * Admission Request
     * <p>
     * Lineage reference object : GOBINTL_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("admrCode")
    public String getAdmrCode() {
        return admrCode;
    }

    /**
     * Admission Request
     * <p>
     * Lineage reference object : GOBINTL_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("admrCode")
    public void setAdmrCode(String admrCode) {
        this.admrCode = admrCode;
    }

    public InternationalInformation100PostRequest withAdmrCode(String admrCode) {
        this.admrCode = admrCode;
        return this;
    }

    /**
     * Entry
     * <p>
     * Lineage reference object : GORVISA_ENTRY_IND
     * 
     */
    @JsonProperty("entryInd")
    public String getEntryInd() {
        return entryInd;
    }

    /**
     * Entry
     * <p>
     * Lineage reference object : GORVISA_ENTRY_IND
     * 
     */
    @JsonProperty("entryInd")
    public void setEntryInd(String entryInd) {
        this.entryInd = entryInd;
    }

    public InternationalInformation100PostRequest withEntryInd(String entryInd) {
        this.entryInd = entryInd;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : GORVISA_VISA_EXPIRE_DATE
     * 
     */
    @JsonProperty("visaExpireDate")
    public Date getVisaExpireDate() {
        return visaExpireDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : GORVISA_VISA_EXPIRE_DATE
     * 
     */
    @JsonProperty("visaExpireDate")
    public void setVisaExpireDate(Date visaExpireDate) {
        this.visaExpireDate = visaExpireDate;
    }

    public InternationalInformation100PostRequest withVisaExpireDate(Date visaExpireDate) {
        this.visaExpireDate = visaExpireDate;
        return this;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : GORVISA_VISA_START_DATE
     * 
     */
    @JsonProperty("visaStartDate")
    public Date getVisaStartDate() {
        return visaStartDate;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : GORVISA_VISA_START_DATE
     * 
     */
    @JsonProperty("visaStartDate")
    public void setVisaStartDate(Date visaStartDate) {
        this.visaStartDate = visaStartDate;
    }

    public InternationalInformation100PostRequest withVisaStartDate(Date visaStartDate) {
        this.visaStartDate = visaStartDate;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : GOBINTL_I94_STATUS
     * 
     */
    @JsonProperty("i94Status")
    public String getI94Status() {
        return i94Status;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : GOBINTL_I94_STATUS
     * 
     */
    @JsonProperty("i94Status")
    public void setI94Status(String i94Status) {
        this.i94Status = i94Status;
    }

    public InternationalInformation100PostRequest withI94Status(String i94Status) {
        this.i94Status = i94Status;
        return this;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : GOBINTL_I94_DATE
     * 
     */
    @JsonProperty("i94Date")
    public Date getI94Date() {
        return i94Date;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : GOBINTL_I94_DATE
     * 
     */
    @JsonProperty("i94Date")
    public void setI94Date(Date i94Date) {
        this.i94Date = i94Date;
    }

    public InternationalInformation100PostRequest withI94Date(Date i94Date) {
        this.i94Date = i94Date;
        return this;
    }

    /**
     * Receipt Date
     * <p>
     * Lineage reference object : GOBINTL_CERT_DATE_RECEIPT
     * 
     */
    @JsonProperty("certDateReceipt")
    public Date getCertDateReceipt() {
        return certDateReceipt;
    }

    /**
     * Receipt Date
     * <p>
     * Lineage reference object : GOBINTL_CERT_DATE_RECEIPT
     * 
     */
    @JsonProperty("certDateReceipt")
    public void setCertDateReceipt(Date certDateReceipt) {
        this.certDateReceipt = certDateReceipt;
    }

    public InternationalInformation100PostRequest withCertDateReceipt(Date certDateReceipt) {
        this.certDateReceipt = certDateReceipt;
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

    public InternationalInformation100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InternationalInformation100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("vtypCode");
        sb.append('=');
        sb.append(((this.vtypCode == null)?"<null>":this.vtypCode));
        sb.append(',');
        sb.append("certDateIssue");
        sb.append('=');
        sb.append(((this.certDateIssue == null)?"<null>":this.certDateIssue));
        sb.append(',');
        sb.append("childNumber");
        sb.append('=');
        sb.append(((this.childNumber == null)?"<null>":this.childNumber));
        sb.append(',');
        sb.append("srceCode");
        sb.append('=');
        sb.append(((this.srceCode == null)?"<null>":this.srceCode));
        sb.append(',');
        sb.append("emptCode");
        sb.append('=');
        sb.append(((this.emptCode == null)?"<null>":this.emptCode));
        sb.append(',');
        sb.append("langCode");
        sb.append('=');
        sb.append(((this.langCode == null)?"<null>":this.langCode));
        sb.append(',');
        sb.append("vissCode");
        sb.append('=');
        sb.append(((this.vissCode == null)?"<null>":this.vissCode));
        sb.append(',');
        sb.append("foreignSsn");
        sb.append('=');
        sb.append(((this.foreignSsn == null)?"<null>":this.foreignSsn));
        sb.append(',');
        sb.append("gobintlNatnCodeIssue");
        sb.append('=');
        sb.append(((this.gobintlNatnCodeIssue == null)?"<null>":this.gobintlNatnCodeIssue));
        sb.append(',');
        sb.append("passportExpDate");
        sb.append('=');
        sb.append(((this.passportExpDate == null)?"<null>":this.passportExpDate));
        sb.append(',');
        sb.append("duration");
        sb.append('=');
        sb.append(((this.duration == null)?"<null>":this.duration));
        sb.append(',');
        sb.append("natnCodeBirth");
        sb.append('=');
        sb.append(((this.natnCodeBirth == null)?"<null>":this.natnCodeBirth));
        sb.append(',');
        sb.append("signatureInd");
        sb.append('=');
        sb.append(((this.signatureInd == null)?"<null>":this.signatureInd));
        sb.append(',');
        sb.append("pentCode");
        sb.append('=');
        sb.append(((this.pentCode == null)?"<null>":this.pentCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("docmCode");
        sb.append('=');
        sb.append(((this.docmCode == null)?"<null>":this.docmCode));
        sb.append(',');
        sb.append("passportId");
        sb.append('=');
        sb.append(((this.passportId == null)?"<null>":this.passportId));
        sb.append(',');
        sb.append("visaReqDate");
        sb.append('=');
        sb.append(((this.visaReqDate == null)?"<null>":this.visaReqDate));
        sb.append(',');
        sb.append("natnCodeLegal");
        sb.append('=');
        sb.append(((this.natnCodeLegal == null)?"<null>":this.natnCodeLegal));
        sb.append(',');
        sb.append("natnCodeIssue");
        sb.append('=');
        sb.append(((this.natnCodeIssue == null)?"<null>":this.natnCodeIssue));
        sb.append(',');
        sb.append("visaIssueDate");
        sb.append('=');
        sb.append(((this.visaIssueDate == null)?"<null>":this.visaIssueDate));
        sb.append(',');
        sb.append("visaNumber");
        sb.append('=');
        sb.append(((this.visaNumber == null)?"<null>":this.visaNumber));
        sb.append(',');
        sb.append("noEntries");
        sb.append('=');
        sb.append(((this.noEntries == null)?"<null>":this.noEntries));
        sb.append(',');
        sb.append("celgCode");
        sb.append('=');
        sb.append(((this.celgCode == null)?"<null>":this.celgCode));
        sb.append(',');
        sb.append("certNumber");
        sb.append('=');
        sb.append(((this.certNumber == null)?"<null>":this.certNumber));
        sb.append(',');
        sb.append("sponCode");
        sb.append('=');
        sb.append(((this.sponCode == null)?"<null>":this.sponCode));
        sb.append(',');
        sb.append("admrCode");
        sb.append('=');
        sb.append(((this.admrCode == null)?"<null>":this.admrCode));
        sb.append(',');
        sb.append("entryInd");
        sb.append('=');
        sb.append(((this.entryInd == null)?"<null>":this.entryInd));
        sb.append(',');
        sb.append("visaExpireDate");
        sb.append('=');
        sb.append(((this.visaExpireDate == null)?"<null>":this.visaExpireDate));
        sb.append(',');
        sb.append("visaStartDate");
        sb.append('=');
        sb.append(((this.visaStartDate == null)?"<null>":this.visaStartDate));
        sb.append(',');
        sb.append("i94Status");
        sb.append('=');
        sb.append(((this.i94Status == null)?"<null>":this.i94Status));
        sb.append(',');
        sb.append("i94Date");
        sb.append('=');
        sb.append(((this.i94Date == null)?"<null>":this.i94Date));
        sb.append(',');
        sb.append("certDateReceipt");
        sb.append('=');
        sb.append(((this.certDateReceipt == null)?"<null>":this.certDateReceipt));
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
        result = ((result* 31)+((this.vtypCode == null)? 0 :this.vtypCode.hashCode()));
        result = ((result* 31)+((this.certDateIssue == null)? 0 :this.certDateIssue.hashCode()));
        result = ((result* 31)+((this.childNumber == null)? 0 :this.childNumber.hashCode()));
        result = ((result* 31)+((this.srceCode == null)? 0 :this.srceCode.hashCode()));
        result = ((result* 31)+((this.emptCode == null)? 0 :this.emptCode.hashCode()));
        result = ((result* 31)+((this.langCode == null)? 0 :this.langCode.hashCode()));
        result = ((result* 31)+((this.vissCode == null)? 0 :this.vissCode.hashCode()));
        result = ((result* 31)+((this.foreignSsn == null)? 0 :this.foreignSsn.hashCode()));
        result = ((result* 31)+((this.gobintlNatnCodeIssue == null)? 0 :this.gobintlNatnCodeIssue.hashCode()));
        result = ((result* 31)+((this.passportExpDate == null)? 0 :this.passportExpDate.hashCode()));
        result = ((result* 31)+((this.duration == null)? 0 :this.duration.hashCode()));
        result = ((result* 31)+((this.natnCodeBirth == null)? 0 :this.natnCodeBirth.hashCode()));
        result = ((result* 31)+((this.signatureInd == null)? 0 :this.signatureInd.hashCode()));
        result = ((result* 31)+((this.pentCode == null)? 0 :this.pentCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.docmCode == null)? 0 :this.docmCode.hashCode()));
        result = ((result* 31)+((this.passportId == null)? 0 :this.passportId.hashCode()));
        result = ((result* 31)+((this.visaReqDate == null)? 0 :this.visaReqDate.hashCode()));
        result = ((result* 31)+((this.natnCodeLegal == null)? 0 :this.natnCodeLegal.hashCode()));
        result = ((result* 31)+((this.natnCodeIssue == null)? 0 :this.natnCodeIssue.hashCode()));
        result = ((result* 31)+((this.visaIssueDate == null)? 0 :this.visaIssueDate.hashCode()));
        result = ((result* 31)+((this.visaNumber == null)? 0 :this.visaNumber.hashCode()));
        result = ((result* 31)+((this.noEntries == null)? 0 :this.noEntries.hashCode()));
        result = ((result* 31)+((this.celgCode == null)? 0 :this.celgCode.hashCode()));
        result = ((result* 31)+((this.certNumber == null)? 0 :this.certNumber.hashCode()));
        result = ((result* 31)+((this.sponCode == null)? 0 :this.sponCode.hashCode()));
        result = ((result* 31)+((this.admrCode == null)? 0 :this.admrCode.hashCode()));
        result = ((result* 31)+((this.entryInd == null)? 0 :this.entryInd.hashCode()));
        result = ((result* 31)+((this.visaExpireDate == null)? 0 :this.visaExpireDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.visaStartDate == null)? 0 :this.visaStartDate.hashCode()));
        result = ((result* 31)+((this.i94Status == null)? 0 :this.i94Status.hashCode()));
        result = ((result* 31)+((this.i94Date == null)? 0 :this.i94Date.hashCode()));
        result = ((result* 31)+((this.certDateReceipt == null)? 0 :this.certDateReceipt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InternationalInformation100PostRequest) == false) {
            return false;
        }
        InternationalInformation100PostRequest rhs = ((InternationalInformation100PostRequest) other);
        return (((((((((((((((((((((((((((((((((((this.vtypCode == rhs.vtypCode)||((this.vtypCode!= null)&&this.vtypCode.equals(rhs.vtypCode)))&&((this.certDateIssue == rhs.certDateIssue)||((this.certDateIssue!= null)&&this.certDateIssue.equals(rhs.certDateIssue))))&&((this.childNumber == rhs.childNumber)||((this.childNumber!= null)&&this.childNumber.equals(rhs.childNumber))))&&((this.srceCode == rhs.srceCode)||((this.srceCode!= null)&&this.srceCode.equals(rhs.srceCode))))&&((this.emptCode == rhs.emptCode)||((this.emptCode!= null)&&this.emptCode.equals(rhs.emptCode))))&&((this.langCode == rhs.langCode)||((this.langCode!= null)&&this.langCode.equals(rhs.langCode))))&&((this.vissCode == rhs.vissCode)||((this.vissCode!= null)&&this.vissCode.equals(rhs.vissCode))))&&((this.foreignSsn == rhs.foreignSsn)||((this.foreignSsn!= null)&&this.foreignSsn.equals(rhs.foreignSsn))))&&((this.gobintlNatnCodeIssue == rhs.gobintlNatnCodeIssue)||((this.gobintlNatnCodeIssue!= null)&&this.gobintlNatnCodeIssue.equals(rhs.gobintlNatnCodeIssue))))&&((this.passportExpDate == rhs.passportExpDate)||((this.passportExpDate!= null)&&this.passportExpDate.equals(rhs.passportExpDate))))&&((this.duration == rhs.duration)||((this.duration!= null)&&this.duration.equals(rhs.duration))))&&((this.natnCodeBirth == rhs.natnCodeBirth)||((this.natnCodeBirth!= null)&&this.natnCodeBirth.equals(rhs.natnCodeBirth))))&&((this.signatureInd == rhs.signatureInd)||((this.signatureInd!= null)&&this.signatureInd.equals(rhs.signatureInd))))&&((this.pentCode == rhs.pentCode)||((this.pentCode!= null)&&this.pentCode.equals(rhs.pentCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.docmCode == rhs.docmCode)||((this.docmCode!= null)&&this.docmCode.equals(rhs.docmCode))))&&((this.passportId == rhs.passportId)||((this.passportId!= null)&&this.passportId.equals(rhs.passportId))))&&((this.visaReqDate == rhs.visaReqDate)||((this.visaReqDate!= null)&&this.visaReqDate.equals(rhs.visaReqDate))))&&((this.natnCodeLegal == rhs.natnCodeLegal)||((this.natnCodeLegal!= null)&&this.natnCodeLegal.equals(rhs.natnCodeLegal))))&&((this.natnCodeIssue == rhs.natnCodeIssue)||((this.natnCodeIssue!= null)&&this.natnCodeIssue.equals(rhs.natnCodeIssue))))&&((this.visaIssueDate == rhs.visaIssueDate)||((this.visaIssueDate!= null)&&this.visaIssueDate.equals(rhs.visaIssueDate))))&&((this.visaNumber == rhs.visaNumber)||((this.visaNumber!= null)&&this.visaNumber.equals(rhs.visaNumber))))&&((this.noEntries == rhs.noEntries)||((this.noEntries!= null)&&this.noEntries.equals(rhs.noEntries))))&&((this.celgCode == rhs.celgCode)||((this.celgCode!= null)&&this.celgCode.equals(rhs.celgCode))))&&((this.certNumber == rhs.certNumber)||((this.certNumber!= null)&&this.certNumber.equals(rhs.certNumber))))&&((this.sponCode == rhs.sponCode)||((this.sponCode!= null)&&this.sponCode.equals(rhs.sponCode))))&&((this.admrCode == rhs.admrCode)||((this.admrCode!= null)&&this.admrCode.equals(rhs.admrCode))))&&((this.entryInd == rhs.entryInd)||((this.entryInd!= null)&&this.entryInd.equals(rhs.entryInd))))&&((this.visaExpireDate == rhs.visaExpireDate)||((this.visaExpireDate!= null)&&this.visaExpireDate.equals(rhs.visaExpireDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.visaStartDate == rhs.visaStartDate)||((this.visaStartDate!= null)&&this.visaStartDate.equals(rhs.visaStartDate))))&&((this.i94Status == rhs.i94Status)||((this.i94Status!= null)&&this.i94Status.equals(rhs.i94Status))))&&((this.i94Date == rhs.i94Date)||((this.i94Date!= null)&&this.i94Date.equals(rhs.i94Date))))&&((this.certDateReceipt == rhs.certDateReceipt)||((this.certDateReceipt!= null)&&this.certDateReceipt.equals(rhs.certDateReceipt))));
    }

}
