/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectjava;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;
/**
 *
 * @author Αέναος
 */
public class ZorkRoom {
    private String description;
    private HashMap exits;        // stores exits of this room.
  
    /**
     * Define the exits of this room.  Every direction either leads to
     * another room or is null (no exit there).
     */
    public void setExits(ZorkRoom north, ZorkRoom east, ZorkRoom south, ZorkRoom west) 
    {
        
        if(north != null)
            exits.put("north", north);
        if(east != null)
            exits.put("east", east);
        if(south != null)
            exits.put("south", south);
        if(west != null)
            exits.put("west", west);
        
    }
    
    public HashMap getExits(){
            return exits;
    }
    /**
     * Return the description of the room (the one that was defined in the
     * constructor).
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * Return a string describing the room's exits, for example
     * "Exits: north west ".
     */
    private String exitString()
    {
        String returnString = "Exits:";
		Set keys = exits.keySet();
        for(Iterator iter = keys.iterator(); iter.hasNext(); )
            returnString += " " + iter.next();
        return returnString;
    }

    /**
     * Return the room that is reached if we go from this room in direction
     * "direction". If there is no room in that direction, return null.
     */
      public ZorkRoom nextRoom(String direction) 
    {
        return (ZorkRoom)exits.get(direction);
    }
    
}
