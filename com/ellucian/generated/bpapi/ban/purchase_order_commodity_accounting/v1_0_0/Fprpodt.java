
package com.ellucian.generated.bpapi.ban.purchase_order_commodity_accounting.v1_0_0;

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
    "suppFtvshipFloor",
    "tgrpCode",
    "reqdDate",
    "parkAgreCode",
    "displayNetAmt",
    "agreCode",
    "vendRefNum",
    "commCode",
    "commNote",
    "displayCommDesc",
    "itemX",
    "taxAmt",
    "unitPrice",
    "suppFtvshipBuilding",
    "addlChrgAmt",
    "item",
    "displayMinQty",
    "suppShipAddrLine1",
    "discAmt",
    "suppShipAddrLine2",
    "textUsage",
    "suppContact",
    "shipCode",
    "addCommInd",
    "suppShipAddrLine3",
    "suppShipAddrLine4",
    "qty",
    "liNote",
    "displayExtendedAmt",
    "displayAgreTitle",
    "displayAgrePrice",
    "uomsCode"
})
@Generated("jsonschema2pojo")
public class Fprpodt {

    /**
     * Floor
     * <p>
     * 
     * 
     */
    @JsonProperty("suppFtvshipFloor")
    private String suppFtvshipFloor;
    /**
     * Tax Group
     * <p>
     * Lineage reference object : FPRPODT_TGRP_CODE, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp
     * 
     */
    @JsonProperty("tgrpCode")
    @JsonPropertyDescription("Lineage reference object : FPRPODT_TGRP_CODE, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp")
    private String tgrpCode;
    /**
     * Delivery Date
     * <p>
     * Lineage reference object : FPRPODT_REQD_DATE
     * 
     */
    @JsonProperty("reqdDate")
    @JsonPropertyDescription("Lineage reference object : FPRPODT_REQD_DATE")
    private Date reqdDate;
    @JsonProperty("parkAgreCode")
    private String parkAgreCode;
    /**
     * Commodity Line Total
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNetAmt")
    private Double displayNetAmt;
    /**
     * Agreement
     * <p>
     * Lineage reference object : FPRPODT_AGRE_CODE
     * 
     */
    @JsonProperty("agreCode")
    @JsonPropertyDescription("Lineage reference object : FPRPODT_AGRE_CODE")
    private String agreCode;
    /**
     * Part Number
     * <p>
     * Lineage reference object : FPRPODT_VEND_REF_NUM
     * 
     */
    @JsonProperty("vendRefNum")
    @JsonPropertyDescription("Lineage reference object : FPRPODT_VEND_REF_NUM")
    private String vendRefNum;
    /**
     * Commodity
     * <p>
     * Lineage reference object : FPRPODT_COMM_CODE
     * 
     */
    @JsonProperty("commCode")
    @JsonPropertyDescription("Lineage reference object : FPRPODT_COMM_CODE")
    private String commCode;
    /**
     * Commodity Text
     * <p>
     * 
     * 
     */
    @JsonProperty("commNote")
    private String commNote;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("displayCommDesc")
    private String displayCommDesc;
    /**
     * X
     * <p>
     * 
     * 
     */
    @JsonProperty("itemX")
    private String itemX;
    /**
     * Tax
     * <p>
     * Lineage reference object : FPRPODT_TAX_AMT
     * 
     */
    @JsonProperty("taxAmt")
    @JsonPropertyDescription("Lineage reference object : FPRPODT_TAX_AMT")
    private Double taxAmt;
    /**
     * Lineage reference object : FPRPODT_UNIT_PRICE
     * 
     */
    @JsonProperty("unitPrice")
    @JsonPropertyDescription("Lineage reference object : FPRPODT_UNIT_PRICE")
    private Double unitPrice;
    /**
     * Building
     * <p>
     * 
     * 
     */
    @JsonProperty("suppFtvshipBuilding")
    private String suppFtvshipBuilding;
    /**
     * Additional
     * <p>
     * Lineage reference object : FPRPODT_ADDL_CHRG_AMT
     * 
     */
    @JsonProperty("addlChrgAmt")
    @JsonPropertyDescription("Lineage reference object : FPRPODT_ADDL_CHRG_AMT")
    private Double addlChrgAmt;
    /**
     * Item
     * <p>
     * Lineage reference object : FPRPODT_ITEM
     * 
     */
    @JsonProperty("item")
    @JsonPropertyDescription("Lineage reference object : FPRPODT_ITEM")
    private Double item;
    /**
     * Minimum Quantity
     * <p>
     * 
     * 
     */
    @JsonProperty("displayMinQty")
    private Double displayMinQty;
    /**
     * Street Line 1
     * <p>
     * 
     * 
     */
    @JsonProperty("suppShipAddrLine1")
    private String suppShipAddrLine1;
    /**
     * Discount
     * <p>
     * Lineage reference object : FPRPODT_DISC_AMT
     * 
     */
    @JsonProperty("discAmt")
    @JsonPropertyDescription("Lineage reference object : FPRPODT_DISC_AMT")
    private Double discAmt;
    /**
     * Street Line 2
     * <p>
     * 
     * 
     */
    @JsonProperty("suppShipAddrLine2")
    private String suppShipAddrLine2;
    /**
     * Text Usage
     * <p>
     * Lineage reference object : FPRPODT_TEXT_USAGE
     * 
     */
    @JsonProperty("textUsage")
    @JsonPropertyDescription("Lineage reference object : FPRPODT_TEXT_USAGE")
    private String textUsage;
    /**
     * Contact
     * <p>
     * 
     * 
     */
    @JsonProperty("suppContact")
    private String suppContact;
    /**
     * Ship To
     * <p>
     * Lineage reference object : FPRPODT_SHIP_CODE, Lookup lineage reference object : ftvship
     * 
     */
    @JsonProperty("shipCode")
    @JsonPropertyDescription("Lineage reference object : FPRPODT_SHIP_CODE, Lookup lineage reference object : ftvship")
    private String shipCode;
    /**
     * Add Commodity
     * <p>
     * 
     * 
     */
    @JsonProperty("addCommInd")
    private String addCommInd;
    /**
     * Street Line 3
     * <p>
     * 
     * 
     */
    @JsonProperty("suppShipAddrLine3")
    private String suppShipAddrLine3;
    /**
     * Street Line 4
     * <p>
     * 
     * 
     */
    @JsonProperty("suppShipAddrLine4")
    private String suppShipAddrLine4;
    /**
     * Quantity
     * <p>
     * Lineage reference object : FPRPODT_QTY
     * 
     */
    @JsonProperty("qty")
    @JsonPropertyDescription("Lineage reference object : FPRPODT_QTY")
    private Double qty;
    /**
     * Item Text
     * <p>
     * 
     * 
     */
    @JsonProperty("liNote")
    private String liNote;
    /**
     * Extended
     * <p>
     * 
     * 
     */
    @JsonProperty("displayExtendedAmt")
    private Double displayExtendedAmt;
    @JsonProperty("displayAgreTitle")
    private String displayAgreTitle;
    /**
     * Unit Price
     * <p>
     * 
     * 
     */
    @JsonProperty("displayAgrePrice")
    private Double displayAgrePrice;
    /**
     * U/M
     * <p>
     * Lineage reference object : FPRPODT_UOMS_CODE, Lookup lineage reference object : ftvuoms
     * 
     */
    @JsonProperty("uomsCode")
    @JsonPropertyDescription("Lineage reference object : FPRPODT_UOMS_CODE, Lookup lineage reference object : ftvuoms")
    private String uomsCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Floor
     * <p>
     * 
     * 
     */
    @JsonProperty("suppFtvshipFloor")
    public String getSuppFtvshipFloor() {
        return suppFtvshipFloor;
    }

    /**
     * Floor
     * <p>
     * 
     * 
     */
    @JsonProperty("suppFtvshipFloor")
    public void setSuppFtvshipFloor(String suppFtvshipFloor) {
        this.suppFtvshipFloor = suppFtvshipFloor;
    }

    public Fprpodt withSuppFtvshipFloor(String suppFtvshipFloor) {
        this.suppFtvshipFloor = suppFtvshipFloor;
        return this;
    }

    /**
     * Tax Group
     * <p>
     * Lineage reference object : FPRPODT_TGRP_CODE, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp
     * 
     */
    @JsonProperty("tgrpCode")
    public String getTgrpCode() {
        return tgrpCode;
    }

    /**
     * Tax Group
     * <p>
     * Lineage reference object : FPRPODT_TGRP_CODE, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp
     * 
     */
    @JsonProperty("tgrpCode")
    public void setTgrpCode(String tgrpCode) {
        this.tgrpCode = tgrpCode;
    }

    public Fprpodt withTgrpCode(String tgrpCode) {
        this.tgrpCode = tgrpCode;
        return this;
    }

    /**
     * Delivery Date
     * <p>
     * Lineage reference object : FPRPODT_REQD_DATE
     * 
     */
    @JsonProperty("reqdDate")
    public Date getReqdDate() {
        return reqdDate;
    }

    /**
     * Delivery Date
     * <p>
     * Lineage reference object : FPRPODT_REQD_DATE
     * 
     */
    @JsonProperty("reqdDate")
    public void setReqdDate(Date reqdDate) {
        this.reqdDate = reqdDate;
    }

    public Fprpodt withReqdDate(Date reqdDate) {
        this.reqdDate = reqdDate;
        return this;
    }

    @JsonProperty("parkAgreCode")
    public String getParkAgreCode() {
        return parkAgreCode;
    }

    @JsonProperty("parkAgreCode")
    public void setParkAgreCode(String parkAgreCode) {
        this.parkAgreCode = parkAgreCode;
    }

    public Fprpodt withParkAgreCode(String parkAgreCode) {
        this.parkAgreCode = parkAgreCode;
        return this;
    }

    /**
     * Commodity Line Total
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNetAmt")
    public Double getDisplayNetAmt() {
        return displayNetAmt;
    }

    /**
     * Commodity Line Total
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNetAmt")
    public void setDisplayNetAmt(Double displayNetAmt) {
        this.displayNetAmt = displayNetAmt;
    }

    public Fprpodt withDisplayNetAmt(Double displayNetAmt) {
        this.displayNetAmt = displayNetAmt;
        return this;
    }

    /**
     * Agreement
     * <p>
     * Lineage reference object : FPRPODT_AGRE_CODE
     * 
     */
    @JsonProperty("agreCode")
    public String getAgreCode() {
        return agreCode;
    }

    /**
     * Agreement
     * <p>
     * Lineage reference object : FPRPODT_AGRE_CODE
     * 
     */
    @JsonProperty("agreCode")
    public void setAgreCode(String agreCode) {
        this.agreCode = agreCode;
    }

    public Fprpodt withAgreCode(String agreCode) {
        this.agreCode = agreCode;
        return this;
    }

    /**
     * Part Number
     * <p>
     * Lineage reference object : FPRPODT_VEND_REF_NUM
     * 
     */
    @JsonProperty("vendRefNum")
    public String getVendRefNum() {
        return vendRefNum;
    }

    /**
     * Part Number
     * <p>
     * Lineage reference object : FPRPODT_VEND_REF_NUM
     * 
     */
    @JsonProperty("vendRefNum")
    public void setVendRefNum(String vendRefNum) {
        this.vendRefNum = vendRefNum;
    }

    public Fprpodt withVendRefNum(String vendRefNum) {
        this.vendRefNum = vendRefNum;
        return this;
    }

    /**
     * Commodity
     * <p>
     * Lineage reference object : FPRPODT_COMM_CODE
     * 
     */
    @JsonProperty("commCode")
    public String getCommCode() {
        return commCode;
    }

    /**
     * Commodity
     * <p>
     * Lineage reference object : FPRPODT_COMM_CODE
     * 
     */
    @JsonProperty("commCode")
    public void setCommCode(String commCode) {
        this.commCode = commCode;
    }

    public Fprpodt withCommCode(String commCode) {
        this.commCode = commCode;
        return this;
    }

    /**
     * Commodity Text
     * <p>
     * 
     * 
     */
    @JsonProperty("commNote")
    public String getCommNote() {
        return commNote;
    }

    /**
     * Commodity Text
     * <p>
     * 
     * 
     */
    @JsonProperty("commNote")
    public void setCommNote(String commNote) {
        this.commNote = commNote;
    }

    public Fprpodt withCommNote(String commNote) {
        this.commNote = commNote;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("displayCommDesc")
    public String getDisplayCommDesc() {
        return displayCommDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("displayCommDesc")
    public void setDisplayCommDesc(String displayCommDesc) {
        this.displayCommDesc = displayCommDesc;
    }

    public Fprpodt withDisplayCommDesc(String displayCommDesc) {
        this.displayCommDesc = displayCommDesc;
        return this;
    }

    /**
     * X
     * <p>
     * 
     * 
     */
    @JsonProperty("itemX")
    public String getItemX() {
        return itemX;
    }

    /**
     * X
     * <p>
     * 
     * 
     */
    @JsonProperty("itemX")
    public void setItemX(String itemX) {
        this.itemX = itemX;
    }

    public Fprpodt withItemX(String itemX) {
        this.itemX = itemX;
        return this;
    }

    /**
     * Tax
     * <p>
     * Lineage reference object : FPRPODT_TAX_AMT
     * 
     */
    @JsonProperty("taxAmt")
    public Double getTaxAmt() {
        return taxAmt;
    }

    /**
     * Tax
     * <p>
     * Lineage reference object : FPRPODT_TAX_AMT
     * 
     */
    @JsonProperty("taxAmt")
    public void setTaxAmt(Double taxAmt) {
        this.taxAmt = taxAmt;
    }

    public Fprpodt withTaxAmt(Double taxAmt) {
        this.taxAmt = taxAmt;
        return this;
    }

    /**
     * Lineage reference object : FPRPODT_UNIT_PRICE
     * 
     */
    @JsonProperty("unitPrice")
    public Double getUnitPrice() {
        return unitPrice;
    }

    /**
     * Lineage reference object : FPRPODT_UNIT_PRICE
     * 
     */
    @JsonProperty("unitPrice")
    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Fprpodt withUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    /**
     * Building
     * <p>
     * 
     * 
     */
    @JsonProperty("suppFtvshipBuilding")
    public String getSuppFtvshipBuilding() {
        return suppFtvshipBuilding;
    }

    /**
     * Building
     * <p>
     * 
     * 
     */
    @JsonProperty("suppFtvshipBuilding")
    public void setSuppFtvshipBuilding(String suppFtvshipBuilding) {
        this.suppFtvshipBuilding = suppFtvshipBuilding;
    }

    public Fprpodt withSuppFtvshipBuilding(String suppFtvshipBuilding) {
        this.suppFtvshipBuilding = suppFtvshipBuilding;
        return this;
    }

    /**
     * Additional
     * <p>
     * Lineage reference object : FPRPODT_ADDL_CHRG_AMT
     * 
     */
    @JsonProperty("addlChrgAmt")
    public Double getAddlChrgAmt() {
        return addlChrgAmt;
    }

    /**
     * Additional
     * <p>
     * Lineage reference object : FPRPODT_ADDL_CHRG_AMT
     * 
     */
    @JsonProperty("addlChrgAmt")
    public void setAddlChrgAmt(Double addlChrgAmt) {
        this.addlChrgAmt = addlChrgAmt;
    }

    public Fprpodt withAddlChrgAmt(Double addlChrgAmt) {
        this.addlChrgAmt = addlChrgAmt;
        return this;
    }

    /**
     * Item
     * <p>
     * Lineage reference object : FPRPODT_ITEM
     * 
     */
    @JsonProperty("item")
    public Double getItem() {
        return item;
    }

    /**
     * Item
     * <p>
     * Lineage reference object : FPRPODT_ITEM
     * 
     */
    @JsonProperty("item")
    public void setItem(Double item) {
        this.item = item;
    }

    public Fprpodt withItem(Double item) {
        this.item = item;
        return this;
    }

    /**
     * Minimum Quantity
     * <p>
     * 
     * 
     */
    @JsonProperty("displayMinQty")
    public Double getDisplayMinQty() {
        return displayMinQty;
    }

    /**
     * Minimum Quantity
     * <p>
     * 
     * 
     */
    @JsonProperty("displayMinQty")
    public void setDisplayMinQty(Double displayMinQty) {
        this.displayMinQty = displayMinQty;
    }

    public Fprpodt withDisplayMinQty(Double displayMinQty) {
        this.displayMinQty = displayMinQty;
        return this;
    }

    /**
     * Street Line 1
     * <p>
     * 
     * 
     */
    @JsonProperty("suppShipAddrLine1")
    public String getSuppShipAddrLine1() {
        return suppShipAddrLine1;
    }

    /**
     * Street Line 1
     * <p>
     * 
     * 
     */
    @JsonProperty("suppShipAddrLine1")
    public void setSuppShipAddrLine1(String suppShipAddrLine1) {
        this.suppShipAddrLine1 = suppShipAddrLine1;
    }

    public Fprpodt withSuppShipAddrLine1(String suppShipAddrLine1) {
        this.suppShipAddrLine1 = suppShipAddrLine1;
        return this;
    }

    /**
     * Discount
     * <p>
     * Lineage reference object : FPRPODT_DISC_AMT
     * 
     */
    @JsonProperty("discAmt")
    public Double getDiscAmt() {
        return discAmt;
    }

    /**
     * Discount
     * <p>
     * Lineage reference object : FPRPODT_DISC_AMT
     * 
     */
    @JsonProperty("discAmt")
    public void setDiscAmt(Double discAmt) {
        this.discAmt = discAmt;
    }

    public Fprpodt withDiscAmt(Double discAmt) {
        this.discAmt = discAmt;
        return this;
    }

    /**
     * Street Line 2
     * <p>
     * 
     * 
     */
    @JsonProperty("suppShipAddrLine2")
    public String getSuppShipAddrLine2() {
        return suppShipAddrLine2;
    }

    /**
     * Street Line 2
     * <p>
     * 
     * 
     */
    @JsonProperty("suppShipAddrLine2")
    public void setSuppShipAddrLine2(String suppShipAddrLine2) {
        this.suppShipAddrLine2 = suppShipAddrLine2;
    }

    public Fprpodt withSuppShipAddrLine2(String suppShipAddrLine2) {
        this.suppShipAddrLine2 = suppShipAddrLine2;
        return this;
    }

    /**
     * Text Usage
     * <p>
     * Lineage reference object : FPRPODT_TEXT_USAGE
     * 
     */
    @JsonProperty("textUsage")
    public String getTextUsage() {
        return textUsage;
    }

    /**
     * Text Usage
     * <p>
     * Lineage reference object : FPRPODT_TEXT_USAGE
     * 
     */
    @JsonProperty("textUsage")
    public void setTextUsage(String textUsage) {
        this.textUsage = textUsage;
    }

    public Fprpodt withTextUsage(String textUsage) {
        this.textUsage = textUsage;
        return this;
    }

    /**
     * Contact
     * <p>
     * 
     * 
     */
    @JsonProperty("suppContact")
    public String getSuppContact() {
        return suppContact;
    }

    /**
     * Contact
     * <p>
     * 
     * 
     */
    @JsonProperty("suppContact")
    public void setSuppContact(String suppContact) {
        this.suppContact = suppContact;
    }

    public Fprpodt withSuppContact(String suppContact) {
        this.suppContact = suppContact;
        return this;
    }

    /**
     * Ship To
     * <p>
     * Lineage reference object : FPRPODT_SHIP_CODE, Lookup lineage reference object : ftvship
     * 
     */
    @JsonProperty("shipCode")
    public String getShipCode() {
        return shipCode;
    }

    /**
     * Ship To
     * <p>
     * Lineage reference object : FPRPODT_SHIP_CODE, Lookup lineage reference object : ftvship
     * 
     */
    @JsonProperty("shipCode")
    public void setShipCode(String shipCode) {
        this.shipCode = shipCode;
    }

    public Fprpodt withShipCode(String shipCode) {
        this.shipCode = shipCode;
        return this;
    }

    /**
     * Add Commodity
     * <p>
     * 
     * 
     */
    @JsonProperty("addCommInd")
    public String getAddCommInd() {
        return addCommInd;
    }

    /**
     * Add Commodity
     * <p>
     * 
     * 
     */
    @JsonProperty("addCommInd")
    public void setAddCommInd(String addCommInd) {
        this.addCommInd = addCommInd;
    }

    public Fprpodt withAddCommInd(String addCommInd) {
        this.addCommInd = addCommInd;
        return this;
    }

    /**
     * Street Line 3
     * <p>
     * 
     * 
     */
    @JsonProperty("suppShipAddrLine3")
    public String getSuppShipAddrLine3() {
        return suppShipAddrLine3;
    }

    /**
     * Street Line 3
     * <p>
     * 
     * 
     */
    @JsonProperty("suppShipAddrLine3")
    public void setSuppShipAddrLine3(String suppShipAddrLine3) {
        this.suppShipAddrLine3 = suppShipAddrLine3;
    }

    public Fprpodt withSuppShipAddrLine3(String suppShipAddrLine3) {
        this.suppShipAddrLine3 = suppShipAddrLine3;
        return this;
    }

    /**
     * Street Line 4
     * <p>
     * 
     * 
     */
    @JsonProperty("suppShipAddrLine4")
    public String getSuppShipAddrLine4() {
        return suppShipAddrLine4;
    }

    /**
     * Street Line 4
     * <p>
     * 
     * 
     */
    @JsonProperty("suppShipAddrLine4")
    public void setSuppShipAddrLine4(String suppShipAddrLine4) {
        this.suppShipAddrLine4 = suppShipAddrLine4;
    }

    public Fprpodt withSuppShipAddrLine4(String suppShipAddrLine4) {
        this.suppShipAddrLine4 = suppShipAddrLine4;
        return this;
    }

    /**
     * Quantity
     * <p>
     * Lineage reference object : FPRPODT_QTY
     * 
     */
    @JsonProperty("qty")
    public Double getQty() {
        return qty;
    }

    /**
     * Quantity
     * <p>
     * Lineage reference object : FPRPODT_QTY
     * 
     */
    @JsonProperty("qty")
    public void setQty(Double qty) {
        this.qty = qty;
    }

    public Fprpodt withQty(Double qty) {
        this.qty = qty;
        return this;
    }

    /**
     * Item Text
     * <p>
     * 
     * 
     */
    @JsonProperty("liNote")
    public String getLiNote() {
        return liNote;
    }

    /**
     * Item Text
     * <p>
     * 
     * 
     */
    @JsonProperty("liNote")
    public void setLiNote(String liNote) {
        this.liNote = liNote;
    }

    public Fprpodt withLiNote(String liNote) {
        this.liNote = liNote;
        return this;
    }

    /**
     * Extended
     * <p>
     * 
     * 
     */
    @JsonProperty("displayExtendedAmt")
    public Double getDisplayExtendedAmt() {
        return displayExtendedAmt;
    }

    /**
     * Extended
     * <p>
     * 
     * 
     */
    @JsonProperty("displayExtendedAmt")
    public void setDisplayExtendedAmt(Double displayExtendedAmt) {
        this.displayExtendedAmt = displayExtendedAmt;
    }

    public Fprpodt withDisplayExtendedAmt(Double displayExtendedAmt) {
        this.displayExtendedAmt = displayExtendedAmt;
        return this;
    }

    @JsonProperty("displayAgreTitle")
    public String getDisplayAgreTitle() {
        return displayAgreTitle;
    }

    @JsonProperty("displayAgreTitle")
    public void setDisplayAgreTitle(String displayAgreTitle) {
        this.displayAgreTitle = displayAgreTitle;
    }

    public Fprpodt withDisplayAgreTitle(String displayAgreTitle) {
        this.displayAgreTitle = displayAgreTitle;
        return this;
    }

    /**
     * Unit Price
     * <p>
     * 
     * 
     */
    @JsonProperty("displayAgrePrice")
    public Double getDisplayAgrePrice() {
        return displayAgrePrice;
    }

    /**
     * Unit Price
     * <p>
     * 
     * 
     */
    @JsonProperty("displayAgrePrice")
    public void setDisplayAgrePrice(Double displayAgrePrice) {
        this.displayAgrePrice = displayAgrePrice;
    }

    public Fprpodt withDisplayAgrePrice(Double displayAgrePrice) {
        this.displayAgrePrice = displayAgrePrice;
        return this;
    }

    /**
     * U/M
     * <p>
     * Lineage reference object : FPRPODT_UOMS_CODE, Lookup lineage reference object : ftvuoms
     * 
     */
    @JsonProperty("uomsCode")
    public String getUomsCode() {
        return uomsCode;
    }

    /**
     * U/M
     * <p>
     * Lineage reference object : FPRPODT_UOMS_CODE, Lookup lineage reference object : ftvuoms
     * 
     */
    @JsonProperty("uomsCode")
    public void setUomsCode(String uomsCode) {
        this.uomsCode = uomsCode;
    }

    public Fprpodt withUomsCode(String uomsCode) {
        this.uomsCode = uomsCode;
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

    public Fprpodt withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Fprpodt.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("suppFtvshipFloor");
        sb.append('=');
        sb.append(((this.suppFtvshipFloor == null)?"<null>":this.suppFtvshipFloor));
        sb.append(',');
        sb.append("tgrpCode");
        sb.append('=');
        sb.append(((this.tgrpCode == null)?"<null>":this.tgrpCode));
        sb.append(',');
        sb.append("reqdDate");
        sb.append('=');
        sb.append(((this.reqdDate == null)?"<null>":this.reqdDate));
        sb.append(',');
        sb.append("parkAgreCode");
        sb.append('=');
        sb.append(((this.parkAgreCode == null)?"<null>":this.parkAgreCode));
        sb.append(',');
        sb.append("displayNetAmt");
        sb.append('=');
        sb.append(((this.displayNetAmt == null)?"<null>":this.displayNetAmt));
        sb.append(',');
        sb.append("agreCode");
        sb.append('=');
        sb.append(((this.agreCode == null)?"<null>":this.agreCode));
        sb.append(',');
        sb.append("vendRefNum");
        sb.append('=');
        sb.append(((this.vendRefNum == null)?"<null>":this.vendRefNum));
        sb.append(',');
        sb.append("commCode");
        sb.append('=');
        sb.append(((this.commCode == null)?"<null>":this.commCode));
        sb.append(',');
        sb.append("commNote");
        sb.append('=');
        sb.append(((this.commNote == null)?"<null>":this.commNote));
        sb.append(',');
        sb.append("displayCommDesc");
        sb.append('=');
        sb.append(((this.displayCommDesc == null)?"<null>":this.displayCommDesc));
        sb.append(',');
        sb.append("itemX");
        sb.append('=');
        sb.append(((this.itemX == null)?"<null>":this.itemX));
        sb.append(',');
        sb.append("taxAmt");
        sb.append('=');
        sb.append(((this.taxAmt == null)?"<null>":this.taxAmt));
        sb.append(',');
        sb.append("unitPrice");
        sb.append('=');
        sb.append(((this.unitPrice == null)?"<null>":this.unitPrice));
        sb.append(',');
        sb.append("suppFtvshipBuilding");
        sb.append('=');
        sb.append(((this.suppFtvshipBuilding == null)?"<null>":this.suppFtvshipBuilding));
        sb.append(',');
        sb.append("addlChrgAmt");
        sb.append('=');
        sb.append(((this.addlChrgAmt == null)?"<null>":this.addlChrgAmt));
        sb.append(',');
        sb.append("item");
        sb.append('=');
        sb.append(((this.item == null)?"<null>":this.item));
        sb.append(',');
        sb.append("displayMinQty");
        sb.append('=');
        sb.append(((this.displayMinQty == null)?"<null>":this.displayMinQty));
        sb.append(',');
        sb.append("suppShipAddrLine1");
        sb.append('=');
        sb.append(((this.suppShipAddrLine1 == null)?"<null>":this.suppShipAddrLine1));
        sb.append(',');
        sb.append("discAmt");
        sb.append('=');
        sb.append(((this.discAmt == null)?"<null>":this.discAmt));
        sb.append(',');
        sb.append("suppShipAddrLine2");
        sb.append('=');
        sb.append(((this.suppShipAddrLine2 == null)?"<null>":this.suppShipAddrLine2));
        sb.append(',');
        sb.append("textUsage");
        sb.append('=');
        sb.append(((this.textUsage == null)?"<null>":this.textUsage));
        sb.append(',');
        sb.append("suppContact");
        sb.append('=');
        sb.append(((this.suppContact == null)?"<null>":this.suppContact));
        sb.append(',');
        sb.append("shipCode");
        sb.append('=');
        sb.append(((this.shipCode == null)?"<null>":this.shipCode));
        sb.append(',');
        sb.append("addCommInd");
        sb.append('=');
        sb.append(((this.addCommInd == null)?"<null>":this.addCommInd));
        sb.append(',');
        sb.append("suppShipAddrLine3");
        sb.append('=');
        sb.append(((this.suppShipAddrLine3 == null)?"<null>":this.suppShipAddrLine3));
        sb.append(',');
        sb.append("suppShipAddrLine4");
        sb.append('=');
        sb.append(((this.suppShipAddrLine4 == null)?"<null>":this.suppShipAddrLine4));
        sb.append(',');
        sb.append("qty");
        sb.append('=');
        sb.append(((this.qty == null)?"<null>":this.qty));
        sb.append(',');
        sb.append("liNote");
        sb.append('=');
        sb.append(((this.liNote == null)?"<null>":this.liNote));
        sb.append(',');
        sb.append("displayExtendedAmt");
        sb.append('=');
        sb.append(((this.displayExtendedAmt == null)?"<null>":this.displayExtendedAmt));
        sb.append(',');
        sb.append("displayAgreTitle");
        sb.append('=');
        sb.append(((this.displayAgreTitle == null)?"<null>":this.displayAgreTitle));
        sb.append(',');
        sb.append("displayAgrePrice");
        sb.append('=');
        sb.append(((this.displayAgrePrice == null)?"<null>":this.displayAgrePrice));
        sb.append(',');
        sb.append("uomsCode");
        sb.append('=');
        sb.append(((this.uomsCode == null)?"<null>":this.uomsCode));
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
        result = ((result* 31)+((this.suppFtvshipFloor == null)? 0 :this.suppFtvshipFloor.hashCode()));
        result = ((result* 31)+((this.tgrpCode == null)? 0 :this.tgrpCode.hashCode()));
        result = ((result* 31)+((this.reqdDate == null)? 0 :this.reqdDate.hashCode()));
        result = ((result* 31)+((this.parkAgreCode == null)? 0 :this.parkAgreCode.hashCode()));
        result = ((result* 31)+((this.displayNetAmt == null)? 0 :this.displayNetAmt.hashCode()));
        result = ((result* 31)+((this.agreCode == null)? 0 :this.agreCode.hashCode()));
        result = ((result* 31)+((this.vendRefNum == null)? 0 :this.vendRefNum.hashCode()));
        result = ((result* 31)+((this.commCode == null)? 0 :this.commCode.hashCode()));
        result = ((result* 31)+((this.commNote == null)? 0 :this.commNote.hashCode()));
        result = ((result* 31)+((this.displayCommDesc == null)? 0 :this.displayCommDesc.hashCode()));
        result = ((result* 31)+((this.itemX == null)? 0 :this.itemX.hashCode()));
        result = ((result* 31)+((this.taxAmt == null)? 0 :this.taxAmt.hashCode()));
        result = ((result* 31)+((this.unitPrice == null)? 0 :this.unitPrice.hashCode()));
        result = ((result* 31)+((this.suppFtvshipBuilding == null)? 0 :this.suppFtvshipBuilding.hashCode()));
        result = ((result* 31)+((this.addlChrgAmt == null)? 0 :this.addlChrgAmt.hashCode()));
        result = ((result* 31)+((this.item == null)? 0 :this.item.hashCode()));
        result = ((result* 31)+((this.displayMinQty == null)? 0 :this.displayMinQty.hashCode()));
        result = ((result* 31)+((this.suppShipAddrLine1 == null)? 0 :this.suppShipAddrLine1 .hashCode()));
        result = ((result* 31)+((this.discAmt == null)? 0 :this.discAmt.hashCode()));
        result = ((result* 31)+((this.suppShipAddrLine2 == null)? 0 :this.suppShipAddrLine2 .hashCode()));
        result = ((result* 31)+((this.textUsage == null)? 0 :this.textUsage.hashCode()));
        result = ((result* 31)+((this.suppContact == null)? 0 :this.suppContact.hashCode()));
        result = ((result* 31)+((this.shipCode == null)? 0 :this.shipCode.hashCode()));
        result = ((result* 31)+((this.addCommInd == null)? 0 :this.addCommInd.hashCode()));
        result = ((result* 31)+((this.suppShipAddrLine3 == null)? 0 :this.suppShipAddrLine3 .hashCode()));
        result = ((result* 31)+((this.suppShipAddrLine4 == null)? 0 :this.suppShipAddrLine4 .hashCode()));
        result = ((result* 31)+((this.qty == null)? 0 :this.qty.hashCode()));
        result = ((result* 31)+((this.liNote == null)? 0 :this.liNote.hashCode()));
        result = ((result* 31)+((this.displayExtendedAmt == null)? 0 :this.displayExtendedAmt.hashCode()));
        result = ((result* 31)+((this.displayAgreTitle == null)? 0 :this.displayAgreTitle.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.displayAgrePrice == null)? 0 :this.displayAgrePrice.hashCode()));
        result = ((result* 31)+((this.uomsCode == null)? 0 :this.uomsCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Fprpodt) == false) {
            return false;
        }
        Fprpodt rhs = ((Fprpodt) other);
        return ((((((((((((((((((((((((((((((((((this.suppFtvshipFloor == rhs.suppFtvshipFloor)||((this.suppFtvshipFloor!= null)&&this.suppFtvshipFloor.equals(rhs.suppFtvshipFloor)))&&((this.tgrpCode == rhs.tgrpCode)||((this.tgrpCode!= null)&&this.tgrpCode.equals(rhs.tgrpCode))))&&((this.reqdDate == rhs.reqdDate)||((this.reqdDate!= null)&&this.reqdDate.equals(rhs.reqdDate))))&&((this.parkAgreCode == rhs.parkAgreCode)||((this.parkAgreCode!= null)&&this.parkAgreCode.equals(rhs.parkAgreCode))))&&((this.displayNetAmt == rhs.displayNetAmt)||((this.displayNetAmt!= null)&&this.displayNetAmt.equals(rhs.displayNetAmt))))&&((this.agreCode == rhs.agreCode)||((this.agreCode!= null)&&this.agreCode.equals(rhs.agreCode))))&&((this.vendRefNum == rhs.vendRefNum)||((this.vendRefNum!= null)&&this.vendRefNum.equals(rhs.vendRefNum))))&&((this.commCode == rhs.commCode)||((this.commCode!= null)&&this.commCode.equals(rhs.commCode))))&&((this.commNote == rhs.commNote)||((this.commNote!= null)&&this.commNote.equals(rhs.commNote))))&&((this.displayCommDesc == rhs.displayCommDesc)||((this.displayCommDesc!= null)&&this.displayCommDesc.equals(rhs.displayCommDesc))))&&((this.itemX == rhs.itemX)||((this.itemX!= null)&&this.itemX.equals(rhs.itemX))))&&((this.taxAmt == rhs.taxAmt)||((this.taxAmt!= null)&&this.taxAmt.equals(rhs.taxAmt))))&&((this.unitPrice == rhs.unitPrice)||((this.unitPrice!= null)&&this.unitPrice.equals(rhs.unitPrice))))&&((this.suppFtvshipBuilding == rhs.suppFtvshipBuilding)||((this.suppFtvshipBuilding!= null)&&this.suppFtvshipBuilding.equals(rhs.suppFtvshipBuilding))))&&((this.addlChrgAmt == rhs.addlChrgAmt)||((this.addlChrgAmt!= null)&&this.addlChrgAmt.equals(rhs.addlChrgAmt))))&&((this.item == rhs.item)||((this.item!= null)&&this.item.equals(rhs.item))))&&((this.displayMinQty == rhs.displayMinQty)||((this.displayMinQty!= null)&&this.displayMinQty.equals(rhs.displayMinQty))))&&((this.suppShipAddrLine1 == rhs.suppShipAddrLine1)||((this.suppShipAddrLine1 != null)&&this.suppShipAddrLine1 .equals(rhs.suppShipAddrLine1))))&&((this.discAmt == rhs.discAmt)||((this.discAmt!= null)&&this.discAmt.equals(rhs.discAmt))))&&((this.suppShipAddrLine2 == rhs.suppShipAddrLine2)||((this.suppShipAddrLine2 != null)&&this.suppShipAddrLine2 .equals(rhs.suppShipAddrLine2))))&&((this.textUsage == rhs.textUsage)||((this.textUsage!= null)&&this.textUsage.equals(rhs.textUsage))))&&((this.suppContact == rhs.suppContact)||((this.suppContact!= null)&&this.suppContact.equals(rhs.suppContact))))&&((this.shipCode == rhs.shipCode)||((this.shipCode!= null)&&this.shipCode.equals(rhs.shipCode))))&&((this.addCommInd == rhs.addCommInd)||((this.addCommInd!= null)&&this.addCommInd.equals(rhs.addCommInd))))&&((this.suppShipAddrLine3 == rhs.suppShipAddrLine3)||((this.suppShipAddrLine3 != null)&&this.suppShipAddrLine3 .equals(rhs.suppShipAddrLine3))))&&((this.suppShipAddrLine4 == rhs.suppShipAddrLine4)||((this.suppShipAddrLine4 != null)&&this.suppShipAddrLine4 .equals(rhs.suppShipAddrLine4))))&&((this.qty == rhs.qty)||((this.qty!= null)&&this.qty.equals(rhs.qty))))&&((this.liNote == rhs.liNote)||((this.liNote!= null)&&this.liNote.equals(rhs.liNote))))&&((this.displayExtendedAmt == rhs.displayExtendedAmt)||((this.displayExtendedAmt!= null)&&this.displayExtendedAmt.equals(rhs.displayExtendedAmt))))&&((this.displayAgreTitle == rhs.displayAgreTitle)||((this.displayAgreTitle!= null)&&this.displayAgreTitle.equals(rhs.displayAgreTitle))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.displayAgrePrice == rhs.displayAgrePrice)||((this.displayAgrePrice!= null)&&this.displayAgrePrice.equals(rhs.displayAgrePrice))))&&((this.uomsCode == rhs.uomsCode)||((this.uomsCode!= null)&&this.uomsCode.equals(rhs.uomsCode))));
    }

}
