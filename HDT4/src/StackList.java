/**
 * @author Daniel Gerendas 13158
 * @author Edgar Chamo 13083
 * @since 1/08/2014
 */
public class StackList<E> extends AbstractStack<E> {
    //atributos
    private List<E> data;
    
    public StackList (){
        ListFactory<E> factory=new ListFactory<E>();
        data=factory.getList();
    
}

    @Override
    public void push(E item) {
        data.addFirst(item);
    }

    @Override
    public E pop() {
        return data.removeFirst();
    }

    @Override
    public E peek() {
        return data.getFirst();
    }

    @Override
    public int size() {
        return data.size();
    }
    
}
