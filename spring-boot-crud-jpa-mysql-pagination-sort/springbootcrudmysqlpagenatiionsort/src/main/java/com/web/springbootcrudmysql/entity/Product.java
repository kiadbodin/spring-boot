package com.web.springbootcrudmysql.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity(name = "product")
@Table(name = "product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productid;
	private String  productname;
	private String productbrand;
	private Double  productprice;
	private String productdetail;
	
	@CreationTimestamp
	private LocalDateTime productcdate;
	private String productedate;
	
	
	
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductbrand() {
		return productbrand;
	}
	public void setProductbrand(String productbrand) {
		this.productbrand = productbrand;
	}
	public Double getProductprice() {
		return productprice;
	}
	public void setProductprice(Double productprice) {
		this.productprice = productprice;
	}
	public String getProductdetail() {
		return productdetail;
	}
	public void setProductdetail(String productdetail) {
		this.productdetail = productdetail;
	}
	public LocalDateTime getProductcdate() {
		return productcdate;
	}
	public void setProductcdate(LocalDateTime productcdate) {
		this.productcdate = productcdate;
	}
	public String getProductedate() {
		return productedate;
	}
	public void setProductedate(String productedate) {
		this.productedate = productedate;
	}
	
	
	
	
}
