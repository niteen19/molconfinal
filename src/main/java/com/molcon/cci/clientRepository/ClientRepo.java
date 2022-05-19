package com.molcon.cci.clientRepository;


import com.molcon.cci.clientAuthModel.ClientAuthentication;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClientRepo extends MongoRepository<ClientAuthentication, String> {

}
