
package com.ellucian.generated.eedm.room_rates.v10_0;

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
 * Room Rates
 * <p>
 * The fee charge for room for a specified time interval.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "code",
    "description",
    "startOn",
    "endOn",
    "rates",
    "academicPeriod",
    "accountingCode",
    "cancelAccountingCode"
})
@Generated("jsonschema2pojo")
public class RoomRates {

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
     * The global identifier of the Room Rate.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the Room Rate.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the Room Rate.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the Room Rate.")
    private String title;
    /**
     * Code
     * <p>
     * The code that identifies the Room Rate.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("The code that identifies the Room Rate.")
    private String code;
    /**
     * Description
     * <p>
     * The description of the Room Rate.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the Room Rate.")
    private String description;
    /**
     * Start On
     * <p>
     * The first date the rate may be applied to a room.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The first date the rate may be applied to a room.")
    private Date startOn;
    /**
     * End On
     * <p>
     * The last date the rate may be applied to a room.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The last date the rate may be applied to a room.")
    private Object endOn;
    /**
     * Rates
     * <p>
     * The rates charged for the room.
     * (Required)
     * 
     */
    @JsonProperty("rates")
    @JsonPropertyDescription("The rates charged for the room.")
    private List<Rate> rates = new ArrayList<Rate>();
    /**
     * Academic Period
     * <p>
     * A term within an academic year for which the rate is defined.
     * 
     */
    @JsonProperty("academicPeriod")
    @JsonPropertyDescription("A term within an academic year for which the rate is defined.")
    private Object academicPeriod;
    /**
     * Accounting Code
     * <p>
     * The default accounting code to be used when using the room rate.
     * 
     */
    @JsonProperty("accountingCode")
    @JsonPropertyDescription("The default accounting code to be used when using the room rate.")
    private Object accountingCode;
    /**
     * Cancel Accounting Code
     * <p>
     * The default accounting code to be used when a charge using the room rate is canceled.
     * 
     */
    @JsonProperty("cancelAccountingCode")
    @JsonPropertyDescription("The default accounting code to be used when a charge using the room rate is canceled.")
    private Object cancelAccountingCode;

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

    public RoomRates withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the Room Rate.
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
     * The global identifier of the Room Rate.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public RoomRates withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the Room Rate.
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
     * The full name of the Room Rate.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public RoomRates withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Code
     * <p>
     * The code that identifies the Room Rate.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * The code that identifies the Room Rate.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public RoomRates withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the Room Rate.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the Room Rate.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public RoomRates withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Start On
     * <p>
     * The first date the rate may be applied to a room.
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
     * The first date the rate may be applied to a room.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Date startOn) {
        this.startOn = startOn;
    }

    public RoomRates withStartOn(Date startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The last date the rate may be applied to a room.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The last date the rate may be applied to a room.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public RoomRates withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Rates
     * <p>
     * The rates charged for the room.
     * (Required)
     * 
     */
    @JsonProperty("rates")
    public List<Rate> getRates() {
        return rates;
    }

    /**
     * Rates
     * <p>
     * The rates charged for the room.
     * (Required)
     * 
     */
    @JsonProperty("rates")
    public void setRates(List<Rate> rates) {
        this.rates = rates;
    }

    public RoomRates withRates(List<Rate> rates) {
        this.rates = rates;
        return this;
    }

    /**
     * Academic Period
     * <p>
     * A term within an academic year for which the rate is defined.
     * 
     */
    @JsonProperty("academicPeriod")
    public Object getAcademicPeriod() {
        return academicPeriod;
    }

    /**
     * Academic Period
     * <p>
     * A term within an academic year for which the rate is defined.
     * 
     */
    @JsonProperty("academicPeriod")
    public void setAcademicPeriod(Object academicPeriod) {
        this.academicPeriod = academicPeriod;
    }

    public RoomRates withAcademicPeriod(Object academicPeriod) {
        this.academicPeriod = academicPeriod;
        return this;
    }

    /**
     * Accounting Code
     * <p>
     * The default accounting code to be used when using the room rate.
     * 
     */
    @JsonProperty("accountingCode")
    public Object getAccountingCode() {
        return accountingCode;
    }

    /**
     * Accounting Code
     * <p>
     * The default accounting code to be used when using the room rate.
     * 
     */
    @JsonProperty("accountingCode")
    public void setAccountingCode(Object accountingCode) {
        this.accountingCode = accountingCode;
    }

    public RoomRates withAccountingCode(Object accountingCode) {
        this.accountingCode = accountingCode;
        return this;
    }

    /**
     * Cancel Accounting Code
     * <p>
     * The default accounting code to be used when a charge using the room rate is canceled.
     * 
     */
    @JsonProperty("cancelAccountingCode")
    public Object getCancelAccountingCode() {
        return cancelAccountingCode;
    }

    /**
     * Cancel Accounting Code
     * <p>
     * The default accounting code to be used when a charge using the room rate is canceled.
     * 
     */
    @JsonProperty("cancelAccountingCode")
    public void setCancelAccountingCode(Object cancelAccountingCode) {
        this.cancelAccountingCode = cancelAccountingCode;
    }

    public RoomRates withCancelAccountingCode(Object cancelAccountingCode) {
        this.cancelAccountingCode = cancelAccountingCode;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RoomRates.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
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
        sb.append("rates");
        sb.append('=');
        sb.append(((this.rates == null)?"<null>":this.rates));
        sb.append(',');
        sb.append("academicPeriod");
        sb.append('=');
        sb.append(((this.academicPeriod == null)?"<null>":this.academicPeriod));
        sb.append(',');
        sb.append("accountingCode");
        sb.append('=');
        sb.append(((this.accountingCode == null)?"<null>":this.accountingCode));
        sb.append(',');
        sb.append("cancelAccountingCode");
        sb.append('=');
        sb.append(((this.cancelAccountingCode == null)?"<null>":this.cancelAccountingCode));
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
        result = ((result* 31)+((this.accountingCode == null)? 0 :this.accountingCode.hashCode()));
        result = ((result* 31)+((this.cancelAccountingCode == null)? 0 :this.cancelAccountingCode.hashCode()));
        result = ((result* 31)+((this.rates == null)? 0 :this.rates.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.academicPeriod == null)? 0 :this.academicPeriod.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RoomRates) == false) {
            return false;
        }
        RoomRates rhs = ((RoomRates) other);
        return ((((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.accountingCode == rhs.accountingCode)||((this.accountingCode!= null)&&this.accountingCode.equals(rhs.accountingCode))))&&((this.cancelAccountingCode == rhs.cancelAccountingCode)||((this.cancelAccountingCode!= null)&&this.cancelAccountingCode.equals(rhs.cancelAccountingCode))))&&((this.rates == rhs.rates)||((this.rates!= null)&&this.rates.equals(rhs.rates))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.academicPeriod == rhs.academicPeriod)||((this.academicPeriod!= null)&&this.academicPeriod.equals(rhs.academicPeriod))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))));
    }

}
