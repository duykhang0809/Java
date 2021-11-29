package oop.exercise2;

import java.util.ArrayList;
import java.util.List;

public class School implements SchoolService {
    protected String schoolName;
    private List<Team> teamList;

    public School(String schoolName) {
        this.schoolName = schoolName;
    }

    public School() {

    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public List<Team> getTeamList() {
        return teamList;
    }

    public void setTeamList(List<Team> teamList) {
        this.teamList = teamList;
    }

    @Override
    public void addTeam(List<Team> teamList, Team team) {
        teamList.add(team);
    }

    @Override
    public List<String> showTeamNameList() {
        if (teamList.size() == 0) throw new NullPointerException("There is no team in list");
        List<String> teamNameList = new ArrayList<>();
        for (int i = 0; i < teamList.size(); i++) {
            teamNameList.add(teamList.get(i).teamName);
        }
        return teamNameList;
    }
}
