/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author mariyam
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
       System.out.println("print the no");
       Scanner sc = new Scanner(System.in);
       int no= sc.nextInt();
       Socket s = new Socket("127.1.1",8009);
       PrintStream p = new PrintStream(s.getOutputStream());
      p. println(no);
      Scanner scr = new Scanner(s.getInputStream());
      int res = scr.nextInt();
      System.out.println(res);
      
       
       
       
    }
    
}
