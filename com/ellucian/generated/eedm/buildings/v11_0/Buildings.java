
package com.ellucian.generated.eedm.buildings.v11_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Buildings
 * <p>
 * Physical structures with rooms located in specified physical locations.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "code",
    "title",
    "description",
    "site",
    "address",
    "imageUrl",
    "characteristics",
    "comments"
})
@Generated("jsonschema2pojo")
public class Buildings {

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
     * A global identifier of a building for use in all external references to the building.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("A global identifier of a building for use in all external references to the building.")
    private String id;
    /**
     * Code
     * <p>
     * A code that identifies the building.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("A code that identifies the building.")
    private String code;
    /**
     * Title
     * <p>
     * The full name of the building.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the building.")
    private String title;
    /**
     * Description
     * <p>
     * The description of the building.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the building.")
    private String description;
    /**
     * Site
     * <p>
     * The physical location where the building is located.
     * 
     */
    @JsonProperty("site")
    @JsonPropertyDescription("The physical location where the building is located.")
    private Object site;
    /**
     * Address
     * <p>
     * The address of the building, such as a street address, post office box number, or city, region, and postal code.
     * 
     */
    @JsonProperty("address")
    @JsonPropertyDescription("The address of the building, such as a street address, post office box number, or city, region, and postal code.")
    private Object address;
    /**
     * Image URL
     * <p>
     * A link to a publicly available image of the building.
     * 
     */
    @JsonProperty("imageUrl")
    @JsonPropertyDescription("A link to a publicly available image of the building.")
    private String imageUrl;
    /**
     * Characteristics
     * <p>
     * The attributes or additional services associated with the building.
     * 
     */
    @JsonProperty("characteristics")
    @JsonPropertyDescription("The attributes or additional services associated with the building.")
    private List<String> characteristics = new ArrayList<String>();
    /**
     * Comments
     * <p>
     * The comments associated with the building.
     * 
     */
    @JsonProperty("comments")
    @JsonPropertyDescription("The comments associated with the building.")
    private List<String> comments = new ArrayList<String>();

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

    public Buildings withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * A global identifier of a building for use in all external references to the building.
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
     * A global identifier of a building for use in all external references to the building.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Buildings withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Code
     * <p>
     * A code that identifies the building.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * A code that identifies the building.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public Buildings withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the building.
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
     * The full name of the building.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Buildings withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the building.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the building.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Buildings withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Site
     * <p>
     * The physical location where the building is located.
     * 
     */
    @JsonProperty("site")
    public Object getSite() {
        return site;
    }

    /**
     * Site
     * <p>
     * The physical location where the building is located.
     * 
     */
    @JsonProperty("site")
    public void setSite(Object site) {
        this.site = site;
    }

    public Buildings withSite(Object site) {
        this.site = site;
        return this;
    }

    /**
     * Address
     * <p>
     * The address of the building, such as a street address, post office box number, or city, region, and postal code.
     * 
     */
    @JsonProperty("address")
    public Object getAddress() {
        return address;
    }

    /**
     * Address
     * <p>
     * The address of the building, such as a street address, post office box number, or city, region, and postal code.
     * 
     */
    @JsonProperty("address")
    public void setAddress(Object address) {
        this.address = address;
    }

    public Buildings withAddress(Object address) {
        this.address = address;
        return this;
    }

    /**
     * Image URL
     * <p>
     * A link to a publicly available image of the building.
     * 
     */
    @JsonProperty("imageUrl")
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Image URL
     * <p>
     * A link to a publicly available image of the building.
     * 
     */
    @JsonProperty("imageUrl")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Buildings withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     * Characteristics
     * <p>
     * The attributes or additional services associated with the building.
     * 
     */
    @JsonProperty("characteristics")
    public List<String> getCharacteristics() {
        return characteristics;
    }

    /**
     * Characteristics
     * <p>
     * The attributes or additional services associated with the building.
     * 
     */
    @JsonProperty("characteristics")
    public void setCharacteristics(List<String> characteristics) {
        this.characteristics = characteristics;
    }

    public Buildings withCharacteristics(List<String> characteristics) {
        this.characteristics = characteristics;
        return this;
    }

    /**
     * Comments
     * <p>
     * The comments associated with the building.
     * 
     */
    @JsonProperty("comments")
    public List<String> getComments() {
        return comments;
    }

    /**
     * Comments
     * <p>
     * The comments associated with the building.
     * 
     */
    @JsonProperty("comments")
    public void setComments(List<String> comments) {
        this.comments = comments;
    }

    public Buildings withComments(List<String> comments) {
        this.comments = comments;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Buildings.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("site");
        sb.append('=');
        sb.append(((this.site == null)?"<null>":this.site));
        sb.append(',');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        sb.append("imageUrl");
        sb.append('=');
        sb.append(((this.imageUrl == null)?"<null>":this.imageUrl));
        sb.append(',');
        sb.append("characteristics");
        sb.append('=');
        sb.append(((this.characteristics == null)?"<null>":this.characteristics));
        sb.append(',');
        sb.append("comments");
        sb.append('=');
        sb.append(((this.comments == null)?"<null>":this.comments));
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
        result = ((result* 31)+((this.site == null)? 0 :this.site.hashCode()));
        result = ((result* 31)+((this.characteristics == null)? 0 :this.characteristics.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
        result = ((result* 31)+((this.comments == null)? 0 :this.comments.hashCode()));
        result = ((result* 31)+((this.imageUrl == null)? 0 :this.imageUrl.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Buildings) == false) {
            return false;
        }
        Buildings rhs = ((Buildings) other);
        return (((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.site == rhs.site)||((this.site!= null)&&this.site.equals(rhs.site))))&&((this.characteristics == rhs.characteristics)||((this.characteristics!= null)&&this.characteristics.equals(rhs.characteristics))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address))))&&((this.comments == rhs.comments)||((this.comments!= null)&&this.comments.equals(rhs.comments))))&&((this.imageUrl == rhs.imageUrl)||((this.imageUrl!= null)&&this.imageUrl.equals(rhs.imageUrl))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))));
    }

}
