
package com.ellucian.generated.bpapi.ban.position_requisition.v1_0_0;

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
    "reqsCode",
    "relocInd",
    "applDate",
    "apprId",
    "coasCode",
    "apprName",
    "pclsTitle",
    "pclsCode",
    "orgnCode",
    "activityDate",
    "salaryRateLow",
    "posnTitle",
    "recrId",
    "orgnDesc",
    "salaryRateHigh",
    "hireDate",
    "coasDesc",
    "userId",
    "apprDate",
    "posn",
    "vacyDate",
    "closeDate",
    "statusDescription",
    "salaryRate",
    "postDate",
    "recrName",
    "openDate"
})
@Generated("jsonschema2pojo")
public class PositionRequisition100GetResponse {

    /**
     * Status
     * <p>
     * Lineage reference object : PABREQU_REQS_CODE
     * (Required)
     * 
     */
    @JsonProperty("reqsCode")
    @JsonPropertyDescription("Lineage reference object : PABREQU_REQS_CODE")
    private String reqsCode;
    /**
     * Paid Relocation
     * <p>
     * Lineage reference object : PABREQU_RELOC_IND
     * 
     */
    @JsonProperty("relocInd")
    @JsonPropertyDescription("Lineage reference object : PABREQU_RELOC_IND")
    private String relocInd;
    /**
     * Status Date
     * <p>
     * Lineage reference object : PABREQU_APPL_DATE
     * (Required)
     * 
     */
    @JsonProperty("applDate")
    @JsonPropertyDescription("Lineage reference object : PABREQU_APPL_DATE")
    private Date applDate;
    /**
     * Approver
     * <p>
     * 
     * 
     */
    @JsonProperty("apprId")
    private String apprId;
    /**
     * COA
     * <p>
     * Lineage reference object : PABREQU_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : PABREQU_COAS_CODE")
    private String coasCode;
    @JsonProperty("apprName")
    private String apprName;
    @JsonProperty("pclsTitle")
    private String pclsTitle;
    /**
     * Position Class
     * <p>
     * 
     * 
     */
    @JsonProperty("pclsCode")
    private String pclsCode;
    /**
     * Organization
     * <p>
     * Lineage reference object : PABREQU_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    @JsonPropertyDescription("Lineage reference object : PABREQU_ORGN_CODE")
    private String orgnCode;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : PABREQU_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : PABREQU_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Range Low
     * <p>
     * 
     * 
     */
    @JsonProperty("salaryRateLow")
    private Double salaryRateLow;
    @JsonProperty("posnTitle")
    private String posnTitle;
    /**
     * Recruiter
     * <p>
     * 
     * 
     */
    @JsonProperty("recrId")
    private String recrId;
    @JsonProperty("orgnDesc")
    private String orgnDesc;
    /**
     * Range High
     * <p>
     * 
     * 
     */
    @JsonProperty("salaryRateHigh")
    private Double salaryRateHigh;
    /**
     * Expected Hire Date
     * <p>
     * Lineage reference object : PABREQU_HIRE_DATE
     * 
     */
    @JsonProperty("hireDate")
    @JsonPropertyDescription("Lineage reference object : PABREQU_HIRE_DATE")
    private Date hireDate;
    @JsonProperty("coasDesc")
    private String coasDesc;
    /**
     * Lineage reference object : PABREQU_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : PABREQU_USER_ID")
    private String userId;
    /**
     * Date
     * <p>
     * Lineage reference object : PABREQU_APPR_DATE
     * 
     */
    @JsonProperty("apprDate")
    @JsonPropertyDescription("Lineage reference object : PABREQU_APPR_DATE")
    private Date apprDate;
    /**
     * Position
     * <p>
     * Lineage reference object : PABREQU_POSN
     * (Required)
     * 
     */
    @JsonProperty("posn")
    @JsonPropertyDescription("Lineage reference object : PABREQU_POSN")
    private String posn;
    /**
     * Vacancy Date
     * <p>
     * Lineage reference object : PABREQU_VACY_DATE
     * 
     */
    @JsonProperty("vacyDate")
    @JsonPropertyDescription("Lineage reference object : PABREQU_VACY_DATE")
    private Date vacyDate;
    /**
     * Close Application Date
     * <p>
     * Lineage reference object : PABREQU_CLOSE_DATE
     * 
     */
    @JsonProperty("closeDate")
    @JsonPropertyDescription("Lineage reference object : PABREQU_CLOSE_DATE")
    private Date closeDate;
    @JsonProperty("statusDescription")
    private String statusDescription;
    /**
     * Step Value
     * <p>
     * 
     * 
     */
    @JsonProperty("salaryRate")
    private Double salaryRate;
    /**
     * Posting Date
     * <p>
     * Lineage reference object : PABREQU_POST_DATE
     * 
     */
    @JsonProperty("postDate")
    @JsonPropertyDescription("Lineage reference object : PABREQU_POST_DATE")
    private Date postDate;
    @JsonProperty("recrName")
    private String recrName;
    /**
     * Open Application Date
     * <p>
     * Lineage reference object : PABREQU_OPEN_DATE
     * 
     */
    @JsonProperty("openDate")
    @JsonPropertyDescription("Lineage reference object : PABREQU_OPEN_DATE")
    private Date openDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Status
     * <p>
     * Lineage reference object : PABREQU_REQS_CODE
     * (Required)
     * 
     */
    @JsonProperty("reqsCode")
    public String getReqsCode() {
        return reqsCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : PABREQU_REQS_CODE
     * (Required)
     * 
     */
    @JsonProperty("reqsCode")
    public void setReqsCode(String reqsCode) {
        this.reqsCode = reqsCode;
    }

    public PositionRequisition100GetResponse withReqsCode(String reqsCode) {
        this.reqsCode = reqsCode;
        return this;
    }

    /**
     * Paid Relocation
     * <p>
     * Lineage reference object : PABREQU_RELOC_IND
     * 
     */
    @JsonProperty("relocInd")
    public String getRelocInd() {
        return relocInd;
    }

    /**
     * Paid Relocation
     * <p>
     * Lineage reference object : PABREQU_RELOC_IND
     * 
     */
    @JsonProperty("relocInd")
    public void setRelocInd(String relocInd) {
        this.relocInd = relocInd;
    }

    public PositionRequisition100GetResponse withRelocInd(String relocInd) {
        this.relocInd = relocInd;
        return this;
    }

    /**
     * Status Date
     * <p>
     * Lineage reference object : PABREQU_APPL_DATE
     * (Required)
     * 
     */
    @JsonProperty("applDate")
    public Date getApplDate() {
        return applDate;
    }

    /**
     * Status Date
     * <p>
     * Lineage reference object : PABREQU_APPL_DATE
     * (Required)
     * 
     */
    @JsonProperty("applDate")
    public void setApplDate(Date applDate) {
        this.applDate = applDate;
    }

    public PositionRequisition100GetResponse withApplDate(Date applDate) {
        this.applDate = applDate;
        return this;
    }

    /**
     * Approver
     * <p>
     * 
     * 
     */
    @JsonProperty("apprId")
    public String getApprId() {
        return apprId;
    }

    /**
     * Approver
     * <p>
     * 
     * 
     */
    @JsonProperty("apprId")
    public void setApprId(String apprId) {
        this.apprId = apprId;
    }

    public PositionRequisition100GetResponse withApprId(String apprId) {
        this.apprId = apprId;
        return this;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : PABREQU_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    public String getCoasCode() {
        return coasCode;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : PABREQU_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public PositionRequisition100GetResponse withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    @JsonProperty("apprName")
    public String getApprName() {
        return apprName;
    }

    @JsonProperty("apprName")
    public void setApprName(String apprName) {
        this.apprName = apprName;
    }

    public PositionRequisition100GetResponse withApprName(String apprName) {
        this.apprName = apprName;
        return this;
    }

    @JsonProperty("pclsTitle")
    public String getPclsTitle() {
        return pclsTitle;
    }

    @JsonProperty("pclsTitle")
    public void setPclsTitle(String pclsTitle) {
        this.pclsTitle = pclsTitle;
    }

    public PositionRequisition100GetResponse withPclsTitle(String pclsTitle) {
        this.pclsTitle = pclsTitle;
        return this;
    }

    /**
     * Position Class
     * <p>
     * 
     * 
     */
    @JsonProperty("pclsCode")
    public String getPclsCode() {
        return pclsCode;
    }

    /**
     * Position Class
     * <p>
     * 
     * 
     */
    @JsonProperty("pclsCode")
    public void setPclsCode(String pclsCode) {
        this.pclsCode = pclsCode;
    }

    public PositionRequisition100GetResponse withPclsCode(String pclsCode) {
        this.pclsCode = pclsCode;
        return this;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : PABREQU_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    public String getOrgnCode() {
        return orgnCode;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : PABREQU_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    public void setOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
    }

    public PositionRequisition100GetResponse withOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PABREQU_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PABREQU_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public PositionRequisition100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Range Low
     * <p>
     * 
     * 
     */
    @JsonProperty("salaryRateLow")
    public Double getSalaryRateLow() {
        return salaryRateLow;
    }

    /**
     * Range Low
     * <p>
     * 
     * 
     */
    @JsonProperty("salaryRateLow")
    public void setSalaryRateLow(Double salaryRateLow) {
        this.salaryRateLow = salaryRateLow;
    }

    public PositionRequisition100GetResponse withSalaryRateLow(Double salaryRateLow) {
        this.salaryRateLow = salaryRateLow;
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

    public PositionRequisition100GetResponse withPosnTitle(String posnTitle) {
        this.posnTitle = posnTitle;
        return this;
    }

    /**
     * Recruiter
     * <p>
     * 
     * 
     */
    @JsonProperty("recrId")
    public String getRecrId() {
        return recrId;
    }

    /**
     * Recruiter
     * <p>
     * 
     * 
     */
    @JsonProperty("recrId")
    public void setRecrId(String recrId) {
        this.recrId = recrId;
    }

    public PositionRequisition100GetResponse withRecrId(String recrId) {
        this.recrId = recrId;
        return this;
    }

    @JsonProperty("orgnDesc")
    public String getOrgnDesc() {
        return orgnDesc;
    }

    @JsonProperty("orgnDesc")
    public void setOrgnDesc(String orgnDesc) {
        this.orgnDesc = orgnDesc;
    }

    public PositionRequisition100GetResponse withOrgnDesc(String orgnDesc) {
        this.orgnDesc = orgnDesc;
        return this;
    }

    /**
     * Range High
     * <p>
     * 
     * 
     */
    @JsonProperty("salaryRateHigh")
    public Double getSalaryRateHigh() {
        return salaryRateHigh;
    }

    /**
     * Range High
     * <p>
     * 
     * 
     */
    @JsonProperty("salaryRateHigh")
    public void setSalaryRateHigh(Double salaryRateHigh) {
        this.salaryRateHigh = salaryRateHigh;
    }

    public PositionRequisition100GetResponse withSalaryRateHigh(Double salaryRateHigh) {
        this.salaryRateHigh = salaryRateHigh;
        return this;
    }

    /**
     * Expected Hire Date
     * <p>
     * Lineage reference object : PABREQU_HIRE_DATE
     * 
     */
    @JsonProperty("hireDate")
    public Date getHireDate() {
        return hireDate;
    }

    /**
     * Expected Hire Date
     * <p>
     * Lineage reference object : PABREQU_HIRE_DATE
     * 
     */
    @JsonProperty("hireDate")
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public PositionRequisition100GetResponse withHireDate(Date hireDate) {
        this.hireDate = hireDate;
        return this;
    }

    @JsonProperty("coasDesc")
    public String getCoasDesc() {
        return coasDesc;
    }

    @JsonProperty("coasDesc")
    public void setCoasDesc(String coasDesc) {
        this.coasDesc = coasDesc;
    }

    public PositionRequisition100GetResponse withCoasDesc(String coasDesc) {
        this.coasDesc = coasDesc;
        return this;
    }

    /**
     * Lineage reference object : PABREQU_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : PABREQU_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public PositionRequisition100GetResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Date
     * <p>
     * Lineage reference object : PABREQU_APPR_DATE
     * 
     */
    @JsonProperty("apprDate")
    public Date getApprDate() {
        return apprDate;
    }

    /**
     * Date
     * <p>
     * Lineage reference object : PABREQU_APPR_DATE
     * 
     */
    @JsonProperty("apprDate")
    public void setApprDate(Date apprDate) {
        this.apprDate = apprDate;
    }

    public PositionRequisition100GetResponse withApprDate(Date apprDate) {
        this.apprDate = apprDate;
        return this;
    }

    /**
     * Position
     * <p>
     * Lineage reference object : PABREQU_POSN
     * (Required)
     * 
     */
    @JsonProperty("posn")
    public String getPosn() {
        return posn;
    }

    /**
     * Position
     * <p>
     * Lineage reference object : PABREQU_POSN
     * (Required)
     * 
     */
    @JsonProperty("posn")
    public void setPosn(String posn) {
        this.posn = posn;
    }

    public PositionRequisition100GetResponse withPosn(String posn) {
        this.posn = posn;
        return this;
    }

    /**
     * Vacancy Date
     * <p>
     * Lineage reference object : PABREQU_VACY_DATE
     * 
     */
    @JsonProperty("vacyDate")
    public Date getVacyDate() {
        return vacyDate;
    }

    /**
     * Vacancy Date
     * <p>
     * Lineage reference object : PABREQU_VACY_DATE
     * 
     */
    @JsonProperty("vacyDate")
    public void setVacyDate(Date vacyDate) {
        this.vacyDate = vacyDate;
    }

    public PositionRequisition100GetResponse withVacyDate(Date vacyDate) {
        this.vacyDate = vacyDate;
        return this;
    }

    /**
     * Close Application Date
     * <p>
     * Lineage reference object : PABREQU_CLOSE_DATE
     * 
     */
    @JsonProperty("closeDate")
    public Date getCloseDate() {
        return closeDate;
    }

    /**
     * Close Application Date
     * <p>
     * Lineage reference object : PABREQU_CLOSE_DATE
     * 
     */
    @JsonProperty("closeDate")
    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    public PositionRequisition100GetResponse withCloseDate(Date closeDate) {
        this.closeDate = closeDate;
        return this;
    }

    @JsonProperty("statusDescription")
    public String getStatusDescription() {
        return statusDescription;
    }

    @JsonProperty("statusDescription")
    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public PositionRequisition100GetResponse withStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
        return this;
    }

    /**
     * Step Value
     * <p>
     * 
     * 
     */
    @JsonProperty("salaryRate")
    public Double getSalaryRate() {
        return salaryRate;
    }

    /**
     * Step Value
     * <p>
     * 
     * 
     */
    @JsonProperty("salaryRate")
    public void setSalaryRate(Double salaryRate) {
        this.salaryRate = salaryRate;
    }

    public PositionRequisition100GetResponse withSalaryRate(Double salaryRate) {
        this.salaryRate = salaryRate;
        return this;
    }

    /**
     * Posting Date
     * <p>
     * Lineage reference object : PABREQU_POST_DATE
     * 
     */
    @JsonProperty("postDate")
    public Date getPostDate() {
        return postDate;
    }

    /**
     * Posting Date
     * <p>
     * Lineage reference object : PABREQU_POST_DATE
     * 
     */
    @JsonProperty("postDate")
    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public PositionRequisition100GetResponse withPostDate(Date postDate) {
        this.postDate = postDate;
        return this;
    }

    @JsonProperty("recrName")
    public String getRecrName() {
        return recrName;
    }

    @JsonProperty("recrName")
    public void setRecrName(String recrName) {
        this.recrName = recrName;
    }

    public PositionRequisition100GetResponse withRecrName(String recrName) {
        this.recrName = recrName;
        return this;
    }

    /**
     * Open Application Date
     * <p>
     * Lineage reference object : PABREQU_OPEN_DATE
     * 
     */
    @JsonProperty("openDate")
    public Date getOpenDate() {
        return openDate;
    }

    /**
     * Open Application Date
     * <p>
     * Lineage reference object : PABREQU_OPEN_DATE
     * 
     */
    @JsonProperty("openDate")
    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    public PositionRequisition100GetResponse withOpenDate(Date openDate) {
        this.openDate = openDate;
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

    public PositionRequisition100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PositionRequisition100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("reqsCode");
        sb.append('=');
        sb.append(((this.reqsCode == null)?"<null>":this.reqsCode));
        sb.append(',');
        sb.append("relocInd");
        sb.append('=');
        sb.append(((this.relocInd == null)?"<null>":this.relocInd));
        sb.append(',');
        sb.append("applDate");
        sb.append('=');
        sb.append(((this.applDate == null)?"<null>":this.applDate));
        sb.append(',');
        sb.append("apprId");
        sb.append('=');
        sb.append(((this.apprId == null)?"<null>":this.apprId));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("apprName");
        sb.append('=');
        sb.append(((this.apprName == null)?"<null>":this.apprName));
        sb.append(',');
        sb.append("pclsTitle");
        sb.append('=');
        sb.append(((this.pclsTitle == null)?"<null>":this.pclsTitle));
        sb.append(',');
        sb.append("pclsCode");
        sb.append('=');
        sb.append(((this.pclsCode == null)?"<null>":this.pclsCode));
        sb.append(',');
        sb.append("orgnCode");
        sb.append('=');
        sb.append(((this.orgnCode == null)?"<null>":this.orgnCode));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("salaryRateLow");
        sb.append('=');
        sb.append(((this.salaryRateLow == null)?"<null>":this.salaryRateLow));
        sb.append(',');
        sb.append("posnTitle");
        sb.append('=');
        sb.append(((this.posnTitle == null)?"<null>":this.posnTitle));
        sb.append(',');
        sb.append("recrId");
        sb.append('=');
        sb.append(((this.recrId == null)?"<null>":this.recrId));
        sb.append(',');
        sb.append("orgnDesc");
        sb.append('=');
        sb.append(((this.orgnDesc == null)?"<null>":this.orgnDesc));
        sb.append(',');
        sb.append("salaryRateHigh");
        sb.append('=');
        sb.append(((this.salaryRateHigh == null)?"<null>":this.salaryRateHigh));
        sb.append(',');
        sb.append("hireDate");
        sb.append('=');
        sb.append(((this.hireDate == null)?"<null>":this.hireDate));
        sb.append(',');
        sb.append("coasDesc");
        sb.append('=');
        sb.append(((this.coasDesc == null)?"<null>":this.coasDesc));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("apprDate");
        sb.append('=');
        sb.append(((this.apprDate == null)?"<null>":this.apprDate));
        sb.append(',');
        sb.append("posn");
        sb.append('=');
        sb.append(((this.posn == null)?"<null>":this.posn));
        sb.append(',');
        sb.append("vacyDate");
        sb.append('=');
        sb.append(((this.vacyDate == null)?"<null>":this.vacyDate));
        sb.append(',');
        sb.append("closeDate");
        sb.append('=');
        sb.append(((this.closeDate == null)?"<null>":this.closeDate));
        sb.append(',');
        sb.append("statusDescription");
        sb.append('=');
        sb.append(((this.statusDescription == null)?"<null>":this.statusDescription));
        sb.append(',');
        sb.append("salaryRate");
        sb.append('=');
        sb.append(((this.salaryRate == null)?"<null>":this.salaryRate));
        sb.append(',');
        sb.append("postDate");
        sb.append('=');
        sb.append(((this.postDate == null)?"<null>":this.postDate));
        sb.append(',');
        sb.append("recrName");
        sb.append('=');
        sb.append(((this.recrName == null)?"<null>":this.recrName));
        sb.append(',');
        sb.append("openDate");
        sb.append('=');
        sb.append(((this.openDate == null)?"<null>":this.openDate));
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
        result = ((result* 31)+((this.reqsCode == null)? 0 :this.reqsCode.hashCode()));
        result = ((result* 31)+((this.relocInd == null)? 0 :this.relocInd.hashCode()));
        result = ((result* 31)+((this.applDate == null)? 0 :this.applDate.hashCode()));
        result = ((result* 31)+((this.apprId == null)? 0 :this.apprId.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.apprName == null)? 0 :this.apprName.hashCode()));
        result = ((result* 31)+((this.pclsTitle == null)? 0 :this.pclsTitle.hashCode()));
        result = ((result* 31)+((this.pclsCode == null)? 0 :this.pclsCode.hashCode()));
        result = ((result* 31)+((this.orgnCode == null)? 0 :this.orgnCode.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.salaryRateLow == null)? 0 :this.salaryRateLow.hashCode()));
        result = ((result* 31)+((this.posnTitle == null)? 0 :this.posnTitle.hashCode()));
        result = ((result* 31)+((this.recrId == null)? 0 :this.recrId.hashCode()));
        result = ((result* 31)+((this.orgnDesc == null)? 0 :this.orgnDesc.hashCode()));
        result = ((result* 31)+((this.salaryRateHigh == null)? 0 :this.salaryRateHigh.hashCode()));
        result = ((result* 31)+((this.hireDate == null)? 0 :this.hireDate.hashCode()));
        result = ((result* 31)+((this.coasDesc == null)? 0 :this.coasDesc.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.apprDate == null)? 0 :this.apprDate.hashCode()));
        result = ((result* 31)+((this.posn == null)? 0 :this.posn.hashCode()));
        result = ((result* 31)+((this.vacyDate == null)? 0 :this.vacyDate.hashCode()));
        result = ((result* 31)+((this.closeDate == null)? 0 :this.closeDate.hashCode()));
        result = ((result* 31)+((this.statusDescription == null)? 0 :this.statusDescription.hashCode()));
        result = ((result* 31)+((this.salaryRate == null)? 0 :this.salaryRate.hashCode()));
        result = ((result* 31)+((this.postDate == null)? 0 :this.postDate.hashCode()));
        result = ((result* 31)+((this.recrName == null)? 0 :this.recrName.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.openDate == null)? 0 :this.openDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PositionRequisition100GetResponse) == false) {
            return false;
        }
        PositionRequisition100GetResponse rhs = ((PositionRequisition100GetResponse) other);
        return (((((((((((((((((((((((((((((this.reqsCode == rhs.reqsCode)||((this.reqsCode!= null)&&this.reqsCode.equals(rhs.reqsCode)))&&((this.relocInd == rhs.relocInd)||((this.relocInd!= null)&&this.relocInd.equals(rhs.relocInd))))&&((this.applDate == rhs.applDate)||((this.applDate!= null)&&this.applDate.equals(rhs.applDate))))&&((this.apprId == rhs.apprId)||((this.apprId!= null)&&this.apprId.equals(rhs.apprId))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.apprName == rhs.apprName)||((this.apprName!= null)&&this.apprName.equals(rhs.apprName))))&&((this.pclsTitle == rhs.pclsTitle)||((this.pclsTitle!= null)&&this.pclsTitle.equals(rhs.pclsTitle))))&&((this.pclsCode == rhs.pclsCode)||((this.pclsCode!= null)&&this.pclsCode.equals(rhs.pclsCode))))&&((this.orgnCode == rhs.orgnCode)||((this.orgnCode!= null)&&this.orgnCode.equals(rhs.orgnCode))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.salaryRateLow == rhs.salaryRateLow)||((this.salaryRateLow!= null)&&this.salaryRateLow.equals(rhs.salaryRateLow))))&&((this.posnTitle == rhs.posnTitle)||((this.posnTitle!= null)&&this.posnTitle.equals(rhs.posnTitle))))&&((this.recrId == rhs.recrId)||((this.recrId!= null)&&this.recrId.equals(rhs.recrId))))&&((this.orgnDesc == rhs.orgnDesc)||((this.orgnDesc!= null)&&this.orgnDesc.equals(rhs.orgnDesc))))&&((this.salaryRateHigh == rhs.salaryRateHigh)||((this.salaryRateHigh!= null)&&this.salaryRateHigh.equals(rhs.salaryRateHigh))))&&((this.hireDate == rhs.hireDate)||((this.hireDate!= null)&&this.hireDate.equals(rhs.hireDate))))&&((this.coasDesc == rhs.coasDesc)||((this.coasDesc!= null)&&this.coasDesc.equals(rhs.coasDesc))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.apprDate == rhs.apprDate)||((this.apprDate!= null)&&this.apprDate.equals(rhs.apprDate))))&&((this.posn == rhs.posn)||((this.posn!= null)&&this.posn.equals(rhs.posn))))&&((this.vacyDate == rhs.vacyDate)||((this.vacyDate!= null)&&this.vacyDate.equals(rhs.vacyDate))))&&((this.closeDate == rhs.closeDate)||((this.closeDate!= null)&&this.closeDate.equals(rhs.closeDate))))&&((this.statusDescription == rhs.statusDescription)||((this.statusDescription!= null)&&this.statusDescription.equals(rhs.statusDescription))))&&((this.salaryRate == rhs.salaryRate)||((this.salaryRate!= null)&&this.salaryRate.equals(rhs.salaryRate))))&&((this.postDate == rhs.postDate)||((this.postDate!= null)&&this.postDate.equals(rhs.postDate))))&&((this.recrName == rhs.recrName)||((this.recrName!= null)&&this.recrName.equals(rhs.recrName))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.openDate == rhs.openDate)||((this.openDate!= null)&&this.openDate.equals(rhs.openDate))));
    }

}
