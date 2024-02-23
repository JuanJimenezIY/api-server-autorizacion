package com.example.demo.security;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;


@RestController
public class JwtUtils {
	
	@Value("${app.jwtSemilla")
	private String jwtSemilla;
	
	@Value("${app.jwtExpirationMs}")
	private int jwtExpirationMs;
	
	

	public String buildTokenJwt(String nombre) {

		return Jwts.builder().setSubject(nombre).setSubject("Hola mundo").setIssuedAt(new Date())
				.setExpiration(new Date(System.currentTimeMillis() + this.jwtExpirationMs))
				.signWith(SignatureAlgorithm.HS512, "jwtSemillauyuyugfesybsueyfb561drg65d1rg51drg651drg516516516516516516515661fgh651fghsyuebfysue").compact();

	}

}
