package com.wille.data.service.zillow.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class ZillowPage {
    private String name;

    private List<ZillowPageTable> tables;

}