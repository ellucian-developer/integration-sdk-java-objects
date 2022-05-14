
package com.ellucian.generated.eedm.budget_phases.v12_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Budget Phases
 * <p>
 * Information on versions of working or final budgets.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "code",
    "budgetCode",
    "status",
    "basePhase"
})
@Generated("jsonschema2pojo")
public class BudgetPhases {

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
     * The global identifier of the budget phase.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the budget phase.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the budget phase.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the budget phase.")
    private String title;
    /**
     * Description
     * <p>
     * The description of the budget phase.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the budget phase.")
    private String description;
    /**
     * Code
     * <p>
     * The code used to identify the budget phase.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("The code used to identify the budget phase.")
    private String code;
    /**
     * Budget Code
     * <p>
     * The budget code with which the budget phase is associated.
     * (Required)
     * 
     */
    @JsonProperty("budgetCode")
    @JsonPropertyDescription("The budget code with which the budget phase is associated.")
    private BudgetCode budgetCode;
    /**
     * Status
     * <p>
     * The status of the budget phase.
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the budget phase.")
    private BudgetPhases.Status status;
    /**
     * Base Phase
     * <p>
     * The phase on which the budget phase is based.
     * 
     */
    @JsonProperty("basePhase")
    @JsonPropertyDescription("The phase on which the budget phase is based.")
    private Object basePhase;

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

    public BudgetPhases withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the budget phase.
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
     * The global identifier of the budget phase.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public BudgetPhases withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the budget phase.
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
     * The full name of the budget phase.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public BudgetPhases withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the budget phase.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the budget phase.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public BudgetPhases withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Code
     * <p>
     * The code used to identify the budget phase.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * The code used to identify the budget phase.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public BudgetPhases withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Budget Code
     * <p>
     * The budget code with which the budget phase is associated.
     * (Required)
     * 
     */
    @JsonProperty("budgetCode")
    public BudgetCode getBudgetCode() {
        return budgetCode;
    }

    /**
     * Budget Code
     * <p>
     * The budget code with which the budget phase is associated.
     * (Required)
     * 
     */
    @JsonProperty("budgetCode")
    public void setBudgetCode(BudgetCode budgetCode) {
        this.budgetCode = budgetCode;
    }

    public BudgetPhases withBudgetCode(BudgetCode budgetCode) {
        this.budgetCode = budgetCode;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of the budget phase.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public BudgetPhases.Status getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status of the budget phase.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(BudgetPhases.Status status) {
        this.status = status;
    }

    public BudgetPhases withStatus(BudgetPhases.Status status) {
        this.status = status;
        return this;
    }

    /**
     * Base Phase
     * <p>
     * The phase on which the budget phase is based.
     * 
     */
    @JsonProperty("basePhase")
    public Object getBasePhase() {
        return basePhase;
    }

    /**
     * Base Phase
     * <p>
     * The phase on which the budget phase is based.
     * 
     */
    @JsonProperty("basePhase")
    public void setBasePhase(Object basePhase) {
        this.basePhase = basePhase;
    }

    public BudgetPhases withBasePhase(Object basePhase) {
        this.basePhase = basePhase;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BudgetPhases.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("budgetCode");
        sb.append('=');
        sb.append(((this.budgetCode == null)?"<null>":this.budgetCode));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("basePhase");
        sb.append('=');
        sb.append(((this.basePhase == null)?"<null>":this.basePhase));
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
        result = ((result* 31)+((this.budgetCode == null)? 0 :this.budgetCode.hashCode()));
        result = ((result* 31)+((this.basePhase == null)? 0 :this.basePhase.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
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
        if ((other instanceof BudgetPhases) == false) {
            return false;
        }
        BudgetPhases rhs = ((BudgetPhases) other);
        return (((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.budgetCode == rhs.budgetCode)||((this.budgetCode!= null)&&this.budgetCode.equals(rhs.budgetCode))))&&((this.basePhase == rhs.basePhase)||((this.basePhase!= null)&&this.basePhase.equals(rhs.basePhase))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * Status
     * <p>
     * The status of the budget phase.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        OPEN("open"),
        CLOSED("closed");
        private final String value;
        private final static Map<String, BudgetPhases.Status> CONSTANTS = new HashMap<String, BudgetPhases.Status>();

        static {
            for (BudgetPhases.Status c: values()) {
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
        public static BudgetPhases.Status fromValue(String value) {
            BudgetPhases.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
