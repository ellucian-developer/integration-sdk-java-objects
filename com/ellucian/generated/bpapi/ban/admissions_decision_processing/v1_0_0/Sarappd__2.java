
package com.ellucian.generated.bpapi.ban.admissions_decision_processing.v1_0_0;

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
    "stvapdcStdnAccInd",
    "stvapdcSignfInd",
    "stvapdcApplInact",
    "stvapdcDesc",
    "maintDesc",
    "apdcCode",
    "apdcDate",
    "maintInd",
    "stvapdcInstAccInd",
    "stvapdcRejectInd",
    "user"
})
@Generated("jsonschema2pojo")
public class Sarappd__2 {

    @JsonProperty("stvapdcStdnAccInd")
    private String stvapdcStdnAccInd;
    @JsonProperty("stvapdcSignfInd")
    private String stvapdcSignfInd;
    @JsonProperty("stvapdcApplInact")
    private String stvapdcApplInact;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvapdcDesc")
    private String stvapdcDesc;
    /**
     * Maintained by
     * <p>
     * 
     * 
     */
    @JsonProperty("maintDesc")
    private String maintDesc;
    /**
     * Decision Code
     * <p>
     * Lineage reference object : SARAPPD_APDC_CODE, Lookup lineage reference object : stvapdc
     * (Required)
     * 
     */
    @JsonProperty("apdcCode")
    @JsonPropertyDescription("Lineage reference object : SARAPPD_APDC_CODE, Lookup lineage reference object : stvapdc")
    private String apdcCode;
    /**
     * Decision Date
     * <p>
     * Lineage reference object : SARAPPD_APDC_DATE
     * (Required)
     * 
     */
    @JsonProperty("apdcDate")
    @JsonPropertyDescription("Lineage reference object : SARAPPD_APDC_DATE")
    private Date apdcDate;
    /**
     * Maintained Ind
     * <p>
     * Lineage reference object : SARAPPD_MAINT_IND
     * 
     */
    @JsonProperty("maintInd")
    @JsonPropertyDescription("Lineage reference object : SARAPPD_MAINT_IND")
    private String maintInd;
    @JsonProperty("stvapdcInstAccInd")
    private String stvapdcInstAccInd;
    @JsonProperty("stvapdcRejectInd")
    private String stvapdcRejectInd;
    /**
     * User ID
     * <p>
     * Lineage reference object : SARAPPD_USER
     * 
     */
    @JsonProperty("user")
    @JsonPropertyDescription("Lineage reference object : SARAPPD_USER")
    private String user;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("stvapdcStdnAccInd")
    public String getStvapdcStdnAccInd() {
        return stvapdcStdnAccInd;
    }

    @JsonProperty("stvapdcStdnAccInd")
    public void setStvapdcStdnAccInd(String stvapdcStdnAccInd) {
        this.stvapdcStdnAccInd = stvapdcStdnAccInd;
    }

    public Sarappd__2 withStvapdcStdnAccInd(String stvapdcStdnAccInd) {
        this.stvapdcStdnAccInd = stvapdcStdnAccInd;
        return this;
    }

    @JsonProperty("stvapdcSignfInd")
    public String getStvapdcSignfInd() {
        return stvapdcSignfInd;
    }

    @JsonProperty("stvapdcSignfInd")
    public void setStvapdcSignfInd(String stvapdcSignfInd) {
        this.stvapdcSignfInd = stvapdcSignfInd;
    }

    public Sarappd__2 withStvapdcSignfInd(String stvapdcSignfInd) {
        this.stvapdcSignfInd = stvapdcSignfInd;
        return this;
    }

    @JsonProperty("stvapdcApplInact")
    public String getStvapdcApplInact() {
        return stvapdcApplInact;
    }

    @JsonProperty("stvapdcApplInact")
    public void setStvapdcApplInact(String stvapdcApplInact) {
        this.stvapdcApplInact = stvapdcApplInact;
    }

    public Sarappd__2 withStvapdcApplInact(String stvapdcApplInact) {
        this.stvapdcApplInact = stvapdcApplInact;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvapdcDesc")
    public String getStvapdcDesc() {
        return stvapdcDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvapdcDesc")
    public void setStvapdcDesc(String stvapdcDesc) {
        this.stvapdcDesc = stvapdcDesc;
    }

    public Sarappd__2 withStvapdcDesc(String stvapdcDesc) {
        this.stvapdcDesc = stvapdcDesc;
        return this;
    }

    /**
     * Maintained by
     * <p>
     * 
     * 
     */
    @JsonProperty("maintDesc")
    public String getMaintDesc() {
        return maintDesc;
    }

    /**
     * Maintained by
     * <p>
     * 
     * 
     */
    @JsonProperty("maintDesc")
    public void setMaintDesc(String maintDesc) {
        this.maintDesc = maintDesc;
    }

    public Sarappd__2 withMaintDesc(String maintDesc) {
        this.maintDesc = maintDesc;
        return this;
    }

    /**
     * Decision Code
     * <p>
     * Lineage reference object : SARAPPD_APDC_CODE, Lookup lineage reference object : stvapdc
     * (Required)
     * 
     */
    @JsonProperty("apdcCode")
    public String getApdcCode() {
        return apdcCode;
    }

    /**
     * Decision Code
     * <p>
     * Lineage reference object : SARAPPD_APDC_CODE, Lookup lineage reference object : stvapdc
     * (Required)
     * 
     */
    @JsonProperty("apdcCode")
    public void setApdcCode(String apdcCode) {
        this.apdcCode = apdcCode;
    }

    public Sarappd__2 withApdcCode(String apdcCode) {
        this.apdcCode = apdcCode;
        return this;
    }

    /**
     * Decision Date
     * <p>
     * Lineage reference object : SARAPPD_APDC_DATE
     * (Required)
     * 
     */
    @JsonProperty("apdcDate")
    public Date getApdcDate() {
        return apdcDate;
    }

    /**
     * Decision Date
     * <p>
     * Lineage reference object : SARAPPD_APDC_DATE
     * (Required)
     * 
     */
    @JsonProperty("apdcDate")
    public void setApdcDate(Date apdcDate) {
        this.apdcDate = apdcDate;
    }

    public Sarappd__2 withApdcDate(Date apdcDate) {
        this.apdcDate = apdcDate;
        return this;
    }

    /**
     * Maintained Ind
     * <p>
     * Lineage reference object : SARAPPD_MAINT_IND
     * 
     */
    @JsonProperty("maintInd")
    public String getMaintInd() {
        return maintInd;
    }

    /**
     * Maintained Ind
     * <p>
     * Lineage reference object : SARAPPD_MAINT_IND
     * 
     */
    @JsonProperty("maintInd")
    public void setMaintInd(String maintInd) {
        this.maintInd = maintInd;
    }

    public Sarappd__2 withMaintInd(String maintInd) {
        this.maintInd = maintInd;
        return this;
    }

    @JsonProperty("stvapdcInstAccInd")
    public String getStvapdcInstAccInd() {
        return stvapdcInstAccInd;
    }

    @JsonProperty("stvapdcInstAccInd")
    public void setStvapdcInstAccInd(String stvapdcInstAccInd) {
        this.stvapdcInstAccInd = stvapdcInstAccInd;
    }

    public Sarappd__2 withStvapdcInstAccInd(String stvapdcInstAccInd) {
        this.stvapdcInstAccInd = stvapdcInstAccInd;
        return this;
    }

    @JsonProperty("stvapdcRejectInd")
    public String getStvapdcRejectInd() {
        return stvapdcRejectInd;
    }

    @JsonProperty("stvapdcRejectInd")
    public void setStvapdcRejectInd(String stvapdcRejectInd) {
        this.stvapdcRejectInd = stvapdcRejectInd;
    }

    public Sarappd__2 withStvapdcRejectInd(String stvapdcRejectInd) {
        this.stvapdcRejectInd = stvapdcRejectInd;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SARAPPD_USER
     * 
     */
    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SARAPPD_USER
     * 
     */
    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    public Sarappd__2 withUser(String user) {
        this.user = user;
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

    public Sarappd__2 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sarappd__2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("stvapdcStdnAccInd");
        sb.append('=');
        sb.append(((this.stvapdcStdnAccInd == null)?"<null>":this.stvapdcStdnAccInd));
        sb.append(',');
        sb.append("stvapdcSignfInd");
        sb.append('=');
        sb.append(((this.stvapdcSignfInd == null)?"<null>":this.stvapdcSignfInd));
        sb.append(',');
        sb.append("stvapdcApplInact");
        sb.append('=');
        sb.append(((this.stvapdcApplInact == null)?"<null>":this.stvapdcApplInact));
        sb.append(',');
        sb.append("stvapdcDesc");
        sb.append('=');
        sb.append(((this.stvapdcDesc == null)?"<null>":this.stvapdcDesc));
        sb.append(',');
        sb.append("maintDesc");
        sb.append('=');
        sb.append(((this.maintDesc == null)?"<null>":this.maintDesc));
        sb.append(',');
        sb.append("apdcCode");
        sb.append('=');
        sb.append(((this.apdcCode == null)?"<null>":this.apdcCode));
        sb.append(',');
        sb.append("apdcDate");
        sb.append('=');
        sb.append(((this.apdcDate == null)?"<null>":this.apdcDate));
        sb.append(',');
        sb.append("maintInd");
        sb.append('=');
        sb.append(((this.maintInd == null)?"<null>":this.maintInd));
        sb.append(',');
        sb.append("stvapdcInstAccInd");
        sb.append('=');
        sb.append(((this.stvapdcInstAccInd == null)?"<null>":this.stvapdcInstAccInd));
        sb.append(',');
        sb.append("stvapdcRejectInd");
        sb.append('=');
        sb.append(((this.stvapdcRejectInd == null)?"<null>":this.stvapdcRejectInd));
        sb.append(',');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
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
        result = ((result* 31)+((this.stvapdcDesc == null)? 0 :this.stvapdcDesc.hashCode()));
        result = ((result* 31)+((this.maintInd == null)? 0 :this.maintInd.hashCode()));
        result = ((result* 31)+((this.stvapdcStdnAccInd == null)? 0 :this.stvapdcStdnAccInd.hashCode()));
        result = ((result* 31)+((this.stvapdcSignfInd == null)? 0 :this.stvapdcSignfInd.hashCode()));
        result = ((result* 31)+((this.stvapdcApplInact == null)? 0 :this.stvapdcApplInact.hashCode()));
        result = ((result* 31)+((this.maintDesc == null)? 0 :this.maintDesc.hashCode()));
        result = ((result* 31)+((this.apdcCode == null)? 0 :this.apdcCode.hashCode()));
        result = ((result* 31)+((this.apdcDate == null)? 0 :this.apdcDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.stvapdcInstAccInd == null)? 0 :this.stvapdcInstAccInd.hashCode()));
        result = ((result* 31)+((this.stvapdcRejectInd == null)? 0 :this.stvapdcRejectInd.hashCode()));
        result = ((result* 31)+((this.user == null)? 0 :this.user.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sarappd__2) == false) {
            return false;
        }
        Sarappd__2 rhs = ((Sarappd__2) other);
        return (((((((((((((this.stvapdcDesc == rhs.stvapdcDesc)||((this.stvapdcDesc!= null)&&this.stvapdcDesc.equals(rhs.stvapdcDesc)))&&((this.maintInd == rhs.maintInd)||((this.maintInd!= null)&&this.maintInd.equals(rhs.maintInd))))&&((this.stvapdcStdnAccInd == rhs.stvapdcStdnAccInd)||((this.stvapdcStdnAccInd!= null)&&this.stvapdcStdnAccInd.equals(rhs.stvapdcStdnAccInd))))&&((this.stvapdcSignfInd == rhs.stvapdcSignfInd)||((this.stvapdcSignfInd!= null)&&this.stvapdcSignfInd.equals(rhs.stvapdcSignfInd))))&&((this.stvapdcApplInact == rhs.stvapdcApplInact)||((this.stvapdcApplInact!= null)&&this.stvapdcApplInact.equals(rhs.stvapdcApplInact))))&&((this.maintDesc == rhs.maintDesc)||((this.maintDesc!= null)&&this.maintDesc.equals(rhs.maintDesc))))&&((this.apdcCode == rhs.apdcCode)||((this.apdcCode!= null)&&this.apdcCode.equals(rhs.apdcCode))))&&((this.apdcDate == rhs.apdcDate)||((this.apdcDate!= null)&&this.apdcDate.equals(rhs.apdcDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.stvapdcInstAccInd == rhs.stvapdcInstAccInd)||((this.stvapdcInstAccInd!= null)&&this.stvapdcInstAccInd.equals(rhs.stvapdcInstAccInd))))&&((this.stvapdcRejectInd == rhs.stvapdcRejectInd)||((this.stvapdcRejectInd!= null)&&this.stvapdcRejectInd.equals(rhs.stvapdcRejectInd))))&&((this.user == rhs.user)||((this.user!= null)&&this.user.equals(rhs.user))));
    }

}
