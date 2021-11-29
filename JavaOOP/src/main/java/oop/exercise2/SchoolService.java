package oop.exercise2;

import java.util.List;

public interface SchoolService {

    public void addTeam(List<Team> teamList, Team team);

    public List<String> showTeamNameList();
}
