package com.example.demo.Repository;

import com.example.demo.Payroll.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
