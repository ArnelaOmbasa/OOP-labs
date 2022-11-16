/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

/**
 *
 * @author User-PC
 */
public class Player {
    private String name;
    private int goals;
    public Player (String name,int goal){
        this.name=name;
        this.goals=goal;
    }
    public Player(String name){
        this(name,0);
        
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGoals() {
        return this.goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }
    
     public String toString(){
        return this.name.concat(", goals ").concat(Integer.toString(this.goals));
    }
    
            
    
    
}
