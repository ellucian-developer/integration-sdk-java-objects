
package com.ellucian.generated.bpapi.ban.ca_mis_success_and_support_services_term_data_counsel_advise.v1_0_0;

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
    "costCode",
    "ssstCode",
    "svvcostNoncreditServiceInd",
    "serviceDate",
    "ssgpCode",
    "spridenId",
    "dataOrigin",
    "origCode",
    "activityDate",
    "userId"
})
@Generated("jsonschema2pojo")
public class CaMisSuccessAndSupportServicesTermDataCounselAdvise100QapiPost {

    @JsonProperty("id")
    private String id;
    @JsonProperty("svamstdTermCode")
    private String svamstdTermCode;
    @JsonProperty("svamstdDicdCode")
    private String svamstdDicdCode;
    /**
     * Counsel/Advise
     * <p>
     * Lineage reference object : SVRCNAD_COST_CODE, Lookup lineage reference object : svvcost
     * 
     */
    @JsonProperty("costCode")
    @JsonPropertyDescription("Lineage reference object : SVRCNAD_COST_CODE, Lookup lineage reference object : svvcost")
    private String costCode;
    /**
     * Status
     * <p>
     * Lineage reference object : SVRCNAD_SSST_CODE, Lookup lineage reference object : stvssst
     * 
     */
    @JsonProperty("ssstCode")
    @JsonPropertyDescription("Lineage reference object : SVRCNAD_SSST_CODE, Lookup lineage reference object : stvssst")
    private String ssstCode;
    /**
     * Lineage reference object : SVVCOST_NONCREDIT_SERVICE_IND
     * 
     */
    @JsonProperty("svvcostNoncreditServiceInd")
    @JsonPropertyDescription("Lineage reference object : SVVCOST_NONCREDIT_SERVICE_IND")
    private String svvcostNoncreditServiceInd;
    /**
     * Service Date
     * <p>
     * Lineage reference object : SVRCNAD_SERVICE_DATE
     * 
     */
    @JsonProperty("serviceDate")
    @JsonPropertyDescription("Lineage reference object : SVRCNAD_SERVICE_DATE")
    private Date serviceDate;
    /**
     * Group
     * <p>
     * Lineage reference object : SVRCNAD_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("ssgpCode")
    @JsonPropertyDescription("Lineage reference object : SVRCNAD_SSGP_CODE, Lookup lineage reference object : stvssgp")
    private String ssgpCode;
    /**
     * Provider User ID
     * <p>
     * 
     * 
     */
    @JsonProperty("spridenId")
    private String spridenId;
    /**
     * Source
     * <p>
     * Lineage reference object : SVRCNAD_DATA_ORIGIN
     * 
     */
    @JsonProperty("dataOrigin")
    @JsonPropertyDescription("Lineage reference object : SVRCNAD_DATA_ORIGIN")
    private String dataOrigin;
    /**
     * Provider Origin
     * <p>
     * Lineage reference object : SVRCNAD_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("origCode")
    @JsonPropertyDescription("Lineage reference object : SVRCNAD_ORIG_CODE, Lookup lineage reference object : stvorig")
    private String origCode;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SVRCNAD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SVRCNAD_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * User ID
     * <p>
     * Lineage reference object : SVRCNAD_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SVRCNAD_USER_ID")
    private String userId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public CaMisSuccessAndSupportServicesTermDataCounselAdvise100QapiPost withId(String id) {
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

    public CaMisSuccessAndSupportServicesTermDataCounselAdvise100QapiPost withSvamstdTermCode(String svamstdTermCode) {
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

    public CaMisSuccessAndSupportServicesTermDataCounselAdvise100QapiPost withSvamstdDicdCode(String svamstdDicdCode) {
        this.svamstdDicdCode = svamstdDicdCode;
        return this;
    }

    /**
     * Counsel/Advise
     * <p>
     * Lineage reference object : SVRCNAD_COST_CODE, Lookup lineage reference object : svvcost
     * 
     */
    @JsonProperty("costCode")
    public String getCostCode() {
        return costCode;
    }

    /**
     * Counsel/Advise
     * <p>
     * Lineage reference object : SVRCNAD_COST_CODE, Lookup lineage reference object : svvcost
     * 
     */
    @JsonProperty("costCode")
    public void setCostCode(String costCode) {
        this.costCode = costCode;
    }

    public CaMisSuccessAndSupportServicesTermDataCounselAdvise100QapiPost withCostCode(String costCode) {
        this.costCode = costCode;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SVRCNAD_SSST_CODE, Lookup lineage reference object : stvssst
     * 
     */
    @JsonProperty("ssstCode")
    public String getSsstCode() {
        return ssstCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SVRCNAD_SSST_CODE, Lookup lineage reference object : stvssst
     * 
     */
    @JsonProperty("ssstCode")
    public void setSsstCode(String ssstCode) {
        this.ssstCode = ssstCode;
    }

    public CaMisSuccessAndSupportServicesTermDataCounselAdvise100QapiPost withSsstCode(String ssstCode) {
        this.ssstCode = ssstCode;
        return this;
    }

    /**
     * Lineage reference object : SVVCOST_NONCREDIT_SERVICE_IND
     * 
     */
    @JsonProperty("svvcostNoncreditServiceInd")
    public String getSvvcostNoncreditServiceInd() {
        return svvcostNoncreditServiceInd;
    }

    /**
     * Lineage reference object : SVVCOST_NONCREDIT_SERVICE_IND
     * 
     */
    @JsonProperty("svvcostNoncreditServiceInd")
    public void setSvvcostNoncreditServiceInd(String svvcostNoncreditServiceInd) {
        this.svvcostNoncreditServiceInd = svvcostNoncreditServiceInd;
    }

    public CaMisSuccessAndSupportServicesTermDataCounselAdvise100QapiPost withSvvcostNoncreditServiceInd(String svvcostNoncreditServiceInd) {
        this.svvcostNoncreditServiceInd = svvcostNoncreditServiceInd;
        return this;
    }

    /**
     * Service Date
     * <p>
     * Lineage reference object : SVRCNAD_SERVICE_DATE
     * 
     */
    @JsonProperty("serviceDate")
    public Date getServiceDate() {
        return serviceDate;
    }

    /**
     * Service Date
     * <p>
     * Lineage reference object : SVRCNAD_SERVICE_DATE
     * 
     */
    @JsonProperty("serviceDate")
    public void setServiceDate(Date serviceDate) {
        this.serviceDate = serviceDate;
    }

    public CaMisSuccessAndSupportServicesTermDataCounselAdvise100QapiPost withServiceDate(Date serviceDate) {
        this.serviceDate = serviceDate;
        return this;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : SVRCNAD_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("ssgpCode")
    public String getSsgpCode() {
        return ssgpCode;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : SVRCNAD_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("ssgpCode")
    public void setSsgpCode(String ssgpCode) {
        this.ssgpCode = ssgpCode;
    }

    public CaMisSuccessAndSupportServicesTermDataCounselAdvise100QapiPost withSsgpCode(String ssgpCode) {
        this.ssgpCode = ssgpCode;
        return this;
    }

    /**
     * Provider User ID
     * <p>
     * 
     * 
     */
    @JsonProperty("spridenId")
    public String getSpridenId() {
        return spridenId;
    }

    /**
     * Provider User ID
     * <p>
     * 
     * 
     */
    @JsonProperty("spridenId")
    public void setSpridenId(String spridenId) {
        this.spridenId = spridenId;
    }

    public CaMisSuccessAndSupportServicesTermDataCounselAdvise100QapiPost withSpridenId(String spridenId) {
        this.spridenId = spridenId;
        return this;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : SVRCNAD_DATA_ORIGIN
     * 
     */
    @JsonProperty("dataOrigin")
    public String getDataOrigin() {
        return dataOrigin;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : SVRCNAD_DATA_ORIGIN
     * 
     */
    @JsonProperty("dataOrigin")
    public void setDataOrigin(String dataOrigin) {
        this.dataOrigin = dataOrigin;
    }

    public CaMisSuccessAndSupportServicesTermDataCounselAdvise100QapiPost withDataOrigin(String dataOrigin) {
        this.dataOrigin = dataOrigin;
        return this;
    }

    /**
     * Provider Origin
     * <p>
     * Lineage reference object : SVRCNAD_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("origCode")
    public String getOrigCode() {
        return origCode;
    }

    /**
     * Provider Origin
     * <p>
     * Lineage reference object : SVRCNAD_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("origCode")
    public void setOrigCode(String origCode) {
        this.origCode = origCode;
    }

    public CaMisSuccessAndSupportServicesTermDataCounselAdvise100QapiPost withOrigCode(String origCode) {
        this.origCode = origCode;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SVRCNAD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SVRCNAD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public CaMisSuccessAndSupportServicesTermDataCounselAdvise100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SVRCNAD_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SVRCNAD_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public CaMisSuccessAndSupportServicesTermDataCounselAdvise100QapiPost withUserId(String userId) {
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

    public CaMisSuccessAndSupportServicesTermDataCounselAdvise100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CaMisSuccessAndSupportServicesTermDataCounselAdvise100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("costCode");
        sb.append('=');
        sb.append(((this.costCode == null)?"<null>":this.costCode));
        sb.append(',');
        sb.append("ssstCode");
        sb.append('=');
        sb.append(((this.ssstCode == null)?"<null>":this.ssstCode));
        sb.append(',');
        sb.append("svvcostNoncreditServiceInd");
        sb.append('=');
        sb.append(((this.svvcostNoncreditServiceInd == null)?"<null>":this.svvcostNoncreditServiceInd));
        sb.append(',');
        sb.append("serviceDate");
        sb.append('=');
        sb.append(((this.serviceDate == null)?"<null>":this.serviceDate));
        sb.append(',');
        sb.append("ssgpCode");
        sb.append('=');
        sb.append(((this.ssgpCode == null)?"<null>":this.ssgpCode));
        sb.append(',');
        sb.append("spridenId");
        sb.append('=');
        sb.append(((this.spridenId == null)?"<null>":this.spridenId));
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
        result = ((result* 31)+((this.spridenId == null)? 0 :this.spridenId.hashCode()));
        result = ((result* 31)+((this.costCode == null)? 0 :this.costCode.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.ssgpCode == null)? 0 :this.ssgpCode.hashCode()));
        result = ((result* 31)+((this.svvcostNoncreditServiceInd == null)? 0 :this.svvcostNoncreditServiceInd.hashCode()));
        result = ((result* 31)+((this.svamstdTermCode == null)? 0 :this.svamstdTermCode.hashCode()));
        result = ((result* 31)+((this.dataOrigin == null)? 0 :this.dataOrigin.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ssstCode == null)? 0 :this.ssstCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CaMisSuccessAndSupportServicesTermDataCounselAdvise100QapiPost) == false) {
            return false;
        }
        CaMisSuccessAndSupportServicesTermDataCounselAdvise100QapiPost rhs = ((CaMisSuccessAndSupportServicesTermDataCounselAdvise100QapiPost) other);
        return (((((((((((((((this.serviceDate == rhs.serviceDate)||((this.serviceDate!= null)&&this.serviceDate.equals(rhs.serviceDate)))&&((this.svamstdDicdCode == rhs.svamstdDicdCode)||((this.svamstdDicdCode!= null)&&this.svamstdDicdCode.equals(rhs.svamstdDicdCode))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.origCode == rhs.origCode)||((this.origCode!= null)&&this.origCode.equals(rhs.origCode))))&&((this.spridenId == rhs.spridenId)||((this.spridenId!= null)&&this.spridenId.equals(rhs.spridenId))))&&((this.costCode == rhs.costCode)||((this.costCode!= null)&&this.costCode.equals(rhs.costCode))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.ssgpCode == rhs.ssgpCode)||((this.ssgpCode!= null)&&this.ssgpCode.equals(rhs.ssgpCode))))&&((this.svvcostNoncreditServiceInd == rhs.svvcostNoncreditServiceInd)||((this.svvcostNoncreditServiceInd!= null)&&this.svvcostNoncreditServiceInd.equals(rhs.svvcostNoncreditServiceInd))))&&((this.svamstdTermCode == rhs.svamstdTermCode)||((this.svamstdTermCode!= null)&&this.svamstdTermCode.equals(rhs.svamstdTermCode))))&&((this.dataOrigin == rhs.dataOrigin)||((this.dataOrigin!= null)&&this.dataOrigin.equals(rhs.dataOrigin))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ssstCode == rhs.ssstCode)||((this.ssstCode!= null)&&this.ssstCode.equals(rhs.ssstCode))));
    }

}
