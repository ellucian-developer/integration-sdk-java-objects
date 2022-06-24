
package com.ellucian.generated.bpapi.ban.term_course_maintenance_stored_gpa_by_term_calculation.v0_1_0;

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
    "hoursEarned",
    "levlDesc",
    "gpaHours",
    "hoursAttempted",
    "hoursPassed",
    "displayShvtgpaQualityPoints",
    "displayShvtgpaGpa",
    "levlCode"
})
@Generated("jsonschema2pojo")
public class TermCourseMaintenanceStoredGpaByTermCalculation010GetResponse {

    /**
     * Earned Hours
     * <p>
     * Lineage reference object : SHVTGPA_HOURS_EARNED
     * 
     */
    @JsonProperty("hoursEarned")
    @JsonPropertyDescription("Lineage reference object : SHVTGPA_HOURS_EARNED")
    private Double hoursEarned;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("levlDesc")
    private String levlDesc;
    /**
     * GPA Hours
     * <p>
     * Lineage reference object : SHVTGPA_GPA_HOURS
     * 
     */
    @JsonProperty("gpaHours")
    @JsonPropertyDescription("Lineage reference object : SHVTGPA_GPA_HOURS")
    private Double gpaHours;
    /**
     * Attempted Hours
     * <p>
     * Lineage reference object : SHVTGPA_HOURS_ATTEMPTED
     * 
     */
    @JsonProperty("hoursAttempted")
    @JsonPropertyDescription("Lineage reference object : SHVTGPA_HOURS_ATTEMPTED")
    private Double hoursAttempted;
    /**
     * Passed Hours
     * <p>
     * Lineage reference object : SHVTGPA_HOURS_PASSED
     * 
     */
    @JsonProperty("hoursPassed")
    @JsonPropertyDescription("Lineage reference object : SHVTGPA_HOURS_PASSED")
    private Double hoursPassed;
    /**
     * Quality Points
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShvtgpaQualityPoints")
    private Double displayShvtgpaQualityPoints;
    /**
     * GPA
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShvtgpaGpa")
    private Double displayShvtgpaGpa;
    /**
     * Valid Level
     * <p>
     * Lineage reference object : SHVTGPA_LEVL_CODE
     * 
     */
    @JsonProperty("levlCode")
    @JsonPropertyDescription("Lineage reference object : SHVTGPA_LEVL_CODE")
    private String levlCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Earned Hours
     * <p>
     * Lineage reference object : SHVTGPA_HOURS_EARNED
     * 
     */
    @JsonProperty("hoursEarned")
    public Double getHoursEarned() {
        return hoursEarned;
    }

    /**
     * Earned Hours
     * <p>
     * Lineage reference object : SHVTGPA_HOURS_EARNED
     * 
     */
    @JsonProperty("hoursEarned")
    public void setHoursEarned(Double hoursEarned) {
        this.hoursEarned = hoursEarned;
    }

    public TermCourseMaintenanceStoredGpaByTermCalculation010GetResponse withHoursEarned(Double hoursEarned) {
        this.hoursEarned = hoursEarned;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("levlDesc")
    public String getLevlDesc() {
        return levlDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("levlDesc")
    public void setLevlDesc(String levlDesc) {
        this.levlDesc = levlDesc;
    }

    public TermCourseMaintenanceStoredGpaByTermCalculation010GetResponse withLevlDesc(String levlDesc) {
        this.levlDesc = levlDesc;
        return this;
    }

    /**
     * GPA Hours
     * <p>
     * Lineage reference object : SHVTGPA_GPA_HOURS
     * 
     */
    @JsonProperty("gpaHours")
    public Double getGpaHours() {
        return gpaHours;
    }

    /**
     * GPA Hours
     * <p>
     * Lineage reference object : SHVTGPA_GPA_HOURS
     * 
     */
    @JsonProperty("gpaHours")
    public void setGpaHours(Double gpaHours) {
        this.gpaHours = gpaHours;
    }

    public TermCourseMaintenanceStoredGpaByTermCalculation010GetResponse withGpaHours(Double gpaHours) {
        this.gpaHours = gpaHours;
        return this;
    }

    /**
     * Attempted Hours
     * <p>
     * Lineage reference object : SHVTGPA_HOURS_ATTEMPTED
     * 
     */
    @JsonProperty("hoursAttempted")
    public Double getHoursAttempted() {
        return hoursAttempted;
    }

    /**
     * Attempted Hours
     * <p>
     * Lineage reference object : SHVTGPA_HOURS_ATTEMPTED
     * 
     */
    @JsonProperty("hoursAttempted")
    public void setHoursAttempted(Double hoursAttempted) {
        this.hoursAttempted = hoursAttempted;
    }

    public TermCourseMaintenanceStoredGpaByTermCalculation010GetResponse withHoursAttempted(Double hoursAttempted) {
        this.hoursAttempted = hoursAttempted;
        return this;
    }

    /**
     * Passed Hours
     * <p>
     * Lineage reference object : SHVTGPA_HOURS_PASSED
     * 
     */
    @JsonProperty("hoursPassed")
    public Double getHoursPassed() {
        return hoursPassed;
    }

    /**
     * Passed Hours
     * <p>
     * Lineage reference object : SHVTGPA_HOURS_PASSED
     * 
     */
    @JsonProperty("hoursPassed")
    public void setHoursPassed(Double hoursPassed) {
        this.hoursPassed = hoursPassed;
    }

    public TermCourseMaintenanceStoredGpaByTermCalculation010GetResponse withHoursPassed(Double hoursPassed) {
        this.hoursPassed = hoursPassed;
        return this;
    }

    /**
     * Quality Points
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShvtgpaQualityPoints")
    public Double getDisplayShvtgpaQualityPoints() {
        return displayShvtgpaQualityPoints;
    }

    /**
     * Quality Points
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShvtgpaQualityPoints")
    public void setDisplayShvtgpaQualityPoints(Double displayShvtgpaQualityPoints) {
        this.displayShvtgpaQualityPoints = displayShvtgpaQualityPoints;
    }

    public TermCourseMaintenanceStoredGpaByTermCalculation010GetResponse withDisplayShvtgpaQualityPoints(Double displayShvtgpaQualityPoints) {
        this.displayShvtgpaQualityPoints = displayShvtgpaQualityPoints;
        return this;
    }

    /**
     * GPA
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShvtgpaGpa")
    public Double getDisplayShvtgpaGpa() {
        return displayShvtgpaGpa;
    }

    /**
     * GPA
     * <p>
     * 
     * 
     */
    @JsonProperty("displayShvtgpaGpa")
    public void setDisplayShvtgpaGpa(Double displayShvtgpaGpa) {
        this.displayShvtgpaGpa = displayShvtgpaGpa;
    }

    public TermCourseMaintenanceStoredGpaByTermCalculation010GetResponse withDisplayShvtgpaGpa(Double displayShvtgpaGpa) {
        this.displayShvtgpaGpa = displayShvtgpaGpa;
        return this;
    }

    /**
     * Valid Level
     * <p>
     * Lineage reference object : SHVTGPA_LEVL_CODE
     * 
     */
    @JsonProperty("levlCode")
    public String getLevlCode() {
        return levlCode;
    }

    /**
     * Valid Level
     * <p>
     * Lineage reference object : SHVTGPA_LEVL_CODE
     * 
     */
    @JsonProperty("levlCode")
    public void setLevlCode(String levlCode) {
        this.levlCode = levlCode;
    }

    public TermCourseMaintenanceStoredGpaByTermCalculation010GetResponse withLevlCode(String levlCode) {
        this.levlCode = levlCode;
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

    public TermCourseMaintenanceStoredGpaByTermCalculation010GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TermCourseMaintenanceStoredGpaByTermCalculation010GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("hoursEarned");
        sb.append('=');
        sb.append(((this.hoursEarned == null)?"<null>":this.hoursEarned));
        sb.append(',');
        sb.append("levlDesc");
        sb.append('=');
        sb.append(((this.levlDesc == null)?"<null>":this.levlDesc));
        sb.append(',');
        sb.append("gpaHours");
        sb.append('=');
        sb.append(((this.gpaHours == null)?"<null>":this.gpaHours));
        sb.append(',');
        sb.append("hoursAttempted");
        sb.append('=');
        sb.append(((this.hoursAttempted == null)?"<null>":this.hoursAttempted));
        sb.append(',');
        sb.append("hoursPassed");
        sb.append('=');
        sb.append(((this.hoursPassed == null)?"<null>":this.hoursPassed));
        sb.append(',');
        sb.append("displayShvtgpaQualityPoints");
        sb.append('=');
        sb.append(((this.displayShvtgpaQualityPoints == null)?"<null>":this.displayShvtgpaQualityPoints));
        sb.append(',');
        sb.append("displayShvtgpaGpa");
        sb.append('=');
        sb.append(((this.displayShvtgpaGpa == null)?"<null>":this.displayShvtgpaGpa));
        sb.append(',');
        sb.append("levlCode");
        sb.append('=');
        sb.append(((this.levlCode == null)?"<null>":this.levlCode));
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
        result = ((result* 31)+((this.hoursEarned == null)? 0 :this.hoursEarned.hashCode()));
        result = ((result* 31)+((this.levlDesc == null)? 0 :this.levlDesc.hashCode()));
        result = ((result* 31)+((this.gpaHours == null)? 0 :this.gpaHours.hashCode()));
        result = ((result* 31)+((this.hoursAttempted == null)? 0 :this.hoursAttempted.hashCode()));
        result = ((result* 31)+((this.hoursPassed == null)? 0 :this.hoursPassed.hashCode()));
        result = ((result* 31)+((this.displayShvtgpaQualityPoints == null)? 0 :this.displayShvtgpaQualityPoints.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.displayShvtgpaGpa == null)? 0 :this.displayShvtgpaGpa.hashCode()));
        result = ((result* 31)+((this.levlCode == null)? 0 :this.levlCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TermCourseMaintenanceStoredGpaByTermCalculation010GetResponse) == false) {
            return false;
        }
        TermCourseMaintenanceStoredGpaByTermCalculation010GetResponse rhs = ((TermCourseMaintenanceStoredGpaByTermCalculation010GetResponse) other);
        return ((((((((((this.hoursEarned == rhs.hoursEarned)||((this.hoursEarned!= null)&&this.hoursEarned.equals(rhs.hoursEarned)))&&((this.levlDesc == rhs.levlDesc)||((this.levlDesc!= null)&&this.levlDesc.equals(rhs.levlDesc))))&&((this.gpaHours == rhs.gpaHours)||((this.gpaHours!= null)&&this.gpaHours.equals(rhs.gpaHours))))&&((this.hoursAttempted == rhs.hoursAttempted)||((this.hoursAttempted!= null)&&this.hoursAttempted.equals(rhs.hoursAttempted))))&&((this.hoursPassed == rhs.hoursPassed)||((this.hoursPassed!= null)&&this.hoursPassed.equals(rhs.hoursPassed))))&&((this.displayShvtgpaQualityPoints == rhs.displayShvtgpaQualityPoints)||((this.displayShvtgpaQualityPoints!= null)&&this.displayShvtgpaQualityPoints.equals(rhs.displayShvtgpaQualityPoints))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.displayShvtgpaGpa == rhs.displayShvtgpaGpa)||((this.displayShvtgpaGpa!= null)&&this.displayShvtgpaGpa.equals(rhs.displayShvtgpaGpa))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))));
    }

}
