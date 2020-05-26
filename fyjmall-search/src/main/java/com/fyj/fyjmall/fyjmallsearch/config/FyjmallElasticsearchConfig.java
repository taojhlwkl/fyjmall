package com.fyj.fyjmall.fyjmallsearch.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FyjmallElasticsearchConfig {

    @Bean
    public RestHighLevelClient restHighLevelClient() {
        RestClientBuilder restClientBuilder = null;
        restClientBuilder =  RestClient.builder(new HttpHost("192.168.31.148", 9200, "http"));
        return new RestHighLevelClient(restClientBuilder);
    }

}
