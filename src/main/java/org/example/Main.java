package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println(fizzBuzz(500));
        System.out.println(reverse("мэйк инстал"));
        System.out.println(discriminant(1, -2, -3));
        System.out.println(seriesSum());
        System.out.println(palindrome("ппррпп"));

        List<String> roots = discriminant(1, -2, 1);
        if (roots == null) {
            System.out.println("No roots");
        } else {
            System.out.println(roots);
        }
    }

    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 7 == 0 && i % 3 == 0) {
                result.add("физбаз");
            } else if (i % 5 == 0) {
                result.add("физ");
            } else if (i % 7 == 0) {
                result.add("баз");
            } else {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }

    public static String reverse(String input) {
        char[] chars = input.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            sb.append(chars[i]);
        }
        return sb.toString();
    }

    public static List<String> discriminant(double a, double b, double c) {
        List<String> result = new ArrayList<>();
        double determinant = Math.pow(b, 2) - 4 * a * c;

        if (determinant > 0) {
            double x1 = (-b + Math.sqrt(determinant)) / (2 * a);
            double x2 = (-b - Math.sqrt(determinant)) / (2 * a);

            result.add(String.valueOf(x1));
            result.add(String.valueOf(x2));
        } else if (determinant == 0) {
            double x = -b / (2 * a);
            result.add(String.valueOf(x));
        } else {
            result = null;
        }

        return result;
    }

    public static double seriesSum() {
        int n = 2;
        double sum = 0;
        double currentTerm = 1.0 / (n * n + n - 2);

        while (currentTerm > Math.pow(10, -6)) {
            sum += currentTerm;
            n++;
            currentTerm = 1.0 / (n * n + n - 2);
        }

        return sum;
    }

    public static boolean palindrome(String input) {
        char[] chars = input.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            sb.append(chars[i]);
        }
        return input.contentEquals(sb);
    }
}
