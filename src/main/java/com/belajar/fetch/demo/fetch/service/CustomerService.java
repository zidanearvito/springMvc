package com.belajar.fetch.demo.fetch.service;

import com.belajar.fetch.demo.fetch.entity.Customer;
import com.belajar.fetch.demo.fetch.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@Service
@SessionScope
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    private final Customer customer = new Customer();

    // Menyimpan nama sementara
    public void setNama(String nama) {
        customer.setNama(nama);
    }

    // Menyimpan kota sementara
    public void setKota(String kota) {
        customer.setKota(kota);
    }

    // Menyimpan gunung sementara
    public void setGunung(String gunung) {
        customer.setGunung(gunung);
    }

    // Mengambil data sementara
    public Customer getCustomer() {
        return customer;
    }

    // Menyimpan ke database
    public void saveCustomer() {
        customerRepository.save(customer);
        resetCustomer(); // Reset setelah disimpan
    }

    // Reset customer setelah disimpan
    public void resetCustomer() {
        customer.setId(null);
        customer.setNama(null);
        customer.setKota(null);
        customer.setGunung(null);
    }

}
