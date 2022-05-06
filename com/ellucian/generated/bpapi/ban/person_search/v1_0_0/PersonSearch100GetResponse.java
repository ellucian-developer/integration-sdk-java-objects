
package com.ellucian.generated.bpapi.ban.person_search.v1_0_0;

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
    "ntypCode",
    "birthdate",
    "namePrefix",
    "nameSuffix",
    "id",
    "mi"
})
@Generated("jsonschema2pojo")
public class PersonSearch100GetResponse {

    /**
     * First Name
     * <p>
     * Lineage reference object : SPRIDEN_FIRST_NAME
     * 
     */
    @JsonProperty("firstName")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_FIRST_NAME")
    private String firstName;
    /**
     * Last Name
     * <p>
     * Lineage reference object : SPRIDEN_LAST_NAME
     * 
     */
    @JsonProperty("lastName")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_LAST_NAME")
    private String lastName;
    /**
     * Change Indicator
     * <p>
     * Lineage reference object : SPRIDEN_CHANGE_IND
     * 
     */
    @JsonProperty("changeInd")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_CHANGE_IND")
    private String changeInd;
    /**
     * Name Type
     * <p>
     * Lineage reference object : SPRIDEN_NTYP_CODE, Lookup lineage reference object : gtvntyp
     * 
     */
    @JsonProperty("ntypCode")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_NTYP_CODE, Lookup lineage reference object : gtvntyp")
    private String ntypCode;
    /**
     * Birth Date
     * <p>
     * 
     * 
     */
    @JsonProperty("birthdate")
    private Date birthdate;
    /**
     * Prefix
     * <p>
     * 
     * 
     */
    @JsonProperty("namePrefix")
    private String namePrefix;
    /**
     * Suffix
     * <p>
     * 
     * 
     */
    @JsonProperty("nameSuffix")
    private String nameSuffix;
    /**
     * ID
     * <p>
     * Lineage reference object : SPRIDEN_ID
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_ID")
    private String id;
    /**
     * Middle Name
     * <p>
     * Lineage reference object : SPRIDEN_MI
     * 
     */
    @JsonProperty("mi")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_MI")
    private String mi;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * First Name
     * <p>
     * Lineage reference object : SPRIDEN_FIRST_NAME
     * 
     */
    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    /**
     * First Name
     * <p>
     * Lineage reference object : SPRIDEN_FIRST_NAME
     * 
     */
    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public PersonSearch100GetResponse withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Last Name
     * <p>
     * Lineage reference object : SPRIDEN_LAST_NAME
     * 
     */
    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    /**
     * Last Name
     * <p>
     * Lineage reference object : SPRIDEN_LAST_NAME
     * 
     */
    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public PersonSearch100GetResponse withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Change Indicator
     * <p>
     * Lineage reference object : SPRIDEN_CHANGE_IND
     * 
     */
    @JsonProperty("changeInd")
    public String getChangeInd() {
        return changeInd;
    }

    /**
     * Change Indicator
     * <p>
     * Lineage reference object : SPRIDEN_CHANGE_IND
     * 
     */
    @JsonProperty("changeInd")
    public void setChangeInd(String changeInd) {
        this.changeInd = changeInd;
    }

    public PersonSearch100GetResponse withChangeInd(String changeInd) {
        this.changeInd = changeInd;
        return this;
    }

    /**
     * Name Type
     * <p>
     * Lineage reference object : SPRIDEN_NTYP_CODE, Lookup lineage reference object : gtvntyp
     * 
     */
    @JsonProperty("ntypCode")
    public String getNtypCode() {
        return ntypCode;
    }

    /**
     * Name Type
     * <p>
     * Lineage reference object : SPRIDEN_NTYP_CODE, Lookup lineage reference object : gtvntyp
     * 
     */
    @JsonProperty("ntypCode")
    public void setNtypCode(String ntypCode) {
        this.ntypCode = ntypCode;
    }

    public PersonSearch100GetResponse withNtypCode(String ntypCode) {
        this.ntypCode = ntypCode;
        return this;
    }

    /**
     * Birth Date
     * <p>
     * 
     * 
     */
    @JsonProperty("birthdate")
    public Date getBirthdate() {
        return birthdate;
    }

    /**
     * Birth Date
     * <p>
     * 
     * 
     */
    @JsonProperty("birthdate")
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public PersonSearch100GetResponse withBirthdate(Date birthdate) {
        this.birthdate = birthdate;
        return this;
    }

    /**
     * Prefix
     * <p>
     * 
     * 
     */
    @JsonProperty("namePrefix")
    public String getNamePrefix() {
        return namePrefix;
    }

    /**
     * Prefix
     * <p>
     * 
     * 
     */
    @JsonProperty("namePrefix")
    public void setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
    }

    public PersonSearch100GetResponse withNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
        return this;
    }

    /**
     * Suffix
     * <p>
     * 
     * 
     */
    @JsonProperty("nameSuffix")
    public String getNameSuffix() {
        return nameSuffix;
    }

    /**
     * Suffix
     * <p>
     * 
     * 
     */
    @JsonProperty("nameSuffix")
    public void setNameSuffix(String nameSuffix) {
        this.nameSuffix = nameSuffix;
    }

    public PersonSearch100GetResponse withNameSuffix(String nameSuffix) {
        this.nameSuffix = nameSuffix;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : SPRIDEN_ID
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : SPRIDEN_ID
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public PersonSearch100GetResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Middle Name
     * <p>
     * Lineage reference object : SPRIDEN_MI
     * 
     */
    @JsonProperty("mi")
    public String getMi() {
        return mi;
    }

    /**
     * Middle Name
     * <p>
     * Lineage reference object : SPRIDEN_MI
     * 
     */
    @JsonProperty("mi")
    public void setMi(String mi) {
        this.mi = mi;
    }

    public PersonSearch100GetResponse withMi(String mi) {
        this.mi = mi;
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

    public PersonSearch100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PersonSearch100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("ntypCode");
        sb.append('=');
        sb.append(((this.ntypCode == null)?"<null>":this.ntypCode));
        sb.append(',');
        sb.append("birthdate");
        sb.append('=');
        sb.append(((this.birthdate == null)?"<null>":this.birthdate));
        sb.append(',');
        sb.append("namePrefix");
        sb.append('=');
        sb.append(((this.namePrefix == null)?"<null>":this.namePrefix));
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
        result = ((result* 31)+((this.ntypCode == null)? 0 :this.ntypCode.hashCode()));
        result = ((result* 31)+((this.birthdate == null)? 0 :this.birthdate.hashCode()));
        result = ((result* 31)+((this.namePrefix == null)? 0 :this.namePrefix.hashCode()));
        result = ((result* 31)+((this.nameSuffix == null)? 0 :this.nameSuffix.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.mi == null)? 0 :this.mi.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PersonSearch100GetResponse) == false) {
            return false;
        }
        PersonSearch100GetResponse rhs = ((PersonSearch100GetResponse) other);
        return (((((((((((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName)))&&((this.lastName == rhs.lastName)||((this.lastName!= null)&&this.lastName.equals(rhs.lastName))))&&((this.changeInd == rhs.changeInd)||((this.changeInd!= null)&&this.changeInd.equals(rhs.changeInd))))&&((this.ntypCode == rhs.ntypCode)||((this.ntypCode!= null)&&this.ntypCode.equals(rhs.ntypCode))))&&((this.birthdate == rhs.birthdate)||((this.birthdate!= null)&&this.birthdate.equals(rhs.birthdate))))&&((this.namePrefix == rhs.namePrefix)||((this.namePrefix!= null)&&this.namePrefix.equals(rhs.namePrefix))))&&((this.nameSuffix == rhs.nameSuffix)||((this.nameSuffix!= null)&&this.nameSuffix.equals(rhs.nameSuffix))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.mi == rhs.mi)||((this.mi!= null)&&this.mi.equals(rhs.mi))));
    }

}
