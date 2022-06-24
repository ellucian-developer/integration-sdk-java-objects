
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
    "criteria.distributeInd",
    "criteria.estabDate",
    "criteria.editDeferral",
    "criteria.statusInd",
    "documentNumber",
    "changeDesc",
    "vendorId",
    "type",
    "criteria.desc",
    "criteria.docRefNum",
    "editDeferral",
    "statusInd",
    "transDate",
    "docRefNum",
    "criteria.vendorId",
    "criteria.nsfOnOffInd",
    "nsfOnOffInd",
    "criteria.docChangeNum",
    "criteria.transDate",
    "criteria.changeDesc",
    "estabDate",
    "docChangeNum",
    "criteria.type",
    "desc"
})
@Generated("jsonschema2pojo")
public class GeneralEncumbranceMaintenance100PutRequest {

    /**
     * Distribution
     * <p>
     * 
     * 
     */
    @JsonProperty("distributeInd")
    private String distributeInd;
    /**
     * Distribution
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.distributeInd")
    private String criteriaDistributeInd;
    /**
     * Date Established
     * <p>
     * Lineage reference object : FGBENCH_ESTAB_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.estabDate")
    @JsonPropertyDescription("Lineage reference object : FGBENCH_ESTAB_DATE")
    private Date criteriaEstabDate;
    /**
     * Deferred Editing
     * <p>
     * Lineage reference object : FGBENCH_EDIT_DEFERRAL
     * 
     */
    @JsonProperty("criteria.editDeferral")
    @JsonPropertyDescription("Lineage reference object : FGBENCH_EDIT_DEFERRAL")
    private String criteriaEditDeferral;
    /**
     * Open Status
     * <p>
     * Lineage reference object : FGBENCH_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    @JsonPropertyDescription("Lineage reference object : FGBENCH_STATUS_IND")
    private String criteriaStatusInd;
    /**
     * Encumbrance Number
     * <p>
     * Lineage reference object : documentNumber
     * 
     */
    @JsonProperty("documentNumber")
    @JsonPropertyDescription("Lineage reference object : documentNumber")
    private String documentNumber;
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
     * Encumbrance Description
     * <p>
     * Lineage reference object : FGBENCH_DESC
     * 
     */
    @JsonProperty("criteria.desc")
    @JsonPropertyDescription("Lineage reference object : FGBENCH_DESC")
    private String criteriaDesc;
    /**
     * Document Reference
     * <p>
     * Lineage reference object : FGBENCH_DOC_REF_NUM
     * 
     */
    @JsonProperty("criteria.docRefNum")
    @JsonPropertyDescription("Lineage reference object : FGBENCH_DOC_REF_NUM")
    private String criteriaDocRefNum;
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
     * Vendor ID
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.vendorId")
    private String criteriaVendorId;
    /**
     * NSF Checking
     * <p>
     * Lineage reference object : FGBENCH_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("criteria.nsfOnOffInd")
    @JsonPropertyDescription("Lineage reference object : FGBENCH_NSF_ON_OFF_IND")
    private String criteriaNsfOnOffInd;
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
     * Encumbrance Change
     * <p>
     * Lineage reference object : FGBENCH_DOC_CHANGE_NUM
     * 
     */
    @JsonProperty("criteria.docChangeNum")
    @JsonPropertyDescription("Lineage reference object : FGBENCH_DOC_CHANGE_NUM")
    private String criteriaDocChangeNum;
    /**
     * Transaction Date
     * <p>
     * Lineage reference object : FGBENCH_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.transDate")
    @JsonPropertyDescription("Lineage reference object : FGBENCH_TRANS_DATE")
    private Date criteriaTransDate;
    /**
     * Title
     * <p>
     * Lineage reference object : FGBENCH_CHANGE_DESC
     * 
     */
    @JsonProperty("criteria.changeDesc")
    @JsonPropertyDescription("Lineage reference object : FGBENCH_CHANGE_DESC")
    private String criteriaChangeDesc;
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
     * Encumbrance Change
     * <p>
     * Lineage reference object : FGBENCH_DOC_CHANGE_NUM
     * 
     */
    @JsonProperty("docChangeNum")
    @JsonPropertyDescription("Lineage reference object : FGBENCH_DOC_CHANGE_NUM")
    private String docChangeNum;
    /**
     * Encumbrance Type
     * <p>
     * Lineage reference object : FGBENCH_TYPE
     * (Required)
     * 
     */
    @JsonProperty("criteria.type")
    @JsonPropertyDescription("Lineage reference object : FGBENCH_TYPE")
    private String criteriaType;
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

    public GeneralEncumbranceMaintenance100PutRequest withDistributeInd(String distributeInd) {
        this.distributeInd = distributeInd;
        return this;
    }

    /**
     * Distribution
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.distributeInd")
    public String getCriteriaDistributeInd() {
        return criteriaDistributeInd;
    }

    /**
     * Distribution
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.distributeInd")
    public void setCriteriaDistributeInd(String criteriaDistributeInd) {
        this.criteriaDistributeInd = criteriaDistributeInd;
    }

    public GeneralEncumbranceMaintenance100PutRequest withCriteriaDistributeInd(String criteriaDistributeInd) {
        this.criteriaDistributeInd = criteriaDistributeInd;
        return this;
    }

    /**
     * Date Established
     * <p>
     * Lineage reference object : FGBENCH_ESTAB_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.estabDate")
    public Date getCriteriaEstabDate() {
        return criteriaEstabDate;
    }

    /**
     * Date Established
     * <p>
     * Lineage reference object : FGBENCH_ESTAB_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.estabDate")
    public void setCriteriaEstabDate(Date criteriaEstabDate) {
        this.criteriaEstabDate = criteriaEstabDate;
    }

    public GeneralEncumbranceMaintenance100PutRequest withCriteriaEstabDate(Date criteriaEstabDate) {
        this.criteriaEstabDate = criteriaEstabDate;
        return this;
    }

    /**
     * Deferred Editing
     * <p>
     * Lineage reference object : FGBENCH_EDIT_DEFERRAL
     * 
     */
    @JsonProperty("criteria.editDeferral")
    public String getCriteriaEditDeferral() {
        return criteriaEditDeferral;
    }

    /**
     * Deferred Editing
     * <p>
     * Lineage reference object : FGBENCH_EDIT_DEFERRAL
     * 
     */
    @JsonProperty("criteria.editDeferral")
    public void setCriteriaEditDeferral(String criteriaEditDeferral) {
        this.criteriaEditDeferral = criteriaEditDeferral;
    }

    public GeneralEncumbranceMaintenance100PutRequest withCriteriaEditDeferral(String criteriaEditDeferral) {
        this.criteriaEditDeferral = criteriaEditDeferral;
        return this;
    }

    /**
     * Open Status
     * <p>
     * Lineage reference object : FGBENCH_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    public String getCriteriaStatusInd() {
        return criteriaStatusInd;
    }

    /**
     * Open Status
     * <p>
     * Lineage reference object : FGBENCH_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    public void setCriteriaStatusInd(String criteriaStatusInd) {
        this.criteriaStatusInd = criteriaStatusInd;
    }

    public GeneralEncumbranceMaintenance100PutRequest withCriteriaStatusInd(String criteriaStatusInd) {
        this.criteriaStatusInd = criteriaStatusInd;
        return this;
    }

    /**
     * Encumbrance Number
     * <p>
     * Lineage reference object : documentNumber
     * 
     */
    @JsonProperty("documentNumber")
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Encumbrance Number
     * <p>
     * Lineage reference object : documentNumber
     * 
     */
    @JsonProperty("documentNumber")
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public GeneralEncumbranceMaintenance100PutRequest withDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
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

    public GeneralEncumbranceMaintenance100PutRequest withChangeDesc(String changeDesc) {
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

    public GeneralEncumbranceMaintenance100PutRequest withVendorId(String vendorId) {
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

    public GeneralEncumbranceMaintenance100PutRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Encumbrance Description
     * <p>
     * Lineage reference object : FGBENCH_DESC
     * 
     */
    @JsonProperty("criteria.desc")
    public String getCriteriaDesc() {
        return criteriaDesc;
    }

    /**
     * Encumbrance Description
     * <p>
     * Lineage reference object : FGBENCH_DESC
     * 
     */
    @JsonProperty("criteria.desc")
    public void setCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
    }

    public GeneralEncumbranceMaintenance100PutRequest withCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
        return this;
    }

    /**
     * Document Reference
     * <p>
     * Lineage reference object : FGBENCH_DOC_REF_NUM
     * 
     */
    @JsonProperty("criteria.docRefNum")
    public String getCriteriaDocRefNum() {
        return criteriaDocRefNum;
    }

    /**
     * Document Reference
     * <p>
     * Lineage reference object : FGBENCH_DOC_REF_NUM
     * 
     */
    @JsonProperty("criteria.docRefNum")
    public void setCriteriaDocRefNum(String criteriaDocRefNum) {
        this.criteriaDocRefNum = criteriaDocRefNum;
    }

    public GeneralEncumbranceMaintenance100PutRequest withCriteriaDocRefNum(String criteriaDocRefNum) {
        this.criteriaDocRefNum = criteriaDocRefNum;
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

    public GeneralEncumbranceMaintenance100PutRequest withEditDeferral(String editDeferral) {
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

    public GeneralEncumbranceMaintenance100PutRequest withStatusInd(String statusInd) {
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

    public GeneralEncumbranceMaintenance100PutRequest withTransDate(Date transDate) {
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

    public GeneralEncumbranceMaintenance100PutRequest withDocRefNum(String docRefNum) {
        this.docRefNum = docRefNum;
        return this;
    }

    /**
     * Vendor ID
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.vendorId")
    public String getCriteriaVendorId() {
        return criteriaVendorId;
    }

    /**
     * Vendor ID
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.vendorId")
    public void setCriteriaVendorId(String criteriaVendorId) {
        this.criteriaVendorId = criteriaVendorId;
    }

    public GeneralEncumbranceMaintenance100PutRequest withCriteriaVendorId(String criteriaVendorId) {
        this.criteriaVendorId = criteriaVendorId;
        return this;
    }

    /**
     * NSF Checking
     * <p>
     * Lineage reference object : FGBENCH_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("criteria.nsfOnOffInd")
    public String getCriteriaNsfOnOffInd() {
        return criteriaNsfOnOffInd;
    }

    /**
     * NSF Checking
     * <p>
     * Lineage reference object : FGBENCH_NSF_ON_OFF_IND
     * 
     */
    @JsonProperty("criteria.nsfOnOffInd")
    public void setCriteriaNsfOnOffInd(String criteriaNsfOnOffInd) {
        this.criteriaNsfOnOffInd = criteriaNsfOnOffInd;
    }

    public GeneralEncumbranceMaintenance100PutRequest withCriteriaNsfOnOffInd(String criteriaNsfOnOffInd) {
        this.criteriaNsfOnOffInd = criteriaNsfOnOffInd;
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

    public GeneralEncumbranceMaintenance100PutRequest withNsfOnOffInd(String nsfOnOffInd) {
        this.nsfOnOffInd = nsfOnOffInd;
        return this;
    }

    /**
     * Encumbrance Change
     * <p>
     * Lineage reference object : FGBENCH_DOC_CHANGE_NUM
     * 
     */
    @JsonProperty("criteria.docChangeNum")
    public String getCriteriaDocChangeNum() {
        return criteriaDocChangeNum;
    }

    /**
     * Encumbrance Change
     * <p>
     * Lineage reference object : FGBENCH_DOC_CHANGE_NUM
     * 
     */
    @JsonProperty("criteria.docChangeNum")
    public void setCriteriaDocChangeNum(String criteriaDocChangeNum) {
        this.criteriaDocChangeNum = criteriaDocChangeNum;
    }

    public GeneralEncumbranceMaintenance100PutRequest withCriteriaDocChangeNum(String criteriaDocChangeNum) {
        this.criteriaDocChangeNum = criteriaDocChangeNum;
        return this;
    }

    /**
     * Transaction Date
     * <p>
     * Lineage reference object : FGBENCH_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.transDate")
    public Date getCriteriaTransDate() {
        return criteriaTransDate;
    }

    /**
     * Transaction Date
     * <p>
     * Lineage reference object : FGBENCH_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.transDate")
    public void setCriteriaTransDate(Date criteriaTransDate) {
        this.criteriaTransDate = criteriaTransDate;
    }

    public GeneralEncumbranceMaintenance100PutRequest withCriteriaTransDate(Date criteriaTransDate) {
        this.criteriaTransDate = criteriaTransDate;
        return this;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : FGBENCH_CHANGE_DESC
     * 
     */
    @JsonProperty("criteria.changeDesc")
    public String getCriteriaChangeDesc() {
        return criteriaChangeDesc;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : FGBENCH_CHANGE_DESC
     * 
     */
    @JsonProperty("criteria.changeDesc")
    public void setCriteriaChangeDesc(String criteriaChangeDesc) {
        this.criteriaChangeDesc = criteriaChangeDesc;
    }

    public GeneralEncumbranceMaintenance100PutRequest withCriteriaChangeDesc(String criteriaChangeDesc) {
        this.criteriaChangeDesc = criteriaChangeDesc;
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

    public GeneralEncumbranceMaintenance100PutRequest withEstabDate(Date estabDate) {
        this.estabDate = estabDate;
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

    public GeneralEncumbranceMaintenance100PutRequest withDocChangeNum(String docChangeNum) {
        this.docChangeNum = docChangeNum;
        return this;
    }

    /**
     * Encumbrance Type
     * <p>
     * Lineage reference object : FGBENCH_TYPE
     * (Required)
     * 
     */
    @JsonProperty("criteria.type")
    public String getCriteriaType() {
        return criteriaType;
    }

    /**
     * Encumbrance Type
     * <p>
     * Lineage reference object : FGBENCH_TYPE
     * (Required)
     * 
     */
    @JsonProperty("criteria.type")
    public void setCriteriaType(String criteriaType) {
        this.criteriaType = criteriaType;
    }

    public GeneralEncumbranceMaintenance100PutRequest withCriteriaType(String criteriaType) {
        this.criteriaType = criteriaType;
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

    public GeneralEncumbranceMaintenance100PutRequest withDesc(String desc) {
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

    public GeneralEncumbranceMaintenance100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GeneralEncumbranceMaintenance100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("distributeInd");
        sb.append('=');
        sb.append(((this.distributeInd == null)?"<null>":this.distributeInd));
        sb.append(',');
        sb.append("criteriaDistributeInd");
        sb.append('=');
        sb.append(((this.criteriaDistributeInd == null)?"<null>":this.criteriaDistributeInd));
        sb.append(',');
        sb.append("criteriaEstabDate");
        sb.append('=');
        sb.append(((this.criteriaEstabDate == null)?"<null>":this.criteriaEstabDate));
        sb.append(',');
        sb.append("criteriaEditDeferral");
        sb.append('=');
        sb.append(((this.criteriaEditDeferral == null)?"<null>":this.criteriaEditDeferral));
        sb.append(',');
        sb.append("criteriaStatusInd");
        sb.append('=');
        sb.append(((this.criteriaStatusInd == null)?"<null>":this.criteriaStatusInd));
        sb.append(',');
        sb.append("documentNumber");
        sb.append('=');
        sb.append(((this.documentNumber == null)?"<null>":this.documentNumber));
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
        sb.append("criteriaDesc");
        sb.append('=');
        sb.append(((this.criteriaDesc == null)?"<null>":this.criteriaDesc));
        sb.append(',');
        sb.append("criteriaDocRefNum");
        sb.append('=');
        sb.append(((this.criteriaDocRefNum == null)?"<null>":this.criteriaDocRefNum));
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
        sb.append("criteriaVendorId");
        sb.append('=');
        sb.append(((this.criteriaVendorId == null)?"<null>":this.criteriaVendorId));
        sb.append(',');
        sb.append("criteriaNsfOnOffInd");
        sb.append('=');
        sb.append(((this.criteriaNsfOnOffInd == null)?"<null>":this.criteriaNsfOnOffInd));
        sb.append(',');
        sb.append("nsfOnOffInd");
        sb.append('=');
        sb.append(((this.nsfOnOffInd == null)?"<null>":this.nsfOnOffInd));
        sb.append(',');
        sb.append("criteriaDocChangeNum");
        sb.append('=');
        sb.append(((this.criteriaDocChangeNum == null)?"<null>":this.criteriaDocChangeNum));
        sb.append(',');
        sb.append("criteriaTransDate");
        sb.append('=');
        sb.append(((this.criteriaTransDate == null)?"<null>":this.criteriaTransDate));
        sb.append(',');
        sb.append("criteriaChangeDesc");
        sb.append('=');
        sb.append(((this.criteriaChangeDesc == null)?"<null>":this.criteriaChangeDesc));
        sb.append(',');
        sb.append("estabDate");
        sb.append('=');
        sb.append(((this.estabDate == null)?"<null>":this.estabDate));
        sb.append(',');
        sb.append("docChangeNum");
        sb.append('=');
        sb.append(((this.docChangeNum == null)?"<null>":this.docChangeNum));
        sb.append(',');
        sb.append("criteriaType");
        sb.append('=');
        sb.append(((this.criteriaType == null)?"<null>":this.criteriaType));
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
        result = ((result* 31)+((this.criteriaChangeDesc == null)? 0 :this.criteriaChangeDesc.hashCode()));
        result = ((result* 31)+((this.documentNumber == null)? 0 :this.documentNumber.hashCode()));
        result = ((result* 31)+((this.criteriaNsfOnOffInd == null)? 0 :this.criteriaNsfOnOffInd.hashCode()));
        result = ((result* 31)+((this.changeDesc == null)? 0 :this.changeDesc.hashCode()));
        result = ((result* 31)+((this.vendorId == null)? 0 :this.vendorId.hashCode()));
        result = ((result* 31)+((this.criteriaDistributeInd == null)? 0 :this.criteriaDistributeInd.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.criteriaType == null)? 0 :this.criteriaType.hashCode()));
        result = ((result* 31)+((this.criteriaDocChangeNum == null)? 0 :this.criteriaDocChangeNum.hashCode()));
        result = ((result* 31)+((this.editDeferral == null)? 0 :this.editDeferral.hashCode()));
        result = ((result* 31)+((this.criteriaVendorId == null)? 0 :this.criteriaVendorId.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.transDate == null)? 0 :this.transDate.hashCode()));
        result = ((result* 31)+((this.docRefNum == null)? 0 :this.docRefNum.hashCode()));
        result = ((result* 31)+((this.nsfOnOffInd == null)? 0 :this.nsfOnOffInd.hashCode()));
        result = ((result* 31)+((this.criteriaEstabDate == null)? 0 :this.criteriaEstabDate.hashCode()));
        result = ((result* 31)+((this.criteriaEditDeferral == null)? 0 :this.criteriaEditDeferral.hashCode()));
        result = ((result* 31)+((this.criteriaTransDate == null)? 0 :this.criteriaTransDate.hashCode()));
        result = ((result* 31)+((this.estabDate == null)? 0 :this.estabDate.hashCode()));
        result = ((result* 31)+((this.criteriaStatusInd == null)? 0 :this.criteriaStatusInd.hashCode()));
        result = ((result* 31)+((this.docChangeNum == null)? 0 :this.docChangeNum.hashCode()));
        result = ((result* 31)+((this.criteriaDocRefNum == null)? 0 :this.criteriaDocRefNum.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaDesc == null)? 0 :this.criteriaDesc.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeneralEncumbranceMaintenance100PutRequest) == false) {
            return false;
        }
        GeneralEncumbranceMaintenance100PutRequest rhs = ((GeneralEncumbranceMaintenance100PutRequest) other);
        return (((((((((((((((((((((((((((this.distributeInd == rhs.distributeInd)||((this.distributeInd!= null)&&this.distributeInd.equals(rhs.distributeInd)))&&((this.criteriaChangeDesc == rhs.criteriaChangeDesc)||((this.criteriaChangeDesc!= null)&&this.criteriaChangeDesc.equals(rhs.criteriaChangeDesc))))&&((this.documentNumber == rhs.documentNumber)||((this.documentNumber!= null)&&this.documentNumber.equals(rhs.documentNumber))))&&((this.criteriaNsfOnOffInd == rhs.criteriaNsfOnOffInd)||((this.criteriaNsfOnOffInd!= null)&&this.criteriaNsfOnOffInd.equals(rhs.criteriaNsfOnOffInd))))&&((this.changeDesc == rhs.changeDesc)||((this.changeDesc!= null)&&this.changeDesc.equals(rhs.changeDesc))))&&((this.vendorId == rhs.vendorId)||((this.vendorId!= null)&&this.vendorId.equals(rhs.vendorId))))&&((this.criteriaDistributeInd == rhs.criteriaDistributeInd)||((this.criteriaDistributeInd!= null)&&this.criteriaDistributeInd.equals(rhs.criteriaDistributeInd))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.criteriaType == rhs.criteriaType)||((this.criteriaType!= null)&&this.criteriaType.equals(rhs.criteriaType))))&&((this.criteriaDocChangeNum == rhs.criteriaDocChangeNum)||((this.criteriaDocChangeNum!= null)&&this.criteriaDocChangeNum.equals(rhs.criteriaDocChangeNum))))&&((this.editDeferral == rhs.editDeferral)||((this.editDeferral!= null)&&this.editDeferral.equals(rhs.editDeferral))))&&((this.criteriaVendorId == rhs.criteriaVendorId)||((this.criteriaVendorId!= null)&&this.criteriaVendorId.equals(rhs.criteriaVendorId))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.transDate == rhs.transDate)||((this.transDate!= null)&&this.transDate.equals(rhs.transDate))))&&((this.docRefNum == rhs.docRefNum)||((this.docRefNum!= null)&&this.docRefNum.equals(rhs.docRefNum))))&&((this.nsfOnOffInd == rhs.nsfOnOffInd)||((this.nsfOnOffInd!= null)&&this.nsfOnOffInd.equals(rhs.nsfOnOffInd))))&&((this.criteriaEstabDate == rhs.criteriaEstabDate)||((this.criteriaEstabDate!= null)&&this.criteriaEstabDate.equals(rhs.criteriaEstabDate))))&&((this.criteriaEditDeferral == rhs.criteriaEditDeferral)||((this.criteriaEditDeferral!= null)&&this.criteriaEditDeferral.equals(rhs.criteriaEditDeferral))))&&((this.criteriaTransDate == rhs.criteriaTransDate)||((this.criteriaTransDate!= null)&&this.criteriaTransDate.equals(rhs.criteriaTransDate))))&&((this.estabDate == rhs.estabDate)||((this.estabDate!= null)&&this.estabDate.equals(rhs.estabDate))))&&((this.criteriaStatusInd == rhs.criteriaStatusInd)||((this.criteriaStatusInd!= null)&&this.criteriaStatusInd.equals(rhs.criteriaStatusInd))))&&((this.docChangeNum == rhs.docChangeNum)||((this.docChangeNum!= null)&&this.docChangeNum.equals(rhs.docChangeNum))))&&((this.criteriaDocRefNum == rhs.criteriaDocRefNum)||((this.criteriaDocRefNum!= null)&&this.criteriaDocRefNum.equals(rhs.criteriaDocRefNum))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaDesc == rhs.criteriaDesc)||((this.criteriaDesc!= null)&&this.criteriaDesc.equals(rhs.criteriaDesc))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
