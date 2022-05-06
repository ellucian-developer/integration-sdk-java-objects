
package com.ellucian.generated.bpapi.ban.detail_encumbrance_activity.v1_0_0;

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
    "statusInd",
    "remainingBalance",
    "type",
    "vendorName",
    "desc",
    "vendorCode"
})
@Generated("jsonschema2pojo")
public class Fgbench {

    /**
     * Date Established
     * <p>
     * Lineage reference object : FGBENCH_ESTAB_DATE
     * 
     */
    @JsonProperty("estabDate")
    @JsonPropertyDescription("Lineage reference object : FGBENCH_ESTAB_DATE")
    private Date estabDate;
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
     * Balance
     * <p>
     * 
     * 
     */
    @JsonProperty("remainingBalance")
    private Double remainingBalance;
    /**
     * Type
     * <p>
     * Lineage reference object : FGBENCH_TYPE
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Lineage reference object : FGBENCH_TYPE")
    private String type;
    @JsonProperty("vendorName")
    private String vendorName;
    /**
     * Description
     * <p>
     * Lineage reference object : FGBENCH_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : FGBENCH_DESC")
    private String desc;
    /**
     * Vendor
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorCode")
    private String vendorCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Date Established
     * <p>
     * Lineage reference object : FGBENCH_ESTAB_DATE
     * 
     */
    @JsonProperty("estabDate")
    public Date getEstabDate() {
        return estabDate;
    }

    /**
     * Date Established
     * <p>
     * Lineage reference object : FGBENCH_ESTAB_DATE
     * 
     */
    @JsonProperty("estabDate")
    public void setEstabDate(Date estabDate) {
        this.estabDate = estabDate;
    }

    public Fgbench withEstabDate(Date estabDate) {
        this.estabDate = estabDate;
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

    public Fgbench withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * Balance
     * <p>
     * 
     * 
     */
    @JsonProperty("remainingBalance")
    public Double getRemainingBalance() {
        return remainingBalance;
    }

    /**
     * Balance
     * <p>
     * 
     * 
     */
    @JsonProperty("remainingBalance")
    public void setRemainingBalance(Double remainingBalance) {
        this.remainingBalance = remainingBalance;
    }

    public Fgbench withRemainingBalance(Double remainingBalance) {
        this.remainingBalance = remainingBalance;
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

    public Fgbench withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("vendorName")
    public String getVendorName() {
        return vendorName;
    }

    @JsonProperty("vendorName")
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public Fgbench withVendorName(String vendorName) {
        this.vendorName = vendorName;
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

    public Fgbench withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Vendor
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorCode")
    public String getVendorCode() {
        return vendorCode;
    }

    /**
     * Vendor
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorCode")
    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
    }

    public Fgbench withVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
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

    public Fgbench withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Fgbench.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("estabDate");
        sb.append('=');
        sb.append(((this.estabDate == null)?"<null>":this.estabDate));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("remainingBalance");
        sb.append('=');
        sb.append(((this.remainingBalance == null)?"<null>":this.remainingBalance));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("vendorName");
        sb.append('=');
        sb.append(((this.vendorName == null)?"<null>":this.vendorName));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("vendorCode");
        sb.append('=');
        sb.append(((this.vendorCode == null)?"<null>":this.vendorCode));
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
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.remainingBalance == null)? 0 :this.remainingBalance.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.vendorName == null)? 0 :this.vendorName.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        result = ((result* 31)+((this.vendorCode == null)? 0 :this.vendorCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Fgbench) == false) {
            return false;
        }
        Fgbench rhs = ((Fgbench) other);
        return (((((((((this.estabDate == rhs.estabDate)||((this.estabDate!= null)&&this.estabDate.equals(rhs.estabDate)))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.remainingBalance == rhs.remainingBalance)||((this.remainingBalance!= null)&&this.remainingBalance.equals(rhs.remainingBalance))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.vendorName == rhs.vendorName)||((this.vendorName!= null)&&this.vendorName.equals(rhs.vendorName))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.vendorCode == rhs.vendorCode)||((this.vendorCode!= null)&&this.vendorCode.equals(rhs.vendorCode))));
    }

}
