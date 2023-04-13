package edu.es.eoi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Entity
@Setter
@Getter
@ToString
@Table(name = "prices")
public class Price {

	@Column(name = "brand_id")
	private int brandId;
	
	@Column(name = "start_date")
	private Date startDate;
	
	@Column(name = "end_date")
	private Date endDate;
	
	@Id
	@Column(name = "price_list")
	private int priceList;
	
	@Column(name = "product_id")
	private int productId;
	
	@Column(name = "priority")
	private int priority;
	
	@Column(name = "price")
	private double price;
	
	@Column(name = "curr")
	private String curr;
	
}
