package com.ownsper.vueadminbackend.article;

import com.ownsper.vueadminbackend.common.BaseService;
import com.ownsper.vueadminbackend.tag.Tag;
import com.ownsper.vueadminbackend.tag.TagService;
import com.ownsper.vueadminbackend.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleService extends BaseService<Article, String> {

    @Autowired
    private ArticleRepository articleRepository;

    @Autowired
    private TagService tagService;

    @Override
    public PagingAndSortingRepository<Article, String> getRepository() {
        return this.articleRepository;
    }

    public Article saveArticle(Article article) {
        List<Tag> tagList = new ArrayList<>();
        for (Tag tag : article.getTagList()) {
            if (StringUtils.isEmpty(tag.getId())) {
                tagList.add(tagService.save(tag));
            } else {
                tagList.add(tag);
            }
        }
        article.setTagList(tagList);
        return articleRepository.save(article);
    }
}
