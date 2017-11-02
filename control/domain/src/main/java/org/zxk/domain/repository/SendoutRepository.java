package org.zxk.domain.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.zxk.domain.model.Sendout;

public interface SendoutRepository extends MongoRepository<Sendout, Long> {
}
