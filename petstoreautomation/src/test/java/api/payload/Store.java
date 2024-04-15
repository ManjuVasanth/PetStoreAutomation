package api.payload;

import java.util.Date;

import lombok.Data;
@Data
public class Store {
	int id;
	String petIdNum;
	int quantity;
	Date shipDate;
	String status;
	boolean complete;

	/*public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPetId() {
		return petIdNum;
	}
	public String setPetId(String petIDNum) {
		return this.petIdNum = petIDNum;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Date getShipDate() {
		return shipDate;
	}
	public Date setShipDate(Date date) {
		return this.shipDate = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public boolean isComplete() {
		return complete;
	}
	public void setComplete(boolean complete) {
		this.complete = complete;
	}
	*/
}
