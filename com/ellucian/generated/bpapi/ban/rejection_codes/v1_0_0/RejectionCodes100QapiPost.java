
package com.ellucian.generated.bpapi.ban.rejection_codes.v1_0_0;

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
    "keyblckRjctType",
    "type",
    "code",
    "desc"
})
@Generated("jsonschema2pojo")
public class RejectionCodes100QapiPost {

    @JsonProperty("keyblckRjctType")
    private String keyblckRjctType;
    /**
     * Type Code
     * <p>
     * Lineage reference object : RTVRJCT_TYPE
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Lineage reference object : RTVRJCT_TYPE")
    private String type;
    /**
     * Reject/Comment Code
     * <p>
     * Lineage reference object : RTVRJCT_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : RTVRJCT_CODE")
    private String code;
    /**
     * Description
     * <p>
     * Lineage reference object : RTVRJCT_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : RTVRJCT_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("keyblckRjctType")
    public String getKeyblckRjctType() {
        return keyblckRjctType;
    }

    @JsonProperty("keyblckRjctType")
    public void setKeyblckRjctType(String keyblckRjctType) {
        this.keyblckRjctType = keyblckRjctType;
    }

    public RejectionCodes100QapiPost withKeyblckRjctType(String keyblckRjctType) {
        this.keyblckRjctType = keyblckRjctType;
        return this;
    }

    /**
     * Type Code
     * <p>
     * Lineage reference object : RTVRJCT_TYPE
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Type Code
     * <p>
     * Lineage reference object : RTVRJCT_TYPE
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public RejectionCodes100QapiPost withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Reject/Comment Code
     * <p>
     * Lineage reference object : RTVRJCT_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Reject/Comment Code
     * <p>
     * Lineage reference object : RTVRJCT_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public RejectionCodes100QapiPost withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : RTVRJCT_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : RTVRJCT_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public RejectionCodes100QapiPost withDesc(String desc) {
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

    public RejectionCodes100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RejectionCodes100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblckRjctType");
        sb.append('=');
        sb.append(((this.keyblckRjctType == null)?"<null>":this.keyblckRjctType));
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
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.keyblckRjctType == null)? 0 :this.keyblckRjctType.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RejectionCodes100QapiPost) == false) {
            return false;
        }
        RejectionCodes100QapiPost rhs = ((RejectionCodes100QapiPost) other);
        return ((((((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.keyblckRjctType == rhs.keyblckRjctType)||((this.keyblckRjctType!= null)&&this.keyblckRjctType.equals(rhs.keyblckRjctType))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
