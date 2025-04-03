package com.udea.bancoudea.controller;

import com.udea.bancoudea.DTO.TransactionDTO;
import com.udea.bancoudea.service.TransactionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
@CrossOrigin(origins =  {"http://localhost:5173"})
public class TransactionController {

    private final TransactionService transactionFacade;

    public TransactionController(TransactionService transactionFacade) {
        this.transactionFacade = transactionFacade;
    }

    // Realizar la transacción de movimiento de dinero entre cuentas
    @PostMapping
    public ResponseEntity<TransactionDTO> makeTransaction(@RequestBody TransactionDTO transactionDTO){
        return ResponseEntity.ok(this.transactionFacade.transferMoney(transactionDTO));
    }

    // Consultar por numero de cuenta el historio de las transacciones.
    @GetMapping("{accountNumber}")
    public  ResponseEntity<List<TransactionDTO>> getHistorical(@PathVariable String accountNumber){
        return  ResponseEntity.ok(this.transactionFacade.getTransactionsForAccount(accountNumber));
    }

}
