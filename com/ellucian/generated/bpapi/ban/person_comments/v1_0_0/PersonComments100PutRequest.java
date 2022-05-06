
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
    "criteria.origCode",
    "criteria.activityDate",
    "criteria.userId",
    "criteria.contactToTime",
    "contactDate",
    "cmttCode",
    "criteria.cmttCode",
    "criteria.text",
    "criteria.contactDate",
    "criteria.ctypCode",
    "criteria.contactFromTime",
    "origCode",
    "textNar",
    "criteria.date",
    "criteria.confidentialInd",
    "confidentialInd",
    "ctypCode",
    "id",
    "text"
})
@Generated("jsonschema2pojo")
public class PersonComments100PutRequest {

    /**
     * Add Date
     * <p>
     * Lineage reference object : SPRCMNT_DATE
     * 
     */
    @JsonProperty("date")
    @JsonPropertyDescription("Lineage reference object : SPRCMNT_DATE")
    private Date date;
    /**
     * Originator
     * <p>
     * Lineage reference object : SPRCMNT_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("criteria.origCode")
    @JsonPropertyDescription("Lineage reference object : SPRCMNT_ORIG_CODE, Lookup lineage reference object : stvorig")
    private String criteriaOrigCode;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SPRCMNT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : SPRCMNT_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * Last Updated by
     * <p>
     * Lineage reference object : SPRCMNT_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    @JsonPropertyDescription("Lineage reference object : SPRCMNT_USER_ID")
    private String criteriaUserId;
    /**
     * To Time
     * <p>
     * Lineage reference object : SPRCMNT_CONTACT_TO_TIME
     * 
     */
    @JsonProperty("criteria.contactToTime")
    @JsonPropertyDescription("Lineage reference object : SPRCMNT_CONTACT_TO_TIME")
    private Double criteriaContactToTime;
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
     * Comment Type
     * <p>
     * Lineage reference object : SPRCMNT_CMTT_CODE, Lookup lineage reference object : stvcmtt
     * (Required)
     * 
     */
    @JsonProperty("criteria.cmttCode")
    @JsonPropertyDescription("Lineage reference object : SPRCMNT_CMTT_CODE, Lookup lineage reference object : stvcmtt")
    private String criteriaCmttCode;
    /**
     * Comments
     * <p>
     * Lineage reference object : SPRCMNT_TEXT
     * 
     */
    @JsonProperty("criteria.text")
    @JsonPropertyDescription("Lineage reference object : SPRCMNT_TEXT")
    private String criteriaText;
    /**
     * Contact Date
     * <p>
     * Lineage reference object : SPRCMNT_CONTACT_DATE
     * 
     */
    @JsonProperty("criteria.contactDate")
    @JsonPropertyDescription("Lineage reference object : SPRCMNT_CONTACT_DATE")
    private Date criteriaContactDate;
    /**
     * Contact
     * <p>
     * Lineage reference object : SPRCMNT_CTYP_CODE, Lookup lineage reference object : stvctyp
     * 
     */
    @JsonProperty("criteria.ctypCode")
    @JsonPropertyDescription("Lineage reference object : SPRCMNT_CTYP_CODE, Lookup lineage reference object : stvctyp")
    private String criteriaCtypCode;
    /**
     * From Time
     * <p>
     * Lineage reference object : SPRCMNT_CONTACT_FROM_TIME
     * 
     */
    @JsonProperty("criteria.contactFromTime")
    @JsonPropertyDescription("Lineage reference object : SPRCMNT_CONTACT_FROM_TIME")
    private Double criteriaContactFromTime;
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
     * Add Date
     * <p>
     * Lineage reference object : SPRCMNT_DATE
     * 
     */
    @JsonProperty("criteria.date")
    @JsonPropertyDescription("Lineage reference object : SPRCMNT_DATE")
    private Date criteriaDate;
    /**
     * Confidentiality
     * <p>
     * Lineage reference object : SPRCMNT_CONFIDENTIAL_IND
     * 
     */
    @JsonProperty("criteria.confidentialInd")
    @JsonPropertyDescription("Lineage reference object : SPRCMNT_CONFIDENTIAL_IND")
    private String criteriaConfidentialInd;
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
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
    /**
     * Comments
     * <p>
     * Lineage reference object : SPRCMNT_TEXT
     * 
     */
    @JsonProperty("text")
    @JsonPropertyDescription("Lineage reference object : SPRCMNT_TEXT")
    private String text;
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

    public PersonComments100PutRequest withDate(Date date) {
        this.date = date;
        return this;
    }

    /**
     * Originator
     * <p>
     * Lineage reference object : SPRCMNT_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("criteria.origCode")
    public String getCriteriaOrigCode() {
        return criteriaOrigCode;
    }

    /**
     * Originator
     * <p>
     * Lineage reference object : SPRCMNT_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("criteria.origCode")
    public void setCriteriaOrigCode(String criteriaOrigCode) {
        this.criteriaOrigCode = criteriaOrigCode;
    }

    public PersonComments100PutRequest withCriteriaOrigCode(String criteriaOrigCode) {
        this.criteriaOrigCode = criteriaOrigCode;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SPRCMNT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SPRCMNT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public PersonComments100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * Last Updated by
     * <p>
     * Lineage reference object : SPRCMNT_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public String getCriteriaUserId() {
        return criteriaUserId;
    }

    /**
     * Last Updated by
     * <p>
     * Lineage reference object : SPRCMNT_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public void setCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
    }

    public PersonComments100PutRequest withCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
        return this;
    }

    /**
     * To Time
     * <p>
     * Lineage reference object : SPRCMNT_CONTACT_TO_TIME
     * 
     */
    @JsonProperty("criteria.contactToTime")
    public Double getCriteriaContactToTime() {
        return criteriaContactToTime;
    }

    /**
     * To Time
     * <p>
     * Lineage reference object : SPRCMNT_CONTACT_TO_TIME
     * 
     */
    @JsonProperty("criteria.contactToTime")
    public void setCriteriaContactToTime(Double criteriaContactToTime) {
        this.criteriaContactToTime = criteriaContactToTime;
    }

    public PersonComments100PutRequest withCriteriaContactToTime(Double criteriaContactToTime) {
        this.criteriaContactToTime = criteriaContactToTime;
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

    public PersonComments100PutRequest withContactDate(Date contactDate) {
        this.contactDate = contactDate;
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

    public PersonComments100PutRequest withCmttCode(String cmttCode) {
        this.cmttCode = cmttCode;
        return this;
    }

    /**
     * Comment Type
     * <p>
     * Lineage reference object : SPRCMNT_CMTT_CODE, Lookup lineage reference object : stvcmtt
     * (Required)
     * 
     */
    @JsonProperty("criteria.cmttCode")
    public String getCriteriaCmttCode() {
        return criteriaCmttCode;
    }

    /**
     * Comment Type
     * <p>
     * Lineage reference object : SPRCMNT_CMTT_CODE, Lookup lineage reference object : stvcmtt
     * (Required)
     * 
     */
    @JsonProperty("criteria.cmttCode")
    public void setCriteriaCmttCode(String criteriaCmttCode) {
        this.criteriaCmttCode = criteriaCmttCode;
    }

    public PersonComments100PutRequest withCriteriaCmttCode(String criteriaCmttCode) {
        this.criteriaCmttCode = criteriaCmttCode;
        return this;
    }

    /**
     * Comments
     * <p>
     * Lineage reference object : SPRCMNT_TEXT
     * 
     */
    @JsonProperty("criteria.text")
    public String getCriteriaText() {
        return criteriaText;
    }

    /**
     * Comments
     * <p>
     * Lineage reference object : SPRCMNT_TEXT
     * 
     */
    @JsonProperty("criteria.text")
    public void setCriteriaText(String criteriaText) {
        this.criteriaText = criteriaText;
    }

    public PersonComments100PutRequest withCriteriaText(String criteriaText) {
        this.criteriaText = criteriaText;
        return this;
    }

    /**
     * Contact Date
     * <p>
     * Lineage reference object : SPRCMNT_CONTACT_DATE
     * 
     */
    @JsonProperty("criteria.contactDate")
    public Date getCriteriaContactDate() {
        return criteriaContactDate;
    }

    /**
     * Contact Date
     * <p>
     * Lineage reference object : SPRCMNT_CONTACT_DATE
     * 
     */
    @JsonProperty("criteria.contactDate")
    public void setCriteriaContactDate(Date criteriaContactDate) {
        this.criteriaContactDate = criteriaContactDate;
    }

    public PersonComments100PutRequest withCriteriaContactDate(Date criteriaContactDate) {
        this.criteriaContactDate = criteriaContactDate;
        return this;
    }

    /**
     * Contact
     * <p>
     * Lineage reference object : SPRCMNT_CTYP_CODE, Lookup lineage reference object : stvctyp
     * 
     */
    @JsonProperty("criteria.ctypCode")
    public String getCriteriaCtypCode() {
        return criteriaCtypCode;
    }

    /**
     * Contact
     * <p>
     * Lineage reference object : SPRCMNT_CTYP_CODE, Lookup lineage reference object : stvctyp
     * 
     */
    @JsonProperty("criteria.ctypCode")
    public void setCriteriaCtypCode(String criteriaCtypCode) {
        this.criteriaCtypCode = criteriaCtypCode;
    }

    public PersonComments100PutRequest withCriteriaCtypCode(String criteriaCtypCode) {
        this.criteriaCtypCode = criteriaCtypCode;
        return this;
    }

    /**
     * From Time
     * <p>
     * Lineage reference object : SPRCMNT_CONTACT_FROM_TIME
     * 
     */
    @JsonProperty("criteria.contactFromTime")
    public Double getCriteriaContactFromTime() {
        return criteriaContactFromTime;
    }

    /**
     * From Time
     * <p>
     * Lineage reference object : SPRCMNT_CONTACT_FROM_TIME
     * 
     */
    @JsonProperty("criteria.contactFromTime")
    public void setCriteriaContactFromTime(Double criteriaContactFromTime) {
        this.criteriaContactFromTime = criteriaContactFromTime;
    }

    public PersonComments100PutRequest withCriteriaContactFromTime(Double criteriaContactFromTime) {
        this.criteriaContactFromTime = criteriaContactFromTime;
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

    public PersonComments100PutRequest withOrigCode(String origCode) {
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

    public PersonComments100PutRequest withTextNar(String textNar) {
        this.textNar = textNar;
        return this;
    }

    /**
     * Add Date
     * <p>
     * Lineage reference object : SPRCMNT_DATE
     * 
     */
    @JsonProperty("criteria.date")
    public Date getCriteriaDate() {
        return criteriaDate;
    }

    /**
     * Add Date
     * <p>
     * Lineage reference object : SPRCMNT_DATE
     * 
     */
    @JsonProperty("criteria.date")
    public void setCriteriaDate(Date criteriaDate) {
        this.criteriaDate = criteriaDate;
    }

    public PersonComments100PutRequest withCriteriaDate(Date criteriaDate) {
        this.criteriaDate = criteriaDate;
        return this;
    }

    /**
     * Confidentiality
     * <p>
     * Lineage reference object : SPRCMNT_CONFIDENTIAL_IND
     * 
     */
    @JsonProperty("criteria.confidentialInd")
    public String getCriteriaConfidentialInd() {
        return criteriaConfidentialInd;
    }

    /**
     * Confidentiality
     * <p>
     * Lineage reference object : SPRCMNT_CONFIDENTIAL_IND
     * 
     */
    @JsonProperty("criteria.confidentialInd")
    public void setCriteriaConfidentialInd(String criteriaConfidentialInd) {
        this.criteriaConfidentialInd = criteriaConfidentialInd;
    }

    public PersonComments100PutRequest withCriteriaConfidentialInd(String criteriaConfidentialInd) {
        this.criteriaConfidentialInd = criteriaConfidentialInd;
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

    public PersonComments100PutRequest withConfidentialInd(String confidentialInd) {
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

    public PersonComments100PutRequest withCtypCode(String ctypCode) {
        this.ctypCode = ctypCode;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public PersonComments100PutRequest withId(Object id) {
        this.id = id;
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

    public PersonComments100PutRequest withText(String text) {
        this.text = text;
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

    public PersonComments100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PersonComments100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
        sb.append(',');
        sb.append("criteriaOrigCode");
        sb.append('=');
        sb.append(((this.criteriaOrigCode == null)?"<null>":this.criteriaOrigCode));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("criteriaUserId");
        sb.append('=');
        sb.append(((this.criteriaUserId == null)?"<null>":this.criteriaUserId));
        sb.append(',');
        sb.append("criteriaContactToTime");
        sb.append('=');
        sb.append(((this.criteriaContactToTime == null)?"<null>":this.criteriaContactToTime));
        sb.append(',');
        sb.append("contactDate");
        sb.append('=');
        sb.append(((this.contactDate == null)?"<null>":this.contactDate));
        sb.append(',');
        sb.append("cmttCode");
        sb.append('=');
        sb.append(((this.cmttCode == null)?"<null>":this.cmttCode));
        sb.append(',');
        sb.append("criteriaCmttCode");
        sb.append('=');
        sb.append(((this.criteriaCmttCode == null)?"<null>":this.criteriaCmttCode));
        sb.append(',');
        sb.append("criteriaText");
        sb.append('=');
        sb.append(((this.criteriaText == null)?"<null>":this.criteriaText));
        sb.append(',');
        sb.append("criteriaContactDate");
        sb.append('=');
        sb.append(((this.criteriaContactDate == null)?"<null>":this.criteriaContactDate));
        sb.append(',');
        sb.append("criteriaCtypCode");
        sb.append('=');
        sb.append(((this.criteriaCtypCode == null)?"<null>":this.criteriaCtypCode));
        sb.append(',');
        sb.append("criteriaContactFromTime");
        sb.append('=');
        sb.append(((this.criteriaContactFromTime == null)?"<null>":this.criteriaContactFromTime));
        sb.append(',');
        sb.append("origCode");
        sb.append('=');
        sb.append(((this.origCode == null)?"<null>":this.origCode));
        sb.append(',');
        sb.append("textNar");
        sb.append('=');
        sb.append(((this.textNar == null)?"<null>":this.textNar));
        sb.append(',');
        sb.append("criteriaDate");
        sb.append('=');
        sb.append(((this.criteriaDate == null)?"<null>":this.criteriaDate));
        sb.append(',');
        sb.append("criteriaConfidentialInd");
        sb.append('=');
        sb.append(((this.criteriaConfidentialInd == null)?"<null>":this.criteriaConfidentialInd));
        sb.append(',');
        sb.append("confidentialInd");
        sb.append('=');
        sb.append(((this.confidentialInd == null)?"<null>":this.confidentialInd));
        sb.append(',');
        sb.append("ctypCode");
        sb.append('=');
        sb.append(((this.ctypCode == null)?"<null>":this.ctypCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
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
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.criteriaDate == null)? 0 :this.criteriaDate.hashCode()));
        result = ((result* 31)+((this.criteriaCtypCode == null)? 0 :this.criteriaCtypCode.hashCode()));
        result = ((result* 31)+((this.criteriaOrigCode == null)? 0 :this.criteriaOrigCode.hashCode()));
        result = ((result* 31)+((this.contactDate == null)? 0 :this.contactDate.hashCode()));
        result = ((result* 31)+((this.cmttCode == null)? 0 :this.cmttCode.hashCode()));
        result = ((result* 31)+((this.criteriaCmttCode == null)? 0 :this.criteriaCmttCode.hashCode()));
        result = ((result* 31)+((this.criteriaContactToTime == null)? 0 :this.criteriaContactToTime.hashCode()));
        result = ((result* 31)+((this.origCode == null)? 0 :this.origCode.hashCode()));
        result = ((result* 31)+((this.textNar == null)? 0 :this.textNar.hashCode()));
        result = ((result* 31)+((this.criteriaUserId == null)? 0 :this.criteriaUserId.hashCode()));
        result = ((result* 31)+((this.criteriaContactFromTime == null)? 0 :this.criteriaContactFromTime.hashCode()));
        result = ((result* 31)+((this.confidentialInd == null)? 0 :this.confidentialInd.hashCode()));
        result = ((result* 31)+((this.criteriaText == null)? 0 :this.criteriaText.hashCode()));
        result = ((result* 31)+((this.criteriaConfidentialInd == null)? 0 :this.criteriaConfidentialInd.hashCode()));
        result = ((result* 31)+((this.ctypCode == null)? 0 :this.ctypCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.text == null)? 0 :this.text.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaContactDate == null)? 0 :this.criteriaContactDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PersonComments100PutRequest) == false) {
            return false;
        }
        PersonComments100PutRequest rhs = ((PersonComments100PutRequest) other);
        return ((((((((((((((((((((((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date)))&&((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate))))&&((this.criteriaDate == rhs.criteriaDate)||((this.criteriaDate!= null)&&this.criteriaDate.equals(rhs.criteriaDate))))&&((this.criteriaCtypCode == rhs.criteriaCtypCode)||((this.criteriaCtypCode!= null)&&this.criteriaCtypCode.equals(rhs.criteriaCtypCode))))&&((this.criteriaOrigCode == rhs.criteriaOrigCode)||((this.criteriaOrigCode!= null)&&this.criteriaOrigCode.equals(rhs.criteriaOrigCode))))&&((this.contactDate == rhs.contactDate)||((this.contactDate!= null)&&this.contactDate.equals(rhs.contactDate))))&&((this.cmttCode == rhs.cmttCode)||((this.cmttCode!= null)&&this.cmttCode.equals(rhs.cmttCode))))&&((this.criteriaCmttCode == rhs.criteriaCmttCode)||((this.criteriaCmttCode!= null)&&this.criteriaCmttCode.equals(rhs.criteriaCmttCode))))&&((this.criteriaContactToTime == rhs.criteriaContactToTime)||((this.criteriaContactToTime!= null)&&this.criteriaContactToTime.equals(rhs.criteriaContactToTime))))&&((this.origCode == rhs.origCode)||((this.origCode!= null)&&this.origCode.equals(rhs.origCode))))&&((this.textNar == rhs.textNar)||((this.textNar!= null)&&this.textNar.equals(rhs.textNar))))&&((this.criteriaUserId == rhs.criteriaUserId)||((this.criteriaUserId!= null)&&this.criteriaUserId.equals(rhs.criteriaUserId))))&&((this.criteriaContactFromTime == rhs.criteriaContactFromTime)||((this.criteriaContactFromTime!= null)&&this.criteriaContactFromTime.equals(rhs.criteriaContactFromTime))))&&((this.confidentialInd == rhs.confidentialInd)||((this.confidentialInd!= null)&&this.confidentialInd.equals(rhs.confidentialInd))))&&((this.criteriaText == rhs.criteriaText)||((this.criteriaText!= null)&&this.criteriaText.equals(rhs.criteriaText))))&&((this.criteriaConfidentialInd == rhs.criteriaConfidentialInd)||((this.criteriaConfidentialInd!= null)&&this.criteriaConfidentialInd.equals(rhs.criteriaConfidentialInd))))&&((this.ctypCode == rhs.ctypCode)||((this.ctypCode!= null)&&this.ctypCode.equals(rhs.ctypCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.text == rhs.text)||((this.text!= null)&&this.text.equals(rhs.text))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaContactDate == rhs.criteriaContactDate)||((this.criteriaContactDate!= null)&&this.criteriaContactDate.equals(rhs.criteriaContactDate))));
    }

}
