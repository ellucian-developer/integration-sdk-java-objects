
package com.ellucian.generated.bpapi.ban.parameter_definition.v1_0_0;

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
    "keyblckJob",
    "number",
    "desc",
    "singleInd",
    "typeInd",
    "listValues",
    "length",
    "lowRange",
    "validation",
    "highRange",
    "helpText",
    "optionalInd"
})
@Generated("jsonschema2pojo")
public class ParameterDefinition100QapiPost {

    @JsonProperty("keyblckJob")
    private String keyblckJob;
    /**
     * Parameter
     * <p>
     * Lineage reference object : GJBPDEF_NUMBER
     * 
     */
    @JsonProperty("number")
    @JsonPropertyDescription("Lineage reference object : GJBPDEF_NUMBER")
    private String number;
    /**
     * Lineage reference object : GJBPDEF_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : GJBPDEF_DESC")
    private String desc;
    /**
     * Lineage reference object : GJBPDEF_SINGLE_IND
     * 
     */
    @JsonProperty("singleInd")
    @JsonPropertyDescription("Lineage reference object : GJBPDEF_SINGLE_IND")
    private String singleInd;
    /**
     * Type
     * <p>
     * Lineage reference object : GJBPDEF_TYPE_IND
     * 
     */
    @JsonProperty("typeInd")
    @JsonPropertyDescription("Lineage reference object : GJBPDEF_TYPE_IND")
    private String typeInd;
    /**
     * List
     * <p>
     * Lineage reference object : GJBPDEF_LIST_VALUES
     * 
     */
    @JsonProperty("listValues")
    @JsonPropertyDescription("Lineage reference object : GJBPDEF_LIST_VALUES")
    private String listValues;
    /**
     * Length
     * <p>
     * Lineage reference object : GJBPDEF_LENGTH
     * 
     */
    @JsonProperty("length")
    @JsonPropertyDescription("Lineage reference object : GJBPDEF_LENGTH")
    private Double length;
    /**
     * Low
     * <p>
     * Lineage reference object : GJBPDEF_LOW_RANGE
     * 
     */
    @JsonProperty("lowRange")
    @JsonPropertyDescription("Lineage reference object : GJBPDEF_LOW_RANGE")
    private String lowRange;
    /**
     * Validation
     * <p>
     * Lineage reference object : GJBPDEF_VALIDATION
     * 
     */
    @JsonProperty("validation")
    @JsonPropertyDescription("Lineage reference object : GJBPDEF_VALIDATION")
    private String validation;
    /**
     * High
     * <p>
     * Lineage reference object : GJBPDEF_HIGH_RANGE
     * 
     */
    @JsonProperty("highRange")
    @JsonPropertyDescription("Lineage reference object : GJBPDEF_HIGH_RANGE")
    private String highRange;
    /**
     * Help
     * <p>
     * Lineage reference object : GJBPDEF_HELP_TEXT
     * 
     */
    @JsonProperty("helpText")
    @JsonPropertyDescription("Lineage reference object : GJBPDEF_HELP_TEXT")
    private String helpText;
    /**
     * Lineage reference object : GJBPDEF_OPTIONAL_IND
     * 
     */
    @JsonProperty("optionalInd")
    @JsonPropertyDescription("Lineage reference object : GJBPDEF_OPTIONAL_IND")
    private String optionalInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("keyblckJob")
    public String getKeyblckJob() {
        return keyblckJob;
    }

    @JsonProperty("keyblckJob")
    public void setKeyblckJob(String keyblckJob) {
        this.keyblckJob = keyblckJob;
    }

    public ParameterDefinition100QapiPost withKeyblckJob(String keyblckJob) {
        this.keyblckJob = keyblckJob;
        return this;
    }

    /**
     * Parameter
     * <p>
     * Lineage reference object : GJBPDEF_NUMBER
     * 
     */
    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    /**
     * Parameter
     * <p>
     * Lineage reference object : GJBPDEF_NUMBER
     * 
     */
    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    public ParameterDefinition100QapiPost withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Lineage reference object : GJBPDEF_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Lineage reference object : GJBPDEF_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ParameterDefinition100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Lineage reference object : GJBPDEF_SINGLE_IND
     * 
     */
    @JsonProperty("singleInd")
    public String getSingleInd() {
        return singleInd;
    }

    /**
     * Lineage reference object : GJBPDEF_SINGLE_IND
     * 
     */
    @JsonProperty("singleInd")
    public void setSingleInd(String singleInd) {
        this.singleInd = singleInd;
    }

    public ParameterDefinition100QapiPost withSingleInd(String singleInd) {
        this.singleInd = singleInd;
        return this;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : GJBPDEF_TYPE_IND
     * 
     */
    @JsonProperty("typeInd")
    public String getTypeInd() {
        return typeInd;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : GJBPDEF_TYPE_IND
     * 
     */
    @JsonProperty("typeInd")
    public void setTypeInd(String typeInd) {
        this.typeInd = typeInd;
    }

    public ParameterDefinition100QapiPost withTypeInd(String typeInd) {
        this.typeInd = typeInd;
        return this;
    }

    /**
     * List
     * <p>
     * Lineage reference object : GJBPDEF_LIST_VALUES
     * 
     */
    @JsonProperty("listValues")
    public String getListValues() {
        return listValues;
    }

    /**
     * List
     * <p>
     * Lineage reference object : GJBPDEF_LIST_VALUES
     * 
     */
    @JsonProperty("listValues")
    public void setListValues(String listValues) {
        this.listValues = listValues;
    }

    public ParameterDefinition100QapiPost withListValues(String listValues) {
        this.listValues = listValues;
        return this;
    }

    /**
     * Length
     * <p>
     * Lineage reference object : GJBPDEF_LENGTH
     * 
     */
    @JsonProperty("length")
    public Double getLength() {
        return length;
    }

    /**
     * Length
     * <p>
     * Lineage reference object : GJBPDEF_LENGTH
     * 
     */
    @JsonProperty("length")
    public void setLength(Double length) {
        this.length = length;
    }

    public ParameterDefinition100QapiPost withLength(Double length) {
        this.length = length;
        return this;
    }

    /**
     * Low
     * <p>
     * Lineage reference object : GJBPDEF_LOW_RANGE
     * 
     */
    @JsonProperty("lowRange")
    public String getLowRange() {
        return lowRange;
    }

    /**
     * Low
     * <p>
     * Lineage reference object : GJBPDEF_LOW_RANGE
     * 
     */
    @JsonProperty("lowRange")
    public void setLowRange(String lowRange) {
        this.lowRange = lowRange;
    }

    public ParameterDefinition100QapiPost withLowRange(String lowRange) {
        this.lowRange = lowRange;
        return this;
    }

    /**
     * Validation
     * <p>
     * Lineage reference object : GJBPDEF_VALIDATION
     * 
     */
    @JsonProperty("validation")
    public String getValidation() {
        return validation;
    }

    /**
     * Validation
     * <p>
     * Lineage reference object : GJBPDEF_VALIDATION
     * 
     */
    @JsonProperty("validation")
    public void setValidation(String validation) {
        this.validation = validation;
    }

    public ParameterDefinition100QapiPost withValidation(String validation) {
        this.validation = validation;
        return this;
    }

    /**
     * High
     * <p>
     * Lineage reference object : GJBPDEF_HIGH_RANGE
     * 
     */
    @JsonProperty("highRange")
    public String getHighRange() {
        return highRange;
    }

    /**
     * High
     * <p>
     * Lineage reference object : GJBPDEF_HIGH_RANGE
     * 
     */
    @JsonProperty("highRange")
    public void setHighRange(String highRange) {
        this.highRange = highRange;
    }

    public ParameterDefinition100QapiPost withHighRange(String highRange) {
        this.highRange = highRange;
        return this;
    }

    /**
     * Help
     * <p>
     * Lineage reference object : GJBPDEF_HELP_TEXT
     * 
     */
    @JsonProperty("helpText")
    public String getHelpText() {
        return helpText;
    }

    /**
     * Help
     * <p>
     * Lineage reference object : GJBPDEF_HELP_TEXT
     * 
     */
    @JsonProperty("helpText")
    public void setHelpText(String helpText) {
        this.helpText = helpText;
    }

    public ParameterDefinition100QapiPost withHelpText(String helpText) {
        this.helpText = helpText;
        return this;
    }

    /**
     * Lineage reference object : GJBPDEF_OPTIONAL_IND
     * 
     */
    @JsonProperty("optionalInd")
    public String getOptionalInd() {
        return optionalInd;
    }

    /**
     * Lineage reference object : GJBPDEF_OPTIONAL_IND
     * 
     */
    @JsonProperty("optionalInd")
    public void setOptionalInd(String optionalInd) {
        this.optionalInd = optionalInd;
    }

    public ParameterDefinition100QapiPost withOptionalInd(String optionalInd) {
        this.optionalInd = optionalInd;
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

    public ParameterDefinition100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ParameterDefinition100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblckJob");
        sb.append('=');
        sb.append(((this.keyblckJob == null)?"<null>":this.keyblckJob));
        sb.append(',');
        sb.append("number");
        sb.append('=');
        sb.append(((this.number == null)?"<null>":this.number));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("singleInd");
        sb.append('=');
        sb.append(((this.singleInd == null)?"<null>":this.singleInd));
        sb.append(',');
        sb.append("typeInd");
        sb.append('=');
        sb.append(((this.typeInd == null)?"<null>":this.typeInd));
        sb.append(',');
        sb.append("listValues");
        sb.append('=');
        sb.append(((this.listValues == null)?"<null>":this.listValues));
        sb.append(',');
        sb.append("length");
        sb.append('=');
        sb.append(((this.length == null)?"<null>":this.length));
        sb.append(',');
        sb.append("lowRange");
        sb.append('=');
        sb.append(((this.lowRange == null)?"<null>":this.lowRange));
        sb.append(',');
        sb.append("validation");
        sb.append('=');
        sb.append(((this.validation == null)?"<null>":this.validation));
        sb.append(',');
        sb.append("highRange");
        sb.append('=');
        sb.append(((this.highRange == null)?"<null>":this.highRange));
        sb.append(',');
        sb.append("helpText");
        sb.append('=');
        sb.append(((this.helpText == null)?"<null>":this.helpText));
        sb.append(',');
        sb.append("optionalInd");
        sb.append('=');
        sb.append(((this.optionalInd == null)?"<null>":this.optionalInd));
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
        result = ((result* 31)+((this.typeInd == null)? 0 :this.typeInd.hashCode()));
        result = ((result* 31)+((this.helpText == null)? 0 :this.helpText.hashCode()));
        result = ((result* 31)+((this.optionalInd == null)? 0 :this.optionalInd.hashCode()));
        result = ((result* 31)+((this.length == null)? 0 :this.length.hashCode()));
        result = ((result* 31)+((this.highRange == null)? 0 :this.highRange.hashCode()));
        result = ((result* 31)+((this.number == null)? 0 :this.number.hashCode()));
        result = ((result* 31)+((this.listValues == null)? 0 :this.listValues.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.singleInd == null)? 0 :this.singleInd.hashCode()));
        result = ((result* 31)+((this.lowRange == null)? 0 :this.lowRange.hashCode()));
        result = ((result* 31)+((this.validation == null)? 0 :this.validation.hashCode()));
        result = ((result* 31)+((this.keyblckJob == null)? 0 :this.keyblckJob.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ParameterDefinition100QapiPost) == false) {
            return false;
        }
        ParameterDefinition100QapiPost rhs = ((ParameterDefinition100QapiPost) other);
        return ((((((((((((((this.typeInd == rhs.typeInd)||((this.typeInd!= null)&&this.typeInd.equals(rhs.typeInd)))&&((this.helpText == rhs.helpText)||((this.helpText!= null)&&this.helpText.equals(rhs.helpText))))&&((this.optionalInd == rhs.optionalInd)||((this.optionalInd!= null)&&this.optionalInd.equals(rhs.optionalInd))))&&((this.length == rhs.length)||((this.length!= null)&&this.length.equals(rhs.length))))&&((this.highRange == rhs.highRange)||((this.highRange!= null)&&this.highRange.equals(rhs.highRange))))&&((this.number == rhs.number)||((this.number!= null)&&this.number.equals(rhs.number))))&&((this.listValues == rhs.listValues)||((this.listValues!= null)&&this.listValues.equals(rhs.listValues))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.singleInd == rhs.singleInd)||((this.singleInd!= null)&&this.singleInd.equals(rhs.singleInd))))&&((this.lowRange == rhs.lowRange)||((this.lowRange!= null)&&this.lowRange.equals(rhs.lowRange))))&&((this.validation == rhs.validation)||((this.validation!= null)&&this.validation.equals(rhs.validation))))&&((this.keyblckJob == rhs.keyblckJob)||((this.keyblckJob!= null)&&this.keyblckJob.equals(rhs.keyblckJob))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
