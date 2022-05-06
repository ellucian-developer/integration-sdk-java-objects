
package com.ellucian.generated.bpapi.ban.grant_inception_to_date.v1_0_0;

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
    "ytdActvAmt",
    "intAtypDesc",
    "adjBudAmt",
    "cmtAmt",
    "title",
    "acctCode",
    "availBal"
})
@Generated("jsonschema2pojo")
public class GrantInceptionToDate100GetResponse {

    /**
     * Frvgbal Ytd Actv Amt
     * <p>
     * Lineage reference object : FRVGBAL_YTD_ACTV_AMT
     * 
     */
    @JsonProperty("ytdActvAmt")
    @JsonPropertyDescription("Lineage reference object : FRVGBAL_YTD_ACTV_AMT")
    private Double ytdActvAmt;
    /**
     * Frvgbal Int Atyp Desc
     * <p>
     * Lineage reference object : FRVGBAL_INT_ATYP_DESC
     * 
     */
    @JsonProperty("intAtypDesc")
    @JsonPropertyDescription("Lineage reference object : FRVGBAL_INT_ATYP_DESC")
    private String intAtypDesc;
    /**
     * Frvgbal Adj Bud Amt
     * <p>
     * Lineage reference object : FRVGBAL_ADJ_BUD_AMT
     * 
     */
    @JsonProperty("adjBudAmt")
    @JsonPropertyDescription("Lineage reference object : FRVGBAL_ADJ_BUD_AMT")
    private Double adjBudAmt;
    /**
     * Frvgbal Cmt Amt
     * <p>
     * Lineage reference object : FRVGBAL_CMT_AMT
     * 
     */
    @JsonProperty("cmtAmt")
    @JsonPropertyDescription("Lineage reference object : FRVGBAL_CMT_AMT")
    private Double cmtAmt;
    /**
     * Frvgbal Title
     * <p>
     * Lineage reference object : FRVGBAL_TITLE
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("Lineage reference object : FRVGBAL_TITLE")
    private String title;
    /**
     * Frvgbal Acct Code
     * <p>
     * Lineage reference object : FRVGBAL_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    @JsonPropertyDescription("Lineage reference object : FRVGBAL_ACCT_CODE")
    private String acctCode;
    /**
     * Frvgbal Avail Bal
     * <p>
     * Lineage reference object : FRVGBAL_AVAIL_BAL
     * 
     */
    @JsonProperty("availBal")
    @JsonPropertyDescription("Lineage reference object : FRVGBAL_AVAIL_BAL")
    private Double availBal;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Frvgbal Ytd Actv Amt
     * <p>
     * Lineage reference object : FRVGBAL_YTD_ACTV_AMT
     * 
     */
    @JsonProperty("ytdActvAmt")
    public Double getYtdActvAmt() {
        return ytdActvAmt;
    }

    /**
     * Frvgbal Ytd Actv Amt
     * <p>
     * Lineage reference object : FRVGBAL_YTD_ACTV_AMT
     * 
     */
    @JsonProperty("ytdActvAmt")
    public void setYtdActvAmt(Double ytdActvAmt) {
        this.ytdActvAmt = ytdActvAmt;
    }

    public GrantInceptionToDate100GetResponse withYtdActvAmt(Double ytdActvAmt) {
        this.ytdActvAmt = ytdActvAmt;
        return this;
    }

    /**
     * Frvgbal Int Atyp Desc
     * <p>
     * Lineage reference object : FRVGBAL_INT_ATYP_DESC
     * 
     */
    @JsonProperty("intAtypDesc")
    public String getIntAtypDesc() {
        return intAtypDesc;
    }

    /**
     * Frvgbal Int Atyp Desc
     * <p>
     * Lineage reference object : FRVGBAL_INT_ATYP_DESC
     * 
     */
    @JsonProperty("intAtypDesc")
    public void setIntAtypDesc(String intAtypDesc) {
        this.intAtypDesc = intAtypDesc;
    }

    public GrantInceptionToDate100GetResponse withIntAtypDesc(String intAtypDesc) {
        this.intAtypDesc = intAtypDesc;
        return this;
    }

    /**
     * Frvgbal Adj Bud Amt
     * <p>
     * Lineage reference object : FRVGBAL_ADJ_BUD_AMT
     * 
     */
    @JsonProperty("adjBudAmt")
    public Double getAdjBudAmt() {
        return adjBudAmt;
    }

    /**
     * Frvgbal Adj Bud Amt
     * <p>
     * Lineage reference object : FRVGBAL_ADJ_BUD_AMT
     * 
     */
    @JsonProperty("adjBudAmt")
    public void setAdjBudAmt(Double adjBudAmt) {
        this.adjBudAmt = adjBudAmt;
    }

    public GrantInceptionToDate100GetResponse withAdjBudAmt(Double adjBudAmt) {
        this.adjBudAmt = adjBudAmt;
        return this;
    }

    /**
     * Frvgbal Cmt Amt
     * <p>
     * Lineage reference object : FRVGBAL_CMT_AMT
     * 
     */
    @JsonProperty("cmtAmt")
    public Double getCmtAmt() {
        return cmtAmt;
    }

    /**
     * Frvgbal Cmt Amt
     * <p>
     * Lineage reference object : FRVGBAL_CMT_AMT
     * 
     */
    @JsonProperty("cmtAmt")
    public void setCmtAmt(Double cmtAmt) {
        this.cmtAmt = cmtAmt;
    }

    public GrantInceptionToDate100GetResponse withCmtAmt(Double cmtAmt) {
        this.cmtAmt = cmtAmt;
        return this;
    }

    /**
     * Frvgbal Title
     * <p>
     * Lineage reference object : FRVGBAL_TITLE
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Frvgbal Title
     * <p>
     * Lineage reference object : FRVGBAL_TITLE
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public GrantInceptionToDate100GetResponse withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Frvgbal Acct Code
     * <p>
     * Lineage reference object : FRVGBAL_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    public String getAcctCode() {
        return acctCode;
    }

    /**
     * Frvgbal Acct Code
     * <p>
     * Lineage reference object : FRVGBAL_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    public void setAcctCode(String acctCode) {
        this.acctCode = acctCode;
    }

    public GrantInceptionToDate100GetResponse withAcctCode(String acctCode) {
        this.acctCode = acctCode;
        return this;
    }

    /**
     * Frvgbal Avail Bal
     * <p>
     * Lineage reference object : FRVGBAL_AVAIL_BAL
     * 
     */
    @JsonProperty("availBal")
    public Double getAvailBal() {
        return availBal;
    }

    /**
     * Frvgbal Avail Bal
     * <p>
     * Lineage reference object : FRVGBAL_AVAIL_BAL
     * 
     */
    @JsonProperty("availBal")
    public void setAvailBal(Double availBal) {
        this.availBal = availBal;
    }

    public GrantInceptionToDate100GetResponse withAvailBal(Double availBal) {
        this.availBal = availBal;
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

    public GrantInceptionToDate100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GrantInceptionToDate100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ytdActvAmt");
        sb.append('=');
        sb.append(((this.ytdActvAmt == null)?"<null>":this.ytdActvAmt));
        sb.append(',');
        sb.append("intAtypDesc");
        sb.append('=');
        sb.append(((this.intAtypDesc == null)?"<null>":this.intAtypDesc));
        sb.append(',');
        sb.append("adjBudAmt");
        sb.append('=');
        sb.append(((this.adjBudAmt == null)?"<null>":this.adjBudAmt));
        sb.append(',');
        sb.append("cmtAmt");
        sb.append('=');
        sb.append(((this.cmtAmt == null)?"<null>":this.cmtAmt));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("acctCode");
        sb.append('=');
        sb.append(((this.acctCode == null)?"<null>":this.acctCode));
        sb.append(',');
        sb.append("availBal");
        sb.append('=');
        sb.append(((this.availBal == null)?"<null>":this.availBal));
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
        result = ((result* 31)+((this.ytdActvAmt == null)? 0 :this.ytdActvAmt.hashCode()));
        result = ((result* 31)+((this.intAtypDesc == null)? 0 :this.intAtypDesc.hashCode()));
        result = ((result* 31)+((this.adjBudAmt == null)? 0 :this.adjBudAmt.hashCode()));
        result = ((result* 31)+((this.cmtAmt == null)? 0 :this.cmtAmt.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.acctCode == null)? 0 :this.acctCode.hashCode()));
        result = ((result* 31)+((this.availBal == null)? 0 :this.availBal.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GrantInceptionToDate100GetResponse) == false) {
            return false;
        }
        GrantInceptionToDate100GetResponse rhs = ((GrantInceptionToDate100GetResponse) other);
        return (((((((((this.ytdActvAmt == rhs.ytdActvAmt)||((this.ytdActvAmt!= null)&&this.ytdActvAmt.equals(rhs.ytdActvAmt)))&&((this.intAtypDesc == rhs.intAtypDesc)||((this.intAtypDesc!= null)&&this.intAtypDesc.equals(rhs.intAtypDesc))))&&((this.adjBudAmt == rhs.adjBudAmt)||((this.adjBudAmt!= null)&&this.adjBudAmt.equals(rhs.adjBudAmt))))&&((this.cmtAmt == rhs.cmtAmt)||((this.cmtAmt!= null)&&this.cmtAmt.equals(rhs.cmtAmt))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.acctCode == rhs.acctCode)||((this.acctCode!= null)&&this.acctCode.equals(rhs.acctCode))))&&((this.availBal == rhs.availBal)||((this.availBal!= null)&&this.availBal.equals(rhs.availBal))));
    }

}
