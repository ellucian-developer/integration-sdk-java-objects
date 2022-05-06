
package com.ellucian.generated.bpapi.ban.person_comments.v1_0_0;

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
    "date",
    "contactDescription",
    "origDescription",
    "contactDate",
    "contactToTime",
    "cmttCode",
    "userId",
    "origCode",
    "textNar",
    "activityDate",
    "cmttDescription",
    "confidentialInd",
    "ctypCode",
    "text",
    "contactFromTime"
})
@Generated("jsonschema2pojo")
public class PersonComments100PutResponse {

    /**
     * Add Date
     * <p>
     * Lineage reference object : SPRCMNT_DATE
     * 
     */
    @JsonProperty("date")
    @JsonPropertyDescription("Lineage reference object : SPRCMNT_DATE")
    private Date date;
    @JsonProperty("contactDescription")
    private String contactDescription;
    @JsonProperty("origDescription")
    private String origDescription;
    /**
     * Contact Date
     * <p>
     * Lineage reference object : SPRCMNT_CONTACT_DATE
     * 
     */
    @JsonProperty("contactDate")
    @JsonPropertyDescription("Lineage reference object : SPRCMNT_CONTACT_DATE")
    private Date contactDate;
    /**
     * To Time
     * <p>
     * Lineage reference object : SPRCMNT_CONTACT_TO_TIME
     * 
     */
    @JsonProperty("contactToTime")
    @JsonPropertyDescription("Lineage reference object : SPRCMNT_CONTACT_TO_TIME")
    private Double contactToTime;
    /**
     * Comment Type
     * <p>
     * Lineage reference object : SPRCMNT_CMTT_CODE, Lookup lineage reference object : stvcmtt
     * (Required)
     * 
     */
    @JsonProperty("cmttCode")
    @JsonPropertyDescription("Lineage reference object : SPRCMNT_CMTT_CODE, Lookup lineage reference object : stvcmtt")
    private String cmttCode;
    /**
     * Last Updated by
     * <p>
     * Lineage reference object : SPRCMNT_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SPRCMNT_USER_ID")
    private String userId;
    /**
     * Originator
     * <p>
     * Lineage reference object : SPRCMNT_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("origCode")
    @JsonPropertyDescription("Lineage reference object : SPRCMNT_ORIG_CODE, Lookup lineage reference object : stvorig")
    private String origCode;
    /**
     * Narrative Comments
     * <p>
     * Lineage reference object : SPRCMNT_TEXT_NAR
     * 
     */
    @JsonProperty("textNar")
    @JsonPropertyDescription("Lineage reference object : SPRCMNT_TEXT_NAR")
    private String textNar;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SPRCMNT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SPRCMNT_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Comment Type Description
     * <p>
     * 
     * 
     */
    @JsonProperty("cmttDescription")
    private String cmttDescription;
    /**
     * Confidentiality
     * <p>
     * Lineage reference object : SPRCMNT_CONFIDENTIAL_IND
     * 
     */
    @JsonProperty("confidentialInd")
    @JsonPropertyDescription("Lineage reference object : SPRCMNT_CONFIDENTIAL_IND")
    private String confidentialInd;
    /**
     * Contact
     * <p>
     * Lineage reference object : SPRCMNT_CTYP_CODE, Lookup lineage reference object : stvctyp
     * 
     */
    @JsonProperty("ctypCode")
    @JsonPropertyDescription("Lineage reference object : SPRCMNT_CTYP_CODE, Lookup lineage reference object : stvctyp")
    private String ctypCode;
    /**
     * Comments
     * <p>
     * Lineage reference object : SPRCMNT_TEXT
     * 
     */
    @JsonProperty("text")
    @JsonPropertyDescription("Lineage reference object : SPRCMNT_TEXT")
    private String text;
    /**
     * From Time
     * <p>
     * Lineage reference object : SPRCMNT_CONTACT_FROM_TIME
     * 
     */
    @JsonProperty("contactFromTime")
    @JsonPropertyDescription("Lineage reference object : SPRCMNT_CONTACT_FROM_TIME")
    private Double contactFromTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Add Date
     * <p>
     * Lineage reference object : SPRCMNT_DATE
     * 
     */
    @JsonProperty("date")
    public Date getDate() {
        return date;
    }

    /**
     * Add Date
     * <p>
     * Lineage reference object : SPRCMNT_DATE
     * 
     */
    @JsonProperty("date")
    public void setDate(Date date) {
        this.date = date;
    }

    public PersonComments100PutResponse withDate(Date date) {
        this.date = date;
        return this;
    }

    @JsonProperty("contactDescription")
    public String getContactDescription() {
        return contactDescription;
    }

    @JsonProperty("contactDescription")
    public void setContactDescription(String contactDescription) {
        this.contactDescription = contactDescription;
    }

    public PersonComments100PutResponse withContactDescription(String contactDescription) {
        this.contactDescription = contactDescription;
        return this;
    }

    @JsonProperty("origDescription")
    public String getOrigDescription() {
        return origDescription;
    }

    @JsonProperty("origDescription")
    public void setOrigDescription(String origDescription) {
        this.origDescription = origDescription;
    }

    public PersonComments100PutResponse withOrigDescription(String origDescription) {
        this.origDescription = origDescription;
        return this;
    }

    /**
     * Contact Date
     * <p>
     * Lineage reference object : SPRCMNT_CONTACT_DATE
     * 
     */
    @JsonProperty("contactDate")
    public Date getContactDate() {
        return contactDate;
    }

    /**
     * Contact Date
     * <p>
     * Lineage reference object : SPRCMNT_CONTACT_DATE
     * 
     */
    @JsonProperty("contactDate")
    public void setContactDate(Date contactDate) {
        this.contactDate = contactDate;
    }

    public PersonComments100PutResponse withContactDate(Date contactDate) {
        this.contactDate = contactDate;
        return this;
    }

    /**
     * To Time
     * <p>
     * Lineage reference object : SPRCMNT_CONTACT_TO_TIME
     * 
     */
    @JsonProperty("contactToTime")
    public Double getContactToTime() {
        return contactToTime;
    }

    /**
     * To Time
     * <p>
     * Lineage reference object : SPRCMNT_CONTACT_TO_TIME
     * 
     */
    @JsonProperty("contactToTime")
    public void setContactToTime(Double contactToTime) {
        this.contactToTime = contactToTime;
    }

    public PersonComments100PutResponse withContactToTime(Double contactToTime) {
        this.contactToTime = contactToTime;
        return this;
    }

    /**
     * Comment Type
     * <p>
     * Lineage reference object : SPRCMNT_CMTT_CODE, Lookup lineage reference object : stvcmtt
     * (Required)
     * 
     */
    @JsonProperty("cmttCode")
    public String getCmttCode() {
        return cmttCode;
    }

    /**
     * Comment Type
     * <p>
     * Lineage reference object : SPRCMNT_CMTT_CODE, Lookup lineage reference object : stvcmtt
     * (Required)
     * 
     */
    @JsonProperty("cmttCode")
    public void setCmttCode(String cmttCode) {
        this.cmttCode = cmttCode;
    }

    public PersonComments100PutResponse withCmttCode(String cmttCode) {
        this.cmttCode = cmttCode;
        return this;
    }

    /**
     * Last Updated by
     * <p>
     * Lineage reference object : SPRCMNT_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Last Updated by
     * <p>
     * Lineage reference object : SPRCMNT_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public PersonComments100PutResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Originator
     * <p>
     * Lineage reference object : SPRCMNT_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("origCode")
    public String getOrigCode() {
        return origCode;
    }

    /**
     * Originator
     * <p>
     * Lineage reference object : SPRCMNT_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("origCode")
    public void setOrigCode(String origCode) {
        this.origCode = origCode;
    }

    public PersonComments100PutResponse withOrigCode(String origCode) {
        this.origCode = origCode;
        return this;
    }

    /**
     * Narrative Comments
     * <p>
     * Lineage reference object : SPRCMNT_TEXT_NAR
     * 
     */
    @JsonProperty("textNar")
    public String getTextNar() {
        return textNar;
    }

    /**
     * Narrative Comments
     * <p>
     * Lineage reference object : SPRCMNT_TEXT_NAR
     * 
     */
    @JsonProperty("textNar")
    public void setTextNar(String textNar) {
        this.textNar = textNar;
    }

    public PersonComments100PutResponse withTextNar(String textNar) {
        this.textNar = textNar;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SPRCMNT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SPRCMNT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public PersonComments100PutResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Comment Type Description
     * <p>
     * 
     * 
     */
    @JsonProperty("cmttDescription")
    public String getCmttDescription() {
        return cmttDescription;
    }

    /**
     * Comment Type Description
     * <p>
     * 
     * 
     */
    @JsonProperty("cmttDescription")
    public void setCmttDescription(String cmttDescription) {
        this.cmttDescription = cmttDescription;
    }

    public PersonComments100PutResponse withCmttDescription(String cmttDescription) {
        this.cmttDescription = cmttDescription;
        return this;
    }

    /**
     * Confidentiality
     * <p>
     * Lineage reference object : SPRCMNT_CONFIDENTIAL_IND
     * 
     */
    @JsonProperty("confidentialInd")
    public String getConfidentialInd() {
        return confidentialInd;
    }

    /**
     * Confidentiality
     * <p>
     * Lineage reference object : SPRCMNT_CONFIDENTIAL_IND
     * 
     */
    @JsonProperty("confidentialInd")
    public void setConfidentialInd(String confidentialInd) {
        this.confidentialInd = confidentialInd;
    }

    public PersonComments100PutResponse withConfidentialInd(String confidentialInd) {
        this.confidentialInd = confidentialInd;
        return this;
    }

    /**
     * Contact
     * <p>
     * Lineage reference object : SPRCMNT_CTYP_CODE, Lookup lineage reference object : stvctyp
     * 
     */
    @JsonProperty("ctypCode")
    public String getCtypCode() {
        return ctypCode;
    }

    /**
     * Contact
     * <p>
     * Lineage reference object : SPRCMNT_CTYP_CODE, Lookup lineage reference object : stvctyp
     * 
     */
    @JsonProperty("ctypCode")
    public void setCtypCode(String ctypCode) {
        this.ctypCode = ctypCode;
    }

    public PersonComments100PutResponse withCtypCode(String ctypCode) {
        this.ctypCode = ctypCode;
        return this;
    }

    /**
     * Comments
     * <p>
     * Lineage reference object : SPRCMNT_TEXT
     * 
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * Comments
     * <p>
     * Lineage reference object : SPRCMNT_TEXT
     * 
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    public PersonComments100PutResponse withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * From Time
     * <p>
     * Lineage reference object : SPRCMNT_CONTACT_FROM_TIME
     * 
     */
    @JsonProperty("contactFromTime")
    public Double getContactFromTime() {
        return contactFromTime;
    }

    /**
     * From Time
     * <p>
     * Lineage reference object : SPRCMNT_CONTACT_FROM_TIME
     * 
     */
    @JsonProperty("contactFromTime")
    public void setContactFromTime(Double contactFromTime) {
        this.contactFromTime = contactFromTime;
    }

    public PersonComments100PutResponse withContactFromTime(Double contactFromTime) {
        this.contactFromTime = contactFromTime;
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

    public PersonComments100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PersonComments100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
        sb.append(',');
        sb.append("contactDescription");
        sb.append('=');
        sb.append(((this.contactDescription == null)?"<null>":this.contactDescription));
        sb.append(',');
        sb.append("origDescription");
        sb.append('=');
        sb.append(((this.origDescription == null)?"<null>":this.origDescription));
        sb.append(',');
        sb.append("contactDate");
        sb.append('=');
        sb.append(((this.contactDate == null)?"<null>":this.contactDate));
        sb.append(',');
        sb.append("contactToTime");
        sb.append('=');
        sb.append(((this.contactToTime == null)?"<null>":this.contactToTime));
        sb.append(',');
        sb.append("cmttCode");
        sb.append('=');
        sb.append(((this.cmttCode == null)?"<null>":this.cmttCode));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("origCode");
        sb.append('=');
        sb.append(((this.origCode == null)?"<null>":this.origCode));
        sb.append(',');
        sb.append("textNar");
        sb.append('=');
        sb.append(((this.textNar == null)?"<null>":this.textNar));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("cmttDescription");
        sb.append('=');
        sb.append(((this.cmttDescription == null)?"<null>":this.cmttDescription));
        sb.append(',');
        sb.append("confidentialInd");
        sb.append('=');
        sb.append(((this.confidentialInd == null)?"<null>":this.confidentialInd));
        sb.append(',');
        sb.append("ctypCode");
        sb.append('=');
        sb.append(((this.ctypCode == null)?"<null>":this.ctypCode));
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
        sb.append(',');
        sb.append("contactFromTime");
        sb.append('=');
        sb.append(((this.contactFromTime == null)?"<null>":this.contactFromTime));
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
        result = ((result* 31)+((this.date == null)? 0 :this.date.hashCode()));
        result = ((result* 31)+((this.contactDescription == null)? 0 :this.contactDescription.hashCode()));
        result = ((result* 31)+((this.origDescription == null)? 0 :this.origDescription.hashCode()));
        result = ((result* 31)+((this.contactDate == null)? 0 :this.contactDate.hashCode()));
        result = ((result* 31)+((this.contactToTime == null)? 0 :this.contactToTime.hashCode()));
        result = ((result* 31)+((this.cmttCode == null)? 0 :this.cmttCode.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.origCode == null)? 0 :this.origCode.hashCode()));
        result = ((result* 31)+((this.textNar == null)? 0 :this.textNar.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.cmttDescription == null)? 0 :this.cmttDescription.hashCode()));
        result = ((result* 31)+((this.confidentialInd == null)? 0 :this.confidentialInd.hashCode()));
        result = ((result* 31)+((this.ctypCode == null)? 0 :this.ctypCode.hashCode()));
        result = ((result* 31)+((this.text == null)? 0 :this.text.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.contactFromTime == null)? 0 :this.contactFromTime.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PersonComments100PutResponse) == false) {
            return false;
        }
        PersonComments100PutResponse rhs = ((PersonComments100PutResponse) other);
        return (((((((((((((((((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date)))&&((this.contactDescription == rhs.contactDescription)||((this.contactDescription!= null)&&this.contactDescription.equals(rhs.contactDescription))))&&((this.origDescription == rhs.origDescription)||((this.origDescription!= null)&&this.origDescription.equals(rhs.origDescription))))&&((this.contactDate == rhs.contactDate)||((this.contactDate!= null)&&this.contactDate.equals(rhs.contactDate))))&&((this.contactToTime == rhs.contactToTime)||((this.contactToTime!= null)&&this.contactToTime.equals(rhs.contactToTime))))&&((this.cmttCode == rhs.cmttCode)||((this.cmttCode!= null)&&this.cmttCode.equals(rhs.cmttCode))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.origCode == rhs.origCode)||((this.origCode!= null)&&this.origCode.equals(rhs.origCode))))&&((this.textNar == rhs.textNar)||((this.textNar!= null)&&this.textNar.equals(rhs.textNar))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.cmttDescription == rhs.cmttDescription)||((this.cmttDescription!= null)&&this.cmttDescription.equals(rhs.cmttDescription))))&&((this.confidentialInd == rhs.confidentialInd)||((this.confidentialInd!= null)&&this.confidentialInd.equals(rhs.confidentialInd))))&&((this.ctypCode == rhs.ctypCode)||((this.ctypCode!= null)&&this.ctypCode.equals(rhs.ctypCode))))&&((this.text == rhs.text)||((this.text!= null)&&this.text.equals(rhs.text))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.contactFromTime == rhs.contactFromTime)||((this.contactFromTime!= null)&&this.contactFromTime.equals(rhs.contactFromTime))));
    }

}
