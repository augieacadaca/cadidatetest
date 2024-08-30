package com.acadaca.component;

import org.apache.commons.httpclient.HttpClient;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HttpComponentTest {
    private final static Logger LOGGER = LoggerFactory.getLogger(HttpComponentTest.class);

   @Test
    public void httpClientTest(){
        HttpComponent httpComponent = new HttpComponent();
        try {
            HttpClient httpClient = httpComponent.getHttpClient(100,120);
            LOGGER.info("Successfully created the HTTPClient .......");
        } catch (HttpClientException e) {
            LOGGER.error("Error in creating HttpClient from HttpComponent .......", e);
        }
    }
}
