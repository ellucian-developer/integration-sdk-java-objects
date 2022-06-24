
package com.ellucian.generated.eedm.dfe_application_submission_process.v1_2_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Work Experience
 * <p>
 * Information about an applicant’s current and previous employments.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "jobs",
    "volunteering",
    "workHistoryBreakExplanation"
})
@Generated("jsonschema2pojo")
public class WorkExperience {

    /**
     * Jobs
     * <p>
     * Information about an applicant’s jobs.
     * 
     */
    @JsonProperty("jobs")
    @JsonPropertyDescription("Information about an applicant\u2019s jobs.")
    private List<Job> jobs = new ArrayList<Job>();
    /**
     * Volunteering
     * <p>
     * Information about an applicant’s volunteering experience.
     * 
     */
    @JsonProperty("volunteering")
    @JsonPropertyDescription("Information about an applicant\u2019s volunteering experience.")
    private List<Volunteering> volunteering = new ArrayList<Volunteering>();
    /**
     * Work History Break Explanation
     * <p>
     * The candidate’s explanation for any breaks in work history. Will be null if there aren't any breaks in the candidate’s work history. We define a break in work history as more than a month between 2 jobs.
     * 
     */
    @JsonProperty("workHistoryBreakExplanation")
    @JsonPropertyDescription("The candidate\u2019s explanation for any breaks in work history. Will be null if there aren't any breaks in the candidate\u2019s work history. We define a break in work history as more than a month between 2 jobs.")
    private String workHistoryBreakExplanation;

    /**
     * Jobs
     * <p>
     * Information about an applicant’s jobs.
     * 
     */
    @JsonProperty("jobs")
    public List<Job> getJobs() {
        return jobs;
    }

    /**
     * Jobs
     * <p>
     * Information about an applicant’s jobs.
     * 
     */
    @JsonProperty("jobs")
    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public WorkExperience withJobs(List<Job> jobs) {
        this.jobs = jobs;
        return this;
    }

    /**
     * Volunteering
     * <p>
     * Information about an applicant’s volunteering experience.
     * 
     */
    @JsonProperty("volunteering")
    public List<Volunteering> getVolunteering() {
        return volunteering;
    }

    /**
     * Volunteering
     * <p>
     * Information about an applicant’s volunteering experience.
     * 
     */
    @JsonProperty("volunteering")
    public void setVolunteering(List<Volunteering> volunteering) {
        this.volunteering = volunteering;
    }

    public WorkExperience withVolunteering(List<Volunteering> volunteering) {
        this.volunteering = volunteering;
        return this;
    }

    /**
     * Work History Break Explanation
     * <p>
     * The candidate’s explanation for any breaks in work history. Will be null if there aren't any breaks in the candidate’s work history. We define a break in work history as more than a month between 2 jobs.
     * 
     */
    @JsonProperty("workHistoryBreakExplanation")
    public String getWorkHistoryBreakExplanation() {
        return workHistoryBreakExplanation;
    }

    /**
     * Work History Break Explanation
     * <p>
     * The candidate’s explanation for any breaks in work history. Will be null if there aren't any breaks in the candidate’s work history. We define a break in work history as more than a month between 2 jobs.
     * 
     */
    @JsonProperty("workHistoryBreakExplanation")
    public void setWorkHistoryBreakExplanation(String workHistoryBreakExplanation) {
        this.workHistoryBreakExplanation = workHistoryBreakExplanation;
    }

    public WorkExperience withWorkHistoryBreakExplanation(String workHistoryBreakExplanation) {
        this.workHistoryBreakExplanation = workHistoryBreakExplanation;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(WorkExperience.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("jobs");
        sb.append('=');
        sb.append(((this.jobs == null)?"<null>":this.jobs));
        sb.append(',');
        sb.append("volunteering");
        sb.append('=');
        sb.append(((this.volunteering == null)?"<null>":this.volunteering));
        sb.append(',');
        sb.append("workHistoryBreakExplanation");
        sb.append('=');
        sb.append(((this.workHistoryBreakExplanation == null)?"<null>":this.workHistoryBreakExplanation));
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
        result = ((result* 31)+((this.volunteering == null)? 0 :this.volunteering.hashCode()));
        result = ((result* 31)+((this.jobs == null)? 0 :this.jobs.hashCode()));
        result = ((result* 31)+((this.workHistoryBreakExplanation == null)? 0 :this.workHistoryBreakExplanation.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WorkExperience) == false) {
            return false;
        }
        WorkExperience rhs = ((WorkExperience) other);
        return ((((this.volunteering == rhs.volunteering)||((this.volunteering!= null)&&this.volunteering.equals(rhs.volunteering)))&&((this.jobs == rhs.jobs)||((this.jobs!= null)&&this.jobs.equals(rhs.jobs))))&&((this.workHistoryBreakExplanation == rhs.workHistoryBreakExplanation)||((this.workHistoryBreakExplanation!= null)&&this.workHistoryBreakExplanation.equals(rhs.workHistoryBreakExplanation))));
    }

}
