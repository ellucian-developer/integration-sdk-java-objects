
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
    "superName",
    "endDate",
    "hireActVerifRecInd",
    "contactInd",
    "hireactStartDate",
    "ctryCodePhone",
    "ctryCodeSuperPhone",
    "id",
    "posnTitle",
    "empsSupervise",
    "superPhoneArea",
    "phoneExt",
    "statCode",
    "emtyCode",
    "natnCode",
    "reasonLeft",
    "currHourly",
    "superPhoneNumber",
    "phoneNumber",
    "superPhoneExt",
    "name",
    "currSalary",
    "phoneArea",
    "comment",
    "posnDuties",
    "superComment",
    "emprName",
    "startDate"
})
@Generated("jsonschema2pojo")
public class PersonExperience100PostRequest {

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
     * Hire Act Verification Received
     * <p>
     * Lineage reference object : PPREXPE_HIRE_ACT_VERIF_REC_IND
     * 
     */
    @JsonProperty("hireActVerifRecInd")
    @JsonPropertyDescription("Lineage reference object : PPREXPE_HIRE_ACT_VERIF_REC_IND")
    private String hireActVerifRecInd;
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
     * Lineage reference object : PPRREFE_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("ctryCodePhone")
    @JsonPropertyDescription("Lineage reference object : PPRREFE_CTRY_CODE_PHONE")
    private String ctryCodePhone;
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
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private String id;
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
     * Employer Experience Type
     * <p>
     * Lineage reference object : PPREXPE_EMTY_CODE, Lookup lineage reference object : ptremty
     * 
     */
    @JsonProperty("emtyCode")
    @JsonPropertyDescription("Lineage reference object : PPREXPE_EMTY_CODE, Lookup lineage reference object : ptremty")
    private String emtyCode;
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
     * Current or Ending Rate
     * <p>
     * Lineage reference object : PPREXPE_CURR_HOURLY
     * 
     */
    @JsonProperty("currHourly")
    @JsonPropertyDescription("Lineage reference object : PPREXPE_CURR_HOURLY")
    private Double currHourly;
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
     * Phone Number
     * <p>
     * Lineage reference object : PPRREFE_PHONE_NUMBER
     * 
     */
    @JsonProperty("phoneNumber")
    @JsonPropertyDescription("Lineage reference object : PPRREFE_PHONE_NUMBER")
    private String phoneNumber;
    /**
     * Extension
     * <p>
     * Lineage reference object : PPREXPE_SUPER_PHONE_EXT
     * 
     */
    @JsonProperty("superPhoneExt")
    @JsonPropertyDescription("Lineage reference object : PPREXPE_SUPER_PHONE_EXT")
    private String superPhoneExt;
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
     * Comment
     * <p>
     * Lineage reference object : PPRREFE_COMMENT
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("Lineage reference object : PPRREFE_COMMENT")
    private String comment;
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
     * Comments
     * <p>
     * Lineage reference object : PPREXPE_SUPER_COMMENT
     * 
     */
    @JsonProperty("superComment")
    @JsonPropertyDescription("Lineage reference object : PPREXPE_SUPER_COMMENT")
    private String superComment;
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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public PersonExperience100PostRequest withSuperName(String superName) {
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

    public PersonExperience100PostRequest withEndDate(Date endDate) {
        this.endDate = endDate;
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

    public PersonExperience100PostRequest withHireActVerifRecInd(String hireActVerifRecInd) {
        this.hireActVerifRecInd = hireActVerifRecInd;
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

    public PersonExperience100PostRequest withContactInd(String contactInd) {
        this.contactInd = contactInd;
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

    public PersonExperience100PostRequest withHireactStartDate(Date hireactStartDate) {
        this.hireactStartDate = hireactStartDate;
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

    public PersonExperience100PostRequest withCtryCodePhone(String ctryCodePhone) {
        this.ctryCodePhone = ctryCodePhone;
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

    public PersonExperience100PostRequest withCtryCodeSuperPhone(String ctryCodeSuperPhone) {
        this.ctryCodeSuperPhone = ctryCodeSuperPhone;
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

    public PersonExperience100PostRequest withId(String id) {
        this.id = id;
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

    public PersonExperience100PostRequest withPosnTitle(String posnTitle) {
        this.posnTitle = posnTitle;
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

    public PersonExperience100PostRequest withEmpsSupervise(Double empsSupervise) {
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

    public PersonExperience100PostRequest withSuperPhoneArea(String superPhoneArea) {
        this.superPhoneArea = superPhoneArea;
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

    public PersonExperience100PostRequest withPhoneExt(String phoneExt) {
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

    public PersonExperience100PostRequest withStatCode(String statCode) {
        this.statCode = statCode;
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

    public PersonExperience100PostRequest withEmtyCode(String emtyCode) {
        this.emtyCode = emtyCode;
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

    public PersonExperience100PostRequest withNatnCode(String natnCode) {
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

    public PersonExperience100PostRequest withReasonLeft(String reasonLeft) {
        this.reasonLeft = reasonLeft;
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

    public PersonExperience100PostRequest withCurrHourly(Double currHourly) {
        this.currHourly = currHourly;
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

    public PersonExperience100PostRequest withSuperPhoneNumber(String superPhoneNumber) {
        this.superPhoneNumber = superPhoneNumber;
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

    public PersonExperience100PostRequest withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    public PersonExperience100PostRequest withSuperPhoneExt(String superPhoneExt) {
        this.superPhoneExt = superPhoneExt;
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

    public PersonExperience100PostRequest withName(String name) {
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

    public PersonExperience100PostRequest withCurrSalary(Double currSalary) {
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

    public PersonExperience100PostRequest withPhoneArea(String phoneArea) {
        this.phoneArea = phoneArea;
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

    public PersonExperience100PostRequest withComment(String comment) {
        this.comment = comment;
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

    public PersonExperience100PostRequest withPosnDuties(String posnDuties) {
        this.posnDuties = posnDuties;
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

    public PersonExperience100PostRequest withSuperComment(String superComment) {
        this.superComment = superComment;
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

    public PersonExperience100PostRequest withEmprName(String emprName) {
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

    public PersonExperience100PostRequest withStartDate(Date startDate) {
        this.startDate = startDate;
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

    public PersonExperience100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PersonExperience100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("superName");
        sb.append('=');
        sb.append(((this.superName == null)?"<null>":this.superName));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("hireActVerifRecInd");
        sb.append('=');
        sb.append(((this.hireActVerifRecInd == null)?"<null>":this.hireActVerifRecInd));
        sb.append(',');
        sb.append("contactInd");
        sb.append('=');
        sb.append(((this.contactInd == null)?"<null>":this.contactInd));
        sb.append(',');
        sb.append("hireactStartDate");
        sb.append('=');
        sb.append(((this.hireactStartDate == null)?"<null>":this.hireactStartDate));
        sb.append(',');
        sb.append("ctryCodePhone");
        sb.append('=');
        sb.append(((this.ctryCodePhone == null)?"<null>":this.ctryCodePhone));
        sb.append(',');
        sb.append("ctryCodeSuperPhone");
        sb.append('=');
        sb.append(((this.ctryCodeSuperPhone == null)?"<null>":this.ctryCodeSuperPhone));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("posnTitle");
        sb.append('=');
        sb.append(((this.posnTitle == null)?"<null>":this.posnTitle));
        sb.append(',');
        sb.append("empsSupervise");
        sb.append('=');
        sb.append(((this.empsSupervise == null)?"<null>":this.empsSupervise));
        sb.append(',');
        sb.append("superPhoneArea");
        sb.append('=');
        sb.append(((this.superPhoneArea == null)?"<null>":this.superPhoneArea));
        sb.append(',');
        sb.append("phoneExt");
        sb.append('=');
        sb.append(((this.phoneExt == null)?"<null>":this.phoneExt));
        sb.append(',');
        sb.append("statCode");
        sb.append('=');
        sb.append(((this.statCode == null)?"<null>":this.statCode));
        sb.append(',');
        sb.append("emtyCode");
        sb.append('=');
        sb.append(((this.emtyCode == null)?"<null>":this.emtyCode));
        sb.append(',');
        sb.append("natnCode");
        sb.append('=');
        sb.append(((this.natnCode == null)?"<null>":this.natnCode));
        sb.append(',');
        sb.append("reasonLeft");
        sb.append('=');
        sb.append(((this.reasonLeft == null)?"<null>":this.reasonLeft));
        sb.append(',');
        sb.append("currHourly");
        sb.append('=');
        sb.append(((this.currHourly == null)?"<null>":this.currHourly));
        sb.append(',');
        sb.append("superPhoneNumber");
        sb.append('=');
        sb.append(((this.superPhoneNumber == null)?"<null>":this.superPhoneNumber));
        sb.append(',');
        sb.append("phoneNumber");
        sb.append('=');
        sb.append(((this.phoneNumber == null)?"<null>":this.phoneNumber));
        sb.append(',');
        sb.append("superPhoneExt");
        sb.append('=');
        sb.append(((this.superPhoneExt == null)?"<null>":this.superPhoneExt));
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
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("posnDuties");
        sb.append('=');
        sb.append(((this.posnDuties == null)?"<null>":this.posnDuties));
        sb.append(',');
        sb.append("superComment");
        sb.append('=');
        sb.append(((this.superComment == null)?"<null>":this.superComment));
        sb.append(',');
        sb.append("emprName");
        sb.append('=');
        sb.append(((this.emprName == null)?"<null>":this.emprName));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
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
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.hireActVerifRecInd == null)? 0 :this.hireActVerifRecInd.hashCode()));
        result = ((result* 31)+((this.contactInd == null)? 0 :this.contactInd.hashCode()));
        result = ((result* 31)+((this.hireactStartDate == null)? 0 :this.hireactStartDate.hashCode()));
        result = ((result* 31)+((this.ctryCodePhone == null)? 0 :this.ctryCodePhone.hashCode()));
        result = ((result* 31)+((this.ctryCodeSuperPhone == null)? 0 :this.ctryCodeSuperPhone.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.posnTitle == null)? 0 :this.posnTitle.hashCode()));
        result = ((result* 31)+((this.empsSupervise == null)? 0 :this.empsSupervise.hashCode()));
        result = ((result* 31)+((this.superPhoneArea == null)? 0 :this.superPhoneArea.hashCode()));
        result = ((result* 31)+((this.phoneExt == null)? 0 :this.phoneExt.hashCode()));
        result = ((result* 31)+((this.statCode == null)? 0 :this.statCode.hashCode()));
        result = ((result* 31)+((this.emtyCode == null)? 0 :this.emtyCode.hashCode()));
        result = ((result* 31)+((this.natnCode == null)? 0 :this.natnCode.hashCode()));
        result = ((result* 31)+((this.reasonLeft == null)? 0 :this.reasonLeft.hashCode()));
        result = ((result* 31)+((this.currHourly == null)? 0 :this.currHourly.hashCode()));
        result = ((result* 31)+((this.superPhoneNumber == null)? 0 :this.superPhoneNumber.hashCode()));
        result = ((result* 31)+((this.phoneNumber == null)? 0 :this.phoneNumber.hashCode()));
        result = ((result* 31)+((this.superPhoneExt == null)? 0 :this.superPhoneExt.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.currSalary == null)? 0 :this.currSalary.hashCode()));
        result = ((result* 31)+((this.phoneArea == null)? 0 :this.phoneArea.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.posnDuties == null)? 0 :this.posnDuties.hashCode()));
        result = ((result* 31)+((this.superComment == null)? 0 :this.superComment.hashCode()));
        result = ((result* 31)+((this.emprName == null)? 0 :this.emprName.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PersonExperience100PostRequest) == false) {
            return false;
        }
        PersonExperience100PostRequest rhs = ((PersonExperience100PostRequest) other);
        return ((((((((((((((((((((((((((((((this.superName == rhs.superName)||((this.superName!= null)&&this.superName.equals(rhs.superName)))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.hireActVerifRecInd == rhs.hireActVerifRecInd)||((this.hireActVerifRecInd!= null)&&this.hireActVerifRecInd.equals(rhs.hireActVerifRecInd))))&&((this.contactInd == rhs.contactInd)||((this.contactInd!= null)&&this.contactInd.equals(rhs.contactInd))))&&((this.hireactStartDate == rhs.hireactStartDate)||((this.hireactStartDate!= null)&&this.hireactStartDate.equals(rhs.hireactStartDate))))&&((this.ctryCodePhone == rhs.ctryCodePhone)||((this.ctryCodePhone!= null)&&this.ctryCodePhone.equals(rhs.ctryCodePhone))))&&((this.ctryCodeSuperPhone == rhs.ctryCodeSuperPhone)||((this.ctryCodeSuperPhone!= null)&&this.ctryCodeSuperPhone.equals(rhs.ctryCodeSuperPhone))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.posnTitle == rhs.posnTitle)||((this.posnTitle!= null)&&this.posnTitle.equals(rhs.posnTitle))))&&((this.empsSupervise == rhs.empsSupervise)||((this.empsSupervise!= null)&&this.empsSupervise.equals(rhs.empsSupervise))))&&((this.superPhoneArea == rhs.superPhoneArea)||((this.superPhoneArea!= null)&&this.superPhoneArea.equals(rhs.superPhoneArea))))&&((this.phoneExt == rhs.phoneExt)||((this.phoneExt!= null)&&this.phoneExt.equals(rhs.phoneExt))))&&((this.statCode == rhs.statCode)||((this.statCode!= null)&&this.statCode.equals(rhs.statCode))))&&((this.emtyCode == rhs.emtyCode)||((this.emtyCode!= null)&&this.emtyCode.equals(rhs.emtyCode))))&&((this.natnCode == rhs.natnCode)||((this.natnCode!= null)&&this.natnCode.equals(rhs.natnCode))))&&((this.reasonLeft == rhs.reasonLeft)||((this.reasonLeft!= null)&&this.reasonLeft.equals(rhs.reasonLeft))))&&((this.currHourly == rhs.currHourly)||((this.currHourly!= null)&&this.currHourly.equals(rhs.currHourly))))&&((this.superPhoneNumber == rhs.superPhoneNumber)||((this.superPhoneNumber!= null)&&this.superPhoneNumber.equals(rhs.superPhoneNumber))))&&((this.phoneNumber == rhs.phoneNumber)||((this.phoneNumber!= null)&&this.phoneNumber.equals(rhs.phoneNumber))))&&((this.superPhoneExt == rhs.superPhoneExt)||((this.superPhoneExt!= null)&&this.superPhoneExt.equals(rhs.superPhoneExt))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.currSalary == rhs.currSalary)||((this.currSalary!= null)&&this.currSalary.equals(rhs.currSalary))))&&((this.phoneArea == rhs.phoneArea)||((this.phoneArea!= null)&&this.phoneArea.equals(rhs.phoneArea))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.posnDuties == rhs.posnDuties)||((this.posnDuties!= null)&&this.posnDuties.equals(rhs.posnDuties))))&&((this.superComment == rhs.superComment)||((this.superComment!= null)&&this.superComment.equals(rhs.superComment))))&&((this.emprName == rhs.emprName)||((this.emprName!= null)&&this.emprName.equals(rhs.emprName))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))));
    }

}
