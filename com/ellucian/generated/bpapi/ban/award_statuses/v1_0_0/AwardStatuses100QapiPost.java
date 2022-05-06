
package com.ellucian.generated.bpapi.ban.award_statuses.v1_0_0;

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
    "acceptInd",
    "activityDate",
    "awdLtrInd",
    "cancelInd",
    "code",
    "declineInd",
    "desc",
    "infoAccessInd",
    "offerInd"
})
@Generated("jsonschema2pojo")
public class AwardStatuses100QapiPost {

    /**
     * Lineage reference object : RTVAWST_ACCEPT_IND
     * 
     */
    @JsonProperty("acceptInd")
    @JsonPropertyDescription("Lineage reference object : RTVAWST_ACCEPT_IND")
    private String acceptInd;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : RTVAWST_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : RTVAWST_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Lineage reference object : RTVAWST_AWD_LTR_IND
     * 
     */
    @JsonProperty("awdLtrInd")
    @JsonPropertyDescription("Lineage reference object : RTVAWST_AWD_LTR_IND")
    private String awdLtrInd;
    /**
     * Lineage reference object : RTVAWST_CANCEL_IND
     * 
     */
    @JsonProperty("cancelInd")
    @JsonPropertyDescription("Lineage reference object : RTVAWST_CANCEL_IND")
    private String cancelInd;
    /**
     * Status
     * <p>
     * Lineage reference object : RTVAWST_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : RTVAWST_CODE")
    private String code;
    /**
     * Lineage reference object : RTVAWST_DECLINE_IND
     * 
     */
    @JsonProperty("declineInd")
    @JsonPropertyDescription("Lineage reference object : RTVAWST_DECLINE_IND")
    private String declineInd;
    /**
     * Description
     * <p>
     * Lineage reference object : RTVAWST_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : RTVAWST_DESC")
    private String desc;
    /**
     * Lineage reference object : RTVAWST_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    @JsonPropertyDescription("Lineage reference object : RTVAWST_INFO_ACCESS_IND")
    private String infoAccessInd;
    /**
     * Lineage reference object : RTVAWST_OFFER_IND
     * 
     */
    @JsonProperty("offerInd")
    @JsonPropertyDescription("Lineage reference object : RTVAWST_OFFER_IND")
    private String offerInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : RTVAWST_ACCEPT_IND
     * 
     */
    @JsonProperty("acceptInd")
    public String getAcceptInd() {
        return acceptInd;
    }

    /**
     * Lineage reference object : RTVAWST_ACCEPT_IND
     * 
     */
    @JsonProperty("acceptInd")
    public void setAcceptInd(String acceptInd) {
        this.acceptInd = acceptInd;
    }

    public AwardStatuses100QapiPost withAcceptInd(String acceptInd) {
        this.acceptInd = acceptInd;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : RTVAWST_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : RTVAWST_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public AwardStatuses100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Lineage reference object : RTVAWST_AWD_LTR_IND
     * 
     */
    @JsonProperty("awdLtrInd")
    public String getAwdLtrInd() {
        return awdLtrInd;
    }

    /**
     * Lineage reference object : RTVAWST_AWD_LTR_IND
     * 
     */
    @JsonProperty("awdLtrInd")
    public void setAwdLtrInd(String awdLtrInd) {
        this.awdLtrInd = awdLtrInd;
    }

    public AwardStatuses100QapiPost withAwdLtrInd(String awdLtrInd) {
        this.awdLtrInd = awdLtrInd;
        return this;
    }

    /**
     * Lineage reference object : RTVAWST_CANCEL_IND
     * 
     */
    @JsonProperty("cancelInd")
    public String getCancelInd() {
        return cancelInd;
    }

    /**
     * Lineage reference object : RTVAWST_CANCEL_IND
     * 
     */
    @JsonProperty("cancelInd")
    public void setCancelInd(String cancelInd) {
        this.cancelInd = cancelInd;
    }

    public AwardStatuses100QapiPost withCancelInd(String cancelInd) {
        this.cancelInd = cancelInd;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : RTVAWST_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : RTVAWST_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public AwardStatuses100QapiPost withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Lineage reference object : RTVAWST_DECLINE_IND
     * 
     */
    @JsonProperty("declineInd")
    public String getDeclineInd() {
        return declineInd;
    }

    /**
     * Lineage reference object : RTVAWST_DECLINE_IND
     * 
     */
    @JsonProperty("declineInd")
    public void setDeclineInd(String declineInd) {
        this.declineInd = declineInd;
    }

    public AwardStatuses100QapiPost withDeclineInd(String declineInd) {
        this.declineInd = declineInd;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : RTVAWST_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : RTVAWST_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public AwardStatuses100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Lineage reference object : RTVAWST_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    public String getInfoAccessInd() {
        return infoAccessInd;
    }

    /**
     * Lineage reference object : RTVAWST_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    public void setInfoAccessInd(String infoAccessInd) {
        this.infoAccessInd = infoAccessInd;
    }

    public AwardStatuses100QapiPost withInfoAccessInd(String infoAccessInd) {
        this.infoAccessInd = infoAccessInd;
        return this;
    }

    /**
     * Lineage reference object : RTVAWST_OFFER_IND
     * 
     */
    @JsonProperty("offerInd")
    public String getOfferInd() {
        return offerInd;
    }

    /**
     * Lineage reference object : RTVAWST_OFFER_IND
     * 
     */
    @JsonProperty("offerInd")
    public void setOfferInd(String offerInd) {
        this.offerInd = offerInd;
    }

    public AwardStatuses100QapiPost withOfferInd(String offerInd) {
        this.offerInd = offerInd;
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

    public AwardStatuses100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AwardStatuses100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("acceptInd");
        sb.append('=');
        sb.append(((this.acceptInd == null)?"<null>":this.acceptInd));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("awdLtrInd");
        sb.append('=');
        sb.append(((this.awdLtrInd == null)?"<null>":this.awdLtrInd));
        sb.append(',');
        sb.append("cancelInd");
        sb.append('=');
        sb.append(((this.cancelInd == null)?"<null>":this.cancelInd));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("declineInd");
        sb.append('=');
        sb.append(((this.declineInd == null)?"<null>":this.declineInd));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("infoAccessInd");
        sb.append('=');
        sb.append(((this.infoAccessInd == null)?"<null>":this.infoAccessInd));
        sb.append(',');
        sb.append("offerInd");
        sb.append('=');
        sb.append(((this.offerInd == null)?"<null>":this.offerInd));
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
        result = ((result* 31)+((this.cancelInd == null)? 0 :this.cancelInd.hashCode()));
        result = ((result* 31)+((this.acceptInd == null)? 0 :this.acceptInd.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.awdLtrInd == null)? 0 :this.awdLtrInd.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.offerInd == null)? 0 :this.offerInd.hashCode()));
        result = ((result* 31)+((this.declineInd == null)? 0 :this.declineInd.hashCode()));
        result = ((result* 31)+((this.infoAccessInd == null)? 0 :this.infoAccessInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AwardStatuses100QapiPost) == false) {
            return false;
        }
        AwardStatuses100QapiPost rhs = ((AwardStatuses100QapiPost) other);
        return (((((((((((this.cancelInd == rhs.cancelInd)||((this.cancelInd!= null)&&this.cancelInd.equals(rhs.cancelInd)))&&((this.acceptInd == rhs.acceptInd)||((this.acceptInd!= null)&&this.acceptInd.equals(rhs.acceptInd))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.awdLtrInd == rhs.awdLtrInd)||((this.awdLtrInd!= null)&&this.awdLtrInd.equals(rhs.awdLtrInd))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.offerInd == rhs.offerInd)||((this.offerInd!= null)&&this.offerInd.equals(rhs.offerInd))))&&((this.declineInd == rhs.declineInd)||((this.declineInd!= null)&&this.declineInd.equals(rhs.declineInd))))&&((this.infoAccessInd == rhs.infoAccessInd)||((this.infoAccessInd!= null)&&this.infoAccessInd.equals(rhs.infoAccessInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
