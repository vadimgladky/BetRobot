package com.company.vadym;

import com.google.gson.*;
import java.io.*;
import java.net.*;
import java.util.Scanner;


public class Main {


    public static String jsonline;
    public static int year1, year2;
    public static int month1, month2;
    public static int day1, day2;


    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        System.out.println("DATE RANGE SELECTION:");
        System.out.println("STARTING DATE:");
        System.out.print("Please enter day (XX):");

        day1 = scan.nextInt();
        System.out.print("Please enter month (XX):");
        month1 = scan.nextInt();
        System.out.print("Please enter year (XXXX):");
        year1 = scan.nextInt();

        System.out.println("Ending DATE:");
        System.out.print("Please enter day (XX):");
        day2 = scan.nextInt();
        System.out.print("Please enter month (XX):");
        month2 = scan.nextInt();
        System.out.print("Please enter year (XXXX):");
        year2 = scan.nextInt();

        URL url = new URL("https://apifootball.com/api/?action=get_events&from="+year1+"-"+month1+"-"+day1+"&to="+year2+"-"+month2+"-"+day2+"&league_id=63&APIkey=8f6adc808ee2b39bb5dd7483ef73c4e1189b38d31a1846c5b3284719bd483706");
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        String inputLine;

        while ((inputLine = in.readLine()) != null) {
            jsonline = inputLine;
        }

        in.close();

        JsonParser parser = new JsonParser();
        JsonElement tree = parser.parse(jsonline);
        JsonArray array = tree.getAsJsonArray();
        System.out.print("~~~" );
        System.out.print("No. of matches:" );
        System.out.println(array.size());
        System.out.println("//////////////");
        System.out.println("//////////////");

        for (int i=0; i < array.size();){
            System.out.println(array.get(i));
            i++;
            System.out.println("//////////////");
        }

        //StringBuilder sb = new StringBuilder();
        //sb.append( array );
        //System.out.println(sb);

        //Response r =new Response(); // How to add exact data from json to Response method???

        }


    }
