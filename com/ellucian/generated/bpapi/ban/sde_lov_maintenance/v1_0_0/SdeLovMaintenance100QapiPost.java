
package com.ellucian.generated.bpapi.ban.sde_lov_maintenance.v1_0_0;

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
    "tableName",
    "attrName",
    "code",
    "desc",
    "userId",
    "activityDate"
})
@Generated("jsonschema2pojo")
public class SdeLovMaintenance100QapiPost {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tableName")
    private String tableName;
    @JsonProperty("attrName")
    private String attrName;
    /**
     * Goreqpg Eqpm Code
     * <p>
     * Lineage reference object : GTVSDLV_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : GTVSDLV_CODE")
    private String code;
    /**
     * Description
     * <p>
     * Lineage reference object : GTVSDLV_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : GTVSDLV_DESC")
    private String desc;
    /**
     * Goreqpg User Id
     * <p>
     * Lineage reference object : GTVSDLV_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : GTVSDLV_USER_ID")
    private String userId;
    /**
     * Goreqpg Activity Date
     * <p>
     * Lineage reference object : GTVSDLV_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : GTVSDLV_ACTIVITY_DATE")
    private Date activityDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tableName")
    public String getTableName() {
        return tableName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tableName")
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public SdeLovMaintenance100QapiPost withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    @JsonProperty("attrName")
    public String getAttrName() {
        return attrName;
    }

    @JsonProperty("attrName")
    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public SdeLovMaintenance100QapiPost withAttrName(String attrName) {
        this.attrName = attrName;
        return this;
    }

    /**
     * Goreqpg Eqpm Code
     * <p>
     * Lineage reference object : GTVSDLV_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Goreqpg Eqpm Code
     * <p>
     * Lineage reference object : GTVSDLV_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public SdeLovMaintenance100QapiPost withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : GTVSDLV_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : GTVSDLV_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public SdeLovMaintenance100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Goreqpg User Id
     * <p>
     * Lineage reference object : GTVSDLV_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Goreqpg User Id
     * <p>
     * Lineage reference object : GTVSDLV_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public SdeLovMaintenance100QapiPost withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Goreqpg Activity Date
     * <p>
     * Lineage reference object : GTVSDLV_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Goreqpg Activity Date
     * <p>
     * Lineage reference object : GTVSDLV_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public SdeLovMaintenance100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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

    public SdeLovMaintenance100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SdeLovMaintenance100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tableName");
        sb.append('=');
        sb.append(((this.tableName == null)?"<null>":this.tableName));
        sb.append(',');
        sb.append("attrName");
        sb.append('=');
        sb.append(((this.attrName == null)?"<null>":this.attrName));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
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
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.attrName == null)? 0 :this.attrName.hashCode()));
        result = ((result* 31)+((this.tableName == null)? 0 :this.tableName.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SdeLovMaintenance100QapiPost) == false) {
            return false;
        }
        SdeLovMaintenance100QapiPost rhs = ((SdeLovMaintenance100QapiPost) other);
        return ((((((((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.attrName == rhs.attrName)||((this.attrName!= null)&&this.attrName.equals(rhs.attrName))))&&((this.tableName == rhs.tableName)||((this.tableName!= null)&&this.tableName.equals(rhs.tableName))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
