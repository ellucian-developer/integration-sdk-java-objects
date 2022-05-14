
package com.ellucian.generated.eedm.recruiting_cycles.v6_0;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Recruiting Cycles
 * <p>
 * Periods of time defined for specific recruiting activities.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "startOn",
    "endOn",
    "terms"
})
@Generated("jsonschema2pojo")
public class RecruitingCycles {

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
     * The global identifier of the recruiting-cycle.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the recruiting-cycle.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the recruiting-cycle.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the recruiting-cycle.")
    private String title;
    /**
     * Description
     * <p>
     * The description of the recruiting-cycle.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the recruiting-cycle.")
    private String description;
    /**
     * Start On
     * <p>
     * The first date of the recruiting cycle.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The first date of the recruiting cycle.")
    private Date startOn;
    /**
     * End On
     * <p>
     * The last date of the recruiting cycle.
     * (Required)
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The last date of the recruiting cycle.")
    private Date endOn;
    /**
     * Terms
     * <p>
     * The academic periods for which the recruiting efforts of the recruiting cycle are focused.
     * (Required)
     * 
     */
    @JsonProperty("terms")
    @JsonPropertyDescription("The academic periods for which the recruiting efforts of the recruiting cycle are focused.")
    private List<Term> terms = new ArrayList<Term>();

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

    public RecruitingCycles withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the recruiting-cycle.
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
     * The global identifier of the recruiting-cycle.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public RecruitingCycles withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the recruiting-cycle.
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
     * The full name of the recruiting-cycle.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public RecruitingCycles withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the recruiting-cycle.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the recruiting-cycle.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public RecruitingCycles withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Start On
     * <p>
     * The first date of the recruiting cycle.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    public Date getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The first date of the recruiting cycle.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Date startOn) {
        this.startOn = startOn;
    }

    public RecruitingCycles withStartOn(Date startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The last date of the recruiting cycle.
     * (Required)
     * 
     */
    @JsonProperty("endOn")
    public Date getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The last date of the recruiting cycle.
     * (Required)
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Date endOn) {
        this.endOn = endOn;
    }

    public RecruitingCycles withEndOn(Date endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Terms
     * <p>
     * The academic periods for which the recruiting efforts of the recruiting cycle are focused.
     * (Required)
     * 
     */
    @JsonProperty("terms")
    public List<Term> getTerms() {
        return terms;
    }

    /**
     * Terms
     * <p>
     * The academic periods for which the recruiting efforts of the recruiting cycle are focused.
     * (Required)
     * 
     */
    @JsonProperty("terms")
    public void setTerms(List<Term> terms) {
        this.terms = terms;
    }

    public RecruitingCycles withTerms(List<Term> terms) {
        this.terms = terms;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RecruitingCycles.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
        sb.append(',');
        sb.append("terms");
        sb.append('=');
        sb.append(((this.terms == null)?"<null>":this.terms));
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
        result = ((result* 31)+((this.terms == null)? 0 :this.terms.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RecruitingCycles) == false) {
            return false;
        }
        RecruitingCycles rhs = ((RecruitingCycles) other);
        return ((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.terms == rhs.terms)||((this.terms!= null)&&this.terms.equals(rhs.terms))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))));
    }

}
