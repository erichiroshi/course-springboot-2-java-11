package com.erichiroshi.course.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.erichiroshi.course.entities.pk.OrderItemPK;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "tb_order_item")
public class OrderItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@EqualsAndHashCode.Include
	@EmbeddedId
	private OrderItemPK id = new OrderItemPK();

	@Getter	@Setter private Integer quantity;
	@Getter	@Setter private Double price;

	public OrderItem(Order order, Product product, Integer quantity, Double price) {
		id.setOrder(order);
		id.setProduct(product);
		this.quantity = quantity;
		this.price = price;
	}

	@JsonIgnore
	public Order getOrder() {
		return id.getOrder();
	}

	public void setOrder(Order order) {
		id.setOrder(order);
	}

	public Product getProduct() {
		return id.getProduct();
	}

	public void setProduct(Product product) {
		id.setProduct(product);
	}

	public Double getSubTotal() {
		return price * quantity;
	}
}
