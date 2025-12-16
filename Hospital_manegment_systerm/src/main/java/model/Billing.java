package model;

import java.sql.Date;

public class Billing {

	
	    private int billId;
	    private int patientId;
	    private int consultationFee;
	    private int testCharges;
	    private int roomRent;
	    private int insuranceDiscount;
	    private int totalAmount;
	    private Date billDate;
		public int getBillId() {
			return billId;
		}
		public void setBillId(int billId) {
			this.billId = billId;
		}
		public int getPatientId() {
			return patientId;
		}
		public void setPatientId(int patientId) {
			this.patientId = patientId;
		}
		public int getConsultationFee() {
			return consultationFee;
		}
		public void setConsultationFee(int consultationFee) {
			this.consultationFee = consultationFee;
		}
		public int getTestCharges() {
			return testCharges;
		}
		public void setTestCharges(int testCharges) {
			this.testCharges = testCharges;
		}
		public int getRoomRent() {
			return roomRent;
		}
		public void setRoomRent(int roomRent) {
			this.roomRent = roomRent;
		}
		public int getInsuranceDiscount() {
			return insuranceDiscount;
		}
		public void setInsuranceDiscount(int insuranceDiscount) {
			this.insuranceDiscount = insuranceDiscount;
		}
		public int getTotalAmount() {
			return totalAmount;
		}
		public void setTotalAmount(int totalAmount) {
			this.totalAmount = totalAmount;
		}
		public Date getBillDate() {
			return billDate;
		}
		public void setBillDate(Date billDate) {
			this.billDate = billDate;
		}
	    
	    
	    

}
