
package com.ellucian.generated.bpapi.ban.student_sport_compliance.v1_0_0;

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
    "academicElig",
    "eligible",
    "term",
    "id",
    "sport",
    "status"
})
@Generated("jsonschema2pojo")
public class StudentSportCompliance100PostRequest {

    /**
     * Academic Eligibility
     * <p>
     * Lineage reference object : SGRSPRT_SAEL_CODE, Lookup lineage reference object : stvsael
     * 
     */
    @JsonProperty("academicElig")
    @JsonPropertyDescription("Lineage reference object : SGRSPRT_SAEL_CODE, Lookup lineage reference object : stvsael")
    private String academicElig;
    /**
     * Eligible
     * <p>
     * Lineage reference object : SGRSPRT_ELIG_CODE, Lookup lineage reference object : stvelig
     * 
     */
    @JsonProperty("eligible")
    @JsonPropertyDescription("Lineage reference object : SGRSPRT_ELIG_CODE, Lookup lineage reference object : stvelig")
    private String eligible;
    /**
     * Term
     * <p>
     * Lineage reference object : SGVATPT_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("term")
    @JsonPropertyDescription("Lineage reference object : SGVATPT_TERM_CODE, Lookup lineage reference object : stvterm")
    private String term;
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
     * Sport
     * <p>
     * Lineage reference object : SGRSPRT_ACTC_CODE, Lookup lineage reference object : stvactc
     * (Required)
     * 
     */
    @JsonProperty("sport")
    @JsonPropertyDescription("Lineage reference object : SGRSPRT_ACTC_CODE, Lookup lineage reference object : stvactc")
    private String sport;
    /**
     * Status
     * <p>
     * Lineage reference object : SGRSPRT_SPST_CODE, Lookup lineage reference object : stvspst
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("Lineage reference object : SGRSPRT_SPST_CODE, Lookup lineage reference object : stvspst")
    private String status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Academic Eligibility
     * <p>
     * Lineage reference object : SGRSPRT_SAEL_CODE, Lookup lineage reference object : stvsael
     * 
     */
    @JsonProperty("academicElig")
    public String getAcademicElig() {
        return academicElig;
    }

    /**
     * Academic Eligibility
     * <p>
     * Lineage reference object : SGRSPRT_SAEL_CODE, Lookup lineage reference object : stvsael
     * 
     */
    @JsonProperty("academicElig")
    public void setAcademicElig(String academicElig) {
        this.academicElig = academicElig;
    }

    public StudentSportCompliance100PostRequest withAcademicElig(String academicElig) {
        this.academicElig = academicElig;
        return this;
    }

    /**
     * Eligible
     * <p>
     * Lineage reference object : SGRSPRT_ELIG_CODE, Lookup lineage reference object : stvelig
     * 
     */
    @JsonProperty("eligible")
    public String getEligible() {
        return eligible;
    }

    /**
     * Eligible
     * <p>
     * Lineage reference object : SGRSPRT_ELIG_CODE, Lookup lineage reference object : stvelig
     * 
     */
    @JsonProperty("eligible")
    public void setEligible(String eligible) {
        this.eligible = eligible;
    }

    public StudentSportCompliance100PostRequest withEligible(String eligible) {
        this.eligible = eligible;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SGVATPT_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("term")
    public String getTerm() {
        return term;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SGVATPT_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("term")
    public void setTerm(String term) {
        this.term = term;
    }

    public StudentSportCompliance100PostRequest withTerm(String term) {
        this.term = term;
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

    public StudentSportCompliance100PostRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Sport
     * <p>
     * Lineage reference object : SGRSPRT_ACTC_CODE, Lookup lineage reference object : stvactc
     * (Required)
     * 
     */
    @JsonProperty("sport")
    public String getSport() {
        return sport;
    }

    /**
     * Sport
     * <p>
     * Lineage reference object : SGRSPRT_ACTC_CODE, Lookup lineage reference object : stvactc
     * (Required)
     * 
     */
    @JsonProperty("sport")
    public void setSport(String sport) {
        this.sport = sport;
    }

    public StudentSportCompliance100PostRequest withSport(String sport) {
        this.sport = sport;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SGRSPRT_SPST_CODE, Lookup lineage reference object : stvspst
     * 
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SGRSPRT_SPST_CODE, Lookup lineage reference object : stvspst
     * 
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public StudentSportCompliance100PostRequest withStatus(String status) {
        this.status = status;
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

    public StudentSportCompliance100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentSportCompliance100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("academicElig");
        sb.append('=');
        sb.append(((this.academicElig == null)?"<null>":this.academicElig));
        sb.append(',');
        sb.append("eligible");
        sb.append('=');
        sb.append(((this.eligible == null)?"<null>":this.eligible));
        sb.append(',');
        sb.append("term");
        sb.append('=');
        sb.append(((this.term == null)?"<null>":this.term));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("sport");
        sb.append('=');
        sb.append(((this.sport == null)?"<null>":this.sport));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
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
        result = ((result* 31)+((this.academicElig == null)? 0 :this.academicElig.hashCode()));
        result = ((result* 31)+((this.eligible == null)? 0 :this.eligible.hashCode()));
        result = ((result* 31)+((this.term == null)? 0 :this.term.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sport == null)? 0 :this.sport.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentSportCompliance100PostRequest) == false) {
            return false;
        }
        StudentSportCompliance100PostRequest rhs = ((StudentSportCompliance100PostRequest) other);
        return ((((((((this.academicElig == rhs.academicElig)||((this.academicElig!= null)&&this.academicElig.equals(rhs.academicElig)))&&((this.eligible == rhs.eligible)||((this.eligible!= null)&&this.eligible.equals(rhs.eligible))))&&((this.term == rhs.term)||((this.term!= null)&&this.term.equals(rhs.term))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sport == rhs.sport)||((this.sport!= null)&&this.sport.equals(rhs.sport))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
