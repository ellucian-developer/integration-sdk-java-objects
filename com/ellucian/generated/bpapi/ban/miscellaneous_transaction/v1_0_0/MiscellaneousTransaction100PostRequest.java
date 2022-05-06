
package com.ellucian.generated.bpapi.ban.miscellaneous_transaction.v1_0_0;

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
    "streetLine1",
    "amount",
    "CrInd",
    "name",
    "houseNumber",
    "drCrInd",
    "workDetailCode",
    "desc"
})
@Generated("jsonschema2pojo")
public class MiscellaneousTransaction100PostRequest {

    /**
     * Street Line 1
     * <p>
     * Lineage reference object : TBBMISC_STREET_LINE1
     * 
     */
    @JsonProperty("streetLine1")
    @JsonPropertyDescription("Lineage reference object : TBBMISC_STREET_LINE1")
    private String streetLine1;
    /**
     * Amount
     * <p>
     * Lineage reference object : TBRMISD_AMOUNT
     * (Required)
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("Lineage reference object : TBRMISD_AMOUNT")
    private Double amount;
    /**
     * Debit or Credit
     * <p>
     * Lineage reference object : TBRMISD_DR_CR_IND
     * (Required)
     * 
     */
    @JsonProperty("CrInd")
    @JsonPropertyDescription("Lineage reference object : TBRMISD_DR_CR_IND")
    private String crInd;
    /**
     * Name
     * <p>
     * Lineage reference object : TBBMISC_NAME
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Lineage reference object : TBBMISC_NAME")
    private String name;
    /**
     * House Number
     * <p>
     * Lineage reference object : TBBMISC_HOUSE_NUMBER
     * 
     */
    @JsonProperty("houseNumber")
    @JsonPropertyDescription("Lineage reference object : TBBMISC_HOUSE_NUMBER")
    private String houseNumber;
    /**
     * Debit or Credit
     * <p>
     * Lineage reference object : TBRMISD_DR_CR_IND
     * (Required)
     * 
     */
    @JsonProperty("drCrInd")
    @JsonPropertyDescription("Lineage reference object : TBRMISD_DR_CR_IND")
    private String drCrInd;
    /**
     * Detail Code
     * <p>
     * Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("workDetailCode")
    @JsonPropertyDescription("Lookup lineage reference object : tbbdetc")
    private String workDetailCode;
    /**
     * Description
     * <p>
     * Lineage reference object : TBRMISD_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : TBRMISD_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Street Line 1
     * <p>
     * Lineage reference object : TBBMISC_STREET_LINE1
     * 
     */
    @JsonProperty("streetLine1")
    public String getStreetLine1() {
        return streetLine1;
    }

    /**
     * Street Line 1
     * <p>
     * Lineage reference object : TBBMISC_STREET_LINE1
     * 
     */
    @JsonProperty("streetLine1")
    public void setStreetLine1(String streetLine1) {
        this.streetLine1 = streetLine1;
    }

    public MiscellaneousTransaction100PostRequest withStreetLine1(String streetLine1) {
        this.streetLine1 = streetLine1;
        return this;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : TBRMISD_AMOUNT
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : TBRMISD_AMOUNT
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public MiscellaneousTransaction100PostRequest withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Debit or Credit
     * <p>
     * Lineage reference object : TBRMISD_DR_CR_IND
     * (Required)
     * 
     */
    @JsonProperty("CrInd")
    public String getCrInd() {
        return crInd;
    }

    /**
     * Debit or Credit
     * <p>
     * Lineage reference object : TBRMISD_DR_CR_IND
     * (Required)
     * 
     */
    @JsonProperty("CrInd")
    public void setCrInd(String crInd) {
        this.crInd = crInd;
    }

    public MiscellaneousTransaction100PostRequest withCrInd(String crInd) {
        this.crInd = crInd;
        return this;
    }

    /**
     * Name
     * <p>
     * Lineage reference object : TBBMISC_NAME
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name
     * <p>
     * Lineage reference object : TBBMISC_NAME
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public MiscellaneousTransaction100PostRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * House Number
     * <p>
     * Lineage reference object : TBBMISC_HOUSE_NUMBER
     * 
     */
    @JsonProperty("houseNumber")
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * House Number
     * <p>
     * Lineage reference object : TBBMISC_HOUSE_NUMBER
     * 
     */
    @JsonProperty("houseNumber")
    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public MiscellaneousTransaction100PostRequest withHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
        return this;
    }

    /**
     * Debit or Credit
     * <p>
     * Lineage reference object : TBRMISD_DR_CR_IND
     * (Required)
     * 
     */
    @JsonProperty("drCrInd")
    public String getDrCrInd() {
        return drCrInd;
    }

    /**
     * Debit or Credit
     * <p>
     * Lineage reference object : TBRMISD_DR_CR_IND
     * (Required)
     * 
     */
    @JsonProperty("drCrInd")
    public void setDrCrInd(String drCrInd) {
        this.drCrInd = drCrInd;
    }

    public MiscellaneousTransaction100PostRequest withDrCrInd(String drCrInd) {
        this.drCrInd = drCrInd;
        return this;
    }

    /**
     * Detail Code
     * <p>
     * Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("workDetailCode")
    public String getWorkDetailCode() {
        return workDetailCode;
    }

    /**
     * Detail Code
     * <p>
     * Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("workDetailCode")
    public void setWorkDetailCode(String workDetailCode) {
        this.workDetailCode = workDetailCode;
    }

    public MiscellaneousTransaction100PostRequest withWorkDetailCode(String workDetailCode) {
        this.workDetailCode = workDetailCode;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TBRMISD_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TBRMISD_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public MiscellaneousTransaction100PostRequest withDesc(String desc) {
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

    public MiscellaneousTransaction100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MiscellaneousTransaction100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("streetLine1");
        sb.append('=');
        sb.append(((this.streetLine1 == null)?"<null>":this.streetLine1));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("crInd");
        sb.append('=');
        sb.append(((this.crInd == null)?"<null>":this.crInd));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("houseNumber");
        sb.append('=');
        sb.append(((this.houseNumber == null)?"<null>":this.houseNumber));
        sb.append(',');
        sb.append("drCrInd");
        sb.append('=');
        sb.append(((this.drCrInd == null)?"<null>":this.drCrInd));
        sb.append(',');
        sb.append("workDetailCode");
        sb.append('=');
        sb.append(((this.workDetailCode == null)?"<null>":this.workDetailCode));
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
        result = ((result* 31)+((this.streetLine1 == null)? 0 :this.streetLine1 .hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.crInd == null)? 0 :this.crInd.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.houseNumber == null)? 0 :this.houseNumber.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.drCrInd == null)? 0 :this.drCrInd.hashCode()));
        result = ((result* 31)+((this.workDetailCode == null)? 0 :this.workDetailCode.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MiscellaneousTransaction100PostRequest) == false) {
            return false;
        }
        MiscellaneousTransaction100PostRequest rhs = ((MiscellaneousTransaction100PostRequest) other);
        return ((((((((((this.streetLine1 == rhs.streetLine1)||((this.streetLine1 != null)&&this.streetLine1 .equals(rhs.streetLine1)))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.crInd == rhs.crInd)||((this.crInd!= null)&&this.crInd.equals(rhs.crInd))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.houseNumber == rhs.houseNumber)||((this.houseNumber!= null)&&this.houseNumber.equals(rhs.houseNumber))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.drCrInd == rhs.drCrInd)||((this.drCrInd!= null)&&this.drCrInd.equals(rhs.drCrInd))))&&((this.workDetailCode == rhs.workDetailCode)||((this.workDetailCode!= null)&&this.workDetailCode.equals(rhs.workDetailCode))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
