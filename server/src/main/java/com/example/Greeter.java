package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

 /**
  * Esta clase es de prueba
  * @author: Jhon Robert Quintero
  * @param El parámetro
  * @return El Saludo
  */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
