
package com.ellucian.generated.bpapi.ban.admissions_application_contacts_cohorts_attributes.v1_0_0;

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
    "contDesc",
    "contactDate",
    "ctypCode"
})
@Generated("jsonschema2pojo")
public class Sorcont__1 {

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("contDesc")
    private String contDesc;
    /**
     * Contact Date
     * <p>
     * Lineage reference object : SORCONT_CONTACT_DATE
     * (Required)
     * 
     */
    @JsonProperty("contactDate")
    @JsonPropertyDescription("Lineage reference object : SORCONT_CONTACT_DATE")
    private Date contactDate;
    /**
     * Contact Type
     * <p>
     * Lineage reference object : SORCONT_CTYP_CODE, Lookup lineage reference object : stvctyp
     * (Required)
     * 
     */
    @JsonProperty("ctypCode")
    @JsonPropertyDescription("Lineage reference object : SORCONT_CTYP_CODE, Lookup lineage reference object : stvctyp")
    private String ctypCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("contDesc")
    public String getContDesc() {
        return contDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("contDesc")
    public void setContDesc(String contDesc) {
        this.contDesc = contDesc;
    }

    public Sorcont__1 withContDesc(String contDesc) {
        this.contDesc = contDesc;
        return this;
    }

    /**
     * Contact Date
     * <p>
     * Lineage reference object : SORCONT_CONTACT_DATE
     * (Required)
     * 
     */
    @JsonProperty("contactDate")
    public Date getContactDate() {
        return contactDate;
    }

    /**
     * Contact Date
     * <p>
     * Lineage reference object : SORCONT_CONTACT_DATE
     * (Required)
     * 
     */
    @JsonProperty("contactDate")
    public void setContactDate(Date contactDate) {
        this.contactDate = contactDate;
    }

    public Sorcont__1 withContactDate(Date contactDate) {
        this.contactDate = contactDate;
        return this;
    }

    /**
     * Contact Type
     * <p>
     * Lineage reference object : SORCONT_CTYP_CODE, Lookup lineage reference object : stvctyp
     * (Required)
     * 
     */
    @JsonProperty("ctypCode")
    public String getCtypCode() {
        return ctypCode;
    }

    /**
     * Contact Type
     * <p>
     * Lineage reference object : SORCONT_CTYP_CODE, Lookup lineage reference object : stvctyp
     * (Required)
     * 
     */
    @JsonProperty("ctypCode")
    public void setCtypCode(String ctypCode) {
        this.ctypCode = ctypCode;
    }

    public Sorcont__1 withCtypCode(String ctypCode) {
        this.ctypCode = ctypCode;
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

    public Sorcont__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sorcont__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("contDesc");
        sb.append('=');
        sb.append(((this.contDesc == null)?"<null>":this.contDesc));
        sb.append(',');
        sb.append("contactDate");
        sb.append('=');
        sb.append(((this.contactDate == null)?"<null>":this.contactDate));
        sb.append(',');
        sb.append("ctypCode");
        sb.append('=');
        sb.append(((this.ctypCode == null)?"<null>":this.ctypCode));
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
        result = ((result* 31)+((this.ctypCode == null)? 0 :this.ctypCode.hashCode()));
        result = ((result* 31)+((this.contDesc == null)? 0 :this.contDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.contactDate == null)? 0 :this.contactDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sorcont__1) == false) {
            return false;
        }
        Sorcont__1 rhs = ((Sorcont__1) other);
        return (((((this.ctypCode == rhs.ctypCode)||((this.ctypCode!= null)&&this.ctypCode.equals(rhs.ctypCode)))&&((this.contDesc == rhs.contDesc)||((this.contDesc!= null)&&this.contDesc.equals(rhs.contDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.contactDate == rhs.contactDate)||((this.contactDate!= null)&&this.contactDate.equals(rhs.contactDate))));
    }

}
