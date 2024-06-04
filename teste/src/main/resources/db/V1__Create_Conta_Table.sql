CREATE TABLE conta (
    id SERIAL PRIMARY KEY,
    data_vencimento DATE NOT NULL,
    data_pagamento DATE,
    valor DOUBLE PRECISION NOT NULL,
    descricao TEXT NOT NULL,
    situacao VARCHAR(20) NOT NULL
);
