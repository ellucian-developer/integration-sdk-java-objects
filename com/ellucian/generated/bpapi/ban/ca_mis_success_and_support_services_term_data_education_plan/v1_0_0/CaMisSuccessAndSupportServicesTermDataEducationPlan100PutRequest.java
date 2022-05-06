
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
    "criteria.serviceDate",
    "criteria.origCode",
    "criteria.activityDate",
    "criteria.userId",
    "serviceDate",
    "svamstdDicdCode",
    "criteria.epstCode",
    "duplOverrideInd",
    "origCode",
    "ssgpCode",
    "name",
    "svamstdTermCode",
    "criteria.ssgpCode",
    "id",
    "svredplId",
    "criteria.dataOrigin",
    "criteria.duplOverrideInd",
    "svredplEpstCode"
})
@Generated("jsonschema2pojo")
public class CaMisSuccessAndSupportServicesTermDataEducationPlan100PutRequest {

    /**
     * Service Date
     * <p>
     * Lineage reference object : SVREDPL_SERVICE_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.serviceDate")
    @JsonPropertyDescription("Lineage reference object : SVREDPL_SERVICE_DATE")
    private Date criteriaServiceDate;
    /**
     * Provider Origin
     * <p>
     * Lineage reference object : SVREDPL_ORIG_CODE, Lookup lineage reference object : stvorig
     * (Required)
     * 
     */
    @JsonProperty("criteria.origCode")
    @JsonPropertyDescription("Lineage reference object : SVREDPL_ORIG_CODE, Lookup lineage reference object : stvorig")
    private String criteriaOrigCode;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SVREDPL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : SVREDPL_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * User ID
     * <p>
     * Lineage reference object : SVREDPL_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    @JsonPropertyDescription("Lineage reference object : SVREDPL_USER_ID")
    private String criteriaUserId;
    /**
     * Service Date
     * <p>
     * Lineage reference object : SVREDPL_SERVICE_DATE
     * (Required)
     * 
     */
    @JsonProperty("serviceDate")
    @JsonPropertyDescription("Lineage reference object : SVREDPL_SERVICE_DATE")
    private Date serviceDate;
    /**
     * District/College ID
     * <p>
     * Lineage reference object : svamstdDicdCode, Lookup lineage reference object : gtvdicd
     * 
     */
    @JsonProperty("svamstdDicdCode")
    @JsonPropertyDescription("Lineage reference object : svamstdDicdCode, Lookup lineage reference object : gtvdicd")
    private Object svamstdDicdCode;
    /**
     * Education Plan
     * <p>
     * Lineage reference object : SVREDPL_EPST_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.epstCode")
    @JsonPropertyDescription("Lineage reference object : SVREDPL_EPST_CODE")
    private String criteriaEpstCode;
    /**
     * Lineage reference object : SVREDPL_DUPL_OVERRIDE_IND
     * 
     */
    @JsonProperty("duplOverrideInd")
    @JsonPropertyDescription("Lineage reference object : SVREDPL_DUPL_OVERRIDE_IND")
    private String duplOverrideInd;
    /**
     * Provider Origin
     * <p>
     * Lineage reference object : SVREDPL_ORIG_CODE, Lookup lineage reference object : stvorig
     * (Required)
     * 
     */
    @JsonProperty("origCode")
    @JsonPropertyDescription("Lineage reference object : SVREDPL_ORIG_CODE, Lookup lineage reference object : stvorig")
    private String origCode;
    /**
     * Group
     * <p>
     * Lineage reference object : SVREDPL_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("ssgpCode")
    @JsonPropertyDescription("Lineage reference object : SVREDPL_SSGP_CODE, Lookup lineage reference object : stvssgp")
    private String ssgpCode;
    @JsonProperty("name")
    private String name;
    /**
     * Term
     * <p>
     * Lineage reference object : svamstdTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("svamstdTermCode")
    @JsonPropertyDescription("Lineage reference object : svamstdTermCode, Lookup lineage reference object : stvterm")
    private Object svamstdTermCode;
    /**
     * Group
     * <p>
     * Lineage reference object : SVREDPL_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("criteria.ssgpCode")
    @JsonPropertyDescription("Lineage reference object : SVREDPL_SSGP_CODE, Lookup lineage reference object : stvssgp")
    private String criteriaSsgpCode;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
    /**
     * Provider User ID
     * <p>
     * 
     * 
     */
    @JsonProperty("svredplId")
    private String svredplId;
    /**
     * Source
     * <p>
     * Lineage reference object : SVREDPL_DATA_ORIGIN
     * (Required)
     * 
     */
    @JsonProperty("criteria.dataOrigin")
    @JsonPropertyDescription("Lineage reference object : SVREDPL_DATA_ORIGIN")
    private String criteriaDataOrigin;
    /**
     * Lineage reference object : SVREDPL_DUPL_OVERRIDE_IND
     * 
     */
    @JsonProperty("criteria.duplOverrideInd")
    @JsonPropertyDescription("Lineage reference object : SVREDPL_DUPL_OVERRIDE_IND")
    private String criteriaDuplOverrideInd;
    /**
     * Education Plan
     * <p>
     * Lineage reference object : SVREDPL_EPST_CODE
     * (Required)
     * 
     */
    @JsonProperty("svredplEpstCode")
    @JsonPropertyDescription("Lineage reference object : SVREDPL_EPST_CODE")
    private String svredplEpstCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Service Date
     * <p>
     * Lineage reference object : SVREDPL_SERVICE_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.serviceDate")
    public Date getCriteriaServiceDate() {
        return criteriaServiceDate;
    }

    /**
     * Service Date
     * <p>
     * Lineage reference object : SVREDPL_SERVICE_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.serviceDate")
    public void setCriteriaServiceDate(Date criteriaServiceDate) {
        this.criteriaServiceDate = criteriaServiceDate;
    }

    public CaMisSuccessAndSupportServicesTermDataEducationPlan100PutRequest withCriteriaServiceDate(Date criteriaServiceDate) {
        this.criteriaServiceDate = criteriaServiceDate;
        return this;
    }

    /**
     * Provider Origin
     * <p>
     * Lineage reference object : SVREDPL_ORIG_CODE, Lookup lineage reference object : stvorig
     * (Required)
     * 
     */
    @JsonProperty("criteria.origCode")
    public String getCriteriaOrigCode() {
        return criteriaOrigCode;
    }

    /**
     * Provider Origin
     * <p>
     * Lineage reference object : SVREDPL_ORIG_CODE, Lookup lineage reference object : stvorig
     * (Required)
     * 
     */
    @JsonProperty("criteria.origCode")
    public void setCriteriaOrigCode(String criteriaOrigCode) {
        this.criteriaOrigCode = criteriaOrigCode;
    }

    public CaMisSuccessAndSupportServicesTermDataEducationPlan100PutRequest withCriteriaOrigCode(String criteriaOrigCode) {
        this.criteriaOrigCode = criteriaOrigCode;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SVREDPL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SVREDPL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public CaMisSuccessAndSupportServicesTermDataEducationPlan100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SVREDPL_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public String getCriteriaUserId() {
        return criteriaUserId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SVREDPL_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public void setCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
    }

    public CaMisSuccessAndSupportServicesTermDataEducationPlan100PutRequest withCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
        return this;
    }

    /**
     * Service Date
     * <p>
     * Lineage reference object : SVREDPL_SERVICE_DATE
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("serviceDate")
    public void setServiceDate(Date serviceDate) {
        this.serviceDate = serviceDate;
    }

    public CaMisSuccessAndSupportServicesTermDataEducationPlan100PutRequest withServiceDate(Date serviceDate) {
        this.serviceDate = serviceDate;
        return this;
    }

    /**
     * District/College ID
     * <p>
     * Lineage reference object : svamstdDicdCode, Lookup lineage reference object : gtvdicd
     * 
     */
    @JsonProperty("svamstdDicdCode")
    public Object getSvamstdDicdCode() {
        return svamstdDicdCode;
    }

    /**
     * District/College ID
     * <p>
     * Lineage reference object : svamstdDicdCode, Lookup lineage reference object : gtvdicd
     * 
     */
    @JsonProperty("svamstdDicdCode")
    public void setSvamstdDicdCode(Object svamstdDicdCode) {
        this.svamstdDicdCode = svamstdDicdCode;
    }

    public CaMisSuccessAndSupportServicesTermDataEducationPlan100PutRequest withSvamstdDicdCode(Object svamstdDicdCode) {
        this.svamstdDicdCode = svamstdDicdCode;
        return this;
    }

    /**
     * Education Plan
     * <p>
     * Lineage reference object : SVREDPL_EPST_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.epstCode")
    public String getCriteriaEpstCode() {
        return criteriaEpstCode;
    }

    /**
     * Education Plan
     * <p>
     * Lineage reference object : SVREDPL_EPST_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.epstCode")
    public void setCriteriaEpstCode(String criteriaEpstCode) {
        this.criteriaEpstCode = criteriaEpstCode;
    }

    public CaMisSuccessAndSupportServicesTermDataEducationPlan100PutRequest withCriteriaEpstCode(String criteriaEpstCode) {
        this.criteriaEpstCode = criteriaEpstCode;
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

    public CaMisSuccessAndSupportServicesTermDataEducationPlan100PutRequest withDuplOverrideInd(String duplOverrideInd) {
        this.duplOverrideInd = duplOverrideInd;
        return this;
    }

    /**
     * Provider Origin
     * <p>
     * Lineage reference object : SVREDPL_ORIG_CODE, Lookup lineage reference object : stvorig
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("origCode")
    public void setOrigCode(String origCode) {
        this.origCode = origCode;
    }

    public CaMisSuccessAndSupportServicesTermDataEducationPlan100PutRequest withOrigCode(String origCode) {
        this.origCode = origCode;
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

    public CaMisSuccessAndSupportServicesTermDataEducationPlan100PutRequest withSsgpCode(String ssgpCode) {
        this.ssgpCode = ssgpCode;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public CaMisSuccessAndSupportServicesTermDataEducationPlan100PutRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : svamstdTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("svamstdTermCode")
    public Object getSvamstdTermCode() {
        return svamstdTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : svamstdTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("svamstdTermCode")
    public void setSvamstdTermCode(Object svamstdTermCode) {
        this.svamstdTermCode = svamstdTermCode;
    }

    public CaMisSuccessAndSupportServicesTermDataEducationPlan100PutRequest withSvamstdTermCode(Object svamstdTermCode) {
        this.svamstdTermCode = svamstdTermCode;
        return this;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : SVREDPL_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("criteria.ssgpCode")
    public String getCriteriaSsgpCode() {
        return criteriaSsgpCode;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : SVREDPL_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("criteria.ssgpCode")
    public void setCriteriaSsgpCode(String criteriaSsgpCode) {
        this.criteriaSsgpCode = criteriaSsgpCode;
    }

    public CaMisSuccessAndSupportServicesTermDataEducationPlan100PutRequest withCriteriaSsgpCode(String criteriaSsgpCode) {
        this.criteriaSsgpCode = criteriaSsgpCode;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public CaMisSuccessAndSupportServicesTermDataEducationPlan100PutRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Provider User ID
     * <p>
     * 
     * 
     */
    @JsonProperty("svredplId")
    public String getSvredplId() {
        return svredplId;
    }

    /**
     * Provider User ID
     * <p>
     * 
     * 
     */
    @JsonProperty("svredplId")
    public void setSvredplId(String svredplId) {
        this.svredplId = svredplId;
    }

    public CaMisSuccessAndSupportServicesTermDataEducationPlan100PutRequest withSvredplId(String svredplId) {
        this.svredplId = svredplId;
        return this;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : SVREDPL_DATA_ORIGIN
     * (Required)
     * 
     */
    @JsonProperty("criteria.dataOrigin")
    public String getCriteriaDataOrigin() {
        return criteriaDataOrigin;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : SVREDPL_DATA_ORIGIN
     * (Required)
     * 
     */
    @JsonProperty("criteria.dataOrigin")
    public void setCriteriaDataOrigin(String criteriaDataOrigin) {
        this.criteriaDataOrigin = criteriaDataOrigin;
    }

    public CaMisSuccessAndSupportServicesTermDataEducationPlan100PutRequest withCriteriaDataOrigin(String criteriaDataOrigin) {
        this.criteriaDataOrigin = criteriaDataOrigin;
        return this;
    }

    /**
     * Lineage reference object : SVREDPL_DUPL_OVERRIDE_IND
     * 
     */
    @JsonProperty("criteria.duplOverrideInd")
    public String getCriteriaDuplOverrideInd() {
        return criteriaDuplOverrideInd;
    }

    /**
     * Lineage reference object : SVREDPL_DUPL_OVERRIDE_IND
     * 
     */
    @JsonProperty("criteria.duplOverrideInd")
    public void setCriteriaDuplOverrideInd(String criteriaDuplOverrideInd) {
        this.criteriaDuplOverrideInd = criteriaDuplOverrideInd;
    }

    public CaMisSuccessAndSupportServicesTermDataEducationPlan100PutRequest withCriteriaDuplOverrideInd(String criteriaDuplOverrideInd) {
        this.criteriaDuplOverrideInd = criteriaDuplOverrideInd;
        return this;
    }

    /**
     * Education Plan
     * <p>
     * Lineage reference object : SVREDPL_EPST_CODE
     * (Required)
     * 
     */
    @JsonProperty("svredplEpstCode")
    public String getSvredplEpstCode() {
        return svredplEpstCode;
    }

    /**
     * Education Plan
     * <p>
     * Lineage reference object : SVREDPL_EPST_CODE
     * (Required)
     * 
     */
    @JsonProperty("svredplEpstCode")
    public void setSvredplEpstCode(String svredplEpstCode) {
        this.svredplEpstCode = svredplEpstCode;
    }

    public CaMisSuccessAndSupportServicesTermDataEducationPlan100PutRequest withSvredplEpstCode(String svredplEpstCode) {
        this.svredplEpstCode = svredplEpstCode;
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

    public CaMisSuccessAndSupportServicesTermDataEducationPlan100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CaMisSuccessAndSupportServicesTermDataEducationPlan100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaServiceDate");
        sb.append('=');
        sb.append(((this.criteriaServiceDate == null)?"<null>":this.criteriaServiceDate));
        sb.append(',');
        sb.append("criteriaOrigCode");
        sb.append('=');
        sb.append(((this.criteriaOrigCode == null)?"<null>":this.criteriaOrigCode));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("criteriaUserId");
        sb.append('=');
        sb.append(((this.criteriaUserId == null)?"<null>":this.criteriaUserId));
        sb.append(',');
        sb.append("serviceDate");
        sb.append('=');
        sb.append(((this.serviceDate == null)?"<null>":this.serviceDate));
        sb.append(',');
        sb.append("svamstdDicdCode");
        sb.append('=');
        sb.append(((this.svamstdDicdCode == null)?"<null>":this.svamstdDicdCode));
        sb.append(',');
        sb.append("criteriaEpstCode");
        sb.append('=');
        sb.append(((this.criteriaEpstCode == null)?"<null>":this.criteriaEpstCode));
        sb.append(',');
        sb.append("duplOverrideInd");
        sb.append('=');
        sb.append(((this.duplOverrideInd == null)?"<null>":this.duplOverrideInd));
        sb.append(',');
        sb.append("origCode");
        sb.append('=');
        sb.append(((this.origCode == null)?"<null>":this.origCode));
        sb.append(',');
        sb.append("ssgpCode");
        sb.append('=');
        sb.append(((this.ssgpCode == null)?"<null>":this.ssgpCode));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("svamstdTermCode");
        sb.append('=');
        sb.append(((this.svamstdTermCode == null)?"<null>":this.svamstdTermCode));
        sb.append(',');
        sb.append("criteriaSsgpCode");
        sb.append('=');
        sb.append(((this.criteriaSsgpCode == null)?"<null>":this.criteriaSsgpCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("svredplId");
        sb.append('=');
        sb.append(((this.svredplId == null)?"<null>":this.svredplId));
        sb.append(',');
        sb.append("criteriaDataOrigin");
        sb.append('=');
        sb.append(((this.criteriaDataOrigin == null)?"<null>":this.criteriaDataOrigin));
        sb.append(',');
        sb.append("criteriaDuplOverrideInd");
        sb.append('=');
        sb.append(((this.criteriaDuplOverrideInd == null)?"<null>":this.criteriaDuplOverrideInd));
        sb.append(',');
        sb.append("svredplEpstCode");
        sb.append('=');
        sb.append(((this.svredplEpstCode == null)?"<null>":this.svredplEpstCode));
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
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.criteriaEpstCode == null)? 0 :this.criteriaEpstCode.hashCode()));
        result = ((result* 31)+((this.serviceDate == null)? 0 :this.serviceDate.hashCode()));
        result = ((result* 31)+((this.svamstdDicdCode == null)? 0 :this.svamstdDicdCode.hashCode()));
        result = ((result* 31)+((this.criteriaOrigCode == null)? 0 :this.criteriaOrigCode.hashCode()));
        result = ((result* 31)+((this.criteriaDataOrigin == null)? 0 :this.criteriaDataOrigin.hashCode()));
        result = ((result* 31)+((this.criteriaDuplOverrideInd == null)? 0 :this.criteriaDuplOverrideInd.hashCode()));
        result = ((result* 31)+((this.duplOverrideInd == null)? 0 :this.duplOverrideInd.hashCode()));
        result = ((result* 31)+((this.origCode == null)? 0 :this.origCode.hashCode()));
        result = ((result* 31)+((this.criteriaUserId == null)? 0 :this.criteriaUserId.hashCode()));
        result = ((result* 31)+((this.criteriaServiceDate == null)? 0 :this.criteriaServiceDate.hashCode()));
        result = ((result* 31)+((this.ssgpCode == null)? 0 :this.ssgpCode.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.svamstdTermCode == null)? 0 :this.svamstdTermCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.svredplId == null)? 0 :this.svredplId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaSsgpCode == null)? 0 :this.criteriaSsgpCode.hashCode()));
        result = ((result* 31)+((this.svredplEpstCode == null)? 0 :this.svredplEpstCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CaMisSuccessAndSupportServicesTermDataEducationPlan100PutRequest) == false) {
            return false;
        }
        CaMisSuccessAndSupportServicesTermDataEducationPlan100PutRequest rhs = ((CaMisSuccessAndSupportServicesTermDataEducationPlan100PutRequest) other);
        return ((((((((((((((((((((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate)))&&((this.criteriaEpstCode == rhs.criteriaEpstCode)||((this.criteriaEpstCode!= null)&&this.criteriaEpstCode.equals(rhs.criteriaEpstCode))))&&((this.serviceDate == rhs.serviceDate)||((this.serviceDate!= null)&&this.serviceDate.equals(rhs.serviceDate))))&&((this.svamstdDicdCode == rhs.svamstdDicdCode)||((this.svamstdDicdCode!= null)&&this.svamstdDicdCode.equals(rhs.svamstdDicdCode))))&&((this.criteriaOrigCode == rhs.criteriaOrigCode)||((this.criteriaOrigCode!= null)&&this.criteriaOrigCode.equals(rhs.criteriaOrigCode))))&&((this.criteriaDataOrigin == rhs.criteriaDataOrigin)||((this.criteriaDataOrigin!= null)&&this.criteriaDataOrigin.equals(rhs.criteriaDataOrigin))))&&((this.criteriaDuplOverrideInd == rhs.criteriaDuplOverrideInd)||((this.criteriaDuplOverrideInd!= null)&&this.criteriaDuplOverrideInd.equals(rhs.criteriaDuplOverrideInd))))&&((this.duplOverrideInd == rhs.duplOverrideInd)||((this.duplOverrideInd!= null)&&this.duplOverrideInd.equals(rhs.duplOverrideInd))))&&((this.origCode == rhs.origCode)||((this.origCode!= null)&&this.origCode.equals(rhs.origCode))))&&((this.criteriaUserId == rhs.criteriaUserId)||((this.criteriaUserId!= null)&&this.criteriaUserId.equals(rhs.criteriaUserId))))&&((this.criteriaServiceDate == rhs.criteriaServiceDate)||((this.criteriaServiceDate!= null)&&this.criteriaServiceDate.equals(rhs.criteriaServiceDate))))&&((this.ssgpCode == rhs.ssgpCode)||((this.ssgpCode!= null)&&this.ssgpCode.equals(rhs.ssgpCode))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.svamstdTermCode == rhs.svamstdTermCode)||((this.svamstdTermCode!= null)&&this.svamstdTermCode.equals(rhs.svamstdTermCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.svredplId == rhs.svredplId)||((this.svredplId!= null)&&this.svredplId.equals(rhs.svredplId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaSsgpCode == rhs.criteriaSsgpCode)||((this.criteriaSsgpCode!= null)&&this.criteriaSsgpCode.equals(rhs.criteriaSsgpCode))))&&((this.svredplEpstCode == rhs.svredplEpstCode)||((this.svredplEpstCode!= null)&&this.svredplEpstCode.equals(rhs.svredplEpstCode))));
    }

}
