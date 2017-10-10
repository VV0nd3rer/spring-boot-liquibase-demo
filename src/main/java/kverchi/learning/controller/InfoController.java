package kverchi.learning.controller;

import kverchi.learning.domain.Information;
import kverchi.learning.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Liudmyla Melnychuk on 10.10.2017.
 */
@RestController
public class InfoController {
    @Autowired
    InfoService infoService;
    @RequestMapping("/info")
    public ModelAndView showAllInfo() {
        List<Information> infoList = infoService.getAllInfo();
        ModelAndView mv = new ModelAndView("info");
        mv.addObject("infoList", infoList);
        return mv;
    }
    @GetMapping("/")
    public ModelAndView index() {
        return new ModelAndView("index");
    }
}
