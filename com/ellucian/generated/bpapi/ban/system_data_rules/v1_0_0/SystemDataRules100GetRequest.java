
package com.ellucian.generated.bpapi.ban.system_data_rules.v1_0_0;

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
    "effDate",
    "data",
    "sdatCodeOpt2",
    "codeLevel",
    "sdatCodeEntity",
    "statusInd",
    "coasCode",
    "sdatCodeOpt1",
    "shortTitle",
    "sdatCodeAttr",
    "termDate"
})
@Generated("jsonschema2pojo")
public class SystemDataRules100GetRequest {

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVSDAT_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    @JsonPropertyDescription("Lineage reference object : FTVSDAT_EFF_DATE")
    private Date effDate;
    /**
     * Data
     * <p>
     * Lineage reference object : FTVSDAT_DATA
     * 
     */
    @JsonProperty("data")
    @JsonPropertyDescription("Lineage reference object : FTVSDAT_DATA")
    private String data;
    /**
     * Option 2
     * <p>
     * Lineage reference object : FTVSDAT_SDAT_CODE_OPT_2
     * 
     */
    @JsonProperty("sdatCodeOpt2")
    @JsonPropertyDescription("Lineage reference object : FTVSDAT_SDAT_CODE_OPT_2")
    private String sdatCodeOpt2;
    /**
     * Level
     * <p>
     * Lineage reference object : FTVSDAT_CODE_LEVEL
     * 
     */
    @JsonProperty("codeLevel")
    @JsonPropertyDescription("Lineage reference object : FTVSDAT_CODE_LEVEL")
    private Double codeLevel;
    /**
     * Entity
     * <p>
     * Lineage reference object : FTVSDAT_SDAT_CODE_ENTITY
     * 
     */
    @JsonProperty("sdatCodeEntity")
    @JsonPropertyDescription("Lineage reference object : FTVSDAT_SDAT_CODE_ENTITY")
    private String sdatCodeEntity;
    /**
     * Status
     * <p>
     * Lineage reference object : FTVSDAT_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : FTVSDAT_STATUS_IND")
    private String statusInd;
    /**
     * COA
     * <p>
     * Lineage reference object : FTVSDAT_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : FTVSDAT_COAS_CODE")
    private String coasCode;
    /**
     * Option 1
     * <p>
     * Lineage reference object : FTVSDAT_SDAT_CODE_OPT_1
     * 
     */
    @JsonProperty("sdatCodeOpt1")
    @JsonPropertyDescription("Lineage reference object : FTVSDAT_SDAT_CODE_OPT_1")
    private String sdatCodeOpt1;
    /**
     * Short Title
     * <p>
     * Lineage reference object : FTVSDAT_SHORT_TITLE
     * 
     */
    @JsonProperty("shortTitle")
    @JsonPropertyDescription("Lineage reference object : FTVSDAT_SHORT_TITLE")
    private String shortTitle;
    /**
     * Attribute
     * <p>
     * Lineage reference object : FTVSDAT_SDAT_CODE_ATTR
     * 
     */
    @JsonProperty("sdatCodeAttr")
    @JsonPropertyDescription("Lineage reference object : FTVSDAT_SDAT_CODE_ATTR")
    private String sdatCodeAttr;
    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVSDAT_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    @JsonPropertyDescription("Lineage reference object : FTVSDAT_TERM_DATE")
    private Date termDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVSDAT_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    public Date getEffDate() {
        return effDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVSDAT_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public SystemDataRules100GetRequest withEffDate(Date effDate) {
        this.effDate = effDate;
        return this;
    }

    /**
     * Data
     * <p>
     * Lineage reference object : FTVSDAT_DATA
     * 
     */
    @JsonProperty("data")
    public String getData() {
        return data;
    }

    /**
     * Data
     * <p>
     * Lineage reference object : FTVSDAT_DATA
     * 
     */
    @JsonProperty("data")
    public void setData(String data) {
        this.data = data;
    }

    public SystemDataRules100GetRequest withData(String data) {
        this.data = data;
        return this;
    }

    /**
     * Option 2
     * <p>
     * Lineage reference object : FTVSDAT_SDAT_CODE_OPT_2
     * 
     */
    @JsonProperty("sdatCodeOpt2")
    public String getSdatCodeOpt2() {
        return sdatCodeOpt2;
    }

    /**
     * Option 2
     * <p>
     * Lineage reference object : FTVSDAT_SDAT_CODE_OPT_2
     * 
     */
    @JsonProperty("sdatCodeOpt2")
    public void setSdatCodeOpt2(String sdatCodeOpt2) {
        this.sdatCodeOpt2 = sdatCodeOpt2;
    }

    public SystemDataRules100GetRequest withSdatCodeOpt2(String sdatCodeOpt2) {
        this.sdatCodeOpt2 = sdatCodeOpt2;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : FTVSDAT_CODE_LEVEL
     * 
     */
    @JsonProperty("codeLevel")
    public Double getCodeLevel() {
        return codeLevel;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : FTVSDAT_CODE_LEVEL
     * 
     */
    @JsonProperty("codeLevel")
    public void setCodeLevel(Double codeLevel) {
        this.codeLevel = codeLevel;
    }

    public SystemDataRules100GetRequest withCodeLevel(Double codeLevel) {
        this.codeLevel = codeLevel;
        return this;
    }

    /**
     * Entity
     * <p>
     * Lineage reference object : FTVSDAT_SDAT_CODE_ENTITY
     * 
     */
    @JsonProperty("sdatCodeEntity")
    public String getSdatCodeEntity() {
        return sdatCodeEntity;
    }

    /**
     * Entity
     * <p>
     * Lineage reference object : FTVSDAT_SDAT_CODE_ENTITY
     * 
     */
    @JsonProperty("sdatCodeEntity")
    public void setSdatCodeEntity(String sdatCodeEntity) {
        this.sdatCodeEntity = sdatCodeEntity;
    }

    public SystemDataRules100GetRequest withSdatCodeEntity(String sdatCodeEntity) {
        this.sdatCodeEntity = sdatCodeEntity;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : FTVSDAT_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public String getStatusInd() {
        return statusInd;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : FTVSDAT_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public void setStatusInd(String statusInd) {
        this.statusInd = statusInd;
    }

    public SystemDataRules100GetRequest withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : FTVSDAT_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    public String getCoasCode() {
        return coasCode;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : FTVSDAT_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public SystemDataRules100GetRequest withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    /**
     * Option 1
     * <p>
     * Lineage reference object : FTVSDAT_SDAT_CODE_OPT_1
     * 
     */
    @JsonProperty("sdatCodeOpt1")
    public String getSdatCodeOpt1() {
        return sdatCodeOpt1;
    }

    /**
     * Option 1
     * <p>
     * Lineage reference object : FTVSDAT_SDAT_CODE_OPT_1
     * 
     */
    @JsonProperty("sdatCodeOpt1")
    public void setSdatCodeOpt1(String sdatCodeOpt1) {
        this.sdatCodeOpt1 = sdatCodeOpt1;
    }

    public SystemDataRules100GetRequest withSdatCodeOpt1(String sdatCodeOpt1) {
        this.sdatCodeOpt1 = sdatCodeOpt1;
        return this;
    }

    /**
     * Short Title
     * <p>
     * Lineage reference object : FTVSDAT_SHORT_TITLE
     * 
     */
    @JsonProperty("shortTitle")
    public String getShortTitle() {
        return shortTitle;
    }

    /**
     * Short Title
     * <p>
     * Lineage reference object : FTVSDAT_SHORT_TITLE
     * 
     */
    @JsonProperty("shortTitle")
    public void setShortTitle(String shortTitle) {
        this.shortTitle = shortTitle;
    }

    public SystemDataRules100GetRequest withShortTitle(String shortTitle) {
        this.shortTitle = shortTitle;
        return this;
    }

    /**
     * Attribute
     * <p>
     * Lineage reference object : FTVSDAT_SDAT_CODE_ATTR
     * 
     */
    @JsonProperty("sdatCodeAttr")
    public String getSdatCodeAttr() {
        return sdatCodeAttr;
    }

    /**
     * Attribute
     * <p>
     * Lineage reference object : FTVSDAT_SDAT_CODE_ATTR
     * 
     */
    @JsonProperty("sdatCodeAttr")
    public void setSdatCodeAttr(String sdatCodeAttr) {
        this.sdatCodeAttr = sdatCodeAttr;
    }

    public SystemDataRules100GetRequest withSdatCodeAttr(String sdatCodeAttr) {
        this.sdatCodeAttr = sdatCodeAttr;
        return this;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVSDAT_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public Date getTermDate() {
        return termDate;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVSDAT_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public void setTermDate(Date termDate) {
        this.termDate = termDate;
    }

    public SystemDataRules100GetRequest withTermDate(Date termDate) {
        this.termDate = termDate;
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

    public SystemDataRules100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SystemDataRules100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("data");
        sb.append('=');
        sb.append(((this.data == null)?"<null>":this.data));
        sb.append(',');
        sb.append("sdatCodeOpt2");
        sb.append('=');
        sb.append(((this.sdatCodeOpt2 == null)?"<null>":this.sdatCodeOpt2));
        sb.append(',');
        sb.append("codeLevel");
        sb.append('=');
        sb.append(((this.codeLevel == null)?"<null>":this.codeLevel));
        sb.append(',');
        sb.append("sdatCodeEntity");
        sb.append('=');
        sb.append(((this.sdatCodeEntity == null)?"<null>":this.sdatCodeEntity));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("sdatCodeOpt1");
        sb.append('=');
        sb.append(((this.sdatCodeOpt1 == null)?"<null>":this.sdatCodeOpt1));
        sb.append(',');
        sb.append("shortTitle");
        sb.append('=');
        sb.append(((this.shortTitle == null)?"<null>":this.shortTitle));
        sb.append(',');
        sb.append("sdatCodeAttr");
        sb.append('=');
        sb.append(((this.sdatCodeAttr == null)?"<null>":this.sdatCodeAttr));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
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
        result = ((result* 31)+((this.data == null)? 0 :this.data.hashCode()));
        result = ((result* 31)+((this.sdatCodeOpt2 == null)? 0 :this.sdatCodeOpt2 .hashCode()));
        result = ((result* 31)+((this.sdatCodeEntity == null)? 0 :this.sdatCodeEntity.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.shortTitle == null)? 0 :this.shortTitle.hashCode()));
        result = ((result* 31)+((this.sdatCodeAttr == null)? 0 :this.sdatCodeAttr.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.codeLevel == null)? 0 :this.codeLevel.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.sdatCodeOpt1 == null)? 0 :this.sdatCodeOpt1 .hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SystemDataRules100GetRequest) == false) {
            return false;
        }
        SystemDataRules100GetRequest rhs = ((SystemDataRules100GetRequest) other);
        return (((((((((((((this.data == rhs.data)||((this.data!= null)&&this.data.equals(rhs.data)))&&((this.sdatCodeOpt2 == rhs.sdatCodeOpt2)||((this.sdatCodeOpt2 != null)&&this.sdatCodeOpt2 .equals(rhs.sdatCodeOpt2))))&&((this.sdatCodeEntity == rhs.sdatCodeEntity)||((this.sdatCodeEntity!= null)&&this.sdatCodeEntity.equals(rhs.sdatCodeEntity))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.shortTitle == rhs.shortTitle)||((this.shortTitle!= null)&&this.shortTitle.equals(rhs.shortTitle))))&&((this.sdatCodeAttr == rhs.sdatCodeAttr)||((this.sdatCodeAttr!= null)&&this.sdatCodeAttr.equals(rhs.sdatCodeAttr))))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.codeLevel == rhs.codeLevel)||((this.codeLevel!= null)&&this.codeLevel.equals(rhs.codeLevel))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.sdatCodeOpt1 == rhs.sdatCodeOpt1)||((this.sdatCodeOpt1 != null)&&this.sdatCodeOpt1 .equals(rhs.sdatCodeOpt1))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))));
    }

}
