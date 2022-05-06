
package com.ellucian.generated.bpapi.ban.course_prerequisites.v1_0_0;

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
    "prereqChkMethodCde",
    "maint",
    "title"
})
@Generated("jsonschema2pojo")
public class Scbcrse {

    /**
     * Lineage reference object : SCBCRSE_PREREQ_CHK_METHOD_CDE
     * 
     */
    @JsonProperty("prereqChkMethodCde")
    @JsonPropertyDescription("Lineage reference object : SCBCRSE_PREREQ_CHK_METHOD_CDE")
    private String prereqChkMethodCde;
    @JsonProperty("maint")
    private String maint;
    /**
     * Course Title
     * <p>
     * Lineage reference object : SCBCRSE_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("Lineage reference object : SCBCRSE_TITLE")
    private String title;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : SCBCRSE_PREREQ_CHK_METHOD_CDE
     * 
     */
    @JsonProperty("prereqChkMethodCde")
    public String getPrereqChkMethodCde() {
        return prereqChkMethodCde;
    }

    /**
     * Lineage reference object : SCBCRSE_PREREQ_CHK_METHOD_CDE
     * 
     */
    @JsonProperty("prereqChkMethodCde")
    public void setPrereqChkMethodCde(String prereqChkMethodCde) {
        this.prereqChkMethodCde = prereqChkMethodCde;
    }

    public Scbcrse withPrereqChkMethodCde(String prereqChkMethodCde) {
        this.prereqChkMethodCde = prereqChkMethodCde;
        return this;
    }

    @JsonProperty("maint")
    public String getMaint() {
        return maint;
    }

    @JsonProperty("maint")
    public void setMaint(String maint) {
        this.maint = maint;
    }

    public Scbcrse withMaint(String maint) {
        this.maint = maint;
        return this;
    }

    /**
     * Course Title
     * <p>
     * Lineage reference object : SCBCRSE_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Course Title
     * <p>
     * Lineage reference object : SCBCRSE_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Scbcrse withTitle(String title) {
        this.title = title;
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

    public Scbcrse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Scbcrse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("prereqChkMethodCde");
        sb.append('=');
        sb.append(((this.prereqChkMethodCde == null)?"<null>":this.prereqChkMethodCde));
        sb.append(',');
        sb.append("maint");
        sb.append('=');
        sb.append(((this.maint == null)?"<null>":this.maint));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
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
        result = ((result* 31)+((this.prereqChkMethodCde == null)? 0 :this.prereqChkMethodCde.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.maint == null)? 0 :this.maint.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Scbcrse) == false) {
            return false;
        }
        Scbcrse rhs = ((Scbcrse) other);
        return (((((this.prereqChkMethodCde == rhs.prereqChkMethodCde)||((this.prereqChkMethodCde!= null)&&this.prereqChkMethodCde.equals(rhs.prereqChkMethodCde)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.maint == rhs.maint)||((this.maint!= null)&&this.maint.equals(rhs.maint))));
    }

}
