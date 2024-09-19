package models;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
public class Case {
    @SerializedName(value = "case_id")
    @EqualsAndHashCode.Exclude
    private int caseId;
    @SerializedName(value = "section_id")
    @JsonProperty("section_id")
    private int sectionId;
    private String title;
    @SerializedName(value = "template_id")
    @JsonProperty("template_id")
    private int templateId;
    @SerializedName(value = "type_id")
    @JsonProperty("type_id")
    private int typeId;
    @SerializedName(value = "priority_id")
    @JsonProperty("priority_id")
    private int priorityId;
    private String estimate;
    @SerializedName(value = "milestone_id")
    private int milestoneId;
    private String refs;
}

