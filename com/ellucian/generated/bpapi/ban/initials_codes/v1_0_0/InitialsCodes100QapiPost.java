
package com.ellucian.generated.bpapi.ban.initials_codes.v1_0_0;

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
    "desc",
    "emailAddress",
    "title1",
    "title2"
})
@Generated("jsonschema2pojo")
public class InitialsCodes100QapiPost {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVINIT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : STVINIT_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Initials
     * <p>
     * Lineage reference object : STVINIT_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVINIT_CODE")
    private String code;
    /**
     * Full Name
     * <p>
     * Lineage reference object : STVINIT_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVINIT_DESC")
    private String desc;
    /**
     * Email Address
     * <p>
     * Lineage reference object : STVINIT_EMAIL_ADDRESS
     * 
     */
    @JsonProperty("emailAddress")
    @JsonPropertyDescription("Lineage reference object : STVINIT_EMAIL_ADDRESS")
    private String emailAddress;
    /**
     * Title Lines One and Two
     * <p>
     * Lineage reference object : STVINIT_TITLE1
     * 
     */
    @JsonProperty("title1")
    @JsonPropertyDescription("Lineage reference object : STVINIT_TITLE1")
    private String title1;
    /**
     * Description
     * <p>
     * Lineage reference object : STVINIT_TITLE2
     * 
     */
    @JsonProperty("title2")
    @JsonPropertyDescription("Lineage reference object : STVINIT_TITLE2")
    private String title2;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVINIT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVINIT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public InitialsCodes100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Initials
     * <p>
     * Lineage reference object : STVINIT_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Initials
     * <p>
     * Lineage reference object : STVINIT_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public InitialsCodes100QapiPost withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Full Name
     * <p>
     * Lineage reference object : STVINIT_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Full Name
     * <p>
     * Lineage reference object : STVINIT_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public InitialsCodes100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Email Address
     * <p>
     * Lineage reference object : STVINIT_EMAIL_ADDRESS
     * 
     */
    @JsonProperty("emailAddress")
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Email Address
     * <p>
     * Lineage reference object : STVINIT_EMAIL_ADDRESS
     * 
     */
    @JsonProperty("emailAddress")
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public InitialsCodes100QapiPost withEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    /**
     * Title Lines One and Two
     * <p>
     * Lineage reference object : STVINIT_TITLE1
     * 
     */
    @JsonProperty("title1")
    public String getTitle1() {
        return title1;
    }

    /**
     * Title Lines One and Two
     * <p>
     * Lineage reference object : STVINIT_TITLE1
     * 
     */
    @JsonProperty("title1")
    public void setTitle1(String title1) {
        this.title1 = title1;
    }

    public InitialsCodes100QapiPost withTitle1(String title1) {
        this.title1 = title1;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVINIT_TITLE2
     * 
     */
    @JsonProperty("title2")
    public String getTitle2() {
        return title2;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVINIT_TITLE2
     * 
     */
    @JsonProperty("title2")
    public void setTitle2(String title2) {
        this.title2 = title2;
    }

    public InitialsCodes100QapiPost withTitle2(String title2) {
        this.title2 = title2;
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

    public InitialsCodes100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InitialsCodes100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("emailAddress");
        sb.append('=');
        sb.append(((this.emailAddress == null)?"<null>":this.emailAddress));
        sb.append(',');
        sb.append("title1");
        sb.append('=');
        sb.append(((this.title1 == null)?"<null>":this.title1));
        sb.append(',');
        sb.append("title2");
        sb.append('=');
        sb.append(((this.title2 == null)?"<null>":this.title2));
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
        result = ((result* 31)+((this.emailAddress == null)? 0 :this.emailAddress.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.title1 == null)? 0 :this.title1 .hashCode()));
        result = ((result* 31)+((this.title2 == null)? 0 :this.title2 .hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InitialsCodes100QapiPost) == false) {
            return false;
        }
        InitialsCodes100QapiPost rhs = ((InitialsCodes100QapiPost) other);
        return ((((((((this.emailAddress == rhs.emailAddress)||((this.emailAddress!= null)&&this.emailAddress.equals(rhs.emailAddress)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.title1 == rhs.title1)||((this.title1 != null)&&this.title1 .equals(rhs.title1))))&&((this.title2 == rhs.title2)||((this.title2 != null)&&this.title2 .equals(rhs.title2))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
