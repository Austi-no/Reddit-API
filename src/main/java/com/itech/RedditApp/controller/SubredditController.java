/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itech.RedditApp.controller;

import com.itech.RedditApp.DTO.SubredditDto;
import com.itech.RedditApp.service.SubredditService;
import java.util.List;
//import javax.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/subreddit")
@AllArgsConstructor
public class SubredditController {

    private final SubredditService subredditService;

    @GetMapping
    public List<SubredditDto> getAllSubreddits() {
        return subredditService.getAll();
    }

    @GetMapping("/{id}")
    public SubredditDto getSubreddit(@PathVariable Long id) {
        return subredditService.getSubreddit(id);
    }

    @PostMapping
    public SubredditDto create(@RequestBody  SubredditDto subredditDto) {
        return subredditService.save(subredditDto);
    }
}
