
package com.ellucian.generated.bpapi.ban.application_checklist_statuses.v1_0_0;

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
    "code",
    "desc",
    "userId",
    "webInd"
})
@Generated("jsonschema2pojo")
public class ApplicationChecklistStatuses100QapiPost {

    /**
     * Admissions Checklist Status Code
     * <p>
     * Lineage reference object : STVCKST_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVCKST_CODE")
    private String code;
    /**
     * Description
     * <p>
     * Lineage reference object : STVCKST_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVCKST_DESC")
    private String desc;
    /**
     * User ID
     * <p>
     * Lineage reference object : STVCKST_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : STVCKST_USER_ID")
    private String userId;
    /**
     * Lineage reference object : STVCKST_WEB_IND
     * 
     */
    @JsonProperty("webInd")
    @JsonPropertyDescription("Lineage reference object : STVCKST_WEB_IND")
    private String webInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Admissions Checklist Status Code
     * <p>
     * Lineage reference object : STVCKST_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Admissions Checklist Status Code
     * <p>
     * Lineage reference object : STVCKST_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public ApplicationChecklistStatuses100QapiPost withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVCKST_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVCKST_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ApplicationChecklistStatuses100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : STVCKST_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : STVCKST_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ApplicationChecklistStatuses100QapiPost withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Lineage reference object : STVCKST_WEB_IND
     * 
     */
    @JsonProperty("webInd")
    public String getWebInd() {
        return webInd;
    }

    /**
     * Lineage reference object : STVCKST_WEB_IND
     * 
     */
    @JsonProperty("webInd")
    public void setWebInd(String webInd) {
        this.webInd = webInd;
    }

    public ApplicationChecklistStatuses100QapiPost withWebInd(String webInd) {
        this.webInd = webInd;
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

    public ApplicationChecklistStatuses100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApplicationChecklistStatuses100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("webInd");
        sb.append('=');
        sb.append(((this.webInd == null)?"<null>":this.webInd));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.webInd == null)? 0 :this.webInd.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicationChecklistStatuses100QapiPost) == false) {
            return false;
        }
        ApplicationChecklistStatuses100QapiPost rhs = ((ApplicationChecklistStatuses100QapiPost) other);
        return ((((((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.webInd == rhs.webInd)||((this.webInd!= null)&&this.webInd.equals(rhs.webInd))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
