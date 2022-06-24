
package com.ellucian.generated.bpapi.ban.dorm_room_and_meal_application.v1_0_0;

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
    "hapsCode",
    "mrcdCode",
    "keyblocTermCode",
    "preferedRoom",
    "preferedCampCode",
    "addDate",
    "rmapSex",
    "preferedBcatCode",
    "artpCode",
    "applPriority",
    "toTerm",
    "preferedBuilding",
    "fromTerm",
    "id"
})
@Generated("jsonschema2pojo")
public class DormRoomAndMealApplication100PutRequest {

    /**
     * Application Status
     * <p>
     * Lineage reference object : SLBRMAP_HAPS_CODE, Lookup lineage reference object : stvhaps
     * (Required)
     * 
     */
    @JsonProperty("hapsCode")
    @JsonPropertyDescription("Lineage reference object : SLBRMAP_HAPS_CODE, Lookup lineage reference object : stvhaps")
    private String hapsCode;
    /**
     * Meal Plan
     * <p>
     * Lineage reference object : SLBRMAP_MRCD_CODE, Lookup lineage reference object : stvmrcd
     * 
     */
    @JsonProperty("mrcdCode")
    @JsonPropertyDescription("Lineage reference object : SLBRMAP_MRCD_CODE, Lookup lineage reference object : stvmrcd")
    private String mrcdCode;
    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    @JsonPropertyDescription("Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm")
    private String keyblocTermCode;
    /**
     * Room
     * <p>
     * Lineage reference object : SLBRMAP_PREFERED_ROOM, Lookup lineage reference object : stvrdef
     * 
     */
    @JsonProperty("preferedRoom")
    @JsonPropertyDescription("Lineage reference object : SLBRMAP_PREFERED_ROOM, Lookup lineage reference object : stvrdef")
    private String preferedRoom;
    /**
     * Campus
     * <p>
     * Lineage reference object : SLBRMAP_PREFERED_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("preferedCampCode")
    @JsonPropertyDescription("Lineage reference object : SLBRMAP_PREFERED_CAMP_CODE, Lookup lineage reference object : stvcamp")
    private String preferedCampCode;
    /**
     * Add Date
     * <p>
     * Lineage reference object : SLBRMAP_ADD_DATE
     * (Required)
     * 
     */
    @JsonProperty("addDate")
    @JsonPropertyDescription("Lineage reference object : SLBRMAP_ADD_DATE")
    private Date addDate;
    /**
     * Gender
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("rmapSex")
    private String rmapSex;
    /**
     * Category
     * <p>
     * Lineage reference object : SLBRMAP_PREFERED_BCAT_CODE, Lookup lineage reference object : slrbcat
     * 
     */
    @JsonProperty("preferedBcatCode")
    @JsonPropertyDescription("Lineage reference object : SLBRMAP_PREFERED_BCAT_CODE, Lookup lineage reference object : slrbcat")
    private String preferedBcatCode;
    /**
     * Application Type
     * <p>
     * Lineage reference object : SLBRMAP_ARTP_CODE, Lookup lineage reference object : stvartp
     * (Required)
     * 
     */
    @JsonProperty("artpCode")
    @JsonPropertyDescription("Lineage reference object : SLBRMAP_ARTP_CODE, Lookup lineage reference object : stvartp")
    private String artpCode;
    /**
     * Priority
     * <p>
     * Lineage reference object : SLBRMAP_APPL_PRIORITY
     * 
     */
    @JsonProperty("applPriority")
    @JsonPropertyDescription("Lineage reference object : SLBRMAP_APPL_PRIORITY")
    private String applPriority;
    /**
     * To Term
     * <p>
     * Lineage reference object : SLBRMAP_TO_TERM, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("toTerm")
    @JsonPropertyDescription("Lineage reference object : SLBRMAP_TO_TERM, Lookup lineage reference object : stvterm")
    private String toTerm;
    /**
     * Building
     * <p>
     * Lineage reference object : SLBRMAP_PREFERED_BUILDING
     * 
     */
    @JsonProperty("preferedBuilding")
    @JsonPropertyDescription("Lineage reference object : SLBRMAP_PREFERED_BUILDING")
    private String preferedBuilding;
    /**
     * From Term
     * <p>
     * Lineage reference object : SLBRMAP_FROM_TERM, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("fromTerm")
    @JsonPropertyDescription("Lineage reference object : SLBRMAP_FROM_TERM, Lookup lineage reference object : stvterm")
    private String fromTerm;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private String id;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Application Status
     * <p>
     * Lineage reference object : SLBRMAP_HAPS_CODE, Lookup lineage reference object : stvhaps
     * (Required)
     * 
     */
    @JsonProperty("hapsCode")
    public String getHapsCode() {
        return hapsCode;
    }

    /**
     * Application Status
     * <p>
     * Lineage reference object : SLBRMAP_HAPS_CODE, Lookup lineage reference object : stvhaps
     * (Required)
     * 
     */
    @JsonProperty("hapsCode")
    public void setHapsCode(String hapsCode) {
        this.hapsCode = hapsCode;
    }

    public DormRoomAndMealApplication100PutRequest withHapsCode(String hapsCode) {
        this.hapsCode = hapsCode;
        return this;
    }

    /**
     * Meal Plan
     * <p>
     * Lineage reference object : SLBRMAP_MRCD_CODE, Lookup lineage reference object : stvmrcd
     * 
     */
    @JsonProperty("mrcdCode")
    public String getMrcdCode() {
        return mrcdCode;
    }

    /**
     * Meal Plan
     * <p>
     * Lineage reference object : SLBRMAP_MRCD_CODE, Lookup lineage reference object : stvmrcd
     * 
     */
    @JsonProperty("mrcdCode")
    public void setMrcdCode(String mrcdCode) {
        this.mrcdCode = mrcdCode;
    }

    public DormRoomAndMealApplication100PutRequest withMrcdCode(String mrcdCode) {
        this.mrcdCode = mrcdCode;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    public String getKeyblocTermCode() {
        return keyblocTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    public void setKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
    }

    public DormRoomAndMealApplication100PutRequest withKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
        return this;
    }

    /**
     * Room
     * <p>
     * Lineage reference object : SLBRMAP_PREFERED_ROOM, Lookup lineage reference object : stvrdef
     * 
     */
    @JsonProperty("preferedRoom")
    public String getPreferedRoom() {
        return preferedRoom;
    }

    /**
     * Room
     * <p>
     * Lineage reference object : SLBRMAP_PREFERED_ROOM, Lookup lineage reference object : stvrdef
     * 
     */
    @JsonProperty("preferedRoom")
    public void setPreferedRoom(String preferedRoom) {
        this.preferedRoom = preferedRoom;
    }

    public DormRoomAndMealApplication100PutRequest withPreferedRoom(String preferedRoom) {
        this.preferedRoom = preferedRoom;
        return this;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SLBRMAP_PREFERED_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("preferedCampCode")
    public String getPreferedCampCode() {
        return preferedCampCode;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SLBRMAP_PREFERED_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("preferedCampCode")
    public void setPreferedCampCode(String preferedCampCode) {
        this.preferedCampCode = preferedCampCode;
    }

    public DormRoomAndMealApplication100PutRequest withPreferedCampCode(String preferedCampCode) {
        this.preferedCampCode = preferedCampCode;
        return this;
    }

    /**
     * Add Date
     * <p>
     * Lineage reference object : SLBRMAP_ADD_DATE
     * (Required)
     * 
     */
    @JsonProperty("addDate")
    public Date getAddDate() {
        return addDate;
    }

    /**
     * Add Date
     * <p>
     * Lineage reference object : SLBRMAP_ADD_DATE
     * (Required)
     * 
     */
    @JsonProperty("addDate")
    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public DormRoomAndMealApplication100PutRequest withAddDate(Date addDate) {
        this.addDate = addDate;
        return this;
    }

    /**
     * Gender
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("rmapSex")
    public String getRmapSex() {
        return rmapSex;
    }

    /**
     * Gender
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("rmapSex")
    public void setRmapSex(String rmapSex) {
        this.rmapSex = rmapSex;
    }

    public DormRoomAndMealApplication100PutRequest withRmapSex(String rmapSex) {
        this.rmapSex = rmapSex;
        return this;
    }

    /**
     * Category
     * <p>
     * Lineage reference object : SLBRMAP_PREFERED_BCAT_CODE, Lookup lineage reference object : slrbcat
     * 
     */
    @JsonProperty("preferedBcatCode")
    public String getPreferedBcatCode() {
        return preferedBcatCode;
    }

    /**
     * Category
     * <p>
     * Lineage reference object : SLBRMAP_PREFERED_BCAT_CODE, Lookup lineage reference object : slrbcat
     * 
     */
    @JsonProperty("preferedBcatCode")
    public void setPreferedBcatCode(String preferedBcatCode) {
        this.preferedBcatCode = preferedBcatCode;
    }

    public DormRoomAndMealApplication100PutRequest withPreferedBcatCode(String preferedBcatCode) {
        this.preferedBcatCode = preferedBcatCode;
        return this;
    }

    /**
     * Application Type
     * <p>
     * Lineage reference object : SLBRMAP_ARTP_CODE, Lookup lineage reference object : stvartp
     * (Required)
     * 
     */
    @JsonProperty("artpCode")
    public String getArtpCode() {
        return artpCode;
    }

    /**
     * Application Type
     * <p>
     * Lineage reference object : SLBRMAP_ARTP_CODE, Lookup lineage reference object : stvartp
     * (Required)
     * 
     */
    @JsonProperty("artpCode")
    public void setArtpCode(String artpCode) {
        this.artpCode = artpCode;
    }

    public DormRoomAndMealApplication100PutRequest withArtpCode(String artpCode) {
        this.artpCode = artpCode;
        return this;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : SLBRMAP_APPL_PRIORITY
     * 
     */
    @JsonProperty("applPriority")
    public String getApplPriority() {
        return applPriority;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : SLBRMAP_APPL_PRIORITY
     * 
     */
    @JsonProperty("applPriority")
    public void setApplPriority(String applPriority) {
        this.applPriority = applPriority;
    }

    public DormRoomAndMealApplication100PutRequest withApplPriority(String applPriority) {
        this.applPriority = applPriority;
        return this;
    }

    /**
     * To Term
     * <p>
     * Lineage reference object : SLBRMAP_TO_TERM, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("toTerm")
    public String getToTerm() {
        return toTerm;
    }

    /**
     * To Term
     * <p>
     * Lineage reference object : SLBRMAP_TO_TERM, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("toTerm")
    public void setToTerm(String toTerm) {
        this.toTerm = toTerm;
    }

    public DormRoomAndMealApplication100PutRequest withToTerm(String toTerm) {
        this.toTerm = toTerm;
        return this;
    }

    /**
     * Building
     * <p>
     * Lineage reference object : SLBRMAP_PREFERED_BUILDING
     * 
     */
    @JsonProperty("preferedBuilding")
    public String getPreferedBuilding() {
        return preferedBuilding;
    }

    /**
     * Building
     * <p>
     * Lineage reference object : SLBRMAP_PREFERED_BUILDING
     * 
     */
    @JsonProperty("preferedBuilding")
    public void setPreferedBuilding(String preferedBuilding) {
        this.preferedBuilding = preferedBuilding;
    }

    public DormRoomAndMealApplication100PutRequest withPreferedBuilding(String preferedBuilding) {
        this.preferedBuilding = preferedBuilding;
        return this;
    }

    /**
     * From Term
     * <p>
     * Lineage reference object : SLBRMAP_FROM_TERM, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("fromTerm")
    public String getFromTerm() {
        return fromTerm;
    }

    /**
     * From Term
     * <p>
     * Lineage reference object : SLBRMAP_FROM_TERM, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("fromTerm")
    public void setFromTerm(String fromTerm) {
        this.fromTerm = fromTerm;
    }

    public DormRoomAndMealApplication100PutRequest withFromTerm(String fromTerm) {
        this.fromTerm = fromTerm;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public DormRoomAndMealApplication100PutRequest withId(String id) {
        this.id = id;
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

    public DormRoomAndMealApplication100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DormRoomAndMealApplication100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("hapsCode");
        sb.append('=');
        sb.append(((this.hapsCode == null)?"<null>":this.hapsCode));
        sb.append(',');
        sb.append("mrcdCode");
        sb.append('=');
        sb.append(((this.mrcdCode == null)?"<null>":this.mrcdCode));
        sb.append(',');
        sb.append("keyblocTermCode");
        sb.append('=');
        sb.append(((this.keyblocTermCode == null)?"<null>":this.keyblocTermCode));
        sb.append(',');
        sb.append("preferedRoom");
        sb.append('=');
        sb.append(((this.preferedRoom == null)?"<null>":this.preferedRoom));
        sb.append(',');
        sb.append("preferedCampCode");
        sb.append('=');
        sb.append(((this.preferedCampCode == null)?"<null>":this.preferedCampCode));
        sb.append(',');
        sb.append("addDate");
        sb.append('=');
        sb.append(((this.addDate == null)?"<null>":this.addDate));
        sb.append(',');
        sb.append("rmapSex");
        sb.append('=');
        sb.append(((this.rmapSex == null)?"<null>":this.rmapSex));
        sb.append(',');
        sb.append("preferedBcatCode");
        sb.append('=');
        sb.append(((this.preferedBcatCode == null)?"<null>":this.preferedBcatCode));
        sb.append(',');
        sb.append("artpCode");
        sb.append('=');
        sb.append(((this.artpCode == null)?"<null>":this.artpCode));
        sb.append(',');
        sb.append("applPriority");
        sb.append('=');
        sb.append(((this.applPriority == null)?"<null>":this.applPriority));
        sb.append(',');
        sb.append("toTerm");
        sb.append('=');
        sb.append(((this.toTerm == null)?"<null>":this.toTerm));
        sb.append(',');
        sb.append("preferedBuilding");
        sb.append('=');
        sb.append(((this.preferedBuilding == null)?"<null>":this.preferedBuilding));
        sb.append(',');
        sb.append("fromTerm");
        sb.append('=');
        sb.append(((this.fromTerm == null)?"<null>":this.fromTerm));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
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
        result = ((result* 31)+((this.hapsCode == null)? 0 :this.hapsCode.hashCode()));
        result = ((result* 31)+((this.mrcdCode == null)? 0 :this.mrcdCode.hashCode()));
        result = ((result* 31)+((this.keyblocTermCode == null)? 0 :this.keyblocTermCode.hashCode()));
        result = ((result* 31)+((this.preferedRoom == null)? 0 :this.preferedRoom.hashCode()));
        result = ((result* 31)+((this.preferedCampCode == null)? 0 :this.preferedCampCode.hashCode()));
        result = ((result* 31)+((this.addDate == null)? 0 :this.addDate.hashCode()));
        result = ((result* 31)+((this.rmapSex == null)? 0 :this.rmapSex.hashCode()));
        result = ((result* 31)+((this.preferedBcatCode == null)? 0 :this.preferedBcatCode.hashCode()));
        result = ((result* 31)+((this.artpCode == null)? 0 :this.artpCode.hashCode()));
        result = ((result* 31)+((this.applPriority == null)? 0 :this.applPriority.hashCode()));
        result = ((result* 31)+((this.toTerm == null)? 0 :this.toTerm.hashCode()));
        result = ((result* 31)+((this.preferedBuilding == null)? 0 :this.preferedBuilding.hashCode()));
        result = ((result* 31)+((this.fromTerm == null)? 0 :this.fromTerm.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DormRoomAndMealApplication100PutRequest) == false) {
            return false;
        }
        DormRoomAndMealApplication100PutRequest rhs = ((DormRoomAndMealApplication100PutRequest) other);
        return ((((((((((((((((this.hapsCode == rhs.hapsCode)||((this.hapsCode!= null)&&this.hapsCode.equals(rhs.hapsCode)))&&((this.mrcdCode == rhs.mrcdCode)||((this.mrcdCode!= null)&&this.mrcdCode.equals(rhs.mrcdCode))))&&((this.keyblocTermCode == rhs.keyblocTermCode)||((this.keyblocTermCode!= null)&&this.keyblocTermCode.equals(rhs.keyblocTermCode))))&&((this.preferedRoom == rhs.preferedRoom)||((this.preferedRoom!= null)&&this.preferedRoom.equals(rhs.preferedRoom))))&&((this.preferedCampCode == rhs.preferedCampCode)||((this.preferedCampCode!= null)&&this.preferedCampCode.equals(rhs.preferedCampCode))))&&((this.addDate == rhs.addDate)||((this.addDate!= null)&&this.addDate.equals(rhs.addDate))))&&((this.rmapSex == rhs.rmapSex)||((this.rmapSex!= null)&&this.rmapSex.equals(rhs.rmapSex))))&&((this.preferedBcatCode == rhs.preferedBcatCode)||((this.preferedBcatCode!= null)&&this.preferedBcatCode.equals(rhs.preferedBcatCode))))&&((this.artpCode == rhs.artpCode)||((this.artpCode!= null)&&this.artpCode.equals(rhs.artpCode))))&&((this.applPriority == rhs.applPriority)||((this.applPriority!= null)&&this.applPriority.equals(rhs.applPriority))))&&((this.toTerm == rhs.toTerm)||((this.toTerm!= null)&&this.toTerm.equals(rhs.toTerm))))&&((this.preferedBuilding == rhs.preferedBuilding)||((this.preferedBuilding!= null)&&this.preferedBuilding.equals(rhs.preferedBuilding))))&&((this.fromTerm == rhs.fromTerm)||((this.fromTerm!= null)&&this.fromTerm.equals(rhs.fromTerm))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
