package com.molcon.cci.glossaryModel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "CCI_glossary")
public class Glossary {
    public String _id;
    @Field("InventoryGlossary")
    public List<InventoryGlossary> inventoryGlossary;
}
