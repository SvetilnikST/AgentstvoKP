package me.svetilnik.agentstvo.servlet.controller.command;

import me.svetilnik.agentstvo.servlet.controller.ActionCommand;
import me.svetilnik.agentstvo.servlet.controller.PageURL;
import me.svetilnik.dbService.DAO.Impl.DealDaoImpl;
import me.svetilnik.dbService.hibernate.model.dataSet.DealEntity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class ReportDealCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        DealDaoImpl dealDao = new DealDaoImpl();

        String firstDate = req.getParameter("firstDate");
        String lastDate = req.getParameter("lastDate");

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date dateFirstDate = new Date(simpleDateFormat.parse(firstDate).getTime());
            List<DealEntity> dealEntities = dealDao.getAllDate(new Date(simpleDateFormat.parse(firstDate).getTime()),
                    new Date(simpleDateFormat.parse(lastDate).getTime()),0,0);
            req.setAttribute("deal", dealEntities);
        } catch (Exception    e) {
            e.printStackTrace();
            List<DealEntity> dealEntities = dealDao.getAll(0,0);
            req.setAttribute("deal", dealEntities);
        }

//        req.setAttribute("deal", dealEntities);
        req.setAttribute("title", "Отчет по сделкам");
        req.setAttribute("markreportdeal","1");
        return PageURL.REPORT_DEAL_PAGE;
    }
}
