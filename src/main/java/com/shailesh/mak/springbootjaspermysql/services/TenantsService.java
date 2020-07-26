package com.shailesh.mak.springbootjaspermysql.services;

import com.shailesh.mak.springbootjaspermysql.models.Tenant;
import com.shailesh.mak.springbootjaspermysql.repositories.TenantsRepository;
import com.shailesh.mak.springbootjaspermysql.utils.ReportCreationManager;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.util.List;

@Service
public class TenantsService {
    @Autowired
    TenantsRepository tenantsRepository;

    public String getTenantDetailsReport(OutputStream outputStream) throws JRException, FileNotFoundException {
        List<Tenant> tenantList = (List<Tenant>) tenantsRepository.findAll();
        return ReportCreationManager.generateReport(tenantList, outputStream);
    }
}
