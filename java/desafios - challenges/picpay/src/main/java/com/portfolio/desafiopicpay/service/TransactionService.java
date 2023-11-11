package com.portfolio.desafiopicpay.service;

import com.portfolio.desafiopicpay.domain.transaction.Transaction;
import com.portfolio.desafiopicpay.domain.user.User;
import com.portfolio.desafiopicpay.dto.TransactionDTO;
import com.portfolio.desafiopicpay.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Map;

@Service
public class TransactionService {

    @Autowired
    private UserService userService;

    @Autowired
    private TransactionRepository transactionRepository;

    @Autowired
    private RestTemplate restTemplate;
    // Deve ser configurado

    @Autowired
    private NotificationService notificationService;

    public Transaction createTransaction(TransactionDTO transaction) throws Exception {

        User sender = this.userService.findUserById(transaction.senderId());
        User receiver = this.userService.findUserById(transaction.receiverId());

        userService.validateTransaction(sender, transaction.value());

        boolean isAuthorized = this.authorizeTransaction(/*sender, transaction.value()*/);
        if (!isAuthorized) {
            throw new Exception("Transação não autorizada!");
        }


        // atributos da transação
        Transaction newTransaction = new Transaction();
        newTransaction.setAmount(transaction.value());    // valor da transação
        newTransaction.setSender(sender);                 // quem envia
        newTransaction.setReceiver(receiver);             // quem recebe
        newTransaction.setTimeStamp(LocalDateTime.now()); // horário da  transação

        // atualizar o valor dos saldos
        sender.setBalance(sender.getBalance().subtract(transaction.value()));
        receiver.setBalance((receiver.getBalance().add(transaction.value())));

        // persistir dados no banco de dados
        this.transactionRepository.save(newTransaction);
        this.userService.saveUser(sender);
        this.userService.saveUser(receiver);

        this.notificationService.sendNotification(sender, "Transferência realizada com sucesso");
        this.notificationService.sendNotification(receiver, "Foi realizado deposito em sua conta!");


        return newTransaction;

    }

    public boolean authorizeTransaction(/*User sender, BigDecimal value*/) {
        return true;
        // COMENTEI TUDO, POIS O LINK NO MÉTODO FOI DERRUBADO
       /* ResponseEntity<Map> authorizationResponse = restTemplate.getForEntity(
                "https://run.mocky.io/v3/8fafdd68-a090-496f-8c9a-3442cf30dae6",
                Map.class);

        if (authorizationResponse.getStatusCode() == HttpStatus.OK) {
            String message = (String) authorizationResponse.getBody().get("message");
            return "Autorizado".equalsIgnoreCase(message);
        } else return false;*/
    }
}

