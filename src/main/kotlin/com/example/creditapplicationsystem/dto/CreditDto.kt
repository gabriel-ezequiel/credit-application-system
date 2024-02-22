package com.example.creditapplicationsystem.dto

import com.example.creditapplicationsystem.entity.Credit
import com.example.creditapplicationsystem.entity.Customer
import jakarta.validation.constraints.Future
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import java.math.BigDecimal
import java.time.LocalDate

data class CreditDto(
    @field:NotNull(message = "Credit Value Empty") val creditValue: BigDecimal,
    @field:Future(message = "Day First Of Installment Invalid") val dayFirstOfInstallment: LocalDate,
    @field:Max(value = 12, message = "Number Of Installment Invalid")
    @field:Min(value = 1, message = "Number Of Installment Invalid")
    val numberOfInstallment: Int,
    @field:NotNull(message = "Customer Empty") val customerId: Long
) {
    fun toEntity(): Credit = Credit(
        creditValue = this.creditValue,
        dayFirstInstallment = this.dayFirstOfInstallment,
        numberOfInstallments = this.numberOfInstallment,
        customer = Customer(id = this.customerId)
    )
}
