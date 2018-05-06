package dto;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ApiFixer {
	static RestTemplate restTemplate = new RestTemplate();
	static HttpEntity<String> requestEntity = new HttpEntity<>(new HttpHeaders());
	static String url = "http://api.fixer.io/";
	private ResponseEntity<ExchangeRates> response;
	
	public ApiFixer() {
		 response = restTemplate.exchange
				(url+"latest", HttpMethod.GET,requestEntity,ExchangeRates.class);
	}
	
	public ApiFixer(String date) {
		 response = restTemplate.exchange
				(url+date, HttpMethod.GET,requestEntity,ExchangeRates.class);
	}

	public ExchangeRates getBody() {
		return response.getBody();
	}
	
	
	
}
