
package com.ellucian.generated.eedm.fixed_assets.v12_0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
 * Fixed Assets
 * <p>
 * Details about assets for long-term use that are not likely to be converted quickly into cash (for example land, buildings, or equipment).
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "description",
    "tag",
    "type",
    "category",
    "capitalizationStatus",
    "acquisitionMethod",
    "status",
    "condition",
    "location",
    "building",
    "room",
    "insuredValue",
    "marketValue",
    "replacementValue",
    "acquisitionCost",
    "accumulatedDepreciation",
    "depreciationMethod",
    "salvageValue",
    "usefulLife",
    "depreciationExpenseAccount",
    "renewalCost",
    "responsiblePersons"
})
@Generated("jsonschema2pojo")
public class FixedAssets {

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
     * The global identifier of the fixed asset.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the fixed asset.")
    private String id;
    /**
     * Description
     * <p>
     * The description of the fixed asset.
     * (Required)
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the fixed asset.")
    private String description;
    /**
     * Tag
     * <p>
     * A unique user defined or system generated number, usually visible on the tag of the asset.
     * (Required)
     * 
     */
    @JsonProperty("tag")
    @JsonPropertyDescription("A unique user defined or system generated number, usually visible on the tag of the asset.")
    private String tag;
    /**
     * Type
     * <p>
     * A code which describes an asset type for depreciation purposes (e.g. office equipment, athletic equipment, classroom furniture).
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A code which describes an asset type for depreciation purposes (e.g. office equipment, athletic equipment, classroom furniture).")
    private Object type;
    /**
     * Category
     * <p>
     * The category associated with the fixed asset (e.g. equipment).
     * 
     */
    @JsonProperty("category")
    @JsonPropertyDescription("The category associated with the fixed asset (e.g. equipment).")
    private Object category;
    /**
     * Capitalization Status
     * <p>
     * The capitalization status of the fixed asset.
     * (Required)
     * 
     */
    @JsonProperty("capitalizationStatus")
    @JsonPropertyDescription("The capitalization status of the fixed asset.")
    private FixedAssets.CapitalizationStatus capitalizationStatus;
    /**
     * Acquisition Method
     * <p>
     * The acquisition method associated with the fixed asset.
     * (Required)
     * 
     */
    @JsonProperty("acquisitionMethod")
    @JsonPropertyDescription("The acquisition method associated with the fixed asset.")
    private FixedAssets.AcquisitionMethod acquisitionMethod;
    /**
     * Status
     * <p>
     * A status indicating whether the asset has been disposed of or written off.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("A status indicating whether the asset has been disposed of or written off.")
    private Object status;
    /**
     * Condition
     * <p>
     * The condition of the fixed asset.
     * 
     */
    @JsonProperty("condition")
    @JsonPropertyDescription("The condition of the fixed asset.")
    private String condition;
    /**
     * Location
     * <p>
     * The location associated with the fixed asset.
     * 
     */
    @JsonProperty("location")
    @JsonPropertyDescription("The location associated with the fixed asset.")
    private String location;
    /**
     * Building
     * <p>
     * The building with which the fixed asset is associated.
     * 
     */
    @JsonProperty("building")
    @JsonPropertyDescription("The building with which the fixed asset is associated.")
    private Object building;
    /**
     * Room
     * <p>
     * The room with which the fixed asset is associated.
     * 
     */
    @JsonProperty("room")
    @JsonPropertyDescription("The room with which the fixed asset is associated.")
    private Object room;
    /**
     * Insured Value
     * <p>
     * The insured value of the fixed asset.
     * 
     */
    @JsonProperty("insuredValue")
    @JsonPropertyDescription("The insured value of the fixed asset.")
    private Object insuredValue;
    /**
     * Market Value
     * <p>
     * The market value of the fixed asset.
     * 
     */
    @JsonProperty("marketValue")
    @JsonPropertyDescription("The market value of the fixed asset.")
    private Object marketValue;
    /**
     * Replacement Value
     * <p>
     * The replacement value of the fixed asset.
     * 
     */
    @JsonProperty("replacementValue")
    @JsonPropertyDescription("The replacement value of the fixed asset.")
    private Object replacementValue;
    /**
     * Acquisition Cost
     * <p>
     * The acquisition cost of the fixed asset.
     * 
     */
    @JsonProperty("acquisitionCost")
    @JsonPropertyDescription("The acquisition cost of the fixed asset.")
    private Object acquisitionCost;
    /**
     * Accumulated Depreciation
     * <p>
     * The amount of accumulated depreciation associated with the fixed asset.
     * 
     */
    @JsonProperty("accumulatedDepreciation")
    @JsonPropertyDescription("The amount of accumulated depreciation associated with the fixed asset.")
    private Object accumulatedDepreciation;
    /**
     * Depreciation Method
     * <p>
     * The depreciation method associated with the fixed asset.
     * 
     */
    @JsonProperty("depreciationMethod")
    @JsonPropertyDescription("The depreciation method associated with the fixed asset.")
    private String depreciationMethod;
    /**
     * Salvage Value
     * <p>
     * The salvage value of the fixed asset.
     * 
     */
    @JsonProperty("salvageValue")
    @JsonPropertyDescription("The salvage value of the fixed asset.")
    private Object salvageValue;
    /**
     * Useful Life
     * <p>
     * The fixed asset's useful life in years.
     * 
     */
    @JsonProperty("usefulLife")
    @JsonPropertyDescription("The fixed asset's useful life in years.")
    private Object usefulLife;
    /**
     * Depreciation Expense Account
     * <p>
     * The depreciation expense account associated with the fixed asset.
     * 
     */
    @JsonProperty("depreciationExpenseAccount")
    @JsonPropertyDescription("The depreciation expense account associated with the fixed asset.")
    private Object depreciationExpenseAccount;
    /**
     * Renewal Cost
     * <p>
     * The fixed asset's net renewal cost.
     * 
     */
    @JsonProperty("renewalCost")
    @JsonPropertyDescription("The fixed asset's net renewal cost.")
    private Object renewalCost;
    /**
     * Responsible Persons
     * <p>
     * The responsible person(s) associated with the fixed asset.
     * 
     */
    @JsonProperty("responsiblePersons")
    @JsonPropertyDescription("The responsible person(s) associated with the fixed asset.")
    private List<ResponsiblePerson> responsiblePersons = new ArrayList<ResponsiblePerson>();

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

    public FixedAssets withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the fixed asset.
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
     * The global identifier of the fixed asset.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public FixedAssets withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the fixed asset.
     * (Required)
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the fixed asset.
     * (Required)
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public FixedAssets withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Tag
     * <p>
     * A unique user defined or system generated number, usually visible on the tag of the asset.
     * (Required)
     * 
     */
    @JsonProperty("tag")
    public String getTag() {
        return tag;
    }

    /**
     * Tag
     * <p>
     * A unique user defined or system generated number, usually visible on the tag of the asset.
     * (Required)
     * 
     */
    @JsonProperty("tag")
    public void setTag(String tag) {
        this.tag = tag;
    }

    public FixedAssets withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * Type
     * <p>
     * A code which describes an asset type for depreciation purposes (e.g. office equipment, athletic equipment, classroom furniture).
     * 
     */
    @JsonProperty("type")
    public Object getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * A code which describes an asset type for depreciation purposes (e.g. office equipment, athletic equipment, classroom furniture).
     * 
     */
    @JsonProperty("type")
    public void setType(Object type) {
        this.type = type;
    }

    public FixedAssets withType(Object type) {
        this.type = type;
        return this;
    }

    /**
     * Category
     * <p>
     * The category associated with the fixed asset (e.g. equipment).
     * 
     */
    @JsonProperty("category")
    public Object getCategory() {
        return category;
    }

    /**
     * Category
     * <p>
     * The category associated with the fixed asset (e.g. equipment).
     * 
     */
    @JsonProperty("category")
    public void setCategory(Object category) {
        this.category = category;
    }

    public FixedAssets withCategory(Object category) {
        this.category = category;
        return this;
    }

    /**
     * Capitalization Status
     * <p>
     * The capitalization status of the fixed asset.
     * (Required)
     * 
     */
    @JsonProperty("capitalizationStatus")
    public FixedAssets.CapitalizationStatus getCapitalizationStatus() {
        return capitalizationStatus;
    }

    /**
     * Capitalization Status
     * <p>
     * The capitalization status of the fixed asset.
     * (Required)
     * 
     */
    @JsonProperty("capitalizationStatus")
    public void setCapitalizationStatus(FixedAssets.CapitalizationStatus capitalizationStatus) {
        this.capitalizationStatus = capitalizationStatus;
    }

    public FixedAssets withCapitalizationStatus(FixedAssets.CapitalizationStatus capitalizationStatus) {
        this.capitalizationStatus = capitalizationStatus;
        return this;
    }

    /**
     * Acquisition Method
     * <p>
     * The acquisition method associated with the fixed asset.
     * (Required)
     * 
     */
    @JsonProperty("acquisitionMethod")
    public FixedAssets.AcquisitionMethod getAcquisitionMethod() {
        return acquisitionMethod;
    }

    /**
     * Acquisition Method
     * <p>
     * The acquisition method associated with the fixed asset.
     * (Required)
     * 
     */
    @JsonProperty("acquisitionMethod")
    public void setAcquisitionMethod(FixedAssets.AcquisitionMethod acquisitionMethod) {
        this.acquisitionMethod = acquisitionMethod;
    }

    public FixedAssets withAcquisitionMethod(FixedAssets.AcquisitionMethod acquisitionMethod) {
        this.acquisitionMethod = acquisitionMethod;
        return this;
    }

    /**
     * Status
     * <p>
     * A status indicating whether the asset has been disposed of or written off.
     * 
     */
    @JsonProperty("status")
    public Object getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * A status indicating whether the asset has been disposed of or written off.
     * 
     */
    @JsonProperty("status")
    public void setStatus(Object status) {
        this.status = status;
    }

    public FixedAssets withStatus(Object status) {
        this.status = status;
        return this;
    }

    /**
     * Condition
     * <p>
     * The condition of the fixed asset.
     * 
     */
    @JsonProperty("condition")
    public String getCondition() {
        return condition;
    }

    /**
     * Condition
     * <p>
     * The condition of the fixed asset.
     * 
     */
    @JsonProperty("condition")
    public void setCondition(String condition) {
        this.condition = condition;
    }

    public FixedAssets withCondition(String condition) {
        this.condition = condition;
        return this;
    }

    /**
     * Location
     * <p>
     * The location associated with the fixed asset.
     * 
     */
    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    /**
     * Location
     * <p>
     * The location associated with the fixed asset.
     * 
     */
    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    public FixedAssets withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Building
     * <p>
     * The building with which the fixed asset is associated.
     * 
     */
    @JsonProperty("building")
    public Object getBuilding() {
        return building;
    }

    /**
     * Building
     * <p>
     * The building with which the fixed asset is associated.
     * 
     */
    @JsonProperty("building")
    public void setBuilding(Object building) {
        this.building = building;
    }

    public FixedAssets withBuilding(Object building) {
        this.building = building;
        return this;
    }

    /**
     * Room
     * <p>
     * The room with which the fixed asset is associated.
     * 
     */
    @JsonProperty("room")
    public Object getRoom() {
        return room;
    }

    /**
     * Room
     * <p>
     * The room with which the fixed asset is associated.
     * 
     */
    @JsonProperty("room")
    public void setRoom(Object room) {
        this.room = room;
    }

    public FixedAssets withRoom(Object room) {
        this.room = room;
        return this;
    }

    /**
     * Insured Value
     * <p>
     * The insured value of the fixed asset.
     * 
     */
    @JsonProperty("insuredValue")
    public Object getInsuredValue() {
        return insuredValue;
    }

    /**
     * Insured Value
     * <p>
     * The insured value of the fixed asset.
     * 
     */
    @JsonProperty("insuredValue")
    public void setInsuredValue(Object insuredValue) {
        this.insuredValue = insuredValue;
    }

    public FixedAssets withInsuredValue(Object insuredValue) {
        this.insuredValue = insuredValue;
        return this;
    }

    /**
     * Market Value
     * <p>
     * The market value of the fixed asset.
     * 
     */
    @JsonProperty("marketValue")
    public Object getMarketValue() {
        return marketValue;
    }

    /**
     * Market Value
     * <p>
     * The market value of the fixed asset.
     * 
     */
    @JsonProperty("marketValue")
    public void setMarketValue(Object marketValue) {
        this.marketValue = marketValue;
    }

    public FixedAssets withMarketValue(Object marketValue) {
        this.marketValue = marketValue;
        return this;
    }

    /**
     * Replacement Value
     * <p>
     * The replacement value of the fixed asset.
     * 
     */
    @JsonProperty("replacementValue")
    public Object getReplacementValue() {
        return replacementValue;
    }

    /**
     * Replacement Value
     * <p>
     * The replacement value of the fixed asset.
     * 
     */
    @JsonProperty("replacementValue")
    public void setReplacementValue(Object replacementValue) {
        this.replacementValue = replacementValue;
    }

    public FixedAssets withReplacementValue(Object replacementValue) {
        this.replacementValue = replacementValue;
        return this;
    }

    /**
     * Acquisition Cost
     * <p>
     * The acquisition cost of the fixed asset.
     * 
     */
    @JsonProperty("acquisitionCost")
    public Object getAcquisitionCost() {
        return acquisitionCost;
    }

    /**
     * Acquisition Cost
     * <p>
     * The acquisition cost of the fixed asset.
     * 
     */
    @JsonProperty("acquisitionCost")
    public void setAcquisitionCost(Object acquisitionCost) {
        this.acquisitionCost = acquisitionCost;
    }

    public FixedAssets withAcquisitionCost(Object acquisitionCost) {
        this.acquisitionCost = acquisitionCost;
        return this;
    }

    /**
     * Accumulated Depreciation
     * <p>
     * The amount of accumulated depreciation associated with the fixed asset.
     * 
     */
    @JsonProperty("accumulatedDepreciation")
    public Object getAccumulatedDepreciation() {
        return accumulatedDepreciation;
    }

    /**
     * Accumulated Depreciation
     * <p>
     * The amount of accumulated depreciation associated with the fixed asset.
     * 
     */
    @JsonProperty("accumulatedDepreciation")
    public void setAccumulatedDepreciation(Object accumulatedDepreciation) {
        this.accumulatedDepreciation = accumulatedDepreciation;
    }

    public FixedAssets withAccumulatedDepreciation(Object accumulatedDepreciation) {
        this.accumulatedDepreciation = accumulatedDepreciation;
        return this;
    }

    /**
     * Depreciation Method
     * <p>
     * The depreciation method associated with the fixed asset.
     * 
     */
    @JsonProperty("depreciationMethod")
    public String getDepreciationMethod() {
        return depreciationMethod;
    }

    /**
     * Depreciation Method
     * <p>
     * The depreciation method associated with the fixed asset.
     * 
     */
    @JsonProperty("depreciationMethod")
    public void setDepreciationMethod(String depreciationMethod) {
        this.depreciationMethod = depreciationMethod;
    }

    public FixedAssets withDepreciationMethod(String depreciationMethod) {
        this.depreciationMethod = depreciationMethod;
        return this;
    }

    /**
     * Salvage Value
     * <p>
     * The salvage value of the fixed asset.
     * 
     */
    @JsonProperty("salvageValue")
    public Object getSalvageValue() {
        return salvageValue;
    }

    /**
     * Salvage Value
     * <p>
     * The salvage value of the fixed asset.
     * 
     */
    @JsonProperty("salvageValue")
    public void setSalvageValue(Object salvageValue) {
        this.salvageValue = salvageValue;
    }

    public FixedAssets withSalvageValue(Object salvageValue) {
        this.salvageValue = salvageValue;
        return this;
    }

    /**
     * Useful Life
     * <p>
     * The fixed asset's useful life in years.
     * 
     */
    @JsonProperty("usefulLife")
    public Object getUsefulLife() {
        return usefulLife;
    }

    /**
     * Useful Life
     * <p>
     * The fixed asset's useful life in years.
     * 
     */
    @JsonProperty("usefulLife")
    public void setUsefulLife(Object usefulLife) {
        this.usefulLife = usefulLife;
    }

    public FixedAssets withUsefulLife(Object usefulLife) {
        this.usefulLife = usefulLife;
        return this;
    }

    /**
     * Depreciation Expense Account
     * <p>
     * The depreciation expense account associated with the fixed asset.
     * 
     */
    @JsonProperty("depreciationExpenseAccount")
    public Object getDepreciationExpenseAccount() {
        return depreciationExpenseAccount;
    }

    /**
     * Depreciation Expense Account
     * <p>
     * The depreciation expense account associated with the fixed asset.
     * 
     */
    @JsonProperty("depreciationExpenseAccount")
    public void setDepreciationExpenseAccount(Object depreciationExpenseAccount) {
        this.depreciationExpenseAccount = depreciationExpenseAccount;
    }

    public FixedAssets withDepreciationExpenseAccount(Object depreciationExpenseAccount) {
        this.depreciationExpenseAccount = depreciationExpenseAccount;
        return this;
    }

    /**
     * Renewal Cost
     * <p>
     * The fixed asset's net renewal cost.
     * 
     */
    @JsonProperty("renewalCost")
    public Object getRenewalCost() {
        return renewalCost;
    }

    /**
     * Renewal Cost
     * <p>
     * The fixed asset's net renewal cost.
     * 
     */
    @JsonProperty("renewalCost")
    public void setRenewalCost(Object renewalCost) {
        this.renewalCost = renewalCost;
    }

    public FixedAssets withRenewalCost(Object renewalCost) {
        this.renewalCost = renewalCost;
        return this;
    }

    /**
     * Responsible Persons
     * <p>
     * The responsible person(s) associated with the fixed asset.
     * 
     */
    @JsonProperty("responsiblePersons")
    public List<ResponsiblePerson> getResponsiblePersons() {
        return responsiblePersons;
    }

    /**
     * Responsible Persons
     * <p>
     * The responsible person(s) associated with the fixed asset.
     * 
     */
    @JsonProperty("responsiblePersons")
    public void setResponsiblePersons(List<ResponsiblePerson> responsiblePersons) {
        this.responsiblePersons = responsiblePersons;
    }

    public FixedAssets withResponsiblePersons(List<ResponsiblePerson> responsiblePersons) {
        this.responsiblePersons = responsiblePersons;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FixedAssets.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("tag");
        sb.append('=');
        sb.append(((this.tag == null)?"<null>":this.tag));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("capitalizationStatus");
        sb.append('=');
        sb.append(((this.capitalizationStatus == null)?"<null>":this.capitalizationStatus));
        sb.append(',');
        sb.append("acquisitionMethod");
        sb.append('=');
        sb.append(((this.acquisitionMethod == null)?"<null>":this.acquisitionMethod));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("condition");
        sb.append('=');
        sb.append(((this.condition == null)?"<null>":this.condition));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("building");
        sb.append('=');
        sb.append(((this.building == null)?"<null>":this.building));
        sb.append(',');
        sb.append("room");
        sb.append('=');
        sb.append(((this.room == null)?"<null>":this.room));
        sb.append(',');
        sb.append("insuredValue");
        sb.append('=');
        sb.append(((this.insuredValue == null)?"<null>":this.insuredValue));
        sb.append(',');
        sb.append("marketValue");
        sb.append('=');
        sb.append(((this.marketValue == null)?"<null>":this.marketValue));
        sb.append(',');
        sb.append("replacementValue");
        sb.append('=');
        sb.append(((this.replacementValue == null)?"<null>":this.replacementValue));
        sb.append(',');
        sb.append("acquisitionCost");
        sb.append('=');
        sb.append(((this.acquisitionCost == null)?"<null>":this.acquisitionCost));
        sb.append(',');
        sb.append("accumulatedDepreciation");
        sb.append('=');
        sb.append(((this.accumulatedDepreciation == null)?"<null>":this.accumulatedDepreciation));
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
        sb.append("depreciationExpenseAccount");
        sb.append('=');
        sb.append(((this.depreciationExpenseAccount == null)?"<null>":this.depreciationExpenseAccount));
        sb.append(',');
        sb.append("renewalCost");
        sb.append('=');
        sb.append(((this.renewalCost == null)?"<null>":this.renewalCost));
        sb.append(',');
        sb.append("responsiblePersons");
        sb.append('=');
        sb.append(((this.responsiblePersons == null)?"<null>":this.responsiblePersons));
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
        result = ((result* 31)+((this.depreciationMethod == null)? 0 :this.depreciationMethod.hashCode()));
        result = ((result* 31)+((this.responsiblePersons == null)? 0 :this.responsiblePersons.hashCode()));
        result = ((result* 31)+((this.renewalCost == null)? 0 :this.renewalCost.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.building == null)? 0 :this.building.hashCode()));
        result = ((result* 31)+((this.depreciationExpenseAccount == null)? 0 :this.depreciationExpenseAccount.hashCode()));
        result = ((result* 31)+((this.capitalizationStatus == null)? 0 :this.capitalizationStatus.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.tag == null)? 0 :this.tag.hashCode()));
        result = ((result* 31)+((this.acquisitionCost == null)? 0 :this.acquisitionCost.hashCode()));
        result = ((result* 31)+((this.acquisitionMethod == null)? 0 :this.acquisitionMethod.hashCode()));
        result = ((result* 31)+((this.insuredValue == null)? 0 :this.insuredValue.hashCode()));
        result = ((result* 31)+((this.marketValue == null)? 0 :this.marketValue.hashCode()));
        result = ((result* 31)+((this.replacementValue == null)? 0 :this.replacementValue.hashCode()));
        result = ((result* 31)+((this.room == null)? 0 :this.room.hashCode()));
        result = ((result* 31)+((this.accumulatedDepreciation == null)? 0 :this.accumulatedDepreciation.hashCode()));
        result = ((result* 31)+((this.usefulLife == null)? 0 :this.usefulLife.hashCode()));
        result = ((result* 31)+((this.condition == null)? 0 :this.condition.hashCode()));
        result = ((result* 31)+((this.salvageValue == null)? 0 :this.salvageValue.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FixedAssets) == false) {
            return false;
        }
        FixedAssets rhs = ((FixedAssets) other);
        return (((((((((((((((((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.depreciationMethod == rhs.depreciationMethod)||((this.depreciationMethod!= null)&&this.depreciationMethod.equals(rhs.depreciationMethod))))&&((this.responsiblePersons == rhs.responsiblePersons)||((this.responsiblePersons!= null)&&this.responsiblePersons.equals(rhs.responsiblePersons))))&&((this.renewalCost == rhs.renewalCost)||((this.renewalCost!= null)&&this.renewalCost.equals(rhs.renewalCost))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.building == rhs.building)||((this.building!= null)&&this.building.equals(rhs.building))))&&((this.depreciationExpenseAccount == rhs.depreciationExpenseAccount)||((this.depreciationExpenseAccount!= null)&&this.depreciationExpenseAccount.equals(rhs.depreciationExpenseAccount))))&&((this.capitalizationStatus == rhs.capitalizationStatus)||((this.capitalizationStatus!= null)&&this.capitalizationStatus.equals(rhs.capitalizationStatus))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.tag == rhs.tag)||((this.tag!= null)&&this.tag.equals(rhs.tag))))&&((this.acquisitionCost == rhs.acquisitionCost)||((this.acquisitionCost!= null)&&this.acquisitionCost.equals(rhs.acquisitionCost))))&&((this.acquisitionMethod == rhs.acquisitionMethod)||((this.acquisitionMethod!= null)&&this.acquisitionMethod.equals(rhs.acquisitionMethod))))&&((this.insuredValue == rhs.insuredValue)||((this.insuredValue!= null)&&this.insuredValue.equals(rhs.insuredValue))))&&((this.marketValue == rhs.marketValue)||((this.marketValue!= null)&&this.marketValue.equals(rhs.marketValue))))&&((this.replacementValue == rhs.replacementValue)||((this.replacementValue!= null)&&this.replacementValue.equals(rhs.replacementValue))))&&((this.room == rhs.room)||((this.room!= null)&&this.room.equals(rhs.room))))&&((this.accumulatedDepreciation == rhs.accumulatedDepreciation)||((this.accumulatedDepreciation!= null)&&this.accumulatedDepreciation.equals(rhs.accumulatedDepreciation))))&&((this.usefulLife == rhs.usefulLife)||((this.usefulLife!= null)&&this.usefulLife.equals(rhs.usefulLife))))&&((this.condition == rhs.condition)||((this.condition!= null)&&this.condition.equals(rhs.condition))))&&((this.salvageValue == rhs.salvageValue)||((this.salvageValue!= null)&&this.salvageValue.equals(rhs.salvageValue))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * Acquisition Method
     * <p>
     * The acquisition method associated with the fixed asset.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum AcquisitionMethod {

        PURCHASED("purchased"),
        LEASED("leased"),
        DONATION("donation");
        private final String value;
        private final static Map<String, FixedAssets.AcquisitionMethod> CONSTANTS = new HashMap<String, FixedAssets.AcquisitionMethod>();

        static {
            for (FixedAssets.AcquisitionMethod c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        AcquisitionMethod(String value) {
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
        public static FixedAssets.AcquisitionMethod fromValue(String value) {
            FixedAssets.AcquisitionMethod constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Capitalization Status
     * <p>
     * The capitalization status of the fixed asset.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum CapitalizationStatus {

        CAPITALIZED("capitalized"),
        UNCAPITALIZED("uncapitalized"),
        NON_CAPITAL("nonCapital");
        private final String value;
        private final static Map<String, FixedAssets.CapitalizationStatus> CONSTANTS = new HashMap<String, FixedAssets.CapitalizationStatus>();

        static {
            for (FixedAssets.CapitalizationStatus c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        CapitalizationStatus(String value) {
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
        public static FixedAssets.CapitalizationStatus fromValue(String value) {
            FixedAssets.CapitalizationStatus constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
