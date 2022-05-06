
package com.ellucian.generated.bpapi.ban.ship_to_codes.v1_0_0;

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
    "ftvshipBuilding",
    "ftvshipCode",
    "ftvshipContact",
    "ftvshipCtryCodePhone",
    "ftvshipEffDate",
    "ftvshipFloor",
    "ftvshipPhoneArea",
    "ftvshipPhoneExt",
    "ftvshipPhoneNum",
    "ftvshipTermDate"
})
@Generated("jsonschema2pojo")
public class ShipToCodes100QapiPost {

    /**
     * Building
     * <p>
     * Lineage reference object : FTVSHIP_BUILDING
     * 
     */
    @JsonProperty("ftvshipBuilding")
    @JsonPropertyDescription("Lineage reference object : FTVSHIP_BUILDING")
    private String ftvshipBuilding;
    /**
     * Ship To Code
     * <p>
     * Lineage reference object : FTVSHIP_CODE
     * 
     */
    @JsonProperty("ftvshipCode")
    @JsonPropertyDescription("Lineage reference object : FTVSHIP_CODE")
    private String ftvshipCode;
    /**
     * Contact Name
     * <p>
     * Lineage reference object : FTVSHIP_CONTACT
     * 
     */
    @JsonProperty("ftvshipContact")
    @JsonPropertyDescription("Lineage reference object : FTVSHIP_CONTACT")
    private String ftvshipContact;
    @JsonProperty("ftvshipCtryCodePhone")
    private String ftvshipCtryCodePhone;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVSHIP_EFF_DATE
     * 
     */
    @JsonProperty("ftvshipEffDate")
    @JsonPropertyDescription("Lineage reference object : FTVSHIP_EFF_DATE")
    private Date ftvshipEffDate;
    /**
     * Floor
     * <p>
     * Lineage reference object : FTVSHIP_FLOOR
     * 
     */
    @JsonProperty("ftvshipFloor")
    @JsonPropertyDescription("Lineage reference object : FTVSHIP_FLOOR")
    private String ftvshipFloor;
    /**
     * Area Code
     * <p>
     * Lineage reference object : FTVSHIP_PHONE_AREA
     * 
     */
    @JsonProperty("ftvshipPhoneArea")
    @JsonPropertyDescription("Lineage reference object : FTVSHIP_PHONE_AREA")
    private String ftvshipPhoneArea;
    /**
     * Extension
     * <p>
     * Lineage reference object : FTVSHIP_PHONE_EXT
     * 
     */
    @JsonProperty("ftvshipPhoneExt")
    @JsonPropertyDescription("Lineage reference object : FTVSHIP_PHONE_EXT")
    private String ftvshipPhoneExt;
    /**
     * Phone Number
     * <p>
     * Lineage reference object : FTVSHIP_PHONE_NUM
     * 
     */
    @JsonProperty("ftvshipPhoneNum")
    @JsonPropertyDescription("Lineage reference object : FTVSHIP_PHONE_NUM")
    private String ftvshipPhoneNum;
    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVSHIP_TERM_DATE
     * 
     */
    @JsonProperty("ftvshipTermDate")
    @JsonPropertyDescription("Lineage reference object : FTVSHIP_TERM_DATE")
    private Date ftvshipTermDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Building
     * <p>
     * Lineage reference object : FTVSHIP_BUILDING
     * 
     */
    @JsonProperty("ftvshipBuilding")
    public String getFtvshipBuilding() {
        return ftvshipBuilding;
    }

    /**
     * Building
     * <p>
     * Lineage reference object : FTVSHIP_BUILDING
     * 
     */
    @JsonProperty("ftvshipBuilding")
    public void setFtvshipBuilding(String ftvshipBuilding) {
        this.ftvshipBuilding = ftvshipBuilding;
    }

    public ShipToCodes100QapiPost withFtvshipBuilding(String ftvshipBuilding) {
        this.ftvshipBuilding = ftvshipBuilding;
        return this;
    }

    /**
     * Ship To Code
     * <p>
     * Lineage reference object : FTVSHIP_CODE
     * 
     */
    @JsonProperty("ftvshipCode")
    public String getFtvshipCode() {
        return ftvshipCode;
    }

    /**
     * Ship To Code
     * <p>
     * Lineage reference object : FTVSHIP_CODE
     * 
     */
    @JsonProperty("ftvshipCode")
    public void setFtvshipCode(String ftvshipCode) {
        this.ftvshipCode = ftvshipCode;
    }

    public ShipToCodes100QapiPost withFtvshipCode(String ftvshipCode) {
        this.ftvshipCode = ftvshipCode;
        return this;
    }

    /**
     * Contact Name
     * <p>
     * Lineage reference object : FTVSHIP_CONTACT
     * 
     */
    @JsonProperty("ftvshipContact")
    public String getFtvshipContact() {
        return ftvshipContact;
    }

    /**
     * Contact Name
     * <p>
     * Lineage reference object : FTVSHIP_CONTACT
     * 
     */
    @JsonProperty("ftvshipContact")
    public void setFtvshipContact(String ftvshipContact) {
        this.ftvshipContact = ftvshipContact;
    }

    public ShipToCodes100QapiPost withFtvshipContact(String ftvshipContact) {
        this.ftvshipContact = ftvshipContact;
        return this;
    }

    @JsonProperty("ftvshipCtryCodePhone")
    public String getFtvshipCtryCodePhone() {
        return ftvshipCtryCodePhone;
    }

    @JsonProperty("ftvshipCtryCodePhone")
    public void setFtvshipCtryCodePhone(String ftvshipCtryCodePhone) {
        this.ftvshipCtryCodePhone = ftvshipCtryCodePhone;
    }

    public ShipToCodes100QapiPost withFtvshipCtryCodePhone(String ftvshipCtryCodePhone) {
        this.ftvshipCtryCodePhone = ftvshipCtryCodePhone;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVSHIP_EFF_DATE
     * 
     */
    @JsonProperty("ftvshipEffDate")
    public Date getFtvshipEffDate() {
        return ftvshipEffDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVSHIP_EFF_DATE
     * 
     */
    @JsonProperty("ftvshipEffDate")
    public void setFtvshipEffDate(Date ftvshipEffDate) {
        this.ftvshipEffDate = ftvshipEffDate;
    }

    public ShipToCodes100QapiPost withFtvshipEffDate(Date ftvshipEffDate) {
        this.ftvshipEffDate = ftvshipEffDate;
        return this;
    }

    /**
     * Floor
     * <p>
     * Lineage reference object : FTVSHIP_FLOOR
     * 
     */
    @JsonProperty("ftvshipFloor")
    public String getFtvshipFloor() {
        return ftvshipFloor;
    }

    /**
     * Floor
     * <p>
     * Lineage reference object : FTVSHIP_FLOOR
     * 
     */
    @JsonProperty("ftvshipFloor")
    public void setFtvshipFloor(String ftvshipFloor) {
        this.ftvshipFloor = ftvshipFloor;
    }

    public ShipToCodes100QapiPost withFtvshipFloor(String ftvshipFloor) {
        this.ftvshipFloor = ftvshipFloor;
        return this;
    }

    /**
     * Area Code
     * <p>
     * Lineage reference object : FTVSHIP_PHONE_AREA
     * 
     */
    @JsonProperty("ftvshipPhoneArea")
    public String getFtvshipPhoneArea() {
        return ftvshipPhoneArea;
    }

    /**
     * Area Code
     * <p>
     * Lineage reference object : FTVSHIP_PHONE_AREA
     * 
     */
    @JsonProperty("ftvshipPhoneArea")
    public void setFtvshipPhoneArea(String ftvshipPhoneArea) {
        this.ftvshipPhoneArea = ftvshipPhoneArea;
    }

    public ShipToCodes100QapiPost withFtvshipPhoneArea(String ftvshipPhoneArea) {
        this.ftvshipPhoneArea = ftvshipPhoneArea;
        return this;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : FTVSHIP_PHONE_EXT
     * 
     */
    @JsonProperty("ftvshipPhoneExt")
    public String getFtvshipPhoneExt() {
        return ftvshipPhoneExt;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : FTVSHIP_PHONE_EXT
     * 
     */
    @JsonProperty("ftvshipPhoneExt")
    public void setFtvshipPhoneExt(String ftvshipPhoneExt) {
        this.ftvshipPhoneExt = ftvshipPhoneExt;
    }

    public ShipToCodes100QapiPost withFtvshipPhoneExt(String ftvshipPhoneExt) {
        this.ftvshipPhoneExt = ftvshipPhoneExt;
        return this;
    }

    /**
     * Phone Number
     * <p>
     * Lineage reference object : FTVSHIP_PHONE_NUM
     * 
     */
    @JsonProperty("ftvshipPhoneNum")
    public String getFtvshipPhoneNum() {
        return ftvshipPhoneNum;
    }

    /**
     * Phone Number
     * <p>
     * Lineage reference object : FTVSHIP_PHONE_NUM
     * 
     */
    @JsonProperty("ftvshipPhoneNum")
    public void setFtvshipPhoneNum(String ftvshipPhoneNum) {
        this.ftvshipPhoneNum = ftvshipPhoneNum;
    }

    public ShipToCodes100QapiPost withFtvshipPhoneNum(String ftvshipPhoneNum) {
        this.ftvshipPhoneNum = ftvshipPhoneNum;
        return this;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVSHIP_TERM_DATE
     * 
     */
    @JsonProperty("ftvshipTermDate")
    public Date getFtvshipTermDate() {
        return ftvshipTermDate;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVSHIP_TERM_DATE
     * 
     */
    @JsonProperty("ftvshipTermDate")
    public void setFtvshipTermDate(Date ftvshipTermDate) {
        this.ftvshipTermDate = ftvshipTermDate;
    }

    public ShipToCodes100QapiPost withFtvshipTermDate(Date ftvshipTermDate) {
        this.ftvshipTermDate = ftvshipTermDate;
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

    public ShipToCodes100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ShipToCodes100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ftvshipBuilding");
        sb.append('=');
        sb.append(((this.ftvshipBuilding == null)?"<null>":this.ftvshipBuilding));
        sb.append(',');
        sb.append("ftvshipCode");
        sb.append('=');
        sb.append(((this.ftvshipCode == null)?"<null>":this.ftvshipCode));
        sb.append(',');
        sb.append("ftvshipContact");
        sb.append('=');
        sb.append(((this.ftvshipContact == null)?"<null>":this.ftvshipContact));
        sb.append(',');
        sb.append("ftvshipCtryCodePhone");
        sb.append('=');
        sb.append(((this.ftvshipCtryCodePhone == null)?"<null>":this.ftvshipCtryCodePhone));
        sb.append(',');
        sb.append("ftvshipEffDate");
        sb.append('=');
        sb.append(((this.ftvshipEffDate == null)?"<null>":this.ftvshipEffDate));
        sb.append(',');
        sb.append("ftvshipFloor");
        sb.append('=');
        sb.append(((this.ftvshipFloor == null)?"<null>":this.ftvshipFloor));
        sb.append(',');
        sb.append("ftvshipPhoneArea");
        sb.append('=');
        sb.append(((this.ftvshipPhoneArea == null)?"<null>":this.ftvshipPhoneArea));
        sb.append(',');
        sb.append("ftvshipPhoneExt");
        sb.append('=');
        sb.append(((this.ftvshipPhoneExt == null)?"<null>":this.ftvshipPhoneExt));
        sb.append(',');
        sb.append("ftvshipPhoneNum");
        sb.append('=');
        sb.append(((this.ftvshipPhoneNum == null)?"<null>":this.ftvshipPhoneNum));
        sb.append(',');
        sb.append("ftvshipTermDate");
        sb.append('=');
        sb.append(((this.ftvshipTermDate == null)?"<null>":this.ftvshipTermDate));
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
        result = ((result* 31)+((this.ftvshipBuilding == null)? 0 :this.ftvshipBuilding.hashCode()));
        result = ((result* 31)+((this.ftvshipPhoneExt == null)? 0 :this.ftvshipPhoneExt.hashCode()));
        result = ((result* 31)+((this.ftvshipPhoneArea == null)? 0 :this.ftvshipPhoneArea.hashCode()));
        result = ((result* 31)+((this.ftvshipCode == null)? 0 :this.ftvshipCode.hashCode()));
        result = ((result* 31)+((this.ftvshipTermDate == null)? 0 :this.ftvshipTermDate.hashCode()));
        result = ((result* 31)+((this.ftvshipContact == null)? 0 :this.ftvshipContact.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ftvshipCtryCodePhone == null)? 0 :this.ftvshipCtryCodePhone.hashCode()));
        result = ((result* 31)+((this.ftvshipFloor == null)? 0 :this.ftvshipFloor.hashCode()));
        result = ((result* 31)+((this.ftvshipEffDate == null)? 0 :this.ftvshipEffDate.hashCode()));
        result = ((result* 31)+((this.ftvshipPhoneNum == null)? 0 :this.ftvshipPhoneNum.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ShipToCodes100QapiPost) == false) {
            return false;
        }
        ShipToCodes100QapiPost rhs = ((ShipToCodes100QapiPost) other);
        return ((((((((((((this.ftvshipBuilding == rhs.ftvshipBuilding)||((this.ftvshipBuilding!= null)&&this.ftvshipBuilding.equals(rhs.ftvshipBuilding)))&&((this.ftvshipPhoneExt == rhs.ftvshipPhoneExt)||((this.ftvshipPhoneExt!= null)&&this.ftvshipPhoneExt.equals(rhs.ftvshipPhoneExt))))&&((this.ftvshipPhoneArea == rhs.ftvshipPhoneArea)||((this.ftvshipPhoneArea!= null)&&this.ftvshipPhoneArea.equals(rhs.ftvshipPhoneArea))))&&((this.ftvshipCode == rhs.ftvshipCode)||((this.ftvshipCode!= null)&&this.ftvshipCode.equals(rhs.ftvshipCode))))&&((this.ftvshipTermDate == rhs.ftvshipTermDate)||((this.ftvshipTermDate!= null)&&this.ftvshipTermDate.equals(rhs.ftvshipTermDate))))&&((this.ftvshipContact == rhs.ftvshipContact)||((this.ftvshipContact!= null)&&this.ftvshipContact.equals(rhs.ftvshipContact))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ftvshipCtryCodePhone == rhs.ftvshipCtryCodePhone)||((this.ftvshipCtryCodePhone!= null)&&this.ftvshipCtryCodePhone.equals(rhs.ftvshipCtryCodePhone))))&&((this.ftvshipFloor == rhs.ftvshipFloor)||((this.ftvshipFloor!= null)&&this.ftvshipFloor.equals(rhs.ftvshipFloor))))&&((this.ftvshipEffDate == rhs.ftvshipEffDate)||((this.ftvshipEffDate!= null)&&this.ftvshipEffDate.equals(rhs.ftvshipEffDate))))&&((this.ftvshipPhoneNum == rhs.ftvshipPhoneNum)||((this.ftvshipPhoneNum!= null)&&this.ftvshipPhoneNum.equals(rhs.ftvshipPhoneNum))));
    }

}
