
package com.ellucian.generated.bpapi.ban.student_detail_codes.v1_0_0;

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
    "detailDesc",
    "effDate",
    "displayNchgDate",
    "abdcInd",
    "detailCode",
    "tbdcInd"
})
@Generated("jsonschema2pojo")
public class Tbbeact {

    /**
     * Detail Code Description
     * <p>
     * 
     * 
     */
    @JsonProperty("detailDesc")
    private String detailDesc;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : TBBEACT_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    @JsonPropertyDescription("Lineage reference object : TBBEACT_EFF_DATE")
    private Date effDate;
    /**
     * Next Change Date
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNchgDate")
    private Date displayNchgDate;
    /**
     * Aid Year-based
     * <p>
     * Lineage reference object : TBBEACT_ABDC_IND
     * 
     */
    @JsonProperty("abdcInd")
    @JsonPropertyDescription("Lineage reference object : TBBEACT_ABDC_IND")
    private String abdcInd;
    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBBEACT_DETAIL_CODE
     * (Required)
     * 
     */
    @JsonProperty("detailCode")
    @JsonPropertyDescription("Lineage reference object : TBBEACT_DETAIL_CODE")
    private String detailCode;
    /**
     * Term-based
     * <p>
     * Lineage reference object : TBBEACT_TBDC_IND
     * 
     */
    @JsonProperty("tbdcInd")
    @JsonPropertyDescription("Lineage reference object : TBBEACT_TBDC_IND")
    private String tbdcInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Detail Code Description
     * <p>
     * 
     * 
     */
    @JsonProperty("detailDesc")
    public String getDetailDesc() {
        return detailDesc;
    }

    /**
     * Detail Code Description
     * <p>
     * 
     * 
     */
    @JsonProperty("detailDesc")
    public void setDetailDesc(String detailDesc) {
        this.detailDesc = detailDesc;
    }

    public Tbbeact withDetailDesc(String detailDesc) {
        this.detailDesc = detailDesc;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : TBBEACT_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    public Date getEffDate() {
        return effDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : TBBEACT_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public Tbbeact withEffDate(Date effDate) {
        this.effDate = effDate;
        return this;
    }

    /**
     * Next Change Date
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNchgDate")
    public Date getDisplayNchgDate() {
        return displayNchgDate;
    }

    /**
     * Next Change Date
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNchgDate")
    public void setDisplayNchgDate(Date displayNchgDate) {
        this.displayNchgDate = displayNchgDate;
    }

    public Tbbeact withDisplayNchgDate(Date displayNchgDate) {
        this.displayNchgDate = displayNchgDate;
        return this;
    }

    /**
     * Aid Year-based
     * <p>
     * Lineage reference object : TBBEACT_ABDC_IND
     * 
     */
    @JsonProperty("abdcInd")
    public String getAbdcInd() {
        return abdcInd;
    }

    /**
     * Aid Year-based
     * <p>
     * Lineage reference object : TBBEACT_ABDC_IND
     * 
     */
    @JsonProperty("abdcInd")
    public void setAbdcInd(String abdcInd) {
        this.abdcInd = abdcInd;
    }

    public Tbbeact withAbdcInd(String abdcInd) {
        this.abdcInd = abdcInd;
        return this;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBBEACT_DETAIL_CODE
     * (Required)
     * 
     */
    @JsonProperty("detailCode")
    public String getDetailCode() {
        return detailCode;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBBEACT_DETAIL_CODE
     * (Required)
     * 
     */
    @JsonProperty("detailCode")
    public void setDetailCode(String detailCode) {
        this.detailCode = detailCode;
    }

    public Tbbeact withDetailCode(String detailCode) {
        this.detailCode = detailCode;
        return this;
    }

    /**
     * Term-based
     * <p>
     * Lineage reference object : TBBEACT_TBDC_IND
     * 
     */
    @JsonProperty("tbdcInd")
    public String getTbdcInd() {
        return tbdcInd;
    }

    /**
     * Term-based
     * <p>
     * Lineage reference object : TBBEACT_TBDC_IND
     * 
     */
    @JsonProperty("tbdcInd")
    public void setTbdcInd(String tbdcInd) {
        this.tbdcInd = tbdcInd;
    }

    public Tbbeact withTbdcInd(String tbdcInd) {
        this.tbdcInd = tbdcInd;
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

    public Tbbeact withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Tbbeact.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("detailDesc");
        sb.append('=');
        sb.append(((this.detailDesc == null)?"<null>":this.detailDesc));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("displayNchgDate");
        sb.append('=');
        sb.append(((this.displayNchgDate == null)?"<null>":this.displayNchgDate));
        sb.append(',');
        sb.append("abdcInd");
        sb.append('=');
        sb.append(((this.abdcInd == null)?"<null>":this.abdcInd));
        sb.append(',');
        sb.append("detailCode");
        sb.append('=');
        sb.append(((this.detailCode == null)?"<null>":this.detailCode));
        sb.append(',');
        sb.append("tbdcInd");
        sb.append('=');
        sb.append(((this.tbdcInd == null)?"<null>":this.tbdcInd));
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
        result = ((result* 31)+((this.detailDesc == null)? 0 :this.detailDesc.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.displayNchgDate == null)? 0 :this.displayNchgDate.hashCode()));
        result = ((result* 31)+((this.abdcInd == null)? 0 :this.abdcInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.detailCode == null)? 0 :this.detailCode.hashCode()));
        result = ((result* 31)+((this.tbdcInd == null)? 0 :this.tbdcInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tbbeact) == false) {
            return false;
        }
        Tbbeact rhs = ((Tbbeact) other);
        return ((((((((this.detailDesc == rhs.detailDesc)||((this.detailDesc!= null)&&this.detailDesc.equals(rhs.detailDesc)))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.displayNchgDate == rhs.displayNchgDate)||((this.displayNchgDate!= null)&&this.displayNchgDate.equals(rhs.displayNchgDate))))&&((this.abdcInd == rhs.abdcInd)||((this.abdcInd!= null)&&this.abdcInd.equals(rhs.abdcInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.detailCode == rhs.detailCode)||((this.detailCode!= null)&&this.detailCode.equals(rhs.detailCode))))&&((this.tbdcInd == rhs.tbdcInd)||((this.tbdcInd!= null)&&this.tbdcInd.equals(rhs.tbdcInd))));
    }

}
