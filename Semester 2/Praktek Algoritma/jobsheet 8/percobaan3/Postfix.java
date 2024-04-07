package percobaan3;

import java.util.Scanner;

public class Postfix {
    int n, top;
    char[] stack;

    Postfix(int total) {
        n = total;
        top = -1;
        stack = new char[n];
        push('(');
    }

    void push(char c) {
        stack[++top] = c;
    }

    char pop() {
        return stack[top--];
    }

    boolean isOperand(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '.' || c == ' '; 
    }

    boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^' || c == '%';
    }

    int derajat(char c) {
        switch (c) {
            case '^':
                return 3;
            case '%':
                return 2;
            case '/':
                return 2;
            case '*':
                return 2;
            case '+':
                return 1;
            case '-':
                return 1;
            default:
                return 0;

        }
    }

    String konversi(String Q) {
        String P = new String();
        char c;
        for (int i = 0; i < n; i++) {
            c = Q.charAt(i);
            if (isOperand(c)) {
                P += c;
            } else if (c == '(') {
                push(c);
            } else if (c == ')') {
                while (stack[top] != '(') {
                    P += pop();
                }
                pop();
            } else {
                while (derajat(c) <= derajat(stack[top])) {
                    P += pop();
                }
                push(c);
            }
        }
        return P;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P, Q;
        System.out.println("Masukkan ekspresi infix: ");
        Q = sc.nextLine();
        Q.trim();
        Q = Q + ")";

        int total = Q.length();
        Postfix postfix = new Postfix(total);
        P = postfix.konversi(Q);
        System.out.println("Ekspresi postfix: " + P);

    }
}
