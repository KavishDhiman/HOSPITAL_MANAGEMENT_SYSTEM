package com.example.hospital_management_system.utility;

import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;

@Component
public class JwtUtility {

    private final String secret_key = "mysecretkeymysecretkeymysecretkey";

    // Generate token
    public String generateToken(String username){
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60))
                .signWith(getKey(), SignatureAlgorithm.HS256)
                .compact();
    }

    // Extract username
    public String extractUsername(String token){
        return getClaims(token).getSubject();
    }

    // Validate token
    public boolean validateToken(String username, String token){
        return extractUsername(token).equals(username) && !isTokenExpired(token);
    }

    // Check expiry
    private boolean isTokenExpired(String token){
        return getClaims(token).getExpiration().before(new Date());
    }

    // Common method
    private Claims getClaims(String token){
        return Jwts.parserBuilder()
                .setSigningKey(getKey())
                .build()
                .parseClaimsJws(token)
                .getBody();
    }

    // Key
    private Key getKey(){
        return Keys.hmacShaKeyFor(secret_key.getBytes());
    }
}