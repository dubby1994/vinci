package cn.dubby.vinci.controller;

import cn.dubby.vinci.service.GraphEditorExportService;
import cn.dubby.vinci.service.GraphEditorOpenService;
import cn.dubby.vinci.service.GraphEditorSaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * Created by teeyoung on 17/12/20.
 */
@Controller
//@RequestMapping(value = "grapheditor")
public class GraphEditorController {

    @Autowired
    private GraphEditorOpenService graphEditorOpenService;

    @Autowired
    private GraphEditorSaveService graphEditorSaveService;

    @Autowired
    private GraphEditorExportService graphEditorExportService;

    @RequestMapping(value = "open")
    public void open(HttpServletRequest request, HttpServletResponse response) throws IOException {
        graphEditorOpenService.open(request, response);
    }

    @RequestMapping(value = "save")
    public void save(HttpServletRequest request, HttpServletResponse response) throws IOException {
        graphEditorSaveService.save(request, response);
    }

    @RequestMapping(value = "export")
    public void export(HttpServletRequest request, HttpServletResponse response) throws IOException {
        graphEditorExportService.export(request, response);
    }

}
