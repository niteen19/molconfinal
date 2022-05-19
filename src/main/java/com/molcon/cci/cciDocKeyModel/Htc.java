package com.molcon.cci.cciDocKeyModel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Htc {
    @Field("htc")
    private String htc;
    @Field("eu_cosome_code")
    private String euCosomeCode;
}
