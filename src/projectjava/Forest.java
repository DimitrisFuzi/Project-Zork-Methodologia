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
public class Forest extends ZorkRoom {

    private String description = "You are in the forest. West of you there's a castle, and in the east there's a keep";
    private HashMap exits;        // stores exits of this room.

    @Override
    public void setExits(HashMap par) {
        
        if (par.containsKey("DeadEnd"))
            exits.put("go north",par.get("DeadEnd"));
        if (par.containsKey("Castle"))
            exits.put("go east",par.get("Castle"));
        if (par.containsKey("Keep"))
            exits.put("go west",par.get("Keep"));
    }
}
