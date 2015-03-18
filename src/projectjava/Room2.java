/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectjava;
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author Αντώνης
 */
public class Room2 {

    private String description;
    private ArrayList<String> direction = new ArrayList<String>();

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDirection1() {
        direction.add("go east");
         direction.add("go west");
          direction.add("go north");
    }
    
    public void setDirection2() {
        direction.add("go north");
         direction.add("go south");
          direction.add("go east");
    }
     public void setDirection3() {
        direction.add("go south");
         direction.add("go west");

    }

    
}

