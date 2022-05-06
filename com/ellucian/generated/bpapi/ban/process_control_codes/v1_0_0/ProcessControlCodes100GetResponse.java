
package com.ellucian.generated.bpapi.ban.process_control_codes.v1_0_0;

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
    "chkOrder",
    "pinAllowed",
    "sysreqInd",
    "enforceChkordrInd",
    "desc"
})
@Generated("jsonschema2pojo")
public class ProcessControlCodes100GetResponse {

    /**
     * Stvproc Activity Date
     * <p>
     * Lineage reference object : STVPROC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : STVPROC_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Stvproc Code
     * <p>
     * Lineage reference object : STVPROC_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVPROC_CODE")
    private String code;
    /**
     * Check Order
     * <p>
     * Lineage reference object : STVPROC_CHK_ORDER
     * 
     */
    @JsonProperty("chkOrder")
    @JsonPropertyDescription("Lineage reference object : STVPROC_CHK_ORDER")
    private String chkOrder;
    /**
     * Lineage reference object : STVPROC_PIN_ALLOWED
     * 
     */
    @JsonProperty("pinAllowed")
    @JsonPropertyDescription("Lineage reference object : STVPROC_PIN_ALLOWED")
    private String pinAllowed;
    /**
     * Lineage reference object : STVPROC_SYSREQ_IND
     * 
     */
    @JsonProperty("sysreqInd")
    @JsonPropertyDescription("Lineage reference object : STVPROC_SYSREQ_IND")
    private String sysreqInd;
    /**
     * Lineage reference object : STVPROC_ENFORCE_CHKORDR_IND
     * 
     */
    @JsonProperty("enforceChkordrInd")
    @JsonPropertyDescription("Lineage reference object : STVPROC_ENFORCE_CHKORDR_IND")
    private String enforceChkordrInd;
    /**
     * Stvproc Desc
     * <p>
     * Lineage reference object : STVPROC_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVPROC_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Stvproc Activity Date
     * <p>
     * Lineage reference object : STVPROC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Stvproc Activity Date
     * <p>
     * Lineage reference object : STVPROC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public ProcessControlCodes100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Stvproc Code
     * <p>
     * Lineage reference object : STVPROC_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Stvproc Code
     * <p>
     * Lineage reference object : STVPROC_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public ProcessControlCodes100GetResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Check Order
     * <p>
     * Lineage reference object : STVPROC_CHK_ORDER
     * 
     */
    @JsonProperty("chkOrder")
    public String getChkOrder() {
        return chkOrder;
    }

    /**
     * Check Order
     * <p>
     * Lineage reference object : STVPROC_CHK_ORDER
     * 
     */
    @JsonProperty("chkOrder")
    public void setChkOrder(String chkOrder) {
        this.chkOrder = chkOrder;
    }

    public ProcessControlCodes100GetResponse withChkOrder(String chkOrder) {
        this.chkOrder = chkOrder;
        return this;
    }

    /**
     * Lineage reference object : STVPROC_PIN_ALLOWED
     * 
     */
    @JsonProperty("pinAllowed")
    public String getPinAllowed() {
        return pinAllowed;
    }

    /**
     * Lineage reference object : STVPROC_PIN_ALLOWED
     * 
     */
    @JsonProperty("pinAllowed")
    public void setPinAllowed(String pinAllowed) {
        this.pinAllowed = pinAllowed;
    }

    public ProcessControlCodes100GetResponse withPinAllowed(String pinAllowed) {
        this.pinAllowed = pinAllowed;
        return this;
    }

    /**
     * Lineage reference object : STVPROC_SYSREQ_IND
     * 
     */
    @JsonProperty("sysreqInd")
    public String getSysreqInd() {
        return sysreqInd;
    }

    /**
     * Lineage reference object : STVPROC_SYSREQ_IND
     * 
     */
    @JsonProperty("sysreqInd")
    public void setSysreqInd(String sysreqInd) {
        this.sysreqInd = sysreqInd;
    }

    public ProcessControlCodes100GetResponse withSysreqInd(String sysreqInd) {
        this.sysreqInd = sysreqInd;
        return this;
    }

    /**
     * Lineage reference object : STVPROC_ENFORCE_CHKORDR_IND
     * 
     */
    @JsonProperty("enforceChkordrInd")
    public String getEnforceChkordrInd() {
        return enforceChkordrInd;
    }

    /**
     * Lineage reference object : STVPROC_ENFORCE_CHKORDR_IND
     * 
     */
    @JsonProperty("enforceChkordrInd")
    public void setEnforceChkordrInd(String enforceChkordrInd) {
        this.enforceChkordrInd = enforceChkordrInd;
    }

    public ProcessControlCodes100GetResponse withEnforceChkordrInd(String enforceChkordrInd) {
        this.enforceChkordrInd = enforceChkordrInd;
        return this;
    }

    /**
     * Stvproc Desc
     * <p>
     * Lineage reference object : STVPROC_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Stvproc Desc
     * <p>
     * Lineage reference object : STVPROC_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ProcessControlCodes100GetResponse withDesc(String desc) {
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

    public ProcessControlCodes100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ProcessControlCodes100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("chkOrder");
        sb.append('=');
        sb.append(((this.chkOrder == null)?"<null>":this.chkOrder));
        sb.append(',');
        sb.append("pinAllowed");
        sb.append('=');
        sb.append(((this.pinAllowed == null)?"<null>":this.pinAllowed));
        sb.append(',');
        sb.append("sysreqInd");
        sb.append('=');
        sb.append(((this.sysreqInd == null)?"<null>":this.sysreqInd));
        sb.append(',');
        sb.append("enforceChkordrInd");
        sb.append('=');
        sb.append(((this.enforceChkordrInd == null)?"<null>":this.enforceChkordrInd));
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
        result = ((result* 31)+((this.chkOrder == null)? 0 :this.chkOrder.hashCode()));
        result = ((result* 31)+((this.pinAllowed == null)? 0 :this.pinAllowed.hashCode()));
        result = ((result* 31)+((this.sysreqInd == null)? 0 :this.sysreqInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.enforceChkordrInd == null)? 0 :this.enforceChkordrInd.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProcessControlCodes100GetResponse) == false) {
            return false;
        }
        ProcessControlCodes100GetResponse rhs = ((ProcessControlCodes100GetResponse) other);
        return (((((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.chkOrder == rhs.chkOrder)||((this.chkOrder!= null)&&this.chkOrder.equals(rhs.chkOrder))))&&((this.pinAllowed == rhs.pinAllowed)||((this.pinAllowed!= null)&&this.pinAllowed.equals(rhs.pinAllowed))))&&((this.sysreqInd == rhs.sysreqInd)||((this.sysreqInd!= null)&&this.sysreqInd.equals(rhs.sysreqInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.enforceChkordrInd == rhs.enforceChkordrInd)||((this.enforceChkordrInd!= null)&&this.enforceChkordrInd.equals(rhs.enforceChkordrInd))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
