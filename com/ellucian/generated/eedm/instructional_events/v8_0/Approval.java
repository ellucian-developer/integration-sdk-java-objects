
package com.ellucian.generated.eedm.instructional_events.v8_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "approvalType",
    "approvalEntity"
})
@Generated("jsonschema2pojo")
public class Approval {

    /**
     * Type
     * <p>
     * The type of approval granted.
     * (Required)
     * 
     */
    @JsonProperty("approvalType")
    @JsonPropertyDescription("The type of approval granted.")
    private Approval.ApprovalType approvalType;
    /**
     * Entity
     * <p>
     * The entity that granted approval.
     * (Required)
     * 
     */
    @JsonProperty("approvalEntity")
    @JsonPropertyDescription("The entity that granted approval.")
    private Approval.ApprovalEntity approvalEntity;

    /**
     * Type
     * <p>
     * The type of approval granted.
     * (Required)
     * 
     */
    @JsonProperty("approvalType")
    public Approval.ApprovalType getApprovalType() {
        return approvalType;
    }

    /**
     * Type
     * <p>
     * The type of approval granted.
     * (Required)
     * 
     */
    @JsonProperty("approvalType")
    public void setApprovalType(Approval.ApprovalType approvalType) {
        this.approvalType = approvalType;
    }

    public Approval withApprovalType(Approval.ApprovalType approvalType) {
        this.approvalType = approvalType;
        return this;
    }

    /**
     * Entity
     * <p>
     * The entity that granted approval.
     * (Required)
     * 
     */
    @JsonProperty("approvalEntity")
    public Approval.ApprovalEntity getApprovalEntity() {
        return approvalEntity;
    }

    /**
     * Entity
     * <p>
     * The entity that granted approval.
     * (Required)
     * 
     */
    @JsonProperty("approvalEntity")
    public void setApprovalEntity(Approval.ApprovalEntity approvalEntity) {
        this.approvalEntity = approvalEntity;
    }

    public Approval withApprovalEntity(Approval.ApprovalEntity approvalEntity) {
        this.approvalEntity = approvalEntity;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Approval.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("approvalType");
        sb.append('=');
        sb.append(((this.approvalType == null)?"<null>":this.approvalType));
        sb.append(',');
        sb.append("approvalEntity");
        sb.append('=');
        sb.append(((this.approvalEntity == null)?"<null>":this.approvalEntity));
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
        result = ((result* 31)+((this.approvalType == null)? 0 :this.approvalType.hashCode()));
        result = ((result* 31)+((this.approvalEntity == null)? 0 :this.approvalEntity.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Approval) == false) {
            return false;
        }
        Approval rhs = ((Approval) other);
        return (((this.approvalType == rhs.approvalType)||((this.approvalType!= null)&&this.approvalType.equals(rhs.approvalType)))&&((this.approvalEntity == rhs.approvalEntity)||((this.approvalEntity!= null)&&this.approvalEntity.equals(rhs.approvalEntity))));
    }


    /**
     * Entity
     * <p>
     * The entity that granted approval.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum ApprovalEntity {

        USER("user"),
        SYSTEM("system");
        private final String value;
        private final static Map<String, Approval.ApprovalEntity> CONSTANTS = new HashMap<String, Approval.ApprovalEntity>();

        static {
            for (Approval.ApprovalEntity c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ApprovalEntity(String value) {
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
        public static Approval.ApprovalEntity fromValue(String value) {
            Approval.ApprovalEntity constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Type
     * <p>
     * The type of approval granted.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum ApprovalType {

        INSTRUCTOR_AVAILABILITY("instructorAvailability"),
        INSTRUCTOR_CAPACITY("instructorCapacity"),
        ROOM_AVAILABILITY("roomAvailability"),
        ROOM_CAPACITY("roomCapacity");
        private final String value;
        private final static Map<String, Approval.ApprovalType> CONSTANTS = new HashMap<String, Approval.ApprovalType>();

        static {
            for (Approval.ApprovalType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ApprovalType(String value) {
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
        public static Approval.ApprovalType fromValue(String value) {
            Approval.ApprovalType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
