
package com.ellucian.generated.bpapi.ban.medical_information.v1_0_0;

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
    "mediCode",
    "disbInd",
    "mediCodeDate",
    "mdeqCode",
    "disaCode",
    "spsrCode",
    "onsetAge",
    "comment",
    "userId",
    "activityDate"
})
@Generated("jsonschema2pojo")
public class MedicalInformation100QapiPost {

    @JsonProperty("id")
    private String id;
    /**
     * Medical Code
     * <p>
     * Lineage reference object : SPRMEDI_MEDI_CODE, Lookup lineage reference object : stvmedi
     * 
     */
    @JsonProperty("mediCode")
    @JsonPropertyDescription("Lineage reference object : SPRMEDI_MEDI_CODE, Lookup lineage reference object : stvmedi")
    private String mediCode;
    /**
     * Primary Disability
     * <p>
     * Lineage reference object : SPRMEDI_DISB_IND
     * 
     */
    @JsonProperty("disbInd")
    @JsonPropertyDescription("Lineage reference object : SPRMEDI_DISB_IND")
    private String disbInd;
    /**
     * Medical Date
     * <p>
     * Lineage reference object : SPRMEDI_MEDI_CODE_DATE
     * 
     */
    @JsonProperty("mediCodeDate")
    @JsonPropertyDescription("Lineage reference object : SPRMEDI_MEDI_CODE_DATE")
    private Date mediCodeDate;
    /**
     * Equipment Code
     * <p>
     * Lineage reference object : SPRMEDI_MDEQ_CODE, Lookup lineage reference object : stvmdeq
     * 
     */
    @JsonProperty("mdeqCode")
    @JsonPropertyDescription("Lineage reference object : SPRMEDI_MDEQ_CODE, Lookup lineage reference object : stvmdeq")
    private String mdeqCode;
    /**
     * Disability Type
     * <p>
     * Lineage reference object : SPRMEDI_DISA_CODE, Lookup lineage reference object : stvdisa
     * 
     */
    @JsonProperty("disaCode")
    @JsonPropertyDescription("Lineage reference object : SPRMEDI_DISA_CODE, Lookup lineage reference object : stvdisa")
    private String disaCode;
    /**
     * Disability Service
     * <p>
     * Lineage reference object : SPRMEDI_SPSR_CODE, Lookup lineage reference object : stvspsr
     * 
     */
    @JsonProperty("spsrCode")
    @JsonPropertyDescription("Lineage reference object : SPRMEDI_SPSR_CODE, Lookup lineage reference object : stvspsr")
    private String spsrCode;
    /**
     * Disability Onset Age
     * <p>
     * Lineage reference object : SPRMEDI_ONSET_AGE
     * 
     */
    @JsonProperty("onsetAge")
    @JsonPropertyDescription("Lineage reference object : SPRMEDI_ONSET_AGE")
    private Double onsetAge;
    /**
     * Comment
     * <p>
     * Lineage reference object : SPRMEDI_COMMENT
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("Lineage reference object : SPRMEDI_COMMENT")
    private String comment;
    /**
     * User ID
     * <p>
     * Lineage reference object : SPRMEDI_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SPRMEDI_USER_ID")
    private String userId;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SPRMEDI_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SPRMEDI_ACTIVITY_DATE")
    private Date activityDate;
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

    public MedicalInformation100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Medical Code
     * <p>
     * Lineage reference object : SPRMEDI_MEDI_CODE, Lookup lineage reference object : stvmedi
     * 
     */
    @JsonProperty("mediCode")
    public String getMediCode() {
        return mediCode;
    }

    /**
     * Medical Code
     * <p>
     * Lineage reference object : SPRMEDI_MEDI_CODE, Lookup lineage reference object : stvmedi
     * 
     */
    @JsonProperty("mediCode")
    public void setMediCode(String mediCode) {
        this.mediCode = mediCode;
    }

    public MedicalInformation100QapiPost withMediCode(String mediCode) {
        this.mediCode = mediCode;
        return this;
    }

    /**
     * Primary Disability
     * <p>
     * Lineage reference object : SPRMEDI_DISB_IND
     * 
     */
    @JsonProperty("disbInd")
    public String getDisbInd() {
        return disbInd;
    }

    /**
     * Primary Disability
     * <p>
     * Lineage reference object : SPRMEDI_DISB_IND
     * 
     */
    @JsonProperty("disbInd")
    public void setDisbInd(String disbInd) {
        this.disbInd = disbInd;
    }

    public MedicalInformation100QapiPost withDisbInd(String disbInd) {
        this.disbInd = disbInd;
        return this;
    }

    /**
     * Medical Date
     * <p>
     * Lineage reference object : SPRMEDI_MEDI_CODE_DATE
     * 
     */
    @JsonProperty("mediCodeDate")
    public Date getMediCodeDate() {
        return mediCodeDate;
    }

    /**
     * Medical Date
     * <p>
     * Lineage reference object : SPRMEDI_MEDI_CODE_DATE
     * 
     */
    @JsonProperty("mediCodeDate")
    public void setMediCodeDate(Date mediCodeDate) {
        this.mediCodeDate = mediCodeDate;
    }

    public MedicalInformation100QapiPost withMediCodeDate(Date mediCodeDate) {
        this.mediCodeDate = mediCodeDate;
        return this;
    }

    /**
     * Equipment Code
     * <p>
     * Lineage reference object : SPRMEDI_MDEQ_CODE, Lookup lineage reference object : stvmdeq
     * 
     */
    @JsonProperty("mdeqCode")
    public String getMdeqCode() {
        return mdeqCode;
    }

    /**
     * Equipment Code
     * <p>
     * Lineage reference object : SPRMEDI_MDEQ_CODE, Lookup lineage reference object : stvmdeq
     * 
     */
    @JsonProperty("mdeqCode")
    public void setMdeqCode(String mdeqCode) {
        this.mdeqCode = mdeqCode;
    }

    public MedicalInformation100QapiPost withMdeqCode(String mdeqCode) {
        this.mdeqCode = mdeqCode;
        return this;
    }

    /**
     * Disability Type
     * <p>
     * Lineage reference object : SPRMEDI_DISA_CODE, Lookup lineage reference object : stvdisa
     * 
     */
    @JsonProperty("disaCode")
    public String getDisaCode() {
        return disaCode;
    }

    /**
     * Disability Type
     * <p>
     * Lineage reference object : SPRMEDI_DISA_CODE, Lookup lineage reference object : stvdisa
     * 
     */
    @JsonProperty("disaCode")
    public void setDisaCode(String disaCode) {
        this.disaCode = disaCode;
    }

    public MedicalInformation100QapiPost withDisaCode(String disaCode) {
        this.disaCode = disaCode;
        return this;
    }

    /**
     * Disability Service
     * <p>
     * Lineage reference object : SPRMEDI_SPSR_CODE, Lookup lineage reference object : stvspsr
     * 
     */
    @JsonProperty("spsrCode")
    public String getSpsrCode() {
        return spsrCode;
    }

    /**
     * Disability Service
     * <p>
     * Lineage reference object : SPRMEDI_SPSR_CODE, Lookup lineage reference object : stvspsr
     * 
     */
    @JsonProperty("spsrCode")
    public void setSpsrCode(String spsrCode) {
        this.spsrCode = spsrCode;
    }

    public MedicalInformation100QapiPost withSpsrCode(String spsrCode) {
        this.spsrCode = spsrCode;
        return this;
    }

    /**
     * Disability Onset Age
     * <p>
     * Lineage reference object : SPRMEDI_ONSET_AGE
     * 
     */
    @JsonProperty("onsetAge")
    public Double getOnsetAge() {
        return onsetAge;
    }

    /**
     * Disability Onset Age
     * <p>
     * Lineage reference object : SPRMEDI_ONSET_AGE
     * 
     */
    @JsonProperty("onsetAge")
    public void setOnsetAge(Double onsetAge) {
        this.onsetAge = onsetAge;
    }

    public MedicalInformation100QapiPost withOnsetAge(Double onsetAge) {
        this.onsetAge = onsetAge;
        return this;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : SPRMEDI_COMMENT
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : SPRMEDI_COMMENT
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public MedicalInformation100QapiPost withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SPRMEDI_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SPRMEDI_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public MedicalInformation100QapiPost withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SPRMEDI_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SPRMEDI_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public MedicalInformation100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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

    public MedicalInformation100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MedicalInformation100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("mediCode");
        sb.append('=');
        sb.append(((this.mediCode == null)?"<null>":this.mediCode));
        sb.append(',');
        sb.append("disbInd");
        sb.append('=');
        sb.append(((this.disbInd == null)?"<null>":this.disbInd));
        sb.append(',');
        sb.append("mediCodeDate");
        sb.append('=');
        sb.append(((this.mediCodeDate == null)?"<null>":this.mediCodeDate));
        sb.append(',');
        sb.append("mdeqCode");
        sb.append('=');
        sb.append(((this.mdeqCode == null)?"<null>":this.mdeqCode));
        sb.append(',');
        sb.append("disaCode");
        sb.append('=');
        sb.append(((this.disaCode == null)?"<null>":this.disaCode));
        sb.append(',');
        sb.append("spsrCode");
        sb.append('=');
        sb.append(((this.spsrCode == null)?"<null>":this.spsrCode));
        sb.append(',');
        sb.append("onsetAge");
        sb.append('=');
        sb.append(((this.onsetAge == null)?"<null>":this.onsetAge));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
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
        result = ((result* 31)+((this.mediCode == null)? 0 :this.mediCode.hashCode()));
        result = ((result* 31)+((this.spsrCode == null)? 0 :this.spsrCode.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.mediCodeDate == null)? 0 :this.mediCodeDate.hashCode()));
        result = ((result* 31)+((this.onsetAge == null)? 0 :this.onsetAge.hashCode()));
        result = ((result* 31)+((this.mdeqCode == null)? 0 :this.mdeqCode.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.disbInd == null)? 0 :this.disbInd.hashCode()));
        result = ((result* 31)+((this.disaCode == null)? 0 :this.disaCode.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MedicalInformation100QapiPost) == false) {
            return false;
        }
        MedicalInformation100QapiPost rhs = ((MedicalInformation100QapiPost) other);
        return (((((((((((((this.mediCode == rhs.mediCode)||((this.mediCode!= null)&&this.mediCode.equals(rhs.mediCode)))&&((this.spsrCode == rhs.spsrCode)||((this.spsrCode!= null)&&this.spsrCode.equals(rhs.spsrCode))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.mediCodeDate == rhs.mediCodeDate)||((this.mediCodeDate!= null)&&this.mediCodeDate.equals(rhs.mediCodeDate))))&&((this.onsetAge == rhs.onsetAge)||((this.onsetAge!= null)&&this.onsetAge.equals(rhs.onsetAge))))&&((this.mdeqCode == rhs.mdeqCode)||((this.mdeqCode!= null)&&this.mdeqCode.equals(rhs.mdeqCode))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.disbInd == rhs.disbInd)||((this.disbInd!= null)&&this.disbInd.equals(rhs.disbInd))))&&((this.disaCode == rhs.disaCode)||((this.disaCode!= null)&&this.disaCode.equals(rhs.disaCode))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
