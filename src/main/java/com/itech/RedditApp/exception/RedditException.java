/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itech.RedditApp.exception;

public class RedditException extends RuntimeException {
    public RedditException(String message, Exception exception) {
        super(message, exception);
    }

    public RedditException(String message) {
        super(message);
    }
}
