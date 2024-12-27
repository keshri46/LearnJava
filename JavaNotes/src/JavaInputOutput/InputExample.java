package JavaInputOutput;

import java.io.*;
import java.util.Scanner;

public class InputExample {

    static void takeInputUsingBufferedReader() throws NumberFormatException, IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        System.out.println("Input using buffered : ");
        int x = Integer.parseInt(br.readLine());
        System.out.println(x);
        br.close();

    }

    static void takeInputUsingScanner() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input using Scanner : ");
        int x = sc.nextInt();
        System.out.println(x);
        sc.close();
    }

    public static void main(String[] args) {
        try {
            takeInputUsingBufferedReader();
            // takeInputUsingScanner();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Bye");
        }
    }
}
