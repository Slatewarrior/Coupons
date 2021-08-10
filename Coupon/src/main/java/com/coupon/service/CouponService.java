package com.coupon.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coupon.entity.Coupon;
import com.coupon.repository.CouponReporsitory;

@Service
public class CouponService {

	@Autowired
	private CouponReporsitory couponRepository;
	
	public void getAllCoupons() {
		couponRepository.findAll();
	}
	
	public Coupon save(Coupon coupon) {
		coupon.setExpDate(LocalDateTime.now().plusYears(1));
		return couponRepository.save(coupon);
	}
	
	public Coupon getCouponByCode(String code) {
		return couponRepository.findByCode(code);
	}
}
