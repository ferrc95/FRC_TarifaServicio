package edu.es.eoi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import edu.es.eoi.entity.Price;
import edu.es.eoi.repository.PriceRepository;


@Component
public class InitialDataLoader implements ApplicationListener<ContextRefreshedEvent> {
	
	@Autowired
	PriceRepository repositoryPrice;
	
	@Override
	@Transactional
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd-HH.mm.ss");
		
		Price price = new Price();
		
		price.setBrandId(1);
		
		Date startDate;
		try {
			startDate = formatoFecha.parse("2020-06-14-00.00.00");
			price.setStartDate(startDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Date endDate;
		try {
			endDate = formatoFecha.parse("2020-12-31-23.59.59");
			price.setEndDate(endDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		price.setPriceList(1);
		
		price.setProductId(35455);
		
		price.setPriority(0);
		
		price.setPrice(35.50);
		
		price.setCurr("EUR");
		
		repositoryPrice.save(price);
		
		
		try {
			startDate = formatoFecha.parse("2020-06-14-15.00.00");
			price.setStartDate(startDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			endDate = formatoFecha.parse("2020-06-14-18.30.00");
			price.setEndDate(endDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		price.setPriceList(2);
		
		price.setProductId(35455);
		
		price.setPriority(1);
		
		price.setPrice(25.45);
		
		repositoryPrice.save(price);
		
		
		try {
			startDate = formatoFecha.parse("2020-06-15-00.00.00");
			price.setStartDate(startDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			endDate = formatoFecha.parse("2020-06-15-11.00.00");
			price.setEndDate(endDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		price.setPriceList(3);
		
		price.setProductId(35455);
		
		price.setPrice(30.50);
		
		repositoryPrice.save(price);
		
		try {
			startDate = formatoFecha.parse("2020-06-15-16.00.00");
			price.setStartDate(startDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			endDate = formatoFecha.parse("2020-12-31-23.59.59");
			price.setEndDate(endDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		price.setPriceList(4);
		
		price.setProductId(35455);
		
		price.setPrice(38.95);
		
		repositoryPrice.save(price);
		
	}
}