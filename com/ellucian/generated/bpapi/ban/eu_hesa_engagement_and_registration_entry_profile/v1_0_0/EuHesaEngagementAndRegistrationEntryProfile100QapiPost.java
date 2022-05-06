
package com.ellucian.generated.bpapi.ban.eu_hesa_engagement_and_registration_entry_profile.v1_0_0;

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
    "id",
    "numhus",
    "ssdtCodeAccessProg",
    "ssdtCodeParentEdu",
    "ssdtCodeApelCred",
    "ssdtCodeCountryPerm",
    "ssdtCodeCareleaver",
    "permAddrPostcode",
    "creditTowardsStudy",
    "ssdtCodePrevProv",
    "ssdtCodeCredScheme",
    "ssdtCodeRelBground",
    "ssdtCodeDependant",
    "ssdtCodeSec",
    "ssdtCodeEstranged",
    "ssdtCodeSoc2010",
    "ssdtCodeHighQual",
    "ucasSchemeCde",
    "ssdtCodeMarStatus",
    "yearLastProv",
    "userId",
    "activityDate"
})
@Generated("jsonschema2pojo")
public class EuHesaEngagementAndRegistrationEntryProfile100QapiPost {

    @JsonProperty("id")
    private String id;
    @JsonProperty("numhus")
    private String numhus;
    /**
     * Access Programme
     * <p>
     * Lineage reference object : SORENEP_SSDT_CODE_ACCESS_PROG, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeAccessProg")
    @JsonPropertyDescription("Lineage reference object : SORENEP_SSDT_CODE_ACCESS_PROG, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeAccessProg;
    /**
     * Parental Education
     * <p>
     * Lineage reference object : SORENEP_SSDT_CODE_PARENT_EDU, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeParentEdu")
    @JsonPropertyDescription("Lineage reference object : SORENEP_SSDT_CODE_PARENT_EDU, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeParentEdu;
    /**
     * APEL Credits
     * <p>
     * Lineage reference object : SORENEP_SSDT_CODE_APEL_CRED, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeApelCred")
    @JsonPropertyDescription("Lineage reference object : SORENEP_SSDT_CODE_APEL_CRED, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeApelCred;
    /**
     * Country of Permanent Address
     * <p>
     * Lineage reference object : SORENEP_SSDT_CODE_COUNTRY_PERM, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeCountryPerm")
    @JsonPropertyDescription("Lineage reference object : SORENEP_SSDT_CODE_COUNTRY_PERM, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeCountryPerm;
    /**
     * Care Leaver
     * <p>
     * Lineage reference object : SORENEP_SSDT_CODE_CARELEAVER, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeCareleaver")
    @JsonPropertyDescription("Lineage reference object : SORENEP_SSDT_CODE_CARELEAVER, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeCareleaver;
    /**
     * Postcode of Permanent Home Address
     * <p>
     * Lineage reference object : SORENEP_PERM_ADDR_POSTCODE
     * 
     */
    @JsonProperty("permAddrPostcode")
    @JsonPropertyDescription("Lineage reference object : SORENEP_PERM_ADDR_POSTCODE")
    private String permAddrPostcode;
    /**
     * Credits Points Counted Towards Study
     * <p>
     * Lineage reference object : SORENEP_CREDIT_TOWARDS_STUDY
     * 
     */
    @JsonProperty("creditTowardsStudy")
    @JsonPropertyDescription("Lineage reference object : SORENEP_CREDIT_TOWARDS_STUDY")
    private Double creditTowardsStudy;
    /**
     * Previous Provider
     * <p>
     * Lineage reference object : SORENEP_SSDT_CODE_PREV_PROV, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodePrevProv")
    @JsonPropertyDescription("Lineage reference object : SORENEP_SSDT_CODE_PREV_PROV, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodePrevProv;
    /**
     * Credit Scheme
     * <p>
     * Lineage reference object : SORENEP_SSDT_CODE_CRED_SCHEME, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeCredScheme")
    @JsonPropertyDescription("Lineage reference object : SORENEP_SSDT_CODE_CRED_SCHEME, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeCredScheme;
    /**
     * Religious Background
     * <p>
     * Lineage reference object : SORENEP_SSDT_CODE_REL_BGROUND, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeRelBground")
    @JsonPropertyDescription("Lineage reference object : SORENEP_SSDT_CODE_REL_BGROUND, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeRelBground;
    /**
     * Dependant
     * <p>
     * Lineage reference object : SORENEP_SSDT_CODE_DEPENDANT, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeDependant")
    @JsonPropertyDescription("Lineage reference object : SORENEP_SSDT_CODE_DEPENDANT, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeDependant;
    /**
     * Socio Economic Classification
     * <p>
     * Lineage reference object : SORENEP_SSDT_CODE_SEC, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeSec")
    @JsonPropertyDescription("Lineage reference object : SORENEP_SSDT_CODE_SEC, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeSec;
    /**
     * Estranged Student
     * <p>
     * Lineage reference object : SORENEP_SSDT_CODE_ESTRANGED, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeEstranged")
    @JsonPropertyDescription("Lineage reference object : SORENEP_SSDT_CODE_ESTRANGED, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeEstranged;
    /**
     * Standard Occupational Classification 2010
     * <p>
     * Lineage reference object : SORENEP_SSDT_CODE_SOC2010, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeSoc2010")
    @JsonPropertyDescription("Lineage reference object : SORENEP_SSDT_CODE_SOC2010, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeSoc2010;
    /**
     * Highest Qualification on Entry
     * <p>
     * Lineage reference object : SORENEP_SSDT_CODE_HIGH_QUAL, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeHighQual")
    @JsonPropertyDescription("Lineage reference object : SORENEP_SSDT_CODE_HIGH_QUAL, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeHighQual;
    /**
     * UCAS Scheme Code
     * <p>
     * Lineage reference object : SORENEP_UCAS_SCHEME_CDE
     * 
     */
    @JsonProperty("ucasSchemeCde")
    @JsonPropertyDescription("Lineage reference object : SORENEP_UCAS_SCHEME_CDE")
    private String ucasSchemeCde;
    /**
     * Marital Status
     * <p>
     * Lineage reference object : SORENEP_SSDT_CODE_MAR_STATUS, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeMarStatus")
    @JsonPropertyDescription("Lineage reference object : SORENEP_SSDT_CODE_MAR_STATUS, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeMarStatus;
    /**
     * Year Left Last Provider
     * <p>
     * Lineage reference object : SORENEP_YEAR_LAST_PROV
     * 
     */
    @JsonProperty("yearLastProv")
    @JsonPropertyDescription("Lineage reference object : SORENEP_YEAR_LAST_PROV")
    private Double yearLastProv;
    /**
     * Lineage reference object : SORENEP_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SORENEP_USER_ID")
    private String userId;
    /**
     * Lineage reference object : SORENEP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SORENEP_ACTIVITY_DATE")
    private Date activityDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public EuHesaEngagementAndRegistrationEntryProfile100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("numhus")
    public String getNumhus() {
        return numhus;
    }

    @JsonProperty("numhus")
    public void setNumhus(String numhus) {
        this.numhus = numhus;
    }

    public EuHesaEngagementAndRegistrationEntryProfile100QapiPost withNumhus(String numhus) {
        this.numhus = numhus;
        return this;
    }

    /**
     * Access Programme
     * <p>
     * Lineage reference object : SORENEP_SSDT_CODE_ACCESS_PROG, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeAccessProg")
    public String getSsdtCodeAccessProg() {
        return ssdtCodeAccessProg;
    }

    /**
     * Access Programme
     * <p>
     * Lineage reference object : SORENEP_SSDT_CODE_ACCESS_PROG, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeAccessProg")
    public void setSsdtCodeAccessProg(String ssdtCodeAccessProg) {
        this.ssdtCodeAccessProg = ssdtCodeAccessProg;
    }

    public EuHesaEngagementAndRegistrationEntryProfile100QapiPost withSsdtCodeAccessProg(String ssdtCodeAccessProg) {
        this.ssdtCodeAccessProg = ssdtCodeAccessProg;
        return this;
    }

    /**
     * Parental Education
     * <p>
     * Lineage reference object : SORENEP_SSDT_CODE_PARENT_EDU, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeParentEdu")
    public String getSsdtCodeParentEdu() {
        return ssdtCodeParentEdu;
    }

    /**
     * Parental Education
     * <p>
     * Lineage reference object : SORENEP_SSDT_CODE_PARENT_EDU, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeParentEdu")
    public void setSsdtCodeParentEdu(String ssdtCodeParentEdu) {
        this.ssdtCodeParentEdu = ssdtCodeParentEdu;
    }

    public EuHesaEngagementAndRegistrationEntryProfile100QapiPost withSsdtCodeParentEdu(String ssdtCodeParentEdu) {
        this.ssdtCodeParentEdu = ssdtCodeParentEdu;
        return this;
    }

    /**
     * APEL Credits
     * <p>
     * Lineage reference object : SORENEP_SSDT_CODE_APEL_CRED, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeApelCred")
    public String getSsdtCodeApelCred() {
        return ssdtCodeApelCred;
    }

    /**
     * APEL Credits
     * <p>
     * Lineage reference object : SORENEP_SSDT_CODE_APEL_CRED, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeApelCred")
    public void setSsdtCodeApelCred(String ssdtCodeApelCred) {
        this.ssdtCodeApelCred = ssdtCodeApelCred;
    }

    public EuHesaEngagementAndRegistrationEntryProfile100QapiPost withSsdtCodeApelCred(String ssdtCodeApelCred) {
        this.ssdtCodeApelCred = ssdtCodeApelCred;
        return this;
    }

    /**
     * Country of Permanent Address
     * <p>
     * Lineage reference object : SORENEP_SSDT_CODE_COUNTRY_PERM, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeCountryPerm")
    public String getSsdtCodeCountryPerm() {
        return ssdtCodeCountryPerm;
    }

    /**
     * Country of Permanent Address
     * <p>
     * Lineage reference object : SORENEP_SSDT_CODE_COUNTRY_PERM, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeCountryPerm")
    public void setSsdtCodeCountryPerm(String ssdtCodeCountryPerm) {
        this.ssdtCodeCountryPerm = ssdtCodeCountryPerm;
    }

    public EuHesaEngagementAndRegistrationEntryProfile100QapiPost withSsdtCodeCountryPerm(String ssdtCodeCountryPerm) {
        this.ssdtCodeCountryPerm = ssdtCodeCountryPerm;
        return this;
    }

    /**
     * Care Leaver
     * <p>
     * Lineage reference object : SORENEP_SSDT_CODE_CARELEAVER, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeCareleaver")
    public String getSsdtCodeCareleaver() {
        return ssdtCodeCareleaver;
    }

    /**
     * Care Leaver
     * <p>
     * Lineage reference object : SORENEP_SSDT_CODE_CARELEAVER, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeCareleaver")
    public void setSsdtCodeCareleaver(String ssdtCodeCareleaver) {
        this.ssdtCodeCareleaver = ssdtCodeCareleaver;
    }

    public EuHesaEngagementAndRegistrationEntryProfile100QapiPost withSsdtCodeCareleaver(String ssdtCodeCareleaver) {
        this.ssdtCodeCareleaver = ssdtCodeCareleaver;
        return this;
    }

    /**
     * Postcode of Permanent Home Address
     * <p>
     * Lineage reference object : SORENEP_PERM_ADDR_POSTCODE
     * 
     */
    @JsonProperty("permAddrPostcode")
    public String getPermAddrPostcode() {
        return permAddrPostcode;
    }

    /**
     * Postcode of Permanent Home Address
     * <p>
     * Lineage reference object : SORENEP_PERM_ADDR_POSTCODE
     * 
     */
    @JsonProperty("permAddrPostcode")
    public void setPermAddrPostcode(String permAddrPostcode) {
        this.permAddrPostcode = permAddrPostcode;
    }

    public EuHesaEngagementAndRegistrationEntryProfile100QapiPost withPermAddrPostcode(String permAddrPostcode) {
        this.permAddrPostcode = permAddrPostcode;
        return this;
    }

    /**
     * Credits Points Counted Towards Study
     * <p>
     * Lineage reference object : SORENEP_CREDIT_TOWARDS_STUDY
     * 
     */
    @JsonProperty("creditTowardsStudy")
    public Double getCreditTowardsStudy() {
        return creditTowardsStudy;
    }

    /**
     * Credits Points Counted Towards Study
     * <p>
     * Lineage reference object : SORENEP_CREDIT_TOWARDS_STUDY
     * 
     */
    @JsonProperty("creditTowardsStudy")
    public void setCreditTowardsStudy(Double creditTowardsStudy) {
        this.creditTowardsStudy = creditTowardsStudy;
    }

    public EuHesaEngagementAndRegistrationEntryProfile100QapiPost withCreditTowardsStudy(Double creditTowardsStudy) {
        this.creditTowardsStudy = creditTowardsStudy;
        return this;
    }

    /**
     * Previous Provider
     * <p>
     * Lineage reference object : SORENEP_SSDT_CODE_PREV_PROV, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodePrevProv")
    public String getSsdtCodePrevProv() {
        return ssdtCodePrevProv;
    }

    /**
     * Previous Provider
     * <p>
     * Lineage reference object : SORENEP_SSDT_CODE_PREV_PROV, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodePrevProv")
    public void setSsdtCodePrevProv(String ssdtCodePrevProv) {
        this.ssdtCodePrevProv = ssdtCodePrevProv;
    }

    public EuHesaEngagementAndRegistrationEntryProfile100QapiPost withSsdtCodePrevProv(String ssdtCodePrevProv) {
        this.ssdtCodePrevProv = ssdtCodePrevProv;
        return this;
    }

    /**
     * Credit Scheme
     * <p>
     * Lineage reference object : SORENEP_SSDT_CODE_CRED_SCHEME, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeCredScheme")
    public String getSsdtCodeCredScheme() {
        return ssdtCodeCredScheme;
    }

    /**
     * Credit Scheme
     * <p>
     * Lineage reference object : SORENEP_SSDT_CODE_CRED_SCHEME, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeCredScheme")
    public void setSsdtCodeCredScheme(String ssdtCodeCredScheme) {
        this.ssdtCodeCredScheme = ssdtCodeCredScheme;
    }

    public EuHesaEngagementAndRegistrationEntryProfile100QapiPost withSsdtCodeCredScheme(String ssdtCodeCredScheme) {
        this.ssdtCodeCredScheme = ssdtCodeCredScheme;
        return this;
    }

    /**
     * Religious Background
     * <p>
     * Lineage reference object : SORENEP_SSDT_CODE_REL_BGROUND, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeRelBground")
    public String getSsdtCodeRelBground() {
        return ssdtCodeRelBground;
    }

    /**
     * Religious Background
     * <p>
     * Lineage reference object : SORENEP_SSDT_CODE_REL_BGROUND, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeRelBground")
    public void setSsdtCodeRelBground(String ssdtCodeRelBground) {
        this.ssdtCodeRelBground = ssdtCodeRelBground;
    }

    public EuHesaEngagementAndRegistrationEntryProfile100QapiPost withSsdtCodeRelBground(String ssdtCodeRelBground) {
        this.ssdtCodeRelBground = ssdtCodeRelBground;
        return this;
    }

    /**
     * Dependant
     * <p>
     * Lineage reference object : SORENEP_SSDT_CODE_DEPENDANT, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeDependant")
    public String getSsdtCodeDependant() {
        return ssdtCodeDependant;
    }

    /**
     * Dependant
     * <p>
     * Lineage reference object : SORENEP_SSDT_CODE_DEPENDANT, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeDependant")
    public void setSsdtCodeDependant(String ssdtCodeDependant) {
        this.ssdtCodeDependant = ssdtCodeDependant;
    }

    public EuHesaEngagementAndRegistrationEntryProfile100QapiPost withSsdtCodeDependant(String ssdtCodeDependant) {
        this.ssdtCodeDependant = ssdtCodeDependant;
        return this;
    }

    /**
     * Socio Economic Classification
     * <p>
     * Lineage reference object : SORENEP_SSDT_CODE_SEC, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeSec")
    public String getSsdtCodeSec() {
        return ssdtCodeSec;
    }

    /**
     * Socio Economic Classification
     * <p>
     * Lineage reference object : SORENEP_SSDT_CODE_SEC, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeSec")
    public void setSsdtCodeSec(String ssdtCodeSec) {
        this.ssdtCodeSec = ssdtCodeSec;
    }

    public EuHesaEngagementAndRegistrationEntryProfile100QapiPost withSsdtCodeSec(String ssdtCodeSec) {
        this.ssdtCodeSec = ssdtCodeSec;
        return this;
    }

    /**
     * Estranged Student
     * <p>
     * Lineage reference object : SORENEP_SSDT_CODE_ESTRANGED, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeEstranged")
    public String getSsdtCodeEstranged() {
        return ssdtCodeEstranged;
    }

    /**
     * Estranged Student
     * <p>
     * Lineage reference object : SORENEP_SSDT_CODE_ESTRANGED, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeEstranged")
    public void setSsdtCodeEstranged(String ssdtCodeEstranged) {
        this.ssdtCodeEstranged = ssdtCodeEstranged;
    }

    public EuHesaEngagementAndRegistrationEntryProfile100QapiPost withSsdtCodeEstranged(String ssdtCodeEstranged) {
        this.ssdtCodeEstranged = ssdtCodeEstranged;
        return this;
    }

    /**
     * Standard Occupational Classification 2010
     * <p>
     * Lineage reference object : SORENEP_SSDT_CODE_SOC2010, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeSoc2010")
    public String getSsdtCodeSoc2010() {
        return ssdtCodeSoc2010;
    }

    /**
     * Standard Occupational Classification 2010
     * <p>
     * Lineage reference object : SORENEP_SSDT_CODE_SOC2010, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeSoc2010")
    public void setSsdtCodeSoc2010(String ssdtCodeSoc2010) {
        this.ssdtCodeSoc2010 = ssdtCodeSoc2010;
    }

    public EuHesaEngagementAndRegistrationEntryProfile100QapiPost withSsdtCodeSoc2010(String ssdtCodeSoc2010) {
        this.ssdtCodeSoc2010 = ssdtCodeSoc2010;
        return this;
    }

    /**
     * Highest Qualification on Entry
     * <p>
     * Lineage reference object : SORENEP_SSDT_CODE_HIGH_QUAL, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeHighQual")
    public String getSsdtCodeHighQual() {
        return ssdtCodeHighQual;
    }

    /**
     * Highest Qualification on Entry
     * <p>
     * Lineage reference object : SORENEP_SSDT_CODE_HIGH_QUAL, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeHighQual")
    public void setSsdtCodeHighQual(String ssdtCodeHighQual) {
        this.ssdtCodeHighQual = ssdtCodeHighQual;
    }

    public EuHesaEngagementAndRegistrationEntryProfile100QapiPost withSsdtCodeHighQual(String ssdtCodeHighQual) {
        this.ssdtCodeHighQual = ssdtCodeHighQual;
        return this;
    }

    /**
     * UCAS Scheme Code
     * <p>
     * Lineage reference object : SORENEP_UCAS_SCHEME_CDE
     * 
     */
    @JsonProperty("ucasSchemeCde")
    public String getUcasSchemeCde() {
        return ucasSchemeCde;
    }

    /**
     * UCAS Scheme Code
     * <p>
     * Lineage reference object : SORENEP_UCAS_SCHEME_CDE
     * 
     */
    @JsonProperty("ucasSchemeCde")
    public void setUcasSchemeCde(String ucasSchemeCde) {
        this.ucasSchemeCde = ucasSchemeCde;
    }

    public EuHesaEngagementAndRegistrationEntryProfile100QapiPost withUcasSchemeCde(String ucasSchemeCde) {
        this.ucasSchemeCde = ucasSchemeCde;
        return this;
    }

    /**
     * Marital Status
     * <p>
     * Lineage reference object : SORENEP_SSDT_CODE_MAR_STATUS, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeMarStatus")
    public String getSsdtCodeMarStatus() {
        return ssdtCodeMarStatus;
    }

    /**
     * Marital Status
     * <p>
     * Lineage reference object : SORENEP_SSDT_CODE_MAR_STATUS, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeMarStatus")
    public void setSsdtCodeMarStatus(String ssdtCodeMarStatus) {
        this.ssdtCodeMarStatus = ssdtCodeMarStatus;
    }

    public EuHesaEngagementAndRegistrationEntryProfile100QapiPost withSsdtCodeMarStatus(String ssdtCodeMarStatus) {
        this.ssdtCodeMarStatus = ssdtCodeMarStatus;
        return this;
    }

    /**
     * Year Left Last Provider
     * <p>
     * Lineage reference object : SORENEP_YEAR_LAST_PROV
     * 
     */
    @JsonProperty("yearLastProv")
    public Double getYearLastProv() {
        return yearLastProv;
    }

    /**
     * Year Left Last Provider
     * <p>
     * Lineage reference object : SORENEP_YEAR_LAST_PROV
     * 
     */
    @JsonProperty("yearLastProv")
    public void setYearLastProv(Double yearLastProv) {
        this.yearLastProv = yearLastProv;
    }

    public EuHesaEngagementAndRegistrationEntryProfile100QapiPost withYearLastProv(Double yearLastProv) {
        this.yearLastProv = yearLastProv;
        return this;
    }

    /**
     * Lineage reference object : SORENEP_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SORENEP_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public EuHesaEngagementAndRegistrationEntryProfile100QapiPost withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Lineage reference object : SORENEP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SORENEP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public EuHesaEngagementAndRegistrationEntryProfile100QapiPost withActivityDate(Date activityDate) {
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

    public EuHesaEngagementAndRegistrationEntryProfile100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EuHesaEngagementAndRegistrationEntryProfile100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("numhus");
        sb.append('=');
        sb.append(((this.numhus == null)?"<null>":this.numhus));
        sb.append(',');
        sb.append("ssdtCodeAccessProg");
        sb.append('=');
        sb.append(((this.ssdtCodeAccessProg == null)?"<null>":this.ssdtCodeAccessProg));
        sb.append(',');
        sb.append("ssdtCodeParentEdu");
        sb.append('=');
        sb.append(((this.ssdtCodeParentEdu == null)?"<null>":this.ssdtCodeParentEdu));
        sb.append(',');
        sb.append("ssdtCodeApelCred");
        sb.append('=');
        sb.append(((this.ssdtCodeApelCred == null)?"<null>":this.ssdtCodeApelCred));
        sb.append(',');
        sb.append("ssdtCodeCountryPerm");
        sb.append('=');
        sb.append(((this.ssdtCodeCountryPerm == null)?"<null>":this.ssdtCodeCountryPerm));
        sb.append(',');
        sb.append("ssdtCodeCareleaver");
        sb.append('=');
        sb.append(((this.ssdtCodeCareleaver == null)?"<null>":this.ssdtCodeCareleaver));
        sb.append(',');
        sb.append("permAddrPostcode");
        sb.append('=');
        sb.append(((this.permAddrPostcode == null)?"<null>":this.permAddrPostcode));
        sb.append(',');
        sb.append("creditTowardsStudy");
        sb.append('=');
        sb.append(((this.creditTowardsStudy == null)?"<null>":this.creditTowardsStudy));
        sb.append(',');
        sb.append("ssdtCodePrevProv");
        sb.append('=');
        sb.append(((this.ssdtCodePrevProv == null)?"<null>":this.ssdtCodePrevProv));
        sb.append(',');
        sb.append("ssdtCodeCredScheme");
        sb.append('=');
        sb.append(((this.ssdtCodeCredScheme == null)?"<null>":this.ssdtCodeCredScheme));
        sb.append(',');
        sb.append("ssdtCodeRelBground");
        sb.append('=');
        sb.append(((this.ssdtCodeRelBground == null)?"<null>":this.ssdtCodeRelBground));
        sb.append(',');
        sb.append("ssdtCodeDependant");
        sb.append('=');
        sb.append(((this.ssdtCodeDependant == null)?"<null>":this.ssdtCodeDependant));
        sb.append(',');
        sb.append("ssdtCodeSec");
        sb.append('=');
        sb.append(((this.ssdtCodeSec == null)?"<null>":this.ssdtCodeSec));
        sb.append(',');
        sb.append("ssdtCodeEstranged");
        sb.append('=');
        sb.append(((this.ssdtCodeEstranged == null)?"<null>":this.ssdtCodeEstranged));
        sb.append(',');
        sb.append("ssdtCodeSoc2010");
        sb.append('=');
        sb.append(((this.ssdtCodeSoc2010 == null)?"<null>":this.ssdtCodeSoc2010));
        sb.append(',');
        sb.append("ssdtCodeHighQual");
        sb.append('=');
        sb.append(((this.ssdtCodeHighQual == null)?"<null>":this.ssdtCodeHighQual));
        sb.append(',');
        sb.append("ucasSchemeCde");
        sb.append('=');
        sb.append(((this.ucasSchemeCde == null)?"<null>":this.ucasSchemeCde));
        sb.append(',');
        sb.append("ssdtCodeMarStatus");
        sb.append('=');
        sb.append(((this.ssdtCodeMarStatus == null)?"<null>":this.ssdtCodeMarStatus));
        sb.append(',');
        sb.append("yearLastProv");
        sb.append('=');
        sb.append(((this.yearLastProv == null)?"<null>":this.yearLastProv));
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
        result = ((result* 31)+((this.creditTowardsStudy == null)? 0 :this.creditTowardsStudy.hashCode()));
        result = ((result* 31)+((this.ssdtCodeDependant == null)? 0 :this.ssdtCodeDependant.hashCode()));
        result = ((result* 31)+((this.ssdtCodeApelCred == null)? 0 :this.ssdtCodeApelCred.hashCode()));
        result = ((result* 31)+((this.permAddrPostcode == null)? 0 :this.permAddrPostcode.hashCode()));
        result = ((result* 31)+((this.ssdtCodeCredScheme == null)? 0 :this.ssdtCodeCredScheme.hashCode()));
        result = ((result* 31)+((this.yearLastProv == null)? 0 :this.yearLastProv.hashCode()));
        result = ((result* 31)+((this.ssdtCodeCareleaver == null)? 0 :this.ssdtCodeCareleaver.hashCode()));
        result = ((result* 31)+((this.ssdtCodePrevProv == null)? 0 :this.ssdtCodePrevProv.hashCode()));
        result = ((result* 31)+((this.ssdtCodeAccessProg == null)? 0 :this.ssdtCodeAccessProg.hashCode()));
        result = ((result* 31)+((this.ssdtCodeParentEdu == null)? 0 :this.ssdtCodeParentEdu.hashCode()));
        result = ((result* 31)+((this.ssdtCodeSec == null)? 0 :this.ssdtCodeSec.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.ssdtCodeCountryPerm == null)? 0 :this.ssdtCodeCountryPerm.hashCode()));
        result = ((result* 31)+((this.ucasSchemeCde == null)? 0 :this.ucasSchemeCde.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.numhus == null)? 0 :this.numhus.hashCode()));
        result = ((result* 31)+((this.ssdtCodeMarStatus == null)? 0 :this.ssdtCodeMarStatus.hashCode()));
        result = ((result* 31)+((this.ssdtCodeEstranged == null)? 0 :this.ssdtCodeEstranged.hashCode()));
        result = ((result* 31)+((this.ssdtCodeSoc2010 == null)? 0 :this.ssdtCodeSoc2010 .hashCode()));
        result = ((result* 31)+((this.ssdtCodeHighQual == null)? 0 :this.ssdtCodeHighQual.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.ssdtCodeRelBground == null)? 0 :this.ssdtCodeRelBground.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EuHesaEngagementAndRegistrationEntryProfile100QapiPost) == false) {
            return false;
        }
        EuHesaEngagementAndRegistrationEntryProfile100QapiPost rhs = ((EuHesaEngagementAndRegistrationEntryProfile100QapiPost) other);
        return ((((((((((((((((((((((((this.creditTowardsStudy == rhs.creditTowardsStudy)||((this.creditTowardsStudy!= null)&&this.creditTowardsStudy.equals(rhs.creditTowardsStudy)))&&((this.ssdtCodeDependant == rhs.ssdtCodeDependant)||((this.ssdtCodeDependant!= null)&&this.ssdtCodeDependant.equals(rhs.ssdtCodeDependant))))&&((this.ssdtCodeApelCred == rhs.ssdtCodeApelCred)||((this.ssdtCodeApelCred!= null)&&this.ssdtCodeApelCred.equals(rhs.ssdtCodeApelCred))))&&((this.permAddrPostcode == rhs.permAddrPostcode)||((this.permAddrPostcode!= null)&&this.permAddrPostcode.equals(rhs.permAddrPostcode))))&&((this.ssdtCodeCredScheme == rhs.ssdtCodeCredScheme)||((this.ssdtCodeCredScheme!= null)&&this.ssdtCodeCredScheme.equals(rhs.ssdtCodeCredScheme))))&&((this.yearLastProv == rhs.yearLastProv)||((this.yearLastProv!= null)&&this.yearLastProv.equals(rhs.yearLastProv))))&&((this.ssdtCodeCareleaver == rhs.ssdtCodeCareleaver)||((this.ssdtCodeCareleaver!= null)&&this.ssdtCodeCareleaver.equals(rhs.ssdtCodeCareleaver))))&&((this.ssdtCodePrevProv == rhs.ssdtCodePrevProv)||((this.ssdtCodePrevProv!= null)&&this.ssdtCodePrevProv.equals(rhs.ssdtCodePrevProv))))&&((this.ssdtCodeAccessProg == rhs.ssdtCodeAccessProg)||((this.ssdtCodeAccessProg!= null)&&this.ssdtCodeAccessProg.equals(rhs.ssdtCodeAccessProg))))&&((this.ssdtCodeParentEdu == rhs.ssdtCodeParentEdu)||((this.ssdtCodeParentEdu!= null)&&this.ssdtCodeParentEdu.equals(rhs.ssdtCodeParentEdu))))&&((this.ssdtCodeSec == rhs.ssdtCodeSec)||((this.ssdtCodeSec!= null)&&this.ssdtCodeSec.equals(rhs.ssdtCodeSec))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.ssdtCodeCountryPerm == rhs.ssdtCodeCountryPerm)||((this.ssdtCodeCountryPerm!= null)&&this.ssdtCodeCountryPerm.equals(rhs.ssdtCodeCountryPerm))))&&((this.ucasSchemeCde == rhs.ucasSchemeCde)||((this.ucasSchemeCde!= null)&&this.ucasSchemeCde.equals(rhs.ucasSchemeCde))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.numhus == rhs.numhus)||((this.numhus!= null)&&this.numhus.equals(rhs.numhus))))&&((this.ssdtCodeMarStatus == rhs.ssdtCodeMarStatus)||((this.ssdtCodeMarStatus!= null)&&this.ssdtCodeMarStatus.equals(rhs.ssdtCodeMarStatus))))&&((this.ssdtCodeEstranged == rhs.ssdtCodeEstranged)||((this.ssdtCodeEstranged!= null)&&this.ssdtCodeEstranged.equals(rhs.ssdtCodeEstranged))))&&((this.ssdtCodeSoc2010 == rhs.ssdtCodeSoc2010)||((this.ssdtCodeSoc2010 != null)&&this.ssdtCodeSoc2010 .equals(rhs.ssdtCodeSoc2010))))&&((this.ssdtCodeHighQual == rhs.ssdtCodeHighQual)||((this.ssdtCodeHighQual!= null)&&this.ssdtCodeHighQual.equals(rhs.ssdtCodeHighQual))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.ssdtCodeRelBground == rhs.ssdtCodeRelBground)||((this.ssdtCodeRelBground!= null)&&this.ssdtCodeRelBground.equals(rhs.ssdtCodeRelBground))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
