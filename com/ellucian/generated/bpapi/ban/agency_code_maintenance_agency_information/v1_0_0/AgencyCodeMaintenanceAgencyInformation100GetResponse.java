
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
    "agcyCodePred",
    "contactEmail",
    "contactPhoneArea",
    "currentNtypDesc",
    "activityDate",
    "addrSeqno",
    "contact",
    "statusInd",
    "contactPhoneNumber",
    "spridenNtypCode",
    "contactPhoneExt",
    "addrType",
    "namePred"
})
@Generated("jsonschema2pojo")
public class AgencyCodeMaintenanceAgencyInformation100GetResponse {

    /**
     * Predecessor
     * <p>
     * 
     * 
     */
    @JsonProperty("agcyCodePred")
    private String agcyCodePred;
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
     * Area Code
     * <p>
     * Lineage reference object : FTVAGCY_CONTACT_PHONE_AREA
     * 
     */
    @JsonProperty("contactPhoneArea")
    @JsonPropertyDescription("Lineage reference object : FTVAGCY_CONTACT_PHONE_AREA")
    private String contactPhoneArea;
    @JsonProperty("currentNtypDesc")
    private String currentNtypDesc;
    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVAGCY_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : FTVAGCY_ACTIVITY_DATE")
    private Date activityDate;
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
     * Contact
     * <p>
     * Lineage reference object : FTVAGCY_CONTACT
     * 
     */
    @JsonProperty("contact")
    @JsonPropertyDescription("Lineage reference object : FTVAGCY_CONTACT")
    private String contact;
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
     * Phone Number
     * <p>
     * Lineage reference object : FTVAGCY_CONTACT_PHONE_NUMBER
     * 
     */
    @JsonProperty("contactPhoneNumber")
    @JsonPropertyDescription("Lineage reference object : FTVAGCY_CONTACT_PHONE_NUMBER")
    private String contactPhoneNumber;
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
     * Address Type
     * <p>
     * Lineage reference object : FTVAGCY_ADDR_TYPE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("addrType")
    @JsonPropertyDescription("Lineage reference object : FTVAGCY_ADDR_TYPE, Lookup lineage reference object : stvatyp")
    private String addrType;
    @JsonProperty("namePred")
    private String namePred;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Predecessor
     * <p>
     * 
     * 
     */
    @JsonProperty("agcyCodePred")
    public String getAgcyCodePred() {
        return agcyCodePred;
    }

    /**
     * Predecessor
     * <p>
     * 
     * 
     */
    @JsonProperty("agcyCodePred")
    public void setAgcyCodePred(String agcyCodePred) {
        this.agcyCodePred = agcyCodePred;
    }

    public AgencyCodeMaintenanceAgencyInformation100GetResponse withAgcyCodePred(String agcyCodePred) {
        this.agcyCodePred = agcyCodePred;
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

    public AgencyCodeMaintenanceAgencyInformation100GetResponse withContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
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

    public AgencyCodeMaintenanceAgencyInformation100GetResponse withContactPhoneArea(String contactPhoneArea) {
        this.contactPhoneArea = contactPhoneArea;
        return this;
    }

    @JsonProperty("currentNtypDesc")
    public String getCurrentNtypDesc() {
        return currentNtypDesc;
    }

    @JsonProperty("currentNtypDesc")
    public void setCurrentNtypDesc(String currentNtypDesc) {
        this.currentNtypDesc = currentNtypDesc;
    }

    public AgencyCodeMaintenanceAgencyInformation100GetResponse withCurrentNtypDesc(String currentNtypDesc) {
        this.currentNtypDesc = currentNtypDesc;
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

    public AgencyCodeMaintenanceAgencyInformation100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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

    public AgencyCodeMaintenanceAgencyInformation100GetResponse withAddrSeqno(Double addrSeqno) {
        this.addrSeqno = addrSeqno;
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

    public AgencyCodeMaintenanceAgencyInformation100GetResponse withContact(String contact) {
        this.contact = contact;
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

    public AgencyCodeMaintenanceAgencyInformation100GetResponse withStatusInd(String statusInd) {
        this.statusInd = statusInd;
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

    public AgencyCodeMaintenanceAgencyInformation100GetResponse withContactPhoneNumber(String contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
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

    public AgencyCodeMaintenanceAgencyInformation100GetResponse withSpridenNtypCode(String spridenNtypCode) {
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

    public AgencyCodeMaintenanceAgencyInformation100GetResponse withContactPhoneExt(String contactPhoneExt) {
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

    public AgencyCodeMaintenanceAgencyInformation100GetResponse withAddrType(String addrType) {
        this.addrType = addrType;
        return this;
    }

    @JsonProperty("namePred")
    public String getNamePred() {
        return namePred;
    }

    @JsonProperty("namePred")
    public void setNamePred(String namePred) {
        this.namePred = namePred;
    }

    public AgencyCodeMaintenanceAgencyInformation100GetResponse withNamePred(String namePred) {
        this.namePred = namePred;
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

    public AgencyCodeMaintenanceAgencyInformation100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AgencyCodeMaintenanceAgencyInformation100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("agcyCodePred");
        sb.append('=');
        sb.append(((this.agcyCodePred == null)?"<null>":this.agcyCodePred));
        sb.append(',');
        sb.append("contactEmail");
        sb.append('=');
        sb.append(((this.contactEmail == null)?"<null>":this.contactEmail));
        sb.append(',');
        sb.append("contactPhoneArea");
        sb.append('=');
        sb.append(((this.contactPhoneArea == null)?"<null>":this.contactPhoneArea));
        sb.append(',');
        sb.append("currentNtypDesc");
        sb.append('=');
        sb.append(((this.currentNtypDesc == null)?"<null>":this.currentNtypDesc));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("addrSeqno");
        sb.append('=');
        sb.append(((this.addrSeqno == null)?"<null>":this.addrSeqno));
        sb.append(',');
        sb.append("contact");
        sb.append('=');
        sb.append(((this.contact == null)?"<null>":this.contact));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("contactPhoneNumber");
        sb.append('=');
        sb.append(((this.contactPhoneNumber == null)?"<null>":this.contactPhoneNumber));
        sb.append(',');
        sb.append("spridenNtypCode");
        sb.append('=');
        sb.append(((this.spridenNtypCode == null)?"<null>":this.spridenNtypCode));
        sb.append(',');
        sb.append("contactPhoneExt");
        sb.append('=');
        sb.append(((this.contactPhoneExt == null)?"<null>":this.contactPhoneExt));
        sb.append(',');
        sb.append("addrType");
        sb.append('=');
        sb.append(((this.addrType == null)?"<null>":this.addrType));
        sb.append(',');
        sb.append("namePred");
        sb.append('=');
        sb.append(((this.namePred == null)?"<null>":this.namePred));
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
        result = ((result* 31)+((this.agcyCodePred == null)? 0 :this.agcyCodePred.hashCode()));
        result = ((result* 31)+((this.contactEmail == null)? 0 :this.contactEmail.hashCode()));
        result = ((result* 31)+((this.contactPhoneArea == null)? 0 :this.contactPhoneArea.hashCode()));
        result = ((result* 31)+((this.currentNtypDesc == null)? 0 :this.currentNtypDesc.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.addrSeqno == null)? 0 :this.addrSeqno.hashCode()));
        result = ((result* 31)+((this.contact == null)? 0 :this.contact.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.contactPhoneNumber == null)? 0 :this.contactPhoneNumber.hashCode()));
        result = ((result* 31)+((this.spridenNtypCode == null)? 0 :this.spridenNtypCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.contactPhoneExt == null)? 0 :this.contactPhoneExt.hashCode()));
        result = ((result* 31)+((this.addrType == null)? 0 :this.addrType.hashCode()));
        result = ((result* 31)+((this.namePred == null)? 0 :this.namePred.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AgencyCodeMaintenanceAgencyInformation100GetResponse) == false) {
            return false;
        }
        AgencyCodeMaintenanceAgencyInformation100GetResponse rhs = ((AgencyCodeMaintenanceAgencyInformation100GetResponse) other);
        return (((((((((((((((this.agcyCodePred == rhs.agcyCodePred)||((this.agcyCodePred!= null)&&this.agcyCodePred.equals(rhs.agcyCodePred)))&&((this.contactEmail == rhs.contactEmail)||((this.contactEmail!= null)&&this.contactEmail.equals(rhs.contactEmail))))&&((this.contactPhoneArea == rhs.contactPhoneArea)||((this.contactPhoneArea!= null)&&this.contactPhoneArea.equals(rhs.contactPhoneArea))))&&((this.currentNtypDesc == rhs.currentNtypDesc)||((this.currentNtypDesc!= null)&&this.currentNtypDesc.equals(rhs.currentNtypDesc))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.addrSeqno == rhs.addrSeqno)||((this.addrSeqno!= null)&&this.addrSeqno.equals(rhs.addrSeqno))))&&((this.contact == rhs.contact)||((this.contact!= null)&&this.contact.equals(rhs.contact))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.contactPhoneNumber == rhs.contactPhoneNumber)||((this.contactPhoneNumber!= null)&&this.contactPhoneNumber.equals(rhs.contactPhoneNumber))))&&((this.spridenNtypCode == rhs.spridenNtypCode)||((this.spridenNtypCode!= null)&&this.spridenNtypCode.equals(rhs.spridenNtypCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.contactPhoneExt == rhs.contactPhoneExt)||((this.contactPhoneExt!= null)&&this.contactPhoneExt.equals(rhs.contactPhoneExt))))&&((this.addrType == rhs.addrType)||((this.addrType!= null)&&this.addrType.equals(rhs.addrType))))&&((this.namePred == rhs.namePred)||((this.namePred!= null)&&this.namePred.equals(rhs.namePred))));
    }

}
