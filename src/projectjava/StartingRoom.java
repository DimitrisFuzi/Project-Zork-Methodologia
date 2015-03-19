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
public class StartingRoom extends ZorkRoom {

    private String description = "Starting Room. How to play etc...";
    private HashMap exits;        // stores exits of this room.

    @Override
    public void setExits(HashMap par) {

        if (par.containsKey("Forest")) {
            exits.put("go north", par.get("Forest"));
        }

    }
}
