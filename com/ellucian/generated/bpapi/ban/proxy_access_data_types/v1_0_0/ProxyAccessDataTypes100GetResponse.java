
package com.ellucian.generated.bpapi.ban.proxy_access_data_types.v1_0_0;

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
    "process",
    "activityDate",
    "code",
    "systemReqInd",
    "processSeq",
    "createUser",
    "userId",
    "createDate",
    "desc"
})
@Generated("jsonschema2pojo")
public class ProxyAccessDataTypes100GetResponse {

    /**
     * Package.Function
     * <p>
     * Lineage reference object : GTVDTYP_PROCESS
     * 
     */
    @JsonProperty("process")
    @JsonPropertyDescription("Lineage reference object : GTVDTYP_PROCESS")
    private String process;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : GTVDTYP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : GTVDTYP_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Code
     * <p>
     * Lineage reference object : GTVDTYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : GTVDTYP_CODE")
    private String code;
    /**
     * Lineage reference object : GTVDTYP_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("systemReqInd")
    @JsonPropertyDescription("Lineage reference object : GTVDTYP_SYSTEM_REQ_IND")
    private String systemReqInd;
    /**
     * Processing Sequence
     * <p>
     * Lineage reference object : GTVDTYP_PROCESS_SEQ
     * 
     */
    @JsonProperty("processSeq")
    @JsonPropertyDescription("Lineage reference object : GTVDTYP_PROCESS_SEQ")
    private Double processSeq;
    /**
     * Create User
     * <p>
     * Lineage reference object : GTVDTYP_CREATE_USER
     * 
     */
    @JsonProperty("createUser")
    @JsonPropertyDescription("Lineage reference object : GTVDTYP_CREATE_USER")
    private String createUser;
    /**
     * User ID
     * <p>
     * Lineage reference object : GTVDTYP_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : GTVDTYP_USER_ID")
    private String userId;
    /**
     * Create Date
     * <p>
     * Lineage reference object : GTVDTYP_CREATE_DATE
     * 
     */
    @JsonProperty("createDate")
    @JsonPropertyDescription("Lineage reference object : GTVDTYP_CREATE_DATE")
    private Date createDate;
    /**
     * Description
     * <p>
     * Lineage reference object : GTVDTYP_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : GTVDTYP_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Package.Function
     * <p>
     * Lineage reference object : GTVDTYP_PROCESS
     * 
     */
    @JsonProperty("process")
    public String getProcess() {
        return process;
    }

    /**
     * Package.Function
     * <p>
     * Lineage reference object : GTVDTYP_PROCESS
     * 
     */
    @JsonProperty("process")
    public void setProcess(String process) {
        this.process = process;
    }

    public ProxyAccessDataTypes100GetResponse withProcess(String process) {
        this.process = process;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GTVDTYP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GTVDTYP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public ProxyAccessDataTypes100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : GTVDTYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : GTVDTYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public ProxyAccessDataTypes100GetResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Lineage reference object : GTVDTYP_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("systemReqInd")
    public String getSystemReqInd() {
        return systemReqInd;
    }

    /**
     * Lineage reference object : GTVDTYP_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("systemReqInd")
    public void setSystemReqInd(String systemReqInd) {
        this.systemReqInd = systemReqInd;
    }

    public ProxyAccessDataTypes100GetResponse withSystemReqInd(String systemReqInd) {
        this.systemReqInd = systemReqInd;
        return this;
    }

    /**
     * Processing Sequence
     * <p>
     * Lineage reference object : GTVDTYP_PROCESS_SEQ
     * 
     */
    @JsonProperty("processSeq")
    public Double getProcessSeq() {
        return processSeq;
    }

    /**
     * Processing Sequence
     * <p>
     * Lineage reference object : GTVDTYP_PROCESS_SEQ
     * 
     */
    @JsonProperty("processSeq")
    public void setProcessSeq(Double processSeq) {
        this.processSeq = processSeq;
    }

    public ProxyAccessDataTypes100GetResponse withProcessSeq(Double processSeq) {
        this.processSeq = processSeq;
        return this;
    }

    /**
     * Create User
     * <p>
     * Lineage reference object : GTVDTYP_CREATE_USER
     * 
     */
    @JsonProperty("createUser")
    public String getCreateUser() {
        return createUser;
    }

    /**
     * Create User
     * <p>
     * Lineage reference object : GTVDTYP_CREATE_USER
     * 
     */
    @JsonProperty("createUser")
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public ProxyAccessDataTypes100GetResponse withCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : GTVDTYP_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : GTVDTYP_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ProxyAccessDataTypes100GetResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Create Date
     * <p>
     * Lineage reference object : GTVDTYP_CREATE_DATE
     * 
     */
    @JsonProperty("createDate")
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * Create Date
     * <p>
     * Lineage reference object : GTVDTYP_CREATE_DATE
     * 
     */
    @JsonProperty("createDate")
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public ProxyAccessDataTypes100GetResponse withCreateDate(Date createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : GTVDTYP_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : GTVDTYP_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ProxyAccessDataTypes100GetResponse withDesc(String desc) {
        this.desc = desc;
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

    public ProxyAccessDataTypes100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ProxyAccessDataTypes100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("process");
        sb.append('=');
        sb.append(((this.process == null)?"<null>":this.process));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("systemReqInd");
        sb.append('=');
        sb.append(((this.systemReqInd == null)?"<null>":this.systemReqInd));
        sb.append(',');
        sb.append("processSeq");
        sb.append('=');
        sb.append(((this.processSeq == null)?"<null>":this.processSeq));
        sb.append(',');
        sb.append("createUser");
        sb.append('=');
        sb.append(((this.createUser == null)?"<null>":this.createUser));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("createDate");
        sb.append('=');
        sb.append(((this.createDate == null)?"<null>":this.createDate));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
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
        result = ((result* 31)+((this.process == null)? 0 :this.process.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.systemReqInd == null)? 0 :this.systemReqInd.hashCode()));
        result = ((result* 31)+((this.processSeq == null)? 0 :this.processSeq.hashCode()));
        result = ((result* 31)+((this.createUser == null)? 0 :this.createUser.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.createDate == null)? 0 :this.createDate.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProxyAccessDataTypes100GetResponse) == false) {
            return false;
        }
        ProxyAccessDataTypes100GetResponse rhs = ((ProxyAccessDataTypes100GetResponse) other);
        return (((((((((((this.process == rhs.process)||((this.process!= null)&&this.process.equals(rhs.process)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.systemReqInd == rhs.systemReqInd)||((this.systemReqInd!= null)&&this.systemReqInd.equals(rhs.systemReqInd))))&&((this.processSeq == rhs.processSeq)||((this.processSeq!= null)&&this.processSeq.equals(rhs.processSeq))))&&((this.createUser == rhs.createUser)||((this.createUser!= null)&&this.createUser.equals(rhs.createUser))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.createDate == rhs.createDate)||((this.createDate!= null)&&this.createDate.equals(rhs.createDate))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
