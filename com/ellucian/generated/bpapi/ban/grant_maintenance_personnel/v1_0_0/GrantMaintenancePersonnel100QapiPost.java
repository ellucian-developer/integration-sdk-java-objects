
package com.ellucian.generated.bpapi.ban.grant_maintenance_personnel.v1_0_0;

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
    "displayFrbgrntCode",
    "displayPropCode",
    "id",
    "addrSeqno",
    "idInd",
    "phoneType",
    "teleSeqno",
    "orgnCode",
    "email",
    "salutation",
    "bfrmCode",
    "title",
    "fte",
    "addrType",
    "employeeInd"
})
@Generated("jsonschema2pojo")
public class GrantMaintenancePersonnel100QapiPost {

    @JsonProperty("displayFrbgrntCode")
    private String displayFrbgrntCode;
    @JsonProperty("displayPropCode")
    private String displayPropCode;
    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    private String id;
    /**
     * Address Sequence Number
     * <p>
     * Lineage reference object : FRRGRPI_ADDR_SEQNO
     * 
     */
    @JsonProperty("addrSeqno")
    @JsonPropertyDescription("Lineage reference object : FRRGRPI_ADDR_SEQNO")
    private Double addrSeqno;
    /**
     * Indicator
     * <p>
     * Lineage reference object : FRRGRPI_ID_IND
     * 
     */
    @JsonProperty("idInd")
    @JsonPropertyDescription("Lineage reference object : FRRGRPI_ID_IND")
    private String idInd;
    /**
     * Phone Type
     * <p>
     * Lineage reference object : FRRGRPI_PHONE_TYPE
     * 
     */
    @JsonProperty("phoneType")
    @JsonPropertyDescription("Lineage reference object : FRRGRPI_PHONE_TYPE")
    private String phoneType;
    /**
     * Phone Sequence Number
     * <p>
     * Lineage reference object : FRRGRPI_TELE_SEQNO
     * 
     */
    @JsonProperty("teleSeqno")
    @JsonPropertyDescription("Lineage reference object : FRRGRPI_TELE_SEQNO")
    private Double teleSeqno;
    /**
     * Organization
     * <p>
     * Lineage reference object : FRRGRPI_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    @JsonPropertyDescription("Lineage reference object : FRRGRPI_ORGN_CODE")
    private String orgnCode;
    /**
     * E-mail
     * <p>
     * Lineage reference object : FRRGRPI_EMAIL
     * 
     */
    @JsonProperty("email")
    @JsonPropertyDescription("Lineage reference object : FRRGRPI_EMAIL")
    private String email;
    /**
     * Salutation
     * <p>
     * Lineage reference object : FRRGRPI_SALUTATION
     * 
     */
    @JsonProperty("salutation")
    @JsonPropertyDescription("Lineage reference object : FRRGRPI_SALUTATION")
    private String salutation;
    /**
     * Billing or Report Format
     * <p>
     * Lineage reference object : FRRGRPI_BFRM_CODE
     * 
     */
    @JsonProperty("bfrmCode")
    @JsonPropertyDescription("Lineage reference object : FRRGRPI_BFRM_CODE")
    private String bfrmCode;
    /**
     * Title
     * <p>
     * Lineage reference object : FRRGRPI_TITLE
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("Lineage reference object : FRRGRPI_TITLE")
    private String title;
    /**
     * Full Time Equivalency
     * <p>
     * Lineage reference object : FRRGRPI_FTE
     * 
     */
    @JsonProperty("fte")
    @JsonPropertyDescription("Lineage reference object : FRRGRPI_FTE")
    private Double fte;
    /**
     * Address Type
     * <p>
     * Lineage reference object : FRRGRPI_ADDR_TYPE
     * 
     */
    @JsonProperty("addrType")
    @JsonPropertyDescription("Lineage reference object : FRRGRPI_ADDR_TYPE")
    private String addrType;
    /**
     * Employee
     * <p>
     * Lineage reference object : FRRGRPI_EMPLOYEE_IND
     * 
     */
    @JsonProperty("employeeInd")
    @JsonPropertyDescription("Lineage reference object : FRRGRPI_EMPLOYEE_IND")
    private String employeeInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("displayFrbgrntCode")
    public String getDisplayFrbgrntCode() {
        return displayFrbgrntCode;
    }

    @JsonProperty("displayFrbgrntCode")
    public void setDisplayFrbgrntCode(String displayFrbgrntCode) {
        this.displayFrbgrntCode = displayFrbgrntCode;
    }

    public GrantMaintenancePersonnel100QapiPost withDisplayFrbgrntCode(String displayFrbgrntCode) {
        this.displayFrbgrntCode = displayFrbgrntCode;
        return this;
    }

    @JsonProperty("displayPropCode")
    public String getDisplayPropCode() {
        return displayPropCode;
    }

    @JsonProperty("displayPropCode")
    public void setDisplayPropCode(String displayPropCode) {
        this.displayPropCode = displayPropCode;
    }

    public GrantMaintenancePersonnel100QapiPost withDisplayPropCode(String displayPropCode) {
        this.displayPropCode = displayPropCode;
        return this;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public GrantMaintenancePersonnel100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Address Sequence Number
     * <p>
     * Lineage reference object : FRRGRPI_ADDR_SEQNO
     * 
     */
    @JsonProperty("addrSeqno")
    public Double getAddrSeqno() {
        return addrSeqno;
    }

    /**
     * Address Sequence Number
     * <p>
     * Lineage reference object : FRRGRPI_ADDR_SEQNO
     * 
     */
    @JsonProperty("addrSeqno")
    public void setAddrSeqno(Double addrSeqno) {
        this.addrSeqno = addrSeqno;
    }

    public GrantMaintenancePersonnel100QapiPost withAddrSeqno(Double addrSeqno) {
        this.addrSeqno = addrSeqno;
        return this;
    }

    /**
     * Indicator
     * <p>
     * Lineage reference object : FRRGRPI_ID_IND
     * 
     */
    @JsonProperty("idInd")
    public String getIdInd() {
        return idInd;
    }

    /**
     * Indicator
     * <p>
     * Lineage reference object : FRRGRPI_ID_IND
     * 
     */
    @JsonProperty("idInd")
    public void setIdInd(String idInd) {
        this.idInd = idInd;
    }

    public GrantMaintenancePersonnel100QapiPost withIdInd(String idInd) {
        this.idInd = idInd;
        return this;
    }

    /**
     * Phone Type
     * <p>
     * Lineage reference object : FRRGRPI_PHONE_TYPE
     * 
     */
    @JsonProperty("phoneType")
    public String getPhoneType() {
        return phoneType;
    }

    /**
     * Phone Type
     * <p>
     * Lineage reference object : FRRGRPI_PHONE_TYPE
     * 
     */
    @JsonProperty("phoneType")
    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    public GrantMaintenancePersonnel100QapiPost withPhoneType(String phoneType) {
        this.phoneType = phoneType;
        return this;
    }

    /**
     * Phone Sequence Number
     * <p>
     * Lineage reference object : FRRGRPI_TELE_SEQNO
     * 
     */
    @JsonProperty("teleSeqno")
    public Double getTeleSeqno() {
        return teleSeqno;
    }

    /**
     * Phone Sequence Number
     * <p>
     * Lineage reference object : FRRGRPI_TELE_SEQNO
     * 
     */
    @JsonProperty("teleSeqno")
    public void setTeleSeqno(Double teleSeqno) {
        this.teleSeqno = teleSeqno;
    }

    public GrantMaintenancePersonnel100QapiPost withTeleSeqno(Double teleSeqno) {
        this.teleSeqno = teleSeqno;
        return this;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : FRRGRPI_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    public String getOrgnCode() {
        return orgnCode;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : FRRGRPI_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    public void setOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
    }

    public GrantMaintenancePersonnel100QapiPost withOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
        return this;
    }

    /**
     * E-mail
     * <p>
     * Lineage reference object : FRRGRPI_EMAIL
     * 
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * E-mail
     * <p>
     * Lineage reference object : FRRGRPI_EMAIL
     * 
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    public GrantMaintenancePersonnel100QapiPost withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Salutation
     * <p>
     * Lineage reference object : FRRGRPI_SALUTATION
     * 
     */
    @JsonProperty("salutation")
    public String getSalutation() {
        return salutation;
    }

    /**
     * Salutation
     * <p>
     * Lineage reference object : FRRGRPI_SALUTATION
     * 
     */
    @JsonProperty("salutation")
    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public GrantMaintenancePersonnel100QapiPost withSalutation(String salutation) {
        this.salutation = salutation;
        return this;
    }

    /**
     * Billing or Report Format
     * <p>
     * Lineage reference object : FRRGRPI_BFRM_CODE
     * 
     */
    @JsonProperty("bfrmCode")
    public String getBfrmCode() {
        return bfrmCode;
    }

    /**
     * Billing or Report Format
     * <p>
     * Lineage reference object : FRRGRPI_BFRM_CODE
     * 
     */
    @JsonProperty("bfrmCode")
    public void setBfrmCode(String bfrmCode) {
        this.bfrmCode = bfrmCode;
    }

    public GrantMaintenancePersonnel100QapiPost withBfrmCode(String bfrmCode) {
        this.bfrmCode = bfrmCode;
        return this;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : FRRGRPI_TITLE
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : FRRGRPI_TITLE
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public GrantMaintenancePersonnel100QapiPost withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Full Time Equivalency
     * <p>
     * Lineage reference object : FRRGRPI_FTE
     * 
     */
    @JsonProperty("fte")
    public Double getFte() {
        return fte;
    }

    /**
     * Full Time Equivalency
     * <p>
     * Lineage reference object : FRRGRPI_FTE
     * 
     */
    @JsonProperty("fte")
    public void setFte(Double fte) {
        this.fte = fte;
    }

    public GrantMaintenancePersonnel100QapiPost withFte(Double fte) {
        this.fte = fte;
        return this;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : FRRGRPI_ADDR_TYPE
     * 
     */
    @JsonProperty("addrType")
    public String getAddrType() {
        return addrType;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : FRRGRPI_ADDR_TYPE
     * 
     */
    @JsonProperty("addrType")
    public void setAddrType(String addrType) {
        this.addrType = addrType;
    }

    public GrantMaintenancePersonnel100QapiPost withAddrType(String addrType) {
        this.addrType = addrType;
        return this;
    }

    /**
     * Employee
     * <p>
     * Lineage reference object : FRRGRPI_EMPLOYEE_IND
     * 
     */
    @JsonProperty("employeeInd")
    public String getEmployeeInd() {
        return employeeInd;
    }

    /**
     * Employee
     * <p>
     * Lineage reference object : FRRGRPI_EMPLOYEE_IND
     * 
     */
    @JsonProperty("employeeInd")
    public void setEmployeeInd(String employeeInd) {
        this.employeeInd = employeeInd;
    }

    public GrantMaintenancePersonnel100QapiPost withEmployeeInd(String employeeInd) {
        this.employeeInd = employeeInd;
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

    public GrantMaintenancePersonnel100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GrantMaintenancePersonnel100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("displayFrbgrntCode");
        sb.append('=');
        sb.append(((this.displayFrbgrntCode == null)?"<null>":this.displayFrbgrntCode));
        sb.append(',');
        sb.append("displayPropCode");
        sb.append('=');
        sb.append(((this.displayPropCode == null)?"<null>":this.displayPropCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("addrSeqno");
        sb.append('=');
        sb.append(((this.addrSeqno == null)?"<null>":this.addrSeqno));
        sb.append(',');
        sb.append("idInd");
        sb.append('=');
        sb.append(((this.idInd == null)?"<null>":this.idInd));
        sb.append(',');
        sb.append("phoneType");
        sb.append('=');
        sb.append(((this.phoneType == null)?"<null>":this.phoneType));
        sb.append(',');
        sb.append("teleSeqno");
        sb.append('=');
        sb.append(((this.teleSeqno == null)?"<null>":this.teleSeqno));
        sb.append(',');
        sb.append("orgnCode");
        sb.append('=');
        sb.append(((this.orgnCode == null)?"<null>":this.orgnCode));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
        sb.append(',');
        sb.append("salutation");
        sb.append('=');
        sb.append(((this.salutation == null)?"<null>":this.salutation));
        sb.append(',');
        sb.append("bfrmCode");
        sb.append('=');
        sb.append(((this.bfrmCode == null)?"<null>":this.bfrmCode));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("fte");
        sb.append('=');
        sb.append(((this.fte == null)?"<null>":this.fte));
        sb.append(',');
        sb.append("addrType");
        sb.append('=');
        sb.append(((this.addrType == null)?"<null>":this.addrType));
        sb.append(',');
        sb.append("employeeInd");
        sb.append('=');
        sb.append(((this.employeeInd == null)?"<null>":this.employeeInd));
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
        result = ((result* 31)+((this.phoneType == null)? 0 :this.phoneType.hashCode()));
        result = ((result* 31)+((this.teleSeqno == null)? 0 :this.teleSeqno.hashCode()));
        result = ((result* 31)+((this.employeeInd == null)? 0 :this.employeeInd.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.orgnCode == null)? 0 :this.orgnCode.hashCode()));
        result = ((result* 31)+((this.displayFrbgrntCode == null)? 0 :this.displayFrbgrntCode.hashCode()));
        result = ((result* 31)+((this.idInd == null)? 0 :this.idInd.hashCode()));
        result = ((result* 31)+((this.displayPropCode == null)? 0 :this.displayPropCode.hashCode()));
        result = ((result* 31)+((this.addrSeqno == null)? 0 :this.addrSeqno.hashCode()));
        result = ((result* 31)+((this.fte == null)? 0 :this.fte.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.salutation == null)? 0 :this.salutation.hashCode()));
        result = ((result* 31)+((this.bfrmCode == null)? 0 :this.bfrmCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
        result = ((result* 31)+((this.addrType == null)? 0 :this.addrType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GrantMaintenancePersonnel100QapiPost) == false) {
            return false;
        }
        GrantMaintenancePersonnel100QapiPost rhs = ((GrantMaintenancePersonnel100QapiPost) other);
        return (((((((((((((((((this.phoneType == rhs.phoneType)||((this.phoneType!= null)&&this.phoneType.equals(rhs.phoneType)))&&((this.teleSeqno == rhs.teleSeqno)||((this.teleSeqno!= null)&&this.teleSeqno.equals(rhs.teleSeqno))))&&((this.employeeInd == rhs.employeeInd)||((this.employeeInd!= null)&&this.employeeInd.equals(rhs.employeeInd))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.orgnCode == rhs.orgnCode)||((this.orgnCode!= null)&&this.orgnCode.equals(rhs.orgnCode))))&&((this.displayFrbgrntCode == rhs.displayFrbgrntCode)||((this.displayFrbgrntCode!= null)&&this.displayFrbgrntCode.equals(rhs.displayFrbgrntCode))))&&((this.idInd == rhs.idInd)||((this.idInd!= null)&&this.idInd.equals(rhs.idInd))))&&((this.displayPropCode == rhs.displayPropCode)||((this.displayPropCode!= null)&&this.displayPropCode.equals(rhs.displayPropCode))))&&((this.addrSeqno == rhs.addrSeqno)||((this.addrSeqno!= null)&&this.addrSeqno.equals(rhs.addrSeqno))))&&((this.fte == rhs.fte)||((this.fte!= null)&&this.fte.equals(rhs.fte))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.salutation == rhs.salutation)||((this.salutation!= null)&&this.salutation.equals(rhs.salutation))))&&((this.bfrmCode == rhs.bfrmCode)||((this.bfrmCode!= null)&&this.bfrmCode.equals(rhs.bfrmCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))))&&((this.addrType == rhs.addrType)||((this.addrType!= null)&&this.addrType.equals(rhs.addrType))));
    }

}
