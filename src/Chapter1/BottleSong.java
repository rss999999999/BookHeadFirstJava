/*There’s still one little flaw in our code.  It compiles and runs, but the output isn’t 100% perfect. See if you can spot the flaw and fix it.*/

/*package Chapter1;


public class BottleSong {
    public static void main(String[] args) {
        int bottlesNum = 10;
        String word = "bottles";

        while (bottlesNum > 0) {

            if (bottlesNum == 1) {
                word = "bottle"; // singular, as in ONE bottle.
            }

            System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
            System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
            System.out.println("And if one green bottle should accidentally fall,");
            bottlesNum = bottlesNum - 1;

            if  (bottlesNum > 0) {
                System.out.println("There'll be " + bottlesNum +
                        " green " + word + ", hanging on the wall");
            } else {
                System.out.println("There'll be no green bottles, hanging on the wall");
            } // end else
        } // end while loop
    } // end main method
} // end class*/



package Chapter1;
public class BottleSong {
    public static void main(String[] args) {
        int bottlesNum = 10;
        String word = "bottles";

        while (bottlesNum > 0) {

            if (bottlesNum == 1) {
                word = "bottle"; // singular, as in ONE bottle.
            }

            System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
            System.out.println(bottlesNum + " green " + word + ", hanging on the wall");

            if (bottlesNum == 2) {
                System.out.println("And if one green bottle should accidentally fall,");
            } else {
                System.out.println("And if " + (bottlesNum - 1) + " green bottles should accidentally fall,");
            }

            bottlesNum = bottlesNum - 1;

            if  (bottlesNum > 0) {
                System.out.println("There'll be " + bottlesNum +
                        " green " + word + ", hanging on the wall");
            } else {
                System.out.println("There'll be no green bottles, hanging on the wall");
            } // end else
        } // end while loop
    } // end main method
} // end class