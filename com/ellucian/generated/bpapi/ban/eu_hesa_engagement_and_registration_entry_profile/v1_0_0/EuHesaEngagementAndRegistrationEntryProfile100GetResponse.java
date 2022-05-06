
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
    "ssdtCodePrevProvSt",
    "creditTowardsStudy",
    "ssdtCodeDependant",
    "ssdtCodeDependantSt",
    "ssdtCodeHighQualSt",
    "ssdtCodeCredScheme",
    "ssdtCodeEstrangedSt",
    "ssdtCodeCareleaver",
    "ssdtCodePrevProv",
    "ssdtCodeAccessProg",
    "ssdtCodeSec",
    "ssdtCodeSecSt",
    "ucasSchemeCde",
    "activityDate",
    "ssdtCodeCredSchemeSt",
    "ssdtCodeMarStatusSt",
    "ssdtCodeSoc2010",
    "ssdtCodeApelCred",
    "permAddrPostcode",
    "yearLastProv",
    "ssdtCodeAccessProgSt",
    "ssdtCodeParentEduSt",
    "ssdtCodeRelBgroundSt",
    "ssdtCodeParentEdu",
    "userId",
    "ssdtCodeCountryPerm",
    "ssdtCodeCountryPermSt",
    "ssdtCodeApelCredSt",
    "ssdtCodeCareleaverSt",
    "ssdtCodeMarStatus",
    "ssdtCodeEstranged",
    "ssdtCodeHighQual",
    "ssdtCodeRelBground",
    "ssdtCodeSoc2010St"
})
@Generated("jsonschema2pojo")
public class EuHesaEngagementAndRegistrationEntryProfile100GetResponse {

    @JsonProperty("ssdtCodePrevProvSt")
    private String ssdtCodePrevProvSt;
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
     * Dependant
     * <p>
     * Lineage reference object : SORENEP_SSDT_CODE_DEPENDANT, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeDependant")
    @JsonPropertyDescription("Lineage reference object : SORENEP_SSDT_CODE_DEPENDANT, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeDependant;
    @JsonProperty("ssdtCodeDependantSt")
    private String ssdtCodeDependantSt;
    @JsonProperty("ssdtCodeHighQualSt")
    private String ssdtCodeHighQualSt;
    /**
     * Credit Scheme
     * <p>
     * Lineage reference object : SORENEP_SSDT_CODE_CRED_SCHEME, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeCredScheme")
    @JsonPropertyDescription("Lineage reference object : SORENEP_SSDT_CODE_CRED_SCHEME, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeCredScheme;
    @JsonProperty("ssdtCodeEstrangedSt")
    private String ssdtCodeEstrangedSt;
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
     * Previous Provider
     * <p>
     * Lineage reference object : SORENEP_SSDT_CODE_PREV_PROV, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodePrevProv")
    @JsonPropertyDescription("Lineage reference object : SORENEP_SSDT_CODE_PREV_PROV, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodePrevProv;
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
     * Socio Economic Classification
     * <p>
     * Lineage reference object : SORENEP_SSDT_CODE_SEC, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeSec")
    @JsonPropertyDescription("Lineage reference object : SORENEP_SSDT_CODE_SEC, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeSec;
    @JsonProperty("ssdtCodeSecSt")
    private String ssdtCodeSecSt;
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
     * Lineage reference object : SORENEP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SORENEP_ACTIVITY_DATE")
    private Date activityDate;
    @JsonProperty("ssdtCodeCredSchemeSt")
    private String ssdtCodeCredSchemeSt;
    @JsonProperty("ssdtCodeMarStatusSt")
    private String ssdtCodeMarStatusSt;
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
     * APEL Credits
     * <p>
     * Lineage reference object : SORENEP_SSDT_CODE_APEL_CRED, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeApelCred")
    @JsonPropertyDescription("Lineage reference object : SORENEP_SSDT_CODE_APEL_CRED, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeApelCred;
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
     * Year Left Last Provider
     * <p>
     * Lineage reference object : SORENEP_YEAR_LAST_PROV
     * 
     */
    @JsonProperty("yearLastProv")
    @JsonPropertyDescription("Lineage reference object : SORENEP_YEAR_LAST_PROV")
    private Double yearLastProv;
    @JsonProperty("ssdtCodeAccessProgSt")
    private String ssdtCodeAccessProgSt;
    @JsonProperty("ssdtCodeParentEduSt")
    private String ssdtCodeParentEduSt;
    @JsonProperty("ssdtCodeRelBgroundSt")
    private String ssdtCodeRelBgroundSt;
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
     * Lineage reference object : SORENEP_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SORENEP_USER_ID")
    private String userId;
    /**
     * Country of Permanent Address
     * <p>
     * Lineage reference object : SORENEP_SSDT_CODE_COUNTRY_PERM, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeCountryPerm")
    @JsonPropertyDescription("Lineage reference object : SORENEP_SSDT_CODE_COUNTRY_PERM, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeCountryPerm;
    @JsonProperty("ssdtCodeCountryPermSt")
    private String ssdtCodeCountryPermSt;
    @JsonProperty("ssdtCodeApelCredSt")
    private String ssdtCodeApelCredSt;
    @JsonProperty("ssdtCodeCareleaverSt")
    private String ssdtCodeCareleaverSt;
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
     * Estranged Student
     * <p>
     * Lineage reference object : SORENEP_SSDT_CODE_ESTRANGED, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeEstranged")
    @JsonPropertyDescription("Lineage reference object : SORENEP_SSDT_CODE_ESTRANGED, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeEstranged;
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
     * Religious Background
     * <p>
     * Lineage reference object : SORENEP_SSDT_CODE_REL_BGROUND, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeRelBground")
    @JsonPropertyDescription("Lineage reference object : SORENEP_SSDT_CODE_REL_BGROUND, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeRelBground;
    @JsonProperty("ssdtCodeSoc2010St")
    private String ssdtCodeSoc2010St;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ssdtCodePrevProvSt")
    public String getSsdtCodePrevProvSt() {
        return ssdtCodePrevProvSt;
    }

    @JsonProperty("ssdtCodePrevProvSt")
    public void setSsdtCodePrevProvSt(String ssdtCodePrevProvSt) {
        this.ssdtCodePrevProvSt = ssdtCodePrevProvSt;
    }

    public EuHesaEngagementAndRegistrationEntryProfile100GetResponse withSsdtCodePrevProvSt(String ssdtCodePrevProvSt) {
        this.ssdtCodePrevProvSt = ssdtCodePrevProvSt;
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

    public EuHesaEngagementAndRegistrationEntryProfile100GetResponse withCreditTowardsStudy(Double creditTowardsStudy) {
        this.creditTowardsStudy = creditTowardsStudy;
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

    public EuHesaEngagementAndRegistrationEntryProfile100GetResponse withSsdtCodeDependant(String ssdtCodeDependant) {
        this.ssdtCodeDependant = ssdtCodeDependant;
        return this;
    }

    @JsonProperty("ssdtCodeDependantSt")
    public String getSsdtCodeDependantSt() {
        return ssdtCodeDependantSt;
    }

    @JsonProperty("ssdtCodeDependantSt")
    public void setSsdtCodeDependantSt(String ssdtCodeDependantSt) {
        this.ssdtCodeDependantSt = ssdtCodeDependantSt;
    }

    public EuHesaEngagementAndRegistrationEntryProfile100GetResponse withSsdtCodeDependantSt(String ssdtCodeDependantSt) {
        this.ssdtCodeDependantSt = ssdtCodeDependantSt;
        return this;
    }

    @JsonProperty("ssdtCodeHighQualSt")
    public String getSsdtCodeHighQualSt() {
        return ssdtCodeHighQualSt;
    }

    @JsonProperty("ssdtCodeHighQualSt")
    public void setSsdtCodeHighQualSt(String ssdtCodeHighQualSt) {
        this.ssdtCodeHighQualSt = ssdtCodeHighQualSt;
    }

    public EuHesaEngagementAndRegistrationEntryProfile100GetResponse withSsdtCodeHighQualSt(String ssdtCodeHighQualSt) {
        this.ssdtCodeHighQualSt = ssdtCodeHighQualSt;
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

    public EuHesaEngagementAndRegistrationEntryProfile100GetResponse withSsdtCodeCredScheme(String ssdtCodeCredScheme) {
        this.ssdtCodeCredScheme = ssdtCodeCredScheme;
        return this;
    }

    @JsonProperty("ssdtCodeEstrangedSt")
    public String getSsdtCodeEstrangedSt() {
        return ssdtCodeEstrangedSt;
    }

    @JsonProperty("ssdtCodeEstrangedSt")
    public void setSsdtCodeEstrangedSt(String ssdtCodeEstrangedSt) {
        this.ssdtCodeEstrangedSt = ssdtCodeEstrangedSt;
    }

    public EuHesaEngagementAndRegistrationEntryProfile100GetResponse withSsdtCodeEstrangedSt(String ssdtCodeEstrangedSt) {
        this.ssdtCodeEstrangedSt = ssdtCodeEstrangedSt;
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

    public EuHesaEngagementAndRegistrationEntryProfile100GetResponse withSsdtCodeCareleaver(String ssdtCodeCareleaver) {
        this.ssdtCodeCareleaver = ssdtCodeCareleaver;
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

    public EuHesaEngagementAndRegistrationEntryProfile100GetResponse withSsdtCodePrevProv(String ssdtCodePrevProv) {
        this.ssdtCodePrevProv = ssdtCodePrevProv;
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

    public EuHesaEngagementAndRegistrationEntryProfile100GetResponse withSsdtCodeAccessProg(String ssdtCodeAccessProg) {
        this.ssdtCodeAccessProg = ssdtCodeAccessProg;
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

    public EuHesaEngagementAndRegistrationEntryProfile100GetResponse withSsdtCodeSec(String ssdtCodeSec) {
        this.ssdtCodeSec = ssdtCodeSec;
        return this;
    }

    @JsonProperty("ssdtCodeSecSt")
    public String getSsdtCodeSecSt() {
        return ssdtCodeSecSt;
    }

    @JsonProperty("ssdtCodeSecSt")
    public void setSsdtCodeSecSt(String ssdtCodeSecSt) {
        this.ssdtCodeSecSt = ssdtCodeSecSt;
    }

    public EuHesaEngagementAndRegistrationEntryProfile100GetResponse withSsdtCodeSecSt(String ssdtCodeSecSt) {
        this.ssdtCodeSecSt = ssdtCodeSecSt;
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

    public EuHesaEngagementAndRegistrationEntryProfile100GetResponse withUcasSchemeCde(String ucasSchemeCde) {
        this.ucasSchemeCde = ucasSchemeCde;
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

    public EuHesaEngagementAndRegistrationEntryProfile100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    @JsonProperty("ssdtCodeCredSchemeSt")
    public String getSsdtCodeCredSchemeSt() {
        return ssdtCodeCredSchemeSt;
    }

    @JsonProperty("ssdtCodeCredSchemeSt")
    public void setSsdtCodeCredSchemeSt(String ssdtCodeCredSchemeSt) {
        this.ssdtCodeCredSchemeSt = ssdtCodeCredSchemeSt;
    }

    public EuHesaEngagementAndRegistrationEntryProfile100GetResponse withSsdtCodeCredSchemeSt(String ssdtCodeCredSchemeSt) {
        this.ssdtCodeCredSchemeSt = ssdtCodeCredSchemeSt;
        return this;
    }

    @JsonProperty("ssdtCodeMarStatusSt")
    public String getSsdtCodeMarStatusSt() {
        return ssdtCodeMarStatusSt;
    }

    @JsonProperty("ssdtCodeMarStatusSt")
    public void setSsdtCodeMarStatusSt(String ssdtCodeMarStatusSt) {
        this.ssdtCodeMarStatusSt = ssdtCodeMarStatusSt;
    }

    public EuHesaEngagementAndRegistrationEntryProfile100GetResponse withSsdtCodeMarStatusSt(String ssdtCodeMarStatusSt) {
        this.ssdtCodeMarStatusSt = ssdtCodeMarStatusSt;
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

    public EuHesaEngagementAndRegistrationEntryProfile100GetResponse withSsdtCodeSoc2010(String ssdtCodeSoc2010) {
        this.ssdtCodeSoc2010 = ssdtCodeSoc2010;
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

    public EuHesaEngagementAndRegistrationEntryProfile100GetResponse withSsdtCodeApelCred(String ssdtCodeApelCred) {
        this.ssdtCodeApelCred = ssdtCodeApelCred;
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

    public EuHesaEngagementAndRegistrationEntryProfile100GetResponse withPermAddrPostcode(String permAddrPostcode) {
        this.permAddrPostcode = permAddrPostcode;
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

    public EuHesaEngagementAndRegistrationEntryProfile100GetResponse withYearLastProv(Double yearLastProv) {
        this.yearLastProv = yearLastProv;
        return this;
    }

    @JsonProperty("ssdtCodeAccessProgSt")
    public String getSsdtCodeAccessProgSt() {
        return ssdtCodeAccessProgSt;
    }

    @JsonProperty("ssdtCodeAccessProgSt")
    public void setSsdtCodeAccessProgSt(String ssdtCodeAccessProgSt) {
        this.ssdtCodeAccessProgSt = ssdtCodeAccessProgSt;
    }

    public EuHesaEngagementAndRegistrationEntryProfile100GetResponse withSsdtCodeAccessProgSt(String ssdtCodeAccessProgSt) {
        this.ssdtCodeAccessProgSt = ssdtCodeAccessProgSt;
        return this;
    }

    @JsonProperty("ssdtCodeParentEduSt")
    public String getSsdtCodeParentEduSt() {
        return ssdtCodeParentEduSt;
    }

    @JsonProperty("ssdtCodeParentEduSt")
    public void setSsdtCodeParentEduSt(String ssdtCodeParentEduSt) {
        this.ssdtCodeParentEduSt = ssdtCodeParentEduSt;
    }

    public EuHesaEngagementAndRegistrationEntryProfile100GetResponse withSsdtCodeParentEduSt(String ssdtCodeParentEduSt) {
        this.ssdtCodeParentEduSt = ssdtCodeParentEduSt;
        return this;
    }

    @JsonProperty("ssdtCodeRelBgroundSt")
    public String getSsdtCodeRelBgroundSt() {
        return ssdtCodeRelBgroundSt;
    }

    @JsonProperty("ssdtCodeRelBgroundSt")
    public void setSsdtCodeRelBgroundSt(String ssdtCodeRelBgroundSt) {
        this.ssdtCodeRelBgroundSt = ssdtCodeRelBgroundSt;
    }

    public EuHesaEngagementAndRegistrationEntryProfile100GetResponse withSsdtCodeRelBgroundSt(String ssdtCodeRelBgroundSt) {
        this.ssdtCodeRelBgroundSt = ssdtCodeRelBgroundSt;
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

    public EuHesaEngagementAndRegistrationEntryProfile100GetResponse withSsdtCodeParentEdu(String ssdtCodeParentEdu) {
        this.ssdtCodeParentEdu = ssdtCodeParentEdu;
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

    public EuHesaEngagementAndRegistrationEntryProfile100GetResponse withUserId(String userId) {
        this.userId = userId;
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

    public EuHesaEngagementAndRegistrationEntryProfile100GetResponse withSsdtCodeCountryPerm(String ssdtCodeCountryPerm) {
        this.ssdtCodeCountryPerm = ssdtCodeCountryPerm;
        return this;
    }

    @JsonProperty("ssdtCodeCountryPermSt")
    public String getSsdtCodeCountryPermSt() {
        return ssdtCodeCountryPermSt;
    }

    @JsonProperty("ssdtCodeCountryPermSt")
    public void setSsdtCodeCountryPermSt(String ssdtCodeCountryPermSt) {
        this.ssdtCodeCountryPermSt = ssdtCodeCountryPermSt;
    }

    public EuHesaEngagementAndRegistrationEntryProfile100GetResponse withSsdtCodeCountryPermSt(String ssdtCodeCountryPermSt) {
        this.ssdtCodeCountryPermSt = ssdtCodeCountryPermSt;
        return this;
    }

    @JsonProperty("ssdtCodeApelCredSt")
    public String getSsdtCodeApelCredSt() {
        return ssdtCodeApelCredSt;
    }

    @JsonProperty("ssdtCodeApelCredSt")
    public void setSsdtCodeApelCredSt(String ssdtCodeApelCredSt) {
        this.ssdtCodeApelCredSt = ssdtCodeApelCredSt;
    }

    public EuHesaEngagementAndRegistrationEntryProfile100GetResponse withSsdtCodeApelCredSt(String ssdtCodeApelCredSt) {
        this.ssdtCodeApelCredSt = ssdtCodeApelCredSt;
        return this;
    }

    @JsonProperty("ssdtCodeCareleaverSt")
    public String getSsdtCodeCareleaverSt() {
        return ssdtCodeCareleaverSt;
    }

    @JsonProperty("ssdtCodeCareleaverSt")
    public void setSsdtCodeCareleaverSt(String ssdtCodeCareleaverSt) {
        this.ssdtCodeCareleaverSt = ssdtCodeCareleaverSt;
    }

    public EuHesaEngagementAndRegistrationEntryProfile100GetResponse withSsdtCodeCareleaverSt(String ssdtCodeCareleaverSt) {
        this.ssdtCodeCareleaverSt = ssdtCodeCareleaverSt;
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

    public EuHesaEngagementAndRegistrationEntryProfile100GetResponse withSsdtCodeMarStatus(String ssdtCodeMarStatus) {
        this.ssdtCodeMarStatus = ssdtCodeMarStatus;
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

    public EuHesaEngagementAndRegistrationEntryProfile100GetResponse withSsdtCodeEstranged(String ssdtCodeEstranged) {
        this.ssdtCodeEstranged = ssdtCodeEstranged;
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

    public EuHesaEngagementAndRegistrationEntryProfile100GetResponse withSsdtCodeHighQual(String ssdtCodeHighQual) {
        this.ssdtCodeHighQual = ssdtCodeHighQual;
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

    public EuHesaEngagementAndRegistrationEntryProfile100GetResponse withSsdtCodeRelBground(String ssdtCodeRelBground) {
        this.ssdtCodeRelBground = ssdtCodeRelBground;
        return this;
    }

    @JsonProperty("ssdtCodeSoc2010St")
    public String getSsdtCodeSoc2010St() {
        return ssdtCodeSoc2010St;
    }

    @JsonProperty("ssdtCodeSoc2010St")
    public void setSsdtCodeSoc2010St(String ssdtCodeSoc2010St) {
        this.ssdtCodeSoc2010St = ssdtCodeSoc2010St;
    }

    public EuHesaEngagementAndRegistrationEntryProfile100GetResponse withSsdtCodeSoc2010St(String ssdtCodeSoc2010St) {
        this.ssdtCodeSoc2010St = ssdtCodeSoc2010St;
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

    public EuHesaEngagementAndRegistrationEntryProfile100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EuHesaEngagementAndRegistrationEntryProfile100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssdtCodePrevProvSt");
        sb.append('=');
        sb.append(((this.ssdtCodePrevProvSt == null)?"<null>":this.ssdtCodePrevProvSt));
        sb.append(',');
        sb.append("creditTowardsStudy");
        sb.append('=');
        sb.append(((this.creditTowardsStudy == null)?"<null>":this.creditTowardsStudy));
        sb.append(',');
        sb.append("ssdtCodeDependant");
        sb.append('=');
        sb.append(((this.ssdtCodeDependant == null)?"<null>":this.ssdtCodeDependant));
        sb.append(',');
        sb.append("ssdtCodeDependantSt");
        sb.append('=');
        sb.append(((this.ssdtCodeDependantSt == null)?"<null>":this.ssdtCodeDependantSt));
        sb.append(',');
        sb.append("ssdtCodeHighQualSt");
        sb.append('=');
        sb.append(((this.ssdtCodeHighQualSt == null)?"<null>":this.ssdtCodeHighQualSt));
        sb.append(',');
        sb.append("ssdtCodeCredScheme");
        sb.append('=');
        sb.append(((this.ssdtCodeCredScheme == null)?"<null>":this.ssdtCodeCredScheme));
        sb.append(',');
        sb.append("ssdtCodeEstrangedSt");
        sb.append('=');
        sb.append(((this.ssdtCodeEstrangedSt == null)?"<null>":this.ssdtCodeEstrangedSt));
        sb.append(',');
        sb.append("ssdtCodeCareleaver");
        sb.append('=');
        sb.append(((this.ssdtCodeCareleaver == null)?"<null>":this.ssdtCodeCareleaver));
        sb.append(',');
        sb.append("ssdtCodePrevProv");
        sb.append('=');
        sb.append(((this.ssdtCodePrevProv == null)?"<null>":this.ssdtCodePrevProv));
        sb.append(',');
        sb.append("ssdtCodeAccessProg");
        sb.append('=');
        sb.append(((this.ssdtCodeAccessProg == null)?"<null>":this.ssdtCodeAccessProg));
        sb.append(',');
        sb.append("ssdtCodeSec");
        sb.append('=');
        sb.append(((this.ssdtCodeSec == null)?"<null>":this.ssdtCodeSec));
        sb.append(',');
        sb.append("ssdtCodeSecSt");
        sb.append('=');
        sb.append(((this.ssdtCodeSecSt == null)?"<null>":this.ssdtCodeSecSt));
        sb.append(',');
        sb.append("ucasSchemeCde");
        sb.append('=');
        sb.append(((this.ucasSchemeCde == null)?"<null>":this.ucasSchemeCde));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("ssdtCodeCredSchemeSt");
        sb.append('=');
        sb.append(((this.ssdtCodeCredSchemeSt == null)?"<null>":this.ssdtCodeCredSchemeSt));
        sb.append(',');
        sb.append("ssdtCodeMarStatusSt");
        sb.append('=');
        sb.append(((this.ssdtCodeMarStatusSt == null)?"<null>":this.ssdtCodeMarStatusSt));
        sb.append(',');
        sb.append("ssdtCodeSoc2010");
        sb.append('=');
        sb.append(((this.ssdtCodeSoc2010 == null)?"<null>":this.ssdtCodeSoc2010));
        sb.append(',');
        sb.append("ssdtCodeApelCred");
        sb.append('=');
        sb.append(((this.ssdtCodeApelCred == null)?"<null>":this.ssdtCodeApelCred));
        sb.append(',');
        sb.append("permAddrPostcode");
        sb.append('=');
        sb.append(((this.permAddrPostcode == null)?"<null>":this.permAddrPostcode));
        sb.append(',');
        sb.append("yearLastProv");
        sb.append('=');
        sb.append(((this.yearLastProv == null)?"<null>":this.yearLastProv));
        sb.append(',');
        sb.append("ssdtCodeAccessProgSt");
        sb.append('=');
        sb.append(((this.ssdtCodeAccessProgSt == null)?"<null>":this.ssdtCodeAccessProgSt));
        sb.append(',');
        sb.append("ssdtCodeParentEduSt");
        sb.append('=');
        sb.append(((this.ssdtCodeParentEduSt == null)?"<null>":this.ssdtCodeParentEduSt));
        sb.append(',');
        sb.append("ssdtCodeRelBgroundSt");
        sb.append('=');
        sb.append(((this.ssdtCodeRelBgroundSt == null)?"<null>":this.ssdtCodeRelBgroundSt));
        sb.append(',');
        sb.append("ssdtCodeParentEdu");
        sb.append('=');
        sb.append(((this.ssdtCodeParentEdu == null)?"<null>":this.ssdtCodeParentEdu));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("ssdtCodeCountryPerm");
        sb.append('=');
        sb.append(((this.ssdtCodeCountryPerm == null)?"<null>":this.ssdtCodeCountryPerm));
        sb.append(',');
        sb.append("ssdtCodeCountryPermSt");
        sb.append('=');
        sb.append(((this.ssdtCodeCountryPermSt == null)?"<null>":this.ssdtCodeCountryPermSt));
        sb.append(',');
        sb.append("ssdtCodeApelCredSt");
        sb.append('=');
        sb.append(((this.ssdtCodeApelCredSt == null)?"<null>":this.ssdtCodeApelCredSt));
        sb.append(',');
        sb.append("ssdtCodeCareleaverSt");
        sb.append('=');
        sb.append(((this.ssdtCodeCareleaverSt == null)?"<null>":this.ssdtCodeCareleaverSt));
        sb.append(',');
        sb.append("ssdtCodeMarStatus");
        sb.append('=');
        sb.append(((this.ssdtCodeMarStatus == null)?"<null>":this.ssdtCodeMarStatus));
        sb.append(',');
        sb.append("ssdtCodeEstranged");
        sb.append('=');
        sb.append(((this.ssdtCodeEstranged == null)?"<null>":this.ssdtCodeEstranged));
        sb.append(',');
        sb.append("ssdtCodeHighQual");
        sb.append('=');
        sb.append(((this.ssdtCodeHighQual == null)?"<null>":this.ssdtCodeHighQual));
        sb.append(',');
        sb.append("ssdtCodeRelBground");
        sb.append('=');
        sb.append(((this.ssdtCodeRelBground == null)?"<null>":this.ssdtCodeRelBground));
        sb.append(',');
        sb.append("ssdtCodeSoc2010St");
        sb.append('=');
        sb.append(((this.ssdtCodeSoc2010St == null)?"<null>":this.ssdtCodeSoc2010St));
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
        result = ((result* 31)+((this.ssdtCodePrevProvSt == null)? 0 :this.ssdtCodePrevProvSt.hashCode()));
        result = ((result* 31)+((this.creditTowardsStudy == null)? 0 :this.creditTowardsStudy.hashCode()));
        result = ((result* 31)+((this.ssdtCodeDependant == null)? 0 :this.ssdtCodeDependant.hashCode()));
        result = ((result* 31)+((this.ssdtCodeDependantSt == null)? 0 :this.ssdtCodeDependantSt.hashCode()));
        result = ((result* 31)+((this.ssdtCodeHighQualSt == null)? 0 :this.ssdtCodeHighQualSt.hashCode()));
        result = ((result* 31)+((this.ssdtCodeCredScheme == null)? 0 :this.ssdtCodeCredScheme.hashCode()));
        result = ((result* 31)+((this.ssdtCodeEstrangedSt == null)? 0 :this.ssdtCodeEstrangedSt.hashCode()));
        result = ((result* 31)+((this.ssdtCodeCareleaver == null)? 0 :this.ssdtCodeCareleaver.hashCode()));
        result = ((result* 31)+((this.ssdtCodePrevProv == null)? 0 :this.ssdtCodePrevProv.hashCode()));
        result = ((result* 31)+((this.ssdtCodeAccessProg == null)? 0 :this.ssdtCodeAccessProg.hashCode()));
        result = ((result* 31)+((this.ssdtCodeSec == null)? 0 :this.ssdtCodeSec.hashCode()));
        result = ((result* 31)+((this.ssdtCodeSecSt == null)? 0 :this.ssdtCodeSecSt.hashCode()));
        result = ((result* 31)+((this.ucasSchemeCde == null)? 0 :this.ucasSchemeCde.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.ssdtCodeCredSchemeSt == null)? 0 :this.ssdtCodeCredSchemeSt.hashCode()));
        result = ((result* 31)+((this.ssdtCodeMarStatusSt == null)? 0 :this.ssdtCodeMarStatusSt.hashCode()));
        result = ((result* 31)+((this.ssdtCodeSoc2010 == null)? 0 :this.ssdtCodeSoc2010 .hashCode()));
        result = ((result* 31)+((this.ssdtCodeApelCred == null)? 0 :this.ssdtCodeApelCred.hashCode()));
        result = ((result* 31)+((this.permAddrPostcode == null)? 0 :this.permAddrPostcode.hashCode()));
        result = ((result* 31)+((this.yearLastProv == null)? 0 :this.yearLastProv.hashCode()));
        result = ((result* 31)+((this.ssdtCodeAccessProgSt == null)? 0 :this.ssdtCodeAccessProgSt.hashCode()));
        result = ((result* 31)+((this.ssdtCodeParentEduSt == null)? 0 :this.ssdtCodeParentEduSt.hashCode()));
        result = ((result* 31)+((this.ssdtCodeRelBgroundSt == null)? 0 :this.ssdtCodeRelBgroundSt.hashCode()));
        result = ((result* 31)+((this.ssdtCodeParentEdu == null)? 0 :this.ssdtCodeParentEdu.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.ssdtCodeCountryPerm == null)? 0 :this.ssdtCodeCountryPerm.hashCode()));
        result = ((result* 31)+((this.ssdtCodeCountryPermSt == null)? 0 :this.ssdtCodeCountryPermSt.hashCode()));
        result = ((result* 31)+((this.ssdtCodeApelCredSt == null)? 0 :this.ssdtCodeApelCredSt.hashCode()));
        result = ((result* 31)+((this.ssdtCodeCareleaverSt == null)? 0 :this.ssdtCodeCareleaverSt.hashCode()));
        result = ((result* 31)+((this.ssdtCodeMarStatus == null)? 0 :this.ssdtCodeMarStatus.hashCode()));
        result = ((result* 31)+((this.ssdtCodeEstranged == null)? 0 :this.ssdtCodeEstranged.hashCode()));
        result = ((result* 31)+((this.ssdtCodeHighQual == null)? 0 :this.ssdtCodeHighQual.hashCode()));
        result = ((result* 31)+((this.ssdtCodeRelBground == null)? 0 :this.ssdtCodeRelBground.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ssdtCodeSoc2010St == null)? 0 :this.ssdtCodeSoc2010St.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EuHesaEngagementAndRegistrationEntryProfile100GetResponse) == false) {
            return false;
        }
        EuHesaEngagementAndRegistrationEntryProfile100GetResponse rhs = ((EuHesaEngagementAndRegistrationEntryProfile100GetResponse) other);
        return ((((((((((((((((((((((((((((((((((((this.ssdtCodePrevProvSt == rhs.ssdtCodePrevProvSt)||((this.ssdtCodePrevProvSt!= null)&&this.ssdtCodePrevProvSt.equals(rhs.ssdtCodePrevProvSt)))&&((this.creditTowardsStudy == rhs.creditTowardsStudy)||((this.creditTowardsStudy!= null)&&this.creditTowardsStudy.equals(rhs.creditTowardsStudy))))&&((this.ssdtCodeDependant == rhs.ssdtCodeDependant)||((this.ssdtCodeDependant!= null)&&this.ssdtCodeDependant.equals(rhs.ssdtCodeDependant))))&&((this.ssdtCodeDependantSt == rhs.ssdtCodeDependantSt)||((this.ssdtCodeDependantSt!= null)&&this.ssdtCodeDependantSt.equals(rhs.ssdtCodeDependantSt))))&&((this.ssdtCodeHighQualSt == rhs.ssdtCodeHighQualSt)||((this.ssdtCodeHighQualSt!= null)&&this.ssdtCodeHighQualSt.equals(rhs.ssdtCodeHighQualSt))))&&((this.ssdtCodeCredScheme == rhs.ssdtCodeCredScheme)||((this.ssdtCodeCredScheme!= null)&&this.ssdtCodeCredScheme.equals(rhs.ssdtCodeCredScheme))))&&((this.ssdtCodeEstrangedSt == rhs.ssdtCodeEstrangedSt)||((this.ssdtCodeEstrangedSt!= null)&&this.ssdtCodeEstrangedSt.equals(rhs.ssdtCodeEstrangedSt))))&&((this.ssdtCodeCareleaver == rhs.ssdtCodeCareleaver)||((this.ssdtCodeCareleaver!= null)&&this.ssdtCodeCareleaver.equals(rhs.ssdtCodeCareleaver))))&&((this.ssdtCodePrevProv == rhs.ssdtCodePrevProv)||((this.ssdtCodePrevProv!= null)&&this.ssdtCodePrevProv.equals(rhs.ssdtCodePrevProv))))&&((this.ssdtCodeAccessProg == rhs.ssdtCodeAccessProg)||((this.ssdtCodeAccessProg!= null)&&this.ssdtCodeAccessProg.equals(rhs.ssdtCodeAccessProg))))&&((this.ssdtCodeSec == rhs.ssdtCodeSec)||((this.ssdtCodeSec!= null)&&this.ssdtCodeSec.equals(rhs.ssdtCodeSec))))&&((this.ssdtCodeSecSt == rhs.ssdtCodeSecSt)||((this.ssdtCodeSecSt!= null)&&this.ssdtCodeSecSt.equals(rhs.ssdtCodeSecSt))))&&((this.ucasSchemeCde == rhs.ucasSchemeCde)||((this.ucasSchemeCde!= null)&&this.ucasSchemeCde.equals(rhs.ucasSchemeCde))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.ssdtCodeCredSchemeSt == rhs.ssdtCodeCredSchemeSt)||((this.ssdtCodeCredSchemeSt!= null)&&this.ssdtCodeCredSchemeSt.equals(rhs.ssdtCodeCredSchemeSt))))&&((this.ssdtCodeMarStatusSt == rhs.ssdtCodeMarStatusSt)||((this.ssdtCodeMarStatusSt!= null)&&this.ssdtCodeMarStatusSt.equals(rhs.ssdtCodeMarStatusSt))))&&((this.ssdtCodeSoc2010 == rhs.ssdtCodeSoc2010)||((this.ssdtCodeSoc2010 != null)&&this.ssdtCodeSoc2010 .equals(rhs.ssdtCodeSoc2010))))&&((this.ssdtCodeApelCred == rhs.ssdtCodeApelCred)||((this.ssdtCodeApelCred!= null)&&this.ssdtCodeApelCred.equals(rhs.ssdtCodeApelCred))))&&((this.permAddrPostcode == rhs.permAddrPostcode)||((this.permAddrPostcode!= null)&&this.permAddrPostcode.equals(rhs.permAddrPostcode))))&&((this.yearLastProv == rhs.yearLastProv)||((this.yearLastProv!= null)&&this.yearLastProv.equals(rhs.yearLastProv))))&&((this.ssdtCodeAccessProgSt == rhs.ssdtCodeAccessProgSt)||((this.ssdtCodeAccessProgSt!= null)&&this.ssdtCodeAccessProgSt.equals(rhs.ssdtCodeAccessProgSt))))&&((this.ssdtCodeParentEduSt == rhs.ssdtCodeParentEduSt)||((this.ssdtCodeParentEduSt!= null)&&this.ssdtCodeParentEduSt.equals(rhs.ssdtCodeParentEduSt))))&&((this.ssdtCodeRelBgroundSt == rhs.ssdtCodeRelBgroundSt)||((this.ssdtCodeRelBgroundSt!= null)&&this.ssdtCodeRelBgroundSt.equals(rhs.ssdtCodeRelBgroundSt))))&&((this.ssdtCodeParentEdu == rhs.ssdtCodeParentEdu)||((this.ssdtCodeParentEdu!= null)&&this.ssdtCodeParentEdu.equals(rhs.ssdtCodeParentEdu))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.ssdtCodeCountryPerm == rhs.ssdtCodeCountryPerm)||((this.ssdtCodeCountryPerm!= null)&&this.ssdtCodeCountryPerm.equals(rhs.ssdtCodeCountryPerm))))&&((this.ssdtCodeCountryPermSt == rhs.ssdtCodeCountryPermSt)||((this.ssdtCodeCountryPermSt!= null)&&this.ssdtCodeCountryPermSt.equals(rhs.ssdtCodeCountryPermSt))))&&((this.ssdtCodeApelCredSt == rhs.ssdtCodeApelCredSt)||((this.ssdtCodeApelCredSt!= null)&&this.ssdtCodeApelCredSt.equals(rhs.ssdtCodeApelCredSt))))&&((this.ssdtCodeCareleaverSt == rhs.ssdtCodeCareleaverSt)||((this.ssdtCodeCareleaverSt!= null)&&this.ssdtCodeCareleaverSt.equals(rhs.ssdtCodeCareleaverSt))))&&((this.ssdtCodeMarStatus == rhs.ssdtCodeMarStatus)||((this.ssdtCodeMarStatus!= null)&&this.ssdtCodeMarStatus.equals(rhs.ssdtCodeMarStatus))))&&((this.ssdtCodeEstranged == rhs.ssdtCodeEstranged)||((this.ssdtCodeEstranged!= null)&&this.ssdtCodeEstranged.equals(rhs.ssdtCodeEstranged))))&&((this.ssdtCodeHighQual == rhs.ssdtCodeHighQual)||((this.ssdtCodeHighQual!= null)&&this.ssdtCodeHighQual.equals(rhs.ssdtCodeHighQual))))&&((this.ssdtCodeRelBground == rhs.ssdtCodeRelBground)||((this.ssdtCodeRelBground!= null)&&this.ssdtCodeRelBground.equals(rhs.ssdtCodeRelBground))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ssdtCodeSoc2010St == rhs.ssdtCodeSoc2010St)||((this.ssdtCodeSoc2010St!= null)&&this.ssdtCodeSoc2010St.equals(rhs.ssdtCodeSoc2010St))));
    }

}
