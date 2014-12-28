package dk.jonlind.generics;

public class TypeImpl<T> implements Type<T> {

	@Override
	public T doStuff(T t) {
		return t;
	}

}
