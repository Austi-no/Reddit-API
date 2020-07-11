/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itech.RedditApp.Repository;

import com.itech.RedditApp.model.Subreddit;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubredditRepository extends JpaRepository<Subreddit, Long> {
    
    Optional<Subreddit> findByName(String subredditName);
}