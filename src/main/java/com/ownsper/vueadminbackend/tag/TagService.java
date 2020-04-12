package com.ownsper.vueadminbackend.tag;

import com.ownsper.vueadminbackend.common.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

@Service
public class TagService extends BaseService<Tag, String> {

    @Autowired
    private TagRepository tagRepository;

    @Override
    public PagingAndSortingRepository<Tag, String> getRepository() {
        return this.tagRepository;
    }
}
