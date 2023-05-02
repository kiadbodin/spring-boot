package com.web.springbootcrudmysql.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.web.springbootcrudmysql.entity.Product;
import com.web.springbootcrudmysql.repo.Productrepo;

@Service
public class Productservice {
	
	@Autowired
	private Productrepo productrepo;
	
	//select ทั้งหมด
	public Page<Product> findAll(int pageNum, String sortField, String sortDir){
		 int pageSize = 5;
		Pageable pageable=PageRequest.of(pageNum-1,  pageSize,
	            sortDir.equals("asc") ? Sort.by("productid").descending() : Sort.by("productid").ascending() );
		return productrepo.findAll(pageable);
		
	}
	
	//insert ข้อมูล
	public void Savedata(Product product) {
		productrepo.save(product);
	}
	
	// get idddata ใช้ optional
	public Optional<Product> findById(int iddata){
		return productrepo.findById(iddata);
	}
	
	// update
	public int Updatedate(int productid,String productname,String productbrand, Double productprice,String productdetail,String productedate) {
		return productrepo.Updatedate(productid, productname, productbrand, productprice, productdetail, productedate);
	}
	
	//delete
	public void DeleteIddata(int iddata) {
		 productrepo.deleteById(iddata);
	}
}
