package br.com.mk.repository;


import br.com.mk.entity.Pessoa;

import java.io.Serializable;
import java.util.Collection;

public interface PessoaRepository extends Serializable{

    Pessoa save(Pessoa pessoa);

    Pessoa change(Pessoa pessoa);

    Boolean delete(Pessoa pessoa);

    void delete(Long id);

    Pessoa find(Long id);

    Pessoa find(Pessoa pessoa);

    Collection<Pessoa> findAll();
}
