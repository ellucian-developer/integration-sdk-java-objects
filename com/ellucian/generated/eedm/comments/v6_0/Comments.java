
package com.ellucian.generated.eedm.comments.v6_0;

import java.util.HashMap;
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
 * Comments
 * <p>
 * Comments made about a person, organization, etc.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "confidentiality",
    "subjectMatter",
    "source",
    "commentSubjectArea",
    "comment",
    "enteredBy",
    "enteredOn"
})
@Generated("jsonschema2pojo")
public class Comments {

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
     * The global identifier of the comments record.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the comments record.")
    private String id;
    /**
     * Confidentiality
     * <p>
     * Confidential level of the comment
     * 
     */
    @JsonProperty("confidentiality")
    @JsonPropertyDescription("Confidential level of the comment")
    private Comments.Confidentiality confidentiality;
    /**
     * Subject Matter
     * <p>
     * Whom the comment is about
     * (Required)
     * 
     */
    @JsonProperty("subjectMatter")
    @JsonPropertyDescription("Whom the comment is about")
    private Object subjectMatter;
    /**
     * Source
     * <p>
     * Source of the comment
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("Source of the comment")
    private Object source;
    /**
     * Comment Subject Area
     * <p>
     * Subject area of the comment
     * 
     */
    @JsonProperty("commentSubjectArea")
    @JsonPropertyDescription("Subject area of the comment")
    private Object commentSubjectArea;
    /**
     * Comment
     * <p>
     * The actual comment made
     * (Required)
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("The actual comment made")
    private String comment;
    /**
     * Entered By
     * <p>
     * The creator of this comment instance
     * 
     */
    @JsonProperty("enteredBy")
    @JsonPropertyDescription("The creator of this comment instance")
    private Object enteredBy;
    /**
     * Entered On
     * <p>
     * The date of the creation of the comment instance
     * 
     */
    @JsonProperty("enteredOn")
    @JsonPropertyDescription("The date of the creation of the comment instance")
    private Object enteredOn;

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

    public Comments withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the comments record.
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
     * The global identifier of the comments record.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Comments withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Confidentiality
     * <p>
     * Confidential level of the comment
     * 
     */
    @JsonProperty("confidentiality")
    public Comments.Confidentiality getConfidentiality() {
        return confidentiality;
    }

    /**
     * Confidentiality
     * <p>
     * Confidential level of the comment
     * 
     */
    @JsonProperty("confidentiality")
    public void setConfidentiality(Comments.Confidentiality confidentiality) {
        this.confidentiality = confidentiality;
    }

    public Comments withConfidentiality(Comments.Confidentiality confidentiality) {
        this.confidentiality = confidentiality;
        return this;
    }

    /**
     * Subject Matter
     * <p>
     * Whom the comment is about
     * (Required)
     * 
     */
    @JsonProperty("subjectMatter")
    public Object getSubjectMatter() {
        return subjectMatter;
    }

    /**
     * Subject Matter
     * <p>
     * Whom the comment is about
     * (Required)
     * 
     */
    @JsonProperty("subjectMatter")
    public void setSubjectMatter(Object subjectMatter) {
        this.subjectMatter = subjectMatter;
    }

    public Comments withSubjectMatter(Object subjectMatter) {
        this.subjectMatter = subjectMatter;
        return this;
    }

    /**
     * Source
     * <p>
     * Source of the comment
     * 
     */
    @JsonProperty("source")
    public Object getSource() {
        return source;
    }

    /**
     * Source
     * <p>
     * Source of the comment
     * 
     */
    @JsonProperty("source")
    public void setSource(Object source) {
        this.source = source;
    }

    public Comments withSource(Object source) {
        this.source = source;
        return this;
    }

    /**
     * Comment Subject Area
     * <p>
     * Subject area of the comment
     * 
     */
    @JsonProperty("commentSubjectArea")
    public Object getCommentSubjectArea() {
        return commentSubjectArea;
    }

    /**
     * Comment Subject Area
     * <p>
     * Subject area of the comment
     * 
     */
    @JsonProperty("commentSubjectArea")
    public void setCommentSubjectArea(Object commentSubjectArea) {
        this.commentSubjectArea = commentSubjectArea;
    }

    public Comments withCommentSubjectArea(Object commentSubjectArea) {
        this.commentSubjectArea = commentSubjectArea;
        return this;
    }

    /**
     * Comment
     * <p>
     * The actual comment made
     * (Required)
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Comment
     * <p>
     * The actual comment made
     * (Required)
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public Comments withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Entered By
     * <p>
     * The creator of this comment instance
     * 
     */
    @JsonProperty("enteredBy")
    public Object getEnteredBy() {
        return enteredBy;
    }

    /**
     * Entered By
     * <p>
     * The creator of this comment instance
     * 
     */
    @JsonProperty("enteredBy")
    public void setEnteredBy(Object enteredBy) {
        this.enteredBy = enteredBy;
    }

    public Comments withEnteredBy(Object enteredBy) {
        this.enteredBy = enteredBy;
        return this;
    }

    /**
     * Entered On
     * <p>
     * The date of the creation of the comment instance
     * 
     */
    @JsonProperty("enteredOn")
    public Object getEnteredOn() {
        return enteredOn;
    }

    /**
     * Entered On
     * <p>
     * The date of the creation of the comment instance
     * 
     */
    @JsonProperty("enteredOn")
    public void setEnteredOn(Object enteredOn) {
        this.enteredOn = enteredOn;
    }

    public Comments withEnteredOn(Object enteredOn) {
        this.enteredOn = enteredOn;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Comments.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("confidentiality");
        sb.append('=');
        sb.append(((this.confidentiality == null)?"<null>":this.confidentiality));
        sb.append(',');
        sb.append("subjectMatter");
        sb.append('=');
        sb.append(((this.subjectMatter == null)?"<null>":this.subjectMatter));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("commentSubjectArea");
        sb.append('=');
        sb.append(((this.commentSubjectArea == null)?"<null>":this.commentSubjectArea));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("enteredBy");
        sb.append('=');
        sb.append(((this.enteredBy == null)?"<null>":this.enteredBy));
        sb.append(',');
        sb.append("enteredOn");
        sb.append('=');
        sb.append(((this.enteredOn == null)?"<null>":this.enteredOn));
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
        result = ((result* 31)+((this.enteredOn == null)? 0 :this.enteredOn.hashCode()));
        result = ((result* 31)+((this.subjectMatter == null)? 0 :this.subjectMatter.hashCode()));
        result = ((result* 31)+((this.confidentiality == null)? 0 :this.confidentiality.hashCode()));
        result = ((result* 31)+((this.commentSubjectArea == null)? 0 :this.commentSubjectArea.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.enteredBy == null)? 0 :this.enteredBy.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Comments) == false) {
            return false;
        }
        Comments rhs = ((Comments) other);
        return ((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.enteredOn == rhs.enteredOn)||((this.enteredOn!= null)&&this.enteredOn.equals(rhs.enteredOn))))&&((this.subjectMatter == rhs.subjectMatter)||((this.subjectMatter!= null)&&this.subjectMatter.equals(rhs.subjectMatter))))&&((this.confidentiality == rhs.confidentiality)||((this.confidentiality!= null)&&this.confidentiality.equals(rhs.confidentiality))))&&((this.commentSubjectArea == rhs.commentSubjectArea)||((this.commentSubjectArea!= null)&&this.commentSubjectArea.equals(rhs.commentSubjectArea))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.enteredBy == rhs.enteredBy)||((this.enteredBy!= null)&&this.enteredBy.equals(rhs.enteredBy))));
    }


    /**
     * Confidentiality
     * <p>
     * Confidential level of the comment
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Confidentiality {

        PRIVATE("private"),
        PUBLIC("public");
        private final String value;
        private final static Map<String, Comments.Confidentiality> CONSTANTS = new HashMap<String, Comments.Confidentiality>();

        static {
            for (Comments.Confidentiality c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Confidentiality(String value) {
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
        public static Comments.Confidentiality fromValue(String value) {
            Comments.Confidentiality constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
