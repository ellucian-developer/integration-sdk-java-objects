
package com.ellucian.generated.bpapi.ban.organization_codes.v1_0_0;

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
    "coasCode",
    "dataEntryInd",
    "effDate",
    "orgnCode",
    "statusInd",
    "termDate",
    "title"
})
@Generated("jsonschema2pojo")
public class OrganizationCodes100QapiPost {

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVORGN_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_COAS_CODE")
    private String coasCode;
    /**
     * Data Entry
     * <p>
     * Lineage reference object : FTVORGN_DATA_ENTRY_IND
     * 
     */
    @JsonProperty("dataEntryInd")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_DATA_ENTRY_IND")
    private String dataEntryInd;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVORGN_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_EFF_DATE")
    private Date effDate;
    /**
     * Organization Code
     * <p>
     * Lineage reference object : FTVORGN_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_ORGN_CODE")
    private String orgnCode;
    /**
     * Status
     * <p>
     * Lineage reference object : FTVORGN_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_STATUS_IND")
    private String statusInd;
    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVORGN_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_TERM_DATE")
    private Date termDate;
    /**
     * Title
     * <p>
     * Lineage reference object : FTVORGN_TITLE
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_TITLE")
    private String title;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVORGN_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    public String getCoasCode() {
        return coasCode;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVORGN_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public OrganizationCodes100QapiPost withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    /**
     * Data Entry
     * <p>
     * Lineage reference object : FTVORGN_DATA_ENTRY_IND
     * 
     */
    @JsonProperty("dataEntryInd")
    public String getDataEntryInd() {
        return dataEntryInd;
    }

    /**
     * Data Entry
     * <p>
     * Lineage reference object : FTVORGN_DATA_ENTRY_IND
     * 
     */
    @JsonProperty("dataEntryInd")
    public void setDataEntryInd(String dataEntryInd) {
        this.dataEntryInd = dataEntryInd;
    }

    public OrganizationCodes100QapiPost withDataEntryInd(String dataEntryInd) {
        this.dataEntryInd = dataEntryInd;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVORGN_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    public Date getEffDate() {
        return effDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVORGN_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public OrganizationCodes100QapiPost withEffDate(Date effDate) {
        this.effDate = effDate;
        return this;
    }

    /**
     * Organization Code
     * <p>
     * Lineage reference object : FTVORGN_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    public String getOrgnCode() {
        return orgnCode;
    }

    /**
     * Organization Code
     * <p>
     * Lineage reference object : FTVORGN_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    public void setOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
    }

    public OrganizationCodes100QapiPost withOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : FTVORGN_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public String getStatusInd() {
        return statusInd;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : FTVORGN_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public void setStatusInd(String statusInd) {
        this.statusInd = statusInd;
    }

    public OrganizationCodes100QapiPost withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVORGN_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public Date getTermDate() {
        return termDate;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVORGN_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public void setTermDate(Date termDate) {
        this.termDate = termDate;
    }

    public OrganizationCodes100QapiPost withTermDate(Date termDate) {
        this.termDate = termDate;
        return this;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : FTVORGN_TITLE
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : FTVORGN_TITLE
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public OrganizationCodes100QapiPost withTitle(String title) {
        this.title = title;
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

    public OrganizationCodes100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OrganizationCodes100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("dataEntryInd");
        sb.append('=');
        sb.append(((this.dataEntryInd == null)?"<null>":this.dataEntryInd));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("orgnCode");
        sb.append('=');
        sb.append(((this.orgnCode == null)?"<null>":this.orgnCode));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
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
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.dataEntryInd == null)? 0 :this.dataEntryInd.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.orgnCode == null)? 0 :this.orgnCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OrganizationCodes100QapiPost) == false) {
            return false;
        }
        OrganizationCodes100QapiPost rhs = ((OrganizationCodes100QapiPost) other);
        return (((((((((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate)))&&((this.dataEntryInd == rhs.dataEntryInd)||((this.dataEntryInd!= null)&&this.dataEntryInd.equals(rhs.dataEntryInd))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.orgnCode == rhs.orgnCode)||((this.orgnCode!= null)&&this.orgnCode.equals(rhs.orgnCode))));
    }

}
