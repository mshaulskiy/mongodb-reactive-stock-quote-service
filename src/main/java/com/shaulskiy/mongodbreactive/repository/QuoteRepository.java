package com.shaulskiy.mongodbreactive.repository;

import com.shaulskiy.mongodbreactive.domain.Quote;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface QuoteRepository extends ReactiveMongoRepository<Quote, String> {


}
