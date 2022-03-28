package com.mayur.springmvc.repositories;

/**
 *
 * @author mayur
 */
import com.mayur.springmvc.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ProductRepository extends JpaRepository<Product, Long> {

    Product findByProdName(final String prodName);

}
