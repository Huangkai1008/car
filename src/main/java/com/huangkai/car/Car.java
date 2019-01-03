package com.huangkai.car;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
@Data
@NoArgsConstructor
public class Car {
    /**
     * 车辆实体类
     */
    @Id @GeneratedValue
    private Long id;
    private @NonNull String name;
}
