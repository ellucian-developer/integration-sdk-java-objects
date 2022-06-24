
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
    "id",
    "keyblckTermCode",
    "levlCode",
    "hoursAttempted",
    "hoursPassed",
    "hoursEarned",
    "displayQualityPoints"
})
@Generated("jsonschema2pojo")
public class TermCourseMaintenanceStoredGpaByTermCalculation010QapiPost {

    @JsonProperty("id")
    private String id;
    @JsonProperty("keyblckTermCode")
    private String keyblckTermCode;
    /**
     * Valid Level
     * <p>
     * Lineage reference object : SHVTGPA_LEVL_CODE
     * 
     */
    @JsonProperty("levlCode")
    @JsonPropertyDescription("Lineage reference object : SHVTGPA_LEVL_CODE")
    private String levlCode;
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
     * Earned Hours
     * <p>
     * Lineage reference object : SHVTGPA_HOURS_EARNED
     * 
     */
    @JsonProperty("hoursEarned")
    @JsonPropertyDescription("Lineage reference object : SHVTGPA_HOURS_EARNED")
    private Double hoursEarned;
    @JsonProperty("displayQualityPoints")
    private String displayQualityPoints;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public TermCourseMaintenanceStoredGpaByTermCalculation010QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("keyblckTermCode")
    public String getKeyblckTermCode() {
        return keyblckTermCode;
    }

    @JsonProperty("keyblckTermCode")
    public void setKeyblckTermCode(String keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
    }

    public TermCourseMaintenanceStoredGpaByTermCalculation010QapiPost withKeyblckTermCode(String keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
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

    public TermCourseMaintenanceStoredGpaByTermCalculation010QapiPost withLevlCode(String levlCode) {
        this.levlCode = levlCode;
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

    public TermCourseMaintenanceStoredGpaByTermCalculation010QapiPost withHoursAttempted(Double hoursAttempted) {
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

    public TermCourseMaintenanceStoredGpaByTermCalculation010QapiPost withHoursPassed(Double hoursPassed) {
        this.hoursPassed = hoursPassed;
        return this;
    }

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

    public TermCourseMaintenanceStoredGpaByTermCalculation010QapiPost withHoursEarned(Double hoursEarned) {
        this.hoursEarned = hoursEarned;
        return this;
    }

    @JsonProperty("displayQualityPoints")
    public String getDisplayQualityPoints() {
        return displayQualityPoints;
    }

    @JsonProperty("displayQualityPoints")
    public void setDisplayQualityPoints(String displayQualityPoints) {
        this.displayQualityPoints = displayQualityPoints;
    }

    public TermCourseMaintenanceStoredGpaByTermCalculation010QapiPost withDisplayQualityPoints(String displayQualityPoints) {
        this.displayQualityPoints = displayQualityPoints;
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

    public TermCourseMaintenanceStoredGpaByTermCalculation010QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TermCourseMaintenanceStoredGpaByTermCalculation010QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("keyblckTermCode");
        sb.append('=');
        sb.append(((this.keyblckTermCode == null)?"<null>":this.keyblckTermCode));
        sb.append(',');
        sb.append("levlCode");
        sb.append('=');
        sb.append(((this.levlCode == null)?"<null>":this.levlCode));
        sb.append(',');
        sb.append("hoursAttempted");
        sb.append('=');
        sb.append(((this.hoursAttempted == null)?"<null>":this.hoursAttempted));
        sb.append(',');
        sb.append("hoursPassed");
        sb.append('=');
        sb.append(((this.hoursPassed == null)?"<null>":this.hoursPassed));
        sb.append(',');
        sb.append("hoursEarned");
        sb.append('=');
        sb.append(((this.hoursEarned == null)?"<null>":this.hoursEarned));
        sb.append(',');
        sb.append("displayQualityPoints");
        sb.append('=');
        sb.append(((this.displayQualityPoints == null)?"<null>":this.displayQualityPoints));
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
        result = ((result* 31)+((this.hoursAttempted == null)? 0 :this.hoursAttempted.hashCode()));
        result = ((result* 31)+((this.hoursPassed == null)? 0 :this.hoursPassed.hashCode()));
        result = ((result* 31)+((this.keyblckTermCode == null)? 0 :this.keyblckTermCode.hashCode()));
        result = ((result* 31)+((this.displayQualityPoints == null)? 0 :this.displayQualityPoints.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.levlCode == null)? 0 :this.levlCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TermCourseMaintenanceStoredGpaByTermCalculation010QapiPost) == false) {
            return false;
        }
        TermCourseMaintenanceStoredGpaByTermCalculation010QapiPost rhs = ((TermCourseMaintenanceStoredGpaByTermCalculation010QapiPost) other);
        return (((((((((this.hoursEarned == rhs.hoursEarned)||((this.hoursEarned!= null)&&this.hoursEarned.equals(rhs.hoursEarned)))&&((this.hoursAttempted == rhs.hoursAttempted)||((this.hoursAttempted!= null)&&this.hoursAttempted.equals(rhs.hoursAttempted))))&&((this.hoursPassed == rhs.hoursPassed)||((this.hoursPassed!= null)&&this.hoursPassed.equals(rhs.hoursPassed))))&&((this.keyblckTermCode == rhs.keyblckTermCode)||((this.keyblckTermCode!= null)&&this.keyblckTermCode.equals(rhs.keyblckTermCode))))&&((this.displayQualityPoints == rhs.displayQualityPoints)||((this.displayQualityPoints!= null)&&this.displayQualityPoints.equals(rhs.displayQualityPoints))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))));
    }

}
