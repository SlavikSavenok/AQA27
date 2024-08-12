package models;


import java.util.Objects;

public class Project {
    private String projectName;
    private String announcement;
    private boolean isShowAnnouncement;
    private int projectType;
    private boolean isEnableApprovals;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(String announcement) {
        this.announcement = announcement;
    }

    public boolean isShowAnnouncement() {
        return isShowAnnouncement;
    }

    public void setShowAnnouncement(boolean showAnnouncement) {
        isShowAnnouncement = showAnnouncement;
    }

    public int getProjectType() {
        return projectType;
    }

    public void setProjectType(int projectType) {
        this.projectType = projectType;
    }

    public boolean isEnableApprovals() {
        return isEnableApprovals;
    }

    public void setEnableApprovals(boolean enableApprovals) {
        isEnableApprovals = enableApprovals;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectName='" + projectName + '\'' +
                ", announcement='" + announcement + '\'' +
                ", isShowAnnouncement=" + isShowAnnouncement +
                ", projectType=" + projectType +
                ", isEnableApprovals=" + isEnableApprovals +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return isShowAnnouncement == project.isShowAnnouncement && projectType == project.projectType && isEnableApprovals == project.isEnableApprovals && Objects.equals(projectName, project.projectName) && Objects.equals(announcement, project.announcement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectName, announcement, isShowAnnouncement, projectType, isEnableApprovals);
    }
}
