
package com.ellucian.generated.bpapi.ban.finance_detail_codes.v1_0_0;

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
    "tbbeactDetailCode",
    "tbbeactEffDate",
    "displayNchgDate",
    "tbbeactDetailDesc"
})
@Generated("jsonschema2pojo")
public class Tbbeact2 {

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBBEACT_DETAIL_CODE
     * (Required)
     * 
     */
    @JsonProperty("tbbeactDetailCode")
    @JsonPropertyDescription("Lineage reference object : TBBEACT_DETAIL_CODE")
    private String tbbeactDetailCode;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : TBBEACT_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("tbbeactEffDate")
    @JsonPropertyDescription("Lineage reference object : TBBEACT_EFF_DATE")
    private Date tbbeactEffDate;
    /**
     * Next Change Date
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNchgDate")
    private Date displayNchgDate;
    @JsonProperty("tbbeactDetailDesc")
    private String tbbeactDetailDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBBEACT_DETAIL_CODE
     * (Required)
     * 
     */
    @JsonProperty("tbbeactDetailCode")
    public String getTbbeactDetailCode() {
        return tbbeactDetailCode;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBBEACT_DETAIL_CODE
     * (Required)
     * 
     */
    @JsonProperty("tbbeactDetailCode")
    public void setTbbeactDetailCode(String tbbeactDetailCode) {
        this.tbbeactDetailCode = tbbeactDetailCode;
    }

    public Tbbeact2 withTbbeactDetailCode(String tbbeactDetailCode) {
        this.tbbeactDetailCode = tbbeactDetailCode;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : TBBEACT_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("tbbeactEffDate")
    public Date getTbbeactEffDate() {
        return tbbeactEffDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : TBBEACT_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("tbbeactEffDate")
    public void setTbbeactEffDate(Date tbbeactEffDate) {
        this.tbbeactEffDate = tbbeactEffDate;
    }

    public Tbbeact2 withTbbeactEffDate(Date tbbeactEffDate) {
        this.tbbeactEffDate = tbbeactEffDate;
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

    public Tbbeact2 withDisplayNchgDate(Date displayNchgDate) {
        this.displayNchgDate = displayNchgDate;
        return this;
    }

    @JsonProperty("tbbeactDetailDesc")
    public String getTbbeactDetailDesc() {
        return tbbeactDetailDesc;
    }

    @JsonProperty("tbbeactDetailDesc")
    public void setTbbeactDetailDesc(String tbbeactDetailDesc) {
        this.tbbeactDetailDesc = tbbeactDetailDesc;
    }

    public Tbbeact2 withTbbeactDetailDesc(String tbbeactDetailDesc) {
        this.tbbeactDetailDesc = tbbeactDetailDesc;
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

    public Tbbeact2 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Tbbeact2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tbbeactDetailCode");
        sb.append('=');
        sb.append(((this.tbbeactDetailCode == null)?"<null>":this.tbbeactDetailCode));
        sb.append(',');
        sb.append("tbbeactEffDate");
        sb.append('=');
        sb.append(((this.tbbeactEffDate == null)?"<null>":this.tbbeactEffDate));
        sb.append(',');
        sb.append("displayNchgDate");
        sb.append('=');
        sb.append(((this.displayNchgDate == null)?"<null>":this.displayNchgDate));
        sb.append(',');
        sb.append("tbbeactDetailDesc");
        sb.append('=');
        sb.append(((this.tbbeactDetailDesc == null)?"<null>":this.tbbeactDetailDesc));
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
        result = ((result* 31)+((this.tbbeactDetailCode == null)? 0 :this.tbbeactDetailCode.hashCode()));
        result = ((result* 31)+((this.tbbeactEffDate == null)? 0 :this.tbbeactEffDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.displayNchgDate == null)? 0 :this.displayNchgDate.hashCode()));
        result = ((result* 31)+((this.tbbeactDetailDesc == null)? 0 :this.tbbeactDetailDesc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tbbeact2) == false) {
            return false;
        }
        Tbbeact2 rhs = ((Tbbeact2) other);
        return ((((((this.tbbeactDetailCode == rhs.tbbeactDetailCode)||((this.tbbeactDetailCode!= null)&&this.tbbeactDetailCode.equals(rhs.tbbeactDetailCode)))&&((this.tbbeactEffDate == rhs.tbbeactEffDate)||((this.tbbeactEffDate!= null)&&this.tbbeactEffDate.equals(rhs.tbbeactEffDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.displayNchgDate == rhs.displayNchgDate)||((this.displayNchgDate!= null)&&this.displayNchgDate.equals(rhs.displayNchgDate))))&&((this.tbbeactDetailDesc == rhs.tbbeactDetailDesc)||((this.tbbeactDetailDesc!= null)&&this.tbbeactDetailDesc.equals(rhs.tbbeactDetailDesc))));
    }

}
