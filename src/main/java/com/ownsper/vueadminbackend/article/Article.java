package com.ownsper.vueadminbackend.article;

import com.ownsper.vueadminbackend.common.BaseDocument;
import com.ownsper.vueadminbackend.tag.Tag;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.util.List;

@Document("vue_admin_article")
public class Article extends BaseDocument {
    @NotNull
    private String title;

    @NotNull
    private String content;

    @DBRef
    private List<Tag> tagList;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Tag> getTagList() {
        return tagList;
    }

    public void setTagList(List<Tag> tagList) {
        this.tagList = tagList;
    }
}
