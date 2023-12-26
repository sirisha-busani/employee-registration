package com.snipe.insurancemonster.auth.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Component
@ConfigurationProperties("insurancemonster")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class IMONProperties {
	
	private String adminUrl;
	private String authUrl;
	private String clientAppUrl;
	private String accessTokenKey;
	private String headerApiKey;
	private String imagepath;
	
		
	public String getAccessTokenKey() {
		return accessTokenKey;
	}
	public void setAccessTokenKey(String accessTokenKey) {
		this.accessTokenKey = accessTokenKey;
	}
	public String getAdminUrl() {
		return adminUrl;
	}
	public void setAdminUrl(String adminUrl) {
		this.adminUrl = adminUrl;
	}
	public String getAuthUrl() {
		return authUrl;
	}
	public void setAuthUrl(String authUrl) {
		this.authUrl = authUrl;
	}
	public String getClientAppUrl() {
		return clientAppUrl;
	}
	public void setClientAppUrl(String clientAppUrl) {
		this.clientAppUrl = clientAppUrl;
	}

	public String getHeaderApiKey() {
		return headerApiKey;
	}
	public void setHeaderApiKey(String headerApiKey) {
		this.headerApiKey = headerApiKey;
	}
	public String getImagepath() {
		return imagepath;
	}
	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}
	
}
