package com.ownsper.vueadminbackend.tag;

import com.ownsper.vueadminbackend.common.BaseDocument;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;

@Document("vue_admin_tag")
public class Tag extends BaseDocument {
    @NotNull
    private String label;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

}
