
package com.ellucian.generated.eedm.persons.v12_4_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "country",
    "type",
    "documentId",
    "expiresOn"
})
@Generated("jsonschema2pojo")
public class IdentityDocument {

    /**
     * Country
     * <p>
     * The country where the document was issued.
     * 
     */
    @JsonProperty("country")
    @JsonPropertyDescription("The country where the document was issued.")
    private Object country;
    /**
     * Type
     * <p>
     * The identity document type
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The identity document type")
    private Type type;
    /**
     * Document ID
     * <p>
     * The identification code or number of the document
     * (Required)
     * 
     */
    @JsonProperty("documentId")
    @JsonPropertyDescription("The identification code or number of the document")
    private String documentId;
    /**
     * Expires On
     * <p>
     * The document expiration date
     * 
     */
    @JsonProperty("expiresOn")
    @JsonPropertyDescription("The document expiration date")
    private Object expiresOn;

    /**
     * Country
     * <p>
     * The country where the document was issued.
     * 
     */
    @JsonProperty("country")
    public Object getCountry() {
        return country;
    }

    /**
     * Country
     * <p>
     * The country where the document was issued.
     * 
     */
    @JsonProperty("country")
    public void setCountry(Object country) {
        this.country = country;
    }

    public IdentityDocument withCountry(Object country) {
        this.country = country;
        return this;
    }

    /**
     * Type
     * <p>
     * The identity document type
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The identity document type
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Type type) {
        this.type = type;
    }

    public IdentityDocument withType(Type type) {
        this.type = type;
        return this;
    }

    /**
     * Document ID
     * <p>
     * The identification code or number of the document
     * (Required)
     * 
     */
    @JsonProperty("documentId")
    public String getDocumentId() {
        return documentId;
    }

    /**
     * Document ID
     * <p>
     * The identification code or number of the document
     * (Required)
     * 
     */
    @JsonProperty("documentId")
    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public IdentityDocument withDocumentId(String documentId) {
        this.documentId = documentId;
        return this;
    }

    /**
     * Expires On
     * <p>
     * The document expiration date
     * 
     */
    @JsonProperty("expiresOn")
    public Object getExpiresOn() {
        return expiresOn;
    }

    /**
     * Expires On
     * <p>
     * The document expiration date
     * 
     */
    @JsonProperty("expiresOn")
    public void setExpiresOn(Object expiresOn) {
        this.expiresOn = expiresOn;
    }

    public IdentityDocument withExpiresOn(Object expiresOn) {
        this.expiresOn = expiresOn;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(IdentityDocument.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("documentId");
        sb.append('=');
        sb.append(((this.documentId == null)?"<null>":this.documentId));
        sb.append(',');
        sb.append("expiresOn");
        sb.append('=');
        sb.append(((this.expiresOn == null)?"<null>":this.expiresOn));
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
        result = ((result* 31)+((this.country == null)? 0 :this.country.hashCode()));
        result = ((result* 31)+((this.documentId == null)? 0 :this.documentId.hashCode()));
        result = ((result* 31)+((this.expiresOn == null)? 0 :this.expiresOn.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IdentityDocument) == false) {
            return false;
        }
        IdentityDocument rhs = ((IdentityDocument) other);
        return (((((this.country == rhs.country)||((this.country!= null)&&this.country.equals(rhs.country)))&&((this.documentId == rhs.documentId)||((this.documentId!= null)&&this.documentId.equals(rhs.documentId))))&&((this.expiresOn == rhs.expiresOn)||((this.expiresOn!= null)&&this.expiresOn.equals(rhs.expiresOn))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }

}
