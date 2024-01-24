/*
Lecture 03
London Paris
*/
public class Lecture03 {

  public static void main(String[] args) {
    System.out.println();
    System.out.println("Hello, world!");
    // SELF-CHECK PROBLEMS:
    // Note: you will need to put some of your answers inside a comments

// Put your answer for #3A here:
// A. 2 + 3 * 4 - 6
//     2 + 12 - 6
//       14 - 6
//          8

// Put your answer for #3B here:
// B. 14 / 7 * 2 + 30 / 5 + 1
//      2 * 2 + 30 / 5 + 1
//        4 + 30 / 5 + 1
//          4 + 6 + 1
//            10 + 1
//              11

// Put your answer for #3C here:
// C. (12 + 3) / 4 * 2
//       15 / 4 * 2
//         3 * 2
//           6

// Put your answer for #3D here:
// D. (238 % 10 + 3) % 7
//       (8 + 3) % 7
//          11 % 7
//            4

// Put your answer for #3E here:
// E. (18 - 7) * (43 % 10)
//       11 * (43 % 10)
//          11 * 3
//            33

// Put your answer for #3F here:
// F. 2 + 19 % 5 - (11 * (5 / 2))
//     2 + 19 % 5 - (11 * 2)
//       2 + 19 % 5 - 22
//         2 + 4 - 22
//          6 - 22
//           -16

// Put your answer for #3G here:
// G. 2 + 3 + "Mike" + 4
//      5 + "Mike" + 4
//        "5Mike" + 4
//         "5Mike4"

// Put your answer for #3H here:
// H. 2 * 3 + "2 * 3"
//      6 + "2 * 3"
//        "62 * 3"

    // Put your answer for #7 here:
    // Make sure that the code that you write here compiles and runs
    int age;
    String gender;
    double height;
    int weight;

    // Put your answer for #18 here:
    // Make sure that the code that you write here compiles and runs
    int x = 4;
    double y = (((12.3 * x - 9.1) * x + 19.3) * x - 4.6) * x + 34.2;

    // Put your answer for #21 in the static method
    // named "Exercise_21_Finish_Me" down below
    //
    // In order for the auto-graded tests to pass you MUST uncomment the next line:
    Exercise_21_Finish_Me(); // _UN_COMMENT THIS LINE!!!!

    // Put your answer for #25 here:
    // total 24
    // total 22
    // total 19
    // total 15
    // total 10

    // EXERCISES:

    // Put your answer for #4 here:
      for (int i = 0; i < 4; i++) {
          for (int j = 0; j <= i; j++) {
              System.out.print("*");
          }
          System.out.println();
      }

      System.out.println();

    // Put your answer for #5 here:
      for (int i = 1; i <= 5; i++) {
        for (int j = i; j < 5; j++) {
            System.out.print("*");
        }
        System.out.println();
      }

    // Put your answer for #6 here:
      for (int i = 0; i <= 7; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(i);
        }
        System.out.println();
      }
  }

  // In VSCode you can press Ctrl/Cmd + / to uncomment a bunch of lines at once
  // (select the lines, then Ctrl+/)
   public static void Exercise_21_Finish_Me() {
   for (int i = 1; i <= 4; i++) {
     System.out.println("2 times " + i + " = " + i * 2);
    }
   }
}
