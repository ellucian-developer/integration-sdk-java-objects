
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
    "childNumber",
    "criteria.userId",
    "criteria.noEntries",
    "vissCode",
    "foreignSsn",
    "natnCodeBirth",
    "criteria.seqNo",
    "pentCode",
    "id",
    "docmCode",
    "natnCodeLegal",
    "natnCodeIssue",
    "visaIssueDate",
    "criteria.visaExpireDate",
    "criteria.entryInd",
    "certNumber",
    "admrCode",
    "criteria.pentDesc",
    "criteria.visaIssueDate",
    "entryInd",
    "visaStartDate",
    "i94Date",
    "certDateReceipt",
    "certDateIssue",
    "srceCode",
    "criteria.activityDate",
    "criteria.visaReqDate",
    "emptCode",
    "criteria.vissCode",
    "langCode",
    "gobintlNatnCodeIssue",
    "passportExpDate",
    "duration",
    "criteria.vtypCode",
    "signatureInd",
    "criteria.pentCode",
    "passportId",
    "criteria.visaStartDate",
    "visaReqDate",
    "visaNumber",
    "noEntries",
    "celgCode",
    "sponCode",
    "criteria.vtypDesc",
    "criteria.issueNatnDesc",
    "criteria.natnCodeIssue",
    "visaExpireDate",
    "criteria.vissDesc",
    "i94Status",
    "criteria.visaNumber"
})
@Generated("jsonschema2pojo")
public class InternationalInformation100PutRequest {

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
     * Number of Children Accompanying Person
     * <p>
     * Lineage reference object : GOBINTL_CHILD_NUMBER
     * 
     */
    @JsonProperty("childNumber")
    @JsonPropertyDescription("Lineage reference object : GOBINTL_CHILD_NUMBER")
    private Double childNumber;
    /**
     * Gorvisa User Id
     * <p>
     * Lineage reference object : GORVISA_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    @JsonPropertyDescription("Lineage reference object : GORVISA_USER_ID")
    private String criteriaUserId;
    /**
     * Number of Entries
     * <p>
     * Lineage reference object : GORVISA_NO_ENTRIES
     * 
     */
    @JsonProperty("criteria.noEntries")
    @JsonPropertyDescription("Lineage reference object : GORVISA_NO_ENTRIES")
    private String criteriaNoEntries;
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
     * Nation of Birth
     * <p>
     * Lineage reference object : GOBINTL_NATN_CODE_BIRTH, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCodeBirth")
    @JsonPropertyDescription("Lineage reference object : GOBINTL_NATN_CODE_BIRTH, Lookup lineage reference object : stvnatn")
    private String natnCodeBirth;
    /**
     * Sequence Number
     * <p>
     * Lineage reference object : GORVISA_SEQ_NO
     * 
     */
    @JsonProperty("criteria.seqNo")
    @JsonPropertyDescription("Lineage reference object : GORVISA_SEQ_NO")
    private Double criteriaSeqNo;
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
     * End Date
     * <p>
     * Lineage reference object : GORVISA_VISA_EXPIRE_DATE
     * 
     */
    @JsonProperty("criteria.visaExpireDate")
    @JsonPropertyDescription("Lineage reference object : GORVISA_VISA_EXPIRE_DATE")
    private Date criteriaVisaExpireDate;
    /**
     * Entry
     * <p>
     * Lineage reference object : GORVISA_ENTRY_IND
     * 
     */
    @JsonProperty("criteria.entryInd")
    @JsonPropertyDescription("Lineage reference object : GORVISA_ENTRY_IND")
    private String criteriaEntryInd;
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
     * Admission Request
     * <p>
     * Lineage reference object : GOBINTL_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("admrCode")
    @JsonPropertyDescription("Lineage reference object : GOBINTL_ADMR_CODE, Lookup lineage reference object : stvadmr")
    private String admrCode;
    @JsonProperty("criteria.pentDesc")
    private String criteriaPentDesc;
    /**
     * Date Issued
     * <p>
     * Lineage reference object : GORVISA_VISA_ISSUE_DATE
     * 
     */
    @JsonProperty("criteria.visaIssueDate")
    @JsonPropertyDescription("Lineage reference object : GORVISA_VISA_ISSUE_DATE")
    private Date criteriaVisaIssueDate;
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
     * Start Date
     * <p>
     * Lineage reference object : GORVISA_VISA_START_DATE
     * 
     */
    @JsonProperty("visaStartDate")
    @JsonPropertyDescription("Lineage reference object : GORVISA_VISA_START_DATE")
    private Date visaStartDate;
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
     * Source
     * <p>
     * Lineage reference object : GORDOCM_SRCE_CODE, Lookup lineage reference object : gtvsrce
     * 
     */
    @JsonProperty("srceCode")
    @JsonPropertyDescription("Lineage reference object : GORDOCM_SRCE_CODE, Lookup lineage reference object : gtvsrce")
    private String srceCode;
    /**
     * Gorvisa Activity Date
     * <p>
     * Lineage reference object : GORVISA_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : GORVISA_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * Date Requested
     * <p>
     * Lineage reference object : GORVISA_VISA_REQ_DATE
     * 
     */
    @JsonProperty("criteria.visaReqDate")
    @JsonPropertyDescription("Lineage reference object : GORVISA_VISA_REQ_DATE")
    private Date criteriaVisaReqDate;
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
     * Issuing Authority
     * <p>
     * Lineage reference object : GORVISA_VISS_CODE, Lookup lineage reference object : gtvviss
     * 
     */
    @JsonProperty("criteria.vissCode")
    @JsonPropertyDescription("Lineage reference object : GORVISA_VISS_CODE, Lookup lineage reference object : gtvviss")
    private String criteriaVissCode;
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
     * Visa Type
     * <p>
     * Lineage reference object : GORVISA_VTYP_CODE, Lookup lineage reference object : stvvtyp
     * 
     */
    @JsonProperty("criteria.vtypCode")
    @JsonPropertyDescription("Lineage reference object : GORVISA_VTYP_CODE, Lookup lineage reference object : stvvtyp")
    private String criteriaVtypCode;
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
    @JsonProperty("criteria.pentCode")
    @JsonPropertyDescription("Lineage reference object : GORVISA_PENT_CODE, Lookup lineage reference object : stvpent")
    private String criteriaPentCode;
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
     * Start Date
     * <p>
     * Lineage reference object : GORVISA_VISA_START_DATE
     * 
     */
    @JsonProperty("criteria.visaStartDate")
    @JsonPropertyDescription("Lineage reference object : GORVISA_VISA_START_DATE")
    private Date criteriaVisaStartDate;
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
     * Sponsor
     * <p>
     * Lineage reference object : GOBINTL_SPON_CODE, Lookup lineage reference object : stvspon
     * 
     */
    @JsonProperty("sponCode")
    @JsonPropertyDescription("Lineage reference object : GOBINTL_SPON_CODE, Lookup lineage reference object : stvspon")
    private String sponCode;
    /**
     * Visa Information
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.vtypDesc")
    private String criteriaVtypDesc;
    @JsonProperty("criteria.issueNatnDesc")
    private String criteriaIssueNatnDesc;
    /**
     * Nation of Issue
     * <p>
     * Lineage reference object : GORVISA_NATN_CODE_ISSUE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("criteria.natnCodeIssue")
    @JsonPropertyDescription("Lineage reference object : GORVISA_NATN_CODE_ISSUE, Lookup lineage reference object : stvnatn")
    private String criteriaNatnCodeIssue;
    /**
     * End Date
     * <p>
     * Lineage reference object : GORVISA_VISA_EXPIRE_DATE
     * 
     */
    @JsonProperty("visaExpireDate")
    @JsonPropertyDescription("Lineage reference object : GORVISA_VISA_EXPIRE_DATE")
    private Date visaExpireDate;
    @JsonProperty("criteria.vissDesc")
    private String criteriaVissDesc;
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
     * Visa Number
     * <p>
     * Lineage reference object : GORVISA_VISA_NUMBER
     * 
     */
    @JsonProperty("criteria.visaNumber")
    @JsonPropertyDescription("Lineage reference object : GORVISA_VISA_NUMBER")
    private String criteriaVisaNumber;
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

    public InternationalInformation100PutRequest withVtypCode(String vtypCode) {
        this.vtypCode = vtypCode;
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

    public InternationalInformation100PutRequest withChildNumber(Double childNumber) {
        this.childNumber = childNumber;
        return this;
    }

    /**
     * Gorvisa User Id
     * <p>
     * Lineage reference object : GORVISA_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public String getCriteriaUserId() {
        return criteriaUserId;
    }

    /**
     * Gorvisa User Id
     * <p>
     * Lineage reference object : GORVISA_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public void setCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
    }

    public InternationalInformation100PutRequest withCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
        return this;
    }

    /**
     * Number of Entries
     * <p>
     * Lineage reference object : GORVISA_NO_ENTRIES
     * 
     */
    @JsonProperty("criteria.noEntries")
    public String getCriteriaNoEntries() {
        return criteriaNoEntries;
    }

    /**
     * Number of Entries
     * <p>
     * Lineage reference object : GORVISA_NO_ENTRIES
     * 
     */
    @JsonProperty("criteria.noEntries")
    public void setCriteriaNoEntries(String criteriaNoEntries) {
        this.criteriaNoEntries = criteriaNoEntries;
    }

    public InternationalInformation100PutRequest withCriteriaNoEntries(String criteriaNoEntries) {
        this.criteriaNoEntries = criteriaNoEntries;
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

    public InternationalInformation100PutRequest withVissCode(String vissCode) {
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

    public InternationalInformation100PutRequest withForeignSsn(String foreignSsn) {
        this.foreignSsn = foreignSsn;
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

    public InternationalInformation100PutRequest withNatnCodeBirth(String natnCodeBirth) {
        this.natnCodeBirth = natnCodeBirth;
        return this;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : GORVISA_SEQ_NO
     * 
     */
    @JsonProperty("criteria.seqNo")
    public Double getCriteriaSeqNo() {
        return criteriaSeqNo;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : GORVISA_SEQ_NO
     * 
     */
    @JsonProperty("criteria.seqNo")
    public void setCriteriaSeqNo(Double criteriaSeqNo) {
        this.criteriaSeqNo = criteriaSeqNo;
    }

    public InternationalInformation100PutRequest withCriteriaSeqNo(Double criteriaSeqNo) {
        this.criteriaSeqNo = criteriaSeqNo;
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

    public InternationalInformation100PutRequest withPentCode(String pentCode) {
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

    public InternationalInformation100PutRequest withId(String id) {
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

    public InternationalInformation100PutRequest withDocmCode(String docmCode) {
        this.docmCode = docmCode;
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

    public InternationalInformation100PutRequest withNatnCodeLegal(String natnCodeLegal) {
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

    public InternationalInformation100PutRequest withNatnCodeIssue(String natnCodeIssue) {
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

    public InternationalInformation100PutRequest withVisaIssueDate(Date visaIssueDate) {
        this.visaIssueDate = visaIssueDate;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : GORVISA_VISA_EXPIRE_DATE
     * 
     */
    @JsonProperty("criteria.visaExpireDate")
    public Date getCriteriaVisaExpireDate() {
        return criteriaVisaExpireDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : GORVISA_VISA_EXPIRE_DATE
     * 
     */
    @JsonProperty("criteria.visaExpireDate")
    public void setCriteriaVisaExpireDate(Date criteriaVisaExpireDate) {
        this.criteriaVisaExpireDate = criteriaVisaExpireDate;
    }

    public InternationalInformation100PutRequest withCriteriaVisaExpireDate(Date criteriaVisaExpireDate) {
        this.criteriaVisaExpireDate = criteriaVisaExpireDate;
        return this;
    }

    /**
     * Entry
     * <p>
     * Lineage reference object : GORVISA_ENTRY_IND
     * 
     */
    @JsonProperty("criteria.entryInd")
    public String getCriteriaEntryInd() {
        return criteriaEntryInd;
    }

    /**
     * Entry
     * <p>
     * Lineage reference object : GORVISA_ENTRY_IND
     * 
     */
    @JsonProperty("criteria.entryInd")
    public void setCriteriaEntryInd(String criteriaEntryInd) {
        this.criteriaEntryInd = criteriaEntryInd;
    }

    public InternationalInformation100PutRequest withCriteriaEntryInd(String criteriaEntryInd) {
        this.criteriaEntryInd = criteriaEntryInd;
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

    public InternationalInformation100PutRequest withCertNumber(String certNumber) {
        this.certNumber = certNumber;
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

    public InternationalInformation100PutRequest withAdmrCode(String admrCode) {
        this.admrCode = admrCode;
        return this;
    }

    @JsonProperty("criteria.pentDesc")
    public String getCriteriaPentDesc() {
        return criteriaPentDesc;
    }

    @JsonProperty("criteria.pentDesc")
    public void setCriteriaPentDesc(String criteriaPentDesc) {
        this.criteriaPentDesc = criteriaPentDesc;
    }

    public InternationalInformation100PutRequest withCriteriaPentDesc(String criteriaPentDesc) {
        this.criteriaPentDesc = criteriaPentDesc;
        return this;
    }

    /**
     * Date Issued
     * <p>
     * Lineage reference object : GORVISA_VISA_ISSUE_DATE
     * 
     */
    @JsonProperty("criteria.visaIssueDate")
    public Date getCriteriaVisaIssueDate() {
        return criteriaVisaIssueDate;
    }

    /**
     * Date Issued
     * <p>
     * Lineage reference object : GORVISA_VISA_ISSUE_DATE
     * 
     */
    @JsonProperty("criteria.visaIssueDate")
    public void setCriteriaVisaIssueDate(Date criteriaVisaIssueDate) {
        this.criteriaVisaIssueDate = criteriaVisaIssueDate;
    }

    public InternationalInformation100PutRequest withCriteriaVisaIssueDate(Date criteriaVisaIssueDate) {
        this.criteriaVisaIssueDate = criteriaVisaIssueDate;
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

    public InternationalInformation100PutRequest withEntryInd(String entryInd) {
        this.entryInd = entryInd;
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

    public InternationalInformation100PutRequest withVisaStartDate(Date visaStartDate) {
        this.visaStartDate = visaStartDate;
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

    public InternationalInformation100PutRequest withI94Date(Date i94Date) {
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

    public InternationalInformation100PutRequest withCertDateReceipt(Date certDateReceipt) {
        this.certDateReceipt = certDateReceipt;
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

    public InternationalInformation100PutRequest withCertDateIssue(Date certDateIssue) {
        this.certDateIssue = certDateIssue;
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

    public InternationalInformation100PutRequest withSrceCode(String srceCode) {
        this.srceCode = srceCode;
        return this;
    }

    /**
     * Gorvisa Activity Date
     * <p>
     * Lineage reference object : GORVISA_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Gorvisa Activity Date
     * <p>
     * Lineage reference object : GORVISA_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public InternationalInformation100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * Date Requested
     * <p>
     * Lineage reference object : GORVISA_VISA_REQ_DATE
     * 
     */
    @JsonProperty("criteria.visaReqDate")
    public Date getCriteriaVisaReqDate() {
        return criteriaVisaReqDate;
    }

    /**
     * Date Requested
     * <p>
     * Lineage reference object : GORVISA_VISA_REQ_DATE
     * 
     */
    @JsonProperty("criteria.visaReqDate")
    public void setCriteriaVisaReqDate(Date criteriaVisaReqDate) {
        this.criteriaVisaReqDate = criteriaVisaReqDate;
    }

    public InternationalInformation100PutRequest withCriteriaVisaReqDate(Date criteriaVisaReqDate) {
        this.criteriaVisaReqDate = criteriaVisaReqDate;
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

    public InternationalInformation100PutRequest withEmptCode(String emptCode) {
        this.emptCode = emptCode;
        return this;
    }

    /**
     * Issuing Authority
     * <p>
     * Lineage reference object : GORVISA_VISS_CODE, Lookup lineage reference object : gtvviss
     * 
     */
    @JsonProperty("criteria.vissCode")
    public String getCriteriaVissCode() {
        return criteriaVissCode;
    }

    /**
     * Issuing Authority
     * <p>
     * Lineage reference object : GORVISA_VISS_CODE, Lookup lineage reference object : gtvviss
     * 
     */
    @JsonProperty("criteria.vissCode")
    public void setCriteriaVissCode(String criteriaVissCode) {
        this.criteriaVissCode = criteriaVissCode;
    }

    public InternationalInformation100PutRequest withCriteriaVissCode(String criteriaVissCode) {
        this.criteriaVissCode = criteriaVissCode;
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

    public InternationalInformation100PutRequest withLangCode(String langCode) {
        this.langCode = langCode;
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

    public InternationalInformation100PutRequest withGobintlNatnCodeIssue(String gobintlNatnCodeIssue) {
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

    public InternationalInformation100PutRequest withPassportExpDate(Date passportExpDate) {
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

    public InternationalInformation100PutRequest withDuration(String duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Visa Type
     * <p>
     * Lineage reference object : GORVISA_VTYP_CODE, Lookup lineage reference object : stvvtyp
     * 
     */
    @JsonProperty("criteria.vtypCode")
    public String getCriteriaVtypCode() {
        return criteriaVtypCode;
    }

    /**
     * Visa Type
     * <p>
     * Lineage reference object : GORVISA_VTYP_CODE, Lookup lineage reference object : stvvtyp
     * 
     */
    @JsonProperty("criteria.vtypCode")
    public void setCriteriaVtypCode(String criteriaVtypCode) {
        this.criteriaVtypCode = criteriaVtypCode;
    }

    public InternationalInformation100PutRequest withCriteriaVtypCode(String criteriaVtypCode) {
        this.criteriaVtypCode = criteriaVtypCode;
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

    public InternationalInformation100PutRequest withSignatureInd(String signatureInd) {
        this.signatureInd = signatureInd;
        return this;
    }

    /**
     * Port of Entry
     * <p>
     * Lineage reference object : GORVISA_PENT_CODE, Lookup lineage reference object : stvpent
     * 
     */
    @JsonProperty("criteria.pentCode")
    public String getCriteriaPentCode() {
        return criteriaPentCode;
    }

    /**
     * Port of Entry
     * <p>
     * Lineage reference object : GORVISA_PENT_CODE, Lookup lineage reference object : stvpent
     * 
     */
    @JsonProperty("criteria.pentCode")
    public void setCriteriaPentCode(String criteriaPentCode) {
        this.criteriaPentCode = criteriaPentCode;
    }

    public InternationalInformation100PutRequest withCriteriaPentCode(String criteriaPentCode) {
        this.criteriaPentCode = criteriaPentCode;
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

    public InternationalInformation100PutRequest withPassportId(String passportId) {
        this.passportId = passportId;
        return this;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : GORVISA_VISA_START_DATE
     * 
     */
    @JsonProperty("criteria.visaStartDate")
    public Date getCriteriaVisaStartDate() {
        return criteriaVisaStartDate;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : GORVISA_VISA_START_DATE
     * 
     */
    @JsonProperty("criteria.visaStartDate")
    public void setCriteriaVisaStartDate(Date criteriaVisaStartDate) {
        this.criteriaVisaStartDate = criteriaVisaStartDate;
    }

    public InternationalInformation100PutRequest withCriteriaVisaStartDate(Date criteriaVisaStartDate) {
        this.criteriaVisaStartDate = criteriaVisaStartDate;
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

    public InternationalInformation100PutRequest withVisaReqDate(Date visaReqDate) {
        this.visaReqDate = visaReqDate;
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

    public InternationalInformation100PutRequest withVisaNumber(String visaNumber) {
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

    public InternationalInformation100PutRequest withNoEntries(String noEntries) {
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

    public InternationalInformation100PutRequest withCelgCode(String celgCode) {
        this.celgCode = celgCode;
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

    public InternationalInformation100PutRequest withSponCode(String sponCode) {
        this.sponCode = sponCode;
        return this;
    }

    /**
     * Visa Information
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.vtypDesc")
    public String getCriteriaVtypDesc() {
        return criteriaVtypDesc;
    }

    /**
     * Visa Information
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.vtypDesc")
    public void setCriteriaVtypDesc(String criteriaVtypDesc) {
        this.criteriaVtypDesc = criteriaVtypDesc;
    }

    public InternationalInformation100PutRequest withCriteriaVtypDesc(String criteriaVtypDesc) {
        this.criteriaVtypDesc = criteriaVtypDesc;
        return this;
    }

    @JsonProperty("criteria.issueNatnDesc")
    public String getCriteriaIssueNatnDesc() {
        return criteriaIssueNatnDesc;
    }

    @JsonProperty("criteria.issueNatnDesc")
    public void setCriteriaIssueNatnDesc(String criteriaIssueNatnDesc) {
        this.criteriaIssueNatnDesc = criteriaIssueNatnDesc;
    }

    public InternationalInformation100PutRequest withCriteriaIssueNatnDesc(String criteriaIssueNatnDesc) {
        this.criteriaIssueNatnDesc = criteriaIssueNatnDesc;
        return this;
    }

    /**
     * Nation of Issue
     * <p>
     * Lineage reference object : GORVISA_NATN_CODE_ISSUE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("criteria.natnCodeIssue")
    public String getCriteriaNatnCodeIssue() {
        return criteriaNatnCodeIssue;
    }

    /**
     * Nation of Issue
     * <p>
     * Lineage reference object : GORVISA_NATN_CODE_ISSUE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("criteria.natnCodeIssue")
    public void setCriteriaNatnCodeIssue(String criteriaNatnCodeIssue) {
        this.criteriaNatnCodeIssue = criteriaNatnCodeIssue;
    }

    public InternationalInformation100PutRequest withCriteriaNatnCodeIssue(String criteriaNatnCodeIssue) {
        this.criteriaNatnCodeIssue = criteriaNatnCodeIssue;
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

    public InternationalInformation100PutRequest withVisaExpireDate(Date visaExpireDate) {
        this.visaExpireDate = visaExpireDate;
        return this;
    }

    @JsonProperty("criteria.vissDesc")
    public String getCriteriaVissDesc() {
        return criteriaVissDesc;
    }

    @JsonProperty("criteria.vissDesc")
    public void setCriteriaVissDesc(String criteriaVissDesc) {
        this.criteriaVissDesc = criteriaVissDesc;
    }

    public InternationalInformation100PutRequest withCriteriaVissDesc(String criteriaVissDesc) {
        this.criteriaVissDesc = criteriaVissDesc;
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

    public InternationalInformation100PutRequest withI94Status(String i94Status) {
        this.i94Status = i94Status;
        return this;
    }

    /**
     * Visa Number
     * <p>
     * Lineage reference object : GORVISA_VISA_NUMBER
     * 
     */
    @JsonProperty("criteria.visaNumber")
    public String getCriteriaVisaNumber() {
        return criteriaVisaNumber;
    }

    /**
     * Visa Number
     * <p>
     * Lineage reference object : GORVISA_VISA_NUMBER
     * 
     */
    @JsonProperty("criteria.visaNumber")
    public void setCriteriaVisaNumber(String criteriaVisaNumber) {
        this.criteriaVisaNumber = criteriaVisaNumber;
    }

    public InternationalInformation100PutRequest withCriteriaVisaNumber(String criteriaVisaNumber) {
        this.criteriaVisaNumber = criteriaVisaNumber;
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

    public InternationalInformation100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InternationalInformation100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("vtypCode");
        sb.append('=');
        sb.append(((this.vtypCode == null)?"<null>":this.vtypCode));
        sb.append(',');
        sb.append("childNumber");
        sb.append('=');
        sb.append(((this.childNumber == null)?"<null>":this.childNumber));
        sb.append(',');
        sb.append("criteriaUserId");
        sb.append('=');
        sb.append(((this.criteriaUserId == null)?"<null>":this.criteriaUserId));
        sb.append(',');
        sb.append("criteriaNoEntries");
        sb.append('=');
        sb.append(((this.criteriaNoEntries == null)?"<null>":this.criteriaNoEntries));
        sb.append(',');
        sb.append("vissCode");
        sb.append('=');
        sb.append(((this.vissCode == null)?"<null>":this.vissCode));
        sb.append(',');
        sb.append("foreignSsn");
        sb.append('=');
        sb.append(((this.foreignSsn == null)?"<null>":this.foreignSsn));
        sb.append(',');
        sb.append("natnCodeBirth");
        sb.append('=');
        sb.append(((this.natnCodeBirth == null)?"<null>":this.natnCodeBirth));
        sb.append(',');
        sb.append("criteriaSeqNo");
        sb.append('=');
        sb.append(((this.criteriaSeqNo == null)?"<null>":this.criteriaSeqNo));
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
        sb.append("criteriaVisaExpireDate");
        sb.append('=');
        sb.append(((this.criteriaVisaExpireDate == null)?"<null>":this.criteriaVisaExpireDate));
        sb.append(',');
        sb.append("criteriaEntryInd");
        sb.append('=');
        sb.append(((this.criteriaEntryInd == null)?"<null>":this.criteriaEntryInd));
        sb.append(',');
        sb.append("certNumber");
        sb.append('=');
        sb.append(((this.certNumber == null)?"<null>":this.certNumber));
        sb.append(',');
        sb.append("admrCode");
        sb.append('=');
        sb.append(((this.admrCode == null)?"<null>":this.admrCode));
        sb.append(',');
        sb.append("criteriaPentDesc");
        sb.append('=');
        sb.append(((this.criteriaPentDesc == null)?"<null>":this.criteriaPentDesc));
        sb.append(',');
        sb.append("criteriaVisaIssueDate");
        sb.append('=');
        sb.append(((this.criteriaVisaIssueDate == null)?"<null>":this.criteriaVisaIssueDate));
        sb.append(',');
        sb.append("entryInd");
        sb.append('=');
        sb.append(((this.entryInd == null)?"<null>":this.entryInd));
        sb.append(',');
        sb.append("visaStartDate");
        sb.append('=');
        sb.append(((this.visaStartDate == null)?"<null>":this.visaStartDate));
        sb.append(',');
        sb.append("i94Date");
        sb.append('=');
        sb.append(((this.i94Date == null)?"<null>":this.i94Date));
        sb.append(',');
        sb.append("certDateReceipt");
        sb.append('=');
        sb.append(((this.certDateReceipt == null)?"<null>":this.certDateReceipt));
        sb.append(',');
        sb.append("certDateIssue");
        sb.append('=');
        sb.append(((this.certDateIssue == null)?"<null>":this.certDateIssue));
        sb.append(',');
        sb.append("srceCode");
        sb.append('=');
        sb.append(((this.srceCode == null)?"<null>":this.srceCode));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("criteriaVisaReqDate");
        sb.append('=');
        sb.append(((this.criteriaVisaReqDate == null)?"<null>":this.criteriaVisaReqDate));
        sb.append(',');
        sb.append("emptCode");
        sb.append('=');
        sb.append(((this.emptCode == null)?"<null>":this.emptCode));
        sb.append(',');
        sb.append("criteriaVissCode");
        sb.append('=');
        sb.append(((this.criteriaVissCode == null)?"<null>":this.criteriaVissCode));
        sb.append(',');
        sb.append("langCode");
        sb.append('=');
        sb.append(((this.langCode == null)?"<null>":this.langCode));
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
        sb.append("criteriaVtypCode");
        sb.append('=');
        sb.append(((this.criteriaVtypCode == null)?"<null>":this.criteriaVtypCode));
        sb.append(',');
        sb.append("signatureInd");
        sb.append('=');
        sb.append(((this.signatureInd == null)?"<null>":this.signatureInd));
        sb.append(',');
        sb.append("criteriaPentCode");
        sb.append('=');
        sb.append(((this.criteriaPentCode == null)?"<null>":this.criteriaPentCode));
        sb.append(',');
        sb.append("passportId");
        sb.append('=');
        sb.append(((this.passportId == null)?"<null>":this.passportId));
        sb.append(',');
        sb.append("criteriaVisaStartDate");
        sb.append('=');
        sb.append(((this.criteriaVisaStartDate == null)?"<null>":this.criteriaVisaStartDate));
        sb.append(',');
        sb.append("visaReqDate");
        sb.append('=');
        sb.append(((this.visaReqDate == null)?"<null>":this.visaReqDate));
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
        sb.append("sponCode");
        sb.append('=');
        sb.append(((this.sponCode == null)?"<null>":this.sponCode));
        sb.append(',');
        sb.append("criteriaVtypDesc");
        sb.append('=');
        sb.append(((this.criteriaVtypDesc == null)?"<null>":this.criteriaVtypDesc));
        sb.append(',');
        sb.append("criteriaIssueNatnDesc");
        sb.append('=');
        sb.append(((this.criteriaIssueNatnDesc == null)?"<null>":this.criteriaIssueNatnDesc));
        sb.append(',');
        sb.append("criteriaNatnCodeIssue");
        sb.append('=');
        sb.append(((this.criteriaNatnCodeIssue == null)?"<null>":this.criteriaNatnCodeIssue));
        sb.append(',');
        sb.append("visaExpireDate");
        sb.append('=');
        sb.append(((this.visaExpireDate == null)?"<null>":this.visaExpireDate));
        sb.append(',');
        sb.append("criteriaVissDesc");
        sb.append('=');
        sb.append(((this.criteriaVissDesc == null)?"<null>":this.criteriaVissDesc));
        sb.append(',');
        sb.append("i94Status");
        sb.append('=');
        sb.append(((this.i94Status == null)?"<null>":this.i94Status));
        sb.append(',');
        sb.append("criteriaVisaNumber");
        sb.append('=');
        sb.append(((this.criteriaVisaNumber == null)?"<null>":this.criteriaVisaNumber));
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
        result = ((result* 31)+((this.childNumber == null)? 0 :this.childNumber.hashCode()));
        result = ((result* 31)+((this.vissCode == null)? 0 :this.vissCode.hashCode()));
        result = ((result* 31)+((this.foreignSsn == null)? 0 :this.foreignSsn.hashCode()));
        result = ((result* 31)+((this.natnCodeBirth == null)? 0 :this.natnCodeBirth.hashCode()));
        result = ((result* 31)+((this.pentCode == null)? 0 :this.pentCode.hashCode()));
        result = ((result* 31)+((this.criteriaNoEntries == null)? 0 :this.criteriaNoEntries.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.docmCode == null)? 0 :this.docmCode.hashCode()));
        result = ((result* 31)+((this.criteriaVisaExpireDate == null)? 0 :this.criteriaVisaExpireDate.hashCode()));
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.natnCodeLegal == null)? 0 :this.natnCodeLegal.hashCode()));
        result = ((result* 31)+((this.natnCodeIssue == null)? 0 :this.natnCodeIssue.hashCode()));
        result = ((result* 31)+((this.criteriaVisaNumber == null)? 0 :this.criteriaVisaNumber.hashCode()));
        result = ((result* 31)+((this.visaIssueDate == null)? 0 :this.visaIssueDate.hashCode()));
        result = ((result* 31)+((this.criteriaVtypDesc == null)? 0 :this.criteriaVtypDesc.hashCode()));
        result = ((result* 31)+((this.certNumber == null)? 0 :this.certNumber.hashCode()));
        result = ((result* 31)+((this.admrCode == null)? 0 :this.admrCode.hashCode()));
        result = ((result* 31)+((this.criteriaUserId == null)? 0 :this.criteriaUserId.hashCode()));
        result = ((result* 31)+((this.criteriaSeqNo == null)? 0 :this.criteriaSeqNo.hashCode()));
        result = ((result* 31)+((this.criteriaVissDesc == null)? 0 :this.criteriaVissDesc.hashCode()));
        result = ((result* 31)+((this.entryInd == null)? 0 :this.entryInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.visaStartDate == null)? 0 :this.visaStartDate.hashCode()));
        result = ((result* 31)+((this.i94Date == null)? 0 :this.i94Date.hashCode()));
        result = ((result* 31)+((this.certDateReceipt == null)? 0 :this.certDateReceipt.hashCode()));
        result = ((result* 31)+((this.certDateIssue == null)? 0 :this.certDateIssue.hashCode()));
        result = ((result* 31)+((this.srceCode == null)? 0 :this.srceCode.hashCode()));
        result = ((result* 31)+((this.emptCode == null)? 0 :this.emptCode.hashCode()));
        result = ((result* 31)+((this.langCode == null)? 0 :this.langCode.hashCode()));
        result = ((result* 31)+((this.criteriaVtypCode == null)? 0 :this.criteriaVtypCode.hashCode()));
        result = ((result* 31)+((this.gobintlNatnCodeIssue == null)? 0 :this.gobintlNatnCodeIssue.hashCode()));
        result = ((result* 31)+((this.passportExpDate == null)? 0 :this.passportExpDate.hashCode()));
        result = ((result* 31)+((this.duration == null)? 0 :this.duration.hashCode()));
        result = ((result* 31)+((this.criteriaNatnCodeIssue == null)? 0 :this.criteriaNatnCodeIssue.hashCode()));
        result = ((result* 31)+((this.criteriaVisaIssueDate == null)? 0 :this.criteriaVisaIssueDate.hashCode()));
        result = ((result* 31)+((this.signatureInd == null)? 0 :this.signatureInd.hashCode()));
        result = ((result* 31)+((this.criteriaPentCode == null)? 0 :this.criteriaPentCode.hashCode()));
        result = ((result* 31)+((this.passportId == null)? 0 :this.passportId.hashCode()));
        result = ((result* 31)+((this.criteriaIssueNatnDesc == null)? 0 :this.criteriaIssueNatnDesc.hashCode()));
        result = ((result* 31)+((this.visaReqDate == null)? 0 :this.visaReqDate.hashCode()));
        result = ((result* 31)+((this.visaNumber == null)? 0 :this.visaNumber.hashCode()));
        result = ((result* 31)+((this.criteriaVissCode == null)? 0 :this.criteriaVissCode.hashCode()));
        result = ((result* 31)+((this.noEntries == null)? 0 :this.noEntries.hashCode()));
        result = ((result* 31)+((this.celgCode == null)? 0 :this.celgCode.hashCode()));
        result = ((result* 31)+((this.criteriaPentDesc == null)? 0 :this.criteriaPentDesc.hashCode()));
        result = ((result* 31)+((this.sponCode == null)? 0 :this.sponCode.hashCode()));
        result = ((result* 31)+((this.criteriaEntryInd == null)? 0 :this.criteriaEntryInd.hashCode()));
        result = ((result* 31)+((this.criteriaVisaStartDate == null)? 0 :this.criteriaVisaStartDate.hashCode()));
        result = ((result* 31)+((this.criteriaVisaReqDate == null)? 0 :this.criteriaVisaReqDate.hashCode()));
        result = ((result* 31)+((this.visaExpireDate == null)? 0 :this.visaExpireDate.hashCode()));
        result = ((result* 31)+((this.i94Status == null)? 0 :this.i94Status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InternationalInformation100PutRequest) == false) {
            return false;
        }
        InternationalInformation100PutRequest rhs = ((InternationalInformation100PutRequest) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((this.vtypCode == rhs.vtypCode)||((this.vtypCode!= null)&&this.vtypCode.equals(rhs.vtypCode)))&&((this.childNumber == rhs.childNumber)||((this.childNumber!= null)&&this.childNumber.equals(rhs.childNumber))))&&((this.vissCode == rhs.vissCode)||((this.vissCode!= null)&&this.vissCode.equals(rhs.vissCode))))&&((this.foreignSsn == rhs.foreignSsn)||((this.foreignSsn!= null)&&this.foreignSsn.equals(rhs.foreignSsn))))&&((this.natnCodeBirth == rhs.natnCodeBirth)||((this.natnCodeBirth!= null)&&this.natnCodeBirth.equals(rhs.natnCodeBirth))))&&((this.pentCode == rhs.pentCode)||((this.pentCode!= null)&&this.pentCode.equals(rhs.pentCode))))&&((this.criteriaNoEntries == rhs.criteriaNoEntries)||((this.criteriaNoEntries!= null)&&this.criteriaNoEntries.equals(rhs.criteriaNoEntries))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.docmCode == rhs.docmCode)||((this.docmCode!= null)&&this.docmCode.equals(rhs.docmCode))))&&((this.criteriaVisaExpireDate == rhs.criteriaVisaExpireDate)||((this.criteriaVisaExpireDate!= null)&&this.criteriaVisaExpireDate.equals(rhs.criteriaVisaExpireDate))))&&((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate))))&&((this.natnCodeLegal == rhs.natnCodeLegal)||((this.natnCodeLegal!= null)&&this.natnCodeLegal.equals(rhs.natnCodeLegal))))&&((this.natnCodeIssue == rhs.natnCodeIssue)||((this.natnCodeIssue!= null)&&this.natnCodeIssue.equals(rhs.natnCodeIssue))))&&((this.criteriaVisaNumber == rhs.criteriaVisaNumber)||((this.criteriaVisaNumber!= null)&&this.criteriaVisaNumber.equals(rhs.criteriaVisaNumber))))&&((this.visaIssueDate == rhs.visaIssueDate)||((this.visaIssueDate!= null)&&this.visaIssueDate.equals(rhs.visaIssueDate))))&&((this.criteriaVtypDesc == rhs.criteriaVtypDesc)||((this.criteriaVtypDesc!= null)&&this.criteriaVtypDesc.equals(rhs.criteriaVtypDesc))))&&((this.certNumber == rhs.certNumber)||((this.certNumber!= null)&&this.certNumber.equals(rhs.certNumber))))&&((this.admrCode == rhs.admrCode)||((this.admrCode!= null)&&this.admrCode.equals(rhs.admrCode))))&&((this.criteriaUserId == rhs.criteriaUserId)||((this.criteriaUserId!= null)&&this.criteriaUserId.equals(rhs.criteriaUserId))))&&((this.criteriaSeqNo == rhs.criteriaSeqNo)||((this.criteriaSeqNo!= null)&&this.criteriaSeqNo.equals(rhs.criteriaSeqNo))))&&((this.criteriaVissDesc == rhs.criteriaVissDesc)||((this.criteriaVissDesc!= null)&&this.criteriaVissDesc.equals(rhs.criteriaVissDesc))))&&((this.entryInd == rhs.entryInd)||((this.entryInd!= null)&&this.entryInd.equals(rhs.entryInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.visaStartDate == rhs.visaStartDate)||((this.visaStartDate!= null)&&this.visaStartDate.equals(rhs.visaStartDate))))&&((this.i94Date == rhs.i94Date)||((this.i94Date!= null)&&this.i94Date.equals(rhs.i94Date))))&&((this.certDateReceipt == rhs.certDateReceipt)||((this.certDateReceipt!= null)&&this.certDateReceipt.equals(rhs.certDateReceipt))))&&((this.certDateIssue == rhs.certDateIssue)||((this.certDateIssue!= null)&&this.certDateIssue.equals(rhs.certDateIssue))))&&((this.srceCode == rhs.srceCode)||((this.srceCode!= null)&&this.srceCode.equals(rhs.srceCode))))&&((this.emptCode == rhs.emptCode)||((this.emptCode!= null)&&this.emptCode.equals(rhs.emptCode))))&&((this.langCode == rhs.langCode)||((this.langCode!= null)&&this.langCode.equals(rhs.langCode))))&&((this.criteriaVtypCode == rhs.criteriaVtypCode)||((this.criteriaVtypCode!= null)&&this.criteriaVtypCode.equals(rhs.criteriaVtypCode))))&&((this.gobintlNatnCodeIssue == rhs.gobintlNatnCodeIssue)||((this.gobintlNatnCodeIssue!= null)&&this.gobintlNatnCodeIssue.equals(rhs.gobintlNatnCodeIssue))))&&((this.passportExpDate == rhs.passportExpDate)||((this.passportExpDate!= null)&&this.passportExpDate.equals(rhs.passportExpDate))))&&((this.duration == rhs.duration)||((this.duration!= null)&&this.duration.equals(rhs.duration))))&&((this.criteriaNatnCodeIssue == rhs.criteriaNatnCodeIssue)||((this.criteriaNatnCodeIssue!= null)&&this.criteriaNatnCodeIssue.equals(rhs.criteriaNatnCodeIssue))))&&((this.criteriaVisaIssueDate == rhs.criteriaVisaIssueDate)||((this.criteriaVisaIssueDate!= null)&&this.criteriaVisaIssueDate.equals(rhs.criteriaVisaIssueDate))))&&((this.signatureInd == rhs.signatureInd)||((this.signatureInd!= null)&&this.signatureInd.equals(rhs.signatureInd))))&&((this.criteriaPentCode == rhs.criteriaPentCode)||((this.criteriaPentCode!= null)&&this.criteriaPentCode.equals(rhs.criteriaPentCode))))&&((this.passportId == rhs.passportId)||((this.passportId!= null)&&this.passportId.equals(rhs.passportId))))&&((this.criteriaIssueNatnDesc == rhs.criteriaIssueNatnDesc)||((this.criteriaIssueNatnDesc!= null)&&this.criteriaIssueNatnDesc.equals(rhs.criteriaIssueNatnDesc))))&&((this.visaReqDate == rhs.visaReqDate)||((this.visaReqDate!= null)&&this.visaReqDate.equals(rhs.visaReqDate))))&&((this.visaNumber == rhs.visaNumber)||((this.visaNumber!= null)&&this.visaNumber.equals(rhs.visaNumber))))&&((this.criteriaVissCode == rhs.criteriaVissCode)||((this.criteriaVissCode!= null)&&this.criteriaVissCode.equals(rhs.criteriaVissCode))))&&((this.noEntries == rhs.noEntries)||((this.noEntries!= null)&&this.noEntries.equals(rhs.noEntries))))&&((this.celgCode == rhs.celgCode)||((this.celgCode!= null)&&this.celgCode.equals(rhs.celgCode))))&&((this.criteriaPentDesc == rhs.criteriaPentDesc)||((this.criteriaPentDesc!= null)&&this.criteriaPentDesc.equals(rhs.criteriaPentDesc))))&&((this.sponCode == rhs.sponCode)||((this.sponCode!= null)&&this.sponCode.equals(rhs.sponCode))))&&((this.criteriaEntryInd == rhs.criteriaEntryInd)||((this.criteriaEntryInd!= null)&&this.criteriaEntryInd.equals(rhs.criteriaEntryInd))))&&((this.criteriaVisaStartDate == rhs.criteriaVisaStartDate)||((this.criteriaVisaStartDate!= null)&&this.criteriaVisaStartDate.equals(rhs.criteriaVisaStartDate))))&&((this.criteriaVisaReqDate == rhs.criteriaVisaReqDate)||((this.criteriaVisaReqDate!= null)&&this.criteriaVisaReqDate.equals(rhs.criteriaVisaReqDate))))&&((this.visaExpireDate == rhs.visaExpireDate)||((this.visaExpireDate!= null)&&this.visaExpireDate.equals(rhs.visaExpireDate))))&&((this.i94Status == rhs.i94Status)||((this.i94Status!= null)&&this.i94Status.equals(rhs.i94Status))));
    }

}
