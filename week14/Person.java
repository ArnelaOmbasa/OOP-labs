/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week14;

/**
 *
 * @author dzeli
 */
public class Person {
    private String name;
    private Education title;
	
    public Person(String name, Education title) {
        this.name = name;
	this.title = title;
    }
	
    @Override
    public String toString(){
        return this.name + ", " + this.title;
    }
	
    public Education getEducation() {
        return this.title;
    }
    
}
