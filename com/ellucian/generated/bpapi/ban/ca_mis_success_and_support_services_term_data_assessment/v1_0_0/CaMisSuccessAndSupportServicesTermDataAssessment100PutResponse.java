
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
    "seqNo",
    "serviceDate",
    "ssstDesc",
    "userId",
    "origCode",
    "origDesc",
    "activityDate",
    "svvasstNoncreditServiceInd",
    "ssgpCode",
    "rwname",
    "dataOrigin",
    "asstDesc",
    "ssgpDesc",
    "id",
    "ssstCode",
    "asstCode"
})
@Generated("jsonschema2pojo")
public class CaMisSuccessAndSupportServicesTermDataAssessment100PutResponse {

    /**
     * Sequence
     * <p>
     * Lineage reference object : SVRASMT_SEQ_NO
     * 
     */
    @JsonProperty("seqNo")
    @JsonPropertyDescription("Lineage reference object : SVRASMT_SEQ_NO")
    private Double seqNo;
    /**
     * Service Date
     * <p>
     * Lineage reference object : SVRASMT_SERVICE_DATE
     * (Required)
     * 
     */
    @JsonProperty("serviceDate")
    @JsonPropertyDescription("Lineage reference object : SVRASMT_SERVICE_DATE")
    private Date serviceDate;
    @JsonProperty("ssstDesc")
    private String ssstDesc;
    /**
     * User ID
     * <p>
     * Lineage reference object : SVRASMT_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SVRASMT_USER_ID")
    private String userId;
    /**
     * Provider Origin
     * <p>
     * Lineage reference object : SVRASMT_ORIG_CODE, Lookup lineage reference object : stvorig
     * (Required)
     * 
     */
    @JsonProperty("origCode")
    @JsonPropertyDescription("Lineage reference object : SVRASMT_ORIG_CODE, Lookup lineage reference object : stvorig")
    private String origCode;
    @JsonProperty("origDesc")
    private String origDesc;
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
     * Lineage reference object : SVVASST_NONCREDIT_SERVICE_IND
     * 
     */
    @JsonProperty("svvasstNoncreditServiceInd")
    @JsonPropertyDescription("Lineage reference object : SVVASST_NONCREDIT_SERVICE_IND")
    private String svvasstNoncreditServiceInd;
    /**
     * Group
     * <p>
     * Lineage reference object : SVRASMT_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("ssgpCode")
    @JsonPropertyDescription("Lineage reference object : SVRASMT_SSGP_CODE, Lookup lineage reference object : stvssgp")
    private String ssgpCode;
    @JsonProperty("rwname")
    private String rwname;
    /**
     * Source
     * <p>
     * Lineage reference object : SVRASMT_DATA_ORIGIN
     * (Required)
     * 
     */
    @JsonProperty("dataOrigin")
    @JsonPropertyDescription("Lineage reference object : SVRASMT_DATA_ORIGIN")
    private String dataOrigin;
    @JsonProperty("asstDesc")
    private String asstDesc;
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
     * Assessment Service
     * <p>
     * Lineage reference object : SVRASMT_ASST_CODE, Lookup lineage reference object : svvasst
     * (Required)
     * 
     */
    @JsonProperty("asstCode")
    @JsonPropertyDescription("Lineage reference object : SVRASMT_ASST_CODE, Lookup lineage reference object : svvasst")
    private String asstCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Sequence
     * <p>
     * Lineage reference object : SVRASMT_SEQ_NO
     * 
     */
    @JsonProperty("seqNo")
    public Double getSeqNo() {
        return seqNo;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : SVRASMT_SEQ_NO
     * 
     */
    @JsonProperty("seqNo")
    public void setSeqNo(Double seqNo) {
        this.seqNo = seqNo;
    }

    public CaMisSuccessAndSupportServicesTermDataAssessment100PutResponse withSeqNo(Double seqNo) {
        this.seqNo = seqNo;
        return this;
    }

    /**
     * Service Date
     * <p>
     * Lineage reference object : SVRASMT_SERVICE_DATE
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
     * Lineage reference object : SVRASMT_SERVICE_DATE
     * (Required)
     * 
     */
    @JsonProperty("serviceDate")
    public void setServiceDate(Date serviceDate) {
        this.serviceDate = serviceDate;
    }

    public CaMisSuccessAndSupportServicesTermDataAssessment100PutResponse withServiceDate(Date serviceDate) {
        this.serviceDate = serviceDate;
        return this;
    }

    @JsonProperty("ssstDesc")
    public String getSsstDesc() {
        return ssstDesc;
    }

    @JsonProperty("ssstDesc")
    public void setSsstDesc(String ssstDesc) {
        this.ssstDesc = ssstDesc;
    }

    public CaMisSuccessAndSupportServicesTermDataAssessment100PutResponse withSsstDesc(String ssstDesc) {
        this.ssstDesc = ssstDesc;
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

    public CaMisSuccessAndSupportServicesTermDataAssessment100PutResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Provider Origin
     * <p>
     * Lineage reference object : SVRASMT_ORIG_CODE, Lookup lineage reference object : stvorig
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
     * Lineage reference object : SVRASMT_ORIG_CODE, Lookup lineage reference object : stvorig
     * (Required)
     * 
     */
    @JsonProperty("origCode")
    public void setOrigCode(String origCode) {
        this.origCode = origCode;
    }

    public CaMisSuccessAndSupportServicesTermDataAssessment100PutResponse withOrigCode(String origCode) {
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

    public CaMisSuccessAndSupportServicesTermDataAssessment100PutResponse withOrigDesc(String origDesc) {
        this.origDesc = origDesc;
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

    public CaMisSuccessAndSupportServicesTermDataAssessment100PutResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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

    public CaMisSuccessAndSupportServicesTermDataAssessment100PutResponse withSvvasstNoncreditServiceInd(String svvasstNoncreditServiceInd) {
        this.svvasstNoncreditServiceInd = svvasstNoncreditServiceInd;
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

    public CaMisSuccessAndSupportServicesTermDataAssessment100PutResponse withSsgpCode(String ssgpCode) {
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

    public CaMisSuccessAndSupportServicesTermDataAssessment100PutResponse withRwname(String rwname) {
        this.rwname = rwname;
        return this;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : SVRASMT_DATA_ORIGIN
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
     * Lineage reference object : SVRASMT_DATA_ORIGIN
     * (Required)
     * 
     */
    @JsonProperty("dataOrigin")
    public void setDataOrigin(String dataOrigin) {
        this.dataOrigin = dataOrigin;
    }

    public CaMisSuccessAndSupportServicesTermDataAssessment100PutResponse withDataOrigin(String dataOrigin) {
        this.dataOrigin = dataOrigin;
        return this;
    }

    @JsonProperty("asstDesc")
    public String getAsstDesc() {
        return asstDesc;
    }

    @JsonProperty("asstDesc")
    public void setAsstDesc(String asstDesc) {
        this.asstDesc = asstDesc;
    }

    public CaMisSuccessAndSupportServicesTermDataAssessment100PutResponse withAsstDesc(String asstDesc) {
        this.asstDesc = asstDesc;
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

    public CaMisSuccessAndSupportServicesTermDataAssessment100PutResponse withSsgpDesc(String ssgpDesc) {
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

    public CaMisSuccessAndSupportServicesTermDataAssessment100PutResponse withId(String id) {
        this.id = id;
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

    public CaMisSuccessAndSupportServicesTermDataAssessment100PutResponse withSsstCode(String ssstCode) {
        this.ssstCode = ssstCode;
        return this;
    }

    /**
     * Assessment Service
     * <p>
     * Lineage reference object : SVRASMT_ASST_CODE, Lookup lineage reference object : svvasst
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("asstCode")
    public void setAsstCode(String asstCode) {
        this.asstCode = asstCode;
    }

    public CaMisSuccessAndSupportServicesTermDataAssessment100PutResponse withAsstCode(String asstCode) {
        this.asstCode = asstCode;
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

    public CaMisSuccessAndSupportServicesTermDataAssessment100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CaMisSuccessAndSupportServicesTermDataAssessment100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("seqNo");
        sb.append('=');
        sb.append(((this.seqNo == null)?"<null>":this.seqNo));
        sb.append(',');
        sb.append("serviceDate");
        sb.append('=');
        sb.append(((this.serviceDate == null)?"<null>":this.serviceDate));
        sb.append(',');
        sb.append("ssstDesc");
        sb.append('=');
        sb.append(((this.ssstDesc == null)?"<null>":this.ssstDesc));
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
        sb.append("svvasstNoncreditServiceInd");
        sb.append('=');
        sb.append(((this.svvasstNoncreditServiceInd == null)?"<null>":this.svvasstNoncreditServiceInd));
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
        sb.append("asstDesc");
        sb.append('=');
        sb.append(((this.asstDesc == null)?"<null>":this.asstDesc));
        sb.append(',');
        sb.append("ssgpDesc");
        sb.append('=');
        sb.append(((this.ssgpDesc == null)?"<null>":this.ssgpDesc));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("ssstCode");
        sb.append('=');
        sb.append(((this.ssstCode == null)?"<null>":this.ssstCode));
        sb.append(',');
        sb.append("asstCode");
        sb.append('=');
        sb.append(((this.asstCode == null)?"<null>":this.asstCode));
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
        result = ((result* 31)+((this.ssstDesc == null)? 0 :this.ssstDesc.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.origCode == null)? 0 :this.origCode.hashCode()));
        result = ((result* 31)+((this.origDesc == null)? 0 :this.origDesc.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.svvasstNoncreditServiceInd == null)? 0 :this.svvasstNoncreditServiceInd.hashCode()));
        result = ((result* 31)+((this.ssgpCode == null)? 0 :this.ssgpCode.hashCode()));
        result = ((result* 31)+((this.rwname == null)? 0 :this.rwname.hashCode()));
        result = ((result* 31)+((this.dataOrigin == null)? 0 :this.dataOrigin.hashCode()));
        result = ((result* 31)+((this.asstDesc == null)? 0 :this.asstDesc.hashCode()));
        result = ((result* 31)+((this.ssgpDesc == null)? 0 :this.ssgpDesc.hashCode()));
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
        if ((other instanceof CaMisSuccessAndSupportServicesTermDataAssessment100PutResponse) == false) {
            return false;
        }
        CaMisSuccessAndSupportServicesTermDataAssessment100PutResponse rhs = ((CaMisSuccessAndSupportServicesTermDataAssessment100PutResponse) other);
        return ((((((((((((((((((this.seqNo == rhs.seqNo)||((this.seqNo!= null)&&this.seqNo.equals(rhs.seqNo)))&&((this.serviceDate == rhs.serviceDate)||((this.serviceDate!= null)&&this.serviceDate.equals(rhs.serviceDate))))&&((this.ssstDesc == rhs.ssstDesc)||((this.ssstDesc!= null)&&this.ssstDesc.equals(rhs.ssstDesc))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.origCode == rhs.origCode)||((this.origCode!= null)&&this.origCode.equals(rhs.origCode))))&&((this.origDesc == rhs.origDesc)||((this.origDesc!= null)&&this.origDesc.equals(rhs.origDesc))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.svvasstNoncreditServiceInd == rhs.svvasstNoncreditServiceInd)||((this.svvasstNoncreditServiceInd!= null)&&this.svvasstNoncreditServiceInd.equals(rhs.svvasstNoncreditServiceInd))))&&((this.ssgpCode == rhs.ssgpCode)||((this.ssgpCode!= null)&&this.ssgpCode.equals(rhs.ssgpCode))))&&((this.rwname == rhs.rwname)||((this.rwname!= null)&&this.rwname.equals(rhs.rwname))))&&((this.dataOrigin == rhs.dataOrigin)||((this.dataOrigin!= null)&&this.dataOrigin.equals(rhs.dataOrigin))))&&((this.asstDesc == rhs.asstDesc)||((this.asstDesc!= null)&&this.asstDesc.equals(rhs.asstDesc))))&&((this.ssgpDesc == rhs.ssgpDesc)||((this.ssgpDesc!= null)&&this.ssgpDesc.equals(rhs.ssgpDesc))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ssstCode == rhs.ssstCode)||((this.ssstCode!= null)&&this.ssstCode.equals(rhs.ssstCode))))&&((this.asstCode == rhs.asstCode)||((this.asstCode!= null)&&this.asstCode.equals(rhs.asstCode))));
    }

}
