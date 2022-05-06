
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
    "seqNo",
    "serviceDate",
    "ssstDesc",
    "userId",
    "origCode",
    "spridenId",
    "costCode",
    "origDesc",
    "activityDate",
    "costDesc",
    "ssgpCode",
    "rwname",
    "svvcostNoncreditServiceInd",
    "dataOrigin",
    "ssgpDesc",
    "ssstCode"
})
@Generated("jsonschema2pojo")
public class CaMisSuccessAndSupportServicesTermDataCounselAdvise100PostResponse {

    /**
     * Sequence
     * <p>
     * Lineage reference object : SVRCNAD_SEQ_NO
     * 
     */
    @JsonProperty("seqNo")
    @JsonPropertyDescription("Lineage reference object : SVRCNAD_SEQ_NO")
    private Double seqNo;
    /**
     * Service Date
     * <p>
     * Lineage reference object : SVRCNAD_SERVICE_DATE
     * (Required)
     * 
     */
    @JsonProperty("serviceDate")
    @JsonPropertyDescription("Lineage reference object : SVRCNAD_SERVICE_DATE")
    private Date serviceDate;
    @JsonProperty("ssstDesc")
    private String ssstDesc;
    /**
     * User ID
     * <p>
     * Lineage reference object : SVRCNAD_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SVRCNAD_USER_ID")
    private String userId;
    /**
     * Provider Origin
     * <p>
     * Lineage reference object : SVRCNAD_ORIG_CODE, Lookup lineage reference object : stvorig
     * (Required)
     * 
     */
    @JsonProperty("origCode")
    @JsonPropertyDescription("Lineage reference object : SVRCNAD_ORIG_CODE, Lookup lineage reference object : stvorig")
    private String origCode;
    /**
     * Provider User ID
     * <p>
     * 
     * 
     */
    @JsonProperty("spridenId")
    private String spridenId;
    /**
     * Counsel/Advise
     * <p>
     * Lineage reference object : SVRCNAD_COST_CODE, Lookup lineage reference object : svvcost
     * (Required)
     * 
     */
    @JsonProperty("costCode")
    @JsonPropertyDescription("Lineage reference object : SVRCNAD_COST_CODE, Lookup lineage reference object : svvcost")
    private String costCode;
    @JsonProperty("origDesc")
    private String origDesc;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SVRCNAD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SVRCNAD_ACTIVITY_DATE")
    private Date activityDate;
    @JsonProperty("costDesc")
    private String costDesc;
    /**
     * Group
     * <p>
     * Lineage reference object : SVRCNAD_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("ssgpCode")
    @JsonPropertyDescription("Lineage reference object : SVRCNAD_SSGP_CODE, Lookup lineage reference object : stvssgp")
    private String ssgpCode;
    @JsonProperty("rwname")
    private String rwname;
    /**
     * Lineage reference object : SVVCOST_NONCREDIT_SERVICE_IND
     * 
     */
    @JsonProperty("svvcostNoncreditServiceInd")
    @JsonPropertyDescription("Lineage reference object : SVVCOST_NONCREDIT_SERVICE_IND")
    private String svvcostNoncreditServiceInd;
    /**
     * Source
     * <p>
     * Lineage reference object : SVRCNAD_DATA_ORIGIN
     * (Required)
     * 
     */
    @JsonProperty("dataOrigin")
    @JsonPropertyDescription("Lineage reference object : SVRCNAD_DATA_ORIGIN")
    private String dataOrigin;
    @JsonProperty("ssgpDesc")
    private String ssgpDesc;
    /**
     * Status
     * <p>
     * Lineage reference object : SVRCNAD_SSST_CODE, Lookup lineage reference object : stvssst
     * 
     */
    @JsonProperty("ssstCode")
    @JsonPropertyDescription("Lineage reference object : SVRCNAD_SSST_CODE, Lookup lineage reference object : stvssst")
    private String ssstCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Sequence
     * <p>
     * Lineage reference object : SVRCNAD_SEQ_NO
     * 
     */
    @JsonProperty("seqNo")
    public Double getSeqNo() {
        return seqNo;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : SVRCNAD_SEQ_NO
     * 
     */
    @JsonProperty("seqNo")
    public void setSeqNo(Double seqNo) {
        this.seqNo = seqNo;
    }

    public CaMisSuccessAndSupportServicesTermDataCounselAdvise100PostResponse withSeqNo(Double seqNo) {
        this.seqNo = seqNo;
        return this;
    }

    /**
     * Service Date
     * <p>
     * Lineage reference object : SVRCNAD_SERVICE_DATE
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
     * Lineage reference object : SVRCNAD_SERVICE_DATE
     * (Required)
     * 
     */
    @JsonProperty("serviceDate")
    public void setServiceDate(Date serviceDate) {
        this.serviceDate = serviceDate;
    }

    public CaMisSuccessAndSupportServicesTermDataCounselAdvise100PostResponse withServiceDate(Date serviceDate) {
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

    public CaMisSuccessAndSupportServicesTermDataCounselAdvise100PostResponse withSsstDesc(String ssstDesc) {
        this.ssstDesc = ssstDesc;
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

    public CaMisSuccessAndSupportServicesTermDataCounselAdvise100PostResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Provider Origin
     * <p>
     * Lineage reference object : SVRCNAD_ORIG_CODE, Lookup lineage reference object : stvorig
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
     * Lineage reference object : SVRCNAD_ORIG_CODE, Lookup lineage reference object : stvorig
     * (Required)
     * 
     */
    @JsonProperty("origCode")
    public void setOrigCode(String origCode) {
        this.origCode = origCode;
    }

    public CaMisSuccessAndSupportServicesTermDataCounselAdvise100PostResponse withOrigCode(String origCode) {
        this.origCode = origCode;
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

    public CaMisSuccessAndSupportServicesTermDataCounselAdvise100PostResponse withSpridenId(String spridenId) {
        this.spridenId = spridenId;
        return this;
    }

    /**
     * Counsel/Advise
     * <p>
     * Lineage reference object : SVRCNAD_COST_CODE, Lookup lineage reference object : svvcost
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("costCode")
    public void setCostCode(String costCode) {
        this.costCode = costCode;
    }

    public CaMisSuccessAndSupportServicesTermDataCounselAdvise100PostResponse withCostCode(String costCode) {
        this.costCode = costCode;
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

    public CaMisSuccessAndSupportServicesTermDataCounselAdvise100PostResponse withOrigDesc(String origDesc) {
        this.origDesc = origDesc;
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

    public CaMisSuccessAndSupportServicesTermDataCounselAdvise100PostResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    @JsonProperty("costDesc")
    public String getCostDesc() {
        return costDesc;
    }

    @JsonProperty("costDesc")
    public void setCostDesc(String costDesc) {
        this.costDesc = costDesc;
    }

    public CaMisSuccessAndSupportServicesTermDataCounselAdvise100PostResponse withCostDesc(String costDesc) {
        this.costDesc = costDesc;
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

    public CaMisSuccessAndSupportServicesTermDataCounselAdvise100PostResponse withSsgpCode(String ssgpCode) {
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

    public CaMisSuccessAndSupportServicesTermDataCounselAdvise100PostResponse withRwname(String rwname) {
        this.rwname = rwname;
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

    public CaMisSuccessAndSupportServicesTermDataCounselAdvise100PostResponse withSvvcostNoncreditServiceInd(String svvcostNoncreditServiceInd) {
        this.svvcostNoncreditServiceInd = svvcostNoncreditServiceInd;
        return this;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : SVRCNAD_DATA_ORIGIN
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
     * Lineage reference object : SVRCNAD_DATA_ORIGIN
     * (Required)
     * 
     */
    @JsonProperty("dataOrigin")
    public void setDataOrigin(String dataOrigin) {
        this.dataOrigin = dataOrigin;
    }

    public CaMisSuccessAndSupportServicesTermDataCounselAdvise100PostResponse withDataOrigin(String dataOrigin) {
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

    public CaMisSuccessAndSupportServicesTermDataCounselAdvise100PostResponse withSsgpDesc(String ssgpDesc) {
        this.ssgpDesc = ssgpDesc;
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

    public CaMisSuccessAndSupportServicesTermDataCounselAdvise100PostResponse withSsstCode(String ssstCode) {
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

    public CaMisSuccessAndSupportServicesTermDataCounselAdvise100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CaMisSuccessAndSupportServicesTermDataCounselAdvise100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("spridenId");
        sb.append('=');
        sb.append(((this.spridenId == null)?"<null>":this.spridenId));
        sb.append(',');
        sb.append("costCode");
        sb.append('=');
        sb.append(((this.costCode == null)?"<null>":this.costCode));
        sb.append(',');
        sb.append("origDesc");
        sb.append('=');
        sb.append(((this.origDesc == null)?"<null>":this.origDesc));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("costDesc");
        sb.append('=');
        sb.append(((this.costDesc == null)?"<null>":this.costDesc));
        sb.append(',');
        sb.append("ssgpCode");
        sb.append('=');
        sb.append(((this.ssgpCode == null)?"<null>":this.ssgpCode));
        sb.append(',');
        sb.append("rwname");
        sb.append('=');
        sb.append(((this.rwname == null)?"<null>":this.rwname));
        sb.append(',');
        sb.append("svvcostNoncreditServiceInd");
        sb.append('=');
        sb.append(((this.svvcostNoncreditServiceInd == null)?"<null>":this.svvcostNoncreditServiceInd));
        sb.append(',');
        sb.append("dataOrigin");
        sb.append('=');
        sb.append(((this.dataOrigin == null)?"<null>":this.dataOrigin));
        sb.append(',');
        sb.append("ssgpDesc");
        sb.append('=');
        sb.append(((this.ssgpDesc == null)?"<null>":this.ssgpDesc));
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
        result = ((result* 31)+((this.seqNo == null)? 0 :this.seqNo.hashCode()));
        result = ((result* 31)+((this.serviceDate == null)? 0 :this.serviceDate.hashCode()));
        result = ((result* 31)+((this.ssstDesc == null)? 0 :this.ssstDesc.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.origCode == null)? 0 :this.origCode.hashCode()));
        result = ((result* 31)+((this.spridenId == null)? 0 :this.spridenId.hashCode()));
        result = ((result* 31)+((this.costCode == null)? 0 :this.costCode.hashCode()));
        result = ((result* 31)+((this.origDesc == null)? 0 :this.origDesc.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.costDesc == null)? 0 :this.costDesc.hashCode()));
        result = ((result* 31)+((this.ssgpCode == null)? 0 :this.ssgpCode.hashCode()));
        result = ((result* 31)+((this.rwname == null)? 0 :this.rwname.hashCode()));
        result = ((result* 31)+((this.svvcostNoncreditServiceInd == null)? 0 :this.svvcostNoncreditServiceInd.hashCode()));
        result = ((result* 31)+((this.dataOrigin == null)? 0 :this.dataOrigin.hashCode()));
        result = ((result* 31)+((this.ssgpDesc == null)? 0 :this.ssgpDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ssstCode == null)? 0 :this.ssstCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CaMisSuccessAndSupportServicesTermDataCounselAdvise100PostResponse) == false) {
            return false;
        }
        CaMisSuccessAndSupportServicesTermDataCounselAdvise100PostResponse rhs = ((CaMisSuccessAndSupportServicesTermDataCounselAdvise100PostResponse) other);
        return ((((((((((((((((((this.seqNo == rhs.seqNo)||((this.seqNo!= null)&&this.seqNo.equals(rhs.seqNo)))&&((this.serviceDate == rhs.serviceDate)||((this.serviceDate!= null)&&this.serviceDate.equals(rhs.serviceDate))))&&((this.ssstDesc == rhs.ssstDesc)||((this.ssstDesc!= null)&&this.ssstDesc.equals(rhs.ssstDesc))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.origCode == rhs.origCode)||((this.origCode!= null)&&this.origCode.equals(rhs.origCode))))&&((this.spridenId == rhs.spridenId)||((this.spridenId!= null)&&this.spridenId.equals(rhs.spridenId))))&&((this.costCode == rhs.costCode)||((this.costCode!= null)&&this.costCode.equals(rhs.costCode))))&&((this.origDesc == rhs.origDesc)||((this.origDesc!= null)&&this.origDesc.equals(rhs.origDesc))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.costDesc == rhs.costDesc)||((this.costDesc!= null)&&this.costDesc.equals(rhs.costDesc))))&&((this.ssgpCode == rhs.ssgpCode)||((this.ssgpCode!= null)&&this.ssgpCode.equals(rhs.ssgpCode))))&&((this.rwname == rhs.rwname)||((this.rwname!= null)&&this.rwname.equals(rhs.rwname))))&&((this.svvcostNoncreditServiceInd == rhs.svvcostNoncreditServiceInd)||((this.svvcostNoncreditServiceInd!= null)&&this.svvcostNoncreditServiceInd.equals(rhs.svvcostNoncreditServiceInd))))&&((this.dataOrigin == rhs.dataOrigin)||((this.dataOrigin!= null)&&this.dataOrigin.equals(rhs.dataOrigin))))&&((this.ssgpDesc == rhs.ssgpDesc)||((this.ssgpDesc!= null)&&this.ssgpDesc.equals(rhs.ssgpDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ssstCode == rhs.ssstCode)||((this.ssstCode!= null)&&this.ssstCode.equals(rhs.ssstCode))));
    }

}
