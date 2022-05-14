
package com.ellucian.generated.eedm.leave_plans.v11_0;

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
 * Leave Plans
 * <p>
 * Information on leave plan options offered by the employer.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "code",
    "type",
    "category",
    "accrualMethod",
    "usage",
    "startOn",
    "endOn",
    "planYearStart",
    "alternateRolloverLeaveType",
    "accrualFrequency",
    "waitDays"
})
@Generated("jsonschema2pojo")
public class LeavePlans {

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
     * The global identifier of the leave plan.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the leave plan.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the leave plan.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the leave plan.")
    private String title;
    /**
     * Description
     * <p>
     * The description of the leave plan.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the leave plan.")
    private String description;
    /**
     * Code
     * <p>
     * A code that may be used to identify the leave plan.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("A code that may be used to identify the leave plan.")
    private String code;
    /**
     * Type
     * <p>
     * The type of leave (e.g. sick, vacation, etc.).
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of leave (e.g. sick, vacation, etc.).")
    private Type type;
    /**
     * Category
     * <p>
     * The category associated with the leave plan.
     * 
     */
    @JsonProperty("category")
    @JsonPropertyDescription("The category associated with the leave plan.")
    private Object category;
    /**
     * Accrual Method
     * <p>
     * The method by which leave can be accumulated.
     * (Required)
     * 
     */
    @JsonProperty("accrualMethod")
    @JsonPropertyDescription("The method by which leave can be accumulated.")
    private LeavePlans.AccrualMethod accrualMethod;
    /**
     * Usage
     * <p>
     * An indication whether the leave plan can be used before accrual or after accrual.
     * 
     */
    @JsonProperty("usage")
    @JsonPropertyDescription("An indication whether the leave plan can be used before accrual or after accrual.")
    private Object usage;
    /**
     * Start On
     * <p>
     * The start date of the leave plan.
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The start date of the leave plan.")
    private Object startOn;
    /**
     * End On
     * <p>
     * The end date of the leave plan.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The end date of the leave plan.")
    private Object endOn;
    /**
     * Plan Year Start
     * <p>
     * The default start of the plan in a year.
     * 
     */
    @JsonProperty("planYearStart")
    @JsonPropertyDescription("The default start of the plan in a year.")
    private Object planYearStart;
    /**
     * Alternate Rollover Leave Type
     * <p>
     * The type of leave that can be rolled over from one plan to another at the end of plan year.
     * 
     */
    @JsonProperty("alternateRolloverLeaveType")
    @JsonPropertyDescription("The type of leave that can be rolled over from one plan to another at the end of plan year.")
    private Object alternateRolloverLeaveType;
    /**
     * Accrual Frequency
     * <p>
     * The frequency at which leave accrues.
     * 
     */
    @JsonProperty("accrualFrequency")
    @JsonPropertyDescription("The frequency at which leave accrues.")
    private Object accrualFrequency;
    /**
     * Wait Days
     * <p>
     * The amount of time an employee must wait until he/she can take a leave.
     * 
     */
    @JsonProperty("waitDays")
    @JsonPropertyDescription("The amount of time an employee must wait until he/she can take a leave.")
    private Object waitDays;

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

    public LeavePlans withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the leave plan.
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
     * The global identifier of the leave plan.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public LeavePlans withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the leave plan.
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
     * The full name of the leave plan.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public LeavePlans withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the leave plan.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the leave plan.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public LeavePlans withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Code
     * <p>
     * A code that may be used to identify the leave plan.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * A code that may be used to identify the leave plan.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public LeavePlans withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Type
     * <p>
     * The type of leave (e.g. sick, vacation, etc.).
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of leave (e.g. sick, vacation, etc.).
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Type type) {
        this.type = type;
    }

    public LeavePlans withType(Type type) {
        this.type = type;
        return this;
    }

    /**
     * Category
     * <p>
     * The category associated with the leave plan.
     * 
     */
    @JsonProperty("category")
    public Object getCategory() {
        return category;
    }

    /**
     * Category
     * <p>
     * The category associated with the leave plan.
     * 
     */
    @JsonProperty("category")
    public void setCategory(Object category) {
        this.category = category;
    }

    public LeavePlans withCategory(Object category) {
        this.category = category;
        return this;
    }

    /**
     * Accrual Method
     * <p>
     * The method by which leave can be accumulated.
     * (Required)
     * 
     */
    @JsonProperty("accrualMethod")
    public LeavePlans.AccrualMethod getAccrualMethod() {
        return accrualMethod;
    }

    /**
     * Accrual Method
     * <p>
     * The method by which leave can be accumulated.
     * (Required)
     * 
     */
    @JsonProperty("accrualMethod")
    public void setAccrualMethod(LeavePlans.AccrualMethod accrualMethod) {
        this.accrualMethod = accrualMethod;
    }

    public LeavePlans withAccrualMethod(LeavePlans.AccrualMethod accrualMethod) {
        this.accrualMethod = accrualMethod;
        return this;
    }

    /**
     * Usage
     * <p>
     * An indication whether the leave plan can be used before accrual or after accrual.
     * 
     */
    @JsonProperty("usage")
    public Object getUsage() {
        return usage;
    }

    /**
     * Usage
     * <p>
     * An indication whether the leave plan can be used before accrual or after accrual.
     * 
     */
    @JsonProperty("usage")
    public void setUsage(Object usage) {
        this.usage = usage;
    }

    public LeavePlans withUsage(Object usage) {
        this.usage = usage;
        return this;
    }

    /**
     * Start On
     * <p>
     * The start date of the leave plan.
     * 
     */
    @JsonProperty("startOn")
    public Object getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The start date of the leave plan.
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Object startOn) {
        this.startOn = startOn;
    }

    public LeavePlans withStartOn(Object startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The end date of the leave plan.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The end date of the leave plan.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public LeavePlans withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Plan Year Start
     * <p>
     * The default start of the plan in a year.
     * 
     */
    @JsonProperty("planYearStart")
    public Object getPlanYearStart() {
        return planYearStart;
    }

    /**
     * Plan Year Start
     * <p>
     * The default start of the plan in a year.
     * 
     */
    @JsonProperty("planYearStart")
    public void setPlanYearStart(Object planYearStart) {
        this.planYearStart = planYearStart;
    }

    public LeavePlans withPlanYearStart(Object planYearStart) {
        this.planYearStart = planYearStart;
        return this;
    }

    /**
     * Alternate Rollover Leave Type
     * <p>
     * The type of leave that can be rolled over from one plan to another at the end of plan year.
     * 
     */
    @JsonProperty("alternateRolloverLeaveType")
    public Object getAlternateRolloverLeaveType() {
        return alternateRolloverLeaveType;
    }

    /**
     * Alternate Rollover Leave Type
     * <p>
     * The type of leave that can be rolled over from one plan to another at the end of plan year.
     * 
     */
    @JsonProperty("alternateRolloverLeaveType")
    public void setAlternateRolloverLeaveType(Object alternateRolloverLeaveType) {
        this.alternateRolloverLeaveType = alternateRolloverLeaveType;
    }

    public LeavePlans withAlternateRolloverLeaveType(Object alternateRolloverLeaveType) {
        this.alternateRolloverLeaveType = alternateRolloverLeaveType;
        return this;
    }

    /**
     * Accrual Frequency
     * <p>
     * The frequency at which leave accrues.
     * 
     */
    @JsonProperty("accrualFrequency")
    public Object getAccrualFrequency() {
        return accrualFrequency;
    }

    /**
     * Accrual Frequency
     * <p>
     * The frequency at which leave accrues.
     * 
     */
    @JsonProperty("accrualFrequency")
    public void setAccrualFrequency(Object accrualFrequency) {
        this.accrualFrequency = accrualFrequency;
    }

    public LeavePlans withAccrualFrequency(Object accrualFrequency) {
        this.accrualFrequency = accrualFrequency;
        return this;
    }

    /**
     * Wait Days
     * <p>
     * The amount of time an employee must wait until he/she can take a leave.
     * 
     */
    @JsonProperty("waitDays")
    public Object getWaitDays() {
        return waitDays;
    }

    /**
     * Wait Days
     * <p>
     * The amount of time an employee must wait until he/she can take a leave.
     * 
     */
    @JsonProperty("waitDays")
    public void setWaitDays(Object waitDays) {
        this.waitDays = waitDays;
    }

    public LeavePlans withWaitDays(Object waitDays) {
        this.waitDays = waitDays;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LeavePlans.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("accrualMethod");
        sb.append('=');
        sb.append(((this.accrualMethod == null)?"<null>":this.accrualMethod));
        sb.append(',');
        sb.append("usage");
        sb.append('=');
        sb.append(((this.usage == null)?"<null>":this.usage));
        sb.append(',');
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
        sb.append(',');
        sb.append("planYearStart");
        sb.append('=');
        sb.append(((this.planYearStart == null)?"<null>":this.planYearStart));
        sb.append(',');
        sb.append("alternateRolloverLeaveType");
        sb.append('=');
        sb.append(((this.alternateRolloverLeaveType == null)?"<null>":this.alternateRolloverLeaveType));
        sb.append(',');
        sb.append("accrualFrequency");
        sb.append('=');
        sb.append(((this.accrualFrequency == null)?"<null>":this.accrualFrequency));
        sb.append(',');
        sb.append("waitDays");
        sb.append('=');
        sb.append(((this.waitDays == null)?"<null>":this.waitDays));
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
        result = ((result* 31)+((this.usage == null)? 0 :this.usage.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.accrualMethod == null)? 0 :this.accrualMethod.hashCode()));
        result = ((result* 31)+((this.planYearStart == null)? 0 :this.planYearStart.hashCode()));
        result = ((result* 31)+((this.waitDays == null)? 0 :this.waitDays.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.alternateRolloverLeaveType == null)? 0 :this.alternateRolloverLeaveType.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.accrualFrequency == null)? 0 :this.accrualFrequency.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LeavePlans) == false) {
            return false;
        }
        LeavePlans rhs = ((LeavePlans) other);
        return ((((((((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.usage == rhs.usage)||((this.usage!= null)&&this.usage.equals(rhs.usage))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.accrualMethod == rhs.accrualMethod)||((this.accrualMethod!= null)&&this.accrualMethod.equals(rhs.accrualMethod))))&&((this.planYearStart == rhs.planYearStart)||((this.planYearStart!= null)&&this.planYearStart.equals(rhs.planYearStart))))&&((this.waitDays == rhs.waitDays)||((this.waitDays!= null)&&this.waitDays.equals(rhs.waitDays))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.alternateRolloverLeaveType == rhs.alternateRolloverLeaveType)||((this.alternateRolloverLeaveType!= null)&&this.alternateRolloverLeaveType.equals(rhs.alternateRolloverLeaveType))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.accrualFrequency == rhs.accrualFrequency)||((this.accrualFrequency!= null)&&this.accrualFrequency.equals(rhs.accrualFrequency))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))));
    }


    /**
     * Accrual Method
     * <p>
     * The method by which leave can be accumulated.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum AccrualMethod {

        FRONT_LOAD("frontLoad"),
        PAYROLL_ACCRUAL("payrollAccrual");
        private final String value;
        private final static Map<String, LeavePlans.AccrualMethod> CONSTANTS = new HashMap<String, LeavePlans.AccrualMethod>();

        static {
            for (LeavePlans.AccrualMethod c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        AccrualMethod(String value) {
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
        public static LeavePlans.AccrualMethod fromValue(String value) {
            LeavePlans.AccrualMethod constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
