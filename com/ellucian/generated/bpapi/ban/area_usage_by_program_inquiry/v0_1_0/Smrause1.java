
package com.ellucian.generated.bpapi.ban.area_usage_by_program_inquiry.v0_1_0;

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
    "studentLevel",
    "areaDesc",
    "smrauseArea",
    "dynamicInd",
    "smrauseInd"
})
@Generated("jsonschema2pojo")
public class Smrause1 {

    /**
     * Course Level
     * <p>
     * 
     * 
     */
    @JsonProperty("areaLevl")
    private String areaLevl;
    /**
     * Student Level
     * <p>
     * 
     * 
     */
    @JsonProperty("studentLevel")
    private String studentLevel;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("areaDesc")
    private String areaDesc;
    /**
     * Area
     * <p>
     * Lineage reference object : SMRAUSE_AREA
     * 
     */
    @JsonProperty("smrauseArea")
    @JsonPropertyDescription("Lineage reference object : SMRAUSE_AREA")
    private String smrauseArea;
    @JsonProperty("dynamicInd")
    private String dynamicInd;
    @JsonProperty("smrauseInd")
    private String smrauseInd;
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

    public Smrause1 withAreaLevl(String areaLevl) {
        this.areaLevl = areaLevl;
        return this;
    }

    /**
     * Student Level
     * <p>
     * 
     * 
     */
    @JsonProperty("studentLevel")
    public String getStudentLevel() {
        return studentLevel;
    }

    /**
     * Student Level
     * <p>
     * 
     * 
     */
    @JsonProperty("studentLevel")
    public void setStudentLevel(String studentLevel) {
        this.studentLevel = studentLevel;
    }

    public Smrause1 withStudentLevel(String studentLevel) {
        this.studentLevel = studentLevel;
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

    public Smrause1 withAreaDesc(String areaDesc) {
        this.areaDesc = areaDesc;
        return this;
    }

    /**
     * Area
     * <p>
     * Lineage reference object : SMRAUSE_AREA
     * 
     */
    @JsonProperty("smrauseArea")
    public String getSmrauseArea() {
        return smrauseArea;
    }

    /**
     * Area
     * <p>
     * Lineage reference object : SMRAUSE_AREA
     * 
     */
    @JsonProperty("smrauseArea")
    public void setSmrauseArea(String smrauseArea) {
        this.smrauseArea = smrauseArea;
    }

    public Smrause1 withSmrauseArea(String smrauseArea) {
        this.smrauseArea = smrauseArea;
        return this;
    }

    @JsonProperty("dynamicInd")
    public String getDynamicInd() {
        return dynamicInd;
    }

    @JsonProperty("dynamicInd")
    public void setDynamicInd(String dynamicInd) {
        this.dynamicInd = dynamicInd;
    }

    public Smrause1 withDynamicInd(String dynamicInd) {
        this.dynamicInd = dynamicInd;
        return this;
    }

    @JsonProperty("smrauseInd")
    public String getSmrauseInd() {
        return smrauseInd;
    }

    @JsonProperty("smrauseInd")
    public void setSmrauseInd(String smrauseInd) {
        this.smrauseInd = smrauseInd;
    }

    public Smrause1 withSmrauseInd(String smrauseInd) {
        this.smrauseInd = smrauseInd;
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

    public Smrause1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Smrause1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("areaLevl");
        sb.append('=');
        sb.append(((this.areaLevl == null)?"<null>":this.areaLevl));
        sb.append(',');
        sb.append("studentLevel");
        sb.append('=');
        sb.append(((this.studentLevel == null)?"<null>":this.studentLevel));
        sb.append(',');
        sb.append("areaDesc");
        sb.append('=');
        sb.append(((this.areaDesc == null)?"<null>":this.areaDesc));
        sb.append(',');
        sb.append("smrauseArea");
        sb.append('=');
        sb.append(((this.smrauseArea == null)?"<null>":this.smrauseArea));
        sb.append(',');
        sb.append("dynamicInd");
        sb.append('=');
        sb.append(((this.dynamicInd == null)?"<null>":this.dynamicInd));
        sb.append(',');
        sb.append("smrauseInd");
        sb.append('=');
        sb.append(((this.smrauseInd == null)?"<null>":this.smrauseInd));
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
        result = ((result* 31)+((this.studentLevel == null)? 0 :this.studentLevel.hashCode()));
        result = ((result* 31)+((this.areaDesc == null)? 0 :this.areaDesc.hashCode()));
        result = ((result* 31)+((this.smrauseArea == null)? 0 :this.smrauseArea.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.dynamicInd == null)? 0 :this.dynamicInd.hashCode()));
        result = ((result* 31)+((this.smrauseInd == null)? 0 :this.smrauseInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Smrause1) == false) {
            return false;
        }
        Smrause1 rhs = ((Smrause1) other);
        return ((((((((this.areaLevl == rhs.areaLevl)||((this.areaLevl!= null)&&this.areaLevl.equals(rhs.areaLevl)))&&((this.studentLevel == rhs.studentLevel)||((this.studentLevel!= null)&&this.studentLevel.equals(rhs.studentLevel))))&&((this.areaDesc == rhs.areaDesc)||((this.areaDesc!= null)&&this.areaDesc.equals(rhs.areaDesc))))&&((this.smrauseArea == rhs.smrauseArea)||((this.smrauseArea!= null)&&this.smrauseArea.equals(rhs.smrauseArea))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.dynamicInd == rhs.dynamicInd)||((this.dynamicInd!= null)&&this.dynamicInd.equals(rhs.dynamicInd))))&&((this.smrauseInd == rhs.smrauseInd)||((this.smrauseInd!= null)&&this.smrauseInd.equals(rhs.smrauseInd))));
    }

}
