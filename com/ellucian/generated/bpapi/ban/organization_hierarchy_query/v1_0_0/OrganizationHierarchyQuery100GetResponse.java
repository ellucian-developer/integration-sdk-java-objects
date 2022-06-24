
package com.ellucian.generated.bpapi.ban.organization_hierarchy_query.v1_0_0;

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
    "level5",
    "level4",
    "level7",
    "level6",
    "level8",
    "head8",
    "titl1",
    "hpPredOrgnCode",
    "titl2",
    "titl3",
    "titl4",
    "predTitle",
    "head1",
    "head2",
    "head3",
    "head4",
    "level1",
    "titl5",
    "head5",
    "titl6",
    "head6",
    "level3",
    "titl7",
    "head7",
    "level2",
    "titl8"
})
@Generated("jsonschema2pojo")
public class OrganizationHierarchyQuery100GetResponse {

    /**
     * Lineage reference object : level5
     * 
     */
    @JsonProperty("level5")
    @JsonPropertyDescription("Lineage reference object : level5")
    private String level5;
    /**
     * Lineage reference object : level4
     * 
     */
    @JsonProperty("level4")
    @JsonPropertyDescription("Lineage reference object : level4")
    private String level4;
    /**
     * Lineage reference object : level7
     * 
     */
    @JsonProperty("level7")
    @JsonPropertyDescription("Lineage reference object : level7")
    private String level7;
    /**
     * Lineage reference object : level6
     * 
     */
    @JsonProperty("level6")
    @JsonPropertyDescription("Lineage reference object : level6")
    private String level6;
    /**
     * Lineage reference object : level8
     * 
     */
    @JsonProperty("level8")
    @JsonPropertyDescription("Lineage reference object : level8")
    private String level8;
    /**
     * Lineage reference object : head8
     * 
     */
    @JsonProperty("head8")
    @JsonPropertyDescription("Lineage reference object : head8")
    private String head8;
    /**
     * Lineage reference object : titl1
     * 
     */
    @JsonProperty("titl1")
    @JsonPropertyDescription("Lineage reference object : titl1")
    private String titl1;
    /**
     * Predecessor Organization
     * <p>
     * Lineage reference object : hpPredOrgnCode
     * 
     */
    @JsonProperty("hpPredOrgnCode")
    @JsonPropertyDescription("Lineage reference object : hpPredOrgnCode")
    private String hpPredOrgnCode;
    /**
     * Lineage reference object : titl2
     * 
     */
    @JsonProperty("titl2")
    @JsonPropertyDescription("Lineage reference object : titl2")
    private String titl2;
    /**
     * Lineage reference object : titl3
     * 
     */
    @JsonProperty("titl3")
    @JsonPropertyDescription("Lineage reference object : titl3")
    private String titl3;
    /**
     * Lineage reference object : titl4
     * 
     */
    @JsonProperty("titl4")
    @JsonPropertyDescription("Lineage reference object : titl4")
    private String titl4;
    /**
     * Lineage reference object : predTitle
     * 
     */
    @JsonProperty("predTitle")
    @JsonPropertyDescription("Lineage reference object : predTitle")
    private String predTitle;
    /**
     * Lineage reference object : head1
     * 
     */
    @JsonProperty("head1")
    @JsonPropertyDescription("Lineage reference object : head1")
    private String head1;
    /**
     * Lineage reference object : head2
     * 
     */
    @JsonProperty("head2")
    @JsonPropertyDescription("Lineage reference object : head2")
    private String head2;
    /**
     * Lineage reference object : head3
     * 
     */
    @JsonProperty("head3")
    @JsonPropertyDescription("Lineage reference object : head3")
    private String head3;
    /**
     * Lineage reference object : head4
     * 
     */
    @JsonProperty("head4")
    @JsonPropertyDescription("Lineage reference object : head4")
    private String head4;
    /**
     * Lineage reference object : level1
     * 
     */
    @JsonProperty("level1")
    @JsonPropertyDescription("Lineage reference object : level1")
    private String level1;
    /**
     * Lineage reference object : titl5
     * 
     */
    @JsonProperty("titl5")
    @JsonPropertyDescription("Lineage reference object : titl5")
    private String titl5;
    /**
     * Lineage reference object : head5
     * 
     */
    @JsonProperty("head5")
    @JsonPropertyDescription("Lineage reference object : head5")
    private String head5;
    /**
     * Lineage reference object : titl6
     * 
     */
    @JsonProperty("titl6")
    @JsonPropertyDescription("Lineage reference object : titl6")
    private String titl6;
    /**
     * Lineage reference object : head6
     * 
     */
    @JsonProperty("head6")
    @JsonPropertyDescription("Lineage reference object : head6")
    private String head6;
    /**
     * Lineage reference object : level3
     * 
     */
    @JsonProperty("level3")
    @JsonPropertyDescription("Lineage reference object : level3")
    private String level3;
    /**
     * Lineage reference object : titl7
     * 
     */
    @JsonProperty("titl7")
    @JsonPropertyDescription("Lineage reference object : titl7")
    private String titl7;
    /**
     * Lineage reference object : head7
     * 
     */
    @JsonProperty("head7")
    @JsonPropertyDescription("Lineage reference object : head7")
    private String head7;
    /**
     * Lineage reference object : level2
     * 
     */
    @JsonProperty("level2")
    @JsonPropertyDescription("Lineage reference object : level2")
    private String level2;
    /**
     * Lineage reference object : titl8
     * 
     */
    @JsonProperty("titl8")
    @JsonPropertyDescription("Lineage reference object : titl8")
    private String titl8;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : level5
     * 
     */
    @JsonProperty("level5")
    public String getLevel5() {
        return level5;
    }

    /**
     * Lineage reference object : level5
     * 
     */
    @JsonProperty("level5")
    public void setLevel5(String level5) {
        this.level5 = level5;
    }

    public OrganizationHierarchyQuery100GetResponse withLevel5(String level5) {
        this.level5 = level5;
        return this;
    }

    /**
     * Lineage reference object : level4
     * 
     */
    @JsonProperty("level4")
    public String getLevel4() {
        return level4;
    }

    /**
     * Lineage reference object : level4
     * 
     */
    @JsonProperty("level4")
    public void setLevel4(String level4) {
        this.level4 = level4;
    }

    public OrganizationHierarchyQuery100GetResponse withLevel4(String level4) {
        this.level4 = level4;
        return this;
    }

    /**
     * Lineage reference object : level7
     * 
     */
    @JsonProperty("level7")
    public String getLevel7() {
        return level7;
    }

    /**
     * Lineage reference object : level7
     * 
     */
    @JsonProperty("level7")
    public void setLevel7(String level7) {
        this.level7 = level7;
    }

    public OrganizationHierarchyQuery100GetResponse withLevel7(String level7) {
        this.level7 = level7;
        return this;
    }

    /**
     * Lineage reference object : level6
     * 
     */
    @JsonProperty("level6")
    public String getLevel6() {
        return level6;
    }

    /**
     * Lineage reference object : level6
     * 
     */
    @JsonProperty("level6")
    public void setLevel6(String level6) {
        this.level6 = level6;
    }

    public OrganizationHierarchyQuery100GetResponse withLevel6(String level6) {
        this.level6 = level6;
        return this;
    }

    /**
     * Lineage reference object : level8
     * 
     */
    @JsonProperty("level8")
    public String getLevel8() {
        return level8;
    }

    /**
     * Lineage reference object : level8
     * 
     */
    @JsonProperty("level8")
    public void setLevel8(String level8) {
        this.level8 = level8;
    }

    public OrganizationHierarchyQuery100GetResponse withLevel8(String level8) {
        this.level8 = level8;
        return this;
    }

    /**
     * Lineage reference object : head8
     * 
     */
    @JsonProperty("head8")
    public String getHead8() {
        return head8;
    }

    /**
     * Lineage reference object : head8
     * 
     */
    @JsonProperty("head8")
    public void setHead8(String head8) {
        this.head8 = head8;
    }

    public OrganizationHierarchyQuery100GetResponse withHead8(String head8) {
        this.head8 = head8;
        return this;
    }

    /**
     * Lineage reference object : titl1
     * 
     */
    @JsonProperty("titl1")
    public String getTitl1() {
        return titl1;
    }

    /**
     * Lineage reference object : titl1
     * 
     */
    @JsonProperty("titl1")
    public void setTitl1(String titl1) {
        this.titl1 = titl1;
    }

    public OrganizationHierarchyQuery100GetResponse withTitl1(String titl1) {
        this.titl1 = titl1;
        return this;
    }

    /**
     * Predecessor Organization
     * <p>
     * Lineage reference object : hpPredOrgnCode
     * 
     */
    @JsonProperty("hpPredOrgnCode")
    public String getHpPredOrgnCode() {
        return hpPredOrgnCode;
    }

    /**
     * Predecessor Organization
     * <p>
     * Lineage reference object : hpPredOrgnCode
     * 
     */
    @JsonProperty("hpPredOrgnCode")
    public void setHpPredOrgnCode(String hpPredOrgnCode) {
        this.hpPredOrgnCode = hpPredOrgnCode;
    }

    public OrganizationHierarchyQuery100GetResponse withHpPredOrgnCode(String hpPredOrgnCode) {
        this.hpPredOrgnCode = hpPredOrgnCode;
        return this;
    }

    /**
     * Lineage reference object : titl2
     * 
     */
    @JsonProperty("titl2")
    public String getTitl2() {
        return titl2;
    }

    /**
     * Lineage reference object : titl2
     * 
     */
    @JsonProperty("titl2")
    public void setTitl2(String titl2) {
        this.titl2 = titl2;
    }

    public OrganizationHierarchyQuery100GetResponse withTitl2(String titl2) {
        this.titl2 = titl2;
        return this;
    }

    /**
     * Lineage reference object : titl3
     * 
     */
    @JsonProperty("titl3")
    public String getTitl3() {
        return titl3;
    }

    /**
     * Lineage reference object : titl3
     * 
     */
    @JsonProperty("titl3")
    public void setTitl3(String titl3) {
        this.titl3 = titl3;
    }

    public OrganizationHierarchyQuery100GetResponse withTitl3(String titl3) {
        this.titl3 = titl3;
        return this;
    }

    /**
     * Lineage reference object : titl4
     * 
     */
    @JsonProperty("titl4")
    public String getTitl4() {
        return titl4;
    }

    /**
     * Lineage reference object : titl4
     * 
     */
    @JsonProperty("titl4")
    public void setTitl4(String titl4) {
        this.titl4 = titl4;
    }

    public OrganizationHierarchyQuery100GetResponse withTitl4(String titl4) {
        this.titl4 = titl4;
        return this;
    }

    /**
     * Lineage reference object : predTitle
     * 
     */
    @JsonProperty("predTitle")
    public String getPredTitle() {
        return predTitle;
    }

    /**
     * Lineage reference object : predTitle
     * 
     */
    @JsonProperty("predTitle")
    public void setPredTitle(String predTitle) {
        this.predTitle = predTitle;
    }

    public OrganizationHierarchyQuery100GetResponse withPredTitle(String predTitle) {
        this.predTitle = predTitle;
        return this;
    }

    /**
     * Lineage reference object : head1
     * 
     */
    @JsonProperty("head1")
    public String getHead1() {
        return head1;
    }

    /**
     * Lineage reference object : head1
     * 
     */
    @JsonProperty("head1")
    public void setHead1(String head1) {
        this.head1 = head1;
    }

    public OrganizationHierarchyQuery100GetResponse withHead1(String head1) {
        this.head1 = head1;
        return this;
    }

    /**
     * Lineage reference object : head2
     * 
     */
    @JsonProperty("head2")
    public String getHead2() {
        return head2;
    }

    /**
     * Lineage reference object : head2
     * 
     */
    @JsonProperty("head2")
    public void setHead2(String head2) {
        this.head2 = head2;
    }

    public OrganizationHierarchyQuery100GetResponse withHead2(String head2) {
        this.head2 = head2;
        return this;
    }

    /**
     * Lineage reference object : head3
     * 
     */
    @JsonProperty("head3")
    public String getHead3() {
        return head3;
    }

    /**
     * Lineage reference object : head3
     * 
     */
    @JsonProperty("head3")
    public void setHead3(String head3) {
        this.head3 = head3;
    }

    public OrganizationHierarchyQuery100GetResponse withHead3(String head3) {
        this.head3 = head3;
        return this;
    }

    /**
     * Lineage reference object : head4
     * 
     */
    @JsonProperty("head4")
    public String getHead4() {
        return head4;
    }

    /**
     * Lineage reference object : head4
     * 
     */
    @JsonProperty("head4")
    public void setHead4(String head4) {
        this.head4 = head4;
    }

    public OrganizationHierarchyQuery100GetResponse withHead4(String head4) {
        this.head4 = head4;
        return this;
    }

    /**
     * Lineage reference object : level1
     * 
     */
    @JsonProperty("level1")
    public String getLevel1() {
        return level1;
    }

    /**
     * Lineage reference object : level1
     * 
     */
    @JsonProperty("level1")
    public void setLevel1(String level1) {
        this.level1 = level1;
    }

    public OrganizationHierarchyQuery100GetResponse withLevel1(String level1) {
        this.level1 = level1;
        return this;
    }

    /**
     * Lineage reference object : titl5
     * 
     */
    @JsonProperty("titl5")
    public String getTitl5() {
        return titl5;
    }

    /**
     * Lineage reference object : titl5
     * 
     */
    @JsonProperty("titl5")
    public void setTitl5(String titl5) {
        this.titl5 = titl5;
    }

    public OrganizationHierarchyQuery100GetResponse withTitl5(String titl5) {
        this.titl5 = titl5;
        return this;
    }

    /**
     * Lineage reference object : head5
     * 
     */
    @JsonProperty("head5")
    public String getHead5() {
        return head5;
    }

    /**
     * Lineage reference object : head5
     * 
     */
    @JsonProperty("head5")
    public void setHead5(String head5) {
        this.head5 = head5;
    }

    public OrganizationHierarchyQuery100GetResponse withHead5(String head5) {
        this.head5 = head5;
        return this;
    }

    /**
     * Lineage reference object : titl6
     * 
     */
    @JsonProperty("titl6")
    public String getTitl6() {
        return titl6;
    }

    /**
     * Lineage reference object : titl6
     * 
     */
    @JsonProperty("titl6")
    public void setTitl6(String titl6) {
        this.titl6 = titl6;
    }

    public OrganizationHierarchyQuery100GetResponse withTitl6(String titl6) {
        this.titl6 = titl6;
        return this;
    }

    /**
     * Lineage reference object : head6
     * 
     */
    @JsonProperty("head6")
    public String getHead6() {
        return head6;
    }

    /**
     * Lineage reference object : head6
     * 
     */
    @JsonProperty("head6")
    public void setHead6(String head6) {
        this.head6 = head6;
    }

    public OrganizationHierarchyQuery100GetResponse withHead6(String head6) {
        this.head6 = head6;
        return this;
    }

    /**
     * Lineage reference object : level3
     * 
     */
    @JsonProperty("level3")
    public String getLevel3() {
        return level3;
    }

    /**
     * Lineage reference object : level3
     * 
     */
    @JsonProperty("level3")
    public void setLevel3(String level3) {
        this.level3 = level3;
    }

    public OrganizationHierarchyQuery100GetResponse withLevel3(String level3) {
        this.level3 = level3;
        return this;
    }

    /**
     * Lineage reference object : titl7
     * 
     */
    @JsonProperty("titl7")
    public String getTitl7() {
        return titl7;
    }

    /**
     * Lineage reference object : titl7
     * 
     */
    @JsonProperty("titl7")
    public void setTitl7(String titl7) {
        this.titl7 = titl7;
    }

    public OrganizationHierarchyQuery100GetResponse withTitl7(String titl7) {
        this.titl7 = titl7;
        return this;
    }

    /**
     * Lineage reference object : head7
     * 
     */
    @JsonProperty("head7")
    public String getHead7() {
        return head7;
    }

    /**
     * Lineage reference object : head7
     * 
     */
    @JsonProperty("head7")
    public void setHead7(String head7) {
        this.head7 = head7;
    }

    public OrganizationHierarchyQuery100GetResponse withHead7(String head7) {
        this.head7 = head7;
        return this;
    }

    /**
     * Lineage reference object : level2
     * 
     */
    @JsonProperty("level2")
    public String getLevel2() {
        return level2;
    }

    /**
     * Lineage reference object : level2
     * 
     */
    @JsonProperty("level2")
    public void setLevel2(String level2) {
        this.level2 = level2;
    }

    public OrganizationHierarchyQuery100GetResponse withLevel2(String level2) {
        this.level2 = level2;
        return this;
    }

    /**
     * Lineage reference object : titl8
     * 
     */
    @JsonProperty("titl8")
    public String getTitl8() {
        return titl8;
    }

    /**
     * Lineage reference object : titl8
     * 
     */
    @JsonProperty("titl8")
    public void setTitl8(String titl8) {
        this.titl8 = titl8;
    }

    public OrganizationHierarchyQuery100GetResponse withTitl8(String titl8) {
        this.titl8 = titl8;
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

    public OrganizationHierarchyQuery100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OrganizationHierarchyQuery100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("level5");
        sb.append('=');
        sb.append(((this.level5 == null)?"<null>":this.level5));
        sb.append(',');
        sb.append("level4");
        sb.append('=');
        sb.append(((this.level4 == null)?"<null>":this.level4));
        sb.append(',');
        sb.append("level7");
        sb.append('=');
        sb.append(((this.level7 == null)?"<null>":this.level7));
        sb.append(',');
        sb.append("level6");
        sb.append('=');
        sb.append(((this.level6 == null)?"<null>":this.level6));
        sb.append(',');
        sb.append("level8");
        sb.append('=');
        sb.append(((this.level8 == null)?"<null>":this.level8));
        sb.append(',');
        sb.append("head8");
        sb.append('=');
        sb.append(((this.head8 == null)?"<null>":this.head8));
        sb.append(',');
        sb.append("titl1");
        sb.append('=');
        sb.append(((this.titl1 == null)?"<null>":this.titl1));
        sb.append(',');
        sb.append("hpPredOrgnCode");
        sb.append('=');
        sb.append(((this.hpPredOrgnCode == null)?"<null>":this.hpPredOrgnCode));
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
        sb.append("titl5");
        sb.append('=');
        sb.append(((this.titl5 == null)?"<null>":this.titl5));
        sb.append(',');
        sb.append("head5");
        sb.append('=');
        sb.append(((this.head5 == null)?"<null>":this.head5));
        sb.append(',');
        sb.append("titl6");
        sb.append('=');
        sb.append(((this.titl6 == null)?"<null>":this.titl6));
        sb.append(',');
        sb.append("head6");
        sb.append('=');
        sb.append(((this.head6 == null)?"<null>":this.head6));
        sb.append(',');
        sb.append("level3");
        sb.append('=');
        sb.append(((this.level3 == null)?"<null>":this.level3));
        sb.append(',');
        sb.append("titl7");
        sb.append('=');
        sb.append(((this.titl7 == null)?"<null>":this.titl7));
        sb.append(',');
        sb.append("head7");
        sb.append('=');
        sb.append(((this.head7 == null)?"<null>":this.head7));
        sb.append(',');
        sb.append("level2");
        sb.append('=');
        sb.append(((this.level2 == null)?"<null>":this.level2));
        sb.append(',');
        sb.append("titl8");
        sb.append('=');
        sb.append(((this.titl8 == null)?"<null>":this.titl8));
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
        result = ((result* 31)+((this.level5 == null)? 0 :this.level5 .hashCode()));
        result = ((result* 31)+((this.level4 == null)? 0 :this.level4 .hashCode()));
        result = ((result* 31)+((this.level7 == null)? 0 :this.level7 .hashCode()));
        result = ((result* 31)+((this.level6 == null)? 0 :this.level6 .hashCode()));
        result = ((result* 31)+((this.level8 == null)? 0 :this.level8 .hashCode()));
        result = ((result* 31)+((this.head8 == null)? 0 :this.head8 .hashCode()));
        result = ((result* 31)+((this.titl1 == null)? 0 :this.titl1 .hashCode()));
        result = ((result* 31)+((this.hpPredOrgnCode == null)? 0 :this.hpPredOrgnCode.hashCode()));
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
        result = ((result* 31)+((this.titl5 == null)? 0 :this.titl5 .hashCode()));
        result = ((result* 31)+((this.head5 == null)? 0 :this.head5 .hashCode()));
        result = ((result* 31)+((this.titl6 == null)? 0 :this.titl6 .hashCode()));
        result = ((result* 31)+((this.head6 == null)? 0 :this.head6 .hashCode()));
        result = ((result* 31)+((this.level3 == null)? 0 :this.level3 .hashCode()));
        result = ((result* 31)+((this.titl7 == null)? 0 :this.titl7 .hashCode()));
        result = ((result* 31)+((this.head7 == null)? 0 :this.head7 .hashCode()));
        result = ((result* 31)+((this.level2 == null)? 0 :this.level2 .hashCode()));
        result = ((result* 31)+((this.titl8 == null)? 0 :this.titl8 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OrganizationHierarchyQuery100GetResponse) == false) {
            return false;
        }
        OrganizationHierarchyQuery100GetResponse rhs = ((OrganizationHierarchyQuery100GetResponse) other);
        return ((((((((((((((((((((((((((((this.level5 == rhs.level5)||((this.level5 != null)&&this.level5 .equals(rhs.level5)))&&((this.level4 == rhs.level4)||((this.level4 != null)&&this.level4 .equals(rhs.level4))))&&((this.level7 == rhs.level7)||((this.level7 != null)&&this.level7 .equals(rhs.level7))))&&((this.level6 == rhs.level6)||((this.level6 != null)&&this.level6 .equals(rhs.level6))))&&((this.level8 == rhs.level8)||((this.level8 != null)&&this.level8 .equals(rhs.level8))))&&((this.head8 == rhs.head8)||((this.head8 != null)&&this.head8 .equals(rhs.head8))))&&((this.titl1 == rhs.titl1)||((this.titl1 != null)&&this.titl1 .equals(rhs.titl1))))&&((this.hpPredOrgnCode == rhs.hpPredOrgnCode)||((this.hpPredOrgnCode!= null)&&this.hpPredOrgnCode.equals(rhs.hpPredOrgnCode))))&&((this.titl2 == rhs.titl2)||((this.titl2 != null)&&this.titl2 .equals(rhs.titl2))))&&((this.titl3 == rhs.titl3)||((this.titl3 != null)&&this.titl3 .equals(rhs.titl3))))&&((this.titl4 == rhs.titl4)||((this.titl4 != null)&&this.titl4 .equals(rhs.titl4))))&&((this.predTitle == rhs.predTitle)||((this.predTitle!= null)&&this.predTitle.equals(rhs.predTitle))))&&((this.head1 == rhs.head1)||((this.head1 != null)&&this.head1 .equals(rhs.head1))))&&((this.head2 == rhs.head2)||((this.head2 != null)&&this.head2 .equals(rhs.head2))))&&((this.head3 == rhs.head3)||((this.head3 != null)&&this.head3 .equals(rhs.head3))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.head4 == rhs.head4)||((this.head4 != null)&&this.head4 .equals(rhs.head4))))&&((this.level1 == rhs.level1)||((this.level1 != null)&&this.level1 .equals(rhs.level1))))&&((this.titl5 == rhs.titl5)||((this.titl5 != null)&&this.titl5 .equals(rhs.titl5))))&&((this.head5 == rhs.head5)||((this.head5 != null)&&this.head5 .equals(rhs.head5))))&&((this.titl6 == rhs.titl6)||((this.titl6 != null)&&this.titl6 .equals(rhs.titl6))))&&((this.head6 == rhs.head6)||((this.head6 != null)&&this.head6 .equals(rhs.head6))))&&((this.level3 == rhs.level3)||((this.level3 != null)&&this.level3 .equals(rhs.level3))))&&((this.titl7 == rhs.titl7)||((this.titl7 != null)&&this.titl7 .equals(rhs.titl7))))&&((this.head7 == rhs.head7)||((this.head7 != null)&&this.head7 .equals(rhs.head7))))&&((this.level2 == rhs.level2)||((this.level2 != null)&&this.level2 .equals(rhs.level2))))&&((this.titl8 == rhs.titl8)||((this.titl8 != null)&&this.titl8 .equals(rhs.titl8))));
    }

}
