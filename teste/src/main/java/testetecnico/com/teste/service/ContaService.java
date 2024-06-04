package testetecnico.com.teste.service;

import testetecnico.com.teste.domain.Conta;
import testetecnico.com.teste.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContaService {
    @Autowired
    private ContaRepository contaRepository;

    public Conta save(Conta conta) {
        return contaRepository.save(conta);
    }

    public Conta update(Long id, Conta conta) {
        // Implementar a lógica de atualização
    }

    public Conta findById(Long id) {
        return contaRepository.findById(id).orElse(null);
    }

    public List<Conta> findAll() {
        return contaRepository.findAll();
    }

    public void delete(Long id) {
        contaRepository.deleteById(id);
    }
    
    public Double findTotalPaidByPeriod(LocalDate startDate, LocalDate endDate) {
        // Implementar lógica para obter valor total pago por período
    }
}