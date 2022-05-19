package com.molcon.cci.cciDocKeyServiceImplement;

import com.molcon.cci.cciDocKeyModel.DockeyVec;
import com.molcon.cci.cciDocKeyRepository.CciRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ListIterator;

@Service
public class DocKeyService {
    @Autowired
    CciRepo cciRepo;
    public boolean isDocKeyPresent(String doc_key_text) {
        ListIterator<DockeyVec> docKey = cciRepo.findAll().get(0).getDockeyVec().listIterator();
        while (docKey.hasNext()) {
            String result = docKey.next().getDoc_key_text();
            if (result.equals(doc_key_text)) {
                return true;
            }
        }
        return false;
    }
}


