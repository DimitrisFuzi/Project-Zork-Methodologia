/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textbasedadventure;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Αέναος
 */
public class Castle implements IZorkRoom {

    private String description;
    private HashMap exits;        // stores exits of this room.

    @Override
    public void setExits(IZorkRoom north, IZorkRoom east, IZorkRoom south, IZorkRoom west) {
        if (north != null) {
            exits.put("north", north);
        }
        if (east != null) {
            exits.put("east", east);
        }
        if (south != null) {
            exits.put("south", south);
        }
        if (west != null) {
            exits.put("west", west);
        }

    }

    @Override
    public HashMap getExits() {
        return exits;
    }

    @Override
    public void setDescription() {
        description = "You are in the castle.Vast pillars are blocking your way";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String exitString() {
        String returnString = "Exits:";
        Set keys = exits.keySet();
        for (Iterator iter = keys.iterator(); iter.hasNext();) {
            returnString += " " + iter.next();
        }
        return returnString;
    }

}
