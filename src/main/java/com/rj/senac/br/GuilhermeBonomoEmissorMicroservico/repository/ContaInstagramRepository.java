package com.rj.senac.br.GuilhermeBonomoEmissorMicroservico.repository;

import com.rj.senac.br.GuilhermeBonomoEmissorMicroservico.entities.ContaInstagram;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public abstract class ContaInstagramRepository implements JpaRepository<ContaInstagram, Long> {

}
