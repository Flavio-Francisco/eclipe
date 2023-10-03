package bst;

//import Math
import java.lang.Math;

public class Calc{
    public int soma(int a, int b){
        return a + b;
    }

    public int sub(int a, int b){
        return a - b;
    }

    public double mult(int a, int b){
        return a * b;
    }

    public double div(int a, int b){
        return a/b;
    }

    public int potenciacao(int a, int potencia){
        return (int) Math.pow(a, potencia);
    }

    public double raiz(int a){
        return Math.sqrt(a);
    }


    // outros methods
    public String parImpar(int a){
        if(a % 2 == 0){
            return "par";
        }else{
            return "impar";
        }
    }

    public boolean isNullouVazio(String s){
        if(s == null || s.equals("")){
            return true;
        }else{
            return false;
        }
    }

    public int subtracao(int x, int y) {
        return 0;
    }
}