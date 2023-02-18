package day36mapsiterators;

public class UsStatesRunner {
    public static void main(String[] args) {
        String arizonaAbbr = UsStates.ARIZONA.getAbbreviation();
        System.out.println("arizonaAbbr = " + arizonaAbbr);

        UsStates arz = UsStates.ARIZONA;
        System.out.println("arz = " + arz);
    }
}
