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
public interface IZorkRoom {

    /**
     * @param north
     * @param east
     * @param south
     * @param west
     */
    public void setExits(IZorkRoom north, IZorkRoom east, IZorkRoom south, IZorkRoom west);

    public HashMap getExits();

    public String getDescription();

    /**
     *
     */
    public void setDescription();

    public String exitString();
}
