
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
    "bcatDesc",
    "hapsDate",
    "hapsCode",
    "mrcdCode",
    "preferedRoom",
    "rmapArtpDesc",
    "roomDesc",
    "campDesc",
    "preferedCampCode",
    "rmapSex",
    "addDate",
    "preferedBcatCode",
    "applPriority",
    "artpCode",
    "preferedBuilding",
    "toTerm",
    "rmapHapsDesc",
    "rmapMrcdDesc",
    "fromTerm",
    "bldgDesc"
})
@Generated("jsonschema2pojo")
public class DormRoomAndMealApplication100GetResponse {

    @JsonProperty("bcatDesc")
    private String bcatDesc;
    /**
     * Application Status Date
     * <p>
     * Lineage reference object : SLBRMAP_HAPS_DATE
     * 
     */
    @JsonProperty("hapsDate")
    @JsonPropertyDescription("Lineage reference object : SLBRMAP_HAPS_DATE")
    private Date hapsDate;
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
     * Room
     * <p>
     * Lineage reference object : SLBRMAP_PREFERED_ROOM, Lookup lineage reference object : stvrdef
     * 
     */
    @JsonProperty("preferedRoom")
    @JsonPropertyDescription("Lineage reference object : SLBRMAP_PREFERED_ROOM, Lookup lineage reference object : stvrdef")
    private String preferedRoom;
    @JsonProperty("rmapArtpDesc")
    private String rmapArtpDesc;
    @JsonProperty("roomDesc")
    private String roomDesc;
    @JsonProperty("campDesc")
    private String campDesc;
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
     * Gender
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("rmapSex")
    private String rmapSex;
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
     * Category
     * <p>
     * Lineage reference object : SLBRMAP_PREFERED_BCAT_CODE, Lookup lineage reference object : slrbcat
     * 
     */
    @JsonProperty("preferedBcatCode")
    @JsonPropertyDescription("Lineage reference object : SLBRMAP_PREFERED_BCAT_CODE, Lookup lineage reference object : slrbcat")
    private String preferedBcatCode;
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
     * Building
     * <p>
     * Lineage reference object : SLBRMAP_PREFERED_BUILDING
     * 
     */
    @JsonProperty("preferedBuilding")
    @JsonPropertyDescription("Lineage reference object : SLBRMAP_PREFERED_BUILDING")
    private String preferedBuilding;
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
    @JsonProperty("rmapHapsDesc")
    private String rmapHapsDesc;
    @JsonProperty("rmapMrcdDesc")
    private String rmapMrcdDesc;
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
    @JsonProperty("bldgDesc")
    private String bldgDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("bcatDesc")
    public String getBcatDesc() {
        return bcatDesc;
    }

    @JsonProperty("bcatDesc")
    public void setBcatDesc(String bcatDesc) {
        this.bcatDesc = bcatDesc;
    }

    public DormRoomAndMealApplication100GetResponse withBcatDesc(String bcatDesc) {
        this.bcatDesc = bcatDesc;
        return this;
    }

    /**
     * Application Status Date
     * <p>
     * Lineage reference object : SLBRMAP_HAPS_DATE
     * 
     */
    @JsonProperty("hapsDate")
    public Date getHapsDate() {
        return hapsDate;
    }

    /**
     * Application Status Date
     * <p>
     * Lineage reference object : SLBRMAP_HAPS_DATE
     * 
     */
    @JsonProperty("hapsDate")
    public void setHapsDate(Date hapsDate) {
        this.hapsDate = hapsDate;
    }

    public DormRoomAndMealApplication100GetResponse withHapsDate(Date hapsDate) {
        this.hapsDate = hapsDate;
        return this;
    }

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

    public DormRoomAndMealApplication100GetResponse withHapsCode(String hapsCode) {
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

    public DormRoomAndMealApplication100GetResponse withMrcdCode(String mrcdCode) {
        this.mrcdCode = mrcdCode;
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

    public DormRoomAndMealApplication100GetResponse withPreferedRoom(String preferedRoom) {
        this.preferedRoom = preferedRoom;
        return this;
    }

    @JsonProperty("rmapArtpDesc")
    public String getRmapArtpDesc() {
        return rmapArtpDesc;
    }

    @JsonProperty("rmapArtpDesc")
    public void setRmapArtpDesc(String rmapArtpDesc) {
        this.rmapArtpDesc = rmapArtpDesc;
    }

    public DormRoomAndMealApplication100GetResponse withRmapArtpDesc(String rmapArtpDesc) {
        this.rmapArtpDesc = rmapArtpDesc;
        return this;
    }

    @JsonProperty("roomDesc")
    public String getRoomDesc() {
        return roomDesc;
    }

    @JsonProperty("roomDesc")
    public void setRoomDesc(String roomDesc) {
        this.roomDesc = roomDesc;
    }

    public DormRoomAndMealApplication100GetResponse withRoomDesc(String roomDesc) {
        this.roomDesc = roomDesc;
        return this;
    }

    @JsonProperty("campDesc")
    public String getCampDesc() {
        return campDesc;
    }

    @JsonProperty("campDesc")
    public void setCampDesc(String campDesc) {
        this.campDesc = campDesc;
    }

    public DormRoomAndMealApplication100GetResponse withCampDesc(String campDesc) {
        this.campDesc = campDesc;
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

    public DormRoomAndMealApplication100GetResponse withPreferedCampCode(String preferedCampCode) {
        this.preferedCampCode = preferedCampCode;
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

    public DormRoomAndMealApplication100GetResponse withRmapSex(String rmapSex) {
        this.rmapSex = rmapSex;
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

    public DormRoomAndMealApplication100GetResponse withAddDate(Date addDate) {
        this.addDate = addDate;
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

    public DormRoomAndMealApplication100GetResponse withPreferedBcatCode(String preferedBcatCode) {
        this.preferedBcatCode = preferedBcatCode;
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

    public DormRoomAndMealApplication100GetResponse withApplPriority(String applPriority) {
        this.applPriority = applPriority;
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

    public DormRoomAndMealApplication100GetResponse withArtpCode(String artpCode) {
        this.artpCode = artpCode;
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

    public DormRoomAndMealApplication100GetResponse withPreferedBuilding(String preferedBuilding) {
        this.preferedBuilding = preferedBuilding;
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

    public DormRoomAndMealApplication100GetResponse withToTerm(String toTerm) {
        this.toTerm = toTerm;
        return this;
    }

    @JsonProperty("rmapHapsDesc")
    public String getRmapHapsDesc() {
        return rmapHapsDesc;
    }

    @JsonProperty("rmapHapsDesc")
    public void setRmapHapsDesc(String rmapHapsDesc) {
        this.rmapHapsDesc = rmapHapsDesc;
    }

    public DormRoomAndMealApplication100GetResponse withRmapHapsDesc(String rmapHapsDesc) {
        this.rmapHapsDesc = rmapHapsDesc;
        return this;
    }

    @JsonProperty("rmapMrcdDesc")
    public String getRmapMrcdDesc() {
        return rmapMrcdDesc;
    }

    @JsonProperty("rmapMrcdDesc")
    public void setRmapMrcdDesc(String rmapMrcdDesc) {
        this.rmapMrcdDesc = rmapMrcdDesc;
    }

    public DormRoomAndMealApplication100GetResponse withRmapMrcdDesc(String rmapMrcdDesc) {
        this.rmapMrcdDesc = rmapMrcdDesc;
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

    public DormRoomAndMealApplication100GetResponse withFromTerm(String fromTerm) {
        this.fromTerm = fromTerm;
        return this;
    }

    @JsonProperty("bldgDesc")
    public String getBldgDesc() {
        return bldgDesc;
    }

    @JsonProperty("bldgDesc")
    public void setBldgDesc(String bldgDesc) {
        this.bldgDesc = bldgDesc;
    }

    public DormRoomAndMealApplication100GetResponse withBldgDesc(String bldgDesc) {
        this.bldgDesc = bldgDesc;
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

    public DormRoomAndMealApplication100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DormRoomAndMealApplication100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bcatDesc");
        sb.append('=');
        sb.append(((this.bcatDesc == null)?"<null>":this.bcatDesc));
        sb.append(',');
        sb.append("hapsDate");
        sb.append('=');
        sb.append(((this.hapsDate == null)?"<null>":this.hapsDate));
        sb.append(',');
        sb.append("hapsCode");
        sb.append('=');
        sb.append(((this.hapsCode == null)?"<null>":this.hapsCode));
        sb.append(',');
        sb.append("mrcdCode");
        sb.append('=');
        sb.append(((this.mrcdCode == null)?"<null>":this.mrcdCode));
        sb.append(',');
        sb.append("preferedRoom");
        sb.append('=');
        sb.append(((this.preferedRoom == null)?"<null>":this.preferedRoom));
        sb.append(',');
        sb.append("rmapArtpDesc");
        sb.append('=');
        sb.append(((this.rmapArtpDesc == null)?"<null>":this.rmapArtpDesc));
        sb.append(',');
        sb.append("roomDesc");
        sb.append('=');
        sb.append(((this.roomDesc == null)?"<null>":this.roomDesc));
        sb.append(',');
        sb.append("campDesc");
        sb.append('=');
        sb.append(((this.campDesc == null)?"<null>":this.campDesc));
        sb.append(',');
        sb.append("preferedCampCode");
        sb.append('=');
        sb.append(((this.preferedCampCode == null)?"<null>":this.preferedCampCode));
        sb.append(',');
        sb.append("rmapSex");
        sb.append('=');
        sb.append(((this.rmapSex == null)?"<null>":this.rmapSex));
        sb.append(',');
        sb.append("addDate");
        sb.append('=');
        sb.append(((this.addDate == null)?"<null>":this.addDate));
        sb.append(',');
        sb.append("preferedBcatCode");
        sb.append('=');
        sb.append(((this.preferedBcatCode == null)?"<null>":this.preferedBcatCode));
        sb.append(',');
        sb.append("applPriority");
        sb.append('=');
        sb.append(((this.applPriority == null)?"<null>":this.applPriority));
        sb.append(',');
        sb.append("artpCode");
        sb.append('=');
        sb.append(((this.artpCode == null)?"<null>":this.artpCode));
        sb.append(',');
        sb.append("preferedBuilding");
        sb.append('=');
        sb.append(((this.preferedBuilding == null)?"<null>":this.preferedBuilding));
        sb.append(',');
        sb.append("toTerm");
        sb.append('=');
        sb.append(((this.toTerm == null)?"<null>":this.toTerm));
        sb.append(',');
        sb.append("rmapHapsDesc");
        sb.append('=');
        sb.append(((this.rmapHapsDesc == null)?"<null>":this.rmapHapsDesc));
        sb.append(',');
        sb.append("rmapMrcdDesc");
        sb.append('=');
        sb.append(((this.rmapMrcdDesc == null)?"<null>":this.rmapMrcdDesc));
        sb.append(',');
        sb.append("fromTerm");
        sb.append('=');
        sb.append(((this.fromTerm == null)?"<null>":this.fromTerm));
        sb.append(',');
        sb.append("bldgDesc");
        sb.append('=');
        sb.append(((this.bldgDesc == null)?"<null>":this.bldgDesc));
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
        result = ((result* 31)+((this.bcatDesc == null)? 0 :this.bcatDesc.hashCode()));
        result = ((result* 31)+((this.hapsDate == null)? 0 :this.hapsDate.hashCode()));
        result = ((result* 31)+((this.hapsCode == null)? 0 :this.hapsCode.hashCode()));
        result = ((result* 31)+((this.mrcdCode == null)? 0 :this.mrcdCode.hashCode()));
        result = ((result* 31)+((this.preferedRoom == null)? 0 :this.preferedRoom.hashCode()));
        result = ((result* 31)+((this.rmapArtpDesc == null)? 0 :this.rmapArtpDesc.hashCode()));
        result = ((result* 31)+((this.roomDesc == null)? 0 :this.roomDesc.hashCode()));
        result = ((result* 31)+((this.campDesc == null)? 0 :this.campDesc.hashCode()));
        result = ((result* 31)+((this.preferedCampCode == null)? 0 :this.preferedCampCode.hashCode()));
        result = ((result* 31)+((this.rmapSex == null)? 0 :this.rmapSex.hashCode()));
        result = ((result* 31)+((this.addDate == null)? 0 :this.addDate.hashCode()));
        result = ((result* 31)+((this.preferedBcatCode == null)? 0 :this.preferedBcatCode.hashCode()));
        result = ((result* 31)+((this.applPriority == null)? 0 :this.applPriority.hashCode()));
        result = ((result* 31)+((this.artpCode == null)? 0 :this.artpCode.hashCode()));
        result = ((result* 31)+((this.preferedBuilding == null)? 0 :this.preferedBuilding.hashCode()));
        result = ((result* 31)+((this.toTerm == null)? 0 :this.toTerm.hashCode()));
        result = ((result* 31)+((this.rmapHapsDesc == null)? 0 :this.rmapHapsDesc.hashCode()));
        result = ((result* 31)+((this.rmapMrcdDesc == null)? 0 :this.rmapMrcdDesc.hashCode()));
        result = ((result* 31)+((this.fromTerm == null)? 0 :this.fromTerm.hashCode()));
        result = ((result* 31)+((this.bldgDesc == null)? 0 :this.bldgDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DormRoomAndMealApplication100GetResponse) == false) {
            return false;
        }
        DormRoomAndMealApplication100GetResponse rhs = ((DormRoomAndMealApplication100GetResponse) other);
        return ((((((((((((((((((((((this.bcatDesc == rhs.bcatDesc)||((this.bcatDesc!= null)&&this.bcatDesc.equals(rhs.bcatDesc)))&&((this.hapsDate == rhs.hapsDate)||((this.hapsDate!= null)&&this.hapsDate.equals(rhs.hapsDate))))&&((this.hapsCode == rhs.hapsCode)||((this.hapsCode!= null)&&this.hapsCode.equals(rhs.hapsCode))))&&((this.mrcdCode == rhs.mrcdCode)||((this.mrcdCode!= null)&&this.mrcdCode.equals(rhs.mrcdCode))))&&((this.preferedRoom == rhs.preferedRoom)||((this.preferedRoom!= null)&&this.preferedRoom.equals(rhs.preferedRoom))))&&((this.rmapArtpDesc == rhs.rmapArtpDesc)||((this.rmapArtpDesc!= null)&&this.rmapArtpDesc.equals(rhs.rmapArtpDesc))))&&((this.roomDesc == rhs.roomDesc)||((this.roomDesc!= null)&&this.roomDesc.equals(rhs.roomDesc))))&&((this.campDesc == rhs.campDesc)||((this.campDesc!= null)&&this.campDesc.equals(rhs.campDesc))))&&((this.preferedCampCode == rhs.preferedCampCode)||((this.preferedCampCode!= null)&&this.preferedCampCode.equals(rhs.preferedCampCode))))&&((this.rmapSex == rhs.rmapSex)||((this.rmapSex!= null)&&this.rmapSex.equals(rhs.rmapSex))))&&((this.addDate == rhs.addDate)||((this.addDate!= null)&&this.addDate.equals(rhs.addDate))))&&((this.preferedBcatCode == rhs.preferedBcatCode)||((this.preferedBcatCode!= null)&&this.preferedBcatCode.equals(rhs.preferedBcatCode))))&&((this.applPriority == rhs.applPriority)||((this.applPriority!= null)&&this.applPriority.equals(rhs.applPriority))))&&((this.artpCode == rhs.artpCode)||((this.artpCode!= null)&&this.artpCode.equals(rhs.artpCode))))&&((this.preferedBuilding == rhs.preferedBuilding)||((this.preferedBuilding!= null)&&this.preferedBuilding.equals(rhs.preferedBuilding))))&&((this.toTerm == rhs.toTerm)||((this.toTerm!= null)&&this.toTerm.equals(rhs.toTerm))))&&((this.rmapHapsDesc == rhs.rmapHapsDesc)||((this.rmapHapsDesc!= null)&&this.rmapHapsDesc.equals(rhs.rmapHapsDesc))))&&((this.rmapMrcdDesc == rhs.rmapMrcdDesc)||((this.rmapMrcdDesc!= null)&&this.rmapMrcdDesc.equals(rhs.rmapMrcdDesc))))&&((this.fromTerm == rhs.fromTerm)||((this.fromTerm!= null)&&this.fromTerm.equals(rhs.fromTerm))))&&((this.bldgDesc == rhs.bldgDesc)||((this.bldgDesc!= null)&&this.bldgDesc.equals(rhs.bldgDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
