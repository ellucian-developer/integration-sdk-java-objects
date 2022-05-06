
package com.ellucian.generated.bpapi.ban.soacomp_non_person_search.v1_0_0;

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
    "activityDate",
    "id",
    "lastName",
    "ntypCode",
    "changeInd"
})
@Generated("jsonschema2pojo")
public class SoacompNonPersonSearch100QapiPost {

    /**
     * Activity
     * <p>
     * Lineage reference object : SPRIDEN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_ACTIVITY_DATE")
    private Date activityDate;
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
     * Name
     * <p>
     * Lineage reference object : SPRIDEN_LAST_NAME
     * 
     */
    @JsonProperty("lastName")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_LAST_NAME")
    private String lastName;
    /**
     * Type
     * <p>
     * Lineage reference object : SPRIDEN_NTYP_CODE, Lookup lineage reference object : gtvntyp
     * 
     */
    @JsonProperty("ntypCode")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_NTYP_CODE, Lookup lineage reference object : gtvntyp")
    private String ntypCode;
    /**
     * Change Indicator
     * <p>
     * Lineage reference object : SPRIDEN_CHANGE_IND
     * 
     */
    @JsonProperty("changeInd")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_CHANGE_IND")
    private String changeInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity
     * <p>
     * Lineage reference object : SPRIDEN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : SPRIDEN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public SoacompNonPersonSearch100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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

    public SoacompNonPersonSearch100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Name
     * <p>
     * Lineage reference object : SPRIDEN_LAST_NAME
     * 
     */
    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    /**
     * Name
     * <p>
     * Lineage reference object : SPRIDEN_LAST_NAME
     * 
     */
    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public SoacompNonPersonSearch100QapiPost withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : SPRIDEN_NTYP_CODE, Lookup lineage reference object : gtvntyp
     * 
     */
    @JsonProperty("ntypCode")
    public String getNtypCode() {
        return ntypCode;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : SPRIDEN_NTYP_CODE, Lookup lineage reference object : gtvntyp
     * 
     */
    @JsonProperty("ntypCode")
    public void setNtypCode(String ntypCode) {
        this.ntypCode = ntypCode;
    }

    public SoacompNonPersonSearch100QapiPost withNtypCode(String ntypCode) {
        this.ntypCode = ntypCode;
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

    public SoacompNonPersonSearch100QapiPost withChangeInd(String changeInd) {
        this.changeInd = changeInd;
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

    public SoacompNonPersonSearch100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SoacompNonPersonSearch100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("ntypCode");
        sb.append('=');
        sb.append(((this.ntypCode == null)?"<null>":this.ntypCode));
        sb.append(',');
        sb.append("changeInd");
        sb.append('=');
        sb.append(((this.changeInd == null)?"<null>":this.changeInd));
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
        result = ((result* 31)+((this.lastName == null)? 0 :this.lastName.hashCode()));
        result = ((result* 31)+((this.ntypCode == null)? 0 :this.ntypCode.hashCode()));
        result = ((result* 31)+((this.changeInd == null)? 0 :this.changeInd.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SoacompNonPersonSearch100QapiPost) == false) {
            return false;
        }
        SoacompNonPersonSearch100QapiPost rhs = ((SoacompNonPersonSearch100QapiPost) other);
        return (((((((this.lastName == rhs.lastName)||((this.lastName!= null)&&this.lastName.equals(rhs.lastName)))&&((this.ntypCode == rhs.ntypCode)||((this.ntypCode!= null)&&this.ntypCode.equals(rhs.ntypCode))))&&((this.changeInd == rhs.changeInd)||((this.changeInd!= null)&&this.changeInd.equals(rhs.changeInd))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
