
package com.ellucian.generated.bpapi.ban.employee_new_hire.v1_0_0;

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
    "bcatDesc",
    "pebemplFirstHireDate",
    "pebemplUserId",
    "pebemplCoasCodeHome",
    "pebemplNewHireInd",
    "eclsDesc",
    "homeTitle",
    "pebemplOrgnCodeHome",
    "pebemplEclsCode",
    "pebemplActivityDate",
    "pebemplBcatCode"
})
@Generated("jsonschema2pojo")
public class Employee {

    /**
     * Lineage reference object : bcatDesc
     * 
     */
    @JsonProperty("bcatDesc")
    @JsonPropertyDescription("Lineage reference object : bcatDesc")
    private String bcatDesc;
    /**
     * Original Hire
     * <p>
     * Lineage reference object : pebemplFirstHireDate
     * (Required)
     * 
     */
    @JsonProperty("pebemplFirstHireDate")
    @JsonPropertyDescription("Lineage reference object : pebemplFirstHireDate")
    private Date pebemplFirstHireDate;
    /**
     * Lineage reference object : pebemplUserId
     * 
     */
    @JsonProperty("pebemplUserId")
    @JsonPropertyDescription("Lineage reference object : pebemplUserId")
    private String pebemplUserId;
    /**
     * Home Department COA
     * <p>
     * Lineage reference object : pebemplCoasCodeHome
     * (Required)
     * 
     */
    @JsonProperty("pebemplCoasCodeHome")
    @JsonPropertyDescription("Lineage reference object : pebemplCoasCodeHome")
    private String pebemplCoasCodeHome;
    /**
     * Allow New Hire Benefits Enrollment
     * <p>
     * Lineage reference object : pebemplNewHireInd
     * 
     */
    @JsonProperty("pebemplNewHireInd")
    @JsonPropertyDescription("Lineage reference object : pebemplNewHireInd")
    private String pebemplNewHireInd;
    /**
     * Lineage reference object : eclsDesc
     * 
     */
    @JsonProperty("eclsDesc")
    @JsonPropertyDescription("Lineage reference object : eclsDesc")
    private String eclsDesc;
    /**
     * Lineage reference object : homeTitle
     * 
     */
    @JsonProperty("homeTitle")
    @JsonPropertyDescription("Lineage reference object : homeTitle")
    private String homeTitle;
    /**
     * Organization
     * <p>
     * Lineage reference object : pebemplOrgnCodeHome
     * (Required)
     * 
     */
    @JsonProperty("pebemplOrgnCodeHome")
    @JsonPropertyDescription("Lineage reference object : pebemplOrgnCodeHome")
    private String pebemplOrgnCodeHome;
    /**
     * Employee Class
     * <p>
     * Lineage reference object : pebemplEclsCode
     * (Required)
     * 
     */
    @JsonProperty("pebemplEclsCode")
    @JsonPropertyDescription("Lineage reference object : pebemplEclsCode")
    private String pebemplEclsCode;
    /**
     * Lineage reference object : pebemplActivityDate
     * 
     */
    @JsonProperty("pebemplActivityDate")
    @JsonPropertyDescription("Lineage reference object : pebemplActivityDate")
    private Date pebemplActivityDate;
    /**
     * Benefit Category
     * <p>
     * Lineage reference object : pebemplBcatCode, Lookup lineage reference object : ptrecbc,ptrbcat
     * (Required)
     * 
     */
    @JsonProperty("pebemplBcatCode")
    @JsonPropertyDescription("Lineage reference object : pebemplBcatCode, Lookup lineage reference object : ptrecbc,ptrbcat")
    private String pebemplBcatCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : bcatDesc
     * 
     */
    @JsonProperty("bcatDesc")
    public String getBcatDesc() {
        return bcatDesc;
    }

    /**
     * Lineage reference object : bcatDesc
     * 
     */
    @JsonProperty("bcatDesc")
    public void setBcatDesc(String bcatDesc) {
        this.bcatDesc = bcatDesc;
    }

    public Employee withBcatDesc(String bcatDesc) {
        this.bcatDesc = bcatDesc;
        return this;
    }

    /**
     * Original Hire
     * <p>
     * Lineage reference object : pebemplFirstHireDate
     * (Required)
     * 
     */
    @JsonProperty("pebemplFirstHireDate")
    public Date getPebemplFirstHireDate() {
        return pebemplFirstHireDate;
    }

    /**
     * Original Hire
     * <p>
     * Lineage reference object : pebemplFirstHireDate
     * (Required)
     * 
     */
    @JsonProperty("pebemplFirstHireDate")
    public void setPebemplFirstHireDate(Date pebemplFirstHireDate) {
        this.pebemplFirstHireDate = pebemplFirstHireDate;
    }

    public Employee withPebemplFirstHireDate(Date pebemplFirstHireDate) {
        this.pebemplFirstHireDate = pebemplFirstHireDate;
        return this;
    }

    /**
     * Lineage reference object : pebemplUserId
     * 
     */
    @JsonProperty("pebemplUserId")
    public String getPebemplUserId() {
        return pebemplUserId;
    }

    /**
     * Lineage reference object : pebemplUserId
     * 
     */
    @JsonProperty("pebemplUserId")
    public void setPebemplUserId(String pebemplUserId) {
        this.pebemplUserId = pebemplUserId;
    }

    public Employee withPebemplUserId(String pebemplUserId) {
        this.pebemplUserId = pebemplUserId;
        return this;
    }

    /**
     * Home Department COA
     * <p>
     * Lineage reference object : pebemplCoasCodeHome
     * (Required)
     * 
     */
    @JsonProperty("pebemplCoasCodeHome")
    public String getPebemplCoasCodeHome() {
        return pebemplCoasCodeHome;
    }

    /**
     * Home Department COA
     * <p>
     * Lineage reference object : pebemplCoasCodeHome
     * (Required)
     * 
     */
    @JsonProperty("pebemplCoasCodeHome")
    public void setPebemplCoasCodeHome(String pebemplCoasCodeHome) {
        this.pebemplCoasCodeHome = pebemplCoasCodeHome;
    }

    public Employee withPebemplCoasCodeHome(String pebemplCoasCodeHome) {
        this.pebemplCoasCodeHome = pebemplCoasCodeHome;
        return this;
    }

    /**
     * Allow New Hire Benefits Enrollment
     * <p>
     * Lineage reference object : pebemplNewHireInd
     * 
     */
    @JsonProperty("pebemplNewHireInd")
    public String getPebemplNewHireInd() {
        return pebemplNewHireInd;
    }

    /**
     * Allow New Hire Benefits Enrollment
     * <p>
     * Lineage reference object : pebemplNewHireInd
     * 
     */
    @JsonProperty("pebemplNewHireInd")
    public void setPebemplNewHireInd(String pebemplNewHireInd) {
        this.pebemplNewHireInd = pebemplNewHireInd;
    }

    public Employee withPebemplNewHireInd(String pebemplNewHireInd) {
        this.pebemplNewHireInd = pebemplNewHireInd;
        return this;
    }

    /**
     * Lineage reference object : eclsDesc
     * 
     */
    @JsonProperty("eclsDesc")
    public String getEclsDesc() {
        return eclsDesc;
    }

    /**
     * Lineage reference object : eclsDesc
     * 
     */
    @JsonProperty("eclsDesc")
    public void setEclsDesc(String eclsDesc) {
        this.eclsDesc = eclsDesc;
    }

    public Employee withEclsDesc(String eclsDesc) {
        this.eclsDesc = eclsDesc;
        return this;
    }

    /**
     * Lineage reference object : homeTitle
     * 
     */
    @JsonProperty("homeTitle")
    public String getHomeTitle() {
        return homeTitle;
    }

    /**
     * Lineage reference object : homeTitle
     * 
     */
    @JsonProperty("homeTitle")
    public void setHomeTitle(String homeTitle) {
        this.homeTitle = homeTitle;
    }

    public Employee withHomeTitle(String homeTitle) {
        this.homeTitle = homeTitle;
        return this;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : pebemplOrgnCodeHome
     * (Required)
     * 
     */
    @JsonProperty("pebemplOrgnCodeHome")
    public String getPebemplOrgnCodeHome() {
        return pebemplOrgnCodeHome;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : pebemplOrgnCodeHome
     * (Required)
     * 
     */
    @JsonProperty("pebemplOrgnCodeHome")
    public void setPebemplOrgnCodeHome(String pebemplOrgnCodeHome) {
        this.pebemplOrgnCodeHome = pebemplOrgnCodeHome;
    }

    public Employee withPebemplOrgnCodeHome(String pebemplOrgnCodeHome) {
        this.pebemplOrgnCodeHome = pebemplOrgnCodeHome;
        return this;
    }

    /**
     * Employee Class
     * <p>
     * Lineage reference object : pebemplEclsCode
     * (Required)
     * 
     */
    @JsonProperty("pebemplEclsCode")
    public String getPebemplEclsCode() {
        return pebemplEclsCode;
    }

    /**
     * Employee Class
     * <p>
     * Lineage reference object : pebemplEclsCode
     * (Required)
     * 
     */
    @JsonProperty("pebemplEclsCode")
    public void setPebemplEclsCode(String pebemplEclsCode) {
        this.pebemplEclsCode = pebemplEclsCode;
    }

    public Employee withPebemplEclsCode(String pebemplEclsCode) {
        this.pebemplEclsCode = pebemplEclsCode;
        return this;
    }

    /**
     * Lineage reference object : pebemplActivityDate
     * 
     */
    @JsonProperty("pebemplActivityDate")
    public Date getPebemplActivityDate() {
        return pebemplActivityDate;
    }

    /**
     * Lineage reference object : pebemplActivityDate
     * 
     */
    @JsonProperty("pebemplActivityDate")
    public void setPebemplActivityDate(Date pebemplActivityDate) {
        this.pebemplActivityDate = pebemplActivityDate;
    }

    public Employee withPebemplActivityDate(Date pebemplActivityDate) {
        this.pebemplActivityDate = pebemplActivityDate;
        return this;
    }

    /**
     * Benefit Category
     * <p>
     * Lineage reference object : pebemplBcatCode, Lookup lineage reference object : ptrecbc,ptrbcat
     * (Required)
     * 
     */
    @JsonProperty("pebemplBcatCode")
    public String getPebemplBcatCode() {
        return pebemplBcatCode;
    }

    /**
     * Benefit Category
     * <p>
     * Lineage reference object : pebemplBcatCode, Lookup lineage reference object : ptrecbc,ptrbcat
     * (Required)
     * 
     */
    @JsonProperty("pebemplBcatCode")
    public void setPebemplBcatCode(String pebemplBcatCode) {
        this.pebemplBcatCode = pebemplBcatCode;
    }

    public Employee withPebemplBcatCode(String pebemplBcatCode) {
        this.pebemplBcatCode = pebemplBcatCode;
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

    public Employee withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Employee.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bcatDesc");
        sb.append('=');
        sb.append(((this.bcatDesc == null)?"<null>":this.bcatDesc));
        sb.append(',');
        sb.append("pebemplFirstHireDate");
        sb.append('=');
        sb.append(((this.pebemplFirstHireDate == null)?"<null>":this.pebemplFirstHireDate));
        sb.append(',');
        sb.append("pebemplUserId");
        sb.append('=');
        sb.append(((this.pebemplUserId == null)?"<null>":this.pebemplUserId));
        sb.append(',');
        sb.append("pebemplCoasCodeHome");
        sb.append('=');
        sb.append(((this.pebemplCoasCodeHome == null)?"<null>":this.pebemplCoasCodeHome));
        sb.append(',');
        sb.append("pebemplNewHireInd");
        sb.append('=');
        sb.append(((this.pebemplNewHireInd == null)?"<null>":this.pebemplNewHireInd));
        sb.append(',');
        sb.append("eclsDesc");
        sb.append('=');
        sb.append(((this.eclsDesc == null)?"<null>":this.eclsDesc));
        sb.append(',');
        sb.append("homeTitle");
        sb.append('=');
        sb.append(((this.homeTitle == null)?"<null>":this.homeTitle));
        sb.append(',');
        sb.append("pebemplOrgnCodeHome");
        sb.append('=');
        sb.append(((this.pebemplOrgnCodeHome == null)?"<null>":this.pebemplOrgnCodeHome));
        sb.append(',');
        sb.append("pebemplEclsCode");
        sb.append('=');
        sb.append(((this.pebemplEclsCode == null)?"<null>":this.pebemplEclsCode));
        sb.append(',');
        sb.append("pebemplActivityDate");
        sb.append('=');
        sb.append(((this.pebemplActivityDate == null)?"<null>":this.pebemplActivityDate));
        sb.append(',');
        sb.append("pebemplBcatCode");
        sb.append('=');
        sb.append(((this.pebemplBcatCode == null)?"<null>":this.pebemplBcatCode));
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
        result = ((result* 31)+((this.bcatDesc == null)? 0 :this.bcatDesc.hashCode()));
        result = ((result* 31)+((this.pebemplCoasCodeHome == null)? 0 :this.pebemplCoasCodeHome.hashCode()));
        result = ((result* 31)+((this.pebemplActivityDate == null)? 0 :this.pebemplActivityDate.hashCode()));
        result = ((result* 31)+((this.pebemplBcatCode == null)? 0 :this.pebemplBcatCode.hashCode()));
        result = ((result* 31)+((this.pebemplFirstHireDate == null)? 0 :this.pebemplFirstHireDate.hashCode()));
        result = ((result* 31)+((this.pebemplUserId == null)? 0 :this.pebemplUserId.hashCode()));
        result = ((result* 31)+((this.pebemplNewHireInd == null)? 0 :this.pebemplNewHireInd.hashCode()));
        result = ((result* 31)+((this.eclsDesc == null)? 0 :this.eclsDesc.hashCode()));
        result = ((result* 31)+((this.homeTitle == null)? 0 :this.homeTitle.hashCode()));
        result = ((result* 31)+((this.pebemplOrgnCodeHome == null)? 0 :this.pebemplOrgnCodeHome.hashCode()));
        result = ((result* 31)+((this.pebemplEclsCode == null)? 0 :this.pebemplEclsCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Employee) == false) {
            return false;
        }
        Employee rhs = ((Employee) other);
        return (((((((((((((this.bcatDesc == rhs.bcatDesc)||((this.bcatDesc!= null)&&this.bcatDesc.equals(rhs.bcatDesc)))&&((this.pebemplCoasCodeHome == rhs.pebemplCoasCodeHome)||((this.pebemplCoasCodeHome!= null)&&this.pebemplCoasCodeHome.equals(rhs.pebemplCoasCodeHome))))&&((this.pebemplActivityDate == rhs.pebemplActivityDate)||((this.pebemplActivityDate!= null)&&this.pebemplActivityDate.equals(rhs.pebemplActivityDate))))&&((this.pebemplBcatCode == rhs.pebemplBcatCode)||((this.pebemplBcatCode!= null)&&this.pebemplBcatCode.equals(rhs.pebemplBcatCode))))&&((this.pebemplFirstHireDate == rhs.pebemplFirstHireDate)||((this.pebemplFirstHireDate!= null)&&this.pebemplFirstHireDate.equals(rhs.pebemplFirstHireDate))))&&((this.pebemplUserId == rhs.pebemplUserId)||((this.pebemplUserId!= null)&&this.pebemplUserId.equals(rhs.pebemplUserId))))&&((this.pebemplNewHireInd == rhs.pebemplNewHireInd)||((this.pebemplNewHireInd!= null)&&this.pebemplNewHireInd.equals(rhs.pebemplNewHireInd))))&&((this.eclsDesc == rhs.eclsDesc)||((this.eclsDesc!= null)&&this.eclsDesc.equals(rhs.eclsDesc))))&&((this.homeTitle == rhs.homeTitle)||((this.homeTitle!= null)&&this.homeTitle.equals(rhs.homeTitle))))&&((this.pebemplOrgnCodeHome == rhs.pebemplOrgnCodeHome)||((this.pebemplOrgnCodeHome!= null)&&this.pebemplOrgnCodeHome.equals(rhs.pebemplOrgnCodeHome))))&&((this.pebemplEclsCode == rhs.pebemplEclsCode)||((this.pebemplEclsCode!= null)&&this.pebemplEclsCode.equals(rhs.pebemplEclsCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
