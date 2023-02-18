package advancepractise.advancepractiseday13;

import java.util.*;

public class Aile {
    private Map<String,String> adSoyad = new HashMap<>();
    private List<String> kardeslerList = new ArrayList<>();
    private Map<Integer,List<String>> yasKardesler = new HashMap<>();
    private Map<Map<String,String>,Map<Integer, List<String>>> aileMap = new HashMap<>();

    public Aile(String ad,String soyAd,int yas,String... kardesler){

        adSoyad.put(ad,soyAd);

        kardeslerList.addAll(Arrays.asList(kardesler));

        yasKardesler.put(yas,kardeslerList);

        aileMap.put(adSoyad,yasKardesler);


    }

    public Aile(Map<String, String> adSoyad, List<String> kardeslerList, Map<Integer, List<String>> yasKardesler, Map<Map<String, String>, Map<Integer, List<String>>> aileMap) {
        this.adSoyad = adSoyad;
        this.kardeslerList = kardeslerList;
        this.yasKardesler = yasKardesler;
        this.aileMap = aileMap;
    }

    public Map<Map<String, String>, Map<Integer, List<String>>> getAileMap() {
        return aileMap;
    }

    @Override
    public String toString() {
        return aileMap.toString();
    }
}
