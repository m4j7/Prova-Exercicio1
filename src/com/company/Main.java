package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.*;


public class Main {

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        List<String> numeros = new ArrayList<String>();

        System.out.println("Quantos numeros voce deseja adicionar");
        int quant = scanner.nextInt();

        for(int i = 0; i< quant; i++){
            System.out.println("digite o numero" + i);
            String nome = scanner.next();
            numeros.add(nome);

        }

        int media =  0;
        int result = 0;

        for(int j=0; j < quant; j++){

           media += Integer.valueOf(numeros.get(j));

        }

        result = media/quant;

        System.out.println("Sua media é " + result);

        Collections.sort(numeros);

        System.out.println("Sua lista ordenada é " + numeros);
        System.out.println("Seu menor numero é " + numeros.get(0));
        System.out.println("Sua maior numero é " + numeros.get(quant-1));
    }
}
