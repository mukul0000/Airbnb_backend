package com.example.demo.user.repository;

import com.example.demo.user.coustomer.Customer;
import com.example.demo.user.honor.Honor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}