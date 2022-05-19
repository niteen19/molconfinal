package com.molcon.cci.clientAuthModel;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

// Model to represent CCI_client_authentication document from mongodb
@Getter
@Setter
@NoArgsConstructor
@Document(collection = "CCI_client_authentication")
public class ClientAuthentication {

    @Field("ip-authorization")
    private IpAuthorization ipAuthorization;
}
