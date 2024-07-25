package testetecnico.com.teste.controller;

import testetecnico.com.teste.domain.Conta;
import testetecnico.com.teste.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/contas")
public class ContaController {
    @Autowired
    private ContaService contaService;

    @PostMapping
    public Conta create(@RequestBody Conta conta) {
        return contaService.save(conta);
    }

    @PutMapping("/{id}")
    public Conta update(@PathVariable Long id, @RequestBody Conta conta) {
        return contaService.update(id, conta);
    }

    // @PutMapping("/{id}/situacao")
    // public Conta updateSituacao(@PathVariable Long id, @RequestParam String situacao) {
    //     // Implementar lógica para alterar a situação
    // }

    // @GetMapping
    // public List<Conta> getAll(@RequestParam(required = false) String descricao,
    //                           @RequestParam(required = false) LocalDate dataVencimento) {
    //     // Implementar lógica de filtro e paginação
    // }

    @GetMapping("/{id}")
    public Conta getById(@PathVariable Long id) {
        return contaService.findById(id);
    }

    @GetMapping("/total-pago")
    public Double getTotalPaid(@RequestParam LocalDate startDate, @RequestParam LocalDate endDate) {
        return contaService.findTotalPaidByPeriod(startDate, endDate);
    }

    @PostMapping("/importar")
    public void importCSV(@RequestParam("file") MultipartFile file) {
        // Implementar lógica para importação de CSV
    }
}
