
package com.ellucian.generated.bpapi.ban.schedule_details_links_and_corequisites.v1_0_0;

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
    "linkConn"
})
@Generated("jsonschema2pojo")
public class Ssrlink {

    /**
     * Link Connector
     * <p>
     * Lineage reference object : SSRLINK_LINK_CONN
     * (Required)
     * 
     */
    @JsonProperty("linkConn")
    @JsonPropertyDescription("Lineage reference object : SSRLINK_LINK_CONN")
    private String linkConn;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Link Connector
     * <p>
     * Lineage reference object : SSRLINK_LINK_CONN
     * (Required)
     * 
     */
    @JsonProperty("linkConn")
    public String getLinkConn() {
        return linkConn;
    }

    /**
     * Link Connector
     * <p>
     * Lineage reference object : SSRLINK_LINK_CONN
     * (Required)
     * 
     */
    @JsonProperty("linkConn")
    public void setLinkConn(String linkConn) {
        this.linkConn = linkConn;
    }

    public Ssrlink withLinkConn(String linkConn) {
        this.linkConn = linkConn;
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

    public Ssrlink withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ssrlink.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("linkConn");
        sb.append('=');
        sb.append(((this.linkConn == null)?"<null>":this.linkConn));
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
        result = ((result* 31)+((this.linkConn == null)? 0 :this.linkConn.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ssrlink) == false) {
            return false;
        }
        Ssrlink rhs = ((Ssrlink) other);
        return (((this.linkConn == rhs.linkConn)||((this.linkConn!= null)&&this.linkConn.equals(rhs.linkConn)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
