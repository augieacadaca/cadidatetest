package com.acadaca.component;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.params.HttpClientParams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HttpComponent {
    private final static Logger LOGGER = LoggerFactory.getLogger(HttpComponent.class);

    public static final String HCPROP_HTTP_CONNECTION_TIMEOUT = "http.connection.timeout";

    public HttpClient getHttpClient(int connectionTimeout, int socketTimeout) throws HttpClientException {
        LOGGER.info("creating unique HttpClient with connection timeout: {} and socket timeout: {}", connectionTimeout, socketTimeout);

        HttpClientParams clientParams = new HttpClientParams();
        clientParams.setParameter(HCPROP_HTTP_CONNECTION_TIMEOUT, connectionTimeout);

        if (socketTimeout > 0) {
            clientParams.setSoTimeout(socketTimeout);
        }
        return new HttpClient(clientParams);
    }
}
