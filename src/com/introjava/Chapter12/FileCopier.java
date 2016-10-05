package com.introjava.Chapter12;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;

public class FileCopier {
    public byte[] readBytesFromFile(String name) {
        byte[] data = new byte[0];
        try {
            data = Files.readAllBytes(new File(name).toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return data;
    }

    public void writeBytesToFile(String name, byte[] data) {
        FileOutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(new File(name));
            outputStream.write(data);
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
