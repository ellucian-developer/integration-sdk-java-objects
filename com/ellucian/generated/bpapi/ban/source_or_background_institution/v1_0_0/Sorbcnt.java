
package com.ellucian.generated.bpapi.ban.source_or_background_institution.v1_0_0;

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
    "phoneExt",
    "ptypDescription",
    "phoneNumber",
    "ptypCode",
    "name",
    "phoneArea",
    "ctryCodePhone"
})
@Generated("jsonschema2pojo")
public class Sorbcnt {

    /**
     * Extension
     * <p>
     * Lineage reference object : SORBCNT_PHONE_EXT
     * 
     */
    @JsonProperty("phoneExt")
    @JsonPropertyDescription("Lineage reference object : SORBCNT_PHONE_EXT")
    private String phoneExt;
    @JsonProperty("ptypDescription")
    private String ptypDescription;
    /**
     * Phone Number
     * <p>
     * Lineage reference object : SORBCNT_PHONE_NUMBER
     * 
     */
    @JsonProperty("phoneNumber")
    @JsonPropertyDescription("Lineage reference object : SORBCNT_PHONE_NUMBER")
    private String phoneNumber;
    /**
     * Person Type
     * <p>
     * Lineage reference object : SORBCNT_PTYP_CODE, Lookup lineage reference object : stvptyp
     * 
     */
    @JsonProperty("ptypCode")
    @JsonPropertyDescription("Lineage reference object : SORBCNT_PTYP_CODE, Lookup lineage reference object : stvptyp")
    private String ptypCode;
    /**
     * Contact Person
     * <p>
     * Lineage reference object : SORBCNT_NAME
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Lineage reference object : SORBCNT_NAME")
    private String name;
    /**
     * Area Code
     * <p>
     * Lineage reference object : SORBCNT_PHONE_AREA
     * 
     */
    @JsonProperty("phoneArea")
    @JsonPropertyDescription("Lineage reference object : SORBCNT_PHONE_AREA")
    private String phoneArea;
    /**
     * Country Code
     * <p>
     * Lineage reference object : SORBCNT_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("ctryCodePhone")
    @JsonPropertyDescription("Lineage reference object : SORBCNT_CTRY_CODE_PHONE")
    private String ctryCodePhone;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Extension
     * <p>
     * Lineage reference object : SORBCNT_PHONE_EXT
     * 
     */
    @JsonProperty("phoneExt")
    public String getPhoneExt() {
        return phoneExt;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : SORBCNT_PHONE_EXT
     * 
     */
    @JsonProperty("phoneExt")
    public void setPhoneExt(String phoneExt) {
        this.phoneExt = phoneExt;
    }

    public Sorbcnt withPhoneExt(String phoneExt) {
        this.phoneExt = phoneExt;
        return this;
    }

    @JsonProperty("ptypDescription")
    public String getPtypDescription() {
        return ptypDescription;
    }

    @JsonProperty("ptypDescription")
    public void setPtypDescription(String ptypDescription) {
        this.ptypDescription = ptypDescription;
    }

    public Sorbcnt withPtypDescription(String ptypDescription) {
        this.ptypDescription = ptypDescription;
        return this;
    }

    /**
     * Phone Number
     * <p>
     * Lineage reference object : SORBCNT_PHONE_NUMBER
     * 
     */
    @JsonProperty("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Phone Number
     * <p>
     * Lineage reference object : SORBCNT_PHONE_NUMBER
     * 
     */
    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Sorbcnt withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Person Type
     * <p>
     * Lineage reference object : SORBCNT_PTYP_CODE, Lookup lineage reference object : stvptyp
     * 
     */
    @JsonProperty("ptypCode")
    public String getPtypCode() {
        return ptypCode;
    }

    /**
     * Person Type
     * <p>
     * Lineage reference object : SORBCNT_PTYP_CODE, Lookup lineage reference object : stvptyp
     * 
     */
    @JsonProperty("ptypCode")
    public void setPtypCode(String ptypCode) {
        this.ptypCode = ptypCode;
    }

    public Sorbcnt withPtypCode(String ptypCode) {
        this.ptypCode = ptypCode;
        return this;
    }

    /**
     * Contact Person
     * <p>
     * Lineage reference object : SORBCNT_NAME
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Contact Person
     * <p>
     * Lineage reference object : SORBCNT_NAME
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Sorbcnt withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Area Code
     * <p>
     * Lineage reference object : SORBCNT_PHONE_AREA
     * 
     */
    @JsonProperty("phoneArea")
    public String getPhoneArea() {
        return phoneArea;
    }

    /**
     * Area Code
     * <p>
     * Lineage reference object : SORBCNT_PHONE_AREA
     * 
     */
    @JsonProperty("phoneArea")
    public void setPhoneArea(String phoneArea) {
        this.phoneArea = phoneArea;
    }

    public Sorbcnt withPhoneArea(String phoneArea) {
        this.phoneArea = phoneArea;
        return this;
    }

    /**
     * Country Code
     * <p>
     * Lineage reference object : SORBCNT_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("ctryCodePhone")
    public String getCtryCodePhone() {
        return ctryCodePhone;
    }

    /**
     * Country Code
     * <p>
     * Lineage reference object : SORBCNT_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("ctryCodePhone")
    public void setCtryCodePhone(String ctryCodePhone) {
        this.ctryCodePhone = ctryCodePhone;
    }

    public Sorbcnt withCtryCodePhone(String ctryCodePhone) {
        this.ctryCodePhone = ctryCodePhone;
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

    public Sorbcnt withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sorbcnt.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("phoneExt");
        sb.append('=');
        sb.append(((this.phoneExt == null)?"<null>":this.phoneExt));
        sb.append(',');
        sb.append("ptypDescription");
        sb.append('=');
        sb.append(((this.ptypDescription == null)?"<null>":this.ptypDescription));
        sb.append(',');
        sb.append("phoneNumber");
        sb.append('=');
        sb.append(((this.phoneNumber == null)?"<null>":this.phoneNumber));
        sb.append(',');
        sb.append("ptypCode");
        sb.append('=');
        sb.append(((this.ptypCode == null)?"<null>":this.ptypCode));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("phoneArea");
        sb.append('=');
        sb.append(((this.phoneArea == null)?"<null>":this.phoneArea));
        sb.append(',');
        sb.append("ctryCodePhone");
        sb.append('=');
        sb.append(((this.ctryCodePhone == null)?"<null>":this.ctryCodePhone));
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
        result = ((result* 31)+((this.phoneExt == null)? 0 :this.phoneExt.hashCode()));
        result = ((result* 31)+((this.ptypDescription == null)? 0 :this.ptypDescription.hashCode()));
        result = ((result* 31)+((this.phoneNumber == null)? 0 :this.phoneNumber.hashCode()));
        result = ((result* 31)+((this.ptypCode == null)? 0 :this.ptypCode.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.phoneArea == null)? 0 :this.phoneArea.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ctryCodePhone == null)? 0 :this.ctryCodePhone.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sorbcnt) == false) {
            return false;
        }
        Sorbcnt rhs = ((Sorbcnt) other);
        return (((((((((this.phoneExt == rhs.phoneExt)||((this.phoneExt!= null)&&this.phoneExt.equals(rhs.phoneExt)))&&((this.ptypDescription == rhs.ptypDescription)||((this.ptypDescription!= null)&&this.ptypDescription.equals(rhs.ptypDescription))))&&((this.phoneNumber == rhs.phoneNumber)||((this.phoneNumber!= null)&&this.phoneNumber.equals(rhs.phoneNumber))))&&((this.ptypCode == rhs.ptypCode)||((this.ptypCode!= null)&&this.ptypCode.equals(rhs.ptypCode))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.phoneArea == rhs.phoneArea)||((this.phoneArea!= null)&&this.phoneArea.equals(rhs.phoneArea))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ctryCodePhone == rhs.ctryCodePhone)||((this.ctryCodePhone!= null)&&this.ctryCodePhone.equals(rhs.ctryCodePhone))));
    }

}
