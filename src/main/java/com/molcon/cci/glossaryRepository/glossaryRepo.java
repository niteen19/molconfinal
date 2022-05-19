package com.molcon.cci.glossaryRepository;

import com.molcon.cci.glossaryModel.Glossary;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface glossaryRepo extends MongoRepository<Glossary,String> {

}
