package edu.es.eoi.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PriceDto {

	private int brandId;

	private Date startDate;

	private Date endDate;

	private int productId;

	private double price;

	private String curr;

	@Override
	public String toString() {

		return "PERIODO: [" + startDate + " - " + endDate + "]\n" + "CADENA: " + brandId + "\n" + "PRODUCTO: "
				+ productId + "\n" + "PRECIO: " + price + " " + curr + "\n";

	}

}
