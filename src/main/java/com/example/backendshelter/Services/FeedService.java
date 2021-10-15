package com.example.backendshelter.Services;

import com.example.backendshelter.Repository.FeedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class FeedService {

    FeedRepository feedRepository;

    @Autowired
    public FeedService(FeedRepository feedRepository) {this.feedRepository = feedRepository;}



}
