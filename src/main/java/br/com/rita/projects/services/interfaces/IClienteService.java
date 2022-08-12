package br.com.rita.projects.services.interfaces;

import br.com.rita.projects.dto.ClienteDtoRequest;
import br.com.rita.projects.models.Cliente;

import java.util.List;

/**
 * Interface que define o padrão <b>Strategy</b> no domínio de cliente. Com
 * isso, se necessário, podemos ter multiplas implementações dessa mesma
 * interface.
 *
 * @author victor
 */

public interface IClienteService {

    /**
     * Retorna todos os clientes
     * @return - List com todos os clientes
     */
    List<Cliente> findAll();

    /**
     * Retorna cliente por id
     * @param id - id do cliente
     * @return - cliente com id enviado
     */
    Cliente findById(Long id);

    /**
     * Salve cliente no banco de dados
     * @param clienteDtoRequest - Dto de cliente para salvar
     * @return - cliente salvo
     */
    Cliente save(ClienteDtoRequest clienteDtoRequest);

    /**
     * Atualiza dados do cliente
     * @param id - id do cliente
     * @param clienteDtoRequest - Dto com novas informações do cliente
     * @return - cliente atualizado
     */
    Cliente update(Long id, ClienteDtoRequest clienteDtoRequest);

    /**
     * Deleta cliente
     * @param id - id do cliente
     */
    void delete(Long id);
}
