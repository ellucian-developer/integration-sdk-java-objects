
package com.ellucian.generated.bpapi.ban.finance_detail_codes.v1_0_0;

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
    "tbracctAOrgnCode",
    "tbracctCode",
    "tbracctBRuclCode2",
    "tbracctBRuclCode3",
    "tbracctAAcciCode",
    "tbracctBOrgnCode",
    "tbracctBRuclCode1",
    "tbracctAActvCode",
    "tbracctBActvCode",
    "tbracctARuclCode1",
    "tbracctARuclCode2",
    "tbracctBFundCode",
    "tbracctARuclCode3",
    "tbracctAFundCode",
    "tbracctALocnCode",
    "tbracctBAcctCode",
    "tbracctAProgCode",
    "accountPercent2",
    "tbracctBProgCode",
    "tbracctAAcctCode",
    "tbracctBCoasCode",
    "tbracctACoasCode",
    "tbracctBAcciCode",
    "tbracctBLocnCode"
})
@Generated("jsonschema2pojo")
public class Tbracct2 {

    /**
     * Account A - Orgn
     * <p>
     * Lineage reference object : TBRACCT_A_ORGN_CODE
     * 
     */
    @JsonProperty("tbracctAOrgnCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_A_ORGN_CODE")
    private String tbracctAOrgnCode;
    /**
     * Designator
     * <p>
     * 
     * 
     */
    @JsonProperty("tbracctCode")
    private String tbracctCode;
    /**
     * Account B - Rule Class 2
     * <p>
     * Lineage reference object : TBRACCT_B_RUCL_CODE2
     * 
     */
    @JsonProperty("tbracctBRuclCode2")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_B_RUCL_CODE2")
    private String tbracctBRuclCode2;
    /**
     * Account B - Rule Class 3
     * <p>
     * Lineage reference object : TBRACCT_B_RUCL_CODE3
     * 
     */
    @JsonProperty("tbracctBRuclCode3")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_B_RUCL_CODE3")
    private String tbracctBRuclCode3;
    /**
     * Account A - Account Index
     * <p>
     * Lineage reference object : TBRACCT_A_ACCI_CODE
     * 
     */
    @JsonProperty("tbracctAAcciCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_A_ACCI_CODE")
    private String tbracctAAcciCode;
    /**
     * Account B - Orgn
     * <p>
     * Lineage reference object : TBRACCT_B_ORGN_CODE
     * 
     */
    @JsonProperty("tbracctBOrgnCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_B_ORGN_CODE")
    private String tbracctBOrgnCode;
    /**
     * Account B - Rule Class 1
     * <p>
     * Lineage reference object : TBRACCT_B_RUCL_CODE1
     * 
     */
    @JsonProperty("tbracctBRuclCode1")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_B_RUCL_CODE1")
    private String tbracctBRuclCode1;
    /**
     * Account A - Activity
     * <p>
     * Lineage reference object : TBRACCT_A_ACTV_CODE
     * 
     */
    @JsonProperty("tbracctAActvCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_A_ACTV_CODE")
    private String tbracctAActvCode;
    /**
     * Account B - Activity
     * <p>
     * Lineage reference object : TBRACCT_B_ACTV_CODE
     * 
     */
    @JsonProperty("tbracctBActvCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_B_ACTV_CODE")
    private String tbracctBActvCode;
    /**
     * Account A - Rule Class 1
     * <p>
     * Lineage reference object : TBRACCT_A_RUCL_CODE1
     * 
     */
    @JsonProperty("tbracctARuclCode1")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_A_RUCL_CODE1")
    private String tbracctARuclCode1;
    /**
     * Account A - Rule Class 2
     * <p>
     * Lineage reference object : TBRACCT_A_RUCL_CODE2
     * 
     */
    @JsonProperty("tbracctARuclCode2")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_A_RUCL_CODE2")
    private String tbracctARuclCode2;
    /**
     * Account B - Fund
     * <p>
     * Lineage reference object : TBRACCT_B_FUND_CODE
     * 
     */
    @JsonProperty("tbracctBFundCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_B_FUND_CODE")
    private String tbracctBFundCode;
    /**
     * Account A - Rule Class 3
     * <p>
     * Lineage reference object : TBRACCT_A_RUCL_CODE3
     * 
     */
    @JsonProperty("tbracctARuclCode3")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_A_RUCL_CODE3")
    private String tbracctARuclCode3;
    /**
     * Account A - Fund
     * <p>
     * Lineage reference object : TBRACCT_A_FUND_CODE
     * 
     */
    @JsonProperty("tbracctAFundCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_A_FUND_CODE")
    private String tbracctAFundCode;
    /**
     * Account A - Location
     * <p>
     * Lineage reference object : TBRACCT_A_LOCN_CODE
     * 
     */
    @JsonProperty("tbracctALocnCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_A_LOCN_CODE")
    private String tbracctALocnCode;
    /**
     * Account B - Account
     * <p>
     * Lineage reference object : TBRACCT_B_ACCT_CODE
     * 
     */
    @JsonProperty("tbracctBAcctCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_B_ACCT_CODE")
    private String tbracctBAcctCode;
    /**
     * Account A - Program
     * <p>
     * Lineage reference object : TBRACCT_A_PROG_CODE
     * 
     */
    @JsonProperty("tbracctAProgCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_A_PROG_CODE")
    private String tbracctAProgCode;
    /**
     * Percent
     * <p>
     * 
     * 
     */
    @JsonProperty("accountPercent2")
    private Double accountPercent2;
    /**
     * Account B - Program
     * <p>
     * Lineage reference object : TBRACCT_B_PROG_CODE
     * 
     */
    @JsonProperty("tbracctBProgCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_B_PROG_CODE")
    private String tbracctBProgCode;
    /**
     * Account A - Account
     * <p>
     * Lineage reference object : TBRACCT_A_ACCT_CODE
     * 
     */
    @JsonProperty("tbracctAAcctCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_A_ACCT_CODE")
    private String tbracctAAcctCode;
    /**
     * Account B - COA
     * <p>
     * Lineage reference object : TBRACCT_B_COAS_CODE
     * (Required)
     * 
     */
    @JsonProperty("tbracctBCoasCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_B_COAS_CODE")
    private String tbracctBCoasCode;
    /**
     * Account A - COA
     * <p>
     * Lineage reference object : TBRACCT_A_COAS_CODE
     * (Required)
     * 
     */
    @JsonProperty("tbracctACoasCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_A_COAS_CODE")
    private String tbracctACoasCode;
    /**
     * Account B - Account Index
     * <p>
     * Lineage reference object : TBRACCT_B_ACCI_CODE
     * 
     */
    @JsonProperty("tbracctBAcciCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_B_ACCI_CODE")
    private String tbracctBAcciCode;
    /**
     * Account B - Location
     * <p>
     * Lineage reference object : TBRACCT_B_LOCN_CODE
     * 
     */
    @JsonProperty("tbracctBLocnCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_B_LOCN_CODE")
    private String tbracctBLocnCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Account A - Orgn
     * <p>
     * Lineage reference object : TBRACCT_A_ORGN_CODE
     * 
     */
    @JsonProperty("tbracctAOrgnCode")
    public String getTbracctAOrgnCode() {
        return tbracctAOrgnCode;
    }

    /**
     * Account A - Orgn
     * <p>
     * Lineage reference object : TBRACCT_A_ORGN_CODE
     * 
     */
    @JsonProperty("tbracctAOrgnCode")
    public void setTbracctAOrgnCode(String tbracctAOrgnCode) {
        this.tbracctAOrgnCode = tbracctAOrgnCode;
    }

    public Tbracct2 withTbracctAOrgnCode(String tbracctAOrgnCode) {
        this.tbracctAOrgnCode = tbracctAOrgnCode;
        return this;
    }

    /**
     * Designator
     * <p>
     * 
     * 
     */
    @JsonProperty("tbracctCode")
    public String getTbracctCode() {
        return tbracctCode;
    }

    /**
     * Designator
     * <p>
     * 
     * 
     */
    @JsonProperty("tbracctCode")
    public void setTbracctCode(String tbracctCode) {
        this.tbracctCode = tbracctCode;
    }

    public Tbracct2 withTbracctCode(String tbracctCode) {
        this.tbracctCode = tbracctCode;
        return this;
    }

    /**
     * Account B - Rule Class 2
     * <p>
     * Lineage reference object : TBRACCT_B_RUCL_CODE2
     * 
     */
    @JsonProperty("tbracctBRuclCode2")
    public String getTbracctBRuclCode2() {
        return tbracctBRuclCode2;
    }

    /**
     * Account B - Rule Class 2
     * <p>
     * Lineage reference object : TBRACCT_B_RUCL_CODE2
     * 
     */
    @JsonProperty("tbracctBRuclCode2")
    public void setTbracctBRuclCode2(String tbracctBRuclCode2) {
        this.tbracctBRuclCode2 = tbracctBRuclCode2;
    }

    public Tbracct2 withTbracctBRuclCode2(String tbracctBRuclCode2) {
        this.tbracctBRuclCode2 = tbracctBRuclCode2;
        return this;
    }

    /**
     * Account B - Rule Class 3
     * <p>
     * Lineage reference object : TBRACCT_B_RUCL_CODE3
     * 
     */
    @JsonProperty("tbracctBRuclCode3")
    public String getTbracctBRuclCode3() {
        return tbracctBRuclCode3;
    }

    /**
     * Account B - Rule Class 3
     * <p>
     * Lineage reference object : TBRACCT_B_RUCL_CODE3
     * 
     */
    @JsonProperty("tbracctBRuclCode3")
    public void setTbracctBRuclCode3(String tbracctBRuclCode3) {
        this.tbracctBRuclCode3 = tbracctBRuclCode3;
    }

    public Tbracct2 withTbracctBRuclCode3(String tbracctBRuclCode3) {
        this.tbracctBRuclCode3 = tbracctBRuclCode3;
        return this;
    }

    /**
     * Account A - Account Index
     * <p>
     * Lineage reference object : TBRACCT_A_ACCI_CODE
     * 
     */
    @JsonProperty("tbracctAAcciCode")
    public String getTbracctAAcciCode() {
        return tbracctAAcciCode;
    }

    /**
     * Account A - Account Index
     * <p>
     * Lineage reference object : TBRACCT_A_ACCI_CODE
     * 
     */
    @JsonProperty("tbracctAAcciCode")
    public void setTbracctAAcciCode(String tbracctAAcciCode) {
        this.tbracctAAcciCode = tbracctAAcciCode;
    }

    public Tbracct2 withTbracctAAcciCode(String tbracctAAcciCode) {
        this.tbracctAAcciCode = tbracctAAcciCode;
        return this;
    }

    /**
     * Account B - Orgn
     * <p>
     * Lineage reference object : TBRACCT_B_ORGN_CODE
     * 
     */
    @JsonProperty("tbracctBOrgnCode")
    public String getTbracctBOrgnCode() {
        return tbracctBOrgnCode;
    }

    /**
     * Account B - Orgn
     * <p>
     * Lineage reference object : TBRACCT_B_ORGN_CODE
     * 
     */
    @JsonProperty("tbracctBOrgnCode")
    public void setTbracctBOrgnCode(String tbracctBOrgnCode) {
        this.tbracctBOrgnCode = tbracctBOrgnCode;
    }

    public Tbracct2 withTbracctBOrgnCode(String tbracctBOrgnCode) {
        this.tbracctBOrgnCode = tbracctBOrgnCode;
        return this;
    }

    /**
     * Account B - Rule Class 1
     * <p>
     * Lineage reference object : TBRACCT_B_RUCL_CODE1
     * 
     */
    @JsonProperty("tbracctBRuclCode1")
    public String getTbracctBRuclCode1() {
        return tbracctBRuclCode1;
    }

    /**
     * Account B - Rule Class 1
     * <p>
     * Lineage reference object : TBRACCT_B_RUCL_CODE1
     * 
     */
    @JsonProperty("tbracctBRuclCode1")
    public void setTbracctBRuclCode1(String tbracctBRuclCode1) {
        this.tbracctBRuclCode1 = tbracctBRuclCode1;
    }

    public Tbracct2 withTbracctBRuclCode1(String tbracctBRuclCode1) {
        this.tbracctBRuclCode1 = tbracctBRuclCode1;
        return this;
    }

    /**
     * Account A - Activity
     * <p>
     * Lineage reference object : TBRACCT_A_ACTV_CODE
     * 
     */
    @JsonProperty("tbracctAActvCode")
    public String getTbracctAActvCode() {
        return tbracctAActvCode;
    }

    /**
     * Account A - Activity
     * <p>
     * Lineage reference object : TBRACCT_A_ACTV_CODE
     * 
     */
    @JsonProperty("tbracctAActvCode")
    public void setTbracctAActvCode(String tbracctAActvCode) {
        this.tbracctAActvCode = tbracctAActvCode;
    }

    public Tbracct2 withTbracctAActvCode(String tbracctAActvCode) {
        this.tbracctAActvCode = tbracctAActvCode;
        return this;
    }

    /**
     * Account B - Activity
     * <p>
     * Lineage reference object : TBRACCT_B_ACTV_CODE
     * 
     */
    @JsonProperty("tbracctBActvCode")
    public String getTbracctBActvCode() {
        return tbracctBActvCode;
    }

    /**
     * Account B - Activity
     * <p>
     * Lineage reference object : TBRACCT_B_ACTV_CODE
     * 
     */
    @JsonProperty("tbracctBActvCode")
    public void setTbracctBActvCode(String tbracctBActvCode) {
        this.tbracctBActvCode = tbracctBActvCode;
    }

    public Tbracct2 withTbracctBActvCode(String tbracctBActvCode) {
        this.tbracctBActvCode = tbracctBActvCode;
        return this;
    }

    /**
     * Account A - Rule Class 1
     * <p>
     * Lineage reference object : TBRACCT_A_RUCL_CODE1
     * 
     */
    @JsonProperty("tbracctARuclCode1")
    public String getTbracctARuclCode1() {
        return tbracctARuclCode1;
    }

    /**
     * Account A - Rule Class 1
     * <p>
     * Lineage reference object : TBRACCT_A_RUCL_CODE1
     * 
     */
    @JsonProperty("tbracctARuclCode1")
    public void setTbracctARuclCode1(String tbracctARuclCode1) {
        this.tbracctARuclCode1 = tbracctARuclCode1;
    }

    public Tbracct2 withTbracctARuclCode1(String tbracctARuclCode1) {
        this.tbracctARuclCode1 = tbracctARuclCode1;
        return this;
    }

    /**
     * Account A - Rule Class 2
     * <p>
     * Lineage reference object : TBRACCT_A_RUCL_CODE2
     * 
     */
    @JsonProperty("tbracctARuclCode2")
    public String getTbracctARuclCode2() {
        return tbracctARuclCode2;
    }

    /**
     * Account A - Rule Class 2
     * <p>
     * Lineage reference object : TBRACCT_A_RUCL_CODE2
     * 
     */
    @JsonProperty("tbracctARuclCode2")
    public void setTbracctARuclCode2(String tbracctARuclCode2) {
        this.tbracctARuclCode2 = tbracctARuclCode2;
    }

    public Tbracct2 withTbracctARuclCode2(String tbracctARuclCode2) {
        this.tbracctARuclCode2 = tbracctARuclCode2;
        return this;
    }

    /**
     * Account B - Fund
     * <p>
     * Lineage reference object : TBRACCT_B_FUND_CODE
     * 
     */
    @JsonProperty("tbracctBFundCode")
    public String getTbracctBFundCode() {
        return tbracctBFundCode;
    }

    /**
     * Account B - Fund
     * <p>
     * Lineage reference object : TBRACCT_B_FUND_CODE
     * 
     */
    @JsonProperty("tbracctBFundCode")
    public void setTbracctBFundCode(String tbracctBFundCode) {
        this.tbracctBFundCode = tbracctBFundCode;
    }

    public Tbracct2 withTbracctBFundCode(String tbracctBFundCode) {
        this.tbracctBFundCode = tbracctBFundCode;
        return this;
    }

    /**
     * Account A - Rule Class 3
     * <p>
     * Lineage reference object : TBRACCT_A_RUCL_CODE3
     * 
     */
    @JsonProperty("tbracctARuclCode3")
    public String getTbracctARuclCode3() {
        return tbracctARuclCode3;
    }

    /**
     * Account A - Rule Class 3
     * <p>
     * Lineage reference object : TBRACCT_A_RUCL_CODE3
     * 
     */
    @JsonProperty("tbracctARuclCode3")
    public void setTbracctARuclCode3(String tbracctARuclCode3) {
        this.tbracctARuclCode3 = tbracctARuclCode3;
    }

    public Tbracct2 withTbracctARuclCode3(String tbracctARuclCode3) {
        this.tbracctARuclCode3 = tbracctARuclCode3;
        return this;
    }

    /**
     * Account A - Fund
     * <p>
     * Lineage reference object : TBRACCT_A_FUND_CODE
     * 
     */
    @JsonProperty("tbracctAFundCode")
    public String getTbracctAFundCode() {
        return tbracctAFundCode;
    }

    /**
     * Account A - Fund
     * <p>
     * Lineage reference object : TBRACCT_A_FUND_CODE
     * 
     */
    @JsonProperty("tbracctAFundCode")
    public void setTbracctAFundCode(String tbracctAFundCode) {
        this.tbracctAFundCode = tbracctAFundCode;
    }

    public Tbracct2 withTbracctAFundCode(String tbracctAFundCode) {
        this.tbracctAFundCode = tbracctAFundCode;
        return this;
    }

    /**
     * Account A - Location
     * <p>
     * Lineage reference object : TBRACCT_A_LOCN_CODE
     * 
     */
    @JsonProperty("tbracctALocnCode")
    public String getTbracctALocnCode() {
        return tbracctALocnCode;
    }

    /**
     * Account A - Location
     * <p>
     * Lineage reference object : TBRACCT_A_LOCN_CODE
     * 
     */
    @JsonProperty("tbracctALocnCode")
    public void setTbracctALocnCode(String tbracctALocnCode) {
        this.tbracctALocnCode = tbracctALocnCode;
    }

    public Tbracct2 withTbracctALocnCode(String tbracctALocnCode) {
        this.tbracctALocnCode = tbracctALocnCode;
        return this;
    }

    /**
     * Account B - Account
     * <p>
     * Lineage reference object : TBRACCT_B_ACCT_CODE
     * 
     */
    @JsonProperty("tbracctBAcctCode")
    public String getTbracctBAcctCode() {
        return tbracctBAcctCode;
    }

    /**
     * Account B - Account
     * <p>
     * Lineage reference object : TBRACCT_B_ACCT_CODE
     * 
     */
    @JsonProperty("tbracctBAcctCode")
    public void setTbracctBAcctCode(String tbracctBAcctCode) {
        this.tbracctBAcctCode = tbracctBAcctCode;
    }

    public Tbracct2 withTbracctBAcctCode(String tbracctBAcctCode) {
        this.tbracctBAcctCode = tbracctBAcctCode;
        return this;
    }

    /**
     * Account A - Program
     * <p>
     * Lineage reference object : TBRACCT_A_PROG_CODE
     * 
     */
    @JsonProperty("tbracctAProgCode")
    public String getTbracctAProgCode() {
        return tbracctAProgCode;
    }

    /**
     * Account A - Program
     * <p>
     * Lineage reference object : TBRACCT_A_PROG_CODE
     * 
     */
    @JsonProperty("tbracctAProgCode")
    public void setTbracctAProgCode(String tbracctAProgCode) {
        this.tbracctAProgCode = tbracctAProgCode;
    }

    public Tbracct2 withTbracctAProgCode(String tbracctAProgCode) {
        this.tbracctAProgCode = tbracctAProgCode;
        return this;
    }

    /**
     * Percent
     * <p>
     * 
     * 
     */
    @JsonProperty("accountPercent2")
    public Double getAccountPercent2() {
        return accountPercent2;
    }

    /**
     * Percent
     * <p>
     * 
     * 
     */
    @JsonProperty("accountPercent2")
    public void setAccountPercent2(Double accountPercent2) {
        this.accountPercent2 = accountPercent2;
    }

    public Tbracct2 withAccountPercent2(Double accountPercent2) {
        this.accountPercent2 = accountPercent2;
        return this;
    }

    /**
     * Account B - Program
     * <p>
     * Lineage reference object : TBRACCT_B_PROG_CODE
     * 
     */
    @JsonProperty("tbracctBProgCode")
    public String getTbracctBProgCode() {
        return tbracctBProgCode;
    }

    /**
     * Account B - Program
     * <p>
     * Lineage reference object : TBRACCT_B_PROG_CODE
     * 
     */
    @JsonProperty("tbracctBProgCode")
    public void setTbracctBProgCode(String tbracctBProgCode) {
        this.tbracctBProgCode = tbracctBProgCode;
    }

    public Tbracct2 withTbracctBProgCode(String tbracctBProgCode) {
        this.tbracctBProgCode = tbracctBProgCode;
        return this;
    }

    /**
     * Account A - Account
     * <p>
     * Lineage reference object : TBRACCT_A_ACCT_CODE
     * 
     */
    @JsonProperty("tbracctAAcctCode")
    public String getTbracctAAcctCode() {
        return tbracctAAcctCode;
    }

    /**
     * Account A - Account
     * <p>
     * Lineage reference object : TBRACCT_A_ACCT_CODE
     * 
     */
    @JsonProperty("tbracctAAcctCode")
    public void setTbracctAAcctCode(String tbracctAAcctCode) {
        this.tbracctAAcctCode = tbracctAAcctCode;
    }

    public Tbracct2 withTbracctAAcctCode(String tbracctAAcctCode) {
        this.tbracctAAcctCode = tbracctAAcctCode;
        return this;
    }

    /**
     * Account B - COA
     * <p>
     * Lineage reference object : TBRACCT_B_COAS_CODE
     * (Required)
     * 
     */
    @JsonProperty("tbracctBCoasCode")
    public String getTbracctBCoasCode() {
        return tbracctBCoasCode;
    }

    /**
     * Account B - COA
     * <p>
     * Lineage reference object : TBRACCT_B_COAS_CODE
     * (Required)
     * 
     */
    @JsonProperty("tbracctBCoasCode")
    public void setTbracctBCoasCode(String tbracctBCoasCode) {
        this.tbracctBCoasCode = tbracctBCoasCode;
    }

    public Tbracct2 withTbracctBCoasCode(String tbracctBCoasCode) {
        this.tbracctBCoasCode = tbracctBCoasCode;
        return this;
    }

    /**
     * Account A - COA
     * <p>
     * Lineage reference object : TBRACCT_A_COAS_CODE
     * (Required)
     * 
     */
    @JsonProperty("tbracctACoasCode")
    public String getTbracctACoasCode() {
        return tbracctACoasCode;
    }

    /**
     * Account A - COA
     * <p>
     * Lineage reference object : TBRACCT_A_COAS_CODE
     * (Required)
     * 
     */
    @JsonProperty("tbracctACoasCode")
    public void setTbracctACoasCode(String tbracctACoasCode) {
        this.tbracctACoasCode = tbracctACoasCode;
    }

    public Tbracct2 withTbracctACoasCode(String tbracctACoasCode) {
        this.tbracctACoasCode = tbracctACoasCode;
        return this;
    }

    /**
     * Account B - Account Index
     * <p>
     * Lineage reference object : TBRACCT_B_ACCI_CODE
     * 
     */
    @JsonProperty("tbracctBAcciCode")
    public String getTbracctBAcciCode() {
        return tbracctBAcciCode;
    }

    /**
     * Account B - Account Index
     * <p>
     * Lineage reference object : TBRACCT_B_ACCI_CODE
     * 
     */
    @JsonProperty("tbracctBAcciCode")
    public void setTbracctBAcciCode(String tbracctBAcciCode) {
        this.tbracctBAcciCode = tbracctBAcciCode;
    }

    public Tbracct2 withTbracctBAcciCode(String tbracctBAcciCode) {
        this.tbracctBAcciCode = tbracctBAcciCode;
        return this;
    }

    /**
     * Account B - Location
     * <p>
     * Lineage reference object : TBRACCT_B_LOCN_CODE
     * 
     */
    @JsonProperty("tbracctBLocnCode")
    public String getTbracctBLocnCode() {
        return tbracctBLocnCode;
    }

    /**
     * Account B - Location
     * <p>
     * Lineage reference object : TBRACCT_B_LOCN_CODE
     * 
     */
    @JsonProperty("tbracctBLocnCode")
    public void setTbracctBLocnCode(String tbracctBLocnCode) {
        this.tbracctBLocnCode = tbracctBLocnCode;
    }

    public Tbracct2 withTbracctBLocnCode(String tbracctBLocnCode) {
        this.tbracctBLocnCode = tbracctBLocnCode;
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

    public Tbracct2 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Tbracct2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tbracctAOrgnCode");
        sb.append('=');
        sb.append(((this.tbracctAOrgnCode == null)?"<null>":this.tbracctAOrgnCode));
        sb.append(',');
        sb.append("tbracctCode");
        sb.append('=');
        sb.append(((this.tbracctCode == null)?"<null>":this.tbracctCode));
        sb.append(',');
        sb.append("tbracctBRuclCode2");
        sb.append('=');
        sb.append(((this.tbracctBRuclCode2 == null)?"<null>":this.tbracctBRuclCode2));
        sb.append(',');
        sb.append("tbracctBRuclCode3");
        sb.append('=');
        sb.append(((this.tbracctBRuclCode3 == null)?"<null>":this.tbracctBRuclCode3));
        sb.append(',');
        sb.append("tbracctAAcciCode");
        sb.append('=');
        sb.append(((this.tbracctAAcciCode == null)?"<null>":this.tbracctAAcciCode));
        sb.append(',');
        sb.append("tbracctBOrgnCode");
        sb.append('=');
        sb.append(((this.tbracctBOrgnCode == null)?"<null>":this.tbracctBOrgnCode));
        sb.append(',');
        sb.append("tbracctBRuclCode1");
        sb.append('=');
        sb.append(((this.tbracctBRuclCode1 == null)?"<null>":this.tbracctBRuclCode1));
        sb.append(',');
        sb.append("tbracctAActvCode");
        sb.append('=');
        sb.append(((this.tbracctAActvCode == null)?"<null>":this.tbracctAActvCode));
        sb.append(',');
        sb.append("tbracctBActvCode");
        sb.append('=');
        sb.append(((this.tbracctBActvCode == null)?"<null>":this.tbracctBActvCode));
        sb.append(',');
        sb.append("tbracctARuclCode1");
        sb.append('=');
        sb.append(((this.tbracctARuclCode1 == null)?"<null>":this.tbracctARuclCode1));
        sb.append(',');
        sb.append("tbracctARuclCode2");
        sb.append('=');
        sb.append(((this.tbracctARuclCode2 == null)?"<null>":this.tbracctARuclCode2));
        sb.append(',');
        sb.append("tbracctBFundCode");
        sb.append('=');
        sb.append(((this.tbracctBFundCode == null)?"<null>":this.tbracctBFundCode));
        sb.append(',');
        sb.append("tbracctARuclCode3");
        sb.append('=');
        sb.append(((this.tbracctARuclCode3 == null)?"<null>":this.tbracctARuclCode3));
        sb.append(',');
        sb.append("tbracctAFundCode");
        sb.append('=');
        sb.append(((this.tbracctAFundCode == null)?"<null>":this.tbracctAFundCode));
        sb.append(',');
        sb.append("tbracctALocnCode");
        sb.append('=');
        sb.append(((this.tbracctALocnCode == null)?"<null>":this.tbracctALocnCode));
        sb.append(',');
        sb.append("tbracctBAcctCode");
        sb.append('=');
        sb.append(((this.tbracctBAcctCode == null)?"<null>":this.tbracctBAcctCode));
        sb.append(',');
        sb.append("tbracctAProgCode");
        sb.append('=');
        sb.append(((this.tbracctAProgCode == null)?"<null>":this.tbracctAProgCode));
        sb.append(',');
        sb.append("accountPercent2");
        sb.append('=');
        sb.append(((this.accountPercent2 == null)?"<null>":this.accountPercent2));
        sb.append(',');
        sb.append("tbracctBProgCode");
        sb.append('=');
        sb.append(((this.tbracctBProgCode == null)?"<null>":this.tbracctBProgCode));
        sb.append(',');
        sb.append("tbracctAAcctCode");
        sb.append('=');
        sb.append(((this.tbracctAAcctCode == null)?"<null>":this.tbracctAAcctCode));
        sb.append(',');
        sb.append("tbracctBCoasCode");
        sb.append('=');
        sb.append(((this.tbracctBCoasCode == null)?"<null>":this.tbracctBCoasCode));
        sb.append(',');
        sb.append("tbracctACoasCode");
        sb.append('=');
        sb.append(((this.tbracctACoasCode == null)?"<null>":this.tbracctACoasCode));
        sb.append(',');
        sb.append("tbracctBAcciCode");
        sb.append('=');
        sb.append(((this.tbracctBAcciCode == null)?"<null>":this.tbracctBAcciCode));
        sb.append(',');
        sb.append("tbracctBLocnCode");
        sb.append('=');
        sb.append(((this.tbracctBLocnCode == null)?"<null>":this.tbracctBLocnCode));
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
        result = ((result* 31)+((this.tbracctAOrgnCode == null)? 0 :this.tbracctAOrgnCode.hashCode()));
        result = ((result* 31)+((this.tbracctBRuclCode2 == null)? 0 :this.tbracctBRuclCode2 .hashCode()));
        result = ((result* 31)+((this.tbracctBRuclCode3 == null)? 0 :this.tbracctBRuclCode3 .hashCode()));
        result = ((result* 31)+((this.tbracctBOrgnCode == null)? 0 :this.tbracctBOrgnCode.hashCode()));
        result = ((result* 31)+((this.tbracctBRuclCode1 == null)? 0 :this.tbracctBRuclCode1 .hashCode()));
        result = ((result* 31)+((this.tbracctAActvCode == null)? 0 :this.tbracctAActvCode.hashCode()));
        result = ((result* 31)+((this.tbracctBActvCode == null)? 0 :this.tbracctBActvCode.hashCode()));
        result = ((result* 31)+((this.tbracctBFundCode == null)? 0 :this.tbracctBFundCode.hashCode()));
        result = ((result* 31)+((this.tbracctAFundCode == null)? 0 :this.tbracctAFundCode.hashCode()));
        result = ((result* 31)+((this.accountPercent2 == null)? 0 :this.accountPercent2 .hashCode()));
        result = ((result* 31)+((this.tbracctBCoasCode == null)? 0 :this.tbracctBCoasCode.hashCode()));
        result = ((result* 31)+((this.tbracctACoasCode == null)? 0 :this.tbracctACoasCode.hashCode()));
        result = ((result* 31)+((this.tbracctBAcciCode == null)? 0 :this.tbracctBAcciCode.hashCode()));
        result = ((result* 31)+((this.tbracctCode == null)? 0 :this.tbracctCode.hashCode()));
        result = ((result* 31)+((this.tbracctAAcciCode == null)? 0 :this.tbracctAAcciCode.hashCode()));
        result = ((result* 31)+((this.tbracctARuclCode1 == null)? 0 :this.tbracctARuclCode1 .hashCode()));
        result = ((result* 31)+((this.tbracctARuclCode2 == null)? 0 :this.tbracctARuclCode2 .hashCode()));
        result = ((result* 31)+((this.tbracctARuclCode3 == null)? 0 :this.tbracctARuclCode3 .hashCode()));
        result = ((result* 31)+((this.tbracctALocnCode == null)? 0 :this.tbracctALocnCode.hashCode()));
        result = ((result* 31)+((this.tbracctBAcctCode == null)? 0 :this.tbracctBAcctCode.hashCode()));
        result = ((result* 31)+((this.tbracctAProgCode == null)? 0 :this.tbracctAProgCode.hashCode()));
        result = ((result* 31)+((this.tbracctBProgCode == null)? 0 :this.tbracctBProgCode.hashCode()));
        result = ((result* 31)+((this.tbracctAAcctCode == null)? 0 :this.tbracctAAcctCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.tbracctBLocnCode == null)? 0 :this.tbracctBLocnCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tbracct2) == false) {
            return false;
        }
        Tbracct2 rhs = ((Tbracct2) other);
        return ((((((((((((((((((((((((((this.tbracctAOrgnCode == rhs.tbracctAOrgnCode)||((this.tbracctAOrgnCode!= null)&&this.tbracctAOrgnCode.equals(rhs.tbracctAOrgnCode)))&&((this.tbracctBRuclCode2 == rhs.tbracctBRuclCode2)||((this.tbracctBRuclCode2 != null)&&this.tbracctBRuclCode2 .equals(rhs.tbracctBRuclCode2))))&&((this.tbracctBRuclCode3 == rhs.tbracctBRuclCode3)||((this.tbracctBRuclCode3 != null)&&this.tbracctBRuclCode3 .equals(rhs.tbracctBRuclCode3))))&&((this.tbracctBOrgnCode == rhs.tbracctBOrgnCode)||((this.tbracctBOrgnCode!= null)&&this.tbracctBOrgnCode.equals(rhs.tbracctBOrgnCode))))&&((this.tbracctBRuclCode1 == rhs.tbracctBRuclCode1)||((this.tbracctBRuclCode1 != null)&&this.tbracctBRuclCode1 .equals(rhs.tbracctBRuclCode1))))&&((this.tbracctAActvCode == rhs.tbracctAActvCode)||((this.tbracctAActvCode!= null)&&this.tbracctAActvCode.equals(rhs.tbracctAActvCode))))&&((this.tbracctBActvCode == rhs.tbracctBActvCode)||((this.tbracctBActvCode!= null)&&this.tbracctBActvCode.equals(rhs.tbracctBActvCode))))&&((this.tbracctBFundCode == rhs.tbracctBFundCode)||((this.tbracctBFundCode!= null)&&this.tbracctBFundCode.equals(rhs.tbracctBFundCode))))&&((this.tbracctAFundCode == rhs.tbracctAFundCode)||((this.tbracctAFundCode!= null)&&this.tbracctAFundCode.equals(rhs.tbracctAFundCode))))&&((this.accountPercent2 == rhs.accountPercent2)||((this.accountPercent2 != null)&&this.accountPercent2 .equals(rhs.accountPercent2))))&&((this.tbracctBCoasCode == rhs.tbracctBCoasCode)||((this.tbracctBCoasCode!= null)&&this.tbracctBCoasCode.equals(rhs.tbracctBCoasCode))))&&((this.tbracctACoasCode == rhs.tbracctACoasCode)||((this.tbracctACoasCode!= null)&&this.tbracctACoasCode.equals(rhs.tbracctACoasCode))))&&((this.tbracctBAcciCode == rhs.tbracctBAcciCode)||((this.tbracctBAcciCode!= null)&&this.tbracctBAcciCode.equals(rhs.tbracctBAcciCode))))&&((this.tbracctCode == rhs.tbracctCode)||((this.tbracctCode!= null)&&this.tbracctCode.equals(rhs.tbracctCode))))&&((this.tbracctAAcciCode == rhs.tbracctAAcciCode)||((this.tbracctAAcciCode!= null)&&this.tbracctAAcciCode.equals(rhs.tbracctAAcciCode))))&&((this.tbracctARuclCode1 == rhs.tbracctARuclCode1)||((this.tbracctARuclCode1 != null)&&this.tbracctARuclCode1 .equals(rhs.tbracctARuclCode1))))&&((this.tbracctARuclCode2 == rhs.tbracctARuclCode2)||((this.tbracctARuclCode2 != null)&&this.tbracctARuclCode2 .equals(rhs.tbracctARuclCode2))))&&((this.tbracctARuclCode3 == rhs.tbracctARuclCode3)||((this.tbracctARuclCode3 != null)&&this.tbracctARuclCode3 .equals(rhs.tbracctARuclCode3))))&&((this.tbracctALocnCode == rhs.tbracctALocnCode)||((this.tbracctALocnCode!= null)&&this.tbracctALocnCode.equals(rhs.tbracctALocnCode))))&&((this.tbracctBAcctCode == rhs.tbracctBAcctCode)||((this.tbracctBAcctCode!= null)&&this.tbracctBAcctCode.equals(rhs.tbracctBAcctCode))))&&((this.tbracctAProgCode == rhs.tbracctAProgCode)||((this.tbracctAProgCode!= null)&&this.tbracctAProgCode.equals(rhs.tbracctAProgCode))))&&((this.tbracctBProgCode == rhs.tbracctBProgCode)||((this.tbracctBProgCode!= null)&&this.tbracctBProgCode.equals(rhs.tbracctBProgCode))))&&((this.tbracctAAcctCode == rhs.tbracctAAcctCode)||((this.tbracctAAcctCode!= null)&&this.tbracctAAcctCode.equals(rhs.tbracctAAcctCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.tbracctBLocnCode == rhs.tbracctBLocnCode)||((this.tbracctBLocnCode!= null)&&this.tbracctBLocnCode.equals(rhs.tbracctBLocnCode))));
    }

}
