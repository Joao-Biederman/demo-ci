package br.ufmg.dcc;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculadoraTest {
  @Test
  public void testeSoma1() {
    Calculadora calc = new Calculadora();
    int resultadoEsperado = 5;
    int resultadoRetornado = calc.soma(2,3);
    assertEquals(resultadoEsperado, resultadoRetornado);
  }

  @Test
  public void testeSoma2() {
    Calculadora calc = new Calculadora();
    assertEquals(10, calc.soma(4,6));
  }

  @Test
  public void testeSub1() {
    Calculadora calc = new Calculadora();
    int resultadoEsperado = 5;
    int resultadoRetornado = calc.subtrai(8,3);
    assertEquals(resultadoEsperado, resultadoRetornado);
  }

  @Test
  public void testeSub2() {
    Calculadora calc = new Calculadora();
    assertEquals(-2, calc.subtrai(3, 5));
  }
}