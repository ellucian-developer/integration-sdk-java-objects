
package com.ellucian.generated.bpapi.ban.agency_code_maintenance_agency_information.v1_0_0;

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
    "criteria.spridenNtypCode",
    "criteria.activityDate",
    "criteria.statusInd",
    "contactEmail",
    "criteria.addrType",
    "contactPhoneArea",
    "criteria.ctryCodePhone",
    "criteria.contact",
    "criteria.contactPhoneExt",
    "ctryCodePhone",
    "criteria.contactEmail",
    "addrSeqno",
    "criteria.contactPhoneArea",
    "statusInd",
    "contact",
    "spridenNtypCode",
    "contactPhoneNumber",
    "id",
    "criteria.contactPhoneNumber",
    "criteria.addrSeqno",
    "contactPhoneExt",
    "addrType"
})
@Generated("jsonschema2pojo")
public class AgencyCodeMaintenanceAgencyInformation100PutRequest {

    /**
     * Name Type
     * <p>
     * Lookup lineage reference object : gtvntyp
     * 
     */
    @JsonProperty("criteria.spridenNtypCode")
    @JsonPropertyDescription("Lookup lineage reference object : gtvntyp")
    private String criteriaSpridenNtypCode;
    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVAGCY_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : FTVAGCY_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVAGCY_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    @JsonPropertyDescription("Lineage reference object : FTVAGCY_STATUS_IND")
    private String criteriaStatusInd;
    /**
     * Contact E-mail
     * <p>
     * Lineage reference object : FTVAGCY_CONTACT_EMAIL
     * 
     */
    @JsonProperty("contactEmail")
    @JsonPropertyDescription("Lineage reference object : FTVAGCY_CONTACT_EMAIL")
    private String contactEmail;
    /**
     * Address Type
     * <p>
     * Lineage reference object : FTVAGCY_ADDR_TYPE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("criteria.addrType")
    @JsonPropertyDescription("Lineage reference object : FTVAGCY_ADDR_TYPE, Lookup lineage reference object : stvatyp")
    private String criteriaAddrType;
    /**
     * Area Code
     * <p>
     * Lineage reference object : FTVAGCY_CONTACT_PHONE_AREA
     * 
     */
    @JsonProperty("contactPhoneArea")
    @JsonPropertyDescription("Lineage reference object : FTVAGCY_CONTACT_PHONE_AREA")
    private String contactPhoneArea;
    /**
     * Country Code
     * <p>
     * Lineage reference object : FTVAGCY_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("criteria.ctryCodePhone")
    @JsonPropertyDescription("Lineage reference object : FTVAGCY_CTRY_CODE_PHONE")
    private String criteriaCtryCodePhone;
    /**
     * Contact
     * <p>
     * Lineage reference object : FTVAGCY_CONTACT
     * 
     */
    @JsonProperty("criteria.contact")
    @JsonPropertyDescription("Lineage reference object : FTVAGCY_CONTACT")
    private String criteriaContact;
    /**
     * Extension
     * <p>
     * Lineage reference object : FTVAGCY_CONTACT_PHONE_EXT
     * 
     */
    @JsonProperty("criteria.contactPhoneExt")
    @JsonPropertyDescription("Lineage reference object : FTVAGCY_CONTACT_PHONE_EXT")
    private String criteriaContactPhoneExt;
    /**
     * Country Code
     * <p>
     * Lineage reference object : FTVAGCY_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("ctryCodePhone")
    @JsonPropertyDescription("Lineage reference object : FTVAGCY_CTRY_CODE_PHONE")
    private String ctryCodePhone;
    /**
     * Contact E-mail
     * <p>
     * Lineage reference object : FTVAGCY_CONTACT_EMAIL
     * 
     */
    @JsonProperty("criteria.contactEmail")
    @JsonPropertyDescription("Lineage reference object : FTVAGCY_CONTACT_EMAIL")
    private String criteriaContactEmail;
    /**
     * Sequence Number
     * <p>
     * Lineage reference object : FTVAGCY_ADDR_SEQNO
     * 
     */
    @JsonProperty("addrSeqno")
    @JsonPropertyDescription("Lineage reference object : FTVAGCY_ADDR_SEQNO")
    private Double addrSeqno;
    /**
     * Area Code
     * <p>
     * Lineage reference object : FTVAGCY_CONTACT_PHONE_AREA
     * 
     */
    @JsonProperty("criteria.contactPhoneArea")
    @JsonPropertyDescription("Lineage reference object : FTVAGCY_CONTACT_PHONE_AREA")
    private String criteriaContactPhoneArea;
    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVAGCY_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : FTVAGCY_STATUS_IND")
    private String statusInd;
    /**
     * Contact
     * <p>
     * Lineage reference object : FTVAGCY_CONTACT
     * 
     */
    @JsonProperty("contact")
    @JsonPropertyDescription("Lineage reference object : FTVAGCY_CONTACT")
    private String contact;
    /**
     * Name Type
     * <p>
     * Lookup lineage reference object : gtvntyp
     * 
     */
    @JsonProperty("spridenNtypCode")
    @JsonPropertyDescription("Lookup lineage reference object : gtvntyp")
    private String spridenNtypCode;
    /**
     * Phone Number
     * <p>
     * Lineage reference object : FTVAGCY_CONTACT_PHONE_NUMBER
     * 
     */
    @JsonProperty("contactPhoneNumber")
    @JsonPropertyDescription("Lineage reference object : FTVAGCY_CONTACT_PHONE_NUMBER")
    private String contactPhoneNumber;
    /**
     * Agency
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
    /**
     * Phone Number
     * <p>
     * Lineage reference object : FTVAGCY_CONTACT_PHONE_NUMBER
     * 
     */
    @JsonProperty("criteria.contactPhoneNumber")
    @JsonPropertyDescription("Lineage reference object : FTVAGCY_CONTACT_PHONE_NUMBER")
    private String criteriaContactPhoneNumber;
    /**
     * Sequence Number
     * <p>
     * Lineage reference object : FTVAGCY_ADDR_SEQNO
     * 
     */
    @JsonProperty("criteria.addrSeqno")
    @JsonPropertyDescription("Lineage reference object : FTVAGCY_ADDR_SEQNO")
    private Double criteriaAddrSeqno;
    /**
     * Extension
     * <p>
     * Lineage reference object : FTVAGCY_CONTACT_PHONE_EXT
     * 
     */
    @JsonProperty("contactPhoneExt")
    @JsonPropertyDescription("Lineage reference object : FTVAGCY_CONTACT_PHONE_EXT")
    private String contactPhoneExt;
    /**
     * Address Type
     * <p>
     * Lineage reference object : FTVAGCY_ADDR_TYPE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("addrType")
    @JsonPropertyDescription("Lineage reference object : FTVAGCY_ADDR_TYPE, Lookup lineage reference object : stvatyp")
    private String addrType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Name Type
     * <p>
     * Lookup lineage reference object : gtvntyp
     * 
     */
    @JsonProperty("criteria.spridenNtypCode")
    public String getCriteriaSpridenNtypCode() {
        return criteriaSpridenNtypCode;
    }

    /**
     * Name Type
     * <p>
     * Lookup lineage reference object : gtvntyp
     * 
     */
    @JsonProperty("criteria.spridenNtypCode")
    public void setCriteriaSpridenNtypCode(String criteriaSpridenNtypCode) {
        this.criteriaSpridenNtypCode = criteriaSpridenNtypCode;
    }

    public AgencyCodeMaintenanceAgencyInformation100PutRequest withCriteriaSpridenNtypCode(String criteriaSpridenNtypCode) {
        this.criteriaSpridenNtypCode = criteriaSpridenNtypCode;
        return this;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVAGCY_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVAGCY_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public AgencyCodeMaintenanceAgencyInformation100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVAGCY_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    public String getCriteriaStatusInd() {
        return criteriaStatusInd;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVAGCY_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    public void setCriteriaStatusInd(String criteriaStatusInd) {
        this.criteriaStatusInd = criteriaStatusInd;
    }

    public AgencyCodeMaintenanceAgencyInformation100PutRequest withCriteriaStatusInd(String criteriaStatusInd) {
        this.criteriaStatusInd = criteriaStatusInd;
        return this;
    }

    /**
     * Contact E-mail
     * <p>
     * Lineage reference object : FTVAGCY_CONTACT_EMAIL
     * 
     */
    @JsonProperty("contactEmail")
    public String getContactEmail() {
        return contactEmail;
    }

    /**
     * Contact E-mail
     * <p>
     * Lineage reference object : FTVAGCY_CONTACT_EMAIL
     * 
     */
    @JsonProperty("contactEmail")
    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public AgencyCodeMaintenanceAgencyInformation100PutRequest withContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : FTVAGCY_ADDR_TYPE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("criteria.addrType")
    public String getCriteriaAddrType() {
        return criteriaAddrType;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : FTVAGCY_ADDR_TYPE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("criteria.addrType")
    public void setCriteriaAddrType(String criteriaAddrType) {
        this.criteriaAddrType = criteriaAddrType;
    }

    public AgencyCodeMaintenanceAgencyInformation100PutRequest withCriteriaAddrType(String criteriaAddrType) {
        this.criteriaAddrType = criteriaAddrType;
        return this;
    }

    /**
     * Area Code
     * <p>
     * Lineage reference object : FTVAGCY_CONTACT_PHONE_AREA
     * 
     */
    @JsonProperty("contactPhoneArea")
    public String getContactPhoneArea() {
        return contactPhoneArea;
    }

    /**
     * Area Code
     * <p>
     * Lineage reference object : FTVAGCY_CONTACT_PHONE_AREA
     * 
     */
    @JsonProperty("contactPhoneArea")
    public void setContactPhoneArea(String contactPhoneArea) {
        this.contactPhoneArea = contactPhoneArea;
    }

    public AgencyCodeMaintenanceAgencyInformation100PutRequest withContactPhoneArea(String contactPhoneArea) {
        this.contactPhoneArea = contactPhoneArea;
        return this;
    }

    /**
     * Country Code
     * <p>
     * Lineage reference object : FTVAGCY_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("criteria.ctryCodePhone")
    public String getCriteriaCtryCodePhone() {
        return criteriaCtryCodePhone;
    }

    /**
     * Country Code
     * <p>
     * Lineage reference object : FTVAGCY_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("criteria.ctryCodePhone")
    public void setCriteriaCtryCodePhone(String criteriaCtryCodePhone) {
        this.criteriaCtryCodePhone = criteriaCtryCodePhone;
    }

    public AgencyCodeMaintenanceAgencyInformation100PutRequest withCriteriaCtryCodePhone(String criteriaCtryCodePhone) {
        this.criteriaCtryCodePhone = criteriaCtryCodePhone;
        return this;
    }

    /**
     * Contact
     * <p>
     * Lineage reference object : FTVAGCY_CONTACT
     * 
     */
    @JsonProperty("criteria.contact")
    public String getCriteriaContact() {
        return criteriaContact;
    }

    /**
     * Contact
     * <p>
     * Lineage reference object : FTVAGCY_CONTACT
     * 
     */
    @JsonProperty("criteria.contact")
    public void setCriteriaContact(String criteriaContact) {
        this.criteriaContact = criteriaContact;
    }

    public AgencyCodeMaintenanceAgencyInformation100PutRequest withCriteriaContact(String criteriaContact) {
        this.criteriaContact = criteriaContact;
        return this;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : FTVAGCY_CONTACT_PHONE_EXT
     * 
     */
    @JsonProperty("criteria.contactPhoneExt")
    public String getCriteriaContactPhoneExt() {
        return criteriaContactPhoneExt;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : FTVAGCY_CONTACT_PHONE_EXT
     * 
     */
    @JsonProperty("criteria.contactPhoneExt")
    public void setCriteriaContactPhoneExt(String criteriaContactPhoneExt) {
        this.criteriaContactPhoneExt = criteriaContactPhoneExt;
    }

    public AgencyCodeMaintenanceAgencyInformation100PutRequest withCriteriaContactPhoneExt(String criteriaContactPhoneExt) {
        this.criteriaContactPhoneExt = criteriaContactPhoneExt;
        return this;
    }

    /**
     * Country Code
     * <p>
     * Lineage reference object : FTVAGCY_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("ctryCodePhone")
    public String getCtryCodePhone() {
        return ctryCodePhone;
    }

    /**
     * Country Code
     * <p>
     * Lineage reference object : FTVAGCY_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("ctryCodePhone")
    public void setCtryCodePhone(String ctryCodePhone) {
        this.ctryCodePhone = ctryCodePhone;
    }

    public AgencyCodeMaintenanceAgencyInformation100PutRequest withCtryCodePhone(String ctryCodePhone) {
        this.ctryCodePhone = ctryCodePhone;
        return this;
    }

    /**
     * Contact E-mail
     * <p>
     * Lineage reference object : FTVAGCY_CONTACT_EMAIL
     * 
     */
    @JsonProperty("criteria.contactEmail")
    public String getCriteriaContactEmail() {
        return criteriaContactEmail;
    }

    /**
     * Contact E-mail
     * <p>
     * Lineage reference object : FTVAGCY_CONTACT_EMAIL
     * 
     */
    @JsonProperty("criteria.contactEmail")
    public void setCriteriaContactEmail(String criteriaContactEmail) {
        this.criteriaContactEmail = criteriaContactEmail;
    }

    public AgencyCodeMaintenanceAgencyInformation100PutRequest withCriteriaContactEmail(String criteriaContactEmail) {
        this.criteriaContactEmail = criteriaContactEmail;
        return this;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : FTVAGCY_ADDR_SEQNO
     * 
     */
    @JsonProperty("addrSeqno")
    public Double getAddrSeqno() {
        return addrSeqno;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : FTVAGCY_ADDR_SEQNO
     * 
     */
    @JsonProperty("addrSeqno")
    public void setAddrSeqno(Double addrSeqno) {
        this.addrSeqno = addrSeqno;
    }

    public AgencyCodeMaintenanceAgencyInformation100PutRequest withAddrSeqno(Double addrSeqno) {
        this.addrSeqno = addrSeqno;
        return this;
    }

    /**
     * Area Code
     * <p>
     * Lineage reference object : FTVAGCY_CONTACT_PHONE_AREA
     * 
     */
    @JsonProperty("criteria.contactPhoneArea")
    public String getCriteriaContactPhoneArea() {
        return criteriaContactPhoneArea;
    }

    /**
     * Area Code
     * <p>
     * Lineage reference object : FTVAGCY_CONTACT_PHONE_AREA
     * 
     */
    @JsonProperty("criteria.contactPhoneArea")
    public void setCriteriaContactPhoneArea(String criteriaContactPhoneArea) {
        this.criteriaContactPhoneArea = criteriaContactPhoneArea;
    }

    public AgencyCodeMaintenanceAgencyInformation100PutRequest withCriteriaContactPhoneArea(String criteriaContactPhoneArea) {
        this.criteriaContactPhoneArea = criteriaContactPhoneArea;
        return this;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVAGCY_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public String getStatusInd() {
        return statusInd;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVAGCY_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public void setStatusInd(String statusInd) {
        this.statusInd = statusInd;
    }

    public AgencyCodeMaintenanceAgencyInformation100PutRequest withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * Contact
     * <p>
     * Lineage reference object : FTVAGCY_CONTACT
     * 
     */
    @JsonProperty("contact")
    public String getContact() {
        return contact;
    }

    /**
     * Contact
     * <p>
     * Lineage reference object : FTVAGCY_CONTACT
     * 
     */
    @JsonProperty("contact")
    public void setContact(String contact) {
        this.contact = contact;
    }

    public AgencyCodeMaintenanceAgencyInformation100PutRequest withContact(String contact) {
        this.contact = contact;
        return this;
    }

    /**
     * Name Type
     * <p>
     * Lookup lineage reference object : gtvntyp
     * 
     */
    @JsonProperty("spridenNtypCode")
    public String getSpridenNtypCode() {
        return spridenNtypCode;
    }

    /**
     * Name Type
     * <p>
     * Lookup lineage reference object : gtvntyp
     * 
     */
    @JsonProperty("spridenNtypCode")
    public void setSpridenNtypCode(String spridenNtypCode) {
        this.spridenNtypCode = spridenNtypCode;
    }

    public AgencyCodeMaintenanceAgencyInformation100PutRequest withSpridenNtypCode(String spridenNtypCode) {
        this.spridenNtypCode = spridenNtypCode;
        return this;
    }

    /**
     * Phone Number
     * <p>
     * Lineage reference object : FTVAGCY_CONTACT_PHONE_NUMBER
     * 
     */
    @JsonProperty("contactPhoneNumber")
    public String getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    /**
     * Phone Number
     * <p>
     * Lineage reference object : FTVAGCY_CONTACT_PHONE_NUMBER
     * 
     */
    @JsonProperty("contactPhoneNumber")
    public void setContactPhoneNumber(String contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
    }

    public AgencyCodeMaintenanceAgencyInformation100PutRequest withContactPhoneNumber(String contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
        return this;
    }

    /**
     * Agency
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * Agency
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public AgencyCodeMaintenanceAgencyInformation100PutRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Phone Number
     * <p>
     * Lineage reference object : FTVAGCY_CONTACT_PHONE_NUMBER
     * 
     */
    @JsonProperty("criteria.contactPhoneNumber")
    public String getCriteriaContactPhoneNumber() {
        return criteriaContactPhoneNumber;
    }

    /**
     * Phone Number
     * <p>
     * Lineage reference object : FTVAGCY_CONTACT_PHONE_NUMBER
     * 
     */
    @JsonProperty("criteria.contactPhoneNumber")
    public void setCriteriaContactPhoneNumber(String criteriaContactPhoneNumber) {
        this.criteriaContactPhoneNumber = criteriaContactPhoneNumber;
    }

    public AgencyCodeMaintenanceAgencyInformation100PutRequest withCriteriaContactPhoneNumber(String criteriaContactPhoneNumber) {
        this.criteriaContactPhoneNumber = criteriaContactPhoneNumber;
        return this;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : FTVAGCY_ADDR_SEQNO
     * 
     */
    @JsonProperty("criteria.addrSeqno")
    public Double getCriteriaAddrSeqno() {
        return criteriaAddrSeqno;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : FTVAGCY_ADDR_SEQNO
     * 
     */
    @JsonProperty("criteria.addrSeqno")
    public void setCriteriaAddrSeqno(Double criteriaAddrSeqno) {
        this.criteriaAddrSeqno = criteriaAddrSeqno;
    }

    public AgencyCodeMaintenanceAgencyInformation100PutRequest withCriteriaAddrSeqno(Double criteriaAddrSeqno) {
        this.criteriaAddrSeqno = criteriaAddrSeqno;
        return this;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : FTVAGCY_CONTACT_PHONE_EXT
     * 
     */
    @JsonProperty("contactPhoneExt")
    public String getContactPhoneExt() {
        return contactPhoneExt;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : FTVAGCY_CONTACT_PHONE_EXT
     * 
     */
    @JsonProperty("contactPhoneExt")
    public void setContactPhoneExt(String contactPhoneExt) {
        this.contactPhoneExt = contactPhoneExt;
    }

    public AgencyCodeMaintenanceAgencyInformation100PutRequest withContactPhoneExt(String contactPhoneExt) {
        this.contactPhoneExt = contactPhoneExt;
        return this;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : FTVAGCY_ADDR_TYPE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("addrType")
    public String getAddrType() {
        return addrType;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : FTVAGCY_ADDR_TYPE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("addrType")
    public void setAddrType(String addrType) {
        this.addrType = addrType;
    }

    public AgencyCodeMaintenanceAgencyInformation100PutRequest withAddrType(String addrType) {
        this.addrType = addrType;
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

    public AgencyCodeMaintenanceAgencyInformation100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AgencyCodeMaintenanceAgencyInformation100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaSpridenNtypCode");
        sb.append('=');
        sb.append(((this.criteriaSpridenNtypCode == null)?"<null>":this.criteriaSpridenNtypCode));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("criteriaStatusInd");
        sb.append('=');
        sb.append(((this.criteriaStatusInd == null)?"<null>":this.criteriaStatusInd));
        sb.append(',');
        sb.append("contactEmail");
        sb.append('=');
        sb.append(((this.contactEmail == null)?"<null>":this.contactEmail));
        sb.append(',');
        sb.append("criteriaAddrType");
        sb.append('=');
        sb.append(((this.criteriaAddrType == null)?"<null>":this.criteriaAddrType));
        sb.append(',');
        sb.append("contactPhoneArea");
        sb.append('=');
        sb.append(((this.contactPhoneArea == null)?"<null>":this.contactPhoneArea));
        sb.append(',');
        sb.append("criteriaCtryCodePhone");
        sb.append('=');
        sb.append(((this.criteriaCtryCodePhone == null)?"<null>":this.criteriaCtryCodePhone));
        sb.append(',');
        sb.append("criteriaContact");
        sb.append('=');
        sb.append(((this.criteriaContact == null)?"<null>":this.criteriaContact));
        sb.append(',');
        sb.append("criteriaContactPhoneExt");
        sb.append('=');
        sb.append(((this.criteriaContactPhoneExt == null)?"<null>":this.criteriaContactPhoneExt));
        sb.append(',');
        sb.append("ctryCodePhone");
        sb.append('=');
        sb.append(((this.ctryCodePhone == null)?"<null>":this.ctryCodePhone));
        sb.append(',');
        sb.append("criteriaContactEmail");
        sb.append('=');
        sb.append(((this.criteriaContactEmail == null)?"<null>":this.criteriaContactEmail));
        sb.append(',');
        sb.append("addrSeqno");
        sb.append('=');
        sb.append(((this.addrSeqno == null)?"<null>":this.addrSeqno));
        sb.append(',');
        sb.append("criteriaContactPhoneArea");
        sb.append('=');
        sb.append(((this.criteriaContactPhoneArea == null)?"<null>":this.criteriaContactPhoneArea));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("contact");
        sb.append('=');
        sb.append(((this.contact == null)?"<null>":this.contact));
        sb.append(',');
        sb.append("spridenNtypCode");
        sb.append('=');
        sb.append(((this.spridenNtypCode == null)?"<null>":this.spridenNtypCode));
        sb.append(',');
        sb.append("contactPhoneNumber");
        sb.append('=');
        sb.append(((this.contactPhoneNumber == null)?"<null>":this.contactPhoneNumber));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("criteriaContactPhoneNumber");
        sb.append('=');
        sb.append(((this.criteriaContactPhoneNumber == null)?"<null>":this.criteriaContactPhoneNumber));
        sb.append(',');
        sb.append("criteriaAddrSeqno");
        sb.append('=');
        sb.append(((this.criteriaAddrSeqno == null)?"<null>":this.criteriaAddrSeqno));
        sb.append(',');
        sb.append("contactPhoneExt");
        sb.append('=');
        sb.append(((this.contactPhoneExt == null)?"<null>":this.contactPhoneExt));
        sb.append(',');
        sb.append("addrType");
        sb.append('=');
        sb.append(((this.addrType == null)?"<null>":this.addrType));
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
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.contactEmail == null)? 0 :this.contactEmail.hashCode()));
        result = ((result* 31)+((this.criteriaContactPhoneArea == null)? 0 :this.criteriaContactPhoneArea.hashCode()));
        result = ((result* 31)+((this.contactPhoneArea == null)? 0 :this.contactPhoneArea.hashCode()));
        result = ((result* 31)+((this.ctryCodePhone == null)? 0 :this.ctryCodePhone.hashCode()));
        result = ((result* 31)+((this.criteriaCtryCodePhone == null)? 0 :this.criteriaCtryCodePhone.hashCode()));
        result = ((result* 31)+((this.criteriaAddrSeqno == null)? 0 :this.criteriaAddrSeqno.hashCode()));
        result = ((result* 31)+((this.criteriaStatusInd == null)? 0 :this.criteriaStatusInd.hashCode()));
        result = ((result* 31)+((this.addrSeqno == null)? 0 :this.addrSeqno.hashCode()));
        result = ((result* 31)+((this.criteriaAddrType == null)? 0 :this.criteriaAddrType.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.contact == null)? 0 :this.contact.hashCode()));
        result = ((result* 31)+((this.criteriaContactPhoneExt == null)? 0 :this.criteriaContactPhoneExt.hashCode()));
        result = ((result* 31)+((this.spridenNtypCode == null)? 0 :this.spridenNtypCode.hashCode()));
        result = ((result* 31)+((this.contactPhoneNumber == null)? 0 :this.contactPhoneNumber.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaContactEmail == null)? 0 :this.criteriaContactEmail.hashCode()));
        result = ((result* 31)+((this.criteriaSpridenNtypCode == null)? 0 :this.criteriaSpridenNtypCode.hashCode()));
        result = ((result* 31)+((this.criteriaContact == null)? 0 :this.criteriaContact.hashCode()));
        result = ((result* 31)+((this.criteriaContactPhoneNumber == null)? 0 :this.criteriaContactPhoneNumber.hashCode()));
        result = ((result* 31)+((this.contactPhoneExt == null)? 0 :this.contactPhoneExt.hashCode()));
        result = ((result* 31)+((this.addrType == null)? 0 :this.addrType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AgencyCodeMaintenanceAgencyInformation100PutRequest) == false) {
            return false;
        }
        AgencyCodeMaintenanceAgencyInformation100PutRequest rhs = ((AgencyCodeMaintenanceAgencyInformation100PutRequest) other);
        return ((((((((((((((((((((((((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate)))&&((this.contactEmail == rhs.contactEmail)||((this.contactEmail!= null)&&this.contactEmail.equals(rhs.contactEmail))))&&((this.criteriaContactPhoneArea == rhs.criteriaContactPhoneArea)||((this.criteriaContactPhoneArea!= null)&&this.criteriaContactPhoneArea.equals(rhs.criteriaContactPhoneArea))))&&((this.contactPhoneArea == rhs.contactPhoneArea)||((this.contactPhoneArea!= null)&&this.contactPhoneArea.equals(rhs.contactPhoneArea))))&&((this.ctryCodePhone == rhs.ctryCodePhone)||((this.ctryCodePhone!= null)&&this.ctryCodePhone.equals(rhs.ctryCodePhone))))&&((this.criteriaCtryCodePhone == rhs.criteriaCtryCodePhone)||((this.criteriaCtryCodePhone!= null)&&this.criteriaCtryCodePhone.equals(rhs.criteriaCtryCodePhone))))&&((this.criteriaAddrSeqno == rhs.criteriaAddrSeqno)||((this.criteriaAddrSeqno!= null)&&this.criteriaAddrSeqno.equals(rhs.criteriaAddrSeqno))))&&((this.criteriaStatusInd == rhs.criteriaStatusInd)||((this.criteriaStatusInd!= null)&&this.criteriaStatusInd.equals(rhs.criteriaStatusInd))))&&((this.addrSeqno == rhs.addrSeqno)||((this.addrSeqno!= null)&&this.addrSeqno.equals(rhs.addrSeqno))))&&((this.criteriaAddrType == rhs.criteriaAddrType)||((this.criteriaAddrType!= null)&&this.criteriaAddrType.equals(rhs.criteriaAddrType))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.contact == rhs.contact)||((this.contact!= null)&&this.contact.equals(rhs.contact))))&&((this.criteriaContactPhoneExt == rhs.criteriaContactPhoneExt)||((this.criteriaContactPhoneExt!= null)&&this.criteriaContactPhoneExt.equals(rhs.criteriaContactPhoneExt))))&&((this.spridenNtypCode == rhs.spridenNtypCode)||((this.spridenNtypCode!= null)&&this.spridenNtypCode.equals(rhs.spridenNtypCode))))&&((this.contactPhoneNumber == rhs.contactPhoneNumber)||((this.contactPhoneNumber!= null)&&this.contactPhoneNumber.equals(rhs.contactPhoneNumber))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaContactEmail == rhs.criteriaContactEmail)||((this.criteriaContactEmail!= null)&&this.criteriaContactEmail.equals(rhs.criteriaContactEmail))))&&((this.criteriaSpridenNtypCode == rhs.criteriaSpridenNtypCode)||((this.criteriaSpridenNtypCode!= null)&&this.criteriaSpridenNtypCode.equals(rhs.criteriaSpridenNtypCode))))&&((this.criteriaContact == rhs.criteriaContact)||((this.criteriaContact!= null)&&this.criteriaContact.equals(rhs.criteriaContact))))&&((this.criteriaContactPhoneNumber == rhs.criteriaContactPhoneNumber)||((this.criteriaContactPhoneNumber!= null)&&this.criteriaContactPhoneNumber.equals(rhs.criteriaContactPhoneNumber))))&&((this.contactPhoneExt == rhs.contactPhoneExt)||((this.contactPhoneExt!= null)&&this.contactPhoneExt.equals(rhs.contactPhoneExt))))&&((this.addrType == rhs.addrType)||((this.addrType!= null)&&this.addrType.equals(rhs.addrType))));
    }

}
