
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muskan
 */
public class ser {
    
  
    public static void main(String args[]) throws IOException
    {
        ServerSocket s1=new ServerSocket(3456);
        Socket ss=s1.accept();
        Scanner sc=new Scanner(ss.getInputStream());
        int number = sc.nextInt();
        int temp = number*2;
        PrintStream p=new PrintStream(ss.getOutputStream());
        p.println(temp);
    }
}
