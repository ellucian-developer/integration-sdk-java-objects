
package com.ellucian.generated.bpapi.ban.ssn_sin_tin_alternate_id_search.v1_0_0;

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
    "firstName",
    "lastName",
    "changeInd",
    "namePrefix",
    "entityInd",
    "nameSuffix",
    "id",
    "mi",
    "birthDate",
    "ssn"
})
@Generated("jsonschema2pojo")
public class SsnSinTinAlternateIdSearch100GetResponse {

    /**
     * First Name
     * <p>
     * Lineage reference object : GUVALTI_FIRST_NAME
     * 
     */
    @JsonProperty("firstName")
    @JsonPropertyDescription("Lineage reference object : GUVALTI_FIRST_NAME")
    private String firstName;
    /**
     * Last Name
     * <p>
     * Lineage reference object : GUVALTI_LAST_NAME
     * 
     */
    @JsonProperty("lastName")
    @JsonPropertyDescription("Lineage reference object : GUVALTI_LAST_NAME")
    private String lastName;
    /**
     * Change Indicator
     * <p>
     * Lineage reference object : GUVALTI_CHANGE_IND
     * 
     */
    @JsonProperty("changeInd")
    @JsonPropertyDescription("Lineage reference object : GUVALTI_CHANGE_IND")
    private String changeInd;
    /**
     * Prefix
     * <p>
     * Lineage reference object : GUVALTI_NAME_PREFIX
     * 
     */
    @JsonProperty("namePrefix")
    @JsonPropertyDescription("Lineage reference object : GUVALTI_NAME_PREFIX")
    private String namePrefix;
    /**
     * Person or Non-Person
     * <p>
     * Lineage reference object : GUVALTI_ENTITY_IND
     * 
     */
    @JsonProperty("entityInd")
    @JsonPropertyDescription("Lineage reference object : GUVALTI_ENTITY_IND")
    private String entityInd;
    /**
     * Suffix
     * <p>
     * Lineage reference object : GUVALTI_NAME_SUFFIX
     * 
     */
    @JsonProperty("nameSuffix")
    @JsonPropertyDescription("Lineage reference object : GUVALTI_NAME_SUFFIX")
    private String nameSuffix;
    /**
     * ID
     * <p>
     * Lineage reference object : GUVALTI_ID
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : GUVALTI_ID")
    private String id;
    /**
     * Middle Name
     * <p>
     * Lineage reference object : GUVALTI_MI
     * 
     */
    @JsonProperty("mi")
    @JsonPropertyDescription("Lineage reference object : GUVALTI_MI")
    private String mi;
    /**
     * Birthdate
     * <p>
     * Lineage reference object : GUVALTI_BIRTH_DATE
     * 
     */
    @JsonProperty("birthDate")
    @JsonPropertyDescription("Lineage reference object : GUVALTI_BIRTH_DATE")
    private Date birthDate;
    /**
     * SSN/SIN/TIN
     * <p>
     * Lineage reference object : GUVALTI_SSN
     * 
     */
    @JsonProperty("ssn")
    @JsonPropertyDescription("Lineage reference object : GUVALTI_SSN")
    private String ssn;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * First Name
     * <p>
     * Lineage reference object : GUVALTI_FIRST_NAME
     * 
     */
    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    /**
     * First Name
     * <p>
     * Lineage reference object : GUVALTI_FIRST_NAME
     * 
     */
    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public SsnSinTinAlternateIdSearch100GetResponse withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Last Name
     * <p>
     * Lineage reference object : GUVALTI_LAST_NAME
     * 
     */
    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    /**
     * Last Name
     * <p>
     * Lineage reference object : GUVALTI_LAST_NAME
     * 
     */
    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public SsnSinTinAlternateIdSearch100GetResponse withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Change Indicator
     * <p>
     * Lineage reference object : GUVALTI_CHANGE_IND
     * 
     */
    @JsonProperty("changeInd")
    public String getChangeInd() {
        return changeInd;
    }

    /**
     * Change Indicator
     * <p>
     * Lineage reference object : GUVALTI_CHANGE_IND
     * 
     */
    @JsonProperty("changeInd")
    public void setChangeInd(String changeInd) {
        this.changeInd = changeInd;
    }

    public SsnSinTinAlternateIdSearch100GetResponse withChangeInd(String changeInd) {
        this.changeInd = changeInd;
        return this;
    }

    /**
     * Prefix
     * <p>
     * Lineage reference object : GUVALTI_NAME_PREFIX
     * 
     */
    @JsonProperty("namePrefix")
    public String getNamePrefix() {
        return namePrefix;
    }

    /**
     * Prefix
     * <p>
     * Lineage reference object : GUVALTI_NAME_PREFIX
     * 
     */
    @JsonProperty("namePrefix")
    public void setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
    }

    public SsnSinTinAlternateIdSearch100GetResponse withNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
        return this;
    }

    /**
     * Person or Non-Person
     * <p>
     * Lineage reference object : GUVALTI_ENTITY_IND
     * 
     */
    @JsonProperty("entityInd")
    public String getEntityInd() {
        return entityInd;
    }

    /**
     * Person or Non-Person
     * <p>
     * Lineage reference object : GUVALTI_ENTITY_IND
     * 
     */
    @JsonProperty("entityInd")
    public void setEntityInd(String entityInd) {
        this.entityInd = entityInd;
    }

    public SsnSinTinAlternateIdSearch100GetResponse withEntityInd(String entityInd) {
        this.entityInd = entityInd;
        return this;
    }

    /**
     * Suffix
     * <p>
     * Lineage reference object : GUVALTI_NAME_SUFFIX
     * 
     */
    @JsonProperty("nameSuffix")
    public String getNameSuffix() {
        return nameSuffix;
    }

    /**
     * Suffix
     * <p>
     * Lineage reference object : GUVALTI_NAME_SUFFIX
     * 
     */
    @JsonProperty("nameSuffix")
    public void setNameSuffix(String nameSuffix) {
        this.nameSuffix = nameSuffix;
    }

    public SsnSinTinAlternateIdSearch100GetResponse withNameSuffix(String nameSuffix) {
        this.nameSuffix = nameSuffix;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : GUVALTI_ID
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : GUVALTI_ID
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public SsnSinTinAlternateIdSearch100GetResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Middle Name
     * <p>
     * Lineage reference object : GUVALTI_MI
     * 
     */
    @JsonProperty("mi")
    public String getMi() {
        return mi;
    }

    /**
     * Middle Name
     * <p>
     * Lineage reference object : GUVALTI_MI
     * 
     */
    @JsonProperty("mi")
    public void setMi(String mi) {
        this.mi = mi;
    }

    public SsnSinTinAlternateIdSearch100GetResponse withMi(String mi) {
        this.mi = mi;
        return this;
    }

    /**
     * Birthdate
     * <p>
     * Lineage reference object : GUVALTI_BIRTH_DATE
     * 
     */
    @JsonProperty("birthDate")
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * Birthdate
     * <p>
     * Lineage reference object : GUVALTI_BIRTH_DATE
     * 
     */
    @JsonProperty("birthDate")
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public SsnSinTinAlternateIdSearch100GetResponse withBirthDate(Date birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    /**
     * SSN/SIN/TIN
     * <p>
     * Lineage reference object : GUVALTI_SSN
     * 
     */
    @JsonProperty("ssn")
    public String getSsn() {
        return ssn;
    }

    /**
     * SSN/SIN/TIN
     * <p>
     * Lineage reference object : GUVALTI_SSN
     * 
     */
    @JsonProperty("ssn")
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public SsnSinTinAlternateIdSearch100GetResponse withSsn(String ssn) {
        this.ssn = ssn;
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

    public SsnSinTinAlternateIdSearch100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SsnSinTinAlternateIdSearch100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("changeInd");
        sb.append('=');
        sb.append(((this.changeInd == null)?"<null>":this.changeInd));
        sb.append(',');
        sb.append("namePrefix");
        sb.append('=');
        sb.append(((this.namePrefix == null)?"<null>":this.namePrefix));
        sb.append(',');
        sb.append("entityInd");
        sb.append('=');
        sb.append(((this.entityInd == null)?"<null>":this.entityInd));
        sb.append(',');
        sb.append("nameSuffix");
        sb.append('=');
        sb.append(((this.nameSuffix == null)?"<null>":this.nameSuffix));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("mi");
        sb.append('=');
        sb.append(((this.mi == null)?"<null>":this.mi));
        sb.append(',');
        sb.append("birthDate");
        sb.append('=');
        sb.append(((this.birthDate == null)?"<null>":this.birthDate));
        sb.append(',');
        sb.append("ssn");
        sb.append('=');
        sb.append(((this.ssn == null)?"<null>":this.ssn));
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
        result = ((result* 31)+((this.firstName == null)? 0 :this.firstName.hashCode()));
        result = ((result* 31)+((this.lastName == null)? 0 :this.lastName.hashCode()));
        result = ((result* 31)+((this.changeInd == null)? 0 :this.changeInd.hashCode()));
        result = ((result* 31)+((this.namePrefix == null)? 0 :this.namePrefix.hashCode()));
        result = ((result* 31)+((this.entityInd == null)? 0 :this.entityInd.hashCode()));
        result = ((result* 31)+((this.nameSuffix == null)? 0 :this.nameSuffix.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.mi == null)? 0 :this.mi.hashCode()));
        result = ((result* 31)+((this.birthDate == null)? 0 :this.birthDate.hashCode()));
        result = ((result* 31)+((this.ssn == null)? 0 :this.ssn.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SsnSinTinAlternateIdSearch100GetResponse) == false) {
            return false;
        }
        SsnSinTinAlternateIdSearch100GetResponse rhs = ((SsnSinTinAlternateIdSearch100GetResponse) other);
        return ((((((((((((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName)))&&((this.lastName == rhs.lastName)||((this.lastName!= null)&&this.lastName.equals(rhs.lastName))))&&((this.changeInd == rhs.changeInd)||((this.changeInd!= null)&&this.changeInd.equals(rhs.changeInd))))&&((this.namePrefix == rhs.namePrefix)||((this.namePrefix!= null)&&this.namePrefix.equals(rhs.namePrefix))))&&((this.entityInd == rhs.entityInd)||((this.entityInd!= null)&&this.entityInd.equals(rhs.entityInd))))&&((this.nameSuffix == rhs.nameSuffix)||((this.nameSuffix!= null)&&this.nameSuffix.equals(rhs.nameSuffix))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.mi == rhs.mi)||((this.mi!= null)&&this.mi.equals(rhs.mi))))&&((this.birthDate == rhs.birthDate)||((this.birthDate!= null)&&this.birthDate.equals(rhs.birthDate))))&&((this.ssn == rhs.ssn)||((this.ssn!= null)&&this.ssn.equals(rhs.ssn))));
    }

}
