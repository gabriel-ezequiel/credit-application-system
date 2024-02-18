package com.example.creditapplicationsystem.dto

import com.example.creditapplicationsystem.entity.Credit
import java.math.BigDecimal
import java.time.LocalDate
import java.util.UUID

data class CreditViewList(
    val creditCode: UUID,
    val creditValue: BigDecimal,
    val numberOfInstallment: Int
) {
    constructor(credit: Credit): this(
        creditCode = credit.creditCode,
        creditValue = credit.creditValue,
        numberOfInstallment = credit.numberOfInstallments
    )
}
