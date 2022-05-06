
package com.ellucian.generated.bpapi.ban.general_user_preferences_maintenance.v1_0_0;

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
    "dataExtractPromptCb",
    "deceasedPromptCb",
    "releaseCb",
    "formnameCb",
    "duplicateSsnCb",
    "enableBtnAccessibilityModeCb",
    "confidentialPromptCb",
    "dbaseInstCb",
    "formnameDisplayInd",
    "exitPromptCb"
})
@Generated("jsonschema2pojo")
public class DisplayOption__1 {

    /**
     * Include Header Row in Data Extract
     * <p>
     * Lineage reference object : dataExtractPromptCb
     * 
     */
    @JsonProperty("dataExtractPromptCb")
    @JsonPropertyDescription("Lineage reference object : dataExtractPromptCb")
    private Object dataExtractPromptCb;
    /**
     * Display Additional Deceased Warning
     * <p>
     * Lineage reference object : deceasedPromptCb
     * 
     */
    @JsonProperty("deceasedPromptCb")
    @JsonPropertyDescription("Lineage reference object : deceasedPromptCb")
    private Object deceasedPromptCb;
    /**
     * Display Release Number on Title Bar
     * <p>
     * Lineage reference object : releaseCb
     * 
     */
    @JsonProperty("releaseCb")
    @JsonPropertyDescription("Lineage reference object : releaseCb")
    private Object releaseCb;
    /**
     * Display Form Name on Title Bar
     * <p>
     * Lineage reference object : formnameCb
     * 
     */
    @JsonProperty("formnameCb")
    @JsonPropertyDescription("Lineage reference object : formnameCb")
    private Object formnameCb;
    /**
     * Display Duplicate SSN/SIN/TIN Warning
     * <p>
     * Lineage reference object : duplicateSsnCb
     * 
     */
    @JsonProperty("duplicateSsnCb")
    @JsonPropertyDescription("Lineage reference object : duplicateSsnCb")
    private Object duplicateSsnCb;
    /**
     * Lineage reference object : enableBtnAccessibilityModeCb
     * 
     */
    @JsonProperty("enableBtnAccessibilityModeCb")
    @JsonPropertyDescription("Lineage reference object : enableBtnAccessibilityModeCb")
    private Object enableBtnAccessibilityModeCb;
    /**
     * Display Additional Confidential Warning
     * <p>
     * Lineage reference object : confidentialPromptCb
     * 
     */
    @JsonProperty("confidentialPromptCb")
    @JsonPropertyDescription("Lineage reference object : confidentialPromptCb")
    private Object confidentialPromptCb;
    /**
     * Display Database Instance on Title Bar
     * <p>
     * Lineage reference object : dbaseInstCb
     * 
     */
    @JsonProperty("dbaseInstCb")
    @JsonPropertyDescription("Lineage reference object : dbaseInstCb")
    private Object dbaseInstCb;
    /**
     * Display Form Name on Menu
     * <p>
     * Lineage reference object : formnameDisplayInd
     * 
     */
    @JsonProperty("formnameDisplayInd")
    @JsonPropertyDescription("Lineage reference object : formnameDisplayInd")
    private Object formnameDisplayInd;
    /**
     * Prompt Before Exiting Banner
     * <p>
     * Lineage reference object : exitPromptCb
     * 
     */
    @JsonProperty("exitPromptCb")
    @JsonPropertyDescription("Lineage reference object : exitPromptCb")
    private Object exitPromptCb;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Include Header Row in Data Extract
     * <p>
     * Lineage reference object : dataExtractPromptCb
     * 
     */
    @JsonProperty("dataExtractPromptCb")
    public Object getDataExtractPromptCb() {
        return dataExtractPromptCb;
    }

    /**
     * Include Header Row in Data Extract
     * <p>
     * Lineage reference object : dataExtractPromptCb
     * 
     */
    @JsonProperty("dataExtractPromptCb")
    public void setDataExtractPromptCb(Object dataExtractPromptCb) {
        this.dataExtractPromptCb = dataExtractPromptCb;
    }

    public DisplayOption__1 withDataExtractPromptCb(Object dataExtractPromptCb) {
        this.dataExtractPromptCb = dataExtractPromptCb;
        return this;
    }

    /**
     * Display Additional Deceased Warning
     * <p>
     * Lineage reference object : deceasedPromptCb
     * 
     */
    @JsonProperty("deceasedPromptCb")
    public Object getDeceasedPromptCb() {
        return deceasedPromptCb;
    }

    /**
     * Display Additional Deceased Warning
     * <p>
     * Lineage reference object : deceasedPromptCb
     * 
     */
    @JsonProperty("deceasedPromptCb")
    public void setDeceasedPromptCb(Object deceasedPromptCb) {
        this.deceasedPromptCb = deceasedPromptCb;
    }

    public DisplayOption__1 withDeceasedPromptCb(Object deceasedPromptCb) {
        this.deceasedPromptCb = deceasedPromptCb;
        return this;
    }

    /**
     * Display Release Number on Title Bar
     * <p>
     * Lineage reference object : releaseCb
     * 
     */
    @JsonProperty("releaseCb")
    public Object getReleaseCb() {
        return releaseCb;
    }

    /**
     * Display Release Number on Title Bar
     * <p>
     * Lineage reference object : releaseCb
     * 
     */
    @JsonProperty("releaseCb")
    public void setReleaseCb(Object releaseCb) {
        this.releaseCb = releaseCb;
    }

    public DisplayOption__1 withReleaseCb(Object releaseCb) {
        this.releaseCb = releaseCb;
        return this;
    }

    /**
     * Display Form Name on Title Bar
     * <p>
     * Lineage reference object : formnameCb
     * 
     */
    @JsonProperty("formnameCb")
    public Object getFormnameCb() {
        return formnameCb;
    }

    /**
     * Display Form Name on Title Bar
     * <p>
     * Lineage reference object : formnameCb
     * 
     */
    @JsonProperty("formnameCb")
    public void setFormnameCb(Object formnameCb) {
        this.formnameCb = formnameCb;
    }

    public DisplayOption__1 withFormnameCb(Object formnameCb) {
        this.formnameCb = formnameCb;
        return this;
    }

    /**
     * Display Duplicate SSN/SIN/TIN Warning
     * <p>
     * Lineage reference object : duplicateSsnCb
     * 
     */
    @JsonProperty("duplicateSsnCb")
    public Object getDuplicateSsnCb() {
        return duplicateSsnCb;
    }

    /**
     * Display Duplicate SSN/SIN/TIN Warning
     * <p>
     * Lineage reference object : duplicateSsnCb
     * 
     */
    @JsonProperty("duplicateSsnCb")
    public void setDuplicateSsnCb(Object duplicateSsnCb) {
        this.duplicateSsnCb = duplicateSsnCb;
    }

    public DisplayOption__1 withDuplicateSsnCb(Object duplicateSsnCb) {
        this.duplicateSsnCb = duplicateSsnCb;
        return this;
    }

    /**
     * Lineage reference object : enableBtnAccessibilityModeCb
     * 
     */
    @JsonProperty("enableBtnAccessibilityModeCb")
    public Object getEnableBtnAccessibilityModeCb() {
        return enableBtnAccessibilityModeCb;
    }

    /**
     * Lineage reference object : enableBtnAccessibilityModeCb
     * 
     */
    @JsonProperty("enableBtnAccessibilityModeCb")
    public void setEnableBtnAccessibilityModeCb(Object enableBtnAccessibilityModeCb) {
        this.enableBtnAccessibilityModeCb = enableBtnAccessibilityModeCb;
    }

    public DisplayOption__1 withEnableBtnAccessibilityModeCb(Object enableBtnAccessibilityModeCb) {
        this.enableBtnAccessibilityModeCb = enableBtnAccessibilityModeCb;
        return this;
    }

    /**
     * Display Additional Confidential Warning
     * <p>
     * Lineage reference object : confidentialPromptCb
     * 
     */
    @JsonProperty("confidentialPromptCb")
    public Object getConfidentialPromptCb() {
        return confidentialPromptCb;
    }

    /**
     * Display Additional Confidential Warning
     * <p>
     * Lineage reference object : confidentialPromptCb
     * 
     */
    @JsonProperty("confidentialPromptCb")
    public void setConfidentialPromptCb(Object confidentialPromptCb) {
        this.confidentialPromptCb = confidentialPromptCb;
    }

    public DisplayOption__1 withConfidentialPromptCb(Object confidentialPromptCb) {
        this.confidentialPromptCb = confidentialPromptCb;
        return this;
    }

    /**
     * Display Database Instance on Title Bar
     * <p>
     * Lineage reference object : dbaseInstCb
     * 
     */
    @JsonProperty("dbaseInstCb")
    public Object getDbaseInstCb() {
        return dbaseInstCb;
    }

    /**
     * Display Database Instance on Title Bar
     * <p>
     * Lineage reference object : dbaseInstCb
     * 
     */
    @JsonProperty("dbaseInstCb")
    public void setDbaseInstCb(Object dbaseInstCb) {
        this.dbaseInstCb = dbaseInstCb;
    }

    public DisplayOption__1 withDbaseInstCb(Object dbaseInstCb) {
        this.dbaseInstCb = dbaseInstCb;
        return this;
    }

    /**
     * Display Form Name on Menu
     * <p>
     * Lineage reference object : formnameDisplayInd
     * 
     */
    @JsonProperty("formnameDisplayInd")
    public Object getFormnameDisplayInd() {
        return formnameDisplayInd;
    }

    /**
     * Display Form Name on Menu
     * <p>
     * Lineage reference object : formnameDisplayInd
     * 
     */
    @JsonProperty("formnameDisplayInd")
    public void setFormnameDisplayInd(Object formnameDisplayInd) {
        this.formnameDisplayInd = formnameDisplayInd;
    }

    public DisplayOption__1 withFormnameDisplayInd(Object formnameDisplayInd) {
        this.formnameDisplayInd = formnameDisplayInd;
        return this;
    }

    /**
     * Prompt Before Exiting Banner
     * <p>
     * Lineage reference object : exitPromptCb
     * 
     */
    @JsonProperty("exitPromptCb")
    public Object getExitPromptCb() {
        return exitPromptCb;
    }

    /**
     * Prompt Before Exiting Banner
     * <p>
     * Lineage reference object : exitPromptCb
     * 
     */
    @JsonProperty("exitPromptCb")
    public void setExitPromptCb(Object exitPromptCb) {
        this.exitPromptCb = exitPromptCb;
    }

    public DisplayOption__1 withExitPromptCb(Object exitPromptCb) {
        this.exitPromptCb = exitPromptCb;
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

    public DisplayOption__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DisplayOption__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dataExtractPromptCb");
        sb.append('=');
        sb.append(((this.dataExtractPromptCb == null)?"<null>":this.dataExtractPromptCb));
        sb.append(',');
        sb.append("deceasedPromptCb");
        sb.append('=');
        sb.append(((this.deceasedPromptCb == null)?"<null>":this.deceasedPromptCb));
        sb.append(',');
        sb.append("releaseCb");
        sb.append('=');
        sb.append(((this.releaseCb == null)?"<null>":this.releaseCb));
        sb.append(',');
        sb.append("formnameCb");
        sb.append('=');
        sb.append(((this.formnameCb == null)?"<null>":this.formnameCb));
        sb.append(',');
        sb.append("duplicateSsnCb");
        sb.append('=');
        sb.append(((this.duplicateSsnCb == null)?"<null>":this.duplicateSsnCb));
        sb.append(',');
        sb.append("enableBtnAccessibilityModeCb");
        sb.append('=');
        sb.append(((this.enableBtnAccessibilityModeCb == null)?"<null>":this.enableBtnAccessibilityModeCb));
        sb.append(',');
        sb.append("confidentialPromptCb");
        sb.append('=');
        sb.append(((this.confidentialPromptCb == null)?"<null>":this.confidentialPromptCb));
        sb.append(',');
        sb.append("dbaseInstCb");
        sb.append('=');
        sb.append(((this.dbaseInstCb == null)?"<null>":this.dbaseInstCb));
        sb.append(',');
        sb.append("formnameDisplayInd");
        sb.append('=');
        sb.append(((this.formnameDisplayInd == null)?"<null>":this.formnameDisplayInd));
        sb.append(',');
        sb.append("exitPromptCb");
        sb.append('=');
        sb.append(((this.exitPromptCb == null)?"<null>":this.exitPromptCb));
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
        result = ((result* 31)+((this.dataExtractPromptCb == null)? 0 :this.dataExtractPromptCb.hashCode()));
        result = ((result* 31)+((this.deceasedPromptCb == null)? 0 :this.deceasedPromptCb.hashCode()));
        result = ((result* 31)+((this.releaseCb == null)? 0 :this.releaseCb.hashCode()));
        result = ((result* 31)+((this.formnameCb == null)? 0 :this.formnameCb.hashCode()));
        result = ((result* 31)+((this.duplicateSsnCb == null)? 0 :this.duplicateSsnCb.hashCode()));
        result = ((result* 31)+((this.enableBtnAccessibilityModeCb == null)? 0 :this.enableBtnAccessibilityModeCb.hashCode()));
        result = ((result* 31)+((this.confidentialPromptCb == null)? 0 :this.confidentialPromptCb.hashCode()));
        result = ((result* 31)+((this.dbaseInstCb == null)? 0 :this.dbaseInstCb.hashCode()));
        result = ((result* 31)+((this.formnameDisplayInd == null)? 0 :this.formnameDisplayInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.exitPromptCb == null)? 0 :this.exitPromptCb.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DisplayOption__1) == false) {
            return false;
        }
        DisplayOption__1 rhs = ((DisplayOption__1) other);
        return ((((((((((((this.dataExtractPromptCb == rhs.dataExtractPromptCb)||((this.dataExtractPromptCb!= null)&&this.dataExtractPromptCb.equals(rhs.dataExtractPromptCb)))&&((this.deceasedPromptCb == rhs.deceasedPromptCb)||((this.deceasedPromptCb!= null)&&this.deceasedPromptCb.equals(rhs.deceasedPromptCb))))&&((this.releaseCb == rhs.releaseCb)||((this.releaseCb!= null)&&this.releaseCb.equals(rhs.releaseCb))))&&((this.formnameCb == rhs.formnameCb)||((this.formnameCb!= null)&&this.formnameCb.equals(rhs.formnameCb))))&&((this.duplicateSsnCb == rhs.duplicateSsnCb)||((this.duplicateSsnCb!= null)&&this.duplicateSsnCb.equals(rhs.duplicateSsnCb))))&&((this.enableBtnAccessibilityModeCb == rhs.enableBtnAccessibilityModeCb)||((this.enableBtnAccessibilityModeCb!= null)&&this.enableBtnAccessibilityModeCb.equals(rhs.enableBtnAccessibilityModeCb))))&&((this.confidentialPromptCb == rhs.confidentialPromptCb)||((this.confidentialPromptCb!= null)&&this.confidentialPromptCb.equals(rhs.confidentialPromptCb))))&&((this.dbaseInstCb == rhs.dbaseInstCb)||((this.dbaseInstCb!= null)&&this.dbaseInstCb.equals(rhs.dbaseInstCb))))&&((this.formnameDisplayInd == rhs.formnameDisplayInd)||((this.formnameDisplayInd!= null)&&this.formnameDisplayInd.equals(rhs.formnameDisplayInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.exitPromptCb == rhs.exitPromptCb)||((this.exitPromptCb!= null)&&this.exitPromptCb.equals(rhs.exitPromptCb))));
    }

}
