
package com.ellucian.generated.bpapi.ban.open_learning_section_default_rules.v1_0_0;

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
    "keyblckTermCode",
    "keyblocTermCodeDef",
    "collCode",
    "collCodeDesc",
    "deptCode",
    "campCode",
    "campCodeDesc",
    "schdCode",
    "schdCodeDesc",
    "insmCode",
    "insmCodeDesc",
    "regStartDate",
    "regEndDate",
    "censusDateOne",
    "censusDateTwo",
    "overrideInd",
    "activityDate",
    "userId"
})
@Generated("jsonschema2pojo")
public class OpenLearningSectionDefaultRules100QapiPost {

    @JsonProperty("keyblckTermCode")
    private String keyblckTermCode;
    @JsonProperty("keyblocTermCodeDef")
    private String keyblocTermCodeDef;
    @JsonProperty("collCode")
    private String collCode;
    @JsonProperty("collCodeDesc")
    private String collCodeDesc;
    @JsonProperty("deptCode")
    private String deptCode;
    @JsonProperty("campCode")
    private String campCode;
    @JsonProperty("campCodeDesc")
    private String campCodeDesc;
    @JsonProperty("schdCode")
    private String schdCode;
    @JsonProperty("schdCodeDesc")
    private String schdCodeDesc;
    @JsonProperty("insmCode")
    private String insmCode;
    @JsonProperty("insmCodeDesc")
    private String insmCodeDesc;
    @JsonProperty("regStartDate")
    private String regStartDate;
    @JsonProperty("regEndDate")
    private String regEndDate;
    @JsonProperty("censusDateOne")
    private String censusDateOne;
    @JsonProperty("censusDateTwo")
    private String censusDateTwo;
    @JsonProperty("overrideInd")
    private String overrideInd;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SORRSTS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SORRSTS_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Lineage reference object : SORRSTS_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SORRSTS_USER_ID")
    private String userId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("keyblckTermCode")
    public String getKeyblckTermCode() {
        return keyblckTermCode;
    }

    @JsonProperty("keyblckTermCode")
    public void setKeyblckTermCode(String keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
    }

    public OpenLearningSectionDefaultRules100QapiPost withKeyblckTermCode(String keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
        return this;
    }

    @JsonProperty("keyblocTermCodeDef")
    public String getKeyblocTermCodeDef() {
        return keyblocTermCodeDef;
    }

    @JsonProperty("keyblocTermCodeDef")
    public void setKeyblocTermCodeDef(String keyblocTermCodeDef) {
        this.keyblocTermCodeDef = keyblocTermCodeDef;
    }

    public OpenLearningSectionDefaultRules100QapiPost withKeyblocTermCodeDef(String keyblocTermCodeDef) {
        this.keyblocTermCodeDef = keyblocTermCodeDef;
        return this;
    }

    @JsonProperty("collCode")
    public String getCollCode() {
        return collCode;
    }

    @JsonProperty("collCode")
    public void setCollCode(String collCode) {
        this.collCode = collCode;
    }

    public OpenLearningSectionDefaultRules100QapiPost withCollCode(String collCode) {
        this.collCode = collCode;
        return this;
    }

    @JsonProperty("collCodeDesc")
    public String getCollCodeDesc() {
        return collCodeDesc;
    }

    @JsonProperty("collCodeDesc")
    public void setCollCodeDesc(String collCodeDesc) {
        this.collCodeDesc = collCodeDesc;
    }

    public OpenLearningSectionDefaultRules100QapiPost withCollCodeDesc(String collCodeDesc) {
        this.collCodeDesc = collCodeDesc;
        return this;
    }

    @JsonProperty("deptCode")
    public String getDeptCode() {
        return deptCode;
    }

    @JsonProperty("deptCode")
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public OpenLearningSectionDefaultRules100QapiPost withDeptCode(String deptCode) {
        this.deptCode = deptCode;
        return this;
    }

    @JsonProperty("campCode")
    public String getCampCode() {
        return campCode;
    }

    @JsonProperty("campCode")
    public void setCampCode(String campCode) {
        this.campCode = campCode;
    }

    public OpenLearningSectionDefaultRules100QapiPost withCampCode(String campCode) {
        this.campCode = campCode;
        return this;
    }

    @JsonProperty("campCodeDesc")
    public String getCampCodeDesc() {
        return campCodeDesc;
    }

    @JsonProperty("campCodeDesc")
    public void setCampCodeDesc(String campCodeDesc) {
        this.campCodeDesc = campCodeDesc;
    }

    public OpenLearningSectionDefaultRules100QapiPost withCampCodeDesc(String campCodeDesc) {
        this.campCodeDesc = campCodeDesc;
        return this;
    }

    @JsonProperty("schdCode")
    public String getSchdCode() {
        return schdCode;
    }

    @JsonProperty("schdCode")
    public void setSchdCode(String schdCode) {
        this.schdCode = schdCode;
    }

    public OpenLearningSectionDefaultRules100QapiPost withSchdCode(String schdCode) {
        this.schdCode = schdCode;
        return this;
    }

    @JsonProperty("schdCodeDesc")
    public String getSchdCodeDesc() {
        return schdCodeDesc;
    }

    @JsonProperty("schdCodeDesc")
    public void setSchdCodeDesc(String schdCodeDesc) {
        this.schdCodeDesc = schdCodeDesc;
    }

    public OpenLearningSectionDefaultRules100QapiPost withSchdCodeDesc(String schdCodeDesc) {
        this.schdCodeDesc = schdCodeDesc;
        return this;
    }

    @JsonProperty("insmCode")
    public String getInsmCode() {
        return insmCode;
    }

    @JsonProperty("insmCode")
    public void setInsmCode(String insmCode) {
        this.insmCode = insmCode;
    }

    public OpenLearningSectionDefaultRules100QapiPost withInsmCode(String insmCode) {
        this.insmCode = insmCode;
        return this;
    }

    @JsonProperty("insmCodeDesc")
    public String getInsmCodeDesc() {
        return insmCodeDesc;
    }

    @JsonProperty("insmCodeDesc")
    public void setInsmCodeDesc(String insmCodeDesc) {
        this.insmCodeDesc = insmCodeDesc;
    }

    public OpenLearningSectionDefaultRules100QapiPost withInsmCodeDesc(String insmCodeDesc) {
        this.insmCodeDesc = insmCodeDesc;
        return this;
    }

    @JsonProperty("regStartDate")
    public String getRegStartDate() {
        return regStartDate;
    }

    @JsonProperty("regStartDate")
    public void setRegStartDate(String regStartDate) {
        this.regStartDate = regStartDate;
    }

    public OpenLearningSectionDefaultRules100QapiPost withRegStartDate(String regStartDate) {
        this.regStartDate = regStartDate;
        return this;
    }

    @JsonProperty("regEndDate")
    public String getRegEndDate() {
        return regEndDate;
    }

    @JsonProperty("regEndDate")
    public void setRegEndDate(String regEndDate) {
        this.regEndDate = regEndDate;
    }

    public OpenLearningSectionDefaultRules100QapiPost withRegEndDate(String regEndDate) {
        this.regEndDate = regEndDate;
        return this;
    }

    @JsonProperty("censusDateOne")
    public String getCensusDateOne() {
        return censusDateOne;
    }

    @JsonProperty("censusDateOne")
    public void setCensusDateOne(String censusDateOne) {
        this.censusDateOne = censusDateOne;
    }

    public OpenLearningSectionDefaultRules100QapiPost withCensusDateOne(String censusDateOne) {
        this.censusDateOne = censusDateOne;
        return this;
    }

    @JsonProperty("censusDateTwo")
    public String getCensusDateTwo() {
        return censusDateTwo;
    }

    @JsonProperty("censusDateTwo")
    public void setCensusDateTwo(String censusDateTwo) {
        this.censusDateTwo = censusDateTwo;
    }

    public OpenLearningSectionDefaultRules100QapiPost withCensusDateTwo(String censusDateTwo) {
        this.censusDateTwo = censusDateTwo;
        return this;
    }

    @JsonProperty("overrideInd")
    public String getOverrideInd() {
        return overrideInd;
    }

    @JsonProperty("overrideInd")
    public void setOverrideInd(String overrideInd) {
        this.overrideInd = overrideInd;
    }

    public OpenLearningSectionDefaultRules100QapiPost withOverrideInd(String overrideInd) {
        this.overrideInd = overrideInd;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SORRSTS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SORRSTS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public OpenLearningSectionDefaultRules100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Lineage reference object : SORRSTS_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SORRSTS_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public OpenLearningSectionDefaultRules100QapiPost withUserId(String userId) {
        this.userId = userId;
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

    public OpenLearningSectionDefaultRules100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OpenLearningSectionDefaultRules100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblckTermCode");
        sb.append('=');
        sb.append(((this.keyblckTermCode == null)?"<null>":this.keyblckTermCode));
        sb.append(',');
        sb.append("keyblocTermCodeDef");
        sb.append('=');
        sb.append(((this.keyblocTermCodeDef == null)?"<null>":this.keyblocTermCodeDef));
        sb.append(',');
        sb.append("collCode");
        sb.append('=');
        sb.append(((this.collCode == null)?"<null>":this.collCode));
        sb.append(',');
        sb.append("collCodeDesc");
        sb.append('=');
        sb.append(((this.collCodeDesc == null)?"<null>":this.collCodeDesc));
        sb.append(',');
        sb.append("deptCode");
        sb.append('=');
        sb.append(((this.deptCode == null)?"<null>":this.deptCode));
        sb.append(',');
        sb.append("campCode");
        sb.append('=');
        sb.append(((this.campCode == null)?"<null>":this.campCode));
        sb.append(',');
        sb.append("campCodeDesc");
        sb.append('=');
        sb.append(((this.campCodeDesc == null)?"<null>":this.campCodeDesc));
        sb.append(',');
        sb.append("schdCode");
        sb.append('=');
        sb.append(((this.schdCode == null)?"<null>":this.schdCode));
        sb.append(',');
        sb.append("schdCodeDesc");
        sb.append('=');
        sb.append(((this.schdCodeDesc == null)?"<null>":this.schdCodeDesc));
        sb.append(',');
        sb.append("insmCode");
        sb.append('=');
        sb.append(((this.insmCode == null)?"<null>":this.insmCode));
        sb.append(',');
        sb.append("insmCodeDesc");
        sb.append('=');
        sb.append(((this.insmCodeDesc == null)?"<null>":this.insmCodeDesc));
        sb.append(',');
        sb.append("regStartDate");
        sb.append('=');
        sb.append(((this.regStartDate == null)?"<null>":this.regStartDate));
        sb.append(',');
        sb.append("regEndDate");
        sb.append('=');
        sb.append(((this.regEndDate == null)?"<null>":this.regEndDate));
        sb.append(',');
        sb.append("censusDateOne");
        sb.append('=');
        sb.append(((this.censusDateOne == null)?"<null>":this.censusDateOne));
        sb.append(',');
        sb.append("censusDateTwo");
        sb.append('=');
        sb.append(((this.censusDateTwo == null)?"<null>":this.censusDateTwo));
        sb.append(',');
        sb.append("overrideInd");
        sb.append('=');
        sb.append(((this.overrideInd == null)?"<null>":this.overrideInd));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
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
        result = ((result* 31)+((this.censusDateOne == null)? 0 :this.censusDateOne.hashCode()));
        result = ((result* 31)+((this.insmCodeDesc == null)? 0 :this.insmCodeDesc.hashCode()));
        result = ((result* 31)+((this.regEndDate == null)? 0 :this.regEndDate.hashCode()));
        result = ((result* 31)+((this.collCodeDesc == null)? 0 :this.collCodeDesc.hashCode()));
        result = ((result* 31)+((this.keyblckTermCode == null)? 0 :this.keyblckTermCode.hashCode()));
        result = ((result* 31)+((this.censusDateTwo == null)? 0 :this.censusDateTwo.hashCode()));
        result = ((result* 31)+((this.insmCode == null)? 0 :this.insmCode.hashCode()));
        result = ((result* 31)+((this.schdCodeDesc == null)? 0 :this.schdCodeDesc.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.schdCode == null)? 0 :this.schdCode.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.keyblocTermCodeDef == null)? 0 :this.keyblocTermCodeDef.hashCode()));
        result = ((result* 31)+((this.campCode == null)? 0 :this.campCode.hashCode()));
        result = ((result* 31)+((this.campCodeDesc == null)? 0 :this.campCodeDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.collCode == null)? 0 :this.collCode.hashCode()));
        result = ((result* 31)+((this.deptCode == null)? 0 :this.deptCode.hashCode()));
        result = ((result* 31)+((this.regStartDate == null)? 0 :this.regStartDate.hashCode()));
        result = ((result* 31)+((this.overrideInd == null)? 0 :this.overrideInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OpenLearningSectionDefaultRules100QapiPost) == false) {
            return false;
        }
        OpenLearningSectionDefaultRules100QapiPost rhs = ((OpenLearningSectionDefaultRules100QapiPost) other);
        return ((((((((((((((((((((this.censusDateOne == rhs.censusDateOne)||((this.censusDateOne!= null)&&this.censusDateOne.equals(rhs.censusDateOne)))&&((this.insmCodeDesc == rhs.insmCodeDesc)||((this.insmCodeDesc!= null)&&this.insmCodeDesc.equals(rhs.insmCodeDesc))))&&((this.regEndDate == rhs.regEndDate)||((this.regEndDate!= null)&&this.regEndDate.equals(rhs.regEndDate))))&&((this.collCodeDesc == rhs.collCodeDesc)||((this.collCodeDesc!= null)&&this.collCodeDesc.equals(rhs.collCodeDesc))))&&((this.keyblckTermCode == rhs.keyblckTermCode)||((this.keyblckTermCode!= null)&&this.keyblckTermCode.equals(rhs.keyblckTermCode))))&&((this.censusDateTwo == rhs.censusDateTwo)||((this.censusDateTwo!= null)&&this.censusDateTwo.equals(rhs.censusDateTwo))))&&((this.insmCode == rhs.insmCode)||((this.insmCode!= null)&&this.insmCode.equals(rhs.insmCode))))&&((this.schdCodeDesc == rhs.schdCodeDesc)||((this.schdCodeDesc!= null)&&this.schdCodeDesc.equals(rhs.schdCodeDesc))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.schdCode == rhs.schdCode)||((this.schdCode!= null)&&this.schdCode.equals(rhs.schdCode))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.keyblocTermCodeDef == rhs.keyblocTermCodeDef)||((this.keyblocTermCodeDef!= null)&&this.keyblocTermCodeDef.equals(rhs.keyblocTermCodeDef))))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.campCodeDesc == rhs.campCodeDesc)||((this.campCodeDesc!= null)&&this.campCodeDesc.equals(rhs.campCodeDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.deptCode == rhs.deptCode)||((this.deptCode!= null)&&this.deptCode.equals(rhs.deptCode))))&&((this.regStartDate == rhs.regStartDate)||((this.regStartDate!= null)&&this.regStartDate.equals(rhs.regStartDate))))&&((this.overrideInd == rhs.overrideInd)||((this.overrideInd!= null)&&this.overrideInd.equals(rhs.overrideInd))));
    }

}
