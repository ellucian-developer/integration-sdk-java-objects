
package com.ellucian.generated.bpapi.ban.attendance_accounting_methods.v1_0_0;

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
    "actualInd",
    "independentInd",
    "dch",
    "wch",
    "desc"
})
@Generated("jsonschema2pojo")
public class AttendanceAccountingMethods100GetResponse {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVACCT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : STVACCT_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Code
     * <p>
     * Lineage reference object : STVACCT_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVACCT_CODE")
    private String code;
    /**
     * Lineage reference object : STVACCT_ACTUAL_IND
     * 
     */
    @JsonProperty("actualInd")
    @JsonPropertyDescription("Lineage reference object : STVACCT_ACTUAL_IND")
    private String actualInd;
    /**
     * Lineage reference object : STVACCT_INDEPENDENT_IND
     * 
     */
    @JsonProperty("independentInd")
    @JsonPropertyDescription("Lineage reference object : STVACCT_INDEPENDENT_IND")
    private String independentInd;
    /**
     * Lineage reference object : STVACCT_DCH
     * 
     */
    @JsonProperty("dch")
    @JsonPropertyDescription("Lineage reference object : STVACCT_DCH")
    private String dch;
    /**
     * Lineage reference object : STVACCT_WCH
     * 
     */
    @JsonProperty("wch")
    @JsonPropertyDescription("Lineage reference object : STVACCT_WCH")
    private String wch;
    /**
     * Description
     * <p>
     * Lineage reference object : STVACCT_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVACCT_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVACCT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVACCT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public AttendanceAccountingMethods100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : STVACCT_CODE
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
     * Lineage reference object : STVACCT_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public AttendanceAccountingMethods100GetResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Lineage reference object : STVACCT_ACTUAL_IND
     * 
     */
    @JsonProperty("actualInd")
    public String getActualInd() {
        return actualInd;
    }

    /**
     * Lineage reference object : STVACCT_ACTUAL_IND
     * 
     */
    @JsonProperty("actualInd")
    public void setActualInd(String actualInd) {
        this.actualInd = actualInd;
    }

    public AttendanceAccountingMethods100GetResponse withActualInd(String actualInd) {
        this.actualInd = actualInd;
        return this;
    }

    /**
     * Lineage reference object : STVACCT_INDEPENDENT_IND
     * 
     */
    @JsonProperty("independentInd")
    public String getIndependentInd() {
        return independentInd;
    }

    /**
     * Lineage reference object : STVACCT_INDEPENDENT_IND
     * 
     */
    @JsonProperty("independentInd")
    public void setIndependentInd(String independentInd) {
        this.independentInd = independentInd;
    }

    public AttendanceAccountingMethods100GetResponse withIndependentInd(String independentInd) {
        this.independentInd = independentInd;
        return this;
    }

    /**
     * Lineage reference object : STVACCT_DCH
     * 
     */
    @JsonProperty("dch")
    public String getDch() {
        return dch;
    }

    /**
     * Lineage reference object : STVACCT_DCH
     * 
     */
    @JsonProperty("dch")
    public void setDch(String dch) {
        this.dch = dch;
    }

    public AttendanceAccountingMethods100GetResponse withDch(String dch) {
        this.dch = dch;
        return this;
    }

    /**
     * Lineage reference object : STVACCT_WCH
     * 
     */
    @JsonProperty("wch")
    public String getWch() {
        return wch;
    }

    /**
     * Lineage reference object : STVACCT_WCH
     * 
     */
    @JsonProperty("wch")
    public void setWch(String wch) {
        this.wch = wch;
    }

    public AttendanceAccountingMethods100GetResponse withWch(String wch) {
        this.wch = wch;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVACCT_DESC
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
     * Lineage reference object : STVACCT_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public AttendanceAccountingMethods100GetResponse withDesc(String desc) {
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

    public AttendanceAccountingMethods100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AttendanceAccountingMethods100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("actualInd");
        sb.append('=');
        sb.append(((this.actualInd == null)?"<null>":this.actualInd));
        sb.append(',');
        sb.append("independentInd");
        sb.append('=');
        sb.append(((this.independentInd == null)?"<null>":this.independentInd));
        sb.append(',');
        sb.append("dch");
        sb.append('=');
        sb.append(((this.dch == null)?"<null>":this.dch));
        sb.append(',');
        sb.append("wch");
        sb.append('=');
        sb.append(((this.wch == null)?"<null>":this.wch));
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
        result = ((result* 31)+((this.actualInd == null)? 0 :this.actualInd.hashCode()));
        result = ((result* 31)+((this.independentInd == null)? 0 :this.independentInd.hashCode()));
        result = ((result* 31)+((this.dch == null)? 0 :this.dch.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.wch == null)? 0 :this.wch.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AttendanceAccountingMethods100GetResponse) == false) {
            return false;
        }
        AttendanceAccountingMethods100GetResponse rhs = ((AttendanceAccountingMethods100GetResponse) other);
        return (((((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.actualInd == rhs.actualInd)||((this.actualInd!= null)&&this.actualInd.equals(rhs.actualInd))))&&((this.independentInd == rhs.independentInd)||((this.independentInd!= null)&&this.independentInd.equals(rhs.independentInd))))&&((this.dch == rhs.dch)||((this.dch!= null)&&this.dch.equals(rhs.dch))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.wch == rhs.wch)||((this.wch!= null)&&this.wch.equals(rhs.wch))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
