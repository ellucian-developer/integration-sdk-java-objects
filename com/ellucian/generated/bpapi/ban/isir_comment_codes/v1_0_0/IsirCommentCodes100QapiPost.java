
package com.ellucian.generated.bpapi.ban.isir_comment_codes.v1_0_0;

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
    "keyblckAidyCode",
    "type",
    "code",
    "desc",
    "isirPrintInd"
})
@Generated("jsonschema2pojo")
public class IsirCommentCodes100QapiPost {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("keyblckAidyCode")
    private String keyblckAidyCode;
    /**
     * Rtvicmt Type
     * <p>
     * Lineage reference object : RTVICMT_TYPE
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Lineage reference object : RTVICMT_TYPE")
    private String type;
    /**
     * Rtvicmt Code
     * <p>
     * Lineage reference object : RTVICMT_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : RTVICMT_CODE")
    private String code;
    /**
     * Rtvicmt Desc
     * <p>
     * Lineage reference object : RTVICMT_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : RTVICMT_DESC")
    private String desc;
    /**
     * Lineage reference object : RTVICMT_ISIR_PRINT_IND
     * 
     */
    @JsonProperty("isirPrintInd")
    @JsonPropertyDescription("Lineage reference object : RTVICMT_ISIR_PRINT_IND")
    private String isirPrintInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("keyblckAidyCode")
    public String getKeyblckAidyCode() {
        return keyblckAidyCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("keyblckAidyCode")
    public void setKeyblckAidyCode(String keyblckAidyCode) {
        this.keyblckAidyCode = keyblckAidyCode;
    }

    public IsirCommentCodes100QapiPost withKeyblckAidyCode(String keyblckAidyCode) {
        this.keyblckAidyCode = keyblckAidyCode;
        return this;
    }

    /**
     * Rtvicmt Type
     * <p>
     * Lineage reference object : RTVICMT_TYPE
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Rtvicmt Type
     * <p>
     * Lineage reference object : RTVICMT_TYPE
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public IsirCommentCodes100QapiPost withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Rtvicmt Code
     * <p>
     * Lineage reference object : RTVICMT_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Rtvicmt Code
     * <p>
     * Lineage reference object : RTVICMT_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public IsirCommentCodes100QapiPost withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Rtvicmt Desc
     * <p>
     * Lineage reference object : RTVICMT_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Rtvicmt Desc
     * <p>
     * Lineage reference object : RTVICMT_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public IsirCommentCodes100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Lineage reference object : RTVICMT_ISIR_PRINT_IND
     * 
     */
    @JsonProperty("isirPrintInd")
    public String getIsirPrintInd() {
        return isirPrintInd;
    }

    /**
     * Lineage reference object : RTVICMT_ISIR_PRINT_IND
     * 
     */
    @JsonProperty("isirPrintInd")
    public void setIsirPrintInd(String isirPrintInd) {
        this.isirPrintInd = isirPrintInd;
    }

    public IsirCommentCodes100QapiPost withIsirPrintInd(String isirPrintInd) {
        this.isirPrintInd = isirPrintInd;
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

    public IsirCommentCodes100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(IsirCommentCodes100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblckAidyCode");
        sb.append('=');
        sb.append(((this.keyblckAidyCode == null)?"<null>":this.keyblckAidyCode));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("isirPrintInd");
        sb.append('=');
        sb.append(((this.isirPrintInd == null)?"<null>":this.isirPrintInd));
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
        result = ((result* 31)+((this.keyblckAidyCode == null)? 0 :this.keyblckAidyCode.hashCode()));
        result = ((result* 31)+((this.isirPrintInd == null)? 0 :this.isirPrintInd.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IsirCommentCodes100QapiPost) == false) {
            return false;
        }
        IsirCommentCodes100QapiPost rhs = ((IsirCommentCodes100QapiPost) other);
        return (((((((this.keyblckAidyCode == rhs.keyblckAidyCode)||((this.keyblckAidyCode!= null)&&this.keyblckAidyCode.equals(rhs.keyblckAidyCode)))&&((this.isirPrintInd == rhs.isirPrintInd)||((this.isirPrintInd!= null)&&this.isirPrintInd.equals(rhs.isirPrintInd))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
