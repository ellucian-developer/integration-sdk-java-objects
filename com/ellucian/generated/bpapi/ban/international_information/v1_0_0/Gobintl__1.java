
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
    "certDateIssue",
    "childNumber",
    "emptCode",
    "langCode",
    "issueNatnDesc",
    "foreignSsn",
    "passportExpDate",
    "celgDesc",
    "duration",
    "admrDesc",
    "regNumber",
    "sponDesc",
    "natnCodeBirth",
    "birthNatnDesc",
    "signatureInd",
    "passportId",
    "natnCodeLegal",
    "emptDesc",
    "langDesc",
    "natnCodeIssue",
    "celgCode",
    "certNumber",
    "sponCode",
    "admrCode",
    "spouseInd",
    "legalNatnDesc",
    "i94Date",
    "i94Status",
    "certDateReceipt"
})
@Generated("jsonschema2pojo")
public class Gobintl__1 {

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
    @JsonProperty("issueNatnDesc")
    private String issueNatnDesc;
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
     * Expiration Date
     * <p>
     * Lineage reference object : GOBINTL_PASSPORT_EXP_DATE
     * 
     */
    @JsonProperty("passportExpDate")
    @JsonPropertyDescription("Lineage reference object : GOBINTL_PASSPORT_EXP_DATE")
    private Date passportExpDate;
    @JsonProperty("celgDesc")
    private String celgDesc;
    /**
     * Duration of Stay
     * <p>
     * Lineage reference object : GOBINTL_DURATION
     * 
     */
    @JsonProperty("duration")
    @JsonPropertyDescription("Lineage reference object : GOBINTL_DURATION")
    private String duration;
    @JsonProperty("admrDesc")
    private String admrDesc;
    /**
     * Alien Registration Number
     * <p>
     * Lineage reference object : GOBINTL_REG_NUMBER
     * 
     */
    @JsonProperty("regNumber")
    @JsonPropertyDescription("Lineage reference object : GOBINTL_REG_NUMBER")
    private String regNumber;
    @JsonProperty("sponDesc")
    private String sponDesc;
    /**
     * Nation of Birth
     * <p>
     * Lineage reference object : GOBINTL_NATN_CODE_BIRTH, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCodeBirth")
    @JsonPropertyDescription("Lineage reference object : GOBINTL_NATN_CODE_BIRTH, Lookup lineage reference object : stvnatn")
    private String natnCodeBirth;
    @JsonProperty("birthNatnDesc")
    private String birthNatnDesc;
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
     * Number
     * <p>
     * Lineage reference object : GOBINTL_PASSPORT_ID
     * 
     */
    @JsonProperty("passportId")
    @JsonPropertyDescription("Lineage reference object : GOBINTL_PASSPORT_ID")
    private String passportId;
    /**
     * Nation of Citizen
     * <p>
     * Lineage reference object : GOBINTL_NATN_CODE_LEGAL, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCodeLegal")
    @JsonPropertyDescription("Lineage reference object : GOBINTL_NATN_CODE_LEGAL, Lookup lineage reference object : stvnatn")
    private String natnCodeLegal;
    @JsonProperty("emptDesc")
    private String emptDesc;
    @JsonProperty("langDesc")
    private String langDesc;
    /**
     * Nation of Issue
     * <p>
     * Lineage reference object : GOBINTL_NATN_CODE_ISSUE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCodeIssue")
    @JsonPropertyDescription("Lineage reference object : GOBINTL_NATN_CODE_ISSUE, Lookup lineage reference object : stvnatn")
    private String natnCodeIssue;
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
     * Spouse Accompanying Person To Country
     * <p>
     * Lineage reference object : GOBINTL_SPOUSE_IND
     * (Required)
     * 
     */
    @JsonProperty("spouseInd")
    @JsonPropertyDescription("Lineage reference object : GOBINTL_SPOUSE_IND")
    private String spouseInd;
    @JsonProperty("legalNatnDesc")
    private String legalNatnDesc;
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
     * Status
     * <p>
     * Lineage reference object : GOBINTL_I94_STATUS
     * 
     */
    @JsonProperty("i94Status")
    @JsonPropertyDescription("Lineage reference object : GOBINTL_I94_STATUS")
    private String i94Status;
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

    public Gobintl__1 withCertDateIssue(Date certDateIssue) {
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

    public Gobintl__1 withChildNumber(Double childNumber) {
        this.childNumber = childNumber;
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

    public Gobintl__1 withEmptCode(String emptCode) {
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

    public Gobintl__1 withLangCode(String langCode) {
        this.langCode = langCode;
        return this;
    }

    @JsonProperty("issueNatnDesc")
    public String getIssueNatnDesc() {
        return issueNatnDesc;
    }

    @JsonProperty("issueNatnDesc")
    public void setIssueNatnDesc(String issueNatnDesc) {
        this.issueNatnDesc = issueNatnDesc;
    }

    public Gobintl__1 withIssueNatnDesc(String issueNatnDesc) {
        this.issueNatnDesc = issueNatnDesc;
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

    public Gobintl__1 withForeignSsn(String foreignSsn) {
        this.foreignSsn = foreignSsn;
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

    public Gobintl__1 withPassportExpDate(Date passportExpDate) {
        this.passportExpDate = passportExpDate;
        return this;
    }

    @JsonProperty("celgDesc")
    public String getCelgDesc() {
        return celgDesc;
    }

    @JsonProperty("celgDesc")
    public void setCelgDesc(String celgDesc) {
        this.celgDesc = celgDesc;
    }

    public Gobintl__1 withCelgDesc(String celgDesc) {
        this.celgDesc = celgDesc;
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

    public Gobintl__1 withDuration(String duration) {
        this.duration = duration;
        return this;
    }

    @JsonProperty("admrDesc")
    public String getAdmrDesc() {
        return admrDesc;
    }

    @JsonProperty("admrDesc")
    public void setAdmrDesc(String admrDesc) {
        this.admrDesc = admrDesc;
    }

    public Gobintl__1 withAdmrDesc(String admrDesc) {
        this.admrDesc = admrDesc;
        return this;
    }

    /**
     * Alien Registration Number
     * <p>
     * Lineage reference object : GOBINTL_REG_NUMBER
     * 
     */
    @JsonProperty("regNumber")
    public String getRegNumber() {
        return regNumber;
    }

    /**
     * Alien Registration Number
     * <p>
     * Lineage reference object : GOBINTL_REG_NUMBER
     * 
     */
    @JsonProperty("regNumber")
    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public Gobintl__1 withRegNumber(String regNumber) {
        this.regNumber = regNumber;
        return this;
    }

    @JsonProperty("sponDesc")
    public String getSponDesc() {
        return sponDesc;
    }

    @JsonProperty("sponDesc")
    public void setSponDesc(String sponDesc) {
        this.sponDesc = sponDesc;
    }

    public Gobintl__1 withSponDesc(String sponDesc) {
        this.sponDesc = sponDesc;
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

    public Gobintl__1 withNatnCodeBirth(String natnCodeBirth) {
        this.natnCodeBirth = natnCodeBirth;
        return this;
    }

    @JsonProperty("birthNatnDesc")
    public String getBirthNatnDesc() {
        return birthNatnDesc;
    }

    @JsonProperty("birthNatnDesc")
    public void setBirthNatnDesc(String birthNatnDesc) {
        this.birthNatnDesc = birthNatnDesc;
    }

    public Gobintl__1 withBirthNatnDesc(String birthNatnDesc) {
        this.birthNatnDesc = birthNatnDesc;
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

    public Gobintl__1 withSignatureInd(String signatureInd) {
        this.signatureInd = signatureInd;
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

    public Gobintl__1 withPassportId(String passportId) {
        this.passportId = passportId;
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

    public Gobintl__1 withNatnCodeLegal(String natnCodeLegal) {
        this.natnCodeLegal = natnCodeLegal;
        return this;
    }

    @JsonProperty("emptDesc")
    public String getEmptDesc() {
        return emptDesc;
    }

    @JsonProperty("emptDesc")
    public void setEmptDesc(String emptDesc) {
        this.emptDesc = emptDesc;
    }

    public Gobintl__1 withEmptDesc(String emptDesc) {
        this.emptDesc = emptDesc;
        return this;
    }

    @JsonProperty("langDesc")
    public String getLangDesc() {
        return langDesc;
    }

    @JsonProperty("langDesc")
    public void setLangDesc(String langDesc) {
        this.langDesc = langDesc;
    }

    public Gobintl__1 withLangDesc(String langDesc) {
        this.langDesc = langDesc;
        return this;
    }

    /**
     * Nation of Issue
     * <p>
     * Lineage reference object : GOBINTL_NATN_CODE_ISSUE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCodeIssue")
    public String getNatnCodeIssue() {
        return natnCodeIssue;
    }

    /**
     * Nation of Issue
     * <p>
     * Lineage reference object : GOBINTL_NATN_CODE_ISSUE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCodeIssue")
    public void setNatnCodeIssue(String natnCodeIssue) {
        this.natnCodeIssue = natnCodeIssue;
    }

    public Gobintl__1 withNatnCodeIssue(String natnCodeIssue) {
        this.natnCodeIssue = natnCodeIssue;
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

    public Gobintl__1 withCelgCode(String celgCode) {
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

    public Gobintl__1 withCertNumber(String certNumber) {
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

    public Gobintl__1 withSponCode(String sponCode) {
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

    public Gobintl__1 withAdmrCode(String admrCode) {
        this.admrCode = admrCode;
        return this;
    }

    /**
     * Spouse Accompanying Person To Country
     * <p>
     * Lineage reference object : GOBINTL_SPOUSE_IND
     * (Required)
     * 
     */
    @JsonProperty("spouseInd")
    public String getSpouseInd() {
        return spouseInd;
    }

    /**
     * Spouse Accompanying Person To Country
     * <p>
     * Lineage reference object : GOBINTL_SPOUSE_IND
     * (Required)
     * 
     */
    @JsonProperty("spouseInd")
    public void setSpouseInd(String spouseInd) {
        this.spouseInd = spouseInd;
    }

    public Gobintl__1 withSpouseInd(String spouseInd) {
        this.spouseInd = spouseInd;
        return this;
    }

    @JsonProperty("legalNatnDesc")
    public String getLegalNatnDesc() {
        return legalNatnDesc;
    }

    @JsonProperty("legalNatnDesc")
    public void setLegalNatnDesc(String legalNatnDesc) {
        this.legalNatnDesc = legalNatnDesc;
    }

    public Gobintl__1 withLegalNatnDesc(String legalNatnDesc) {
        this.legalNatnDesc = legalNatnDesc;
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

    public Gobintl__1 withI94Date(Date i94Date) {
        this.i94Date = i94Date;
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

    public Gobintl__1 withI94Status(String i94Status) {
        this.i94Status = i94Status;
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

    public Gobintl__1 withCertDateReceipt(Date certDateReceipt) {
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

    public Gobintl__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Gobintl__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("certDateIssue");
        sb.append('=');
        sb.append(((this.certDateIssue == null)?"<null>":this.certDateIssue));
        sb.append(',');
        sb.append("childNumber");
        sb.append('=');
        sb.append(((this.childNumber == null)?"<null>":this.childNumber));
        sb.append(',');
        sb.append("emptCode");
        sb.append('=');
        sb.append(((this.emptCode == null)?"<null>":this.emptCode));
        sb.append(',');
        sb.append("langCode");
        sb.append('=');
        sb.append(((this.langCode == null)?"<null>":this.langCode));
        sb.append(',');
        sb.append("issueNatnDesc");
        sb.append('=');
        sb.append(((this.issueNatnDesc == null)?"<null>":this.issueNatnDesc));
        sb.append(',');
        sb.append("foreignSsn");
        sb.append('=');
        sb.append(((this.foreignSsn == null)?"<null>":this.foreignSsn));
        sb.append(',');
        sb.append("passportExpDate");
        sb.append('=');
        sb.append(((this.passportExpDate == null)?"<null>":this.passportExpDate));
        sb.append(',');
        sb.append("celgDesc");
        sb.append('=');
        sb.append(((this.celgDesc == null)?"<null>":this.celgDesc));
        sb.append(',');
        sb.append("duration");
        sb.append('=');
        sb.append(((this.duration == null)?"<null>":this.duration));
        sb.append(',');
        sb.append("admrDesc");
        sb.append('=');
        sb.append(((this.admrDesc == null)?"<null>":this.admrDesc));
        sb.append(',');
        sb.append("regNumber");
        sb.append('=');
        sb.append(((this.regNumber == null)?"<null>":this.regNumber));
        sb.append(',');
        sb.append("sponDesc");
        sb.append('=');
        sb.append(((this.sponDesc == null)?"<null>":this.sponDesc));
        sb.append(',');
        sb.append("natnCodeBirth");
        sb.append('=');
        sb.append(((this.natnCodeBirth == null)?"<null>":this.natnCodeBirth));
        sb.append(',');
        sb.append("birthNatnDesc");
        sb.append('=');
        sb.append(((this.birthNatnDesc == null)?"<null>":this.birthNatnDesc));
        sb.append(',');
        sb.append("signatureInd");
        sb.append('=');
        sb.append(((this.signatureInd == null)?"<null>":this.signatureInd));
        sb.append(',');
        sb.append("passportId");
        sb.append('=');
        sb.append(((this.passportId == null)?"<null>":this.passportId));
        sb.append(',');
        sb.append("natnCodeLegal");
        sb.append('=');
        sb.append(((this.natnCodeLegal == null)?"<null>":this.natnCodeLegal));
        sb.append(',');
        sb.append("emptDesc");
        sb.append('=');
        sb.append(((this.emptDesc == null)?"<null>":this.emptDesc));
        sb.append(',');
        sb.append("langDesc");
        sb.append('=');
        sb.append(((this.langDesc == null)?"<null>":this.langDesc));
        sb.append(',');
        sb.append("natnCodeIssue");
        sb.append('=');
        sb.append(((this.natnCodeIssue == null)?"<null>":this.natnCodeIssue));
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
        sb.append("spouseInd");
        sb.append('=');
        sb.append(((this.spouseInd == null)?"<null>":this.spouseInd));
        sb.append(',');
        sb.append("legalNatnDesc");
        sb.append('=');
        sb.append(((this.legalNatnDesc == null)?"<null>":this.legalNatnDesc));
        sb.append(',');
        sb.append("i94Date");
        sb.append('=');
        sb.append(((this.i94Date == null)?"<null>":this.i94Date));
        sb.append(',');
        sb.append("i94Status");
        sb.append('=');
        sb.append(((this.i94Status == null)?"<null>":this.i94Status));
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
        result = ((result* 31)+((this.certDateIssue == null)? 0 :this.certDateIssue.hashCode()));
        result = ((result* 31)+((this.childNumber == null)? 0 :this.childNumber.hashCode()));
        result = ((result* 31)+((this.emptCode == null)? 0 :this.emptCode.hashCode()));
        result = ((result* 31)+((this.langCode == null)? 0 :this.langCode.hashCode()));
        result = ((result* 31)+((this.issueNatnDesc == null)? 0 :this.issueNatnDesc.hashCode()));
        result = ((result* 31)+((this.foreignSsn == null)? 0 :this.foreignSsn.hashCode()));
        result = ((result* 31)+((this.passportExpDate == null)? 0 :this.passportExpDate.hashCode()));
        result = ((result* 31)+((this.celgDesc == null)? 0 :this.celgDesc.hashCode()));
        result = ((result* 31)+((this.duration == null)? 0 :this.duration.hashCode()));
        result = ((result* 31)+((this.admrDesc == null)? 0 :this.admrDesc.hashCode()));
        result = ((result* 31)+((this.regNumber == null)? 0 :this.regNumber.hashCode()));
        result = ((result* 31)+((this.sponDesc == null)? 0 :this.sponDesc.hashCode()));
        result = ((result* 31)+((this.natnCodeBirth == null)? 0 :this.natnCodeBirth.hashCode()));
        result = ((result* 31)+((this.birthNatnDesc == null)? 0 :this.birthNatnDesc.hashCode()));
        result = ((result* 31)+((this.signatureInd == null)? 0 :this.signatureInd.hashCode()));
        result = ((result* 31)+((this.passportId == null)? 0 :this.passportId.hashCode()));
        result = ((result* 31)+((this.natnCodeLegal == null)? 0 :this.natnCodeLegal.hashCode()));
        result = ((result* 31)+((this.emptDesc == null)? 0 :this.emptDesc.hashCode()));
        result = ((result* 31)+((this.langDesc == null)? 0 :this.langDesc.hashCode()));
        result = ((result* 31)+((this.natnCodeIssue == null)? 0 :this.natnCodeIssue.hashCode()));
        result = ((result* 31)+((this.celgCode == null)? 0 :this.celgCode.hashCode()));
        result = ((result* 31)+((this.certNumber == null)? 0 :this.certNumber.hashCode()));
        result = ((result* 31)+((this.sponCode == null)? 0 :this.sponCode.hashCode()));
        result = ((result* 31)+((this.admrCode == null)? 0 :this.admrCode.hashCode()));
        result = ((result* 31)+((this.spouseInd == null)? 0 :this.spouseInd.hashCode()));
        result = ((result* 31)+((this.legalNatnDesc == null)? 0 :this.legalNatnDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.i94Date == null)? 0 :this.i94Date.hashCode()));
        result = ((result* 31)+((this.i94Status == null)? 0 :this.i94Status.hashCode()));
        result = ((result* 31)+((this.certDateReceipt == null)? 0 :this.certDateReceipt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Gobintl__1) == false) {
            return false;
        }
        Gobintl__1 rhs = ((Gobintl__1) other);
        return (((((((((((((((((((((((((((((((this.certDateIssue == rhs.certDateIssue)||((this.certDateIssue!= null)&&this.certDateIssue.equals(rhs.certDateIssue)))&&((this.childNumber == rhs.childNumber)||((this.childNumber!= null)&&this.childNumber.equals(rhs.childNumber))))&&((this.emptCode == rhs.emptCode)||((this.emptCode!= null)&&this.emptCode.equals(rhs.emptCode))))&&((this.langCode == rhs.langCode)||((this.langCode!= null)&&this.langCode.equals(rhs.langCode))))&&((this.issueNatnDesc == rhs.issueNatnDesc)||((this.issueNatnDesc!= null)&&this.issueNatnDesc.equals(rhs.issueNatnDesc))))&&((this.foreignSsn == rhs.foreignSsn)||((this.foreignSsn!= null)&&this.foreignSsn.equals(rhs.foreignSsn))))&&((this.passportExpDate == rhs.passportExpDate)||((this.passportExpDate!= null)&&this.passportExpDate.equals(rhs.passportExpDate))))&&((this.celgDesc == rhs.celgDesc)||((this.celgDesc!= null)&&this.celgDesc.equals(rhs.celgDesc))))&&((this.duration == rhs.duration)||((this.duration!= null)&&this.duration.equals(rhs.duration))))&&((this.admrDesc == rhs.admrDesc)||((this.admrDesc!= null)&&this.admrDesc.equals(rhs.admrDesc))))&&((this.regNumber == rhs.regNumber)||((this.regNumber!= null)&&this.regNumber.equals(rhs.regNumber))))&&((this.sponDesc == rhs.sponDesc)||((this.sponDesc!= null)&&this.sponDesc.equals(rhs.sponDesc))))&&((this.natnCodeBirth == rhs.natnCodeBirth)||((this.natnCodeBirth!= null)&&this.natnCodeBirth.equals(rhs.natnCodeBirth))))&&((this.birthNatnDesc == rhs.birthNatnDesc)||((this.birthNatnDesc!= null)&&this.birthNatnDesc.equals(rhs.birthNatnDesc))))&&((this.signatureInd == rhs.signatureInd)||((this.signatureInd!= null)&&this.signatureInd.equals(rhs.signatureInd))))&&((this.passportId == rhs.passportId)||((this.passportId!= null)&&this.passportId.equals(rhs.passportId))))&&((this.natnCodeLegal == rhs.natnCodeLegal)||((this.natnCodeLegal!= null)&&this.natnCodeLegal.equals(rhs.natnCodeLegal))))&&((this.emptDesc == rhs.emptDesc)||((this.emptDesc!= null)&&this.emptDesc.equals(rhs.emptDesc))))&&((this.langDesc == rhs.langDesc)||((this.langDesc!= null)&&this.langDesc.equals(rhs.langDesc))))&&((this.natnCodeIssue == rhs.natnCodeIssue)||((this.natnCodeIssue!= null)&&this.natnCodeIssue.equals(rhs.natnCodeIssue))))&&((this.celgCode == rhs.celgCode)||((this.celgCode!= null)&&this.celgCode.equals(rhs.celgCode))))&&((this.certNumber == rhs.certNumber)||((this.certNumber!= null)&&this.certNumber.equals(rhs.certNumber))))&&((this.sponCode == rhs.sponCode)||((this.sponCode!= null)&&this.sponCode.equals(rhs.sponCode))))&&((this.admrCode == rhs.admrCode)||((this.admrCode!= null)&&this.admrCode.equals(rhs.admrCode))))&&((this.spouseInd == rhs.spouseInd)||((this.spouseInd!= null)&&this.spouseInd.equals(rhs.spouseInd))))&&((this.legalNatnDesc == rhs.legalNatnDesc)||((this.legalNatnDesc!= null)&&this.legalNatnDesc.equals(rhs.legalNatnDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.i94Date == rhs.i94Date)||((this.i94Date!= null)&&this.i94Date.equals(rhs.i94Date))))&&((this.i94Status == rhs.i94Status)||((this.i94Status!= null)&&this.i94Status.equals(rhs.i94Status))))&&((this.certDateReceipt == rhs.certDateReceipt)||((this.certDateReceipt!= null)&&this.certDateReceipt.equals(rhs.certDateReceipt))));
    }

}
