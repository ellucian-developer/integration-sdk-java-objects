
package com.ellucian.generated.bpapi.ban.general_information_publications.v1_0_0;

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
    "volume",
    "pubtDesc",
    "pages",
    "issue",
    "publisher",
    "title",
    "pubDate",
    "pubtCode"
})
@Generated("jsonschema2pojo")
public class GeneralInformationPublications100GetResponse {

    /**
     * Publication Volume
     * <p>
     * Lineage reference object : PPRPUBL_VOLUME
     * 
     */
    @JsonProperty("volume")
    @JsonPropertyDescription("Lineage reference object : PPRPUBL_VOLUME")
    private String volume;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("pubtDesc")
    private String pubtDesc;
    /**
     * Pages
     * <p>
     * Lineage reference object : PPRPUBL_PAGES
     * 
     */
    @JsonProperty("pages")
    @JsonPropertyDescription("Lineage reference object : PPRPUBL_PAGES")
    private String pages;
    /**
     * Publication Issue
     * <p>
     * Lineage reference object : PPRPUBL_ISSUE
     * 
     */
    @JsonProperty("issue")
    @JsonPropertyDescription("Lineage reference object : PPRPUBL_ISSUE")
    private String issue;
    /**
     * Publisher
     * <p>
     * Lineage reference object : PPRPUBL_PUBLISHER
     * 
     */
    @JsonProperty("publisher")
    @JsonPropertyDescription("Lineage reference object : PPRPUBL_PUBLISHER")
    private String publisher;
    /**
     * Title
     * <p>
     * Lineage reference object : PPRPUBL_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("Lineage reference object : PPRPUBL_TITLE")
    private String title;
    /**
     * Publication Date
     * <p>
     * Lineage reference object : PPRPUBL_PUB_DATE
     * 
     */
    @JsonProperty("pubDate")
    @JsonPropertyDescription("Lineage reference object : PPRPUBL_PUB_DATE")
    private Date pubDate;
    /**
     * Type
     * <p>
     * Lineage reference object : PPRPUBL_PUBT_CODE, Lookup lineage reference object : ptvpubt
     * (Required)
     * 
     */
    @JsonProperty("pubtCode")
    @JsonPropertyDescription("Lineage reference object : PPRPUBL_PUBT_CODE, Lookup lineage reference object : ptvpubt")
    private String pubtCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Publication Volume
     * <p>
     * Lineage reference object : PPRPUBL_VOLUME
     * 
     */
    @JsonProperty("volume")
    public String getVolume() {
        return volume;
    }

    /**
     * Publication Volume
     * <p>
     * Lineage reference object : PPRPUBL_VOLUME
     * 
     */
    @JsonProperty("volume")
    public void setVolume(String volume) {
        this.volume = volume;
    }

    public GeneralInformationPublications100GetResponse withVolume(String volume) {
        this.volume = volume;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("pubtDesc")
    public String getPubtDesc() {
        return pubtDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("pubtDesc")
    public void setPubtDesc(String pubtDesc) {
        this.pubtDesc = pubtDesc;
    }

    public GeneralInformationPublications100GetResponse withPubtDesc(String pubtDesc) {
        this.pubtDesc = pubtDesc;
        return this;
    }

    /**
     * Pages
     * <p>
     * Lineage reference object : PPRPUBL_PAGES
     * 
     */
    @JsonProperty("pages")
    public String getPages() {
        return pages;
    }

    /**
     * Pages
     * <p>
     * Lineage reference object : PPRPUBL_PAGES
     * 
     */
    @JsonProperty("pages")
    public void setPages(String pages) {
        this.pages = pages;
    }

    public GeneralInformationPublications100GetResponse withPages(String pages) {
        this.pages = pages;
        return this;
    }

    /**
     * Publication Issue
     * <p>
     * Lineage reference object : PPRPUBL_ISSUE
     * 
     */
    @JsonProperty("issue")
    public String getIssue() {
        return issue;
    }

    /**
     * Publication Issue
     * <p>
     * Lineage reference object : PPRPUBL_ISSUE
     * 
     */
    @JsonProperty("issue")
    public void setIssue(String issue) {
        this.issue = issue;
    }

    public GeneralInformationPublications100GetResponse withIssue(String issue) {
        this.issue = issue;
        return this;
    }

    /**
     * Publisher
     * <p>
     * Lineage reference object : PPRPUBL_PUBLISHER
     * 
     */
    @JsonProperty("publisher")
    public String getPublisher() {
        return publisher;
    }

    /**
     * Publisher
     * <p>
     * Lineage reference object : PPRPUBL_PUBLISHER
     * 
     */
    @JsonProperty("publisher")
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public GeneralInformationPublications100GetResponse withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : PPRPUBL_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : PPRPUBL_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public GeneralInformationPublications100GetResponse withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Publication Date
     * <p>
     * Lineage reference object : PPRPUBL_PUB_DATE
     * 
     */
    @JsonProperty("pubDate")
    public Date getPubDate() {
        return pubDate;
    }

    /**
     * Publication Date
     * <p>
     * Lineage reference object : PPRPUBL_PUB_DATE
     * 
     */
    @JsonProperty("pubDate")
    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

    public GeneralInformationPublications100GetResponse withPubDate(Date pubDate) {
        this.pubDate = pubDate;
        return this;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : PPRPUBL_PUBT_CODE, Lookup lineage reference object : ptvpubt
     * (Required)
     * 
     */
    @JsonProperty("pubtCode")
    public String getPubtCode() {
        return pubtCode;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : PPRPUBL_PUBT_CODE, Lookup lineage reference object : ptvpubt
     * (Required)
     * 
     */
    @JsonProperty("pubtCode")
    public void setPubtCode(String pubtCode) {
        this.pubtCode = pubtCode;
    }

    public GeneralInformationPublications100GetResponse withPubtCode(String pubtCode) {
        this.pubtCode = pubtCode;
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

    public GeneralInformationPublications100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GeneralInformationPublications100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("volume");
        sb.append('=');
        sb.append(((this.volume == null)?"<null>":this.volume));
        sb.append(',');
        sb.append("pubtDesc");
        sb.append('=');
        sb.append(((this.pubtDesc == null)?"<null>":this.pubtDesc));
        sb.append(',');
        sb.append("pages");
        sb.append('=');
        sb.append(((this.pages == null)?"<null>":this.pages));
        sb.append(',');
        sb.append("issue");
        sb.append('=');
        sb.append(((this.issue == null)?"<null>":this.issue));
        sb.append(',');
        sb.append("publisher");
        sb.append('=');
        sb.append(((this.publisher == null)?"<null>":this.publisher));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("pubDate");
        sb.append('=');
        sb.append(((this.pubDate == null)?"<null>":this.pubDate));
        sb.append(',');
        sb.append("pubtCode");
        sb.append('=');
        sb.append(((this.pubtCode == null)?"<null>":this.pubtCode));
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
        result = ((result* 31)+((this.volume == null)? 0 :this.volume.hashCode()));
        result = ((result* 31)+((this.pubtDesc == null)? 0 :this.pubtDesc.hashCode()));
        result = ((result* 31)+((this.pages == null)? 0 :this.pages.hashCode()));
        result = ((result* 31)+((this.issue == null)? 0 :this.issue.hashCode()));
        result = ((result* 31)+((this.publisher == null)? 0 :this.publisher.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.pubDate == null)? 0 :this.pubDate.hashCode()));
        result = ((result* 31)+((this.pubtCode == null)? 0 :this.pubtCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeneralInformationPublications100GetResponse) == false) {
            return false;
        }
        GeneralInformationPublications100GetResponse rhs = ((GeneralInformationPublications100GetResponse) other);
        return ((((((((((this.volume == rhs.volume)||((this.volume!= null)&&this.volume.equals(rhs.volume)))&&((this.pubtDesc == rhs.pubtDesc)||((this.pubtDesc!= null)&&this.pubtDesc.equals(rhs.pubtDesc))))&&((this.pages == rhs.pages)||((this.pages!= null)&&this.pages.equals(rhs.pages))))&&((this.issue == rhs.issue)||((this.issue!= null)&&this.issue.equals(rhs.issue))))&&((this.publisher == rhs.publisher)||((this.publisher!= null)&&this.publisher.equals(rhs.publisher))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.pubDate == rhs.pubDate)||((this.pubDate!= null)&&this.pubDate.equals(rhs.pubDate))))&&((this.pubtCode == rhs.pubtCode)||((this.pubtCode!= null)&&this.pubtCode.equals(rhs.pubtCode))));
    }

}
