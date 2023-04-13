package edu.es.eoi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import edu.es.eoi.entity.Price;

@Repository
public interface PriceRepository extends JpaRepository<Price, Integer>{

	public List<Price> findByProductIdAndBrandId(int productId, int brandId);
	
}
