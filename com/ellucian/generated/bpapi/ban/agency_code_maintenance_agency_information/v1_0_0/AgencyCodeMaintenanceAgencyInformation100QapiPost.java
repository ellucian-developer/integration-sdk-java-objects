
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
    "id",
    "spridenNtypCode",
    "contactPhoneExt",
    "statusInd",
    "contactEmail",
    "contact",
    "addrType",
    "contactPhoneArea",
    "addrSeqno",
    "contactPhoneNumber",
    "ctryCodePhone",
    "activityDate"
})
@Generated("jsonschema2pojo")
public class AgencyCodeMaintenanceAgencyInformation100QapiPost {

    @JsonProperty("id")
    private String id;
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
     * Extension
     * <p>
     * Lineage reference object : FTVAGCY_CONTACT_PHONE_EXT
     * 
     */
    @JsonProperty("contactPhoneExt")
    @JsonPropertyDescription("Lineage reference object : FTVAGCY_CONTACT_PHONE_EXT")
    private String contactPhoneExt;
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
     * Contact E-mail
     * <p>
     * Lineage reference object : FTVAGCY_CONTACT_EMAIL
     * 
     */
    @JsonProperty("contactEmail")
    @JsonPropertyDescription("Lineage reference object : FTVAGCY_CONTACT_EMAIL")
    private String contactEmail;
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
     * Address Type
     * <p>
     * Lineage reference object : FTVAGCY_ADDR_TYPE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("addrType")
    @JsonPropertyDescription("Lineage reference object : FTVAGCY_ADDR_TYPE, Lookup lineage reference object : stvatyp")
    private String addrType;
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
     * Sequence Number
     * <p>
     * Lineage reference object : FTVAGCY_ADDR_SEQNO
     * 
     */
    @JsonProperty("addrSeqno")
    @JsonPropertyDescription("Lineage reference object : FTVAGCY_ADDR_SEQNO")
    private Double addrSeqno;
    /**
     * Phone Number
     * <p>
     * Lineage reference object : FTVAGCY_CONTACT_PHONE_NUMBER
     * 
     */
    @JsonProperty("contactPhoneNumber")
    @JsonPropertyDescription("Lineage reference object : FTVAGCY_CONTACT_PHONE_NUMBER")
    private String contactPhoneNumber;
    @JsonProperty("ctryCodePhone")
    private String ctryCodePhone;
    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVAGCY_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : FTVAGCY_ACTIVITY_DATE")
    private Date activityDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public AgencyCodeMaintenanceAgencyInformation100QapiPost withId(String id) {
        this.id = id;
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

    public AgencyCodeMaintenanceAgencyInformation100QapiPost withSpridenNtypCode(String spridenNtypCode) {
        this.spridenNtypCode = spridenNtypCode;
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

    public AgencyCodeMaintenanceAgencyInformation100QapiPost withContactPhoneExt(String contactPhoneExt) {
        this.contactPhoneExt = contactPhoneExt;
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

    public AgencyCodeMaintenanceAgencyInformation100QapiPost withStatusInd(String statusInd) {
        this.statusInd = statusInd;
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

    public AgencyCodeMaintenanceAgencyInformation100QapiPost withContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
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

    public AgencyCodeMaintenanceAgencyInformation100QapiPost withContact(String contact) {
        this.contact = contact;
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

    public AgencyCodeMaintenanceAgencyInformation100QapiPost withAddrType(String addrType) {
        this.addrType = addrType;
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

    public AgencyCodeMaintenanceAgencyInformation100QapiPost withContactPhoneArea(String contactPhoneArea) {
        this.contactPhoneArea = contactPhoneArea;
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

    public AgencyCodeMaintenanceAgencyInformation100QapiPost withAddrSeqno(Double addrSeqno) {
        this.addrSeqno = addrSeqno;
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

    public AgencyCodeMaintenanceAgencyInformation100QapiPost withContactPhoneNumber(String contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
        return this;
    }

    @JsonProperty("ctryCodePhone")
    public String getCtryCodePhone() {
        return ctryCodePhone;
    }

    @JsonProperty("ctryCodePhone")
    public void setCtryCodePhone(String ctryCodePhone) {
        this.ctryCodePhone = ctryCodePhone;
    }

    public AgencyCodeMaintenanceAgencyInformation100QapiPost withCtryCodePhone(String ctryCodePhone) {
        this.ctryCodePhone = ctryCodePhone;
        return this;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVAGCY_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVAGCY_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public AgencyCodeMaintenanceAgencyInformation100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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

    public AgencyCodeMaintenanceAgencyInformation100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AgencyCodeMaintenanceAgencyInformation100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("spridenNtypCode");
        sb.append('=');
        sb.append(((this.spridenNtypCode == null)?"<null>":this.spridenNtypCode));
        sb.append(',');
        sb.append("contactPhoneExt");
        sb.append('=');
        sb.append(((this.contactPhoneExt == null)?"<null>":this.contactPhoneExt));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("contactEmail");
        sb.append('=');
        sb.append(((this.contactEmail == null)?"<null>":this.contactEmail));
        sb.append(',');
        sb.append("contact");
        sb.append('=');
        sb.append(((this.contact == null)?"<null>":this.contact));
        sb.append(',');
        sb.append("addrType");
        sb.append('=');
        sb.append(((this.addrType == null)?"<null>":this.addrType));
        sb.append(',');
        sb.append("contactPhoneArea");
        sb.append('=');
        sb.append(((this.contactPhoneArea == null)?"<null>":this.contactPhoneArea));
        sb.append(',');
        sb.append("addrSeqno");
        sb.append('=');
        sb.append(((this.addrSeqno == null)?"<null>":this.addrSeqno));
        sb.append(',');
        sb.append("contactPhoneNumber");
        sb.append('=');
        sb.append(((this.contactPhoneNumber == null)?"<null>":this.contactPhoneNumber));
        sb.append(',');
        sb.append("ctryCodePhone");
        sb.append('=');
        sb.append(((this.ctryCodePhone == null)?"<null>":this.ctryCodePhone));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
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
        result = ((result* 31)+((this.contactEmail == null)? 0 :this.contactEmail.hashCode()));
        result = ((result* 31)+((this.contactPhoneArea == null)? 0 :this.contactPhoneArea.hashCode()));
        result = ((result* 31)+((this.ctryCodePhone == null)? 0 :this.ctryCodePhone.hashCode()));
        result = ((result* 31)+((this.addrSeqno == null)? 0 :this.addrSeqno.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.contact == null)? 0 :this.contact.hashCode()));
        result = ((result* 31)+((this.spridenNtypCode == null)? 0 :this.spridenNtypCode.hashCode()));
        result = ((result* 31)+((this.contactPhoneNumber == null)? 0 :this.contactPhoneNumber.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.contactPhoneExt == null)? 0 :this.contactPhoneExt.hashCode()));
        result = ((result* 31)+((this.addrType == null)? 0 :this.addrType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AgencyCodeMaintenanceAgencyInformation100QapiPost) == false) {
            return false;
        }
        AgencyCodeMaintenanceAgencyInformation100QapiPost rhs = ((AgencyCodeMaintenanceAgencyInformation100QapiPost) other);
        return ((((((((((((((this.contactEmail == rhs.contactEmail)||((this.contactEmail!= null)&&this.contactEmail.equals(rhs.contactEmail)))&&((this.contactPhoneArea == rhs.contactPhoneArea)||((this.contactPhoneArea!= null)&&this.contactPhoneArea.equals(rhs.contactPhoneArea))))&&((this.ctryCodePhone == rhs.ctryCodePhone)||((this.ctryCodePhone!= null)&&this.ctryCodePhone.equals(rhs.ctryCodePhone))))&&((this.addrSeqno == rhs.addrSeqno)||((this.addrSeqno!= null)&&this.addrSeqno.equals(rhs.addrSeqno))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.contact == rhs.contact)||((this.contact!= null)&&this.contact.equals(rhs.contact))))&&((this.spridenNtypCode == rhs.spridenNtypCode)||((this.spridenNtypCode!= null)&&this.spridenNtypCode.equals(rhs.spridenNtypCode))))&&((this.contactPhoneNumber == rhs.contactPhoneNumber)||((this.contactPhoneNumber!= null)&&this.contactPhoneNumber.equals(rhs.contactPhoneNumber))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.contactPhoneExt == rhs.contactPhoneExt)||((this.contactPhoneExt!= null)&&this.contactPhoneExt.equals(rhs.contactPhoneExt))))&&((this.addrType == rhs.addrType)||((this.addrType!= null)&&this.addrType.equals(rhs.addrType))));
    }

}
