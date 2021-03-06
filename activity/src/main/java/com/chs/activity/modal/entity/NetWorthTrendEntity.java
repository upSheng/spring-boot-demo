package com.chs.activity.modal.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDate;

/**
 * @author : HongSheng.Chen
 * @date : 2021/2/26 14:44
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class NetWorthTrendEntity {

    @MongoId
    private String id;
    private String code;
    private LocalDate x;
    private Double y;
    private Double sumY;
    private String unitMoney;
    private Double equityReturn;

}
