package com.belajar.fetch.demo.fetch.dto;

import jakarta.validation.constraints.Digits;
import lombok.*;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class LapKeuRequestDto {

    @Digits(integer = 15, fraction = 2, message = "melebihi batas maksimal input")
    private BigDecimal kas;

    @Digits(integer = 15, fraction = 2, message = "melebihi batas maksimal input")
    private BigDecimal piutang;

    @Digits(integer = 15, fraction = 2, message = "melebihi batas maksimal input")
    private BigDecimal persediaan;

    @Digits(integer = 15, fraction = 2, message = "melebihi batas maksimal input")
    private BigDecimal asetLancar;
}
