/**
 * @author Daniel Gerendas 13158
 * @author Edgar Chamo 13083
 * @since 1/08/2014
 */
public abstract class AbstractStack<E> implements Stack<E> {
        @Override
	public boolean empty()
	// post: returns true if and only if the stack is empty
	{
		return size() == 0;
	}
}

