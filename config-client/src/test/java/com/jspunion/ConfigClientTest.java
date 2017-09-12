package com.jspunion;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.HttpClientUtils;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.Test;

public class ConfigClientTest {

    @Test
    public void testPost() throws Exception{

        HttpPost post = new HttpPost("http://localhost:8080/refresh");
        HttpClient client = HttpClients.createDefault();


        HttpResponse resp = client.execute(post);
        System.out.println(resp.getStatusLine().getStatusCode());



    }
}
