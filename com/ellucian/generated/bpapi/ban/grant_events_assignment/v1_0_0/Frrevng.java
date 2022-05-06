
package com.ellucian.generated.bpapi.ban.grant_events_assignment.v1_0_0;

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
    "statusDate",
    "seqNum",
    "respUserIdDesc",
    "dueDate",
    "statusInd",
    "displayTextInd",
    "responsibleUserId"
})
@Generated("jsonschema2pojo")
public class Frrevng {

    /**
     * Frrevnp Status Date
     * <p>
     * Lineage reference object : FRREVNG_STATUS_DATE
     * 
     */
    @JsonProperty("statusDate")
    @JsonPropertyDescription("Lineage reference object : FRREVNG_STATUS_DATE")
    private Date statusDate;
    /**
     * Frrevnp Seq Num
     * <p>
     * Lineage reference object : FRREVNG_SEQ_NUM
     * 
     */
    @JsonProperty("seqNum")
    @JsonPropertyDescription("Lineage reference object : FRREVNG_SEQ_NUM")
    private Double seqNum;
    @JsonProperty("respUserIdDesc")
    private String respUserIdDesc;
    /**
     * Frrevnp Due Date
     * <p>
     * Lineage reference object : FRREVNG_DUE_DATE
     * 
     */
    @JsonProperty("dueDate")
    @JsonPropertyDescription("Lineage reference object : FRREVNG_DUE_DATE")
    private Date dueDate;
    /**
     * Frrevnp Status Ind
     * <p>
     * Lineage reference object : FRREVNG_STATUS_IND
     * (Required)
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : FRREVNG_STATUS_IND")
    private String statusInd;
    /**
     * Text
     * <p>
     * 
     * 
     */
    @JsonProperty("displayTextInd")
    private String displayTextInd;
    /**
     * Frrevnp Responsible User Id
     * <p>
     * Lineage reference object : FRREVNG_RESPONSIBLE_USER_ID
     * 
     */
    @JsonProperty("responsibleUserId")
    @JsonPropertyDescription("Lineage reference object : FRREVNG_RESPONSIBLE_USER_ID")
    private String responsibleUserId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Frrevnp Status Date
     * <p>
     * Lineage reference object : FRREVNG_STATUS_DATE
     * 
     */
    @JsonProperty("statusDate")
    public Date getStatusDate() {
        return statusDate;
    }

    /**
     * Frrevnp Status Date
     * <p>
     * Lineage reference object : FRREVNG_STATUS_DATE
     * 
     */
    @JsonProperty("statusDate")
    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
    }

    public Frrevng withStatusDate(Date statusDate) {
        this.statusDate = statusDate;
        return this;
    }

    /**
     * Frrevnp Seq Num
     * <p>
     * Lineage reference object : FRREVNG_SEQ_NUM
     * 
     */
    @JsonProperty("seqNum")
    public Double getSeqNum() {
        return seqNum;
    }

    /**
     * Frrevnp Seq Num
     * <p>
     * Lineage reference object : FRREVNG_SEQ_NUM
     * 
     */
    @JsonProperty("seqNum")
    public void setSeqNum(Double seqNum) {
        this.seqNum = seqNum;
    }

    public Frrevng withSeqNum(Double seqNum) {
        this.seqNum = seqNum;
        return this;
    }

    @JsonProperty("respUserIdDesc")
    public String getRespUserIdDesc() {
        return respUserIdDesc;
    }

    @JsonProperty("respUserIdDesc")
    public void setRespUserIdDesc(String respUserIdDesc) {
        this.respUserIdDesc = respUserIdDesc;
    }

    public Frrevng withRespUserIdDesc(String respUserIdDesc) {
        this.respUserIdDesc = respUserIdDesc;
        return this;
    }

    /**
     * Frrevnp Due Date
     * <p>
     * Lineage reference object : FRREVNG_DUE_DATE
     * 
     */
    @JsonProperty("dueDate")
    public Date getDueDate() {
        return dueDate;
    }

    /**
     * Frrevnp Due Date
     * <p>
     * Lineage reference object : FRREVNG_DUE_DATE
     * 
     */
    @JsonProperty("dueDate")
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Frrevng withDueDate(Date dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    /**
     * Frrevnp Status Ind
     * <p>
     * Lineage reference object : FRREVNG_STATUS_IND
     * (Required)
     * 
     */
    @JsonProperty("statusInd")
    public String getStatusInd() {
        return statusInd;
    }

    /**
     * Frrevnp Status Ind
     * <p>
     * Lineage reference object : FRREVNG_STATUS_IND
     * (Required)
     * 
     */
    @JsonProperty("statusInd")
    public void setStatusInd(String statusInd) {
        this.statusInd = statusInd;
    }

    public Frrevng withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * Text
     * <p>
     * 
     * 
     */
    @JsonProperty("displayTextInd")
    public String getDisplayTextInd() {
        return displayTextInd;
    }

    /**
     * Text
     * <p>
     * 
     * 
     */
    @JsonProperty("displayTextInd")
    public void setDisplayTextInd(String displayTextInd) {
        this.displayTextInd = displayTextInd;
    }

    public Frrevng withDisplayTextInd(String displayTextInd) {
        this.displayTextInd = displayTextInd;
        return this;
    }

    /**
     * Frrevnp Responsible User Id
     * <p>
     * Lineage reference object : FRREVNG_RESPONSIBLE_USER_ID
     * 
     */
    @JsonProperty("responsibleUserId")
    public String getResponsibleUserId() {
        return responsibleUserId;
    }

    /**
     * Frrevnp Responsible User Id
     * <p>
     * Lineage reference object : FRREVNG_RESPONSIBLE_USER_ID
     * 
     */
    @JsonProperty("responsibleUserId")
    public void setResponsibleUserId(String responsibleUserId) {
        this.responsibleUserId = responsibleUserId;
    }

    public Frrevng withResponsibleUserId(String responsibleUserId) {
        this.responsibleUserId = responsibleUserId;
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

    public Frrevng withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Frrevng.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("statusDate");
        sb.append('=');
        sb.append(((this.statusDate == null)?"<null>":this.statusDate));
        sb.append(',');
        sb.append("seqNum");
        sb.append('=');
        sb.append(((this.seqNum == null)?"<null>":this.seqNum));
        sb.append(',');
        sb.append("respUserIdDesc");
        sb.append('=');
        sb.append(((this.respUserIdDesc == null)?"<null>":this.respUserIdDesc));
        sb.append(',');
        sb.append("dueDate");
        sb.append('=');
        sb.append(((this.dueDate == null)?"<null>":this.dueDate));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("displayTextInd");
        sb.append('=');
        sb.append(((this.displayTextInd == null)?"<null>":this.displayTextInd));
        sb.append(',');
        sb.append("responsibleUserId");
        sb.append('=');
        sb.append(((this.responsibleUserId == null)?"<null>":this.responsibleUserId));
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
        result = ((result* 31)+((this.statusDate == null)? 0 :this.statusDate.hashCode()));
        result = ((result* 31)+((this.seqNum == null)? 0 :this.seqNum.hashCode()));
        result = ((result* 31)+((this.respUserIdDesc == null)? 0 :this.respUserIdDesc.hashCode()));
        result = ((result* 31)+((this.dueDate == null)? 0 :this.dueDate.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.displayTextInd == null)? 0 :this.displayTextInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.responsibleUserId == null)? 0 :this.responsibleUserId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Frrevng) == false) {
            return false;
        }
        Frrevng rhs = ((Frrevng) other);
        return (((((((((this.statusDate == rhs.statusDate)||((this.statusDate!= null)&&this.statusDate.equals(rhs.statusDate)))&&((this.seqNum == rhs.seqNum)||((this.seqNum!= null)&&this.seqNum.equals(rhs.seqNum))))&&((this.respUserIdDesc == rhs.respUserIdDesc)||((this.respUserIdDesc!= null)&&this.respUserIdDesc.equals(rhs.respUserIdDesc))))&&((this.dueDate == rhs.dueDate)||((this.dueDate!= null)&&this.dueDate.equals(rhs.dueDate))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.displayTextInd == rhs.displayTextInd)||((this.displayTextInd!= null)&&this.displayTextInd.equals(rhs.displayTextInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.responsibleUserId == rhs.responsibleUserId)||((this.responsibleUserId!= null)&&this.responsibleUserId.equals(rhs.responsibleUserId))));
    }

}
