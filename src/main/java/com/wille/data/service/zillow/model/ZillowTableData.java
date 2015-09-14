package com.wille.data.service.zillow.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
public class ZillowTableData {
    @Getter @Setter ZillowValue zip = new ZillowValue();
    ZillowValue nation;

}