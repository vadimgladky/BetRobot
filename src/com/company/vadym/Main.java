package com.company.vadym;

import com.google.gson.*;
import java.io.*;
import java.net.*;


public class Main {


    public static String jsonline;

    public static void main(String[] args) throws IOException {
        URL url = new URL("https://apifootball.com/api/?action=get_events&from=2018-08-07&to=2018-08-12&league_id=63&APIkey=8f6adc808ee2b39bb5dd7483ef73c4e1189b38d31a1846c5b3284719bd483706");
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        String inputLine;

        while ((inputLine = in.readLine()) != null) {
            jsonline = inputLine;
        }

        in.close();

        JsonParser parser = new JsonParser();
        JsonElement tree = parser.parse(jsonline);
        JsonArray array = tree.getAsJsonArray();
        System.out.print("No. of matches:" );
        System.out.println(array.size());
        System.out.println("//////////////");
        System.out.println(array);
        System.out.println("//////////////");

        for (int i=0; i < array.size();){
            System.out.println(array.get(i));
            i++;
            System.out.println("//////////////");
        }

        StringBuilder sb = new StringBuilder();
        sb.append( array );
        //System.out.println(sb);
        }


    }
