
package com.ellucian.generated.bpapi.ban.ca_calworks_student_counseling_statuses.v1_0_0;

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
    "calworksInd",
    "otherInd",
    "desc"
})
@Generated("jsonschema2pojo")
public class CaCalworksStudentCounselingStatuses100GetResponse {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SVVSCST_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SVVSCST_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Code
     * <p>
     * Lineage reference object : SVVSCST_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : SVVSCST_CODE")
    private String code;
    /**
     * Lineage reference object : SVVSCST_CALWORKS_IND
     * 
     */
    @JsonProperty("calworksInd")
    @JsonPropertyDescription("Lineage reference object : SVVSCST_CALWORKS_IND")
    private String calworksInd;
    /**
     * Lineage reference object : SVVSCST_OTHER_IND
     * 
     */
    @JsonProperty("otherInd")
    @JsonPropertyDescription("Lineage reference object : SVVSCST_OTHER_IND")
    private String otherInd;
    /**
     * Description
     * <p>
     * Lineage reference object : SVVSCST_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : SVVSCST_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SVVSCST_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SVVSCST_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public CaCalworksStudentCounselingStatuses100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : SVVSCST_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : SVVSCST_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public CaCalworksStudentCounselingStatuses100GetResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Lineage reference object : SVVSCST_CALWORKS_IND
     * 
     */
    @JsonProperty("calworksInd")
    public String getCalworksInd() {
        return calworksInd;
    }

    /**
     * Lineage reference object : SVVSCST_CALWORKS_IND
     * 
     */
    @JsonProperty("calworksInd")
    public void setCalworksInd(String calworksInd) {
        this.calworksInd = calworksInd;
    }

    public CaCalworksStudentCounselingStatuses100GetResponse withCalworksInd(String calworksInd) {
        this.calworksInd = calworksInd;
        return this;
    }

    /**
     * Lineage reference object : SVVSCST_OTHER_IND
     * 
     */
    @JsonProperty("otherInd")
    public String getOtherInd() {
        return otherInd;
    }

    /**
     * Lineage reference object : SVVSCST_OTHER_IND
     * 
     */
    @JsonProperty("otherInd")
    public void setOtherInd(String otherInd) {
        this.otherInd = otherInd;
    }

    public CaCalworksStudentCounselingStatuses100GetResponse withOtherInd(String otherInd) {
        this.otherInd = otherInd;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : SVVSCST_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : SVVSCST_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public CaCalworksStudentCounselingStatuses100GetResponse withDesc(String desc) {
        this.desc = desc;
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

    public CaCalworksStudentCounselingStatuses100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CaCalworksStudentCounselingStatuses100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("calworksInd");
        sb.append('=');
        sb.append(((this.calworksInd == null)?"<null>":this.calworksInd));
        sb.append(',');
        sb.append("otherInd");
        sb.append('=');
        sb.append(((this.otherInd == null)?"<null>":this.otherInd));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.calworksInd == null)? 0 :this.calworksInd.hashCode()));
        result = ((result* 31)+((this.otherInd == null)? 0 :this.otherInd.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CaCalworksStudentCounselingStatuses100GetResponse) == false) {
            return false;
        }
        CaCalworksStudentCounselingStatuses100GetResponse rhs = ((CaCalworksStudentCounselingStatuses100GetResponse) other);
        return (((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.calworksInd == rhs.calworksInd)||((this.calworksInd!= null)&&this.calworksInd.equals(rhs.calworksInd))))&&((this.otherInd == rhs.otherInd)||((this.otherInd!= null)&&this.otherInd.equals(rhs.otherInd))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
