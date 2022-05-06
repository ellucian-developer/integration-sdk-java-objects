
package com.ellucian.generated.bpapi.ban.ca_attendance_accounting_methods.v1_0_0;

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
    "actualInd",
    "code",
    "dch",
    "desc",
    "independentInd",
    "independentLabInd",
    "wch",
    "activityDate"
})
@Generated("jsonschema2pojo")
public class CaAttendanceAccountingMethods100QapiPost {

    /**
     * Lineage reference object : STVACCT_ACTUAL_IND
     * 
     */
    @JsonProperty("actualInd")
    @JsonPropertyDescription("Lineage reference object : STVACCT_ACTUAL_IND")
    private String actualInd;
    /**
     * Code
     * <p>
     * Lineage reference object : STVACCT_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVACCT_CODE")
    private String code;
    /**
     * Lineage reference object : STVACCT_DCH
     * 
     */
    @JsonProperty("dch")
    @JsonPropertyDescription("Lineage reference object : STVACCT_DCH")
    private String dch;
    /**
     * Description
     * <p>
     * Lineage reference object : STVACCT_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVACCT_DESC")
    private String desc;
    /**
     * Lineage reference object : STVACCT_INDEPENDENT_IND
     * 
     */
    @JsonProperty("independentInd")
    @JsonPropertyDescription("Lineage reference object : STVACCT_INDEPENDENT_IND")
    private String independentInd;
    /**
     * Independent Study Lab
     * <p>
     * Lineage reference object : STVACCT_INDEPENDENT_LAB_IND
     * 
     */
    @JsonProperty("independentLabInd")
    @JsonPropertyDescription("Lineage reference object : STVACCT_INDEPENDENT_LAB_IND")
    private String independentLabInd;
    /**
     * Lineage reference object : STVACCT_WCH
     * 
     */
    @JsonProperty("wch")
    @JsonPropertyDescription("Lineage reference object : STVACCT_WCH")
    private String wch;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVACCT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : STVACCT_ACTIVITY_DATE")
    private Date activityDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public CaAttendanceAccountingMethods100QapiPost withActualInd(String actualInd) {
        this.actualInd = actualInd;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : STVACCT_CODE
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
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public CaAttendanceAccountingMethods100QapiPost withCode(String code) {
        this.code = code;
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

    public CaAttendanceAccountingMethods100QapiPost withDch(String dch) {
        this.dch = dch;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVACCT_DESC
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
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public CaAttendanceAccountingMethods100QapiPost withDesc(String desc) {
        this.desc = desc;
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

    public CaAttendanceAccountingMethods100QapiPost withIndependentInd(String independentInd) {
        this.independentInd = independentInd;
        return this;
    }

    /**
     * Independent Study Lab
     * <p>
     * Lineage reference object : STVACCT_INDEPENDENT_LAB_IND
     * 
     */
    @JsonProperty("independentLabInd")
    public String getIndependentLabInd() {
        return independentLabInd;
    }

    /**
     * Independent Study Lab
     * <p>
     * Lineage reference object : STVACCT_INDEPENDENT_LAB_IND
     * 
     */
    @JsonProperty("independentLabInd")
    public void setIndependentLabInd(String independentLabInd) {
        this.independentLabInd = independentLabInd;
    }

    public CaAttendanceAccountingMethods100QapiPost withIndependentLabInd(String independentLabInd) {
        this.independentLabInd = independentLabInd;
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

    public CaAttendanceAccountingMethods100QapiPost withWch(String wch) {
        this.wch = wch;
        return this;
    }

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

    public CaAttendanceAccountingMethods100QapiPost withActivityDate(Date activityDate) {
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

    public CaAttendanceAccountingMethods100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CaAttendanceAccountingMethods100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("actualInd");
        sb.append('=');
        sb.append(((this.actualInd == null)?"<null>":this.actualInd));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("dch");
        sb.append('=');
        sb.append(((this.dch == null)?"<null>":this.dch));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("independentInd");
        sb.append('=');
        sb.append(((this.independentInd == null)?"<null>":this.independentInd));
        sb.append(',');
        sb.append("independentLabInd");
        sb.append('=');
        sb.append(((this.independentLabInd == null)?"<null>":this.independentLabInd));
        sb.append(',');
        sb.append("wch");
        sb.append('=');
        sb.append(((this.wch == null)?"<null>":this.wch));
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
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.actualInd == null)? 0 :this.actualInd.hashCode()));
        result = ((result* 31)+((this.independentInd == null)? 0 :this.independentInd.hashCode()));
        result = ((result* 31)+((this.dch == null)? 0 :this.dch.hashCode()));
        result = ((result* 31)+((this.independentLabInd == null)? 0 :this.independentLabInd.hashCode()));
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
        if ((other instanceof CaAttendanceAccountingMethods100QapiPost) == false) {
            return false;
        }
        CaAttendanceAccountingMethods100QapiPost rhs = ((CaAttendanceAccountingMethods100QapiPost) other);
        return ((((((((((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.actualInd == rhs.actualInd)||((this.actualInd!= null)&&this.actualInd.equals(rhs.actualInd))))&&((this.independentInd == rhs.independentInd)||((this.independentInd!= null)&&this.independentInd.equals(rhs.independentInd))))&&((this.dch == rhs.dch)||((this.dch!= null)&&this.dch.equals(rhs.dch))))&&((this.independentLabInd == rhs.independentLabInd)||((this.independentLabInd!= null)&&this.independentLabInd.equals(rhs.independentLabInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.wch == rhs.wch)||((this.wch!= null)&&this.wch.equals(rhs.wch))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}