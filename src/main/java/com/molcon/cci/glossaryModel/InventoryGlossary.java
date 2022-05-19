package com.molcon.cci.glossaryModel;

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
public class InventoryGlossary {
    @Field("RegionName")
    public String regionName;
    @Field("RegList")
    public List<String> regList;
    @Field ("Country")
    public String country;
}
