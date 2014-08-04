/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
 */
public class CalculadoraSingleton {
    private static Calculadora INSTANCIA = null;
 
    //Constructor
    private  CalculadoraSingleton(){}
 
    /**
     * Es un metodo privado que crea una nueva instancia de la lista
     */
    private synchronized static void createInstance() {
        if (INSTANCIA == null) { 
            INSTANCIA = new Calculadora();
        }
    }
    
    /**
     * Metodo que devuelve la instancia creada, si ya era algo devuelve la creada anteriormente
     * @return la intancia que se había creado, y si no habia crea una.
     */
    public static Calculadora getInstance() {
        if (INSTANCIA == null) createInstance();
        return INSTANCIA;
    }
}
