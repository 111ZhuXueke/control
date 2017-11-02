package org.zxk.domain.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.zxk.domain.model.Phonelist;

public interface PhonelistRepository extends MongoRepository<Phonelist, Long>{

}
