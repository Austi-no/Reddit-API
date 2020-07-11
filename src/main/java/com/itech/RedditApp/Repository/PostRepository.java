/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itech.RedditApp.Repository;

import com.itech.RedditApp.model.Post;
import com.itech.RedditApp.model.Subreddit;
import com.itech.RedditApp.model.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
    
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}