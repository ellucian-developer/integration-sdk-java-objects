
package com.ellucian.generated.bpapi.ban.journal_voucher_quick.v1_0_0;

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
    "editDeferInd",
    "documentNumber",
    "transDate",
    "nsfOnOffInd",
    "fgbjvchEditDeferInd",
    "docAmt"
})
@Generated("jsonschema2pojo")
public class JournalVoucherQuick100PutRequest {

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
     * Document Number
     * <p>
     * Lineage reference object : documentNumber
     * 
     */
    @JsonProperty("documentNumber")
    @JsonPropertyDescription("Lineage reference object : documentNumber")
    private Object documentNumber;
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
     * NSF Checking
     * <p>
     * Lineage reference object : FGBJVCH_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("nsfOnOffInd")
    @JsonPropertyDescription("Lineage reference object : FGBJVCH_NSF_ON_OFF_IND")
    private String nsfOnOffInd;
    /**
     * Deferred Edit
     * <p>
     * Lineage reference object : FGBJVCH_EDIT_DEFER_IND
     * 
     */
    @JsonProperty("fgbjvchEditDeferInd")
    @JsonPropertyDescription("Lineage reference object : FGBJVCH_EDIT_DEFER_IND")
    private String fgbjvchEditDeferInd;
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

    public JournalVoucherQuick100PutRequest withEditDeferInd(String editDeferInd) {
        this.editDeferInd = editDeferInd;
        return this;
    }

    /**
     * Document Number
     * <p>
     * Lineage reference object : documentNumber
     * 
     */
    @JsonProperty("documentNumber")
    public Object getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Document Number
     * <p>
     * Lineage reference object : documentNumber
     * 
     */
    @JsonProperty("documentNumber")
    public void setDocumentNumber(Object documentNumber) {
        this.documentNumber = documentNumber;
    }

    public JournalVoucherQuick100PutRequest withDocumentNumber(Object documentNumber) {
        this.documentNumber = documentNumber;
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

    public JournalVoucherQuick100PutRequest withTransDate(Date transDate) {
        this.transDate = transDate;
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

    public JournalVoucherQuick100PutRequest withNsfOnOffInd(String nsfOnOffInd) {
        this.nsfOnOffInd = nsfOnOffInd;
        return this;
    }

    /**
     * Deferred Edit
     * <p>
     * Lineage reference object : FGBJVCH_EDIT_DEFER_IND
     * 
     */
    @JsonProperty("fgbjvchEditDeferInd")
    public String getFgbjvchEditDeferInd() {
        return fgbjvchEditDeferInd;
    }

    /**
     * Deferred Edit
     * <p>
     * Lineage reference object : FGBJVCH_EDIT_DEFER_IND
     * 
     */
    @JsonProperty("fgbjvchEditDeferInd")
    public void setFgbjvchEditDeferInd(String fgbjvchEditDeferInd) {
        this.fgbjvchEditDeferInd = fgbjvchEditDeferInd;
    }

    public JournalVoucherQuick100PutRequest withFgbjvchEditDeferInd(String fgbjvchEditDeferInd) {
        this.fgbjvchEditDeferInd = fgbjvchEditDeferInd;
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

    public JournalVoucherQuick100PutRequest withDocAmt(Double docAmt) {
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

    public JournalVoucherQuick100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(JournalVoucherQuick100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("editDeferInd");
        sb.append('=');
        sb.append(((this.editDeferInd == null)?"<null>":this.editDeferInd));
        sb.append(',');
        sb.append("documentNumber");
        sb.append('=');
        sb.append(((this.documentNumber == null)?"<null>":this.documentNumber));
        sb.append(',');
        sb.append("transDate");
        sb.append('=');
        sb.append(((this.transDate == null)?"<null>":this.transDate));
        sb.append(',');
        sb.append("nsfOnOffInd");
        sb.append('=');
        sb.append(((this.nsfOnOffInd == null)?"<null>":this.nsfOnOffInd));
        sb.append(',');
        sb.append("fgbjvchEditDeferInd");
        sb.append('=');
        sb.append(((this.fgbjvchEditDeferInd == null)?"<null>":this.fgbjvchEditDeferInd));
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
        result = ((result* 31)+((this.editDeferInd == null)? 0 :this.editDeferInd.hashCode()));
        result = ((result* 31)+((this.documentNumber == null)? 0 :this.documentNumber.hashCode()));
        result = ((result* 31)+((this.transDate == null)? 0 :this.transDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.nsfOnOffInd == null)? 0 :this.nsfOnOffInd.hashCode()));
        result = ((result* 31)+((this.fgbjvchEditDeferInd == null)? 0 :this.fgbjvchEditDeferInd.hashCode()));
        result = ((result* 31)+((this.docAmt == null)? 0 :this.docAmt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JournalVoucherQuick100PutRequest) == false) {
            return false;
        }
        JournalVoucherQuick100PutRequest rhs = ((JournalVoucherQuick100PutRequest) other);
        return ((((((((this.editDeferInd == rhs.editDeferInd)||((this.editDeferInd!= null)&&this.editDeferInd.equals(rhs.editDeferInd)))&&((this.documentNumber == rhs.documentNumber)||((this.documentNumber!= null)&&this.documentNumber.equals(rhs.documentNumber))))&&((this.transDate == rhs.transDate)||((this.transDate!= null)&&this.transDate.equals(rhs.transDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.nsfOnOffInd == rhs.nsfOnOffInd)||((this.nsfOnOffInd!= null)&&this.nsfOnOffInd.equals(rhs.nsfOnOffInd))))&&((this.fgbjvchEditDeferInd == rhs.fgbjvchEditDeferInd)||((this.fgbjvchEditDeferInd!= null)&&this.fgbjvchEditDeferInd.equals(rhs.fgbjvchEditDeferInd))))&&((this.docAmt == rhs.docAmt)||((this.docAmt!= null)&&this.docAmt.equals(rhs.docAmt))));
    }

}
