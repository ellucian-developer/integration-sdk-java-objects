
package com.ellucian.generated.bpapi.ban.test_score_information.v0_1_0;

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
    "percentileDate",
    "percentile",
    "tsptCode",
    "stvtsptDesc"
})
@Generated("jsonschema2pojo")
public class Sortspc__1 {

    /**
     * Percentile Date
     * <p>
     * Lineage reference object : SORTSPC_PERCENTILE_DATE
     * 
     */
    @JsonProperty("percentileDate")
    @JsonPropertyDescription("Lineage reference object : SORTSPC_PERCENTILE_DATE")
    private Date percentileDate;
    /**
     * Percentile
     * <p>
     * Lineage reference object : SORTSPC_PERCENTILE
     * 
     */
    @JsonProperty("percentile")
    @JsonPropertyDescription("Lineage reference object : SORTSPC_PERCENTILE")
    private String percentile;
    /**
     * Percentile Type
     * <p>
     * Lineage reference object : SORTSPC_TSPT_CODE, Lookup lineage reference object : stvtspt
     * 
     */
    @JsonProperty("tsptCode")
    @JsonPropertyDescription("Lineage reference object : SORTSPC_TSPT_CODE, Lookup lineage reference object : stvtspt")
    private String tsptCode;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvtsptDesc")
    private String stvtsptDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Percentile Date
     * <p>
     * Lineage reference object : SORTSPC_PERCENTILE_DATE
     * 
     */
    @JsonProperty("percentileDate")
    public Date getPercentileDate() {
        return percentileDate;
    }

    /**
     * Percentile Date
     * <p>
     * Lineage reference object : SORTSPC_PERCENTILE_DATE
     * 
     */
    @JsonProperty("percentileDate")
    public void setPercentileDate(Date percentileDate) {
        this.percentileDate = percentileDate;
    }

    public Sortspc__1 withPercentileDate(Date percentileDate) {
        this.percentileDate = percentileDate;
        return this;
    }

    /**
     * Percentile
     * <p>
     * Lineage reference object : SORTSPC_PERCENTILE
     * 
     */
    @JsonProperty("percentile")
    public String getPercentile() {
        return percentile;
    }

    /**
     * Percentile
     * <p>
     * Lineage reference object : SORTSPC_PERCENTILE
     * 
     */
    @JsonProperty("percentile")
    public void setPercentile(String percentile) {
        this.percentile = percentile;
    }

    public Sortspc__1 withPercentile(String percentile) {
        this.percentile = percentile;
        return this;
    }

    /**
     * Percentile Type
     * <p>
     * Lineage reference object : SORTSPC_TSPT_CODE, Lookup lineage reference object : stvtspt
     * 
     */
    @JsonProperty("tsptCode")
    public String getTsptCode() {
        return tsptCode;
    }

    /**
     * Percentile Type
     * <p>
     * Lineage reference object : SORTSPC_TSPT_CODE, Lookup lineage reference object : stvtspt
     * 
     */
    @JsonProperty("tsptCode")
    public void setTsptCode(String tsptCode) {
        this.tsptCode = tsptCode;
    }

    public Sortspc__1 withTsptCode(String tsptCode) {
        this.tsptCode = tsptCode;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvtsptDesc")
    public String getStvtsptDesc() {
        return stvtsptDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvtsptDesc")
    public void setStvtsptDesc(String stvtsptDesc) {
        this.stvtsptDesc = stvtsptDesc;
    }

    public Sortspc__1 withStvtsptDesc(String stvtsptDesc) {
        this.stvtsptDesc = stvtsptDesc;
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

    public Sortspc__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sortspc__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("percentileDate");
        sb.append('=');
        sb.append(((this.percentileDate == null)?"<null>":this.percentileDate));
        sb.append(',');
        sb.append("percentile");
        sb.append('=');
        sb.append(((this.percentile == null)?"<null>":this.percentile));
        sb.append(',');
        sb.append("tsptCode");
        sb.append('=');
        sb.append(((this.tsptCode == null)?"<null>":this.tsptCode));
        sb.append(',');
        sb.append("stvtsptDesc");
        sb.append('=');
        sb.append(((this.stvtsptDesc == null)?"<null>":this.stvtsptDesc));
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
        result = ((result* 31)+((this.percentileDate == null)? 0 :this.percentileDate.hashCode()));
        result = ((result* 31)+((this.percentile == null)? 0 :this.percentile.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.stvtsptDesc == null)? 0 :this.stvtsptDesc.hashCode()));
        result = ((result* 31)+((this.tsptCode == null)? 0 :this.tsptCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sortspc__1) == false) {
            return false;
        }
        Sortspc__1 rhs = ((Sortspc__1) other);
        return ((((((this.percentileDate == rhs.percentileDate)||((this.percentileDate!= null)&&this.percentileDate.equals(rhs.percentileDate)))&&((this.percentile == rhs.percentile)||((this.percentile!= null)&&this.percentile.equals(rhs.percentile))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.stvtsptDesc == rhs.stvtsptDesc)||((this.stvtsptDesc!= null)&&this.stvtsptDesc.equals(rhs.stvtsptDesc))))&&((this.tsptCode == rhs.tsptCode)||((this.tsptCode!= null)&&this.tsptCode.equals(rhs.tsptCode))));
    }

}
