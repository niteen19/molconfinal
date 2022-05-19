package com.molcon.cci.cciDocKeyModel;

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
@Document(collection = "CCI")
public class CciDoc {
    private String _id;
    private String confidentiality_status;
    private String last_modified;
    @Field("dockeyVec")
    private List<DockeyVec> dockeyVec;
    private RecordContents recordContents;
    private SubstInventoryNameList substInventoryNameList;
    private SubstOtherNameList substOtherNameList;
    private SubstanceDefinitionList substanceDefinitionList;
    private List<Object> substances;
    private SubstanceClassList substanceClassList;

    private List<FileSegmentlist> fileSegmentlist;
    private Uvcbs uvcbs;
    private InventoryList inventoryList;
    private PremanufactureNoticeList premanufactureNoticeList;
    @Field("HTCs")
    private HTCs hTCs;

    private RestrictedChemicalsLists restrictedChemicalsLists;
    private FedRegInfo fedRegInfo;
    private SectionofLawList sectionofLawList;
    private ComponentRnList componentRnList;
    private ComponentMolformList component_molform_list;
    private SequenceData sequenceData;
    private ImgList imgList;
    private List<Object> img;

}
