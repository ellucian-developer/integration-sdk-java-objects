
package com.ellucian.generated.bpapi.ban.vendor_maintenance_email.v1_0_0;

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
    "emailAddress",
    "activityDate",
    "emailDesc",
    "emalCode",
    "statusInd",
    "dispWebInd",
    "comment",
    "userId",
    "preferredInd",
    "urlInd"
})
@Generated("jsonschema2pojo")
public class VendorMaintenanceEmail100GetResponse {

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
     * Activity Date
     * <p>
     * 
     * 
     */
    @JsonProperty("activityDate")
    private Date activityDate;
    @JsonProperty("emailDesc")
    private String emailDesc;
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
     * User
     * <p>
     * Lineage reference object : GOREMAL_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : GOREMAL_USER_ID")
    private String userId;
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
     * URL
     * <p>
     * 
     * 
     */
    @JsonProperty("urlInd")
    private String urlInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public VendorMaintenanceEmail100GetResponse withEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * 
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * 
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public VendorMaintenanceEmail100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    @JsonProperty("emailDesc")
    public String getEmailDesc() {
        return emailDesc;
    }

    @JsonProperty("emailDesc")
    public void setEmailDesc(String emailDesc) {
        this.emailDesc = emailDesc;
    }

    public VendorMaintenanceEmail100GetResponse withEmailDesc(String emailDesc) {
        this.emailDesc = emailDesc;
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

    public VendorMaintenanceEmail100GetResponse withEmalCode(String emalCode) {
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

    public VendorMaintenanceEmail100GetResponse withStatusInd(String statusInd) {
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

    public VendorMaintenanceEmail100GetResponse withDispWebInd(String dispWebInd) {
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

    public VendorMaintenanceEmail100GetResponse withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * User
     * <p>
     * Lineage reference object : GOREMAL_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User
     * <p>
     * Lineage reference object : GOREMAL_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public VendorMaintenanceEmail100GetResponse withUserId(String userId) {
        this.userId = userId;
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

    public VendorMaintenanceEmail100GetResponse withPreferredInd(String preferredInd) {
        this.preferredInd = preferredInd;
        return this;
    }

    /**
     * URL
     * <p>
     * 
     * 
     */
    @JsonProperty("urlInd")
    public String getUrlInd() {
        return urlInd;
    }

    /**
     * URL
     * <p>
     * 
     * 
     */
    @JsonProperty("urlInd")
    public void setUrlInd(String urlInd) {
        this.urlInd = urlInd;
    }

    public VendorMaintenanceEmail100GetResponse withUrlInd(String urlInd) {
        this.urlInd = urlInd;
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

    public VendorMaintenanceEmail100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(VendorMaintenanceEmail100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("emailAddress");
        sb.append('=');
        sb.append(((this.emailAddress == null)?"<null>":this.emailAddress));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("emailDesc");
        sb.append('=');
        sb.append(((this.emailDesc == null)?"<null>":this.emailDesc));
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
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("preferredInd");
        sb.append('=');
        sb.append(((this.preferredInd == null)?"<null>":this.preferredInd));
        sb.append(',');
        sb.append("urlInd");
        sb.append('=');
        sb.append(((this.urlInd == null)?"<null>":this.urlInd));
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
        result = ((result* 31)+((this.emailAddress == null)? 0 :this.emailAddress.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.emailDesc == null)? 0 :this.emailDesc.hashCode()));
        result = ((result* 31)+((this.emalCode == null)? 0 :this.emalCode.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.dispWebInd == null)? 0 :this.dispWebInd.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.preferredInd == null)? 0 :this.preferredInd.hashCode()));
        result = ((result* 31)+((this.urlInd == null)? 0 :this.urlInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VendorMaintenanceEmail100GetResponse) == false) {
            return false;
        }
        VendorMaintenanceEmail100GetResponse rhs = ((VendorMaintenanceEmail100GetResponse) other);
        return ((((((((((((this.emailAddress == rhs.emailAddress)||((this.emailAddress!= null)&&this.emailAddress.equals(rhs.emailAddress)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.emailDesc == rhs.emailDesc)||((this.emailDesc!= null)&&this.emailDesc.equals(rhs.emailDesc))))&&((this.emalCode == rhs.emalCode)||((this.emalCode!= null)&&this.emalCode.equals(rhs.emalCode))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.dispWebInd == rhs.dispWebInd)||((this.dispWebInd!= null)&&this.dispWebInd.equals(rhs.dispWebInd))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.preferredInd == rhs.preferredInd)||((this.preferredInd!= null)&&this.preferredInd.equals(rhs.preferredInd))))&&((this.urlInd == rhs.urlInd)||((this.urlInd!= null)&&this.urlInd.equals(rhs.urlInd))));
    }

}
