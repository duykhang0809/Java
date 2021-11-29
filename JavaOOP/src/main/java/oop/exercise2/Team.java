package oop.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Team implements TeamService{

    protected String teamName;
    private List<Player> playersList;

    public Team(String teamName, List<Player> playersList) {
        this.teamName = teamName;
        this.playersList = playersList;
    }

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public Team() {

    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public List<Player> getPlayersList() {
        return playersList;
    }

    public void setPlayersList(List<Player> playersList) {
        this.playersList = playersList;
    }


    @Override
    public List<String> showPlayersNameList() {
        if (playersList.size() == 0) throw new NullPointerException("There is no player in list");
        List<String> playerNameList = new ArrayList<>();
        for (int i = 0; i < playersList.size(); i++) {
            playerNameList.add(playersList.get(i).getPlayerName());
        }
        return playerNameList;
    }

    @Override
    public int getNumberOfPlayers() {
        int count = 0;
        for (int i = 0; i < playersList.size(); i++) {
            count++;
        }
        return count;
    }

}
