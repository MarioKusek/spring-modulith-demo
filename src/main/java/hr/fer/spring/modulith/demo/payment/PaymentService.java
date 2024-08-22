package hr.fer.spring.modulith.demo.payment;

import org.springframework.stereotype.Service;

import hr.fer.spring.modulith.demo.inventory.Inventory;
import hr.fer.spring.modulith.demo.order.Order;

@Service
public class PaymentService implements Payment {
	public Inventory inventory;
	public Order order;
	//public Slice1 slice1;
}
