package com.ianzn.picpaysimplify.services;

import com.ianzn.picpaysimplify.domain.user.User;
import com.ianzn.picpaysimplify.domain.user.UserType;
import com.ianzn.picpaysimplify.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public void validateTransaction(User sender, BigDecimal amount) throws Exception {
        if(sender.getUserType() == UserType.MERCHANT){
            throw new Exception("Usuario do tipo lojista não está autorizado a realizar transação");
        }
        if(sender.getBalance().compareTo(amount) <= 0){
            throw new Exception("Saldo insuficiente");
        }
    }
    public User findUserById(Long id) throws Exception {
        this.repository.findById(id).orElseThrow(() -> new Exception("Usuário não encontrado"));
        return null;
    }
    public void saveUser(User user){
        this.repository.save(user);
    }
}
