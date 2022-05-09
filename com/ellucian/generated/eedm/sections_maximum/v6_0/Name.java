
package com.ellucian.generated.eedm.sections_maximum.v6_0;

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
    "type",
    "title",
    "firstName",
    "middleName",
    "lastNamePrefix",
    "lastName",
    "pedigree",
    "preferredName"
})
@Generated("jsonschema2pojo")
public class Name {

    /**
     * Name Type
     * <p>
     * A type of name being defined. For example, a "Primary" name.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A type of name being defined. For example, a \"Primary\" name.")
    private Name.Type type;
    /**
     * Title
     * <p>
     * A person's title. For example, "Mr.", "Mrs.", "Dr.", etc.
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("A person's title. For example, \"Mr.\", \"Mrs.\", \"Dr.\", etc.")
    private String title;
    /**
     * First Name
     * <p>
     * A person's first, or given, name.
     * (Required)
     * 
     */
    @JsonProperty("firstName")
    @JsonPropertyDescription("A person's first, or given, name.")
    private String firstName;
    /**
     * Middle Name
     * <p>
     * A person's middle name.
     * 
     */
    @JsonProperty("middleName")
    @JsonPropertyDescription("A person's middle name.")
    private String middleName;
    /**
     * Last Name Prefix
     * <p>
     * The article or preposition portion of a person's last name. For example, "De la", "Van", "Van der Von", etc.
     * 
     */
    @JsonProperty("lastNamePrefix")
    @JsonPropertyDescription("The article or preposition portion of a person's last name. For example, \"De la\", \"Van\", \"Van der Von\", etc.")
    private String lastNamePrefix;
    /**
     * Last Name
     * <p>
     * A person's last, or family, name.
     * (Required)
     * 
     */
    @JsonProperty("lastName")
    @JsonPropertyDescription("A person's last, or family, name.")
    private String lastName;
    /**
     * Pedigree/Suffix
     * <p>
     * A person's pedigree, e.g. "Jr.", "Sr.", etc.
     * 
     */
    @JsonProperty("pedigree")
    @JsonPropertyDescription("A person's pedigree, e.g. \"Jr.\", \"Sr.\", etc.")
    private String pedigree;
    /**
     * Preferred Name
     * <p>
     * A person's preferred, short-hand name, such as a nickname.
     * 
     */
    @JsonProperty("preferredName")
    @JsonPropertyDescription("A person's preferred, short-hand name, such as a nickname.")
    private String preferredName;

    /**
     * Name Type
     * <p>
     * A type of name being defined. For example, a "Primary" name.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Name.Type getType() {
        return type;
    }

    /**
     * Name Type
     * <p>
     * A type of name being defined. For example, a "Primary" name.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Name.Type type) {
        this.type = type;
    }

    public Name withType(Name.Type type) {
        this.type = type;
        return this;
    }

    /**
     * Title
     * <p>
     * A person's title. For example, "Mr.", "Mrs.", "Dr.", etc.
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * A person's title. For example, "Mr.", "Mrs.", "Dr.", etc.
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Name withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * First Name
     * <p>
     * A person's first, or given, name.
     * (Required)
     * 
     */
    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    /**
     * First Name
     * <p>
     * A person's first, or given, name.
     * (Required)
     * 
     */
    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Name withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Middle Name
     * <p>
     * A person's middle name.
     * 
     */
    @JsonProperty("middleName")
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Middle Name
     * <p>
     * A person's middle name.
     * 
     */
    @JsonProperty("middleName")
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Name withMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    /**
     * Last Name Prefix
     * <p>
     * The article or preposition portion of a person's last name. For example, "De la", "Van", "Van der Von", etc.
     * 
     */
    @JsonProperty("lastNamePrefix")
    public String getLastNamePrefix() {
        return lastNamePrefix;
    }

    /**
     * Last Name Prefix
     * <p>
     * The article or preposition portion of a person's last name. For example, "De la", "Van", "Van der Von", etc.
     * 
     */
    @JsonProperty("lastNamePrefix")
    public void setLastNamePrefix(String lastNamePrefix) {
        this.lastNamePrefix = lastNamePrefix;
    }

    public Name withLastNamePrefix(String lastNamePrefix) {
        this.lastNamePrefix = lastNamePrefix;
        return this;
    }

    /**
     * Last Name
     * <p>
     * A person's last, or family, name.
     * (Required)
     * 
     */
    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    /**
     * Last Name
     * <p>
     * A person's last, or family, name.
     * (Required)
     * 
     */
    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Name withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Pedigree/Suffix
     * <p>
     * A person's pedigree, e.g. "Jr.", "Sr.", etc.
     * 
     */
    @JsonProperty("pedigree")
    public String getPedigree() {
        return pedigree;
    }

    /**
     * Pedigree/Suffix
     * <p>
     * A person's pedigree, e.g. "Jr.", "Sr.", etc.
     * 
     */
    @JsonProperty("pedigree")
    public void setPedigree(String pedigree) {
        this.pedigree = pedigree;
    }

    public Name withPedigree(String pedigree) {
        this.pedigree = pedigree;
        return this;
    }

    /**
     * Preferred Name
     * <p>
     * A person's preferred, short-hand name, such as a nickname.
     * 
     */
    @JsonProperty("preferredName")
    public String getPreferredName() {
        return preferredName;
    }

    /**
     * Preferred Name
     * <p>
     * A person's preferred, short-hand name, such as a nickname.
     * 
     */
    @JsonProperty("preferredName")
    public void setPreferredName(String preferredName) {
        this.preferredName = preferredName;
    }

    public Name withPreferredName(String preferredName) {
        this.preferredName = preferredName;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Name.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("middleName");
        sb.append('=');
        sb.append(((this.middleName == null)?"<null>":this.middleName));
        sb.append(',');
        sb.append("lastNamePrefix");
        sb.append('=');
        sb.append(((this.lastNamePrefix == null)?"<null>":this.lastNamePrefix));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("pedigree");
        sb.append('=');
        sb.append(((this.pedigree == null)?"<null>":this.pedigree));
        sb.append(',');
        sb.append("preferredName");
        sb.append('=');
        sb.append(((this.preferredName == null)?"<null>":this.preferredName));
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
        result = ((result* 31)+((this.pedigree == null)? 0 :this.pedigree.hashCode()));
        result = ((result* 31)+((this.firstName == null)? 0 :this.firstName.hashCode()));
        result = ((result* 31)+((this.lastNamePrefix == null)? 0 :this.lastNamePrefix.hashCode()));
        result = ((result* 31)+((this.lastName == null)? 0 :this.lastName.hashCode()));
        result = ((result* 31)+((this.middleName == null)? 0 :this.middleName.hashCode()));
        result = ((result* 31)+((this.preferredName == null)? 0 :this.preferredName.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Name) == false) {
            return false;
        }
        Name rhs = ((Name) other);
        return (((((((((this.pedigree == rhs.pedigree)||((this.pedigree!= null)&&this.pedigree.equals(rhs.pedigree)))&&((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName))))&&((this.lastNamePrefix == rhs.lastNamePrefix)||((this.lastNamePrefix!= null)&&this.lastNamePrefix.equals(rhs.lastNamePrefix))))&&((this.lastName == rhs.lastName)||((this.lastName!= null)&&this.lastName.equals(rhs.lastName))))&&((this.middleName == rhs.middleName)||((this.middleName!= null)&&this.middleName.equals(rhs.middleName))))&&((this.preferredName == rhs.preferredName)||((this.preferredName!= null)&&this.preferredName.equals(rhs.preferredName))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))));
    }


    /**
     * Name Type
     * <p>
     * A type of name being defined. For example, a "Primary" name.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        PRIMARY("primary");
        private final String value;
        private final static Map<String, Name.Type> CONSTANTS = new HashMap<String, Name.Type>();

        static {
            for (Name.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Type(String value) {
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
        public static Name.Type fromValue(String value) {
            Name.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
