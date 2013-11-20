package overrideexample;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author christian.weibell
 */
public class Dog extends Animal {
    
    @Override
    public void move(){
        System.out.println("Dogs can walk and run");
    }
}
