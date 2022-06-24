
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
    "areaLevl",
    "areaDesc",
    "areaDynamic",
    "smrguseArea",
    "stuLevel"
})
@Generated("jsonschema2pojo")
public class Smrguse2 {

    /**
     * Course Level
     * <p>
     * 
     * 
     */
    @JsonProperty("areaLevl")
    private String areaLevl;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("areaDesc")
    private String areaDesc;
    @JsonProperty("areaDynamic")
    private String areaDynamic;
    /**
     * Area
     * <p>
     * Lineage reference object : SMRGUSE_AREA
     * 
     */
    @JsonProperty("smrguseArea")
    @JsonPropertyDescription("Lineage reference object : SMRGUSE_AREA")
    private String smrguseArea;
    /**
     * Student Level
     * <p>
     * 
     * 
     */
    @JsonProperty("stuLevel")
    private String stuLevel;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Course Level
     * <p>
     * 
     * 
     */
    @JsonProperty("areaLevl")
    public String getAreaLevl() {
        return areaLevl;
    }

    /**
     * Course Level
     * <p>
     * 
     * 
     */
    @JsonProperty("areaLevl")
    public void setAreaLevl(String areaLevl) {
        this.areaLevl = areaLevl;
    }

    public Smrguse2 withAreaLevl(String areaLevl) {
        this.areaLevl = areaLevl;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("areaDesc")
    public String getAreaDesc() {
        return areaDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("areaDesc")
    public void setAreaDesc(String areaDesc) {
        this.areaDesc = areaDesc;
    }

    public Smrguse2 withAreaDesc(String areaDesc) {
        this.areaDesc = areaDesc;
        return this;
    }

    @JsonProperty("areaDynamic")
    public String getAreaDynamic() {
        return areaDynamic;
    }

    @JsonProperty("areaDynamic")
    public void setAreaDynamic(String areaDynamic) {
        this.areaDynamic = areaDynamic;
    }

    public Smrguse2 withAreaDynamic(String areaDynamic) {
        this.areaDynamic = areaDynamic;
        return this;
    }

    /**
     * Area
     * <p>
     * Lineage reference object : SMRGUSE_AREA
     * 
     */
    @JsonProperty("smrguseArea")
    public String getSmrguseArea() {
        return smrguseArea;
    }

    /**
     * Area
     * <p>
     * Lineage reference object : SMRGUSE_AREA
     * 
     */
    @JsonProperty("smrguseArea")
    public void setSmrguseArea(String smrguseArea) {
        this.smrguseArea = smrguseArea;
    }

    public Smrguse2 withSmrguseArea(String smrguseArea) {
        this.smrguseArea = smrguseArea;
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

    public Smrguse2 withStuLevel(String stuLevel) {
        this.stuLevel = stuLevel;
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

    public Smrguse2 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Smrguse2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("areaLevl");
        sb.append('=');
        sb.append(((this.areaLevl == null)?"<null>":this.areaLevl));
        sb.append(',');
        sb.append("areaDesc");
        sb.append('=');
        sb.append(((this.areaDesc == null)?"<null>":this.areaDesc));
        sb.append(',');
        sb.append("areaDynamic");
        sb.append('=');
        sb.append(((this.areaDynamic == null)?"<null>":this.areaDynamic));
        sb.append(',');
        sb.append("smrguseArea");
        sb.append('=');
        sb.append(((this.smrguseArea == null)?"<null>":this.smrguseArea));
        sb.append(',');
        sb.append("stuLevel");
        sb.append('=');
        sb.append(((this.stuLevel == null)?"<null>":this.stuLevel));
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
        result = ((result* 31)+((this.areaLevl == null)? 0 :this.areaLevl.hashCode()));
        result = ((result* 31)+((this.areaDesc == null)? 0 :this.areaDesc.hashCode()));
        result = ((result* 31)+((this.areaDynamic == null)? 0 :this.areaDynamic.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.smrguseArea == null)? 0 :this.smrguseArea.hashCode()));
        result = ((result* 31)+((this.stuLevel == null)? 0 :this.stuLevel.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Smrguse2) == false) {
            return false;
        }
        Smrguse2 rhs = ((Smrguse2) other);
        return (((((((this.areaLevl == rhs.areaLevl)||((this.areaLevl!= null)&&this.areaLevl.equals(rhs.areaLevl)))&&((this.areaDesc == rhs.areaDesc)||((this.areaDesc!= null)&&this.areaDesc.equals(rhs.areaDesc))))&&((this.areaDynamic == rhs.areaDynamic)||((this.areaDynamic!= null)&&this.areaDynamic.equals(rhs.areaDynamic))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.smrguseArea == rhs.smrguseArea)||((this.smrguseArea!= null)&&this.smrguseArea.equals(rhs.smrguseArea))))&&((this.stuLevel == rhs.stuLevel)||((this.stuLevel!= null)&&this.stuLevel.equals(rhs.stuLevel))));
    }

}
