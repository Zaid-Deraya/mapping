package com.orm.mapping.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.orm.mapping.dto.OrderResponse;
import com.orm.mapping.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	@Query("SELECT new com.orm.mapping.dto.OrderResponse(c.name, p.pName, p.price) FROM Customer c JOIN c.products p")	
	public List<OrderResponse> getJoinInformation();
}
