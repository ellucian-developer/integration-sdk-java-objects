
package com.ellucian.generated.bpapi.ban.proxy_access_option_types.v1_0_0;

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
    "code",
    "createDate",
    "createUser",
    "dataType",
    "desc",
    "optionDefault",
    "systemLevelCde",
    "systemReqInd",
    "systCode",
    "userId"
})
@Generated("jsonschema2pojo")
public class ProxyAccessOptionTypes100QapiPost {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GTVOTYP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : GTVOTYP_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Option Type Code
     * <p>
     * Lineage reference object : GTVOTYP_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : GTVOTYP_CODE")
    private String code;
    /**
     * Create Date
     * <p>
     * Lineage reference object : GTVOTYP_CREATE_DATE
     * 
     */
    @JsonProperty("createDate")
    @JsonPropertyDescription("Lineage reference object : GTVOTYP_CREATE_DATE")
    private Date createDate;
    /**
     * Create User
     * <p>
     * Lineage reference object : GTVOTYP_CREATE_USER
     * 
     */
    @JsonProperty("createUser")
    @JsonPropertyDescription("Lineage reference object : GTVOTYP_CREATE_USER")
    private String createUser;
    /**
     * Data Type
     * <p>
     * Lineage reference object : GTVOTYP_DATA_TYPE
     * 
     */
    @JsonProperty("dataType")
    @JsonPropertyDescription("Lineage reference object : GTVOTYP_DATA_TYPE")
    private String dataType;
    /**
     * Description
     * <p>
     * Lineage reference object : GTVOTYP_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : GTVOTYP_DESC")
    private String desc;
    /**
     * Default Value
     * <p>
     * Lineage reference object : GTVOTYP_OPTION_DEFAULT
     * 
     */
    @JsonProperty("optionDefault")
    @JsonPropertyDescription("Lineage reference object : GTVOTYP_OPTION_DEFAULT")
    private String optionDefault;
    /**
     * Option Level
     * <p>
     * Lineage reference object : GTVOTYP_SYSTEM_LEVEL_CDE
     * 
     */
    @JsonProperty("systemLevelCde")
    @JsonPropertyDescription("Lineage reference object : GTVOTYP_SYSTEM_LEVEL_CDE")
    private String systemLevelCde;
    /**
     * Lineage reference object : GTVOTYP_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("systemReqInd")
    @JsonPropertyDescription("Lineage reference object : GTVOTYP_SYSTEM_REQ_IND")
    private String systemReqInd;
    /**
     * System Code
     * <p>
     * Lineage reference object : GTVOTYP_SYST_CODE, Lookup lineage reference object : gtvsyst
     * 
     */
    @JsonProperty("systCode")
    @JsonPropertyDescription("Lineage reference object : GTVOTYP_SYST_CODE, Lookup lineage reference object : gtvsyst")
    private String systCode;
    /**
     * User ID
     * <p>
     * Lineage reference object : GTVOTYP_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : GTVOTYP_USER_ID")
    private String userId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GTVOTYP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GTVOTYP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public ProxyAccessOptionTypes100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Option Type Code
     * <p>
     * Lineage reference object : GTVOTYP_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Option Type Code
     * <p>
     * Lineage reference object : GTVOTYP_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public ProxyAccessOptionTypes100QapiPost withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Create Date
     * <p>
     * Lineage reference object : GTVOTYP_CREATE_DATE
     * 
     */
    @JsonProperty("createDate")
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * Create Date
     * <p>
     * Lineage reference object : GTVOTYP_CREATE_DATE
     * 
     */
    @JsonProperty("createDate")
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public ProxyAccessOptionTypes100QapiPost withCreateDate(Date createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * Create User
     * <p>
     * Lineage reference object : GTVOTYP_CREATE_USER
     * 
     */
    @JsonProperty("createUser")
    public String getCreateUser() {
        return createUser;
    }

    /**
     * Create User
     * <p>
     * Lineage reference object : GTVOTYP_CREATE_USER
     * 
     */
    @JsonProperty("createUser")
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public ProxyAccessOptionTypes100QapiPost withCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }

    /**
     * Data Type
     * <p>
     * Lineage reference object : GTVOTYP_DATA_TYPE
     * 
     */
    @JsonProperty("dataType")
    public String getDataType() {
        return dataType;
    }

    /**
     * Data Type
     * <p>
     * Lineage reference object : GTVOTYP_DATA_TYPE
     * 
     */
    @JsonProperty("dataType")
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public ProxyAccessOptionTypes100QapiPost withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : GTVOTYP_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : GTVOTYP_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ProxyAccessOptionTypes100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Default Value
     * <p>
     * Lineage reference object : GTVOTYP_OPTION_DEFAULT
     * 
     */
    @JsonProperty("optionDefault")
    public String getOptionDefault() {
        return optionDefault;
    }

    /**
     * Default Value
     * <p>
     * Lineage reference object : GTVOTYP_OPTION_DEFAULT
     * 
     */
    @JsonProperty("optionDefault")
    public void setOptionDefault(String optionDefault) {
        this.optionDefault = optionDefault;
    }

    public ProxyAccessOptionTypes100QapiPost withOptionDefault(String optionDefault) {
        this.optionDefault = optionDefault;
        return this;
    }

    /**
     * Option Level
     * <p>
     * Lineage reference object : GTVOTYP_SYSTEM_LEVEL_CDE
     * 
     */
    @JsonProperty("systemLevelCde")
    public String getSystemLevelCde() {
        return systemLevelCde;
    }

    /**
     * Option Level
     * <p>
     * Lineage reference object : GTVOTYP_SYSTEM_LEVEL_CDE
     * 
     */
    @JsonProperty("systemLevelCde")
    public void setSystemLevelCde(String systemLevelCde) {
        this.systemLevelCde = systemLevelCde;
    }

    public ProxyAccessOptionTypes100QapiPost withSystemLevelCde(String systemLevelCde) {
        this.systemLevelCde = systemLevelCde;
        return this;
    }

    /**
     * Lineage reference object : GTVOTYP_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("systemReqInd")
    public String getSystemReqInd() {
        return systemReqInd;
    }

    /**
     * Lineage reference object : GTVOTYP_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("systemReqInd")
    public void setSystemReqInd(String systemReqInd) {
        this.systemReqInd = systemReqInd;
    }

    public ProxyAccessOptionTypes100QapiPost withSystemReqInd(String systemReqInd) {
        this.systemReqInd = systemReqInd;
        return this;
    }

    /**
     * System Code
     * <p>
     * Lineage reference object : GTVOTYP_SYST_CODE, Lookup lineage reference object : gtvsyst
     * 
     */
    @JsonProperty("systCode")
    public String getSystCode() {
        return systCode;
    }

    /**
     * System Code
     * <p>
     * Lineage reference object : GTVOTYP_SYST_CODE, Lookup lineage reference object : gtvsyst
     * 
     */
    @JsonProperty("systCode")
    public void setSystCode(String systCode) {
        this.systCode = systCode;
    }

    public ProxyAccessOptionTypes100QapiPost withSystCode(String systCode) {
        this.systCode = systCode;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : GTVOTYP_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : GTVOTYP_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ProxyAccessOptionTypes100QapiPost withUserId(String userId) {
        this.userId = userId;
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

    public ProxyAccessOptionTypes100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ProxyAccessOptionTypes100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("createDate");
        sb.append('=');
        sb.append(((this.createDate == null)?"<null>":this.createDate));
        sb.append(',');
        sb.append("createUser");
        sb.append('=');
        sb.append(((this.createUser == null)?"<null>":this.createUser));
        sb.append(',');
        sb.append("dataType");
        sb.append('=');
        sb.append(((this.dataType == null)?"<null>":this.dataType));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("optionDefault");
        sb.append('=');
        sb.append(((this.optionDefault == null)?"<null>":this.optionDefault));
        sb.append(',');
        sb.append("systemLevelCde");
        sb.append('=');
        sb.append(((this.systemLevelCde == null)?"<null>":this.systemLevelCde));
        sb.append(',');
        sb.append("systemReqInd");
        sb.append('=');
        sb.append(((this.systemReqInd == null)?"<null>":this.systemReqInd));
        sb.append(',');
        sb.append("systCode");
        sb.append('=');
        sb.append(((this.systCode == null)?"<null>":this.systCode));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
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
        result = ((result* 31)+((this.systemReqInd == null)? 0 :this.systemReqInd.hashCode()));
        result = ((result* 31)+((this.dataType == null)? 0 :this.dataType.hashCode()));
        result = ((result* 31)+((this.systemLevelCde == null)? 0 :this.systemLevelCde.hashCode()));
        result = ((result* 31)+((this.systCode == null)? 0 :this.systCode.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.optionDefault == null)? 0 :this.optionDefault.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.createUser == null)? 0 :this.createUser.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.createDate == null)? 0 :this.createDate.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProxyAccessOptionTypes100QapiPost) == false) {
            return false;
        }
        ProxyAccessOptionTypes100QapiPost rhs = ((ProxyAccessOptionTypes100QapiPost) other);
        return (((((((((((((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code)))&&((this.systemReqInd == rhs.systemReqInd)||((this.systemReqInd!= null)&&this.systemReqInd.equals(rhs.systemReqInd))))&&((this.dataType == rhs.dataType)||((this.dataType!= null)&&this.dataType.equals(rhs.dataType))))&&((this.systemLevelCde == rhs.systemLevelCde)||((this.systemLevelCde!= null)&&this.systemLevelCde.equals(rhs.systemLevelCde))))&&((this.systCode == rhs.systCode)||((this.systCode!= null)&&this.systCode.equals(rhs.systCode))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.optionDefault == rhs.optionDefault)||((this.optionDefault!= null)&&this.optionDefault.equals(rhs.optionDefault))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.createUser == rhs.createUser)||((this.createUser!= null)&&this.createUser.equals(rhs.createUser))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.createDate == rhs.createDate)||((this.createDate!= null)&&this.createDate.equals(rhs.createDate))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
