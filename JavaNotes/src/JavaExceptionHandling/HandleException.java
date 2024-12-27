package JavaExceptionHandling;

class Handler {

    void usingTryCatch() {

        int[] ar = { 7, 6, 5, 4, 3, 2, 1 };
        int i = 0, j;
        String str = null;

        try {
            j = 58 / i;
            System.out.println("Length of string is : " + str.length());
            System.out.println("Element at index 7 is : " + ar[7]);
        } catch (Exception e) {
            System.out.println("Cannot divide by zero : " + e);
        }

    }

    void usingTryAndMultipleCatch() {
        int[] ar = { 7, 6, 5, 4, 3, 2, 1 };
        int i = 2, j;
        String str = null;
        try {
            j = 58 / i;
            System.out.println("Element at index 5 is : " + ar[5]);
            System.out.println("Length of string is : " + str.length());

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero : " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of limit : " + e);
        } catch (NullPointerException e) {
            System.out.println("nullifid : " + e);
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
    }

    void usingTryAndMultipleCatchAndFinally() throws CustomException {
        int[] ar = { 7, 6, 5, 4, 3, 2, 1 };
        int i = 0, j;
        String str = "";
        try {
            j = 58 / 3;
            System.out.println("J : " + j);
            System.out.println("Length of string is : " + str.length());
            System.out.println("Element at index 7 is : " + ar[7]);
            throw new CustomException();
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero : " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of limit : " + e);
        } catch (NullPointerException e) {
            System.out.println("nullifid : " + e);
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
            System.out.println("Before finally in last catch : ");
        } finally {
            System.out.println("In finally, Hope we doing good");
        }
        System.out.println("After finally : ");

    }

    void usingMisc() {

    }
}

public class HandleException {
    public static void main(String[] args) throws CustomException {
        Handler handler = new Handler();
        handler.usingTryCatch();
        handler.usingTryAndMultipleCatch();
        handler.usingTryAndMultipleCatchAndFinally();
        handler.usingMisc();
    }
}
