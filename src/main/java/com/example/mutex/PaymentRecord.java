package com.example.mutex;

import java.math.BigDecimal;

public record PaymentRecord(String documento, String agencia, String conta,
                            BigDecimal valor, String idPagamento) {
}
/*{
        "documento": "12345678900",
        "agencia": "0001",
        "conta": "123456-7",
        "valor": 150.75,
        "idPagamento": "PAY-2025-000123"
        }*/
