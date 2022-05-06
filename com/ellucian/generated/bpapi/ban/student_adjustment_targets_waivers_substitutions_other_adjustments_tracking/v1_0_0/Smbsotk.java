
package com.ellucian.generated.bpapi.ban.student_adjustment_targets_waivers_substitutions_other_adjustments_tracking.v1_0_0;

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
    "termCodeEff",
    "tableNameDesc",
    "user",
    "tableName"
})
@Generated("jsonschema2pojo")
public class Smbsotk {

    /**
     * Smbsotk Activity Date
     * <p>
     * Lineage reference object : SMBSOTK_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SMBSOTK_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Smbsotk Term Code Eff
     * <p>
     * Lineage reference object : SMBSOTK_TERM_CODE_EFF, Lookup lineage reference object : smbsotk
     * 
     */
    @JsonProperty("termCodeEff")
    @JsonPropertyDescription("Lineage reference object : SMBSOTK_TERM_CODE_EFF, Lookup lineage reference object : smbsotk")
    private String termCodeEff;
    /**
     * Smbsotk Table Name Desc
     * <p>
     * Lineage reference object : SMBSOTK_TABLE_NAME_DESC
     * 
     */
    @JsonProperty("tableNameDesc")
    @JsonPropertyDescription("Lineage reference object : SMBSOTK_TABLE_NAME_DESC")
    private String tableNameDesc;
    /**
     * Smbsotk User
     * <p>
     * Lineage reference object : SMBSOTK_USER, Lookup lineage reference object : smbsotk,smbsotk
     * 
     */
    @JsonProperty("user")
    @JsonPropertyDescription("Lineage reference object : SMBSOTK_USER, Lookup lineage reference object : smbsotk,smbsotk")
    private String user;
    /**
     * Smbsotk Table Name
     * <p>
     * Lineage reference object : SMBSOTK_TABLE_NAME, Lookup lineage reference object : smbsotk,smbsotk
     * 
     */
    @JsonProperty("tableName")
    @JsonPropertyDescription("Lineage reference object : SMBSOTK_TABLE_NAME, Lookup lineage reference object : smbsotk,smbsotk")
    private String tableName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Smbsotk Activity Date
     * <p>
     * Lineage reference object : SMBSOTK_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Smbsotk Activity Date
     * <p>
     * Lineage reference object : SMBSOTK_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Smbsotk withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Smbsotk Term Code Eff
     * <p>
     * Lineage reference object : SMBSOTK_TERM_CODE_EFF, Lookup lineage reference object : smbsotk
     * 
     */
    @JsonProperty("termCodeEff")
    public String getTermCodeEff() {
        return termCodeEff;
    }

    /**
     * Smbsotk Term Code Eff
     * <p>
     * Lineage reference object : SMBSOTK_TERM_CODE_EFF, Lookup lineage reference object : smbsotk
     * 
     */
    @JsonProperty("termCodeEff")
    public void setTermCodeEff(String termCodeEff) {
        this.termCodeEff = termCodeEff;
    }

    public Smbsotk withTermCodeEff(String termCodeEff) {
        this.termCodeEff = termCodeEff;
        return this;
    }

    /**
     * Smbsotk Table Name Desc
     * <p>
     * Lineage reference object : SMBSOTK_TABLE_NAME_DESC
     * 
     */
    @JsonProperty("tableNameDesc")
    public String getTableNameDesc() {
        return tableNameDesc;
    }

    /**
     * Smbsotk Table Name Desc
     * <p>
     * Lineage reference object : SMBSOTK_TABLE_NAME_DESC
     * 
     */
    @JsonProperty("tableNameDesc")
    public void setTableNameDesc(String tableNameDesc) {
        this.tableNameDesc = tableNameDesc;
    }

    public Smbsotk withTableNameDesc(String tableNameDesc) {
        this.tableNameDesc = tableNameDesc;
        return this;
    }

    /**
     * Smbsotk User
     * <p>
     * Lineage reference object : SMBSOTK_USER, Lookup lineage reference object : smbsotk,smbsotk
     * 
     */
    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    /**
     * Smbsotk User
     * <p>
     * Lineage reference object : SMBSOTK_USER, Lookup lineage reference object : smbsotk,smbsotk
     * 
     */
    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    public Smbsotk withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * Smbsotk Table Name
     * <p>
     * Lineage reference object : SMBSOTK_TABLE_NAME, Lookup lineage reference object : smbsotk,smbsotk
     * 
     */
    @JsonProperty("tableName")
    public String getTableName() {
        return tableName;
    }

    /**
     * Smbsotk Table Name
     * <p>
     * Lineage reference object : SMBSOTK_TABLE_NAME, Lookup lineage reference object : smbsotk,smbsotk
     * 
     */
    @JsonProperty("tableName")
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public Smbsotk withTableName(String tableName) {
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

    public Smbsotk withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Smbsotk.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("termCodeEff");
        sb.append('=');
        sb.append(((this.termCodeEff == null)?"<null>":this.termCodeEff));
        sb.append(',');
        sb.append("tableNameDesc");
        sb.append('=');
        sb.append(((this.tableNameDesc == null)?"<null>":this.tableNameDesc));
        sb.append(',');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
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
        result = ((result* 31)+((this.termCodeEff == null)? 0 :this.termCodeEff.hashCode()));
        result = ((result* 31)+((this.tableNameDesc == null)? 0 :this.tableNameDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.user == null)? 0 :this.user.hashCode()));
        result = ((result* 31)+((this.tableName == null)? 0 :this.tableName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Smbsotk) == false) {
            return false;
        }
        Smbsotk rhs = ((Smbsotk) other);
        return (((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.termCodeEff == rhs.termCodeEff)||((this.termCodeEff!= null)&&this.termCodeEff.equals(rhs.termCodeEff))))&&((this.tableNameDesc == rhs.tableNameDesc)||((this.tableNameDesc!= null)&&this.tableNameDesc.equals(rhs.tableNameDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.user == rhs.user)||((this.user!= null)&&this.user.equals(rhs.user))))&&((this.tableName == rhs.tableName)||((this.tableName!= null)&&this.tableName.equals(rhs.tableName))));
    }

}
