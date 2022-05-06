
package com.ellucian.generated.bpapi.ban.transfer_course_articulation.v1_0_0;

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
    "instTitle",
    "instLparenConn",
    "catalogFrom",
    "subjCodeInst",
    "catalogTo",
    "connector",
    "crseNumbInst",
    "instCreditsUsed",
    "instRparen"
})
@Generated("jsonschema2pojo")
public class Shrtatc {

    /**
     * Title
     * <p>
     * Lineage reference object : SHRTATC_INST_TITLE
     * 
     */
    @JsonProperty("instTitle")
    @JsonPropertyDescription("Lineage reference object : SHRTATC_INST_TITLE")
    private String instTitle;
    /**
     * Left Parenthesis
     * <p>
     * Lineage reference object : SHRTATC_INST_LPAREN_CONN
     * 
     */
    @JsonProperty("instLparenConn")
    @JsonPropertyDescription("Lineage reference object : SHRTATC_INST_LPAREN_CONN")
    private String instLparenConn;
    /**
     * Catalog Low
     * <p>
     * 
     * 
     */
    @JsonProperty("catalogFrom")
    private Double catalogFrom;
    /**
     * Subject
     * <p>
     * Lineage reference object : SHRTATC_SUBJ_CODE_INST, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCodeInst")
    @JsonPropertyDescription("Lineage reference object : SHRTATC_SUBJ_CODE_INST, Lookup lineage reference object : stvsubj")
    private String subjCodeInst;
    /**
     * Catalog High
     * <p>
     * 
     * 
     */
    @JsonProperty("catalogTo")
    private Double catalogTo;
    /**
     * And/Or
     * <p>
     * Lineage reference object : SHRTATC_CONNECTOR
     * 
     */
    @JsonProperty("connector")
    @JsonPropertyDescription("Lineage reference object : SHRTATC_CONNECTOR")
    private String connector;
    /**
     * Course
     * <p>
     * Lineage reference object : SHRTATC_CRSE_NUMB_INST
     * 
     */
    @JsonProperty("crseNumbInst")
    @JsonPropertyDescription("Lineage reference object : SHRTATC_CRSE_NUMB_INST")
    private String crseNumbInst;
    /**
     * Credits Used
     * <p>
     * Lineage reference object : SHRTATC_INST_CREDITS_USED
     * 
     */
    @JsonProperty("instCreditsUsed")
    @JsonPropertyDescription("Lineage reference object : SHRTATC_INST_CREDITS_USED")
    private Double instCreditsUsed;
    /**
     * Right Parenthesis
     * <p>
     * Lineage reference object : SHRTATC_INST_RPAREN
     * 
     */
    @JsonProperty("instRparen")
    @JsonPropertyDescription("Lineage reference object : SHRTATC_INST_RPAREN")
    private String instRparen;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Title
     * <p>
     * Lineage reference object : SHRTATC_INST_TITLE
     * 
     */
    @JsonProperty("instTitle")
    public String getInstTitle() {
        return instTitle;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : SHRTATC_INST_TITLE
     * 
     */
    @JsonProperty("instTitle")
    public void setInstTitle(String instTitle) {
        this.instTitle = instTitle;
    }

    public Shrtatc withInstTitle(String instTitle) {
        this.instTitle = instTitle;
        return this;
    }

    /**
     * Left Parenthesis
     * <p>
     * Lineage reference object : SHRTATC_INST_LPAREN_CONN
     * 
     */
    @JsonProperty("instLparenConn")
    public String getInstLparenConn() {
        return instLparenConn;
    }

    /**
     * Left Parenthesis
     * <p>
     * Lineage reference object : SHRTATC_INST_LPAREN_CONN
     * 
     */
    @JsonProperty("instLparenConn")
    public void setInstLparenConn(String instLparenConn) {
        this.instLparenConn = instLparenConn;
    }

    public Shrtatc withInstLparenConn(String instLparenConn) {
        this.instLparenConn = instLparenConn;
        return this;
    }

    /**
     * Catalog Low
     * <p>
     * 
     * 
     */
    @JsonProperty("catalogFrom")
    public Double getCatalogFrom() {
        return catalogFrom;
    }

    /**
     * Catalog Low
     * <p>
     * 
     * 
     */
    @JsonProperty("catalogFrom")
    public void setCatalogFrom(Double catalogFrom) {
        this.catalogFrom = catalogFrom;
    }

    public Shrtatc withCatalogFrom(Double catalogFrom) {
        this.catalogFrom = catalogFrom;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SHRTATC_SUBJ_CODE_INST, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCodeInst")
    public String getSubjCodeInst() {
        return subjCodeInst;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SHRTATC_SUBJ_CODE_INST, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCodeInst")
    public void setSubjCodeInst(String subjCodeInst) {
        this.subjCodeInst = subjCodeInst;
    }

    public Shrtatc withSubjCodeInst(String subjCodeInst) {
        this.subjCodeInst = subjCodeInst;
        return this;
    }

    /**
     * Catalog High
     * <p>
     * 
     * 
     */
    @JsonProperty("catalogTo")
    public Double getCatalogTo() {
        return catalogTo;
    }

    /**
     * Catalog High
     * <p>
     * 
     * 
     */
    @JsonProperty("catalogTo")
    public void setCatalogTo(Double catalogTo) {
        this.catalogTo = catalogTo;
    }

    public Shrtatc withCatalogTo(Double catalogTo) {
        this.catalogTo = catalogTo;
        return this;
    }

    /**
     * And/Or
     * <p>
     * Lineage reference object : SHRTATC_CONNECTOR
     * 
     */
    @JsonProperty("connector")
    public String getConnector() {
        return connector;
    }

    /**
     * And/Or
     * <p>
     * Lineage reference object : SHRTATC_CONNECTOR
     * 
     */
    @JsonProperty("connector")
    public void setConnector(String connector) {
        this.connector = connector;
    }

    public Shrtatc withConnector(String connector) {
        this.connector = connector;
        return this;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : SHRTATC_CRSE_NUMB_INST
     * 
     */
    @JsonProperty("crseNumbInst")
    public String getCrseNumbInst() {
        return crseNumbInst;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : SHRTATC_CRSE_NUMB_INST
     * 
     */
    @JsonProperty("crseNumbInst")
    public void setCrseNumbInst(String crseNumbInst) {
        this.crseNumbInst = crseNumbInst;
    }

    public Shrtatc withCrseNumbInst(String crseNumbInst) {
        this.crseNumbInst = crseNumbInst;
        return this;
    }

    /**
     * Credits Used
     * <p>
     * Lineage reference object : SHRTATC_INST_CREDITS_USED
     * 
     */
    @JsonProperty("instCreditsUsed")
    public Double getInstCreditsUsed() {
        return instCreditsUsed;
    }

    /**
     * Credits Used
     * <p>
     * Lineage reference object : SHRTATC_INST_CREDITS_USED
     * 
     */
    @JsonProperty("instCreditsUsed")
    public void setInstCreditsUsed(Double instCreditsUsed) {
        this.instCreditsUsed = instCreditsUsed;
    }

    public Shrtatc withInstCreditsUsed(Double instCreditsUsed) {
        this.instCreditsUsed = instCreditsUsed;
        return this;
    }

    /**
     * Right Parenthesis
     * <p>
     * Lineage reference object : SHRTATC_INST_RPAREN
     * 
     */
    @JsonProperty("instRparen")
    public String getInstRparen() {
        return instRparen;
    }

    /**
     * Right Parenthesis
     * <p>
     * Lineage reference object : SHRTATC_INST_RPAREN
     * 
     */
    @JsonProperty("instRparen")
    public void setInstRparen(String instRparen) {
        this.instRparen = instRparen;
    }

    public Shrtatc withInstRparen(String instRparen) {
        this.instRparen = instRparen;
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

    public Shrtatc withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Shrtatc.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("instTitle");
        sb.append('=');
        sb.append(((this.instTitle == null)?"<null>":this.instTitle));
        sb.append(',');
        sb.append("instLparenConn");
        sb.append('=');
        sb.append(((this.instLparenConn == null)?"<null>":this.instLparenConn));
        sb.append(',');
        sb.append("catalogFrom");
        sb.append('=');
        sb.append(((this.catalogFrom == null)?"<null>":this.catalogFrom));
        sb.append(',');
        sb.append("subjCodeInst");
        sb.append('=');
        sb.append(((this.subjCodeInst == null)?"<null>":this.subjCodeInst));
        sb.append(',');
        sb.append("catalogTo");
        sb.append('=');
        sb.append(((this.catalogTo == null)?"<null>":this.catalogTo));
        sb.append(',');
        sb.append("connector");
        sb.append('=');
        sb.append(((this.connector == null)?"<null>":this.connector));
        sb.append(',');
        sb.append("crseNumbInst");
        sb.append('=');
        sb.append(((this.crseNumbInst == null)?"<null>":this.crseNumbInst));
        sb.append(',');
        sb.append("instCreditsUsed");
        sb.append('=');
        sb.append(((this.instCreditsUsed == null)?"<null>":this.instCreditsUsed));
        sb.append(',');
        sb.append("instRparen");
        sb.append('=');
        sb.append(((this.instRparen == null)?"<null>":this.instRparen));
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
        result = ((result* 31)+((this.instTitle == null)? 0 :this.instTitle.hashCode()));
        result = ((result* 31)+((this.instLparenConn == null)? 0 :this.instLparenConn.hashCode()));
        result = ((result* 31)+((this.catalogFrom == null)? 0 :this.catalogFrom.hashCode()));
        result = ((result* 31)+((this.subjCodeInst == null)? 0 :this.subjCodeInst.hashCode()));
        result = ((result* 31)+((this.catalogTo == null)? 0 :this.catalogTo.hashCode()));
        result = ((result* 31)+((this.connector == null)? 0 :this.connector.hashCode()));
        result = ((result* 31)+((this.crseNumbInst == null)? 0 :this.crseNumbInst.hashCode()));
        result = ((result* 31)+((this.instCreditsUsed == null)? 0 :this.instCreditsUsed.hashCode()));
        result = ((result* 31)+((this.instRparen == null)? 0 :this.instRparen.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Shrtatc) == false) {
            return false;
        }
        Shrtatc rhs = ((Shrtatc) other);
        return (((((((((((this.instTitle == rhs.instTitle)||((this.instTitle!= null)&&this.instTitle.equals(rhs.instTitle)))&&((this.instLparenConn == rhs.instLparenConn)||((this.instLparenConn!= null)&&this.instLparenConn.equals(rhs.instLparenConn))))&&((this.catalogFrom == rhs.catalogFrom)||((this.catalogFrom!= null)&&this.catalogFrom.equals(rhs.catalogFrom))))&&((this.subjCodeInst == rhs.subjCodeInst)||((this.subjCodeInst!= null)&&this.subjCodeInst.equals(rhs.subjCodeInst))))&&((this.catalogTo == rhs.catalogTo)||((this.catalogTo!= null)&&this.catalogTo.equals(rhs.catalogTo))))&&((this.connector == rhs.connector)||((this.connector!= null)&&this.connector.equals(rhs.connector))))&&((this.crseNumbInst == rhs.crseNumbInst)||((this.crseNumbInst!= null)&&this.crseNumbInst.equals(rhs.crseNumbInst))))&&((this.instCreditsUsed == rhs.instCreditsUsed)||((this.instCreditsUsed!= null)&&this.instCreditsUsed.equals(rhs.instCreditsUsed))))&&((this.instRparen == rhs.instRparen)||((this.instRparen!= null)&&this.instRparen.equals(rhs.instRparen))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
