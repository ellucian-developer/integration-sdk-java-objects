
package com.ellucian.generated.bpapi.ban.student_adjustments_query.v0_1_0;

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
    "adjGroupInd",
    "adjTargetInd",
    "adjWaiverInd",
    "adjSubstInd",
    "name",
    "id",
    "adjProgramInd",
    "adjAreaInd"
})
@Generated("jsonschema2pojo")
public class StudentAdjustmentsQuery010GetResponse {

    /**
     * Lineage reference object : SMVSLIB_ADJ_GROUP_IND
     * 
     */
    @JsonProperty("adjGroupInd")
    @JsonPropertyDescription("Lineage reference object : SMVSLIB_ADJ_GROUP_IND")
    private String adjGroupInd;
    /**
     * Lineage reference object : SMVSLIB_ADJ_TARGET_IND
     * 
     */
    @JsonProperty("adjTargetInd")
    @JsonPropertyDescription("Lineage reference object : SMVSLIB_ADJ_TARGET_IND")
    private String adjTargetInd;
    /**
     * Lineage reference object : SMVSLIB_ADJ_WAIVER_IND
     * 
     */
    @JsonProperty("adjWaiverInd")
    @JsonPropertyDescription("Lineage reference object : SMVSLIB_ADJ_WAIVER_IND")
    private String adjWaiverInd;
    /**
     * Lineage reference object : SMVSLIB_ADJ_SUBST_IND
     * 
     */
    @JsonProperty("adjSubstInd")
    @JsonPropertyDescription("Lineage reference object : SMVSLIB_ADJ_SUBST_IND")
    private String adjSubstInd;
    /**
     * Name
     * <p>
     * Lineage reference object : SMVSLIB_NAME
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Lineage reference object : SMVSLIB_NAME")
    private String name;
    /**
     * Id
     * <p>
     * Lineage reference object : SMVSLIB_ID
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : SMVSLIB_ID")
    private String id;
    /**
     * Lineage reference object : SMVSLIB_ADJ_PROGRAM_IND
     * 
     */
    @JsonProperty("adjProgramInd")
    @JsonPropertyDescription("Lineage reference object : SMVSLIB_ADJ_PROGRAM_IND")
    private String adjProgramInd;
    /**
     * Lineage reference object : SMVSLIB_ADJ_AREA_IND
     * 
     */
    @JsonProperty("adjAreaInd")
    @JsonPropertyDescription("Lineage reference object : SMVSLIB_ADJ_AREA_IND")
    private String adjAreaInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : SMVSLIB_ADJ_GROUP_IND
     * 
     */
    @JsonProperty("adjGroupInd")
    public String getAdjGroupInd() {
        return adjGroupInd;
    }

    /**
     * Lineage reference object : SMVSLIB_ADJ_GROUP_IND
     * 
     */
    @JsonProperty("adjGroupInd")
    public void setAdjGroupInd(String adjGroupInd) {
        this.adjGroupInd = adjGroupInd;
    }

    public StudentAdjustmentsQuery010GetResponse withAdjGroupInd(String adjGroupInd) {
        this.adjGroupInd = adjGroupInd;
        return this;
    }

    /**
     * Lineage reference object : SMVSLIB_ADJ_TARGET_IND
     * 
     */
    @JsonProperty("adjTargetInd")
    public String getAdjTargetInd() {
        return adjTargetInd;
    }

    /**
     * Lineage reference object : SMVSLIB_ADJ_TARGET_IND
     * 
     */
    @JsonProperty("adjTargetInd")
    public void setAdjTargetInd(String adjTargetInd) {
        this.adjTargetInd = adjTargetInd;
    }

    public StudentAdjustmentsQuery010GetResponse withAdjTargetInd(String adjTargetInd) {
        this.adjTargetInd = adjTargetInd;
        return this;
    }

    /**
     * Lineage reference object : SMVSLIB_ADJ_WAIVER_IND
     * 
     */
    @JsonProperty("adjWaiverInd")
    public String getAdjWaiverInd() {
        return adjWaiverInd;
    }

    /**
     * Lineage reference object : SMVSLIB_ADJ_WAIVER_IND
     * 
     */
    @JsonProperty("adjWaiverInd")
    public void setAdjWaiverInd(String adjWaiverInd) {
        this.adjWaiverInd = adjWaiverInd;
    }

    public StudentAdjustmentsQuery010GetResponse withAdjWaiverInd(String adjWaiverInd) {
        this.adjWaiverInd = adjWaiverInd;
        return this;
    }

    /**
     * Lineage reference object : SMVSLIB_ADJ_SUBST_IND
     * 
     */
    @JsonProperty("adjSubstInd")
    public String getAdjSubstInd() {
        return adjSubstInd;
    }

    /**
     * Lineage reference object : SMVSLIB_ADJ_SUBST_IND
     * 
     */
    @JsonProperty("adjSubstInd")
    public void setAdjSubstInd(String adjSubstInd) {
        this.adjSubstInd = adjSubstInd;
    }

    public StudentAdjustmentsQuery010GetResponse withAdjSubstInd(String adjSubstInd) {
        this.adjSubstInd = adjSubstInd;
        return this;
    }

    /**
     * Name
     * <p>
     * Lineage reference object : SMVSLIB_NAME
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name
     * <p>
     * Lineage reference object : SMVSLIB_NAME
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public StudentAdjustmentsQuery010GetResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Id
     * <p>
     * Lineage reference object : SMVSLIB_ID
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Id
     * <p>
     * Lineage reference object : SMVSLIB_ID
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public StudentAdjustmentsQuery010GetResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Lineage reference object : SMVSLIB_ADJ_PROGRAM_IND
     * 
     */
    @JsonProperty("adjProgramInd")
    public String getAdjProgramInd() {
        return adjProgramInd;
    }

    /**
     * Lineage reference object : SMVSLIB_ADJ_PROGRAM_IND
     * 
     */
    @JsonProperty("adjProgramInd")
    public void setAdjProgramInd(String adjProgramInd) {
        this.adjProgramInd = adjProgramInd;
    }

    public StudentAdjustmentsQuery010GetResponse withAdjProgramInd(String adjProgramInd) {
        this.adjProgramInd = adjProgramInd;
        return this;
    }

    /**
     * Lineage reference object : SMVSLIB_ADJ_AREA_IND
     * 
     */
    @JsonProperty("adjAreaInd")
    public String getAdjAreaInd() {
        return adjAreaInd;
    }

    /**
     * Lineage reference object : SMVSLIB_ADJ_AREA_IND
     * 
     */
    @JsonProperty("adjAreaInd")
    public void setAdjAreaInd(String adjAreaInd) {
        this.adjAreaInd = adjAreaInd;
    }

    public StudentAdjustmentsQuery010GetResponse withAdjAreaInd(String adjAreaInd) {
        this.adjAreaInd = adjAreaInd;
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

    public StudentAdjustmentsQuery010GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentAdjustmentsQuery010GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("adjGroupInd");
        sb.append('=');
        sb.append(((this.adjGroupInd == null)?"<null>":this.adjGroupInd));
        sb.append(',');
        sb.append("adjTargetInd");
        sb.append('=');
        sb.append(((this.adjTargetInd == null)?"<null>":this.adjTargetInd));
        sb.append(',');
        sb.append("adjWaiverInd");
        sb.append('=');
        sb.append(((this.adjWaiverInd == null)?"<null>":this.adjWaiverInd));
        sb.append(',');
        sb.append("adjSubstInd");
        sb.append('=');
        sb.append(((this.adjSubstInd == null)?"<null>":this.adjSubstInd));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("adjProgramInd");
        sb.append('=');
        sb.append(((this.adjProgramInd == null)?"<null>":this.adjProgramInd));
        sb.append(',');
        sb.append("adjAreaInd");
        sb.append('=');
        sb.append(((this.adjAreaInd == null)?"<null>":this.adjAreaInd));
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
        result = ((result* 31)+((this.adjGroupInd == null)? 0 :this.adjGroupInd.hashCode()));
        result = ((result* 31)+((this.adjTargetInd == null)? 0 :this.adjTargetInd.hashCode()));
        result = ((result* 31)+((this.adjWaiverInd == null)? 0 :this.adjWaiverInd.hashCode()));
        result = ((result* 31)+((this.adjSubstInd == null)? 0 :this.adjSubstInd.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.adjProgramInd == null)? 0 :this.adjProgramInd.hashCode()));
        result = ((result* 31)+((this.adjAreaInd == null)? 0 :this.adjAreaInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentAdjustmentsQuery010GetResponse) == false) {
            return false;
        }
        StudentAdjustmentsQuery010GetResponse rhs = ((StudentAdjustmentsQuery010GetResponse) other);
        return ((((((((((this.adjGroupInd == rhs.adjGroupInd)||((this.adjGroupInd!= null)&&this.adjGroupInd.equals(rhs.adjGroupInd)))&&((this.adjTargetInd == rhs.adjTargetInd)||((this.adjTargetInd!= null)&&this.adjTargetInd.equals(rhs.adjTargetInd))))&&((this.adjWaiverInd == rhs.adjWaiverInd)||((this.adjWaiverInd!= null)&&this.adjWaiverInd.equals(rhs.adjWaiverInd))))&&((this.adjSubstInd == rhs.adjSubstInd)||((this.adjSubstInd!= null)&&this.adjSubstInd.equals(rhs.adjSubstInd))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.adjProgramInd == rhs.adjProgramInd)||((this.adjProgramInd!= null)&&this.adjProgramInd.equals(rhs.adjProgramInd))))&&((this.adjAreaInd == rhs.adjAreaInd)||((this.adjAreaInd!= null)&&this.adjAreaInd.equals(rhs.adjAreaInd))));
    }

}
