
package com.ellucian.generated.bpapi.ban.general_person_identification_current_identification.v1_0_0;

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
    "persPrefFname",
    "spridenId",
    "persMi",
    "persSuffix",
    "persPrefix",
    "persLastName",
    "spridenNtypCode",
    "persLegalName",
    "id",
    "persFirstName"
})
@Generated("jsonschema2pojo")
public class GeneralPersonIdentificationCurrentIdentification100PutRequest {

    /**
     * Preferred First Name
     * <p>
     * 
     * 
     */
    @JsonProperty("persPrefFname")
    private String persPrefFname;
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
     * Middle Name
     * <p>
     * 
     * 
     */
    @JsonProperty("persMi")
    private String persMi;
    /**
     * Suffix
     * <p>
     * 
     * 
     */
    @JsonProperty("persSuffix")
    private String persSuffix;
    /**
     * Prefix
     * <p>
     * 
     * 
     */
    @JsonProperty("persPrefix")
    private String persPrefix;
    /**
     * Last Name
     * <p>
     * 
     * 
     */
    @JsonProperty("persLastName")
    private String persLastName;
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
     * Full Legal Name
     * <p>
     * 
     * 
     */
    @JsonProperty("persLegalName")
    private String persLegalName;
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
     * 
     * 
     */
    @JsonProperty("persFirstName")
    private String persFirstName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Preferred First Name
     * <p>
     * 
     * 
     */
    @JsonProperty("persPrefFname")
    public String getPersPrefFname() {
        return persPrefFname;
    }

    /**
     * Preferred First Name
     * <p>
     * 
     * 
     */
    @JsonProperty("persPrefFname")
    public void setPersPrefFname(String persPrefFname) {
        this.persPrefFname = persPrefFname;
    }

    public GeneralPersonIdentificationCurrentIdentification100PutRequest withPersPrefFname(String persPrefFname) {
        this.persPrefFname = persPrefFname;
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

    public GeneralPersonIdentificationCurrentIdentification100PutRequest withSpridenId(String spridenId) {
        this.spridenId = spridenId;
        return this;
    }

    /**
     * Middle Name
     * <p>
     * 
     * 
     */
    @JsonProperty("persMi")
    public String getPersMi() {
        return persMi;
    }

    /**
     * Middle Name
     * <p>
     * 
     * 
     */
    @JsonProperty("persMi")
    public void setPersMi(String persMi) {
        this.persMi = persMi;
    }

    public GeneralPersonIdentificationCurrentIdentification100PutRequest withPersMi(String persMi) {
        this.persMi = persMi;
        return this;
    }

    /**
     * Suffix
     * <p>
     * 
     * 
     */
    @JsonProperty("persSuffix")
    public String getPersSuffix() {
        return persSuffix;
    }

    /**
     * Suffix
     * <p>
     * 
     * 
     */
    @JsonProperty("persSuffix")
    public void setPersSuffix(String persSuffix) {
        this.persSuffix = persSuffix;
    }

    public GeneralPersonIdentificationCurrentIdentification100PutRequest withPersSuffix(String persSuffix) {
        this.persSuffix = persSuffix;
        return this;
    }

    /**
     * Prefix
     * <p>
     * 
     * 
     */
    @JsonProperty("persPrefix")
    public String getPersPrefix() {
        return persPrefix;
    }

    /**
     * Prefix
     * <p>
     * 
     * 
     */
    @JsonProperty("persPrefix")
    public void setPersPrefix(String persPrefix) {
        this.persPrefix = persPrefix;
    }

    public GeneralPersonIdentificationCurrentIdentification100PutRequest withPersPrefix(String persPrefix) {
        this.persPrefix = persPrefix;
        return this;
    }

    /**
     * Last Name
     * <p>
     * 
     * 
     */
    @JsonProperty("persLastName")
    public String getPersLastName() {
        return persLastName;
    }

    /**
     * Last Name
     * <p>
     * 
     * 
     */
    @JsonProperty("persLastName")
    public void setPersLastName(String persLastName) {
        this.persLastName = persLastName;
    }

    public GeneralPersonIdentificationCurrentIdentification100PutRequest withPersLastName(String persLastName) {
        this.persLastName = persLastName;
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

    public GeneralPersonIdentificationCurrentIdentification100PutRequest withSpridenNtypCode(String spridenNtypCode) {
        this.spridenNtypCode = spridenNtypCode;
        return this;
    }

    /**
     * Full Legal Name
     * <p>
     * 
     * 
     */
    @JsonProperty("persLegalName")
    public String getPersLegalName() {
        return persLegalName;
    }

    /**
     * Full Legal Name
     * <p>
     * 
     * 
     */
    @JsonProperty("persLegalName")
    public void setPersLegalName(String persLegalName) {
        this.persLegalName = persLegalName;
    }

    public GeneralPersonIdentificationCurrentIdentification100PutRequest withPersLegalName(String persLegalName) {
        this.persLegalName = persLegalName;
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

    public GeneralPersonIdentificationCurrentIdentification100PutRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * First Name
     * <p>
     * 
     * 
     */
    @JsonProperty("persFirstName")
    public String getPersFirstName() {
        return persFirstName;
    }

    /**
     * First Name
     * <p>
     * 
     * 
     */
    @JsonProperty("persFirstName")
    public void setPersFirstName(String persFirstName) {
        this.persFirstName = persFirstName;
    }

    public GeneralPersonIdentificationCurrentIdentification100PutRequest withPersFirstName(String persFirstName) {
        this.persFirstName = persFirstName;
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

    public GeneralPersonIdentificationCurrentIdentification100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GeneralPersonIdentificationCurrentIdentification100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("persPrefFname");
        sb.append('=');
        sb.append(((this.persPrefFname == null)?"<null>":this.persPrefFname));
        sb.append(',');
        sb.append("spridenId");
        sb.append('=');
        sb.append(((this.spridenId == null)?"<null>":this.spridenId));
        sb.append(',');
        sb.append("persMi");
        sb.append('=');
        sb.append(((this.persMi == null)?"<null>":this.persMi));
        sb.append(',');
        sb.append("persSuffix");
        sb.append('=');
        sb.append(((this.persSuffix == null)?"<null>":this.persSuffix));
        sb.append(',');
        sb.append("persPrefix");
        sb.append('=');
        sb.append(((this.persPrefix == null)?"<null>":this.persPrefix));
        sb.append(',');
        sb.append("persLastName");
        sb.append('=');
        sb.append(((this.persLastName == null)?"<null>":this.persLastName));
        sb.append(',');
        sb.append("spridenNtypCode");
        sb.append('=');
        sb.append(((this.spridenNtypCode == null)?"<null>":this.spridenNtypCode));
        sb.append(',');
        sb.append("persLegalName");
        sb.append('=');
        sb.append(((this.persLegalName == null)?"<null>":this.persLegalName));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("persFirstName");
        sb.append('=');
        sb.append(((this.persFirstName == null)?"<null>":this.persFirstName));
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
        result = ((result* 31)+((this.persPrefFname == null)? 0 :this.persPrefFname.hashCode()));
        result = ((result* 31)+((this.spridenId == null)? 0 :this.spridenId.hashCode()));
        result = ((result* 31)+((this.persMi == null)? 0 :this.persMi.hashCode()));
        result = ((result* 31)+((this.persSuffix == null)? 0 :this.persSuffix.hashCode()));
        result = ((result* 31)+((this.persPrefix == null)? 0 :this.persPrefix.hashCode()));
        result = ((result* 31)+((this.persLastName == null)? 0 :this.persLastName.hashCode()));
        result = ((result* 31)+((this.spridenNtypCode == null)? 0 :this.spridenNtypCode.hashCode()));
        result = ((result* 31)+((this.persLegalName == null)? 0 :this.persLegalName.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.persFirstName == null)? 0 :this.persFirstName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeneralPersonIdentificationCurrentIdentification100PutRequest) == false) {
            return false;
        }
        GeneralPersonIdentificationCurrentIdentification100PutRequest rhs = ((GeneralPersonIdentificationCurrentIdentification100PutRequest) other);
        return ((((((((((((this.persPrefFname == rhs.persPrefFname)||((this.persPrefFname!= null)&&this.persPrefFname.equals(rhs.persPrefFname)))&&((this.spridenId == rhs.spridenId)||((this.spridenId!= null)&&this.spridenId.equals(rhs.spridenId))))&&((this.persMi == rhs.persMi)||((this.persMi!= null)&&this.persMi.equals(rhs.persMi))))&&((this.persSuffix == rhs.persSuffix)||((this.persSuffix!= null)&&this.persSuffix.equals(rhs.persSuffix))))&&((this.persPrefix == rhs.persPrefix)||((this.persPrefix!= null)&&this.persPrefix.equals(rhs.persPrefix))))&&((this.persLastName == rhs.persLastName)||((this.persLastName!= null)&&this.persLastName.equals(rhs.persLastName))))&&((this.spridenNtypCode == rhs.spridenNtypCode)||((this.spridenNtypCode!= null)&&this.spridenNtypCode.equals(rhs.spridenNtypCode))))&&((this.persLegalName == rhs.persLegalName)||((this.persLegalName!= null)&&this.persLegalName.equals(rhs.persLegalName))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.persFirstName == rhs.persFirstName)||((this.persFirstName!= null)&&this.persFirstName.equals(rhs.persFirstName))));
    }

}
