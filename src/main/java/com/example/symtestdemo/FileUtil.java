package com.example.symtestdemo;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileUtil {

    public static void saveBytesToFile(byte[] data, String filePath) throws IOException {
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream(filePath);
            fos.write(data);
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
