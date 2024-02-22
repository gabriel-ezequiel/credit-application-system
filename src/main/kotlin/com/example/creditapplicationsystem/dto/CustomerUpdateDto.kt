package com.example.creditapplicationsystem.dto

import com.example.creditapplicationsystem.entity.Customer
import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull
import java.math.BigDecimal

data class CustomerUpdateDto(
    @field:NotEmpty(message = "First Name Empty") val firstName: String,
    @field:NotEmpty(message = "Last Name Empty") val lastName: String,
    @field:NotNull(message = "Income Empty") val income: BigDecimal,
    @field:NotEmpty(message = "ZipCode Empty") val zipCode: String,
    @field:NotEmpty(message = "Street Empty") val street: String
) {
    fun toEntity(customer: Customer): Customer {
        customer.firstName  = this.firstName
        customer.lastName = this.lastName
        customer.income = this.income
        customer.address.zipCode = this.zipCode
        customer.address.street = this.street
        return customer
    }
}
