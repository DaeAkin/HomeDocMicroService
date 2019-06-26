package www.com.homedoc.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import www.com.homedoc.dto.BoardDto;
@Repository
public interface BoardRepository extends MongoRepository<BoardDto, Long>{

//	List<BoardDto> findAll();
}
