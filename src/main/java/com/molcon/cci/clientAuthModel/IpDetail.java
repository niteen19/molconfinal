package com.molcon.cci.clientAuthModel;

import lombok.AllArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class IpDetail {
	public String ip;
	 public String type;
	 @Field("create-date") 
	 public String createDate;
	 @Field("update-date") 
	 public String updateDate;

}
