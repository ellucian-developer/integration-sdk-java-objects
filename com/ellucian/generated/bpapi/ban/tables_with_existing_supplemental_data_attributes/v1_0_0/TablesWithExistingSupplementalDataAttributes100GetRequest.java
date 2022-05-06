
package com.ellucian.generated.bpapi.ban.tables_with_existing_supplemental_data_attributes.v1_0_0;

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
    "userId",
    "tableName"
})
@Generated("jsonschema2pojo")
public class TablesWithExistingSupplementalDataAttributes100GetRequest {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GOBSDTB_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : GOBSDTB_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * User ID
     * <p>
     * Lineage reference object : GOBSDTB_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : GOBSDTB_USER_ID")
    private String userId;
    /**
     * Table Name
     * <p>
     * Lineage reference object : GOBSDTB_TABLE_NAME, Lookup lineage reference object : all_tab_comments,gtvsdax,gobsdtb
     * (Required)
     * 
     */
    @JsonProperty("tableName")
    @JsonPropertyDescription("Lineage reference object : GOBSDTB_TABLE_NAME, Lookup lineage reference object : all_tab_comments,gtvsdax,gobsdtb")
    private String tableName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GOBSDTB_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GOBSDTB_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public TablesWithExistingSupplementalDataAttributes100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : GOBSDTB_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : GOBSDTB_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public TablesWithExistingSupplementalDataAttributes100GetRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Table Name
     * <p>
     * Lineage reference object : GOBSDTB_TABLE_NAME, Lookup lineage reference object : all_tab_comments,gtvsdax,gobsdtb
     * (Required)
     * 
     */
    @JsonProperty("tableName")
    public String getTableName() {
        return tableName;
    }

    /**
     * Table Name
     * <p>
     * Lineage reference object : GOBSDTB_TABLE_NAME, Lookup lineage reference object : all_tab_comments,gtvsdax,gobsdtb
     * (Required)
     * 
     */
    @JsonProperty("tableName")
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public TablesWithExistingSupplementalDataAttributes100GetRequest withTableName(String tableName) {
        this.tableName = tableName;
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

    public TablesWithExistingSupplementalDataAttributes100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TablesWithExistingSupplementalDataAttributes100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("tableName");
        sb.append('=');
        sb.append(((this.tableName == null)?"<null>":this.tableName));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.tableName == null)? 0 :this.tableName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TablesWithExistingSupplementalDataAttributes100GetRequest) == false) {
            return false;
        }
        TablesWithExistingSupplementalDataAttributes100GetRequest rhs = ((TablesWithExistingSupplementalDataAttributes100GetRequest) other);
        return (((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.tableName == rhs.tableName)||((this.tableName!= null)&&this.tableName.equals(rhs.tableName))));
    }

}
