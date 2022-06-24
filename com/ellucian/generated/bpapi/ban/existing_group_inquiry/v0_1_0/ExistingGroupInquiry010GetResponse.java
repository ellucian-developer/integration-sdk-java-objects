
package com.ellucian.generated.bpapi.ban.existing_group_inquiry.v0_1_0;

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
    "levlCodeStu",
    "termCodeEff",
    "groupDesc",
    "activeInd",
    "levlCode",
    "group"
})
@Generated("jsonschema2pojo")
public class ExistingGroupInquiry010GetResponse {

    /**
     * Student Level
     * <p>
     * 
     * 
     */
    @JsonProperty("levlCodeStu")
    private String levlCodeStu;
    /**
     * Effective Term
     * <p>
     * Lineage reference object : SMBGGEN_TERM_CODE_EFF
     * 
     */
    @JsonProperty("termCodeEff")
    @JsonPropertyDescription("Lineage reference object : SMBGGEN_TERM_CODE_EFF")
    private String termCodeEff;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("groupDesc")
    private String groupDesc;
    /**
     * Lineage reference object : SMBGGEN_ACTIVE_IND
     * 
     */
    @JsonProperty("activeInd")
    @JsonPropertyDescription("Lineage reference object : SMBGGEN_ACTIVE_IND")
    private String activeInd;
    /**
     * Course Level
     * <p>
     * 
     * 
     */
    @JsonProperty("levlCode")
    private String levlCode;
    /**
     * Group
     * <p>
     * Lineage reference object : SMBGGEN_GROUP
     * (Required)
     * 
     */
    @JsonProperty("group")
    @JsonPropertyDescription("Lineage reference object : SMBGGEN_GROUP")
    private String group;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Student Level
     * <p>
     * 
     * 
     */
    @JsonProperty("levlCodeStu")
    public String getLevlCodeStu() {
        return levlCodeStu;
    }

    /**
     * Student Level
     * <p>
     * 
     * 
     */
    @JsonProperty("levlCodeStu")
    public void setLevlCodeStu(String levlCodeStu) {
        this.levlCodeStu = levlCodeStu;
    }

    public ExistingGroupInquiry010GetResponse withLevlCodeStu(String levlCodeStu) {
        this.levlCodeStu = levlCodeStu;
        return this;
    }

    /**
     * Effective Term
     * <p>
     * Lineage reference object : SMBGGEN_TERM_CODE_EFF
     * 
     */
    @JsonProperty("termCodeEff")
    public String getTermCodeEff() {
        return termCodeEff;
    }

    /**
     * Effective Term
     * <p>
     * Lineage reference object : SMBGGEN_TERM_CODE_EFF
     * 
     */
    @JsonProperty("termCodeEff")
    public void setTermCodeEff(String termCodeEff) {
        this.termCodeEff = termCodeEff;
    }

    public ExistingGroupInquiry010GetResponse withTermCodeEff(String termCodeEff) {
        this.termCodeEff = termCodeEff;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("groupDesc")
    public String getGroupDesc() {
        return groupDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("groupDesc")
    public void setGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
    }

    public ExistingGroupInquiry010GetResponse withGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
        return this;
    }

    /**
     * Lineage reference object : SMBGGEN_ACTIVE_IND
     * 
     */
    @JsonProperty("activeInd")
    public String getActiveInd() {
        return activeInd;
    }

    /**
     * Lineage reference object : SMBGGEN_ACTIVE_IND
     * 
     */
    @JsonProperty("activeInd")
    public void setActiveInd(String activeInd) {
        this.activeInd = activeInd;
    }

    public ExistingGroupInquiry010GetResponse withActiveInd(String activeInd) {
        this.activeInd = activeInd;
        return this;
    }

    /**
     * Course Level
     * <p>
     * 
     * 
     */
    @JsonProperty("levlCode")
    public String getLevlCode() {
        return levlCode;
    }

    /**
     * Course Level
     * <p>
     * 
     * 
     */
    @JsonProperty("levlCode")
    public void setLevlCode(String levlCode) {
        this.levlCode = levlCode;
    }

    public ExistingGroupInquiry010GetResponse withLevlCode(String levlCode) {
        this.levlCode = levlCode;
        return this;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : SMBGGEN_GROUP
     * (Required)
     * 
     */
    @JsonProperty("group")
    public String getGroup() {
        return group;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : SMBGGEN_GROUP
     * (Required)
     * 
     */
    @JsonProperty("group")
    public void setGroup(String group) {
        this.group = group;
    }

    public ExistingGroupInquiry010GetResponse withGroup(String group) {
        this.group = group;
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

    public ExistingGroupInquiry010GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ExistingGroupInquiry010GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("levlCodeStu");
        sb.append('=');
        sb.append(((this.levlCodeStu == null)?"<null>":this.levlCodeStu));
        sb.append(',');
        sb.append("termCodeEff");
        sb.append('=');
        sb.append(((this.termCodeEff == null)?"<null>":this.termCodeEff));
        sb.append(',');
        sb.append("groupDesc");
        sb.append('=');
        sb.append(((this.groupDesc == null)?"<null>":this.groupDesc));
        sb.append(',');
        sb.append("activeInd");
        sb.append('=');
        sb.append(((this.activeInd == null)?"<null>":this.activeInd));
        sb.append(',');
        sb.append("levlCode");
        sb.append('=');
        sb.append(((this.levlCode == null)?"<null>":this.levlCode));
        sb.append(',');
        sb.append("group");
        sb.append('=');
        sb.append(((this.group == null)?"<null>":this.group));
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
        result = ((result* 31)+((this.levlCodeStu == null)? 0 :this.levlCodeStu.hashCode()));
        result = ((result* 31)+((this.termCodeEff == null)? 0 :this.termCodeEff.hashCode()));
        result = ((result* 31)+((this.groupDesc == null)? 0 :this.groupDesc.hashCode()));
        result = ((result* 31)+((this.activeInd == null)? 0 :this.activeInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.levlCode == null)? 0 :this.levlCode.hashCode()));
        result = ((result* 31)+((this.group == null)? 0 :this.group.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExistingGroupInquiry010GetResponse) == false) {
            return false;
        }
        ExistingGroupInquiry010GetResponse rhs = ((ExistingGroupInquiry010GetResponse) other);
        return ((((((((this.levlCodeStu == rhs.levlCodeStu)||((this.levlCodeStu!= null)&&this.levlCodeStu.equals(rhs.levlCodeStu)))&&((this.termCodeEff == rhs.termCodeEff)||((this.termCodeEff!= null)&&this.termCodeEff.equals(rhs.termCodeEff))))&&((this.groupDesc == rhs.groupDesc)||((this.groupDesc!= null)&&this.groupDesc.equals(rhs.groupDesc))))&&((this.activeInd == rhs.activeInd)||((this.activeInd!= null)&&this.activeInd.equals(rhs.activeInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))))&&((this.group == rhs.group)||((this.group!= null)&&this.group.equals(rhs.group))));
    }

}
