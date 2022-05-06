
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
    "initCode",
    "datePrinted",
    "criteria.datePrinted",
    "dateInit",
    "criteria.description",
    "letrCode",
    "criteria.systemInd",
    "criteria.waitDays",
    "criteria.user",
    "waitDays",
    "criteria.aidyCode",
    "criteria.origInd",
    "criteria.letrCode",
    "criteria.dateInit",
    "criteria.initCode",
    "id",
    "criteria.moduleCode"
})
@Generated("jsonschema2pojo")
public class ApplicantMail100PutRequest {

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
     * Print Date
     * <p>
     * Lineage reference object : GURMAIL_DATE_PRINTED
     * 
     */
    @JsonProperty("criteria.datePrinted")
    @JsonPropertyDescription("Lineage reference object : GURMAIL_DATE_PRINTED")
    private Date criteriaDatePrinted;
    /**
     * Initiated
     * <p>
     * Lineage reference object : GURMAIL_DATE_INIT
     * 
     */
    @JsonProperty("dateInit")
    @JsonPropertyDescription("Lineage reference object : GURMAIL_DATE_INIT")
    private Date dateInit;
    @JsonProperty("criteria.description")
    private String criteriaDescription;
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
    /**
     * System
     * <p>
     * Lineage reference object : GURMAIL_SYSTEM_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.systemInd")
    @JsonPropertyDescription("Lineage reference object : GURMAIL_SYSTEM_IND")
    private String criteriaSystemInd;
    /**
     * Wait
     * <p>
     * Lineage reference object : GURMAIL_WAIT_DAYS
     * 
     */
    @JsonProperty("criteria.waitDays")
    @JsonPropertyDescription("Lineage reference object : GURMAIL_WAIT_DAYS")
    private Double criteriaWaitDays;
    /**
     * User ID
     * <p>
     * Lineage reference object : GURMAIL_USER
     * 
     */
    @JsonProperty("criteria.user")
    @JsonPropertyDescription("Lineage reference object : GURMAIL_USER")
    private String criteriaUser;
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
     * Aid Year
     * <p>
     * Lineage reference object : GURMAIL_AIDY_CODE, Lookup lineage reference object : robinst
     * (Required)
     * 
     */
    @JsonProperty("criteria.aidyCode")
    @JsonPropertyDescription("Lineage reference object : GURMAIL_AIDY_CODE, Lookup lineage reference object : robinst")
    private String criteriaAidyCode;
    /**
     * Originator
     * <p>
     * Lineage reference object : GURMAIL_ORIG_IND
     * 
     */
    @JsonProperty("criteria.origInd")
    @JsonPropertyDescription("Lineage reference object : GURMAIL_ORIG_IND")
    private String criteriaOrigInd;
    /**
     * Letter
     * <p>
     * Lineage reference object : GURMAIL_LETR_CODE, Lookup lineage reference object : gtvletr
     * (Required)
     * 
     */
    @JsonProperty("criteria.letrCode")
    @JsonPropertyDescription("Lineage reference object : GURMAIL_LETR_CODE, Lookup lineage reference object : gtvletr")
    private String criteriaLetrCode;
    /**
     * Initiated
     * <p>
     * Lineage reference object : GURMAIL_DATE_INIT
     * 
     */
    @JsonProperty("criteria.dateInit")
    @JsonPropertyDescription("Lineage reference object : GURMAIL_DATE_INIT")
    private Date criteriaDateInit;
    /**
     * Initials
     * <p>
     * Lineage reference object : GURMAIL_INIT_CODE, Lookup lineage reference object : stvinit
     * 
     */
    @JsonProperty("criteria.initCode")
    @JsonPropertyDescription("Lineage reference object : GURMAIL_INIT_CODE, Lookup lineage reference object : stvinit")
    private String criteriaInitCode;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
    /**
     * Module
     * <p>
     * Lineage reference object : GURMAIL_MODULE_CODE
     * 
     */
    @JsonProperty("criteria.moduleCode")
    @JsonPropertyDescription("Lineage reference object : GURMAIL_MODULE_CODE")
    private String criteriaModuleCode;
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

    public ApplicantMail100PutRequest withModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
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

    public ApplicantMail100PutRequest withInitCode(String initCode) {
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

    public ApplicantMail100PutRequest withDatePrinted(Date datePrinted) {
        this.datePrinted = datePrinted;
        return this;
    }

    /**
     * Print Date
     * <p>
     * Lineage reference object : GURMAIL_DATE_PRINTED
     * 
     */
    @JsonProperty("criteria.datePrinted")
    public Date getCriteriaDatePrinted() {
        return criteriaDatePrinted;
    }

    /**
     * Print Date
     * <p>
     * Lineage reference object : GURMAIL_DATE_PRINTED
     * 
     */
    @JsonProperty("criteria.datePrinted")
    public void setCriteriaDatePrinted(Date criteriaDatePrinted) {
        this.criteriaDatePrinted = criteriaDatePrinted;
    }

    public ApplicantMail100PutRequest withCriteriaDatePrinted(Date criteriaDatePrinted) {
        this.criteriaDatePrinted = criteriaDatePrinted;
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

    public ApplicantMail100PutRequest withDateInit(Date dateInit) {
        this.dateInit = dateInit;
        return this;
    }

    @JsonProperty("criteria.description")
    public String getCriteriaDescription() {
        return criteriaDescription;
    }

    @JsonProperty("criteria.description")
    public void setCriteriaDescription(String criteriaDescription) {
        this.criteriaDescription = criteriaDescription;
    }

    public ApplicantMail100PutRequest withCriteriaDescription(String criteriaDescription) {
        this.criteriaDescription = criteriaDescription;
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

    public ApplicantMail100PutRequest withLetrCode(String letrCode) {
        this.letrCode = letrCode;
        return this;
    }

    /**
     * System
     * <p>
     * Lineage reference object : GURMAIL_SYSTEM_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.systemInd")
    public String getCriteriaSystemInd() {
        return criteriaSystemInd;
    }

    /**
     * System
     * <p>
     * Lineage reference object : GURMAIL_SYSTEM_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.systemInd")
    public void setCriteriaSystemInd(String criteriaSystemInd) {
        this.criteriaSystemInd = criteriaSystemInd;
    }

    public ApplicantMail100PutRequest withCriteriaSystemInd(String criteriaSystemInd) {
        this.criteriaSystemInd = criteriaSystemInd;
        return this;
    }

    /**
     * Wait
     * <p>
     * Lineage reference object : GURMAIL_WAIT_DAYS
     * 
     */
    @JsonProperty("criteria.waitDays")
    public Double getCriteriaWaitDays() {
        return criteriaWaitDays;
    }

    /**
     * Wait
     * <p>
     * Lineage reference object : GURMAIL_WAIT_DAYS
     * 
     */
    @JsonProperty("criteria.waitDays")
    public void setCriteriaWaitDays(Double criteriaWaitDays) {
        this.criteriaWaitDays = criteriaWaitDays;
    }

    public ApplicantMail100PutRequest withCriteriaWaitDays(Double criteriaWaitDays) {
        this.criteriaWaitDays = criteriaWaitDays;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : GURMAIL_USER
     * 
     */
    @JsonProperty("criteria.user")
    public String getCriteriaUser() {
        return criteriaUser;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : GURMAIL_USER
     * 
     */
    @JsonProperty("criteria.user")
    public void setCriteriaUser(String criteriaUser) {
        this.criteriaUser = criteriaUser;
    }

    public ApplicantMail100PutRequest withCriteriaUser(String criteriaUser) {
        this.criteriaUser = criteriaUser;
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

    public ApplicantMail100PutRequest withWaitDays(Double waitDays) {
        this.waitDays = waitDays;
        return this;
    }

    /**
     * Aid Year
     * <p>
     * Lineage reference object : GURMAIL_AIDY_CODE, Lookup lineage reference object : robinst
     * (Required)
     * 
     */
    @JsonProperty("criteria.aidyCode")
    public String getCriteriaAidyCode() {
        return criteriaAidyCode;
    }

    /**
     * Aid Year
     * <p>
     * Lineage reference object : GURMAIL_AIDY_CODE, Lookup lineage reference object : robinst
     * (Required)
     * 
     */
    @JsonProperty("criteria.aidyCode")
    public void setCriteriaAidyCode(String criteriaAidyCode) {
        this.criteriaAidyCode = criteriaAidyCode;
    }

    public ApplicantMail100PutRequest withCriteriaAidyCode(String criteriaAidyCode) {
        this.criteriaAidyCode = criteriaAidyCode;
        return this;
    }

    /**
     * Originator
     * <p>
     * Lineage reference object : GURMAIL_ORIG_IND
     * 
     */
    @JsonProperty("criteria.origInd")
    public String getCriteriaOrigInd() {
        return criteriaOrigInd;
    }

    /**
     * Originator
     * <p>
     * Lineage reference object : GURMAIL_ORIG_IND
     * 
     */
    @JsonProperty("criteria.origInd")
    public void setCriteriaOrigInd(String criteriaOrigInd) {
        this.criteriaOrigInd = criteriaOrigInd;
    }

    public ApplicantMail100PutRequest withCriteriaOrigInd(String criteriaOrigInd) {
        this.criteriaOrigInd = criteriaOrigInd;
        return this;
    }

    /**
     * Letter
     * <p>
     * Lineage reference object : GURMAIL_LETR_CODE, Lookup lineage reference object : gtvletr
     * (Required)
     * 
     */
    @JsonProperty("criteria.letrCode")
    public String getCriteriaLetrCode() {
        return criteriaLetrCode;
    }

    /**
     * Letter
     * <p>
     * Lineage reference object : GURMAIL_LETR_CODE, Lookup lineage reference object : gtvletr
     * (Required)
     * 
     */
    @JsonProperty("criteria.letrCode")
    public void setCriteriaLetrCode(String criteriaLetrCode) {
        this.criteriaLetrCode = criteriaLetrCode;
    }

    public ApplicantMail100PutRequest withCriteriaLetrCode(String criteriaLetrCode) {
        this.criteriaLetrCode = criteriaLetrCode;
        return this;
    }

    /**
     * Initiated
     * <p>
     * Lineage reference object : GURMAIL_DATE_INIT
     * 
     */
    @JsonProperty("criteria.dateInit")
    public Date getCriteriaDateInit() {
        return criteriaDateInit;
    }

    /**
     * Initiated
     * <p>
     * Lineage reference object : GURMAIL_DATE_INIT
     * 
     */
    @JsonProperty("criteria.dateInit")
    public void setCriteriaDateInit(Date criteriaDateInit) {
        this.criteriaDateInit = criteriaDateInit;
    }

    public ApplicantMail100PutRequest withCriteriaDateInit(Date criteriaDateInit) {
        this.criteriaDateInit = criteriaDateInit;
        return this;
    }

    /**
     * Initials
     * <p>
     * Lineage reference object : GURMAIL_INIT_CODE, Lookup lineage reference object : stvinit
     * 
     */
    @JsonProperty("criteria.initCode")
    public String getCriteriaInitCode() {
        return criteriaInitCode;
    }

    /**
     * Initials
     * <p>
     * Lineage reference object : GURMAIL_INIT_CODE, Lookup lineage reference object : stvinit
     * 
     */
    @JsonProperty("criteria.initCode")
    public void setCriteriaInitCode(String criteriaInitCode) {
        this.criteriaInitCode = criteriaInitCode;
    }

    public ApplicantMail100PutRequest withCriteriaInitCode(String criteriaInitCode) {
        this.criteriaInitCode = criteriaInitCode;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public ApplicantMail100PutRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Module
     * <p>
     * Lineage reference object : GURMAIL_MODULE_CODE
     * 
     */
    @JsonProperty("criteria.moduleCode")
    public String getCriteriaModuleCode() {
        return criteriaModuleCode;
    }

    /**
     * Module
     * <p>
     * Lineage reference object : GURMAIL_MODULE_CODE
     * 
     */
    @JsonProperty("criteria.moduleCode")
    public void setCriteriaModuleCode(String criteriaModuleCode) {
        this.criteriaModuleCode = criteriaModuleCode;
    }

    public ApplicantMail100PutRequest withCriteriaModuleCode(String criteriaModuleCode) {
        this.criteriaModuleCode = criteriaModuleCode;
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

    public ApplicantMail100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApplicantMail100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("moduleCode");
        sb.append('=');
        sb.append(((this.moduleCode == null)?"<null>":this.moduleCode));
        sb.append(',');
        sb.append("initCode");
        sb.append('=');
        sb.append(((this.initCode == null)?"<null>":this.initCode));
        sb.append(',');
        sb.append("datePrinted");
        sb.append('=');
        sb.append(((this.datePrinted == null)?"<null>":this.datePrinted));
        sb.append(',');
        sb.append("criteriaDatePrinted");
        sb.append('=');
        sb.append(((this.criteriaDatePrinted == null)?"<null>":this.criteriaDatePrinted));
        sb.append(',');
        sb.append("dateInit");
        sb.append('=');
        sb.append(((this.dateInit == null)?"<null>":this.dateInit));
        sb.append(',');
        sb.append("criteriaDescription");
        sb.append('=');
        sb.append(((this.criteriaDescription == null)?"<null>":this.criteriaDescription));
        sb.append(',');
        sb.append("letrCode");
        sb.append('=');
        sb.append(((this.letrCode == null)?"<null>":this.letrCode));
        sb.append(',');
        sb.append("criteriaSystemInd");
        sb.append('=');
        sb.append(((this.criteriaSystemInd == null)?"<null>":this.criteriaSystemInd));
        sb.append(',');
        sb.append("criteriaWaitDays");
        sb.append('=');
        sb.append(((this.criteriaWaitDays == null)?"<null>":this.criteriaWaitDays));
        sb.append(',');
        sb.append("criteriaUser");
        sb.append('=');
        sb.append(((this.criteriaUser == null)?"<null>":this.criteriaUser));
        sb.append(',');
        sb.append("waitDays");
        sb.append('=');
        sb.append(((this.waitDays == null)?"<null>":this.waitDays));
        sb.append(',');
        sb.append("criteriaAidyCode");
        sb.append('=');
        sb.append(((this.criteriaAidyCode == null)?"<null>":this.criteriaAidyCode));
        sb.append(',');
        sb.append("criteriaOrigInd");
        sb.append('=');
        sb.append(((this.criteriaOrigInd == null)?"<null>":this.criteriaOrigInd));
        sb.append(',');
        sb.append("criteriaLetrCode");
        sb.append('=');
        sb.append(((this.criteriaLetrCode == null)?"<null>":this.criteriaLetrCode));
        sb.append(',');
        sb.append("criteriaDateInit");
        sb.append('=');
        sb.append(((this.criteriaDateInit == null)?"<null>":this.criteriaDateInit));
        sb.append(',');
        sb.append("criteriaInitCode");
        sb.append('=');
        sb.append(((this.criteriaInitCode == null)?"<null>":this.criteriaInitCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("criteriaModuleCode");
        sb.append('=');
        sb.append(((this.criteriaModuleCode == null)?"<null>":this.criteriaModuleCode));
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
        result = ((result* 31)+((this.criteriaSystemInd == null)? 0 :this.criteriaSystemInd.hashCode()));
        result = ((result* 31)+((this.criteriaModuleCode == null)? 0 :this.criteriaModuleCode.hashCode()));
        result = ((result* 31)+((this.moduleCode == null)? 0 :this.moduleCode.hashCode()));
        result = ((result* 31)+((this.initCode == null)? 0 :this.initCode.hashCode()));
        result = ((result* 31)+((this.criteriaOrigInd == null)? 0 :this.criteriaOrigInd.hashCode()));
        result = ((result* 31)+((this.datePrinted == null)? 0 :this.datePrinted.hashCode()));
        result = ((result* 31)+((this.dateInit == null)? 0 :this.dateInit.hashCode()));
        result = ((result* 31)+((this.letrCode == null)? 0 :this.letrCode.hashCode()));
        result = ((result* 31)+((this.criteriaWaitDays == null)? 0 :this.criteriaWaitDays.hashCode()));
        result = ((result* 31)+((this.criteriaAidyCode == null)? 0 :this.criteriaAidyCode.hashCode()));
        result = ((result* 31)+((this.waitDays == null)? 0 :this.waitDays.hashCode()));
        result = ((result* 31)+((this.criteriaLetrCode == null)? 0 :this.criteriaLetrCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaDatePrinted == null)? 0 :this.criteriaDatePrinted.hashCode()));
        result = ((result* 31)+((this.criteriaDescription == null)? 0 :this.criteriaDescription.hashCode()));
        result = ((result* 31)+((this.criteriaDateInit == null)? 0 :this.criteriaDateInit.hashCode()));
        result = ((result* 31)+((this.criteriaInitCode == null)? 0 :this.criteriaInitCode.hashCode()));
        result = ((result* 31)+((this.criteriaUser == null)? 0 :this.criteriaUser.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicantMail100PutRequest) == false) {
            return false;
        }
        ApplicantMail100PutRequest rhs = ((ApplicantMail100PutRequest) other);
        return ((((((((((((((((((((this.criteriaSystemInd == rhs.criteriaSystemInd)||((this.criteriaSystemInd!= null)&&this.criteriaSystemInd.equals(rhs.criteriaSystemInd)))&&((this.criteriaModuleCode == rhs.criteriaModuleCode)||((this.criteriaModuleCode!= null)&&this.criteriaModuleCode.equals(rhs.criteriaModuleCode))))&&((this.moduleCode == rhs.moduleCode)||((this.moduleCode!= null)&&this.moduleCode.equals(rhs.moduleCode))))&&((this.initCode == rhs.initCode)||((this.initCode!= null)&&this.initCode.equals(rhs.initCode))))&&((this.criteriaOrigInd == rhs.criteriaOrigInd)||((this.criteriaOrigInd!= null)&&this.criteriaOrigInd.equals(rhs.criteriaOrigInd))))&&((this.datePrinted == rhs.datePrinted)||((this.datePrinted!= null)&&this.datePrinted.equals(rhs.datePrinted))))&&((this.dateInit == rhs.dateInit)||((this.dateInit!= null)&&this.dateInit.equals(rhs.dateInit))))&&((this.letrCode == rhs.letrCode)||((this.letrCode!= null)&&this.letrCode.equals(rhs.letrCode))))&&((this.criteriaWaitDays == rhs.criteriaWaitDays)||((this.criteriaWaitDays!= null)&&this.criteriaWaitDays.equals(rhs.criteriaWaitDays))))&&((this.criteriaAidyCode == rhs.criteriaAidyCode)||((this.criteriaAidyCode!= null)&&this.criteriaAidyCode.equals(rhs.criteriaAidyCode))))&&((this.waitDays == rhs.waitDays)||((this.waitDays!= null)&&this.waitDays.equals(rhs.waitDays))))&&((this.criteriaLetrCode == rhs.criteriaLetrCode)||((this.criteriaLetrCode!= null)&&this.criteriaLetrCode.equals(rhs.criteriaLetrCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaDatePrinted == rhs.criteriaDatePrinted)||((this.criteriaDatePrinted!= null)&&this.criteriaDatePrinted.equals(rhs.criteriaDatePrinted))))&&((this.criteriaDescription == rhs.criteriaDescription)||((this.criteriaDescription!= null)&&this.criteriaDescription.equals(rhs.criteriaDescription))))&&((this.criteriaDateInit == rhs.criteriaDateInit)||((this.criteriaDateInit!= null)&&this.criteriaDateInit.equals(rhs.criteriaDateInit))))&&((this.criteriaInitCode == rhs.criteriaInitCode)||((this.criteriaInitCode!= null)&&this.criteriaInitCode.equals(rhs.criteriaInitCode))))&&((this.criteriaUser == rhs.criteriaUser)||((this.criteriaUser!= null)&&this.criteriaUser.equals(rhs.criteriaUser))));
    }

}
