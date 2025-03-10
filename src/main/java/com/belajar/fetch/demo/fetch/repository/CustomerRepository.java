package com.belajar.fetch.demo.fetch.repository;

import com.belajar.fetch.demo.fetch.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
