package com.zensar.demo.dto;

public class CouponDto {
	private int couponId;
	private String couponCode;
	private String expDate;
	private int couponPrice;
	private String couponDesc;

	public CouponDto() {
		super();
	}

	public CouponDto(int couponId, String couponCode, String expDate, int couponPrice, String couponDesc) {
		super();
		this.couponId = couponId;
		this.couponCode = couponCode;
		this.expDate = expDate;
		this.couponPrice = couponPrice;
		this.couponDesc = couponDesc;
	}

	public int getCouponId() {
		return couponId;
	}

	public void setCouponId(int couponId) {
		this.couponId = couponId;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	public int getCouponPrice() {
		return couponPrice;
	}

	public void setCouponPrice(int couponPrice) {
		this.couponPrice = couponPrice;
	}

	public String getCouponDesc() {
		return couponDesc;
	}

	public void setCouponDesc(String couponDesc) {
		this.couponDesc = couponDesc;
	}

	@Override
	public String toString() {
		return "CouponDto [couponId=" + couponId + ", couponCode=" + couponCode + ", expDate=" + expDate
				+ ", couponPrice=" + couponPrice + ", couponDesc=" + couponDesc + "]";
	}

}