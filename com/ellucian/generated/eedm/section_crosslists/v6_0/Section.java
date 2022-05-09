
package com.ellucian.generated.eedm.section_crosslists.v6_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "section",
    "type"
})
@Generated("jsonschema2pojo")
public class Section {

    /**
     * Section
     * <p>
     * A section that is cross-listed with other sections.
     * (Required)
     * 
     */
    @JsonProperty("section")
    @JsonPropertyDescription("A section that is cross-listed with other sections.")
    private Section__1 section;
    /**
     * Type
     * <p>
     * A indication of the type (primary, secondary) of the section within the group of cross-listed sections.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A indication of the type (primary, secondary) of the section within the group of cross-listed sections.")
    private Object type;

    /**
     * Section
     * <p>
     * A section that is cross-listed with other sections.
     * (Required)
     * 
     */
    @JsonProperty("section")
    public Section__1 getSection() {
        return section;
    }

    /**
     * Section
     * <p>
     * A section that is cross-listed with other sections.
     * (Required)
     * 
     */
    @JsonProperty("section")
    public void setSection(Section__1 section) {
        this.section = section;
    }

    public Section withSection(Section__1 section) {
        this.section = section;
        return this;
    }

    /**
     * Type
     * <p>
     * A indication of the type (primary, secondary) of the section within the group of cross-listed sections.
     * 
     */
    @JsonProperty("type")
    public Object getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * A indication of the type (primary, secondary) of the section within the group of cross-listed sections.
     * 
     */
    @JsonProperty("type")
    public void setType(Object type) {
        this.type = type;
    }

    public Section withType(Object type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Section.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("section");
        sb.append('=');
        sb.append(((this.section == null)?"<null>":this.section));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
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
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.section == null)? 0 :this.section.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Section) == false) {
            return false;
        }
        Section rhs = ((Section) other);
        return (((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.section == rhs.section)||((this.section!= null)&&this.section.equals(rhs.section))));
    }

}
