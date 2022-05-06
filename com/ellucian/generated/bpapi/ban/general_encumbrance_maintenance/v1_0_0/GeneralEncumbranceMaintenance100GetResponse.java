
package com.ellucian.generated.bpapi.ban.general_encumbrance_maintenance.v1_0_0;

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
    "distributeInd",
    "textExistsInd",
    "changeDesc",
    "vendorId",
    "type",
    "vendorName",
    "estabDate",
    "editDeferral",
    "statusInd",
    "transDate",
    "docRefNum",
    "docChangeNum",
    "nsfOnOffInd",
    "docAmt",
    "desc"
})
@Generated("jsonschema2pojo")
public class GeneralEncumbranceMaintenance100GetResponse {

    /**
     * Distribution
     * <p>
     * 
     * 
     */
    @JsonProperty("distributeInd")
    private String distributeInd;
    /**
     * Document Text Exists
     * <p>
     * 
     * 
     */
    @JsonProperty("textExistsInd")
    private String textExistsInd;
    /**
     * Title
     * <p>
     * Lineage reference object : FGBENCH_CHANGE_DESC
     * 
     */
    @JsonProperty("changeDesc")
    @JsonPropertyDescription("Lineage reference object : FGBENCH_CHANGE_DESC")
    private String changeDesc;
    /**
     * Vendor ID
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorId")
    private String vendorId;
    /**
     * Encumbrance Type
     * <p>
     * Lineage reference object : FGBENCH_TYPE
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Lineage reference object : FGBENCH_TYPE")
    private String type;
    /**
     * Vendor Name
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorName")
    private String vendorName;
    /**
     * Date Established
     * <p>
     * Lineage reference object : FGBENCH_ESTAB_DATE
     * (Required)
     * 
     */
    @JsonProperty("estabDate")
    @JsonPropertyDescription("Lineage reference object : FGBENCH_ESTAB_DATE")
    private Date estabDate;
    /**
     * Deferred Editing
     * <p>
     * Lineage reference object : FGBENCH_EDIT_DEFERRAL
     * 
     */
    @JsonProperty("editDeferral")
    @JsonPropertyDescription("Lineage reference object : FGBENCH_EDIT_DEFERRAL")
    private String editDeferral;
    /**
     * Open Status
     * <p>
     * Lineage reference object : FGBENCH_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : FGBENCH_STATUS_IND")
    private String statusInd;
    /**
     * Transaction Date
     * <p>
     * Lineage reference object : FGBENCH_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("transDate")
    @JsonPropertyDescription("Lineage reference object : FGBENCH_TRANS_DATE")
    private Date transDate;
    /**
     * Document Reference
     * <p>
     * Lineage reference object : FGBENCH_DOC_REF_NUM
     * 
     */
    @JsonProperty("docRefNum")
    @JsonPropertyDescription("Lineage reference object : FGBENCH_DOC_REF_NUM")
    private String docRefNum;
    /**
     * Encumbrance Change
     * <p>
     * Lineage reference object : FGBENCH_DOC_CHANGE_NUM
     * 
     */
    @JsonProperty("docChangeNum")
    @JsonPropertyDescription("Lineage reference object : FGBENCH_DOC_CHANGE_NUM")
    private String docChangeNum;
    /**
     * NSF Checking
     * <p>
     * Lineage reference object : FGBENCH_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("nsfOnOffInd")
    @JsonPropertyDescription("Lineage reference object : FGBENCH_NSF_ON_OFF_IND")
    private String nsfOnOffInd;
    /**
     * Document Total
     * <p>
     * Lineage reference object : FGBENCH_DOC_AMT
     * (Required)
     * 
     */
    @JsonProperty("docAmt")
    @JsonPropertyDescription("Lineage reference object : FGBENCH_DOC_AMT")
    private Double docAmt;
    /**
     * Encumbrance Description
     * <p>
     * Lineage reference object : FGBENCH_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : FGBENCH_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Distribution
     * <p>
     * 
     * 
     */
    @JsonProperty("distributeInd")
    public String getDistributeInd() {
        return distributeInd;
    }

    /**
     * Distribution
     * <p>
     * 
     * 
     */
    @JsonProperty("distributeInd")
    public void setDistributeInd(String distributeInd) {
        this.distributeInd = distributeInd;
    }

    public GeneralEncumbranceMaintenance100GetResponse withDistributeInd(String distributeInd) {
        this.distributeInd = distributeInd;
        return this;
    }

    /**
     * Document Text Exists
     * <p>
     * 
     * 
     */
    @JsonProperty("textExistsInd")
    public String getTextExistsInd() {
        return textExistsInd;
    }

    /**
     * Document Text Exists
     * <p>
     * 
     * 
     */
    @JsonProperty("textExistsInd")
    public void setTextExistsInd(String textExistsInd) {
        this.textExistsInd = textExistsInd;
    }

    public GeneralEncumbranceMaintenance100GetResponse withTextExistsInd(String textExistsInd) {
        this.textExistsInd = textExistsInd;
        return this;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : FGBENCH_CHANGE_DESC
     * 
     */
    @JsonProperty("changeDesc")
    public String getChangeDesc() {
        return changeDesc;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : FGBENCH_CHANGE_DESC
     * 
     */
    @JsonProperty("changeDesc")
    public void setChangeDesc(String changeDesc) {
        this.changeDesc = changeDesc;
    }

    public GeneralEncumbranceMaintenance100GetResponse withChangeDesc(String changeDesc) {
        this.changeDesc = changeDesc;
        return this;
    }

    /**
     * Vendor ID
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorId")
    public String getVendorId() {
        return vendorId;
    }

    /**
     * Vendor ID
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorId")
    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public GeneralEncumbranceMaintenance100GetResponse withVendorId(String vendorId) {
        this.vendorId = vendorId;
        return this;
    }

    /**
     * Encumbrance Type
     * <p>
     * Lineage reference object : FGBENCH_TYPE
     * (Required)
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Encumbrance Type
     * <p>
     * Lineage reference object : FGBENCH_TYPE
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public GeneralEncumbranceMaintenance100GetResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Vendor Name
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorName")
    public String getVendorName() {
        return vendorName;
    }

    /**
     * Vendor Name
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorName")
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public GeneralEncumbranceMaintenance100GetResponse withVendorName(String vendorName) {
        this.vendorName = vendorName;
        return this;
    }

    /**
     * Date Established
     * <p>
     * Lineage reference object : FGBENCH_ESTAB_DATE
     * (Required)
     * 
     */
    @JsonProperty("estabDate")
    public Date getEstabDate() {
        return estabDate;
    }

    /**
     * Date Established
     * <p>
     * Lineage reference object : FGBENCH_ESTAB_DATE
     * (Required)
     * 
     */
    @JsonProperty("estabDate")
    public void setEstabDate(Date estabDate) {
        this.estabDate = estabDate;
    }

    public GeneralEncumbranceMaintenance100GetResponse withEstabDate(Date estabDate) {
        this.estabDate = estabDate;
        return this;
    }

    /**
     * Deferred Editing
     * <p>
     * Lineage reference object : FGBENCH_EDIT_DEFERRAL
     * 
     */
    @JsonProperty("editDeferral")
    public String getEditDeferral() {
        return editDeferral;
    }

    /**
     * Deferred Editing
     * <p>
     * Lineage reference object : FGBENCH_EDIT_DEFERRAL
     * 
     */
    @JsonProperty("editDeferral")
    public void setEditDeferral(String editDeferral) {
        this.editDeferral = editDeferral;
    }

    public GeneralEncumbranceMaintenance100GetResponse withEditDeferral(String editDeferral) {
        this.editDeferral = editDeferral;
        return this;
    }

    /**
     * Open Status
     * <p>
     * Lineage reference object : FGBENCH_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public String getStatusInd() {
        return statusInd;
    }

    /**
     * Open Status
     * <p>
     * Lineage reference object : FGBENCH_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public void setStatusInd(String statusInd) {
        this.statusInd = statusInd;
    }

    public GeneralEncumbranceMaintenance100GetResponse withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * Transaction Date
     * <p>
     * Lineage reference object : FGBENCH_TRANS_DATE
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
     * Lineage reference object : FGBENCH_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("transDate")
    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public GeneralEncumbranceMaintenance100GetResponse withTransDate(Date transDate) {
        this.transDate = transDate;
        return this;
    }

    /**
     * Document Reference
     * <p>
     * Lineage reference object : FGBENCH_DOC_REF_NUM
     * 
     */
    @JsonProperty("docRefNum")
    public String getDocRefNum() {
        return docRefNum;
    }

    /**
     * Document Reference
     * <p>
     * Lineage reference object : FGBENCH_DOC_REF_NUM
     * 
     */
    @JsonProperty("docRefNum")
    public void setDocRefNum(String docRefNum) {
        this.docRefNum = docRefNum;
    }

    public GeneralEncumbranceMaintenance100GetResponse withDocRefNum(String docRefNum) {
        this.docRefNum = docRefNum;
        return this;
    }

    /**
     * Encumbrance Change
     * <p>
     * Lineage reference object : FGBENCH_DOC_CHANGE_NUM
     * 
     */
    @JsonProperty("docChangeNum")
    public String getDocChangeNum() {
        return docChangeNum;
    }

    /**
     * Encumbrance Change
     * <p>
     * Lineage reference object : FGBENCH_DOC_CHANGE_NUM
     * 
     */
    @JsonProperty("docChangeNum")
    public void setDocChangeNum(String docChangeNum) {
        this.docChangeNum = docChangeNum;
    }

    public GeneralEncumbranceMaintenance100GetResponse withDocChangeNum(String docChangeNum) {
        this.docChangeNum = docChangeNum;
        return this;
    }

    /**
     * NSF Checking
     * <p>
     * Lineage reference object : FGBENCH_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("nsfOnOffInd")
    public String getNsfOnOffInd() {
        return nsfOnOffInd;
    }

    /**
     * NSF Checking
     * <p>
     * Lineage reference object : FGBENCH_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("nsfOnOffInd")
    public void setNsfOnOffInd(String nsfOnOffInd) {
        this.nsfOnOffInd = nsfOnOffInd;
    }

    public GeneralEncumbranceMaintenance100GetResponse withNsfOnOffInd(String nsfOnOffInd) {
        this.nsfOnOffInd = nsfOnOffInd;
        return this;
    }

    /**
     * Document Total
     * <p>
     * Lineage reference object : FGBENCH_DOC_AMT
     * (Required)
     * 
     */
    @JsonProperty("docAmt")
    public Double getDocAmt() {
        return docAmt;
    }

    /**
     * Document Total
     * <p>
     * Lineage reference object : FGBENCH_DOC_AMT
     * (Required)
     * 
     */
    @JsonProperty("docAmt")
    public void setDocAmt(Double docAmt) {
        this.docAmt = docAmt;
    }

    public GeneralEncumbranceMaintenance100GetResponse withDocAmt(Double docAmt) {
        this.docAmt = docAmt;
        return this;
    }

    /**
     * Encumbrance Description
     * <p>
     * Lineage reference object : FGBENCH_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Encumbrance Description
     * <p>
     * Lineage reference object : FGBENCH_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public GeneralEncumbranceMaintenance100GetResponse withDesc(String desc) {
        this.desc = desc;
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

    public GeneralEncumbranceMaintenance100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GeneralEncumbranceMaintenance100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("distributeInd");
        sb.append('=');
        sb.append(((this.distributeInd == null)?"<null>":this.distributeInd));
        sb.append(',');
        sb.append("textExistsInd");
        sb.append('=');
        sb.append(((this.textExistsInd == null)?"<null>":this.textExistsInd));
        sb.append(',');
        sb.append("changeDesc");
        sb.append('=');
        sb.append(((this.changeDesc == null)?"<null>":this.changeDesc));
        sb.append(',');
        sb.append("vendorId");
        sb.append('=');
        sb.append(((this.vendorId == null)?"<null>":this.vendorId));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("vendorName");
        sb.append('=');
        sb.append(((this.vendorName == null)?"<null>":this.vendorName));
        sb.append(',');
        sb.append("estabDate");
        sb.append('=');
        sb.append(((this.estabDate == null)?"<null>":this.estabDate));
        sb.append(',');
        sb.append("editDeferral");
        sb.append('=');
        sb.append(((this.editDeferral == null)?"<null>":this.editDeferral));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("transDate");
        sb.append('=');
        sb.append(((this.transDate == null)?"<null>":this.transDate));
        sb.append(',');
        sb.append("docRefNum");
        sb.append('=');
        sb.append(((this.docRefNum == null)?"<null>":this.docRefNum));
        sb.append(',');
        sb.append("docChangeNum");
        sb.append('=');
        sb.append(((this.docChangeNum == null)?"<null>":this.docChangeNum));
        sb.append(',');
        sb.append("nsfOnOffInd");
        sb.append('=');
        sb.append(((this.nsfOnOffInd == null)?"<null>":this.nsfOnOffInd));
        sb.append(',');
        sb.append("docAmt");
        sb.append('=');
        sb.append(((this.docAmt == null)?"<null>":this.docAmt));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
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
        result = ((result* 31)+((this.distributeInd == null)? 0 :this.distributeInd.hashCode()));
        result = ((result* 31)+((this.textExistsInd == null)? 0 :this.textExistsInd.hashCode()));
        result = ((result* 31)+((this.changeDesc == null)? 0 :this.changeDesc.hashCode()));
        result = ((result* 31)+((this.vendorId == null)? 0 :this.vendorId.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.vendorName == null)? 0 :this.vendorName.hashCode()));
        result = ((result* 31)+((this.estabDate == null)? 0 :this.estabDate.hashCode()));
        result = ((result* 31)+((this.editDeferral == null)? 0 :this.editDeferral.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.transDate == null)? 0 :this.transDate.hashCode()));
        result = ((result* 31)+((this.docRefNum == null)? 0 :this.docRefNum.hashCode()));
        result = ((result* 31)+((this.docChangeNum == null)? 0 :this.docChangeNum.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.nsfOnOffInd == null)? 0 :this.nsfOnOffInd.hashCode()));
        result = ((result* 31)+((this.docAmt == null)? 0 :this.docAmt.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeneralEncumbranceMaintenance100GetResponse) == false) {
            return false;
        }
        GeneralEncumbranceMaintenance100GetResponse rhs = ((GeneralEncumbranceMaintenance100GetResponse) other);
        return (((((((((((((((((this.distributeInd == rhs.distributeInd)||((this.distributeInd!= null)&&this.distributeInd.equals(rhs.distributeInd)))&&((this.textExistsInd == rhs.textExistsInd)||((this.textExistsInd!= null)&&this.textExistsInd.equals(rhs.textExistsInd))))&&((this.changeDesc == rhs.changeDesc)||((this.changeDesc!= null)&&this.changeDesc.equals(rhs.changeDesc))))&&((this.vendorId == rhs.vendorId)||((this.vendorId!= null)&&this.vendorId.equals(rhs.vendorId))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.vendorName == rhs.vendorName)||((this.vendorName!= null)&&this.vendorName.equals(rhs.vendorName))))&&((this.estabDate == rhs.estabDate)||((this.estabDate!= null)&&this.estabDate.equals(rhs.estabDate))))&&((this.editDeferral == rhs.editDeferral)||((this.editDeferral!= null)&&this.editDeferral.equals(rhs.editDeferral))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.transDate == rhs.transDate)||((this.transDate!= null)&&this.transDate.equals(rhs.transDate))))&&((this.docRefNum == rhs.docRefNum)||((this.docRefNum!= null)&&this.docRefNum.equals(rhs.docRefNum))))&&((this.docChangeNum == rhs.docChangeNum)||((this.docChangeNum!= null)&&this.docChangeNum.equals(rhs.docChangeNum))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.nsfOnOffInd == rhs.nsfOnOffInd)||((this.nsfOnOffInd!= null)&&this.nsfOnOffInd.equals(rhs.nsfOnOffInd))))&&((this.docAmt == rhs.docAmt)||((this.docAmt!= null)&&this.docAmt.equals(rhs.docAmt))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
