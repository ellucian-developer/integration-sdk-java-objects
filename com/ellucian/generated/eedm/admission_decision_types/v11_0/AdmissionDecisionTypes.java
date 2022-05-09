
package com.ellucian.generated.eedm.admission_decision_types.v11_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Admission Decision Types
 * <p>
 * The list of valid admission decision types.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "code",
    "decisionCategories"
})
@Generated("jsonschema2pojo")
public class AdmissionDecisionTypes {

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
     * The global identifier of the type of decision on admission application
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the type of decision on admission application")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the type of decision on admission application
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the type of decision on admission application")
    private String title;
    /**
     * Description
     * <p>
     * The description of the type of decision on admission application
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the type of decision on admission application")
    private String description;
    /**
     * Code
     * <p>
     * The code of the type of decision on admission application
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("The code of the type of decision on admission application")
    private String code;
    /**
     * Decision Categories
     * <p>
     * The list of categories that correspond to a decision type.
     * 
     */
    @JsonProperty("decisionCategories")
    @JsonPropertyDescription("The list of categories that correspond to a decision type.")
    private List<DecisionCategory> decisionCategories = new ArrayList<DecisionCategory>();

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

    public AdmissionDecisionTypes withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the type of decision on admission application
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
     * The global identifier of the type of decision on admission application
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public AdmissionDecisionTypes withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the type of decision on admission application
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
     * The full name of the type of decision on admission application
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public AdmissionDecisionTypes withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the type of decision on admission application
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the type of decision on admission application
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public AdmissionDecisionTypes withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Code
     * <p>
     * The code of the type of decision on admission application
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * The code of the type of decision on admission application
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public AdmissionDecisionTypes withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Decision Categories
     * <p>
     * The list of categories that correspond to a decision type.
     * 
     */
    @JsonProperty("decisionCategories")
    public List<DecisionCategory> getDecisionCategories() {
        return decisionCategories;
    }

    /**
     * Decision Categories
     * <p>
     * The list of categories that correspond to a decision type.
     * 
     */
    @JsonProperty("decisionCategories")
    public void setDecisionCategories(List<DecisionCategory> decisionCategories) {
        this.decisionCategories = decisionCategories;
    }

    public AdmissionDecisionTypes withDecisionCategories(List<DecisionCategory> decisionCategories) {
        this.decisionCategories = decisionCategories;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdmissionDecisionTypes.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("decisionCategories");
        sb.append('=');
        sb.append(((this.decisionCategories == null)?"<null>":this.decisionCategories));
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
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.decisionCategories == null)? 0 :this.decisionCategories.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdmissionDecisionTypes) == false) {
            return false;
        }
        AdmissionDecisionTypes rhs = ((AdmissionDecisionTypes) other);
        return (((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.decisionCategories == rhs.decisionCategories)||((this.decisionCategories!= null)&&this.decisionCategories.equals(rhs.decisionCategories))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))));
    }

}
