
package com.ellucian.generated.bpapi.ban.ca_mis_success_and_support_services_term_data_education_plan.v1_0_0;

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
    "epstCode",
    "duplOverrideInd",
    "serviceDate",
    "ssgpCode",
    "dataOrigin",
    "origCode",
    "activityDate",
    "userId"
})
@Generated("jsonschema2pojo")
public class CaMisSuccessAndSupportServicesTermDataEducationPlan100QapiPost {

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
     * Education Plan
     * <p>
     * Lineage reference object : SVREDPL_EPST_CODE
     * 
     */
    @JsonProperty("epstCode")
    @JsonPropertyDescription("Lineage reference object : SVREDPL_EPST_CODE")
    private String epstCode;
    /**
     * Lineage reference object : SVREDPL_DUPL_OVERRIDE_IND
     * 
     */
    @JsonProperty("duplOverrideInd")
    @JsonPropertyDescription("Lineage reference object : SVREDPL_DUPL_OVERRIDE_IND")
    private String duplOverrideInd;
    /**
     * Service Date
     * <p>
     * Lineage reference object : SVREDPL_SERVICE_DATE
     * 
     */
    @JsonProperty("serviceDate")
    @JsonPropertyDescription("Lineage reference object : SVREDPL_SERVICE_DATE")
    private Date serviceDate;
    /**
     * Group
     * <p>
     * Lineage reference object : SVREDPL_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("ssgpCode")
    @JsonPropertyDescription("Lineage reference object : SVREDPL_SSGP_CODE, Lookup lineage reference object : stvssgp")
    private String ssgpCode;
    /**
     * Source
     * <p>
     * Lineage reference object : SVREDPL_DATA_ORIGIN
     * 
     */
    @JsonProperty("dataOrigin")
    @JsonPropertyDescription("Lineage reference object : SVREDPL_DATA_ORIGIN")
    private String dataOrigin;
    /**
     * Provider Origin
     * <p>
     * Lineage reference object : SVREDPL_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("origCode")
    @JsonPropertyDescription("Lineage reference object : SVREDPL_ORIG_CODE, Lookup lineage reference object : stvorig")
    private String origCode;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SVREDPL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SVREDPL_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * User ID
     * <p>
     * Lineage reference object : SVREDPL_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SVREDPL_USER_ID")
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

    public CaMisSuccessAndSupportServicesTermDataEducationPlan100QapiPost withId(String id) {
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

    public CaMisSuccessAndSupportServicesTermDataEducationPlan100QapiPost withSvamstdTermCode(String svamstdTermCode) {
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

    public CaMisSuccessAndSupportServicesTermDataEducationPlan100QapiPost withSvamstdDicdCode(String svamstdDicdCode) {
        this.svamstdDicdCode = svamstdDicdCode;
        return this;
    }

    /**
     * Education Plan
     * <p>
     * Lineage reference object : SVREDPL_EPST_CODE
     * 
     */
    @JsonProperty("epstCode")
    public String getEpstCode() {
        return epstCode;
    }

    /**
     * Education Plan
     * <p>
     * Lineage reference object : SVREDPL_EPST_CODE
     * 
     */
    @JsonProperty("epstCode")
    public void setEpstCode(String epstCode) {
        this.epstCode = epstCode;
    }

    public CaMisSuccessAndSupportServicesTermDataEducationPlan100QapiPost withEpstCode(String epstCode) {
        this.epstCode = epstCode;
        return this;
    }

    /**
     * Lineage reference object : SVREDPL_DUPL_OVERRIDE_IND
     * 
     */
    @JsonProperty("duplOverrideInd")
    public String getDuplOverrideInd() {
        return duplOverrideInd;
    }

    /**
     * Lineage reference object : SVREDPL_DUPL_OVERRIDE_IND
     * 
     */
    @JsonProperty("duplOverrideInd")
    public void setDuplOverrideInd(String duplOverrideInd) {
        this.duplOverrideInd = duplOverrideInd;
    }

    public CaMisSuccessAndSupportServicesTermDataEducationPlan100QapiPost withDuplOverrideInd(String duplOverrideInd) {
        this.duplOverrideInd = duplOverrideInd;
        return this;
    }

    /**
     * Service Date
     * <p>
     * Lineage reference object : SVREDPL_SERVICE_DATE
     * 
     */
    @JsonProperty("serviceDate")
    public Date getServiceDate() {
        return serviceDate;
    }

    /**
     * Service Date
     * <p>
     * Lineage reference object : SVREDPL_SERVICE_DATE
     * 
     */
    @JsonProperty("serviceDate")
    public void setServiceDate(Date serviceDate) {
        this.serviceDate = serviceDate;
    }

    public CaMisSuccessAndSupportServicesTermDataEducationPlan100QapiPost withServiceDate(Date serviceDate) {
        this.serviceDate = serviceDate;
        return this;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : SVREDPL_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("ssgpCode")
    public String getSsgpCode() {
        return ssgpCode;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : SVREDPL_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("ssgpCode")
    public void setSsgpCode(String ssgpCode) {
        this.ssgpCode = ssgpCode;
    }

    public CaMisSuccessAndSupportServicesTermDataEducationPlan100QapiPost withSsgpCode(String ssgpCode) {
        this.ssgpCode = ssgpCode;
        return this;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : SVREDPL_DATA_ORIGIN
     * 
     */
    @JsonProperty("dataOrigin")
    public String getDataOrigin() {
        return dataOrigin;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : SVREDPL_DATA_ORIGIN
     * 
     */
    @JsonProperty("dataOrigin")
    public void setDataOrigin(String dataOrigin) {
        this.dataOrigin = dataOrigin;
    }

    public CaMisSuccessAndSupportServicesTermDataEducationPlan100QapiPost withDataOrigin(String dataOrigin) {
        this.dataOrigin = dataOrigin;
        return this;
    }

    /**
     * Provider Origin
     * <p>
     * Lineage reference object : SVREDPL_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("origCode")
    public String getOrigCode() {
        return origCode;
    }

    /**
     * Provider Origin
     * <p>
     * Lineage reference object : SVREDPL_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("origCode")
    public void setOrigCode(String origCode) {
        this.origCode = origCode;
    }

    public CaMisSuccessAndSupportServicesTermDataEducationPlan100QapiPost withOrigCode(String origCode) {
        this.origCode = origCode;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SVREDPL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SVREDPL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public CaMisSuccessAndSupportServicesTermDataEducationPlan100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SVREDPL_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SVREDPL_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public CaMisSuccessAndSupportServicesTermDataEducationPlan100QapiPost withUserId(String userId) {
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

    public CaMisSuccessAndSupportServicesTermDataEducationPlan100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CaMisSuccessAndSupportServicesTermDataEducationPlan100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("epstCode");
        sb.append('=');
        sb.append(((this.epstCode == null)?"<null>":this.epstCode));
        sb.append(',');
        sb.append("duplOverrideInd");
        sb.append('=');
        sb.append(((this.duplOverrideInd == null)?"<null>":this.duplOverrideInd));
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
        result = ((result* 31)+((this.epstCode == null)? 0 :this.epstCode.hashCode()));
        result = ((result* 31)+((this.duplOverrideInd == null)? 0 :this.duplOverrideInd.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.origCode == null)? 0 :this.origCode.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.ssgpCode == null)? 0 :this.ssgpCode.hashCode()));
        result = ((result* 31)+((this.svamstdTermCode == null)? 0 :this.svamstdTermCode.hashCode()));
        result = ((result* 31)+((this.dataOrigin == null)? 0 :this.dataOrigin.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CaMisSuccessAndSupportServicesTermDataEducationPlan100QapiPost) == false) {
            return false;
        }
        CaMisSuccessAndSupportServicesTermDataEducationPlan100QapiPost rhs = ((CaMisSuccessAndSupportServicesTermDataEducationPlan100QapiPost) other);
        return (((((((((((((this.serviceDate == rhs.serviceDate)||((this.serviceDate!= null)&&this.serviceDate.equals(rhs.serviceDate)))&&((this.svamstdDicdCode == rhs.svamstdDicdCode)||((this.svamstdDicdCode!= null)&&this.svamstdDicdCode.equals(rhs.svamstdDicdCode))))&&((this.epstCode == rhs.epstCode)||((this.epstCode!= null)&&this.epstCode.equals(rhs.epstCode))))&&((this.duplOverrideInd == rhs.duplOverrideInd)||((this.duplOverrideInd!= null)&&this.duplOverrideInd.equals(rhs.duplOverrideInd))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.origCode == rhs.origCode)||((this.origCode!= null)&&this.origCode.equals(rhs.origCode))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.ssgpCode == rhs.ssgpCode)||((this.ssgpCode!= null)&&this.ssgpCode.equals(rhs.ssgpCode))))&&((this.svamstdTermCode == rhs.svamstdTermCode)||((this.svamstdTermCode!= null)&&this.svamstdTermCode.equals(rhs.svamstdTermCode))))&&((this.dataOrigin == rhs.dataOrigin)||((this.dataOrigin!= null)&&this.dataOrigin.equals(rhs.dataOrigin))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
