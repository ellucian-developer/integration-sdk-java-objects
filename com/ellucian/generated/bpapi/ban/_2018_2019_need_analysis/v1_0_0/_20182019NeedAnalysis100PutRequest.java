
package com.ellucian.generated.bpapi.ban._2018_2019_need_analysis.v1_0_0;

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
    "lastName",
    "citzInd",
    "city",
    "keyblckInfcCode",
    "degreeByJuly",
    "title",
    "phoneNo",
    "ssn",
    "displaySResDateMo",
    "keyblckStudentId",
    "mi",
    "addr",
    "displaySResDateYr",
    "rcrapp3SMarMthYr",
    "zip",
    "rcrapp4EmailAddress",
    "statCode",
    "alienRegNo",
    "rcrapp4DrugOffenseConvic",
    "statCodeRes",
    "keyblckSeqNo",
    "birthDate",
    "statCodeLic",
    "keyblckPellInd",
    "firstName",
    "mrtlStatus",
    "rcrapp4LegalResInd",
    "phoneArea",
    "driverLicNo"
})
@Generated("jsonschema2pojo")
public class _20182019NeedAnalysis100PutRequest {

    /**
     * Last Name
     * <p>
     * Lineage reference object : RCRAPP1_LAST_NAME
     * (Required)
     * 
     */
    @JsonProperty("lastName")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_LAST_NAME")
    private String lastName;
    /**
     * Citizenship Status
     * <p>
     * Lineage reference object : RCRAPP1_CITZ_IND
     * 
     */
    @JsonProperty("citzInd")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_CITZ_IND")
    private String citzInd;
    /**
     * City
     * <p>
     * Lineage reference object : RCRAPP1_CITY
     * 
     */
    @JsonProperty("city")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_CITY")
    private String city;
    /**
     * Source
     * <p>
     * Lineage reference object : keyblckInfcCode, Lookup lineage reference object : rtvinfc
     * 
     */
    @JsonProperty("keyblckInfcCode")
    @JsonPropertyDescription("Lineage reference object : keyblckInfcCode, Lookup lineage reference object : rtvinfc")
    private Object keyblckInfcCode;
    /**
     * First Bachelor's Degree by 01-JUL-2005
     * <p>
     * Lineage reference object : RCRAPP1_DEGREE_BY_JULY
     * 
     */
    @JsonProperty("degreeByJuly")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_DEGREE_BY_JULY")
    private String degreeByJuly;
    /**
     * Male or Female
     * <p>
     * Lineage reference object : RCRAPP1_TITLE
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_TITLE")
    private String title;
    /**
     * Lineage reference object : RCRAPP1_PHONE_NO
     * 
     */
    @JsonProperty("phoneNo")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_PHONE_NO")
    private String phoneNo;
    /**
     * Social Security Number
     * <p>
     * Lineage reference object : RCRAPP1_SSN
     * (Required)
     * 
     */
    @JsonProperty("ssn")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_SSN")
    private String ssn;
    /**
     * Resident Since
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySResDateMo")
    private String displaySResDateMo;
    /**
     * ID
     * <p>
     * Lineage reference object : keyblckStudentId
     * 
     */
    @JsonProperty("keyblckStudentId")
    @JsonPropertyDescription("Lineage reference object : keyblckStudentId")
    private Object keyblckStudentId;
    /**
     * Middle Initial
     * <p>
     * Lineage reference object : RCRAPP1_MI
     * 
     */
    @JsonProperty("mi")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_MI")
    private String mi;
    /**
     * Address
     * <p>
     * Lineage reference object : RCRAPP1_ADDR
     * 
     */
    @JsonProperty("addr")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_ADDR")
    private String addr;
    @JsonProperty("displaySResDateYr")
    private Double displaySResDateYr;
    /**
     * Date of Status
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3SMarMthYr")
    private String rcrapp3SMarMthYr;
    /**
     * Zip
     * <p>
     * Lineage reference object : RCRAPP1_ZIP
     * 
     */
    @JsonProperty("zip")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_ZIP")
    private String zip;
    /**
     * E-mail
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4EmailAddress")
    private String rcrapp4EmailAddress;
    /**
     * State
     * <p>
     * Lineage reference object : RCRAPP1_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCode")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_STAT_CODE, Lookup lineage reference object : stvstat")
    private String statCode;
    /**
     * Alien Registration Number
     * <p>
     * Lineage reference object : RCRAPP1_ALIEN_REG_NO
     * 
     */
    @JsonProperty("alienRegNo")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_ALIEN_REG_NO")
    private String alienRegNo;
    /**
     * Aid Eligibility Response or Drug Offense Conviction
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4DrugOffenseConvic")
    private String rcrapp4DrugOffenseConvic;
    /**
     * Legal Residence
     * <p>
     * Lineage reference object : RCRAPP1_STAT_CODE_RES, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCodeRes")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_STAT_CODE_RES, Lookup lineage reference object : stvstat")
    private String statCodeRes;
    /**
     * Sequence Number
     * <p>
     * Lineage reference object : keyblckSeqNo
     * 
     */
    @JsonProperty("keyblckSeqNo")
    @JsonPropertyDescription("Lineage reference object : keyblckSeqNo")
    private Object keyblckSeqNo;
    /**
     * Date of Birth
     * <p>
     * Lineage reference object : RCRAPP1_BIRTH_DATE
     * 
     */
    @JsonProperty("birthDate")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_BIRTH_DATE")
    private Date birthDate;
    /**
     * Driver's License State
     * <p>
     * Lineage reference object : RCRAPP1_STAT_CODE_LIC, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCodeLic")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_STAT_CODE_LIC, Lookup lineage reference object : stvstat")
    private String statCodeLic;
    /**
     * EDE Correction
     * <p>
     * Lineage reference object : keyblckPellInd
     * 
     */
    @JsonProperty("keyblckPellInd")
    @JsonPropertyDescription("Lineage reference object : keyblckPellInd")
    private Object keyblckPellInd;
    /**
     * First Name
     * <p>
     * Lineage reference object : RCRAPP1_FIRST_NAME
     * (Required)
     * 
     */
    @JsonProperty("firstName")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_FIRST_NAME")
    private String firstName;
    /**
     * Current Marital Status
     * <p>
     * Lineage reference object : RCRAPP1_MRTL_STATUS
     * 
     */
    @JsonProperty("mrtlStatus")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_MRTL_STATUS")
    private String mrtlStatus;
    /**
     * Legal Resident Before 01-JAN-2000
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4LegalResInd")
    private String rcrapp4LegalResInd;
    /**
     * Home Phone Number
     * <p>
     * Lineage reference object : RCRAPP1_PHONE_AREA
     * 
     */
    @JsonProperty("phoneArea")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_PHONE_AREA")
    private String phoneArea;
    /**
     * Driver's License Number
     * <p>
     * Lineage reference object : RCRAPP1_DRIVER_LIC_NO
     * 
     */
    @JsonProperty("driverLicNo")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_DRIVER_LIC_NO")
    private String driverLicNo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Last Name
     * <p>
     * Lineage reference object : RCRAPP1_LAST_NAME
     * (Required)
     * 
     */
    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    /**
     * Last Name
     * <p>
     * Lineage reference object : RCRAPP1_LAST_NAME
     * (Required)
     * 
     */
    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public _20182019NeedAnalysis100PutRequest withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Citizenship Status
     * <p>
     * Lineage reference object : RCRAPP1_CITZ_IND
     * 
     */
    @JsonProperty("citzInd")
    public String getCitzInd() {
        return citzInd;
    }

    /**
     * Citizenship Status
     * <p>
     * Lineage reference object : RCRAPP1_CITZ_IND
     * 
     */
    @JsonProperty("citzInd")
    public void setCitzInd(String citzInd) {
        this.citzInd = citzInd;
    }

    public _20182019NeedAnalysis100PutRequest withCitzInd(String citzInd) {
        this.citzInd = citzInd;
        return this;
    }

    /**
     * City
     * <p>
     * Lineage reference object : RCRAPP1_CITY
     * 
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * City
     * <p>
     * Lineage reference object : RCRAPP1_CITY
     * 
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public _20182019NeedAnalysis100PutRequest withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : keyblckInfcCode, Lookup lineage reference object : rtvinfc
     * 
     */
    @JsonProperty("keyblckInfcCode")
    public Object getKeyblckInfcCode() {
        return keyblckInfcCode;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : keyblckInfcCode, Lookup lineage reference object : rtvinfc
     * 
     */
    @JsonProperty("keyblckInfcCode")
    public void setKeyblckInfcCode(Object keyblckInfcCode) {
        this.keyblckInfcCode = keyblckInfcCode;
    }

    public _20182019NeedAnalysis100PutRequest withKeyblckInfcCode(Object keyblckInfcCode) {
        this.keyblckInfcCode = keyblckInfcCode;
        return this;
    }

    /**
     * First Bachelor's Degree by 01-JUL-2005
     * <p>
     * Lineage reference object : RCRAPP1_DEGREE_BY_JULY
     * 
     */
    @JsonProperty("degreeByJuly")
    public String getDegreeByJuly() {
        return degreeByJuly;
    }

    /**
     * First Bachelor's Degree by 01-JUL-2005
     * <p>
     * Lineage reference object : RCRAPP1_DEGREE_BY_JULY
     * 
     */
    @JsonProperty("degreeByJuly")
    public void setDegreeByJuly(String degreeByJuly) {
        this.degreeByJuly = degreeByJuly;
    }

    public _20182019NeedAnalysis100PutRequest withDegreeByJuly(String degreeByJuly) {
        this.degreeByJuly = degreeByJuly;
        return this;
    }

    /**
     * Male or Female
     * <p>
     * Lineage reference object : RCRAPP1_TITLE
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Male or Female
     * <p>
     * Lineage reference object : RCRAPP1_TITLE
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public _20182019NeedAnalysis100PutRequest withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Lineage reference object : RCRAPP1_PHONE_NO
     * 
     */
    @JsonProperty("phoneNo")
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * Lineage reference object : RCRAPP1_PHONE_NO
     * 
     */
    @JsonProperty("phoneNo")
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public _20182019NeedAnalysis100PutRequest withPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }

    /**
     * Social Security Number
     * <p>
     * Lineage reference object : RCRAPP1_SSN
     * (Required)
     * 
     */
    @JsonProperty("ssn")
    public String getSsn() {
        return ssn;
    }

    /**
     * Social Security Number
     * <p>
     * Lineage reference object : RCRAPP1_SSN
     * (Required)
     * 
     */
    @JsonProperty("ssn")
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public _20182019NeedAnalysis100PutRequest withSsn(String ssn) {
        this.ssn = ssn;
        return this;
    }

    /**
     * Resident Since
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySResDateMo")
    public String getDisplaySResDateMo() {
        return displaySResDateMo;
    }

    /**
     * Resident Since
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySResDateMo")
    public void setDisplaySResDateMo(String displaySResDateMo) {
        this.displaySResDateMo = displaySResDateMo;
    }

    public _20182019NeedAnalysis100PutRequest withDisplaySResDateMo(String displaySResDateMo) {
        this.displaySResDateMo = displaySResDateMo;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : keyblckStudentId
     * 
     */
    @JsonProperty("keyblckStudentId")
    public Object getKeyblckStudentId() {
        return keyblckStudentId;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : keyblckStudentId
     * 
     */
    @JsonProperty("keyblckStudentId")
    public void setKeyblckStudentId(Object keyblckStudentId) {
        this.keyblckStudentId = keyblckStudentId;
    }

    public _20182019NeedAnalysis100PutRequest withKeyblckStudentId(Object keyblckStudentId) {
        this.keyblckStudentId = keyblckStudentId;
        return this;
    }

    /**
     * Middle Initial
     * <p>
     * Lineage reference object : RCRAPP1_MI
     * 
     */
    @JsonProperty("mi")
    public String getMi() {
        return mi;
    }

    /**
     * Middle Initial
     * <p>
     * Lineage reference object : RCRAPP1_MI
     * 
     */
    @JsonProperty("mi")
    public void setMi(String mi) {
        this.mi = mi;
    }

    public _20182019NeedAnalysis100PutRequest withMi(String mi) {
        this.mi = mi;
        return this;
    }

    /**
     * Address
     * <p>
     * Lineage reference object : RCRAPP1_ADDR
     * 
     */
    @JsonProperty("addr")
    public String getAddr() {
        return addr;
    }

    /**
     * Address
     * <p>
     * Lineage reference object : RCRAPP1_ADDR
     * 
     */
    @JsonProperty("addr")
    public void setAddr(String addr) {
        this.addr = addr;
    }

    public _20182019NeedAnalysis100PutRequest withAddr(String addr) {
        this.addr = addr;
        return this;
    }

    @JsonProperty("displaySResDateYr")
    public Double getDisplaySResDateYr() {
        return displaySResDateYr;
    }

    @JsonProperty("displaySResDateYr")
    public void setDisplaySResDateYr(Double displaySResDateYr) {
        this.displaySResDateYr = displaySResDateYr;
    }

    public _20182019NeedAnalysis100PutRequest withDisplaySResDateYr(Double displaySResDateYr) {
        this.displaySResDateYr = displaySResDateYr;
        return this;
    }

    /**
     * Date of Status
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3SMarMthYr")
    public String getRcrapp3SMarMthYr() {
        return rcrapp3SMarMthYr;
    }

    /**
     * Date of Status
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3SMarMthYr")
    public void setRcrapp3SMarMthYr(String rcrapp3SMarMthYr) {
        this.rcrapp3SMarMthYr = rcrapp3SMarMthYr;
    }

    public _20182019NeedAnalysis100PutRequest withRcrapp3SMarMthYr(String rcrapp3SMarMthYr) {
        this.rcrapp3SMarMthYr = rcrapp3SMarMthYr;
        return this;
    }

    /**
     * Zip
     * <p>
     * Lineage reference object : RCRAPP1_ZIP
     * 
     */
    @JsonProperty("zip")
    public String getZip() {
        return zip;
    }

    /**
     * Zip
     * <p>
     * Lineage reference object : RCRAPP1_ZIP
     * 
     */
    @JsonProperty("zip")
    public void setZip(String zip) {
        this.zip = zip;
    }

    public _20182019NeedAnalysis100PutRequest withZip(String zip) {
        this.zip = zip;
        return this;
    }

    /**
     * E-mail
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4EmailAddress")
    public String getRcrapp4EmailAddress() {
        return rcrapp4EmailAddress;
    }

    /**
     * E-mail
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4EmailAddress")
    public void setRcrapp4EmailAddress(String rcrapp4EmailAddress) {
        this.rcrapp4EmailAddress = rcrapp4EmailAddress;
    }

    public _20182019NeedAnalysis100PutRequest withRcrapp4EmailAddress(String rcrapp4EmailAddress) {
        this.rcrapp4EmailAddress = rcrapp4EmailAddress;
        return this;
    }

    /**
     * State
     * <p>
     * Lineage reference object : RCRAPP1_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCode")
    public String getStatCode() {
        return statCode;
    }

    /**
     * State
     * <p>
     * Lineage reference object : RCRAPP1_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCode")
    public void setStatCode(String statCode) {
        this.statCode = statCode;
    }

    public _20182019NeedAnalysis100PutRequest withStatCode(String statCode) {
        this.statCode = statCode;
        return this;
    }

    /**
     * Alien Registration Number
     * <p>
     * Lineage reference object : RCRAPP1_ALIEN_REG_NO
     * 
     */
    @JsonProperty("alienRegNo")
    public String getAlienRegNo() {
        return alienRegNo;
    }

    /**
     * Alien Registration Number
     * <p>
     * Lineage reference object : RCRAPP1_ALIEN_REG_NO
     * 
     */
    @JsonProperty("alienRegNo")
    public void setAlienRegNo(String alienRegNo) {
        this.alienRegNo = alienRegNo;
    }

    public _20182019NeedAnalysis100PutRequest withAlienRegNo(String alienRegNo) {
        this.alienRegNo = alienRegNo;
        return this;
    }

    /**
     * Aid Eligibility Response or Drug Offense Conviction
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4DrugOffenseConvic")
    public String getRcrapp4DrugOffenseConvic() {
        return rcrapp4DrugOffenseConvic;
    }

    /**
     * Aid Eligibility Response or Drug Offense Conviction
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4DrugOffenseConvic")
    public void setRcrapp4DrugOffenseConvic(String rcrapp4DrugOffenseConvic) {
        this.rcrapp4DrugOffenseConvic = rcrapp4DrugOffenseConvic;
    }

    public _20182019NeedAnalysis100PutRequest withRcrapp4DrugOffenseConvic(String rcrapp4DrugOffenseConvic) {
        this.rcrapp4DrugOffenseConvic = rcrapp4DrugOffenseConvic;
        return this;
    }

    /**
     * Legal Residence
     * <p>
     * Lineage reference object : RCRAPP1_STAT_CODE_RES, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCodeRes")
    public String getStatCodeRes() {
        return statCodeRes;
    }

    /**
     * Legal Residence
     * <p>
     * Lineage reference object : RCRAPP1_STAT_CODE_RES, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCodeRes")
    public void setStatCodeRes(String statCodeRes) {
        this.statCodeRes = statCodeRes;
    }

    public _20182019NeedAnalysis100PutRequest withStatCodeRes(String statCodeRes) {
        this.statCodeRes = statCodeRes;
        return this;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : keyblckSeqNo
     * 
     */
    @JsonProperty("keyblckSeqNo")
    public Object getKeyblckSeqNo() {
        return keyblckSeqNo;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : keyblckSeqNo
     * 
     */
    @JsonProperty("keyblckSeqNo")
    public void setKeyblckSeqNo(Object keyblckSeqNo) {
        this.keyblckSeqNo = keyblckSeqNo;
    }

    public _20182019NeedAnalysis100PutRequest withKeyblckSeqNo(Object keyblckSeqNo) {
        this.keyblckSeqNo = keyblckSeqNo;
        return this;
    }

    /**
     * Date of Birth
     * <p>
     * Lineage reference object : RCRAPP1_BIRTH_DATE
     * 
     */
    @JsonProperty("birthDate")
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * Date of Birth
     * <p>
     * Lineage reference object : RCRAPP1_BIRTH_DATE
     * 
     */
    @JsonProperty("birthDate")
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public _20182019NeedAnalysis100PutRequest withBirthDate(Date birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    /**
     * Driver's License State
     * <p>
     * Lineage reference object : RCRAPP1_STAT_CODE_LIC, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCodeLic")
    public String getStatCodeLic() {
        return statCodeLic;
    }

    /**
     * Driver's License State
     * <p>
     * Lineage reference object : RCRAPP1_STAT_CODE_LIC, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCodeLic")
    public void setStatCodeLic(String statCodeLic) {
        this.statCodeLic = statCodeLic;
    }

    public _20182019NeedAnalysis100PutRequest withStatCodeLic(String statCodeLic) {
        this.statCodeLic = statCodeLic;
        return this;
    }

    /**
     * EDE Correction
     * <p>
     * Lineage reference object : keyblckPellInd
     * 
     */
    @JsonProperty("keyblckPellInd")
    public Object getKeyblckPellInd() {
        return keyblckPellInd;
    }

    /**
     * EDE Correction
     * <p>
     * Lineage reference object : keyblckPellInd
     * 
     */
    @JsonProperty("keyblckPellInd")
    public void setKeyblckPellInd(Object keyblckPellInd) {
        this.keyblckPellInd = keyblckPellInd;
    }

    public _20182019NeedAnalysis100PutRequest withKeyblckPellInd(Object keyblckPellInd) {
        this.keyblckPellInd = keyblckPellInd;
        return this;
    }

    /**
     * First Name
     * <p>
     * Lineage reference object : RCRAPP1_FIRST_NAME
     * (Required)
     * 
     */
    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    /**
     * First Name
     * <p>
     * Lineage reference object : RCRAPP1_FIRST_NAME
     * (Required)
     * 
     */
    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public _20182019NeedAnalysis100PutRequest withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Current Marital Status
     * <p>
     * Lineage reference object : RCRAPP1_MRTL_STATUS
     * 
     */
    @JsonProperty("mrtlStatus")
    public String getMrtlStatus() {
        return mrtlStatus;
    }

    /**
     * Current Marital Status
     * <p>
     * Lineage reference object : RCRAPP1_MRTL_STATUS
     * 
     */
    @JsonProperty("mrtlStatus")
    public void setMrtlStatus(String mrtlStatus) {
        this.mrtlStatus = mrtlStatus;
    }

    public _20182019NeedAnalysis100PutRequest withMrtlStatus(String mrtlStatus) {
        this.mrtlStatus = mrtlStatus;
        return this;
    }

    /**
     * Legal Resident Before 01-JAN-2000
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4LegalResInd")
    public String getRcrapp4LegalResInd() {
        return rcrapp4LegalResInd;
    }

    /**
     * Legal Resident Before 01-JAN-2000
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4LegalResInd")
    public void setRcrapp4LegalResInd(String rcrapp4LegalResInd) {
        this.rcrapp4LegalResInd = rcrapp4LegalResInd;
    }

    public _20182019NeedAnalysis100PutRequest withRcrapp4LegalResInd(String rcrapp4LegalResInd) {
        this.rcrapp4LegalResInd = rcrapp4LegalResInd;
        return this;
    }

    /**
     * Home Phone Number
     * <p>
     * Lineage reference object : RCRAPP1_PHONE_AREA
     * 
     */
    @JsonProperty("phoneArea")
    public String getPhoneArea() {
        return phoneArea;
    }

    /**
     * Home Phone Number
     * <p>
     * Lineage reference object : RCRAPP1_PHONE_AREA
     * 
     */
    @JsonProperty("phoneArea")
    public void setPhoneArea(String phoneArea) {
        this.phoneArea = phoneArea;
    }

    public _20182019NeedAnalysis100PutRequest withPhoneArea(String phoneArea) {
        this.phoneArea = phoneArea;
        return this;
    }

    /**
     * Driver's License Number
     * <p>
     * Lineage reference object : RCRAPP1_DRIVER_LIC_NO
     * 
     */
    @JsonProperty("driverLicNo")
    public String getDriverLicNo() {
        return driverLicNo;
    }

    /**
     * Driver's License Number
     * <p>
     * Lineage reference object : RCRAPP1_DRIVER_LIC_NO
     * 
     */
    @JsonProperty("driverLicNo")
    public void setDriverLicNo(String driverLicNo) {
        this.driverLicNo = driverLicNo;
    }

    public _20182019NeedAnalysis100PutRequest withDriverLicNo(String driverLicNo) {
        this.driverLicNo = driverLicNo;
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

    public _20182019NeedAnalysis100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(_20182019NeedAnalysis100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("citzInd");
        sb.append('=');
        sb.append(((this.citzInd == null)?"<null>":this.citzInd));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("keyblckInfcCode");
        sb.append('=');
        sb.append(((this.keyblckInfcCode == null)?"<null>":this.keyblckInfcCode));
        sb.append(',');
        sb.append("degreeByJuly");
        sb.append('=');
        sb.append(((this.degreeByJuly == null)?"<null>":this.degreeByJuly));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("phoneNo");
        sb.append('=');
        sb.append(((this.phoneNo == null)?"<null>":this.phoneNo));
        sb.append(',');
        sb.append("ssn");
        sb.append('=');
        sb.append(((this.ssn == null)?"<null>":this.ssn));
        sb.append(',');
        sb.append("displaySResDateMo");
        sb.append('=');
        sb.append(((this.displaySResDateMo == null)?"<null>":this.displaySResDateMo));
        sb.append(',');
        sb.append("keyblckStudentId");
        sb.append('=');
        sb.append(((this.keyblckStudentId == null)?"<null>":this.keyblckStudentId));
        sb.append(',');
        sb.append("mi");
        sb.append('=');
        sb.append(((this.mi == null)?"<null>":this.mi));
        sb.append(',');
        sb.append("addr");
        sb.append('=');
        sb.append(((this.addr == null)?"<null>":this.addr));
        sb.append(',');
        sb.append("displaySResDateYr");
        sb.append('=');
        sb.append(((this.displaySResDateYr == null)?"<null>":this.displaySResDateYr));
        sb.append(',');
        sb.append("rcrapp3SMarMthYr");
        sb.append('=');
        sb.append(((this.rcrapp3SMarMthYr == null)?"<null>":this.rcrapp3SMarMthYr));
        sb.append(',');
        sb.append("zip");
        sb.append('=');
        sb.append(((this.zip == null)?"<null>":this.zip));
        sb.append(',');
        sb.append("rcrapp4EmailAddress");
        sb.append('=');
        sb.append(((this.rcrapp4EmailAddress == null)?"<null>":this.rcrapp4EmailAddress));
        sb.append(',');
        sb.append("statCode");
        sb.append('=');
        sb.append(((this.statCode == null)?"<null>":this.statCode));
        sb.append(',');
        sb.append("alienRegNo");
        sb.append('=');
        sb.append(((this.alienRegNo == null)?"<null>":this.alienRegNo));
        sb.append(',');
        sb.append("rcrapp4DrugOffenseConvic");
        sb.append('=');
        sb.append(((this.rcrapp4DrugOffenseConvic == null)?"<null>":this.rcrapp4DrugOffenseConvic));
        sb.append(',');
        sb.append("statCodeRes");
        sb.append('=');
        sb.append(((this.statCodeRes == null)?"<null>":this.statCodeRes));
        sb.append(',');
        sb.append("keyblckSeqNo");
        sb.append('=');
        sb.append(((this.keyblckSeqNo == null)?"<null>":this.keyblckSeqNo));
        sb.append(',');
        sb.append("birthDate");
        sb.append('=');
        sb.append(((this.birthDate == null)?"<null>":this.birthDate));
        sb.append(',');
        sb.append("statCodeLic");
        sb.append('=');
        sb.append(((this.statCodeLic == null)?"<null>":this.statCodeLic));
        sb.append(',');
        sb.append("keyblckPellInd");
        sb.append('=');
        sb.append(((this.keyblckPellInd == null)?"<null>":this.keyblckPellInd));
        sb.append(',');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("mrtlStatus");
        sb.append('=');
        sb.append(((this.mrtlStatus == null)?"<null>":this.mrtlStatus));
        sb.append(',');
        sb.append("rcrapp4LegalResInd");
        sb.append('=');
        sb.append(((this.rcrapp4LegalResInd == null)?"<null>":this.rcrapp4LegalResInd));
        sb.append(',');
        sb.append("phoneArea");
        sb.append('=');
        sb.append(((this.phoneArea == null)?"<null>":this.phoneArea));
        sb.append(',');
        sb.append("driverLicNo");
        sb.append('=');
        sb.append(((this.driverLicNo == null)?"<null>":this.driverLicNo));
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
        result = ((result* 31)+((this.lastName == null)? 0 :this.lastName.hashCode()));
        result = ((result* 31)+((this.citzInd == null)? 0 :this.citzInd.hashCode()));
        result = ((result* 31)+((this.city == null)? 0 :this.city.hashCode()));
        result = ((result* 31)+((this.keyblckInfcCode == null)? 0 :this.keyblckInfcCode.hashCode()));
        result = ((result* 31)+((this.degreeByJuly == null)? 0 :this.degreeByJuly.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.phoneNo == null)? 0 :this.phoneNo.hashCode()));
        result = ((result* 31)+((this.ssn == null)? 0 :this.ssn.hashCode()));
        result = ((result* 31)+((this.displaySResDateMo == null)? 0 :this.displaySResDateMo.hashCode()));
        result = ((result* 31)+((this.keyblckStudentId == null)? 0 :this.keyblckStudentId.hashCode()));
        result = ((result* 31)+((this.mi == null)? 0 :this.mi.hashCode()));
        result = ((result* 31)+((this.addr == null)? 0 :this.addr.hashCode()));
        result = ((result* 31)+((this.displaySResDateYr == null)? 0 :this.displaySResDateYr.hashCode()));
        result = ((result* 31)+((this.rcrapp3SMarMthYr == null)? 0 :this.rcrapp3SMarMthYr.hashCode()));
        result = ((result* 31)+((this.zip == null)? 0 :this.zip.hashCode()));
        result = ((result* 31)+((this.rcrapp4EmailAddress == null)? 0 :this.rcrapp4EmailAddress.hashCode()));
        result = ((result* 31)+((this.statCode == null)? 0 :this.statCode.hashCode()));
        result = ((result* 31)+((this.alienRegNo == null)? 0 :this.alienRegNo.hashCode()));
        result = ((result* 31)+((this.rcrapp4DrugOffenseConvic == null)? 0 :this.rcrapp4DrugOffenseConvic.hashCode()));
        result = ((result* 31)+((this.statCodeRes == null)? 0 :this.statCodeRes.hashCode()));
        result = ((result* 31)+((this.keyblckSeqNo == null)? 0 :this.keyblckSeqNo.hashCode()));
        result = ((result* 31)+((this.birthDate == null)? 0 :this.birthDate.hashCode()));
        result = ((result* 31)+((this.statCodeLic == null)? 0 :this.statCodeLic.hashCode()));
        result = ((result* 31)+((this.keyblckPellInd == null)? 0 :this.keyblckPellInd.hashCode()));
        result = ((result* 31)+((this.firstName == null)? 0 :this.firstName.hashCode()));
        result = ((result* 31)+((this.mrtlStatus == null)? 0 :this.mrtlStatus.hashCode()));
        result = ((result* 31)+((this.rcrapp4LegalResInd == null)? 0 :this.rcrapp4LegalResInd.hashCode()));
        result = ((result* 31)+((this.phoneArea == null)? 0 :this.phoneArea.hashCode()));
        result = ((result* 31)+((this.driverLicNo == null)? 0 :this.driverLicNo.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof _20182019NeedAnalysis100PutRequest) == false) {
            return false;
        }
        _20182019NeedAnalysis100PutRequest rhs = ((_20182019NeedAnalysis100PutRequest) other);
        return (((((((((((((((((((((((((((((((this.lastName == rhs.lastName)||((this.lastName!= null)&&this.lastName.equals(rhs.lastName)))&&((this.citzInd == rhs.citzInd)||((this.citzInd!= null)&&this.citzInd.equals(rhs.citzInd))))&&((this.city == rhs.city)||((this.city!= null)&&this.city.equals(rhs.city))))&&((this.keyblckInfcCode == rhs.keyblckInfcCode)||((this.keyblckInfcCode!= null)&&this.keyblckInfcCode.equals(rhs.keyblckInfcCode))))&&((this.degreeByJuly == rhs.degreeByJuly)||((this.degreeByJuly!= null)&&this.degreeByJuly.equals(rhs.degreeByJuly))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.phoneNo == rhs.phoneNo)||((this.phoneNo!= null)&&this.phoneNo.equals(rhs.phoneNo))))&&((this.ssn == rhs.ssn)||((this.ssn!= null)&&this.ssn.equals(rhs.ssn))))&&((this.displaySResDateMo == rhs.displaySResDateMo)||((this.displaySResDateMo!= null)&&this.displaySResDateMo.equals(rhs.displaySResDateMo))))&&((this.keyblckStudentId == rhs.keyblckStudentId)||((this.keyblckStudentId!= null)&&this.keyblckStudentId.equals(rhs.keyblckStudentId))))&&((this.mi == rhs.mi)||((this.mi!= null)&&this.mi.equals(rhs.mi))))&&((this.addr == rhs.addr)||((this.addr!= null)&&this.addr.equals(rhs.addr))))&&((this.displaySResDateYr == rhs.displaySResDateYr)||((this.displaySResDateYr!= null)&&this.displaySResDateYr.equals(rhs.displaySResDateYr))))&&((this.rcrapp3SMarMthYr == rhs.rcrapp3SMarMthYr)||((this.rcrapp3SMarMthYr!= null)&&this.rcrapp3SMarMthYr.equals(rhs.rcrapp3SMarMthYr))))&&((this.zip == rhs.zip)||((this.zip!= null)&&this.zip.equals(rhs.zip))))&&((this.rcrapp4EmailAddress == rhs.rcrapp4EmailAddress)||((this.rcrapp4EmailAddress!= null)&&this.rcrapp4EmailAddress.equals(rhs.rcrapp4EmailAddress))))&&((this.statCode == rhs.statCode)||((this.statCode!= null)&&this.statCode.equals(rhs.statCode))))&&((this.alienRegNo == rhs.alienRegNo)||((this.alienRegNo!= null)&&this.alienRegNo.equals(rhs.alienRegNo))))&&((this.rcrapp4DrugOffenseConvic == rhs.rcrapp4DrugOffenseConvic)||((this.rcrapp4DrugOffenseConvic!= null)&&this.rcrapp4DrugOffenseConvic.equals(rhs.rcrapp4DrugOffenseConvic))))&&((this.statCodeRes == rhs.statCodeRes)||((this.statCodeRes!= null)&&this.statCodeRes.equals(rhs.statCodeRes))))&&((this.keyblckSeqNo == rhs.keyblckSeqNo)||((this.keyblckSeqNo!= null)&&this.keyblckSeqNo.equals(rhs.keyblckSeqNo))))&&((this.birthDate == rhs.birthDate)||((this.birthDate!= null)&&this.birthDate.equals(rhs.birthDate))))&&((this.statCodeLic == rhs.statCodeLic)||((this.statCodeLic!= null)&&this.statCodeLic.equals(rhs.statCodeLic))))&&((this.keyblckPellInd == rhs.keyblckPellInd)||((this.keyblckPellInd!= null)&&this.keyblckPellInd.equals(rhs.keyblckPellInd))))&&((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName))))&&((this.mrtlStatus == rhs.mrtlStatus)||((this.mrtlStatus!= null)&&this.mrtlStatus.equals(rhs.mrtlStatus))))&&((this.rcrapp4LegalResInd == rhs.rcrapp4LegalResInd)||((this.rcrapp4LegalResInd!= null)&&this.rcrapp4LegalResInd.equals(rhs.rcrapp4LegalResInd))))&&((this.phoneArea == rhs.phoneArea)||((this.phoneArea!= null)&&this.phoneArea.equals(rhs.phoneArea))))&&((this.driverLicNo == rhs.driverLicNo)||((this.driverLicNo!= null)&&this.driverLicNo.equals(rhs.driverLicNo))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
