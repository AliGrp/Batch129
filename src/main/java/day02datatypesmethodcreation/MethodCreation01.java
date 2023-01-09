package day02datatypesmethodcreation;

public class MethodCreation01 {
    public static void main(String[] args) {

        int üçlüSonuç = firstTwoMultiplyThirdAdd (2,5,8);
        System.out.print(üçlüSonuç);

        int ikiliSonuç = areaRectangle (14,19);
        System.out.println(ikiliSonuç);

        double sayınınKüpü = numberCube(5);
        System.out.println(sayınınKüpü);

    }
    private static int firstTwoMultiplyThirdAdd (int a, int b, int c) {
        return a*b+c;
    }
    private static int areaRectangle (int a, int b) {
        return a*b;
    }

    private static double numberCube (double a) {
        return a*a;
    }
}


