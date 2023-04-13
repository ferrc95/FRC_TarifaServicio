package edu.es.eoi;

import java.text.ParseException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.es.eoi.repository.PriceRepository;
import edu.es.eoi.service.PriceService;

@SpringBootTest
class TarifaServiceApplicationTests {

	@Autowired
	PriceService servicePrice;

	@Autowired
	PriceRepository repositoryPrice;

	@Test
	void contextLoads() throws ParseException {

		System.out.println(servicePrice.findPrice("2020-06-14-10.00.00", 35455, 1).toString());

		System.out.println(servicePrice.findPrice("2020-06-14-16.00.00", 35455, 1).toString());

		System.out.println(servicePrice.findPrice("2020-06-14-21.00.00", 35455, 1).toString());

		System.out.println(servicePrice.findPrice("2020-06-15-10.00.00", 35455, 1).toString());

		System.out.println(servicePrice.findPrice("2020-06-16-21.00.00", 35455, 1).toString());

	}

}
