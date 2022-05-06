
package com.ellucian.generated.bpapi.ban.general_person_identification.v1_0_0;

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
    "spridenActivityDate",
    "spridenCreateUser",
    "spridenOrigin",
    "spridenMi",
    "previousNtypDesc",
    "spridenId",
    "spridenFirstName",
    "spridenChangeInd",
    "spridenUser",
    "spridenLastName",
    "spridenNtypCode",
    "spridenSurnamePrefix",
    "spridenCreateDate"
})
@Generated("jsonschema2pojo")
public class SpridenPreviou {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SPRIDEN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("spridenActivityDate")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_ACTIVITY_DATE")
    private Date spridenActivityDate;
    /**
     * Create User
     * <p>
     * Lineage reference object : SPRIDEN_CREATE_USER
     * 
     */
    @JsonProperty("spridenCreateUser")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_CREATE_USER")
    private String spridenCreateUser;
    /**
     * Origin
     * <p>
     * Lineage reference object : SPRIDEN_ORIGIN
     * 
     */
    @JsonProperty("spridenOrigin")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_ORIGIN")
    private String spridenOrigin;
    /**
     * Middle Name
     * <p>
     * Lineage reference object : SPRIDEN_MI
     * 
     */
    @JsonProperty("spridenMi")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_MI")
    private String spridenMi;
    @JsonProperty("previousNtypDesc")
    private String previousNtypDesc;
    /**
     * ID
     * <p>
     * Lineage reference object : SPRIDEN_ID
     * 
     */
    @JsonProperty("spridenId")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_ID")
    private String spridenId;
    /**
     * First Name
     * <p>
     * Lineage reference object : SPRIDEN_FIRST_NAME
     * 
     */
    @JsonProperty("spridenFirstName")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_FIRST_NAME")
    private String spridenFirstName;
    /**
     * Change Type
     * <p>
     * Lineage reference object : SPRIDEN_CHANGE_IND
     * 
     */
    @JsonProperty("spridenChangeInd")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_CHANGE_IND")
    private String spridenChangeInd;
    /**
     * User
     * <p>
     * Lineage reference object : SPRIDEN_USER
     * 
     */
    @JsonProperty("spridenUser")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_USER")
    private String spridenUser;
    /**
     * Last Name
     * <p>
     * Lineage reference object : SPRIDEN_LAST_NAME
     * 
     */
    @JsonProperty("spridenLastName")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_LAST_NAME")
    private String spridenLastName;
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
     * Last Name Prefix
     * <p>
     * Lineage reference object : SPRIDEN_SURNAME_PREFIX
     * 
     */
    @JsonProperty("spridenSurnamePrefix")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_SURNAME_PREFIX")
    private String spridenSurnamePrefix;
    /**
     * Create Date
     * <p>
     * Lineage reference object : SPRIDEN_CREATE_DATE
     * 
     */
    @JsonProperty("spridenCreateDate")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_CREATE_DATE")
    private Date spridenCreateDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SPRIDEN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("spridenActivityDate")
    public Date getSpridenActivityDate() {
        return spridenActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SPRIDEN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("spridenActivityDate")
    public void setSpridenActivityDate(Date spridenActivityDate) {
        this.spridenActivityDate = spridenActivityDate;
    }

    public SpridenPreviou withSpridenActivityDate(Date spridenActivityDate) {
        this.spridenActivityDate = spridenActivityDate;
        return this;
    }

    /**
     * Create User
     * <p>
     * Lineage reference object : SPRIDEN_CREATE_USER
     * 
     */
    @JsonProperty("spridenCreateUser")
    public String getSpridenCreateUser() {
        return spridenCreateUser;
    }

    /**
     * Create User
     * <p>
     * Lineage reference object : SPRIDEN_CREATE_USER
     * 
     */
    @JsonProperty("spridenCreateUser")
    public void setSpridenCreateUser(String spridenCreateUser) {
        this.spridenCreateUser = spridenCreateUser;
    }

    public SpridenPreviou withSpridenCreateUser(String spridenCreateUser) {
        this.spridenCreateUser = spridenCreateUser;
        return this;
    }

    /**
     * Origin
     * <p>
     * Lineage reference object : SPRIDEN_ORIGIN
     * 
     */
    @JsonProperty("spridenOrigin")
    public String getSpridenOrigin() {
        return spridenOrigin;
    }

    /**
     * Origin
     * <p>
     * Lineage reference object : SPRIDEN_ORIGIN
     * 
     */
    @JsonProperty("spridenOrigin")
    public void setSpridenOrigin(String spridenOrigin) {
        this.spridenOrigin = spridenOrigin;
    }

    public SpridenPreviou withSpridenOrigin(String spridenOrigin) {
        this.spridenOrigin = spridenOrigin;
        return this;
    }

    /**
     * Middle Name
     * <p>
     * Lineage reference object : SPRIDEN_MI
     * 
     */
    @JsonProperty("spridenMi")
    public String getSpridenMi() {
        return spridenMi;
    }

    /**
     * Middle Name
     * <p>
     * Lineage reference object : SPRIDEN_MI
     * 
     */
    @JsonProperty("spridenMi")
    public void setSpridenMi(String spridenMi) {
        this.spridenMi = spridenMi;
    }

    public SpridenPreviou withSpridenMi(String spridenMi) {
        this.spridenMi = spridenMi;
        return this;
    }

    @JsonProperty("previousNtypDesc")
    public String getPreviousNtypDesc() {
        return previousNtypDesc;
    }

    @JsonProperty("previousNtypDesc")
    public void setPreviousNtypDesc(String previousNtypDesc) {
        this.previousNtypDesc = previousNtypDesc;
    }

    public SpridenPreviou withPreviousNtypDesc(String previousNtypDesc) {
        this.previousNtypDesc = previousNtypDesc;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : SPRIDEN_ID
     * 
     */
    @JsonProperty("spridenId")
    public String getSpridenId() {
        return spridenId;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : SPRIDEN_ID
     * 
     */
    @JsonProperty("spridenId")
    public void setSpridenId(String spridenId) {
        this.spridenId = spridenId;
    }

    public SpridenPreviou withSpridenId(String spridenId) {
        this.spridenId = spridenId;
        return this;
    }

    /**
     * First Name
     * <p>
     * Lineage reference object : SPRIDEN_FIRST_NAME
     * 
     */
    @JsonProperty("spridenFirstName")
    public String getSpridenFirstName() {
        return spridenFirstName;
    }

    /**
     * First Name
     * <p>
     * Lineage reference object : SPRIDEN_FIRST_NAME
     * 
     */
    @JsonProperty("spridenFirstName")
    public void setSpridenFirstName(String spridenFirstName) {
        this.spridenFirstName = spridenFirstName;
    }

    public SpridenPreviou withSpridenFirstName(String spridenFirstName) {
        this.spridenFirstName = spridenFirstName;
        return this;
    }

    /**
     * Change Type
     * <p>
     * Lineage reference object : SPRIDEN_CHANGE_IND
     * 
     */
    @JsonProperty("spridenChangeInd")
    public String getSpridenChangeInd() {
        return spridenChangeInd;
    }

    /**
     * Change Type
     * <p>
     * Lineage reference object : SPRIDEN_CHANGE_IND
     * 
     */
    @JsonProperty("spridenChangeInd")
    public void setSpridenChangeInd(String spridenChangeInd) {
        this.spridenChangeInd = spridenChangeInd;
    }

    public SpridenPreviou withSpridenChangeInd(String spridenChangeInd) {
        this.spridenChangeInd = spridenChangeInd;
        return this;
    }

    /**
     * User
     * <p>
     * Lineage reference object : SPRIDEN_USER
     * 
     */
    @JsonProperty("spridenUser")
    public String getSpridenUser() {
        return spridenUser;
    }

    /**
     * User
     * <p>
     * Lineage reference object : SPRIDEN_USER
     * 
     */
    @JsonProperty("spridenUser")
    public void setSpridenUser(String spridenUser) {
        this.spridenUser = spridenUser;
    }

    public SpridenPreviou withSpridenUser(String spridenUser) {
        this.spridenUser = spridenUser;
        return this;
    }

    /**
     * Last Name
     * <p>
     * Lineage reference object : SPRIDEN_LAST_NAME
     * 
     */
    @JsonProperty("spridenLastName")
    public String getSpridenLastName() {
        return spridenLastName;
    }

    /**
     * Last Name
     * <p>
     * Lineage reference object : SPRIDEN_LAST_NAME
     * 
     */
    @JsonProperty("spridenLastName")
    public void setSpridenLastName(String spridenLastName) {
        this.spridenLastName = spridenLastName;
    }

    public SpridenPreviou withSpridenLastName(String spridenLastName) {
        this.spridenLastName = spridenLastName;
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

    public SpridenPreviou withSpridenNtypCode(String spridenNtypCode) {
        this.spridenNtypCode = spridenNtypCode;
        return this;
    }

    /**
     * Last Name Prefix
     * <p>
     * Lineage reference object : SPRIDEN_SURNAME_PREFIX
     * 
     */
    @JsonProperty("spridenSurnamePrefix")
    public String getSpridenSurnamePrefix() {
        return spridenSurnamePrefix;
    }

    /**
     * Last Name Prefix
     * <p>
     * Lineage reference object : SPRIDEN_SURNAME_PREFIX
     * 
     */
    @JsonProperty("spridenSurnamePrefix")
    public void setSpridenSurnamePrefix(String spridenSurnamePrefix) {
        this.spridenSurnamePrefix = spridenSurnamePrefix;
    }

    public SpridenPreviou withSpridenSurnamePrefix(String spridenSurnamePrefix) {
        this.spridenSurnamePrefix = spridenSurnamePrefix;
        return this;
    }

    /**
     * Create Date
     * <p>
     * Lineage reference object : SPRIDEN_CREATE_DATE
     * 
     */
    @JsonProperty("spridenCreateDate")
    public Date getSpridenCreateDate() {
        return spridenCreateDate;
    }

    /**
     * Create Date
     * <p>
     * Lineage reference object : SPRIDEN_CREATE_DATE
     * 
     */
    @JsonProperty("spridenCreateDate")
    public void setSpridenCreateDate(Date spridenCreateDate) {
        this.spridenCreateDate = spridenCreateDate;
    }

    public SpridenPreviou withSpridenCreateDate(Date spridenCreateDate) {
        this.spridenCreateDate = spridenCreateDate;
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

    public SpridenPreviou withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SpridenPreviou.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("spridenActivityDate");
        sb.append('=');
        sb.append(((this.spridenActivityDate == null)?"<null>":this.spridenActivityDate));
        sb.append(',');
        sb.append("spridenCreateUser");
        sb.append('=');
        sb.append(((this.spridenCreateUser == null)?"<null>":this.spridenCreateUser));
        sb.append(',');
        sb.append("spridenOrigin");
        sb.append('=');
        sb.append(((this.spridenOrigin == null)?"<null>":this.spridenOrigin));
        sb.append(',');
        sb.append("spridenMi");
        sb.append('=');
        sb.append(((this.spridenMi == null)?"<null>":this.spridenMi));
        sb.append(',');
        sb.append("previousNtypDesc");
        sb.append('=');
        sb.append(((this.previousNtypDesc == null)?"<null>":this.previousNtypDesc));
        sb.append(',');
        sb.append("spridenId");
        sb.append('=');
        sb.append(((this.spridenId == null)?"<null>":this.spridenId));
        sb.append(',');
        sb.append("spridenFirstName");
        sb.append('=');
        sb.append(((this.spridenFirstName == null)?"<null>":this.spridenFirstName));
        sb.append(',');
        sb.append("spridenChangeInd");
        sb.append('=');
        sb.append(((this.spridenChangeInd == null)?"<null>":this.spridenChangeInd));
        sb.append(',');
        sb.append("spridenUser");
        sb.append('=');
        sb.append(((this.spridenUser == null)?"<null>":this.spridenUser));
        sb.append(',');
        sb.append("spridenLastName");
        sb.append('=');
        sb.append(((this.spridenLastName == null)?"<null>":this.spridenLastName));
        sb.append(',');
        sb.append("spridenNtypCode");
        sb.append('=');
        sb.append(((this.spridenNtypCode == null)?"<null>":this.spridenNtypCode));
        sb.append(',');
        sb.append("spridenSurnamePrefix");
        sb.append('=');
        sb.append(((this.spridenSurnamePrefix == null)?"<null>":this.spridenSurnamePrefix));
        sb.append(',');
        sb.append("spridenCreateDate");
        sb.append('=');
        sb.append(((this.spridenCreateDate == null)?"<null>":this.spridenCreateDate));
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
        result = ((result* 31)+((this.spridenActivityDate == null)? 0 :this.spridenActivityDate.hashCode()));
        result = ((result* 31)+((this.spridenCreateUser == null)? 0 :this.spridenCreateUser.hashCode()));
        result = ((result* 31)+((this.spridenOrigin == null)? 0 :this.spridenOrigin.hashCode()));
        result = ((result* 31)+((this.spridenMi == null)? 0 :this.spridenMi.hashCode()));
        result = ((result* 31)+((this.previousNtypDesc == null)? 0 :this.previousNtypDesc.hashCode()));
        result = ((result* 31)+((this.spridenId == null)? 0 :this.spridenId.hashCode()));
        result = ((result* 31)+((this.spridenFirstName == null)? 0 :this.spridenFirstName.hashCode()));
        result = ((result* 31)+((this.spridenChangeInd == null)? 0 :this.spridenChangeInd.hashCode()));
        result = ((result* 31)+((this.spridenUser == null)? 0 :this.spridenUser.hashCode()));
        result = ((result* 31)+((this.spridenLastName == null)? 0 :this.spridenLastName.hashCode()));
        result = ((result* 31)+((this.spridenNtypCode == null)? 0 :this.spridenNtypCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.spridenSurnamePrefix == null)? 0 :this.spridenSurnamePrefix.hashCode()));
        result = ((result* 31)+((this.spridenCreateDate == null)? 0 :this.spridenCreateDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SpridenPreviou) == false) {
            return false;
        }
        SpridenPreviou rhs = ((SpridenPreviou) other);
        return (((((((((((((((this.spridenActivityDate == rhs.spridenActivityDate)||((this.spridenActivityDate!= null)&&this.spridenActivityDate.equals(rhs.spridenActivityDate)))&&((this.spridenCreateUser == rhs.spridenCreateUser)||((this.spridenCreateUser!= null)&&this.spridenCreateUser.equals(rhs.spridenCreateUser))))&&((this.spridenOrigin == rhs.spridenOrigin)||((this.spridenOrigin!= null)&&this.spridenOrigin.equals(rhs.spridenOrigin))))&&((this.spridenMi == rhs.spridenMi)||((this.spridenMi!= null)&&this.spridenMi.equals(rhs.spridenMi))))&&((this.previousNtypDesc == rhs.previousNtypDesc)||((this.previousNtypDesc!= null)&&this.previousNtypDesc.equals(rhs.previousNtypDesc))))&&((this.spridenId == rhs.spridenId)||((this.spridenId!= null)&&this.spridenId.equals(rhs.spridenId))))&&((this.spridenFirstName == rhs.spridenFirstName)||((this.spridenFirstName!= null)&&this.spridenFirstName.equals(rhs.spridenFirstName))))&&((this.spridenChangeInd == rhs.spridenChangeInd)||((this.spridenChangeInd!= null)&&this.spridenChangeInd.equals(rhs.spridenChangeInd))))&&((this.spridenUser == rhs.spridenUser)||((this.spridenUser!= null)&&this.spridenUser.equals(rhs.spridenUser))))&&((this.spridenLastName == rhs.spridenLastName)||((this.spridenLastName!= null)&&this.spridenLastName.equals(rhs.spridenLastName))))&&((this.spridenNtypCode == rhs.spridenNtypCode)||((this.spridenNtypCode!= null)&&this.spridenNtypCode.equals(rhs.spridenNtypCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.spridenSurnamePrefix == rhs.spridenSurnamePrefix)||((this.spridenSurnamePrefix!= null)&&this.spridenSurnamePrefix.equals(rhs.spridenSurnamePrefix))))&&((this.spridenCreateDate == rhs.spridenCreateDate)||((this.spridenCreateDate!= null)&&this.spridenCreateDate.equals(rhs.spridenCreateDate))));
    }

}
