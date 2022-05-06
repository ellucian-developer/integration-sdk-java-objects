
package com.ellucian.generated.bpapi.ban.telephone.v1_0_0;

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
    "phoneExt",
    "unlistInd",
    "ctryCodePhone",
    "userId",
    "teleCode",
    "activityDate",
    "addrSeqno",
    "phoneNumber",
    "statusInd",
    "phoneArea",
    "atypDescription",
    "comment",
    "teleDescription",
    "intlAccess",
    "atypCode",
    "primaryInd"
})
@Generated("jsonschema2pojo")
public class Telephone100PutResponse {

    /**
     * Extension
     * <p>
     * Lineage reference object : SPRTELE_PHONE_EXT
     * 
     */
    @JsonProperty("phoneExt")
    @JsonPropertyDescription("Lineage reference object : SPRTELE_PHONE_EXT")
    private String phoneExt;
    /**
     * Unlisted
     * <p>
     * Lineage reference object : SPRTELE_UNLIST_IND
     * 
     */
    @JsonProperty("unlistInd")
    @JsonPropertyDescription("Lineage reference object : SPRTELE_UNLIST_IND")
    private String unlistInd;
    /**
     * Country Code
     * <p>
     * Lineage reference object : SPRTELE_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("ctryCodePhone")
    @JsonPropertyDescription("Lineage reference object : SPRTELE_CTRY_CODE_PHONE")
    private String ctryCodePhone;
    /**
     * User
     * <p>
     * Lineage reference object : SPRTELE_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SPRTELE_USER_ID")
    private String userId;
    /**
     * Telephone Type
     * <p>
     * Lineage reference object : SPRTELE_TELE_CODE, Lookup lineage reference object : stvtele
     * (Required)
     * 
     */
    @JsonProperty("teleCode")
    @JsonPropertyDescription("Lineage reference object : SPRTELE_TELE_CODE, Lookup lineage reference object : stvtele")
    private String teleCode;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SPRTELE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SPRTELE_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Sequence
     * <p>
     * Lineage reference object : SPRTELE_ADDR_SEQNO
     * 
     */
    @JsonProperty("addrSeqno")
    @JsonPropertyDescription("Lineage reference object : SPRTELE_ADDR_SEQNO")
    private Double addrSeqno;
    /**
     * Phone Number
     * <p>
     * Lineage reference object : SPRTELE_PHONE_NUMBER
     * 
     */
    @JsonProperty("phoneNumber")
    @JsonPropertyDescription("Lineage reference object : SPRTELE_PHONE_NUMBER")
    private String phoneNumber;
    /**
     * Inactivate
     * <p>
     * Lineage reference object : SPRTELE_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : SPRTELE_STATUS_IND")
    private String statusInd;
    /**
     * Area Code
     * <p>
     * Lineage reference object : SPRTELE_PHONE_AREA
     * 
     */
    @JsonProperty("phoneArea")
    @JsonPropertyDescription("Lineage reference object : SPRTELE_PHONE_AREA")
    private String phoneArea;
    @JsonProperty("atypDescription")
    private String atypDescription;
    /**
     * Comment
     * <p>
     * Lineage reference object : SPRTELE_COMMENT
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("Lineage reference object : SPRTELE_COMMENT")
    private String comment;
    @JsonProperty("teleDescription")
    private String teleDescription;
    /**
     * International Access
     * <p>
     * Lineage reference object : SPRTELE_INTL_ACCESS
     * 
     */
    @JsonProperty("intlAccess")
    @JsonPropertyDescription("Lineage reference object : SPRTELE_INTL_ACCESS")
    private String intlAccess;
    /**
     * Address Type
     * <p>
     * Lineage reference object : SPRTELE_ATYP_CODE
     * 
     */
    @JsonProperty("atypCode")
    @JsonPropertyDescription("Lineage reference object : SPRTELE_ATYP_CODE")
    private String atypCode;
    /**
     * Primary
     * <p>
     * Lineage reference object : SPRTELE_PRIMARY_IND
     * 
     */
    @JsonProperty("primaryInd")
    @JsonPropertyDescription("Lineage reference object : SPRTELE_PRIMARY_IND")
    private String primaryInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Extension
     * <p>
     * Lineage reference object : SPRTELE_PHONE_EXT
     * 
     */
    @JsonProperty("phoneExt")
    public String getPhoneExt() {
        return phoneExt;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : SPRTELE_PHONE_EXT
     * 
     */
    @JsonProperty("phoneExt")
    public void setPhoneExt(String phoneExt) {
        this.phoneExt = phoneExt;
    }

    public Telephone100PutResponse withPhoneExt(String phoneExt) {
        this.phoneExt = phoneExt;
        return this;
    }

    /**
     * Unlisted
     * <p>
     * Lineage reference object : SPRTELE_UNLIST_IND
     * 
     */
    @JsonProperty("unlistInd")
    public String getUnlistInd() {
        return unlistInd;
    }

    /**
     * Unlisted
     * <p>
     * Lineage reference object : SPRTELE_UNLIST_IND
     * 
     */
    @JsonProperty("unlistInd")
    public void setUnlistInd(String unlistInd) {
        this.unlistInd = unlistInd;
    }

    public Telephone100PutResponse withUnlistInd(String unlistInd) {
        this.unlistInd = unlistInd;
        return this;
    }

    /**
     * Country Code
     * <p>
     * Lineage reference object : SPRTELE_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("ctryCodePhone")
    public String getCtryCodePhone() {
        return ctryCodePhone;
    }

    /**
     * Country Code
     * <p>
     * Lineage reference object : SPRTELE_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("ctryCodePhone")
    public void setCtryCodePhone(String ctryCodePhone) {
        this.ctryCodePhone = ctryCodePhone;
    }

    public Telephone100PutResponse withCtryCodePhone(String ctryCodePhone) {
        this.ctryCodePhone = ctryCodePhone;
        return this;
    }

    /**
     * User
     * <p>
     * Lineage reference object : SPRTELE_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User
     * <p>
     * Lineage reference object : SPRTELE_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Telephone100PutResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Telephone Type
     * <p>
     * Lineage reference object : SPRTELE_TELE_CODE, Lookup lineage reference object : stvtele
     * (Required)
     * 
     */
    @JsonProperty("teleCode")
    public String getTeleCode() {
        return teleCode;
    }

    /**
     * Telephone Type
     * <p>
     * Lineage reference object : SPRTELE_TELE_CODE, Lookup lineage reference object : stvtele
     * (Required)
     * 
     */
    @JsonProperty("teleCode")
    public void setTeleCode(String teleCode) {
        this.teleCode = teleCode;
    }

    public Telephone100PutResponse withTeleCode(String teleCode) {
        this.teleCode = teleCode;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SPRTELE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SPRTELE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Telephone100PutResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : SPRTELE_ADDR_SEQNO
     * 
     */
    @JsonProperty("addrSeqno")
    public Double getAddrSeqno() {
        return addrSeqno;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : SPRTELE_ADDR_SEQNO
     * 
     */
    @JsonProperty("addrSeqno")
    public void setAddrSeqno(Double addrSeqno) {
        this.addrSeqno = addrSeqno;
    }

    public Telephone100PutResponse withAddrSeqno(Double addrSeqno) {
        this.addrSeqno = addrSeqno;
        return this;
    }

    /**
     * Phone Number
     * <p>
     * Lineage reference object : SPRTELE_PHONE_NUMBER
     * 
     */
    @JsonProperty("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Phone Number
     * <p>
     * Lineage reference object : SPRTELE_PHONE_NUMBER
     * 
     */
    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Telephone100PutResponse withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Inactivate
     * <p>
     * Lineage reference object : SPRTELE_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public String getStatusInd() {
        return statusInd;
    }

    /**
     * Inactivate
     * <p>
     * Lineage reference object : SPRTELE_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public void setStatusInd(String statusInd) {
        this.statusInd = statusInd;
    }

    public Telephone100PutResponse withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * Area Code
     * <p>
     * Lineage reference object : SPRTELE_PHONE_AREA
     * 
     */
    @JsonProperty("phoneArea")
    public String getPhoneArea() {
        return phoneArea;
    }

    /**
     * Area Code
     * <p>
     * Lineage reference object : SPRTELE_PHONE_AREA
     * 
     */
    @JsonProperty("phoneArea")
    public void setPhoneArea(String phoneArea) {
        this.phoneArea = phoneArea;
    }

    public Telephone100PutResponse withPhoneArea(String phoneArea) {
        this.phoneArea = phoneArea;
        return this;
    }

    @JsonProperty("atypDescription")
    public String getAtypDescription() {
        return atypDescription;
    }

    @JsonProperty("atypDescription")
    public void setAtypDescription(String atypDescription) {
        this.atypDescription = atypDescription;
    }

    public Telephone100PutResponse withAtypDescription(String atypDescription) {
        this.atypDescription = atypDescription;
        return this;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : SPRTELE_COMMENT
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : SPRTELE_COMMENT
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public Telephone100PutResponse withComment(String comment) {
        this.comment = comment;
        return this;
    }

    @JsonProperty("teleDescription")
    public String getTeleDescription() {
        return teleDescription;
    }

    @JsonProperty("teleDescription")
    public void setTeleDescription(String teleDescription) {
        this.teleDescription = teleDescription;
    }

    public Telephone100PutResponse withTeleDescription(String teleDescription) {
        this.teleDescription = teleDescription;
        return this;
    }

    /**
     * International Access
     * <p>
     * Lineage reference object : SPRTELE_INTL_ACCESS
     * 
     */
    @JsonProperty("intlAccess")
    public String getIntlAccess() {
        return intlAccess;
    }

    /**
     * International Access
     * <p>
     * Lineage reference object : SPRTELE_INTL_ACCESS
     * 
     */
    @JsonProperty("intlAccess")
    public void setIntlAccess(String intlAccess) {
        this.intlAccess = intlAccess;
    }

    public Telephone100PutResponse withIntlAccess(String intlAccess) {
        this.intlAccess = intlAccess;
        return this;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : SPRTELE_ATYP_CODE
     * 
     */
    @JsonProperty("atypCode")
    public String getAtypCode() {
        return atypCode;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : SPRTELE_ATYP_CODE
     * 
     */
    @JsonProperty("atypCode")
    public void setAtypCode(String atypCode) {
        this.atypCode = atypCode;
    }

    public Telephone100PutResponse withAtypCode(String atypCode) {
        this.atypCode = atypCode;
        return this;
    }

    /**
     * Primary
     * <p>
     * Lineage reference object : SPRTELE_PRIMARY_IND
     * 
     */
    @JsonProperty("primaryInd")
    public String getPrimaryInd() {
        return primaryInd;
    }

    /**
     * Primary
     * <p>
     * Lineage reference object : SPRTELE_PRIMARY_IND
     * 
     */
    @JsonProperty("primaryInd")
    public void setPrimaryInd(String primaryInd) {
        this.primaryInd = primaryInd;
    }

    public Telephone100PutResponse withPrimaryInd(String primaryInd) {
        this.primaryInd = primaryInd;
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

    public Telephone100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Telephone100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("phoneExt");
        sb.append('=');
        sb.append(((this.phoneExt == null)?"<null>":this.phoneExt));
        sb.append(',');
        sb.append("unlistInd");
        sb.append('=');
        sb.append(((this.unlistInd == null)?"<null>":this.unlistInd));
        sb.append(',');
        sb.append("ctryCodePhone");
        sb.append('=');
        sb.append(((this.ctryCodePhone == null)?"<null>":this.ctryCodePhone));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("teleCode");
        sb.append('=');
        sb.append(((this.teleCode == null)?"<null>":this.teleCode));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("addrSeqno");
        sb.append('=');
        sb.append(((this.addrSeqno == null)?"<null>":this.addrSeqno));
        sb.append(',');
        sb.append("phoneNumber");
        sb.append('=');
        sb.append(((this.phoneNumber == null)?"<null>":this.phoneNumber));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("phoneArea");
        sb.append('=');
        sb.append(((this.phoneArea == null)?"<null>":this.phoneArea));
        sb.append(',');
        sb.append("atypDescription");
        sb.append('=');
        sb.append(((this.atypDescription == null)?"<null>":this.atypDescription));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("teleDescription");
        sb.append('=');
        sb.append(((this.teleDescription == null)?"<null>":this.teleDescription));
        sb.append(',');
        sb.append("intlAccess");
        sb.append('=');
        sb.append(((this.intlAccess == null)?"<null>":this.intlAccess));
        sb.append(',');
        sb.append("atypCode");
        sb.append('=');
        sb.append(((this.atypCode == null)?"<null>":this.atypCode));
        sb.append(',');
        sb.append("primaryInd");
        sb.append('=');
        sb.append(((this.primaryInd == null)?"<null>":this.primaryInd));
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
        result = ((result* 31)+((this.phoneExt == null)? 0 :this.phoneExt.hashCode()));
        result = ((result* 31)+((this.unlistInd == null)? 0 :this.unlistInd.hashCode()));
        result = ((result* 31)+((this.ctryCodePhone == null)? 0 :this.ctryCodePhone.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.teleCode == null)? 0 :this.teleCode.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.addrSeqno == null)? 0 :this.addrSeqno.hashCode()));
        result = ((result* 31)+((this.phoneNumber == null)? 0 :this.phoneNumber.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.phoneArea == null)? 0 :this.phoneArea.hashCode()));
        result = ((result* 31)+((this.atypDescription == null)? 0 :this.atypDescription.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.teleDescription == null)? 0 :this.teleDescription.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.intlAccess == null)? 0 :this.intlAccess.hashCode()));
        result = ((result* 31)+((this.atypCode == null)? 0 :this.atypCode.hashCode()));
        result = ((result* 31)+((this.primaryInd == null)? 0 :this.primaryInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Telephone100PutResponse) == false) {
            return false;
        }
        Telephone100PutResponse rhs = ((Telephone100PutResponse) other);
        return ((((((((((((((((((this.phoneExt == rhs.phoneExt)||((this.phoneExt!= null)&&this.phoneExt.equals(rhs.phoneExt)))&&((this.unlistInd == rhs.unlistInd)||((this.unlistInd!= null)&&this.unlistInd.equals(rhs.unlistInd))))&&((this.ctryCodePhone == rhs.ctryCodePhone)||((this.ctryCodePhone!= null)&&this.ctryCodePhone.equals(rhs.ctryCodePhone))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.teleCode == rhs.teleCode)||((this.teleCode!= null)&&this.teleCode.equals(rhs.teleCode))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.addrSeqno == rhs.addrSeqno)||((this.addrSeqno!= null)&&this.addrSeqno.equals(rhs.addrSeqno))))&&((this.phoneNumber == rhs.phoneNumber)||((this.phoneNumber!= null)&&this.phoneNumber.equals(rhs.phoneNumber))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.phoneArea == rhs.phoneArea)||((this.phoneArea!= null)&&this.phoneArea.equals(rhs.phoneArea))))&&((this.atypDescription == rhs.atypDescription)||((this.atypDescription!= null)&&this.atypDescription.equals(rhs.atypDescription))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.teleDescription == rhs.teleDescription)||((this.teleDescription!= null)&&this.teleDescription.equals(rhs.teleDescription))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.intlAccess == rhs.intlAccess)||((this.intlAccess!= null)&&this.intlAccess.equals(rhs.intlAccess))))&&((this.atypCode == rhs.atypCode)||((this.atypCode!= null)&&this.atypCode.equals(rhs.atypCode))))&&((this.primaryInd == rhs.primaryInd)||((this.primaryInd!= null)&&this.primaryInd.equals(rhs.primaryInd))));
    }

}
