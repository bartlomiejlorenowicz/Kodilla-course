package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Autowired
    private ProductDao productDao;

    @Test
    void testInvoiceDaoSave() {
        // Given
        Product tshirt = productDao.save(new Product("T-shirt"));
        Product cap = productDao.save(new Product("Cap"));

        Invoice invoice = new Invoice("FV/01/2024");

        Item tshirtItem = new Item(tshirt, new BigDecimal("120"), 1, new BigDecimal("120"));
        Item capItem = new Item(cap, new BigDecimal("50"), 3, new BigDecimal("150"));

        tshirtItem.setInvoice(invoice);
        capItem.setInvoice(invoice);

        invoice.getItems().add(tshirtItem);
        invoice.getItems().add(capItem);

        // When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        // Then
        Invoice readInvoice = invoiceDao.findWithItems(id).orElseThrow();

        assertEquals("FV/01/2024", readInvoice.getNumber());
        assertEquals(2, readInvoice.getItems().size());

        // CleanUp
//        invoiceDao.deleteById(id);
    }

}
