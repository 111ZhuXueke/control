package org.zxk.domain.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.zxk.domain.model.Conkey;

public interface ConkeyRepository extends MongoRepository<Conkey, Long>{

}
