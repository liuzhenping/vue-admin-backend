package com.ownsper.vueadminbackend.tag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("tags")
public class TagController {

    @Autowired
    private TagService tagService;

    @GetMapping
    public ResponseEntity<Map> getAll() {
        Map<String, Object> map = new HashMap<>();
        map.put("items", tagService.findAll());
        return new ResponseEntity<Map>(map, HttpStatus.OK);
    }

}
