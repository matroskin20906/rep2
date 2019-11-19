package com.example.demo;

import org.springframework.stereotype.Service;

import java.io.*;

@Service
public class MyService {
    private String x = "D:\\Aleksander_Matrosov\\9\\demo\\src\\main\\resources\\text.txt";
    public String FileReader() {
        File f = new File(x);
        try (BufferedReader br = new BufferedReader(new FileReader(f))){
            StringBuilder builder = new StringBuilder();
            while(br.ready()) {
                builder.append(br.readLine()+"\n");
            }
            return builder.toString();
        } catch(Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
