package edu.umb.cs680.hw13.muticast;

public class StockEvent {
	private String ticker;
	private float quote;
	
	public StockEvent(String t, float q) {
		ticker = t;
		quote = q;
	}
	
	public String getTicker() {
		return this.ticker;
	}
	public float getQuote() {
		return quote;
	}
}