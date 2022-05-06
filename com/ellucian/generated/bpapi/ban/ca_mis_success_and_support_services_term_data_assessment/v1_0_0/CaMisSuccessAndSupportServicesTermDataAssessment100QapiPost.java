
package com.ellucian.generated.bpapi.ban.ca_mis_success_and_support_services_term_data_assessment.v1_0_0;

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
    "id",
    "svamstdTermCode",
    "svamstdDicdCode",
    "asstCode",
    "ssstCode",
    "svvasstNoncreditServiceInd",
    "serviceDate",
    "ssgpCode",
    "dataOrigin",
    "origCode",
    "activityDate",
    "userId"
})
@Generated("jsonschema2pojo")
public class CaMisSuccessAndSupportServicesTermDataAssessment100QapiPost {

    /**
     * Provider User ID
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    private String id;
    @JsonProperty("svamstdTermCode")
    private String svamstdTermCode;
    @JsonProperty("svamstdDicdCode")
    private String svamstdDicdCode;
    /**
     * Assessment Service
     * <p>
     * Lineage reference object : SVRASMT_ASST_CODE, Lookup lineage reference object : svvasst
     * 
     */
    @JsonProperty("asstCode")
    @JsonPropertyDescription("Lineage reference object : SVRASMT_ASST_CODE, Lookup lineage reference object : svvasst")
    private String asstCode;
    /**
     * Status
     * <p>
     * Lineage reference object : SVRASMT_SSST_CODE, Lookup lineage reference object : stvssst
     * 
     */
    @JsonProperty("ssstCode")
    @JsonPropertyDescription("Lineage reference object : SVRASMT_SSST_CODE, Lookup lineage reference object : stvssst")
    private String ssstCode;
    /**
     * Lineage reference object : SVVASST_NONCREDIT_SERVICE_IND
     * 
     */
    @JsonProperty("svvasstNoncreditServiceInd")
    @JsonPropertyDescription("Lineage reference object : SVVASST_NONCREDIT_SERVICE_IND")
    private String svvasstNoncreditServiceInd;
    /**
     * Service Date
     * <p>
     * Lineage reference object : SVRASMT_SERVICE_DATE
     * 
     */
    @JsonProperty("serviceDate")
    @JsonPropertyDescription("Lineage reference object : SVRASMT_SERVICE_DATE")
    private Date serviceDate;
    /**
     * Group
     * <p>
     * Lineage reference object : SVRASMT_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("ssgpCode")
    @JsonPropertyDescription("Lineage reference object : SVRASMT_SSGP_CODE, Lookup lineage reference object : stvssgp")
    private String ssgpCode;
    /**
     * Source
     * <p>
     * Lineage reference object : SVRASMT_DATA_ORIGIN
     * 
     */
    @JsonProperty("dataOrigin")
    @JsonPropertyDescription("Lineage reference object : SVRASMT_DATA_ORIGIN")
    private String dataOrigin;
    /**
     * Provider Origin
     * <p>
     * Lineage reference object : SVRASMT_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("origCode")
    @JsonPropertyDescription("Lineage reference object : SVRASMT_ORIG_CODE, Lookup lineage reference object : stvorig")
    private String origCode;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SVRASMT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SVRASMT_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * User ID
     * <p>
     * Lineage reference object : SVRASMT_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SVRASMT_USER_ID")
    private String userId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Provider User ID
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Provider User ID
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public CaMisSuccessAndSupportServicesTermDataAssessment100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("svamstdTermCode")
    public String getSvamstdTermCode() {
        return svamstdTermCode;
    }

    @JsonProperty("svamstdTermCode")
    public void setSvamstdTermCode(String svamstdTermCode) {
        this.svamstdTermCode = svamstdTermCode;
    }

    public CaMisSuccessAndSupportServicesTermDataAssessment100QapiPost withSvamstdTermCode(String svamstdTermCode) {
        this.svamstdTermCode = svamstdTermCode;
        return this;
    }

    @JsonProperty("svamstdDicdCode")
    public String getSvamstdDicdCode() {
        return svamstdDicdCode;
    }

    @JsonProperty("svamstdDicdCode")
    public void setSvamstdDicdCode(String svamstdDicdCode) {
        this.svamstdDicdCode = svamstdDicdCode;
    }

    public CaMisSuccessAndSupportServicesTermDataAssessment100QapiPost withSvamstdDicdCode(String svamstdDicdCode) {
        this.svamstdDicdCode = svamstdDicdCode;
        return this;
    }

    /**
     * Assessment Service
     * <p>
     * Lineage reference object : SVRASMT_ASST_CODE, Lookup lineage reference object : svvasst
     * 
     */
    @JsonProperty("asstCode")
    public String getAsstCode() {
        return asstCode;
    }

    /**
     * Assessment Service
     * <p>
     * Lineage reference object : SVRASMT_ASST_CODE, Lookup lineage reference object : svvasst
     * 
     */
    @JsonProperty("asstCode")
    public void setAsstCode(String asstCode) {
        this.asstCode = asstCode;
    }

    public CaMisSuccessAndSupportServicesTermDataAssessment100QapiPost withAsstCode(String asstCode) {
        this.asstCode = asstCode;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SVRASMT_SSST_CODE, Lookup lineage reference object : stvssst
     * 
     */
    @JsonProperty("ssstCode")
    public String getSsstCode() {
        return ssstCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SVRASMT_SSST_CODE, Lookup lineage reference object : stvssst
     * 
     */
    @JsonProperty("ssstCode")
    public void setSsstCode(String ssstCode) {
        this.ssstCode = ssstCode;
    }

    public CaMisSuccessAndSupportServicesTermDataAssessment100QapiPost withSsstCode(String ssstCode) {
        this.ssstCode = ssstCode;
        return this;
    }

    /**
     * Lineage reference object : SVVASST_NONCREDIT_SERVICE_IND
     * 
     */
    @JsonProperty("svvasstNoncreditServiceInd")
    public String getSvvasstNoncreditServiceInd() {
        return svvasstNoncreditServiceInd;
    }

    /**
     * Lineage reference object : SVVASST_NONCREDIT_SERVICE_IND
     * 
     */
    @JsonProperty("svvasstNoncreditServiceInd")
    public void setSvvasstNoncreditServiceInd(String svvasstNoncreditServiceInd) {
        this.svvasstNoncreditServiceInd = svvasstNoncreditServiceInd;
    }

    public CaMisSuccessAndSupportServicesTermDataAssessment100QapiPost withSvvasstNoncreditServiceInd(String svvasstNoncreditServiceInd) {
        this.svvasstNoncreditServiceInd = svvasstNoncreditServiceInd;
        return this;
    }

    /**
     * Service Date
     * <p>
     * Lineage reference object : SVRASMT_SERVICE_DATE
     * 
     */
    @JsonProperty("serviceDate")
    public Date getServiceDate() {
        return serviceDate;
    }

    /**
     * Service Date
     * <p>
     * Lineage reference object : SVRASMT_SERVICE_DATE
     * 
     */
    @JsonProperty("serviceDate")
    public void setServiceDate(Date serviceDate) {
        this.serviceDate = serviceDate;
    }

    public CaMisSuccessAndSupportServicesTermDataAssessment100QapiPost withServiceDate(Date serviceDate) {
        this.serviceDate = serviceDate;
        return this;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : SVRASMT_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("ssgpCode")
    public String getSsgpCode() {
        return ssgpCode;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : SVRASMT_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("ssgpCode")
    public void setSsgpCode(String ssgpCode) {
        this.ssgpCode = ssgpCode;
    }

    public CaMisSuccessAndSupportServicesTermDataAssessment100QapiPost withSsgpCode(String ssgpCode) {
        this.ssgpCode = ssgpCode;
        return this;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : SVRASMT_DATA_ORIGIN
     * 
     */
    @JsonProperty("dataOrigin")
    public String getDataOrigin() {
        return dataOrigin;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : SVRASMT_DATA_ORIGIN
     * 
     */
    @JsonProperty("dataOrigin")
    public void setDataOrigin(String dataOrigin) {
        this.dataOrigin = dataOrigin;
    }

    public CaMisSuccessAndSupportServicesTermDataAssessment100QapiPost withDataOrigin(String dataOrigin) {
        this.dataOrigin = dataOrigin;
        return this;
    }

    /**
     * Provider Origin
     * <p>
     * Lineage reference object : SVRASMT_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("origCode")
    public String getOrigCode() {
        return origCode;
    }

    /**
     * Provider Origin
     * <p>
     * Lineage reference object : SVRASMT_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("origCode")
    public void setOrigCode(String origCode) {
        this.origCode = origCode;
    }

    public CaMisSuccessAndSupportServicesTermDataAssessment100QapiPost withOrigCode(String origCode) {
        this.origCode = origCode;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SVRASMT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SVRASMT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public CaMisSuccessAndSupportServicesTermDataAssessment100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SVRASMT_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SVRASMT_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public CaMisSuccessAndSupportServicesTermDataAssessment100QapiPost withUserId(String userId) {
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

    public CaMisSuccessAndSupportServicesTermDataAssessment100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CaMisSuccessAndSupportServicesTermDataAssessment100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("svamstdTermCode");
        sb.append('=');
        sb.append(((this.svamstdTermCode == null)?"<null>":this.svamstdTermCode));
        sb.append(',');
        sb.append("svamstdDicdCode");
        sb.append('=');
        sb.append(((this.svamstdDicdCode == null)?"<null>":this.svamstdDicdCode));
        sb.append(',');
        sb.append("asstCode");
        sb.append('=');
        sb.append(((this.asstCode == null)?"<null>":this.asstCode));
        sb.append(',');
        sb.append("ssstCode");
        sb.append('=');
        sb.append(((this.ssstCode == null)?"<null>":this.ssstCode));
        sb.append(',');
        sb.append("svvasstNoncreditServiceInd");
        sb.append('=');
        sb.append(((this.svvasstNoncreditServiceInd == null)?"<null>":this.svvasstNoncreditServiceInd));
        sb.append(',');
        sb.append("serviceDate");
        sb.append('=');
        sb.append(((this.serviceDate == null)?"<null>":this.serviceDate));
        sb.append(',');
        sb.append("ssgpCode");
        sb.append('=');
        sb.append(((this.ssgpCode == null)?"<null>":this.ssgpCode));
        sb.append(',');
        sb.append("dataOrigin");
        sb.append('=');
        sb.append(((this.dataOrigin == null)?"<null>":this.dataOrigin));
        sb.append(',');
        sb.append("origCode");
        sb.append('=');
        sb.append(((this.origCode == null)?"<null>":this.origCode));
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
        result = ((result* 31)+((this.serviceDate == null)? 0 :this.serviceDate.hashCode()));
        result = ((result* 31)+((this.svamstdDicdCode == null)? 0 :this.svamstdDicdCode.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.origCode == null)? 0 :this.origCode.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.svvasstNoncreditServiceInd == null)? 0 :this.svvasstNoncreditServiceInd.hashCode()));
        result = ((result* 31)+((this.ssgpCode == null)? 0 :this.ssgpCode.hashCode()));
        result = ((result* 31)+((this.svamstdTermCode == null)? 0 :this.svamstdTermCode.hashCode()));
        result = ((result* 31)+((this.dataOrigin == null)? 0 :this.dataOrigin.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ssstCode == null)? 0 :this.ssstCode.hashCode()));
        result = ((result* 31)+((this.asstCode == null)? 0 :this.asstCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CaMisSuccessAndSupportServicesTermDataAssessment100QapiPost) == false) {
            return false;
        }
        CaMisSuccessAndSupportServicesTermDataAssessment100QapiPost rhs = ((CaMisSuccessAndSupportServicesTermDataAssessment100QapiPost) other);
        return ((((((((((((((this.serviceDate == rhs.serviceDate)||((this.serviceDate!= null)&&this.serviceDate.equals(rhs.serviceDate)))&&((this.svamstdDicdCode == rhs.svamstdDicdCode)||((this.svamstdDicdCode!= null)&&this.svamstdDicdCode.equals(rhs.svamstdDicdCode))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.origCode == rhs.origCode)||((this.origCode!= null)&&this.origCode.equals(rhs.origCode))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.svvasstNoncreditServiceInd == rhs.svvasstNoncreditServiceInd)||((this.svvasstNoncreditServiceInd!= null)&&this.svvasstNoncreditServiceInd.equals(rhs.svvasstNoncreditServiceInd))))&&((this.ssgpCode == rhs.ssgpCode)||((this.ssgpCode!= null)&&this.ssgpCode.equals(rhs.ssgpCode))))&&((this.svamstdTermCode == rhs.svamstdTermCode)||((this.svamstdTermCode!= null)&&this.svamstdTermCode.equals(rhs.svamstdTermCode))))&&((this.dataOrigin == rhs.dataOrigin)||((this.dataOrigin!= null)&&this.dataOrigin.equals(rhs.dataOrigin))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ssstCode == rhs.ssstCode)||((this.ssstCode!= null)&&this.ssstCode.equals(rhs.ssstCode))))&&((this.asstCode == rhs.asstCode)||((this.asstCode!= null)&&this.asstCode.equals(rhs.asstCode))));
    }

}
