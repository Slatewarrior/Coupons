package com.coupon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coupon.entity.Coupon;

@Repository
public interface CouponReporsitory extends JpaRepository<Coupon, Long> {

	public Coupon findByCode(String code);
}
