package exercises.chapter7_polymorphism.ex8;


import java.util.Random;

import static net.mindview.util.Print.print;

enum Note {
    MIDDLE_C, C_SHARP, B_FLAT; // Etc.
}

class Instrument {
    void play(Note n) {
        print("Instrument.play() " + n);
    }
    public String toString() {
        return "Instrument";
    }
    void adjust() {
        print("Adjusting Instrument");
    }
}

class Wind extends Instrument {
    void play(Note n) {
        print("Wind.play() " + n);
    }
    public String toString() {
        return "Wind";
    }
    void adjust() {
        print("Adjusting Wind");
    }
}

class Percussion extends Instrument {
    void play(Note n) {
        print("Percussion.play() " + n);
    }
    public String toString() {
        return "Percussion";
    }
    void adjust() {
        print("Adjusting Percussion");
    }
}

class Stringed extends Instrument {
    void play(Note n) {
        print("Stringed.play() " + n);
    }
    public String toString() {
        return "Stringed";
    }
    void adjust() {
        print("Adjusting Stringed");
    }
}

class Brass extends Wind {
    void play(Note n) {
        print("Brass.play() " + n);
    }
    void adjust() {
        print("Adjusting Brass");
    }
}

class Woodwind extends Wind {
    void play(Note n) {
        print("Woodwind.play() " + n);
    }
    public String toString() {
        return "Woodwind";
    }
}

class MyInstrument extends Instrument {
    public String toString() {
        return "myown";
    }
}

public class Music3 {
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] e) {
        for (Instrument i : e)
            System.out.println(i);
    }

    public static Instrument randGen() {
        Random rand = new Random();
        int randValue = rand.nextInt(5);
        switch (randValue) {
            case 0: return new Wind();
            case 1: return new Percussion();
            case 2: return new Stringed();
            case 3: return new Brass();
            case 4: return new MyInstrument();
            default:
                System.out.println("something went wrong, should never execute");
                return null;
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = new Instrument[5];
        for (int i = 0; i < orchestra.length; i++) {
            orchestra[i] = randGen();
        }
        tuneAll(orchestra);
    }
}
