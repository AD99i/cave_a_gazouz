package com.example.caveagazouz.dal;

import com.example.caveagazouz.bo.Gazouz;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GazouzRepository extends MongoRepository<Gazouz,String> {
}
