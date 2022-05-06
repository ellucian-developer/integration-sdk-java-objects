
package com.ellucian.generated.bpapi.ban.journal_voucher_mass_entry.v1_0_0;

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
    "defRuclCode",
    "editDeferInd",
    "defDepNum",
    "defTransDesc",
    "defBankCode",
    "transDate",
    "defBudgetPeriod",
    "nsfOnOffInd",
    "defCurrCode",
    "docAmt"
})
@Generated("jsonschema2pojo")
public class Fgbjvch {

    /**
     * Type
     * <p>
     * Lookup lineage reference object : ftvrucl
     * 
     */
    @JsonProperty("defRuclCode")
    @JsonPropertyDescription("Lookup lineage reference object : ftvrucl")
    private String defRuclCode;
    /**
     * Deferred Edit
     * <p>
     * Lineage reference object : FGBJVCH_EDIT_DEFER_IND
     * 
     */
    @JsonProperty("editDeferInd")
    @JsonPropertyDescription("Lineage reference object : FGBJVCH_EDIT_DEFER_IND")
    private String editDeferInd;
    /**
     * Deposit
     * <p>
     * 
     * 
     */
    @JsonProperty("defDepNum")
    private String defDepNum;
    /**
     * Description
     * <p>
     * Lookup lineage reference object : ftvrucl
     * 
     */
    @JsonProperty("defTransDesc")
    @JsonPropertyDescription("Lookup lineage reference object : ftvrucl")
    private String defTransDesc;
    /**
     * Bank
     * <p>
     * Lookup lineage reference object : gxvbank
     * 
     */
    @JsonProperty("defBankCode")
    @JsonPropertyDescription("Lookup lineage reference object : gxvbank")
    private String defBankCode;
    /**
     * Transaction Date
     * <p>
     * Lineage reference object : FGBJVCH_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("transDate")
    @JsonPropertyDescription("Lineage reference object : FGBJVCH_TRANS_DATE")
    private Date transDate;
    /**
     * Budget Period
     * <p>
     * 
     * 
     */
    @JsonProperty("defBudgetPeriod")
    private String defBudgetPeriod;
    /**
     * NSF Checking
     * <p>
     * Lineage reference object : FGBJVCH_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("nsfOnOffInd")
    @JsonPropertyDescription("Lineage reference object : FGBJVCH_NSF_ON_OFF_IND")
    private String nsfOnOffInd;
    /**
     * Currency
     * <p>
     * Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("defCurrCode")
    @JsonPropertyDescription("Lookup lineage reference object : gtvcurr")
    private String defCurrCode;
    /**
     * Document Total
     * <p>
     * Lineage reference object : FGBJVCH_DOC_AMT
     * 
     */
    @JsonProperty("docAmt")
    @JsonPropertyDescription("Lineage reference object : FGBJVCH_DOC_AMT")
    private Double docAmt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Type
     * <p>
     * Lookup lineage reference object : ftvrucl
     * 
     */
    @JsonProperty("defRuclCode")
    public String getDefRuclCode() {
        return defRuclCode;
    }

    /**
     * Type
     * <p>
     * Lookup lineage reference object : ftvrucl
     * 
     */
    @JsonProperty("defRuclCode")
    public void setDefRuclCode(String defRuclCode) {
        this.defRuclCode = defRuclCode;
    }

    public Fgbjvch withDefRuclCode(String defRuclCode) {
        this.defRuclCode = defRuclCode;
        return this;
    }

    /**
     * Deferred Edit
     * <p>
     * Lineage reference object : FGBJVCH_EDIT_DEFER_IND
     * 
     */
    @JsonProperty("editDeferInd")
    public String getEditDeferInd() {
        return editDeferInd;
    }

    /**
     * Deferred Edit
     * <p>
     * Lineage reference object : FGBJVCH_EDIT_DEFER_IND
     * 
     */
    @JsonProperty("editDeferInd")
    public void setEditDeferInd(String editDeferInd) {
        this.editDeferInd = editDeferInd;
    }

    public Fgbjvch withEditDeferInd(String editDeferInd) {
        this.editDeferInd = editDeferInd;
        return this;
    }

    /**
     * Deposit
     * <p>
     * 
     * 
     */
    @JsonProperty("defDepNum")
    public String getDefDepNum() {
        return defDepNum;
    }

    /**
     * Deposit
     * <p>
     * 
     * 
     */
    @JsonProperty("defDepNum")
    public void setDefDepNum(String defDepNum) {
        this.defDepNum = defDepNum;
    }

    public Fgbjvch withDefDepNum(String defDepNum) {
        this.defDepNum = defDepNum;
        return this;
    }

    /**
     * Description
     * <p>
     * Lookup lineage reference object : ftvrucl
     * 
     */
    @JsonProperty("defTransDesc")
    public String getDefTransDesc() {
        return defTransDesc;
    }

    /**
     * Description
     * <p>
     * Lookup lineage reference object : ftvrucl
     * 
     */
    @JsonProperty("defTransDesc")
    public void setDefTransDesc(String defTransDesc) {
        this.defTransDesc = defTransDesc;
    }

    public Fgbjvch withDefTransDesc(String defTransDesc) {
        this.defTransDesc = defTransDesc;
        return this;
    }

    /**
     * Bank
     * <p>
     * Lookup lineage reference object : gxvbank
     * 
     */
    @JsonProperty("defBankCode")
    public String getDefBankCode() {
        return defBankCode;
    }

    /**
     * Bank
     * <p>
     * Lookup lineage reference object : gxvbank
     * 
     */
    @JsonProperty("defBankCode")
    public void setDefBankCode(String defBankCode) {
        this.defBankCode = defBankCode;
    }

    public Fgbjvch withDefBankCode(String defBankCode) {
        this.defBankCode = defBankCode;
        return this;
    }

    /**
     * Transaction Date
     * <p>
     * Lineage reference object : FGBJVCH_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("transDate")
    public Date getTransDate() {
        return transDate;
    }

    /**
     * Transaction Date
     * <p>
     * Lineage reference object : FGBJVCH_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("transDate")
    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public Fgbjvch withTransDate(Date transDate) {
        this.transDate = transDate;
        return this;
    }

    /**
     * Budget Period
     * <p>
     * 
     * 
     */
    @JsonProperty("defBudgetPeriod")
    public String getDefBudgetPeriod() {
        return defBudgetPeriod;
    }

    /**
     * Budget Period
     * <p>
     * 
     * 
     */
    @JsonProperty("defBudgetPeriod")
    public void setDefBudgetPeriod(String defBudgetPeriod) {
        this.defBudgetPeriod = defBudgetPeriod;
    }

    public Fgbjvch withDefBudgetPeriod(String defBudgetPeriod) {
        this.defBudgetPeriod = defBudgetPeriod;
        return this;
    }

    /**
     * NSF Checking
     * <p>
     * Lineage reference object : FGBJVCH_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("nsfOnOffInd")
    public String getNsfOnOffInd() {
        return nsfOnOffInd;
    }

    /**
     * NSF Checking
     * <p>
     * Lineage reference object : FGBJVCH_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("nsfOnOffInd")
    public void setNsfOnOffInd(String nsfOnOffInd) {
        this.nsfOnOffInd = nsfOnOffInd;
    }

    public Fgbjvch withNsfOnOffInd(String nsfOnOffInd) {
        this.nsfOnOffInd = nsfOnOffInd;
        return this;
    }

    /**
     * Currency
     * <p>
     * Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("defCurrCode")
    public String getDefCurrCode() {
        return defCurrCode;
    }

    /**
     * Currency
     * <p>
     * Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("defCurrCode")
    public void setDefCurrCode(String defCurrCode) {
        this.defCurrCode = defCurrCode;
    }

    public Fgbjvch withDefCurrCode(String defCurrCode) {
        this.defCurrCode = defCurrCode;
        return this;
    }

    /**
     * Document Total
     * <p>
     * Lineage reference object : FGBJVCH_DOC_AMT
     * 
     */
    @JsonProperty("docAmt")
    public Double getDocAmt() {
        return docAmt;
    }

    /**
     * Document Total
     * <p>
     * Lineage reference object : FGBJVCH_DOC_AMT
     * 
     */
    @JsonProperty("docAmt")
    public void setDocAmt(Double docAmt) {
        this.docAmt = docAmt;
    }

    public Fgbjvch withDocAmt(Double docAmt) {
        this.docAmt = docAmt;
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

    public Fgbjvch withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Fgbjvch.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("defRuclCode");
        sb.append('=');
        sb.append(((this.defRuclCode == null)?"<null>":this.defRuclCode));
        sb.append(',');
        sb.append("editDeferInd");
        sb.append('=');
        sb.append(((this.editDeferInd == null)?"<null>":this.editDeferInd));
        sb.append(',');
        sb.append("defDepNum");
        sb.append('=');
        sb.append(((this.defDepNum == null)?"<null>":this.defDepNum));
        sb.append(',');
        sb.append("defTransDesc");
        sb.append('=');
        sb.append(((this.defTransDesc == null)?"<null>":this.defTransDesc));
        sb.append(',');
        sb.append("defBankCode");
        sb.append('=');
        sb.append(((this.defBankCode == null)?"<null>":this.defBankCode));
        sb.append(',');
        sb.append("transDate");
        sb.append('=');
        sb.append(((this.transDate == null)?"<null>":this.transDate));
        sb.append(',');
        sb.append("defBudgetPeriod");
        sb.append('=');
        sb.append(((this.defBudgetPeriod == null)?"<null>":this.defBudgetPeriod));
        sb.append(',');
        sb.append("nsfOnOffInd");
        sb.append('=');
        sb.append(((this.nsfOnOffInd == null)?"<null>":this.nsfOnOffInd));
        sb.append(',');
        sb.append("defCurrCode");
        sb.append('=');
        sb.append(((this.defCurrCode == null)?"<null>":this.defCurrCode));
        sb.append(',');
        sb.append("docAmt");
        sb.append('=');
        sb.append(((this.docAmt == null)?"<null>":this.docAmt));
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
        result = ((result* 31)+((this.defRuclCode == null)? 0 :this.defRuclCode.hashCode()));
        result = ((result* 31)+((this.editDeferInd == null)? 0 :this.editDeferInd.hashCode()));
        result = ((result* 31)+((this.defDepNum == null)? 0 :this.defDepNum.hashCode()));
        result = ((result* 31)+((this.defTransDesc == null)? 0 :this.defTransDesc.hashCode()));
        result = ((result* 31)+((this.defBankCode == null)? 0 :this.defBankCode.hashCode()));
        result = ((result* 31)+((this.transDate == null)? 0 :this.transDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.defBudgetPeriod == null)? 0 :this.defBudgetPeriod.hashCode()));
        result = ((result* 31)+((this.nsfOnOffInd == null)? 0 :this.nsfOnOffInd.hashCode()));
        result = ((result* 31)+((this.defCurrCode == null)? 0 :this.defCurrCode.hashCode()));
        result = ((result* 31)+((this.docAmt == null)? 0 :this.docAmt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Fgbjvch) == false) {
            return false;
        }
        Fgbjvch rhs = ((Fgbjvch) other);
        return ((((((((((((this.defRuclCode == rhs.defRuclCode)||((this.defRuclCode!= null)&&this.defRuclCode.equals(rhs.defRuclCode)))&&((this.editDeferInd == rhs.editDeferInd)||((this.editDeferInd!= null)&&this.editDeferInd.equals(rhs.editDeferInd))))&&((this.defDepNum == rhs.defDepNum)||((this.defDepNum!= null)&&this.defDepNum.equals(rhs.defDepNum))))&&((this.defTransDesc == rhs.defTransDesc)||((this.defTransDesc!= null)&&this.defTransDesc.equals(rhs.defTransDesc))))&&((this.defBankCode == rhs.defBankCode)||((this.defBankCode!= null)&&this.defBankCode.equals(rhs.defBankCode))))&&((this.transDate == rhs.transDate)||((this.transDate!= null)&&this.transDate.equals(rhs.transDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.defBudgetPeriod == rhs.defBudgetPeriod)||((this.defBudgetPeriod!= null)&&this.defBudgetPeriod.equals(rhs.defBudgetPeriod))))&&((this.nsfOnOffInd == rhs.nsfOnOffInd)||((this.nsfOnOffInd!= null)&&this.nsfOnOffInd.equals(rhs.nsfOnOffInd))))&&((this.defCurrCode == rhs.defCurrCode)||((this.defCurrCode!= null)&&this.defCurrCode.equals(rhs.defCurrCode))))&&((this.docAmt == rhs.docAmt)||((this.docAmt!= null)&&this.docAmt.equals(rhs.docAmt))));
    }

}
