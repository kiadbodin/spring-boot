package com.web.springbootcrudmysql.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.web.springbootcrudmysql.entity.Product;

@Repository
@Transactional
public interface Productrepo extends JpaRepository<Product, Integer>{
		// ชื่อตารางอันเดรตข้อมูล ถ้าในฐานข้อมูลเป็น tbl_product ในหน้า entity ต้องกำหนด @table(name="tbl_product") ส่วน @Entity(name="product")
		// แต่กรณีนี้ชื่อตารางตรงกับฐานข้อมูลใน mysql
	
		@Modifying
		@Query("UPDATE product u SET u.productname =?2, u.productbrand =?3, u.productprice =?4, u.productdetail =?5, u.productedate =?6 WHERE u.productid =?1")
		public int Updatedate(int productid,String productname,String productbrand, Double productprice,String productdetail,String productedate);
		
}
