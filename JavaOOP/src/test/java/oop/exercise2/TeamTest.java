package oop.exercise2;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TeamTest {

    @Test
    public void given_aPlayerList_when_itsValid_then_returnTheirNamesList() {
        Team team = new Team("Team1");
        List<Player> playerList = Arrays.asList(
                new Player("Player1","Team1"),
                new Player("Player2","Team1"),
                new Player("Player3","Team1"));
        team.setPlayersList(playerList);
        List<String> playerNameListExpected = Arrays.asList("Player1", "Player2", "Player3");
        List<String> playerNameListActual = team.showPlayersNameList();
        Assert.assertEquals(playerNameListExpected, playerNameListActual);
    }

    @Test(expected = NullPointerException.class)
    public void given_aTeamList_when_itsNull_then_throwNullPointerException() {
        Team team = new Team("Team1");
        List<Player> playerList = new ArrayList<>();
        team.setPlayersList(playerList);
        team.showPlayersNameList();
    }
}