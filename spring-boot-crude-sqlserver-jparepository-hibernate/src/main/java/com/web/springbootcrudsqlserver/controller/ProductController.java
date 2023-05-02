package com.web.springbootcrudsqlserver.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.web.springbootcrudsqlserver.entity.ProductEntity;
import com.web.springbootcrudsqlserver.service.ProductService;

@RestController
public class ProductController {
	
		@Autowired
		private ProductService productservice;
		
		@GetMapping("/")
		public ModelAndView ProductIndex() {
			ModelAndView mav=new ModelAndView("index");
			List<ProductEntity> listproduct = productservice.findAll();
			mav.addObject("listproduct", listproduct);
			return mav;
		}
		
		// Form Add
		@GetMapping("/product/formadd")
		public ModelAndView FormAdd() {
			ModelAndView mav=new ModelAndView("add");		
			return mav;
		}
		
		// Insert
		@PostMapping("/product/formadd/Add")
		public ModelAndView Savedata(@ModelAttribute("product") ProductEntity product,
														@PathParam("_csrf") String _csrf) {
							
			// call service for save
			productservice.SaveData(product);
			return new ModelAndView("redirect:/");
		}
		
		// Form Update
		@GetMapping("/product/formedit/{iddata:[0-9]+}")
		public ModelAndView FormEdit(@PathVariable("iddata") int iddata) {
			ModelAndView mav =new ModelAndView("formedit");
			Optional<ProductEntity> optionalproductiddata=productservice.findId(iddata);
			
			if (optionalproductiddata.isPresent()) {
				ProductEntity optionalproductid = optionalproductiddata.get();
				mav.addObject("optionalproductid", optionalproductid);
				return mav;
			    // processing with foo ...
			} else {
				return mav;
			    // alternative processing....
			}
			
			
		}
		
		// Update
		@PostMapping("/product/formedit/{action:[a-zA-Z]+}")
		public ModelAndView Updatedata(@PathVariable("action") String action,	
														@ModelAttribute("product") ProductEntity product,
														@PathParam("_csrf") String _csrf,
														@RequestParam(name = "productid") int productid,
														@RequestParam(name = "productname") String productname,
														@RequestParam(name = "productbrand") String productbrand,
														@RequestParam(name = "productprice") Float productprice) {
			if(action.equals("Update")) {
				//ProductEntity p= new  ProductEntity ();	
				
				DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
				Date date = new Date();
				String productedate  =dateFormat.format(date) ;
				productservice.UpdateIddata(productid, productname, productbrand, productprice, productedate);	
				
				return new ModelAndView("redirect:/");
			}else {
				return new ModelAndView("redirect:/");
			}		
			
				
		}
		
		// delete id
		@GetMapping("/product/delete/{iddata:[0-9]+}")
		public String Deleteiddata(@PathVariable(name = "iddata") int iddata) {
			productservice.DeleteIddata(iddata);
			return  "true";
		}

		
}
