/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
 */
public class DoubleLinkedNode<E> {
    //codigo tomado de material visto en clase
    //Aqui comienza codigo
    //=====================================================
    
    protected E data;
    protected DoubleLinkedNode<E> nextElement;
    protected DoubleLinkedNode<E> previousElement;

    public DoubleLinkedNode(E v,
                            DoubleLinkedNode<E> next,
                            DoubleLinkedNode<E> previous)
    {
        data = v;
        nextElement = next;
        if (nextElement != null)
            nextElement.previousElement = this;
        previousElement = previous;
        if (previousElement != null)
            previousElement.nextElement = this;
    }

    public DoubleLinkedNode(E v)
    // post: constructs a single element
    {
        this(v,null,null);
    }
    //=============================================================
    //Aqui termina codigo
    
    /**
     * Devuelve la referencia al siguiente valor en la lista
     * @return referencia a siguiente valor
     */
    public DoubleLinkedNode next(){
        return nextElement;
    }
    
    /**
     * devuelve referencia a valor previo
     * @return referencia a valor previo
     */
    public DoubleLinkedNode previous(){
        return previousElement;
    }
    
    /**
     * setea la referencia al siguiente valor
     * @param v referencia a siguiente valor
     */
    public void setNext(DoubleLinkedNode<E> v){
        nextElement=v;
    }
    
    /**
     * Setea el valor anterior del nodo
     * @param v referencia de valor anterior
     */
    public void setPrevious(DoubleLinkedNode<E> v){
        previousElement=v;
    }
    
    /**
     * Devuleve valor guardado en nodo
     * @return el valor guardado en nodo
     */
    public E value(){
        return data;
    }
    
    /**
     * Guarda un nuevo valor en el espcio de datos del nodo
     * @param v dato a guardar
     */
    public void setValue(E v){
        data=v;
    }
    
}
