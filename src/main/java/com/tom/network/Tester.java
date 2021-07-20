package com.tom.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Tester {
    public static void main(String[] args) {
        try {
            //URL url = new URL("https://pastebin.com/raw/eUhm2twM");
            URL url = new URL("https://data.taipei/api/getDatasetInfo/downloadResource?id=3e524f15-9ea7-461a-ae9f-9130b6e12840&rid=cc8ac0bd-af2d-4af3-ae10-018e3b400e0b");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            InputStream is = connection.getInputStream();
            BufferedReader in = new BufferedReader(new InputStreamReader(is));
            String line = in.readLine();
            StringBuffer json = new StringBuffer();
            while (line != null){
                //System.out.println(line);
                json.append(line);
                line = in.readLine();
            }
            System.out.println(json.toString());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
