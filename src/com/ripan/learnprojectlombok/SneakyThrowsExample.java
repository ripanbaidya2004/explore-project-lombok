package com.ripan.learnprojectlombok;

import lombok.SneakyThrows;

import java.io.File;
import java.io.IOException;

/**
 * @SneakyThrows
 * It allows us to bypass the requirement of explicitly handling checked exception in our code.
 * with this annotation, we do not need to write try catch block or throws
 * @SneakyThrows(ExceptionType.class) we can mention the exception name here.
 * it converts the checked exception into RuntimeException invisibly.
 */

public class SneakyThrowsExample {

    /**
     * here if we do not use the @SnekyThrows, then we must explicitly handle the checked exception
     * by using try catch block or throws.
     */
    @SneakyThrows(IOException.class)
    public void creteFile(String filePath){

        File file = new File(filePath);

        if(!file.createNewFile()){
            throw new IOException("file already exist");
        }
    }
}
