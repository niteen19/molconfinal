package com.molcon.cci.clientAuthModel;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
public class IpAuthorization {
    @Field("date-time")
    public String dateTime;
    @Field("authorized-addresses")
    public List<AuthorizedAddress> authorizedAddresses;

}
