package www.com.homedoc.service;

import org.springframework.stereotype.Service;

import www.com.homedoc.dao.BoardRepository;
import www.com.homedoc.dto.BoardDto;

@Service
public class BoardServiceImpl extends
	BasicServiceImpl<BoardDto, Long, BoardRepository> implements BoardService{

}
