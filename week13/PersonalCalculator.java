/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week13;


public class PersonalCalculator implements Calculator{
    private int value = 0; 
    
    public PersonalCalculator(){}
    
    public int giveValue() {
        return this.value;
    }
    
    public void increase(){
        this.value += 1; 
    }
    
}