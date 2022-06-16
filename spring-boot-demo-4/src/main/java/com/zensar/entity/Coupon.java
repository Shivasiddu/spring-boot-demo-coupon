package com.zensar.entity;

public class Coupon {

	private int couponId;

	private String couponName;

	private int couponcost;

	public Coupon() {
		super();
	}

	public Coupon(int couponId, String couponName, int couponType) {
		super();
		this.couponId = couponId;
		this.couponName = couponName;
		this.couponcost = couponType;
	}

	public int getCouponId() {
		return couponId;
	}

	public void setCouponId(int couponId) {
		this.couponId = couponId;
	}

	public String getCouponName() {
		return couponName;
	}

	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}

	public int getCouponType() {
		return couponcost;
	}

	public void setCouponType(int couponcost) {
		this.couponcost = couponcost;
	}

	@Override
	public String toString() {
		return "Coupon [couponId=" + couponId + ", couponName=" + couponName + ", couponType=" + couponcost + "]";
	}

}