
package com.ellucian.generated.bpapi.ban.ca_mis_success_and_support_services_term_data_orientation.v1_0_0;

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
    "criteria.svvosstNoncreditServiceInd",
    "svrorntId",
    "criteria.serviceDate",
    "criteria.origCode",
    "criteria.activityDate",
    "criteria.userId",
    "serviceDate",
    "svamstdDicdCode",
    "criteria.osstCode",
    "criteria.ssstCode",
    "origCode",
    "ssgpCode",
    "name",
    "svamstdTermCode",
    "criteria.ssgpCode",
    "id",
    "criteria.dataOrigin",
    "osstCode",
    "ssstCode"
})
@Generated("jsonschema2pojo")
public class CaMisSuccessAndSupportServicesTermDataOrientation100PutRequest {

    /**
     * Lineage reference object : SVVOSST_NONCREDIT_SERVICE_IND
     * 
     */
    @JsonProperty("criteria.svvosstNoncreditServiceInd")
    @JsonPropertyDescription("Lineage reference object : SVVOSST_NONCREDIT_SERVICE_IND")
    private String criteriaSvvosstNoncreditServiceInd;
    /**
     * Provider User ID
     * <p>
     * 
     * 
     */
    @JsonProperty("svrorntId")
    private String svrorntId;
    /**
     * Service Date
     * <p>
     * Lineage reference object : SVRORNT_SERVICE_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.serviceDate")
    @JsonPropertyDescription("Lineage reference object : SVRORNT_SERVICE_DATE")
    private Date criteriaServiceDate;
    /**
     * Provider Origin
     * <p>
     * Lineage reference object : SVRORNT_ORIG_CODE, Lookup lineage reference object : stvorig
     * (Required)
     * 
     */
    @JsonProperty("criteria.origCode")
    @JsonPropertyDescription("Lineage reference object : SVRORNT_ORIG_CODE, Lookup lineage reference object : stvorig")
    private String criteriaOrigCode;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SVRORNT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : SVRORNT_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * User ID
     * <p>
     * Lineage reference object : SVRORNT_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    @JsonPropertyDescription("Lineage reference object : SVRORNT_USER_ID")
    private String criteriaUserId;
    /**
     * Service Date
     * <p>
     * Lineage reference object : SVRORNT_SERVICE_DATE
     * (Required)
     * 
     */
    @JsonProperty("serviceDate")
    @JsonPropertyDescription("Lineage reference object : SVRORNT_SERVICE_DATE")
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
     * Orientation Service
     * <p>
     * Lineage reference object : SVRORNT_OSST_CODE, Lookup lineage reference object : svvosst
     * (Required)
     * 
     */
    @JsonProperty("criteria.osstCode")
    @JsonPropertyDescription("Lineage reference object : SVRORNT_OSST_CODE, Lookup lineage reference object : svvosst")
    private String criteriaOsstCode;
    /**
     * Status
     * <p>
     * Lineage reference object : SVRORNT_SSST_CODE, Lookup lineage reference object : stvssst
     * 
     */
    @JsonProperty("criteria.ssstCode")
    @JsonPropertyDescription("Lineage reference object : SVRORNT_SSST_CODE, Lookup lineage reference object : stvssst")
    private String criteriaSsstCode;
    /**
     * Provider Origin
     * <p>
     * Lineage reference object : SVRORNT_ORIG_CODE, Lookup lineage reference object : stvorig
     * (Required)
     * 
     */
    @JsonProperty("origCode")
    @JsonPropertyDescription("Lineage reference object : SVRORNT_ORIG_CODE, Lookup lineage reference object : stvorig")
    private String origCode;
    /**
     * Group
     * <p>
     * Lineage reference object : SVRORNT_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("ssgpCode")
    @JsonPropertyDescription("Lineage reference object : SVRORNT_SSGP_CODE, Lookup lineage reference object : stvssgp")
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
     * Lineage reference object : SVRORNT_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("criteria.ssgpCode")
    @JsonPropertyDescription("Lineage reference object : SVRORNT_SSGP_CODE, Lookup lineage reference object : stvssgp")
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
     * Source
     * <p>
     * Lineage reference object : SVRORNT_DATA_ORIGIN
     * (Required)
     * 
     */
    @JsonProperty("criteria.dataOrigin")
    @JsonPropertyDescription("Lineage reference object : SVRORNT_DATA_ORIGIN")
    private String criteriaDataOrigin;
    /**
     * Orientation Service
     * <p>
     * Lineage reference object : SVRORNT_OSST_CODE, Lookup lineage reference object : svvosst
     * (Required)
     * 
     */
    @JsonProperty("osstCode")
    @JsonPropertyDescription("Lineage reference object : SVRORNT_OSST_CODE, Lookup lineage reference object : svvosst")
    private String osstCode;
    /**
     * Status
     * <p>
     * Lineage reference object : SVRORNT_SSST_CODE, Lookup lineage reference object : stvssst
     * 
     */
    @JsonProperty("ssstCode")
    @JsonPropertyDescription("Lineage reference object : SVRORNT_SSST_CODE, Lookup lineage reference object : stvssst")
    private String ssstCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : SVVOSST_NONCREDIT_SERVICE_IND
     * 
     */
    @JsonProperty("criteria.svvosstNoncreditServiceInd")
    public String getCriteriaSvvosstNoncreditServiceInd() {
        return criteriaSvvosstNoncreditServiceInd;
    }

    /**
     * Lineage reference object : SVVOSST_NONCREDIT_SERVICE_IND
     * 
     */
    @JsonProperty("criteria.svvosstNoncreditServiceInd")
    public void setCriteriaSvvosstNoncreditServiceInd(String criteriaSvvosstNoncreditServiceInd) {
        this.criteriaSvvosstNoncreditServiceInd = criteriaSvvosstNoncreditServiceInd;
    }

    public CaMisSuccessAndSupportServicesTermDataOrientation100PutRequest withCriteriaSvvosstNoncreditServiceInd(String criteriaSvvosstNoncreditServiceInd) {
        this.criteriaSvvosstNoncreditServiceInd = criteriaSvvosstNoncreditServiceInd;
        return this;
    }

    /**
     * Provider User ID
     * <p>
     * 
     * 
     */
    @JsonProperty("svrorntId")
    public String getSvrorntId() {
        return svrorntId;
    }

    /**
     * Provider User ID
     * <p>
     * 
     * 
     */
    @JsonProperty("svrorntId")
    public void setSvrorntId(String svrorntId) {
        this.svrorntId = svrorntId;
    }

    public CaMisSuccessAndSupportServicesTermDataOrientation100PutRequest withSvrorntId(String svrorntId) {
        this.svrorntId = svrorntId;
        return this;
    }

    /**
     * Service Date
     * <p>
     * Lineage reference object : SVRORNT_SERVICE_DATE
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
     * Lineage reference object : SVRORNT_SERVICE_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.serviceDate")
    public void setCriteriaServiceDate(Date criteriaServiceDate) {
        this.criteriaServiceDate = criteriaServiceDate;
    }

    public CaMisSuccessAndSupportServicesTermDataOrientation100PutRequest withCriteriaServiceDate(Date criteriaServiceDate) {
        this.criteriaServiceDate = criteriaServiceDate;
        return this;
    }

    /**
     * Provider Origin
     * <p>
     * Lineage reference object : SVRORNT_ORIG_CODE, Lookup lineage reference object : stvorig
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
     * Lineage reference object : SVRORNT_ORIG_CODE, Lookup lineage reference object : stvorig
     * (Required)
     * 
     */
    @JsonProperty("criteria.origCode")
    public void setCriteriaOrigCode(String criteriaOrigCode) {
        this.criteriaOrigCode = criteriaOrigCode;
    }

    public CaMisSuccessAndSupportServicesTermDataOrientation100PutRequest withCriteriaOrigCode(String criteriaOrigCode) {
        this.criteriaOrigCode = criteriaOrigCode;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SVRORNT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SVRORNT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public CaMisSuccessAndSupportServicesTermDataOrientation100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SVRORNT_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public String getCriteriaUserId() {
        return criteriaUserId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SVRORNT_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public void setCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
    }

    public CaMisSuccessAndSupportServicesTermDataOrientation100PutRequest withCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
        return this;
    }

    /**
     * Service Date
     * <p>
     * Lineage reference object : SVRORNT_SERVICE_DATE
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
     * Lineage reference object : SVRORNT_SERVICE_DATE
     * (Required)
     * 
     */
    @JsonProperty("serviceDate")
    public void setServiceDate(Date serviceDate) {
        this.serviceDate = serviceDate;
    }

    public CaMisSuccessAndSupportServicesTermDataOrientation100PutRequest withServiceDate(Date serviceDate) {
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

    public CaMisSuccessAndSupportServicesTermDataOrientation100PutRequest withSvamstdDicdCode(Object svamstdDicdCode) {
        this.svamstdDicdCode = svamstdDicdCode;
        return this;
    }

    /**
     * Orientation Service
     * <p>
     * Lineage reference object : SVRORNT_OSST_CODE, Lookup lineage reference object : svvosst
     * (Required)
     * 
     */
    @JsonProperty("criteria.osstCode")
    public String getCriteriaOsstCode() {
        return criteriaOsstCode;
    }

    /**
     * Orientation Service
     * <p>
     * Lineage reference object : SVRORNT_OSST_CODE, Lookup lineage reference object : svvosst
     * (Required)
     * 
     */
    @JsonProperty("criteria.osstCode")
    public void setCriteriaOsstCode(String criteriaOsstCode) {
        this.criteriaOsstCode = criteriaOsstCode;
    }

    public CaMisSuccessAndSupportServicesTermDataOrientation100PutRequest withCriteriaOsstCode(String criteriaOsstCode) {
        this.criteriaOsstCode = criteriaOsstCode;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SVRORNT_SSST_CODE, Lookup lineage reference object : stvssst
     * 
     */
    @JsonProperty("criteria.ssstCode")
    public String getCriteriaSsstCode() {
        return criteriaSsstCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SVRORNT_SSST_CODE, Lookup lineage reference object : stvssst
     * 
     */
    @JsonProperty("criteria.ssstCode")
    public void setCriteriaSsstCode(String criteriaSsstCode) {
        this.criteriaSsstCode = criteriaSsstCode;
    }

    public CaMisSuccessAndSupportServicesTermDataOrientation100PutRequest withCriteriaSsstCode(String criteriaSsstCode) {
        this.criteriaSsstCode = criteriaSsstCode;
        return this;
    }

    /**
     * Provider Origin
     * <p>
     * Lineage reference object : SVRORNT_ORIG_CODE, Lookup lineage reference object : stvorig
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
     * Lineage reference object : SVRORNT_ORIG_CODE, Lookup lineage reference object : stvorig
     * (Required)
     * 
     */
    @JsonProperty("origCode")
    public void setOrigCode(String origCode) {
        this.origCode = origCode;
    }

    public CaMisSuccessAndSupportServicesTermDataOrientation100PutRequest withOrigCode(String origCode) {
        this.origCode = origCode;
        return this;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : SVRORNT_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("ssgpCode")
    public String getSsgpCode() {
        return ssgpCode;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : SVRORNT_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("ssgpCode")
    public void setSsgpCode(String ssgpCode) {
        this.ssgpCode = ssgpCode;
    }

    public CaMisSuccessAndSupportServicesTermDataOrientation100PutRequest withSsgpCode(String ssgpCode) {
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

    public CaMisSuccessAndSupportServicesTermDataOrientation100PutRequest withName(String name) {
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

    public CaMisSuccessAndSupportServicesTermDataOrientation100PutRequest withSvamstdTermCode(Object svamstdTermCode) {
        this.svamstdTermCode = svamstdTermCode;
        return this;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : SVRORNT_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("criteria.ssgpCode")
    public String getCriteriaSsgpCode() {
        return criteriaSsgpCode;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : SVRORNT_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("criteria.ssgpCode")
    public void setCriteriaSsgpCode(String criteriaSsgpCode) {
        this.criteriaSsgpCode = criteriaSsgpCode;
    }

    public CaMisSuccessAndSupportServicesTermDataOrientation100PutRequest withCriteriaSsgpCode(String criteriaSsgpCode) {
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

    public CaMisSuccessAndSupportServicesTermDataOrientation100PutRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : SVRORNT_DATA_ORIGIN
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
     * Lineage reference object : SVRORNT_DATA_ORIGIN
     * (Required)
     * 
     */
    @JsonProperty("criteria.dataOrigin")
    public void setCriteriaDataOrigin(String criteriaDataOrigin) {
        this.criteriaDataOrigin = criteriaDataOrigin;
    }

    public CaMisSuccessAndSupportServicesTermDataOrientation100PutRequest withCriteriaDataOrigin(String criteriaDataOrigin) {
        this.criteriaDataOrigin = criteriaDataOrigin;
        return this;
    }

    /**
     * Orientation Service
     * <p>
     * Lineage reference object : SVRORNT_OSST_CODE, Lookup lineage reference object : svvosst
     * (Required)
     * 
     */
    @JsonProperty("osstCode")
    public String getOsstCode() {
        return osstCode;
    }

    /**
     * Orientation Service
     * <p>
     * Lineage reference object : SVRORNT_OSST_CODE, Lookup lineage reference object : svvosst
     * (Required)
     * 
     */
    @JsonProperty("osstCode")
    public void setOsstCode(String osstCode) {
        this.osstCode = osstCode;
    }

    public CaMisSuccessAndSupportServicesTermDataOrientation100PutRequest withOsstCode(String osstCode) {
        this.osstCode = osstCode;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SVRORNT_SSST_CODE, Lookup lineage reference object : stvssst
     * 
     */
    @JsonProperty("ssstCode")
    public String getSsstCode() {
        return ssstCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SVRORNT_SSST_CODE, Lookup lineage reference object : stvssst
     * 
     */
    @JsonProperty("ssstCode")
    public void setSsstCode(String ssstCode) {
        this.ssstCode = ssstCode;
    }

    public CaMisSuccessAndSupportServicesTermDataOrientation100PutRequest withSsstCode(String ssstCode) {
        this.ssstCode = ssstCode;
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

    public CaMisSuccessAndSupportServicesTermDataOrientation100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CaMisSuccessAndSupportServicesTermDataOrientation100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaSvvosstNoncreditServiceInd");
        sb.append('=');
        sb.append(((this.criteriaSvvosstNoncreditServiceInd == null)?"<null>":this.criteriaSvvosstNoncreditServiceInd));
        sb.append(',');
        sb.append("svrorntId");
        sb.append('=');
        sb.append(((this.svrorntId == null)?"<null>":this.svrorntId));
        sb.append(',');
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
        sb.append("criteriaOsstCode");
        sb.append('=');
        sb.append(((this.criteriaOsstCode == null)?"<null>":this.criteriaOsstCode));
        sb.append(',');
        sb.append("criteriaSsstCode");
        sb.append('=');
        sb.append(((this.criteriaSsstCode == null)?"<null>":this.criteriaSsstCode));
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
        sb.append("criteriaDataOrigin");
        sb.append('=');
        sb.append(((this.criteriaDataOrigin == null)?"<null>":this.criteriaDataOrigin));
        sb.append(',');
        sb.append("osstCode");
        sb.append('=');
        sb.append(((this.osstCode == null)?"<null>":this.osstCode));
        sb.append(',');
        sb.append("ssstCode");
        sb.append('=');
        sb.append(((this.ssstCode == null)?"<null>":this.ssstCode));
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
        result = ((result* 31)+((this.svrorntId == null)? 0 :this.svrorntId.hashCode()));
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.serviceDate == null)? 0 :this.serviceDate.hashCode()));
        result = ((result* 31)+((this.svamstdDicdCode == null)? 0 :this.svamstdDicdCode.hashCode()));
        result = ((result* 31)+((this.criteriaOrigCode == null)? 0 :this.criteriaOrigCode.hashCode()));
        result = ((result* 31)+((this.criteriaDataOrigin == null)? 0 :this.criteriaDataOrigin.hashCode()));
        result = ((result* 31)+((this.criteriaOsstCode == null)? 0 :this.criteriaOsstCode.hashCode()));
        result = ((result* 31)+((this.origCode == null)? 0 :this.origCode.hashCode()));
        result = ((result* 31)+((this.criteriaUserId == null)? 0 :this.criteriaUserId.hashCode()));
        result = ((result* 31)+((this.criteriaSsstCode == null)? 0 :this.criteriaSsstCode.hashCode()));
        result = ((result* 31)+((this.criteriaServiceDate == null)? 0 :this.criteriaServiceDate.hashCode()));
        result = ((result* 31)+((this.ssgpCode == null)? 0 :this.ssgpCode.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.criteriaSvvosstNoncreditServiceInd == null)? 0 :this.criteriaSvvosstNoncreditServiceInd.hashCode()));
        result = ((result* 31)+((this.svamstdTermCode == null)? 0 :this.svamstdTermCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.osstCode == null)? 0 :this.osstCode.hashCode()));
        result = ((result* 31)+((this.ssstCode == null)? 0 :this.ssstCode.hashCode()));
        result = ((result* 31)+((this.criteriaSsgpCode == null)? 0 :this.criteriaSsgpCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CaMisSuccessAndSupportServicesTermDataOrientation100PutRequest) == false) {
            return false;
        }
        CaMisSuccessAndSupportServicesTermDataOrientation100PutRequest rhs = ((CaMisSuccessAndSupportServicesTermDataOrientation100PutRequest) other);
        return (((((((((((((((((((((this.svrorntId == rhs.svrorntId)||((this.svrorntId!= null)&&this.svrorntId.equals(rhs.svrorntId)))&&((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate))))&&((this.serviceDate == rhs.serviceDate)||((this.serviceDate!= null)&&this.serviceDate.equals(rhs.serviceDate))))&&((this.svamstdDicdCode == rhs.svamstdDicdCode)||((this.svamstdDicdCode!= null)&&this.svamstdDicdCode.equals(rhs.svamstdDicdCode))))&&((this.criteriaOrigCode == rhs.criteriaOrigCode)||((this.criteriaOrigCode!= null)&&this.criteriaOrigCode.equals(rhs.criteriaOrigCode))))&&((this.criteriaDataOrigin == rhs.criteriaDataOrigin)||((this.criteriaDataOrigin!= null)&&this.criteriaDataOrigin.equals(rhs.criteriaDataOrigin))))&&((this.criteriaOsstCode == rhs.criteriaOsstCode)||((this.criteriaOsstCode!= null)&&this.criteriaOsstCode.equals(rhs.criteriaOsstCode))))&&((this.origCode == rhs.origCode)||((this.origCode!= null)&&this.origCode.equals(rhs.origCode))))&&((this.criteriaUserId == rhs.criteriaUserId)||((this.criteriaUserId!= null)&&this.criteriaUserId.equals(rhs.criteriaUserId))))&&((this.criteriaSsstCode == rhs.criteriaSsstCode)||((this.criteriaSsstCode!= null)&&this.criteriaSsstCode.equals(rhs.criteriaSsstCode))))&&((this.criteriaServiceDate == rhs.criteriaServiceDate)||((this.criteriaServiceDate!= null)&&this.criteriaServiceDate.equals(rhs.criteriaServiceDate))))&&((this.ssgpCode == rhs.ssgpCode)||((this.ssgpCode!= null)&&this.ssgpCode.equals(rhs.ssgpCode))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.criteriaSvvosstNoncreditServiceInd == rhs.criteriaSvvosstNoncreditServiceInd)||((this.criteriaSvvosstNoncreditServiceInd!= null)&&this.criteriaSvvosstNoncreditServiceInd.equals(rhs.criteriaSvvosstNoncreditServiceInd))))&&((this.svamstdTermCode == rhs.svamstdTermCode)||((this.svamstdTermCode!= null)&&this.svamstdTermCode.equals(rhs.svamstdTermCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.osstCode == rhs.osstCode)||((this.osstCode!= null)&&this.osstCode.equals(rhs.osstCode))))&&((this.ssstCode == rhs.ssstCode)||((this.ssstCode!= null)&&this.ssstCode.equals(rhs.ssstCode))))&&((this.criteriaSsgpCode == rhs.criteriaSsgpCode)||((this.criteriaSsgpCode!= null)&&this.criteriaSsgpCode.equals(rhs.criteriaSsgpCode))));
    }

}
