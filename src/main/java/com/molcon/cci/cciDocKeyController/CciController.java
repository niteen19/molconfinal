package com.molcon.cci.cciDocKeyController;


import com.molcon.cci.cciDocKeyRepository.CciRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dockeyVec")

public class CciController {
    @Autowired
    private CciRepo CciRepository;

    @GetMapping("/{doc_key_text}")
    public ResponseEntity<?> getCciData(@PathVariable("doc_key_text") String doc_key_text) {

        return new ResponseEntity((CciRepository.findAll().get(0)), HttpStatus.OK);
    }
}
