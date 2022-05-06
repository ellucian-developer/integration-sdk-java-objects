
package com.ellucian.generated.bpapi.ban.external_report_codes.v1_0_0;

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
    "eentCode",
    "effDate",
    "eeliCode",
    "statusInd",
    "coasCode",
    "title",
    "eelcCode"
})
@Generated("jsonschema2pojo")
public class ExternalReportCodes100GetRequest {

    /**
     * Entity
     * <p>
     * Lineage reference object : FTVEELI_EENT_CODE
     * 
     */
    @JsonProperty("eentCode")
    @JsonPropertyDescription("Lineage reference object : FTVEELI_EENT_CODE")
    private String eentCode;
    /**
     * Effective
     * Date
     * <p>
     * Lineage reference object : FTVEELI_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    @JsonPropertyDescription("Lineage reference object : FTVEELI_EFF_DATE")
    private Date effDate;
    /**
     * External
     * Code
     * <p>
     * Lineage reference object : FTVEELI_EELI_CODE
     * 
     */
    @JsonProperty("eeliCode")
    @JsonPropertyDescription("Lineage reference object : FTVEELI_EELI_CODE")
    private String eeliCode;
    /**
     * Status
     * <p>
     * Lineage reference object : FTVEELI_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : FTVEELI_STATUS_IND")
    private String statusInd;
    /**
     * COA
     * <p>
     * Lineage reference object : FTVEELI_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : FTVEELI_COAS_CODE")
    private String coasCode;
    /**
     * Title
     * <p>
     * Lineage reference object : FTVEELI_TITLE
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("Lineage reference object : FTVEELI_TITLE")
    private String title;
    /**
     * Internal
     * Element
     * <p>
     * Lineage reference object : FTVEELI_EELC_CODE
     * 
     */
    @JsonProperty("eelcCode")
    @JsonPropertyDescription("Lineage reference object : FTVEELI_EELC_CODE")
    private String eelcCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Entity
     * <p>
     * Lineage reference object : FTVEELI_EENT_CODE
     * 
     */
    @JsonProperty("eentCode")
    public String getEentCode() {
        return eentCode;
    }

    /**
     * Entity
     * <p>
     * Lineage reference object : FTVEELI_EENT_CODE
     * 
     */
    @JsonProperty("eentCode")
    public void setEentCode(String eentCode) {
        this.eentCode = eentCode;
    }

    public ExternalReportCodes100GetRequest withEentCode(String eentCode) {
        this.eentCode = eentCode;
        return this;
    }

    /**
     * Effective
     * Date
     * <p>
     * Lineage reference object : FTVEELI_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    public Date getEffDate() {
        return effDate;
    }

    /**
     * Effective
     * Date
     * <p>
     * Lineage reference object : FTVEELI_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public ExternalReportCodes100GetRequest withEffDate(Date effDate) {
        this.effDate = effDate;
        return this;
    }

    /**
     * External
     * Code
     * <p>
     * Lineage reference object : FTVEELI_EELI_CODE
     * 
     */
    @JsonProperty("eeliCode")
    public String getEeliCode() {
        return eeliCode;
    }

    /**
     * External
     * Code
     * <p>
     * Lineage reference object : FTVEELI_EELI_CODE
     * 
     */
    @JsonProperty("eeliCode")
    public void setEeliCode(String eeliCode) {
        this.eeliCode = eeliCode;
    }

    public ExternalReportCodes100GetRequest withEeliCode(String eeliCode) {
        this.eeliCode = eeliCode;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : FTVEELI_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public String getStatusInd() {
        return statusInd;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : FTVEELI_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public void setStatusInd(String statusInd) {
        this.statusInd = statusInd;
    }

    public ExternalReportCodes100GetRequest withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : FTVEELI_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    public String getCoasCode() {
        return coasCode;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : FTVEELI_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public ExternalReportCodes100GetRequest withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : FTVEELI_TITLE
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : FTVEELI_TITLE
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public ExternalReportCodes100GetRequest withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Internal
     * Element
     * <p>
     * Lineage reference object : FTVEELI_EELC_CODE
     * 
     */
    @JsonProperty("eelcCode")
    public String getEelcCode() {
        return eelcCode;
    }

    /**
     * Internal
     * Element
     * <p>
     * Lineage reference object : FTVEELI_EELC_CODE
     * 
     */
    @JsonProperty("eelcCode")
    public void setEelcCode(String eelcCode) {
        this.eelcCode = eelcCode;
    }

    public ExternalReportCodes100GetRequest withEelcCode(String eelcCode) {
        this.eelcCode = eelcCode;
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

    public ExternalReportCodes100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ExternalReportCodes100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("eentCode");
        sb.append('=');
        sb.append(((this.eentCode == null)?"<null>":this.eentCode));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("eeliCode");
        sb.append('=');
        sb.append(((this.eeliCode == null)?"<null>":this.eeliCode));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("eelcCode");
        sb.append('=');
        sb.append(((this.eelcCode == null)?"<null>":this.eelcCode));
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
        result = ((result* 31)+((this.eentCode == null)? 0 :this.eentCode.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.eeliCode == null)? 0 :this.eeliCode.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.eelcCode == null)? 0 :this.eelcCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExternalReportCodes100GetRequest) == false) {
            return false;
        }
        ExternalReportCodes100GetRequest rhs = ((ExternalReportCodes100GetRequest) other);
        return (((((((((this.eentCode == rhs.eentCode)||((this.eentCode!= null)&&this.eentCode.equals(rhs.eentCode)))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.eeliCode == rhs.eeliCode)||((this.eeliCode!= null)&&this.eeliCode.equals(rhs.eeliCode))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.eelcCode == rhs.eelcCode)||((this.eelcCode!= null)&&this.eelcCode.equals(rhs.eelcCode))));
    }

}
