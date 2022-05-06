
package com.ellucian.generated.bpapi.ban.general_person_identification_biographical.v1_0_0;

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
    "deadDate",
    "mrtlCode",
    "confirmedReDate",
    "lgcyCode",
    "relgCode",
    "confidInd",
    "armedServMedVetInd",
    "birthDate",
    "ethnCode",
    "veraInd",
    "ssn",
    "criteria.raceCde",
    "activeDutySeprDate",
    "deadInd",
    "citzCode",
    "vetcFileNumber",
    "gorpracRaceCde",
    "id",
    "ethnCde",
    "confirmedReCde",
    "sdvetInd",
    "pprnCode",
    "persSex"
})
@Generated("jsonschema2pojo")
public class GeneralPersonIdentificationBiographical100PutRequest {

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
    /**
     * Ethnicity and Race Confirmed Date enUS
     * <p>
     * Lineage reference object : SPBPERS_CONFIRMED_RE_DATE
     * 
     */
    @JsonProperty("confirmedReDate")
    @JsonPropertyDescription("Lineage reference object : SPBPERS_CONFIRMED_RE_DATE")
    private Date confirmedReDate;
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
     * Religion
     * <p>
     * Lineage reference object : SPBPERS_RELG_CODE, Lookup lineage reference object : stvrelg
     * 
     */
    @JsonProperty("relgCode")
    @JsonPropertyDescription("Lineage reference object : SPBPERS_RELG_CODE, Lookup lineage reference object : stvrelg")
    private String relgCode;
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
     * Armed Forces Service Medal Indicator
     * <p>
     * Lineage reference object : SPBPERS_ARMED_SERV_MED_VET_IND
     * 
     */
    @JsonProperty("armedServMedVetInd")
    @JsonPropertyDescription("Lineage reference object : SPBPERS_ARMED_SERV_MED_VET_IND")
    private String armedServMedVetInd;
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
    /**
     * SSN ...
     * <p>
     * Lineage reference object : SPBPERS_SSN
     * 
     */
    @JsonProperty("ssn")
    @JsonPropertyDescription("Lineage reference object : SPBPERS_SSN")
    private String ssn;
    /**
     * Race enUS
     * <p>
     * Lineage reference object : GORPRAC_RACE_CDE, Lookup lineage reference object : gorrace
     * (Required)
     * 
     */
    @JsonProperty("criteria.raceCde")
    @JsonPropertyDescription("Lineage reference object : GORPRAC_RACE_CDE, Lookup lineage reference object : gorrace")
    private String criteriaRaceCde;
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
     * Deceased
     * <p>
     * Lineage reference object : SPBPERS_DEAD_IND
     * 
     */
    @JsonProperty("deadInd")
    @JsonPropertyDescription("Lineage reference object : SPBPERS_DEAD_IND")
    private String deadInd;
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
    /**
     * Race enUS
     * <p>
     * Lineage reference object : GORPRAC_RACE_CDE, Lookup lineage reference object : gorrace
     * (Required)
     * 
     */
    @JsonProperty("gorpracRaceCde")
    @JsonPropertyDescription("Lineage reference object : GORPRAC_RACE_CDE, Lookup lineage reference object : gorrace")
    private String gorpracRaceCde;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
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
     * Ethnicity and Race Confirmed enUS
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
    /**
     * Legal Sex
     * <p>
     * 
     * 
     */
    @JsonProperty("persSex")
    private String persSex;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public GeneralPersonIdentificationBiographical100PutRequest withDeadDate(Date deadDate) {
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

    public GeneralPersonIdentificationBiographical100PutRequest withMrtlCode(String mrtlCode) {
        this.mrtlCode = mrtlCode;
        return this;
    }

    /**
     * Ethnicity and Race Confirmed Date enUS
     * <p>
     * Lineage reference object : SPBPERS_CONFIRMED_RE_DATE
     * 
     */
    @JsonProperty("confirmedReDate")
    public Date getConfirmedReDate() {
        return confirmedReDate;
    }

    /**
     * Ethnicity and Race Confirmed Date enUS
     * <p>
     * Lineage reference object : SPBPERS_CONFIRMED_RE_DATE
     * 
     */
    @JsonProperty("confirmedReDate")
    public void setConfirmedReDate(Date confirmedReDate) {
        this.confirmedReDate = confirmedReDate;
    }

    public GeneralPersonIdentificationBiographical100PutRequest withConfirmedReDate(Date confirmedReDate) {
        this.confirmedReDate = confirmedReDate;
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

    public GeneralPersonIdentificationBiographical100PutRequest withLgcyCode(String lgcyCode) {
        this.lgcyCode = lgcyCode;
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

    public GeneralPersonIdentificationBiographical100PutRequest withRelgCode(String relgCode) {
        this.relgCode = relgCode;
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

    public GeneralPersonIdentificationBiographical100PutRequest withConfidInd(String confidInd) {
        this.confidInd = confidInd;
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

    public GeneralPersonIdentificationBiographical100PutRequest withArmedServMedVetInd(String armedServMedVetInd) {
        this.armedServMedVetInd = armedServMedVetInd;
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

    public GeneralPersonIdentificationBiographical100PutRequest withBirthDate(Date birthDate) {
        this.birthDate = birthDate;
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

    public GeneralPersonIdentificationBiographical100PutRequest withEthnCode(String ethnCode) {
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

    public GeneralPersonIdentificationBiographical100PutRequest withVeraInd(String veraInd) {
        this.veraInd = veraInd;
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

    public GeneralPersonIdentificationBiographical100PutRequest withSsn(String ssn) {
        this.ssn = ssn;
        return this;
    }

    /**
     * Race enUS
     * <p>
     * Lineage reference object : GORPRAC_RACE_CDE, Lookup lineage reference object : gorrace
     * (Required)
     * 
     */
    @JsonProperty("criteria.raceCde")
    public String getCriteriaRaceCde() {
        return criteriaRaceCde;
    }

    /**
     * Race enUS
     * <p>
     * Lineage reference object : GORPRAC_RACE_CDE, Lookup lineage reference object : gorrace
     * (Required)
     * 
     */
    @JsonProperty("criteria.raceCde")
    public void setCriteriaRaceCde(String criteriaRaceCde) {
        this.criteriaRaceCde = criteriaRaceCde;
    }

    public GeneralPersonIdentificationBiographical100PutRequest withCriteriaRaceCde(String criteriaRaceCde) {
        this.criteriaRaceCde = criteriaRaceCde;
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

    public GeneralPersonIdentificationBiographical100PutRequest withActiveDutySeprDate(Date activeDutySeprDate) {
        this.activeDutySeprDate = activeDutySeprDate;
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

    public GeneralPersonIdentificationBiographical100PutRequest withDeadInd(String deadInd) {
        this.deadInd = deadInd;
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

    public GeneralPersonIdentificationBiographical100PutRequest withCitzCode(String citzCode) {
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

    public GeneralPersonIdentificationBiographical100PutRequest withVetcFileNumber(String vetcFileNumber) {
        this.vetcFileNumber = vetcFileNumber;
        return this;
    }

    /**
     * Race enUS
     * <p>
     * Lineage reference object : GORPRAC_RACE_CDE, Lookup lineage reference object : gorrace
     * (Required)
     * 
     */
    @JsonProperty("gorpracRaceCde")
    public String getGorpracRaceCde() {
        return gorpracRaceCde;
    }

    /**
     * Race enUS
     * <p>
     * Lineage reference object : GORPRAC_RACE_CDE, Lookup lineage reference object : gorrace
     * (Required)
     * 
     */
    @JsonProperty("gorpracRaceCde")
    public void setGorpracRaceCde(String gorpracRaceCde) {
        this.gorpracRaceCde = gorpracRaceCde;
    }

    public GeneralPersonIdentificationBiographical100PutRequest withGorpracRaceCde(String gorpracRaceCde) {
        this.gorpracRaceCde = gorpracRaceCde;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public GeneralPersonIdentificationBiographical100PutRequest withId(Object id) {
        this.id = id;
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

    public GeneralPersonIdentificationBiographical100PutRequest withEthnCde(String ethnCde) {
        this.ethnCde = ethnCde;
        return this;
    }

    /**
     * Ethnicity and Race Confirmed enUS
     * <p>
     * Lineage reference object : SPBPERS_CONFIRMED_RE_CDE
     * 
     */
    @JsonProperty("confirmedReCde")
    public String getConfirmedReCde() {
        return confirmedReCde;
    }

    /**
     * Ethnicity and Race Confirmed enUS
     * <p>
     * Lineage reference object : SPBPERS_CONFIRMED_RE_CDE
     * 
     */
    @JsonProperty("confirmedReCde")
    public void setConfirmedReCde(String confirmedReCde) {
        this.confirmedReCde = confirmedReCde;
    }

    public GeneralPersonIdentificationBiographical100PutRequest withConfirmedReCde(String confirmedReCde) {
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

    public GeneralPersonIdentificationBiographical100PutRequest withSdvetInd(String sdvetInd) {
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

    public GeneralPersonIdentificationBiographical100PutRequest withPprnCode(String pprnCode) {
        this.pprnCode = pprnCode;
        return this;
    }

    /**
     * Legal Sex
     * <p>
     * 
     * 
     */
    @JsonProperty("persSex")
    public String getPersSex() {
        return persSex;
    }

    /**
     * Legal Sex
     * <p>
     * 
     * 
     */
    @JsonProperty("persSex")
    public void setPersSex(String persSex) {
        this.persSex = persSex;
    }

    public GeneralPersonIdentificationBiographical100PutRequest withPersSex(String persSex) {
        this.persSex = persSex;
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

    public GeneralPersonIdentificationBiographical100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GeneralPersonIdentificationBiographical100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("deadDate");
        sb.append('=');
        sb.append(((this.deadDate == null)?"<null>":this.deadDate));
        sb.append(',');
        sb.append("mrtlCode");
        sb.append('=');
        sb.append(((this.mrtlCode == null)?"<null>":this.mrtlCode));
        sb.append(',');
        sb.append("confirmedReDate");
        sb.append('=');
        sb.append(((this.confirmedReDate == null)?"<null>":this.confirmedReDate));
        sb.append(',');
        sb.append("lgcyCode");
        sb.append('=');
        sb.append(((this.lgcyCode == null)?"<null>":this.lgcyCode));
        sb.append(',');
        sb.append("relgCode");
        sb.append('=');
        sb.append(((this.relgCode == null)?"<null>":this.relgCode));
        sb.append(',');
        sb.append("confidInd");
        sb.append('=');
        sb.append(((this.confidInd == null)?"<null>":this.confidInd));
        sb.append(',');
        sb.append("armedServMedVetInd");
        sb.append('=');
        sb.append(((this.armedServMedVetInd == null)?"<null>":this.armedServMedVetInd));
        sb.append(',');
        sb.append("birthDate");
        sb.append('=');
        sb.append(((this.birthDate == null)?"<null>":this.birthDate));
        sb.append(',');
        sb.append("ethnCode");
        sb.append('=');
        sb.append(((this.ethnCode == null)?"<null>":this.ethnCode));
        sb.append(',');
        sb.append("veraInd");
        sb.append('=');
        sb.append(((this.veraInd == null)?"<null>":this.veraInd));
        sb.append(',');
        sb.append("ssn");
        sb.append('=');
        sb.append(((this.ssn == null)?"<null>":this.ssn));
        sb.append(',');
        sb.append("criteriaRaceCde");
        sb.append('=');
        sb.append(((this.criteriaRaceCde == null)?"<null>":this.criteriaRaceCde));
        sb.append(',');
        sb.append("activeDutySeprDate");
        sb.append('=');
        sb.append(((this.activeDutySeprDate == null)?"<null>":this.activeDutySeprDate));
        sb.append(',');
        sb.append("deadInd");
        sb.append('=');
        sb.append(((this.deadInd == null)?"<null>":this.deadInd));
        sb.append(',');
        sb.append("citzCode");
        sb.append('=');
        sb.append(((this.citzCode == null)?"<null>":this.citzCode));
        sb.append(',');
        sb.append("vetcFileNumber");
        sb.append('=');
        sb.append(((this.vetcFileNumber == null)?"<null>":this.vetcFileNumber));
        sb.append(',');
        sb.append("gorpracRaceCde");
        sb.append('=');
        sb.append(((this.gorpracRaceCde == null)?"<null>":this.gorpracRaceCde));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("ethnCde");
        sb.append('=');
        sb.append(((this.ethnCde == null)?"<null>":this.ethnCde));
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
        sb.append("persSex");
        sb.append('=');
        sb.append(((this.persSex == null)?"<null>":this.persSex));
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
        result = ((result* 31)+((this.deadDate == null)? 0 :this.deadDate.hashCode()));
        result = ((result* 31)+((this.mrtlCode == null)? 0 :this.mrtlCode.hashCode()));
        result = ((result* 31)+((this.relgCode == null)? 0 :this.relgCode.hashCode()));
        result = ((result* 31)+((this.ethnCode == null)? 0 :this.ethnCode.hashCode()));
        result = ((result* 31)+((this.veraInd == null)? 0 :this.veraInd.hashCode()));
        result = ((result* 31)+((this.ssn == null)? 0 :this.ssn.hashCode()));
        result = ((result* 31)+((this.activeDutySeprDate == null)? 0 :this.activeDutySeprDate.hashCode()));
        result = ((result* 31)+((this.deadInd == null)? 0 :this.deadInd.hashCode()));
        result = ((result* 31)+((this.gorpracRaceCde == null)? 0 :this.gorpracRaceCde.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.ethnCde == null)? 0 :this.ethnCde.hashCode()));
        result = ((result* 31)+((this.persSex == null)? 0 :this.persSex.hashCode()));
        result = ((result* 31)+((this.confirmedReDate == null)? 0 :this.confirmedReDate.hashCode()));
        result = ((result* 31)+((this.lgcyCode == null)? 0 :this.lgcyCode.hashCode()));
        result = ((result* 31)+((this.criteriaRaceCde == null)? 0 :this.criteriaRaceCde.hashCode()));
        result = ((result* 31)+((this.confidInd == null)? 0 :this.confidInd.hashCode()));
        result = ((result* 31)+((this.armedServMedVetInd == null)? 0 :this.armedServMedVetInd.hashCode()));
        result = ((result* 31)+((this.birthDate == null)? 0 :this.birthDate.hashCode()));
        result = ((result* 31)+((this.citzCode == null)? 0 :this.citzCode.hashCode()));
        result = ((result* 31)+((this.vetcFileNumber == null)? 0 :this.vetcFileNumber.hashCode()));
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
        if ((other instanceof GeneralPersonIdentificationBiographical100PutRequest) == false) {
            return false;
        }
        GeneralPersonIdentificationBiographical100PutRequest rhs = ((GeneralPersonIdentificationBiographical100PutRequest) other);
        return (((((((((((((((((((((((((this.deadDate == rhs.deadDate)||((this.deadDate!= null)&&this.deadDate.equals(rhs.deadDate)))&&((this.mrtlCode == rhs.mrtlCode)||((this.mrtlCode!= null)&&this.mrtlCode.equals(rhs.mrtlCode))))&&((this.relgCode == rhs.relgCode)||((this.relgCode!= null)&&this.relgCode.equals(rhs.relgCode))))&&((this.ethnCode == rhs.ethnCode)||((this.ethnCode!= null)&&this.ethnCode.equals(rhs.ethnCode))))&&((this.veraInd == rhs.veraInd)||((this.veraInd!= null)&&this.veraInd.equals(rhs.veraInd))))&&((this.ssn == rhs.ssn)||((this.ssn!= null)&&this.ssn.equals(rhs.ssn))))&&((this.activeDutySeprDate == rhs.activeDutySeprDate)||((this.activeDutySeprDate!= null)&&this.activeDutySeprDate.equals(rhs.activeDutySeprDate))))&&((this.deadInd == rhs.deadInd)||((this.deadInd!= null)&&this.deadInd.equals(rhs.deadInd))))&&((this.gorpracRaceCde == rhs.gorpracRaceCde)||((this.gorpracRaceCde!= null)&&this.gorpracRaceCde.equals(rhs.gorpracRaceCde))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.ethnCde == rhs.ethnCde)||((this.ethnCde!= null)&&this.ethnCde.equals(rhs.ethnCde))))&&((this.persSex == rhs.persSex)||((this.persSex!= null)&&this.persSex.equals(rhs.persSex))))&&((this.confirmedReDate == rhs.confirmedReDate)||((this.confirmedReDate!= null)&&this.confirmedReDate.equals(rhs.confirmedReDate))))&&((this.lgcyCode == rhs.lgcyCode)||((this.lgcyCode!= null)&&this.lgcyCode.equals(rhs.lgcyCode))))&&((this.criteriaRaceCde == rhs.criteriaRaceCde)||((this.criteriaRaceCde!= null)&&this.criteriaRaceCde.equals(rhs.criteriaRaceCde))))&&((this.confidInd == rhs.confidInd)||((this.confidInd!= null)&&this.confidInd.equals(rhs.confidInd))))&&((this.armedServMedVetInd == rhs.armedServMedVetInd)||((this.armedServMedVetInd!= null)&&this.armedServMedVetInd.equals(rhs.armedServMedVetInd))))&&((this.birthDate == rhs.birthDate)||((this.birthDate!= null)&&this.birthDate.equals(rhs.birthDate))))&&((this.citzCode == rhs.citzCode)||((this.citzCode!= null)&&this.citzCode.equals(rhs.citzCode))))&&((this.vetcFileNumber == rhs.vetcFileNumber)||((this.vetcFileNumber!= null)&&this.vetcFileNumber.equals(rhs.vetcFileNumber))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.confirmedReCde == rhs.confirmedReCde)||((this.confirmedReCde!= null)&&this.confirmedReCde.equals(rhs.confirmedReCde))))&&((this.sdvetInd == rhs.sdvetInd)||((this.sdvetInd!= null)&&this.sdvetInd.equals(rhs.sdvetInd))))&&((this.pprnCode == rhs.pprnCode)||((this.pprnCode!= null)&&this.pprnCode.equals(rhs.pprnCode))));
    }

}
