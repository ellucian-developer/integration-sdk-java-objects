
package com.ellucian.generated.eedm.admission_recruitment_opportunities.v12_0;

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
 * Opportunity Status
 * <p>
 * The status of the recruitment opportunity.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "status",
    "statusReason"
})
@Generated("jsonschema2pojo")
public class OpportunityStatus {

    /**
     * Status
     * <p>
     * The status value.
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status value.")
    private OpportunityStatus.Status status;
    /**
     * Status Reason
     * <p>
     * The reason for the status.
     * 
     */
    @JsonProperty("statusReason")
    @JsonPropertyDescription("The reason for the status.")
    private Object statusReason;

    /**
     * Status
     * <p>
     * The status value.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public OpportunityStatus.Status getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status value.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(OpportunityStatus.Status status) {
        this.status = status;
    }

    public OpportunityStatus withStatus(OpportunityStatus.Status status) {
        this.status = status;
        return this;
    }

    /**
     * Status Reason
     * <p>
     * The reason for the status.
     * 
     */
    @JsonProperty("statusReason")
    public Object getStatusReason() {
        return statusReason;
    }

    /**
     * Status Reason
     * <p>
     * The reason for the status.
     * 
     */
    @JsonProperty("statusReason")
    public void setStatusReason(Object statusReason) {
        this.statusReason = statusReason;
    }

    public OpportunityStatus withStatusReason(Object statusReason) {
        this.statusReason = statusReason;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OpportunityStatus.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("statusReason");
        sb.append('=');
        sb.append(((this.statusReason == null)?"<null>":this.statusReason));
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
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.statusReason == null)? 0 :this.statusReason.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OpportunityStatus) == false) {
            return false;
        }
        OpportunityStatus rhs = ((OpportunityStatus) other);
        return (((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status)))&&((this.statusReason == rhs.statusReason)||((this.statusReason!= null)&&this.statusReason.equals(rhs.statusReason))));
    }


    /**
     * Status
     * <p>
     * The status value.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        OPEN("open"),
        WON("won"),
        LOST("lost");
        private final String value;
        private final static Map<String, OpportunityStatus.Status> CONSTANTS = new HashMap<String, OpportunityStatus.Status>();

        static {
            for (OpportunityStatus.Status c: values()) {
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
        public static OpportunityStatus.Status fromValue(String value) {
            OpportunityStatus.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
