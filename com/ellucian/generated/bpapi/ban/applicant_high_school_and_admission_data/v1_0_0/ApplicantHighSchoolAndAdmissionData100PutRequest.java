
package com.ellucian.generated.bpapi.ban.applicant_high_school_and_admission_data.v1_0_0;

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
    "reqCourses",
    "testCode",
    "testAdmin",
    "hsGrad",
    "eligibility",
    "stateCode",
    "id",
    "placementCourses",
    "gradDate",
    "compDate",
    "stateRecon"
})
@Generated("jsonschema2pojo")
public class ApplicantHighSchoolAndAdmissionData100PutRequest {

    /**
     * Required Courses Similar to State Scholars Initiative
     * <p>
     * Lineage reference object : RORHSDT_REQ_COURSES
     * (Required)
     * 
     */
    @JsonProperty("reqCourses")
    @JsonPropertyDescription("Lineage reference object : RORHSDT_REQ_COURSES")
    private String reqCourses;
    /**
     * Test Code
     * <p>
     * Lineage reference object : RORHSDT_ATBT_COD_TEST_CDE
     * 
     */
    @JsonProperty("testCode")
    @JsonPropertyDescription("Lineage reference object : RORHSDT_ATBT_COD_TEST_CDE")
    private String testCode;
    /**
     * Test Administrator Code
     * <p>
     * Lineage reference object : RORHSDT_TADM_COD_CDE
     * 
     */
    @JsonProperty("testAdmin")
    @JsonPropertyDescription("Lineage reference object : RORHSDT_TADM_COD_CDE")
    private String testAdmin;
    /**
     * State of Student's High School Graduation
     * <p>
     * Lineage reference object : RORHSDT_HS_GRAD_STATE_CODE
     * 
     */
    @JsonProperty("hsGrad")
    @JsonPropertyDescription("Lineage reference object : RORHSDT_HS_GRAD_STATE_CODE")
    private String hsGrad;
    /**
     * Eligibility Code
     * <p>
     * Lineage reference object : RORHSDT_ATBT_COD_CDE
     * 
     */
    @JsonProperty("eligibility")
    @JsonPropertyDescription("Lineage reference object : RORHSDT_ATBT_COD_CDE")
    private String eligibility;
    /**
     * State Code
     * <p>
     * Lineage reference object : RORHSDT_ATBT_CDST_CDE
     * 
     */
    @JsonProperty("stateCode")
    @JsonPropertyDescription("Lineage reference object : RORHSDT_ATBT_CDST_CDE")
    private String stateCode;
    /**
     * ID
     * <p>
     * Lineage reference object : keyblckId
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : keyblckId")
    private Object id;
    /**
     * Advanced Placement/International Baccalaureate Courses
     * <p>
     * Lineage reference object : RORHSDT_AP_IB_COURSES
     * (Required)
     * 
     */
    @JsonProperty("placementCourses")
    @JsonPropertyDescription("Lineage reference object : RORHSDT_AP_IB_COURSES")
    private String placementCourses;
    /**
     * Student's High School Graduation Date
     * <p>
     * Lineage reference object : RORHSDT_HS_GRAD_DATE
     * 
     */
    @JsonProperty("gradDate")
    @JsonPropertyDescription("Lineage reference object : RORHSDT_HS_GRAD_DATE")
    private Date gradDate;
    /**
     * Completion Date
     * <p>
     * Lineage reference object : RORHSDT_ATBT_COMP_DATE
     * 
     */
    @JsonProperty("compDate")
    @JsonPropertyDescription("Lineage reference object : RORHSDT_ATBT_COMP_DATE")
    private Date compDate;
    /**
     * State Recognized Program of Study
     * <p>
     * Lineage reference object : RORHSDT_ADV_HONORS_PROG_CODE
     * 
     */
    @JsonProperty("stateRecon")
    @JsonPropertyDescription("Lineage reference object : RORHSDT_ADV_HONORS_PROG_CODE")
    private String stateRecon;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Required Courses Similar to State Scholars Initiative
     * <p>
     * Lineage reference object : RORHSDT_REQ_COURSES
     * (Required)
     * 
     */
    @JsonProperty("reqCourses")
    public String getReqCourses() {
        return reqCourses;
    }

    /**
     * Required Courses Similar to State Scholars Initiative
     * <p>
     * Lineage reference object : RORHSDT_REQ_COURSES
     * (Required)
     * 
     */
    @JsonProperty("reqCourses")
    public void setReqCourses(String reqCourses) {
        this.reqCourses = reqCourses;
    }

    public ApplicantHighSchoolAndAdmissionData100PutRequest withReqCourses(String reqCourses) {
        this.reqCourses = reqCourses;
        return this;
    }

    /**
     * Test Code
     * <p>
     * Lineage reference object : RORHSDT_ATBT_COD_TEST_CDE
     * 
     */
    @JsonProperty("testCode")
    public String getTestCode() {
        return testCode;
    }

    /**
     * Test Code
     * <p>
     * Lineage reference object : RORHSDT_ATBT_COD_TEST_CDE
     * 
     */
    @JsonProperty("testCode")
    public void setTestCode(String testCode) {
        this.testCode = testCode;
    }

    public ApplicantHighSchoolAndAdmissionData100PutRequest withTestCode(String testCode) {
        this.testCode = testCode;
        return this;
    }

    /**
     * Test Administrator Code
     * <p>
     * Lineage reference object : RORHSDT_TADM_COD_CDE
     * 
     */
    @JsonProperty("testAdmin")
    public String getTestAdmin() {
        return testAdmin;
    }

    /**
     * Test Administrator Code
     * <p>
     * Lineage reference object : RORHSDT_TADM_COD_CDE
     * 
     */
    @JsonProperty("testAdmin")
    public void setTestAdmin(String testAdmin) {
        this.testAdmin = testAdmin;
    }

    public ApplicantHighSchoolAndAdmissionData100PutRequest withTestAdmin(String testAdmin) {
        this.testAdmin = testAdmin;
        return this;
    }

    /**
     * State of Student's High School Graduation
     * <p>
     * Lineage reference object : RORHSDT_HS_GRAD_STATE_CODE
     * 
     */
    @JsonProperty("hsGrad")
    public String getHsGrad() {
        return hsGrad;
    }

    /**
     * State of Student's High School Graduation
     * <p>
     * Lineage reference object : RORHSDT_HS_GRAD_STATE_CODE
     * 
     */
    @JsonProperty("hsGrad")
    public void setHsGrad(String hsGrad) {
        this.hsGrad = hsGrad;
    }

    public ApplicantHighSchoolAndAdmissionData100PutRequest withHsGrad(String hsGrad) {
        this.hsGrad = hsGrad;
        return this;
    }

    /**
     * Eligibility Code
     * <p>
     * Lineage reference object : RORHSDT_ATBT_COD_CDE
     * 
     */
    @JsonProperty("eligibility")
    public String getEligibility() {
        return eligibility;
    }

    /**
     * Eligibility Code
     * <p>
     * Lineage reference object : RORHSDT_ATBT_COD_CDE
     * 
     */
    @JsonProperty("eligibility")
    public void setEligibility(String eligibility) {
        this.eligibility = eligibility;
    }

    public ApplicantHighSchoolAndAdmissionData100PutRequest withEligibility(String eligibility) {
        this.eligibility = eligibility;
        return this;
    }

    /**
     * State Code
     * <p>
     * Lineage reference object : RORHSDT_ATBT_CDST_CDE
     * 
     */
    @JsonProperty("stateCode")
    public String getStateCode() {
        return stateCode;
    }

    /**
     * State Code
     * <p>
     * Lineage reference object : RORHSDT_ATBT_CDST_CDE
     * 
     */
    @JsonProperty("stateCode")
    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public ApplicantHighSchoolAndAdmissionData100PutRequest withStateCode(String stateCode) {
        this.stateCode = stateCode;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : keyblckId
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : keyblckId
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public ApplicantHighSchoolAndAdmissionData100PutRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Advanced Placement/International Baccalaureate Courses
     * <p>
     * Lineage reference object : RORHSDT_AP_IB_COURSES
     * (Required)
     * 
     */
    @JsonProperty("placementCourses")
    public String getPlacementCourses() {
        return placementCourses;
    }

    /**
     * Advanced Placement/International Baccalaureate Courses
     * <p>
     * Lineage reference object : RORHSDT_AP_IB_COURSES
     * (Required)
     * 
     */
    @JsonProperty("placementCourses")
    public void setPlacementCourses(String placementCourses) {
        this.placementCourses = placementCourses;
    }

    public ApplicantHighSchoolAndAdmissionData100PutRequest withPlacementCourses(String placementCourses) {
        this.placementCourses = placementCourses;
        return this;
    }

    /**
     * Student's High School Graduation Date
     * <p>
     * Lineage reference object : RORHSDT_HS_GRAD_DATE
     * 
     */
    @JsonProperty("gradDate")
    public Date getGradDate() {
        return gradDate;
    }

    /**
     * Student's High School Graduation Date
     * <p>
     * Lineage reference object : RORHSDT_HS_GRAD_DATE
     * 
     */
    @JsonProperty("gradDate")
    public void setGradDate(Date gradDate) {
        this.gradDate = gradDate;
    }

    public ApplicantHighSchoolAndAdmissionData100PutRequest withGradDate(Date gradDate) {
        this.gradDate = gradDate;
        return this;
    }

    /**
     * Completion Date
     * <p>
     * Lineage reference object : RORHSDT_ATBT_COMP_DATE
     * 
     */
    @JsonProperty("compDate")
    public Date getCompDate() {
        return compDate;
    }

    /**
     * Completion Date
     * <p>
     * Lineage reference object : RORHSDT_ATBT_COMP_DATE
     * 
     */
    @JsonProperty("compDate")
    public void setCompDate(Date compDate) {
        this.compDate = compDate;
    }

    public ApplicantHighSchoolAndAdmissionData100PutRequest withCompDate(Date compDate) {
        this.compDate = compDate;
        return this;
    }

    /**
     * State Recognized Program of Study
     * <p>
     * Lineage reference object : RORHSDT_ADV_HONORS_PROG_CODE
     * 
     */
    @JsonProperty("stateRecon")
    public String getStateRecon() {
        return stateRecon;
    }

    /**
     * State Recognized Program of Study
     * <p>
     * Lineage reference object : RORHSDT_ADV_HONORS_PROG_CODE
     * 
     */
    @JsonProperty("stateRecon")
    public void setStateRecon(String stateRecon) {
        this.stateRecon = stateRecon;
    }

    public ApplicantHighSchoolAndAdmissionData100PutRequest withStateRecon(String stateRecon) {
        this.stateRecon = stateRecon;
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

    public ApplicantHighSchoolAndAdmissionData100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApplicantHighSchoolAndAdmissionData100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("reqCourses");
        sb.append('=');
        sb.append(((this.reqCourses == null)?"<null>":this.reqCourses));
        sb.append(',');
        sb.append("testCode");
        sb.append('=');
        sb.append(((this.testCode == null)?"<null>":this.testCode));
        sb.append(',');
        sb.append("testAdmin");
        sb.append('=');
        sb.append(((this.testAdmin == null)?"<null>":this.testAdmin));
        sb.append(',');
        sb.append("hsGrad");
        sb.append('=');
        sb.append(((this.hsGrad == null)?"<null>":this.hsGrad));
        sb.append(',');
        sb.append("eligibility");
        sb.append('=');
        sb.append(((this.eligibility == null)?"<null>":this.eligibility));
        sb.append(',');
        sb.append("stateCode");
        sb.append('=');
        sb.append(((this.stateCode == null)?"<null>":this.stateCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("placementCourses");
        sb.append('=');
        sb.append(((this.placementCourses == null)?"<null>":this.placementCourses));
        sb.append(',');
        sb.append("gradDate");
        sb.append('=');
        sb.append(((this.gradDate == null)?"<null>":this.gradDate));
        sb.append(',');
        sb.append("compDate");
        sb.append('=');
        sb.append(((this.compDate == null)?"<null>":this.compDate));
        sb.append(',');
        sb.append("stateRecon");
        sb.append('=');
        sb.append(((this.stateRecon == null)?"<null>":this.stateRecon));
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
        result = ((result* 31)+((this.testCode == null)? 0 :this.testCode.hashCode()));
        result = ((result* 31)+((this.testAdmin == null)? 0 :this.testAdmin.hashCode()));
        result = ((result* 31)+((this.eligibility == null)? 0 :this.eligibility.hashCode()));
        result = ((result* 31)+((this.compDate == null)? 0 :this.compDate.hashCode()));
        result = ((result* 31)+((this.stateRecon == null)? 0 :this.stateRecon.hashCode()));
        result = ((result* 31)+((this.reqCourses == null)? 0 :this.reqCourses.hashCode()));
        result = ((result* 31)+((this.hsGrad == null)? 0 :this.hsGrad.hashCode()));
        result = ((result* 31)+((this.stateCode == null)? 0 :this.stateCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.placementCourses == null)? 0 :this.placementCourses.hashCode()));
        result = ((result* 31)+((this.gradDate == null)? 0 :this.gradDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicantHighSchoolAndAdmissionData100PutRequest) == false) {
            return false;
        }
        ApplicantHighSchoolAndAdmissionData100PutRequest rhs = ((ApplicantHighSchoolAndAdmissionData100PutRequest) other);
        return (((((((((((((this.testCode == rhs.testCode)||((this.testCode!= null)&&this.testCode.equals(rhs.testCode)))&&((this.testAdmin == rhs.testAdmin)||((this.testAdmin!= null)&&this.testAdmin.equals(rhs.testAdmin))))&&((this.eligibility == rhs.eligibility)||((this.eligibility!= null)&&this.eligibility.equals(rhs.eligibility))))&&((this.compDate == rhs.compDate)||((this.compDate!= null)&&this.compDate.equals(rhs.compDate))))&&((this.stateRecon == rhs.stateRecon)||((this.stateRecon!= null)&&this.stateRecon.equals(rhs.stateRecon))))&&((this.reqCourses == rhs.reqCourses)||((this.reqCourses!= null)&&this.reqCourses.equals(rhs.reqCourses))))&&((this.hsGrad == rhs.hsGrad)||((this.hsGrad!= null)&&this.hsGrad.equals(rhs.hsGrad))))&&((this.stateCode == rhs.stateCode)||((this.stateCode!= null)&&this.stateCode.equals(rhs.stateCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.placementCourses == rhs.placementCourses)||((this.placementCourses!= null)&&this.placementCourses.equals(rhs.placementCourses))))&&((this.gradDate == rhs.gradDate)||((this.gradDate!= null)&&this.gradDate.equals(rhs.gradDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
