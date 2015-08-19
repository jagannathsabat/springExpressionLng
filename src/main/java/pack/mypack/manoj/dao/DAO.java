package pack.mypack.manoj.dao;

import java.util.List;

public interface DAO<E> {
	
	E save(E entity);
	
	E get(E entity);
	List<E> list();
	
	E update(E entity);
	
	E delete(E entity);

}
