package com.web.springbootcrudmysql.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import com.web.springbootcrudmysql.entity.Product;
import com.web.springbootcrudmysql.service.Productservice;


@RestController
public class MainController {
	
	@Autowired
	private Productservice productservice;
	
	//index.html
	@GetMapping("/")
	public ModelAndView viewHomePage(Model model) {
	    return IndexPage(model, 1, "name", "asc");
	}
	
	@GetMapping("/page/{pageNum}")
	public ModelAndView IndexPage(Model model,
	        @PathVariable(name = "pageNum") int pageNum,
	        @Param("sortField") String sortField,
	        @Param("sortDir") String sortDir) {
		  ModelAndView mav=new ModelAndView("index");
		   Page<Product> page = productservice.findAll(pageNum, sortField, sortDir);	     
		   List<Product> listproduct = page.getContent();
		   
		   int indexno=1;
			int limititem=5;
			mav.addObject("indexno", indexno);
			mav.addObject("limititem", limititem);			
		   model.addAttribute("currentPage", pageNum);    
		   model.addAttribute("totalPages", page.getTotalPages());
		   model.addAttribute("totalItems", page.getTotalElements());		     
		   model.addAttribute("sortField", sortField);
		   model.addAttribute("sortDir", sortDir);
		   model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");
				
		
		mav.addObject("listproduct", listproduct);
		return mav;

	}
	

	//form add
	@GetMapping("/product/formadd")
	public ModelAndView Formadd() {
		ModelAndView mav=new ModelAndView("formadd");
		return mav;
	}
	
	//insert
	@PostMapping("/product/formadd/Add")
	public RedirectView Savedata(@ModelAttribute("product") Product product) {
		productservice.Savedata(product);
		return new  RedirectView("/");
	}
	
	// Formedit
	@GetMapping("/product/formedit/{iddata:[0-9]+}")
	public ModelAndView FormEdit(@PathVariable(name = "iddata") int iddata) {
		ModelAndView mav=new ModelAndView("formedit");
		Optional<Product> optionalproductiddata=productservice.findById(iddata);
		
		if (optionalproductiddata.isPresent()) {
			Product optionalproductid = optionalproductiddata.get();
			mav.addObject("optionalproductid", optionalproductid);
			return mav;
		    // processing with foo ...
		} else {
			return mav;
		    // alternative processing....
		}
		
	}
	
	@PostMapping("/product/formedit/{action:[a-zA-Z]+}")
	public ModelAndView Updatedata(@PathVariable("action") String action,	
													@ModelAttribute("product") Product product,
													@PathParam("_csrf") String _csrf,
													@RequestParam(name = "productid") int productid,
													@RequestParam(name = "productname") String productname,
													@RequestParam(name = "productbrand") String productbrand,
													@RequestParam(name = "productprice") Double productprice,													
													@RequestParam(name = "productdetail") String productdetail) {
		if(action.equals("Update")) {
			//ProductEntity p= new  ProductEntity ();	
			
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
			Date date = new Date();
			String productedate  =dateFormat.format(date) ;
			productservice.Updatedate(productid, productname, productbrand, productprice, productdetail, productedate);
			
			return new ModelAndView("redirect:/");
		}else {
			return new ModelAndView("redirect:/");
		}		
		
			
	}
	
	
	// delete
	@PostMapping("/product/delete/{iddata:[0-9]+}")
	public String DeleteIddata(@PathVariable(name = "iddata") int iddata) {
		productservice.DeleteIddata(iddata);
		return "true";		
	}
	
	
}
