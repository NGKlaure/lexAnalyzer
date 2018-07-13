
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gadjou
 */
public class Prog2Main {
    
    public static void main(String [] args) throws Exception {
        System.out.println("Please copy and paste a complete dot code snippet"
              + " that ends with a $ sign:");        
			  
        DotLexer lexer = new DotLexer(new InputStreamReader(System.in));
        Token t = lexer.nextToken();
        while (Token.EOF != t.type) {
            System.out.println(t);
            t = lexer.nextToken();
        }
    }
    
}
