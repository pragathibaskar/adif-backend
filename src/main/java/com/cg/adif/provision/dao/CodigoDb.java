package com.cg.adif.provision.dao;

import java.util.Date;

import javax.websocket.server.PathParam;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.adif.contable.modal.Contable;
import com.cg.adif.provision.modal.Provisionados;





@Repository
public interface CodigoDb extends JpaRepository<Provisionados,String>{

	
	Page<Provisionados> findByPeriodo(Date date,Pageable page);
	
	@Query(value="select * from Provisionados p where p.codigo_sap_expediente LIKE ?1 or p.cod_sociedad LIKE ?1",
			nativeQuery=true)
		Page<Provisionados> search(String searchString,Pageable page);
}
