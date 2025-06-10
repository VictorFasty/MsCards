package com.io.github.victornext.msCardService.application;

import com.io.github.victornext.msCardService.domain.ClientCard;
import com.io.github.victornext.msCardService.infra.repository.ClientCardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientCardService {
    private ClientCardRepository repository;

    public List<ClientCard> listCardsByCpf(String cpf){
        return repository.findByCpf(cpf);
    }

}
