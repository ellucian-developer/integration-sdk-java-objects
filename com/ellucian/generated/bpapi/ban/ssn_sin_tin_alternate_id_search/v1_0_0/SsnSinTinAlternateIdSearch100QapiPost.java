
package com.ellucian.generated.bpapi.ban.ssn_sin_tin_alternate_id_search.v1_0_0;

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
    "criteria.ssn",
    "criteria.id",
    "criteria.entityInd",
    "criteria.lastName",
    "criteria.firstName",
    "criteria.mi",
    "criteria.namePrefix",
    "criteria.nameSuffix",
    "criteria.birthDate",
    "criteria.changeInd",
    "ssn"
})
@Generated("jsonschema2pojo")
public class SsnSinTinAlternateIdSearch100QapiPost {

    @JsonProperty("criteria.ssn")
    private String criteriaSsn;
    @JsonProperty("criteria.id")
    private String criteriaId;
    @JsonProperty("criteria.entityInd")
    private String criteriaEntityInd;
    @JsonProperty("criteria.lastName")
    private String criteriaLastName;
    @JsonProperty("criteria.firstName")
    private String criteriaFirstName;
    @JsonProperty("criteria.mi")
    private String criteriaMi;
    @JsonProperty("criteria.namePrefix")
    private String criteriaNamePrefix;
    @JsonProperty("criteria.nameSuffix")
    private String criteriaNameSuffix;
    @JsonProperty("criteria.birthDate")
    private String criteriaBirthDate;
    @JsonProperty("criteria.changeInd")
    private String criteriaChangeInd;
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

    @JsonProperty("criteria.ssn")
    public String getCriteriaSsn() {
        return criteriaSsn;
    }

    @JsonProperty("criteria.ssn")
    public void setCriteriaSsn(String criteriaSsn) {
        this.criteriaSsn = criteriaSsn;
    }

    public SsnSinTinAlternateIdSearch100QapiPost withCriteriaSsn(String criteriaSsn) {
        this.criteriaSsn = criteriaSsn;
        return this;
    }

    @JsonProperty("criteria.id")
    public String getCriteriaId() {
        return criteriaId;
    }

    @JsonProperty("criteria.id")
    public void setCriteriaId(String criteriaId) {
        this.criteriaId = criteriaId;
    }

    public SsnSinTinAlternateIdSearch100QapiPost withCriteriaId(String criteriaId) {
        this.criteriaId = criteriaId;
        return this;
    }

    @JsonProperty("criteria.entityInd")
    public String getCriteriaEntityInd() {
        return criteriaEntityInd;
    }

    @JsonProperty("criteria.entityInd")
    public void setCriteriaEntityInd(String criteriaEntityInd) {
        this.criteriaEntityInd = criteriaEntityInd;
    }

    public SsnSinTinAlternateIdSearch100QapiPost withCriteriaEntityInd(String criteriaEntityInd) {
        this.criteriaEntityInd = criteriaEntityInd;
        return this;
    }

    @JsonProperty("criteria.lastName")
    public String getCriteriaLastName() {
        return criteriaLastName;
    }

    @JsonProperty("criteria.lastName")
    public void setCriteriaLastName(String criteriaLastName) {
        this.criteriaLastName = criteriaLastName;
    }

    public SsnSinTinAlternateIdSearch100QapiPost withCriteriaLastName(String criteriaLastName) {
        this.criteriaLastName = criteriaLastName;
        return this;
    }

    @JsonProperty("criteria.firstName")
    public String getCriteriaFirstName() {
        return criteriaFirstName;
    }

    @JsonProperty("criteria.firstName")
    public void setCriteriaFirstName(String criteriaFirstName) {
        this.criteriaFirstName = criteriaFirstName;
    }

    public SsnSinTinAlternateIdSearch100QapiPost withCriteriaFirstName(String criteriaFirstName) {
        this.criteriaFirstName = criteriaFirstName;
        return this;
    }

    @JsonProperty("criteria.mi")
    public String getCriteriaMi() {
        return criteriaMi;
    }

    @JsonProperty("criteria.mi")
    public void setCriteriaMi(String criteriaMi) {
        this.criteriaMi = criteriaMi;
    }

    public SsnSinTinAlternateIdSearch100QapiPost withCriteriaMi(String criteriaMi) {
        this.criteriaMi = criteriaMi;
        return this;
    }

    @JsonProperty("criteria.namePrefix")
    public String getCriteriaNamePrefix() {
        return criteriaNamePrefix;
    }

    @JsonProperty("criteria.namePrefix")
    public void setCriteriaNamePrefix(String criteriaNamePrefix) {
        this.criteriaNamePrefix = criteriaNamePrefix;
    }

    public SsnSinTinAlternateIdSearch100QapiPost withCriteriaNamePrefix(String criteriaNamePrefix) {
        this.criteriaNamePrefix = criteriaNamePrefix;
        return this;
    }

    @JsonProperty("criteria.nameSuffix")
    public String getCriteriaNameSuffix() {
        return criteriaNameSuffix;
    }

    @JsonProperty("criteria.nameSuffix")
    public void setCriteriaNameSuffix(String criteriaNameSuffix) {
        this.criteriaNameSuffix = criteriaNameSuffix;
    }

    public SsnSinTinAlternateIdSearch100QapiPost withCriteriaNameSuffix(String criteriaNameSuffix) {
        this.criteriaNameSuffix = criteriaNameSuffix;
        return this;
    }

    @JsonProperty("criteria.birthDate")
    public String getCriteriaBirthDate() {
        return criteriaBirthDate;
    }

    @JsonProperty("criteria.birthDate")
    public void setCriteriaBirthDate(String criteriaBirthDate) {
        this.criteriaBirthDate = criteriaBirthDate;
    }

    public SsnSinTinAlternateIdSearch100QapiPost withCriteriaBirthDate(String criteriaBirthDate) {
        this.criteriaBirthDate = criteriaBirthDate;
        return this;
    }

    @JsonProperty("criteria.changeInd")
    public String getCriteriaChangeInd() {
        return criteriaChangeInd;
    }

    @JsonProperty("criteria.changeInd")
    public void setCriteriaChangeInd(String criteriaChangeInd) {
        this.criteriaChangeInd = criteriaChangeInd;
    }

    public SsnSinTinAlternateIdSearch100QapiPost withCriteriaChangeInd(String criteriaChangeInd) {
        this.criteriaChangeInd = criteriaChangeInd;
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

    public SsnSinTinAlternateIdSearch100QapiPost withSsn(String ssn) {
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

    public SsnSinTinAlternateIdSearch100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SsnSinTinAlternateIdSearch100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaSsn");
        sb.append('=');
        sb.append(((this.criteriaSsn == null)?"<null>":this.criteriaSsn));
        sb.append(',');
        sb.append("criteriaId");
        sb.append('=');
        sb.append(((this.criteriaId == null)?"<null>":this.criteriaId));
        sb.append(',');
        sb.append("criteriaEntityInd");
        sb.append('=');
        sb.append(((this.criteriaEntityInd == null)?"<null>":this.criteriaEntityInd));
        sb.append(',');
        sb.append("criteriaLastName");
        sb.append('=');
        sb.append(((this.criteriaLastName == null)?"<null>":this.criteriaLastName));
        sb.append(',');
        sb.append("criteriaFirstName");
        sb.append('=');
        sb.append(((this.criteriaFirstName == null)?"<null>":this.criteriaFirstName));
        sb.append(',');
        sb.append("criteriaMi");
        sb.append('=');
        sb.append(((this.criteriaMi == null)?"<null>":this.criteriaMi));
        sb.append(',');
        sb.append("criteriaNamePrefix");
        sb.append('=');
        sb.append(((this.criteriaNamePrefix == null)?"<null>":this.criteriaNamePrefix));
        sb.append(',');
        sb.append("criteriaNameSuffix");
        sb.append('=');
        sb.append(((this.criteriaNameSuffix == null)?"<null>":this.criteriaNameSuffix));
        sb.append(',');
        sb.append("criteriaBirthDate");
        sb.append('=');
        sb.append(((this.criteriaBirthDate == null)?"<null>":this.criteriaBirthDate));
        sb.append(',');
        sb.append("criteriaChangeInd");
        sb.append('=');
        sb.append(((this.criteriaChangeInd == null)?"<null>":this.criteriaChangeInd));
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
        if ((other instanceof SsnSinTinAlternateIdSearch100QapiPost) == false) {
            return false;
        }
        SsnSinTinAlternateIdSearch100QapiPost rhs = ((SsnSinTinAlternateIdSearch100QapiPost) other);
        return (((((((((((((this.criteriaEntityInd == rhs.criteriaEntityInd)||((this.criteriaEntityInd!= null)&&this.criteriaEntityInd.equals(rhs.criteriaEntityInd)))&&((this.criteriaMi == rhs.criteriaMi)||((this.criteriaMi!= null)&&this.criteriaMi.equals(rhs.criteriaMi))))&&((this.criteriaId == rhs.criteriaId)||((this.criteriaId!= null)&&this.criteriaId.equals(rhs.criteriaId))))&&((this.criteriaLastName == rhs.criteriaLastName)||((this.criteriaLastName!= null)&&this.criteriaLastName.equals(rhs.criteriaLastName))))&&((this.criteriaBirthDate == rhs.criteriaBirthDate)||((this.criteriaBirthDate!= null)&&this.criteriaBirthDate.equals(rhs.criteriaBirthDate))))&&((this.criteriaNameSuffix == rhs.criteriaNameSuffix)||((this.criteriaNameSuffix!= null)&&this.criteriaNameSuffix.equals(rhs.criteriaNameSuffix))))&&((this.ssn == rhs.ssn)||((this.ssn!= null)&&this.ssn.equals(rhs.ssn))))&&((this.criteriaChangeInd == rhs.criteriaChangeInd)||((this.criteriaChangeInd!= null)&&this.criteriaChangeInd.equals(rhs.criteriaChangeInd))))&&((this.criteriaFirstName == rhs.criteriaFirstName)||((this.criteriaFirstName!= null)&&this.criteriaFirstName.equals(rhs.criteriaFirstName))))&&((this.criteriaNamePrefix == rhs.criteriaNamePrefix)||((this.criteriaNamePrefix!= null)&&this.criteriaNamePrefix.equals(rhs.criteriaNamePrefix))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaSsn == rhs.criteriaSsn)||((this.criteriaSsn!= null)&&this.criteriaSsn.equals(rhs.criteriaSsn))));
    }

}
