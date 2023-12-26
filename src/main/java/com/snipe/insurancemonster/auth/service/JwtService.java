package com.snipe.insurancemonster.auth.service;

import java.security.Key;
import java.util.Date;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Service
public class JwtService {
	
private static final String SECRET_KEY = "iuLu4Ik77m7DnctpxYiWYhkCdakmD6AMl7QdILqkfvE=";

@Value("${jwt.secret}")
private String secret;
	
	public String generateToken(UserDetails userDetails) {
		return Jwts.builder()
				.setSubject(userDetails.getUsername()).setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis()+ 24*60*60*1000))
				.signWith(getSignInKey(), SignatureAlgorithm.HS256).compact();
	}
 
	private Key getSignInKey() {
		// TODO Auto-generated method stub
		byte[] keys = Decoders.BASE64.decode(SECRET_KEY);
		return Keys.hmacShaKeyFor(keys);
	}
	
	public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
        final Claims claims = extractAllClaims(token);
        return claimsResolver.apply(claims);
    }
	
	private Claims extractAllClaims(String token) {
        return Jwts
                .parserBuilder()
                .setSigningKey(getSignInKey())
                .build()
                .parseClaimsJws(token)
                .getBody();
    }
	
	 public String extractUsername(String token) {
	        return extractClaim(token, Claims::getSubject);
	    }
	 
	 public boolean validateToken(String token, UserDetails userDetails) {
		 
		 final String username = extractUsername(token);
		 return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
		 
	 }

	private boolean isTokenExpired(String token) {
		// TODO Auto-generated method stub
		return extractClaim(token, Claims::getExpiration).before(new Date());
		
	}

}
