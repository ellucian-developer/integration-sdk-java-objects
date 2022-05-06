
package com.ellucian.generated.bpapi.ban.commodities.v1_0_0;

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
    "stockInd",
    "effDate",
    "code",
    "amstInd",
    "termDate",
    "desc",
    "uomsCode"
})
@Generated("jsonschema2pojo")
public class Commodities100GetResponse {

    /**
     * Stock
     * <p>
     * Lineage reference object : FTVCOMM_STOCK_IND
     * 
     */
    @JsonProperty("stockInd")
    @JsonPropertyDescription("Lineage reference object : FTVCOMM_STOCK_IND")
    private String stockInd;
    /**
     * Start
     * Date
     * <p>
     * Lineage reference object : FTVCOMM_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    @JsonPropertyDescription("Lineage reference object : FTVCOMM_EFF_DATE")
    private Date effDate;
    /**
     * Commodity
     * Code
     * <p>
     * Lineage reference object : FTVCOMM_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : FTVCOMM_CODE")
    private String code;
    /**
     * Fixed
     * Asset
     * <p>
     * Lineage reference object : FTVCOMM_AMST_IND
     * 
     */
    @JsonProperty("amstInd")
    @JsonPropertyDescription("Lineage reference object : FTVCOMM_AMST_IND")
    private String amstInd;
    /**
     * Termination
     * Date
     * <p>
     * Lineage reference object : FTVCOMM_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    @JsonPropertyDescription("Lineage reference object : FTVCOMM_TERM_DATE")
    private Date termDate;
    /**
     * Description
     * <p>
     * Lineage reference object : FTVCOMM_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : FTVCOMM_DESC")
    private String desc;
    /**
     * U/M
     * <p>
     * Lineage reference object : FTVCOMM_UOMS_CODE
     * 
     */
    @JsonProperty("uomsCode")
    @JsonPropertyDescription("Lineage reference object : FTVCOMM_UOMS_CODE")
    private String uomsCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Stock
     * <p>
     * Lineage reference object : FTVCOMM_STOCK_IND
     * 
     */
    @JsonProperty("stockInd")
    public String getStockInd() {
        return stockInd;
    }

    /**
     * Stock
     * <p>
     * Lineage reference object : FTVCOMM_STOCK_IND
     * 
     */
    @JsonProperty("stockInd")
    public void setStockInd(String stockInd) {
        this.stockInd = stockInd;
    }

    public Commodities100GetResponse withStockInd(String stockInd) {
        this.stockInd = stockInd;
        return this;
    }

    /**
     * Start
     * Date
     * <p>
     * Lineage reference object : FTVCOMM_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    public Date getEffDate() {
        return effDate;
    }

    /**
     * Start
     * Date
     * <p>
     * Lineage reference object : FTVCOMM_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public Commodities100GetResponse withEffDate(Date effDate) {
        this.effDate = effDate;
        return this;
    }

    /**
     * Commodity
     * Code
     * <p>
     * Lineage reference object : FTVCOMM_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Commodity
     * Code
     * <p>
     * Lineage reference object : FTVCOMM_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public Commodities100GetResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Fixed
     * Asset
     * <p>
     * Lineage reference object : FTVCOMM_AMST_IND
     * 
     */
    @JsonProperty("amstInd")
    public String getAmstInd() {
        return amstInd;
    }

    /**
     * Fixed
     * Asset
     * <p>
     * Lineage reference object : FTVCOMM_AMST_IND
     * 
     */
    @JsonProperty("amstInd")
    public void setAmstInd(String amstInd) {
        this.amstInd = amstInd;
    }

    public Commodities100GetResponse withAmstInd(String amstInd) {
        this.amstInd = amstInd;
        return this;
    }

    /**
     * Termination
     * Date
     * <p>
     * Lineage reference object : FTVCOMM_TERM_DATE
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
     * Lineage reference object : FTVCOMM_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public void setTermDate(Date termDate) {
        this.termDate = termDate;
    }

    public Commodities100GetResponse withTermDate(Date termDate) {
        this.termDate = termDate;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : FTVCOMM_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : FTVCOMM_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Commodities100GetResponse withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * U/M
     * <p>
     * Lineage reference object : FTVCOMM_UOMS_CODE
     * 
     */
    @JsonProperty("uomsCode")
    public String getUomsCode() {
        return uomsCode;
    }

    /**
     * U/M
     * <p>
     * Lineage reference object : FTVCOMM_UOMS_CODE
     * 
     */
    @JsonProperty("uomsCode")
    public void setUomsCode(String uomsCode) {
        this.uomsCode = uomsCode;
    }

    public Commodities100GetResponse withUomsCode(String uomsCode) {
        this.uomsCode = uomsCode;
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

    public Commodities100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Commodities100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("stockInd");
        sb.append('=');
        sb.append(((this.stockInd == null)?"<null>":this.stockInd));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("amstInd");
        sb.append('=');
        sb.append(((this.amstInd == null)?"<null>":this.amstInd));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("uomsCode");
        sb.append('=');
        sb.append(((this.uomsCode == null)?"<null>":this.uomsCode));
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
        result = ((result* 31)+((this.stockInd == null)? 0 :this.stockInd.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.amstInd == null)? 0 :this.amstInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        result = ((result* 31)+((this.uomsCode == null)? 0 :this.uomsCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Commodities100GetResponse) == false) {
            return false;
        }
        Commodities100GetResponse rhs = ((Commodities100GetResponse) other);
        return (((((((((this.stockInd == rhs.stockInd)||((this.stockInd!= null)&&this.stockInd.equals(rhs.stockInd)))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.amstInd == rhs.amstInd)||((this.amstInd!= null)&&this.amstInd.equals(rhs.amstInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.uomsCode == rhs.uomsCode)||((this.uomsCode!= null)&&this.uomsCode.equals(rhs.uomsCode))));
    }

}
