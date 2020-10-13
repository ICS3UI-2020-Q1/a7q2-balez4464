/**
 *This program uses a method to find out the facogrs of a given number
 * @author Zachary Balean
 */
public class Main {

  //method for finding factors
  public static void factors(int numberToBeDivided){
    //creates variable for answers
    int answer = 0;
    //for loop to divide by factors
    for(int i = 1; i <= numberToBeDivided; i++){
      answer = numberToBeDivided % i;
      //prints if a factor
      if(answer == 0){
        //prints factors
        System.out.println(i);
      }
    }
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // calls on method
    factors(10);
    
  }
}
