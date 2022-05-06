
package com.ellucian.generated.bpapi.ban.fund_types.v1_0_0;

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
    "effDate",
    "encMultYrInd",
    "ftypCode",
    "ftypCodePred",
    "statusInd",
    "termDate",
    "title"
})
@Generated("jsonschema2pojo")
public class FundTypes100QapiPost {

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVFTYP_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_COAS_CODE")
    private String coasCode;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVFTYP_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_EFF_DATE")
    private Date effDate;
    /**
     * Lineage reference object : FTVFTYP_ENC_MULT_YR_IND
     * 
     */
    @JsonProperty("encMultYrInd")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_ENC_MULT_YR_IND")
    private String encMultYrInd;
    /**
     * Fund Type
     * <p>
     * Lineage reference object : FTVFTYP_FTYP_CODE
     * 
     */
    @JsonProperty("ftypCode")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_FTYP_CODE")
    private String ftypCode;
    /**
     * Predecessor Fund Type
     * <p>
     * Lineage reference object : FTVFTYP_FTYP_CODE_PRED
     * 
     */
    @JsonProperty("ftypCodePred")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_FTYP_CODE_PRED")
    private String ftypCodePred;
    /**
     * Status
     * <p>
     * Lineage reference object : FTVFTYP_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_STATUS_IND")
    private String statusInd;
    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVFTYP_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_TERM_DATE")
    private Date termDate;
    /**
     * Title
     * <p>
     * Lineage reference object : FTVFTYP_TITLE
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_TITLE")
    private String title;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVFTYP_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    public String getCoasCode() {
        return coasCode;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVFTYP_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public FundTypes100QapiPost withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVFTYP_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    public Date getEffDate() {
        return effDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVFTYP_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public FundTypes100QapiPost withEffDate(Date effDate) {
        this.effDate = effDate;
        return this;
    }

    /**
     * Lineage reference object : FTVFTYP_ENC_MULT_YR_IND
     * 
     */
    @JsonProperty("encMultYrInd")
    public String getEncMultYrInd() {
        return encMultYrInd;
    }

    /**
     * Lineage reference object : FTVFTYP_ENC_MULT_YR_IND
     * 
     */
    @JsonProperty("encMultYrInd")
    public void setEncMultYrInd(String encMultYrInd) {
        this.encMultYrInd = encMultYrInd;
    }

    public FundTypes100QapiPost withEncMultYrInd(String encMultYrInd) {
        this.encMultYrInd = encMultYrInd;
        return this;
    }

    /**
     * Fund Type
     * <p>
     * Lineage reference object : FTVFTYP_FTYP_CODE
     * 
     */
    @JsonProperty("ftypCode")
    public String getFtypCode() {
        return ftypCode;
    }

    /**
     * Fund Type
     * <p>
     * Lineage reference object : FTVFTYP_FTYP_CODE
     * 
     */
    @JsonProperty("ftypCode")
    public void setFtypCode(String ftypCode) {
        this.ftypCode = ftypCode;
    }

    public FundTypes100QapiPost withFtypCode(String ftypCode) {
        this.ftypCode = ftypCode;
        return this;
    }

    /**
     * Predecessor Fund Type
     * <p>
     * Lineage reference object : FTVFTYP_FTYP_CODE_PRED
     * 
     */
    @JsonProperty("ftypCodePred")
    public String getFtypCodePred() {
        return ftypCodePred;
    }

    /**
     * Predecessor Fund Type
     * <p>
     * Lineage reference object : FTVFTYP_FTYP_CODE_PRED
     * 
     */
    @JsonProperty("ftypCodePred")
    public void setFtypCodePred(String ftypCodePred) {
        this.ftypCodePred = ftypCodePred;
    }

    public FundTypes100QapiPost withFtypCodePred(String ftypCodePred) {
        this.ftypCodePred = ftypCodePred;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : FTVFTYP_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public String getStatusInd() {
        return statusInd;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : FTVFTYP_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public void setStatusInd(String statusInd) {
        this.statusInd = statusInd;
    }

    public FundTypes100QapiPost withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVFTYP_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public Date getTermDate() {
        return termDate;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVFTYP_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public void setTermDate(Date termDate) {
        this.termDate = termDate;
    }

    public FundTypes100QapiPost withTermDate(Date termDate) {
        this.termDate = termDate;
        return this;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : FTVFTYP_TITLE
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : FTVFTYP_TITLE
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public FundTypes100QapiPost withTitle(String title) {
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

    public FundTypes100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FundTypes100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("encMultYrInd");
        sb.append('=');
        sb.append(((this.encMultYrInd == null)?"<null>":this.encMultYrInd));
        sb.append(',');
        sb.append("ftypCode");
        sb.append('=');
        sb.append(((this.ftypCode == null)?"<null>":this.ftypCode));
        sb.append(',');
        sb.append("ftypCodePred");
        sb.append('=');
        sb.append(((this.ftypCodePred == null)?"<null>":this.ftypCodePred));
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
        result = ((result* 31)+((this.encMultYrInd == null)? 0 :this.encMultYrInd.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.ftypCode == null)? 0 :this.ftypCode.hashCode()));
        result = ((result* 31)+((this.ftypCodePred == null)? 0 :this.ftypCodePred.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FundTypes100QapiPost) == false) {
            return false;
        }
        FundTypes100QapiPost rhs = ((FundTypes100QapiPost) other);
        return ((((((((((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate)))&&((this.encMultYrInd == rhs.encMultYrInd)||((this.encMultYrInd!= null)&&this.encMultYrInd.equals(rhs.encMultYrInd))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.ftypCode == rhs.ftypCode)||((this.ftypCode!= null)&&this.ftypCode.equals(rhs.ftypCode))))&&((this.ftypCodePred == rhs.ftypCodePred)||((this.ftypCodePred!= null)&&this.ftypCodePred.equals(rhs.ftypCodePred))));
    }

}
