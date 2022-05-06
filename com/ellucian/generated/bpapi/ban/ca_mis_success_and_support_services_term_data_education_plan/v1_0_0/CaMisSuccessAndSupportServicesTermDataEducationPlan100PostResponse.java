
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
    "seqNo",
    "serviceDate",
    "epstOptDesc",
    "epstCode",
    "duplOverrideInd",
    "epstDesc",
    "userId",
    "origCode",
    "origDesc",
    "activityDate",
    "ssgpCode",
    "rwname",
    "dataOrigin",
    "ssgpDesc",
    "id"
})
@Generated("jsonschema2pojo")
public class CaMisSuccessAndSupportServicesTermDataEducationPlan100PostResponse {

    /**
     * Sequence
     * <p>
     * Lineage reference object : SVREDPL_SEQ_NO
     * 
     */
    @JsonProperty("seqNo")
    @JsonPropertyDescription("Lineage reference object : SVREDPL_SEQ_NO")
    private Double seqNo;
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
     * Education Plan Service
     * <p>
     * 
     * 
     */
    @JsonProperty("epstOptDesc")
    private String epstOptDesc;
    /**
     * Education Plan
     * <p>
     * Lineage reference object : SVREDPL_EPST_CODE
     * (Required)
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
    @JsonProperty("epstDesc")
    private String epstDesc;
    /**
     * User ID
     * <p>
     * Lineage reference object : SVREDPL_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SVREDPL_USER_ID")
    private String userId;
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
    @JsonProperty("origDesc")
    private String origDesc;
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
     * Group
     * <p>
     * Lineage reference object : SVREDPL_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("ssgpCode")
    @JsonPropertyDescription("Lineage reference object : SVREDPL_SSGP_CODE, Lookup lineage reference object : stvssgp")
    private String ssgpCode;
    @JsonProperty("rwname")
    private String rwname;
    /**
     * Source
     * <p>
     * Lineage reference object : SVREDPL_DATA_ORIGIN
     * (Required)
     * 
     */
    @JsonProperty("dataOrigin")
    @JsonPropertyDescription("Lineage reference object : SVREDPL_DATA_ORIGIN")
    private String dataOrigin;
    @JsonProperty("ssgpDesc")
    private String ssgpDesc;
    /**
     * Provider User ID
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    private String id;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Sequence
     * <p>
     * Lineage reference object : SVREDPL_SEQ_NO
     * 
     */
    @JsonProperty("seqNo")
    public Double getSeqNo() {
        return seqNo;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : SVREDPL_SEQ_NO
     * 
     */
    @JsonProperty("seqNo")
    public void setSeqNo(Double seqNo) {
        this.seqNo = seqNo;
    }

    public CaMisSuccessAndSupportServicesTermDataEducationPlan100PostResponse withSeqNo(Double seqNo) {
        this.seqNo = seqNo;
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

    public CaMisSuccessAndSupportServicesTermDataEducationPlan100PostResponse withServiceDate(Date serviceDate) {
        this.serviceDate = serviceDate;
        return this;
    }

    /**
     * Education Plan Service
     * <p>
     * 
     * 
     */
    @JsonProperty("epstOptDesc")
    public String getEpstOptDesc() {
        return epstOptDesc;
    }

    /**
     * Education Plan Service
     * <p>
     * 
     * 
     */
    @JsonProperty("epstOptDesc")
    public void setEpstOptDesc(String epstOptDesc) {
        this.epstOptDesc = epstOptDesc;
    }

    public CaMisSuccessAndSupportServicesTermDataEducationPlan100PostResponse withEpstOptDesc(String epstOptDesc) {
        this.epstOptDesc = epstOptDesc;
        return this;
    }

    /**
     * Education Plan
     * <p>
     * Lineage reference object : SVREDPL_EPST_CODE
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("epstCode")
    public void setEpstCode(String epstCode) {
        this.epstCode = epstCode;
    }

    public CaMisSuccessAndSupportServicesTermDataEducationPlan100PostResponse withEpstCode(String epstCode) {
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

    public CaMisSuccessAndSupportServicesTermDataEducationPlan100PostResponse withDuplOverrideInd(String duplOverrideInd) {
        this.duplOverrideInd = duplOverrideInd;
        return this;
    }

    @JsonProperty("epstDesc")
    public String getEpstDesc() {
        return epstDesc;
    }

    @JsonProperty("epstDesc")
    public void setEpstDesc(String epstDesc) {
        this.epstDesc = epstDesc;
    }

    public CaMisSuccessAndSupportServicesTermDataEducationPlan100PostResponse withEpstDesc(String epstDesc) {
        this.epstDesc = epstDesc;
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

    public CaMisSuccessAndSupportServicesTermDataEducationPlan100PostResponse withUserId(String userId) {
        this.userId = userId;
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

    public CaMisSuccessAndSupportServicesTermDataEducationPlan100PostResponse withOrigCode(String origCode) {
        this.origCode = origCode;
        return this;
    }

    @JsonProperty("origDesc")
    public String getOrigDesc() {
        return origDesc;
    }

    @JsonProperty("origDesc")
    public void setOrigDesc(String origDesc) {
        this.origDesc = origDesc;
    }

    public CaMisSuccessAndSupportServicesTermDataEducationPlan100PostResponse withOrigDesc(String origDesc) {
        this.origDesc = origDesc;
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

    public CaMisSuccessAndSupportServicesTermDataEducationPlan100PostResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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

    public CaMisSuccessAndSupportServicesTermDataEducationPlan100PostResponse withSsgpCode(String ssgpCode) {
        this.ssgpCode = ssgpCode;
        return this;
    }

    @JsonProperty("rwname")
    public String getRwname() {
        return rwname;
    }

    @JsonProperty("rwname")
    public void setRwname(String rwname) {
        this.rwname = rwname;
    }

    public CaMisSuccessAndSupportServicesTermDataEducationPlan100PostResponse withRwname(String rwname) {
        this.rwname = rwname;
        return this;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : SVREDPL_DATA_ORIGIN
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("dataOrigin")
    public void setDataOrigin(String dataOrigin) {
        this.dataOrigin = dataOrigin;
    }

    public CaMisSuccessAndSupportServicesTermDataEducationPlan100PostResponse withDataOrigin(String dataOrigin) {
        this.dataOrigin = dataOrigin;
        return this;
    }

    @JsonProperty("ssgpDesc")
    public String getSsgpDesc() {
        return ssgpDesc;
    }

    @JsonProperty("ssgpDesc")
    public void setSsgpDesc(String ssgpDesc) {
        this.ssgpDesc = ssgpDesc;
    }

    public CaMisSuccessAndSupportServicesTermDataEducationPlan100PostResponse withSsgpDesc(String ssgpDesc) {
        this.ssgpDesc = ssgpDesc;
        return this;
    }

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

    public CaMisSuccessAndSupportServicesTermDataEducationPlan100PostResponse withId(String id) {
        this.id = id;
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

    public CaMisSuccessAndSupportServicesTermDataEducationPlan100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CaMisSuccessAndSupportServicesTermDataEducationPlan100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("seqNo");
        sb.append('=');
        sb.append(((this.seqNo == null)?"<null>":this.seqNo));
        sb.append(',');
        sb.append("serviceDate");
        sb.append('=');
        sb.append(((this.serviceDate == null)?"<null>":this.serviceDate));
        sb.append(',');
        sb.append("epstOptDesc");
        sb.append('=');
        sb.append(((this.epstOptDesc == null)?"<null>":this.epstOptDesc));
        sb.append(',');
        sb.append("epstCode");
        sb.append('=');
        sb.append(((this.epstCode == null)?"<null>":this.epstCode));
        sb.append(',');
        sb.append("duplOverrideInd");
        sb.append('=');
        sb.append(((this.duplOverrideInd == null)?"<null>":this.duplOverrideInd));
        sb.append(',');
        sb.append("epstDesc");
        sb.append('=');
        sb.append(((this.epstDesc == null)?"<null>":this.epstDesc));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("origCode");
        sb.append('=');
        sb.append(((this.origCode == null)?"<null>":this.origCode));
        sb.append(',');
        sb.append("origDesc");
        sb.append('=');
        sb.append(((this.origDesc == null)?"<null>":this.origDesc));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("ssgpCode");
        sb.append('=');
        sb.append(((this.ssgpCode == null)?"<null>":this.ssgpCode));
        sb.append(',');
        sb.append("rwname");
        sb.append('=');
        sb.append(((this.rwname == null)?"<null>":this.rwname));
        sb.append(',');
        sb.append("dataOrigin");
        sb.append('=');
        sb.append(((this.dataOrigin == null)?"<null>":this.dataOrigin));
        sb.append(',');
        sb.append("ssgpDesc");
        sb.append('=');
        sb.append(((this.ssgpDesc == null)?"<null>":this.ssgpDesc));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
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
        result = ((result* 31)+((this.seqNo == null)? 0 :this.seqNo.hashCode()));
        result = ((result* 31)+((this.serviceDate == null)? 0 :this.serviceDate.hashCode()));
        result = ((result* 31)+((this.epstOptDesc == null)? 0 :this.epstOptDesc.hashCode()));
        result = ((result* 31)+((this.epstCode == null)? 0 :this.epstCode.hashCode()));
        result = ((result* 31)+((this.duplOverrideInd == null)? 0 :this.duplOverrideInd.hashCode()));
        result = ((result* 31)+((this.epstDesc == null)? 0 :this.epstDesc.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.origCode == null)? 0 :this.origCode.hashCode()));
        result = ((result* 31)+((this.origDesc == null)? 0 :this.origDesc.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.ssgpCode == null)? 0 :this.ssgpCode.hashCode()));
        result = ((result* 31)+((this.rwname == null)? 0 :this.rwname.hashCode()));
        result = ((result* 31)+((this.dataOrigin == null)? 0 :this.dataOrigin.hashCode()));
        result = ((result* 31)+((this.ssgpDesc == null)? 0 :this.ssgpDesc.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CaMisSuccessAndSupportServicesTermDataEducationPlan100PostResponse) == false) {
            return false;
        }
        CaMisSuccessAndSupportServicesTermDataEducationPlan100PostResponse rhs = ((CaMisSuccessAndSupportServicesTermDataEducationPlan100PostResponse) other);
        return (((((((((((((((((this.seqNo == rhs.seqNo)||((this.seqNo!= null)&&this.seqNo.equals(rhs.seqNo)))&&((this.serviceDate == rhs.serviceDate)||((this.serviceDate!= null)&&this.serviceDate.equals(rhs.serviceDate))))&&((this.epstOptDesc == rhs.epstOptDesc)||((this.epstOptDesc!= null)&&this.epstOptDesc.equals(rhs.epstOptDesc))))&&((this.epstCode == rhs.epstCode)||((this.epstCode!= null)&&this.epstCode.equals(rhs.epstCode))))&&((this.duplOverrideInd == rhs.duplOverrideInd)||((this.duplOverrideInd!= null)&&this.duplOverrideInd.equals(rhs.duplOverrideInd))))&&((this.epstDesc == rhs.epstDesc)||((this.epstDesc!= null)&&this.epstDesc.equals(rhs.epstDesc))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.origCode == rhs.origCode)||((this.origCode!= null)&&this.origCode.equals(rhs.origCode))))&&((this.origDesc == rhs.origDesc)||((this.origDesc!= null)&&this.origDesc.equals(rhs.origDesc))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.ssgpCode == rhs.ssgpCode)||((this.ssgpCode!= null)&&this.ssgpCode.equals(rhs.ssgpCode))))&&((this.rwname == rhs.rwname)||((this.rwname!= null)&&this.rwname.equals(rhs.rwname))))&&((this.dataOrigin == rhs.dataOrigin)||((this.dataOrigin!= null)&&this.dataOrigin.equals(rhs.dataOrigin))))&&((this.ssgpDesc == rhs.ssgpDesc)||((this.ssgpDesc!= null)&&this.ssgpDesc.equals(rhs.ssgpDesc))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
