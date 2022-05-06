
package com.ellucian.generated.bpapi.ban.comment.v1_0_0;

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
    "criteria.pprcmntText",
    "criteria.text",
    "criteria.cmtyDesc",
    "cmtyCode",
    "id",
    "text",
    "pprcmntText",
    "criteria.cmtyCode"
})
@Generated("jsonschema2pojo")
public class Comment100PutRequest {

    /**
     * Lineage reference object : PPRCMNT_TEXT
     * (Required)
     * 
     */
    @JsonProperty("criteria.pprcmntText")
    @JsonPropertyDescription("Lineage reference object : PPRCMNT_TEXT")
    private String criteriaPprcmntText;
    /**
     * Comment
     * <p>
     * Lineage reference object : PPRCCMT_TEXT
     * 
     */
    @JsonProperty("criteria.text")
    @JsonPropertyDescription("Lineage reference object : PPRCCMT_TEXT")
    private String criteriaText;
    @JsonProperty("criteria.cmtyDesc")
    private String criteriaCmtyDesc;
    /**
     * Code
     * <p>
     * Lineage reference object : PPRCCMT_CMTY_CODE, Lookup lineage reference object : ptvcmty
     * (Required)
     * 
     */
    @JsonProperty("cmtyCode")
    @JsonPropertyDescription("Lineage reference object : PPRCCMT_CMTY_CODE, Lookup lineage reference object : ptvcmty")
    private String cmtyCode;
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
     * Comment
     * <p>
     * Lineage reference object : PPRCCMT_TEXT
     * 
     */
    @JsonProperty("text")
    @JsonPropertyDescription("Lineage reference object : PPRCCMT_TEXT")
    private String text;
    /**
     * Lineage reference object : PPRCMNT_TEXT
     * (Required)
     * 
     */
    @JsonProperty("pprcmntText")
    @JsonPropertyDescription("Lineage reference object : PPRCMNT_TEXT")
    private String pprcmntText;
    /**
     * Code
     * <p>
     * Lineage reference object : PPRCCMT_CMTY_CODE, Lookup lineage reference object : ptvcmty
     * (Required)
     * 
     */
    @JsonProperty("criteria.cmtyCode")
    @JsonPropertyDescription("Lineage reference object : PPRCCMT_CMTY_CODE, Lookup lineage reference object : ptvcmty")
    private String criteriaCmtyCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : PPRCMNT_TEXT
     * (Required)
     * 
     */
    @JsonProperty("criteria.pprcmntText")
    public String getCriteriaPprcmntText() {
        return criteriaPprcmntText;
    }

    /**
     * Lineage reference object : PPRCMNT_TEXT
     * (Required)
     * 
     */
    @JsonProperty("criteria.pprcmntText")
    public void setCriteriaPprcmntText(String criteriaPprcmntText) {
        this.criteriaPprcmntText = criteriaPprcmntText;
    }

    public Comment100PutRequest withCriteriaPprcmntText(String criteriaPprcmntText) {
        this.criteriaPprcmntText = criteriaPprcmntText;
        return this;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : PPRCCMT_TEXT
     * 
     */
    @JsonProperty("criteria.text")
    public String getCriteriaText() {
        return criteriaText;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : PPRCCMT_TEXT
     * 
     */
    @JsonProperty("criteria.text")
    public void setCriteriaText(String criteriaText) {
        this.criteriaText = criteriaText;
    }

    public Comment100PutRequest withCriteriaText(String criteriaText) {
        this.criteriaText = criteriaText;
        return this;
    }

    @JsonProperty("criteria.cmtyDesc")
    public String getCriteriaCmtyDesc() {
        return criteriaCmtyDesc;
    }

    @JsonProperty("criteria.cmtyDesc")
    public void setCriteriaCmtyDesc(String criteriaCmtyDesc) {
        this.criteriaCmtyDesc = criteriaCmtyDesc;
    }

    public Comment100PutRequest withCriteriaCmtyDesc(String criteriaCmtyDesc) {
        this.criteriaCmtyDesc = criteriaCmtyDesc;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : PPRCCMT_CMTY_CODE, Lookup lineage reference object : ptvcmty
     * (Required)
     * 
     */
    @JsonProperty("cmtyCode")
    public String getCmtyCode() {
        return cmtyCode;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : PPRCCMT_CMTY_CODE, Lookup lineage reference object : ptvcmty
     * (Required)
     * 
     */
    @JsonProperty("cmtyCode")
    public void setCmtyCode(String cmtyCode) {
        this.cmtyCode = cmtyCode;
    }

    public Comment100PutRequest withCmtyCode(String cmtyCode) {
        this.cmtyCode = cmtyCode;
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

    public Comment100PutRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : PPRCCMT_TEXT
     * 
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : PPRCCMT_TEXT
     * 
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    public Comment100PutRequest withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Lineage reference object : PPRCMNT_TEXT
     * (Required)
     * 
     */
    @JsonProperty("pprcmntText")
    public String getPprcmntText() {
        return pprcmntText;
    }

    /**
     * Lineage reference object : PPRCMNT_TEXT
     * (Required)
     * 
     */
    @JsonProperty("pprcmntText")
    public void setPprcmntText(String pprcmntText) {
        this.pprcmntText = pprcmntText;
    }

    public Comment100PutRequest withPprcmntText(String pprcmntText) {
        this.pprcmntText = pprcmntText;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : PPRCCMT_CMTY_CODE, Lookup lineage reference object : ptvcmty
     * (Required)
     * 
     */
    @JsonProperty("criteria.cmtyCode")
    public String getCriteriaCmtyCode() {
        return criteriaCmtyCode;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : PPRCCMT_CMTY_CODE, Lookup lineage reference object : ptvcmty
     * (Required)
     * 
     */
    @JsonProperty("criteria.cmtyCode")
    public void setCriteriaCmtyCode(String criteriaCmtyCode) {
        this.criteriaCmtyCode = criteriaCmtyCode;
    }

    public Comment100PutRequest withCriteriaCmtyCode(String criteriaCmtyCode) {
        this.criteriaCmtyCode = criteriaCmtyCode;
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

    public Comment100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Comment100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaPprcmntText");
        sb.append('=');
        sb.append(((this.criteriaPprcmntText == null)?"<null>":this.criteriaPprcmntText));
        sb.append(',');
        sb.append("criteriaText");
        sb.append('=');
        sb.append(((this.criteriaText == null)?"<null>":this.criteriaText));
        sb.append(',');
        sb.append("criteriaCmtyDesc");
        sb.append('=');
        sb.append(((this.criteriaCmtyDesc == null)?"<null>":this.criteriaCmtyDesc));
        sb.append(',');
        sb.append("cmtyCode");
        sb.append('=');
        sb.append(((this.cmtyCode == null)?"<null>":this.cmtyCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
        sb.append(',');
        sb.append("pprcmntText");
        sb.append('=');
        sb.append(((this.pprcmntText == null)?"<null>":this.pprcmntText));
        sb.append(',');
        sb.append("criteriaCmtyCode");
        sb.append('=');
        sb.append(((this.criteriaCmtyCode == null)?"<null>":this.criteriaCmtyCode));
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
        result = ((result* 31)+((this.criteriaText == null)? 0 :this.criteriaText.hashCode()));
        result = ((result* 31)+((this.cmtyCode == null)? 0 :this.cmtyCode.hashCode()));
        result = ((result* 31)+((this.criteriaCmtyCode == null)? 0 :this.criteriaCmtyCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.text == null)? 0 :this.text.hashCode()));
        result = ((result* 31)+((this.pprcmntText == null)? 0 :this.pprcmntText.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaPprcmntText == null)? 0 :this.criteriaPprcmntText.hashCode()));
        result = ((result* 31)+((this.criteriaCmtyDesc == null)? 0 :this.criteriaCmtyDesc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Comment100PutRequest) == false) {
            return false;
        }
        Comment100PutRequest rhs = ((Comment100PutRequest) other);
        return ((((((((((this.criteriaText == rhs.criteriaText)||((this.criteriaText!= null)&&this.criteriaText.equals(rhs.criteriaText)))&&((this.cmtyCode == rhs.cmtyCode)||((this.cmtyCode!= null)&&this.cmtyCode.equals(rhs.cmtyCode))))&&((this.criteriaCmtyCode == rhs.criteriaCmtyCode)||((this.criteriaCmtyCode!= null)&&this.criteriaCmtyCode.equals(rhs.criteriaCmtyCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.text == rhs.text)||((this.text!= null)&&this.text.equals(rhs.text))))&&((this.pprcmntText == rhs.pprcmntText)||((this.pprcmntText!= null)&&this.pprcmntText.equals(rhs.pprcmntText))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaPprcmntText == rhs.criteriaPprcmntText)||((this.criteriaPprcmntText!= null)&&this.criteriaPprcmntText.equals(rhs.criteriaPprcmntText))))&&((this.criteriaCmtyDesc == rhs.criteriaCmtyDesc)||((this.criteriaCmtyDesc!= null)&&this.criteriaCmtyDesc.equals(rhs.criteriaCmtyDesc))));
    }

}
