
package com.ellucian.generated.bpapi.ban.building_definition.v1_0_0;

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
    "cntyCode",
    "streetLine2",
    "streetLine1",
    "parsCode",
    "bldgCntyDesc",
    "city",
    "phoneExtension",
    "streetLine3",
    "keyNumber",
    "ctryCodePhone",
    "capacity",
    "bldgRrcdDesc",
    "campCode",
    "collDesc",
    "deptDesc",
    "maximumCapacity",
    "parsDesc",
    "zip",
    "bldgStatDesc",
    "bldgSiteDesc",
    "siteCode",
    "statCode",
    "sex",
    "bldgPrcdDesc",
    "prcdCode",
    "phoneNumber",
    "rrcdCode",
    "bldgCampDesc",
    "phoneArea",
    "collCode",
    "deptCode"
})
@Generated("jsonschema2pojo")
public class BuildingDefinition100PutResponse {

    /**
     * County Code
     * <p>
     * Lineage reference object : SLBBLDG_CNTY_CODE, Lookup lineage reference object : stvcnty
     * 
     */
    @JsonProperty("cntyCode")
    @JsonPropertyDescription("Lineage reference object : SLBBLDG_CNTY_CODE, Lookup lineage reference object : stvcnty")
    private String cntyCode;
    /**
     * Street Line 2
     * <p>
     * Lineage reference object : SLBBLDG_STREET_LINE2
     * 
     */
    @JsonProperty("streetLine2")
    @JsonPropertyDescription("Lineage reference object : SLBBLDG_STREET_LINE2")
    private String streetLine2;
    /**
     * Street Line 1
     * <p>
     * Lineage reference object : SLBBLDG_STREET_LINE1
     * 
     */
    @JsonProperty("streetLine1")
    @JsonPropertyDescription("Lineage reference object : SLBBLDG_STREET_LINE1")
    private String streetLine1;
    /**
     * Partition
     * <p>
     * Lineage reference object : SLBBLDG_PARS_CODE, Lookup lineage reference object : gtvpars
     * 
     */
    @JsonProperty("parsCode")
    @JsonPropertyDescription("Lineage reference object : SLBBLDG_PARS_CODE, Lookup lineage reference object : gtvpars")
    private String parsCode;
    @JsonProperty("bldgCntyDesc")
    private String bldgCntyDesc;
    /**
     * City
     * <p>
     * Lineage reference object : SLBBLDG_CITY
     * 
     */
    @JsonProperty("city")
    @JsonPropertyDescription("Lineage reference object : SLBBLDG_CITY")
    private String city;
    /**
     * Lineage reference object : SLBBLDG_PHONE_EXTENSION
     * 
     */
    @JsonProperty("phoneExtension")
    @JsonPropertyDescription("Lineage reference object : SLBBLDG_PHONE_EXTENSION")
    private String phoneExtension;
    /**
     * Street Line 3
     * <p>
     * Lineage reference object : SLBBLDG_STREET_LINE3
     * 
     */
    @JsonProperty("streetLine3")
    @JsonPropertyDescription("Lineage reference object : SLBBLDG_STREET_LINE3")
    private String streetLine3;
    /**
     * Key Number
     * <p>
     * Lineage reference object : SLBBLDG_KEY_NUMBER
     * 
     */
    @JsonProperty("keyNumber")
    @JsonPropertyDescription("Lineage reference object : SLBBLDG_KEY_NUMBER")
    private String keyNumber;
    /**
     * Lineage reference object : SLBBLDG_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("ctryCodePhone")
    @JsonPropertyDescription("Lineage reference object : SLBBLDG_CTRY_CODE_PHONE")
    private String ctryCodePhone;
    /**
     * Capacity
     * <p>
     * Lineage reference object : SLBBLDG_CAPACITY
     * (Required)
     * 
     */
    @JsonProperty("capacity")
    @JsonPropertyDescription("Lineage reference object : SLBBLDG_CAPACITY")
    private Double capacity;
    @JsonProperty("bldgRrcdDesc")
    private String bldgRrcdDesc;
    /**
     * Campus
     * <p>
     * Lineage reference object : SLBBLDG_CAMP_CODE, Lookup lineage reference object : stvcamp
     * (Required)
     * 
     */
    @JsonProperty("campCode")
    @JsonPropertyDescription("Lineage reference object : SLBBLDG_CAMP_CODE, Lookup lineage reference object : stvcamp")
    private String campCode;
    @JsonProperty("collDesc")
    private String collDesc;
    @JsonProperty("deptDesc")
    private String deptDesc;
    /**
     * Maximum
     * <p>
     * Lineage reference object : SLBBLDG_MAXIMUM_CAPACITY
     * (Required)
     * 
     */
    @JsonProperty("maximumCapacity")
    @JsonPropertyDescription("Lineage reference object : SLBBLDG_MAXIMUM_CAPACITY")
    private Double maximumCapacity;
    @JsonProperty("parsDesc")
    private String parsDesc;
    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : SLBBLDG_ZIP
     * 
     */
    @JsonProperty("zip")
    @JsonPropertyDescription("Lineage reference object : SLBBLDG_ZIP")
    private String zip;
    @JsonProperty("bldgStatDesc")
    private String bldgStatDesc;
    @JsonProperty("bldgSiteDesc")
    private String bldgSiteDesc;
    /**
     * Site
     * <p>
     * Lineage reference object : SLBBLDG_SITE_CODE, Lookup lineage reference object : stvsite
     * 
     */
    @JsonProperty("siteCode")
    @JsonPropertyDescription("Lineage reference object : SLBBLDG_SITE_CODE, Lookup lineage reference object : stvsite")
    private String siteCode;
    /**
     * State or Province
     * <p>
     * Lineage reference object : SLBBLDG_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCode")
    @JsonPropertyDescription("Lineage reference object : SLBBLDG_STAT_CODE, Lookup lineage reference object : stvstat")
    private String statCode;
    /**
     * Gender
     * <p>
     * Lineage reference object : SLBBLDG_SEX
     * 
     */
    @JsonProperty("sex")
    @JsonPropertyDescription("Lineage reference object : SLBBLDG_SEX")
    private String sex;
    @JsonProperty("bldgPrcdDesc")
    private String bldgPrcdDesc;
    /**
     * Phone Rate
     * <p>
     * Lineage reference object : SLBBLDG_PRCD_CODE, Lookup lineage reference object : stvprcd
     * 
     */
    @JsonProperty("prcdCode")
    @JsonPropertyDescription("Lineage reference object : SLBBLDG_PRCD_CODE, Lookup lineage reference object : stvprcd")
    private String prcdCode;
    /**
     * Lineage reference object : SLBBLDG_PHONE_NUMBER
     * 
     */
    @JsonProperty("phoneNumber")
    @JsonPropertyDescription("Lineage reference object : SLBBLDG_PHONE_NUMBER")
    private String phoneNumber;
    /**
     * Room Rate
     * <p>
     * Lineage reference object : SLBBLDG_RRCD_CODE, Lookup lineage reference object : stvrrcd
     * 
     */
    @JsonProperty("rrcdCode")
    @JsonPropertyDescription("Lineage reference object : SLBBLDG_RRCD_CODE, Lookup lineage reference object : stvrrcd")
    private String rrcdCode;
    @JsonProperty("bldgCampDesc")
    private String bldgCampDesc;
    /**
     * Phone
     * <p>
     * Lineage reference object : SLBBLDG_PHONE_AREA
     * 
     */
    @JsonProperty("phoneArea")
    @JsonPropertyDescription("Lineage reference object : SLBBLDG_PHONE_AREA")
    private String phoneArea;
    /**
     * College
     * <p>
     * Lineage reference object : SLBBLDG_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    @JsonPropertyDescription("Lineage reference object : SLBBLDG_COLL_CODE, Lookup lineage reference object : stvcoll")
    private String collCode;
    /**
     * Department
     * <p>
     * Lineage reference object : SLBBLDG_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    @JsonPropertyDescription("Lineage reference object : SLBBLDG_DEPT_CODE, Lookup lineage reference object : stvdept")
    private String deptCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * County Code
     * <p>
     * Lineage reference object : SLBBLDG_CNTY_CODE, Lookup lineage reference object : stvcnty
     * 
     */
    @JsonProperty("cntyCode")
    public String getCntyCode() {
        return cntyCode;
    }

    /**
     * County Code
     * <p>
     * Lineage reference object : SLBBLDG_CNTY_CODE, Lookup lineage reference object : stvcnty
     * 
     */
    @JsonProperty("cntyCode")
    public void setCntyCode(String cntyCode) {
        this.cntyCode = cntyCode;
    }

    public BuildingDefinition100PutResponse withCntyCode(String cntyCode) {
        this.cntyCode = cntyCode;
        return this;
    }

    /**
     * Street Line 2
     * <p>
     * Lineage reference object : SLBBLDG_STREET_LINE2
     * 
     */
    @JsonProperty("streetLine2")
    public String getStreetLine2() {
        return streetLine2;
    }

    /**
     * Street Line 2
     * <p>
     * Lineage reference object : SLBBLDG_STREET_LINE2
     * 
     */
    @JsonProperty("streetLine2")
    public void setStreetLine2(String streetLine2) {
        this.streetLine2 = streetLine2;
    }

    public BuildingDefinition100PutResponse withStreetLine2(String streetLine2) {
        this.streetLine2 = streetLine2;
        return this;
    }

    /**
     * Street Line 1
     * <p>
     * Lineage reference object : SLBBLDG_STREET_LINE1
     * 
     */
    @JsonProperty("streetLine1")
    public String getStreetLine1() {
        return streetLine1;
    }

    /**
     * Street Line 1
     * <p>
     * Lineage reference object : SLBBLDG_STREET_LINE1
     * 
     */
    @JsonProperty("streetLine1")
    public void setStreetLine1(String streetLine1) {
        this.streetLine1 = streetLine1;
    }

    public BuildingDefinition100PutResponse withStreetLine1(String streetLine1) {
        this.streetLine1 = streetLine1;
        return this;
    }

    /**
     * Partition
     * <p>
     * Lineage reference object : SLBBLDG_PARS_CODE, Lookup lineage reference object : gtvpars
     * 
     */
    @JsonProperty("parsCode")
    public String getParsCode() {
        return parsCode;
    }

    /**
     * Partition
     * <p>
     * Lineage reference object : SLBBLDG_PARS_CODE, Lookup lineage reference object : gtvpars
     * 
     */
    @JsonProperty("parsCode")
    public void setParsCode(String parsCode) {
        this.parsCode = parsCode;
    }

    public BuildingDefinition100PutResponse withParsCode(String parsCode) {
        this.parsCode = parsCode;
        return this;
    }

    @JsonProperty("bldgCntyDesc")
    public String getBldgCntyDesc() {
        return bldgCntyDesc;
    }

    @JsonProperty("bldgCntyDesc")
    public void setBldgCntyDesc(String bldgCntyDesc) {
        this.bldgCntyDesc = bldgCntyDesc;
    }

    public BuildingDefinition100PutResponse withBldgCntyDesc(String bldgCntyDesc) {
        this.bldgCntyDesc = bldgCntyDesc;
        return this;
    }

    /**
     * City
     * <p>
     * Lineage reference object : SLBBLDG_CITY
     * 
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * City
     * <p>
     * Lineage reference object : SLBBLDG_CITY
     * 
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public BuildingDefinition100PutResponse withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Lineage reference object : SLBBLDG_PHONE_EXTENSION
     * 
     */
    @JsonProperty("phoneExtension")
    public String getPhoneExtension() {
        return phoneExtension;
    }

    /**
     * Lineage reference object : SLBBLDG_PHONE_EXTENSION
     * 
     */
    @JsonProperty("phoneExtension")
    public void setPhoneExtension(String phoneExtension) {
        this.phoneExtension = phoneExtension;
    }

    public BuildingDefinition100PutResponse withPhoneExtension(String phoneExtension) {
        this.phoneExtension = phoneExtension;
        return this;
    }

    /**
     * Street Line 3
     * <p>
     * Lineage reference object : SLBBLDG_STREET_LINE3
     * 
     */
    @JsonProperty("streetLine3")
    public String getStreetLine3() {
        return streetLine3;
    }

    /**
     * Street Line 3
     * <p>
     * Lineage reference object : SLBBLDG_STREET_LINE3
     * 
     */
    @JsonProperty("streetLine3")
    public void setStreetLine3(String streetLine3) {
        this.streetLine3 = streetLine3;
    }

    public BuildingDefinition100PutResponse withStreetLine3(String streetLine3) {
        this.streetLine3 = streetLine3;
        return this;
    }

    /**
     * Key Number
     * <p>
     * Lineage reference object : SLBBLDG_KEY_NUMBER
     * 
     */
    @JsonProperty("keyNumber")
    public String getKeyNumber() {
        return keyNumber;
    }

    /**
     * Key Number
     * <p>
     * Lineage reference object : SLBBLDG_KEY_NUMBER
     * 
     */
    @JsonProperty("keyNumber")
    public void setKeyNumber(String keyNumber) {
        this.keyNumber = keyNumber;
    }

    public BuildingDefinition100PutResponse withKeyNumber(String keyNumber) {
        this.keyNumber = keyNumber;
        return this;
    }

    /**
     * Lineage reference object : SLBBLDG_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("ctryCodePhone")
    public String getCtryCodePhone() {
        return ctryCodePhone;
    }

    /**
     * Lineage reference object : SLBBLDG_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("ctryCodePhone")
    public void setCtryCodePhone(String ctryCodePhone) {
        this.ctryCodePhone = ctryCodePhone;
    }

    public BuildingDefinition100PutResponse withCtryCodePhone(String ctryCodePhone) {
        this.ctryCodePhone = ctryCodePhone;
        return this;
    }

    /**
     * Capacity
     * <p>
     * Lineage reference object : SLBBLDG_CAPACITY
     * (Required)
     * 
     */
    @JsonProperty("capacity")
    public Double getCapacity() {
        return capacity;
    }

    /**
     * Capacity
     * <p>
     * Lineage reference object : SLBBLDG_CAPACITY
     * (Required)
     * 
     */
    @JsonProperty("capacity")
    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    public BuildingDefinition100PutResponse withCapacity(Double capacity) {
        this.capacity = capacity;
        return this;
    }

    @JsonProperty("bldgRrcdDesc")
    public String getBldgRrcdDesc() {
        return bldgRrcdDesc;
    }

    @JsonProperty("bldgRrcdDesc")
    public void setBldgRrcdDesc(String bldgRrcdDesc) {
        this.bldgRrcdDesc = bldgRrcdDesc;
    }

    public BuildingDefinition100PutResponse withBldgRrcdDesc(String bldgRrcdDesc) {
        this.bldgRrcdDesc = bldgRrcdDesc;
        return this;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SLBBLDG_CAMP_CODE, Lookup lineage reference object : stvcamp
     * (Required)
     * 
     */
    @JsonProperty("campCode")
    public String getCampCode() {
        return campCode;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SLBBLDG_CAMP_CODE, Lookup lineage reference object : stvcamp
     * (Required)
     * 
     */
    @JsonProperty("campCode")
    public void setCampCode(String campCode) {
        this.campCode = campCode;
    }

    public BuildingDefinition100PutResponse withCampCode(String campCode) {
        this.campCode = campCode;
        return this;
    }

    @JsonProperty("collDesc")
    public String getCollDesc() {
        return collDesc;
    }

    @JsonProperty("collDesc")
    public void setCollDesc(String collDesc) {
        this.collDesc = collDesc;
    }

    public BuildingDefinition100PutResponse withCollDesc(String collDesc) {
        this.collDesc = collDesc;
        return this;
    }

    @JsonProperty("deptDesc")
    public String getDeptDesc() {
        return deptDesc;
    }

    @JsonProperty("deptDesc")
    public void setDeptDesc(String deptDesc) {
        this.deptDesc = deptDesc;
    }

    public BuildingDefinition100PutResponse withDeptDesc(String deptDesc) {
        this.deptDesc = deptDesc;
        return this;
    }

    /**
     * Maximum
     * <p>
     * Lineage reference object : SLBBLDG_MAXIMUM_CAPACITY
     * (Required)
     * 
     */
    @JsonProperty("maximumCapacity")
    public Double getMaximumCapacity() {
        return maximumCapacity;
    }

    /**
     * Maximum
     * <p>
     * Lineage reference object : SLBBLDG_MAXIMUM_CAPACITY
     * (Required)
     * 
     */
    @JsonProperty("maximumCapacity")
    public void setMaximumCapacity(Double maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public BuildingDefinition100PutResponse withMaximumCapacity(Double maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        return this;
    }

    @JsonProperty("parsDesc")
    public String getParsDesc() {
        return parsDesc;
    }

    @JsonProperty("parsDesc")
    public void setParsDesc(String parsDesc) {
        this.parsDesc = parsDesc;
    }

    public BuildingDefinition100PutResponse withParsDesc(String parsDesc) {
        this.parsDesc = parsDesc;
        return this;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : SLBBLDG_ZIP
     * 
     */
    @JsonProperty("zip")
    public String getZip() {
        return zip;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : SLBBLDG_ZIP
     * 
     */
    @JsonProperty("zip")
    public void setZip(String zip) {
        this.zip = zip;
    }

    public BuildingDefinition100PutResponse withZip(String zip) {
        this.zip = zip;
        return this;
    }

    @JsonProperty("bldgStatDesc")
    public String getBldgStatDesc() {
        return bldgStatDesc;
    }

    @JsonProperty("bldgStatDesc")
    public void setBldgStatDesc(String bldgStatDesc) {
        this.bldgStatDesc = bldgStatDesc;
    }

    public BuildingDefinition100PutResponse withBldgStatDesc(String bldgStatDesc) {
        this.bldgStatDesc = bldgStatDesc;
        return this;
    }

    @JsonProperty("bldgSiteDesc")
    public String getBldgSiteDesc() {
        return bldgSiteDesc;
    }

    @JsonProperty("bldgSiteDesc")
    public void setBldgSiteDesc(String bldgSiteDesc) {
        this.bldgSiteDesc = bldgSiteDesc;
    }

    public BuildingDefinition100PutResponse withBldgSiteDesc(String bldgSiteDesc) {
        this.bldgSiteDesc = bldgSiteDesc;
        return this;
    }

    /**
     * Site
     * <p>
     * Lineage reference object : SLBBLDG_SITE_CODE, Lookup lineage reference object : stvsite
     * 
     */
    @JsonProperty("siteCode")
    public String getSiteCode() {
        return siteCode;
    }

    /**
     * Site
     * <p>
     * Lineage reference object : SLBBLDG_SITE_CODE, Lookup lineage reference object : stvsite
     * 
     */
    @JsonProperty("siteCode")
    public void setSiteCode(String siteCode) {
        this.siteCode = siteCode;
    }

    public BuildingDefinition100PutResponse withSiteCode(String siteCode) {
        this.siteCode = siteCode;
        return this;
    }

    /**
     * State or Province
     * <p>
     * Lineage reference object : SLBBLDG_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCode")
    public String getStatCode() {
        return statCode;
    }

    /**
     * State or Province
     * <p>
     * Lineage reference object : SLBBLDG_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCode")
    public void setStatCode(String statCode) {
        this.statCode = statCode;
    }

    public BuildingDefinition100PutResponse withStatCode(String statCode) {
        this.statCode = statCode;
        return this;
    }

    /**
     * Gender
     * <p>
     * Lineage reference object : SLBBLDG_SEX
     * 
     */
    @JsonProperty("sex")
    public String getSex() {
        return sex;
    }

    /**
     * Gender
     * <p>
     * Lineage reference object : SLBBLDG_SEX
     * 
     */
    @JsonProperty("sex")
    public void setSex(String sex) {
        this.sex = sex;
    }

    public BuildingDefinition100PutResponse withSex(String sex) {
        this.sex = sex;
        return this;
    }

    @JsonProperty("bldgPrcdDesc")
    public String getBldgPrcdDesc() {
        return bldgPrcdDesc;
    }

    @JsonProperty("bldgPrcdDesc")
    public void setBldgPrcdDesc(String bldgPrcdDesc) {
        this.bldgPrcdDesc = bldgPrcdDesc;
    }

    public BuildingDefinition100PutResponse withBldgPrcdDesc(String bldgPrcdDesc) {
        this.bldgPrcdDesc = bldgPrcdDesc;
        return this;
    }

    /**
     * Phone Rate
     * <p>
     * Lineage reference object : SLBBLDG_PRCD_CODE, Lookup lineage reference object : stvprcd
     * 
     */
    @JsonProperty("prcdCode")
    public String getPrcdCode() {
        return prcdCode;
    }

    /**
     * Phone Rate
     * <p>
     * Lineage reference object : SLBBLDG_PRCD_CODE, Lookup lineage reference object : stvprcd
     * 
     */
    @JsonProperty("prcdCode")
    public void setPrcdCode(String prcdCode) {
        this.prcdCode = prcdCode;
    }

    public BuildingDefinition100PutResponse withPrcdCode(String prcdCode) {
        this.prcdCode = prcdCode;
        return this;
    }

    /**
     * Lineage reference object : SLBBLDG_PHONE_NUMBER
     * 
     */
    @JsonProperty("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Lineage reference object : SLBBLDG_PHONE_NUMBER
     * 
     */
    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public BuildingDefinition100PutResponse withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Room Rate
     * <p>
     * Lineage reference object : SLBBLDG_RRCD_CODE, Lookup lineage reference object : stvrrcd
     * 
     */
    @JsonProperty("rrcdCode")
    public String getRrcdCode() {
        return rrcdCode;
    }

    /**
     * Room Rate
     * <p>
     * Lineage reference object : SLBBLDG_RRCD_CODE, Lookup lineage reference object : stvrrcd
     * 
     */
    @JsonProperty("rrcdCode")
    public void setRrcdCode(String rrcdCode) {
        this.rrcdCode = rrcdCode;
    }

    public BuildingDefinition100PutResponse withRrcdCode(String rrcdCode) {
        this.rrcdCode = rrcdCode;
        return this;
    }

    @JsonProperty("bldgCampDesc")
    public String getBldgCampDesc() {
        return bldgCampDesc;
    }

    @JsonProperty("bldgCampDesc")
    public void setBldgCampDesc(String bldgCampDesc) {
        this.bldgCampDesc = bldgCampDesc;
    }

    public BuildingDefinition100PutResponse withBldgCampDesc(String bldgCampDesc) {
        this.bldgCampDesc = bldgCampDesc;
        return this;
    }

    /**
     * Phone
     * <p>
     * Lineage reference object : SLBBLDG_PHONE_AREA
     * 
     */
    @JsonProperty("phoneArea")
    public String getPhoneArea() {
        return phoneArea;
    }

    /**
     * Phone
     * <p>
     * Lineage reference object : SLBBLDG_PHONE_AREA
     * 
     */
    @JsonProperty("phoneArea")
    public void setPhoneArea(String phoneArea) {
        this.phoneArea = phoneArea;
    }

    public BuildingDefinition100PutResponse withPhoneArea(String phoneArea) {
        this.phoneArea = phoneArea;
        return this;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SLBBLDG_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    public String getCollCode() {
        return collCode;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SLBBLDG_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    public void setCollCode(String collCode) {
        this.collCode = collCode;
    }

    public BuildingDefinition100PutResponse withCollCode(String collCode) {
        this.collCode = collCode;
        return this;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SLBBLDG_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SLBBLDG_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public BuildingDefinition100PutResponse withDeptCode(String deptCode) {
        this.deptCode = deptCode;
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

    public BuildingDefinition100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BuildingDefinition100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cntyCode");
        sb.append('=');
        sb.append(((this.cntyCode == null)?"<null>":this.cntyCode));
        sb.append(',');
        sb.append("streetLine2");
        sb.append('=');
        sb.append(((this.streetLine2 == null)?"<null>":this.streetLine2));
        sb.append(',');
        sb.append("streetLine1");
        sb.append('=');
        sb.append(((this.streetLine1 == null)?"<null>":this.streetLine1));
        sb.append(',');
        sb.append("parsCode");
        sb.append('=');
        sb.append(((this.parsCode == null)?"<null>":this.parsCode));
        sb.append(',');
        sb.append("bldgCntyDesc");
        sb.append('=');
        sb.append(((this.bldgCntyDesc == null)?"<null>":this.bldgCntyDesc));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("phoneExtension");
        sb.append('=');
        sb.append(((this.phoneExtension == null)?"<null>":this.phoneExtension));
        sb.append(',');
        sb.append("streetLine3");
        sb.append('=');
        sb.append(((this.streetLine3 == null)?"<null>":this.streetLine3));
        sb.append(',');
        sb.append("keyNumber");
        sb.append('=');
        sb.append(((this.keyNumber == null)?"<null>":this.keyNumber));
        sb.append(',');
        sb.append("ctryCodePhone");
        sb.append('=');
        sb.append(((this.ctryCodePhone == null)?"<null>":this.ctryCodePhone));
        sb.append(',');
        sb.append("capacity");
        sb.append('=');
        sb.append(((this.capacity == null)?"<null>":this.capacity));
        sb.append(',');
        sb.append("bldgRrcdDesc");
        sb.append('=');
        sb.append(((this.bldgRrcdDesc == null)?"<null>":this.bldgRrcdDesc));
        sb.append(',');
        sb.append("campCode");
        sb.append('=');
        sb.append(((this.campCode == null)?"<null>":this.campCode));
        sb.append(',');
        sb.append("collDesc");
        sb.append('=');
        sb.append(((this.collDesc == null)?"<null>":this.collDesc));
        sb.append(',');
        sb.append("deptDesc");
        sb.append('=');
        sb.append(((this.deptDesc == null)?"<null>":this.deptDesc));
        sb.append(',');
        sb.append("maximumCapacity");
        sb.append('=');
        sb.append(((this.maximumCapacity == null)?"<null>":this.maximumCapacity));
        sb.append(',');
        sb.append("parsDesc");
        sb.append('=');
        sb.append(((this.parsDesc == null)?"<null>":this.parsDesc));
        sb.append(',');
        sb.append("zip");
        sb.append('=');
        sb.append(((this.zip == null)?"<null>":this.zip));
        sb.append(',');
        sb.append("bldgStatDesc");
        sb.append('=');
        sb.append(((this.bldgStatDesc == null)?"<null>":this.bldgStatDesc));
        sb.append(',');
        sb.append("bldgSiteDesc");
        sb.append('=');
        sb.append(((this.bldgSiteDesc == null)?"<null>":this.bldgSiteDesc));
        sb.append(',');
        sb.append("siteCode");
        sb.append('=');
        sb.append(((this.siteCode == null)?"<null>":this.siteCode));
        sb.append(',');
        sb.append("statCode");
        sb.append('=');
        sb.append(((this.statCode == null)?"<null>":this.statCode));
        sb.append(',');
        sb.append("sex");
        sb.append('=');
        sb.append(((this.sex == null)?"<null>":this.sex));
        sb.append(',');
        sb.append("bldgPrcdDesc");
        sb.append('=');
        sb.append(((this.bldgPrcdDesc == null)?"<null>":this.bldgPrcdDesc));
        sb.append(',');
        sb.append("prcdCode");
        sb.append('=');
        sb.append(((this.prcdCode == null)?"<null>":this.prcdCode));
        sb.append(',');
        sb.append("phoneNumber");
        sb.append('=');
        sb.append(((this.phoneNumber == null)?"<null>":this.phoneNumber));
        sb.append(',');
        sb.append("rrcdCode");
        sb.append('=');
        sb.append(((this.rrcdCode == null)?"<null>":this.rrcdCode));
        sb.append(',');
        sb.append("bldgCampDesc");
        sb.append('=');
        sb.append(((this.bldgCampDesc == null)?"<null>":this.bldgCampDesc));
        sb.append(',');
        sb.append("phoneArea");
        sb.append('=');
        sb.append(((this.phoneArea == null)?"<null>":this.phoneArea));
        sb.append(',');
        sb.append("collCode");
        sb.append('=');
        sb.append(((this.collCode == null)?"<null>":this.collCode));
        sb.append(',');
        sb.append("deptCode");
        sb.append('=');
        sb.append(((this.deptCode == null)?"<null>":this.deptCode));
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
        result = ((result* 31)+((this.cntyCode == null)? 0 :this.cntyCode.hashCode()));
        result = ((result* 31)+((this.streetLine2 == null)? 0 :this.streetLine2 .hashCode()));
        result = ((result* 31)+((this.streetLine1 == null)? 0 :this.streetLine1 .hashCode()));
        result = ((result* 31)+((this.parsCode == null)? 0 :this.parsCode.hashCode()));
        result = ((result* 31)+((this.bldgCntyDesc == null)? 0 :this.bldgCntyDesc.hashCode()));
        result = ((result* 31)+((this.city == null)? 0 :this.city.hashCode()));
        result = ((result* 31)+((this.phoneExtension == null)? 0 :this.phoneExtension.hashCode()));
        result = ((result* 31)+((this.streetLine3 == null)? 0 :this.streetLine3 .hashCode()));
        result = ((result* 31)+((this.keyNumber == null)? 0 :this.keyNumber.hashCode()));
        result = ((result* 31)+((this.ctryCodePhone == null)? 0 :this.ctryCodePhone.hashCode()));
        result = ((result* 31)+((this.capacity == null)? 0 :this.capacity.hashCode()));
        result = ((result* 31)+((this.bldgRrcdDesc == null)? 0 :this.bldgRrcdDesc.hashCode()));
        result = ((result* 31)+((this.campCode == null)? 0 :this.campCode.hashCode()));
        result = ((result* 31)+((this.collDesc == null)? 0 :this.collDesc.hashCode()));
        result = ((result* 31)+((this.deptDesc == null)? 0 :this.deptDesc.hashCode()));
        result = ((result* 31)+((this.maximumCapacity == null)? 0 :this.maximumCapacity.hashCode()));
        result = ((result* 31)+((this.parsDesc == null)? 0 :this.parsDesc.hashCode()));
        result = ((result* 31)+((this.zip == null)? 0 :this.zip.hashCode()));
        result = ((result* 31)+((this.bldgStatDesc == null)? 0 :this.bldgStatDesc.hashCode()));
        result = ((result* 31)+((this.bldgSiteDesc == null)? 0 :this.bldgSiteDesc.hashCode()));
        result = ((result* 31)+((this.siteCode == null)? 0 :this.siteCode.hashCode()));
        result = ((result* 31)+((this.statCode == null)? 0 :this.statCode.hashCode()));
        result = ((result* 31)+((this.sex == null)? 0 :this.sex.hashCode()));
        result = ((result* 31)+((this.bldgPrcdDesc == null)? 0 :this.bldgPrcdDesc.hashCode()));
        result = ((result* 31)+((this.prcdCode == null)? 0 :this.prcdCode.hashCode()));
        result = ((result* 31)+((this.phoneNumber == null)? 0 :this.phoneNumber.hashCode()));
        result = ((result* 31)+((this.rrcdCode == null)? 0 :this.rrcdCode.hashCode()));
        result = ((result* 31)+((this.bldgCampDesc == null)? 0 :this.bldgCampDesc.hashCode()));
        result = ((result* 31)+((this.phoneArea == null)? 0 :this.phoneArea.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.collCode == null)? 0 :this.collCode.hashCode()));
        result = ((result* 31)+((this.deptCode == null)? 0 :this.deptCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BuildingDefinition100PutResponse) == false) {
            return false;
        }
        BuildingDefinition100PutResponse rhs = ((BuildingDefinition100PutResponse) other);
        return (((((((((((((((((((((((((((((((((this.cntyCode == rhs.cntyCode)||((this.cntyCode!= null)&&this.cntyCode.equals(rhs.cntyCode)))&&((this.streetLine2 == rhs.streetLine2)||((this.streetLine2 != null)&&this.streetLine2 .equals(rhs.streetLine2))))&&((this.streetLine1 == rhs.streetLine1)||((this.streetLine1 != null)&&this.streetLine1 .equals(rhs.streetLine1))))&&((this.parsCode == rhs.parsCode)||((this.parsCode!= null)&&this.parsCode.equals(rhs.parsCode))))&&((this.bldgCntyDesc == rhs.bldgCntyDesc)||((this.bldgCntyDesc!= null)&&this.bldgCntyDesc.equals(rhs.bldgCntyDesc))))&&((this.city == rhs.city)||((this.city!= null)&&this.city.equals(rhs.city))))&&((this.phoneExtension == rhs.phoneExtension)||((this.phoneExtension!= null)&&this.phoneExtension.equals(rhs.phoneExtension))))&&((this.streetLine3 == rhs.streetLine3)||((this.streetLine3 != null)&&this.streetLine3 .equals(rhs.streetLine3))))&&((this.keyNumber == rhs.keyNumber)||((this.keyNumber!= null)&&this.keyNumber.equals(rhs.keyNumber))))&&((this.ctryCodePhone == rhs.ctryCodePhone)||((this.ctryCodePhone!= null)&&this.ctryCodePhone.equals(rhs.ctryCodePhone))))&&((this.capacity == rhs.capacity)||((this.capacity!= null)&&this.capacity.equals(rhs.capacity))))&&((this.bldgRrcdDesc == rhs.bldgRrcdDesc)||((this.bldgRrcdDesc!= null)&&this.bldgRrcdDesc.equals(rhs.bldgRrcdDesc))))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.collDesc == rhs.collDesc)||((this.collDesc!= null)&&this.collDesc.equals(rhs.collDesc))))&&((this.deptDesc == rhs.deptDesc)||((this.deptDesc!= null)&&this.deptDesc.equals(rhs.deptDesc))))&&((this.maximumCapacity == rhs.maximumCapacity)||((this.maximumCapacity!= null)&&this.maximumCapacity.equals(rhs.maximumCapacity))))&&((this.parsDesc == rhs.parsDesc)||((this.parsDesc!= null)&&this.parsDesc.equals(rhs.parsDesc))))&&((this.zip == rhs.zip)||((this.zip!= null)&&this.zip.equals(rhs.zip))))&&((this.bldgStatDesc == rhs.bldgStatDesc)||((this.bldgStatDesc!= null)&&this.bldgStatDesc.equals(rhs.bldgStatDesc))))&&((this.bldgSiteDesc == rhs.bldgSiteDesc)||((this.bldgSiteDesc!= null)&&this.bldgSiteDesc.equals(rhs.bldgSiteDesc))))&&((this.siteCode == rhs.siteCode)||((this.siteCode!= null)&&this.siteCode.equals(rhs.siteCode))))&&((this.statCode == rhs.statCode)||((this.statCode!= null)&&this.statCode.equals(rhs.statCode))))&&((this.sex == rhs.sex)||((this.sex!= null)&&this.sex.equals(rhs.sex))))&&((this.bldgPrcdDesc == rhs.bldgPrcdDesc)||((this.bldgPrcdDesc!= null)&&this.bldgPrcdDesc.equals(rhs.bldgPrcdDesc))))&&((this.prcdCode == rhs.prcdCode)||((this.prcdCode!= null)&&this.prcdCode.equals(rhs.prcdCode))))&&((this.phoneNumber == rhs.phoneNumber)||((this.phoneNumber!= null)&&this.phoneNumber.equals(rhs.phoneNumber))))&&((this.rrcdCode == rhs.rrcdCode)||((this.rrcdCode!= null)&&this.rrcdCode.equals(rhs.rrcdCode))))&&((this.bldgCampDesc == rhs.bldgCampDesc)||((this.bldgCampDesc!= null)&&this.bldgCampDesc.equals(rhs.bldgCampDesc))))&&((this.phoneArea == rhs.phoneArea)||((this.phoneArea!= null)&&this.phoneArea.equals(rhs.phoneArea))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.deptCode == rhs.deptCode)||((this.deptCode!= null)&&this.deptCode.equals(rhs.deptCode))));
    }

}
