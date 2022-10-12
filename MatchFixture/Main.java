package MatchFixture;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teams teams = new Teams();

        teams.teamList.add("Galatasaray");
        teams.teamList.add("Fenerbahçe");
        teams.teamList.add("Bursaspor");
        teams.teamList.add("Beşiktaş");
        teams.teamList.add("Trabzonspor");
        teams.teamList.add("AdanaDemirspor");
        teams.teamList.add("Adanaspor");


        teams.fixturePrint();
    }
}
