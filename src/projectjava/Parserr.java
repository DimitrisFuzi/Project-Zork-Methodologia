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
public class Parserr {
        String checkText;

    public String getCheckText() {
        return this.checkText;
    }

    public void setCheckText(Actor text) {
        this.checkText = text.getText();
    }

    public void ParserrCmdCheck (Command cmdCheck)
    {
        if( "false".equals(cmdCheck.isCmdCheck()))
        {
            System.out.println("I dont know this command!");
        }
    }
}
