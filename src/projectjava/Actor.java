/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectjava;
import java.util.Scanner;
/**
 *
 * @author Αντώνης
 */
public class Actor {
      String text;

    public String getText() {
        return this.text;
    }
     public void SetLine(){
        Scanner scan = new Scanner(System.in);
        
        this.text = scan.nextLine().toLowerCase();
       
     }
     
}
