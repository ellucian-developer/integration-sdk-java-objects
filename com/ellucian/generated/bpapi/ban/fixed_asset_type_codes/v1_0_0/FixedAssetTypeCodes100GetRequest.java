
package com.ellucian.generated.bpapi.ban.fixed_asset_type_codes.v1_0_0;

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
    "statusInd",
    "termDate",
    "title",
    "astyCode"
})
@Generated("jsonschema2pojo")
public class FixedAssetTypeCodes100GetRequest {

    /**
     * Effective
     * Date
     * <p>
     * Lineage reference object : FTVASTY_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    @JsonPropertyDescription("Lineage reference object : FTVASTY_EFF_DATE")
    private Date effDate;
    /**
     * Status
     * <p>
     * Lineage reference object : FTVASTY_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : FTVASTY_STATUS_IND")
    private String statusInd;
    /**
     * Termination
     * Date
     * <p>
     * Lineage reference object : FTVASTY_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    @JsonPropertyDescription("Lineage reference object : FTVASTY_TERM_DATE")
    private Date termDate;
    /**
     * Title
     * <p>
     * Lineage reference object : FTVASTY_TITLE
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("Lineage reference object : FTVASTY_TITLE")
    private String title;
    /**
     * Asset
     * Type
     * <p>
     * Lineage reference object : FTVASTY_ASTY_CODE
     * 
     */
    @JsonProperty("astyCode")
    @JsonPropertyDescription("Lineage reference object : FTVASTY_ASTY_CODE")
    private String astyCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Effective
     * Date
     * <p>
     * Lineage reference object : FTVASTY_EFF_DATE
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
     * Lineage reference object : FTVASTY_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public FixedAssetTypeCodes100GetRequest withEffDate(Date effDate) {
        this.effDate = effDate;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : FTVASTY_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public String getStatusInd() {
        return statusInd;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : FTVASTY_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public void setStatusInd(String statusInd) {
        this.statusInd = statusInd;
    }

    public FixedAssetTypeCodes100GetRequest withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * Termination
     * Date
     * <p>
     * Lineage reference object : FTVASTY_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public Date getTermDate() {
        return termDate;
    }

    /**
     * Termination
     * Date
     * <p>
     * Lineage reference object : FTVASTY_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public void setTermDate(Date termDate) {
        this.termDate = termDate;
    }

    public FixedAssetTypeCodes100GetRequest withTermDate(Date termDate) {
        this.termDate = termDate;
        return this;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : FTVASTY_TITLE
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : FTVASTY_TITLE
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public FixedAssetTypeCodes100GetRequest withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Asset
     * Type
     * <p>
     * Lineage reference object : FTVASTY_ASTY_CODE
     * 
     */
    @JsonProperty("astyCode")
    public String getAstyCode() {
        return astyCode;
    }

    /**
     * Asset
     * Type
     * <p>
     * Lineage reference object : FTVASTY_ASTY_CODE
     * 
     */
    @JsonProperty("astyCode")
    public void setAstyCode(String astyCode) {
        this.astyCode = astyCode;
    }

    public FixedAssetTypeCodes100GetRequest withAstyCode(String astyCode) {
        this.astyCode = astyCode;
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

    public FixedAssetTypeCodes100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FixedAssetTypeCodes100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
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
        sb.append("astyCode");
        sb.append('=');
        sb.append(((this.astyCode == null)?"<null>":this.astyCode));
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
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.astyCode == null)? 0 :this.astyCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FixedAssetTypeCodes100GetRequest) == false) {
            return false;
        }
        FixedAssetTypeCodes100GetRequest rhs = ((FixedAssetTypeCodes100GetRequest) other);
        return (((((((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate)))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.astyCode == rhs.astyCode)||((this.astyCode!= null)&&this.astyCode.equals(rhs.astyCode))));
    }

}
