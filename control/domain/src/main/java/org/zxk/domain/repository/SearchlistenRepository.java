package org.zxk.domain.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.zxk.domain.model.Searchlisten;

public interface SearchlistenRepository extends MongoRepository<Searchlisten, Long> {
}
