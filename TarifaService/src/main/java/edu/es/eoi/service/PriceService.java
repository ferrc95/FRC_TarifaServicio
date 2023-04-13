package edu.es.eoi.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.es.eoi.dto.PriceDto;
import edu.es.eoi.entity.Price;
import edu.es.eoi.repository.PriceRepository;

@Service
public class PriceService {

	@Autowired
	PriceRepository repositoryPrice;

	public PriceDto findPrice(String fecha, int idproducto, int cadena) throws ParseException {

		PriceDto dto = new PriceDto();

		List<Price> price = repositoryPrice.findByProductIdAndBrandId(idproducto, cadena);

		SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd-HH.mm.ss");

		Date date;

		date = formatoFecha.parse(fecha);
		
		int prioridad = 0;
		
		for (Price p : price) {

			if ((date.equals(p.getStartDate()) || date.after(p.getStartDate()))
					&& (date.equals(p.getEndDate()) || date.before(p.getEndDate()))) {

				if (p.getPriority() >= prioridad) {
					
					BeanUtils.copyProperties(p, dto);
					prioridad = p.getPriority();
					
				}
				
			}
			
		}

		return dto;

	}

}
