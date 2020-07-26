package com.shailesh.mak.springbootjaspermysql.controllers;

import com.shailesh.mak.springbootjaspermysql.services.TenantsService;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("/api/v1")
public class TenantsController {

    @Autowired
    TenantsService tenantsService;

    @GetMapping("/tenantsDetail/report/export")
    public void getTenantDetailsReport(HttpServletResponse response) throws JRException, IOException {
        String message = null;
        try {
            tenantsService.getTenantDetailsReport(response.getOutputStream());
            response.setContentType("application/pdf");
            response.addHeader("Content-Disposition", "inline; filename=tenantsReport.pdf;");
        } catch (JRException | IOException e) {
            e.printStackTrace();
        }
    }
}
