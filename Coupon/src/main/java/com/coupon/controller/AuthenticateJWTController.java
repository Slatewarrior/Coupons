package com.coupon.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping("secure/jwt")
public class AuthenticateJWTController extends BaseController {

	
}
