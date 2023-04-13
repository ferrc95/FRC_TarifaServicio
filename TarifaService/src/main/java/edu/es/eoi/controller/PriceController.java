package edu.es.eoi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.es.eoi.dto.PriceDto;
import edu.es.eoi.service.PriceService;

@RestController
@RequestMapping("/tarifa")
public class PriceController {
	
	@Autowired
	PriceService servicePrice;
	
	@GetMapping
	public ResponseEntity<PriceDto> findPrice (@RequestParam String fecha, @RequestParam int idproducto, @RequestParam int cadena) {
		try {		
			
			return new ResponseEntity<PriceDto>(servicePrice.findPrice(fecha, idproducto, cadena), HttpStatus.OK);

		} catch (Exception e) {

			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
	

}
