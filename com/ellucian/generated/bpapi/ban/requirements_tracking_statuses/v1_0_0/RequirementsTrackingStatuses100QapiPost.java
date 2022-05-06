
package com.ellucian.generated.bpapi.ban.requirements_tracking_statuses.v1_0_0;

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
    "activityDate",
    "code",
    "desc",
    "infoAccessInd",
    "longDesc",
    "reqInstrInd",
    "satInd",
    "trkLtrInd",
    "vrMsgNo"
})
@Generated("jsonschema2pojo")
public class RequirementsTrackingStatuses100QapiPost {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : RTVTRST_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : RTVTRST_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Code
     * <p>
     * Lineage reference object : RTVTRST_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : RTVTRST_CODE")
    private String code;
    /**
     * Short Description
     * <p>
     * Lineage reference object : RTVTRST_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : RTVTRST_DESC")
    private String desc;
    /**
     * Lineage reference object : RTVTRST_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    @JsonPropertyDescription("Lineage reference object : RTVTRST_INFO_ACCESS_IND")
    private String infoAccessInd;
    /**
     * Long Description
     * <p>
     * Lineage reference object : RTVTRST_LONG_DESC
     * 
     */
    @JsonProperty("longDesc")
    @JsonPropertyDescription("Lineage reference object : RTVTRST_LONG_DESC")
    private String longDesc;
    /**
     * Lineage reference object : RTVTRST_REQ_INSTR_IND
     * 
     */
    @JsonProperty("reqInstrInd")
    @JsonPropertyDescription("Lineage reference object : RTVTRST_REQ_INSTR_IND")
    private String reqInstrInd;
    /**
     * Lineage reference object : RTVTRST_SAT_IND
     * 
     */
    @JsonProperty("satInd")
    @JsonPropertyDescription("Lineage reference object : RTVTRST_SAT_IND")
    private String satInd;
    /**
     * Lineage reference object : RTVTRST_TRK_LTR_IND
     * 
     */
    @JsonProperty("trkLtrInd")
    @JsonPropertyDescription("Lineage reference object : RTVTRST_TRK_LTR_IND")
    private String trkLtrInd;
    /**
     * Reference Number
     * <p>
     * Lineage reference object : RTVTRST_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    @JsonPropertyDescription("Lineage reference object : RTVTRST_VR_MSG_NO")
    private Double vrMsgNo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : RTVTRST_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : RTVTRST_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public RequirementsTrackingStatuses100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : RTVTRST_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : RTVTRST_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public RequirementsTrackingStatuses100QapiPost withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Short Description
     * <p>
     * Lineage reference object : RTVTRST_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Short Description
     * <p>
     * Lineage reference object : RTVTRST_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public RequirementsTrackingStatuses100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Lineage reference object : RTVTRST_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    public String getInfoAccessInd() {
        return infoAccessInd;
    }

    /**
     * Lineage reference object : RTVTRST_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    public void setInfoAccessInd(String infoAccessInd) {
        this.infoAccessInd = infoAccessInd;
    }

    public RequirementsTrackingStatuses100QapiPost withInfoAccessInd(String infoAccessInd) {
        this.infoAccessInd = infoAccessInd;
        return this;
    }

    /**
     * Long Description
     * <p>
     * Lineage reference object : RTVTRST_LONG_DESC
     * 
     */
    @JsonProperty("longDesc")
    public String getLongDesc() {
        return longDesc;
    }

    /**
     * Long Description
     * <p>
     * Lineage reference object : RTVTRST_LONG_DESC
     * 
     */
    @JsonProperty("longDesc")
    public void setLongDesc(String longDesc) {
        this.longDesc = longDesc;
    }

    public RequirementsTrackingStatuses100QapiPost withLongDesc(String longDesc) {
        this.longDesc = longDesc;
        return this;
    }

    /**
     * Lineage reference object : RTVTRST_REQ_INSTR_IND
     * 
     */
    @JsonProperty("reqInstrInd")
    public String getReqInstrInd() {
        return reqInstrInd;
    }

    /**
     * Lineage reference object : RTVTRST_REQ_INSTR_IND
     * 
     */
    @JsonProperty("reqInstrInd")
    public void setReqInstrInd(String reqInstrInd) {
        this.reqInstrInd = reqInstrInd;
    }

    public RequirementsTrackingStatuses100QapiPost withReqInstrInd(String reqInstrInd) {
        this.reqInstrInd = reqInstrInd;
        return this;
    }

    /**
     * Lineage reference object : RTVTRST_SAT_IND
     * 
     */
    @JsonProperty("satInd")
    public String getSatInd() {
        return satInd;
    }

    /**
     * Lineage reference object : RTVTRST_SAT_IND
     * 
     */
    @JsonProperty("satInd")
    public void setSatInd(String satInd) {
        this.satInd = satInd;
    }

    public RequirementsTrackingStatuses100QapiPost withSatInd(String satInd) {
        this.satInd = satInd;
        return this;
    }

    /**
     * Lineage reference object : RTVTRST_TRK_LTR_IND
     * 
     */
    @JsonProperty("trkLtrInd")
    public String getTrkLtrInd() {
        return trkLtrInd;
    }

    /**
     * Lineage reference object : RTVTRST_TRK_LTR_IND
     * 
     */
    @JsonProperty("trkLtrInd")
    public void setTrkLtrInd(String trkLtrInd) {
        this.trkLtrInd = trkLtrInd;
    }

    public RequirementsTrackingStatuses100QapiPost withTrkLtrInd(String trkLtrInd) {
        this.trkLtrInd = trkLtrInd;
        return this;
    }

    /**
     * Reference Number
     * <p>
     * Lineage reference object : RTVTRST_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    public Double getVrMsgNo() {
        return vrMsgNo;
    }

    /**
     * Reference Number
     * <p>
     * Lineage reference object : RTVTRST_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    public void setVrMsgNo(Double vrMsgNo) {
        this.vrMsgNo = vrMsgNo;
    }

    public RequirementsTrackingStatuses100QapiPost withVrMsgNo(Double vrMsgNo) {
        this.vrMsgNo = vrMsgNo;
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

    public RequirementsTrackingStatuses100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RequirementsTrackingStatuses100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("infoAccessInd");
        sb.append('=');
        sb.append(((this.infoAccessInd == null)?"<null>":this.infoAccessInd));
        sb.append(',');
        sb.append("longDesc");
        sb.append('=');
        sb.append(((this.longDesc == null)?"<null>":this.longDesc));
        sb.append(',');
        sb.append("reqInstrInd");
        sb.append('=');
        sb.append(((this.reqInstrInd == null)?"<null>":this.reqInstrInd));
        sb.append(',');
        sb.append("satInd");
        sb.append('=');
        sb.append(((this.satInd == null)?"<null>":this.satInd));
        sb.append(',');
        sb.append("trkLtrInd");
        sb.append('=');
        sb.append(((this.trkLtrInd == null)?"<null>":this.trkLtrInd));
        sb.append(',');
        sb.append("vrMsgNo");
        sb.append('=');
        sb.append(((this.vrMsgNo == null)?"<null>":this.vrMsgNo));
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
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.satInd == null)? 0 :this.satInd.hashCode()));
        result = ((result* 31)+((this.infoAccessInd == null)? 0 :this.infoAccessInd.hashCode()));
        result = ((result* 31)+((this.trkLtrInd == null)? 0 :this.trkLtrInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.vrMsgNo == null)? 0 :this.vrMsgNo.hashCode()));
        result = ((result* 31)+((this.longDesc == null)? 0 :this.longDesc.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        result = ((result* 31)+((this.reqInstrInd == null)? 0 :this.reqInstrInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RequirementsTrackingStatuses100QapiPost) == false) {
            return false;
        }
        RequirementsTrackingStatuses100QapiPost rhs = ((RequirementsTrackingStatuses100QapiPost) other);
        return (((((((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.satInd == rhs.satInd)||((this.satInd!= null)&&this.satInd.equals(rhs.satInd))))&&((this.infoAccessInd == rhs.infoAccessInd)||((this.infoAccessInd!= null)&&this.infoAccessInd.equals(rhs.infoAccessInd))))&&((this.trkLtrInd == rhs.trkLtrInd)||((this.trkLtrInd!= null)&&this.trkLtrInd.equals(rhs.trkLtrInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.vrMsgNo == rhs.vrMsgNo)||((this.vrMsgNo!= null)&&this.vrMsgNo.equals(rhs.vrMsgNo))))&&((this.longDesc == rhs.longDesc)||((this.longDesc!= null)&&this.longDesc.equals(rhs.longDesc))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.reqInstrInd == rhs.reqInstrInd)||((this.reqInstrInd!= null)&&this.reqInstrInd.equals(rhs.reqInstrInd))));
    }

}
