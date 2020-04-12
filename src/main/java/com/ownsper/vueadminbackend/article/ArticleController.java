package com.ownsper.vueadminbackend.article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("articles")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @PostMapping
    public ResponseEntity<Article> save(@RequestBody Article article) {
        return new ResponseEntity<Article>(articleService.saveArticle(article), HttpStatus.CREATED);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Article> getById(@PathVariable("id") String id) {
        Article article = articleService.findById(id);
        if (Objects.isNull(article)) {
            return new ResponseEntity<Article>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Article>(article, HttpStatus.OK);
    }

}
