package ar.com.maca.api.couponMicroservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import ar.com.maca.api.couponMicroservice.models.Coupon;
import ar.com.maca.api.couponMicroservice.repos.CouponRepository;

@RestController
public class CouponRestController {

    @Autowired
	CouponRepository repo;

	@PostMapping("/coupons")
	public Coupon create(@RequestBody Coupon coupon) {

	return repo.save(coupon);

	}

	@GetMapping("/coupons/{code}")
	public Coupon getCoupon(@PathVariable("code") String code) {
		return repo.findByCode(code);

	}

	@GetMapping("/couponsall")
	public List<Coupon> getAllCouponS() {
		return repo.findAll(); 

	}

}