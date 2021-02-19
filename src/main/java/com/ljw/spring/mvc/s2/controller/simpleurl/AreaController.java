package com.ljw.spring.mvc.s2.controller.simpleurl;

import org.springframework.stereotype.Component;
import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Component
public class AreaController implements HttpRequestHandler {
    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("==========AreaController.handleRequest");

        PrintWriter pw = response.getWriter();
        pw.println("<h1>=========LJW=====</h1>");
        pw.flush();
        pw.close();

    }
}
