
package com.ellucian.generated.bpapi.ban.fixed_asset_depreciation_codes.v1_0_0;

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
    "deprCode",
    "effDate",
    "statusInd",
    "termDate",
    "title"
})
@Generated("jsonschema2pojo")
public class FixedAssetDepreciationCodes100GetResponse {

    /**
     * Depreciation
     * Method Code
     * <p>
     * Lineage reference object : FTVDEPR_DEPR_CODE
     * 
     */
    @JsonProperty("deprCode")
    @JsonPropertyDescription("Lineage reference object : FTVDEPR_DEPR_CODE")
    private String deprCode;
    /**
     * Effective
     * Date
     * <p>
     * Lineage reference object : FTVDEPR_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    @JsonPropertyDescription("Lineage reference object : FTVDEPR_EFF_DATE")
    private Date effDate;
    /**
     * Status
     * <p>
     * Lineage reference object : FTVDEPR_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : FTVDEPR_STATUS_IND")
    private String statusInd;
    /**
     * Termination
     * Date
     * <p>
     * Lineage reference object : FTVDEPR_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    @JsonPropertyDescription("Lineage reference object : FTVDEPR_TERM_DATE")
    private Date termDate;
    /**
     * Title
     * <p>
     * Lineage reference object : FTVDEPR_TITLE
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("Lineage reference object : FTVDEPR_TITLE")
    private String title;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Depreciation
     * Method Code
     * <p>
     * Lineage reference object : FTVDEPR_DEPR_CODE
     * 
     */
    @JsonProperty("deprCode")
    public String getDeprCode() {
        return deprCode;
    }

    /**
     * Depreciation
     * Method Code
     * <p>
     * Lineage reference object : FTVDEPR_DEPR_CODE
     * 
     */
    @JsonProperty("deprCode")
    public void setDeprCode(String deprCode) {
        this.deprCode = deprCode;
    }

    public FixedAssetDepreciationCodes100GetResponse withDeprCode(String deprCode) {
        this.deprCode = deprCode;
        return this;
    }

    /**
     * Effective
     * Date
     * <p>
     * Lineage reference object : FTVDEPR_EFF_DATE
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
     * Lineage reference object : FTVDEPR_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public FixedAssetDepreciationCodes100GetResponse withEffDate(Date effDate) {
        this.effDate = effDate;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : FTVDEPR_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public String getStatusInd() {
        return statusInd;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : FTVDEPR_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public void setStatusInd(String statusInd) {
        this.statusInd = statusInd;
    }

    public FixedAssetDepreciationCodes100GetResponse withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * Termination
     * Date
     * <p>
     * Lineage reference object : FTVDEPR_TERM_DATE
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
     * Lineage reference object : FTVDEPR_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public void setTermDate(Date termDate) {
        this.termDate = termDate;
    }

    public FixedAssetDepreciationCodes100GetResponse withTermDate(Date termDate) {
        this.termDate = termDate;
        return this;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : FTVDEPR_TITLE
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : FTVDEPR_TITLE
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public FixedAssetDepreciationCodes100GetResponse withTitle(String title) {
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

    public FixedAssetDepreciationCodes100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FixedAssetDepreciationCodes100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("deprCode");
        sb.append('=');
        sb.append(((this.deprCode == null)?"<null>":this.deprCode));
        sb.append(',');
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
        result = ((result* 31)+((this.deprCode == null)? 0 :this.deprCode.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FixedAssetDepreciationCodes100GetResponse) == false) {
            return false;
        }
        FixedAssetDepreciationCodes100GetResponse rhs = ((FixedAssetDepreciationCodes100GetResponse) other);
        return (((((((this.deprCode == rhs.deprCode)||((this.deprCode!= null)&&this.deprCode.equals(rhs.deprCode)))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))));
    }

}
