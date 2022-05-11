package com.dio.example.bankline.api.service;

import com.dio.example.bankline.api.dto.NovoCorrentistaDto;
import com.dio.example.bankline.api.model.Conta;
import com.dio.example.bankline.api.model.Correntista;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CorrentistaService {
    public void save(NovoCorrentistaDto novoCorrentistaDto) {
        Correntista correntista = new Correntista();
        correntista.setCpf(novoCorrentistaDto.getCpf());
        correntista.setNome(novoCorrentistaDto.getNome());

        Conta conta = new Conta();
        conta.setSaldo(0.0);
        conta.setNumero(new Date().getTime());

        correntista.setConta(conta);
    }
}
