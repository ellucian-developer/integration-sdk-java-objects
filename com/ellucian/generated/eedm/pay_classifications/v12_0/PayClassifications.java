
package com.ellucian.generated.eedm.pay_classifications.v12_0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Pay Classifications
 * <p>
 * Information on the categorizations of pay.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "code",
    "compensationTypes",
    "payTable",
    "classificationType",
    "payGroup",
    "status"
})
@Generated("jsonschema2pojo")
public class PayClassifications {

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
     * The global identifier of the pay classification.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the pay classification.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the pay classification.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the pay classification.")
    private String title;
    /**
     * Code
     * <p>
     * A code that may be used to identify the pay classification.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("A code that may be used to identify the pay classification.")
    private String code;
    /**
     * Compensation Types
     * <p>
     * The compensation types associated with the pay classification (e.g. salary and/or wages).
     * (Required)
     * 
     */
    @JsonProperty("compensationTypes")
    @JsonPropertyDescription("The compensation types associated with the pay classification (e.g. salary and/or wages).")
    private List<CompensationType> compensationTypes = new ArrayList<CompensationType>();
    /**
     * Pay Table
     * <p>
     * The pay table associated with the pay classification (e.g. AD for Admin, FAC for Faculty, etc.).
     * 
     */
    @JsonProperty("payTable")
    @JsonPropertyDescription("The pay table associated with the pay classification (e.g. AD for Admin, FAC for Faculty, etc.).")
    private String payTable;
    /**
     * Classification Type
     * <p>
     * The type of pay classification (e.g. matrix or range).
     * (Required)
     * 
     */
    @JsonProperty("classificationType")
    @JsonPropertyDescription("The type of pay classification (e.g. matrix or range).")
    private PayClassifications.ClassificationType classificationType;
    /**
     * Pay Group
     * <p>
     * The pay group associated with the pay classification (e.g. 2014, 2016, 48, 35, etc.).
     * 
     */
    @JsonProperty("payGroup")
    @JsonPropertyDescription("The pay group associated with the pay classification (e.g. 2014, 2016, 48, 35, etc.).")
    private String payGroup;
    /**
     * Status
     * <p>
     * The status of the pay classification (e.g. active or inactive).
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the pay classification (e.g. active or inactive).")
    private PayClassifications.Status status;

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

    public PayClassifications withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the pay classification.
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
     * The global identifier of the pay classification.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public PayClassifications withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the pay classification.
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
     * The full name of the pay classification.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public PayClassifications withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Code
     * <p>
     * A code that may be used to identify the pay classification.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * A code that may be used to identify the pay classification.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public PayClassifications withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Compensation Types
     * <p>
     * The compensation types associated with the pay classification (e.g. salary and/or wages).
     * (Required)
     * 
     */
    @JsonProperty("compensationTypes")
    public List<CompensationType> getCompensationTypes() {
        return compensationTypes;
    }

    /**
     * Compensation Types
     * <p>
     * The compensation types associated with the pay classification (e.g. salary and/or wages).
     * (Required)
     * 
     */
    @JsonProperty("compensationTypes")
    public void setCompensationTypes(List<CompensationType> compensationTypes) {
        this.compensationTypes = compensationTypes;
    }

    public PayClassifications withCompensationTypes(List<CompensationType> compensationTypes) {
        this.compensationTypes = compensationTypes;
        return this;
    }

    /**
     * Pay Table
     * <p>
     * The pay table associated with the pay classification (e.g. AD for Admin, FAC for Faculty, etc.).
     * 
     */
    @JsonProperty("payTable")
    public String getPayTable() {
        return payTable;
    }

    /**
     * Pay Table
     * <p>
     * The pay table associated with the pay classification (e.g. AD for Admin, FAC for Faculty, etc.).
     * 
     */
    @JsonProperty("payTable")
    public void setPayTable(String payTable) {
        this.payTable = payTable;
    }

    public PayClassifications withPayTable(String payTable) {
        this.payTable = payTable;
        return this;
    }

    /**
     * Classification Type
     * <p>
     * The type of pay classification (e.g. matrix or range).
     * (Required)
     * 
     */
    @JsonProperty("classificationType")
    public PayClassifications.ClassificationType getClassificationType() {
        return classificationType;
    }

    /**
     * Classification Type
     * <p>
     * The type of pay classification (e.g. matrix or range).
     * (Required)
     * 
     */
    @JsonProperty("classificationType")
    public void setClassificationType(PayClassifications.ClassificationType classificationType) {
        this.classificationType = classificationType;
    }

    public PayClassifications withClassificationType(PayClassifications.ClassificationType classificationType) {
        this.classificationType = classificationType;
        return this;
    }

    /**
     * Pay Group
     * <p>
     * The pay group associated with the pay classification (e.g. 2014, 2016, 48, 35, etc.).
     * 
     */
    @JsonProperty("payGroup")
    public String getPayGroup() {
        return payGroup;
    }

    /**
     * Pay Group
     * <p>
     * The pay group associated with the pay classification (e.g. 2014, 2016, 48, 35, etc.).
     * 
     */
    @JsonProperty("payGroup")
    public void setPayGroup(String payGroup) {
        this.payGroup = payGroup;
    }

    public PayClassifications withPayGroup(String payGroup) {
        this.payGroup = payGroup;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of the pay classification (e.g. active or inactive).
     * (Required)
     * 
     */
    @JsonProperty("status")
    public PayClassifications.Status getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status of the pay classification (e.g. active or inactive).
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(PayClassifications.Status status) {
        this.status = status;
    }

    public PayClassifications withStatus(PayClassifications.Status status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PayClassifications.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("compensationTypes");
        sb.append('=');
        sb.append(((this.compensationTypes == null)?"<null>":this.compensationTypes));
        sb.append(',');
        sb.append("payTable");
        sb.append('=');
        sb.append(((this.payTable == null)?"<null>":this.payTable));
        sb.append(',');
        sb.append("classificationType");
        sb.append('=');
        sb.append(((this.classificationType == null)?"<null>":this.classificationType));
        sb.append(',');
        sb.append("payGroup");
        sb.append('=');
        sb.append(((this.payGroup == null)?"<null>":this.payGroup));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
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
        result = ((result* 31)+((this.payTable == null)? 0 :this.payTable.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.compensationTypes == null)? 0 :this.compensationTypes.hashCode()));
        result = ((result* 31)+((this.classificationType == null)? 0 :this.classificationType.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.payGroup == null)? 0 :this.payGroup.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PayClassifications) == false) {
            return false;
        }
        PayClassifications rhs = ((PayClassifications) other);
        return ((((((((((this.payTable == rhs.payTable)||((this.payTable!= null)&&this.payTable.equals(rhs.payTable)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.compensationTypes == rhs.compensationTypes)||((this.compensationTypes!= null)&&this.compensationTypes.equals(rhs.compensationTypes))))&&((this.classificationType == rhs.classificationType)||((this.classificationType!= null)&&this.classificationType.equals(rhs.classificationType))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.payGroup == rhs.payGroup)||((this.payGroup!= null)&&this.payGroup.equals(rhs.payGroup))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * Classification Type
     * <p>
     * The type of pay classification (e.g. matrix or range).
     * 
     */
    @Generated("jsonschema2pojo")
    public enum ClassificationType {

        MATRIX("matrix"),
        RANGE("range");
        private final String value;
        private final static Map<String, PayClassifications.ClassificationType> CONSTANTS = new HashMap<String, PayClassifications.ClassificationType>();

        static {
            for (PayClassifications.ClassificationType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ClassificationType(String value) {
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
        public static PayClassifications.ClassificationType fromValue(String value) {
            PayClassifications.ClassificationType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Status
     * <p>
     * The status of the pay classification (e.g. active or inactive).
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        ACTIVE("active"),
        INACTIVE("inactive");
        private final String value;
        private final static Map<String, PayClassifications.Status> CONSTANTS = new HashMap<String, PayClassifications.Status>();

        static {
            for (PayClassifications.Status c: values()) {
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
        public static PayClassifications.Status fromValue(String value) {
            PayClassifications.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
