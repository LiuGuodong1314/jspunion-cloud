package com.jspunion;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ConfigClientTest {

    @Test
    public void testPost() throws Exception {
        HttpPost post = new HttpPost("http://localhost:8080/refresh");
        List<NameValuePair> nameValuePairs = new ArrayList<>();

        HttpEntity entity = new UrlEncodedFormEntity(nameValuePairs);
        post.setEntity(entity);
        HttpClient client = HttpClients.createDefault();


        HttpResponse resp = client.execute(post);
        System.out.println(resp.getStatusLine().getStatusCode());
    }
}
