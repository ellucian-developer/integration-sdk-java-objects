
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
    "censusDateOne",
    "insmCodeDesc",
    "regEndDate",
    "collCodeDesc",
    "keyblckTermCode",
    "censusDateTwo",
    "insmCode",
    "schdCodeDesc",
    "userId",
    "schdCode",
    "activityDate",
    "keyblocTermCodeDef",
    "campCode",
    "campCodeDesc",
    "collCode",
    "deptCode",
    "regStartDate",
    "overrideInd"
})
@Generated("jsonschema2pojo")
public class OpenLearningSectionDefaultRules100GetRequest {

    /**
     * Census Date 1
     * <p>
     * Lineage reference object : SOBODTE_CENSUS_DATE_ONE
     * (Required)
     * 
     */
    @JsonProperty("censusDateOne")
    @JsonPropertyDescription("Lineage reference object : SOBODTE_CENSUS_DATE_ONE")
    private Date censusDateOne;
    /**
     * Instructional Method Description
     * <p>
     * 
     * 
     */
    @JsonProperty("insmCodeDesc")
    private String insmCodeDesc;
    /**
     * End Date
     * <p>
     * Lineage reference object : SOBODTE_REG_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("regEndDate")
    @JsonPropertyDescription("Lineage reference object : SOBODTE_REG_END_DATE")
    private Date regEndDate;
    /**
     * College Description
     * <p>
     * 
     * 
     */
    @JsonProperty("collCodeDesc")
    private String collCodeDesc;
    /**
     * Term
     * <p>
     * Lineage reference object : keyblckTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblckTermCode")
    @JsonPropertyDescription("Lineage reference object : keyblckTermCode, Lookup lineage reference object : stvterm")
    private Object keyblckTermCode;
    /**
     * Census Date 2
     * <p>
     * Lineage reference object : SOBODTE_CENSUS_DATE_TWO
     * 
     */
    @JsonProperty("censusDateTwo")
    @JsonPropertyDescription("Lineage reference object : SOBODTE_CENSUS_DATE_TWO")
    private Date censusDateTwo;
    /**
     * Instructional Method
     * <p>
     * Lineage reference object : SOBODTE_INSM_CODE, Lookup lineage reference object : gtvinsm
     * (Required)
     * 
     */
    @JsonProperty("insmCode")
    @JsonPropertyDescription("Lineage reference object : SOBODTE_INSM_CODE, Lookup lineage reference object : gtvinsm")
    private String insmCode;
    /**
     * Schedule Type Description
     * <p>
     * 
     * 
     */
    @JsonProperty("schdCodeDesc")
    private String schdCodeDesc;
    /**
     * Lineage reference object : SOBODTE_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SOBODTE_USER_ID")
    private String userId;
    /**
     * Schedule Type
     * <p>
     * Lineage reference object : SOBODTE_SCHD_CODE, Lookup lineage reference object : stvschd
     * 
     */
    @JsonProperty("schdCode")
    @JsonPropertyDescription("Lineage reference object : SOBODTE_SCHD_CODE, Lookup lineage reference object : stvschd")
    private String schdCode;
    /**
     * Lineage reference object : SOBODTE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SOBODTE_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Copy From Term
     * <p>
     * Lineage reference object : keyblocTermCodedef, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCodeDef")
    @JsonPropertyDescription("Lineage reference object : keyblocTermCodedef, Lookup lineage reference object : stvterm")
    private Object keyblocTermCodeDef;
    /**
     * Campus
     * <p>
     * Lineage reference object : SOBODTE_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    @JsonPropertyDescription("Lineage reference object : SOBODTE_CAMP_CODE, Lookup lineage reference object : stvcamp")
    private String campCode;
    /**
     * Campus Description
     * <p>
     * 
     * 
     */
    @JsonProperty("campCodeDesc")
    private String campCodeDesc;
    /**
     * College
     * <p>
     * Lineage reference object : SOBODTE_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    @JsonPropertyDescription("Lineage reference object : SOBODTE_COLL_CODE, Lookup lineage reference object : stvcoll")
    private String collCode;
    /**
     * Department
     * <p>
     * Lineage reference object : SOBODTE_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    @JsonPropertyDescription("Lineage reference object : SOBODTE_DEPT_CODE, Lookup lineage reference object : stvdept")
    private String deptCode;
    /**
     * Start Date
     * <p>
     * Lineage reference object : SOBODTE_REG_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("regStartDate")
    @JsonPropertyDescription("Lineage reference object : SOBODTE_REG_START_DATE")
    private Date regStartDate;
    /**
     * Lineage reference object : SOBODTE_OVERRIDE_IND
     * 
     */
    @JsonProperty("overrideInd")
    @JsonPropertyDescription("Lineage reference object : SOBODTE_OVERRIDE_IND")
    private String overrideInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Census Date 1
     * <p>
     * Lineage reference object : SOBODTE_CENSUS_DATE_ONE
     * (Required)
     * 
     */
    @JsonProperty("censusDateOne")
    public Date getCensusDateOne() {
        return censusDateOne;
    }

    /**
     * Census Date 1
     * <p>
     * Lineage reference object : SOBODTE_CENSUS_DATE_ONE
     * (Required)
     * 
     */
    @JsonProperty("censusDateOne")
    public void setCensusDateOne(Date censusDateOne) {
        this.censusDateOne = censusDateOne;
    }

    public OpenLearningSectionDefaultRules100GetRequest withCensusDateOne(Date censusDateOne) {
        this.censusDateOne = censusDateOne;
        return this;
    }

    /**
     * Instructional Method Description
     * <p>
     * 
     * 
     */
    @JsonProperty("insmCodeDesc")
    public String getInsmCodeDesc() {
        return insmCodeDesc;
    }

    /**
     * Instructional Method Description
     * <p>
     * 
     * 
     */
    @JsonProperty("insmCodeDesc")
    public void setInsmCodeDesc(String insmCodeDesc) {
        this.insmCodeDesc = insmCodeDesc;
    }

    public OpenLearningSectionDefaultRules100GetRequest withInsmCodeDesc(String insmCodeDesc) {
        this.insmCodeDesc = insmCodeDesc;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SOBODTE_REG_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("regEndDate")
    public Date getRegEndDate() {
        return regEndDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SOBODTE_REG_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("regEndDate")
    public void setRegEndDate(Date regEndDate) {
        this.regEndDate = regEndDate;
    }

    public OpenLearningSectionDefaultRules100GetRequest withRegEndDate(Date regEndDate) {
        this.regEndDate = regEndDate;
        return this;
    }

    /**
     * College Description
     * <p>
     * 
     * 
     */
    @JsonProperty("collCodeDesc")
    public String getCollCodeDesc() {
        return collCodeDesc;
    }

    /**
     * College Description
     * <p>
     * 
     * 
     */
    @JsonProperty("collCodeDesc")
    public void setCollCodeDesc(String collCodeDesc) {
        this.collCodeDesc = collCodeDesc;
    }

    public OpenLearningSectionDefaultRules100GetRequest withCollCodeDesc(String collCodeDesc) {
        this.collCodeDesc = collCodeDesc;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblckTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblckTermCode")
    public Object getKeyblckTermCode() {
        return keyblckTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblckTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblckTermCode")
    public void setKeyblckTermCode(Object keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
    }

    public OpenLearningSectionDefaultRules100GetRequest withKeyblckTermCode(Object keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
        return this;
    }

    /**
     * Census Date 2
     * <p>
     * Lineage reference object : SOBODTE_CENSUS_DATE_TWO
     * 
     */
    @JsonProperty("censusDateTwo")
    public Date getCensusDateTwo() {
        return censusDateTwo;
    }

    /**
     * Census Date 2
     * <p>
     * Lineage reference object : SOBODTE_CENSUS_DATE_TWO
     * 
     */
    @JsonProperty("censusDateTwo")
    public void setCensusDateTwo(Date censusDateTwo) {
        this.censusDateTwo = censusDateTwo;
    }

    public OpenLearningSectionDefaultRules100GetRequest withCensusDateTwo(Date censusDateTwo) {
        this.censusDateTwo = censusDateTwo;
        return this;
    }

    /**
     * Instructional Method
     * <p>
     * Lineage reference object : SOBODTE_INSM_CODE, Lookup lineage reference object : gtvinsm
     * (Required)
     * 
     */
    @JsonProperty("insmCode")
    public String getInsmCode() {
        return insmCode;
    }

    /**
     * Instructional Method
     * <p>
     * Lineage reference object : SOBODTE_INSM_CODE, Lookup lineage reference object : gtvinsm
     * (Required)
     * 
     */
    @JsonProperty("insmCode")
    public void setInsmCode(String insmCode) {
        this.insmCode = insmCode;
    }

    public OpenLearningSectionDefaultRules100GetRequest withInsmCode(String insmCode) {
        this.insmCode = insmCode;
        return this;
    }

    /**
     * Schedule Type Description
     * <p>
     * 
     * 
     */
    @JsonProperty("schdCodeDesc")
    public String getSchdCodeDesc() {
        return schdCodeDesc;
    }

    /**
     * Schedule Type Description
     * <p>
     * 
     * 
     */
    @JsonProperty("schdCodeDesc")
    public void setSchdCodeDesc(String schdCodeDesc) {
        this.schdCodeDesc = schdCodeDesc;
    }

    public OpenLearningSectionDefaultRules100GetRequest withSchdCodeDesc(String schdCodeDesc) {
        this.schdCodeDesc = schdCodeDesc;
        return this;
    }

    /**
     * Lineage reference object : SOBODTE_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SOBODTE_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public OpenLearningSectionDefaultRules100GetRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Schedule Type
     * <p>
     * Lineage reference object : SOBODTE_SCHD_CODE, Lookup lineage reference object : stvschd
     * 
     */
    @JsonProperty("schdCode")
    public String getSchdCode() {
        return schdCode;
    }

    /**
     * Schedule Type
     * <p>
     * Lineage reference object : SOBODTE_SCHD_CODE, Lookup lineage reference object : stvschd
     * 
     */
    @JsonProperty("schdCode")
    public void setSchdCode(String schdCode) {
        this.schdCode = schdCode;
    }

    public OpenLearningSectionDefaultRules100GetRequest withSchdCode(String schdCode) {
        this.schdCode = schdCode;
        return this;
    }

    /**
     * Lineage reference object : SOBODTE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SOBODTE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public OpenLearningSectionDefaultRules100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Copy From Term
     * <p>
     * Lineage reference object : keyblocTermCodedef, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCodeDef")
    public Object getKeyblocTermCodeDef() {
        return keyblocTermCodeDef;
    }

    /**
     * Copy From Term
     * <p>
     * Lineage reference object : keyblocTermCodedef, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCodeDef")
    public void setKeyblocTermCodeDef(Object keyblocTermCodeDef) {
        this.keyblocTermCodeDef = keyblocTermCodeDef;
    }

    public OpenLearningSectionDefaultRules100GetRequest withKeyblocTermCodeDef(Object keyblocTermCodeDef) {
        this.keyblocTermCodeDef = keyblocTermCodeDef;
        return this;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SOBODTE_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    public String getCampCode() {
        return campCode;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SOBODTE_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    public void setCampCode(String campCode) {
        this.campCode = campCode;
    }

    public OpenLearningSectionDefaultRules100GetRequest withCampCode(String campCode) {
        this.campCode = campCode;
        return this;
    }

    /**
     * Campus Description
     * <p>
     * 
     * 
     */
    @JsonProperty("campCodeDesc")
    public String getCampCodeDesc() {
        return campCodeDesc;
    }

    /**
     * Campus Description
     * <p>
     * 
     * 
     */
    @JsonProperty("campCodeDesc")
    public void setCampCodeDesc(String campCodeDesc) {
        this.campCodeDesc = campCodeDesc;
    }

    public OpenLearningSectionDefaultRules100GetRequest withCampCodeDesc(String campCodeDesc) {
        this.campCodeDesc = campCodeDesc;
        return this;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SOBODTE_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    public String getCollCode() {
        return collCode;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SOBODTE_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    public void setCollCode(String collCode) {
        this.collCode = collCode;
    }

    public OpenLearningSectionDefaultRules100GetRequest withCollCode(String collCode) {
        this.collCode = collCode;
        return this;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SOBODTE_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SOBODTE_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public OpenLearningSectionDefaultRules100GetRequest withDeptCode(String deptCode) {
        this.deptCode = deptCode;
        return this;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : SOBODTE_REG_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("regStartDate")
    public Date getRegStartDate() {
        return regStartDate;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : SOBODTE_REG_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("regStartDate")
    public void setRegStartDate(Date regStartDate) {
        this.regStartDate = regStartDate;
    }

    public OpenLearningSectionDefaultRules100GetRequest withRegStartDate(Date regStartDate) {
        this.regStartDate = regStartDate;
        return this;
    }

    /**
     * Lineage reference object : SOBODTE_OVERRIDE_IND
     * 
     */
    @JsonProperty("overrideInd")
    public String getOverrideInd() {
        return overrideInd;
    }

    /**
     * Lineage reference object : SOBODTE_OVERRIDE_IND
     * 
     */
    @JsonProperty("overrideInd")
    public void setOverrideInd(String overrideInd) {
        this.overrideInd = overrideInd;
    }

    public OpenLearningSectionDefaultRules100GetRequest withOverrideInd(String overrideInd) {
        this.overrideInd = overrideInd;
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

    public OpenLearningSectionDefaultRules100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OpenLearningSectionDefaultRules100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("censusDateOne");
        sb.append('=');
        sb.append(((this.censusDateOne == null)?"<null>":this.censusDateOne));
        sb.append(',');
        sb.append("insmCodeDesc");
        sb.append('=');
        sb.append(((this.insmCodeDesc == null)?"<null>":this.insmCodeDesc));
        sb.append(',');
        sb.append("regEndDate");
        sb.append('=');
        sb.append(((this.regEndDate == null)?"<null>":this.regEndDate));
        sb.append(',');
        sb.append("collCodeDesc");
        sb.append('=');
        sb.append(((this.collCodeDesc == null)?"<null>":this.collCodeDesc));
        sb.append(',');
        sb.append("keyblckTermCode");
        sb.append('=');
        sb.append(((this.keyblckTermCode == null)?"<null>":this.keyblckTermCode));
        sb.append(',');
        sb.append("censusDateTwo");
        sb.append('=');
        sb.append(((this.censusDateTwo == null)?"<null>":this.censusDateTwo));
        sb.append(',');
        sb.append("insmCode");
        sb.append('=');
        sb.append(((this.insmCode == null)?"<null>":this.insmCode));
        sb.append(',');
        sb.append("schdCodeDesc");
        sb.append('=');
        sb.append(((this.schdCodeDesc == null)?"<null>":this.schdCodeDesc));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("schdCode");
        sb.append('=');
        sb.append(((this.schdCode == null)?"<null>":this.schdCode));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("keyblocTermCodeDef");
        sb.append('=');
        sb.append(((this.keyblocTermCodeDef == null)?"<null>":this.keyblocTermCodeDef));
        sb.append(',');
        sb.append("campCode");
        sb.append('=');
        sb.append(((this.campCode == null)?"<null>":this.campCode));
        sb.append(',');
        sb.append("campCodeDesc");
        sb.append('=');
        sb.append(((this.campCodeDesc == null)?"<null>":this.campCodeDesc));
        sb.append(',');
        sb.append("collCode");
        sb.append('=');
        sb.append(((this.collCode == null)?"<null>":this.collCode));
        sb.append(',');
        sb.append("deptCode");
        sb.append('=');
        sb.append(((this.deptCode == null)?"<null>":this.deptCode));
        sb.append(',');
        sb.append("regStartDate");
        sb.append('=');
        sb.append(((this.regStartDate == null)?"<null>":this.regStartDate));
        sb.append(',');
        sb.append("overrideInd");
        sb.append('=');
        sb.append(((this.overrideInd == null)?"<null>":this.overrideInd));
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
        if ((other instanceof OpenLearningSectionDefaultRules100GetRequest) == false) {
            return false;
        }
        OpenLearningSectionDefaultRules100GetRequest rhs = ((OpenLearningSectionDefaultRules100GetRequest) other);
        return ((((((((((((((((((((this.censusDateOne == rhs.censusDateOne)||((this.censusDateOne!= null)&&this.censusDateOne.equals(rhs.censusDateOne)))&&((this.insmCodeDesc == rhs.insmCodeDesc)||((this.insmCodeDesc!= null)&&this.insmCodeDesc.equals(rhs.insmCodeDesc))))&&((this.regEndDate == rhs.regEndDate)||((this.regEndDate!= null)&&this.regEndDate.equals(rhs.regEndDate))))&&((this.collCodeDesc == rhs.collCodeDesc)||((this.collCodeDesc!= null)&&this.collCodeDesc.equals(rhs.collCodeDesc))))&&((this.keyblckTermCode == rhs.keyblckTermCode)||((this.keyblckTermCode!= null)&&this.keyblckTermCode.equals(rhs.keyblckTermCode))))&&((this.censusDateTwo == rhs.censusDateTwo)||((this.censusDateTwo!= null)&&this.censusDateTwo.equals(rhs.censusDateTwo))))&&((this.insmCode == rhs.insmCode)||((this.insmCode!= null)&&this.insmCode.equals(rhs.insmCode))))&&((this.schdCodeDesc == rhs.schdCodeDesc)||((this.schdCodeDesc!= null)&&this.schdCodeDesc.equals(rhs.schdCodeDesc))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.schdCode == rhs.schdCode)||((this.schdCode!= null)&&this.schdCode.equals(rhs.schdCode))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.keyblocTermCodeDef == rhs.keyblocTermCodeDef)||((this.keyblocTermCodeDef!= null)&&this.keyblocTermCodeDef.equals(rhs.keyblocTermCodeDef))))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.campCodeDesc == rhs.campCodeDesc)||((this.campCodeDesc!= null)&&this.campCodeDesc.equals(rhs.campCodeDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.deptCode == rhs.deptCode)||((this.deptCode!= null)&&this.deptCode.equals(rhs.deptCode))))&&((this.regStartDate == rhs.regStartDate)||((this.regStartDate!= null)&&this.regStartDate.equals(rhs.regStartDate))))&&((this.overrideInd == rhs.overrideInd)||((this.overrideInd!= null)&&this.overrideInd.equals(rhs.overrideInd))));
    }

}
