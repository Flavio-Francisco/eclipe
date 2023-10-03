package bst;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

public class CalcTest {
    
    int[] a;

    @Before
    public void setup() {
    }

    @Test
    public void testDenini(){
        Assert.assertEquals(1,1);
    }

    @Test
    public void testMultiplicacao(){
        int x = 50;
        int y = 10;
        Calc c = new Calc();
        double resultado = c.mult(x,y);
        
        Assert.assertEquals(resultado, 500, 0.1);
    }

    @Test
    public void testNovo(){

     Calc c = new Calc();
     int a = 2;
     int b = 2;
     int resultado = c.potenciacao(a,b);
     Assert.assertEquals(resultado,4);

    }
    @Test
    public void testSubtracao(){
        int x = 50;
        int y = 10;
        Calc c = new Calc();
        double resultado = c.sub(x,y);
        
        Assert.assertEquals(resultado, 40, 0.1);
    }
    @Test
    public void testDivisao(){
        int x = 50;
        int y = 10;
        Calc c = new Calc();
        double resultado = c.div(x,y);
        
        Assert.assertEquals(resultado, 5, 0.1);
    }
    @Test
    public void testpar(){
        int x = 50;
        Calc c = new Calc();
        String resultado = c.parImpar(x);
        
        Assert.assertEquals(resultado,"par");
    }
    @Test
    public void testimpar(){
        int x = 51;
        Calc c = new Calc();
        String resultado = c.parImpar(x);
        
        Assert.assertEquals(resultado,"impar");
    }
    @Test
    public void testSomar(){
        int x = 50;
        int y = 10;
        Calc c = new Calc();
        int resultado = c.soma(x,y);
        
        Assert.assertEquals(resultado, 60)
        ;
    }
    @Test
    public void testSubtrair(){
        int x = 50;
        int y = 10;
        Calc c = new Calc();
        int resultado = c.subtracao(x,y);
        
        Assert.assertEquals(resultado, 40);
    }
    @Test
    public void testVazio(){
        String s = "";
        Calc c = new Calc();
        boolean resultado = c.isNullouVazio(s);

        Assert.assertTrue(resultado);
    }
    @Test
    public void testDivisao2(){
        int x = 50;
        int y = 10;
        Calc c = new Calc();
        double resultado = c.div(x,y);
        
        Assert.assertEquals(resultado, 5, 0.1);
    }
    
}
