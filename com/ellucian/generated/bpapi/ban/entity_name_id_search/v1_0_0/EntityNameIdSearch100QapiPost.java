
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
    "queryVendor",
    "queryTermVendor",
    "queryGrntPersonnel",
    "queryPropPersonnel",
    "queryFinMgr",
    "queryTermFinMgr",
    "queryAgency",
    "queryAll",
    "id",
    "surnamePrefix",
    "lastName",
    "firstName",
    "mi",
    "spridenEntityInd",
    "spridenChangeInd",
    "entityInd",
    "changeInd",
    "ntypCode"
})
@Generated("jsonschema2pojo")
public class EntityNameIdSearch100QapiPost {

    @JsonProperty("queryVendor")
    private String queryVendor;
    @JsonProperty("queryTermVendor")
    private String queryTermVendor;
    @JsonProperty("queryGrntPersonnel")
    private String queryGrntPersonnel;
    @JsonProperty("queryPropPersonnel")
    private String queryPropPersonnel;
    @JsonProperty("queryFinMgr")
    private String queryFinMgr;
    @JsonProperty("queryTermFinMgr")
    private String queryTermFinMgr;
    @JsonProperty("queryAgency")
    private String queryAgency;
    @JsonProperty("queryAll")
    private String queryAll;
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
     * Last Name Prefix
     * <p>
     * Lineage reference object : SPRIDEN_SURNAME_PREFIX
     * 
     */
    @JsonProperty("surnamePrefix")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_SURNAME_PREFIX")
    private String surnamePrefix;
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
     * First Name
     * <p>
     * Lineage reference object : SPRIDEN_FIRST_NAME
     * 
     */
    @JsonProperty("firstName")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_FIRST_NAME")
    private String firstName;
    /**
     * Middle Name
     * <p>
     * Lineage reference object : SPRIDEN_MI
     * 
     */
    @JsonProperty("mi")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_MI")
    private String mi;
    @JsonProperty("spridenEntityInd")
    private String spridenEntityInd;
    @JsonProperty("spridenChangeInd")
    private String spridenChangeInd;
    @JsonProperty("entityInd")
    private String entityInd;
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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("queryVendor")
    public String getQueryVendor() {
        return queryVendor;
    }

    @JsonProperty("queryVendor")
    public void setQueryVendor(String queryVendor) {
        this.queryVendor = queryVendor;
    }

    public EntityNameIdSearch100QapiPost withQueryVendor(String queryVendor) {
        this.queryVendor = queryVendor;
        return this;
    }

    @JsonProperty("queryTermVendor")
    public String getQueryTermVendor() {
        return queryTermVendor;
    }

    @JsonProperty("queryTermVendor")
    public void setQueryTermVendor(String queryTermVendor) {
        this.queryTermVendor = queryTermVendor;
    }

    public EntityNameIdSearch100QapiPost withQueryTermVendor(String queryTermVendor) {
        this.queryTermVendor = queryTermVendor;
        return this;
    }

    @JsonProperty("queryGrntPersonnel")
    public String getQueryGrntPersonnel() {
        return queryGrntPersonnel;
    }

    @JsonProperty("queryGrntPersonnel")
    public void setQueryGrntPersonnel(String queryGrntPersonnel) {
        this.queryGrntPersonnel = queryGrntPersonnel;
    }

    public EntityNameIdSearch100QapiPost withQueryGrntPersonnel(String queryGrntPersonnel) {
        this.queryGrntPersonnel = queryGrntPersonnel;
        return this;
    }

    @JsonProperty("queryPropPersonnel")
    public String getQueryPropPersonnel() {
        return queryPropPersonnel;
    }

    @JsonProperty("queryPropPersonnel")
    public void setQueryPropPersonnel(String queryPropPersonnel) {
        this.queryPropPersonnel = queryPropPersonnel;
    }

    public EntityNameIdSearch100QapiPost withQueryPropPersonnel(String queryPropPersonnel) {
        this.queryPropPersonnel = queryPropPersonnel;
        return this;
    }

    @JsonProperty("queryFinMgr")
    public String getQueryFinMgr() {
        return queryFinMgr;
    }

    @JsonProperty("queryFinMgr")
    public void setQueryFinMgr(String queryFinMgr) {
        this.queryFinMgr = queryFinMgr;
    }

    public EntityNameIdSearch100QapiPost withQueryFinMgr(String queryFinMgr) {
        this.queryFinMgr = queryFinMgr;
        return this;
    }

    @JsonProperty("queryTermFinMgr")
    public String getQueryTermFinMgr() {
        return queryTermFinMgr;
    }

    @JsonProperty("queryTermFinMgr")
    public void setQueryTermFinMgr(String queryTermFinMgr) {
        this.queryTermFinMgr = queryTermFinMgr;
    }

    public EntityNameIdSearch100QapiPost withQueryTermFinMgr(String queryTermFinMgr) {
        this.queryTermFinMgr = queryTermFinMgr;
        return this;
    }

    @JsonProperty("queryAgency")
    public String getQueryAgency() {
        return queryAgency;
    }

    @JsonProperty("queryAgency")
    public void setQueryAgency(String queryAgency) {
        this.queryAgency = queryAgency;
    }

    public EntityNameIdSearch100QapiPost withQueryAgency(String queryAgency) {
        this.queryAgency = queryAgency;
        return this;
    }

    @JsonProperty("queryAll")
    public String getQueryAll() {
        return queryAll;
    }

    @JsonProperty("queryAll")
    public void setQueryAll(String queryAll) {
        this.queryAll = queryAll;
    }

    public EntityNameIdSearch100QapiPost withQueryAll(String queryAll) {
        this.queryAll = queryAll;
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

    public EntityNameIdSearch100QapiPost withId(String id) {
        this.id = id;
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

    public EntityNameIdSearch100QapiPost withSurnamePrefix(String surnamePrefix) {
        this.surnamePrefix = surnamePrefix;
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

    public EntityNameIdSearch100QapiPost withLastName(String lastName) {
        this.lastName = lastName;
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

    public EntityNameIdSearch100QapiPost withFirstName(String firstName) {
        this.firstName = firstName;
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

    public EntityNameIdSearch100QapiPost withMi(String mi) {
        this.mi = mi;
        return this;
    }

    @JsonProperty("spridenEntityInd")
    public String getSpridenEntityInd() {
        return spridenEntityInd;
    }

    @JsonProperty("spridenEntityInd")
    public void setSpridenEntityInd(String spridenEntityInd) {
        this.spridenEntityInd = spridenEntityInd;
    }

    public EntityNameIdSearch100QapiPost withSpridenEntityInd(String spridenEntityInd) {
        this.spridenEntityInd = spridenEntityInd;
        return this;
    }

    @JsonProperty("spridenChangeInd")
    public String getSpridenChangeInd() {
        return spridenChangeInd;
    }

    @JsonProperty("spridenChangeInd")
    public void setSpridenChangeInd(String spridenChangeInd) {
        this.spridenChangeInd = spridenChangeInd;
    }

    public EntityNameIdSearch100QapiPost withSpridenChangeInd(String spridenChangeInd) {
        this.spridenChangeInd = spridenChangeInd;
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

    public EntityNameIdSearch100QapiPost withEntityInd(String entityInd) {
        this.entityInd = entityInd;
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

    public EntityNameIdSearch100QapiPost withChangeInd(String changeInd) {
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

    public EntityNameIdSearch100QapiPost withNtypCode(String ntypCode) {
        this.ntypCode = ntypCode;
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

    public EntityNameIdSearch100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EntityNameIdSearch100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("queryVendor");
        sb.append('=');
        sb.append(((this.queryVendor == null)?"<null>":this.queryVendor));
        sb.append(',');
        sb.append("queryTermVendor");
        sb.append('=');
        sb.append(((this.queryTermVendor == null)?"<null>":this.queryTermVendor));
        sb.append(',');
        sb.append("queryGrntPersonnel");
        sb.append('=');
        sb.append(((this.queryGrntPersonnel == null)?"<null>":this.queryGrntPersonnel));
        sb.append(',');
        sb.append("queryPropPersonnel");
        sb.append('=');
        sb.append(((this.queryPropPersonnel == null)?"<null>":this.queryPropPersonnel));
        sb.append(',');
        sb.append("queryFinMgr");
        sb.append('=');
        sb.append(((this.queryFinMgr == null)?"<null>":this.queryFinMgr));
        sb.append(',');
        sb.append("queryTermFinMgr");
        sb.append('=');
        sb.append(((this.queryTermFinMgr == null)?"<null>":this.queryTermFinMgr));
        sb.append(',');
        sb.append("queryAgency");
        sb.append('=');
        sb.append(((this.queryAgency == null)?"<null>":this.queryAgency));
        sb.append(',');
        sb.append("queryAll");
        sb.append('=');
        sb.append(((this.queryAll == null)?"<null>":this.queryAll));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("surnamePrefix");
        sb.append('=');
        sb.append(((this.surnamePrefix == null)?"<null>":this.surnamePrefix));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("mi");
        sb.append('=');
        sb.append(((this.mi == null)?"<null>":this.mi));
        sb.append(',');
        sb.append("spridenEntityInd");
        sb.append('=');
        sb.append(((this.spridenEntityInd == null)?"<null>":this.spridenEntityInd));
        sb.append(',');
        sb.append("spridenChangeInd");
        sb.append('=');
        sb.append(((this.spridenChangeInd == null)?"<null>":this.spridenChangeInd));
        sb.append(',');
        sb.append("entityInd");
        sb.append('=');
        sb.append(((this.entityInd == null)?"<null>":this.entityInd));
        sb.append(',');
        sb.append("changeInd");
        sb.append('=');
        sb.append(((this.changeInd == null)?"<null>":this.changeInd));
        sb.append(',');
        sb.append("ntypCode");
        sb.append('=');
        sb.append(((this.ntypCode == null)?"<null>":this.ntypCode));
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
        result = ((result* 31)+((this.lastName == null)? 0 :this.lastName.hashCode()));
        result = ((result* 31)+((this.spridenEntityInd == null)? 0 :this.spridenEntityInd.hashCode()));
        result = ((result* 31)+((this.surnamePrefix == null)? 0 :this.surnamePrefix.hashCode()));
        result = ((result* 31)+((this.entityInd == null)? 0 :this.entityInd.hashCode()));
        result = ((result* 31)+((this.queryAgency == null)? 0 :this.queryAgency.hashCode()));
        result = ((result* 31)+((this.queryAll == null)? 0 :this.queryAll.hashCode()));
        result = ((result* 31)+((this.queryVendor == null)? 0 :this.queryVendor.hashCode()));
        result = ((result* 31)+((this.queryGrntPersonnel == null)? 0 :this.queryGrntPersonnel.hashCode()));
        result = ((result* 31)+((this.queryTermFinMgr == null)? 0 :this.queryTermFinMgr.hashCode()));
        result = ((result* 31)+((this.firstName == null)? 0 :this.firstName.hashCode()));
        result = ((result* 31)+((this.changeInd == null)? 0 :this.changeInd.hashCode()));
        result = ((result* 31)+((this.ntypCode == null)? 0 :this.ntypCode.hashCode()));
        result = ((result* 31)+((this.spridenChangeInd == null)? 0 :this.spridenChangeInd.hashCode()));
        result = ((result* 31)+((this.queryPropPersonnel == null)? 0 :this.queryPropPersonnel.hashCode()));
        result = ((result* 31)+((this.queryTermVendor == null)? 0 :this.queryTermVendor.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.queryFinMgr == null)? 0 :this.queryFinMgr.hashCode()));
        result = ((result* 31)+((this.mi == null)? 0 :this.mi.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EntityNameIdSearch100QapiPost) == false) {
            return false;
        }
        EntityNameIdSearch100QapiPost rhs = ((EntityNameIdSearch100QapiPost) other);
        return ((((((((((((((((((((this.lastName == rhs.lastName)||((this.lastName!= null)&&this.lastName.equals(rhs.lastName)))&&((this.spridenEntityInd == rhs.spridenEntityInd)||((this.spridenEntityInd!= null)&&this.spridenEntityInd.equals(rhs.spridenEntityInd))))&&((this.surnamePrefix == rhs.surnamePrefix)||((this.surnamePrefix!= null)&&this.surnamePrefix.equals(rhs.surnamePrefix))))&&((this.entityInd == rhs.entityInd)||((this.entityInd!= null)&&this.entityInd.equals(rhs.entityInd))))&&((this.queryAgency == rhs.queryAgency)||((this.queryAgency!= null)&&this.queryAgency.equals(rhs.queryAgency))))&&((this.queryAll == rhs.queryAll)||((this.queryAll!= null)&&this.queryAll.equals(rhs.queryAll))))&&((this.queryVendor == rhs.queryVendor)||((this.queryVendor!= null)&&this.queryVendor.equals(rhs.queryVendor))))&&((this.queryGrntPersonnel == rhs.queryGrntPersonnel)||((this.queryGrntPersonnel!= null)&&this.queryGrntPersonnel.equals(rhs.queryGrntPersonnel))))&&((this.queryTermFinMgr == rhs.queryTermFinMgr)||((this.queryTermFinMgr!= null)&&this.queryTermFinMgr.equals(rhs.queryTermFinMgr))))&&((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName))))&&((this.changeInd == rhs.changeInd)||((this.changeInd!= null)&&this.changeInd.equals(rhs.changeInd))))&&((this.ntypCode == rhs.ntypCode)||((this.ntypCode!= null)&&this.ntypCode.equals(rhs.ntypCode))))&&((this.spridenChangeInd == rhs.spridenChangeInd)||((this.spridenChangeInd!= null)&&this.spridenChangeInd.equals(rhs.spridenChangeInd))))&&((this.queryPropPersonnel == rhs.queryPropPersonnel)||((this.queryPropPersonnel!= null)&&this.queryPropPersonnel.equals(rhs.queryPropPersonnel))))&&((this.queryTermVendor == rhs.queryTermVendor)||((this.queryTermVendor!= null)&&this.queryTermVendor.equals(rhs.queryTermVendor))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.queryFinMgr == rhs.queryFinMgr)||((this.queryFinMgr!= null)&&this.queryFinMgr.equals(rhs.queryFinMgr))))&&((this.mi == rhs.mi)||((this.mi!= null)&&this.mi.equals(rhs.mi))));
    }

}
