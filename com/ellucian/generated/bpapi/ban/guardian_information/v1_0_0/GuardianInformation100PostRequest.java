
package com.ellucian.generated.bpapi.ban.guardian_information.v1_0_0;

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
    "parentNameSuffix",
    "reltCode",
    "surnamePrefix",
    "parentLast",
    "parentDegree",
    "parentMi",
    "parentJobTitle",
    "parentEmployer",
    "parentNamePrefix",
    "id",
    "parentFirst",
    "atypCode",
    "deceasedInd"
})
@Generated("jsonschema2pojo")
public class GuardianInformation100PostRequest {

    /**
     * Suffix
     * <p>
     * Lineage reference object : SORFOLK_PARENT_NAME_SUFFIX
     * 
     */
    @JsonProperty("parentNameSuffix")
    @JsonPropertyDescription("Lineage reference object : SORFOLK_PARENT_NAME_SUFFIX")
    private String parentNameSuffix;
    /**
     * Relationship
     * <p>
     * Lineage reference object : SORFOLK_RELT_CODE, Lookup lineage reference object : stvrelt
     * (Required)
     * 
     */
    @JsonProperty("reltCode")
    @JsonPropertyDescription("Lineage reference object : SORFOLK_RELT_CODE, Lookup lineage reference object : stvrelt")
    private String reltCode;
    /**
     * Last Name Prefix
     * <p>
     * Lineage reference object : SORFOLK_SURNAME_PREFIX
     * 
     */
    @JsonProperty("surnamePrefix")
    @JsonPropertyDescription("Lineage reference object : SORFOLK_SURNAME_PREFIX")
    private String surnamePrefix;
    /**
     * Last Name
     * <p>
     * Lineage reference object : SORFOLK_PARENT_LAST
     * (Required)
     * 
     */
    @JsonProperty("parentLast")
    @JsonPropertyDescription("Lineage reference object : SORFOLK_PARENT_LAST")
    private String parentLast;
    /**
     * Degree
     * <p>
     * Lineage reference object : SORFOLK_PARENT_DEGREE
     * 
     */
    @JsonProperty("parentDegree")
    @JsonPropertyDescription("Lineage reference object : SORFOLK_PARENT_DEGREE")
    private String parentDegree;
    /**
     * Middle Name
     * <p>
     * Lineage reference object : SORFOLK_PARENT_MI
     * 
     */
    @JsonProperty("parentMi")
    @JsonPropertyDescription("Lineage reference object : SORFOLK_PARENT_MI")
    private String parentMi;
    /**
     * Title
     * <p>
     * Lineage reference object : SORFOLK_PARENT_JOB_TITLE
     * 
     */
    @JsonProperty("parentJobTitle")
    @JsonPropertyDescription("Lineage reference object : SORFOLK_PARENT_JOB_TITLE")
    private String parentJobTitle;
    /**
     * Employer
     * <p>
     * Lineage reference object : SORFOLK_PARENT_EMPLOYER
     * 
     */
    @JsonProperty("parentEmployer")
    @JsonPropertyDescription("Lineage reference object : SORFOLK_PARENT_EMPLOYER")
    private String parentEmployer;
    /**
     * Prefix
     * <p>
     * Lineage reference object : SORFOLK_PARENT_NAME_PREFIX
     * 
     */
    @JsonProperty("parentNamePrefix")
    @JsonPropertyDescription("Lineage reference object : SORFOLK_PARENT_NAME_PREFIX")
    private String parentNamePrefix;
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
     * Lineage reference object : SORFOLK_PARENT_FIRST
     * (Required)
     * 
     */
    @JsonProperty("parentFirst")
    @JsonPropertyDescription("Lineage reference object : SORFOLK_PARENT_FIRST")
    private String parentFirst;
    /**
     * Address Type
     * <p>
     * Lineage reference object : SORFOLK_ATYP_CODE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("atypCode")
    @JsonPropertyDescription("Lineage reference object : SORFOLK_ATYP_CODE, Lookup lineage reference object : stvatyp")
    private String atypCode;
    /**
     * Deceased
     * <p>
     * Lineage reference object : SORFOLK_DECEASED_IND
     * 
     */
    @JsonProperty("deceasedInd")
    @JsonPropertyDescription("Lineage reference object : SORFOLK_DECEASED_IND")
    private String deceasedInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Suffix
     * <p>
     * Lineage reference object : SORFOLK_PARENT_NAME_SUFFIX
     * 
     */
    @JsonProperty("parentNameSuffix")
    public String getParentNameSuffix() {
        return parentNameSuffix;
    }

    /**
     * Suffix
     * <p>
     * Lineage reference object : SORFOLK_PARENT_NAME_SUFFIX
     * 
     */
    @JsonProperty("parentNameSuffix")
    public void setParentNameSuffix(String parentNameSuffix) {
        this.parentNameSuffix = parentNameSuffix;
    }

    public GuardianInformation100PostRequest withParentNameSuffix(String parentNameSuffix) {
        this.parentNameSuffix = parentNameSuffix;
        return this;
    }

    /**
     * Relationship
     * <p>
     * Lineage reference object : SORFOLK_RELT_CODE, Lookup lineage reference object : stvrelt
     * (Required)
     * 
     */
    @JsonProperty("reltCode")
    public String getReltCode() {
        return reltCode;
    }

    /**
     * Relationship
     * <p>
     * Lineage reference object : SORFOLK_RELT_CODE, Lookup lineage reference object : stvrelt
     * (Required)
     * 
     */
    @JsonProperty("reltCode")
    public void setReltCode(String reltCode) {
        this.reltCode = reltCode;
    }

    public GuardianInformation100PostRequest withReltCode(String reltCode) {
        this.reltCode = reltCode;
        return this;
    }

    /**
     * Last Name Prefix
     * <p>
     * Lineage reference object : SORFOLK_SURNAME_PREFIX
     * 
     */
    @JsonProperty("surnamePrefix")
    public String getSurnamePrefix() {
        return surnamePrefix;
    }

    /**
     * Last Name Prefix
     * <p>
     * Lineage reference object : SORFOLK_SURNAME_PREFIX
     * 
     */
    @JsonProperty("surnamePrefix")
    public void setSurnamePrefix(String surnamePrefix) {
        this.surnamePrefix = surnamePrefix;
    }

    public GuardianInformation100PostRequest withSurnamePrefix(String surnamePrefix) {
        this.surnamePrefix = surnamePrefix;
        return this;
    }

    /**
     * Last Name
     * <p>
     * Lineage reference object : SORFOLK_PARENT_LAST
     * (Required)
     * 
     */
    @JsonProperty("parentLast")
    public String getParentLast() {
        return parentLast;
    }

    /**
     * Last Name
     * <p>
     * Lineage reference object : SORFOLK_PARENT_LAST
     * (Required)
     * 
     */
    @JsonProperty("parentLast")
    public void setParentLast(String parentLast) {
        this.parentLast = parentLast;
    }

    public GuardianInformation100PostRequest withParentLast(String parentLast) {
        this.parentLast = parentLast;
        return this;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SORFOLK_PARENT_DEGREE
     * 
     */
    @JsonProperty("parentDegree")
    public String getParentDegree() {
        return parentDegree;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SORFOLK_PARENT_DEGREE
     * 
     */
    @JsonProperty("parentDegree")
    public void setParentDegree(String parentDegree) {
        this.parentDegree = parentDegree;
    }

    public GuardianInformation100PostRequest withParentDegree(String parentDegree) {
        this.parentDegree = parentDegree;
        return this;
    }

    /**
     * Middle Name
     * <p>
     * Lineage reference object : SORFOLK_PARENT_MI
     * 
     */
    @JsonProperty("parentMi")
    public String getParentMi() {
        return parentMi;
    }

    /**
     * Middle Name
     * <p>
     * Lineage reference object : SORFOLK_PARENT_MI
     * 
     */
    @JsonProperty("parentMi")
    public void setParentMi(String parentMi) {
        this.parentMi = parentMi;
    }

    public GuardianInformation100PostRequest withParentMi(String parentMi) {
        this.parentMi = parentMi;
        return this;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : SORFOLK_PARENT_JOB_TITLE
     * 
     */
    @JsonProperty("parentJobTitle")
    public String getParentJobTitle() {
        return parentJobTitle;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : SORFOLK_PARENT_JOB_TITLE
     * 
     */
    @JsonProperty("parentJobTitle")
    public void setParentJobTitle(String parentJobTitle) {
        this.parentJobTitle = parentJobTitle;
    }

    public GuardianInformation100PostRequest withParentJobTitle(String parentJobTitle) {
        this.parentJobTitle = parentJobTitle;
        return this;
    }

    /**
     * Employer
     * <p>
     * Lineage reference object : SORFOLK_PARENT_EMPLOYER
     * 
     */
    @JsonProperty("parentEmployer")
    public String getParentEmployer() {
        return parentEmployer;
    }

    /**
     * Employer
     * <p>
     * Lineage reference object : SORFOLK_PARENT_EMPLOYER
     * 
     */
    @JsonProperty("parentEmployer")
    public void setParentEmployer(String parentEmployer) {
        this.parentEmployer = parentEmployer;
    }

    public GuardianInformation100PostRequest withParentEmployer(String parentEmployer) {
        this.parentEmployer = parentEmployer;
        return this;
    }

    /**
     * Prefix
     * <p>
     * Lineage reference object : SORFOLK_PARENT_NAME_PREFIX
     * 
     */
    @JsonProperty("parentNamePrefix")
    public String getParentNamePrefix() {
        return parentNamePrefix;
    }

    /**
     * Prefix
     * <p>
     * Lineage reference object : SORFOLK_PARENT_NAME_PREFIX
     * 
     */
    @JsonProperty("parentNamePrefix")
    public void setParentNamePrefix(String parentNamePrefix) {
        this.parentNamePrefix = parentNamePrefix;
    }

    public GuardianInformation100PostRequest withParentNamePrefix(String parentNamePrefix) {
        this.parentNamePrefix = parentNamePrefix;
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

    public GuardianInformation100PostRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * First Name
     * <p>
     * Lineage reference object : SORFOLK_PARENT_FIRST
     * (Required)
     * 
     */
    @JsonProperty("parentFirst")
    public String getParentFirst() {
        return parentFirst;
    }

    /**
     * First Name
     * <p>
     * Lineage reference object : SORFOLK_PARENT_FIRST
     * (Required)
     * 
     */
    @JsonProperty("parentFirst")
    public void setParentFirst(String parentFirst) {
        this.parentFirst = parentFirst;
    }

    public GuardianInformation100PostRequest withParentFirst(String parentFirst) {
        this.parentFirst = parentFirst;
        return this;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : SORFOLK_ATYP_CODE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("atypCode")
    public String getAtypCode() {
        return atypCode;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : SORFOLK_ATYP_CODE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("atypCode")
    public void setAtypCode(String atypCode) {
        this.atypCode = atypCode;
    }

    public GuardianInformation100PostRequest withAtypCode(String atypCode) {
        this.atypCode = atypCode;
        return this;
    }

    /**
     * Deceased
     * <p>
     * Lineage reference object : SORFOLK_DECEASED_IND
     * 
     */
    @JsonProperty("deceasedInd")
    public String getDeceasedInd() {
        return deceasedInd;
    }

    /**
     * Deceased
     * <p>
     * Lineage reference object : SORFOLK_DECEASED_IND
     * 
     */
    @JsonProperty("deceasedInd")
    public void setDeceasedInd(String deceasedInd) {
        this.deceasedInd = deceasedInd;
    }

    public GuardianInformation100PostRequest withDeceasedInd(String deceasedInd) {
        this.deceasedInd = deceasedInd;
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

    public GuardianInformation100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GuardianInformation100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("parentNameSuffix");
        sb.append('=');
        sb.append(((this.parentNameSuffix == null)?"<null>":this.parentNameSuffix));
        sb.append(',');
        sb.append("reltCode");
        sb.append('=');
        sb.append(((this.reltCode == null)?"<null>":this.reltCode));
        sb.append(',');
        sb.append("surnamePrefix");
        sb.append('=');
        sb.append(((this.surnamePrefix == null)?"<null>":this.surnamePrefix));
        sb.append(',');
        sb.append("parentLast");
        sb.append('=');
        sb.append(((this.parentLast == null)?"<null>":this.parentLast));
        sb.append(',');
        sb.append("parentDegree");
        sb.append('=');
        sb.append(((this.parentDegree == null)?"<null>":this.parentDegree));
        sb.append(',');
        sb.append("parentMi");
        sb.append('=');
        sb.append(((this.parentMi == null)?"<null>":this.parentMi));
        sb.append(',');
        sb.append("parentJobTitle");
        sb.append('=');
        sb.append(((this.parentJobTitle == null)?"<null>":this.parentJobTitle));
        sb.append(',');
        sb.append("parentEmployer");
        sb.append('=');
        sb.append(((this.parentEmployer == null)?"<null>":this.parentEmployer));
        sb.append(',');
        sb.append("parentNamePrefix");
        sb.append('=');
        sb.append(((this.parentNamePrefix == null)?"<null>":this.parentNamePrefix));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("parentFirst");
        sb.append('=');
        sb.append(((this.parentFirst == null)?"<null>":this.parentFirst));
        sb.append(',');
        sb.append("atypCode");
        sb.append('=');
        sb.append(((this.atypCode == null)?"<null>":this.atypCode));
        sb.append(',');
        sb.append("deceasedInd");
        sb.append('=');
        sb.append(((this.deceasedInd == null)?"<null>":this.deceasedInd));
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
        result = ((result* 31)+((this.parentNameSuffix == null)? 0 :this.parentNameSuffix.hashCode()));
        result = ((result* 31)+((this.reltCode == null)? 0 :this.reltCode.hashCode()));
        result = ((result* 31)+((this.surnamePrefix == null)? 0 :this.surnamePrefix.hashCode()));
        result = ((result* 31)+((this.parentLast == null)? 0 :this.parentLast.hashCode()));
        result = ((result* 31)+((this.parentDegree == null)? 0 :this.parentDegree.hashCode()));
        result = ((result* 31)+((this.parentMi == null)? 0 :this.parentMi.hashCode()));
        result = ((result* 31)+((this.parentJobTitle == null)? 0 :this.parentJobTitle.hashCode()));
        result = ((result* 31)+((this.parentEmployer == null)? 0 :this.parentEmployer.hashCode()));
        result = ((result* 31)+((this.parentNamePrefix == null)? 0 :this.parentNamePrefix.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.parentFirst == null)? 0 :this.parentFirst.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.atypCode == null)? 0 :this.atypCode.hashCode()));
        result = ((result* 31)+((this.deceasedInd == null)? 0 :this.deceasedInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GuardianInformation100PostRequest) == false) {
            return false;
        }
        GuardianInformation100PostRequest rhs = ((GuardianInformation100PostRequest) other);
        return (((((((((((((((this.parentNameSuffix == rhs.parentNameSuffix)||((this.parentNameSuffix!= null)&&this.parentNameSuffix.equals(rhs.parentNameSuffix)))&&((this.reltCode == rhs.reltCode)||((this.reltCode!= null)&&this.reltCode.equals(rhs.reltCode))))&&((this.surnamePrefix == rhs.surnamePrefix)||((this.surnamePrefix!= null)&&this.surnamePrefix.equals(rhs.surnamePrefix))))&&((this.parentLast == rhs.parentLast)||((this.parentLast!= null)&&this.parentLast.equals(rhs.parentLast))))&&((this.parentDegree == rhs.parentDegree)||((this.parentDegree!= null)&&this.parentDegree.equals(rhs.parentDegree))))&&((this.parentMi == rhs.parentMi)||((this.parentMi!= null)&&this.parentMi.equals(rhs.parentMi))))&&((this.parentJobTitle == rhs.parentJobTitle)||((this.parentJobTitle!= null)&&this.parentJobTitle.equals(rhs.parentJobTitle))))&&((this.parentEmployer == rhs.parentEmployer)||((this.parentEmployer!= null)&&this.parentEmployer.equals(rhs.parentEmployer))))&&((this.parentNamePrefix == rhs.parentNamePrefix)||((this.parentNamePrefix!= null)&&this.parentNamePrefix.equals(rhs.parentNamePrefix))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.parentFirst == rhs.parentFirst)||((this.parentFirst!= null)&&this.parentFirst.equals(rhs.parentFirst))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.atypCode == rhs.atypCode)||((this.atypCode!= null)&&this.atypCode.equals(rhs.atypCode))))&&((this.deceasedInd == rhs.deceasedInd)||((this.deceasedInd!= null)&&this.deceasedInd.equals(rhs.deceasedInd))));
    }

}
