/**
 * 
 */
package com.example.Testspring.config;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author srinidhi.k
 *
 */

@Component
@Endpoint(id="features")
public class FeatureEndpoint {
	
	
	private final Map<String , Feature> featureMap = new ConcurrentHashMap<>();
	
	public FeatureEndpoint()
	{
		featureMap.put("Department", new Feature(true));
		featureMap.put("User", new Feature(false));
		featureMap.put("Authentication", new Feature(false));
	}
	
	@ReadOperation
	public Map<String ,Feature > features()
	{
		return featureMap;
	}
	
	/*
	 * public String feature(String featureName) { return
	 * featureMap.put(featureName,null); }
	 */
	
	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	private static class Feature
	{
		private boolean isEnabled;
	}

}
