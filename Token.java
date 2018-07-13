/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gadjou
 */
public class Token {
     public static final int INVALID = 0;
    public static final int EOF     = -1;

    public String   text;
    public int      type;

    public Token (int type, String text) {
        this.type = type;
        this.text = text;
    }

    public String toString () {
        return "[" + text + ":" + type + "]";
    }
    
}
