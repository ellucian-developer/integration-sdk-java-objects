
package com.ellucian.generated.eedm.budget_codes.v12_0;

import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Budget Codes
 * <p>
 * Collections of budget phases for one or more fiscal years.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "code",
    "reportingSegment",
    "fiscalYear"
})
@Generated("jsonschema2pojo")
public class BudgetCodes {

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
     * The global identifier of the budget code.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the budget code.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the budget code.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the budget code.")
    private String title;
    /**
     * Description
     * <p>
     * The description of the budget code.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the budget code.")
    private String description;
    /**
     * Code
     * <p>
     * The code used to identify the budget code.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("The code used to identify the budget code.")
    private String code;
    /**
     * Reporting Segment
     * <p>
     * The segment with which the budget code is associated.
     * (Required)
     * 
     */
    @JsonProperty("reportingSegment")
    @JsonPropertyDescription("The segment with which the budget code is associated.")
    private String reportingSegment;
    /**
     * Fiscal Year
     * <p>
     * The fiscal year associated with the budget code.
     * 
     */
    @JsonProperty("fiscalYear")
    @JsonPropertyDescription("The fiscal year associated with the budget code.")
    private Object fiscalYear;

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

    public BudgetCodes withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the budget code.
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
     * The global identifier of the budget code.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public BudgetCodes withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the budget code.
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
     * The full name of the budget code.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public BudgetCodes withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the budget code.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the budget code.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public BudgetCodes withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Code
     * <p>
     * The code used to identify the budget code.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * The code used to identify the budget code.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public BudgetCodes withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Reporting Segment
     * <p>
     * The segment with which the budget code is associated.
     * (Required)
     * 
     */
    @JsonProperty("reportingSegment")
    public String getReportingSegment() {
        return reportingSegment;
    }

    /**
     * Reporting Segment
     * <p>
     * The segment with which the budget code is associated.
     * (Required)
     * 
     */
    @JsonProperty("reportingSegment")
    public void setReportingSegment(String reportingSegment) {
        this.reportingSegment = reportingSegment;
    }

    public BudgetCodes withReportingSegment(String reportingSegment) {
        this.reportingSegment = reportingSegment;
        return this;
    }

    /**
     * Fiscal Year
     * <p>
     * The fiscal year associated with the budget code.
     * 
     */
    @JsonProperty("fiscalYear")
    public Object getFiscalYear() {
        return fiscalYear;
    }

    /**
     * Fiscal Year
     * <p>
     * The fiscal year associated with the budget code.
     * 
     */
    @JsonProperty("fiscalYear")
    public void setFiscalYear(Object fiscalYear) {
        this.fiscalYear = fiscalYear;
    }

    public BudgetCodes withFiscalYear(Object fiscalYear) {
        this.fiscalYear = fiscalYear;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BudgetCodes.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("reportingSegment");
        sb.append('=');
        sb.append(((this.reportingSegment == null)?"<null>":this.reportingSegment));
        sb.append(',');
        sb.append("fiscalYear");
        sb.append('=');
        sb.append(((this.fiscalYear == null)?"<null>":this.fiscalYear));
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
        result = ((result* 31)+((this.reportingSegment == null)? 0 :this.reportingSegment.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.fiscalYear == null)? 0 :this.fiscalYear.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BudgetCodes) == false) {
            return false;
        }
        BudgetCodes rhs = ((BudgetCodes) other);
        return ((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.reportingSegment == rhs.reportingSegment)||((this.reportingSegment!= null)&&this.reportingSegment.equals(rhs.reportingSegment))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.fiscalYear == rhs.fiscalYear)||((this.fiscalYear!= null)&&this.fiscalYear.equals(rhs.fiscalYear))));
    }

}
