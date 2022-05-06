
package com.ellucian.generated.bpapi.ban.email_address.v1_0_0;

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
    "criteria.userId",
    "criteria.activityDate",
    "criteria.statusInd",
    "criteria.emailAddress",
    "preferredInd",
    "criteria.dispWebInd",
    "emailAddress",
    "emalCode",
    "statusInd",
    "dispWebInd",
    "comment",
    "id",
    "criteria.emalCode",
    "criteria.comment",
    "criteria.preferredInd"
})
@Generated("jsonschema2pojo")
public class EmailAddress100PutRequest {

    /**
     * User
     * <p>
     * Lineage reference object : GOREMAL_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    @JsonPropertyDescription("Lineage reference object : GOREMAL_USER_ID")
    private String criteriaUserId;
    /**
     * Activity Date
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.activityDate")
    private Date criteriaActivityDate;
    /**
     * Inactivate
     * <p>
     * Lineage reference object : GOREMAL_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    @JsonPropertyDescription("Lineage reference object : GOREMAL_STATUS_IND")
    private String criteriaStatusInd;
    /**
     * E-mail Address
     * <p>
     * Lineage reference object : GOREMAL_EMAIL_ADDRESS
     * 
     */
    @JsonProperty("criteria.emailAddress")
    @JsonPropertyDescription("Lineage reference object : GOREMAL_EMAIL_ADDRESS")
    private String criteriaEmailAddress;
    /**
     * Preferred
     * <p>
     * Lineage reference object : GOREMAL_PREFERRED_IND
     * 
     */
    @JsonProperty("preferredInd")
    @JsonPropertyDescription("Lineage reference object : GOREMAL_PREFERRED_IND")
    private String preferredInd;
    /**
     * Display on Web
     * <p>
     * Lineage reference object : GOREMAL_DISP_WEB_IND
     * 
     */
    @JsonProperty("criteria.dispWebInd")
    @JsonPropertyDescription("Lineage reference object : GOREMAL_DISP_WEB_IND")
    private String criteriaDispWebInd;
    /**
     * E-mail Address
     * <p>
     * Lineage reference object : GOREMAL_EMAIL_ADDRESS
     * 
     */
    @JsonProperty("emailAddress")
    @JsonPropertyDescription("Lineage reference object : GOREMAL_EMAIL_ADDRESS")
    private String emailAddress;
    /**
     * E-mail Type
     * <p>
     * Lineage reference object : GOREMAL_EMAL_CODE, Lookup lineage reference object : gtvemal
     * 
     */
    @JsonProperty("emalCode")
    @JsonPropertyDescription("Lineage reference object : GOREMAL_EMAL_CODE, Lookup lineage reference object : gtvemal")
    private String emalCode;
    /**
     * Inactivate
     * <p>
     * Lineage reference object : GOREMAL_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : GOREMAL_STATUS_IND")
    private String statusInd;
    /**
     * Display on Web
     * <p>
     * Lineage reference object : GOREMAL_DISP_WEB_IND
     * 
     */
    @JsonProperty("dispWebInd")
    @JsonPropertyDescription("Lineage reference object : GOREMAL_DISP_WEB_IND")
    private String dispWebInd;
    /**
     * Comment
     * <p>
     * Lineage reference object : GOREMAL_COMMENT
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("Lineage reference object : GOREMAL_COMMENT")
    private String comment;
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
     * E-mail Type
     * <p>
     * Lineage reference object : GOREMAL_EMAL_CODE, Lookup lineage reference object : gtvemal
     * 
     */
    @JsonProperty("criteria.emalCode")
    @JsonPropertyDescription("Lineage reference object : GOREMAL_EMAL_CODE, Lookup lineage reference object : gtvemal")
    private String criteriaEmalCode;
    /**
     * Comment
     * <p>
     * Lineage reference object : GOREMAL_COMMENT
     * 
     */
    @JsonProperty("criteria.comment")
    @JsonPropertyDescription("Lineage reference object : GOREMAL_COMMENT")
    private String criteriaComment;
    /**
     * Preferred
     * <p>
     * Lineage reference object : GOREMAL_PREFERRED_IND
     * 
     */
    @JsonProperty("criteria.preferredInd")
    @JsonPropertyDescription("Lineage reference object : GOREMAL_PREFERRED_IND")
    private String criteriaPreferredInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * User
     * <p>
     * Lineage reference object : GOREMAL_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public String getCriteriaUserId() {
        return criteriaUserId;
    }

    /**
     * User
     * <p>
     * Lineage reference object : GOREMAL_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public void setCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
    }

    public EmailAddress100PutRequest withCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public EmailAddress100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * Inactivate
     * <p>
     * Lineage reference object : GOREMAL_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    public String getCriteriaStatusInd() {
        return criteriaStatusInd;
    }

    /**
     * Inactivate
     * <p>
     * Lineage reference object : GOREMAL_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    public void setCriteriaStatusInd(String criteriaStatusInd) {
        this.criteriaStatusInd = criteriaStatusInd;
    }

    public EmailAddress100PutRequest withCriteriaStatusInd(String criteriaStatusInd) {
        this.criteriaStatusInd = criteriaStatusInd;
        return this;
    }

    /**
     * E-mail Address
     * <p>
     * Lineage reference object : GOREMAL_EMAIL_ADDRESS
     * 
     */
    @JsonProperty("criteria.emailAddress")
    public String getCriteriaEmailAddress() {
        return criteriaEmailAddress;
    }

    /**
     * E-mail Address
     * <p>
     * Lineage reference object : GOREMAL_EMAIL_ADDRESS
     * 
     */
    @JsonProperty("criteria.emailAddress")
    public void setCriteriaEmailAddress(String criteriaEmailAddress) {
        this.criteriaEmailAddress = criteriaEmailAddress;
    }

    public EmailAddress100PutRequest withCriteriaEmailAddress(String criteriaEmailAddress) {
        this.criteriaEmailAddress = criteriaEmailAddress;
        return this;
    }

    /**
     * Preferred
     * <p>
     * Lineage reference object : GOREMAL_PREFERRED_IND
     * 
     */
    @JsonProperty("preferredInd")
    public String getPreferredInd() {
        return preferredInd;
    }

    /**
     * Preferred
     * <p>
     * Lineage reference object : GOREMAL_PREFERRED_IND
     * 
     */
    @JsonProperty("preferredInd")
    public void setPreferredInd(String preferredInd) {
        this.preferredInd = preferredInd;
    }

    public EmailAddress100PutRequest withPreferredInd(String preferredInd) {
        this.preferredInd = preferredInd;
        return this;
    }

    /**
     * Display on Web
     * <p>
     * Lineage reference object : GOREMAL_DISP_WEB_IND
     * 
     */
    @JsonProperty("criteria.dispWebInd")
    public String getCriteriaDispWebInd() {
        return criteriaDispWebInd;
    }

    /**
     * Display on Web
     * <p>
     * Lineage reference object : GOREMAL_DISP_WEB_IND
     * 
     */
    @JsonProperty("criteria.dispWebInd")
    public void setCriteriaDispWebInd(String criteriaDispWebInd) {
        this.criteriaDispWebInd = criteriaDispWebInd;
    }

    public EmailAddress100PutRequest withCriteriaDispWebInd(String criteriaDispWebInd) {
        this.criteriaDispWebInd = criteriaDispWebInd;
        return this;
    }

    /**
     * E-mail Address
     * <p>
     * Lineage reference object : GOREMAL_EMAIL_ADDRESS
     * 
     */
    @JsonProperty("emailAddress")
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * E-mail Address
     * <p>
     * Lineage reference object : GOREMAL_EMAIL_ADDRESS
     * 
     */
    @JsonProperty("emailAddress")
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public EmailAddress100PutRequest withEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    /**
     * E-mail Type
     * <p>
     * Lineage reference object : GOREMAL_EMAL_CODE, Lookup lineage reference object : gtvemal
     * 
     */
    @JsonProperty("emalCode")
    public String getEmalCode() {
        return emalCode;
    }

    /**
     * E-mail Type
     * <p>
     * Lineage reference object : GOREMAL_EMAL_CODE, Lookup lineage reference object : gtvemal
     * 
     */
    @JsonProperty("emalCode")
    public void setEmalCode(String emalCode) {
        this.emalCode = emalCode;
    }

    public EmailAddress100PutRequest withEmalCode(String emalCode) {
        this.emalCode = emalCode;
        return this;
    }

    /**
     * Inactivate
     * <p>
     * Lineage reference object : GOREMAL_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public String getStatusInd() {
        return statusInd;
    }

    /**
     * Inactivate
     * <p>
     * Lineage reference object : GOREMAL_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public void setStatusInd(String statusInd) {
        this.statusInd = statusInd;
    }

    public EmailAddress100PutRequest withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * Display on Web
     * <p>
     * Lineage reference object : GOREMAL_DISP_WEB_IND
     * 
     */
    @JsonProperty("dispWebInd")
    public String getDispWebInd() {
        return dispWebInd;
    }

    /**
     * Display on Web
     * <p>
     * Lineage reference object : GOREMAL_DISP_WEB_IND
     * 
     */
    @JsonProperty("dispWebInd")
    public void setDispWebInd(String dispWebInd) {
        this.dispWebInd = dispWebInd;
    }

    public EmailAddress100PutRequest withDispWebInd(String dispWebInd) {
        this.dispWebInd = dispWebInd;
        return this;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : GOREMAL_COMMENT
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : GOREMAL_COMMENT
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public EmailAddress100PutRequest withComment(String comment) {
        this.comment = comment;
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

    public EmailAddress100PutRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * E-mail Type
     * <p>
     * Lineage reference object : GOREMAL_EMAL_CODE, Lookup lineage reference object : gtvemal
     * 
     */
    @JsonProperty("criteria.emalCode")
    public String getCriteriaEmalCode() {
        return criteriaEmalCode;
    }

    /**
     * E-mail Type
     * <p>
     * Lineage reference object : GOREMAL_EMAL_CODE, Lookup lineage reference object : gtvemal
     * 
     */
    @JsonProperty("criteria.emalCode")
    public void setCriteriaEmalCode(String criteriaEmalCode) {
        this.criteriaEmalCode = criteriaEmalCode;
    }

    public EmailAddress100PutRequest withCriteriaEmalCode(String criteriaEmalCode) {
        this.criteriaEmalCode = criteriaEmalCode;
        return this;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : GOREMAL_COMMENT
     * 
     */
    @JsonProperty("criteria.comment")
    public String getCriteriaComment() {
        return criteriaComment;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : GOREMAL_COMMENT
     * 
     */
    @JsonProperty("criteria.comment")
    public void setCriteriaComment(String criteriaComment) {
        this.criteriaComment = criteriaComment;
    }

    public EmailAddress100PutRequest withCriteriaComment(String criteriaComment) {
        this.criteriaComment = criteriaComment;
        return this;
    }

    /**
     * Preferred
     * <p>
     * Lineage reference object : GOREMAL_PREFERRED_IND
     * 
     */
    @JsonProperty("criteria.preferredInd")
    public String getCriteriaPreferredInd() {
        return criteriaPreferredInd;
    }

    /**
     * Preferred
     * <p>
     * Lineage reference object : GOREMAL_PREFERRED_IND
     * 
     */
    @JsonProperty("criteria.preferredInd")
    public void setCriteriaPreferredInd(String criteriaPreferredInd) {
        this.criteriaPreferredInd = criteriaPreferredInd;
    }

    public EmailAddress100PutRequest withCriteriaPreferredInd(String criteriaPreferredInd) {
        this.criteriaPreferredInd = criteriaPreferredInd;
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

    public EmailAddress100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmailAddress100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaUserId");
        sb.append('=');
        sb.append(((this.criteriaUserId == null)?"<null>":this.criteriaUserId));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("criteriaStatusInd");
        sb.append('=');
        sb.append(((this.criteriaStatusInd == null)?"<null>":this.criteriaStatusInd));
        sb.append(',');
        sb.append("criteriaEmailAddress");
        sb.append('=');
        sb.append(((this.criteriaEmailAddress == null)?"<null>":this.criteriaEmailAddress));
        sb.append(',');
        sb.append("preferredInd");
        sb.append('=');
        sb.append(((this.preferredInd == null)?"<null>":this.preferredInd));
        sb.append(',');
        sb.append("criteriaDispWebInd");
        sb.append('=');
        sb.append(((this.criteriaDispWebInd == null)?"<null>":this.criteriaDispWebInd));
        sb.append(',');
        sb.append("emailAddress");
        sb.append('=');
        sb.append(((this.emailAddress == null)?"<null>":this.emailAddress));
        sb.append(',');
        sb.append("emalCode");
        sb.append('=');
        sb.append(((this.emalCode == null)?"<null>":this.emalCode));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("dispWebInd");
        sb.append('=');
        sb.append(((this.dispWebInd == null)?"<null>":this.dispWebInd));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("criteriaEmalCode");
        sb.append('=');
        sb.append(((this.criteriaEmalCode == null)?"<null>":this.criteriaEmalCode));
        sb.append(',');
        sb.append("criteriaComment");
        sb.append('=');
        sb.append(((this.criteriaComment == null)?"<null>":this.criteriaComment));
        sb.append(',');
        sb.append("criteriaPreferredInd");
        sb.append('=');
        sb.append(((this.criteriaPreferredInd == null)?"<null>":this.criteriaPreferredInd));
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
        result = ((result* 31)+((this.criteriaPreferredInd == null)? 0 :this.criteriaPreferredInd.hashCode()));
        result = ((result* 31)+((this.criteriaComment == null)? 0 :this.criteriaComment.hashCode()));
        result = ((result* 31)+((this.criteriaEmailAddress == null)? 0 :this.criteriaEmailAddress.hashCode()));
        result = ((result* 31)+((this.preferredInd == null)? 0 :this.preferredInd.hashCode()));
        result = ((result* 31)+((this.criteriaStatusInd == null)? 0 :this.criteriaStatusInd.hashCode()));
        result = ((result* 31)+((this.emailAddress == null)? 0 :this.emailAddress.hashCode()));
        result = ((result* 31)+((this.criteriaUserId == null)? 0 :this.criteriaUserId.hashCode()));
        result = ((result* 31)+((this.emalCode == null)? 0 :this.emalCode.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.criteriaDispWebInd == null)? 0 :this.criteriaDispWebInd.hashCode()));
        result = ((result* 31)+((this.dispWebInd == null)? 0 :this.dispWebInd.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaEmalCode == null)? 0 :this.criteriaEmalCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmailAddress100PutRequest) == false) {
            return false;
        }
        EmailAddress100PutRequest rhs = ((EmailAddress100PutRequest) other);
        return (((((((((((((((((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate)))&&((this.criteriaPreferredInd == rhs.criteriaPreferredInd)||((this.criteriaPreferredInd!= null)&&this.criteriaPreferredInd.equals(rhs.criteriaPreferredInd))))&&((this.criteriaComment == rhs.criteriaComment)||((this.criteriaComment!= null)&&this.criteriaComment.equals(rhs.criteriaComment))))&&((this.criteriaEmailAddress == rhs.criteriaEmailAddress)||((this.criteriaEmailAddress!= null)&&this.criteriaEmailAddress.equals(rhs.criteriaEmailAddress))))&&((this.preferredInd == rhs.preferredInd)||((this.preferredInd!= null)&&this.preferredInd.equals(rhs.preferredInd))))&&((this.criteriaStatusInd == rhs.criteriaStatusInd)||((this.criteriaStatusInd!= null)&&this.criteriaStatusInd.equals(rhs.criteriaStatusInd))))&&((this.emailAddress == rhs.emailAddress)||((this.emailAddress!= null)&&this.emailAddress.equals(rhs.emailAddress))))&&((this.criteriaUserId == rhs.criteriaUserId)||((this.criteriaUserId!= null)&&this.criteriaUserId.equals(rhs.criteriaUserId))))&&((this.emalCode == rhs.emalCode)||((this.emalCode!= null)&&this.emalCode.equals(rhs.emalCode))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.criteriaDispWebInd == rhs.criteriaDispWebInd)||((this.criteriaDispWebInd!= null)&&this.criteriaDispWebInd.equals(rhs.criteriaDispWebInd))))&&((this.dispWebInd == rhs.dispWebInd)||((this.dispWebInd!= null)&&this.dispWebInd.equals(rhs.dispWebInd))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaEmalCode == rhs.criteriaEmalCode)||((this.criteriaEmalCode!= null)&&this.criteriaEmalCode.equals(rhs.criteriaEmalCode))));
    }

}
