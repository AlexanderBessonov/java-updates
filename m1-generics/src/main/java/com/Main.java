package com;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> items = new ArrayList<Integer>();  //ArrayList only accepts objects belongs to Integer class
              //Diamond
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
      // items.add("Apple");

        printDoubled(items);

        String abc = "ozzy";
        //printDoubled(abc);// red
        System.out.println("______________________________________________________-");

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team <SoccerPlayer>liverpool = new Team("Liverpool");//Team accepting any objects
      //  liverpool.addPlayer(joe);
      //  liverpool.addPlayer(pat);
        liverpool.addPlayer(beckham);

       // Team<String> brokenTeam = new Team<>("what king of team is this?");// red
        //
      //  Team<Integer> t2 = new Team<>("very weird");//red
        //

    }



    private static void printDoubled(ArrayList<Integer> items) {
       // for(Object i : items){
      //      System.out.println((Integer) i*2);
     //   }
        for(int i : items){
            System.out.println( i*2);
        }
    }
}
