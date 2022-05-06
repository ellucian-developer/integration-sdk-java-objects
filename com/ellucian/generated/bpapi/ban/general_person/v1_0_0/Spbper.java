
package com.ellucian.generated.bpapi.ban.general_person.v1_0_0;

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
    "mrtlDescription",
    "deadDate",
    "mrtlCode",
    "lgcyDescription",
    "relgCode",
    "ethnCode",
    "veraInd",
    "greenDataBar1",
    "ssn",
    "citzDesc",
    "activeDutySeprDate",
    "activityDate",
    "gndrCode",
    "deadInd",
    "ethnCde",
    "persSex",
    "confirmedReDate",
    "persAge",
    "lgcyCode",
    "armedServMedVetInd",
    "confidInd",
    "birthDate",
    "userId",
    "pprnDescription",
    "citzCode",
    "vetcFileNumber",
    "ethnDescription",
    "gndrDescription",
    "relgDescription",
    "confirmedReCde",
    "sdvetInd",
    "pprnCode"
})
@Generated("jsonschema2pojo")
public class Spbper {

    @JsonProperty("mrtlDescription")
    private String mrtlDescription;
    /**
     * Deceased Date
     * <p>
     * Lineage reference object : SPBPERS_DEAD_DATE
     * 
     */
    @JsonProperty("deadDate")
    @JsonPropertyDescription("Lineage reference object : SPBPERS_DEAD_DATE")
    private Date deadDate;
    /**
     * Marital Status
     * <p>
     * Lineage reference object : SPBPERS_MRTL_CODE, Lookup lineage reference object : stvmrtl
     * 
     */
    @JsonProperty("mrtlCode")
    @JsonPropertyDescription("Lineage reference object : SPBPERS_MRTL_CODE, Lookup lineage reference object : stvmrtl")
    private String mrtlCode;
    @JsonProperty("lgcyDescription")
    private String lgcyDescription;
    /**
     * Religion
     * <p>
     * Lineage reference object : SPBPERS_RELG_CODE, Lookup lineage reference object : stvrelg
     * 
     */
    @JsonProperty("relgCode")
    @JsonPropertyDescription("Lineage reference object : SPBPERS_RELG_CODE, Lookup lineage reference object : stvrelg")
    private String relgCode;
    /**
     * Ethnicity
     * <p>
     * Lineage reference object : SPBPERS_ETHN_CODE, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnCode")
    @JsonPropertyDescription("Lineage reference object : SPBPERS_ETHN_CODE, Lookup lineage reference object : stvethn")
    private String ethnCode;
    /**
     * Veteran Classification
     * <p>
     * Lineage reference object : SPBPERS_VERA_IND
     * 
     */
    @JsonProperty("veraInd")
    @JsonPropertyDescription("Lineage reference object : SPBPERS_VERA_IND")
    private String veraInd;
    @JsonProperty("greenDataBar1")
    private String greenDataBar1;
    /**
     * SSN ...
     * <p>
     * Lineage reference object : SPBPERS_SSN
     * 
     */
    @JsonProperty("ssn")
    @JsonPropertyDescription("Lineage reference object : SPBPERS_SSN")
    private String ssn;
    @JsonProperty("citzDesc")
    private String citzDesc;
    /**
     * Date of Discharge
     * <p>
     * Lineage reference object : SPBPERS_ACTIVE_DUTY_SEPR_DATE
     * 
     */
    @JsonProperty("activeDutySeprDate")
    @JsonPropertyDescription("Lineage reference object : SPBPERS_ACTIVE_DUTY_SEPR_DATE")
    private Date activeDutySeprDate;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SPBPERS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SPBPERS_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Gender Designation
     * <p>
     * Lineage reference object : SPBPERS_GNDR_CODE, Lookup lineage reference object : gtvgndr
     * 
     */
    @JsonProperty("gndrCode")
    @JsonPropertyDescription("Lineage reference object : SPBPERS_GNDR_CODE, Lookup lineage reference object : gtvgndr")
    private String gndrCode;
    /**
     * Deceased
     * <p>
     * Lineage reference object : SPBPERS_DEAD_IND
     * 
     */
    @JsonProperty("deadInd")
    @JsonPropertyDescription("Lineage reference object : SPBPERS_DEAD_IND")
    private String deadInd;
    /**
     * New Ethnicity
     * <p>
     * Lineage reference object : SPBPERS_ETHN_CDE
     * 
     */
    @JsonProperty("ethnCde")
    @JsonPropertyDescription("Lineage reference object : SPBPERS_ETHN_CDE")
    private String ethnCde;
    /**
     * Gender
     * <p>
     * 
     * 
     */
    @JsonProperty("persSex")
    private String persSex;
    /**
     * Ethnicity and Race Confirmed Date
     * <p>
     * Lineage reference object : SPBPERS_CONFIRMED_RE_DATE
     * 
     */
    @JsonProperty("confirmedReDate")
    @JsonPropertyDescription("Lineage reference object : SPBPERS_CONFIRMED_RE_DATE")
    private Date confirmedReDate;
    /**
     * Age
     * <p>
     * 
     * 
     */
    @JsonProperty("persAge")
    private Double persAge;
    /**
     * Legacy
     * <p>
     * Lineage reference object : SPBPERS_LGCY_CODE, Lookup lineage reference object : stvlgcy
     * 
     */
    @JsonProperty("lgcyCode")
    @JsonPropertyDescription("Lineage reference object : SPBPERS_LGCY_CODE, Lookup lineage reference object : stvlgcy")
    private String lgcyCode;
    /**
     * Armed Forces Service Medal Indicator
     * <p>
     * Lineage reference object : SPBPERS_ARMED_SERV_MED_VET_IND
     * 
     */
    @JsonProperty("armedServMedVetInd")
    @JsonPropertyDescription("Lineage reference object : SPBPERS_ARMED_SERV_MED_VET_IND")
    private String armedServMedVetInd;
    /**
     * Confidential
     * <p>
     * Lineage reference object : SPBPERS_CONFID_IND
     * 
     */
    @JsonProperty("confidInd")
    @JsonPropertyDescription("Lineage reference object : SPBPERS_CONFID_IND")
    private String confidInd;
    /**
     * Birth Date
     * <p>
     * Lineage reference object : SPBPERS_BIRTH_DATE
     * 
     */
    @JsonProperty("birthDate")
    @JsonPropertyDescription("Lineage reference object : SPBPERS_BIRTH_DATE")
    private Date birthDate;
    /**
     * User
     * <p>
     * Lineage reference object : SPBPERS_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SPBPERS_USER_ID")
    private String userId;
    @JsonProperty("pprnDescription")
    private String pprnDescription;
    /**
     * Citizenship
     * <p>
     * Lineage reference object : SPBPERS_CITZ_CODE, Lookup lineage reference object : stvcitz
     * 
     */
    @JsonProperty("citzCode")
    @JsonPropertyDescription("Lineage reference object : SPBPERS_CITZ_CODE, Lookup lineage reference object : stvcitz")
    private String citzCode;
    /**
     * Veteran File Number
     * <p>
     * Lineage reference object : SPBPERS_VETC_FILE_NUMBER
     * 
     */
    @JsonProperty("vetcFileNumber")
    @JsonPropertyDescription("Lineage reference object : SPBPERS_VETC_FILE_NUMBER")
    private String vetcFileNumber;
    @JsonProperty("ethnDescription")
    private String ethnDescription;
    @JsonProperty("gndrDescription")
    private String gndrDescription;
    @JsonProperty("relgDescription")
    private String relgDescription;
    /**
     * Ethnicity and Race Confirmed
     * <p>
     * Lineage reference object : SPBPERS_CONFIRMED_RE_CDE
     * 
     */
    @JsonProperty("confirmedReCde")
    @JsonPropertyDescription("Lineage reference object : SPBPERS_CONFIRMED_RE_CDE")
    private String confirmedReCde;
    /**
     * Disabled Veteran
     * <p>
     * Lineage reference object : SPBPERS_SDVET_IND
     * 
     */
    @JsonProperty("sdvetInd")
    @JsonPropertyDescription("Lineage reference object : SPBPERS_SDVET_IND")
    private String sdvetInd;
    /**
     * Personal Pronoun
     * <p>
     * Lineage reference object : SPBPERS_PPRN_CODE, Lookup lineage reference object : gtvpprn
     * 
     */
    @JsonProperty("pprnCode")
    @JsonPropertyDescription("Lineage reference object : SPBPERS_PPRN_CODE, Lookup lineage reference object : gtvpprn")
    private String pprnCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("mrtlDescription")
    public String getMrtlDescription() {
        return mrtlDescription;
    }

    @JsonProperty("mrtlDescription")
    public void setMrtlDescription(String mrtlDescription) {
        this.mrtlDescription = mrtlDescription;
    }

    public Spbper withMrtlDescription(String mrtlDescription) {
        this.mrtlDescription = mrtlDescription;
        return this;
    }

    /**
     * Deceased Date
     * <p>
     * Lineage reference object : SPBPERS_DEAD_DATE
     * 
     */
    @JsonProperty("deadDate")
    public Date getDeadDate() {
        return deadDate;
    }

    /**
     * Deceased Date
     * <p>
     * Lineage reference object : SPBPERS_DEAD_DATE
     * 
     */
    @JsonProperty("deadDate")
    public void setDeadDate(Date deadDate) {
        this.deadDate = deadDate;
    }

    public Spbper withDeadDate(Date deadDate) {
        this.deadDate = deadDate;
        return this;
    }

    /**
     * Marital Status
     * <p>
     * Lineage reference object : SPBPERS_MRTL_CODE, Lookup lineage reference object : stvmrtl
     * 
     */
    @JsonProperty("mrtlCode")
    public String getMrtlCode() {
        return mrtlCode;
    }

    /**
     * Marital Status
     * <p>
     * Lineage reference object : SPBPERS_MRTL_CODE, Lookup lineage reference object : stvmrtl
     * 
     */
    @JsonProperty("mrtlCode")
    public void setMrtlCode(String mrtlCode) {
        this.mrtlCode = mrtlCode;
    }

    public Spbper withMrtlCode(String mrtlCode) {
        this.mrtlCode = mrtlCode;
        return this;
    }

    @JsonProperty("lgcyDescription")
    public String getLgcyDescription() {
        return lgcyDescription;
    }

    @JsonProperty("lgcyDescription")
    public void setLgcyDescription(String lgcyDescription) {
        this.lgcyDescription = lgcyDescription;
    }

    public Spbper withLgcyDescription(String lgcyDescription) {
        this.lgcyDescription = lgcyDescription;
        return this;
    }

    /**
     * Religion
     * <p>
     * Lineage reference object : SPBPERS_RELG_CODE, Lookup lineage reference object : stvrelg
     * 
     */
    @JsonProperty("relgCode")
    public String getRelgCode() {
        return relgCode;
    }

    /**
     * Religion
     * <p>
     * Lineage reference object : SPBPERS_RELG_CODE, Lookup lineage reference object : stvrelg
     * 
     */
    @JsonProperty("relgCode")
    public void setRelgCode(String relgCode) {
        this.relgCode = relgCode;
    }

    public Spbper withRelgCode(String relgCode) {
        this.relgCode = relgCode;
        return this;
    }

    /**
     * Ethnicity
     * <p>
     * Lineage reference object : SPBPERS_ETHN_CODE, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnCode")
    public String getEthnCode() {
        return ethnCode;
    }

    /**
     * Ethnicity
     * <p>
     * Lineage reference object : SPBPERS_ETHN_CODE, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnCode")
    public void setEthnCode(String ethnCode) {
        this.ethnCode = ethnCode;
    }

    public Spbper withEthnCode(String ethnCode) {
        this.ethnCode = ethnCode;
        return this;
    }

    /**
     * Veteran Classification
     * <p>
     * Lineage reference object : SPBPERS_VERA_IND
     * 
     */
    @JsonProperty("veraInd")
    public String getVeraInd() {
        return veraInd;
    }

    /**
     * Veteran Classification
     * <p>
     * Lineage reference object : SPBPERS_VERA_IND
     * 
     */
    @JsonProperty("veraInd")
    public void setVeraInd(String veraInd) {
        this.veraInd = veraInd;
    }

    public Spbper withVeraInd(String veraInd) {
        this.veraInd = veraInd;
        return this;
    }

    @JsonProperty("greenDataBar1")
    public String getGreenDataBar1() {
        return greenDataBar1;
    }

    @JsonProperty("greenDataBar1")
    public void setGreenDataBar1(String greenDataBar1) {
        this.greenDataBar1 = greenDataBar1;
    }

    public Spbper withGreenDataBar1(String greenDataBar1) {
        this.greenDataBar1 = greenDataBar1;
        return this;
    }

    /**
     * SSN ...
     * <p>
     * Lineage reference object : SPBPERS_SSN
     * 
     */
    @JsonProperty("ssn")
    public String getSsn() {
        return ssn;
    }

    /**
     * SSN ...
     * <p>
     * Lineage reference object : SPBPERS_SSN
     * 
     */
    @JsonProperty("ssn")
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public Spbper withSsn(String ssn) {
        this.ssn = ssn;
        return this;
    }

    @JsonProperty("citzDesc")
    public String getCitzDesc() {
        return citzDesc;
    }

    @JsonProperty("citzDesc")
    public void setCitzDesc(String citzDesc) {
        this.citzDesc = citzDesc;
    }

    public Spbper withCitzDesc(String citzDesc) {
        this.citzDesc = citzDesc;
        return this;
    }

    /**
     * Date of Discharge
     * <p>
     * Lineage reference object : SPBPERS_ACTIVE_DUTY_SEPR_DATE
     * 
     */
    @JsonProperty("activeDutySeprDate")
    public Date getActiveDutySeprDate() {
        return activeDutySeprDate;
    }

    /**
     * Date of Discharge
     * <p>
     * Lineage reference object : SPBPERS_ACTIVE_DUTY_SEPR_DATE
     * 
     */
    @JsonProperty("activeDutySeprDate")
    public void setActiveDutySeprDate(Date activeDutySeprDate) {
        this.activeDutySeprDate = activeDutySeprDate;
    }

    public Spbper withActiveDutySeprDate(Date activeDutySeprDate) {
        this.activeDutySeprDate = activeDutySeprDate;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SPBPERS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SPBPERS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Spbper withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Gender Designation
     * <p>
     * Lineage reference object : SPBPERS_GNDR_CODE, Lookup lineage reference object : gtvgndr
     * 
     */
    @JsonProperty("gndrCode")
    public String getGndrCode() {
        return gndrCode;
    }

    /**
     * Gender Designation
     * <p>
     * Lineage reference object : SPBPERS_GNDR_CODE, Lookup lineage reference object : gtvgndr
     * 
     */
    @JsonProperty("gndrCode")
    public void setGndrCode(String gndrCode) {
        this.gndrCode = gndrCode;
    }

    public Spbper withGndrCode(String gndrCode) {
        this.gndrCode = gndrCode;
        return this;
    }

    /**
     * Deceased
     * <p>
     * Lineage reference object : SPBPERS_DEAD_IND
     * 
     */
    @JsonProperty("deadInd")
    public String getDeadInd() {
        return deadInd;
    }

    /**
     * Deceased
     * <p>
     * Lineage reference object : SPBPERS_DEAD_IND
     * 
     */
    @JsonProperty("deadInd")
    public void setDeadInd(String deadInd) {
        this.deadInd = deadInd;
    }

    public Spbper withDeadInd(String deadInd) {
        this.deadInd = deadInd;
        return this;
    }

    /**
     * New Ethnicity
     * <p>
     * Lineage reference object : SPBPERS_ETHN_CDE
     * 
     */
    @JsonProperty("ethnCde")
    public String getEthnCde() {
        return ethnCde;
    }

    /**
     * New Ethnicity
     * <p>
     * Lineage reference object : SPBPERS_ETHN_CDE
     * 
     */
    @JsonProperty("ethnCde")
    public void setEthnCde(String ethnCde) {
        this.ethnCde = ethnCde;
    }

    public Spbper withEthnCde(String ethnCde) {
        this.ethnCde = ethnCde;
        return this;
    }

    /**
     * Gender
     * <p>
     * 
     * 
     */
    @JsonProperty("persSex")
    public String getPersSex() {
        return persSex;
    }

    /**
     * Gender
     * <p>
     * 
     * 
     */
    @JsonProperty("persSex")
    public void setPersSex(String persSex) {
        this.persSex = persSex;
    }

    public Spbper withPersSex(String persSex) {
        this.persSex = persSex;
        return this;
    }

    /**
     * Ethnicity and Race Confirmed Date
     * <p>
     * Lineage reference object : SPBPERS_CONFIRMED_RE_DATE
     * 
     */
    @JsonProperty("confirmedReDate")
    public Date getConfirmedReDate() {
        return confirmedReDate;
    }

    /**
     * Ethnicity and Race Confirmed Date
     * <p>
     * Lineage reference object : SPBPERS_CONFIRMED_RE_DATE
     * 
     */
    @JsonProperty("confirmedReDate")
    public void setConfirmedReDate(Date confirmedReDate) {
        this.confirmedReDate = confirmedReDate;
    }

    public Spbper withConfirmedReDate(Date confirmedReDate) {
        this.confirmedReDate = confirmedReDate;
        return this;
    }

    /**
     * Age
     * <p>
     * 
     * 
     */
    @JsonProperty("persAge")
    public Double getPersAge() {
        return persAge;
    }

    /**
     * Age
     * <p>
     * 
     * 
     */
    @JsonProperty("persAge")
    public void setPersAge(Double persAge) {
        this.persAge = persAge;
    }

    public Spbper withPersAge(Double persAge) {
        this.persAge = persAge;
        return this;
    }

    /**
     * Legacy
     * <p>
     * Lineage reference object : SPBPERS_LGCY_CODE, Lookup lineage reference object : stvlgcy
     * 
     */
    @JsonProperty("lgcyCode")
    public String getLgcyCode() {
        return lgcyCode;
    }

    /**
     * Legacy
     * <p>
     * Lineage reference object : SPBPERS_LGCY_CODE, Lookup lineage reference object : stvlgcy
     * 
     */
    @JsonProperty("lgcyCode")
    public void setLgcyCode(String lgcyCode) {
        this.lgcyCode = lgcyCode;
    }

    public Spbper withLgcyCode(String lgcyCode) {
        this.lgcyCode = lgcyCode;
        return this;
    }

    /**
     * Armed Forces Service Medal Indicator
     * <p>
     * Lineage reference object : SPBPERS_ARMED_SERV_MED_VET_IND
     * 
     */
    @JsonProperty("armedServMedVetInd")
    public String getArmedServMedVetInd() {
        return armedServMedVetInd;
    }

    /**
     * Armed Forces Service Medal Indicator
     * <p>
     * Lineage reference object : SPBPERS_ARMED_SERV_MED_VET_IND
     * 
     */
    @JsonProperty("armedServMedVetInd")
    public void setArmedServMedVetInd(String armedServMedVetInd) {
        this.armedServMedVetInd = armedServMedVetInd;
    }

    public Spbper withArmedServMedVetInd(String armedServMedVetInd) {
        this.armedServMedVetInd = armedServMedVetInd;
        return this;
    }

    /**
     * Confidential
     * <p>
     * Lineage reference object : SPBPERS_CONFID_IND
     * 
     */
    @JsonProperty("confidInd")
    public String getConfidInd() {
        return confidInd;
    }

    /**
     * Confidential
     * <p>
     * Lineage reference object : SPBPERS_CONFID_IND
     * 
     */
    @JsonProperty("confidInd")
    public void setConfidInd(String confidInd) {
        this.confidInd = confidInd;
    }

    public Spbper withConfidInd(String confidInd) {
        this.confidInd = confidInd;
        return this;
    }

    /**
     * Birth Date
     * <p>
     * Lineage reference object : SPBPERS_BIRTH_DATE
     * 
     */
    @JsonProperty("birthDate")
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * Birth Date
     * <p>
     * Lineage reference object : SPBPERS_BIRTH_DATE
     * 
     */
    @JsonProperty("birthDate")
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Spbper withBirthDate(Date birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    /**
     * User
     * <p>
     * Lineage reference object : SPBPERS_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User
     * <p>
     * Lineage reference object : SPBPERS_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Spbper withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    @JsonProperty("pprnDescription")
    public String getPprnDescription() {
        return pprnDescription;
    }

    @JsonProperty("pprnDescription")
    public void setPprnDescription(String pprnDescription) {
        this.pprnDescription = pprnDescription;
    }

    public Spbper withPprnDescription(String pprnDescription) {
        this.pprnDescription = pprnDescription;
        return this;
    }

    /**
     * Citizenship
     * <p>
     * Lineage reference object : SPBPERS_CITZ_CODE, Lookup lineage reference object : stvcitz
     * 
     */
    @JsonProperty("citzCode")
    public String getCitzCode() {
        return citzCode;
    }

    /**
     * Citizenship
     * <p>
     * Lineage reference object : SPBPERS_CITZ_CODE, Lookup lineage reference object : stvcitz
     * 
     */
    @JsonProperty("citzCode")
    public void setCitzCode(String citzCode) {
        this.citzCode = citzCode;
    }

    public Spbper withCitzCode(String citzCode) {
        this.citzCode = citzCode;
        return this;
    }

    /**
     * Veteran File Number
     * <p>
     * Lineage reference object : SPBPERS_VETC_FILE_NUMBER
     * 
     */
    @JsonProperty("vetcFileNumber")
    public String getVetcFileNumber() {
        return vetcFileNumber;
    }

    /**
     * Veteran File Number
     * <p>
     * Lineage reference object : SPBPERS_VETC_FILE_NUMBER
     * 
     */
    @JsonProperty("vetcFileNumber")
    public void setVetcFileNumber(String vetcFileNumber) {
        this.vetcFileNumber = vetcFileNumber;
    }

    public Spbper withVetcFileNumber(String vetcFileNumber) {
        this.vetcFileNumber = vetcFileNumber;
        return this;
    }

    @JsonProperty("ethnDescription")
    public String getEthnDescription() {
        return ethnDescription;
    }

    @JsonProperty("ethnDescription")
    public void setEthnDescription(String ethnDescription) {
        this.ethnDescription = ethnDescription;
    }

    public Spbper withEthnDescription(String ethnDescription) {
        this.ethnDescription = ethnDescription;
        return this;
    }

    @JsonProperty("gndrDescription")
    public String getGndrDescription() {
        return gndrDescription;
    }

    @JsonProperty("gndrDescription")
    public void setGndrDescription(String gndrDescription) {
        this.gndrDescription = gndrDescription;
    }

    public Spbper withGndrDescription(String gndrDescription) {
        this.gndrDescription = gndrDescription;
        return this;
    }

    @JsonProperty("relgDescription")
    public String getRelgDescription() {
        return relgDescription;
    }

    @JsonProperty("relgDescription")
    public void setRelgDescription(String relgDescription) {
        this.relgDescription = relgDescription;
    }

    public Spbper withRelgDescription(String relgDescription) {
        this.relgDescription = relgDescription;
        return this;
    }

    /**
     * Ethnicity and Race Confirmed
     * <p>
     * Lineage reference object : SPBPERS_CONFIRMED_RE_CDE
     * 
     */
    @JsonProperty("confirmedReCde")
    public String getConfirmedReCde() {
        return confirmedReCde;
    }

    /**
     * Ethnicity and Race Confirmed
     * <p>
     * Lineage reference object : SPBPERS_CONFIRMED_RE_CDE
     * 
     */
    @JsonProperty("confirmedReCde")
    public void setConfirmedReCde(String confirmedReCde) {
        this.confirmedReCde = confirmedReCde;
    }

    public Spbper withConfirmedReCde(String confirmedReCde) {
        this.confirmedReCde = confirmedReCde;
        return this;
    }

    /**
     * Disabled Veteran
     * <p>
     * Lineage reference object : SPBPERS_SDVET_IND
     * 
     */
    @JsonProperty("sdvetInd")
    public String getSdvetInd() {
        return sdvetInd;
    }

    /**
     * Disabled Veteran
     * <p>
     * Lineage reference object : SPBPERS_SDVET_IND
     * 
     */
    @JsonProperty("sdvetInd")
    public void setSdvetInd(String sdvetInd) {
        this.sdvetInd = sdvetInd;
    }

    public Spbper withSdvetInd(String sdvetInd) {
        this.sdvetInd = sdvetInd;
        return this;
    }

    /**
     * Personal Pronoun
     * <p>
     * Lineage reference object : SPBPERS_PPRN_CODE, Lookup lineage reference object : gtvpprn
     * 
     */
    @JsonProperty("pprnCode")
    public String getPprnCode() {
        return pprnCode;
    }

    /**
     * Personal Pronoun
     * <p>
     * Lineage reference object : SPBPERS_PPRN_CODE, Lookup lineage reference object : gtvpprn
     * 
     */
    @JsonProperty("pprnCode")
    public void setPprnCode(String pprnCode) {
        this.pprnCode = pprnCode;
    }

    public Spbper withPprnCode(String pprnCode) {
        this.pprnCode = pprnCode;
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

    public Spbper withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Spbper.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("mrtlDescription");
        sb.append('=');
        sb.append(((this.mrtlDescription == null)?"<null>":this.mrtlDescription));
        sb.append(',');
        sb.append("deadDate");
        sb.append('=');
        sb.append(((this.deadDate == null)?"<null>":this.deadDate));
        sb.append(',');
        sb.append("mrtlCode");
        sb.append('=');
        sb.append(((this.mrtlCode == null)?"<null>":this.mrtlCode));
        sb.append(',');
        sb.append("lgcyDescription");
        sb.append('=');
        sb.append(((this.lgcyDescription == null)?"<null>":this.lgcyDescription));
        sb.append(',');
        sb.append("relgCode");
        sb.append('=');
        sb.append(((this.relgCode == null)?"<null>":this.relgCode));
        sb.append(',');
        sb.append("ethnCode");
        sb.append('=');
        sb.append(((this.ethnCode == null)?"<null>":this.ethnCode));
        sb.append(',');
        sb.append("veraInd");
        sb.append('=');
        sb.append(((this.veraInd == null)?"<null>":this.veraInd));
        sb.append(',');
        sb.append("greenDataBar1");
        sb.append('=');
        sb.append(((this.greenDataBar1 == null)?"<null>":this.greenDataBar1));
        sb.append(',');
        sb.append("ssn");
        sb.append('=');
        sb.append(((this.ssn == null)?"<null>":this.ssn));
        sb.append(',');
        sb.append("citzDesc");
        sb.append('=');
        sb.append(((this.citzDesc == null)?"<null>":this.citzDesc));
        sb.append(',');
        sb.append("activeDutySeprDate");
        sb.append('=');
        sb.append(((this.activeDutySeprDate == null)?"<null>":this.activeDutySeprDate));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("gndrCode");
        sb.append('=');
        sb.append(((this.gndrCode == null)?"<null>":this.gndrCode));
        sb.append(',');
        sb.append("deadInd");
        sb.append('=');
        sb.append(((this.deadInd == null)?"<null>":this.deadInd));
        sb.append(',');
        sb.append("ethnCde");
        sb.append('=');
        sb.append(((this.ethnCde == null)?"<null>":this.ethnCde));
        sb.append(',');
        sb.append("persSex");
        sb.append('=');
        sb.append(((this.persSex == null)?"<null>":this.persSex));
        sb.append(',');
        sb.append("confirmedReDate");
        sb.append('=');
        sb.append(((this.confirmedReDate == null)?"<null>":this.confirmedReDate));
        sb.append(',');
        sb.append("persAge");
        sb.append('=');
        sb.append(((this.persAge == null)?"<null>":this.persAge));
        sb.append(',');
        sb.append("lgcyCode");
        sb.append('=');
        sb.append(((this.lgcyCode == null)?"<null>":this.lgcyCode));
        sb.append(',');
        sb.append("armedServMedVetInd");
        sb.append('=');
        sb.append(((this.armedServMedVetInd == null)?"<null>":this.armedServMedVetInd));
        sb.append(',');
        sb.append("confidInd");
        sb.append('=');
        sb.append(((this.confidInd == null)?"<null>":this.confidInd));
        sb.append(',');
        sb.append("birthDate");
        sb.append('=');
        sb.append(((this.birthDate == null)?"<null>":this.birthDate));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("pprnDescription");
        sb.append('=');
        sb.append(((this.pprnDescription == null)?"<null>":this.pprnDescription));
        sb.append(',');
        sb.append("citzCode");
        sb.append('=');
        sb.append(((this.citzCode == null)?"<null>":this.citzCode));
        sb.append(',');
        sb.append("vetcFileNumber");
        sb.append('=');
        sb.append(((this.vetcFileNumber == null)?"<null>":this.vetcFileNumber));
        sb.append(',');
        sb.append("ethnDescription");
        sb.append('=');
        sb.append(((this.ethnDescription == null)?"<null>":this.ethnDescription));
        sb.append(',');
        sb.append("gndrDescription");
        sb.append('=');
        sb.append(((this.gndrDescription == null)?"<null>":this.gndrDescription));
        sb.append(',');
        sb.append("relgDescription");
        sb.append('=');
        sb.append(((this.relgDescription == null)?"<null>":this.relgDescription));
        sb.append(',');
        sb.append("confirmedReCde");
        sb.append('=');
        sb.append(((this.confirmedReCde == null)?"<null>":this.confirmedReCde));
        sb.append(',');
        sb.append("sdvetInd");
        sb.append('=');
        sb.append(((this.sdvetInd == null)?"<null>":this.sdvetInd));
        sb.append(',');
        sb.append("pprnCode");
        sb.append('=');
        sb.append(((this.pprnCode == null)?"<null>":this.pprnCode));
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
        result = ((result* 31)+((this.mrtlDescription == null)? 0 :this.mrtlDescription.hashCode()));
        result = ((result* 31)+((this.deadDate == null)? 0 :this.deadDate.hashCode()));
        result = ((result* 31)+((this.mrtlCode == null)? 0 :this.mrtlCode.hashCode()));
        result = ((result* 31)+((this.lgcyDescription == null)? 0 :this.lgcyDescription.hashCode()));
        result = ((result* 31)+((this.relgCode == null)? 0 :this.relgCode.hashCode()));
        result = ((result* 31)+((this.ethnCode == null)? 0 :this.ethnCode.hashCode()));
        result = ((result* 31)+((this.veraInd == null)? 0 :this.veraInd.hashCode()));
        result = ((result* 31)+((this.greenDataBar1 == null)? 0 :this.greenDataBar1 .hashCode()));
        result = ((result* 31)+((this.ssn == null)? 0 :this.ssn.hashCode()));
        result = ((result* 31)+((this.citzDesc == null)? 0 :this.citzDesc.hashCode()));
        result = ((result* 31)+((this.activeDutySeprDate == null)? 0 :this.activeDutySeprDate.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.gndrCode == null)? 0 :this.gndrCode.hashCode()));
        result = ((result* 31)+((this.deadInd == null)? 0 :this.deadInd.hashCode()));
        result = ((result* 31)+((this.ethnCde == null)? 0 :this.ethnCde.hashCode()));
        result = ((result* 31)+((this.persSex == null)? 0 :this.persSex.hashCode()));
        result = ((result* 31)+((this.confirmedReDate == null)? 0 :this.confirmedReDate.hashCode()));
        result = ((result* 31)+((this.persAge == null)? 0 :this.persAge.hashCode()));
        result = ((result* 31)+((this.lgcyCode == null)? 0 :this.lgcyCode.hashCode()));
        result = ((result* 31)+((this.armedServMedVetInd == null)? 0 :this.armedServMedVetInd.hashCode()));
        result = ((result* 31)+((this.confidInd == null)? 0 :this.confidInd.hashCode()));
        result = ((result* 31)+((this.birthDate == null)? 0 :this.birthDate.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.pprnDescription == null)? 0 :this.pprnDescription.hashCode()));
        result = ((result* 31)+((this.citzCode == null)? 0 :this.citzCode.hashCode()));
        result = ((result* 31)+((this.vetcFileNumber == null)? 0 :this.vetcFileNumber.hashCode()));
        result = ((result* 31)+((this.ethnDescription == null)? 0 :this.ethnDescription.hashCode()));
        result = ((result* 31)+((this.gndrDescription == null)? 0 :this.gndrDescription.hashCode()));
        result = ((result* 31)+((this.relgDescription == null)? 0 :this.relgDescription.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.confirmedReCde == null)? 0 :this.confirmedReCde.hashCode()));
        result = ((result* 31)+((this.sdvetInd == null)? 0 :this.sdvetInd.hashCode()));
        result = ((result* 31)+((this.pprnCode == null)? 0 :this.pprnCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Spbper) == false) {
            return false;
        }
        Spbper rhs = ((Spbper) other);
        return ((((((((((((((((((((((((((((((((((this.mrtlDescription == rhs.mrtlDescription)||((this.mrtlDescription!= null)&&this.mrtlDescription.equals(rhs.mrtlDescription)))&&((this.deadDate == rhs.deadDate)||((this.deadDate!= null)&&this.deadDate.equals(rhs.deadDate))))&&((this.mrtlCode == rhs.mrtlCode)||((this.mrtlCode!= null)&&this.mrtlCode.equals(rhs.mrtlCode))))&&((this.lgcyDescription == rhs.lgcyDescription)||((this.lgcyDescription!= null)&&this.lgcyDescription.equals(rhs.lgcyDescription))))&&((this.relgCode == rhs.relgCode)||((this.relgCode!= null)&&this.relgCode.equals(rhs.relgCode))))&&((this.ethnCode == rhs.ethnCode)||((this.ethnCode!= null)&&this.ethnCode.equals(rhs.ethnCode))))&&((this.veraInd == rhs.veraInd)||((this.veraInd!= null)&&this.veraInd.equals(rhs.veraInd))))&&((this.greenDataBar1 == rhs.greenDataBar1)||((this.greenDataBar1 != null)&&this.greenDataBar1 .equals(rhs.greenDataBar1))))&&((this.ssn == rhs.ssn)||((this.ssn!= null)&&this.ssn.equals(rhs.ssn))))&&((this.citzDesc == rhs.citzDesc)||((this.citzDesc!= null)&&this.citzDesc.equals(rhs.citzDesc))))&&((this.activeDutySeprDate == rhs.activeDutySeprDate)||((this.activeDutySeprDate!= null)&&this.activeDutySeprDate.equals(rhs.activeDutySeprDate))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.gndrCode == rhs.gndrCode)||((this.gndrCode!= null)&&this.gndrCode.equals(rhs.gndrCode))))&&((this.deadInd == rhs.deadInd)||((this.deadInd!= null)&&this.deadInd.equals(rhs.deadInd))))&&((this.ethnCde == rhs.ethnCde)||((this.ethnCde!= null)&&this.ethnCde.equals(rhs.ethnCde))))&&((this.persSex == rhs.persSex)||((this.persSex!= null)&&this.persSex.equals(rhs.persSex))))&&((this.confirmedReDate == rhs.confirmedReDate)||((this.confirmedReDate!= null)&&this.confirmedReDate.equals(rhs.confirmedReDate))))&&((this.persAge == rhs.persAge)||((this.persAge!= null)&&this.persAge.equals(rhs.persAge))))&&((this.lgcyCode == rhs.lgcyCode)||((this.lgcyCode!= null)&&this.lgcyCode.equals(rhs.lgcyCode))))&&((this.armedServMedVetInd == rhs.armedServMedVetInd)||((this.armedServMedVetInd!= null)&&this.armedServMedVetInd.equals(rhs.armedServMedVetInd))))&&((this.confidInd == rhs.confidInd)||((this.confidInd!= null)&&this.confidInd.equals(rhs.confidInd))))&&((this.birthDate == rhs.birthDate)||((this.birthDate!= null)&&this.birthDate.equals(rhs.birthDate))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.pprnDescription == rhs.pprnDescription)||((this.pprnDescription!= null)&&this.pprnDescription.equals(rhs.pprnDescription))))&&((this.citzCode == rhs.citzCode)||((this.citzCode!= null)&&this.citzCode.equals(rhs.citzCode))))&&((this.vetcFileNumber == rhs.vetcFileNumber)||((this.vetcFileNumber!= null)&&this.vetcFileNumber.equals(rhs.vetcFileNumber))))&&((this.ethnDescription == rhs.ethnDescription)||((this.ethnDescription!= null)&&this.ethnDescription.equals(rhs.ethnDescription))))&&((this.gndrDescription == rhs.gndrDescription)||((this.gndrDescription!= null)&&this.gndrDescription.equals(rhs.gndrDescription))))&&((this.relgDescription == rhs.relgDescription)||((this.relgDescription!= null)&&this.relgDescription.equals(rhs.relgDescription))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.confirmedReCde == rhs.confirmedReCde)||((this.confirmedReCde!= null)&&this.confirmedReCde.equals(rhs.confirmedReCde))))&&((this.sdvetInd == rhs.sdvetInd)||((this.sdvetInd!= null)&&this.sdvetInd.equals(rhs.sdvetInd))))&&((this.pprnCode == rhs.pprnCode)||((this.pprnCode!= null)&&this.pprnCode.equals(rhs.pprnCode))));
    }

}
