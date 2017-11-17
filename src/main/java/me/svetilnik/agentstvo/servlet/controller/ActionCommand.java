package me.svetilnik.agentstvo.servlet.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public interface ActionCommand {
    String execute(HttpServletRequest req, HttpServletResponse resp) throws IOException;
}
