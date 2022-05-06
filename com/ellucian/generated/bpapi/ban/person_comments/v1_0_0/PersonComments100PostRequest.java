
package com.ellucian.generated.bpapi.ban.person_comments.v1_0_0;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "date",
    "contactDate",
    "cmttCode",
    "confidentialInd",
    "ctypCode",
    "id",
    "text",
    "origCode",
    "textNar"
})
@Generated("jsonschema2pojo")
public class PersonComments100PostRequest {

    /**
     * Add Date
     * <p>
     * Lineage reference object : SPRCMNT_DATE
     * 
     */
    @JsonProperty("date")
    @JsonPropertyDescription("Lineage reference object : SPRCMNT_DATE")
    private Date date;
    /**
     * Contact Date
     * <p>
     * Lineage reference object : SPRCMNT_CONTACT_DATE
     * 
     */
    @JsonProperty("contactDate")
    @JsonPropertyDescription("Lineage reference object : SPRCMNT_CONTACT_DATE")
    private Date contactDate;
    /**
     * Comment Type
     * <p>
     * Lineage reference object : SPRCMNT_CMTT_CODE, Lookup lineage reference object : stvcmtt
     * (Required)
     * 
     */
    @JsonProperty("cmttCode")
    @JsonPropertyDescription("Lineage reference object : SPRCMNT_CMTT_CODE, Lookup lineage reference object : stvcmtt")
    private String cmttCode;
    /**
     * Confidentiality
     * <p>
     * Lineage reference object : SPRCMNT_CONFIDENTIAL_IND
     * 
     */
    @JsonProperty("confidentialInd")
    @JsonPropertyDescription("Lineage reference object : SPRCMNT_CONFIDENTIAL_IND")
    private String confidentialInd;
    /**
     * Contact
     * <p>
     * Lineage reference object : SPRCMNT_CTYP_CODE, Lookup lineage reference object : stvctyp
     * 
     */
    @JsonProperty("ctypCode")
    @JsonPropertyDescription("Lineage reference object : SPRCMNT_CTYP_CODE, Lookup lineage reference object : stvctyp")
    private String ctypCode;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
    /**
     * Comments
     * <p>
     * Lineage reference object : SPRCMNT_TEXT
     * 
     */
    @JsonProperty("text")
    @JsonPropertyDescription("Lineage reference object : SPRCMNT_TEXT")
    private String text;
    /**
     * Originator
     * <p>
     * Lineage reference object : SPRCMNT_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("origCode")
    @JsonPropertyDescription("Lineage reference object : SPRCMNT_ORIG_CODE, Lookup lineage reference object : stvorig")
    private String origCode;
    /**
     * Narrative Comments
     * <p>
     * Lineage reference object : SPRCMNT_TEXT_NAR
     * 
     */
    @JsonProperty("textNar")
    @JsonPropertyDescription("Lineage reference object : SPRCMNT_TEXT_NAR")
    private String textNar;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Add Date
     * <p>
     * Lineage reference object : SPRCMNT_DATE
     * 
     */
    @JsonProperty("date")
    public Date getDate() {
        return date;
    }

    /**
     * Add Date
     * <p>
     * Lineage reference object : SPRCMNT_DATE
     * 
     */
    @JsonProperty("date")
    public void setDate(Date date) {
        this.date = date;
    }

    public PersonComments100PostRequest withDate(Date date) {
        this.date = date;
        return this;
    }

    /**
     * Contact Date
     * <p>
     * Lineage reference object : SPRCMNT_CONTACT_DATE
     * 
     */
    @JsonProperty("contactDate")
    public Date getContactDate() {
        return contactDate;
    }

    /**
     * Contact Date
     * <p>
     * Lineage reference object : SPRCMNT_CONTACT_DATE
     * 
     */
    @JsonProperty("contactDate")
    public void setContactDate(Date contactDate) {
        this.contactDate = contactDate;
    }

    public PersonComments100PostRequest withContactDate(Date contactDate) {
        this.contactDate = contactDate;
        return this;
    }

    /**
     * Comment Type
     * <p>
     * Lineage reference object : SPRCMNT_CMTT_CODE, Lookup lineage reference object : stvcmtt
     * (Required)
     * 
     */
    @JsonProperty("cmttCode")
    public String getCmttCode() {
        return cmttCode;
    }

    /**
     * Comment Type
     * <p>
     * Lineage reference object : SPRCMNT_CMTT_CODE, Lookup lineage reference object : stvcmtt
     * (Required)
     * 
     */
    @JsonProperty("cmttCode")
    public void setCmttCode(String cmttCode) {
        this.cmttCode = cmttCode;
    }

    public PersonComments100PostRequest withCmttCode(String cmttCode) {
        this.cmttCode = cmttCode;
        return this;
    }

    /**
     * Confidentiality
     * <p>
     * Lineage reference object : SPRCMNT_CONFIDENTIAL_IND
     * 
     */
    @JsonProperty("confidentialInd")
    public String getConfidentialInd() {
        return confidentialInd;
    }

    /**
     * Confidentiality
     * <p>
     * Lineage reference object : SPRCMNT_CONFIDENTIAL_IND
     * 
     */
    @JsonProperty("confidentialInd")
    public void setConfidentialInd(String confidentialInd) {
        this.confidentialInd = confidentialInd;
    }

    public PersonComments100PostRequest withConfidentialInd(String confidentialInd) {
        this.confidentialInd = confidentialInd;
        return this;
    }

    /**
     * Contact
     * <p>
     * Lineage reference object : SPRCMNT_CTYP_CODE, Lookup lineage reference object : stvctyp
     * 
     */
    @JsonProperty("ctypCode")
    public String getCtypCode() {
        return ctypCode;
    }

    /**
     * Contact
     * <p>
     * Lineage reference object : SPRCMNT_CTYP_CODE, Lookup lineage reference object : stvctyp
     * 
     */
    @JsonProperty("ctypCode")
    public void setCtypCode(String ctypCode) {
        this.ctypCode = ctypCode;
    }

    public PersonComments100PostRequest withCtypCode(String ctypCode) {
        this.ctypCode = ctypCode;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public PersonComments100PostRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Comments
     * <p>
     * Lineage reference object : SPRCMNT_TEXT
     * 
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * Comments
     * <p>
     * Lineage reference object : SPRCMNT_TEXT
     * 
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    public PersonComments100PostRequest withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Originator
     * <p>
     * Lineage reference object : SPRCMNT_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("origCode")
    public String getOrigCode() {
        return origCode;
    }

    /**
     * Originator
     * <p>
     * Lineage reference object : SPRCMNT_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("origCode")
    public void setOrigCode(String origCode) {
        this.origCode = origCode;
    }

    public PersonComments100PostRequest withOrigCode(String origCode) {
        this.origCode = origCode;
        return this;
    }

    /**
     * Narrative Comments
     * <p>
     * Lineage reference object : SPRCMNT_TEXT_NAR
     * 
     */
    @JsonProperty("textNar")
    public String getTextNar() {
        return textNar;
    }

    /**
     * Narrative Comments
     * <p>
     * Lineage reference object : SPRCMNT_TEXT_NAR
     * 
     */
    @JsonProperty("textNar")
    public void setTextNar(String textNar) {
        this.textNar = textNar;
    }

    public PersonComments100PostRequest withTextNar(String textNar) {
        this.textNar = textNar;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public PersonComments100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PersonComments100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
        sb.append(',');
        sb.append("contactDate");
        sb.append('=');
        sb.append(((this.contactDate == null)?"<null>":this.contactDate));
        sb.append(',');
        sb.append("cmttCode");
        sb.append('=');
        sb.append(((this.cmttCode == null)?"<null>":this.cmttCode));
        sb.append(',');
        sb.append("confidentialInd");
        sb.append('=');
        sb.append(((this.confidentialInd == null)?"<null>":this.confidentialInd));
        sb.append(',');
        sb.append("ctypCode");
        sb.append('=');
        sb.append(((this.ctypCode == null)?"<null>":this.ctypCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
        sb.append(',');
        sb.append("origCode");
        sb.append('=');
        sb.append(((this.origCode == null)?"<null>":this.origCode));
        sb.append(',');
        sb.append("textNar");
        sb.append('=');
        sb.append(((this.textNar == null)?"<null>":this.textNar));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
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
        result = ((result* 31)+((this.date == null)? 0 :this.date.hashCode()));
        result = ((result* 31)+((this.contactDate == null)? 0 :this.contactDate.hashCode()));
        result = ((result* 31)+((this.cmttCode == null)? 0 :this.cmttCode.hashCode()));
        result = ((result* 31)+((this.confidentialInd == null)? 0 :this.confidentialInd.hashCode()));
        result = ((result* 31)+((this.ctypCode == null)? 0 :this.ctypCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.text == null)? 0 :this.text.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.origCode == null)? 0 :this.origCode.hashCode()));
        result = ((result* 31)+((this.textNar == null)? 0 :this.textNar.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PersonComments100PostRequest) == false) {
            return false;
        }
        PersonComments100PostRequest rhs = ((PersonComments100PostRequest) other);
        return (((((((((((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date)))&&((this.contactDate == rhs.contactDate)||((this.contactDate!= null)&&this.contactDate.equals(rhs.contactDate))))&&((this.cmttCode == rhs.cmttCode)||((this.cmttCode!= null)&&this.cmttCode.equals(rhs.cmttCode))))&&((this.confidentialInd == rhs.confidentialInd)||((this.confidentialInd!= null)&&this.confidentialInd.equals(rhs.confidentialInd))))&&((this.ctypCode == rhs.ctypCode)||((this.ctypCode!= null)&&this.ctypCode.equals(rhs.ctypCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.text == rhs.text)||((this.text!= null)&&this.text.equals(rhs.text))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.origCode == rhs.origCode)||((this.origCode!= null)&&this.origCode.equals(rhs.origCode))))&&((this.textNar == rhs.textNar)||((this.textNar!= null)&&this.textNar.equals(rhs.textNar))));
    }

}
