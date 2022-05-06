
package com.ellucian.generated.bpapi.ban.person_experience.v1_0_0;

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
    "criteria.ctryCodeSuperPhone",
    "superName",
    "endDate",
    "criteria.endDate",
    "hireActVerifRecInd",
    "criteria.hireActVerifRecInd",
    "criteria.ctryCodePhone",
    "criteria.startDate",
    "hireactStartDate",
    "ctryCodeSuperPhone",
    "criteria.phoneExt",
    "criteria.superPhoneExt",
    "id",
    "criteria.emtyCode",
    "emtyCode",
    "superPhoneNumber",
    "criteria.posnDuties",
    "phoneNumber",
    "criteria.currSalary",
    "name",
    "currSalary",
    "phoneArea",
    "criteria.phoneNumber",
    "posnDuties",
    "emprName",
    "startDate",
    "criteria.emprName",
    "criteria.hireactStartDate",
    "criteria.superComment",
    "contactInd",
    "criteria.phoneArea",
    "ctryCodePhone",
    "criteria.superPhoneNumber",
    "criteria.superName",
    "criteria.natnCode",
    "criteria.superPhoneArea",
    "posnTitle",
    "criteria.comment",
    "empsSupervise",
    "superPhoneArea",
    "criteria.contactInd",
    "phoneExt",
    "statCode",
    "natnCode",
    "reasonLeft",
    "criteria.posnTitle",
    "currHourly",
    "criteria.name",
    "criteria.statCode",
    "criteria.currHourly",
    "criteria.reasonLeft",
    "superPhoneExt",
    "criteria.emtyDesc",
    "comment",
    "superComment",
    "criteria.empsSupervise"
})
@Generated("jsonschema2pojo")
public class PersonExperience100PutRequest {

    /**
     * Country Code
     * <p>
     * Lineage reference object : PPREXPE_CTRY_CODE_SUPER_PHONE
     * 
     */
    @JsonProperty("criteria.ctryCodeSuperPhone")
    @JsonPropertyDescription("Lineage reference object : PPREXPE_CTRY_CODE_SUPER_PHONE")
    private String criteriaCtryCodeSuperPhone;
    /**
     * Name
     * <p>
     * Lineage reference object : PPREXPE_SUPER_NAME
     * 
     */
    @JsonProperty("superName")
    @JsonPropertyDescription("Lineage reference object : PPREXPE_SUPER_NAME")
    private String superName;
    /**
     * End Date
     * <p>
     * Lineage reference object : PPREXPE_END_DATE
     * 
     */
    @JsonProperty("endDate")
    @JsonPropertyDescription("Lineage reference object : PPREXPE_END_DATE")
    private Date endDate;
    /**
     * End Date
     * <p>
     * Lineage reference object : PPREXPE_END_DATE
     * 
     */
    @JsonProperty("criteria.endDate")
    @JsonPropertyDescription("Lineage reference object : PPREXPE_END_DATE")
    private Date criteriaEndDate;
    /**
     * Hire Act Verification Received
     * <p>
     * Lineage reference object : PPREXPE_HIRE_ACT_VERIF_REC_IND
     * 
     */
    @JsonProperty("hireActVerifRecInd")
    @JsonPropertyDescription("Lineage reference object : PPREXPE_HIRE_ACT_VERIF_REC_IND")
    private String hireActVerifRecInd;
    /**
     * Hire Act Verification Received
     * <p>
     * Lineage reference object : PPREXPE_HIRE_ACT_VERIF_REC_IND
     * 
     */
    @JsonProperty("criteria.hireActVerifRecInd")
    @JsonPropertyDescription("Lineage reference object : PPREXPE_HIRE_ACT_VERIF_REC_IND")
    private String criteriaHireActVerifRecInd;
    /**
     * Country Code
     * <p>
     * Lineage reference object : PPRREFE_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("criteria.ctryCodePhone")
    @JsonPropertyDescription("Lineage reference object : PPRREFE_CTRY_CODE_PHONE")
    private String criteriaCtryCodePhone;
    /**
     * Start Date
     * <p>
     * Lineage reference object : PPREXPE_START_DATE
     * 
     */
    @JsonProperty("criteria.startDate")
    @JsonPropertyDescription("Lineage reference object : PPREXPE_START_DATE")
    private Date criteriaStartDate;
    /**
     * Hire Act Start Date
     * <p>
     * Lineage reference object : PPREXPE_HIRE_ACT_START_DATE
     * 
     */
    @JsonProperty("hireactStartDate")
    @JsonPropertyDescription("Lineage reference object : PPREXPE_HIRE_ACT_START_DATE")
    private Date hireactStartDate;
    /**
     * Country Code
     * <p>
     * Lineage reference object : PPREXPE_CTRY_CODE_SUPER_PHONE
     * 
     */
    @JsonProperty("ctryCodeSuperPhone")
    @JsonPropertyDescription("Lineage reference object : PPREXPE_CTRY_CODE_SUPER_PHONE")
    private String ctryCodeSuperPhone;
    /**
     * Extension
     * <p>
     * Lineage reference object : PPRREFE_PHONE_EXT
     * 
     */
    @JsonProperty("criteria.phoneExt")
    @JsonPropertyDescription("Lineage reference object : PPRREFE_PHONE_EXT")
    private String criteriaPhoneExt;
    /**
     * Extension
     * <p>
     * Lineage reference object : PPREXPE_SUPER_PHONE_EXT
     * 
     */
    @JsonProperty("criteria.superPhoneExt")
    @JsonPropertyDescription("Lineage reference object : PPREXPE_SUPER_PHONE_EXT")
    private String criteriaSuperPhoneExt;
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
     * Employer Experience Type
     * <p>
     * Lineage reference object : PPREXPE_EMTY_CODE, Lookup lineage reference object : ptremty
     * 
     */
    @JsonProperty("criteria.emtyCode")
    @JsonPropertyDescription("Lineage reference object : PPREXPE_EMTY_CODE, Lookup lineage reference object : ptremty")
    private String criteriaEmtyCode;
    /**
     * Employer Experience Type
     * <p>
     * Lineage reference object : PPREXPE_EMTY_CODE, Lookup lineage reference object : ptremty
     * 
     */
    @JsonProperty("emtyCode")
    @JsonPropertyDescription("Lineage reference object : PPREXPE_EMTY_CODE, Lookup lineage reference object : ptremty")
    private String emtyCode;
    /**
     * Phone Number
     * <p>
     * Lineage reference object : PPREXPE_SUPER_PHONE_NUMBER
     * 
     */
    @JsonProperty("superPhoneNumber")
    @JsonPropertyDescription("Lineage reference object : PPREXPE_SUPER_PHONE_NUMBER")
    private String superPhoneNumber;
    /**
     * Job Duties
     * <p>
     * Lineage reference object : PPREXPE_POSN_DUTIES
     * 
     */
    @JsonProperty("criteria.posnDuties")
    @JsonPropertyDescription("Lineage reference object : PPREXPE_POSN_DUTIES")
    private String criteriaPosnDuties;
    /**
     * Phone Number
     * <p>
     * Lineage reference object : PPRREFE_PHONE_NUMBER
     * 
     */
    @JsonProperty("phoneNumber")
    @JsonPropertyDescription("Lineage reference object : PPRREFE_PHONE_NUMBER")
    private String phoneNumber;
    /**
     * Current or Ending Salary
     * <p>
     * Lineage reference object : PPREXPE_CURR_SALARY
     * 
     */
    @JsonProperty("criteria.currSalary")
    @JsonPropertyDescription("Lineage reference object : PPREXPE_CURR_SALARY")
    private Double criteriaCurrSalary;
    /**
     * Name
     * <p>
     * Lineage reference object : PPRREFE_NAME
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Lineage reference object : PPRREFE_NAME")
    private String name;
    /**
     * Current or Ending Salary
     * <p>
     * Lineage reference object : PPREXPE_CURR_SALARY
     * 
     */
    @JsonProperty("currSalary")
    @JsonPropertyDescription("Lineage reference object : PPREXPE_CURR_SALARY")
    private Double currSalary;
    /**
     * Area Code
     * <p>
     * Lineage reference object : PPRREFE_PHONE_AREA
     * 
     */
    @JsonProperty("phoneArea")
    @JsonPropertyDescription("Lineage reference object : PPRREFE_PHONE_AREA")
    private String phoneArea;
    /**
     * Phone Number
     * <p>
     * Lineage reference object : PPRREFE_PHONE_NUMBER
     * 
     */
    @JsonProperty("criteria.phoneNumber")
    @JsonPropertyDescription("Lineage reference object : PPRREFE_PHONE_NUMBER")
    private String criteriaPhoneNumber;
    /**
     * Job Duties
     * <p>
     * Lineage reference object : PPREXPE_POSN_DUTIES
     * 
     */
    @JsonProperty("posnDuties")
    @JsonPropertyDescription("Lineage reference object : PPREXPE_POSN_DUTIES")
    private String posnDuties;
    /**
     * Employer Name
     * <p>
     * Lineage reference object : PPREXPE_EMPR_NAME
     * 
     */
    @JsonProperty("emprName")
    @JsonPropertyDescription("Lineage reference object : PPREXPE_EMPR_NAME")
    private String emprName;
    /**
     * Start Date
     * <p>
     * Lineage reference object : PPREXPE_START_DATE
     * 
     */
    @JsonProperty("startDate")
    @JsonPropertyDescription("Lineage reference object : PPREXPE_START_DATE")
    private Date startDate;
    /**
     * Employer Name
     * <p>
     * Lineage reference object : PPREXPE_EMPR_NAME
     * 
     */
    @JsonProperty("criteria.emprName")
    @JsonPropertyDescription("Lineage reference object : PPREXPE_EMPR_NAME")
    private String criteriaEmprName;
    /**
     * Hire Act Start Date
     * <p>
     * Lineage reference object : PPREXPE_HIRE_ACT_START_DATE
     * 
     */
    @JsonProperty("criteria.hireactStartDate")
    @JsonPropertyDescription("Lineage reference object : PPREXPE_HIRE_ACT_START_DATE")
    private Date criteriaHireactStartDate;
    /**
     * Comments
     * <p>
     * Lineage reference object : PPREXPE_SUPER_COMMENT
     * 
     */
    @JsonProperty("criteria.superComment")
    @JsonPropertyDescription("Lineage reference object : PPREXPE_SUPER_COMMENT")
    private String criteriaSuperComment;
    /**
     * OK to Contact
     * <p>
     * Lineage reference object : PPREXPE_CONTACT_IND
     * 
     */
    @JsonProperty("contactInd")
    @JsonPropertyDescription("Lineage reference object : PPREXPE_CONTACT_IND")
    private String contactInd;
    /**
     * Area Code
     * <p>
     * Lineage reference object : PPRREFE_PHONE_AREA
     * 
     */
    @JsonProperty("criteria.phoneArea")
    @JsonPropertyDescription("Lineage reference object : PPRREFE_PHONE_AREA")
    private String criteriaPhoneArea;
    /**
     * Country Code
     * <p>
     * Lineage reference object : PPRREFE_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("ctryCodePhone")
    @JsonPropertyDescription("Lineage reference object : PPRREFE_CTRY_CODE_PHONE")
    private String ctryCodePhone;
    /**
     * Phone Number
     * <p>
     * Lineage reference object : PPREXPE_SUPER_PHONE_NUMBER
     * 
     */
    @JsonProperty("criteria.superPhoneNumber")
    @JsonPropertyDescription("Lineage reference object : PPREXPE_SUPER_PHONE_NUMBER")
    private String criteriaSuperPhoneNumber;
    /**
     * Name
     * <p>
     * Lineage reference object : PPREXPE_SUPER_NAME
     * 
     */
    @JsonProperty("criteria.superName")
    @JsonPropertyDescription("Lineage reference object : PPREXPE_SUPER_NAME")
    private String criteriaSuperName;
    /**
     * Nation
     * <p>
     * Lineage reference object : PPREXPE_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("criteria.natnCode")
    @JsonPropertyDescription("Lineage reference object : PPREXPE_NATN_CODE, Lookup lineage reference object : stvnatn")
    private String criteriaNatnCode;
    /**
     * Area Code
     * <p>
     * Lineage reference object : PPREXPE_SUPER_PHONE_AREA
     * 
     */
    @JsonProperty("criteria.superPhoneArea")
    @JsonPropertyDescription("Lineage reference object : PPREXPE_SUPER_PHONE_AREA")
    private String criteriaSuperPhoneArea;
    /**
     * Job Title
     * <p>
     * Lineage reference object : PPREXPE_POSN_TITLE
     * 
     */
    @JsonProperty("posnTitle")
    @JsonPropertyDescription("Lineage reference object : PPREXPE_POSN_TITLE")
    private String posnTitle;
    /**
     * Comment
     * <p>
     * Lineage reference object : PPRREFE_COMMENT
     * 
     */
    @JsonProperty("criteria.comment")
    @JsonPropertyDescription("Lineage reference object : PPRREFE_COMMENT")
    private String criteriaComment;
    /**
     * Number of Employees Supervised
     * <p>
     * Lineage reference object : PPREXPE_EMPS_SUPERVISE
     * 
     */
    @JsonProperty("empsSupervise")
    @JsonPropertyDescription("Lineage reference object : PPREXPE_EMPS_SUPERVISE")
    private Double empsSupervise;
    /**
     * Area Code
     * <p>
     * Lineage reference object : PPREXPE_SUPER_PHONE_AREA
     * 
     */
    @JsonProperty("superPhoneArea")
    @JsonPropertyDescription("Lineage reference object : PPREXPE_SUPER_PHONE_AREA")
    private String superPhoneArea;
    /**
     * OK to Contact
     * <p>
     * Lineage reference object : PPREXPE_CONTACT_IND
     * 
     */
    @JsonProperty("criteria.contactInd")
    @JsonPropertyDescription("Lineage reference object : PPREXPE_CONTACT_IND")
    private String criteriaContactInd;
    /**
     * Extension
     * <p>
     * Lineage reference object : PPRREFE_PHONE_EXT
     * 
     */
    @JsonProperty("phoneExt")
    @JsonPropertyDescription("Lineage reference object : PPRREFE_PHONE_EXT")
    private String phoneExt;
    /**
     * State or Province
     * <p>
     * Lineage reference object : PPREXPE_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCode")
    @JsonPropertyDescription("Lineage reference object : PPREXPE_STAT_CODE, Lookup lineage reference object : stvstat")
    private String statCode;
    /**
     * Nation
     * <p>
     * Lineage reference object : PPREXPE_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCode")
    @JsonPropertyDescription("Lineage reference object : PPREXPE_NATN_CODE, Lookup lineage reference object : stvnatn")
    private String natnCode;
    /**
     * Reason for Leaving
     * <p>
     * Lineage reference object : PPREXPE_REASON_LEFT
     * 
     */
    @JsonProperty("reasonLeft")
    @JsonPropertyDescription("Lineage reference object : PPREXPE_REASON_LEFT")
    private String reasonLeft;
    /**
     * Job Title
     * <p>
     * Lineage reference object : PPREXPE_POSN_TITLE
     * 
     */
    @JsonProperty("criteria.posnTitle")
    @JsonPropertyDescription("Lineage reference object : PPREXPE_POSN_TITLE")
    private String criteriaPosnTitle;
    /**
     * Current or Ending Rate
     * <p>
     * Lineage reference object : PPREXPE_CURR_HOURLY
     * 
     */
    @JsonProperty("currHourly")
    @JsonPropertyDescription("Lineage reference object : PPREXPE_CURR_HOURLY")
    private Double currHourly;
    /**
     * Name
     * <p>
     * Lineage reference object : PPRREFE_NAME
     * 
     */
    @JsonProperty("criteria.name")
    @JsonPropertyDescription("Lineage reference object : PPRREFE_NAME")
    private String criteriaName;
    /**
     * State or Province
     * <p>
     * Lineage reference object : PPREXPE_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("criteria.statCode")
    @JsonPropertyDescription("Lineage reference object : PPREXPE_STAT_CODE, Lookup lineage reference object : stvstat")
    private String criteriaStatCode;
    /**
     * Current or Ending Rate
     * <p>
     * Lineage reference object : PPREXPE_CURR_HOURLY
     * 
     */
    @JsonProperty("criteria.currHourly")
    @JsonPropertyDescription("Lineage reference object : PPREXPE_CURR_HOURLY")
    private Double criteriaCurrHourly;
    /**
     * Reason for Leaving
     * <p>
     * Lineage reference object : PPREXPE_REASON_LEFT
     * 
     */
    @JsonProperty("criteria.reasonLeft")
    @JsonPropertyDescription("Lineage reference object : PPREXPE_REASON_LEFT")
    private String criteriaReasonLeft;
    /**
     * Extension
     * <p>
     * Lineage reference object : PPREXPE_SUPER_PHONE_EXT
     * 
     */
    @JsonProperty("superPhoneExt")
    @JsonPropertyDescription("Lineage reference object : PPREXPE_SUPER_PHONE_EXT")
    private String superPhoneExt;
    @JsonProperty("criteria.emtyDesc")
    private String criteriaEmtyDesc;
    /**
     * Comment
     * <p>
     * Lineage reference object : PPRREFE_COMMENT
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("Lineage reference object : PPRREFE_COMMENT")
    private String comment;
    /**
     * Comments
     * <p>
     * Lineage reference object : PPREXPE_SUPER_COMMENT
     * 
     */
    @JsonProperty("superComment")
    @JsonPropertyDescription("Lineage reference object : PPREXPE_SUPER_COMMENT")
    private String superComment;
    /**
     * Number of Employees Supervised
     * <p>
     * Lineage reference object : PPREXPE_EMPS_SUPERVISE
     * 
     */
    @JsonProperty("criteria.empsSupervise")
    @JsonPropertyDescription("Lineage reference object : PPREXPE_EMPS_SUPERVISE")
    private Double criteriaEmpsSupervise;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Country Code
     * <p>
     * Lineage reference object : PPREXPE_CTRY_CODE_SUPER_PHONE
     * 
     */
    @JsonProperty("criteria.ctryCodeSuperPhone")
    public String getCriteriaCtryCodeSuperPhone() {
        return criteriaCtryCodeSuperPhone;
    }

    /**
     * Country Code
     * <p>
     * Lineage reference object : PPREXPE_CTRY_CODE_SUPER_PHONE
     * 
     */
    @JsonProperty("criteria.ctryCodeSuperPhone")
    public void setCriteriaCtryCodeSuperPhone(String criteriaCtryCodeSuperPhone) {
        this.criteriaCtryCodeSuperPhone = criteriaCtryCodeSuperPhone;
    }

    public PersonExperience100PutRequest withCriteriaCtryCodeSuperPhone(String criteriaCtryCodeSuperPhone) {
        this.criteriaCtryCodeSuperPhone = criteriaCtryCodeSuperPhone;
        return this;
    }

    /**
     * Name
     * <p>
     * Lineage reference object : PPREXPE_SUPER_NAME
     * 
     */
    @JsonProperty("superName")
    public String getSuperName() {
        return superName;
    }

    /**
     * Name
     * <p>
     * Lineage reference object : PPREXPE_SUPER_NAME
     * 
     */
    @JsonProperty("superName")
    public void setSuperName(String superName) {
        this.superName = superName;
    }

    public PersonExperience100PutRequest withSuperName(String superName) {
        this.superName = superName;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : PPREXPE_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public Date getEndDate() {
        return endDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : PPREXPE_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public PersonExperience100PutRequest withEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : PPREXPE_END_DATE
     * 
     */
    @JsonProperty("criteria.endDate")
    public Date getCriteriaEndDate() {
        return criteriaEndDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : PPREXPE_END_DATE
     * 
     */
    @JsonProperty("criteria.endDate")
    public void setCriteriaEndDate(Date criteriaEndDate) {
        this.criteriaEndDate = criteriaEndDate;
    }

    public PersonExperience100PutRequest withCriteriaEndDate(Date criteriaEndDate) {
        this.criteriaEndDate = criteriaEndDate;
        return this;
    }

    /**
     * Hire Act Verification Received
     * <p>
     * Lineage reference object : PPREXPE_HIRE_ACT_VERIF_REC_IND
     * 
     */
    @JsonProperty("hireActVerifRecInd")
    public String getHireActVerifRecInd() {
        return hireActVerifRecInd;
    }

    /**
     * Hire Act Verification Received
     * <p>
     * Lineage reference object : PPREXPE_HIRE_ACT_VERIF_REC_IND
     * 
     */
    @JsonProperty("hireActVerifRecInd")
    public void setHireActVerifRecInd(String hireActVerifRecInd) {
        this.hireActVerifRecInd = hireActVerifRecInd;
    }

    public PersonExperience100PutRequest withHireActVerifRecInd(String hireActVerifRecInd) {
        this.hireActVerifRecInd = hireActVerifRecInd;
        return this;
    }

    /**
     * Hire Act Verification Received
     * <p>
     * Lineage reference object : PPREXPE_HIRE_ACT_VERIF_REC_IND
     * 
     */
    @JsonProperty("criteria.hireActVerifRecInd")
    public String getCriteriaHireActVerifRecInd() {
        return criteriaHireActVerifRecInd;
    }

    /**
     * Hire Act Verification Received
     * <p>
     * Lineage reference object : PPREXPE_HIRE_ACT_VERIF_REC_IND
     * 
     */
    @JsonProperty("criteria.hireActVerifRecInd")
    public void setCriteriaHireActVerifRecInd(String criteriaHireActVerifRecInd) {
        this.criteriaHireActVerifRecInd = criteriaHireActVerifRecInd;
    }

    public PersonExperience100PutRequest withCriteriaHireActVerifRecInd(String criteriaHireActVerifRecInd) {
        this.criteriaHireActVerifRecInd = criteriaHireActVerifRecInd;
        return this;
    }

    /**
     * Country Code
     * <p>
     * Lineage reference object : PPRREFE_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("criteria.ctryCodePhone")
    public String getCriteriaCtryCodePhone() {
        return criteriaCtryCodePhone;
    }

    /**
     * Country Code
     * <p>
     * Lineage reference object : PPRREFE_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("criteria.ctryCodePhone")
    public void setCriteriaCtryCodePhone(String criteriaCtryCodePhone) {
        this.criteriaCtryCodePhone = criteriaCtryCodePhone;
    }

    public PersonExperience100PutRequest withCriteriaCtryCodePhone(String criteriaCtryCodePhone) {
        this.criteriaCtryCodePhone = criteriaCtryCodePhone;
        return this;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : PPREXPE_START_DATE
     * 
     */
    @JsonProperty("criteria.startDate")
    public Date getCriteriaStartDate() {
        return criteriaStartDate;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : PPREXPE_START_DATE
     * 
     */
    @JsonProperty("criteria.startDate")
    public void setCriteriaStartDate(Date criteriaStartDate) {
        this.criteriaStartDate = criteriaStartDate;
    }

    public PersonExperience100PutRequest withCriteriaStartDate(Date criteriaStartDate) {
        this.criteriaStartDate = criteriaStartDate;
        return this;
    }

    /**
     * Hire Act Start Date
     * <p>
     * Lineage reference object : PPREXPE_HIRE_ACT_START_DATE
     * 
     */
    @JsonProperty("hireactStartDate")
    public Date getHireactStartDate() {
        return hireactStartDate;
    }

    /**
     * Hire Act Start Date
     * <p>
     * Lineage reference object : PPREXPE_HIRE_ACT_START_DATE
     * 
     */
    @JsonProperty("hireactStartDate")
    public void setHireactStartDate(Date hireactStartDate) {
        this.hireactStartDate = hireactStartDate;
    }

    public PersonExperience100PutRequest withHireactStartDate(Date hireactStartDate) {
        this.hireactStartDate = hireactStartDate;
        return this;
    }

    /**
     * Country Code
     * <p>
     * Lineage reference object : PPREXPE_CTRY_CODE_SUPER_PHONE
     * 
     */
    @JsonProperty("ctryCodeSuperPhone")
    public String getCtryCodeSuperPhone() {
        return ctryCodeSuperPhone;
    }

    /**
     * Country Code
     * <p>
     * Lineage reference object : PPREXPE_CTRY_CODE_SUPER_PHONE
     * 
     */
    @JsonProperty("ctryCodeSuperPhone")
    public void setCtryCodeSuperPhone(String ctryCodeSuperPhone) {
        this.ctryCodeSuperPhone = ctryCodeSuperPhone;
    }

    public PersonExperience100PutRequest withCtryCodeSuperPhone(String ctryCodeSuperPhone) {
        this.ctryCodeSuperPhone = ctryCodeSuperPhone;
        return this;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : PPRREFE_PHONE_EXT
     * 
     */
    @JsonProperty("criteria.phoneExt")
    public String getCriteriaPhoneExt() {
        return criteriaPhoneExt;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : PPRREFE_PHONE_EXT
     * 
     */
    @JsonProperty("criteria.phoneExt")
    public void setCriteriaPhoneExt(String criteriaPhoneExt) {
        this.criteriaPhoneExt = criteriaPhoneExt;
    }

    public PersonExperience100PutRequest withCriteriaPhoneExt(String criteriaPhoneExt) {
        this.criteriaPhoneExt = criteriaPhoneExt;
        return this;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : PPREXPE_SUPER_PHONE_EXT
     * 
     */
    @JsonProperty("criteria.superPhoneExt")
    public String getCriteriaSuperPhoneExt() {
        return criteriaSuperPhoneExt;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : PPREXPE_SUPER_PHONE_EXT
     * 
     */
    @JsonProperty("criteria.superPhoneExt")
    public void setCriteriaSuperPhoneExt(String criteriaSuperPhoneExt) {
        this.criteriaSuperPhoneExt = criteriaSuperPhoneExt;
    }

    public PersonExperience100PutRequest withCriteriaSuperPhoneExt(String criteriaSuperPhoneExt) {
        this.criteriaSuperPhoneExt = criteriaSuperPhoneExt;
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

    public PersonExperience100PutRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Employer Experience Type
     * <p>
     * Lineage reference object : PPREXPE_EMTY_CODE, Lookup lineage reference object : ptremty
     * 
     */
    @JsonProperty("criteria.emtyCode")
    public String getCriteriaEmtyCode() {
        return criteriaEmtyCode;
    }

    /**
     * Employer Experience Type
     * <p>
     * Lineage reference object : PPREXPE_EMTY_CODE, Lookup lineage reference object : ptremty
     * 
     */
    @JsonProperty("criteria.emtyCode")
    public void setCriteriaEmtyCode(String criteriaEmtyCode) {
        this.criteriaEmtyCode = criteriaEmtyCode;
    }

    public PersonExperience100PutRequest withCriteriaEmtyCode(String criteriaEmtyCode) {
        this.criteriaEmtyCode = criteriaEmtyCode;
        return this;
    }

    /**
     * Employer Experience Type
     * <p>
     * Lineage reference object : PPREXPE_EMTY_CODE, Lookup lineage reference object : ptremty
     * 
     */
    @JsonProperty("emtyCode")
    public String getEmtyCode() {
        return emtyCode;
    }

    /**
     * Employer Experience Type
     * <p>
     * Lineage reference object : PPREXPE_EMTY_CODE, Lookup lineage reference object : ptremty
     * 
     */
    @JsonProperty("emtyCode")
    public void setEmtyCode(String emtyCode) {
        this.emtyCode = emtyCode;
    }

    public PersonExperience100PutRequest withEmtyCode(String emtyCode) {
        this.emtyCode = emtyCode;
        return this;
    }

    /**
     * Phone Number
     * <p>
     * Lineage reference object : PPREXPE_SUPER_PHONE_NUMBER
     * 
     */
    @JsonProperty("superPhoneNumber")
    public String getSuperPhoneNumber() {
        return superPhoneNumber;
    }

    /**
     * Phone Number
     * <p>
     * Lineage reference object : PPREXPE_SUPER_PHONE_NUMBER
     * 
     */
    @JsonProperty("superPhoneNumber")
    public void setSuperPhoneNumber(String superPhoneNumber) {
        this.superPhoneNumber = superPhoneNumber;
    }

    public PersonExperience100PutRequest withSuperPhoneNumber(String superPhoneNumber) {
        this.superPhoneNumber = superPhoneNumber;
        return this;
    }

    /**
     * Job Duties
     * <p>
     * Lineage reference object : PPREXPE_POSN_DUTIES
     * 
     */
    @JsonProperty("criteria.posnDuties")
    public String getCriteriaPosnDuties() {
        return criteriaPosnDuties;
    }

    /**
     * Job Duties
     * <p>
     * Lineage reference object : PPREXPE_POSN_DUTIES
     * 
     */
    @JsonProperty("criteria.posnDuties")
    public void setCriteriaPosnDuties(String criteriaPosnDuties) {
        this.criteriaPosnDuties = criteriaPosnDuties;
    }

    public PersonExperience100PutRequest withCriteriaPosnDuties(String criteriaPosnDuties) {
        this.criteriaPosnDuties = criteriaPosnDuties;
        return this;
    }

    /**
     * Phone Number
     * <p>
     * Lineage reference object : PPRREFE_PHONE_NUMBER
     * 
     */
    @JsonProperty("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Phone Number
     * <p>
     * Lineage reference object : PPRREFE_PHONE_NUMBER
     * 
     */
    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public PersonExperience100PutRequest withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Current or Ending Salary
     * <p>
     * Lineage reference object : PPREXPE_CURR_SALARY
     * 
     */
    @JsonProperty("criteria.currSalary")
    public Double getCriteriaCurrSalary() {
        return criteriaCurrSalary;
    }

    /**
     * Current or Ending Salary
     * <p>
     * Lineage reference object : PPREXPE_CURR_SALARY
     * 
     */
    @JsonProperty("criteria.currSalary")
    public void setCriteriaCurrSalary(Double criteriaCurrSalary) {
        this.criteriaCurrSalary = criteriaCurrSalary;
    }

    public PersonExperience100PutRequest withCriteriaCurrSalary(Double criteriaCurrSalary) {
        this.criteriaCurrSalary = criteriaCurrSalary;
        return this;
    }

    /**
     * Name
     * <p>
     * Lineage reference object : PPRREFE_NAME
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name
     * <p>
     * Lineage reference object : PPRREFE_NAME
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public PersonExperience100PutRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Current or Ending Salary
     * <p>
     * Lineage reference object : PPREXPE_CURR_SALARY
     * 
     */
    @JsonProperty("currSalary")
    public Double getCurrSalary() {
        return currSalary;
    }

    /**
     * Current or Ending Salary
     * <p>
     * Lineage reference object : PPREXPE_CURR_SALARY
     * 
     */
    @JsonProperty("currSalary")
    public void setCurrSalary(Double currSalary) {
        this.currSalary = currSalary;
    }

    public PersonExperience100PutRequest withCurrSalary(Double currSalary) {
        this.currSalary = currSalary;
        return this;
    }

    /**
     * Area Code
     * <p>
     * Lineage reference object : PPRREFE_PHONE_AREA
     * 
     */
    @JsonProperty("phoneArea")
    public String getPhoneArea() {
        return phoneArea;
    }

    /**
     * Area Code
     * <p>
     * Lineage reference object : PPRREFE_PHONE_AREA
     * 
     */
    @JsonProperty("phoneArea")
    public void setPhoneArea(String phoneArea) {
        this.phoneArea = phoneArea;
    }

    public PersonExperience100PutRequest withPhoneArea(String phoneArea) {
        this.phoneArea = phoneArea;
        return this;
    }

    /**
     * Phone Number
     * <p>
     * Lineage reference object : PPRREFE_PHONE_NUMBER
     * 
     */
    @JsonProperty("criteria.phoneNumber")
    public String getCriteriaPhoneNumber() {
        return criteriaPhoneNumber;
    }

    /**
     * Phone Number
     * <p>
     * Lineage reference object : PPRREFE_PHONE_NUMBER
     * 
     */
    @JsonProperty("criteria.phoneNumber")
    public void setCriteriaPhoneNumber(String criteriaPhoneNumber) {
        this.criteriaPhoneNumber = criteriaPhoneNumber;
    }

    public PersonExperience100PutRequest withCriteriaPhoneNumber(String criteriaPhoneNumber) {
        this.criteriaPhoneNumber = criteriaPhoneNumber;
        return this;
    }

    /**
     * Job Duties
     * <p>
     * Lineage reference object : PPREXPE_POSN_DUTIES
     * 
     */
    @JsonProperty("posnDuties")
    public String getPosnDuties() {
        return posnDuties;
    }

    /**
     * Job Duties
     * <p>
     * Lineage reference object : PPREXPE_POSN_DUTIES
     * 
     */
    @JsonProperty("posnDuties")
    public void setPosnDuties(String posnDuties) {
        this.posnDuties = posnDuties;
    }

    public PersonExperience100PutRequest withPosnDuties(String posnDuties) {
        this.posnDuties = posnDuties;
        return this;
    }

    /**
     * Employer Name
     * <p>
     * Lineage reference object : PPREXPE_EMPR_NAME
     * 
     */
    @JsonProperty("emprName")
    public String getEmprName() {
        return emprName;
    }

    /**
     * Employer Name
     * <p>
     * Lineage reference object : PPREXPE_EMPR_NAME
     * 
     */
    @JsonProperty("emprName")
    public void setEmprName(String emprName) {
        this.emprName = emprName;
    }

    public PersonExperience100PutRequest withEmprName(String emprName) {
        this.emprName = emprName;
        return this;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : PPREXPE_START_DATE
     * 
     */
    @JsonProperty("startDate")
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : PPREXPE_START_DATE
     * 
     */
    @JsonProperty("startDate")
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public PersonExperience100PutRequest withStartDate(Date startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Employer Name
     * <p>
     * Lineage reference object : PPREXPE_EMPR_NAME
     * 
     */
    @JsonProperty("criteria.emprName")
    public String getCriteriaEmprName() {
        return criteriaEmprName;
    }

    /**
     * Employer Name
     * <p>
     * Lineage reference object : PPREXPE_EMPR_NAME
     * 
     */
    @JsonProperty("criteria.emprName")
    public void setCriteriaEmprName(String criteriaEmprName) {
        this.criteriaEmprName = criteriaEmprName;
    }

    public PersonExperience100PutRequest withCriteriaEmprName(String criteriaEmprName) {
        this.criteriaEmprName = criteriaEmprName;
        return this;
    }

    /**
     * Hire Act Start Date
     * <p>
     * Lineage reference object : PPREXPE_HIRE_ACT_START_DATE
     * 
     */
    @JsonProperty("criteria.hireactStartDate")
    public Date getCriteriaHireactStartDate() {
        return criteriaHireactStartDate;
    }

    /**
     * Hire Act Start Date
     * <p>
     * Lineage reference object : PPREXPE_HIRE_ACT_START_DATE
     * 
     */
    @JsonProperty("criteria.hireactStartDate")
    public void setCriteriaHireactStartDate(Date criteriaHireactStartDate) {
        this.criteriaHireactStartDate = criteriaHireactStartDate;
    }

    public PersonExperience100PutRequest withCriteriaHireactStartDate(Date criteriaHireactStartDate) {
        this.criteriaHireactStartDate = criteriaHireactStartDate;
        return this;
    }

    /**
     * Comments
     * <p>
     * Lineage reference object : PPREXPE_SUPER_COMMENT
     * 
     */
    @JsonProperty("criteria.superComment")
    public String getCriteriaSuperComment() {
        return criteriaSuperComment;
    }

    /**
     * Comments
     * <p>
     * Lineage reference object : PPREXPE_SUPER_COMMENT
     * 
     */
    @JsonProperty("criteria.superComment")
    public void setCriteriaSuperComment(String criteriaSuperComment) {
        this.criteriaSuperComment = criteriaSuperComment;
    }

    public PersonExperience100PutRequest withCriteriaSuperComment(String criteriaSuperComment) {
        this.criteriaSuperComment = criteriaSuperComment;
        return this;
    }

    /**
     * OK to Contact
     * <p>
     * Lineage reference object : PPREXPE_CONTACT_IND
     * 
     */
    @JsonProperty("contactInd")
    public String getContactInd() {
        return contactInd;
    }

    /**
     * OK to Contact
     * <p>
     * Lineage reference object : PPREXPE_CONTACT_IND
     * 
     */
    @JsonProperty("contactInd")
    public void setContactInd(String contactInd) {
        this.contactInd = contactInd;
    }

    public PersonExperience100PutRequest withContactInd(String contactInd) {
        this.contactInd = contactInd;
        return this;
    }

    /**
     * Area Code
     * <p>
     * Lineage reference object : PPRREFE_PHONE_AREA
     * 
     */
    @JsonProperty("criteria.phoneArea")
    public String getCriteriaPhoneArea() {
        return criteriaPhoneArea;
    }

    /**
     * Area Code
     * <p>
     * Lineage reference object : PPRREFE_PHONE_AREA
     * 
     */
    @JsonProperty("criteria.phoneArea")
    public void setCriteriaPhoneArea(String criteriaPhoneArea) {
        this.criteriaPhoneArea = criteriaPhoneArea;
    }

    public PersonExperience100PutRequest withCriteriaPhoneArea(String criteriaPhoneArea) {
        this.criteriaPhoneArea = criteriaPhoneArea;
        return this;
    }

    /**
     * Country Code
     * <p>
     * Lineage reference object : PPRREFE_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("ctryCodePhone")
    public String getCtryCodePhone() {
        return ctryCodePhone;
    }

    /**
     * Country Code
     * <p>
     * Lineage reference object : PPRREFE_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("ctryCodePhone")
    public void setCtryCodePhone(String ctryCodePhone) {
        this.ctryCodePhone = ctryCodePhone;
    }

    public PersonExperience100PutRequest withCtryCodePhone(String ctryCodePhone) {
        this.ctryCodePhone = ctryCodePhone;
        return this;
    }

    /**
     * Phone Number
     * <p>
     * Lineage reference object : PPREXPE_SUPER_PHONE_NUMBER
     * 
     */
    @JsonProperty("criteria.superPhoneNumber")
    public String getCriteriaSuperPhoneNumber() {
        return criteriaSuperPhoneNumber;
    }

    /**
     * Phone Number
     * <p>
     * Lineage reference object : PPREXPE_SUPER_PHONE_NUMBER
     * 
     */
    @JsonProperty("criteria.superPhoneNumber")
    public void setCriteriaSuperPhoneNumber(String criteriaSuperPhoneNumber) {
        this.criteriaSuperPhoneNumber = criteriaSuperPhoneNumber;
    }

    public PersonExperience100PutRequest withCriteriaSuperPhoneNumber(String criteriaSuperPhoneNumber) {
        this.criteriaSuperPhoneNumber = criteriaSuperPhoneNumber;
        return this;
    }

    /**
     * Name
     * <p>
     * Lineage reference object : PPREXPE_SUPER_NAME
     * 
     */
    @JsonProperty("criteria.superName")
    public String getCriteriaSuperName() {
        return criteriaSuperName;
    }

    /**
     * Name
     * <p>
     * Lineage reference object : PPREXPE_SUPER_NAME
     * 
     */
    @JsonProperty("criteria.superName")
    public void setCriteriaSuperName(String criteriaSuperName) {
        this.criteriaSuperName = criteriaSuperName;
    }

    public PersonExperience100PutRequest withCriteriaSuperName(String criteriaSuperName) {
        this.criteriaSuperName = criteriaSuperName;
        return this;
    }

    /**
     * Nation
     * <p>
     * Lineage reference object : PPREXPE_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("criteria.natnCode")
    public String getCriteriaNatnCode() {
        return criteriaNatnCode;
    }

    /**
     * Nation
     * <p>
     * Lineage reference object : PPREXPE_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("criteria.natnCode")
    public void setCriteriaNatnCode(String criteriaNatnCode) {
        this.criteriaNatnCode = criteriaNatnCode;
    }

    public PersonExperience100PutRequest withCriteriaNatnCode(String criteriaNatnCode) {
        this.criteriaNatnCode = criteriaNatnCode;
        return this;
    }

    /**
     * Area Code
     * <p>
     * Lineage reference object : PPREXPE_SUPER_PHONE_AREA
     * 
     */
    @JsonProperty("criteria.superPhoneArea")
    public String getCriteriaSuperPhoneArea() {
        return criteriaSuperPhoneArea;
    }

    /**
     * Area Code
     * <p>
     * Lineage reference object : PPREXPE_SUPER_PHONE_AREA
     * 
     */
    @JsonProperty("criteria.superPhoneArea")
    public void setCriteriaSuperPhoneArea(String criteriaSuperPhoneArea) {
        this.criteriaSuperPhoneArea = criteriaSuperPhoneArea;
    }

    public PersonExperience100PutRequest withCriteriaSuperPhoneArea(String criteriaSuperPhoneArea) {
        this.criteriaSuperPhoneArea = criteriaSuperPhoneArea;
        return this;
    }

    /**
     * Job Title
     * <p>
     * Lineage reference object : PPREXPE_POSN_TITLE
     * 
     */
    @JsonProperty("posnTitle")
    public String getPosnTitle() {
        return posnTitle;
    }

    /**
     * Job Title
     * <p>
     * Lineage reference object : PPREXPE_POSN_TITLE
     * 
     */
    @JsonProperty("posnTitle")
    public void setPosnTitle(String posnTitle) {
        this.posnTitle = posnTitle;
    }

    public PersonExperience100PutRequest withPosnTitle(String posnTitle) {
        this.posnTitle = posnTitle;
        return this;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : PPRREFE_COMMENT
     * 
     */
    @JsonProperty("criteria.comment")
    public String getCriteriaComment() {
        return criteriaComment;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : PPRREFE_COMMENT
     * 
     */
    @JsonProperty("criteria.comment")
    public void setCriteriaComment(String criteriaComment) {
        this.criteriaComment = criteriaComment;
    }

    public PersonExperience100PutRequest withCriteriaComment(String criteriaComment) {
        this.criteriaComment = criteriaComment;
        return this;
    }

    /**
     * Number of Employees Supervised
     * <p>
     * Lineage reference object : PPREXPE_EMPS_SUPERVISE
     * 
     */
    @JsonProperty("empsSupervise")
    public Double getEmpsSupervise() {
        return empsSupervise;
    }

    /**
     * Number of Employees Supervised
     * <p>
     * Lineage reference object : PPREXPE_EMPS_SUPERVISE
     * 
     */
    @JsonProperty("empsSupervise")
    public void setEmpsSupervise(Double empsSupervise) {
        this.empsSupervise = empsSupervise;
    }

    public PersonExperience100PutRequest withEmpsSupervise(Double empsSupervise) {
        this.empsSupervise = empsSupervise;
        return this;
    }

    /**
     * Area Code
     * <p>
     * Lineage reference object : PPREXPE_SUPER_PHONE_AREA
     * 
     */
    @JsonProperty("superPhoneArea")
    public String getSuperPhoneArea() {
        return superPhoneArea;
    }

    /**
     * Area Code
     * <p>
     * Lineage reference object : PPREXPE_SUPER_PHONE_AREA
     * 
     */
    @JsonProperty("superPhoneArea")
    public void setSuperPhoneArea(String superPhoneArea) {
        this.superPhoneArea = superPhoneArea;
    }

    public PersonExperience100PutRequest withSuperPhoneArea(String superPhoneArea) {
        this.superPhoneArea = superPhoneArea;
        return this;
    }

    /**
     * OK to Contact
     * <p>
     * Lineage reference object : PPREXPE_CONTACT_IND
     * 
     */
    @JsonProperty("criteria.contactInd")
    public String getCriteriaContactInd() {
        return criteriaContactInd;
    }

    /**
     * OK to Contact
     * <p>
     * Lineage reference object : PPREXPE_CONTACT_IND
     * 
     */
    @JsonProperty("criteria.contactInd")
    public void setCriteriaContactInd(String criteriaContactInd) {
        this.criteriaContactInd = criteriaContactInd;
    }

    public PersonExperience100PutRequest withCriteriaContactInd(String criteriaContactInd) {
        this.criteriaContactInd = criteriaContactInd;
        return this;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : PPRREFE_PHONE_EXT
     * 
     */
    @JsonProperty("phoneExt")
    public String getPhoneExt() {
        return phoneExt;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : PPRREFE_PHONE_EXT
     * 
     */
    @JsonProperty("phoneExt")
    public void setPhoneExt(String phoneExt) {
        this.phoneExt = phoneExt;
    }

    public PersonExperience100PutRequest withPhoneExt(String phoneExt) {
        this.phoneExt = phoneExt;
        return this;
    }

    /**
     * State or Province
     * <p>
     * Lineage reference object : PPREXPE_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCode")
    public String getStatCode() {
        return statCode;
    }

    /**
     * State or Province
     * <p>
     * Lineage reference object : PPREXPE_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCode")
    public void setStatCode(String statCode) {
        this.statCode = statCode;
    }

    public PersonExperience100PutRequest withStatCode(String statCode) {
        this.statCode = statCode;
        return this;
    }

    /**
     * Nation
     * <p>
     * Lineage reference object : PPREXPE_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCode")
    public String getNatnCode() {
        return natnCode;
    }

    /**
     * Nation
     * <p>
     * Lineage reference object : PPREXPE_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCode")
    public void setNatnCode(String natnCode) {
        this.natnCode = natnCode;
    }

    public PersonExperience100PutRequest withNatnCode(String natnCode) {
        this.natnCode = natnCode;
        return this;
    }

    /**
     * Reason for Leaving
     * <p>
     * Lineage reference object : PPREXPE_REASON_LEFT
     * 
     */
    @JsonProperty("reasonLeft")
    public String getReasonLeft() {
        return reasonLeft;
    }

    /**
     * Reason for Leaving
     * <p>
     * Lineage reference object : PPREXPE_REASON_LEFT
     * 
     */
    @JsonProperty("reasonLeft")
    public void setReasonLeft(String reasonLeft) {
        this.reasonLeft = reasonLeft;
    }

    public PersonExperience100PutRequest withReasonLeft(String reasonLeft) {
        this.reasonLeft = reasonLeft;
        return this;
    }

    /**
     * Job Title
     * <p>
     * Lineage reference object : PPREXPE_POSN_TITLE
     * 
     */
    @JsonProperty("criteria.posnTitle")
    public String getCriteriaPosnTitle() {
        return criteriaPosnTitle;
    }

    /**
     * Job Title
     * <p>
     * Lineage reference object : PPREXPE_POSN_TITLE
     * 
     */
    @JsonProperty("criteria.posnTitle")
    public void setCriteriaPosnTitle(String criteriaPosnTitle) {
        this.criteriaPosnTitle = criteriaPosnTitle;
    }

    public PersonExperience100PutRequest withCriteriaPosnTitle(String criteriaPosnTitle) {
        this.criteriaPosnTitle = criteriaPosnTitle;
        return this;
    }

    /**
     * Current or Ending Rate
     * <p>
     * Lineage reference object : PPREXPE_CURR_HOURLY
     * 
     */
    @JsonProperty("currHourly")
    public Double getCurrHourly() {
        return currHourly;
    }

    /**
     * Current or Ending Rate
     * <p>
     * Lineage reference object : PPREXPE_CURR_HOURLY
     * 
     */
    @JsonProperty("currHourly")
    public void setCurrHourly(Double currHourly) {
        this.currHourly = currHourly;
    }

    public PersonExperience100PutRequest withCurrHourly(Double currHourly) {
        this.currHourly = currHourly;
        return this;
    }

    /**
     * Name
     * <p>
     * Lineage reference object : PPRREFE_NAME
     * 
     */
    @JsonProperty("criteria.name")
    public String getCriteriaName() {
        return criteriaName;
    }

    /**
     * Name
     * <p>
     * Lineage reference object : PPRREFE_NAME
     * 
     */
    @JsonProperty("criteria.name")
    public void setCriteriaName(String criteriaName) {
        this.criteriaName = criteriaName;
    }

    public PersonExperience100PutRequest withCriteriaName(String criteriaName) {
        this.criteriaName = criteriaName;
        return this;
    }

    /**
     * State or Province
     * <p>
     * Lineage reference object : PPREXPE_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("criteria.statCode")
    public String getCriteriaStatCode() {
        return criteriaStatCode;
    }

    /**
     * State or Province
     * <p>
     * Lineage reference object : PPREXPE_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("criteria.statCode")
    public void setCriteriaStatCode(String criteriaStatCode) {
        this.criteriaStatCode = criteriaStatCode;
    }

    public PersonExperience100PutRequest withCriteriaStatCode(String criteriaStatCode) {
        this.criteriaStatCode = criteriaStatCode;
        return this;
    }

    /**
     * Current or Ending Rate
     * <p>
     * Lineage reference object : PPREXPE_CURR_HOURLY
     * 
     */
    @JsonProperty("criteria.currHourly")
    public Double getCriteriaCurrHourly() {
        return criteriaCurrHourly;
    }

    /**
     * Current or Ending Rate
     * <p>
     * Lineage reference object : PPREXPE_CURR_HOURLY
     * 
     */
    @JsonProperty("criteria.currHourly")
    public void setCriteriaCurrHourly(Double criteriaCurrHourly) {
        this.criteriaCurrHourly = criteriaCurrHourly;
    }

    public PersonExperience100PutRequest withCriteriaCurrHourly(Double criteriaCurrHourly) {
        this.criteriaCurrHourly = criteriaCurrHourly;
        return this;
    }

    /**
     * Reason for Leaving
     * <p>
     * Lineage reference object : PPREXPE_REASON_LEFT
     * 
     */
    @JsonProperty("criteria.reasonLeft")
    public String getCriteriaReasonLeft() {
        return criteriaReasonLeft;
    }

    /**
     * Reason for Leaving
     * <p>
     * Lineage reference object : PPREXPE_REASON_LEFT
     * 
     */
    @JsonProperty("criteria.reasonLeft")
    public void setCriteriaReasonLeft(String criteriaReasonLeft) {
        this.criteriaReasonLeft = criteriaReasonLeft;
    }

    public PersonExperience100PutRequest withCriteriaReasonLeft(String criteriaReasonLeft) {
        this.criteriaReasonLeft = criteriaReasonLeft;
        return this;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : PPREXPE_SUPER_PHONE_EXT
     * 
     */
    @JsonProperty("superPhoneExt")
    public String getSuperPhoneExt() {
        return superPhoneExt;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : PPREXPE_SUPER_PHONE_EXT
     * 
     */
    @JsonProperty("superPhoneExt")
    public void setSuperPhoneExt(String superPhoneExt) {
        this.superPhoneExt = superPhoneExt;
    }

    public PersonExperience100PutRequest withSuperPhoneExt(String superPhoneExt) {
        this.superPhoneExt = superPhoneExt;
        return this;
    }

    @JsonProperty("criteria.emtyDesc")
    public String getCriteriaEmtyDesc() {
        return criteriaEmtyDesc;
    }

    @JsonProperty("criteria.emtyDesc")
    public void setCriteriaEmtyDesc(String criteriaEmtyDesc) {
        this.criteriaEmtyDesc = criteriaEmtyDesc;
    }

    public PersonExperience100PutRequest withCriteriaEmtyDesc(String criteriaEmtyDesc) {
        this.criteriaEmtyDesc = criteriaEmtyDesc;
        return this;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : PPRREFE_COMMENT
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : PPRREFE_COMMENT
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public PersonExperience100PutRequest withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Comments
     * <p>
     * Lineage reference object : PPREXPE_SUPER_COMMENT
     * 
     */
    @JsonProperty("superComment")
    public String getSuperComment() {
        return superComment;
    }

    /**
     * Comments
     * <p>
     * Lineage reference object : PPREXPE_SUPER_COMMENT
     * 
     */
    @JsonProperty("superComment")
    public void setSuperComment(String superComment) {
        this.superComment = superComment;
    }

    public PersonExperience100PutRequest withSuperComment(String superComment) {
        this.superComment = superComment;
        return this;
    }

    /**
     * Number of Employees Supervised
     * <p>
     * Lineage reference object : PPREXPE_EMPS_SUPERVISE
     * 
     */
    @JsonProperty("criteria.empsSupervise")
    public Double getCriteriaEmpsSupervise() {
        return criteriaEmpsSupervise;
    }

    /**
     * Number of Employees Supervised
     * <p>
     * Lineage reference object : PPREXPE_EMPS_SUPERVISE
     * 
     */
    @JsonProperty("criteria.empsSupervise")
    public void setCriteriaEmpsSupervise(Double criteriaEmpsSupervise) {
        this.criteriaEmpsSupervise = criteriaEmpsSupervise;
    }

    public PersonExperience100PutRequest withCriteriaEmpsSupervise(Double criteriaEmpsSupervise) {
        this.criteriaEmpsSupervise = criteriaEmpsSupervise;
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

    public PersonExperience100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PersonExperience100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaCtryCodeSuperPhone");
        sb.append('=');
        sb.append(((this.criteriaCtryCodeSuperPhone == null)?"<null>":this.criteriaCtryCodeSuperPhone));
        sb.append(',');
        sb.append("superName");
        sb.append('=');
        sb.append(((this.superName == null)?"<null>":this.superName));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("criteriaEndDate");
        sb.append('=');
        sb.append(((this.criteriaEndDate == null)?"<null>":this.criteriaEndDate));
        sb.append(',');
        sb.append("hireActVerifRecInd");
        sb.append('=');
        sb.append(((this.hireActVerifRecInd == null)?"<null>":this.hireActVerifRecInd));
        sb.append(',');
        sb.append("criteriaHireActVerifRecInd");
        sb.append('=');
        sb.append(((this.criteriaHireActVerifRecInd == null)?"<null>":this.criteriaHireActVerifRecInd));
        sb.append(',');
        sb.append("criteriaCtryCodePhone");
        sb.append('=');
        sb.append(((this.criteriaCtryCodePhone == null)?"<null>":this.criteriaCtryCodePhone));
        sb.append(',');
        sb.append("criteriaStartDate");
        sb.append('=');
        sb.append(((this.criteriaStartDate == null)?"<null>":this.criteriaStartDate));
        sb.append(',');
        sb.append("hireactStartDate");
        sb.append('=');
        sb.append(((this.hireactStartDate == null)?"<null>":this.hireactStartDate));
        sb.append(',');
        sb.append("ctryCodeSuperPhone");
        sb.append('=');
        sb.append(((this.ctryCodeSuperPhone == null)?"<null>":this.ctryCodeSuperPhone));
        sb.append(',');
        sb.append("criteriaPhoneExt");
        sb.append('=');
        sb.append(((this.criteriaPhoneExt == null)?"<null>":this.criteriaPhoneExt));
        sb.append(',');
        sb.append("criteriaSuperPhoneExt");
        sb.append('=');
        sb.append(((this.criteriaSuperPhoneExt == null)?"<null>":this.criteriaSuperPhoneExt));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("criteriaEmtyCode");
        sb.append('=');
        sb.append(((this.criteriaEmtyCode == null)?"<null>":this.criteriaEmtyCode));
        sb.append(',');
        sb.append("emtyCode");
        sb.append('=');
        sb.append(((this.emtyCode == null)?"<null>":this.emtyCode));
        sb.append(',');
        sb.append("superPhoneNumber");
        sb.append('=');
        sb.append(((this.superPhoneNumber == null)?"<null>":this.superPhoneNumber));
        sb.append(',');
        sb.append("criteriaPosnDuties");
        sb.append('=');
        sb.append(((this.criteriaPosnDuties == null)?"<null>":this.criteriaPosnDuties));
        sb.append(',');
        sb.append("phoneNumber");
        sb.append('=');
        sb.append(((this.phoneNumber == null)?"<null>":this.phoneNumber));
        sb.append(',');
        sb.append("criteriaCurrSalary");
        sb.append('=');
        sb.append(((this.criteriaCurrSalary == null)?"<null>":this.criteriaCurrSalary));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("currSalary");
        sb.append('=');
        sb.append(((this.currSalary == null)?"<null>":this.currSalary));
        sb.append(',');
        sb.append("phoneArea");
        sb.append('=');
        sb.append(((this.phoneArea == null)?"<null>":this.phoneArea));
        sb.append(',');
        sb.append("criteriaPhoneNumber");
        sb.append('=');
        sb.append(((this.criteriaPhoneNumber == null)?"<null>":this.criteriaPhoneNumber));
        sb.append(',');
        sb.append("posnDuties");
        sb.append('=');
        sb.append(((this.posnDuties == null)?"<null>":this.posnDuties));
        sb.append(',');
        sb.append("emprName");
        sb.append('=');
        sb.append(((this.emprName == null)?"<null>":this.emprName));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
        sb.append(',');
        sb.append("criteriaEmprName");
        sb.append('=');
        sb.append(((this.criteriaEmprName == null)?"<null>":this.criteriaEmprName));
        sb.append(',');
        sb.append("criteriaHireactStartDate");
        sb.append('=');
        sb.append(((this.criteriaHireactStartDate == null)?"<null>":this.criteriaHireactStartDate));
        sb.append(',');
        sb.append("criteriaSuperComment");
        sb.append('=');
        sb.append(((this.criteriaSuperComment == null)?"<null>":this.criteriaSuperComment));
        sb.append(',');
        sb.append("contactInd");
        sb.append('=');
        sb.append(((this.contactInd == null)?"<null>":this.contactInd));
        sb.append(',');
        sb.append("criteriaPhoneArea");
        sb.append('=');
        sb.append(((this.criteriaPhoneArea == null)?"<null>":this.criteriaPhoneArea));
        sb.append(',');
        sb.append("ctryCodePhone");
        sb.append('=');
        sb.append(((this.ctryCodePhone == null)?"<null>":this.ctryCodePhone));
        sb.append(',');
        sb.append("criteriaSuperPhoneNumber");
        sb.append('=');
        sb.append(((this.criteriaSuperPhoneNumber == null)?"<null>":this.criteriaSuperPhoneNumber));
        sb.append(',');
        sb.append("criteriaSuperName");
        sb.append('=');
        sb.append(((this.criteriaSuperName == null)?"<null>":this.criteriaSuperName));
        sb.append(',');
        sb.append("criteriaNatnCode");
        sb.append('=');
        sb.append(((this.criteriaNatnCode == null)?"<null>":this.criteriaNatnCode));
        sb.append(',');
        sb.append("criteriaSuperPhoneArea");
        sb.append('=');
        sb.append(((this.criteriaSuperPhoneArea == null)?"<null>":this.criteriaSuperPhoneArea));
        sb.append(',');
        sb.append("posnTitle");
        sb.append('=');
        sb.append(((this.posnTitle == null)?"<null>":this.posnTitle));
        sb.append(',');
        sb.append("criteriaComment");
        sb.append('=');
        sb.append(((this.criteriaComment == null)?"<null>":this.criteriaComment));
        sb.append(',');
        sb.append("empsSupervise");
        sb.append('=');
        sb.append(((this.empsSupervise == null)?"<null>":this.empsSupervise));
        sb.append(',');
        sb.append("superPhoneArea");
        sb.append('=');
        sb.append(((this.superPhoneArea == null)?"<null>":this.superPhoneArea));
        sb.append(',');
        sb.append("criteriaContactInd");
        sb.append('=');
        sb.append(((this.criteriaContactInd == null)?"<null>":this.criteriaContactInd));
        sb.append(',');
        sb.append("phoneExt");
        sb.append('=');
        sb.append(((this.phoneExt == null)?"<null>":this.phoneExt));
        sb.append(',');
        sb.append("statCode");
        sb.append('=');
        sb.append(((this.statCode == null)?"<null>":this.statCode));
        sb.append(',');
        sb.append("natnCode");
        sb.append('=');
        sb.append(((this.natnCode == null)?"<null>":this.natnCode));
        sb.append(',');
        sb.append("reasonLeft");
        sb.append('=');
        sb.append(((this.reasonLeft == null)?"<null>":this.reasonLeft));
        sb.append(',');
        sb.append("criteriaPosnTitle");
        sb.append('=');
        sb.append(((this.criteriaPosnTitle == null)?"<null>":this.criteriaPosnTitle));
        sb.append(',');
        sb.append("currHourly");
        sb.append('=');
        sb.append(((this.currHourly == null)?"<null>":this.currHourly));
        sb.append(',');
        sb.append("criteriaName");
        sb.append('=');
        sb.append(((this.criteriaName == null)?"<null>":this.criteriaName));
        sb.append(',');
        sb.append("criteriaStatCode");
        sb.append('=');
        sb.append(((this.criteriaStatCode == null)?"<null>":this.criteriaStatCode));
        sb.append(',');
        sb.append("criteriaCurrHourly");
        sb.append('=');
        sb.append(((this.criteriaCurrHourly == null)?"<null>":this.criteriaCurrHourly));
        sb.append(',');
        sb.append("criteriaReasonLeft");
        sb.append('=');
        sb.append(((this.criteriaReasonLeft == null)?"<null>":this.criteriaReasonLeft));
        sb.append(',');
        sb.append("superPhoneExt");
        sb.append('=');
        sb.append(((this.superPhoneExt == null)?"<null>":this.superPhoneExt));
        sb.append(',');
        sb.append("criteriaEmtyDesc");
        sb.append('=');
        sb.append(((this.criteriaEmtyDesc == null)?"<null>":this.criteriaEmtyDesc));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("superComment");
        sb.append('=');
        sb.append(((this.superComment == null)?"<null>":this.superComment));
        sb.append(',');
        sb.append("criteriaEmpsSupervise");
        sb.append('=');
        sb.append(((this.criteriaEmpsSupervise == null)?"<null>":this.criteriaEmpsSupervise));
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
        result = ((result* 31)+((this.superName == null)? 0 :this.superName.hashCode()));
        result = ((result* 31)+((this.criteriaCtryCodeSuperPhone == null)? 0 :this.criteriaCtryCodeSuperPhone.hashCode()));
        result = ((result* 31)+((this.criteriaStartDate == null)? 0 :this.criteriaStartDate.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.criteriaSuperPhoneArea == null)? 0 :this.criteriaSuperPhoneArea.hashCode()));
        result = ((result* 31)+((this.criteriaHireActVerifRecInd == null)? 0 :this.criteriaHireActVerifRecInd.hashCode()));
        result = ((result* 31)+((this.hireActVerifRecInd == null)? 0 :this.hireActVerifRecInd.hashCode()));
        result = ((result* 31)+((this.criteriaComment == null)? 0 :this.criteriaComment.hashCode()));
        result = ((result* 31)+((this.criteriaContactInd == null)? 0 :this.criteriaContactInd.hashCode()));
        result = ((result* 31)+((this.hireactStartDate == null)? 0 :this.hireactStartDate.hashCode()));
        result = ((result* 31)+((this.ctryCodeSuperPhone == null)? 0 :this.ctryCodeSuperPhone.hashCode()));
        result = ((result* 31)+((this.criteriaNatnCode == null)? 0 :this.criteriaNatnCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.criteriaSuperPhoneNumber == null)? 0 :this.criteriaSuperPhoneNumber.hashCode()));
        result = ((result* 31)+((this.emtyCode == null)? 0 :this.emtyCode.hashCode()));
        result = ((result* 31)+((this.criteriaReasonLeft == null)? 0 :this.criteriaReasonLeft.hashCode()));
        result = ((result* 31)+((this.criteriaCurrHourly == null)? 0 :this.criteriaCurrHourly.hashCode()));
        result = ((result* 31)+((this.criteriaSuperName == null)? 0 :this.criteriaSuperName.hashCode()));
        result = ((result* 31)+((this.criteriaStatCode == null)? 0 :this.criteriaStatCode.hashCode()));
        result = ((result* 31)+((this.superPhoneNumber == null)? 0 :this.superPhoneNumber.hashCode()));
        result = ((result* 31)+((this.criteriaPhoneExt == null)? 0 :this.criteriaPhoneExt.hashCode()));
        result = ((result* 31)+((this.criteriaCtryCodePhone == null)? 0 :this.criteriaCtryCodePhone.hashCode()));
        result = ((result* 31)+((this.phoneNumber == null)? 0 :this.phoneNumber.hashCode()));
        result = ((result* 31)+((this.criteriaPosnTitle == null)? 0 :this.criteriaPosnTitle.hashCode()));
        result = ((result* 31)+((this.criteriaPhoneNumber == null)? 0 :this.criteriaPhoneNumber.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.criteriaName == null)? 0 :this.criteriaName.hashCode()));
        result = ((result* 31)+((this.currSalary == null)? 0 :this.currSalary.hashCode()));
        result = ((result* 31)+((this.phoneArea == null)? 0 :this.phoneArea.hashCode()));
        result = ((result* 31)+((this.criteriaEmtyDesc == null)? 0 :this.criteriaEmtyDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.posnDuties == null)? 0 :this.posnDuties.hashCode()));
        result = ((result* 31)+((this.emprName == null)? 0 :this.emprName.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        result = ((result* 31)+((this.criteriaSuperPhoneExt == null)? 0 :this.criteriaSuperPhoneExt.hashCode()));
        result = ((result* 31)+((this.contactInd == null)? 0 :this.contactInd.hashCode()));
        result = ((result* 31)+((this.ctryCodePhone == null)? 0 :this.ctryCodePhone.hashCode()));
        result = ((result* 31)+((this.criteriaEmpsSupervise == null)? 0 :this.criteriaEmpsSupervise.hashCode()));
        result = ((result* 31)+((this.criteriaEmtyCode == null)? 0 :this.criteriaEmtyCode.hashCode()));
        result = ((result* 31)+((this.criteriaPhoneArea == null)? 0 :this.criteriaPhoneArea.hashCode()));
        result = ((result* 31)+((this.criteriaEndDate == null)? 0 :this.criteriaEndDate.hashCode()));
        result = ((result* 31)+((this.posnTitle == null)? 0 :this.posnTitle.hashCode()));
        result = ((result* 31)+((this.empsSupervise == null)? 0 :this.empsSupervise.hashCode()));
        result = ((result* 31)+((this.superPhoneArea == null)? 0 :this.superPhoneArea.hashCode()));
        result = ((result* 31)+((this.phoneExt == null)? 0 :this.phoneExt.hashCode()));
        result = ((result* 31)+((this.statCode == null)? 0 :this.statCode.hashCode()));
        result = ((result* 31)+((this.natnCode == null)? 0 :this.natnCode.hashCode()));
        result = ((result* 31)+((this.criteriaSuperComment == null)? 0 :this.criteriaSuperComment.hashCode()));
        result = ((result* 31)+((this.reasonLeft == null)? 0 :this.reasonLeft.hashCode()));
        result = ((result* 31)+((this.criteriaEmprName == null)? 0 :this.criteriaEmprName.hashCode()));
        result = ((result* 31)+((this.currHourly == null)? 0 :this.currHourly.hashCode()));
        result = ((result* 31)+((this.superPhoneExt == null)? 0 :this.superPhoneExt.hashCode()));
        result = ((result* 31)+((this.criteriaHireactStartDate == null)? 0 :this.criteriaHireactStartDate.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.superComment == null)? 0 :this.superComment.hashCode()));
        result = ((result* 31)+((this.criteriaPosnDuties == null)? 0 :this.criteriaPosnDuties.hashCode()));
        result = ((result* 31)+((this.criteriaCurrSalary == null)? 0 :this.criteriaCurrSalary.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PersonExperience100PutRequest) == false) {
            return false;
        }
        PersonExperience100PutRequest rhs = ((PersonExperience100PutRequest) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.superName == rhs.superName)||((this.superName!= null)&&this.superName.equals(rhs.superName)))&&((this.criteriaCtryCodeSuperPhone == rhs.criteriaCtryCodeSuperPhone)||((this.criteriaCtryCodeSuperPhone!= null)&&this.criteriaCtryCodeSuperPhone.equals(rhs.criteriaCtryCodeSuperPhone))))&&((this.criteriaStartDate == rhs.criteriaStartDate)||((this.criteriaStartDate!= null)&&this.criteriaStartDate.equals(rhs.criteriaStartDate))))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.criteriaSuperPhoneArea == rhs.criteriaSuperPhoneArea)||((this.criteriaSuperPhoneArea!= null)&&this.criteriaSuperPhoneArea.equals(rhs.criteriaSuperPhoneArea))))&&((this.criteriaHireActVerifRecInd == rhs.criteriaHireActVerifRecInd)||((this.criteriaHireActVerifRecInd!= null)&&this.criteriaHireActVerifRecInd.equals(rhs.criteriaHireActVerifRecInd))))&&((this.hireActVerifRecInd == rhs.hireActVerifRecInd)||((this.hireActVerifRecInd!= null)&&this.hireActVerifRecInd.equals(rhs.hireActVerifRecInd))))&&((this.criteriaComment == rhs.criteriaComment)||((this.criteriaComment!= null)&&this.criteriaComment.equals(rhs.criteriaComment))))&&((this.criteriaContactInd == rhs.criteriaContactInd)||((this.criteriaContactInd!= null)&&this.criteriaContactInd.equals(rhs.criteriaContactInd))))&&((this.hireactStartDate == rhs.hireactStartDate)||((this.hireactStartDate!= null)&&this.hireactStartDate.equals(rhs.hireactStartDate))))&&((this.ctryCodeSuperPhone == rhs.ctryCodeSuperPhone)||((this.ctryCodeSuperPhone!= null)&&this.ctryCodeSuperPhone.equals(rhs.ctryCodeSuperPhone))))&&((this.criteriaNatnCode == rhs.criteriaNatnCode)||((this.criteriaNatnCode!= null)&&this.criteriaNatnCode.equals(rhs.criteriaNatnCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.criteriaSuperPhoneNumber == rhs.criteriaSuperPhoneNumber)||((this.criteriaSuperPhoneNumber!= null)&&this.criteriaSuperPhoneNumber.equals(rhs.criteriaSuperPhoneNumber))))&&((this.emtyCode == rhs.emtyCode)||((this.emtyCode!= null)&&this.emtyCode.equals(rhs.emtyCode))))&&((this.criteriaReasonLeft == rhs.criteriaReasonLeft)||((this.criteriaReasonLeft!= null)&&this.criteriaReasonLeft.equals(rhs.criteriaReasonLeft))))&&((this.criteriaCurrHourly == rhs.criteriaCurrHourly)||((this.criteriaCurrHourly!= null)&&this.criteriaCurrHourly.equals(rhs.criteriaCurrHourly))))&&((this.criteriaSuperName == rhs.criteriaSuperName)||((this.criteriaSuperName!= null)&&this.criteriaSuperName.equals(rhs.criteriaSuperName))))&&((this.criteriaStatCode == rhs.criteriaStatCode)||((this.criteriaStatCode!= null)&&this.criteriaStatCode.equals(rhs.criteriaStatCode))))&&((this.superPhoneNumber == rhs.superPhoneNumber)||((this.superPhoneNumber!= null)&&this.superPhoneNumber.equals(rhs.superPhoneNumber))))&&((this.criteriaPhoneExt == rhs.criteriaPhoneExt)||((this.criteriaPhoneExt!= null)&&this.criteriaPhoneExt.equals(rhs.criteriaPhoneExt))))&&((this.criteriaCtryCodePhone == rhs.criteriaCtryCodePhone)||((this.criteriaCtryCodePhone!= null)&&this.criteriaCtryCodePhone.equals(rhs.criteriaCtryCodePhone))))&&((this.phoneNumber == rhs.phoneNumber)||((this.phoneNumber!= null)&&this.phoneNumber.equals(rhs.phoneNumber))))&&((this.criteriaPosnTitle == rhs.criteriaPosnTitle)||((this.criteriaPosnTitle!= null)&&this.criteriaPosnTitle.equals(rhs.criteriaPosnTitle))))&&((this.criteriaPhoneNumber == rhs.criteriaPhoneNumber)||((this.criteriaPhoneNumber!= null)&&this.criteriaPhoneNumber.equals(rhs.criteriaPhoneNumber))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.criteriaName == rhs.criteriaName)||((this.criteriaName!= null)&&this.criteriaName.equals(rhs.criteriaName))))&&((this.currSalary == rhs.currSalary)||((this.currSalary!= null)&&this.currSalary.equals(rhs.currSalary))))&&((this.phoneArea == rhs.phoneArea)||((this.phoneArea!= null)&&this.phoneArea.equals(rhs.phoneArea))))&&((this.criteriaEmtyDesc == rhs.criteriaEmtyDesc)||((this.criteriaEmtyDesc!= null)&&this.criteriaEmtyDesc.equals(rhs.criteriaEmtyDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.posnDuties == rhs.posnDuties)||((this.posnDuties!= null)&&this.posnDuties.equals(rhs.posnDuties))))&&((this.emprName == rhs.emprName)||((this.emprName!= null)&&this.emprName.equals(rhs.emprName))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))))&&((this.criteriaSuperPhoneExt == rhs.criteriaSuperPhoneExt)||((this.criteriaSuperPhoneExt!= null)&&this.criteriaSuperPhoneExt.equals(rhs.criteriaSuperPhoneExt))))&&((this.contactInd == rhs.contactInd)||((this.contactInd!= null)&&this.contactInd.equals(rhs.contactInd))))&&((this.ctryCodePhone == rhs.ctryCodePhone)||((this.ctryCodePhone!= null)&&this.ctryCodePhone.equals(rhs.ctryCodePhone))))&&((this.criteriaEmpsSupervise == rhs.criteriaEmpsSupervise)||((this.criteriaEmpsSupervise!= null)&&this.criteriaEmpsSupervise.equals(rhs.criteriaEmpsSupervise))))&&((this.criteriaEmtyCode == rhs.criteriaEmtyCode)||((this.criteriaEmtyCode!= null)&&this.criteriaEmtyCode.equals(rhs.criteriaEmtyCode))))&&((this.criteriaPhoneArea == rhs.criteriaPhoneArea)||((this.criteriaPhoneArea!= null)&&this.criteriaPhoneArea.equals(rhs.criteriaPhoneArea))))&&((this.criteriaEndDate == rhs.criteriaEndDate)||((this.criteriaEndDate!= null)&&this.criteriaEndDate.equals(rhs.criteriaEndDate))))&&((this.posnTitle == rhs.posnTitle)||((this.posnTitle!= null)&&this.posnTitle.equals(rhs.posnTitle))))&&((this.empsSupervise == rhs.empsSupervise)||((this.empsSupervise!= null)&&this.empsSupervise.equals(rhs.empsSupervise))))&&((this.superPhoneArea == rhs.superPhoneArea)||((this.superPhoneArea!= null)&&this.superPhoneArea.equals(rhs.superPhoneArea))))&&((this.phoneExt == rhs.phoneExt)||((this.phoneExt!= null)&&this.phoneExt.equals(rhs.phoneExt))))&&((this.statCode == rhs.statCode)||((this.statCode!= null)&&this.statCode.equals(rhs.statCode))))&&((this.natnCode == rhs.natnCode)||((this.natnCode!= null)&&this.natnCode.equals(rhs.natnCode))))&&((this.criteriaSuperComment == rhs.criteriaSuperComment)||((this.criteriaSuperComment!= null)&&this.criteriaSuperComment.equals(rhs.criteriaSuperComment))))&&((this.reasonLeft == rhs.reasonLeft)||((this.reasonLeft!= null)&&this.reasonLeft.equals(rhs.reasonLeft))))&&((this.criteriaEmprName == rhs.criteriaEmprName)||((this.criteriaEmprName!= null)&&this.criteriaEmprName.equals(rhs.criteriaEmprName))))&&((this.currHourly == rhs.currHourly)||((this.currHourly!= null)&&this.currHourly.equals(rhs.currHourly))))&&((this.superPhoneExt == rhs.superPhoneExt)||((this.superPhoneExt!= null)&&this.superPhoneExt.equals(rhs.superPhoneExt))))&&((this.criteriaHireactStartDate == rhs.criteriaHireactStartDate)||((this.criteriaHireactStartDate!= null)&&this.criteriaHireactStartDate.equals(rhs.criteriaHireactStartDate))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.superComment == rhs.superComment)||((this.superComment!= null)&&this.superComment.equals(rhs.superComment))))&&((this.criteriaPosnDuties == rhs.criteriaPosnDuties)||((this.criteriaPosnDuties!= null)&&this.criteriaPosnDuties.equals(rhs.criteriaPosnDuties))))&&((this.criteriaCurrSalary == rhs.criteriaCurrSalary)||((this.criteriaCurrSalary!= null)&&this.criteriaCurrSalary.equals(rhs.criteriaCurrSalary))));
    }

}
