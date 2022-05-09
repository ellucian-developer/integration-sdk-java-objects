
package com.ellucian.generated.eedm.pay_classes.v12_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Pay Classes
 * <p>
 * The standard method of paying employees.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "code",
    "paysPerYear",
    "classType",
    "payCycle",
    "payFrequency",
    "hoursPerPeriod",
    "status",
    "compensationType"
})
@Generated("jsonschema2pojo")
public class PayClasses {

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
     * The global identifier of the pay class.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the pay class.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the pay class.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the pay class.")
    private String title;
    /**
     * Description
     * <p>
     * The description of the pay class.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the pay class.")
    private String description;
    /**
     * Code
     * <p>
     * A code that may be used to identify the pay class.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("A code that may be used to identify the pay class.")
    private String code;
    /**
     * Pays Per Year
     * <p>
     * The number of pays per year employees are scheduled to receive.
     * 
     */
    @JsonProperty("paysPerYear")
    @JsonPropertyDescription("The number of pays per year employees are scheduled to receive.")
    private Object paysPerYear;
    /**
     * Class Type
     * <p>
     * An indicator if the pay class is supplemental to (used in addition to) another pay class.
     * 
     */
    @JsonProperty("classType")
    @JsonPropertyDescription("An indicator if the pay class is supplemental to (used in addition to) another pay class.")
    private Object classType;
    /**
     * Pay Cycle
     * <p>
     * The cycle which determines how employees are paid for the given pay class.
     * 
     */
    @JsonProperty("payCycle")
    @JsonPropertyDescription("The cycle which determines how employees are paid for the given pay class.")
    private Object payCycle;
    /**
     * Pay Frequency
     * <p>
     * The frequency at which employees are paid when they are working.
     * 
     */
    @JsonProperty("payFrequency")
    @JsonPropertyDescription("The frequency at which employees are paid when they are working.")
    private Object payFrequency;
    /**
     * Hours Per Period
     * <p>
     * The default pay period work hours for positions associated with the pay class.
     * 
     */
    @JsonProperty("hoursPerPeriod")
    @JsonPropertyDescription("The default pay period work hours for positions associated with the pay class.")
    private List<HoursPerPeriod> hoursPerPeriod = new ArrayList<HoursPerPeriod>();
    /**
     * Status
     * <p>
     * The status of the pay class (e.g. active or inactive).
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the pay class (e.g. active or inactive).")
    private Object status;
    /**
     * Compensation Type
     * <p>
     * The compensation type associated with the pay class (e.g. salary or wages).
     * 
     */
    @JsonProperty("compensationType")
    @JsonPropertyDescription("The compensation type associated with the pay class (e.g. salary or wages).")
    private Object compensationType;

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

    public PayClasses withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the pay class.
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
     * The global identifier of the pay class.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public PayClasses withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the pay class.
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
     * The full name of the pay class.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public PayClasses withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the pay class.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the pay class.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public PayClasses withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Code
     * <p>
     * A code that may be used to identify the pay class.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * A code that may be used to identify the pay class.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public PayClasses withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Pays Per Year
     * <p>
     * The number of pays per year employees are scheduled to receive.
     * 
     */
    @JsonProperty("paysPerYear")
    public Object getPaysPerYear() {
        return paysPerYear;
    }

    /**
     * Pays Per Year
     * <p>
     * The number of pays per year employees are scheduled to receive.
     * 
     */
    @JsonProperty("paysPerYear")
    public void setPaysPerYear(Object paysPerYear) {
        this.paysPerYear = paysPerYear;
    }

    public PayClasses withPaysPerYear(Object paysPerYear) {
        this.paysPerYear = paysPerYear;
        return this;
    }

    /**
     * Class Type
     * <p>
     * An indicator if the pay class is supplemental to (used in addition to) another pay class.
     * 
     */
    @JsonProperty("classType")
    public Object getClassType() {
        return classType;
    }

    /**
     * Class Type
     * <p>
     * An indicator if the pay class is supplemental to (used in addition to) another pay class.
     * 
     */
    @JsonProperty("classType")
    public void setClassType(Object classType) {
        this.classType = classType;
    }

    public PayClasses withClassType(Object classType) {
        this.classType = classType;
        return this;
    }

    /**
     * Pay Cycle
     * <p>
     * The cycle which determines how employees are paid for the given pay class.
     * 
     */
    @JsonProperty("payCycle")
    public Object getPayCycle() {
        return payCycle;
    }

    /**
     * Pay Cycle
     * <p>
     * The cycle which determines how employees are paid for the given pay class.
     * 
     */
    @JsonProperty("payCycle")
    public void setPayCycle(Object payCycle) {
        this.payCycle = payCycle;
    }

    public PayClasses withPayCycle(Object payCycle) {
        this.payCycle = payCycle;
        return this;
    }

    /**
     * Pay Frequency
     * <p>
     * The frequency at which employees are paid when they are working.
     * 
     */
    @JsonProperty("payFrequency")
    public Object getPayFrequency() {
        return payFrequency;
    }

    /**
     * Pay Frequency
     * <p>
     * The frequency at which employees are paid when they are working.
     * 
     */
    @JsonProperty("payFrequency")
    public void setPayFrequency(Object payFrequency) {
        this.payFrequency = payFrequency;
    }

    public PayClasses withPayFrequency(Object payFrequency) {
        this.payFrequency = payFrequency;
        return this;
    }

    /**
     * Hours Per Period
     * <p>
     * The default pay period work hours for positions associated with the pay class.
     * 
     */
    @JsonProperty("hoursPerPeriod")
    public List<HoursPerPeriod> getHoursPerPeriod() {
        return hoursPerPeriod;
    }

    /**
     * Hours Per Period
     * <p>
     * The default pay period work hours for positions associated with the pay class.
     * 
     */
    @JsonProperty("hoursPerPeriod")
    public void setHoursPerPeriod(List<HoursPerPeriod> hoursPerPeriod) {
        this.hoursPerPeriod = hoursPerPeriod;
    }

    public PayClasses withHoursPerPeriod(List<HoursPerPeriod> hoursPerPeriod) {
        this.hoursPerPeriod = hoursPerPeriod;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of the pay class (e.g. active or inactive).
     * 
     */
    @JsonProperty("status")
    public Object getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status of the pay class (e.g. active or inactive).
     * 
     */
    @JsonProperty("status")
    public void setStatus(Object status) {
        this.status = status;
    }

    public PayClasses withStatus(Object status) {
        this.status = status;
        return this;
    }

    /**
     * Compensation Type
     * <p>
     * The compensation type associated with the pay class (e.g. salary or wages).
     * 
     */
    @JsonProperty("compensationType")
    public Object getCompensationType() {
        return compensationType;
    }

    /**
     * Compensation Type
     * <p>
     * The compensation type associated with the pay class (e.g. salary or wages).
     * 
     */
    @JsonProperty("compensationType")
    public void setCompensationType(Object compensationType) {
        this.compensationType = compensationType;
    }

    public PayClasses withCompensationType(Object compensationType) {
        this.compensationType = compensationType;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PayClasses.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("paysPerYear");
        sb.append('=');
        sb.append(((this.paysPerYear == null)?"<null>":this.paysPerYear));
        sb.append(',');
        sb.append("classType");
        sb.append('=');
        sb.append(((this.classType == null)?"<null>":this.classType));
        sb.append(',');
        sb.append("payCycle");
        sb.append('=');
        sb.append(((this.payCycle == null)?"<null>":this.payCycle));
        sb.append(',');
        sb.append("payFrequency");
        sb.append('=');
        sb.append(((this.payFrequency == null)?"<null>":this.payFrequency));
        sb.append(',');
        sb.append("hoursPerPeriod");
        sb.append('=');
        sb.append(((this.hoursPerPeriod == null)?"<null>":this.hoursPerPeriod));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("compensationType");
        sb.append('=');
        sb.append(((this.compensationType == null)?"<null>":this.compensationType));
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
        result = ((result* 31)+((this.payFrequency == null)? 0 :this.payFrequency.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.paysPerYear == null)? 0 :this.paysPerYear.hashCode()));
        result = ((result* 31)+((this.hoursPerPeriod == null)? 0 :this.hoursPerPeriod.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.payCycle == null)? 0 :this.payCycle.hashCode()));
        result = ((result* 31)+((this.classType == null)? 0 :this.classType.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.compensationType == null)? 0 :this.compensationType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PayClasses) == false) {
            return false;
        }
        PayClasses rhs = ((PayClasses) other);
        return (((((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.payFrequency == rhs.payFrequency)||((this.payFrequency!= null)&&this.payFrequency.equals(rhs.payFrequency))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.paysPerYear == rhs.paysPerYear)||((this.paysPerYear!= null)&&this.paysPerYear.equals(rhs.paysPerYear))))&&((this.hoursPerPeriod == rhs.hoursPerPeriod)||((this.hoursPerPeriod!= null)&&this.hoursPerPeriod.equals(rhs.hoursPerPeriod))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.payCycle == rhs.payCycle)||((this.payCycle!= null)&&this.payCycle.equals(rhs.payCycle))))&&((this.classType == rhs.classType)||((this.classType!= null)&&this.classType.equals(rhs.classType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.compensationType == rhs.compensationType)||((this.compensationType!= null)&&this.compensationType.equals(rhs.compensationType))));
    }

}
