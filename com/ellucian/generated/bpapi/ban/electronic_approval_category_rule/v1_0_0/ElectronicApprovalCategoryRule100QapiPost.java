
package com.ellucian.generated.bpapi.ban.electronic_approval_category_rule.v1_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "acatCode",
    "aptyCode",
    "aptyEntrySeqNo"
})
@Generated("jsonschema2pojo")
public class ElectronicApprovalCategoryRule100QapiPost {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("acatCode")
    private String acatCode;
    @JsonProperty("aptyCode")
    private String aptyCode;
    @JsonProperty("aptyEntrySeqNo")
    private String aptyEntrySeqNo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("acatCode")
    public String getAcatCode() {
        return acatCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("acatCode")
    public void setAcatCode(String acatCode) {
        this.acatCode = acatCode;
    }

    public ElectronicApprovalCategoryRule100QapiPost withAcatCode(String acatCode) {
        this.acatCode = acatCode;
        return this;
    }

    @JsonProperty("aptyCode")
    public String getAptyCode() {
        return aptyCode;
    }

    @JsonProperty("aptyCode")
    public void setAptyCode(String aptyCode) {
        this.aptyCode = aptyCode;
    }

    public ElectronicApprovalCategoryRule100QapiPost withAptyCode(String aptyCode) {
        this.aptyCode = aptyCode;
        return this;
    }

    @JsonProperty("aptyEntrySeqNo")
    public String getAptyEntrySeqNo() {
        return aptyEntrySeqNo;
    }

    @JsonProperty("aptyEntrySeqNo")
    public void setAptyEntrySeqNo(String aptyEntrySeqNo) {
        this.aptyEntrySeqNo = aptyEntrySeqNo;
    }

    public ElectronicApprovalCategoryRule100QapiPost withAptyEntrySeqNo(String aptyEntrySeqNo) {
        this.aptyEntrySeqNo = aptyEntrySeqNo;
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

    public ElectronicApprovalCategoryRule100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ElectronicApprovalCategoryRule100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("acatCode");
        sb.append('=');
        sb.append(((this.acatCode == null)?"<null>":this.acatCode));
        sb.append(',');
        sb.append("aptyCode");
        sb.append('=');
        sb.append(((this.aptyCode == null)?"<null>":this.aptyCode));
        sb.append(',');
        sb.append("aptyEntrySeqNo");
        sb.append('=');
        sb.append(((this.aptyEntrySeqNo == null)?"<null>":this.aptyEntrySeqNo));
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
        result = ((result* 31)+((this.acatCode == null)? 0 :this.acatCode.hashCode()));
        result = ((result* 31)+((this.aptyEntrySeqNo == null)? 0 :this.aptyEntrySeqNo.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.aptyCode == null)? 0 :this.aptyCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ElectronicApprovalCategoryRule100QapiPost) == false) {
            return false;
        }
        ElectronicApprovalCategoryRule100QapiPost rhs = ((ElectronicApprovalCategoryRule100QapiPost) other);
        return (((((this.acatCode == rhs.acatCode)||((this.acatCode!= null)&&this.acatCode.equals(rhs.acatCode)))&&((this.aptyEntrySeqNo == rhs.aptyEntrySeqNo)||((this.aptyEntrySeqNo!= null)&&this.aptyEntrySeqNo.equals(rhs.aptyEntrySeqNo))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.aptyCode == rhs.aptyCode)||((this.aptyCode!= null)&&this.aptyCode.equals(rhs.aptyCode))));
    }

}
