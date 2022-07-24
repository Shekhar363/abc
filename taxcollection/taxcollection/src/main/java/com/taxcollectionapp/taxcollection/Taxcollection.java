package com.taxcollectionapp.taxcollection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Taxcollection {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Tax_ID;
	private String Tax_PAYER_NM;
	private String Tax_TYPE;
	private String Tax_STATE;
	//private String TAX_PAYMENT_DATE;
	private double TAX_AMT;
	public int getTax_ID() {
		return Tax_ID;
	}
	public void setTax_ID(int tax_ID) {
		Tax_ID = tax_ID;
	}
	public String getTax_PAYER_NM() {
		return Tax_PAYER_NM;
	}
	public void setTax_PAYER_NM(String tax_PAYER_NM) {
		Tax_PAYER_NM = tax_PAYER_NM;
	}
	public String getTax_TYPE() {
		return Tax_TYPE;
	}
	public void setTax_TYPE(String tax_TYPE) {
		Tax_TYPE = tax_TYPE;
	}
	public String getTax_STATE() {
		return Tax_STATE;
	}
	public void setTax_STATE(String tax_STATE) {
		Tax_STATE = tax_STATE;
	}
//	public String getTAX_PAYMENT_DATE() {
//		return TAX_PAYMENT_DATE;
//	}
//	public void setTAX_PAYMENT_DATE(String tAX_PAYMENT_DATE) {
//		TAX_PAYMENT_DATE = tAX_PAYMENT_DATE;
//	}
	public double getTAX_AMT() {
		return TAX_AMT;
	}
	public void setTAX_AMT(double tAX_AMT) {
		TAX_AMT = tAX_AMT;
	}
	

}
