
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
    "criteria.nameSuffix",
    "criteria.entityInd",
    "criteria.firstName",
    "criteria.namePrefix",
    "criteria.mi",
    "criteria.id",
    "criteria.ssn",
    "criteria.changeInd",
    "criteria.lastName",
    "criteria.birthDate",
    "ssn"
})
@Generated("jsonschema2pojo")
public class SsnSinTinAlternateIdSearch100GetRequest {

    /**
     * Suffix
     * <p>
     * Lineage reference object : GUVALTI_NAME_SUFFIX
     * 
     */
    @JsonProperty("criteria.nameSuffix")
    @JsonPropertyDescription("Lineage reference object : GUVALTI_NAME_SUFFIX")
    private String criteriaNameSuffix;
    /**
     * Person or Non-Person
     * <p>
     * Lineage reference object : GUVALTI_ENTITY_IND
     * 
     */
    @JsonProperty("criteria.entityInd")
    @JsonPropertyDescription("Lineage reference object : GUVALTI_ENTITY_IND")
    private String criteriaEntityInd;
    /**
     * First Name
     * <p>
     * Lineage reference object : GUVALTI_FIRST_NAME
     * 
     */
    @JsonProperty("criteria.firstName")
    @JsonPropertyDescription("Lineage reference object : GUVALTI_FIRST_NAME")
    private String criteriaFirstName;
    /**
     * Prefix
     * <p>
     * Lineage reference object : GUVALTI_NAME_PREFIX
     * 
     */
    @JsonProperty("criteria.namePrefix")
    @JsonPropertyDescription("Lineage reference object : GUVALTI_NAME_PREFIX")
    private String criteriaNamePrefix;
    /**
     * Middle Name
     * <p>
     * Lineage reference object : GUVALTI_MI
     * 
     */
    @JsonProperty("criteria.mi")
    @JsonPropertyDescription("Lineage reference object : GUVALTI_MI")
    private String criteriaMi;
    /**
     * ID
     * <p>
     * Lineage reference object : GUVALTI_ID
     * 
     */
    @JsonProperty("criteria.id")
    @JsonPropertyDescription("Lineage reference object : GUVALTI_ID")
    private String criteriaId;
    /**
     * SSN/SIN/TIN
     * <p>
     * Lineage reference object : GUVALTI_SSN
     * 
     */
    @JsonProperty("criteria.ssn")
    @JsonPropertyDescription("Lineage reference object : GUVALTI_SSN")
    private String criteriaSsn;
    /**
     * Change Indicator
     * <p>
     * Lineage reference object : GUVALTI_CHANGE_IND
     * 
     */
    @JsonProperty("criteria.changeInd")
    @JsonPropertyDescription("Lineage reference object : GUVALTI_CHANGE_IND")
    private String criteriaChangeInd;
    /**
     * Last Name
     * <p>
     * Lineage reference object : GUVALTI_LAST_NAME
     * 
     */
    @JsonProperty("criteria.lastName")
    @JsonPropertyDescription("Lineage reference object : GUVALTI_LAST_NAME")
    private String criteriaLastName;
    /**
     * Birthdate
     * <p>
     * Lineage reference object : GUVALTI_BIRTH_DATE
     * 
     */
    @JsonProperty("criteria.birthDate")
    @JsonPropertyDescription("Lineage reference object : GUVALTI_BIRTH_DATE")
    private Date criteriaBirthDate;
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
     * Suffix
     * <p>
     * Lineage reference object : GUVALTI_NAME_SUFFIX
     * 
     */
    @JsonProperty("criteria.nameSuffix")
    public String getCriteriaNameSuffix() {
        return criteriaNameSuffix;
    }

    /**
     * Suffix
     * <p>
     * Lineage reference object : GUVALTI_NAME_SUFFIX
     * 
     */
    @JsonProperty("criteria.nameSuffix")
    public void setCriteriaNameSuffix(String criteriaNameSuffix) {
        this.criteriaNameSuffix = criteriaNameSuffix;
    }

    public SsnSinTinAlternateIdSearch100GetRequest withCriteriaNameSuffix(String criteriaNameSuffix) {
        this.criteriaNameSuffix = criteriaNameSuffix;
        return this;
    }

    /**
     * Person or Non-Person
     * <p>
     * Lineage reference object : GUVALTI_ENTITY_IND
     * 
     */
    @JsonProperty("criteria.entityInd")
    public String getCriteriaEntityInd() {
        return criteriaEntityInd;
    }

    /**
     * Person or Non-Person
     * <p>
     * Lineage reference object : GUVALTI_ENTITY_IND
     * 
     */
    @JsonProperty("criteria.entityInd")
    public void setCriteriaEntityInd(String criteriaEntityInd) {
        this.criteriaEntityInd = criteriaEntityInd;
    }

    public SsnSinTinAlternateIdSearch100GetRequest withCriteriaEntityInd(String criteriaEntityInd) {
        this.criteriaEntityInd = criteriaEntityInd;
        return this;
    }

    /**
     * First Name
     * <p>
     * Lineage reference object : GUVALTI_FIRST_NAME
     * 
     */
    @JsonProperty("criteria.firstName")
    public String getCriteriaFirstName() {
        return criteriaFirstName;
    }

    /**
     * First Name
     * <p>
     * Lineage reference object : GUVALTI_FIRST_NAME
     * 
     */
    @JsonProperty("criteria.firstName")
    public void setCriteriaFirstName(String criteriaFirstName) {
        this.criteriaFirstName = criteriaFirstName;
    }

    public SsnSinTinAlternateIdSearch100GetRequest withCriteriaFirstName(String criteriaFirstName) {
        this.criteriaFirstName = criteriaFirstName;
        return this;
    }

    /**
     * Prefix
     * <p>
     * Lineage reference object : GUVALTI_NAME_PREFIX
     * 
     */
    @JsonProperty("criteria.namePrefix")
    public String getCriteriaNamePrefix() {
        return criteriaNamePrefix;
    }

    /**
     * Prefix
     * <p>
     * Lineage reference object : GUVALTI_NAME_PREFIX
     * 
     */
    @JsonProperty("criteria.namePrefix")
    public void setCriteriaNamePrefix(String criteriaNamePrefix) {
        this.criteriaNamePrefix = criteriaNamePrefix;
    }

    public SsnSinTinAlternateIdSearch100GetRequest withCriteriaNamePrefix(String criteriaNamePrefix) {
        this.criteriaNamePrefix = criteriaNamePrefix;
        return this;
    }

    /**
     * Middle Name
     * <p>
     * Lineage reference object : GUVALTI_MI
     * 
     */
    @JsonProperty("criteria.mi")
    public String getCriteriaMi() {
        return criteriaMi;
    }

    /**
     * Middle Name
     * <p>
     * Lineage reference object : GUVALTI_MI
     * 
     */
    @JsonProperty("criteria.mi")
    public void setCriteriaMi(String criteriaMi) {
        this.criteriaMi = criteriaMi;
    }

    public SsnSinTinAlternateIdSearch100GetRequest withCriteriaMi(String criteriaMi) {
        this.criteriaMi = criteriaMi;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : GUVALTI_ID
     * 
     */
    @JsonProperty("criteria.id")
    public String getCriteriaId() {
        return criteriaId;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : GUVALTI_ID
     * 
     */
    @JsonProperty("criteria.id")
    public void setCriteriaId(String criteriaId) {
        this.criteriaId = criteriaId;
    }

    public SsnSinTinAlternateIdSearch100GetRequest withCriteriaId(String criteriaId) {
        this.criteriaId = criteriaId;
        return this;
    }

    /**
     * SSN/SIN/TIN
     * <p>
     * Lineage reference object : GUVALTI_SSN
     * 
     */
    @JsonProperty("criteria.ssn")
    public String getCriteriaSsn() {
        return criteriaSsn;
    }

    /**
     * SSN/SIN/TIN
     * <p>
     * Lineage reference object : GUVALTI_SSN
     * 
     */
    @JsonProperty("criteria.ssn")
    public void setCriteriaSsn(String criteriaSsn) {
        this.criteriaSsn = criteriaSsn;
    }

    public SsnSinTinAlternateIdSearch100GetRequest withCriteriaSsn(String criteriaSsn) {
        this.criteriaSsn = criteriaSsn;
        return this;
    }

    /**
     * Change Indicator
     * <p>
     * Lineage reference object : GUVALTI_CHANGE_IND
     * 
     */
    @JsonProperty("criteria.changeInd")
    public String getCriteriaChangeInd() {
        return criteriaChangeInd;
    }

    /**
     * Change Indicator
     * <p>
     * Lineage reference object : GUVALTI_CHANGE_IND
     * 
     */
    @JsonProperty("criteria.changeInd")
    public void setCriteriaChangeInd(String criteriaChangeInd) {
        this.criteriaChangeInd = criteriaChangeInd;
    }

    public SsnSinTinAlternateIdSearch100GetRequest withCriteriaChangeInd(String criteriaChangeInd) {
        this.criteriaChangeInd = criteriaChangeInd;
        return this;
    }

    /**
     * Last Name
     * <p>
     * Lineage reference object : GUVALTI_LAST_NAME
     * 
     */
    @JsonProperty("criteria.lastName")
    public String getCriteriaLastName() {
        return criteriaLastName;
    }

    /**
     * Last Name
     * <p>
     * Lineage reference object : GUVALTI_LAST_NAME
     * 
     */
    @JsonProperty("criteria.lastName")
    public void setCriteriaLastName(String criteriaLastName) {
        this.criteriaLastName = criteriaLastName;
    }

    public SsnSinTinAlternateIdSearch100GetRequest withCriteriaLastName(String criteriaLastName) {
        this.criteriaLastName = criteriaLastName;
        return this;
    }

    /**
     * Birthdate
     * <p>
     * Lineage reference object : GUVALTI_BIRTH_DATE
     * 
     */
    @JsonProperty("criteria.birthDate")
    public Date getCriteriaBirthDate() {
        return criteriaBirthDate;
    }

    /**
     * Birthdate
     * <p>
     * Lineage reference object : GUVALTI_BIRTH_DATE
     * 
     */
    @JsonProperty("criteria.birthDate")
    public void setCriteriaBirthDate(Date criteriaBirthDate) {
        this.criteriaBirthDate = criteriaBirthDate;
    }

    public SsnSinTinAlternateIdSearch100GetRequest withCriteriaBirthDate(Date criteriaBirthDate) {
        this.criteriaBirthDate = criteriaBirthDate;
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

    public SsnSinTinAlternateIdSearch100GetRequest withSsn(String ssn) {
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

    public SsnSinTinAlternateIdSearch100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SsnSinTinAlternateIdSearch100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaNameSuffix");
        sb.append('=');
        sb.append(((this.criteriaNameSuffix == null)?"<null>":this.criteriaNameSuffix));
        sb.append(',');
        sb.append("criteriaEntityInd");
        sb.append('=');
        sb.append(((this.criteriaEntityInd == null)?"<null>":this.criteriaEntityInd));
        sb.append(',');
        sb.append("criteriaFirstName");
        sb.append('=');
        sb.append(((this.criteriaFirstName == null)?"<null>":this.criteriaFirstName));
        sb.append(',');
        sb.append("criteriaNamePrefix");
        sb.append('=');
        sb.append(((this.criteriaNamePrefix == null)?"<null>":this.criteriaNamePrefix));
        sb.append(',');
        sb.append("criteriaMi");
        sb.append('=');
        sb.append(((this.criteriaMi == null)?"<null>":this.criteriaMi));
        sb.append(',');
        sb.append("criteriaId");
        sb.append('=');
        sb.append(((this.criteriaId == null)?"<null>":this.criteriaId));
        sb.append(',');
        sb.append("criteriaSsn");
        sb.append('=');
        sb.append(((this.criteriaSsn == null)?"<null>":this.criteriaSsn));
        sb.append(',');
        sb.append("criteriaChangeInd");
        sb.append('=');
        sb.append(((this.criteriaChangeInd == null)?"<null>":this.criteriaChangeInd));
        sb.append(',');
        sb.append("criteriaLastName");
        sb.append('=');
        sb.append(((this.criteriaLastName == null)?"<null>":this.criteriaLastName));
        sb.append(',');
        sb.append("criteriaBirthDate");
        sb.append('=');
        sb.append(((this.criteriaBirthDate == null)?"<null>":this.criteriaBirthDate));
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
        result = ((result* 31)+((this.criteriaEntityInd == null)? 0 :this.criteriaEntityInd.hashCode()));
        result = ((result* 31)+((this.criteriaMi == null)? 0 :this.criteriaMi.hashCode()));
        result = ((result* 31)+((this.criteriaId == null)? 0 :this.criteriaId.hashCode()));
        result = ((result* 31)+((this.criteriaLastName == null)? 0 :this.criteriaLastName.hashCode()));
        result = ((result* 31)+((this.criteriaBirthDate == null)? 0 :this.criteriaBirthDate.hashCode()));
        result = ((result* 31)+((this.criteriaNameSuffix == null)? 0 :this.criteriaNameSuffix.hashCode()));
        result = ((result* 31)+((this.ssn == null)? 0 :this.ssn.hashCode()));
        result = ((result* 31)+((this.criteriaChangeInd == null)? 0 :this.criteriaChangeInd.hashCode()));
        result = ((result* 31)+((this.criteriaFirstName == null)? 0 :this.criteriaFirstName.hashCode()));
        result = ((result* 31)+((this.criteriaNamePrefix == null)? 0 :this.criteriaNamePrefix.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaSsn == null)? 0 :this.criteriaSsn.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SsnSinTinAlternateIdSearch100GetRequest) == false) {
            return false;
        }
        SsnSinTinAlternateIdSearch100GetRequest rhs = ((SsnSinTinAlternateIdSearch100GetRequest) other);
        return (((((((((((((this.criteriaEntityInd == rhs.criteriaEntityInd)||((this.criteriaEntityInd!= null)&&this.criteriaEntityInd.equals(rhs.criteriaEntityInd)))&&((this.criteriaMi == rhs.criteriaMi)||((this.criteriaMi!= null)&&this.criteriaMi.equals(rhs.criteriaMi))))&&((this.criteriaId == rhs.criteriaId)||((this.criteriaId!= null)&&this.criteriaId.equals(rhs.criteriaId))))&&((this.criteriaLastName == rhs.criteriaLastName)||((this.criteriaLastName!= null)&&this.criteriaLastName.equals(rhs.criteriaLastName))))&&((this.criteriaBirthDate == rhs.criteriaBirthDate)||((this.criteriaBirthDate!= null)&&this.criteriaBirthDate.equals(rhs.criteriaBirthDate))))&&((this.criteriaNameSuffix == rhs.criteriaNameSuffix)||((this.criteriaNameSuffix!= null)&&this.criteriaNameSuffix.equals(rhs.criteriaNameSuffix))))&&((this.ssn == rhs.ssn)||((this.ssn!= null)&&this.ssn.equals(rhs.ssn))))&&((this.criteriaChangeInd == rhs.criteriaChangeInd)||((this.criteriaChangeInd!= null)&&this.criteriaChangeInd.equals(rhs.criteriaChangeInd))))&&((this.criteriaFirstName == rhs.criteriaFirstName)||((this.criteriaFirstName!= null)&&this.criteriaFirstName.equals(rhs.criteriaFirstName))))&&((this.criteriaNamePrefix == rhs.criteriaNamePrefix)||((this.criteriaNamePrefix!= null)&&this.criteriaNamePrefix.equals(rhs.criteriaNamePrefix))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaSsn == rhs.criteriaSsn)||((this.criteriaSsn!= null)&&this.criteriaSsn.equals(rhs.criteriaSsn))));
    }

}
