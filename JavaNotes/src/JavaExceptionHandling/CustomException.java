package JavaExceptionHandling;

public class CustomException extends Exception {

    private int age;

    CustomException() {
        System.out.println("Default cons called");
        age = 17;
    }

    CustomException(int age) {
        this.age = age;
        System.out.println("Parameterized cons called");
    }

    boolean checkEligibity() {
        return age >= 18;
    }
}
