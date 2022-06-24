
package com.ellucian.generated.bpapi.ban.system_identification.v1_0_0;

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
    "finHeading",
    "aluHeading",
    "hrAppl",
    "confidMsg",
    "stdAdm",
    "aluOrgn",
    "stdHeading",
    "finVend",
    "hrCobra",
    "hrEmpl",
    "finEmpl",
    "id",
    "advIndivDonrCatg",
    "finAgency",
    "stdRecr",
    "finAidAppl",
    "stdGenr",
    "aluConst",
    "stdRegr",
    "finCust",
    "stdTran",
    "stdHous",
    "hrHeading",
    "arHeading2",
    "arHeading1",
    "ar",
    "finBank",
    "finMagr",
    "stdFacu",
    "finAidHeading",
    "dcsdMsg",
    "advIndivPrefClas",
    "nname",
    "advOrgnDonrCatg",
    "hrBene"
})
@Generated("jsonschema2pojo")
public class SystemIdentification100GetResponse {

    /**
     * Lineage reference object : finHeading
     * 
     */
    @JsonProperty("finHeading")
    @JsonPropertyDescription("Lineage reference object : finHeading")
    private String finHeading;
    /**
     * Lineage reference object : aluHeading
     * 
     */
    @JsonProperty("aluHeading")
    @JsonPropertyDescription("Lineage reference object : aluHeading")
    private String aluHeading;
    /**
     * Applicant
     * <p>
     * Lineage reference object : hrAppl
     * 
     */
    @JsonProperty("hrAppl")
    @JsonPropertyDescription("Lineage reference object : hrAppl")
    private String hrAppl;
    /**
     * Lineage reference object : confidMsg
     * 
     */
    @JsonProperty("confidMsg")
    @JsonPropertyDescription("Lineage reference object : confidMsg")
    private String confidMsg;
    /**
     * Admissions
     * <p>
     * Lineage reference object : stdAdm
     * 
     */
    @JsonProperty("stdAdm")
    @JsonPropertyDescription("Lineage reference object : stdAdm")
    private String stdAdm;
    /**
     * Organization
     * <p>
     * Lineage reference object : aluOrgn
     * 
     */
    @JsonProperty("aluOrgn")
    @JsonPropertyDescription("Lineage reference object : aluOrgn")
    private String aluOrgn;
    /**
     * Lineage reference object : stdHeading
     * 
     */
    @JsonProperty("stdHeading")
    @JsonPropertyDescription("Lineage reference object : stdHeading")
    private String stdHeading;
    /**
     * Vendor
     * <p>
     * Lineage reference object : finVend
     * 
     */
    @JsonProperty("finVend")
    @JsonPropertyDescription("Lineage reference object : finVend")
    private String finVend;
    /**
     * Cobra Person
     * <p>
     * Lineage reference object : hrCobra
     * 
     */
    @JsonProperty("hrCobra")
    @JsonPropertyDescription("Lineage reference object : hrCobra")
    private String hrCobra;
    /**
     * Employee
     * <p>
     * Lineage reference object : hrEmpl
     * 
     */
    @JsonProperty("hrEmpl")
    @JsonPropertyDescription("Lineage reference object : hrEmpl")
    private String hrEmpl;
    /**
     * Employee
     * <p>
     * Lineage reference object : finEmpl
     * 
     */
    @JsonProperty("finEmpl")
    @JsonPropertyDescription("Lineage reference object : finEmpl")
    private String finEmpl;
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
     * Category
     * <p>
     * Lineage reference object : advIndivDonrCatg
     * 
     */
    @JsonProperty("advIndivDonrCatg")
    @JsonPropertyDescription("Lineage reference object : advIndivDonrCatg")
    private String advIndivDonrCatg;
    /**
     * Agency
     * <p>
     * Lineage reference object : finAgency
     * 
     */
    @JsonProperty("finAgency")
    @JsonPropertyDescription("Lineage reference object : finAgency")
    private String finAgency;
    /**
     * Recruiting
     * <p>
     * Lineage reference object : stdRecr
     * 
     */
    @JsonProperty("stdRecr")
    @JsonPropertyDescription("Lineage reference object : stdRecr")
    private String stdRecr;
    /**
     * Applicant
     * <p>
     * Lineage reference object : finAidAppl
     * 
     */
    @JsonProperty("finAidAppl")
    @JsonPropertyDescription("Lineage reference object : finAidAppl")
    private String finAidAppl;
    /**
     * General Student
     * <p>
     * Lineage reference object : stdGenr
     * 
     */
    @JsonProperty("stdGenr")
    @JsonPropertyDescription("Lineage reference object : stdGenr")
    private String stdGenr;
    /**
     * Individual
     * <p>
     * Lineage reference object : aluConst
     * 
     */
    @JsonProperty("aluConst")
    @JsonPropertyDescription("Lineage reference object : aluConst")
    private String aluConst;
    /**
     * Registration
     * <p>
     * Lineage reference object : stdRegr
     * 
     */
    @JsonProperty("stdRegr")
    @JsonPropertyDescription("Lineage reference object : stdRegr")
    private String stdRegr;
    /**
     * Customer
     * <p>
     * Lineage reference object : finCust
     * 
     */
    @JsonProperty("finCust")
    @JsonPropertyDescription("Lineage reference object : finCust")
    private String finCust;
    /**
     * Transfer Work
     * <p>
     * Lineage reference object : stdTran
     * 
     */
    @JsonProperty("stdTran")
    @JsonPropertyDescription("Lineage reference object : stdTran")
    private String stdTran;
    /**
     * Housing
     * <p>
     * Lineage reference object : stdHous
     * 
     */
    @JsonProperty("stdHous")
    @JsonPropertyDescription("Lineage reference object : stdHous")
    private String stdHous;
    /**
     * Lineage reference object : hrHeading
     * 
     */
    @JsonProperty("hrHeading")
    @JsonPropertyDescription("Lineage reference object : hrHeading")
    private String hrHeading;
    /**
     * Lineage reference object : arHeading2
     * 
     */
    @JsonProperty("arHeading2")
    @JsonPropertyDescription("Lineage reference object : arHeading2")
    private String arHeading2;
    /**
     * Lineage reference object : arHeading1
     * 
     */
    @JsonProperty("arHeading1")
    @JsonPropertyDescription("Lineage reference object : arHeading1")
    private String arHeading1;
    /**
     * Accounts Receivable
     * <p>
     * Lineage reference object : ar
     * 
     */
    @JsonProperty("ar")
    @JsonPropertyDescription("Lineage reference object : ar")
    private String ar;
    /**
     * Bank
     * <p>
     * Lineage reference object : finBank
     * 
     */
    @JsonProperty("finBank")
    @JsonPropertyDescription("Lineage reference object : finBank")
    private String finBank;
    /**
     * Financial Manager
     * <p>
     * Lineage reference object : finMagr
     * 
     */
    @JsonProperty("finMagr")
    @JsonPropertyDescription("Lineage reference object : finMagr")
    private String finMagr;
    /**
     * Faculty
     * <p>
     * Lineage reference object : stdFacu
     * 
     */
    @JsonProperty("stdFacu")
    @JsonPropertyDescription("Lineage reference object : stdFacu")
    private String stdFacu;
    /**
     * Lineage reference object : finAidHeading
     * 
     */
    @JsonProperty("finAidHeading")
    @JsonPropertyDescription("Lineage reference object : finAidHeading")
    private String finAidHeading;
    /**
     * Lineage reference object : dcsdMsg
     * 
     */
    @JsonProperty("dcsdMsg")
    @JsonPropertyDescription("Lineage reference object : dcsdMsg")
    private String dcsdMsg;
    /**
     * Class
     * <p>
     * Lineage reference object : advIndivPrefClas
     * 
     */
    @JsonProperty("advIndivPrefClas")
    @JsonPropertyDescription("Lineage reference object : advIndivPrefClas")
    private String advIndivPrefClas;
    /**
     * Lineage reference object : nname
     * 
     */
    @JsonProperty("nname")
    @JsonPropertyDescription("Lineage reference object : nname")
    private String nname;
    /**
     * Category
     * <p>
     * Lineage reference object : advOrgnDonrCatg
     * 
     */
    @JsonProperty("advOrgnDonrCatg")
    @JsonPropertyDescription("Lineage reference object : advOrgnDonrCatg")
    private String advOrgnDonrCatg;
    /**
     * Beneficiary
     * <p>
     * Lineage reference object : hrBene
     * 
     */
    @JsonProperty("hrBene")
    @JsonPropertyDescription("Lineage reference object : hrBene")
    private String hrBene;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : finHeading
     * 
     */
    @JsonProperty("finHeading")
    public String getFinHeading() {
        return finHeading;
    }

    /**
     * Lineage reference object : finHeading
     * 
     */
    @JsonProperty("finHeading")
    public void setFinHeading(String finHeading) {
        this.finHeading = finHeading;
    }

    public SystemIdentification100GetResponse withFinHeading(String finHeading) {
        this.finHeading = finHeading;
        return this;
    }

    /**
     * Lineage reference object : aluHeading
     * 
     */
    @JsonProperty("aluHeading")
    public String getAluHeading() {
        return aluHeading;
    }

    /**
     * Lineage reference object : aluHeading
     * 
     */
    @JsonProperty("aluHeading")
    public void setAluHeading(String aluHeading) {
        this.aluHeading = aluHeading;
    }

    public SystemIdentification100GetResponse withAluHeading(String aluHeading) {
        this.aluHeading = aluHeading;
        return this;
    }

    /**
     * Applicant
     * <p>
     * Lineage reference object : hrAppl
     * 
     */
    @JsonProperty("hrAppl")
    public String getHrAppl() {
        return hrAppl;
    }

    /**
     * Applicant
     * <p>
     * Lineage reference object : hrAppl
     * 
     */
    @JsonProperty("hrAppl")
    public void setHrAppl(String hrAppl) {
        this.hrAppl = hrAppl;
    }

    public SystemIdentification100GetResponse withHrAppl(String hrAppl) {
        this.hrAppl = hrAppl;
        return this;
    }

    /**
     * Lineage reference object : confidMsg
     * 
     */
    @JsonProperty("confidMsg")
    public String getConfidMsg() {
        return confidMsg;
    }

    /**
     * Lineage reference object : confidMsg
     * 
     */
    @JsonProperty("confidMsg")
    public void setConfidMsg(String confidMsg) {
        this.confidMsg = confidMsg;
    }

    public SystemIdentification100GetResponse withConfidMsg(String confidMsg) {
        this.confidMsg = confidMsg;
        return this;
    }

    /**
     * Admissions
     * <p>
     * Lineage reference object : stdAdm
     * 
     */
    @JsonProperty("stdAdm")
    public String getStdAdm() {
        return stdAdm;
    }

    /**
     * Admissions
     * <p>
     * Lineage reference object : stdAdm
     * 
     */
    @JsonProperty("stdAdm")
    public void setStdAdm(String stdAdm) {
        this.stdAdm = stdAdm;
    }

    public SystemIdentification100GetResponse withStdAdm(String stdAdm) {
        this.stdAdm = stdAdm;
        return this;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : aluOrgn
     * 
     */
    @JsonProperty("aluOrgn")
    public String getAluOrgn() {
        return aluOrgn;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : aluOrgn
     * 
     */
    @JsonProperty("aluOrgn")
    public void setAluOrgn(String aluOrgn) {
        this.aluOrgn = aluOrgn;
    }

    public SystemIdentification100GetResponse withAluOrgn(String aluOrgn) {
        this.aluOrgn = aluOrgn;
        return this;
    }

    /**
     * Lineage reference object : stdHeading
     * 
     */
    @JsonProperty("stdHeading")
    public String getStdHeading() {
        return stdHeading;
    }

    /**
     * Lineage reference object : stdHeading
     * 
     */
    @JsonProperty("stdHeading")
    public void setStdHeading(String stdHeading) {
        this.stdHeading = stdHeading;
    }

    public SystemIdentification100GetResponse withStdHeading(String stdHeading) {
        this.stdHeading = stdHeading;
        return this;
    }

    /**
     * Vendor
     * <p>
     * Lineage reference object : finVend
     * 
     */
    @JsonProperty("finVend")
    public String getFinVend() {
        return finVend;
    }

    /**
     * Vendor
     * <p>
     * Lineage reference object : finVend
     * 
     */
    @JsonProperty("finVend")
    public void setFinVend(String finVend) {
        this.finVend = finVend;
    }

    public SystemIdentification100GetResponse withFinVend(String finVend) {
        this.finVend = finVend;
        return this;
    }

    /**
     * Cobra Person
     * <p>
     * Lineage reference object : hrCobra
     * 
     */
    @JsonProperty("hrCobra")
    public String getHrCobra() {
        return hrCobra;
    }

    /**
     * Cobra Person
     * <p>
     * Lineage reference object : hrCobra
     * 
     */
    @JsonProperty("hrCobra")
    public void setHrCobra(String hrCobra) {
        this.hrCobra = hrCobra;
    }

    public SystemIdentification100GetResponse withHrCobra(String hrCobra) {
        this.hrCobra = hrCobra;
        return this;
    }

    /**
     * Employee
     * <p>
     * Lineage reference object : hrEmpl
     * 
     */
    @JsonProperty("hrEmpl")
    public String getHrEmpl() {
        return hrEmpl;
    }

    /**
     * Employee
     * <p>
     * Lineage reference object : hrEmpl
     * 
     */
    @JsonProperty("hrEmpl")
    public void setHrEmpl(String hrEmpl) {
        this.hrEmpl = hrEmpl;
    }

    public SystemIdentification100GetResponse withHrEmpl(String hrEmpl) {
        this.hrEmpl = hrEmpl;
        return this;
    }

    /**
     * Employee
     * <p>
     * Lineage reference object : finEmpl
     * 
     */
    @JsonProperty("finEmpl")
    public String getFinEmpl() {
        return finEmpl;
    }

    /**
     * Employee
     * <p>
     * Lineage reference object : finEmpl
     * 
     */
    @JsonProperty("finEmpl")
    public void setFinEmpl(String finEmpl) {
        this.finEmpl = finEmpl;
    }

    public SystemIdentification100GetResponse withFinEmpl(String finEmpl) {
        this.finEmpl = finEmpl;
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

    public SystemIdentification100GetResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Category
     * <p>
     * Lineage reference object : advIndivDonrCatg
     * 
     */
    @JsonProperty("advIndivDonrCatg")
    public String getAdvIndivDonrCatg() {
        return advIndivDonrCatg;
    }

    /**
     * Category
     * <p>
     * Lineage reference object : advIndivDonrCatg
     * 
     */
    @JsonProperty("advIndivDonrCatg")
    public void setAdvIndivDonrCatg(String advIndivDonrCatg) {
        this.advIndivDonrCatg = advIndivDonrCatg;
    }

    public SystemIdentification100GetResponse withAdvIndivDonrCatg(String advIndivDonrCatg) {
        this.advIndivDonrCatg = advIndivDonrCatg;
        return this;
    }

    /**
     * Agency
     * <p>
     * Lineage reference object : finAgency
     * 
     */
    @JsonProperty("finAgency")
    public String getFinAgency() {
        return finAgency;
    }

    /**
     * Agency
     * <p>
     * Lineage reference object : finAgency
     * 
     */
    @JsonProperty("finAgency")
    public void setFinAgency(String finAgency) {
        this.finAgency = finAgency;
    }

    public SystemIdentification100GetResponse withFinAgency(String finAgency) {
        this.finAgency = finAgency;
        return this;
    }

    /**
     * Recruiting
     * <p>
     * Lineage reference object : stdRecr
     * 
     */
    @JsonProperty("stdRecr")
    public String getStdRecr() {
        return stdRecr;
    }

    /**
     * Recruiting
     * <p>
     * Lineage reference object : stdRecr
     * 
     */
    @JsonProperty("stdRecr")
    public void setStdRecr(String stdRecr) {
        this.stdRecr = stdRecr;
    }

    public SystemIdentification100GetResponse withStdRecr(String stdRecr) {
        this.stdRecr = stdRecr;
        return this;
    }

    /**
     * Applicant
     * <p>
     * Lineage reference object : finAidAppl
     * 
     */
    @JsonProperty("finAidAppl")
    public String getFinAidAppl() {
        return finAidAppl;
    }

    /**
     * Applicant
     * <p>
     * Lineage reference object : finAidAppl
     * 
     */
    @JsonProperty("finAidAppl")
    public void setFinAidAppl(String finAidAppl) {
        this.finAidAppl = finAidAppl;
    }

    public SystemIdentification100GetResponse withFinAidAppl(String finAidAppl) {
        this.finAidAppl = finAidAppl;
        return this;
    }

    /**
     * General Student
     * <p>
     * Lineage reference object : stdGenr
     * 
     */
    @JsonProperty("stdGenr")
    public String getStdGenr() {
        return stdGenr;
    }

    /**
     * General Student
     * <p>
     * Lineage reference object : stdGenr
     * 
     */
    @JsonProperty("stdGenr")
    public void setStdGenr(String stdGenr) {
        this.stdGenr = stdGenr;
    }

    public SystemIdentification100GetResponse withStdGenr(String stdGenr) {
        this.stdGenr = stdGenr;
        return this;
    }

    /**
     * Individual
     * <p>
     * Lineage reference object : aluConst
     * 
     */
    @JsonProperty("aluConst")
    public String getAluConst() {
        return aluConst;
    }

    /**
     * Individual
     * <p>
     * Lineage reference object : aluConst
     * 
     */
    @JsonProperty("aluConst")
    public void setAluConst(String aluConst) {
        this.aluConst = aluConst;
    }

    public SystemIdentification100GetResponse withAluConst(String aluConst) {
        this.aluConst = aluConst;
        return this;
    }

    /**
     * Registration
     * <p>
     * Lineage reference object : stdRegr
     * 
     */
    @JsonProperty("stdRegr")
    public String getStdRegr() {
        return stdRegr;
    }

    /**
     * Registration
     * <p>
     * Lineage reference object : stdRegr
     * 
     */
    @JsonProperty("stdRegr")
    public void setStdRegr(String stdRegr) {
        this.stdRegr = stdRegr;
    }

    public SystemIdentification100GetResponse withStdRegr(String stdRegr) {
        this.stdRegr = stdRegr;
        return this;
    }

    /**
     * Customer
     * <p>
     * Lineage reference object : finCust
     * 
     */
    @JsonProperty("finCust")
    public String getFinCust() {
        return finCust;
    }

    /**
     * Customer
     * <p>
     * Lineage reference object : finCust
     * 
     */
    @JsonProperty("finCust")
    public void setFinCust(String finCust) {
        this.finCust = finCust;
    }

    public SystemIdentification100GetResponse withFinCust(String finCust) {
        this.finCust = finCust;
        return this;
    }

    /**
     * Transfer Work
     * <p>
     * Lineage reference object : stdTran
     * 
     */
    @JsonProperty("stdTran")
    public String getStdTran() {
        return stdTran;
    }

    /**
     * Transfer Work
     * <p>
     * Lineage reference object : stdTran
     * 
     */
    @JsonProperty("stdTran")
    public void setStdTran(String stdTran) {
        this.stdTran = stdTran;
    }

    public SystemIdentification100GetResponse withStdTran(String stdTran) {
        this.stdTran = stdTran;
        return this;
    }

    /**
     * Housing
     * <p>
     * Lineage reference object : stdHous
     * 
     */
    @JsonProperty("stdHous")
    public String getStdHous() {
        return stdHous;
    }

    /**
     * Housing
     * <p>
     * Lineage reference object : stdHous
     * 
     */
    @JsonProperty("stdHous")
    public void setStdHous(String stdHous) {
        this.stdHous = stdHous;
    }

    public SystemIdentification100GetResponse withStdHous(String stdHous) {
        this.stdHous = stdHous;
        return this;
    }

    /**
     * Lineage reference object : hrHeading
     * 
     */
    @JsonProperty("hrHeading")
    public String getHrHeading() {
        return hrHeading;
    }

    /**
     * Lineage reference object : hrHeading
     * 
     */
    @JsonProperty("hrHeading")
    public void setHrHeading(String hrHeading) {
        this.hrHeading = hrHeading;
    }

    public SystemIdentification100GetResponse withHrHeading(String hrHeading) {
        this.hrHeading = hrHeading;
        return this;
    }

    /**
     * Lineage reference object : arHeading2
     * 
     */
    @JsonProperty("arHeading2")
    public String getArHeading2() {
        return arHeading2;
    }

    /**
     * Lineage reference object : arHeading2
     * 
     */
    @JsonProperty("arHeading2")
    public void setArHeading2(String arHeading2) {
        this.arHeading2 = arHeading2;
    }

    public SystemIdentification100GetResponse withArHeading2(String arHeading2) {
        this.arHeading2 = arHeading2;
        return this;
    }

    /**
     * Lineage reference object : arHeading1
     * 
     */
    @JsonProperty("arHeading1")
    public String getArHeading1() {
        return arHeading1;
    }

    /**
     * Lineage reference object : arHeading1
     * 
     */
    @JsonProperty("arHeading1")
    public void setArHeading1(String arHeading1) {
        this.arHeading1 = arHeading1;
    }

    public SystemIdentification100GetResponse withArHeading1(String arHeading1) {
        this.arHeading1 = arHeading1;
        return this;
    }

    /**
     * Accounts Receivable
     * <p>
     * Lineage reference object : ar
     * 
     */
    @JsonProperty("ar")
    public String getAr() {
        return ar;
    }

    /**
     * Accounts Receivable
     * <p>
     * Lineage reference object : ar
     * 
     */
    @JsonProperty("ar")
    public void setAr(String ar) {
        this.ar = ar;
    }

    public SystemIdentification100GetResponse withAr(String ar) {
        this.ar = ar;
        return this;
    }

    /**
     * Bank
     * <p>
     * Lineage reference object : finBank
     * 
     */
    @JsonProperty("finBank")
    public String getFinBank() {
        return finBank;
    }

    /**
     * Bank
     * <p>
     * Lineage reference object : finBank
     * 
     */
    @JsonProperty("finBank")
    public void setFinBank(String finBank) {
        this.finBank = finBank;
    }

    public SystemIdentification100GetResponse withFinBank(String finBank) {
        this.finBank = finBank;
        return this;
    }

    /**
     * Financial Manager
     * <p>
     * Lineage reference object : finMagr
     * 
     */
    @JsonProperty("finMagr")
    public String getFinMagr() {
        return finMagr;
    }

    /**
     * Financial Manager
     * <p>
     * Lineage reference object : finMagr
     * 
     */
    @JsonProperty("finMagr")
    public void setFinMagr(String finMagr) {
        this.finMagr = finMagr;
    }

    public SystemIdentification100GetResponse withFinMagr(String finMagr) {
        this.finMagr = finMagr;
        return this;
    }

    /**
     * Faculty
     * <p>
     * Lineage reference object : stdFacu
     * 
     */
    @JsonProperty("stdFacu")
    public String getStdFacu() {
        return stdFacu;
    }

    /**
     * Faculty
     * <p>
     * Lineage reference object : stdFacu
     * 
     */
    @JsonProperty("stdFacu")
    public void setStdFacu(String stdFacu) {
        this.stdFacu = stdFacu;
    }

    public SystemIdentification100GetResponse withStdFacu(String stdFacu) {
        this.stdFacu = stdFacu;
        return this;
    }

    /**
     * Lineage reference object : finAidHeading
     * 
     */
    @JsonProperty("finAidHeading")
    public String getFinAidHeading() {
        return finAidHeading;
    }

    /**
     * Lineage reference object : finAidHeading
     * 
     */
    @JsonProperty("finAidHeading")
    public void setFinAidHeading(String finAidHeading) {
        this.finAidHeading = finAidHeading;
    }

    public SystemIdentification100GetResponse withFinAidHeading(String finAidHeading) {
        this.finAidHeading = finAidHeading;
        return this;
    }

    /**
     * Lineage reference object : dcsdMsg
     * 
     */
    @JsonProperty("dcsdMsg")
    public String getDcsdMsg() {
        return dcsdMsg;
    }

    /**
     * Lineage reference object : dcsdMsg
     * 
     */
    @JsonProperty("dcsdMsg")
    public void setDcsdMsg(String dcsdMsg) {
        this.dcsdMsg = dcsdMsg;
    }

    public SystemIdentification100GetResponse withDcsdMsg(String dcsdMsg) {
        this.dcsdMsg = dcsdMsg;
        return this;
    }

    /**
     * Class
     * <p>
     * Lineage reference object : advIndivPrefClas
     * 
     */
    @JsonProperty("advIndivPrefClas")
    public String getAdvIndivPrefClas() {
        return advIndivPrefClas;
    }

    /**
     * Class
     * <p>
     * Lineage reference object : advIndivPrefClas
     * 
     */
    @JsonProperty("advIndivPrefClas")
    public void setAdvIndivPrefClas(String advIndivPrefClas) {
        this.advIndivPrefClas = advIndivPrefClas;
    }

    public SystemIdentification100GetResponse withAdvIndivPrefClas(String advIndivPrefClas) {
        this.advIndivPrefClas = advIndivPrefClas;
        return this;
    }

    /**
     * Lineage reference object : nname
     * 
     */
    @JsonProperty("nname")
    public String getNname() {
        return nname;
    }

    /**
     * Lineage reference object : nname
     * 
     */
    @JsonProperty("nname")
    public void setNname(String nname) {
        this.nname = nname;
    }

    public SystemIdentification100GetResponse withNname(String nname) {
        this.nname = nname;
        return this;
    }

    /**
     * Category
     * <p>
     * Lineage reference object : advOrgnDonrCatg
     * 
     */
    @JsonProperty("advOrgnDonrCatg")
    public String getAdvOrgnDonrCatg() {
        return advOrgnDonrCatg;
    }

    /**
     * Category
     * <p>
     * Lineage reference object : advOrgnDonrCatg
     * 
     */
    @JsonProperty("advOrgnDonrCatg")
    public void setAdvOrgnDonrCatg(String advOrgnDonrCatg) {
        this.advOrgnDonrCatg = advOrgnDonrCatg;
    }

    public SystemIdentification100GetResponse withAdvOrgnDonrCatg(String advOrgnDonrCatg) {
        this.advOrgnDonrCatg = advOrgnDonrCatg;
        return this;
    }

    /**
     * Beneficiary
     * <p>
     * Lineage reference object : hrBene
     * 
     */
    @JsonProperty("hrBene")
    public String getHrBene() {
        return hrBene;
    }

    /**
     * Beneficiary
     * <p>
     * Lineage reference object : hrBene
     * 
     */
    @JsonProperty("hrBene")
    public void setHrBene(String hrBene) {
        this.hrBene = hrBene;
    }

    public SystemIdentification100GetResponse withHrBene(String hrBene) {
        this.hrBene = hrBene;
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

    public SystemIdentification100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SystemIdentification100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("finHeading");
        sb.append('=');
        sb.append(((this.finHeading == null)?"<null>":this.finHeading));
        sb.append(',');
        sb.append("aluHeading");
        sb.append('=');
        sb.append(((this.aluHeading == null)?"<null>":this.aluHeading));
        sb.append(',');
        sb.append("hrAppl");
        sb.append('=');
        sb.append(((this.hrAppl == null)?"<null>":this.hrAppl));
        sb.append(',');
        sb.append("confidMsg");
        sb.append('=');
        sb.append(((this.confidMsg == null)?"<null>":this.confidMsg));
        sb.append(',');
        sb.append("stdAdm");
        sb.append('=');
        sb.append(((this.stdAdm == null)?"<null>":this.stdAdm));
        sb.append(',');
        sb.append("aluOrgn");
        sb.append('=');
        sb.append(((this.aluOrgn == null)?"<null>":this.aluOrgn));
        sb.append(',');
        sb.append("stdHeading");
        sb.append('=');
        sb.append(((this.stdHeading == null)?"<null>":this.stdHeading));
        sb.append(',');
        sb.append("finVend");
        sb.append('=');
        sb.append(((this.finVend == null)?"<null>":this.finVend));
        sb.append(',');
        sb.append("hrCobra");
        sb.append('=');
        sb.append(((this.hrCobra == null)?"<null>":this.hrCobra));
        sb.append(',');
        sb.append("hrEmpl");
        sb.append('=');
        sb.append(((this.hrEmpl == null)?"<null>":this.hrEmpl));
        sb.append(',');
        sb.append("finEmpl");
        sb.append('=');
        sb.append(((this.finEmpl == null)?"<null>":this.finEmpl));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("advIndivDonrCatg");
        sb.append('=');
        sb.append(((this.advIndivDonrCatg == null)?"<null>":this.advIndivDonrCatg));
        sb.append(',');
        sb.append("finAgency");
        sb.append('=');
        sb.append(((this.finAgency == null)?"<null>":this.finAgency));
        sb.append(',');
        sb.append("stdRecr");
        sb.append('=');
        sb.append(((this.stdRecr == null)?"<null>":this.stdRecr));
        sb.append(',');
        sb.append("finAidAppl");
        sb.append('=');
        sb.append(((this.finAidAppl == null)?"<null>":this.finAidAppl));
        sb.append(',');
        sb.append("stdGenr");
        sb.append('=');
        sb.append(((this.stdGenr == null)?"<null>":this.stdGenr));
        sb.append(',');
        sb.append("aluConst");
        sb.append('=');
        sb.append(((this.aluConst == null)?"<null>":this.aluConst));
        sb.append(',');
        sb.append("stdRegr");
        sb.append('=');
        sb.append(((this.stdRegr == null)?"<null>":this.stdRegr));
        sb.append(',');
        sb.append("finCust");
        sb.append('=');
        sb.append(((this.finCust == null)?"<null>":this.finCust));
        sb.append(',');
        sb.append("stdTran");
        sb.append('=');
        sb.append(((this.stdTran == null)?"<null>":this.stdTran));
        sb.append(',');
        sb.append("stdHous");
        sb.append('=');
        sb.append(((this.stdHous == null)?"<null>":this.stdHous));
        sb.append(',');
        sb.append("hrHeading");
        sb.append('=');
        sb.append(((this.hrHeading == null)?"<null>":this.hrHeading));
        sb.append(',');
        sb.append("arHeading2");
        sb.append('=');
        sb.append(((this.arHeading2 == null)?"<null>":this.arHeading2));
        sb.append(',');
        sb.append("arHeading1");
        sb.append('=');
        sb.append(((this.arHeading1 == null)?"<null>":this.arHeading1));
        sb.append(',');
        sb.append("ar");
        sb.append('=');
        sb.append(((this.ar == null)?"<null>":this.ar));
        sb.append(',');
        sb.append("finBank");
        sb.append('=');
        sb.append(((this.finBank == null)?"<null>":this.finBank));
        sb.append(',');
        sb.append("finMagr");
        sb.append('=');
        sb.append(((this.finMagr == null)?"<null>":this.finMagr));
        sb.append(',');
        sb.append("stdFacu");
        sb.append('=');
        sb.append(((this.stdFacu == null)?"<null>":this.stdFacu));
        sb.append(',');
        sb.append("finAidHeading");
        sb.append('=');
        sb.append(((this.finAidHeading == null)?"<null>":this.finAidHeading));
        sb.append(',');
        sb.append("dcsdMsg");
        sb.append('=');
        sb.append(((this.dcsdMsg == null)?"<null>":this.dcsdMsg));
        sb.append(',');
        sb.append("advIndivPrefClas");
        sb.append('=');
        sb.append(((this.advIndivPrefClas == null)?"<null>":this.advIndivPrefClas));
        sb.append(',');
        sb.append("nname");
        sb.append('=');
        sb.append(((this.nname == null)?"<null>":this.nname));
        sb.append(',');
        sb.append("advOrgnDonrCatg");
        sb.append('=');
        sb.append(((this.advOrgnDonrCatg == null)?"<null>":this.advOrgnDonrCatg));
        sb.append(',');
        sb.append("hrBene");
        sb.append('=');
        sb.append(((this.hrBene == null)?"<null>":this.hrBene));
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
        result = ((result* 31)+((this.finHeading == null)? 0 :this.finHeading.hashCode()));
        result = ((result* 31)+((this.aluHeading == null)? 0 :this.aluHeading.hashCode()));
        result = ((result* 31)+((this.hrAppl == null)? 0 :this.hrAppl.hashCode()));
        result = ((result* 31)+((this.confidMsg == null)? 0 :this.confidMsg.hashCode()));
        result = ((result* 31)+((this.stdAdm == null)? 0 :this.stdAdm.hashCode()));
        result = ((result* 31)+((this.aluOrgn == null)? 0 :this.aluOrgn.hashCode()));
        result = ((result* 31)+((this.stdHeading == null)? 0 :this.stdHeading.hashCode()));
        result = ((result* 31)+((this.finVend == null)? 0 :this.finVend.hashCode()));
        result = ((result* 31)+((this.hrCobra == null)? 0 :this.hrCobra.hashCode()));
        result = ((result* 31)+((this.hrEmpl == null)? 0 :this.hrEmpl.hashCode()));
        result = ((result* 31)+((this.finEmpl == null)? 0 :this.finEmpl.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.advIndivDonrCatg == null)? 0 :this.advIndivDonrCatg.hashCode()));
        result = ((result* 31)+((this.finAgency == null)? 0 :this.finAgency.hashCode()));
        result = ((result* 31)+((this.stdRecr == null)? 0 :this.stdRecr.hashCode()));
        result = ((result* 31)+((this.finAidAppl == null)? 0 :this.finAidAppl.hashCode()));
        result = ((result* 31)+((this.stdGenr == null)? 0 :this.stdGenr.hashCode()));
        result = ((result* 31)+((this.aluConst == null)? 0 :this.aluConst.hashCode()));
        result = ((result* 31)+((this.stdRegr == null)? 0 :this.stdRegr.hashCode()));
        result = ((result* 31)+((this.finCust == null)? 0 :this.finCust.hashCode()));
        result = ((result* 31)+((this.stdTran == null)? 0 :this.stdTran.hashCode()));
        result = ((result* 31)+((this.stdHous == null)? 0 :this.stdHous.hashCode()));
        result = ((result* 31)+((this.hrHeading == null)? 0 :this.hrHeading.hashCode()));
        result = ((result* 31)+((this.arHeading2 == null)? 0 :this.arHeading2 .hashCode()));
        result = ((result* 31)+((this.arHeading1 == null)? 0 :this.arHeading1 .hashCode()));
        result = ((result* 31)+((this.ar == null)? 0 :this.ar.hashCode()));
        result = ((result* 31)+((this.finBank == null)? 0 :this.finBank.hashCode()));
        result = ((result* 31)+((this.finMagr == null)? 0 :this.finMagr.hashCode()));
        result = ((result* 31)+((this.stdFacu == null)? 0 :this.stdFacu.hashCode()));
        result = ((result* 31)+((this.finAidHeading == null)? 0 :this.finAidHeading.hashCode()));
        result = ((result* 31)+((this.dcsdMsg == null)? 0 :this.dcsdMsg.hashCode()));
        result = ((result* 31)+((this.advIndivPrefClas == null)? 0 :this.advIndivPrefClas.hashCode()));
        result = ((result* 31)+((this.nname == null)? 0 :this.nname.hashCode()));
        result = ((result* 31)+((this.advOrgnDonrCatg == null)? 0 :this.advOrgnDonrCatg.hashCode()));
        result = ((result* 31)+((this.hrBene == null)? 0 :this.hrBene.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SystemIdentification100GetResponse) == false) {
            return false;
        }
        SystemIdentification100GetResponse rhs = ((SystemIdentification100GetResponse) other);
        return (((((((((((((((((((((((((((((((((((((this.finHeading == rhs.finHeading)||((this.finHeading!= null)&&this.finHeading.equals(rhs.finHeading)))&&((this.aluHeading == rhs.aluHeading)||((this.aluHeading!= null)&&this.aluHeading.equals(rhs.aluHeading))))&&((this.hrAppl == rhs.hrAppl)||((this.hrAppl!= null)&&this.hrAppl.equals(rhs.hrAppl))))&&((this.confidMsg == rhs.confidMsg)||((this.confidMsg!= null)&&this.confidMsg.equals(rhs.confidMsg))))&&((this.stdAdm == rhs.stdAdm)||((this.stdAdm!= null)&&this.stdAdm.equals(rhs.stdAdm))))&&((this.aluOrgn == rhs.aluOrgn)||((this.aluOrgn!= null)&&this.aluOrgn.equals(rhs.aluOrgn))))&&((this.stdHeading == rhs.stdHeading)||((this.stdHeading!= null)&&this.stdHeading.equals(rhs.stdHeading))))&&((this.finVend == rhs.finVend)||((this.finVend!= null)&&this.finVend.equals(rhs.finVend))))&&((this.hrCobra == rhs.hrCobra)||((this.hrCobra!= null)&&this.hrCobra.equals(rhs.hrCobra))))&&((this.hrEmpl == rhs.hrEmpl)||((this.hrEmpl!= null)&&this.hrEmpl.equals(rhs.hrEmpl))))&&((this.finEmpl == rhs.finEmpl)||((this.finEmpl!= null)&&this.finEmpl.equals(rhs.finEmpl))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.advIndivDonrCatg == rhs.advIndivDonrCatg)||((this.advIndivDonrCatg!= null)&&this.advIndivDonrCatg.equals(rhs.advIndivDonrCatg))))&&((this.finAgency == rhs.finAgency)||((this.finAgency!= null)&&this.finAgency.equals(rhs.finAgency))))&&((this.stdRecr == rhs.stdRecr)||((this.stdRecr!= null)&&this.stdRecr.equals(rhs.stdRecr))))&&((this.finAidAppl == rhs.finAidAppl)||((this.finAidAppl!= null)&&this.finAidAppl.equals(rhs.finAidAppl))))&&((this.stdGenr == rhs.stdGenr)||((this.stdGenr!= null)&&this.stdGenr.equals(rhs.stdGenr))))&&((this.aluConst == rhs.aluConst)||((this.aluConst!= null)&&this.aluConst.equals(rhs.aluConst))))&&((this.stdRegr == rhs.stdRegr)||((this.stdRegr!= null)&&this.stdRegr.equals(rhs.stdRegr))))&&((this.finCust == rhs.finCust)||((this.finCust!= null)&&this.finCust.equals(rhs.finCust))))&&((this.stdTran == rhs.stdTran)||((this.stdTran!= null)&&this.stdTran.equals(rhs.stdTran))))&&((this.stdHous == rhs.stdHous)||((this.stdHous!= null)&&this.stdHous.equals(rhs.stdHous))))&&((this.hrHeading == rhs.hrHeading)||((this.hrHeading!= null)&&this.hrHeading.equals(rhs.hrHeading))))&&((this.arHeading2 == rhs.arHeading2)||((this.arHeading2 != null)&&this.arHeading2 .equals(rhs.arHeading2))))&&((this.arHeading1 == rhs.arHeading1)||((this.arHeading1 != null)&&this.arHeading1 .equals(rhs.arHeading1))))&&((this.ar == rhs.ar)||((this.ar!= null)&&this.ar.equals(rhs.ar))))&&((this.finBank == rhs.finBank)||((this.finBank!= null)&&this.finBank.equals(rhs.finBank))))&&((this.finMagr == rhs.finMagr)||((this.finMagr!= null)&&this.finMagr.equals(rhs.finMagr))))&&((this.stdFacu == rhs.stdFacu)||((this.stdFacu!= null)&&this.stdFacu.equals(rhs.stdFacu))))&&((this.finAidHeading == rhs.finAidHeading)||((this.finAidHeading!= null)&&this.finAidHeading.equals(rhs.finAidHeading))))&&((this.dcsdMsg == rhs.dcsdMsg)||((this.dcsdMsg!= null)&&this.dcsdMsg.equals(rhs.dcsdMsg))))&&((this.advIndivPrefClas == rhs.advIndivPrefClas)||((this.advIndivPrefClas!= null)&&this.advIndivPrefClas.equals(rhs.advIndivPrefClas))))&&((this.nname == rhs.nname)||((this.nname!= null)&&this.nname.equals(rhs.nname))))&&((this.advOrgnDonrCatg == rhs.advOrgnDonrCatg)||((this.advOrgnDonrCatg!= null)&&this.advOrgnDonrCatg.equals(rhs.advOrgnDonrCatg))))&&((this.hrBene == rhs.hrBene)||((this.hrBene!= null)&&this.hrBene.equals(rhs.hrBene))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
