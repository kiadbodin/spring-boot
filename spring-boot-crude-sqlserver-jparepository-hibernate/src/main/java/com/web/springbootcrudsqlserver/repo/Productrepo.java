package com.web.springbootcrudsqlserver.repo;


import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.web.springbootcrudsqlserver.entity.ProductEntity;

@Repository
@Transactional
public interface Productrepo extends JpaRepository<ProductEntity, Integer> {
		// แก้ไขข้อมูล
		@Modifying
		@Query("UPDATE tblproduct u SET u.productname =?2 ,u.productbrand = ?3, u.productprice=?4, u.productedate=?5 WHERE  productid = ?1")
		public int UpdateIddata(int iddata,String productname,String productbrand,Float productprice,String productedate);
}
