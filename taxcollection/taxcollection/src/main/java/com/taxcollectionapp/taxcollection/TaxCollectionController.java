package com.taxcollectionapp.taxcollection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TaxCollectionController 
{
	@Autowired
TaxCollectionRepositry tr;
	@PostMapping("/saveTaxcollection")
public Taxcollection saveTaxcollection( @RequestBody Taxcollection taxcollection)
{
	Taxcollection taxcollection1 = tr.save(taxcollection);
	return taxcollection1;
	
}
}
