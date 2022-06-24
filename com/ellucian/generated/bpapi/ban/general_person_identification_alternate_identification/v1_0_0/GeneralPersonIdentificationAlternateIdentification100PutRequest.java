
package com.ellucian.generated.bpapi.ban.general_person_identification_alternate_identification.v1_0_0;

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
    "criteria.spridenId",
    "criteria.spridenLastName",
    "criteria.spridenMi",
    "criteria.spridenCreateUser",
    "criteria.spridenSurnamePrefix",
    "criteria.spridenChangeInd",
    "criteria.spridenCreateDate",
    "spridenNtypCode",
    "id",
    "criteria.spridenFirstName",
    "criteria.spridenOrigin"
})
@Generated("jsonschema2pojo")
public class GeneralPersonIdentificationAlternateIdentification100PutRequest {

    /**
     * Name Type
     * <p>
     * Lineage reference object : SPRIDEN_NTYP_CODE, Lookup lineage reference object : gtvntyp
     * 
     */
    @JsonProperty("criteria.spridenNtypCode")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_NTYP_CODE, Lookup lineage reference object : gtvntyp")
    private String criteriaSpridenNtypCode;
    /**
     * ID
     * <p>
     * Lineage reference object : SPRIDEN_ID
     * 
     */
    @JsonProperty("criteria.spridenId")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_ID")
    private String criteriaSpridenId;
    /**
     * Last Name
     * <p>
     * Lineage reference object : SPRIDEN_LAST_NAME
     * 
     */
    @JsonProperty("criteria.spridenLastName")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_LAST_NAME")
    private String criteriaSpridenLastName;
    /**
     * Middle Name
     * <p>
     * Lineage reference object : SPRIDEN_MI
     * 
     */
    @JsonProperty("criteria.spridenMi")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_MI")
    private String criteriaSpridenMi;
    /**
     * Create User
     * <p>
     * Lineage reference object : SPRIDEN_CREATE_USER
     * 
     */
    @JsonProperty("criteria.spridenCreateUser")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_CREATE_USER")
    private String criteriaSpridenCreateUser;
    /**
     * Last Name Prefix
     * <p>
     * Lineage reference object : SPRIDEN_SURNAME_PREFIX
     * 
     */
    @JsonProperty("criteria.spridenSurnamePrefix")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_SURNAME_PREFIX")
    private String criteriaSpridenSurnamePrefix;
    /**
     * Change Type
     * <p>
     * Lineage reference object : SPRIDEN_CHANGE_IND
     * 
     */
    @JsonProperty("criteria.spridenChangeInd")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_CHANGE_IND")
    private String criteriaSpridenChangeInd;
    /**
     * Create Date
     * <p>
     * Lineage reference object : SPRIDEN_CREATE_DATE
     * 
     */
    @JsonProperty("criteria.spridenCreateDate")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_CREATE_DATE")
    private Date criteriaSpridenCreateDate;
    /**
     * Name Type
     * <p>
     * Lineage reference object : SPRIDEN_NTYP_CODE, Lookup lineage reference object : gtvntyp
     * 
     */
    @JsonProperty("spridenNtypCode")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_NTYP_CODE, Lookup lineage reference object : gtvntyp")
    private String spridenNtypCode;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private String id;
    /**
     * First Name
     * <p>
     * Lineage reference object : SPRIDEN_FIRST_NAME
     * 
     */
    @JsonProperty("criteria.spridenFirstName")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_FIRST_NAME")
    private String criteriaSpridenFirstName;
    /**
     * Origin
     * <p>
     * Lineage reference object : SPRIDEN_ORIGIN
     * 
     */
    @JsonProperty("criteria.spridenOrigin")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_ORIGIN")
    private String criteriaSpridenOrigin;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Name Type
     * <p>
     * Lineage reference object : SPRIDEN_NTYP_CODE, Lookup lineage reference object : gtvntyp
     * 
     */
    @JsonProperty("criteria.spridenNtypCode")
    public String getCriteriaSpridenNtypCode() {
        return criteriaSpridenNtypCode;
    }

    /**
     * Name Type
     * <p>
     * Lineage reference object : SPRIDEN_NTYP_CODE, Lookup lineage reference object : gtvntyp
     * 
     */
    @JsonProperty("criteria.spridenNtypCode")
    public void setCriteriaSpridenNtypCode(String criteriaSpridenNtypCode) {
        this.criteriaSpridenNtypCode = criteriaSpridenNtypCode;
    }

    public GeneralPersonIdentificationAlternateIdentification100PutRequest withCriteriaSpridenNtypCode(String criteriaSpridenNtypCode) {
        this.criteriaSpridenNtypCode = criteriaSpridenNtypCode;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : SPRIDEN_ID
     * 
     */
    @JsonProperty("criteria.spridenId")
    public String getCriteriaSpridenId() {
        return criteriaSpridenId;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : SPRIDEN_ID
     * 
     */
    @JsonProperty("criteria.spridenId")
    public void setCriteriaSpridenId(String criteriaSpridenId) {
        this.criteriaSpridenId = criteriaSpridenId;
    }

    public GeneralPersonIdentificationAlternateIdentification100PutRequest withCriteriaSpridenId(String criteriaSpridenId) {
        this.criteriaSpridenId = criteriaSpridenId;
        return this;
    }

    /**
     * Last Name
     * <p>
     * Lineage reference object : SPRIDEN_LAST_NAME
     * 
     */
    @JsonProperty("criteria.spridenLastName")
    public String getCriteriaSpridenLastName() {
        return criteriaSpridenLastName;
    }

    /**
     * Last Name
     * <p>
     * Lineage reference object : SPRIDEN_LAST_NAME
     * 
     */
    @JsonProperty("criteria.spridenLastName")
    public void setCriteriaSpridenLastName(String criteriaSpridenLastName) {
        this.criteriaSpridenLastName = criteriaSpridenLastName;
    }

    public GeneralPersonIdentificationAlternateIdentification100PutRequest withCriteriaSpridenLastName(String criteriaSpridenLastName) {
        this.criteriaSpridenLastName = criteriaSpridenLastName;
        return this;
    }

    /**
     * Middle Name
     * <p>
     * Lineage reference object : SPRIDEN_MI
     * 
     */
    @JsonProperty("criteria.spridenMi")
    public String getCriteriaSpridenMi() {
        return criteriaSpridenMi;
    }

    /**
     * Middle Name
     * <p>
     * Lineage reference object : SPRIDEN_MI
     * 
     */
    @JsonProperty("criteria.spridenMi")
    public void setCriteriaSpridenMi(String criteriaSpridenMi) {
        this.criteriaSpridenMi = criteriaSpridenMi;
    }

    public GeneralPersonIdentificationAlternateIdentification100PutRequest withCriteriaSpridenMi(String criteriaSpridenMi) {
        this.criteriaSpridenMi = criteriaSpridenMi;
        return this;
    }

    /**
     * Create User
     * <p>
     * Lineage reference object : SPRIDEN_CREATE_USER
     * 
     */
    @JsonProperty("criteria.spridenCreateUser")
    public String getCriteriaSpridenCreateUser() {
        return criteriaSpridenCreateUser;
    }

    /**
     * Create User
     * <p>
     * Lineage reference object : SPRIDEN_CREATE_USER
     * 
     */
    @JsonProperty("criteria.spridenCreateUser")
    public void setCriteriaSpridenCreateUser(String criteriaSpridenCreateUser) {
        this.criteriaSpridenCreateUser = criteriaSpridenCreateUser;
    }

    public GeneralPersonIdentificationAlternateIdentification100PutRequest withCriteriaSpridenCreateUser(String criteriaSpridenCreateUser) {
        this.criteriaSpridenCreateUser = criteriaSpridenCreateUser;
        return this;
    }

    /**
     * Last Name Prefix
     * <p>
     * Lineage reference object : SPRIDEN_SURNAME_PREFIX
     * 
     */
    @JsonProperty("criteria.spridenSurnamePrefix")
    public String getCriteriaSpridenSurnamePrefix() {
        return criteriaSpridenSurnamePrefix;
    }

    /**
     * Last Name Prefix
     * <p>
     * Lineage reference object : SPRIDEN_SURNAME_PREFIX
     * 
     */
    @JsonProperty("criteria.spridenSurnamePrefix")
    public void setCriteriaSpridenSurnamePrefix(String criteriaSpridenSurnamePrefix) {
        this.criteriaSpridenSurnamePrefix = criteriaSpridenSurnamePrefix;
    }

    public GeneralPersonIdentificationAlternateIdentification100PutRequest withCriteriaSpridenSurnamePrefix(String criteriaSpridenSurnamePrefix) {
        this.criteriaSpridenSurnamePrefix = criteriaSpridenSurnamePrefix;
        return this;
    }

    /**
     * Change Type
     * <p>
     * Lineage reference object : SPRIDEN_CHANGE_IND
     * 
     */
    @JsonProperty("criteria.spridenChangeInd")
    public String getCriteriaSpridenChangeInd() {
        return criteriaSpridenChangeInd;
    }

    /**
     * Change Type
     * <p>
     * Lineage reference object : SPRIDEN_CHANGE_IND
     * 
     */
    @JsonProperty("criteria.spridenChangeInd")
    public void setCriteriaSpridenChangeInd(String criteriaSpridenChangeInd) {
        this.criteriaSpridenChangeInd = criteriaSpridenChangeInd;
    }

    public GeneralPersonIdentificationAlternateIdentification100PutRequest withCriteriaSpridenChangeInd(String criteriaSpridenChangeInd) {
        this.criteriaSpridenChangeInd = criteriaSpridenChangeInd;
        return this;
    }

    /**
     * Create Date
     * <p>
     * Lineage reference object : SPRIDEN_CREATE_DATE
     * 
     */
    @JsonProperty("criteria.spridenCreateDate")
    public Date getCriteriaSpridenCreateDate() {
        return criteriaSpridenCreateDate;
    }

    /**
     * Create Date
     * <p>
     * Lineage reference object : SPRIDEN_CREATE_DATE
     * 
     */
    @JsonProperty("criteria.spridenCreateDate")
    public void setCriteriaSpridenCreateDate(Date criteriaSpridenCreateDate) {
        this.criteriaSpridenCreateDate = criteriaSpridenCreateDate;
    }

    public GeneralPersonIdentificationAlternateIdentification100PutRequest withCriteriaSpridenCreateDate(Date criteriaSpridenCreateDate) {
        this.criteriaSpridenCreateDate = criteriaSpridenCreateDate;
        return this;
    }

    /**
     * Name Type
     * <p>
     * Lineage reference object : SPRIDEN_NTYP_CODE, Lookup lineage reference object : gtvntyp
     * 
     */
    @JsonProperty("spridenNtypCode")
    public String getSpridenNtypCode() {
        return spridenNtypCode;
    }

    /**
     * Name Type
     * <p>
     * Lineage reference object : SPRIDEN_NTYP_CODE, Lookup lineage reference object : gtvntyp
     * 
     */
    @JsonProperty("spridenNtypCode")
    public void setSpridenNtypCode(String spridenNtypCode) {
        this.spridenNtypCode = spridenNtypCode;
    }

    public GeneralPersonIdentificationAlternateIdentification100PutRequest withSpridenNtypCode(String spridenNtypCode) {
        this.spridenNtypCode = spridenNtypCode;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public GeneralPersonIdentificationAlternateIdentification100PutRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * First Name
     * <p>
     * Lineage reference object : SPRIDEN_FIRST_NAME
     * 
     */
    @JsonProperty("criteria.spridenFirstName")
    public String getCriteriaSpridenFirstName() {
        return criteriaSpridenFirstName;
    }

    /**
     * First Name
     * <p>
     * Lineage reference object : SPRIDEN_FIRST_NAME
     * 
     */
    @JsonProperty("criteria.spridenFirstName")
    public void setCriteriaSpridenFirstName(String criteriaSpridenFirstName) {
        this.criteriaSpridenFirstName = criteriaSpridenFirstName;
    }

    public GeneralPersonIdentificationAlternateIdentification100PutRequest withCriteriaSpridenFirstName(String criteriaSpridenFirstName) {
        this.criteriaSpridenFirstName = criteriaSpridenFirstName;
        return this;
    }

    /**
     * Origin
     * <p>
     * Lineage reference object : SPRIDEN_ORIGIN
     * 
     */
    @JsonProperty("criteria.spridenOrigin")
    public String getCriteriaSpridenOrigin() {
        return criteriaSpridenOrigin;
    }

    /**
     * Origin
     * <p>
     * Lineage reference object : SPRIDEN_ORIGIN
     * 
     */
    @JsonProperty("criteria.spridenOrigin")
    public void setCriteriaSpridenOrigin(String criteriaSpridenOrigin) {
        this.criteriaSpridenOrigin = criteriaSpridenOrigin;
    }

    public GeneralPersonIdentificationAlternateIdentification100PutRequest withCriteriaSpridenOrigin(String criteriaSpridenOrigin) {
        this.criteriaSpridenOrigin = criteriaSpridenOrigin;
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

    public GeneralPersonIdentificationAlternateIdentification100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GeneralPersonIdentificationAlternateIdentification100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaSpridenNtypCode");
        sb.append('=');
        sb.append(((this.criteriaSpridenNtypCode == null)?"<null>":this.criteriaSpridenNtypCode));
        sb.append(',');
        sb.append("criteriaSpridenId");
        sb.append('=');
        sb.append(((this.criteriaSpridenId == null)?"<null>":this.criteriaSpridenId));
        sb.append(',');
        sb.append("criteriaSpridenLastName");
        sb.append('=');
        sb.append(((this.criteriaSpridenLastName == null)?"<null>":this.criteriaSpridenLastName));
        sb.append(',');
        sb.append("criteriaSpridenMi");
        sb.append('=');
        sb.append(((this.criteriaSpridenMi == null)?"<null>":this.criteriaSpridenMi));
        sb.append(',');
        sb.append("criteriaSpridenCreateUser");
        sb.append('=');
        sb.append(((this.criteriaSpridenCreateUser == null)?"<null>":this.criteriaSpridenCreateUser));
        sb.append(',');
        sb.append("criteriaSpridenSurnamePrefix");
        sb.append('=');
        sb.append(((this.criteriaSpridenSurnamePrefix == null)?"<null>":this.criteriaSpridenSurnamePrefix));
        sb.append(',');
        sb.append("criteriaSpridenChangeInd");
        sb.append('=');
        sb.append(((this.criteriaSpridenChangeInd == null)?"<null>":this.criteriaSpridenChangeInd));
        sb.append(',');
        sb.append("criteriaSpridenCreateDate");
        sb.append('=');
        sb.append(((this.criteriaSpridenCreateDate == null)?"<null>":this.criteriaSpridenCreateDate));
        sb.append(',');
        sb.append("spridenNtypCode");
        sb.append('=');
        sb.append(((this.spridenNtypCode == null)?"<null>":this.spridenNtypCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("criteriaSpridenFirstName");
        sb.append('=');
        sb.append(((this.criteriaSpridenFirstName == null)?"<null>":this.criteriaSpridenFirstName));
        sb.append(',');
        sb.append("criteriaSpridenOrigin");
        sb.append('=');
        sb.append(((this.criteriaSpridenOrigin == null)?"<null>":this.criteriaSpridenOrigin));
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
        result = ((result* 31)+((this.criteriaSpridenCreateDate == null)? 0 :this.criteriaSpridenCreateDate.hashCode()));
        result = ((result* 31)+((this.criteriaSpridenOrigin == null)? 0 :this.criteriaSpridenOrigin.hashCode()));
        result = ((result* 31)+((this.criteriaSpridenCreateUser == null)? 0 :this.criteriaSpridenCreateUser.hashCode()));
        result = ((result* 31)+((this.criteriaSpridenSurnamePrefix == null)? 0 :this.criteriaSpridenSurnamePrefix.hashCode()));
        result = ((result* 31)+((this.criteriaSpridenChangeInd == null)? 0 :this.criteriaSpridenChangeInd.hashCode()));
        result = ((result* 31)+((this.spridenNtypCode == null)? 0 :this.spridenNtypCode.hashCode()));
        result = ((result* 31)+((this.criteriaSpridenLastName == null)? 0 :this.criteriaSpridenLastName.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.criteriaSpridenFirstName == null)? 0 :this.criteriaSpridenFirstName.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaSpridenId == null)? 0 :this.criteriaSpridenId.hashCode()));
        result = ((result* 31)+((this.criteriaSpridenNtypCode == null)? 0 :this.criteriaSpridenNtypCode.hashCode()));
        result = ((result* 31)+((this.criteriaSpridenMi == null)? 0 :this.criteriaSpridenMi.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeneralPersonIdentificationAlternateIdentification100PutRequest) == false) {
            return false;
        }
        GeneralPersonIdentificationAlternateIdentification100PutRequest rhs = ((GeneralPersonIdentificationAlternateIdentification100PutRequest) other);
        return ((((((((((((((this.criteriaSpridenCreateDate == rhs.criteriaSpridenCreateDate)||((this.criteriaSpridenCreateDate!= null)&&this.criteriaSpridenCreateDate.equals(rhs.criteriaSpridenCreateDate)))&&((this.criteriaSpridenOrigin == rhs.criteriaSpridenOrigin)||((this.criteriaSpridenOrigin!= null)&&this.criteriaSpridenOrigin.equals(rhs.criteriaSpridenOrigin))))&&((this.criteriaSpridenCreateUser == rhs.criteriaSpridenCreateUser)||((this.criteriaSpridenCreateUser!= null)&&this.criteriaSpridenCreateUser.equals(rhs.criteriaSpridenCreateUser))))&&((this.criteriaSpridenSurnamePrefix == rhs.criteriaSpridenSurnamePrefix)||((this.criteriaSpridenSurnamePrefix!= null)&&this.criteriaSpridenSurnamePrefix.equals(rhs.criteriaSpridenSurnamePrefix))))&&((this.criteriaSpridenChangeInd == rhs.criteriaSpridenChangeInd)||((this.criteriaSpridenChangeInd!= null)&&this.criteriaSpridenChangeInd.equals(rhs.criteriaSpridenChangeInd))))&&((this.spridenNtypCode == rhs.spridenNtypCode)||((this.spridenNtypCode!= null)&&this.spridenNtypCode.equals(rhs.spridenNtypCode))))&&((this.criteriaSpridenLastName == rhs.criteriaSpridenLastName)||((this.criteriaSpridenLastName!= null)&&this.criteriaSpridenLastName.equals(rhs.criteriaSpridenLastName))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.criteriaSpridenFirstName == rhs.criteriaSpridenFirstName)||((this.criteriaSpridenFirstName!= null)&&this.criteriaSpridenFirstName.equals(rhs.criteriaSpridenFirstName))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaSpridenId == rhs.criteriaSpridenId)||((this.criteriaSpridenId!= null)&&this.criteriaSpridenId.equals(rhs.criteriaSpridenId))))&&((this.criteriaSpridenNtypCode == rhs.criteriaSpridenNtypCode)||((this.criteriaSpridenNtypCode!= null)&&this.criteriaSpridenNtypCode.equals(rhs.criteriaSpridenNtypCode))))&&((this.criteriaSpridenMi == rhs.criteriaSpridenMi)||((this.criteriaSpridenMi!= null)&&this.criteriaSpridenMi.equals(rhs.criteriaSpridenMi))));
    }

}
