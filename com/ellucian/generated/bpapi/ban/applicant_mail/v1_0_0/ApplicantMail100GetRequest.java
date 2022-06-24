
package com.ellucian.generated.bpapi.ban.applicant_mail.v1_0_0;

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
    "moduleCode",
    "aidyCode",
    "initCode",
    "datePrinted",
    "dateInit",
    "letrCode",
    "description",
    "origInd",
    "keyblckAidyCode",
    "waitDays",
    "id",
    "systemInd",
    "user"
})
@Generated("jsonschema2pojo")
public class ApplicantMail100GetRequest {

    /**
     * Module
     * <p>
     * Lineage reference object : GURMAIL_MODULE_CODE
     * 
     */
    @JsonProperty("moduleCode")
    @JsonPropertyDescription("Lineage reference object : GURMAIL_MODULE_CODE")
    private String moduleCode;
    /**
     * Aid Year
     * <p>
     * Lineage reference object : GURMAIL_AIDY_CODE, Lookup lineage reference object : robinst
     * (Required)
     * 
     */
    @JsonProperty("aidyCode")
    @JsonPropertyDescription("Lineage reference object : GURMAIL_AIDY_CODE, Lookup lineage reference object : robinst")
    private String aidyCode;
    /**
     * Initials
     * <p>
     * Lineage reference object : GURMAIL_INIT_CODE, Lookup lineage reference object : stvinit
     * 
     */
    @JsonProperty("initCode")
    @JsonPropertyDescription("Lineage reference object : GURMAIL_INIT_CODE, Lookup lineage reference object : stvinit")
    private String initCode;
    /**
     * Print Date
     * <p>
     * Lineage reference object : GURMAIL_DATE_PRINTED
     * 
     */
    @JsonProperty("datePrinted")
    @JsonPropertyDescription("Lineage reference object : GURMAIL_DATE_PRINTED")
    private Date datePrinted;
    /**
     * Initiated
     * <p>
     * Lineage reference object : GURMAIL_DATE_INIT
     * 
     */
    @JsonProperty("dateInit")
    @JsonPropertyDescription("Lineage reference object : GURMAIL_DATE_INIT")
    private Date dateInit;
    /**
     * Letter
     * <p>
     * Lineage reference object : GURMAIL_LETR_CODE, Lookup lineage reference object : gtvletr
     * (Required)
     * 
     */
    @JsonProperty("letrCode")
    @JsonPropertyDescription("Lineage reference object : GURMAIL_LETR_CODE, Lookup lineage reference object : gtvletr")
    private String letrCode;
    @JsonProperty("description")
    private String description;
    /**
     * Originator
     * <p>
     * Lineage reference object : GURMAIL_ORIG_IND
     * 
     */
    @JsonProperty("origInd")
    @JsonPropertyDescription("Lineage reference object : GURMAIL_ORIG_IND")
    private String origInd;
    /**
     * Aid Year
     * <p>
     * Lineage reference object : keyblckAidyCode, Lookup lineage reference object : robinst
     * 
     */
    @JsonProperty("keyblckAidyCode")
    @JsonPropertyDescription("Lineage reference object : keyblckAidyCode, Lookup lineage reference object : robinst")
    private String keyblckAidyCode;
    /**
     * Wait
     * <p>
     * Lineage reference object : GURMAIL_WAIT_DAYS
     * 
     */
    @JsonProperty("waitDays")
    @JsonPropertyDescription("Lineage reference object : GURMAIL_WAIT_DAYS")
    private Double waitDays;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private String id;
    /**
     * System
     * <p>
     * Lineage reference object : GURMAIL_SYSTEM_IND
     * (Required)
     * 
     */
    @JsonProperty("systemInd")
    @JsonPropertyDescription("Lineage reference object : GURMAIL_SYSTEM_IND")
    private String systemInd;
    /**
     * User ID
     * <p>
     * Lineage reference object : GURMAIL_USER
     * 
     */
    @JsonProperty("user")
    @JsonPropertyDescription("Lineage reference object : GURMAIL_USER")
    private String user;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Module
     * <p>
     * Lineage reference object : GURMAIL_MODULE_CODE
     * 
     */
    @JsonProperty("moduleCode")
    public String getModuleCode() {
        return moduleCode;
    }

    /**
     * Module
     * <p>
     * Lineage reference object : GURMAIL_MODULE_CODE
     * 
     */
    @JsonProperty("moduleCode")
    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    public ApplicantMail100GetRequest withModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
        return this;
    }

    /**
     * Aid Year
     * <p>
     * Lineage reference object : GURMAIL_AIDY_CODE, Lookup lineage reference object : robinst
     * (Required)
     * 
     */
    @JsonProperty("aidyCode")
    public String getAidyCode() {
        return aidyCode;
    }

    /**
     * Aid Year
     * <p>
     * Lineage reference object : GURMAIL_AIDY_CODE, Lookup lineage reference object : robinst
     * (Required)
     * 
     */
    @JsonProperty("aidyCode")
    public void setAidyCode(String aidyCode) {
        this.aidyCode = aidyCode;
    }

    public ApplicantMail100GetRequest withAidyCode(String aidyCode) {
        this.aidyCode = aidyCode;
        return this;
    }

    /**
     * Initials
     * <p>
     * Lineage reference object : GURMAIL_INIT_CODE, Lookup lineage reference object : stvinit
     * 
     */
    @JsonProperty("initCode")
    public String getInitCode() {
        return initCode;
    }

    /**
     * Initials
     * <p>
     * Lineage reference object : GURMAIL_INIT_CODE, Lookup lineage reference object : stvinit
     * 
     */
    @JsonProperty("initCode")
    public void setInitCode(String initCode) {
        this.initCode = initCode;
    }

    public ApplicantMail100GetRequest withInitCode(String initCode) {
        this.initCode = initCode;
        return this;
    }

    /**
     * Print Date
     * <p>
     * Lineage reference object : GURMAIL_DATE_PRINTED
     * 
     */
    @JsonProperty("datePrinted")
    public Date getDatePrinted() {
        return datePrinted;
    }

    /**
     * Print Date
     * <p>
     * Lineage reference object : GURMAIL_DATE_PRINTED
     * 
     */
    @JsonProperty("datePrinted")
    public void setDatePrinted(Date datePrinted) {
        this.datePrinted = datePrinted;
    }

    public ApplicantMail100GetRequest withDatePrinted(Date datePrinted) {
        this.datePrinted = datePrinted;
        return this;
    }

    /**
     * Initiated
     * <p>
     * Lineage reference object : GURMAIL_DATE_INIT
     * 
     */
    @JsonProperty("dateInit")
    public Date getDateInit() {
        return dateInit;
    }

    /**
     * Initiated
     * <p>
     * Lineage reference object : GURMAIL_DATE_INIT
     * 
     */
    @JsonProperty("dateInit")
    public void setDateInit(Date dateInit) {
        this.dateInit = dateInit;
    }

    public ApplicantMail100GetRequest withDateInit(Date dateInit) {
        this.dateInit = dateInit;
        return this;
    }

    /**
     * Letter
     * <p>
     * Lineage reference object : GURMAIL_LETR_CODE, Lookup lineage reference object : gtvletr
     * (Required)
     * 
     */
    @JsonProperty("letrCode")
    public String getLetrCode() {
        return letrCode;
    }

    /**
     * Letter
     * <p>
     * Lineage reference object : GURMAIL_LETR_CODE, Lookup lineage reference object : gtvletr
     * (Required)
     * 
     */
    @JsonProperty("letrCode")
    public void setLetrCode(String letrCode) {
        this.letrCode = letrCode;
    }

    public ApplicantMail100GetRequest withLetrCode(String letrCode) {
        this.letrCode = letrCode;
        return this;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public ApplicantMail100GetRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Originator
     * <p>
     * Lineage reference object : GURMAIL_ORIG_IND
     * 
     */
    @JsonProperty("origInd")
    public String getOrigInd() {
        return origInd;
    }

    /**
     * Originator
     * <p>
     * Lineage reference object : GURMAIL_ORIG_IND
     * 
     */
    @JsonProperty("origInd")
    public void setOrigInd(String origInd) {
        this.origInd = origInd;
    }

    public ApplicantMail100GetRequest withOrigInd(String origInd) {
        this.origInd = origInd;
        return this;
    }

    /**
     * Aid Year
     * <p>
     * Lineage reference object : keyblckAidyCode, Lookup lineage reference object : robinst
     * 
     */
    @JsonProperty("keyblckAidyCode")
    public String getKeyblckAidyCode() {
        return keyblckAidyCode;
    }

    /**
     * Aid Year
     * <p>
     * Lineage reference object : keyblckAidyCode, Lookup lineage reference object : robinst
     * 
     */
    @JsonProperty("keyblckAidyCode")
    public void setKeyblckAidyCode(String keyblckAidyCode) {
        this.keyblckAidyCode = keyblckAidyCode;
    }

    public ApplicantMail100GetRequest withKeyblckAidyCode(String keyblckAidyCode) {
        this.keyblckAidyCode = keyblckAidyCode;
        return this;
    }

    /**
     * Wait
     * <p>
     * Lineage reference object : GURMAIL_WAIT_DAYS
     * 
     */
    @JsonProperty("waitDays")
    public Double getWaitDays() {
        return waitDays;
    }

    /**
     * Wait
     * <p>
     * Lineage reference object : GURMAIL_WAIT_DAYS
     * 
     */
    @JsonProperty("waitDays")
    public void setWaitDays(Double waitDays) {
        this.waitDays = waitDays;
    }

    public ApplicantMail100GetRequest withWaitDays(Double waitDays) {
        this.waitDays = waitDays;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ApplicantMail100GetRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * System
     * <p>
     * Lineage reference object : GURMAIL_SYSTEM_IND
     * (Required)
     * 
     */
    @JsonProperty("systemInd")
    public String getSystemInd() {
        return systemInd;
    }

    /**
     * System
     * <p>
     * Lineage reference object : GURMAIL_SYSTEM_IND
     * (Required)
     * 
     */
    @JsonProperty("systemInd")
    public void setSystemInd(String systemInd) {
        this.systemInd = systemInd;
    }

    public ApplicantMail100GetRequest withSystemInd(String systemInd) {
        this.systemInd = systemInd;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : GURMAIL_USER
     * 
     */
    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : GURMAIL_USER
     * 
     */
    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    public ApplicantMail100GetRequest withUser(String user) {
        this.user = user;
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

    public ApplicantMail100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApplicantMail100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("moduleCode");
        sb.append('=');
        sb.append(((this.moduleCode == null)?"<null>":this.moduleCode));
        sb.append(',');
        sb.append("aidyCode");
        sb.append('=');
        sb.append(((this.aidyCode == null)?"<null>":this.aidyCode));
        sb.append(',');
        sb.append("initCode");
        sb.append('=');
        sb.append(((this.initCode == null)?"<null>":this.initCode));
        sb.append(',');
        sb.append("datePrinted");
        sb.append('=');
        sb.append(((this.datePrinted == null)?"<null>":this.datePrinted));
        sb.append(',');
        sb.append("dateInit");
        sb.append('=');
        sb.append(((this.dateInit == null)?"<null>":this.dateInit));
        sb.append(',');
        sb.append("letrCode");
        sb.append('=');
        sb.append(((this.letrCode == null)?"<null>":this.letrCode));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("origInd");
        sb.append('=');
        sb.append(((this.origInd == null)?"<null>":this.origInd));
        sb.append(',');
        sb.append("keyblckAidyCode");
        sb.append('=');
        sb.append(((this.keyblckAidyCode == null)?"<null>":this.keyblckAidyCode));
        sb.append(',');
        sb.append("waitDays");
        sb.append('=');
        sb.append(((this.waitDays == null)?"<null>":this.waitDays));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("systemInd");
        sb.append('=');
        sb.append(((this.systemInd == null)?"<null>":this.systemInd));
        sb.append(',');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
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
        result = ((result* 31)+((this.moduleCode == null)? 0 :this.moduleCode.hashCode()));
        result = ((result* 31)+((this.aidyCode == null)? 0 :this.aidyCode.hashCode()));
        result = ((result* 31)+((this.initCode == null)? 0 :this.initCode.hashCode()));
        result = ((result* 31)+((this.datePrinted == null)? 0 :this.datePrinted.hashCode()));
        result = ((result* 31)+((this.dateInit == null)? 0 :this.dateInit.hashCode()));
        result = ((result* 31)+((this.letrCode == null)? 0 :this.letrCode.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.origInd == null)? 0 :this.origInd.hashCode()));
        result = ((result* 31)+((this.keyblckAidyCode == null)? 0 :this.keyblckAidyCode.hashCode()));
        result = ((result* 31)+((this.waitDays == null)? 0 :this.waitDays.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.systemInd == null)? 0 :this.systemInd.hashCode()));
        result = ((result* 31)+((this.user == null)? 0 :this.user.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicantMail100GetRequest) == false) {
            return false;
        }
        ApplicantMail100GetRequest rhs = ((ApplicantMail100GetRequest) other);
        return (((((((((((((((this.moduleCode == rhs.moduleCode)||((this.moduleCode!= null)&&this.moduleCode.equals(rhs.moduleCode)))&&((this.aidyCode == rhs.aidyCode)||((this.aidyCode!= null)&&this.aidyCode.equals(rhs.aidyCode))))&&((this.initCode == rhs.initCode)||((this.initCode!= null)&&this.initCode.equals(rhs.initCode))))&&((this.datePrinted == rhs.datePrinted)||((this.datePrinted!= null)&&this.datePrinted.equals(rhs.datePrinted))))&&((this.dateInit == rhs.dateInit)||((this.dateInit!= null)&&this.dateInit.equals(rhs.dateInit))))&&((this.letrCode == rhs.letrCode)||((this.letrCode!= null)&&this.letrCode.equals(rhs.letrCode))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.origInd == rhs.origInd)||((this.origInd!= null)&&this.origInd.equals(rhs.origInd))))&&((this.keyblckAidyCode == rhs.keyblckAidyCode)||((this.keyblckAidyCode!= null)&&this.keyblckAidyCode.equals(rhs.keyblckAidyCode))))&&((this.waitDays == rhs.waitDays)||((this.waitDays!= null)&&this.waitDays.equals(rhs.waitDays))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.systemInd == rhs.systemInd)||((this.systemInd!= null)&&this.systemInd.equals(rhs.systemInd))))&&((this.user == rhs.user)||((this.user!= null)&&this.user.equals(rhs.user))));
    }

}
