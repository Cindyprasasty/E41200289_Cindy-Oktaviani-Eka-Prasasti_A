/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;
/**
 *
 * @author HP
 */
public class managingpeople {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person p1 = new Person("Cindy", 37);
        Person p2 = new Person("Farah", 15);
    
        if (p1.getAge() == p2.getAge()){
        
           System.out.println(p1.getName() + " is the same age as " + p2.getName());
        } else {
           System.out.println(p1.getName() + " is NOT the same age as " + p2.getName());
        }
    }
    
}
