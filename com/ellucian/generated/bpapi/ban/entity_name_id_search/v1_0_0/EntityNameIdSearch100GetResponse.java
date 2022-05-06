
package com.ellucian.generated.bpapi.ban.entity_name_id_search.v1_0_0;

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
    "finMgrInd",
    "lastName",
    "surnamePrefix",
    "agencyInd",
    "entityInd",
    "grantInd",
    "firstName",
    "changeInd",
    "ntypCode",
    "vendorInd",
    "id",
    "mi",
    "piInd"
})
@Generated("jsonschema2pojo")
public class EntityNameIdSearch100GetResponse {

    /**
     * Financial Manager
     * <p>
     * 
     * 
     */
    @JsonProperty("finMgrInd")
    private String finMgrInd;
    /**
     * Last Name
     * <p>
     * Lineage reference object : SPRIDEN_LAST_NAME
     * 
     */
    @JsonProperty("lastName")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_LAST_NAME")
    private String lastName;
    /**
     * Last Name Prefix
     * <p>
     * Lineage reference object : SPRIDEN_SURNAME_PREFIX
     * 
     */
    @JsonProperty("surnamePrefix")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_SURNAME_PREFIX")
    private String surnamePrefix;
    /**
     * Agency
     * <p>
     * 
     * 
     */
    @JsonProperty("agencyInd")
    private String agencyInd;
    @JsonProperty("entityInd")
    private String entityInd;
    /**
     * Grant Personnel
     * <p>
     * 
     * 
     */
    @JsonProperty("grantInd")
    private String grantInd;
    /**
     * First Name
     * <p>
     * Lineage reference object : SPRIDEN_FIRST_NAME
     * 
     */
    @JsonProperty("firstName")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_FIRST_NAME")
    private String firstName;
    @JsonProperty("changeInd")
    private String changeInd;
    /**
     * Name Type
     * <p>
     * Lineage reference object : SPRIDEN_NTYP_CODE, Lookup lineage reference object : gtvntyp
     * 
     */
    @JsonProperty("ntypCode")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_NTYP_CODE, Lookup lineage reference object : gtvntyp")
    private String ntypCode;
    /**
     * Vendor
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorInd")
    private String vendorInd;
    /**
     * ID
     * <p>
     * Lineage reference object : SPRIDEN_ID
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_ID")
    private String id;
    /**
     * Middle Name
     * <p>
     * Lineage reference object : SPRIDEN_MI
     * 
     */
    @JsonProperty("mi")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_MI")
    private String mi;
    /**
     * Proposal Personnel
     * <p>
     * 
     * 
     */
    @JsonProperty("piInd")
    private String piInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Financial Manager
     * <p>
     * 
     * 
     */
    @JsonProperty("finMgrInd")
    public String getFinMgrInd() {
        return finMgrInd;
    }

    /**
     * Financial Manager
     * <p>
     * 
     * 
     */
    @JsonProperty("finMgrInd")
    public void setFinMgrInd(String finMgrInd) {
        this.finMgrInd = finMgrInd;
    }

    public EntityNameIdSearch100GetResponse withFinMgrInd(String finMgrInd) {
        this.finMgrInd = finMgrInd;
        return this;
    }

    /**
     * Last Name
     * <p>
     * Lineage reference object : SPRIDEN_LAST_NAME
     * 
     */
    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    /**
     * Last Name
     * <p>
     * Lineage reference object : SPRIDEN_LAST_NAME
     * 
     */
    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public EntityNameIdSearch100GetResponse withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Last Name Prefix
     * <p>
     * Lineage reference object : SPRIDEN_SURNAME_PREFIX
     * 
     */
    @JsonProperty("surnamePrefix")
    public String getSurnamePrefix() {
        return surnamePrefix;
    }

    /**
     * Last Name Prefix
     * <p>
     * Lineage reference object : SPRIDEN_SURNAME_PREFIX
     * 
     */
    @JsonProperty("surnamePrefix")
    public void setSurnamePrefix(String surnamePrefix) {
        this.surnamePrefix = surnamePrefix;
    }

    public EntityNameIdSearch100GetResponse withSurnamePrefix(String surnamePrefix) {
        this.surnamePrefix = surnamePrefix;
        return this;
    }

    /**
     * Agency
     * <p>
     * 
     * 
     */
    @JsonProperty("agencyInd")
    public String getAgencyInd() {
        return agencyInd;
    }

    /**
     * Agency
     * <p>
     * 
     * 
     */
    @JsonProperty("agencyInd")
    public void setAgencyInd(String agencyInd) {
        this.agencyInd = agencyInd;
    }

    public EntityNameIdSearch100GetResponse withAgencyInd(String agencyInd) {
        this.agencyInd = agencyInd;
        return this;
    }

    @JsonProperty("entityInd")
    public String getEntityInd() {
        return entityInd;
    }

    @JsonProperty("entityInd")
    public void setEntityInd(String entityInd) {
        this.entityInd = entityInd;
    }

    public EntityNameIdSearch100GetResponse withEntityInd(String entityInd) {
        this.entityInd = entityInd;
        return this;
    }

    /**
     * Grant Personnel
     * <p>
     * 
     * 
     */
    @JsonProperty("grantInd")
    public String getGrantInd() {
        return grantInd;
    }

    /**
     * Grant Personnel
     * <p>
     * 
     * 
     */
    @JsonProperty("grantInd")
    public void setGrantInd(String grantInd) {
        this.grantInd = grantInd;
    }

    public EntityNameIdSearch100GetResponse withGrantInd(String grantInd) {
        this.grantInd = grantInd;
        return this;
    }

    /**
     * First Name
     * <p>
     * Lineage reference object : SPRIDEN_FIRST_NAME
     * 
     */
    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    /**
     * First Name
     * <p>
     * Lineage reference object : SPRIDEN_FIRST_NAME
     * 
     */
    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public EntityNameIdSearch100GetResponse withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @JsonProperty("changeInd")
    public String getChangeInd() {
        return changeInd;
    }

    @JsonProperty("changeInd")
    public void setChangeInd(String changeInd) {
        this.changeInd = changeInd;
    }

    public EntityNameIdSearch100GetResponse withChangeInd(String changeInd) {
        this.changeInd = changeInd;
        return this;
    }

    /**
     * Name Type
     * <p>
     * Lineage reference object : SPRIDEN_NTYP_CODE, Lookup lineage reference object : gtvntyp
     * 
     */
    @JsonProperty("ntypCode")
    public String getNtypCode() {
        return ntypCode;
    }

    /**
     * Name Type
     * <p>
     * Lineage reference object : SPRIDEN_NTYP_CODE, Lookup lineage reference object : gtvntyp
     * 
     */
    @JsonProperty("ntypCode")
    public void setNtypCode(String ntypCode) {
        this.ntypCode = ntypCode;
    }

    public EntityNameIdSearch100GetResponse withNtypCode(String ntypCode) {
        this.ntypCode = ntypCode;
        return this;
    }

    /**
     * Vendor
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorInd")
    public String getVendorInd() {
        return vendorInd;
    }

    /**
     * Vendor
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorInd")
    public void setVendorInd(String vendorInd) {
        this.vendorInd = vendorInd;
    }

    public EntityNameIdSearch100GetResponse withVendorInd(String vendorInd) {
        this.vendorInd = vendorInd;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : SPRIDEN_ID
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : SPRIDEN_ID
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public EntityNameIdSearch100GetResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Middle Name
     * <p>
     * Lineage reference object : SPRIDEN_MI
     * 
     */
    @JsonProperty("mi")
    public String getMi() {
        return mi;
    }

    /**
     * Middle Name
     * <p>
     * Lineage reference object : SPRIDEN_MI
     * 
     */
    @JsonProperty("mi")
    public void setMi(String mi) {
        this.mi = mi;
    }

    public EntityNameIdSearch100GetResponse withMi(String mi) {
        this.mi = mi;
        return this;
    }

    /**
     * Proposal Personnel
     * <p>
     * 
     * 
     */
    @JsonProperty("piInd")
    public String getPiInd() {
        return piInd;
    }

    /**
     * Proposal Personnel
     * <p>
     * 
     * 
     */
    @JsonProperty("piInd")
    public void setPiInd(String piInd) {
        this.piInd = piInd;
    }

    public EntityNameIdSearch100GetResponse withPiInd(String piInd) {
        this.piInd = piInd;
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

    public EntityNameIdSearch100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EntityNameIdSearch100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("finMgrInd");
        sb.append('=');
        sb.append(((this.finMgrInd == null)?"<null>":this.finMgrInd));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("surnamePrefix");
        sb.append('=');
        sb.append(((this.surnamePrefix == null)?"<null>":this.surnamePrefix));
        sb.append(',');
        sb.append("agencyInd");
        sb.append('=');
        sb.append(((this.agencyInd == null)?"<null>":this.agencyInd));
        sb.append(',');
        sb.append("entityInd");
        sb.append('=');
        sb.append(((this.entityInd == null)?"<null>":this.entityInd));
        sb.append(',');
        sb.append("grantInd");
        sb.append('=');
        sb.append(((this.grantInd == null)?"<null>":this.grantInd));
        sb.append(',');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("changeInd");
        sb.append('=');
        sb.append(((this.changeInd == null)?"<null>":this.changeInd));
        sb.append(',');
        sb.append("ntypCode");
        sb.append('=');
        sb.append(((this.ntypCode == null)?"<null>":this.ntypCode));
        sb.append(',');
        sb.append("vendorInd");
        sb.append('=');
        sb.append(((this.vendorInd == null)?"<null>":this.vendorInd));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("mi");
        sb.append('=');
        sb.append(((this.mi == null)?"<null>":this.mi));
        sb.append(',');
        sb.append("piInd");
        sb.append('=');
        sb.append(((this.piInd == null)?"<null>":this.piInd));
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
        result = ((result* 31)+((this.finMgrInd == null)? 0 :this.finMgrInd.hashCode()));
        result = ((result* 31)+((this.lastName == null)? 0 :this.lastName.hashCode()));
        result = ((result* 31)+((this.surnamePrefix == null)? 0 :this.surnamePrefix.hashCode()));
        result = ((result* 31)+((this.agencyInd == null)? 0 :this.agencyInd.hashCode()));
        result = ((result* 31)+((this.entityInd == null)? 0 :this.entityInd.hashCode()));
        result = ((result* 31)+((this.grantInd == null)? 0 :this.grantInd.hashCode()));
        result = ((result* 31)+((this.firstName == null)? 0 :this.firstName.hashCode()));
        result = ((result* 31)+((this.changeInd == null)? 0 :this.changeInd.hashCode()));
        result = ((result* 31)+((this.ntypCode == null)? 0 :this.ntypCode.hashCode()));
        result = ((result* 31)+((this.vendorInd == null)? 0 :this.vendorInd.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.mi == null)? 0 :this.mi.hashCode()));
        result = ((result* 31)+((this.piInd == null)? 0 :this.piInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EntityNameIdSearch100GetResponse) == false) {
            return false;
        }
        EntityNameIdSearch100GetResponse rhs = ((EntityNameIdSearch100GetResponse) other);
        return (((((((((((((((this.finMgrInd == rhs.finMgrInd)||((this.finMgrInd!= null)&&this.finMgrInd.equals(rhs.finMgrInd)))&&((this.lastName == rhs.lastName)||((this.lastName!= null)&&this.lastName.equals(rhs.lastName))))&&((this.surnamePrefix == rhs.surnamePrefix)||((this.surnamePrefix!= null)&&this.surnamePrefix.equals(rhs.surnamePrefix))))&&((this.agencyInd == rhs.agencyInd)||((this.agencyInd!= null)&&this.agencyInd.equals(rhs.agencyInd))))&&((this.entityInd == rhs.entityInd)||((this.entityInd!= null)&&this.entityInd.equals(rhs.entityInd))))&&((this.grantInd == rhs.grantInd)||((this.grantInd!= null)&&this.grantInd.equals(rhs.grantInd))))&&((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName))))&&((this.changeInd == rhs.changeInd)||((this.changeInd!= null)&&this.changeInd.equals(rhs.changeInd))))&&((this.ntypCode == rhs.ntypCode)||((this.ntypCode!= null)&&this.ntypCode.equals(rhs.ntypCode))))&&((this.vendorInd == rhs.vendorInd)||((this.vendorInd!= null)&&this.vendorInd.equals(rhs.vendorInd))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.mi == rhs.mi)||((this.mi!= null)&&this.mi.equals(rhs.mi))))&&((this.piInd == rhs.piInd)||((this.piInd!= null)&&this.piInd.equals(rhs.piInd))));
    }

}
