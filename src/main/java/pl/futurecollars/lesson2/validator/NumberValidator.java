package pl.futurecollars.lesson2.validator;

public class NumberValidator {

  public static boolean isOdd(int value) {
    if (value % 2 == 1) {
      return true;
    }
    return false;
  }

  public static boolean isEven(int value) {
    if (value % 2 == 0) {
      return true;
    }
    return false;
  }
}
