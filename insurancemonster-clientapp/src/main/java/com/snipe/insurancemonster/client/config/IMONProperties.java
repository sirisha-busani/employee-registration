package com.snipe.insurancemonster.client.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.snipe.insurancemonster.client.config.IMONProperties;

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
	

}
