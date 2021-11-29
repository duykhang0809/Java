package oop.exercise2;

import util.Validator;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    List<Team> teamList = new ArrayList<>();
    List<Player> playerList = null;

    public void action() {
        System.out.println("Enter school name:");
        String schoolName = Validator.inputTypeString();
        School school = new School(schoolName);
        school.setTeamList(teamList);

        int schoolSelection;

        while (true) {
            do {
                schoolMenuView(school);
                System.out.println("Enter your choice:");
                schoolSelection = Validator.inputTypeInt();
                switch (schoolSelection) {
                    case 1: {
                        if (teamList.size() == 0) {
                            System.out.println("There is no team in list! Please add more new teams");
                            break;
                        } else {
                            System.out.println("List teams in school: " + school.showTeamNameList());
                            System.out.println("Enter team you want to choose:");
                            String teamName = Validator.inputTypeString();
                            if (!teamList.contains(new Team(teamName))) {
                                System.out.println("Please enter correctly the name of team you want to choose in list");
                                break;
                            }
                            for (int i = 0; i < teamList.size(); i++) {
                                Team team = teamList.get(i);
                                if (teamName.equals(team.getTeamName())) {
                                    int teamSelection;
                                    while (true) {
                                        do {
                                           teamMenuView(team);
                                            System.out.println("Enter your choice:");
                                            teamSelection = Validator.inputTypeInt();
                                            switch (teamSelection) {
                                                case 1: {
                                                    if (team.getPlayersList().size() == 0) {
                                                        System.out.println("There is no player in list! Please add more new players");
                                                        break;
                                                    } else {
                                                        System.out.println(team.showPlayersNameList());
                                                        break;
                                                    }
                                                }
                                                case 2: {
                                                    System.out.println("Enter player name:");
                                                    String playerName = Validator.inputTypeString();
                                                    Player player = new Player(playerName, team.getTeamName());
                                                    team.getPlayersList().add(player);
                                                    break;
                                                }
                                            }
                                        } while (teamSelection != 3);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    break;
                    case 2: {
                        System.out.println("Enter team name:");
                        String teamName = Validator.inputTypeString();
                        Team team = new Team(teamName);
                        playerList = new ArrayList<>();
                        team.setPlayersList(playerList);
                        teamList.add(team);
                    }
                    break;

                }
            } while (schoolSelection != 3);
            break;
        }
    }

    void schoolMenuView(School school){
        System.out.println("School name: " + school.getSchoolName());
        System.out.println("1.List teams in school");
        System.out.println("2.Add new team");
        System.out.println("3.Exit");
    }

    void teamMenuView(Team team){
        System.out.println("Team name: " + team.getTeamName());
        System.out.println("1.List players in team");
        System.out.println("2.Add new player");
        System.out.println("3.Back");
    }

}
