/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.*;
import java.util.*;

/**
 *
 * @author erojasar
 */
public class Archivos {

    public static void Funcion(File archivo){
        if(archivo.isDirectory()){
            String lista[] = archivo.list();
            for(String nombre: lista){
                System.out.println(archivo.getName()+"/"+nombre);
                File subcarpetas = new File(archivo.getName()+"/"+nombre);
                //System.out.println(subcarpetas.getAbsolutePath());
                Funcion(subcarpetas);
            }
            
        }      
    }
    
    public static void scanner (File archivo) throws FileNotFoundException {
            Scanner input = new Scanner(archivo);
            int count = 0;
            while(input.hasNext()){
                if(input.hasNextInt()){
                    int word = input.nextInt();
                    System.out.println(word);
                }else{
                    String word = input.next();
                    System.out.println(word);
                }
                count++;
            }
            System.out.println("total words = " + count);
        }
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        File f = new File("x/a");
        File ff = new File ("x/w");
        System.out.println("exist returns " + f.exists());
        System.out.println("canRead returns " + f.canRead());
        System.out.println("lenght returns " + f.length());
        System.out.println("getAbolutePath returns " + f.getAbsolutePath());
        File archivo = new File("x");
        System.out.println("its an archive " + archivo.exists());
        System.out.println("its a directory " + archivo.isDirectory());
        Funcion(archivo);
        try{
            scanner(f);
        }catch(FileNotFoundException exception){
            System.out.println("No");
        }
        PrintStream out = new PrintStream(ff);
        Scanner leer = new Scanner(System.in);
        int c = leer.nextInt();
        out.print(c);
        }
    }
    

