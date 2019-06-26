package www.com.homedoc.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import www.com.homedoc.dao.BoardRepository;
import www.com.homedoc.dto.BoardDto;
import www.com.homedoc.service.BoardService;
@RunWith(SpringRunner.class)
@SpringBootTest
public class DbTest {

	@Autowired
	BoardRepository br;
	
	@Autowired
	BoardService boardService;
	
	@Before
	public void deleteAll() {
//		System.out.println("boardService :" + boardService);
		boardService.deleteAll();
	}
	
	@Test
	public void cRUDTest() {
		insertOne();
		assertThat(getAllDocuments().size(), is(1));
	}
	

	public void insertOne() {
		BoardDto boardDto =
				new BoardDto("2", "wrtie1r", 0, "2", "123121213", "aaa");
		boardService.insert(boardDto);
	}

	public List<BoardDto> getAllDocuments() {
		return boardService.getAll();
			
	}
}
