package com.blog.blog.security;

import java.io.IOException;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginFailHandler extends SimpleUrlAuthenticationFailureHandler {
    @Override
    public void onAuthenticationFailure(
        HttpServletRequest req, 
        HttpServletResponse res, 
        AuthenticationException e
    ) throws IOException, ServletException {
        String url = "/login?error";
        res.sendRedirect(url);
    }
}