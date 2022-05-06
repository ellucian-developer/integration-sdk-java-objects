
package com.ellucian.generated.bpapi.ban._1098_t_tax_informations.v1_0_0;

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
    "criteria.tranCoNatnDesc",
    "instZipCode",
    "tranContEmail",
    "criteria.tranContName",
    "criteria.instContPhExt",
    "tranTin",
    "tranCoZipCode",
    "tranCoCity",
    "criteria.tranTin",
    "criteria.instName2",
    "criteria.instName1",
    "instNatnDesc",
    "criteria.tranContPhExt",
    "tranForeignInd",
    "criteria.instContPhNo",
    "criteria.tranCoNatnCode",
    "tranName1",
    "tranCtrlCode",
    "criteria.instContPhArea",
    "tranName2",
    "instContPhNo",
    "criteria.instForeignInd",
    "tranContName",
    "tranCoStCode",
    "tranContPhExt",
    "criteria.instNameCtrl",
    "tranContPhArea",
    "instContPhExt",
    "instOfficeCode",
    "criteria.tranForeignInd",
    "criteria.instAddress2",
    "instName1",
    "criteria.instAddress1",
    "instForeignInd",
    "instName2",
    "criteria.tranCoStCode",
    "criteria.tranCoAddress",
    "criteria.instNatnCode",
    "instContPhArea",
    "instNameCtrl",
    "tranCoNatnCode",
    "criteria.tranContEmail",
    "instCity",
    "criteria.tranCoCity",
    "criteria.tranCtrlCode",
    "criteria.tranName1",
    "criteria.instOfficeCode",
    "instTin",
    "criteria.tranName2",
    "criteria.instZipCode",
    "tranContPhNo",
    "criteria.instCity",
    "tranCoName1",
    "criteria.tranContPhArea",
    "criteria.instNatnDesc",
    "criteria.instTin",
    "tranCoAddress",
    "instStCode",
    "criteria.tranCoName2",
    "criteria.tranContPhNo",
    "criteria.tranCoName1",
    "tranCoName2",
    "criteria.tranCoZipCode",
    "instNatnCode",
    "instAddress1",
    "criteria.instStCode",
    "instAddress2",
    "tranCoNatnDesc"
})
@Generated("jsonschema2pojo")
public class _1098TTaxInformations100PutRequest {

    @JsonProperty("criteria.tranCoNatnDesc")
    private String criteriaTranCoNatnDesc;
    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : TTB1098_INST_ZIP_CODE, Lookup lineage reference object : gtvzipc
     * 
     */
    @JsonProperty("instZipCode")
    @JsonPropertyDescription("Lineage reference object : TTB1098_INST_ZIP_CODE, Lookup lineage reference object : gtvzipc")
    private String instZipCode;
    /**
     * Email Address
     * <p>
     * Lineage reference object : TTB1098_TRAN_CONT_EMAIL
     * 
     */
    @JsonProperty("tranContEmail")
    @JsonPropertyDescription("Lineage reference object : TTB1098_TRAN_CONT_EMAIL")
    private String tranContEmail;
    /**
     * Contact Name
     * <p>
     * Lineage reference object : TTB1098_TRAN_CONT_NAME
     * (Required)
     * 
     */
    @JsonProperty("criteria.tranContName")
    @JsonPropertyDescription("Lineage reference object : TTB1098_TRAN_CONT_NAME")
    private String criteriaTranContName;
    /**
     * Extension
     * <p>
     * Lineage reference object : TTB1098_INST_CONT_PH_EXT
     * 
     */
    @JsonProperty("criteria.instContPhExt")
    @JsonPropertyDescription("Lineage reference object : TTB1098_INST_CONT_PH_EXT")
    private String criteriaInstContPhExt;
    /**
     * Transmitter's TIN
     * <p>
     * Lineage reference object : TTB1098_TRAN_TIN
     * (Required)
     * 
     */
    @JsonProperty("tranTin")
    @JsonPropertyDescription("Lineage reference object : TTB1098_TRAN_TIN")
    private String tranTin;
    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : TTB1098_TRAN_CO_ZIP_CODE, Lookup lineage reference object : gtvzipc
     * 
     */
    @JsonProperty("tranCoZipCode")
    @JsonPropertyDescription("Lineage reference object : TTB1098_TRAN_CO_ZIP_CODE, Lookup lineage reference object : gtvzipc")
    private String tranCoZipCode;
    /**
     * City
     * <p>
     * Lineage reference object : TTB1098_TRAN_CO_CITY
     * (Required)
     * 
     */
    @JsonProperty("tranCoCity")
    @JsonPropertyDescription("Lineage reference object : TTB1098_TRAN_CO_CITY")
    private String tranCoCity;
    /**
     * Transmitter's TIN
     * <p>
     * Lineage reference object : TTB1098_TRAN_TIN
     * (Required)
     * 
     */
    @JsonProperty("criteria.tranTin")
    @JsonPropertyDescription("Lineage reference object : TTB1098_TRAN_TIN")
    private String criteriaTranTin;
    /**
     * Institutional Additional Information
     * <p>
     * Lineage reference object : TTB1098_INST_NAME2
     * 
     */
    @JsonProperty("criteria.instName2")
    @JsonPropertyDescription("Lineage reference object : TTB1098_INST_NAME2")
    private String criteriaInstName2;
    /**
     * Institution's Name
     * <p>
     * Lineage reference object : TTB1098_INST_NAME1
     * (Required)
     * 
     */
    @JsonProperty("criteria.instName1")
    @JsonPropertyDescription("Lineage reference object : TTB1098_INST_NAME1")
    private String criteriaInstName1;
    @JsonProperty("instNatnDesc")
    private String instNatnDesc;
    /**
     * Extension
     * <p>
     * Lineage reference object : TTB1098_TRAN_CONT_PH_EXT
     * 
     */
    @JsonProperty("criteria.tranContPhExt")
    @JsonPropertyDescription("Lineage reference object : TTB1098_TRAN_CONT_PH_EXT")
    private String criteriaTranContPhExt;
    /**
     * Foreign Indicator
     * <p>
     * Lineage reference object : TTB1098_TRAN_FOREIGN_IND
     * 
     */
    @JsonProperty("tranForeignInd")
    @JsonPropertyDescription("Lineage reference object : TTB1098_TRAN_FOREIGN_IND")
    private String tranForeignInd;
    /**
     * Contact Phone (Number)
     * <p>
     * Lineage reference object : TTB1098_INST_CONT_PH_NO
     * 
     */
    @JsonProperty("criteria.instContPhNo")
    @JsonPropertyDescription("Lineage reference object : TTB1098_INST_CONT_PH_NO")
    private String criteriaInstContPhNo;
    /**
     * Nation
     * <p>
     * Lineage reference object : TTB1098_TRAN_CO_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("criteria.tranCoNatnCode")
    @JsonPropertyDescription("Lineage reference object : TTB1098_TRAN_CO_NATN_CODE, Lookup lineage reference object : stvnatn")
    private String criteriaTranCoNatnCode;
    /**
     * Transmitter Name
     * <p>
     * Lineage reference object : TTB1098_TRAN_NAME1
     * 
     */
    @JsonProperty("tranName1")
    @JsonPropertyDescription("Lineage reference object : TTB1098_TRAN_NAME1")
    private String tranName1;
    /**
     * Transmitter Control Code
     * <p>
     * Lineage reference object : TTB1098_TRAN_CTRL_CODE
     * 
     */
    @JsonProperty("tranCtrlCode")
    @JsonPropertyDescription("Lineage reference object : TTB1098_TRAN_CTRL_CODE")
    private String tranCtrlCode;
    /**
     * Contact Phone
     * <p>
     * Lineage reference object : TTB1098_INST_CONT_PH_AREA
     * 
     */
    @JsonProperty("criteria.instContPhArea")
    @JsonPropertyDescription("Lineage reference object : TTB1098_INST_CONT_PH_AREA")
    private String criteriaInstContPhArea;
    /**
     * Transmitter Additional Information
     * <p>
     * Lineage reference object : TTB1098_TRAN_NAME2
     * 
     */
    @JsonProperty("tranName2")
    @JsonPropertyDescription("Lineage reference object : TTB1098_TRAN_NAME2")
    private String tranName2;
    /**
     * Contact Phone (Number)
     * <p>
     * Lineage reference object : TTB1098_INST_CONT_PH_NO
     * 
     */
    @JsonProperty("instContPhNo")
    @JsonPropertyDescription("Lineage reference object : TTB1098_INST_CONT_PH_NO")
    private String instContPhNo;
    /**
     * Foreign Indicator
     * <p>
     * Lineage reference object : TTB1098_INST_FOREIGN_IND
     * 
     */
    @JsonProperty("criteria.instForeignInd")
    @JsonPropertyDescription("Lineage reference object : TTB1098_INST_FOREIGN_IND")
    private String criteriaInstForeignInd;
    /**
     * Contact Name
     * <p>
     * Lineage reference object : TTB1098_TRAN_CONT_NAME
     * (Required)
     * 
     */
    @JsonProperty("tranContName")
    @JsonPropertyDescription("Lineage reference object : TTB1098_TRAN_CONT_NAME")
    private String tranContName;
    /**
     * State or Province
     * <p>
     * Lineage reference object : TTB1098_TRAN_CO_ST_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("tranCoStCode")
    @JsonPropertyDescription("Lineage reference object : TTB1098_TRAN_CO_ST_CODE, Lookup lineage reference object : stvstat")
    private String tranCoStCode;
    /**
     * Extension
     * <p>
     * Lineage reference object : TTB1098_TRAN_CONT_PH_EXT
     * 
     */
    @JsonProperty("tranContPhExt")
    @JsonPropertyDescription("Lineage reference object : TTB1098_TRAN_CONT_PH_EXT")
    private String tranContPhExt;
    /**
     * Name Control
     * <p>
     * Lineage reference object : TTB1098_INST_NAME_CTRL
     * 
     */
    @JsonProperty("criteria.instNameCtrl")
    @JsonPropertyDescription("Lineage reference object : TTB1098_INST_NAME_CTRL")
    private String criteriaInstNameCtrl;
    /**
     * Phone
     * <p>
     * Lineage reference object : TTB1098_TRAN_CONT_PH_AREA
     * 
     */
    @JsonProperty("tranContPhArea")
    @JsonPropertyDescription("Lineage reference object : TTB1098_TRAN_CONT_PH_AREA")
    private String tranContPhArea;
    /**
     * Extension
     * <p>
     * Lineage reference object : TTB1098_INST_CONT_PH_EXT
     * 
     */
    @JsonProperty("instContPhExt")
    @JsonPropertyDescription("Lineage reference object : TTB1098_INST_CONT_PH_EXT")
    private String instContPhExt;
    /**
     * Office Code
     * <p>
     * Lineage reference object : TTB1098_INST_OFFICE_CODE
     * 
     */
    @JsonProperty("instOfficeCode")
    @JsonPropertyDescription("Lineage reference object : TTB1098_INST_OFFICE_CODE")
    private String instOfficeCode;
    /**
     * Foreign Indicator
     * <p>
     * Lineage reference object : TTB1098_TRAN_FOREIGN_IND
     * 
     */
    @JsonProperty("criteria.tranForeignInd")
    @JsonPropertyDescription("Lineage reference object : TTB1098_TRAN_FOREIGN_IND")
    private String criteriaTranForeignInd;
    /**
     * Additional Mailing Address Information
     * <p>
     * Lineage reference object : TTB1098_INST_ADDRESS2
     * 
     */
    @JsonProperty("criteria.instAddress2")
    @JsonPropertyDescription("Lineage reference object : TTB1098_INST_ADDRESS2")
    private String criteriaInstAddress2;
    /**
     * Institution's Name
     * <p>
     * Lineage reference object : TTB1098_INST_NAME1
     * (Required)
     * 
     */
    @JsonProperty("instName1")
    @JsonPropertyDescription("Lineage reference object : TTB1098_INST_NAME1")
    private String instName1;
    /**
     * Mailing Address
     * <p>
     * Lineage reference object : TTB1098_INST_ADDRESS1
     * (Required)
     * 
     */
    @JsonProperty("criteria.instAddress1")
    @JsonPropertyDescription("Lineage reference object : TTB1098_INST_ADDRESS1")
    private String criteriaInstAddress1;
    /**
     * Foreign Indicator
     * <p>
     * Lineage reference object : TTB1098_INST_FOREIGN_IND
     * 
     */
    @JsonProperty("instForeignInd")
    @JsonPropertyDescription("Lineage reference object : TTB1098_INST_FOREIGN_IND")
    private String instForeignInd;
    /**
     * Institutional Additional Information
     * <p>
     * Lineage reference object : TTB1098_INST_NAME2
     * 
     */
    @JsonProperty("instName2")
    @JsonPropertyDescription("Lineage reference object : TTB1098_INST_NAME2")
    private String instName2;
    /**
     * State or Province
     * <p>
     * Lineage reference object : TTB1098_TRAN_CO_ST_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("criteria.tranCoStCode")
    @JsonPropertyDescription("Lineage reference object : TTB1098_TRAN_CO_ST_CODE, Lookup lineage reference object : stvstat")
    private String criteriaTranCoStCode;
    /**
     * Mailing Address
     * <p>
     * Lineage reference object : TTB1098_TRAN_CO_ADDRESS
     * (Required)
     * 
     */
    @JsonProperty("criteria.tranCoAddress")
    @JsonPropertyDescription("Lineage reference object : TTB1098_TRAN_CO_ADDRESS")
    private String criteriaTranCoAddress;
    /**
     * Nation
     * <p>
     * Lineage reference object : TTB1098_INST_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("criteria.instNatnCode")
    @JsonPropertyDescription("Lineage reference object : TTB1098_INST_NATN_CODE, Lookup lineage reference object : stvnatn")
    private String criteriaInstNatnCode;
    /**
     * Contact Phone
     * <p>
     * Lineage reference object : TTB1098_INST_CONT_PH_AREA
     * 
     */
    @JsonProperty("instContPhArea")
    @JsonPropertyDescription("Lineage reference object : TTB1098_INST_CONT_PH_AREA")
    private String instContPhArea;
    /**
     * Name Control
     * <p>
     * Lineage reference object : TTB1098_INST_NAME_CTRL
     * 
     */
    @JsonProperty("instNameCtrl")
    @JsonPropertyDescription("Lineage reference object : TTB1098_INST_NAME_CTRL")
    private String instNameCtrl;
    /**
     * Nation
     * <p>
     * Lineage reference object : TTB1098_TRAN_CO_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("tranCoNatnCode")
    @JsonPropertyDescription("Lineage reference object : TTB1098_TRAN_CO_NATN_CODE, Lookup lineage reference object : stvnatn")
    private String tranCoNatnCode;
    /**
     * Email Address
     * <p>
     * Lineage reference object : TTB1098_TRAN_CONT_EMAIL
     * 
     */
    @JsonProperty("criteria.tranContEmail")
    @JsonPropertyDescription("Lineage reference object : TTB1098_TRAN_CONT_EMAIL")
    private String criteriaTranContEmail;
    /**
     * City
     * <p>
     * Lineage reference object : TTB1098_INST_CITY
     * (Required)
     * 
     */
    @JsonProperty("instCity")
    @JsonPropertyDescription("Lineage reference object : TTB1098_INST_CITY")
    private String instCity;
    /**
     * City
     * <p>
     * Lineage reference object : TTB1098_TRAN_CO_CITY
     * (Required)
     * 
     */
    @JsonProperty("criteria.tranCoCity")
    @JsonPropertyDescription("Lineage reference object : TTB1098_TRAN_CO_CITY")
    private String criteriaTranCoCity;
    /**
     * Transmitter Control Code
     * <p>
     * Lineage reference object : TTB1098_TRAN_CTRL_CODE
     * 
     */
    @JsonProperty("criteria.tranCtrlCode")
    @JsonPropertyDescription("Lineage reference object : TTB1098_TRAN_CTRL_CODE")
    private String criteriaTranCtrlCode;
    /**
     * Transmitter Name
     * <p>
     * Lineage reference object : TTB1098_TRAN_NAME1
     * 
     */
    @JsonProperty("criteria.tranName1")
    @JsonPropertyDescription("Lineage reference object : TTB1098_TRAN_NAME1")
    private String criteriaTranName1;
    /**
     * Office Code
     * <p>
     * Lineage reference object : TTB1098_INST_OFFICE_CODE
     * 
     */
    @JsonProperty("criteria.instOfficeCode")
    @JsonPropertyDescription("Lineage reference object : TTB1098_INST_OFFICE_CODE")
    private String criteriaInstOfficeCode;
    /**
     * Institution's TIN
     * <p>
     * Lineage reference object : TTB1098_INST_TIN
     * (Required)
     * 
     */
    @JsonProperty("instTin")
    @JsonPropertyDescription("Lineage reference object : TTB1098_INST_TIN")
    private String instTin;
    /**
     * Transmitter Additional Information
     * <p>
     * Lineage reference object : TTB1098_TRAN_NAME2
     * 
     */
    @JsonProperty("criteria.tranName2")
    @JsonPropertyDescription("Lineage reference object : TTB1098_TRAN_NAME2")
    private String criteriaTranName2;
    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : TTB1098_INST_ZIP_CODE, Lookup lineage reference object : gtvzipc
     * 
     */
    @JsonProperty("criteria.instZipCode")
    @JsonPropertyDescription("Lineage reference object : TTB1098_INST_ZIP_CODE, Lookup lineage reference object : gtvzipc")
    private String criteriaInstZipCode;
    /**
     * Phone(Number)
     * <p>
     * Lineage reference object : TTB1098_TRAN_CONT_PH_NO
     * 
     */
    @JsonProperty("tranContPhNo")
    @JsonPropertyDescription("Lineage reference object : TTB1098_TRAN_CONT_PH_NO")
    private String tranContPhNo;
    /**
     * City
     * <p>
     * Lineage reference object : TTB1098_INST_CITY
     * (Required)
     * 
     */
    @JsonProperty("criteria.instCity")
    @JsonPropertyDescription("Lineage reference object : TTB1098_INST_CITY")
    private String criteriaInstCity;
    /**
     * Transmitter Company Name
     * <p>
     * Lineage reference object : TTB1098_TRAN_CO_NAME1
     * (Required)
     * 
     */
    @JsonProperty("tranCoName1")
    @JsonPropertyDescription("Lineage reference object : TTB1098_TRAN_CO_NAME1")
    private String tranCoName1;
    /**
     * Phone
     * <p>
     * Lineage reference object : TTB1098_TRAN_CONT_PH_AREA
     * 
     */
    @JsonProperty("criteria.tranContPhArea")
    @JsonPropertyDescription("Lineage reference object : TTB1098_TRAN_CONT_PH_AREA")
    private String criteriaTranContPhArea;
    @JsonProperty("criteria.instNatnDesc")
    private String criteriaInstNatnDesc;
    /**
     * Institution's TIN
     * <p>
     * Lineage reference object : TTB1098_INST_TIN
     * (Required)
     * 
     */
    @JsonProperty("criteria.instTin")
    @JsonPropertyDescription("Lineage reference object : TTB1098_INST_TIN")
    private String criteriaInstTin;
    /**
     * Mailing Address
     * <p>
     * Lineage reference object : TTB1098_TRAN_CO_ADDRESS
     * (Required)
     * 
     */
    @JsonProperty("tranCoAddress")
    @JsonPropertyDescription("Lineage reference object : TTB1098_TRAN_CO_ADDRESS")
    private String tranCoAddress;
    /**
     * State or Province
     * <p>
     * Lineage reference object : TTB1098_INST_ST_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("instStCode")
    @JsonPropertyDescription("Lineage reference object : TTB1098_INST_ST_CODE, Lookup lineage reference object : stvstat")
    private String instStCode;
    /**
     * Transmitter Company Additional Information
     * <p>
     * Lineage reference object : TTB1098_TRAN_CO_NAME2
     * 
     */
    @JsonProperty("criteria.tranCoName2")
    @JsonPropertyDescription("Lineage reference object : TTB1098_TRAN_CO_NAME2")
    private String criteriaTranCoName2;
    /**
     * Phone(Number)
     * <p>
     * Lineage reference object : TTB1098_TRAN_CONT_PH_NO
     * 
     */
    @JsonProperty("criteria.tranContPhNo")
    @JsonPropertyDescription("Lineage reference object : TTB1098_TRAN_CONT_PH_NO")
    private String criteriaTranContPhNo;
    /**
     * Transmitter Company Name
     * <p>
     * Lineage reference object : TTB1098_TRAN_CO_NAME1
     * (Required)
     * 
     */
    @JsonProperty("criteria.tranCoName1")
    @JsonPropertyDescription("Lineage reference object : TTB1098_TRAN_CO_NAME1")
    private String criteriaTranCoName1;
    /**
     * Transmitter Company Additional Information
     * <p>
     * Lineage reference object : TTB1098_TRAN_CO_NAME2
     * 
     */
    @JsonProperty("tranCoName2")
    @JsonPropertyDescription("Lineage reference object : TTB1098_TRAN_CO_NAME2")
    private String tranCoName2;
    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : TTB1098_TRAN_CO_ZIP_CODE, Lookup lineage reference object : gtvzipc
     * 
     */
    @JsonProperty("criteria.tranCoZipCode")
    @JsonPropertyDescription("Lineage reference object : TTB1098_TRAN_CO_ZIP_CODE, Lookup lineage reference object : gtvzipc")
    private String criteriaTranCoZipCode;
    /**
     * Nation
     * <p>
     * Lineage reference object : TTB1098_INST_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("instNatnCode")
    @JsonPropertyDescription("Lineage reference object : TTB1098_INST_NATN_CODE, Lookup lineage reference object : stvnatn")
    private String instNatnCode;
    /**
     * Mailing Address
     * <p>
     * Lineage reference object : TTB1098_INST_ADDRESS1
     * (Required)
     * 
     */
    @JsonProperty("instAddress1")
    @JsonPropertyDescription("Lineage reference object : TTB1098_INST_ADDRESS1")
    private String instAddress1;
    /**
     * State or Province
     * <p>
     * Lineage reference object : TTB1098_INST_ST_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("criteria.instStCode")
    @JsonPropertyDescription("Lineage reference object : TTB1098_INST_ST_CODE, Lookup lineage reference object : stvstat")
    private String criteriaInstStCode;
    /**
     * Additional Mailing Address Information
     * <p>
     * Lineage reference object : TTB1098_INST_ADDRESS2
     * 
     */
    @JsonProperty("instAddress2")
    @JsonPropertyDescription("Lineage reference object : TTB1098_INST_ADDRESS2")
    private String instAddress2;
    @JsonProperty("tranCoNatnDesc")
    private String tranCoNatnDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("criteria.tranCoNatnDesc")
    public String getCriteriaTranCoNatnDesc() {
        return criteriaTranCoNatnDesc;
    }

    @JsonProperty("criteria.tranCoNatnDesc")
    public void setCriteriaTranCoNatnDesc(String criteriaTranCoNatnDesc) {
        this.criteriaTranCoNatnDesc = criteriaTranCoNatnDesc;
    }

    public _1098TTaxInformations100PutRequest withCriteriaTranCoNatnDesc(String criteriaTranCoNatnDesc) {
        this.criteriaTranCoNatnDesc = criteriaTranCoNatnDesc;
        return this;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : TTB1098_INST_ZIP_CODE, Lookup lineage reference object : gtvzipc
     * 
     */
    @JsonProperty("instZipCode")
    public String getInstZipCode() {
        return instZipCode;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : TTB1098_INST_ZIP_CODE, Lookup lineage reference object : gtvzipc
     * 
     */
    @JsonProperty("instZipCode")
    public void setInstZipCode(String instZipCode) {
        this.instZipCode = instZipCode;
    }

    public _1098TTaxInformations100PutRequest withInstZipCode(String instZipCode) {
        this.instZipCode = instZipCode;
        return this;
    }

    /**
     * Email Address
     * <p>
     * Lineage reference object : TTB1098_TRAN_CONT_EMAIL
     * 
     */
    @JsonProperty("tranContEmail")
    public String getTranContEmail() {
        return tranContEmail;
    }

    /**
     * Email Address
     * <p>
     * Lineage reference object : TTB1098_TRAN_CONT_EMAIL
     * 
     */
    @JsonProperty("tranContEmail")
    public void setTranContEmail(String tranContEmail) {
        this.tranContEmail = tranContEmail;
    }

    public _1098TTaxInformations100PutRequest withTranContEmail(String tranContEmail) {
        this.tranContEmail = tranContEmail;
        return this;
    }

    /**
     * Contact Name
     * <p>
     * Lineage reference object : TTB1098_TRAN_CONT_NAME
     * (Required)
     * 
     */
    @JsonProperty("criteria.tranContName")
    public String getCriteriaTranContName() {
        return criteriaTranContName;
    }

    /**
     * Contact Name
     * <p>
     * Lineage reference object : TTB1098_TRAN_CONT_NAME
     * (Required)
     * 
     */
    @JsonProperty("criteria.tranContName")
    public void setCriteriaTranContName(String criteriaTranContName) {
        this.criteriaTranContName = criteriaTranContName;
    }

    public _1098TTaxInformations100PutRequest withCriteriaTranContName(String criteriaTranContName) {
        this.criteriaTranContName = criteriaTranContName;
        return this;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : TTB1098_INST_CONT_PH_EXT
     * 
     */
    @JsonProperty("criteria.instContPhExt")
    public String getCriteriaInstContPhExt() {
        return criteriaInstContPhExt;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : TTB1098_INST_CONT_PH_EXT
     * 
     */
    @JsonProperty("criteria.instContPhExt")
    public void setCriteriaInstContPhExt(String criteriaInstContPhExt) {
        this.criteriaInstContPhExt = criteriaInstContPhExt;
    }

    public _1098TTaxInformations100PutRequest withCriteriaInstContPhExt(String criteriaInstContPhExt) {
        this.criteriaInstContPhExt = criteriaInstContPhExt;
        return this;
    }

    /**
     * Transmitter's TIN
     * <p>
     * Lineage reference object : TTB1098_TRAN_TIN
     * (Required)
     * 
     */
    @JsonProperty("tranTin")
    public String getTranTin() {
        return tranTin;
    }

    /**
     * Transmitter's TIN
     * <p>
     * Lineage reference object : TTB1098_TRAN_TIN
     * (Required)
     * 
     */
    @JsonProperty("tranTin")
    public void setTranTin(String tranTin) {
        this.tranTin = tranTin;
    }

    public _1098TTaxInformations100PutRequest withTranTin(String tranTin) {
        this.tranTin = tranTin;
        return this;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : TTB1098_TRAN_CO_ZIP_CODE, Lookup lineage reference object : gtvzipc
     * 
     */
    @JsonProperty("tranCoZipCode")
    public String getTranCoZipCode() {
        return tranCoZipCode;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : TTB1098_TRAN_CO_ZIP_CODE, Lookup lineage reference object : gtvzipc
     * 
     */
    @JsonProperty("tranCoZipCode")
    public void setTranCoZipCode(String tranCoZipCode) {
        this.tranCoZipCode = tranCoZipCode;
    }

    public _1098TTaxInformations100PutRequest withTranCoZipCode(String tranCoZipCode) {
        this.tranCoZipCode = tranCoZipCode;
        return this;
    }

    /**
     * City
     * <p>
     * Lineage reference object : TTB1098_TRAN_CO_CITY
     * (Required)
     * 
     */
    @JsonProperty("tranCoCity")
    public String getTranCoCity() {
        return tranCoCity;
    }

    /**
     * City
     * <p>
     * Lineage reference object : TTB1098_TRAN_CO_CITY
     * (Required)
     * 
     */
    @JsonProperty("tranCoCity")
    public void setTranCoCity(String tranCoCity) {
        this.tranCoCity = tranCoCity;
    }

    public _1098TTaxInformations100PutRequest withTranCoCity(String tranCoCity) {
        this.tranCoCity = tranCoCity;
        return this;
    }

    /**
     * Transmitter's TIN
     * <p>
     * Lineage reference object : TTB1098_TRAN_TIN
     * (Required)
     * 
     */
    @JsonProperty("criteria.tranTin")
    public String getCriteriaTranTin() {
        return criteriaTranTin;
    }

    /**
     * Transmitter's TIN
     * <p>
     * Lineage reference object : TTB1098_TRAN_TIN
     * (Required)
     * 
     */
    @JsonProperty("criteria.tranTin")
    public void setCriteriaTranTin(String criteriaTranTin) {
        this.criteriaTranTin = criteriaTranTin;
    }

    public _1098TTaxInformations100PutRequest withCriteriaTranTin(String criteriaTranTin) {
        this.criteriaTranTin = criteriaTranTin;
        return this;
    }

    /**
     * Institutional Additional Information
     * <p>
     * Lineage reference object : TTB1098_INST_NAME2
     * 
     */
    @JsonProperty("criteria.instName2")
    public String getCriteriaInstName2() {
        return criteriaInstName2;
    }

    /**
     * Institutional Additional Information
     * <p>
     * Lineage reference object : TTB1098_INST_NAME2
     * 
     */
    @JsonProperty("criteria.instName2")
    public void setCriteriaInstName2(String criteriaInstName2) {
        this.criteriaInstName2 = criteriaInstName2;
    }

    public _1098TTaxInformations100PutRequest withCriteriaInstName2(String criteriaInstName2) {
        this.criteriaInstName2 = criteriaInstName2;
        return this;
    }

    /**
     * Institution's Name
     * <p>
     * Lineage reference object : TTB1098_INST_NAME1
     * (Required)
     * 
     */
    @JsonProperty("criteria.instName1")
    public String getCriteriaInstName1() {
        return criteriaInstName1;
    }

    /**
     * Institution's Name
     * <p>
     * Lineage reference object : TTB1098_INST_NAME1
     * (Required)
     * 
     */
    @JsonProperty("criteria.instName1")
    public void setCriteriaInstName1(String criteriaInstName1) {
        this.criteriaInstName1 = criteriaInstName1;
    }

    public _1098TTaxInformations100PutRequest withCriteriaInstName1(String criteriaInstName1) {
        this.criteriaInstName1 = criteriaInstName1;
        return this;
    }

    @JsonProperty("instNatnDesc")
    public String getInstNatnDesc() {
        return instNatnDesc;
    }

    @JsonProperty("instNatnDesc")
    public void setInstNatnDesc(String instNatnDesc) {
        this.instNatnDesc = instNatnDesc;
    }

    public _1098TTaxInformations100PutRequest withInstNatnDesc(String instNatnDesc) {
        this.instNatnDesc = instNatnDesc;
        return this;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : TTB1098_TRAN_CONT_PH_EXT
     * 
     */
    @JsonProperty("criteria.tranContPhExt")
    public String getCriteriaTranContPhExt() {
        return criteriaTranContPhExt;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : TTB1098_TRAN_CONT_PH_EXT
     * 
     */
    @JsonProperty("criteria.tranContPhExt")
    public void setCriteriaTranContPhExt(String criteriaTranContPhExt) {
        this.criteriaTranContPhExt = criteriaTranContPhExt;
    }

    public _1098TTaxInformations100PutRequest withCriteriaTranContPhExt(String criteriaTranContPhExt) {
        this.criteriaTranContPhExt = criteriaTranContPhExt;
        return this;
    }

    /**
     * Foreign Indicator
     * <p>
     * Lineage reference object : TTB1098_TRAN_FOREIGN_IND
     * 
     */
    @JsonProperty("tranForeignInd")
    public String getTranForeignInd() {
        return tranForeignInd;
    }

    /**
     * Foreign Indicator
     * <p>
     * Lineage reference object : TTB1098_TRAN_FOREIGN_IND
     * 
     */
    @JsonProperty("tranForeignInd")
    public void setTranForeignInd(String tranForeignInd) {
        this.tranForeignInd = tranForeignInd;
    }

    public _1098TTaxInformations100PutRequest withTranForeignInd(String tranForeignInd) {
        this.tranForeignInd = tranForeignInd;
        return this;
    }

    /**
     * Contact Phone (Number)
     * <p>
     * Lineage reference object : TTB1098_INST_CONT_PH_NO
     * 
     */
    @JsonProperty("criteria.instContPhNo")
    public String getCriteriaInstContPhNo() {
        return criteriaInstContPhNo;
    }

    /**
     * Contact Phone (Number)
     * <p>
     * Lineage reference object : TTB1098_INST_CONT_PH_NO
     * 
     */
    @JsonProperty("criteria.instContPhNo")
    public void setCriteriaInstContPhNo(String criteriaInstContPhNo) {
        this.criteriaInstContPhNo = criteriaInstContPhNo;
    }

    public _1098TTaxInformations100PutRequest withCriteriaInstContPhNo(String criteriaInstContPhNo) {
        this.criteriaInstContPhNo = criteriaInstContPhNo;
        return this;
    }

    /**
     * Nation
     * <p>
     * Lineage reference object : TTB1098_TRAN_CO_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("criteria.tranCoNatnCode")
    public String getCriteriaTranCoNatnCode() {
        return criteriaTranCoNatnCode;
    }

    /**
     * Nation
     * <p>
     * Lineage reference object : TTB1098_TRAN_CO_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("criteria.tranCoNatnCode")
    public void setCriteriaTranCoNatnCode(String criteriaTranCoNatnCode) {
        this.criteriaTranCoNatnCode = criteriaTranCoNatnCode;
    }

    public _1098TTaxInformations100PutRequest withCriteriaTranCoNatnCode(String criteriaTranCoNatnCode) {
        this.criteriaTranCoNatnCode = criteriaTranCoNatnCode;
        return this;
    }

    /**
     * Transmitter Name
     * <p>
     * Lineage reference object : TTB1098_TRAN_NAME1
     * 
     */
    @JsonProperty("tranName1")
    public String getTranName1() {
        return tranName1;
    }

    /**
     * Transmitter Name
     * <p>
     * Lineage reference object : TTB1098_TRAN_NAME1
     * 
     */
    @JsonProperty("tranName1")
    public void setTranName1(String tranName1) {
        this.tranName1 = tranName1;
    }

    public _1098TTaxInformations100PutRequest withTranName1(String tranName1) {
        this.tranName1 = tranName1;
        return this;
    }

    /**
     * Transmitter Control Code
     * <p>
     * Lineage reference object : TTB1098_TRAN_CTRL_CODE
     * 
     */
    @JsonProperty("tranCtrlCode")
    public String getTranCtrlCode() {
        return tranCtrlCode;
    }

    /**
     * Transmitter Control Code
     * <p>
     * Lineage reference object : TTB1098_TRAN_CTRL_CODE
     * 
     */
    @JsonProperty("tranCtrlCode")
    public void setTranCtrlCode(String tranCtrlCode) {
        this.tranCtrlCode = tranCtrlCode;
    }

    public _1098TTaxInformations100PutRequest withTranCtrlCode(String tranCtrlCode) {
        this.tranCtrlCode = tranCtrlCode;
        return this;
    }

    /**
     * Contact Phone
     * <p>
     * Lineage reference object : TTB1098_INST_CONT_PH_AREA
     * 
     */
    @JsonProperty("criteria.instContPhArea")
    public String getCriteriaInstContPhArea() {
        return criteriaInstContPhArea;
    }

    /**
     * Contact Phone
     * <p>
     * Lineage reference object : TTB1098_INST_CONT_PH_AREA
     * 
     */
    @JsonProperty("criteria.instContPhArea")
    public void setCriteriaInstContPhArea(String criteriaInstContPhArea) {
        this.criteriaInstContPhArea = criteriaInstContPhArea;
    }

    public _1098TTaxInformations100PutRequest withCriteriaInstContPhArea(String criteriaInstContPhArea) {
        this.criteriaInstContPhArea = criteriaInstContPhArea;
        return this;
    }

    /**
     * Transmitter Additional Information
     * <p>
     * Lineage reference object : TTB1098_TRAN_NAME2
     * 
     */
    @JsonProperty("tranName2")
    public String getTranName2() {
        return tranName2;
    }

    /**
     * Transmitter Additional Information
     * <p>
     * Lineage reference object : TTB1098_TRAN_NAME2
     * 
     */
    @JsonProperty("tranName2")
    public void setTranName2(String tranName2) {
        this.tranName2 = tranName2;
    }

    public _1098TTaxInformations100PutRequest withTranName2(String tranName2) {
        this.tranName2 = tranName2;
        return this;
    }

    /**
     * Contact Phone (Number)
     * <p>
     * Lineage reference object : TTB1098_INST_CONT_PH_NO
     * 
     */
    @JsonProperty("instContPhNo")
    public String getInstContPhNo() {
        return instContPhNo;
    }

    /**
     * Contact Phone (Number)
     * <p>
     * Lineage reference object : TTB1098_INST_CONT_PH_NO
     * 
     */
    @JsonProperty("instContPhNo")
    public void setInstContPhNo(String instContPhNo) {
        this.instContPhNo = instContPhNo;
    }

    public _1098TTaxInformations100PutRequest withInstContPhNo(String instContPhNo) {
        this.instContPhNo = instContPhNo;
        return this;
    }

    /**
     * Foreign Indicator
     * <p>
     * Lineage reference object : TTB1098_INST_FOREIGN_IND
     * 
     */
    @JsonProperty("criteria.instForeignInd")
    public String getCriteriaInstForeignInd() {
        return criteriaInstForeignInd;
    }

    /**
     * Foreign Indicator
     * <p>
     * Lineage reference object : TTB1098_INST_FOREIGN_IND
     * 
     */
    @JsonProperty("criteria.instForeignInd")
    public void setCriteriaInstForeignInd(String criteriaInstForeignInd) {
        this.criteriaInstForeignInd = criteriaInstForeignInd;
    }

    public _1098TTaxInformations100PutRequest withCriteriaInstForeignInd(String criteriaInstForeignInd) {
        this.criteriaInstForeignInd = criteriaInstForeignInd;
        return this;
    }

    /**
     * Contact Name
     * <p>
     * Lineage reference object : TTB1098_TRAN_CONT_NAME
     * (Required)
     * 
     */
    @JsonProperty("tranContName")
    public String getTranContName() {
        return tranContName;
    }

    /**
     * Contact Name
     * <p>
     * Lineage reference object : TTB1098_TRAN_CONT_NAME
     * (Required)
     * 
     */
    @JsonProperty("tranContName")
    public void setTranContName(String tranContName) {
        this.tranContName = tranContName;
    }

    public _1098TTaxInformations100PutRequest withTranContName(String tranContName) {
        this.tranContName = tranContName;
        return this;
    }

    /**
     * State or Province
     * <p>
     * Lineage reference object : TTB1098_TRAN_CO_ST_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("tranCoStCode")
    public String getTranCoStCode() {
        return tranCoStCode;
    }

    /**
     * State or Province
     * <p>
     * Lineage reference object : TTB1098_TRAN_CO_ST_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("tranCoStCode")
    public void setTranCoStCode(String tranCoStCode) {
        this.tranCoStCode = tranCoStCode;
    }

    public _1098TTaxInformations100PutRequest withTranCoStCode(String tranCoStCode) {
        this.tranCoStCode = tranCoStCode;
        return this;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : TTB1098_TRAN_CONT_PH_EXT
     * 
     */
    @JsonProperty("tranContPhExt")
    public String getTranContPhExt() {
        return tranContPhExt;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : TTB1098_TRAN_CONT_PH_EXT
     * 
     */
    @JsonProperty("tranContPhExt")
    public void setTranContPhExt(String tranContPhExt) {
        this.tranContPhExt = tranContPhExt;
    }

    public _1098TTaxInformations100PutRequest withTranContPhExt(String tranContPhExt) {
        this.tranContPhExt = tranContPhExt;
        return this;
    }

    /**
     * Name Control
     * <p>
     * Lineage reference object : TTB1098_INST_NAME_CTRL
     * 
     */
    @JsonProperty("criteria.instNameCtrl")
    public String getCriteriaInstNameCtrl() {
        return criteriaInstNameCtrl;
    }

    /**
     * Name Control
     * <p>
     * Lineage reference object : TTB1098_INST_NAME_CTRL
     * 
     */
    @JsonProperty("criteria.instNameCtrl")
    public void setCriteriaInstNameCtrl(String criteriaInstNameCtrl) {
        this.criteriaInstNameCtrl = criteriaInstNameCtrl;
    }

    public _1098TTaxInformations100PutRequest withCriteriaInstNameCtrl(String criteriaInstNameCtrl) {
        this.criteriaInstNameCtrl = criteriaInstNameCtrl;
        return this;
    }

    /**
     * Phone
     * <p>
     * Lineage reference object : TTB1098_TRAN_CONT_PH_AREA
     * 
     */
    @JsonProperty("tranContPhArea")
    public String getTranContPhArea() {
        return tranContPhArea;
    }

    /**
     * Phone
     * <p>
     * Lineage reference object : TTB1098_TRAN_CONT_PH_AREA
     * 
     */
    @JsonProperty("tranContPhArea")
    public void setTranContPhArea(String tranContPhArea) {
        this.tranContPhArea = tranContPhArea;
    }

    public _1098TTaxInformations100PutRequest withTranContPhArea(String tranContPhArea) {
        this.tranContPhArea = tranContPhArea;
        return this;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : TTB1098_INST_CONT_PH_EXT
     * 
     */
    @JsonProperty("instContPhExt")
    public String getInstContPhExt() {
        return instContPhExt;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : TTB1098_INST_CONT_PH_EXT
     * 
     */
    @JsonProperty("instContPhExt")
    public void setInstContPhExt(String instContPhExt) {
        this.instContPhExt = instContPhExt;
    }

    public _1098TTaxInformations100PutRequest withInstContPhExt(String instContPhExt) {
        this.instContPhExt = instContPhExt;
        return this;
    }

    /**
     * Office Code
     * <p>
     * Lineage reference object : TTB1098_INST_OFFICE_CODE
     * 
     */
    @JsonProperty("instOfficeCode")
    public String getInstOfficeCode() {
        return instOfficeCode;
    }

    /**
     * Office Code
     * <p>
     * Lineage reference object : TTB1098_INST_OFFICE_CODE
     * 
     */
    @JsonProperty("instOfficeCode")
    public void setInstOfficeCode(String instOfficeCode) {
        this.instOfficeCode = instOfficeCode;
    }

    public _1098TTaxInformations100PutRequest withInstOfficeCode(String instOfficeCode) {
        this.instOfficeCode = instOfficeCode;
        return this;
    }

    /**
     * Foreign Indicator
     * <p>
     * Lineage reference object : TTB1098_TRAN_FOREIGN_IND
     * 
     */
    @JsonProperty("criteria.tranForeignInd")
    public String getCriteriaTranForeignInd() {
        return criteriaTranForeignInd;
    }

    /**
     * Foreign Indicator
     * <p>
     * Lineage reference object : TTB1098_TRAN_FOREIGN_IND
     * 
     */
    @JsonProperty("criteria.tranForeignInd")
    public void setCriteriaTranForeignInd(String criteriaTranForeignInd) {
        this.criteriaTranForeignInd = criteriaTranForeignInd;
    }

    public _1098TTaxInformations100PutRequest withCriteriaTranForeignInd(String criteriaTranForeignInd) {
        this.criteriaTranForeignInd = criteriaTranForeignInd;
        return this;
    }

    /**
     * Additional Mailing Address Information
     * <p>
     * Lineage reference object : TTB1098_INST_ADDRESS2
     * 
     */
    @JsonProperty("criteria.instAddress2")
    public String getCriteriaInstAddress2() {
        return criteriaInstAddress2;
    }

    /**
     * Additional Mailing Address Information
     * <p>
     * Lineage reference object : TTB1098_INST_ADDRESS2
     * 
     */
    @JsonProperty("criteria.instAddress2")
    public void setCriteriaInstAddress2(String criteriaInstAddress2) {
        this.criteriaInstAddress2 = criteriaInstAddress2;
    }

    public _1098TTaxInformations100PutRequest withCriteriaInstAddress2(String criteriaInstAddress2) {
        this.criteriaInstAddress2 = criteriaInstAddress2;
        return this;
    }

    /**
     * Institution's Name
     * <p>
     * Lineage reference object : TTB1098_INST_NAME1
     * (Required)
     * 
     */
    @JsonProperty("instName1")
    public String getInstName1() {
        return instName1;
    }

    /**
     * Institution's Name
     * <p>
     * Lineage reference object : TTB1098_INST_NAME1
     * (Required)
     * 
     */
    @JsonProperty("instName1")
    public void setInstName1(String instName1) {
        this.instName1 = instName1;
    }

    public _1098TTaxInformations100PutRequest withInstName1(String instName1) {
        this.instName1 = instName1;
        return this;
    }

    /**
     * Mailing Address
     * <p>
     * Lineage reference object : TTB1098_INST_ADDRESS1
     * (Required)
     * 
     */
    @JsonProperty("criteria.instAddress1")
    public String getCriteriaInstAddress1() {
        return criteriaInstAddress1;
    }

    /**
     * Mailing Address
     * <p>
     * Lineage reference object : TTB1098_INST_ADDRESS1
     * (Required)
     * 
     */
    @JsonProperty("criteria.instAddress1")
    public void setCriteriaInstAddress1(String criteriaInstAddress1) {
        this.criteriaInstAddress1 = criteriaInstAddress1;
    }

    public _1098TTaxInformations100PutRequest withCriteriaInstAddress1(String criteriaInstAddress1) {
        this.criteriaInstAddress1 = criteriaInstAddress1;
        return this;
    }

    /**
     * Foreign Indicator
     * <p>
     * Lineage reference object : TTB1098_INST_FOREIGN_IND
     * 
     */
    @JsonProperty("instForeignInd")
    public String getInstForeignInd() {
        return instForeignInd;
    }

    /**
     * Foreign Indicator
     * <p>
     * Lineage reference object : TTB1098_INST_FOREIGN_IND
     * 
     */
    @JsonProperty("instForeignInd")
    public void setInstForeignInd(String instForeignInd) {
        this.instForeignInd = instForeignInd;
    }

    public _1098TTaxInformations100PutRequest withInstForeignInd(String instForeignInd) {
        this.instForeignInd = instForeignInd;
        return this;
    }

    /**
     * Institutional Additional Information
     * <p>
     * Lineage reference object : TTB1098_INST_NAME2
     * 
     */
    @JsonProperty("instName2")
    public String getInstName2() {
        return instName2;
    }

    /**
     * Institutional Additional Information
     * <p>
     * Lineage reference object : TTB1098_INST_NAME2
     * 
     */
    @JsonProperty("instName2")
    public void setInstName2(String instName2) {
        this.instName2 = instName2;
    }

    public _1098TTaxInformations100PutRequest withInstName2(String instName2) {
        this.instName2 = instName2;
        return this;
    }

    /**
     * State or Province
     * <p>
     * Lineage reference object : TTB1098_TRAN_CO_ST_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("criteria.tranCoStCode")
    public String getCriteriaTranCoStCode() {
        return criteriaTranCoStCode;
    }

    /**
     * State or Province
     * <p>
     * Lineage reference object : TTB1098_TRAN_CO_ST_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("criteria.tranCoStCode")
    public void setCriteriaTranCoStCode(String criteriaTranCoStCode) {
        this.criteriaTranCoStCode = criteriaTranCoStCode;
    }

    public _1098TTaxInformations100PutRequest withCriteriaTranCoStCode(String criteriaTranCoStCode) {
        this.criteriaTranCoStCode = criteriaTranCoStCode;
        return this;
    }

    /**
     * Mailing Address
     * <p>
     * Lineage reference object : TTB1098_TRAN_CO_ADDRESS
     * (Required)
     * 
     */
    @JsonProperty("criteria.tranCoAddress")
    public String getCriteriaTranCoAddress() {
        return criteriaTranCoAddress;
    }

    /**
     * Mailing Address
     * <p>
     * Lineage reference object : TTB1098_TRAN_CO_ADDRESS
     * (Required)
     * 
     */
    @JsonProperty("criteria.tranCoAddress")
    public void setCriteriaTranCoAddress(String criteriaTranCoAddress) {
        this.criteriaTranCoAddress = criteriaTranCoAddress;
    }

    public _1098TTaxInformations100PutRequest withCriteriaTranCoAddress(String criteriaTranCoAddress) {
        this.criteriaTranCoAddress = criteriaTranCoAddress;
        return this;
    }

    /**
     * Nation
     * <p>
     * Lineage reference object : TTB1098_INST_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("criteria.instNatnCode")
    public String getCriteriaInstNatnCode() {
        return criteriaInstNatnCode;
    }

    /**
     * Nation
     * <p>
     * Lineage reference object : TTB1098_INST_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("criteria.instNatnCode")
    public void setCriteriaInstNatnCode(String criteriaInstNatnCode) {
        this.criteriaInstNatnCode = criteriaInstNatnCode;
    }

    public _1098TTaxInformations100PutRequest withCriteriaInstNatnCode(String criteriaInstNatnCode) {
        this.criteriaInstNatnCode = criteriaInstNatnCode;
        return this;
    }

    /**
     * Contact Phone
     * <p>
     * Lineage reference object : TTB1098_INST_CONT_PH_AREA
     * 
     */
    @JsonProperty("instContPhArea")
    public String getInstContPhArea() {
        return instContPhArea;
    }

    /**
     * Contact Phone
     * <p>
     * Lineage reference object : TTB1098_INST_CONT_PH_AREA
     * 
     */
    @JsonProperty("instContPhArea")
    public void setInstContPhArea(String instContPhArea) {
        this.instContPhArea = instContPhArea;
    }

    public _1098TTaxInformations100PutRequest withInstContPhArea(String instContPhArea) {
        this.instContPhArea = instContPhArea;
        return this;
    }

    /**
     * Name Control
     * <p>
     * Lineage reference object : TTB1098_INST_NAME_CTRL
     * 
     */
    @JsonProperty("instNameCtrl")
    public String getInstNameCtrl() {
        return instNameCtrl;
    }

    /**
     * Name Control
     * <p>
     * Lineage reference object : TTB1098_INST_NAME_CTRL
     * 
     */
    @JsonProperty("instNameCtrl")
    public void setInstNameCtrl(String instNameCtrl) {
        this.instNameCtrl = instNameCtrl;
    }

    public _1098TTaxInformations100PutRequest withInstNameCtrl(String instNameCtrl) {
        this.instNameCtrl = instNameCtrl;
        return this;
    }

    /**
     * Nation
     * <p>
     * Lineage reference object : TTB1098_TRAN_CO_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("tranCoNatnCode")
    public String getTranCoNatnCode() {
        return tranCoNatnCode;
    }

    /**
     * Nation
     * <p>
     * Lineage reference object : TTB1098_TRAN_CO_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("tranCoNatnCode")
    public void setTranCoNatnCode(String tranCoNatnCode) {
        this.tranCoNatnCode = tranCoNatnCode;
    }

    public _1098TTaxInformations100PutRequest withTranCoNatnCode(String tranCoNatnCode) {
        this.tranCoNatnCode = tranCoNatnCode;
        return this;
    }

    /**
     * Email Address
     * <p>
     * Lineage reference object : TTB1098_TRAN_CONT_EMAIL
     * 
     */
    @JsonProperty("criteria.tranContEmail")
    public String getCriteriaTranContEmail() {
        return criteriaTranContEmail;
    }

    /**
     * Email Address
     * <p>
     * Lineage reference object : TTB1098_TRAN_CONT_EMAIL
     * 
     */
    @JsonProperty("criteria.tranContEmail")
    public void setCriteriaTranContEmail(String criteriaTranContEmail) {
        this.criteriaTranContEmail = criteriaTranContEmail;
    }

    public _1098TTaxInformations100PutRequest withCriteriaTranContEmail(String criteriaTranContEmail) {
        this.criteriaTranContEmail = criteriaTranContEmail;
        return this;
    }

    /**
     * City
     * <p>
     * Lineage reference object : TTB1098_INST_CITY
     * (Required)
     * 
     */
    @JsonProperty("instCity")
    public String getInstCity() {
        return instCity;
    }

    /**
     * City
     * <p>
     * Lineage reference object : TTB1098_INST_CITY
     * (Required)
     * 
     */
    @JsonProperty("instCity")
    public void setInstCity(String instCity) {
        this.instCity = instCity;
    }

    public _1098TTaxInformations100PutRequest withInstCity(String instCity) {
        this.instCity = instCity;
        return this;
    }

    /**
     * City
     * <p>
     * Lineage reference object : TTB1098_TRAN_CO_CITY
     * (Required)
     * 
     */
    @JsonProperty("criteria.tranCoCity")
    public String getCriteriaTranCoCity() {
        return criteriaTranCoCity;
    }

    /**
     * City
     * <p>
     * Lineage reference object : TTB1098_TRAN_CO_CITY
     * (Required)
     * 
     */
    @JsonProperty("criteria.tranCoCity")
    public void setCriteriaTranCoCity(String criteriaTranCoCity) {
        this.criteriaTranCoCity = criteriaTranCoCity;
    }

    public _1098TTaxInformations100PutRequest withCriteriaTranCoCity(String criteriaTranCoCity) {
        this.criteriaTranCoCity = criteriaTranCoCity;
        return this;
    }

    /**
     * Transmitter Control Code
     * <p>
     * Lineage reference object : TTB1098_TRAN_CTRL_CODE
     * 
     */
    @JsonProperty("criteria.tranCtrlCode")
    public String getCriteriaTranCtrlCode() {
        return criteriaTranCtrlCode;
    }

    /**
     * Transmitter Control Code
     * <p>
     * Lineage reference object : TTB1098_TRAN_CTRL_CODE
     * 
     */
    @JsonProperty("criteria.tranCtrlCode")
    public void setCriteriaTranCtrlCode(String criteriaTranCtrlCode) {
        this.criteriaTranCtrlCode = criteriaTranCtrlCode;
    }

    public _1098TTaxInformations100PutRequest withCriteriaTranCtrlCode(String criteriaTranCtrlCode) {
        this.criteriaTranCtrlCode = criteriaTranCtrlCode;
        return this;
    }

    /**
     * Transmitter Name
     * <p>
     * Lineage reference object : TTB1098_TRAN_NAME1
     * 
     */
    @JsonProperty("criteria.tranName1")
    public String getCriteriaTranName1() {
        return criteriaTranName1;
    }

    /**
     * Transmitter Name
     * <p>
     * Lineage reference object : TTB1098_TRAN_NAME1
     * 
     */
    @JsonProperty("criteria.tranName1")
    public void setCriteriaTranName1(String criteriaTranName1) {
        this.criteriaTranName1 = criteriaTranName1;
    }

    public _1098TTaxInformations100PutRequest withCriteriaTranName1(String criteriaTranName1) {
        this.criteriaTranName1 = criteriaTranName1;
        return this;
    }

    /**
     * Office Code
     * <p>
     * Lineage reference object : TTB1098_INST_OFFICE_CODE
     * 
     */
    @JsonProperty("criteria.instOfficeCode")
    public String getCriteriaInstOfficeCode() {
        return criteriaInstOfficeCode;
    }

    /**
     * Office Code
     * <p>
     * Lineage reference object : TTB1098_INST_OFFICE_CODE
     * 
     */
    @JsonProperty("criteria.instOfficeCode")
    public void setCriteriaInstOfficeCode(String criteriaInstOfficeCode) {
        this.criteriaInstOfficeCode = criteriaInstOfficeCode;
    }

    public _1098TTaxInformations100PutRequest withCriteriaInstOfficeCode(String criteriaInstOfficeCode) {
        this.criteriaInstOfficeCode = criteriaInstOfficeCode;
        return this;
    }

    /**
     * Institution's TIN
     * <p>
     * Lineage reference object : TTB1098_INST_TIN
     * (Required)
     * 
     */
    @JsonProperty("instTin")
    public String getInstTin() {
        return instTin;
    }

    /**
     * Institution's TIN
     * <p>
     * Lineage reference object : TTB1098_INST_TIN
     * (Required)
     * 
     */
    @JsonProperty("instTin")
    public void setInstTin(String instTin) {
        this.instTin = instTin;
    }

    public _1098TTaxInformations100PutRequest withInstTin(String instTin) {
        this.instTin = instTin;
        return this;
    }

    /**
     * Transmitter Additional Information
     * <p>
     * Lineage reference object : TTB1098_TRAN_NAME2
     * 
     */
    @JsonProperty("criteria.tranName2")
    public String getCriteriaTranName2() {
        return criteriaTranName2;
    }

    /**
     * Transmitter Additional Information
     * <p>
     * Lineage reference object : TTB1098_TRAN_NAME2
     * 
     */
    @JsonProperty("criteria.tranName2")
    public void setCriteriaTranName2(String criteriaTranName2) {
        this.criteriaTranName2 = criteriaTranName2;
    }

    public _1098TTaxInformations100PutRequest withCriteriaTranName2(String criteriaTranName2) {
        this.criteriaTranName2 = criteriaTranName2;
        return this;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : TTB1098_INST_ZIP_CODE, Lookup lineage reference object : gtvzipc
     * 
     */
    @JsonProperty("criteria.instZipCode")
    public String getCriteriaInstZipCode() {
        return criteriaInstZipCode;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : TTB1098_INST_ZIP_CODE, Lookup lineage reference object : gtvzipc
     * 
     */
    @JsonProperty("criteria.instZipCode")
    public void setCriteriaInstZipCode(String criteriaInstZipCode) {
        this.criteriaInstZipCode = criteriaInstZipCode;
    }

    public _1098TTaxInformations100PutRequest withCriteriaInstZipCode(String criteriaInstZipCode) {
        this.criteriaInstZipCode = criteriaInstZipCode;
        return this;
    }

    /**
     * Phone(Number)
     * <p>
     * Lineage reference object : TTB1098_TRAN_CONT_PH_NO
     * 
     */
    @JsonProperty("tranContPhNo")
    public String getTranContPhNo() {
        return tranContPhNo;
    }

    /**
     * Phone(Number)
     * <p>
     * Lineage reference object : TTB1098_TRAN_CONT_PH_NO
     * 
     */
    @JsonProperty("tranContPhNo")
    public void setTranContPhNo(String tranContPhNo) {
        this.tranContPhNo = tranContPhNo;
    }

    public _1098TTaxInformations100PutRequest withTranContPhNo(String tranContPhNo) {
        this.tranContPhNo = tranContPhNo;
        return this;
    }

    /**
     * City
     * <p>
     * Lineage reference object : TTB1098_INST_CITY
     * (Required)
     * 
     */
    @JsonProperty("criteria.instCity")
    public String getCriteriaInstCity() {
        return criteriaInstCity;
    }

    /**
     * City
     * <p>
     * Lineage reference object : TTB1098_INST_CITY
     * (Required)
     * 
     */
    @JsonProperty("criteria.instCity")
    public void setCriteriaInstCity(String criteriaInstCity) {
        this.criteriaInstCity = criteriaInstCity;
    }

    public _1098TTaxInformations100PutRequest withCriteriaInstCity(String criteriaInstCity) {
        this.criteriaInstCity = criteriaInstCity;
        return this;
    }

    /**
     * Transmitter Company Name
     * <p>
     * Lineage reference object : TTB1098_TRAN_CO_NAME1
     * (Required)
     * 
     */
    @JsonProperty("tranCoName1")
    public String getTranCoName1() {
        return tranCoName1;
    }

    /**
     * Transmitter Company Name
     * <p>
     * Lineage reference object : TTB1098_TRAN_CO_NAME1
     * (Required)
     * 
     */
    @JsonProperty("tranCoName1")
    public void setTranCoName1(String tranCoName1) {
        this.tranCoName1 = tranCoName1;
    }

    public _1098TTaxInformations100PutRequest withTranCoName1(String tranCoName1) {
        this.tranCoName1 = tranCoName1;
        return this;
    }

    /**
     * Phone
     * <p>
     * Lineage reference object : TTB1098_TRAN_CONT_PH_AREA
     * 
     */
    @JsonProperty("criteria.tranContPhArea")
    public String getCriteriaTranContPhArea() {
        return criteriaTranContPhArea;
    }

    /**
     * Phone
     * <p>
     * Lineage reference object : TTB1098_TRAN_CONT_PH_AREA
     * 
     */
    @JsonProperty("criteria.tranContPhArea")
    public void setCriteriaTranContPhArea(String criteriaTranContPhArea) {
        this.criteriaTranContPhArea = criteriaTranContPhArea;
    }

    public _1098TTaxInformations100PutRequest withCriteriaTranContPhArea(String criteriaTranContPhArea) {
        this.criteriaTranContPhArea = criteriaTranContPhArea;
        return this;
    }

    @JsonProperty("criteria.instNatnDesc")
    public String getCriteriaInstNatnDesc() {
        return criteriaInstNatnDesc;
    }

    @JsonProperty("criteria.instNatnDesc")
    public void setCriteriaInstNatnDesc(String criteriaInstNatnDesc) {
        this.criteriaInstNatnDesc = criteriaInstNatnDesc;
    }

    public _1098TTaxInformations100PutRequest withCriteriaInstNatnDesc(String criteriaInstNatnDesc) {
        this.criteriaInstNatnDesc = criteriaInstNatnDesc;
        return this;
    }

    /**
     * Institution's TIN
     * <p>
     * Lineage reference object : TTB1098_INST_TIN
     * (Required)
     * 
     */
    @JsonProperty("criteria.instTin")
    public String getCriteriaInstTin() {
        return criteriaInstTin;
    }

    /**
     * Institution's TIN
     * <p>
     * Lineage reference object : TTB1098_INST_TIN
     * (Required)
     * 
     */
    @JsonProperty("criteria.instTin")
    public void setCriteriaInstTin(String criteriaInstTin) {
        this.criteriaInstTin = criteriaInstTin;
    }

    public _1098TTaxInformations100PutRequest withCriteriaInstTin(String criteriaInstTin) {
        this.criteriaInstTin = criteriaInstTin;
        return this;
    }

    /**
     * Mailing Address
     * <p>
     * Lineage reference object : TTB1098_TRAN_CO_ADDRESS
     * (Required)
     * 
     */
    @JsonProperty("tranCoAddress")
    public String getTranCoAddress() {
        return tranCoAddress;
    }

    /**
     * Mailing Address
     * <p>
     * Lineage reference object : TTB1098_TRAN_CO_ADDRESS
     * (Required)
     * 
     */
    @JsonProperty("tranCoAddress")
    public void setTranCoAddress(String tranCoAddress) {
        this.tranCoAddress = tranCoAddress;
    }

    public _1098TTaxInformations100PutRequest withTranCoAddress(String tranCoAddress) {
        this.tranCoAddress = tranCoAddress;
        return this;
    }

    /**
     * State or Province
     * <p>
     * Lineage reference object : TTB1098_INST_ST_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("instStCode")
    public String getInstStCode() {
        return instStCode;
    }

    /**
     * State or Province
     * <p>
     * Lineage reference object : TTB1098_INST_ST_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("instStCode")
    public void setInstStCode(String instStCode) {
        this.instStCode = instStCode;
    }

    public _1098TTaxInformations100PutRequest withInstStCode(String instStCode) {
        this.instStCode = instStCode;
        return this;
    }

    /**
     * Transmitter Company Additional Information
     * <p>
     * Lineage reference object : TTB1098_TRAN_CO_NAME2
     * 
     */
    @JsonProperty("criteria.tranCoName2")
    public String getCriteriaTranCoName2() {
        return criteriaTranCoName2;
    }

    /**
     * Transmitter Company Additional Information
     * <p>
     * Lineage reference object : TTB1098_TRAN_CO_NAME2
     * 
     */
    @JsonProperty("criteria.tranCoName2")
    public void setCriteriaTranCoName2(String criteriaTranCoName2) {
        this.criteriaTranCoName2 = criteriaTranCoName2;
    }

    public _1098TTaxInformations100PutRequest withCriteriaTranCoName2(String criteriaTranCoName2) {
        this.criteriaTranCoName2 = criteriaTranCoName2;
        return this;
    }

    /**
     * Phone(Number)
     * <p>
     * Lineage reference object : TTB1098_TRAN_CONT_PH_NO
     * 
     */
    @JsonProperty("criteria.tranContPhNo")
    public String getCriteriaTranContPhNo() {
        return criteriaTranContPhNo;
    }

    /**
     * Phone(Number)
     * <p>
     * Lineage reference object : TTB1098_TRAN_CONT_PH_NO
     * 
     */
    @JsonProperty("criteria.tranContPhNo")
    public void setCriteriaTranContPhNo(String criteriaTranContPhNo) {
        this.criteriaTranContPhNo = criteriaTranContPhNo;
    }

    public _1098TTaxInformations100PutRequest withCriteriaTranContPhNo(String criteriaTranContPhNo) {
        this.criteriaTranContPhNo = criteriaTranContPhNo;
        return this;
    }

    /**
     * Transmitter Company Name
     * <p>
     * Lineage reference object : TTB1098_TRAN_CO_NAME1
     * (Required)
     * 
     */
    @JsonProperty("criteria.tranCoName1")
    public String getCriteriaTranCoName1() {
        return criteriaTranCoName1;
    }

    /**
     * Transmitter Company Name
     * <p>
     * Lineage reference object : TTB1098_TRAN_CO_NAME1
     * (Required)
     * 
     */
    @JsonProperty("criteria.tranCoName1")
    public void setCriteriaTranCoName1(String criteriaTranCoName1) {
        this.criteriaTranCoName1 = criteriaTranCoName1;
    }

    public _1098TTaxInformations100PutRequest withCriteriaTranCoName1(String criteriaTranCoName1) {
        this.criteriaTranCoName1 = criteriaTranCoName1;
        return this;
    }

    /**
     * Transmitter Company Additional Information
     * <p>
     * Lineage reference object : TTB1098_TRAN_CO_NAME2
     * 
     */
    @JsonProperty("tranCoName2")
    public String getTranCoName2() {
        return tranCoName2;
    }

    /**
     * Transmitter Company Additional Information
     * <p>
     * Lineage reference object : TTB1098_TRAN_CO_NAME2
     * 
     */
    @JsonProperty("tranCoName2")
    public void setTranCoName2(String tranCoName2) {
        this.tranCoName2 = tranCoName2;
    }

    public _1098TTaxInformations100PutRequest withTranCoName2(String tranCoName2) {
        this.tranCoName2 = tranCoName2;
        return this;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : TTB1098_TRAN_CO_ZIP_CODE, Lookup lineage reference object : gtvzipc
     * 
     */
    @JsonProperty("criteria.tranCoZipCode")
    public String getCriteriaTranCoZipCode() {
        return criteriaTranCoZipCode;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : TTB1098_TRAN_CO_ZIP_CODE, Lookup lineage reference object : gtvzipc
     * 
     */
    @JsonProperty("criteria.tranCoZipCode")
    public void setCriteriaTranCoZipCode(String criteriaTranCoZipCode) {
        this.criteriaTranCoZipCode = criteriaTranCoZipCode;
    }

    public _1098TTaxInformations100PutRequest withCriteriaTranCoZipCode(String criteriaTranCoZipCode) {
        this.criteriaTranCoZipCode = criteriaTranCoZipCode;
        return this;
    }

    /**
     * Nation
     * <p>
     * Lineage reference object : TTB1098_INST_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("instNatnCode")
    public String getInstNatnCode() {
        return instNatnCode;
    }

    /**
     * Nation
     * <p>
     * Lineage reference object : TTB1098_INST_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("instNatnCode")
    public void setInstNatnCode(String instNatnCode) {
        this.instNatnCode = instNatnCode;
    }

    public _1098TTaxInformations100PutRequest withInstNatnCode(String instNatnCode) {
        this.instNatnCode = instNatnCode;
        return this;
    }

    /**
     * Mailing Address
     * <p>
     * Lineage reference object : TTB1098_INST_ADDRESS1
     * (Required)
     * 
     */
    @JsonProperty("instAddress1")
    public String getInstAddress1() {
        return instAddress1;
    }

    /**
     * Mailing Address
     * <p>
     * Lineage reference object : TTB1098_INST_ADDRESS1
     * (Required)
     * 
     */
    @JsonProperty("instAddress1")
    public void setInstAddress1(String instAddress1) {
        this.instAddress1 = instAddress1;
    }

    public _1098TTaxInformations100PutRequest withInstAddress1(String instAddress1) {
        this.instAddress1 = instAddress1;
        return this;
    }

    /**
     * State or Province
     * <p>
     * Lineage reference object : TTB1098_INST_ST_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("criteria.instStCode")
    public String getCriteriaInstStCode() {
        return criteriaInstStCode;
    }

    /**
     * State or Province
     * <p>
     * Lineage reference object : TTB1098_INST_ST_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("criteria.instStCode")
    public void setCriteriaInstStCode(String criteriaInstStCode) {
        this.criteriaInstStCode = criteriaInstStCode;
    }

    public _1098TTaxInformations100PutRequest withCriteriaInstStCode(String criteriaInstStCode) {
        this.criteriaInstStCode = criteriaInstStCode;
        return this;
    }

    /**
     * Additional Mailing Address Information
     * <p>
     * Lineage reference object : TTB1098_INST_ADDRESS2
     * 
     */
    @JsonProperty("instAddress2")
    public String getInstAddress2() {
        return instAddress2;
    }

    /**
     * Additional Mailing Address Information
     * <p>
     * Lineage reference object : TTB1098_INST_ADDRESS2
     * 
     */
    @JsonProperty("instAddress2")
    public void setInstAddress2(String instAddress2) {
        this.instAddress2 = instAddress2;
    }

    public _1098TTaxInformations100PutRequest withInstAddress2(String instAddress2) {
        this.instAddress2 = instAddress2;
        return this;
    }

    @JsonProperty("tranCoNatnDesc")
    public String getTranCoNatnDesc() {
        return tranCoNatnDesc;
    }

    @JsonProperty("tranCoNatnDesc")
    public void setTranCoNatnDesc(String tranCoNatnDesc) {
        this.tranCoNatnDesc = tranCoNatnDesc;
    }

    public _1098TTaxInformations100PutRequest withTranCoNatnDesc(String tranCoNatnDesc) {
        this.tranCoNatnDesc = tranCoNatnDesc;
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

    public _1098TTaxInformations100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(_1098TTaxInformations100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaTranCoNatnDesc");
        sb.append('=');
        sb.append(((this.criteriaTranCoNatnDesc == null)?"<null>":this.criteriaTranCoNatnDesc));
        sb.append(',');
        sb.append("instZipCode");
        sb.append('=');
        sb.append(((this.instZipCode == null)?"<null>":this.instZipCode));
        sb.append(',');
        sb.append("tranContEmail");
        sb.append('=');
        sb.append(((this.tranContEmail == null)?"<null>":this.tranContEmail));
        sb.append(',');
        sb.append("criteriaTranContName");
        sb.append('=');
        sb.append(((this.criteriaTranContName == null)?"<null>":this.criteriaTranContName));
        sb.append(',');
        sb.append("criteriaInstContPhExt");
        sb.append('=');
        sb.append(((this.criteriaInstContPhExt == null)?"<null>":this.criteriaInstContPhExt));
        sb.append(',');
        sb.append("tranTin");
        sb.append('=');
        sb.append(((this.tranTin == null)?"<null>":this.tranTin));
        sb.append(',');
        sb.append("tranCoZipCode");
        sb.append('=');
        sb.append(((this.tranCoZipCode == null)?"<null>":this.tranCoZipCode));
        sb.append(',');
        sb.append("tranCoCity");
        sb.append('=');
        sb.append(((this.tranCoCity == null)?"<null>":this.tranCoCity));
        sb.append(',');
        sb.append("criteriaTranTin");
        sb.append('=');
        sb.append(((this.criteriaTranTin == null)?"<null>":this.criteriaTranTin));
        sb.append(',');
        sb.append("criteriaInstName2");
        sb.append('=');
        sb.append(((this.criteriaInstName2 == null)?"<null>":this.criteriaInstName2));
        sb.append(',');
        sb.append("criteriaInstName1");
        sb.append('=');
        sb.append(((this.criteriaInstName1 == null)?"<null>":this.criteriaInstName1));
        sb.append(',');
        sb.append("instNatnDesc");
        sb.append('=');
        sb.append(((this.instNatnDesc == null)?"<null>":this.instNatnDesc));
        sb.append(',');
        sb.append("criteriaTranContPhExt");
        sb.append('=');
        sb.append(((this.criteriaTranContPhExt == null)?"<null>":this.criteriaTranContPhExt));
        sb.append(',');
        sb.append("tranForeignInd");
        sb.append('=');
        sb.append(((this.tranForeignInd == null)?"<null>":this.tranForeignInd));
        sb.append(',');
        sb.append("criteriaInstContPhNo");
        sb.append('=');
        sb.append(((this.criteriaInstContPhNo == null)?"<null>":this.criteriaInstContPhNo));
        sb.append(',');
        sb.append("criteriaTranCoNatnCode");
        sb.append('=');
        sb.append(((this.criteriaTranCoNatnCode == null)?"<null>":this.criteriaTranCoNatnCode));
        sb.append(',');
        sb.append("tranName1");
        sb.append('=');
        sb.append(((this.tranName1 == null)?"<null>":this.tranName1));
        sb.append(',');
        sb.append("tranCtrlCode");
        sb.append('=');
        sb.append(((this.tranCtrlCode == null)?"<null>":this.tranCtrlCode));
        sb.append(',');
        sb.append("criteriaInstContPhArea");
        sb.append('=');
        sb.append(((this.criteriaInstContPhArea == null)?"<null>":this.criteriaInstContPhArea));
        sb.append(',');
        sb.append("tranName2");
        sb.append('=');
        sb.append(((this.tranName2 == null)?"<null>":this.tranName2));
        sb.append(',');
        sb.append("instContPhNo");
        sb.append('=');
        sb.append(((this.instContPhNo == null)?"<null>":this.instContPhNo));
        sb.append(',');
        sb.append("criteriaInstForeignInd");
        sb.append('=');
        sb.append(((this.criteriaInstForeignInd == null)?"<null>":this.criteriaInstForeignInd));
        sb.append(',');
        sb.append("tranContName");
        sb.append('=');
        sb.append(((this.tranContName == null)?"<null>":this.tranContName));
        sb.append(',');
        sb.append("tranCoStCode");
        sb.append('=');
        sb.append(((this.tranCoStCode == null)?"<null>":this.tranCoStCode));
        sb.append(',');
        sb.append("tranContPhExt");
        sb.append('=');
        sb.append(((this.tranContPhExt == null)?"<null>":this.tranContPhExt));
        sb.append(',');
        sb.append("criteriaInstNameCtrl");
        sb.append('=');
        sb.append(((this.criteriaInstNameCtrl == null)?"<null>":this.criteriaInstNameCtrl));
        sb.append(',');
        sb.append("tranContPhArea");
        sb.append('=');
        sb.append(((this.tranContPhArea == null)?"<null>":this.tranContPhArea));
        sb.append(',');
        sb.append("instContPhExt");
        sb.append('=');
        sb.append(((this.instContPhExt == null)?"<null>":this.instContPhExt));
        sb.append(',');
        sb.append("instOfficeCode");
        sb.append('=');
        sb.append(((this.instOfficeCode == null)?"<null>":this.instOfficeCode));
        sb.append(',');
        sb.append("criteriaTranForeignInd");
        sb.append('=');
        sb.append(((this.criteriaTranForeignInd == null)?"<null>":this.criteriaTranForeignInd));
        sb.append(',');
        sb.append("criteriaInstAddress2");
        sb.append('=');
        sb.append(((this.criteriaInstAddress2 == null)?"<null>":this.criteriaInstAddress2));
        sb.append(',');
        sb.append("instName1");
        sb.append('=');
        sb.append(((this.instName1 == null)?"<null>":this.instName1));
        sb.append(',');
        sb.append("criteriaInstAddress1");
        sb.append('=');
        sb.append(((this.criteriaInstAddress1 == null)?"<null>":this.criteriaInstAddress1));
        sb.append(',');
        sb.append("instForeignInd");
        sb.append('=');
        sb.append(((this.instForeignInd == null)?"<null>":this.instForeignInd));
        sb.append(',');
        sb.append("instName2");
        sb.append('=');
        sb.append(((this.instName2 == null)?"<null>":this.instName2));
        sb.append(',');
        sb.append("criteriaTranCoStCode");
        sb.append('=');
        sb.append(((this.criteriaTranCoStCode == null)?"<null>":this.criteriaTranCoStCode));
        sb.append(',');
        sb.append("criteriaTranCoAddress");
        sb.append('=');
        sb.append(((this.criteriaTranCoAddress == null)?"<null>":this.criteriaTranCoAddress));
        sb.append(',');
        sb.append("criteriaInstNatnCode");
        sb.append('=');
        sb.append(((this.criteriaInstNatnCode == null)?"<null>":this.criteriaInstNatnCode));
        sb.append(',');
        sb.append("instContPhArea");
        sb.append('=');
        sb.append(((this.instContPhArea == null)?"<null>":this.instContPhArea));
        sb.append(',');
        sb.append("instNameCtrl");
        sb.append('=');
        sb.append(((this.instNameCtrl == null)?"<null>":this.instNameCtrl));
        sb.append(',');
        sb.append("tranCoNatnCode");
        sb.append('=');
        sb.append(((this.tranCoNatnCode == null)?"<null>":this.tranCoNatnCode));
        sb.append(',');
        sb.append("criteriaTranContEmail");
        sb.append('=');
        sb.append(((this.criteriaTranContEmail == null)?"<null>":this.criteriaTranContEmail));
        sb.append(',');
        sb.append("instCity");
        sb.append('=');
        sb.append(((this.instCity == null)?"<null>":this.instCity));
        sb.append(',');
        sb.append("criteriaTranCoCity");
        sb.append('=');
        sb.append(((this.criteriaTranCoCity == null)?"<null>":this.criteriaTranCoCity));
        sb.append(',');
        sb.append("criteriaTranCtrlCode");
        sb.append('=');
        sb.append(((this.criteriaTranCtrlCode == null)?"<null>":this.criteriaTranCtrlCode));
        sb.append(',');
        sb.append("criteriaTranName1");
        sb.append('=');
        sb.append(((this.criteriaTranName1 == null)?"<null>":this.criteriaTranName1));
        sb.append(',');
        sb.append("criteriaInstOfficeCode");
        sb.append('=');
        sb.append(((this.criteriaInstOfficeCode == null)?"<null>":this.criteriaInstOfficeCode));
        sb.append(',');
        sb.append("instTin");
        sb.append('=');
        sb.append(((this.instTin == null)?"<null>":this.instTin));
        sb.append(',');
        sb.append("criteriaTranName2");
        sb.append('=');
        sb.append(((this.criteriaTranName2 == null)?"<null>":this.criteriaTranName2));
        sb.append(',');
        sb.append("criteriaInstZipCode");
        sb.append('=');
        sb.append(((this.criteriaInstZipCode == null)?"<null>":this.criteriaInstZipCode));
        sb.append(',');
        sb.append("tranContPhNo");
        sb.append('=');
        sb.append(((this.tranContPhNo == null)?"<null>":this.tranContPhNo));
        sb.append(',');
        sb.append("criteriaInstCity");
        sb.append('=');
        sb.append(((this.criteriaInstCity == null)?"<null>":this.criteriaInstCity));
        sb.append(',');
        sb.append("tranCoName1");
        sb.append('=');
        sb.append(((this.tranCoName1 == null)?"<null>":this.tranCoName1));
        sb.append(',');
        sb.append("criteriaTranContPhArea");
        sb.append('=');
        sb.append(((this.criteriaTranContPhArea == null)?"<null>":this.criteriaTranContPhArea));
        sb.append(',');
        sb.append("criteriaInstNatnDesc");
        sb.append('=');
        sb.append(((this.criteriaInstNatnDesc == null)?"<null>":this.criteriaInstNatnDesc));
        sb.append(',');
        sb.append("criteriaInstTin");
        sb.append('=');
        sb.append(((this.criteriaInstTin == null)?"<null>":this.criteriaInstTin));
        sb.append(',');
        sb.append("tranCoAddress");
        sb.append('=');
        sb.append(((this.tranCoAddress == null)?"<null>":this.tranCoAddress));
        sb.append(',');
        sb.append("instStCode");
        sb.append('=');
        sb.append(((this.instStCode == null)?"<null>":this.instStCode));
        sb.append(',');
        sb.append("criteriaTranCoName2");
        sb.append('=');
        sb.append(((this.criteriaTranCoName2 == null)?"<null>":this.criteriaTranCoName2));
        sb.append(',');
        sb.append("criteriaTranContPhNo");
        sb.append('=');
        sb.append(((this.criteriaTranContPhNo == null)?"<null>":this.criteriaTranContPhNo));
        sb.append(',');
        sb.append("criteriaTranCoName1");
        sb.append('=');
        sb.append(((this.criteriaTranCoName1 == null)?"<null>":this.criteriaTranCoName1));
        sb.append(',');
        sb.append("tranCoName2");
        sb.append('=');
        sb.append(((this.tranCoName2 == null)?"<null>":this.tranCoName2));
        sb.append(',');
        sb.append("criteriaTranCoZipCode");
        sb.append('=');
        sb.append(((this.criteriaTranCoZipCode == null)?"<null>":this.criteriaTranCoZipCode));
        sb.append(',');
        sb.append("instNatnCode");
        sb.append('=');
        sb.append(((this.instNatnCode == null)?"<null>":this.instNatnCode));
        sb.append(',');
        sb.append("instAddress1");
        sb.append('=');
        sb.append(((this.instAddress1 == null)?"<null>":this.instAddress1));
        sb.append(',');
        sb.append("criteriaInstStCode");
        sb.append('=');
        sb.append(((this.criteriaInstStCode == null)?"<null>":this.criteriaInstStCode));
        sb.append(',');
        sb.append("instAddress2");
        sb.append('=');
        sb.append(((this.instAddress2 == null)?"<null>":this.instAddress2));
        sb.append(',');
        sb.append("tranCoNatnDesc");
        sb.append('=');
        sb.append(((this.tranCoNatnDesc == null)?"<null>":this.tranCoNatnDesc));
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
        result = ((result* 31)+((this.instZipCode == null)? 0 :this.instZipCode.hashCode()));
        result = ((result* 31)+((this.criteriaInstCity == null)? 0 :this.criteriaInstCity.hashCode()));
        result = ((result* 31)+((this.tranContEmail == null)? 0 :this.tranContEmail.hashCode()));
        result = ((result* 31)+((this.criteriaInstTin == null)? 0 :this.criteriaInstTin.hashCode()));
        result = ((result* 31)+((this.tranTin == null)? 0 :this.tranTin.hashCode()));
        result = ((result* 31)+((this.criteriaInstNatnDesc == null)? 0 :this.criteriaInstNatnDesc.hashCode()));
        result = ((result* 31)+((this.tranCoZipCode == null)? 0 :this.tranCoZipCode.hashCode()));
        result = ((result* 31)+((this.tranCoCity == null)? 0 :this.tranCoCity.hashCode()));
        result = ((result* 31)+((this.criteriaTranForeignInd == null)? 0 :this.criteriaTranForeignInd.hashCode()));
        result = ((result* 31)+((this.instNatnDesc == null)? 0 :this.instNatnDesc.hashCode()));
        result = ((result* 31)+((this.criteriaTranCtrlCode == null)? 0 :this.criteriaTranCtrlCode.hashCode()));
        result = ((result* 31)+((this.criteriaInstContPhNo == null)? 0 :this.criteriaInstContPhNo.hashCode()));
        result = ((result* 31)+((this.tranForeignInd == null)? 0 :this.tranForeignInd.hashCode()));
        result = ((result* 31)+((this.criteriaTranCoStCode == null)? 0 :this.criteriaTranCoStCode.hashCode()));
        result = ((result* 31)+((this.tranName1 == null)? 0 :this.tranName1 .hashCode()));
        result = ((result* 31)+((this.tranCtrlCode == null)? 0 :this.tranCtrlCode.hashCode()));
        result = ((result* 31)+((this.tranName2 == null)? 0 :this.tranName2 .hashCode()));
        result = ((result* 31)+((this.criteriaInstOfficeCode == null)? 0 :this.criteriaInstOfficeCode.hashCode()));
        result = ((result* 31)+((this.instContPhNo == null)? 0 :this.instContPhNo.hashCode()));
        result = ((result* 31)+((this.criteriaInstStCode == null)? 0 :this.criteriaInstStCode.hashCode()));
        result = ((result* 31)+((this.tranContName == null)? 0 :this.tranContName.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.tranCoStCode == null)? 0 :this.tranCoStCode.hashCode()));
        result = ((result* 31)+((this.criteriaTranCoAddress == null)? 0 :this.criteriaTranCoAddress.hashCode()));
        result = ((result* 31)+((this.tranContPhExt == null)? 0 :this.tranContPhExt.hashCode()));
        result = ((result* 31)+((this.tranContPhArea == null)? 0 :this.tranContPhArea.hashCode()));
        result = ((result* 31)+((this.criteriaTranTin == null)? 0 :this.criteriaTranTin.hashCode()));
        result = ((result* 31)+((this.instContPhExt == null)? 0 :this.instContPhExt.hashCode()));
        result = ((result* 31)+((this.instOfficeCode == null)? 0 :this.instOfficeCode.hashCode()));
        result = ((result* 31)+((this.instName1 == null)? 0 :this.instName1 .hashCode()));
        result = ((result* 31)+((this.criteriaTranName1 == null)? 0 :this.criteriaTranName1 .hashCode()));
        result = ((result* 31)+((this.instForeignInd == null)? 0 :this.instForeignInd.hashCode()));
        result = ((result* 31)+((this.instName2 == null)? 0 :this.instName2 .hashCode()));
        result = ((result* 31)+((this.criteriaTranName2 == null)? 0 :this.criteriaTranName2 .hashCode()));
        result = ((result* 31)+((this.criteriaTranCoNatnDesc == null)? 0 :this.criteriaTranCoNatnDesc.hashCode()));
        result = ((result* 31)+((this.criteriaTranCoCity == null)? 0 :this.criteriaTranCoCity.hashCode()));
        result = ((result* 31)+((this.instContPhArea == null)? 0 :this.instContPhArea.hashCode()));
        result = ((result* 31)+((this.instNameCtrl == null)? 0 :this.instNameCtrl.hashCode()));
        result = ((result* 31)+((this.criteriaInstNatnCode == null)? 0 :this.criteriaInstNatnCode.hashCode()));
        result = ((result* 31)+((this.criteriaTranContName == null)? 0 :this.criteriaTranContName.hashCode()));
        result = ((result* 31)+((this.tranCoNatnCode == null)? 0 :this.tranCoNatnCode.hashCode()));
        result = ((result* 31)+((this.instCity == null)? 0 :this.instCity.hashCode()));
        result = ((result* 31)+((this.criteriaInstContPhExt == null)? 0 :this.criteriaInstContPhExt.hashCode()));
        result = ((result* 31)+((this.criteriaInstZipCode == null)? 0 :this.criteriaInstZipCode.hashCode()));
        result = ((result* 31)+((this.criteriaTranContPhArea == null)? 0 :this.criteriaTranContPhArea.hashCode()));
        result = ((result* 31)+((this.instTin == null)? 0 :this.instTin.hashCode()));
        result = ((result* 31)+((this.criteriaTranCoName2 == null)? 0 :this.criteriaTranCoName2 .hashCode()));
        result = ((result* 31)+((this.criteriaTranCoZipCode == null)? 0 :this.criteriaTranCoZipCode.hashCode()));
        result = ((result* 31)+((this.criteriaTranCoName1 == null)? 0 :this.criteriaTranCoName1 .hashCode()));
        result = ((result* 31)+((this.criteriaTranContPhExt == null)? 0 :this.criteriaTranContPhExt.hashCode()));
        result = ((result* 31)+((this.criteriaInstAddress1 == null)? 0 :this.criteriaInstAddress1 .hashCode()));
        result = ((result* 31)+((this.tranContPhNo == null)? 0 :this.tranContPhNo.hashCode()));
        result = ((result* 31)+((this.criteriaInstForeignInd == null)? 0 :this.criteriaInstForeignInd.hashCode()));
        result = ((result* 31)+((this.criteriaInstAddress2 == null)? 0 :this.criteriaInstAddress2 .hashCode()));
        result = ((result* 31)+((this.tranCoName1 == null)? 0 :this.tranCoName1 .hashCode()));
        result = ((result* 31)+((this.criteriaInstName2 == null)? 0 :this.criteriaInstName2 .hashCode()));
        result = ((result* 31)+((this.criteriaInstNameCtrl == null)? 0 :this.criteriaInstNameCtrl.hashCode()));
        result = ((result* 31)+((this.criteriaInstName1 == null)? 0 :this.criteriaInstName1 .hashCode()));
        result = ((result* 31)+((this.criteriaTranContEmail == null)? 0 :this.criteriaTranContEmail.hashCode()));
        result = ((result* 31)+((this.tranCoAddress == null)? 0 :this.tranCoAddress.hashCode()));
        result = ((result* 31)+((this.instStCode == null)? 0 :this.instStCode.hashCode()));
        result = ((result* 31)+((this.criteriaTranCoNatnCode == null)? 0 :this.criteriaTranCoNatnCode.hashCode()));
        result = ((result* 31)+((this.criteriaTranContPhNo == null)? 0 :this.criteriaTranContPhNo.hashCode()));
        result = ((result* 31)+((this.tranCoName2 == null)? 0 :this.tranCoName2 .hashCode()));
        result = ((result* 31)+((this.instNatnCode == null)? 0 :this.instNatnCode.hashCode()));
        result = ((result* 31)+((this.instAddress1 == null)? 0 :this.instAddress1 .hashCode()));
        result = ((result* 31)+((this.instAddress2 == null)? 0 :this.instAddress2 .hashCode()));
        result = ((result* 31)+((this.criteriaInstContPhArea == null)? 0 :this.criteriaInstContPhArea.hashCode()));
        result = ((result* 31)+((this.tranCoNatnDesc == null)? 0 :this.tranCoNatnDesc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof _1098TTaxInformations100PutRequest) == false) {
            return false;
        }
        _1098TTaxInformations100PutRequest rhs = ((_1098TTaxInformations100PutRequest) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.instZipCode == rhs.instZipCode)||((this.instZipCode!= null)&&this.instZipCode.equals(rhs.instZipCode)))&&((this.criteriaInstCity == rhs.criteriaInstCity)||((this.criteriaInstCity!= null)&&this.criteriaInstCity.equals(rhs.criteriaInstCity))))&&((this.tranContEmail == rhs.tranContEmail)||((this.tranContEmail!= null)&&this.tranContEmail.equals(rhs.tranContEmail))))&&((this.criteriaInstTin == rhs.criteriaInstTin)||((this.criteriaInstTin!= null)&&this.criteriaInstTin.equals(rhs.criteriaInstTin))))&&((this.tranTin == rhs.tranTin)||((this.tranTin!= null)&&this.tranTin.equals(rhs.tranTin))))&&((this.criteriaInstNatnDesc == rhs.criteriaInstNatnDesc)||((this.criteriaInstNatnDesc!= null)&&this.criteriaInstNatnDesc.equals(rhs.criteriaInstNatnDesc))))&&((this.tranCoZipCode == rhs.tranCoZipCode)||((this.tranCoZipCode!= null)&&this.tranCoZipCode.equals(rhs.tranCoZipCode))))&&((this.tranCoCity == rhs.tranCoCity)||((this.tranCoCity!= null)&&this.tranCoCity.equals(rhs.tranCoCity))))&&((this.criteriaTranForeignInd == rhs.criteriaTranForeignInd)||((this.criteriaTranForeignInd!= null)&&this.criteriaTranForeignInd.equals(rhs.criteriaTranForeignInd))))&&((this.instNatnDesc == rhs.instNatnDesc)||((this.instNatnDesc!= null)&&this.instNatnDesc.equals(rhs.instNatnDesc))))&&((this.criteriaTranCtrlCode == rhs.criteriaTranCtrlCode)||((this.criteriaTranCtrlCode!= null)&&this.criteriaTranCtrlCode.equals(rhs.criteriaTranCtrlCode))))&&((this.criteriaInstContPhNo == rhs.criteriaInstContPhNo)||((this.criteriaInstContPhNo!= null)&&this.criteriaInstContPhNo.equals(rhs.criteriaInstContPhNo))))&&((this.tranForeignInd == rhs.tranForeignInd)||((this.tranForeignInd!= null)&&this.tranForeignInd.equals(rhs.tranForeignInd))))&&((this.criteriaTranCoStCode == rhs.criteriaTranCoStCode)||((this.criteriaTranCoStCode!= null)&&this.criteriaTranCoStCode.equals(rhs.criteriaTranCoStCode))))&&((this.tranName1 == rhs.tranName1)||((this.tranName1 != null)&&this.tranName1 .equals(rhs.tranName1))))&&((this.tranCtrlCode == rhs.tranCtrlCode)||((this.tranCtrlCode!= null)&&this.tranCtrlCode.equals(rhs.tranCtrlCode))))&&((this.tranName2 == rhs.tranName2)||((this.tranName2 != null)&&this.tranName2 .equals(rhs.tranName2))))&&((this.criteriaInstOfficeCode == rhs.criteriaInstOfficeCode)||((this.criteriaInstOfficeCode!= null)&&this.criteriaInstOfficeCode.equals(rhs.criteriaInstOfficeCode))))&&((this.instContPhNo == rhs.instContPhNo)||((this.instContPhNo!= null)&&this.instContPhNo.equals(rhs.instContPhNo))))&&((this.criteriaInstStCode == rhs.criteriaInstStCode)||((this.criteriaInstStCode!= null)&&this.criteriaInstStCode.equals(rhs.criteriaInstStCode))))&&((this.tranContName == rhs.tranContName)||((this.tranContName!= null)&&this.tranContName.equals(rhs.tranContName))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.tranCoStCode == rhs.tranCoStCode)||((this.tranCoStCode!= null)&&this.tranCoStCode.equals(rhs.tranCoStCode))))&&((this.criteriaTranCoAddress == rhs.criteriaTranCoAddress)||((this.criteriaTranCoAddress!= null)&&this.criteriaTranCoAddress.equals(rhs.criteriaTranCoAddress))))&&((this.tranContPhExt == rhs.tranContPhExt)||((this.tranContPhExt!= null)&&this.tranContPhExt.equals(rhs.tranContPhExt))))&&((this.tranContPhArea == rhs.tranContPhArea)||((this.tranContPhArea!= null)&&this.tranContPhArea.equals(rhs.tranContPhArea))))&&((this.criteriaTranTin == rhs.criteriaTranTin)||((this.criteriaTranTin!= null)&&this.criteriaTranTin.equals(rhs.criteriaTranTin))))&&((this.instContPhExt == rhs.instContPhExt)||((this.instContPhExt!= null)&&this.instContPhExt.equals(rhs.instContPhExt))))&&((this.instOfficeCode == rhs.instOfficeCode)||((this.instOfficeCode!= null)&&this.instOfficeCode.equals(rhs.instOfficeCode))))&&((this.instName1 == rhs.instName1)||((this.instName1 != null)&&this.instName1 .equals(rhs.instName1))))&&((this.criteriaTranName1 == rhs.criteriaTranName1)||((this.criteriaTranName1 != null)&&this.criteriaTranName1 .equals(rhs.criteriaTranName1))))&&((this.instForeignInd == rhs.instForeignInd)||((this.instForeignInd!= null)&&this.instForeignInd.equals(rhs.instForeignInd))))&&((this.instName2 == rhs.instName2)||((this.instName2 != null)&&this.instName2 .equals(rhs.instName2))))&&((this.criteriaTranName2 == rhs.criteriaTranName2)||((this.criteriaTranName2 != null)&&this.criteriaTranName2 .equals(rhs.criteriaTranName2))))&&((this.criteriaTranCoNatnDesc == rhs.criteriaTranCoNatnDesc)||((this.criteriaTranCoNatnDesc!= null)&&this.criteriaTranCoNatnDesc.equals(rhs.criteriaTranCoNatnDesc))))&&((this.criteriaTranCoCity == rhs.criteriaTranCoCity)||((this.criteriaTranCoCity!= null)&&this.criteriaTranCoCity.equals(rhs.criteriaTranCoCity))))&&((this.instContPhArea == rhs.instContPhArea)||((this.instContPhArea!= null)&&this.instContPhArea.equals(rhs.instContPhArea))))&&((this.instNameCtrl == rhs.instNameCtrl)||((this.instNameCtrl!= null)&&this.instNameCtrl.equals(rhs.instNameCtrl))))&&((this.criteriaInstNatnCode == rhs.criteriaInstNatnCode)||((this.criteriaInstNatnCode!= null)&&this.criteriaInstNatnCode.equals(rhs.criteriaInstNatnCode))))&&((this.criteriaTranContName == rhs.criteriaTranContName)||((this.criteriaTranContName!= null)&&this.criteriaTranContName.equals(rhs.criteriaTranContName))))&&((this.tranCoNatnCode == rhs.tranCoNatnCode)||((this.tranCoNatnCode!= null)&&this.tranCoNatnCode.equals(rhs.tranCoNatnCode))))&&((this.instCity == rhs.instCity)||((this.instCity!= null)&&this.instCity.equals(rhs.instCity))))&&((this.criteriaInstContPhExt == rhs.criteriaInstContPhExt)||((this.criteriaInstContPhExt!= null)&&this.criteriaInstContPhExt.equals(rhs.criteriaInstContPhExt))))&&((this.criteriaInstZipCode == rhs.criteriaInstZipCode)||((this.criteriaInstZipCode!= null)&&this.criteriaInstZipCode.equals(rhs.criteriaInstZipCode))))&&((this.criteriaTranContPhArea == rhs.criteriaTranContPhArea)||((this.criteriaTranContPhArea!= null)&&this.criteriaTranContPhArea.equals(rhs.criteriaTranContPhArea))))&&((this.instTin == rhs.instTin)||((this.instTin!= null)&&this.instTin.equals(rhs.instTin))))&&((this.criteriaTranCoName2 == rhs.criteriaTranCoName2)||((this.criteriaTranCoName2 != null)&&this.criteriaTranCoName2 .equals(rhs.criteriaTranCoName2))))&&((this.criteriaTranCoZipCode == rhs.criteriaTranCoZipCode)||((this.criteriaTranCoZipCode!= null)&&this.criteriaTranCoZipCode.equals(rhs.criteriaTranCoZipCode))))&&((this.criteriaTranCoName1 == rhs.criteriaTranCoName1)||((this.criteriaTranCoName1 != null)&&this.criteriaTranCoName1 .equals(rhs.criteriaTranCoName1))))&&((this.criteriaTranContPhExt == rhs.criteriaTranContPhExt)||((this.criteriaTranContPhExt!= null)&&this.criteriaTranContPhExt.equals(rhs.criteriaTranContPhExt))))&&((this.criteriaInstAddress1 == rhs.criteriaInstAddress1)||((this.criteriaInstAddress1 != null)&&this.criteriaInstAddress1 .equals(rhs.criteriaInstAddress1))))&&((this.tranContPhNo == rhs.tranContPhNo)||((this.tranContPhNo!= null)&&this.tranContPhNo.equals(rhs.tranContPhNo))))&&((this.criteriaInstForeignInd == rhs.criteriaInstForeignInd)||((this.criteriaInstForeignInd!= null)&&this.criteriaInstForeignInd.equals(rhs.criteriaInstForeignInd))))&&((this.criteriaInstAddress2 == rhs.criteriaInstAddress2)||((this.criteriaInstAddress2 != null)&&this.criteriaInstAddress2 .equals(rhs.criteriaInstAddress2))))&&((this.tranCoName1 == rhs.tranCoName1)||((this.tranCoName1 != null)&&this.tranCoName1 .equals(rhs.tranCoName1))))&&((this.criteriaInstName2 == rhs.criteriaInstName2)||((this.criteriaInstName2 != null)&&this.criteriaInstName2 .equals(rhs.criteriaInstName2))))&&((this.criteriaInstNameCtrl == rhs.criteriaInstNameCtrl)||((this.criteriaInstNameCtrl!= null)&&this.criteriaInstNameCtrl.equals(rhs.criteriaInstNameCtrl))))&&((this.criteriaInstName1 == rhs.criteriaInstName1)||((this.criteriaInstName1 != null)&&this.criteriaInstName1 .equals(rhs.criteriaInstName1))))&&((this.criteriaTranContEmail == rhs.criteriaTranContEmail)||((this.criteriaTranContEmail!= null)&&this.criteriaTranContEmail.equals(rhs.criteriaTranContEmail))))&&((this.tranCoAddress == rhs.tranCoAddress)||((this.tranCoAddress!= null)&&this.tranCoAddress.equals(rhs.tranCoAddress))))&&((this.instStCode == rhs.instStCode)||((this.instStCode!= null)&&this.instStCode.equals(rhs.instStCode))))&&((this.criteriaTranCoNatnCode == rhs.criteriaTranCoNatnCode)||((this.criteriaTranCoNatnCode!= null)&&this.criteriaTranCoNatnCode.equals(rhs.criteriaTranCoNatnCode))))&&((this.criteriaTranContPhNo == rhs.criteriaTranContPhNo)||((this.criteriaTranContPhNo!= null)&&this.criteriaTranContPhNo.equals(rhs.criteriaTranContPhNo))))&&((this.tranCoName2 == rhs.tranCoName2)||((this.tranCoName2 != null)&&this.tranCoName2 .equals(rhs.tranCoName2))))&&((this.instNatnCode == rhs.instNatnCode)||((this.instNatnCode!= null)&&this.instNatnCode.equals(rhs.instNatnCode))))&&((this.instAddress1 == rhs.instAddress1)||((this.instAddress1 != null)&&this.instAddress1 .equals(rhs.instAddress1))))&&((this.instAddress2 == rhs.instAddress2)||((this.instAddress2 != null)&&this.instAddress2 .equals(rhs.instAddress2))))&&((this.criteriaInstContPhArea == rhs.criteriaInstContPhArea)||((this.criteriaInstContPhArea!= null)&&this.criteriaInstContPhArea.equals(rhs.criteriaInstContPhArea))))&&((this.tranCoNatnDesc == rhs.tranCoNatnDesc)||((this.tranCoNatnDesc!= null)&&this.tranCoNatnDesc.equals(rhs.tranCoNatnDesc))));
    }

}
