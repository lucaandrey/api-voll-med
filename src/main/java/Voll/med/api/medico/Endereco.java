package Voll.med.api.medico;

import Voll.med.api.endereco.DadosEndereco;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {

    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;

    public Endereco(DadosEndereco dados) {
        this.logradouro = dados.logradouro();
        this.bairro = dados.bairro();
        this.cep = dados.cep();
        this.numero = dados.numero();
        this.cidade = dados.cidade();
        this.complemento = dados.complemento();
        this.uf = dados.uf();
    }

    public void atualizarInformacoes(DadosEndereco attEndereco) {
        if(attEndereco.logradouro() != null){
            this.logradouro = attEndereco.logradouro();
        }
        if(attEndereco.bairro() != null){
            this.bairro = attEndereco.bairro();
        }
        if(attEndereco.cep() != null){
            this.cep = attEndereco.cep();
        }
        if(attEndereco.numero() != null){
            this.numero = attEndereco.numero();
        }
        if(attEndereco.cidade() != null){
            this.cidade = attEndereco.cidade();
        }
        if (attEndereco.complemento() != null){
            this.complemento = attEndereco.complemento();
        }
        if(attEndereco.uf() != null){
            this.uf = attEndereco.uf();
        }
    }
}
