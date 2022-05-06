
package com.ellucian.generated.bpapi.ban.eu_hesa_student_module_instance.v1_0_0;

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
    "stuCourseSessionId",
    "ssdtCodeModcount",
    "ssdtCodeApel",
    "ssdtCodeContinuing",
    "ssdtCodeModcountSt",
    "ssdtCodeApelSt",
    "languagePercentage",
    "mifeeamount",
    "ssdtCodeModoutcomeSt",
    "moduleEndDate",
    "ssdtCodeInactivemod",
    "userId",
    "modId",
    "moduleStartDate",
    "ssdtCodeModoutcome",
    "activityDate",
    "ssdtCodeContinuingSt",
    "ssdtCodeModresultSt",
    "moduleInstanceId",
    "id",
    "ssdtCodeInactivemodSt",
    "ssdtCodeModresult"
})
@Generated("jsonschema2pojo")
public class EuHesaStudentModuleInstance100GetRequest {

    /**
     * Lineage reference object : stuCourseSessionId
     * 
     */
    @JsonProperty("stuCourseSessionId")
    @JsonPropertyDescription("Lineage reference object : stuCourseSessionId")
    private Object stuCourseSessionId;
    /**
     * Module Count
     * <p>
     * Lineage reference object : SOBSTMI_SSDT_CODE_MODCOUNT
     * 
     */
    @JsonProperty("ssdtCodeModcount")
    @JsonPropertyDescription("Lineage reference object : SOBSTMI_SSDT_CODE_MODCOUNT")
    private String ssdtCodeModcount;
    /**
     * Accreditation of Prior Experimental Learning
     * <p>
     * Lineage reference object : SOBSTMI_SSDT_CODE_APEL
     * 
     */
    @JsonProperty("ssdtCodeApel")
    @JsonPropertyDescription("Lineage reference object : SOBSTMI_SSDT_CODE_APEL")
    private String ssdtCodeApel;
    /**
     * Continuing Module
     * <p>
     * Lineage reference object : SOBSTMI_SSDT_CODE_CONTINUING
     * 
     */
    @JsonProperty("ssdtCodeContinuing")
    @JsonPropertyDescription("Lineage reference object : SOBSTMI_SSDT_CODE_CONTINUING")
    private String ssdtCodeContinuing;
    /**
     * Module Count Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeModcountSt")
    private String ssdtCodeModcountSt;
    /**
     * APEL Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeApelSt")
    private String ssdtCodeApelSt;
    /**
     * Language Percentage
     * <p>
     * Lineage reference object : SOBSTMI_LANGUAGE_PERCENTAGE
     * 
     */
    @JsonProperty("languagePercentage")
    @JsonPropertyDescription("Lineage reference object : SOBSTMI_LANGUAGE_PERCENTAGE")
    private Double languagePercentage;
    /**
     * Module Instance Fee Amount
     * <p>
     * Lineage reference object : SOBSTMI_MIFEEAMOUNT
     * 
     */
    @JsonProperty("mifeeamount")
    @JsonPropertyDescription("Lineage reference object : SOBSTMI_MIFEEAMOUNT")
    private Double mifeeamount;
    /**
     * Module Outcome Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeModoutcomeSt")
    private String ssdtCodeModoutcomeSt;
    /**
     * Module Instance End Date
     * <p>
     * Lineage reference object : SOBSTMI_MODULE_END_DATE
     * 
     */
    @JsonProperty("moduleEndDate")
    @JsonPropertyDescription("Lineage reference object : SOBSTMI_MODULE_END_DATE")
    private Date moduleEndDate;
    /**
     * Inactive Module Flag
     * <p>
     * Lineage reference object : SOBSTMI_SSDT_CODE_INACTIVEMOD
     * 
     */
    @JsonProperty("ssdtCodeInactivemod")
    @JsonPropertyDescription("Lineage reference object : SOBSTMI_SSDT_CODE_INACTIVEMOD")
    private String ssdtCodeInactivemod;
    /**
     * Lineage reference object : SOBSTMI_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SOBSTMI_USER_ID")
    private String userId;
    /**
     * Lineage reference object : SOBSTMI_MOD_ID
     * 
     */
    @JsonProperty("modId")
    @JsonPropertyDescription("Lineage reference object : SOBSTMI_MOD_ID")
    private String modId;
    /**
     * Lineage reference object : SOBSTMI_MODULE_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("moduleStartDate")
    @JsonPropertyDescription("Lineage reference object : SOBSTMI_MODULE_START_DATE")
    private Date moduleStartDate;
    /**
     * Module Outcome
     * <p>
     * Lineage reference object : SOBSTMI_SSDT_CODE_MODOUTCOME
     * 
     */
    @JsonProperty("ssdtCodeModoutcome")
    @JsonPropertyDescription("Lineage reference object : SOBSTMI_SSDT_CODE_MODOUTCOME")
    private String ssdtCodeModoutcome;
    /**
     * Lineage reference object : SOBSTMI_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SOBSTMI_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Continuing Module Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeContinuingSt")
    private String ssdtCodeContinuingSt;
    /**
     * Module Result Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeModresultSt")
    private String ssdtCodeModresultSt;
    /**
     * Lineage reference object : SOBSTMI_MODULE_INSTANCE_ID
     * (Required)
     * 
     */
    @JsonProperty("moduleInstanceId")
    @JsonPropertyDescription("Lineage reference object : SOBSTMI_MODULE_INSTANCE_ID")
    private String moduleInstanceId;
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
     * Inactive Module Flag Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeInactivemodSt")
    private String ssdtCodeInactivemodSt;
    /**
     * Module Result
     * <p>
     * Lineage reference object : SOBSTMI_SSDT_CODE_MODRESULT
     * 
     */
    @JsonProperty("ssdtCodeModresult")
    @JsonPropertyDescription("Lineage reference object : SOBSTMI_SSDT_CODE_MODRESULT")
    private String ssdtCodeModresult;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : stuCourseSessionId
     * 
     */
    @JsonProperty("stuCourseSessionId")
    public Object getStuCourseSessionId() {
        return stuCourseSessionId;
    }

    /**
     * Lineage reference object : stuCourseSessionId
     * 
     */
    @JsonProperty("stuCourseSessionId")
    public void setStuCourseSessionId(Object stuCourseSessionId) {
        this.stuCourseSessionId = stuCourseSessionId;
    }

    public EuHesaStudentModuleInstance100GetRequest withStuCourseSessionId(Object stuCourseSessionId) {
        this.stuCourseSessionId = stuCourseSessionId;
        return this;
    }

    /**
     * Module Count
     * <p>
     * Lineage reference object : SOBSTMI_SSDT_CODE_MODCOUNT
     * 
     */
    @JsonProperty("ssdtCodeModcount")
    public String getSsdtCodeModcount() {
        return ssdtCodeModcount;
    }

    /**
     * Module Count
     * <p>
     * Lineage reference object : SOBSTMI_SSDT_CODE_MODCOUNT
     * 
     */
    @JsonProperty("ssdtCodeModcount")
    public void setSsdtCodeModcount(String ssdtCodeModcount) {
        this.ssdtCodeModcount = ssdtCodeModcount;
    }

    public EuHesaStudentModuleInstance100GetRequest withSsdtCodeModcount(String ssdtCodeModcount) {
        this.ssdtCodeModcount = ssdtCodeModcount;
        return this;
    }

    /**
     * Accreditation of Prior Experimental Learning
     * <p>
     * Lineage reference object : SOBSTMI_SSDT_CODE_APEL
     * 
     */
    @JsonProperty("ssdtCodeApel")
    public String getSsdtCodeApel() {
        return ssdtCodeApel;
    }

    /**
     * Accreditation of Prior Experimental Learning
     * <p>
     * Lineage reference object : SOBSTMI_SSDT_CODE_APEL
     * 
     */
    @JsonProperty("ssdtCodeApel")
    public void setSsdtCodeApel(String ssdtCodeApel) {
        this.ssdtCodeApel = ssdtCodeApel;
    }

    public EuHesaStudentModuleInstance100GetRequest withSsdtCodeApel(String ssdtCodeApel) {
        this.ssdtCodeApel = ssdtCodeApel;
        return this;
    }

    /**
     * Continuing Module
     * <p>
     * Lineage reference object : SOBSTMI_SSDT_CODE_CONTINUING
     * 
     */
    @JsonProperty("ssdtCodeContinuing")
    public String getSsdtCodeContinuing() {
        return ssdtCodeContinuing;
    }

    /**
     * Continuing Module
     * <p>
     * Lineage reference object : SOBSTMI_SSDT_CODE_CONTINUING
     * 
     */
    @JsonProperty("ssdtCodeContinuing")
    public void setSsdtCodeContinuing(String ssdtCodeContinuing) {
        this.ssdtCodeContinuing = ssdtCodeContinuing;
    }

    public EuHesaStudentModuleInstance100GetRequest withSsdtCodeContinuing(String ssdtCodeContinuing) {
        this.ssdtCodeContinuing = ssdtCodeContinuing;
        return this;
    }

    /**
     * Module Count Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeModcountSt")
    public String getSsdtCodeModcountSt() {
        return ssdtCodeModcountSt;
    }

    /**
     * Module Count Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeModcountSt")
    public void setSsdtCodeModcountSt(String ssdtCodeModcountSt) {
        this.ssdtCodeModcountSt = ssdtCodeModcountSt;
    }

    public EuHesaStudentModuleInstance100GetRequest withSsdtCodeModcountSt(String ssdtCodeModcountSt) {
        this.ssdtCodeModcountSt = ssdtCodeModcountSt;
        return this;
    }

    /**
     * APEL Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeApelSt")
    public String getSsdtCodeApelSt() {
        return ssdtCodeApelSt;
    }

    /**
     * APEL Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeApelSt")
    public void setSsdtCodeApelSt(String ssdtCodeApelSt) {
        this.ssdtCodeApelSt = ssdtCodeApelSt;
    }

    public EuHesaStudentModuleInstance100GetRequest withSsdtCodeApelSt(String ssdtCodeApelSt) {
        this.ssdtCodeApelSt = ssdtCodeApelSt;
        return this;
    }

    /**
     * Language Percentage
     * <p>
     * Lineage reference object : SOBSTMI_LANGUAGE_PERCENTAGE
     * 
     */
    @JsonProperty("languagePercentage")
    public Double getLanguagePercentage() {
        return languagePercentage;
    }

    /**
     * Language Percentage
     * <p>
     * Lineage reference object : SOBSTMI_LANGUAGE_PERCENTAGE
     * 
     */
    @JsonProperty("languagePercentage")
    public void setLanguagePercentage(Double languagePercentage) {
        this.languagePercentage = languagePercentage;
    }

    public EuHesaStudentModuleInstance100GetRequest withLanguagePercentage(Double languagePercentage) {
        this.languagePercentage = languagePercentage;
        return this;
    }

    /**
     * Module Instance Fee Amount
     * <p>
     * Lineage reference object : SOBSTMI_MIFEEAMOUNT
     * 
     */
    @JsonProperty("mifeeamount")
    public Double getMifeeamount() {
        return mifeeamount;
    }

    /**
     * Module Instance Fee Amount
     * <p>
     * Lineage reference object : SOBSTMI_MIFEEAMOUNT
     * 
     */
    @JsonProperty("mifeeamount")
    public void setMifeeamount(Double mifeeamount) {
        this.mifeeamount = mifeeamount;
    }

    public EuHesaStudentModuleInstance100GetRequest withMifeeamount(Double mifeeamount) {
        this.mifeeamount = mifeeamount;
        return this;
    }

    /**
     * Module Outcome Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeModoutcomeSt")
    public String getSsdtCodeModoutcomeSt() {
        return ssdtCodeModoutcomeSt;
    }

    /**
     * Module Outcome Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeModoutcomeSt")
    public void setSsdtCodeModoutcomeSt(String ssdtCodeModoutcomeSt) {
        this.ssdtCodeModoutcomeSt = ssdtCodeModoutcomeSt;
    }

    public EuHesaStudentModuleInstance100GetRequest withSsdtCodeModoutcomeSt(String ssdtCodeModoutcomeSt) {
        this.ssdtCodeModoutcomeSt = ssdtCodeModoutcomeSt;
        return this;
    }

    /**
     * Module Instance End Date
     * <p>
     * Lineage reference object : SOBSTMI_MODULE_END_DATE
     * 
     */
    @JsonProperty("moduleEndDate")
    public Date getModuleEndDate() {
        return moduleEndDate;
    }

    /**
     * Module Instance End Date
     * <p>
     * Lineage reference object : SOBSTMI_MODULE_END_DATE
     * 
     */
    @JsonProperty("moduleEndDate")
    public void setModuleEndDate(Date moduleEndDate) {
        this.moduleEndDate = moduleEndDate;
    }

    public EuHesaStudentModuleInstance100GetRequest withModuleEndDate(Date moduleEndDate) {
        this.moduleEndDate = moduleEndDate;
        return this;
    }

    /**
     * Inactive Module Flag
     * <p>
     * Lineage reference object : SOBSTMI_SSDT_CODE_INACTIVEMOD
     * 
     */
    @JsonProperty("ssdtCodeInactivemod")
    public String getSsdtCodeInactivemod() {
        return ssdtCodeInactivemod;
    }

    /**
     * Inactive Module Flag
     * <p>
     * Lineage reference object : SOBSTMI_SSDT_CODE_INACTIVEMOD
     * 
     */
    @JsonProperty("ssdtCodeInactivemod")
    public void setSsdtCodeInactivemod(String ssdtCodeInactivemod) {
        this.ssdtCodeInactivemod = ssdtCodeInactivemod;
    }

    public EuHesaStudentModuleInstance100GetRequest withSsdtCodeInactivemod(String ssdtCodeInactivemod) {
        this.ssdtCodeInactivemod = ssdtCodeInactivemod;
        return this;
    }

    /**
     * Lineage reference object : SOBSTMI_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SOBSTMI_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public EuHesaStudentModuleInstance100GetRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Lineage reference object : SOBSTMI_MOD_ID
     * 
     */
    @JsonProperty("modId")
    public String getModId() {
        return modId;
    }

    /**
     * Lineage reference object : SOBSTMI_MOD_ID
     * 
     */
    @JsonProperty("modId")
    public void setModId(String modId) {
        this.modId = modId;
    }

    public EuHesaStudentModuleInstance100GetRequest withModId(String modId) {
        this.modId = modId;
        return this;
    }

    /**
     * Lineage reference object : SOBSTMI_MODULE_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("moduleStartDate")
    public Date getModuleStartDate() {
        return moduleStartDate;
    }

    /**
     * Lineage reference object : SOBSTMI_MODULE_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("moduleStartDate")
    public void setModuleStartDate(Date moduleStartDate) {
        this.moduleStartDate = moduleStartDate;
    }

    public EuHesaStudentModuleInstance100GetRequest withModuleStartDate(Date moduleStartDate) {
        this.moduleStartDate = moduleStartDate;
        return this;
    }

    /**
     * Module Outcome
     * <p>
     * Lineage reference object : SOBSTMI_SSDT_CODE_MODOUTCOME
     * 
     */
    @JsonProperty("ssdtCodeModoutcome")
    public String getSsdtCodeModoutcome() {
        return ssdtCodeModoutcome;
    }

    /**
     * Module Outcome
     * <p>
     * Lineage reference object : SOBSTMI_SSDT_CODE_MODOUTCOME
     * 
     */
    @JsonProperty("ssdtCodeModoutcome")
    public void setSsdtCodeModoutcome(String ssdtCodeModoutcome) {
        this.ssdtCodeModoutcome = ssdtCodeModoutcome;
    }

    public EuHesaStudentModuleInstance100GetRequest withSsdtCodeModoutcome(String ssdtCodeModoutcome) {
        this.ssdtCodeModoutcome = ssdtCodeModoutcome;
        return this;
    }

    /**
     * Lineage reference object : SOBSTMI_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SOBSTMI_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public EuHesaStudentModuleInstance100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Continuing Module Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeContinuingSt")
    public String getSsdtCodeContinuingSt() {
        return ssdtCodeContinuingSt;
    }

    /**
     * Continuing Module Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeContinuingSt")
    public void setSsdtCodeContinuingSt(String ssdtCodeContinuingSt) {
        this.ssdtCodeContinuingSt = ssdtCodeContinuingSt;
    }

    public EuHesaStudentModuleInstance100GetRequest withSsdtCodeContinuingSt(String ssdtCodeContinuingSt) {
        this.ssdtCodeContinuingSt = ssdtCodeContinuingSt;
        return this;
    }

    /**
     * Module Result Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeModresultSt")
    public String getSsdtCodeModresultSt() {
        return ssdtCodeModresultSt;
    }

    /**
     * Module Result Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeModresultSt")
    public void setSsdtCodeModresultSt(String ssdtCodeModresultSt) {
        this.ssdtCodeModresultSt = ssdtCodeModresultSt;
    }

    public EuHesaStudentModuleInstance100GetRequest withSsdtCodeModresultSt(String ssdtCodeModresultSt) {
        this.ssdtCodeModresultSt = ssdtCodeModresultSt;
        return this;
    }

    /**
     * Lineage reference object : SOBSTMI_MODULE_INSTANCE_ID
     * (Required)
     * 
     */
    @JsonProperty("moduleInstanceId")
    public String getModuleInstanceId() {
        return moduleInstanceId;
    }

    /**
     * Lineage reference object : SOBSTMI_MODULE_INSTANCE_ID
     * (Required)
     * 
     */
    @JsonProperty("moduleInstanceId")
    public void setModuleInstanceId(String moduleInstanceId) {
        this.moduleInstanceId = moduleInstanceId;
    }

    public EuHesaStudentModuleInstance100GetRequest withModuleInstanceId(String moduleInstanceId) {
        this.moduleInstanceId = moduleInstanceId;
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

    public EuHesaStudentModuleInstance100GetRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Inactive Module Flag Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeInactivemodSt")
    public String getSsdtCodeInactivemodSt() {
        return ssdtCodeInactivemodSt;
    }

    /**
     * Inactive Module Flag Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeInactivemodSt")
    public void setSsdtCodeInactivemodSt(String ssdtCodeInactivemodSt) {
        this.ssdtCodeInactivemodSt = ssdtCodeInactivemodSt;
    }

    public EuHesaStudentModuleInstance100GetRequest withSsdtCodeInactivemodSt(String ssdtCodeInactivemodSt) {
        this.ssdtCodeInactivemodSt = ssdtCodeInactivemodSt;
        return this;
    }

    /**
     * Module Result
     * <p>
     * Lineage reference object : SOBSTMI_SSDT_CODE_MODRESULT
     * 
     */
    @JsonProperty("ssdtCodeModresult")
    public String getSsdtCodeModresult() {
        return ssdtCodeModresult;
    }

    /**
     * Module Result
     * <p>
     * Lineage reference object : SOBSTMI_SSDT_CODE_MODRESULT
     * 
     */
    @JsonProperty("ssdtCodeModresult")
    public void setSsdtCodeModresult(String ssdtCodeModresult) {
        this.ssdtCodeModresult = ssdtCodeModresult;
    }

    public EuHesaStudentModuleInstance100GetRequest withSsdtCodeModresult(String ssdtCodeModresult) {
        this.ssdtCodeModresult = ssdtCodeModresult;
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

    public EuHesaStudentModuleInstance100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EuHesaStudentModuleInstance100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("stuCourseSessionId");
        sb.append('=');
        sb.append(((this.stuCourseSessionId == null)?"<null>":this.stuCourseSessionId));
        sb.append(',');
        sb.append("ssdtCodeModcount");
        sb.append('=');
        sb.append(((this.ssdtCodeModcount == null)?"<null>":this.ssdtCodeModcount));
        sb.append(',');
        sb.append("ssdtCodeApel");
        sb.append('=');
        sb.append(((this.ssdtCodeApel == null)?"<null>":this.ssdtCodeApel));
        sb.append(',');
        sb.append("ssdtCodeContinuing");
        sb.append('=');
        sb.append(((this.ssdtCodeContinuing == null)?"<null>":this.ssdtCodeContinuing));
        sb.append(',');
        sb.append("ssdtCodeModcountSt");
        sb.append('=');
        sb.append(((this.ssdtCodeModcountSt == null)?"<null>":this.ssdtCodeModcountSt));
        sb.append(',');
        sb.append("ssdtCodeApelSt");
        sb.append('=');
        sb.append(((this.ssdtCodeApelSt == null)?"<null>":this.ssdtCodeApelSt));
        sb.append(',');
        sb.append("languagePercentage");
        sb.append('=');
        sb.append(((this.languagePercentage == null)?"<null>":this.languagePercentage));
        sb.append(',');
        sb.append("mifeeamount");
        sb.append('=');
        sb.append(((this.mifeeamount == null)?"<null>":this.mifeeamount));
        sb.append(',');
        sb.append("ssdtCodeModoutcomeSt");
        sb.append('=');
        sb.append(((this.ssdtCodeModoutcomeSt == null)?"<null>":this.ssdtCodeModoutcomeSt));
        sb.append(',');
        sb.append("moduleEndDate");
        sb.append('=');
        sb.append(((this.moduleEndDate == null)?"<null>":this.moduleEndDate));
        sb.append(',');
        sb.append("ssdtCodeInactivemod");
        sb.append('=');
        sb.append(((this.ssdtCodeInactivemod == null)?"<null>":this.ssdtCodeInactivemod));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("modId");
        sb.append('=');
        sb.append(((this.modId == null)?"<null>":this.modId));
        sb.append(',');
        sb.append("moduleStartDate");
        sb.append('=');
        sb.append(((this.moduleStartDate == null)?"<null>":this.moduleStartDate));
        sb.append(',');
        sb.append("ssdtCodeModoutcome");
        sb.append('=');
        sb.append(((this.ssdtCodeModoutcome == null)?"<null>":this.ssdtCodeModoutcome));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("ssdtCodeContinuingSt");
        sb.append('=');
        sb.append(((this.ssdtCodeContinuingSt == null)?"<null>":this.ssdtCodeContinuingSt));
        sb.append(',');
        sb.append("ssdtCodeModresultSt");
        sb.append('=');
        sb.append(((this.ssdtCodeModresultSt == null)?"<null>":this.ssdtCodeModresultSt));
        sb.append(',');
        sb.append("moduleInstanceId");
        sb.append('=');
        sb.append(((this.moduleInstanceId == null)?"<null>":this.moduleInstanceId));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("ssdtCodeInactivemodSt");
        sb.append('=');
        sb.append(((this.ssdtCodeInactivemodSt == null)?"<null>":this.ssdtCodeInactivemodSt));
        sb.append(',');
        sb.append("ssdtCodeModresult");
        sb.append('=');
        sb.append(((this.ssdtCodeModresult == null)?"<null>":this.ssdtCodeModresult));
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
        result = ((result* 31)+((this.stuCourseSessionId == null)? 0 :this.stuCourseSessionId.hashCode()));
        result = ((result* 31)+((this.ssdtCodeModcount == null)? 0 :this.ssdtCodeModcount.hashCode()));
        result = ((result* 31)+((this.ssdtCodeApel == null)? 0 :this.ssdtCodeApel.hashCode()));
        result = ((result* 31)+((this.ssdtCodeContinuing == null)? 0 :this.ssdtCodeContinuing.hashCode()));
        result = ((result* 31)+((this.ssdtCodeModcountSt == null)? 0 :this.ssdtCodeModcountSt.hashCode()));
        result = ((result* 31)+((this.ssdtCodeApelSt == null)? 0 :this.ssdtCodeApelSt.hashCode()));
        result = ((result* 31)+((this.languagePercentage == null)? 0 :this.languagePercentage.hashCode()));
        result = ((result* 31)+((this.mifeeamount == null)? 0 :this.mifeeamount.hashCode()));
        result = ((result* 31)+((this.ssdtCodeModoutcomeSt == null)? 0 :this.ssdtCodeModoutcomeSt.hashCode()));
        result = ((result* 31)+((this.moduleEndDate == null)? 0 :this.moduleEndDate.hashCode()));
        result = ((result* 31)+((this.ssdtCodeInactivemod == null)? 0 :this.ssdtCodeInactivemod.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.modId == null)? 0 :this.modId.hashCode()));
        result = ((result* 31)+((this.moduleStartDate == null)? 0 :this.moduleStartDate.hashCode()));
        result = ((result* 31)+((this.ssdtCodeModoutcome == null)? 0 :this.ssdtCodeModoutcome.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.ssdtCodeContinuingSt == null)? 0 :this.ssdtCodeContinuingSt.hashCode()));
        result = ((result* 31)+((this.ssdtCodeModresultSt == null)? 0 :this.ssdtCodeModresultSt.hashCode()));
        result = ((result* 31)+((this.moduleInstanceId == null)? 0 :this.moduleInstanceId.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ssdtCodeInactivemodSt == null)? 0 :this.ssdtCodeInactivemodSt.hashCode()));
        result = ((result* 31)+((this.ssdtCodeModresult == null)? 0 :this.ssdtCodeModresult.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EuHesaStudentModuleInstance100GetRequest) == false) {
            return false;
        }
        EuHesaStudentModuleInstance100GetRequest rhs = ((EuHesaStudentModuleInstance100GetRequest) other);
        return ((((((((((((((((((((((((this.stuCourseSessionId == rhs.stuCourseSessionId)||((this.stuCourseSessionId!= null)&&this.stuCourseSessionId.equals(rhs.stuCourseSessionId)))&&((this.ssdtCodeModcount == rhs.ssdtCodeModcount)||((this.ssdtCodeModcount!= null)&&this.ssdtCodeModcount.equals(rhs.ssdtCodeModcount))))&&((this.ssdtCodeApel == rhs.ssdtCodeApel)||((this.ssdtCodeApel!= null)&&this.ssdtCodeApel.equals(rhs.ssdtCodeApel))))&&((this.ssdtCodeContinuing == rhs.ssdtCodeContinuing)||((this.ssdtCodeContinuing!= null)&&this.ssdtCodeContinuing.equals(rhs.ssdtCodeContinuing))))&&((this.ssdtCodeModcountSt == rhs.ssdtCodeModcountSt)||((this.ssdtCodeModcountSt!= null)&&this.ssdtCodeModcountSt.equals(rhs.ssdtCodeModcountSt))))&&((this.ssdtCodeApelSt == rhs.ssdtCodeApelSt)||((this.ssdtCodeApelSt!= null)&&this.ssdtCodeApelSt.equals(rhs.ssdtCodeApelSt))))&&((this.languagePercentage == rhs.languagePercentage)||((this.languagePercentage!= null)&&this.languagePercentage.equals(rhs.languagePercentage))))&&((this.mifeeamount == rhs.mifeeamount)||((this.mifeeamount!= null)&&this.mifeeamount.equals(rhs.mifeeamount))))&&((this.ssdtCodeModoutcomeSt == rhs.ssdtCodeModoutcomeSt)||((this.ssdtCodeModoutcomeSt!= null)&&this.ssdtCodeModoutcomeSt.equals(rhs.ssdtCodeModoutcomeSt))))&&((this.moduleEndDate == rhs.moduleEndDate)||((this.moduleEndDate!= null)&&this.moduleEndDate.equals(rhs.moduleEndDate))))&&((this.ssdtCodeInactivemod == rhs.ssdtCodeInactivemod)||((this.ssdtCodeInactivemod!= null)&&this.ssdtCodeInactivemod.equals(rhs.ssdtCodeInactivemod))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.modId == rhs.modId)||((this.modId!= null)&&this.modId.equals(rhs.modId))))&&((this.moduleStartDate == rhs.moduleStartDate)||((this.moduleStartDate!= null)&&this.moduleStartDate.equals(rhs.moduleStartDate))))&&((this.ssdtCodeModoutcome == rhs.ssdtCodeModoutcome)||((this.ssdtCodeModoutcome!= null)&&this.ssdtCodeModoutcome.equals(rhs.ssdtCodeModoutcome))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.ssdtCodeContinuingSt == rhs.ssdtCodeContinuingSt)||((this.ssdtCodeContinuingSt!= null)&&this.ssdtCodeContinuingSt.equals(rhs.ssdtCodeContinuingSt))))&&((this.ssdtCodeModresultSt == rhs.ssdtCodeModresultSt)||((this.ssdtCodeModresultSt!= null)&&this.ssdtCodeModresultSt.equals(rhs.ssdtCodeModresultSt))))&&((this.moduleInstanceId == rhs.moduleInstanceId)||((this.moduleInstanceId!= null)&&this.moduleInstanceId.equals(rhs.moduleInstanceId))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ssdtCodeInactivemodSt == rhs.ssdtCodeInactivemodSt)||((this.ssdtCodeInactivemodSt!= null)&&this.ssdtCodeInactivemodSt.equals(rhs.ssdtCodeInactivemodSt))))&&((this.ssdtCodeModresult == rhs.ssdtCodeModresult)||((this.ssdtCodeModresult!= null)&&this.ssdtCodeModresult.equals(rhs.ssdtCodeModresult))));
    }

}
