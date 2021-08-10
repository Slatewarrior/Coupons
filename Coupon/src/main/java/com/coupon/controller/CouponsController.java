package com.coupon.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coupon.dto.GenericResponseDTO;
import com.coupon.entity.Coupon;
import com.coupon.service.CouponService;

@RestController
@RequestMapping("/coupons")
public class CouponsController extends BaseController {

	
	@Autowired
	private CouponService couponService;
	
	@PostMapping("/new")
	public  ResponseEntity<GenericResponseDTO<Coupon>> save(@RequestBody Coupon coupon){
		return buildOkResponse(couponService.save(coupon));
	}
//	coupons/code/{code}
	@GetMapping("code/{code}")
	public  ResponseEntity<GenericResponseDTO<Coupon>> getCoupon(@PathVariable String code){
		String server = "Server 1";
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(server);
		Coupon coupon =couponService.getCouponByCode(code);
		coupon.setDescription(server);
		return buildOkResponse(coupon);
	}
	
	@GetMapping("/alive")
	public ResponseEntity<GenericResponseDTO<String>> validateJwtToken(){
		 
		return buildOkResponse("Im alive");
	}
	
	@GetMapping("/alive2")
	public String alive2(){
		 
		return ("Im alive2");
	}
}
