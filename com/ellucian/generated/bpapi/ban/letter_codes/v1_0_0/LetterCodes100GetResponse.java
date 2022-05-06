
package com.ellucian.generated.bpapi.ban.letter_codes.v1_0_0;

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
    "duplInd",
    "activityDate",
    "code",
    "printCommand",
    "letrCodeAlt",
    "desc"
})
@Generated("jsonschema2pojo")
public class LetterCodes100GetResponse {

    /**
     * Lineage reference object : GTVLETR_DUPL_IND
     * 
     */
    @JsonProperty("duplInd")
    @JsonPropertyDescription("Lineage reference object : GTVLETR_DUPL_IND")
    private String duplInd;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : GTVLETR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : GTVLETR_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Letter Code
     * <p>
     * Lineage reference object : GTVLETR_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : GTVLETR_CODE")
    private String code;
    /**
     * Print Command
     * <p>
     * Lineage reference object : GTVLETR_PRINT_COMMAND
     * 
     */
    @JsonProperty("printCommand")
    @JsonPropertyDescription("Lineage reference object : GTVLETR_PRINT_COMMAND")
    private String printCommand;
    /**
     * Alternate Letter Code
     * <p>
     * Lineage reference object : GTVLETR_LETR_CODE_ALT
     * 
     */
    @JsonProperty("letrCodeAlt")
    @JsonPropertyDescription("Lineage reference object : GTVLETR_LETR_CODE_ALT")
    private String letrCodeAlt;
    /**
     * Description
     * <p>
     * Lineage reference object : GTVLETR_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : GTVLETR_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : GTVLETR_DUPL_IND
     * 
     */
    @JsonProperty("duplInd")
    public String getDuplInd() {
        return duplInd;
    }

    /**
     * Lineage reference object : GTVLETR_DUPL_IND
     * 
     */
    @JsonProperty("duplInd")
    public void setDuplInd(String duplInd) {
        this.duplInd = duplInd;
    }

    public LetterCodes100GetResponse withDuplInd(String duplInd) {
        this.duplInd = duplInd;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GTVLETR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GTVLETR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public LetterCodes100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Letter Code
     * <p>
     * Lineage reference object : GTVLETR_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Letter Code
     * <p>
     * Lineage reference object : GTVLETR_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public LetterCodes100GetResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Print Command
     * <p>
     * Lineage reference object : GTVLETR_PRINT_COMMAND
     * 
     */
    @JsonProperty("printCommand")
    public String getPrintCommand() {
        return printCommand;
    }

    /**
     * Print Command
     * <p>
     * Lineage reference object : GTVLETR_PRINT_COMMAND
     * 
     */
    @JsonProperty("printCommand")
    public void setPrintCommand(String printCommand) {
        this.printCommand = printCommand;
    }

    public LetterCodes100GetResponse withPrintCommand(String printCommand) {
        this.printCommand = printCommand;
        return this;
    }

    /**
     * Alternate Letter Code
     * <p>
     * Lineage reference object : GTVLETR_LETR_CODE_ALT
     * 
     */
    @JsonProperty("letrCodeAlt")
    public String getLetrCodeAlt() {
        return letrCodeAlt;
    }

    /**
     * Alternate Letter Code
     * <p>
     * Lineage reference object : GTVLETR_LETR_CODE_ALT
     * 
     */
    @JsonProperty("letrCodeAlt")
    public void setLetrCodeAlt(String letrCodeAlt) {
        this.letrCodeAlt = letrCodeAlt;
    }

    public LetterCodes100GetResponse withLetrCodeAlt(String letrCodeAlt) {
        this.letrCodeAlt = letrCodeAlt;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : GTVLETR_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : GTVLETR_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public LetterCodes100GetResponse withDesc(String desc) {
        this.desc = desc;
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

    public LetterCodes100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LetterCodes100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("duplInd");
        sb.append('=');
        sb.append(((this.duplInd == null)?"<null>":this.duplInd));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("printCommand");
        sb.append('=');
        sb.append(((this.printCommand == null)?"<null>":this.printCommand));
        sb.append(',');
        sb.append("letrCodeAlt");
        sb.append('=');
        sb.append(((this.letrCodeAlt == null)?"<null>":this.letrCodeAlt));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
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
        result = ((result* 31)+((this.duplInd == null)? 0 :this.duplInd.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.printCommand == null)? 0 :this.printCommand.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.letrCodeAlt == null)? 0 :this.letrCodeAlt.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LetterCodes100GetResponse) == false) {
            return false;
        }
        LetterCodes100GetResponse rhs = ((LetterCodes100GetResponse) other);
        return ((((((((this.duplInd == rhs.duplInd)||((this.duplInd!= null)&&this.duplInd.equals(rhs.duplInd)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.printCommand == rhs.printCommand)||((this.printCommand!= null)&&this.printCommand.equals(rhs.printCommand))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.letrCodeAlt == rhs.letrCodeAlt)||((this.letrCodeAlt!= null)&&this.letrCodeAlt.equals(rhs.letrCodeAlt))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
