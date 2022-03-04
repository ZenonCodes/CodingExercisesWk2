import java.util.Arrays;

public class Solution {


  /**
   *
   *
   *

   *
   * // Vera
   * // Find and print the smallest integer in an array
   *
   *
   * Int [a] = [9, 5, 6, 3, 8, 2, 4];
   *
   *
   * //For faster Time complexity call sort first from least to greatest then choose first element. (Don’t remember code from top of head)
   *
   * Int minInt = 0;
   *
   * For (int i = 0; i < a.length; i++)
   * {
   * For (int j = i + 1; j < a.length; j++)
   * {
   * 	minInt = Math.min(a[i],a[j]);
   * }
   * }
   * System.out.println(minInt);
   * Int min = a[0];
   * For (int s : a) {
   * If (s < min){
   * Min = s;
   * System.out.println(min);
   * }
   *
   *
   * Int minInt = infinity
   *
   * For (int i = 0; i < a.length; i ++) {
   *  If (array[i] < minInt) {
   *    minInt = a[i]
   * }
   * }
   * System.out.println(minInt);
   *
   *
   *
   * Allen
   *
   * Int min = a[0]
   * Int max = a[0]
   *
   * For (i = 1; i < a.length; i++){
   *        if(max<a[i]){
   *               max=a[i];
   *     }
   * }
   * 	System.out.println(max);
   * Yay!
   * // Find and print index of first true element in an array of booleans a = [false, false, false, true, false];
   * Vera
   *
   *
   *
   * For (i = 0; i < a.length; i++) {
   * if (a[i]== true){
   * system.out.println(i);
   *    break;
   * }
   * }
   *
   *
   *
   * // divide each element of an array by 1.3; a = [0.5, 1.4, 6.7, 123.4 -34.6]
   *
   *
   * For (double s : a) {
   *        s = (s/1.3);
   * }
   * System.out.println(Arrays.toString(a)); (print not needed)
   * }
   */
  public static void soln1() {
    //Mike
    int step = 5;
    for (int i = 100;  i >=step; i-= step) {
    System.out.println(i);
   }

  }

  public static void soln2() {
    //Mike
    int step = 5;
    for (int i = 100;  i >=step; i-= step) {
    }
  }

  public static void soln3() {
    int sum = 0;
   for (int i = 9; i < 18; i ++) {
    sum+= i;
    }
    System.out.println(sum);
  }

  public static void soln4() {
    // Vera
   // Find and print the smallest integer in an array

    int [] a = {9, 5, 6, 3, 8, 2, 4};

    int minInt = a[0];

    for (int i = 1; i < a.length; i++){
      minInt = Math.min(minInt,a[i]);
    }
    System.out.println(minInt);
      }

//  public static void soln5() {
//    Allen
//            *
//    Int min = a[0]
//            * Int max = a[0]
//            *
//    for (i = 1; i < a.length; i++){
//           if(max<a[i]){
//                  max=a[i];
//        }
//    }
//    	System.out.println(max);
//     }

  public static void soln6() {
  // and put your code here.
  }

  public static void soln7() {
    boolean[] a = {true, false, false, true, false};
    int i = 0;

    while (i < a.length) {
      if (a[i] == true) {
        System.out.println(i);
        break;
      }
      i++;
    }
  }

  public static void soln8() {
    int[] a = {9, 5, 6, 3, 8, 2, 4};
    for (int i = 0; i < a.length; i++) {
      a[i] = a[i] + 5;

    }
    System.out.println(Arrays.toString(a));
   }


  public static void soln9() {
    double[] a = {0.5, 1.4, 6.7, 123.4 -34.6};
    for (int i = 0; i < a.length; i++) {
      a[i] = a[i] + 5;
    }
    System.out.println(Arrays.toString(a));
  }

  public static void soln10() {
  // and put your code here.
  }

  public static void soln11 () {
    int[][] fourBySix = new int [4][6];
    for (int i = 0; i < 4; i++){
      for (int j = 0; j < 6; j++){
        fourBySix[i][j] = 0;
      }
    }
    System.out.println(Arrays.deepToString(fourBySix));

  }

  public static void soln12() {
  // and put your code here.
  }

  public static void soln13() {
  // and put your code here.
  }

  public static void soln14() {
  // and put your code here.
  }

  public static void soln15() {
  // and put your code here.
  }

  public static void soln16() {
  // and put your code here.
  }

  public static void soln17() {
  // and put your code here.
  }

  public static void soln18() {
  // and put your code here.
  }

  public static void soln19() {
  // and put your code here.
  }

  public static void soln20() {
  // and put your code here.
  }

  public static void soln21() {
  // and put your code here.
  }

  public static void soln22() {
  // and put your code here.
  }

  public static void main(String[] args){
    Solution.soln9();
    Solution.soln11();



  }
  
}
