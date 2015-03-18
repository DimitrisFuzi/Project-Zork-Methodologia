/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textbasedadventure;

/**
 *
 * @author Αέναος
 */
public class RoomTraveler {

    public void switchRooms(String command, IZorkRoom currentRoom) {
        currentRoom = (IZorkRoom) currentRoom.getExits().get(command);
        System.out.println(currentRoom.getDescription());
    }

}
