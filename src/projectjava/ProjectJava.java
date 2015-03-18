/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectjava;

/**
 *
 * @author Αντώνης
 */
public class ProjectJava {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println("Welcome!");
        
        boolean k;
        String txt;
        Actor text = new Actor();
        
        Parserr check = new Parserr();
        
        HashMaping hash = new HashMaping();
        //Room hashroom = new Room();
        Room2 room1 = new Room2();
        Room2 room2 = new Room2();
        Room2 room3 = new Room2();
        
        room1.setDescription("Forest");
        room1.setDirection1();
        
        room2.setDescription("Castle");
        room2.setDirection2();
        
        room3.setDescription("House");
        room3.setDirection3();
      //  hashroom.CreateHashMappingRoom();   //Create the HashMapRoom
        
        hash.CreateHashMapping();  //Create the HashMap
       do{
        
        text.SetLine();             // Reading the player command
        
        txt=text.getText();          //Store the scan in a string
        k=hash.CheckingHashMapping(txt);  /*  Call the CommandList method to Check if command is true
                                           *  Returns true otherwise returns false
                                           */
        check.ParserrCmdCheck(k);     //Checking the returning if is true or false to print the right message.
        
        // k=hashroom.CheckingHashMapping(txt); 
        }while(!text.getText().equals("exit"));
    }
    
} 