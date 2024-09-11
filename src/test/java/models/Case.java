package models;


import com.google.gson.annotations.SerializedName;
import lombok.Data;


@Data
public class Case {
    @SerializedName(value = "case_id")
    private int caseId;
    @SerializedName(value = "section_id")
    private int sectionId;
    private String title;
    @SerializedName(value = "template_id")
    private int templateId;
    @SerializedName(value = "type_id")
    private int typeId;
    @SerializedName(value = "priority_id")
    private int priorityId;
    private int estimate;
    @SerializedName(value = "milestone_id")
    private int milestoneId;
    private String refs;
}

