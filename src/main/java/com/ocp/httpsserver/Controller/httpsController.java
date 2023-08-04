package com.ocp.httpsserver.Controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.ui.Model;

@Controller
public class httpsController {
    
    @GetMapping("/")
    public String hello(Model model,HttpServletRequest request,@RequestHeader Map<String, String> headers){
        model.addAttribute("SourceIP", request.getRemoteAddr());
        model.addAttribute("HostName", request.getServerName());
        model.addAttribute("PodName", request.getLocalName());
        model.addAttribute("PodIP", request.getLocalAddr());
        model.addAttribute("headerList", headers);
        return "esunindex";
    }
}
