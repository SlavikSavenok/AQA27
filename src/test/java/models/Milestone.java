package models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Builder
@AllArgsConstructor
@EqualsAndHashCode(exclude = "id")
public class Milestone {
    private int id;
    private String name;
    private String references;
    private String parent;
    private String description;
    private Date startDate;
    private Date endDate;
    private boolean isMilestoneIsCompleted;
}

