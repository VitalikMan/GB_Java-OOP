package Seminar5.HomeWork.model;

import lombok.Data;

@Data
public class StudyGroup {

    private final String groupId;
    public StudyGroup(String groupId) {
        this.groupId = groupId;
    }
}
