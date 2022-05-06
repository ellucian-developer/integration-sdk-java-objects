
package com.ellucian.generated.bpapi.ban.applicant_information.v1_0_0;

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
    "pclsDesc",
    "reqNo",
    "asrcCode",
    "pclsCode",
    "esklDesc",
    "userId",
    "asrcDesc",
    "posn",
    "desiredSalary",
    "currAppsCode",
    "currAppsDate",
    "currComment",
    "activityDate",
    "currAppsDesc",
    "esklCode",
    "dispDesc",
    "posnTitle",
    "fullPartInd"
})
@Generated("jsonschema2pojo")
public class ApplicantInformation100GetResponse {

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
    @JsonProperty("pclsDesc")
    private String pclsDesc;
    /**
     * Requisition Number
     * <p>
     * Lineage reference object : PABAPPL_REQ_NO
     * 
     */
    @JsonProperty("reqNo")
    @JsonPropertyDescription("Lineage reference object : PABAPPL_REQ_NO")
    private String reqNo;
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
    /**
     * Position Class
     * <p>
     * Lineage reference object : PABAPPL_PCLS_CODE
     * 
     */
    @JsonProperty("pclsCode")
    @JsonPropertyDescription("Lineage reference object : PABAPPL_PCLS_CODE")
    private String pclsCode;
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
     * Position Number
     * <p>
     * Lineage reference object : PABAPPL_POSN
     * 
     */
    @JsonProperty("posn")
    @JsonPropertyDescription("Lineage reference object : PABAPPL_POSN")
    private String posn;
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
     * Status
     * <p>
     * 
     * 
     */
    @JsonProperty("currAppsCode")
    private String currAppsCode;
    /**
     * Status Date
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
    @JsonProperty("posnTitle")
    private String posnTitle;
    /**
     * Full or Part Preference
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

    public ApplicantInformation100GetResponse withDate(Date date) {
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

    public ApplicantInformation100GetResponse withDesiredHourly(Double desiredHourly) {
        this.desiredHourly = desiredHourly;
        return this;
    }

    @JsonProperty("pclsDesc")
    public String getPclsDesc() {
        return pclsDesc;
    }

    @JsonProperty("pclsDesc")
    public void setPclsDesc(String pclsDesc) {
        this.pclsDesc = pclsDesc;
    }

    public ApplicantInformation100GetResponse withPclsDesc(String pclsDesc) {
        this.pclsDesc = pclsDesc;
        return this;
    }

    /**
     * Requisition Number
     * <p>
     * Lineage reference object : PABAPPL_REQ_NO
     * 
     */
    @JsonProperty("reqNo")
    public String getReqNo() {
        return reqNo;
    }

    /**
     * Requisition Number
     * <p>
     * Lineage reference object : PABAPPL_REQ_NO
     * 
     */
    @JsonProperty("reqNo")
    public void setReqNo(String reqNo) {
        this.reqNo = reqNo;
    }

    public ApplicantInformation100GetResponse withReqNo(String reqNo) {
        this.reqNo = reqNo;
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

    public ApplicantInformation100GetResponse withAsrcCode(String asrcCode) {
        this.asrcCode = asrcCode;
        return this;
    }

    /**
     * Position Class
     * <p>
     * Lineage reference object : PABAPPL_PCLS_CODE
     * 
     */
    @JsonProperty("pclsCode")
    public String getPclsCode() {
        return pclsCode;
    }

    /**
     * Position Class
     * <p>
     * Lineage reference object : PABAPPL_PCLS_CODE
     * 
     */
    @JsonProperty("pclsCode")
    public void setPclsCode(String pclsCode) {
        this.pclsCode = pclsCode;
    }

    public ApplicantInformation100GetResponse withPclsCode(String pclsCode) {
        this.pclsCode = pclsCode;
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

    public ApplicantInformation100GetResponse withEsklDesc(String esklDesc) {
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

    public ApplicantInformation100GetResponse withUserId(String userId) {
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

    public ApplicantInformation100GetResponse withAsrcDesc(String asrcDesc) {
        this.asrcDesc = asrcDesc;
        return this;
    }

    /**
     * Position Number
     * <p>
     * Lineage reference object : PABAPPL_POSN
     * 
     */
    @JsonProperty("posn")
    public String getPosn() {
        return posn;
    }

    /**
     * Position Number
     * <p>
     * Lineage reference object : PABAPPL_POSN
     * 
     */
    @JsonProperty("posn")
    public void setPosn(String posn) {
        this.posn = posn;
    }

    public ApplicantInformation100GetResponse withPosn(String posn) {
        this.posn = posn;
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

    public ApplicantInformation100GetResponse withDesiredSalary(Double desiredSalary) {
        this.desiredSalary = desiredSalary;
        return this;
    }

    /**
     * Status
     * <p>
     * 
     * 
     */
    @JsonProperty("currAppsCode")
    public String getCurrAppsCode() {
        return currAppsCode;
    }

    /**
     * Status
     * <p>
     * 
     * 
     */
    @JsonProperty("currAppsCode")
    public void setCurrAppsCode(String currAppsCode) {
        this.currAppsCode = currAppsCode;
    }

    public ApplicantInformation100GetResponse withCurrAppsCode(String currAppsCode) {
        this.currAppsCode = currAppsCode;
        return this;
    }

    /**
     * Status Date
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
     * Status Date
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("currAppsDate")
    public void setCurrAppsDate(Date currAppsDate) {
        this.currAppsDate = currAppsDate;
    }

    public ApplicantInformation100GetResponse withCurrAppsDate(Date currAppsDate) {
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

    public ApplicantInformation100GetResponse withCurrComment(String currComment) {
        this.currComment = currComment;
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

    public ApplicantInformation100GetResponse withActivityDate(Date activityDate) {
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

    public ApplicantInformation100GetResponse withCurrAppsDesc(String currAppsDesc) {
        this.currAppsDesc = currAppsDesc;
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

    public ApplicantInformation100GetResponse withEsklCode(String esklCode) {
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

    public ApplicantInformation100GetResponse withDispDesc(String dispDesc) {
        this.dispDesc = dispDesc;
        return this;
    }

    @JsonProperty("posnTitle")
    public String getPosnTitle() {
        return posnTitle;
    }

    @JsonProperty("posnTitle")
    public void setPosnTitle(String posnTitle) {
        this.posnTitle = posnTitle;
    }

    public ApplicantInformation100GetResponse withPosnTitle(String posnTitle) {
        this.posnTitle = posnTitle;
        return this;
    }

    /**
     * Full or Part Preference
     * <p>
     * Lineage reference object : PABAPPL_FULL_PART_IND
     * 
     */
    @JsonProperty("fullPartInd")
    public String getFullPartInd() {
        return fullPartInd;
    }

    /**
     * Full or Part Preference
     * <p>
     * Lineage reference object : PABAPPL_FULL_PART_IND
     * 
     */
    @JsonProperty("fullPartInd")
    public void setFullPartInd(String fullPartInd) {
        this.fullPartInd = fullPartInd;
    }

    public ApplicantInformation100GetResponse withFullPartInd(String fullPartInd) {
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

    public ApplicantInformation100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApplicantInformation100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
        sb.append(',');
        sb.append("desiredHourly");
        sb.append('=');
        sb.append(((this.desiredHourly == null)?"<null>":this.desiredHourly));
        sb.append(',');
        sb.append("pclsDesc");
        sb.append('=');
        sb.append(((this.pclsDesc == null)?"<null>":this.pclsDesc));
        sb.append(',');
        sb.append("reqNo");
        sb.append('=');
        sb.append(((this.reqNo == null)?"<null>":this.reqNo));
        sb.append(',');
        sb.append("asrcCode");
        sb.append('=');
        sb.append(((this.asrcCode == null)?"<null>":this.asrcCode));
        sb.append(',');
        sb.append("pclsCode");
        sb.append('=');
        sb.append(((this.pclsCode == null)?"<null>":this.pclsCode));
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
        sb.append("posn");
        sb.append('=');
        sb.append(((this.posn == null)?"<null>":this.posn));
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
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("currAppsDesc");
        sb.append('=');
        sb.append(((this.currAppsDesc == null)?"<null>":this.currAppsDesc));
        sb.append(',');
        sb.append("esklCode");
        sb.append('=');
        sb.append(((this.esklCode == null)?"<null>":this.esklCode));
        sb.append(',');
        sb.append("dispDesc");
        sb.append('=');
        sb.append(((this.dispDesc == null)?"<null>":this.dispDesc));
        sb.append(',');
        sb.append("posnTitle");
        sb.append('=');
        sb.append(((this.posnTitle == null)?"<null>":this.posnTitle));
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
        result = ((result* 31)+((this.desiredHourly == null)? 0 :this.desiredHourly.hashCode()));
        result = ((result* 31)+((this.pclsDesc == null)? 0 :this.pclsDesc.hashCode()));
        result = ((result* 31)+((this.reqNo == null)? 0 :this.reqNo.hashCode()));
        result = ((result* 31)+((this.asrcCode == null)? 0 :this.asrcCode.hashCode()));
        result = ((result* 31)+((this.pclsCode == null)? 0 :this.pclsCode.hashCode()));
        result = ((result* 31)+((this.esklDesc == null)? 0 :this.esklDesc.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.asrcDesc == null)? 0 :this.asrcDesc.hashCode()));
        result = ((result* 31)+((this.posn == null)? 0 :this.posn.hashCode()));
        result = ((result* 31)+((this.desiredSalary == null)? 0 :this.desiredSalary.hashCode()));
        result = ((result* 31)+((this.currAppsCode == null)? 0 :this.currAppsCode.hashCode()));
        result = ((result* 31)+((this.currAppsDate == null)? 0 :this.currAppsDate.hashCode()));
        result = ((result* 31)+((this.currComment == null)? 0 :this.currComment.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.currAppsDesc == null)? 0 :this.currAppsDesc.hashCode()));
        result = ((result* 31)+((this.esklCode == null)? 0 :this.esklCode.hashCode()));
        result = ((result* 31)+((this.dispDesc == null)? 0 :this.dispDesc.hashCode()));
        result = ((result* 31)+((this.posnTitle == null)? 0 :this.posnTitle.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.fullPartInd == null)? 0 :this.fullPartInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicantInformation100GetResponse) == false) {
            return false;
        }
        ApplicantInformation100GetResponse rhs = ((ApplicantInformation100GetResponse) other);
        return ((((((((((((((((((((((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date)))&&((this.desiredHourly == rhs.desiredHourly)||((this.desiredHourly!= null)&&this.desiredHourly.equals(rhs.desiredHourly))))&&((this.pclsDesc == rhs.pclsDesc)||((this.pclsDesc!= null)&&this.pclsDesc.equals(rhs.pclsDesc))))&&((this.reqNo == rhs.reqNo)||((this.reqNo!= null)&&this.reqNo.equals(rhs.reqNo))))&&((this.asrcCode == rhs.asrcCode)||((this.asrcCode!= null)&&this.asrcCode.equals(rhs.asrcCode))))&&((this.pclsCode == rhs.pclsCode)||((this.pclsCode!= null)&&this.pclsCode.equals(rhs.pclsCode))))&&((this.esklDesc == rhs.esklDesc)||((this.esklDesc!= null)&&this.esklDesc.equals(rhs.esklDesc))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.asrcDesc == rhs.asrcDesc)||((this.asrcDesc!= null)&&this.asrcDesc.equals(rhs.asrcDesc))))&&((this.posn == rhs.posn)||((this.posn!= null)&&this.posn.equals(rhs.posn))))&&((this.desiredSalary == rhs.desiredSalary)||((this.desiredSalary!= null)&&this.desiredSalary.equals(rhs.desiredSalary))))&&((this.currAppsCode == rhs.currAppsCode)||((this.currAppsCode!= null)&&this.currAppsCode.equals(rhs.currAppsCode))))&&((this.currAppsDate == rhs.currAppsDate)||((this.currAppsDate!= null)&&this.currAppsDate.equals(rhs.currAppsDate))))&&((this.currComment == rhs.currComment)||((this.currComment!= null)&&this.currComment.equals(rhs.currComment))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.currAppsDesc == rhs.currAppsDesc)||((this.currAppsDesc!= null)&&this.currAppsDesc.equals(rhs.currAppsDesc))))&&((this.esklCode == rhs.esklCode)||((this.esklCode!= null)&&this.esklCode.equals(rhs.esklCode))))&&((this.dispDesc == rhs.dispDesc)||((this.dispDesc!= null)&&this.dispDesc.equals(rhs.dispDesc))))&&((this.posnTitle == rhs.posnTitle)||((this.posnTitle!= null)&&this.posnTitle.equals(rhs.posnTitle))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.fullPartInd == rhs.fullPartInd)||((this.fullPartInd!= null)&&this.fullPartInd.equals(rhs.fullPartInd))));
    }

}
