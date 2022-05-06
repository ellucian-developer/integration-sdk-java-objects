
package com.ellucian.generated.bpapi.ban.account_hierarchy.v1_0_0;

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
    "level4",
    "hpAcctCode",
    "hpTitle",
    "hpPredAcctCode",
    "hpCoasCode",
    "titl1",
    "titl2",
    "titl3",
    "titl4",
    "predTitle",
    "head1",
    "head2",
    "head3",
    "head4",
    "level1",
    "level3",
    "level2"
})
@Generated("jsonschema2pojo")
public class AccountHierarchy100GetResponse {

    /**
     * Lineage reference object : level4
     * 
     */
    @JsonProperty("level4")
    @JsonPropertyDescription("Lineage reference object : level4")
    private Object level4;
    /**
     * Account
     * <p>
     * Lineage reference object : hpAcctCode
     * 
     */
    @JsonProperty("hpAcctCode")
    @JsonPropertyDescription("Lineage reference object : hpAcctCode")
    private Object hpAcctCode;
    /**
     * Lineage reference object : hpTitle
     * 
     */
    @JsonProperty("hpTitle")
    @JsonPropertyDescription("Lineage reference object : hpTitle")
    private Object hpTitle;
    /**
     * Predecessor Account
     * <p>
     * Lineage reference object : hpPredAcctCode
     * 
     */
    @JsonProperty("hpPredAcctCode")
    @JsonPropertyDescription("Lineage reference object : hpPredAcctCode")
    private Object hpPredAcctCode;
    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : hpCoasCode
     * 
     */
    @JsonProperty("hpCoasCode")
    @JsonPropertyDescription("Lineage reference object : hpCoasCode")
    private Object hpCoasCode;
    /**
     * Lineage reference object : titl1
     * 
     */
    @JsonProperty("titl1")
    @JsonPropertyDescription("Lineage reference object : titl1")
    private Object titl1;
    /**
     * Lineage reference object : titl2
     * 
     */
    @JsonProperty("titl2")
    @JsonPropertyDescription("Lineage reference object : titl2")
    private Object titl2;
    /**
     * Lineage reference object : titl3
     * 
     */
    @JsonProperty("titl3")
    @JsonPropertyDescription("Lineage reference object : titl3")
    private Object titl3;
    /**
     * Lineage reference object : titl4
     * 
     */
    @JsonProperty("titl4")
    @JsonPropertyDescription("Lineage reference object : titl4")
    private Object titl4;
    /**
     * Lineage reference object : predTitle
     * 
     */
    @JsonProperty("predTitle")
    @JsonPropertyDescription("Lineage reference object : predTitle")
    private Object predTitle;
    /**
     * Lineage reference object : head1
     * 
     */
    @JsonProperty("head1")
    @JsonPropertyDescription("Lineage reference object : head1")
    private Object head1;
    /**
     * Lineage reference object : head2
     * 
     */
    @JsonProperty("head2")
    @JsonPropertyDescription("Lineage reference object : head2")
    private Object head2;
    /**
     * Lineage reference object : head3
     * 
     */
    @JsonProperty("head3")
    @JsonPropertyDescription("Lineage reference object : head3")
    private Object head3;
    /**
     * Lineage reference object : head4
     * 
     */
    @JsonProperty("head4")
    @JsonPropertyDescription("Lineage reference object : head4")
    private Object head4;
    /**
     * Lineage reference object : level1
     * 
     */
    @JsonProperty("level1")
    @JsonPropertyDescription("Lineage reference object : level1")
    private Object level1;
    /**
     * Lineage reference object : level3
     * 
     */
    @JsonProperty("level3")
    @JsonPropertyDescription("Lineage reference object : level3")
    private Object level3;
    /**
     * Lineage reference object : level2
     * 
     */
    @JsonProperty("level2")
    @JsonPropertyDescription("Lineage reference object : level2")
    private Object level2;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : level4
     * 
     */
    @JsonProperty("level4")
    public Object getLevel4() {
        return level4;
    }

    /**
     * Lineage reference object : level4
     * 
     */
    @JsonProperty("level4")
    public void setLevel4(Object level4) {
        this.level4 = level4;
    }

    public AccountHierarchy100GetResponse withLevel4(Object level4) {
        this.level4 = level4;
        return this;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : hpAcctCode
     * 
     */
    @JsonProperty("hpAcctCode")
    public Object getHpAcctCode() {
        return hpAcctCode;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : hpAcctCode
     * 
     */
    @JsonProperty("hpAcctCode")
    public void setHpAcctCode(Object hpAcctCode) {
        this.hpAcctCode = hpAcctCode;
    }

    public AccountHierarchy100GetResponse withHpAcctCode(Object hpAcctCode) {
        this.hpAcctCode = hpAcctCode;
        return this;
    }

    /**
     * Lineage reference object : hpTitle
     * 
     */
    @JsonProperty("hpTitle")
    public Object getHpTitle() {
        return hpTitle;
    }

    /**
     * Lineage reference object : hpTitle
     * 
     */
    @JsonProperty("hpTitle")
    public void setHpTitle(Object hpTitle) {
        this.hpTitle = hpTitle;
    }

    public AccountHierarchy100GetResponse withHpTitle(Object hpTitle) {
        this.hpTitle = hpTitle;
        return this;
    }

    /**
     * Predecessor Account
     * <p>
     * Lineage reference object : hpPredAcctCode
     * 
     */
    @JsonProperty("hpPredAcctCode")
    public Object getHpPredAcctCode() {
        return hpPredAcctCode;
    }

    /**
     * Predecessor Account
     * <p>
     * Lineage reference object : hpPredAcctCode
     * 
     */
    @JsonProperty("hpPredAcctCode")
    public void setHpPredAcctCode(Object hpPredAcctCode) {
        this.hpPredAcctCode = hpPredAcctCode;
    }

    public AccountHierarchy100GetResponse withHpPredAcctCode(Object hpPredAcctCode) {
        this.hpPredAcctCode = hpPredAcctCode;
        return this;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : hpCoasCode
     * 
     */
    @JsonProperty("hpCoasCode")
    public Object getHpCoasCode() {
        return hpCoasCode;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : hpCoasCode
     * 
     */
    @JsonProperty("hpCoasCode")
    public void setHpCoasCode(Object hpCoasCode) {
        this.hpCoasCode = hpCoasCode;
    }

    public AccountHierarchy100GetResponse withHpCoasCode(Object hpCoasCode) {
        this.hpCoasCode = hpCoasCode;
        return this;
    }

    /**
     * Lineage reference object : titl1
     * 
     */
    @JsonProperty("titl1")
    public Object getTitl1() {
        return titl1;
    }

    /**
     * Lineage reference object : titl1
     * 
     */
    @JsonProperty("titl1")
    public void setTitl1(Object titl1) {
        this.titl1 = titl1;
    }

    public AccountHierarchy100GetResponse withTitl1(Object titl1) {
        this.titl1 = titl1;
        return this;
    }

    /**
     * Lineage reference object : titl2
     * 
     */
    @JsonProperty("titl2")
    public Object getTitl2() {
        return titl2;
    }

    /**
     * Lineage reference object : titl2
     * 
     */
    @JsonProperty("titl2")
    public void setTitl2(Object titl2) {
        this.titl2 = titl2;
    }

    public AccountHierarchy100GetResponse withTitl2(Object titl2) {
        this.titl2 = titl2;
        return this;
    }

    /**
     * Lineage reference object : titl3
     * 
     */
    @JsonProperty("titl3")
    public Object getTitl3() {
        return titl3;
    }

    /**
     * Lineage reference object : titl3
     * 
     */
    @JsonProperty("titl3")
    public void setTitl3(Object titl3) {
        this.titl3 = titl3;
    }

    public AccountHierarchy100GetResponse withTitl3(Object titl3) {
        this.titl3 = titl3;
        return this;
    }

    /**
     * Lineage reference object : titl4
     * 
     */
    @JsonProperty("titl4")
    public Object getTitl4() {
        return titl4;
    }

    /**
     * Lineage reference object : titl4
     * 
     */
    @JsonProperty("titl4")
    public void setTitl4(Object titl4) {
        this.titl4 = titl4;
    }

    public AccountHierarchy100GetResponse withTitl4(Object titl4) {
        this.titl4 = titl4;
        return this;
    }

    /**
     * Lineage reference object : predTitle
     * 
     */
    @JsonProperty("predTitle")
    public Object getPredTitle() {
        return predTitle;
    }

    /**
     * Lineage reference object : predTitle
     * 
     */
    @JsonProperty("predTitle")
    public void setPredTitle(Object predTitle) {
        this.predTitle = predTitle;
    }

    public AccountHierarchy100GetResponse withPredTitle(Object predTitle) {
        this.predTitle = predTitle;
        return this;
    }

    /**
     * Lineage reference object : head1
     * 
     */
    @JsonProperty("head1")
    public Object getHead1() {
        return head1;
    }

    /**
     * Lineage reference object : head1
     * 
     */
    @JsonProperty("head1")
    public void setHead1(Object head1) {
        this.head1 = head1;
    }

    public AccountHierarchy100GetResponse withHead1(Object head1) {
        this.head1 = head1;
        return this;
    }

    /**
     * Lineage reference object : head2
     * 
     */
    @JsonProperty("head2")
    public Object getHead2() {
        return head2;
    }

    /**
     * Lineage reference object : head2
     * 
     */
    @JsonProperty("head2")
    public void setHead2(Object head2) {
        this.head2 = head2;
    }

    public AccountHierarchy100GetResponse withHead2(Object head2) {
        this.head2 = head2;
        return this;
    }

    /**
     * Lineage reference object : head3
     * 
     */
    @JsonProperty("head3")
    public Object getHead3() {
        return head3;
    }

    /**
     * Lineage reference object : head3
     * 
     */
    @JsonProperty("head3")
    public void setHead3(Object head3) {
        this.head3 = head3;
    }

    public AccountHierarchy100GetResponse withHead3(Object head3) {
        this.head3 = head3;
        return this;
    }

    /**
     * Lineage reference object : head4
     * 
     */
    @JsonProperty("head4")
    public Object getHead4() {
        return head4;
    }

    /**
     * Lineage reference object : head4
     * 
     */
    @JsonProperty("head4")
    public void setHead4(Object head4) {
        this.head4 = head4;
    }

    public AccountHierarchy100GetResponse withHead4(Object head4) {
        this.head4 = head4;
        return this;
    }

    /**
     * Lineage reference object : level1
     * 
     */
    @JsonProperty("level1")
    public Object getLevel1() {
        return level1;
    }

    /**
     * Lineage reference object : level1
     * 
     */
    @JsonProperty("level1")
    public void setLevel1(Object level1) {
        this.level1 = level1;
    }

    public AccountHierarchy100GetResponse withLevel1(Object level1) {
        this.level1 = level1;
        return this;
    }

    /**
     * Lineage reference object : level3
     * 
     */
    @JsonProperty("level3")
    public Object getLevel3() {
        return level3;
    }

    /**
     * Lineage reference object : level3
     * 
     */
    @JsonProperty("level3")
    public void setLevel3(Object level3) {
        this.level3 = level3;
    }

    public AccountHierarchy100GetResponse withLevel3(Object level3) {
        this.level3 = level3;
        return this;
    }

    /**
     * Lineage reference object : level2
     * 
     */
    @JsonProperty("level2")
    public Object getLevel2() {
        return level2;
    }

    /**
     * Lineage reference object : level2
     * 
     */
    @JsonProperty("level2")
    public void setLevel2(Object level2) {
        this.level2 = level2;
    }

    public AccountHierarchy100GetResponse withLevel2(Object level2) {
        this.level2 = level2;
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

    public AccountHierarchy100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AccountHierarchy100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("level4");
        sb.append('=');
        sb.append(((this.level4 == null)?"<null>":this.level4));
        sb.append(',');
        sb.append("hpAcctCode");
        sb.append('=');
        sb.append(((this.hpAcctCode == null)?"<null>":this.hpAcctCode));
        sb.append(',');
        sb.append("hpTitle");
        sb.append('=');
        sb.append(((this.hpTitle == null)?"<null>":this.hpTitle));
        sb.append(',');
        sb.append("hpPredAcctCode");
        sb.append('=');
        sb.append(((this.hpPredAcctCode == null)?"<null>":this.hpPredAcctCode));
        sb.append(',');
        sb.append("hpCoasCode");
        sb.append('=');
        sb.append(((this.hpCoasCode == null)?"<null>":this.hpCoasCode));
        sb.append(',');
        sb.append("titl1");
        sb.append('=');
        sb.append(((this.titl1 == null)?"<null>":this.titl1));
        sb.append(',');
        sb.append("titl2");
        sb.append('=');
        sb.append(((this.titl2 == null)?"<null>":this.titl2));
        sb.append(',');
        sb.append("titl3");
        sb.append('=');
        sb.append(((this.titl3 == null)?"<null>":this.titl3));
        sb.append(',');
        sb.append("titl4");
        sb.append('=');
        sb.append(((this.titl4 == null)?"<null>":this.titl4));
        sb.append(',');
        sb.append("predTitle");
        sb.append('=');
        sb.append(((this.predTitle == null)?"<null>":this.predTitle));
        sb.append(',');
        sb.append("head1");
        sb.append('=');
        sb.append(((this.head1 == null)?"<null>":this.head1));
        sb.append(',');
        sb.append("head2");
        sb.append('=');
        sb.append(((this.head2 == null)?"<null>":this.head2));
        sb.append(',');
        sb.append("head3");
        sb.append('=');
        sb.append(((this.head3 == null)?"<null>":this.head3));
        sb.append(',');
        sb.append("head4");
        sb.append('=');
        sb.append(((this.head4 == null)?"<null>":this.head4));
        sb.append(',');
        sb.append("level1");
        sb.append('=');
        sb.append(((this.level1 == null)?"<null>":this.level1));
        sb.append(',');
        sb.append("level3");
        sb.append('=');
        sb.append(((this.level3 == null)?"<null>":this.level3));
        sb.append(',');
        sb.append("level2");
        sb.append('=');
        sb.append(((this.level2 == null)?"<null>":this.level2));
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
        result = ((result* 31)+((this.level4 == null)? 0 :this.level4 .hashCode()));
        result = ((result* 31)+((this.hpAcctCode == null)? 0 :this.hpAcctCode.hashCode()));
        result = ((result* 31)+((this.hpTitle == null)? 0 :this.hpTitle.hashCode()));
        result = ((result* 31)+((this.hpPredAcctCode == null)? 0 :this.hpPredAcctCode.hashCode()));
        result = ((result* 31)+((this.hpCoasCode == null)? 0 :this.hpCoasCode.hashCode()));
        result = ((result* 31)+((this.titl1 == null)? 0 :this.titl1 .hashCode()));
        result = ((result* 31)+((this.titl2 == null)? 0 :this.titl2 .hashCode()));
        result = ((result* 31)+((this.titl3 == null)? 0 :this.titl3 .hashCode()));
        result = ((result* 31)+((this.titl4 == null)? 0 :this.titl4 .hashCode()));
        result = ((result* 31)+((this.predTitle == null)? 0 :this.predTitle.hashCode()));
        result = ((result* 31)+((this.head1 == null)? 0 :this.head1 .hashCode()));
        result = ((result* 31)+((this.head2 == null)? 0 :this.head2 .hashCode()));
        result = ((result* 31)+((this.head3 == null)? 0 :this.head3 .hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.head4 == null)? 0 :this.head4 .hashCode()));
        result = ((result* 31)+((this.level1 == null)? 0 :this.level1 .hashCode()));
        result = ((result* 31)+((this.level3 == null)? 0 :this.level3 .hashCode()));
        result = ((result* 31)+((this.level2 == null)? 0 :this.level2 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccountHierarchy100GetResponse) == false) {
            return false;
        }
        AccountHierarchy100GetResponse rhs = ((AccountHierarchy100GetResponse) other);
        return (((((((((((((((((((this.level4 == rhs.level4)||((this.level4 != null)&&this.level4 .equals(rhs.level4)))&&((this.hpAcctCode == rhs.hpAcctCode)||((this.hpAcctCode!= null)&&this.hpAcctCode.equals(rhs.hpAcctCode))))&&((this.hpTitle == rhs.hpTitle)||((this.hpTitle!= null)&&this.hpTitle.equals(rhs.hpTitle))))&&((this.hpPredAcctCode == rhs.hpPredAcctCode)||((this.hpPredAcctCode!= null)&&this.hpPredAcctCode.equals(rhs.hpPredAcctCode))))&&((this.hpCoasCode == rhs.hpCoasCode)||((this.hpCoasCode!= null)&&this.hpCoasCode.equals(rhs.hpCoasCode))))&&((this.titl1 == rhs.titl1)||((this.titl1 != null)&&this.titl1 .equals(rhs.titl1))))&&((this.titl2 == rhs.titl2)||((this.titl2 != null)&&this.titl2 .equals(rhs.titl2))))&&((this.titl3 == rhs.titl3)||((this.titl3 != null)&&this.titl3 .equals(rhs.titl3))))&&((this.titl4 == rhs.titl4)||((this.titl4 != null)&&this.titl4 .equals(rhs.titl4))))&&((this.predTitle == rhs.predTitle)||((this.predTitle!= null)&&this.predTitle.equals(rhs.predTitle))))&&((this.head1 == rhs.head1)||((this.head1 != null)&&this.head1 .equals(rhs.head1))))&&((this.head2 == rhs.head2)||((this.head2 != null)&&this.head2 .equals(rhs.head2))))&&((this.head3 == rhs.head3)||((this.head3 != null)&&this.head3 .equals(rhs.head3))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.head4 == rhs.head4)||((this.head4 != null)&&this.head4 .equals(rhs.head4))))&&((this.level1 == rhs.level1)||((this.level1 != null)&&this.level1 .equals(rhs.level1))))&&((this.level3 == rhs.level3)||((this.level3 != null)&&this.level3 .equals(rhs.level3))))&&((this.level2 == rhs.level2)||((this.level2 != null)&&this.level2 .equals(rhs.level2))));
    }

}
