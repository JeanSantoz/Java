package aplicacao;

import java.util.Date;
import enums.OrderStatus;

public class Pedido {
	
	// Atributos
	
	private Integer id;
	private Date momento;
	private OrderStatus status;
	
	// Construtores
	
	public Pedido() {};
	
	public Pedido(Integer id, Date momento, OrderStatus status) {
		
		this.id = id;
		this.momento = momento;
		this.status = status;
		
	};
	
	// gets and sets
	
	public void setId(Integer id) {
		
		this.id = id;
		
	}
	
	public Integer getId() {
			
		return id;
			
	}
	
	public void setMomento(Date momento) {
		
		this.momento = momento;
		
	}
	
	public Date getMomento() {
			
		return momento;
			
	}
	
	public void setOrderStatus(OrderStatus status) {
		
		this.status = status;
		
	}
	
	public OrderStatus getOrderStatus() {
			
		return status;
			
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", momento=" + momento + ", status=" + status + "]";
	}
	
	

}
