package org.example;

public class Team {
    private String name;
    private String sport;
    private int players;
    public static int totalTeams = 0;
    public static int totalPlayers = 0;

   private int count;

   public int getCount(){
       return this.count;
   }
   public void setCount(int a){
       this.count=a;
   }
    public Team(String name, String sport, int players, int count){
       this(name,sport,players);
       this.count = count;
    }
    public static void test(){
        System.out.println("static test");
    }
    public void print(){
        System.out.println(this.getName() + " " + this.getSport()+ " " + this.getPlayers() + " "+ this.getCount());
    }
    // Team.test();
     // obj.print();
     //Team obj = new Team("t","t",0,10);





























    public Team(String name, String sport, int players) {
        this.name = name;
        this.sport = sport;
        this.players = players;

        totalTeams++;
        totalPlayers += players;
    }

    public static double getAveragePlayers() {
        if (totalTeams == 0) {
            return 0;
        }
        return (double) totalPlayers / totalTeams;
    }

    public String getName() {
        return name;
    }

    public String getSport() {
        return sport;
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {

        totalPlayers = totalPlayers - this.players + players;
        this.players = players;
    }
}
