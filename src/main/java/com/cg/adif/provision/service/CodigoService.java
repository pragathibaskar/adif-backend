package com.cg.adif.provision.service;

import java.util.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.cg.adif.provision.modal.Provisionados;



public interface CodigoService {
	
	//Page<Provisionados> getList(Date date,Pageable page);
	void deleteById(String str);
	Provisionados createNew(Provisionados p);

}
