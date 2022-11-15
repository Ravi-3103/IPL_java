package com.ipl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static ArrayList<Match> getMatchesData(String filepath) {
        String sep=",";
        String line="";
        ArrayList<Match> matches=new ArrayList<>();
        try {
            BufferedReader Reader = new BufferedReader(new FileReader(filepath));

            line= Reader.readLine();
            while((line= Reader.readLine())!=null){
                String []data=line.split(sep);

                if(data.length==18){
                    data[14]=data[14]+data[15];
                    data[15]=data[16];
                    data[16]=data[17];
                }
                if(data.length==15) matches.add(new Match(Integer.parseInt(data[0]),Integer.parseInt(data[1]),data[2],data[3],data[4],data[5],data[6],data[7],data[8],Integer.parseInt(data[9]),data[10],Integer.parseInt(data[11]),Integer.parseInt(data[12]),data[13],data[14],null,null));
                else matches.add(new Match(Integer.parseInt(data[0]),Integer.parseInt(data[1]),data[2],data[3],data[4],data[5],data[6],data[7],data[8],Integer.parseInt(data[9]),data[10],Integer.parseInt(data[11]),Integer.parseInt(data[12]),data[13],data[14],data[15],data[16]));
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        return matches;
    }
    private static ArrayList<Delivery> getDeliveriesData(String filepath) {
        String sep=",";
        String line="";
        ArrayList<Delivery> deliveries=new ArrayList<>();
        try {
            BufferedReader Reader = new BufferedReader(new FileReader(filepath));

            line = Reader.readLine();
            while ((line = Reader.readLine()) != null) {
                String[] data = line.split(sep);

            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
     return deliveries;
    }
    public static HashMap<Integer,Integer> findMatchesPlayedPerYear(ArrayList<Match> al){
        HashMap<Integer,Integer> matchesperyear=new HashMap<>();
        for(Match a:al){

            if(matchesperyear.containsKey(a.getSeason())) matchesperyear.put(a.getSeason(),matchesperyear.get(a.getSeason())+1);
            else matchesperyear.put(a.getSeason(),1);
        }
        return matchesperyear;
    }
    public static HashMap<String,Integer> findNumberOfMatchesWonByTeam(ArrayList<Match> al){
        HashMap<String,Integer> won=new HashMap<>();
        for(Match a:al){
            if(a.getResult().equals("no result")) continue;
            if(won.containsKey(a.getWinner())) won.put(a.getWinner(),won.get(a.getWinner())+1);
            else won.put(a.getWinner(),1);
        }
        return won;
    }
    public static void main(String[] args) {
        ArrayList<Match> matches=getMatchesData("/home/ravi/IdeaProjects/IPL_Dataset_Java/Resources/matches.csv");
        HashMap<Integer,Integer> matchesperyear=findMatchesPlayedPerYear(matches);
        HashMap<String,Integer> matcheswonbyteam=findNumberOfMatchesWonByTeam(matches);
        ArrayList<Delivery> deliveries=getDeliveriesData("/home/ravi/IdeaProjects/IPL_Dataset_Java/Resources/deliveries.csv");
    }
}
