package www.com.homedoc.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import www.com.homedoc.service.BasicService;

public class BasicDBController<T,ID,S extends BasicService<T, ID> > {

	//RammitMq랑 엮어야할거같은데.
	@RequestMapping(method="get")
	public 
}
