package com.shailesh.mak.springbootjaspermysql.utils;

import com.shailesh.mak.springbootjaspermysql.models.Tenant;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ReportCreationManager {
    public static String generateReport(List<Tenant> tenantList, OutputStream outputStream) throws JRException, FileNotFoundException {
        String templateFile = ResourceUtils.getFile(ResourceUtils.CLASSPATH_URL_PREFIX + "tenantsDetails.jsxml").getAbsolutePath();
        JasperReport jasperReport = JasperCompileManager
                .compileReport(templateFile);
        JRBeanCollectionDataSource jrBeanCollectionDataSource = new JRBeanCollectionDataSource(tenantList);
        Map<String, Object> parameters = new HashMap<>();
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters,
                jrBeanCollectionDataSource);
        JasperExportManager.exportReportToPdfStream(jasperPrint, outputStream);
        System.out.println("Report Generation Done");
        return "Report successfully generated";
    }
}
