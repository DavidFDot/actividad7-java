package com.davidfb;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int atributo = 15;

        ListarPrimos(atributo);

        ListarFibonacci(atributo);
    }

    private static void ListarPrimos(int atributo) {

        int index = 0, i = 2;
        int[] primos = new int[atributo];

        while(index < primos.length) {
            if(chequearNumero(i)){
                primos[index] = i++;
                index++;
            } else {
                i++;
            }
        }

        System.out.println("Numeros Primos");
        for (int numero: primos) {
            System.out.print(numero + ", ");
        }
    }

    private static boolean chequearNumero(int numero) {
        if (numero < 1) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }


    private static void ListarFibonacci(int atributo) {
        int[] fibonacci = new int[atributo];

        for (int i = 0; i < fibonacci.length; i++) {
            fibonacci[i] = Fibonnaci(i);

        }

        System.out.println("\nSucesion de Fibonacci");
        for (int numero: fibonacci) {
            System.out.print(numero + ", ");
        }

    }

    public static int Fibonnaci(int n) {
        if ((n == 0) || (n == 1)) {
            return n;
        } else {
            return Fibonnaci(n - 1) + Fibonnaci(n - 2);
        }
    }
}
