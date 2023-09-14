package br.senai.sp;

import java.util.Scanner;

public class app {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String [] Frutas = {"uva", "pera", "maca", "banana"};

        for (int i = 0; i < Frutas.length; i++ ){

            System.out.println("frutas" + (i+1) + ":" + Frutas[i]);

        }

        System.out.println("qual fruta deseja comprar?");
        String opcaodeUsuario = teclado.next();

        for (int i = 0; i < Frutas.length; i++){

            boolean frutaDisponivel = false;
            if (opcaodeUsuario.equals(Frutas[i])){
                System.out.println("temo este fruta");
                frutaDisponivel = true;
            }  if (!frutaDisponivel){
                System.out.println("nao temos esta fruta");
            }
        }
    }
}
