package com.ripan.learnprojectlombok;

import lombok.Cleanup;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @Cleanup
 * It ensures that given resource automatically cleaned up before leaving the current scope.
 * this annotation works by harnessing the try-with-resources statement
 */
public class CleanupExample {

    public static void main(String[] args) throws FileNotFoundException {

        @Cleanup
        FileInputStream fileInputStream = new FileInputStream(args[0]);

        @Cleanup
        FileOutputStream fileOutputStream = new FileOutputStream(args[1]);

        // rest of the logic.

        // with @Cleanup all the resource will be cleaned, we do not need to worry about
        // closing the resources


        try(FileInputStream fis = new FileInputStream(args[2])){
            try(FileOutputStream fos = new FileOutputStream(args[3])){

                // other code.


            }catch (Exception e){
                e.getMessage();
            }
        }catch (Exception e){
            e.getMessage();
        }
    }
}

// code if we do not use @Cleanup
/*
public class CleanupExample {

    public static void main(String[] args) throws FileNotFoundException {

        try(FileInputStream fis = new FileInputStream(args[0])){
            try(FileOutputStream fos = new FileOutputStream(args[1])){

                // other code.

            }catch (Exception e){
                e.getMessage();
            }
        }catch (Exception e){
            e.getMessage();
        }
    }
}
 */



