
package com.ellucian.generated.eedm.financial_aid_funds.v9_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Category
 * <p>
 * Category of the financial aid fund.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "detail"
})
@Generated("jsonschema2pojo")
public class Category {

    /**
     * Name
     * <p>
     * Name of the financial aid fund category.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of the financial aid fund category.")
    private Category.Name name;
    /**
     * Detail
     * <p>
     * The extension to the category of the financial aid fund.
     * 
     */
    @JsonProperty("detail")
    @JsonPropertyDescription("The extension to the category of the financial aid fund.")
    private Object detail;

    /**
     * Name
     * <p>
     * Name of the financial aid fund category.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public Category.Name getName() {
        return name;
    }

    /**
     * Name
     * <p>
     * Name of the financial aid fund category.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(Category.Name name) {
        this.name = name;
    }

    public Category withName(Category.Name name) {
        this.name = name;
        return this;
    }

    /**
     * Detail
     * <p>
     * The extension to the category of the financial aid fund.
     * 
     */
    @JsonProperty("detail")
    public Object getDetail() {
        return detail;
    }

    /**
     * Detail
     * <p>
     * The extension to the category of the financial aid fund.
     * 
     */
    @JsonProperty("detail")
    public void setDetail(Object detail) {
        this.detail = detail;
    }

    public Category withDetail(Object detail) {
        this.detail = detail;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Category.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("detail");
        sb.append('=');
        sb.append(((this.detail == null)?"<null>":this.detail));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.detail == null)? 0 :this.detail.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Category) == false) {
            return false;
        }
        Category rhs = ((Category) other);
        return (((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.detail == rhs.detail)||((this.detail!= null)&&this.detail.equals(rhs.detail))));
    }


    /**
     * Name
     * <p>
     * Name of the financial aid fund category.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Name {

        PELL_GRANT("pellGrant"),
        FEDERAL_UNSUBSIDIZED_LOAN("federalUnsubsidizedLoan"),
        FEDERAL_SUBSIDIZED_LOAN("federalSubsidizedLoan"),
        GRADUATE_TEACH_GRANT("graduateTeachGrant"),
        UNDERGRADUATE_TEACH_GRANT("undergraduateTeachGrant"),
        PARENT_PLUS_LOAN("parentPlusLoan"),
        GRADUATE_PLUS_LOAN("graduatePlusLoan"),
        FEDERAL_WORK_STUDY_PROGRAM("federalWorkStudyProgram"),
        IRAQ_AFGHANISTAN_SERVICE_GRANT("iraqAfghanistanServiceGrant"),
        ACADEMIC_COMPETITIVENESS_GRANT("academicCompetitivenessGrant"),
        BUREAU_OF_INDIAN_AFFAIRS_FEDERAL_GRANT("bureauOfIndianAffairsFederalGrant"),
        ROBERT_C_BYRD_SCHOLARSHIP_PROGRAM("robertCByrdScholarshipProgram"),
        PAUL_DOUGLAS_TEACHER_SCHOLARSHIP("paulDouglasTeacherScholarship"),
        GENERAL_TITLE_I_VLOAN("generalTitleIVloan"),
        HEALTH_EDUCATION_ASSISTANCE_LOAN("healthEducationAssistanceLoan"),
        HEALTH_PROFESSIONAL_STUDENT_LOAN("healthProfessionalStudentLoan"),
        INCOME_CONTINGENT_LOAN("incomeContingentLoan"),
        LOAN_FOR_DISADVANTAGES_STUDENT("loanForDisadvantagesStudent"),
        LEVERAGING_EDUCATIONAL_ASSISTANCE_PARTNERSHIP("leveragingEducationalAssistancePartnership"),
        NATIONAL_HEALTH_SERVICES_CORPS_SCHOLARSHIP("nationalHealthServicesCorpsScholarship"),
        NURSING_STUDENT_LOAN("nursingStudentLoan"),
        PRIMARY_CARE_LOAN("primaryCareLoan"),
        FEDERAL_PERKINS_LOAN("federalPerkinsLoan"),
        ROTC_SCHOLARSHIP("rotcScholarship"),
        FEDERAL_SUPPLEMENTARY_EDUCATIONAL_OPPORTUNITY_GRANT("federalSupplementaryEducationalOpportunityGrant"),
        STAY_IN_SCHOOL_PROGRAM("stayInSchoolProgram"),
        FEDERAL_SUPPLEMENTARY_LOAN_FOR_PARENT("federalSupplementaryLoanForParent"),
        NATIONAL_SMART_GRANT("nationalSmartGrant"),
        STATE_STUDENT_INCENTIVE_GRANT("stateStudentIncentiveGrant"),
        VA_HEALTH_PROFESSIONS_SCHOLARSHIP("vaHealthProfessionsScholarship"),
        NON_GOVERNMENTAL("nonGovernmental");
        private final String value;
        private final static Map<String, Category.Name> CONSTANTS = new HashMap<String, Category.Name>();

        static {
            for (Category.Name c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Name(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Category.Name fromValue(String value) {
            Category.Name constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
