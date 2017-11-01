//: initialization/Overloading.java
// Demonstration of both constructor
// and ordinary method overloading.

import static com.sun.deploy.trace.Trace.print;

/** Tree class description */
class Tree {
    /** Tree height */
    int height;
    /** Default tree constructor */
    Tree() {
        print("Planting a seedling");
        height = 0;
    }
    /** Parametrized tree constructor
     * @param initialHeight define initial tree height
     */
    Tree(int initialHeight) {
        height = initialHeight;
        print("Creating new Tree that is " +
                height + " feet tall");
    }
    /** Print tree info */
    void info() {
        print("Tree is " + height + " feet tall");
    }
    /** Print tree info with string in beginning
     * @param s String to print in the beginning
     */
    void info(String s) {
        print(s + ": Tree is " + height + " feet tall");
    }
}
/** Class to demonstrate overloading*/
public class Ex16 {
    /** Program entry point
     * @param args cmd line arguments
     */
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("overloaded method");
        }
        // Overloaded constructor:
        new Tree();
    }
}