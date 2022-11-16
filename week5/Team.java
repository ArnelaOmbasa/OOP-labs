/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week5;

/*
 */import java.util.ArrayList;
public class Team {
    private final  ArrayList<Player>players;
    private final String name;
    private int maxSize;
    public Team(String name){
        this.name=name;
        this.maxSize=16;
        this.players=new ArrayList<>();
    }
    public String getName()
    {
        return this.name;
    }
    public void addPlayer(Player player){
        if(this.players.size()<maxSize)
        this.players.add(player);
    }
    public void printPlayer(Player player){
        for(Player players:this.players){
            System.out.println(players);
            
        }
 }
     public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }

    public int size(){
        return this.players.size();
    }
    public int getTotalGoals(){
        int totalGoals=0;
        for (Player player:this.players){
            totalGoals+=player.getGoals();
            
        }
        return totalGoals;
  }
}


    
    

    
