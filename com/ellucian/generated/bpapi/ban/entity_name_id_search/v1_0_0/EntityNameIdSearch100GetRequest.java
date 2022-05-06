
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
    "lastName",
    "spridenEntityInd",
    "surnamePrefix",
    "entityInd",
    "queryAgency",
    "queryAll",
    "queryVendor",
    "queryGrntPersonnel",
    "queryTermFinMgr",
    "firstName",
    "changeInd",
    "ntypCode",
    "spridenChangeInd",
    "queryPropPersonnel",
    "queryTermVendor",
    "id",
    "queryFinMgr",
    "mi"
})
@Generated("jsonschema2pojo")
public class EntityNameIdSearch100GetRequest {

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
     * Entity Indicator
     * <p>
     * Lineage reference object : SPRIDEN_ENTITY_IND
     * 
     */
    @JsonProperty("spridenEntityInd")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_ENTITY_IND")
    private String spridenEntityInd;
    /**
     * Last Name Prefix
     * <p>
     * Lineage reference object : SPRIDEN_SURNAME_PREFIX
     * 
     */
    @JsonProperty("surnamePrefix")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_SURNAME_PREFIX")
    private String surnamePrefix;
    @JsonProperty("entityInd")
    private String entityInd;
    /**
     * Lineage reference object : queryAgency
     * 
     */
    @JsonProperty("queryAgency")
    @JsonPropertyDescription("Lineage reference object : queryAgency")
    private Object queryAgency;
    /**
     * Lineage reference object : queryAll
     * 
     */
    @JsonProperty("queryAll")
    @JsonPropertyDescription("Lineage reference object : queryAll")
    private Object queryAll;
    /**
     * Lineage reference object : queryVendor
     * 
     */
    @JsonProperty("queryVendor")
    @JsonPropertyDescription("Lineage reference object : queryVendor")
    private Object queryVendor;
    /**
     * Lineage reference object : queryGrntPersonnel
     * 
     */
    @JsonProperty("queryGrntPersonnel")
    @JsonPropertyDescription("Lineage reference object : queryGrntPersonnel")
    private Object queryGrntPersonnel;
    /**
     * Lineage reference object : queryTermFinMgr
     * 
     */
    @JsonProperty("queryTermFinMgr")
    @JsonPropertyDescription("Lineage reference object : queryTermFinMgr")
    private Object queryTermFinMgr;
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
     * Change Indicator
     * <p>
     * Lineage reference object : SPRIDEN_CHANGE_IND
     * 
     */
    @JsonProperty("spridenChangeInd")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_CHANGE_IND")
    private String spridenChangeInd;
    /**
     * Lineage reference object : queryPropPersonnel
     * 
     */
    @JsonProperty("queryPropPersonnel")
    @JsonPropertyDescription("Lineage reference object : queryPropPersonnel")
    private Object queryPropPersonnel;
    /**
     * Lineage reference object : queryTermVendor
     * 
     */
    @JsonProperty("queryTermVendor")
    @JsonPropertyDescription("Lineage reference object : queryTermVendor")
    private Object queryTermVendor;
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
     * Lineage reference object : queryFinMgr
     * 
     */
    @JsonProperty("queryFinMgr")
    @JsonPropertyDescription("Lineage reference object : queryFinMgr")
    private Object queryFinMgr;
    /**
     * Middle Name
     * <p>
     * Lineage reference object : SPRIDEN_MI
     * 
     */
    @JsonProperty("mi")
    @JsonPropertyDescription("Lineage reference object : SPRIDEN_MI")
    private String mi;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public EntityNameIdSearch100GetRequest withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Entity Indicator
     * <p>
     * Lineage reference object : SPRIDEN_ENTITY_IND
     * 
     */
    @JsonProperty("spridenEntityInd")
    public String getSpridenEntityInd() {
        return spridenEntityInd;
    }

    /**
     * Entity Indicator
     * <p>
     * Lineage reference object : SPRIDEN_ENTITY_IND
     * 
     */
    @JsonProperty("spridenEntityInd")
    public void setSpridenEntityInd(String spridenEntityInd) {
        this.spridenEntityInd = spridenEntityInd;
    }

    public EntityNameIdSearch100GetRequest withSpridenEntityInd(String spridenEntityInd) {
        this.spridenEntityInd = spridenEntityInd;
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

    public EntityNameIdSearch100GetRequest withSurnamePrefix(String surnamePrefix) {
        this.surnamePrefix = surnamePrefix;
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

    public EntityNameIdSearch100GetRequest withEntityInd(String entityInd) {
        this.entityInd = entityInd;
        return this;
    }

    /**
     * Lineage reference object : queryAgency
     * 
     */
    @JsonProperty("queryAgency")
    public Object getQueryAgency() {
        return queryAgency;
    }

    /**
     * Lineage reference object : queryAgency
     * 
     */
    @JsonProperty("queryAgency")
    public void setQueryAgency(Object queryAgency) {
        this.queryAgency = queryAgency;
    }

    public EntityNameIdSearch100GetRequest withQueryAgency(Object queryAgency) {
        this.queryAgency = queryAgency;
        return this;
    }

    /**
     * Lineage reference object : queryAll
     * 
     */
    @JsonProperty("queryAll")
    public Object getQueryAll() {
        return queryAll;
    }

    /**
     * Lineage reference object : queryAll
     * 
     */
    @JsonProperty("queryAll")
    public void setQueryAll(Object queryAll) {
        this.queryAll = queryAll;
    }

    public EntityNameIdSearch100GetRequest withQueryAll(Object queryAll) {
        this.queryAll = queryAll;
        return this;
    }

    /**
     * Lineage reference object : queryVendor
     * 
     */
    @JsonProperty("queryVendor")
    public Object getQueryVendor() {
        return queryVendor;
    }

    /**
     * Lineage reference object : queryVendor
     * 
     */
    @JsonProperty("queryVendor")
    public void setQueryVendor(Object queryVendor) {
        this.queryVendor = queryVendor;
    }

    public EntityNameIdSearch100GetRequest withQueryVendor(Object queryVendor) {
        this.queryVendor = queryVendor;
        return this;
    }

    /**
     * Lineage reference object : queryGrntPersonnel
     * 
     */
    @JsonProperty("queryGrntPersonnel")
    public Object getQueryGrntPersonnel() {
        return queryGrntPersonnel;
    }

    /**
     * Lineage reference object : queryGrntPersonnel
     * 
     */
    @JsonProperty("queryGrntPersonnel")
    public void setQueryGrntPersonnel(Object queryGrntPersonnel) {
        this.queryGrntPersonnel = queryGrntPersonnel;
    }

    public EntityNameIdSearch100GetRequest withQueryGrntPersonnel(Object queryGrntPersonnel) {
        this.queryGrntPersonnel = queryGrntPersonnel;
        return this;
    }

    /**
     * Lineage reference object : queryTermFinMgr
     * 
     */
    @JsonProperty("queryTermFinMgr")
    public Object getQueryTermFinMgr() {
        return queryTermFinMgr;
    }

    /**
     * Lineage reference object : queryTermFinMgr
     * 
     */
    @JsonProperty("queryTermFinMgr")
    public void setQueryTermFinMgr(Object queryTermFinMgr) {
        this.queryTermFinMgr = queryTermFinMgr;
    }

    public EntityNameIdSearch100GetRequest withQueryTermFinMgr(Object queryTermFinMgr) {
        this.queryTermFinMgr = queryTermFinMgr;
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

    public EntityNameIdSearch100GetRequest withFirstName(String firstName) {
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

    public EntityNameIdSearch100GetRequest withChangeInd(String changeInd) {
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

    public EntityNameIdSearch100GetRequest withNtypCode(String ntypCode) {
        this.ntypCode = ntypCode;
        return this;
    }

    /**
     * Change Indicator
     * <p>
     * Lineage reference object : SPRIDEN_CHANGE_IND
     * 
     */
    @JsonProperty("spridenChangeInd")
    public String getSpridenChangeInd() {
        return spridenChangeInd;
    }

    /**
     * Change Indicator
     * <p>
     * Lineage reference object : SPRIDEN_CHANGE_IND
     * 
     */
    @JsonProperty("spridenChangeInd")
    public void setSpridenChangeInd(String spridenChangeInd) {
        this.spridenChangeInd = spridenChangeInd;
    }

    public EntityNameIdSearch100GetRequest withSpridenChangeInd(String spridenChangeInd) {
        this.spridenChangeInd = spridenChangeInd;
        return this;
    }

    /**
     * Lineage reference object : queryPropPersonnel
     * 
     */
    @JsonProperty("queryPropPersonnel")
    public Object getQueryPropPersonnel() {
        return queryPropPersonnel;
    }

    /**
     * Lineage reference object : queryPropPersonnel
     * 
     */
    @JsonProperty("queryPropPersonnel")
    public void setQueryPropPersonnel(Object queryPropPersonnel) {
        this.queryPropPersonnel = queryPropPersonnel;
    }

    public EntityNameIdSearch100GetRequest withQueryPropPersonnel(Object queryPropPersonnel) {
        this.queryPropPersonnel = queryPropPersonnel;
        return this;
    }

    /**
     * Lineage reference object : queryTermVendor
     * 
     */
    @JsonProperty("queryTermVendor")
    public Object getQueryTermVendor() {
        return queryTermVendor;
    }

    /**
     * Lineage reference object : queryTermVendor
     * 
     */
    @JsonProperty("queryTermVendor")
    public void setQueryTermVendor(Object queryTermVendor) {
        this.queryTermVendor = queryTermVendor;
    }

    public EntityNameIdSearch100GetRequest withQueryTermVendor(Object queryTermVendor) {
        this.queryTermVendor = queryTermVendor;
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

    public EntityNameIdSearch100GetRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Lineage reference object : queryFinMgr
     * 
     */
    @JsonProperty("queryFinMgr")
    public Object getQueryFinMgr() {
        return queryFinMgr;
    }

    /**
     * Lineage reference object : queryFinMgr
     * 
     */
    @JsonProperty("queryFinMgr")
    public void setQueryFinMgr(Object queryFinMgr) {
        this.queryFinMgr = queryFinMgr;
    }

    public EntityNameIdSearch100GetRequest withQueryFinMgr(Object queryFinMgr) {
        this.queryFinMgr = queryFinMgr;
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

    public EntityNameIdSearch100GetRequest withMi(String mi) {
        this.mi = mi;
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

    public EntityNameIdSearch100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EntityNameIdSearch100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("spridenEntityInd");
        sb.append('=');
        sb.append(((this.spridenEntityInd == null)?"<null>":this.spridenEntityInd));
        sb.append(',');
        sb.append("surnamePrefix");
        sb.append('=');
        sb.append(((this.surnamePrefix == null)?"<null>":this.surnamePrefix));
        sb.append(',');
        sb.append("entityInd");
        sb.append('=');
        sb.append(((this.entityInd == null)?"<null>":this.entityInd));
        sb.append(',');
        sb.append("queryAgency");
        sb.append('=');
        sb.append(((this.queryAgency == null)?"<null>":this.queryAgency));
        sb.append(',');
        sb.append("queryAll");
        sb.append('=');
        sb.append(((this.queryAll == null)?"<null>":this.queryAll));
        sb.append(',');
        sb.append("queryVendor");
        sb.append('=');
        sb.append(((this.queryVendor == null)?"<null>":this.queryVendor));
        sb.append(',');
        sb.append("queryGrntPersonnel");
        sb.append('=');
        sb.append(((this.queryGrntPersonnel == null)?"<null>":this.queryGrntPersonnel));
        sb.append(',');
        sb.append("queryTermFinMgr");
        sb.append('=');
        sb.append(((this.queryTermFinMgr == null)?"<null>":this.queryTermFinMgr));
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
        sb.append("spridenChangeInd");
        sb.append('=');
        sb.append(((this.spridenChangeInd == null)?"<null>":this.spridenChangeInd));
        sb.append(',');
        sb.append("queryPropPersonnel");
        sb.append('=');
        sb.append(((this.queryPropPersonnel == null)?"<null>":this.queryPropPersonnel));
        sb.append(',');
        sb.append("queryTermVendor");
        sb.append('=');
        sb.append(((this.queryTermVendor == null)?"<null>":this.queryTermVendor));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("queryFinMgr");
        sb.append('=');
        sb.append(((this.queryFinMgr == null)?"<null>":this.queryFinMgr));
        sb.append(',');
        sb.append("mi");
        sb.append('=');
        sb.append(((this.mi == null)?"<null>":this.mi));
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
        if ((other instanceof EntityNameIdSearch100GetRequest) == false) {
            return false;
        }
        EntityNameIdSearch100GetRequest rhs = ((EntityNameIdSearch100GetRequest) other);
        return ((((((((((((((((((((this.lastName == rhs.lastName)||((this.lastName!= null)&&this.lastName.equals(rhs.lastName)))&&((this.spridenEntityInd == rhs.spridenEntityInd)||((this.spridenEntityInd!= null)&&this.spridenEntityInd.equals(rhs.spridenEntityInd))))&&((this.surnamePrefix == rhs.surnamePrefix)||((this.surnamePrefix!= null)&&this.surnamePrefix.equals(rhs.surnamePrefix))))&&((this.entityInd == rhs.entityInd)||((this.entityInd!= null)&&this.entityInd.equals(rhs.entityInd))))&&((this.queryAgency == rhs.queryAgency)||((this.queryAgency!= null)&&this.queryAgency.equals(rhs.queryAgency))))&&((this.queryAll == rhs.queryAll)||((this.queryAll!= null)&&this.queryAll.equals(rhs.queryAll))))&&((this.queryVendor == rhs.queryVendor)||((this.queryVendor!= null)&&this.queryVendor.equals(rhs.queryVendor))))&&((this.queryGrntPersonnel == rhs.queryGrntPersonnel)||((this.queryGrntPersonnel!= null)&&this.queryGrntPersonnel.equals(rhs.queryGrntPersonnel))))&&((this.queryTermFinMgr == rhs.queryTermFinMgr)||((this.queryTermFinMgr!= null)&&this.queryTermFinMgr.equals(rhs.queryTermFinMgr))))&&((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName))))&&((this.changeInd == rhs.changeInd)||((this.changeInd!= null)&&this.changeInd.equals(rhs.changeInd))))&&((this.ntypCode == rhs.ntypCode)||((this.ntypCode!= null)&&this.ntypCode.equals(rhs.ntypCode))))&&((this.spridenChangeInd == rhs.spridenChangeInd)||((this.spridenChangeInd!= null)&&this.spridenChangeInd.equals(rhs.spridenChangeInd))))&&((this.queryPropPersonnel == rhs.queryPropPersonnel)||((this.queryPropPersonnel!= null)&&this.queryPropPersonnel.equals(rhs.queryPropPersonnel))))&&((this.queryTermVendor == rhs.queryTermVendor)||((this.queryTermVendor!= null)&&this.queryTermVendor.equals(rhs.queryTermVendor))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.queryFinMgr == rhs.queryFinMgr)||((this.queryFinMgr!= null)&&this.queryFinMgr.equals(rhs.queryFinMgr))))&&((this.mi == rhs.mi)||((this.mi!= null)&&this.mi.equals(rhs.mi))));
    }

}
