
package com.ellucian.generated.bpapi.ban.batch_check_print.v1_0_0;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "runDate",
    "startChkNoAn",
    "lastChkNoAn",
    "restartChkNoAn"
})
@Generated("jsonschema2pojo")
public class BatchCheckPrint100GetResponse {

    /**
     * Check Date
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("runDate")
    private Date runDate;
    /**
     * STARTING Check Number
     * <p>
     * 
     * 
     */
    @JsonProperty("startChkNoAn")
    private String startChkNoAn;
    /**
     * Last GOOD Check Number
     * <p>
     * 
     * 
     */
    @JsonProperty("lastChkNoAn")
    private String lastChkNoAn;
    /**
     * RESTART Check Number
     * <p>
     * 
     * 
     */
    @JsonProperty("restartChkNoAn")
    private String restartChkNoAn;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Check Date
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("runDate")
    public Date getRunDate() {
        return runDate;
    }

    /**
     * Check Date
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("runDate")
    public void setRunDate(Date runDate) {
        this.runDate = runDate;
    }

    public BatchCheckPrint100GetResponse withRunDate(Date runDate) {
        this.runDate = runDate;
        return this;
    }

    /**
     * STARTING Check Number
     * <p>
     * 
     * 
     */
    @JsonProperty("startChkNoAn")
    public String getStartChkNoAn() {
        return startChkNoAn;
    }

    /**
     * STARTING Check Number
     * <p>
     * 
     * 
     */
    @JsonProperty("startChkNoAn")
    public void setStartChkNoAn(String startChkNoAn) {
        this.startChkNoAn = startChkNoAn;
    }

    public BatchCheckPrint100GetResponse withStartChkNoAn(String startChkNoAn) {
        this.startChkNoAn = startChkNoAn;
        return this;
    }

    /**
     * Last GOOD Check Number
     * <p>
     * 
     * 
     */
    @JsonProperty("lastChkNoAn")
    public String getLastChkNoAn() {
        return lastChkNoAn;
    }

    /**
     * Last GOOD Check Number
     * <p>
     * 
     * 
     */
    @JsonProperty("lastChkNoAn")
    public void setLastChkNoAn(String lastChkNoAn) {
        this.lastChkNoAn = lastChkNoAn;
    }

    public BatchCheckPrint100GetResponse withLastChkNoAn(String lastChkNoAn) {
        this.lastChkNoAn = lastChkNoAn;
        return this;
    }

    /**
     * RESTART Check Number
     * <p>
     * 
     * 
     */
    @JsonProperty("restartChkNoAn")
    public String getRestartChkNoAn() {
        return restartChkNoAn;
    }

    /**
     * RESTART Check Number
     * <p>
     * 
     * 
     */
    @JsonProperty("restartChkNoAn")
    public void setRestartChkNoAn(String restartChkNoAn) {
        this.restartChkNoAn = restartChkNoAn;
    }

    public BatchCheckPrint100GetResponse withRestartChkNoAn(String restartChkNoAn) {
        this.restartChkNoAn = restartChkNoAn;
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

    public BatchCheckPrint100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BatchCheckPrint100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("runDate");
        sb.append('=');
        sb.append(((this.runDate == null)?"<null>":this.runDate));
        sb.append(',');
        sb.append("startChkNoAn");
        sb.append('=');
        sb.append(((this.startChkNoAn == null)?"<null>":this.startChkNoAn));
        sb.append(',');
        sb.append("lastChkNoAn");
        sb.append('=');
        sb.append(((this.lastChkNoAn == null)?"<null>":this.lastChkNoAn));
        sb.append(',');
        sb.append("restartChkNoAn");
        sb.append('=');
        sb.append(((this.restartChkNoAn == null)?"<null>":this.restartChkNoAn));
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
        result = ((result* 31)+((this.lastChkNoAn == null)? 0 :this.lastChkNoAn.hashCode()));
        result = ((result* 31)+((this.runDate == null)? 0 :this.runDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.startChkNoAn == null)? 0 :this.startChkNoAn.hashCode()));
        result = ((result* 31)+((this.restartChkNoAn == null)? 0 :this.restartChkNoAn.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BatchCheckPrint100GetResponse) == false) {
            return false;
        }
        BatchCheckPrint100GetResponse rhs = ((BatchCheckPrint100GetResponse) other);
        return ((((((this.lastChkNoAn == rhs.lastChkNoAn)||((this.lastChkNoAn!= null)&&this.lastChkNoAn.equals(rhs.lastChkNoAn)))&&((this.runDate == rhs.runDate)||((this.runDate!= null)&&this.runDate.equals(rhs.runDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.startChkNoAn == rhs.startChkNoAn)||((this.startChkNoAn!= null)&&this.startChkNoAn.equals(rhs.startChkNoAn))))&&((this.restartChkNoAn == rhs.restartChkNoAn)||((this.restartChkNoAn!= null)&&this.restartChkNoAn.equals(rhs.restartChkNoAn))));
    }

}
