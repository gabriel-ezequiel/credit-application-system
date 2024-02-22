package com.example.creditapplicationsystem.dto

import com.example.creditapplicationsystem.entity.Address
import com.example.creditapplicationsystem.entity.Customer
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull
import org.hibernate.validator.constraints.br.CPF
import java.math.BigDecimal

data class CustomerDto(
    @field:NotEmpty(message = "First Name Empty") val firstName: String,
    @field:NotEmpty(message = "Last Name Empty") val lastName: String,
    @field:NotEmpty(message = "CPF Empty")
    @field:CPF(message = "this invalid CPF")
    val cpf: String,
    @field:NotNull(message = "Income Empty") val income: BigDecimal,
    @field:NotEmpty(message = "Email Empty")
    @field:Email(message = "this invalid Email")
    val email: String,
    @field:NotEmpty(message = "Password Empty") val password: String,
    @field:NotEmpty(message = "ZipCode Empty") val zipCode: String,
    @field:NotEmpty(message = "Street Empty") val street: String
) {
    fun toEntity(): Customer = Customer(
        firstName = this.firstName,
        lastName = this.lastName,
        cpf = this.cpf,
        income = this.income,
        email = this.email,
        password = this.password,
        address = Address(
            zipCode = this.zipCode,
            street = this.street
        )
    )
}
