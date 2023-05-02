package com.web.springbootcrudsqlserver.entity;


import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;


@Entity(name = "tblproduct")
@Table(name = "tbl_product")
public class ProductEntity {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )	
	@Column(name = "product_id")
	private int productid;
	
	@Column(name = "product_name")
	private String productname;
	
	@Column(name = "product_brand")
	private String productbrand;
	
	@Column(name = "product_price")
	private Float productprice;
	
	@CreationTimestamp
	@Column(name = "product_cdate")
	private LocalDateTime productcdate;
	
	
	@Column(name = "product_edate")
	private String  productedate;

	 public ProductEntity() {
	  }
	
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

	public Float getProductprice() {
		return productprice;
	}

	public void setProductprice(Float productprice) {
		this.productprice = productprice;
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
