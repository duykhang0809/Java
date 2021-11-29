package oop.exercise2;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SchoolTest {

    @Test
    public void given_aTeamList_when_itsValid_then_returnTheirNamesList() {
        School school = new School("School Name");
        List<Team> teamList = Arrays.asList(
                new Team("Team1"),
                new Team("Team2"),
                new Team("Team3"));
        school.setTeamList(teamList);
        List<String> teamNameListExpected = Arrays.asList("Team1", "Team2", "Team3");
        List<String> teamNameListActual = school.showTeamNameList();
        Assert.assertEquals(teamNameListExpected, teamNameListActual);
    }

    @Test(expected = NullPointerException.class)
    public void given_aTeamList_when_itsNull_then_throwNullPointerException() {
        School school = new School("School Name");
        List<Team> teamList = new ArrayList<>();
        school.setTeamList(teamList);
        school.showTeamNameList();
    }


}