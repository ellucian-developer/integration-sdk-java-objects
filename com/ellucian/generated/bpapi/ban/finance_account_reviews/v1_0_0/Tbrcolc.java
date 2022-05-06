
package com.ellucian.generated.bpapi.ban.finance_account_reviews.v1_0_0;

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
    "colcId",
    "colcName",
    "colcAgencyDate"
})
@Generated("jsonschema2pojo")
public class Tbrcolc {

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("colcId")
    private String colcId;
    /**
     * Collections Agency Name
     * <p>
     * 
     * 
     */
    @JsonProperty("colcName")
    private String colcName;
    /**
     * Collection Date
     * <p>
     * Lineage reference object : TBRCOLC_COLC_AGENCY_DATE
     * 
     */
    @JsonProperty("colcAgencyDate")
    @JsonPropertyDescription("Lineage reference object : TBRCOLC_COLC_AGENCY_DATE")
    private Date colcAgencyDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("colcId")
    public String getColcId() {
        return colcId;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("colcId")
    public void setColcId(String colcId) {
        this.colcId = colcId;
    }

    public Tbrcolc withColcId(String colcId) {
        this.colcId = colcId;
        return this;
    }

    /**
     * Collections Agency Name
     * <p>
     * 
     * 
     */
    @JsonProperty("colcName")
    public String getColcName() {
        return colcName;
    }

    /**
     * Collections Agency Name
     * <p>
     * 
     * 
     */
    @JsonProperty("colcName")
    public void setColcName(String colcName) {
        this.colcName = colcName;
    }

    public Tbrcolc withColcName(String colcName) {
        this.colcName = colcName;
        return this;
    }

    /**
     * Collection Date
     * <p>
     * Lineage reference object : TBRCOLC_COLC_AGENCY_DATE
     * 
     */
    @JsonProperty("colcAgencyDate")
    public Date getColcAgencyDate() {
        return colcAgencyDate;
    }

    /**
     * Collection Date
     * <p>
     * Lineage reference object : TBRCOLC_COLC_AGENCY_DATE
     * 
     */
    @JsonProperty("colcAgencyDate")
    public void setColcAgencyDate(Date colcAgencyDate) {
        this.colcAgencyDate = colcAgencyDate;
    }

    public Tbrcolc withColcAgencyDate(Date colcAgencyDate) {
        this.colcAgencyDate = colcAgencyDate;
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

    public Tbrcolc withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Tbrcolc.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("colcId");
        sb.append('=');
        sb.append(((this.colcId == null)?"<null>":this.colcId));
        sb.append(',');
        sb.append("colcName");
        sb.append('=');
        sb.append(((this.colcName == null)?"<null>":this.colcName));
        sb.append(',');
        sb.append("colcAgencyDate");
        sb.append('=');
        sb.append(((this.colcAgencyDate == null)?"<null>":this.colcAgencyDate));
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
        result = ((result* 31)+((this.colcId == null)? 0 :this.colcId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.colcName == null)? 0 :this.colcName.hashCode()));
        result = ((result* 31)+((this.colcAgencyDate == null)? 0 :this.colcAgencyDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tbrcolc) == false) {
            return false;
        }
        Tbrcolc rhs = ((Tbrcolc) other);
        return (((((this.colcId == rhs.colcId)||((this.colcId!= null)&&this.colcId.equals(rhs.colcId)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.colcName == rhs.colcName)||((this.colcName!= null)&&this.colcName.equals(rhs.colcName))))&&((this.colcAgencyDate == rhs.colcAgencyDate)||((this.colcAgencyDate!= null)&&this.colcAgencyDate.equals(rhs.colcAgencyDate))));
    }

}
