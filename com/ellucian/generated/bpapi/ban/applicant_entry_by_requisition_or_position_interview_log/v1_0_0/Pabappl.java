
package com.ellucian.generated.bpapi.ban.applicant_entry_by_requisition_or_position_interview_log.v1_0_0;

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
    "date",
    "desiredHourly",
    "prevEmpInd",
    "asrcCode",
    "esklDesc",
    "userId",
    "asrcDesc",
    "desiredSalary",
    "currAppsCode",
    "currAppsDate",
    "currComment",
    "name3",
    "activityDate",
    "currAppsDesc",
    "id2",
    "esklCode",
    "dispDesc",
    "nname",
    "id3",
    "empInd",
    "id",
    "name2",
    "fullPartInd"
})
@Generated("jsonschema2pojo")
public class Pabappl {

    /**
     * Application Date
     * <p>
     * Lineage reference object : PABAPPL_DATE
     * (Required)
     * 
     */
    @JsonProperty("date")
    @JsonPropertyDescription("Lineage reference object : PABAPPL_DATE")
    private Date date;
    /**
     * Desired Hourly Rate
     * <p>
     * Lineage reference object : PABAPPL_DESIRED_HOURLY
     * 
     */
    @JsonProperty("desiredHourly")
    @JsonPropertyDescription("Lineage reference object : PABAPPL_DESIRED_HOURLY")
    private Double desiredHourly;
    /**
     * Previous Employee
     * <p>
     * 
     * 
     */
    @JsonProperty("prevEmpInd")
    private String prevEmpInd;
    /**
     * Source
     * <p>
     * Lineage reference object : PABAPPL_ASRC_CODE, Lookup lineage reference object : ptvasrc
     * (Required)
     * 
     */
    @JsonProperty("asrcCode")
    @JsonPropertyDescription("Lineage reference object : PABAPPL_ASRC_CODE, Lookup lineage reference object : ptvasrc")
    private String asrcCode;
    @JsonProperty("esklDesc")
    private String esklDesc;
    /**
     * Lineage reference object : PABAPPL_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : PABAPPL_USER_ID")
    private String userId;
    @JsonProperty("asrcDesc")
    private String asrcDesc;
    /**
     * Desired Salary
     * <p>
     * Lineage reference object : PABAPPL_DESIRED_SALARY
     * 
     */
    @JsonProperty("desiredSalary")
    @JsonPropertyDescription("Lineage reference object : PABAPPL_DESIRED_SALARY")
    private Double desiredSalary;
    /**
     * Current Status
     * <p>
     * 
     * 
     */
    @JsonProperty("currAppsCode")
    private String currAppsCode;
    /**
     * Date
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("currAppsDate")
    private Date currAppsDate;
    /**
     * Comment
     * <p>
     * 
     * 
     */
    @JsonProperty("currComment")
    private String currComment;
    @JsonProperty("name3")
    private String name3;
    /**
     * Lineage reference object : PABAPPL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : PABAPPL_ACTIVITY_DATE")
    private Date activityDate;
    @JsonProperty("currAppsDesc")
    private String currAppsDesc;
    /**
     * Applicant ID
     * <p>
     * 
     * 
     */
    @JsonProperty("id2")
    private String id2;
    /**
     * EEO Skill
     * <p>
     * Lineage reference object : PABAPPL_ESKL_CODE
     * 
     */
    @JsonProperty("esklCode")
    @JsonPropertyDescription("Lineage reference object : PABAPPL_ESKL_CODE")
    private String esklCode;
    /**
     * Disposition
     * <p>
     * 
     * 
     */
    @JsonProperty("dispDesc")
    private String dispDesc;
    @JsonProperty("nname")
    private String nname;
    /**
     * Applicant ID
     * <p>
     * 
     * 
     */
    @JsonProperty("id3")
    private String id3;
    /**
     * Current Employee
     * <p>
     * 
     * 
     */
    @JsonProperty("empInd")
    private String empInd;
    /**
     * Applicant ID
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    private String id;
    @JsonProperty("name2")
    private String name2;
    /**
     * Full or Part or No Preference
     * <p>
     * Lineage reference object : PABAPPL_FULL_PART_IND
     * 
     */
    @JsonProperty("fullPartInd")
    @JsonPropertyDescription("Lineage reference object : PABAPPL_FULL_PART_IND")
    private String fullPartInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Application Date
     * <p>
     * Lineage reference object : PABAPPL_DATE
     * (Required)
     * 
     */
    @JsonProperty("date")
    public Date getDate() {
        return date;
    }

    /**
     * Application Date
     * <p>
     * Lineage reference object : PABAPPL_DATE
     * (Required)
     * 
     */
    @JsonProperty("date")
    public void setDate(Date date) {
        this.date = date;
    }

    public Pabappl withDate(Date date) {
        this.date = date;
        return this;
    }

    /**
     * Desired Hourly Rate
     * <p>
     * Lineage reference object : PABAPPL_DESIRED_HOURLY
     * 
     */
    @JsonProperty("desiredHourly")
    public Double getDesiredHourly() {
        return desiredHourly;
    }

    /**
     * Desired Hourly Rate
     * <p>
     * Lineage reference object : PABAPPL_DESIRED_HOURLY
     * 
     */
    @JsonProperty("desiredHourly")
    public void setDesiredHourly(Double desiredHourly) {
        this.desiredHourly = desiredHourly;
    }

    public Pabappl withDesiredHourly(Double desiredHourly) {
        this.desiredHourly = desiredHourly;
        return this;
    }

    /**
     * Previous Employee
     * <p>
     * 
     * 
     */
    @JsonProperty("prevEmpInd")
    public String getPrevEmpInd() {
        return prevEmpInd;
    }

    /**
     * Previous Employee
     * <p>
     * 
     * 
     */
    @JsonProperty("prevEmpInd")
    public void setPrevEmpInd(String prevEmpInd) {
        this.prevEmpInd = prevEmpInd;
    }

    public Pabappl withPrevEmpInd(String prevEmpInd) {
        this.prevEmpInd = prevEmpInd;
        return this;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : PABAPPL_ASRC_CODE, Lookup lineage reference object : ptvasrc
     * (Required)
     * 
     */
    @JsonProperty("asrcCode")
    public String getAsrcCode() {
        return asrcCode;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : PABAPPL_ASRC_CODE, Lookup lineage reference object : ptvasrc
     * (Required)
     * 
     */
    @JsonProperty("asrcCode")
    public void setAsrcCode(String asrcCode) {
        this.asrcCode = asrcCode;
    }

    public Pabappl withAsrcCode(String asrcCode) {
        this.asrcCode = asrcCode;
        return this;
    }

    @JsonProperty("esklDesc")
    public String getEsklDesc() {
        return esklDesc;
    }

    @JsonProperty("esklDesc")
    public void setEsklDesc(String esklDesc) {
        this.esklDesc = esklDesc;
    }

    public Pabappl withEsklDesc(String esklDesc) {
        this.esklDesc = esklDesc;
        return this;
    }

    /**
     * Lineage reference object : PABAPPL_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : PABAPPL_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Pabappl withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    @JsonProperty("asrcDesc")
    public String getAsrcDesc() {
        return asrcDesc;
    }

    @JsonProperty("asrcDesc")
    public void setAsrcDesc(String asrcDesc) {
        this.asrcDesc = asrcDesc;
    }

    public Pabappl withAsrcDesc(String asrcDesc) {
        this.asrcDesc = asrcDesc;
        return this;
    }

    /**
     * Desired Salary
     * <p>
     * Lineage reference object : PABAPPL_DESIRED_SALARY
     * 
     */
    @JsonProperty("desiredSalary")
    public Double getDesiredSalary() {
        return desiredSalary;
    }

    /**
     * Desired Salary
     * <p>
     * Lineage reference object : PABAPPL_DESIRED_SALARY
     * 
     */
    @JsonProperty("desiredSalary")
    public void setDesiredSalary(Double desiredSalary) {
        this.desiredSalary = desiredSalary;
    }

    public Pabappl withDesiredSalary(Double desiredSalary) {
        this.desiredSalary = desiredSalary;
        return this;
    }

    /**
     * Current Status
     * <p>
     * 
     * 
     */
    @JsonProperty("currAppsCode")
    public String getCurrAppsCode() {
        return currAppsCode;
    }

    /**
     * Current Status
     * <p>
     * 
     * 
     */
    @JsonProperty("currAppsCode")
    public void setCurrAppsCode(String currAppsCode) {
        this.currAppsCode = currAppsCode;
    }

    public Pabappl withCurrAppsCode(String currAppsCode) {
        this.currAppsCode = currAppsCode;
        return this;
    }

    /**
     * Date
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("currAppsDate")
    public Date getCurrAppsDate() {
        return currAppsDate;
    }

    /**
     * Date
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("currAppsDate")
    public void setCurrAppsDate(Date currAppsDate) {
        this.currAppsDate = currAppsDate;
    }

    public Pabappl withCurrAppsDate(Date currAppsDate) {
        this.currAppsDate = currAppsDate;
        return this;
    }

    /**
     * Comment
     * <p>
     * 
     * 
     */
    @JsonProperty("currComment")
    public String getCurrComment() {
        return currComment;
    }

    /**
     * Comment
     * <p>
     * 
     * 
     */
    @JsonProperty("currComment")
    public void setCurrComment(String currComment) {
        this.currComment = currComment;
    }

    public Pabappl withCurrComment(String currComment) {
        this.currComment = currComment;
        return this;
    }

    @JsonProperty("name3")
    public String getName3() {
        return name3;
    }

    @JsonProperty("name3")
    public void setName3(String name3) {
        this.name3 = name3;
    }

    public Pabappl withName3(String name3) {
        this.name3 = name3;
        return this;
    }

    /**
     * Lineage reference object : PABAPPL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : PABAPPL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Pabappl withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    @JsonProperty("currAppsDesc")
    public String getCurrAppsDesc() {
        return currAppsDesc;
    }

    @JsonProperty("currAppsDesc")
    public void setCurrAppsDesc(String currAppsDesc) {
        this.currAppsDesc = currAppsDesc;
    }

    public Pabappl withCurrAppsDesc(String currAppsDesc) {
        this.currAppsDesc = currAppsDesc;
        return this;
    }

    /**
     * Applicant ID
     * <p>
     * 
     * 
     */
    @JsonProperty("id2")
    public String getId2() {
        return id2;
    }

    /**
     * Applicant ID
     * <p>
     * 
     * 
     */
    @JsonProperty("id2")
    public void setId2(String id2) {
        this.id2 = id2;
    }

    public Pabappl withId2(String id2) {
        this.id2 = id2;
        return this;
    }

    /**
     * EEO Skill
     * <p>
     * Lineage reference object : PABAPPL_ESKL_CODE
     * 
     */
    @JsonProperty("esklCode")
    public String getEsklCode() {
        return esklCode;
    }

    /**
     * EEO Skill
     * <p>
     * Lineage reference object : PABAPPL_ESKL_CODE
     * 
     */
    @JsonProperty("esklCode")
    public void setEsklCode(String esklCode) {
        this.esklCode = esklCode;
    }

    public Pabappl withEsklCode(String esklCode) {
        this.esklCode = esklCode;
        return this;
    }

    /**
     * Disposition
     * <p>
     * 
     * 
     */
    @JsonProperty("dispDesc")
    public String getDispDesc() {
        return dispDesc;
    }

    /**
     * Disposition
     * <p>
     * 
     * 
     */
    @JsonProperty("dispDesc")
    public void setDispDesc(String dispDesc) {
        this.dispDesc = dispDesc;
    }

    public Pabappl withDispDesc(String dispDesc) {
        this.dispDesc = dispDesc;
        return this;
    }

    @JsonProperty("nname")
    public String getNname() {
        return nname;
    }

    @JsonProperty("nname")
    public void setNname(String nname) {
        this.nname = nname;
    }

    public Pabappl withNname(String nname) {
        this.nname = nname;
        return this;
    }

    /**
     * Applicant ID
     * <p>
     * 
     * 
     */
    @JsonProperty("id3")
    public String getId3() {
        return id3;
    }

    /**
     * Applicant ID
     * <p>
     * 
     * 
     */
    @JsonProperty("id3")
    public void setId3(String id3) {
        this.id3 = id3;
    }

    public Pabappl withId3(String id3) {
        this.id3 = id3;
        return this;
    }

    /**
     * Current Employee
     * <p>
     * 
     * 
     */
    @JsonProperty("empInd")
    public String getEmpInd() {
        return empInd;
    }

    /**
     * Current Employee
     * <p>
     * 
     * 
     */
    @JsonProperty("empInd")
    public void setEmpInd(String empInd) {
        this.empInd = empInd;
    }

    public Pabappl withEmpInd(String empInd) {
        this.empInd = empInd;
        return this;
    }

    /**
     * Applicant ID
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Applicant ID
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Pabappl withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("name2")
    public String getName2() {
        return name2;
    }

    @JsonProperty("name2")
    public void setName2(String name2) {
        this.name2 = name2;
    }

    public Pabappl withName2(String name2) {
        this.name2 = name2;
        return this;
    }

    /**
     * Full or Part or No Preference
     * <p>
     * Lineage reference object : PABAPPL_FULL_PART_IND
     * 
     */
    @JsonProperty("fullPartInd")
    public String getFullPartInd() {
        return fullPartInd;
    }

    /**
     * Full or Part or No Preference
     * <p>
     * Lineage reference object : PABAPPL_FULL_PART_IND
     * 
     */
    @JsonProperty("fullPartInd")
    public void setFullPartInd(String fullPartInd) {
        this.fullPartInd = fullPartInd;
    }

    public Pabappl withFullPartInd(String fullPartInd) {
        this.fullPartInd = fullPartInd;
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

    public Pabappl withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Pabappl.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
        sb.append(',');
        sb.append("desiredHourly");
        sb.append('=');
        sb.append(((this.desiredHourly == null)?"<null>":this.desiredHourly));
        sb.append(',');
        sb.append("prevEmpInd");
        sb.append('=');
        sb.append(((this.prevEmpInd == null)?"<null>":this.prevEmpInd));
        sb.append(',');
        sb.append("asrcCode");
        sb.append('=');
        sb.append(((this.asrcCode == null)?"<null>":this.asrcCode));
        sb.append(',');
        sb.append("esklDesc");
        sb.append('=');
        sb.append(((this.esklDesc == null)?"<null>":this.esklDesc));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("asrcDesc");
        sb.append('=');
        sb.append(((this.asrcDesc == null)?"<null>":this.asrcDesc));
        sb.append(',');
        sb.append("desiredSalary");
        sb.append('=');
        sb.append(((this.desiredSalary == null)?"<null>":this.desiredSalary));
        sb.append(',');
        sb.append("currAppsCode");
        sb.append('=');
        sb.append(((this.currAppsCode == null)?"<null>":this.currAppsCode));
        sb.append(',');
        sb.append("currAppsDate");
        sb.append('=');
        sb.append(((this.currAppsDate == null)?"<null>":this.currAppsDate));
        sb.append(',');
        sb.append("currComment");
        sb.append('=');
        sb.append(((this.currComment == null)?"<null>":this.currComment));
        sb.append(',');
        sb.append("name3");
        sb.append('=');
        sb.append(((this.name3 == null)?"<null>":this.name3));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("currAppsDesc");
        sb.append('=');
        sb.append(((this.currAppsDesc == null)?"<null>":this.currAppsDesc));
        sb.append(',');
        sb.append("id2");
        sb.append('=');
        sb.append(((this.id2 == null)?"<null>":this.id2));
        sb.append(',');
        sb.append("esklCode");
        sb.append('=');
        sb.append(((this.esklCode == null)?"<null>":this.esklCode));
        sb.append(',');
        sb.append("dispDesc");
        sb.append('=');
        sb.append(((this.dispDesc == null)?"<null>":this.dispDesc));
        sb.append(',');
        sb.append("nname");
        sb.append('=');
        sb.append(((this.nname == null)?"<null>":this.nname));
        sb.append(',');
        sb.append("id3");
        sb.append('=');
        sb.append(((this.id3 == null)?"<null>":this.id3));
        sb.append(',');
        sb.append("empInd");
        sb.append('=');
        sb.append(((this.empInd == null)?"<null>":this.empInd));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name2");
        sb.append('=');
        sb.append(((this.name2 == null)?"<null>":this.name2));
        sb.append(',');
        sb.append("fullPartInd");
        sb.append('=');
        sb.append(((this.fullPartInd == null)?"<null>":this.fullPartInd));
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
        result = ((result* 31)+((this.date == null)? 0 :this.date.hashCode()));
        result = ((result* 31)+((this.prevEmpInd == null)? 0 :this.prevEmpInd.hashCode()));
        result = ((result* 31)+((this.asrcDesc == null)? 0 :this.asrcDesc.hashCode()));
        result = ((result* 31)+((this.desiredSalary == null)? 0 :this.desiredSalary.hashCode()));
        result = ((result* 31)+((this.currComment == null)? 0 :this.currComment.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.currAppsDesc == null)? 0 :this.currAppsDesc.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.fullPartInd == null)? 0 :this.fullPartInd.hashCode()));
        result = ((result* 31)+((this.desiredHourly == null)? 0 :this.desiredHourly.hashCode()));
        result = ((result* 31)+((this.asrcCode == null)? 0 :this.asrcCode.hashCode()));
        result = ((result* 31)+((this.esklDesc == null)? 0 :this.esklDesc.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.currAppsCode == null)? 0 :this.currAppsCode.hashCode()));
        result = ((result* 31)+((this.currAppsDate == null)? 0 :this.currAppsDate.hashCode()));
        result = ((result* 31)+((this.name3 == null)? 0 :this.name3 .hashCode()));
        result = ((result* 31)+((this.id2 == null)? 0 :this.id2 .hashCode()));
        result = ((result* 31)+((this.esklCode == null)? 0 :this.esklCode.hashCode()));
        result = ((result* 31)+((this.dispDesc == null)? 0 :this.dispDesc.hashCode()));
        result = ((result* 31)+((this.nname == null)? 0 :this.nname.hashCode()));
        result = ((result* 31)+((this.id3 == null)? 0 :this.id3 .hashCode()));
        result = ((result* 31)+((this.empInd == null)? 0 :this.empInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.name2 == null)? 0 :this.name2 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Pabappl) == false) {
            return false;
        }
        Pabappl rhs = ((Pabappl) other);
        return (((((((((((((((((((((((((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date)))&&((this.prevEmpInd == rhs.prevEmpInd)||((this.prevEmpInd!= null)&&this.prevEmpInd.equals(rhs.prevEmpInd))))&&((this.asrcDesc == rhs.asrcDesc)||((this.asrcDesc!= null)&&this.asrcDesc.equals(rhs.asrcDesc))))&&((this.desiredSalary == rhs.desiredSalary)||((this.desiredSalary!= null)&&this.desiredSalary.equals(rhs.desiredSalary))))&&((this.currComment == rhs.currComment)||((this.currComment!= null)&&this.currComment.equals(rhs.currComment))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.currAppsDesc == rhs.currAppsDesc)||((this.currAppsDesc!= null)&&this.currAppsDesc.equals(rhs.currAppsDesc))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.fullPartInd == rhs.fullPartInd)||((this.fullPartInd!= null)&&this.fullPartInd.equals(rhs.fullPartInd))))&&((this.desiredHourly == rhs.desiredHourly)||((this.desiredHourly!= null)&&this.desiredHourly.equals(rhs.desiredHourly))))&&((this.asrcCode == rhs.asrcCode)||((this.asrcCode!= null)&&this.asrcCode.equals(rhs.asrcCode))))&&((this.esklDesc == rhs.esklDesc)||((this.esklDesc!= null)&&this.esklDesc.equals(rhs.esklDesc))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.currAppsCode == rhs.currAppsCode)||((this.currAppsCode!= null)&&this.currAppsCode.equals(rhs.currAppsCode))))&&((this.currAppsDate == rhs.currAppsDate)||((this.currAppsDate!= null)&&this.currAppsDate.equals(rhs.currAppsDate))))&&((this.name3 == rhs.name3)||((this.name3 != null)&&this.name3 .equals(rhs.name3))))&&((this.id2 == rhs.id2)||((this.id2 != null)&&this.id2 .equals(rhs.id2))))&&((this.esklCode == rhs.esklCode)||((this.esklCode!= null)&&this.esklCode.equals(rhs.esklCode))))&&((this.dispDesc == rhs.dispDesc)||((this.dispDesc!= null)&&this.dispDesc.equals(rhs.dispDesc))))&&((this.nname == rhs.nname)||((this.nname!= null)&&this.nname.equals(rhs.nname))))&&((this.id3 == rhs.id3)||((this.id3 != null)&&this.id3 .equals(rhs.id3))))&&((this.empInd == rhs.empInd)||((this.empInd!= null)&&this.empInd.equals(rhs.empInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.name2 == rhs.name2)||((this.name2 != null)&&this.name2 .equals(rhs.name2))));
    }

}
