package com.bok.news.service;

import com.bok.news.util.crawler.NewsPress;
import com.bok.news.util.crawler.WebCrawler;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;

@Service
public class NewsService {

    private final WebCrawler webCrawler = new WebCrawler();

    public Map<String, Integer> test() throws Exception {
        Map<String, Integer> words = webCrawler.news(NewsPress.jTbc.getRssUrl());
        return words;
    }
}
