package com.ownsper.vueadminbackend.common;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public abstract class BaseService<T, ID> {

    public abstract PagingAndSortingRepository<T, ID> getRepository();

    public T findById(ID id) {
        Optional<T> optional = getRepository().findById(id);
        if (optional != null && optional.isPresent()) {
            return optional.get();
        } else {
            return null;
        }
    }

    public T save(T t) {
        return getRepository().save(t);
    }

    public Iterable<T> saveAll(Iterable<T> ts) {
        return getRepository().saveAll(ts);
    }

    public void deleteById(ID id) {
        getRepository().deleteById(id);
    }

    public Iterable<T> findAll() {
        return getRepository().findAll();
    }

    public Iterable<T> findAll(Sort sort) {
        return getRepository().findAll(sort);
    }

    public Page<T> findAll(Pageable pageable) {
        return getRepository().findAll(pageable);
    }

    public boolean isExists(ID id) {
        return getRepository().existsById(id);
    }
}
