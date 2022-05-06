
package com.ellucian.generated.bpapi.ban.general_information_honors_and_awards.v1_0_0;

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
    "organizationName",
    "expireDate",
    "issueDate",
    "title"
})
@Generated("jsonschema2pojo")
public class GeneralInformationHonorsAndAwards100GetResponse {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PPRHNAW_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : PPRHNAW_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Awarding Organization
     * <p>
     * Lineage reference object : PPRHNAW_ORGANIZATION_NAME
     * 
     */
    @JsonProperty("organizationName")
    @JsonPropertyDescription("Lineage reference object : PPRHNAW_ORGANIZATION_NAME")
    private String organizationName;
    /**
     * Expired Date
     * <p>
     * Lineage reference object : PPRHNAW_EXPIRE_DATE
     * 
     */
    @JsonProperty("expireDate")
    @JsonPropertyDescription("Lineage reference object : PPRHNAW_EXPIRE_DATE")
    private Date expireDate;
    /**
     * Awarded Date
     * <p>
     * Lineage reference object : PPRHNAW_ISSUE_DATE
     * 
     */
    @JsonProperty("issueDate")
    @JsonPropertyDescription("Lineage reference object : PPRHNAW_ISSUE_DATE")
    private Date issueDate;
    /**
     * Honors or Award Title
     * <p>
     * Lineage reference object : PPRHNAW_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("Lineage reference object : PPRHNAW_TITLE")
    private String title;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PPRHNAW_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PPRHNAW_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public GeneralInformationHonorsAndAwards100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Awarding Organization
     * <p>
     * Lineage reference object : PPRHNAW_ORGANIZATION_NAME
     * 
     */
    @JsonProperty("organizationName")
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * Awarding Organization
     * <p>
     * Lineage reference object : PPRHNAW_ORGANIZATION_NAME
     * 
     */
    @JsonProperty("organizationName")
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public GeneralInformationHonorsAndAwards100GetResponse withOrganizationName(String organizationName) {
        this.organizationName = organizationName;
        return this;
    }

    /**
     * Expired Date
     * <p>
     * Lineage reference object : PPRHNAW_EXPIRE_DATE
     * 
     */
    @JsonProperty("expireDate")
    public Date getExpireDate() {
        return expireDate;
    }

    /**
     * Expired Date
     * <p>
     * Lineage reference object : PPRHNAW_EXPIRE_DATE
     * 
     */
    @JsonProperty("expireDate")
    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public GeneralInformationHonorsAndAwards100GetResponse withExpireDate(Date expireDate) {
        this.expireDate = expireDate;
        return this;
    }

    /**
     * Awarded Date
     * <p>
     * Lineage reference object : PPRHNAW_ISSUE_DATE
     * 
     */
    @JsonProperty("issueDate")
    public Date getIssueDate() {
        return issueDate;
    }

    /**
     * Awarded Date
     * <p>
     * Lineage reference object : PPRHNAW_ISSUE_DATE
     * 
     */
    @JsonProperty("issueDate")
    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public GeneralInformationHonorsAndAwards100GetResponse withIssueDate(Date issueDate) {
        this.issueDate = issueDate;
        return this;
    }

    /**
     * Honors or Award Title
     * <p>
     * Lineage reference object : PPRHNAW_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Honors or Award Title
     * <p>
     * Lineage reference object : PPRHNAW_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public GeneralInformationHonorsAndAwards100GetResponse withTitle(String title) {
        this.title = title;
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

    public GeneralInformationHonorsAndAwards100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GeneralInformationHonorsAndAwards100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("organizationName");
        sb.append('=');
        sb.append(((this.organizationName == null)?"<null>":this.organizationName));
        sb.append(',');
        sb.append("expireDate");
        sb.append('=');
        sb.append(((this.expireDate == null)?"<null>":this.expireDate));
        sb.append(',');
        sb.append("issueDate");
        sb.append('=');
        sb.append(((this.issueDate == null)?"<null>":this.issueDate));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
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
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.organizationName == null)? 0 :this.organizationName.hashCode()));
        result = ((result* 31)+((this.expireDate == null)? 0 :this.expireDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.issueDate == null)? 0 :this.issueDate.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeneralInformationHonorsAndAwards100GetResponse) == false) {
            return false;
        }
        GeneralInformationHonorsAndAwards100GetResponse rhs = ((GeneralInformationHonorsAndAwards100GetResponse) other);
        return (((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.organizationName == rhs.organizationName)||((this.organizationName!= null)&&this.organizationName.equals(rhs.organizationName))))&&((this.expireDate == rhs.expireDate)||((this.expireDate!= null)&&this.expireDate.equals(rhs.expireDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.issueDate == rhs.issueDate)||((this.issueDate!= null)&&this.issueDate.equals(rhs.issueDate))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))));
    }

}
