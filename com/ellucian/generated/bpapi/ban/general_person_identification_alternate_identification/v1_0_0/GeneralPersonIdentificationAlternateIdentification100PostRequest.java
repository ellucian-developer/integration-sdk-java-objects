
package com.ellucian.generated.bpapi.ban.general_person_identification_alternate_identification.v1_0_0;

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
    "spridenMi",
    "spridenId",
    "spridenFirstName",
    "spridenChangeInd",
    "spridenNtypCode",
    "spridenLastName",
    "id",
    "spridenSurnamePrefix"
})
@Generated("jsonschema2pojo")
public class GeneralPersonIdentificationAlternateIdentification100PostRequest {

    /**
     * Middle Name
     * <p>
     * Lineage reference object : SPRIDEN_MI
     * 
     */
    @JsonProperty("spridenMi")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_MI")
    private String spridenMi;
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
     * Name Type
     * <p>
     * Lineage reference object : SPRIDEN_NTYP_CODE, Lookup lineage reference object : gtvntyp
     * 
     */
    @JsonProperty("spridenNtypCode")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_NTYP_CODE, Lookup lineage reference object : gtvntyp")
    private String spridenNtypCode;
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
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private String id;
    /**
     * Last Name Prefix
     * <p>
     * Lineage reference object : SPRIDEN_SURNAME_PREFIX
     * 
     */
    @JsonProperty("spridenSurnamePrefix")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_SURNAME_PREFIX")
    private String spridenSurnamePrefix;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public GeneralPersonIdentificationAlternateIdentification100PostRequest withSpridenMi(String spridenMi) {
        this.spridenMi = spridenMi;
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

    public GeneralPersonIdentificationAlternateIdentification100PostRequest withSpridenId(String spridenId) {
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

    public GeneralPersonIdentificationAlternateIdentification100PostRequest withSpridenFirstName(String spridenFirstName) {
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

    public GeneralPersonIdentificationAlternateIdentification100PostRequest withSpridenChangeInd(String spridenChangeInd) {
        this.spridenChangeInd = spridenChangeInd;
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

    public GeneralPersonIdentificationAlternateIdentification100PostRequest withSpridenNtypCode(String spridenNtypCode) {
        this.spridenNtypCode = spridenNtypCode;
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

    public GeneralPersonIdentificationAlternateIdentification100PostRequest withSpridenLastName(String spridenLastName) {
        this.spridenLastName = spridenLastName;
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

    public GeneralPersonIdentificationAlternateIdentification100PostRequest withId(String id) {
        this.id = id;
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

    public GeneralPersonIdentificationAlternateIdentification100PostRequest withSpridenSurnamePrefix(String spridenSurnamePrefix) {
        this.spridenSurnamePrefix = spridenSurnamePrefix;
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

    public GeneralPersonIdentificationAlternateIdentification100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GeneralPersonIdentificationAlternateIdentification100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("spridenMi");
        sb.append('=');
        sb.append(((this.spridenMi == null)?"<null>":this.spridenMi));
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
        sb.append("spridenNtypCode");
        sb.append('=');
        sb.append(((this.spridenNtypCode == null)?"<null>":this.spridenNtypCode));
        sb.append(',');
        sb.append("spridenLastName");
        sb.append('=');
        sb.append(((this.spridenLastName == null)?"<null>":this.spridenLastName));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("spridenSurnamePrefix");
        sb.append('=');
        sb.append(((this.spridenSurnamePrefix == null)?"<null>":this.spridenSurnamePrefix));
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
        result = ((result* 31)+((this.spridenMi == null)? 0 :this.spridenMi.hashCode()));
        result = ((result* 31)+((this.spridenId == null)? 0 :this.spridenId.hashCode()));
        result = ((result* 31)+((this.spridenFirstName == null)? 0 :this.spridenFirstName.hashCode()));
        result = ((result* 31)+((this.spridenChangeInd == null)? 0 :this.spridenChangeInd.hashCode()));
        result = ((result* 31)+((this.spridenNtypCode == null)? 0 :this.spridenNtypCode.hashCode()));
        result = ((result* 31)+((this.spridenLastName == null)? 0 :this.spridenLastName.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.spridenSurnamePrefix == null)? 0 :this.spridenSurnamePrefix.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeneralPersonIdentificationAlternateIdentification100PostRequest) == false) {
            return false;
        }
        GeneralPersonIdentificationAlternateIdentification100PostRequest rhs = ((GeneralPersonIdentificationAlternateIdentification100PostRequest) other);
        return ((((((((((this.spridenMi == rhs.spridenMi)||((this.spridenMi!= null)&&this.spridenMi.equals(rhs.spridenMi)))&&((this.spridenId == rhs.spridenId)||((this.spridenId!= null)&&this.spridenId.equals(rhs.spridenId))))&&((this.spridenFirstName == rhs.spridenFirstName)||((this.spridenFirstName!= null)&&this.spridenFirstName.equals(rhs.spridenFirstName))))&&((this.spridenChangeInd == rhs.spridenChangeInd)||((this.spridenChangeInd!= null)&&this.spridenChangeInd.equals(rhs.spridenChangeInd))))&&((this.spridenNtypCode == rhs.spridenNtypCode)||((this.spridenNtypCode!= null)&&this.spridenNtypCode.equals(rhs.spridenNtypCode))))&&((this.spridenLastName == rhs.spridenLastName)||((this.spridenLastName!= null)&&this.spridenLastName.equals(rhs.spridenLastName))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.spridenSurnamePrefix == rhs.spridenSurnamePrefix)||((this.spridenSurnamePrefix!= null)&&this.spridenSurnamePrefix.equals(rhs.spridenSurnamePrefix))));
    }

}
