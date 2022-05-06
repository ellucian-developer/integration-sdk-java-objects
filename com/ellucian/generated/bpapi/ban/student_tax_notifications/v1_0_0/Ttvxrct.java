
package com.ellucian.generated.bpapi.ban.student_tax_notifications.v1_0_0;

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
    "equalSign3",
    "cumCb",
    "previousCb",
    "currentPr",
    "currentCb",
    "addSign1",
    "addSign2",
    "decreaseCB",
    "termCode"
})
@Generated("jsonschema2pojo")
public class Ttvxrct {

    /**
     *  =
     * <p>
     * 
     * 
     */
    @JsonProperty("equalSign3")
    private String equalSign3;
    /**
     * Cumulative Charges Billed
     * <p>
     * Lineage reference object : TTVXRCT_CUM_CB
     * 
     */
    @JsonProperty("cumCb")
    @JsonPropertyDescription("Lineage reference object : TTVXRCT_CUM_CB")
    private Double cumCb;
    /**
     * Previous Cumulative Charges Billed
     * <p>
     * Lineage reference object : TTVXRCT_PREVIOUS_CB
     * 
     */
    @JsonProperty("previousCb")
    @JsonPropertyDescription("Lineage reference object : TTVXRCT_PREVIOUS_CB")
    private Double previousCb;
    /**
     * Current Payments Received
     * <p>
     * Lineage reference object : TTVXRCT_CURRENT_PR
     * 
     */
    @JsonProperty("currentPr")
    @JsonPropertyDescription("Lineage reference object : TTVXRCT_CURRENT_PR")
    private Double currentPr;
    /**
     * Current Charges Billed
     * <p>
     * Lineage reference object : TTVXRCT_CURRENT_CB
     * 
     */
    @JsonProperty("currentCb")
    @JsonPropertyDescription("Lineage reference object : TTVXRCT_CURRENT_CB")
    private Double currentCb;
    /**
     * +
     * <p>
     * 
     * 
     */
    @JsonProperty("addSign1")
    private String addSign1;
    /**
     * +
     * <p>
     * 
     * 
     */
    @JsonProperty("addSign2")
    private String addSign2;
    /**
     * Current Decrease Previous Charges
     * <p>
     * Lineage reference object : TTVXRCT_DECREASE_CB
     * 
     */
    @JsonProperty("decreaseCB")
    @JsonPropertyDescription("Lineage reference object : TTVXRCT_DECREASE_CB")
    private Double decreaseCB;
    /**
     * Term Code
     * <p>
     * Lineage reference object : TTVXRCT_TERM_CODE
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : TTVXRCT_TERM_CODE")
    private String termCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *  =
     * <p>
     * 
     * 
     */
    @JsonProperty("equalSign3")
    public String getEqualSign3() {
        return equalSign3;
    }

    /**
     *  =
     * <p>
     * 
     * 
     */
    @JsonProperty("equalSign3")
    public void setEqualSign3(String equalSign3) {
        this.equalSign3 = equalSign3;
    }

    public Ttvxrct withEqualSign3(String equalSign3) {
        this.equalSign3 = equalSign3;
        return this;
    }

    /**
     * Cumulative Charges Billed
     * <p>
     * Lineage reference object : TTVXRCT_CUM_CB
     * 
     */
    @JsonProperty("cumCb")
    public Double getCumCb() {
        return cumCb;
    }

    /**
     * Cumulative Charges Billed
     * <p>
     * Lineage reference object : TTVXRCT_CUM_CB
     * 
     */
    @JsonProperty("cumCb")
    public void setCumCb(Double cumCb) {
        this.cumCb = cumCb;
    }

    public Ttvxrct withCumCb(Double cumCb) {
        this.cumCb = cumCb;
        return this;
    }

    /**
     * Previous Cumulative Charges Billed
     * <p>
     * Lineage reference object : TTVXRCT_PREVIOUS_CB
     * 
     */
    @JsonProperty("previousCb")
    public Double getPreviousCb() {
        return previousCb;
    }

    /**
     * Previous Cumulative Charges Billed
     * <p>
     * Lineage reference object : TTVXRCT_PREVIOUS_CB
     * 
     */
    @JsonProperty("previousCb")
    public void setPreviousCb(Double previousCb) {
        this.previousCb = previousCb;
    }

    public Ttvxrct withPreviousCb(Double previousCb) {
        this.previousCb = previousCb;
        return this;
    }

    /**
     * Current Payments Received
     * <p>
     * Lineage reference object : TTVXRCT_CURRENT_PR
     * 
     */
    @JsonProperty("currentPr")
    public Double getCurrentPr() {
        return currentPr;
    }

    /**
     * Current Payments Received
     * <p>
     * Lineage reference object : TTVXRCT_CURRENT_PR
     * 
     */
    @JsonProperty("currentPr")
    public void setCurrentPr(Double currentPr) {
        this.currentPr = currentPr;
    }

    public Ttvxrct withCurrentPr(Double currentPr) {
        this.currentPr = currentPr;
        return this;
    }

    /**
     * Current Charges Billed
     * <p>
     * Lineage reference object : TTVXRCT_CURRENT_CB
     * 
     */
    @JsonProperty("currentCb")
    public Double getCurrentCb() {
        return currentCb;
    }

    /**
     * Current Charges Billed
     * <p>
     * Lineage reference object : TTVXRCT_CURRENT_CB
     * 
     */
    @JsonProperty("currentCb")
    public void setCurrentCb(Double currentCb) {
        this.currentCb = currentCb;
    }

    public Ttvxrct withCurrentCb(Double currentCb) {
        this.currentCb = currentCb;
        return this;
    }

    /**
     * +
     * <p>
     * 
     * 
     */
    @JsonProperty("addSign1")
    public String getAddSign1() {
        return addSign1;
    }

    /**
     * +
     * <p>
     * 
     * 
     */
    @JsonProperty("addSign1")
    public void setAddSign1(String addSign1) {
        this.addSign1 = addSign1;
    }

    public Ttvxrct withAddSign1(String addSign1) {
        this.addSign1 = addSign1;
        return this;
    }

    /**
     * +
     * <p>
     * 
     * 
     */
    @JsonProperty("addSign2")
    public String getAddSign2() {
        return addSign2;
    }

    /**
     * +
     * <p>
     * 
     * 
     */
    @JsonProperty("addSign2")
    public void setAddSign2(String addSign2) {
        this.addSign2 = addSign2;
    }

    public Ttvxrct withAddSign2(String addSign2) {
        this.addSign2 = addSign2;
        return this;
    }

    /**
     * Current Decrease Previous Charges
     * <p>
     * Lineage reference object : TTVXRCT_DECREASE_CB
     * 
     */
    @JsonProperty("decreaseCB")
    public Double getDecreaseCB() {
        return decreaseCB;
    }

    /**
     * Current Decrease Previous Charges
     * <p>
     * Lineage reference object : TTVXRCT_DECREASE_CB
     * 
     */
    @JsonProperty("decreaseCB")
    public void setDecreaseCB(Double decreaseCB) {
        this.decreaseCB = decreaseCB;
    }

    public Ttvxrct withDecreaseCB(Double decreaseCB) {
        this.decreaseCB = decreaseCB;
        return this;
    }

    /**
     * Term Code
     * <p>
     * Lineage reference object : TTVXRCT_TERM_CODE
     * 
     */
    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    /**
     * Term Code
     * <p>
     * Lineage reference object : TTVXRCT_TERM_CODE
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public Ttvxrct withTermCode(String termCode) {
        this.termCode = termCode;
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

    public Ttvxrct withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ttvxrct.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("equalSign3");
        sb.append('=');
        sb.append(((this.equalSign3 == null)?"<null>":this.equalSign3));
        sb.append(',');
        sb.append("cumCb");
        sb.append('=');
        sb.append(((this.cumCb == null)?"<null>":this.cumCb));
        sb.append(',');
        sb.append("previousCb");
        sb.append('=');
        sb.append(((this.previousCb == null)?"<null>":this.previousCb));
        sb.append(',');
        sb.append("currentPr");
        sb.append('=');
        sb.append(((this.currentPr == null)?"<null>":this.currentPr));
        sb.append(',');
        sb.append("currentCb");
        sb.append('=');
        sb.append(((this.currentCb == null)?"<null>":this.currentCb));
        sb.append(',');
        sb.append("addSign1");
        sb.append('=');
        sb.append(((this.addSign1 == null)?"<null>":this.addSign1));
        sb.append(',');
        sb.append("addSign2");
        sb.append('=');
        sb.append(((this.addSign2 == null)?"<null>":this.addSign2));
        sb.append(',');
        sb.append("decreaseCB");
        sb.append('=');
        sb.append(((this.decreaseCB == null)?"<null>":this.decreaseCB));
        sb.append(',');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
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
        result = ((result* 31)+((this.equalSign3 == null)? 0 :this.equalSign3 .hashCode()));
        result = ((result* 31)+((this.cumCb == null)? 0 :this.cumCb.hashCode()));
        result = ((result* 31)+((this.previousCb == null)? 0 :this.previousCb.hashCode()));
        result = ((result* 31)+((this.currentPr == null)? 0 :this.currentPr.hashCode()));
        result = ((result* 31)+((this.currentCb == null)? 0 :this.currentCb.hashCode()));
        result = ((result* 31)+((this.addSign1 == null)? 0 :this.addSign1 .hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.addSign2 == null)? 0 :this.addSign2 .hashCode()));
        result = ((result* 31)+((this.decreaseCB == null)? 0 :this.decreaseCB.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ttvxrct) == false) {
            return false;
        }
        Ttvxrct rhs = ((Ttvxrct) other);
        return (((((((((((this.equalSign3 == rhs.equalSign3)||((this.equalSign3 != null)&&this.equalSign3 .equals(rhs.equalSign3)))&&((this.cumCb == rhs.cumCb)||((this.cumCb!= null)&&this.cumCb.equals(rhs.cumCb))))&&((this.previousCb == rhs.previousCb)||((this.previousCb!= null)&&this.previousCb.equals(rhs.previousCb))))&&((this.currentPr == rhs.currentPr)||((this.currentPr!= null)&&this.currentPr.equals(rhs.currentPr))))&&((this.currentCb == rhs.currentCb)||((this.currentCb!= null)&&this.currentCb.equals(rhs.currentCb))))&&((this.addSign1 == rhs.addSign1)||((this.addSign1 != null)&&this.addSign1 .equals(rhs.addSign1))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.addSign2 == rhs.addSign2)||((this.addSign2 != null)&&this.addSign2 .equals(rhs.addSign2))))&&((this.decreaseCB == rhs.decreaseCB)||((this.decreaseCB!= null)&&this.decreaseCB.equals(rhs.decreaseCB))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
