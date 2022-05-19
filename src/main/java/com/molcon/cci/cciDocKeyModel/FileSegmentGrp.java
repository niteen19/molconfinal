package com.molcon.cci.cciDocKeyModel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class FileSegmentGrp {
    private List<String> file_segment_text;
    private String fs_authority;
}
