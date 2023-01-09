package day19javaparctise;

import java.util.Arrays;

public class InterwievSorusu {
    public static void main(String[] args) {
        // örn Kemal Can Kuzu, Kuzu Can Kemal
        String str = "   Kemal Can Kuzu   ";

        String trs =str.replaceAll("Kemal Can Kuzu","Kuzu Can Kemal").trim();
        System.out.println(trs);

        String arr[]=str.split(" ");
        String tersString="";

        for (int i = arr.length-1; i >=0 ; i--) {
            tersString+=arr[i]+" ";


        }
        System.out.println(tersString.trim());
    }
}
