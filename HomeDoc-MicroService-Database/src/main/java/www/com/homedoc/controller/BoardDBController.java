package www.com.homedoc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/mongodb/board")
@Api("mongodb")
public class BoardDBController {

	@RequestMapping("/get/{id}")
	public void get() {
		
	}
	
	@GetMapping("/")
	public void test(HttpServletResponse response) throws IOException {
		response.setContentType("UTF-8");
		PrintWriter pw = response.getWriter();
		pw.write("<h1> this is testPage </h1>");
		pw.flush();
	}
}
