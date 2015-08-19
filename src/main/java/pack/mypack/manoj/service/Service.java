package pack.mypack.manoj.service;

import java.util.List;

public interface Service<E> {
	
	E save(E entity);
	E get(Object object);
	List<E> list();
	E update(E entity);
	E delete(E entity);

}
