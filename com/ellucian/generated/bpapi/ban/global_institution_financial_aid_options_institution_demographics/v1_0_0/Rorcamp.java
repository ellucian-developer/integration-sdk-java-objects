
package com.ellucian.generated.bpapi.ban.global_institution_financial_aid_options_institution_demographics.v1_0_0;

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
    "mailLine3InstFaa",
    "statCodeInstFaa",
    "faaPhoneArea",
    "zipInstFaa",
    "houseNumber",
    "mailCityInstFaa",
    "displayCampDesc",
    "faaFaxCtryCode",
    "ctryCodePhone",
    "mailLine2InstFaa",
    "mailLine4InstFaa",
    "faaEmail",
    "mailLine1InstFaa",
    "instType",
    "instFinControl",
    "faaFaxArea",
    "faaAdminName",
    "faaPhoneNo",
    "campCode",
    "faaPhoneExt",
    "faaFaxNo",
    "faaFaxExt"
})
@Generated("jsonschema2pojo")
public class Rorcamp {

    /**
     * Address Line 3
     * <p>
     * Lineage reference object : RORCAMP_MAIL_LINE3_INST_FAA
     * 
     */
    @JsonProperty("mailLine3InstFaa")
    @JsonPropertyDescription("Lineage reference object : RORCAMP_MAIL_LINE3_INST_FAA")
    private String mailLine3InstFaa;
    /**
     * State or Province
     * <p>
     * Lineage reference object : RORCAMP_STAT_CODE_INST_FAA, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCodeInstFaa")
    @JsonPropertyDescription("Lineage reference object : RORCAMP_STAT_CODE_INST_FAA, Lookup lineage reference object : stvstat")
    private String statCodeInstFaa;
    /**
     * Phone Area Code
     * <p>
     * Lineage reference object : RORCAMP_FAA_PHONE_AREA
     * 
     */
    @JsonProperty("faaPhoneArea")
    @JsonPropertyDescription("Lineage reference object : RORCAMP_FAA_PHONE_AREA")
    private String faaPhoneArea;
    /**
     * Zip or Postal Code
     * <p>
     * Lineage reference object : RORCAMP_ZIP_INST_FAA
     * 
     */
    @JsonProperty("zipInstFaa")
    @JsonPropertyDescription("Lineage reference object : RORCAMP_ZIP_INST_FAA")
    private String zipInstFaa;
    /**
     * Building Number
     * <p>
     * Lineage reference object : RORCAMP_HOUSE_NUMBER
     * 
     */
    @JsonProperty("houseNumber")
    @JsonPropertyDescription("Lineage reference object : RORCAMP_HOUSE_NUMBER")
    private String houseNumber;
    /**
     * City
     * <p>
     * Lineage reference object : RORCAMP_MAIL_CITY_INST_FAA
     * 
     */
    @JsonProperty("mailCityInstFaa")
    @JsonPropertyDescription("Lineage reference object : RORCAMP_MAIL_CITY_INST_FAA")
    private String mailCityInstFaa;
    @JsonProperty("displayCampDesc")
    private String displayCampDesc;
    /**
     * Fax Country Code
     * <p>
     * Lineage reference object : RORCAMP_FAA_FAX_CTRY_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("faaFaxCtryCode")
    @JsonPropertyDescription("Lineage reference object : RORCAMP_FAA_FAX_CTRY_CODE, Lookup lineage reference object : stvstat")
    private String faaFaxCtryCode;
    /**
     * Country Code
     * <p>
     * Lineage reference object : RORCAMP_CTRY_CODE_PHONE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("ctryCodePhone")
    @JsonPropertyDescription("Lineage reference object : RORCAMP_CTRY_CODE_PHONE, Lookup lineage reference object : stvstat")
    private String ctryCodePhone;
    /**
     * Address Line 2
     * <p>
     * Lineage reference object : RORCAMP_MAIL_LINE2_INST_FAA
     * 
     */
    @JsonProperty("mailLine2InstFaa")
    @JsonPropertyDescription("Lineage reference object : RORCAMP_MAIL_LINE2_INST_FAA")
    private String mailLine2InstFaa;
    /**
     * Address Line 4
     * <p>
     * Lineage reference object : RORCAMP_MAIL_LINE4_INST_FAA
     * 
     */
    @JsonProperty("mailLine4InstFaa")
    @JsonPropertyDescription("Lineage reference object : RORCAMP_MAIL_LINE4_INST_FAA")
    private String mailLine4InstFaa;
    /**
     * E-mail
     * <p>
     * Lineage reference object : RORCAMP_FAA_EMAIL
     * 
     */
    @JsonProperty("faaEmail")
    @JsonPropertyDescription("Lineage reference object : RORCAMP_FAA_EMAIL")
    private String faaEmail;
    /**
     * Address Line 1
     * <p>
     * Lineage reference object : RORCAMP_MAIL_LINE1_INST_FAA
     * 
     */
    @JsonProperty("mailLine1InstFaa")
    @JsonPropertyDescription("Lineage reference object : RORCAMP_MAIL_LINE1_INST_FAA")
    private String mailLine1InstFaa;
    /**
     * Institution Type
     * <p>
     * Lineage reference object : RORCAMP_INST_TYPE
     * 
     */
    @JsonProperty("instType")
    @JsonPropertyDescription("Lineage reference object : RORCAMP_INST_TYPE")
    private String instType;
    /**
     * Financial Control
     * <p>
     * Lineage reference object : RORCAMP_INST_FIN_CONTROL
     * 
     */
    @JsonProperty("instFinControl")
    @JsonPropertyDescription("Lineage reference object : RORCAMP_INST_FIN_CONTROL")
    private String instFinControl;
    /**
     * Fax Area Code
     * <p>
     * Lineage reference object : RORCAMP_FAA_FAX_AREA
     * 
     */
    @JsonProperty("faaFaxArea")
    @JsonPropertyDescription("Lineage reference object : RORCAMP_FAA_FAX_AREA")
    private String faaFaxArea;
    /**
     * Aid Administrator
     * <p>
     * Lineage reference object : RORCAMP_FAA_ADMIN_NAME
     * 
     */
    @JsonProperty("faaAdminName")
    @JsonPropertyDescription("Lineage reference object : RORCAMP_FAA_ADMIN_NAME")
    private String faaAdminName;
    /**
     * Lineage reference object : RORCAMP_FAA_PHONE_NO
     * 
     */
    @JsonProperty("faaPhoneNo")
    @JsonPropertyDescription("Lineage reference object : RORCAMP_FAA_PHONE_NO")
    private String faaPhoneNo;
    /**
     * Campus Code
     * <p>
     * Lineage reference object : RORCAMP_CAMP_CODE, Lookup lineage reference object : stvcamp
     * (Required)
     * 
     */
    @JsonProperty("campCode")
    @JsonPropertyDescription("Lineage reference object : RORCAMP_CAMP_CODE, Lookup lineage reference object : stvcamp")
    private String campCode;
    /**
     * Lineage reference object : RORCAMP_FAA_PHONE_EXT
     * 
     */
    @JsonProperty("faaPhoneExt")
    @JsonPropertyDescription("Lineage reference object : RORCAMP_FAA_PHONE_EXT")
    private String faaPhoneExt;
    /**
     * Lineage reference object : RORCAMP_FAA_FAX_NO
     * 
     */
    @JsonProperty("faaFaxNo")
    @JsonPropertyDescription("Lineage reference object : RORCAMP_FAA_FAX_NO")
    private String faaFaxNo;
    /**
     * Lineage reference object : RORCAMP_FAA_FAX_EXT
     * 
     */
    @JsonProperty("faaFaxExt")
    @JsonPropertyDescription("Lineage reference object : RORCAMP_FAA_FAX_EXT")
    private String faaFaxExt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Address Line 3
     * <p>
     * Lineage reference object : RORCAMP_MAIL_LINE3_INST_FAA
     * 
     */
    @JsonProperty("mailLine3InstFaa")
    public String getMailLine3InstFaa() {
        return mailLine3InstFaa;
    }

    /**
     * Address Line 3
     * <p>
     * Lineage reference object : RORCAMP_MAIL_LINE3_INST_FAA
     * 
     */
    @JsonProperty("mailLine3InstFaa")
    public void setMailLine3InstFaa(String mailLine3InstFaa) {
        this.mailLine3InstFaa = mailLine3InstFaa;
    }

    public Rorcamp withMailLine3InstFaa(String mailLine3InstFaa) {
        this.mailLine3InstFaa = mailLine3InstFaa;
        return this;
    }

    /**
     * State or Province
     * <p>
     * Lineage reference object : RORCAMP_STAT_CODE_INST_FAA, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCodeInstFaa")
    public String getStatCodeInstFaa() {
        return statCodeInstFaa;
    }

    /**
     * State or Province
     * <p>
     * Lineage reference object : RORCAMP_STAT_CODE_INST_FAA, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCodeInstFaa")
    public void setStatCodeInstFaa(String statCodeInstFaa) {
        this.statCodeInstFaa = statCodeInstFaa;
    }

    public Rorcamp withStatCodeInstFaa(String statCodeInstFaa) {
        this.statCodeInstFaa = statCodeInstFaa;
        return this;
    }

    /**
     * Phone Area Code
     * <p>
     * Lineage reference object : RORCAMP_FAA_PHONE_AREA
     * 
     */
    @JsonProperty("faaPhoneArea")
    public String getFaaPhoneArea() {
        return faaPhoneArea;
    }

    /**
     * Phone Area Code
     * <p>
     * Lineage reference object : RORCAMP_FAA_PHONE_AREA
     * 
     */
    @JsonProperty("faaPhoneArea")
    public void setFaaPhoneArea(String faaPhoneArea) {
        this.faaPhoneArea = faaPhoneArea;
    }

    public Rorcamp withFaaPhoneArea(String faaPhoneArea) {
        this.faaPhoneArea = faaPhoneArea;
        return this;
    }

    /**
     * Zip or Postal Code
     * <p>
     * Lineage reference object : RORCAMP_ZIP_INST_FAA
     * 
     */
    @JsonProperty("zipInstFaa")
    public String getZipInstFaa() {
        return zipInstFaa;
    }

    /**
     * Zip or Postal Code
     * <p>
     * Lineage reference object : RORCAMP_ZIP_INST_FAA
     * 
     */
    @JsonProperty("zipInstFaa")
    public void setZipInstFaa(String zipInstFaa) {
        this.zipInstFaa = zipInstFaa;
    }

    public Rorcamp withZipInstFaa(String zipInstFaa) {
        this.zipInstFaa = zipInstFaa;
        return this;
    }

    /**
     * Building Number
     * <p>
     * Lineage reference object : RORCAMP_HOUSE_NUMBER
     * 
     */
    @JsonProperty("houseNumber")
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * Building Number
     * <p>
     * Lineage reference object : RORCAMP_HOUSE_NUMBER
     * 
     */
    @JsonProperty("houseNumber")
    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public Rorcamp withHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
        return this;
    }

    /**
     * City
     * <p>
     * Lineage reference object : RORCAMP_MAIL_CITY_INST_FAA
     * 
     */
    @JsonProperty("mailCityInstFaa")
    public String getMailCityInstFaa() {
        return mailCityInstFaa;
    }

    /**
     * City
     * <p>
     * Lineage reference object : RORCAMP_MAIL_CITY_INST_FAA
     * 
     */
    @JsonProperty("mailCityInstFaa")
    public void setMailCityInstFaa(String mailCityInstFaa) {
        this.mailCityInstFaa = mailCityInstFaa;
    }

    public Rorcamp withMailCityInstFaa(String mailCityInstFaa) {
        this.mailCityInstFaa = mailCityInstFaa;
        return this;
    }

    @JsonProperty("displayCampDesc")
    public String getDisplayCampDesc() {
        return displayCampDesc;
    }

    @JsonProperty("displayCampDesc")
    public void setDisplayCampDesc(String displayCampDesc) {
        this.displayCampDesc = displayCampDesc;
    }

    public Rorcamp withDisplayCampDesc(String displayCampDesc) {
        this.displayCampDesc = displayCampDesc;
        return this;
    }

    /**
     * Fax Country Code
     * <p>
     * Lineage reference object : RORCAMP_FAA_FAX_CTRY_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("faaFaxCtryCode")
    public String getFaaFaxCtryCode() {
        return faaFaxCtryCode;
    }

    /**
     * Fax Country Code
     * <p>
     * Lineage reference object : RORCAMP_FAA_FAX_CTRY_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("faaFaxCtryCode")
    public void setFaaFaxCtryCode(String faaFaxCtryCode) {
        this.faaFaxCtryCode = faaFaxCtryCode;
    }

    public Rorcamp withFaaFaxCtryCode(String faaFaxCtryCode) {
        this.faaFaxCtryCode = faaFaxCtryCode;
        return this;
    }

    /**
     * Country Code
     * <p>
     * Lineage reference object : RORCAMP_CTRY_CODE_PHONE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("ctryCodePhone")
    public String getCtryCodePhone() {
        return ctryCodePhone;
    }

    /**
     * Country Code
     * <p>
     * Lineage reference object : RORCAMP_CTRY_CODE_PHONE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("ctryCodePhone")
    public void setCtryCodePhone(String ctryCodePhone) {
        this.ctryCodePhone = ctryCodePhone;
    }

    public Rorcamp withCtryCodePhone(String ctryCodePhone) {
        this.ctryCodePhone = ctryCodePhone;
        return this;
    }

    /**
     * Address Line 2
     * <p>
     * Lineage reference object : RORCAMP_MAIL_LINE2_INST_FAA
     * 
     */
    @JsonProperty("mailLine2InstFaa")
    public String getMailLine2InstFaa() {
        return mailLine2InstFaa;
    }

    /**
     * Address Line 2
     * <p>
     * Lineage reference object : RORCAMP_MAIL_LINE2_INST_FAA
     * 
     */
    @JsonProperty("mailLine2InstFaa")
    public void setMailLine2InstFaa(String mailLine2InstFaa) {
        this.mailLine2InstFaa = mailLine2InstFaa;
    }

    public Rorcamp withMailLine2InstFaa(String mailLine2InstFaa) {
        this.mailLine2InstFaa = mailLine2InstFaa;
        return this;
    }

    /**
     * Address Line 4
     * <p>
     * Lineage reference object : RORCAMP_MAIL_LINE4_INST_FAA
     * 
     */
    @JsonProperty("mailLine4InstFaa")
    public String getMailLine4InstFaa() {
        return mailLine4InstFaa;
    }

    /**
     * Address Line 4
     * <p>
     * Lineage reference object : RORCAMP_MAIL_LINE4_INST_FAA
     * 
     */
    @JsonProperty("mailLine4InstFaa")
    public void setMailLine4InstFaa(String mailLine4InstFaa) {
        this.mailLine4InstFaa = mailLine4InstFaa;
    }

    public Rorcamp withMailLine4InstFaa(String mailLine4InstFaa) {
        this.mailLine4InstFaa = mailLine4InstFaa;
        return this;
    }

    /**
     * E-mail
     * <p>
     * Lineage reference object : RORCAMP_FAA_EMAIL
     * 
     */
    @JsonProperty("faaEmail")
    public String getFaaEmail() {
        return faaEmail;
    }

    /**
     * E-mail
     * <p>
     * Lineage reference object : RORCAMP_FAA_EMAIL
     * 
     */
    @JsonProperty("faaEmail")
    public void setFaaEmail(String faaEmail) {
        this.faaEmail = faaEmail;
    }

    public Rorcamp withFaaEmail(String faaEmail) {
        this.faaEmail = faaEmail;
        return this;
    }

    /**
     * Address Line 1
     * <p>
     * Lineage reference object : RORCAMP_MAIL_LINE1_INST_FAA
     * 
     */
    @JsonProperty("mailLine1InstFaa")
    public String getMailLine1InstFaa() {
        return mailLine1InstFaa;
    }

    /**
     * Address Line 1
     * <p>
     * Lineage reference object : RORCAMP_MAIL_LINE1_INST_FAA
     * 
     */
    @JsonProperty("mailLine1InstFaa")
    public void setMailLine1InstFaa(String mailLine1InstFaa) {
        this.mailLine1InstFaa = mailLine1InstFaa;
    }

    public Rorcamp withMailLine1InstFaa(String mailLine1InstFaa) {
        this.mailLine1InstFaa = mailLine1InstFaa;
        return this;
    }

    /**
     * Institution Type
     * <p>
     * Lineage reference object : RORCAMP_INST_TYPE
     * 
     */
    @JsonProperty("instType")
    public String getInstType() {
        return instType;
    }

    /**
     * Institution Type
     * <p>
     * Lineage reference object : RORCAMP_INST_TYPE
     * 
     */
    @JsonProperty("instType")
    public void setInstType(String instType) {
        this.instType = instType;
    }

    public Rorcamp withInstType(String instType) {
        this.instType = instType;
        return this;
    }

    /**
     * Financial Control
     * <p>
     * Lineage reference object : RORCAMP_INST_FIN_CONTROL
     * 
     */
    @JsonProperty("instFinControl")
    public String getInstFinControl() {
        return instFinControl;
    }

    /**
     * Financial Control
     * <p>
     * Lineage reference object : RORCAMP_INST_FIN_CONTROL
     * 
     */
    @JsonProperty("instFinControl")
    public void setInstFinControl(String instFinControl) {
        this.instFinControl = instFinControl;
    }

    public Rorcamp withInstFinControl(String instFinControl) {
        this.instFinControl = instFinControl;
        return this;
    }

    /**
     * Fax Area Code
     * <p>
     * Lineage reference object : RORCAMP_FAA_FAX_AREA
     * 
     */
    @JsonProperty("faaFaxArea")
    public String getFaaFaxArea() {
        return faaFaxArea;
    }

    /**
     * Fax Area Code
     * <p>
     * Lineage reference object : RORCAMP_FAA_FAX_AREA
     * 
     */
    @JsonProperty("faaFaxArea")
    public void setFaaFaxArea(String faaFaxArea) {
        this.faaFaxArea = faaFaxArea;
    }

    public Rorcamp withFaaFaxArea(String faaFaxArea) {
        this.faaFaxArea = faaFaxArea;
        return this;
    }

    /**
     * Aid Administrator
     * <p>
     * Lineage reference object : RORCAMP_FAA_ADMIN_NAME
     * 
     */
    @JsonProperty("faaAdminName")
    public String getFaaAdminName() {
        return faaAdminName;
    }

    /**
     * Aid Administrator
     * <p>
     * Lineage reference object : RORCAMP_FAA_ADMIN_NAME
     * 
     */
    @JsonProperty("faaAdminName")
    public void setFaaAdminName(String faaAdminName) {
        this.faaAdminName = faaAdminName;
    }

    public Rorcamp withFaaAdminName(String faaAdminName) {
        this.faaAdminName = faaAdminName;
        return this;
    }

    /**
     * Lineage reference object : RORCAMP_FAA_PHONE_NO
     * 
     */
    @JsonProperty("faaPhoneNo")
    public String getFaaPhoneNo() {
        return faaPhoneNo;
    }

    /**
     * Lineage reference object : RORCAMP_FAA_PHONE_NO
     * 
     */
    @JsonProperty("faaPhoneNo")
    public void setFaaPhoneNo(String faaPhoneNo) {
        this.faaPhoneNo = faaPhoneNo;
    }

    public Rorcamp withFaaPhoneNo(String faaPhoneNo) {
        this.faaPhoneNo = faaPhoneNo;
        return this;
    }

    /**
     * Campus Code
     * <p>
     * Lineage reference object : RORCAMP_CAMP_CODE, Lookup lineage reference object : stvcamp
     * (Required)
     * 
     */
    @JsonProperty("campCode")
    public String getCampCode() {
        return campCode;
    }

    /**
     * Campus Code
     * <p>
     * Lineage reference object : RORCAMP_CAMP_CODE, Lookup lineage reference object : stvcamp
     * (Required)
     * 
     */
    @JsonProperty("campCode")
    public void setCampCode(String campCode) {
        this.campCode = campCode;
    }

    public Rorcamp withCampCode(String campCode) {
        this.campCode = campCode;
        return this;
    }

    /**
     * Lineage reference object : RORCAMP_FAA_PHONE_EXT
     * 
     */
    @JsonProperty("faaPhoneExt")
    public String getFaaPhoneExt() {
        return faaPhoneExt;
    }

    /**
     * Lineage reference object : RORCAMP_FAA_PHONE_EXT
     * 
     */
    @JsonProperty("faaPhoneExt")
    public void setFaaPhoneExt(String faaPhoneExt) {
        this.faaPhoneExt = faaPhoneExt;
    }

    public Rorcamp withFaaPhoneExt(String faaPhoneExt) {
        this.faaPhoneExt = faaPhoneExt;
        return this;
    }

    /**
     * Lineage reference object : RORCAMP_FAA_FAX_NO
     * 
     */
    @JsonProperty("faaFaxNo")
    public String getFaaFaxNo() {
        return faaFaxNo;
    }

    /**
     * Lineage reference object : RORCAMP_FAA_FAX_NO
     * 
     */
    @JsonProperty("faaFaxNo")
    public void setFaaFaxNo(String faaFaxNo) {
        this.faaFaxNo = faaFaxNo;
    }

    public Rorcamp withFaaFaxNo(String faaFaxNo) {
        this.faaFaxNo = faaFaxNo;
        return this;
    }

    /**
     * Lineage reference object : RORCAMP_FAA_FAX_EXT
     * 
     */
    @JsonProperty("faaFaxExt")
    public String getFaaFaxExt() {
        return faaFaxExt;
    }

    /**
     * Lineage reference object : RORCAMP_FAA_FAX_EXT
     * 
     */
    @JsonProperty("faaFaxExt")
    public void setFaaFaxExt(String faaFaxExt) {
        this.faaFaxExt = faaFaxExt;
    }

    public Rorcamp withFaaFaxExt(String faaFaxExt) {
        this.faaFaxExt = faaFaxExt;
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

    public Rorcamp withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Rorcamp.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("mailLine3InstFaa");
        sb.append('=');
        sb.append(((this.mailLine3InstFaa == null)?"<null>":this.mailLine3InstFaa));
        sb.append(',');
        sb.append("statCodeInstFaa");
        sb.append('=');
        sb.append(((this.statCodeInstFaa == null)?"<null>":this.statCodeInstFaa));
        sb.append(',');
        sb.append("faaPhoneArea");
        sb.append('=');
        sb.append(((this.faaPhoneArea == null)?"<null>":this.faaPhoneArea));
        sb.append(',');
        sb.append("zipInstFaa");
        sb.append('=');
        sb.append(((this.zipInstFaa == null)?"<null>":this.zipInstFaa));
        sb.append(',');
        sb.append("houseNumber");
        sb.append('=');
        sb.append(((this.houseNumber == null)?"<null>":this.houseNumber));
        sb.append(',');
        sb.append("mailCityInstFaa");
        sb.append('=');
        sb.append(((this.mailCityInstFaa == null)?"<null>":this.mailCityInstFaa));
        sb.append(',');
        sb.append("displayCampDesc");
        sb.append('=');
        sb.append(((this.displayCampDesc == null)?"<null>":this.displayCampDesc));
        sb.append(',');
        sb.append("faaFaxCtryCode");
        sb.append('=');
        sb.append(((this.faaFaxCtryCode == null)?"<null>":this.faaFaxCtryCode));
        sb.append(',');
        sb.append("ctryCodePhone");
        sb.append('=');
        sb.append(((this.ctryCodePhone == null)?"<null>":this.ctryCodePhone));
        sb.append(',');
        sb.append("mailLine2InstFaa");
        sb.append('=');
        sb.append(((this.mailLine2InstFaa == null)?"<null>":this.mailLine2InstFaa));
        sb.append(',');
        sb.append("mailLine4InstFaa");
        sb.append('=');
        sb.append(((this.mailLine4InstFaa == null)?"<null>":this.mailLine4InstFaa));
        sb.append(',');
        sb.append("faaEmail");
        sb.append('=');
        sb.append(((this.faaEmail == null)?"<null>":this.faaEmail));
        sb.append(',');
        sb.append("mailLine1InstFaa");
        sb.append('=');
        sb.append(((this.mailLine1InstFaa == null)?"<null>":this.mailLine1InstFaa));
        sb.append(',');
        sb.append("instType");
        sb.append('=');
        sb.append(((this.instType == null)?"<null>":this.instType));
        sb.append(',');
        sb.append("instFinControl");
        sb.append('=');
        sb.append(((this.instFinControl == null)?"<null>":this.instFinControl));
        sb.append(',');
        sb.append("faaFaxArea");
        sb.append('=');
        sb.append(((this.faaFaxArea == null)?"<null>":this.faaFaxArea));
        sb.append(',');
        sb.append("faaAdminName");
        sb.append('=');
        sb.append(((this.faaAdminName == null)?"<null>":this.faaAdminName));
        sb.append(',');
        sb.append("faaPhoneNo");
        sb.append('=');
        sb.append(((this.faaPhoneNo == null)?"<null>":this.faaPhoneNo));
        sb.append(',');
        sb.append("campCode");
        sb.append('=');
        sb.append(((this.campCode == null)?"<null>":this.campCode));
        sb.append(',');
        sb.append("faaPhoneExt");
        sb.append('=');
        sb.append(((this.faaPhoneExt == null)?"<null>":this.faaPhoneExt));
        sb.append(',');
        sb.append("faaFaxNo");
        sb.append('=');
        sb.append(((this.faaFaxNo == null)?"<null>":this.faaFaxNo));
        sb.append(',');
        sb.append("faaFaxExt");
        sb.append('=');
        sb.append(((this.faaFaxExt == null)?"<null>":this.faaFaxExt));
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
        result = ((result* 31)+((this.mailLine3InstFaa == null)? 0 :this.mailLine3InstFaa.hashCode()));
        result = ((result* 31)+((this.statCodeInstFaa == null)? 0 :this.statCodeInstFaa.hashCode()));
        result = ((result* 31)+((this.faaPhoneArea == null)? 0 :this.faaPhoneArea.hashCode()));
        result = ((result* 31)+((this.zipInstFaa == null)? 0 :this.zipInstFaa.hashCode()));
        result = ((result* 31)+((this.houseNumber == null)? 0 :this.houseNumber.hashCode()));
        result = ((result* 31)+((this.mailCityInstFaa == null)? 0 :this.mailCityInstFaa.hashCode()));
        result = ((result* 31)+((this.displayCampDesc == null)? 0 :this.displayCampDesc.hashCode()));
        result = ((result* 31)+((this.faaFaxCtryCode == null)? 0 :this.faaFaxCtryCode.hashCode()));
        result = ((result* 31)+((this.ctryCodePhone == null)? 0 :this.ctryCodePhone.hashCode()));
        result = ((result* 31)+((this.mailLine2InstFaa == null)? 0 :this.mailLine2InstFaa.hashCode()));
        result = ((result* 31)+((this.mailLine4InstFaa == null)? 0 :this.mailLine4InstFaa.hashCode()));
        result = ((result* 31)+((this.faaEmail == null)? 0 :this.faaEmail.hashCode()));
        result = ((result* 31)+((this.mailLine1InstFaa == null)? 0 :this.mailLine1InstFaa.hashCode()));
        result = ((result* 31)+((this.instType == null)? 0 :this.instType.hashCode()));
        result = ((result* 31)+((this.instFinControl == null)? 0 :this.instFinControl.hashCode()));
        result = ((result* 31)+((this.faaFaxArea == null)? 0 :this.faaFaxArea.hashCode()));
        result = ((result* 31)+((this.faaAdminName == null)? 0 :this.faaAdminName.hashCode()));
        result = ((result* 31)+((this.faaPhoneNo == null)? 0 :this.faaPhoneNo.hashCode()));
        result = ((result* 31)+((this.campCode == null)? 0 :this.campCode.hashCode()));
        result = ((result* 31)+((this.faaPhoneExt == null)? 0 :this.faaPhoneExt.hashCode()));
        result = ((result* 31)+((this.faaFaxNo == null)? 0 :this.faaFaxNo.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.faaFaxExt == null)? 0 :this.faaFaxExt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Rorcamp) == false) {
            return false;
        }
        Rorcamp rhs = ((Rorcamp) other);
        return ((((((((((((((((((((((((this.mailLine3InstFaa == rhs.mailLine3InstFaa)||((this.mailLine3InstFaa!= null)&&this.mailLine3InstFaa.equals(rhs.mailLine3InstFaa)))&&((this.statCodeInstFaa == rhs.statCodeInstFaa)||((this.statCodeInstFaa!= null)&&this.statCodeInstFaa.equals(rhs.statCodeInstFaa))))&&((this.faaPhoneArea == rhs.faaPhoneArea)||((this.faaPhoneArea!= null)&&this.faaPhoneArea.equals(rhs.faaPhoneArea))))&&((this.zipInstFaa == rhs.zipInstFaa)||((this.zipInstFaa!= null)&&this.zipInstFaa.equals(rhs.zipInstFaa))))&&((this.houseNumber == rhs.houseNumber)||((this.houseNumber!= null)&&this.houseNumber.equals(rhs.houseNumber))))&&((this.mailCityInstFaa == rhs.mailCityInstFaa)||((this.mailCityInstFaa!= null)&&this.mailCityInstFaa.equals(rhs.mailCityInstFaa))))&&((this.displayCampDesc == rhs.displayCampDesc)||((this.displayCampDesc!= null)&&this.displayCampDesc.equals(rhs.displayCampDesc))))&&((this.faaFaxCtryCode == rhs.faaFaxCtryCode)||((this.faaFaxCtryCode!= null)&&this.faaFaxCtryCode.equals(rhs.faaFaxCtryCode))))&&((this.ctryCodePhone == rhs.ctryCodePhone)||((this.ctryCodePhone!= null)&&this.ctryCodePhone.equals(rhs.ctryCodePhone))))&&((this.mailLine2InstFaa == rhs.mailLine2InstFaa)||((this.mailLine2InstFaa!= null)&&this.mailLine2InstFaa.equals(rhs.mailLine2InstFaa))))&&((this.mailLine4InstFaa == rhs.mailLine4InstFaa)||((this.mailLine4InstFaa!= null)&&this.mailLine4InstFaa.equals(rhs.mailLine4InstFaa))))&&((this.faaEmail == rhs.faaEmail)||((this.faaEmail!= null)&&this.faaEmail.equals(rhs.faaEmail))))&&((this.mailLine1InstFaa == rhs.mailLine1InstFaa)||((this.mailLine1InstFaa!= null)&&this.mailLine1InstFaa.equals(rhs.mailLine1InstFaa))))&&((this.instType == rhs.instType)||((this.instType!= null)&&this.instType.equals(rhs.instType))))&&((this.instFinControl == rhs.instFinControl)||((this.instFinControl!= null)&&this.instFinControl.equals(rhs.instFinControl))))&&((this.faaFaxArea == rhs.faaFaxArea)||((this.faaFaxArea!= null)&&this.faaFaxArea.equals(rhs.faaFaxArea))))&&((this.faaAdminName == rhs.faaAdminName)||((this.faaAdminName!= null)&&this.faaAdminName.equals(rhs.faaAdminName))))&&((this.faaPhoneNo == rhs.faaPhoneNo)||((this.faaPhoneNo!= null)&&this.faaPhoneNo.equals(rhs.faaPhoneNo))))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.faaPhoneExt == rhs.faaPhoneExt)||((this.faaPhoneExt!= null)&&this.faaPhoneExt.equals(rhs.faaPhoneExt))))&&((this.faaFaxNo == rhs.faaFaxNo)||((this.faaFaxNo!= null)&&this.faaFaxNo.equals(rhs.faaFaxNo))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.faaFaxExt == rhs.faaFaxExt)||((this.faaFaxExt!= null)&&this.faaFaxExt.equals(rhs.faaFaxExt))));
    }

}
