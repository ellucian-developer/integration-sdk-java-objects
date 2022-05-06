
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
    "tranTin",
    "tranCoZipCode",
    "tranForeignInd",
    "tranCoNatnCode",
    "tranCoNatnDesc",
    "tranCtrlCode",
    "tranName1",
    "tranCoName1",
    "tranName2",
    "tranCoName2",
    "tranContName",
    "tranCoAddress",
    "tranContPhArea",
    "tranContPhNo",
    "tranContPhExt",
    "tranCoCity",
    "tranContEmail",
    "tranCoStCode",
    "instTin",
    "instStCode",
    "instForeignInd",
    "instZipCode",
    "instName1",
    "instNatnCode",
    "instNatnDesc",
    "instName2",
    "instContPhArea",
    "instContPhNo",
    "instContPhExt",
    "instAddress1",
    "instNameCtrl",
    "instAddress2",
    "instOfficeCode",
    "instCity"
})
@Generated("jsonschema2pojo")
public class _1098TTaxInformations100QapiPost {

    /**
     * Transmitter's TIN
     * <p>
     * Lineage reference object : TTB1098_TRAN_TIN
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
     * Foreign Indicator
     * <p>
     * Lineage reference object : TTB1098_TRAN_FOREIGN_IND
     * 
     */
    @JsonProperty("tranForeignInd")
    @JsonPropertyDescription("Lineage reference object : TTB1098_TRAN_FOREIGN_IND")
    private String tranForeignInd;
    /**
     * Nation
     * <p>
     * Lineage reference object : TTB1098_TRAN_CO_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("tranCoNatnCode")
    @JsonPropertyDescription("Lineage reference object : TTB1098_TRAN_CO_NATN_CODE, Lookup lineage reference object : stvnatn")
    private String tranCoNatnCode;
    @JsonProperty("tranCoNatnDesc")
    private String tranCoNatnDesc;
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
     * Transmitter Name
     * <p>
     * Lineage reference object : TTB1098_TRAN_NAME1
     * 
     */
    @JsonProperty("tranName1")
    @JsonPropertyDescription("Lineage reference object : TTB1098_TRAN_NAME1")
    private String tranName1;
    /**
     * Transmitter Company Name
     * <p>
     * Lineage reference object : TTB1098_TRAN_CO_NAME1
     * 
     */
    @JsonProperty("tranCoName1")
    @JsonPropertyDescription("Lineage reference object : TTB1098_TRAN_CO_NAME1")
    private String tranCoName1;
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
     * Transmitter Company Additional Information
     * <p>
     * Lineage reference object : TTB1098_TRAN_CO_NAME2
     * 
     */
    @JsonProperty("tranCoName2")
    @JsonPropertyDescription("Lineage reference object : TTB1098_TRAN_CO_NAME2")
    private String tranCoName2;
    /**
     * Contact Name
     * <p>
     * Lineage reference object : TTB1098_TRAN_CONT_NAME
     * 
     */
    @JsonProperty("tranContName")
    @JsonPropertyDescription("Lineage reference object : TTB1098_TRAN_CONT_NAME")
    private String tranContName;
    /**
     * Mailing Address
     * <p>
     * Lineage reference object : TTB1098_TRAN_CO_ADDRESS
     * 
     */
    @JsonProperty("tranCoAddress")
    @JsonPropertyDescription("Lineage reference object : TTB1098_TRAN_CO_ADDRESS")
    private String tranCoAddress;
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
     * Phone(Number)
     * <p>
     * Lineage reference object : TTB1098_TRAN_CONT_PH_NO
     * 
     */
    @JsonProperty("tranContPhNo")
    @JsonPropertyDescription("Lineage reference object : TTB1098_TRAN_CONT_PH_NO")
    private String tranContPhNo;
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
     * City
     * <p>
     * Lineage reference object : TTB1098_TRAN_CO_CITY
     * 
     */
    @JsonProperty("tranCoCity")
    @JsonPropertyDescription("Lineage reference object : TTB1098_TRAN_CO_CITY")
    private String tranCoCity;
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
     * State or Province
     * <p>
     * Lineage reference object : TTB1098_TRAN_CO_ST_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("tranCoStCode")
    @JsonPropertyDescription("Lineage reference object : TTB1098_TRAN_CO_ST_CODE, Lookup lineage reference object : stvstat")
    private String tranCoStCode;
    /**
     * Institution's TIN
     * <p>
     * Lineage reference object : TTB1098_INST_TIN
     * 
     */
    @JsonProperty("instTin")
    @JsonPropertyDescription("Lineage reference object : TTB1098_INST_TIN")
    private String instTin;
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
     * Foreign Indicator
     * <p>
     * Lineage reference object : TTB1098_INST_FOREIGN_IND
     * 
     */
    @JsonProperty("instForeignInd")
    @JsonPropertyDescription("Lineage reference object : TTB1098_INST_FOREIGN_IND")
    private String instForeignInd;
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
     * Institution's Name
     * <p>
     * Lineage reference object : TTB1098_INST_NAME1
     * 
     */
    @JsonProperty("instName1")
    @JsonPropertyDescription("Lineage reference object : TTB1098_INST_NAME1")
    private String instName1;
    /**
     * Nation
     * <p>
     * Lineage reference object : TTB1098_INST_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("instNatnCode")
    @JsonPropertyDescription("Lineage reference object : TTB1098_INST_NATN_CODE, Lookup lineage reference object : stvnatn")
    private String instNatnCode;
    @JsonProperty("instNatnDesc")
    private String instNatnDesc;
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
     * Contact Phone
     * <p>
     * Lineage reference object : TTB1098_INST_CONT_PH_AREA
     * 
     */
    @JsonProperty("instContPhArea")
    @JsonPropertyDescription("Lineage reference object : TTB1098_INST_CONT_PH_AREA")
    private String instContPhArea;
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
     * Extension
     * <p>
     * Lineage reference object : TTB1098_INST_CONT_PH_EXT
     * 
     */
    @JsonProperty("instContPhExt")
    @JsonPropertyDescription("Lineage reference object : TTB1098_INST_CONT_PH_EXT")
    private String instContPhExt;
    /**
     * Mailing Address
     * <p>
     * Lineage reference object : TTB1098_INST_ADDRESS1
     * 
     */
    @JsonProperty("instAddress1")
    @JsonPropertyDescription("Lineage reference object : TTB1098_INST_ADDRESS1")
    private String instAddress1;
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
     * Additional Mailing Address Information
     * <p>
     * Lineage reference object : TTB1098_INST_ADDRESS2
     * 
     */
    @JsonProperty("instAddress2")
    @JsonPropertyDescription("Lineage reference object : TTB1098_INST_ADDRESS2")
    private String instAddress2;
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
     * City
     * <p>
     * Lineage reference object : TTB1098_INST_CITY
     * 
     */
    @JsonProperty("instCity")
    @JsonPropertyDescription("Lineage reference object : TTB1098_INST_CITY")
    private String instCity;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Transmitter's TIN
     * <p>
     * Lineage reference object : TTB1098_TRAN_TIN
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
     * 
     */
    @JsonProperty("tranTin")
    public void setTranTin(String tranTin) {
        this.tranTin = tranTin;
    }

    public _1098TTaxInformations100QapiPost withTranTin(String tranTin) {
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

    public _1098TTaxInformations100QapiPost withTranCoZipCode(String tranCoZipCode) {
        this.tranCoZipCode = tranCoZipCode;
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

    public _1098TTaxInformations100QapiPost withTranForeignInd(String tranForeignInd) {
        this.tranForeignInd = tranForeignInd;
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

    public _1098TTaxInformations100QapiPost withTranCoNatnCode(String tranCoNatnCode) {
        this.tranCoNatnCode = tranCoNatnCode;
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

    public _1098TTaxInformations100QapiPost withTranCoNatnDesc(String tranCoNatnDesc) {
        this.tranCoNatnDesc = tranCoNatnDesc;
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

    public _1098TTaxInformations100QapiPost withTranCtrlCode(String tranCtrlCode) {
        this.tranCtrlCode = tranCtrlCode;
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

    public _1098TTaxInformations100QapiPost withTranName1(String tranName1) {
        this.tranName1 = tranName1;
        return this;
    }

    /**
     * Transmitter Company Name
     * <p>
     * Lineage reference object : TTB1098_TRAN_CO_NAME1
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
     * 
     */
    @JsonProperty("tranCoName1")
    public void setTranCoName1(String tranCoName1) {
        this.tranCoName1 = tranCoName1;
    }

    public _1098TTaxInformations100QapiPost withTranCoName1(String tranCoName1) {
        this.tranCoName1 = tranCoName1;
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

    public _1098TTaxInformations100QapiPost withTranName2(String tranName2) {
        this.tranName2 = tranName2;
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

    public _1098TTaxInformations100QapiPost withTranCoName2(String tranCoName2) {
        this.tranCoName2 = tranCoName2;
        return this;
    }

    /**
     * Contact Name
     * <p>
     * Lineage reference object : TTB1098_TRAN_CONT_NAME
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
     * 
     */
    @JsonProperty("tranContName")
    public void setTranContName(String tranContName) {
        this.tranContName = tranContName;
    }

    public _1098TTaxInformations100QapiPost withTranContName(String tranContName) {
        this.tranContName = tranContName;
        return this;
    }

    /**
     * Mailing Address
     * <p>
     * Lineage reference object : TTB1098_TRAN_CO_ADDRESS
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
     * 
     */
    @JsonProperty("tranCoAddress")
    public void setTranCoAddress(String tranCoAddress) {
        this.tranCoAddress = tranCoAddress;
    }

    public _1098TTaxInformations100QapiPost withTranCoAddress(String tranCoAddress) {
        this.tranCoAddress = tranCoAddress;
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

    public _1098TTaxInformations100QapiPost withTranContPhArea(String tranContPhArea) {
        this.tranContPhArea = tranContPhArea;
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

    public _1098TTaxInformations100QapiPost withTranContPhNo(String tranContPhNo) {
        this.tranContPhNo = tranContPhNo;
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

    public _1098TTaxInformations100QapiPost withTranContPhExt(String tranContPhExt) {
        this.tranContPhExt = tranContPhExt;
        return this;
    }

    /**
     * City
     * <p>
     * Lineage reference object : TTB1098_TRAN_CO_CITY
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
     * 
     */
    @JsonProperty("tranCoCity")
    public void setTranCoCity(String tranCoCity) {
        this.tranCoCity = tranCoCity;
    }

    public _1098TTaxInformations100QapiPost withTranCoCity(String tranCoCity) {
        this.tranCoCity = tranCoCity;
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

    public _1098TTaxInformations100QapiPost withTranContEmail(String tranContEmail) {
        this.tranContEmail = tranContEmail;
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

    public _1098TTaxInformations100QapiPost withTranCoStCode(String tranCoStCode) {
        this.tranCoStCode = tranCoStCode;
        return this;
    }

    /**
     * Institution's TIN
     * <p>
     * Lineage reference object : TTB1098_INST_TIN
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
     * 
     */
    @JsonProperty("instTin")
    public void setInstTin(String instTin) {
        this.instTin = instTin;
    }

    public _1098TTaxInformations100QapiPost withInstTin(String instTin) {
        this.instTin = instTin;
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

    public _1098TTaxInformations100QapiPost withInstStCode(String instStCode) {
        this.instStCode = instStCode;
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

    public _1098TTaxInformations100QapiPost withInstForeignInd(String instForeignInd) {
        this.instForeignInd = instForeignInd;
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

    public _1098TTaxInformations100QapiPost withInstZipCode(String instZipCode) {
        this.instZipCode = instZipCode;
        return this;
    }

    /**
     * Institution's Name
     * <p>
     * Lineage reference object : TTB1098_INST_NAME1
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
     * 
     */
    @JsonProperty("instName1")
    public void setInstName1(String instName1) {
        this.instName1 = instName1;
    }

    public _1098TTaxInformations100QapiPost withInstName1(String instName1) {
        this.instName1 = instName1;
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

    public _1098TTaxInformations100QapiPost withInstNatnCode(String instNatnCode) {
        this.instNatnCode = instNatnCode;
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

    public _1098TTaxInformations100QapiPost withInstNatnDesc(String instNatnDesc) {
        this.instNatnDesc = instNatnDesc;
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

    public _1098TTaxInformations100QapiPost withInstName2(String instName2) {
        this.instName2 = instName2;
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

    public _1098TTaxInformations100QapiPost withInstContPhArea(String instContPhArea) {
        this.instContPhArea = instContPhArea;
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

    public _1098TTaxInformations100QapiPost withInstContPhNo(String instContPhNo) {
        this.instContPhNo = instContPhNo;
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

    public _1098TTaxInformations100QapiPost withInstContPhExt(String instContPhExt) {
        this.instContPhExt = instContPhExt;
        return this;
    }

    /**
     * Mailing Address
     * <p>
     * Lineage reference object : TTB1098_INST_ADDRESS1
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
     * 
     */
    @JsonProperty("instAddress1")
    public void setInstAddress1(String instAddress1) {
        this.instAddress1 = instAddress1;
    }

    public _1098TTaxInformations100QapiPost withInstAddress1(String instAddress1) {
        this.instAddress1 = instAddress1;
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

    public _1098TTaxInformations100QapiPost withInstNameCtrl(String instNameCtrl) {
        this.instNameCtrl = instNameCtrl;
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

    public _1098TTaxInformations100QapiPost withInstAddress2(String instAddress2) {
        this.instAddress2 = instAddress2;
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

    public _1098TTaxInformations100QapiPost withInstOfficeCode(String instOfficeCode) {
        this.instOfficeCode = instOfficeCode;
        return this;
    }

    /**
     * City
     * <p>
     * Lineage reference object : TTB1098_INST_CITY
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
     * 
     */
    @JsonProperty("instCity")
    public void setInstCity(String instCity) {
        this.instCity = instCity;
    }

    public _1098TTaxInformations100QapiPost withInstCity(String instCity) {
        this.instCity = instCity;
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

    public _1098TTaxInformations100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(_1098TTaxInformations100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tranTin");
        sb.append('=');
        sb.append(((this.tranTin == null)?"<null>":this.tranTin));
        sb.append(',');
        sb.append("tranCoZipCode");
        sb.append('=');
        sb.append(((this.tranCoZipCode == null)?"<null>":this.tranCoZipCode));
        sb.append(',');
        sb.append("tranForeignInd");
        sb.append('=');
        sb.append(((this.tranForeignInd == null)?"<null>":this.tranForeignInd));
        sb.append(',');
        sb.append("tranCoNatnCode");
        sb.append('=');
        sb.append(((this.tranCoNatnCode == null)?"<null>":this.tranCoNatnCode));
        sb.append(',');
        sb.append("tranCoNatnDesc");
        sb.append('=');
        sb.append(((this.tranCoNatnDesc == null)?"<null>":this.tranCoNatnDesc));
        sb.append(',');
        sb.append("tranCtrlCode");
        sb.append('=');
        sb.append(((this.tranCtrlCode == null)?"<null>":this.tranCtrlCode));
        sb.append(',');
        sb.append("tranName1");
        sb.append('=');
        sb.append(((this.tranName1 == null)?"<null>":this.tranName1));
        sb.append(',');
        sb.append("tranCoName1");
        sb.append('=');
        sb.append(((this.tranCoName1 == null)?"<null>":this.tranCoName1));
        sb.append(',');
        sb.append("tranName2");
        sb.append('=');
        sb.append(((this.tranName2 == null)?"<null>":this.tranName2));
        sb.append(',');
        sb.append("tranCoName2");
        sb.append('=');
        sb.append(((this.tranCoName2 == null)?"<null>":this.tranCoName2));
        sb.append(',');
        sb.append("tranContName");
        sb.append('=');
        sb.append(((this.tranContName == null)?"<null>":this.tranContName));
        sb.append(',');
        sb.append("tranCoAddress");
        sb.append('=');
        sb.append(((this.tranCoAddress == null)?"<null>":this.tranCoAddress));
        sb.append(',');
        sb.append("tranContPhArea");
        sb.append('=');
        sb.append(((this.tranContPhArea == null)?"<null>":this.tranContPhArea));
        sb.append(',');
        sb.append("tranContPhNo");
        sb.append('=');
        sb.append(((this.tranContPhNo == null)?"<null>":this.tranContPhNo));
        sb.append(',');
        sb.append("tranContPhExt");
        sb.append('=');
        sb.append(((this.tranContPhExt == null)?"<null>":this.tranContPhExt));
        sb.append(',');
        sb.append("tranCoCity");
        sb.append('=');
        sb.append(((this.tranCoCity == null)?"<null>":this.tranCoCity));
        sb.append(',');
        sb.append("tranContEmail");
        sb.append('=');
        sb.append(((this.tranContEmail == null)?"<null>":this.tranContEmail));
        sb.append(',');
        sb.append("tranCoStCode");
        sb.append('=');
        sb.append(((this.tranCoStCode == null)?"<null>":this.tranCoStCode));
        sb.append(',');
        sb.append("instTin");
        sb.append('=');
        sb.append(((this.instTin == null)?"<null>":this.instTin));
        sb.append(',');
        sb.append("instStCode");
        sb.append('=');
        sb.append(((this.instStCode == null)?"<null>":this.instStCode));
        sb.append(',');
        sb.append("instForeignInd");
        sb.append('=');
        sb.append(((this.instForeignInd == null)?"<null>":this.instForeignInd));
        sb.append(',');
        sb.append("instZipCode");
        sb.append('=');
        sb.append(((this.instZipCode == null)?"<null>":this.instZipCode));
        sb.append(',');
        sb.append("instName1");
        sb.append('=');
        sb.append(((this.instName1 == null)?"<null>":this.instName1));
        sb.append(',');
        sb.append("instNatnCode");
        sb.append('=');
        sb.append(((this.instNatnCode == null)?"<null>":this.instNatnCode));
        sb.append(',');
        sb.append("instNatnDesc");
        sb.append('=');
        sb.append(((this.instNatnDesc == null)?"<null>":this.instNatnDesc));
        sb.append(',');
        sb.append("instName2");
        sb.append('=');
        sb.append(((this.instName2 == null)?"<null>":this.instName2));
        sb.append(',');
        sb.append("instContPhArea");
        sb.append('=');
        sb.append(((this.instContPhArea == null)?"<null>":this.instContPhArea));
        sb.append(',');
        sb.append("instContPhNo");
        sb.append('=');
        sb.append(((this.instContPhNo == null)?"<null>":this.instContPhNo));
        sb.append(',');
        sb.append("instContPhExt");
        sb.append('=');
        sb.append(((this.instContPhExt == null)?"<null>":this.instContPhExt));
        sb.append(',');
        sb.append("instAddress1");
        sb.append('=');
        sb.append(((this.instAddress1 == null)?"<null>":this.instAddress1));
        sb.append(',');
        sb.append("instNameCtrl");
        sb.append('=');
        sb.append(((this.instNameCtrl == null)?"<null>":this.instNameCtrl));
        sb.append(',');
        sb.append("instAddress2");
        sb.append('=');
        sb.append(((this.instAddress2 == null)?"<null>":this.instAddress2));
        sb.append(',');
        sb.append("instOfficeCode");
        sb.append('=');
        sb.append(((this.instOfficeCode == null)?"<null>":this.instOfficeCode));
        sb.append(',');
        sb.append("instCity");
        sb.append('=');
        sb.append(((this.instCity == null)?"<null>":this.instCity));
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
        result = ((result* 31)+((this.tranContPhArea == null)? 0 :this.tranContPhArea.hashCode()));
        result = ((result* 31)+((this.instZipCode == null)? 0 :this.instZipCode.hashCode()));
        result = ((result* 31)+((this.tranContEmail == null)? 0 :this.tranContEmail.hashCode()));
        result = ((result* 31)+((this.instContPhExt == null)? 0 :this.instContPhExt.hashCode()));
        result = ((result* 31)+((this.instOfficeCode == null)? 0 :this.instOfficeCode.hashCode()));
        result = ((result* 31)+((this.instName1 == null)? 0 :this.instName1 .hashCode()));
        result = ((result* 31)+((this.tranTin == null)? 0 :this.tranTin.hashCode()));
        result = ((result* 31)+((this.instForeignInd == null)? 0 :this.instForeignInd.hashCode()));
        result = ((result* 31)+((this.instName2 == null)? 0 :this.instName2 .hashCode()));
        result = ((result* 31)+((this.tranCoZipCode == null)? 0 :this.tranCoZipCode.hashCode()));
        result = ((result* 31)+((this.tranCoCity == null)? 0 :this.tranCoCity.hashCode()));
        result = ((result* 31)+((this.instContPhArea == null)? 0 :this.instContPhArea.hashCode()));
        result = ((result* 31)+((this.instNameCtrl == null)? 0 :this.instNameCtrl.hashCode()));
        result = ((result* 31)+((this.tranCoNatnCode == null)? 0 :this.tranCoNatnCode.hashCode()));
        result = ((result* 31)+((this.instCity == null)? 0 :this.instCity.hashCode()));
        result = ((result* 31)+((this.instTin == null)? 0 :this.instTin.hashCode()));
        result = ((result* 31)+((this.instNatnDesc == null)? 0 :this.instNatnDesc.hashCode()));
        result = ((result* 31)+((this.tranForeignInd == null)? 0 :this.tranForeignInd.hashCode()));
        result = ((result* 31)+((this.tranContPhNo == null)? 0 :this.tranContPhNo.hashCode()));
        result = ((result* 31)+((this.tranCoName1 == null)? 0 :this.tranCoName1 .hashCode()));
        result = ((result* 31)+((this.tranName1 == null)? 0 :this.tranName1 .hashCode()));
        result = ((result* 31)+((this.tranCtrlCode == null)? 0 :this.tranCtrlCode.hashCode()));
        result = ((result* 31)+((this.tranName2 == null)? 0 :this.tranName2 .hashCode()));
        result = ((result* 31)+((this.instContPhNo == null)? 0 :this.instContPhNo.hashCode()));
        result = ((result* 31)+((this.tranCoAddress == null)? 0 :this.tranCoAddress.hashCode()));
        result = ((result* 31)+((this.instStCode == null)? 0 :this.instStCode.hashCode()));
        result = ((result* 31)+((this.tranCoName2 == null)? 0 :this.tranCoName2 .hashCode()));
        result = ((result* 31)+((this.tranContName == null)? 0 :this.tranContName.hashCode()));
        result = ((result* 31)+((this.instNatnCode == null)? 0 :this.instNatnCode.hashCode()));
        result = ((result* 31)+((this.instAddress1 == null)? 0 :this.instAddress1 .hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.tranCoStCode == null)? 0 :this.tranCoStCode.hashCode()));
        result = ((result* 31)+((this.instAddress2 == null)? 0 :this.instAddress2 .hashCode()));
        result = ((result* 31)+((this.tranCoNatnDesc == null)? 0 :this.tranCoNatnDesc.hashCode()));
        result = ((result* 31)+((this.tranContPhExt == null)? 0 :this.tranContPhExt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof _1098TTaxInformations100QapiPost) == false) {
            return false;
        }
        _1098TTaxInformations100QapiPost rhs = ((_1098TTaxInformations100QapiPost) other);
        return ((((((((((((((((((((((((((((((((((((this.tranContPhArea == rhs.tranContPhArea)||((this.tranContPhArea!= null)&&this.tranContPhArea.equals(rhs.tranContPhArea)))&&((this.instZipCode == rhs.instZipCode)||((this.instZipCode!= null)&&this.instZipCode.equals(rhs.instZipCode))))&&((this.tranContEmail == rhs.tranContEmail)||((this.tranContEmail!= null)&&this.tranContEmail.equals(rhs.tranContEmail))))&&((this.instContPhExt == rhs.instContPhExt)||((this.instContPhExt!= null)&&this.instContPhExt.equals(rhs.instContPhExt))))&&((this.instOfficeCode == rhs.instOfficeCode)||((this.instOfficeCode!= null)&&this.instOfficeCode.equals(rhs.instOfficeCode))))&&((this.instName1 == rhs.instName1)||((this.instName1 != null)&&this.instName1 .equals(rhs.instName1))))&&((this.tranTin == rhs.tranTin)||((this.tranTin!= null)&&this.tranTin.equals(rhs.tranTin))))&&((this.instForeignInd == rhs.instForeignInd)||((this.instForeignInd!= null)&&this.instForeignInd.equals(rhs.instForeignInd))))&&((this.instName2 == rhs.instName2)||((this.instName2 != null)&&this.instName2 .equals(rhs.instName2))))&&((this.tranCoZipCode == rhs.tranCoZipCode)||((this.tranCoZipCode!= null)&&this.tranCoZipCode.equals(rhs.tranCoZipCode))))&&((this.tranCoCity == rhs.tranCoCity)||((this.tranCoCity!= null)&&this.tranCoCity.equals(rhs.tranCoCity))))&&((this.instContPhArea == rhs.instContPhArea)||((this.instContPhArea!= null)&&this.instContPhArea.equals(rhs.instContPhArea))))&&((this.instNameCtrl == rhs.instNameCtrl)||((this.instNameCtrl!= null)&&this.instNameCtrl.equals(rhs.instNameCtrl))))&&((this.tranCoNatnCode == rhs.tranCoNatnCode)||((this.tranCoNatnCode!= null)&&this.tranCoNatnCode.equals(rhs.tranCoNatnCode))))&&((this.instCity == rhs.instCity)||((this.instCity!= null)&&this.instCity.equals(rhs.instCity))))&&((this.instTin == rhs.instTin)||((this.instTin!= null)&&this.instTin.equals(rhs.instTin))))&&((this.instNatnDesc == rhs.instNatnDesc)||((this.instNatnDesc!= null)&&this.instNatnDesc.equals(rhs.instNatnDesc))))&&((this.tranForeignInd == rhs.tranForeignInd)||((this.tranForeignInd!= null)&&this.tranForeignInd.equals(rhs.tranForeignInd))))&&((this.tranContPhNo == rhs.tranContPhNo)||((this.tranContPhNo!= null)&&this.tranContPhNo.equals(rhs.tranContPhNo))))&&((this.tranCoName1 == rhs.tranCoName1)||((this.tranCoName1 != null)&&this.tranCoName1 .equals(rhs.tranCoName1))))&&((this.tranName1 == rhs.tranName1)||((this.tranName1 != null)&&this.tranName1 .equals(rhs.tranName1))))&&((this.tranCtrlCode == rhs.tranCtrlCode)||((this.tranCtrlCode!= null)&&this.tranCtrlCode.equals(rhs.tranCtrlCode))))&&((this.tranName2 == rhs.tranName2)||((this.tranName2 != null)&&this.tranName2 .equals(rhs.tranName2))))&&((this.instContPhNo == rhs.instContPhNo)||((this.instContPhNo!= null)&&this.instContPhNo.equals(rhs.instContPhNo))))&&((this.tranCoAddress == rhs.tranCoAddress)||((this.tranCoAddress!= null)&&this.tranCoAddress.equals(rhs.tranCoAddress))))&&((this.instStCode == rhs.instStCode)||((this.instStCode!= null)&&this.instStCode.equals(rhs.instStCode))))&&((this.tranCoName2 == rhs.tranCoName2)||((this.tranCoName2 != null)&&this.tranCoName2 .equals(rhs.tranCoName2))))&&((this.tranContName == rhs.tranContName)||((this.tranContName!= null)&&this.tranContName.equals(rhs.tranContName))))&&((this.instNatnCode == rhs.instNatnCode)||((this.instNatnCode!= null)&&this.instNatnCode.equals(rhs.instNatnCode))))&&((this.instAddress1 == rhs.instAddress1)||((this.instAddress1 != null)&&this.instAddress1 .equals(rhs.instAddress1))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.tranCoStCode == rhs.tranCoStCode)||((this.tranCoStCode!= null)&&this.tranCoStCode.equals(rhs.tranCoStCode))))&&((this.instAddress2 == rhs.instAddress2)||((this.instAddress2 != null)&&this.instAddress2 .equals(rhs.instAddress2))))&&((this.tranCoNatnDesc == rhs.tranCoNatnDesc)||((this.tranCoNatnDesc!= null)&&this.tranCoNatnDesc.equals(rhs.tranCoNatnDesc))))&&((this.tranContPhExt == rhs.tranContPhExt)||((this.tranContPhExt!= null)&&this.tranContPhExt.equals(rhs.tranContPhExt))));
    }

}
