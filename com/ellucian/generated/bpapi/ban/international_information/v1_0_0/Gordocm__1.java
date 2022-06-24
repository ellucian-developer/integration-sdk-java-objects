
package com.ellucian.generated.bpapi.ban.international_information.v1_0_0;

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
    "disposition",
    "srceCode",
    "requestDate",
    "docmCode",
    "receivedDate",
    "docmDesc",
    "srceDesc"
})
@Generated("jsonschema2pojo")
public class Gordocm__1 {

    /**
     * Disposition
     * <p>
     * Lineage reference object : GORDOCM_DISPOSITION
     * (Required)
     * 
     */
    @JsonProperty("disposition")
    @JsonPropertyDescription("Lineage reference object : GORDOCM_DISPOSITION")
    private String disposition;
    /**
     * Source
     * <p>
     * Lineage reference object : GORDOCM_SRCE_CODE, Lookup lineage reference object : gtvsrce
     * 
     */
    @JsonProperty("srceCode")
    @JsonPropertyDescription("Lineage reference object : GORDOCM_SRCE_CODE, Lookup lineage reference object : gtvsrce")
    private String srceCode;
    /**
     * Date Requested
     * <p>
     * Lineage reference object : GORDOCM_REQUEST_DATE
     * 
     */
    @JsonProperty("requestDate")
    @JsonPropertyDescription("Lineage reference object : GORDOCM_REQUEST_DATE")
    private Date requestDate;
    /**
     * Document
     * <p>
     * Lineage reference object : GORDOCM_DOCM_CODE, Lookup lineage reference object : gtvdocm
     * 
     */
    @JsonProperty("docmCode")
    @JsonPropertyDescription("Lineage reference object : GORDOCM_DOCM_CODE, Lookup lineage reference object : gtvdocm")
    private String docmCode;
    /**
     * Date Received
     * <p>
     * Lineage reference object : GORDOCM_RECEIVED_DATE
     * 
     */
    @JsonProperty("receivedDate")
    @JsonPropertyDescription("Lineage reference object : GORDOCM_RECEIVED_DATE")
    private Date receivedDate;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("docmDesc")
    private String docmDesc;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("srceDesc")
    private String srceDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Disposition
     * <p>
     * Lineage reference object : GORDOCM_DISPOSITION
     * (Required)
     * 
     */
    @JsonProperty("disposition")
    public String getDisposition() {
        return disposition;
    }

    /**
     * Disposition
     * <p>
     * Lineage reference object : GORDOCM_DISPOSITION
     * (Required)
     * 
     */
    @JsonProperty("disposition")
    public void setDisposition(String disposition) {
        this.disposition = disposition;
    }

    public Gordocm__1 withDisposition(String disposition) {
        this.disposition = disposition;
        return this;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : GORDOCM_SRCE_CODE, Lookup lineage reference object : gtvsrce
     * 
     */
    @JsonProperty("srceCode")
    public String getSrceCode() {
        return srceCode;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : GORDOCM_SRCE_CODE, Lookup lineage reference object : gtvsrce
     * 
     */
    @JsonProperty("srceCode")
    public void setSrceCode(String srceCode) {
        this.srceCode = srceCode;
    }

    public Gordocm__1 withSrceCode(String srceCode) {
        this.srceCode = srceCode;
        return this;
    }

    /**
     * Date Requested
     * <p>
     * Lineage reference object : GORDOCM_REQUEST_DATE
     * 
     */
    @JsonProperty("requestDate")
    public Date getRequestDate() {
        return requestDate;
    }

    /**
     * Date Requested
     * <p>
     * Lineage reference object : GORDOCM_REQUEST_DATE
     * 
     */
    @JsonProperty("requestDate")
    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Gordocm__1 withRequestDate(Date requestDate) {
        this.requestDate = requestDate;
        return this;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : GORDOCM_DOCM_CODE, Lookup lineage reference object : gtvdocm
     * 
     */
    @JsonProperty("docmCode")
    public String getDocmCode() {
        return docmCode;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : GORDOCM_DOCM_CODE, Lookup lineage reference object : gtvdocm
     * 
     */
    @JsonProperty("docmCode")
    public void setDocmCode(String docmCode) {
        this.docmCode = docmCode;
    }

    public Gordocm__1 withDocmCode(String docmCode) {
        this.docmCode = docmCode;
        return this;
    }

    /**
     * Date Received
     * <p>
     * Lineage reference object : GORDOCM_RECEIVED_DATE
     * 
     */
    @JsonProperty("receivedDate")
    public Date getReceivedDate() {
        return receivedDate;
    }

    /**
     * Date Received
     * <p>
     * Lineage reference object : GORDOCM_RECEIVED_DATE
     * 
     */
    @JsonProperty("receivedDate")
    public void setReceivedDate(Date receivedDate) {
        this.receivedDate = receivedDate;
    }

    public Gordocm__1 withReceivedDate(Date receivedDate) {
        this.receivedDate = receivedDate;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("docmDesc")
    public String getDocmDesc() {
        return docmDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("docmDesc")
    public void setDocmDesc(String docmDesc) {
        this.docmDesc = docmDesc;
    }

    public Gordocm__1 withDocmDesc(String docmDesc) {
        this.docmDesc = docmDesc;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("srceDesc")
    public String getSrceDesc() {
        return srceDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("srceDesc")
    public void setSrceDesc(String srceDesc) {
        this.srceDesc = srceDesc;
    }

    public Gordocm__1 withSrceDesc(String srceDesc) {
        this.srceDesc = srceDesc;
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

    public Gordocm__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Gordocm__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("disposition");
        sb.append('=');
        sb.append(((this.disposition == null)?"<null>":this.disposition));
        sb.append(',');
        sb.append("srceCode");
        sb.append('=');
        sb.append(((this.srceCode == null)?"<null>":this.srceCode));
        sb.append(',');
        sb.append("requestDate");
        sb.append('=');
        sb.append(((this.requestDate == null)?"<null>":this.requestDate));
        sb.append(',');
        sb.append("docmCode");
        sb.append('=');
        sb.append(((this.docmCode == null)?"<null>":this.docmCode));
        sb.append(',');
        sb.append("receivedDate");
        sb.append('=');
        sb.append(((this.receivedDate == null)?"<null>":this.receivedDate));
        sb.append(',');
        sb.append("docmDesc");
        sb.append('=');
        sb.append(((this.docmDesc == null)?"<null>":this.docmDesc));
        sb.append(',');
        sb.append("srceDesc");
        sb.append('=');
        sb.append(((this.srceDesc == null)?"<null>":this.srceDesc));
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
        result = ((result* 31)+((this.disposition == null)? 0 :this.disposition.hashCode()));
        result = ((result* 31)+((this.srceCode == null)? 0 :this.srceCode.hashCode()));
        result = ((result* 31)+((this.requestDate == null)? 0 :this.requestDate.hashCode()));
        result = ((result* 31)+((this.docmCode == null)? 0 :this.docmCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.receivedDate == null)? 0 :this.receivedDate.hashCode()));
        result = ((result* 31)+((this.docmDesc == null)? 0 :this.docmDesc.hashCode()));
        result = ((result* 31)+((this.srceDesc == null)? 0 :this.srceDesc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Gordocm__1) == false) {
            return false;
        }
        Gordocm__1 rhs = ((Gordocm__1) other);
        return (((((((((this.disposition == rhs.disposition)||((this.disposition!= null)&&this.disposition.equals(rhs.disposition)))&&((this.srceCode == rhs.srceCode)||((this.srceCode!= null)&&this.srceCode.equals(rhs.srceCode))))&&((this.requestDate == rhs.requestDate)||((this.requestDate!= null)&&this.requestDate.equals(rhs.requestDate))))&&((this.docmCode == rhs.docmCode)||((this.docmCode!= null)&&this.docmCode.equals(rhs.docmCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.receivedDate == rhs.receivedDate)||((this.receivedDate!= null)&&this.receivedDate.equals(rhs.receivedDate))))&&((this.docmDesc == rhs.docmDesc)||((this.docmDesc!= null)&&this.docmDesc.equals(rhs.docmDesc))))&&((this.srceDesc == rhs.srceDesc)||((this.srceDesc!= null)&&this.srceDesc.equals(rhs.srceDesc))));
    }

}
