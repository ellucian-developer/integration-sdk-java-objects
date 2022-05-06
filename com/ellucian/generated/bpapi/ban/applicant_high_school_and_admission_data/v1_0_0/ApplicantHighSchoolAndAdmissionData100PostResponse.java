
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
    "hsGradStateCode",
    "apIbCourses",
    "atbtCdstCde",
    "admissionTestInd",
    "atbtCodCde",
    "atbtCodTestCde",
    "reqCourses",
    "hsGradDate",
    "tadmCodCde",
    "advHonorsProgCode",
    "teachExpertInd",
    "atbtCodInd",
    "progCodeReviewed",
    "atbtCompDate"
})
@Generated("jsonschema2pojo")
public class ApplicantHighSchoolAndAdmissionData100PostResponse {

    /**
     * State of Student's High School Graduation
     * <p>
     * Lineage reference object : RORHSDT_HS_GRAD_STATE_CODE
     * 
     */
    @JsonProperty("hsGradStateCode")
    @JsonPropertyDescription("Lineage reference object : RORHSDT_HS_GRAD_STATE_CODE")
    private String hsGradStateCode;
    /**
     * Advanced Placement/International Baccalaureate Courses
     * <p>
     * Lineage reference object : RORHSDT_AP_IB_COURSES
     * (Required)
     * 
     */
    @JsonProperty("apIbCourses")
    @JsonPropertyDescription("Lineage reference object : RORHSDT_AP_IB_COURSES")
    private String apIbCourses;
    /**
     * State Code
     * <p>
     * Lineage reference object : RORHSDT_ATBT_CDST_CDE
     * 
     */
    @JsonProperty("atbtCdstCde")
    @JsonPropertyDescription("Lineage reference object : RORHSDT_ATBT_CDST_CDE")
    private String atbtCdstCde;
    /**
     * Admission Test Above 75th Percentile
     * <p>
     * Lineage reference object : RORHSDT_ADMISSION_TEST_IND
     * 
     */
    @JsonProperty("admissionTestInd")
    @JsonPropertyDescription("Lineage reference object : RORHSDT_ADMISSION_TEST_IND")
    private String admissionTestInd;
    /**
     * Eligibility Code
     * <p>
     * Lineage reference object : RORHSDT_ATBT_COD_CDE
     * 
     */
    @JsonProperty("atbtCodCde")
    @JsonPropertyDescription("Lineage reference object : RORHSDT_ATBT_COD_CDE")
    private String atbtCodCde;
    /**
     * Test Code
     * <p>
     * Lineage reference object : RORHSDT_ATBT_COD_TEST_CDE
     * 
     */
    @JsonProperty("atbtCodTestCde")
    @JsonPropertyDescription("Lineage reference object : RORHSDT_ATBT_COD_TEST_CDE")
    private String atbtCodTestCde;
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
     * Student's High School Graduation Date
     * <p>
     * Lineage reference object : RORHSDT_HS_GRAD_DATE
     * 
     */
    @JsonProperty("hsGradDate")
    @JsonPropertyDescription("Lineage reference object : RORHSDT_HS_GRAD_DATE")
    private Date hsGradDate;
    /**
     * Test Administrator Code
     * <p>
     * Lineage reference object : RORHSDT_TADM_COD_CDE
     * 
     */
    @JsonProperty("tadmCodCde")
    @JsonPropertyDescription("Lineage reference object : RORHSDT_TADM_COD_CDE")
    private String tadmCodCde;
    /**
     * State Recognized Program of Study
     * <p>
     * Lineage reference object : RORHSDT_ADV_HONORS_PROG_CODE
     * 
     */
    @JsonProperty("advHonorsProgCode")
    @JsonPropertyDescription("Lineage reference object : RORHSDT_ADV_HONORS_PROG_CODE")
    private String advHonorsProgCode;
    /**
     * Teacher Expert Indicator
     * <p>
     * Lineage reference object : RORHSDT_TEACH_EXPERT_IND
     * 
     */
    @JsonProperty("teachExpertInd")
    @JsonPropertyDescription("Lineage reference object : RORHSDT_TEACH_EXPERT_IND")
    private String teachExpertInd;
    /**
     * COD Indicator
     * <p>
     * Lineage reference object : RORHSDT_ATBT_COD_IND
     * 
     */
    @JsonProperty("atbtCodInd")
    @JsonPropertyDescription("Lineage reference object : RORHSDT_ATBT_COD_IND")
    private String atbtCodInd;
    /**
     * Recognized Program Reviewed, Not Eligible
     * <p>
     * Lineage reference object : RORHSDT_PROG_CODE_REVIEWED
     * 
     */
    @JsonProperty("progCodeReviewed")
    @JsonPropertyDescription("Lineage reference object : RORHSDT_PROG_CODE_REVIEWED")
    private String progCodeReviewed;
    /**
     * Completion Date
     * <p>
     * Lineage reference object : RORHSDT_ATBT_COMP_DATE
     * 
     */
    @JsonProperty("atbtCompDate")
    @JsonPropertyDescription("Lineage reference object : RORHSDT_ATBT_COMP_DATE")
    private Date atbtCompDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * State of Student's High School Graduation
     * <p>
     * Lineage reference object : RORHSDT_HS_GRAD_STATE_CODE
     * 
     */
    @JsonProperty("hsGradStateCode")
    public String getHsGradStateCode() {
        return hsGradStateCode;
    }

    /**
     * State of Student's High School Graduation
     * <p>
     * Lineage reference object : RORHSDT_HS_GRAD_STATE_CODE
     * 
     */
    @JsonProperty("hsGradStateCode")
    public void setHsGradStateCode(String hsGradStateCode) {
        this.hsGradStateCode = hsGradStateCode;
    }

    public ApplicantHighSchoolAndAdmissionData100PostResponse withHsGradStateCode(String hsGradStateCode) {
        this.hsGradStateCode = hsGradStateCode;
        return this;
    }

    /**
     * Advanced Placement/International Baccalaureate Courses
     * <p>
     * Lineage reference object : RORHSDT_AP_IB_COURSES
     * (Required)
     * 
     */
    @JsonProperty("apIbCourses")
    public String getApIbCourses() {
        return apIbCourses;
    }

    /**
     * Advanced Placement/International Baccalaureate Courses
     * <p>
     * Lineage reference object : RORHSDT_AP_IB_COURSES
     * (Required)
     * 
     */
    @JsonProperty("apIbCourses")
    public void setApIbCourses(String apIbCourses) {
        this.apIbCourses = apIbCourses;
    }

    public ApplicantHighSchoolAndAdmissionData100PostResponse withApIbCourses(String apIbCourses) {
        this.apIbCourses = apIbCourses;
        return this;
    }

    /**
     * State Code
     * <p>
     * Lineage reference object : RORHSDT_ATBT_CDST_CDE
     * 
     */
    @JsonProperty("atbtCdstCde")
    public String getAtbtCdstCde() {
        return atbtCdstCde;
    }

    /**
     * State Code
     * <p>
     * Lineage reference object : RORHSDT_ATBT_CDST_CDE
     * 
     */
    @JsonProperty("atbtCdstCde")
    public void setAtbtCdstCde(String atbtCdstCde) {
        this.atbtCdstCde = atbtCdstCde;
    }

    public ApplicantHighSchoolAndAdmissionData100PostResponse withAtbtCdstCde(String atbtCdstCde) {
        this.atbtCdstCde = atbtCdstCde;
        return this;
    }

    /**
     * Admission Test Above 75th Percentile
     * <p>
     * Lineage reference object : RORHSDT_ADMISSION_TEST_IND
     * 
     */
    @JsonProperty("admissionTestInd")
    public String getAdmissionTestInd() {
        return admissionTestInd;
    }

    /**
     * Admission Test Above 75th Percentile
     * <p>
     * Lineage reference object : RORHSDT_ADMISSION_TEST_IND
     * 
     */
    @JsonProperty("admissionTestInd")
    public void setAdmissionTestInd(String admissionTestInd) {
        this.admissionTestInd = admissionTestInd;
    }

    public ApplicantHighSchoolAndAdmissionData100PostResponse withAdmissionTestInd(String admissionTestInd) {
        this.admissionTestInd = admissionTestInd;
        return this;
    }

    /**
     * Eligibility Code
     * <p>
     * Lineage reference object : RORHSDT_ATBT_COD_CDE
     * 
     */
    @JsonProperty("atbtCodCde")
    public String getAtbtCodCde() {
        return atbtCodCde;
    }

    /**
     * Eligibility Code
     * <p>
     * Lineage reference object : RORHSDT_ATBT_COD_CDE
     * 
     */
    @JsonProperty("atbtCodCde")
    public void setAtbtCodCde(String atbtCodCde) {
        this.atbtCodCde = atbtCodCde;
    }

    public ApplicantHighSchoolAndAdmissionData100PostResponse withAtbtCodCde(String atbtCodCde) {
        this.atbtCodCde = atbtCodCde;
        return this;
    }

    /**
     * Test Code
     * <p>
     * Lineage reference object : RORHSDT_ATBT_COD_TEST_CDE
     * 
     */
    @JsonProperty("atbtCodTestCde")
    public String getAtbtCodTestCde() {
        return atbtCodTestCde;
    }

    /**
     * Test Code
     * <p>
     * Lineage reference object : RORHSDT_ATBT_COD_TEST_CDE
     * 
     */
    @JsonProperty("atbtCodTestCde")
    public void setAtbtCodTestCde(String atbtCodTestCde) {
        this.atbtCodTestCde = atbtCodTestCde;
    }

    public ApplicantHighSchoolAndAdmissionData100PostResponse withAtbtCodTestCde(String atbtCodTestCde) {
        this.atbtCodTestCde = atbtCodTestCde;
        return this;
    }

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

    public ApplicantHighSchoolAndAdmissionData100PostResponse withReqCourses(String reqCourses) {
        this.reqCourses = reqCourses;
        return this;
    }

    /**
     * Student's High School Graduation Date
     * <p>
     * Lineage reference object : RORHSDT_HS_GRAD_DATE
     * 
     */
    @JsonProperty("hsGradDate")
    public Date getHsGradDate() {
        return hsGradDate;
    }

    /**
     * Student's High School Graduation Date
     * <p>
     * Lineage reference object : RORHSDT_HS_GRAD_DATE
     * 
     */
    @JsonProperty("hsGradDate")
    public void setHsGradDate(Date hsGradDate) {
        this.hsGradDate = hsGradDate;
    }

    public ApplicantHighSchoolAndAdmissionData100PostResponse withHsGradDate(Date hsGradDate) {
        this.hsGradDate = hsGradDate;
        return this;
    }

    /**
     * Test Administrator Code
     * <p>
     * Lineage reference object : RORHSDT_TADM_COD_CDE
     * 
     */
    @JsonProperty("tadmCodCde")
    public String getTadmCodCde() {
        return tadmCodCde;
    }

    /**
     * Test Administrator Code
     * <p>
     * Lineage reference object : RORHSDT_TADM_COD_CDE
     * 
     */
    @JsonProperty("tadmCodCde")
    public void setTadmCodCde(String tadmCodCde) {
        this.tadmCodCde = tadmCodCde;
    }

    public ApplicantHighSchoolAndAdmissionData100PostResponse withTadmCodCde(String tadmCodCde) {
        this.tadmCodCde = tadmCodCde;
        return this;
    }

    /**
     * State Recognized Program of Study
     * <p>
     * Lineage reference object : RORHSDT_ADV_HONORS_PROG_CODE
     * 
     */
    @JsonProperty("advHonorsProgCode")
    public String getAdvHonorsProgCode() {
        return advHonorsProgCode;
    }

    /**
     * State Recognized Program of Study
     * <p>
     * Lineage reference object : RORHSDT_ADV_HONORS_PROG_CODE
     * 
     */
    @JsonProperty("advHonorsProgCode")
    public void setAdvHonorsProgCode(String advHonorsProgCode) {
        this.advHonorsProgCode = advHonorsProgCode;
    }

    public ApplicantHighSchoolAndAdmissionData100PostResponse withAdvHonorsProgCode(String advHonorsProgCode) {
        this.advHonorsProgCode = advHonorsProgCode;
        return this;
    }

    /**
     * Teacher Expert Indicator
     * <p>
     * Lineage reference object : RORHSDT_TEACH_EXPERT_IND
     * 
     */
    @JsonProperty("teachExpertInd")
    public String getTeachExpertInd() {
        return teachExpertInd;
    }

    /**
     * Teacher Expert Indicator
     * <p>
     * Lineage reference object : RORHSDT_TEACH_EXPERT_IND
     * 
     */
    @JsonProperty("teachExpertInd")
    public void setTeachExpertInd(String teachExpertInd) {
        this.teachExpertInd = teachExpertInd;
    }

    public ApplicantHighSchoolAndAdmissionData100PostResponse withTeachExpertInd(String teachExpertInd) {
        this.teachExpertInd = teachExpertInd;
        return this;
    }

    /**
     * COD Indicator
     * <p>
     * Lineage reference object : RORHSDT_ATBT_COD_IND
     * 
     */
    @JsonProperty("atbtCodInd")
    public String getAtbtCodInd() {
        return atbtCodInd;
    }

    /**
     * COD Indicator
     * <p>
     * Lineage reference object : RORHSDT_ATBT_COD_IND
     * 
     */
    @JsonProperty("atbtCodInd")
    public void setAtbtCodInd(String atbtCodInd) {
        this.atbtCodInd = atbtCodInd;
    }

    public ApplicantHighSchoolAndAdmissionData100PostResponse withAtbtCodInd(String atbtCodInd) {
        this.atbtCodInd = atbtCodInd;
        return this;
    }

    /**
     * Recognized Program Reviewed, Not Eligible
     * <p>
     * Lineage reference object : RORHSDT_PROG_CODE_REVIEWED
     * 
     */
    @JsonProperty("progCodeReviewed")
    public String getProgCodeReviewed() {
        return progCodeReviewed;
    }

    /**
     * Recognized Program Reviewed, Not Eligible
     * <p>
     * Lineage reference object : RORHSDT_PROG_CODE_REVIEWED
     * 
     */
    @JsonProperty("progCodeReviewed")
    public void setProgCodeReviewed(String progCodeReviewed) {
        this.progCodeReviewed = progCodeReviewed;
    }

    public ApplicantHighSchoolAndAdmissionData100PostResponse withProgCodeReviewed(String progCodeReviewed) {
        this.progCodeReviewed = progCodeReviewed;
        return this;
    }

    /**
     * Completion Date
     * <p>
     * Lineage reference object : RORHSDT_ATBT_COMP_DATE
     * 
     */
    @JsonProperty("atbtCompDate")
    public Date getAtbtCompDate() {
        return atbtCompDate;
    }

    /**
     * Completion Date
     * <p>
     * Lineage reference object : RORHSDT_ATBT_COMP_DATE
     * 
     */
    @JsonProperty("atbtCompDate")
    public void setAtbtCompDate(Date atbtCompDate) {
        this.atbtCompDate = atbtCompDate;
    }

    public ApplicantHighSchoolAndAdmissionData100PostResponse withAtbtCompDate(Date atbtCompDate) {
        this.atbtCompDate = atbtCompDate;
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

    public ApplicantHighSchoolAndAdmissionData100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApplicantHighSchoolAndAdmissionData100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("hsGradStateCode");
        sb.append('=');
        sb.append(((this.hsGradStateCode == null)?"<null>":this.hsGradStateCode));
        sb.append(',');
        sb.append("apIbCourses");
        sb.append('=');
        sb.append(((this.apIbCourses == null)?"<null>":this.apIbCourses));
        sb.append(',');
        sb.append("atbtCdstCde");
        sb.append('=');
        sb.append(((this.atbtCdstCde == null)?"<null>":this.atbtCdstCde));
        sb.append(',');
        sb.append("admissionTestInd");
        sb.append('=');
        sb.append(((this.admissionTestInd == null)?"<null>":this.admissionTestInd));
        sb.append(',');
        sb.append("atbtCodCde");
        sb.append('=');
        sb.append(((this.atbtCodCde == null)?"<null>":this.atbtCodCde));
        sb.append(',');
        sb.append("atbtCodTestCde");
        sb.append('=');
        sb.append(((this.atbtCodTestCde == null)?"<null>":this.atbtCodTestCde));
        sb.append(',');
        sb.append("reqCourses");
        sb.append('=');
        sb.append(((this.reqCourses == null)?"<null>":this.reqCourses));
        sb.append(',');
        sb.append("hsGradDate");
        sb.append('=');
        sb.append(((this.hsGradDate == null)?"<null>":this.hsGradDate));
        sb.append(',');
        sb.append("tadmCodCde");
        sb.append('=');
        sb.append(((this.tadmCodCde == null)?"<null>":this.tadmCodCde));
        sb.append(',');
        sb.append("advHonorsProgCode");
        sb.append('=');
        sb.append(((this.advHonorsProgCode == null)?"<null>":this.advHonorsProgCode));
        sb.append(',');
        sb.append("teachExpertInd");
        sb.append('=');
        sb.append(((this.teachExpertInd == null)?"<null>":this.teachExpertInd));
        sb.append(',');
        sb.append("atbtCodInd");
        sb.append('=');
        sb.append(((this.atbtCodInd == null)?"<null>":this.atbtCodInd));
        sb.append(',');
        sb.append("progCodeReviewed");
        sb.append('=');
        sb.append(((this.progCodeReviewed == null)?"<null>":this.progCodeReviewed));
        sb.append(',');
        sb.append("atbtCompDate");
        sb.append('=');
        sb.append(((this.atbtCompDate == null)?"<null>":this.atbtCompDate));
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
        result = ((result* 31)+((this.hsGradStateCode == null)? 0 :this.hsGradStateCode.hashCode()));
        result = ((result* 31)+((this.apIbCourses == null)? 0 :this.apIbCourses.hashCode()));
        result = ((result* 31)+((this.atbtCdstCde == null)? 0 :this.atbtCdstCde.hashCode()));
        result = ((result* 31)+((this.admissionTestInd == null)? 0 :this.admissionTestInd.hashCode()));
        result = ((result* 31)+((this.atbtCodCde == null)? 0 :this.atbtCodCde.hashCode()));
        result = ((result* 31)+((this.atbtCodTestCde == null)? 0 :this.atbtCodTestCde.hashCode()));
        result = ((result* 31)+((this.reqCourses == null)? 0 :this.reqCourses.hashCode()));
        result = ((result* 31)+((this.hsGradDate == null)? 0 :this.hsGradDate.hashCode()));
        result = ((result* 31)+((this.tadmCodCde == null)? 0 :this.tadmCodCde.hashCode()));
        result = ((result* 31)+((this.advHonorsProgCode == null)? 0 :this.advHonorsProgCode.hashCode()));
        result = ((result* 31)+((this.teachExpertInd == null)? 0 :this.teachExpertInd.hashCode()));
        result = ((result* 31)+((this.atbtCodInd == null)? 0 :this.atbtCodInd.hashCode()));
        result = ((result* 31)+((this.progCodeReviewed == null)? 0 :this.progCodeReviewed.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.atbtCompDate == null)? 0 :this.atbtCompDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicantHighSchoolAndAdmissionData100PostResponse) == false) {
            return false;
        }
        ApplicantHighSchoolAndAdmissionData100PostResponse rhs = ((ApplicantHighSchoolAndAdmissionData100PostResponse) other);
        return ((((((((((((((((this.hsGradStateCode == rhs.hsGradStateCode)||((this.hsGradStateCode!= null)&&this.hsGradStateCode.equals(rhs.hsGradStateCode)))&&((this.apIbCourses == rhs.apIbCourses)||((this.apIbCourses!= null)&&this.apIbCourses.equals(rhs.apIbCourses))))&&((this.atbtCdstCde == rhs.atbtCdstCde)||((this.atbtCdstCde!= null)&&this.atbtCdstCde.equals(rhs.atbtCdstCde))))&&((this.admissionTestInd == rhs.admissionTestInd)||((this.admissionTestInd!= null)&&this.admissionTestInd.equals(rhs.admissionTestInd))))&&((this.atbtCodCde == rhs.atbtCodCde)||((this.atbtCodCde!= null)&&this.atbtCodCde.equals(rhs.atbtCodCde))))&&((this.atbtCodTestCde == rhs.atbtCodTestCde)||((this.atbtCodTestCde!= null)&&this.atbtCodTestCde.equals(rhs.atbtCodTestCde))))&&((this.reqCourses == rhs.reqCourses)||((this.reqCourses!= null)&&this.reqCourses.equals(rhs.reqCourses))))&&((this.hsGradDate == rhs.hsGradDate)||((this.hsGradDate!= null)&&this.hsGradDate.equals(rhs.hsGradDate))))&&((this.tadmCodCde == rhs.tadmCodCde)||((this.tadmCodCde!= null)&&this.tadmCodCde.equals(rhs.tadmCodCde))))&&((this.advHonorsProgCode == rhs.advHonorsProgCode)||((this.advHonorsProgCode!= null)&&this.advHonorsProgCode.equals(rhs.advHonorsProgCode))))&&((this.teachExpertInd == rhs.teachExpertInd)||((this.teachExpertInd!= null)&&this.teachExpertInd.equals(rhs.teachExpertInd))))&&((this.atbtCodInd == rhs.atbtCodInd)||((this.atbtCodInd!= null)&&this.atbtCodInd.equals(rhs.atbtCodInd))))&&((this.progCodeReviewed == rhs.progCodeReviewed)||((this.progCodeReviewed!= null)&&this.progCodeReviewed.equals(rhs.progCodeReviewed))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.atbtCompDate == rhs.atbtCompDate)||((this.atbtCompDate!= null)&&this.atbtCompDate.equals(rhs.atbtCompDate))));
    }

}
