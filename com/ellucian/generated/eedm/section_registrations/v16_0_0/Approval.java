
package com.ellucian.generated.eedm.section_registrations.v16_0_0;

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
     * The entity granting approval.
     * (Required)
     * 
     */
    @JsonProperty("approvalEntity")
    @JsonPropertyDescription("The entity granting approval.")
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
     * The entity granting approval.
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
     * The entity granting approval.
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

    @java.lang.Override
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

    @java.lang.Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.approvalType == null)? 0 :this.approvalType.hashCode()));
        result = ((result* 31)+((this.approvalEntity == null)? 0 :this.approvalEntity.hashCode()));
        return result;
    }

    @java.lang.Override
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
     * The entity granting approval.
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

        @java.lang.Override
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

        ALL("all");
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

        @java.lang.Override
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
