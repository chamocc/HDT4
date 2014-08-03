/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel Gerencas 13158
 * @author Edgar Chamo 13083
 */
import java.util.Scanner;

public class ListFactory<E> {
    
    /**
     * Metodo que devuelve la implementación de Lista deseada según un dato que ingrese el usuario
     * @return devuelve una nueva instancia de la lista deseada
     */
    public List getList(){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese Implementacion de lista: \n0: Simple\n1: Doble\n2: Circular\n");
        int param=entrada.nextInt();
        entrada.nextLine();
        switch (param){
            case 0:
                return new ListEncadenada();
            case 1:
                return new ListDoble();
            case 2:
                return new ListCircular();
        }
        return null;
    }
    
}
