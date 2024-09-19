package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Milestones {
    @JsonProperty("milestone_id")
    @SerializedName("milestone_id")
    private int milestoneId;
    @JsonProperty("project_id")
    @SerializedName("project_id")
    private int projectId;
    private String name;
    private String description;
    @JsonProperty("parent_id")
    @SerializedName("parent_id")
    private int parentId;
    private String refs;

}
