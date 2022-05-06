
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
    "censusDateTwo",
    "insmCode",
    "schdCodeDesc",
    "schdCode",
    "campCode",
    "campCodeDesc",
    "collCode",
    "deptCode",
    "regStartDate",
    "overrideInd"
})
@Generated("jsonschema2pojo")
public class Sobodte__2 {

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
     * Schedule Type
     * <p>
     * Lineage reference object : SOBODTE_SCHD_CODE, Lookup lineage reference object : stvschd
     * 
     */
    @JsonProperty("schdCode")
    @JsonPropertyDescription("Lineage reference object : SOBODTE_SCHD_CODE, Lookup lineage reference object : stvschd")
    private String schdCode;
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

    public Sobodte__2 withCensusDateOne(Date censusDateOne) {
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

    public Sobodte__2 withInsmCodeDesc(String insmCodeDesc) {
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

    public Sobodte__2 withRegEndDate(Date regEndDate) {
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

    public Sobodte__2 withCollCodeDesc(String collCodeDesc) {
        this.collCodeDesc = collCodeDesc;
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

    public Sobodte__2 withCensusDateTwo(Date censusDateTwo) {
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

    public Sobodte__2 withInsmCode(String insmCode) {
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

    public Sobodte__2 withSchdCodeDesc(String schdCodeDesc) {
        this.schdCodeDesc = schdCodeDesc;
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

    public Sobodte__2 withSchdCode(String schdCode) {
        this.schdCode = schdCode;
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

    public Sobodte__2 withCampCode(String campCode) {
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

    public Sobodte__2 withCampCodeDesc(String campCodeDesc) {
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

    public Sobodte__2 withCollCode(String collCode) {
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

    public Sobodte__2 withDeptCode(String deptCode) {
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

    public Sobodte__2 withRegStartDate(Date regStartDate) {
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

    public Sobodte__2 withOverrideInd(String overrideInd) {
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

    public Sobodte__2 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sobodte__2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("schdCode");
        sb.append('=');
        sb.append(((this.schdCode == null)?"<null>":this.schdCode));
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
        result = ((result* 31)+((this.censusDateTwo == null)? 0 :this.censusDateTwo.hashCode()));
        result = ((result* 31)+((this.insmCode == null)? 0 :this.insmCode.hashCode()));
        result = ((result* 31)+((this.schdCodeDesc == null)? 0 :this.schdCodeDesc.hashCode()));
        result = ((result* 31)+((this.schdCode == null)? 0 :this.schdCode.hashCode()));
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
        if ((other instanceof Sobodte__2) == false) {
            return false;
        }
        Sobodte__2 rhs = ((Sobodte__2) other);
        return ((((((((((((((((this.censusDateOne == rhs.censusDateOne)||((this.censusDateOne!= null)&&this.censusDateOne.equals(rhs.censusDateOne)))&&((this.insmCodeDesc == rhs.insmCodeDesc)||((this.insmCodeDesc!= null)&&this.insmCodeDesc.equals(rhs.insmCodeDesc))))&&((this.regEndDate == rhs.regEndDate)||((this.regEndDate!= null)&&this.regEndDate.equals(rhs.regEndDate))))&&((this.collCodeDesc == rhs.collCodeDesc)||((this.collCodeDesc!= null)&&this.collCodeDesc.equals(rhs.collCodeDesc))))&&((this.censusDateTwo == rhs.censusDateTwo)||((this.censusDateTwo!= null)&&this.censusDateTwo.equals(rhs.censusDateTwo))))&&((this.insmCode == rhs.insmCode)||((this.insmCode!= null)&&this.insmCode.equals(rhs.insmCode))))&&((this.schdCodeDesc == rhs.schdCodeDesc)||((this.schdCodeDesc!= null)&&this.schdCodeDesc.equals(rhs.schdCodeDesc))))&&((this.schdCode == rhs.schdCode)||((this.schdCode!= null)&&this.schdCode.equals(rhs.schdCode))))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.campCodeDesc == rhs.campCodeDesc)||((this.campCodeDesc!= null)&&this.campCodeDesc.equals(rhs.campCodeDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.deptCode == rhs.deptCode)||((this.deptCode!= null)&&this.deptCode.equals(rhs.deptCode))))&&((this.regStartDate == rhs.regStartDate)||((this.regStartDate!= null)&&this.regStartDate.equals(rhs.regStartDate))))&&((this.overrideInd == rhs.overrideInd)||((this.overrideInd!= null)&&this.overrideInd.equals(rhs.overrideInd))));
    }

}
