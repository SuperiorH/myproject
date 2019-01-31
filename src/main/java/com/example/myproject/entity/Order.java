package com.example.myproject.entity;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
public class Order {

    @NotNull(message = "用户ID不能为空")
    private Long userID;

    @NotNull(message = "收货人地址id不能为空")
    private Long addressID;

    @NotBlank(message = "备注不为空")
    private String comment;

    @Max(value = 1000)
    private Integer max;

    @Min(value = -1000)
    private Integer min;
}
