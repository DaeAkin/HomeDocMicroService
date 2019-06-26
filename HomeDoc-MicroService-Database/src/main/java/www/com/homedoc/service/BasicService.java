package www.com.homedoc.service;

import java.util.List;

public interface BasicService<T,ID> {
	
	void insert(T t);
	
	T getById(ID id );
	
	List<T> getAll();
	
	void update(T t);
	
	void deleteAll();
	
	void deleteById(ID id);

}
