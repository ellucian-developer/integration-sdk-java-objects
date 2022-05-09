
package com.ellucian.generated.eedm.admission_recruitment_opportunity_status_reasons.v7_0;

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
 * Admission Recruitment Opportunity Status Reasons
 * <p>
 * The list of valid reasons for admission recruitment opportunity statuses
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "status",
    "title",
    "description"
})
@Generated("jsonschema2pojo")
public class AdmissionRecruitmentOpportunityStatusReasons {

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    @JsonPropertyDescription("Metadata about the JSON payload")
    private Metadata metadata;
    /**
     * ID
     * <p>
     * The global identifier of the opportunity status reason
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the opportunity status reason")
    private String id;
    /**
     * Status
     * <p>
     * The status of a recruitment opportunity
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of a recruitment opportunity")
    private AdmissionRecruitmentOpportunityStatusReasons.Status status;
    /**
     * Title
     * <p>
     * The full name of the admission-recruitment-opportunity-status-reasons.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the admission-recruitment-opportunity-status-reasons.")
    private String title;
    /**
     * Description
     * <p>
     * The description of the opportunity status reason
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the opportunity status reason")
    private String description;

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public AdmissionRecruitmentOpportunityStatusReasons withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the opportunity status reason
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * The global identifier of the opportunity status reason
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public AdmissionRecruitmentOpportunityStatusReasons withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of a recruitment opportunity
     * (Required)
     * 
     */
    @JsonProperty("status")
    public AdmissionRecruitmentOpportunityStatusReasons.Status getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status of a recruitment opportunity
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(AdmissionRecruitmentOpportunityStatusReasons.Status status) {
        this.status = status;
    }

    public AdmissionRecruitmentOpportunityStatusReasons withStatus(AdmissionRecruitmentOpportunityStatusReasons.Status status) {
        this.status = status;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the admission-recruitment-opportunity-status-reasons.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * The full name of the admission-recruitment-opportunity-status-reasons.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public AdmissionRecruitmentOpportunityStatusReasons withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the opportunity status reason
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the opportunity status reason
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public AdmissionRecruitmentOpportunityStatusReasons withDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdmissionRecruitmentOpportunityStatusReasons.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
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
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdmissionRecruitmentOpportunityStatusReasons) == false) {
            return false;
        }
        AdmissionRecruitmentOpportunityStatusReasons rhs = ((AdmissionRecruitmentOpportunityStatusReasons) other);
        return ((((((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * Status
     * <p>
     * The status of a recruitment opportunity
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        OPEN("open"),
        WON("won"),
        LOST("lost");
        private final String value;
        private final static Map<String, AdmissionRecruitmentOpportunityStatusReasons.Status> CONSTANTS = new HashMap<String, AdmissionRecruitmentOpportunityStatusReasons.Status>();

        static {
            for (AdmissionRecruitmentOpportunityStatusReasons.Status c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Status(String value) {
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
        public static AdmissionRecruitmentOpportunityStatusReasons.Status fromValue(String value) {
            AdmissionRecruitmentOpportunityStatusReasons.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
