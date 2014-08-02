/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
 */
public interface List<E> {
    
    /**
    *pre: nada
    *post: retorna la cantidad de elementos de la lista 
    */
    public int size();
    
    /**
     * pre: nada
     * post: retorna true si no existe ningún elemento en la lista
     */
    public boolean isEmpty();
    
    /**
     * pre: nada
     * post: agrega un elemento al principio de la lista
     * @param v valor a guardar
     */
    public void addFirst(E v);
    
    /**
     * pre: hay algo en la lista
     * post: retorna el primer valor de la lista sin quitarlo
     */
    public E getFirst();
    
    /**
     * pre: hay al menos un elemento en la lista
     * post: retorn y quita el ultimo elemento de la lista
     */
    public E removeFirst();
}
