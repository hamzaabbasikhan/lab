/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonclass;

/**
 *
 * @author fa19-bse-099
 */
public class SingletonClass {
    
private static SingletonClass object=new SingletonClass();
static int counter=0;
private SingletonClass(){
    counter++;
}
public static SingletonClass showmessage(){
    System.out.println("Object Counter :"+counter);
    return object;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SingletonClass ob=new SingletonClass();
        SingletonClass.showmessage();
        ob=new SingletonClass();
        SingletonClass.showmessage();
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
