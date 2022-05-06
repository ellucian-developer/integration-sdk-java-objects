
package com.ellucian.generated.bpapi.ban.general_person_identification_email.v1_0_0;

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
    "criteria.dispWebInd",
    "emailAddress",
    "criteria.statusInd",
    "emalCode",
    "statusInd",
    "dispWebInd",
    "comment",
    "id",
    "criteria.emailAddress",
    "criteria.emalCode",
    "criteria.preferredInd",
    "preferredInd"
})
@Generated("jsonschema2pojo")
public class GeneralPersonIdentificationEmail100PutRequest {

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
     * Inactivate
     * <p>
     * Lineage reference object : GOREMAL_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    @JsonPropertyDescription("Lineage reference object : GOREMAL_STATUS_IND")
    private String criteriaStatusInd;
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
     * E-mail Address
     * <p>
     * Lineage reference object : GOREMAL_EMAIL_ADDRESS
     * 
     */
    @JsonProperty("criteria.emailAddress")
    @JsonPropertyDescription("Lineage reference object : GOREMAL_EMAIL_ADDRESS")
    private String criteriaEmailAddress;
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
     * Preferred
     * <p>
     * Lineage reference object : GOREMAL_PREFERRED_IND
     * 
     */
    @JsonProperty("criteria.preferredInd")
    @JsonPropertyDescription("Lineage reference object : GOREMAL_PREFERRED_IND")
    private String criteriaPreferredInd;
    /**
     * Preferred
     * <p>
     * Lineage reference object : GOREMAL_PREFERRED_IND
     * 
     */
    @JsonProperty("preferredInd")
    @JsonPropertyDescription("Lineage reference object : GOREMAL_PREFERRED_IND")
    private String preferredInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public GeneralPersonIdentificationEmail100PutRequest withCriteriaDispWebInd(String criteriaDispWebInd) {
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

    public GeneralPersonIdentificationEmail100PutRequest withEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
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

    public GeneralPersonIdentificationEmail100PutRequest withCriteriaStatusInd(String criteriaStatusInd) {
        this.criteriaStatusInd = criteriaStatusInd;
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

    public GeneralPersonIdentificationEmail100PutRequest withEmalCode(String emalCode) {
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

    public GeneralPersonIdentificationEmail100PutRequest withStatusInd(String statusInd) {
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

    public GeneralPersonIdentificationEmail100PutRequest withDispWebInd(String dispWebInd) {
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

    public GeneralPersonIdentificationEmail100PutRequest withComment(String comment) {
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

    public GeneralPersonIdentificationEmail100PutRequest withId(Object id) {
        this.id = id;
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

    public GeneralPersonIdentificationEmail100PutRequest withCriteriaEmailAddress(String criteriaEmailAddress) {
        this.criteriaEmailAddress = criteriaEmailAddress;
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

    public GeneralPersonIdentificationEmail100PutRequest withCriteriaEmalCode(String criteriaEmalCode) {
        this.criteriaEmalCode = criteriaEmalCode;
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

    public GeneralPersonIdentificationEmail100PutRequest withCriteriaPreferredInd(String criteriaPreferredInd) {
        this.criteriaPreferredInd = criteriaPreferredInd;
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

    public GeneralPersonIdentificationEmail100PutRequest withPreferredInd(String preferredInd) {
        this.preferredInd = preferredInd;
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

    public GeneralPersonIdentificationEmail100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GeneralPersonIdentificationEmail100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaDispWebInd");
        sb.append('=');
        sb.append(((this.criteriaDispWebInd == null)?"<null>":this.criteriaDispWebInd));
        sb.append(',');
        sb.append("emailAddress");
        sb.append('=');
        sb.append(((this.emailAddress == null)?"<null>":this.emailAddress));
        sb.append(',');
        sb.append("criteriaStatusInd");
        sb.append('=');
        sb.append(((this.criteriaStatusInd == null)?"<null>":this.criteriaStatusInd));
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
        sb.append("criteriaEmailAddress");
        sb.append('=');
        sb.append(((this.criteriaEmailAddress == null)?"<null>":this.criteriaEmailAddress));
        sb.append(',');
        sb.append("criteriaEmalCode");
        sb.append('=');
        sb.append(((this.criteriaEmalCode == null)?"<null>":this.criteriaEmalCode));
        sb.append(',');
        sb.append("criteriaPreferredInd");
        sb.append('=');
        sb.append(((this.criteriaPreferredInd == null)?"<null>":this.criteriaPreferredInd));
        sb.append(',');
        sb.append("preferredInd");
        sb.append('=');
        sb.append(((this.preferredInd == null)?"<null>":this.preferredInd));
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
        result = ((result* 31)+((this.criteriaPreferredInd == null)? 0 :this.criteriaPreferredInd.hashCode()));
        result = ((result* 31)+((this.criteriaEmailAddress == null)? 0 :this.criteriaEmailAddress.hashCode()));
        result = ((result* 31)+((this.preferredInd == null)? 0 :this.preferredInd.hashCode()));
        result = ((result* 31)+((this.criteriaStatusInd == null)? 0 :this.criteriaStatusInd.hashCode()));
        result = ((result* 31)+((this.emailAddress == null)? 0 :this.emailAddress.hashCode()));
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
        if ((other instanceof GeneralPersonIdentificationEmail100PutRequest) == false) {
            return false;
        }
        GeneralPersonIdentificationEmail100PutRequest rhs = ((GeneralPersonIdentificationEmail100PutRequest) other);
        return ((((((((((((((this.criteriaPreferredInd == rhs.criteriaPreferredInd)||((this.criteriaPreferredInd!= null)&&this.criteriaPreferredInd.equals(rhs.criteriaPreferredInd)))&&((this.criteriaEmailAddress == rhs.criteriaEmailAddress)||((this.criteriaEmailAddress!= null)&&this.criteriaEmailAddress.equals(rhs.criteriaEmailAddress))))&&((this.preferredInd == rhs.preferredInd)||((this.preferredInd!= null)&&this.preferredInd.equals(rhs.preferredInd))))&&((this.criteriaStatusInd == rhs.criteriaStatusInd)||((this.criteriaStatusInd!= null)&&this.criteriaStatusInd.equals(rhs.criteriaStatusInd))))&&((this.emailAddress == rhs.emailAddress)||((this.emailAddress!= null)&&this.emailAddress.equals(rhs.emailAddress))))&&((this.emalCode == rhs.emalCode)||((this.emalCode!= null)&&this.emalCode.equals(rhs.emalCode))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.criteriaDispWebInd == rhs.criteriaDispWebInd)||((this.criteriaDispWebInd!= null)&&this.criteriaDispWebInd.equals(rhs.criteriaDispWebInd))))&&((this.dispWebInd == rhs.dispWebInd)||((this.dispWebInd!= null)&&this.dispWebInd.equals(rhs.dispWebInd))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaEmalCode == rhs.criteriaEmalCode)||((this.criteriaEmalCode!= null)&&this.criteriaEmalCode.equals(rhs.criteriaEmalCode))));
    }

}
