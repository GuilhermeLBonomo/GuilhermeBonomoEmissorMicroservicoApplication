package com.rj.senac.br.GuilhermeBonomoEmissorMicroservico.repository;

import com.rj.senac.br.GuilhermeBonomoEmissorMicroservico.entities.ContaInstagram;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public class ContaInstagramRepository implements JpaRepository<ContaInstagram, Long> {
    @Override
    public void flush() {

    }

    @Override
    public <S extends ContaInstagram> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends ContaInstagram> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<ContaInstagram> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public ContaInstagram getOne(Long aLong) {
        return null;
    }

    @Override
    public ContaInstagram getById(Long aLong) {
        return null;
    }

    @Override
    public ContaInstagram getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends ContaInstagram> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends ContaInstagram> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends ContaInstagram> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends ContaInstagram> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends ContaInstagram> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends ContaInstagram> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends ContaInstagram, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends ContaInstagram> S save(S entity) {
        return null;
    }

    @Override
    public <S extends ContaInstagram> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<ContaInstagram> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<ContaInstagram> findAll() {
        return null;
    }

    @Override
    public List<ContaInstagram> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(ContaInstagram entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends ContaInstagram> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<ContaInstagram> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<ContaInstagram> findAll(Pageable pageable) {
        return null;
    }
}
