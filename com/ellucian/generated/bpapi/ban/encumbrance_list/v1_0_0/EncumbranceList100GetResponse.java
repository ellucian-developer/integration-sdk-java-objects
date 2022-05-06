
package com.ellucian.generated.bpapi.ban.encumbrance_list.v1_0_0;

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
    "estabDate",
    "activityDate",
    "pendInd",
    "fsyrCode",
    "currentBalance",
    "num",
    "statusInd",
    "type",
    "desc"
})
@Generated("jsonschema2pojo")
public class EncumbranceList100GetResponse {

    /**
     * Establish
     * Date
     * <p>
     * Lineage reference object : FGBENCH_ESTAB_DATE
     * 
     */
    @JsonProperty("estabDate")
    @JsonPropertyDescription("Lineage reference object : FGBENCH_ESTAB_DATE")
    private Date estabDate;
    /**
     * Last
     * Activity Date
     * <p>
     * Lineage reference object : FGBENCH_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : FGBENCH_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * *
     * <p>
     * 
     * 
     */
    @JsonProperty("pendInd")
    private String pendInd;
    /**
     * FY
     * <p>
     * 
     * 
     */
    @JsonProperty("fsyrCode")
    private String fsyrCode;
    /**
     * Current Balance
     * <p>
     * 
     * 
     */
    @JsonProperty("currentBalance")
    private Double currentBalance;
    /**
     * Encumbrance  
     * Number
     * <p>
     * Lineage reference object : FGBENCH_NUM
     * 
     */
    @JsonProperty("num")
    @JsonPropertyDescription("Lineage reference object : FGBENCH_NUM")
    private String num;
    /**
     * Status
     * <p>
     * Lineage reference object : FGBENCH_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : FGBENCH_STATUS_IND")
    private String statusInd;
    /**
     * Type
     * <p>
     * Lineage reference object : FGBENCH_TYPE
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Lineage reference object : FGBENCH_TYPE")
    private String type;
    /**
     * Description
     * <p>
     * Lineage reference object : FGBENCH_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : FGBENCH_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Establish
     * Date
     * <p>
     * Lineage reference object : FGBENCH_ESTAB_DATE
     * 
     */
    @JsonProperty("estabDate")
    public Date getEstabDate() {
        return estabDate;
    }

    /**
     * Establish
     * Date
     * <p>
     * Lineage reference object : FGBENCH_ESTAB_DATE
     * 
     */
    @JsonProperty("estabDate")
    public void setEstabDate(Date estabDate) {
        this.estabDate = estabDate;
    }

    public EncumbranceList100GetResponse withEstabDate(Date estabDate) {
        this.estabDate = estabDate;
        return this;
    }

    /**
     * Last
     * Activity Date
     * <p>
     * Lineage reference object : FGBENCH_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Last
     * Activity Date
     * <p>
     * Lineage reference object : FGBENCH_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public EncumbranceList100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * *
     * <p>
     * 
     * 
     */
    @JsonProperty("pendInd")
    public String getPendInd() {
        return pendInd;
    }

    /**
     * *
     * <p>
     * 
     * 
     */
    @JsonProperty("pendInd")
    public void setPendInd(String pendInd) {
        this.pendInd = pendInd;
    }

    public EncumbranceList100GetResponse withPendInd(String pendInd) {
        this.pendInd = pendInd;
        return this;
    }

    /**
     * FY
     * <p>
     * 
     * 
     */
    @JsonProperty("fsyrCode")
    public String getFsyrCode() {
        return fsyrCode;
    }

    /**
     * FY
     * <p>
     * 
     * 
     */
    @JsonProperty("fsyrCode")
    public void setFsyrCode(String fsyrCode) {
        this.fsyrCode = fsyrCode;
    }

    public EncumbranceList100GetResponse withFsyrCode(String fsyrCode) {
        this.fsyrCode = fsyrCode;
        return this;
    }

    /**
     * Current Balance
     * <p>
     * 
     * 
     */
    @JsonProperty("currentBalance")
    public Double getCurrentBalance() {
        return currentBalance;
    }

    /**
     * Current Balance
     * <p>
     * 
     * 
     */
    @JsonProperty("currentBalance")
    public void setCurrentBalance(Double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public EncumbranceList100GetResponse withCurrentBalance(Double currentBalance) {
        this.currentBalance = currentBalance;
        return this;
    }

    /**
     * Encumbrance  
     * Number
     * <p>
     * Lineage reference object : FGBENCH_NUM
     * 
     */
    @JsonProperty("num")
    public String getNum() {
        return num;
    }

    /**
     * Encumbrance  
     * Number
     * <p>
     * Lineage reference object : FGBENCH_NUM
     * 
     */
    @JsonProperty("num")
    public void setNum(String num) {
        this.num = num;
    }

    public EncumbranceList100GetResponse withNum(String num) {
        this.num = num;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : FGBENCH_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public String getStatusInd() {
        return statusInd;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : FGBENCH_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public void setStatusInd(String statusInd) {
        this.statusInd = statusInd;
    }

    public EncumbranceList100GetResponse withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : FGBENCH_TYPE
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : FGBENCH_TYPE
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public EncumbranceList100GetResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : FGBENCH_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : FGBENCH_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public EncumbranceList100GetResponse withDesc(String desc) {
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

    public EncumbranceList100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EncumbranceList100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("estabDate");
        sb.append('=');
        sb.append(((this.estabDate == null)?"<null>":this.estabDate));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("pendInd");
        sb.append('=');
        sb.append(((this.pendInd == null)?"<null>":this.pendInd));
        sb.append(',');
        sb.append("fsyrCode");
        sb.append('=');
        sb.append(((this.fsyrCode == null)?"<null>":this.fsyrCode));
        sb.append(',');
        sb.append("currentBalance");
        sb.append('=');
        sb.append(((this.currentBalance == null)?"<null>":this.currentBalance));
        sb.append(',');
        sb.append("num");
        sb.append('=');
        sb.append(((this.num == null)?"<null>":this.num));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
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
        result = ((result* 31)+((this.estabDate == null)? 0 :this.estabDate.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.pendInd == null)? 0 :this.pendInd.hashCode()));
        result = ((result* 31)+((this.fsyrCode == null)? 0 :this.fsyrCode.hashCode()));
        result = ((result* 31)+((this.currentBalance == null)? 0 :this.currentBalance.hashCode()));
        result = ((result* 31)+((this.num == null)? 0 :this.num.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EncumbranceList100GetResponse) == false) {
            return false;
        }
        EncumbranceList100GetResponse rhs = ((EncumbranceList100GetResponse) other);
        return (((((((((((this.estabDate == rhs.estabDate)||((this.estabDate!= null)&&this.estabDate.equals(rhs.estabDate)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.pendInd == rhs.pendInd)||((this.pendInd!= null)&&this.pendInd.equals(rhs.pendInd))))&&((this.fsyrCode == rhs.fsyrCode)||((this.fsyrCode!= null)&&this.fsyrCode.equals(rhs.fsyrCode))))&&((this.currentBalance == rhs.currentBalance)||((this.currentBalance!= null)&&this.currentBalance.equals(rhs.currentBalance))))&&((this.num == rhs.num)||((this.num!= null)&&this.num.equals(rhs.num))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
