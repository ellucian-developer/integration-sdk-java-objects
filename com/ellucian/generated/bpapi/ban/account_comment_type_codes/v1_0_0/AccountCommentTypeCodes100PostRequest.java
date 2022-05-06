
package com.ellucian.generated.bpapi.ban.account_comment_type_codes.v1_0_0;

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
    "enddateReqInd",
    "activeInd",
    "termReqInd",
    "restrictUpdateInd",
    "purgeInd",
    "desc",
    "origCode"
})
@Generated("jsonschema2pojo")
public class AccountCommentTypeCodes100PostRequest {

    /**
     * Code
     * <p>
     * Lineage reference object : TTVCMNT_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : TTVCMNT_CODE")
    private String code;
    /**
     * End Date Required
     * <p>
     * Lineage reference object : TTVCMNT_ENDDATE_REQ_IND
     * 
     */
    @JsonProperty("enddateReqInd")
    @JsonPropertyDescription("Lineage reference object : TTVCMNT_ENDDATE_REQ_IND")
    private String enddateReqInd;
    /**
     * Active
     * <p>
     * Lineage reference object : TTVCMNT_ACTIVE_IND
     * 
     */
    @JsonProperty("activeInd")
    @JsonPropertyDescription("Lineage reference object : TTVCMNT_ACTIVE_IND")
    private String activeInd;
    /**
     * Term Required
     * <p>
     * Lineage reference object : TTVCMNT_TERM_REQ_IND
     * 
     */
    @JsonProperty("termReqInd")
    @JsonPropertyDescription("Lineage reference object : TTVCMNT_TERM_REQ_IND")
    private String termReqInd;
    /**
     * Restrict Update
     * <p>
     * Lineage reference object : TTVCMNT_RESTRICT_UPDATE_IND
     * 
     */
    @JsonProperty("restrictUpdateInd")
    @JsonPropertyDescription("Lineage reference object : TTVCMNT_RESTRICT_UPDATE_IND")
    private String restrictUpdateInd;
    /**
     * Purge
     * <p>
     * Lineage reference object : TTVCMNT_PURGE_IND
     * 
     */
    @JsonProperty("purgeInd")
    @JsonPropertyDescription("Lineage reference object : TTVCMNT_PURGE_IND")
    private String purgeInd;
    /**
     * Description
     * <p>
     * Lineage reference object : TTVCMNT_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : TTVCMNT_DESC")
    private String desc;
    /**
     * Originator
     * <p>
     * Lineage reference object : TTVCMNT_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("origCode")
    @JsonPropertyDescription("Lineage reference object : TTVCMNT_ORIG_CODE, Lookup lineage reference object : stvorig")
    private String origCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Code
     * <p>
     * Lineage reference object : TTVCMNT_CODE
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
     * Lineage reference object : TTVCMNT_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public AccountCommentTypeCodes100PostRequest withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * End Date Required
     * <p>
     * Lineage reference object : TTVCMNT_ENDDATE_REQ_IND
     * 
     */
    @JsonProperty("enddateReqInd")
    public String getEnddateReqInd() {
        return enddateReqInd;
    }

    /**
     * End Date Required
     * <p>
     * Lineage reference object : TTVCMNT_ENDDATE_REQ_IND
     * 
     */
    @JsonProperty("enddateReqInd")
    public void setEnddateReqInd(String enddateReqInd) {
        this.enddateReqInd = enddateReqInd;
    }

    public AccountCommentTypeCodes100PostRequest withEnddateReqInd(String enddateReqInd) {
        this.enddateReqInd = enddateReqInd;
        return this;
    }

    /**
     * Active
     * <p>
     * Lineage reference object : TTVCMNT_ACTIVE_IND
     * 
     */
    @JsonProperty("activeInd")
    public String getActiveInd() {
        return activeInd;
    }

    /**
     * Active
     * <p>
     * Lineage reference object : TTVCMNT_ACTIVE_IND
     * 
     */
    @JsonProperty("activeInd")
    public void setActiveInd(String activeInd) {
        this.activeInd = activeInd;
    }

    public AccountCommentTypeCodes100PostRequest withActiveInd(String activeInd) {
        this.activeInd = activeInd;
        return this;
    }

    /**
     * Term Required
     * <p>
     * Lineage reference object : TTVCMNT_TERM_REQ_IND
     * 
     */
    @JsonProperty("termReqInd")
    public String getTermReqInd() {
        return termReqInd;
    }

    /**
     * Term Required
     * <p>
     * Lineage reference object : TTVCMNT_TERM_REQ_IND
     * 
     */
    @JsonProperty("termReqInd")
    public void setTermReqInd(String termReqInd) {
        this.termReqInd = termReqInd;
    }

    public AccountCommentTypeCodes100PostRequest withTermReqInd(String termReqInd) {
        this.termReqInd = termReqInd;
        return this;
    }

    /**
     * Restrict Update
     * <p>
     * Lineage reference object : TTVCMNT_RESTRICT_UPDATE_IND
     * 
     */
    @JsonProperty("restrictUpdateInd")
    public String getRestrictUpdateInd() {
        return restrictUpdateInd;
    }

    /**
     * Restrict Update
     * <p>
     * Lineage reference object : TTVCMNT_RESTRICT_UPDATE_IND
     * 
     */
    @JsonProperty("restrictUpdateInd")
    public void setRestrictUpdateInd(String restrictUpdateInd) {
        this.restrictUpdateInd = restrictUpdateInd;
    }

    public AccountCommentTypeCodes100PostRequest withRestrictUpdateInd(String restrictUpdateInd) {
        this.restrictUpdateInd = restrictUpdateInd;
        return this;
    }

    /**
     * Purge
     * <p>
     * Lineage reference object : TTVCMNT_PURGE_IND
     * 
     */
    @JsonProperty("purgeInd")
    public String getPurgeInd() {
        return purgeInd;
    }

    /**
     * Purge
     * <p>
     * Lineage reference object : TTVCMNT_PURGE_IND
     * 
     */
    @JsonProperty("purgeInd")
    public void setPurgeInd(String purgeInd) {
        this.purgeInd = purgeInd;
    }

    public AccountCommentTypeCodes100PostRequest withPurgeInd(String purgeInd) {
        this.purgeInd = purgeInd;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TTVCMNT_DESC
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
     * Lineage reference object : TTVCMNT_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public AccountCommentTypeCodes100PostRequest withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Originator
     * <p>
     * Lineage reference object : TTVCMNT_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("origCode")
    public String getOrigCode() {
        return origCode;
    }

    /**
     * Originator
     * <p>
     * Lineage reference object : TTVCMNT_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("origCode")
    public void setOrigCode(String origCode) {
        this.origCode = origCode;
    }

    public AccountCommentTypeCodes100PostRequest withOrigCode(String origCode) {
        this.origCode = origCode;
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

    public AccountCommentTypeCodes100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AccountCommentTypeCodes100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("enddateReqInd");
        sb.append('=');
        sb.append(((this.enddateReqInd == null)?"<null>":this.enddateReqInd));
        sb.append(',');
        sb.append("activeInd");
        sb.append('=');
        sb.append(((this.activeInd == null)?"<null>":this.activeInd));
        sb.append(',');
        sb.append("termReqInd");
        sb.append('=');
        sb.append(((this.termReqInd == null)?"<null>":this.termReqInd));
        sb.append(',');
        sb.append("restrictUpdateInd");
        sb.append('=');
        sb.append(((this.restrictUpdateInd == null)?"<null>":this.restrictUpdateInd));
        sb.append(',');
        sb.append("purgeInd");
        sb.append('=');
        sb.append(((this.purgeInd == null)?"<null>":this.purgeInd));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("origCode");
        sb.append('=');
        sb.append(((this.origCode == null)?"<null>":this.origCode));
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
        result = ((result* 31)+((this.enddateReqInd == null)? 0 :this.enddateReqInd.hashCode()));
        result = ((result* 31)+((this.activeInd == null)? 0 :this.activeInd.hashCode()));
        result = ((result* 31)+((this.termReqInd == null)? 0 :this.termReqInd.hashCode()));
        result = ((result* 31)+((this.restrictUpdateInd == null)? 0 :this.restrictUpdateInd.hashCode()));
        result = ((result* 31)+((this.purgeInd == null)? 0 :this.purgeInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        result = ((result* 31)+((this.origCode == null)? 0 :this.origCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccountCommentTypeCodes100PostRequest) == false) {
            return false;
        }
        AccountCommentTypeCodes100PostRequest rhs = ((AccountCommentTypeCodes100PostRequest) other);
        return ((((((((((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code)))&&((this.enddateReqInd == rhs.enddateReqInd)||((this.enddateReqInd!= null)&&this.enddateReqInd.equals(rhs.enddateReqInd))))&&((this.activeInd == rhs.activeInd)||((this.activeInd!= null)&&this.activeInd.equals(rhs.activeInd))))&&((this.termReqInd == rhs.termReqInd)||((this.termReqInd!= null)&&this.termReqInd.equals(rhs.termReqInd))))&&((this.restrictUpdateInd == rhs.restrictUpdateInd)||((this.restrictUpdateInd!= null)&&this.restrictUpdateInd.equals(rhs.restrictUpdateInd))))&&((this.purgeInd == rhs.purgeInd)||((this.purgeInd!= null)&&this.purgeInd.equals(rhs.purgeInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.origCode == rhs.origCode)||((this.origCode!= null)&&this.origCode.equals(rhs.origCode))));
    }

}
