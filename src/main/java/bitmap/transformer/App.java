/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package bitmap.transformer;

import java.awt.image.BufferedImage;
import java.util.Scanner;

public class App {


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String userInput = in.nextLine();

        BitMap bitMap = new BitMap(args[0]);
        while(args.length > 0){
            if(userInput == "invert"){
                bitMap.invert();
            }
        }
    }




}
