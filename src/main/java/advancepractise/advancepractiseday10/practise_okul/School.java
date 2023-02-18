package advancepractise.advancepractiseday10.practise_okul;

import java.util.ArrayList;
import java.util.List;

public class School {

   private String okulAdi;
   private int maxStd;

   private List<Student> stdList = new ArrayList<>();

    public School(String okulAdi, int maxStd, List<Student> stdList) {
        this.okulAdi = okulAdi;
        this.maxStd = maxStd;
        this.stdList = stdList;
    }

    public School() {
    }

    public String getOkulAdi() {
        return okulAdi;
    }

    public void setOkulAdi(String okulAdi) {
        this.okulAdi = okulAdi;
    }

    public int getMaxStd() {
        return maxStd;
    }

    public void setMaxStd(int maxStd) {
        this.maxStd = maxStd;
    }

    public List<Student> getStdList() {
        return stdList;
    }

    public void setStdList(List<Student> stdList) {
        this.stdList = stdList;
    }
    public void addOgrenciToList(Student student){
        stdList.add(student);
    }

    @Override
    public String toString() {
        return "School{" +
                "okulAdi='" + okulAdi + '\'' +
                ", maxStd=" + maxStd +
                ", stdList=" + stdList +
                '}';
    }
}
