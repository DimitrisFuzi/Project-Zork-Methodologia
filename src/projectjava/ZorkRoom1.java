/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textbasedadventure;

import java.util.HashMap;

/**
 *
 * @author Αέναος
 */
public class ZorkRoom {
    
    private String description;
    private HashMap exits;

  
    public void setExits(HashMap par) {

    }

    public HashMap getExits() {
        return exits;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String desc) {
        description = desc;
    }

}
