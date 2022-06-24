
package com.ellucian.generated.bpapi.ban.group_usage_by_area_inquiry.v0_1_0;

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
    "groupDesc",
    "levlCode",
    "stuLevel",
    "smrguseGroup"
})
@Generated("jsonschema2pojo")
public class Smrguse1 {

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("groupDesc")
    private String groupDesc;
    /**
     * Course Level
     * <p>
     * 
     * 
     */
    @JsonProperty("levlCode")
    private String levlCode;
    /**
     * Student Level
     * <p>
     * 
     * 
     */
    @JsonProperty("stuLevel")
    private String stuLevel;
    /**
     * Group
     * <p>
     * Lineage reference object : SMRGUSE_GROUP
     * 
     */
    @JsonProperty("smrguseGroup")
    @JsonPropertyDescription("Lineage reference object : SMRGUSE_GROUP")
    private String smrguseGroup;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public Smrguse1 withGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
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

    public Smrguse1 withLevlCode(String levlCode) {
        this.levlCode = levlCode;
        return this;
    }

    /**
     * Student Level
     * <p>
     * 
     * 
     */
    @JsonProperty("stuLevel")
    public String getStuLevel() {
        return stuLevel;
    }

    /**
     * Student Level
     * <p>
     * 
     * 
     */
    @JsonProperty("stuLevel")
    public void setStuLevel(String stuLevel) {
        this.stuLevel = stuLevel;
    }

    public Smrguse1 withStuLevel(String stuLevel) {
        this.stuLevel = stuLevel;
        return this;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : SMRGUSE_GROUP
     * 
     */
    @JsonProperty("smrguseGroup")
    public String getSmrguseGroup() {
        return smrguseGroup;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : SMRGUSE_GROUP
     * 
     */
    @JsonProperty("smrguseGroup")
    public void setSmrguseGroup(String smrguseGroup) {
        this.smrguseGroup = smrguseGroup;
    }

    public Smrguse1 withSmrguseGroup(String smrguseGroup) {
        this.smrguseGroup = smrguseGroup;
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

    public Smrguse1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Smrguse1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("groupDesc");
        sb.append('=');
        sb.append(((this.groupDesc == null)?"<null>":this.groupDesc));
        sb.append(',');
        sb.append("levlCode");
        sb.append('=');
        sb.append(((this.levlCode == null)?"<null>":this.levlCode));
        sb.append(',');
        sb.append("stuLevel");
        sb.append('=');
        sb.append(((this.stuLevel == null)?"<null>":this.stuLevel));
        sb.append(',');
        sb.append("smrguseGroup");
        sb.append('=');
        sb.append(((this.smrguseGroup == null)?"<null>":this.smrguseGroup));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.groupDesc == null)? 0 :this.groupDesc.hashCode()));
        result = ((result* 31)+((this.levlCode == null)? 0 :this.levlCode.hashCode()));
        result = ((result* 31)+((this.stuLevel == null)? 0 :this.stuLevel.hashCode()));
        result = ((result* 31)+((this.smrguseGroup == null)? 0 :this.smrguseGroup.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Smrguse1) == false) {
            return false;
        }
        Smrguse1 rhs = ((Smrguse1) other);
        return ((((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.groupDesc == rhs.groupDesc)||((this.groupDesc!= null)&&this.groupDesc.equals(rhs.groupDesc))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))))&&((this.stuLevel == rhs.stuLevel)||((this.stuLevel!= null)&&this.stuLevel.equals(rhs.stuLevel))))&&((this.smrguseGroup == rhs.smrguseGroup)||((this.smrguseGroup!= null)&&this.smrguseGroup.equals(rhs.smrguseGroup))));
    }

}
