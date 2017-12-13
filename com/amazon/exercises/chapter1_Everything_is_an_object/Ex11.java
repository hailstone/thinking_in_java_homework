package exercises.chapter1_everything_is_an_object;

public class Ex11 {
    public static void main(String[] args) {
        AllTheColorsOfTheRainbow a = new AllTheColorsOfTheRainbow();
        System.out.println(a.anIntegerRepresentingColors);

        a.changeTheHueOfTheColor(2);
        System.out.println(a.anIntegerRepresentingColors);
    }

}

class AllTheColorsOfTheRainbow {
    int anIntegerRepresentingColors;

    void changeTheHueOfTheColor(int newHue) {
        anIntegerRepresentingColors = newHue;
    }
}