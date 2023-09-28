
/*********************************************************************


 There’s still one little flaw in our code.  It compiles and runs, but the output isn’t 100% perfect. See if you can spot the flaw and fix it.


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
 } // end class
 There’s still one little flaw in our code.  It compiles and runs, but the output isn’t 100% perfect. See if you can spot the flaw and fix it.



 Old code:
 System.out.println("There'll be no green bottles, hanging on the wall");

 New code:
 System.out.println("There'll be no green bottles hanging on the wall");

 10 green bottles, hanging on the wall
 10 green bottles, hanging on the wall
 And if one green bottle should accidentally fall,
 There'll be 9 green bottles, hanging on the wall

 9 green bottles, hanging on the wall
 9 green bottles, hanging on the wall
 And if one green bottle should accidentally fall,
 There'll be 8 green bottles, hanging on the wall

 ...

 2 green bottles, hanging on the wall
 2 green bottles, hanging on the wall
 And if one green bottle should accidentally fall,
 There'll be 1 green bottle, hanging on the wall

 1 green bottle, hanging on the wall
 1 green bottle, hanging on the wall
 And if one green bottle should accidentally fall,
 There'll be no green bottles hanging on the wall
 ***********************************************************************/

package Chapter1;

public class BottleSong {
    public static void main(String[] args) {
        int bottlesNum = 10;
        String word = "bottles";

        while (bottlesNum > 0) {

            System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
            System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
            System.out.println("And if one green bottle should accidentally fall,");
            bottlesNum = bottlesNum - 1;


            if (bottlesNum == 1) {
                word = "bottle"; // singular, as in ONE bottle.
                System.out.println("There'll be " + bottlesNum +
                        " green " + word + ", hanging on the wall");
            }
            if (bottlesNum > 0) {
                System.out.println("There'll be " + bottlesNum +
                        " green " + word + ", hanging on the wall");
            } else {
                System.out.println("There'll be no green bottles, hanging on the wall");
            } // end else
        } // end while loop
    } // end main method
} // end class



