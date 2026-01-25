package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional
public interface InvoiceDao extends CrudRepository<Invoice, Integer> {
    @Query("select i from Invoice i left join fetch i.items where i.id = :id")
    Optional<Invoice> findWithItems(@Param("id") Integer id);

}
