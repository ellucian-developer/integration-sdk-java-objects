
package com.ellucian.generated.bpapi.ban.general_information_drivers_license.v1_0_0;

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
    "nationDesc",
    "natnCodeDriver",
    "stateDesc",
    "skilCode",
    "driverLicense",
    "expireDate",
    "ptrskilDesc",
    "statCodeDriver",
    "issueDate",
    "status"
})
@Generated("jsonschema2pojo")
public class GeneralInformationDriversLicense100GetResponse {

    @JsonProperty("nationDesc")
    private String nationDesc;
    /**
     * Nation
     * <p>
     * Lineage reference object : PPRDLIC_NATN_CODE_DRIVER, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCodeDriver")
    @JsonPropertyDescription("Lineage reference object : PPRDLIC_NATN_CODE_DRIVER, Lookup lineage reference object : stvnatn")
    private String natnCodeDriver;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stateDesc")
    private String stateDesc;
    /**
     * Type
     * <p>
     * Lineage reference object : PPRDLIC_SKIL_CODE, Lookup lineage reference object : ptrskil
     * 
     */
    @JsonProperty("skilCode")
    @JsonPropertyDescription("Lineage reference object : PPRDLIC_SKIL_CODE, Lookup lineage reference object : ptrskil")
    private String skilCode;
    /**
     * License Number
     * <p>
     * Lineage reference object : PPRDLIC_DRIVER_LICENSE
     * (Required)
     * 
     */
    @JsonProperty("driverLicense")
    @JsonPropertyDescription("Lineage reference object : PPRDLIC_DRIVER_LICENSE")
    private String driverLicense;
    /**
     * Expiration Date
     * <p>
     * Lineage reference object : PPRDLIC_EXPIRE_DATE
     * 
     */
    @JsonProperty("expireDate")
    @JsonPropertyDescription("Lineage reference object : PPRDLIC_EXPIRE_DATE")
    private Date expireDate;
    @JsonProperty("ptrskilDesc")
    private String ptrskilDesc;
    /**
     * State or Province
     * <p>
     * Lineage reference object : PPRDLIC_STAT_CODE_DRIVER, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCodeDriver")
    @JsonPropertyDescription("Lineage reference object : PPRDLIC_STAT_CODE_DRIVER, Lookup lineage reference object : stvstat")
    private String statCodeDriver;
    /**
     * Issue Date
     * <p>
     * Lineage reference object : PPRDLIC_ISSUE_DATE
     * (Required)
     * 
     */
    @JsonProperty("issueDate")
    @JsonPropertyDescription("Lineage reference object : PPRDLIC_ISSUE_DATE")
    private Date issueDate;
    /**
     * License Status
     * <p>
     * Lineage reference object : PPRDLIC_STATUS
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("Lineage reference object : PPRDLIC_STATUS")
    private String status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nationDesc")
    public String getNationDesc() {
        return nationDesc;
    }

    @JsonProperty("nationDesc")
    public void setNationDesc(String nationDesc) {
        this.nationDesc = nationDesc;
    }

    public GeneralInformationDriversLicense100GetResponse withNationDesc(String nationDesc) {
        this.nationDesc = nationDesc;
        return this;
    }

    /**
     * Nation
     * <p>
     * Lineage reference object : PPRDLIC_NATN_CODE_DRIVER, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCodeDriver")
    public String getNatnCodeDriver() {
        return natnCodeDriver;
    }

    /**
     * Nation
     * <p>
     * Lineage reference object : PPRDLIC_NATN_CODE_DRIVER, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCodeDriver")
    public void setNatnCodeDriver(String natnCodeDriver) {
        this.natnCodeDriver = natnCodeDriver;
    }

    public GeneralInformationDriversLicense100GetResponse withNatnCodeDriver(String natnCodeDriver) {
        this.natnCodeDriver = natnCodeDriver;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stateDesc")
    public String getStateDesc() {
        return stateDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stateDesc")
    public void setStateDesc(String stateDesc) {
        this.stateDesc = stateDesc;
    }

    public GeneralInformationDriversLicense100GetResponse withStateDesc(String stateDesc) {
        this.stateDesc = stateDesc;
        return this;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : PPRDLIC_SKIL_CODE, Lookup lineage reference object : ptrskil
     * 
     */
    @JsonProperty("skilCode")
    public String getSkilCode() {
        return skilCode;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : PPRDLIC_SKIL_CODE, Lookup lineage reference object : ptrskil
     * 
     */
    @JsonProperty("skilCode")
    public void setSkilCode(String skilCode) {
        this.skilCode = skilCode;
    }

    public GeneralInformationDriversLicense100GetResponse withSkilCode(String skilCode) {
        this.skilCode = skilCode;
        return this;
    }

    /**
     * License Number
     * <p>
     * Lineage reference object : PPRDLIC_DRIVER_LICENSE
     * (Required)
     * 
     */
    @JsonProperty("driverLicense")
    public String getDriverLicense() {
        return driverLicense;
    }

    /**
     * License Number
     * <p>
     * Lineage reference object : PPRDLIC_DRIVER_LICENSE
     * (Required)
     * 
     */
    @JsonProperty("driverLicense")
    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    public GeneralInformationDriversLicense100GetResponse withDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
        return this;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : PPRDLIC_EXPIRE_DATE
     * 
     */
    @JsonProperty("expireDate")
    public Date getExpireDate() {
        return expireDate;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : PPRDLIC_EXPIRE_DATE
     * 
     */
    @JsonProperty("expireDate")
    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public GeneralInformationDriversLicense100GetResponse withExpireDate(Date expireDate) {
        this.expireDate = expireDate;
        return this;
    }

    @JsonProperty("ptrskilDesc")
    public String getPtrskilDesc() {
        return ptrskilDesc;
    }

    @JsonProperty("ptrskilDesc")
    public void setPtrskilDesc(String ptrskilDesc) {
        this.ptrskilDesc = ptrskilDesc;
    }

    public GeneralInformationDriversLicense100GetResponse withPtrskilDesc(String ptrskilDesc) {
        this.ptrskilDesc = ptrskilDesc;
        return this;
    }

    /**
     * State or Province
     * <p>
     * Lineage reference object : PPRDLIC_STAT_CODE_DRIVER, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCodeDriver")
    public String getStatCodeDriver() {
        return statCodeDriver;
    }

    /**
     * State or Province
     * <p>
     * Lineage reference object : PPRDLIC_STAT_CODE_DRIVER, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCodeDriver")
    public void setStatCodeDriver(String statCodeDriver) {
        this.statCodeDriver = statCodeDriver;
    }

    public GeneralInformationDriversLicense100GetResponse withStatCodeDriver(String statCodeDriver) {
        this.statCodeDriver = statCodeDriver;
        return this;
    }

    /**
     * Issue Date
     * <p>
     * Lineage reference object : PPRDLIC_ISSUE_DATE
     * (Required)
     * 
     */
    @JsonProperty("issueDate")
    public Date getIssueDate() {
        return issueDate;
    }

    /**
     * Issue Date
     * <p>
     * Lineage reference object : PPRDLIC_ISSUE_DATE
     * (Required)
     * 
     */
    @JsonProperty("issueDate")
    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public GeneralInformationDriversLicense100GetResponse withIssueDate(Date issueDate) {
        this.issueDate = issueDate;
        return this;
    }

    /**
     * License Status
     * <p>
     * Lineage reference object : PPRDLIC_STATUS
     * (Required)
     * 
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * License Status
     * <p>
     * Lineage reference object : PPRDLIC_STATUS
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public GeneralInformationDriversLicense100GetResponse withStatus(String status) {
        this.status = status;
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

    public GeneralInformationDriversLicense100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GeneralInformationDriversLicense100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("nationDesc");
        sb.append('=');
        sb.append(((this.nationDesc == null)?"<null>":this.nationDesc));
        sb.append(',');
        sb.append("natnCodeDriver");
        sb.append('=');
        sb.append(((this.natnCodeDriver == null)?"<null>":this.natnCodeDriver));
        sb.append(',');
        sb.append("stateDesc");
        sb.append('=');
        sb.append(((this.stateDesc == null)?"<null>":this.stateDesc));
        sb.append(',');
        sb.append("skilCode");
        sb.append('=');
        sb.append(((this.skilCode == null)?"<null>":this.skilCode));
        sb.append(',');
        sb.append("driverLicense");
        sb.append('=');
        sb.append(((this.driverLicense == null)?"<null>":this.driverLicense));
        sb.append(',');
        sb.append("expireDate");
        sb.append('=');
        sb.append(((this.expireDate == null)?"<null>":this.expireDate));
        sb.append(',');
        sb.append("ptrskilDesc");
        sb.append('=');
        sb.append(((this.ptrskilDesc == null)?"<null>":this.ptrskilDesc));
        sb.append(',');
        sb.append("statCodeDriver");
        sb.append('=');
        sb.append(((this.statCodeDriver == null)?"<null>":this.statCodeDriver));
        sb.append(',');
        sb.append("issueDate");
        sb.append('=');
        sb.append(((this.issueDate == null)?"<null>":this.issueDate));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
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
        result = ((result* 31)+((this.nationDesc == null)? 0 :this.nationDesc.hashCode()));
        result = ((result* 31)+((this.natnCodeDriver == null)? 0 :this.natnCodeDriver.hashCode()));
        result = ((result* 31)+((this.stateDesc == null)? 0 :this.stateDesc.hashCode()));
        result = ((result* 31)+((this.skilCode == null)? 0 :this.skilCode.hashCode()));
        result = ((result* 31)+((this.driverLicense == null)? 0 :this.driverLicense.hashCode()));
        result = ((result* 31)+((this.expireDate == null)? 0 :this.expireDate.hashCode()));
        result = ((result* 31)+((this.ptrskilDesc == null)? 0 :this.ptrskilDesc.hashCode()));
        result = ((result* 31)+((this.statCodeDriver == null)? 0 :this.statCodeDriver.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.issueDate == null)? 0 :this.issueDate.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeneralInformationDriversLicense100GetResponse) == false) {
            return false;
        }
        GeneralInformationDriversLicense100GetResponse rhs = ((GeneralInformationDriversLicense100GetResponse) other);
        return ((((((((((((this.nationDesc == rhs.nationDesc)||((this.nationDesc!= null)&&this.nationDesc.equals(rhs.nationDesc)))&&((this.natnCodeDriver == rhs.natnCodeDriver)||((this.natnCodeDriver!= null)&&this.natnCodeDriver.equals(rhs.natnCodeDriver))))&&((this.stateDesc == rhs.stateDesc)||((this.stateDesc!= null)&&this.stateDesc.equals(rhs.stateDesc))))&&((this.skilCode == rhs.skilCode)||((this.skilCode!= null)&&this.skilCode.equals(rhs.skilCode))))&&((this.driverLicense == rhs.driverLicense)||((this.driverLicense!= null)&&this.driverLicense.equals(rhs.driverLicense))))&&((this.expireDate == rhs.expireDate)||((this.expireDate!= null)&&this.expireDate.equals(rhs.expireDate))))&&((this.ptrskilDesc == rhs.ptrskilDesc)||((this.ptrskilDesc!= null)&&this.ptrskilDesc.equals(rhs.ptrskilDesc))))&&((this.statCodeDriver == rhs.statCodeDriver)||((this.statCodeDriver!= null)&&this.statCodeDriver.equals(rhs.statCodeDriver))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.issueDate == rhs.issueDate)||((this.issueDate!= null)&&this.issueDate.equals(rhs.issueDate))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
