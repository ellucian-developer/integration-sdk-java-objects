
package com.ellucian.generated.eedm.fixed_asset_types.v12_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Fixed Asset Types
 * <p>
 * The valid list of asset types for depreciation purposes.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "code",
    "depreciationMethod",
    "salvageValue",
    "usefulLife"
})
@Generated("jsonschema2pojo")
public class FixedAssetTypes {

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
     * The global identifier of the fixed asset type.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the fixed asset type.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the fixed asset type.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the fixed asset type.")
    private String title;
    /**
     * Description
     * <p>
     * The description of the fixed asset type.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the fixed asset type.")
    private String description;
    /**
     * Code
     * <p>
     * A code that may be used to identify a fixed asset type.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("A code that may be used to identify a fixed asset type.")
    private String code;
    /**
     * Depreciation Method
     * <p>
     * The default method of depreciation associated with the fixed asset type.
     * 
     */
    @JsonProperty("depreciationMethod")
    @JsonPropertyDescription("The default method of depreciation associated with the fixed asset type.")
    private String depreciationMethod;
    /**
     * Salvage Value
     * <p>
     * The default percentage salvage value based on acquisition cost for the fixed asset type.
     * 
     */
    @JsonProperty("salvageValue")
    @JsonPropertyDescription("The default percentage salvage value based on acquisition cost for the fixed asset type.")
    private Object salvageValue;
    /**
     * Useful Life
     * <p>
     * The default useful life in years for the fixed asset type.
     * 
     */
    @JsonProperty("usefulLife")
    @JsonPropertyDescription("The default useful life in years for the fixed asset type.")
    private Object usefulLife;

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

    public FixedAssetTypes withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the fixed asset type.
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
     * The global identifier of the fixed asset type.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public FixedAssetTypes withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the fixed asset type.
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
     * The full name of the fixed asset type.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public FixedAssetTypes withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the fixed asset type.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the fixed asset type.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public FixedAssetTypes withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Code
     * <p>
     * A code that may be used to identify a fixed asset type.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * A code that may be used to identify a fixed asset type.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public FixedAssetTypes withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Depreciation Method
     * <p>
     * The default method of depreciation associated with the fixed asset type.
     * 
     */
    @JsonProperty("depreciationMethod")
    public String getDepreciationMethod() {
        return depreciationMethod;
    }

    /**
     * Depreciation Method
     * <p>
     * The default method of depreciation associated with the fixed asset type.
     * 
     */
    @JsonProperty("depreciationMethod")
    public void setDepreciationMethod(String depreciationMethod) {
        this.depreciationMethod = depreciationMethod;
    }

    public FixedAssetTypes withDepreciationMethod(String depreciationMethod) {
        this.depreciationMethod = depreciationMethod;
        return this;
    }

    /**
     * Salvage Value
     * <p>
     * The default percentage salvage value based on acquisition cost for the fixed asset type.
     * 
     */
    @JsonProperty("salvageValue")
    public Object getSalvageValue() {
        return salvageValue;
    }

    /**
     * Salvage Value
     * <p>
     * The default percentage salvage value based on acquisition cost for the fixed asset type.
     * 
     */
    @JsonProperty("salvageValue")
    public void setSalvageValue(Object salvageValue) {
        this.salvageValue = salvageValue;
    }

    public FixedAssetTypes withSalvageValue(Object salvageValue) {
        this.salvageValue = salvageValue;
        return this;
    }

    /**
     * Useful Life
     * <p>
     * The default useful life in years for the fixed asset type.
     * 
     */
    @JsonProperty("usefulLife")
    public Object getUsefulLife() {
        return usefulLife;
    }

    /**
     * Useful Life
     * <p>
     * The default useful life in years for the fixed asset type.
     * 
     */
    @JsonProperty("usefulLife")
    public void setUsefulLife(Object usefulLife) {
        this.usefulLife = usefulLife;
    }

    public FixedAssetTypes withUsefulLife(Object usefulLife) {
        this.usefulLife = usefulLife;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FixedAssetTypes.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("depreciationMethod");
        sb.append('=');
        sb.append(((this.depreciationMethod == null)?"<null>":this.depreciationMethod));
        sb.append(',');
        sb.append("salvageValue");
        sb.append('=');
        sb.append(((this.salvageValue == null)?"<null>":this.salvageValue));
        sb.append(',');
        sb.append("usefulLife");
        sb.append('=');
        sb.append(((this.usefulLife == null)?"<null>":this.usefulLife));
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
        result = ((result* 31)+((this.depreciationMethod == null)? 0 :this.depreciationMethod.hashCode()));
        result = ((result* 31)+((this.salvageValue == null)? 0 :this.salvageValue.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.usefulLife == null)? 0 :this.usefulLife.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FixedAssetTypes) == false) {
            return false;
        }
        FixedAssetTypes rhs = ((FixedAssetTypes) other);
        return (((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.depreciationMethod == rhs.depreciationMethod)||((this.depreciationMethod!= null)&&this.depreciationMethod.equals(rhs.depreciationMethod))))&&((this.salvageValue == rhs.salvageValue)||((this.salvageValue!= null)&&this.salvageValue.equals(rhs.salvageValue))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.usefulLife == rhs.usefulLife)||((this.usefulLife!= null)&&this.usefulLife.equals(rhs.usefulLife))));
    }

}
