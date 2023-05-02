package com.web.springbootcrudsqlserver.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.web.springbootcrudsqlserver.entity.ProductEntity;
import com.web.springbootcrudsqlserver.repo.Productrepo;

@Service

public class ProductService {
	
	@Autowired
	private Productrepo productrepo;
	
	// Select All
	public List<ProductEntity> findAll(){
		return productrepo.findAll(Sort.by("productid").descending());
	}
	
	// Insert 
	public void  SaveData(ProductEntity product) {
		 productrepo.save(product);
	}
	
	//Find  id data
	public Optional<ProductEntity> findId(int iddata){
		return productrepo.findById(iddata);
	}
	
	// Update ข้อมูลที่บันทึกการแก้ไข
	public int UpdateIddata(int iddata,String productname,String productbrand,Float productprice,String productedate) {
		return productrepo.UpdateIddata(iddata, productname, productbrand, productprice, productedate);
	}
	
	//delete
	public void DeleteIddata(int iddata) {
		 productrepo.deleteById(iddata);
	}
}
