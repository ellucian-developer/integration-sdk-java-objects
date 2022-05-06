
package com.ellucian.generated.bpapi.ban.course_search.v1_0_0;

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
    "crseNumb",
    "termTo",
    "creditHrHigh",
    "subjCode",
    "creditHrLow",
    "effTerm",
    "creditHrInd",
    "title"
})
@Generated("jsonschema2pojo")
public class Scbcrse {

    /**
     * Course Number
     * <p>
     * Lineage reference object : SCBCRSE_CRSE_NUMB
     * 
     */
    @JsonProperty("crseNumb")
    @JsonPropertyDescription("Lineage reference object : SCBCRSE_CRSE_NUMB")
    private String crseNumb;
    @JsonProperty("termTo")
    private String termTo;
    /**
     * High
     * <p>
     * Lineage reference object : SCBCRSE_CREDIT_HR_HIGH
     * 
     */
    @JsonProperty("creditHrHigh")
    @JsonPropertyDescription("Lineage reference object : SCBCRSE_CREDIT_HR_HIGH")
    private Double creditHrHigh;
    /**
     * Subject
     * <p>
     * Lineage reference object : SCBCRSE_SUBJ_CODE
     * 
     */
    @JsonProperty("subjCode")
    @JsonPropertyDescription("Lineage reference object : SCBCRSE_SUBJ_CODE")
    private String subjCode;
    /**
     * Low
     * <p>
     * Lineage reference object : SCBCRSE_CREDIT_HR_LOW
     * 
     */
    @JsonProperty("creditHrLow")
    @JsonPropertyDescription("Lineage reference object : SCBCRSE_CREDIT_HR_LOW")
    private Double creditHrLow;
    /**
     * Lineage reference object : SCBCRSE_EFF_TERM
     * 
     */
    @JsonProperty("effTerm")
    @JsonPropertyDescription("Lineage reference object : SCBCRSE_EFF_TERM")
    private String effTerm;
    /**
     * Credit Hours Or/To
     * <p>
     * Lineage reference object : SCBCRSE_CREDIT_HR_IND
     * 
     */
    @JsonProperty("creditHrInd")
    @JsonPropertyDescription("Lineage reference object : SCBCRSE_CREDIT_HR_IND")
    private String creditHrInd;
    /**
     * Description
     * <p>
     * Lineage reference object : SCBCRSE_TITLE
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("Lineage reference object : SCBCRSE_TITLE")
    private String title;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Course Number
     * <p>
     * Lineage reference object : SCBCRSE_CRSE_NUMB
     * 
     */
    @JsonProperty("crseNumb")
    public String getCrseNumb() {
        return crseNumb;
    }

    /**
     * Course Number
     * <p>
     * Lineage reference object : SCBCRSE_CRSE_NUMB
     * 
     */
    @JsonProperty("crseNumb")
    public void setCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
    }

    public Scbcrse withCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
        return this;
    }

    @JsonProperty("termTo")
    public String getTermTo() {
        return termTo;
    }

    @JsonProperty("termTo")
    public void setTermTo(String termTo) {
        this.termTo = termTo;
    }

    public Scbcrse withTermTo(String termTo) {
        this.termTo = termTo;
        return this;
    }

    /**
     * High
     * <p>
     * Lineage reference object : SCBCRSE_CREDIT_HR_HIGH
     * 
     */
    @JsonProperty("creditHrHigh")
    public Double getCreditHrHigh() {
        return creditHrHigh;
    }

    /**
     * High
     * <p>
     * Lineage reference object : SCBCRSE_CREDIT_HR_HIGH
     * 
     */
    @JsonProperty("creditHrHigh")
    public void setCreditHrHigh(Double creditHrHigh) {
        this.creditHrHigh = creditHrHigh;
    }

    public Scbcrse withCreditHrHigh(Double creditHrHigh) {
        this.creditHrHigh = creditHrHigh;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SCBCRSE_SUBJ_CODE
     * 
     */
    @JsonProperty("subjCode")
    public String getSubjCode() {
        return subjCode;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SCBCRSE_SUBJ_CODE
     * 
     */
    @JsonProperty("subjCode")
    public void setSubjCode(String subjCode) {
        this.subjCode = subjCode;
    }

    public Scbcrse withSubjCode(String subjCode) {
        this.subjCode = subjCode;
        return this;
    }

    /**
     * Low
     * <p>
     * Lineage reference object : SCBCRSE_CREDIT_HR_LOW
     * 
     */
    @JsonProperty("creditHrLow")
    public Double getCreditHrLow() {
        return creditHrLow;
    }

    /**
     * Low
     * <p>
     * Lineage reference object : SCBCRSE_CREDIT_HR_LOW
     * 
     */
    @JsonProperty("creditHrLow")
    public void setCreditHrLow(Double creditHrLow) {
        this.creditHrLow = creditHrLow;
    }

    public Scbcrse withCreditHrLow(Double creditHrLow) {
        this.creditHrLow = creditHrLow;
        return this;
    }

    /**
     * Lineage reference object : SCBCRSE_EFF_TERM
     * 
     */
    @JsonProperty("effTerm")
    public String getEffTerm() {
        return effTerm;
    }

    /**
     * Lineage reference object : SCBCRSE_EFF_TERM
     * 
     */
    @JsonProperty("effTerm")
    public void setEffTerm(String effTerm) {
        this.effTerm = effTerm;
    }

    public Scbcrse withEffTerm(String effTerm) {
        this.effTerm = effTerm;
        return this;
    }

    /**
     * Credit Hours Or/To
     * <p>
     * Lineage reference object : SCBCRSE_CREDIT_HR_IND
     * 
     */
    @JsonProperty("creditHrInd")
    public String getCreditHrInd() {
        return creditHrInd;
    }

    /**
     * Credit Hours Or/To
     * <p>
     * Lineage reference object : SCBCRSE_CREDIT_HR_IND
     * 
     */
    @JsonProperty("creditHrInd")
    public void setCreditHrInd(String creditHrInd) {
        this.creditHrInd = creditHrInd;
    }

    public Scbcrse withCreditHrInd(String creditHrInd) {
        this.creditHrInd = creditHrInd;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : SCBCRSE_TITLE
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : SCBCRSE_TITLE
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Scbcrse withTitle(String title) {
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

    public Scbcrse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Scbcrse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("crseNumb");
        sb.append('=');
        sb.append(((this.crseNumb == null)?"<null>":this.crseNumb));
        sb.append(',');
        sb.append("termTo");
        sb.append('=');
        sb.append(((this.termTo == null)?"<null>":this.termTo));
        sb.append(',');
        sb.append("creditHrHigh");
        sb.append('=');
        sb.append(((this.creditHrHigh == null)?"<null>":this.creditHrHigh));
        sb.append(',');
        sb.append("subjCode");
        sb.append('=');
        sb.append(((this.subjCode == null)?"<null>":this.subjCode));
        sb.append(',');
        sb.append("creditHrLow");
        sb.append('=');
        sb.append(((this.creditHrLow == null)?"<null>":this.creditHrLow));
        sb.append(',');
        sb.append("effTerm");
        sb.append('=');
        sb.append(((this.effTerm == null)?"<null>":this.effTerm));
        sb.append(',');
        sb.append("creditHrInd");
        sb.append('=');
        sb.append(((this.creditHrInd == null)?"<null>":this.creditHrInd));
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
        result = ((result* 31)+((this.crseNumb == null)? 0 :this.crseNumb.hashCode()));
        result = ((result* 31)+((this.termTo == null)? 0 :this.termTo.hashCode()));
        result = ((result* 31)+((this.creditHrHigh == null)? 0 :this.creditHrHigh.hashCode()));
        result = ((result* 31)+((this.subjCode == null)? 0 :this.subjCode.hashCode()));
        result = ((result* 31)+((this.creditHrLow == null)? 0 :this.creditHrLow.hashCode()));
        result = ((result* 31)+((this.effTerm == null)? 0 :this.effTerm.hashCode()));
        result = ((result* 31)+((this.creditHrInd == null)? 0 :this.creditHrInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Scbcrse) == false) {
            return false;
        }
        Scbcrse rhs = ((Scbcrse) other);
        return ((((((((((this.crseNumb == rhs.crseNumb)||((this.crseNumb!= null)&&this.crseNumb.equals(rhs.crseNumb)))&&((this.termTo == rhs.termTo)||((this.termTo!= null)&&this.termTo.equals(rhs.termTo))))&&((this.creditHrHigh == rhs.creditHrHigh)||((this.creditHrHigh!= null)&&this.creditHrHigh.equals(rhs.creditHrHigh))))&&((this.subjCode == rhs.subjCode)||((this.subjCode!= null)&&this.subjCode.equals(rhs.subjCode))))&&((this.creditHrLow == rhs.creditHrLow)||((this.creditHrLow!= null)&&this.creditHrLow.equals(rhs.creditHrLow))))&&((this.effTerm == rhs.effTerm)||((this.effTerm!= null)&&this.effTerm.equals(rhs.effTerm))))&&((this.creditHrInd == rhs.creditHrInd)||((this.creditHrInd!= null)&&this.creditHrInd.equals(rhs.creditHrInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))));
    }

}
