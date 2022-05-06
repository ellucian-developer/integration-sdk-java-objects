
package com.ellucian.generated.bpapi.ban.ca_mis_success_and_support_services_term_data_career_interest.v1_0_0;

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
    "cintCode",
    "seqNo",
    "serviceDate",
    "ssstDesc",
    "cintDesc",
    "userId",
    "origCode",
    "origDesc",
    "activityDate",
    "ssgpCode",
    "rwname",
    "svvcintNoncreditServiceInd",
    "dataOrigin",
    "ssgpDesc",
    "id",
    "ssstCode"
})
@Generated("jsonschema2pojo")
public class CaMisSuccessAndSupportServicesTermDataCareerInterest100PutResponse {

    /**
     * Career/Interest
     * <p>
     * Lineage reference object : SVRCRIN_CINT_CODE, Lookup lineage reference object : svvcint
     * (Required)
     * 
     */
    @JsonProperty("cintCode")
    @JsonPropertyDescription("Lineage reference object : SVRCRIN_CINT_CODE, Lookup lineage reference object : svvcint")
    private String cintCode;
    /**
     * Sequence
     * <p>
     * Lineage reference object : SVRCRIN_SEQ_NO
     * 
     */
    @JsonProperty("seqNo")
    @JsonPropertyDescription("Lineage reference object : SVRCRIN_SEQ_NO")
    private Double seqNo;
    /**
     * Service Date
     * <p>
     * Lineage reference object : SVRCRIN_SERVICE_DATE
     * (Required)
     * 
     */
    @JsonProperty("serviceDate")
    @JsonPropertyDescription("Lineage reference object : SVRCRIN_SERVICE_DATE")
    private Date serviceDate;
    @JsonProperty("ssstDesc")
    private String ssstDesc;
    @JsonProperty("cintDesc")
    private String cintDesc;
    /**
     * User ID
     * <p>
     * Lineage reference object : SVRCRIN_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SVRCRIN_USER_ID")
    private String userId;
    /**
     * Provider Origin
     * <p>
     * Lineage reference object : SVRCRIN_ORIG_CODE, Lookup lineage reference object : stvorig
     * (Required)
     * 
     */
    @JsonProperty("origCode")
    @JsonPropertyDescription("Lineage reference object : SVRCRIN_ORIG_CODE, Lookup lineage reference object : stvorig")
    private String origCode;
    @JsonProperty("origDesc")
    private String origDesc;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SVRCRIN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SVRCRIN_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Group
     * <p>
     * Lineage reference object : SVRCRIN_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("ssgpCode")
    @JsonPropertyDescription("Lineage reference object : SVRCRIN_SSGP_CODE, Lookup lineage reference object : stvssgp")
    private String ssgpCode;
    @JsonProperty("rwname")
    private String rwname;
    /**
     * Lineage reference object : SVVCINT_NONCREDIT_SERVICE_IND
     * 
     */
    @JsonProperty("svvcintNoncreditServiceInd")
    @JsonPropertyDescription("Lineage reference object : SVVCINT_NONCREDIT_SERVICE_IND")
    private String svvcintNoncreditServiceInd;
    /**
     * Source
     * <p>
     * Lineage reference object : SVRCRIN_DATA_ORIGIN
     * (Required)
     * 
     */
    @JsonProperty("dataOrigin")
    @JsonPropertyDescription("Lineage reference object : SVRCRIN_DATA_ORIGIN")
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
    /**
     * Status
     * <p>
     * Lineage reference object : SVRCRIN_SSST_CODE, Lookup lineage reference object : stvssst
     * 
     */
    @JsonProperty("ssstCode")
    @JsonPropertyDescription("Lineage reference object : SVRCRIN_SSST_CODE, Lookup lineage reference object : stvssst")
    private String ssstCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Career/Interest
     * <p>
     * Lineage reference object : SVRCRIN_CINT_CODE, Lookup lineage reference object : svvcint
     * (Required)
     * 
     */
    @JsonProperty("cintCode")
    public String getCintCode() {
        return cintCode;
    }

    /**
     * Career/Interest
     * <p>
     * Lineage reference object : SVRCRIN_CINT_CODE, Lookup lineage reference object : svvcint
     * (Required)
     * 
     */
    @JsonProperty("cintCode")
    public void setCintCode(String cintCode) {
        this.cintCode = cintCode;
    }

    public CaMisSuccessAndSupportServicesTermDataCareerInterest100PutResponse withCintCode(String cintCode) {
        this.cintCode = cintCode;
        return this;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : SVRCRIN_SEQ_NO
     * 
     */
    @JsonProperty("seqNo")
    public Double getSeqNo() {
        return seqNo;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : SVRCRIN_SEQ_NO
     * 
     */
    @JsonProperty("seqNo")
    public void setSeqNo(Double seqNo) {
        this.seqNo = seqNo;
    }

    public CaMisSuccessAndSupportServicesTermDataCareerInterest100PutResponse withSeqNo(Double seqNo) {
        this.seqNo = seqNo;
        return this;
    }

    /**
     * Service Date
     * <p>
     * Lineage reference object : SVRCRIN_SERVICE_DATE
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
     * Lineage reference object : SVRCRIN_SERVICE_DATE
     * (Required)
     * 
     */
    @JsonProperty("serviceDate")
    public void setServiceDate(Date serviceDate) {
        this.serviceDate = serviceDate;
    }

    public CaMisSuccessAndSupportServicesTermDataCareerInterest100PutResponse withServiceDate(Date serviceDate) {
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

    public CaMisSuccessAndSupportServicesTermDataCareerInterest100PutResponse withSsstDesc(String ssstDesc) {
        this.ssstDesc = ssstDesc;
        return this;
    }

    @JsonProperty("cintDesc")
    public String getCintDesc() {
        return cintDesc;
    }

    @JsonProperty("cintDesc")
    public void setCintDesc(String cintDesc) {
        this.cintDesc = cintDesc;
    }

    public CaMisSuccessAndSupportServicesTermDataCareerInterest100PutResponse withCintDesc(String cintDesc) {
        this.cintDesc = cintDesc;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SVRCRIN_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SVRCRIN_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public CaMisSuccessAndSupportServicesTermDataCareerInterest100PutResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Provider Origin
     * <p>
     * Lineage reference object : SVRCRIN_ORIG_CODE, Lookup lineage reference object : stvorig
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
     * Lineage reference object : SVRCRIN_ORIG_CODE, Lookup lineage reference object : stvorig
     * (Required)
     * 
     */
    @JsonProperty("origCode")
    public void setOrigCode(String origCode) {
        this.origCode = origCode;
    }

    public CaMisSuccessAndSupportServicesTermDataCareerInterest100PutResponse withOrigCode(String origCode) {
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

    public CaMisSuccessAndSupportServicesTermDataCareerInterest100PutResponse withOrigDesc(String origDesc) {
        this.origDesc = origDesc;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SVRCRIN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SVRCRIN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public CaMisSuccessAndSupportServicesTermDataCareerInterest100PutResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : SVRCRIN_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("ssgpCode")
    public String getSsgpCode() {
        return ssgpCode;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : SVRCRIN_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("ssgpCode")
    public void setSsgpCode(String ssgpCode) {
        this.ssgpCode = ssgpCode;
    }

    public CaMisSuccessAndSupportServicesTermDataCareerInterest100PutResponse withSsgpCode(String ssgpCode) {
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

    public CaMisSuccessAndSupportServicesTermDataCareerInterest100PutResponse withRwname(String rwname) {
        this.rwname = rwname;
        return this;
    }

    /**
     * Lineage reference object : SVVCINT_NONCREDIT_SERVICE_IND
     * 
     */
    @JsonProperty("svvcintNoncreditServiceInd")
    public String getSvvcintNoncreditServiceInd() {
        return svvcintNoncreditServiceInd;
    }

    /**
     * Lineage reference object : SVVCINT_NONCREDIT_SERVICE_IND
     * 
     */
    @JsonProperty("svvcintNoncreditServiceInd")
    public void setSvvcintNoncreditServiceInd(String svvcintNoncreditServiceInd) {
        this.svvcintNoncreditServiceInd = svvcintNoncreditServiceInd;
    }

    public CaMisSuccessAndSupportServicesTermDataCareerInterest100PutResponse withSvvcintNoncreditServiceInd(String svvcintNoncreditServiceInd) {
        this.svvcintNoncreditServiceInd = svvcintNoncreditServiceInd;
        return this;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : SVRCRIN_DATA_ORIGIN
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
     * Lineage reference object : SVRCRIN_DATA_ORIGIN
     * (Required)
     * 
     */
    @JsonProperty("dataOrigin")
    public void setDataOrigin(String dataOrigin) {
        this.dataOrigin = dataOrigin;
    }

    public CaMisSuccessAndSupportServicesTermDataCareerInterest100PutResponse withDataOrigin(String dataOrigin) {
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

    public CaMisSuccessAndSupportServicesTermDataCareerInterest100PutResponse withSsgpDesc(String ssgpDesc) {
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

    public CaMisSuccessAndSupportServicesTermDataCareerInterest100PutResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SVRCRIN_SSST_CODE, Lookup lineage reference object : stvssst
     * 
     */
    @JsonProperty("ssstCode")
    public String getSsstCode() {
        return ssstCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SVRCRIN_SSST_CODE, Lookup lineage reference object : stvssst
     * 
     */
    @JsonProperty("ssstCode")
    public void setSsstCode(String ssstCode) {
        this.ssstCode = ssstCode;
    }

    public CaMisSuccessAndSupportServicesTermDataCareerInterest100PutResponse withSsstCode(String ssstCode) {
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

    public CaMisSuccessAndSupportServicesTermDataCareerInterest100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CaMisSuccessAndSupportServicesTermDataCareerInterest100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cintCode");
        sb.append('=');
        sb.append(((this.cintCode == null)?"<null>":this.cintCode));
        sb.append(',');
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
        sb.append("cintDesc");
        sb.append('=');
        sb.append(((this.cintDesc == null)?"<null>":this.cintDesc));
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
        sb.append("svvcintNoncreditServiceInd");
        sb.append('=');
        sb.append(((this.svvcintNoncreditServiceInd == null)?"<null>":this.svvcintNoncreditServiceInd));
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
        result = ((result* 31)+((this.cintCode == null)? 0 :this.cintCode.hashCode()));
        result = ((result* 31)+((this.seqNo == null)? 0 :this.seqNo.hashCode()));
        result = ((result* 31)+((this.serviceDate == null)? 0 :this.serviceDate.hashCode()));
        result = ((result* 31)+((this.ssstDesc == null)? 0 :this.ssstDesc.hashCode()));
        result = ((result* 31)+((this.cintDesc == null)? 0 :this.cintDesc.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.origCode == null)? 0 :this.origCode.hashCode()));
        result = ((result* 31)+((this.origDesc == null)? 0 :this.origDesc.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.ssgpCode == null)? 0 :this.ssgpCode.hashCode()));
        result = ((result* 31)+((this.rwname == null)? 0 :this.rwname.hashCode()));
        result = ((result* 31)+((this.svvcintNoncreditServiceInd == null)? 0 :this.svvcintNoncreditServiceInd.hashCode()));
        result = ((result* 31)+((this.dataOrigin == null)? 0 :this.dataOrigin.hashCode()));
        result = ((result* 31)+((this.ssgpDesc == null)? 0 :this.ssgpDesc.hashCode()));
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
        if ((other instanceof CaMisSuccessAndSupportServicesTermDataCareerInterest100PutResponse) == false) {
            return false;
        }
        CaMisSuccessAndSupportServicesTermDataCareerInterest100PutResponse rhs = ((CaMisSuccessAndSupportServicesTermDataCareerInterest100PutResponse) other);
        return ((((((((((((((((((this.cintCode == rhs.cintCode)||((this.cintCode!= null)&&this.cintCode.equals(rhs.cintCode)))&&((this.seqNo == rhs.seqNo)||((this.seqNo!= null)&&this.seqNo.equals(rhs.seqNo))))&&((this.serviceDate == rhs.serviceDate)||((this.serviceDate!= null)&&this.serviceDate.equals(rhs.serviceDate))))&&((this.ssstDesc == rhs.ssstDesc)||((this.ssstDesc!= null)&&this.ssstDesc.equals(rhs.ssstDesc))))&&((this.cintDesc == rhs.cintDesc)||((this.cintDesc!= null)&&this.cintDesc.equals(rhs.cintDesc))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.origCode == rhs.origCode)||((this.origCode!= null)&&this.origCode.equals(rhs.origCode))))&&((this.origDesc == rhs.origDesc)||((this.origDesc!= null)&&this.origDesc.equals(rhs.origDesc))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.ssgpCode == rhs.ssgpCode)||((this.ssgpCode!= null)&&this.ssgpCode.equals(rhs.ssgpCode))))&&((this.rwname == rhs.rwname)||((this.rwname!= null)&&this.rwname.equals(rhs.rwname))))&&((this.svvcintNoncreditServiceInd == rhs.svvcintNoncreditServiceInd)||((this.svvcintNoncreditServiceInd!= null)&&this.svvcintNoncreditServiceInd.equals(rhs.svvcintNoncreditServiceInd))))&&((this.dataOrigin == rhs.dataOrigin)||((this.dataOrigin!= null)&&this.dataOrigin.equals(rhs.dataOrigin))))&&((this.ssgpDesc == rhs.ssgpDesc)||((this.ssgpDesc!= null)&&this.ssgpDesc.equals(rhs.ssgpDesc))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ssstCode == rhs.ssstCode)||((this.ssstCode!= null)&&this.ssstCode.equals(rhs.ssstCode))));
    }

}
