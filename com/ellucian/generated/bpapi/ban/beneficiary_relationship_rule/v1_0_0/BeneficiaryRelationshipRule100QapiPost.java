
package com.ellucian.generated.bpapi.ban.beneficiary_relationship_rule.v1_0_0;

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
    "code",
    "desc",
    "type",
    "brelCodeReci",
    "activityDate"
})
@Generated("jsonschema2pojo")
public class BeneficiaryRelationshipRule100QapiPost {

    /**
     * Relationship Code
     * <p>
     * Lineage reference object : PTRBREL_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : PTRBREL_CODE")
    private String code;
    /**
     * Description
     * <p>
     * Lineage reference object : PTRBREL_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : PTRBREL_DESC")
    private String desc;
    /**
     * Type
     * <p>
     * Lineage reference object : PTRBREL_TYPE
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Lineage reference object : PTRBREL_TYPE")
    private String type;
    /**
     * Reciprocal Code
     * <p>
     * Lineage reference object : PTRBREL_BREL_CODE_RECI
     * 
     */
    @JsonProperty("brelCodeReci")
    @JsonPropertyDescription("Lineage reference object : PTRBREL_BREL_CODE_RECI")
    private String brelCodeReci;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRBREL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : PTRBREL_ACTIVITY_DATE")
    private Date activityDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Relationship Code
     * <p>
     * Lineage reference object : PTRBREL_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Relationship Code
     * <p>
     * Lineage reference object : PTRBREL_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public BeneficiaryRelationshipRule100QapiPost withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : PTRBREL_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : PTRBREL_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public BeneficiaryRelationshipRule100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : PTRBREL_TYPE
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : PTRBREL_TYPE
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public BeneficiaryRelationshipRule100QapiPost withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Reciprocal Code
     * <p>
     * Lineage reference object : PTRBREL_BREL_CODE_RECI
     * 
     */
    @JsonProperty("brelCodeReci")
    public String getBrelCodeReci() {
        return brelCodeReci;
    }

    /**
     * Reciprocal Code
     * <p>
     * Lineage reference object : PTRBREL_BREL_CODE_RECI
     * 
     */
    @JsonProperty("brelCodeReci")
    public void setBrelCodeReci(String brelCodeReci) {
        this.brelCodeReci = brelCodeReci;
    }

    public BeneficiaryRelationshipRule100QapiPost withBrelCodeReci(String brelCodeReci) {
        this.brelCodeReci = brelCodeReci;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRBREL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRBREL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public BeneficiaryRelationshipRule100QapiPost withActivityDate(Date activityDate) {
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

    public BeneficiaryRelationshipRule100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BeneficiaryRelationshipRule100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("brelCodeReci");
        sb.append('=');
        sb.append(((this.brelCodeReci == null)?"<null>":this.brelCodeReci));
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
        result = ((result* 31)+((this.brelCodeReci == null)? 0 :this.brelCodeReci.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
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
        if ((other instanceof BeneficiaryRelationshipRule100QapiPost) == false) {
            return false;
        }
        BeneficiaryRelationshipRule100QapiPost rhs = ((BeneficiaryRelationshipRule100QapiPost) other);
        return (((((((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code)))&&((this.brelCodeReci == rhs.brelCodeReci)||((this.brelCodeReci!= null)&&this.brelCodeReci.equals(rhs.brelCodeReci))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
