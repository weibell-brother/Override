/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package overrideexample;

/**
 *
 * @author christian.weibell
 */
public class OverrideExample {

    public static void main(String args[]){
      Animal a = new Animal(); // Animal reference and object
      Animal b = new Dog(); // Animal reference but Dog object

      a.move();// runs the method in Animal class

      b.move();//Runs the method in Dog class
   }

}
