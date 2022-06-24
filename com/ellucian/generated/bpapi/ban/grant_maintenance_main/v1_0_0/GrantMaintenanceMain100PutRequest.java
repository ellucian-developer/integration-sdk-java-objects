
package com.ellucian.generated.bpapi.ban.grant_maintenance_main.v1_0_0;

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
    "subCategory",
    "criteria.propCode",
    "criteria.userId",
    "sponsorId",
    "criteria.grantType",
    "criteria.termDate",
    "cstaCodeCharge",
    "criteria.longTitle",
    "rcptShareTotal",
    "cstdCodeDistr",
    "criteria.cfdaCode",
    "cumFundingAmt",
    "currentFundingAmt",
    "grntCodeRelated",
    "criteria.coasCode",
    "agencyAddrCode",
    "criteria.subCategory",
    "piIdCode",
    "frbgrntCoasCode",
    "projectEndDate",
    "criteria.rcptShareTotal",
    "alternateStatusDesc",
    "criteria.title",
    "criteria.alternateStatusDesc",
    "criteria.piIdCode",
    "basiCodeCs",
    "criteria.sponsorId",
    "agencyAddrSeqNum",
    "criteria.currentFundingAmt",
    "cstrCodeRate",
    "criteria.statusCode",
    "grantType",
    "termDate",
    "longTitle",
    "statusCode",
    "indaCodeCharge",
    "criteria.activityDate",
    "agencyTeleSeqno",
    "cfdaCode",
    "houseNumber",
    "agencyCode",
    "maxFundingAmt",
    "title",
    "criteria.category",
    "ctryCodePhone",
    "propCode",
    "displayFrbgrntCode",
    "displayPropCode",
    "projectStartDate",
    "criteria.displayPassThruInd",
    "criteria.effCertRequiredInd",
    "criteria.orgnCodeRespOffice",
    "basiCodeIc",
    "agencyEmail",
    "agencyContact",
    "inddCodeDistr",
    "idcEncInd",
    "indrCodeRate",
    "expendEndDate",
    "criteria.projectEndDate",
    "criteria.projectStartDate",
    "criteria.grntCodeRelated",
    "criteria.maxFundingAmt",
    "coasCodeIcCs",
    "criteria.agencyCode",
    "criteria.expendEndDate",
    "criteria.statusDate",
    "criteria.cumFundingAmt",
    "orgnCodeRespOffice",
    "effCertRequiredInd",
    "category"
})
@Generated("jsonschema2pojo")
public class GrantMaintenanceMain100PutRequest {

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
     * Sub Category
     * <p>
     * Lineage reference object : FRBGRNT_SUB_CATEGORY
     * 
     */
    @JsonProperty("subCategory")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_SUB_CATEGORY")
    private String subCategory;
    /**
     * Proposal
     * <p>
     * Lineage reference object : FRBGRNT_PROP_CODE
     * 
     */
    @JsonProperty("criteria.propCode")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_PROP_CODE")
    private String criteriaPropCode;
    /**
     * Lineage reference object : FRBGRNT_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_USER_ID")
    private String criteriaUserId;
    /**
     * Sponsor ID
     * <p>
     * Lineage reference object : FRBGRNT_SPONSOR_ID
     * 
     */
    @JsonProperty("sponsorId")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_SPONSOR_ID")
    private String sponsorId;
    /**
     * Grant Type
     * <p>
     * Lineage reference object : FRBGRNT_GRANT_TYPE
     * 
     */
    @JsonProperty("criteria.grantType")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_GRANT_TYPE")
    private String criteriaGrantType;
    /**
     * Termination Date
     * <p>
     * Lineage reference object : FRBGRNT_TERM_DATE
     * 
     */
    @JsonProperty("criteria.termDate")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_TERM_DATE")
    private Date criteriaTermDate;
    /**
     * Cost Share Credit Account Code
     * <p>
     * Lineage reference object : FRBGRNT_CSTA_CODE_CHARGE, Lookup lineage reference object : frbcsta,frvcsta
     * 
     */
    @JsonProperty("cstaCodeCharge")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_CSTA_CODE_CHARGE, Lookup lineage reference object : frbcsta,frvcsta")
    private String cstaCodeCharge;
    /**
     * Long Title
     * <p>
     * Lineage reference object : FRBGRNT_LONG_TITLE
     * (Required)
     * 
     */
    @JsonProperty("criteria.longTitle")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_LONG_TITLE")
    private String criteriaLongTitle;
    /**
     * Total Recipient Share
     * <p>
     * Lineage reference object : FRBGRNT_RCPT_SHARE_TOTAL
     * 
     */
    @JsonProperty("rcptShareTotal")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_RCPT_SHARE_TOTAL")
    private Double rcptShareTotal;
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
     * CFDA Number
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.cfdaCode")
    private String criteriaCfdaCode;
    /**
     * Cumulative Amount
     * <p>
     * Lineage reference object : FRBGRNT_CUM_FUNDING_AMT
     * 
     */
    @JsonProperty("cumFundingAmt")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_CUM_FUNDING_AMT")
    private Double cumFundingAmt;
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
     * Related Grant
     * <p>
     * Lineage reference object : FRBGRNT_GRNT_CODE_RELATED
     * 
     */
    @JsonProperty("grntCodeRelated")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_GRNT_CODE_RELATED")
    private String grntCodeRelated;
    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FRBGRNT_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("criteria.coasCode")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String criteriaCoasCode;
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
     * Sub Category
     * <p>
     * Lineage reference object : FRBGRNT_SUB_CATEGORY
     * 
     */
    @JsonProperty("criteria.subCategory")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_SUB_CATEGORY")
    private String criteriaSubCategory;
    /**
     * Principal Investigator ID
     * <p>
     * 
     * 
     */
    @JsonProperty("piIdCode")
    private String piIdCode;
    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FRBGRNT_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("frbgrntCoasCode")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String frbgrntCoasCode;
    /**
     * Project End Date
     * <p>
     * Lineage reference object : FRBGRNT_PROJECT_END_DATE
     * 
     */
    @JsonProperty("projectEndDate")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_PROJECT_END_DATE")
    private Date projectEndDate;
    /**
     * Total Recipient Share
     * <p>
     * Lineage reference object : FRBGRNT_RCPT_SHARE_TOTAL
     * 
     */
    @JsonProperty("criteria.rcptShareTotal")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_RCPT_SHARE_TOTAL")
    private Double criteriaRcptShareTotal;
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
     * Title
     * <p>
     * Lineage reference object : FRBGRNT_TITLE
     * (Required)
     * 
     */
    @JsonProperty("criteria.title")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_TITLE")
    private String criteriaTitle;
    /**
     * Alternate Description
     * <p>
     * Lineage reference object : FRBGRNT_ALTERNATE_STATUS_DESC
     * 
     */
    @JsonProperty("criteria.alternateStatusDesc")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_ALTERNATE_STATUS_DESC")
    private String criteriaAlternateStatusDesc;
    /**
     * Principal Investigator ID
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.piIdCode")
    private String criteriaPiIdCode;
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
     * Sponsor ID
     * <p>
     * Lineage reference object : FRBGRNT_SPONSOR_ID
     * 
     */
    @JsonProperty("criteria.sponsorId")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_SPONSOR_ID")
    private String criteriaSponsorId;
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
     * Current Amount
     * <p>
     * Lineage reference object : FRBGRNT_CURRENT_FUNDING_AMT
     * 
     */
    @JsonProperty("criteria.currentFundingAmt")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_CURRENT_FUNDING_AMT")
    private Double criteriaCurrentFundingAmt;
    /**
     * Cost Share Rate Code
     * <p>
     * Lineage reference object : FRBGRNT_CSTR_CODE_RATE, Lookup lineage reference object : frrcstr,frvcstr
     * 
     */
    @JsonProperty("cstrCodeRate")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_CSTR_CODE_RATE, Lookup lineage reference object : frrcstr,frvcstr")
    private String cstrCodeRate;
    /**
     * Status
     * <p>
     * Lineage reference object : FRBGRNT_STATUS_CODE
     * 
     */
    @JsonProperty("criteria.statusCode")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_STATUS_CODE")
    private String criteriaStatusCode;
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
     * Lineage reference object : FRBGRNT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_ACTIVITY_DATE")
    private Date criteriaActivityDate;
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
    /**
     * House Number
     * <p>
     * 
     * 
     */
    @JsonProperty("houseNumber")
    private String houseNumber;
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
     * Category
     * <p>
     * Lineage reference object : FRBGRNT_CATEGORY
     * 
     */
    @JsonProperty("criteria.category")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_CATEGORY")
    private String criteriaCategory;
    /**
     * Country Code
     * <p>
     * 
     * 
     */
    @JsonProperty("ctryCodePhone")
    private String ctryCodePhone;
    /**
     * Proposal
     * <p>
     * Lineage reference object : FRBGRNT_PROP_CODE
     * 
     */
    @JsonProperty("propCode")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_PROP_CODE")
    private String propCode;
    /**
     * Grant
     * <p>
     * Lineage reference object : displayFrbgrntCode
     * 
     */
    @JsonProperty("displayFrbgrntCode")
    @JsonPropertyDescription("Lineage reference object : displayFrbgrntCode")
    private String displayFrbgrntCode;
    /**
     * Proposal
     * <p>
     * Lineage reference object : displayPropCode
     * 
     */
    @JsonProperty("displayPropCode")
    @JsonPropertyDescription("Lineage reference object : displayPropCode")
    private String displayPropCode;
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
    /**
     * Pass Through Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.displayPassThruInd")
    private String criteriaDisplayPassThruInd;
    /**
     * Requires Effort Certification
     * <p>
     * Lineage reference object : FRBGRNT_EFF_CERT_REQUIRED_IND
     * 
     */
    @JsonProperty("criteria.effCertRequiredInd")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_EFF_CERT_REQUIRED_IND")
    private String criteriaEffCertRequiredInd;
    /**
     * Responsible Organization
     * <p>
     * Lineage reference object : FRBGRNT_ORGN_CODE_RESP_OFFICE
     * (Required)
     * 
     */
    @JsonProperty("criteria.orgnCodeRespOffice")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_ORGN_CODE_RESP_OFFICE")
    private String criteriaOrgnCodeRespOffice;
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
     * Expenditure End Date
     * <p>
     * Lineage reference object : FRBGRNT_EXPEND_END_DATE
     * 
     */
    @JsonProperty("expendEndDate")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_EXPEND_END_DATE")
    private Date expendEndDate;
    /**
     * Project End Date
     * <p>
     * Lineage reference object : FRBGRNT_PROJECT_END_DATE
     * 
     */
    @JsonProperty("criteria.projectEndDate")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_PROJECT_END_DATE")
    private Date criteriaProjectEndDate;
    /**
     * Project Start Date
     * <p>
     * Lineage reference object : FRBGRNT_PROJECT_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.projectStartDate")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_PROJECT_START_DATE")
    private Date criteriaProjectStartDate;
    /**
     * Related Grant
     * <p>
     * Lineage reference object : FRBGRNT_GRNT_CODE_RELATED
     * 
     */
    @JsonProperty("criteria.grntCodeRelated")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_GRNT_CODE_RELATED")
    private String criteriaGrntCodeRelated;
    /**
     * Maximum Amount
     * <p>
     * Lineage reference object : FRBGRNT_MAX_FUNDING_AMT
     * 
     */
    @JsonProperty("criteria.maxFundingAmt")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_MAX_FUNDING_AMT")
    private Double criteriaMaxFundingAmt;
    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FRBGRNT_COAS_CODE_IC_CS, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCodeIcCs")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_COAS_CODE_IC_CS, Lookup lineage reference object : ftvcoas")
    private String coasCodeIcCs;
    /**
     * Agency
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.agencyCode")
    private String criteriaAgencyCode;
    /**
     * Expenditure End Date
     * <p>
     * Lineage reference object : FRBGRNT_EXPEND_END_DATE
     * 
     */
    @JsonProperty("criteria.expendEndDate")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_EXPEND_END_DATE")
    private Date criteriaExpendEndDate;
    /**
     * Status Date
     * <p>
     * Lineage reference object : FRBGRNT_STATUS_DATE
     * 
     */
    @JsonProperty("criteria.statusDate")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_STATUS_DATE")
    private Date criteriaStatusDate;
    /**
     * Cumulative Amount
     * <p>
     * Lineage reference object : FRBGRNT_CUM_FUNDING_AMT
     * 
     */
    @JsonProperty("criteria.cumFundingAmt")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_CUM_FUNDING_AMT")
    private Double criteriaCumFundingAmt;
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

    public GrantMaintenanceMain100PutRequest withStatusDate(Date statusDate) {
        this.statusDate = statusDate;
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

    public GrantMaintenanceMain100PutRequest withSubCategory(String subCategory) {
        this.subCategory = subCategory;
        return this;
    }

    /**
     * Proposal
     * <p>
     * Lineage reference object : FRBGRNT_PROP_CODE
     * 
     */
    @JsonProperty("criteria.propCode")
    public String getCriteriaPropCode() {
        return criteriaPropCode;
    }

    /**
     * Proposal
     * <p>
     * Lineage reference object : FRBGRNT_PROP_CODE
     * 
     */
    @JsonProperty("criteria.propCode")
    public void setCriteriaPropCode(String criteriaPropCode) {
        this.criteriaPropCode = criteriaPropCode;
    }

    public GrantMaintenanceMain100PutRequest withCriteriaPropCode(String criteriaPropCode) {
        this.criteriaPropCode = criteriaPropCode;
        return this;
    }

    /**
     * Lineage reference object : FRBGRNT_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public String getCriteriaUserId() {
        return criteriaUserId;
    }

    /**
     * Lineage reference object : FRBGRNT_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public void setCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
    }

    public GrantMaintenanceMain100PutRequest withCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
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

    public GrantMaintenanceMain100PutRequest withSponsorId(String sponsorId) {
        this.sponsorId = sponsorId;
        return this;
    }

    /**
     * Grant Type
     * <p>
     * Lineage reference object : FRBGRNT_GRANT_TYPE
     * 
     */
    @JsonProperty("criteria.grantType")
    public String getCriteriaGrantType() {
        return criteriaGrantType;
    }

    /**
     * Grant Type
     * <p>
     * Lineage reference object : FRBGRNT_GRANT_TYPE
     * 
     */
    @JsonProperty("criteria.grantType")
    public void setCriteriaGrantType(String criteriaGrantType) {
        this.criteriaGrantType = criteriaGrantType;
    }

    public GrantMaintenanceMain100PutRequest withCriteriaGrantType(String criteriaGrantType) {
        this.criteriaGrantType = criteriaGrantType;
        return this;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FRBGRNT_TERM_DATE
     * 
     */
    @JsonProperty("criteria.termDate")
    public Date getCriteriaTermDate() {
        return criteriaTermDate;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FRBGRNT_TERM_DATE
     * 
     */
    @JsonProperty("criteria.termDate")
    public void setCriteriaTermDate(Date criteriaTermDate) {
        this.criteriaTermDate = criteriaTermDate;
    }

    public GrantMaintenanceMain100PutRequest withCriteriaTermDate(Date criteriaTermDate) {
        this.criteriaTermDate = criteriaTermDate;
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

    public GrantMaintenanceMain100PutRequest withCstaCodeCharge(String cstaCodeCharge) {
        this.cstaCodeCharge = cstaCodeCharge;
        return this;
    }

    /**
     * Long Title
     * <p>
     * Lineage reference object : FRBGRNT_LONG_TITLE
     * (Required)
     * 
     */
    @JsonProperty("criteria.longTitle")
    public String getCriteriaLongTitle() {
        return criteriaLongTitle;
    }

    /**
     * Long Title
     * <p>
     * Lineage reference object : FRBGRNT_LONG_TITLE
     * (Required)
     * 
     */
    @JsonProperty("criteria.longTitle")
    public void setCriteriaLongTitle(String criteriaLongTitle) {
        this.criteriaLongTitle = criteriaLongTitle;
    }

    public GrantMaintenanceMain100PutRequest withCriteriaLongTitle(String criteriaLongTitle) {
        this.criteriaLongTitle = criteriaLongTitle;
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

    public GrantMaintenanceMain100PutRequest withRcptShareTotal(Double rcptShareTotal) {
        this.rcptShareTotal = rcptShareTotal;
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

    public GrantMaintenanceMain100PutRequest withCstdCodeDistr(String cstdCodeDistr) {
        this.cstdCodeDistr = cstdCodeDistr;
        return this;
    }

    /**
     * CFDA Number
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.cfdaCode")
    public String getCriteriaCfdaCode() {
        return criteriaCfdaCode;
    }

    /**
     * CFDA Number
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.cfdaCode")
    public void setCriteriaCfdaCode(String criteriaCfdaCode) {
        this.criteriaCfdaCode = criteriaCfdaCode;
    }

    public GrantMaintenanceMain100PutRequest withCriteriaCfdaCode(String criteriaCfdaCode) {
        this.criteriaCfdaCode = criteriaCfdaCode;
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

    public GrantMaintenanceMain100PutRequest withCumFundingAmt(Double cumFundingAmt) {
        this.cumFundingAmt = cumFundingAmt;
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

    public GrantMaintenanceMain100PutRequest withCurrentFundingAmt(Double currentFundingAmt) {
        this.currentFundingAmt = currentFundingAmt;
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

    public GrantMaintenanceMain100PutRequest withGrntCodeRelated(String grntCodeRelated) {
        this.grntCodeRelated = grntCodeRelated;
        return this;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FRBGRNT_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("criteria.coasCode")
    public String getCriteriaCoasCode() {
        return criteriaCoasCode;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FRBGRNT_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("criteria.coasCode")
    public void setCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
    }

    public GrantMaintenanceMain100PutRequest withCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
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

    public GrantMaintenanceMain100PutRequest withAgencyAddrCode(String agencyAddrCode) {
        this.agencyAddrCode = agencyAddrCode;
        return this;
    }

    /**
     * Sub Category
     * <p>
     * Lineage reference object : FRBGRNT_SUB_CATEGORY
     * 
     */
    @JsonProperty("criteria.subCategory")
    public String getCriteriaSubCategory() {
        return criteriaSubCategory;
    }

    /**
     * Sub Category
     * <p>
     * Lineage reference object : FRBGRNT_SUB_CATEGORY
     * 
     */
    @JsonProperty("criteria.subCategory")
    public void setCriteriaSubCategory(String criteriaSubCategory) {
        this.criteriaSubCategory = criteriaSubCategory;
    }

    public GrantMaintenanceMain100PutRequest withCriteriaSubCategory(String criteriaSubCategory) {
        this.criteriaSubCategory = criteriaSubCategory;
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

    public GrantMaintenanceMain100PutRequest withPiIdCode(String piIdCode) {
        this.piIdCode = piIdCode;
        return this;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FRBGRNT_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("frbgrntCoasCode")
    public String getFrbgrntCoasCode() {
        return frbgrntCoasCode;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FRBGRNT_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("frbgrntCoasCode")
    public void setFrbgrntCoasCode(String frbgrntCoasCode) {
        this.frbgrntCoasCode = frbgrntCoasCode;
    }

    public GrantMaintenanceMain100PutRequest withFrbgrntCoasCode(String frbgrntCoasCode) {
        this.frbgrntCoasCode = frbgrntCoasCode;
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

    public GrantMaintenanceMain100PutRequest withProjectEndDate(Date projectEndDate) {
        this.projectEndDate = projectEndDate;
        return this;
    }

    /**
     * Total Recipient Share
     * <p>
     * Lineage reference object : FRBGRNT_RCPT_SHARE_TOTAL
     * 
     */
    @JsonProperty("criteria.rcptShareTotal")
    public Double getCriteriaRcptShareTotal() {
        return criteriaRcptShareTotal;
    }

    /**
     * Total Recipient Share
     * <p>
     * Lineage reference object : FRBGRNT_RCPT_SHARE_TOTAL
     * 
     */
    @JsonProperty("criteria.rcptShareTotal")
    public void setCriteriaRcptShareTotal(Double criteriaRcptShareTotal) {
        this.criteriaRcptShareTotal = criteriaRcptShareTotal;
    }

    public GrantMaintenanceMain100PutRequest withCriteriaRcptShareTotal(Double criteriaRcptShareTotal) {
        this.criteriaRcptShareTotal = criteriaRcptShareTotal;
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

    public GrantMaintenanceMain100PutRequest withAlternateStatusDesc(String alternateStatusDesc) {
        this.alternateStatusDesc = alternateStatusDesc;
        return this;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : FRBGRNT_TITLE
     * (Required)
     * 
     */
    @JsonProperty("criteria.title")
    public String getCriteriaTitle() {
        return criteriaTitle;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : FRBGRNT_TITLE
     * (Required)
     * 
     */
    @JsonProperty("criteria.title")
    public void setCriteriaTitle(String criteriaTitle) {
        this.criteriaTitle = criteriaTitle;
    }

    public GrantMaintenanceMain100PutRequest withCriteriaTitle(String criteriaTitle) {
        this.criteriaTitle = criteriaTitle;
        return this;
    }

    /**
     * Alternate Description
     * <p>
     * Lineage reference object : FRBGRNT_ALTERNATE_STATUS_DESC
     * 
     */
    @JsonProperty("criteria.alternateStatusDesc")
    public String getCriteriaAlternateStatusDesc() {
        return criteriaAlternateStatusDesc;
    }

    /**
     * Alternate Description
     * <p>
     * Lineage reference object : FRBGRNT_ALTERNATE_STATUS_DESC
     * 
     */
    @JsonProperty("criteria.alternateStatusDesc")
    public void setCriteriaAlternateStatusDesc(String criteriaAlternateStatusDesc) {
        this.criteriaAlternateStatusDesc = criteriaAlternateStatusDesc;
    }

    public GrantMaintenanceMain100PutRequest withCriteriaAlternateStatusDesc(String criteriaAlternateStatusDesc) {
        this.criteriaAlternateStatusDesc = criteriaAlternateStatusDesc;
        return this;
    }

    /**
     * Principal Investigator ID
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.piIdCode")
    public String getCriteriaPiIdCode() {
        return criteriaPiIdCode;
    }

    /**
     * Principal Investigator ID
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.piIdCode")
    public void setCriteriaPiIdCode(String criteriaPiIdCode) {
        this.criteriaPiIdCode = criteriaPiIdCode;
    }

    public GrantMaintenanceMain100PutRequest withCriteriaPiIdCode(String criteriaPiIdCode) {
        this.criteriaPiIdCode = criteriaPiIdCode;
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

    public GrantMaintenanceMain100PutRequest withBasiCodeCs(String basiCodeCs) {
        this.basiCodeCs = basiCodeCs;
        return this;
    }

    /**
     * Sponsor ID
     * <p>
     * Lineage reference object : FRBGRNT_SPONSOR_ID
     * 
     */
    @JsonProperty("criteria.sponsorId")
    public String getCriteriaSponsorId() {
        return criteriaSponsorId;
    }

    /**
     * Sponsor ID
     * <p>
     * Lineage reference object : FRBGRNT_SPONSOR_ID
     * 
     */
    @JsonProperty("criteria.sponsorId")
    public void setCriteriaSponsorId(String criteriaSponsorId) {
        this.criteriaSponsorId = criteriaSponsorId;
    }

    public GrantMaintenanceMain100PutRequest withCriteriaSponsorId(String criteriaSponsorId) {
        this.criteriaSponsorId = criteriaSponsorId;
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

    public GrantMaintenanceMain100PutRequest withAgencyAddrSeqNum(Double agencyAddrSeqNum) {
        this.agencyAddrSeqNum = agencyAddrSeqNum;
        return this;
    }

    /**
     * Current Amount
     * <p>
     * Lineage reference object : FRBGRNT_CURRENT_FUNDING_AMT
     * 
     */
    @JsonProperty("criteria.currentFundingAmt")
    public Double getCriteriaCurrentFundingAmt() {
        return criteriaCurrentFundingAmt;
    }

    /**
     * Current Amount
     * <p>
     * Lineage reference object : FRBGRNT_CURRENT_FUNDING_AMT
     * 
     */
    @JsonProperty("criteria.currentFundingAmt")
    public void setCriteriaCurrentFundingAmt(Double criteriaCurrentFundingAmt) {
        this.criteriaCurrentFundingAmt = criteriaCurrentFundingAmt;
    }

    public GrantMaintenanceMain100PutRequest withCriteriaCurrentFundingAmt(Double criteriaCurrentFundingAmt) {
        this.criteriaCurrentFundingAmt = criteriaCurrentFundingAmt;
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

    public GrantMaintenanceMain100PutRequest withCstrCodeRate(String cstrCodeRate) {
        this.cstrCodeRate = cstrCodeRate;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : FRBGRNT_STATUS_CODE
     * 
     */
    @JsonProperty("criteria.statusCode")
    public String getCriteriaStatusCode() {
        return criteriaStatusCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : FRBGRNT_STATUS_CODE
     * 
     */
    @JsonProperty("criteria.statusCode")
    public void setCriteriaStatusCode(String criteriaStatusCode) {
        this.criteriaStatusCode = criteriaStatusCode;
    }

    public GrantMaintenanceMain100PutRequest withCriteriaStatusCode(String criteriaStatusCode) {
        this.criteriaStatusCode = criteriaStatusCode;
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

    public GrantMaintenanceMain100PutRequest withGrantType(String grantType) {
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

    public GrantMaintenanceMain100PutRequest withTermDate(Date termDate) {
        this.termDate = termDate;
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

    public GrantMaintenanceMain100PutRequest withLongTitle(String longTitle) {
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

    public GrantMaintenanceMain100PutRequest withStatusCode(String statusCode) {
        this.statusCode = statusCode;
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

    public GrantMaintenanceMain100PutRequest withIndaCodeCharge(String indaCodeCharge) {
        this.indaCodeCharge = indaCodeCharge;
        return this;
    }

    /**
     * Lineage reference object : FRBGRNT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Lineage reference object : FRBGRNT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public GrantMaintenanceMain100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
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

    public GrantMaintenanceMain100PutRequest withAgencyTeleSeqno(Double agencyTeleSeqno) {
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

    public GrantMaintenanceMain100PutRequest withCfdaCode(String cfdaCode) {
        this.cfdaCode = cfdaCode;
        return this;
    }

    /**
     * House Number
     * <p>
     * 
     * 
     */
    @JsonProperty("houseNumber")
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * House Number
     * <p>
     * 
     * 
     */
    @JsonProperty("houseNumber")
    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public GrantMaintenanceMain100PutRequest withHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
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

    public GrantMaintenanceMain100PutRequest withAgencyCode(String agencyCode) {
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

    public GrantMaintenanceMain100PutRequest withMaxFundingAmt(Double maxFundingAmt) {
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

    public GrantMaintenanceMain100PutRequest withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Category
     * <p>
     * Lineage reference object : FRBGRNT_CATEGORY
     * 
     */
    @JsonProperty("criteria.category")
    public String getCriteriaCategory() {
        return criteriaCategory;
    }

    /**
     * Category
     * <p>
     * Lineage reference object : FRBGRNT_CATEGORY
     * 
     */
    @JsonProperty("criteria.category")
    public void setCriteriaCategory(String criteriaCategory) {
        this.criteriaCategory = criteriaCategory;
    }

    public GrantMaintenanceMain100PutRequest withCriteriaCategory(String criteriaCategory) {
        this.criteriaCategory = criteriaCategory;
        return this;
    }

    /**
     * Country Code
     * <p>
     * 
     * 
     */
    @JsonProperty("ctryCodePhone")
    public String getCtryCodePhone() {
        return ctryCodePhone;
    }

    /**
     * Country Code
     * <p>
     * 
     * 
     */
    @JsonProperty("ctryCodePhone")
    public void setCtryCodePhone(String ctryCodePhone) {
        this.ctryCodePhone = ctryCodePhone;
    }

    public GrantMaintenanceMain100PutRequest withCtryCodePhone(String ctryCodePhone) {
        this.ctryCodePhone = ctryCodePhone;
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

    public GrantMaintenanceMain100PutRequest withPropCode(String propCode) {
        this.propCode = propCode;
        return this;
    }

    /**
     * Grant
     * <p>
     * Lineage reference object : displayFrbgrntCode
     * 
     */
    @JsonProperty("displayFrbgrntCode")
    public String getDisplayFrbgrntCode() {
        return displayFrbgrntCode;
    }

    /**
     * Grant
     * <p>
     * Lineage reference object : displayFrbgrntCode
     * 
     */
    @JsonProperty("displayFrbgrntCode")
    public void setDisplayFrbgrntCode(String displayFrbgrntCode) {
        this.displayFrbgrntCode = displayFrbgrntCode;
    }

    public GrantMaintenanceMain100PutRequest withDisplayFrbgrntCode(String displayFrbgrntCode) {
        this.displayFrbgrntCode = displayFrbgrntCode;
        return this;
    }

    /**
     * Proposal
     * <p>
     * Lineage reference object : displayPropCode
     * 
     */
    @JsonProperty("displayPropCode")
    public String getDisplayPropCode() {
        return displayPropCode;
    }

    /**
     * Proposal
     * <p>
     * Lineage reference object : displayPropCode
     * 
     */
    @JsonProperty("displayPropCode")
    public void setDisplayPropCode(String displayPropCode) {
        this.displayPropCode = displayPropCode;
    }

    public GrantMaintenanceMain100PutRequest withDisplayPropCode(String displayPropCode) {
        this.displayPropCode = displayPropCode;
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

    public GrantMaintenanceMain100PutRequest withProjectStartDate(Date projectStartDate) {
        this.projectStartDate = projectStartDate;
        return this;
    }

    /**
     * Pass Through Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.displayPassThruInd")
    public String getCriteriaDisplayPassThruInd() {
        return criteriaDisplayPassThruInd;
    }

    /**
     * Pass Through Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.displayPassThruInd")
    public void setCriteriaDisplayPassThruInd(String criteriaDisplayPassThruInd) {
        this.criteriaDisplayPassThruInd = criteriaDisplayPassThruInd;
    }

    public GrantMaintenanceMain100PutRequest withCriteriaDisplayPassThruInd(String criteriaDisplayPassThruInd) {
        this.criteriaDisplayPassThruInd = criteriaDisplayPassThruInd;
        return this;
    }

    /**
     * Requires Effort Certification
     * <p>
     * Lineage reference object : FRBGRNT_EFF_CERT_REQUIRED_IND
     * 
     */
    @JsonProperty("criteria.effCertRequiredInd")
    public String getCriteriaEffCertRequiredInd() {
        return criteriaEffCertRequiredInd;
    }

    /**
     * Requires Effort Certification
     * <p>
     * Lineage reference object : FRBGRNT_EFF_CERT_REQUIRED_IND
     * 
     */
    @JsonProperty("criteria.effCertRequiredInd")
    public void setCriteriaEffCertRequiredInd(String criteriaEffCertRequiredInd) {
        this.criteriaEffCertRequiredInd = criteriaEffCertRequiredInd;
    }

    public GrantMaintenanceMain100PutRequest withCriteriaEffCertRequiredInd(String criteriaEffCertRequiredInd) {
        this.criteriaEffCertRequiredInd = criteriaEffCertRequiredInd;
        return this;
    }

    /**
     * Responsible Organization
     * <p>
     * Lineage reference object : FRBGRNT_ORGN_CODE_RESP_OFFICE
     * (Required)
     * 
     */
    @JsonProperty("criteria.orgnCodeRespOffice")
    public String getCriteriaOrgnCodeRespOffice() {
        return criteriaOrgnCodeRespOffice;
    }

    /**
     * Responsible Organization
     * <p>
     * Lineage reference object : FRBGRNT_ORGN_CODE_RESP_OFFICE
     * (Required)
     * 
     */
    @JsonProperty("criteria.orgnCodeRespOffice")
    public void setCriteriaOrgnCodeRespOffice(String criteriaOrgnCodeRespOffice) {
        this.criteriaOrgnCodeRespOffice = criteriaOrgnCodeRespOffice;
    }

    public GrantMaintenanceMain100PutRequest withCriteriaOrgnCodeRespOffice(String criteriaOrgnCodeRespOffice) {
        this.criteriaOrgnCodeRespOffice = criteriaOrgnCodeRespOffice;
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

    public GrantMaintenanceMain100PutRequest withBasiCodeIc(String basiCodeIc) {
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

    public GrantMaintenanceMain100PutRequest withAgencyEmail(String agencyEmail) {
        this.agencyEmail = agencyEmail;
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

    public GrantMaintenanceMain100PutRequest withAgencyContact(String agencyContact) {
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

    public GrantMaintenanceMain100PutRequest withInddCodeDistr(String inddCodeDistr) {
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

    public GrantMaintenanceMain100PutRequest withIdcEncInd(String idcEncInd) {
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

    public GrantMaintenanceMain100PutRequest withIndrCodeRate(String indrCodeRate) {
        this.indrCodeRate = indrCodeRate;
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

    public GrantMaintenanceMain100PutRequest withExpendEndDate(Date expendEndDate) {
        this.expendEndDate = expendEndDate;
        return this;
    }

    /**
     * Project End Date
     * <p>
     * Lineage reference object : FRBGRNT_PROJECT_END_DATE
     * 
     */
    @JsonProperty("criteria.projectEndDate")
    public Date getCriteriaProjectEndDate() {
        return criteriaProjectEndDate;
    }

    /**
     * Project End Date
     * <p>
     * Lineage reference object : FRBGRNT_PROJECT_END_DATE
     * 
     */
    @JsonProperty("criteria.projectEndDate")
    public void setCriteriaProjectEndDate(Date criteriaProjectEndDate) {
        this.criteriaProjectEndDate = criteriaProjectEndDate;
    }

    public GrantMaintenanceMain100PutRequest withCriteriaProjectEndDate(Date criteriaProjectEndDate) {
        this.criteriaProjectEndDate = criteriaProjectEndDate;
        return this;
    }

    /**
     * Project Start Date
     * <p>
     * Lineage reference object : FRBGRNT_PROJECT_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.projectStartDate")
    public Date getCriteriaProjectStartDate() {
        return criteriaProjectStartDate;
    }

    /**
     * Project Start Date
     * <p>
     * Lineage reference object : FRBGRNT_PROJECT_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.projectStartDate")
    public void setCriteriaProjectStartDate(Date criteriaProjectStartDate) {
        this.criteriaProjectStartDate = criteriaProjectStartDate;
    }

    public GrantMaintenanceMain100PutRequest withCriteriaProjectStartDate(Date criteriaProjectStartDate) {
        this.criteriaProjectStartDate = criteriaProjectStartDate;
        return this;
    }

    /**
     * Related Grant
     * <p>
     * Lineage reference object : FRBGRNT_GRNT_CODE_RELATED
     * 
     */
    @JsonProperty("criteria.grntCodeRelated")
    public String getCriteriaGrntCodeRelated() {
        return criteriaGrntCodeRelated;
    }

    /**
     * Related Grant
     * <p>
     * Lineage reference object : FRBGRNT_GRNT_CODE_RELATED
     * 
     */
    @JsonProperty("criteria.grntCodeRelated")
    public void setCriteriaGrntCodeRelated(String criteriaGrntCodeRelated) {
        this.criteriaGrntCodeRelated = criteriaGrntCodeRelated;
    }

    public GrantMaintenanceMain100PutRequest withCriteriaGrntCodeRelated(String criteriaGrntCodeRelated) {
        this.criteriaGrntCodeRelated = criteriaGrntCodeRelated;
        return this;
    }

    /**
     * Maximum Amount
     * <p>
     * Lineage reference object : FRBGRNT_MAX_FUNDING_AMT
     * 
     */
    @JsonProperty("criteria.maxFundingAmt")
    public Double getCriteriaMaxFundingAmt() {
        return criteriaMaxFundingAmt;
    }

    /**
     * Maximum Amount
     * <p>
     * Lineage reference object : FRBGRNT_MAX_FUNDING_AMT
     * 
     */
    @JsonProperty("criteria.maxFundingAmt")
    public void setCriteriaMaxFundingAmt(Double criteriaMaxFundingAmt) {
        this.criteriaMaxFundingAmt = criteriaMaxFundingAmt;
    }

    public GrantMaintenanceMain100PutRequest withCriteriaMaxFundingAmt(Double criteriaMaxFundingAmt) {
        this.criteriaMaxFundingAmt = criteriaMaxFundingAmt;
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

    public GrantMaintenanceMain100PutRequest withCoasCodeIcCs(String coasCodeIcCs) {
        this.coasCodeIcCs = coasCodeIcCs;
        return this;
    }

    /**
     * Agency
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.agencyCode")
    public String getCriteriaAgencyCode() {
        return criteriaAgencyCode;
    }

    /**
     * Agency
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.agencyCode")
    public void setCriteriaAgencyCode(String criteriaAgencyCode) {
        this.criteriaAgencyCode = criteriaAgencyCode;
    }

    public GrantMaintenanceMain100PutRequest withCriteriaAgencyCode(String criteriaAgencyCode) {
        this.criteriaAgencyCode = criteriaAgencyCode;
        return this;
    }

    /**
     * Expenditure End Date
     * <p>
     * Lineage reference object : FRBGRNT_EXPEND_END_DATE
     * 
     */
    @JsonProperty("criteria.expendEndDate")
    public Date getCriteriaExpendEndDate() {
        return criteriaExpendEndDate;
    }

    /**
     * Expenditure End Date
     * <p>
     * Lineage reference object : FRBGRNT_EXPEND_END_DATE
     * 
     */
    @JsonProperty("criteria.expendEndDate")
    public void setCriteriaExpendEndDate(Date criteriaExpendEndDate) {
        this.criteriaExpendEndDate = criteriaExpendEndDate;
    }

    public GrantMaintenanceMain100PutRequest withCriteriaExpendEndDate(Date criteriaExpendEndDate) {
        this.criteriaExpendEndDate = criteriaExpendEndDate;
        return this;
    }

    /**
     * Status Date
     * <p>
     * Lineage reference object : FRBGRNT_STATUS_DATE
     * 
     */
    @JsonProperty("criteria.statusDate")
    public Date getCriteriaStatusDate() {
        return criteriaStatusDate;
    }

    /**
     * Status Date
     * <p>
     * Lineage reference object : FRBGRNT_STATUS_DATE
     * 
     */
    @JsonProperty("criteria.statusDate")
    public void setCriteriaStatusDate(Date criteriaStatusDate) {
        this.criteriaStatusDate = criteriaStatusDate;
    }

    public GrantMaintenanceMain100PutRequest withCriteriaStatusDate(Date criteriaStatusDate) {
        this.criteriaStatusDate = criteriaStatusDate;
        return this;
    }

    /**
     * Cumulative Amount
     * <p>
     * Lineage reference object : FRBGRNT_CUM_FUNDING_AMT
     * 
     */
    @JsonProperty("criteria.cumFundingAmt")
    public Double getCriteriaCumFundingAmt() {
        return criteriaCumFundingAmt;
    }

    /**
     * Cumulative Amount
     * <p>
     * Lineage reference object : FRBGRNT_CUM_FUNDING_AMT
     * 
     */
    @JsonProperty("criteria.cumFundingAmt")
    public void setCriteriaCumFundingAmt(Double criteriaCumFundingAmt) {
        this.criteriaCumFundingAmt = criteriaCumFundingAmt;
    }

    public GrantMaintenanceMain100PutRequest withCriteriaCumFundingAmt(Double criteriaCumFundingAmt) {
        this.criteriaCumFundingAmt = criteriaCumFundingAmt;
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

    public GrantMaintenanceMain100PutRequest withOrgnCodeRespOffice(String orgnCodeRespOffice) {
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

    public GrantMaintenanceMain100PutRequest withEffCertRequiredInd(String effCertRequiredInd) {
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

    public GrantMaintenanceMain100PutRequest withCategory(String category) {
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

    public GrantMaintenanceMain100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GrantMaintenanceMain100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("statusDate");
        sb.append('=');
        sb.append(((this.statusDate == null)?"<null>":this.statusDate));
        sb.append(',');
        sb.append("subCategory");
        sb.append('=');
        sb.append(((this.subCategory == null)?"<null>":this.subCategory));
        sb.append(',');
        sb.append("criteriaPropCode");
        sb.append('=');
        sb.append(((this.criteriaPropCode == null)?"<null>":this.criteriaPropCode));
        sb.append(',');
        sb.append("criteriaUserId");
        sb.append('=');
        sb.append(((this.criteriaUserId == null)?"<null>":this.criteriaUserId));
        sb.append(',');
        sb.append("sponsorId");
        sb.append('=');
        sb.append(((this.sponsorId == null)?"<null>":this.sponsorId));
        sb.append(',');
        sb.append("criteriaGrantType");
        sb.append('=');
        sb.append(((this.criteriaGrantType == null)?"<null>":this.criteriaGrantType));
        sb.append(',');
        sb.append("criteriaTermDate");
        sb.append('=');
        sb.append(((this.criteriaTermDate == null)?"<null>":this.criteriaTermDate));
        sb.append(',');
        sb.append("cstaCodeCharge");
        sb.append('=');
        sb.append(((this.cstaCodeCharge == null)?"<null>":this.cstaCodeCharge));
        sb.append(',');
        sb.append("criteriaLongTitle");
        sb.append('=');
        sb.append(((this.criteriaLongTitle == null)?"<null>":this.criteriaLongTitle));
        sb.append(',');
        sb.append("rcptShareTotal");
        sb.append('=');
        sb.append(((this.rcptShareTotal == null)?"<null>":this.rcptShareTotal));
        sb.append(',');
        sb.append("cstdCodeDistr");
        sb.append('=');
        sb.append(((this.cstdCodeDistr == null)?"<null>":this.cstdCodeDistr));
        sb.append(',');
        sb.append("criteriaCfdaCode");
        sb.append('=');
        sb.append(((this.criteriaCfdaCode == null)?"<null>":this.criteriaCfdaCode));
        sb.append(',');
        sb.append("cumFundingAmt");
        sb.append('=');
        sb.append(((this.cumFundingAmt == null)?"<null>":this.cumFundingAmt));
        sb.append(',');
        sb.append("currentFundingAmt");
        sb.append('=');
        sb.append(((this.currentFundingAmt == null)?"<null>":this.currentFundingAmt));
        sb.append(',');
        sb.append("grntCodeRelated");
        sb.append('=');
        sb.append(((this.grntCodeRelated == null)?"<null>":this.grntCodeRelated));
        sb.append(',');
        sb.append("criteriaCoasCode");
        sb.append('=');
        sb.append(((this.criteriaCoasCode == null)?"<null>":this.criteriaCoasCode));
        sb.append(',');
        sb.append("agencyAddrCode");
        sb.append('=');
        sb.append(((this.agencyAddrCode == null)?"<null>":this.agencyAddrCode));
        sb.append(',');
        sb.append("criteriaSubCategory");
        sb.append('=');
        sb.append(((this.criteriaSubCategory == null)?"<null>":this.criteriaSubCategory));
        sb.append(',');
        sb.append("piIdCode");
        sb.append('=');
        sb.append(((this.piIdCode == null)?"<null>":this.piIdCode));
        sb.append(',');
        sb.append("frbgrntCoasCode");
        sb.append('=');
        sb.append(((this.frbgrntCoasCode == null)?"<null>":this.frbgrntCoasCode));
        sb.append(',');
        sb.append("projectEndDate");
        sb.append('=');
        sb.append(((this.projectEndDate == null)?"<null>":this.projectEndDate));
        sb.append(',');
        sb.append("criteriaRcptShareTotal");
        sb.append('=');
        sb.append(((this.criteriaRcptShareTotal == null)?"<null>":this.criteriaRcptShareTotal));
        sb.append(',');
        sb.append("alternateStatusDesc");
        sb.append('=');
        sb.append(((this.alternateStatusDesc == null)?"<null>":this.alternateStatusDesc));
        sb.append(',');
        sb.append("criteriaTitle");
        sb.append('=');
        sb.append(((this.criteriaTitle == null)?"<null>":this.criteriaTitle));
        sb.append(',');
        sb.append("criteriaAlternateStatusDesc");
        sb.append('=');
        sb.append(((this.criteriaAlternateStatusDesc == null)?"<null>":this.criteriaAlternateStatusDesc));
        sb.append(',');
        sb.append("criteriaPiIdCode");
        sb.append('=');
        sb.append(((this.criteriaPiIdCode == null)?"<null>":this.criteriaPiIdCode));
        sb.append(',');
        sb.append("basiCodeCs");
        sb.append('=');
        sb.append(((this.basiCodeCs == null)?"<null>":this.basiCodeCs));
        sb.append(',');
        sb.append("criteriaSponsorId");
        sb.append('=');
        sb.append(((this.criteriaSponsorId == null)?"<null>":this.criteriaSponsorId));
        sb.append(',');
        sb.append("agencyAddrSeqNum");
        sb.append('=');
        sb.append(((this.agencyAddrSeqNum == null)?"<null>":this.agencyAddrSeqNum));
        sb.append(',');
        sb.append("criteriaCurrentFundingAmt");
        sb.append('=');
        sb.append(((this.criteriaCurrentFundingAmt == null)?"<null>":this.criteriaCurrentFundingAmt));
        sb.append(',');
        sb.append("cstrCodeRate");
        sb.append('=');
        sb.append(((this.cstrCodeRate == null)?"<null>":this.cstrCodeRate));
        sb.append(',');
        sb.append("criteriaStatusCode");
        sb.append('=');
        sb.append(((this.criteriaStatusCode == null)?"<null>":this.criteriaStatusCode));
        sb.append(',');
        sb.append("grantType");
        sb.append('=');
        sb.append(((this.grantType == null)?"<null>":this.grantType));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
        sb.append(',');
        sb.append("longTitle");
        sb.append('=');
        sb.append(((this.longTitle == null)?"<null>":this.longTitle));
        sb.append(',');
        sb.append("statusCode");
        sb.append('=');
        sb.append(((this.statusCode == null)?"<null>":this.statusCode));
        sb.append(',');
        sb.append("indaCodeCharge");
        sb.append('=');
        sb.append(((this.indaCodeCharge == null)?"<null>":this.indaCodeCharge));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("agencyTeleSeqno");
        sb.append('=');
        sb.append(((this.agencyTeleSeqno == null)?"<null>":this.agencyTeleSeqno));
        sb.append(',');
        sb.append("cfdaCode");
        sb.append('=');
        sb.append(((this.cfdaCode == null)?"<null>":this.cfdaCode));
        sb.append(',');
        sb.append("houseNumber");
        sb.append('=');
        sb.append(((this.houseNumber == null)?"<null>":this.houseNumber));
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
        sb.append("criteriaCategory");
        sb.append('=');
        sb.append(((this.criteriaCategory == null)?"<null>":this.criteriaCategory));
        sb.append(',');
        sb.append("ctryCodePhone");
        sb.append('=');
        sb.append(((this.ctryCodePhone == null)?"<null>":this.ctryCodePhone));
        sb.append(',');
        sb.append("propCode");
        sb.append('=');
        sb.append(((this.propCode == null)?"<null>":this.propCode));
        sb.append(',');
        sb.append("displayFrbgrntCode");
        sb.append('=');
        sb.append(((this.displayFrbgrntCode == null)?"<null>":this.displayFrbgrntCode));
        sb.append(',');
        sb.append("displayPropCode");
        sb.append('=');
        sb.append(((this.displayPropCode == null)?"<null>":this.displayPropCode));
        sb.append(',');
        sb.append("projectStartDate");
        sb.append('=');
        sb.append(((this.projectStartDate == null)?"<null>":this.projectStartDate));
        sb.append(',');
        sb.append("criteriaDisplayPassThruInd");
        sb.append('=');
        sb.append(((this.criteriaDisplayPassThruInd == null)?"<null>":this.criteriaDisplayPassThruInd));
        sb.append(',');
        sb.append("criteriaEffCertRequiredInd");
        sb.append('=');
        sb.append(((this.criteriaEffCertRequiredInd == null)?"<null>":this.criteriaEffCertRequiredInd));
        sb.append(',');
        sb.append("criteriaOrgnCodeRespOffice");
        sb.append('=');
        sb.append(((this.criteriaOrgnCodeRespOffice == null)?"<null>":this.criteriaOrgnCodeRespOffice));
        sb.append(',');
        sb.append("basiCodeIc");
        sb.append('=');
        sb.append(((this.basiCodeIc == null)?"<null>":this.basiCodeIc));
        sb.append(',');
        sb.append("agencyEmail");
        sb.append('=');
        sb.append(((this.agencyEmail == null)?"<null>":this.agencyEmail));
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
        sb.append("expendEndDate");
        sb.append('=');
        sb.append(((this.expendEndDate == null)?"<null>":this.expendEndDate));
        sb.append(',');
        sb.append("criteriaProjectEndDate");
        sb.append('=');
        sb.append(((this.criteriaProjectEndDate == null)?"<null>":this.criteriaProjectEndDate));
        sb.append(',');
        sb.append("criteriaProjectStartDate");
        sb.append('=');
        sb.append(((this.criteriaProjectStartDate == null)?"<null>":this.criteriaProjectStartDate));
        sb.append(',');
        sb.append("criteriaGrntCodeRelated");
        sb.append('=');
        sb.append(((this.criteriaGrntCodeRelated == null)?"<null>":this.criteriaGrntCodeRelated));
        sb.append(',');
        sb.append("criteriaMaxFundingAmt");
        sb.append('=');
        sb.append(((this.criteriaMaxFundingAmt == null)?"<null>":this.criteriaMaxFundingAmt));
        sb.append(',');
        sb.append("coasCodeIcCs");
        sb.append('=');
        sb.append(((this.coasCodeIcCs == null)?"<null>":this.coasCodeIcCs));
        sb.append(',');
        sb.append("criteriaAgencyCode");
        sb.append('=');
        sb.append(((this.criteriaAgencyCode == null)?"<null>":this.criteriaAgencyCode));
        sb.append(',');
        sb.append("criteriaExpendEndDate");
        sb.append('=');
        sb.append(((this.criteriaExpendEndDate == null)?"<null>":this.criteriaExpendEndDate));
        sb.append(',');
        sb.append("criteriaStatusDate");
        sb.append('=');
        sb.append(((this.criteriaStatusDate == null)?"<null>":this.criteriaStatusDate));
        sb.append(',');
        sb.append("criteriaCumFundingAmt");
        sb.append('=');
        sb.append(((this.criteriaCumFundingAmt == null)?"<null>":this.criteriaCumFundingAmt));
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
        result = ((result* 31)+((this.criteriaStatusCode == null)? 0 :this.criteriaStatusCode.hashCode()));
        result = ((result* 31)+((this.subCategory == null)? 0 :this.subCategory.hashCode()));
        result = ((result* 31)+((this.sponsorId == null)? 0 :this.sponsorId.hashCode()));
        result = ((result* 31)+((this.criteriaCoasCode == null)? 0 :this.criteriaCoasCode.hashCode()));
        result = ((result* 31)+((this.criteriaAgencyCode == null)? 0 :this.criteriaAgencyCode.hashCode()));
        result = ((result* 31)+((this.cstaCodeCharge == null)? 0 :this.cstaCodeCharge.hashCode()));
        result = ((result* 31)+((this.criteriaCumFundingAmt == null)? 0 :this.criteriaCumFundingAmt.hashCode()));
        result = ((result* 31)+((this.rcptShareTotal == null)? 0 :this.rcptShareTotal.hashCode()));
        result = ((result* 31)+((this.cstdCodeDistr == null)? 0 :this.cstdCodeDistr.hashCode()));
        result = ((result* 31)+((this.cumFundingAmt == null)? 0 :this.cumFundingAmt.hashCode()));
        result = ((result* 31)+((this.currentFundingAmt == null)? 0 :this.currentFundingAmt.hashCode()));
        result = ((result* 31)+((this.criteriaGrantType == null)? 0 :this.criteriaGrantType.hashCode()));
        result = ((result* 31)+((this.grntCodeRelated == null)? 0 :this.grntCodeRelated.hashCode()));
        result = ((result* 31)+((this.criteriaLongTitle == null)? 0 :this.criteriaLongTitle.hashCode()));
        result = ((result* 31)+((this.criteriaCfdaCode == null)? 0 :this.criteriaCfdaCode.hashCode()));
        result = ((result* 31)+((this.criteriaExpendEndDate == null)? 0 :this.criteriaExpendEndDate.hashCode()));
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.agencyAddrCode == null)? 0 :this.agencyAddrCode.hashCode()));
        result = ((result* 31)+((this.piIdCode == null)? 0 :this.piIdCode.hashCode()));
        result = ((result* 31)+((this.frbgrntCoasCode == null)? 0 :this.frbgrntCoasCode.hashCode()));
        result = ((result* 31)+((this.projectEndDate == null)? 0 :this.projectEndDate.hashCode()));
        result = ((result* 31)+((this.alternateStatusDesc == null)? 0 :this.alternateStatusDesc.hashCode()));
        result = ((result* 31)+((this.criteriaCategory == null)? 0 :this.criteriaCategory.hashCode()));
        result = ((result* 31)+((this.basiCodeCs == null)? 0 :this.basiCodeCs.hashCode()));
        result = ((result* 31)+((this.criteriaUserId == null)? 0 :this.criteriaUserId.hashCode()));
        result = ((result* 31)+((this.agencyAddrSeqNum == null)? 0 :this.agencyAddrSeqNum.hashCode()));
        result = ((result* 31)+((this.cstrCodeRate == null)? 0 :this.cstrCodeRate.hashCode()));
        result = ((result* 31)+((this.criteriaSubCategory == null)? 0 :this.criteriaSubCategory.hashCode()));
        result = ((result* 31)+((this.criteriaGrntCodeRelated == null)? 0 :this.criteriaGrntCodeRelated.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.grantType == null)? 0 :this.grantType.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.criteriaDisplayPassThruInd == null)? 0 :this.criteriaDisplayPassThruInd.hashCode()));
        result = ((result* 31)+((this.longTitle == null)? 0 :this.longTitle.hashCode()));
        result = ((result* 31)+((this.statusCode == null)? 0 :this.statusCode.hashCode()));
        result = ((result* 31)+((this.indaCodeCharge == null)? 0 :this.indaCodeCharge.hashCode()));
        result = ((result* 31)+((this.criteriaStatusDate == null)? 0 :this.criteriaStatusDate.hashCode()));
        result = ((result* 31)+((this.agencyTeleSeqno == null)? 0 :this.agencyTeleSeqno.hashCode()));
        result = ((result* 31)+((this.cfdaCode == null)? 0 :this.cfdaCode.hashCode()));
        result = ((result* 31)+((this.criteriaAlternateStatusDesc == null)? 0 :this.criteriaAlternateStatusDesc.hashCode()));
        result = ((result* 31)+((this.houseNumber == null)? 0 :this.houseNumber.hashCode()));
        result = ((result* 31)+((this.agencyCode == null)? 0 :this.agencyCode.hashCode()));
        result = ((result* 31)+((this.maxFundingAmt == null)? 0 :this.maxFundingAmt.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.ctryCodePhone == null)? 0 :this.ctryCodePhone.hashCode()));
        result = ((result* 31)+((this.propCode == null)? 0 :this.propCode.hashCode()));
        result = ((result* 31)+((this.displayFrbgrntCode == null)? 0 :this.displayFrbgrntCode.hashCode()));
        result = ((result* 31)+((this.displayPropCode == null)? 0 :this.displayPropCode.hashCode()));
        result = ((result* 31)+((this.projectStartDate == null)? 0 :this.projectStartDate.hashCode()));
        result = ((result* 31)+((this.basiCodeIc == null)? 0 :this.basiCodeIc.hashCode()));
        result = ((result* 31)+((this.criteriaProjectEndDate == null)? 0 :this.criteriaProjectEndDate.hashCode()));
        result = ((result* 31)+((this.criteriaTitle == null)? 0 :this.criteriaTitle.hashCode()));
        result = ((result* 31)+((this.criteriaCurrentFundingAmt == null)? 0 :this.criteriaCurrentFundingAmt.hashCode()));
        result = ((result* 31)+((this.criteriaProjectStartDate == null)? 0 :this.criteriaProjectStartDate.hashCode()));
        result = ((result* 31)+((this.agencyEmail == null)? 0 :this.agencyEmail.hashCode()));
        result = ((result* 31)+((this.criteriaSponsorId == null)? 0 :this.criteriaSponsorId.hashCode()));
        result = ((result* 31)+((this.agencyContact == null)? 0 :this.agencyContact.hashCode()));
        result = ((result* 31)+((this.inddCodeDistr == null)? 0 :this.inddCodeDistr.hashCode()));
        result = ((result* 31)+((this.criteriaPropCode == null)? 0 :this.criteriaPropCode.hashCode()));
        result = ((result* 31)+((this.idcEncInd == null)? 0 :this.idcEncInd.hashCode()));
        result = ((result* 31)+((this.criteriaTermDate == null)? 0 :this.criteriaTermDate.hashCode()));
        result = ((result* 31)+((this.indrCodeRate == null)? 0 :this.indrCodeRate.hashCode()));
        result = ((result* 31)+((this.criteriaMaxFundingAmt == null)? 0 :this.criteriaMaxFundingAmt.hashCode()));
        result = ((result* 31)+((this.expendEndDate == null)? 0 :this.expendEndDate.hashCode()));
        result = ((result* 31)+((this.criteriaPiIdCode == null)? 0 :this.criteriaPiIdCode.hashCode()));
        result = ((result* 31)+((this.coasCodeIcCs == null)? 0 :this.coasCodeIcCs.hashCode()));
        result = ((result* 31)+((this.orgnCodeRespOffice == null)? 0 :this.orgnCodeRespOffice.hashCode()));
        result = ((result* 31)+((this.effCertRequiredInd == null)? 0 :this.effCertRequiredInd.hashCode()));
        result = ((result* 31)+((this.criteriaEffCertRequiredInd == null)? 0 :this.criteriaEffCertRequiredInd.hashCode()));
        result = ((result* 31)+((this.criteriaOrgnCodeRespOffice == null)? 0 :this.criteriaOrgnCodeRespOffice.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        result = ((result* 31)+((this.criteriaRcptShareTotal == null)? 0 :this.criteriaRcptShareTotal.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GrantMaintenanceMain100PutRequest) == false) {
            return false;
        }
        GrantMaintenanceMain100PutRequest rhs = ((GrantMaintenanceMain100PutRequest) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.statusDate == rhs.statusDate)||((this.statusDate!= null)&&this.statusDate.equals(rhs.statusDate)))&&((this.criteriaStatusCode == rhs.criteriaStatusCode)||((this.criteriaStatusCode!= null)&&this.criteriaStatusCode.equals(rhs.criteriaStatusCode))))&&((this.subCategory == rhs.subCategory)||((this.subCategory!= null)&&this.subCategory.equals(rhs.subCategory))))&&((this.sponsorId == rhs.sponsorId)||((this.sponsorId!= null)&&this.sponsorId.equals(rhs.sponsorId))))&&((this.criteriaCoasCode == rhs.criteriaCoasCode)||((this.criteriaCoasCode!= null)&&this.criteriaCoasCode.equals(rhs.criteriaCoasCode))))&&((this.criteriaAgencyCode == rhs.criteriaAgencyCode)||((this.criteriaAgencyCode!= null)&&this.criteriaAgencyCode.equals(rhs.criteriaAgencyCode))))&&((this.cstaCodeCharge == rhs.cstaCodeCharge)||((this.cstaCodeCharge!= null)&&this.cstaCodeCharge.equals(rhs.cstaCodeCharge))))&&((this.criteriaCumFundingAmt == rhs.criteriaCumFundingAmt)||((this.criteriaCumFundingAmt!= null)&&this.criteriaCumFundingAmt.equals(rhs.criteriaCumFundingAmt))))&&((this.rcptShareTotal == rhs.rcptShareTotal)||((this.rcptShareTotal!= null)&&this.rcptShareTotal.equals(rhs.rcptShareTotal))))&&((this.cstdCodeDistr == rhs.cstdCodeDistr)||((this.cstdCodeDistr!= null)&&this.cstdCodeDistr.equals(rhs.cstdCodeDistr))))&&((this.cumFundingAmt == rhs.cumFundingAmt)||((this.cumFundingAmt!= null)&&this.cumFundingAmt.equals(rhs.cumFundingAmt))))&&((this.currentFundingAmt == rhs.currentFundingAmt)||((this.currentFundingAmt!= null)&&this.currentFundingAmt.equals(rhs.currentFundingAmt))))&&((this.criteriaGrantType == rhs.criteriaGrantType)||((this.criteriaGrantType!= null)&&this.criteriaGrantType.equals(rhs.criteriaGrantType))))&&((this.grntCodeRelated == rhs.grntCodeRelated)||((this.grntCodeRelated!= null)&&this.grntCodeRelated.equals(rhs.grntCodeRelated))))&&((this.criteriaLongTitle == rhs.criteriaLongTitle)||((this.criteriaLongTitle!= null)&&this.criteriaLongTitle.equals(rhs.criteriaLongTitle))))&&((this.criteriaCfdaCode == rhs.criteriaCfdaCode)||((this.criteriaCfdaCode!= null)&&this.criteriaCfdaCode.equals(rhs.criteriaCfdaCode))))&&((this.criteriaExpendEndDate == rhs.criteriaExpendEndDate)||((this.criteriaExpendEndDate!= null)&&this.criteriaExpendEndDate.equals(rhs.criteriaExpendEndDate))))&&((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate))))&&((this.agencyAddrCode == rhs.agencyAddrCode)||((this.agencyAddrCode!= null)&&this.agencyAddrCode.equals(rhs.agencyAddrCode))))&&((this.piIdCode == rhs.piIdCode)||((this.piIdCode!= null)&&this.piIdCode.equals(rhs.piIdCode))))&&((this.frbgrntCoasCode == rhs.frbgrntCoasCode)||((this.frbgrntCoasCode!= null)&&this.frbgrntCoasCode.equals(rhs.frbgrntCoasCode))))&&((this.projectEndDate == rhs.projectEndDate)||((this.projectEndDate!= null)&&this.projectEndDate.equals(rhs.projectEndDate))))&&((this.alternateStatusDesc == rhs.alternateStatusDesc)||((this.alternateStatusDesc!= null)&&this.alternateStatusDesc.equals(rhs.alternateStatusDesc))))&&((this.criteriaCategory == rhs.criteriaCategory)||((this.criteriaCategory!= null)&&this.criteriaCategory.equals(rhs.criteriaCategory))))&&((this.basiCodeCs == rhs.basiCodeCs)||((this.basiCodeCs!= null)&&this.basiCodeCs.equals(rhs.basiCodeCs))))&&((this.criteriaUserId == rhs.criteriaUserId)||((this.criteriaUserId!= null)&&this.criteriaUserId.equals(rhs.criteriaUserId))))&&((this.agencyAddrSeqNum == rhs.agencyAddrSeqNum)||((this.agencyAddrSeqNum!= null)&&this.agencyAddrSeqNum.equals(rhs.agencyAddrSeqNum))))&&((this.cstrCodeRate == rhs.cstrCodeRate)||((this.cstrCodeRate!= null)&&this.cstrCodeRate.equals(rhs.cstrCodeRate))))&&((this.criteriaSubCategory == rhs.criteriaSubCategory)||((this.criteriaSubCategory!= null)&&this.criteriaSubCategory.equals(rhs.criteriaSubCategory))))&&((this.criteriaGrntCodeRelated == rhs.criteriaGrntCodeRelated)||((this.criteriaGrntCodeRelated!= null)&&this.criteriaGrntCodeRelated.equals(rhs.criteriaGrntCodeRelated))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.grantType == rhs.grantType)||((this.grantType!= null)&&this.grantType.equals(rhs.grantType))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.criteriaDisplayPassThruInd == rhs.criteriaDisplayPassThruInd)||((this.criteriaDisplayPassThruInd!= null)&&this.criteriaDisplayPassThruInd.equals(rhs.criteriaDisplayPassThruInd))))&&((this.longTitle == rhs.longTitle)||((this.longTitle!= null)&&this.longTitle.equals(rhs.longTitle))))&&((this.statusCode == rhs.statusCode)||((this.statusCode!= null)&&this.statusCode.equals(rhs.statusCode))))&&((this.indaCodeCharge == rhs.indaCodeCharge)||((this.indaCodeCharge!= null)&&this.indaCodeCharge.equals(rhs.indaCodeCharge))))&&((this.criteriaStatusDate == rhs.criteriaStatusDate)||((this.criteriaStatusDate!= null)&&this.criteriaStatusDate.equals(rhs.criteriaStatusDate))))&&((this.agencyTeleSeqno == rhs.agencyTeleSeqno)||((this.agencyTeleSeqno!= null)&&this.agencyTeleSeqno.equals(rhs.agencyTeleSeqno))))&&((this.cfdaCode == rhs.cfdaCode)||((this.cfdaCode!= null)&&this.cfdaCode.equals(rhs.cfdaCode))))&&((this.criteriaAlternateStatusDesc == rhs.criteriaAlternateStatusDesc)||((this.criteriaAlternateStatusDesc!= null)&&this.criteriaAlternateStatusDesc.equals(rhs.criteriaAlternateStatusDesc))))&&((this.houseNumber == rhs.houseNumber)||((this.houseNumber!= null)&&this.houseNumber.equals(rhs.houseNumber))))&&((this.agencyCode == rhs.agencyCode)||((this.agencyCode!= null)&&this.agencyCode.equals(rhs.agencyCode))))&&((this.maxFundingAmt == rhs.maxFundingAmt)||((this.maxFundingAmt!= null)&&this.maxFundingAmt.equals(rhs.maxFundingAmt))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.ctryCodePhone == rhs.ctryCodePhone)||((this.ctryCodePhone!= null)&&this.ctryCodePhone.equals(rhs.ctryCodePhone))))&&((this.propCode == rhs.propCode)||((this.propCode!= null)&&this.propCode.equals(rhs.propCode))))&&((this.displayFrbgrntCode == rhs.displayFrbgrntCode)||((this.displayFrbgrntCode!= null)&&this.displayFrbgrntCode.equals(rhs.displayFrbgrntCode))))&&((this.displayPropCode == rhs.displayPropCode)||((this.displayPropCode!= null)&&this.displayPropCode.equals(rhs.displayPropCode))))&&((this.projectStartDate == rhs.projectStartDate)||((this.projectStartDate!= null)&&this.projectStartDate.equals(rhs.projectStartDate))))&&((this.basiCodeIc == rhs.basiCodeIc)||((this.basiCodeIc!= null)&&this.basiCodeIc.equals(rhs.basiCodeIc))))&&((this.criteriaProjectEndDate == rhs.criteriaProjectEndDate)||((this.criteriaProjectEndDate!= null)&&this.criteriaProjectEndDate.equals(rhs.criteriaProjectEndDate))))&&((this.criteriaTitle == rhs.criteriaTitle)||((this.criteriaTitle!= null)&&this.criteriaTitle.equals(rhs.criteriaTitle))))&&((this.criteriaCurrentFundingAmt == rhs.criteriaCurrentFundingAmt)||((this.criteriaCurrentFundingAmt!= null)&&this.criteriaCurrentFundingAmt.equals(rhs.criteriaCurrentFundingAmt))))&&((this.criteriaProjectStartDate == rhs.criteriaProjectStartDate)||((this.criteriaProjectStartDate!= null)&&this.criteriaProjectStartDate.equals(rhs.criteriaProjectStartDate))))&&((this.agencyEmail == rhs.agencyEmail)||((this.agencyEmail!= null)&&this.agencyEmail.equals(rhs.agencyEmail))))&&((this.criteriaSponsorId == rhs.criteriaSponsorId)||((this.criteriaSponsorId!= null)&&this.criteriaSponsorId.equals(rhs.criteriaSponsorId))))&&((this.agencyContact == rhs.agencyContact)||((this.agencyContact!= null)&&this.agencyContact.equals(rhs.agencyContact))))&&((this.inddCodeDistr == rhs.inddCodeDistr)||((this.inddCodeDistr!= null)&&this.inddCodeDistr.equals(rhs.inddCodeDistr))))&&((this.criteriaPropCode == rhs.criteriaPropCode)||((this.criteriaPropCode!= null)&&this.criteriaPropCode.equals(rhs.criteriaPropCode))))&&((this.idcEncInd == rhs.idcEncInd)||((this.idcEncInd!= null)&&this.idcEncInd.equals(rhs.idcEncInd))))&&((this.criteriaTermDate == rhs.criteriaTermDate)||((this.criteriaTermDate!= null)&&this.criteriaTermDate.equals(rhs.criteriaTermDate))))&&((this.indrCodeRate == rhs.indrCodeRate)||((this.indrCodeRate!= null)&&this.indrCodeRate.equals(rhs.indrCodeRate))))&&((this.criteriaMaxFundingAmt == rhs.criteriaMaxFundingAmt)||((this.criteriaMaxFundingAmt!= null)&&this.criteriaMaxFundingAmt.equals(rhs.criteriaMaxFundingAmt))))&&((this.expendEndDate == rhs.expendEndDate)||((this.expendEndDate!= null)&&this.expendEndDate.equals(rhs.expendEndDate))))&&((this.criteriaPiIdCode == rhs.criteriaPiIdCode)||((this.criteriaPiIdCode!= null)&&this.criteriaPiIdCode.equals(rhs.criteriaPiIdCode))))&&((this.coasCodeIcCs == rhs.coasCodeIcCs)||((this.coasCodeIcCs!= null)&&this.coasCodeIcCs.equals(rhs.coasCodeIcCs))))&&((this.orgnCodeRespOffice == rhs.orgnCodeRespOffice)||((this.orgnCodeRespOffice!= null)&&this.orgnCodeRespOffice.equals(rhs.orgnCodeRespOffice))))&&((this.effCertRequiredInd == rhs.effCertRequiredInd)||((this.effCertRequiredInd!= null)&&this.effCertRequiredInd.equals(rhs.effCertRequiredInd))))&&((this.criteriaEffCertRequiredInd == rhs.criteriaEffCertRequiredInd)||((this.criteriaEffCertRequiredInd!= null)&&this.criteriaEffCertRequiredInd.equals(rhs.criteriaEffCertRequiredInd))))&&((this.criteriaOrgnCodeRespOffice == rhs.criteriaOrgnCodeRespOffice)||((this.criteriaOrgnCodeRespOffice!= null)&&this.criteriaOrgnCodeRespOffice.equals(rhs.criteriaOrgnCodeRespOffice))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.criteriaRcptShareTotal == rhs.criteriaRcptShareTotal)||((this.criteriaRcptShareTotal!= null)&&this.criteriaRcptShareTotal.equals(rhs.criteriaRcptShareTotal))));
    }

}
