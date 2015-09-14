package com.wille.data.service.zillow.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class ZillowResponse {

    private ZillowRegion region;

    private List<ZillowChart> charts;

    private List<ZillowPage> pages;


}
