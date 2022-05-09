
package com.ellucian.generated.eedm.students.v16_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "level",
    "latestClassification"
})
@Generated("jsonschema2pojo")
public class LevelClassification {

    /**
     * Level
     * <p>
     * The academic level associated with the student.
     * (Required)
     * 
     */
    @JsonProperty("level")
    @JsonPropertyDescription("The academic level associated with the student.")
    private Level level;
    /**
     * Latest Classification
     * <p>
     * The latest classification associated with the academic level.
     * (Required)
     * 
     */
    @JsonProperty("latestClassification")
    @JsonPropertyDescription("The latest classification associated with the academic level.")
    private LatestClassification latestClassification;

    /**
     * Level
     * <p>
     * The academic level associated with the student.
     * (Required)
     * 
     */
    @JsonProperty("level")
    public Level getLevel() {
        return level;
    }

    /**
     * Level
     * <p>
     * The academic level associated with the student.
     * (Required)
     * 
     */
    @JsonProperty("level")
    public void setLevel(Level level) {
        this.level = level;
    }

    public LevelClassification withLevel(Level level) {
        this.level = level;
        return this;
    }

    /**
     * Latest Classification
     * <p>
     * The latest classification associated with the academic level.
     * (Required)
     * 
     */
    @JsonProperty("latestClassification")
    public LatestClassification getLatestClassification() {
        return latestClassification;
    }

    /**
     * Latest Classification
     * <p>
     * The latest classification associated with the academic level.
     * (Required)
     * 
     */
    @JsonProperty("latestClassification")
    public void setLatestClassification(LatestClassification latestClassification) {
        this.latestClassification = latestClassification;
    }

    public LevelClassification withLatestClassification(LatestClassification latestClassification) {
        this.latestClassification = latestClassification;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LevelClassification.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("level");
        sb.append('=');
        sb.append(((this.level == null)?"<null>":this.level));
        sb.append(',');
        sb.append("latestClassification");
        sb.append('=');
        sb.append(((this.latestClassification == null)?"<null>":this.latestClassification));
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
        result = ((result* 31)+((this.level == null)? 0 :this.level.hashCode()));
        result = ((result* 31)+((this.latestClassification == null)? 0 :this.latestClassification.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LevelClassification) == false) {
            return false;
        }
        LevelClassification rhs = ((LevelClassification) other);
        return (((this.level == rhs.level)||((this.level!= null)&&this.level.equals(rhs.level)))&&((this.latestClassification == rhs.latestClassification)||((this.latestClassification!= null)&&this.latestClassification.equals(rhs.latestClassification))));
    }

}
