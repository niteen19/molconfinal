package com.molcon.cci.clientAuthModel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuthorizedAddress {
    @Field("sold-to-number")
    public String soldToNumber;
    public String name;
    @Field("contract-number")
    public String contractNumber;
    @Field("contract-start-date")
    public String contractStartDate;
    @Field("contract-end-date")
    public String contractEndDate;
    @Field("ip-details")
    public List<IpDetail> ipDetails;

}
