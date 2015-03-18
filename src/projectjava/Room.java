/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectjava;

import java.util.ArrayList;
import java.util.HashMap;

public class Room {
    
    HashMap <String, ArrayList<String>> hashMapRoom = new HashMap <String, ArrayList<String>>();
    
    
        public void CreateHashMappingRoom()
    {
        ArrayList<String> room1 = new ArrayList<String>();
        room1.add("go east");
        room1.add("go west");
        room1.add("go south");
        
        ArrayList<String> room2 = new ArrayList<String>();
        room2.add("go north");
        room2.add("go west");
        room2.add("go south");
        
        ArrayList<String> room3 = new ArrayList<String>();
        room3.add("go east");
        room3.add("go north");
        room3.add("go south");
        
        hashMapRoom.put("Room1",room1);
        hashMapRoom.put("Room2",room2);
        hashMapRoom.put("Room3",room3);
      
    }
         public Boolean CheckingHashMapping(String text) 
         {
             boolean k;
             k=hashMapRoom.containsValue(text);
             return k;
         }
}
