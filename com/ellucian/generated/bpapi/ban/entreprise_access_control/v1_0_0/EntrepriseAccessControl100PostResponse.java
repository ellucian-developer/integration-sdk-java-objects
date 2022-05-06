
package com.ellucian.generated.bpapi.ban.entreprise_access_control.v1_0_0;

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
    "wacsId",
    "nname",
    "username"
})
@Generated("jsonschema2pojo")
public class EntrepriseAccessControl100PostResponse {

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("wacsId")
    private String wacsId;
    @JsonProperty("nname")
    private String nname;
    /**
     * Gobwacs User Id
     * <p>
     * Lineage reference object : GOBEACC_USERNAME, Lookup lineage reference object : all_users
     * (Required)
     * 
     */
    @JsonProperty("username")
    @JsonPropertyDescription("Lineage reference object : GOBEACC_USERNAME, Lookup lineage reference object : all_users")
    private String username;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("wacsId")
    public String getWacsId() {
        return wacsId;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("wacsId")
    public void setWacsId(String wacsId) {
        this.wacsId = wacsId;
    }

    public EntrepriseAccessControl100PostResponse withWacsId(String wacsId) {
        this.wacsId = wacsId;
        return this;
    }

    @JsonProperty("nname")
    public String getNname() {
        return nname;
    }

    @JsonProperty("nname")
    public void setNname(String nname) {
        this.nname = nname;
    }

    public EntrepriseAccessControl100PostResponse withNname(String nname) {
        this.nname = nname;
        return this;
    }

    /**
     * Gobwacs User Id
     * <p>
     * Lineage reference object : GOBEACC_USERNAME, Lookup lineage reference object : all_users
     * (Required)
     * 
     */
    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    /**
     * Gobwacs User Id
     * <p>
     * Lineage reference object : GOBEACC_USERNAME, Lookup lineage reference object : all_users
     * (Required)
     * 
     */
    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    public EntrepriseAccessControl100PostResponse withUsername(String username) {
        this.username = username;
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

    public EntrepriseAccessControl100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EntrepriseAccessControl100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("wacsId");
        sb.append('=');
        sb.append(((this.wacsId == null)?"<null>":this.wacsId));
        sb.append(',');
        sb.append("nname");
        sb.append('=');
        sb.append(((this.nname == null)?"<null>":this.nname));
        sb.append(',');
        sb.append("username");
        sb.append('=');
        sb.append(((this.username == null)?"<null>":this.username));
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
        result = ((result* 31)+((this.nname == null)? 0 :this.nname.hashCode()));
        result = ((result* 31)+((this.wacsId == null)? 0 :this.wacsId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.username == null)? 0 :this.username.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EntrepriseAccessControl100PostResponse) == false) {
            return false;
        }
        EntrepriseAccessControl100PostResponse rhs = ((EntrepriseAccessControl100PostResponse) other);
        return (((((this.nname == rhs.nname)||((this.nname!= null)&&this.nname.equals(rhs.nname)))&&((this.wacsId == rhs.wacsId)||((this.wacsId!= null)&&this.wacsId.equals(rhs.wacsId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.username == rhs.username)||((this.username!= null)&&this.username.equals(rhs.username))));
    }

}
