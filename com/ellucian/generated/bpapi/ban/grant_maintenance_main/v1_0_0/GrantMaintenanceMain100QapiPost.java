
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
    "displayFrbgrntCode",
    "displayPropCode",
    "coasCode",
    "displayPassThruInd",
    "orgnCodeRespOffice",
    "alternateStatusDesc",
    "longTitle",
    "statusDate",
    "title",
    "currentFundingAmt",
    "effCertRequiredInd",
    "cumFundingAmt",
    "agencyCode",
    "maxFundingAmt",
    "piIdCode",
    "rcptShareTotal",
    "projectStartDate",
    "grntCodeRelated",
    "projectEndDate",
    "grantType",
    "propCode",
    "category",
    "termDate",
    "subCategory",
    "expendEndDate",
    "cfdaCode",
    "statusCode",
    "sponsorId",
    "agencyContact",
    "agencyEmail",
    "agencyAddrCode",
    "agencyAddrSeqNum",
    "houseNumber",
    "ctryCodePhone",
    "agencyTeleSeqno",
    "idcEncInd",
    "coasCodeIcCs",
    "basiCodeIc",
    "basiCodeCs",
    "indrCodeRate",
    "cstrCodeRate",
    "indaCodeCharge",
    "cstaCodeCharge",
    "inddCodeDistr",
    "cstdCodeDistr",
    "userId",
    "activityDate"
})
@Generated("jsonschema2pojo")
public class GrantMaintenanceMain100QapiPost {

    @JsonProperty("displayFrbgrntCode")
    private String displayFrbgrntCode;
    @JsonProperty("displayPropCode")
    private String displayPropCode;
    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FRBGRNT_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String coasCode;
    /**
     * Pass Through Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPassThruInd")
    private String displayPassThruInd;
    /**
     * Responsible Organization
     * <p>
     * Lineage reference object : FRBGRNT_ORGN_CODE_RESP_OFFICE
     * 
     */
    @JsonProperty("orgnCodeRespOffice")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_ORGN_CODE_RESP_OFFICE")
    private String orgnCodeRespOffice;
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
     * Long Title
     * <p>
     * Lineage reference object : FRBGRNT_LONG_TITLE
     * 
     */
    @JsonProperty("longTitle")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_LONG_TITLE")
    private String longTitle;
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
     * Title
     * <p>
     * Lineage reference object : FRBGRNT_TITLE
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_TITLE")
    private String title;
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
     * Requires Effort Certification
     * <p>
     * Lineage reference object : FRBGRNT_EFF_CERT_REQUIRED_IND
     * 
     */
    @JsonProperty("effCertRequiredInd")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_EFF_CERT_REQUIRED_IND")
    private String effCertRequiredInd;
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
     * Principal Investigator ID
     * <p>
     * 
     * 
     */
    @JsonProperty("piIdCode")
    private String piIdCode;
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
     * Project Start Date
     * <p>
     * Lineage reference object : FRBGRNT_PROJECT_START_DATE
     * 
     */
    @JsonProperty("projectStartDate")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_PROJECT_START_DATE")
    private Date projectStartDate;
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
     * Project End Date
     * <p>
     * Lineage reference object : FRBGRNT_PROJECT_END_DATE
     * 
     */
    @JsonProperty("projectEndDate")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_PROJECT_END_DATE")
    private Date projectEndDate;
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
     * Proposal
     * <p>
     * Lineage reference object : FRBGRNT_PROP_CODE
     * 
     */
    @JsonProperty("propCode")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_PROP_CODE")
    private String propCode;
    /**
     * Category
     * <p>
     * Lineage reference object : FRBGRNT_CATEGORY
     * 
     */
    @JsonProperty("category")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_CATEGORY")
    private String category;
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
     * Sub Category
     * <p>
     * Lineage reference object : FRBGRNT_SUB_CATEGORY
     * 
     */
    @JsonProperty("subCategory")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_SUB_CATEGORY")
    private String subCategory;
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
     * CFDA Number
     * <p>
     * 
     * 
     */
    @JsonProperty("cfdaCode")
    private String cfdaCode;
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
     * Sponsor ID
     * <p>
     * Lineage reference object : FRBGRNT_SPONSOR_ID
     * 
     */
    @JsonProperty("sponsorId")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_SPONSOR_ID")
    private String sponsorId;
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
     * Email
     * <p>
     * Lineage reference object : FRBGRNT_AGENCY_EMAIL
     * 
     */
    @JsonProperty("agencyEmail")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_AGENCY_EMAIL")
    private String agencyEmail;
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
     * Address Sequence
     * <p>
     * Lineage reference object : FRBGRNT_AGENCY_ADDR_SEQ_NUM
     * 
     */
    @JsonProperty("agencyAddrSeqNum")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_AGENCY_ADDR_SEQ_NUM")
    private Double agencyAddrSeqNum;
    @JsonProperty("houseNumber")
    private String houseNumber;
    @JsonProperty("ctryCodePhone")
    private String ctryCodePhone;
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
     * Indirect Cost Encumbering
     * <p>
     * Lineage reference object : FRBGRNT_IDC_ENC_IND
     * 
     */
    @JsonProperty("idcEncInd")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_IDC_ENC_IND")
    private String idcEncInd;
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
     * Indirect Cost Basis
     * <p>
     * Lineage reference object : FRBGRNT_BASI_CODE_IC
     * 
     */
    @JsonProperty("basiCodeIc")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_BASI_CODE_IC")
    private String basiCodeIc;
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
     * Indirect Cost Rate Code
     * <p>
     * Lineage reference object : FRBGRNT_INDR_CODE_RATE
     * 
     */
    @JsonProperty("indrCodeRate")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_INDR_CODE_RATE")
    private String indrCodeRate;
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
     * Indirect Cost Charge Account Code
     * <p>
     * Lineage reference object : FRBGRNT_INDA_CODE_CHARGE
     * 
     */
    @JsonProperty("indaCodeCharge")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_INDA_CODE_CHARGE")
    private String indaCodeCharge;
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
     * Indirect Cost Distribute To Code
     * <p>
     * Lineage reference object : FRBGRNT_INDD_CODE_DISTR
     * 
     */
    @JsonProperty("inddCodeDistr")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_INDD_CODE_DISTR")
    private String inddCodeDistr;
    /**
     * Cost Share Distribute From Code
     * <p>
     * Lineage reference object : FRBGRNT_CSTD_CODE_DISTR, Lookup lineage reference object : frbcstd,frvcstd
     * 
     */
    @JsonProperty("cstdCodeDistr")
    @JsonPropertyDescription("Lineage reference object : FRBGRNT_CSTD_CODE_DISTR, Lookup lineage reference object : frbcstd,frvcstd")
    private String cstdCodeDistr;
    @JsonProperty("userId")
    private String userId;
    @JsonProperty("activityDate")
    private String activityDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("displayFrbgrntCode")
    public String getDisplayFrbgrntCode() {
        return displayFrbgrntCode;
    }

    @JsonProperty("displayFrbgrntCode")
    public void setDisplayFrbgrntCode(String displayFrbgrntCode) {
        this.displayFrbgrntCode = displayFrbgrntCode;
    }

    public GrantMaintenanceMain100QapiPost withDisplayFrbgrntCode(String displayFrbgrntCode) {
        this.displayFrbgrntCode = displayFrbgrntCode;
        return this;
    }

    @JsonProperty("displayPropCode")
    public String getDisplayPropCode() {
        return displayPropCode;
    }

    @JsonProperty("displayPropCode")
    public void setDisplayPropCode(String displayPropCode) {
        this.displayPropCode = displayPropCode;
    }

    public GrantMaintenanceMain100QapiPost withDisplayPropCode(String displayPropCode) {
        this.displayPropCode = displayPropCode;
        return this;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FRBGRNT_COAS_CODE, Lookup lineage reference object : ftvcoas
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
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public GrantMaintenanceMain100QapiPost withCoasCode(String coasCode) {
        this.coasCode = coasCode;
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

    public GrantMaintenanceMain100QapiPost withDisplayPassThruInd(String displayPassThruInd) {
        this.displayPassThruInd = displayPassThruInd;
        return this;
    }

    /**
     * Responsible Organization
     * <p>
     * Lineage reference object : FRBGRNT_ORGN_CODE_RESP_OFFICE
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
     * 
     */
    @JsonProperty("orgnCodeRespOffice")
    public void setOrgnCodeRespOffice(String orgnCodeRespOffice) {
        this.orgnCodeRespOffice = orgnCodeRespOffice;
    }

    public GrantMaintenanceMain100QapiPost withOrgnCodeRespOffice(String orgnCodeRespOffice) {
        this.orgnCodeRespOffice = orgnCodeRespOffice;
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

    public GrantMaintenanceMain100QapiPost withAlternateStatusDesc(String alternateStatusDesc) {
        this.alternateStatusDesc = alternateStatusDesc;
        return this;
    }

    /**
     * Long Title
     * <p>
     * Lineage reference object : FRBGRNT_LONG_TITLE
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
     * 
     */
    @JsonProperty("longTitle")
    public void setLongTitle(String longTitle) {
        this.longTitle = longTitle;
    }

    public GrantMaintenanceMain100QapiPost withLongTitle(String longTitle) {
        this.longTitle = longTitle;
        return this;
    }

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

    public GrantMaintenanceMain100QapiPost withStatusDate(Date statusDate) {
        this.statusDate = statusDate;
        return this;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : FRBGRNT_TITLE
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
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public GrantMaintenanceMain100QapiPost withTitle(String title) {
        this.title = title;
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

    public GrantMaintenanceMain100QapiPost withCurrentFundingAmt(Double currentFundingAmt) {
        this.currentFundingAmt = currentFundingAmt;
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

    public GrantMaintenanceMain100QapiPost withEffCertRequiredInd(String effCertRequiredInd) {
        this.effCertRequiredInd = effCertRequiredInd;
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

    public GrantMaintenanceMain100QapiPost withCumFundingAmt(Double cumFundingAmt) {
        this.cumFundingAmt = cumFundingAmt;
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

    public GrantMaintenanceMain100QapiPost withAgencyCode(String agencyCode) {
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

    public GrantMaintenanceMain100QapiPost withMaxFundingAmt(Double maxFundingAmt) {
        this.maxFundingAmt = maxFundingAmt;
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

    public GrantMaintenanceMain100QapiPost withPiIdCode(String piIdCode) {
        this.piIdCode = piIdCode;
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

    public GrantMaintenanceMain100QapiPost withRcptShareTotal(Double rcptShareTotal) {
        this.rcptShareTotal = rcptShareTotal;
        return this;
    }

    /**
     * Project Start Date
     * <p>
     * Lineage reference object : FRBGRNT_PROJECT_START_DATE
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
     * 
     */
    @JsonProperty("projectStartDate")
    public void setProjectStartDate(Date projectStartDate) {
        this.projectStartDate = projectStartDate;
    }

    public GrantMaintenanceMain100QapiPost withProjectStartDate(Date projectStartDate) {
        this.projectStartDate = projectStartDate;
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

    public GrantMaintenanceMain100QapiPost withGrntCodeRelated(String grntCodeRelated) {
        this.grntCodeRelated = grntCodeRelated;
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

    public GrantMaintenanceMain100QapiPost withProjectEndDate(Date projectEndDate) {
        this.projectEndDate = projectEndDate;
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

    public GrantMaintenanceMain100QapiPost withGrantType(String grantType) {
        this.grantType = grantType;
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

    public GrantMaintenanceMain100QapiPost withPropCode(String propCode) {
        this.propCode = propCode;
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

    public GrantMaintenanceMain100QapiPost withCategory(String category) {
        this.category = category;
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

    public GrantMaintenanceMain100QapiPost withTermDate(Date termDate) {
        this.termDate = termDate;
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

    public GrantMaintenanceMain100QapiPost withSubCategory(String subCategory) {
        this.subCategory = subCategory;
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

    public GrantMaintenanceMain100QapiPost withExpendEndDate(Date expendEndDate) {
        this.expendEndDate = expendEndDate;
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

    public GrantMaintenanceMain100QapiPost withCfdaCode(String cfdaCode) {
        this.cfdaCode = cfdaCode;
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

    public GrantMaintenanceMain100QapiPost withStatusCode(String statusCode) {
        this.statusCode = statusCode;
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

    public GrantMaintenanceMain100QapiPost withSponsorId(String sponsorId) {
        this.sponsorId = sponsorId;
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

    public GrantMaintenanceMain100QapiPost withAgencyContact(String agencyContact) {
        this.agencyContact = agencyContact;
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

    public GrantMaintenanceMain100QapiPost withAgencyEmail(String agencyEmail) {
        this.agencyEmail = agencyEmail;
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

    public GrantMaintenanceMain100QapiPost withAgencyAddrCode(String agencyAddrCode) {
        this.agencyAddrCode = agencyAddrCode;
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

    public GrantMaintenanceMain100QapiPost withAgencyAddrSeqNum(Double agencyAddrSeqNum) {
        this.agencyAddrSeqNum = agencyAddrSeqNum;
        return this;
    }

    @JsonProperty("houseNumber")
    public String getHouseNumber() {
        return houseNumber;
    }

    @JsonProperty("houseNumber")
    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public GrantMaintenanceMain100QapiPost withHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
        return this;
    }

    @JsonProperty("ctryCodePhone")
    public String getCtryCodePhone() {
        return ctryCodePhone;
    }

    @JsonProperty("ctryCodePhone")
    public void setCtryCodePhone(String ctryCodePhone) {
        this.ctryCodePhone = ctryCodePhone;
    }

    public GrantMaintenanceMain100QapiPost withCtryCodePhone(String ctryCodePhone) {
        this.ctryCodePhone = ctryCodePhone;
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

    public GrantMaintenanceMain100QapiPost withAgencyTeleSeqno(Double agencyTeleSeqno) {
        this.agencyTeleSeqno = agencyTeleSeqno;
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

    public GrantMaintenanceMain100QapiPost withIdcEncInd(String idcEncInd) {
        this.idcEncInd = idcEncInd;
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

    public GrantMaintenanceMain100QapiPost withCoasCodeIcCs(String coasCodeIcCs) {
        this.coasCodeIcCs = coasCodeIcCs;
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

    public GrantMaintenanceMain100QapiPost withBasiCodeIc(String basiCodeIc) {
        this.basiCodeIc = basiCodeIc;
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

    public GrantMaintenanceMain100QapiPost withBasiCodeCs(String basiCodeCs) {
        this.basiCodeCs = basiCodeCs;
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

    public GrantMaintenanceMain100QapiPost withIndrCodeRate(String indrCodeRate) {
        this.indrCodeRate = indrCodeRate;
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

    public GrantMaintenanceMain100QapiPost withCstrCodeRate(String cstrCodeRate) {
        this.cstrCodeRate = cstrCodeRate;
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

    public GrantMaintenanceMain100QapiPost withIndaCodeCharge(String indaCodeCharge) {
        this.indaCodeCharge = indaCodeCharge;
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

    public GrantMaintenanceMain100QapiPost withCstaCodeCharge(String cstaCodeCharge) {
        this.cstaCodeCharge = cstaCodeCharge;
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

    public GrantMaintenanceMain100QapiPost withInddCodeDistr(String inddCodeDistr) {
        this.inddCodeDistr = inddCodeDistr;
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

    public GrantMaintenanceMain100QapiPost withCstdCodeDistr(String cstdCodeDistr) {
        this.cstdCodeDistr = cstdCodeDistr;
        return this;
    }

    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public GrantMaintenanceMain100QapiPost withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    @JsonProperty("activityDate")
    public String getActivityDate() {
        return activityDate;
    }

    @JsonProperty("activityDate")
    public void setActivityDate(String activityDate) {
        this.activityDate = activityDate;
    }

    public GrantMaintenanceMain100QapiPost withActivityDate(String activityDate) {
        this.activityDate = activityDate;
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

    public GrantMaintenanceMain100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GrantMaintenanceMain100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("displayFrbgrntCode");
        sb.append('=');
        sb.append(((this.displayFrbgrntCode == null)?"<null>":this.displayFrbgrntCode));
        sb.append(',');
        sb.append("displayPropCode");
        sb.append('=');
        sb.append(((this.displayPropCode == null)?"<null>":this.displayPropCode));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("displayPassThruInd");
        sb.append('=');
        sb.append(((this.displayPassThruInd == null)?"<null>":this.displayPassThruInd));
        sb.append(',');
        sb.append("orgnCodeRespOffice");
        sb.append('=');
        sb.append(((this.orgnCodeRespOffice == null)?"<null>":this.orgnCodeRespOffice));
        sb.append(',');
        sb.append("alternateStatusDesc");
        sb.append('=');
        sb.append(((this.alternateStatusDesc == null)?"<null>":this.alternateStatusDesc));
        sb.append(',');
        sb.append("longTitle");
        sb.append('=');
        sb.append(((this.longTitle == null)?"<null>":this.longTitle));
        sb.append(',');
        sb.append("statusDate");
        sb.append('=');
        sb.append(((this.statusDate == null)?"<null>":this.statusDate));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("currentFundingAmt");
        sb.append('=');
        sb.append(((this.currentFundingAmt == null)?"<null>":this.currentFundingAmt));
        sb.append(',');
        sb.append("effCertRequiredInd");
        sb.append('=');
        sb.append(((this.effCertRequiredInd == null)?"<null>":this.effCertRequiredInd));
        sb.append(',');
        sb.append("cumFundingAmt");
        sb.append('=');
        sb.append(((this.cumFundingAmt == null)?"<null>":this.cumFundingAmt));
        sb.append(',');
        sb.append("agencyCode");
        sb.append('=');
        sb.append(((this.agencyCode == null)?"<null>":this.agencyCode));
        sb.append(',');
        sb.append("maxFundingAmt");
        sb.append('=');
        sb.append(((this.maxFundingAmt == null)?"<null>":this.maxFundingAmt));
        sb.append(',');
        sb.append("piIdCode");
        sb.append('=');
        sb.append(((this.piIdCode == null)?"<null>":this.piIdCode));
        sb.append(',');
        sb.append("rcptShareTotal");
        sb.append('=');
        sb.append(((this.rcptShareTotal == null)?"<null>":this.rcptShareTotal));
        sb.append(',');
        sb.append("projectStartDate");
        sb.append('=');
        sb.append(((this.projectStartDate == null)?"<null>":this.projectStartDate));
        sb.append(',');
        sb.append("grntCodeRelated");
        sb.append('=');
        sb.append(((this.grntCodeRelated == null)?"<null>":this.grntCodeRelated));
        sb.append(',');
        sb.append("projectEndDate");
        sb.append('=');
        sb.append(((this.projectEndDate == null)?"<null>":this.projectEndDate));
        sb.append(',');
        sb.append("grantType");
        sb.append('=');
        sb.append(((this.grantType == null)?"<null>":this.grantType));
        sb.append(',');
        sb.append("propCode");
        sb.append('=');
        sb.append(((this.propCode == null)?"<null>":this.propCode));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
        sb.append(',');
        sb.append("subCategory");
        sb.append('=');
        sb.append(((this.subCategory == null)?"<null>":this.subCategory));
        sb.append(',');
        sb.append("expendEndDate");
        sb.append('=');
        sb.append(((this.expendEndDate == null)?"<null>":this.expendEndDate));
        sb.append(',');
        sb.append("cfdaCode");
        sb.append('=');
        sb.append(((this.cfdaCode == null)?"<null>":this.cfdaCode));
        sb.append(',');
        sb.append("statusCode");
        sb.append('=');
        sb.append(((this.statusCode == null)?"<null>":this.statusCode));
        sb.append(',');
        sb.append("sponsorId");
        sb.append('=');
        sb.append(((this.sponsorId == null)?"<null>":this.sponsorId));
        sb.append(',');
        sb.append("agencyContact");
        sb.append('=');
        sb.append(((this.agencyContact == null)?"<null>":this.agencyContact));
        sb.append(',');
        sb.append("agencyEmail");
        sb.append('=');
        sb.append(((this.agencyEmail == null)?"<null>":this.agencyEmail));
        sb.append(',');
        sb.append("agencyAddrCode");
        sb.append('=');
        sb.append(((this.agencyAddrCode == null)?"<null>":this.agencyAddrCode));
        sb.append(',');
        sb.append("agencyAddrSeqNum");
        sb.append('=');
        sb.append(((this.agencyAddrSeqNum == null)?"<null>":this.agencyAddrSeqNum));
        sb.append(',');
        sb.append("houseNumber");
        sb.append('=');
        sb.append(((this.houseNumber == null)?"<null>":this.houseNumber));
        sb.append(',');
        sb.append("ctryCodePhone");
        sb.append('=');
        sb.append(((this.ctryCodePhone == null)?"<null>":this.ctryCodePhone));
        sb.append(',');
        sb.append("agencyTeleSeqno");
        sb.append('=');
        sb.append(((this.agencyTeleSeqno == null)?"<null>":this.agencyTeleSeqno));
        sb.append(',');
        sb.append("idcEncInd");
        sb.append('=');
        sb.append(((this.idcEncInd == null)?"<null>":this.idcEncInd));
        sb.append(',');
        sb.append("coasCodeIcCs");
        sb.append('=');
        sb.append(((this.coasCodeIcCs == null)?"<null>":this.coasCodeIcCs));
        sb.append(',');
        sb.append("basiCodeIc");
        sb.append('=');
        sb.append(((this.basiCodeIc == null)?"<null>":this.basiCodeIc));
        sb.append(',');
        sb.append("basiCodeCs");
        sb.append('=');
        sb.append(((this.basiCodeCs == null)?"<null>":this.basiCodeCs));
        sb.append(',');
        sb.append("indrCodeRate");
        sb.append('=');
        sb.append(((this.indrCodeRate == null)?"<null>":this.indrCodeRate));
        sb.append(',');
        sb.append("cstrCodeRate");
        sb.append('=');
        sb.append(((this.cstrCodeRate == null)?"<null>":this.cstrCodeRate));
        sb.append(',');
        sb.append("indaCodeCharge");
        sb.append('=');
        sb.append(((this.indaCodeCharge == null)?"<null>":this.indaCodeCharge));
        sb.append(',');
        sb.append("cstaCodeCharge");
        sb.append('=');
        sb.append(((this.cstaCodeCharge == null)?"<null>":this.cstaCodeCharge));
        sb.append(',');
        sb.append("inddCodeDistr");
        sb.append('=');
        sb.append(((this.inddCodeDistr == null)?"<null>":this.inddCodeDistr));
        sb.append(',');
        sb.append("cstdCodeDistr");
        sb.append('=');
        sb.append(((this.cstdCodeDistr == null)?"<null>":this.cstdCodeDistr));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
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
        result = ((result* 31)+((this.subCategory == null)? 0 :this.subCategory.hashCode()));
        result = ((result* 31)+((this.sponsorId == null)? 0 :this.sponsorId.hashCode()));
        result = ((result* 31)+((this.cstaCodeCharge == null)? 0 :this.cstaCodeCharge.hashCode()));
        result = ((result* 31)+((this.rcptShareTotal == null)? 0 :this.rcptShareTotal.hashCode()));
        result = ((result* 31)+((this.cstdCodeDistr == null)? 0 :this.cstdCodeDistr.hashCode()));
        result = ((result* 31)+((this.cumFundingAmt == null)? 0 :this.cumFundingAmt.hashCode()));
        result = ((result* 31)+((this.currentFundingAmt == null)? 0 :this.currentFundingAmt.hashCode()));
        result = ((result* 31)+((this.grntCodeRelated == null)? 0 :this.grntCodeRelated.hashCode()));
        result = ((result* 31)+((this.agencyAddrCode == null)? 0 :this.agencyAddrCode.hashCode()));
        result = ((result* 31)+((this.piIdCode == null)? 0 :this.piIdCode.hashCode()));
        result = ((result* 31)+((this.projectEndDate == null)? 0 :this.projectEndDate.hashCode()));
        result = ((result* 31)+((this.alternateStatusDesc == null)? 0 :this.alternateStatusDesc.hashCode()));
        result = ((result* 31)+((this.basiCodeCs == null)? 0 :this.basiCodeCs.hashCode()));
        result = ((result* 31)+((this.agencyAddrSeqNum == null)? 0 :this.agencyAddrSeqNum.hashCode()));
        result = ((result* 31)+((this.cstrCodeRate == null)? 0 :this.cstrCodeRate.hashCode()));
        result = ((result* 31)+((this.displayPassThruInd == null)? 0 :this.displayPassThruInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.grantType == null)? 0 :this.grantType.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.longTitle == null)? 0 :this.longTitle.hashCode()));
        result = ((result* 31)+((this.statusCode == null)? 0 :this.statusCode.hashCode()));
        result = ((result* 31)+((this.indaCodeCharge == null)? 0 :this.indaCodeCharge.hashCode()));
        result = ((result* 31)+((this.agencyTeleSeqno == null)? 0 :this.agencyTeleSeqno.hashCode()));
        result = ((result* 31)+((this.cfdaCode == null)? 0 :this.cfdaCode.hashCode()));
        result = ((result* 31)+((this.houseNumber == null)? 0 :this.houseNumber.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.agencyCode == null)? 0 :this.agencyCode.hashCode()));
        result = ((result* 31)+((this.maxFundingAmt == null)? 0 :this.maxFundingAmt.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.ctryCodePhone == null)? 0 :this.ctryCodePhone.hashCode()));
        result = ((result* 31)+((this.propCode == null)? 0 :this.propCode.hashCode()));
        result = ((result* 31)+((this.displayFrbgrntCode == null)? 0 :this.displayFrbgrntCode.hashCode()));
        result = ((result* 31)+((this.displayPropCode == null)? 0 :this.displayPropCode.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.projectStartDate == null)? 0 :this.projectStartDate.hashCode()));
        result = ((result* 31)+((this.basiCodeIc == null)? 0 :this.basiCodeIc.hashCode()));
        result = ((result* 31)+((this.agencyEmail == null)? 0 :this.agencyEmail.hashCode()));
        result = ((result* 31)+((this.agencyContact == null)? 0 :this.agencyContact.hashCode()));
        result = ((result* 31)+((this.inddCodeDistr == null)? 0 :this.inddCodeDistr.hashCode()));
        result = ((result* 31)+((this.idcEncInd == null)? 0 :this.idcEncInd.hashCode()));
        result = ((result* 31)+((this.indrCodeRate == null)? 0 :this.indrCodeRate.hashCode()));
        result = ((result* 31)+((this.expendEndDate == null)? 0 :this.expendEndDate.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.coasCodeIcCs == null)? 0 :this.coasCodeIcCs.hashCode()));
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
        if ((other instanceof GrantMaintenanceMain100QapiPost) == false) {
            return false;
        }
        GrantMaintenanceMain100QapiPost rhs = ((GrantMaintenanceMain100QapiPost) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((this.statusDate == rhs.statusDate)||((this.statusDate!= null)&&this.statusDate.equals(rhs.statusDate)))&&((this.subCategory == rhs.subCategory)||((this.subCategory!= null)&&this.subCategory.equals(rhs.subCategory))))&&((this.sponsorId == rhs.sponsorId)||((this.sponsorId!= null)&&this.sponsorId.equals(rhs.sponsorId))))&&((this.cstaCodeCharge == rhs.cstaCodeCharge)||((this.cstaCodeCharge!= null)&&this.cstaCodeCharge.equals(rhs.cstaCodeCharge))))&&((this.rcptShareTotal == rhs.rcptShareTotal)||((this.rcptShareTotal!= null)&&this.rcptShareTotal.equals(rhs.rcptShareTotal))))&&((this.cstdCodeDistr == rhs.cstdCodeDistr)||((this.cstdCodeDistr!= null)&&this.cstdCodeDistr.equals(rhs.cstdCodeDistr))))&&((this.cumFundingAmt == rhs.cumFundingAmt)||((this.cumFundingAmt!= null)&&this.cumFundingAmt.equals(rhs.cumFundingAmt))))&&((this.currentFundingAmt == rhs.currentFundingAmt)||((this.currentFundingAmt!= null)&&this.currentFundingAmt.equals(rhs.currentFundingAmt))))&&((this.grntCodeRelated == rhs.grntCodeRelated)||((this.grntCodeRelated!= null)&&this.grntCodeRelated.equals(rhs.grntCodeRelated))))&&((this.agencyAddrCode == rhs.agencyAddrCode)||((this.agencyAddrCode!= null)&&this.agencyAddrCode.equals(rhs.agencyAddrCode))))&&((this.piIdCode == rhs.piIdCode)||((this.piIdCode!= null)&&this.piIdCode.equals(rhs.piIdCode))))&&((this.projectEndDate == rhs.projectEndDate)||((this.projectEndDate!= null)&&this.projectEndDate.equals(rhs.projectEndDate))))&&((this.alternateStatusDesc == rhs.alternateStatusDesc)||((this.alternateStatusDesc!= null)&&this.alternateStatusDesc.equals(rhs.alternateStatusDesc))))&&((this.basiCodeCs == rhs.basiCodeCs)||((this.basiCodeCs!= null)&&this.basiCodeCs.equals(rhs.basiCodeCs))))&&((this.agencyAddrSeqNum == rhs.agencyAddrSeqNum)||((this.agencyAddrSeqNum!= null)&&this.agencyAddrSeqNum.equals(rhs.agencyAddrSeqNum))))&&((this.cstrCodeRate == rhs.cstrCodeRate)||((this.cstrCodeRate!= null)&&this.cstrCodeRate.equals(rhs.cstrCodeRate))))&&((this.displayPassThruInd == rhs.displayPassThruInd)||((this.displayPassThruInd!= null)&&this.displayPassThruInd.equals(rhs.displayPassThruInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.grantType == rhs.grantType)||((this.grantType!= null)&&this.grantType.equals(rhs.grantType))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.longTitle == rhs.longTitle)||((this.longTitle!= null)&&this.longTitle.equals(rhs.longTitle))))&&((this.statusCode == rhs.statusCode)||((this.statusCode!= null)&&this.statusCode.equals(rhs.statusCode))))&&((this.indaCodeCharge == rhs.indaCodeCharge)||((this.indaCodeCharge!= null)&&this.indaCodeCharge.equals(rhs.indaCodeCharge))))&&((this.agencyTeleSeqno == rhs.agencyTeleSeqno)||((this.agencyTeleSeqno!= null)&&this.agencyTeleSeqno.equals(rhs.agencyTeleSeqno))))&&((this.cfdaCode == rhs.cfdaCode)||((this.cfdaCode!= null)&&this.cfdaCode.equals(rhs.cfdaCode))))&&((this.houseNumber == rhs.houseNumber)||((this.houseNumber!= null)&&this.houseNumber.equals(rhs.houseNumber))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.agencyCode == rhs.agencyCode)||((this.agencyCode!= null)&&this.agencyCode.equals(rhs.agencyCode))))&&((this.maxFundingAmt == rhs.maxFundingAmt)||((this.maxFundingAmt!= null)&&this.maxFundingAmt.equals(rhs.maxFundingAmt))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.ctryCodePhone == rhs.ctryCodePhone)||((this.ctryCodePhone!= null)&&this.ctryCodePhone.equals(rhs.ctryCodePhone))))&&((this.propCode == rhs.propCode)||((this.propCode!= null)&&this.propCode.equals(rhs.propCode))))&&((this.displayFrbgrntCode == rhs.displayFrbgrntCode)||((this.displayFrbgrntCode!= null)&&this.displayFrbgrntCode.equals(rhs.displayFrbgrntCode))))&&((this.displayPropCode == rhs.displayPropCode)||((this.displayPropCode!= null)&&this.displayPropCode.equals(rhs.displayPropCode))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.projectStartDate == rhs.projectStartDate)||((this.projectStartDate!= null)&&this.projectStartDate.equals(rhs.projectStartDate))))&&((this.basiCodeIc == rhs.basiCodeIc)||((this.basiCodeIc!= null)&&this.basiCodeIc.equals(rhs.basiCodeIc))))&&((this.agencyEmail == rhs.agencyEmail)||((this.agencyEmail!= null)&&this.agencyEmail.equals(rhs.agencyEmail))))&&((this.agencyContact == rhs.agencyContact)||((this.agencyContact!= null)&&this.agencyContact.equals(rhs.agencyContact))))&&((this.inddCodeDistr == rhs.inddCodeDistr)||((this.inddCodeDistr!= null)&&this.inddCodeDistr.equals(rhs.inddCodeDistr))))&&((this.idcEncInd == rhs.idcEncInd)||((this.idcEncInd!= null)&&this.idcEncInd.equals(rhs.idcEncInd))))&&((this.indrCodeRate == rhs.indrCodeRate)||((this.indrCodeRate!= null)&&this.indrCodeRate.equals(rhs.indrCodeRate))))&&((this.expendEndDate == rhs.expendEndDate)||((this.expendEndDate!= null)&&this.expendEndDate.equals(rhs.expendEndDate))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.coasCodeIcCs == rhs.coasCodeIcCs)||((this.coasCodeIcCs!= null)&&this.coasCodeIcCs.equals(rhs.coasCodeIcCs))))&&((this.orgnCodeRespOffice == rhs.orgnCodeRespOffice)||((this.orgnCodeRespOffice!= null)&&this.orgnCodeRespOffice.equals(rhs.orgnCodeRespOffice))))&&((this.effCertRequiredInd == rhs.effCertRequiredInd)||((this.effCertRequiredInd!= null)&&this.effCertRequiredInd.equals(rhs.effCertRequiredInd))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))));
    }

}
