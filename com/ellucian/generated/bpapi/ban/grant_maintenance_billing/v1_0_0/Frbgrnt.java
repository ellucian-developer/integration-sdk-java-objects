
package com.ellucian.generated.bpapi.ban.grant_maintenance_billing.v1_0_0;

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
    "statusDate",
    "zipCode",
    "subCategory",
    "sponsorId",
    "cstrCodeRateName",
    "cstaCodeCharge",
    "grantDesc",
    "rcptShareTotal",
    "relatedGrntDescr",
    "cstdCodeDistr",
    "cumFundingAmt",
    "orgnCodeDescr",
    "currentFundingAmt",
    "addressLine1",
    "grntCodeRelated",
    "addressLine2",
    "addressLine3",
    "state",
    "agencyAddrCode",
    "piIdCode",
    "projectEndDate",
    "cstaCodeChargeName",
    "alternateStatusDesc",
    "areaCode",
    "basiCodeCs",
    "phoneNumber",
    "agencyAddrSeqNum",
    "cstrCodeRate",
    "piIdName",
    "basiCodeCsName",
    "displayPassThruInd",
    "agencyCode2",
    "grantType",
    "termDate",
    "indaCodeCharge",
    "longTitle",
    "statusCode",
    "inddCodeDistrName",
    "extension",
    "city",
    "agencyTeleSeqno",
    "cfdaCode",
    "basiCodeIcName",
    "coasCode",
    "agencyCode",
    "maxFundingAmt",
    "title",
    "propCode",
    "categoryDesc",
    "projectStartDate",
    "indrCodeRateName",
    "phoneExists",
    "basiCodeIc",
    "agencyEmail",
    "subCatDesc",
    "agencyContact",
    "inddCodeDistr",
    "idcEncInd",
    "indrCodeRate",
    "agencyPhoneType",
    "expendEndDate",
    "agencyName",
    "indaCodeChargeName",
    "cstdCodeDistrName",
    "statusDescr",
    "coasCodeIcCs",
    "agencyName2",
    "orgnCodeRespOffice",
    "effCertRequiredInd",
    "category"
})
@Generated("jsonschema2pojo")
public class Frbgrnt {

    /**
     * Status Date
     * <p>
     * Lineage reference object : FRBGRNT_STATUS_DATE
     * 
     */
    @JsonProperty("statusDate")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_STATUS_DATE")
    private Date statusDate;
    /**
     * Zip or Postal Code
     * <p>
     * 
     * 
     */
    @JsonProperty("zipCode")
    private String zipCode;
    /**
     * Sub Category
     * <p>
     * Lineage reference object : FRBGRNT_SUB_CATEGORY
     * 
     */
    @JsonProperty("subCategory")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_SUB_CATEGORY")
    private String subCategory;
    /**
     * Sponsor ID
     * <p>
     * Lineage reference object : FRBGRNT_SPONSOR_ID
     * 
     */
    @JsonProperty("sponsorId")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_SPONSOR_ID")
    private String sponsorId;
    @JsonProperty("cstrCodeRateName")
    private String cstrCodeRateName;
    /**
     * Cost Share Credit Account Code
     * <p>
     * Lineage reference object : FRBGRNT_CSTA_CODE_CHARGE, Lookup lineage reference object : frbcsta,frvcsta
     * 
     */
    @JsonProperty("cstaCodeCharge")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_CSTA_CODE_CHARGE, Lookup lineage reference object : frbcsta,frvcsta")
    private String cstaCodeCharge;
    @JsonProperty("grantDesc")
    private String grantDesc;
    /**
     * Total Recipient Share
     * <p>
     * Lineage reference object : FRBGRNT_RCPT_SHARE_TOTAL
     * 
     */
    @JsonProperty("rcptShareTotal")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_RCPT_SHARE_TOTAL")
    private Double rcptShareTotal;
    @JsonProperty("relatedGrntDescr")
    private String relatedGrntDescr;
    /**
     * Cost Share Distribute From Code
     * <p>
     * Lineage reference object : FRBGRNT_CSTD_CODE_DISTR, Lookup lineage reference object : frbcstd,frvcstd
     * 
     */
    @JsonProperty("cstdCodeDistr")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_CSTD_CODE_DISTR, Lookup lineage reference object : frbcstd,frvcstd")
    private String cstdCodeDistr;
    /**
     * Cumulative Amount
     * <p>
     * Lineage reference object : FRBGRNT_CUM_FUNDING_AMT
     * 
     */
    @JsonProperty("cumFundingAmt")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_CUM_FUNDING_AMT")
    private Double cumFundingAmt;
    @JsonProperty("orgnCodeDescr")
    private String orgnCodeDescr;
    /**
     * Current Amount
     * <p>
     * Lineage reference object : FRBGRNT_CURRENT_FUNDING_AMT
     * 
     */
    @JsonProperty("currentFundingAmt")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_CURRENT_FUNDING_AMT")
    private Double currentFundingAmt;
    /**
     * Street Line 1
     * <p>
     * 
     * 
     */
    @JsonProperty("addressLine1")
    private String addressLine1;
    /**
     * Related Grant
     * <p>
     * Lineage reference object : FRBGRNT_GRNT_CODE_RELATED
     * 
     */
    @JsonProperty("grntCodeRelated")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_GRNT_CODE_RELATED")
    private String grntCodeRelated;
    /**
     * Street Line 2
     * <p>
     * 
     * 
     */
    @JsonProperty("addressLine2")
    private String addressLine2;
    /**
     * Street Line 3
     * <p>
     * 
     * 
     */
    @JsonProperty("addressLine3")
    private String addressLine3;
    /**
     * State or Province
     * <p>
     * 
     * 
     */
    @JsonProperty("state")
    private String state;
    /**
     * Address Type
     * <p>
     * Lineage reference object : FRBGRNT_AGENCY_ADDR_CODE
     * 
     */
    @JsonProperty("agencyAddrCode")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_AGENCY_ADDR_CODE")
    private String agencyAddrCode;
    /**
     * Principal Investigator ID
     * <p>
     * 
     * 
     */
    @JsonProperty("piIdCode")
    private String piIdCode;
    /**
     * Project End Date
     * <p>
     * Lineage reference object : FRBGRNT_PROJECT_END_DATE
     * 
     */
    @JsonProperty("projectEndDate")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_PROJECT_END_DATE")
    private Date projectEndDate;
    @JsonProperty("cstaCodeChargeName")
    private String cstaCodeChargeName;
    /**
     * Alternate Description
     * <p>
     * Lineage reference object : FRBGRNT_ALTERNATE_STATUS_DESC
     * 
     */
    @JsonProperty("alternateStatusDesc")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_ALTERNATE_STATUS_DESC")
    private String alternateStatusDesc;
    /**
     * Area Code
     * <p>
     * 
     * 
     */
    @JsonProperty("areaCode")
    private String areaCode;
    /**
     * Cost Share Basis
     * <p>
     * Lineage reference object : FRBGRNT_BASI_CODE_CS
     * 
     */
    @JsonProperty("basiCodeCs")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_BASI_CODE_CS")
    private String basiCodeCs;
    /**
     * Phone Number
     * <p>
     * 
     * 
     */
    @JsonProperty("phoneNumber")
    private String phoneNumber;
    /**
     * Address Sequence
     * <p>
     * Lineage reference object : FRBGRNT_AGENCY_ADDR_SEQ_NUM
     * 
     */
    @JsonProperty("agencyAddrSeqNum")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_AGENCY_ADDR_SEQ_NUM")
    private Double agencyAddrSeqNum;
    /**
     * Cost Share Rate Code
     * <p>
     * Lineage reference object : FRBGRNT_CSTR_CODE_RATE, Lookup lineage reference object : frrcstr,frvcstr
     * 
     */
    @JsonProperty("cstrCodeRate")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_CSTR_CODE_RATE, Lookup lineage reference object : frrcstr,frvcstr")
    private String cstrCodeRate;
    @JsonProperty("piIdName")
    private String piIdName;
    @JsonProperty("basiCodeCsName")
    private String basiCodeCsName;
    /**
     * Pass Through Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPassThruInd")
    private String displayPassThruInd;
    /**
     * Agency
     * <p>
     * 
     * 
     */
    @JsonProperty("agencyCode2")
    private String agencyCode2;
    /**
     * Grant Type
     * <p>
     * Lineage reference object : FRBGRNT_GRANT_TYPE
     * 
     */
    @JsonProperty("grantType")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_GRANT_TYPE")
    private String grantType;
    /**
     * Termination Date
     * <p>
     * Lineage reference object : FRBGRNT_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_TERM_DATE")
    private Date termDate;
    /**
     * Indirect Cost Charge Account Code
     * <p>
     * Lineage reference object : FRBGRNT_INDA_CODE_CHARGE
     * 
     */
    @JsonProperty("indaCodeCharge")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_INDA_CODE_CHARGE")
    private String indaCodeCharge;
    /**
     * Long Title
     * <p>
     * Lineage reference object : FRBGRNT_LONG_TITLE
     * (Required)
     * 
     */
    @JsonProperty("longTitle")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_LONG_TITLE")
    private String longTitle;
    /**
     * Status
     * <p>
     * Lineage reference object : FRBGRNT_STATUS_CODE
     * 
     */
    @JsonProperty("statusCode")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_STATUS_CODE")
    private String statusCode;
    @JsonProperty("inddCodeDistrName")
    private String inddCodeDistrName;
    /**
     * Extension
     * <p>
     * 
     * 
     */
    @JsonProperty("extension")
    private String extension;
    /**
     * City
     * <p>
     * 
     * 
     */
    @JsonProperty("city")
    private String city;
    /**
     * Phone Sequence Number
     * <p>
     * Lineage reference object : FRBGRNT_AGENCY_TELE_SEQNO
     * 
     */
    @JsonProperty("agencyTeleSeqno")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_AGENCY_TELE_SEQNO")
    private Double agencyTeleSeqno;
    /**
     * CFDA Number
     * <p>
     * 
     * 
     */
    @JsonProperty("cfdaCode")
    private String cfdaCode;
    @JsonProperty("basiCodeIcName")
    private String basiCodeIcName;
    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FRBGRNT_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String coasCode;
    /**
     * Agency
     * <p>
     * 
     * 
     */
    @JsonProperty("agencyCode")
    private String agencyCode;
    /**
     * Maximum Amount
     * <p>
     * Lineage reference object : FRBGRNT_MAX_FUNDING_AMT
     * 
     */
    @JsonProperty("maxFundingAmt")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_MAX_FUNDING_AMT")
    private Double maxFundingAmt;
    /**
     * Title
     * <p>
     * Lineage reference object : FRBGRNT_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_TITLE")
    private String title;
    /**
     * Proposal
     * <p>
     * Lineage reference object : FRBGRNT_PROP_CODE
     * 
     */
    @JsonProperty("propCode")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_PROP_CODE")
    private String propCode;
    @JsonProperty("categoryDesc")
    private String categoryDesc;
    /**
     * Project Start Date
     * <p>
     * Lineage reference object : FRBGRNT_PROJECT_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("projectStartDate")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_PROJECT_START_DATE")
    private Date projectStartDate;
    @JsonProperty("indrCodeRateName")
    private String indrCodeRateName;
    /**
     * Phone Number Exists
     * <p>
     * 
     * 
     */
    @JsonProperty("phoneExists")
    private String phoneExists;
    /**
     * Indirect Cost Basis
     * <p>
     * Lineage reference object : FRBGRNT_BASI_CODE_IC
     * 
     */
    @JsonProperty("basiCodeIc")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_BASI_CODE_IC")
    private String basiCodeIc;
    /**
     * Email
     * <p>
     * Lineage reference object : FRBGRNT_AGENCY_EMAIL
     * 
     */
    @JsonProperty("agencyEmail")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_AGENCY_EMAIL")
    private String agencyEmail;
    @JsonProperty("subCatDesc")
    private String subCatDesc;
    /**
     * Contact
     * <p>
     * Lineage reference object : FRBGRNT_AGENCY_CONTACT
     * 
     */
    @JsonProperty("agencyContact")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_AGENCY_CONTACT")
    private String agencyContact;
    /**
     * Indirect Cost Distribute To Code
     * <p>
     * Lineage reference object : FRBGRNT_INDD_CODE_DISTR
     * 
     */
    @JsonProperty("inddCodeDistr")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_INDD_CODE_DISTR")
    private String inddCodeDistr;
    /**
     * Indirect Cost Encumbering
     * <p>
     * Lineage reference object : FRBGRNT_IDC_ENC_IND
     * 
     */
    @JsonProperty("idcEncInd")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_IDC_ENC_IND")
    private String idcEncInd;
    /**
     * Indirect Cost Rate Code
     * <p>
     * Lineage reference object : FRBGRNT_INDR_CODE_RATE
     * 
     */
    @JsonProperty("indrCodeRate")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_INDR_CODE_RATE")
    private String indrCodeRate;
    /**
     * Phone Type
     * <p>
     * Lineage reference object : FRBGRNT_AGENCY_PHONE_TYPE
     * 
     */
    @JsonProperty("agencyPhoneType")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_AGENCY_PHONE_TYPE")
    private String agencyPhoneType;
    /**
     * Expenditure End Date
     * <p>
     * Lineage reference object : FRBGRNT_EXPEND_END_DATE
     * 
     */
    @JsonProperty("expendEndDate")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_EXPEND_END_DATE")
    private Date expendEndDate;
    @JsonProperty("agencyName")
    private String agencyName;
    @JsonProperty("indaCodeChargeName")
    private String indaCodeChargeName;
    @JsonProperty("cstdCodeDistrName")
    private String cstdCodeDistrName;
    @JsonProperty("statusDescr")
    private String statusDescr;
    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FRBGRNT_COAS_CODE_IC_CS, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCodeIcCs")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_COAS_CODE_IC_CS, Lookup lineage reference object : ftvcoas")
    private String coasCodeIcCs;
    @JsonProperty("agencyName2")
    private String agencyName2;
    /**
     * Responsible Organization
     * <p>
     * Lineage reference object : FRBGRNT_ORGN_CODE_RESP_OFFICE
     * (Required)
     * 
     */
    @JsonProperty("orgnCodeRespOffice")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_ORGN_CODE_RESP_OFFICE")
    private String orgnCodeRespOffice;
    /**
     * Requires Effort Certification
     * <p>
     * Lineage reference object : FRBGRNT_EFF_CERT_REQUIRED_IND
     * 
     */
    @JsonProperty("effCertRequiredInd")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_EFF_CERT_REQUIRED_IND")
    private String effCertRequiredInd;
    /**
     * Category
     * <p>
     * Lineage reference object : FRBGRNT_CATEGORY
     * 
     */
    @JsonProperty("category")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_CATEGORY")
    private String category;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Status Date
     * <p>
     * Lineage reference object : FRBGRNT_STATUS_DATE
     * 
     */
    @JsonProperty("statusDate")
    public Date getStatusDate() {
        return statusDate;
    }

    /**
     * Status Date
     * <p>
     * Lineage reference object : FRBGRNT_STATUS_DATE
     * 
     */
    @JsonProperty("statusDate")
    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
    }

    public Frbgrnt withStatusDate(Date statusDate) {
        this.statusDate = statusDate;
        return this;
    }

    /**
     * Zip or Postal Code
     * <p>
     * 
     * 
     */
    @JsonProperty("zipCode")
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Zip or Postal Code
     * <p>
     * 
     * 
     */
    @JsonProperty("zipCode")
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Frbgrnt withZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    /**
     * Sub Category
     * <p>
     * Lineage reference object : FRBGRNT_SUB_CATEGORY
     * 
     */
    @JsonProperty("subCategory")
    public String getSubCategory() {
        return subCategory;
    }

    /**
     * Sub Category
     * <p>
     * Lineage reference object : FRBGRNT_SUB_CATEGORY
     * 
     */
    @JsonProperty("subCategory")
    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public Frbgrnt withSubCategory(String subCategory) {
        this.subCategory = subCategory;
        return this;
    }

    /**
     * Sponsor ID
     * <p>
     * Lineage reference object : FRBGRNT_SPONSOR_ID
     * 
     */
    @JsonProperty("sponsorId")
    public String getSponsorId() {
        return sponsorId;
    }

    /**
     * Sponsor ID
     * <p>
     * Lineage reference object : FRBGRNT_SPONSOR_ID
     * 
     */
    @JsonProperty("sponsorId")
    public void setSponsorId(String sponsorId) {
        this.sponsorId = sponsorId;
    }

    public Frbgrnt withSponsorId(String sponsorId) {
        this.sponsorId = sponsorId;
        return this;
    }

    @JsonProperty("cstrCodeRateName")
    public String getCstrCodeRateName() {
        return cstrCodeRateName;
    }

    @JsonProperty("cstrCodeRateName")
    public void setCstrCodeRateName(String cstrCodeRateName) {
        this.cstrCodeRateName = cstrCodeRateName;
    }

    public Frbgrnt withCstrCodeRateName(String cstrCodeRateName) {
        this.cstrCodeRateName = cstrCodeRateName;
        return this;
    }

    /**
     * Cost Share Credit Account Code
     * <p>
     * Lineage reference object : FRBGRNT_CSTA_CODE_CHARGE, Lookup lineage reference object : frbcsta,frvcsta
     * 
     */
    @JsonProperty("cstaCodeCharge")
    public String getCstaCodeCharge() {
        return cstaCodeCharge;
    }

    /**
     * Cost Share Credit Account Code
     * <p>
     * Lineage reference object : FRBGRNT_CSTA_CODE_CHARGE, Lookup lineage reference object : frbcsta,frvcsta
     * 
     */
    @JsonProperty("cstaCodeCharge")
    public void setCstaCodeCharge(String cstaCodeCharge) {
        this.cstaCodeCharge = cstaCodeCharge;
    }

    public Frbgrnt withCstaCodeCharge(String cstaCodeCharge) {
        this.cstaCodeCharge = cstaCodeCharge;
        return this;
    }

    @JsonProperty("grantDesc")
    public String getGrantDesc() {
        return grantDesc;
    }

    @JsonProperty("grantDesc")
    public void setGrantDesc(String grantDesc) {
        this.grantDesc = grantDesc;
    }

    public Frbgrnt withGrantDesc(String grantDesc) {
        this.grantDesc = grantDesc;
        return this;
    }

    /**
     * Total Recipient Share
     * <p>
     * Lineage reference object : FRBGRNT_RCPT_SHARE_TOTAL
     * 
     */
    @JsonProperty("rcptShareTotal")
    public Double getRcptShareTotal() {
        return rcptShareTotal;
    }

    /**
     * Total Recipient Share
     * <p>
     * Lineage reference object : FRBGRNT_RCPT_SHARE_TOTAL
     * 
     */
    @JsonProperty("rcptShareTotal")
    public void setRcptShareTotal(Double rcptShareTotal) {
        this.rcptShareTotal = rcptShareTotal;
    }

    public Frbgrnt withRcptShareTotal(Double rcptShareTotal) {
        this.rcptShareTotal = rcptShareTotal;
        return this;
    }

    @JsonProperty("relatedGrntDescr")
    public String getRelatedGrntDescr() {
        return relatedGrntDescr;
    }

    @JsonProperty("relatedGrntDescr")
    public void setRelatedGrntDescr(String relatedGrntDescr) {
        this.relatedGrntDescr = relatedGrntDescr;
    }

    public Frbgrnt withRelatedGrntDescr(String relatedGrntDescr) {
        this.relatedGrntDescr = relatedGrntDescr;
        return this;
    }

    /**
     * Cost Share Distribute From Code
     * <p>
     * Lineage reference object : FRBGRNT_CSTD_CODE_DISTR, Lookup lineage reference object : frbcstd,frvcstd
     * 
     */
    @JsonProperty("cstdCodeDistr")
    public String getCstdCodeDistr() {
        return cstdCodeDistr;
    }

    /**
     * Cost Share Distribute From Code
     * <p>
     * Lineage reference object : FRBGRNT_CSTD_CODE_DISTR, Lookup lineage reference object : frbcstd,frvcstd
     * 
     */
    @JsonProperty("cstdCodeDistr")
    public void setCstdCodeDistr(String cstdCodeDistr) {
        this.cstdCodeDistr = cstdCodeDistr;
    }

    public Frbgrnt withCstdCodeDistr(String cstdCodeDistr) {
        this.cstdCodeDistr = cstdCodeDistr;
        return this;
    }

    /**
     * Cumulative Amount
     * <p>
     * Lineage reference object : FRBGRNT_CUM_FUNDING_AMT
     * 
     */
    @JsonProperty("cumFundingAmt")
    public Double getCumFundingAmt() {
        return cumFundingAmt;
    }

    /**
     * Cumulative Amount
     * <p>
     * Lineage reference object : FRBGRNT_CUM_FUNDING_AMT
     * 
     */
    @JsonProperty("cumFundingAmt")
    public void setCumFundingAmt(Double cumFundingAmt) {
        this.cumFundingAmt = cumFundingAmt;
    }

    public Frbgrnt withCumFundingAmt(Double cumFundingAmt) {
        this.cumFundingAmt = cumFundingAmt;
        return this;
    }

    @JsonProperty("orgnCodeDescr")
    public String getOrgnCodeDescr() {
        return orgnCodeDescr;
    }

    @JsonProperty("orgnCodeDescr")
    public void setOrgnCodeDescr(String orgnCodeDescr) {
        this.orgnCodeDescr = orgnCodeDescr;
    }

    public Frbgrnt withOrgnCodeDescr(String orgnCodeDescr) {
        this.orgnCodeDescr = orgnCodeDescr;
        return this;
    }

    /**
     * Current Amount
     * <p>
     * Lineage reference object : FRBGRNT_CURRENT_FUNDING_AMT
     * 
     */
    @JsonProperty("currentFundingAmt")
    public Double getCurrentFundingAmt() {
        return currentFundingAmt;
    }

    /**
     * Current Amount
     * <p>
     * Lineage reference object : FRBGRNT_CURRENT_FUNDING_AMT
     * 
     */
    @JsonProperty("currentFundingAmt")
    public void setCurrentFundingAmt(Double currentFundingAmt) {
        this.currentFundingAmt = currentFundingAmt;
    }

    public Frbgrnt withCurrentFundingAmt(Double currentFundingAmt) {
        this.currentFundingAmt = currentFundingAmt;
        return this;
    }

    /**
     * Street Line 1
     * <p>
     * 
     * 
     */
    @JsonProperty("addressLine1")
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Street Line 1
     * <p>
     * 
     * 
     */
    @JsonProperty("addressLine1")
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public Frbgrnt withAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
        return this;
    }

    /**
     * Related Grant
     * <p>
     * Lineage reference object : FRBGRNT_GRNT_CODE_RELATED
     * 
     */
    @JsonProperty("grntCodeRelated")
    public String getGrntCodeRelated() {
        return grntCodeRelated;
    }

    /**
     * Related Grant
     * <p>
     * Lineage reference object : FRBGRNT_GRNT_CODE_RELATED
     * 
     */
    @JsonProperty("grntCodeRelated")
    public void setGrntCodeRelated(String grntCodeRelated) {
        this.grntCodeRelated = grntCodeRelated;
    }

    public Frbgrnt withGrntCodeRelated(String grntCodeRelated) {
        this.grntCodeRelated = grntCodeRelated;
        return this;
    }

    /**
     * Street Line 2
     * <p>
     * 
     * 
     */
    @JsonProperty("addressLine2")
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Street Line 2
     * <p>
     * 
     * 
     */
    @JsonProperty("addressLine2")
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public Frbgrnt withAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
        return this;
    }

    /**
     * Street Line 3
     * <p>
     * 
     * 
     */
    @JsonProperty("addressLine3")
    public String getAddressLine3() {
        return addressLine3;
    }

    /**
     * Street Line 3
     * <p>
     * 
     * 
     */
    @JsonProperty("addressLine3")
    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    public Frbgrnt withAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
        return this;
    }

    /**
     * State or Province
     * <p>
     * 
     * 
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * State or Province
     * <p>
     * 
     * 
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    public Frbgrnt withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : FRBGRNT_AGENCY_ADDR_CODE
     * 
     */
    @JsonProperty("agencyAddrCode")
    public String getAgencyAddrCode() {
        return agencyAddrCode;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : FRBGRNT_AGENCY_ADDR_CODE
     * 
     */
    @JsonProperty("agencyAddrCode")
    public void setAgencyAddrCode(String agencyAddrCode) {
        this.agencyAddrCode = agencyAddrCode;
    }

    public Frbgrnt withAgencyAddrCode(String agencyAddrCode) {
        this.agencyAddrCode = agencyAddrCode;
        return this;
    }

    /**
     * Principal Investigator ID
     * <p>
     * 
     * 
     */
    @JsonProperty("piIdCode")
    public String getPiIdCode() {
        return piIdCode;
    }

    /**
     * Principal Investigator ID
     * <p>
     * 
     * 
     */
    @JsonProperty("piIdCode")
    public void setPiIdCode(String piIdCode) {
        this.piIdCode = piIdCode;
    }

    public Frbgrnt withPiIdCode(String piIdCode) {
        this.piIdCode = piIdCode;
        return this;
    }

    /**
     * Project End Date
     * <p>
     * Lineage reference object : FRBGRNT_PROJECT_END_DATE
     * 
     */
    @JsonProperty("projectEndDate")
    public Date getProjectEndDate() {
        return projectEndDate;
    }

    /**
     * Project End Date
     * <p>
     * Lineage reference object : FRBGRNT_PROJECT_END_DATE
     * 
     */
    @JsonProperty("projectEndDate")
    public void setProjectEndDate(Date projectEndDate) {
        this.projectEndDate = projectEndDate;
    }

    public Frbgrnt withProjectEndDate(Date projectEndDate) {
        this.projectEndDate = projectEndDate;
        return this;
    }

    @JsonProperty("cstaCodeChargeName")
    public String getCstaCodeChargeName() {
        return cstaCodeChargeName;
    }

    @JsonProperty("cstaCodeChargeName")
    public void setCstaCodeChargeName(String cstaCodeChargeName) {
        this.cstaCodeChargeName = cstaCodeChargeName;
    }

    public Frbgrnt withCstaCodeChargeName(String cstaCodeChargeName) {
        this.cstaCodeChargeName = cstaCodeChargeName;
        return this;
    }

    /**
     * Alternate Description
     * <p>
     * Lineage reference object : FRBGRNT_ALTERNATE_STATUS_DESC
     * 
     */
    @JsonProperty("alternateStatusDesc")
    public String getAlternateStatusDesc() {
        return alternateStatusDesc;
    }

    /**
     * Alternate Description
     * <p>
     * Lineage reference object : FRBGRNT_ALTERNATE_STATUS_DESC
     * 
     */
    @JsonProperty("alternateStatusDesc")
    public void setAlternateStatusDesc(String alternateStatusDesc) {
        this.alternateStatusDesc = alternateStatusDesc;
    }

    public Frbgrnt withAlternateStatusDesc(String alternateStatusDesc) {
        this.alternateStatusDesc = alternateStatusDesc;
        return this;
    }

    /**
     * Area Code
     * <p>
     * 
     * 
     */
    @JsonProperty("areaCode")
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * Area Code
     * <p>
     * 
     * 
     */
    @JsonProperty("areaCode")
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public Frbgrnt withAreaCode(String areaCode) {
        this.areaCode = areaCode;
        return this;
    }

    /**
     * Cost Share Basis
     * <p>
     * Lineage reference object : FRBGRNT_BASI_CODE_CS
     * 
     */
    @JsonProperty("basiCodeCs")
    public String getBasiCodeCs() {
        return basiCodeCs;
    }

    /**
     * Cost Share Basis
     * <p>
     * Lineage reference object : FRBGRNT_BASI_CODE_CS
     * 
     */
    @JsonProperty("basiCodeCs")
    public void setBasiCodeCs(String basiCodeCs) {
        this.basiCodeCs = basiCodeCs;
    }

    public Frbgrnt withBasiCodeCs(String basiCodeCs) {
        this.basiCodeCs = basiCodeCs;
        return this;
    }

    /**
     * Phone Number
     * <p>
     * 
     * 
     */
    @JsonProperty("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Phone Number
     * <p>
     * 
     * 
     */
    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Frbgrnt withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Address Sequence
     * <p>
     * Lineage reference object : FRBGRNT_AGENCY_ADDR_SEQ_NUM
     * 
     */
    @JsonProperty("agencyAddrSeqNum")
    public Double getAgencyAddrSeqNum() {
        return agencyAddrSeqNum;
    }

    /**
     * Address Sequence
     * <p>
     * Lineage reference object : FRBGRNT_AGENCY_ADDR_SEQ_NUM
     * 
     */
    @JsonProperty("agencyAddrSeqNum")
    public void setAgencyAddrSeqNum(Double agencyAddrSeqNum) {
        this.agencyAddrSeqNum = agencyAddrSeqNum;
    }

    public Frbgrnt withAgencyAddrSeqNum(Double agencyAddrSeqNum) {
        this.agencyAddrSeqNum = agencyAddrSeqNum;
        return this;
    }

    /**
     * Cost Share Rate Code
     * <p>
     * Lineage reference object : FRBGRNT_CSTR_CODE_RATE, Lookup lineage reference object : frrcstr,frvcstr
     * 
     */
    @JsonProperty("cstrCodeRate")
    public String getCstrCodeRate() {
        return cstrCodeRate;
    }

    /**
     * Cost Share Rate Code
     * <p>
     * Lineage reference object : FRBGRNT_CSTR_CODE_RATE, Lookup lineage reference object : frrcstr,frvcstr
     * 
     */
    @JsonProperty("cstrCodeRate")
    public void setCstrCodeRate(String cstrCodeRate) {
        this.cstrCodeRate = cstrCodeRate;
    }

    public Frbgrnt withCstrCodeRate(String cstrCodeRate) {
        this.cstrCodeRate = cstrCodeRate;
        return this;
    }

    @JsonProperty("piIdName")
    public String getPiIdName() {
        return piIdName;
    }

    @JsonProperty("piIdName")
    public void setPiIdName(String piIdName) {
        this.piIdName = piIdName;
    }

    public Frbgrnt withPiIdName(String piIdName) {
        this.piIdName = piIdName;
        return this;
    }

    @JsonProperty("basiCodeCsName")
    public String getBasiCodeCsName() {
        return basiCodeCsName;
    }

    @JsonProperty("basiCodeCsName")
    public void setBasiCodeCsName(String basiCodeCsName) {
        this.basiCodeCsName = basiCodeCsName;
    }

    public Frbgrnt withBasiCodeCsName(String basiCodeCsName) {
        this.basiCodeCsName = basiCodeCsName;
        return this;
    }

    /**
     * Pass Through Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPassThruInd")
    public String getDisplayPassThruInd() {
        return displayPassThruInd;
    }

    /**
     * Pass Through Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPassThruInd")
    public void setDisplayPassThruInd(String displayPassThruInd) {
        this.displayPassThruInd = displayPassThruInd;
    }

    public Frbgrnt withDisplayPassThruInd(String displayPassThruInd) {
        this.displayPassThruInd = displayPassThruInd;
        return this;
    }

    /**
     * Agency
     * <p>
     * 
     * 
     */
    @JsonProperty("agencyCode2")
    public String getAgencyCode2() {
        return agencyCode2;
    }

    /**
     * Agency
     * <p>
     * 
     * 
     */
    @JsonProperty("agencyCode2")
    public void setAgencyCode2(String agencyCode2) {
        this.agencyCode2 = agencyCode2;
    }

    public Frbgrnt withAgencyCode2(String agencyCode2) {
        this.agencyCode2 = agencyCode2;
        return this;
    }

    /**
     * Grant Type
     * <p>
     * Lineage reference object : FRBGRNT_GRANT_TYPE
     * 
     */
    @JsonProperty("grantType")
    public String getGrantType() {
        return grantType;
    }

    /**
     * Grant Type
     * <p>
     * Lineage reference object : FRBGRNT_GRANT_TYPE
     * 
     */
    @JsonProperty("grantType")
    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }

    public Frbgrnt withGrantType(String grantType) {
        this.grantType = grantType;
        return this;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FRBGRNT_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public Date getTermDate() {
        return termDate;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FRBGRNT_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public void setTermDate(Date termDate) {
        this.termDate = termDate;
    }

    public Frbgrnt withTermDate(Date termDate) {
        this.termDate = termDate;
        return this;
    }

    /**
     * Indirect Cost Charge Account Code
     * <p>
     * Lineage reference object : FRBGRNT_INDA_CODE_CHARGE
     * 
     */
    @JsonProperty("indaCodeCharge")
    public String getIndaCodeCharge() {
        return indaCodeCharge;
    }

    /**
     * Indirect Cost Charge Account Code
     * <p>
     * Lineage reference object : FRBGRNT_INDA_CODE_CHARGE
     * 
     */
    @JsonProperty("indaCodeCharge")
    public void setIndaCodeCharge(String indaCodeCharge) {
        this.indaCodeCharge = indaCodeCharge;
    }

    public Frbgrnt withIndaCodeCharge(String indaCodeCharge) {
        this.indaCodeCharge = indaCodeCharge;
        return this;
    }

    /**
     * Long Title
     * <p>
     * Lineage reference object : FRBGRNT_LONG_TITLE
     * (Required)
     * 
     */
    @JsonProperty("longTitle")
    public String getLongTitle() {
        return longTitle;
    }

    /**
     * Long Title
     * <p>
     * Lineage reference object : FRBGRNT_LONG_TITLE
     * (Required)
     * 
     */
    @JsonProperty("longTitle")
    public void setLongTitle(String longTitle) {
        this.longTitle = longTitle;
    }

    public Frbgrnt withLongTitle(String longTitle) {
        this.longTitle = longTitle;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : FRBGRNT_STATUS_CODE
     * 
     */
    @JsonProperty("statusCode")
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : FRBGRNT_STATUS_CODE
     * 
     */
    @JsonProperty("statusCode")
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public Frbgrnt withStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    @JsonProperty("inddCodeDistrName")
    public String getInddCodeDistrName() {
        return inddCodeDistrName;
    }

    @JsonProperty("inddCodeDistrName")
    public void setInddCodeDistrName(String inddCodeDistrName) {
        this.inddCodeDistrName = inddCodeDistrName;
    }

    public Frbgrnt withInddCodeDistrName(String inddCodeDistrName) {
        this.inddCodeDistrName = inddCodeDistrName;
        return this;
    }

    /**
     * Extension
     * <p>
     * 
     * 
     */
    @JsonProperty("extension")
    public String getExtension() {
        return extension;
    }

    /**
     * Extension
     * <p>
     * 
     * 
     */
    @JsonProperty("extension")
    public void setExtension(String extension) {
        this.extension = extension;
    }

    public Frbgrnt withExtension(String extension) {
        this.extension = extension;
        return this;
    }

    /**
     * City
     * <p>
     * 
     * 
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * City
     * <p>
     * 
     * 
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public Frbgrnt withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Phone Sequence Number
     * <p>
     * Lineage reference object : FRBGRNT_AGENCY_TELE_SEQNO
     * 
     */
    @JsonProperty("agencyTeleSeqno")
    public Double getAgencyTeleSeqno() {
        return agencyTeleSeqno;
    }

    /**
     * Phone Sequence Number
     * <p>
     * Lineage reference object : FRBGRNT_AGENCY_TELE_SEQNO
     * 
     */
    @JsonProperty("agencyTeleSeqno")
    public void setAgencyTeleSeqno(Double agencyTeleSeqno) {
        this.agencyTeleSeqno = agencyTeleSeqno;
    }

    public Frbgrnt withAgencyTeleSeqno(Double agencyTeleSeqno) {
        this.agencyTeleSeqno = agencyTeleSeqno;
        return this;
    }

    /**
     * CFDA Number
     * <p>
     * 
     * 
     */
    @JsonProperty("cfdaCode")
    public String getCfdaCode() {
        return cfdaCode;
    }

    /**
     * CFDA Number
     * <p>
     * 
     * 
     */
    @JsonProperty("cfdaCode")
    public void setCfdaCode(String cfdaCode) {
        this.cfdaCode = cfdaCode;
    }

    public Frbgrnt withCfdaCode(String cfdaCode) {
        this.cfdaCode = cfdaCode;
        return this;
    }

    @JsonProperty("basiCodeIcName")
    public String getBasiCodeIcName() {
        return basiCodeIcName;
    }

    @JsonProperty("basiCodeIcName")
    public void setBasiCodeIcName(String basiCodeIcName) {
        this.basiCodeIcName = basiCodeIcName;
    }

    public Frbgrnt withBasiCodeIcName(String basiCodeIcName) {
        this.basiCodeIcName = basiCodeIcName;
        return this;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FRBGRNT_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    public String getCoasCode() {
        return coasCode;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FRBGRNT_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public Frbgrnt withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    /**
     * Agency
     * <p>
     * 
     * 
     */
    @JsonProperty("agencyCode")
    public String getAgencyCode() {
        return agencyCode;
    }

    /**
     * Agency
     * <p>
     * 
     * 
     */
    @JsonProperty("agencyCode")
    public void setAgencyCode(String agencyCode) {
        this.agencyCode = agencyCode;
    }

    public Frbgrnt withAgencyCode(String agencyCode) {
        this.agencyCode = agencyCode;
        return this;
    }

    /**
     * Maximum Amount
     * <p>
     * Lineage reference object : FRBGRNT_MAX_FUNDING_AMT
     * 
     */
    @JsonProperty("maxFundingAmt")
    public Double getMaxFundingAmt() {
        return maxFundingAmt;
    }

    /**
     * Maximum Amount
     * <p>
     * Lineage reference object : FRBGRNT_MAX_FUNDING_AMT
     * 
     */
    @JsonProperty("maxFundingAmt")
    public void setMaxFundingAmt(Double maxFundingAmt) {
        this.maxFundingAmt = maxFundingAmt;
    }

    public Frbgrnt withMaxFundingAmt(Double maxFundingAmt) {
        this.maxFundingAmt = maxFundingAmt;
        return this;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : FRBGRNT_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : FRBGRNT_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Frbgrnt withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Proposal
     * <p>
     * Lineage reference object : FRBGRNT_PROP_CODE
     * 
     */
    @JsonProperty("propCode")
    public String getPropCode() {
        return propCode;
    }

    /**
     * Proposal
     * <p>
     * Lineage reference object : FRBGRNT_PROP_CODE
     * 
     */
    @JsonProperty("propCode")
    public void setPropCode(String propCode) {
        this.propCode = propCode;
    }

    public Frbgrnt withPropCode(String propCode) {
        this.propCode = propCode;
        return this;
    }

    @JsonProperty("categoryDesc")
    public String getCategoryDesc() {
        return categoryDesc;
    }

    @JsonProperty("categoryDesc")
    public void setCategoryDesc(String categoryDesc) {
        this.categoryDesc = categoryDesc;
    }

    public Frbgrnt withCategoryDesc(String categoryDesc) {
        this.categoryDesc = categoryDesc;
        return this;
    }

    /**
     * Project Start Date
     * <p>
     * Lineage reference object : FRBGRNT_PROJECT_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("projectStartDate")
    public Date getProjectStartDate() {
        return projectStartDate;
    }

    /**
     * Project Start Date
     * <p>
     * Lineage reference object : FRBGRNT_PROJECT_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("projectStartDate")
    public void setProjectStartDate(Date projectStartDate) {
        this.projectStartDate = projectStartDate;
    }

    public Frbgrnt withProjectStartDate(Date projectStartDate) {
        this.projectStartDate = projectStartDate;
        return this;
    }

    @JsonProperty("indrCodeRateName")
    public String getIndrCodeRateName() {
        return indrCodeRateName;
    }

    @JsonProperty("indrCodeRateName")
    public void setIndrCodeRateName(String indrCodeRateName) {
        this.indrCodeRateName = indrCodeRateName;
    }

    public Frbgrnt withIndrCodeRateName(String indrCodeRateName) {
        this.indrCodeRateName = indrCodeRateName;
        return this;
    }

    /**
     * Phone Number Exists
     * <p>
     * 
     * 
     */
    @JsonProperty("phoneExists")
    public String getPhoneExists() {
        return phoneExists;
    }

    /**
     * Phone Number Exists
     * <p>
     * 
     * 
     */
    @JsonProperty("phoneExists")
    public void setPhoneExists(String phoneExists) {
        this.phoneExists = phoneExists;
    }

    public Frbgrnt withPhoneExists(String phoneExists) {
        this.phoneExists = phoneExists;
        return this;
    }

    /**
     * Indirect Cost Basis
     * <p>
     * Lineage reference object : FRBGRNT_BASI_CODE_IC
     * 
     */
    @JsonProperty("basiCodeIc")
    public String getBasiCodeIc() {
        return basiCodeIc;
    }

    /**
     * Indirect Cost Basis
     * <p>
     * Lineage reference object : FRBGRNT_BASI_CODE_IC
     * 
     */
    @JsonProperty("basiCodeIc")
    public void setBasiCodeIc(String basiCodeIc) {
        this.basiCodeIc = basiCodeIc;
    }

    public Frbgrnt withBasiCodeIc(String basiCodeIc) {
        this.basiCodeIc = basiCodeIc;
        return this;
    }

    /**
     * Email
     * <p>
     * Lineage reference object : FRBGRNT_AGENCY_EMAIL
     * 
     */
    @JsonProperty("agencyEmail")
    public String getAgencyEmail() {
        return agencyEmail;
    }

    /**
     * Email
     * <p>
     * Lineage reference object : FRBGRNT_AGENCY_EMAIL
     * 
     */
    @JsonProperty("agencyEmail")
    public void setAgencyEmail(String agencyEmail) {
        this.agencyEmail = agencyEmail;
    }

    public Frbgrnt withAgencyEmail(String agencyEmail) {
        this.agencyEmail = agencyEmail;
        return this;
    }

    @JsonProperty("subCatDesc")
    public String getSubCatDesc() {
        return subCatDesc;
    }

    @JsonProperty("subCatDesc")
    public void setSubCatDesc(String subCatDesc) {
        this.subCatDesc = subCatDesc;
    }

    public Frbgrnt withSubCatDesc(String subCatDesc) {
        this.subCatDesc = subCatDesc;
        return this;
    }

    /**
     * Contact
     * <p>
     * Lineage reference object : FRBGRNT_AGENCY_CONTACT
     * 
     */
    @JsonProperty("agencyContact")
    public String getAgencyContact() {
        return agencyContact;
    }

    /**
     * Contact
     * <p>
     * Lineage reference object : FRBGRNT_AGENCY_CONTACT
     * 
     */
    @JsonProperty("agencyContact")
    public void setAgencyContact(String agencyContact) {
        this.agencyContact = agencyContact;
    }

    public Frbgrnt withAgencyContact(String agencyContact) {
        this.agencyContact = agencyContact;
        return this;
    }

    /**
     * Indirect Cost Distribute To Code
     * <p>
     * Lineage reference object : FRBGRNT_INDD_CODE_DISTR
     * 
     */
    @JsonProperty("inddCodeDistr")
    public String getInddCodeDistr() {
        return inddCodeDistr;
    }

    /**
     * Indirect Cost Distribute To Code
     * <p>
     * Lineage reference object : FRBGRNT_INDD_CODE_DISTR
     * 
     */
    @JsonProperty("inddCodeDistr")
    public void setInddCodeDistr(String inddCodeDistr) {
        this.inddCodeDistr = inddCodeDistr;
    }

    public Frbgrnt withInddCodeDistr(String inddCodeDistr) {
        this.inddCodeDistr = inddCodeDistr;
        return this;
    }

    /**
     * Indirect Cost Encumbering
     * <p>
     * Lineage reference object : FRBGRNT_IDC_ENC_IND
     * 
     */
    @JsonProperty("idcEncInd")
    public String getIdcEncInd() {
        return idcEncInd;
    }

    /**
     * Indirect Cost Encumbering
     * <p>
     * Lineage reference object : FRBGRNT_IDC_ENC_IND
     * 
     */
    @JsonProperty("idcEncInd")
    public void setIdcEncInd(String idcEncInd) {
        this.idcEncInd = idcEncInd;
    }

    public Frbgrnt withIdcEncInd(String idcEncInd) {
        this.idcEncInd = idcEncInd;
        return this;
    }

    /**
     * Indirect Cost Rate Code
     * <p>
     * Lineage reference object : FRBGRNT_INDR_CODE_RATE
     * 
     */
    @JsonProperty("indrCodeRate")
    public String getIndrCodeRate() {
        return indrCodeRate;
    }

    /**
     * Indirect Cost Rate Code
     * <p>
     * Lineage reference object : FRBGRNT_INDR_CODE_RATE
     * 
     */
    @JsonProperty("indrCodeRate")
    public void setIndrCodeRate(String indrCodeRate) {
        this.indrCodeRate = indrCodeRate;
    }

    public Frbgrnt withIndrCodeRate(String indrCodeRate) {
        this.indrCodeRate = indrCodeRate;
        return this;
    }

    /**
     * Phone Type
     * <p>
     * Lineage reference object : FRBGRNT_AGENCY_PHONE_TYPE
     * 
     */
    @JsonProperty("agencyPhoneType")
    public String getAgencyPhoneType() {
        return agencyPhoneType;
    }

    /**
     * Phone Type
     * <p>
     * Lineage reference object : FRBGRNT_AGENCY_PHONE_TYPE
     * 
     */
    @JsonProperty("agencyPhoneType")
    public void setAgencyPhoneType(String agencyPhoneType) {
        this.agencyPhoneType = agencyPhoneType;
    }

    public Frbgrnt withAgencyPhoneType(String agencyPhoneType) {
        this.agencyPhoneType = agencyPhoneType;
        return this;
    }

    /**
     * Expenditure End Date
     * <p>
     * Lineage reference object : FRBGRNT_EXPEND_END_DATE
     * 
     */
    @JsonProperty("expendEndDate")
    public Date getExpendEndDate() {
        return expendEndDate;
    }

    /**
     * Expenditure End Date
     * <p>
     * Lineage reference object : FRBGRNT_EXPEND_END_DATE
     * 
     */
    @JsonProperty("expendEndDate")
    public void setExpendEndDate(Date expendEndDate) {
        this.expendEndDate = expendEndDate;
    }

    public Frbgrnt withExpendEndDate(Date expendEndDate) {
        this.expendEndDate = expendEndDate;
        return this;
    }

    @JsonProperty("agencyName")
    public String getAgencyName() {
        return agencyName;
    }

    @JsonProperty("agencyName")
    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public Frbgrnt withAgencyName(String agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    @JsonProperty("indaCodeChargeName")
    public String getIndaCodeChargeName() {
        return indaCodeChargeName;
    }

    @JsonProperty("indaCodeChargeName")
    public void setIndaCodeChargeName(String indaCodeChargeName) {
        this.indaCodeChargeName = indaCodeChargeName;
    }

    public Frbgrnt withIndaCodeChargeName(String indaCodeChargeName) {
        this.indaCodeChargeName = indaCodeChargeName;
        return this;
    }

    @JsonProperty("cstdCodeDistrName")
    public String getCstdCodeDistrName() {
        return cstdCodeDistrName;
    }

    @JsonProperty("cstdCodeDistrName")
    public void setCstdCodeDistrName(String cstdCodeDistrName) {
        this.cstdCodeDistrName = cstdCodeDistrName;
    }

    public Frbgrnt withCstdCodeDistrName(String cstdCodeDistrName) {
        this.cstdCodeDistrName = cstdCodeDistrName;
        return this;
    }

    @JsonProperty("statusDescr")
    public String getStatusDescr() {
        return statusDescr;
    }

    @JsonProperty("statusDescr")
    public void setStatusDescr(String statusDescr) {
        this.statusDescr = statusDescr;
    }

    public Frbgrnt withStatusDescr(String statusDescr) {
        this.statusDescr = statusDescr;
        return this;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FRBGRNT_COAS_CODE_IC_CS, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCodeIcCs")
    public String getCoasCodeIcCs() {
        return coasCodeIcCs;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FRBGRNT_COAS_CODE_IC_CS, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCodeIcCs")
    public void setCoasCodeIcCs(String coasCodeIcCs) {
        this.coasCodeIcCs = coasCodeIcCs;
    }

    public Frbgrnt withCoasCodeIcCs(String coasCodeIcCs) {
        this.coasCodeIcCs = coasCodeIcCs;
        return this;
    }

    @JsonProperty("agencyName2")
    public String getAgencyName2() {
        return agencyName2;
    }

    @JsonProperty("agencyName2")
    public void setAgencyName2(String agencyName2) {
        this.agencyName2 = agencyName2;
    }

    public Frbgrnt withAgencyName2(String agencyName2) {
        this.agencyName2 = agencyName2;
        return this;
    }

    /**
     * Responsible Organization
     * <p>
     * Lineage reference object : FRBGRNT_ORGN_CODE_RESP_OFFICE
     * (Required)
     * 
     */
    @JsonProperty("orgnCodeRespOffice")
    public String getOrgnCodeRespOffice() {
        return orgnCodeRespOffice;
    }

    /**
     * Responsible Organization
     * <p>
     * Lineage reference object : FRBGRNT_ORGN_CODE_RESP_OFFICE
     * (Required)
     * 
     */
    @JsonProperty("orgnCodeRespOffice")
    public void setOrgnCodeRespOffice(String orgnCodeRespOffice) {
        this.orgnCodeRespOffice = orgnCodeRespOffice;
    }

    public Frbgrnt withOrgnCodeRespOffice(String orgnCodeRespOffice) {
        this.orgnCodeRespOffice = orgnCodeRespOffice;
        return this;
    }

    /**
     * Requires Effort Certification
     * <p>
     * Lineage reference object : FRBGRNT_EFF_CERT_REQUIRED_IND
     * 
     */
    @JsonProperty("effCertRequiredInd")
    public String getEffCertRequiredInd() {
        return effCertRequiredInd;
    }

    /**
     * Requires Effort Certification
     * <p>
     * Lineage reference object : FRBGRNT_EFF_CERT_REQUIRED_IND
     * 
     */
    @JsonProperty("effCertRequiredInd")
    public void setEffCertRequiredInd(String effCertRequiredInd) {
        this.effCertRequiredInd = effCertRequiredInd;
    }

    public Frbgrnt withEffCertRequiredInd(String effCertRequiredInd) {
        this.effCertRequiredInd = effCertRequiredInd;
        return this;
    }

    /**
     * Category
     * <p>
     * Lineage reference object : FRBGRNT_CATEGORY
     * 
     */
    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    /**
     * Category
     * <p>
     * Lineage reference object : FRBGRNT_CATEGORY
     * 
     */
    @JsonProperty("category")
    public void setCategory(String category) {
        this.category = category;
    }

    public Frbgrnt withCategory(String category) {
        this.category = category;
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

    public Frbgrnt withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Frbgrnt.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("statusDate");
        sb.append('=');
        sb.append(((this.statusDate == null)?"<null>":this.statusDate));
        sb.append(',');
        sb.append("zipCode");
        sb.append('=');
        sb.append(((this.zipCode == null)?"<null>":this.zipCode));
        sb.append(',');
        sb.append("subCategory");
        sb.append('=');
        sb.append(((this.subCategory == null)?"<null>":this.subCategory));
        sb.append(',');
        sb.append("sponsorId");
        sb.append('=');
        sb.append(((this.sponsorId == null)?"<null>":this.sponsorId));
        sb.append(',');
        sb.append("cstrCodeRateName");
        sb.append('=');
        sb.append(((this.cstrCodeRateName == null)?"<null>":this.cstrCodeRateName));
        sb.append(',');
        sb.append("cstaCodeCharge");
        sb.append('=');
        sb.append(((this.cstaCodeCharge == null)?"<null>":this.cstaCodeCharge));
        sb.append(',');
        sb.append("grantDesc");
        sb.append('=');
        sb.append(((this.grantDesc == null)?"<null>":this.grantDesc));
        sb.append(',');
        sb.append("rcptShareTotal");
        sb.append('=');
        sb.append(((this.rcptShareTotal == null)?"<null>":this.rcptShareTotal));
        sb.append(',');
        sb.append("relatedGrntDescr");
        sb.append('=');
        sb.append(((this.relatedGrntDescr == null)?"<null>":this.relatedGrntDescr));
        sb.append(',');
        sb.append("cstdCodeDistr");
        sb.append('=');
        sb.append(((this.cstdCodeDistr == null)?"<null>":this.cstdCodeDistr));
        sb.append(',');
        sb.append("cumFundingAmt");
        sb.append('=');
        sb.append(((this.cumFundingAmt == null)?"<null>":this.cumFundingAmt));
        sb.append(',');
        sb.append("orgnCodeDescr");
        sb.append('=');
        sb.append(((this.orgnCodeDescr == null)?"<null>":this.orgnCodeDescr));
        sb.append(',');
        sb.append("currentFundingAmt");
        sb.append('=');
        sb.append(((this.currentFundingAmt == null)?"<null>":this.currentFundingAmt));
        sb.append(',');
        sb.append("addressLine1");
        sb.append('=');
        sb.append(((this.addressLine1 == null)?"<null>":this.addressLine1));
        sb.append(',');
        sb.append("grntCodeRelated");
        sb.append('=');
        sb.append(((this.grntCodeRelated == null)?"<null>":this.grntCodeRelated));
        sb.append(',');
        sb.append("addressLine2");
        sb.append('=');
        sb.append(((this.addressLine2 == null)?"<null>":this.addressLine2));
        sb.append(',');
        sb.append("addressLine3");
        sb.append('=');
        sb.append(((this.addressLine3 == null)?"<null>":this.addressLine3));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("agencyAddrCode");
        sb.append('=');
        sb.append(((this.agencyAddrCode == null)?"<null>":this.agencyAddrCode));
        sb.append(',');
        sb.append("piIdCode");
        sb.append('=');
        sb.append(((this.piIdCode == null)?"<null>":this.piIdCode));
        sb.append(',');
        sb.append("projectEndDate");
        sb.append('=');
        sb.append(((this.projectEndDate == null)?"<null>":this.projectEndDate));
        sb.append(',');
        sb.append("cstaCodeChargeName");
        sb.append('=');
        sb.append(((this.cstaCodeChargeName == null)?"<null>":this.cstaCodeChargeName));
        sb.append(',');
        sb.append("alternateStatusDesc");
        sb.append('=');
        sb.append(((this.alternateStatusDesc == null)?"<null>":this.alternateStatusDesc));
        sb.append(',');
        sb.append("areaCode");
        sb.append('=');
        sb.append(((this.areaCode == null)?"<null>":this.areaCode));
        sb.append(',');
        sb.append("basiCodeCs");
        sb.append('=');
        sb.append(((this.basiCodeCs == null)?"<null>":this.basiCodeCs));
        sb.append(',');
        sb.append("phoneNumber");
        sb.append('=');
        sb.append(((this.phoneNumber == null)?"<null>":this.phoneNumber));
        sb.append(',');
        sb.append("agencyAddrSeqNum");
        sb.append('=');
        sb.append(((this.agencyAddrSeqNum == null)?"<null>":this.agencyAddrSeqNum));
        sb.append(',');
        sb.append("cstrCodeRate");
        sb.append('=');
        sb.append(((this.cstrCodeRate == null)?"<null>":this.cstrCodeRate));
        sb.append(',');
        sb.append("piIdName");
        sb.append('=');
        sb.append(((this.piIdName == null)?"<null>":this.piIdName));
        sb.append(',');
        sb.append("basiCodeCsName");
        sb.append('=');
        sb.append(((this.basiCodeCsName == null)?"<null>":this.basiCodeCsName));
        sb.append(',');
        sb.append("displayPassThruInd");
        sb.append('=');
        sb.append(((this.displayPassThruInd == null)?"<null>":this.displayPassThruInd));
        sb.append(',');
        sb.append("agencyCode2");
        sb.append('=');
        sb.append(((this.agencyCode2 == null)?"<null>":this.agencyCode2));
        sb.append(',');
        sb.append("grantType");
        sb.append('=');
        sb.append(((this.grantType == null)?"<null>":this.grantType));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
        sb.append(',');
        sb.append("indaCodeCharge");
        sb.append('=');
        sb.append(((this.indaCodeCharge == null)?"<null>":this.indaCodeCharge));
        sb.append(',');
        sb.append("longTitle");
        sb.append('=');
        sb.append(((this.longTitle == null)?"<null>":this.longTitle));
        sb.append(',');
        sb.append("statusCode");
        sb.append('=');
        sb.append(((this.statusCode == null)?"<null>":this.statusCode));
        sb.append(',');
        sb.append("inddCodeDistrName");
        sb.append('=');
        sb.append(((this.inddCodeDistrName == null)?"<null>":this.inddCodeDistrName));
        sb.append(',');
        sb.append("extension");
        sb.append('=');
        sb.append(((this.extension == null)?"<null>":this.extension));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("agencyTeleSeqno");
        sb.append('=');
        sb.append(((this.agencyTeleSeqno == null)?"<null>":this.agencyTeleSeqno));
        sb.append(',');
        sb.append("cfdaCode");
        sb.append('=');
        sb.append(((this.cfdaCode == null)?"<null>":this.cfdaCode));
        sb.append(',');
        sb.append("basiCodeIcName");
        sb.append('=');
        sb.append(((this.basiCodeIcName == null)?"<null>":this.basiCodeIcName));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("agencyCode");
        sb.append('=');
        sb.append(((this.agencyCode == null)?"<null>":this.agencyCode));
        sb.append(',');
        sb.append("maxFundingAmt");
        sb.append('=');
        sb.append(((this.maxFundingAmt == null)?"<null>":this.maxFundingAmt));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("propCode");
        sb.append('=');
        sb.append(((this.propCode == null)?"<null>":this.propCode));
        sb.append(',');
        sb.append("categoryDesc");
        sb.append('=');
        sb.append(((this.categoryDesc == null)?"<null>":this.categoryDesc));
        sb.append(',');
        sb.append("projectStartDate");
        sb.append('=');
        sb.append(((this.projectStartDate == null)?"<null>":this.projectStartDate));
        sb.append(',');
        sb.append("indrCodeRateName");
        sb.append('=');
        sb.append(((this.indrCodeRateName == null)?"<null>":this.indrCodeRateName));
        sb.append(',');
        sb.append("phoneExists");
        sb.append('=');
        sb.append(((this.phoneExists == null)?"<null>":this.phoneExists));
        sb.append(',');
        sb.append("basiCodeIc");
        sb.append('=');
        sb.append(((this.basiCodeIc == null)?"<null>":this.basiCodeIc));
        sb.append(',');
        sb.append("agencyEmail");
        sb.append('=');
        sb.append(((this.agencyEmail == null)?"<null>":this.agencyEmail));
        sb.append(',');
        sb.append("subCatDesc");
        sb.append('=');
        sb.append(((this.subCatDesc == null)?"<null>":this.subCatDesc));
        sb.append(',');
        sb.append("agencyContact");
        sb.append('=');
        sb.append(((this.agencyContact == null)?"<null>":this.agencyContact));
        sb.append(',');
        sb.append("inddCodeDistr");
        sb.append('=');
        sb.append(((this.inddCodeDistr == null)?"<null>":this.inddCodeDistr));
        sb.append(',');
        sb.append("idcEncInd");
        sb.append('=');
        sb.append(((this.idcEncInd == null)?"<null>":this.idcEncInd));
        sb.append(',');
        sb.append("indrCodeRate");
        sb.append('=');
        sb.append(((this.indrCodeRate == null)?"<null>":this.indrCodeRate));
        sb.append(',');
        sb.append("agencyPhoneType");
        sb.append('=');
        sb.append(((this.agencyPhoneType == null)?"<null>":this.agencyPhoneType));
        sb.append(',');
        sb.append("expendEndDate");
        sb.append('=');
        sb.append(((this.expendEndDate == null)?"<null>":this.expendEndDate));
        sb.append(',');
        sb.append("agencyName");
        sb.append('=');
        sb.append(((this.agencyName == null)?"<null>":this.agencyName));
        sb.append(',');
        sb.append("indaCodeChargeName");
        sb.append('=');
        sb.append(((this.indaCodeChargeName == null)?"<null>":this.indaCodeChargeName));
        sb.append(',');
        sb.append("cstdCodeDistrName");
        sb.append('=');
        sb.append(((this.cstdCodeDistrName == null)?"<null>":this.cstdCodeDistrName));
        sb.append(',');
        sb.append("statusDescr");
        sb.append('=');
        sb.append(((this.statusDescr == null)?"<null>":this.statusDescr));
        sb.append(',');
        sb.append("coasCodeIcCs");
        sb.append('=');
        sb.append(((this.coasCodeIcCs == null)?"<null>":this.coasCodeIcCs));
        sb.append(',');
        sb.append("agencyName2");
        sb.append('=');
        sb.append(((this.agencyName2 == null)?"<null>":this.agencyName2));
        sb.append(',');
        sb.append("orgnCodeRespOffice");
        sb.append('=');
        sb.append(((this.orgnCodeRespOffice == null)?"<null>":this.orgnCodeRespOffice));
        sb.append(',');
        sb.append("effCertRequiredInd");
        sb.append('=');
        sb.append(((this.effCertRequiredInd == null)?"<null>":this.effCertRequiredInd));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
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
        result = ((result* 31)+((this.statusDate == null)? 0 :this.statusDate.hashCode()));
        result = ((result* 31)+((this.zipCode == null)? 0 :this.zipCode.hashCode()));
        result = ((result* 31)+((this.subCategory == null)? 0 :this.subCategory.hashCode()));
        result = ((result* 31)+((this.sponsorId == null)? 0 :this.sponsorId.hashCode()));
        result = ((result* 31)+((this.cstrCodeRateName == null)? 0 :this.cstrCodeRateName.hashCode()));
        result = ((result* 31)+((this.cstaCodeCharge == null)? 0 :this.cstaCodeCharge.hashCode()));
        result = ((result* 31)+((this.grantDesc == null)? 0 :this.grantDesc.hashCode()));
        result = ((result* 31)+((this.rcptShareTotal == null)? 0 :this.rcptShareTotal.hashCode()));
        result = ((result* 31)+((this.relatedGrntDescr == null)? 0 :this.relatedGrntDescr.hashCode()));
        result = ((result* 31)+((this.cstdCodeDistr == null)? 0 :this.cstdCodeDistr.hashCode()));
        result = ((result* 31)+((this.cumFundingAmt == null)? 0 :this.cumFundingAmt.hashCode()));
        result = ((result* 31)+((this.orgnCodeDescr == null)? 0 :this.orgnCodeDescr.hashCode()));
        result = ((result* 31)+((this.currentFundingAmt == null)? 0 :this.currentFundingAmt.hashCode()));
        result = ((result* 31)+((this.addressLine1 == null)? 0 :this.addressLine1 .hashCode()));
        result = ((result* 31)+((this.grntCodeRelated == null)? 0 :this.grntCodeRelated.hashCode()));
        result = ((result* 31)+((this.addressLine2 == null)? 0 :this.addressLine2 .hashCode()));
        result = ((result* 31)+((this.addressLine3 == null)? 0 :this.addressLine3 .hashCode()));
        result = ((result* 31)+((this.state == null)? 0 :this.state.hashCode()));
        result = ((result* 31)+((this.agencyAddrCode == null)? 0 :this.agencyAddrCode.hashCode()));
        result = ((result* 31)+((this.piIdCode == null)? 0 :this.piIdCode.hashCode()));
        result = ((result* 31)+((this.projectEndDate == null)? 0 :this.projectEndDate.hashCode()));
        result = ((result* 31)+((this.cstaCodeChargeName == null)? 0 :this.cstaCodeChargeName.hashCode()));
        result = ((result* 31)+((this.alternateStatusDesc == null)? 0 :this.alternateStatusDesc.hashCode()));
        result = ((result* 31)+((this.areaCode == null)? 0 :this.areaCode.hashCode()));
        result = ((result* 31)+((this.basiCodeCs == null)? 0 :this.basiCodeCs.hashCode()));
        result = ((result* 31)+((this.phoneNumber == null)? 0 :this.phoneNumber.hashCode()));
        result = ((result* 31)+((this.agencyAddrSeqNum == null)? 0 :this.agencyAddrSeqNum.hashCode()));
        result = ((result* 31)+((this.cstrCodeRate == null)? 0 :this.cstrCodeRate.hashCode()));
        result = ((result* 31)+((this.piIdName == null)? 0 :this.piIdName.hashCode()));
        result = ((result* 31)+((this.basiCodeCsName == null)? 0 :this.basiCodeCsName.hashCode()));
        result = ((result* 31)+((this.displayPassThruInd == null)? 0 :this.displayPassThruInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.agencyCode2 == null)? 0 :this.agencyCode2 .hashCode()));
        result = ((result* 31)+((this.grantType == null)? 0 :this.grantType.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.indaCodeCharge == null)? 0 :this.indaCodeCharge.hashCode()));
        result = ((result* 31)+((this.longTitle == null)? 0 :this.longTitle.hashCode()));
        result = ((result* 31)+((this.statusCode == null)? 0 :this.statusCode.hashCode()));
        result = ((result* 31)+((this.inddCodeDistrName == null)? 0 :this.inddCodeDistrName.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.city == null)? 0 :this.city.hashCode()));
        result = ((result* 31)+((this.agencyTeleSeqno == null)? 0 :this.agencyTeleSeqno.hashCode()));
        result = ((result* 31)+((this.cfdaCode == null)? 0 :this.cfdaCode.hashCode()));
        result = ((result* 31)+((this.basiCodeIcName == null)? 0 :this.basiCodeIcName.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.agencyCode == null)? 0 :this.agencyCode.hashCode()));
        result = ((result* 31)+((this.maxFundingAmt == null)? 0 :this.maxFundingAmt.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.propCode == null)? 0 :this.propCode.hashCode()));
        result = ((result* 31)+((this.categoryDesc == null)? 0 :this.categoryDesc.hashCode()));
        result = ((result* 31)+((this.projectStartDate == null)? 0 :this.projectStartDate.hashCode()));
        result = ((result* 31)+((this.indrCodeRateName == null)? 0 :this.indrCodeRateName.hashCode()));
        result = ((result* 31)+((this.phoneExists == null)? 0 :this.phoneExists.hashCode()));
        result = ((result* 31)+((this.basiCodeIc == null)? 0 :this.basiCodeIc.hashCode()));
        result = ((result* 31)+((this.agencyEmail == null)? 0 :this.agencyEmail.hashCode()));
        result = ((result* 31)+((this.subCatDesc == null)? 0 :this.subCatDesc.hashCode()));
        result = ((result* 31)+((this.agencyContact == null)? 0 :this.agencyContact.hashCode()));
        result = ((result* 31)+((this.inddCodeDistr == null)? 0 :this.inddCodeDistr.hashCode()));
        result = ((result* 31)+((this.idcEncInd == null)? 0 :this.idcEncInd.hashCode()));
        result = ((result* 31)+((this.indrCodeRate == null)? 0 :this.indrCodeRate.hashCode()));
        result = ((result* 31)+((this.agencyPhoneType == null)? 0 :this.agencyPhoneType.hashCode()));
        result = ((result* 31)+((this.expendEndDate == null)? 0 :this.expendEndDate.hashCode()));
        result = ((result* 31)+((this.agencyName == null)? 0 :this.agencyName.hashCode()));
        result = ((result* 31)+((this.indaCodeChargeName == null)? 0 :this.indaCodeChargeName.hashCode()));
        result = ((result* 31)+((this.cstdCodeDistrName == null)? 0 :this.cstdCodeDistrName.hashCode()));
        result = ((result* 31)+((this.statusDescr == null)? 0 :this.statusDescr.hashCode()));
        result = ((result* 31)+((this.coasCodeIcCs == null)? 0 :this.coasCodeIcCs.hashCode()));
        result = ((result* 31)+((this.agencyName2 == null)? 0 :this.agencyName2 .hashCode()));
        result = ((result* 31)+((this.orgnCodeRespOffice == null)? 0 :this.orgnCodeRespOffice.hashCode()));
        result = ((result* 31)+((this.effCertRequiredInd == null)? 0 :this.effCertRequiredInd.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Frbgrnt) == false) {
            return false;
        }
        Frbgrnt rhs = ((Frbgrnt) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.statusDate == rhs.statusDate)||((this.statusDate!= null)&&this.statusDate.equals(rhs.statusDate)))&&((this.zipCode == rhs.zipCode)||((this.zipCode!= null)&&this.zipCode.equals(rhs.zipCode))))&&((this.subCategory == rhs.subCategory)||((this.subCategory!= null)&&this.subCategory.equals(rhs.subCategory))))&&((this.sponsorId == rhs.sponsorId)||((this.sponsorId!= null)&&this.sponsorId.equals(rhs.sponsorId))))&&((this.cstrCodeRateName == rhs.cstrCodeRateName)||((this.cstrCodeRateName!= null)&&this.cstrCodeRateName.equals(rhs.cstrCodeRateName))))&&((this.cstaCodeCharge == rhs.cstaCodeCharge)||((this.cstaCodeCharge!= null)&&this.cstaCodeCharge.equals(rhs.cstaCodeCharge))))&&((this.grantDesc == rhs.grantDesc)||((this.grantDesc!= null)&&this.grantDesc.equals(rhs.grantDesc))))&&((this.rcptShareTotal == rhs.rcptShareTotal)||((this.rcptShareTotal!= null)&&this.rcptShareTotal.equals(rhs.rcptShareTotal))))&&((this.relatedGrntDescr == rhs.relatedGrntDescr)||((this.relatedGrntDescr!= null)&&this.relatedGrntDescr.equals(rhs.relatedGrntDescr))))&&((this.cstdCodeDistr == rhs.cstdCodeDistr)||((this.cstdCodeDistr!= null)&&this.cstdCodeDistr.equals(rhs.cstdCodeDistr))))&&((this.cumFundingAmt == rhs.cumFundingAmt)||((this.cumFundingAmt!= null)&&this.cumFundingAmt.equals(rhs.cumFundingAmt))))&&((this.orgnCodeDescr == rhs.orgnCodeDescr)||((this.orgnCodeDescr!= null)&&this.orgnCodeDescr.equals(rhs.orgnCodeDescr))))&&((this.currentFundingAmt == rhs.currentFundingAmt)||((this.currentFundingAmt!= null)&&this.currentFundingAmt.equals(rhs.currentFundingAmt))))&&((this.addressLine1 == rhs.addressLine1)||((this.addressLine1 != null)&&this.addressLine1 .equals(rhs.addressLine1))))&&((this.grntCodeRelated == rhs.grntCodeRelated)||((this.grntCodeRelated!= null)&&this.grntCodeRelated.equals(rhs.grntCodeRelated))))&&((this.addressLine2 == rhs.addressLine2)||((this.addressLine2 != null)&&this.addressLine2 .equals(rhs.addressLine2))))&&((this.addressLine3 == rhs.addressLine3)||((this.addressLine3 != null)&&this.addressLine3 .equals(rhs.addressLine3))))&&((this.state == rhs.state)||((this.state!= null)&&this.state.equals(rhs.state))))&&((this.agencyAddrCode == rhs.agencyAddrCode)||((this.agencyAddrCode!= null)&&this.agencyAddrCode.equals(rhs.agencyAddrCode))))&&((this.piIdCode == rhs.piIdCode)||((this.piIdCode!= null)&&this.piIdCode.equals(rhs.piIdCode))))&&((this.projectEndDate == rhs.projectEndDate)||((this.projectEndDate!= null)&&this.projectEndDate.equals(rhs.projectEndDate))))&&((this.cstaCodeChargeName == rhs.cstaCodeChargeName)||((this.cstaCodeChargeName!= null)&&this.cstaCodeChargeName.equals(rhs.cstaCodeChargeName))))&&((this.alternateStatusDesc == rhs.alternateStatusDesc)||((this.alternateStatusDesc!= null)&&this.alternateStatusDesc.equals(rhs.alternateStatusDesc))))&&((this.areaCode == rhs.areaCode)||((this.areaCode!= null)&&this.areaCode.equals(rhs.areaCode))))&&((this.basiCodeCs == rhs.basiCodeCs)||((this.basiCodeCs!= null)&&this.basiCodeCs.equals(rhs.basiCodeCs))))&&((this.phoneNumber == rhs.phoneNumber)||((this.phoneNumber!= null)&&this.phoneNumber.equals(rhs.phoneNumber))))&&((this.agencyAddrSeqNum == rhs.agencyAddrSeqNum)||((this.agencyAddrSeqNum!= null)&&this.agencyAddrSeqNum.equals(rhs.agencyAddrSeqNum))))&&((this.cstrCodeRate == rhs.cstrCodeRate)||((this.cstrCodeRate!= null)&&this.cstrCodeRate.equals(rhs.cstrCodeRate))))&&((this.piIdName == rhs.piIdName)||((this.piIdName!= null)&&this.piIdName.equals(rhs.piIdName))))&&((this.basiCodeCsName == rhs.basiCodeCsName)||((this.basiCodeCsName!= null)&&this.basiCodeCsName.equals(rhs.basiCodeCsName))))&&((this.displayPassThruInd == rhs.displayPassThruInd)||((this.displayPassThruInd!= null)&&this.displayPassThruInd.equals(rhs.displayPassThruInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.agencyCode2 == rhs.agencyCode2)||((this.agencyCode2 != null)&&this.agencyCode2 .equals(rhs.agencyCode2))))&&((this.grantType == rhs.grantType)||((this.grantType!= null)&&this.grantType.equals(rhs.grantType))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.indaCodeCharge == rhs.indaCodeCharge)||((this.indaCodeCharge!= null)&&this.indaCodeCharge.equals(rhs.indaCodeCharge))))&&((this.longTitle == rhs.longTitle)||((this.longTitle!= null)&&this.longTitle.equals(rhs.longTitle))))&&((this.statusCode == rhs.statusCode)||((this.statusCode!= null)&&this.statusCode.equals(rhs.statusCode))))&&((this.inddCodeDistrName == rhs.inddCodeDistrName)||((this.inddCodeDistrName!= null)&&this.inddCodeDistrName.equals(rhs.inddCodeDistrName))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.city == rhs.city)||((this.city!= null)&&this.city.equals(rhs.city))))&&((this.agencyTeleSeqno == rhs.agencyTeleSeqno)||((this.agencyTeleSeqno!= null)&&this.agencyTeleSeqno.equals(rhs.agencyTeleSeqno))))&&((this.cfdaCode == rhs.cfdaCode)||((this.cfdaCode!= null)&&this.cfdaCode.equals(rhs.cfdaCode))))&&((this.basiCodeIcName == rhs.basiCodeIcName)||((this.basiCodeIcName!= null)&&this.basiCodeIcName.equals(rhs.basiCodeIcName))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.agencyCode == rhs.agencyCode)||((this.agencyCode!= null)&&this.agencyCode.equals(rhs.agencyCode))))&&((this.maxFundingAmt == rhs.maxFundingAmt)||((this.maxFundingAmt!= null)&&this.maxFundingAmt.equals(rhs.maxFundingAmt))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.propCode == rhs.propCode)||((this.propCode!= null)&&this.propCode.equals(rhs.propCode))))&&((this.categoryDesc == rhs.categoryDesc)||((this.categoryDesc!= null)&&this.categoryDesc.equals(rhs.categoryDesc))))&&((this.projectStartDate == rhs.projectStartDate)||((this.projectStartDate!= null)&&this.projectStartDate.equals(rhs.projectStartDate))))&&((this.indrCodeRateName == rhs.indrCodeRateName)||((this.indrCodeRateName!= null)&&this.indrCodeRateName.equals(rhs.indrCodeRateName))))&&((this.phoneExists == rhs.phoneExists)||((this.phoneExists!= null)&&this.phoneExists.equals(rhs.phoneExists))))&&((this.basiCodeIc == rhs.basiCodeIc)||((this.basiCodeIc!= null)&&this.basiCodeIc.equals(rhs.basiCodeIc))))&&((this.agencyEmail == rhs.agencyEmail)||((this.agencyEmail!= null)&&this.agencyEmail.equals(rhs.agencyEmail))))&&((this.subCatDesc == rhs.subCatDesc)||((this.subCatDesc!= null)&&this.subCatDesc.equals(rhs.subCatDesc))))&&((this.agencyContact == rhs.agencyContact)||((this.agencyContact!= null)&&this.agencyContact.equals(rhs.agencyContact))))&&((this.inddCodeDistr == rhs.inddCodeDistr)||((this.inddCodeDistr!= null)&&this.inddCodeDistr.equals(rhs.inddCodeDistr))))&&((this.idcEncInd == rhs.idcEncInd)||((this.idcEncInd!= null)&&this.idcEncInd.equals(rhs.idcEncInd))))&&((this.indrCodeRate == rhs.indrCodeRate)||((this.indrCodeRate!= null)&&this.indrCodeRate.equals(rhs.indrCodeRate))))&&((this.agencyPhoneType == rhs.agencyPhoneType)||((this.agencyPhoneType!= null)&&this.agencyPhoneType.equals(rhs.agencyPhoneType))))&&((this.expendEndDate == rhs.expendEndDate)||((this.expendEndDate!= null)&&this.expendEndDate.equals(rhs.expendEndDate))))&&((this.agencyName == rhs.agencyName)||((this.agencyName!= null)&&this.agencyName.equals(rhs.agencyName))))&&((this.indaCodeChargeName == rhs.indaCodeChargeName)||((this.indaCodeChargeName!= null)&&this.indaCodeChargeName.equals(rhs.indaCodeChargeName))))&&((this.cstdCodeDistrName == rhs.cstdCodeDistrName)||((this.cstdCodeDistrName!= null)&&this.cstdCodeDistrName.equals(rhs.cstdCodeDistrName))))&&((this.statusDescr == rhs.statusDescr)||((this.statusDescr!= null)&&this.statusDescr.equals(rhs.statusDescr))))&&((this.coasCodeIcCs == rhs.coasCodeIcCs)||((this.coasCodeIcCs!= null)&&this.coasCodeIcCs.equals(rhs.coasCodeIcCs))))&&((this.agencyName2 == rhs.agencyName2)||((this.agencyName2 != null)&&this.agencyName2 .equals(rhs.agencyName2))))&&((this.orgnCodeRespOffice == rhs.orgnCodeRespOffice)||((this.orgnCodeRespOffice!= null)&&this.orgnCodeRespOffice.equals(rhs.orgnCodeRespOffice))))&&((this.effCertRequiredInd == rhs.effCertRequiredInd)||((this.effCertRequiredInd!= null)&&this.effCertRequiredInd.equals(rhs.effCertRequiredInd))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))));
    }

}
