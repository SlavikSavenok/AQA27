package models;


import lombok.Data;

/*@Getter
@Setter
@ToString
@EqualsAndHashCode*/

@Data
public class Project {
    private String projectName;
    private String announcement;
    private boolean isShowAnnouncement;
    private int projectType;
    private boolean isEnableApprovals;
}