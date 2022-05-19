package com.molcon.cci.cciDocKeyRepository;


import com.molcon.cci.cciDocKeyModel.CciDoc;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CciRepo extends MongoRepository<CciDoc,String> {
}
