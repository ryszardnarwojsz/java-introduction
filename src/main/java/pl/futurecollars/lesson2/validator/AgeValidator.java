package pl.futurecollars.lesson2.validator;

public class AgeValidator {

  public static boolean isAdult(int age) {
    if (age >= 18) {
      return true;
    }

    return false;
  }
}
