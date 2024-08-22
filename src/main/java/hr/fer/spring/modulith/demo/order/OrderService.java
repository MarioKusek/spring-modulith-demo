package hr.fer.spring.modulith.demo.order;

import org.springframework.stereotype.Service;

import hr.fer.spring.modulith.demo.order.slice1.Slice1;
import hr.fer.spring.modulith.demo.order.slice2.Slice2;
import hr.fer.spring.modulith.demo.order.slice2.internal.Slice2Service;

@Service
class OrderService implements Order {
	public Slice1 slice1;
	public Slice2 slice2;
	
	public Slice2Service slice2Service; // this should produce test error
}
