package br.com.ada.grupo3.locadora.domain;
import br.com.ada.grupo3.locadora.model.Aluguel;
import br.com.ada.grupo3.locadora.model.Cliente;
import br.com.ada.grupo3.locadora.model.Veiculo;
import br.com.ada.grupo3.locadora.model.Agencia;
import br.com.ada.grupo3.locadora.exception.RegistroDuplicadoException;
import br.com.ada.grupo3.locadora.persistence.AluguelRepository;

import java.time.LocalDateTime;
import java.util.UUID;


public class AluguelManager {

    private final AluguelRepository aluguelRepository;

    public AluguelManager(AluguelRepository aluguelRepository) {
        this.aluguelRepository = aluguelRepository;
    }

    public Aluguel criarAluguel(Cliente cliente,Cliente motorista, Veiculo veiculo, Agencia agenciaRetirada, Agencia agenciaDevolucao, LocalDateTime dataRetirada, Integer diasAlugados) {
        //public Aluguel criarAluguel(Cliente cliente, Veiculo veiculo, Agencia agenciaRetirada, Agencia agenciaDevolucao, LocalDateTime dataRetirada, Integer diasAlugados) {

            //        if (existeAluguel(id)) {
//            throw new RegistroDuplicadoException("Aluguel", id);
//        }

        Aluguel novaAluguel = new Aluguel(cliente,motorista, veiculo, agenciaRetirada, agenciaDevolucao, dataRetirada, diasAlugados);
        aluguelRepository.salvar(novaAluguel);
        return novaAluguel;
    }
//    public Aluguel calcularPreco(){
//        return aluguelRepository.calcularPreco();
//    }

    public Aluguel buscarAluguelPorNome(String nome) {
        return aluguelRepository.buscarPeloId(nome);
    }

    public boolean existeAluguel(String nome) {
        return aluguelRepository.buscarPeloId(nome) != null;
    }
}
