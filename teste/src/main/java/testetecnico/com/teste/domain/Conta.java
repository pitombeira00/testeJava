package testetecnico.com.teste.domain;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dataVencimento;
    private LocalDate dataPagamento;
    private Double valor;
    private String descricao;
    private String situacao;
    
    // Getters and setters
}
